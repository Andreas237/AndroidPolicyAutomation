// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static final class CFFFont$UInt8Item extends CFFFont.Item
{

	public void emit(byte abyte0[])
	{
		abyte0[myOffset + 0] = (byte)(value >>> 0 & 0xff);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field int myOffset>
	//    3    5:iconst_0        
	//    4    6:iadd            
	//    5    7:aload_0         
	//    6    8:getfield        #16  <Field char value>
	//    7   11:iconst_0        
	//    8   12:iushr           
	//    9   13:sipush          255
	//   10   16:iand            
	//   11   17:int2byte        
	//   12   18:bastore         
	//   13   19:return          
	}

	public void increment(int ai[])
	{
		super.increment(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void CFFFont$Item.increment(int[])>
		ai[0] = ai[0] + 1;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iaload          
	//    8   10:iconst_1        
	//    9   11:iadd            
	//   10   12:iastore         
	//   11   13:return          
	}

	public char value;

	public CFFFont$UInt8Item(char c)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
		value = c;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field char value>
	//    5    9:return          
	}
}
