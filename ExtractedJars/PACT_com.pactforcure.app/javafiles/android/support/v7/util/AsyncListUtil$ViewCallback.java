// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.util;


// Referenced classes of package android.support.v7.util:
//			AsyncListUtil

public static abstract class AsyncListUtil$ViewCallback
{

	public void extendRangeInto(int ai[], int ai1[], int i)
	{
		int j = (ai[1] - ai[0]) + 1;
	//    0    0:aload_1         
	//    1    1:iconst_1        
	//    2    2:iaload          
	//    3    3:aload_1         
	//    4    4:iconst_0        
	//    5    5:iaload          
	//    6    6:isub            
	//    7    7:iconst_1        
	//    8    8:iadd            
	//    9    9:istore          4
		int k = j / 2;
	//   10   11:iload           4
	//   11   13:iconst_2        
	//   12   14:idiv            
	//   13   15:istore          5
		int i1 = ai[0];
	//   14   17:aload_1         
	//   15   18:iconst_0        
	//   16   19:iaload          
	//   17   20:istore          7
		int l;
		if(i == 1)
	//*  18   22:iload_3         
	//*  19   23:iconst_1        
	//*  20   24:icmpne          58
			l = j;
	//   21   27:iload           4
	//   22   29:istore          6
		else
	//*  23   31:aload_2         
	//*  24   32:iconst_0        
	//*  25   33:iload           7
	//*  26   35:iload           6
	//*  27   37:isub            
	//*  28   38:iastore         
	//*  29   39:aload_1         
	//*  30   40:iconst_1        
	//*  31   41:iaload          
	//*  32   42:istore          6
	//*  33   44:iload_3         
	//*  34   45:iconst_2        
	//*  35   46:icmpne          65
	//*  36   49:aload_2         
	//*  37   50:iconst_1        
	//*  38   51:iload           6
	//*  39   53:iload           4
	//*  40   55:iadd            
	//*  41   56:iastore         
	//*  42   57:return          
			l = k;
	//   43   58:iload           5
	//   44   60:istore          6
		ai1[0] = i1 - l;
		l = ai[1];
		if(i != 2)
	//*  45   62:goto            31
			j = k;
	//   46   65:iload           5
	//   47   67:istore          4
		ai1[1] = l + j;
	//*  48   69:goto            49
	}

	public abstract void getItemRangeInto(int ai[]);

	public abstract void onDataRefresh();

	public abstract void onItemLoaded(int i);

	public static final int HINT_SCROLL_ASC = 2;
	public static final int HINT_SCROLL_DESC = 1;
	public static final int HINT_SCROLL_NONE = 0;

	public AsyncListUtil$ViewCallback()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
	//    2    4:return          
	}
}
