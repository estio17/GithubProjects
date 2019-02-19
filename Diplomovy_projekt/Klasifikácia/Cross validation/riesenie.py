# -*- coding: utf-8 -*-
"""
Created on Wed Sep 06 13:10:23 2017

@author: estok
"""

from sklearn.datasets import load_iris
from sklearn.neighbors import KNeighborsClassifier
from sklearn.cross_validation import cross_val_score
import matplotlib.pyplot as plt

# read in the iris data
iris = load_iris()

# create X (features) and y (response)
X = iris.data
y = iris.target

# 5-fold cross-validation with K=5 for KNN (the n_neighbors parameter)
KN = KNeighborsClassifier(n_neighbors=10)
scores = cross_val_score(KN, X, y, cv=10, scoring='accuracy')
print(scores)
print(scores.mean())
v=scores.mean()

# search for an optimal value of K for KNN
knum= list(range(1, 31))
k_scores =[]
for k in knum:
    knn = KNeighborsClassifier(n_neighbors=k)
    scores = cross_val_score(knn, X, y, cv=10, scoring='accuracy')
    k_scores.append(scores.mean())
print(k_scores)
v1=max(k_scores)

# plot the value of K for KNN (x-axis) versus the cross-validated accuracy (y-axis)
plt.plot(knum, k_scores)
plt.xlabel('Value of K for KNN')
plt.ylabel('Cross-Validated Accuracy')

