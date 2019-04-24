// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.support.design.widget;

import android.support.design.widget.Snackbar;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class SnackbarDismissesOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public SnackbarDismissesOnSubscribe(Snackbar snackbar)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = snackbar;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field Snackbar view>
	//    5    9:return          
	}

	public volatile void call(Object obj)
	{
		call((Subscriber)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #27  <Class Subscriber>
	//    3    5:invokevirtual   #30  <Method void call(Subscriber)>
	//    4    8:return          
	}

	public void call(final Subscriber subscriber)
	{
		Preconditions.checkUiThread();
	//    0    0:invokestatic    #35  <Method void Preconditions.checkUiThread()>
		android.support.design.widget.Snackbar.Callback callback = new android.support.design.widget.Snackbar.Callback() {

			public void onDismissed(Snackbar snackbar, int i)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #19  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #31  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            21
					subscriber.onNext(((Object) (Integer.valueOf(i))));
			//    4   10:aload_0         
			//    5   11:getfield        #19  <Field Subscriber val$subscriber>
			//    6   14:iload_2         
			//    7   15:invokestatic    #37  <Method Integer Integer.valueOf(int)>
			//    8   18:invokevirtual   #41  <Method void Subscriber.onNext(Object)>
			//    9   21:return          
			}

			final SnackbarDismissesOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = SnackbarDismissesOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field SnackbarDismissesOnSubscribe this$0>
				subscriber = subscriber1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #19  <Field Subscriber val$subscriber>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #22  <Method void android.support.design.widget.Snackbar$Callback()>
			//    8   14:return          
			}
		}
;
	//    1    3:new             #9   <Class SnackbarDismissesOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void SnackbarDismissesOnSubscribe$1(SnackbarDismissesOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setCallback(((android.support.design.widget.Snackbar.Callback) (callback)));
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field Snackbar view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method Snackbar Snackbar.setCallback(android.support.design.widget.Snackbar$Callback)>
	//   11   21:pop             
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setCallback(((android.support.design.widget.Snackbar.Callback) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field SnackbarDismissesOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method Snackbar SnackbarDismissesOnSubscribe.access$000(SnackbarDismissesOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method Snackbar Snackbar.setCallback(android.support.design.widget.Snackbar$Callback)>
			//    5   11:pop             
			//    6   12:return          
			}

			final SnackbarDismissesOnSubscribe this$0;

			
			{
				this$0 = SnackbarDismissesOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field SnackbarDismissesOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   12   22:aload_1         
	//   13   23:new             #11  <Class SnackbarDismissesOnSubscribe$2>
	//   14   26:dup             
	//   15   27:aload_0         
	//   16   28:invokespecial   #47  <Method void SnackbarDismissesOnSubscribe$2(SnackbarDismissesOnSubscribe)>
	//   17   31:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
	//   18   34:return          
	}

	private final Snackbar view;


/*
	static Snackbar access$000(SnackbarDismissesOnSubscribe snackbardismissesonsubscribe)
	{
		return snackbardismissesonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field Snackbar view>
	//    2    4:areturn         
	}

*/
}
