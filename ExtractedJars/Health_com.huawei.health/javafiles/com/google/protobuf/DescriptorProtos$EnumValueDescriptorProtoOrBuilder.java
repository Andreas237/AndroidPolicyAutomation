// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$EnumValueDescriptorProtoOrBuilder
	extends MessageOrBuilder
{

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract int getNumber();

	public abstract DescriptorProtos.EnumValueOptions getOptions();

	public abstract DescriptorProtos.EnumValueOptionsOrBuilder getOptionsOrBuilder();

	public abstract boolean hasName();

	public abstract boolean hasNumber();

	public abstract boolean hasOptions();
}
