package ch.isb_sib.swiss_prot.sjh.elements.text;

import static java.nio.charset.StandardCharsets.UTF_8;

import java.util.stream.Stream;

import ch.isb_sib.swiss_prot.sjh.attributes.global.GlobalAttribute;
import ch.isb_sib.swiss_prot.sjh.elements.CommonElement;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.FlowContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PalpabaleContent;
import ch.isb_sib.swiss_prot.sjh.elements.contenttype.PhrasingContent;

public class B extends CommonElement implements FlowContent, PhrasingContent, PalpabaleContent {
    private final static byte[] NAME = "b".getBytes(UTF_8);

    @Override
    protected byte[] getName() {
	return NAME;
    }

    public B(Stream<GlobalAttribute> ga, Stream<? extends PhrasingContent> childeren) {
	super(ga, childeren);
    }

    public B() {
	super();
    }
}
