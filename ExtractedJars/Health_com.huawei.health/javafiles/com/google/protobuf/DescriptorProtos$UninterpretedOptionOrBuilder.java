// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$UninterpretedOptionOrBuilder
	extends MessageOrBuilder
{

	public abstract String getAggregateValue();

	public abstract ByteString getAggregateValueBytes();

	public abstract double getDoubleValue();

	public abstract String getIdentifierValue();

	public abstract ByteString getIdentifierValueBytes();

	public abstract DescriptorProtos$UninterpretedOption$NamePart getName(int i);

	public abstract int getNameCount();

	public abstract List getNameList();

	public abstract rBuilder getNameOrBuilder(int i);

	public abstract List getNameOrBuilderList();

	public abstract long getNegativeIntValue();

	public abstract long getPositiveIntValue();

	public abstract ByteString getStringValue();

	public abstract boolean hasAggregateValue();

	public abstract boolean hasDoubleValue();

	public abstract boolean hasIdentifierValue();

	public abstract boolean hasNegativeIntValue();

	public abstract boolean hasPositiveIntValue();

	public abstract boolean hasStringValue();
}
