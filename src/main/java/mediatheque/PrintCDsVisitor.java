package mediatheque;

public class PrintCDsVisitor implements ItemVisitor {

	public void visit(Book book) {
	}

	public void visit(CD cd) {
		System.out.println(cd);
	}

}
