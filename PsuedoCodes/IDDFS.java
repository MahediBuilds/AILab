function DLS(node, depth, limit):
    if node is goal:
        return SUCCESS
    if depth == limit:
        return CUT_OFF
    for each child of node:
        result ← DLS(child, depth+1, limit)
        if result == SUCCESS:
            return SUCCESS
    return FAILURE

  function IDDFS(root):
    for limit = 0 to ∞:
        result ← DLS(root, 0, limit)
        if result == SUCCESS:
            return SUCCESS
    return FAILURE

