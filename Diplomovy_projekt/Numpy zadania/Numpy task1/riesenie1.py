# -*- coding: utf-8 -*-
"""
Created on Sat Mar 04 19:02:01 2017

@author: Peter
"""

import numpy as np
A = np.arange(225).reshape(15,15)
B = np.arange(225,450).reshape(15,15)

replace_every_nth=4
replacement=5
v=4
for v in range(0, len(A), replace_every_nth):
    A[v] = replacement

Amax=A.max()
Bmean=B.mean()
s=Amax + Bmean
C=np.multiply(B,s)
Cdet=np.linalg.det(C)
v=Cdet+Amax
D=np.multiply(B,v)
Dmean=D.mean()
    
