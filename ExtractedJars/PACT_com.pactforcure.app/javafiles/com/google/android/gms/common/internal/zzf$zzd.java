// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.app.PendingIntent;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//			zzf

final class zzf$zzd extends Handler
{

	private void zza(Message message)
	{
		((zzf$zze)message.obj).unregister();
	//    0    0:aload_1         
	//    1    1:getfield        #25  <Field Object Message.obj>
	//    2    4:checkcast       #27  <Class zzf$zze>
	//    3    7:invokevirtual   #31  <Method void zzf$zze.unregister()>
	//    4   10:return          
	}

	private boolean zzb(Message message)
	{
		return message.what == 2 || message.what == 1 || message.what == 5;
	//    0    0:aload_1         
	//    1    1:getfield        #37  <Field int Message.what>
	//    2    4:iconst_2        
	//    3    5:icmpeq          24
	//    4    8:aload_1         
	//    5    9:getfield        #37  <Field int Message.what>
	//    6   12:iconst_1        
	//    7   13:icmpeq          24
	//    8   16:aload_1         
	//    9   17:getfield        #37  <Field int Message.what>
	//   10   20:iconst_5        
	//   11   21:icmpne          26
	//   12   24:iconst_1        
	//   13   25:ireturn         
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	public void handleMessage(Message message)
	{
		PendingIntent pendingintent = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(zzaDV.zzaDS.get() != message.arg1)
	//*   2    2:aload_0         
	//*   3    3:getfield        #13  <Field zzf zzaDV>
	//*   4    6:getfield        #42  <Field AtomicInteger zzf.zzaDS>
	//*   5    9:invokevirtual   #48  <Method int AtomicInteger.get()>
	//*   6   12:aload_1         
	//*   7   13:getfield        #51  <Field int Message.arg1>
	//*   8   16:icmpeq          33
		{
			if(zzb(message))
	//*   9   19:aload_0         
	//*  10   20:aload_1         
	//*  11   21:invokespecial   #53  <Method boolean zzb(Message)>
	//*  12   24:ifeq            32
				zza(message);
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokespecial   #55  <Method void zza(Message)>
			return;
	//   16   32:return          
		}
		if((message.what == 1 || message.what == 5) && !zzaDV.isConnecting())
	//*  17   33:aload_1         
	//*  18   34:getfield        #37  <Field int Message.what>
	//*  19   37:iconst_1        
	//*  20   38:icmpeq          49
	//*  21   41:aload_1         
	//*  22   42:getfield        #37  <Field int Message.what>
	//*  23   45:iconst_5        
	//*  24   46:icmpne          65
	//*  25   49:aload_0         
	//*  26   50:getfield        #13  <Field zzf zzaDV>
	//*  27   53:invokevirtual   #59  <Method boolean zzf.isConnecting()>
	//*  28   56:ifne            65
		{
			zza(message);
	//   29   59:aload_0         
	//   30   60:aload_1         
	//   31   61:invokespecial   #55  <Method void zza(Message)>
			return;
	//   32   64:return          
		}
		if(message.what == 3)
	//*  33   65:aload_1         
	//*  34   66:getfield        #37  <Field int Message.what>
	//*  35   69:iconst_3        
	//*  36   70:icmpne          126
		{
			if(message.obj instanceof PendingIntent)
	//*  37   73:aload_1         
	//*  38   74:getfield        #25  <Field Object Message.obj>
	//*  39   77:instanceof      #61  <Class PendingIntent>
	//*  40   80:ifeq            91
				pendingintent = (PendingIntent)message.obj;
	//   41   83:aload_1         
	//   42   84:getfield        #25  <Field Object Message.obj>
	//   43   87:checkcast       #61  <Class PendingIntent>
	//   44   90:astore_3        
			message = ((Message) (new ConnectionResult(message.arg2, pendingintent)));
	//   45   91:new             #63  <Class ConnectionResult>
	//   46   94:dup             
	//   47   95:aload_1         
	//   48   96:getfield        #66  <Field int Message.arg2>
	//   49   99:aload_3         
	//   50  100:invokespecial   #69  <Method void ConnectionResult(int, PendingIntent)>
	//   51  103:astore_1        
			zzaDV.zzaDJ.zzg(((ConnectionResult) (message)));
	//   52  104:aload_0         
	//   53  105:getfield        #13  <Field zzf zzaDV>
	//   54  108:getfield        #73  <Field zzf$zzf zzf.zzaDJ>
	//   55  111:aload_1         
	//   56  112:invokeinterface #79  <Method void zzf$zzf.zzg(ConnectionResult)>
			zzaDV.onConnectionFailed(((ConnectionResult) (message)));
	//   57  117:aload_0         
	//   58  118:getfield        #13  <Field zzf zzaDV>
	//   59  121:aload_1         
	//   60  122:invokevirtual   #82  <Method void zzf.onConnectionFailed(ConnectionResult)>
			return;
	//   61  125:return          
		}
		if(message.what == 4)
	//*  62  126:aload_1         
	//*  63  127:getfield        #37  <Field int Message.what>
	//*  64  130:iconst_4        
	//*  65  131:icmpne          192
		{
			zzf.zza(zzaDV, 4, ((android.os.IInterface) (null)));
	//   66  134:aload_0         
	//   67  135:getfield        #13  <Field zzf zzaDV>
	//   68  138:iconst_4        
	//   69  139:aconst_null     
	//   70  140:invokestatic    #85  <Method void zzf.zza(zzf, int, android.os.IInterface)>
			if(zzf.zzb(zzaDV) != null)
	//*  71  143:aload_0         
	//*  72  144:getfield        #13  <Field zzf zzaDV>
	//*  73  147:invokestatic    #88  <Method zzf$zzb zzf.zzb(zzf)>
	//*  74  150:ifnull          169
				zzf.zzb(zzaDV).onConnectionSuspended(message.arg2);
	//   75  153:aload_0         
	//   76  154:getfield        #13  <Field zzf zzaDV>
	//   77  157:invokestatic    #88  <Method zzf$zzb zzf.zzb(zzf)>
	//   78  160:aload_1         
	//   79  161:getfield        #66  <Field int Message.arg2>
	//   80  164:invokeinterface #94  <Method void zzf$zzb.onConnectionSuspended(int)>
			zzaDV.onConnectionSuspended(message.arg2);
	//   81  169:aload_0         
	//   82  170:getfield        #13  <Field zzf zzaDV>
	//   83  173:aload_1         
	//   84  174:getfield        #66  <Field int Message.arg2>
	//   85  177:invokevirtual   #95  <Method void zzf.onConnectionSuspended(int)>
			zzf.zza(zzaDV, 4, 1, ((android.os.IInterface) (null)));
	//   86  180:aload_0         
	//   87  181:getfield        #13  <Field zzf zzaDV>
	//   88  184:iconst_4        
	//   89  185:iconst_1        
	//   90  186:aconst_null     
	//   91  187:invokestatic    #98  <Method boolean zzf.zza(zzf, int, int, android.os.IInterface)>
	//   92  190:pop             
			return;
	//   93  191:return          
		}
		if(message.what == 2 && !zzaDV.isConnected())
	//*  94  192:aload_1         
	//*  95  193:getfield        #37  <Field int Message.what>
	//*  96  196:iconst_2        
	//*  97  197:icmpne          216
	//*  98  200:aload_0         
	//*  99  201:getfield        #13  <Field zzf zzaDV>
	//* 100  204:invokevirtual   #101 <Method boolean zzf.isConnected()>
	//* 101  207:ifne            216
		{
			zza(message);
	//  102  210:aload_0         
	//  103  211:aload_1         
	//  104  212:invokespecial   #55  <Method void zza(Message)>
			return;
	//  105  215:return          
		}
		if(zzb(message))
	//* 106  216:aload_0         
	//* 107  217:aload_1         
	//* 108  218:invokespecial   #53  <Method boolean zzb(Message)>
	//* 109  221:ifeq            235
		{
			((zzf$zze)message.obj).zzxa();
	//  110  224:aload_1         
	//  111  225:getfield        #25  <Field Object Message.obj>
	//  112  228:checkcast       #27  <Class zzf$zze>
	//  113  231:invokevirtual   #104 <Method void zzf$zze.zzxa()>
			return;
	//  114  234:return          
		} else
		{
			int i = message.what;
	//  115  235:aload_1         
	//  116  236:getfield        #37  <Field int Message.what>
	//  117  239:istore_2        
			Log.wtf("GmsClient", (new StringBuilder(45)).append("Don't know how to handle message: ").append(i).toString(), ((Throwable) (new Exception())));
	//  118  240:ldc1            #106 <String "GmsClient">
	//  119  242:new             #108 <Class StringBuilder>
	//  120  245:dup             
	//  121  246:bipush          45
	//  122  248:invokespecial   #110 <Method void StringBuilder(int)>
	//  123  251:ldc1            #112 <String "Don't know how to handle message: ">
	//  124  253:invokevirtual   #116 <Method StringBuilder StringBuilder.append(String)>
	//  125  256:iload_2         
	//  126  257:invokevirtual   #119 <Method StringBuilder StringBuilder.append(int)>
	//  127  260:invokevirtual   #123 <Method String StringBuilder.toString()>
	//  128  263:new             #125 <Class Exception>
	//  129  266:dup             
	//  130  267:invokespecial   #127 <Method void Exception()>
	//  131  270:invokestatic    #133 <Method int Log.wtf(String, String, Throwable)>
	//  132  273:pop             
			return;
	//  133  274:return          
		}
	}

	final zzf zzaDV;

	public zzf$zzd(zzf zzf1, Looper looper)
	{
		zzaDV = zzf1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #13  <Field zzf zzaDV>
		super(looper);
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:invokespecial   #16  <Method void Handler(Looper)>
	//    6   10:return          
	}
}
