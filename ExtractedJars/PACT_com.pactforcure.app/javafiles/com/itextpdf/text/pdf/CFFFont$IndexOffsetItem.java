// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;


// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont

protected static final class CFFFont$IndexOffsetItem extends CFFFont.OffsetItem
{

	public void emit(byte abyte0[])
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int k = 0;
	//    2    2:iconst_0        
	//    3    3:istore          4
		int i = 0;
	//    4    5:iconst_0        
	//    5    6:istore_2        
		switch(size)
	//*   6    7:aload_0         
	//*   7    8:getfield        #16  <Field int size>
		{
	//*   8   11:tableswitch     1 4: default 40
	//	               1 114
	//	               2 89
	//	               3 65
	//	               4 41
		default:
			return;
	//    9   40:return          

		case 4: // '\004'
			abyte0[myOffset + 0] = (byte)(value >>> 24 & 0xff);
	//   10   41:aload_1         
	//   11   42:aload_0         
	//   12   43:getfield        #26  <Field int myOffset>
	//   13   46:iconst_0        
	//   14   47:iadd            
	//   15   48:aload_0         
	//   16   49:getfield        #21  <Field int value>
	//   17   52:bipush          24
	//   18   54:iushr           
	//   19   55:sipush          255
	//   20   58:iand            
	//   21   59:int2byte        
	//   22   60:bastore         
			i = 0 + 1;
	//   23   61:iconst_0        
	//   24   62:iconst_1        
	//   25   63:iadd            
	//   26   64:istore_2        
			// fall through

		case 3: // '\003'
			abyte0[myOffset + i] = (byte)(value >>> 16 & 0xff);
	//   27   65:aload_1         
	//   28   66:aload_0         
	//   29   67:getfield        #26  <Field int myOffset>
	//   30   70:iload_2         
	//   31   71:iadd            
	//   32   72:aload_0         
	//   33   73:getfield        #21  <Field int value>
	//   34   76:bipush          16
	//   35   78:iushr           
	//   36   79:sipush          255
	//   37   82:iand            
	//   38   83:int2byte        
	//   39   84:bastore         
			j = i + 1;
	//   40   85:iload_2         
	//   41   86:iconst_1        
	//   42   87:iadd            
	//   43   88:istore_3        
			// fall through

		case 2: // '\002'
			abyte0[myOffset + j] = (byte)(value >>> 8 & 0xff);
	//   44   89:aload_1         
	//   45   90:aload_0         
	//   46   91:getfield        #26  <Field int myOffset>
	//   47   94:iload_3         
	//   48   95:iadd            
	//   49   96:aload_0         
	//   50   97:getfield        #21  <Field int value>
	//   51  100:bipush          8
	//   52  102:iushr           
	//   53  103:sipush          255
	//   54  106:iand            
	//   55  107:int2byte        
	//   56  108:bastore         
			k = j + 1;
	//   57  109:iload_3         
	//   58  110:iconst_1        
	//   59  111:iadd            
	//   60  112:istore          4
			// fall through

		case 1: // '\001'
			abyte0[myOffset + k] = (byte)(value >>> 0 & 0xff);
	//   61  114:aload_1         
	//   62  115:aload_0         
	//   63  116:getfield        #26  <Field int myOffset>
	//   64  119:iload           4
	//   65  121:iadd            
	//   66  122:aload_0         
	//   67  123:getfield        #21  <Field int value>
	//   68  126:iconst_0        
	//   69  127:iushr           
	//   70  128:sipush          255
	//   71  131:iand            
	//   72  132:int2byte        
	//   73  133:bastore         
			return;
	//   74  134:return          
		}
	}

	public void increment(int ai[])
	{
		super.increment(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #30  <Method void CFFFont$OffsetItem.increment(int[])>
		ai[0] = ai[0] + size;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iaload          
	//    8   10:aload_0         
	//    9   11:getfield        #16  <Field int size>
	//   10   14:iadd            
	//   11   15:iastore         
	//   12   16:return          
	}

	public final int size;

	public CFFFont$IndexOffsetItem(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CFFFont$OffsetItem()>
		size = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int size>
	//    5    9:return          
	}

	public CFFFont$IndexOffsetItem(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void CFFFont$OffsetItem()>
		size = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #16  <Field int size>
		value = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int value>
	//    8   14:return          
	}
}
