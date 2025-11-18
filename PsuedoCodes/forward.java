function FOL-FC-ASK(KB, α) returns a substitution or false
inputs: 
    KB  – the knowledge base (set of first-order definite clauses)
    α   – the query (atomic sentence)

local variables:
    new – new sentences inferred on each iteration

repeat until new is empty:

    new ← {}

    for each rule in KB do:

        (p1 ∧ … ∧ pn ⇒ q) ← STANDARDIZE-VARIABLES(rule)

        for each substitution θ such that:
            SUBST(θ, p1 ∧ … ∧ pn) = SUBST(θ, p1' ∧ … ∧ pn') 
            for some p1', …, pn' in KB

                qθ ← SUBST(θ, q)

                if qθ does not already appear in KB or in new then
                    add qθ to new

                    φ ← UNIFY(qθ, α)
                    if φ is not fail then
                        return φ

    add new to KB

return false
