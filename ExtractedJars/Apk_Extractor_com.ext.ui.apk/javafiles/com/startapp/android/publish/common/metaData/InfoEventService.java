// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.common.metaData;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.startapp.common.b.a;

public class InfoEventService extends Service
{

	public InfoEventService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Service()>
	//    2    4:return          
	}

	public IBinder onBind(Intent intent)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		com.startapp.common.b.a.a(((android.content.Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #26  <Method a a.a(android.content.Context)>
	//    2    4:pop             
		boolean flag = com.startapp.common.b.a.a(intent, new com.startapp.common.b.a.b.b() {

			public void a(com.startapp.common.b.a.b.a a1)
			{
				a.stopSelf();
			//    0    0:aload_0         
			//    1    1:getfield        #17  <Field InfoEventService a>
			//    2    4:invokevirtual   #25  <Method void InfoEventService.stopSelf()>
			//    3    7:return          
			}

			final InfoEventService a;

			
			{
				a = InfoEventService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field InfoEventService a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #20  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//    3    5:aload_1         
	//    4    6:new             #6   <Class InfoEventService$1>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #29  <Method void InfoEventService$1(InfoEventService)>
	//    8   14:invokestatic    #32  <Method boolean a.a(Intent, com.startapp.common.b.a.b$b)>
	//    9   17:istore          4
		com.startapp.common.b.a.a(3, "InfoEventService", (new StringBuilder()).append("onHandleIntent: RunnerManager.runJob").append(flag).toString(), ((Throwable) (null)));
	//   10   19:iconst_3        
	//   11   20:ldc1            #10  <String "InfoEventService">
	//   12   22:new             #34  <Class StringBuilder>
	//   13   25:dup             
	//   14   26:invokespecial   #35  <Method void StringBuilder()>
	//   15   29:ldc1            #37  <String "onHandleIntent: RunnerManager.runJob">
	//   16   31:invokevirtual   #41  <Method StringBuilder StringBuilder.append(String)>
	//   17   34:iload           4
	//   18   36:invokevirtual   #44  <Method StringBuilder StringBuilder.append(boolean)>
	//   19   39:invokevirtual   #48  <Method String StringBuilder.toString()>
	//   20   42:aconst_null     
	//   21   43:invokestatic    #51  <Method void a.a(int, String, String, Throwable)>
		return super.onStartCommand(intent, i, j);
	//   22   46:aload_0         
	//   23   47:aload_1         
	//   24   48:iload_2         
	//   25   49:iload_3         
	//   26   50:invokespecial   #53  <Method int Service.onStartCommand(Intent, int, int)>
	//   27   53:ireturn         
	}

	private static final String a = "InfoEventService";
}
