# -*- coding: utf-8 -*-
"""
Created on Fri Apr 07 14:37:07 2017

@author: estok
"""


from sklearn.datasets import load_iris
from sklearn.cross_validation import train_test_split
from sklearn.preprocessing import StandardScaler

iris = load_iris()
X = iris.data
y = iris.target

X_train,X_test,y_train,y_test = train_test_split(X,y,test_size=0.20,random_state=0)

sc = StandardScaler(copy=True,with_std=True, with_mean=False)
sc.fit(X_train)
X_train_std = sc.transform(X_train)
X_test_std = sc.transform(X_test)
Xmax=X_train_std.max()
