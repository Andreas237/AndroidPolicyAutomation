// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.internal.common.zze;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//			BaseGmsClient

final class BaseGmsClient$zzb extends zze
{

	private static void zza(Message message)
	{
		message = ((Message) ((BaseGmsClient$zzc)message.obj));
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object Message.obj>
	//    2    4:checkcast       #27  <Class BaseGmsClient$zzc>
	//    3    7:astore_0        
		((BaseGmsClient$zzc) (message)).zzn();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #31  <Method void BaseGmsClient$zzc.zzn()>
		((BaseGmsClient$zzc) (message)).unregister();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #34  <Method void BaseGmsClient$zzc.unregister()>
	//    8   16:return          
	}

	private static boolean zzb(Message message)
	{
		if(message.what != 2 && message.what != 1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field int Message.what>
	//*   2    4:iconst_2        
	//*   3    5:icmpeq          29
	//*   4    8:aload_0         
	//*   5    9:getfield        #39  <Field int Message.what>
	//*   6   12:iconst_1        
	//*   7   13:icmpeq          29
			return message.what == 7;
	//    8   16:aload_0         
	//    9   17:getfield        #39  <Field int Message.what>
	//   10   20:bipush          7
	//   11   22:icmpne          27
	//   12   25:iconst_1        
	//   13   26:ireturn         
	//   14   27:iconst_0        
	//   15   28:ireturn         
		else
			return true;
	//   16   29:iconst_1        
	//   17   30:ireturn         
	}

	public final void handleMessage(Message message)
	{
		if(zzcs.zzcq.get() != message.arg1)
	//*   0    0:aload_0         
	//*   1    1:getfield        #13  <Field BaseGmsClient zzcs>
	//*   2    4:getfield        #44  <Field AtomicInteger BaseGmsClient.zzcq>
	//*   3    7:invokevirtual   #50  <Method int AtomicInteger.get()>
	//*   4   10:aload_1         
	//*   5   11:getfield        #53  <Field int Message.arg1>
	//*   6   14:icmpeq          29
		{
			if(zzb(message))
	//*   7   17:aload_1         
	//*   8   18:invokestatic    #55  <Method boolean zzb(Message)>
	//*   9   21:ifeq            28
				zza(message);
	//   10   24:aload_1         
	//   11   25:invokestatic    #57  <Method void zza(Message)>
			return;
	//   12   28:return          
		}
		if((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !zzcs.isConnecting())
	//*  13   29:aload_1         
	//*  14   30:getfield        #39  <Field int Message.what>
	//*  15   33:iconst_1        
	//*  16   34:icmpeq          62
	//*  17   37:aload_1         
	//*  18   38:getfield        #39  <Field int Message.what>
	//*  19   41:bipush          7
	//*  20   43:icmpeq          62
	//*  21   46:aload_1         
	//*  22   47:getfield        #39  <Field int Message.what>
	//*  23   50:iconst_4        
	//*  24   51:icmpeq          62
	//*  25   54:aload_1         
	//*  26   55:getfield        #39  <Field int Message.what>
	//*  27   58:iconst_5        
	//*  28   59:icmpne          77
	//*  29   62:aload_0         
	//*  30   63:getfield        #13  <Field BaseGmsClient zzcs>
	//*  31   66:invokevirtual   #61  <Method boolean BaseGmsClient.isConnecting()>
	//*  32   69:ifne            77
		{
			zza(message);
	//   33   72:aload_1         
	//   34   73:invokestatic    #57  <Method void zza(Message)>
			return;
	//   35   76:return          
		}
		int i = message.what;
	//   36   77:aload_1         
	//   37   78:getfield        #39  <Field int Message.what>
	//   38   81:istore_2        
		PendingIntent pendingintent = null;
	//   39   82:aconst_null     
	//   40   83:astore_3        
		if(i == 4)
	//*  41   84:iload_2         
	//*  42   85:iconst_4        
	//*  43   86:icmpne          191
		{
			BaseGmsClient.zza(zzcs, new ConnectionResult(message.arg2));
	//   44   89:aload_0         
	//   45   90:getfield        #13  <Field BaseGmsClient zzcs>
	//   46   93:new             #63  <Class ConnectionResult>
	//   47   96:dup             
	//   48   97:aload_1         
	//   49   98:getfield        #66  <Field int Message.arg2>
	//   50  101:invokespecial   #69  <Method void ConnectionResult(int)>
	//   51  104:invokestatic    #72  <Method ConnectionResult BaseGmsClient.zza(BaseGmsClient, ConnectionResult)>
	//   52  107:pop             
			if(BaseGmsClient.zzb(zzcs) && !BaseGmsClient.zzc(zzcs))
	//*  53  108:aload_0         
	//*  54  109:getfield        #13  <Field BaseGmsClient zzcs>
	//*  55  112:invokestatic    #75  <Method boolean BaseGmsClient.zzb(BaseGmsClient)>
	//*  56  115:ifeq            138
	//*  57  118:aload_0         
	//*  58  119:getfield        #13  <Field BaseGmsClient zzcs>
	//*  59  122:invokestatic    #78  <Method boolean BaseGmsClient.zzc(BaseGmsClient)>
	//*  60  125:ifne            138
			{
				BaseGmsClient.zza(zzcs, 3, ((android.os.IInterface) (null)));
	//   61  128:aload_0         
	//   62  129:getfield        #13  <Field BaseGmsClient zzcs>
	//   63  132:iconst_3        
	//   64  133:aconst_null     
	//   65  134:invokestatic    #81  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
				return;
	//   66  137:return          
			}
			if(BaseGmsClient.zzd(zzcs) != null)
	//*  67  138:aload_0         
	//*  68  139:getfield        #13  <Field BaseGmsClient zzcs>
	//*  69  142:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
	//*  70  145:ifnull          159
				message = ((Message) (BaseGmsClient.zzd(zzcs)));
	//   71  148:aload_0         
	//   72  149:getfield        #13  <Field BaseGmsClient zzcs>
	//   73  152:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
	//   74  155:astore_1        
			else
	//*  75  156:goto            169
				message = ((Message) (new ConnectionResult(8)));
	//   76  159:new             #63  <Class ConnectionResult>
	//   77  162:dup             
	//   78  163:bipush          8
	//   79  165:invokespecial   #69  <Method void ConnectionResult(int)>
	//   80  168:astore_1        
			zzcs.zzce.onReportServiceBinding(((ConnectionResult) (message)));
	//   81  169:aload_0         
	//   82  170:getfield        #13  <Field BaseGmsClient zzcs>
	//   83  173:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzce>
	//   84  176:aload_1         
	//   85  177:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			zzcs.onConnectionFailed(((ConnectionResult) (message)));
	//   86  182:aload_0         
	//   87  183:getfield        #13  <Field BaseGmsClient zzcs>
	//   88  186:aload_1         
	//   89  187:invokevirtual   #98  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
			return;
	//   90  190:return          
		}
		if(message.what == 5)
	//*  91  191:aload_1         
	//*  92  192:getfield        #39  <Field int Message.what>
	//*  93  195:iconst_5        
	//*  94  196:icmpne          252
		{
			if(BaseGmsClient.zzd(zzcs) != null)
	//*  95  199:aload_0         
	//*  96  200:getfield        #13  <Field BaseGmsClient zzcs>
	//*  97  203:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
	//*  98  206:ifnull          220
				message = ((Message) (BaseGmsClient.zzd(zzcs)));
	//   99  209:aload_0         
	//  100  210:getfield        #13  <Field BaseGmsClient zzcs>
	//  101  213:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
	//  102  216:astore_1        
			else
	//* 103  217:goto            230
				message = ((Message) (new ConnectionResult(8)));
	//  104  220:new             #63  <Class ConnectionResult>
	//  105  223:dup             
	//  106  224:bipush          8
	//  107  226:invokespecial   #69  <Method void ConnectionResult(int)>
	//  108  229:astore_1        
			zzcs.zzce.onReportServiceBinding(((ConnectionResult) (message)));
	//  109  230:aload_0         
	//  110  231:getfield        #13  <Field BaseGmsClient zzcs>
	//  111  234:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzce>
	//  112  237:aload_1         
	//  113  238:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			zzcs.onConnectionFailed(((ConnectionResult) (message)));
	//  114  243:aload_0         
	//  115  244:getfield        #13  <Field BaseGmsClient zzcs>
	//  116  247:aload_1         
	//  117  248:invokevirtual   #98  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
			return;
	//  118  251:return          
		}
		if(message.what == 3)
	//* 119  252:aload_1         
	//* 120  253:getfield        #39  <Field int Message.what>
	//* 121  256:iconst_3        
	//* 122  257:icmpne          313
		{
			if(message.obj instanceof PendingIntent)
	//* 123  260:aload_1         
	//* 124  261:getfield        #25  <Field Object Message.obj>
	//* 125  264:instanceof      #100 <Class PendingIntent>
	//* 126  267:ifeq            278
				pendingintent = (PendingIntent)message.obj;
	//  127  270:aload_1         
	//  128  271:getfield        #25  <Field Object Message.obj>
	//  129  274:checkcast       #100 <Class PendingIntent>
	//  130  277:astore_3        
			message = ((Message) (new ConnectionResult(message.arg2, pendingintent)));
	//  131  278:new             #63  <Class ConnectionResult>
	//  132  281:dup             
	//  133  282:aload_1         
	//  134  283:getfield        #66  <Field int Message.arg2>
	//  135  286:aload_3         
	//  136  287:invokespecial   #103 <Method void ConnectionResult(int, PendingIntent)>
	//  137  290:astore_1        
			zzcs.zzce.onReportServiceBinding(((ConnectionResult) (message)));
	//  138  291:aload_0         
	//  139  292:getfield        #13  <Field BaseGmsClient zzcs>
	//  140  295:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzce>
	//  141  298:aload_1         
	//  142  299:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			zzcs.onConnectionFailed(((ConnectionResult) (message)));
	//  143  304:aload_0         
	//  144  305:getfield        #13  <Field BaseGmsClient zzcs>
	//  145  308:aload_1         
	//  146  309:invokevirtual   #98  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
			return;
	//  147  312:return          
		}
		if(message.what == 6)
	//* 148  313:aload_1         
	//* 149  314:getfield        #39  <Field int Message.what>
	//* 150  317:bipush          6
	//* 151  319:icmpne          380
		{
			BaseGmsClient.zza(zzcs, 5, ((android.os.IInterface) (null)));
	//  152  322:aload_0         
	//  153  323:getfield        #13  <Field BaseGmsClient zzcs>
	//  154  326:iconst_5        
	//  155  327:aconst_null     
	//  156  328:invokestatic    #81  <Method void BaseGmsClient.zza(BaseGmsClient, int, android.os.IInterface)>
			if(com.google.android.gms.common.internal.BaseGmsClient.zze(zzcs) != null)
	//* 157  331:aload_0         
	//* 158  332:getfield        #13  <Field BaseGmsClient zzcs>
	//* 159  335:invokestatic    #107 <Method BaseGmsClient$BaseConnectionCallbacks com.google.android.gms.common.internal.BaseGmsClient.zze(BaseGmsClient)>
	//* 160  338:ifnull          357
				com.google.android.gms.common.internal.BaseGmsClient.zze(zzcs).onConnectionSuspended(message.arg2);
	//  161  341:aload_0         
	//  162  342:getfield        #13  <Field BaseGmsClient zzcs>
	//  163  345:invokestatic    #107 <Method BaseGmsClient$BaseConnectionCallbacks com.google.android.gms.common.internal.BaseGmsClient.zze(BaseGmsClient)>
	//  164  348:aload_1         
	//  165  349:getfield        #66  <Field int Message.arg2>
	//  166  352:invokeinterface #112 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnectionSuspended(int)>
			zzcs.onConnectionSuspended(message.arg2);
	//  167  357:aload_0         
	//  168  358:getfield        #13  <Field BaseGmsClient zzcs>
	//  169  361:aload_1         
	//  170  362:getfield        #66  <Field int Message.arg2>
	//  171  365:invokevirtual   #113 <Method void BaseGmsClient.onConnectionSuspended(int)>
			BaseGmsClient.zza(zzcs, 5, 1, ((android.os.IInterface) (null)));
	//  172  368:aload_0         
	//  173  369:getfield        #13  <Field BaseGmsClient zzcs>
	//  174  372:iconst_5        
	//  175  373:iconst_1        
	//  176  374:aconst_null     
	//  177  375:invokestatic    #116 <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, android.os.IInterface)>
	//  178  378:pop             
			return;
	//  179  379:return          
		}
		if(message.what == 2 && !zzcs.isConnected())
	//* 180  380:aload_1         
	//* 181  381:getfield        #39  <Field int Message.what>
	//* 182  384:iconst_2        
	//* 183  385:icmpne          403
	//* 184  388:aload_0         
	//* 185  389:getfield        #13  <Field BaseGmsClient zzcs>
	//* 186  392:invokevirtual   #119 <Method boolean BaseGmsClient.isConnected()>
	//* 187  395:ifne            403
		{
			zza(message);
	//  188  398:aload_1         
	//  189  399:invokestatic    #57  <Method void zza(Message)>
			return;
	//  190  402:return          
		}
		if(zzb(message))
	//* 191  403:aload_1         
	//* 192  404:invokestatic    #55  <Method boolean zzb(Message)>
	//* 193  407:ifeq            421
		{
			((BaseGmsClient$zzc)message.obj).zzo();
	//  194  410:aload_1         
	//  195  411:getfield        #25  <Field Object Message.obj>
	//  196  414:checkcast       #27  <Class BaseGmsClient$zzc>
	//  197  417:invokevirtual   #122 <Method void BaseGmsClient$zzc.zzo()>
			return;
	//  198  420:return          
		} else
		{
			int j = message.what;
	//  199  421:aload_1         
	//  200  422:getfield        #39  <Field int Message.what>
	//  201  425:istore_2        
			message = ((Message) (new StringBuilder(45)));
	//  202  426:new             #124 <Class StringBuilder>
	//  203  429:dup             
	//  204  430:bipush          45
	//  205  432:invokespecial   #125 <Method void StringBuilder(int)>
	//  206  435:astore_1        
			((StringBuilder) (message)).append("Don't know how to handle message: ");
	//  207  436:aload_1         
	//  208  437:ldc1            #127 <String "Don't know how to handle message: ">
	//  209  439:invokevirtual   #131 <Method StringBuilder StringBuilder.append(String)>
	//  210  442:pop             
			((StringBuilder) (message)).append(j);
	//  211  443:aload_1         
	//  212  444:iload_2         
	//  213  445:invokevirtual   #134 <Method StringBuilder StringBuilder.append(int)>
	//  214  448:pop             
			Log.wtf("GmsClient", ((StringBuilder) (message)).toString(), ((Throwable) (new Exception())));
	//  215  449:ldc1            #136 <String "GmsClient">
	//  216  451:aload_1         
	//  217  452:invokevirtual   #140 <Method String StringBuilder.toString()>
	//  218  455:new             #142 <Class Exception>
	//  219  458:dup             
	//  220  459:invokespecial   #144 <Method void Exception()>
	//  221  462:invokestatic    #150 <Method int Log.wtf(String, String, Throwable)>
	//  222  465:pop             
			return;
	//  223  466:return          
		}
	}

	private final BaseGmsClient zzcs;

	public BaseGmsClient$zzb(BaseGmsClient basegmsclient, Looper looper)
	{
		zzcs = basegmsclient;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field BaseGmsClient zzcs>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void zze(Looper)>
	//    6   10:return          
	}
}
