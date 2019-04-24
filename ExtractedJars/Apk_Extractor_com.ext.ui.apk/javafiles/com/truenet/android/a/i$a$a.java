// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.truenet.android.a;

import android.content.Context;
import android.support.v7.ae;
import android.webkit.WebSettings;
import android.webkit.WebView;
import java.util.concurrent.SynchronousQueue;

// Referenced classes of package com.truenet.android.a:
//			i

static final class i$a$a
	implements Runnable
{

	public final void run()
	{
		Object obj = ((Object) ((new WebView(a)).getSettings()));
	//    0    0:new             #29  <Class WebView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #20  <Field Context a>
	//    4    8:invokespecial   #32  <Method void WebView(Context)>
	//    5   11:invokevirtual   #36  <Method WebSettings WebView.getSettings()>
	//    6   14:astore_1        
		ae.a(obj, "WebView(context).settings");
	//    7   15:aload_1         
	//    8   16:ldc1            #38  <String "WebView(context).settings">
	//    9   18:invokestatic    #43  <Method void ae.a(Object, String)>
		obj = ((Object) (((WebSettings) (obj)).getUserAgentString()));
	//   10   21:aload_1         
	//   11   22:invokevirtual   #49  <Method String WebSettings.getUserAgentString()>
	//   12   25:astore_1        
		b.offer(obj);
	//   13   26:aload_0         
	//   14   27:getfield        #22  <Field SynchronousQueue b>
	//   15   30:aload_1         
	//   16   31:invokevirtual   #55  <Method boolean SynchronousQueue.offer(Object)>
	//   17   34:pop             
	//   18   35:return          
	}

	final Context a;
	final SynchronousQueue b;

	i$a$a(Context context, SynchronousQueue synchronousqueue)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #20  <Field Context a>
		b = synchronousqueue;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #22  <Field SynchronousQueue b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #25  <Method void Object()>
	//    8   14:return          
	}
}
