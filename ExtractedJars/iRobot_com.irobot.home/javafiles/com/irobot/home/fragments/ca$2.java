// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.DialogInterface;

// Referenced classes of package com.irobot.home.fragments:
//			ca

class ca$2
	implements android.content.gInterface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		b.i.a(a);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ca b>
	//    2    4:getfield        #30  <Field ca$a ca.i>
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field ca$a$a a>
	//    5   11:invokeinterface #35  <Method void ca$a.a(ca$a$a)>
	//    6   16:return          
	}

	final a a;
	final ca b;

	ca$2(ca ca1, a a1)
	{
		b = ca1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ca b>
		a = a1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #20  <Field ca$a$a a>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #23  <Method void Object()>
	//    8   14:return          
	}
}
