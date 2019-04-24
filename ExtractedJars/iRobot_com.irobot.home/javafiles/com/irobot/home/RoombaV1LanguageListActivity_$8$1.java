// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import com.irobot.home.model.rest.LanguagePack;
import org.androidannotations.api.a;

// Referenced classes of package com.irobot.home:
//			RoombaV1LanguageListActivity_

class RoombaV1LanguageListActivity_$8$1 extends org.androidannotations.api.a.a
{

	public void a()
	{
		try
		{
			com.irobot.home.RoombaV1LanguageListActivity_.a(a.b, a.a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field RoombaV1LanguageListActivity_$8 a>
	//    2    4:getfield        #24  <Field RoombaV1LanguageListActivity_ RoombaV1LanguageListActivity_$8.b>
	//    3    7:aload_0         
	//    4    8:getfield        #14  <Field RoombaV1LanguageListActivity_$8 a>
	//    5   11:getfield        #27  <Field LanguagePack com.irobot.home.RoombaV1LanguageListActivity_$8.a>
	//    6   14:invokestatic    #32  <Method void com.irobot.home.RoombaV1LanguageListActivity_.a(RoombaV1LanguageListActivity_, LanguagePack)>
			return;
	//    7   17:return          
		}
		catch(Throwable throwable)
	//*   8   18:astore_1        
		{
			Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
	//    9   19:invokestatic    #38  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//   10   22:invokestatic    #42  <Method Thread Thread.currentThread()>
	//   11   25:aload_1         
	//   12   26:invokeinterface #48  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
	//   13   31:return          
	}

	final RoombaV1LanguageListActivity_._cls8 a;

	RoombaV1LanguageListActivity_$8$1(RoombaV1LanguageListActivity_._cls8 _pcls8, String s, long l, String s1)
	{
		a = _pcls8;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field RoombaV1LanguageListActivity_$8 a>
		super(s, l, s1);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:lload_3         
	//    6    8:aload           5
	//    7   10:invokespecial   #17  <Method void org.androidannotations.api.a$a(String, long, String)>
	//    8   13:return          
	}

	// Unreferenced inner class com/irobot/home/RoombaV1LanguageListActivity_$8

/* anonymous class */
	class RoombaV1LanguageListActivity_._cls8 extends org.androidannotations.api.a.a
	{

		public void a()
		{
			try
			{
				org.androidannotations.api.a.a(((org.androidannotations.api.a.a) (new RoombaV1LanguageListActivity_._cls8._cls1(this, "", 0L, ""))));
		//    0    0:new             #11  <Class RoombaV1LanguageListActivity_$8$1>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:ldc1            #29  <String "">
		//    4    7:lconst_0        
		//    5    8:ldc1            #29  <String "">
		//    6   10:invokespecial   #32  <Method void RoombaV1LanguageListActivity_$8$1(RoombaV1LanguageListActivity_$8, String, long, String)>
		//    7   13:invokestatic    #37  <Method void a.a(org.androidannotations.api.a$a)>
				return;
		//    8   16:return          
			}
			catch(Throwable throwable)
		//*   9   17:astore_1        
			{
				Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
		//   10   18:invokestatic    #43  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
		//   11   21:invokestatic    #47  <Method Thread Thread.currentThread()>
		//   12   24:aload_1         
		//   13   25:invokeinterface #53  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
			}
		//   14   30:return          
		}

		final LanguagePack a;
		final RoombaV1LanguageListActivity_ b;

			
			{
				b = roombav1languagelistactivity_;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field RoombaV1LanguageListActivity_ b>
				a = languagepack;
			//    3    5:aload_0         
			//    4    6:aload           6
			//    5    8:putfield        #20  <Field LanguagePack a>
				super(s, l, s1);
			//    6   11:aload_0         
			//    7   12:aload_2         
			//    8   13:lload_3         
			//    9   14:aload           5
			//   10   16:invokespecial   #23  <Method void org.androidannotations.api.a$a(String, long, String)>
			//   11   19:return          
			}
	}

}
