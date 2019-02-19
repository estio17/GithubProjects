# -*- coding: utf-8 -*-
"""
Created on Wed Apr 19 19:29:06 2017

@author: estok
"""

import numpy as np
import pandas as pd

from sklearn.preprocessing import Imputer

from sklearn.cross_validation import train_test_split
from sklearn.metrics import accuracy_score
from sklearn.preprocessing import StandardScaler

from sklearn.neighbors import KNeighborsClassifier

dset=pd.read_pickle('X_dset')
y_dset=np.load('y_dset.npy')


d_mapping = {0.1:'A',0.2:'B',0.3:'C',0.4:'D',0.5:'V',0.6:'E',1:'F',1.1:'G',1.2:'H',
             1.3:'CH',1.4:'I',1.5:'J',1.6:'K',1.7:'L',1.8:'M',1.9:'N',2:'O',2.1:'P',
             2.2:'R',2.3:'S',2.4:'T',2.5:'U',}

inv_d_mapping = {v: k for k, v in d_mapping.items()}
dset['d'] = dset['d'].map(inv_d_mapping)

imp= Imputer(missing_values='NaN', strategy='median', axis=0)
dset=imp.fit_transform(dset)

#train test split
X_train,X_test,y_train,y_test = train_test_split(dset,y_dset,test_size=0.20,random_state=0)

sc=StandardScaler(copy=True,with_std=True, with_mean=False)
sc.fit(X_train)
X_train_std = sc.transform(X_train)
X_test_std = sc.transform(X_test)

#K neighbors
kn=KNeighborsClassifier(n_neighbors=4,weights='distance')

clas=kn
clas.fit(X_train_std,y_train)
y_predict =clas.predict(X_test_std)
v=accuracy_score(y_predict,y_test)

