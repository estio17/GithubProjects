# -*- coding: utf-8 -*-
"""
Created on Mon Jun 19 12:18:03 2017

@author: estok
"""

import sys
import os
import unittest
import numpy as np

directories = os.listdir('challenge')
control = np.array([0,0.01,0.02,0.03,0.04,0.05,0.06,0.07,0.08,0.09,0.1])

for files in directories :
    path="challenge/"+files
    os.chdir(path)
    from challenge import v
    x=1.00 - v
    x=round(x,2)
    
    os.chdir("../")
    class MyTest(unittest.TestCase):
        def test(self):
          self.assertIn(x,control)  
    orig_stdout = sys.stdout
    f = open('log_file.txt', "a")
    sys.stdout = f
    print'******************************New Test*********************************'
    print files

    sys.stdout = orig_stdout
    f.close()
    if __name__ == '__main__':
        f = open('log_file.txt', "a")
        runner = unittest.TextTestRunner(f)
        unittest.main(testRunner=runner)
        f.close()
    os.chdir("../")
    