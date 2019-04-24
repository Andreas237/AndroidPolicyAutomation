// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.view.View;

// Referenced classes of package com.amap.api.maps:
//			SwipeDismissView

public class SwipeDismissCallBack
	implements SwipeDismissTouchListener.DismissCallbacks
{

	public SwipeDismissCallBack(SwipeDismissView swipedismissview)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		a = swipedismissview;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field SwipeDismissView a>
	//    5    9:return          
	}

	public boolean canDismiss(Object obj)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void onDismiss(View view, Object obj)
	{
		if(a.onDismissCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field SwipeDismissView a>
	//*   2    4:getfield        #26  <Field WearMapView$OnDismissCallback SwipeDismissView.onDismissCallback>
	//*   3    7:ifnull          22
			a.onDismissCallback.onDismiss();
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field SwipeDismissView a>
	//    6   14:getfield        #26  <Field WearMapView$OnDismissCallback SwipeDismissView.onDismissCallback>
	//    7   17:invokeinterface #30  <Method void WearMapView$OnDismissCallback.onDismiss()>
	//    8   22:return          
	}

	public void onNotifySwipe()
	{
		if(a.onDismissCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #15  <Field SwipeDismissView a>
	//*   2    4:getfield        #26  <Field WearMapView$OnDismissCallback SwipeDismissView.onDismissCallback>
	//*   3    7:ifnull          22
			a.onDismissCallback.onNotifySwipe();
	//    4   10:aload_0         
	//    5   11:getfield        #15  <Field SwipeDismissView a>
	//    6   14:getfield        #26  <Field WearMapView$OnDismissCallback SwipeDismissView.onDismissCallback>
	//    7   17:invokeinterface #33  <Method void WearMapView$OnDismissCallback.onNotifySwipe()>
	//    8   22:return          
	}

	SwipeDismissView a;
}
