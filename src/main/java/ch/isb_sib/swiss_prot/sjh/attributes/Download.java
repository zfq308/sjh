package ch.isb_sib.swiss_prot.sjh.attributes;

import java.util.Objects;

import ch.isb_sib.swiss_prot.sjh.attributes.Attribute;

public class Download implements Attribute {
    private static final byte[] LANG_IS = Attribute.fromString("download");

    private final byte[] value;

    public Download(String value) {
	Objects.nonNull(value);
	this.value = Attribute.fromString(value);
    }

    @Override
    public byte[] getValue() {
	return value;
    }

    @Override
    public byte[] getAttributeName() {
	return LANG_IS;
    }
}