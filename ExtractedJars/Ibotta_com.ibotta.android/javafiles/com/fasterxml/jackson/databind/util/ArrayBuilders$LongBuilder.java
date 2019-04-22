// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.util;


// Referenced classes of package com.fasterxml.jackson.databind.util:
//			PrimitiveArrayBuilder, ArrayBuilders

public static final class ArrayBuilders$LongBuilder extends PrimitiveArrayBuilder
{

	public volatile Object _constructArray(int i)
	{
		return ((Object) (_constructArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #18  <Method long[] _constructArray(int)>
	//    3    5:areturn         
	}

	public final long[] _constructArray(int i)
	{
		return new long[i];
	//    0    0:iload_1         
	//    1    1:newarray        long[]
	//    2    3:areturn         
	}

	public ArrayBuilders$LongBuilder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void PrimitiveArrayBuilder()>
	//    2    4:return          
	}
}
