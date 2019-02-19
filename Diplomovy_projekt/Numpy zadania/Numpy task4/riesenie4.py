# -*- coding: utf-8 -*-
"""
Created on Sat Apr 01 18:15:35 2017

@author: estok
"""

import numpy as np
A = np.arange(0,121).reshape(11,11)
B = np.arange(100,200).reshape(10,10)

replace_every_nth=2
replacement=2
v=2
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
