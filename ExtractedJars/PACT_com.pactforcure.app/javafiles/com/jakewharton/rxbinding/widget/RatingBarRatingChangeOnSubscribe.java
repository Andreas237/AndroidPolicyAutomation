// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import com.jakewharton.rxbinding.internal.MainThreadSubscription;
import com.jakewharton.rxbinding.internal.Preconditions;
import rx.Subscriber;

final class RatingBarRatingChangeOnSubscribe
	implements rx.Observable.OnSubscribe
{

	public RatingBarRatingChangeOnSubscribe(RatingBar ratingbar)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		view = ratingbar;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field RatingBar view>
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
		android.widget.RatingBar.OnRatingBarChangeListener onratingbarchangelistener = new android.widget.RatingBar.OnRatingBarChangeListener() {

			public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
			{
				if(!subscriber.isUnsubscribed())
			//*   0    0:aload_0         
			//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
			//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
			//*   3    7:ifne            21
					subscriber.onNext(((Object) (Float.valueOf(f))));
			//    4   10:aload_0         
			//    5   11:getfield        #21  <Field Subscriber val$subscriber>
			//    6   14:fload_2         
			//    7   15:invokestatic    #39  <Method Float Float.valueOf(float)>
			//    8   18:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
			//    9   21:return          
			}

			final RatingBarRatingChangeOnSubscribe this$0;
			final Subscriber val$subscriber;

			
			{
				this$0 = RatingBarRatingChangeOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field RatingBarRatingChangeOnSubscribe this$0>
				subscriber = subscriber1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Subscriber val$subscriber>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
;
	//    1    3:new             #9   <Class RatingBarRatingChangeOnSubscribe$1>
	//    2    6:dup             
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #38  <Method void RatingBarRatingChangeOnSubscribe$1(RatingBarRatingChangeOnSubscribe, Subscriber)>
	//    6   12:astore_2        
		view.setOnRatingBarChangeListener(onratingbarchangelistener);
	//    7   13:aload_0         
	//    8   14:getfield        #20  <Field RatingBar view>
	//    9   17:aload_2         
	//   10   18:invokevirtual   #44  <Method void RatingBar.setOnRatingBarChangeListener(android.widget.RatingBar$OnRatingBarChangeListener)>
		subscriber.add(((rx.Subscription) (new MainThreadSubscription() {

			protected void onUnsubscribe()
			{
				view.setOnRatingBarChangeListener(((android.widget.RatingBar.OnRatingBarChangeListener) (null)));
			//    0    0:aload_0         
			//    1    1:getfield        #15  <Field RatingBarRatingChangeOnSubscribe this$0>
			//    2    4:invokestatic    #24  <Method RatingBar RatingBarRatingChangeOnSubscribe.access$000(RatingBarRatingChangeOnSubscribe)>
			//    3    7:aconst_null     
			//    4    8:invokevirtual   #30  <Method void RatingBar.setOnRatingBarChangeListener(android.widget.RatingBar$OnRatingBarChangeListener)>
			//    5   11:return          
			}

			final RatingBarRatingChangeOnSubscribe this$0;

			
			{
				this$0 = RatingBarRatingChangeOnSubscribe.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field RatingBarRatingChangeOnSubscribe this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void MainThreadSubscription()>
			//    5    9:return          
			}
		}
)));
	//   11   21:aload_1         
	//   12   22:new             #11  <Class RatingBarRatingChangeOnSubscribe$2>
	//   13   25:dup             
	//   14   26:aload_0         
	//   15   27:invokespecial   #47  <Method void RatingBarRatingChangeOnSubscribe$2(RatingBarRatingChangeOnSubscribe)>
	//   16   30:invokevirtual   #51  <Method void Subscriber.add(rx.Subscription)>
		subscriber.onNext(((Object) (Float.valueOf(view.getRating()))));
	//   17   33:aload_1         
	//   18   34:aload_0         
	//   19   35:getfield        #20  <Field RatingBar view>
	//   20   38:invokevirtual   #55  <Method float RatingBar.getRating()>
	//   21   41:invokestatic    #61  <Method Float Float.valueOf(float)>
	//   22   44:invokevirtual   #64  <Method void Subscriber.onNext(Object)>
	//   23   47:return          
	}

	private final RatingBar view;


/*
	static RatingBar access$000(RatingBarRatingChangeOnSubscribe ratingbarratingchangeonsubscribe)
	{
		return ratingbarratingchangeonsubscribe.view;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field RatingBar view>
	//    2    4:areturn         
	}

*/
}
