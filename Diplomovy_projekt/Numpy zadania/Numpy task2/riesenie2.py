# -*- coding: utf-8 -*-
"""
Spyder Editor

This is a temporary script file.
"""

import numpy as np
A = np.arange(64).reshape(8,8)
B = np.arange(64,128).reshape(8,8)

replace_every_nth=3
replacement=6
v=3
for v in range(0, len(A), replace_every_nth):
    A[v] = replacement

Amax=A.max()
Bmean=B.mean()
C=np.multiply(B,Bmean)
Cdet=np.linalg.det(C)
v=Cdet+Amax
D=np.multiply(B,v)
Dmin = D.min()
print Dmin

