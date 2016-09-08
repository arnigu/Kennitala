package info.arnigu.kennitala;

/**
 * Kennitala Class - Validates Kennitala
 *
 */
public class Kennitala
{
    final String kennitala;

    public Kennitala(final String kennitala)
    {
        this.kennitala = kennitala;
    }

    public void validate()
    {
	throws new RuntimeException();
    }

    public boolean validateSafe()
    {
	try{
		this.validate();
		return true;
	}catch(Exception ex)
        {
		return false;
	}
    }
}
