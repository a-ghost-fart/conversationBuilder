package sexy.fedora.ConversationBuilder;

import java.util.ArrayList;
import java.util.List;

public class ConversationTree {

    private List<ConversationNode> nodes;
    private List<Integer> options;

    public ConversationTree() {
        nodes = new ArrayList<ConversationNode>();
        options = new ArrayList<Integer>();
    }

    public void addNode(ConversationNode node) {
        nodes.add(node);
    }

    public void addOptions(List<Integer> _options) {
        options = _options;
    }

    public void addOption(Integer option) {
        options.add(option);
    }

}
