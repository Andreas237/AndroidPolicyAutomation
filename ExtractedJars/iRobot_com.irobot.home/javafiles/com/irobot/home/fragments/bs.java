// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.widget.TextView;
import com.irobot.home.BaseFragmentActivity;
import com.irobot.home.util.o;
import java.util.Locale;

// Referenced classes of package com.irobot.home.fragments:
//			g

public class bs extends g
{

	public bs()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void g()>
	//    2    4:return          
	}

	void a()
	{
		((BaseFragmentActivity)getActivity()).b(c);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #19  <Method android.app.Activity getActivity()>
	//    2    4:checkcast       #21  <Class BaseFragmentActivity>
	//    3    7:aload_0         
	//    4    8:getfield        #23  <Field int c>
	//    5   11:invokevirtual   #26  <Method void BaseFragmentActivity.b(int)>
		o.c("*** PROVISIONING ***", String.format(Locale.US, getString(c), new Object[0]));
	//    6   14:ldc1            #28  <String "*** PROVISIONING ***">
	//    7   16:getstatic       #34  <Field Locale Locale.US>
	//    8   19:aload_0         
	//    9   20:aload_0         
	//   10   21:getfield        #23  <Field int c>
	//   11   24:invokevirtual   #38  <Method String getString(int)>
	//   12   27:iconst_0        
	//   13   28:anewarray       Object[]
	//   14   31:invokestatic    #46  <Method String String.format(Locale, String, Object[])>
	//   15   34:invokestatic    #51  <Method void o.c(String, String)>
	//   16   37:return          
	}

	TextView a;
	String b;
	int c;
}
