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
		if(val$progressChanged != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field SeekBarBindingAdapter$OnProgressChanged val$progressChanged>
	//*   2    4:ifnull          19
			val$progressChanged.onProgressChanged(seekbar, i, flag);
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field SeekBarBindingAdapter$OnProgressChanged val$progressChanged>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:invokeinterface #39  <Method void SeekBarBindingAdapter$OnProgressChanged.onProgressChanged(SeekBar, int, boolean)>
		if(val$attrChanged != null)
	//*   9   19:aload_0         
	//*  10   20:getfield        #25  <Field InverseBindingListener val$attrChanged>
	//*  11   23:ifnull          35
			val$attrChanged.onChange();
	//   12   26:aload_0         
	//   13   27:getfield        #25  <Field InverseBindingListener val$attrChanged>
	//   14   30:invokeinterface #44  <Method void InverseBindingListener.onChange()>
	//   15   35:return          
	}

	public void onStartTrackingTouch(SeekBar seekbar)
	{
		if(val$start != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field SeekBarBindingAdapter$OnStartTrackingTouch val$start>
	//*   2    4:ifnull          17
			val$start.onStartTrackingTouch(seekbar);
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field SeekBarBindingAdapter$OnStartTrackingTouch val$start>
	//    5   11:aload_1         
	//    6   12:invokeinterface #50  <Method void SeekBarBindingAdapter$OnStartTrackingTouch.onStartTrackingTouch(SeekBar)>
	//    7   17:return          
	}

	public void onStopTrackingTouch(SeekBar seekbar)
	{
		if(val$stop != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #29  <Field SeekBarBindingAdapter$OnStopTrackingTouch val$stop>
	//*   2    4:ifnull          17
			val$stop.onStopTrackingTouch(seekbar);
	//    3    7:aload_0         
	//    4    8:getfield        #29  <Field SeekBarBindingAdapter$OnStopTrackingTouch val$stop>
	//    5   11:aload_1         
	//    6   12:invokeinterface #55  <Method void SeekBarBindingAdapter$OnStopTrackingTouch.onStopTrackingTouch(SeekBar)>
	//    7   17:return          
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
