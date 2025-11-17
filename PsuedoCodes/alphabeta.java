function ALPHA-BETA-SEARCH(state)
    v ← MAX-VALUE(state, −∞, +∞)
    return the action in ACTIONS(state) with value v

function MAX-VALUE(state, α, β)

    if TERMINAL-TEST(state) then
        return UTILITY(state)

    v ← −∞

    for each action a in ACTIONS(state) do
        v ← MAX(v, MIN-VALUE( RESULT(state, a), α, β ))

        if v ≥ β then
            return v

        α ← MAX(α, v)

    return v

function MIN-VALUE(state, α, β)

    if TERMINAL-TEST(state) then
        return UTILITY(state)

    v ← +∞

    for each action a in ACTIONS(state) do
        v ← MIN(v, MAX-VALUE( RESULT(state, a), α, β ))

        if v ≤ α then
            return v

        β ← MIN(β, v)

    return v
