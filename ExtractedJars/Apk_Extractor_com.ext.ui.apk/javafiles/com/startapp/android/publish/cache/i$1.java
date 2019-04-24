// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.cache;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.common.a.e;

// Referenced classes of package com.startapp.android.publish.cache:
//			i

static final class i$1
	implements Runnable
{

	public void run()
	{
		try
		{
			e.a(a, i.a());
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context a>
	//    2    4:invokestatic    #31  <Method String i.a()>
	//    3    7:invokestatic    #36  <Method void e.a(Context, String)>
			(new Handler(Looper.getMainLooper())).post(new Runnable() {

				public void run()
				{
					a.b.a();
				//    0    0:aload_0         
				//    1    1:getfield        #17  <Field i$1 a>
				//    2    4:getfield        #24  <Field i$e i$1.b>
				//    3    7:invokeinterface #28  <Method void i$e.a()>
				//    4   12:return          
				}

				final i._cls1 a;

			
			{
				a = i._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #17  <Field i$1 a>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
			}
);
	//    4   10:new             #38  <Class Handler>
	//    5   13:dup             
	//    6   14:invokestatic    #44  <Method Looper Looper.getMainLooper()>
	//    7   17:invokespecial   #47  <Method void Handler(Looper)>
	//    8   20:new             #13  <Class i$1$1>
	//    9   23:dup             
	//   10   24:aload_0         
	//   11   25:invokespecial   #50  <Method void i$1$1(i$1)>
	//   12   28:invokevirtual   #54  <Method boolean Handler.post(Runnable)>
	//   13   31:pop             
			return;
	//   14   32:return          
		}
		catch(Exception exception)
	//*  15   33:astore_1        
		{
			f.a(a, d.b, " DiskAdCacheManager.deleteDiskCacheAsync - Unexpected Thread Exception", exception.getMessage(), "");
	//   16   34:aload_0         
	//   17   35:getfield        #19  <Field Context a>
	//   18   38:getstatic       #59  <Field d d.b>
	//   19   41:ldc1            #61  <String " DiskAdCacheManager.deleteDiskCacheAsync - Unexpected Thread Exception">
	//   20   43:aload_1         
	//   21   44:invokevirtual   #64  <Method String Exception.getMessage()>
	//   22   47:ldc1            #66  <String "">
	//   23   49:invokestatic    #71  <Method void f.a(Context, d, String, String, String)>
		}
	//   24   52:return          
	}

	final Context a;
	final i$e b;

	i$1(Context context, i$e i$e)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Context a>
		b = i$e;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field i$e b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
