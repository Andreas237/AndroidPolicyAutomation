// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.app.Activity;
import android.view.*;
import com.irobot.core.AssetId;
import com.irobot.home.util.f;
import com.irobot.home.util.j;
import java.util.Timer;
import java.util.TimerTask;

// Referenced classes of package com.irobot.home:
//			IRobotApplication, BugReportActivity_

class IRobotApplication$1
	implements android.view.
{

	public boolean onTouch(View view, MotionEvent motionevent)
	{
		if(IRobotApplication.a(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field IRobotApplication b>
	//*   2    4:invokestatic    #32  <Method Timer IRobotApplication.a(IRobotApplication)>
	//*   3    7:ifnull          20
			IRobotApplication.a(b).cancel();
	//    4   10:aload_0         
	//    5   11:getfield        #21  <Field IRobotApplication b>
	//    6   14:invokestatic    #32  <Method Timer IRobotApplication.a(IRobotApplication)>
	//    7   17:invokevirtual   #37  <Method void Timer.cancel()>
		if(3 <= IRobotApplication.q())
	//*   8   20:iconst_3        
	//*   9   21:invokestatic    #41  <Method int IRobotApplication.q()>
	//*  10   24:icmpgt          99
		{
			IRobotApplication.a(0);
	//   11   27:iconst_0        
	//   12   28:invokestatic    #44  <Method int IRobotApplication.a(int)>
	//   13   31:pop             
			view = ((View) (f.a(a.getWindow().getDecorView().getRootView(), "screenshot", ((android.content.Context) (a)))));
	//   14   32:aload_0         
	//   15   33:getfield        #23  <Field Activity a>
	//   16   36:invokevirtual   #50  <Method Window Activity.getWindow()>
	//   17   39:invokevirtual   #56  <Method View Window.getDecorView()>
	//   18   42:invokevirtual   #61  <Method View View.getRootView()>
	//   19   45:ldc1            #63  <String "screenshot">
	//   20   47:aload_0         
	//   21   48:getfield        #23  <Field Activity a>
	//   22   51:invokestatic    #68  <Method String f.a(View, String, android.content.Context)>
	//   23   54:astore_1        
			view = ((View) (()BugReportActivity_.a(((android.content.Context) (b))).b(((String) (view))).g(0x10000000)));
	//   24   55:aload_0         
	//   25   56:getfield        #21  <Field IRobotApplication b>
	//   26   59:invokestatic    #73  <Method BugReportActivity_$a BugReportActivity_.a(android.content.Context)>
	//   27   62:aload_1         
	//   28   63:invokevirtual   #78  <Method BugReportActivity_$a BugReportActivity_$a.b(String)>
	//   29   66:ldc1            #79  <Int 0x10000000>
	//   30   68:invokevirtual   #83  <Method org.androidannotations.api.a.d BugReportActivity_$a.g(int)>
	//   31   71:checkcast       #75  <Class BugReportActivity_$a>
	//   32   74:astore_1        
			motionevent = ((MotionEvent) (j.k()));
	//   33   75:invokestatic    #89  <Method AssetId j.k()>
	//   34   78:astore_2        
			if(motionevent != null)
	//*  35   79:aload_2         
	//*  36   80:ifnull          92
				(() (view)).a(((AssetId) (motionevent)).getId());
	//   37   83:aload_1         
	//   38   84:aload_2         
	//   39   85:invokevirtual   #95  <Method String AssetId.getId()>
	//   40   88:invokevirtual   #97  <Method BugReportActivity_$a BugReportActivity_$a.a(String)>
	//   41   91:pop             
			(() (view)).a();
	//   42   92:aload_1         
	//   43   93:invokevirtual   #100 <Method org.androidannotations.api.a.e BugReportActivity_$a.a()>
	//   44   96:pop             
			return false;
	//   45   97:iconst_0        
	//   46   98:ireturn         
		} else
		{
			IRobotApplication.a(b, new Timer());
	//   47   99:aload_0         
	//   48  100:getfield        #21  <Field IRobotApplication b>
	//   49  103:new             #34  <Class Timer>
	//   50  106:dup             
	//   51  107:invokespecial   #101 <Method void Timer()>
	//   52  110:invokestatic    #104 <Method Timer IRobotApplication.a(IRobotApplication, Timer)>
	//   53  113:pop             
			IRobotApplication.a(b).schedule(((TimerTask) (new TimerTask() {

				public void run()
				{
					IRobotApplication.a(0);
				//    0    0:iconst_0        
				//    1    1:invokestatic    #25  <Method int IRobotApplication.a(int)>
				//    2    4:pop             
				//    3    5:return          
				}

				final IRobotApplication._cls1 a;

			
			{
				a = IRobotApplication._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #15  <Field IRobotApplication$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void TimerTask()>
			//    5    9:return          
			}
			}
)), 500L);
	//   54  114:aload_0         
	//   55  115:getfield        #21  <Field IRobotApplication b>
	//   56  118:invokestatic    #32  <Method Timer IRobotApplication.a(IRobotApplication)>
	//   57  121:new             #13  <Class IRobotApplication$1$1>
	//   58  124:dup             
	//   59  125:aload_0         
	//   60  126:invokespecial   #107 <Method void IRobotApplication$1$1(IRobotApplication$1)>
	//   61  129:ldc2w           #108 <Long 500L>
	//   62  132:invokevirtual   #113 <Method void Timer.schedule(TimerTask, long)>
			return false;
	//   63  135:iconst_0        
	//   64  136:ireturn         
		}
	}

	final Activity a;
	final IRobotApplication b;

	IRobotApplication$1(IRobotApplication irobotapplication, Activity activity)
	{
		b = irobotapplication;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #21  <Field IRobotApplication b>
		a = activity;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #23  <Field Activity a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #26  <Method void Object()>
	//    8   14:return          
	}
}
