// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.content.DialogInterface;
import android.content.Intent;

// Referenced classes of package com.irobot.home:
//			ContactTableViewActivity

class ContactTableViewActivity$1
	implements android.content.ener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.startActivity(a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field ContactTableViewActivity b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field Intent a>
	//    4    8:invokevirtual   #30  <Method void ContactTableViewActivity.startActivity(Intent)>
	//    5   11:return          
	}

	final Intent a;
	final ContactTableViewActivity b;

	ContactTableViewActivity$1(ContactTableViewActivity contacttableviewactivity, Intent intent)
	{
		b = contacttableviewactivity;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field ContactTableViewActivity b>
		a = intent;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field Intent a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
