FUNCTION CNF-CONVERT(sentence):

    // Step 1: Eliminate ⇒ and ⇔
    replace (α ⇒ β) with (¬α ∨ β)
    replace (α ⇔ β) with (α ⇒ β) ∧ (β ⇒ α)

    // Step 2: Move negation inward
    apply DeMorgan:
        ¬(α ∧ β) = ¬α ∨ ¬β
        ¬(α ∨ β) = ¬α ∧ ¬β
    eliminate double negation ¬¬α = α

    // Step 3: Distribute ∨ over ∧
    repeat until no change:
        convert expressions like:
            (α ∨ (β ∧ γ)) into (α ∨ β) ∧ (α ∨ γ)

    // Result is in CNF
    return set of clauses

  

FUNCTION RESOLUTION(KB, QUERY):

    // Step 1: Convert KB to CNF
    clauses ← CNF-CONVERT(KB)

    // Step 2: Add negated query
    neg_query ← NOT QUERY
    neg_clauses ← CNF-CONVERT(neg_query)

    clauses ← clauses ∪ neg_clauses

    // Step 3: Resolution loop
    new ← {}

    LOOP forever:

        // Generate all pairs of clauses
        pairs ← all unordered pairs (Ci, Cj) from clauses

        FOR each (Ci, Cj) in pairs DO:

            resolvents ← RESOLVE(Ci, Cj)

            IF empty_clause {} ∈ resolvents THEN
                return TRUE   // proof found

            new ← new ∪ resolvents

        IF new ⊆ clauses THEN
            return FALSE      // no progress → fail

        clauses ← clauses ∪ new


FUNCTION RESOLVE(C1, C2):

    resolvents ← empty set

    FOR each literal L in C1:
        FOR each literal M in C2:
            IF L = NOT M THEN
                resolvent ← (C1 − {L}) ∪ (C2 − {M})
                add resolvent to resolvents

    return resolvents

