// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewTouchEventOnSubscribe

class ViewTouchEventOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		ViewTouchEventOnSubscribe.access$000(ViewTouchEventOnSubscribe.this).setOnTouchListener(((android.view.View.OnTouchListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ViewTouchEventOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method View ViewTouchEventOnSubscribe.access$000(ViewTouchEventOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void View.setOnTouchListener(android.view.View$OnTouchListener)>
	//    5   11:return          
	}

	final ViewTouchEventOnSubscribe this$0;

	ViewTouchEventOnSubscribe$2()
	{
		this$0 = ViewTouchEventOnSubscribe.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ViewTouchEventOnSubscribe this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
	//    5    9:return          
	}
}
