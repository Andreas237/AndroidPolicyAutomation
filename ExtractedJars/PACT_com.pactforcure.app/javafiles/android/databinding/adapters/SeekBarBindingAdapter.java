// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.SeekBar;

public class SeekBarBindingAdapter
{
	public static interface OnProgressChanged
	{

		public abstract void onProgressChanged(SeekBar seekbar, int i, boolean flag);
	}

	public static interface OnStartTrackingTouch
	{

		public abstract void onStartTrackingTouch(SeekBar seekbar);
	}

	public static interface OnStopTrackingTouch
	{

		public abstract void onStopTrackingTouch(SeekBar seekbar);
	}


	public SeekBarBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:return          
	}

	public static void setOnSeekBarChangeListener(SeekBar seekbar, OnStartTrackingTouch onstarttrackingtouch, OnStopTrackingTouch onstoptrackingtouch, OnProgressChanged onprogresschanged, InverseBindingListener inversebindinglistener)
	{
		if(onstarttrackingtouch == null && onstoptrackingtouch == null && onprogresschanged == null && inversebindinglistener == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       23
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       23
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       23
	//*   6   12:aload           4
	//*   7   14:ifnonnull       23
		{
			seekbar.setOnSeekBarChangeListener(((android.widget.SeekBar.OnSeekBarChangeListener) (null)));
	//    8   17:aload_0         
	//    9   18:aconst_null     
	//   10   19:invokevirtual   #41  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
			return;
	//   11   22:return          
		} else
		{
			seekbar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener(onprogresschanged, inversebindinglistener, onstarttrackingtouch, onstoptrackingtouch) {

				public void onProgressChanged(SeekBar seekbar1, int i, boolean flag)
				{
					if(progressChanged != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #23  <Field SeekBarBindingAdapter$OnProgressChanged val$progressChanged>
				//*   2    4:ifnull          19
						progressChanged.onProgressChanged(seekbar1, i, flag);
				//    3    7:aload_0         
				//    4    8:getfield        #23  <Field SeekBarBindingAdapter$OnProgressChanged val$progressChanged>
				//    5   11:aload_1         
				//    6   12:iload_2         
				//    7   13:iload_3         
				//    8   14:invokeinterface #39  <Method void SeekBarBindingAdapter$OnProgressChanged.onProgressChanged(SeekBar, int, boolean)>
					if(attrChanged != null)
				//*   9   19:aload_0         
				//*  10   20:getfield        #25  <Field InverseBindingListener val$attrChanged>
				//*  11   23:ifnull          35
						attrChanged.onChange();
				//   12   26:aload_0         
				//   13   27:getfield        #25  <Field InverseBindingListener val$attrChanged>
				//   14   30:invokeinterface #44  <Method void InverseBindingListener.onChange()>
				//   15   35:return          
				}

				public void onStartTrackingTouch(SeekBar seekbar1)
				{
					if(start != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #27  <Field SeekBarBindingAdapter$OnStartTrackingTouch val$start>
				//*   2    4:ifnull          17
						start.onStartTrackingTouch(seekbar1);
				//    3    7:aload_0         
				//    4    8:getfield        #27  <Field SeekBarBindingAdapter$OnStartTrackingTouch val$start>
				//    5   11:aload_1         
				//    6   12:invokeinterface #50  <Method void SeekBarBindingAdapter$OnStartTrackingTouch.onStartTrackingTouch(SeekBar)>
				//    7   17:return          
				}

				public void onStopTrackingTouch(SeekBar seekbar1)
				{
					if(stop != null)
				//*   0    0:aload_0         
				//*   1    1:getfield        #29  <Field SeekBarBindingAdapter$OnStopTrackingTouch val$stop>
				//*   2    4:ifnull          17
						stop.onStopTrackingTouch(seekbar1);
				//    3    7:aload_0         
				//    4    8:getfield        #29  <Field SeekBarBindingAdapter$OnStopTrackingTouch val$stop>
				//    5   11:aload_1         
				//    6   12:invokeinterface #55  <Method void SeekBarBindingAdapter$OnStopTrackingTouch.onStopTrackingTouch(SeekBar)>
				//    7   17:return          
				}

				final InverseBindingListener val$attrChanged;
				final OnProgressChanged val$progressChanged;
				final OnStartTrackingTouch val$start;
				final OnStopTrackingTouch val$stop;

			
			{
				progressChanged = onprogresschanged;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #23  <Field SeekBarBindingAdapter$OnProgressChanged val$progressChanged>
				attrChanged = inversebindinglistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #25  <Field InverseBindingListener val$attrChanged>
				start = onstarttrackingtouch;
			//    6   10:aload_0         
			//    7   11:aload_3         
			//    8   12:putfield        #27  <Field SeekBarBindingAdapter$OnStartTrackingTouch val$start>
				stop = onstoptrackingtouch;
			//    9   15:aload_0         
			//   10   16:aload           4
			//   11   18:putfield        #29  <Field SeekBarBindingAdapter$OnStopTrackingTouch val$stop>
				super();
			//   12   21:aload_0         
			//   13   22:invokespecial   #32  <Method void Object()>
			//   14   25:return          
			}
			}
);
	//   12   23:aload_0         
	//   13   24:new             #6   <Class SeekBarBindingAdapter$1>
	//   14   27:dup             
	//   15   28:aload_3         
	//   16   29:aload           4
	//   17   31:aload_1         
	//   18   32:aload_2         
	//   19   33:invokespecial   #44  <Method void SeekBarBindingAdapter$1(SeekBarBindingAdapter$OnProgressChanged, InverseBindingListener, SeekBarBindingAdapter$OnStartTrackingTouch, SeekBarBindingAdapter$OnStopTrackingTouch)>
	//   20   36:invokevirtual   #41  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
			return;
	//   21   39:return          
		}
	}

	public static void setProgress(SeekBar seekbar, int i)
	{
		if(i != seekbar.getProgress())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #51  <Method int SeekBar.getProgress()>
	//*   3    5:icmpeq          13
			seekbar.setProgress(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #54  <Method void SeekBar.setProgress(int)>
	//    7   13:return          
	}
}
