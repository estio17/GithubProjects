# -*- coding: utf-8 -*-
"""
Created on Wed Sep 06 17:22:33 2017

@author: estok
"""

import matplotlib.pyplot as plt
import numpy as np
from sklearn.preprocessing import Imputer
from sklearn.neighbors import KNeighborsClassifier
from sklearn.ensemble import RandomForestClassifier
from sklearn.svm import SVC
from sklearn.cross_validation import cross_val_score
from sklearn.metrics import accuracy_score
from sklearn.cross_validation import cross_val_predict

#načítanie databázy
y = np.load('y_Challenge.npy')
X = np.load('X_Challenge.npy')


#použitie metódy imputer
imp = Imputer(missing_values='NaN', strategy='mean', axis=0)
X = imp.fit_transform(X)


#použitie cros validácie pre nájdenie najlepšieho estimátora a jeho atribútu
KN = KNeighborsClassifier(n_neighbors=10)
scores_KN = cross_val_score(KN, X, y, cv=10, scoring='accuracy')
#print(scores_KN)
print(scores_KN.mean())

RFC=RandomForestClassifier(max_depth=5, random_state=0)
scores_RFC = cross_val_score(RFC, X, y, cv=10, scoring='accuracy')
#print(scores_RFC)
print(scores_RFC.mean())

SVC = SVC(C=1.0, kernel='rbf', degree=3)
scores_SVC = cross_val_score(SVC, X, y, cv=10, scoring='accuracy')
#print(scores_SVC)
print(scores_SVC.mean())

#nájdenie najlepšieho parametra pre RFC
knum= list(range(5, 36))
k_scores =[]
for k in knum:
    knc = KNeighborsClassifier(n_neighbors=k)
    scores = cross_val_score(knc, X, y, cv=10, scoring='accuracy')
    k_scores.append(scores.mean())

plt.plot(knum, k_scores)
plt.xlabel('Value of k for KN')
plt.ylabel('Cross-Validated Accuracy')

#vytvorenie predikcie

kn=KNeighborsClassifier(n_neighbors=19)
y_predict = cross_val_predict(kn, X, y)
v=accuracy_score(y_predict, y) 

#výpis presnosti predikcie

print("Accuracy: %.3f%%") % (v*100.0)



