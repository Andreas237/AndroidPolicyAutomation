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
import java.util.List;

// Referenced classes of package com.startapp.android.publish.cache:
//			i

static final class i$2
	implements Runnable
{

	public void run()
	{
		try
		{
			List list = e.b(a, i.b(), com/startapp/android/publish/cache/i$b);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field Context a>
	//    2    4:invokestatic    #31  <Method String i.b()>
	//    3    7:ldc1            #33  <Class i$b>
	//    4    9:invokestatic    #38  <Method List e.b(Context, String, Class)>
	//    5   12:astore_1        
			(new Handler(Looper.getMainLooper())).post(new Runnable(list) {

				public void run()
				{
					b.b.a(a);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field i$2 b>
				//    2    4:getfield        #27  <Field i$c i$2.b>
				//    3    7:aload_0         
				//    4    8:getfield        #21  <Field List a>
				//    5   11:invokeinterface #32  <Method void i$c.a(List)>
				//    6   16:return          
				}

				final List a;
				final i._cls2 b;

			
			{
				b = i._cls2.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field i$2 b>
				a = list;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field List a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    6   13:new             #40  <Class Handler>
	//    7   16:dup             
	//    8   17:invokestatic    #46  <Method Looper Looper.getMainLooper()>
	//    9   20:invokespecial   #49  <Method void Handler(Looper)>
	//   10   23:new             #13  <Class i$2$1>
	//   11   26:dup             
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokespecial   #52  <Method void i$2$1(i$2, List)>
	//   15   32:invokevirtual   #56  <Method boolean Handler.post(Runnable)>
	//   16   35:pop             
			return;
	//   17   36:return          
		}
		catch(Exception exception)
	//*  18   37:astore_1        
		{
			f.a(a, d.b, " DiskAdCacheManager.loadCacheKeysAsync - Unexpected Thread Exception", exception.getMessage(), "");
	//   19   38:aload_0         
	//   20   39:getfield        #19  <Field Context a>
	//   21   42:getstatic       #61  <Field d d.b>
	//   22   45:ldc1            #63  <String " DiskAdCacheManager.loadCacheKeysAsync - Unexpected Thread Exception">
	//   23   47:aload_1         
	//   24   48:invokevirtual   #66  <Method String Exception.getMessage()>
	//   25   51:ldc1            #68  <String "">
	//   26   53:invokestatic    #73  <Method void f.a(Context, d, String, String, String)>
		}
	//   27   56:return          
	}

	final Context a;
	final i$c b;

	i$2(Context context, i$c i$c)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field Context a>
		b = i$c;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #21  <Field i$c b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #24  <Method void Object()>
	//    8   14:return          
	}
}
