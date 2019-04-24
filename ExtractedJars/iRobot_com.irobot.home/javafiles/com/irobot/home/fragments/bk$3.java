// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.DialogInterface;
import com.irobot.core.MissionStatusAction;

// Referenced classes of package com.irobot.home.fragments:
//			bk

class bk$3
	implements android.content.gInterface.OnDismissListener
{

	public void onDismiss(DialogInterface dialoginterface)
	{
		a.a.a(MissionStatusAction.Cancel);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field bk a>
	//    2    4:getfield        #25  <Field i$a bk.a>
	//    3    7:getstatic       #31  <Field MissionStatusAction MissionStatusAction.Cancel>
	//    4   10:invokeinterface #36  <Method void i$a.a(MissionStatusAction)>
	//    5   15:return          
	}

	final bk a;

	bk$3(bk bk1)
	{
		a = bk1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field bk a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
