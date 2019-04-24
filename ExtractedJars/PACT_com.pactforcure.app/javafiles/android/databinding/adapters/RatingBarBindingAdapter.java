// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.RatingBar;

public class RatingBarBindingAdapter
{

	public RatingBarBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public static void setListeners(RatingBar ratingbar, android.widget.RatingBar.OnRatingBarChangeListener onratingbarchangelistener, InverseBindingListener inversebindinglistener)
	{
		if(inversebindinglistener == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			ratingbar.setOnRatingBarChangeListener(onratingbarchangelistener);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #31  <Method void RatingBar.setOnRatingBarChangeListener(android.widget.RatingBar$OnRatingBarChangeListener)>
			return;
	//    5    9:return          
		} else
		{
			ratingbar.setOnRatingBarChangeListener(new android.widget.RatingBar.OnRatingBarChangeListener(onratingbarchangelistener, inversebindinglistener) {

				public void onRatingChanged(RatingBar ratingbar1, float f, boolean flag)
				{
					if(listener != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #19  <Field android.widget.RatingBar$OnRatingBarChangeListener val$listener>
				//*   2    4:ifnull          19
						listener.onRatingChanged(ratingbar1, f, flag);
				//    3    7:aload_0         
				//    4    8:getfield        #19  <Field android.widget.RatingBar$OnRatingBarChangeListener val$listener>
				//    5   11:aload_1         
				//    6   12:fload_2         
				//    7   13:iload_3         
				//    8   14:invokeinterface #29  <Method void android.widget.RatingBar$OnRatingBarChangeListener.onRatingChanged(RatingBar, float, boolean)>
					ratingChange.onChange();
				//    9   19:aload_0         
				//   10   20:getfield        #21  <Field InverseBindingListener val$ratingChange>
				//   11   23:invokeinterface #34  <Method void InverseBindingListener.onChange()>
				//   12   28:return          
				}

				final android.widget.RatingBar.OnRatingBarChangeListener val$listener;
				final InverseBindingListener val$ratingChange;

			
			{
				listener = onratingbarchangelistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field android.widget.RatingBar$OnRatingBarChangeListener val$listener>
				ratingChange = inversebindinglistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field InverseBindingListener val$ratingChange>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   10:aload_0         
	//    7   11:new             #6   <Class RatingBarBindingAdapter$1>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #34  <Method void RatingBarBindingAdapter$1(android.widget.RatingBar$OnRatingBarChangeListener, InverseBindingListener)>
	//   12   20:invokevirtual   #31  <Method void RatingBar.setOnRatingBarChangeListener(android.widget.RatingBar$OnRatingBarChangeListener)>
			return;
	//   13   23:return          
		}
	}

	public static void setRating(RatingBar ratingbar, float f)
	{
		if(ratingbar.getRating() != f)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #41  <Method float RatingBar.getRating()>
	//*   2    4:fload_1         
	//*   3    5:fcmpl           
	//*   4    6:ifeq            14
			ratingbar.setRating(f);
	//    5    9:aload_0         
	//    6   10:fload_1         
	//    7   11:invokevirtual   #44  <Method void RatingBar.setRating(float)>
	//    8   14:return          
	}
}
