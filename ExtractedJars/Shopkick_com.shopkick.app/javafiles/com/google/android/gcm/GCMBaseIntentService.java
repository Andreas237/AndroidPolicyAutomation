// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gcm;

import android.app.*;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.os.SystemClock;
import android.util.Log;
import java.util.Random;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gcm:
//			GCMRegistrar

public abstract class GCMBaseIntentService extends IntentService
{

	protected GCMBaseIntentService()
	{
		this(getName("DynamicSenderIds"), ((String []) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #66  <String "DynamicSenderIds">
	//    2    3:invokestatic    #70  <Method String getName(String)>
	//    3    6:aconst_null     
	//    4    7:invokespecial   #73  <Method void GCMBaseIntentService(String, String[])>
	//    5   10:return          
	}

	private GCMBaseIntentService(String s, String as[])
	{
		super(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #76  <Method void IntentService(String)>
		mSenderIds = as;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #78  <Field String[] mSenderIds>
	//    6   10:return          
	}

	protected transient GCMBaseIntentService(String as[])
	{
		this(getName(as), as);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #82  <Method String getName(String[])>
	//    3    5:aload_1         
	//    4    6:invokespecial   #73  <Method void GCMBaseIntentService(String, String[])>
	//    5    9:return          
	}

	private static String getName(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #85  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("GCMIntentService-");
	//    4    8:aload_2         
	//    5    9:ldc1            #87  <String "GCMIntentService-">
	//    6   11:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(s);
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		stringbuilder.append("-");
	//   12   21:aload_2         
	//   13   22:ldc1            #93  <String "-">
	//   14   24:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             
		int i = sCounter + 1;
	//   16   28:getstatic       #95  <Field int sCounter>
	//   17   31:iconst_1        
	//   18   32:iadd            
	//   19   33:istore_1        
		sCounter = i;
	//   20   34:iload_1         
	//   21   35:putstatic       #95  <Field int sCounter>
		stringbuilder.append(i);
	//   22   38:aload_2         
	//   23   39:iload_1         
	//   24   40:invokevirtual   #98  <Method StringBuilder StringBuilder.append(int)>
	//   25   43:pop             
		s = stringbuilder.toString();
	//   26   44:aload_2         
	//   27   45:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   28   48:astore_0        
		stringbuilder = new StringBuilder();
	//   29   49:new             #84  <Class StringBuilder>
	//   30   52:dup             
	//   31   53:invokespecial   #85  <Method void StringBuilder()>
	//   32   56:astore_2        
		stringbuilder.append("Intent service name: ");
	//   33   57:aload_2         
	//   34   58:ldc1            #104 <String "Intent service name: ">
	//   35   60:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   36   63:pop             
		stringbuilder.append(s);
	//   37   64:aload_2         
	//   38   65:aload_0         
	//   39   66:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   40   69:pop             
		Log.v("GCMBaseIntentService", stringbuilder.toString());
	//   41   70:ldc1            #15  <String "GCMBaseIntentService">
	//   42   72:aload_2         
	//   43   73:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   44   76:invokestatic    #110 <Method int Log.v(String, String)>
	//   45   79:pop             
		return s;
	//   46   80:aload_0         
	//   47   81:areturn         
	}

	private static String getName(String as[])
	{
		return getName(GCMRegistrar.getFlatSenderIds(as));
	//    0    0:aload_0         
	//    1    1:invokestatic    #115 <Method String GCMRegistrar.getFlatSenderIds(String[])>
	//    2    4:invokestatic    #70  <Method String getName(String)>
	//    3    7:areturn         
	}

	private void handleRegistration(Context context, Intent intent)
	{
		String s1 = intent.getStringExtra("registration_id");
	//    0    0:aload_2         
	//    1    1:ldc1            #119 <String "registration_id">
	//    2    3:invokevirtual   #124 <Method String Intent.getStringExtra(String)>
	//    3    6:astore          6
		String s = intent.getStringExtra("error");
	//    4    8:aload_2         
	//    5    9:ldc1            #126 <String "error">
	//    6   11:invokevirtual   #124 <Method String Intent.getStringExtra(String)>
	//    7   14:astore          5
		intent = ((Intent) (intent.getStringExtra("unregistered")));
	//    8   16:aload_2         
	//    9   17:ldc1            #128 <String "unregistered">
	//   10   19:invokevirtual   #124 <Method String Intent.getStringExtra(String)>
	//   11   22:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   12   23:new             #84  <Class StringBuilder>
	//   13   26:dup             
	//   14   27:invokespecial   #85  <Method void StringBuilder()>
	//   15   30:astore          7
		stringbuilder.append("handleRegistration: registrationId = ");
	//   16   32:aload           7
	//   17   34:ldc1            #130 <String "handleRegistration: registrationId = ">
	//   18   36:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   19   39:pop             
		stringbuilder.append(s1);
	//   20   40:aload           7
	//   21   42:aload           6
	//   22   44:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   23   47:pop             
		stringbuilder.append(", error = ");
	//   24   48:aload           7
	//   25   50:ldc1            #132 <String ", error = ">
	//   26   52:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   27   55:pop             
		stringbuilder.append(s);
	//   28   56:aload           7
	//   29   58:aload           5
	//   30   60:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   31   63:pop             
		stringbuilder.append(", unregistered = ");
	//   32   64:aload           7
	//   33   66:ldc1            #134 <String ", unregistered = ">
	//   34   68:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   35   71:pop             
		stringbuilder.append(((String) (intent)));
	//   36   72:aload           7
	//   37   74:aload_2         
	//   38   75:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   39   78:pop             
		Log.d("GCMBaseIntentService", stringbuilder.toString());
	//   40   79:ldc1            #15  <String "GCMBaseIntentService">
	//   41   81:aload           7
	//   42   83:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   43   86:invokestatic    #137 <Method int Log.d(String, String)>
	//   44   89:pop             
		if(s1 != null)
	//*  45   90:aload           6
	//*  46   92:ifnull          114
		{
			GCMRegistrar.resetBackoff(context);
	//   47   95:aload_1         
	//   48   96:invokestatic    #141 <Method void GCMRegistrar.resetBackoff(Context)>
			GCMRegistrar.setRegistrationId(context, s1);
	//   49   99:aload_1         
	//   50  100:aload           6
	//   51  102:invokestatic    #145 <Method String GCMRegistrar.setRegistrationId(Context, String)>
	//   52  105:pop             
			onRegistered(context, s1);
	//   53  106:aload_0         
	//   54  107:aload_1         
	//   55  108:aload           6
	//   56  110:invokevirtual   #149 <Method void onRegistered(Context, String)>
			return;
	//   57  113:return          
		}
		if(intent != null)
	//*  58  114:aload_2         
	//*  59  115:ifnull          132
		{
			GCMRegistrar.resetBackoff(context);
	//   60  118:aload_1         
	//   61  119:invokestatic    #141 <Method void GCMRegistrar.resetBackoff(Context)>
			onUnregistered(context, GCMRegistrar.clearRegistrationId(context));
	//   62  122:aload_0         
	//   63  123:aload_1         
	//   64  124:aload_1         
	//   65  125:invokestatic    #153 <Method String GCMRegistrar.clearRegistrationId(Context)>
	//   66  128:invokevirtual   #156 <Method void onUnregistered(Context, String)>
			return;
	//   67  131:return          
		}
		intent = ((Intent) (new StringBuilder()));
	//   68  132:new             #84  <Class StringBuilder>
	//   69  135:dup             
	//   70  136:invokespecial   #85  <Method void StringBuilder()>
	//   71  139:astore_2        
		((StringBuilder) (intent)).append("Registration error: ");
	//   72  140:aload_2         
	//   73  141:ldc1            #158 <String "Registration error: ">
	//   74  143:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   75  146:pop             
		((StringBuilder) (intent)).append(s);
	//   76  147:aload_2         
	//   77  148:aload           5
	//   78  150:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   79  153:pop             
		Log.d("GCMBaseIntentService", ((StringBuilder) (intent)).toString());
	//   80  154:ldc1            #15  <String "GCMBaseIntentService">
	//   81  156:aload_2         
	//   82  157:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   83  160:invokestatic    #137 <Method int Log.d(String, String)>
	//   84  163:pop             
		if("SERVICE_NOT_AVAILABLE".equals(((Object) (s))))
	//*  85  164:ldc1            #160 <String "SERVICE_NOT_AVAILABLE">
	//*  86  166:aload           5
	//*  87  168:invokevirtual   #166 <Method boolean String.equals(Object)>
	//*  88  171:ifeq            327
		{
			if(onRecoverableError(context, s))
	//*  89  174:aload_0         
	//*  90  175:aload_1         
	//*  91  176:aload           5
	//*  92  178:invokevirtual   #170 <Method boolean onRecoverableError(Context, String)>
	//*  93  181:ifeq            318
			{
				int i = GCMRegistrar.getBackoff(context);
	//   94  184:aload_1         
	//   95  185:invokestatic    #174 <Method int GCMRegistrar.getBackoff(Context)>
	//   96  188:istore_3        
				int j = i / 2 + sRandom.nextInt(i);
	//   97  189:iload_3         
	//   98  190:iconst_2        
	//   99  191:idiv            
	//  100  192:getstatic       #37  <Field Random sRandom>
	//  101  195:iload_3         
	//  102  196:invokevirtual   #178 <Method int Random.nextInt(int)>
	//  103  199:iadd            
	//  104  200:istore          4
				intent = ((Intent) (new StringBuilder()));
	//  105  202:new             #84  <Class StringBuilder>
	//  106  205:dup             
	//  107  206:invokespecial   #85  <Method void StringBuilder()>
	//  108  209:astore_2        
				((StringBuilder) (intent)).append("Scheduling registration retry, backoff = ");
	//  109  210:aload_2         
	//  110  211:ldc1            #180 <String "Scheduling registration retry, backoff = ">
	//  111  213:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  112  216:pop             
				((StringBuilder) (intent)).append(j);
	//  113  217:aload_2         
	//  114  218:iload           4
	//  115  220:invokevirtual   #98  <Method StringBuilder StringBuilder.append(int)>
	//  116  223:pop             
				((StringBuilder) (intent)).append(" (");
	//  117  224:aload_2         
	//  118  225:ldc1            #182 <String " (">
	//  119  227:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  120  230:pop             
				((StringBuilder) (intent)).append(i);
	//  121  231:aload_2         
	//  122  232:iload_3         
	//  123  233:invokevirtual   #98  <Method StringBuilder StringBuilder.append(int)>
	//  124  236:pop             
				((StringBuilder) (intent)).append(")");
	//  125  237:aload_2         
	//  126  238:ldc1            #184 <String ")">
	//  127  240:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  128  243:pop             
				Log.d("GCMBaseIntentService", ((StringBuilder) (intent)).toString());
	//  129  244:ldc1            #15  <String "GCMBaseIntentService">
	//  130  246:aload_2         
	//  131  247:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  132  250:invokestatic    #137 <Method int Log.d(String, String)>
	//  133  253:pop             
				intent = new Intent("com.google.android.gcm.intent.RETRY");
	//  134  254:new             #121 <Class Intent>
	//  135  257:dup             
	//  136  258:ldc1            #186 <String "com.google.android.gcm.intent.RETRY">
	//  137  260:invokespecial   #187 <Method void Intent(String)>
	//  138  263:astore_2        
				intent.putExtra("token", TOKEN);
	//  139  264:aload_2         
	//  140  265:ldc1            #8   <String "token">
	//  141  267:getstatic       #63  <Field String TOKEN>
	//  142  270:invokevirtual   #191 <Method Intent Intent.putExtra(String, String)>
	//  143  273:pop             
				intent = ((Intent) (PendingIntent.getBroadcast(context, 0, intent, 0)));
	//  144  274:aload_1         
	//  145  275:iconst_0        
	//  146  276:aload_2         
	//  147  277:iconst_0        
	//  148  278:invokestatic    #197 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//  149  281:astore_2        
				((AlarmManager)context.getSystemService("alarm")).set(3, SystemClock.elapsedRealtime() + (long)j, ((PendingIntent) (intent)));
	//  150  282:aload_1         
	//  151  283:ldc1            #199 <String "alarm">
	//  152  285:invokevirtual   #205 <Method Object Context.getSystemService(String)>
	//  153  288:checkcast       #207 <Class AlarmManager>
	//  154  291:iconst_3        
	//  155  292:invokestatic    #212 <Method long SystemClock.elapsedRealtime()>
	//  156  295:iload           4
	//  157  297:i2l             
	//  158  298:ladd            
	//  159  299:aload_2         
	//  160  300:invokevirtual   #216 <Method void AlarmManager.set(int, long, PendingIntent)>
				if(i < MAX_BACKOFF_MS)
	//* 161  303:iload_3         
	//* 162  304:getstatic       #51  <Field int MAX_BACKOFF_MS>
	//* 163  307:icmpge          334
				{
					GCMRegistrar.setBackoff(context, i * 2);
	//  164  310:aload_1         
	//  165  311:iload_3         
	//  166  312:iconst_2        
	//  167  313:imul            
	//  168  314:invokestatic    #220 <Method void GCMRegistrar.setBackoff(Context, int)>
					return;
	//  169  317:return          
				}
			} else
			{
				Log.d("GCMBaseIntentService", "Not retrying failed operation");
	//  170  318:ldc1            #15  <String "GCMBaseIntentService">
	//  171  320:ldc1            #222 <String "Not retrying failed operation">
	//  172  322:invokestatic    #137 <Method int Log.d(String, String)>
	//  173  325:pop             
				return;
	//  174  326:return          
			}
		} else
		{
			onError(context, s);
	//  175  327:aload_0         
	//  176  328:aload_1         
	//  177  329:aload           5
	//  178  331:invokevirtual   #225 <Method void onError(Context, String)>
		}
	//  179  334:return          
	}

	static void runIntentInService(Context context, Intent intent, String s)
	{
		synchronized(LOCK)
	//*   0    0:getstatic       #30  <Field Object LOCK>
	//*   1    3:astore_3        
	//*   2    4:aload_3         
	//*   3    5:monitorenter    
		{
			if(sWakeLock == null)
	//*   4    6:getstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
	//*   5    9:ifnonnull       30
				sWakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, "GCM_LIB");
	//    6   12:aload_0         
	//    7   13:ldc1            #231 <String "power">
	//    8   15:invokevirtual   #205 <Method Object Context.getSystemService(String)>
	//    9   18:checkcast       #233 <Class PowerManager>
	//   10   21:iconst_1        
	//   11   22:ldc1            #19  <String "GCM_LIB">
	//   12   24:invokevirtual   #237 <Method android.os.PowerManager$WakeLock PowerManager.newWakeLock(int, String)>
	//   13   27:putstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
		}
	//   14   30:aload_3         
	//   15   31:monitorexit     
		Log.v("GCMBaseIntentService", "Acquiring wakelock");
	//   16   32:ldc1            #15  <String "GCMBaseIntentService">
	//   17   34:ldc1            #239 <String "Acquiring wakelock">
	//   18   36:invokestatic    #110 <Method int Log.v(String, String)>
	//   19   39:pop             
		sWakeLock.acquire();
	//   20   40:getstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
	//   21   43:invokevirtual   #244 <Method void android.os.PowerManager$WakeLock.acquire()>
		intent.setClassName(context, s);
	//   22   46:aload_1         
	//   23   47:aload_0         
	//   24   48:aload_2         
	//   25   49:invokevirtual   #248 <Method Intent Intent.setClassName(Context, String)>
	//   26   52:pop             
		context.startService(intent);
	//   27   53:aload_0         
	//   28   54:aload_1         
	//   29   55:invokevirtual   #252 <Method android.content.ComponentName Context.startService(Intent)>
	//   30   58:pop             
		return;
	//   31   59:return          
		context;
	//   32   60:astore_0        
		obj;
	//   33   61:aload_3         
		JVM INSTR monitorexit ;
	//   34   62:monitorexit     
		throw context;
	//   35   63:aload_0         
	//   36   64:athrow          
	}

	protected String[] getSenderIds(Context context)
	{
		context = ((Context) (mSenderIds));
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field String[] mSenderIds>
	//    2    4:astore_1        
		if(context != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((String []) (context));
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalStateException("sender id not set on constructor");
	//    7   11:new             #256 <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc2            #258 <String "sender id not set on constructor">
	//   10   18:invokespecial   #259 <Method void IllegalStateException(String)>
	//   11   21:athrow          
	}

	protected void onDeletedMessages(Context context, int i)
	{
	//    0    0:return          
	}

	protected abstract void onError(Context context, String s);

	public final void onHandleIntent(Intent intent)
	{
		Object obj;
		Object obj2;
		obj = ((Object) (getApplicationContext()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #268 <Method Context getApplicationContext()>
	//    2    4:astore_3        
		obj2 = ((Object) (intent.getAction()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #271 <Method String Intent.getAction()>
	//    5    9:astore          4
		if(!((String) (obj2)).equals("com.google.android.c2dm.intent.REGISTRATION")) goto _L2; else goto _L1
	//    6   11:aload           4
	//    7   13:ldc2            #273 <String "com.google.android.c2dm.intent.REGISTRATION">
	//    8   16:invokevirtual   #166 <Method boolean String.equals(Object)>
	//    9   19:ifeq            35
_L1:
		GCMRegistrar.setRetryBroadcastReceiver(((Context) (obj)));
	//   10   22:aload_3         
	//   11   23:invokestatic    #276 <Method void GCMRegistrar.setRetryBroadcastReceiver(Context)>
		handleRegistration(((Context) (obj)), intent);
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:aload_1         
	//   15   29:invokespecial   #278 <Method void handleRegistration(Context, Intent)>
		  goto _L3
	//*  16   32:goto            342
_L2:
		if(!((String) (obj2)).equals("com.google.android.c2dm.intent.RECEIVE")) goto _L5; else goto _L4
	//   17   35:aload           4
	//   18   37:ldc2            #280 <String "com.google.android.c2dm.intent.RECEIVE">
	//   19   40:invokevirtual   #166 <Method boolean String.equals(Object)>
	//   20   43:ifeq            213
_L4:
		obj2 = ((Object) (intent.getStringExtra("message_type")));
	//   21   46:aload_1         
	//   22   47:ldc2            #282 <String "message_type">
	//   23   50:invokevirtual   #124 <Method String Intent.getStringExtra(String)>
	//   24   53:astore          4
		if(obj2 == null) goto _L7; else goto _L6
	//   25   55:aload           4
	//   26   57:ifnull          204
_L6:
		if(!((String) (obj2)).equals("deleted_messages")) goto _L9; else goto _L8
	//   27   60:aload           4
	//   28   62:ldc2            #284 <String "deleted_messages">
	//   29   65:invokevirtual   #166 <Method boolean String.equals(Object)>
	//   30   68:ifeq            168
_L8:
		intent = ((Intent) (intent.getStringExtra("total_deleted")));
	//   31   71:aload_1         
	//   32   72:ldc2            #286 <String "total_deleted">
	//   33   75:invokevirtual   #124 <Method String Intent.getStringExtra(String)>
	//   34   78:astore_1        
		if(intent == null) goto _L3; else goto _L10
	//   35   79:aload_1         
	//   36   80:ifnull          342
_L10:
		int i = Integer.parseInt(((String) (intent)));
	//   37   83:aload_1         
	//   38   84:invokestatic    #292 <Method int Integer.parseInt(String)>
	//   39   87:istore_2        
		obj2 = ((Object) (new StringBuilder()));
	//   40   88:new             #84  <Class StringBuilder>
	//   41   91:dup             
	//   42   92:invokespecial   #85  <Method void StringBuilder()>
	//   43   95:astore          4
		((StringBuilder) (obj2)).append("Received deleted messages notification: ");
	//   44   97:aload           4
	//   45   99:ldc2            #294 <String "Received deleted messages notification: ">
	//   46  102:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   47  105:pop             
		((StringBuilder) (obj2)).append(i);
	//   48  106:aload           4
	//   49  108:iload_2         
	//   50  109:invokevirtual   #98  <Method StringBuilder StringBuilder.append(int)>
	//   51  112:pop             
		Log.v("GCMBaseIntentService", ((StringBuilder) (obj2)).toString());
	//   52  113:ldc1            #15  <String "GCMBaseIntentService">
	//   53  115:aload           4
	//   54  117:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   55  120:invokestatic    #110 <Method int Log.v(String, String)>
	//   56  123:pop             
		onDeletedMessages(((Context) (obj)), i);
	//   57  124:aload_0         
	//   58  125:aload_3         
	//   59  126:iload_2         
	//   60  127:invokevirtual   #296 <Method void onDeletedMessages(Context, int)>
		  goto _L3
	//*  61  130:goto            342
_L15:
		obj = ((Object) (new StringBuilder()));
	//   62  133:new             #84  <Class StringBuilder>
	//   63  136:dup             
	//   64  137:invokespecial   #85  <Method void StringBuilder()>
	//   65  140:astore_3        
		((StringBuilder) (obj)).append("GCM returned invalid number of deleted messages: ");
	//   66  141:aload_3         
	//   67  142:ldc2            #298 <String "GCM returned invalid number of deleted messages: ">
	//   68  145:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   69  148:pop             
		((StringBuilder) (obj)).append(((String) (intent)));
	//   70  149:aload_3         
	//   71  150:aload_1         
	//   72  151:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   73  154:pop             
		Log.e("GCMBaseIntentService", ((StringBuilder) (obj)).toString());
	//   74  155:ldc1            #15  <String "GCMBaseIntentService">
	//   75  157:aload_3         
	//   76  158:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   77  161:invokestatic    #301 <Method int Log.e(String, String)>
	//   78  164:pop             
		  goto _L3
	//*  79  165:goto            342
_L9:
		intent = ((Intent) (new StringBuilder()));
	//   80  168:new             #84  <Class StringBuilder>
	//   81  171:dup             
	//   82  172:invokespecial   #85  <Method void StringBuilder()>
	//   83  175:astore_1        
		((StringBuilder) (intent)).append("Received unknown special message: ");
	//   84  176:aload_1         
	//   85  177:ldc2            #303 <String "Received unknown special message: ">
	//   86  180:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   87  183:pop             
		((StringBuilder) (intent)).append(((String) (obj2)));
	//   88  184:aload_1         
	//   89  185:aload           4
	//   90  187:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   91  190:pop             
		Log.e("GCMBaseIntentService", ((StringBuilder) (intent)).toString());
	//   92  191:ldc1            #15  <String "GCMBaseIntentService">
	//   93  193:aload_1         
	//   94  194:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   95  197:invokestatic    #301 <Method int Log.e(String, String)>
	//   96  200:pop             
		  goto _L3
	//*  97  201:goto            342
_L7:
		onMessage(((Context) (obj)), intent);
	//   98  204:aload_0         
	//   99  205:aload_3         
	//  100  206:aload_1         
	//  101  207:invokevirtual   #306 <Method void onMessage(Context, Intent)>
		  goto _L3
	//* 102  210:goto            342
_L5:
		if(!((String) (obj2)).equals("com.google.android.gcm.intent.RETRY")) goto _L3; else goto _L11
	//  103  213:aload           4
	//  104  215:ldc1            #186 <String "com.google.android.gcm.intent.RETRY">
	//  105  217:invokevirtual   #166 <Method boolean String.equals(Object)>
	//  106  220:ifeq            342
_L11:
		intent = ((Intent) (intent.getStringExtra("token")));
	//  107  223:aload_1         
	//  108  224:ldc1            #8   <String "token">
	//  109  226:invokevirtual   #124 <Method String Intent.getStringExtra(String)>
	//  110  229:astore_1        
		if(TOKEN.equals(((Object) (intent))))
			break MISSING_BLOCK_LABEL_319;
	//  111  230:getstatic       #63  <Field String TOKEN>
	//  112  233:aload_1         
	//  113  234:invokevirtual   #166 <Method boolean String.equals(Object)>
	//  114  237:ifne            319
		obj = ((Object) (new StringBuilder()));
	//  115  240:new             #84  <Class StringBuilder>
	//  116  243:dup             
	//  117  244:invokespecial   #85  <Method void StringBuilder()>
	//  118  247:astore_3        
		((StringBuilder) (obj)).append("Received invalid token: ");
	//  119  248:aload_3         
	//  120  249:ldc2            #308 <String "Received invalid token: ">
	//  121  252:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  122  255:pop             
		((StringBuilder) (obj)).append(((String) (intent)));
	//  123  256:aload_3         
	//  124  257:aload_1         
	//  125  258:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  126  261:pop             
		Log.e("GCMBaseIntentService", ((StringBuilder) (obj)).toString());
	//  127  262:ldc1            #15  <String "GCMBaseIntentService">
	//  128  264:aload_3         
	//  129  265:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  130  268:invokestatic    #301 <Method int Log.e(String, String)>
	//  131  271:pop             
		intent = ((Intent) (LOCK));
	//  132  272:getstatic       #30  <Field Object LOCK>
	//  133  275:astore_1        
		intent;
	//  134  276:aload_1         
		JVM INSTR monitorenter ;
	//  135  277:monitorenter    
		if(sWakeLock != null)
	//* 136  278:getstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
	//* 137  281:ifnull          302
		{
			Log.v("GCMBaseIntentService", "Releasing wakelock");
	//  138  284:ldc1            #15  <String "GCMBaseIntentService">
	//  139  286:ldc2            #310 <String "Releasing wakelock">
	//  140  289:invokestatic    #110 <Method int Log.v(String, String)>
	//  141  292:pop             
			sWakeLock.release();
	//  142  293:getstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
	//  143  296:invokevirtual   #313 <Method void android.os.PowerManager$WakeLock.release()>
			break MISSING_BLOCK_LABEL_311;
	//  144  299:goto            311
		}
		Log.e("GCMBaseIntentService", "Wakelock reference is null");
	//  145  302:ldc1            #15  <String "GCMBaseIntentService">
	//  146  304:ldc2            #315 <String "Wakelock reference is null">
	//  147  307:invokestatic    #301 <Method int Log.e(String, String)>
	//  148  310:pop             
		intent;
	//  149  311:aload_1         
		JVM INSTR monitorexit ;
	//  150  312:monitorexit     
		return;
	//  151  313:return          
		obj;
	//  152  314:astore_3        
		intent;
	//  153  315:aload_1         
		JVM INSTR monitorexit ;
	//  154  316:monitorexit     
		throw obj;
	//  155  317:aload_3         
	//  156  318:athrow          
		if(!GCMRegistrar.isRegistered(((Context) (obj)))) goto _L13; else goto _L12
	//  157  319:aload_3         
	//  158  320:invokestatic    #319 <Method boolean GCMRegistrar.isRegistered(Context)>
	//  159  323:ifeq            333
_L12:
		GCMRegistrar.internalUnregister(((Context) (obj)));
	//  160  326:aload_3         
	//  161  327:invokestatic    #322 <Method void GCMRegistrar.internalUnregister(Context)>
		  goto _L3
	//* 162  330:goto            342
_L13:
		GCMRegistrar.internalRegister(((Context) (obj)), getSenderIds(((Context) (obj))));
	//  163  333:aload_3         
	//  164  334:aload_0         
	//  165  335:aload_3         
	//  166  336:invokevirtual   #324 <Method String[] getSenderIds(Context)>
	//  167  339:invokestatic    #328 <Method void GCMRegistrar.internalRegister(Context, String[])>
_L3:
		intent = ((Intent) (LOCK));
	//  168  342:getstatic       #30  <Field Object LOCK>
	//  169  345:astore_1        
		intent;
	//  170  346:aload_1         
		JVM INSTR monitorenter ;
	//  171  347:monitorenter    
		if(sWakeLock != null)
	//* 172  348:getstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
	//* 173  351:ifnull          372
		{
			Log.v("GCMBaseIntentService", "Releasing wakelock");
	//  174  354:ldc1            #15  <String "GCMBaseIntentService">
	//  175  356:ldc2            #310 <String "Releasing wakelock">
	//  176  359:invokestatic    #110 <Method int Log.v(String, String)>
	//  177  362:pop             
			sWakeLock.release();
	//  178  363:getstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
	//  179  366:invokevirtual   #313 <Method void android.os.PowerManager$WakeLock.release()>
			break MISSING_BLOCK_LABEL_381;
	//  180  369:goto            381
		}
		Log.e("GCMBaseIntentService", "Wakelock reference is null");
	//  181  372:ldc1            #15  <String "GCMBaseIntentService">
	//  182  374:ldc2            #315 <String "Wakelock reference is null">
	//  183  377:invokestatic    #301 <Method int Log.e(String, String)>
	//  184  380:pop             
		intent;
	//  185  381:aload_1         
		JVM INSTR monitorexit ;
	//  186  382:monitorexit     
		return;
	//  187  383:return          
		Object obj1;
		obj1;
	//  188  384:astore_3        
		intent;
	//  189  385:aload_1         
		JVM INSTR monitorexit ;
	//  190  386:monitorexit     
		throw obj1;
	//  191  387:aload_3         
	//  192  388:athrow          
		obj1;
	//  193  389:astore_3        
		intent = ((Intent) (LOCK));
	//  194  390:getstatic       #30  <Field Object LOCK>
	//  195  393:astore_1        
		intent;
	//  196  394:aload_1         
		JVM INSTR monitorenter ;
	//  197  395:monitorenter    
		if(sWakeLock != null)
	//* 198  396:getstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
	//* 199  399:ifnull          420
		{
			Log.v("GCMBaseIntentService", "Releasing wakelock");
	//  200  402:ldc1            #15  <String "GCMBaseIntentService">
	//  201  404:ldc2            #310 <String "Releasing wakelock">
	//  202  407:invokestatic    #110 <Method int Log.v(String, String)>
	//  203  410:pop             
			sWakeLock.release();
	//  204  411:getstatic       #229 <Field android.os.PowerManager$WakeLock sWakeLock>
	//  205  414:invokevirtual   #313 <Method void android.os.PowerManager$WakeLock.release()>
			break MISSING_BLOCK_LABEL_429;
	//  206  417:goto            429
		}
		Log.e("GCMBaseIntentService", "Wakelock reference is null");
	//  207  420:ldc1            #15  <String "GCMBaseIntentService">
	//  208  422:ldc2            #315 <String "Wakelock reference is null">
	//  209  425:invokestatic    #301 <Method int Log.e(String, String)>
	//  210  428:pop             
		intent;
	//  211  429:aload_1         
		JVM INSTR monitorexit ;
	//  212  430:monitorexit     
		throw obj1;
	//  213  431:aload_3         
	//  214  432:athrow          
		obj1;
	//  215  433:astore_3        
		intent;
	//  216  434:aload_1         
		JVM INSTR monitorexit ;
	//  217  435:monitorexit     
		throw obj1;
	//  218  436:aload_3         
	//  219  437:athrow          
		obj1;
	//  220  438:astore_3        
		if(true) goto _L15; else goto _L14
_L14:
	//* 221  439:goto            133
	}

	protected abstract void onMessage(Context context, Intent intent);

	protected boolean onRecoverableError(Context context, String s)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected abstract void onRegistered(Context context, String s);

	protected abstract void onUnregistered(Context context, String s);

	private static final String EXTRA_TOKEN = "token";
	private static final Object LOCK = com/google/android/gcm/GCMBaseIntentService;
	private static final int MAX_BACKOFF_MS;
	public static final String TAG = "GCMBaseIntentService";
	private static final String TOKEN;
	private static final String WAKELOCK_KEY = "GCM_LIB";
	private static int sCounter;
	private static final Random sRandom;
	private static android.os.PowerManager.WakeLock sWakeLock;
	private final String mSenderIds[];

	static 
	{
	//    0    0:ldc1            #2   <Class GCMBaseIntentService>
	//    1    2:putstatic       #30  <Field Object LOCK>
		sRandom = new Random();
	//    2    5:new             #32  <Class Random>
	//    3    8:dup             
	//    4    9:invokespecial   #35  <Method void Random()>
	//    5   12:putstatic       #37  <Field Random sRandom>
		MAX_BACKOFF_MS = (int)TimeUnit.SECONDS.toMillis(3600L);
	//    6   15:getstatic       #43  <Field TimeUnit TimeUnit.SECONDS>
	//    7   18:ldc2w           #44  <Long 3600L>
	//    8   21:invokevirtual   #49  <Method long TimeUnit.toMillis(long)>
	//    9   24:l2i             
	//   10   25:putstatic       #51  <Field int MAX_BACKOFF_MS>
		TOKEN = Long.toBinaryString(sRandom.nextLong());
	//   11   28:getstatic       #37  <Field Random sRandom>
	//   12   31:invokevirtual   #55  <Method long Random.nextLong()>
	//   13   34:invokestatic    #61  <Method String Long.toBinaryString(long)>
	//   14   37:putstatic       #63  <Field String TOKEN>
	//*  15   40:return          
	}
}
