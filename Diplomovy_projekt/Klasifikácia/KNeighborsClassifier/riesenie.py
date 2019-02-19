# -*- coding: utf-8 -*-
"""
Created on Tue Feb 28 19:17:14 2017

@author: Peter
"""
from sklearn.datasets import load_digits
from sklearn.cross_validation import train_test_split
from sklearn.neighbors import KNeighborsClassifier
import matplotlib.pyplot as plt

digits= load_digits()
X = digits.data
y = digits.target

X_train, X_test, y_train, y_test =train_test_split(X, y,test_size=0.20, random_state=0)


neigh = KNeighborsClassifier(n_neighbors=3, algorithm='ball_tree')
neigh.fit(X_train,y_train)
y_predict =neigh.predict(X_test)
result = neigh.score(X_test, y_test)
v= result
print("Accuracy: %.3f%%") % (result*100.0)    

#print accuracy_score(y_predict,y_test)
plt.scatter(y_test, y_predict)
plt.xlabel('True Values')
plt.ylabel('Predictions')





