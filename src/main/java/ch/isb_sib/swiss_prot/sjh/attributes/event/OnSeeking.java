package ch.isb_sib.swiss_prot.sjh.attributes.event;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;


public class OnSeeking
    implements EventAttribute
{
	private static final byte[] NAME = Attribute.fromString("onseeking");

	private final byte[] value;

	public OnSeeking(String value)
	{
		Objects.nonNull(value);
		this.value = Attribute.fromString(value);
	}

	@Override
	public byte[] getValue()
	{
		return value;
	}

	@Override
	public byte[] getAttributeName()
	{
		return NAME;
	}
}
