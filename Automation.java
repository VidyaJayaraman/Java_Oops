package interface_abstract;

// Concrete class implements interface and abstract functions

public class Automation extends MultipleLanguage implements Language,TestTool {

       public void selenium() {
		
		System.out.println("Test Tool is Selenium");
		
	}

	public void java() {
		
		System.out.println("Language preference first is Java ");
		
	}

	@Override
	public void ruby() {
		
		System.out.println("Language preference third is Ruby");
		
	}
}
