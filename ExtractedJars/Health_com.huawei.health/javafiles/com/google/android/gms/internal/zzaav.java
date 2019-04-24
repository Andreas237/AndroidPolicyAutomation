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
import com.google.android.gms.common.zze;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

// Referenced classes of package com.google.android.gms.internal:
//			zzaah, zzabc, zzaag, zzaas, 
//			zzaau, zzaaq, zzaar, zzaat, 
//			zzabq

public class zzaav
	implements zzaah, zzabc
{
	static abstract class zza
	{

		public final void zzc(zzaav zzaav1)
		{
			zzaav.zza(zzaav1).lock();
		//    0    0:aload_1         
		//    1    1:invokestatic    #22  <Method Lock zzaav.zza(zzaav)>
		//    2    4:invokeinterface #27  <Method void Lock.lock()>
			zzaau zzaau1;
			zzaau zzaau2;
			zzaau1 = zzaav.zzb(zzaav1);
		//    3    9:aload_1         
		//    4   10:invokestatic    #31  <Method zzaau zzaav.zzb(zzaav)>
		//    5   13:astore_2        
			zzaau2 = zzaCk;
		//    6   14:aload_0         
		//    7   15:getfield        #16  <Field zzaau zzaCk>
		//    8   18:astore_3        
			if(zzaau1 != zzaau2)
		//*   9   19:aload_2         
		//*  10   20:aload_3         
		//*  11   21:if_acmpeq       34
			{
				zzaav.zza(zzaav1).unlock();
		//   12   24:aload_1         
		//   13   25:invokestatic    #22  <Method Lock zzaav.zza(zzaav)>
		//   14   28:invokeinterface #34  <Method void Lock.unlock()>
				return;
		//   15   33:return          
			}
			zzwe();
		//   16   34:aload_0         
		//   17   35:invokevirtual   #37  <Method void zzwe()>
			zzaav.zza(zzaav1).unlock();
		//   18   38:aload_1         
		//   19   39:invokestatic    #22  <Method Lock zzaav.zza(zzaav)>
		//   20   42:invokeinterface #34  <Method void Lock.unlock()>
			return;
		//   21   47:return          
			Exception exception;
			exception;
		//   22   48:astore_2        
			zzaav.zza(zzaav1).unlock();
		//   23   49:aload_1         
		//   24   50:invokestatic    #22  <Method Lock zzaav.zza(zzaav)>
		//   25   53:invokeinterface #34  <Method void Lock.unlock()>
			throw exception;
		//   26   58:aload_2         
		//   27   59:athrow          
		}

		protected abstract void zzwe();

		private final zzaau zzaCk;

		protected zza(zzaau zzaau1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void Object()>
			zzaCk = zzaau1;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #16  <Field zzaau zzaCk>
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
		//*   2    4:lookupswitch    2: default 32
		//		               1: 35
		//		               2: 50
		//*   3   32:goto            58
			case 1: // '\001'
				((zza)message.obj).zzc(zzaCl);
		//    4   35:aload_1         
		//    5   36:getfield        #29  <Field Object Message.obj>
		//    6   39:checkcast       #31  <Class zzaav$zza>
		//    7   42:aload_0         
		//    8   43:getfield        #13  <Field zzaav zzaCl>
		//    9   46:invokevirtual   #35  <Method void zzaav$zza.zzc(zzaav)>
				return;
		//   10   49:return          

			case 2: // '\002'
				throw (RuntimeException)message.obj;
		//   11   50:aload_1         
		//   12   51:getfield        #29  <Field Object Message.obj>
		//   13   54:checkcast       #37  <Class RuntimeException>
		//   14   57:athrow          
			}
			int i = message.what;
		//   15   58:aload_1         
		//   16   59:getfield        #25  <Field int Message.what>
		//   17   62:istore_2        
			Log.w("GACStateManager", (new StringBuilder(31)).append("Unknown message id: ").append(i).toString());
		//   18   63:ldc1            #39  <String "GACStateManager">
		//   19   65:new             #41  <Class StringBuilder>
		//   20   68:dup             
		//   21   69:bipush          31
		//   22   71:invokespecial   #44  <Method void StringBuilder(int)>
		//   23   74:ldc1            #46  <String "Unknown message id: ">
		//   24   76:invokevirtual   #50  <Method StringBuilder StringBuilder.append(String)>
		//   25   79:iload_2         
		//   26   80:invokevirtual   #53  <Method StringBuilder StringBuilder.append(int)>
		//   27   83:invokevirtual   #57  <Method String StringBuilder.toString()>
		//   28   86:invokestatic    #63  <Method int Log.w(String, String)>
		//   29   89:pop             
		//   30   90:return          
		}

		final zzaav zzaCl;

		zzb(Looper looper)
		{
			zzaCl = zzaav.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field zzaav zzaCl>
			super(looper);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void Handler(Looper)>
		//    6   10:return          
		}
	}


	public zzaav(Context context, zzaat zzaat1, Lock lock, Looper looper, zze zze, Map map, zzg zzg, 
			Map map1, com.google.android.gms.common.api.Api.zza zza1, ArrayList arraylist, zzabc.zza zza2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #53  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #54  <Method void HashMap()>
	//    6   12:putfield        #56  <Field Map zzaCf>
		zzaCh = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #58  <Field ConnectionResult zzaCh>
		mContext = context;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #60  <Field Context mContext>
		zzaAG = lock;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #62  <Field Lock zzaAG>
		zzaAQ = zze;
	//   16   30:aload_0         
	//   17   31:aload           5
	//   18   33:putfield        #64  <Field zze zzaAQ>
		zzaBQ = map;
	//   19   36:aload_0         
	//   20   37:aload           6
	//   21   39:putfield        #66  <Field Map zzaBQ>
		zzaAL = zzg;
	//   22   42:aload_0         
	//   23   43:aload           7
	//   24   45:putfield        #68  <Field zzg zzaAL>
		zzaAO = map1;
	//   25   48:aload_0         
	//   26   49:aload           8
	//   27   51:putfield        #70  <Field Map zzaAO>
		zzazo = zza1;
	//   28   54:aload_0         
	//   29   55:aload           9
	//   30   57:putfield        #72  <Field com.google.android.gms.common.api.Api$zza zzazo>
		zzaAw = zzaat1;
	//   31   60:aload_0         
	//   32   61:aload_2         
	//   33   62:putfield        #74  <Field zzaat zzaAw>
		zzaCj = zza2;
	//   34   65:aload_0         
	//   35   66:aload           11
	//   36   68:putfield        #76  <Field zzabc$zza zzaCj>
		for(context = ((Context) (arraylist.iterator())); ((Iterator) (context)).hasNext(); ((zzaag)((Iterator) (context)).next()).zza(((zzaah) (this))));
	//   37   71:aload           10
	//   38   73:invokevirtual   #82  <Method Iterator ArrayList.iterator()>
	//   39   76:astore_1        
	//   40   77:aload_1         
	//   41   78:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//   42   83:ifeq            102
	//   43   86:aload_1         
	//   44   87:invokeinterface #92  <Method Object Iterator.next()>
	//   45   92:checkcast       #94  <Class zzaag>
	//   46   95:aload_0         
	//   47   96:invokevirtual   #97  <Method void zzaag.zza(zzaah)>
	//*  48   99:goto            77
		zzaCe = new zzb(looper);
	//   49  102:aload_0         
	//   50  103:new             #13  <Class zzaav$zzb>
	//   51  106:dup             
	//   52  107:aload_0         
	//   53  108:aload           4
	//   54  110:invokespecial   #100 <Method void zzaav$zzb(zzaav, Looper)>
	//   55  113:putfield        #102 <Field zzaav$zzb zzaCe>
		zzaCd = lock.newCondition();
	//   56  116:aload_0         
	//   57  117:aload_3         
	//   58  118:invokeinterface #108 <Method Condition Lock.newCondition()>
	//   59  123:putfield        #110 <Field Condition zzaCd>
		zzaCg = ((zzaau) (new zzaas(this)));
	//   60  126:aload_0         
	//   61  127:new             #112 <Class zzaas>
	//   62  130:dup             
	//   63  131:aload_0         
	//   64  132:invokespecial   #115 <Method void zzaas(zzaav)>
	//   65  135:putfield        #117 <Field zzaau zzaCg>
	//   66  138:return          
	}

	static Lock zza(zzaav zzaav1)
	{
		return zzaav1.zzaAG;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzaAG>
	//    2    4:areturn         
	}

	static zzaau zzb(zzaav zzaav1)
	{
		return zzaav1.zzaCg;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzaau zzaCg>
	//    2    4:areturn         
	}

	public ConnectionResult blockingConnect()
	{
		InterruptedException interruptedexception;
		connect();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #129 <Method void connect()>
		do
		{
			if(!isConnecting())
				break;
	//    2    4:aload_0         
	//    3    5:invokevirtual   #132 <Method boolean isConnecting()>
	//    4    8:ifeq            40
			try
			{
				zzaCd.await();
	//    5   11:aload_0         
	//    6   12:getfield        #110 <Field Condition zzaCd>
	//    7   15:invokeinterface #137 <Method void Condition.await()>
			}
	//*   8   20:goto            4
	//*   9   23:invokestatic    #143 <Method Thread Thread.currentThread()>
	//*  10   26:invokevirtual   #146 <Method void Thread.interrupt()>
	//*  11   29:new             #148 <Class ConnectionResult>
	//*  12   32:dup             
	//*  13   33:bipush          15
	//*  14   35:aconst_null     
	//*  15   36:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  16   39:areturn         
	//*  17   40:aload_0         
	//*  18   41:invokevirtual   #154 <Method boolean isConnected()>
	//*  19   44:ifeq            51
	//*  20   47:getstatic       #157 <Field ConnectionResult ConnectionResult.zzayj>
	//*  21   50:areturn         
	//*  22   51:aload_0         
	//*  23   52:getfield        #58  <Field ConnectionResult zzaCh>
	//*  24   55:ifnull          63
	//*  25   58:aload_0         
	//*  26   59:getfield        #58  <Field ConnectionResult zzaCh>
	//*  27   62:areturn         
	//*  28   63:new             #148 <Class ConnectionResult>
	//*  29   66:dup             
	//*  30   67:bipush          13
	//*  31   69:aconst_null     
	//*  32   70:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  33   73:areturn         
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				Thread.currentThread().interrupt();
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
			}
		} while(true);
		if(isConnected())
			return ConnectionResult.zzayj;
		if(zzaCh != null)
			return zzaCh;
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//*  34   74:astore_1        
	//*  35   75:goto            23
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
	//    8   14:ifeq            71
		if(l <= 0L)
	//*   9   17:lload_1         
	//*  10   18:lconst_0        
	//*  11   19:lcmp            
	//*  12   20:ifgt            40
		{
			try
			{
				disconnect();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #167 <Method void disconnect()>
				timeunit = ((TimeUnit) (new ConnectionResult(14, ((android.app.PendingIntent) (null)))));
	//   15   27:new             #148 <Class ConnectionResult>
	//   16   30:dup             
	//   17   31:bipush          14
	//   18   33:aconst_null     
	//   19   34:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//   20   37:astore_3        
			}
	//*  21   38:aload_3         
	//*  22   39:areturn         
	//*  23   40:aload_0         
	//*  24   41:getfield        #110 <Field Condition zzaCd>
	//*  25   44:lload_1         
	//*  26   45:invokeinterface #170 <Method long Condition.awaitNanos(long)>
	//*  27   50:lstore_1        
	//*  28   51:goto            10
	//*  29   54:invokestatic    #143 <Method Thread Thread.currentThread()>
	//*  30   57:invokevirtual   #146 <Method void Thread.interrupt()>
	//*  31   60:new             #148 <Class ConnectionResult>
	//*  32   63:dup             
	//*  33   64:bipush          15
	//*  34   66:aconst_null     
	//*  35   67:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  36   70:areturn         
	//*  37   71:aload_0         
	//*  38   72:invokevirtual   #154 <Method boolean isConnected()>
	//*  39   75:ifeq            82
	//*  40   78:getstatic       #157 <Field ConnectionResult ConnectionResult.zzayj>
	//*  41   81:areturn         
	//*  42   82:aload_0         
	//*  43   83:getfield        #58  <Field ConnectionResult zzaCh>
	//*  44   86:ifnull          94
	//*  45   89:aload_0         
	//*  46   90:getfield        #58  <Field ConnectionResult zzaCh>
	//*  47   93:areturn         
	//*  48   94:new             #148 <Class ConnectionResult>
	//*  49   97:dup             
	//*  50   98:bipush          13
	//*  51  100:aconst_null     
	//*  52  101:invokespecial   #151 <Method void ConnectionResult(int, android.app.PendingIntent)>
	//*  53  104:areturn         
			// Misplaced declaration of an exception variable
			catch(TimeUnit timeunit)
			{
				Thread.currentThread().interrupt();
				return new ConnectionResult(15, ((android.app.PendingIntent) (null)));
			}
			return ((ConnectionResult) (timeunit));
		}
		l = zzaCd.awaitNanos(l);
		if(true) goto _L2; else goto _L1
_L1:
		if(isConnected())
			return ConnectionResult.zzayj;
		if(zzaCh != null)
			return zzaCh;
		else
			return new ConnectionResult(13, ((android.app.PendingIntent) (null)));
	//*  54  105:astore_3        
	//*  55  106:goto            54
	}

	public void connect()
	{
		zzaCg.connect();
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzaau zzaCg>
	//    2    4:invokeinterface #173 <Method void zzaau.connect()>
	//    3    9:return          
	}

	public void disconnect()
	{
		if(zzaCg.disconnect())
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field zzaau zzaCg>
	//*   2    4:invokeinterface #175 <Method boolean zzaau.disconnect()>
	//*   3    9:ifeq            21
			zzaCf.clear();
	//    4   12:aload_0         
	//    5   13:getfield        #56  <Field Map zzaCf>
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
		printwriter.append(((CharSequence) (s))).append("mState=").println(((Object) (zzaCg)));
	//    5   11:aload_3         
	//    6   12:aload_1         
	//    7   13:invokevirtual   #200 <Method PrintWriter PrintWriter.append(CharSequence)>
	//    8   16:ldc1            #202 <String "mState=">
	//    9   18:invokevirtual   #200 <Method PrintWriter PrintWriter.append(CharSequence)>
	//   10   21:aload_0         
	//   11   22:getfield        #117 <Field zzaau zzaCg>
	//   12   25:invokevirtual   #206 <Method void PrintWriter.println(Object)>
		Api api;
		for(Iterator iterator = zzaAO.keySet().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)zzaBQ.get(((Object) (api.zzvg())))).dump(s1, filedescriptor, printwriter, as))
	//*  13   28:aload_0         
	//*  14   29:getfield        #70  <Field Map zzaAO>
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
	//   34   85:getfield        #66  <Field Map zzaBQ>
	//   35   88:aload           7
	//   36   90:invokevirtual   #228 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
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
		api = ((Api) (api.zzvg()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #228 <Method com.google.android.gms.common.api.Api$zzc Api.zzvg()>
	//    2    4:astore_1        
		if(zzaBQ.containsKey(((Object) (api))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #66  <Field Map zzaBQ>
	//*   5    9:aload_1         
	//*   6   10:invokeinterface #244 <Method boolean Map.containsKey(Object)>
	//*   7   15:ifeq            70
		{
			if(((com.google.android.gms.common.api.Api.zze)zzaBQ.get(((Object) (api)))).isConnected())
	//*   8   18:aload_0         
	//*   9   19:getfield        #66  <Field Map zzaBQ>
	//*  10   22:aload_1         
	//*  11   23:invokeinterface #232 <Method Object Map.get(Object)>
	//*  12   28:checkcast       #234 <Class com.google.android.gms.common.api.Api$zze>
	//*  13   31:invokeinterface #245 <Method boolean com.google.android.gms.common.api.Api$zze.isConnected()>
	//*  14   36:ifeq            43
				return ConnectionResult.zzayj;
	//   15   39:getstatic       #157 <Field ConnectionResult ConnectionResult.zzayj>
	//   16   42:areturn         
			if(zzaCf.containsKey(((Object) (api))))
	//*  17   43:aload_0         
	//*  18   44:getfield        #56  <Field Map zzaCf>
	//*  19   47:aload_1         
	//*  20   48:invokeinterface #244 <Method boolean Map.containsKey(Object)>
	//*  21   53:ifeq            70
				return (ConnectionResult)zzaCf.get(((Object) (api)));
	//   22   56:aload_0         
	//   23   57:getfield        #56  <Field Map zzaCf>
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
		return zzaCg instanceof zzaaq;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzaau zzaCg>
	//    2    4:instanceof      #250 <Class zzaaq>
	//    3    7:ireturn         
	}

	public boolean isConnecting()
	{
		return zzaCg instanceof zzaar;
	//    0    0:aload_0         
	//    1    1:getfield        #117 <Field zzaau zzaCg>
	//    2    4:instanceof      #252 <Class zzaar>
	//    3    7:ireturn         
	}

	public void onConnected(Bundle bundle)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzaAG>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaCg.onConnected(bundle);
	//    3    9:aload_0         
	//    4   10:getfield        #117 <Field zzaau zzaCg>
	//    5   13:aload_1         
	//    6   14:invokeinterface #259 <Method void zzaau.onConnected(Bundle)>
		zzaAG.unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #62  <Field Lock zzaAG>
	//    9   23:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   10   28:return          
		bundle;
	//   11   29:astore_1        
		zzaAG.unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #62  <Field Lock zzaAG>
	//   14   34:invokeinterface #262 <Method void Lock.unlock()>
		throw bundle;
	//   15   39:aload_1         
	//   16   40:athrow          
	}

	public void onConnectionSuspended(int i)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzaAG>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaCg.onConnectionSuspended(i);
	//    3    9:aload_0         
	//    4   10:getfield        #117 <Field zzaau zzaCg>
	//    5   13:iload_1         
	//    6   14:invokeinterface #266 <Method void zzaau.onConnectionSuspended(int)>
		zzaAG.unlock();
	//    7   19:aload_0         
	//    8   20:getfield        #62  <Field Lock zzaAG>
	//    9   23:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   10   28:return          
		Exception exception;
		exception;
	//   11   29:astore_2        
		zzaAG.unlock();
	//   12   30:aload_0         
	//   13   31:getfield        #62  <Field Lock zzaAG>
	//   14   34:invokeinterface #262 <Method void Lock.unlock()>
		throw exception;
	//   15   39:aload_2         
	//   16   40:athrow          
	}

	public zzaad.zza zza(zzaad.zza zza1)
	{
		zza1.zzvI();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #272 <Method void zzaad$zza.zzvI()>
		return zzaCg.zza(zza1);
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field zzaau zzaCg>
	//    4    8:aload_1         
	//    5    9:invokeinterface #274 <Method zzaad$zza zzaau.zza(zzaad$zza)>
	//    6   14:areturn         
	}

	public void zza(ConnectionResult connectionresult, Api api, boolean flag)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzaAG>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaCg.zza(connectionresult, api, flag);
	//    3    9:aload_0         
	//    4   10:getfield        #117 <Field zzaau zzaCg>
	//    5   13:aload_1         
	//    6   14:aload_2         
	//    7   15:iload_3         
	//    8   16:invokeinterface #278 <Method void zzaau.zza(ConnectionResult, Api, boolean)>
		zzaAG.unlock();
	//    9   21:aload_0         
	//   10   22:getfield        #62  <Field Lock zzaAG>
	//   11   25:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   12   30:return          
		connectionresult;
	//   13   31:astore_1        
		zzaAG.unlock();
	//   14   32:aload_0         
	//   15   33:getfield        #62  <Field Lock zzaAG>
	//   16   36:invokeinterface #262 <Method void Lock.unlock()>
		throw connectionresult;
	//   17   41:aload_1         
	//   18   42:athrow          
	}

	void zza(zza zza1)
	{
		zza1 = ((zza) (zzaCe.obtainMessage(1, ((Object) (zza1)))));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field zzaav$zzb zzaCe>
	//    2    4:iconst_1        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #284 <Method Message zzaav$zzb.obtainMessage(int, Object)>
	//    5    9:astore_1        
		zzaCe.sendMessage(((Message) (zza1)));
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field zzaav$zzb zzaCe>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #288 <Method boolean zzaav$zzb.sendMessage(Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	void zza(RuntimeException runtimeexception)
	{
		runtimeexception = ((RuntimeException) (zzaCe.obtainMessage(2, ((Object) (runtimeexception)))));
	//    0    0:aload_0         
	//    1    1:getfield        #102 <Field zzaav$zzb zzaCe>
	//    2    4:iconst_2        
	//    3    5:aload_1         
	//    4    6:invokevirtual   #284 <Method Message zzaav$zzb.obtainMessage(int, Object)>
	//    5    9:astore_1        
		zzaCe.sendMessage(((Message) (runtimeexception)));
	//    6   10:aload_0         
	//    7   11:getfield        #102 <Field zzaav$zzb zzaCe>
	//    8   14:aload_1         
	//    9   15:invokevirtual   #288 <Method boolean zzaav$zzb.sendMessage(Message)>
	//   10   18:pop             
	//   11   19:return          
	}

	public boolean zza(zzabq zzabq)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public zzaad.zza zzb(zzaad.zza zza1)
	{
		zza1.zzvI();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #272 <Method void zzaad$zza.zzvI()>
		return zzaCg.zzb(zza1);
	//    2    4:aload_0         
	//    3    5:getfield        #117 <Field zzaau zzaCg>
	//    4    8:aload_1         
	//    5    9:invokeinterface #292 <Method zzaad$zza zzaau.zzb(zzaad$zza)>
	//    6   14:areturn         
	}

	void zzh(ConnectionResult connectionresult)
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzaAG>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaCh = connectionresult;
	//    3    9:aload_0         
	//    4   10:aload_1         
	//    5   11:putfield        #58  <Field ConnectionResult zzaCh>
		zzaCg = ((zzaau) (new zzaas(this)));
	//    6   14:aload_0         
	//    7   15:new             #112 <Class zzaas>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokespecial   #115 <Method void zzaas(zzaav)>
	//   11   23:putfield        #117 <Field zzaau zzaCg>
		zzaCg.begin();
	//   12   26:aload_0         
	//   13   27:getfield        #117 <Field zzaau zzaCg>
	//   14   30:invokeinterface #298 <Method void zzaau.begin()>
		zzaCd.signalAll();
	//   15   35:aload_0         
	//   16   36:getfield        #110 <Field Condition zzaCd>
	//   17   39:invokeinterface #301 <Method void Condition.signalAll()>
		zzaAG.unlock();
	//   18   44:aload_0         
	//   19   45:getfield        #62  <Field Lock zzaAG>
	//   20   48:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   21   53:return          
		connectionresult;
	//   22   54:astore_1        
		zzaAG.unlock();
	//   23   55:aload_0         
	//   24   56:getfield        #62  <Field Lock zzaAG>
	//   25   59:invokeinterface #262 <Method void Lock.unlock()>
		throw connectionresult;
	//   26   64:aload_1         
	//   27   65:athrow          
	}

	public void zzvM()
	{
		if(isConnected())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #154 <Method boolean isConnected()>
	//*   2    4:ifeq            17
			((zzaaq)zzaCg).zzwd();
	//    3    7:aload_0         
	//    4    8:getfield        #117 <Field zzaau zzaCg>
	//    5   11:checkcast       #250 <Class zzaaq>
	//    6   14:invokevirtual   #305 <Method void zzaaq.zzwd()>
	//    7   17:return          
	}

	public void zzvn()
	{
	//    0    0:return          
	}

	void zzws()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzaAG>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaCg = ((zzaau) (new zzaar(this, zzaAL, zzaAO, zzaAQ, zzazo, zzaAG, mContext)));
	//    3    9:aload_0         
	//    4   10:new             #252 <Class zzaar>
	//    5   13:dup             
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:getfield        #68  <Field zzg zzaAL>
	//    9   19:aload_0         
	//   10   20:getfield        #70  <Field Map zzaAO>
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field zze zzaAQ>
	//   13   27:aload_0         
	//   14   28:getfield        #72  <Field com.google.android.gms.common.api.Api$zza zzazo>
	//   15   31:aload_0         
	//   16   32:getfield        #62  <Field Lock zzaAG>
	//   17   35:aload_0         
	//   18   36:getfield        #60  <Field Context mContext>
	//   19   39:invokespecial   #310 <Method void zzaar(zzaav, zzg, Map, zze, com.google.android.gms.common.api.Api$zza, Lock, Context)>
	//   20   42:putfield        #117 <Field zzaau zzaCg>
		zzaCg.begin();
	//   21   45:aload_0         
	//   22   46:getfield        #117 <Field zzaau zzaCg>
	//   23   49:invokeinterface #298 <Method void zzaau.begin()>
		zzaCd.signalAll();
	//   24   54:aload_0         
	//   25   55:getfield        #110 <Field Condition zzaCd>
	//   26   58:invokeinterface #301 <Method void Condition.signalAll()>
		zzaAG.unlock();
	//   27   63:aload_0         
	//   28   64:getfield        #62  <Field Lock zzaAG>
	//   29   67:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   30   72:return          
		Exception exception;
		exception;
	//   31   73:astore_1        
		zzaAG.unlock();
	//   32   74:aload_0         
	//   33   75:getfield        #62  <Field Lock zzaAG>
	//   34   78:invokeinterface #262 <Method void Lock.unlock()>
		throw exception;
	//   35   83:aload_1         
	//   36   84:athrow          
	}

	void zzwt()
	{
		zzaAG.lock();
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Lock zzaAG>
	//    2    4:invokeinterface #257 <Method void Lock.lock()>
		zzaAw.zzwp();
	//    3    9:aload_0         
	//    4   10:getfield        #74  <Field zzaat zzaAw>
	//    5   13:invokevirtual   #316 <Method boolean zzaat.zzwp()>
	//    6   16:pop             
		zzaCg = ((zzaau) (new zzaaq(this)));
	//    7   17:aload_0         
	//    8   18:new             #250 <Class zzaaq>
	//    9   21:dup             
	//   10   22:aload_0         
	//   11   23:invokespecial   #317 <Method void zzaaq(zzaav)>
	//   12   26:putfield        #117 <Field zzaau zzaCg>
		zzaCg.begin();
	//   13   29:aload_0         
	//   14   30:getfield        #117 <Field zzaau zzaCg>
	//   15   33:invokeinterface #298 <Method void zzaau.begin()>
		zzaCd.signalAll();
	//   16   38:aload_0         
	//   17   39:getfield        #110 <Field Condition zzaCd>
	//   18   42:invokeinterface #301 <Method void Condition.signalAll()>
		zzaAG.unlock();
	//   19   47:aload_0         
	//   20   48:getfield        #62  <Field Lock zzaAG>
	//   21   51:invokeinterface #262 <Method void Lock.unlock()>
		return;
	//   22   56:return          
		Exception exception;
		exception;
	//   23   57:astore_1        
		zzaAG.unlock();
	//   24   58:aload_0         
	//   25   59:getfield        #62  <Field Lock zzaAG>
	//   26   62:invokeinterface #262 <Method void Lock.unlock()>
		throw exception;
	//   27   67:aload_1         
	//   28   68:athrow          
	}

	void zzwu()
	{
		for(Iterator iterator = zzaBQ.values().iterator(); iterator.hasNext(); ((com.google.android.gms.common.api.Api.zze)iterator.next()).disconnect());
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Map zzaBQ>
	//    2    4:invokeinterface #322 <Method Collection Map.values()>
	//    3    9:invokeinterface #325 <Method Iterator Collection.iterator()>
	//    4   14:astore_1        
	//    5   15:aload_1         
	//    6   16:invokeinterface #88  <Method boolean Iterator.hasNext()>
	//    7   21:ifeq            41
	//    8   24:aload_1         
	//    9   25:invokeinterface #92  <Method Object Iterator.next()>
	//   10   30:checkcast       #234 <Class com.google.android.gms.common.api.Api$zze>
	//   11   33:invokeinterface #326 <Method void com.google.android.gms.common.api.Api$zze.disconnect()>
	//*  12   38:goto            15
	//   13   41:return          
	}

	private final Context mContext;
	private final Lock zzaAG;
	final zzg zzaAL;
	final Map zzaAO;
	private final zze zzaAQ;
	final zzaat zzaAw;
	final Map zzaBQ;
	private final Condition zzaCd;
	private final zzb zzaCe;
	final Map zzaCf = new HashMap();
	private volatile zzaau zzaCg;
	private ConnectionResult zzaCh;
	int zzaCi;
	final zzabc.zza zzaCj;
	final com.google.android.gms.common.api.Api.zza zzazo;
}
