// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$OneofDescriptorProtoOrBuilder
	extends MessageOrBuilder
{

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract DescriptorProtos.OneofOptions getOptions();

	public abstract DescriptorProtos.OneofOptionsOrBuilder getOptionsOrBuilder();

	public abstract boolean hasName();

	public abstract boolean hasOptions();
}
