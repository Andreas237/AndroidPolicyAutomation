// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import com.irobot.home.q.b;

// Referenced classes of package com.irobot.home:
//			DeveloperActivity

class DeveloperActivity$5
	implements android.content.ickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		a.r.a(((com.irobot.home.q.b.a) (a)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field DeveloperActivity a>
	//    2    4:getfield        #26  <Field b DeveloperActivity.r>
	//    3    7:aload_0         
	//    4    8:getfield        #17  <Field DeveloperActivity a>
	//    5   11:invokevirtual   #31  <Method void b.a(com.irobot.home.q.b$a)>
		a.r.b();
	//    6   14:aload_0         
	//    7   15:getfield        #17  <Field DeveloperActivity a>
	//    8   18:getfield        #26  <Field b DeveloperActivity.r>
	//    9   21:invokevirtual   #34  <Method void b.b()>
	//   10   24:return          
	}

	final DeveloperActivity a;

	DeveloperActivity$5(DeveloperActivity developeractivity)
	{
		a = developeractivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field DeveloperActivity a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
