# -*- coding: utf-8 -*-
"""
Created on Tue Feb 28 19:17:14 2017

@author: Peter
"""

from sklearn.datasets import load_digits
from sklearn.cross_validation import train_test_split
from sklearn.ensemble import RandomForestClassifier
import matplotlib.pyplot as plt

digits= load_digits()
X = digits.data
y = digits.target
test_size = 0.20

X_train, X_test, y_train, y_test =train_test_split(X, y, test_size=test_size, random_state=0)


forrest=RandomForestClassifier(max_depth=5, random_state=0)
forrest.fit(X_train,y_train)
y_predict =forrest.predict(X_test)
result = forrest.score(X_test, y_test)
v= result
print("Accuracy: %.3f%%") % (result*100.0)    


#print accuracy_score(y_predict,y_test)
plt.scatter(y_test, y_predict)
plt.xlabel('True Values')
plt.ylabel('Predictions')





