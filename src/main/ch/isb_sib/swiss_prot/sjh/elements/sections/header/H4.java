package ch.isb_sib.swiss_prot.sjh.elements.sections.header;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.SectioningContent;


public class H4
    extends CommonElement
    implements FlowContent, SectioningContent, PalpabaleContent
{
	private final static byte[] NAME = "h4".getBytes(UTF_8);

	@Override
	protected byte[] getName()
	{
		return NAME;
	}

	public H4(GlobalAttribute[] ga, Stream<? extends PhrasingContent> childeren)
	{
		super(ga, childeren);
	}

	public H4()
	{
		super();
	}

	public H4(Stream<? extends PhrasingContent> childeren)
	{
		super(childeren);
	}
}
