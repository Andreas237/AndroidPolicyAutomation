// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Scope;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.common.internal:
//			Preconditions, GmsClientSupervisor, zzh, IGmsServiceBroker, 
//			zzb, GetServiceRequest, IAccountAccessor

public abstract class BaseGmsClient
{
	public static interface BaseConnectionCallbacks
	{

		public abstract void onConnected(Bundle bundle);

		public abstract void onConnectionSuspended(int i);
	}

	public static interface BaseOnConnectionFailedListener
	{

		public abstract void onConnectionFailed(ConnectionResult connectionresult);
	}

	public static interface ConnectionProgressReportCallbacks
	{

		public abstract void onReportServiceBinding(ConnectionResult connectionresult);
	}

	protected class LegacyClientCallbackAdapter
		implements ConnectionProgressReportCallbacks
	{

		public void onReportServiceBinding(ConnectionResult connectionresult)
		{
			if(connectionresult.isSuccess())
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #29  <Method boolean ConnectionResult.isSuccess()>
		//*   2    4:ifeq            23
			{
				zzcs.getRemoteService(((IAccountAccessor) (null)), zzcs.getScopes());
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field BaseGmsClient zzcs>
		//    5   11:aconst_null     
		//    6   12:aload_0         
		//    7   13:getfield        #16  <Field BaseGmsClient zzcs>
		//    8   16:invokevirtual   #33  <Method Set BaseGmsClient.getScopes()>
		//    9   19:invokevirtual   #37  <Method void BaseGmsClient.getRemoteService(IAccountAccessor, Set)>
				return;
		//   10   22:return          
			}
			if(BaseGmsClient.zzg(zzcs) != null)
		//*  11   23:aload_0         
		//*  12   24:getfield        #16  <Field BaseGmsClient zzcs>
		//*  13   27:invokestatic    #41  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//*  14   30:ifnull          46
				BaseGmsClient.zzg(zzcs).onConnectionFailed(connectionresult);
		//   15   33:aload_0         
		//   16   34:getfield        #16  <Field BaseGmsClient zzcs>
		//   17   37:invokestatic    #41  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//   18   40:aload_1         
		//   19   41:invokeinterface #46  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
		//   20   46:return          
		}

		private final BaseGmsClient zzcs;

		public LegacyClientCallbackAdapter()
		{
			zzcs = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field BaseGmsClient zzcs>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}
	}

	public static interface SignOutCallbacks
	{

		public abstract void onSignOutComplete();
	}

	private abstract class zza extends zzc
	{

		protected abstract void zza(ConnectionResult connectionresult);

		protected final void zza(Object obj)
		{
			Boolean boolean1 = (Boolean)obj;
		//    0    0:aload_1         
		//    1    1:checkcast       #20  <Class Boolean>
		//    2    4:astore_3        
			obj = null;
		//    3    5:aconst_null     
		//    4    6:astore_1        
			if(boolean1 == null)
		//*   5    7:aload_3         
		//*   6    8:ifnonnull       21
			{
				BaseGmsClient.zza(zzcs, 1, ((IInterface) (null)));
		//    7   11:aload_0         
		//    8   12:getfield        #18  <Field BaseGmsClient zzcs>
		//    9   15:iconst_1        
		//   10   16:aconst_null     
		//   11   17:invokestatic    #37  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				return;
		//   12   20:return          
			}
			int i = statusCode;
		//   13   21:aload_0         
		//   14   22:getfield        #29  <Field int statusCode>
		//   15   25:istore_2        
			if(i != 0)
		//*  16   26:iload_2         
		//*  17   27:ifeq            138
				if(i != 10)
		//*  18   30:iload_2         
		//*  19   31:bipush          10
		//*  20   33:icmpeq          82
				{
					BaseGmsClient.zza(zzcs, 1, ((IInterface) (null)));
		//   21   36:aload_0         
		//   22   37:getfield        #18  <Field BaseGmsClient zzcs>
		//   23   40:iconst_1        
		//   24   41:aconst_null     
		//   25   42:invokestatic    #37  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
					if(zzcr != null)
		//*  26   45:aload_0         
		//*  27   46:getfield        #31  <Field Bundle zzcr>
		//*  28   49:ifnull          65
						obj = ((Object) ((PendingIntent)zzcr.getParcelable("pendingIntent")));
		//   29   52:aload_0         
		//   30   53:getfield        #31  <Field Bundle zzcr>
		//   31   56:ldc1            #39  <String "pendingIntent">
		//   32   58:invokevirtual   #45  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   33   61:checkcast       #47  <Class PendingIntent>
		//   34   64:astore_1        
					zza(new ConnectionResult(statusCode, ((PendingIntent) (obj))));
		//   35   65:aload_0         
		//   36   66:new             #49  <Class ConnectionResult>
		//   37   69:dup             
		//   38   70:aload_0         
		//   39   71:getfield        #29  <Field int statusCode>
		//   40   74:aload_1         
		//   41   75:invokespecial   #52  <Method void ConnectionResult(int, PendingIntent)>
		//   42   78:invokevirtual   #54  <Method void zza(ConnectionResult)>
					return;
		//   43   81:return          
				} else
				{
					BaseGmsClient.zza(zzcs, 1, ((IInterface) (null)));
		//   44   82:aload_0         
		//   45   83:getfield        #18  <Field BaseGmsClient zzcs>
		//   46   86:iconst_1        
		//   47   87:aconst_null     
		//   48   88:invokestatic    #37  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
					throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[] {
						((Object)this).getClass().getSimpleName(), zzcs.getStartServiceAction(), zzcs.getServiceDescriptor()
					}));
		//   49   91:new             #56  <Class IllegalStateException>
		//   50   94:dup             
		//   51   95:ldc1            #58  <String "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ">
		//   52   97:iconst_3        
		//   53   98:anewarray       Object[]
		//   54  101:dup             
		//   55  102:iconst_0        
		//   56  103:aload_0         
		//   57  104:invokevirtual   #64  <Method Class Object.getClass()>
		//   58  107:invokevirtual   #70  <Method String Class.getSimpleName()>
		//   59  110:aastore         
		//   60  111:dup             
		//   61  112:iconst_1        
		//   62  113:aload_0         
		//   63  114:getfield        #18  <Field BaseGmsClient zzcs>
		//   64  117:invokevirtual   #73  <Method String BaseGmsClient.getStartServiceAction()>
		//   65  120:aastore         
		//   66  121:dup             
		//   67  122:iconst_2        
		//   68  123:aload_0         
		//   69  124:getfield        #18  <Field BaseGmsClient zzcs>
		//   70  127:invokevirtual   #76  <Method String BaseGmsClient.getServiceDescriptor()>
		//   71  130:aastore         
		//   72  131:invokestatic    #82  <Method String String.format(String, Object[])>
		//   73  134:invokespecial   #85  <Method void IllegalStateException(String)>
		//   74  137:athrow          
				}
			if(!zzm())
		//*  75  138:aload_0         
		//*  76  139:invokevirtual   #89  <Method boolean zzm()>
		//*  77  142:ifne            168
			{
				BaseGmsClient.zza(zzcs, 1, ((IInterface) (null)));
		//   78  145:aload_0         
		//   79  146:getfield        #18  <Field BaseGmsClient zzcs>
		//   80  149:iconst_1        
		//   81  150:aconst_null     
		//   82  151:invokestatic    #37  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				zza(new ConnectionResult(8, ((PendingIntent) (null))));
		//   83  154:aload_0         
		//   84  155:new             #49  <Class ConnectionResult>
		//   85  158:dup             
		//   86  159:bipush          8
		//   87  161:aconst_null     
		//   88  162:invokespecial   #52  <Method void ConnectionResult(int, PendingIntent)>
		//   89  165:invokevirtual   #54  <Method void zza(ConnectionResult)>
			}
		//   90  168:return          
		}

		protected abstract boolean zzm();

		protected final void zzn()
		{
		//    0    0:return          
		}

		private final int statusCode;
		private final Bundle zzcr;
		private final BaseGmsClient zzcs;

		protected zza(int i, Bundle bundle)
		{
			zzcs = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field BaseGmsClient zzcs>
			super(((Object) (Boolean.valueOf(true))));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_1        
		//    6    8:invokestatic    #24  <Method Boolean Boolean.valueOf(boolean)>
		//    7   11:invokespecial   #27  <Method void BaseGmsClient$zzc(BaseGmsClient, Object)>
			statusCode = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #29  <Field int statusCode>
			zzcr = bundle;
		//   11   19:aload_0         
		//   12   20:aload_3         
		//   13   21:putfield        #31  <Field Bundle zzcr>
		//   14   24:return          
		}
	}

	final class zzb extends com.google.android.gms.internal.common.zze
	{

		private static void zza(Message message)
		{
			message = ((Message) ((zzc)message.obj));
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Object Message.obj>
		//    2    4:checkcast       #27  <Class BaseGmsClient$zzc>
		//    3    7:astore_0        
			((zzc) (message)).zzn();
		//    4    8:aload_0         
		//    5    9:invokevirtual   #31  <Method void BaseGmsClient$zzc.zzn()>
			((zzc) (message)).unregister();
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
					BaseGmsClient.zza(zzcs, 3, ((IInterface) (null)));
		//   61  128:aload_0         
		//   62  129:getfield        #13  <Field BaseGmsClient zzcs>
		//   63  132:iconst_3        
		//   64  133:aconst_null     
		//   65  134:invokestatic    #81  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
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
				BaseGmsClient.zza(zzcs, 5, ((IInterface) (null)));
		//  152  322:aload_0         
		//  153  323:getfield        #13  <Field BaseGmsClient zzcs>
		//  154  326:iconst_5        
		//  155  327:aconst_null     
		//  156  328:invokestatic    #81  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				if(BaseGmsClient.zze(zzcs) != null)
		//* 157  331:aload_0         
		//* 158  332:getfield        #13  <Field BaseGmsClient zzcs>
		//* 159  335:invokestatic    #107 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//* 160  338:ifnull          357
					BaseGmsClient.zze(zzcs).onConnectionSuspended(message.arg2);
		//  161  341:aload_0         
		//  162  342:getfield        #13  <Field BaseGmsClient zzcs>
		//  163  345:invokestatic    #107 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//  164  348:aload_1         
		//  165  349:getfield        #66  <Field int Message.arg2>
		//  166  352:invokeinterface #112 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnectionSuspended(int)>
				zzcs.onConnectionSuspended(message.arg2);
		//  167  357:aload_0         
		//  168  358:getfield        #13  <Field BaseGmsClient zzcs>
		//  169  361:aload_1         
		//  170  362:getfield        #66  <Field int Message.arg2>
		//  171  365:invokevirtual   #113 <Method void BaseGmsClient.onConnectionSuspended(int)>
				BaseGmsClient.zza(zzcs, 5, 1, ((IInterface) (null)));
		//  172  368:aload_0         
		//  173  369:getfield        #13  <Field BaseGmsClient zzcs>
		//  174  372:iconst_5        
		//  175  373:iconst_1        
		//  176  374:aconst_null     
		//  177  375:invokestatic    #116 <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
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
				((zzc)message.obj).zzo();
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

		public zzb(Looper looper)
		{
			zzcs = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field BaseGmsClient zzcs>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void com.google.android.gms.internal.common.zze(Looper)>
		//    6   10:return          
		}
	}

	protected abstract class zzc
	{

		public final void removeListener()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			zzct = null;
		//    2    2:aload_0         
		//    3    3:aconst_null     
		//    4    4:putfield        #24  <Field Object zzct>
			this;
		//    5    7:aload_0         
			JVM INSTR monitorexit ;
		//    6    8:monitorexit     
			return;
		//    7    9:return          
			Exception exception;
			exception;
		//    8   10:astore_1        
			this;
		//    9   11:aload_0         
			JVM INSTR monitorexit ;
		//   10   12:monitorexit     
			throw exception;
		//   11   13:aload_1         
		//   12   14:athrow          
		}

		public final void unregister()
		{
			removeListener();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #33  <Method void removeListener()>
			synchronized(BaseGmsClient.zzf(zzcs))
		//*   2    4:aload_0         
		//*   3    5:getfield        #19  <Field BaseGmsClient zzcs>
		//*   4    8:invokestatic    #37  <Method ArrayList BaseGmsClient.zzf(BaseGmsClient)>
		//*   5   11:astore_1        
		//*   6   12:aload_1         
		//*   7   13:monitorenter    
			{
				BaseGmsClient.zzf(zzcs).remove(((Object) (this)));
		//    8   14:aload_0         
		//    9   15:getfield        #19  <Field BaseGmsClient zzcs>
		//   10   18:invokestatic    #37  <Method ArrayList BaseGmsClient.zzf(BaseGmsClient)>
		//   11   21:aload_0         
		//   12   22:invokevirtual   #43  <Method boolean ArrayList.remove(Object)>
		//   13   25:pop             
			}
		//   14   26:aload_1         
		//   15   27:monitorexit     
			return;
		//   16   28:return          
			exception;
		//   17   29:astore_2        
			arraylist;
		//   18   30:aload_1         
			JVM INSTR monitorexit ;
		//   19   31:monitorexit     
			throw exception;
		//   20   32:aload_2         
		//   21   33:athrow          
		}

		protected abstract void zza(Object obj);

		protected abstract void zzn();

		public final void zzo()
		{
			this;
		//    0    0:aload_0         
			JVM INSTR monitorenter ;
		//    1    1:monitorenter    
			Object obj;
			obj = zzct;
		//    2    2:aload_0         
		//    3    3:getfield        #24  <Field Object zzct>
		//    4    6:astore_1        
			if(zzcu)
		//*   5    7:aload_0         
		//*   6    8:getfield        #26  <Field boolean zzcu>
		//*   7   11:ifeq            67
			{
				String s = String.valueOf(((Object) (this)));
		//    8   14:aload_0         
		//    9   15:invokestatic    #55  <Method String String.valueOf(Object)>
		//   10   18:astore_2        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 47);
		//   11   19:new             #57  <Class StringBuilder>
		//   12   22:dup             
		//   13   23:aload_2         
		//   14   24:invokestatic    #55  <Method String String.valueOf(Object)>
		//   15   27:invokevirtual   #61  <Method int String.length()>
		//   16   30:bipush          47
		//   17   32:iadd            
		//   18   33:invokespecial   #64  <Method void StringBuilder(int)>
		//   19   36:astore_3        
				stringbuilder.append("Callback proxy ");
		//   20   37:aload_3         
		//   21   38:ldc1            #66  <String "Callback proxy ">
		//   22   40:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   23   43:pop             
				stringbuilder.append(s);
		//   24   44:aload_3         
		//   25   45:aload_2         
		//   26   46:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   27   49:pop             
				stringbuilder.append(" being reused. This is not safe.");
		//   28   50:aload_3         
		//   29   51:ldc1            #72  <String " being reused. This is not safe.">
		//   30   53:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
		//   31   56:pop             
				Log.w("GmsClient", stringbuilder.toString());
		//   32   57:ldc1            #74  <String "GmsClient">
		//   33   59:aload_3         
		//   34   60:invokevirtual   #78  <Method String StringBuilder.toString()>
		//   35   63:invokestatic    #84  <Method int Log.w(String, String)>
		//   36   66:pop             
			}
			this;
		//   37   67:aload_0         
			JVM INSTR monitorexit ;
		//   38   68:monitorexit     
			if(obj != null)
		//*  39   69:aload_1         
		//*  40   70:ifnull          88
				try
				{
					zza(obj);
		//   41   73:aload_0         
		//   42   74:aload_1         
		//   43   75:invokevirtual   #86  <Method void zza(Object)>
				}
		//*  44   78:goto            92
				catch(RuntimeException runtimeexception)
		//*  45   81:astore_1        
				{
					zzn();
		//   46   82:aload_0         
		//   47   83:invokevirtual   #88  <Method void zzn()>
					throw runtimeexception;
		//   48   86:aload_1         
		//   49   87:athrow          
				}
			else
				zzn();
		//   50   88:aload_0         
		//   51   89:invokevirtual   #88  <Method void zzn()>
			this;
		//   52   92:aload_0         
			JVM INSTR monitorenter ;
		//   53   93:monitorenter    
			zzcu = true;
		//   54   94:aload_0         
		//   55   95:iconst_1        
		//   56   96:putfield        #26  <Field boolean zzcu>
			this;
		//   57   99:aload_0         
			JVM INSTR monitorexit ;
		//   58  100:monitorexit     
			unregister();
		//   59  101:aload_0         
		//   60  102:invokevirtual   #90  <Method void unregister()>
			return;
		//   61  105:return          
			Exception exception;
			exception;
		//   62  106:astore_1        
			this;
		//   63  107:aload_0         
			JVM INSTR monitorexit ;
		//   64  108:monitorexit     
			throw exception;
		//   65  109:aload_1         
		//   66  110:athrow          
			exception;
		//   67  111:astore_1        
			this;
		//   68  112:aload_0         
			JVM INSTR monitorexit ;
		//   69  113:monitorexit     
			throw exception;
		//   70  114:aload_1         
		//   71  115:athrow          
		}

		private final BaseGmsClient zzcs;
		private Object zzct;
		private boolean zzcu;

		public zzc(Object obj)
		{
			zzcs = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field BaseGmsClient zzcs>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			zzct = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Object zzct>
			zzcu = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #26  <Field boolean zzcu>
		//   11   19:return          
		}
	}

	public static final class zzd extends IGmsCallbacks.zza
	{

		public final void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
		{
			Preconditions.checkNotNull(((Object) (zzcv)), "onPostInitComplete can be called only once per call to getRemoteService");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field BaseGmsClient zzcv>
		//    2    4:ldc1            #26  <String "onPostInitComplete can be called only once per call to getRemoteService">
		//    3    6:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    4    9:pop             
			zzcv.onPostInitHandler(i, ibinder, bundle, zzcw);
		//    5   10:aload_0         
		//    6   11:getfield        #19  <Field BaseGmsClient zzcv>
		//    7   14:iload_1         
		//    8   15:aload_2         
		//    9   16:aload_3         
		//   10   17:aload_0         
		//   11   18:getfield        #21  <Field int zzcw>
		//   12   21:invokevirtual   #36  <Method void BaseGmsClient.onPostInitHandler(int, IBinder, Bundle, int)>
			zzcv = null;
		//   13   24:aload_0         
		//   14   25:aconst_null     
		//   15   26:putfield        #19  <Field BaseGmsClient zzcv>
		//   16   29:return          
		}

		public final void zza(int i, Bundle bundle)
		{
			Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", ((Throwable) (new Exception())));
		//    0    0:ldc1            #40  <String "GmsClient">
		//    1    2:ldc1            #42  <String "received deprecated onAccountValidationComplete callback, ignoring">
		//    2    4:new             #44  <Class Exception>
		//    3    7:dup             
		//    4    8:invokespecial   #45  <Method void Exception()>
		//    5   11:invokestatic    #51  <Method int Log.wtf(String, String, Throwable)>
		//    6   14:pop             
		//    7   15:return          
		}

		public final void zza(int i, IBinder ibinder, com.google.android.gms.common.internal.zzb zzb1)
		{
			Preconditions.checkNotNull(((Object) (zzcv)), "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field BaseGmsClient zzcv>
		//    2    4:ldc1            #54  <String "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService">
		//    3    6:invokestatic    #32  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    4    9:pop             
			Preconditions.checkNotNull(((Object) (zzb1)));
		//    5   10:aload_3         
		//    6   11:invokestatic    #57  <Method Object Preconditions.checkNotNull(Object)>
		//    7   14:pop             
			BaseGmsClient.zza(zzcv, zzb1);
		//    8   15:aload_0         
		//    9   16:getfield        #19  <Field BaseGmsClient zzcv>
		//   10   19:aload_3         
		//   11   20:invokestatic    #60  <Method void BaseGmsClient.zza(BaseGmsClient, zzb)>
			onPostInitComplete(i, ibinder, zzb1.zzcz);
		//   12   23:aload_0         
		//   13   24:iload_1         
		//   14   25:aload_2         
		//   15   26:aload_3         
		//   16   27:getfield        #66  <Field Bundle zzb.zzcz>
		//   17   30:invokevirtual   #68  <Method void onPostInitComplete(int, IBinder, Bundle)>
		//   18   33:return          
		}

		private BaseGmsClient zzcv;
		private final int zzcw;

		public zzd(BaseGmsClient basegmsclient, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void IGmsCallbacks$zza()>
			zzcv = basegmsclient;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field BaseGmsClient zzcv>
			zzcw = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field int zzcw>
		//    8   14:return          
		}
	}

	public final class zze
		implements ServiceConnection
	{

		public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
		{
			if(ibinder == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       14
			{
				BaseGmsClient.zza(zzcs, 16);
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field BaseGmsClient zzcs>
		//    4    8:bipush          16
		//    5   10:invokestatic    #29  <Method void BaseGmsClient.zza(BaseGmsClient, int)>
				return;
		//    6   13:return          
			}
			Object obj = BaseGmsClient.zza(zzcs);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field BaseGmsClient zzcs>
		//    9   18:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
		//   10   21:astore_3        
			obj;
		//   11   22:aload_3         
			JVM INSTR monitorenter ;
		//   12   23:monitorenter    
			BaseGmsClient basegmsclient = zzcs;
		//   13   24:aload_0         
		//   14   25:getfield        #18  <Field BaseGmsClient zzcs>
		//   15   28:astore          4
			if(ibinder == null)
		//*  16   30:aload_2         
		//*  17   31:ifnonnull       39
			{
				componentname = null;
		//   18   34:aconst_null     
		//   19   35:astore_1        
				break MISSING_BLOCK_LABEL_76;
		//   20   36:goto            76
			}
			componentname = ((ComponentName) (ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker")));
		//   21   39:aload_2         
		//   22   40:ldc1            #34  <String "com.google.android.gms.common.internal.IGmsServiceBroker">
		//   23   42:invokeinterface #40  <Method IInterface IBinder.queryLocalInterface(String)>
		//   24   47:astore_1        
			if(componentname == null)
				break MISSING_BLOCK_LABEL_67;
		//   25   48:aload_1         
		//   26   49:ifnull          67
			if(componentname instanceof IGmsServiceBroker)
		//*  27   52:aload_1         
		//*  28   53:instanceof      #42  <Class IGmsServiceBroker>
		//*  29   56:ifeq            67
			{
				componentname = ((ComponentName) ((IGmsServiceBroker)componentname));
		//   30   59:aload_1         
		//   31   60:checkcast       #42  <Class IGmsServiceBroker>
		//   32   63:astore_1        
				break MISSING_BLOCK_LABEL_76;
		//   33   64:goto            76
			}
			componentname = ((ComponentName) (new IGmsServiceBroker.Stub.zza(ibinder)));
		//   34   67:new             #44  <Class IGmsServiceBroker$Stub$zza>
		//   35   70:dup             
		//   36   71:aload_2         
		//   37   72:invokespecial   #47  <Method void IGmsServiceBroker$Stub$zza(IBinder)>
		//   38   75:astore_1        
			BaseGmsClient.zza(basegmsclient, ((IGmsServiceBroker) (componentname)));
		//   39   76:aload           4
		//   40   78:aload_1         
		//   41   79:invokestatic    #50  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
		//   42   82:pop             
			obj;
		//   43   83:aload_3         
			JVM INSTR monitorexit ;
		//   44   84:monitorexit     
			zzcs.zza(0, ((Bundle) (null)), zzcw);
		//   45   85:aload_0         
		//   46   86:getfield        #18  <Field BaseGmsClient zzcs>
		//   47   89:iconst_0        
		//   48   90:aconst_null     
		//   49   91:aload_0         
		//   50   92:getfield        #23  <Field int zzcw>
		//   51   95:invokevirtual   #53  <Method void BaseGmsClient.zza(int, Bundle, int)>
			return;
		//   52   98:return          
			componentname;
		//   53   99:astore_1        
			obj;
		//   54  100:aload_3         
			JVM INSTR monitorexit ;
		//   55  101:monitorexit     
			throw componentname;
		//   56  102:aload_1         
		//   57  103:athrow          
		}

		public final void onServiceDisconnected(ComponentName componentname)
		{
			synchronized(BaseGmsClient.zza(zzcs))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field BaseGmsClient zzcs>
		//*   2    4:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				BaseGmsClient.zza(zzcs, ((IGmsServiceBroker) (null)));
		//    6   10:aload_0         
		//    7   11:getfield        #18  <Field BaseGmsClient zzcs>
		//    8   14:aconst_null     
		//    9   15:invokestatic    #50  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
		//   10   18:pop             
			}
		//   11   19:aload_1         
		//   12   20:monitorexit     
			zzcs.mHandler.sendMessage(zzcs.mHandler.obtainMessage(6, zzcw, 1));
		//   13   21:aload_0         
		//   14   22:getfield        #18  <Field BaseGmsClient zzcs>
		//   15   25:getfield        #59  <Field Handler BaseGmsClient.mHandler>
		//   16   28:aload_0         
		//   17   29:getfield        #18  <Field BaseGmsClient zzcs>
		//   18   32:getfield        #59  <Field Handler BaseGmsClient.mHandler>
		//   19   35:bipush          6
		//   20   37:aload_0         
		//   21   38:getfield        #23  <Field int zzcw>
		//   22   41:iconst_1        
		//   23   42:invokevirtual   #65  <Method Message Handler.obtainMessage(int, int, int)>
		//   24   45:invokevirtual   #69  <Method boolean Handler.sendMessage(Message)>
		//   25   48:pop             
			return;
		//   26   49:return          
			exception;
		//   27   50:astore_2        
			componentname;
		//   28   51:aload_1         
			JVM INSTR monitorexit ;
		//   29   52:monitorexit     
			throw exception;
		//   30   53:aload_2         
		//   31   54:athrow          
		}

		private final BaseGmsClient zzcs;
		private final int zzcw;

		public zze(int i)
		{
			zzcs = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field BaseGmsClient zzcs>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			zzcw = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int zzcw>
		//    8   14:return          
		}
	}

	protected final class zzf extends zza
	{

		protected final void zza(ConnectionResult connectionresult)
		{
			if(BaseGmsClient.zzg(zzcs) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field BaseGmsClient zzcs>
		//*   2    4:invokestatic    #28  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//*   3    7:ifnull          23
				BaseGmsClient.zzg(zzcs).onConnectionFailed(connectionresult);
		//    4   10:aload_0         
		//    5   11:getfield        #16  <Field BaseGmsClient zzcs>
		//    6   14:invokestatic    #28  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//    7   17:aload_1         
		//    8   18:invokeinterface #33  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
			zzcs.onConnectionFailed(connectionresult);
		//    9   23:aload_0         
		//   10   24:getfield        #16  <Field BaseGmsClient zzcs>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #34  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
		//   13   31:return          
		}

		protected final boolean zzm()
		{
			RemoteException remoteexception;
label0:
			{
				boolean flag1 = false;
		//    0    0:iconst_0        
		//    1    1:istore_2        
				boolean flag;
				Object obj;
				try
				{
					obj = ((Object) (zzcx.getInterfaceDescriptor()));
		//    2    2:aload_0         
		//    3    3:getfield        #21  <Field IBinder zzcx>
		//    4    6:invokeinterface #44  <Method String IBinder.getInterfaceDescriptor()>
		//    5   11:astore_3        
				}
		//*   6   12:aload_0         
		//*   7   13:getfield        #16  <Field BaseGmsClient zzcs>
		//*   8   16:invokevirtual   #47  <Method String BaseGmsClient.getServiceDescriptor()>
		//*   9   19:aload_3         
		//*  10   20:invokevirtual   #53  <Method boolean String.equals(Object)>
		//*  11   23:ifne            107
		//*  12   26:aload_0         
		//*  13   27:getfield        #16  <Field BaseGmsClient zzcs>
		//*  14   30:invokevirtual   #47  <Method String BaseGmsClient.getServiceDescriptor()>
		//*  15   33:astore          4
		//*  16   35:new             #55  <Class StringBuilder>
		//*  17   38:dup             
		//*  18   39:aload           4
		//*  19   41:invokestatic    #59  <Method String String.valueOf(Object)>
		//*  20   44:invokevirtual   #63  <Method int String.length()>
		//*  21   47:bipush          34
		//*  22   49:iadd            
		//*  23   50:aload_3         
		//*  24   51:invokestatic    #59  <Method String String.valueOf(Object)>
		//*  25   54:invokevirtual   #63  <Method int String.length()>
		//*  26   57:iadd            
		//*  27   58:invokespecial   #66  <Method void StringBuilder(int)>
		//*  28   61:astore          5
		//*  29   63:aload           5
		//*  30   65:ldc1            #68  <String "service descriptor mismatch: ">
		//*  31   67:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//*  32   70:pop             
		//*  33   71:aload           5
		//*  34   73:aload           4
		//*  35   75:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//*  36   78:pop             
		//*  37   79:aload           5
		//*  38   81:ldc1            #74  <String " vs. ">
		//*  39   83:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//*  40   86:pop             
		//*  41   87:aload           5
		//*  42   89:aload_3         
		//*  43   90:invokevirtual   #72  <Method StringBuilder StringBuilder.append(String)>
		//*  44   93:pop             
		//*  45   94:ldc1            #76  <String "GmsClient">
		//*  46   96:aload           5
		//*  47   98:invokevirtual   #79  <Method String StringBuilder.toString()>
		//*  48  101:invokestatic    #85  <Method int Log.e(String, String)>
		//*  49  104:pop             
		//*  50  105:iconst_0        
		//*  51  106:ireturn         
		//*  52  107:aload_0         
		//*  53  108:getfield        #16  <Field BaseGmsClient zzcs>
		//*  54  111:aload_0         
		//*  55  112:getfield        #21  <Field IBinder zzcx>
		//*  56  115:invokevirtual   #89  <Method IInterface BaseGmsClient.createServiceInterface(IBinder)>
		//*  57  118:astore_3        
		//*  58  119:iload_2         
		//*  59  120:istore_1        
		//*  60  121:aload_3         
		//*  61  122:ifnull          195
		//*  62  125:aload_0         
		//*  63  126:getfield        #16  <Field BaseGmsClient zzcs>
		//*  64  129:iconst_2        
		//*  65  130:iconst_4        
		//*  66  131:aload_3         
		//*  67  132:invokestatic    #92  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
		//*  68  135:ifne            153
		//*  69  138:iload_2         
		//*  70  139:istore_1        
		//*  71  140:aload_0         
		//*  72  141:getfield        #16  <Field BaseGmsClient zzcs>
		//*  73  144:iconst_3        
		//*  74  145:iconst_4        
		//*  75  146:aload_3         
		//*  76  147:invokestatic    #92  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
		//*  77  150:ifeq            195
		//*  78  153:aload_0         
		//*  79  154:getfield        #16  <Field BaseGmsClient zzcs>
		//*  80  157:aconst_null     
		//*  81  158:invokestatic    #95  <Method ConnectionResult BaseGmsClient.zza(BaseGmsClient, ConnectionResult)>
		//*  82  161:pop             
		//*  83  162:aload_0         
		//*  84  163:getfield        #16  <Field BaseGmsClient zzcs>
		//*  85  166:invokevirtual   #99  <Method Bundle BaseGmsClient.getConnectionHint()>
		//*  86  169:astore_3        
		//*  87  170:aload_0         
		//*  88  171:getfield        #16  <Field BaseGmsClient zzcs>
		//*  89  174:invokestatic    #103 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//*  90  177:ifnull          193
		//*  91  180:aload_0         
		//*  92  181:getfield        #16  <Field BaseGmsClient zzcs>
		//*  93  184:invokestatic    #103 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//*  94  187:aload_3         
		//*  95  188:invokeinterface #109 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnected(Bundle)>
		//*  96  193:iconst_1        
		//*  97  194:istore_1        
		//*  98  195:iload_1         
		//*  99  196:ireturn         
		//* 100  197:ldc1            #76  <String "GmsClient">
		//* 101  199:ldc1            #111 <String "service probably died">
		//* 102  201:invokestatic    #114 <Method int Log.w(String, String)>
		//* 103  204:pop             
		//* 104  205:iconst_0        
		//* 105  206:ireturn         
				// Misplaced declaration of an exception variable
				catch(RemoteException remoteexception)
				{
					Log.w("GmsClient", "service probably died");
					return false;
				}
				if(!zzcs.getServiceDescriptor().equals(obj))
				{
					String s = zzcs.getServiceDescriptor();
					StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(obj).length());
					stringbuilder.append("service descriptor mismatch: ");
					stringbuilder.append(s);
					stringbuilder.append(" vs. ");
					stringbuilder.append(((String) (obj)));
					Log.e("GmsClient", stringbuilder.toString());
					return false;
				}
				obj = ((Object) (zzcs.createServiceInterface(zzcx)));
				flag = flag1;
				if(obj == null)
					break label0;
				if(!BaseGmsClient.zza(zzcs, 2, 4, ((IInterface) (obj))))
				{
					flag = flag1;
					if(!BaseGmsClient.zza(zzcs, 3, 4, ((IInterface) (obj))))
						break label0;
				}
				BaseGmsClient.zza(zzcs, ((ConnectionResult) (null)));
				obj = ((Object) (zzcs.getConnectionHint()));
				if(BaseGmsClient.zze(zzcs) != null)
					BaseGmsClient.zze(zzcs).onConnected(((Bundle) (obj)));
				flag = true;
			}
			return flag;
		//* 106  207:astore_3        
		//* 107  208:goto            197
		}

		private final BaseGmsClient zzcs;
		private final IBinder zzcx;

		public zzf(int i, IBinder ibinder, Bundle bundle)
		{
			zzcs = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field BaseGmsClient zzcs>
			super(i, bundle);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:aload           4
		//    7   10:invokespecial   #19  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
			zzcx = ibinder;
		//    8   13:aload_0         
		//    9   14:aload_3         
		//   10   15:putfield        #21  <Field IBinder zzcx>
		//   11   18:return          
		}
	}

	protected final class zzg extends zza
	{

		protected final void zza(ConnectionResult connectionresult)
		{
			zzcs.zzce.onReportServiceBinding(connectionresult);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field BaseGmsClient zzcs>
		//    2    4:getfield        #23  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzce>
		//    3    7:aload_1         
		//    4    8:invokeinterface #28  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			zzcs.onConnectionFailed(connectionresult);
		//    5   13:aload_0         
		//    6   14:getfield        #14  <Field BaseGmsClient zzcs>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #31  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
		//    9   21:return          
		}

		protected final boolean zzm()
		{
			zzcs.zzce.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
		//    0    0:aload_0         
		//    1    1:getfield        #14  <Field BaseGmsClient zzcs>
		//    2    4:getfield        #23  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzce>
		//    3    7:getstatic       #39  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
		//    4   10:invokeinterface #28  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			return true;
		//    5   15:iconst_1        
		//    6   16:ireturn         
		}

		private final BaseGmsClient zzcs;

		public zzg(int i, Bundle bundle)
		{
			zzcs = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field BaseGmsClient zzcs>
			super(i, ((Bundle) (null)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:aconst_null     
		//    7    9:invokespecial   #16  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
		//    8   12:return          
		}
	}


	protected BaseGmsClient(Context context, Handler handler, GmsClientSupervisor gmsclientsupervisor, GoogleApiAvailabilityLight googleapiavailabilitylight, int i, BaseConnectionCallbacks baseconnectioncallbacks, BaseOnConnectionFailedListener baseonconnectionfailedlistener)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #131 <Method void Object()>
	//    6   12:putfield        #133 <Field Object mLock>
		zzcc = new Object();
	//    7   15:aload_0         
	//    8   16:new             #5   <Class Object>
	//    9   19:dup             
	//   10   20:invokespecial   #131 <Method void Object()>
	//   11   23:putfield        #135 <Field Object zzcc>
		zzcg = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #137 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #138 <Method void ArrayList()>
	//   16   34:putfield        #140 <Field ArrayList zzcg>
		zzci = 1;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #142 <Field int zzci>
		zzcn = null;
	//   20   42:aload_0         
	//   21   43:aconst_null     
	//   22   44:putfield        #144 <Field ConnectionResult zzcn>
		zzco = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #146 <Field boolean zzco>
		zzcp = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #148 <Field zzb zzcp>
		zzcq = new AtomicInteger(0);
	//   29   57:aload_0         
	//   30   58:new             #150 <Class AtomicInteger>
	//   31   61:dup             
	//   32   62:iconst_0        
	//   33   63:invokespecial   #153 <Method void AtomicInteger(int)>
	//   34   66:putfield        #155 <Field AtomicInteger zzcq>
		mContext = (Context)Preconditions.checkNotNull(((Object) (context)), "Context must not be null");
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:ldc1            #157 <String "Context must not be null">
	//   38   73:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   39   76:checkcast       #165 <Class Context>
	//   40   79:putfield        #167 <Field Context mContext>
		mHandler = (Handler)Preconditions.checkNotNull(((Object) (handler)), "Handler must not be null");
	//   41   82:aload_0         
	//   42   83:aload_2         
	//   43   84:ldc1            #169 <String "Handler must not be null">
	//   44   86:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   45   89:checkcast       #171 <Class Handler>
	//   46   92:putfield        #173 <Field Handler mHandler>
		zzbz = handler.getLooper();
	//   47   95:aload_0         
	//   48   96:aload_2         
	//   49   97:invokevirtual   #177 <Method Looper Handler.getLooper()>
	//   50  100:putfield        #179 <Field Looper zzbz>
		zzca = (GmsClientSupervisor)Preconditions.checkNotNull(((Object) (gmsclientsupervisor)), "Supervisor must not be null");
	//   51  103:aload_0         
	//   52  104:aload_3         
	//   53  105:ldc1            #181 <String "Supervisor must not be null">
	//   54  107:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   55  110:checkcast       #183 <Class GmsClientSupervisor>
	//   56  113:putfield        #185 <Field GmsClientSupervisor zzca>
		zzcb = (GoogleApiAvailabilityLight)Preconditions.checkNotNull(((Object) (googleapiavailabilitylight)), "API availability must not be null");
	//   57  116:aload_0         
	//   58  117:aload           4
	//   59  119:ldc1            #187 <String "API availability must not be null">
	//   60  121:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   61  124:checkcast       #189 <Class GoogleApiAvailabilityLight>
	//   62  127:putfield        #191 <Field GoogleApiAvailabilityLight zzcb>
		zzcl = i;
	//   63  130:aload_0         
	//   64  131:iload           5
	//   65  133:putfield        #193 <Field int zzcl>
		zzcj = baseconnectioncallbacks;
	//   66  136:aload_0         
	//   67  137:aload           6
	//   68  139:putfield        #195 <Field BaseGmsClient$BaseConnectionCallbacks zzcj>
		zzck = baseonconnectionfailedlistener;
	//   69  142:aload_0         
	//   70  143:aload           7
	//   71  145:putfield        #197 <Field BaseGmsClient$BaseOnConnectionFailedListener zzck>
		zzcm = null;
	//   72  148:aload_0         
	//   73  149:aconst_null     
	//   74  150:putfield        #199 <Field String zzcm>
	//   75  153:return          
	}

	protected BaseGmsClient(Context context, Looper looper, int i, BaseConnectionCallbacks baseconnectioncallbacks, BaseOnConnectionFailedListener baseonconnectionfailedlistener, String s)
	{
		this(context, looper, GmsClientSupervisor.getInstance(context), GoogleApiAvailabilityLight.getInstance(), i, (BaseConnectionCallbacks)Preconditions.checkNotNull(((Object) (baseconnectioncallbacks))), (BaseOnConnectionFailedListener)Preconditions.checkNotNull(((Object) (baseonconnectionfailedlistener))), s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_1         
	//    4    4:invokestatic    #205 <Method GmsClientSupervisor GmsClientSupervisor.getInstance(Context)>
	//    5    7:invokestatic    #208 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//    6   10:iload_3         
	//    7   11:aload           4
	//    8   13:invokestatic    #211 <Method Object Preconditions.checkNotNull(Object)>
	//    9   16:checkcast       #7   <Class BaseGmsClient$BaseConnectionCallbacks>
	//   10   19:aload           5
	//   11   21:invokestatic    #211 <Method Object Preconditions.checkNotNull(Object)>
	//   12   24:checkcast       #10  <Class BaseGmsClient$BaseOnConnectionFailedListener>
	//   13   27:aload           6
	//   14   29:invokespecial   #214 <Method void BaseGmsClient(Context, Looper, GmsClientSupervisor, GoogleApiAvailabilityLight, int, BaseGmsClient$BaseConnectionCallbacks, BaseGmsClient$BaseOnConnectionFailedListener, String)>
	//   15   32:return          
	}

	protected BaseGmsClient(Context context, Looper looper, GmsClientSupervisor gmsclientsupervisor, GoogleApiAvailabilityLight googleapiavailabilitylight, int i, BaseConnectionCallbacks baseconnectioncallbacks, BaseOnConnectionFailedListener baseonconnectionfailedlistener, 
			String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #131 <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #131 <Method void Object()>
	//    6   12:putfield        #133 <Field Object mLock>
		zzcc = new Object();
	//    7   15:aload_0         
	//    8   16:new             #5   <Class Object>
	//    9   19:dup             
	//   10   20:invokespecial   #131 <Method void Object()>
	//   11   23:putfield        #135 <Field Object zzcc>
		zzcg = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #137 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #138 <Method void ArrayList()>
	//   16   34:putfield        #140 <Field ArrayList zzcg>
		zzci = 1;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #142 <Field int zzci>
		zzcn = null;
	//   20   42:aload_0         
	//   21   43:aconst_null     
	//   22   44:putfield        #144 <Field ConnectionResult zzcn>
		zzco = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #146 <Field boolean zzco>
		zzcp = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #148 <Field zzb zzcp>
		zzcq = new AtomicInteger(0);
	//   29   57:aload_0         
	//   30   58:new             #150 <Class AtomicInteger>
	//   31   61:dup             
	//   32   62:iconst_0        
	//   33   63:invokespecial   #153 <Method void AtomicInteger(int)>
	//   34   66:putfield        #155 <Field AtomicInteger zzcq>
		mContext = (Context)Preconditions.checkNotNull(((Object) (context)), "Context must not be null");
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:ldc1            #157 <String "Context must not be null">
	//   38   73:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   39   76:checkcast       #165 <Class Context>
	//   40   79:putfield        #167 <Field Context mContext>
		zzbz = (Looper)Preconditions.checkNotNull(((Object) (looper)), "Looper must not be null");
	//   41   82:aload_0         
	//   42   83:aload_2         
	//   43   84:ldc1            #216 <String "Looper must not be null">
	//   44   86:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   45   89:checkcast       #218 <Class Looper>
	//   46   92:putfield        #179 <Field Looper zzbz>
		zzca = (GmsClientSupervisor)Preconditions.checkNotNull(((Object) (gmsclientsupervisor)), "Supervisor must not be null");
	//   47   95:aload_0         
	//   48   96:aload_3         
	//   49   97:ldc1            #181 <String "Supervisor must not be null">
	//   50   99:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   51  102:checkcast       #183 <Class GmsClientSupervisor>
	//   52  105:putfield        #185 <Field GmsClientSupervisor zzca>
		zzcb = (GoogleApiAvailabilityLight)Preconditions.checkNotNull(((Object) (googleapiavailabilitylight)), "API availability must not be null");
	//   53  108:aload_0         
	//   54  109:aload           4
	//   55  111:ldc1            #187 <String "API availability must not be null">
	//   56  113:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   57  116:checkcast       #189 <Class GoogleApiAvailabilityLight>
	//   58  119:putfield        #191 <Field GoogleApiAvailabilityLight zzcb>
		mHandler = ((Handler) (new zzb(looper)));
	//   59  122:aload_0         
	//   60  123:new             #25  <Class BaseGmsClient$zzb>
	//   61  126:dup             
	//   62  127:aload_0         
	//   63  128:aload_2         
	//   64  129:invokespecial   #221 <Method void BaseGmsClient$zzb(BaseGmsClient, Looper)>
	//   65  132:putfield        #173 <Field Handler mHandler>
		zzcl = i;
	//   66  135:aload_0         
	//   67  136:iload           5
	//   68  138:putfield        #193 <Field int zzcl>
		zzcj = baseconnectioncallbacks;
	//   69  141:aload_0         
	//   70  142:aload           6
	//   71  144:putfield        #195 <Field BaseGmsClient$BaseConnectionCallbacks zzcj>
		zzck = baseonconnectionfailedlistener;
	//   72  147:aload_0         
	//   73  148:aload           7
	//   74  150:putfield        #197 <Field BaseGmsClient$BaseOnConnectionFailedListener zzck>
		zzcm = s;
	//   75  153:aload_0         
	//   76  154:aload           8
	//   77  156:putfield        #199 <Field String zzcm>
	//   78  159:return          
	}

	static ConnectionResult zza(BaseGmsClient basegmsclient, ConnectionResult connectionresult)
	{
		basegmsclient.zzcn = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #144 <Field ConnectionResult zzcn>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static IGmsServiceBroker zza(BaseGmsClient basegmsclient, IGmsServiceBroker igmsservicebroker)
	{
		basegmsclient.zzcd = igmsservicebroker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #225 <Field IGmsServiceBroker zzcd>
		return igmsservicebroker;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Object zza(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzcc;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Object zzcc>
	//    2    4:areturn         
	}

	private final void zza(int i, IInterface iinterface)
	{
		boolean flag;
		if(i == 4)
	//*   0    0:iload_1         
	//*   1    1:iconst_4        
	//*   2    2:icmpne          10
			flag = true;
	//    3    5:iconst_1        
	//    4    6:istore_3        
		else
	//*   5    7:goto            12
			flag = false;
	//    6   10:iconst_0        
	//    7   11:istore_3        
		boolean flag1;
		if(iinterface != null)
	//*   8   12:aload_2         
	//*   9   13:ifnull          22
			flag1 = true;
	//   10   16:iconst_1        
	//   11   17:istore          4
		else
	//*  12   19:goto            25
			flag1 = false;
	//   13   22:iconst_0        
	//   14   23:istore          4
		boolean flag2;
		if(flag == flag1)
	//*  15   25:iload_3         
	//*  16   26:iload           4
	//*  17   28:icmpne          37
			flag2 = true;
	//   18   31:iconst_1        
	//   19   32:istore          5
		else
	//*  20   34:goto            40
			flag2 = false;
	//   21   37:iconst_0        
	//   22   38:istore          5
		Preconditions.checkArgument(flag2);
	//   23   40:iload           5
	//   24   42:invokestatic    #231 <Method void Preconditions.checkArgument(boolean)>
		Object obj = mLock;
	//   25   45:aload_0         
	//   26   46:getfield        #133 <Field Object mLock>
	//   27   49:astore          6
		obj;
	//   28   51:aload           6
		JVM INSTR monitorenter ;
	//   29   53:monitorenter    
		zzci = i;
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:putfield        #142 <Field int zzci>
		zzcf = iinterface;
	//   33   59:aload_0         
	//   34   60:aload_2         
	//   35   61:putfield        #233 <Field IInterface zzcf>
		onSetConnectState(i, iinterface);
	//   36   64:aload_0         
	//   37   65:iload_1         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #236 <Method void onSetConnectState(int, IInterface)>
		i;
	//   40   70:iload_1         
		JVM INSTR tableswitch 1 4: default 562
	//	               1 514
	//	               2 108
	//	               3 108
	//	               4 100;
	//   41   71:tableswitch     1 4: default 562
	//	               1 514
	//	               2 108
	//	               3 108
	//	               4 100
		   goto _L1 _L2 _L3 _L3 _L4
_L1:
		break MISSING_BLOCK_LABEL_552;
_L4:
		onConnectedLocked(iinterface);
	//   42  100:aload_0         
	//   43  101:aload_2         
	//   44  102:invokevirtual   #240 <Method void onConnectedLocked(IInterface)>
		break MISSING_BLOCK_LABEL_552;
	//   45  105:goto            552
_L3:
		if(zzch != null && zzby != null)
	//*  46  108:aload_0         
	//*  47  109:getfield        #242 <Field BaseGmsClient$zze zzch>
	//*  48  112:ifnull          256
	//*  49  115:aload_0         
	//*  50  116:getfield        #244 <Field zzh zzby>
	//*  51  119:ifnull          256
		{
			iinterface = ((IInterface) (zzby.zzt()));
	//   52  122:aload_0         
	//   53  123:getfield        #244 <Field zzh zzby>
	//   54  126:invokevirtual   #250 <Method String zzh.zzt()>
	//   55  129:astore_2        
			String s = zzby.getPackageName();
	//   56  130:aload_0         
	//   57  131:getfield        #244 <Field zzh zzby>
	//   58  134:invokevirtual   #253 <Method String zzh.getPackageName()>
	//   59  137:astore          7
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (iinterface))).length() + 70 + String.valueOf(((Object) (s))).length());
	//   60  139:new             #255 <Class StringBuilder>
	//   61  142:dup             
	//   62  143:aload_2         
	//   63  144:invokestatic    #259 <Method String String.valueOf(Object)>
	//   64  147:invokevirtual   #263 <Method int String.length()>
	//   65  150:bipush          70
	//   66  152:iadd            
	//   67  153:aload           7
	//   68  155:invokestatic    #259 <Method String String.valueOf(Object)>
	//   69  158:invokevirtual   #263 <Method int String.length()>
	//   70  161:iadd            
	//   71  162:invokespecial   #264 <Method void StringBuilder(int)>
	//   72  165:astore          8
			stringbuilder.append("Calling connect() while still connected, missing disconnect() for ");
	//   73  167:aload           8
	//   74  169:ldc2            #266 <String "Calling connect() while still connected, missing disconnect() for ">
	//   75  172:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//   76  175:pop             
			stringbuilder.append(((String) (iinterface)));
	//   77  176:aload           8
	//   78  178:aload_2         
	//   79  179:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//   80  182:pop             
			stringbuilder.append(" on ");
	//   81  183:aload           8
	//   82  185:ldc2            #272 <String " on ">
	//   83  188:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//   84  191:pop             
			stringbuilder.append(s);
	//   85  192:aload           8
	//   86  194:aload           7
	//   87  196:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//   88  199:pop             
			Log.e("GmsClient", stringbuilder.toString());
	//   89  200:ldc2            #274 <String "GmsClient">
	//   90  203:aload           8
	//   91  205:invokevirtual   #277 <Method String StringBuilder.toString()>
	//   92  208:invokestatic    #283 <Method int Log.e(String, String)>
	//   93  211:pop             
			zzca.zza(zzby.zzt(), zzby.getPackageName(), zzby.zzq(), ((ServiceConnection) (zzch)), zzj());
	//   94  212:aload_0         
	//   95  213:getfield        #185 <Field GmsClientSupervisor zzca>
	//   96  216:aload_0         
	//   97  217:getfield        #244 <Field zzh zzby>
	//   98  220:invokevirtual   #250 <Method String zzh.zzt()>
	//   99  223:aload_0         
	//  100  224:getfield        #244 <Field zzh zzby>
	//  101  227:invokevirtual   #253 <Method String zzh.getPackageName()>
	//  102  230:aload_0         
	//  103  231:getfield        #244 <Field zzh zzby>
	//  104  234:invokevirtual   #286 <Method int zzh.zzq()>
	//  105  237:aload_0         
	//  106  238:getfield        #242 <Field BaseGmsClient$zze zzch>
	//  107  241:aload_0         
	//  108  242:invokespecial   #289 <Method String zzj()>
	//  109  245:invokevirtual   #292 <Method void GmsClientSupervisor.zza(String, String, int, ServiceConnection, String)>
			zzcq.incrementAndGet();
	//  110  248:aload_0         
	//  111  249:getfield        #155 <Field AtomicInteger zzcq>
	//  112  252:invokevirtual   #295 <Method int AtomicInteger.incrementAndGet()>
	//  113  255:pop             
		}
		zzch = new zze(zzcq.get());
	//  114  256:aload_0         
	//  115  257:new             #34  <Class BaseGmsClient$zze>
	//  116  260:dup             
	//  117  261:aload_0         
	//  118  262:aload_0         
	//  119  263:getfield        #155 <Field AtomicInteger zzcq>
	//  120  266:invokevirtual   #298 <Method int AtomicInteger.get()>
	//  121  269:invokespecial   #301 <Method void BaseGmsClient$zze(BaseGmsClient, int)>
	//  122  272:putfield        #242 <Field BaseGmsClient$zze zzch>
		if(zzci != 3 || getLocalStartServiceAction() == null) goto _L6; else goto _L5
	//  123  275:aload_0         
	//  124  276:getfield        #142 <Field int zzci>
	//  125  279:iconst_3        
	//  126  280:icmpne          316
	//  127  283:aload_0         
	//  128  284:invokevirtual   #304 <Method String getLocalStartServiceAction()>
	//  129  287:ifnull          316
_L5:
		iinterface = ((IInterface) (new zzh(getContext().getPackageName(), getLocalStartServiceAction(), true, 129)));
	//  130  290:new             #246 <Class zzh>
	//  131  293:dup             
	//  132  294:aload_0         
	//  133  295:invokevirtual   #308 <Method Context getContext()>
	//  134  298:invokevirtual   #309 <Method String Context.getPackageName()>
	//  135  301:aload_0         
	//  136  302:invokevirtual   #304 <Method String getLocalStartServiceAction()>
	//  137  305:iconst_1        
	//  138  306:sipush          129
	//  139  309:invokespecial   #312 <Method void zzh(String, String, boolean, int)>
	//  140  312:astore_2        
		  goto _L7
	//* 141  313:goto            336
_L6:
		iinterface = ((IInterface) (new zzh(getStartServicePackage(), getStartServiceAction(), false, 129)));
	//  142  316:new             #246 <Class zzh>
	//  143  319:dup             
	//  144  320:aload_0         
	//  145  321:invokevirtual   #315 <Method String getStartServicePackage()>
	//  146  324:aload_0         
	//  147  325:invokevirtual   #318 <Method String getStartServiceAction()>
	//  148  328:iconst_0        
	//  149  329:sipush          129
	//  150  332:invokespecial   #312 <Method void zzh(String, String, boolean, int)>
	//  151  335:astore_2        
_L7:
		zzby = ((zzh) (iinterface));
	//  152  336:aload_0         
	//  153  337:aload_2         
	//  154  338:putfield        #244 <Field zzh zzby>
		iinterface = ((IInterface) (zzca));
	//  155  341:aload_0         
	//  156  342:getfield        #185 <Field GmsClientSupervisor zzca>
	//  157  345:astore_2        
		String s1 = zzby.zzt();
	//  158  346:aload_0         
	//  159  347:getfield        #244 <Field zzh zzby>
	//  160  350:invokevirtual   #250 <Method String zzh.zzt()>
	//  161  353:astore          7
		String s3 = zzby.getPackageName();
	//  162  355:aload_0         
	//  163  356:getfield        #244 <Field zzh zzby>
	//  164  359:invokevirtual   #253 <Method String zzh.getPackageName()>
	//  165  362:astore          8
		i = zzby.zzq();
	//  166  364:aload_0         
	//  167  365:getfield        #244 <Field zzh zzby>
	//  168  368:invokevirtual   #286 <Method int zzh.zzq()>
	//  169  371:istore_1        
		zze zze1 = zzch;
	//  170  372:aload_0         
	//  171  373:getfield        #242 <Field BaseGmsClient$zze zzch>
	//  172  376:astore          9
		String s4 = zzj();
	//  173  378:aload_0         
	//  174  379:invokespecial   #289 <Method String zzj()>
	//  175  382:astore          10
		if(!((GmsClientSupervisor) (iinterface)).zza(new GmsClientSupervisor.zza(s1, s3, i), ((ServiceConnection) (zze1)), s4))
	//* 176  384:aload_2         
	//* 177  385:new             #320 <Class GmsClientSupervisor$zza>
	//* 178  388:dup             
	//* 179  389:aload           7
	//* 180  391:aload           8
	//* 181  393:iload_1         
	//* 182  394:invokespecial   #323 <Method void GmsClientSupervisor$zza(String, String, int)>
	//* 183  397:aload           9
	//* 184  399:aload           10
	//* 185  401:invokevirtual   #326 <Method boolean GmsClientSupervisor.zza(GmsClientSupervisor$zza, ServiceConnection, String)>
	//* 186  404:ifne            552
		{
			iinterface = ((IInterface) (zzby.zzt()));
	//  187  407:aload_0         
	//  188  408:getfield        #244 <Field zzh zzby>
	//  189  411:invokevirtual   #250 <Method String zzh.zzt()>
	//  190  414:astore_2        
			String s2 = zzby.getPackageName();
	//  191  415:aload_0         
	//  192  416:getfield        #244 <Field zzh zzby>
	//  193  419:invokevirtual   #253 <Method String zzh.getPackageName()>
	//  194  422:astore          7
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (iinterface))).length() + 34 + String.valueOf(((Object) (s2))).length());
	//  195  424:new             #255 <Class StringBuilder>
	//  196  427:dup             
	//  197  428:aload_2         
	//  198  429:invokestatic    #259 <Method String String.valueOf(Object)>
	//  199  432:invokevirtual   #263 <Method int String.length()>
	//  200  435:bipush          34
	//  201  437:iadd            
	//  202  438:aload           7
	//  203  440:invokestatic    #259 <Method String String.valueOf(Object)>
	//  204  443:invokevirtual   #263 <Method int String.length()>
	//  205  446:iadd            
	//  206  447:invokespecial   #264 <Method void StringBuilder(int)>
	//  207  450:astore          8
			stringbuilder1.append("unable to connect to service: ");
	//  208  452:aload           8
	//  209  454:ldc2            #328 <String "unable to connect to service: ">
	//  210  457:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  211  460:pop             
			stringbuilder1.append(((String) (iinterface)));
	//  212  461:aload           8
	//  213  463:aload_2         
	//  214  464:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  215  467:pop             
			stringbuilder1.append(" on ");
	//  216  468:aload           8
	//  217  470:ldc2            #272 <String " on ">
	//  218  473:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  219  476:pop             
			stringbuilder1.append(s2);
	//  220  477:aload           8
	//  221  479:aload           7
	//  222  481:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  223  484:pop             
			Log.e("GmsClient", stringbuilder1.toString());
	//  224  485:ldc2            #274 <String "GmsClient">
	//  225  488:aload           8
	//  226  490:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  227  493:invokestatic    #283 <Method int Log.e(String, String)>
	//  228  496:pop             
			zza(16, ((Bundle) (null)), zzcq.get());
	//  229  497:aload_0         
	//  230  498:bipush          16
	//  231  500:aconst_null     
	//  232  501:aload_0         
	//  233  502:getfield        #155 <Field AtomicInteger zzcq>
	//  234  505:invokevirtual   #298 <Method int AtomicInteger.get()>
	//  235  508:invokevirtual   #331 <Method void zza(int, Bundle, int)>
		}
		break MISSING_BLOCK_LABEL_552;
	//  236  511:goto            552
_L2:
		if(zzch != null)
	//* 237  514:aload_0         
	//* 238  515:getfield        #242 <Field BaseGmsClient$zze zzch>
	//* 239  518:ifnull          552
		{
			zzca.zza(getStartServiceAction(), getStartServicePackage(), 129, ((ServiceConnection) (zzch)), zzj());
	//  240  521:aload_0         
	//  241  522:getfield        #185 <Field GmsClientSupervisor zzca>
	//  242  525:aload_0         
	//  243  526:invokevirtual   #318 <Method String getStartServiceAction()>
	//  244  529:aload_0         
	//  245  530:invokevirtual   #315 <Method String getStartServicePackage()>
	//  246  533:sipush          129
	//  247  536:aload_0         
	//  248  537:getfield        #242 <Field BaseGmsClient$zze zzch>
	//  249  540:aload_0         
	//  250  541:invokespecial   #289 <Method String zzj()>
	//  251  544:invokevirtual   #292 <Method void GmsClientSupervisor.zza(String, String, int, ServiceConnection, String)>
			zzch = null;
	//  252  547:aload_0         
	//  253  548:aconst_null     
	//  254  549:putfield        #242 <Field BaseGmsClient$zze zzch>
		}
		obj;
	//  255  552:aload           6
		JVM INSTR monitorexit ;
	//  256  554:monitorexit     
		return;
	//  257  555:return          
		iinterface;
	//  258  556:astore_2        
		obj;
	//  259  557:aload           6
		JVM INSTR monitorexit ;
	//  260  559:monitorexit     
		throw iinterface;
	//  261  560:aload_2         
	//  262  561:athrow          
	//* 263  562:goto            552
	}

	static void zza(BaseGmsClient basegmsclient, int i)
	{
		basegmsclient.zzb(16);
	//    0    0:aload_0         
	//    1    1:bipush          16
	//    2    3:invokespecial   #335 <Method void zzb(int)>
	//    3    6:return          
	}

	static void zza(BaseGmsClient basegmsclient, int i, IInterface iinterface)
	{
		basegmsclient.zza(i, ((IInterface) (null)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #338 <Method void zza(int, IInterface)>
	//    4    6:return          
	}

	static void zza(BaseGmsClient basegmsclient, com.google.android.gms.common.internal.zzb zzb1)
	{
		basegmsclient.zza(zzb1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #342 <Method void zza(zzb)>
	//    3    5:return          
	}

	private final void zza(com.google.android.gms.common.internal.zzb zzb1)
	{
		zzcp = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field zzb zzcp>
	//    3    5:return          
	}

	private final boolean zza(int i, int j, IInterface iinterface)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field Object mLock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
			{
				if(zzci == i)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #142 <Field int zzci>
	//    7   13:iload_1         
	//    8   14:icmpeq          22
			}
	//    9   17:aload           4
	//   10   19:monitorexit     
			return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
		}
		zza(j, iinterface);
	//   13   22:aload_0         
	//   14   23:iload_2         
	//   15   24:aload_3         
	//   16   25:invokespecial   #338 <Method void zza(int, IInterface)>
		obj;
	//   17   28:aload           4
		JVM INSTR monitorexit ;
	//   18   30:monitorexit     
		return true;
	//   19   31:iconst_1        
	//   20   32:ireturn         
		iinterface;
	//   21   33:astore_3        
		obj;
	//   22   34:aload           4
		JVM INSTR monitorexit ;
	//   23   36:monitorexit     
		throw iinterface;
	//   24   37:aload_3         
	//   25   38:athrow          
	}

	static boolean zza(BaseGmsClient basegmsclient, int i, int j, IInterface iinterface)
	{
		return basegmsclient.zza(i, j, iinterface);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #347 <Method boolean zza(int, int, IInterface)>
	//    5    7:ireturn         
	}

	private final void zzb(int i)
	{
		if(zzk())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #351 <Method boolean zzk()>
	//*   2    4:ifeq            17
		{
			i = 5;
	//    3    7:iconst_5        
	//    4    8:istore_1        
			zzco = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #146 <Field boolean zzco>
		} else
	//*   8   14:goto            19
		{
			i = 4;
	//    9   17:iconst_4        
	//   10   18:istore_1        
		}
		mHandler.sendMessage(mHandler.obtainMessage(i, zzcq.get(), 16));
	//   11   19:aload_0         
	//   12   20:getfield        #173 <Field Handler mHandler>
	//   13   23:aload_0         
	//   14   24:getfield        #173 <Field Handler mHandler>
	//   15   27:iload_1         
	//   16   28:aload_0         
	//   17   29:getfield        #155 <Field AtomicInteger zzcq>
	//   18   32:invokevirtual   #298 <Method int AtomicInteger.get()>
	//   19   35:bipush          16
	//   20   37:invokevirtual   #355 <Method Message Handler.obtainMessage(int, int, int)>
	//   21   40:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   22   43:pop             
	//   23   44:return          
	}

	static boolean zzb(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzl();
	//    0    0:aload_0         
	//    1    1:invokespecial   #363 <Method boolean zzl()>
	//    2    4:ireturn         
	}

	static boolean zzc(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzco;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field boolean zzco>
	//    2    4:ireturn         
	}

	static ConnectionResult zzd(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzcn;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field ConnectionResult zzcn>
	//    2    4:areturn         
	}

	static BaseConnectionCallbacks zze(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzcj;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field BaseGmsClient$BaseConnectionCallbacks zzcj>
	//    2    4:areturn         
	}

	static ArrayList zzf(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzcg;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList zzcg>
	//    2    4:areturn         
	}

	static BaseOnConnectionFailedListener zzg(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzck;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field BaseGmsClient$BaseOnConnectionFailedListener zzck>
	//    2    4:areturn         
	}

	private final String zzj()
	{
		if(zzcm == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field String zzcm>
	//*   2    4:ifnonnull       18
			return ((Object) (mContext)).getClass().getName();
	//    3    7:aload_0         
	//    4    8:getfield        #167 <Field Context mContext>
	//    5   11:invokevirtual   #371 <Method Class Object.getClass()>
	//    6   14:invokevirtual   #376 <Method String Class.getName()>
	//    7   17:areturn         
		else
			return zzcm;
	//    8   18:aload_0         
	//    9   19:getfield        #199 <Field String zzcm>
	//   10   22:areturn         
	}

	private final boolean zzk()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzci == 3)
	//*   5    7:aload_0         
	//*   6    8:getfield        #142 <Field int zzci>
	//*   7   11:iconst_3        
	//*   8   12:icmpne          29
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_1        
		else
	//*  11   17:goto            20
	//*  12   20:aload_2         
	//*  13   21:monitorexit     
	//*  14   22:iload_1         
	//*  15   23:ireturn         
	//*  16   24:astore_3        
	//*  17   25:aload_2         
	//*  18   26:monitorexit     
	//*  19   27:aload_3         
	//*  20   28:athrow          
			flag = false;
	//   21   29:iconst_0        
	//   22   30:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  23   31:goto            20
	}

	private final boolean zzl()
	{
		if(zzco)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field boolean zzco>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(TextUtils.isEmpty(((CharSequence) (getServiceDescriptor()))))
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #381 <Method String getServiceDescriptor()>
	//*   7   13:invokestatic    #387 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(TextUtils.isEmpty(((CharSequence) (getLocalStartServiceAction()))))
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #304 <Method String getLocalStartServiceAction()>
	//*  13   25:invokestatic    #387 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   28:ifeq            33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		try
		{
			Class.forName(getServiceDescriptor());
	//   17   33:aload_0         
	//   18   34:invokevirtual   #381 <Method String getServiceDescriptor()>
	//   19   37:invokestatic    #391 <Method Class Class.forName(String)>
	//   20   40:pop             
		}
	//*  21   41:iconst_1        
	//*  22   42:ireturn         
		catch(ClassNotFoundException classnotfoundexception)
	//*  23   43:astore_1        
		{
			return false;
	//   24   44:iconst_0        
	//   25   45:ireturn         
		}
		return true;
	}

	public void checkAvailabilityAndConnect()
	{
		int i = zzcb.isGooglePlayServicesAvailable(mContext, getMinApkVersion());
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field GoogleApiAvailabilityLight zzcb>
	//    2    4:aload_0         
	//    3    5:getfield        #167 <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #395 <Method int getMinApkVersion()>
	//    6   12:invokevirtual   #399 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//    7   15:istore_1        
		if(i != 0)
	//*   8   16:iload_1         
	//*   9   17:ifeq            41
		{
			zza(1, ((IInterface) (null)));
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:aconst_null     
	//   13   23:invokespecial   #338 <Method void zza(int, IInterface)>
			triggerNotAvailable(((ConnectionProgressReportCallbacks) (new LegacyClientCallbackAdapter())), i, ((PendingIntent) (null)));
	//   14   26:aload_0         
	//   15   27:new             #16  <Class BaseGmsClient$LegacyClientCallbackAdapter>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokespecial   #402 <Method void BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient)>
	//   19   35:iload_1         
	//   20   36:aconst_null     
	//   21   37:invokevirtual   #406 <Method void triggerNotAvailable(BaseGmsClient$ConnectionProgressReportCallbacks, int, PendingIntent)>
			return;
	//   22   40:return          
		} else
		{
			connect(((ConnectionProgressReportCallbacks) (new LegacyClientCallbackAdapter())));
	//   23   41:aload_0         
	//   24   42:new             #16  <Class BaseGmsClient$LegacyClientCallbackAdapter>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #402 <Method void BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient)>
	//   28   50:invokevirtual   #410 <Method void connect(BaseGmsClient$ConnectionProgressReportCallbacks)>
			return;
	//   29   53:return          
		}
	}

	protected final void checkConnected()
	{
		if(!isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #414 <Method boolean isConnected()>
	//*   2    4:ifne            18
			throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
	//    3    7:new             #416 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #418 <String "Not connected. Call connect() and wait for onConnected() to be called.">
	//    6   14:invokespecial   #421 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void connect(ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
	{
		zzce = (ConnectionProgressReportCallbacks)Preconditions.checkNotNull(((Object) (connectionprogressreportcallbacks)), "Connection progress callbacks cannot be null.");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #423 <String "Connection progress callbacks cannot be null.">
	//    3    5:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    8:checkcast       #13  <Class BaseGmsClient$ConnectionProgressReportCallbacks>
	//    5   11:putfield        #425 <Field BaseGmsClient$ConnectionProgressReportCallbacks zzce>
		zza(2, ((IInterface) (null)));
	//    6   14:aload_0         
	//    7   15:iconst_2        
	//    8   16:aconst_null     
	//    9   17:invokespecial   #338 <Method void zza(int, IInterface)>
	//   10   20:return          
	}

	protected abstract IInterface createServiceInterface(IBinder ibinder);

	public void disconnect()
	{
		zzcq.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field AtomicInteger zzcq>
	//    2    4:invokevirtual   #295 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		obj = ((Object) (zzcg));
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field ArrayList zzcg>
	//    6   12:astore_3        
		obj;
	//    7   13:aload_3         
		JVM INSTR monitorenter ;
	//    8   14:monitorenter    
		int j = zzcg.size();
	//    9   15:aload_0         
	//   10   16:getfield        #140 <Field ArrayList zzcg>
	//   11   19:invokevirtual   #431 <Method int ArrayList.size()>
	//   12   22:istore_2        
		int i = 0;
	//   13   23:iconst_0        
	//   14   24:istore_1        
_L2:
		if(i >= j)
			break; /* Loop/switch isn't completed */
	//   15   25:iload_1         
	//   16   26:iload_2         
	//   17   27:icmpge          51
		((zzc)zzcg.get(i)).removeListener();
	//   18   30:aload_0         
	//   19   31:getfield        #140 <Field ArrayList zzcg>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #434 <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #28  <Class BaseGmsClient$zzc>
	//   23   41:invokevirtual   #437 <Method void BaseGmsClient$zzc.removeListener()>
		i++;
	//   24   44:iload_1         
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_1        
		if(true) goto _L2; else goto _L1
	//   28   48:goto            25
_L1:
		zzcg.clear();
	//   29   51:aload_0         
	//   30   52:getfield        #140 <Field ArrayList zzcg>
	//   31   55:invokevirtual   #440 <Method void ArrayList.clear()>
		obj;
	//   32   58:aload_3         
		JVM INSTR monitorexit ;
	//   33   59:monitorexit     
		synchronized(zzcc)
	//*  34   60:aload_0         
	//*  35   61:getfield        #135 <Field Object zzcc>
	//*  36   64:astore_3        
	//*  37   65:aload_3         
	//*  38   66:monitorenter    
		{
			zzcd = null;
	//   39   67:aload_0         
	//   40   68:aconst_null     
	//   41   69:putfield        #225 <Field IGmsServiceBroker zzcd>
		}
	//   42   72:aload_3         
	//   43   73:monitorexit     
		zza(1, ((IInterface) (null)));
	//   44   74:aload_0         
	//   45   75:iconst_1        
	//   46   76:aconst_null     
	//   47   77:invokespecial   #338 <Method void zza(int, IInterface)>
		return;
	//   48   80:return          
		exception;
	//   49   81:astore          4
		obj;
	//   50   83:aload_3         
		JVM INSTR monitorexit ;
	//   51   84:monitorexit     
		throw exception;
	//   52   85:aload           4
	//   53   87:athrow          
		Exception exception1;
		exception1;
	//   54   88:astore          4
		obj;
	//   55   90:aload_3         
		JVM INSTR monitorexit ;
	//   56   91:monitorexit     
		throw exception1;
	//   57   92:aload           4
	//   58   94:athrow          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		int i;
		IGmsServiceBroker igmsservicebroker;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			i = zzci;
	//    5    7:aload_0         
	//    6    8:getfield        #142 <Field int zzci>
	//    7   11:istore          5
			as = ((String []) (zzcf));
	//    8   13:aload_0         
	//    9   14:getfield        #233 <Field IInterface zzcf>
	//   10   17:astore          4
		}
	//   11   19:aload_2         
	//   12   20:monitorexit     
		synchronized(zzcc)
	//*  13   21:aload_0         
	//*  14   22:getfield        #135 <Field Object zzcc>
	//*  15   25:astore_2        
	//*  16   26:aload_2         
	//*  17   27:monitorenter    
		{
			igmsservicebroker = zzcd;
	//   18   28:aload_0         
	//   19   29:getfield        #225 <Field IGmsServiceBroker zzcd>
	//   20   32:astore          8
		}
	//   21   34:aload_2         
	//   22   35:monitorexit     
		printwriter.append(((CharSequence) (s))).append("mConnectState=");
	//   23   36:aload_3         
	//   24   37:aload_1         
	//   25   38:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   26   41:ldc2            #449 <String "mConnectState=">
	//   27   44:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   28   47:pop             
		i;
	//   29   48:iload           5
		JVM INSTR tableswitch 1 5: default 84
	//	               1 124
	//	               2 117
	//	               3 110
	//	               4 103
	//	               5 96;
	//   30   50:tableswitch     1 5: default 84
	//	               1 124
	//	               2 117
	//	               3 110
	//	               4 103
	//	               5 96
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		filedescriptor = "UNKNOWN";
	//   31   84:ldc2            #451 <String "UNKNOWN">
	//   32   87:astore_2        
_L8:
		printwriter.print(((String) (filedescriptor)));
	//   33   88:aload_3         
	//   34   89:aload_2         
	//   35   90:invokevirtual   #454 <Method void PrintWriter.print(String)>
		break; /* Loop/switch isn't completed */
	//   36   93:goto            131
_L6:
		filedescriptor = "DISCONNECTING";
	//   37   96:ldc2            #456 <String "DISCONNECTING">
	//   38   99:astore_2        
		continue; /* Loop/switch isn't completed */
	//   39  100:goto            88
_L5:
		filedescriptor = "CONNECTED";
	//   40  103:ldc2            #458 <String "CONNECTED">
	//   41  106:astore_2        
		continue; /* Loop/switch isn't completed */
	//   42  107:goto            88
_L4:
		filedescriptor = "LOCAL_CONNECTING";
	//   43  110:ldc2            #460 <String "LOCAL_CONNECTING">
	//   44  113:astore_2        
		continue; /* Loop/switch isn't completed */
	//   45  114:goto            88
_L3:
		filedescriptor = "REMOTE_CONNECTING";
	//   46  117:ldc2            #462 <String "REMOTE_CONNECTING">
	//   47  120:astore_2        
		continue; /* Loop/switch isn't completed */
	//   48  121:goto            88
_L2:
		filedescriptor = "DISCONNECTED";
	//   49  124:ldc2            #464 <String "DISCONNECTED">
	//   50  127:astore_2        
		if(true) goto _L8; else goto _L7
	//   51  128:goto            88
_L7:
		printwriter.append(" mService=");
	//   52  131:aload_3         
	//   53  132:ldc2            #466 <String " mService=">
	//   54  135:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   55  138:pop             
		if(as == null)
	//*  56  139:aload           4
	//*  57  141:ifnonnull       155
			printwriter.append("null");
	//   58  144:aload_3         
	//   59  145:ldc2            #468 <String "null">
	//   60  148:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   61  151:pop             
		else
	//*  62  152:goto            186
			printwriter.append(((CharSequence) (getServiceDescriptor()))).append("@").append(((CharSequence) (Integer.toHexString(System.identityHashCode(((Object) (((IInterface) (as)).asBinder())))))));
	//   63  155:aload_3         
	//   64  156:aload_0         
	//   65  157:invokevirtual   #381 <Method String getServiceDescriptor()>
	//   66  160:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   67  163:ldc2            #470 <String "@">
	//   68  166:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   69  169:aload           4
	//   70  171:invokeinterface #476 <Method IBinder IInterface.asBinder()>
	//   71  176:invokestatic    #482 <Method int System.identityHashCode(Object)>
	//   72  179:invokestatic    #488 <Method String Integer.toHexString(int)>
	//   73  182:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   74  185:pop             
		printwriter.append(" mServiceBroker=");
	//   75  186:aload_3         
	//   76  187:ldc2            #490 <String " mServiceBroker=">
	//   77  190:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   78  193:pop             
		if(igmsservicebroker == null)
	//*  79  194:aload           8
	//*  80  196:ifnonnull       209
			printwriter.println("null");
	//   81  199:aload_3         
	//   82  200:ldc2            #468 <String "null">
	//   83  203:invokevirtual   #493 <Method void PrintWriter.println(String)>
		else
	//*  84  206:goto            232
			printwriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((Object) (igmsservicebroker.asBinder())))));
	//   85  209:aload_3         
	//   86  210:ldc2            #495 <String "IGmsServiceBroker@">
	//   87  213:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   88  216:aload           8
	//   89  218:invokeinterface #498 <Method IBinder IGmsServiceBroker.asBinder()>
	//   90  223:invokestatic    #482 <Method int System.identityHashCode(Object)>
	//   91  226:invokestatic    #488 <Method String Integer.toHexString(int)>
	//   92  229:invokevirtual   #493 <Method void PrintWriter.println(String)>
		as = ((String []) (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US)));
	//   93  232:new             #500 <Class SimpleDateFormat>
	//   94  235:dup             
	//   95  236:ldc2            #502 <String "yyyy-MM-dd HH:mm:ss.SSS">
	//   96  239:getstatic       #508 <Field Locale Locale.US>
	//   97  242:invokespecial   #511 <Method void SimpleDateFormat(String, Locale)>
	//   98  245:astore          4
		if(zzbv > 0L)
	//*  99  247:aload_0         
	//* 100  248:getfield        #513 <Field long zzbv>
	//* 101  251:lconst_0        
	//* 102  252:lcmp            
	//* 103  253:ifle            346
		{
			filedescriptor = ((FileDescriptor) (printwriter.append(((CharSequence) (s))).append("lastConnectedTime=")));
	//  104  256:aload_3         
	//  105  257:aload_1         
	//  106  258:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  107  261:ldc2            #515 <String "lastConnectedTime=">
	//  108  264:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  109  267:astore_2        
			long l = zzbv;
	//  110  268:aload_0         
	//  111  269:getfield        #513 <Field long zzbv>
	//  112  272:lstore          6
			String s1 = ((SimpleDateFormat) (as)).format(new Date(zzbv));
	//  113  274:aload           4
	//  114  276:new             #517 <Class Date>
	//  115  279:dup             
	//  116  280:aload_0         
	//  117  281:getfield        #513 <Field long zzbv>
	//  118  284:invokespecial   #520 <Method void Date(long)>
	//  119  287:invokevirtual   #524 <Method String SimpleDateFormat.format(Date)>
	//  120  290:astore          8
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 21);
	//  121  292:new             #255 <Class StringBuilder>
	//  122  295:dup             
	//  123  296:aload           8
	//  124  298:invokestatic    #259 <Method String String.valueOf(Object)>
	//  125  301:invokevirtual   #263 <Method int String.length()>
	//  126  304:bipush          21
	//  127  306:iadd            
	//  128  307:invokespecial   #264 <Method void StringBuilder(int)>
	//  129  310:astore          9
			stringbuilder.append(l);
	//  130  312:aload           9
	//  131  314:lload           6
	//  132  316:invokevirtual   #527 <Method StringBuilder StringBuilder.append(long)>
	//  133  319:pop             
			stringbuilder.append(" ");
	//  134  320:aload           9
	//  135  322:ldc2            #529 <String " ">
	//  136  325:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  137  328:pop             
			stringbuilder.append(s1);
	//  138  329:aload           9
	//  139  331:aload           8
	//  140  333:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  141  336:pop             
			((PrintWriter) (filedescriptor)).println(stringbuilder.toString());
	//  142  337:aload_2         
	//  143  338:aload           9
	//  144  340:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  145  343:invokevirtual   #493 <Method void PrintWriter.println(String)>
		}
		if(zzbu <= 0L)
			break MISSING_BLOCK_LABEL_509;
	//  146  346:aload_0         
	//  147  347:getfield        #531 <Field long zzbu>
	//  148  350:lconst_0        
	//  149  351:lcmp            
	//  150  352:ifle            509
		printwriter.append(((CharSequence) (s))).append("lastSuspendedCause=");
	//  151  355:aload_3         
	//  152  356:aload_1         
	//  153  357:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  154  360:ldc2            #533 <String "lastSuspendedCause=">
	//  155  363:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  156  366:pop             
		zzbt;
	//  157  367:aload_0         
	//  158  368:getfield        #535 <Field int zzbt>
		JVM INSTR tableswitch 1 2: default 392
	//	               1 416
	//	               2 409;
	//  159  371:tableswitch     1 2: default 392
	//	               1 416
	//	               2 409
		   goto _L9 _L10 _L11
_L9:
		filedescriptor = ((FileDescriptor) (String.valueOf(zzbt)));
	//  160  392:aload_0         
	//  161  393:getfield        #535 <Field int zzbt>
	//  162  396:invokestatic    #537 <Method String String.valueOf(int)>
	//  163  399:astore_2        
_L13:
		printwriter.append(((CharSequence) (filedescriptor)));
	//  164  400:aload_3         
	//  165  401:aload_2         
	//  166  402:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  167  405:pop             
		break; /* Loop/switch isn't completed */
	//  168  406:goto            423
_L11:
		filedescriptor = "CAUSE_NETWORK_LOST";
	//  169  409:ldc2            #539 <String "CAUSE_NETWORK_LOST">
	//  170  412:astore_2        
		continue; /* Loop/switch isn't completed */
	//  171  413:goto            400
_L10:
		filedescriptor = "CAUSE_SERVICE_DISCONNECTED";
	//  172  416:ldc2            #541 <String "CAUSE_SERVICE_DISCONNECTED">
	//  173  419:astore_2        
		if(true) goto _L13; else goto _L12
	//  174  420:goto            400
_L12:
		filedescriptor = ((FileDescriptor) (printwriter.append(" lastSuspendedTime=")));
	//  175  423:aload_3         
	//  176  424:ldc2            #543 <String " lastSuspendedTime=">
	//  177  427:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  178  430:astore_2        
		long l1 = zzbu;
	//  179  431:aload_0         
	//  180  432:getfield        #531 <Field long zzbu>
	//  181  435:lstore          6
		String s2 = ((SimpleDateFormat) (as)).format(new Date(zzbu));
	//  182  437:aload           4
	//  183  439:new             #517 <Class Date>
	//  184  442:dup             
	//  185  443:aload_0         
	//  186  444:getfield        #531 <Field long zzbu>
	//  187  447:invokespecial   #520 <Method void Date(long)>
	//  188  450:invokevirtual   #524 <Method String SimpleDateFormat.format(Date)>
	//  189  453:astore          8
		StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s2))).length() + 21);
	//  190  455:new             #255 <Class StringBuilder>
	//  191  458:dup             
	//  192  459:aload           8
	//  193  461:invokestatic    #259 <Method String String.valueOf(Object)>
	//  194  464:invokevirtual   #263 <Method int String.length()>
	//  195  467:bipush          21
	//  196  469:iadd            
	//  197  470:invokespecial   #264 <Method void StringBuilder(int)>
	//  198  473:astore          9
		stringbuilder1.append(l1);
	//  199  475:aload           9
	//  200  477:lload           6
	//  201  479:invokevirtual   #527 <Method StringBuilder StringBuilder.append(long)>
	//  202  482:pop             
		stringbuilder1.append(" ");
	//  203  483:aload           9
	//  204  485:ldc2            #529 <String " ">
	//  205  488:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  206  491:pop             
		stringbuilder1.append(s2);
	//  207  492:aload           9
	//  208  494:aload           8
	//  209  496:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  210  499:pop             
		((PrintWriter) (filedescriptor)).println(stringbuilder1.toString());
	//  211  500:aload_2         
	//  212  501:aload           9
	//  213  503:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  214  506:invokevirtual   #493 <Method void PrintWriter.println(String)>
		if(zzbx > 0L)
	//* 215  509:aload_0         
	//* 216  510:getfield        #545 <Field long zzbx>
	//* 217  513:lconst_0        
	//* 218  514:lcmp            
	//* 219  515:ifle            618
		{
			printwriter.append(((CharSequence) (s))).append("lastFailedStatus=").append(((CharSequence) (CommonStatusCodes.getStatusCodeString(zzbw))));
	//  220  518:aload_3         
	//  221  519:aload_1         
	//  222  520:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  223  523:ldc2            #547 <String "lastFailedStatus=">
	//  224  526:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  225  529:aload_0         
	//  226  530:getfield        #549 <Field int zzbw>
	//  227  533:invokestatic    #554 <Method String CommonStatusCodes.getStatusCodeString(int)>
	//  228  536:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  229  539:pop             
			s = ((String) (printwriter.append(" lastFailedTime=")));
	//  230  540:aload_3         
	//  231  541:ldc2            #556 <String " lastFailedTime=">
	//  232  544:invokevirtual   #447 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  233  547:astore_1        
			long l2 = zzbx;
	//  234  548:aload_0         
	//  235  549:getfield        #545 <Field long zzbx>
	//  236  552:lstore          6
			filedescriptor = ((FileDescriptor) (((SimpleDateFormat) (as)).format(new Date(zzbx))));
	//  237  554:aload           4
	//  238  556:new             #517 <Class Date>
	//  239  559:dup             
	//  240  560:aload_0         
	//  241  561:getfield        #545 <Field long zzbx>
	//  242  564:invokespecial   #520 <Method void Date(long)>
	//  243  567:invokevirtual   #524 <Method String SimpleDateFormat.format(Date)>
	//  244  570:astore_2        
			printwriter = ((PrintWriter) (new StringBuilder(String.valueOf(((Object) (filedescriptor))).length() + 21)));
	//  245  571:new             #255 <Class StringBuilder>
	//  246  574:dup             
	//  247  575:aload_2         
	//  248  576:invokestatic    #259 <Method String String.valueOf(Object)>
	//  249  579:invokevirtual   #263 <Method int String.length()>
	//  250  582:bipush          21
	//  251  584:iadd            
	//  252  585:invokespecial   #264 <Method void StringBuilder(int)>
	//  253  588:astore_3        
			((StringBuilder) (printwriter)).append(l2);
	//  254  589:aload_3         
	//  255  590:lload           6
	//  256  592:invokevirtual   #527 <Method StringBuilder StringBuilder.append(long)>
	//  257  595:pop             
			((StringBuilder) (printwriter)).append(" ");
	//  258  596:aload_3         
	//  259  597:ldc2            #529 <String " ">
	//  260  600:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  261  603:pop             
			((StringBuilder) (printwriter)).append(((String) (filedescriptor)));
	//  262  604:aload_3         
	//  263  605:aload_2         
	//  264  606:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  265  609:pop             
			((PrintWriter) (s)).println(((StringBuilder) (printwriter)).toString());
	//  266  610:aload_1         
	//  267  611:aload_3         
	//  268  612:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  269  615:invokevirtual   #493 <Method void PrintWriter.println(String)>
		}
		return;
	//  270  618:return          
		s;
	//  271  619:astore_1        
		filedescriptor;
	//  272  620:aload_2         
		JVM INSTR monitorexit ;
	//  273  621:monitorexit     
		throw s;
	//  274  622:aload_1         
	//  275  623:athrow          
		s;
	//  276  624:astore_1        
		filedescriptor;
	//  277  625:aload_2         
		JVM INSTR monitorexit ;
	//  278  626:monitorexit     
		throw s;
	//  279  627:aload_1         
	//  280  628:athrow          
	}

	public Account getAccount()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Feature[] getApiFeatures()
	{
		return zzbs;
	//    0    0:getstatic       #118 <Field Feature[] zzbs>
	//    1    3:areturn         
	}

	public final Feature[] getAvailableFeatures()
	{
		com.google.android.gms.common.internal.zzb zzb1 = zzcp;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field zzb zzcp>
	//    2    4:astore_1        
		if(zzb1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return zzb1.zzda;
	//    7   11:aload_1         
	//    8   12:getfield        #566 <Field Feature[] zzb.zzda>
	//    9   15:areturn         
	}

	public Bundle getConnectionHint()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Context getContext()
	{
		return mContext;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field Context mContext>
	//    2    4:areturn         
	}

	public String getEndpointPackageName()
	{
		if(isConnected() && zzby != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #414 <Method boolean isConnected()>
	//*   2    4:ifeq            22
	//*   3    7:aload_0         
	//*   4    8:getfield        #244 <Field zzh zzby>
	//*   5   11:ifnull          22
			return zzby.getPackageName();
	//    6   14:aload_0         
	//    7   15:getfield        #244 <Field zzh zzby>
	//    8   18:invokevirtual   #253 <Method String zzh.getPackageName()>
	//    9   21:areturn         
		else
			throw new RuntimeException("Failed to connect when checking package");
	//   10   22:new             #571 <Class RuntimeException>
	//   11   25:dup             
	//   12   26:ldc2            #573 <String "Failed to connect when checking package">
	//   13   29:invokespecial   #574 <Method void RuntimeException(String)>
	//   14   32:athrow          
	}

	protected Bundle getGetServiceRequestExtraArgs()
	{
		return new Bundle();
	//    0    0:new             #577 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #578 <Method void Bundle()>
	//    3    7:areturn         
	}

	protected String getLocalStartServiceAction()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public final Looper getLooper()
	{
		return zzbz;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field Looper zzbz>
	//    2    4:areturn         
	}

	public int getMinApkVersion()
	{
		return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    0    0:getstatic       #581 <Field int GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    1    3:ireturn         
	}

	public void getRemoteService(IAccountAccessor iaccountaccessor, Set set)
	{
		GetServiceRequest getservicerequest;
		Bundle bundle = getGetServiceRequestExtraArgs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #591 <Method Bundle getGetServiceRequestExtraArgs()>
	//    2    4:astore          4
		getservicerequest = new GetServiceRequest(zzcl);
	//    3    6:new             #593 <Class GetServiceRequest>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:getfield        #193 <Field int zzcl>
	//    7   14:invokespecial   #594 <Method void GetServiceRequest(int)>
	//    8   17:astore_3        
		getservicerequest.zzdh = mContext.getPackageName();
	//    9   18:aload_3         
	//   10   19:aload_0         
	//   11   20:getfield        #167 <Field Context mContext>
	//   12   23:invokevirtual   #309 <Method String Context.getPackageName()>
	//   13   26:putfield        #597 <Field String GetServiceRequest.zzdh>
		getservicerequest.zzdk = bundle;
	//   14   29:aload_3         
	//   15   30:aload           4
	//   16   32:putfield        #601 <Field Bundle GetServiceRequest.zzdk>
		if(set != null)
	//*  17   35:aload_2         
	//*  18   36:ifnull          61
			getservicerequest.zzdj = (Scope[])((Collection) (set)).toArray(((Object []) (new Scope[((Collection) (set)).size()])));
	//   19   39:aload_3         
	//   20   40:aload_2         
	//   21   41:aload_2         
	//   22   42:invokeinterface #604 <Method int Collection.size()>
	//   23   47:anewarray       Scope[]
	//   24   50:invokeinterface #610 <Method Object[] Collection.toArray(Object[])>
	//   25   55:checkcast       #612 <Class Scope[]>
	//   26   58:putfield        #615 <Field Scope[] GetServiceRequest.zzdj>
		if(requiresSignIn())
	//*  27   61:aload_0         
	//*  28   62:invokevirtual   #618 <Method boolean requiresSignIn()>
	//*  29   65:ifeq            118
		{
			if(getAccount() != null)
	//*  30   68:aload_0         
	//*  31   69:invokevirtual   #620 <Method Account getAccount()>
	//*  32   72:ifnull          83
				set = ((Set) (getAccount()));
	//   33   75:aload_0         
	//   34   76:invokevirtual   #620 <Method Account getAccount()>
	//   35   79:astore_2        
			else
	//*  36   80:goto            96
				set = ((Set) (new Account("<<default account>>", "com.google")));
	//   37   83:new             #622 <Class Account>
	//   38   86:dup             
	//   39   87:ldc1            #53  <String "<<default account>>">
	//   40   89:ldc2            #624 <String "com.google">
	//   41   92:invokespecial   #627 <Method void Account(String, String)>
	//   42   95:astore_2        
			getservicerequest.zzdl = ((Account) (set));
	//   43   96:aload_3         
	//   44   97:aload_2         
	//   45   98:putfield        #631 <Field Account GetServiceRequest.zzdl>
			if(iaccountaccessor != null)
	//*  46  101:aload_1         
	//*  47  102:ifnull          133
				getservicerequest.zzdi = iaccountaccessor.asBinder();
	//   48  105:aload_3         
	//   49  106:aload_1         
	//   50  107:invokeinterface #634 <Method IBinder IAccountAccessor.asBinder()>
	//   51  112:putfield        #638 <Field IBinder GetServiceRequest.zzdi>
		} else
	//*  52  115:goto            133
		if(requiresAccount())
	//*  53  118:aload_0         
	//*  54  119:invokevirtual   #641 <Method boolean requiresAccount()>
	//*  55  122:ifeq            133
			getservicerequest.zzdl = getAccount();
	//   56  125:aload_3         
	//   57  126:aload_0         
	//   58  127:invokevirtual   #620 <Method Account getAccount()>
	//   59  130:putfield        #631 <Field Account GetServiceRequest.zzdl>
		getservicerequest.zzdm = zzbs;
	//   60  133:aload_3         
	//   61  134:getstatic       #118 <Field Feature[] zzbs>
	//   62  137:putfield        #644 <Field Feature[] GetServiceRequest.zzdm>
		getservicerequest.zzdn = getApiFeatures();
	//   63  140:aload_3         
	//   64  141:aload_0         
	//   65  142:invokevirtual   #646 <Method Feature[] getApiFeatures()>
	//   66  145:putfield        #649 <Field Feature[] GetServiceRequest.zzdn>
		iaccountaccessor = ((IAccountAccessor) (zzcc));
	//   67  148:aload_0         
	//   68  149:getfield        #135 <Field Object zzcc>
	//   69  152:astore_1        
		iaccountaccessor;
	//   70  153:aload_1         
		JVM INSTR monitorenter ;
	//   71  154:monitorenter    
		if(zzcd != null)
	//*  72  155:aload_0         
	//*  73  156:getfield        #225 <Field IGmsServiceBroker zzcd>
	//*  74  159:ifnull          190
		{
			zzcd.getService(((IGmsCallbacks) (new zzd(this, zzcq.get()))), getservicerequest);
	//   75  162:aload_0         
	//   76  163:getfield        #225 <Field IGmsServiceBroker zzcd>
	//   77  166:new             #31  <Class BaseGmsClient$zzd>
	//   78  169:dup             
	//   79  170:aload_0         
	//   80  171:aload_0         
	//   81  172:getfield        #155 <Field AtomicInteger zzcq>
	//   82  175:invokevirtual   #298 <Method int AtomicInteger.get()>
	//   83  178:invokespecial   #650 <Method void BaseGmsClient$zzd(BaseGmsClient, int)>
	//   84  181:aload_3         
	//   85  182:invokeinterface #654 <Method void IGmsServiceBroker.getService(IGmsCallbacks, GetServiceRequest)>
			break MISSING_BLOCK_LABEL_200;
	//   86  187:goto            200
		}
		Log.w("GmsClient", "mServiceBroker is null, client disconnected");
	//   87  190:ldc2            #274 <String "GmsClient">
	//   88  193:ldc2            #656 <String "mServiceBroker is null, client disconnected">
	//   89  196:invokestatic    #659 <Method int Log.w(String, String)>
	//   90  199:pop             
		iaccountaccessor;
	//   91  200:aload_1         
		JVM INSTR monitorexit ;
	//   92  201:monitorexit     
		return;
	//   93  202:return          
		set;
	//   94  203:astore_2        
		iaccountaccessor;
	//   95  204:aload_1         
		JVM INSTR monitorexit ;
	//   96  205:monitorexit     
		try
		{
			throw set;
	//   97  206:aload_2         
	//   98  207:athrow          
		}
	//*  99  208:astore_1        
	//* 100  209:ldc2            #274 <String "GmsClient">
	//* 101  212:ldc2            #661 <String "IGmsServiceBroker.getService failed">
	//* 102  215:aload_1         
	//* 103  216:invokestatic    #664 <Method int Log.w(String, String, Throwable)>
	//* 104  219:pop             
	//* 105  220:aload_0         
	//* 106  221:bipush          8
	//* 107  223:aconst_null     
	//* 108  224:aconst_null     
	//* 109  225:aload_0         
	//* 110  226:getfield        #155 <Field AtomicInteger zzcq>
	//* 111  229:invokevirtual   #298 <Method int AtomicInteger.get()>
	//* 112  232:invokevirtual   #668 <Method void onPostInitHandler(int, IBinder, Bundle, int)>
	//* 113  235:return          
	//* 114  236:astore_1        
	//* 115  237:aload_1         
	//* 116  238:athrow          
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor)
	//* 117  239:astore_1        
		{
			Log.w("GmsClient", "IGmsServiceBroker.getService failed", ((Throwable) (iaccountaccessor)));
	//  118  240:ldc2            #274 <String "GmsClient">
	//  119  243:ldc2            #661 <String "IGmsServiceBroker.getService failed">
	//  120  246:aload_1         
	//  121  247:invokestatic    #664 <Method int Log.w(String, String, Throwable)>
	//  122  250:pop             
		}
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor)
		{
			throw iaccountaccessor;
		}
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor)
		{
			Log.w("GmsClient", "IGmsServiceBroker.getService failed", ((Throwable) (iaccountaccessor)));
			onPostInitHandler(8, ((IBinder) (null)), ((Bundle) (null)), zzcq.get());
			return;
		}
		triggerConnectionSuspended(1);
	//  123  251:aload_0         
	//  124  252:iconst_1        
	//  125  253:invokevirtual   #671 <Method void triggerConnectionSuspended(int)>
		return;
	//  126  256:return          
	}

	protected Set getScopes()
	{
		return Collections.EMPTY_SET;
	//    0    0:getstatic       #680 <Field Set Collections.EMPTY_SET>
	//    1    3:areturn         
	}

	public final IInterface getService()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzci == 5)
	//*   5    7:aload_0         
	//*   6    8:getfield        #142 <Field int zzci>
	//*   7   11:iconst_5        
	//*   8   12:icmpne          23
			throw new DeadObjectException();
	//    9   15:new             #585 <Class DeadObjectException>
	//   10   18:dup             
	//   11   19:invokespecial   #683 <Method void DeadObjectException()>
	//   12   22:athrow          
		checkConnected();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #685 <Method void checkConnected()>
		boolean flag;
		IInterface iinterface;
		Exception exception;
		if(zzcf != null)
	//*  15   27:aload_0         
	//*  16   28:getfield        #233 <Field IInterface zzcf>
	//*  17   31:ifnull          60
			flag = true;
	//   18   34:iconst_1        
	//   19   35:istore_1        
		else
	//*  20   36:goto            39
	//*  21   39:iload_1         
	//*  22   40:ldc2            #687 <String "Client is connected but service is null">
	//*  23   43:invokestatic    #691 <Method void Preconditions.checkState(boolean, Object)>
	//*  24   46:aload_0         
	//*  25   47:getfield        #233 <Field IInterface zzcf>
	//*  26   50:astore_3        
	//*  27   51:aload_2         
	//*  28   52:monitorexit     
	//*  29   53:aload_3         
	//*  30   54:areturn         
	//*  31   55:astore_3        
	//*  32   56:aload_2         
	//*  33   57:monitorexit     
	//*  34   58:aload_3         
	//*  35   59:athrow          
			flag = false;
	//   36   60:iconst_0        
	//   37   61:istore_1        
		Preconditions.checkState(flag, "Client is connected but service is null");
		iinterface = zzcf;
		obj;
		JVM INSTR monitorexit ;
		return iinterface;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  38   62:goto            39
	}

	public IBinder getServiceBrokerBinder()
	{
label0:
		{
			synchronized(zzcc)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field Object zzcc>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzcd != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #225 <Field IGmsServiceBroker zzcd>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		IBinder ibinder = zzcd.asBinder();
	//   12   18:aload_0         
	//   13   19:getfield        #225 <Field IGmsServiceBroker zzcd>
	//   14   22:invokeinterface #498 <Method IBinder IGmsServiceBroker.asBinder()>
	//   15   27:astore_2        
		obj;
	//   16   28:aload_1         
		JVM INSTR monitorexit ;
	//   17   29:monitorexit     
		return ibinder;
	//   18   30:aload_2         
	//   19   31:areturn         
		exception;
	//   20   32:astore_2        
		obj;
	//   21   33:aload_1         
		JVM INSTR monitorexit ;
	//   22   34:monitorexit     
		throw exception;
	//   23   35:aload_2         
	//   24   36:athrow          
	}

	protected abstract String getServiceDescriptor();

	public Intent getSignInIntent()
	{
		throw new UnsupportedOperationException("Not a sign in API");
	//    0    0:new             #697 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #699 <String "Not a sign in API">
	//    3    7:invokespecial   #700 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected abstract String getStartServiceAction();

	protected String getStartServicePackage()
	{
		return "com.google.android.gms";
	//    0    0:ldc2            #702 <String "com.google.android.gms">
	//    1    3:areturn         
	}

	public boolean isConnected()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzci == 4)
	//*   5    7:aload_0         
	//*   6    8:getfield        #142 <Field int zzci>
	//*   7   11:iconst_4        
	//*   8   12:icmpne          29
			flag = true;
	//    9   15:iconst_1        
	//   10   16:istore_1        
		else
	//*  11   17:goto            20
	//*  12   20:aload_2         
	//*  13   21:monitorexit     
	//*  14   22:iload_1         
	//*  15   23:ireturn         
	//*  16   24:astore_3        
	//*  17   25:aload_2         
	//*  18   26:monitorexit     
	//*  19   27:aload_3         
	//*  20   28:athrow          
			flag = false;
	//   21   29:iconst_0        
	//   22   30:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  23   31:goto            20
	}

	public boolean isConnecting()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		boolean flag;
		Exception exception;
		if(zzci != 2 && zzci != 3)
	//*   5    7:aload_0         
	//*   6    8:getfield        #142 <Field int zzci>
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          40
	//*   9   15:aload_0         
	//*  10   16:getfield        #142 <Field int zzci>
	//*  11   19:iconst_3        
	//*  12   20:icmpne          35
	//*  13   23:goto            40
	//*  14   26:aload_2         
	//*  15   27:monitorexit     
	//*  16   28:iload_1         
	//*  17   29:ireturn         
	//*  18   30:astore_3        
	//*  19   31:aload_2         
	//*  20   32:monitorexit     
	//*  21   33:aload_3         
	//*  22   34:athrow          
			flag = false;
	//   23   35:iconst_0        
	//   24   36:istore_1        
		else
	//*  25   37:goto            26
			flag = true;
	//   26   40:iconst_1        
	//   27   41:istore_1        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  28   42:goto            26
	}

	protected void onConnectedLocked(IInterface iinterface)
	{
		zzbv = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #707 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #513 <Field long zzbv>
	//    3    7:return          
	}

	protected void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzbw = connectionresult.getErrorCode();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #715 <Method int ConnectionResult.getErrorCode()>
	//    3    5:putfield        #549 <Field int zzbw>
		zzbx = System.currentTimeMillis();
	//    4    8:aload_0         
	//    5    9:invokestatic    #707 <Method long System.currentTimeMillis()>
	//    6   12:putfield        #545 <Field long zzbx>
	//    7   15:return          
	}

	protected void onConnectionSuspended(int i)
	{
		zzbt = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #535 <Field int zzbt>
		zzbu = System.currentTimeMillis();
	//    3    5:aload_0         
	//    4    6:invokestatic    #707 <Method long System.currentTimeMillis()>
	//    5    9:putfield        #531 <Field long zzbu>
	//    6   12:return          
	}

	protected void onPostInitHandler(int i, IBinder ibinder, Bundle bundle, int j)
	{
		mHandler.sendMessage(mHandler.obtainMessage(1, j, -1, ((Object) (new zzf(i, ibinder, bundle)))));
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #173 <Field Handler mHandler>
	//    4    8:iconst_1        
	//    5    9:iload           4
	//    6   11:iconst_m1       
	//    7   12:new             #37  <Class BaseGmsClient$zzf>
	//    8   15:dup             
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:aload_2         
	//   12   19:aload_3         
	//   13   20:invokespecial   #719 <Method void BaseGmsClient$zzf(BaseGmsClient, int, IBinder, Bundle)>
	//   14   23:invokevirtual   #722 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   15   26:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   16   29:pop             
	//   17   30:return          
	}

	void onSetConnectState(int i, IInterface iinterface)
	{
	//    0    0:return          
	}

	public void onUserSignOut(SignOutCallbacks signoutcallbacks)
	{
		signoutcallbacks.onSignOutComplete();
	//    0    0:aload_1         
	//    1    1:invokeinterface #727 <Method void BaseGmsClient$SignOutCallbacks.onSignOutComplete()>
	//    2    6:return          
	}

	public boolean providesSignIn()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean requiresAccount()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean requiresGooglePlayServices()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public boolean requiresSignIn()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void triggerConnectionSuspended(int i)
	{
		mHandler.sendMessage(mHandler.obtainMessage(6, zzcq.get(), i));
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #173 <Field Handler mHandler>
	//    4    8:bipush          6
	//    5   10:aload_0         
	//    6   11:getfield        #155 <Field AtomicInteger zzcq>
	//    7   14:invokevirtual   #298 <Method int AtomicInteger.get()>
	//    8   17:iload_1         
	//    9   18:invokevirtual   #355 <Method Message Handler.obtainMessage(int, int, int)>
	//   10   21:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   11   24:pop             
	//   12   25:return          
	}

	protected void triggerNotAvailable(ConnectionProgressReportCallbacks connectionprogressreportcallbacks, int i, PendingIntent pendingintent)
	{
		zzce = (ConnectionProgressReportCallbacks)Preconditions.checkNotNull(((Object) (connectionprogressreportcallbacks)), "Connection progress callbacks cannot be null.");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #423 <String "Connection progress callbacks cannot be null.">
	//    3    5:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    8:checkcast       #13  <Class BaseGmsClient$ConnectionProgressReportCallbacks>
	//    5   11:putfield        #425 <Field BaseGmsClient$ConnectionProgressReportCallbacks zzce>
		mHandler.sendMessage(mHandler.obtainMessage(3, zzcq.get(), i, ((Object) (pendingintent))));
	//    6   14:aload_0         
	//    7   15:getfield        #173 <Field Handler mHandler>
	//    8   18:aload_0         
	//    9   19:getfield        #173 <Field Handler mHandler>
	//   10   22:iconst_3        
	//   11   23:aload_0         
	//   12   24:getfield        #155 <Field AtomicInteger zzcq>
	//   13   27:invokevirtual   #298 <Method int AtomicInteger.get()>
	//   14   30:iload_2         
	//   15   31:aload_3         
	//   16   32:invokevirtual   #722 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   17   35:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   18   38:pop             
	//   19   39:return          
	}

	protected final void zza(int i, Bundle bundle, int j)
	{
		mHandler.sendMessage(mHandler.obtainMessage(7, j, -1, ((Object) (new zzg(i, ((Bundle) (null)))))));
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field Handler mHandler>
	//    2    4:aload_0         
	//    3    5:getfield        #173 <Field Handler mHandler>
	//    4    8:bipush          7
	//    5   10:iload_3         
	//    6   11:iconst_m1       
	//    7   12:new             #40  <Class BaseGmsClient$zzg>
	//    8   15:dup             
	//    9   16:aload_0         
	//   10   17:iload_1         
	//   11   18:aconst_null     
	//   12   19:invokespecial   #732 <Method void BaseGmsClient$zzg(BaseGmsClient, int, Bundle)>
	//   13   22:invokevirtual   #722 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   14   25:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   15   28:pop             
	//   16   29:return          
	}

	public static final int CONNECT_STATE_CONNECTED = 4;
	public static final int CONNECT_STATE_DISCONNECTED = 1;
	public static final int CONNECT_STATE_DISCONNECTING = 5;
	public static final String DEFAULT_ACCOUNT = "<<default account>>";
	public static final String GOOGLE_PLUS_REQUIRED_FEATURES[] = {
		"service_esmobile", "service_googleme"
	};
	public static final String KEY_PENDING_INTENT = "pendingIntent";
	private static final Feature zzbs[] = new Feature[0];
	private final Context mContext;
	final Handler mHandler;
	private final Object mLock;
	private int zzbt;
	private long zzbu;
	private long zzbv;
	private int zzbw;
	private long zzbx;
	private zzh zzby;
	private final Looper zzbz;
	private final GmsClientSupervisor zzca;
	private final GoogleApiAvailabilityLight zzcb;
	private final Object zzcc;
	private IGmsServiceBroker zzcd;
	protected ConnectionProgressReportCallbacks zzce;
	private IInterface zzcf;
	private final ArrayList zzcg;
	private zze zzch;
	private int zzci;
	private final BaseConnectionCallbacks zzcj;
	private final BaseOnConnectionFailedListener zzck;
	private final int zzcl;
	private final String zzcm;
	private ConnectionResult zzcn;
	private boolean zzco;
	private volatile com.google.android.gms.common.internal.zzb zzcp;
	protected AtomicInteger zzcq;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Feature[]
	//    2    4:putstatic       #118 <Field Feature[] zzbs>
	//    3    7:iconst_2        
	//    4    8:anewarray       String[]
	//    5   11:dup             
	//    6   12:iconst_0        
	//    7   13:ldc1            #122 <String "service_esmobile">
	//    8   15:aastore         
	//    9   16:dup             
	//   10   17:iconst_1        
	//   11   18:ldc1            #124 <String "service_googleme">
	//   12   20:aastore         
	//   13   21:putstatic       #126 <Field String[] GOOGLE_PLUS_REQUIRED_FEATURES>
	//*  14   24:return          
	}
}
