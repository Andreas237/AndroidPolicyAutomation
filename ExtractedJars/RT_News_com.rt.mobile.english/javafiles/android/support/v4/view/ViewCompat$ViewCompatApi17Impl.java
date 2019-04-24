// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Paint;
import android.view.Display;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//			ViewCompat

static class ViewCompat$ViewCompatApi17Impl extends ViewCompat$ViewCompatApi16Impl
{

	public int generateViewId()
	{
		return View.generateViewId();
	//    0    0:invokestatic    #21  <Method int View.generateViewId()>
	//    1    3:ireturn         
	}

	public Display getDisplay(View view)
	{
		return view.getDisplay();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Display View.getDisplay()>
	//    2    4:areturn         
	}

	public int getLabelFor(View view)
	{
		return view.getLabelFor();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #30  <Method int View.getLabelFor()>
	//    2    4:ireturn         
	}

	public int getLayoutDirection(View view)
	{
		return view.getLayoutDirection();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method int View.getLayoutDirection()>
	//    2    4:ireturn         
	}

	public int getPaddingEnd(View view)
	{
		return view.getPaddingEnd();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #36  <Method int View.getPaddingEnd()>
	//    2    4:ireturn         
	}

	public int getPaddingStart(View view)
	{
		return view.getPaddingStart();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #39  <Method int View.getPaddingStart()>
	//    2    4:ireturn         
	}

	public int getWindowSystemUiVisibility(View view)
	{
		return view.getWindowSystemUiVisibility();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #42  <Method int View.getWindowSystemUiVisibility()>
	//    2    4:ireturn         
	}

	public boolean isPaddingRelative(View view)
	{
		return view.isPaddingRelative();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method boolean View.isPaddingRelative()>
	//    2    4:ireturn         
	}

	public void setLabelFor(View view, int i)
	{
		view.setLabelFor(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #52  <Method void View.setLabelFor(int)>
	//    3    5:return          
	}

	public void setLayerPaint(View view, Paint paint)
	{
		view.setLayerPaint(paint);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #57  <Method void View.setLayerPaint(Paint)>
	//    3    5:return          
	}

	public void setLayoutDirection(View view, int i)
	{
		view.setLayoutDirection(i);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:invokevirtual   #60  <Method void View.setLayoutDirection(int)>
	//    3    5:return          
	}

	public void setPaddingRelative(View view, int i, int j, int k, int l)
	{
		view.setPaddingRelative(i, j, k, l);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iload_3         
	//    3    3:iload           4
	//    4    5:iload           5
	//    5    7:invokevirtual   #65  <Method void View.setPaddingRelative(int, int, int, int)>
	//    6   10:return          
	}

	ViewCompat$ViewCompatApi17Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void ViewCompat$ViewCompatApi16Impl()>
	//    2    4:return          
	}
}
