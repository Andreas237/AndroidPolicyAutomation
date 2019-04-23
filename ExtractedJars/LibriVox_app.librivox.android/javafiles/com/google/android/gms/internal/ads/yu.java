// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aan, wx, wi, yy, 
//			aas, ys, abe

final class yu
	implements aan
{

	yu(ys ys, yy yy1)
	{
		a = yy1;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #12  <Field yy a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final abe a(Object obj)
	{
		obj = ((Object) ((Throwable)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #19  <Class Throwable>
	//    2    4:astore_1        
		wx.b("Error occurred while dispatching http response in getter.", ((Throwable) (obj)));
	//    3    5:ldc1            #21  <String "Error occurred while dispatching http response in getter.">
	//    4    7:aload_1         
	//    5    8:invokestatic    #27  <Method void wx.b(String, Throwable)>
		aw.i().a(((Throwable) (obj)), "HttpGetter.deliverResponse.1");
	//    6   11:invokestatic    #33  <Method wi aw.i()>
	//    7   14:aload_1         
	//    8   15:ldc1            #35  <String "HttpGetter.deliverResponse.1">
	//    9   17:invokevirtual   #40  <Method void wi.a(Throwable, String)>
		return ((abe) (aas.a(a.a())));
	//   10   20:aload_0         
	//   11   21:getfield        #12  <Field yy a>
	//   12   24:invokeinterface #45  <Method Object yy.a()>
	//   13   29:invokestatic    #50  <Method abd aas.a(Object)>
	//   14   32:areturn         
	}

	private final yy a;
}
