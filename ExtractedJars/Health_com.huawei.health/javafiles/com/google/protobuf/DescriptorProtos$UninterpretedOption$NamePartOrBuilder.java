// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;


// Referenced classes of package com.google.protobuf:
//			MessageOrBuilder, DescriptorProtos, ByteString

public static interface DescriptorProtos$UninterpretedOption$NamePartOrBuilder
	extends MessageOrBuilder
{

	public abstract boolean getIsExtension();

	public abstract String getNamePart();

	public abstract ByteString getNamePartBytes();

	public abstract boolean hasIsExtension();

	public abstract boolean hasNamePart();
}
