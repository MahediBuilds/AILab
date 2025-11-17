HILL-CLIMBING(initial_state):

    current ← initial_state

    loop:
        neighbors ← all states reachable from current

        if neighbors is empty:
            return current     // no moves possible

        next ← neighbor with lowest heuristic value

        if heuristic(next) ≥ heuristic(current):
            return current     // no better neighbor → stop

        current ← next

      
h(n) = sum of |row difference| + |column difference| for each tile


h(n) = number of tiles not in correct position
