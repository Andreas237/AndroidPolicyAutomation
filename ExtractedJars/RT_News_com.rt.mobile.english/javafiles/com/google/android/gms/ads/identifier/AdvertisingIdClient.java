// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.*;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//			zzb, zza

public class AdvertisingIdClient
{
	public static final class Info
	{

		public final String getId()
		{
			return zzq;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field String zzq>
		//    2    4:areturn         
		}

		public final boolean isLimitAdTrackingEnabled()
		{
			return zzr;
		//    0    0:aload_0         
		//    1    1:getfield        #21  <Field boolean zzr>
		//    2    4:ireturn         
		}

		public final String toString()
		{
			String s = zzq;
		//    0    0:aload_0         
		//    1    1:getfield        #19  <Field String zzq>
		//    2    4:astore_2        
			boolean flag = zzr;
		//    3    5:aload_0         
		//    4    6:getfield        #21  <Field boolean zzr>
		//    5    9:istore_1        
			StringBuilder stringbuilder = new StringBuilder(7 + String.valueOf(((Object) (s))).length());
		//    6   10:new             #29  <Class StringBuilder>
		//    7   13:dup             
		//    8   14:bipush          7
		//    9   16:aload_2         
		//   10   17:invokestatic    #35  <Method String String.valueOf(Object)>
		//   11   20:invokevirtual   #39  <Method int String.length()>
		//   12   23:iadd            
		//   13   24:invokespecial   #42  <Method void StringBuilder(int)>
		//   14   27:astore_3        
			stringbuilder.append("{");
		//   15   28:aload_3         
		//   16   29:ldc1            #44  <String "{">
		//   17   31:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   18   34:pop             
			stringbuilder.append(s);
		//   19   35:aload_3         
		//   20   36:aload_2         
		//   21   37:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   22   40:pop             
			stringbuilder.append("}");
		//   23   41:aload_3         
		//   24   42:ldc1            #50  <String "}">
		//   25   44:invokevirtual   #48  <Method StringBuilder StringBuilder.append(String)>
		//   26   47:pop             
			stringbuilder.append(flag);
		//   27   48:aload_3         
		//   28   49:iload_1         
		//   29   50:invokevirtual   #53  <Method StringBuilder StringBuilder.append(boolean)>
		//   30   53:pop             
			return stringbuilder.toString();
		//   31   54:aload_3         
		//   32   55:invokevirtual   #55  <Method String StringBuilder.toString()>
		//   33   58:areturn         
		}

		private final String zzq;
		private final boolean zzr;

		public Info(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
			zzq = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #19  <Field String zzq>
			zzr = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #21  <Field boolean zzr>
		//    8   14:return          
		}
	}

	static final class zza extends Thread
	{

		private final void disconnect()
		{
			AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzm.get();
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field WeakReference zzm>
		//    2    4:invokevirtual   #49  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class AdvertisingIdClient>
		//    4   10:astore_1        
			if(advertisingidclient != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          24
			{
				advertisingidclient.finish();
		//    7   15:aload_1         
		//    8   16:invokevirtual   #52  <Method void AdvertisingIdClient.finish()>
				zzp = true;
		//    9   19:aload_0         
		//   10   20:iconst_1        
		//   11   21:putfield        #40  <Field boolean zzp>
			}
		//   12   24:return          
		}

		public final void run()
		{
			InterruptedException interruptedexception;
			try
			{
				if(!zzo.await(zzn, TimeUnit.MILLISECONDS))
		//*   0    0:aload_0         
		//*   1    1:getfield        #38  <Field CountDownLatch zzo>
		//*   2    4:aload_0         
		//*   3    5:getfield        #31  <Field long zzn>
		//*   4    8:getstatic       #61  <Field TimeUnit TimeUnit.MILLISECONDS>
		//*   5   11:invokevirtual   #65  <Method boolean CountDownLatch.await(long, TimeUnit)>
		//*   6   14:ifne            21
					disconnect();
		//    7   17:aload_0         
		//    8   18:invokespecial   #67  <Method void disconnect()>
				return;
		//    9   21:return          
			}
		//*  10   22:aload_0         
		//*  11   23:invokespecial   #67  <Method void disconnect()>
		//*  12   26:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				disconnect();
			}
		//*  13   27:astore_1        
		//*  14   28:goto            22
		}

		private WeakReference zzm;
		private long zzn;
		CountDownLatch zzo;
		boolean zzp;

		public zza(AdvertisingIdClient advertisingidclient, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #22  <Method void Thread()>
			zzm = new WeakReference(((Object) (advertisingidclient)));
		//    2    4:aload_0         
		//    3    5:new             #24  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #27  <Method void WeakReference(Object)>
		//    7   13:putfield        #29  <Field WeakReference zzm>
			zzn = l;
		//    8   16:aload_0         
		//    9   17:lload_2         
		//   10   18:putfield        #31  <Field long zzn>
			zzo = new CountDownLatch(1);
		//   11   21:aload_0         
		//   12   22:new             #33  <Class CountDownLatch>
		//   13   25:dup             
		//   14   26:iconst_1        
		//   15   27:invokespecial   #36  <Method void CountDownLatch(int)>
		//   16   30:putfield        #38  <Field CountDownLatch zzo>
			zzp = false;
		//   17   33:aload_0         
		//   18   34:iconst_0        
		//   19   35:putfield        #40  <Field boolean zzp>
			start();
		//   20   38:aload_0         
		//   21   39:invokevirtual   #43  <Method void start()>
		//   22   42:return          
		}
	}


	public AdvertisingIdClient(Context context)
	{
		this(context, 30000L, false, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #35  <Long 30000L>
	//    3    5:iconst_0        
	//    4    6:iconst_0        
	//    5    7:invokespecial   #39  <Method void AdvertisingIdClient(Context, long, boolean, boolean)>
	//    6   10:return          
	}

	private AdvertisingIdClient(Context context, long l, boolean flag, boolean flag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		zzh = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #45  <Method void Object()>
	//    6   12:putfield        #47  <Field Object zzh>
		Preconditions.checkNotNull(((Object) (context)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #53  <Method Object Preconditions.checkNotNull(Object)>
	//    9   19:pop             
		Context context1 = context;
	//   10   20:aload_1         
	//   11   21:astore          6
		if(flag)
	//*  12   23:iload           4
	//*  13   25:ifeq            45
		{
			context1 = context.getApplicationContext();
	//   14   28:aload_1         
	//   15   29:invokevirtual   #59  <Method Context Context.getApplicationContext()>
	//   16   32:astore          6
			if(context1 == null)
	//*  17   34:aload           6
	//*  18   36:ifnonnull       45
				context1 = context;
	//   19   39:aload_1         
	//   20   40:astore          6
		}
	//*  21   42:goto            45
		mContext = context1;
	//   22   45:aload_0         
	//   23   46:aload           6
	//   24   48:putfield        #61  <Field Context mContext>
		zzg = false;
	//   25   51:aload_0         
	//   26   52:iconst_0        
	//   27   53:putfield        #63  <Field boolean zzg>
		zzk = l;
	//   28   56:aload_0         
	//   29   57:lload_2         
	//   30   58:putfield        #65  <Field long zzk>
		zzj = flag1;
	//   31   61:aload_0         
	//   32   62:iload           5
	//   33   64:putfield        #67  <Field boolean zzj>
	//   34   67:return          
	}

	public static Info getAdvertisingIdInfo(Context context)
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		float f;
		boolean flag;
		Object obj;
		zzb zzb1 = new zzb(context);
	//    0    0:new             #81  <Class zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #83  <Method void zzb(Context)>
	//    4    8:astore          6
		flag = zzb1.getBoolean("gads:ad_id_app_context:enabled", false);
	//    5   10:aload           6
	//    6   12:ldc1            #85  <String "gads:ad_id_app_context:enabled">
	//    7   14:iconst_0        
	//    8   15:invokevirtual   #89  <Method boolean zzb.getBoolean(String, boolean)>
	//    9   18:istore_2        
		f = zzb1.getFloat("gads:ad_id_app_context:ping_ratio", 0.0F);
	//   10   19:aload           6
	//   11   21:ldc1            #91  <String "gads:ad_id_app_context:ping_ratio">
	//   12   23:fconst_0        
	//   13   24:invokevirtual   #95  <Method float zzb.getFloat(String, float)>
	//   14   27:fstore_1        
		obj = ((Object) (zzb1.getString("gads:ad_id_use_shared_preference:experiment_id", "")));
	//   15   28:aload           6
	//   16   30:ldc1            #97  <String "gads:ad_id_use_shared_preference:experiment_id">
	//   17   32:ldc1            #99  <String "">
	//   18   34:invokevirtual   #103 <Method String zzb.getString(String, String)>
	//   19   37:astore          5
		context = ((Context) (new AdvertisingIdClient(context, -1L, flag, zzb1.getBoolean("gads:ad_id_use_persistent_service:enabled", false))));
	//   20   39:new             #2   <Class AdvertisingIdClient>
	//   21   42:dup             
	//   22   43:aload_0         
	//   23   44:ldc2w           #104 <Long -1L>
	//   24   47:iload_2         
	//   25   48:aload           6
	//   26   50:ldc1            #107 <String "gads:ad_id_use_persistent_service:enabled">
	//   27   52:iconst_0        
	//   28   53:invokevirtual   #89  <Method boolean zzb.getBoolean(String, boolean)>
	//   29   56:invokespecial   #39  <Method void AdvertisingIdClient(Context, long, boolean, boolean)>
	//   30   59:astore_0        
		Info info;
		long l = SystemClock.elapsedRealtime();
	//   31   60:invokestatic    #113 <Method long SystemClock.elapsedRealtime()>
	//   32   63:lstore_3        
		((AdvertisingIdClient) (context)).zza(false);
	//   33   64:aload_0         
	//   34   65:iconst_0        
	//   35   66:invokespecial   #116 <Method void zza(boolean)>
		info = ((AdvertisingIdClient) (context)).getInfo();
	//   36   69:aload_0         
	//   37   70:invokevirtual   #120 <Method AdvertisingIdClient$Info getInfo()>
	//   38   73:astore          6
		((AdvertisingIdClient) (context)).zza(info, flag, f, SystemClock.elapsedRealtime() - l, ((String) (obj)), ((Throwable) (null)));
	//   39   75:aload_0         
	//   40   76:aload           6
	//   41   78:iload_2         
	//   42   79:fload_1         
	//   43   80:invokestatic    #113 <Method long SystemClock.elapsedRealtime()>
	//   44   83:lload_3         
	//   45   84:lsub            
	//   46   85:aload           5
	//   47   87:aconst_null     
	//   48   88:invokespecial   #123 <Method boolean zza(AdvertisingIdClient$Info, boolean, float, long, String, Throwable)>
	//   49   91:pop             
		((AdvertisingIdClient) (context)).finish();
	//   50   92:aload_0         
	//   51   93:invokevirtual   #126 <Method void finish()>
		return info;
	//   52   96:aload           6
	//   53   98:areturn         
		obj;
	//   54   99:astore          5
		break MISSING_BLOCK_LABEL_124;
	//   55  101:goto            124
		Throwable throwable;
		throwable;
	//   56  104:astore          6
		((AdvertisingIdClient) (context)).zza(((Info) (null)), flag, f, -1L, ((String) (obj)), throwable);
	//   57  106:aload_0         
	//   58  107:aconst_null     
	//   59  108:iload_2         
	//   60  109:fload_1         
	//   61  110:ldc2w           #104 <Long -1L>
	//   62  113:aload           5
	//   63  115:aload           6
	//   64  117:invokespecial   #123 <Method boolean zza(AdvertisingIdClient$Info, boolean, float, long, String, Throwable)>
	//   65  120:pop             
		throw throwable;
	//   66  121:aload           6
	//   67  123:athrow          
		((AdvertisingIdClient) (context)).finish();
	//   68  124:aload_0         
	//   69  125:invokevirtual   #126 <Method void finish()>
		throw obj;
	//   70  128:aload           5
	//   71  130:athrow          
	}

	public static boolean getIsAdIdFakeForDebugLogging(Context context)
		throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		zzb zzb1 = new zzb(context);
	//    0    0:new             #81  <Class zzb>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #83  <Method void zzb(Context)>
	//    4    8:astore_2        
		context = ((Context) (new AdvertisingIdClient(context, -1L, zzb1.getBoolean("gads:ad_id_app_context:enabled", false), zzb1.getBoolean("com.google.android.gms.ads.identifier.service.PERSISTENT_START", false))));
	//    5    9:new             #2   <Class AdvertisingIdClient>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:ldc2w           #104 <Long -1L>
	//    9   17:aload_2         
	//   10   18:ldc1            #85  <String "gads:ad_id_app_context:enabled">
	//   11   20:iconst_0        
	//   12   21:invokevirtual   #89  <Method boolean zzb.getBoolean(String, boolean)>
	//   13   24:aload_2         
	//   14   25:ldc1            #131 <String "com.google.android.gms.ads.identifier.service.PERSISTENT_START">
	//   15   27:iconst_0        
	//   16   28:invokevirtual   #89  <Method boolean zzb.getBoolean(String, boolean)>
	//   17   31:invokespecial   #39  <Method void AdvertisingIdClient(Context, long, boolean, boolean)>
	//   18   34:astore_0        
		boolean flag;
		((AdvertisingIdClient) (context)).zza(false);
	//   19   35:aload_0         
	//   20   36:iconst_0        
	//   21   37:invokespecial   #116 <Method void zza(boolean)>
		flag = ((AdvertisingIdClient) (context)).zzb();
	//   22   40:aload_0         
	//   23   41:invokespecial   #135 <Method boolean zzb()>
	//   24   44:istore_1        
		((AdvertisingIdClient) (context)).finish();
	//   25   45:aload_0         
	//   26   46:invokevirtual   #126 <Method void finish()>
		return flag;
	//   27   49:iload_1         
	//   28   50:ireturn         
		Exception exception;
		exception;
	//   29   51:astore_2        
		((AdvertisingIdClient) (context)).finish();
	//   30   52:aload_0         
	//   31   53:invokevirtual   #126 <Method void finish()>
		throw exception;
	//   32   56:aload_2         
	//   33   57:athrow          
	}

	public static void setShouldSkipGmsCoreVersionCheck(boolean flag)
	{
	//    0    0:return          
	}

	private static BlockingServiceConnection zza(Context context, boolean flag)
		throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		int i;
		Object obj;
		BlockingServiceConnection blockingserviceconnection;
		try
		{
			context.getPackageManager().getPackageInfo("com.android.vending", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #143 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #145 <String "com.android.vending">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #151 <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:pop             
		}
	//*   6   11:invokestatic    #157 <Method GoogleApiAvailabilityLight GoogleApiAvailabilityLight.getInstance()>
	//*   7   14:aload_0         
	//*   8   15:ldc1            #158 <Int 0xbdfcb8>
	//*   9   17:invokevirtual   #162 <Method int GoogleApiAvailabilityLight.isGooglePlayServicesAvailable(Context, int)>
	//*  10   20:istore_2        
	//*  11   21:iload_2         
	//*  12   22:ifeq            40
	//*  13   25:iload_2         
	//*  14   26:iconst_2        
	//*  15   27:icmpeq          40
	//*  16   30:new             #71  <Class IOException>
	//*  17   33:dup             
	//*  18   34:ldc1            #164 <String "Google Play services not available">
	//*  19   36:invokespecial   #167 <Method void IOException(String)>
	//*  20   39:athrow          
	//*  21   40:iload_1         
	//*  22   41:ifeq            50
	//*  23   44:ldc1            #131 <String "com.google.android.gms.ads.identifier.service.PERSISTENT_START">
	//*  24   46:astore_3        
	//*  25   47:goto            53
	//*  26   50:ldc1            #169 <String "com.google.android.gms.ads.identifier.service.START">
	//*  27   52:astore_3        
	//*  28   53:new             #171 <Class BlockingServiceConnection>
	//*  29   56:dup             
	//*  30   57:invokespecial   #172 <Method void BlockingServiceConnection()>
	//*  31   60:astore          4
	//*  32   62:new             #174 <Class Intent>
	//*  33   65:dup             
	//*  34   66:aload_3         
	//*  35   67:invokespecial   #175 <Method void Intent(String)>
	//*  36   70:astore_3        
	//*  37   71:aload_3         
	//*  38   72:ldc1            #177 <String "com.google.android.gms">
	//*  39   74:invokevirtual   #181 <Method Intent Intent.setPackage(String)>
	//*  40   77:pop             
	//*  41   78:invokestatic    #186 <Method ConnectionTracker ConnectionTracker.getInstance()>
	//*  42   81:aload_0         
	//*  43   82:aload_3         
	//*  44   83:aload           4
	//*  45   85:iconst_1        
	//*  46   86:invokevirtual   #190 <Method boolean ConnectionTracker.bindService(Context, Intent, android.content.ServiceConnection, int)>
	//*  47   89:istore_1        
	//*  48   90:iload_1         
	//*  49   91:ifeq            97
	//*  50   94:aload           4
	//*  51   96:areturn         
	//*  52   97:new             #71  <Class IOException>
	//*  53  100:dup             
	//*  54  101:ldc1            #192 <String "Connection failure">
	//*  55  103:invokespecial   #167 <Method void IOException(String)>
	//*  56  106:athrow          
	//*  57  107:astore_0        
	//*  58  108:new             #71  <Class IOException>
	//*  59  111:dup             
	//*  60  112:aload_0         
	//*  61  113:invokespecial   #195 <Method void IOException(Throwable)>
	//*  62  116:athrow          
	//*  63  117:new             #75  <Class GooglePlayServicesNotAvailableException>
	//*  64  120:dup             
	//*  65  121:bipush          9
	//*  66  123:invokespecial   #198 <Method void GooglePlayServicesNotAvailableException(int)>
	//*  67  126:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new GooglePlayServicesNotAvailableException(9);
		}
		i = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, 0xbdfcb8);
		if(i != 0 && i != 2)
			throw new IOException("Google Play services not available");
		if(flag)
			obj = "com.google.android.gms.ads.identifier.service.PERSISTENT_START";
		else
			obj = "com.google.android.gms.ads.identifier.service.START";
		blockingserviceconnection = new BlockingServiceConnection();
		obj = ((Object) (new Intent(((String) (obj)))));
		((Intent) (obj)).setPackage("com.google.android.gms");
		try
		{
			flag = ConnectionTracker.getInstance().bindService(context, ((Intent) (obj)), ((android.content.ServiceConnection) (blockingserviceconnection)), 1);
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IOException(((Throwable) (context)));
		}
		if(flag)
			return blockingserviceconnection;
		else
			throw new IOException("Connection failure");
	//*  68  127:astore_0        
	//*  69  128:goto            117
	}

	private static zze zza(Context context, BlockingServiceConnection blockingserviceconnection)
		throws IOException
	{
		try
		{
			context = ((Context) (com.google.android.gms.internal.ads_identifier.zzf.zza(blockingserviceconnection.getServiceWithTimeout(10000L, TimeUnit.MILLISECONDS))));
	//    0    0:aload_1         
	//    1    1:ldc2w           #202 <Long 10000L>
	//    2    4:getstatic       #209 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    7:invokevirtual   #213 <Method android.os.IBinder BlockingServiceConnection.getServiceWithTimeout(long, TimeUnit)>
	//    4   10:invokestatic    #218 <Method zze zzf.zza(android.os.IBinder)>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:areturn         
	//*   8   16:astore_0        
	//*   9   17:new             #71  <Class IOException>
	//*  10   20:dup             
	//*  11   21:aload_0         
	//*  12   22:invokespecial   #195 <Method void IOException(Throwable)>
	//*  13   25:athrow          
	//*  14   26:new             #71  <Class IOException>
	//*  15   29:dup             
	//*  16   30:ldc1            #220 <String "Interrupted exception">
	//*  17   32:invokespecial   #167 <Method void IOException(String)>
	//*  18   35:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IOException("Interrupted exception");
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IOException(((Throwable) (context)));
		}
		return ((zze) (context));
	//*  19   36:astore_0        
	//*  20   37:goto            26
	}

	private final void zza()
	{
		Object obj = zzh;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field Object zzh>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzi == null)
			break MISSING_BLOCK_LABEL_31;
	//    5    7:aload_0         
	//    6    8:getfield        #222 <Field AdvertisingIdClient$zza zzi>
	//    7   11:ifnull          31
		zzi.zzo.countDown();
	//    8   14:aload_0         
	//    9   15:getfield        #222 <Field AdvertisingIdClient$zza zzi>
	//   10   18:getfield        #226 <Field CountDownLatch AdvertisingIdClient$zza.zzo>
	//   11   21:invokevirtual   #231 <Method void CountDownLatch.countDown()>
		Exception exception;
		try
		{
			zzi.join();
	//   12   24:aload_0         
	//   13   25:getfield        #222 <Field AdvertisingIdClient$zza zzi>
	//   14   28:invokevirtual   #234 <Method void AdvertisingIdClient$zza.join()>
		}
	//*  15   31:aload_0         
	//*  16   32:getfield        #65  <Field long zzk>
	//*  17   35:lconst_0        
	//*  18   36:lcmp            
	//*  19   37:ifle            56
	//*  20   40:aload_0         
	//*  21   41:new             #9   <Class AdvertisingIdClient$zza>
	//*  22   44:dup             
	//*  23   45:aload_0         
	//*  24   46:aload_0         
	//*  25   47:getfield        #65  <Field long zzk>
	//*  26   50:invokespecial   #237 <Method void AdvertisingIdClient$zza(AdvertisingIdClient, long)>
	//*  27   53:putfield        #222 <Field AdvertisingIdClient$zza zzi>
	//*  28   56:aload_1         
	//*  29   57:monitorexit     
	//*  30   58:return          
	//*  31   59:astore_2        
	//*  32   60:aload_1         
	//*  33   61:monitorexit     
	//*  34   62:aload_2         
	//*  35   63:athrow          
		catch(InterruptedException interruptedexception) { }
	//   36   64:astore_2        
		if(zzk > 0L)
			zzi = new zza(this, zzk);
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  37   65:goto            31
	}

	private final void zza(boolean flag)
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #239 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #242 <Method void Preconditions.checkNotMainThread(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzg)
	//*   4    7:aload_0         
	//*   5    8:getfield        #63  <Field boolean zzg>
	//*   6   11:ifeq            18
			finish();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #126 <Method void finish()>
		zze = zza(mContext, zzj);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #61  <Field Context mContext>
	//   12   23:aload_0         
	//   13   24:getfield        #67  <Field boolean zzj>
	//   14   27:invokestatic    #244 <Method BlockingServiceConnection zza(Context, boolean)>
	//   15   30:putfield        #246 <Field BlockingServiceConnection zze>
		zzf = zza(mContext, zze);
	//   16   33:aload_0         
	//   17   34:aload_0         
	//   18   35:getfield        #61  <Field Context mContext>
	//   19   38:aload_0         
	//   20   39:getfield        #246 <Field BlockingServiceConnection zze>
	//   21   42:invokestatic    #248 <Method zze zza(Context, BlockingServiceConnection)>
	//   22   45:putfield        #250 <Field zze zzf>
		zzg = true;
	//   23   48:aload_0         
	//   24   49:iconst_1        
	//   25   50:putfield        #63  <Field boolean zzg>
		if(!flag)
			break MISSING_BLOCK_LABEL_61;
	//   26   53:iload_1         
	//   27   54:ifeq            61
		zza();
	//   28   57:aload_0         
	//   29   58:invokespecial   #252 <Method void zza()>
		this;
	//   30   61:aload_0         
		JVM INSTR monitorexit ;
	//   31   62:monitorexit     
		return;
	//   32   63:return          
		Exception exception;
		exception;
	//   33   64:astore_2        
		this;
	//   34   65:aload_0         
		JVM INSTR monitorexit ;
	//   35   66:monitorexit     
		throw exception;
	//   36   67:aload_2         
	//   37   68:athrow          
	}

	private final boolean zza(Info info, boolean flag, float f, long l, String s, Throwable throwable)
	{
		if(Math.random() > (double)f)
	//*   0    0:invokestatic    #258 <Method double Math.random()>
	//*   1    3:fload_3         
	//*   2    4:f2d             
	//*   3    5:dcmpl           
	//*   4    6:ifle            11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		HashMap hashmap = new HashMap();
	//    7   11:new             #260 <Class HashMap>
	//    8   14:dup             
	//    9   15:invokespecial   #261 <Method void HashMap()>
	//   10   18:astore          9
		String s1;
		if(flag)
	//*  11   20:iload_2         
	//*  12   21:ifeq            32
			s1 = "1";
	//   13   24:ldc2            #263 <String "1">
	//   14   27:astore          8
		else
	//*  15   29:goto            37
			s1 = "0";
	//   16   32:ldc2            #265 <String "0">
	//   17   35:astore          8
		((Map) (hashmap)).put("app_context", ((Object) (s1)));
	//   18   37:aload           9
	//   19   39:ldc2            #267 <String "app_context">
	//   20   42:aload           8
	//   21   44:invokeinterface #273 <Method Object Map.put(Object, Object)>
	//   22   49:pop             
		if(info != null)
	//*  23   50:aload_1         
	//*  24   51:ifnull          87
		{
			String s2;
			if(info.isLimitAdTrackingEnabled())
	//*  25   54:aload_1         
	//*  26   55:invokevirtual   #276 <Method boolean AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//*  27   58:ifeq            69
				s2 = "1";
	//   28   61:ldc2            #263 <String "1">
	//   29   64:astore          8
			else
	//*  30   66:goto            74
				s2 = "0";
	//   31   69:ldc2            #265 <String "0">
	//   32   72:astore          8
			((Map) (hashmap)).put("limit_ad_tracking", ((Object) (s2)));
	//   33   74:aload           9
	//   34   76:ldc2            #278 <String "limit_ad_tracking">
	//   35   79:aload           8
	//   36   81:invokeinterface #273 <Method Object Map.put(Object, Object)>
	//   37   86:pop             
		}
		if(info != null && info.getId() != null)
	//*  38   87:aload_1         
	//*  39   88:ifnull          119
	//*  40   91:aload_1         
	//*  41   92:invokevirtual   #282 <Method String AdvertisingIdClient$Info.getId()>
	//*  42   95:ifnull          119
			((Map) (hashmap)).put("ad_id_size", ((Object) (Integer.toString(info.getId().length()))));
	//   43   98:aload           9
	//   44  100:ldc2            #284 <String "ad_id_size">
	//   45  103:aload_1         
	//   46  104:invokevirtual   #282 <Method String AdvertisingIdClient$Info.getId()>
	//   47  107:invokevirtual   #290 <Method int String.length()>
	//   48  110:invokestatic    #296 <Method String Integer.toString(int)>
	//   49  113:invokeinterface #273 <Method Object Map.put(Object, Object)>
	//   50  118:pop             
		if(throwable != null)
	//*  51  119:aload           7
	//*  52  121:ifnull          143
			((Map) (hashmap)).put("error", ((Object) (((Object) (throwable)).getClass().getName())));
	//   53  124:aload           9
	//   54  126:ldc2            #298 <String "error">
	//   55  129:aload           7
	//   56  131:invokevirtual   #302 <Method Class Object.getClass()>
	//   57  134:invokevirtual   #307 <Method String Class.getName()>
	//   58  137:invokeinterface #273 <Method Object Map.put(Object, Object)>
	//   59  142:pop             
		if(s != null && !s.isEmpty())
	//*  60  143:aload           6
	//*  61  145:ifnull          169
	//*  62  148:aload           6
	//*  63  150:invokevirtual   #310 <Method boolean String.isEmpty()>
	//*  64  153:ifne            169
			((Map) (hashmap)).put("experiment_id", ((Object) (s)));
	//   65  156:aload           9
	//   66  158:ldc2            #312 <String "experiment_id">
	//   67  161:aload           6
	//   68  163:invokeinterface #273 <Method Object Map.put(Object, Object)>
	//   69  168:pop             
		((Map) (hashmap)).put("tag", "AdvertisingIdClient");
	//   70  169:aload           9
	//   71  171:ldc2            #314 <String "tag">
	//   72  174:ldc2            #316 <String "AdvertisingIdClient">
	//   73  177:invokeinterface #273 <Method Object Map.put(Object, Object)>
	//   74  182:pop             
		((Map) (hashmap)).put("time_spent", ((Object) (Long.toString(l))));
	//   75  183:aload           9
	//   76  185:ldc2            #318 <String "time_spent">
	//   77  188:lload           4
	//   78  190:invokestatic    #323 <Method String Long.toString(long)>
	//   79  193:invokeinterface #273 <Method Object Map.put(Object, Object)>
	//   80  198:pop             
		(new com.google.android.gms.ads.identifier.zza(this, ((Map) (hashmap)))).start();
	//   81  199:new             #325 <Class zza>
	//   82  202:dup             
	//   83  203:aload_0         
	//   84  204:aload           9
	//   85  206:invokespecial   #328 <Method void zza(AdvertisingIdClient, Map)>
	//   86  209:invokevirtual   #331 <Method void zza.start()>
		return true;
	//   87  212:iconst_1        
	//   88  213:ireturn         
	}

	private final boolean zzb()
		throws IOException
	{
		Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #239 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #242 <Method void Preconditions.checkNotMainThread(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzg)
			break MISSING_BLOCK_LABEL_95;
	//    4    7:aload_0         
	//    5    8:getfield        #63  <Field boolean zzg>
	//    6   11:ifne            95
		Object obj = zzh;
	//    7   14:aload_0         
	//    8   15:getfield        #47  <Field Object zzh>
	//    9   18:astore_2        
		obj;
	//   10   19:aload_2         
		JVM INSTR monitorenter ;
	//   11   20:monitorenter    
		if(zzi == null || !zzi.zzp)
	//*  12   21:aload_0         
	//*  13   22:getfield        #222 <Field AdvertisingIdClient$zza zzi>
	//*  14   25:ifnull          79
	//*  15   28:aload_0         
	//*  16   29:getfield        #222 <Field AdvertisingIdClient$zza zzi>
	//*  17   32:getfield        #338 <Field boolean AdvertisingIdClient$zza.zzp>
	//*  18   35:ifne            41
			break MISSING_BLOCK_LABEL_79;
	//   19   38:goto            79
		obj;
	//   20   41:aload_2         
		JVM INSTR monitorexit ;
	//   21   42:monitorexit     
		zza(false);
	//   22   43:aload_0         
	//   23   44:iconst_0        
	//   24   45:invokespecial   #116 <Method void zza(boolean)>
		if(!zzg)
	//*  25   48:aload_0         
	//*  26   49:getfield        #63  <Field boolean zzg>
	//*  27   52:ifne            95
			throw new IOException("AdvertisingIdClient cannot reconnect.");
	//   28   55:new             #71  <Class IOException>
	//   29   58:dup             
	//   30   59:ldc2            #340 <String "AdvertisingIdClient cannot reconnect.">
	//   31   62:invokespecial   #167 <Method void IOException(String)>
	//   32   65:athrow          
		break MISSING_BLOCK_LABEL_95;
		obj;
	//   33   66:astore_2        
		throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj)));
	//   34   67:new             #71  <Class IOException>
	//   35   70:dup             
	//   36   71:ldc2            #340 <String "AdvertisingIdClient cannot reconnect.">
	//   37   74:aload_2         
	//   38   75:invokespecial   #343 <Method void IOException(String, Throwable)>
	//   39   78:athrow          
		throw new IOException("AdvertisingIdClient is not connected.");
	//   40   79:new             #71  <Class IOException>
	//   41   82:dup             
	//   42   83:ldc2            #345 <String "AdvertisingIdClient is not connected.">
	//   43   86:invokespecial   #167 <Method void IOException(String)>
	//   44   89:athrow          
		Exception exception;
		exception;
	//   45   90:astore_3        
		obj;
	//   46   91:aload_2         
		JVM INSTR monitorexit ;
	//   47   92:monitorexit     
		throw exception;
	//   48   93:aload_3         
	//   49   94:athrow          
		Preconditions.checkNotNull(((Object) (zze)));
	//   50   95:aload_0         
	//   51   96:getfield        #246 <Field BlockingServiceConnection zze>
	//   52   99:invokestatic    #53  <Method Object Preconditions.checkNotNull(Object)>
	//   53  102:pop             
		Preconditions.checkNotNull(((Object) (zzf)));
	//   54  103:aload_0         
	//   55  104:getfield        #250 <Field zze zzf>
	//   56  107:invokestatic    #53  <Method Object Preconditions.checkNotNull(Object)>
	//   57  110:pop             
		boolean flag = zzf.zzc();
	//   58  111:aload_0         
	//   59  112:getfield        #250 <Field zze zzf>
	//   60  115:invokeinterface #350 <Method boolean zze.zzc()>
	//   61  120:istore_1        
		this;
	//   62  121:aload_0         
		JVM INSTR monitorexit ;
	//   63  122:monitorexit     
		zza();
	//   64  123:aload_0         
	//   65  124:invokespecial   #252 <Method void zza()>
		return flag;
	//   66  127:iload_1         
	//   67  128:ireturn         
		Object obj1;
		obj1;
	//   68  129:astore_2        
		Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
	//   69  130:ldc2            #316 <String "AdvertisingIdClient">
	//   70  133:ldc2            #352 <String "GMS remote exception ">
	//   71  136:aload_2         
	//   72  137:invokestatic    #358 <Method int Log.i(String, String, Throwable)>
	//   73  140:pop             
		throw new IOException("Remote exception");
	//   74  141:new             #71  <Class IOException>
	//   75  144:dup             
	//   76  145:ldc2            #360 <String "Remote exception">
	//   77  148:invokespecial   #167 <Method void IOException(String)>
	//   78  151:athrow          
		obj1;
	//   79  152:astore_2        
		this;
	//   80  153:aload_0         
		JVM INSTR monitorexit ;
	//   81  154:monitorexit     
		throw obj1;
	//   82  155:aload_2         
	//   83  156:athrow          
	}

	protected void finalize()
		throws Throwable
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method void finish()>
		super.finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #363 <Method void Object.finalize()>
	//    4    8:return          
	}

	public final void finish()
	{
		Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #239 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #242 <Method void Preconditions.checkNotMainThread(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		BlockingServiceConnection blockingserviceconnection;
		if(mContext == null)
			break MISSING_BLOCK_LABEL_80;
	//    4    7:aload_0         
	//    5    8:getfield        #61  <Field Context mContext>
	//    6   11:ifnull          80
		blockingserviceconnection = zze;
	//    7   14:aload_0         
	//    8   15:getfield        #246 <Field BlockingServiceConnection zze>
	//    9   18:astore_1        
		if(blockingserviceconnection == null)
	//*  10   19:aload_1         
	//*  11   20:ifnonnull       26
			break MISSING_BLOCK_LABEL_80;
	//   12   23:goto            80
		if(zzg)
	//*  13   26:aload_0         
	//*  14   27:getfield        #63  <Field boolean zzg>
	//*  15   30:ifeq            62
			ConnectionTracker.getInstance().unbindService(mContext, ((android.content.ServiceConnection) (zze)));
	//   16   33:invokestatic    #186 <Method ConnectionTracker ConnectionTracker.getInstance()>
	//   17   36:aload_0         
	//   18   37:getfield        #61  <Field Context mContext>
	//   19   40:aload_0         
	//   20   41:getfield        #246 <Field BlockingServiceConnection zze>
	//   21   44:invokevirtual   #367 <Method void ConnectionTracker.unbindService(Context, android.content.ServiceConnection)>
		break MISSING_BLOCK_LABEL_62;
	//   22   47:goto            62
		Object obj;
		obj;
	//   23   50:astore_1        
		Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
	//   24   51:ldc2            #316 <String "AdvertisingIdClient">
	//   25   54:ldc2            #369 <String "AdvertisingIdClient unbindService failed.">
	//   26   57:aload_1         
	//   27   58:invokestatic    #358 <Method int Log.i(String, String, Throwable)>
	//   28   61:pop             
		zzg = false;
	//   29   62:aload_0         
	//   30   63:iconst_0        
	//   31   64:putfield        #63  <Field boolean zzg>
		zzf = null;
	//   32   67:aload_0         
	//   33   68:aconst_null     
	//   34   69:putfield        #250 <Field zze zzf>
		zze = null;
	//   35   72:aload_0         
	//   36   73:aconst_null     
	//   37   74:putfield        #246 <Field BlockingServiceConnection zze>
		this;
	//   38   77:aload_0         
		JVM INSTR monitorexit ;
	//   39   78:monitorexit     
		return;
	//   40   79:return          
		this;
	//   41   80:aload_0         
		JVM INSTR monitorexit ;
	//   42   81:monitorexit     
		return;
	//   43   82:return          
		obj;
	//   44   83:astore_1        
		this;
	//   45   84:aload_0         
		JVM INSTR monitorexit ;
	//   46   85:monitorexit     
		throw obj;
	//   47   86:aload_1         
	//   48   87:athrow          
	}

	public Info getInfo()
		throws IOException
	{
		Preconditions.checkNotMainThread("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #239 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #242 <Method void Preconditions.checkNotMainThread(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzg)
			break MISSING_BLOCK_LABEL_95;
	//    4    7:aload_0         
	//    5    8:getfield        #63  <Field boolean zzg>
	//    6   11:ifne            95
		Object obj = zzh;
	//    7   14:aload_0         
	//    8   15:getfield        #47  <Field Object zzh>
	//    9   18:astore_1        
		obj;
	//   10   19:aload_1         
		JVM INSTR monitorenter ;
	//   11   20:monitorenter    
		if(zzi == null || !zzi.zzp)
	//*  12   21:aload_0         
	//*  13   22:getfield        #222 <Field AdvertisingIdClient$zza zzi>
	//*  14   25:ifnull          79
	//*  15   28:aload_0         
	//*  16   29:getfield        #222 <Field AdvertisingIdClient$zza zzi>
	//*  17   32:getfield        #338 <Field boolean AdvertisingIdClient$zza.zzp>
	//*  18   35:ifne            41
			break MISSING_BLOCK_LABEL_79;
	//   19   38:goto            79
		obj;
	//   20   41:aload_1         
		JVM INSTR monitorexit ;
	//   21   42:monitorexit     
		zza(false);
	//   22   43:aload_0         
	//   23   44:iconst_0        
	//   24   45:invokespecial   #116 <Method void zza(boolean)>
		if(!zzg)
	//*  25   48:aload_0         
	//*  26   49:getfield        #63  <Field boolean zzg>
	//*  27   52:ifne            95
			throw new IOException("AdvertisingIdClient cannot reconnect.");
	//   28   55:new             #71  <Class IOException>
	//   29   58:dup             
	//   30   59:ldc2            #340 <String "AdvertisingIdClient cannot reconnect.">
	//   31   62:invokespecial   #167 <Method void IOException(String)>
	//   32   65:athrow          
		break MISSING_BLOCK_LABEL_95;
		obj;
	//   33   66:astore_1        
		throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj)));
	//   34   67:new             #71  <Class IOException>
	//   35   70:dup             
	//   36   71:ldc2            #340 <String "AdvertisingIdClient cannot reconnect.">
	//   37   74:aload_1         
	//   38   75:invokespecial   #343 <Method void IOException(String, Throwable)>
	//   39   78:athrow          
		throw new IOException("AdvertisingIdClient is not connected.");
	//   40   79:new             #71  <Class IOException>
	//   41   82:dup             
	//   42   83:ldc2            #345 <String "AdvertisingIdClient is not connected.">
	//   43   86:invokespecial   #167 <Method void IOException(String)>
	//   44   89:athrow          
		Exception exception;
		exception;
	//   45   90:astore_2        
		obj;
	//   46   91:aload_1         
		JVM INSTR monitorexit ;
	//   47   92:monitorexit     
		throw exception;
	//   48   93:aload_2         
	//   49   94:athrow          
		Preconditions.checkNotNull(((Object) (zze)));
	//   50   95:aload_0         
	//   51   96:getfield        #246 <Field BlockingServiceConnection zze>
	//   52   99:invokestatic    #53  <Method Object Preconditions.checkNotNull(Object)>
	//   53  102:pop             
		Preconditions.checkNotNull(((Object) (zzf)));
	//   54  103:aload_0         
	//   55  104:getfield        #250 <Field zze zzf>
	//   56  107:invokestatic    #53  <Method Object Preconditions.checkNotNull(Object)>
	//   57  110:pop             
		obj = ((Object) (new Info(zzf.getId(), zzf.zzb(true))));
	//   58  111:new             #6   <Class AdvertisingIdClient$Info>
	//   59  114:dup             
	//   60  115:aload_0         
	//   61  116:getfield        #250 <Field zze zzf>
	//   62  119:invokeinterface #370 <Method String zze.getId()>
	//   63  124:aload_0         
	//   64  125:getfield        #250 <Field zze zzf>
	//   65  128:iconst_1        
	//   66  129:invokeinterface #373 <Method boolean zze.zzb(boolean)>
	//   67  134:invokespecial   #376 <Method void AdvertisingIdClient$Info(String, boolean)>
	//   68  137:astore_1        
		this;
	//   69  138:aload_0         
		JVM INSTR monitorexit ;
	//   70  139:monitorexit     
		zza();
	//   71  140:aload_0         
	//   72  141:invokespecial   #252 <Method void zza()>
		return ((Info) (obj));
	//   73  144:aload_1         
	//   74  145:areturn         
		Object obj1;
		obj1;
	//   75  146:astore_1        
		Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
	//   76  147:ldc2            #316 <String "AdvertisingIdClient">
	//   77  150:ldc2            #352 <String "GMS remote exception ">
	//   78  153:aload_1         
	//   79  154:invokestatic    #358 <Method int Log.i(String, String, Throwable)>
	//   80  157:pop             
		throw new IOException("Remote exception");
	//   81  158:new             #71  <Class IOException>
	//   82  161:dup             
	//   83  162:ldc2            #360 <String "Remote exception">
	//   84  165:invokespecial   #167 <Method void IOException(String)>
	//   85  168:athrow          
		obj1;
	//   86  169:astore_1        
		this;
	//   87  170:aload_0         
		JVM INSTR monitorexit ;
	//   88  171:monitorexit     
		throw obj1;
	//   89  172:aload_1         
	//   90  173:athrow          
	}

	public void start()
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		zza(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #116 <Method void zza(boolean)>
	//    3    5:return          
	}

	private final Context mContext;
	private BlockingServiceConnection zze;
	private zze zzf;
	private boolean zzg;
	private final Object zzh;
	private zza zzi;
	private final boolean zzj;
	private final long zzk;
}
