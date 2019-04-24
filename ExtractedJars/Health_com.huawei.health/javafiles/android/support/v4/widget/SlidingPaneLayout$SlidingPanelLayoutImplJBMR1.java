// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.ViewCompat;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

static class SlidingPaneLayout$SlidingPanelLayoutImplJBMR1 extends SlidingPaneLayout.SlidingPanelLayoutImplBase
{

	public void invalidateChildRegion(SlidingPaneLayout slidingpanelayout, View view)
	{
		ViewCompat.setLayerPaint(view, ((SlidingPaneLayout.LayoutParams)view.getLayoutParams()).dimPaint);
	//    0    0:aload_2         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    5:checkcast       #22  <Class SlidingPaneLayout$LayoutParams>
	//    4    8:getfield        #26  <Field android.graphics.Paint SlidingPaneLayout$LayoutParams.dimPaint>
	//    5   11:invokestatic    #32  <Method void ViewCompat.setLayerPaint(View, android.graphics.Paint)>
	//    6   14:return          
	}

	SlidingPaneLayout$SlidingPanelLayoutImplJBMR1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void SlidingPaneLayout$SlidingPanelLayoutImplBase()>
	//    2    4:return          
	}
}
