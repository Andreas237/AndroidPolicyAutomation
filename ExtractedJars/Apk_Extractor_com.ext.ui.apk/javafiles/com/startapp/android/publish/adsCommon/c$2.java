// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.adsCommon;

import android.content.Context;
import com.startapp.android.publish.adsCommon.e.d;
import com.startapp.android.publish.adsCommon.e.f;
import com.startapp.android.publish.adsCommon.i.a;
import com.startapp.common.a.g;
import com.startapp.common.e;

// Referenced classes of package com.startapp.android.publish.adsCommon:
//			c

static final class c$2
	implements Runnable
{

	public void run()
	{
		try
		{
			com.startapp.android.publish.adsCommon.i.a.a(a, b, ((java.util.Map) (null)));
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field Context a>
	//    2    4:aload_0         
	//    3    5:getfield        #19  <Field String b>
	//    4    8:aconst_null     
	//    5    9:invokestatic    #31  <Method boolean a.a(Context, String, java.util.Map)>
	//    6   12:pop             
			return;
	//    7   13:return          
		}
		catch(e e1)
	//*   8   14:astore_1        
		{
			f.a(a, d.b, "Util.sendTrackingMessage - Error sending tracking message", e1.getMessage(), "");
	//    9   15:aload_0         
	//   10   16:getfield        #17  <Field Context a>
	//   11   19:getstatic       #36  <Field d d.b>
	//   12   22:ldc1            #38  <String "Util.sendTrackingMessage - Error sending tracking message">
	//   13   24:aload_1         
	//   14   25:invokevirtual   #42  <Method String e.getMessage()>
	//   15   28:ldc1            #44  <String "">
	//   16   30:invokestatic    #49  <Method void f.a(Context, d, String, String, String)>
			g.a(6, "Error sending tracking message", ((Throwable) (e1)));
	//   17   33:bipush          6
	//   18   35:ldc1            #51  <String "Error sending tracking message">
	//   19   37:aload_1         
	//   20   38:invokestatic    #56  <Method void g.a(int, String, Throwable)>
			return;
	//   21   41:return          
		}
	}

	final Context a;
	final String b;

	c$2(Context context, String s)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #17  <Field Context a>
		b = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #19  <Field String b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #22  <Method void Object()>
	//    8   14:return          
	}
}
