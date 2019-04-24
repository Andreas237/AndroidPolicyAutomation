// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.widget.Toast;

// Referenced classes of package com.baidu.android.pushservice:
//			PushServiceReceiver

class PushServiceReceiver$a$1
	implements Runnable
{

	public void run()
	{
		Toast.makeText(a.a, "\u5BCC\u5A92\u4F53\u63A8\u9001\u6CA1\u6709\u58F0\u660E\u5FC5\u987B\u7684Activity\uFF0C\u8BF7\u68C0\u67E5\uFF01", 1).show();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field PushServiceReceiver$a a>
	//    2    4:getfield        #26  <Field android.content.Context PushServiceReceiver$a.a>
	//    3    7:ldc1            #28  <String "\u5BCC\u5A92\u4F53\u63A8\u9001\u6CA1\u6709\u58F0\u660E\u5FC5\u987B\u7684Activity\uFF0C\u8BF7\u68C0\u67E5\uFF01">
	//    4    9:iconst_1        
	//    5   10:invokestatic    #34  <Method Toast Toast.makeText(android.content.Context, CharSequence, int)>
	//    6   13:invokevirtual   #37  <Method void Toast.show()>
	//    7   16:return          
	}

	final PushServiceReceiver.a a;

	PushServiceReceiver$a$1(PushServiceReceiver.a a1)
	{
		a = a1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field PushServiceReceiver$a a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
