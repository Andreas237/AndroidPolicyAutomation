// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos

public static interface DescriptorProtos$MethodOptionsOrBuilder
	extends ilder
{

	public abstract boolean getDeprecated();

	public abstract cyLevel getIdempotencyLevel();

	public abstract DescriptorProtos.UninterpretedOption getUninterpretedOption(int i);

	public abstract int getUninterpretedOptionCount();

	public abstract List getUninterpretedOptionList();

	public abstract ilder getUninterpretedOptionOrBuilder(int i);

	public abstract List getUninterpretedOptionOrBuilderList();

	public abstract boolean hasDeprecated();

	public abstract boolean hasIdempotencyLevel();
}
