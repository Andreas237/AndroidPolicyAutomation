// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home;


// Referenced classes of package com.irobot.home:
//			AccountSettingsActivity_

class AccountSettingsActivity_$5
	implements Runnable
{

	public void run()
	{
		AccountSettingsActivity_.a(c, a, b);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field AccountSettingsActivity_ c>
	//    2    4:aload_0         
	//    3    5:getfield        #21  <Field int a>
	//    4    8:aload_0         
	//    5    9:getfield        #23  <Field int b>
	//    6   12:invokestatic    #30  <Method void AccountSettingsActivity_.a(AccountSettingsActivity_, int, int)>
	//    7   15:return          
	}

	final int a;
	final int b;
	final AccountSettingsActivity_ c;

	AccountSettingsActivity_$5(AccountSettingsActivity_ accountsettingsactivity_, int i, int j)
	{
		c = accountsettingsactivity_;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field AccountSettingsActivity_ c>
		a = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #21  <Field int a>
		b = j;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #23  <Field int b>
		super();
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void Object()>
	//   11   19:return          
	}
}
