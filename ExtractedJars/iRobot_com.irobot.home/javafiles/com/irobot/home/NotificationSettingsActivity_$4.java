// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;

import android.widget.CompoundButton;

// Referenced classes of package com.irobot.home:
//			NotificationSettingsActivity_

class NotificationSettingsActivity_$4 extends org.androidannotations.api.a.a
{

	public void a()
	{
		try
		{
			NotificationSettingsActivity_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field NotificationSettingsActivity_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field CompoundButton a>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field boolean b>
	//    6   12:invokestatic    #33  <Method void NotificationSettingsActivity_.a(NotificationSettingsActivity_, CompoundButton, boolean)>
			return;
	//    7   15:return          
		}
		catch(Throwable throwable)
	//*   8   16:astore_1        
		{
			Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), throwable);
	//    9   17:invokestatic    #39  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//   10   20:invokestatic    #43  <Method Thread Thread.currentThread()>
	//   11   23:aload_1         
	//   12   24:invokeinterface #49  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
		}
	//   13   29:return          
	}

	final CompoundButton a;
	final boolean b;
	final NotificationSettingsActivity_ c;

	NotificationSettingsActivity_$4(NotificationSettingsActivity_ notificationsettingsactivity_, String s, long l, String s1, CompoundButton compoundbutton, boolean flag)
	{
		c = notificationsettingsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field NotificationSettingsActivity_ c>
		a = compoundbutton;
	//    3    5:aload_0         
	//    4    6:aload           6
	//    5    8:putfield        #21  <Field CompoundButton a>
		b = flag;
	//    6   11:aload_0         
	//    7   12:iload           7
	//    8   14:putfield        #23  <Field boolean b>
		super(s, l, s1);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:lload_3         
	//   12   20:aload           5
	//   13   22:invokespecial   #26  <Method void org.androidannotations.api.a$a(String, long, String)>
	//   14   25:return          
	}
}
