// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$FieldDescriptorProtoOrBuilder
	extends MessageOrBuilder
{

	public abstract String getDefaultValue();

	public abstract ByteString getDefaultValueBytes();

	public abstract String getExtendee();

	public abstract ByteString getExtendeeBytes();

	public abstract String getJsonName();

	public abstract ByteString getJsonNameBytes();

	public abstract DescriptorProtos.FieldDescriptorProto.Label getLabel();

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract int getNumber();

	public abstract int getOneofIndex();

	public abstract DescriptorProtos.FieldOptions getOptions();

	public abstract DescriptorProtos.FieldOptionsOrBuilder getOptionsOrBuilder();

	public abstract DescriptorProtos.FieldDescriptorProto.Type getType();

	public abstract String getTypeName();

	public abstract ByteString getTypeNameBytes();

	public abstract boolean hasDefaultValue();

	public abstract boolean hasExtendee();

	public abstract boolean hasJsonName();

	public abstract boolean hasLabel();

	public abstract boolean hasName();

	public abstract boolean hasNumber();

	public abstract boolean hasOneofIndex();

	public abstract boolean hasOptions();

	public abstract boolean hasType();

	public abstract boolean hasTypeName();
}
