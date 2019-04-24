// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$EnumDescriptorProtoOrBuilder
	extends MessageOrBuilder
{

	public abstract String getName();

	public abstract ByteString getNameBytes();

	public abstract DescriptorProtos.EnumOptions getOptions();

	public abstract DescriptorProtos.EnumOptionsOrBuilder getOptionsOrBuilder();

	public abstract String getReservedName(int i);

	public abstract ByteString getReservedNameBytes(int i);

	public abstract int getReservedNameCount();

	public abstract List getReservedNameList();

	public abstract vedRange getReservedRange(int i);

	public abstract int getReservedRangeCount();

	public abstract List getReservedRangeList();

	public abstract vedRangeOrBuilder getReservedRangeOrBuilder(int i);

	public abstract List getReservedRangeOrBuilderList();

	public abstract DescriptorProtos.EnumValueDescriptorProto getValue(int i);

	public abstract int getValueCount();

	public abstract List getValueList();

	public abstract lder getValueOrBuilder(int i);

	public abstract List getValueOrBuilderList();

	public abstract boolean hasName();

	public abstract boolean hasOptions();
}
