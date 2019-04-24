// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.os.Parcelable;

// Referenced classes of package com.irobot.home:
//			RoombaV1LanguageListActivity_

class RoombaV1LanguageListActivity_$9 extends org.androidannotations.api.a.a
{

	public void a()
	{
		try
		{
			RoombaV1LanguageListActivity_.a(b, a);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field RoombaV1LanguageListActivity_ b>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field Parcelable a>
	//    4    8:invokestatic    #29  <Method void RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_, Parcelable)>
			return;
	//    5   11:return          
		}
		catch(Throwable throwable)
	//*   6   12:astore_1        
		{
			Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
	//    7   13:invokestatic    #35  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//    8   16:invokestatic    #39  <Method Thread Thread.currentThread()>
	//    9   19:aload_1         
	//   10   20:invokeinterface #45  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
	//   11   25:return          
	}

	final Parcelable a;
	final RoombaV1LanguageListActivity_ b;

	RoombaV1LanguageListActivity_$9(RoombaV1LanguageListActivity_ roombav1languagelistactivity_, String s, long l, String s1, Parcelable parcelable)
	{
		b = roombav1languagelistactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field RoombaV1LanguageListActivity_ b>
		a = parcelable;
	//    3    5:aload_0         
	//    4    6:aload           6
	//    5    8:putfield        #19  <Field Parcelable a>
		super(s, l, s1);
	//    6   11:aload_0         
	//    7   12:aload_2         
	//    8   13:lload_3         
	//    9   14:aload           5
	//   10   16:invokespecial   #22  <Method void org.androidannotations.api.a$a(String, long, String)>
	//   11   19:return          
	}
}
