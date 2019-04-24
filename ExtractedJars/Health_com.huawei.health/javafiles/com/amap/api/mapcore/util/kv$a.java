// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amap.api.mapcore.util;

import android.content.*;
import android.text.TextUtils;

// Referenced classes of package com.amap.api.mapcore.util:
//			kv, lc, lh

final class kv$a extends BroadcastReceiver
{

	public final void onReceive(Context context, Intent intent)
	{
		if(context == null || intent == null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          8
	//*   2    4:aload_2         
	//*   3    5:ifnonnull       9
			return;
	//    4    8:return          
		boolean flag;
		try
		{
			context = ((Context) (intent.getAction()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #29  <Method String Intent.getAction()>
	//    7   13:astore_1        
			flag = TextUtils.isEmpty(((CharSequence) (context)));
	//    8   14:aload_1         
	//    9   15:invokestatic    #35  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   10   18:istore_3        
		}
	//*  11   19:iload_3         
	//*  12   20:ifeq            24
	//*  13   23:return          
	//*  14   24:aload_1         
	//*  15   25:ldc1            #37  <String "android.net.wifi.SCAN_RESULTS">
	//*  16   27:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  17   30:ifeq            54
	//*  18   33:aload_0         
	//*  19   34:getfield        #12  <Field kv a>
	//*  20   37:invokestatic    #46  <Method lc kv.a(kv)>
	//*  21   40:ifnull          83
	//*  22   43:aload_0         
	//*  23   44:getfield        #12  <Field kv a>
	//*  24   47:invokestatic    #46  <Method lc kv.a(kv)>
	//*  25   50:invokevirtual   #51  <Method void lc.c()>
	//*  26   53:return          
	//*  27   54:aload_1         
	//*  28   55:ldc1            #53  <String "android.net.wifi.WIFI_STATE_CHANGED">
	//*  29   57:invokevirtual   #43  <Method boolean String.equals(Object)>
	//*  30   60:ifeq            83
	//*  31   63:aload_0         
	//*  32   64:getfield        #12  <Field kv a>
	//*  33   67:invokestatic    #46  <Method lc kv.a(kv)>
	//*  34   70:ifnull          83
	//*  35   73:aload_0         
	//*  36   74:getfield        #12  <Field kv a>
	//*  37   77:invokestatic    #46  <Method lc kv.a(kv)>
	//*  38   80:invokevirtual   #56  <Method void lc.d()>
	//*  39   83:return          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  40   84:astore_1        
		{
			lh.a(((Throwable) (context)), "NetLocation", "onReceive");
	//   41   85:aload_1         
	//   42   86:ldc1            #58  <String "NetLocation">
	//   43   88:ldc1            #59  <String "onReceive">
	//   44   90:invokestatic    #64  <Method void lh.a(Throwable, String, String)>
			return;
	//   45   93:return          
		}
		if(flag)
			return;
		if(((String) (context)).equals("android.net.wifi.SCAN_RESULTS"))
		{
			if(kv.a(a) != null)
			{
				kv.a(a).c();
				return;
			}
			break MISSING_BLOCK_LABEL_83;
		}
		if(((String) (context)).equals("android.net.wifi.WIFI_STATE_CHANGED") && kv.a(a) != null)
			kv.a(a).d();
	}

	final kv a;

	private kv$a(kv kv1)
	{
		a = kv1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #12  <Field kv a>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
	//    5    9:return          
	}

	kv$a(kv kv1, byte byte0)
	{
		this(kv1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void kv$a(kv)>
	//    3    5:return          
	}
}
