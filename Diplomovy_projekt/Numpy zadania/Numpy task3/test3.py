# -*- coding: utf-8 -*-
"""
Created on Mon Jun 19 12:18:03 2017

@author: estok
"""

import sys
import os
import unittest

directories = os.listdir('pokus')
control=26467.0


for files in directories :
    path="pokus/"+files
    os.chdir(path)
    from task3 import m
    
    os.chdir("../")
    class MyTest(unittest.TestCase):
        def test(self):
          self.assertEqual(m,control)  
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