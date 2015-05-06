package sexy.fedora.ConversationBuilder;

public class ConversationNode {

    private String label;
    private boolean read;
    private String response;
    private Integer targetTreeIndex;

    public ConversationNode(String _label, String _response, Integer _targetTreeIndex) {
        label = _label;
        read = false;
        response = _response;
        targetTreeIndex = _targetTreeIndex;
    }

}
