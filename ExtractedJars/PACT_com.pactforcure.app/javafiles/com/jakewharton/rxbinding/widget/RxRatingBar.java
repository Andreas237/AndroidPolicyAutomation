// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import rx.Observable;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			RatingBarRatingChangeEventOnSubscribe, RatingBarRatingChangeOnSubscribe

public final class RxRatingBar
{

	public RxRatingBar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static Action1 isIndicator(RatingBar ratingbar)
	{
		return new Action1(ratingbar) {

			public void call(Boolean boolean1)
			{
				view.setIsIndicator(boolean1.booleanValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RatingBar val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method boolean Boolean.booleanValue()>
			//    4    8:invokevirtual   #36  <Method void RatingBar.setIsIndicator(boolean)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Boolean)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Boolean>
			//    3    5:invokevirtual   #39  <Method void call(Boolean)>
			//    4    8:return          
			}

			final RatingBar val$view;

			
			{
				view = ratingbar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RatingBar val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #8   <Class RxRatingBar$2>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #20  <Method void RxRatingBar$2(RatingBar)>
	//    4    8:areturn         
	}

	public static Action1 rating(RatingBar ratingbar)
	{
		return new Action1(ratingbar) {

			public void call(Float float1)
			{
				view.setRating(float1.floatValue());
			//    0    0:aload_0         
			//    1    1:getfield        #18  <Field RatingBar val$view>
			//    2    4:aload_1         
			//    3    5:invokevirtual   #30  <Method float Float.floatValue()>
			//    4    8:invokevirtual   #36  <Method void RatingBar.setRating(float)>
			//    5   11:return          
			}

			public volatile void call(Object obj)
			{
				call((Float)obj);
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:checkcast       #26  <Class Float>
			//    3    5:invokevirtual   #39  <Method void call(Float)>
			//    4    8:return          
			}

			final RatingBar val$view;

			
			{
				view = ratingbar;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RatingBar val$view>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    0    0:new             #6   <Class RxRatingBar$1>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #26  <Method void RxRatingBar$1(RatingBar)>
	//    4    8:areturn         
	}

	public static Observable ratingChangeEvents(RatingBar ratingbar)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new RatingBarRatingChangeEventOnSubscribe(ratingbar))));
	//    0    0:new             #31  <Class RatingBarRatingChangeEventOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #32  <Method void RatingBarRatingChangeEventOnSubscribe(RatingBar)>
	//    4    8:invokestatic    #38  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}

	public static Observable ratingChanges(RatingBar ratingbar)
	{
		return Observable.create(((rx.Observable.OnSubscribe) (new RatingBarRatingChangeOnSubscribe(ratingbar))));
	//    0    0:new             #42  <Class RatingBarRatingChangeOnSubscribe>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #43  <Method void RatingBarRatingChangeOnSubscribe(RatingBar)>
	//    4    8:invokestatic    #38  <Method Observable Observable.create(rx.Observable$OnSubscribe)>
	//    5   11:areturn         
	}
}
