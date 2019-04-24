// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static abstract class CFFFont$Item
{

	public void emit(byte abyte0[])
	{
	//    0    0:return          
	}

	public void increment(int ai[])
	{
		myOffset = ai[0];
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:iaload          
	//    4    4:putfield        #15  <Field int myOffset>
	//    5    7:return          
	}

	public void xref()
	{
	//    0    0:return          
	}

	protected int myOffset;

	protected CFFFont$Item()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		myOffset = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #15  <Field int myOffset>
	//    5    9:return          
	}
}
