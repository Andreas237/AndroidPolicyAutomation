// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqr, bqp

final class bqt
	implements ValueCallback
{

	bqt(bqr bqr1)
	{
		a = bqr1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field bqr a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void onReceiveValue(Object obj)
	{
		obj = ((Object) ((String)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #20  <Class String>
	//    2    4:astore_1        
		a.d.a(a.a, a.b, ((String) (obj)), a.c);
	//    3    5:aload_0         
	//    4    6:getfield        #12  <Field bqr a>
	//    5    9:getfield        #26  <Field bqp bqr.d>
	//    6   12:aload_0         
	//    7   13:getfield        #12  <Field bqr a>
	//    8   16:getfield        #29  <Field bqj bqr.a>
	//    9   19:aload_0         
	//   10   20:getfield        #12  <Field bqr a>
	//   11   23:getfield        #33  <Field android.webkit.WebView bqr.b>
	//   12   26:aload_1         
	//   13   27:aload_0         
	//   14   28:getfield        #12  <Field bqr a>
	//   15   31:getfield        #37  <Field boolean bqr.c>
	//   16   34:invokevirtual   #42  <Method void bqp.a(bqj, android.webkit.WebView, String, boolean)>
	//   17   37:return          
	}

	private final bqr a;
}
