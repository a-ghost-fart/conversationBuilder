package sexy.fedora.ConversationBuilder;

import java.util.ArrayList;
import java.util.List;

public class Conversation {

    private List<ConversationTree> trees;

    public Conversation() {
        trees = new ArrayList<ConversationTree>();
    }

    public void addConversationTree(ConversationTree tree) {
        trees.add(tree);
    }

}
