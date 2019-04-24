// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.support.v4.app.Fragment;
import com.irobot.home.MapPrivacyActivity_;
import com.irobot.home.view.CustomButton;

public class ab extends Fragment
{

	public ab()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Fragment()>
	//    2    4:return          
	}

	void a()
	{
		MapPrivacyActivity_.a(((android.content.Context) (getActivity()))).a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #15  <Method android.support.v4.app.FragmentActivity getActivity()>
	//    2    4:invokestatic    #20  <Method com.irobot.home.MapPrivacyActivity_$a MapPrivacyActivity_.a(android.content.Context)>
	//    3    7:invokevirtual   #25  <Method org.androidannotations.api.a.e com.irobot.home.MapPrivacyActivity_$a.a()>
	//    4   10:pop             
	//    5   11:return          
	}

	CustomButton a;
}
