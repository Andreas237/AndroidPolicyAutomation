// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchUIUtil, ItemTouchUIUtilImpl

static class ItemTouchUIUtilImpl$Gingerbread
	implements ItemTouchUIUtil
{

	private void draw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1)
	{
		canvas.save();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method int Canvas.save()>
	//    2    4:pop             
		canvas.translate(f, f1);
	//    3    5:aload_1         
	//    4    6:fload           4
	//    5    8:fload           5
	//    6   10:invokevirtual   #26  <Method void Canvas.translate(float, float)>
		recyclerview.drawChild(canvas, view, 0L);
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:lconst_0        
	//   11   17:invokevirtual   #32  <Method boolean RecyclerView.drawChild(Canvas, View, long)>
	//   12   20:pop             
		canvas.restore();
	//   13   21:aload_1         
	//   14   22:invokevirtual   #35  <Method void Canvas.restore()>
	//   15   25:return          
	}

	public void clearView(View view)
	{
		view.setVisibility(0);
	//    0    0:aload_1         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #43  <Method void View.setVisibility(int)>
	//    3    5:return          
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
	{
		if(i != 2)
	//*   0    0:iload           6
	//*   1    2:iconst_2        
	//*   2    3:icmpeq          17
			draw(canvas, recyclerview, view, f, f1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:fload           4
	//    8   12:fload           5
	//    9   14:invokespecial   #47  <Method void draw(Canvas, RecyclerView, View, float, float)>
	//   10   17:return          
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
	{
		if(i == 2)
	//*   0    0:iload           6
	//*   1    2:iconst_2        
	//*   2    3:icmpne          17
			draw(canvas, recyclerview, view, f, f1);
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:fload           4
	//    8   12:fload           5
	//    9   14:invokespecial   #47  <Method void draw(Canvas, RecyclerView, View, float, float)>
	//   10   17:return          
	}

	public void onSelected(View view)
	{
		view.setVisibility(4);
	//    0    0:aload_1         
	//    1    1:iconst_4        
	//    2    2:invokevirtual   #43  <Method void View.setVisibility(int)>
	//    3    5:return          
	}

	ItemTouchUIUtilImpl$Gingerbread()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
