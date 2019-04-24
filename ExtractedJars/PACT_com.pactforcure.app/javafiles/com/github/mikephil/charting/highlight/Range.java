// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.github.mikephil.charting.highlight;


public final class Range
{

	public Range(float f, float f1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		from = f;
	//    2    4:aload_0         
	//    3    5:fload_1         
	//    4    6:putfield        #14  <Field float from>
		to = f1;
	//    5    9:aload_0         
	//    6   10:fload_2         
	//    7   11:putfield        #16  <Field float to>
	//    8   14:return          
	}

	public boolean contains(float f)
	{
		return f > from && f <= to;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field float from>
	//    3    5:fcmpl           
	//    4    6:ifle            20
	//    5    9:fload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #16  <Field float to>
	//    8   14:fcmpg           
	//    9   15:ifgt            20
	//   10   18:iconst_1        
	//   11   19:ireturn         
	//   12   20:iconst_0        
	//   13   21:ireturn         
	}

	public boolean isLarger(float f)
	{
		return f > to;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #16  <Field float to>
	//    3    5:fcmpl           
	//    4    6:ifle            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isSmaller(float f)
	{
		return f < from;
	//    0    0:fload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #14  <Field float from>
	//    3    5:fcmpg           
	//    4    6:ifge            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public float from;
	public float to;
}
