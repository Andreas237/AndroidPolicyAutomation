// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.maps;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

// Referenced classes of package com.amap.api.maps:
//			SwipeDismissTouchListener, SwipeDismissCallBack

public class SwipeDismissView extends RelativeLayout
{

	public SwipeDismissView(Context context, AttributeSet attributeset, int i, View view)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #14  <Method void RelativeLayout(Context, AttributeSet, int)>
		onDismissCallback = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #16  <Field WearMapView$OnDismissCallback onDismissCallback>
		setOnTouchListener(view);
	//    8   12:aload_0         
	//    9   13:aload           4
	//   10   15:invokevirtual   #20  <Method void setOnTouchListener(View)>
	//   11   18:return          
	}

	public SwipeDismissView(Context context, AttributeSet attributeset, View view)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #25  <Method void RelativeLayout(Context, AttributeSet)>
		onDismissCallback = null;
	//    4    6:aload_0         
	//    5    7:aconst_null     
	//    6    8:putfield        #16  <Field WearMapView$OnDismissCallback onDismissCallback>
		setOnTouchListener(view);
	//    7   11:aload_0         
	//    8   12:aload_3         
	//    9   13:invokevirtual   #20  <Method void setOnTouchListener(View)>
	//   10   16:return          
	}

	public SwipeDismissView(Context context, View view)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #29  <Method void RelativeLayout(Context)>
		onDismissCallback = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #16  <Field WearMapView$OnDismissCallback onDismissCallback>
		setOnTouchListener(view);
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokevirtual   #20  <Method void setOnTouchListener(View)>
	//    9   15:return          
	}

	public void setCallback(WearMapView.OnDismissCallback ondismisscallback)
	{
		onDismissCallback = ondismisscallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field WearMapView$OnDismissCallback onDismissCallback>
	//    3    5:return          
	}

	protected void setOnTouchListener(View view)
	{
		setOnTouchListener(((android.view.View.OnTouchListener) (new SwipeDismissTouchListener(view, new Object(), ((SwipeDismissTouchListener.DismissCallbacks) (new SwipeDismissCallBack(this)))))));
	//    0    0:aload_0         
	//    1    1:new             #33  <Class SwipeDismissTouchListener>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:new             #35  <Class Object>
	//    5    9:dup             
	//    6   10:invokespecial   #38  <Method void Object()>
	//    7   13:new             #40  <Class SwipeDismissCallBack>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:invokespecial   #43  <Method void SwipeDismissCallBack(SwipeDismissView)>
	//   11   21:invokespecial   #46  <Method void SwipeDismissTouchListener(View, Object, SwipeDismissTouchListener$DismissCallbacks)>
	//   12   24:invokevirtual   #49  <Method void setOnTouchListener(android.view.View$OnTouchListener)>
	//   13   27:return          
	}

	protected WearMapView.OnDismissCallback onDismissCallback;
}
