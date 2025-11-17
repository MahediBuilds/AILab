function TT-ENTAils?(KB, α):
    symbols ← all propositional symbols in KB and α
    return TT-CHECK-ALL(KB, α, symbols, {})


function TT-CHECK-ALL(KB, α, symbols, model):

    if symbols is empty then
        if PL-TRUE?(KB, model) then
            return PL-TRUE?(α, model)
        else
            return true    // If KB is false in this model, it imposes no constraint
    else
        P ← first(symbols)
        rest ← symbols without P

        return ( TT-CHECK-ALL(KB, α, rest, model ∪ {P = true}) )
               and
               ( TT-CHECK-ALL(KB, α, rest, model ∪ {P = false}) )



// FUNCTION TT-ENTAils?(KB, α)

// Checks whether the knowledge base logically entails the query.

// FUNCTION TT-CHECK-ALL(KB, α, symbols, model)

// Recursively checks all truth assignments.
