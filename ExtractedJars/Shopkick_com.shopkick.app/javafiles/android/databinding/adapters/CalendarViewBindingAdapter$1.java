// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.CalendarView;

// Referenced classes of package android.databinding.adapters:
//			CalendarViewBindingAdapter

static final class CalendarViewBindingAdapter$1
	implements android.widget.ener
{

	public void onSelectedDayChange(CalendarView calendarview, int i, int j, int k)
	{
		android.widget.ener ener = val$onDayChange;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field android.widget.CalendarView$OnDateChangeListener val$onDayChange>
	//    2    4:astore          5
		if(ener != null)
	//*   3    6:aload           5
	//*   4    8:ifnull          23
			ener.onSelectedDayChange(calendarview, i, j, k);
	//    5   11:aload           5
	//    6   13:aload_1         
	//    7   14:iload_2         
	//    8   15:iload_3         
	//    9   16:iload           4
	//   10   18:invokeinterface #29  <Method void android.widget.CalendarView$OnDateChangeListener.onSelectedDayChange(CalendarView, int, int, int)>
		val$attrChange.onChange();
	//   11   23:aload_0         
	//   12   24:getfield        #21  <Field InverseBindingListener val$attrChange>
	//   13   27:invokeinterface #34  <Method void InverseBindingListener.onChange()>
	//   14   32:return          
	}

	final InverseBindingListener val$attrChange;
	final android.widget.ener val$onDayChange;

	CalendarViewBindingAdapter$1(android.widget.ener ener, InverseBindingListener inversebindinglistener)
	{
		val$onDayChange = ener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field android.widget.CalendarView$OnDateChangeListener val$onDayChange>
		val$attrChange = inversebindinglistener;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field InverseBindingListener val$attrChange>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
