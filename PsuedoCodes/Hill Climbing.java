current ← a random state

while true do
    next ← get-best-neighbour(current)

    if cost(current) ≤ cost(next) then
        break
    end if

    current ← next
end while

return current

      
h(n) = sum of |row difference| + |column difference| for each tile


h(n) = number of tiles not in correct position
