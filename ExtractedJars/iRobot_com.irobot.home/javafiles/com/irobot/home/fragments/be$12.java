// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.fragments;

import android.content.DialogInterface;
import com.irobot.core.CurrentConnectionState;
import com.irobot.home.WebViewActivity_;
import com.irobot.home.util.j;

// Referenced classes of package com.irobot.home.fragments:
//			be

class be$12
	implements android.content.Interface.OnClickListener
{

	public void onClick(DialogInterface dialoginterface, int i)
	{
		dialoginterface = ((DialogInterface) (a.c(CurrentConnectionState.Error)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field be a>
	//    2    4:getstatic       #28  <Field CurrentConnectionState CurrentConnectionState.Error>
	//    3    7:invokevirtual   #32  <Method String be.c(CurrentConnectionState)>
	//    4   10:astore_1        
		if(j.i(((String) (dialoginterface))))
	//*   5   11:aload_1         
	//*   6   12:invokestatic    #38  <Method boolean j.i(String)>
	//*   7   15:ifeq            45
		{
			WebViewActivity_.a(((android.content.Context) (a.getActivity()))).a(((String) (dialoginterface))).a(Integer.valueOf(0x7f0f05d8)).a();
	//    8   18:aload_0         
	//    9   19:getfield        #17  <Field be a>
	//   10   22:invokevirtual   #42  <Method android.app.Activity be.getActivity()>
	//   11   25:invokestatic    #47  <Method com.irobot.home.WebViewActivity_$a WebViewActivity_.a(android.content.Context)>
	//   12   28:aload_1         
	//   13   29:invokevirtual   #52  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(String)>
	//   14   32:ldc1            #53  <Int 0x7f0f05d8>
	//   15   34:invokestatic    #59  <Method Integer Integer.valueOf(int)>
	//   16   37:invokevirtual   #62  <Method com.irobot.home.WebViewActivity_$a com.irobot.home.WebViewActivity_$a.a(Integer)>
	//   17   40:invokevirtual   #65  <Method org.androidannotations.api.a.e com.irobot.home.WebViewActivity_$a.a()>
	//   18   43:pop             
			return;
	//   19   44:return          
		} else
		{
			a.u();
	//   20   45:aload_0         
	//   21   46:getfield        #17  <Field be a>
	//   22   49:invokevirtual   #68  <Method void be.u()>
			return;
	//   23   52:return          
		}
	}

	final be a;

	be$12(be be1)
	{
		a = be1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field be a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #19  <Method void Object()>
	//    5    9:return          
	}
}
