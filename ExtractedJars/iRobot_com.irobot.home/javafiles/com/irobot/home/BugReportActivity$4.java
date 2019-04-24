// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.util.f;

// Referenced classes of package com.irobot.home:
//			BugReportActivity

class BugReportActivity$4
	implements Runnable
{

	public void run()
	{
		BugReportActivity.e(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BugReportActivity a>
	//    2    4:invokestatic    #26  <Method void BugReportActivity.e(BugReportActivity)>
		a.j = (new android.support.v7.app.a.a(((android.content.Context) (a)))).b(0x7f0f02f0).a(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
				f.a();
			//    0    0:invokestatic    #26  <Method void f.a()>
				a.a.finish();
			//    1    3:aload_0         
			//    2    4:getfield        #17  <Field BugReportActivity$4 a>
			//    3    7:getfield        #29  <Field BugReportActivity BugReportActivity$4.a>
			//    4   10:invokevirtual   #34  <Method void BugReportActivity.finish()>
			//    5   13:return          
			}

			final BugReportActivity._cls4 a;

			
			{
				a = BugReportActivity._cls4.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BugReportActivity$4 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).c();
	//    3    7:aload_0         
	//    4    8:getfield        #19  <Field BugReportActivity a>
	//    5   11:new             #28  <Class android.support.v7.app.a$a>
	//    6   14:dup             
	//    7   15:aload_0         
	//    8   16:getfield        #19  <Field BugReportActivity a>
	//    9   19:invokespecial   #31  <Method void android.support.v7.app.a$a(android.content.Context)>
	//   10   22:ldc1            #32  <Int 0x7f0f02f0>
	//   11   24:invokevirtual   #36  <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
	//   12   27:ldc1            #37  <Int 0x7f0f05bb>
	//   13   29:new             #13  <Class BugReportActivity$4$1>
	//   14   32:dup             
	//   15   33:aload_0         
	//   16   34:invokespecial   #40  <Method void BugReportActivity$4$1(BugReportActivity$4)>
	//   17   37:invokevirtual   #43  <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   18   40:invokevirtual   #47  <Method android.support.v7.app.a android.support.v7.app.a$a.c()>
	//   19   43:putfield        #51  <Field android.support.v7.app.a BugReportActivity.j>
	//   20   46:return          
	}

	final BugReportActivity a;

	BugReportActivity$4(BugReportActivity bugreportactivity)
	{
		a = bugreportactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field BugReportActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
