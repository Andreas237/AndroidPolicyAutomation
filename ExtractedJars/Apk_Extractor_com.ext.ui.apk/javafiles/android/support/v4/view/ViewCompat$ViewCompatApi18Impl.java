// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

static class ViewCompat$ViewCompatApi18Impl extends ViewCompat$ViewCompatApi17Impl
{

	public Rect getClipBounds(View view)
	{
		return view.getClipBounds();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #22  <Method Rect View.getClipBounds()>
	//    2    4:areturn         
	}

	public boolean isInLayout(View view)
	{
		return view.isInLayout();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #27  <Method boolean View.isInLayout()>
	//    2    4:ireturn         
	}

	public void setClipBounds(View view, Rect rect)
	{
		view.setClipBounds(rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #32  <Method void View.setClipBounds(Rect)>
	//    3    5:return          
	}

	ViewCompat$ViewCompatApi18Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewCompat$ViewCompatApi17Impl()>
	//    2    4:return          
	}
}
