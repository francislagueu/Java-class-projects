
package list;

/**
 *
 * @author Francis
 */
public class Hash {//hash class
    List[] list;//create and array of linked list
    int size;//size of the array
    int item = 0;
    //constructor of the hash table
    Hash(int num){//pass in the size of the table
        size = num;
        list = new List[num];//initialize the array of linked list with the new
        for(int i = 0; i < size; i++)//size
            list[i] = new List();//initialize each list index with a new linked
    }                               //list
    public int getKey(String word){//function to get the key that will allow us 
        int key = 0;                // to put the word at the specific index in
        for(int i=0; i < word.length(); i++){//the table
            int code = word.charAt(i);//Take the first character of the word
            key = (key*27+code)%size;//and return the ASCII value. the initial 
        }                            //is multiply by 27 which represent the 26
        return key;             //character of the alphabet plus the space
    }                           //get the remainder by dividing by the size of 
            //of the list array and return the remainder as the key of the index
            //of the linked list of the word in the array
    
    public void insert(Node node){//insert the node in the table at the index
        String theWord = node.word;//returned by the getKey() function
        int hashKey = getKey(theWord);
        list[hashKey].insert(node);//call the insert function from the list
    }                               //class and then pass in the node 
    public Node find(String word){
        int key = getKey(word);//find the key of the word to find 
       return list[key].find(word);//traverse the list at the key index to find 
                                    //the word and return it. this by calling
                                    //the find function from the list class
    }
    public void delete(Node node){
        String theWord = node.word;
        int hashKey = getKey(theWord);//find the key of the word to find 
        list[hashKey].delete(theWord);//traverse the list at the key index to
                                   //find the node to delete and call the delete
                                   //function from the list class
    }
    
    public void print(){//print the entire table
        for(int i = 0; i < size; i++){
            if(list[i].head != null){
                System.out.println("List at index "+i);
                list[i].print();//print the list at each index in the array 
            }               //by calling the print function from the list class

        }
    }
}
