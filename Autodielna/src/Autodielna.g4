grammar Autodielna;

car:'=' STRING '-bodywork' bodywork '-machinery' machinery ',';
bodywork: 'front:' component+ 'rear:' component+;
machinery:component+;
component:'name:' STRING 'brand:' brand+ 'supplier:' supplier+ ';';
supplier:STRING;
brand:STRING;

STRING : '"' .*? '"';
WS : [ \r\t\n]+ -> skip;