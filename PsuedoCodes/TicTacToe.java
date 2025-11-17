Initialize 3×3 board filled with EMPTY

current_player ← “X”

LOOP forever:
    Display board
    Ask current_player for a move (row, column) that is EMPTY
    Place current_player’s mark on board at that location
    IF current_player has three in a row (row OR column OR diagonal):
        Display board
        Print current_player + " wins"
        BREAK loop
    ELSE IF board has no EMPTY cells:
        Display board
        Print "It’s a draw"
        BREAK loop
    END IF
    Switch current_player ← (“O” if current_player was “X”, else “X”)
END LOOP
