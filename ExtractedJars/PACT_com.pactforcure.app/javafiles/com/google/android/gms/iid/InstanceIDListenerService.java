// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.iid;

import android.app.Service;
import android.content.*;
import android.os.*;
import android.support.v4.content.WakefulBroadcastReceiver;
import android.util.Log;

// Referenced classes of package com.google.android.gms.iid:
//			MessengerCompat, zzd, zzc, InstanceID

public class InstanceIDListenerService extends Service
{

	public InstanceIDListenerService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void Service()>
		zzbhh = new MessengerCompat(((Handler) (new Handler(Looper.getMainLooper()) {

			public void handleMessage(Message message)
			{
				InstanceIDListenerService.zza(zzbhn, message, MessengerCompat.zzc(message));
			//    0    0:aload_0         
			//    1    1:getfield        #12  <Field InstanceIDListenerService zzbhn>
			//    2    4:aload_1         
			//    3    5:aload_1         
			//    4    6:invokestatic    #24  <Method int MessengerCompat.zzc(Message)>
			//    5    9:invokestatic    #28  <Method void InstanceIDListenerService.zza(InstanceIDListenerService, Message, int)>
			//    6   12:return          
			}

			final InstanceIDListenerService zzbhn;

			
			{
				zzbhn = InstanceIDListenerService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field InstanceIDListenerService zzbhn>
				super(looper);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #15  <Method void Handler(Looper)>
			//    6   10:return          
			}
		}
)));
	//    2    4:aload_0         
	//    3    5:new             #44  <Class MessengerCompat>
	//    4    8:dup             
	//    5    9:new             #6   <Class InstanceIDListenerService$1>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokestatic    #50  <Method Looper Looper.getMainLooper()>
	//    9   17:invokespecial   #53  <Method void InstanceIDListenerService$1(InstanceIDListenerService, Looper)>
	//   10   20:invokespecial   #56  <Method void MessengerCompat(Handler)>
	//   11   23:putfield        #58  <Field MessengerCompat zzbhh>
		zzbhi = ((BroadcastReceiver) (new BroadcastReceiver() {

			public void onReceive(Context context, Intent intent)
			{
				if(Log.isLoggable("InstanceID", 3))
			//*   0    0:ldc1            #20  <String "InstanceID">
			//*   1    2:iconst_3        
			//*   2    3:invokestatic    #26  <Method boolean Log.isLoggable(String, int)>
			//*   3    6:ifeq            59
				{
					intent.getStringExtra("registration_id");
			//    4    9:aload_2         
			//    5   10:ldc1            #28  <String "registration_id">
			//    6   12:invokevirtual   #34  <Method String Intent.getStringExtra(String)>
			//    7   15:pop             
					context = ((Context) (String.valueOf(((Object) (intent.getExtras())))));
			//    8   16:aload_2         
			//    9   17:invokevirtual   #38  <Method Bundle Intent.getExtras()>
			//   10   20:invokestatic    #44  <Method String String.valueOf(Object)>
			//   11   23:astore_1        
					Log.d("InstanceID", (new StringBuilder(String.valueOf(((Object) (context))).length() + 46)).append("Received GSF callback using dynamic receiver: ").append(((String) (context))).toString());
			//   12   24:ldc1            #20  <String "InstanceID">
			//   13   26:new             #46  <Class StringBuilder>
			//   14   29:dup             
			//   15   30:aload_1         
			//   16   31:invokestatic    #44  <Method String String.valueOf(Object)>
			//   17   34:invokevirtual   #50  <Method int String.length()>
			//   18   37:bipush          46
			//   19   39:iadd            
			//   20   40:invokespecial   #53  <Method void StringBuilder(int)>
			//   21   43:ldc1            #55  <String "Received GSF callback using dynamic receiver: ">
			//   22   45:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   23   48:aload_1         
			//   24   49:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
			//   25   52:invokevirtual   #63  <Method String StringBuilder.toString()>
			//   26   55:invokestatic    #67  <Method int Log.d(String, String)>
			//   27   58:pop             
				}
				zzbhn.zzn(intent);
			//   28   59:aload_0         
			//   29   60:getfield        #12  <Field InstanceIDListenerService zzbhn>
			//   30   63:aload_2         
			//   31   64:invokevirtual   #71  <Method void InstanceIDListenerService.zzn(Intent)>
				zzbhn.stop();
			//   32   67:aload_0         
			//   33   68:getfield        #12  <Field InstanceIDListenerService zzbhn>
			//   34   71:invokevirtual   #74  <Method void InstanceIDListenerService.stop()>
			//   35   74:return          
			}

			final InstanceIDListenerService zzbhn;

			
			{
				zzbhn = InstanceIDListenerService.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #12  <Field InstanceIDListenerService zzbhn>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #15  <Method void BroadcastReceiver()>
			//    5    9:return          
			}
		}
));
	//   12   26:aload_0         
	//   13   27:new             #8   <Class InstanceIDListenerService$2>
	//   14   30:dup             
	//   15   31:aload_0         
	//   16   32:invokespecial   #61  <Method void InstanceIDListenerService$2(InstanceIDListenerService)>
	//   17   35:putfield        #63  <Field BroadcastReceiver zzbhi>
	//   18   38:return          
	}

	static void zza(Context context, zzd zzd1)
	{
		zzd1.zzGA();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #70  <Method void zzd.zzGA()>
		zzd1 = ((zzd) (new Intent("com.google.android.gms.iid.InstanceID")));
	//    2    4:new             #72  <Class Intent>
	//    3    7:dup             
	//    4    8:ldc1            #74  <String "com.google.android.gms.iid.InstanceID">
	//    5   10:invokespecial   #77  <Method void Intent(String)>
	//    6   13:astore_1        
		((Intent) (zzd1)).putExtra(zzbhk, "RST");
	//    7   14:aload_1         
	//    8   15:getstatic       #34  <Field String zzbhk>
	//    9   18:ldc1            #79  <String "RST">
	//   10   20:invokevirtual   #83  <Method Intent Intent.putExtra(String, String)>
	//   11   23:pop             
		((Intent) (zzd1)).setPackage(context.getPackageName());
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:invokevirtual   #89  <Method String Context.getPackageName()>
	//   15   29:invokevirtual   #93  <Method Intent Intent.setPackage(String)>
	//   16   32:pop             
		context.startService(((Intent) (zzd1)));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #97  <Method android.content.ComponentName Context.startService(Intent)>
	//   20   38:pop             
	//   21   39:return          
	}

	private void zza(Message message, int i)
	{
		zzc.zzbi(((Context) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #104 <Method String zzc.zzbi(Context)>
	//    2    4:pop             
		getPackageManager();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #108 <Method android.content.pm.PackageManager getPackageManager()>
	//    5    9:pop             
		if(i != zzc.zzbhs && i != zzc.zzbhr)
	//*   6   10:iload_2         
	//*   7   11:getstatic       #111 <Field int zzc.zzbhs>
	//*   8   14:icmpeq          80
	//*   9   17:iload_2         
	//*  10   18:getstatic       #114 <Field int zzc.zzbhr>
	//*  11   21:icmpeq          80
		{
			int j = zzc.zzbhr;
	//   12   24:getstatic       #114 <Field int zzc.zzbhr>
	//   13   27:istore_3        
			int k = zzc.zzbhs;
	//   14   28:getstatic       #111 <Field int zzc.zzbhs>
	//   15   31:istore          4
			Log.w("InstanceID", (new StringBuilder(77)).append("Message from unexpected caller ").append(i).append(" mine=").append(j).append(" appid=").append(k).toString());
	//   16   33:ldc1            #116 <String "InstanceID">
	//   17   35:new             #118 <Class StringBuilder>
	//   18   38:dup             
	//   19   39:bipush          77
	//   20   41:invokespecial   #121 <Method void StringBuilder(int)>
	//   21   44:ldc1            #123 <String "Message from unexpected caller ">
	//   22   46:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   23   49:iload_2         
	//   24   50:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   25   53:ldc1            #132 <String " mine=">
	//   26   55:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   27   58:iload_3         
	//   28   59:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   29   62:ldc1            #134 <String " appid=">
	//   30   64:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   31   67:iload           4
	//   32   69:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   33   72:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   34   75:invokestatic    #143 <Method int Log.w(String, String)>
	//   35   78:pop             
			return;
	//   36   79:return          
		} else
		{
			zzn((Intent)message.obj);
	//   37   80:aload_0         
	//   38   81:aload_1         
	//   39   82:getfield        #149 <Field Object Message.obj>
	//   40   85:checkcast       #72  <Class Intent>
	//   41   88:invokevirtual   #153 <Method void zzn(Intent)>
			return;
	//   42   91:return          
		}
	}

	static void zza(InstanceIDListenerService instanceidlistenerservice, Message message, int i)
	{
		instanceidlistenerservice.zza(message, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #156 <Method void zza(Message, int)>
	//    4    6:return          
	}

	static void zzbh(Context context)
	{
		Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
	//    0    0:new             #72  <Class Intent>
	//    1    3:dup             
	//    2    4:ldc1            #74  <String "com.google.android.gms.iid.InstanceID">
	//    3    6:invokespecial   #77  <Method void Intent(String)>
	//    4    9:astore_1        
		intent.setPackage(context.getPackageName());
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #89  <Method String Context.getPackageName()>
	//    8   15:invokevirtual   #93  <Method Intent Intent.setPackage(String)>
	//    9   18:pop             
		intent.putExtra(zzbhk, "SYNC");
	//   10   19:aload_1         
	//   11   20:getstatic       #34  <Field String zzbhk>
	//   12   23:ldc1            #160 <String "SYNC">
	//   13   25:invokevirtual   #83  <Method Intent Intent.putExtra(String, String)>
	//   14   28:pop             
		context.startService(intent);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:invokevirtual   #97  <Method android.content.ComponentName Context.startService(Intent)>
	//   18   34:pop             
	//   19   35:return          
	}

	public IBinder onBind(Intent intent)
	{
		if(intent != null && "com.google.android.gms.iid.InstanceID".equals(((Object) (intent.getAction()))))
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
	//*   2    4:ldc1            #74  <String "com.google.android.gms.iid.InstanceID">
	//*   3    6:aload_1         
	//*   4    7:invokevirtual   #165 <Method String Intent.getAction()>
	//*   5   10:invokevirtual   #171 <Method boolean String.equals(Object)>
	//*   6   13:ifeq            24
			return zzbhh.getBinder();
	//    7   16:aload_0         
	//    8   17:getfield        #58  <Field MessengerCompat zzbhh>
	//    9   20:invokevirtual   #175 <Method IBinder MessengerCompat.getBinder()>
	//   10   23:areturn         
		else
			return null;
	//   11   24:aconst_null     
	//   12   25:areturn         
	}

	public void onCreate()
	{
		IntentFilter intentfilter = new IntentFilter("com.google.android.c2dm.intent.REGISTRATION");
	//    0    0:new             #178 <Class IntentFilter>
	//    1    3:dup             
	//    2    4:ldc1            #180 <String "com.google.android.c2dm.intent.REGISTRATION">
	//    3    6:invokespecial   #181 <Method void IntentFilter(String)>
	//    4    9:astore_1        
		intentfilter.addCategory(getPackageName());
	//    5   10:aload_1         
	//    6   11:aload_0         
	//    7   12:invokevirtual   #182 <Method String getPackageName()>
	//    8   15:invokevirtual   #185 <Method void IntentFilter.addCategory(String)>
		registerReceiver(zzbhi, intentfilter, "com.google.android.c2dm.permission.RECEIVE", ((Handler) (null)));
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #63  <Field BroadcastReceiver zzbhi>
	//   12   23:aload_1         
	//   13   24:ldc1            #187 <String "com.google.android.c2dm.permission.RECEIVE">
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #191 <Method Intent registerReceiver(BroadcastReceiver, IntentFilter, String, Handler)>
	//   16   30:pop             
	//   17   31:return          
	}

	public void onDestroy()
	{
		unregisterReceiver(zzbhi);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #63  <Field BroadcastReceiver zzbhi>
	//    3    5:invokevirtual   #196 <Method void unregisterReceiver(BroadcastReceiver)>
	//    4    8:return          
	}

	public int onStartCommand(Intent intent, int i, int j)
	{
		zzjA(j);
	//    0    0:aload_0         
	//    1    1:iload_3         
	//    2    2:invokevirtual   #201 <Method void zzjA(int)>
		if(intent == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       15
		{
			stop();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #204 <Method void stop()>
			return 2;
	//    7   13:iconst_2        
	//    8   14:ireturn         
		}
		Intent intent1;
		if(!"com.google.android.gms.iid.InstanceID".equals(((Object) (intent.getAction()))))
			break MISSING_BLOCK_LABEL_69;
	//    9   15:ldc1            #74  <String "com.google.android.gms.iid.InstanceID">
	//   10   17:aload_1         
	//   11   18:invokevirtual   #165 <Method String Intent.getAction()>
	//   12   21:invokevirtual   #171 <Method boolean String.equals(Object)>
	//   13   24:ifeq            69
		if(android.os.Build.VERSION.SDK_INT > 18)
			break MISSING_BLOCK_LABEL_64;
	//   14   27:getstatic       #209 <Field int android.os.Build$VERSION.SDK_INT>
	//   15   30:bipush          18
	//   16   32:icmpgt          64
		intent1 = (Intent)intent.getParcelableExtra("GSF");
	//   17   35:aload_1         
	//   18   36:ldc1            #211 <String "GSF">
	//   19   38:invokevirtual   #215 <Method android.os.Parcelable Intent.getParcelableExtra(String)>
	//   20   41:checkcast       #72  <Class Intent>
	//   21   44:astore          4
		if(intent1 == null)
			break MISSING_BLOCK_LABEL_64;
	//   22   46:aload           4
	//   23   48:ifnull          64
		startService(intent1);
	//   24   51:aload_0         
	//   25   52:aload           4
	//   26   54:invokevirtual   #216 <Method android.content.ComponentName startService(Intent)>
	//   27   57:pop             
		stop();
	//   28   58:aload_0         
	//   29   59:invokevirtual   #204 <Method void stop()>
		return 1;
	//   30   62:iconst_1        
	//   31   63:ireturn         
		zzn(intent);
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:invokevirtual   #153 <Method void zzn(Intent)>
		stop();
	//   35   69:aload_0         
	//   36   70:invokevirtual   #204 <Method void stop()>
		if(intent.getStringExtra("from") != null)
	//*  37   73:aload_1         
	//*  38   74:ldc1            #218 <String "from">
	//*  39   76:invokevirtual   #222 <Method String Intent.getStringExtra(String)>
	//*  40   79:ifnull          87
			WakefulBroadcastReceiver.completeWakefulIntent(intent);
	//   41   82:aload_1         
	//   42   83:invokestatic    #228 <Method boolean WakefulBroadcastReceiver.completeWakefulIntent(Intent)>
	//   43   86:pop             
		return 2;
	//   44   87:iconst_2        
	//   45   88:ireturn         
		intent;
	//   46   89:astore_1        
		stop();
	//   47   90:aload_0         
	//   48   91:invokevirtual   #204 <Method void stop()>
		throw intent;
	//   49   94:aload_1         
	//   50   95:athrow          
	}

	public void onTokenRefresh()
	{
	//    0    0:return          
	}

	void stop()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzbhl = zzbhl - 1;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #231 <Field int zzbhl>
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:putfield        #231 <Field int zzbhl>
		if(zzbhl == 0)
	//*   8   12:aload_0         
	//*   9   13:getfield        #231 <Field int zzbhl>
	//*  10   16:ifne            27
			stopSelf(zzbhm);
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #233 <Field int zzbhm>
	//   14   24:invokevirtual   #236 <Method void stopSelf(int)>
		if(Log.isLoggable("InstanceID", 3))
	//*  15   27:ldc1            #116 <String "InstanceID">
	//*  16   29:iconst_3        
	//*  17   30:invokestatic    #240 <Method boolean Log.isLoggable(String, int)>
	//*  18   33:ifeq            82
		{
			int i = zzbhl;
	//   19   36:aload_0         
	//   20   37:getfield        #231 <Field int zzbhl>
	//   21   40:istore_1        
			int j = zzbhm;
	//   22   41:aload_0         
	//   23   42:getfield        #233 <Field int zzbhm>
	//   24   45:istore_2        
			Log.d("InstanceID", (new StringBuilder(28)).append("Stop ").append(i).append(" ").append(j).toString());
	//   25   46:ldc1            #116 <String "InstanceID">
	//   26   48:new             #118 <Class StringBuilder>
	//   27   51:dup             
	//   28   52:bipush          28
	//   29   54:invokespecial   #121 <Method void StringBuilder(int)>
	//   30   57:ldc1            #242 <String "Stop ">
	//   31   59:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   32   62:iload_1         
	//   33   63:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   34   66:ldc1            #244 <String " ">
	//   35   68:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   36   71:iload_2         
	//   37   72:invokevirtual   #130 <Method StringBuilder StringBuilder.append(int)>
	//   38   75:invokevirtual   #137 <Method String StringBuilder.toString()>
	//   39   78:invokestatic    #247 <Method int Log.d(String, String)>
	//   40   81:pop             
		}
		this;
	//   41   82:aload_0         
		JVM INSTR monitorexit ;
	//   42   83:monitorexit     
		return;
	//   43   84:return          
		Exception exception;
		exception;
	//   44   85:astore_3        
		this;
	//   45   86:aload_0         
		JVM INSTR monitorexit ;
	//   46   87:monitorexit     
		throw exception;
	//   47   88:aload_3         
	//   48   89:athrow          
	}

	public void zzaB(boolean flag)
	{
		onTokenRefresh();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #251 <Method void onTokenRefresh()>
	//    2    4:return          
	}

	void zzjA(int i)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzbhl = zzbhl + 1;
	//    2    2:aload_0         
	//    3    3:aload_0         
	//    4    4:getfield        #231 <Field int zzbhl>
	//    5    7:iconst_1        
	//    6    8:iadd            
	//    7    9:putfield        #231 <Field int zzbhl>
		if(i > zzbhm)
	//*   8   12:iload_1         
	//*   9   13:aload_0         
	//*  10   14:getfield        #233 <Field int zzbhm>
	//*  11   17:icmple          25
			zzbhm = i;
	//   12   20:aload_0         
	//   13   21:iload_1         
	//   14   22:putfield        #233 <Field int zzbhm>
		this;
	//   15   25:aload_0         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		return;
	//   17   27:return          
		Exception exception;
		exception;
	//   18   28:astore_2        
		this;
	//   19   29:aload_0         
		JVM INSTR monitorexit ;
	//   20   30:monitorexit     
		throw exception;
	//   21   31:aload_2         
	//   22   32:athrow          
	}

	public void zzn(Intent intent)
	{
		String s1 = intent.getStringExtra("subtype");
	//    0    0:aload_1         
	//    1    1:ldc1            #253 <String "subtype">
	//    2    3:invokevirtual   #222 <Method String Intent.getStringExtra(String)>
	//    3    6:astore          4
		Object obj;
		String s;
		if(s1 == null)
	//*   4    8:aload           4
	//*   5   10:ifnonnull       92
		{
			obj = ((Object) (InstanceID.getInstance(((Context) (this)))));
	//    6   13:aload_0         
	//    7   14:invokestatic    #259 <Method InstanceID InstanceID.getInstance(Context)>
	//    8   17:astore_2        
		} else
	//*   9   18:aload_1         
	//*  10   19:getstatic       #34  <Field String zzbhk>
	//*  11   22:invokevirtual   #222 <Method String Intent.getStringExtra(String)>
	//*  12   25:astore_3        
	//*  13   26:aload_1         
	//*  14   27:ldc2            #261 <String "error">
	//*  15   30:invokevirtual   #222 <Method String Intent.getStringExtra(String)>
	//*  16   33:ifnonnull       46
	//*  17   36:aload_1         
	//*  18   37:ldc2            #263 <String "registration_id">
	//*  19   40:invokevirtual   #222 <Method String Intent.getStringExtra(String)>
	//*  20   43:ifnull          131
	//*  21   46:ldc1            #116 <String "InstanceID">
	//*  22   48:iconst_3        
	//*  23   49:invokestatic    #240 <Method boolean Log.isLoggable(String, int)>
	//*  24   52:ifeq            83
	//*  25   55:aload           4
	//*  26   57:invokestatic    #267 <Method String String.valueOf(Object)>
	//*  27   60:astore_3        
	//*  28   61:aload_3         
	//*  29   62:invokevirtual   #271 <Method int String.length()>
	//*  30   65:ifeq            117
	//*  31   68:ldc2            #273 <String "Register result in service ">
	//*  32   71:aload_3         
	//*  33   72:invokevirtual   #276 <Method String String.concat(String)>
	//*  34   75:astore_3        
	//*  35   76:ldc1            #116 <String "InstanceID">
	//*  36   78:aload_3         
	//*  37   79:invokestatic    #247 <Method int Log.d(String, String)>
	//*  38   82:pop             
	//*  39   83:aload_2         
	//*  40   84:invokevirtual   #280 <Method zzc InstanceID.zzGw()>
	//*  41   87:aload_1         
	//*  42   88:invokevirtual   #283 <Method void zzc.zzv(Intent)>
	//*  43   91:return          
		{
			obj = ((Object) (new Bundle()));
	//   44   92:new             #285 <Class Bundle>
	//   45   95:dup             
	//   46   96:invokespecial   #286 <Method void Bundle()>
	//   47   99:astore_2        
			((Bundle) (obj)).putString("subtype", s1);
	//   48  100:aload_2         
	//   49  101:ldc1            #253 <String "subtype">
	//   50  103:aload           4
	//   51  105:invokevirtual   #290 <Method void Bundle.putString(String, String)>
			obj = ((Object) (InstanceID.zza(((Context) (this)), ((Bundle) (obj)))));
	//   52  108:aload_0         
	//   53  109:aload_2         
	//   54  110:invokestatic    #293 <Method InstanceID InstanceID.zza(Context, Bundle)>
	//   55  113:astore_2        
		}
		s = intent.getStringExtra(zzbhk);
		if(intent.getStringExtra("error") != null || intent.getStringExtra("registration_id") != null)
		{
			if(Log.isLoggable("InstanceID", 3))
			{
				s = String.valueOf(((Object) (s1)));
				if(s.length() != 0)
					s = "Register result in service ".concat(s);
				else
	//*  56  114:goto            18
					s = new String("Register result in service ");
	//   57  117:new             #167 <Class String>
	//   58  120:dup             
	//   59  121:ldc2            #273 <String "Register result in service ">
	//   60  124:invokespecial   #294 <Method void String(String)>
	//   61  127:astore_3        
				Log.d("InstanceID", s);
			}
			((InstanceID) (obj)).zzGw().zzv(intent);
		} else
	//*  62  128:goto            76
		{
			if(Log.isLoggable("InstanceID", 3))
	//*  63  131:ldc1            #116 <String "InstanceID">
	//*  64  133:iconst_3        
	//*  65  134:invokestatic    #240 <Method boolean Log.isLoggable(String, int)>
	//*  66  137:ifeq            223
			{
				String s2 = String.valueOf(((Object) (intent.getExtras())));
	//   67  140:aload_1         
	//   68  141:invokevirtual   #298 <Method Bundle Intent.getExtras()>
	//   69  144:invokestatic    #267 <Method String String.valueOf(Object)>
	//   70  147:astore          5
				Log.d("InstanceID", (new StringBuilder(String.valueOf(((Object) (s1))).length() + 18 + String.valueOf(((Object) (s))).length() + String.valueOf(((Object) (s2))).length())).append("Service command ").append(s1).append(" ").append(s).append(" ").append(s2).toString());
	//   71  149:ldc1            #116 <String "InstanceID">
	//   72  151:new             #118 <Class StringBuilder>
	//   73  154:dup             
	//   74  155:aload           4
	//   75  157:invokestatic    #267 <Method String String.valueOf(Object)>
	//   76  160:invokevirtual   #271 <Method int String.length()>
	//   77  163:bipush          18
	//   78  165:iadd            
	//   79  166:aload_3         
	//   80  167:invokestatic    #267 <Method String String.valueOf(Object)>
	//   81  170:invokevirtual   #271 <Method int String.length()>
	//   82  173:iadd            
	//   83  174:aload           5
	//   84  176:invokestatic    #267 <Method String String.valueOf(Object)>
	//   85  179:invokevirtual   #271 <Method int String.length()>
	//   86  182:iadd            
	//   87  183:invokespecial   #121 <Method void StringBuilder(int)>
	//   88  186:ldc2            #300 <String "Service command ">
	//   89  189:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   90  192:aload           4
	//   91  194:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   92  197:ldc1            #244 <String " ">
	//   93  199:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   94  202:aload_3         
	//   95  203:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   96  206:ldc1            #244 <String " ">
	//   97  208:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//   98  211:aload           5
	//   99  213:invokevirtual   #127 <Method StringBuilder StringBuilder.append(String)>
	//  100  216:invokevirtual   #137 <Method String StringBuilder.toString()>
	//  101  219:invokestatic    #247 <Method int Log.d(String, String)>
	//  102  222:pop             
			}
			if(intent.getStringExtra("unregistered") != null)
	//* 103  223:aload_1         
	//* 104  224:ldc2            #302 <String "unregistered">
	//* 105  227:invokevirtual   #222 <Method String Intent.getStringExtra(String)>
	//* 106  230:ifnull          266
			{
				zzd zzd1 = ((InstanceID) (obj)).zzGv();
	//  107  233:aload_2         
	//  108  234:invokevirtual   #306 <Method zzd InstanceID.zzGv()>
	//  109  237:astore          5
				s = s1;
	//  110  239:aload           4
	//  111  241:astore_3        
				if(s1 == null)
	//* 112  242:aload           4
	//* 113  244:ifnonnull       251
					s = "";
	//  114  247:ldc2            #308 <String "">
	//  115  250:astore_3        
				zzd1.zzeO(s);
	//  116  251:aload           5
	//  117  253:aload_3         
	//  118  254:invokevirtual   #311 <Method void zzd.zzeO(String)>
				((InstanceID) (obj)).zzGw().zzv(intent);
	//  119  257:aload_2         
	//  120  258:invokevirtual   #280 <Method zzc InstanceID.zzGw()>
	//  121  261:aload_1         
	//  122  262:invokevirtual   #283 <Method void zzc.zzv(Intent)>
				return;
	//  123  265:return          
			}
			if(zzbfQ.equals(((Object) (intent.getStringExtra("from")))))
	//* 124  266:getstatic       #38  <Field String zzbfQ>
	//* 125  269:aload_1         
	//* 126  270:ldc1            #218 <String "from">
	//* 127  272:invokevirtual   #222 <Method String Intent.getStringExtra(String)>
	//* 128  275:invokevirtual   #171 <Method boolean String.equals(Object)>
	//* 129  278:ifeq            296
			{
				((InstanceID) (obj)).zzGv().zzeO(s1);
	//  130  281:aload_2         
	//  131  282:invokevirtual   #306 <Method zzd InstanceID.zzGv()>
	//  132  285:aload           4
	//  133  287:invokevirtual   #311 <Method void zzd.zzeO(String)>
				zzaB(false);
	//  134  290:aload_0         
	//  135  291:iconst_0        
	//  136  292:invokevirtual   #313 <Method void zzaB(boolean)>
				return;
	//  137  295:return          
			}
			if("RST".equals(((Object) (s))))
	//* 138  296:ldc1            #79  <String "RST">
	//* 139  298:aload_3         
	//* 140  299:invokevirtual   #171 <Method boolean String.equals(Object)>
	//* 141  302:ifeq            315
			{
				((InstanceID) (obj)).zzGu();
	//  142  305:aload_2         
	//  143  306:invokevirtual   #316 <Method void InstanceID.zzGu()>
				zzaB(true);
	//  144  309:aload_0         
	//  145  310:iconst_1        
	//  146  311:invokevirtual   #313 <Method void zzaB(boolean)>
				return;
	//  147  314:return          
			}
			if("RST_FULL".equals(((Object) (s))))
	//* 148  315:ldc2            #318 <String "RST_FULL">
	//* 149  318:aload_3         
	//* 150  319:invokevirtual   #171 <Method boolean String.equals(Object)>
	//* 151  322:ifeq            348
			{
				if(!((InstanceID) (obj)).zzGv().isEmpty())
	//* 152  325:aload_2         
	//* 153  326:invokevirtual   #306 <Method zzd InstanceID.zzGv()>
	//* 154  329:invokevirtual   #322 <Method boolean zzd.isEmpty()>
	//* 155  332:ifne            91
				{
					((InstanceID) (obj)).zzGv().zzGA();
	//  156  335:aload_2         
	//  157  336:invokevirtual   #306 <Method zzd InstanceID.zzGv()>
	//  158  339:invokevirtual   #70  <Method void zzd.zzGA()>
					zzaB(true);
	//  159  342:aload_0         
	//  160  343:iconst_1        
	//  161  344:invokevirtual   #313 <Method void zzaB(boolean)>
					return;
	//  162  347:return          
				}
			} else
			if("SYNC".equals(((Object) (s))))
	//* 163  348:ldc1            #160 <String "SYNC">
	//* 164  350:aload_3         
	//* 165  351:invokevirtual   #171 <Method boolean String.equals(Object)>
	//* 166  354:ifeq            372
			{
				((InstanceID) (obj)).zzGv().zzeO(s1);
	//  167  357:aload_2         
	//  168  358:invokevirtual   #306 <Method zzd InstanceID.zzGv()>
	//  169  361:aload           4
	//  170  363:invokevirtual   #311 <Method void zzd.zzeO(String)>
				zzaB(false);
	//  171  366:aload_0         
	//  172  367:iconst_0        
	//  173  368:invokevirtual   #313 <Method void zzaB(boolean)>
				return;
	//  174  371:return          
			} else
			{
				"PING".equals(((Object) (s)));
	//  175  372:ldc2            #324 <String "PING">
	//  176  375:aload_3         
	//  177  376:invokevirtual   #171 <Method boolean String.equals(Object)>
	//  178  379:pop             
				return;
	//  179  380:return          
			}
		}
	}

	static String ACTION = "action";
	private static String zzbfQ = "gcm.googleapis.com/refresh";
	private static String zzbhj = "google.com/iid";
	private static String zzbhk = "CMD";
	MessengerCompat zzbhh;
	BroadcastReceiver zzbhi;
	int zzbhl;
	int zzbhm;

	static 
	{
	//    0    0:ldc1            #24  <String "action">
	//    1    2:putstatic       #26  <Field String ACTION>
	//    2    5:ldc1            #28  <String "google.com/iid">
	//    3    7:putstatic       #30  <Field String zzbhj>
	//    4   10:ldc1            #32  <String "CMD">
	//    5   12:putstatic       #34  <Field String zzbhk>
	//    6   15:ldc1            #36  <String "gcm.googleapis.com/refresh">
	//    7   17:putstatic       #38  <Field String zzbfQ>
	//*   8   20:return          
	}
}
