package ch.isb_sib.swiss_prot.sjh.elements.grouping;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.Element;


public class LI
    extends CommonElement
{
	private final static byte[] NAME = "body".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public LI(GlobalAttribute[] ga, Stream<Element> childeren)
	{
		super(ga, childeren);
	}

	public LI()
	{
		super();
	}

	public LI(Stream<Element> childeren)
	{
		super(childeren);
	}
}
