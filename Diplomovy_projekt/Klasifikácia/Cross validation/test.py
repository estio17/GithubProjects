# -*- coding: utf-8 -*-
"""
Created on Sat Sep 09 17:35:11 2017

@author: estok
"""

import sys
import os
import unittest

directories = os.listdir('pokus')
control = 0.98

for files in directories :
    path="pokus/"+files
    os.chdir(path)
    from cross import v1
    
    os.chdir("../")
    class MyTest(unittest.TestCase):
        def test(self):
          self.assertEqual(v1,control)  
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