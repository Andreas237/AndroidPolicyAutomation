// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import android.content.Context;
import android.content.Intent;
import com.baidu.android.pushservice.g.c;

// Referenced classes of package com.baidu.android.pushservice:
//			RegistrationReceiver

class RegistrationReceiver$1 extends c
{

	public void a()
	{
		if(!a.hasExtra("r_sync_type")) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Intent a>
	//    2    4:ldc1            #30  <String "r_sync_type">
	//    3    6:invokevirtual   #36  <Method boolean Intent.hasExtra(String)>
	//    4    9:ifeq            77
_L1:
		a.getIntExtra("r_sync_type", 0);
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field Intent a>
	//    7   16:ldc1            #30  <String "r_sync_type">
	//    8   18:iconst_0        
	//    9   19:invokevirtual   #40  <Method int Intent.getIntExtra(String, int)>
		JVM INSTR tableswitch 0 3: default 52
	//	               0 77
	//	               1 65
	//	               2 88
	//	               3 53;
	//   10   22:tableswitch     0 3: default 52
	//	               0 77
	//	               1 65
	//	               2 88
	//	               3 53
		   goto _L3 _L2 _L4 _L5 _L6
_L3:
		return;
	//   11   52:return          
_L6:
		com.baidu.android.pushservice.RegistrationReceiver.c(b, a);
	//   12   53:aload_0         
	//   13   54:getfield        #23  <Field Context b>
	//   14   57:aload_0         
	//   15   58:getfield        #21  <Field Intent a>
	//   16   61:invokestatic    #42  <Method void com.baidu.android.pushservice.RegistrationReceiver.c(Context, Intent)>
		return;
	//   17   64:return          
_L4:
		RegistrationReceiver.b(b, a);
	//   18   65:aload_0         
	//   19   66:getfield        #23  <Field Context b>
	//   20   69:aload_0         
	//   21   70:getfield        #21  <Field Intent a>
	//   22   73:invokestatic    #44  <Method void RegistrationReceiver.b(Context, Intent)>
		return;
	//   23   76:return          
_L2:
		RegistrationReceiver.a(b, a);
	//   24   77:aload_0         
	//   25   78:getfield        #23  <Field Context b>
	//   26   81:aload_0         
	//   27   82:getfield        #21  <Field Intent a>
	//   28   85:invokestatic    #46  <Method void RegistrationReceiver.a(Context, Intent)>
_L5:
	//   29   88:return          
	}

	final Intent a;
	final Context b;
	final RegistrationReceiver c;

	RegistrationReceiver$1(RegistrationReceiver registrationreceiver, String s, short word0, Intent intent, Context context)
	{
		c = registrationreceiver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RegistrationReceiver c>
		a = intent;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #21  <Field Intent a>
		b = context;
	//    6   11:aload_0         
	//    7   12:aload           5
	//    8   14:putfield        #23  <Field Context b>
		super(s, word0);
	//    9   17:aload_0         
	//   10   18:aload_2         
	//   11   19:iload_3         
	//   12   20:invokespecial   #26  <Method void c(String, short)>
	//   13   23:return          
	}
}
