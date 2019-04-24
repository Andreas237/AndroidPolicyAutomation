// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.model.rest.ContactInfo;

// Referenced classes of package com.irobot.home:
//			ContactTableViewActivity_

class ContactTableViewActivity_$6
	implements Runnable
{

	public void run()
	{
		ContactTableViewActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContactTableViewActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field ContactInfo a>
	//    4    8:invokestatic    #27  <Method void ContactTableViewActivity_.a(ContactTableViewActivity_, ContactInfo)>
	//    5   11:return          
	}

	final ContactInfo a;
	final ContactTableViewActivity_ b;

	ContactTableViewActivity_$6(ContactTableViewActivity_ contacttableviewactivity_, ContactInfo contactinfo)
	{
		b = contacttableviewactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ContactTableViewActivity_ b>
		a = contactinfo;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ContactInfo a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
