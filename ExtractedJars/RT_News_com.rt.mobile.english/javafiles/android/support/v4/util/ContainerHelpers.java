// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.util;


class ContainerHelpers
{

	ContainerHelpers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}

	static int binarySearch(int ai[], int i, int j)
	{
		i--;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:istore_1        
		int k;
		for(k = 0; k <= i;)
	//*   4    4:iconst_0        
	//*   5    5:istore_3        
	//*   6    6:iload_3         
	//*   7    7:iload_1         
	//*   8    8:icmpgt          55
		{
			int l = k + i >>> 1;
	//    9   11:iload_3         
	//   10   12:iload_1         
	//   11   13:iadd            
	//   12   14:iconst_1        
	//   13   15:iushr           
	//   14   16:istore          4
			int i1 = ai[l];
	//   15   18:aload_0         
	//   16   19:iload           4
	//   17   21:iaload          
	//   18   22:istore          5
			if(i1 < j)
	//*  19   24:iload           5
	//*  20   26:iload_2         
	//*  21   27:icmpge          38
				k = l + 1;
	//   22   30:iload           4
	//   23   32:iconst_1        
	//   24   33:iadd            
	//   25   34:istore_3        
			else
	//*  26   35:goto            6
			if(i1 > j)
	//*  27   38:iload           5
	//*  28   40:iload_2         
	//*  29   41:icmple          52
				i = l - 1;
	//   30   44:iload           4
	//   31   46:iconst_1        
	//   32   47:isub            
	//   33   48:istore_1        
			else
	//*  34   49:goto            6
				return l;
	//   35   52:iload           4
	//   36   54:ireturn         
		}

		return ~k;
	//   37   55:iload_3         
	//   38   56:iconst_m1       
	//   39   57:ixor            
	//   40   58:ireturn         
	}

	static int binarySearch(long al[], int i, long l)
	{
		i--;
	//    0    0:iload_1         
	//    1    1:iconst_1        
	//    2    2:isub            
	//    3    3:istore_1        
		int j;
		for(j = 0; j <= i;)
	//*   4    4:iconst_0        
	//*   5    5:istore          4
	//*   6    7:iload           4
	//*   7    9:iload_1         
	//*   8   10:icmpgt          61
		{
			int k = j + i >>> 1;
	//    9   13:iload           4
	//   10   15:iload_1         
	//   11   16:iadd            
	//   12   17:iconst_1        
	//   13   18:iushr           
	//   14   19:istore          5
			long l1 = al[k];
	//   15   21:aload_0         
	//   16   22:iload           5
	//   17   24:laload          
	//   18   25:lstore          6
			if(l1 < l)
	//*  19   27:lload           6
	//*  20   29:lload_2         
	//*  21   30:lcmp            
	//*  22   31:ifge            43
				j = k + 1;
	//   23   34:iload           5
	//   24   36:iconst_1        
	//   25   37:iadd            
	//   26   38:istore          4
			else
	//*  27   40:goto            7
			if(l1 > l)
	//*  28   43:lload           6
	//*  29   45:lload_2         
	//*  30   46:lcmp            
	//*  31   47:ifle            58
				i = k - 1;
	//   32   50:iload           5
	//   33   52:iconst_1        
	//   34   53:isub            
	//   35   54:istore_1        
			else
	//*  36   55:goto            7
				return k;
	//   37   58:iload           5
	//   38   60:ireturn         
		}

		return ~j;
	//   39   61:iload           4
	//   40   63:iconst_m1       
	//   41   64:ixor            
	//   42   65:ireturn         
	}

	public static boolean equal(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       22
	//    3    5:aload_0         
	//    4    6:ifnull          20
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//    8   14:ifeq            20
	//    9   17:goto            22
	//   10   20:iconst_0        
	//   11   21:ireturn         
	//   12   22:iconst_1        
	//   13   23:ireturn         
	}

	public static int idealByteArraySize(int i)
	{
		for(int j = 4; j < 32; j++)
	//*   0    0:iconst_4        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          32
	//*   4    5:icmpge          29
		{
			int k = (1 << j) - 12;
	//    5    8:iconst_1        
	//    6    9:iload_1         
	//    7   10:ishl            
	//    8   11:bipush          12
	//    9   13:isub            
	//   10   14:istore_2        
			if(i <= k)
	//*  11   15:iload_0         
	//*  12   16:iload_2         
	//*  13   17:icmpgt          22
				return k;
	//   14   20:iload_2         
	//   15   21:ireturn         
		}

	//   16   22:iload_1         
	//   17   23:iconst_1        
	//   18   24:iadd            
	//   19   25:istore_1        
	//*  20   26:goto            2
		return i;
	//   21   29:iload_0         
	//   22   30:ireturn         
	}

	public static int idealIntArraySize(int i)
	{
		return idealByteArraySize(i * 4) / 4;
	//    0    0:iload_0         
	//    1    1:iconst_4        
	//    2    2:imul            
	//    3    3:invokestatic    #36  <Method int idealByteArraySize(int)>
	//    4    6:iconst_4        
	//    5    7:idiv            
	//    6    8:ireturn         
	}

	public static int idealLongArraySize(int i)
	{
		return idealByteArraySize(i * 8) / 8;
	//    0    0:iload_0         
	//    1    1:bipush          8
	//    2    3:imul            
	//    3    4:invokestatic    #36  <Method int idealByteArraySize(int)>
	//    4    7:bipush          8
	//    5    9:idiv            
	//    6   10:ireturn         
	}

	static final int EMPTY_INTS[] = new int[0];
	static final long EMPTY_LONGS[] = new long[0];
	static final Object EMPTY_OBJECTS[] = new Object[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        int[]
	//    2    3:putstatic       #14  <Field int[] EMPTY_INTS>
	//    3    6:iconst_0        
	//    4    7:newarray        long[]
	//    5    9:putstatic       #16  <Field long[] EMPTY_LONGS>
	//    6   12:iconst_0        
	//    7   13:anewarray       Object[]
	//    8   16:putstatic       #18  <Field Object[] EMPTY_OBJECTS>
	//*   9   19:return          
	}
}
