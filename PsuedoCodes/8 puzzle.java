// FUNCTION Move(state, direction):

//     Find position (i, j) where tile = -1

//     IF direction = up AND i > 0:
//          swap (i, j) with (i−1, j)

//     IF direction = down AND i < 2:
//          swap (i, j) with (i+1, j)

//     IF direction = left AND j > 0:
//          swap (i, j) with (i, j−1)

//     IF direction = right AND j < 2:
//          swap (i, j) with (i, j+1)

//     Return new state


  
// FUNCTION DLS(state, depth, limit, last_move, goal):

//     IF state = goal:
//          return SUCCESS with path

//     IF depth = limit:
//          return FAILURE

//     FOR each direction in [up, left, down, right]:
//          IF direction is opposite of last_move:
//               skip

//          next_state = Move(state, direction)

//          IF next_state differs from state:
//               result = DLS(next_state, depth+1, limit, direction, goal)
//               IF result is SUCCESS:
//                    return SUCCESS with path including this state

//     return FAILURE

// FUNCTION IDDFS(start, goal):

//     FOR limit = 1 to 49:
//          result = DLS(start, 0, limit, NONE, goal)

//          IF result is SUCCESS:
//               print solution path and moves
//               STOP

//     print "No solution found"


// start = GetPuzzle()
// goal  = GetPuzzle()

// Call IDDFS(start, goal)
