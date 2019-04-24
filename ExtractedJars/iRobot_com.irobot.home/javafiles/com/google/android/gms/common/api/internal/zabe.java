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
//			zabs, zar, zaq, zabg, 
//			zaav, zabd, BasePendingResult, zaah, 
//			zaak, zaaw, zabt, SignInConnectionListener, 
//			zabf

public final class zabe
	implements zabs, zar
{

	public zabe(Context context, zaaw zaaw1, Lock lock, Looper looper, GoogleApiAvailabilityLight googleapiavailabilitylight, Map map, ClientSettings clientsettings, 
			Map map1, com.google.android.gms.common.api.Api.AbstractClientBuilder abstractclientbuilder, ArrayList arraylist, zabt zabt)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #47  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #48  <Method void HashMap()>
	//    6   12:putfield        #50  <Field Map zaho>
		zahq = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #52  <Field ConnectionResult zahq>
		mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #54  <Field Context mContext>
		zaen = lock;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #56  <Field Lock zaen>
		zaex = googleapiavailabilitylight;
	//   16   30:aload_0         
	//   17   31:aload           5
	//   18   33:putfield        #58  <Field GoogleApiAvailabilityLight zaex>
		zagy = map;
	//   19   36:aload_0         
	//   20   37:aload           6
	//   21   39:putfield        #60  <Field Map zagy>
		zaes = clientsettings;
	//   22   42:aload_0         
	//   23   43:aload           7
	//   24   45:putfield        #62  <Field ClientSettings zaes>
		zaev = map1;
	//   25   48:aload_0         
	//   26   49:aload           8
	//   27   51:putfield        #64  <Field Map zaev>
		zacd = abstractclientbuilder;
	//   28   54:aload_0         
	//   29   55:aload           9
	//   30   57:putfield        #66  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
		zaed = zaaw1;
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:putfield        #68  <Field zaaw zaed>
		zahs = zabt;
	//   34   65:aload_0         
	//   35   66:aload           11
	//   36   68:putfield        #70  <Field zabt zahs>
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
			zaaw1 = ((zaaw) (((ArrayList) (context)).get(i)));
	//   48   93:aload_1         
	//   49   94:iload           12
	//   50   96:invokevirtual   #80  <Method Object ArrayList.get(int)>
	//   51   99:astore_2        
			i++;
	//   52  100:iload           12
	//   53  102:iconst_1        
	//   54  103:iadd            
	//   55  104:istore          12
			((zaq)zaaw1).zaa(((zar) (this)));
	//   56  106:aload_2         
	//   57  107:checkcast       #82  <Class zaq>
	//   58  110:aload_0         
	//   59  111:invokevirtual   #86  <Method void zaq.zaa(zar)>
		}

	//*  60  114:goto            86
		zahn = new zabg(this, looper);
	//   61  117:aload_0         
	//   62  118:new             #88  <Class zabg>
	//   63  121:dup             
	//   64  122:aload_0         
	//   65  123:aload           4
	//   66  125:invokespecial   #91  <Method void zabg(zabe, Looper)>
	//   67  128:putfield        #93  <Field zabg zahn>
		zahm = lock.newCondition();
	//   68  131:aload_0         
	//   69  132:aload_3         
	//   70  133:invokeinterface #99  <Method Condition Lock.newCondition()>
	//   71  138:putfield        #101 <Field Condition zahm>
		zahp = ((zabd) (new zaav(this)));
	//   72  141:aload_0         
	//   73  142:new             #103 <Class zaav>
	//   74  145:dup             
	//   75  146:aload_0         
	//   76  147:invokespecial   #106 <Method void zaav(zabe)>
	//   77  150:putfield        #108 <Field zabd zahp>
	//   78  153:return          
	}

	static Lock zaa(zabe zabe1)
	{
		return zabe1.zaen;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zaen>
	//    2    4:areturn         
	}

	static zabd zab(zabe zabe1)
	{
		return zabe1.zahp;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zabd zahp>
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
				zahm.await();
	//    5   11:aload_0         
	//    6   12:getfield        #101 <Field Condition zahm>
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
	//*  23   52:getfield        #52  <Field ConnectionResult zahq>
	//*  24   55:ifnull          63
	//*  25   58:aload_0         
	//*  26   59:getfield        #52  <Field ConnectionResult zahq>
	//*  27   62:areturn         
	//*  28   63:new             #144 <Class ConnectionResult>
	//*  29   66:dup             
	//*  30   67:bipush          13
	//*  31   69:aconst_null     
	//*  32   70:invokespecial   #147 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  33   73:areturn         
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
			}
		} while(true);
		if(isConnected())
			return ConnectionResult.RESULT_SUCCESS;
		if(zahq != null)
			return zahq;
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//*  34   74:astore_1        
	//*  35   75:goto            23
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
		l = zahm.awaitNanos(l);
	//   21   38:aload_0         
	//   22   39:getfield        #101 <Field Condition zahm>
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
		if(zahq != null)
	//*  40   80:aload_0         
	//*  41   81:getfield        #52  <Field ConnectionResult zahq>
	//*  42   84:ifnull          92
			return zahq;
	//   43   87:aload_0         
	//   44   88:getfield        #52  <Field ConnectionResult zahq>
	//   45   91:areturn         
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//   46   92:new             #144 <Class ConnectionResult>
	//   47   95:dup             
	//   48   96:bipush          13
	//   49   98:aconst_null     
	//   50   99:invokespecial   #147 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   51  102:areturn         
		timeunit;
	//   52  103:astore_3        
		if(true) goto _L4; else goto _L3
_L3:
	//*  53  104:goto            52
	}

	public final void connect()
	{
		zahp.connect();
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zabd zahp>
	//    2    4:invokeinterface #170 <Method void zabd.connect()>
	//    3    9:return          
	}

	public final void disconnect()
	{
		if(zahp.disconnect())
	//*   0    0:aload_0         
	//*   1    1:getfield        #108 <Field zabd zahp>
	//*   2    4:invokeinterface #172 <Method boolean zabd.disconnect()>
	//*   3    9:ifeq            21
			zaho.clear();
	//    4   12:aload_0         
	//    5   13:getfield        #50  <Field Map zaho>
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
		printwriter.append(((CharSequence) (s))).append("mState=").println(((Object) (zahp)));
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #197 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    8   16:ldc1            #199 <String "mState=">
	//    9   18:invokevirtual   #197 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   10   21:aload_0         
	//   11   22:getfield        #108 <Field zabd zahp>
	//   12   25:invokevirtual   #203 <Method void PrintWriter.println(Object)>
		Api api;
		for(Iterator iterator = zaev.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.Client)zagy.get(((Object) (api.getClientKey())))).dump(s1, filedescriptor, printwriter, as))
	//*  13   28:aload_0         
	//*  14   29:getfield        #64  <Field Map zaev>
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
	//   34   85:getfield        #60  <Field Map zagy>
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
		((BasePendingResult) (apimethodimpl)).zau();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #251 <Method void BasePendingResult.zau()>
		return zahp.enqueue(apimethodimpl);
	//    2    4:aload_0         
	//    3    5:getfield        #108 <Field zabd zahp>
	//    4    8:aload_1         
	//    5    9:invokeinterface #253 <Method BaseImplementation$ApiMethodImpl zabd.enqueue(BaseImplementation$ApiMethodImpl)>
	//    6   14:areturn         
	}

	public final BaseImplementation.ApiMethodImpl execute(BaseImplementation.ApiMethodImpl apimethodimpl)
	{
		((BasePendingResult) (apimethodimpl)).zau();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #251 <Method void BasePendingResult.zau()>
		return zahp.execute(apimethodimpl);
	//    2    4:aload_0         
	//    3    5:getfield        #108 <Field zabd zahp>
	//    4    8:aload_1         
	//    5    9:invokeinterface #257 <Method BaseImplementation$ApiMethodImpl zabd.execute(BaseImplementation$ApiMethodImpl)>
	//    6   14:areturn         
	}

	public final ConnectionResult getConnectionResult(Api api)
	{
		api = ((Api) (api.getClientKey()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #237 <Method com.google.android.gms.common.api.Api$AnyClientKey Api.getClientKey()>
	//    2    4:astore_1        
		if(zagy.containsKey(((Object) (api))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #60  <Field Map zagy>
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #264 <Method boolean Map.containsKey(Object)>
	//*   7   15:ifeq            70
		{
			if(((com.google.android.gms.common.api.Api.Client)zagy.get(((Object) (api)))).isConnected())
	//*   8   18:aload_0         
	//*   9   19:getfield        #60  <Field Map zagy>
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #240 <Method Object Map.get(Object)>
	//*  12   28:checkcast       #242 <Class com.google.android.gms.common.api.Api$Client>
	//*  13   31:invokeinterface #265 <Method boolean com.google.android.gms.common.api.Api$Client.isConnected()>
	//*  14   36:ifeq            43
				return ConnectionResult.RESULT_SUCCESS;
	//   15   39:getstatic       #153 <Field ConnectionResult ConnectionResult.RESULT_SUCCESS>
	//   16   42:areturn         
			if(zaho.containsKey(((Object) (api))))
	//*  17   43:aload_0         
	//*  18   44:getfield        #50  <Field Map zaho>
	//*  19   47:aload_1         
	//*  20   48:invokeinterface #264 <Method boolean Map.containsKey(Object)>
	//*  21   53:ifeq            70
				return (ConnectionResult)zaho.get(((Object) (api)));
	//   22   56:aload_0         
	//   23   57:getfield        #50  <Field Map zaho>
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
		return zahp instanceof zaah;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zabd zahp>
	//    2    4:instanceof      #268 <Class zaah>
	//    3    7:ireturn         
	}

	public final boolean isConnecting()
	{
		return zahp instanceof zaak;
	//    0    0:aload_0         
	//    1    1:getfield        #108 <Field zabd zahp>
	//    2    4:instanceof      #270 <Class zaak>
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
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zaen>
	//    2    4:invokeinterface #278 <Method void Lock.lock()>
		zahp.onConnected(bundle);
	//    3    9:aload_0         
	//    4   10:getfield        #108 <Field zabd zahp>
	//    5   13:aload_1         
	//    6   14:invokeinterface #280 <Method void zabd.onConnected(Bundle)>
		zaen.unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #56  <Field Lock zaen>
	//    9   23:invokeinterface #283 <Method void Lock.unlock()>
		return;
	//   10   28:return          
		bundle;
	//   11   29:astore_1        
		zaen.unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #56  <Field Lock zaen>
	//   14   34:invokeinterface #283 <Method void Lock.unlock()>
		throw bundle;
	//   15   39:aload_1         
	//   16   40:athrow          
	}

	public final void onConnectionSuspended(int i)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zaen>
	//    2    4:invokeinterface #278 <Method void Lock.lock()>
		zahp.onConnectionSuspended(i);
	//    3    9:aload_0         
	//    4   10:getfield        #108 <Field zabd zahp>
	//    5   13:iload_1         
	//    6   14:invokeinterface #287 <Method void zabd.onConnectionSuspended(int)>
		zaen.unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #56  <Field Lock zaen>
	//    9   23:invokeinterface #283 <Method void Lock.unlock()>
		return;
	//   10   28:return          
		Exception exception;
		exception;
	//   11   29:astore_2        
		zaen.unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #56  <Field Lock zaen>
	//   14   34:invokeinterface #283 <Method void Lock.unlock()>
		throw exception;
	//   15   39:aload_2         
	//   16   40:athrow          
	}

	public final void zaa(ConnectionResult connectionresult, Api api, boolean flag)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zaen>
	//    2    4:invokeinterface #278 <Method void Lock.lock()>
		zahp.zaa(connectionresult, api, flag);
	//    3    9:aload_0         
	//    4   10:getfield        #108 <Field zabd zahp>
	//    5   13:aload_1         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:invokeinterface #290 <Method void zabd.zaa(ConnectionResult, Api, boolean)>
		zaen.unlock();
	//    9   21:aload_0         
	//   10   22:getfield        #56  <Field Lock zaen>
	//   11   25:invokeinterface #283 <Method void Lock.unlock()>
		return;
	//   12   30:return          
		connectionresult;
	//   13   31:astore_1        
		zaen.unlock();
	//   14   32:aload_0         
	//   15   33:getfield        #56  <Field Lock zaen>
	//   16   36:invokeinterface #283 <Method void Lock.unlock()>
		throw connectionresult;
	//   17   41:aload_1         
	//   18   42:athrow          
	}

	final void zaa(zabf zabf)
	{
		zabf = ((zabf) (zahn.obtainMessage(1, ((Object) (zabf)))));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field zabg zahn>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #296 <Method android.os.Message zabg.obtainMessage(int, Object)>
	//    5    9:astore_1        
		zahn.sendMessage(((android.os.Message) (zabf)));
	//    6   10:aload_0         
	//    7   11:getfield        #93  <Field zabg zahn>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #300 <Method boolean zabg.sendMessage(android.os.Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	final void zaaz()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zaen>
	//    2    4:invokeinterface #278 <Method void Lock.lock()>
		zahp = ((zabd) (new zaak(this, zaes, zaev, zaex, zacd, zaen, mContext)));
	//    3    9:aload_0         
	//    4   10:new             #270 <Class zaak>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #62  <Field ClientSettings zaes>
	//    9   19:aload_0         
	//   10   20:getfield        #64  <Field Map zaev>
	//   11   23:aload_0         
	//   12   24:getfield        #58  <Field GoogleApiAvailabilityLight zaex>
	//   13   27:aload_0         
	//   14   28:getfield        #66  <Field com.google.android.gms.common.api.Api$AbstractClientBuilder zacd>
	//   15   31:aload_0         
	//   16   32:getfield        #56  <Field Lock zaen>
	//   17   35:aload_0         
	//   18   36:getfield        #54  <Field Context mContext>
	//   19   39:invokespecial   #304 <Method void zaak(zabe, ClientSettings, Map, GoogleApiAvailabilityLight, com.google.android.gms.common.api.Api$AbstractClientBuilder, Lock, Context)>
	//   20   42:putfield        #108 <Field zabd zahp>
		zahp.begin();
	//   21   45:aload_0         
	//   22   46:getfield        #108 <Field zabd zahp>
	//   23   49:invokeinterface #307 <Method void zabd.begin()>
		zahm.signalAll();
	//   24   54:aload_0         
	//   25   55:getfield        #101 <Field Condition zahm>
	//   26   58:invokeinterface #310 <Method void Condition.signalAll()>
		zaen.unlock();
	//   27   63:aload_0         
	//   28   64:getfield        #56  <Field Lock zaen>
	//   29   67:invokeinterface #283 <Method void Lock.unlock()>
		return;
	//   30   72:return          
		Exception exception;
		exception;
	//   31   73:astore_1        
		zaen.unlock();
	//   32   74:aload_0         
	//   33   75:getfield        #56  <Field Lock zaen>
	//   34   78:invokeinterface #283 <Method void Lock.unlock()>
		throw exception;
	//   35   83:aload_1         
	//   36   84:athrow          
	}

	final void zab(RuntimeException runtimeexception)
	{
		runtimeexception = ((RuntimeException) (zahn.obtainMessage(2, ((Object) (runtimeexception)))));
	//    0    0:aload_0         
	//    1    1:getfield        #93  <Field zabg zahn>
	//    2    4:iconst_2        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #296 <Method android.os.Message zabg.obtainMessage(int, Object)>
	//    5    9:astore_1        
		zahn.sendMessage(((android.os.Message) (runtimeexception)));
	//    6   10:aload_0         
	//    7   11:getfield        #93  <Field zabg zahn>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #300 <Method boolean zabg.sendMessage(android.os.Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	final void zaba()
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zaen>
	//    2    4:invokeinterface #278 <Method void Lock.lock()>
		zaed.zaaw();
	//    3    9:aload_0         
	//    4   10:getfield        #68  <Field zaaw zaed>
	//    5   13:invokevirtual   #317 <Method boolean zaaw.zaaw()>
	//    6   16:pop             
		zahp = ((zabd) (new zaah(this)));
	//    7   17:aload_0         
	//    8   18:new             #268 <Class zaah>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #318 <Method void zaah(zabe)>
	//   12   26:putfield        #108 <Field zabd zahp>
		zahp.begin();
	//   13   29:aload_0         
	//   14   30:getfield        #108 <Field zabd zahp>
	//   15   33:invokeinterface #307 <Method void zabd.begin()>
		zahm.signalAll();
	//   16   38:aload_0         
	//   17   39:getfield        #101 <Field Condition zahm>
	//   18   42:invokeinterface #310 <Method void Condition.signalAll()>
		zaen.unlock();
	//   19   47:aload_0         
	//   20   48:getfield        #56  <Field Lock zaen>
	//   21   51:invokeinterface #283 <Method void Lock.unlock()>
		return;
	//   22   56:return          
		Exception exception;
		exception;
	//   23   57:astore_1        
		zaen.unlock();
	//   24   58:aload_0         
	//   25   59:getfield        #56  <Field Lock zaen>
	//   26   62:invokeinterface #283 <Method void Lock.unlock()>
		throw exception;
	//   27   67:aload_1         
	//   28   68:athrow          
	}

	final void zaf(ConnectionResult connectionresult)
	{
		zaen.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Lock zaen>
	//    2    4:invokeinterface #278 <Method void Lock.lock()>
		zahq = connectionresult;
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:putfield        #52  <Field ConnectionResult zahq>
		zahp = ((zabd) (new zaav(this)));
	//    6   14:aload_0         
	//    7   15:new             #103 <Class zaav>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #106 <Method void zaav(zabe)>
	//   11   23:putfield        #108 <Field zabd zahp>
		zahp.begin();
	//   12   26:aload_0         
	//   13   27:getfield        #108 <Field zabd zahp>
	//   14   30:invokeinterface #307 <Method void zabd.begin()>
		zahm.signalAll();
	//   15   35:aload_0         
	//   16   36:getfield        #101 <Field Condition zahm>
	//   17   39:invokeinterface #310 <Method void Condition.signalAll()>
		zaen.unlock();
	//   18   44:aload_0         
	//   19   45:getfield        #56  <Field Lock zaen>
	//   20   48:invokeinterface #283 <Method void Lock.unlock()>
		return;
	//   21   53:return          
		connectionresult;
	//   22   54:astore_1        
		zaen.unlock();
	//   23   55:aload_0         
	//   24   56:getfield        #56  <Field Lock zaen>
	//   25   59:invokeinterface #283 <Method void Lock.unlock()>
		throw connectionresult;
	//   26   64:aload_1         
	//   27   65:athrow          
	}

	public final void zaw()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #150 <Method boolean isConnected()>
	//*   2    4:ifeq            17
			((zaah)zahp).zaam();
	//    3    7:aload_0         
	//    4    8:getfield        #108 <Field zabd zahp>
	//    5   11:checkcast       #268 <Class zaah>
	//    6   14:invokevirtual   #324 <Method void zaah.zaam()>
	//    7   17:return          
	}

	private final Context mContext;
	private final com.google.android.gms.common.api.Api.AbstractClientBuilder zacd;
	final zaaw zaed;
	private final Lock zaen;
	private final ClientSettings zaes;
	private final Map zaev;
	private final GoogleApiAvailabilityLight zaex;
	final Map zagy;
	private final Condition zahm;
	private final zabg zahn;
	final Map zaho = new HashMap();
	private volatile zabd zahp;
	private ConnectionResult zahq;
	int zahr;
	final zabt zahs;
}
