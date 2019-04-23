// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;

// Referenced classes of package android.support.v4.widget:
//			ExploreByTouchHelper

static final class ExploreByTouchHelper$1
	implements pter
{

	public void obtainBounds(AccessibilityNodeInfoCompat accessibilitynodeinfocompat, Rect rect)
	{
		accessibilitynodeinfocompat.getBoundsInParent(rect);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #22  <Method void AccessibilityNodeInfoCompat.getBoundsInParent(Rect)>
	//    3    5:return          
	}

	public volatile void obtainBounds(Object obj, Rect rect)
	{
		obtainBounds((AccessibilityNodeInfoCompat)obj, rect);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #18  <Class AccessibilityNodeInfoCompat>
	//    3    5:aload_2         
	//    4    6:invokevirtual   #25  <Method void obtainBounds(AccessibilityNodeInfoCompat, Rect)>
	//    5    9:return          
	}

	ExploreByTouchHelper$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
