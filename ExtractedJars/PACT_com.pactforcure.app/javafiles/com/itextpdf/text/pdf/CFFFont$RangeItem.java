// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.ExceptionConverter;

// Referenced classes of package com.itextpdf.text.pdf:
//			CFFFont, RandomAccessFileOrArray

protected static final class CFFFont$RangeItem extends CFFFont.Item
{

	public void emit(byte abyte0[])
	{
		int i;
		buf.seek(offset);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field RandomAccessFileOrArray buf>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field int offset>
	//    4    8:i2l             
	//    5    9:invokevirtual   #34  <Method void RandomAccessFileOrArray.seek(long)>
		i = myOffset;
	//    6   12:aload_0         
	//    7   13:getfield        #37  <Field int myOffset>
	//    8   16:istore_2        
_L1:
		if(i >= myOffset + length)
			break MISSING_BLOCK_LABEL_57;
	//    9   17:iload_2         
	//   10   18:aload_0         
	//   11   19:getfield        #37  <Field int myOffset>
	//   12   22:aload_0         
	//   13   23:getfield        #21  <Field int length>
	//   14   26:iadd            
	//   15   27:icmpge          57
		abyte0[i] = buf.readByte();
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:aload_0         
	//   19   33:getfield        #23  <Field RandomAccessFileOrArray buf>
	//   20   36:invokevirtual   #41  <Method byte RandomAccessFileOrArray.readByte()>
	//   21   39:bastore         
		i++;
	//   22   40:iload_2         
	//   23   41:iconst_1        
	//   24   42:iadd            
	//   25   43:istore_2        
		  goto _L1
	//*  26   44:goto            17
		abyte0;
	//   27   47:astore_1        
		throw new ExceptionConverter(((Exception) (abyte0)));
	//   28   48:new             #43  <Class ExceptionConverter>
	//   29   51:dup             
	//   30   52:aload_1         
	//   31   53:invokespecial   #46  <Method void ExceptionConverter(Exception)>
	//   32   56:athrow          
	//   33   57:return          
	}

	public void increment(int ai[])
	{
		super.increment(ai);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #50  <Method void CFFFont$Item.increment(int[])>
		ai[0] = ai[0] + length;
	//    3    5:aload_1         
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:iconst_0        
	//    7    9:iaload          
	//    8   10:aload_0         
	//    9   11:getfield        #21  <Field int length>
	//   10   14:iadd            
	//   11   15:iastore         
	//   12   16:return          
	}

	private RandomAccessFileOrArray buf;
	public int length;
	public int offset;

	public CFFFont$RangeItem(RandomAccessFileOrArray randomaccessfileorarray, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void CFFFont$Item()>
		offset = i;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #19  <Field int offset>
		length = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #21  <Field int length>
		buf = randomaccessfileorarray;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #23  <Field RandomAccessFileOrArray buf>
	//   11   19:return          
	}
}
