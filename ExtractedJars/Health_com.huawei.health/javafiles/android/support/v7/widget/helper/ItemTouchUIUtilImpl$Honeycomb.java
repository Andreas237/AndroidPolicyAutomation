// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget.helper;

import android.graphics.Canvas;
import android.support.v7.widget.RecyclerView;
import android.view.View;

// Referenced classes of package android.support.v7.widget.helper:
//			ItemTouchUIUtil, ItemTouchUIUtilImpl

static class ItemTouchUIUtilImpl$Honeycomb
	implements ItemTouchUIUtil
{

	public void clearView(View view)
	{
		view.setTranslationX(0.0F);
	//    0    0:aload_1         
	//    1    1:fconst_0        
	//    2    2:invokevirtual   #22  <Method void View.setTranslationX(float)>
		view.setTranslationY(0.0F);
	//    3    5:aload_1         
	//    4    6:fconst_0        
	//    5    7:invokevirtual   #25  <Method void View.setTranslationY(float)>
	//    6   10:return          
	}

	public void onDraw(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
	{
		view.setTranslationX(f);
	//    0    0:aload_3         
	//    1    1:fload           4
	//    2    3:invokevirtual   #22  <Method void View.setTranslationX(float)>
		view.setTranslationY(f1);
	//    3    6:aload_3         
	//    4    7:fload           5
	//    5    9:invokevirtual   #25  <Method void View.setTranslationY(float)>
	//    6   12:return          
	}

	public void onDrawOver(Canvas canvas, RecyclerView recyclerview, View view, float f, float f1, int i, boolean flag)
	{
	//    0    0:return          
	}

	public void onSelected(View view)
	{
	//    0    0:return          
	}

	ItemTouchUIUtilImpl$Honeycomb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
