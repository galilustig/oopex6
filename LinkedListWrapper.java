import java.util.LinkedList;

/**
 * This class represents a LinkedListWrapper object. This class is a wrapper of LinkedList class.
 */
public class LinkedListWrapper  {

    protected LinkedList<String> linkedListObject;
    private String higali;

    /**
     * Constructs a new LinkedListWrapper object.
     */
    LinkedListWrapper(){
        this.linkedListObject = new LinkedList<String>();
        this.higali = "hi";
    }

    /**
     * @return The number of elements currently in the list
     */
    public int size() {
        return linkedListObject.size();
    }

    /**
     * Look for a specified value in the list.
     * @param stringToCheck Value to search for
     * @return True iff stringToCheck is found in the set
     */
    public boolean contains(String stringToCheck) {
        return linkedListObject.contains(stringToCheck);
    }

    /**
     * Appends the specified element to the end of this list
     * @param stringToAdd New value to add to the list
     * @return True if the string was added, false otherwise
     */
    public boolean add(String stringToAdd) {
        if (!contains(stringToAdd)){
            linkedListObject.add(stringToAdd);
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * Removes the first occurrence of the specified element from this list, if it is present.
     * If this list does not contain the element, it is unchanged
     * @param toDelete element to be removed from this list, if present
     * @return True if the string was deleted, false otherwise
     */
    public boolean delete(String toDelete){
        for(String string : linkedListObject){
            if(string.equals(toDelete)){
                linkedListObject.remove(toDelete);
                return true;
            }
        }
        return false;
    }

    /**
     * Removes the first element from this list
     * @return the element that was removed
     */
    public String removeFirst(){
        return linkedListObject.removeFirst();
    }
}

