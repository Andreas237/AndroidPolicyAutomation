// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public static abstract class RecyclerView$g
{

	public void a(Canvas canvas, RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public void a(Canvas canvas, RecyclerView recyclerview, RecyclerView$r recyclerview$r)
	{
		a(canvas, recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #19  <Method void a(Canvas, RecyclerView)>
	//    4    6:return          
	}

	public void a(Rect rect, int i, RecyclerView recyclerview)
	{
		rect.set(0, 0, 0, 0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #26  <Method void Rect.set(int, int, int, int)>
	//    6    8:return          
	}

	public void a(Rect rect, View view, RecyclerView recyclerview, RecyclerView$r recyclerview$r)
	{
		a(rect, ((youtParams)view.getLayoutParams()).f(), recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #33  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4    6:checkcast       #35  <Class RecyclerView$LayoutParams>
	//    5    9:invokevirtual   #39  <Method int RecyclerView$LayoutParams.f()>
	//    6   12:aload_3         
	//    7   13:invokevirtual   #41  <Method void a(Rect, int, RecyclerView)>
	//    8   16:return          
	}

	public void b(Canvas canvas, RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public void b(Canvas canvas, RecyclerView recyclerview, RecyclerView$r recyclerview$r)
	{
		b(canvas, recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #44  <Method void b(Canvas, RecyclerView)>
	//    4    6:return          
	}

	public RecyclerView$g()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}
}
