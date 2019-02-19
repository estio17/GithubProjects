# -*- coding: utf-8 -*-
"""
Created on Mon Apr 24 11:19:27 2017

@author: estok
"""

import pandas as pd
import numpy as np
from sklearn.preprocessing import LabelEncoder

dataset = pd.DataFrame([
        ['M', 11.1, 'class1'],
        ['L', 14.5, 'class2'],
        ['S', 8.8, 'class3'],
        ['L', 13.8, 'class2'],
        ['XXL', 19.5, 'class2'],
        ['XL', 17.3, 'class1'],
        ['XXL', 18.7, 'class3'],
        ['S', 9.0, 'class3'],
        ['M', 10.7, 'class1'],
        ['S', 8.5, 'class3'],
        ['XL', 16.8, 'class1']])
dataset.columns = ['size', 'price', 'class']

#mapovanie size
size_mapping = {'XXL': 5,'XL': 4,'L': 3,'M': 2,'S': 1}
dataset['size'] = dataset['size'].map(size_mapping)

#pomocou label Encoder
le = LabelEncoder()
dataset['class']=le.fit_transform(dataset['class'].values)

X = dataset[['size', 'price']].values
y = dataset[['class']].values

a=np.multiply(X,y)
b=a.max()

