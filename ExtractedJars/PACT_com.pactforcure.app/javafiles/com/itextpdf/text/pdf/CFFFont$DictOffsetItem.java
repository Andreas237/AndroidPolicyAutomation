// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static final class CFFFont$DictOffsetItem extends CFFFont.OffsetItem
{

	public void emit(byte abyte0[])
	{
		if(size == 5)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field int size>
	//*   2    4:iconst_5        
	//*   3    5:icmpne          95
		{
			abyte0[myOffset] = 29;
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field int myOffset>
	//    7   13:bipush          29
	//    8   15:bastore         
			abyte0[myOffset + 1] = (byte)(value >>> 24 & 0xff);
	//    9   16:aload_1         
	//   10   17:aload_0         
	//   11   18:getfield        #21  <Field int myOffset>
	//   12   21:iconst_1        
	//   13   22:iadd            
	//   14   23:aload_0         
	//   15   24:getfield        #24  <Field int value>
	//   16   27:bipush          24
	//   17   29:iushr           
	//   18   30:sipush          255
	//   19   33:iand            
	//   20   34:int2byte        
	//   21   35:bastore         
			abyte0[myOffset + 2] = (byte)(value >>> 16 & 0xff);
	//   22   36:aload_1         
	//   23   37:aload_0         
	//   24   38:getfield        #21  <Field int myOffset>
	//   25   41:iconst_2        
	//   26   42:iadd            
	//   27   43:aload_0         
	//   28   44:getfield        #24  <Field int value>
	//   29   47:bipush          16
	//   30   49:iushr           
	//   31   50:sipush          255
	//   32   53:iand            
	//   33   54:int2byte        
	//   34   55:bastore         
			abyte0[myOffset + 3] = (byte)(value >>> 8 & 0xff);
	//   35   56:aload_1         
	//   36   57:aload_0         
	//   37   58:getfield        #21  <Field int myOffset>
	//   38   61:iconst_3        
	//   39   62:iadd            
	//   40   63:aload_0         
	//   41   64:getfield        #24  <Field int value>
	//   42   67:bipush          8
	//   43   69:iushr           
	//   44   70:sipush          255
	//   45   73:iand            
	//   46   74:int2byte        
	//   47   75:bastore         
			abyte0[myOffset + 4] = (byte)(value >>> 0 & 0xff);
	//   48   76:aload_1         
	//   49   77:aload_0         
	//   50   78:getfield        #21  <Field int myOffset>
	//   51   81:iconst_4        
	//   52   82:iadd            
	//   53   83:aload_0         
	//   54   84:getfield        #24  <Field int value>
	//   55   87:iconst_0        
	//   56   88:iushr           
	//   57   89:sipush          255
	//   58   92:iand            
	//   59   93:int2byte        
	//   60   94:bastore         
		}
	//   61   95:return          
	}

	public void increment(int ai[])
	{
		super.increment(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #28  <Method void CFFFont$OffsetItem.increment(int[])>
		ai[0] = ai[0] + size;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iaload          
	//    8   10:aload_0         
	//    9   11:getfield        #15  <Field int size>
	//   10   14:iadd            
	//   11   15:iastore         
	//   12   16:return          
	}

	public final int size = 5;

	public CFFFont$DictOffsetItem()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void CFFFont$OffsetItem()>
	//    2    4:aload_0         
	//    3    5:iconst_5        
	//    4    6:putfield        #15  <Field int size>
	//    5    9:return          
	}
}
