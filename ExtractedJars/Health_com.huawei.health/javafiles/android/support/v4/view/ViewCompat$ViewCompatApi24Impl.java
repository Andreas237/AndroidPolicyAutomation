// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewCompat, PointerIconCompat

static class ViewCompat$ViewCompatApi24Impl extends ViewCompat$ViewCompatApi23Impl
{

	public void cancelDragAndDrop(View view)
	{
		view.cancelDragAndDrop();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method void View.cancelDragAndDrop()>
	//    2    4:return          
	}

	public void dispatchFinishTemporaryDetach(View view)
	{
		view.dispatchFinishTemporaryDetach();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method void View.dispatchFinishTemporaryDetach()>
	//    2    4:return          
	}

	public void dispatchStartTemporaryDetach(View view)
	{
		view.dispatchStartTemporaryDetach();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method void View.dispatchStartTemporaryDetach()>
	//    2    4:return          
	}

	public void setPointerIcon(View view, PointerIconCompat pointericoncompat)
	{
		if(pointericoncompat != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          12
			pointericoncompat = ((PointerIconCompat) (pointericoncompat.getPointerIcon()));
	//    2    4:aload_2         
	//    3    5:invokevirtual   #35  <Method Object PointerIconCompat.getPointerIcon()>
	//    4    8:astore_2        
		else
	//*   5    9:goto            14
			pointericoncompat = null;
	//    6   12:aconst_null     
	//    7   13:astore_2        
		view.setPointerIcon((PointerIcon)(PointerIcon)pointericoncompat);
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:checkcast       #37  <Class PointerIcon>
	//   11   19:checkcast       #37  <Class PointerIcon>
	//   12   22:invokevirtual   #40  <Method void View.setPointerIcon(PointerIcon)>
	//   13   25:return          
	}

	public boolean startDragAndDrop(View view, ClipData clipdata, android.view.View.DragShadowBuilder dragshadowbuilder, Object obj, int i)
	{
		return view.startDragAndDrop(clipdata, dragshadowbuilder, obj, i);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #45  <Method boolean View.startDragAndDrop(ClipData, android.view.View$DragShadowBuilder, Object, int)>
	//    6   10:ireturn         
	}

	public void updateDragShadow(View view, android.view.View.DragShadowBuilder dragshadowbuilder)
	{
		view.updateDragShadow(dragshadowbuilder);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #50  <Method void View.updateDragShadow(android.view.View$DragShadowBuilder)>
	//    3    5:return          
	}

	ViewCompat$ViewCompatApi24Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewCompat$ViewCompatApi23Impl()>
	//    2    4:return          
	}
}
