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
	//    1    1:invokespecial   #29  <Method void Object()>
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
	//   10   19:invokevirtual   #44  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
			return;
	//   11   22:return          
		} else
		{
			seekbar.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener(onprogresschanged, inversebindinglistener, onstarttrackingtouch, onstoptrackingtouch) {

				public void onProgressChanged(SeekBar seekbar1, int i, boolean flag)
				{
					OnProgressChanged onprogresschanged1 = progressChanged;
				//    0    0:aload_0         
				//    1    1:getfield        #23  <Field SeekBarBindingAdapter$OnProgressChanged val$progressChanged>
				//    2    4:astore          4
					if(onprogresschanged1 != null)
				//*   3    6:aload           4
				//*   4    8:ifnull          21
						onprogresschanged1.onProgressChanged(seekbar1, i, flag);
				//    5   11:aload           4
				//    6   13:aload_1         
				//    7   14:iload_2         
				//    8   15:iload_3         
				//    9   16:invokeinterface #39  <Method void SeekBarBindingAdapter$OnProgressChanged.onProgressChanged(SeekBar, int, boolean)>
					seekbar1 = ((SeekBar) (attrChanged));
				//   10   21:aload_0         
				//   11   22:getfield        #25  <Field InverseBindingListener val$attrChanged>
				//   12   25:astore_1        
					if(seekbar1 != null)
				//*  13   26:aload_1         
				//*  14   27:ifnull          36
						((InverseBindingListener) (seekbar1)).onChange();
				//   15   30:aload_1         
				//   16   31:invokeinterface #44  <Method void InverseBindingListener.onChange()>
				//   17   36:return          
				}

				public void onStartTrackingTouch(SeekBar seekbar1)
				{
					OnStartTrackingTouch onstarttrackingtouch1 = start;
				//    0    0:aload_0         
				//    1    1:getfield        #27  <Field SeekBarBindingAdapter$OnStartTrackingTouch val$start>
				//    2    4:astore_2        
					if(onstarttrackingtouch1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          16
						onstarttrackingtouch1.onStartTrackingTouch(seekbar1);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #50  <Method void SeekBarBindingAdapter$OnStartTrackingTouch.onStartTrackingTouch(SeekBar)>
				//    8   16:return          
				}

				public void onStopTrackingTouch(SeekBar seekbar1)
				{
					OnStopTrackingTouch onstoptrackingtouch1 = stop;
				//    0    0:aload_0         
				//    1    1:getfield        #29  <Field SeekBarBindingAdapter$OnStopTrackingTouch val$stop>
				//    2    4:astore_2        
					if(onstoptrackingtouch1 != null)
				//*   3    5:aload_2         
				//*   4    6:ifnull          16
						onstoptrackingtouch1.onStopTrackingTouch(seekbar1);
				//    5    9:aload_2         
				//    6   10:aload_1         
				//    7   11:invokeinterface #55  <Method void SeekBarBindingAdapter$OnStopTrackingTouch.onStopTrackingTouch(SeekBar)>
				//    8   16:return          
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
	//   19   33:invokespecial   #47  <Method void SeekBarBindingAdapter$1(SeekBarBindingAdapter$OnProgressChanged, InverseBindingListener, SeekBarBindingAdapter$OnStartTrackingTouch, SeekBarBindingAdapter$OnStopTrackingTouch)>
	//   20   36:invokevirtual   #44  <Method void SeekBar.setOnSeekBarChangeListener(android.widget.SeekBar$OnSeekBarChangeListener)>
			return;
	//   21   39:return          
		}
	}

	public static void setProgress(SeekBar seekbar, int i)
	{
		if(i != seekbar.getProgress())
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:invokevirtual   #54  <Method int SeekBar.getProgress()>
	//*   3    5:icmpeq          13
			seekbar.setProgress(i);
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:invokevirtual   #57  <Method void SeekBar.setProgress(int)>
	//    7   13:return          
	}
}
