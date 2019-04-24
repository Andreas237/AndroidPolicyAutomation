// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.Snackbar;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.support.design.widget:
//			SnackbarDismissesOnSubscribe

class SnackbarDismissesOnSubscribe$1 extends android.support.design.widget.Snackbar.Callback
{

	public void onDismissed(Snackbar snackbar, int i)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #31  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            21
			val$subscriber.onNext(((Object) (Integer.valueOf(i))));
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field Subscriber val$subscriber>
	//    6   14:iload_2         
	//    7   15:invokestatic    #37  <Method Integer Integer.valueOf(int)>
	//    8   18:invokevirtual   #41  <Method void Subscriber.onNext(Object)>
	//    9   21:return          
	}

	final SnackbarDismissesOnSubscribe this$0;
	final Subscriber val$subscriber;

	SnackbarDismissesOnSubscribe$1()
	{
		this$0 = final_snackbardismissesonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field SnackbarDismissesOnSubscribe this$0>
		val$subscriber = Subscriber.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field Subscriber val$subscriber>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void android.support.design.widget.Snackbar$Callback()>
	//    8   14:return          
	}
}
