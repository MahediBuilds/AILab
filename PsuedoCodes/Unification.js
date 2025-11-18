UNIFY(ψ1, ψ2):

Step 1: If ψ1 or ψ2 is a variable or constant, then:
    a) If ψ1 and ψ2 are identical, return NIL
    b) Else if ψ1 is a variable:
         a. If ψ1 occurs in ψ2 then return FAILURE
         b. Else return { (ψ2 / ψ1) }
    c) Else if ψ2 is a variable:
         a. If ψ2 occurs in ψ1 then return FAILURE
         b. Else return { (ψ1 / ψ2) }
    d) Else return FAILURE

Step 2: If the predicate symbols of ψ1 and ψ2 are not the same, return FAILURE.

Step 3: If ψ1 and ψ2 have different numbers of arguments, return FAILURE.

Step 4: Set SUBST ← NIL.

Step 5: For i = 1 to number of arguments in ψ1 do:
        a) S ← UNIFY( argument_i(ψ1), argument_i(ψ2) )
        b) If S = FAILURE, return FAILURE
        c) If S ≠ NIL then:
               a. Apply substitution S to the remaining elements of ψ1 and ψ2
               b. SUBST ← APPEND(S, SUBST)

Step 6: Return SUBST.
