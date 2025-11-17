START

Vacuum starts in Room A
Room A is dirty
Room B is dirty

WHILE (Room A dirty OR Room B dirty):

    IF vacuum is in Room A:
        IF Room A is dirty:
            Clean Room A
        ELSE:
            Move vacuum to Room B

    ELSE IF vacuum is in Room B:
        IF Room B is dirty:
            Clean Room B
        ELSE:
            Move vacuum to Room A

END WHILE

STOP
