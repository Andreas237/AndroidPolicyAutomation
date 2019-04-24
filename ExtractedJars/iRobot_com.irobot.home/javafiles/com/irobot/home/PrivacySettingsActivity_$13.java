// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			PrivacySettingsActivity_

class PrivacySettingsActivity_$13
	implements Runnable
{

	public void run()
	{
		PrivacySettingsActivity_.a(d, a, b, c);
	//    0    0:aload_0         
	//    1    1:getfield        #22  <Field PrivacySettingsActivity_ d>
	//    2    4:aload_0         
	//    3    5:getfield        #24  <Field String a>
	//    4    8:aload_0         
	//    5    9:getfield        #26  <Field boolean b>
	//    6   12:aload_0         
	//    7   13:getfield        #28  <Field int c>
	//    8   16:invokestatic    #35  <Method void PrivacySettingsActivity_.a(PrivacySettingsActivity_, String, boolean, int)>
	//    9   19:return          
	}

	final String a;
	final boolean b;
	final int c;
	final PrivacySettingsActivity_ d;

	PrivacySettingsActivity_$13(PrivacySettingsActivity_ privacysettingsactivity_, String s, boolean flag, int i)
	{
		d = privacysettingsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #22  <Field PrivacySettingsActivity_ d>
		a = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #24  <Field String a>
		b = flag;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #26  <Field boolean b>
		c = i;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #28  <Field int c>
		super();
	//   12   21:aload_0         
	//   13   22:invokespecial   #31  <Method void Object()>
	//   14   25:return          
	}
}
