# app-sec
This is a very simple spell checker that takes in a dictionary, takes in a user-edited file, and prints out any words that the user has misspelled (i.e. words not available in the dictionary).
Artifacts
	There are four files contained:
	1. SpellChecker.java - source code for the spell checker
	2. SpellChecker.class - compiled code for the spell checker which can be run
	3. words.txt - the standard dictionary that comes built in with Unix-based systems, this particular version came with mine
	4. spellcheckme.txt - the file you can edit and save with the text you wish to spell check

How to Run
	1. Using a command window, navigate to the directory where all the artifacts are contained. NOTE: all the files need to be in the same directory to run smoothly! I did this as an easy solution to keep the code operating system-agnostic.
	2. Use the command ‘java SpellChecker’ to run the program.
	3. The program text will prompt the user to edit the ‘spellcheckme.txt’ file with the text wished to be checked.
	4. Once the file is updated and edited, press Enter in the command window to spell check the file.
	5. Command window will print out a list of misspelled words.