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

heuristic(state, goal):
    return number of misplaced tiles   // or Manhattan distance

find_blank(state):
    return position of 0 tile

get_neighbors(state):
    locate blank
    swap blank with each valid adjacent tile
    return all resulting states
