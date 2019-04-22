// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.transition;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package android.support.transition:
//			ViewOverlayApi14, ViewGroupOverlayImpl

class ViewGroupOverlayApi14 extends ViewOverlayApi14
	implements ViewGroupOverlayImpl
{

	ViewGroupOverlayApi14(Context context, ViewGroup viewgroup, View view)
	{
		super(context, viewgroup, view);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #10  <Method void ViewOverlayApi14(Context, ViewGroup, View)>
	//    5    7:return          
	}

	static ViewGroupOverlayApi14 createFrom(ViewGroup viewgroup)
	{
		return (ViewGroupOverlayApi14)ViewOverlayApi14.createFrom(((View) (viewgroup)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #16  <Method ViewOverlayApi14 ViewOverlayApi14.createFrom(View)>
	//    2    4:checkcast       #2   <Class ViewGroupOverlayApi14>
	//    3    7:areturn         
	}

	public void add(View view)
	{
		mOverlayViewGroup.add(view);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ViewOverlayApi14$OverlayViewGroup mOverlayViewGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #27  <Method void ViewOverlayApi14$OverlayViewGroup.add(View)>
	//    4    8:return          
	}

	public void remove(View view)
	{
		mOverlayViewGroup.remove(view);
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field ViewOverlayApi14$OverlayViewGroup mOverlayViewGroup>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #31  <Method void ViewOverlayApi14$OverlayViewGroup.remove(View)>
	//    4    8:return          
	}
}
