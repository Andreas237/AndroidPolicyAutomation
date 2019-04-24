// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.widget.Button;

// Referenced classes of package com.irobot.home:
//			BugReportActivity

class BugReportActivity$5
	implements Runnable
{

	public void run()
	{
		a.f.setEnabled(true);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field BugReportActivity a>
	//    2    4:getfield        #27  <Field Button BugReportActivity.f>
	//    3    7:iconst_1        
	//    4    8:invokevirtual   #33  <Method void Button.setEnabled(boolean)>
		BugReportActivity.e(a);
	//    5   11:aload_0         
	//    6   12:getfield        #19  <Field BugReportActivity a>
	//    7   15:invokestatic    #36  <Method void BugReportActivity.e(BugReportActivity)>
		a.j = (new android.support.v7.app.a.a(((android.content.Context) (a)))).b(0x7f0f02ec).a(0x7f0f05bb, new android.content.DialogInterface.OnClickListener() {

			public void onClick(DialogInterface dialoginterface, int i)
			{
			//    0    0:return          
			}

			final BugReportActivity._cls5 a;

			
			{
				a = BugReportActivity._cls5.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field BugReportActivity$5 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
).c();
	//    8   18:aload_0         
	//    9   19:getfield        #19  <Field BugReportActivity a>
	//   10   22:new             #38  <Class android.support.v7.app.a$a>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:getfield        #19  <Field BugReportActivity a>
	//   14   30:invokespecial   #41  <Method void android.support.v7.app.a$a(android.content.Context)>
	//   15   33:ldc1            #42  <Int 0x7f0f02ec>
	//   16   35:invokevirtual   #46  <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
	//   17   38:ldc1            #47  <Int 0x7f0f05bb>
	//   18   40:new             #13  <Class BugReportActivity$5$1>
	//   19   43:dup             
	//   20   44:aload_0         
	//   21   45:invokespecial   #50  <Method void BugReportActivity$5$1(BugReportActivity$5)>
	//   22   48:invokevirtual   #53  <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   23   51:invokevirtual   #57  <Method android.support.v7.app.a android.support.v7.app.a$a.c()>
	//   24   54:putfield        #60  <Field android.support.v7.app.a BugReportActivity.j>
	//   25   57:return          
	}

	final BugReportActivity a;

	BugReportActivity$5(BugReportActivity bugreportactivity)
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
