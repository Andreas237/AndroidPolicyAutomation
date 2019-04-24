// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			RoombaV1LanguageListActivity_

class RoombaV1LanguageListActivity_$5
	implements Runnable
{

	public void run()
	{
		RoombaV1LanguageListActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field RoombaV1LanguageListActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field boolean a>
	//    4    8:invokestatic    #27  <Method void RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_, boolean)>
	//    5   11:return          
	}

	final boolean a;
	final RoombaV1LanguageListActivity_ b;

	RoombaV1LanguageListActivity_$5(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, boolean flag)
	{
		b = roombav1languagelistactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field RoombaV1LanguageListActivity_ b>
		a = flag;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #20  <Field boolean a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
