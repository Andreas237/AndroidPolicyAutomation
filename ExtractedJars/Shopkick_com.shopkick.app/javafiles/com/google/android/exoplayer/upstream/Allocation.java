// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.upstream;


public final class Allocation
{

	public Allocation(byte abyte0[], int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field byte[] data>
		offset = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #17  <Field int offset>
	//    8   14:return          
	}

	public int translateOffset(int i)
	{
		return offset + i;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field int offset>
	//    2    4:iload_1         
	//    3    5:iadd            
	//    4    6:ireturn         
	}

	public final byte data[];
	private final int offset;
}
