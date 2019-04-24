// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.support.v4.view.s;
import android.view.View;

// Referenced classes of package android.support.v4.widget:
//			SlidingPaneLayout

static class SlidingPaneLayout$f
	implements SlidingPaneLayout$e
{

	public void a(SlidingPaneLayout slidingpanelayout, View view)
	{
		s.a(((View) (slidingpanelayout)), view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #22  <Method int View.getLeft()>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method int View.getTop()>
	//    5    9:aload_2         
	//    6   10:invokevirtual   #28  <Method int View.getRight()>
	//    7   13:aload_2         
	//    8   14:invokevirtual   #31  <Method int View.getBottom()>
	//    9   17:invokestatic    #36  <Method void s.a(View, int, int, int, int)>
	//   10   20:return          
	}

	SlidingPaneLayout$f()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
