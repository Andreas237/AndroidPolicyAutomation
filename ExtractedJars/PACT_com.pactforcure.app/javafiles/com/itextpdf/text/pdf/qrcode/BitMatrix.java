// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


// Referenced classes of package com.itextpdf.text.pdf.qrcode:
//			BitArray

public final class BitMatrix
{

	public BitMatrix(int i)
	{
		this(i, i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_1         
	//    3    3:invokespecial   #15  <Method void BitMatrix(int, int)>
	//    4    6:return          
	}

	public BitMatrix(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		if(i < 1 || j < 1)
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmplt          14
	//*   5    9:iload_2         
	//*   6   10:iconst_1        
	//*   7   11:icmpge          24
			throw new IllegalArgumentException("Both dimensions must be greater than 0");
	//    8   14:new             #21  <Class IllegalArgumentException>
	//    9   17:dup             
	//   10   18:ldc1            #23  <String "Both dimensions must be greater than 0">
	//   11   20:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//   12   23:athrow          
		width = i;
	//   13   24:aload_0         
	//   14   25:iload_1         
	//   15   26:putfield        #28  <Field int width>
		height = j;
	//   16   29:aload_0         
	//   17   30:iload_2         
	//   18   31:putfield        #30  <Field int height>
		int l = i >> 5;
	//   19   34:iload_1         
	//   20   35:iconst_5        
	//   21   36:ishr            
	//   22   37:istore          4
		int k = l;
	//   23   39:iload           4
	//   24   41:istore_3        
		if((i & 0x1f) != 0)
	//*  25   42:iload_1         
	//*  26   43:bipush          31
	//*  27   45:iand            
	//*  28   46:ifeq            54
			k = l + 1;
	//   29   49:iload           4
	//   30   51:iconst_1        
	//   31   52:iadd            
	//   32   53:istore_3        
		rowSize = k;
	//   33   54:aload_0         
	//   34   55:iload_3         
	//   35   56:putfield        #32  <Field int rowSize>
		bits = new int[k * j];
	//   36   59:aload_0         
	//   37   60:iload_3         
	//   38   61:iload_2         
	//   39   62:imul            
	//   40   63:newarray        int[]
	//   41   65:putfield        #34  <Field int[] bits>
	//   42   68:return          
	}

	public void clear()
	{
		int j = bits.length;
	//    0    0:aload_0         
	//    1    1:getfield        #34  <Field int[] bits>
	//    2    4:arraylength     
	//    3    5:istore_2        
		for(int i = 0; i < j; i++)
	//*   4    6:iconst_0        
	//*   5    7:istore_1        
	//*   6    8:iload_1         
	//*   7    9:iload_2         
	//*   8   10:icmpge          27
			bits[i] = 0;
	//    9   13:aload_0         
	//   10   14:getfield        #34  <Field int[] bits>
	//   11   17:iload_1         
	//   12   18:iconst_0        
	//   13   19:iastore         

	//   14   20:iload_1         
	//   15   21:iconst_1        
	//   16   22:iadd            
	//   17   23:istore_1        
	//*  18   24:goto            8
	//   19   27:return          
	}

	public void flip(int i, int j)
	{
		j = rowSize * j + (i >> 5);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int rowSize>
	//    2    4:iload_2         
	//    3    5:imul            
	//    4    6:iload_1         
	//    5    7:iconst_5        
	//    6    8:ishr            
	//    7    9:iadd            
	//    8   10:istore_2        
		int ai[] = bits;
	//    9   11:aload_0         
	//   10   12:getfield        #34  <Field int[] bits>
	//   11   15:astore_3        
		ai[j] = ai[j] ^ 1 << (i & 0x1f);
	//   12   16:aload_3         
	//   13   17:iload_2         
	//   14   18:aload_3         
	//   15   19:iload_2         
	//   16   20:iaload          
	//   17   21:iconst_1        
	//   18   22:iload_1         
	//   19   23:bipush          31
	//   20   25:iand            
	//   21   26:ishl            
	//   22   27:ixor            
	//   23   28:iastore         
	//   24   29:return          
	}

	public boolean get(int i, int j)
	{
		int k = rowSize;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int rowSize>
	//    2    4:istore_3        
		return (bits[k * j + (i >> 5)] >>> (i & 0x1f) & 1) != 0;
	//    3    5:aload_0         
	//    4    6:getfield        #34  <Field int[] bits>
	//    5    9:iload_3         
	//    6   10:iload_2         
	//    7   11:imul            
	//    8   12:iload_1         
	//    9   13:iconst_5        
	//   10   14:ishr            
	//   11   15:iadd            
	//   12   16:iaload          
	//   13   17:iload_1         
	//   14   18:bipush          31
	//   15   20:iand            
	//   16   21:iushr           
	//   17   22:iconst_1        
	//   18   23:iand            
	//   19   24:ifeq            29
	//   20   27:iconst_1        
	//   21   28:ireturn         
	//   22   29:iconst_0        
	//   23   30:ireturn         
	}

	public int getDimension()
	{
		if(width != height)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int width>
	//*   2    4:aload_0         
	//*   3    5:getfield        #30  <Field int height>
	//*   4    8:icmpeq          21
			throw new RuntimeException("Can't call getDimension() on a non-square matrix");
	//    5   11:new             #42  <Class RuntimeException>
	//    6   14:dup             
	//    7   15:ldc1            #44  <String "Can't call getDimension() on a non-square matrix">
	//    8   17:invokespecial   #45  <Method void RuntimeException(String)>
	//    9   20:athrow          
		else
			return width;
	//   10   21:aload_0         
	//   11   22:getfield        #28  <Field int width>
	//   12   25:ireturn         
	}

	public int getHeight()
	{
		return height;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int height>
	//    2    4:ireturn         
	}

	public BitArray getRow(int i, BitArray bitarray)
	{
		BitArray bitarray1;
label0:
		{
			if(bitarray != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          18
			{
				bitarray1 = bitarray;
	//    2    4:aload_2         
	//    3    5:astore          5
				if(bitarray.getSize() >= width)
					break label0;
	//    4    7:aload_2         
	//    5    8:invokevirtual   #53  <Method int BitArray.getSize()>
	//    6   11:aload_0         
	//    7   12:getfield        #28  <Field int width>
	//    8   15:icmpge          31
			}
			bitarray1 = new BitArray(width);
	//    9   18:new             #50  <Class BitArray>
	//   10   21:dup             
	//   11   22:aload_0         
	//   12   23:getfield        #28  <Field int width>
	//   13   26:invokespecial   #55  <Method void BitArray(int)>
	//   14   29:astore          5
		}
		int k = rowSize;
	//   15   31:aload_0         
	//   16   32:getfield        #32  <Field int rowSize>
	//   17   35:istore          4
		for(int j = 0; j < rowSize; j++)
	//*  18   37:iconst_0        
	//*  19   38:istore_3        
	//*  20   39:iload_3         
	//*  21   40:aload_0         
	//*  22   41:getfield        #32  <Field int rowSize>
	//*  23   44:icmpge          73
			bitarray1.setBulk(j << 5, bits[i * k + j]);
	//   24   47:aload           5
	//   25   49:iload_3         
	//   26   50:iconst_5        
	//   27   51:ishl            
	//   28   52:aload_0         
	//   29   53:getfield        #34  <Field int[] bits>
	//   30   56:iload_1         
	//   31   57:iload           4
	//   32   59:imul            
	//   33   60:iload_3         
	//   34   61:iadd            
	//   35   62:iaload          
	//   36   63:invokevirtual   #58  <Method void BitArray.setBulk(int, int)>

	//   37   66:iload_3         
	//   38   67:iconst_1        
	//   39   68:iadd            
	//   40   69:istore_3        
	//*  41   70:goto            39
		return bitarray1;
	//   42   73:aload           5
	//   43   75:areturn         
	}

	public int getWidth()
	{
		return width;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int width>
	//    2    4:ireturn         
	}

	public void set(int i, int j)
	{
		j = rowSize * j + (i >> 5);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field int rowSize>
	//    2    4:iload_2         
	//    3    5:imul            
	//    4    6:iload_1         
	//    5    7:iconst_5        
	//    6    8:ishr            
	//    7    9:iadd            
	//    8   10:istore_2        
		int ai[] = bits;
	//    9   11:aload_0         
	//   10   12:getfield        #34  <Field int[] bits>
	//   11   15:astore_3        
		ai[j] = ai[j] | 1 << (i & 0x1f);
	//   12   16:aload_3         
	//   13   17:iload_2         
	//   14   18:aload_3         
	//   15   19:iload_2         
	//   16   20:iaload          
	//   17   21:iconst_1        
	//   18   22:iload_1         
	//   19   23:bipush          31
	//   20   25:iand            
	//   21   26:ishl            
	//   22   27:ior             
	//   23   28:iastore         
	//   24   29:return          
	}

	public void setRegion(int i, int j, int k, int l)
	{
		if(j < 0 || i < 0)
	//*   0    0:iload_2         
	//*   1    1:iflt            8
	//*   2    4:iload_1         
	//*   3    5:ifge            18
			throw new IllegalArgumentException("Left and top must be nonnegative");
	//    4    8:new             #21  <Class IllegalArgumentException>
	//    5   11:dup             
	//    6   12:ldc1            #64  <String "Left and top must be nonnegative">
	//    7   14:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//    8   17:athrow          
		if(l < 1 || k < 1)
	//*   9   18:iload           4
	//*  10   20:iconst_1        
	//*  11   21:icmplt          29
	//*  12   24:iload_3         
	//*  13   25:iconst_1        
	//*  14   26:icmpge          39
			throw new IllegalArgumentException("Height and width must be at least 1");
	//   15   29:new             #21  <Class IllegalArgumentException>
	//   16   32:dup             
	//   17   33:ldc1            #66  <String "Height and width must be at least 1">
	//   18   35:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//   19   38:athrow          
		int i1 = i + k;
	//   20   39:iload_1         
	//   21   40:iload_3         
	//   22   41:iadd            
	//   23   42:istore          5
		l = j + l;
	//   24   44:iload_2         
	//   25   45:iload           4
	//   26   47:iadd            
	//   27   48:istore          4
		if(l > height || i1 > width)
	//*  28   50:iload           4
	//*  29   52:aload_0         
	//*  30   53:getfield        #30  <Field int height>
	//*  31   56:icmpgt          68
	//*  32   59:iload           5
	//*  33   61:aload_0         
	//*  34   62:getfield        #28  <Field int width>
	//*  35   65:icmple          78
			throw new IllegalArgumentException("The region must fit inside the matrix");
	//   36   68:new             #21  <Class IllegalArgumentException>
	//   37   71:dup             
	//   38   72:ldc1            #68  <String "The region must fit inside the matrix">
	//   39   74:invokespecial   #26  <Method void IllegalArgumentException(String)>
	//   40   77:athrow          
		for(; j < l; j++)
	//*  41   78:iload_2         
	//*  42   79:iload           4
	//*  43   81:icmpge          145
		{
			int j1 = rowSize;
	//   44   84:aload_0         
	//   45   85:getfield        #32  <Field int rowSize>
	//   46   88:istore          6
			for(k = i; k < i1; k++)
	//*  47   90:iload_1         
	//*  48   91:istore_3        
	//*  49   92:iload_3         
	//*  50   93:iload           5
	//*  51   95:icmpge          138
			{
				int ai[] = bits;
	//   52   98:aload_0         
	//   53   99:getfield        #34  <Field int[] bits>
	//   54  102:astore          8
				int k1 = (k >> 5) + j * j1;
	//   55  104:iload_3         
	//   56  105:iconst_5        
	//   57  106:ishr            
	//   58  107:iload_2         
	//   59  108:iload           6
	//   60  110:imul            
	//   61  111:iadd            
	//   62  112:istore          7
				ai[k1] = ai[k1] | 1 << (k & 0x1f);
	//   63  114:aload           8
	//   64  116:iload           7
	//   65  118:aload           8
	//   66  120:iload           7
	//   67  122:iaload          
	//   68  123:iconst_1        
	//   69  124:iload_3         
	//   70  125:bipush          31
	//   71  127:iand            
	//   72  128:ishl            
	//   73  129:ior             
	//   74  130:iastore         
			}

	//   75  131:iload_3         
	//   76  132:iconst_1        
	//   77  133:iadd            
	//   78  134:istore_3        
		}

	//   79  135:goto            92
	//   80  138:iload_2         
	//   81  139:iconst_1        
	//   82  140:iadd            
	//   83  141:istore_2        
	//*  84  142:goto            78
	//   85  145:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer(height * (width + 1));
	//    0    0:new             #72  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field int height>
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field int width>
	//    6   12:iconst_1        
	//    7   13:iadd            
	//    8   14:imul            
	//    9   15:invokespecial   #73  <Method void StringBuffer(int)>
	//   10   18:astore          4
		for(int i = 0; i < height; i++)
	//*  11   20:iconst_0        
	//*  12   21:istore_1        
	//*  13   22:iload_1         
	//*  14   23:aload_0         
	//*  15   24:getfield        #30  <Field int height>
	//*  16   27:icmpge          87
		{
			int j = 0;
	//   17   30:iconst_0        
	//   18   31:istore_2        
			while(j < width) 
	//*  19   32:iload_2         
	//*  20   33:aload_0         
	//*  21   34:getfield        #28  <Field int width>
	//*  22   37:icmpge          72
			{
				String s;
				if(get(j, i))
	//*  23   40:aload_0         
	//*  24   41:iload_2         
	//*  25   42:iload_1         
	//*  26   43:invokevirtual   #75  <Method boolean get(int, int)>
	//*  27   46:ifeq            66
					s = "X ";
	//   28   49:ldc1            #77  <String "X ">
	//   29   51:astore_3        
				else
	//*  30   52:aload           4
	//*  31   54:aload_3         
	//*  32   55:invokevirtual   #81  <Method StringBuffer StringBuffer.append(String)>
	//*  33   58:pop             
	//*  34   59:iload_2         
	//*  35   60:iconst_1        
	//*  36   61:iadd            
	//*  37   62:istore_2        
	//*  38   63:goto            32
					s = "  ";
	//   39   66:ldc1            #83  <String "  ">
	//   40   68:astore_3        
				stringbuffer.append(s);
				j++;
			}
	//*  41   69:goto            52
			stringbuffer.append('\n');
	//   42   72:aload           4
	//   43   74:bipush          10
	//   44   76:invokevirtual   #86  <Method StringBuffer StringBuffer.append(char)>
	//   45   79:pop             
		}

	//   46   80:iload_1         
	//   47   81:iconst_1        
	//   48   82:iadd            
	//   49   83:istore_1        
	//*  50   84:goto            22
		return stringbuffer.toString();
	//   51   87:aload           4
	//   52   89:invokevirtual   #88  <Method String StringBuffer.toString()>
	//   53   92:areturn         
	}

	public final int bits[];
	public final int height;
	public final int rowSize;
	public final int width;
}
