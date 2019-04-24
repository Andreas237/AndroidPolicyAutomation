// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.Button;

// Referenced classes of package com.irobot.home:
//			BugReportActivity

class BugReportActivity$3
	implements Runnable
{

	public void run()
	{
		BugReportActivity.e(a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field BugReportActivity a>
	//    2    4:invokestatic    #24  <Method void BugReportActivity.e(BugReportActivity)>
		a.f.setEnabled(true);
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field BugReportActivity a>
	//    5   11:getfield        #28  <Field Button BugReportActivity.f>
	//    6   14:iconst_1        
	//    7   15:invokevirtual   #34  <Method void Button.setEnabled(boolean)>
		a.k = (new android.support.v7.app.a.a(((android.content.Context) (a)))).b(0x7f0f0171).a(0x7f0f05bb, ((android.content.ickListener) (null))).c();
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field BugReportActivity a>
	//   10   22:new             #36  <Class android.support.v7.app.a$a>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:getfield        #17  <Field BugReportActivity a>
	//   14   30:invokespecial   #39  <Method void android.support.v7.app.a$a(android.content.Context)>
	//   15   33:ldc1            #40  <Int 0x7f0f0171>
	//   16   35:invokevirtual   #44  <Method android.support.v7.app.a$a android.support.v7.app.a$a.b(int)>
	//   17   38:ldc1            #45  <Int 0x7f0f05bb>
	//   18   40:aconst_null     
	//   19   41:invokevirtual   #48  <Method android.support.v7.app.a$a android.support.v7.app.a$a.a(int, android.content.DialogInterface$OnClickListener)>
	//   20   44:invokevirtual   #52  <Method android.support.v7.app.a android.support.v7.app.a$a.c()>
	//   21   47:putfield        #56  <Field android.support.v7.app.a BugReportActivity.k>
	//   22   50:return          
	}

	final BugReportActivity a;

	BugReportActivity$3(BugReportActivity bugreportactivity)
	{
		a = bugreportactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field BugReportActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
