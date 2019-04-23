// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util.extensions;


public abstract class Buffer
{

	public Buffer()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public final boolean getFlag(int i)
	{
		return (flags & i) == i;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int flags>
	//    2    4:iload_1         
	//    3    5:iand            
	//    4    6:iload_1         
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public void reset()
	{
		flags = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #19  <Field int flags>
	//    3    5:return          
	}

	public final void setFlag(int i)
	{
		flags = i | flags;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #19  <Field int flags>
	//    4    6:ior             
	//    5    7:putfield        #19  <Field int flags>
	//    6   10:return          
	}

	public static final int FLAG_DECODE_ONLY = 2;
	public static final int FLAG_END_OF_STREAM = 1;
	private int flags;
}
