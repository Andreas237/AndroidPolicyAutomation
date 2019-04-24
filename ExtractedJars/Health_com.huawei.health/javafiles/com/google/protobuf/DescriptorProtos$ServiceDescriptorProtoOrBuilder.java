// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$ServiceDescriptorProtoOrBuilder
	extends MessageOrBuilder
{

	public abstract DescriptorProtos.MethodDescriptorProto getMethod(int i);

	public abstract int getMethodCount();

	public abstract List getMethodList();

	public abstract DescriptorProtos.MethodDescriptorProtoOrBuilder getMethodOrBuilder(int i);

	public abstract List getMethodOrBuilderList();

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract DescriptorProtos.ServiceOptions getOptions();

	public abstract DescriptorProtos.ServiceOptionsOrBuilder getOptionsOrBuilder();

	public abstract boolean hasName();

	public abstract boolean hasOptions();
}
