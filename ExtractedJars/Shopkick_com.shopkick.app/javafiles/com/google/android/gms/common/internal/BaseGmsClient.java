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
		//*   1    1:invokevirtual   #30  <Method boolean ConnectionResult.isSuccess()>
		//*   2    4:ifeq            22
			{
				connectionresult = ((ConnectionResult) (zzct));
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field BaseGmsClient zzct>
		//    5   11:astore_1        
				((BaseGmsClient) (connectionresult)).getRemoteService(((IAccountAccessor) (null)), ((BaseGmsClient) (connectionresult)).getScopes());
		//    6   12:aload_1         
		//    7   13:aconst_null     
		//    8   14:aload_1         
		//    9   15:invokevirtual   #34  <Method Set BaseGmsClient.getScopes()>
		//   10   18:invokevirtual   #38  <Method void BaseGmsClient.getRemoteService(IAccountAccessor, Set)>
				return;
		//   11   21:return          
			}
			if(BaseGmsClient.zzg(zzct) != null)
		//*  12   22:aload_0         
		//*  13   23:getfield        #16  <Field BaseGmsClient zzct>
		//*  14   26:invokestatic    #42  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//*  15   29:ifnull          45
				BaseGmsClient.zzg(zzct).onConnectionFailed(connectionresult);
		//   16   32:aload_0         
		//   17   33:getfield        #16  <Field BaseGmsClient zzct>
		//   18   36:invokestatic    #42  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//   19   39:aload_1         
		//   20   40:invokeinterface #47  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
		//   21   45:return          
		}

		private final BaseGmsClient zzct;

		public LegacyClientCallbackAdapter()
		{
			zzct = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field BaseGmsClient zzct>
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
		//    1    1:checkcast       #21  <Class Boolean>
		//    2    4:astore_3        
			obj = null;
		//    3    5:aconst_null     
		//    4    6:astore_1        
			if(boolean1 == null)
		//*   5    7:aload_3         
		//*   6    8:ifnonnull       21
			{
				BaseGmsClient.zza(zzct, 1, ((IInterface) (null)));
		//    7   11:aload_0         
		//    8   12:getfield        #19  <Field BaseGmsClient zzct>
		//    9   15:iconst_1        
		//   10   16:aconst_null     
		//   11   17:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				return;
		//   12   20:return          
			}
			int i = statusCode;
		//   13   21:aload_0         
		//   14   22:getfield        #30  <Field int statusCode>
		//   15   25:istore_2        
			if(i != 0)
		//*  16   26:iload_2         
		//*  17   27:ifeq            137
				if(i != 10)
		//*  18   30:iload_2         
		//*  19   31:bipush          10
		//*  20   33:icmpeq          81
				{
					BaseGmsClient.zza(zzct, 1, ((IInterface) (null)));
		//   21   36:aload_0         
		//   22   37:getfield        #19  <Field BaseGmsClient zzct>
		//   23   40:iconst_1        
		//   24   41:aconst_null     
		//   25   42:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
					Bundle bundle = zzcs;
		//   26   45:aload_0         
		//   27   46:getfield        #32  <Field Bundle zzcs>
		//   28   49:astore_3        
					if(bundle != null)
		//*  29   50:aload_3         
		//*  30   51:ifnull          64
						obj = ((Object) ((PendingIntent)bundle.getParcelable("pendingIntent")));
		//   31   54:aload_3         
		//   32   55:ldc1            #41  <String "pendingIntent">
		//   33   57:invokevirtual   #47  <Method android.os.Parcelable Bundle.getParcelable(String)>
		//   34   60:checkcast       #49  <Class PendingIntent>
		//   35   63:astore_1        
					zza(new ConnectionResult(statusCode, ((PendingIntent) (obj))));
		//   36   64:aload_0         
		//   37   65:new             #51  <Class ConnectionResult>
		//   38   68:dup             
		//   39   69:aload_0         
		//   40   70:getfield        #30  <Field int statusCode>
		//   41   73:aload_1         
		//   42   74:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
		//   43   77:invokevirtual   #56  <Method void zza(ConnectionResult)>
					return;
		//   44   80:return          
				} else
				{
					BaseGmsClient.zza(zzct, 1, ((IInterface) (null)));
		//   45   81:aload_0         
		//   46   82:getfield        #19  <Field BaseGmsClient zzct>
		//   47   85:iconst_1        
		//   48   86:aconst_null     
		//   49   87:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
					throw new IllegalStateException(String.format("A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ", new Object[] {
						((Object)this).getClass().getSimpleName(), zzct.getStartServiceAction(), zzct.getServiceDescriptor()
					}));
		//   50   90:new             #58  <Class IllegalStateException>
		//   51   93:dup             
		//   52   94:ldc1            #60  <String "A fatal developer error has occurred. Class name: %s. Start service action: %s. Service Descriptor: %s. ">
		//   53   96:iconst_3        
		//   54   97:anewarray       Object[]
		//   55  100:dup             
		//   56  101:iconst_0        
		//   57  102:aload_0         
		//   58  103:invokevirtual   #66  <Method Class Object.getClass()>
		//   59  106:invokevirtual   #72  <Method String Class.getSimpleName()>
		//   60  109:aastore         
		//   61  110:dup             
		//   62  111:iconst_1        
		//   63  112:aload_0         
		//   64  113:getfield        #19  <Field BaseGmsClient zzct>
		//   65  116:invokevirtual   #75  <Method String BaseGmsClient.getStartServiceAction()>
		//   66  119:aastore         
		//   67  120:dup             
		//   68  121:iconst_2        
		//   69  122:aload_0         
		//   70  123:getfield        #19  <Field BaseGmsClient zzct>
		//   71  126:invokevirtual   #78  <Method String BaseGmsClient.getServiceDescriptor()>
		//   72  129:aastore         
		//   73  130:invokestatic    #84  <Method String String.format(String, Object[])>
		//   74  133:invokespecial   #87  <Method void IllegalStateException(String)>
		//   75  136:athrow          
				}
			if(!zzm())
		//*  76  137:aload_0         
		//*  77  138:invokevirtual   #91  <Method boolean zzm()>
		//*  78  141:ifne            168
			{
				BaseGmsClient.zza(zzct, 1, ((IInterface) (null)));
		//   79  144:aload_0         
		//   80  145:getfield        #19  <Field BaseGmsClient zzct>
		//   81  148:iconst_1        
		//   82  149:aconst_null     
		//   83  150:invokestatic    #39  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				zza(new ConnectionResult(8, ((PendingIntent) (null))));
		//   84  153:aload_0         
		//   85  154:new             #51  <Class ConnectionResult>
		//   86  157:dup             
		//   87  158:bipush          8
		//   88  160:aconst_null     
		//   89  161:invokespecial   #54  <Method void ConnectionResult(int, PendingIntent)>
		//   90  164:invokevirtual   #56  <Method void zza(ConnectionResult)>
				return;
		//   91  167:return          
			} else
			{
				return;
		//   92  168:return          
			}
		}

		protected abstract boolean zzm();

		protected final void zzn()
		{
		//    0    0:return          
		}

		private final int statusCode;
		private final Bundle zzcs;
		private final BaseGmsClient zzct;

		protected zza(int i, Bundle bundle)
		{
			zzct = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field BaseGmsClient zzct>
			super(((Object) (Boolean.valueOf(true))));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iconst_1        
		//    6    8:invokestatic    #25  <Method Boolean Boolean.valueOf(boolean)>
		//    7   11:invokespecial   #28  <Method void BaseGmsClient$zzc(BaseGmsClient, Object)>
			statusCode = i;
		//    8   14:aload_0         
		//    9   15:iload_2         
		//   10   16:putfield        #30  <Field int statusCode>
			zzcs = bundle;
		//   11   19:aload_0         
		//   12   20:aload_3         
		//   13   21:putfield        #32  <Field Bundle zzcs>
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
			if(zzct.zzcr.get() != message.arg1)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field BaseGmsClient zzct>
		//*   2    4:getfield        #44  <Field AtomicInteger BaseGmsClient.zzcr>
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
			if((message.what == 1 || message.what == 7 || message.what == 4 || message.what == 5) && !zzct.isConnecting())
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
		//*  30   63:getfield        #13  <Field BaseGmsClient zzct>
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
				BaseGmsClient.zza(zzct, new ConnectionResult(message.arg2));
		//   44   89:aload_0         
		//   45   90:getfield        #13  <Field BaseGmsClient zzct>
		//   46   93:new             #63  <Class ConnectionResult>
		//   47   96:dup             
		//   48   97:aload_1         
		//   49   98:getfield        #66  <Field int Message.arg2>
		//   50  101:invokespecial   #69  <Method void ConnectionResult(int)>
		//   51  104:invokestatic    #72  <Method ConnectionResult BaseGmsClient.zza(BaseGmsClient, ConnectionResult)>
		//   52  107:pop             
				if(BaseGmsClient.zzb(zzct) && !BaseGmsClient.zzc(zzct))
		//*  53  108:aload_0         
		//*  54  109:getfield        #13  <Field BaseGmsClient zzct>
		//*  55  112:invokestatic    #75  <Method boolean BaseGmsClient.zzb(BaseGmsClient)>
		//*  56  115:ifeq            138
		//*  57  118:aload_0         
		//*  58  119:getfield        #13  <Field BaseGmsClient zzct>
		//*  59  122:invokestatic    #78  <Method boolean BaseGmsClient.zzc(BaseGmsClient)>
		//*  60  125:ifne            138
				{
					BaseGmsClient.zza(zzct, 3, ((IInterface) (null)));
		//   61  128:aload_0         
		//   62  129:getfield        #13  <Field BaseGmsClient zzct>
		//   63  132:iconst_3        
		//   64  133:aconst_null     
		//   65  134:invokestatic    #81  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
					return;
		//   66  137:return          
				}
				if(BaseGmsClient.zzd(zzct) != null)
		//*  67  138:aload_0         
		//*  68  139:getfield        #13  <Field BaseGmsClient zzct>
		//*  69  142:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
		//*  70  145:ifnull          159
					message = ((Message) (BaseGmsClient.zzd(zzct)));
		//   71  148:aload_0         
		//   72  149:getfield        #13  <Field BaseGmsClient zzct>
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
				zzct.zzcf.onReportServiceBinding(((ConnectionResult) (message)));
		//   81  169:aload_0         
		//   82  170:getfield        #13  <Field BaseGmsClient zzct>
		//   83  173:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzcf>
		//   84  176:aload_1         
		//   85  177:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
				zzct.onConnectionFailed(((ConnectionResult) (message)));
		//   86  182:aload_0         
		//   87  183:getfield        #13  <Field BaseGmsClient zzct>
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
				if(BaseGmsClient.zzd(zzct) != null)
		//*  95  199:aload_0         
		//*  96  200:getfield        #13  <Field BaseGmsClient zzct>
		//*  97  203:invokestatic    #85  <Method ConnectionResult BaseGmsClient.zzd(BaseGmsClient)>
		//*  98  206:ifnull          220
					message = ((Message) (BaseGmsClient.zzd(zzct)));
		//   99  209:aload_0         
		//  100  210:getfield        #13  <Field BaseGmsClient zzct>
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
				zzct.zzcf.onReportServiceBinding(((ConnectionResult) (message)));
		//  109  230:aload_0         
		//  110  231:getfield        #13  <Field BaseGmsClient zzct>
		//  111  234:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzcf>
		//  112  237:aload_1         
		//  113  238:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
				zzct.onConnectionFailed(((ConnectionResult) (message)));
		//  114  243:aload_0         
		//  115  244:getfield        #13  <Field BaseGmsClient zzct>
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
				zzct.zzcf.onReportServiceBinding(((ConnectionResult) (message)));
		//  138  291:aload_0         
		//  139  292:getfield        #13  <Field BaseGmsClient zzct>
		//  140  295:getfield        #89  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzcf>
		//  141  298:aload_1         
		//  142  299:invokeinterface #95  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
				zzct.onConnectionFailed(((ConnectionResult) (message)));
		//  143  304:aload_0         
		//  144  305:getfield        #13  <Field BaseGmsClient zzct>
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
				BaseGmsClient.zza(zzct, 5, ((IInterface) (null)));
		//  152  322:aload_0         
		//  153  323:getfield        #13  <Field BaseGmsClient zzct>
		//  154  326:iconst_5        
		//  155  327:aconst_null     
		//  156  328:invokestatic    #81  <Method void BaseGmsClient.zza(BaseGmsClient, int, IInterface)>
				if(BaseGmsClient.zze(zzct) != null)
		//* 157  331:aload_0         
		//* 158  332:getfield        #13  <Field BaseGmsClient zzct>
		//* 159  335:invokestatic    #107 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//* 160  338:ifnull          357
					BaseGmsClient.zze(zzct).onConnectionSuspended(message.arg2);
		//  161  341:aload_0         
		//  162  342:getfield        #13  <Field BaseGmsClient zzct>
		//  163  345:invokestatic    #107 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//  164  348:aload_1         
		//  165  349:getfield        #66  <Field int Message.arg2>
		//  166  352:invokeinterface #112 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnectionSuspended(int)>
				zzct.onConnectionSuspended(message.arg2);
		//  167  357:aload_0         
		//  168  358:getfield        #13  <Field BaseGmsClient zzct>
		//  169  361:aload_1         
		//  170  362:getfield        #66  <Field int Message.arg2>
		//  171  365:invokevirtual   #113 <Method void BaseGmsClient.onConnectionSuspended(int)>
				BaseGmsClient.zza(zzct, 5, 1, ((IInterface) (null)));
		//  172  368:aload_0         
		//  173  369:getfield        #13  <Field BaseGmsClient zzct>
		//  174  372:iconst_5        
		//  175  373:iconst_1        
		//  176  374:aconst_null     
		//  177  375:invokestatic    #116 <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
		//  178  378:pop             
				return;
		//  179  379:return          
			}
			if(message.what == 2 && !zzct.isConnected())
		//* 180  380:aload_1         
		//* 181  381:getfield        #39  <Field int Message.what>
		//* 182  384:iconst_2        
		//* 183  385:icmpne          403
		//* 184  388:aload_0         
		//* 185  389:getfield        #13  <Field BaseGmsClient zzct>
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

		private final BaseGmsClient zzct;

		public zzb(Looper looper)
		{
			zzct = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field BaseGmsClient zzct>
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
			zzcu = null;
		//    2    2:aload_0         
		//    3    3:aconst_null     
		//    4    4:putfield        #24  <Field Object zzcu>
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
			synchronized(BaseGmsClient.zzf(zzct))
		//*   2    4:aload_0         
		//*   3    5:getfield        #19  <Field BaseGmsClient zzct>
		//*   4    8:invokestatic    #37  <Method ArrayList BaseGmsClient.zzf(BaseGmsClient)>
		//*   5   11:astore_1        
		//*   6   12:aload_1         
		//*   7   13:monitorenter    
			{
				BaseGmsClient.zzf(zzct).remove(((Object) (this)));
		//    8   14:aload_0         
		//    9   15:getfield        #19  <Field BaseGmsClient zzct>
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
			obj = zzcu;
		//    2    2:aload_0         
		//    3    3:getfield        #24  <Field Object zzcu>
		//    4    6:astore_1        
			if(zzcv)
		//*   5    7:aload_0         
		//*   6    8:getfield        #26  <Field boolean zzcv>
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
			zzcv = true;
		//   54   94:aload_0         
		//   55   95:iconst_1        
		//   56   96:putfield        #26  <Field boolean zzcv>
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

		private final BaseGmsClient zzct;
		private Object zzcu;
		private boolean zzcv;

		public zzc(Object obj)
		{
			zzct = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #19  <Field BaseGmsClient zzct>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #22  <Method void Object()>
			zzcu = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #24  <Field Object zzcu>
			zzcv = false;
		//    8   14:aload_0         
		//    9   15:iconst_0        
		//   10   16:putfield        #26  <Field boolean zzcv>
		//   11   19:return          
		}
	}

	public static final class zzd extends IGmsCallbacks.zza
	{

		public final void onPostInitComplete(int i, IBinder ibinder, Bundle bundle)
		{
			Preconditions.checkNotNull(((Object) (zzcw)), "onPostInitComplete can be called only once per call to getRemoteService");
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field BaseGmsClient zzcw>
		//    2    4:ldc1            #30  <String "onPostInitComplete can be called only once per call to getRemoteService">
		//    3    6:invokestatic    #36  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    4    9:pop             
			zzcw.onPostInitHandler(i, ibinder, bundle, zzcx);
		//    5   10:aload_0         
		//    6   11:getfield        #20  <Field BaseGmsClient zzcw>
		//    7   14:iload_1         
		//    8   15:aload_2         
		//    9   16:aload_3         
		//   10   17:aload_0         
		//   11   18:getfield        #22  <Field int zzcx>
		//   12   21:invokevirtual   #40  <Method void BaseGmsClient.onPostInitHandler(int, IBinder, Bundle, int)>
			zzcw = null;
		//   13   24:aload_0         
		//   14   25:aconst_null     
		//   15   26:putfield        #20  <Field BaseGmsClient zzcw>
		//   16   29:return          
		}

		public final void zza(int i, Bundle bundle)
		{
			Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", ((Throwable) (new Exception())));
		//    0    0:ldc1            #45  <String "GmsClient">
		//    1    2:ldc1            #47  <String "received deprecated onAccountValidationComplete callback, ignoring">
		//    2    4:new             #49  <Class Exception>
		//    3    7:dup             
		//    4    8:invokespecial   #50  <Method void Exception()>
		//    5   11:invokestatic    #56  <Method int Log.wtf(String, String, Throwable)>
		//    6   14:pop             
		//    7   15:return          
		}

		public final void zza(int i, IBinder ibinder, com.google.android.gms.common.internal.zzb zzb1)
		{
			Preconditions.checkNotNull(((Object) (zzcw)), "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field BaseGmsClient zzcw>
		//    2    4:ldc1            #59  <String "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService">
		//    3    6:invokestatic    #36  <Method Object Preconditions.checkNotNull(Object, Object)>
		//    4    9:pop             
			Preconditions.checkNotNull(((Object) (zzb1)));
		//    5   10:aload_3         
		//    6   11:invokestatic    #62  <Method Object Preconditions.checkNotNull(Object)>
		//    7   14:pop             
			BaseGmsClient.zza(zzcw, zzb1);
		//    8   15:aload_0         
		//    9   16:getfield        #20  <Field BaseGmsClient zzcw>
		//   10   19:aload_3         
		//   11   20:invokestatic    #65  <Method void BaseGmsClient.zza(BaseGmsClient, zzb)>
			onPostInitComplete(i, ibinder, zzb1.zzda);
		//   12   23:aload_0         
		//   13   24:iload_1         
		//   14   25:aload_2         
		//   15   26:aload_3         
		//   16   27:getfield        #71  <Field Bundle zzb.zzda>
		//   17   30:invokevirtual   #73  <Method void onPostInitComplete(int, IBinder, Bundle)>
		//   18   33:return          
		}

		private BaseGmsClient zzcw;
		private final int zzcx;

		public zzd(BaseGmsClient basegmsclient, int i)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void IGmsCallbacks$zza()>
			zzcw = basegmsclient;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field BaseGmsClient zzcw>
			zzcx = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #22  <Field int zzcx>
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
				BaseGmsClient.zza(zzct, 16);
		//    2    4:aload_0         
		//    3    5:getfield        #18  <Field BaseGmsClient zzct>
		//    4    8:bipush          16
		//    5   10:invokestatic    #29  <Method void BaseGmsClient.zza(BaseGmsClient, int)>
				return;
		//    6   13:return          
			}
			Object obj = BaseGmsClient.zza(zzct);
		//    7   14:aload_0         
		//    8   15:getfield        #18  <Field BaseGmsClient zzct>
		//    9   18:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
		//   10   21:astore_3        
			obj;
		//   11   22:aload_3         
			JVM INSTR monitorenter ;
		//   12   23:monitorenter    
			BaseGmsClient basegmsclient = zzct;
		//   13   24:aload_0         
		//   14   25:getfield        #18  <Field BaseGmsClient zzct>
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
			zzct.zza(0, ((Bundle) (null)), zzcx);
		//   45   85:aload_0         
		//   46   86:getfield        #18  <Field BaseGmsClient zzct>
		//   47   89:iconst_0        
		//   48   90:aconst_null     
		//   49   91:aload_0         
		//   50   92:getfield        #23  <Field int zzcx>
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
			synchronized(BaseGmsClient.zza(zzct))
		//*   0    0:aload_0         
		//*   1    1:getfield        #18  <Field BaseGmsClient zzct>
		//*   2    4:invokestatic    #32  <Method Object BaseGmsClient.zza(BaseGmsClient)>
		//*   3    7:astore_1        
		//*   4    8:aload_1         
		//*   5    9:monitorenter    
			{
				BaseGmsClient.zza(zzct, ((IGmsServiceBroker) (null)));
		//    6   10:aload_0         
		//    7   11:getfield        #18  <Field BaseGmsClient zzct>
		//    8   14:aconst_null     
		//    9   15:invokestatic    #50  <Method IGmsServiceBroker BaseGmsClient.zza(BaseGmsClient, IGmsServiceBroker)>
		//   10   18:pop             
			}
		//   11   19:aload_1         
		//   12   20:monitorexit     
			zzct.mHandler.sendMessage(zzct.mHandler.obtainMessage(6, zzcx, 1));
		//   13   21:aload_0         
		//   14   22:getfield        #18  <Field BaseGmsClient zzct>
		//   15   25:getfield        #59  <Field Handler BaseGmsClient.mHandler>
		//   16   28:aload_0         
		//   17   29:getfield        #18  <Field BaseGmsClient zzct>
		//   18   32:getfield        #59  <Field Handler BaseGmsClient.mHandler>
		//   19   35:bipush          6
		//   20   37:aload_0         
		//   21   38:getfield        #23  <Field int zzcx>
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

		private final BaseGmsClient zzct;
		private final int zzcx;

		public zze(int i)
		{
			zzct = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #18  <Field BaseGmsClient zzct>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #21  <Method void Object()>
			zzcx = i;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #23  <Field int zzcx>
		//    8   14:return          
		}
	}

	protected final class zzf extends zza
	{

		protected final void zza(ConnectionResult connectionresult)
		{
			if(BaseGmsClient.zzg(zzct) != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #17  <Field BaseGmsClient zzct>
		//*   2    4:invokestatic    #30  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//*   3    7:ifnull          23
				BaseGmsClient.zzg(zzct).onConnectionFailed(connectionresult);
		//    4   10:aload_0         
		//    5   11:getfield        #17  <Field BaseGmsClient zzct>
		//    6   14:invokestatic    #30  <Method BaseGmsClient$BaseOnConnectionFailedListener BaseGmsClient.zzg(BaseGmsClient)>
		//    7   17:aload_1         
		//    8   18:invokeinterface #35  <Method void BaseGmsClient$BaseOnConnectionFailedListener.onConnectionFailed(ConnectionResult)>
			zzct.onConnectionFailed(connectionresult);
		//    9   23:aload_0         
		//   10   24:getfield        #17  <Field BaseGmsClient zzct>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #36  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
		//   13   31:return          
		}

		protected final boolean zzm()
		{
			RemoteException remoteexception;
			Object obj;
			try
			{
				obj = ((Object) (zzcy.getInterfaceDescriptor()));
		//    0    0:aload_0         
		//    1    1:getfield        #22  <Field IBinder zzcy>
		//    2    4:invokeinterface #46  <Method String IBinder.getInterfaceDescriptor()>
		//    3    9:astore_1        
			}
		//*   4   10:aload_0         
		//*   5   11:getfield        #17  <Field BaseGmsClient zzct>
		//*   6   14:invokevirtual   #49  <Method String BaseGmsClient.getServiceDescriptor()>
		//*   7   17:aload_1         
		//*   8   18:invokevirtual   #55  <Method boolean String.equals(Object)>
		//*   9   21:ifne            96
		//*  10   24:aload_0         
		//*  11   25:getfield        #17  <Field BaseGmsClient zzct>
		//*  12   28:invokevirtual   #49  <Method String BaseGmsClient.getServiceDescriptor()>
		//*  13   31:astore_2        
		//*  14   32:new             #57  <Class StringBuilder>
		//*  15   35:dup             
		//*  16   36:aload_2         
		//*  17   37:invokestatic    #61  <Method String String.valueOf(Object)>
		//*  18   40:invokevirtual   #65  <Method int String.length()>
		//*  19   43:bipush          34
		//*  20   45:iadd            
		//*  21   46:aload_1         
		//*  22   47:invokestatic    #61  <Method String String.valueOf(Object)>
		//*  23   50:invokevirtual   #65  <Method int String.length()>
		//*  24   53:iadd            
		//*  25   54:invokespecial   #68  <Method void StringBuilder(int)>
		//*  26   57:astore_3        
		//*  27   58:aload_3         
		//*  28   59:ldc1            #70  <String "service descriptor mismatch: ">
		//*  29   61:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//*  30   64:pop             
		//*  31   65:aload_3         
		//*  32   66:aload_2         
		//*  33   67:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//*  34   70:pop             
		//*  35   71:aload_3         
		//*  36   72:ldc1            #76  <String " vs. ">
		//*  37   74:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//*  38   77:pop             
		//*  39   78:aload_3         
		//*  40   79:aload_1         
		//*  41   80:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
		//*  42   83:pop             
		//*  43   84:ldc1            #78  <String "GmsClient">
		//*  44   86:aload_3         
		//*  45   87:invokevirtual   #81  <Method String StringBuilder.toString()>
		//*  46   90:invokestatic    #87  <Method int Log.e(String, String)>
		//*  47   93:pop             
		//*  48   94:iconst_0        
		//*  49   95:ireturn         
		//*  50   96:aload_0         
		//*  51   97:getfield        #17  <Field BaseGmsClient zzct>
		//*  52  100:aload_0         
		//*  53  101:getfield        #22  <Field IBinder zzcy>
		//*  54  104:invokevirtual   #91  <Method IInterface BaseGmsClient.createServiceInterface(IBinder)>
		//*  55  107:astore_1        
		//*  56  108:aload_1         
		//*  57  109:ifnull          180
		//*  58  112:aload_0         
		//*  59  113:getfield        #17  <Field BaseGmsClient zzct>
		//*  60  116:iconst_2        
		//*  61  117:iconst_4        
		//*  62  118:aload_1         
		//*  63  119:invokestatic    #94  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
		//*  64  122:ifne            138
		//*  65  125:aload_0         
		//*  66  126:getfield        #17  <Field BaseGmsClient zzct>
		//*  67  129:iconst_3        
		//*  68  130:iconst_4        
		//*  69  131:aload_1         
		//*  70  132:invokestatic    #94  <Method boolean BaseGmsClient.zza(BaseGmsClient, int, int, IInterface)>
		//*  71  135:ifeq            180
		//*  72  138:aload_0         
		//*  73  139:getfield        #17  <Field BaseGmsClient zzct>
		//*  74  142:aconst_null     
		//*  75  143:invokestatic    #97  <Method ConnectionResult BaseGmsClient.zza(BaseGmsClient, ConnectionResult)>
		//*  76  146:pop             
		//*  77  147:aload_0         
		//*  78  148:getfield        #17  <Field BaseGmsClient zzct>
		//*  79  151:invokevirtual   #101 <Method Bundle BaseGmsClient.getConnectionHint()>
		//*  80  154:astore_1        
		//*  81  155:aload_0         
		//*  82  156:getfield        #17  <Field BaseGmsClient zzct>
		//*  83  159:invokestatic    #105 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//*  84  162:ifnull          178
		//*  85  165:aload_0         
		//*  86  166:getfield        #17  <Field BaseGmsClient zzct>
		//*  87  169:invokestatic    #105 <Method BaseGmsClient$BaseConnectionCallbacks BaseGmsClient.zze(BaseGmsClient)>
		//*  88  172:aload_1         
		//*  89  173:invokeinterface #111 <Method void BaseGmsClient$BaseConnectionCallbacks.onConnected(Bundle)>
		//*  90  178:iconst_1        
		//*  91  179:ireturn         
		//*  92  180:iconst_0        
		//*  93  181:ireturn         
		//*  94  182:ldc1            #78  <String "GmsClient">
		//*  95  184:ldc1            #113 <String "service probably died">
		//*  96  186:invokestatic    #116 <Method int Log.w(String, String)>
		//*  97  189:pop             
		//*  98  190:iconst_0        
		//*  99  191:ireturn         
			// Misplaced declaration of an exception variable
			catch(RemoteException remoteexception)
			{
				Log.w("GmsClient", "service probably died");
				return false;
			}
			if(!zzct.getServiceDescriptor().equals(obj))
			{
				String s = zzct.getServiceDescriptor();
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34 + String.valueOf(obj).length());
				stringbuilder.append("service descriptor mismatch: ");
				stringbuilder.append(s);
				stringbuilder.append(" vs. ");
				stringbuilder.append(((String) (obj)));
				Log.e("GmsClient", stringbuilder.toString());
				return false;
			}
			obj = ((Object) (zzct.createServiceInterface(zzcy)));
			if(obj != null && (BaseGmsClient.zza(zzct, 2, 4, ((IInterface) (obj))) || BaseGmsClient.zza(zzct, 3, 4, ((IInterface) (obj)))))
			{
				BaseGmsClient.zza(zzct, ((ConnectionResult) (null)));
				Bundle bundle = zzct.getConnectionHint();
				if(BaseGmsClient.zze(zzct) != null)
					BaseGmsClient.zze(zzct).onConnected(bundle);
				return true;
			} else
			{
				return false;
			}
		//* 100  192:astore_1        
		//* 101  193:goto            182
		}

		private final BaseGmsClient zzct;
		private final IBinder zzcy;

		public zzf(int i, IBinder ibinder, Bundle bundle)
		{
			zzct = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #17  <Field BaseGmsClient zzct>
			super(i, bundle);
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:aload           4
		//    7   10:invokespecial   #20  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
			zzcy = ibinder;
		//    8   13:aload_0         
		//    9   14:aload_3         
		//   10   15:putfield        #22  <Field IBinder zzcy>
		//   11   18:return          
		}
	}

	protected final class zzg extends zza
	{

		protected final void zza(ConnectionResult connectionresult)
		{
			zzct.zzcf.onReportServiceBinding(connectionresult);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field BaseGmsClient zzct>
		//    2    4:getfield        #27  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzcf>
		//    3    7:aload_1         
		//    4    8:invokeinterface #32  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			zzct.onConnectionFailed(connectionresult);
		//    5   13:aload_0         
		//    6   14:getfield        #16  <Field BaseGmsClient zzct>
		//    7   17:aload_1         
		//    8   18:invokevirtual   #35  <Method void BaseGmsClient.onConnectionFailed(ConnectionResult)>
		//    9   21:return          
		}

		protected final boolean zzm()
		{
			zzct.zzcf.onReportServiceBinding(ConnectionResult.RESULT_SUCCESS);
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field BaseGmsClient zzct>
		//    2    4:getfield        #27  <Field BaseGmsClient$ConnectionProgressReportCallbacks BaseGmsClient.zzcf>
		//    3    7:getstatic       #43  <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
		//    4   10:invokeinterface #32  <Method void BaseGmsClient$ConnectionProgressReportCallbacks.onReportServiceBinding(ConnectionResult)>
			return true;
		//    5   15:iconst_1        
		//    6   16:ireturn         
		}

		private final BaseGmsClient zzct;

		public zzg(int i, Bundle bundle)
		{
			zzct = BaseGmsClient.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field BaseGmsClient zzct>
			super(i, ((Bundle) (null)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:iload_2         
		//    6    8:aconst_null     
		//    7    9:invokespecial   #18  <Method void BaseGmsClient$zza(BaseGmsClient, int, Bundle)>
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
		zzcd = new Object();
	//    7   15:aload_0         
	//    8   16:new             #5   <Class Object>
	//    9   19:dup             
	//   10   20:invokespecial   #131 <Method void Object()>
	//   11   23:putfield        #135 <Field Object zzcd>
		zzch = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #137 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #138 <Method void ArrayList()>
	//   16   34:putfield        #140 <Field ArrayList zzch>
		zzcj = 1;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #142 <Field int zzcj>
		zzco = null;
	//   20   42:aload_0         
	//   21   43:aconst_null     
	//   22   44:putfield        #144 <Field ConnectionResult zzco>
		zzcp = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #146 <Field boolean zzcp>
		zzcq = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #148 <Field zzb zzcq>
		zzcr = new AtomicInteger(0);
	//   29   57:aload_0         
	//   30   58:new             #150 <Class AtomicInteger>
	//   31   61:dup             
	//   32   62:iconst_0        
	//   33   63:invokespecial   #153 <Method void AtomicInteger(int)>
	//   34   66:putfield        #155 <Field AtomicInteger zzcr>
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
		zzca = handler.getLooper();
	//   47   95:aload_0         
	//   48   96:aload_2         
	//   49   97:invokevirtual   #177 <Method Looper Handler.getLooper()>
	//   50  100:putfield        #179 <Field Looper zzca>
		zzcb = (GmsClientSupervisor)Preconditions.checkNotNull(((Object) (gmsclientsupervisor)), "Supervisor must not be null");
	//   51  103:aload_0         
	//   52  104:aload_3         
	//   53  105:ldc1            #181 <String "Supervisor must not be null">
	//   54  107:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   55  110:checkcast       #183 <Class GmsClientSupervisor>
	//   56  113:putfield        #185 <Field GmsClientSupervisor zzcb>
		zzcc = (GoogleApiAvailabilityLight)Preconditions.checkNotNull(((Object) (googleapiavailabilitylight)), "API availability must not be null");
	//   57  116:aload_0         
	//   58  117:aload           4
	//   59  119:ldc1            #187 <String "API availability must not be null">
	//   60  121:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   61  124:checkcast       #189 <Class GoogleApiAvailabilityLight>
	//   62  127:putfield        #191 <Field GoogleApiAvailabilityLight zzcc>
		zzcm = i;
	//   63  130:aload_0         
	//   64  131:iload           5
	//   65  133:putfield        #193 <Field int zzcm>
		zzck = baseconnectioncallbacks;
	//   66  136:aload_0         
	//   67  137:aload           6
	//   68  139:putfield        #195 <Field BaseGmsClient$BaseConnectionCallbacks zzck>
		zzcl = baseonconnectionfailedlistener;
	//   69  142:aload_0         
	//   70  143:aload           7
	//   71  145:putfield        #197 <Field BaseGmsClient$BaseOnConnectionFailedListener zzcl>
		zzcn = null;
	//   72  148:aload_0         
	//   73  149:aconst_null     
	//   74  150:putfield        #199 <Field String zzcn>
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
		zzcd = new Object();
	//    7   15:aload_0         
	//    8   16:new             #5   <Class Object>
	//    9   19:dup             
	//   10   20:invokespecial   #131 <Method void Object()>
	//   11   23:putfield        #135 <Field Object zzcd>
		zzch = new ArrayList();
	//   12   26:aload_0         
	//   13   27:new             #137 <Class ArrayList>
	//   14   30:dup             
	//   15   31:invokespecial   #138 <Method void ArrayList()>
	//   16   34:putfield        #140 <Field ArrayList zzch>
		zzcj = 1;
	//   17   37:aload_0         
	//   18   38:iconst_1        
	//   19   39:putfield        #142 <Field int zzcj>
		zzco = null;
	//   20   42:aload_0         
	//   21   43:aconst_null     
	//   22   44:putfield        #144 <Field ConnectionResult zzco>
		zzcp = false;
	//   23   47:aload_0         
	//   24   48:iconst_0        
	//   25   49:putfield        #146 <Field boolean zzcp>
		zzcq = null;
	//   26   52:aload_0         
	//   27   53:aconst_null     
	//   28   54:putfield        #148 <Field zzb zzcq>
		zzcr = new AtomicInteger(0);
	//   29   57:aload_0         
	//   30   58:new             #150 <Class AtomicInteger>
	//   31   61:dup             
	//   32   62:iconst_0        
	//   33   63:invokespecial   #153 <Method void AtomicInteger(int)>
	//   34   66:putfield        #155 <Field AtomicInteger zzcr>
		mContext = (Context)Preconditions.checkNotNull(((Object) (context)), "Context must not be null");
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:ldc1            #157 <String "Context must not be null">
	//   38   73:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   39   76:checkcast       #165 <Class Context>
	//   40   79:putfield        #167 <Field Context mContext>
		zzca = (Looper)Preconditions.checkNotNull(((Object) (looper)), "Looper must not be null");
	//   41   82:aload_0         
	//   42   83:aload_2         
	//   43   84:ldc1            #216 <String "Looper must not be null">
	//   44   86:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   45   89:checkcast       #218 <Class Looper>
	//   46   92:putfield        #179 <Field Looper zzca>
		zzcb = (GmsClientSupervisor)Preconditions.checkNotNull(((Object) (gmsclientsupervisor)), "Supervisor must not be null");
	//   47   95:aload_0         
	//   48   96:aload_3         
	//   49   97:ldc1            #181 <String "Supervisor must not be null">
	//   50   99:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   51  102:checkcast       #183 <Class GmsClientSupervisor>
	//   52  105:putfield        #185 <Field GmsClientSupervisor zzcb>
		zzcc = (GoogleApiAvailabilityLight)Preconditions.checkNotNull(((Object) (googleapiavailabilitylight)), "API availability must not be null");
	//   53  108:aload_0         
	//   54  109:aload           4
	//   55  111:ldc1            #187 <String "API availability must not be null">
	//   56  113:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//   57  116:checkcast       #189 <Class GoogleApiAvailabilityLight>
	//   58  119:putfield        #191 <Field GoogleApiAvailabilityLight zzcc>
		mHandler = ((Handler) (new zzb(looper)));
	//   59  122:aload_0         
	//   60  123:new             #25  <Class BaseGmsClient$zzb>
	//   61  126:dup             
	//   62  127:aload_0         
	//   63  128:aload_2         
	//   64  129:invokespecial   #221 <Method void BaseGmsClient$zzb(BaseGmsClient, Looper)>
	//   65  132:putfield        #173 <Field Handler mHandler>
		zzcm = i;
	//   66  135:aload_0         
	//   67  136:iload           5
	//   68  138:putfield        #193 <Field int zzcm>
		zzck = baseconnectioncallbacks;
	//   69  141:aload_0         
	//   70  142:aload           6
	//   71  144:putfield        #195 <Field BaseGmsClient$BaseConnectionCallbacks zzck>
		zzcl = baseonconnectionfailedlistener;
	//   72  147:aload_0         
	//   73  148:aload           7
	//   74  150:putfield        #197 <Field BaseGmsClient$BaseOnConnectionFailedListener zzcl>
		zzcn = s;
	//   75  153:aload_0         
	//   76  154:aload           8
	//   77  156:putfield        #199 <Field String zzcn>
	//   78  159:return          
	}

	static ConnectionResult zza(BaseGmsClient basegmsclient, ConnectionResult connectionresult)
	{
		basegmsclient.zzco = connectionresult;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #144 <Field ConnectionResult zzco>
		return connectionresult;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static IGmsServiceBroker zza(BaseGmsClient basegmsclient, IGmsServiceBroker igmsservicebroker)
	{
		basegmsclient.zzce = igmsservicebroker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #225 <Field IGmsServiceBroker zzce>
		return igmsservicebroker;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static Object zza(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzcd;
	//    0    0:aload_0         
	//    1    1:getfield        #135 <Field Object zzcd>
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
		zzcj = i;
	//   30   54:aload_0         
	//   31   55:iload_1         
	//   32   56:putfield        #142 <Field int zzcj>
		zzcg = iinterface;
	//   33   59:aload_0         
	//   34   60:aload_2         
	//   35   61:putfield        #233 <Field IInterface zzcg>
		onSetConnectState(i, iinterface);
	//   36   64:aload_0         
	//   37   65:iload_1         
	//   38   66:aload_2         
	//   39   67:invokevirtual   #236 <Method void onSetConnectState(int, IInterface)>
		i;
	//   40   70:iload_1         
		JVM INSTR tableswitch 1 4: default 572
	//	               1 514
	//	               2 108
	//	               3 108
	//	               4 100;
	//   41   71:tableswitch     1 4: default 572
	//	               1 514
	//	               2 108
	//	               3 108
	//	               4 100
		   goto _L1 _L2 _L3 _L3 _L4
_L1:
		break MISSING_BLOCK_LABEL_562;
_L4:
		onConnectedLocked(iinterface);
	//   42  100:aload_0         
	//   43  101:aload_2         
	//   44  102:invokevirtual   #240 <Method void onConnectedLocked(IInterface)>
		break MISSING_BLOCK_LABEL_562;
	//   45  105:goto            562
_L3:
		if(zzci != null && zzbz != null)
	//*  46  108:aload_0         
	//*  47  109:getfield        #242 <Field BaseGmsClient$zze zzci>
	//*  48  112:ifnull          256
	//*  49  115:aload_0         
	//*  50  116:getfield        #244 <Field zzh zzbz>
	//*  51  119:ifnull          256
		{
			iinterface = ((IInterface) (zzbz.zzu()));
	//   52  122:aload_0         
	//   53  123:getfield        #244 <Field zzh zzbz>
	//   54  126:invokevirtual   #250 <Method String zzh.zzu()>
	//   55  129:astore_2        
			String s = zzbz.getPackageName();
	//   56  130:aload_0         
	//   57  131:getfield        #244 <Field zzh zzbz>
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
			zzcb.zza(zzbz.zzu(), zzbz.getPackageName(), zzbz.zzq(), ((ServiceConnection) (zzci)), zzj());
	//   94  212:aload_0         
	//   95  213:getfield        #185 <Field GmsClientSupervisor zzcb>
	//   96  216:aload_0         
	//   97  217:getfield        #244 <Field zzh zzbz>
	//   98  220:invokevirtual   #250 <Method String zzh.zzu()>
	//   99  223:aload_0         
	//  100  224:getfield        #244 <Field zzh zzbz>
	//  101  227:invokevirtual   #253 <Method String zzh.getPackageName()>
	//  102  230:aload_0         
	//  103  231:getfield        #244 <Field zzh zzbz>
	//  104  234:invokevirtual   #286 <Method int zzh.zzq()>
	//  105  237:aload_0         
	//  106  238:getfield        #242 <Field BaseGmsClient$zze zzci>
	//  107  241:aload_0         
	//  108  242:invokespecial   #289 <Method String zzj()>
	//  109  245:invokevirtual   #292 <Method void GmsClientSupervisor.zza(String, String, int, ServiceConnection, String)>
			zzcr.incrementAndGet();
	//  110  248:aload_0         
	//  111  249:getfield        #155 <Field AtomicInteger zzcr>
	//  112  252:invokevirtual   #295 <Method int AtomicInteger.incrementAndGet()>
	//  113  255:pop             
		}
		zzci = new zze(zzcr.get());
	//  114  256:aload_0         
	//  115  257:new             #34  <Class BaseGmsClient$zze>
	//  116  260:dup             
	//  117  261:aload_0         
	//  118  262:aload_0         
	//  119  263:getfield        #155 <Field AtomicInteger zzcr>
	//  120  266:invokevirtual   #298 <Method int AtomicInteger.get()>
	//  121  269:invokespecial   #301 <Method void BaseGmsClient$zze(BaseGmsClient, int)>
	//  122  272:putfield        #242 <Field BaseGmsClient$zze zzci>
		if(zzcj != 3 || getLocalStartServiceAction() == null) goto _L6; else goto _L5
	//  123  275:aload_0         
	//  124  276:getfield        #142 <Field int zzcj>
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
		zzbz = ((zzh) (iinterface));
	//  152  336:aload_0         
	//  153  337:aload_2         
	//  154  338:putfield        #244 <Field zzh zzbz>
		iinterface = ((IInterface) (zzcb));
	//  155  341:aload_0         
	//  156  342:getfield        #185 <Field GmsClientSupervisor zzcb>
	//  157  345:astore_2        
		String s1 = zzbz.zzu();
	//  158  346:aload_0         
	//  159  347:getfield        #244 <Field zzh zzbz>
	//  160  350:invokevirtual   #250 <Method String zzh.zzu()>
	//  161  353:astore          7
		String s3 = zzbz.getPackageName();
	//  162  355:aload_0         
	//  163  356:getfield        #244 <Field zzh zzbz>
	//  164  359:invokevirtual   #253 <Method String zzh.getPackageName()>
	//  165  362:astore          8
		i = zzbz.zzq();
	//  166  364:aload_0         
	//  167  365:getfield        #244 <Field zzh zzbz>
	//  168  368:invokevirtual   #286 <Method int zzh.zzq()>
	//  169  371:istore_1        
		zze zze1 = zzci;
	//  170  372:aload_0         
	//  171  373:getfield        #242 <Field BaseGmsClient$zze zzci>
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
	//* 186  404:ifne            562
		{
			iinterface = ((IInterface) (zzbz.zzu()));
	//  187  407:aload_0         
	//  188  408:getfield        #244 <Field zzh zzbz>
	//  189  411:invokevirtual   #250 <Method String zzh.zzu()>
	//  190  414:astore_2        
			String s2 = zzbz.getPackageName();
	//  191  415:aload_0         
	//  192  416:getfield        #244 <Field zzh zzbz>
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
			zza(16, ((Bundle) (null)), zzcr.get());
	//  229  497:aload_0         
	//  230  498:bipush          16
	//  231  500:aconst_null     
	//  232  501:aload_0         
	//  233  502:getfield        #155 <Field AtomicInteger zzcr>
	//  234  505:invokevirtual   #298 <Method int AtomicInteger.get()>
	//  235  508:invokevirtual   #331 <Method void zza(int, Bundle, int)>
		}
		break MISSING_BLOCK_LABEL_562;
	//  236  511:goto            562
_L2:
		if(zzci != null)
	//* 237  514:aload_0         
	//* 238  515:getfield        #242 <Field BaseGmsClient$zze zzci>
	//* 239  518:ifnull          562
		{
			zzcb.zza(zzbz.zzu(), zzbz.getPackageName(), zzbz.zzq(), ((ServiceConnection) (zzci)), zzj());
	//  240  521:aload_0         
	//  241  522:getfield        #185 <Field GmsClientSupervisor zzcb>
	//  242  525:aload_0         
	//  243  526:getfield        #244 <Field zzh zzbz>
	//  244  529:invokevirtual   #250 <Method String zzh.zzu()>
	//  245  532:aload_0         
	//  246  533:getfield        #244 <Field zzh zzbz>
	//  247  536:invokevirtual   #253 <Method String zzh.getPackageName()>
	//  248  539:aload_0         
	//  249  540:getfield        #244 <Field zzh zzbz>
	//  250  543:invokevirtual   #286 <Method int zzh.zzq()>
	//  251  546:aload_0         
	//  252  547:getfield        #242 <Field BaseGmsClient$zze zzci>
	//  253  550:aload_0         
	//  254  551:invokespecial   #289 <Method String zzj()>
	//  255  554:invokevirtual   #292 <Method void GmsClientSupervisor.zza(String, String, int, ServiceConnection, String)>
			zzci = null;
	//  256  557:aload_0         
	//  257  558:aconst_null     
	//  258  559:putfield        #242 <Field BaseGmsClient$zze zzci>
		}
		obj;
	//  259  562:aload           6
		JVM INSTR monitorexit ;
	//  260  564:monitorexit     
		return;
	//  261  565:return          
		iinterface;
	//  262  566:astore_2        
		obj;
	//  263  567:aload           6
		JVM INSTR monitorexit ;
	//  264  569:monitorexit     
		throw iinterface;
	//  265  570:aload_2         
	//  266  571:athrow          
	//* 267  572:goto            562
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
		zzcq = zzb1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #148 <Field zzb zzcq>
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
				if(zzcj == i)
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #142 <Field int zzcj>
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
			zzcp = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #146 <Field boolean zzcp>
		} else
	//*   8   14:goto            19
		{
			i = 4;
	//    9   17:iconst_4        
	//   10   18:istore_1        
		}
		Handler handler = mHandler;
	//   11   19:aload_0         
	//   12   20:getfield        #173 <Field Handler mHandler>
	//   13   23:astore_2        
		handler.sendMessage(handler.obtainMessage(i, zzcr.get(), 16));
	//   14   24:aload_2         
	//   15   25:aload_2         
	//   16   26:iload_1         
	//   17   27:aload_0         
	//   18   28:getfield        #155 <Field AtomicInteger zzcr>
	//   19   31:invokevirtual   #298 <Method int AtomicInteger.get()>
	//   20   34:bipush          16
	//   21   36:invokevirtual   #355 <Method Message Handler.obtainMessage(int, int, int)>
	//   22   39:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   23   42:pop             
	//   24   43:return          
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
		return basegmsclient.zzcp;
	//    0    0:aload_0         
	//    1    1:getfield        #146 <Field boolean zzcp>
	//    2    4:ireturn         
	}

	static ConnectionResult zzd(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzco;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field ConnectionResult zzco>
	//    2    4:areturn         
	}

	static BaseConnectionCallbacks zze(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzck;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field BaseGmsClient$BaseConnectionCallbacks zzck>
	//    2    4:areturn         
	}

	static ArrayList zzf(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzch;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ArrayList zzch>
	//    2    4:areturn         
	}

	static BaseOnConnectionFailedListener zzg(BaseGmsClient basegmsclient)
	{
		return basegmsclient.zzcl;
	//    0    0:aload_0         
	//    1    1:getfield        #197 <Field BaseGmsClient$BaseOnConnectionFailedListener zzcl>
	//    2    4:areturn         
	}

	private final String zzj()
	{
		String s1 = zzcn;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field String zzcn>
	//    2    4:astore_2        
		String s = s1;
	//    3    5:aload_2         
	//    4    6:astore_1        
		if(s1 == null)
	//*   5    7:aload_2         
	//*   6    8:ifnonnull       22
			s = ((Object) (mContext)).getClass().getName();
	//    7   11:aload_0         
	//    8   12:getfield        #167 <Field Context mContext>
	//    9   15:invokevirtual   #372 <Method Class Object.getClass()>
	//   10   18:invokevirtual   #377 <Method String Class.getName()>
	//   11   21:astore_1        
		return s;
	//   12   22:aload_1         
	//   13   23:areturn         
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
		if(zzcj == 3)
	//*   5    7:aload_0         
	//*   6    8:getfield        #142 <Field int zzcj>
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
		if(zzcp)
	//*   0    0:aload_0         
	//*   1    1:getfield        #146 <Field boolean zzcp>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(TextUtils.isEmpty(((CharSequence) (getServiceDescriptor()))))
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #382 <Method String getServiceDescriptor()>
	//*   7   13:invokestatic    #388 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            21
			return false;
	//    9   19:iconst_0        
	//   10   20:ireturn         
		if(TextUtils.isEmpty(((CharSequence) (getLocalStartServiceAction()))))
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #304 <Method String getLocalStartServiceAction()>
	//*  13   25:invokestatic    #388 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   28:ifeq            33
			return false;
	//   15   31:iconst_0        
	//   16   32:ireturn         
		try
		{
			Class.forName(getServiceDescriptor());
	//   17   33:aload_0         
	//   18   34:invokevirtual   #382 <Method String getServiceDescriptor()>
	//   19   37:invokestatic    #392 <Method Class Class.forName(String)>
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
		int i = zzcc.isGooglePlayServicesAvailable(mContext, getMinApkVersion());
	//    0    0:aload_0         
	//    1    1:getfield        #191 <Field GoogleApiAvailabilityLight zzcc>
	//    2    4:aload_0         
	//    3    5:getfield        #167 <Field Context mContext>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #396 <Method int getMinApkVersion()>
	//    6   12:invokevirtual   #400 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
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
	//   18   32:invokespecial   #403 <Method void BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient)>
	//   19   35:iload_1         
	//   20   36:aconst_null     
	//   21   37:invokevirtual   #407 <Method void triggerNotAvailable(BaseGmsClient$ConnectionProgressReportCallbacks, int, PendingIntent)>
			return;
	//   22   40:return          
		} else
		{
			connect(((ConnectionProgressReportCallbacks) (new LegacyClientCallbackAdapter())));
	//   23   41:aload_0         
	//   24   42:new             #16  <Class BaseGmsClient$LegacyClientCallbackAdapter>
	//   25   45:dup             
	//   26   46:aload_0         
	//   27   47:invokespecial   #403 <Method void BaseGmsClient$LegacyClientCallbackAdapter(BaseGmsClient)>
	//   28   50:invokevirtual   #411 <Method void connect(BaseGmsClient$ConnectionProgressReportCallbacks)>
			return;
	//   29   53:return          
		}
	}

	protected final void checkConnected()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #415 <Method boolean isConnected()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
	//    4    8:new             #417 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc2            #419 <String "Not connected. Call connect() and wait for onConnected() to be called.">
	//    7   15:invokespecial   #422 <Method void IllegalStateException(String)>
	//    8   18:athrow          
	}

	public void connect(ConnectionProgressReportCallbacks connectionprogressreportcallbacks)
	{
		zzcf = (ConnectionProgressReportCallbacks)Preconditions.checkNotNull(((Object) (connectionprogressreportcallbacks)), "Connection progress callbacks cannot be null.");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #425 <String "Connection progress callbacks cannot be null.">
	//    3    5:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    8:checkcast       #13  <Class BaseGmsClient$ConnectionProgressReportCallbacks>
	//    5   11:putfield        #427 <Field BaseGmsClient$ConnectionProgressReportCallbacks zzcf>
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
		zzcr.incrementAndGet();
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field AtomicInteger zzcr>
	//    2    4:invokevirtual   #295 <Method int AtomicInteger.incrementAndGet()>
	//    3    7:pop             
		obj = ((Object) (zzch));
	//    4    8:aload_0         
	//    5    9:getfield        #140 <Field ArrayList zzch>
	//    6   12:astore_3        
		obj;
	//    7   13:aload_3         
		JVM INSTR monitorenter ;
	//    8   14:monitorenter    
		int j = zzch.size();
	//    9   15:aload_0         
	//   10   16:getfield        #140 <Field ArrayList zzch>
	//   11   19:invokevirtual   #434 <Method int ArrayList.size()>
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
		((zzc)zzch.get(i)).removeListener();
	//   18   30:aload_0         
	//   19   31:getfield        #140 <Field ArrayList zzch>
	//   20   34:iload_1         
	//   21   35:invokevirtual   #437 <Method Object ArrayList.get(int)>
	//   22   38:checkcast       #28  <Class BaseGmsClient$zzc>
	//   23   41:invokevirtual   #440 <Method void BaseGmsClient$zzc.removeListener()>
		i++;
	//   24   44:iload_1         
	//   25   45:iconst_1        
	//   26   46:iadd            
	//   27   47:istore_1        
		if(true) goto _L2; else goto _L1
	//   28   48:goto            25
_L1:
		zzch.clear();
	//   29   51:aload_0         
	//   30   52:getfield        #140 <Field ArrayList zzch>
	//   31   55:invokevirtual   #443 <Method void ArrayList.clear()>
		obj;
	//   32   58:aload_3         
		JVM INSTR monitorexit ;
	//   33   59:monitorexit     
		synchronized(zzcd)
	//*  34   60:aload_0         
	//*  35   61:getfield        #135 <Field Object zzcd>
	//*  36   64:astore_3        
	//*  37   65:aload_3         
	//*  38   66:monitorenter    
		{
			zzce = null;
	//   39   67:aload_0         
	//   40   68:aconst_null     
	//   41   69:putfield        #225 <Field IGmsServiceBroker zzce>
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
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #133 <Field Object mLock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			i = zzcj;
	//    5    9:aload_0         
	//    6   10:getfield        #142 <Field int zzcj>
	//    7   13:istore          5
			filedescriptor = ((FileDescriptor) (zzcg));
	//    8   15:aload_0         
	//    9   16:getfield        #233 <Field IInterface zzcg>
	//   10   19:astore_2        
		}
	//   11   20:aload           4
	//   12   22:monitorexit     
		IGmsServiceBroker igmsservicebroker;
		synchronized(zzcd)
	//*  13   23:aload_0         
	//*  14   24:getfield        #135 <Field Object zzcd>
	//*  15   27:astore          4
	//*  16   29:aload           4
	//*  17   31:monitorenter    
		{
			igmsservicebroker = zzce;
	//   18   32:aload_0         
	//   19   33:getfield        #225 <Field IGmsServiceBroker zzce>
	//   20   36:astore          8
		}
	//   21   38:aload           4
	//   22   40:monitorexit     
		printwriter.append(((CharSequence) (s))).append("mConnectState=");
	//   23   41:aload_3         
	//   24   42:aload_1         
	//   25   43:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   26   46:ldc2            #452 <String "mConnectState=">
	//   27   49:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   28   52:pop             
		switch(i)
	//*  29   53:iload           5
		{
	//*  30   55:tableswitch     1 5: default 88
	//	               1 138
	//	               2 128
	//	               3 118
	//	               4 108
	//	               5 98
		default:
			printwriter.print("UNKNOWN");
	//   31   88:aload_3         
	//   32   89:ldc2            #454 <String "UNKNOWN">
	//   33   92:invokevirtual   #457 <Method void PrintWriter.print(String)>
			break;

	//*  34   95:goto            145
		case 5: // '\005'
			printwriter.print("DISCONNECTING");
	//   35   98:aload_3         
	//   36   99:ldc2            #459 <String "DISCONNECTING">
	//   37  102:invokevirtual   #457 <Method void PrintWriter.print(String)>
			break;

	//*  38  105:goto            145
		case 4: // '\004'
			printwriter.print("CONNECTED");
	//   39  108:aload_3         
	//   40  109:ldc2            #461 <String "CONNECTED">
	//   41  112:invokevirtual   #457 <Method void PrintWriter.print(String)>
			break;

	//*  42  115:goto            145
		case 3: // '\003'
			printwriter.print("LOCAL_CONNECTING");
	//   43  118:aload_3         
	//   44  119:ldc2            #463 <String "LOCAL_CONNECTING">
	//   45  122:invokevirtual   #457 <Method void PrintWriter.print(String)>
			break;

	//*  46  125:goto            145
		case 2: // '\002'
			printwriter.print("REMOTE_CONNECTING");
	//   47  128:aload_3         
	//   48  129:ldc2            #465 <String "REMOTE_CONNECTING">
	//   49  132:invokevirtual   #457 <Method void PrintWriter.print(String)>
			break;

	//*  50  135:goto            145
		case 1: // '\001'
			printwriter.print("DISCONNECTED");
	//   51  138:aload_3         
	//   52  139:ldc2            #467 <String "DISCONNECTED">
	//   53  142:invokevirtual   #457 <Method void PrintWriter.print(String)>
			break;
		}
		printwriter.append(" mService=");
	//   54  145:aload_3         
	//   55  146:ldc2            #469 <String " mService=">
	//   56  149:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   57  152:pop             
		if(filedescriptor == null)
	//*  58  153:aload_2         
	//*  59  154:ifnonnull       168
			printwriter.append("null");
	//   60  157:aload_3         
	//   61  158:ldc2            #471 <String "null">
	//   62  161:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   63  164:pop             
		else
	//*  64  165:goto            198
			printwriter.append(((CharSequence) (getServiceDescriptor()))).append("@").append(((CharSequence) (Integer.toHexString(System.identityHashCode(((Object) (((IInterface) (filedescriptor)).asBinder())))))));
	//   65  168:aload_3         
	//   66  169:aload_0         
	//   67  170:invokevirtual   #382 <Method String getServiceDescriptor()>
	//   68  173:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   69  176:ldc2            #473 <String "@">
	//   70  179:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   71  182:aload_2         
	//   72  183:invokeinterface #479 <Method IBinder IInterface.asBinder()>
	//   73  188:invokestatic    #485 <Method int System.identityHashCode(Object)>
	//   74  191:invokestatic    #491 <Method String Integer.toHexString(int)>
	//   75  194:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   76  197:pop             
		printwriter.append(" mServiceBroker=");
	//   77  198:aload_3         
	//   78  199:ldc2            #493 <String " mServiceBroker=">
	//   79  202:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   80  205:pop             
		if(igmsservicebroker == null)
	//*  81  206:aload           8
	//*  82  208:ifnonnull       221
			printwriter.println("null");
	//   83  211:aload_3         
	//   84  212:ldc2            #471 <String "null">
	//   85  215:invokevirtual   #496 <Method void PrintWriter.println(String)>
		else
	//*  86  218:goto            244
			printwriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(((Object) (igmsservicebroker.asBinder())))));
	//   87  221:aload_3         
	//   88  222:ldc2            #498 <String "IGmsServiceBroker@">
	//   89  225:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   90  228:aload           8
	//   91  230:invokeinterface #501 <Method IBinder IGmsServiceBroker.asBinder()>
	//   92  235:invokestatic    #485 <Method int System.identityHashCode(Object)>
	//   93  238:invokestatic    #491 <Method String Integer.toHexString(int)>
	//   94  241:invokevirtual   #496 <Method void PrintWriter.println(String)>
		filedescriptor = ((FileDescriptor) (new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US)));
	//   95  244:new             #503 <Class SimpleDateFormat>
	//   96  247:dup             
	//   97  248:ldc2            #505 <String "yyyy-MM-dd HH:mm:ss.SSS">
	//   98  251:getstatic       #511 <Field Locale Locale.US>
	//   99  254:invokespecial   #514 <Method void SimpleDateFormat(String, Locale)>
	//  100  257:astore_2        
		if(zzbw > 0L)
	//* 101  258:aload_0         
	//* 102  259:getfield        #516 <Field long zzbw>
	//* 103  262:lconst_0        
	//* 104  263:lcmp            
	//* 105  264:ifle            356
		{
			as = ((String []) (printwriter.append(((CharSequence) (s))).append("lastConnectedTime=")));
	//  106  267:aload_3         
	//  107  268:aload_1         
	//  108  269:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  109  272:ldc2            #518 <String "lastConnectedTime=">
	//  110  275:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  111  278:astore          4
			long l = zzbw;
	//  112  280:aload_0         
	//  113  281:getfield        #516 <Field long zzbw>
	//  114  284:lstore          6
			String s1 = ((SimpleDateFormat) (filedescriptor)).format(new Date(l));
	//  115  286:aload_2         
	//  116  287:new             #520 <Class Date>
	//  117  290:dup             
	//  118  291:lload           6
	//  119  293:invokespecial   #523 <Method void Date(long)>
	//  120  296:invokevirtual   #527 <Method String SimpleDateFormat.format(Date)>
	//  121  299:astore          8
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 21);
	//  122  301:new             #255 <Class StringBuilder>
	//  123  304:dup             
	//  124  305:aload           8
	//  125  307:invokestatic    #259 <Method String String.valueOf(Object)>
	//  126  310:invokevirtual   #263 <Method int String.length()>
	//  127  313:bipush          21
	//  128  315:iadd            
	//  129  316:invokespecial   #264 <Method void StringBuilder(int)>
	//  130  319:astore          9
			stringbuilder.append(l);
	//  131  321:aload           9
	//  132  323:lload           6
	//  133  325:invokevirtual   #530 <Method StringBuilder StringBuilder.append(long)>
	//  134  328:pop             
			stringbuilder.append(" ");
	//  135  329:aload           9
	//  136  331:ldc2            #532 <String " ">
	//  137  334:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  138  337:pop             
			stringbuilder.append(s1);
	//  139  338:aload           9
	//  140  340:aload           8
	//  141  342:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  142  345:pop             
			((PrintWriter) (as)).println(stringbuilder.toString());
	//  143  346:aload           4
	//  144  348:aload           9
	//  145  350:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  146  353:invokevirtual   #496 <Method void PrintWriter.println(String)>
		}
		if(zzbv > 0L)
	//* 147  356:aload_0         
	//* 148  357:getfield        #534 <Field long zzbv>
	//* 149  360:lconst_0        
	//* 150  361:lcmp            
	//* 151  362:ifle            525
		{
			printwriter.append(((CharSequence) (s))).append("lastSuspendedCause=");
	//  152  365:aload_3         
	//  153  366:aload_1         
	//  154  367:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  155  370:ldc2            #536 <String "lastSuspendedCause=">
	//  156  373:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  157  376:pop             
			int j = zzbu;
	//  158  377:aload_0         
	//  159  378:getfield        #538 <Field int zzbu>
	//  160  381:istore          5
			switch(j)
	//* 161  383:iload           5
			{
	//* 162  385:tableswitch     1 2: default 408
	//	               1 432
	//	               2 421
			default:
				printwriter.append(((CharSequence) (String.valueOf(j))));
	//  163  408:aload_3         
	//  164  409:iload           5
	//  165  411:invokestatic    #540 <Method String String.valueOf(int)>
	//  166  414:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  167  417:pop             
				break;

	//* 168  418:goto            440
			case 2: // '\002'
				printwriter.append("CAUSE_NETWORK_LOST");
	//  169  421:aload_3         
	//  170  422:ldc2            #542 <String "CAUSE_NETWORK_LOST">
	//  171  425:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  172  428:pop             
				break;

	//* 173  429:goto            440
			case 1: // '\001'
				printwriter.append("CAUSE_SERVICE_DISCONNECTED");
	//  174  432:aload_3         
	//  175  433:ldc2            #544 <String "CAUSE_SERVICE_DISCONNECTED">
	//  176  436:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  177  439:pop             
				break;
			}
			as = ((String []) (printwriter.append(" lastSuspendedTime=")));
	//  178  440:aload_3         
	//  179  441:ldc2            #546 <String " lastSuspendedTime=">
	//  180  444:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  181  447:astore          4
			long l1 = zzbv;
	//  182  449:aload_0         
	//  183  450:getfield        #534 <Field long zzbv>
	//  184  453:lstore          6
			String s2 = ((SimpleDateFormat) (filedescriptor)).format(new Date(l1));
	//  185  455:aload_2         
	//  186  456:new             #520 <Class Date>
	//  187  459:dup             
	//  188  460:lload           6
	//  189  462:invokespecial   #523 <Method void Date(long)>
	//  190  465:invokevirtual   #527 <Method String SimpleDateFormat.format(Date)>
	//  191  468:astore          8
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s2))).length() + 21);
	//  192  470:new             #255 <Class StringBuilder>
	//  193  473:dup             
	//  194  474:aload           8
	//  195  476:invokestatic    #259 <Method String String.valueOf(Object)>
	//  196  479:invokevirtual   #263 <Method int String.length()>
	//  197  482:bipush          21
	//  198  484:iadd            
	//  199  485:invokespecial   #264 <Method void StringBuilder(int)>
	//  200  488:astore          9
			stringbuilder1.append(l1);
	//  201  490:aload           9
	//  202  492:lload           6
	//  203  494:invokevirtual   #530 <Method StringBuilder StringBuilder.append(long)>
	//  204  497:pop             
			stringbuilder1.append(" ");
	//  205  498:aload           9
	//  206  500:ldc2            #532 <String " ">
	//  207  503:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  208  506:pop             
			stringbuilder1.append(s2);
	//  209  507:aload           9
	//  210  509:aload           8
	//  211  511:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  212  514:pop             
			((PrintWriter) (as)).println(stringbuilder1.toString());
	//  213  515:aload           4
	//  214  517:aload           9
	//  215  519:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  216  522:invokevirtual   #496 <Method void PrintWriter.println(String)>
		}
		if(zzby > 0L)
	//* 217  525:aload_0         
	//* 218  526:getfield        #548 <Field long zzby>
	//* 219  529:lconst_0        
	//* 220  530:lcmp            
	//* 221  531:ifle            631
		{
			printwriter.append(((CharSequence) (s))).append("lastFailedStatus=").append(((CharSequence) (CommonStatusCodes.getStatusCodeString(zzbx))));
	//  222  534:aload_3         
	//  223  535:aload_1         
	//  224  536:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  225  539:ldc2            #550 <String "lastFailedStatus=">
	//  226  542:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  227  545:aload_0         
	//  228  546:getfield        #552 <Field int zzbx>
	//  229  549:invokestatic    #557 <Method String CommonStatusCodes.getStatusCodeString(int)>
	//  230  552:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  231  555:pop             
			s = ((String) (printwriter.append(" lastFailedTime=")));
	//  232  556:aload_3         
	//  233  557:ldc2            #559 <String " lastFailedTime=">
	//  234  560:invokevirtual   #450 <Method PrintWriter PrintWriter.append(CharSequence)>
	//  235  563:astore_1        
			long l2 = zzby;
	//  236  564:aload_0         
	//  237  565:getfield        #548 <Field long zzby>
	//  238  568:lstore          6
			filedescriptor = ((FileDescriptor) (((SimpleDateFormat) (filedescriptor)).format(new Date(l2))));
	//  239  570:aload_2         
	//  240  571:new             #520 <Class Date>
	//  241  574:dup             
	//  242  575:lload           6
	//  243  577:invokespecial   #523 <Method void Date(long)>
	//  244  580:invokevirtual   #527 <Method String SimpleDateFormat.format(Date)>
	//  245  583:astore_2        
			printwriter = ((PrintWriter) (new StringBuilder(String.valueOf(((Object) (filedescriptor))).length() + 21)));
	//  246  584:new             #255 <Class StringBuilder>
	//  247  587:dup             
	//  248  588:aload_2         
	//  249  589:invokestatic    #259 <Method String String.valueOf(Object)>
	//  250  592:invokevirtual   #263 <Method int String.length()>
	//  251  595:bipush          21
	//  252  597:iadd            
	//  253  598:invokespecial   #264 <Method void StringBuilder(int)>
	//  254  601:astore_3        
			((StringBuilder) (printwriter)).append(l2);
	//  255  602:aload_3         
	//  256  603:lload           6
	//  257  605:invokevirtual   #530 <Method StringBuilder StringBuilder.append(long)>
	//  258  608:pop             
			((StringBuilder) (printwriter)).append(" ");
	//  259  609:aload_3         
	//  260  610:ldc2            #532 <String " ">
	//  261  613:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  262  616:pop             
			((StringBuilder) (printwriter)).append(((String) (filedescriptor)));
	//  263  617:aload_3         
	//  264  618:aload_2         
	//  265  619:invokevirtual   #270 <Method StringBuilder StringBuilder.append(String)>
	//  266  622:pop             
			((PrintWriter) (s)).println(((StringBuilder) (printwriter)).toString());
	//  267  623:aload_1         
	//  268  624:aload_3         
	//  269  625:invokevirtual   #277 <Method String StringBuilder.toString()>
	//  270  628:invokevirtual   #496 <Method void PrintWriter.println(String)>
		}
		return;
	//  271  631:return          
		s;
	//  272  632:astore_1        
		as;
	//  273  633:aload           4
		JVM INSTR monitorexit ;
	//  274  635:monitorexit     
		throw s;
	//  275  636:aload_1         
	//  276  637:athrow          
		s;
	//  277  638:astore_1        
		as;
	//  278  639:aload           4
		JVM INSTR monitorexit ;
	//  279  641:monitorexit     
		throw s;
	//  280  642:aload_1         
	//  281  643:athrow          
	}

	public Account getAccount()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public Feature[] getApiFeatures()
	{
		return zzbt;
	//    0    0:getstatic       #118 <Field Feature[] zzbt>
	//    1    3:areturn         
	}

	public final Feature[] getAvailableFeatures()
	{
		com.google.android.gms.common.internal.zzb zzb1 = zzcq;
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field zzb zzcq>
	//    2    4:astore_1        
		if(zzb1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return zzb1.zzdb;
	//    7   11:aload_1         
	//    8   12:getfield        #569 <Field Feature[] zzb.zzdb>
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
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #415 <Method boolean isConnected()>
	//*   2    4:ifeq            21
		{
			zzh zzh1 = zzbz;
	//    3    7:aload_0         
	//    4    8:getfield        #244 <Field zzh zzbz>
	//    5   11:astore_1        
			if(zzh1 != null)
	//*   6   12:aload_1         
	//*   7   13:ifnull          21
				return zzh1.getPackageName();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #253 <Method String zzh.getPackageName()>
	//   10   20:areturn         
		}
		throw new RuntimeException("Failed to connect when checking package");
	//   11   21:new             #574 <Class RuntimeException>
	//   12   24:dup             
	//   13   25:ldc2            #576 <String "Failed to connect when checking package">
	//   14   28:invokespecial   #577 <Method void RuntimeException(String)>
	//   15   31:athrow          
	}

	protected Bundle getGetServiceRequestExtraArgs()
	{
		return new Bundle();
	//    0    0:new             #580 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #581 <Method void Bundle()>
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
		return zzca;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field Looper zzca>
	//    2    4:areturn         
	}

	public int getMinApkVersion()
	{
		return GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    0    0:getstatic       #584 <Field int GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    1    3:ireturn         
	}

	public void getRemoteService(IAccountAccessor iaccountaccessor, Set set)
	{
		GetServiceRequest getservicerequest;
		Bundle bundle = getGetServiceRequestExtraArgs();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #595 <Method Bundle getGetServiceRequestExtraArgs()>
	//    2    4:astore          4
		getservicerequest = new GetServiceRequest(zzcm);
	//    3    6:new             #597 <Class GetServiceRequest>
	//    4    9:dup             
	//    5   10:aload_0         
	//    6   11:getfield        #193 <Field int zzcm>
	//    7   14:invokespecial   #598 <Method void GetServiceRequest(int)>
	//    8   17:astore_3        
		getservicerequest.zzy = mContext.getPackageName();
	//    9   18:aload_3         
	//   10   19:aload_0         
	//   11   20:getfield        #167 <Field Context mContext>
	//   12   23:invokevirtual   #309 <Method String Context.getPackageName()>
	//   13   26:putfield        #601 <Field String GetServiceRequest.zzy>
		getservicerequest.zzdk = bundle;
	//   14   29:aload_3         
	//   15   30:aload           4
	//   16   32:putfield        #605 <Field Bundle GetServiceRequest.zzdk>
		if(set != null)
	//*  17   35:aload_2         
	//*  18   36:ifnull          61
			getservicerequest.zzdj = (Scope[])((Collection) (set)).toArray(((Object []) (new Scope[((Collection) (set)).size()])));
	//   19   39:aload_3         
	//   20   40:aload_2         
	//   21   41:aload_2         
	//   22   42:invokeinterface #608 <Method int Collection.size()>
	//   23   47:anewarray       Scope[]
	//   24   50:invokeinterface #614 <Method Object[] Collection.toArray(Object[])>
	//   25   55:checkcast       #616 <Class Scope[]>
	//   26   58:putfield        #619 <Field Scope[] GetServiceRequest.zzdj>
		if(requiresSignIn())
	//*  27   61:aload_0         
	//*  28   62:invokevirtual   #622 <Method boolean requiresSignIn()>
	//*  29   65:ifeq            118
		{
			if(getAccount() != null)
	//*  30   68:aload_0         
	//*  31   69:invokevirtual   #624 <Method Account getAccount()>
	//*  32   72:ifnull          83
				set = ((Set) (getAccount()));
	//   33   75:aload_0         
	//   34   76:invokevirtual   #624 <Method Account getAccount()>
	//   35   79:astore_2        
			else
	//*  36   80:goto            96
				set = ((Set) (new Account("<<default account>>", "com.google")));
	//   37   83:new             #626 <Class Account>
	//   38   86:dup             
	//   39   87:ldc1            #53  <String "<<default account>>">
	//   40   89:ldc2            #628 <String "com.google">
	//   41   92:invokespecial   #631 <Method void Account(String, String)>
	//   42   95:astore_2        
			getservicerequest.zzdl = ((Account) (set));
	//   43   96:aload_3         
	//   44   97:aload_2         
	//   45   98:putfield        #635 <Field Account GetServiceRequest.zzdl>
			if(iaccountaccessor != null)
	//*  46  101:aload_1         
	//*  47  102:ifnull          133
				getservicerequest.zzdi = iaccountaccessor.asBinder();
	//   48  105:aload_3         
	//   49  106:aload_1         
	//   50  107:invokeinterface #638 <Method IBinder IAccountAccessor.asBinder()>
	//   51  112:putfield        #642 <Field IBinder GetServiceRequest.zzdi>
		} else
	//*  52  115:goto            133
		if(requiresAccount())
	//*  53  118:aload_0         
	//*  54  119:invokevirtual   #645 <Method boolean requiresAccount()>
	//*  55  122:ifeq            133
			getservicerequest.zzdl = getAccount();
	//   56  125:aload_3         
	//   57  126:aload_0         
	//   58  127:invokevirtual   #624 <Method Account getAccount()>
	//   59  130:putfield        #635 <Field Account GetServiceRequest.zzdl>
		getservicerequest.zzdm = zzbt;
	//   60  133:aload_3         
	//   61  134:getstatic       #118 <Field Feature[] zzbt>
	//   62  137:putfield        #648 <Field Feature[] GetServiceRequest.zzdm>
		getservicerequest.zzdn = getApiFeatures();
	//   63  140:aload_3         
	//   64  141:aload_0         
	//   65  142:invokevirtual   #650 <Method Feature[] getApiFeatures()>
	//   66  145:putfield        #653 <Field Feature[] GetServiceRequest.zzdn>
		iaccountaccessor = ((IAccountAccessor) (zzcd));
	//   67  148:aload_0         
	//   68  149:getfield        #135 <Field Object zzcd>
	//   69  152:astore_1        
		iaccountaccessor;
	//   70  153:aload_1         
		JVM INSTR monitorenter ;
	//   71  154:monitorenter    
		if(zzce != null)
	//*  72  155:aload_0         
	//*  73  156:getfield        #225 <Field IGmsServiceBroker zzce>
	//*  74  159:ifnull          190
		{
			zzce.getService(((IGmsCallbacks) (new zzd(this, zzcr.get()))), getservicerequest);
	//   75  162:aload_0         
	//   76  163:getfield        #225 <Field IGmsServiceBroker zzce>
	//   77  166:new             #31  <Class BaseGmsClient$zzd>
	//   78  169:dup             
	//   79  170:aload_0         
	//   80  171:aload_0         
	//   81  172:getfield        #155 <Field AtomicInteger zzcr>
	//   82  175:invokevirtual   #298 <Method int AtomicInteger.get()>
	//   83  178:invokespecial   #654 <Method void BaseGmsClient$zzd(BaseGmsClient, int)>
	//   84  181:aload_3         
	//   85  182:invokeinterface #658 <Method void IGmsServiceBroker.getService(IGmsCallbacks, GetServiceRequest)>
			break MISSING_BLOCK_LABEL_200;
	//   86  187:goto            200
		}
		Log.w("GmsClient", "mServiceBroker is null, client disconnected");
	//   87  190:ldc2            #274 <String "GmsClient">
	//   88  193:ldc2            #660 <String "mServiceBroker is null, client disconnected">
	//   89  196:invokestatic    #663 <Method int Log.w(String, String)>
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
	//* 100  209:goto            213
	//* 101  212:astore_1        
	//* 102  213:ldc2            #274 <String "GmsClient">
	//* 103  216:ldc2            #665 <String "IGmsServiceBroker.getService failed">
	//* 104  219:aload_1         
	//* 105  220:invokestatic    #668 <Method int Log.w(String, String, Throwable)>
	//* 106  223:pop             
	//* 107  224:aload_0         
	//* 108  225:bipush          8
	//* 109  227:aconst_null     
	//* 110  228:aconst_null     
	//* 111  229:aload_0         
	//* 112  230:getfield        #155 <Field AtomicInteger zzcr>
	//* 113  233:invokevirtual   #298 <Method int AtomicInteger.get()>
	//* 114  236:invokevirtual   #672 <Method void onPostInitHandler(int, IBinder, Bundle, int)>
	//* 115  239:return          
	//* 116  240:astore_1        
	//* 117  241:aload_1         
	//* 118  242:athrow          
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor)
	//* 119  243:astore_1        
		{
			Log.w("GmsClient", "IGmsServiceBroker.getService failed", ((Throwable) (iaccountaccessor)));
	//  120  244:ldc2            #274 <String "GmsClient">
	//  121  247:ldc2            #665 <String "IGmsServiceBroker.getService failed">
	//  122  250:aload_1         
	//  123  251:invokestatic    #668 <Method int Log.w(String, String, Throwable)>
	//  124  254:pop             
			triggerConnectionSuspended(1);
	//  125  255:aload_0         
	//  126  256:iconst_1        
	//  127  257:invokevirtual   #675 <Method void triggerConnectionSuspended(int)>
			return;
	//  128  260:return          
		}
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor)
		{
			throw iaccountaccessor;
		}
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor) { }
		// Misplaced declaration of an exception variable
		catch(IAccountAccessor iaccountaccessor) { }
		Log.w("GmsClient", "IGmsServiceBroker.getService failed", ((Throwable) (iaccountaccessor)));
		onPostInitHandler(8, ((IBinder) (null)), ((Bundle) (null)), zzcr.get());
		return;
	}

	protected Set getScopes()
	{
		return Collections.EMPTY_SET;
	//    0    0:getstatic       #684 <Field Set Collections.EMPTY_SET>
	//    1    3:areturn         
	}

	public final IInterface getService()
		throws DeadObjectException
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #133 <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzcj == 5)
			break MISSING_BLOCK_LABEL_47;
	//    5    7:aload_0         
	//    6    8:getfield        #142 <Field int zzcj>
	//    7   11:iconst_5        
	//    8   12:icmpeq          47
		checkConnected();
	//    9   15:aload_0         
	//   10   16:invokevirtual   #688 <Method void checkConnected()>
		boolean flag;
		IInterface iinterface;
		Exception exception;
		if(zzcg != null)
	//*  11   19:aload_0         
	//*  12   20:getfield        #233 <Field IInterface zzcg>
	//*  13   23:ifnull          60
			flag = true;
	//   14   26:iconst_1        
	//   15   27:istore_1        
		else
	//*  16   28:goto            31
	//*  17   31:iload_1         
	//*  18   32:ldc2            #690 <String "Client is connected but service is null">
	//*  19   35:invokestatic    #694 <Method void Preconditions.checkState(boolean, Object)>
	//*  20   38:aload_0         
	//*  21   39:getfield        #233 <Field IInterface zzcg>
	//*  22   42:astore_3        
	//*  23   43:aload_2         
	//*  24   44:monitorexit     
	//*  25   45:aload_3         
	//*  26   46:areturn         
	//*  27   47:new             #589 <Class DeadObjectException>
	//*  28   50:dup             
	//*  29   51:invokespecial   #695 <Method void DeadObjectException()>
	//*  30   54:athrow          
	//*  31   55:astore_3        
	//*  32   56:aload_2         
	//*  33   57:monitorexit     
	//*  34   58:aload_3         
	//*  35   59:athrow          
			flag = false;
	//   36   60:iconst_0        
	//   37   61:istore_1        
		Preconditions.checkState(flag, "Client is connected but service is null");
		iinterface = zzcg;
		obj;
		JVM INSTR monitorexit ;
		return iinterface;
		throw new DeadObjectException();
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  38   62:goto            31
	}

	public IBinder getServiceBrokerBinder()
	{
label0:
		{
			synchronized(zzcd)
	//*   0    0:aload_0         
	//*   1    1:getfield        #135 <Field Object zzcd>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzce != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #225 <Field IGmsServiceBroker zzce>
	//    7   11:ifnonnull       18
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return null;
	//   10   16:aconst_null     
	//   11   17:areturn         
		}
		IBinder ibinder = zzce.asBinder();
	//   12   18:aload_0         
	//   13   19:getfield        #225 <Field IGmsServiceBroker zzce>
	//   14   22:invokeinterface #501 <Method IBinder IGmsServiceBroker.asBinder()>
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
	//    0    0:new             #702 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #704 <String "Not a sign in API">
	//    3    7:invokespecial   #705 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected abstract String getStartServiceAction();

	protected String getStartServicePackage()
	{
		return "com.google.android.gms";
	//    0    0:ldc2            #707 <String "com.google.android.gms">
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
		if(zzcj == 4)
	//*   5    7:aload_0         
	//*   6    8:getfield        #142 <Field int zzcj>
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
		if(zzcj != 2 && zzcj != 3)
	//*   5    7:aload_0         
	//*   6    8:getfield        #142 <Field int zzcj>
	//*   7   11:iconst_2        
	//*   8   12:icmpeq          40
	//*   9   15:aload_0         
	//*  10   16:getfield        #142 <Field int zzcj>
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
		zzbw = System.currentTimeMillis();
	//    0    0:aload_0         
	//    1    1:invokestatic    #713 <Method long System.currentTimeMillis()>
	//    2    4:putfield        #516 <Field long zzbw>
	//    3    7:return          
	}

	protected void onConnectionFailed(ConnectionResult connectionresult)
	{
		zzbx = connectionresult.getErrorCode();
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #721 <Method int ConnectionResult.getErrorCode()>
	//    3    5:putfield        #552 <Field int zzbx>
		zzby = System.currentTimeMillis();
	//    4    8:aload_0         
	//    5    9:invokestatic    #713 <Method long System.currentTimeMillis()>
	//    6   12:putfield        #548 <Field long zzby>
	//    7   15:return          
	}

	protected void onConnectionSuspended(int i)
	{
		zzbu = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #538 <Field int zzbu>
		zzbv = System.currentTimeMillis();
	//    3    5:aload_0         
	//    4    6:invokestatic    #713 <Method long System.currentTimeMillis()>
	//    5    9:putfield        #534 <Field long zzbv>
	//    6   12:return          
	}

	protected void onPostInitHandler(int i, IBinder ibinder, Bundle bundle, int j)
	{
		Handler handler = mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field Handler mHandler>
	//    2    4:astore          5
		handler.sendMessage(handler.obtainMessage(1, j, -1, ((Object) (new zzf(i, ibinder, bundle)))));
	//    3    6:aload           5
	//    4    8:aload           5
	//    5   10:iconst_1        
	//    6   11:iload           4
	//    7   13:iconst_m1       
	//    8   14:new             #37  <Class BaseGmsClient$zzf>
	//    9   17:dup             
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:invokespecial   #725 <Method void BaseGmsClient$zzf(BaseGmsClient, int, IBinder, Bundle)>
	//   15   25:invokevirtual   #728 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   16   28:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   17   31:pop             
	//   18   32:return          
	}

	void onSetConnectState(int i, IInterface iinterface)
	{
	//    0    0:return          
	}

	public void onUserSignOut(SignOutCallbacks signoutcallbacks)
	{
		signoutcallbacks.onSignOutComplete();
	//    0    0:aload_1         
	//    1    1:invokeinterface #733 <Method void BaseGmsClient$SignOutCallbacks.onSignOutComplete()>
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
		Handler handler = mHandler;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field Handler mHandler>
	//    2    4:astore_2        
		handler.sendMessage(handler.obtainMessage(6, zzcr.get(), i));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:bipush          6
	//    6    9:aload_0         
	//    7   10:getfield        #155 <Field AtomicInteger zzcr>
	//    8   13:invokevirtual   #298 <Method int AtomicInteger.get()>
	//    9   16:iload_1         
	//   10   17:invokevirtual   #355 <Method Message Handler.obtainMessage(int, int, int)>
	//   11   20:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   12   23:pop             
	//   13   24:return          
	}

	protected void triggerNotAvailable(ConnectionProgressReportCallbacks connectionprogressreportcallbacks, int i, PendingIntent pendingintent)
	{
		zzcf = (ConnectionProgressReportCallbacks)Preconditions.checkNotNull(((Object) (connectionprogressreportcallbacks)), "Connection progress callbacks cannot be null.");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2            #425 <String "Connection progress callbacks cannot be null.">
	//    3    5:invokestatic    #163 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4    8:checkcast       #13  <Class BaseGmsClient$ConnectionProgressReportCallbacks>
	//    5   11:putfield        #427 <Field BaseGmsClient$ConnectionProgressReportCallbacks zzcf>
		connectionprogressreportcallbacks = ((ConnectionProgressReportCallbacks) (mHandler));
	//    6   14:aload_0         
	//    7   15:getfield        #173 <Field Handler mHandler>
	//    8   18:astore_1        
		((Handler) (connectionprogressreportcallbacks)).sendMessage(((Handler) (connectionprogressreportcallbacks)).obtainMessage(3, zzcr.get(), i, ((Object) (pendingintent))));
	//    9   19:aload_1         
	//   10   20:aload_1         
	//   11   21:iconst_3        
	//   12   22:aload_0         
	//   13   23:getfield        #155 <Field AtomicInteger zzcr>
	//   14   26:invokevirtual   #298 <Method int AtomicInteger.get()>
	//   15   29:iload_2         
	//   16   30:aload_3         
	//   17   31:invokevirtual   #728 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   18   34:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   19   37:pop             
	//   20   38:return          
	}

	protected final void zza(int i, Bundle bundle, int j)
	{
		bundle = ((Bundle) (mHandler));
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field Handler mHandler>
	//    2    4:astore_2        
		((Handler) (bundle)).sendMessage(((Handler) (bundle)).obtainMessage(7, j, -1, ((Object) (new zzg(i, ((Bundle) (null)))))));
	//    3    5:aload_2         
	//    4    6:aload_2         
	//    5    7:bipush          7
	//    6    9:iload_3         
	//    7   10:iconst_m1       
	//    8   11:new             #40  <Class BaseGmsClient$zzg>
	//    9   14:dup             
	//   10   15:aload_0         
	//   11   16:iload_1         
	//   12   17:aconst_null     
	//   13   18:invokespecial   #738 <Method void BaseGmsClient$zzg(BaseGmsClient, int, Bundle)>
	//   14   21:invokevirtual   #728 <Method Message Handler.obtainMessage(int, int, int, Object)>
	//   15   24:invokevirtual   #359 <Method boolean Handler.sendMessage(Message)>
	//   16   27:pop             
	//   17   28:return          
	}

	public static final int CONNECT_STATE_CONNECTED = 4;
	public static final int CONNECT_STATE_DISCONNECTED = 1;
	public static final int CONNECT_STATE_DISCONNECTING = 5;
	public static final String DEFAULT_ACCOUNT = "<<default account>>";
	public static final String GOOGLE_PLUS_REQUIRED_FEATURES[] = {
		"service_esmobile", "service_googleme"
	};
	public static final String KEY_PENDING_INTENT = "pendingIntent";
	private static final Feature zzbt[] = new Feature[0];
	private final Context mContext;
	final Handler mHandler;
	private final Object mLock;
	private int zzbu;
	private long zzbv;
	private long zzbw;
	private int zzbx;
	private long zzby;
	private zzh zzbz;
	private final Looper zzca;
	private final GmsClientSupervisor zzcb;
	private final GoogleApiAvailabilityLight zzcc;
	private final Object zzcd;
	private IGmsServiceBroker zzce;
	protected ConnectionProgressReportCallbacks zzcf;
	private IInterface zzcg;
	private final ArrayList zzch;
	private zze zzci;
	private int zzcj;
	private final BaseConnectionCallbacks zzck;
	private final BaseOnConnectionFailedListener zzcl;
	private final int zzcm;
	private final String zzcn;
	private ConnectionResult zzco;
	private boolean zzcp;
	private volatile com.google.android.gms.common.internal.zzb zzcq;
	protected AtomicInteger zzcr;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       Feature[]
	//    2    4:putstatic       #118 <Field Feature[] zzbt>
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
