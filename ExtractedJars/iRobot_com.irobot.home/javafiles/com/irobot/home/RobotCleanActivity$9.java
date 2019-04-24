// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home:
//			RobotCleanActivity, WebViewActivity_

class RobotCleanActivity$9
	implements android.content.ckListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(j.i(a))
	//*   0    0:aload_0         
	//*   1    1:getfield        #21  <Field String a>
	//*   2    4:invokestatic    #32  <Method boolean j.i(String)>
	//*   3    7:ifeq            37
		{
			WebViewActivity_.a(((android.content.Context) (b))).a(a).a(Integer.valueOf(0x7f0f05d8)).a();
	//    4   10:aload_0         
	//    5   11:getfield        #19  <Field RobotCleanActivity b>
	//    6   14:invokestatic    #37  <Method WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
	//    7   17:aload_0         
	//    8   18:getfield        #21  <Field String a>
	//    9   21:invokevirtual   #42  <Method WebViewActivity_$a WebViewActivity_$a.a(String)>
	//   10   24:ldc1            #43  <Int 0x7f0f05d8>
	//   11   26:invokestatic    #49  <Method Integer Integer.valueOf(int)>
	//   12   29:invokevirtual   #52  <Method WebViewActivity_$a WebViewActivity_$a.a(Integer)>
	//   13   32:invokevirtual   #55  <Method org.androidannotations.api.a.e WebViewActivity_$a.a()>
	//   14   35:pop             
			return;
	//   15   36:return          
		} else
		{
			(new android.app.AlertDialog.Builder(((android.content.Context) (b)))).setMessage(0x7f0f0925).setPositiveButton(0x7f0f05bb, ((android.content.ckListener) (null))).show();
	//   16   37:new             #57  <Class android.app.AlertDialog$Builder>
	//   17   40:dup             
	//   18   41:aload_0         
	//   19   42:getfield        #19  <Field RobotCleanActivity b>
	//   20   45:invokespecial   #60  <Method void android.app.AlertDialog$Builder(android.content.Context)>
	//   21   48:ldc1            #61  <Int 0x7f0f0925>
	//   22   50:invokevirtual   #65  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setMessage(int)>
	//   23   53:ldc1            #66  <Int 0x7f0f05bb>
	//   24   55:aconst_null     
	//   25   56:invokevirtual   #70  <Method android.app.AlertDialog$Builder android.app.AlertDialog$Builder.setPositiveButton(int, android.content.DialogInterface$OnClickListener)>
	//   26   59:invokevirtual   #74  <Method android.app.AlertDialog android.app.AlertDialog$Builder.show()>
	//   27   62:pop             
			return;
	//   28   63:return          
		}
	}

	final String a;
	final RobotCleanActivity b;

	RobotCleanActivity$9(RobotCleanActivity robotcleanactivity, String s)
	{
		b = robotcleanactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RobotCleanActivity b>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field String a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
