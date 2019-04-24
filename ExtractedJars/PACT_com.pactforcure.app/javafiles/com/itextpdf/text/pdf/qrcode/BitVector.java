// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


public final class BitVector
{

	public BitVector()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		sizeInBits = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #16  <Field int sizeInBits>
		array = new byte[32];
	//    5    9:aload_0         
	//    6   10:bipush          32
	//    7   12:newarray        byte[]
	//    8   14:putfield        #18  <Field byte[] array>
	//    9   17:return          
	}

	private void appendByte(int i)
	{
		if(sizeInBits >> 3 == array.length)
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field int sizeInBits>
	//*   2    4:iconst_3        
	//*   3    5:ishr            
	//*   4    6:aload_0         
	//*   5    7:getfield        #18  <Field byte[] array>
	//*   6   10:arraylength     
	//*   7   11:icmpne          44
		{
			byte abyte0[] = new byte[array.length << 1];
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field byte[] array>
	//   10   18:arraylength     
	//   11   19:iconst_1        
	//   12   20:ishl            
	//   13   21:newarray        byte[]
	//   14   23:astore_2        
			System.arraycopy(((Object) (array)), 0, ((Object) (abyte0)), 0, array.length);
	//   15   24:aload_0         
	//   16   25:getfield        #18  <Field byte[] array>
	//   17   28:iconst_0        
	//   18   29:aload_2         
	//   19   30:iconst_0        
	//   20   31:aload_0         
	//   21   32:getfield        #18  <Field byte[] array>
	//   22   35:arraylength     
	//   23   36:invokestatic    #27  <Method void System.arraycopy(Object, int, Object, int, int)>
			array = abyte0;
	//   24   39:aload_0         
	//   25   40:aload_2         
	//   26   41:putfield        #18  <Field byte[] array>
		}
		array[sizeInBits >> 3] = (byte)i;
	//   27   44:aload_0         
	//   28   45:getfield        #18  <Field byte[] array>
	//   29   48:aload_0         
	//   30   49:getfield        #16  <Field int sizeInBits>
	//   31   52:iconst_3        
	//   32   53:ishr            
	//   33   54:iload_1         
	//   34   55:int2byte        
	//   35   56:bastore         
		sizeInBits = sizeInBits + 8;
	//   36   57:aload_0         
	//   37   58:aload_0         
	//   38   59:getfield        #16  <Field int sizeInBits>
	//   39   62:bipush          8
	//   40   64:iadd            
	//   41   65:putfield        #16  <Field int sizeInBits>
	//   42   68:return          
	}

	public void appendBit(int i)
	{
		if(i != 0 && i != 1)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpeq          19
			throw new IllegalArgumentException("Bad bit");
	//    5    9:new             #30  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #32  <String "Bad bit">
	//    8   15:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		int j = sizeInBits & 7;
	//   10   19:aload_0         
	//   11   20:getfield        #16  <Field int sizeInBits>
	//   12   23:bipush          7
	//   13   25:iand            
	//   14   26:istore_2        
		if(j == 0)
	//*  15   27:iload_2         
	//*  16   28:ifne            47
		{
			appendByte(0);
	//   17   31:aload_0         
	//   18   32:iconst_0        
	//   19   33:invokespecial   #37  <Method void appendByte(int)>
			sizeInBits = sizeInBits - 8;
	//   20   36:aload_0         
	//   21   37:aload_0         
	//   22   38:getfield        #16  <Field int sizeInBits>
	//   23   41:bipush          8
	//   24   43:isub            
	//   25   44:putfield        #16  <Field int sizeInBits>
		}
		byte abyte0[] = array;
	//   26   47:aload_0         
	//   27   48:getfield        #18  <Field byte[] array>
	//   28   51:astore          4
		int k = sizeInBits >> 3;
	//   29   53:aload_0         
	//   30   54:getfield        #16  <Field int sizeInBits>
	//   31   57:iconst_3        
	//   32   58:ishr            
	//   33   59:istore_3        
		abyte0[k] = (byte)(abyte0[k] | i << 7 - j);
	//   34   60:aload           4
	//   35   62:iload_3         
	//   36   63:aload           4
	//   37   65:iload_3         
	//   38   66:baload          
	//   39   67:iload_1         
	//   40   68:bipush          7
	//   41   70:iload_2         
	//   42   71:isub            
	//   43   72:ishl            
	//   44   73:ior             
	//   45   74:int2byte        
	//   46   75:bastore         
		sizeInBits = sizeInBits + 1;
	//   47   76:aload_0         
	//   48   77:aload_0         
	//   49   78:getfield        #16  <Field int sizeInBits>
	//   50   81:iconst_1        
	//   51   82:iadd            
	//   52   83:putfield        #16  <Field int sizeInBits>
	//   53   86:return          
	}

	public void appendBitVector(BitVector bitvector)
	{
		int j = bitvector.size();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #43  <Method int size()>
	//    2    4:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    5:iconst_0        
	//*   4    6:istore_2        
	//*   5    7:iload_2         
	//*   6    8:iload_3         
	//*   7    9:icmpge          28
			appendBit(bitvector.at(i));
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:iload_2         
	//   11   15:invokevirtual   #47  <Method int at(int)>
	//   12   18:invokevirtual   #49  <Method void appendBit(int)>

	//   13   21:iload_2         
	//   14   22:iconst_1        
	//   15   23:iadd            
	//   16   24:istore_2        
	//*  17   25:goto            7
	//   18   28:return          
	}

	public void appendBits(int i, int j)
	{
		if(j < 0 || j > 32)
	//*   0    0:iload_2         
	//*   1    1:iflt            10
	//*   2    4:iload_2         
	//*   3    5:bipush          32
	//*   4    7:icmple          20
			throw new IllegalArgumentException("Num bits must be between 0 and 32");
	//    5   10:new             #30  <Class IllegalArgumentException>
	//    6   13:dup             
	//    7   14:ldc1            #53  <String "Num bits must be between 0 and 32">
	//    8   16:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		while(j > 0) 
	//*  10   20:iload_2         
	//*  11   21:ifle            80
			if((sizeInBits & 7) == 0 && j >= 8)
	//*  12   24:aload_0         
	//*  13   25:getfield        #16  <Field int sizeInBits>
	//*  14   28:bipush          7
	//*  15   30:iand            
	//*  16   31:ifne            62
	//*  17   34:iload_2         
	//*  18   35:bipush          8
	//*  19   37:icmplt          62
			{
				appendByte(i >> j - 8 & 0xff);
	//   20   40:aload_0         
	//   21   41:iload_1         
	//   22   42:iload_2         
	//   23   43:bipush          8
	//   24   45:isub            
	//   25   46:ishr            
	//   26   47:sipush          255
	//   27   50:iand            
	//   28   51:invokespecial   #37  <Method void appendByte(int)>
				j -= 8;
	//   29   54:iload_2         
	//   30   55:bipush          8
	//   31   57:isub            
	//   32   58:istore_2        
			} else
	//*  33   59:goto            20
			{
				appendBit(i >> j - 1 & 1);
	//   34   62:aload_0         
	//   35   63:iload_1         
	//   36   64:iload_2         
	//   37   65:iconst_1        
	//   38   66:isub            
	//   39   67:ishr            
	//   40   68:iconst_1        
	//   41   69:iand            
	//   42   70:invokevirtual   #49  <Method void appendBit(int)>
				j--;
	//   43   73:iload_2         
	//   44   74:iconst_1        
	//   45   75:isub            
	//   46   76:istore_2        
			}
	//*  47   77:goto            20
	//   48   80:return          
	}

	public int at(int i)
	{
		if(i < 0 || i >= sizeInBits)
	//*   0    0:iload_1         
	//*   1    1:iflt            12
	//*   2    4:iload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #16  <Field int sizeInBits>
	//*   5    9:icmplt          39
			throw new IllegalArgumentException((new StringBuilder()).append("Bad index: ").append(i).toString());
	//    6   12:new             #30  <Class IllegalArgumentException>
	//    7   15:dup             
	//    8   16:new             #55  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #56  <Method void StringBuilder()>
	//   11   23:ldc1            #58  <String "Bad index: ">
	//   12   25:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   13   28:iload_1         
	//   14   29:invokevirtual   #65  <Method StringBuilder StringBuilder.append(int)>
	//   15   32:invokevirtual   #69  <Method String StringBuilder.toString()>
	//   16   35:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   17   38:athrow          
		else
			return (array[i >> 3] & 0xff) >> 7 - (i & 7) & 1;
	//   18   39:aload_0         
	//   19   40:getfield        #18  <Field byte[] array>
	//   20   43:iload_1         
	//   21   44:iconst_3        
	//   22   45:ishr            
	//   23   46:baload          
	//   24   47:sipush          255
	//   25   50:iand            
	//   26   51:bipush          7
	//   27   53:iload_1         
	//   28   54:bipush          7
	//   29   56:iand            
	//   30   57:isub            
	//   31   58:ishr            
	//   32   59:iconst_1        
	//   33   60:iand            
	//   34   61:ireturn         
	}

	public byte[] getArray()
	{
		return array;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field byte[] array>
	//    2    4:areturn         
	}

	public int size()
	{
		return sizeInBits;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int sizeInBits>
	//    2    4:ireturn         
	}

	public int sizeInBytes()
	{
		return sizeInBits + 7 >> 3;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field int sizeInBits>
	//    2    4:bipush          7
	//    3    6:iadd            
	//    4    7:iconst_3        
	//    5    8:ishr            
	//    6    9:ireturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer(sizeInBits);
	//    0    0:new             #74  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field int sizeInBits>
	//    4    8:invokespecial   #76  <Method void StringBuffer(int)>
	//    5   11:astore_2        
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		while(i < sizeInBits) 
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:getfield        #16  <Field int sizeInBits>
	//*  11   19:icmpge          73
		{
			if(at(i) == 0)
	//*  12   22:aload_0         
	//*  13   23:iload_1         
	//*  14   24:invokevirtual   #47  <Method int at(int)>
	//*  15   27:ifne            44
				stringbuffer.append('0');
	//   16   30:aload_2         
	//   17   31:bipush          48
	//   18   33:invokevirtual   #79  <Method StringBuffer StringBuffer.append(char)>
	//   19   36:pop             
			else
	//*  20   37:iload_1         
	//*  21   38:iconst_1        
	//*  22   39:iadd            
	//*  23   40:istore_1        
	//*  24   41:goto            14
			if(at(i) == 1)
	//*  25   44:aload_0         
	//*  26   45:iload_1         
	//*  27   46:invokevirtual   #47  <Method int at(int)>
	//*  28   49:iconst_1        
	//*  29   50:icmpne          63
				stringbuffer.append('1');
	//   30   53:aload_2         
	//   31   54:bipush          49
	//   32   56:invokevirtual   #79  <Method StringBuffer StringBuffer.append(char)>
	//   33   59:pop             
			else
	//*  34   60:goto            37
				throw new IllegalArgumentException("Byte isn't 0 or 1");
	//   35   63:new             #30  <Class IllegalArgumentException>
	//   36   66:dup             
	//   37   67:ldc1            #81  <String "Byte isn't 0 or 1">
	//   38   69:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//   39   72:athrow          
			i++;
		}
		return stringbuffer.toString();
	//   40   73:aload_2         
	//   41   74:invokevirtual   #82  <Method String StringBuffer.toString()>
	//   42   77:areturn         
	}

	public void xor(BitVector bitvector)
	{
		if(sizeInBits != bitvector.size())
	//*   0    0:aload_0         
	//*   1    1:getfield        #16  <Field int sizeInBits>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #43  <Method int size()>
	//*   4    8:icmpeq          21
			throw new IllegalArgumentException("BitVector sizes don't match");
	//    5   11:new             #30  <Class IllegalArgumentException>
	//    6   14:dup             
	//    7   15:ldc1            #85  <String "BitVector sizes don't match">
	//    8   17:invokespecial   #35  <Method void IllegalArgumentException(String)>
	//    9   20:athrow          
		int j = sizeInBits;
	//   10   21:aload_0         
	//   11   22:getfield        #16  <Field int sizeInBits>
	//   12   25:istore_3        
		for(int i = 0; i < j + 7 >> 3; i++)
	//*  13   26:iconst_0        
	//*  14   27:istore_2        
	//*  15   28:iload_2         
	//*  16   29:iload_3         
	//*  17   30:bipush          7
	//*  18   32:iadd            
	//*  19   33:iconst_3        
	//*  20   34:ishr            
	//*  21   35:icmpge          67
		{
			byte abyte0[] = array;
	//   22   38:aload_0         
	//   23   39:getfield        #18  <Field byte[] array>
	//   24   42:astore          4
			abyte0[i] = (byte)(abyte0[i] ^ bitvector.array[i]);
	//   25   44:aload           4
	//   26   46:iload_2         
	//   27   47:aload           4
	//   28   49:iload_2         
	//   29   50:baload          
	//   30   51:aload_1         
	//   31   52:getfield        #18  <Field byte[] array>
	//   32   55:iload_2         
	//   33   56:baload          
	//   34   57:ixor            
	//   35   58:int2byte        
	//   36   59:bastore         
		}

	//   37   60:iload_2         
	//   38   61:iconst_1        
	//   39   62:iadd            
	//   40   63:istore_2        
	//*  41   64:goto            28
	//   42   67:return          
	}

	private static final int DEFAULT_SIZE_IN_BYTES = 32;
	private byte array[];
	private int sizeInBits;
}
