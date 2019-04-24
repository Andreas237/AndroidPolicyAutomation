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
