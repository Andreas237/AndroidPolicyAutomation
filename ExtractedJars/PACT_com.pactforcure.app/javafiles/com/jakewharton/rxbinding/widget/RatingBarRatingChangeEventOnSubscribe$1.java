// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import rx.Subscriber;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			RatingBarRatingChangeEventOnSubscribe, RatingBarChangeEvent

class RatingBarRatingChangeEventOnSubscribe$1
	implements android.widget.RatingBar.OnRatingBarChangeListener
{

	public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
	{
		if(!val$subscriber.isUnsubscribed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field Subscriber val$subscriber>
	//*   2    4:invokevirtual   #33  <Method boolean Subscriber.isUnsubscribed()>
	//*   3    7:ifne            23
			val$subscriber.onNext(((Object) (RatingBarChangeEvent.create(ratingbar, f, flag))));
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field Subscriber val$subscriber>
	//    6   14:aload_1         
	//    7   15:fload_2         
	//    8   16:iload_3         
	//    9   17:invokestatic    #39  <Method RatingBarChangeEvent RatingBarChangeEvent.create(RatingBar, float, boolean)>
	//   10   20:invokevirtual   #43  <Method void Subscriber.onNext(Object)>
	//   11   23:return          
	}

	final RatingBarRatingChangeEventOnSubscribe this$0;
	final Subscriber val$subscriber;

	RatingBarRatingChangeEventOnSubscribe$1()
	{
		this$0 = final_ratingbarratingchangeeventonsubscribe;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RatingBarRatingChangeEventOnSubscribe this$0>
		val$subscriber = Subscriber.this;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Subscriber val$subscriber>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
