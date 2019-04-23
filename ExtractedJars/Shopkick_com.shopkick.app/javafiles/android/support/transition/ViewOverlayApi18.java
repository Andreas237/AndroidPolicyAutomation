// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

// Referenced classes of package android.support.transition:
//			ViewOverlayImpl

class ViewOverlayApi18
	implements ViewOverlayImpl
{

	ViewOverlayApi18(View view)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mViewOverlay = view.getOverlay();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method ViewOverlay View.getOverlay()>
	//    5    9:putfield        #25  <Field ViewOverlay mViewOverlay>
	//    6   12:return          
	}

	public void add(Drawable drawable)
	{
		mViewOverlay.add(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewOverlay mViewOverlay>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method void ViewOverlay.add(Drawable)>
	//    4    8:return          
	}

	public void clear()
	{
		mViewOverlay.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewOverlay mViewOverlay>
	//    2    4:invokevirtual   #36  <Method void ViewOverlay.clear()>
	//    3    7:return          
	}

	public void remove(Drawable drawable)
	{
		mViewOverlay.remove(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewOverlay mViewOverlay>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #39  <Method void ViewOverlay.remove(Drawable)>
	//    4    8:return          
	}

	private final ViewOverlay mViewOverlay;
}
