import sys
from antlr4 import *
from little_duckLexer import little_duckLexer
from little_duckParser import little_duckParser
from little_duckListener import little_duckListener
from little_duckVisitor import little_duckVisitor

def main(argv):
    input_stream = FileStream(argv[1])
    lexer = little_duckLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = little_duckParser(stream)
    tree = parser.start_()

    listener = little_duckListener()
    walker = ParseTreeWalker()
    walker.walk(listener, tree)

    memory = listener.returnMemory()


if __name__ == '__main__':
    main(sys.argv)