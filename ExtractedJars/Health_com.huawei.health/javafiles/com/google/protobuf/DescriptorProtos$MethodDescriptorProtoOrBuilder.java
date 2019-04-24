// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$MethodDescriptorProtoOrBuilder
	extends MessageOrBuilder
{

	public abstract boolean getClientStreaming();

	public abstract String getInputType();

	public abstract ByteString getInputTypeBytes();

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract DescriptorProtos.MethodOptions getOptions();

	public abstract DescriptorProtos.MethodOptionsOrBuilder getOptionsOrBuilder();

	public abstract String getOutputType();

	public abstract ByteString getOutputTypeBytes();

	public abstract boolean getServerStreaming();

	public abstract boolean hasClientStreaming();

	public abstract boolean hasInputType();

	public abstract boolean hasName();

	public abstract boolean hasOptions();

	public abstract boolean hasOutputType();

	public abstract boolean hasServerStreaming();
}
