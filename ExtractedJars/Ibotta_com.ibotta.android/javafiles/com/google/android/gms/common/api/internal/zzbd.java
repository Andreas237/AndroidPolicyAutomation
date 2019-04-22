// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.ClientSettings;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.common.api.internal:
//			zzbp, zzq, zzp, zzbf, 
//			zzau, zzbc, BasePendingResult, zzag, 
//			zzaj, zzav, zzbq, SignInConnectionListener, 
//			zzbe

public final class zzbd
	implements zzbp, zzq
{

	public zzbd(Context context, zzav zzav1, Lock lock, Looper looper, GoogleApiAvailabilityLight googleapiavailabilitylight, Map map, ClientSettings clientsettings, 
			Map map1, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, ArrayList arraylist, zzbq zzbq)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void HashMap()>
	//    6   12:putfield        #50  <Field Map zzjb>
		zzjd = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #52  <Field ConnectionResult zzjd>
		mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #54  <Field Context mContext>
		zzga = lock;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #56  <Field Lock zzga>
		zzgk = googleapiavailabilitylight;
	//   16   30:aload_0         
	//   17   31:aload           5
	//   18   33:putfield        #58  <Field GoogleApiAvailabilityLight zzgk>
		zzil = map;
	//   19   36:aload_0         
	//   20   37:aload           6
	//   21   39:putfield        #60  <Field Map zzil>
		zzgf = clientsettings;
	//   22   42:aload_0         
	//   23   43:aload           7
	//   24   45:putfield        #62  <Field ClientSettings zzgf>
		zzgi = map1;
	//   25   48:aload_0         
	//   26   49:aload           8
	//   27   51:putfield        #64  <Field Map zzgi>
		zzdh = abstractclientbuilder;
	//   28   54:aload_0         
	//   29   55:aload           9
	//   30   57:putfield        #66  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
		zzfq = zzav1;
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:putfield        #68  <Field zzav zzfq>
		zzjf = zzbq;
	//   34   65:aload_0         
	//   35   66:aload           11
	//   36   68:putfield        #70  <Field zzbq zzjf>
		context = ((Context) ((ArrayList)arraylist));
	//   37   71:aload           10
	//   38   73:checkcast       #72  <Class ArrayList>
	//   39   76:astore_1        
		int j = ((ArrayList) (context)).size();
	//   40   77:aload_1         
	//   41   78:invokevirtual   #76  <Method int ArrayList.size()>
	//   42   81:istore          13
		for(int i = 0; i < j;)
	//*  43   83:iconst_0        
	//*  44   84:istore          12
	//*  45   86:iload           12
	//*  46   88:iload           13
	//*  47   90:icmpge          117
		{
			zzav1 = ((zzav) (((ArrayList) (context)).get(i)));
	//   48   93:aload_1         
	//   49   94:iload           12
	//   50   96:invokevirtual   #80  <Method Object ArrayList.get(int)>
	//   51   99:astore_2        
			i++;
	//   52  100:iload           12
	//   53  102:iconst_1        
	//   54  103:iadd            
	//   55  104:istore          12
			((zzp)zzav1).zza(((zzq) (this)));
	//   56  106:aload_2         
	//   57  107:checkcast       #82  <Class zzp>
	//   58  110:aload_0         
	//   59  111:invokevirtual   #86  <Method void zzp.zza(zzq)>
		}

	//*  60  114:goto            86
		zzja = new zzbf(this, looper);
	//   61  117:aload_0         
	//   62  118:new             #88  <Class zzbf>
	//   63  121:dup             
	//   64  122:aload_0         
	//   65  123:aload           4
	//   66  125:invokespecial   #91  <Method void zzbf(zzbd, Looper)>
	//   67  128:putfield        #93  <Field zzbf zzja>
		zziz = lock.newCondition();
	//   68  131:aload_0         
	//   69  132:aload_3         
	//   70  133:invokeinterface #99  <Method Condition Lock.newCondition()>
	//   71  138:putfield        #101 <Field Condition zziz>
		zzjc = ((zzbc) (new zzau(this)));
	//   72  141:aload_0         
	//   73  142:new             #103 <Class zzau>
	//   74  145:dup             
	//   75  146:aload_0         
	//   76  147:invokespecial   #106 <Method void zzau(zzbd)>
	//   77  150:putfield        #108 <Field zzbc zzjc>
	//   78  153:return          
	}

	static Lock zza(zzbd zzbd1)
	{
		return zzbd1.zzga;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zzga>
	//    2    4:areturn         
	}

	static zzbc zzb(zzbd zzbd1)
	{
		return zzbd1.zzjc;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zzbc zzjc>
	//    2    4:areturn         
	}

	public final ConnectionResult blockingConnect()
	{
		InterruptedException interruptedexception;
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method void connect()>
		do
		{
			if(!isConnecting())
				break;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #128 <Method boolean isConnecting()>
	//    4    8:ifeq            40
			try
			{
				zziz.await();
	//    5   11:aload_0         
	//    6   12:getfield        #101 <Field Condition zziz>
	//    7   15:invokeinterface #133 <Method void Condition.await()>
			}
	//*   8   20:goto            4
	//*   9   23:invokestatic    #139 <Method Thread Thread.currentThread()>
	//*  10   26:invokevirtual   #142 <Method void Thread.interrupt()>
	//*  11   29:new             #144 <Class ConnectionResult>
	//*  12   32:dup             
	//*  13   33:bipush          15
	//*  14   35:aconst_null     
	//*  15   36:invokespecial   #147 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  16   39:areturn         
	//*  17   40:aload_0         
	//*  18   41:invokevirtual   #150 <Method boolean isConnected()>
	//*  19   44:ifeq            51
	//*  20   47:getstatic       #153 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//*  21   50:areturn         
	//*  22   51:aload_0         
	//*  23   52:getfield        #52  <Field ConnectionResult zzjd>
	//*  24   55:astore_1        
	//*  25   56:aload_1         
	//*  26   57:ifnull          62
	//*  27   60:aload_1         
	//*  28   61:areturn         
	//*  29   62:new             #144 <Class ConnectionResult>
	//*  30   65:dup             
	//*  31   66:bipush          13
	//*  32   68:aconst_null     
	//*  33   69:invokespecial   #147 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  34   72:areturn         
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
			}
		} while(true);
		if(isConnected())
			return ConnectionResult.RESULT_SUCCESS;
		ConnectionResult connectionresult = zzjd;
		if(connectionresult != null)
			return connectionresult;
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//*  35   73:astore_1        
	//*  36   74:goto            23
	}

	public final ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #124 <Method void connect()>
		l = timeunit.toNanos(l);
	//    2    4:aload_3         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #161 <Method long TimeUnit.toNanos(long)>
	//    5    9:lstore_1        
_L2:
		if(!isConnecting())
			break; /* Loop/switch isn't completed */
	//    6   10:aload_0         
	//    7   11:invokevirtual   #128 <Method boolean isConnecting()>
	//    8   14:ifeq            69
		if(l > 0L)
			break MISSING_BLOCK_LABEL_38;
	//    9   17:lload_1         
	//   10   18:lconst_0        
	//   11   19:lcmp            
	//   12   20:ifgt            38
		disconnect();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #164 <Method void disconnect()>
		return new ConnectionResult(14, ((android.app.PendingIntent) (null)));
	//   15   27:new             #144 <Class ConnectionResult>
	//   16   30:dup             
	//   17   31:bipush          14
	//   18   33:aconst_null     
	//   19   34:invokespecial   #147 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   20   37:areturn         
		l = zziz.awaitNanos(l);
	//   21   38:aload_0         
	//   22   39:getfield        #101 <Field Condition zziz>
	//   23   42:lload_1         
	//   24   43:invokeinterface #167 <Method long Condition.awaitNanos(long)>
	//   25   48:lstore_1        
		if(true) goto _L2; else goto _L1
	//   26   49:goto            10
_L4:
		Thread.currentThread().interrupt();
	//   27   52:invokestatic    #139 <Method Thread Thread.currentThread()>
	//   28   55:invokevirtual   #142 <Method void Thread.interrupt()>
		return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
	//   29   58:new             #144 <Class ConnectionResult>
	//   30   61:dup             
	//   31   62:bipush          15
	//   32   64:aconst_null     
	//   33   65:invokespecial   #147 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   68:areturn         
_L1:
		if(isConnected())
	//*  35   69:aload_0         
	//*  36   70:invokevirtual   #150 <Method boolean isConnected()>
	//*  37   73:ifeq            80
			return ConnectionResult.RESULT_SUCCESS;
	//   38   76:getstatic       #153 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   39   79:areturn         
		timeunit = ((TimeUnit) (zzjd));
	//   40   80:aload_0         
	//   41   81:getfield        #52  <Field ConnectionResult zzjd>
	//   42   84:astore_3        
		if(timeunit != null)
	//*  43   85:aload_3         
	//*  44   86:ifnull          91
			return ((ConnectionResult) (timeunit));
	//   45   89:aload_3         
	//   46   90:areturn         
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//   47   91:new             #144 <Class ConnectionResult>
	//   48   94:dup             
	//   49   95:bipush          13
	//   50   97:aconst_null     
	//   51   98:invokespecial   #147 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   52  101:areturn         
		timeunit;
	//   53  102:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  54  103:goto            52
	}

	public final void connect()
	{
		zzjc.connect();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zzbc zzjc>
	//    2    4:invokeinterface #170 <Method void zzbc.connect()>
	//    3    9:return          
	}

	public final void disconnect()
	{
		if(zzjc.disconnect())
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field zzbc zzjc>
	//*   2    4:invokeinterface #172 <Method boolean zzbc.disconnect()>
	//*   3    9:ifeq            21
			zzjb.clear();
	//    4   12:aload_0         
	//    5   13:getfield        #50  <Field Map zzjb>
	//    6   16:invokeinterface #177 <Method void Map.clear()>
	//    7   21:return          
	}

	public final void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		String s1 = String.valueOf(((Object) (s))).concat("  ");
	//    0    0:aload_1         
	//    1    1:invokestatic    #185 <Method String String.valueOf(Object)>
	//    2    4:ldc1            #187 <String "  ">
	//    3    6:invokevirtual   #191 <Method String String.concat(String)>
	//    4    9:astore          5
		printwriter.append(((CharSequence) (s))).append("mState=").println(((Object) (zzjc)));
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #197 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    8   16:ldc1            #199 <String "mState=">
	//    9   18:invokevirtual   #197 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   10   21:aload_0         
	//   11   22:getfield        #108 <Field zzbc zzjc>
	//   12   25:invokevirtual   #203 <Method void PrintWriter.println(Object)>
		Api api;
		for(Iterator iterator = zzgi.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.Client)zzil.get(((Object) (api.getClientKey())))).dump(s1, filedescriptor, printwriter, as))
	//*  13   28:aload_0         
	//*  14   29:getfield        #64  <Field Map zzgi>
	//*  15   32:invokeinterface #207 <Method Set Map.keySet()>
	//*  16   37:invokeinterface #213 <Method Iterator Set.iterator()>
	//*  17   42:astore          6
	//*  18   44:aload           6
	//*  19   46:invokeinterface #218 <Method boolean Iterator.hasNext()>
	//*  20   51:ifeq            115
		{
			api = (Api)iterator.next();
	//   21   54:aload           6
	//   22   56:invokeinterface #222 <Method Object Iterator.next()>
	//   23   61:checkcast       #224 <Class Api>
	//   24   64:astore          7
			printwriter.append(((CharSequence) (s))).append(((CharSequence) (api.getName()))).println(":");
	//   25   66:aload_3         
	//   26   67:aload_1         
	//   27   68:invokevirtual   #197 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   28   71:aload           7
	//   29   73:invokevirtual   #228 <Method String Api.getName()>
	//   30   76:invokevirtual   #197 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   31   79:ldc1            #230 <String ":">
	//   32   81:invokevirtual   #233 <Method void PrintWriter.println(String)>
		}

	//   33   84:aload_0         
	//   34   85:getfield        #60  <Field Map zzil>
	//   35   88:aload           7
	//   36   90:invokevirtual   #237 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//   37   93:invokeinterface #240 <Method Object Map.get(Object)>
	//   38   98:checkcast       #242 <Class com.google.android.gms.common.api.Api$Client>
	//   39  101:aload           5
	//   40  103:aload_2         
	//   41  104:aload_3         
	//   42  105:aload           4
	//   43  107:invokeinterface #244 <Method void com.google.android.gms.common.api.Api$Client.dump(String, FileDescriptor, PrintWriter, String[])>
	//*  44  112:goto            44
	//   45  115:return          
	}

	public final BaseImplementation.ApiMethodImpl enqueue(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		((BasePendingResult) (apimethodimpl)).zzx();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #252 <Method void BasePendingResult.zzx()>
		return zzjc.enqueue(apimethodimpl);
	//    2    4:aload_0         
	//    3    5:getfield        #108 <Field zzbc zzjc>
	//    4    8:aload_1         
	//    5    9:invokeinterface #254 <Method BaseImplementation$ApiMethodImpl zzbc.enqueue(BaseImplementation$ApiMethodImpl)>
	//    6   14:areturn         
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		((BasePendingResult) (apimethodimpl)).zzx();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #252 <Method void BasePendingResult.zzx()>
		return zzjc.execute(apimethodimpl);
	//    2    4:aload_0         
	//    3    5:getfield        #108 <Field zzbc zzjc>
	//    4    8:aload_1         
	//    5    9:invokeinterface #259 <Method BaseImplementation$ApiMethodImpl zzbc.execute(BaseImplementation$ApiMethodImpl)>
	//    6   14:areturn         
	}

	public final ConnectionResult getConnectionResult(Api api)
	{
		api = ((Api) (api.getClientKey()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #237 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    2    4:astore_1        
		if(zzil.containsKey(((Object) (api))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #60  <Field Map zzil>
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #267 <Method boolean Map.containsKey(Object)>
	//*   7   15:ifeq            70
		{
			if(((com.google.android.gms.common.api.Api.Client)zzil.get(((Object) (api)))).isConnected())
	//*   8   18:aload_0         
	//*   9   19:getfield        #60  <Field Map zzil>
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #240 <Method Object Map.get(Object)>
	//*  12   28:checkcast       #242 <Class com.google.android.gms.common.api.Api$Client>
	//*  13   31:invokeinterface #268 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//*  14   36:ifeq            43
				return ConnectionResult.RESULT_SUCCESS;
	//   15   39:getstatic       #153 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   16   42:areturn         
			if(zzjb.containsKey(((Object) (api))))
	//*  17   43:aload_0         
	//*  18   44:getfield        #50  <Field Map zzjb>
	//*  19   47:aload_1         
	//*  20   48:invokeinterface #267 <Method boolean Map.containsKey(Object)>
	//*  21   53:ifeq            70
				return (ConnectionResult)zzjb.get(((Object) (api)));
	//   22   56:aload_0         
	//   23   57:getfield        #50  <Field Map zzjb>
	//   24   60:aload_1         
	//   25   61:invokeinterface #240 <Method Object Map.get(Object)>
	//   26   66:checkcast       #144 <Class ConnectionResult>
	//   27   69:areturn         
		}
		return null;
	//   28   70:aconst_null     
	//   29   71:areturn         
	}

	public final boolean isConnected()
	{
		return zzjc instanceof zzag;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zzbc zzjc>
	//    2    4:instanceof      #271 <Class zzag>
	//    3    7:ireturn         
	}

	public final boolean isConnecting()
	{
		return zzjc instanceof zzaj;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zzbc zzjc>
	//    2    4:instanceof      #273 <Class zzaj>
	//    3    7:ireturn         
	}

	public final boolean maybeSignIn(SignInConnectionListener signinconnectionlistener)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public final void maybeSignOut()
	{
	//    0    0:return          
	}

	public final void onConnected(Bundle bundle)
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zzga>
	//    2    4:invokeinterface #281 <Method void Lock.lock()>
		zzjc.onConnected(bundle);
	//    3    9:aload_0         
	//    4   10:getfield        #108 <Field zzbc zzjc>
	//    5   13:aload_1         
	//    6   14:invokeinterface #283 <Method void zzbc.onConnected(Bundle)>
		zzga.unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #56  <Field Lock zzga>
	//    9   23:invokeinterface #286 <Method void Lock.unlock()>
		return;
	//   10   28:return          
		bundle;
	//   11   29:astore_1        
		zzga.unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #56  <Field Lock zzga>
	//   14   34:invokeinterface #286 <Method void Lock.unlock()>
		throw bundle;
	//   15   39:aload_1         
	//   16   40:athrow          
	}

	public final void onConnectionSuspended(int i)
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zzga>
	//    2    4:invokeinterface #281 <Method void Lock.lock()>
		zzjc.onConnectionSuspended(i);
	//    3    9:aload_0         
	//    4   10:getfield        #108 <Field zzbc zzjc>
	//    5   13:iload_1         
	//    6   14:invokeinterface #290 <Method void zzbc.onConnectionSuspended(int)>
		zzga.unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #56  <Field Lock zzga>
	//    9   23:invokeinterface #286 <Method void Lock.unlock()>
		return;
	//   10   28:return          
		Exception exception;
		exception;
	//   11   29:astore_2        
		zzga.unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #56  <Field Lock zzga>
	//   14   34:invokeinterface #286 <Method void Lock.unlock()>
		throw exception;
	//   15   39:aload_2         
	//   16   40:athrow          
	}

	public final void zza(ConnectionResult connectionresult, Api api, boolean flag)
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zzga>
	//    2    4:invokeinterface #281 <Method void Lock.lock()>
		zzjc.zza(connectionresult, api, flag);
	//    3    9:aload_0         
	//    4   10:getfield        #108 <Field zzbc zzjc>
	//    5   13:aload_1         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:invokeinterface #293 <Method void zzbc.zza(ConnectionResult, Api, boolean)>
		zzga.unlock();
	//    9   21:aload_0         
	//   10   22:getfield        #56  <Field Lock zzga>
	//   11   25:invokeinterface #286 <Method void Lock.unlock()>
		return;
	//   12   30:return          
		connectionresult;
	//   13   31:astore_1        
		zzga.unlock();
	//   14   32:aload_0         
	//   15   33:getfield        #56  <Field Lock zzga>
	//   16   36:invokeinterface #286 <Method void Lock.unlock()>
		throw connectionresult;
	//   17   41:aload_1         
	//   18   42:athrow          
	}

	final void zza(zzbe zzbe)
	{
		zzbe = ((zzbe) (zzja.obtainMessage(1, ((Object) (zzbe)))));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field zzbf zzja>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #299 <Method android.os.Message zzbf.obtainMessage(int, Object)>
	//    5    9:astore_1        
		zzja.sendMessage(((android.os.Message) (zzbe)));
	//    6   10:aload_0         
	//    7   11:getfield        #93  <Field zzbf zzja>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #303 <Method boolean zzbf.sendMessage(android.os.Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	final void zzb(RuntimeException runtimeexception)
	{
		runtimeexception = ((RuntimeException) (zzja.obtainMessage(2, ((Object) (runtimeexception)))));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field zzbf zzja>
	//    2    4:iconst_2        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #299 <Method android.os.Message zzbf.obtainMessage(int, Object)>
	//    5    9:astore_1        
		zzja.sendMessage(((android.os.Message) (runtimeexception)));
	//    6   10:aload_0         
	//    7   11:getfield        #93  <Field zzbf zzja>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #303 <Method boolean zzbf.sendMessage(android.os.Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	final void zzbc()
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zzga>
	//    2    4:invokeinterface #281 <Method void Lock.lock()>
		zzjc = ((zzbc) (new zzaj(this, zzgf, zzgi, zzgk, zzdh, zzga, mContext)));
	//    3    9:aload_0         
	//    4   10:new             #273 <Class zzaj>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field ClientSettings zzgf>
	//    9   19:aload_0         
	//   10   20:getfield        #64  <Field Map zzgi>
	//   11   23:aload_0         
	//   12   24:getfield        #58  <Field GoogleApiAvailabilityLight zzgk>
	//   13   27:aload_0         
	//   14   28:getfield        #66  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zzdh>
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field Lock zzga>
	//   17   35:aload_0         
	//   18   36:getfield        #54  <Field Context mContext>
	//   19   39:invokespecial   #308 <Method void zzaj(zzbd, ClientSettings, Map, GoogleApiAvailabilityLight, com.google.android.gms.common.api.Api$AbstractClientBuilder, Lock, Context)>
	//   20   42:putfield        #108 <Field zzbc zzjc>
		zzjc.begin();
	//   21   45:aload_0         
	//   22   46:getfield        #108 <Field zzbc zzjc>
	//   23   49:invokeinterface #311 <Method void zzbc.begin()>
		zziz.signalAll();
	//   24   54:aload_0         
	//   25   55:getfield        #101 <Field Condition zziz>
	//   26   58:invokeinterface #314 <Method void Condition.signalAll()>
		zzga.unlock();
	//   27   63:aload_0         
	//   28   64:getfield        #56  <Field Lock zzga>
	//   29   67:invokeinterface #286 <Method void Lock.unlock()>
		return;
	//   30   72:return          
		Exception exception;
		exception;
	//   31   73:astore_1        
		zzga.unlock();
	//   32   74:aload_0         
	//   33   75:getfield        #56  <Field Lock zzga>
	//   34   78:invokeinterface #286 <Method void Lock.unlock()>
		throw exception;
	//   35   83:aload_1         
	//   36   84:athrow          
	}

	final void zzbd()
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zzga>
	//    2    4:invokeinterface #281 <Method void Lock.lock()>
		zzfq.zzaz();
	//    3    9:aload_0         
	//    4   10:getfield        #68  <Field zzav zzfq>
	//    5   13:invokevirtual   #320 <Method boolean zzav.zzaz()>
	//    6   16:pop             
		zzjc = ((zzbc) (new zzag(this)));
	//    7   17:aload_0         
	//    8   18:new             #271 <Class zzag>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #321 <Method void zzag(zzbd)>
	//   12   26:putfield        #108 <Field zzbc zzjc>
		zzjc.begin();
	//   13   29:aload_0         
	//   14   30:getfield        #108 <Field zzbc zzjc>
	//   15   33:invokeinterface #311 <Method void zzbc.begin()>
		zziz.signalAll();
	//   16   38:aload_0         
	//   17   39:getfield        #101 <Field Condition zziz>
	//   18   42:invokeinterface #314 <Method void Condition.signalAll()>
		zzga.unlock();
	//   19   47:aload_0         
	//   20   48:getfield        #56  <Field Lock zzga>
	//   21   51:invokeinterface #286 <Method void Lock.unlock()>
		return;
	//   22   56:return          
		Exception exception;
		exception;
	//   23   57:astore_1        
		zzga.unlock();
	//   24   58:aload_0         
	//   25   59:getfield        #56  <Field Lock zzga>
	//   26   62:invokeinterface #286 <Method void Lock.unlock()>
		throw exception;
	//   27   67:aload_1         
	//   28   68:athrow          
	}

	final void zzf(ConnectionResult connectionresult)
	{
		zzga.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zzga>
	//    2    4:invokeinterface #281 <Method void Lock.lock()>
		zzjd = connectionresult;
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:putfield        #52  <Field ConnectionResult zzjd>
		zzjc = ((zzbc) (new zzau(this)));
	//    6   14:aload_0         
	//    7   15:new             #103 <Class zzau>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #106 <Method void zzau(zzbd)>
	//   11   23:putfield        #108 <Field zzbc zzjc>
		zzjc.begin();
	//   12   26:aload_0         
	//   13   27:getfield        #108 <Field zzbc zzjc>
	//   14   30:invokeinterface #311 <Method void zzbc.begin()>
		zziz.signalAll();
	//   15   35:aload_0         
	//   16   36:getfield        #101 <Field Condition zziz>
	//   17   39:invokeinterface #314 <Method void Condition.signalAll()>
		zzga.unlock();
	//   18   44:aload_0         
	//   19   45:getfield        #56  <Field Lock zzga>
	//   20   48:invokeinterface #286 <Method void Lock.unlock()>
		return;
	//   21   53:return          
		connectionresult;
	//   22   54:astore_1        
		zzga.unlock();
	//   23   55:aload_0         
	//   24   56:getfield        #56  <Field Lock zzga>
	//   25   59:invokeinterface #286 <Method void Lock.unlock()>
		throw connectionresult;
	//   26   64:aload_1         
	//   27   65:athrow          
	}

	public final void zzz()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #150 <Method boolean isConnected()>
	//*   2    4:ifeq            17
			((zzag)zzjc).zzap();
	//    3    7:aload_0         
	//    4    8:getfield        #108 <Field zzbc zzjc>
	//    5   11:checkcast       #271 <Class zzag>
	//    6   14:invokevirtual   #327 <Method void zzag.zzap()>
	//    7   17:return          
	}

	private final Context mContext;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zzdh;
	final zzav zzfq;
	private final Lock zzga;
	private final ClientSettings zzgf;
	private final Map zzgi;
	private final GoogleApiAvailabilityLight zzgk;
	final Map zzil;
	private final Condition zziz;
	private final zzbf zzja;
	final Map zzjb = new HashMap();
	private volatile zzbc zzjc;
	private ConnectionResult zzjd;
	int zzje;
	final zzbq zzjf;
}
