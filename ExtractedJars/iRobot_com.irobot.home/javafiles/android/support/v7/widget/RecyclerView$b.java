// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.database.Observable;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

static class RecyclerView$b extends Observable
{

	public void a()
	{
		for(int i = mObservers.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ArrayList mObservers>
	//*   2    4:invokevirtual   #24  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            35
			((RecyclerView$c)mObservers.get(i)).a();
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field ArrayList mObservers>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #30  <Class RecyclerView$c>
	//   13   25:invokevirtual   #32  <Method void RecyclerView$c.a()>

	//   14   28:iload_1         
	//   15   29:iconst_1        
	//   16   30:isub            
	//   17   31:istore_1        
	//*  18   32:goto            10
	//   19   35:return          
	}

	public void a(int i, int j)
	{
		a(i, j, ((Object) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokevirtual   #36  <Method void a(int, int, Object)>
	//    5    7:return          
	}

	public void a(int i, int j, Object obj)
	{
		for(int k = mObservers.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ArrayList mObservers>
	//*   2    4:invokevirtual   #24  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore          4
	//*   6   11:iload           4
	//*   7   13:iflt            43
			((RecyclerView$c)mObservers.get(k)).a(i, j, obj);
	//    8   16:aload_0         
	//    9   17:getfield        #18  <Field ArrayList mObservers>
	//   10   20:iload           4
	//   11   22:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   12   25:checkcast       #30  <Class RecyclerView$c>
	//   13   28:iload_1         
	//   14   29:iload_2         
	//   15   30:aload_3         
	//   16   31:invokevirtual   #37  <Method void RecyclerView$c.a(int, int, Object)>

	//   17   34:iload           4
	//   18   36:iconst_1        
	//   19   37:isub            
	//   20   38:istore          4
	//*  21   40:goto            11
	//   22   43:return          
	}

	public void b(int i, int j)
	{
		for(int k = mObservers.size() - 1; k >= 0; k--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field ArrayList mObservers>
	//*   2    4:invokevirtual   #24  <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_3        
	//*   6   10:iload_3         
	//*   7   11:iflt            37
			((RecyclerView$c)mObservers.get(k)).b(i, j);
	//    8   14:aload_0         
	//    9   15:getfield        #18  <Field ArrayList mObservers>
	//   10   18:iload_3         
	//   11   19:invokevirtual   #28  <Method Object ArrayList.get(int)>
	//   12   22:checkcast       #30  <Class RecyclerView$c>
	//   13   25:iload_1         
	//   14   26:iload_2         
	//   15   27:invokevirtual   #39  <Method void RecyclerView$c.b(int, int)>

	//   16   30:iload_3         
	//   17   31:iconst_1        
	//   18   32:isub            
	//   19   33:istore_3        
	//*  20   34:goto            10
	//   21   37:return          
	}

	RecyclerView$b()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Observable()>
	//    2    4:return          
	}
}
