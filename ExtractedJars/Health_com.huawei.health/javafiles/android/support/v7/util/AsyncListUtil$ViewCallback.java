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
	//*  20   24:icmpne          34
			l = j;
	//   21   27:iload           4
	//   22   29:istore          6
		else
	//*  23   31:goto            38
			l = k;
	//   24   34:iload           5
	//   25   36:istore          6
		ai1[0] = i1 - l;
	//   26   38:aload_2         
	//   27   39:iconst_0        
	//   28   40:iload           7
	//   29   42:iload           6
	//   30   44:isub            
	//   31   45:iastore         
		l = ai[1];
	//   32   46:aload_1         
	//   33   47:iconst_1        
	//   34   48:iaload          
	//   35   49:istore          6
		if(i != 2)
	//*  36   51:iload_3         
	//*  37   52:iconst_2        
	//*  38   53:icmpne          59
	//*  39   56:goto            63
			j = k;
	//   40   59:iload           5
	//   41   61:istore          4
		ai1[1] = l + j;
	//   42   63:aload_2         
	//   43   64:iconst_1        
	//   44   65:iload           6
	//   45   67:iload           4
	//   46   69:iadd            
	//   47   70:iastore         
	//   48   71:return          
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
