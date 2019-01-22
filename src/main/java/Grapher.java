import java.util.Arrays;
//import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.StringUtils;
import org.graphstream.graph.Node;
import org.graphstream.graph.implementations.MultiGraph;
import org.graphstream.ui.spriteManager.Sprite;
import org.graphstream.ui.spriteManager.SpriteManager;

public class Grapher {
    //private static MultiGraph _graph = new MultiGraph("Corda transactions");

    public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        //StringUtils.swapCase("AAbbCCdddd");
        MultiGraph _graph = new MultiGraph("Corda transactions");
        _graph.addNode("123");
    }
}
