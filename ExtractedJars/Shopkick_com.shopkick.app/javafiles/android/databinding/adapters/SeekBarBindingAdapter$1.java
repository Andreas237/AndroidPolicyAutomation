// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.SeekBar;

// Referenced classes of package android.databinding.adapters:
//			SeekBarBindingAdapter

static final class SeekBarBindingAdapter$1
	implements android.widget.istener
{

	public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
	{
		ProgressChanged progresschanged = val$progressChanged;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field SeekBarBindingAdapter$OnProgressChanged val$progressChanged>
	//    2    4:astore          4
		if(progresschanged != null)
	//*   3    6:aload           4
	//*   4    8:ifnull          21
			progresschanged.onProgressChanged(seekbar, i, flag);
	//    5   11:aload           4
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:invokeinterface #39  <Method void SeekBarBindingAdapter$OnProgressChanged.onProgressChanged(SeekBar, int, boolean)>
		seekbar = ((SeekBar) (val$attrChanged));
	//   10   21:aload_0         
	//   11   22:getfield        #25  <Field InverseBindingListener val$attrChanged>
	//   12   25:astore_1        
		if(seekbar != null)
	//*  13   26:aload_1         
	//*  14   27:ifnull          36
			((InverseBindingListener) (seekbar)).onChange();
	//   15   30:aload_1         
	//   16   31:invokeinterface #44  <Method void InverseBindingListener.onChange()>
	//   17   36:return          
	}

	public void onStartTrackingTouch(SeekBar seekbar)
	{
		StartTrackingTouch starttrackingtouch = val$start;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field SeekBarBindingAdapter$OnStartTrackingTouch val$start>
	//    2    4:astore_2        
		if(starttrackingtouch != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			starttrackingtouch.onStartTrackingTouch(seekbar);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #50  <Method void SeekBarBindingAdapter$OnStartTrackingTouch.onStartTrackingTouch(SeekBar)>
	//    8   16:return          
	}

	public void onStopTrackingTouch(SeekBar seekbar)
	{
		StopTrackingTouch stoptrackingtouch = val$stop;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field SeekBarBindingAdapter$OnStopTrackingTouch val$stop>
	//    2    4:astore_2        
		if(stoptrackingtouch != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          16
			stoptrackingtouch.onStopTrackingTouch(seekbar);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokeinterface #55  <Method void SeekBarBindingAdapter$OnStopTrackingTouch.onStopTrackingTouch(SeekBar)>
	//    8   16:return          
	}

	final InverseBindingListener val$attrChanged;
	final ProgressChanged val$progressChanged;
	final StartTrackingTouch val$start;
	final StopTrackingTouch val$stop;

	SeekBarBindingAdapter$1(ProgressChanged progresschanged, InverseBindingListener inversebindinglistener, StartTrackingTouch starttrackingtouch, StopTrackingTouch stoptrackingtouch)
	{
		val$progressChanged = progresschanged;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field SeekBarBindingAdapter$OnProgressChanged val$progressChanged>
		val$attrChanged = inversebindinglistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field InverseBindingListener val$attrChanged>
		val$start = starttrackingtouch;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field SeekBarBindingAdapter$OnStartTrackingTouch val$start>
		val$stop = stoptrackingtouch;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field SeekBarBindingAdapter$OnStopTrackingTouch val$stop>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #32  <Method void Object()>
	//   14   25:return          
	}
}
