// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.graphics.Rect;
import android.support.v4.util.ArrayMap;
import android.view.View;

// Referenced classes of package android.support.v4.app:
//			FragmentTransition, FragmentTransitionImpl, Fragment

static final class FragmentTransition$3
	implements Runnable
{

	public void run()
	{
		FragmentTransition.access$200(val$inFragment, val$outFragment, val$inIsPop, val$inSharedElements, false);
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field Fragment val$inFragment>
	//    2    4:aload_0         
	//    3    5:getfield        #30  <Field Fragment val$outFragment>
	//    4    8:aload_0         
	//    5    9:getfield        #32  <Field boolean val$inIsPop>
	//    6   12:aload_0         
	//    7   13:getfield        #34  <Field ArrayMap val$inSharedElements>
	//    8   16:iconst_0        
	//    9   17:invokestatic    #49  <Method void FragmentTransition.access$200(Fragment, Fragment, boolean, ArrayMap, boolean)>
		if(val$epicenterView != null)
	//*  10   20:aload_0         
	//*  11   21:getfield        #36  <Field View val$epicenterView>
	//*  12   24:ifnull          42
			val$impl.getBoundsOnScreen(val$epicenterView, val$epicenter);
	//   13   27:aload_0         
	//   14   28:getfield        #38  <Field FragmentTransitionImpl val$impl>
	//   15   31:aload_0         
	//   16   32:getfield        #36  <Field View val$epicenterView>
	//   17   35:aload_0         
	//   18   36:getfield        #40  <Field Rect val$epicenter>
	//   19   39:invokevirtual   #55  <Method void FragmentTransitionImpl.getBoundsOnScreen(View, Rect)>
	//   20   42:return          
	}

	final Rect val$epicenter;
	final View val$epicenterView;
	final FragmentTransitionImpl val$impl;
	final Fragment val$inFragment;
	final boolean val$inIsPop;
	final ArrayMap val$inSharedElements;
	final Fragment val$outFragment;

	FragmentTransition$3(Fragment fragment, Fragment fragment1, boolean flag, ArrayMap arraymap, View view, FragmentTransitionImpl fragmenttransitionimpl, Rect rect)
	{
		val$inFragment = fragment;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #28  <Field Fragment val$inFragment>
		val$outFragment = fragment1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #30  <Field Fragment val$outFragment>
		val$inIsPop = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #32  <Field boolean val$inIsPop>
		val$inSharedElements = arraymap;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #34  <Field ArrayMap val$inSharedElements>
		val$epicenterView = view;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #36  <Field View val$epicenterView>
		val$impl = fragmenttransitionimpl;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #38  <Field FragmentTransitionImpl val$impl>
		val$epicenter = rect;
	//   18   33:aload_0         
	//   19   34:aload           7
	//   20   36:putfield        #40  <Field Rect val$epicenter>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #43  <Method void Object()>
	//   23   43:return          
	}
}
