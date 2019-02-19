# -*- coding: utf-8 -*-
"""
Created on Mon Apr 03 19:02:31 2017

@author: estok
"""

import numpy as np
from sklearn.preprocessing import Imputer

A = np.arange(225).reshape(15,15)

replace_every_nth=5
replacement=0
v=0
for v in range(0, len(A), replace_every_nth):
    A[v] = replacement


A = A.astype('float')
A[A == 0] = 'NaN'

imp= Imputer(missing_values='NaN', strategy='median', axis=0)
A2=imp.fit_transform(A)

Amean = A2.mean()
Amax=A2.max()
v=Amean * Amax

