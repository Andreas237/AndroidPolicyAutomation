// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.gmsg.al;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abt, iv, sd, wx, 
//			sb

final class se
	implements abt
{

	se(sd sd1)
	{
		a = sd1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field sd a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void Object()>
	//    5    9:return          
	}

	public final void a(Object obj)
	{
		obj = ((Object) ((iv)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #21  <Class iv>
	//    2    4:astore_1        
		try
		{
			((iv) (obj)).b("AFMA_getAdapterLessMediationAd", a.a);
	//    3    5:aload_1         
	//    4    6:ldc1            #23  <String "AFMA_getAdapterLessMediationAd">
	//    5    8:aload_0         
	//    6    9:getfield        #12  <Field sd a>
	//    7   12:getfield        #28  <Field org.json.JSONObject sd.a>
	//    8   15:invokeinterface #32  <Method void iv.b(String, org.json.JSONObject)>
			return;
	//    9   20:return          
		}
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  10   21:astore_1        
		{
			wx.b("Error requesting an ad url", ((Throwable) (obj)));
	//   11   22:ldc1            #34  <String "Error requesting an ad url">
	//   12   24:aload_1         
	//   13   25:invokestatic    #39  <Method void wx.b(String, Throwable)>
		}
		sb.d().b(a.b);
	//   14   28:invokestatic    #45  <Method al sb.d()>
	//   15   31:aload_0         
	//   16   32:getfield        #12  <Field sd a>
	//   17   35:getfield        #48  <Field String sd.b>
	//   18   38:invokevirtual   #53  <Method void al.b(String)>
	//   19   41:return          
	}

	private final sd a;
}
