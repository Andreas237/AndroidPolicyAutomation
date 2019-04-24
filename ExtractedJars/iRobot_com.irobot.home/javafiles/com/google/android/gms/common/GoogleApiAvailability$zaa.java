// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.base.zal;

// Referenced classes of package com.google.android.gms.common:
//			GoogleApiAvailability

private final class GoogleApiAvailability$zaa extends zal
{

	public final void handleMessage(Message message)
	{
		if(message.what != 1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #47  <Field int Message.what>
	//*   2    4:iconst_1        
	//*   3    5:icmpeq          47
		{
			int i = message.what;
	//    4    8:aload_1         
	//    5    9:getfield        #47  <Field int Message.what>
	//    6   12:istore_2        
			message = ((Message) (new StringBuilder(50)));
	//    7   13:new             #49  <Class StringBuilder>
	//    8   16:dup             
	//    9   17:bipush          50
	//   10   19:invokespecial   #52  <Method void StringBuilder(int)>
	//   11   22:astore_1        
			((StringBuilder) (message)).append("Don't know how to handle this message: ");
	//   12   23:aload_1         
	//   13   24:ldc1            #54  <String "Don't know how to handle this message: ">
	//   14   26:invokevirtual   #58  <Method StringBuilder StringBuilder.append(String)>
	//   15   29:pop             
			((StringBuilder) (message)).append(i);
	//   16   30:aload_1         
	//   17   31:iload_2         
	//   18   32:invokevirtual   #61  <Method StringBuilder StringBuilder.append(int)>
	//   19   35:pop             
			Log.w("GoogleApiAvailability", ((StringBuilder) (message)).toString());
	//   20   36:ldc1            #63  <String "GoogleApiAvailability">
	//   21   38:aload_1         
	//   22   39:invokevirtual   #67  <Method String StringBuilder.toString()>
	//   23   42:invokestatic    #73  <Method int Log.w(String, String)>
	//   24   45:pop             
			return;
	//   25   46:return          
		}
		int j = zaar.isGooglePlayServicesAvailable(zaaq);
	//   26   47:aload_0         
	//   27   48:getfield        #18  <Field GoogleApiAvailability zaar>
	//   28   51:aload_0         
	//   29   52:getfield        #38  <Field Context zaaq>
	//   30   55:invokevirtual   #77  <Method int GoogleApiAvailability.isGooglePlayServicesAvailable(Context)>
	//   31   58:istore_2        
		if(zaar.isUserResolvableError(j))
	//*  32   59:aload_0         
	//*  33   60:getfield        #18  <Field GoogleApiAvailability zaar>
	//*  34   63:iload_2         
	//*  35   64:invokevirtual   #81  <Method boolean GoogleApiAvailability.isUserResolvableError(int)>
	//*  36   67:ifeq            82
			zaar.showErrorNotification(zaaq, j);
	//   37   70:aload_0         
	//   38   71:getfield        #18  <Field GoogleApiAvailability zaar>
	//   39   74:aload_0         
	//   40   75:getfield        #38  <Field Context zaaq>
	//   41   78:iload_2         
	//   42   79:invokevirtual   #85  <Method void GoogleApiAvailability.showErrorNotification(Context, int)>
	//   43   82:return          
	}

	private final Context zaaq;
	private final GoogleApiAvailability zaar;

	public GoogleApiAvailability$zaa(GoogleApiAvailability googleapiavailability, Context context)
	{
		zaar = googleapiavailability;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field GoogleApiAvailability zaar>
		if(Looper.myLooper() == null)
	//*   3    5:invokestatic    #24  <Method Looper Looper.myLooper()>
	//*   4    8:ifnonnull       18
			googleapiavailability = ((GoogleApiAvailability) (Looper.getMainLooper()));
	//    5   11:invokestatic    #27  <Method Looper Looper.getMainLooper()>
	//    6   14:astore_1        
		else
	//*   7   15:goto            22
			googleapiavailability = ((GoogleApiAvailability) (Looper.myLooper()));
	//    8   18:invokestatic    #24  <Method Looper Looper.myLooper()>
	//    9   21:astore_1        
		super(((Looper) (googleapiavailability)));
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokespecial   #30  <Method void zal(Looper)>
		zaaq = context.getApplicationContext();
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokevirtual   #36  <Method Context Context.getApplicationContext()>
	//   16   32:putfield        #38  <Field Context zaaq>
	//   17   35:return          
	}
}
