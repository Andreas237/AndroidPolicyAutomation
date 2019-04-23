// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.RatingBar;

// Referenced classes of package android.databinding.adapters:
//			RatingBarBindingAdapter

static final class RatingBarBindingAdapter$1
	implements android.widget.eListener
{

	public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
	{
		android.widget.eListener elistener = val$listener;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.widget.RatingBar$OnRatingBarChangeListener val$listener>
	//    2    4:astore          4
		if(elistener != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			elistener.onRatingChanged(ratingbar, f, flag);
	//    5   11:aload           4
	//    6   13:aload_1         
	//    7   14:fload_2         
	//    8   15:iload_3         
	//    9   16:invokeinterface #29  <Method void android.widget.RatingBar$OnRatingBarChangeListener.onRatingChanged(RatingBar, float, boolean)>
		val$ratingChange.onChange();
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field InverseBindingListener val$ratingChange>
	//   12   25:invokeinterface #34  <Method void InverseBindingListener.onChange()>
	//   13   30:return          
	}

	final android.widget.eListener val$listener;
	final InverseBindingListener val$ratingChange;

	RatingBarBindingAdapter$1(android.widget.eListener elistener, InverseBindingListener inversebindinglistener)
	{
		val$listener = elistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field android.widget.RatingBar$OnRatingBarChangeListener val$listener>
		val$ratingChange = inversebindinglistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field InverseBindingListener val$ratingChange>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
