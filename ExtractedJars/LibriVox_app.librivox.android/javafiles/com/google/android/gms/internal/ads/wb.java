// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.f;
import com.google.android.gms.common.g;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			abo, aag, wa

final class wb
	implements Runnable
{

	wb(wa wa, Context context, abo abo1)
	{
		a = context;
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:putfield        #14  <Field Context a>
		b = abo1;
	//    3    5:aload_0         
	//    4    6:aload_3         
	//    5    7:putfield        #16  <Field abo b>
		super();
	//    6   10:aload_0         
	//    7   11:invokespecial   #19  <Method void Object()>
	//    8   14:return          
	}

	public final void run()
	{
		com.google.android.gms.ads.identifier.AdvertisingIdClient.Info info = AdvertisingIdClient.getAdvertisingIdInfo(a);
	//    0    0:aload_0         
	//    1    1:getfield        #14  <Field Context a>
	//    2    4:invokestatic    #35  <Method com.google.android.gms.ads.identifier.AdvertisingIdClient$Info AdvertisingIdClient.getAdvertisingIdInfo(Context)>
	//    3    7:astore_1        
		b.b(((Object) (info)));
	//    4    8:aload_0         
	//    5    9:getfield        #16  <Field abo b>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #40  <Method void abo.b(Object)>
		return;
	//    8   16:return          
		Object obj;
		obj;
	//    9   17:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   10   18:goto            30
		obj;
	//   11   21:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   12   22:goto            30
		obj;
	//   13   25:astore_1        
		break MISSING_BLOCK_LABEL_30;
	//   14   26:goto            30
		obj;
	//   15   29:astore_1        
		b.a(((Throwable) (obj)));
	//   16   30:aload_0         
	//   17   31:getfield        #16  <Field abo b>
	//   18   34:aload_1         
	//   19   35:invokevirtual   #43  <Method void abo.a(Throwable)>
		aag.b("Exception while getting advertising Id info", ((Throwable) (obj)));
	//   20   38:ldc1            #45  <String "Exception while getting advertising Id info">
	//   21   40:aload_1         
	//   22   41:invokestatic    #50  <Method void aag.b(String, Throwable)>
		return;
	//   23   44:return          
	}

	private final Context a;
	private final abo b;
}
