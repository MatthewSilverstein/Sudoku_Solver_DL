Sudoku_Solver_DL
================

A Dancing Links implementation of Knuth's AlgorithmX for solving Sudoku puzzles.

Sudokus can be solved by entering string of given sudoku.  A solved sudoku will be returned.
Example:
Given Sudoku:


?       1       3       4       ?       ?       ?       ?       ?

?       ?       ?       ?       5       ?       ?       ?       7

?       ?       2       ?       ?       8       6       ?       5

?       ?       7       ?       ?       ?       ?       ?       2

?       5       ?       ?       4       ?       ?       1       ?

8       ?       ?       ?       ?       ?       9       ?       ?

4       ?       6       3       ?       ?       8       ?       ?

2       ?       ?       ?       8       ?       ?       ?       ?

?       ?       ?       ?       ?       7       3       6       ?


Use 0 to signify unknown.
String s=	"013400000"+

		"000050007"+

		"002008605"+

		"007000002"+

		"050040010"+

		"800000900"+

		"406300800"+

		"200080000"+

		"000007360";


String result=Main.solveSudoku(s);
s->
5	1	3	4	7	6	2	9	8	
6	9	8	2	5	3	1	4	7	
7	4	2	9	1	8	6	3	5	
1	6	7	5	3	9	4	8	2	
3	5	9	8	4	2	7	1	6	
8	2	4	7	6	1	9	5	3	
4	7	6	3	9	5	8	2	1	
2	3	1	6	8	4	5	7	9	
9	8	5	1	2	7	3	6	4	
