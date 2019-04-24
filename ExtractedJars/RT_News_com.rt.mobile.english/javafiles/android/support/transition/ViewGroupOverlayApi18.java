// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.graphics.drawable.Drawable;
import android.view.*;

// Referenced classes of package android.support.transition:
//			ViewGroupOverlayImpl

class ViewGroupOverlayApi18
	implements ViewGroupOverlayImpl
{

	ViewGroupOverlayApi18(ViewGroup viewgroup)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mViewGroupOverlay = viewgroup.getOverlay();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #23  <Method ViewGroupOverlay ViewGroup.getOverlay()>
	//    5    9:putfield        #25  <Field ViewGroupOverlay mViewGroupOverlay>
	//    6   12:return          
	}

	public void add(Drawable drawable)
	{
		mViewGroupOverlay.add(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay mViewGroupOverlay>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #33  <Method void ViewGroupOverlay.add(Drawable)>
	//    4    8:return          
	}

	public void add(View view)
	{
		mViewGroupOverlay.add(view);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay mViewGroupOverlay>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #36  <Method void ViewGroupOverlay.add(View)>
	//    4    8:return          
	}

	public void clear()
	{
		mViewGroupOverlay.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay mViewGroupOverlay>
	//    2    4:invokevirtual   #39  <Method void ViewGroupOverlay.clear()>
	//    3    7:return          
	}

	public void remove(Drawable drawable)
	{
		mViewGroupOverlay.remove(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay mViewGroupOverlay>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #42  <Method void ViewGroupOverlay.remove(Drawable)>
	//    4    8:return          
	}

	public void remove(View view)
	{
		mViewGroupOverlay.remove(view);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field ViewGroupOverlay mViewGroupOverlay>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #44  <Method void ViewGroupOverlay.remove(View)>
	//    4    8:return          
	}

	private final ViewGroupOverlay mViewGroupOverlay;
}
