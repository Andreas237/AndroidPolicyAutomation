// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import com.irobot.core.*;
import com.irobot.home.b.ak;
import com.irobot.home.b.z;
import com.irobot.home.util.o;
import java.util.ArrayList;

// Referenced classes of package com.irobot.home:
//			PersistentScheduleActivity

class PersistentScheduleActivity$3 extends ak
{

	public void a(android.support.v7.widget.RecyclerView.u u, ArrayList arraylist)
	{
		arraylist.add(((Object) ((new com.irobot.home.view.RevealableView.a(((Context) (a)))).a(0x7f0600a1).b(0x7f08012c).a(new com.irobot.home.view.RevealableView.b() {

			public void a(int i)
			{
				String s = PersistentScheduleActivity.a(a.a);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field PersistentScheduleActivity$3 a>
			//    2    4:getfield        #24  <Field PersistentScheduleActivity PersistentScheduleActivity$3.a>
			//    3    7:invokestatic    #29  <Method String PersistentScheduleActivity.a(PersistentScheduleActivity)>
			//    4   10:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
			//    5   11:new             #31  <Class StringBuilder>
			//    6   14:dup             
			//    7   15:invokespecial   #32  <Method void StringBuilder()>
			//    8   18:astore_3        
				stringbuilder.append("Swiped schedule at index: ");
			//    9   19:aload_3         
			//   10   20:ldc1            #34  <String "Swiped schedule at index: ">
			//   11   22:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
			//   12   25:pop             
				stringbuilder.append(i);
			//   13   26:aload_3         
			//   14   27:iload_1         
			//   15   28:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
			//   16   31:pop             
				o.a(s, stringbuilder.toString());
			//   17   32:aload_2         
			//   18   33:aload_3         
			//   19   34:invokevirtual   #45  <Method String StringBuilder.toString()>
			//   20   37:invokestatic    #50  <Method void o.a(String, String)>
				if(PersistentScheduleActivity.b(a.a) != null)
			//*  21   40:aload_0         
			//*  22   41:getfield        #16  <Field PersistentScheduleActivity$3 a>
			//*  23   44:getfield        #24  <Field PersistentScheduleActivity PersistentScheduleActivity$3.a>
			//*  24   47:invokestatic    #54  <Method ScheduleUIService PersistentScheduleActivity.b(PersistentScheduleActivity)>
			//*  25   50:ifnull          80
				{
					ScheduleUIServiceData scheduleuiservicedata = ScheduleUIServiceData.create();
			//   26   53:invokestatic    #60  <Method ScheduleUIServiceData ScheduleUIServiceData.create()>
			//   27   56:astore_2        
					scheduleuiservicedata.setScheduleItemIndex(i);
			//   28   57:aload_2         
			//   29   58:iload_1         
			//   30   59:invokevirtual   #63  <Method void ScheduleUIServiceData.setScheduleItemIndex(int)>
					PersistentScheduleActivity.b(a.a).sendCommand(ScheduleUIServiceCommand.MappingScheduleItemSwipe, scheduleuiservicedata);
			//   31   62:aload_0         
			//   32   63:getfield        #16  <Field PersistentScheduleActivity$3 a>
			//   33   66:getfield        #24  <Field PersistentScheduleActivity PersistentScheduleActivity$3.a>
			//   34   69:invokestatic    #54  <Method ScheduleUIService PersistentScheduleActivity.b(PersistentScheduleActivity)>
			//   35   72:getstatic       #69  <Field ScheduleUIServiceCommand ScheduleUIServiceCommand.MappingScheduleItemSwipe>
			//   36   75:aload_2         
			//   37   76:invokevirtual   #75  <Method void ScheduleUIService.sendCommand(ScheduleUIServiceCommand, ScheduleUIServiceData)>
					return;
			//   38   79:return          
				} else
				{
					o.e(PersistentScheduleActivity.a(a.a), "Schedule subsystem null, cannot delete.");
			//   39   80:aload_0         
			//   40   81:getfield        #16  <Field PersistentScheduleActivity$3 a>
			//   41   84:getfield        #24  <Field PersistentScheduleActivity PersistentScheduleActivity$3.a>
			//   42   87:invokestatic    #29  <Method String PersistentScheduleActivity.a(PersistentScheduleActivity)>
			//   43   90:ldc1            #77  <String "Schedule subsystem null, cannot delete.">
			//   44   92:invokestatic    #80  <Method void o.e(String, String)>
					PersistentScheduleActivity.j(a.a).c(i);
			//   45   95:aload_0         
			//   46   96:getfield        #16  <Field PersistentScheduleActivity$3 a>
			//   47   99:getfield        #24  <Field PersistentScheduleActivity PersistentScheduleActivity$3.a>
			//   48  102:invokestatic    #84  <Method z PersistentScheduleActivity.j(PersistentScheduleActivity)>
			//   49  105:iload_1         
			//   50  106:invokevirtual   #89  <Method void z.c(int)>
					a.a.j();
			//   51  109:aload_0         
			//   52  110:getfield        #16  <Field PersistentScheduleActivity$3 a>
			//   53  113:getfield        #24  <Field PersistentScheduleActivity PersistentScheduleActivity$3.a>
			//   54  116:invokevirtual   #91  <Method void PersistentScheduleActivity.j()>
					return;
			//   55  119:return          
				}
			}

			final PersistentScheduleActivity._cls3 a;

			
			{
				a = PersistentScheduleActivity._cls3.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field PersistentScheduleActivity$3 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).a())));
	//    0    0:aload_2         
	//    1    1:new             #24  <Class com.irobot.home.view.RevealableView$a>
	//    2    4:dup             
	//    3    5:aload_0         
	//    4    6:getfield        #17  <Field PersistentScheduleActivity a>
	//    5    9:invokespecial   #27  <Method void com.irobot.home.view.RevealableView$a(Context)>
	//    6   12:ldc1            #28  <Int 0x7f0600a1>
	//    7   14:invokevirtual   #31  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(int)>
	//    8   17:ldc1            #32  <Int 0x7f08012c>
	//    9   19:invokevirtual   #35  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.b(int)>
	//   10   22:new             #11  <Class PersistentScheduleActivity$3$1>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:invokespecial   #38  <Method void PersistentScheduleActivity$3$1(PersistentScheduleActivity$3)>
	//   14   30:invokevirtual   #41  <Method com.irobot.home.view.RevealableView$a com.irobot.home.view.RevealableView$a.a(com.irobot.home.view.RevealableView$b)>
	//   15   33:invokevirtual   #44  <Method com.irobot.home.view.RevealableView com.irobot.home.view.RevealableView$a.a()>
	//   16   36:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//   17   39:pop             
	//   18   40:return          
	}

	final PersistentScheduleActivity a;

	PersistentScheduleActivity$3(PersistentScheduleActivity persistentscheduleactivity, Context context, RecyclerView recyclerview)
	{
		a = persistentscheduleactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field PersistentScheduleActivity a>
		super(context, recyclerview);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #20  <Method void ak(Context, RecyclerView)>
	//    7   11:return          
	}
}
