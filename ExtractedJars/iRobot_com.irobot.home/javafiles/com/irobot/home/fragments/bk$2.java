// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.DialogInterface;
import com.irobot.core.MissionStatusAction;

// Referenced classes of package com.irobot.home.fragments:
//			bk

class bk$2
	implements android.content.gInterface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		switch(i)
	//*   0    0:iload_2         
		{
	//*   1    1:tableswitch     0 1: default 24
	//	               0 67
	//	               1 40
		default:
			a.a.a(MissionStatusAction.Cancel);
	//    2   24:aload_0         
	//    3   25:getfield        #17  <Field bk a>
	//    4   28:getfield        #25  <Field i$a bk.a>
	//    5   31:getstatic       #31  <Field MissionStatusAction MissionStatusAction.Cancel>
	//    6   34:invokeinterface #36  <Method void i$a.a(MissionStatusAction)>
			return;
	//    7   39:return          

		case 1: // '\001'
			if(bk.g(a))
	//*   8   40:aload_0         
	//*   9   41:getfield        #17  <Field bk a>
	//*  10   44:invokestatic    #39  <Method boolean bk.g(bk)>
	//*  11   47:ifeq            57
				bk.h(a);
	//   12   50:aload_0         
	//   13   51:getfield        #17  <Field bk a>
	//   14   54:invokestatic    #42  <Method void bk.h(bk)>
			bk.a(a, ((android.app.AlertDialog) (null)));
	//   15   57:aload_0         
	//   16   58:getfield        #17  <Field bk a>
	//   17   61:aconst_null     
	//   18   62:invokestatic    #45  <Method android.app.AlertDialog bk.a(bk, android.app.AlertDialog)>
	//   19   65:pop             
			return;
	//   20   66:return          

		case 0: // '\0'
			bk.e(a);
	//   21   67:aload_0         
	//   22   68:getfield        #17  <Field bk a>
	//   23   71:invokestatic    #48  <Method void bk.e(bk)>
			bk.a(a, ((android.app.AlertDialog) (null)));
	//   24   74:aload_0         
	//   25   75:getfield        #17  <Field bk a>
	//   26   78:aconst_null     
	//   27   79:invokestatic    #45  <Method android.app.AlertDialog bk.a(bk, android.app.AlertDialog)>
	//   28   82:pop             
			return;
	//   29   83:return          
		}
	}

	final bk a;

	bk$2(bk bk1)
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
