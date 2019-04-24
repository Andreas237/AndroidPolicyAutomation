// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.baidu.android.pushservice;

import com.baidu.android.pushservice.h.u;

// Referenced classes of package com.baidu.android.pushservice:
//			PushService, g

class PushService$1
	implements Runnable
{

	public void run()
	{
		a.stopSelf();
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field PushService a>
	//    2    4:invokevirtual   #22  <Method void PushService.stopSelf()>
		g.b();
	//    3    7:invokestatic    #27  <Method void g.b()>
		boolean flag;
		if(PushService.a(a) > 0)
	//*   4   10:aload_0         
	//*   5   11:getfield        #14  <Field PushService a>
	//*   6   14:invokestatic    #30  <Method int PushService.a(PushService)>
	//*   7   17:ifle            25
			flag = true;
	//    8   20:iconst_1        
	//    9   21:istore_1        
		else
	//*  10   22:goto            27
			flag = false;
	//   11   25:iconst_0        
	//   12   26:istore_1        
		if(flag & (true ^ a.getPackageName().equals(((Object) (u.y(a.getApplicationContext()))))))
	//*  13   27:iload_1         
	//*  14   28:iconst_1        
	//*  15   29:aload_0         
	//*  16   30:getfield        #14  <Field PushService a>
	//*  17   33:invokevirtual   #34  <Method String PushService.getPackageName()>
	//*  18   36:aload_0         
	//*  19   37:getfield        #14  <Field PushService a>
	//*  20   40:invokevirtual   #38  <Method android.content.Context PushService.getApplicationContext()>
	//*  21   43:invokestatic    #44  <Method String u.y(android.content.Context)>
	//*  22   46:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  23   49:ixor            
	//*  24   50:iand            
	//*  25   51:ifeq            61
			a.onDestroy();
	//   26   54:aload_0         
	//   27   55:getfield        #14  <Field PushService a>
	//   28   58:invokevirtual   #53  <Method void PushService.onDestroy()>
	//   29   61:return          
	}

	final PushService a;

	PushService$1(PushService pushservice)
	{
		a = pushservice;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #14  <Field PushService a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #17  <Method void Object()>
	//    5    9:return          
	}
}
