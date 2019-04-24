// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.core.EventType;
import com.irobot.home.i.a;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity

class DeveloperActivity$3
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		if(DeveloperActivity.b(b) != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field DeveloperActivity b>
	//*   2    4:invokestatic    #28  <Method a DeveloperActivity.b(DeveloperActivity)>
	//*   3    7:ifnull          27
			DeveloperActivity.b(b).b(((Object) (a)), EventType.NetworkDiagnosticEvent);
	//    4   10:aload_0         
	//    5   11:getfield        #18  <Field DeveloperActivity b>
	//    6   14:invokestatic    #28  <Method a DeveloperActivity.b(DeveloperActivity)>
	//    7   17:aload_0         
	//    8   18:getfield        #20  <Field DeveloperActivity a>
	//    9   21:getstatic       #34  <Field EventType EventType.NetworkDiagnosticEvent>
	//   10   24:invokevirtual   #39  <Method void a.b(Object, EventType)>
		com.irobot.home.DeveloperActivity.a(b, ((android.widget.TextView) (null)));
	//   11   27:aload_0         
	//   12   28:getfield        #18  <Field DeveloperActivity b>
	//   13   31:aconst_null     
	//   14   32:invokestatic    #42  <Method android.widget.TextView com.irobot.home.DeveloperActivity.a(DeveloperActivity, android.widget.TextView)>
	//   15   35:pop             
		com.irobot.home.DeveloperActivity.a(b, 0);
	//   16   36:aload_0         
	//   17   37:getfield        #18  <Field DeveloperActivity b>
	//   18   40:iconst_0        
	//   19   41:invokestatic    #45  <Method int com.irobot.home.DeveloperActivity.a(DeveloperActivity, int)>
	//   20   44:pop             
	//   21   45:return          
	}

	final DeveloperActivity a;
	final DeveloperActivity b;

	DeveloperActivity$3(DeveloperActivity developeractivity, DeveloperActivity developeractivity1)
	{
		b = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DeveloperActivity b>
		a = developeractivity1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field DeveloperActivity a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void Object()>
	//    8   14:return          
	}
}
