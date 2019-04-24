// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.startapp.android.publish.ads.nativead;

import com.startapp.common.a.g;

// Referenced classes of package com.startapp.android.publish.ads.nativead:
//			NativeAdDetails

class NativeAdDetails$2
	implements Runnable
{

	public void run()
	{
		g.a("StartAppNativeAd", 3, (new StringBuilder()).append("SingleAd [").append(a.a).append("] Loaded").toString());
	//    0    0:ldc1            #22  <String "StartAppNativeAd">
	//    1    2:iconst_3        
	//    2    3:new             #24  <Class StringBuilder>
	//    3    6:dup             
	//    4    7:invokespecial   #25  <Method void StringBuilder()>
	//    5   10:ldc1            #27  <String "SingleAd [">
	//    6   12:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:aload_0         
	//    8   16:getfield        #16  <Field NativeAdDetails a>
	//    9   19:getfield        #34  <Field int NativeAdDetails.a>
	//   10   22:invokevirtual   #37  <Method StringBuilder StringBuilder.append(int)>
	//   11   25:ldc1            #39  <String "] Loaded">
	//   12   27:invokevirtual   #31  <Method StringBuilder StringBuilder.append(String)>
	//   13   30:invokevirtual   #43  <Method String StringBuilder.toString()>
	//   14   33:invokestatic    #48  <Method void g.a(String, int, String)>
		if(a.b != null)
	//*  15   36:aload_0         
	//*  16   37:getfield        #16  <Field NativeAdDetails a>
	//*  17   40:getfield        #52  <Field NativeAdDetails$a NativeAdDetails.b>
	//*  18   43:ifnull          65
			a.b.onNativeAdDetailsLoaded(a.a);
	//   19   46:aload_0         
	//   20   47:getfield        #16  <Field NativeAdDetails a>
	//   21   50:getfield        #52  <Field NativeAdDetails$a NativeAdDetails.b>
	//   22   53:aload_0         
	//   23   54:getfield        #16  <Field NativeAdDetails a>
	//   24   57:getfield        #34  <Field int NativeAdDetails.a>
	//   25   60:invokeinterface #58  <Method void NativeAdDetails$a.onNativeAdDetailsLoaded(int)>
	//   26   65:return          
	}

	final NativeAdDetails a;

	NativeAdDetails$2(NativeAdDetails nativeaddetails)
	{
		a = nativeaddetails;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #16  <Field NativeAdDetails a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
	//    5    9:return          
	}
}
