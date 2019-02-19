# -*- coding: utf-8 -*-
"""
Created on Sat Apr 01 17:51:29 2017

@author: estok
"""

import numpy as np
A = np.arange(0,100).reshape(10,10)
B = np.arange(100,200).reshape(10,10)

replace_every_nth=3
replacement=9
v=3
for v in range(0, len(A), replace_every_nth):
    A[v] = replacement

Amean=A.mean()
Bmax=B.max()
C=np.multiply(B,Amean)
Cdet=np.linalg.det(C)
v=Cdet+Bmax
D=np.multiply(B,v)
a=(D - D%1)
b=(np.floor(D))

z=(Amean*Bmax)*4
m = D.flat[np.abs(D - z).argmin()]
print(m)
