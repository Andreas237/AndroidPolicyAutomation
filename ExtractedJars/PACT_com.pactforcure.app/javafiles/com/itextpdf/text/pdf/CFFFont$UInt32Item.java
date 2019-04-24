// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static final class CFFFont$UInt32Item extends CFFFont.Item
{

	public void emit(byte abyte0[])
	{
		abyte0[myOffset + 0] = (byte)(value >>> 24 & 0xff);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #22  <Field int myOffset>
	//    3    5:iconst_0        
	//    4    6:iadd            
	//    5    7:aload_0         
	//    6    8:getfield        #16  <Field int value>
	//    7   11:bipush          24
	//    8   13:iushr           
	//    9   14:sipush          255
	//   10   17:iand            
	//   11   18:int2byte        
	//   12   19:bastore         
		abyte0[myOffset + 1] = (byte)(value >>> 16 & 0xff);
	//   13   20:aload_1         
	//   14   21:aload_0         
	//   15   22:getfield        #22  <Field int myOffset>
	//   16   25:iconst_1        
	//   17   26:iadd            
	//   18   27:aload_0         
	//   19   28:getfield        #16  <Field int value>
	//   20   31:bipush          16
	//   21   33:iushr           
	//   22   34:sipush          255
	//   23   37:iand            
	//   24   38:int2byte        
	//   25   39:bastore         
		abyte0[myOffset + 2] = (byte)(value >>> 8 & 0xff);
	//   26   40:aload_1         
	//   27   41:aload_0         
	//   28   42:getfield        #22  <Field int myOffset>
	//   29   45:iconst_2        
	//   30   46:iadd            
	//   31   47:aload_0         
	//   32   48:getfield        #16  <Field int value>
	//   33   51:bipush          8
	//   34   53:iushr           
	//   35   54:sipush          255
	//   36   57:iand            
	//   37   58:int2byte        
	//   38   59:bastore         
		abyte0[myOffset + 3] = (byte)(value >>> 0 & 0xff);
	//   39   60:aload_1         
	//   40   61:aload_0         
	//   41   62:getfield        #22  <Field int myOffset>
	//   42   65:iconst_3        
	//   43   66:iadd            
	//   44   67:aload_0         
	//   45   68:getfield        #16  <Field int value>
	//   46   71:iconst_0        
	//   47   72:iushr           
	//   48   73:sipush          255
	//   49   76:iand            
	//   50   77:int2byte        
	//   51   78:bastore         
	//   52   79:return          
	}

	public void increment(int ai[])
	{
		super.increment(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #26  <Method void CFFFont$Item.increment(int[])>
		ai[0] = ai[0] + 4;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iaload          
	//    8   10:iconst_4        
	//    9   11:iadd            
	//   10   12:iastore         
	//   11   13:return          
	}

	public int value;

	public CFFFont$UInt32Item(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CFFFont$Item()>
		value = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int value>
	//    5    9:return          
	}
}
