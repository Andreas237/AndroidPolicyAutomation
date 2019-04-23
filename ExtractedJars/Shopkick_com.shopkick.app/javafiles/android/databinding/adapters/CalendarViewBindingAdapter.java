// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.databinding.adapters;

import android.databinding.InverseBindingListener;
import android.widget.CalendarView;

public class CalendarViewBindingAdapter
{

	public CalendarViewBindingAdapter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static void setDate(CalendarView calendarview, long l)
	{
		if(calendarview.getDate() != l)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #30  <Method long CalendarView.getDate()>
	//*   2    4:lload_1         
	//*   3    5:lcmp            
	//*   4    6:ifeq            14
			calendarview.setDate(l);
	//    5    9:aload_0         
	//    6   10:lload_1         
	//    7   11:invokevirtual   #33  <Method void CalendarView.setDate(long)>
	//    8   14:return          
	}

	public static void setListeners(CalendarView calendarview, android.widget.CalendarView.OnDateChangeListener ondatechangelistener, InverseBindingListener inversebindinglistener)
	{
		if(inversebindinglistener == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       10
		{
			calendarview.setOnDateChangeListener(ondatechangelistener);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method void CalendarView.setOnDateChangeListener(android.widget.CalendarView$OnDateChangeListener)>
			return;
	//    5    9:return          
		} else
		{
			calendarview.setOnDateChangeListener(new android.widget.CalendarView.OnDateChangeListener(ondatechangelistener, inversebindinglistener) {

				public void onSelectedDayChange(CalendarView calendarview1, int i, int j, int k)
				{
					android.widget.CalendarView.OnDateChangeListener ondatechangelistener1 = onDayChange;
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field android.widget.CalendarView$OnDateChangeListener val$onDayChange>
				//    2    4:astore          5
					if(ondatechangelistener1 != null)
				//*   3    6:aload           5
				//*   4    8:ifnull          23
						ondatechangelistener1.onSelectedDayChange(calendarview1, i, j, k);
				//    5   11:aload           5
				//    6   13:aload_1         
				//    7   14:iload_2         
				//    8   15:iload_3         
				//    9   16:iload           4
				//   10   18:invokeinterface #29  <Method void android.widget.CalendarView$OnDateChangeListener.onSelectedDayChange(CalendarView, int, int, int)>
					attrChange.onChange();
				//   11   23:aload_0         
				//   12   24:getfield        #21  <Field InverseBindingListener val$attrChange>
				//   13   27:invokeinterface #34  <Method void InverseBindingListener.onChange()>
				//   14   32:return          
				}

				final InverseBindingListener val$attrChange;
				final android.widget.CalendarView.OnDateChangeListener val$onDayChange;

			
			{
				onDayChange = ondatechangelistener;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field android.widget.CalendarView$OnDateChangeListener val$onDayChange>
				attrChange = inversebindinglistener;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field InverseBindingListener val$attrChange>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   10:aload_0         
	//    7   11:new             #6   <Class CalendarViewBindingAdapter$1>
	//    8   14:dup             
	//    9   15:aload_1         
	//   10   16:aload_2         
	//   11   17:invokespecial   #47  <Method void CalendarViewBindingAdapter$1(android.widget.CalendarView$OnDateChangeListener, InverseBindingListener)>
	//   12   20:invokevirtual   #44  <Method void CalendarView.setOnDateChangeListener(android.widget.CalendarView$OnDateChangeListener)>
			return;
	//   13   23:return          
		}
	}
}
