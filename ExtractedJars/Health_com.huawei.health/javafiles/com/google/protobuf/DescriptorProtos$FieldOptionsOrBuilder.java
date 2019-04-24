// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.protobuf;

import java.util.List;

// Referenced classes of package com.google.protobuf:
//			DescriptorProtos

public static interface DescriptorProtos$FieldOptionsOrBuilder
	extends uilder
{

	public abstract DescriptorProtos.FieldOptions.CType getCtype();

	public abstract boolean getDeprecated();

	public abstract DescriptorProtos.FieldOptions.JSType getJstype();

	public abstract boolean getLazy();

	public abstract boolean getPacked();

	public abstract DescriptorProtos.UninterpretedOption getUninterpretedOption(int i);

	public abstract int getUninterpretedOptionCount();

	public abstract List getUninterpretedOptionList();

	public abstract uilder getUninterpretedOptionOrBuilder(int i);

	public abstract List getUninterpretedOptionOrBuilderList();

	public abstract boolean getWeak();

	public abstract boolean hasCtype();

	public abstract boolean hasDeprecated();

	public abstract boolean hasJstype();

	public abstract boolean hasLazy();

	public abstract boolean hasPacked();

	public abstract boolean hasWeak();
}
