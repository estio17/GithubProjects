# -*- coding: utf-8 -*-
"""
Created on Fri Jul 28 14:09:29 2017

@author: estok
"""

from sklearn.datasets import load_digits
from sklearn.cross_validation import train_test_split
from sklearn.svm import SVC
import matplotlib.pyplot as plt

digits= load_digits()
X = digits.data
y = digits.target
test_size = 0.20

X_train, X_test, y_train, y_test =train_test_split(X, y, test_size=test_size, random_state=0)


clf = SVC(class_weight=None, decision_function_shape=None, gamma='auto', kernel='rbf',
    max_iter= -1, probability=False, random_state=None, shrinking=True, verbose=False)
clf.fit(X_train,y_train)
y_predict =clf.predict(X_test)
result = clf.score(X_test, y_test)
v= result * 100.0
print("Accuracy: %.3f%%") % (result*100.0)    



plt.scatter(y_test, y_predict)
plt.xlabel('True Values')
plt.ylabel('Predictions')