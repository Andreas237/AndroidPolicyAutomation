// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.*;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.zzg;
import com.google.android.gms.common.zzc;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaau, zzzz, zzzy, zzaak, 
//			zzaam, zzaai, zzaaj, zzaal, 
//			zzabi

public class zzaan
	implements zzaau, zzzz
{
	static abstract class zza
	{

		public final void zzc(zzaan zzaan1)
		{
			zzaan.zza(zzaan1).lock();
		//    0    0:aload_1         
		//    1    1:invokestatic    #22  <Method Lock zzaan.zza(zzaan)>
		//    2    4:invokeinterface #27  <Method void Lock.lock()>
			zzaam zzaam1;
			zzaam zzaam2;
			zzaam1 = zzaan.zzb(zzaan1);
		//    3    9:aload_1         
		//    4   10:invokestatic    #31  <Method zzaam zzaan.zzb(zzaan)>
		//    5   13:astore_2        
			zzaam2 = zzaAL;
		//    6   14:aload_0         
		//    7   15:getfield        #16  <Field zzaam zzaAL>
		//    8   18:astore_3        
			if(zzaam1 != zzaam2)
		//*   9   19:aload_2         
		//*  10   20:aload_3         
		//*  11   21:if_acmpeq       34
			{
				zzaan.zza(zzaan1).unlock();
		//   12   24:aload_1         
		//   13   25:invokestatic    #22  <Method Lock zzaan.zza(zzaan)>
		//   14   28:invokeinterface #34  <Method void Lock.unlock()>
				return;
		//   15   33:return          
			}
			zzvA();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #37  <Method void zzvA()>
			zzaan.zza(zzaan1).unlock();
		//   18   38:aload_1         
		//   19   39:invokestatic    #22  <Method Lock zzaan.zza(zzaan)>
		//   20   42:invokeinterface #34  <Method void Lock.unlock()>
			return;
		//   21   47:return          
			Exception exception;
			exception;
		//   22   48:astore_2        
			zzaan.zza(zzaan1).unlock();
		//   23   49:aload_1         
		//   24   50:invokestatic    #22  <Method Lock zzaan.zza(zzaan)>
		//   25   53:invokeinterface #34  <Method void Lock.unlock()>
			throw exception;
		//   26   58:aload_2         
		//   27   59:athrow          
		}

		protected abstract void zzvA();

		private final zzaam zzaAL;

		protected zza(zzaam zzaam1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			zzaAL = zzaam1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field zzaam zzaAL>
		//    5    9:return          
		}
	}

	final class zzb extends Handler
	{

		public void handleMessage(Message message)
		{
			switch(message.what)
		//*   0    0:aload_1         
		//*   1    1:getfield        #25  <Field int Message.what>
			{
		//*   2    4:tableswitch     1 2: default 28
		//		               1 61
		//		               2 76
			default:
				int i = message.what;
		//    3   28:aload_1         
		//    4   29:getfield        #25  <Field int Message.what>
		//    5   32:istore_2        
				Log.w("GACStateManager", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
		//    6   33:ldc1            #27  <String "GACStateManager">
		//    7   35:new             #29  <Class StringBuilder>
		//    8   38:dup             
		//    9   39:bipush          31
		//   10   41:invokespecial   #32  <Method void StringBuilder(int)>
		//   11   44:ldc1            #34  <String "Unknown message id: ">
		//   12   46:invokevirtual   #38  <Method StringBuilder StringBuilder.append(String)>
		//   13   49:iload_2         
		//   14   50:invokevirtual   #41  <Method StringBuilder StringBuilder.append(int)>
		//   15   53:invokevirtual   #45  <Method String StringBuilder.toString()>
		//   16   56:invokestatic    #51  <Method int Log.w(String, String)>
		//   17   59:pop             
				return;
		//   18   60:return          

			case 1: // '\001'
				((zza)message.obj).zzc(zzaAM);
		//   19   61:aload_1         
		//   20   62:getfield        #55  <Field Object Message.obj>
		//   21   65:checkcast       #57  <Class zzaan$zza>
		//   22   68:aload_0         
		//   23   69:getfield        #13  <Field zzaan zzaAM>
		//   24   72:invokevirtual   #61  <Method void com.google.android.gms.internal.zzaan$zza.zzc(zzaan)>
				return;
		//   25   75:return          

			case 2: // '\002'
				throw (RuntimeException)message.obj;
		//   26   76:aload_1         
		//   27   77:getfield        #55  <Field Object Message.obj>
		//   28   80:checkcast       #63  <Class RuntimeException>
		//   29   83:athrow          
			}
		}

		final zzaan zzaAM;

		zzb(Looper looper)
		{
			zzaAM = zzaan.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzaan zzaAM>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	public zzaan(Context context, zzaal zzaal1, Lock lock, Looper looper, zzc zzc, Map map, zzg zzg, 
			Map map1, com.google.android.gms.common.api.Api.zza zza1, ArrayList arraylist, zzaau.zza zza2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #53  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #54  <Method void HashMap()>
	//    6   12:putfield        #56  <Field Map zzaAG>
		zzaAI = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #58  <Field ConnectionResult zzaAI>
		mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #60  <Field Context mContext>
		zzazn = lock;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #62  <Field Lock zzazn>
		zzazw = zzc;
	//   16   30:aload_0         
	//   17   31:aload           5
	//   18   33:putfield        #64  <Field zzc zzazw>
		zzaAr = map;
	//   19   36:aload_0         
	//   20   37:aload           6
	//   21   39:putfield        #66  <Field Map zzaAr>
		zzazs = zzg;
	//   22   42:aload_0         
	//   23   43:aload           7
	//   24   45:putfield        #68  <Field zzg zzazs>
		zzazu = map1;
	//   25   48:aload_0         
	//   26   49:aload           8
	//   27   51:putfield        #70  <Field Map zzazu>
		zzaxY = zza1;
	//   28   54:aload_0         
	//   29   55:aload           9
	//   30   57:putfield        #72  <Field com.google.android.gms.common.api.Api$zza zzaxY>
		zzazd = zzaal1;
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:putfield        #74  <Field zzaal zzazd>
		zzaAK = zza2;
	//   34   65:aload_0         
	//   35   66:aload           11
	//   36   68:putfield        #76  <Field zzaau$zza zzaAK>
		for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); ((zzzy)((Iterator) (context)).next()).zza(((zzzz) (this))));
	//   37   71:aload           10
	//   38   73:invokevirtual   #82  <Method Iterator ArrayList.iterator()>
	//   39   76:astore_1        
	//   40   77:aload_1         
	//   41   78:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//   42   83:ifeq            102
	//   43   86:aload_1         
	//   44   87:invokeinterface #92  <Method Object Iterator.next()>
	//   45   92:checkcast       #94  <Class zzzy>
	//   46   95:aload_0         
	//   47   96:invokevirtual   #97  <Method void zzzy.zza(zzzz)>
	//*  48   99:goto            77
		zzaAF = new zzb(looper);
	//   49  102:aload_0         
	//   50  103:new             #13  <Class zzaan$zzb>
	//   51  106:dup             
	//   52  107:aload_0         
	//   53  108:aload           4
	//   54  110:invokespecial   #100 <Method void zzaan$zzb(zzaan, Looper)>
	//   55  113:putfield        #102 <Field zzaan$zzb zzaAF>
		zzaAE = lock.newCondition();
	//   56  116:aload_0         
	//   57  117:aload_3         
	//   58  118:invokeinterface #108 <Method Condition Lock.newCondition()>
	//   59  123:putfield        #110 <Field Condition zzaAE>
		zzaAH = ((zzaam) (new zzaak(this)));
	//   60  126:aload_0         
	//   61  127:new             #112 <Class zzaak>
	//   62  130:dup             
	//   63  131:aload_0         
	//   64  132:invokespecial   #115 <Method void zzaak(zzaan)>
	//   65  135:putfield        #117 <Field zzaam zzaAH>
	//   66  138:return          
	}

	static Lock zza(zzaan zzaan1)
	{
		return zzaan1.zzazn;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzazn>
	//    2    4:areturn         
	}

	static zzaam zzb(zzaan zzaan1)
	{
		return zzaan1.zzaAH;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzaam zzaAH>
	//    2    4:areturn         
	}

	public ConnectionResult blockingConnect()
	{
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method void connect()>
		do
		{
			if(!isConnecting())
				break;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #132 <Method boolean isConnecting()>
	//    4    8:ifeq            41
			try
			{
				zzaAE.await();
	//    5   11:aload_0         
	//    6   12:getfield        #110 <Field Condition zzaAE>
	//    7   15:invokeinterface #137 <Method void Condition.await()>
			}
	//*   8   20:goto            4
			catch(InterruptedException interruptedexception)
	//*   9   23:astore_1        
			{
				Thread.currentThread().interrupt();
	//   10   24:invokestatic    #143 <Method Thread Thread.currentThread()>
	//   11   27:invokevirtual   #146 <Method void Thread.interrupt()>
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
	//   12   30:new             #148 <Class ConnectionResult>
	//   13   33:dup             
	//   14   34:bipush          15
	//   15   36:aconst_null     
	//   16   37:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   17   40:areturn         
			}
		} while(true);
		if(isConnected())
	//*  18   41:aload_0         
	//*  19   42:invokevirtual   #154 <Method boolean isConnected()>
	//*  20   45:ifeq            52
			return ConnectionResult.zzawX;
	//   21   48:getstatic       #157 <Field ConnectionResult ConnectionResult.zzawX>
	//   22   51:areturn         
		if(zzaAI != null)
	//*  23   52:aload_0         
	//*  24   53:getfield        #58  <Field ConnectionResult zzaAI>
	//*  25   56:ifnull          64
			return zzaAI;
	//   26   59:aload_0         
	//   27   60:getfield        #58  <Field ConnectionResult zzaAI>
	//   28   63:areturn         
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//   29   64:new             #148 <Class ConnectionResult>
	//   30   67:dup             
	//   31   68:bipush          13
	//   32   70:aconst_null     
	//   33   71:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   34   74:areturn         
	}

	public ConnectionResult blockingConnect(long l, TimeUnit timeunit)
	{
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method void connect()>
		l = timeunit.toNanos(l);
	//    2    4:aload_3         
	//    3    5:lload_1         
	//    4    6:invokevirtual   #164 <Method long TimeUnit.toNanos(long)>
	//    5    9:lstore_1        
_L2:
		if(!isConnecting())
			break; /* Loop/switch isn't completed */
	//    6   10:aload_0         
	//    7   11:invokevirtual   #132 <Method boolean isConnecting()>
	//    8   14:ifeq            70
		if(l > 0L)
			break MISSING_BLOCK_LABEL_38;
	//    9   17:lload_1         
	//   10   18:lconst_0        
	//   11   19:lcmp            
	//   12   20:ifgt            38
		disconnect();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #167 <Method void disconnect()>
		return new ConnectionResult(14, ((android.app.PendingIntent) (null)));
	//   15   27:new             #148 <Class ConnectionResult>
	//   16   30:dup             
	//   17   31:bipush          14
	//   18   33:aconst_null     
	//   19   34:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   20   37:areturn         
		l = zzaAE.awaitNanos(l);
	//   21   38:aload_0         
	//   22   39:getfield        #110 <Field Condition zzaAE>
	//   23   42:lload_1         
	//   24   43:invokeinterface #170 <Method long Condition.awaitNanos(long)>
	//   25   48:lstore_1        
		if(true) goto _L2; else goto _L1
	//   26   49:goto            10
		timeunit;
	//   27   52:astore_3        
		Thread.currentThread().interrupt();
	//   28   53:invokestatic    #143 <Method Thread Thread.currentThread()>
	//   29   56:invokevirtual   #146 <Method void Thread.interrupt()>
		return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
	//   30   59:new             #148 <Class ConnectionResult>
	//   31   62:dup             
	//   32   63:bipush          15
	//   33   65:aconst_null     
	//   34   66:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   35   69:areturn         
_L1:
		if(isConnected())
	//*  36   70:aload_0         
	//*  37   71:invokevirtual   #154 <Method boolean isConnected()>
	//*  38   74:ifeq            81
			return ConnectionResult.zzawX;
	//   39   77:getstatic       #157 <Field ConnectionResult ConnectionResult.zzawX>
	//   40   80:areturn         
		if(zzaAI != null)
	//*  41   81:aload_0         
	//*  42   82:getfield        #58  <Field ConnectionResult zzaAI>
	//*  43   85:ifnull          93
			return zzaAI;
	//   44   88:aload_0         
	//   45   89:getfield        #58  <Field ConnectionResult zzaAI>
	//   46   92:areturn         
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//   47   93:new             #148 <Class ConnectionResult>
	//   48   96:dup             
	//   49   97:bipush          13
	//   50   99:aconst_null     
	//   51  100:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   52  103:areturn         
	}

	public void connect()
	{
		zzaAH.connect();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzaam zzaAH>
	//    2    4:invokeinterface #173 <Method void zzaam.connect()>
	//    3    9:return          
	}

	public void disconnect()
	{
		if(zzaAH.disconnect())
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field zzaam zzaAH>
	//*   2    4:invokeinterface #175 <Method boolean zzaam.disconnect()>
	//*   3    9:ifeq            21
			zzaAG.clear();
	//    4   12:aload_0         
	//    5   13:getfield        #56  <Field Map zzaAG>
	//    6   16:invokeinterface #180 <Method void Map.clear()>
	//    7   21:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		String s1 = String.valueOf(((Object) (s))).concat("  ");
	//    0    0:aload_1         
	//    1    1:invokestatic    #188 <Method String String.valueOf(Object)>
	//    2    4:ldc1            #190 <String "  ">
	//    3    6:invokevirtual   #194 <Method String String.concat(String)>
	//    4    9:astore          5
		printwriter.append(((CharSequence) (s))).append("mState=").println(((Object) (zzaAH)));
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #200 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    8   16:ldc1            #202 <String "mState=">
	//    9   18:invokevirtual   #200 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   10   21:aload_0         
	//   11   22:getfield        #117 <Field zzaam zzaAH>
	//   12   25:invokevirtual   #206 <Method void PrintWriter.println(Object)>
		Api api;
		for(Iterator iterator = zzazu.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)zzaAr.get(((Object) (api.zzuH())))).dump(s1, filedescriptor, printwriter, as))
	//*  13   28:aload_0         
	//*  14   29:getfield        #70  <Field Map zzazu>
	//*  15   32:invokeinterface #210 <Method Set Map.keySet()>
	//*  16   37:invokeinterface #213 <Method Iterator Set.iterator()>
	//*  17   42:astore          6
	//*  18   44:aload           6
	//*  19   46:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//*  20   51:ifeq            115
		{
			api = (Api)iterator.next();
	//   21   54:aload           6
	//   22   56:invokeinterface #92  <Method Object Iterator.next()>
	//   23   61:checkcast       #215 <Class Api>
	//   24   64:astore          7
			printwriter.append(((CharSequence) (s))).append(((CharSequence) (api.getName()))).println(":");
	//   25   66:aload_3         
	//   26   67:aload_1         
	//   27   68:invokevirtual   #200 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   28   71:aload           7
	//   29   73:invokevirtual   #219 <Method String Api.getName()>
	//   30   76:invokevirtual   #200 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   31   79:ldc1            #221 <String ":">
	//   32   81:invokevirtual   #224 <Method void PrintWriter.println(String)>
		}

	//   33   84:aload_0         
	//   34   85:getfield        #66  <Field Map zzaAr>
	//   35   88:aload           7
	//   36   90:invokevirtual   #228 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//   37   93:invokeinterface #232 <Method Object Map.get(Object)>
	//   38   98:checkcast       #234 <Class com.google.android.gms.common.api.Api$zze>
	//   39  101:aload           5
	//   40  103:aload_2         
	//   41  104:aload_3         
	//   42  105:aload           4
	//   43  107:invokeinterface #236 <Method void com.google.android.gms.common.api.Api$zze.dump(String, FileDescriptor, PrintWriter, String[])>
	//*  44  112:goto            44
	//   45  115:return          
	}

	public ConnectionResult getConnectionResult(Api api)
	{
		api = ((Api) (api.zzuH()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #228 <Method com.google.android.gms.common.api.Api$zzc Api.zzuH()>
	//    2    4:astore_1        
		if(zzaAr.containsKey(((Object) (api))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #66  <Field Map zzaAr>
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #244 <Method boolean Map.containsKey(Object)>
	//*   7   15:ifeq            70
		{
			if(((com.google.android.gms.common.api.Api.zze)zzaAr.get(((Object) (api)))).isConnected())
	//*   8   18:aload_0         
	//*   9   19:getfield        #66  <Field Map zzaAr>
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #232 <Method Object Map.get(Object)>
	//*  12   28:checkcast       #234 <Class com.google.android.gms.common.api.Api$zze>
	//*  13   31:invokeinterface #245 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
	//*  14   36:ifeq            43
				return ConnectionResult.zzawX;
	//   15   39:getstatic       #157 <Field ConnectionResult ConnectionResult.zzawX>
	//   16   42:areturn         
			if(zzaAG.containsKey(((Object) (api))))
	//*  17   43:aload_0         
	//*  18   44:getfield        #56  <Field Map zzaAG>
	//*  19   47:aload_1         
	//*  20   48:invokeinterface #244 <Method boolean Map.containsKey(Object)>
	//*  21   53:ifeq            70
				return (ConnectionResult)zzaAG.get(((Object) (api)));
	//   22   56:aload_0         
	//   23   57:getfield        #56  <Field Map zzaAG>
	//   24   60:aload_1         
	//   25   61:invokeinterface #232 <Method Object Map.get(Object)>
	//   26   66:checkcast       #148 <Class ConnectionResult>
	//   27   69:areturn         
		}
		return null;
	//   28   70:aconst_null     
	//   29   71:areturn         
	}

	public boolean isConnected()
	{
		return zzaAH instanceof zzaai;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzaam zzaAH>
	//    2    4:instanceof      #250 <Class zzaai>
	//    3    7:ireturn         
	}

	public boolean isConnecting()
	{
		return zzaAH instanceof zzaaj;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzaam zzaAH>
	//    2    4:instanceof      #252 <Class zzaaj>
	//    3    7:ireturn         
	}

	public void onConnected(Bundle bundle)
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzazn>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaAH.onConnected(bundle);
	//    3    9:aload_0         
	//    4   10:getfield        #117 <Field zzaam zzaAH>
	//    5   13:aload_1         
	//    6   14:invokeinterface #259 <Method void zzaam.onConnected(Bundle)>
		zzazn.unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #62  <Field Lock zzazn>
	//    9   23:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   10   28:return          
		bundle;
	//   11   29:astore_1        
		zzazn.unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #62  <Field Lock zzazn>
	//   14   34:invokeinterface #262 <Method void Lock.unlock()>
		throw bundle;
	//   15   39:aload_1         
	//   16   40:athrow          
	}

	public void onConnectionSuspended(int i)
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzazn>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaAH.onConnectionSuspended(i);
	//    3    9:aload_0         
	//    4   10:getfield        #117 <Field zzaam zzaAH>
	//    5   13:iload_1         
	//    6   14:invokeinterface #266 <Method void zzaam.onConnectionSuspended(int)>
		zzazn.unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #62  <Field Lock zzazn>
	//    9   23:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   10   28:return          
		Exception exception;
		exception;
	//   11   29:astore_2        
		zzazn.unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #62  <Field Lock zzazn>
	//   14   34:invokeinterface #262 <Method void Lock.unlock()>
		throw exception;
	//   15   39:aload_2         
	//   16   40:athrow          
	}

	public zzzv.zza zza(zzzv.zza zza1)
	{
		zza1.zzvf();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #272 <Method void zzzv$zza.zzvf()>
		return zzaAH.zza(zza1);
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field zzaam zzaAH>
	//    4    8:aload_1         
	//    5    9:invokeinterface #274 <Method zzzv$zza zzaam.zza(zzzv$zza)>
	//    6   14:areturn         
	}

	public void zza(ConnectionResult connectionresult, Api api, int i)
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzazn>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaAH.zza(connectionresult, api, i);
	//    3    9:aload_0         
	//    4   10:getfield        #117 <Field zzaam zzaAH>
	//    5   13:aload_1         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:invokeinterface #278 <Method void zzaam.zza(ConnectionResult, Api, int)>
		zzazn.unlock();
	//    9   21:aload_0         
	//   10   22:getfield        #62  <Field Lock zzazn>
	//   11   25:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   12   30:return          
		connectionresult;
	//   13   31:astore_1        
		zzazn.unlock();
	//   14   32:aload_0         
	//   15   33:getfield        #62  <Field Lock zzazn>
	//   16   36:invokeinterface #262 <Method void Lock.unlock()>
		throw connectionresult;
	//   17   41:aload_1         
	//   18   42:athrow          
	}

	void zza(zza zza1)
	{
		zza1 = ((zza) (zzaAF.obtainMessage(1, ((Object) (zza1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field zzaan$zzb zzaAF>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #284 <Method Message zzaan$zzb.obtainMessage(int, Object)>
	//    5    9:astore_1        
		zzaAF.sendMessage(((Message) (zza1)));
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field zzaan$zzb zzaAF>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #288 <Method boolean zzaan$zzb.sendMessage(Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	void zza(RuntimeException runtimeexception)
	{
		runtimeexception = ((RuntimeException) (zzaAF.obtainMessage(2, ((Object) (runtimeexception)))));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field zzaan$zzb zzaAF>
	//    2    4:iconst_2        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #284 <Method Message zzaan$zzb.obtainMessage(int, Object)>
	//    5    9:astore_1        
		zzaAF.sendMessage(((Message) (runtimeexception)));
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field zzaan$zzb zzaAF>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #288 <Method boolean zzaan$zzb.sendMessage(Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	public boolean zza(zzabi zzabi)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public zzzv.zza zzb(zzzv.zza zza1)
	{
		zza1.zzvf();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #272 <Method void zzzv$zza.zzvf()>
		return zzaAH.zzb(zza1);
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field zzaam zzaAH>
	//    4    8:aload_1         
	//    5    9:invokeinterface #292 <Method zzzv$zza zzaam.zzb(zzzv$zza)>
	//    6   14:areturn         
	}

	void zzh(ConnectionResult connectionresult)
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzazn>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaAI = connectionresult;
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:putfield        #58  <Field ConnectionResult zzaAI>
		zzaAH = ((zzaam) (new zzaak(this)));
	//    6   14:aload_0         
	//    7   15:new             #112 <Class zzaak>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #115 <Method void zzaak(zzaan)>
	//   11   23:putfield        #117 <Field zzaam zzaAH>
		zzaAH.begin();
	//   12   26:aload_0         
	//   13   27:getfield        #117 <Field zzaam zzaAH>
	//   14   30:invokeinterface #298 <Method void zzaam.begin()>
		zzaAE.signalAll();
	//   15   35:aload_0         
	//   16   36:getfield        #110 <Field Condition zzaAE>
	//   17   39:invokeinterface #301 <Method void Condition.signalAll()>
		zzazn.unlock();
	//   18   44:aload_0         
	//   19   45:getfield        #62  <Field Lock zzazn>
	//   20   48:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   21   53:return          
		connectionresult;
	//   22   54:astore_1        
		zzazn.unlock();
	//   23   55:aload_0         
	//   24   56:getfield        #62  <Field Lock zzazn>
	//   25   59:invokeinterface #262 <Method void Lock.unlock()>
		throw connectionresult;
	//   26   64:aload_1         
	//   27   65:athrow          
	}

	public void zzuN()
	{
	//    0    0:return          
	}

	void zzvO()
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzazn>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaAH = ((zzaam) (new zzaaj(this, zzazs, zzazu, zzazw, zzaxY, zzazn, mContext)));
	//    3    9:aload_0         
	//    4   10:new             #252 <Class zzaaj>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field zzg zzazs>
	//    9   19:aload_0         
	//   10   20:getfield        #70  <Field Map zzazu>
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field zzc zzazw>
	//   13   27:aload_0         
	//   14   28:getfield        #72  <Field com.google.android.gms.common.api.Api$zza zzaxY>
	//   15   31:aload_0         
	//   16   32:getfield        #62  <Field Lock zzazn>
	//   17   35:aload_0         
	//   18   36:getfield        #60  <Field Context mContext>
	//   19   39:invokespecial   #306 <Method void zzaaj(zzaan, zzg, Map, zzc, com.google.android.gms.common.api.Api$zza, Lock, Context)>
	//   20   42:putfield        #117 <Field zzaam zzaAH>
		zzaAH.begin();
	//   21   45:aload_0         
	//   22   46:getfield        #117 <Field zzaam zzaAH>
	//   23   49:invokeinterface #298 <Method void zzaam.begin()>
		zzaAE.signalAll();
	//   24   54:aload_0         
	//   25   55:getfield        #110 <Field Condition zzaAE>
	//   26   58:invokeinterface #301 <Method void Condition.signalAll()>
		zzazn.unlock();
	//   27   63:aload_0         
	//   28   64:getfield        #62  <Field Lock zzazn>
	//   29   67:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   30   72:return          
		Exception exception;
		exception;
	//   31   73:astore_1        
		zzazn.unlock();
	//   32   74:aload_0         
	//   33   75:getfield        #62  <Field Lock zzazn>
	//   34   78:invokeinterface #262 <Method void Lock.unlock()>
		throw exception;
	//   35   83:aload_1         
	//   36   84:athrow          
	}

	void zzvP()
	{
		zzazn.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzazn>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzazd.zzvL();
	//    3    9:aload_0         
	//    4   10:getfield        #74  <Field zzaal zzazd>
	//    5   13:invokevirtual   #312 <Method boolean zzaal.zzvL()>
	//    6   16:pop             
		zzaAH = ((zzaam) (new zzaai(this)));
	//    7   17:aload_0         
	//    8   18:new             #250 <Class zzaai>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #313 <Method void zzaai(zzaan)>
	//   12   26:putfield        #117 <Field zzaam zzaAH>
		zzaAH.begin();
	//   13   29:aload_0         
	//   14   30:getfield        #117 <Field zzaam zzaAH>
	//   15   33:invokeinterface #298 <Method void zzaam.begin()>
		zzaAE.signalAll();
	//   16   38:aload_0         
	//   17   39:getfield        #110 <Field Condition zzaAE>
	//   18   42:invokeinterface #301 <Method void Condition.signalAll()>
		zzazn.unlock();
	//   19   47:aload_0         
	//   20   48:getfield        #62  <Field Lock zzazn>
	//   21   51:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   22   56:return          
		Exception exception;
		exception;
	//   23   57:astore_1        
		zzazn.unlock();
	//   24   58:aload_0         
	//   25   59:getfield        #62  <Field Lock zzazn>
	//   26   62:invokeinterface #262 <Method void Lock.unlock()>
		throw exception;
	//   27   67:aload_1         
	//   28   68:athrow          
	}

	void zzvQ()
	{
		for(Iterator iterator = zzaAr.values().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)iterator.next()).disconnect());
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Map zzaAr>
	//    2    4:invokeinterface #318 <Method Collection Map.values()>
	//    3    9:invokeinterface #321 <Method Iterator Collection.iterator()>
	//    4   14:astore_1        
	//    5   15:aload_1         
	//    6   16:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            41
	//    8   24:aload_1         
	//    9   25:invokeinterface #92  <Method Object Iterator.next()>
	//   10   30:checkcast       #234 <Class com.google.android.gms.common.api.Api$zze>
	//   11   33:invokeinterface #322 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
	//*  12   38:goto            15
	//   13   41:return          
	}

	public void zzvj()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method boolean isConnected()>
	//*   2    4:ifeq            17
			((zzaai)zzaAH).zzvz();
	//    3    7:aload_0         
	//    4    8:getfield        #117 <Field zzaam zzaAH>
	//    5   11:checkcast       #250 <Class zzaai>
	//    6   14:invokevirtual   #326 <Method void zzaai.zzvz()>
	//    7   17:return          
	}

	private final Context mContext;
	private final Condition zzaAE;
	private final zzb zzaAF;
	final Map zzaAG = new HashMap();
	private volatile zzaam zzaAH;
	private ConnectionResult zzaAI;
	int zzaAJ;
	final zzaau.zza zzaAK;
	final Map zzaAr;
	final com.google.android.gms.common.api.Api.zza zzaxY;
	final zzaal zzazd;
	private final Lock zzazn;
	final zzg zzazs;
	final Map zzazu;
	private final zzc zzazw;
}
