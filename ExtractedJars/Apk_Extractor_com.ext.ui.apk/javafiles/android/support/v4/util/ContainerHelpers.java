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
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore_3        
		int l = i - 1;
	//    2    2:iload_1         
	//    3    3:iconst_1        
	//    4    4:isub            
	//    5    5:istore          4
		i = ((int) (flag));
	//    6    7:iload_3         
	//    7    8:istore_1        
		for(int k = l; i <= k;)
	//*   8    9:iload           4
	//*   9   11:istore_3        
	//*  10   12:iload_1         
	//*  11   13:iload_3         
	//*  12   14:icmpgt          61
		{
			int i1 = i + k >>> 1;
	//   13   17:iload_1         
	//   14   18:iload_3         
	//   15   19:iadd            
	//   16   20:iconst_1        
	//   17   21:iushr           
	//   18   22:istore          4
			int j1 = ai[i1];
	//   19   24:aload_0         
	//   20   25:iload           4
	//   21   27:iaload          
	//   22   28:istore          5
			if(j1 < j)
	//*  23   30:iload           5
	//*  24   32:iload_2         
	//*  25   33:icmpge          44
				i = i1 + 1;
	//   26   36:iload           4
	//   27   38:iconst_1        
	//   28   39:iadd            
	//   29   40:istore_1        
			else
	//*  30   41:goto            12
			if(j1 > j)
	//*  31   44:iload           5
	//*  32   46:iload_2         
	//*  33   47:icmple          58
				k = i1 - 1;
	//   34   50:iload           4
	//   35   52:iconst_1        
	//   36   53:isub            
	//   37   54:istore_3        
			else
	//*  38   55:goto            12
				return i1;
	//   39   58:iload           4
	//   40   60:ireturn         
		}

		return ~i;
	//   41   61:iload_1         
	//   42   62:iconst_m1       
	//   43   63:ixor            
	//   44   64:ireturn         
	}

	static int binarySearch(long al[], int i, long l)
	{
		boolean flag = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int k = i - 1;
	//    2    3:iload_1         
	//    3    4:iconst_1        
	//    4    5:isub            
	//    5    6:istore          5
		i = ((int) (flag));
	//    6    8:iload           4
	//    7   10:istore_1        
		for(int j = k; i <= j;)
	//*   8   11:iload           5
	//*   9   13:istore          4
	//*  10   15:iload_1         
	//*  11   16:iload           4
	//*  12   18:icmpgt          69
		{
			int i1 = i + j >>> 1;
	//   13   21:iload_1         
	//   14   22:iload           4
	//   15   24:iadd            
	//   16   25:iconst_1        
	//   17   26:iushr           
	//   18   27:istore          5
			long l1 = al[i1];
	//   19   29:aload_0         
	//   20   30:iload           5
	//   21   32:laload          
	//   22   33:lstore          6
			if(l1 < l)
	//*  23   35:lload           6
	//*  24   37:lload_2         
	//*  25   38:lcmp            
	//*  26   39:ifge            50
				i = i1 + 1;
	//   27   42:iload           5
	//   28   44:iconst_1        
	//   29   45:iadd            
	//   30   46:istore_1        
			else
	//*  31   47:goto            15
			if(l1 > l)
	//*  32   50:lload           6
	//*  33   52:lload_2         
	//*  34   53:lcmp            
	//*  35   54:ifle            66
				j = i1 - 1;
	//   36   57:iload           5
	//   37   59:iconst_1        
	//   38   60:isub            
	//   39   61:istore          4
			else
	//*  40   63:goto            15
				return i1;
	//   41   66:iload           5
	//   42   68:ireturn         
		}

		return ~i;
	//   43   69:iload_1         
	//   44   70:iconst_m1       
	//   45   71:ixor            
	//   46   72:ireturn         
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
		int j = 4;
	//    0    0:iconst_4        
	//    1    1:istore_1        
		do
		{
label0:
			{
				int k = i;
	//    2    2:iload_0         
	//    3    3:istore_2        
				if(j < 32)
	//*   4    4:iload_1         
	//*   5    5:bipush          32
	//*   6    7:icmpge          27
				{
					if(i > (1 << j) - 12)
						break label0;
	//    7   10:iload_0         
	//    8   11:iconst_1        
	//    9   12:iload_1         
	//   10   13:ishl            
	//   11   14:bipush          12
	//   12   16:isub            
	//   13   17:icmpgt          29
					k = (1 << j) - 12;
	//   14   20:iconst_1        
	//   15   21:iload_1         
	//   16   22:ishl            
	//   17   23:bipush          12
	//   18   25:isub            
	//   19   26:istore_2        
				}
				return k;
	//   20   27:iload_2         
	//   21   28:ireturn         
			}
			j++;
	//   22   29:iload_1         
	//   23   30:iconst_1        
	//   24   31:iadd            
	//   25   32:istore_1        
		} while(true);
	//   26   33:goto            2
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
