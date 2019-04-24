// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.qrcode;


public final class BitArray
{

	public BitArray(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		if(i < 1)
	//*   2    4:iload_1         
	//*   3    5:iconst_1        
	//*   4    6:icmpge          19
		{
			throw new IllegalArgumentException("size must be at least 1");
	//    5    9:new             #15  <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc1            #17  <String "size must be at least 1">
	//    8   15:invokespecial   #20  <Method void IllegalArgumentException(String)>
	//    9   18:athrow          
		} else
		{
			size = i;
	//   10   19:aload_0         
	//   11   20:iload_1         
	//   12   21:putfield        #22  <Field int size>
			bits = makeArray(i);
	//   13   24:aload_0         
	//   14   25:iload_1         
	//   15   26:invokestatic    #26  <Method int[] makeArray(int)>
	//   16   29:putfield        #28  <Field int[] bits>
			return;
	//   17   32:return          
		}
	}

	private static int[] makeArray(int i)
	{
		int k = i >> 5;
	//    0    0:iload_0         
	//    1    1:iconst_5        
	//    2    2:ishr            
	//    3    3:istore_2        
		int j = k;
	//    4    4:iload_2         
	//    5    5:istore_1        
		if((i & 0x1f) != 0)
	//*   6    6:iload_0         
	//*   7    7:bipush          31
	//*   8    9:iand            
	//*   9   10:ifeq            17
			j = k + 1;
	//   10   13:iload_2         
	//   11   14:iconst_1        
	//   12   15:iadd            
	//   13   16:istore_1        
		return new int[j];
	//   14   17:iload_1         
	//   15   18:newarray        int[]
	//   16   20:areturn         
	}

	public void clear()
	{
		int j = bits.length;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int[] bits>
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
	//   10   14:getfield        #28  <Field int[] bits>
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

	public void flip(int i)
	{
		int ai[] = bits;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int[] bits>
	//    2    4:astore_3        
		int j = i >> 5;
	//    3    5:iload_1         
	//    4    6:iconst_5        
	//    5    7:ishr            
	//    6    8:istore_2        
		ai[j] = ai[j] ^ 1 << (i & 0x1f);
	//    7    9:aload_3         
	//    8   10:iload_2         
	//    9   11:aload_3         
	//   10   12:iload_2         
	//   11   13:iaload          
	//   12   14:iconst_1        
	//   13   15:iload_1         
	//   14   16:bipush          31
	//   15   18:iand            
	//   16   19:ishl            
	//   17   20:ixor            
	//   18   21:iastore         
	//   19   22:return          
	}

	public boolean get(int i)
	{
		return (bits[i >> 5] & 1 << (i & 0x1f)) != 0;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int[] bits>
	//    2    4:iload_1         
	//    3    5:iconst_5        
	//    4    6:ishr            
	//    5    7:iaload          
	//    6    8:iconst_1        
	//    7    9:iload_1         
	//    8   10:bipush          31
	//    9   12:iand            
	//   10   13:ishl            
	//   11   14:iand            
	//   12   15:ifeq            20
	//   13   18:iconst_1        
	//   14   19:ireturn         
	//   15   20:iconst_0        
	//   16   21:ireturn         
	}

	public int[] getBitArray()
	{
		return bits;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int[] bits>
	//    2    4:areturn         
	}

	public int getSize()
	{
		return size;
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field int size>
	//    2    4:ireturn         
	}

	public boolean isRange(int i, int j, boolean flag)
	{
		if(j < i)
	//*   0    0:iload_2         
	//*   1    1:iload_1         
	//*   2    2:icmpge          13
			throw new IllegalArgumentException();
	//    3    5:new             #15  <Class IllegalArgumentException>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void IllegalArgumentException()>
	//    6   12:athrow          
		if(j != i) goto _L2; else goto _L1
	//    7   13:iload_2         
	//    8   14:iload_1         
	//    9   15:icmpne          20
_L1:
		return true;
	//   10   18:iconst_1        
	//   11   19:ireturn         
_L2:
		int l;
		int k1;
		int l1;
		int i2;
		l1 = j - 1;
	//   12   20:iload_2         
	//   13   21:iconst_1        
	//   14   22:isub            
	//   15   23:istore          9
		k1 = i >> 5;
	//   16   25:iload_1         
	//   17   26:iconst_5        
	//   18   27:ishr            
	//   19   28:istore          8
		i2 = l1 >> 5;
	//   20   30:iload           9
	//   21   32:iconst_5        
	//   22   33:ishr            
	//   23   34:istore          10
		l = k1;
	//   24   36:iload           8
	//   25   38:istore          5
_L8:
		int i1;
		if(l > i2)
			continue; /* Loop/switch isn't completed */
	//   26   40:iload           5
	//   27   42:iload           10
	//   28   44:icmpgt          18
		if(l > k1)
	//*  29   47:iload           5
	//*  30   49:iload           8
	//*  31   51:icmple          107
			j = 0;
	//   32   54:iconst_0        
	//   33   55:istore_2        
		else
	//*  34   56:iload           5
	//*  35   58:iload           10
	//*  36   60:icmpge          115
	//*  37   63:bipush          31
	//*  38   65:istore          6
	//*  39   67:iload_2         
	//*  40   68:ifne            125
	//*  41   71:iload           6
	//*  42   73:bipush          31
	//*  43   75:icmpne          125
	//*  44   78:iconst_m1       
	//*  45   79:istore_2        
	//*  46   80:aload_0         
	//*  47   81:getfield        #28  <Field int[] bits>
	//*  48   84:iload           5
	//*  49   86:iaload          
	//*  50   87:istore          6
	//*  51   89:iload_3         
	//*  52   90:ifeq            159
	//*  53   93:iload_2         
	//*  54   94:istore          4
	//*  55   96:iload           6
	//*  56   98:iload_2         
	//*  57   99:iand            
	//*  58  100:iload           4
	//*  59  102:icmpeq          165
	//*  60  105:iconst_0        
	//*  61  106:ireturn         
			j = i & 0x1f;
	//   62  107:iload_1         
	//   63  108:bipush          31
	//   64  110:iand            
	//   65  111:istore_2        
		if(l < i2)
			i1 = 31;
		else
	//*  66  112:goto            56
			i1 = l1 & 0x1f;
	//   67  115:iload           9
	//   68  117:bipush          31
	//   69  119:iand            
	//   70  120:istore          6
		if(j != 0 || i1 != 31) goto _L4; else goto _L3
_L3:
		j = -1;
_L6:
		i1 = bits[l];
		int k;
		int j1;
		if(flag)
			k = j;
		else
	//*  71  122:goto            67
	//*  72  125:iconst_0        
	//*  73  126:istore          4
	//*  74  128:iload_2         
	//*  75  129:istore          7
	//*  76  131:iload           4
	//*  77  133:istore_2        
	//*  78  134:iload           7
	//*  79  136:iload           6
	//*  80  138:icmpgt          80
	//*  81  141:iload           4
	//*  82  143:iconst_1        
	//*  83  144:iload           7
	//*  84  146:ishl            
	//*  85  147:ior             
	//*  86  148:istore          4
	//*  87  150:iload           7
	//*  88  152:iconst_1        
	//*  89  153:iadd            
	//*  90  154:istore          7
	//*  91  156:goto            131
			k = 0;
	//   92  159:iconst_0        
	//   93  160:istore          4
		if((i1 & j) != k)
			return false;
		break MISSING_BLOCK_LABEL_165;
	//   94  162:goto            96
_L4:
		k = 0;
		j1 = j;
		do
		{
			j = k;
			if(j1 > i1)
				break;
			k |= 1 << j1;
			j1++;
		} while(true);
		if(true) goto _L6; else goto _L5
_L5:
		l++;
	//   95  165:iload           5
	//   96  167:iconst_1        
	//   97  168:iadd            
	//   98  169:istore          5
		if(true) goto _L8; else goto _L7
	//   99  171:goto            40
_L7:
		if(true) goto _L1; else goto _L9
_L9:
	}

	public void reverse()
	{
		int ai[] = new int[bits.length];
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int[] bits>
	//    2    4:arraylength     
	//    3    5:newarray        int[]
	//    4    7:astore          4
		int j = size;
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field int size>
	//    7   13:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          59
			if(get(j - i - 1))
	//*  13   21:aload_0         
	//*  14   22:iload_2         
	//*  15   23:iload_1         
	//*  16   24:isub            
	//*  17   25:iconst_1        
	//*  18   26:isub            
	//*  19   27:invokevirtual   #43  <Method boolean get(int)>
	//*  20   30:ifeq            52
			{
				int k = i >> 5;
	//   21   33:iload_1         
	//   22   34:iconst_5        
	//   23   35:ishr            
	//   24   36:istore_3        
				ai[k] = ai[k] | 1 << (i & 0x1f);
	//   25   37:aload           4
	//   26   39:iload_3         
	//   27   40:aload           4
	//   28   42:iload_3         
	//   29   43:iaload          
	//   30   44:iconst_1        
	//   31   45:iload_1         
	//   32   46:bipush          31
	//   33   48:iand            
	//   34   49:ishl            
	//   35   50:ior             
	//   36   51:iastore         
			}

	//   37   52:iload_1         
	//   38   53:iconst_1        
	//   39   54:iadd            
	//   40   55:istore_1        
	//*  41   56:goto            16
		bits = ai;
	//   42   59:aload_0         
	//   43   60:aload           4
	//   44   62:putfield        #28  <Field int[] bits>
	//   45   65:return          
	}

	public void set(int i)
	{
		int ai[] = bits;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int[] bits>
	//    2    4:astore_3        
		int j = i >> 5;
	//    3    5:iload_1         
	//    4    6:iconst_5        
	//    5    7:ishr            
	//    6    8:istore_2        
		ai[j] = ai[j] | 1 << (i & 0x1f);
	//    7    9:aload_3         
	//    8   10:iload_2         
	//    9   11:aload_3         
	//   10   12:iload_2         
	//   11   13:iaload          
	//   12   14:iconst_1        
	//   13   15:iload_1         
	//   14   16:bipush          31
	//   15   18:iand            
	//   16   19:ishl            
	//   17   20:ior             
	//   18   21:iastore         
	//   19   22:return          
	}

	public void setBulk(int i, int j)
	{
		bits[i >> 5] = j;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int[] bits>
	//    2    4:iload_1         
	//    3    5:iconst_5        
	//    4    6:ishr            
	//    5    7:iload_2         
	//    6    8:iastore         
	//    7    9:return          
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer(size);
	//    0    0:new             #50  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field int size>
	//    4    8:invokespecial   #52  <Method void StringBuffer(int)>
	//    5   11:astore_3        
		int i = 0;
	//    6   12:iconst_0        
	//    7   13:istore_2        
		while(i < size) 
	//*   8   14:iload_2         
	//*   9   15:aload_0         
	//*  10   16:getfield        #22  <Field int size>
	//*  11   19:icmpge          66
		{
			if((i & 7) == 0)
	//*  12   22:iload_2         
	//*  13   23:bipush          7
	//*  14   25:iand            
	//*  15   26:ifne            36
				stringbuffer.append(' ');
	//   16   29:aload_3         
	//   17   30:bipush          32
	//   18   32:invokevirtual   #56  <Method StringBuffer StringBuffer.append(char)>
	//   19   35:pop             
			char c;
			if(get(i))
	//*  20   36:aload_0         
	//*  21   37:iload_2         
	//*  22   38:invokevirtual   #43  <Method boolean get(int)>
	//*  23   41:ifeq            60
				c = 'X';
	//   24   44:bipush          88
	//   25   46:istore_1        
			else
	//*  26   47:aload_3         
	//*  27   48:iload_1         
	//*  28   49:invokevirtual   #56  <Method StringBuffer StringBuffer.append(char)>
	//*  29   52:pop             
	//*  30   53:iload_2         
	//*  31   54:iconst_1        
	//*  32   55:iadd            
	//*  33   56:istore_2        
	//*  34   57:goto            14
				c = '.';
	//   35   60:bipush          46
	//   36   62:istore_1        
			stringbuffer.append(c);
			i++;
		}
	//*  37   63:goto            47
		return stringbuffer.toString();
	//   38   66:aload_3         
	//   39   67:invokevirtual   #58  <Method String StringBuffer.toString()>
	//   40   70:areturn         
	}

	public int bits[];
	public final int size;
}
