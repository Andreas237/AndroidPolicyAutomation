// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.jakewharton.rxbinding.widget;

import android.widget.RatingBar;
import rx.functions.Action1;

// Referenced classes of package com.jakewharton.rxbinding.widget:
//			RxRatingBar

static final class RxRatingBar$1
	implements Action1
{

	public void call(Float float1)
	{
		val$view.setRating(float1.floatValue());
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

	RxRatingBar$1(RatingBar ratingbar)
	{
		val$view = ratingbar;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RatingBar val$view>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
