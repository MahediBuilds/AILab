A* Search(start, goal):

    open ← priority queue
    push (f=start_h, g=0, state=start, path=[start]) into open
    closed ← empty set

    while open not empty:

        (f, g, state, path) ← pop smallest f from open

        if state = goal:
            return path

        add state to closed

        for each neighbor of state:
            if neighbor not in closed:
                g_new ← g + 1
                h_new ← heuristic(neighbor, goal)
                f_new ← g_new + h_new
                push (f_new, g_new, neighbor, path + neighbor) into open

    return failure
