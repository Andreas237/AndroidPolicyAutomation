// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			RoombaV2LanguageListActivity_

class RoombaV2LanguageListActivity_$10
	implements Runnable
{

	public void run()
	{
		RoombaV2LanguageListActivity_.c(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RoombaV2LanguageListActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int a>
	//    4    8:invokestatic    #29  <Method void RoombaV2LanguageListActivity_.c(RoombaV2LanguageListActivity_, int)>
	//    5   11:return          
	}

	final int a;
	final RoombaV2LanguageListActivity_ b;

	RoombaV2LanguageListActivity_$10(RoombaV2LanguageListActivity_ roombav2languagelistactivity_, int i)
	{
		b = roombav2languagelistactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RoombaV2LanguageListActivity_ b>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
