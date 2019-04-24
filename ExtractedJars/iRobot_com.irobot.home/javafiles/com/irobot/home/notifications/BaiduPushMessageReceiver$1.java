// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.notifications;

import android.os.AsyncTask;
import com.irobot.core.PushNotificationType;
import com.irobot.home.IRobotApplication;
import com.irobot.home.util.t;

// Referenced classes of package com.irobot.home.notifications:
//			BaiduPushMessageReceiver

class BaiduPushMessageReceiver$1 extends AsyncTask
{

	protected Object doInBackground(Object aobj[])
	{
		t.a(a.getApplicationContext(), PushNotificationType.CleaningStopError, b, c, d, e, f);
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field IRobotApplication a>
	//    2    4:invokevirtual   #48  <Method android.content.Context IRobotApplication.getApplicationContext()>
	//    3    7:getstatic       #54  <Field PushNotificationType PushNotificationType.CleaningStopError>
	//    4   10:aload_0         
	//    5   11:getfield        #28  <Field String b>
	//    6   14:aload_0         
	//    7   15:getfield        #30  <Field String c>
	//    8   18:aload_0         
	//    9   19:getfield        #32  <Field String d>
	//   10   22:aload_0         
	//   11   23:getfield        #34  <Field String e>
	//   12   26:aload_0         
	//   13   27:getfield        #36  <Field int f>
	//   14   30:invokestatic    #59  <Method void t.a(android.content.Context, PushNotificationType, String, String, String, String, int)>
		return ((Object) (null));
	//   15   33:aconst_null     
	//   16   34:areturn         
	}

	final IRobotApplication a;
	final String b;
	final String c;
	final String d;
	final String e;
	final int f;
	final BaiduPushMessageReceiver g;

	BaiduPushMessageReceiver$1(BaiduPushMessageReceiver baidupushmessagereceiver, IRobotApplication irobotapplication, String s, String s1, String s2, String s3, int i)
	{
		g = baidupushmessagereceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #24  <Field BaiduPushMessageReceiver g>
		a = irobotapplication;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #26  <Field IRobotApplication a>
		b = s;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #28  <Field String b>
		c = s1;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #30  <Field String c>
		d = s2;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #32  <Field String d>
		e = s3;
	//   15   27:aload_0         
	//   16   28:aload           6
	//   17   30:putfield        #34  <Field String e>
		f = i;
	//   18   33:aload_0         
	//   19   34:iload           7
	//   20   36:putfield        #36  <Field int f>
		super();
	//   21   39:aload_0         
	//   22   40:invokespecial   #39  <Method void AsyncTask()>
	//   23   43:return          
	}
}
