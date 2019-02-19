# -*- coding: utf-8 -*-
"""
Created on Wed Sep 06 18:56:24 2017

@author: estok
"""

import numpy as np
from sklearn.datasets import load_breast_cancer

bc = load_breast_cancer()
X = bc.data
y = bc.target

replace_every_nth=5
replacement=-2
v=0
for v in range(0, len(X), replace_every_nth):
    X[v] = replacement


X = X.astype('float')
X[X == replacement] = 'NaN'

np.save('X_Challenge',X)
np.save('y_Challenge',y)
