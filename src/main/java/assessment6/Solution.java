package assessment6;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public int lengthLongestPath(String input) {
        Item curDir = new Item();
        Set<Item> files = new HashSet<>();
        for (String line : input.lines().toList()) {
            int lineDepth = line.lastIndexOf('\t');
            String name = line.substring(lineDepth + 1);
            while (curDir.getDepth()+1 < lineDepth){
                curDir = curDir.parent;
            }
            Item newItem = new Item();
            newItem.parent = curDir;
            newItem.shortName = name;
            if (name.contains(".")){
                files.add(newItem);
            }
            else{
                curDir = newItem;
            }
        }
        return files.isEmpty() ? 0 : files.stream().mapToInt(f -> f.getFullName().length()).max().getAsInt();

    }

    static class Item {

        Item parent;
        String shortName;

        String getFullName() {
            if (parent != null) {
                return parent.getFullName() + '/' + shortName;
            }
            else {
                return "";
            }
        }

        int getDepth() {
            return (parent == null) ? 0 : 1 + parent.getDepth();
        }
    }
}
