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
		if(val$onDayChange != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field android.widget.CalendarView$OnDateChangeListener val$onDayChange>
	//*   2    4:ifnull          21
			val$onDayChange.onSelectedDayChange(calendarview, i, j, k);
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field android.widget.CalendarView$OnDateChangeListener val$onDayChange>
	//    5   11:aload_1         
	//    6   12:iload_2         
	//    7   13:iload_3         
	//    8   14:iload           4
	//    9   16:invokeinterface #29  <Method void android.widget.CalendarView$OnDateChangeListener.onSelectedDayChange(CalendarView, int, int, int)>
		val$attrChange.onChange();
	//   10   21:aload_0         
	//   11   22:getfield        #21  <Field InverseBindingListener val$attrChange>
	//   12   25:invokeinterface #34  <Method void InverseBindingListener.onChange()>
	//   13   30:return          
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
