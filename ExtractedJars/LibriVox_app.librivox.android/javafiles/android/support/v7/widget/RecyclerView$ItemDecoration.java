// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//			RecyclerView

public abstract class RecyclerView$ItemDecoration
{

	public void getItemOffsets(Rect rect, int i, RecyclerView recyclerview)
	{
		rect.set(0, 0, 0, 0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:iconst_0        
	//    3    3:iconst_0        
	//    4    4:iconst_0        
	//    5    5:invokevirtual   #18  <Method void Rect.set(int, int, int, int)>
	//    6    8:return          
	}

	public void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, RecyclerView.State state)
	{
		getItemOffsets(rect, ((RecyclerView.LayoutParams)view.getLayoutParams()).getViewLayoutPosition(), recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #26  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    4    6:checkcast       #28  <Class RecyclerView$LayoutParams>
	//    5    9:invokevirtual   #32  <Method int RecyclerView$LayoutParams.getViewLayoutPosition()>
	//    6   12:aload_3         
	//    7   13:invokevirtual   #34  <Method void getItemOffsets(Rect, int, RecyclerView)>
	//    8   16:return          
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, RecyclerView.State state)
	{
		onDraw(canvas, recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #39  <Method void onDraw(Canvas, RecyclerView)>
	//    4    6:return          
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview)
	{
	//    0    0:return          
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, RecyclerView.State state)
	{
		onDrawOver(canvas, recyclerview);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #42  <Method void onDrawOver(Canvas, RecyclerView)>
	//    4    6:return          
	}

	public RecyclerView$ItemDecoration()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}
}
