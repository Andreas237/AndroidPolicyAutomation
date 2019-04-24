// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static final class CFFFont$UInt16Item extends CFFFont.Item
{

	public void emit(byte abyte0[])
	{
		abyte0[myOffset + 0] = (byte)(value >>> 8 & 0xff);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #23  <Field int myOffset>
	//    3    5:iconst_0        
	//    4    6:iadd            
	//    5    7:aload_0         
	//    6    8:getfield        #16  <Field char value>
	//    7   11:bipush          8
	//    8   13:iushr           
	//    9   14:sipush          255
	//   10   17:iand            
	//   11   18:int2byte        
	//   12   19:bastore         
		abyte0[myOffset + 1] = (byte)(value >>> 0 & 0xff);
	//   13   20:aload_1         
	//   14   21:aload_0         
	//   15   22:getfield        #23  <Field int myOffset>
	//   16   25:iconst_1        
	//   17   26:iadd            
	//   18   27:aload_0         
	//   19   28:getfield        #16  <Field char value>
	//   20   31:iconst_0        
	//   21   32:iushr           
	//   22   33:sipush          255
	//   23   36:iand            
	//   24   37:int2byte        
	//   25   38:bastore         
	//   26   39:return          
	}

	public void increment(int ai[])
	{
		super.increment(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #27  <Method void CFFFont$Item.increment(int[])>
		ai[0] = ai[0] + 2;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iaload          
	//    8   10:iconst_2        
	//    9   11:iadd            
	//   10   12:iastore         
	//   11   13:return          
	}

	public char value;

	public CFFFont$UInt16Item(char c)
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
