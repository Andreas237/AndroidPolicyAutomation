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
		int k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		for(i--; k <= i;)
	//*   2    2:iload_1         
	//*   3    3:iconst_1        
	//*   4    4:isub            
	//*   5    5:istore_1        
	//*   6    6:iload_3         
	//*   7    7:iload_1         
	//*   8    8:icmpgt          58
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
	//*  26   35:goto            55
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
	//*  34   49:goto            55
				return l;
	//   35   52:iload           4
	//   36   54:ireturn         
		}

	//*  37   55:goto            6
		return ~k;
	//   38   58:iload_3         
	//   39   59:iconst_m1       
	//   40   60:ixor            
	//   41   61:ireturn         
	}

	static int binarySearch(long al[], int i, long l)
	{
		int j = 0;
	//    0    0:iconst_0        
	//    1    1:istore          4
		for(i--; j <= i;)
	//*   2    3:iload_1         
	//*   3    4:iconst_1        
	//*   4    5:isub            
	//*   5    6:istore_1        
	//*   6    7:iload           4
	//*   7    9:iload_1         
	//*   8   10:icmpgt          64
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
	//*  27   40:goto            61
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
	//*  36   55:goto            61
				return k;
	//   37   58:iload           5
	//   38   60:ireturn         
		}

	//*  39   61:goto            7
		return ~j;
	//   40   64:iload           4
	//   41   66:iconst_m1       
	//   42   67:ixor            
	//   43   68:ireturn         
	}

	public static boolean equal(Object obj, Object obj1)
	{
		return obj == obj1 || obj != null && obj.equals(obj1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:if_acmpeq       17
	//    3    5:aload_0         
	//    4    6:ifnull          19
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #31  <Method boolean Object.equals(Object)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public static int idealByteArraySize(int i)
	{
		for(int j = 4; j < 32; j++)
	//*   0    0:iconst_4        
	//*   1    1:istore_1        
	//*   2    2:iload_1         
	//*   3    3:bipush          32
	//*   4    5:icmpge          32
			if(i <= (1 << j) - 12)
	//*   5    8:iload_0         
	//*   6    9:iconst_1        
	//*   7   10:iload_1         
	//*   8   11:ishl            
	//*   9   12:bipush          12
	//*  10   14:isub            
	//*  11   15:icmpgt          25
				return (1 << j) - 12;
	//   12   18:iconst_1        
	//   13   19:iload_1         
	//   14   20:ishl            
	//   15   21:bipush          12
	//   16   23:isub            
	//   17   24:ireturn         

	//   18   25:iload_1         
	//   19   26:iconst_1        
	//   20   27:iadd            
	//   21   28:istore_1        
	//*  22   29:goto            2
		return i;
	//   23   32:iload_0         
	//   24   33:ireturn         
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
