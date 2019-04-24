// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.os.*;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			d

class d$1
	implements Runnable
{

	public void run()
	{
		Process.setThreadPriority(10);
	//    0    0:bipush          10
	//    1    2:invokestatic    #29  <Method void Process.setThreadPriority(int)>
		Boolean boolean1 = a.d();
	//    2    5:aload_0         
	//    3    6:getfield        #19  <Field d a>
	//    4    9:invokevirtual   #33  <Method Boolean d.d()>
	//    5   12:astore_1        
		(new Handler(Looper.getMainLooper())).post(new Runnable(boolean1) {

			public void run()
			{
				b.a.a(a);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field d$1 b>
			//    2    4:getfield        #27  <Field d d$1.a>
			//    3    7:aload_0         
			//    4    8:getfield        #21  <Field Boolean a>
			//    5   11:invokevirtual   #32  <Method void d.a(Boolean)>
			//    6   14:return          
			}

			final Boolean a;
			final d._cls1 b;

			
			{
				b = d._cls1.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field d$1 b>
				a = boolean1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Boolean a>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//    6   13:new             #35  <Class Handler>
	//    7   16:dup             
	//    8   17:invokestatic    #41  <Method Looper Looper.getMainLooper()>
	//    9   20:invokespecial   #44  <Method void Handler(Looper)>
	//   10   23:new             #13  <Class d$1$1>
	//   11   26:dup             
	//   12   27:aload_0         
	//   13   28:aload_1         
	//   14   29:invokespecial   #47  <Method void d$1$1(d$1, Boolean)>
	//   15   32:invokevirtual   #51  <Method boolean Handler.post(Runnable)>
	//   16   35:pop             
	//   17   36:return          
	}

	final d a;

	d$1(d d1)
	{
		a = d1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field d a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
