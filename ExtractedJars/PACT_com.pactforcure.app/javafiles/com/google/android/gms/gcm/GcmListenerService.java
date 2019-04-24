// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.app.Service;
import android.content.Intent;
import android.os.*;
import android.util.Log;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

// Referenced classes of package com.google.android.gms.gcm:
//			GcmReceiver, zza

public abstract class GcmListenerService extends Service
{

	public GcmListenerService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Service()>
	//    2    4:aload_0         
	//    3    5:new             #19  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #20  <Method void Object()>
	//    6   12:putfield        #22  <Field Object zzrN>
		zzbfJ = 0;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #24  <Field int zzbfJ>
	//   10   20:return          
	}

	static void zzD(Bundle bundle)
	{
		bundle = ((Bundle) (bundle.keySet().iterator()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #33  <Method Set Bundle.keySet()>
	//    2    4:invokeinterface #39  <Method Iterator Set.iterator()>
	//    3    9:astore_0        
		do
		{
			if(!((Iterator) (bundle)).hasNext())
				break;
	//    4   10:aload_0         
	//    5   11:invokeinterface #45  <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            51
			String s = (String)((Iterator) (bundle)).next();
	//    7   19:aload_0         
	//    8   20:invokeinterface #49  <Method Object Iterator.next()>
	//    9   25:checkcast       #51  <Class String>
	//   10   28:astore_1        
			if(s != null && s.startsWith("google.c."))
	//*  11   29:aload_1         
	//*  12   30:ifnull          10
	//*  13   33:aload_1         
	//*  14   34:ldc1            #53  <String "google.c.">
	//*  15   36:invokevirtual   #57  <Method boolean String.startsWith(String)>
	//*  16   39:ifeq            10
				((Iterator) (bundle)).remove();
	//   17   42:aload_0         
	//   18   43:invokeinterface #60  <Method void Iterator.remove()>
		} while(true);
	//   19   48:goto            10
	//   20   51:return          
	}

	private void zzGa()
	{
		synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object zzrN>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzbfJ = zzbfJ - 1;
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #24  <Field int zzbfJ>
	//    8   12:iconst_1        
	//    9   13:isub            
	//   10   14:putfield        #24  <Field int zzbfJ>
			if(zzbfJ == 0)
	//*  11   17:aload_0         
	//*  12   18:getfield        #24  <Field int zzbfJ>
	//*  13   21:ifne            33
				zzjr(zzbfI);
	//   14   24:aload_0         
	//   15   25:aload_0         
	//   16   26:getfield        #63  <Field int zzbfI>
	//   17   29:invokevirtual   #67  <Method boolean zzjr(int)>
	//   18   32:pop             
		}
	//   19   33:aload_1         
	//   20   34:monitorexit     
		return;
	//   21   35:return          
		exception;
	//   22   36:astore_2        
		obj;
	//   23   37:aload_1         
		JVM INSTR monitorexit ;
	//   24   38:monitorexit     
		throw exception;
	//   25   39:aload_2         
	//   26   40:athrow          
	}

	static void zza(GcmListenerService gcmlistenerservice, Intent intent)
	{
		gcmlistenerservice.zzm(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #73  <Method void zzm(Intent)>
	//    3    5:return          
	}

	private void zzl(final Intent intent)
	{
		if(android.os.Build.VERSION.SDK_INT >= 11)
	//*   0    0:getstatic       #82  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          11
	//*   2    5:icmplt          26
		{
			AsyncTask.THREAD_POOL_EXECUTOR.execute(new Runnable() {

				public void run()
				{
					GcmListenerService.zza(zzbfK, intent);
				//    0    0:aload_0         
				//    1    1:getfield        #19  <Field GcmListenerService zzbfK>
				//    2    4:aload_0         
				//    3    5:getfield        #21  <Field Intent val$intent>
				//    4    8:invokestatic    #29  <Method void GcmListenerService.zza(GcmListenerService, Intent)>
				//    5   11:return          
				}

				final Intent val$intent;
				final GcmListenerService zzbfK;

			
			{
				zzbfK = GcmListenerService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field GcmListenerService zzbfK>
				intent = intent1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field Intent val$intent>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
			}
);
	//    3    8:getstatic       #88  <Field Executor AsyncTask.THREAD_POOL_EXECUTOR>
	//    4   11:new             #6   <Class GcmListenerService$1>
	//    5   14:dup             
	//    6   15:aload_0         
	//    7   16:aload_1         
	//    8   17:invokespecial   #90  <Method void GcmListenerService$1(GcmListenerService, Intent)>
	//    9   20:invokeinterface #96  <Method void Executor.execute(Runnable)>
			return;
	//   10   25:return          
		} else
		{
			((_cls2) (new AsyncTask() {

				protected volatile Object doInBackground(Object aobj[])
				{
					return ((Object) (doInBackground((Void[])aobj)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:checkcast       #28  <Class Void[]>
				//    3    5:invokevirtual   #31  <Method Void doInBackground(Void[])>
				//    4    8:areturn         
				}

				protected transient Void doInBackground(Void avoid[])
				{
					GcmListenerService.zza(zzbfK, intent);
				//    0    0:aload_0         
				//    1    1:getfield        #18  <Field GcmListenerService zzbfK>
				//    2    4:aload_0         
				//    3    5:getfield        #20  <Field Intent val$intent>
				//    4    8:invokestatic    #34  <Method void GcmListenerService.zza(GcmListenerService, Intent)>
					return null;
				//    5   11:aconst_null     
				//    6   12:areturn         
				}

				final Intent val$intent;
				final GcmListenerService zzbfK;

			
			{
				zzbfK = GcmListenerService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field GcmListenerService zzbfK>
				intent = intent1;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #20  <Field Intent val$intent>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #23  <Method void AsyncTask()>
			//    8   14:return          
			}
			}
)).execute(((Object []) (new Void[0])));
	//   11   26:new             #8   <Class GcmListenerService$2>
	//   12   29:dup             
	//   13   30:aload_0         
	//   14   31:aload_1         
	//   15   32:invokespecial   #97  <Method void GcmListenerService$2(GcmListenerService, Intent)>
	//   16   35:iconst_0        
	//   17   36:anewarray       Void[]
	//   18   39:invokevirtual   #102 <Method AsyncTask GcmListenerService$2.execute(Object[])>
	//   19   42:pop             
			return;
	//   20   43:return          
		}
	}

	private void zzm(Intent intent)
	{
		Object obj = ((Object) (intent.getAction()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #109 <Method String Intent.getAction()>
	//    2    4:astore_3        
		byte byte0 = -1;
	//    3    5:iconst_m1       
	//    4    6:istore_2        
		((String) (obj)).hashCode();
	//    5    7:aload_3         
	//    6    8:invokevirtual   #113 <Method int String.hashCode()>
		JVM INSTR tableswitch 366519424 366519424: default 110
	//	               366519424 67;
	//    7   11:tableswitch     366519424 366519424: default 110
	//	               366519424 67
		   goto _L1 _L2
_L7:
		obj = ((Object) (String.valueOf(((Object) (intent.getAction())))));
	//    8   28:aload_1         
	//    9   29:invokevirtual   #109 <Method String Intent.getAction()>
	//   10   32:invokestatic    #117 <Method String String.valueOf(Object)>
	//   11   35:astore_3        
		if(((String) (obj)).length() == 0) goto _L4; else goto _L3
	//   12   36:aload_3         
	//   13   37:invokevirtual   #120 <Method int String.length()>
	//   14   40:ifeq            97
_L3:
		obj = ((Object) ("Unknown intent action: ".concat(((String) (obj)))));
	//   15   43:ldc1            #122 <String "Unknown intent action: ">
	//   16   45:aload_3         
	//   17   46:invokevirtual   #126 <Method String String.concat(String)>
	//   18   49:astore_3        
_L6:
		Log.d("GcmListenerService", ((String) (obj)));
	//   19   50:ldc1            #128 <String "GcmListenerService">
	//   20   52:aload_3         
	//   21   53:invokestatic    #134 <Method int Log.d(String, String)>
	//   22   56:pop             
_L5:
		zzGa();
	//   23   57:aload_0         
	//   24   58:invokespecial   #136 <Method void zzGa()>
		GcmReceiver.completeWakefulIntent(intent);
	//   25   61:aload_1         
	//   26   62:invokestatic    #142 <Method boolean GcmReceiver.completeWakefulIntent(Intent)>
	//   27   65:pop             
		return;
	//   28   66:return          
_L2:
		if(((String) (obj)).equals("com.google.android.c2dm.intent.RECEIVE"))
	//*  29   67:aload_3         
	//*  30   68:ldc1            #144 <String "com.google.android.c2dm.intent.RECEIVE">
	//*  31   70:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  32   73:ifeq            110
			byte0 = 0;
	//   33   76:iconst_0        
	//   34   77:istore_2        
		  goto _L1
	//*  35   78:goto            110
_L8:
		zzn(intent);
	//   36   81:aload_0         
	//   37   82:aload_1         
	//   38   83:invokespecial   #151 <Method void zzn(Intent)>
		  goto _L5
	//*  39   86:goto            57
		obj;
	//   40   89:astore_3        
		GcmReceiver.completeWakefulIntent(intent);
	//   41   90:aload_1         
	//   42   91:invokestatic    #142 <Method boolean GcmReceiver.completeWakefulIntent(Intent)>
	//   43   94:pop             
		throw obj;
	//   44   95:aload_3         
	//   45   96:athrow          
_L4:
		obj = ((Object) (new String("Unknown intent action: ")));
	//   46   97:new             #51  <Class String>
	//   47  100:dup             
	//   48  101:ldc1            #122 <String "Unknown intent action: ">
	//   49  103:invokespecial   #154 <Method void String(String)>
	//   50  106:astore_3        
		  goto _L6
	//*  51  107:goto            50
_L1:
		byte0;
	//   52  110:iload_2         
		JVM INSTR tableswitch 0 0: default 128
	//	               0 81;
	//   53  111:tableswitch     0 0: default 128
	//	               0 81
		   goto _L7 _L8
	//*  54  128:goto            28
	}

	private void zzn(Intent intent)
	{
		byte byte0;
		String s;
		String s1 = intent.getStringExtra("message_type");
	//    0    0:aload_1         
	//    1    1:ldc1            #156 <String "message_type">
	//    2    3:invokevirtual   #159 <Method String Intent.getStringExtra(String)>
	//    3    6:astore          4
		s = s1;
	//    4    8:aload           4
	//    5   10:astore_3        
		if(s1 == null)
	//*   6   11:aload           4
	//*   7   13:ifnonnull       19
			s = "gcm";
	//    8   16:ldc1            #161 <String "gcm">
	//    9   18:astore_3        
		byte0 = -1;
	//   10   19:iconst_m1       
	//   11   20:istore_2        
		s.hashCode();
	//   12   21:aload_3         
	//   13   22:invokevirtual   #113 <Method int String.hashCode()>
		JVM INSTR lookupswitch 4: default 68
	//	               -2062414158: 141
	//	               102161: 127
	//	               814694033: 169
	//	               814800675: 155;
	//   14   25:lookupswitch    4: default 68
	//	               -2062414158: 141
	//	               102161: 127
	//	               814694033: 169
	//	               814800675: 155
		   goto _L1 _L2 _L3 _L4 _L5
_L1:
		break; /* Loop/switch isn't completed */
_L4:
		break MISSING_BLOCK_LABEL_169;
_L6:
		switch(byte0)
	//*  15   68:iload_2         
		{
	//*  16   69:tableswitch     0 3: default 100
	//	               0 183
	//	               1 189
	//	               2 194
	//	               3 205
		default:
			intent = ((Intent) (String.valueOf(((Object) (s)))));
	//   17  100:aload_3         
	//   18  101:invokestatic    #117 <Method String String.valueOf(Object)>
	//   19  104:astore_1        
			if(((String) (intent)).length() != 0)
	//*  20  105:aload_1         
	//*  21  106:invokevirtual   #120 <Method int String.length()>
	//*  22  109:ifeq            221
				intent = ((Intent) ("Received message with unknown type: ".concat(((String) (intent)))));
	//   23  112:ldc1            #163 <String "Received message with unknown type: ">
	//   24  114:aload_1         
	//   25  115:invokevirtual   #126 <Method String String.concat(String)>
	//   26  118:astore_1        
			else
	//*  27  119:ldc1            #128 <String "GcmListenerService">
	//*  28  121:aload_1         
	//*  29  122:invokestatic    #166 <Method int Log.w(String, String)>
	//*  30  125:pop             
	//*  31  126:return          
	//*  32  127:aload_3         
	//*  33  128:ldc1            #161 <String "gcm">
	//*  34  130:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  35  133:ifeq            68
	//*  36  136:iconst_0        
	//*  37  137:istore_2        
	//*  38  138:goto            68
	//*  39  141:aload_3         
	//*  40  142:ldc1            #168 <String "deleted_messages">
	//*  41  144:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  42  147:ifeq            68
	//*  43  150:iconst_1        
	//*  44  151:istore_2        
	//*  45  152:goto            68
	//*  46  155:aload_3         
	//*  47  156:ldc1            #170 <String "send_event">
	//*  48  158:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  49  161:ifeq            68
	//*  50  164:iconst_2        
	//*  51  165:istore_2        
	//*  52  166:goto            68
	//*  53  169:aload_3         
	//*  54  170:ldc1            #172 <String "send_error">
	//*  55  172:invokevirtual   #148 <Method boolean String.equals(Object)>
	//*  56  175:ifeq            68
	//*  57  178:iconst_3        
	//*  58  179:istore_2        
	//*  59  180:goto            68
	//*  60  183:aload_0         
	//*  61  184:aload_1         
	//*  62  185:invokespecial   #175 <Method void zzo(Intent)>
	//*  63  188:return          
	//*  64  189:aload_0         
	//*  65  190:invokevirtual   #178 <Method void onDeletedMessages()>
	//*  66  193:return          
	//*  67  194:aload_0         
	//*  68  195:aload_1         
	//*  69  196:ldc1            #180 <String "google.message_id">
	//*  70  198:invokevirtual   #159 <Method String Intent.getStringExtra(String)>
	//*  71  201:invokevirtual   #183 <Method void onMessageSent(String)>
	//*  72  204:return          
	//*  73  205:aload_0         
	//*  74  206:aload_0         
	//*  75  207:aload_1         
	//*  76  208:invokespecial   #187 <Method String zzp(Intent)>
	//*  77  211:aload_1         
	//*  78  212:ldc1            #189 <String "error">
	//*  79  214:invokevirtual   #159 <Method String Intent.getStringExtra(String)>
	//*  80  217:invokevirtual   #193 <Method void onSendError(String, String)>
	//*  81  220:return          
				intent = ((Intent) (new String("Received message with unknown type: ")));
	//   82  221:new             #51  <Class String>
	//   83  224:dup             
	//   84  225:ldc1            #163 <String "Received message with unknown type: ">
	//   85  227:invokespecial   #154 <Method void String(String)>
	//   86  230:astore_1        
			Log.w("GcmListenerService", ((String) (intent)));
			return;

		case 0: // '\0'
			zzo(intent);
			return;

		case 1: // '\001'
			onDeletedMessages();
			return;

		case 2: // '\002'
			onMessageSent(intent.getStringExtra("google.message_id"));
			return;

		case 3: // '\003'
			onSendError(zzp(intent), intent.getStringExtra("error"));
			return;
		}
_L3:
		if(s.equals("gcm"))
			byte0 = 0;
		  goto _L6
_L2:
		if(s.equals("deleted_messages"))
			byte0 = 1;
		  goto _L6
_L5:
		if(s.equals("send_event"))
			byte0 = 2;
		  goto _L6
		if(s.equals("send_error"))
			byte0 = 3;
		  goto _L6
	//*  87  231:goto            119
	}

	private void zzo(Intent intent)
	{
		intent = ((Intent) (intent.getExtras()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #197 <Method Bundle Intent.getExtras()>
	//    2    4:astore_1        
		((Bundle) (intent)).remove("message_type");
	//    3    5:aload_1         
	//    4    6:ldc1            #156 <String "message_type">
	//    5    8:invokevirtual   #199 <Method void Bundle.remove(String)>
		((Bundle) (intent)).remove("android.support.content.wakelockid");
	//    6   11:aload_1         
	//    7   12:ldc1            #201 <String "android.support.content.wakelockid">
	//    8   14:invokevirtual   #199 <Method void Bundle.remove(String)>
		if(com.google.android.gms.gcm.zza.zzE(((Bundle) (intent))))
	//*   9   17:aload_1         
	//*  10   18:invokestatic    #207 <Method boolean zza.zzE(Bundle)>
	//*  11   21:ifeq            45
		{
			if(!com.google.android.gms.gcm.zza.zzbc(((android.content.Context) (this))))
	//*  12   24:aload_0         
	//*  13   25:invokestatic    #211 <Method boolean zza.zzbc(android.content.Context)>
	//*  14   28:ifne            41
			{
				com.google.android.gms.gcm.zza.zzbb(((android.content.Context) (this))).zzG(((Bundle) (intent)));
	//   15   31:aload_0         
	//   16   32:invokestatic    #215 <Method zza zza.zzbb(android.content.Context)>
	//   17   35:aload_1         
	//   18   36:invokevirtual   #218 <Method boolean zza.zzG(Bundle)>
	//   19   39:pop             
				return;
	//   20   40:return          
			}
			com.google.android.gms.gcm.zza.zzF(((Bundle) (intent)));
	//   21   41:aload_1         
	//   22   42:invokestatic    #221 <Method void zza.zzF(Bundle)>
		}
		String s = ((Bundle) (intent)).getString("from");
	//   23   45:aload_1         
	//   24   46:ldc1            #223 <String "from">
	//   25   48:invokevirtual   #226 <Method String Bundle.getString(String)>
	//   26   51:astore_2        
		((Bundle) (intent)).remove("from");
	//   27   52:aload_1         
	//   28   53:ldc1            #223 <String "from">
	//   29   55:invokevirtual   #199 <Method void Bundle.remove(String)>
		zzD(((Bundle) (intent)));
	//   30   58:aload_1         
	//   31   59:invokestatic    #228 <Method void zzD(Bundle)>
		onMessageReceived(s, ((Bundle) (intent)));
	//   32   62:aload_0         
	//   33   63:aload_2         
	//   34   64:aload_1         
	//   35   65:invokevirtual   #232 <Method void onMessageReceived(String, Bundle)>
	//   36   68:return          
	}

	private String zzp(Intent intent)
	{
		String s1 = intent.getStringExtra("google.message_id");
	//    0    0:aload_1         
	//    1    1:ldc1            #180 <String "google.message_id">
	//    2    3:invokevirtual   #159 <Method String Intent.getStringExtra(String)>
	//    3    6:astore_3        
		String s = s1;
	//    4    7:aload_3         
	//    5    8:astore_2        
		if(s1 == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       20
			s = intent.getStringExtra("message_id");
	//    8   13:aload_1         
	//    9   14:ldc1            #234 <String "message_id">
	//   10   16:invokevirtual   #159 <Method String Intent.getStringExtra(String)>
	//   11   19:astore_2        
		return s;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	public final IBinder onBind(Intent intent)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void onDeletedMessages()
	{
	//    0    0:return          
	}

	public void onMessageReceived(String s, Bundle bundle)
	{
	//    0    0:return          
	}

	public void onMessageSent(String s)
	{
	//    0    0:return          
	}

	public void onSendError(String s, String s1)
	{
	//    0    0:return          
	}

	public final int onStartCommand(Intent intent, int i, int j)
	{
		synchronized(zzrN)
	//*   0    0:aload_0         
	//*   1    1:getfield        #22  <Field Object zzrN>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			zzbfI = j;
	//    5    9:aload_0         
	//    6   10:iload_3         
	//    7   11:putfield        #63  <Field int zzbfI>
			zzbfJ = zzbfJ + 1;
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #24  <Field int zzbfJ>
	//   11   19:iconst_1        
	//   12   20:iadd            
	//   13   21:putfield        #24  <Field int zzbfJ>
		}
	//   14   24:aload           4
	//   15   26:monitorexit     
		if(intent == null)
	//*  16   27:aload_1         
	//*  17   28:ifnonnull       43
		{
			zzGa();
	//   18   31:aload_0         
	//   19   32:invokespecial   #136 <Method void zzGa()>
			return 2;
	//   20   35:iconst_2        
	//   21   36:ireturn         
		} else
	//*  22   37:astore_1        
	//*  23   38:aload           4
	//*  24   40:monitorexit     
	//*  25   41:aload_1         
	//*  26   42:athrow          
		{
			zzl(intent);
	//   27   43:aload_0         
	//   28   44:aload_1         
	//   29   45:invokespecial   #240 <Method void zzl(Intent)>
			return 3;
	//   30   48:iconst_3        
	//   31   49:ireturn         
		}
		intent;
		obj;
		JVM INSTR monitorexit ;
		throw intent;
	}

	boolean zzjr(int i)
	{
		return stopSelfResult(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #243 <Method boolean stopSelfResult(int)>
	//    3    5:ireturn         
	}

	private int zzbfI;
	private int zzbfJ;
	private final Object zzrN = new Object();
}
