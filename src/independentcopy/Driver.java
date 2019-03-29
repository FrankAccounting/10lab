package independentcopy;

/**
 * @author Jim Lombardo, WCTC Lead Java Instructor
 * @version 1.02
 * @see Driver for run instructions and info about design rules
 * @see DependentCopy project for a poor design
 */
public class Driver {

    public static void main(String[] args) {
        // Uncomment this out (and comment following reader/writer)
        // to see how switching objects causes no problems with
        // Copier class because it's Polymorphic!!!
        Reader reader = new KeyboardReader();
        Writer writer = new ConsoleWriter();

        // Comment this out (and uncomment preceeding reader/writer)
        // to see how switching objects causes no problems with
        // Copier class because it's Polymorphic!!!
        //       Reader reader = new FileReader();
        //       Writer writer = new GuiWriter();
        // Copy from reader to writer
        // Notice that Copier is NOT dependent on implementation of reader/writer
        // (it is not rigid, fragile or immobile)
        Copier copier = new Copier(reader, writer);
        copier.copy();

        // Send end of program message
        System.out.println("Program ended. Line of reader input copied successfully to writer output.");
    }
}
