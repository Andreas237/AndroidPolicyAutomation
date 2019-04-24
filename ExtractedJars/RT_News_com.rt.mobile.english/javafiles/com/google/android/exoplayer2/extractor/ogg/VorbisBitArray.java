// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.util.Assertions;

final class VorbisBitArray
{

	public VorbisBitArray(byte abyte0[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		data = abyte0;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field byte[] data>
		byteLimit = abyte0.length;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:arraylength     
	//    8   12:putfield        #19  <Field int byteLimit>
	//    9   15:return          
	}

	private void assertValidOffset()
	{
		boolean flag;
		if(byteOffset >= 0 && (byteOffset < byteLimit || byteOffset == byteLimit && bitOffset == 0))
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field int byteOffset>
	//*   2    4:iflt            41
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field int byteOffset>
	//*   5   11:aload_0         
	//*   6   12:getfield        #19  <Field int byteLimit>
	//*   7   15:icmplt          36
	//*   8   18:aload_0         
	//*   9   19:getfield        #23  <Field int byteOffset>
	//*  10   22:aload_0         
	//*  11   23:getfield        #19  <Field int byteLimit>
	//*  12   26:icmpne          41
	//*  13   29:aload_0         
	//*  14   30:getfield        #25  <Field int bitOffset>
	//*  15   33:ifne            41
			flag = true;
	//   16   36:iconst_1        
	//   17   37:istore_1        
		else
	//*  18   38:goto            43
			flag = false;
	//   19   41:iconst_0        
	//   20   42:istore_1        
		Assertions.checkState(flag);
	//   21   43:iload_1         
	//   22   44:invokestatic    #31  <Method void Assertions.checkState(boolean)>
	//   23   47:return          
	}

	public int bitsLeft()
	{
		return (byteLimit - byteOffset) * 8 - bitOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field int byteLimit>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field int byteOffset>
	//    4    8:isub            
	//    5    9:bipush          8
	//    6   11:imul            
	//    7   12:aload_0         
	//    8   13:getfield        #25  <Field int bitOffset>
	//    9   16:isub            
	//   10   17:ireturn         
	}

	public int getPosition()
	{
		return byteOffset * 8 + bitOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int byteOffset>
	//    2    4:bipush          8
	//    3    6:imul            
	//    4    7:aload_0         
	//    5    8:getfield        #25  <Field int bitOffset>
	//    6   11:iadd            
	//    7   12:ireturn         
	}

	public boolean readBit()
	{
		boolean flag;
		if(((data[byteOffset] & 0xff) >> bitOffset & 1) == 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #17  <Field byte[] data>
	//*   2    4:aload_0         
	//*   3    5:getfield        #23  <Field int byteOffset>
	//*   4    8:baload          
	//*   5    9:sipush          255
	//*   6   12:iand            
	//*   7   13:aload_0         
	//*   8   14:getfield        #25  <Field int bitOffset>
	//*   9   17:ishr            
	//*  10   18:iconst_1        
	//*  11   19:iand            
	//*  12   20:iconst_1        
	//*  13   21:icmpne          29
			flag = true;
	//   14   24:iconst_1        
	//   15   25:istore_1        
		else
	//*  16   26:goto            31
			flag = false;
	//   17   29:iconst_0        
	//   18   30:istore_1        
		skipBits(1);
	//   19   31:aload_0         
	//   20   32:iconst_1        
	//   21   33:invokevirtual   #40  <Method void skipBits(int)>
		return flag;
	//   22   36:iload_1         
	//   23   37:ireturn         
	}

	public int readBits(int i)
	{
		int l = byteOffset;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field int byteOffset>
	//    2    4:istore          4
		int k = Math.min(i, 8 - bitOffset);
	//    3    6:iload_1         
	//    4    7:bipush          8
	//    5    9:aload_0         
	//    6   10:getfield        #25  <Field int bitOffset>
	//    7   13:isub            
	//    8   14:invokestatic    #48  <Method int Math.min(int, int)>
	//    9   17:istore_3        
		byte abyte0[] = data;
	//   10   18:aload_0         
	//   11   19:getfield        #17  <Field byte[] data>
	//   12   22:astore          5
		int j = l + 1;
	//   13   24:iload           4
	//   14   26:iconst_1        
	//   15   27:iadd            
	//   16   28:istore_2        
		l = (abyte0[l] & 0xff) >> bitOffset & 255 >> 8 - k;
	//   17   29:aload           5
	//   18   31:iload           4
	//   19   33:baload          
	//   20   34:sipush          255
	//   21   37:iand            
	//   22   38:aload_0         
	//   23   39:getfield        #25  <Field int bitOffset>
	//   24   42:ishr            
	//   25   43:sipush          255
	//   26   46:bipush          8
	//   27   48:iload_3         
	//   28   49:isub            
	//   29   50:ishr            
	//   30   51:iand            
	//   31   52:istore          4
		while(k < i) 
	//*  32   54:iload_3         
	//*  33   55:iload_1         
	//*  34   56:icmpge          88
		{
			l |= (data[j] & 0xff) << k;
	//   35   59:iload           4
	//   36   61:aload_0         
	//   37   62:getfield        #17  <Field byte[] data>
	//   38   65:iload_2         
	//   39   66:baload          
	//   40   67:sipush          255
	//   41   70:iand            
	//   42   71:iload_3         
	//   43   72:ishl            
	//   44   73:ior             
	//   45   74:istore          4
			k += 8;
	//   46   76:iload_3         
	//   47   77:bipush          8
	//   48   79:iadd            
	//   49   80:istore_3        
			j++;
	//   50   81:iload_2         
	//   51   82:iconst_1        
	//   52   83:iadd            
	//   53   84:istore_2        
		}
	//*  54   85:goto            54
		skipBits(i);
	//   55   88:aload_0         
	//   56   89:iload_1         
	//   57   90:invokevirtual   #40  <Method void skipBits(int)>
		return l & -1 >>> 32 - i;
	//   58   93:iload           4
	//   59   95:iconst_m1       
	//   60   96:bipush          32
	//   61   98:iload_1         
	//   62   99:isub            
	//   63  100:iushr           
	//   64  101:iand            
	//   65  102:ireturn         
	}

	public void reset()
	{
		byteOffset = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #23  <Field int byteOffset>
		bitOffset = 0;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #25  <Field int bitOffset>
	//    6   10:return          
	}

	public void setPosition(int i)
	{
		byteOffset = i / 8;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:bipush          8
	//    3    4:idiv            
	//    4    5:putfield        #23  <Field int byteOffset>
		bitOffset = i - byteOffset * 8;
	//    5    8:aload_0         
	//    6    9:iload_1         
	//    7   10:aload_0         
	//    8   11:getfield        #23  <Field int byteOffset>
	//    9   14:bipush          8
	//   10   16:imul            
	//   11   17:isub            
	//   12   18:putfield        #25  <Field int bitOffset>
		assertValidOffset();
	//   13   21:aload_0         
	//   14   22:invokespecial   #52  <Method void assertValidOffset()>
	//   15   25:return          
	}

	public void skipBits(int i)
	{
		int j = i / 8;
	//    0    0:iload_1         
	//    1    1:bipush          8
	//    2    3:idiv            
	//    3    4:istore_2        
		byteOffset = byteOffset + j;
	//    4    5:aload_0         
	//    5    6:aload_0         
	//    6    7:getfield        #23  <Field int byteOffset>
	//    7   10:iload_2         
	//    8   11:iadd            
	//    9   12:putfield        #23  <Field int byteOffset>
		bitOffset = bitOffset + (i - j * 8);
	//   10   15:aload_0         
	//   11   16:aload_0         
	//   12   17:getfield        #25  <Field int bitOffset>
	//   13   20:iload_1         
	//   14   21:iload_2         
	//   15   22:bipush          8
	//   16   24:imul            
	//   17   25:isub            
	//   18   26:iadd            
	//   19   27:putfield        #25  <Field int bitOffset>
		if(bitOffset > 7)
	//*  20   30:aload_0         
	//*  21   31:getfield        #25  <Field int bitOffset>
	//*  22   34:bipush          7
	//*  23   36:icmple          60
		{
			byteOffset = byteOffset + 1;
	//   24   39:aload_0         
	//   25   40:aload_0         
	//   26   41:getfield        #23  <Field int byteOffset>
	//   27   44:iconst_1        
	//   28   45:iadd            
	//   29   46:putfield        #23  <Field int byteOffset>
			bitOffset = bitOffset - 8;
	//   30   49:aload_0         
	//   31   50:aload_0         
	//   32   51:getfield        #25  <Field int bitOffset>
	//   33   54:bipush          8
	//   34   56:isub            
	//   35   57:putfield        #25  <Field int bitOffset>
		}
		assertValidOffset();
	//   36   60:aload_0         
	//   37   61:invokespecial   #52  <Method void assertValidOffset()>
	//   38   64:return          
	}

	private int bitOffset;
	private final int byteLimit;
	private int byteOffset;
	private final byte data[];
}
