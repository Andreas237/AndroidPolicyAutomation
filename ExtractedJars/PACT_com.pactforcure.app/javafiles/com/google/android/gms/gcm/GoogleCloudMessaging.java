// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.gcm;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.*;
import android.util.Log;
import com.google.android.gms.iid.*;
import java.io.IOException;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.gms.gcm:
//			zza

public class GoogleCloudMessaging
{

	public GoogleCloudMessaging()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #71  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #73  <Class LinkedBlockingQueue>
	//    4    8:dup             
	//    5    9:invokespecial   #74  <Method void LinkedBlockingQueue()>
	//    6   12:putfield        #76  <Field BlockingQueue zzbgd>
		zzbgb = Collections.synchronizedMap(((Map) (new HashMap())));
	//    7   15:aload_0         
	//    8   16:new             #78  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #79  <Method void HashMap()>
	//   11   23:invokestatic    #85  <Method Map Collections.synchronizedMap(Map)>
	//   12   26:putfield        #87  <Field Map zzbgb>
	//   13   29:aload_0         
	//   14   30:new             #89  <Class Messenger>
	//   15   33:dup             
	//   16   34:new             #6   <Class GoogleCloudMessaging$1>
	//   17   37:dup             
	//   18   38:aload_0         
	//   19   39:invokestatic    #95  <Method Looper Looper.getMainLooper()>
	//   20   42:invokespecial   #98  <Method void GoogleCloudMessaging$1(GoogleCloudMessaging, Looper)>
	//   21   45:invokespecial   #101 <Method void Messenger(Handler)>
	//   22   48:putfield        #103 <Field Messenger zzbge>
	//   23   51:return          
	}

	public static GoogleCloudMessaging getInstance(Context context)
	{
		com/google/android/gms/gcm/GoogleCloudMessaging;
	//    0    0:ldc1            #2   <Class GoogleCloudMessaging>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		if(zzbfZ == null)
	//*   2    3:getstatic       #107 <Field GoogleCloudMessaging zzbfZ>
	//*   3    6:ifnonnull       29
		{
			zzbfZ = new GoogleCloudMessaging();
	//    4    9:new             #2   <Class GoogleCloudMessaging>
	//    5   12:dup             
	//    6   13:invokespecial   #108 <Method void GoogleCloudMessaging()>
	//    7   16:putstatic       #107 <Field GoogleCloudMessaging zzbfZ>
			zzbfZ.zzqr = context.getApplicationContext();
	//    8   19:getstatic       #107 <Field GoogleCloudMessaging zzbfZ>
	//    9   22:aload_0         
	//   10   23:invokevirtual   #114 <Method Context Context.getApplicationContext()>
	//   11   26:putfield        #116 <Field Context zzqr>
		}
		context = ((Context) (zzbfZ));
	//   12   29:getstatic       #107 <Field GoogleCloudMessaging zzbfZ>
	//   13   32:astore_0        
		com/google/android/gms/gcm/GoogleCloudMessaging;
	//   14   33:ldc1            #2   <Class GoogleCloudMessaging>
		JVM INSTR monitorexit ;
	//   15   35:monitorexit     
		return ((GoogleCloudMessaging) (context));
	//   16   36:aload_0         
	//   17   37:areturn         
		context;
	//   18   38:astore_0        
	//*  19   39:ldc1            #2   <Class GoogleCloudMessaging>
		throw context;
	//   20   41:monitorexit     
	//   21   42:aload_0         
	//   22   43:athrow          
	}

	private String zzGe()
	{
		String s = String.valueOf("google.rpc");
	//    0    0:ldc1            #120 <String "google.rpc">
	//    1    2:invokestatic    #126 <Method String String.valueOf(Object)>
	//    2    5:astore_1        
		String s1 = String.valueOf(((Object) (String.valueOf(zzbgc.getAndIncrement()))));
	//    3    6:getstatic       #68  <Field AtomicInteger zzbgc>
	//    4    9:invokevirtual   #130 <Method int AtomicInteger.getAndIncrement()>
	//    5   12:invokestatic    #133 <Method String String.valueOf(int)>
	//    6   15:invokestatic    #126 <Method String String.valueOf(Object)>
	//    7   18:astore_2        
		if(s1.length() != 0)
	//*   8   19:aload_2         
	//*   9   20:invokevirtual   #136 <Method int String.length()>
	//*  10   23:ifeq            32
			return s.concat(s1);
	//   11   26:aload_1         
	//   12   27:aload_2         
	//   13   28:invokevirtual   #140 <Method String String.concat(String)>
	//   14   31:areturn         
		else
			return new String(s);
	//   15   32:new             #122 <Class String>
	//   16   35:dup             
	//   17   36:aload_1         
	//   18   37:invokespecial   #143 <Method void String(String)>
	//   19   40:areturn         
	}

	static String zza(Intent intent, String s)
		throws IOException
	{
		if(intent == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       14
			throw new IOException("SERVICE_NOT_AVAILABLE");
	//    2    4:new             #147 <Class IOException>
	//    3    7:dup             
	//    4    8:ldc1            #13  <String "SERVICE_NOT_AVAILABLE">
	//    5   10:invokespecial   #148 <Method void IOException(String)>
	//    6   13:athrow          
		s = intent.getStringExtra(s);
	//    7   14:aload_0         
	//    8   15:aload_1         
	//    9   16:invokevirtual   #153 <Method String Intent.getStringExtra(String)>
	//   10   19:astore_1        
		if(s != null)
	//*  11   20:aload_1         
	//*  12   21:ifnull          26
			return s;
	//   13   24:aload_1         
	//   14   25:areturn         
		intent = ((Intent) (intent.getStringExtra("error")));
	//   15   26:aload_0         
	//   16   27:ldc1            #155 <String "error">
	//   17   29:invokevirtual   #153 <Method String Intent.getStringExtra(String)>
	//   18   32:astore_0        
		if(intent != null)
	//*  19   33:aload_0         
	//*  20   34:ifnull          46
			throw new IOException(((String) (intent)));
	//   21   37:new             #147 <Class IOException>
	//   22   40:dup             
	//   23   41:aload_0         
	//   24   42:invokespecial   #148 <Method void IOException(String)>
	//   25   45:athrow          
		else
			throw new IOException("SERVICE_NOT_AVAILABLE");
	//   26   46:new             #147 <Class IOException>
	//   27   49:dup             
	//   28   50:ldc1            #13  <String "SERVICE_NOT_AVAILABLE">
	//   29   52:invokespecial   #148 <Method void IOException(String)>
	//   30   55:athrow          
	}

	static BlockingQueue zza(GoogleCloudMessaging googlecloudmessaging)
	{
		return googlecloudmessaging.zzbgd;
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field BlockingQueue zzbgd>
	//    2    4:areturn         
	}

	private void zza(String s, String s1, long l, int i, Bundle bundle)
		throws IOException
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       14
			throw new IllegalArgumentException("Missing 'to'");
	//    2    4:new             #160 <Class IllegalArgumentException>
	//    3    7:dup             
	//    4    8:ldc1            #162 <String "Missing 'to'">
	//    5   10:invokespecial   #163 <Method void IllegalArgumentException(String)>
	//    6   13:athrow          
		String s2 = zzbd(zzqr);
	//    7   14:aload_0         
	//    8   15:getfield        #116 <Field Context zzqr>
	//    9   18:invokestatic    #167 <Method String zzbd(Context)>
	//   10   21:astore          7
		if(s2 == null)
	//*  11   23:aload           7
	//*  12   25:ifnonnull       38
			throw new IOException("SERVICE_NOT_AVAILABLE");
	//   13   28:new             #147 <Class IOException>
	//   14   31:dup             
	//   15   32:ldc1            #13  <String "SERVICE_NOT_AVAILABLE">
	//   16   34:invokespecial   #148 <Method void IOException(String)>
	//   17   37:athrow          
		Object obj = ((Object) (new Intent("com.google.android.gcm.intent.SEND")));
	//   18   38:new             #150 <Class Intent>
	//   19   41:dup             
	//   20   42:ldc1            #169 <String "com.google.android.gcm.intent.SEND">
	//   21   44:invokespecial   #170 <Method void Intent(String)>
	//   22   47:astore          8
		if(bundle != null)
	//*  23   49:aload           6
	//*  24   51:ifnull          62
			((Intent) (obj)).putExtras(bundle);
	//   25   54:aload           8
	//   26   56:aload           6
	//   27   58:invokevirtual   #174 <Method Intent Intent.putExtras(Bundle)>
	//   28   61:pop             
		zzr(((Intent) (obj)));
	//   29   62:aload_0         
	//   30   63:aload           8
	//   31   65:invokevirtual   #178 <Method void zzr(Intent)>
		((Intent) (obj)).setPackage(s2);
	//   32   68:aload           8
	//   33   70:aload           7
	//   34   72:invokevirtual   #182 <Method Intent Intent.setPackage(String)>
	//   35   75:pop             
		((Intent) (obj)).putExtra("google.to", s);
	//   36   76:aload           8
	//   37   78:ldc1            #184 <String "google.to">
	//   38   80:aload_1         
	//   39   81:invokevirtual   #188 <Method Intent Intent.putExtra(String, String)>
	//   40   84:pop             
		((Intent) (obj)).putExtra("google.message_id", s1);
	//   41   85:aload           8
	//   42   87:ldc1            #190 <String "google.message_id">
	//   43   89:aload_2         
	//   44   90:invokevirtual   #188 <Method Intent Intent.putExtra(String, String)>
	//   45   93:pop             
		((Intent) (obj)).putExtra("google.ttl", Long.toString(l));
	//   46   94:aload           8
	//   47   96:ldc1            #192 <String "google.ttl">
	//   48   98:lload_3         
	//   49   99:invokestatic    #198 <Method String Long.toString(long)>
	//   50  102:invokevirtual   #188 <Method Intent Intent.putExtra(String, String)>
	//   51  105:pop             
		((Intent) (obj)).putExtra("google.delay", Integer.toString(i));
	//   52  106:aload           8
	//   53  108:ldc1            #200 <String "google.delay">
	//   54  110:iload           5
	//   55  112:invokestatic    #204 <Method String Integer.toString(int)>
	//   56  115:invokevirtual   #188 <Method Intent Intent.putExtra(String, String)>
	//   57  118:pop             
		((Intent) (obj)).putExtra("google.from", zzeI(s));
	//   58  119:aload           8
	//   59  121:ldc1            #206 <String "google.from">
	//   60  123:aload_0         
	//   61  124:aload_1         
	//   62  125:invokespecial   #209 <Method String zzeI(String)>
	//   63  128:invokevirtual   #188 <Method Intent Intent.putExtra(String, String)>
	//   64  131:pop             
		if(s2.contains(".gsf"))
	//*  65  132:aload           7
	//*  66  134:ldc1            #211 <String ".gsf">
	//*  67  136:invokevirtual   #215 <Method boolean String.contains(CharSequence)>
	//*  68  139:ifeq            289
		{
			obj = ((Object) (new Bundle()));
	//   69  142:new             #217 <Class Bundle>
	//   70  145:dup             
	//   71  146:invokespecial   #218 <Method void Bundle()>
	//   72  149:astore          8
			Iterator iterator = bundle.keySet().iterator();
	//   73  151:aload           6
	//   74  153:invokevirtual   #222 <Method Set Bundle.keySet()>
	//   75  156:invokeinterface #228 <Method Iterator Set.iterator()>
	//   76  161:astore          9
			do
			{
				if(!iterator.hasNext())
					break;
	//   77  163:aload           9
	//   78  165:invokeinterface #234 <Method boolean Iterator.hasNext()>
	//   79  170:ifeq            255
				String s3 = (String)iterator.next();
	//   80  173:aload           9
	//   81  175:invokeinterface #238 <Method Object Iterator.next()>
	//   82  180:checkcast       #122 <Class String>
	//   83  183:astore          7
				Object obj1 = bundle.get(s3);
	//   84  185:aload           6
	//   85  187:aload           7
	//   86  189:invokevirtual   #242 <Method Object Bundle.get(String)>
	//   87  192:astore          10
				if(obj1 instanceof String)
	//*  88  194:aload           10
	//*  89  196:instanceof      #122 <Class String>
	//*  90  199:ifeq            163
				{
					s3 = String.valueOf(((Object) (s3)));
	//   91  202:aload           7
	//   92  204:invokestatic    #126 <Method String String.valueOf(Object)>
	//   93  207:astore          7
					if(s3.length() != 0)
	//*  94  209:aload           7
	//*  95  211:invokevirtual   #136 <Method int String.length()>
	//*  96  214:ifeq            241
						s3 = "gcm.".concat(s3);
	//   97  217:ldc1            #244 <String "gcm.">
	//   98  219:aload           7
	//   99  221:invokevirtual   #140 <Method String String.concat(String)>
	//  100  224:astore          7
					else
	//* 101  226:aload           8
	//* 102  228:aload           7
	//* 103  230:aload           10
	//* 104  232:checkcast       #122 <Class String>
	//* 105  235:invokevirtual   #248 <Method void Bundle.putString(String, String)>
	//* 106  238:goto            163
						s3 = new String("gcm.");
	//  107  241:new             #122 <Class String>
	//  108  244:dup             
	//  109  245:ldc1            #244 <String "gcm.">
	//  110  247:invokespecial   #143 <Method void String(String)>
	//  111  250:astore          7
					((Bundle) (obj)).putString(s3, (String)obj1);
				}
			} while(true);
	//  112  252:goto            226
			((Bundle) (obj)).putString("google.to", s);
	//  113  255:aload           8
	//  114  257:ldc1            #184 <String "google.to">
	//  115  259:aload_1         
	//  116  260:invokevirtual   #248 <Method void Bundle.putString(String, String)>
			((Bundle) (obj)).putString("google.message_id", s1);
	//  117  263:aload           8
	//  118  265:ldc1            #190 <String "google.message_id">
	//  119  267:aload_2         
	//  120  268:invokevirtual   #248 <Method void Bundle.putString(String, String)>
			InstanceID.getInstance(zzqr).zzc("GCM", "upstream", ((Bundle) (obj)));
	//  121  271:aload_0         
	//  122  272:getfield        #116 <Field Context zzqr>
	//  123  275:invokestatic    #253 <Method InstanceID InstanceID.getInstance(Context)>
	//  124  278:ldc1            #16  <String "GCM">
	//  125  280:ldc1            #255 <String "upstream">
	//  126  282:aload           8
	//  127  284:invokevirtual   #259 <Method String InstanceID.zzc(String, String, Bundle)>
	//  128  287:pop             
			return;
	//  129  288:return          
		} else
		{
			zzqr.sendOrderedBroadcast(((Intent) (obj)), "com.google.android.gtalkservice.permission.GTALK_SERVICE");
	//  130  289:aload_0         
	//  131  290:getfield        #116 <Field Context zzqr>
	//  132  293:aload           8
	//  133  295:ldc2            #261 <String "com.google.android.gtalkservice.permission.GTALK_SERVICE">
	//  134  298:invokevirtual   #265 <Method void Context.sendOrderedBroadcast(Intent, String)>
			return;
	//  135  301:return          
		}
	}

	static boolean zza(GoogleCloudMessaging googlecloudmessaging, Intent intent)
	{
		return googlecloudmessaging.zzq(intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #270 <Method boolean zzq(Intent)>
	//    3    5:ireturn         
	}

	static Context zzb(GoogleCloudMessaging googlecloudmessaging)
	{
		return googlecloudmessaging.zzqr;
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field Context zzqr>
	//    2    4:areturn         
	}

	public static String zzbd(Context context)
	{
		return zzc.zzbi(context);
	//    0    0:aload_0         
	//    1    1:invokestatic    #277 <Method String zzc.zzbi(Context)>
	//    2    4:areturn         
	}

	public static int zzbe(Context context)
	{
		PackageManager packagemanager;
		packagemanager = context.getPackageManager();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #285 <Method PackageManager Context.getPackageManager()>
	//    2    4:astore_2        
		context = ((Context) (zzbd(context)));
	//    3    5:aload_0         
	//    4    6:invokestatic    #167 <Method String zzbd(Context)>
	//    5    9:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_33;
	//    6   10:aload_0         
	//    7   11:ifnull          33
		context = ((Context) (packagemanager.getPackageInfo(((String) (context)), 0)));
	//    8   14:aload_2         
	//    9   15:aload_0         
	//   10   16:iconst_0        
	//   11   17:invokevirtual   #291 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   12   20:astore_0        
		if(context == null)
			break MISSING_BLOCK_LABEL_33;
	//   13   21:aload_0         
	//   14   22:ifnull          33
		int i = ((PackageInfo) (context)).versionCode;
	//   15   25:aload_0         
	//   16   26:getfield        #296 <Field int PackageInfo.versionCode>
	//   17   29:istore_1        
		return i;
	//   18   30:iload_1         
	//   19   31:ireturn         
		context;
	//   20   32:astore_0        
		return -1;
	//   21   33:iconst_m1       
	//   22   34:ireturn         
	}

	private String zzeI(String s)
	{
		int i = s.indexOf('@');
	//    0    0:aload_1         
	//    1    1:bipush          64
	//    2    3:invokevirtual   #300 <Method int String.indexOf(int)>
	//    3    6:istore_2        
		String s1 = s;
	//    4    7:aload_1         
	//    5    8:astore_3        
		if(i > 0)
	//*   6    9:iload_2         
	//*   7   10:ifle            20
			s1 = s.substring(0, i);
	//    8   13:aload_1         
	//    9   14:iconst_0        
	//   10   15:iload_2         
	//   11   16:invokevirtual   #304 <Method String String.substring(int, int)>
	//   12   19:astore_3        
		return InstanceID.getInstance(zzqr).zzGv().zzh("", s1, "GCM");
	//   13   20:aload_0         
	//   14   21:getfield        #116 <Field Context zzqr>
	//   15   24:invokestatic    #253 <Method InstanceID InstanceID.getInstance(Context)>
	//   16   27:invokevirtual   #308 <Method zzd InstanceID.zzGv()>
	//   17   30:ldc2            #310 <String "">
	//   18   33:aload_3         
	//   19   34:ldc1            #16  <String "GCM">
	//   20   36:invokevirtual   #316 <Method String zzd.zzh(String, String, String)>
	//   21   39:areturn         
	}

	private boolean zzq(Intent intent)
	{
		String s = intent.getStringExtra("In-Reply-To");
	//    0    0:aload_1         
	//    1    1:ldc2            #318 <String "In-Reply-To">
	//    2    4:invokevirtual   #153 <Method String Intent.getStringExtra(String)>
	//    3    7:astore_3        
		Object obj = ((Object) (s));
	//    4    8:aload_3         
	//    5    9:astore_2        
		if(s == null)
	//*   6   10:aload_3         
	//*   7   11:ifnonnull       32
		{
			obj = ((Object) (s));
	//    8   14:aload_3         
	//    9   15:astore_2        
			if(intent.hasExtra("error"))
	//*  10   16:aload_1         
	//*  11   17:ldc1            #155 <String "error">
	//*  12   19:invokevirtual   #322 <Method boolean Intent.hasExtra(String)>
	//*  13   22:ifeq            32
				obj = ((Object) (intent.getStringExtra("google.message_id")));
	//   14   25:aload_1         
	//   15   26:ldc1            #190 <String "google.message_id">
	//   16   28:invokevirtual   #153 <Method String Intent.getStringExtra(String)>
	//   17   31:astore_2        
		}
		if(obj != null)
	//*  18   32:aload_2         
	//*  19   33:ifnull          69
		{
			obj = ((Object) ((Handler)zzbgb.remove(obj)));
	//   20   36:aload_0         
	//   21   37:getfield        #87  <Field Map zzbgb>
	//   22   40:aload_2         
	//   23   41:invokeinterface #328 <Method Object Map.remove(Object)>
	//   24   46:checkcast       #330 <Class Handler>
	//   25   49:astore_2        
			if(obj != null)
	//*  26   50:aload_2         
	//*  27   51:ifnull          69
			{
				Message message = Message.obtain();
	//   28   54:invokestatic    #336 <Method Message Message.obtain()>
	//   29   57:astore_3        
				message.obj = ((Object) (intent));
	//   30   58:aload_3         
	//   31   59:aload_1         
	//   32   60:putfield        #340 <Field Object Message.obj>
				return ((Handler) (obj)).sendMessage(message);
	//   33   63:aload_2         
	//   34   64:aload_3         
	//   35   65:invokevirtual   #344 <Method boolean Handler.sendMessage(Message)>
	//   36   68:ireturn         
			}
		}
		return false;
	//   37   69:iconst_0        
	//   38   70:ireturn         
	}

	public void close()
	{
		zzbfZ = null;
	//    0    0:aconst_null     
	//    1    1:putstatic       #107 <Field GoogleCloudMessaging zzbfZ>
		zza.zzbfM = null;
	//    2    4:aconst_null     
	//    3    5:putstatic       #351 <Field zza zza.zzbfM>
		zzGf();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #354 <Method void zzGf()>
	//    6   12:return          
	}

	public String getMessageType(Intent intent)
	{
		if(!"com.google.android.c2dm.intent.RECEIVE".equals(((Object) (intent.getAction()))))
	//*   0    0:ldc2            #358 <String "com.google.android.c2dm.intent.RECEIVE">
	//*   1    3:aload_1         
	//*   2    4:invokevirtual   #361 <Method String Intent.getAction()>
	//*   3    7:invokevirtual   #365 <Method boolean String.equals(Object)>
	//*   4   10:ifne            17
		{
			intent = null;
	//    5   13:aconst_null     
	//    6   14:astore_1        
		} else
	//*   7   15:aload_1         
	//*   8   16:areturn         
		{
			String s = intent.getStringExtra("message_type");
	//    9   17:aload_1         
	//   10   18:ldc2            #367 <String "message_type">
	//   11   21:invokevirtual   #153 <Method String Intent.getStringExtra(String)>
	//   12   24:astore_2        
			intent = ((Intent) (s));
	//   13   25:aload_2         
	//   14   26:astore_1        
			if(s == null)
	//*  15   27:aload_2         
	//*  16   28:ifnonnull       15
				return "gcm";
	//   17   31:ldc1            #23  <String "gcm">
	//   18   33:areturn         
		}
		return ((String) (intent));
	}

	public transient String register(String as[])
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		String s = zzbd(zzqr);
	//    2    2:aload_0         
	//    3    3:getfield        #116 <Field Context zzqr>
	//    4    6:invokestatic    #167 <Method String zzbd(Context)>
	//    5    9:astore_2        
		if(s != null)
			break MISSING_BLOCK_LABEL_29;
	//    6   10:aload_2         
	//    7   11:ifnonnull       29
		throw new IOException("SERVICE_NOT_AVAILABLE");
	//    8   14:new             #147 <Class IOException>
	//    9   17:dup             
	//   10   18:ldc1            #13  <String "SERVICE_NOT_AVAILABLE">
	//   11   20:invokespecial   #148 <Method void IOException(String)>
	//   12   23:athrow          
		as;
	//   13   24:astore_1        
		this;
	//   14   25:aload_0         
		JVM INSTR monitorexit ;
	//   15   26:monitorexit     
		throw as;
	//   16   27:aload_1         
	//   17   28:athrow          
		Bundle bundle;
		as = ((String []) (zzf(as)));
	//   18   29:aload_0         
	//   19   30:aload_1         
	//   20   31:invokevirtual   #375 <Method String zzf(String[])>
	//   21   34:astore_1        
		bundle = new Bundle();
	//   22   35:new             #217 <Class Bundle>
	//   23   38:dup             
	//   24   39:invokespecial   #218 <Method void Bundle()>
	//   25   42:astore_3        
		if(!s.contains(".gsf"))
			break MISSING_BLOCK_LABEL_79;
	//   26   43:aload_2         
	//   27   44:ldc1            #211 <String ".gsf">
	//   28   46:invokevirtual   #215 <Method boolean String.contains(CharSequence)>
	//   29   49:ifeq            79
		bundle.putString("legacy.sender", ((String) (as)));
	//   30   52:aload_3         
	//   31   53:ldc2            #377 <String "legacy.sender">
	//   32   56:aload_1         
	//   33   57:invokevirtual   #248 <Method void Bundle.putString(String, String)>
		as = ((String []) (InstanceID.getInstance(zzqr).getToken(((String) (as)), "GCM", bundle)));
	//   34   60:aload_0         
	//   35   61:getfield        #116 <Field Context zzqr>
	//   36   64:invokestatic    #253 <Method InstanceID InstanceID.getInstance(Context)>
	//   37   67:aload_1         
	//   38   68:ldc1            #16  <String "GCM">
	//   39   70:aload_3         
	//   40   71:invokevirtual   #380 <Method String InstanceID.getToken(String, String, Bundle)>
	//   41   74:astore_1        
_L1:
		this;
	//   42   75:aload_0         
		JVM INSTR monitorexit ;
	//   43   76:monitorexit     
		return ((String) (as));
	//   44   77:aload_1         
	//   45   78:areturn         
		bundle.putString("sender", ((String) (as)));
	//   46   79:aload_3         
	//   47   80:ldc2            #382 <String "sender">
	//   48   83:aload_1         
	//   49   84:invokevirtual   #248 <Method void Bundle.putString(String, String)>
		as = ((String []) (zza(zzJ(bundle), "registration_id")));
	//   50   87:aload_0         
	//   51   88:aload_3         
	//   52   89:invokevirtual   #385 <Method Intent zzJ(Bundle)>
	//   53   92:ldc2            #387 <String "registration_id">
	//   54   95:invokestatic    #389 <Method String zza(Intent, String)>
	//   55   98:astore_1        
		  goto _L1
	//*  56   99:goto            75
	}

	public void send(String s, String s1, long l, Bundle bundle)
		throws IOException
	{
		zza(s, s1, l, -1, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:lload_3         
	//    4    4:iconst_m1       
	//    5    5:aload           5
	//    6    7:invokespecial   #395 <Method void zza(String, String, long, int, Bundle)>
	//    7   10:return          
	}

	public void send(String s, String s1, Bundle bundle)
		throws IOException
	{
		send(s, s1, -1L, bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc2w           #397 <Long -1L>
	//    4    6:aload_3         
	//    5    7:invokevirtual   #400 <Method void send(String, String, long, Bundle)>
	//    6   10:return          
	}

	public void unregister()
		throws IOException
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(Looper.getMainLooper() == Looper.myLooper())
	//*   2    2:invokestatic    #95  <Method Looper Looper.getMainLooper()>
	//*   3    5:invokestatic    #404 <Method Looper Looper.myLooper()>
	//*   4    8:if_acmpne       26
			throw new IOException("MAIN_THREAD");
	//    5   11:new             #147 <Class IOException>
	//    6   14:dup             
	//    7   15:ldc1            #10  <String "MAIN_THREAD">
	//    8   17:invokespecial   #148 <Method void IOException(String)>
	//    9   20:athrow          
		break MISSING_BLOCK_LABEL_26;
		Exception exception;
		exception;
	//   10   21:astore_1        
		this;
	//   11   22:aload_0         
		JVM INSTR monitorexit ;
	//   12   23:monitorexit     
		throw exception;
	//   13   24:aload_1         
	//   14   25:athrow          
		InstanceID.getInstance(zzqr).deleteInstanceID();
	//   15   26:aload_0         
	//   16   27:getfield        #116 <Field Context zzqr>
	//   17   30:invokestatic    #253 <Method InstanceID InstanceID.getInstance(Context)>
	//   18   33:invokevirtual   #407 <Method void InstanceID.deleteInstanceID()>
		this;
	//   19   36:aload_0         
		JVM INSTR monitorexit ;
	//   20   37:monitorexit     
	//   21   38:return          
	}

	void zzGf()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzbga != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #409 <Field PendingIntent zzbga>
	//*   4    6:ifnull          21
		{
			zzbga.cancel();
	//    5    9:aload_0         
	//    6   10:getfield        #409 <Field PendingIntent zzbga>
	//    7   13:invokevirtual   #414 <Method void PendingIntent.cancel()>
			zzbga = null;
	//    8   16:aload_0         
	//    9   17:aconst_null     
	//   10   18:putfield        #409 <Field PendingIntent zzbga>
		}
		this;
	//   11   21:aload_0         
		JVM INSTR monitorexit ;
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		Exception exception;
		exception;
	//   14   24:astore_1        
	//*  15   25:aload_0         
		throw exception;
	//   16   26:monitorexit     
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	Intent zzJ(Bundle bundle)
		throws IOException
	{
		if(Looper.getMainLooper() == Looper.myLooper())
	//*   0    0:invokestatic    #95  <Method Looper Looper.getMainLooper()>
	//*   1    3:invokestatic    #404 <Method Looper Looper.myLooper()>
	//*   2    6:if_acmpne       19
			throw new IOException("MAIN_THREAD");
	//    3    9:new             #147 <Class IOException>
	//    4   12:dup             
	//    5   13:ldc1            #10  <String "MAIN_THREAD">
	//    6   15:invokespecial   #148 <Method void IOException(String)>
	//    7   18:athrow          
		if(zzbe(zzqr) < 0)
	//*   8   19:aload_0         
	//*   9   20:getfield        #116 <Field Context zzqr>
	//*  10   23:invokestatic    #418 <Method int zzbe(Context)>
	//*  11   26:ifge            40
			throw new IOException("Google Play Services missing");
	//   12   29:new             #147 <Class IOException>
	//   13   32:dup             
	//   14   33:ldc2            #420 <String "Google Play Services missing">
	//   15   36:invokespecial   #148 <Method void IOException(String)>
	//   16   39:athrow          
		Bundle bundle1 = bundle;
	//   17   40:aload_1         
	//   18   41:astore_2        
		if(bundle == null)
	//*  19   42:aload_1         
	//*  20   43:ifnonnull       54
			bundle1 = new Bundle();
	//   21   46:new             #217 <Class Bundle>
	//   22   49:dup             
	//   23   50:invokespecial   #218 <Method void Bundle()>
	//   24   53:astore_2        
		bundle = ((Bundle) (new Intent("com.google.android.c2dm.intent.REGISTER")));
	//   25   54:new             #150 <Class Intent>
	//   26   57:dup             
	//   27   58:ldc2            #422 <String "com.google.android.c2dm.intent.REGISTER">
	//   28   61:invokespecial   #170 <Method void Intent(String)>
	//   29   64:astore_1        
		((Intent) (bundle)).setPackage(zzbd(zzqr));
	//   30   65:aload_1         
	//   31   66:aload_0         
	//   32   67:getfield        #116 <Field Context zzqr>
	//   33   70:invokestatic    #167 <Method String zzbd(Context)>
	//   34   73:invokevirtual   #182 <Method Intent Intent.setPackage(String)>
	//   35   76:pop             
		zzr(((Intent) (bundle)));
	//   36   77:aload_0         
	//   37   78:aload_1         
	//   38   79:invokevirtual   #178 <Method void zzr(Intent)>
		((Intent) (bundle)).putExtra("google.message_id", zzGe());
	//   39   82:aload_1         
	//   40   83:ldc1            #190 <String "google.message_id">
	//   41   85:aload_0         
	//   42   86:invokespecial   #424 <Method String zzGe()>
	//   43   89:invokevirtual   #188 <Method Intent Intent.putExtra(String, String)>
	//   44   92:pop             
		((Intent) (bundle)).putExtras(bundle1);
	//   45   93:aload_1         
	//   46   94:aload_2         
	//   47   95:invokevirtual   #174 <Method Intent Intent.putExtras(Bundle)>
	//   48   98:pop             
		((Intent) (bundle)).putExtra("google.messenger", ((android.os.Parcelable) (zzbge)));
	//   49   99:aload_1         
	//   50  100:ldc2            #426 <String "google.messenger">
	//   51  103:aload_0         
	//   52  104:getfield        #103 <Field Messenger zzbge>
	//   53  107:invokevirtual   #429 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   54  110:pop             
		zzqr.startService(((Intent) (bundle)));
	//   55  111:aload_0         
	//   56  112:getfield        #116 <Field Context zzqr>
	//   57  115:aload_1         
	//   58  116:invokevirtual   #433 <Method android.content.ComponentName Context.startService(Intent)>
	//   59  119:pop             
		try
		{
			bundle = ((Bundle) ((Intent)zzbgd.poll(30000L, TimeUnit.MILLISECONDS)));
	//   60  120:aload_0         
	//   61  121:getfield        #76  <Field BlockingQueue zzbgd>
	//   62  124:ldc2w           #434 <Long 30000L>
	//   63  127:getstatic       #441 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   64  130:invokeinterface #447 <Method Object BlockingQueue.poll(long, TimeUnit)>
	//   65  135:checkcast       #150 <Class Intent>
	//   66  138:astore_1        
		}
	//*  67  139:aload_1         
	//*  68  140:areturn         
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  69  141:astore_1        
		{
			throw new IOException(((InterruptedException) (bundle)).getMessage());
	//   70  142:new             #147 <Class IOException>
	//   71  145:dup             
	//   72  146:aload_1         
	//   73  147:invokevirtual   #450 <Method String InterruptedException.getMessage()>
	//   74  150:invokespecial   #148 <Method void IOException(String)>
	//   75  153:athrow          
		}
		return ((Intent) (bundle));
	}

	transient String zzf(String as[])
	{
		if(as == null || as.length == 0)
	//*   0    0:aload_1         
	//*   1    1:ifnull          9
	//*   2    4:aload_1         
	//*   3    5:arraylength     
	//*   4    6:ifne            20
			throw new IllegalArgumentException("No senderIds");
	//    5    9:new             #160 <Class IllegalArgumentException>
	//    6   12:dup             
	//    7   13:ldc2            #452 <String "No senderIds">
	//    8   16:invokespecial   #163 <Method void IllegalArgumentException(String)>
	//    9   19:athrow          
		StringBuilder stringbuilder = new StringBuilder(as[0]);
	//   10   20:new             #454 <Class StringBuilder>
	//   11   23:dup             
	//   12   24:aload_1         
	//   13   25:iconst_0        
	//   14   26:aaload          
	//   15   27:invokespecial   #455 <Method void StringBuilder(String)>
	//   16   30:astore_3        
		for(int i = 1; i < as.length; i++)
	//*  17   31:iconst_1        
	//*  18   32:istore_2        
	//*  19   33:iload_2         
	//*  20   34:aload_1         
	//*  21   35:arraylength     
	//*  22   36:icmpge          59
			stringbuilder.append(',').append(as[i]);
	//   23   39:aload_3         
	//   24   40:bipush          44
	//   25   42:invokevirtual   #459 <Method StringBuilder StringBuilder.append(char)>
	//   26   45:aload_1         
	//   27   46:iload_2         
	//   28   47:aaload          
	//   29   48:invokevirtual   #462 <Method StringBuilder StringBuilder.append(String)>
	//   30   51:pop             

	//   31   52:iload_2         
	//   32   53:iconst_1        
	//   33   54:iadd            
	//   34   55:istore_2        
	//*  35   56:goto            33
		return stringbuilder.toString();
	//   36   59:aload_3         
	//   37   60:invokevirtual   #464 <Method String StringBuilder.toString()>
	//   38   63:areturn         
	}

	void zzr(Intent intent)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzbga == null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #409 <Field PendingIntent zzbga>
	//*   4    6:ifnonnull       39
		{
			Intent intent1 = new Intent();
	//    5    9:new             #150 <Class Intent>
	//    6   12:dup             
	//    7   13:invokespecial   #465 <Method void Intent()>
	//    8   16:astore_2        
			intent1.setPackage("com.google.example.invalidpackage");
	//    9   17:aload_2         
	//   10   18:ldc2            #467 <String "com.google.example.invalidpackage">
	//   11   21:invokevirtual   #182 <Method Intent Intent.setPackage(String)>
	//   12   24:pop             
			zzbga = PendingIntent.getBroadcast(zzqr, 0, intent1, 0);
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #116 <Field Context zzqr>
	//   16   30:iconst_0        
	//   17   31:aload_2         
	//   18   32:iconst_0        
	//   19   33:invokestatic    #471 <Method PendingIntent PendingIntent.getBroadcast(Context, int, Intent, int)>
	//   20   36:putfield        #409 <Field PendingIntent zzbga>
		}
		intent.putExtra("app", ((android.os.Parcelable) (zzbga)));
	//   21   39:aload_1         
	//   22   40:ldc2            #473 <String "app">
	//   23   43:aload_0         
	//   24   44:getfield        #409 <Field PendingIntent zzbga>
	//   25   47:invokevirtual   #429 <Method Intent Intent.putExtra(String, android.os.Parcelable)>
	//   26   50:pop             
		this;
	//   27   51:aload_0         
		JVM INSTR monitorexit ;
	//   28   52:monitorexit     
		return;
	//   29   53:return          
		intent;
	//   30   54:astore_1        
	//*  31   55:aload_0         
		throw intent;
	//   32   56:monitorexit     
	//   33   57:aload_1         
	//   34   58:athrow          
	}

	public static final String ERROR_MAIN_THREAD = "MAIN_THREAD";
	public static final String ERROR_SERVICE_NOT_AVAILABLE = "SERVICE_NOT_AVAILABLE";
	public static final String INSTANCE_ID_SCOPE = "GCM";
	public static final String MESSAGE_TYPE_DELETED = "deleted_messages";
	public static final String MESSAGE_TYPE_MESSAGE = "gcm";
	public static final String MESSAGE_TYPE_SEND_ERROR = "send_error";
	public static final String MESSAGE_TYPE_SEND_EVENT = "send_event";
	public static int zzbfW = 0x4c4b40;
	public static int zzbfX = 0x632ea0;
	public static int zzbfY = 0x6acfc0;
	static GoogleCloudMessaging zzbfZ;
	private static final AtomicInteger zzbgc = new AtomicInteger(1);
	private PendingIntent zzbga;
	private Map zzbgb;
	private final BlockingQueue zzbgd = new LinkedBlockingQueue();
	final Messenger zzbge = new Messenger(((Handler) (new Handler(Looper.getMainLooper()) {

		public void handleMessage(Message message)
		{
			if(message == null || !(message.obj instanceof Intent))
		//*   0    0:aload_1         
		//*   1    1:ifnull          14
		//*   2    4:aload_1         
		//*   3    5:getfield        #26  <Field Object Message.obj>
		//*   4    8:instanceof      #28  <Class Intent>
		//*   5   11:ifne            22
				Log.w("GCM", "Dropping invalid message");
		//    6   14:ldc1            #30  <String "GCM">
		//    7   16:ldc1            #32  <String "Dropping invalid message">
		//    8   18:invokestatic    #38  <Method int Log.w(String, String)>
		//    9   21:pop             
			message = ((Message) ((Intent)message.obj));
		//   10   22:aload_1         
		//   11   23:getfield        #26  <Field Object Message.obj>
		//   12   26:checkcast       #28  <Class Intent>
		//   13   29:astore_1        
			if("com.google.android.c2dm.intent.REGISTRATION".equals(((Object) (((Intent) (message)).getAction()))))
		//*  14   30:ldc1            #40  <String "com.google.android.c2dm.intent.REGISTRATION">
		//*  15   32:aload_1         
		//*  16   33:invokevirtual   #44  <Method String Intent.getAction()>
		//*  17   36:invokevirtual   #50  <Method boolean String.equals(Object)>
		//*  18   39:ifeq            57
				GoogleCloudMessaging.zza(zzbgf).add(((Object) (message)));
		//   19   42:aload_0         
		//   20   43:getfield        #14  <Field GoogleCloudMessaging zzbgf>
		//   21   46:invokestatic    #54  <Method BlockingQueue GoogleCloudMessaging.zza(GoogleCloudMessaging)>
		//   22   49:aload_1         
		//   23   50:invokeinterface #59  <Method boolean BlockingQueue.add(Object)>
		//   24   55:pop             
			else
		//*  25   56:return          
			if(!GoogleCloudMessaging.zza(zzbgf, ((Intent) (message))))
		//*  26   57:aload_0         
		//*  27   58:getfield        #14  <Field GoogleCloudMessaging zzbgf>
		//*  28   61:aload_1         
		//*  29   62:invokestatic    #62  <Method boolean GoogleCloudMessaging.zza(GoogleCloudMessaging, Intent)>
		//*  30   65:ifne            56
			{
				((Intent) (message)).setPackage(GoogleCloudMessaging.zzb(zzbgf).getPackageName());
		//   31   68:aload_1         
		//   32   69:aload_0         
		//   33   70:getfield        #14  <Field GoogleCloudMessaging zzbgf>
		//   34   73:invokestatic    #66  <Method Context GoogleCloudMessaging.zzb(GoogleCloudMessaging)>
		//   35   76:invokevirtual   #71  <Method String Context.getPackageName()>
		//   36   79:invokevirtual   #75  <Method Intent Intent.setPackage(String)>
		//   37   82:pop             
				GoogleCloudMessaging.zzb(zzbgf).sendBroadcast(((Intent) (message)));
		//   38   83:aload_0         
		//   39   84:getfield        #14  <Field GoogleCloudMessaging zzbgf>
		//   40   87:invokestatic    #66  <Method Context GoogleCloudMessaging.zzb(GoogleCloudMessaging)>
		//   41   90:aload_1         
		//   42   91:invokevirtual   #79  <Method void Context.sendBroadcast(Intent)>
				return;
		//   43   94:return          
			}
		}

		final GoogleCloudMessaging zzbgf;

			
			{
				zzbgf = GoogleCloudMessaging.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field GoogleCloudMessaging zzbgf>
				super(looper);
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:invokespecial   #17  <Method void Handler(Looper)>
			//    6   10:return          
			}
	}
)));
	private Context zzqr;

	static 
	{
	//    0    0:ldc1            #52  <Int 0x4c4b40>
	//    1    2:putstatic       #54  <Field int zzbfW>
	//    2    5:ldc1            #55  <Int 0x632ea0>
	//    3    7:putstatic       #57  <Field int zzbfX>
	//    4   10:ldc1            #58  <Int 0x6acfc0>
	//    5   12:putstatic       #60  <Field int zzbfY>
	//    6   15:new             #62  <Class AtomicInteger>
	//    7   18:dup             
	//    8   19:iconst_1        
	//    9   20:invokespecial   #66  <Method void AtomicInteger(int)>
	//   10   23:putstatic       #68  <Field AtomicInteger zzbgc>
	//*  11   26:return          
	}
}
