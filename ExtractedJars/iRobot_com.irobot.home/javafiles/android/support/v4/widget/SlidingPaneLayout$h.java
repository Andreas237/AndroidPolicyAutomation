// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.s;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

static class SlidingPaneLayout$h extends SlidingPaneLayout$f
{

	public void a(SlidingPaneLayout slidingpanelayout, View view)
	{
		s.a(view, ((youtParams)view.getLayoutParams()).d);
	//    0    0:aload_2         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #20  <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    3    5:checkcast       #22  <Class SlidingPaneLayout$LayoutParams>
	//    4    8:getfield        #26  <Field android.graphics.Paint SlidingPaneLayout$LayoutParams.d>
	//    5   11:invokestatic    #31  <Method void s.a(View, android.graphics.Paint)>
	//    6   14:return          
	}

	SlidingPaneLayout$h()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void SlidingPaneLayout$f()>
	//    2    4:return          
	}
}
