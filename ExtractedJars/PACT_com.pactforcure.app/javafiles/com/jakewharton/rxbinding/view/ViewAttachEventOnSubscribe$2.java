// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.view;

import android.view.View;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;

// Referenced classes of package com.jakewharton.rxbinding.view:
//			ViewAttachEventOnSubscribe

class ViewAttachEventOnSubscribe$2 extends MainThreadSubscription
{

	protected void onUnsubscribe()
	{
		ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe.this).removeOnAttachStateChangeListener(val$listener);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field ViewAttachEventOnSubscribe this$0>
	//    2    4:invokestatic    #28  <Method View ViewAttachEventOnSubscribe.access$000(ViewAttachEventOnSubscribe)>
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field android.view.View$OnAttachStateChangeListener val$listener>
	//    5   11:invokevirtual   #34  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//    6   14:return          
	}

	final ViewAttachEventOnSubscribe this$0;
	final android.view.ner val$listener;

	ViewAttachEventOnSubscribe$2()
	{
		this$0 = final_viewattacheventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field ViewAttachEventOnSubscribe this$0>
		val$listener = android.view.ner.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field android.view.View$OnAttachStateChangeListener val$listener>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void MainThreadSubscription()>
	//    8   14:return          
	}
}
