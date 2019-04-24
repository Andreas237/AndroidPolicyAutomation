// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.pactforcure.app.ui;

import android.view.View;

final class SettingsActivity$2$$Lambda$1
	implements android.view.View.OnClickListener
{

	public static android.view.View.OnClickListener lambdaFactory$()
	{
		return ((android.view.View.OnClickListener) (instance));
	//    0    0:getstatic       #15  <Field SettingsActivity$2$$Lambda$1 instance>
	//    1    3:areturn         
	}

	public void onClick(View view)
	{
		SettingsActivity._cls2.lambda$onError$49(view);
	//    0    0:aload_1         
	//    1    1:invokestatic    #26  <Method void SettingsActivity$2.lambda$onError$49(View)>
	//    2    4:return          
	}

	private static final SettingsActivity$2$$Lambda$1 instance = new SettingsActivity$2$$Lambda$1();

	static 
	{
	//    0    0:new             #2   <Class SettingsActivity$2$$Lambda$1>
	//    1    3:dup             
	//    2    4:invokespecial   #13  <Method void SettingsActivity$2$$Lambda$1()>
	//    3    7:putstatic       #15  <Field SettingsActivity$2$$Lambda$1 instance>
	//*   4   10:return          
	}

	private SettingsActivity$2$$Lambda$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}
}
