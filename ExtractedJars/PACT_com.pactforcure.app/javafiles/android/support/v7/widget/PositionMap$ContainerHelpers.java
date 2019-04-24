// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;


// Referenced classes of package android.support.v7.widget:
//			PositionMap

static class PositionMap$ContainerHelpers
{

	static int binarySearch(int ai[], int i, int j)
	{
		int k;
label0:
		{
			k = 0;
	//    0    0:iconst_0        
	//    1    1:istore_3        
			int l = i - 1;
	//    2    2:iload_1         
	//    3    3:iconst_1        
	//    4    4:isub            
	//    5    5:istore          4
			i = k;
	//    6    7:iload_3         
	//    7    8:istore_1        
			for(k = l; i <= k;)
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
				{
					i = i1 + 1;
	//   26   36:iload           4
	//   27   38:iconst_1        
	//   28   39:iadd            
	//   29   40:istore_1        
				} else
	//*  30   41:goto            12
				{
					k = i1;
	//   31   44:iload           4
	//   32   46:istore_3        
					if(j1 <= j)
						break label0;
	//   33   47:iload           5
	//   34   49:iload_2         
	//   35   50:icmple          65
					k = i1 - 1;
	//   36   53:iload           4
	//   37   55:iconst_1        
	//   38   56:isub            
	//   39   57:istore_3        
				}
			}

	//*  40   58:goto            12
			k = ~i;
	//   41   61:iload_1         
	//   42   62:iconst_m1       
	//   43   63:ixor            
	//   44   64:istore_3        
		}
		return k;
	//   45   65:iload_3         
	//   46   66:ireturn         
	}

	static final boolean EMPTY_BOOLEANS[] = new boolean[0];
	static final int EMPTY_INTS[] = new int[0];
	static final long EMPTY_LONGS[] = new long[0];
	static final Object EMPTY_OBJECTS[] = new Object[0];

	static 
	{
	//    0    0:iconst_0        
	//    1    1:newarray        boolean[]
	//    2    3:putstatic       #19  <Field boolean[] EMPTY_BOOLEANS>
	//    3    6:iconst_0        
	//    4    7:newarray        int[]
	//    5    9:putstatic       #21  <Field int[] EMPTY_INTS>
	//    6   12:iconst_0        
	//    7   13:newarray        long[]
	//    8   15:putstatic       #23  <Field long[] EMPTY_LONGS>
	//    9   18:iconst_0        
	//   10   19:anewarray       Object[]
	//   11   22:putstatic       #25  <Field Object[] EMPTY_OBJECTS>
	//*  12   25:return          
	}

	PositionMap$ContainerHelpers()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #29  <Method void Object()>
	//    2    4:return          
	}
}
