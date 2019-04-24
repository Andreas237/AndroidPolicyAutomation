// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewLongClickOnSubscribe

class ViewLongClickOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		ViewLongClickOnSubscribe.access$200(ViewLongClickOnSubscribe.this).setOnLongClickListener(((android.view.View.OnLongClickListener) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field ViewLongClickOnSubscribe this$0>
	//    2    4:invokestatic    #24  <Method View ViewLongClickOnSubscribe.access$200(ViewLongClickOnSubscribe)>
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #30  <Method void View.setOnLongClickListener(android.view.View$OnLongClickListener)>
	//    5   11:return          
	}

	final ViewLongClickOnSubscribe this$0;

	ViewLongClickOnSubscribe$2()
	{
		this$0 = ViewLongClickOnSubscribe.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field ViewLongClickOnSubscribe this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
	//    5    9:return          
	}
}
