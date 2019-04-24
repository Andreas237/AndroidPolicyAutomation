// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.common.zza;
import com.google.android.gms.common.zzc;
import com.google.android.gms.common.zze;
import com.google.android.gms.internal.zzcn;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.identifier:
//			zza

public class AdvertisingIdClient
{
	public static final class Info
	{

		public String getId()
		{
			return zzsp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field String zzsp>
		//    2    4:areturn         
		}

		public boolean isLimitAdTrackingEnabled()
		{
			return zzsq;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field boolean zzsq>
		//    2    4:ireturn         
		}

		public String toString()
		{
			String s = zzsp;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field String zzsp>
		//    2    4:astore_2        
			boolean flag = zzsq;
		//    3    5:aload_0         
		//    4    6:getfield        #20  <Field boolean zzsq>
		//    5    9:istore_1        
			return (new StringBuilder(String.valueOf(((Object) (s))).length() + 7)).append("{").append(s).append("}").append(flag).toString();
		//    6   10:new             #28  <Class StringBuilder>
		//    7   13:dup             
		//    8   14:aload_2         
		//    9   15:invokestatic    #34  <Method String String.valueOf(Object)>
		//   10   18:invokevirtual   #38  <Method int String.length()>
		//   11   21:bipush          7
		//   12   23:iadd            
		//   13   24:invokespecial   #41  <Method void StringBuilder(int)>
		//   14   27:ldc1            #43  <String "{">
		//   15   29:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   16   32:aload_2         
		//   17   33:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   18   36:ldc1            #49  <String "}">
		//   19   38:invokevirtual   #47  <Method StringBuilder StringBuilder.append(String)>
		//   20   41:iload_1         
		//   21   42:invokevirtual   #52  <Method StringBuilder StringBuilder.append(boolean)>
		//   22   45:invokevirtual   #54  <Method String StringBuilder.toString()>
		//   23   48:areturn         
		}

		private final String zzsp;
		private final boolean zzsq;

		public Info(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzsp = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String zzsp>
			zzsq = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field boolean zzsq>
		//    8   14:return          
		}
	}

	static class zza extends Thread
	{

		private void disconnect()
		{
			AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzsl.get();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WeakReference zzsl>
		//    2    4:invokevirtual   #48  <Method Object WeakReference.get()>
		//    3    7:checkcast       #6   <Class AdvertisingIdClient>
		//    4   10:astore_1        
			if(advertisingidclient != null)
		//*   5   11:aload_1         
		//*   6   12:ifnull          24
			{
				advertisingidclient.finish();
		//    7   15:aload_1         
		//    8   16:invokevirtual   #51  <Method void AdvertisingIdClient.finish()>
				zzso = true;
		//    9   19:aload_0         
		//   10   20:iconst_1        
		//   11   21:putfield        #39  <Field boolean zzso>
			}
		//   12   24:return          
		}

		public void cancel()
		{
			zzsn.countDown();
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field CountDownLatch zzsn>
		//    2    4:invokevirtual   #55  <Method void CountDownLatch.countDown()>
		//    3    7:return          
		}

		public void run()
		{
			try
			{
				if(!zzsn.await(zzsm, TimeUnit.MILLISECONDS))
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field CountDownLatch zzsn>
		//*   2    4:aload_0         
		//*   3    5:getfield        #30  <Field long zzsm>
		//*   4    8:getstatic       #64  <Field TimeUnit TimeUnit.MILLISECONDS>
		//*   5   11:invokevirtual   #68  <Method boolean CountDownLatch.await(long, TimeUnit)>
		//*   6   14:ifne            21
					disconnect();
		//    7   17:aload_0         
		//    8   18:invokespecial   #70  <Method void disconnect()>
				return;
		//    9   21:return          
			}
			catch(InterruptedException interruptedexception)
		//*  10   22:astore_1        
			{
				disconnect();
		//   11   23:aload_0         
		//   12   24:invokespecial   #70  <Method void disconnect()>
			}
		//   13   27:return          
		}

		public boolean zzby()
		{
			return zzso;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field boolean zzso>
		//    2    4:ireturn         
		}

		private WeakReference zzsl;
		private long zzsm;
		CountDownLatch zzsn;
		boolean zzso;

		public zza(AdvertisingIdClient advertisingidclient, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Thread()>
			zzsl = new WeakReference(((Object) (advertisingidclient)));
		//    2    4:aload_0         
		//    3    5:new             #23  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #26  <Method void WeakReference(Object)>
		//    7   13:putfield        #28  <Field WeakReference zzsl>
			zzsm = l;
		//    8   16:aload_0         
		//    9   17:lload_2         
		//   10   18:putfield        #30  <Field long zzsm>
			zzsn = new CountDownLatch(1);
		//   11   21:aload_0         
		//   12   22:new             #32  <Class CountDownLatch>
		//   13   25:dup             
		//   14   26:iconst_1        
		//   15   27:invokespecial   #35  <Method void CountDownLatch(int)>
		//   16   30:putfield        #37  <Field CountDownLatch zzsn>
			zzso = false;
		//   17   33:aload_0         
		//   18   34:iconst_0        
		//   19   35:putfield        #39  <Field boolean zzso>
			start();
		//   20   38:aload_0         
		//   21   39:invokevirtual   #42  <Method void start()>
		//   22   42:return          
		}
	}


	public AdvertisingIdClient(Context context)
	{
		this(context, 30000L, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:ldc2w           #29  <Long 30000L>
	//    3    5:iconst_0        
	//    4    6:invokespecial   #33  <Method void AdvertisingIdClient(Context, long, boolean)>
	//    5    9:return          
	}

	public AdvertisingIdClient(Context context, long l, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		zzsh = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void Object()>
	//    6   12:putfield        #39  <Field Object zzsh>
		zzac.zzw(((Object) (context)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #45  <Method Object zzac.zzw(Object)>
	//    9   19:pop             
		if(flag)
	//*  10   20:iload           4
	//*  11   22:ifeq            58
		{
			Context context1 = context.getApplicationContext();
	//   12   25:aload_1         
	//   13   26:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//   14   29:astore          5
			if(context1 != null)
	//*  15   31:aload           5
	//*  16   33:ifnonnull       52
	//*  17   36:aload_0         
	//*  18   37:aload_1         
	//*  19   38:putfield        #53  <Field Context mContext>
	//*  20   41:aload_0         
	//*  21   42:iconst_0        
	//*  22   43:putfield        #55  <Field boolean zzsg>
	//*  23   46:aload_0         
	//*  24   47:lload_2         
	//*  25   48:putfield        #57  <Field long zzsj>
	//*  26   51:return          
				context = context1;
	//   27   52:aload           5
	//   28   54:astore_1        
			mContext = context;
		} else
	//*  29   55:goto            36
		{
			mContext = context;
	//   30   58:aload_0         
	//   31   59:aload_1         
	//   32   60:putfield        #53  <Field Context mContext>
		}
		zzsg = false;
		zzsj = l;
	//*  33   63:goto            41
	}

	public static Info getAdvertisingIdInfo(Context context)
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		float f1;
		boolean flag;
		boolean flag1;
		boolean flag2;
		f1 = 0.0F;
	//    0    0:fconst_0        
	//    1    1:fstore_2        
		flag1 = false;
	//    2    2:iconst_0        
	//    3    3:istore          4
		flag2 = false;
	//    4    5:iconst_0        
	//    5    6:istore          5
		flag = flag1;
	//    6    8:iload           4
	//    7   10:istore_3        
		Object obj = ((Object) (com.google.android.gms.common.zze.getRemoteContext(context)));
	//    8   11:aload_0         
	//    9   12:invokestatic    #77  <Method Context zze.getRemoteContext(Context)>
	//   10   15:astore          6
		float f;
		f = f1;
	//   11   17:fload_2         
	//   12   18:fstore_1        
		flag = flag2;
	//   13   19:iload           5
	//   14   21:istore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_72;
	//   15   22:aload           6
	//   16   24:ifnull          72
		flag = flag1;
	//   17   27:iload           4
	//   18   29:istore_3        
		obj = ((Object) (((Context) (obj)).getSharedPreferences("google_ads_flags", 1)));
	//   19   30:aload           6
	//   20   32:ldc1            #79  <String "google_ads_flags">
	//   21   34:iconst_1        
	//   22   35:invokevirtual   #83  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   23   38:astore          6
		flag = flag1;
	//   24   40:iload           4
	//   25   42:istore_3        
		flag1 = ((SharedPreferences) (obj)).getBoolean("gads:ad_id_app_context:enabled", false);
	//   26   43:aload           6
	//   27   45:ldc1            #85  <String "gads:ad_id_app_context:enabled">
	//   28   47:iconst_0        
	//   29   48:invokeinterface #91  <Method boolean SharedPreferences.getBoolean(String, boolean)>
	//   30   53:istore          4
		flag = flag1;
	//   31   55:iload           4
	//   32   57:istore_3        
		f = ((SharedPreferences) (obj)).getFloat("gads:ad_id_app_context:ping_ratio", 0.0F);
	//   33   58:aload           6
	//   34   60:ldc1            #93  <String "gads:ad_id_app_context:ping_ratio">
	//   35   62:fconst_0        
	//   36   63:invokeinterface #97  <Method float SharedPreferences.getFloat(String, float)>
	//   37   68:fstore_1        
		flag = flag1;
	//   38   69:iload           4
	//   39   71:istore_3        
_L2:
		context = ((Context) (new AdvertisingIdClient(context, -1L, flag)));
	//   40   72:new             #2   <Class AdvertisingIdClient>
	//   41   75:dup             
	//   42   76:aload_0         
	//   43   77:ldc2w           #98  <Long -1L>
	//   44   80:iload_3         
	//   45   81:invokespecial   #33  <Method void AdvertisingIdClient(Context, long, boolean)>
	//   46   84:astore_0        
		((AdvertisingIdClient) (context)).zze(false);
	//   47   85:aload_0         
	//   48   86:iconst_0        
	//   49   87:invokevirtual   #103 <Method void zze(boolean)>
		obj = ((Object) (((AdvertisingIdClient) (context)).getInfo()));
	//   50   90:aload_0         
	//   51   91:invokevirtual   #107 <Method AdvertisingIdClient$Info getInfo()>
	//   52   94:astore          6
		((AdvertisingIdClient) (context)).zza(((Info) (obj)), flag, f, ((Throwable) (null)));
	//   53   96:aload_0         
	//   54   97:aload           6
	//   55   99:iload_3         
	//   56  100:fload_1         
	//   57  101:aconst_null     
	//   58  102:invokespecial   #110 <Method void zza(AdvertisingIdClient$Info, boolean, float, Throwable)>
		((AdvertisingIdClient) (context)).finish();
	//   59  105:aload_0         
	//   60  106:invokevirtual   #113 <Method void finish()>
		return ((Info) (obj));
	//   61  109:aload           6
	//   62  111:areturn         
		Object obj1;
		obj1;
	//   63  112:astore          6
		Log.w("AdvertisingIdClient", "Error while reading from SharedPreferences ", ((Throwable) (obj1)));
	//   64  114:ldc1            #115 <String "AdvertisingIdClient">
	//   65  116:ldc1            #117 <String "Error while reading from SharedPreferences ">
	//   66  118:aload           6
	//   67  120:invokestatic    #123 <Method int Log.w(String, String, Throwable)>
	//   68  123:pop             
		f = f1;
	//   69  124:fload_2         
	//   70  125:fstore_1        
		if(true) goto _L2; else goto _L1
	//   71  126:goto            72
_L1:
		obj1;
	//   72  129:astore          6
		((AdvertisingIdClient) (context)).zza(((Info) (null)), flag, f, ((Throwable) (obj1)));
	//   73  131:aload_0         
	//   74  132:aconst_null     
	//   75  133:iload_3         
	//   76  134:fload_1         
	//   77  135:aload           6
	//   78  137:invokespecial   #110 <Method void zza(AdvertisingIdClient$Info, boolean, float, Throwable)>
		((AdvertisingIdClient) (context)).finish();
	//   79  140:aload_0         
	//   80  141:invokevirtual   #113 <Method void finish()>
		return null;
	//   81  144:aconst_null     
	//   82  145:areturn         
		obj1;
	//   83  146:astore          6
		((AdvertisingIdClient) (context)).finish();
	//   84  148:aload_0         
	//   85  149:invokevirtual   #113 <Method void finish()>
		throw obj1;
	//   86  152:aload           6
	//   87  154:athrow          
	}

	public static void setShouldSkipGmsCoreVersionCheck(boolean flag)
	{
	//    0    0:return          
	}

	static zzcn zza(Context context, com.google.android.gms.common.zza zza1)
		throws IOException
	{
		try
		{
			context = ((Context) (com.google.android.gms.internal.zzcn.zza.zzf(zza1.zza(10000L, TimeUnit.MILLISECONDS))));
	//    0    0:aload_1         
	//    1    1:ldc2w           #129 <Long 10000L>
	//    2    4:getstatic       #136 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    7:invokevirtual   #141 <Method android.os.IBinder zza.zza(long, TimeUnit)>
	//    4   10:invokestatic    #147 <Method zzcn com.google.android.gms.internal.zzcn$zza.zzf(android.os.IBinder)>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*   8   16:astore_0        
		{
			throw new IOException("Interrupted exception");
	//    9   17:new             #61  <Class IOException>
	//   10   20:dup             
	//   11   21:ldc1            #149 <String "Interrupted exception">
	//   12   23:invokespecial   #152 <Method void IOException(String)>
	//   13   26:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  14   27:astore_0        
		{
			throw new IOException(((Throwable) (context)));
	//   15   28:new             #61  <Class IOException>
	//   16   31:dup             
	//   17   32:aload_0         
	//   18   33:invokespecial   #155 <Method void IOException(Throwable)>
	//   19   36:athrow          
		}
		return ((zzcn) (context));
	}

	private void zza(Info info, boolean flag, float f, Throwable throwable)
	{
		if(Math.random() > (double)f)
	//*   0    0:invokestatic    #161 <Method double Math.random()>
	//*   1    3:fload_3         
	//*   2    4:f2d             
	//*   3    5:dcmpl           
	//*   4    6:ifle            10
		{
			return;
	//    5    9:return          
		} else
		{
			((_cls1) (new Thread(zza(info, flag, throwable).toString()) {

				public void run()
				{
					(new com.google.android.gms.ads.identifier.zza()).zzu(zzsk);
				//    0    0:new             #22  <Class com.google.android.gms.ads.identifier.zza>
				//    1    3:dup             
				//    2    4:invokespecial   #23  <Method void com.google.android.gms.ads.identifier.zza()>
				//    3    7:aload_0         
				//    4    8:getfield        #15  <Field String zzsk>
				//    5   11:invokevirtual   #27  <Method void zza.zzu(String)>
				//    6   14:return          
				}

				final String zzsk;

			
			{
				zzsk = s;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field String zzsk>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #18  <Method void Thread()>
			//    5    9:return          
			}
			}
)).start();
	//    6   10:new             #6   <Class AdvertisingIdClient$1>
	//    7   13:dup             
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:iload_2         
	//   12   18:aload           4
	//   13   20:invokevirtual   #164 <Method Uri zza(AdvertisingIdClient$Info, boolean, Throwable)>
	//   14   23:invokevirtual   #170 <Method String Uri.toString()>
	//   15   26:invokespecial   #173 <Method void AdvertisingIdClient$1(AdvertisingIdClient, String)>
	//   16   29:invokevirtual   #176 <Method void AdvertisingIdClient$1.start()>
			return;
	//   17   32:return          
		}
	}

	private void zzbx()
	{
		Object obj = zzsh;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Object zzsh>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzsi == null)
			break MISSING_BLOCK_LABEL_28;
	//    5    7:aload_0         
	//    6    8:getfield        #179 <Field AdvertisingIdClient$zza zzsi>
	//    7   11:ifnull          28
		zzsi.cancel();
	//    8   14:aload_0         
	//    9   15:getfield        #179 <Field AdvertisingIdClient$zza zzsi>
	//   10   18:invokevirtual   #182 <Method void AdvertisingIdClient$zza.cancel()>
		Exception exception;
		try
		{
			zzsi.join();
	//   11   21:aload_0         
	//   12   22:getfield        #179 <Field AdvertisingIdClient$zza zzsi>
	//   13   25:invokevirtual   #185 <Method void AdvertisingIdClient$zza.join()>
		}
	//*  14   28:aload_0         
	//*  15   29:getfield        #57  <Field long zzsj>
	//*  16   32:lconst_0        
	//*  17   33:lcmp            
	//*  18   34:ifle            53
	//*  19   37:aload_0         
	//*  20   38:new             #11  <Class AdvertisingIdClient$zza>
	//*  21   41:dup             
	//*  22   42:aload_0         
	//*  23   43:aload_0         
	//*  24   44:getfield        #57  <Field long zzsj>
	//*  25   47:invokespecial   #188 <Method void AdvertisingIdClient$zza(AdvertisingIdClient, long)>
	//*  26   50:putfield        #179 <Field AdvertisingIdClient$zza zzsi>
	//*  27   53:aload_1         
	//*  28   54:monitorexit     
	//*  29   55:return          
	//*  30   56:astore_2        
	//*  31   57:aload_1         
	//*  32   58:monitorexit     
	//*  33   59:aload_2         
	//*  34   60:athrow          
		catch(InterruptedException interruptedexception) { }
	//   35   61:astore_2        
		if(zzsj > 0L)
			zzsi = new zza(this, zzsj);
		return;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  36   62:goto            28
	}

	static com.google.android.gms.common.zza zzf(Context context)
		throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		try
		{
			context.getPackageManager().getPackageInfo("com.android.vending", 0);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #195 <Method PackageManager Context.getPackageManager()>
	//    2    4:ldc1            #197 <String "com.android.vending">
	//    3    6:iconst_0        
	//    4    7:invokevirtual   #203 <Method android.content.pm.PackageInfo PackageManager.getPackageInfo(String, int)>
	//    5   10:pop             
		}
	//*   6   11:invokestatic    #209 <Method zzc zzc.zzuz()>
	//*   7   14:aload_0         
	//*   8   15:invokevirtual   #213 <Method int zzc.isGooglePlayServicesAvailable(Context)>
	//*   9   18:tableswitch     0 2: default 44
	//	               0 65
	//	               1 44
	//	               2 65
	//*  10   44:new             #61  <Class IOException>
	//*  11   47:dup             
	//*  12   48:ldc1            #215 <String "Google Play services not available">
	//*  13   50:invokespecial   #152 <Method void IOException(String)>
	//*  14   53:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  15   54:astore_0        
		{
			throw new GooglePlayServicesNotAvailableException(9);
	//   16   55:new             #65  <Class GooglePlayServicesNotAvailableException>
	//   17   58:dup             
	//   18   59:bipush          9
	//   19   61:invokespecial   #218 <Method void GooglePlayServicesNotAvailableException(int)>
	//   20   64:athrow          
		}
		com.google.android.gms.common.zza zza1;
		switch(zzc.zzuz().isGooglePlayServicesAvailable(context))
		{
		case 1: // '\001'
		default:
			throw new IOException("Google Play services not available");

		case 0: // '\0'
		case 2: // '\002'
			zza1 = new com.google.android.gms.common.zza();
	//   21   65:new             #138 <Class zza>
	//   22   68:dup             
	//   23   69:invokespecial   #219 <Method void zza()>
	//   24   72:astore_2        
			break;
		}
		Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
	//   25   73:new             #221 <Class Intent>
	//   26   76:dup             
	//   27   77:ldc1            #223 <String "com.google.android.gms.ads.identifier.service.START">
	//   28   79:invokespecial   #224 <Method void Intent(String)>
	//   29   82:astore_3        
		intent.setPackage("com.google.android.gms");
	//   30   83:aload_3         
	//   31   84:ldc1            #226 <String "com.google.android.gms">
	//   32   86:invokevirtual   #230 <Method Intent Intent.setPackage(String)>
	//   33   89:pop             
		boolean flag;
		try
		{
			flag = com.google.android.gms.common.stats.zza.zzyc().zza(context, intent, ((android.content.ServiceConnection) (zza1)), 1);
	//   34   90:invokestatic    #236 <Method com.google.android.gms.common.stats.zza com.google.android.gms.common.stats.zza.zzyc()>
	//   35   93:aload_0         
	//   36   94:aload_3         
	//   37   95:aload_2         
	//   38   96:iconst_1        
	//   39   97:invokevirtual   #239 <Method boolean com.google.android.gms.common.stats.zza.zza(Context, Intent, android.content.ServiceConnection, int)>
	//   40  100:istore_1        
		}
	//*  41  101:iload_1         
	//*  42  102:ifeq            117
	//*  43  105:aload_2         
	//*  44  106:areturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  45  107:astore_0        
		{
			throw new IOException(((Throwable) (context)));
	//   46  108:new             #61  <Class IOException>
	//   47  111:dup             
	//   48  112:aload_0         
	//   49  113:invokespecial   #155 <Method void IOException(Throwable)>
	//   50  116:athrow          
		}
		if(flag)
			return zza1;
		else
			throw new IOException("Connection failure");
	//   51  117:new             #61  <Class IOException>
	//   52  120:dup             
	//   53  121:ldc1            #241 <String "Connection failure">
	//   54  123:invokespecial   #152 <Method void IOException(String)>
	//   55  126:athrow          
	}

	protected void finalize()
		throws Throwable
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method void finish()>
		super.finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #244 <Method void Object.finalize()>
	//    4    8:return          
	}

	public void finish()
	{
		zzac.zzdo("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #248 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #251 <Method void zzac.zzdo(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(mContext != null && zzse != null)
			break MISSING_BLOCK_LABEL_24;
	//    4    7:aload_0         
	//    5    8:getfield        #53  <Field Context mContext>
	//    6   11:ifnull          21
	//    7   14:aload_0         
	//    8   15:getfield        #253 <Field zza zzse>
	//    9   18:ifnonnull       24
		this;
	//   10   21:aload_0         
		JVM INSTR monitorexit ;
	//   11   22:monitorexit     
		return;
	//   12   23:return          
		if(zzsg)
	//*  13   24:aload_0         
	//*  14   25:getfield        #55  <Field boolean zzsg>
	//*  15   28:ifeq            45
			com.google.android.gms.common.stats.zza.zzyc().zza(mContext, ((android.content.ServiceConnection) (zzse)));
	//   16   31:invokestatic    #236 <Method com.google.android.gms.common.stats.zza com.google.android.gms.common.stats.zza.zzyc()>
	//   17   34:aload_0         
	//   18   35:getfield        #53  <Field Context mContext>
	//   19   38:aload_0         
	//   20   39:getfield        #253 <Field zza zzse>
	//   21   42:invokevirtual   #256 <Method void com.google.android.gms.common.stats.zza.zza(Context, android.content.ServiceConnection)>
_L1:
		zzsg = false;
	//   22   45:aload_0         
	//   23   46:iconst_0        
	//   24   47:putfield        #55  <Field boolean zzsg>
		zzsf = null;
	//   25   50:aload_0         
	//   26   51:aconst_null     
	//   27   52:putfield        #258 <Field zzcn zzsf>
		zzse = null;
	//   28   55:aload_0         
	//   29   56:aconst_null     
	//   30   57:putfield        #253 <Field zza zzse>
		this;
	//   31   60:aload_0         
		JVM INSTR monitorexit ;
	//   32   61:monitorexit     
		return;
	//   33   62:return          
		Object obj;
		obj;
	//   34   63:astore_1        
		this;
	//   35   64:aload_0         
		JVM INSTR monitorexit ;
	//   36   65:monitorexit     
		throw obj;
	//   37   66:aload_1         
	//   38   67:athrow          
		obj;
	//   39   68:astore_1        
		Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
	//   40   69:ldc1            #115 <String "AdvertisingIdClient">
	//   41   71:ldc2            #260 <String "AdvertisingIdClient unbindService failed.">
	//   42   74:aload_1         
	//   43   75:invokestatic    #263 <Method int Log.i(String, String, Throwable)>
	//   44   78:pop             
		  goto _L1
	//*  45   79:goto            45
		obj;
	//   46   82:astore_1        
		Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
	//   47   83:ldc1            #115 <String "AdvertisingIdClient">
	//   48   85:ldc2            #260 <String "AdvertisingIdClient unbindService failed.">
	//   49   88:aload_1         
	//   50   89:invokestatic    #263 <Method int Log.i(String, String, Throwable)>
	//   51   92:pop             
		  goto _L1
	//*  52   93:goto            45
	}

	public Info getInfo()
		throws IOException
	{
		zzac.zzdo("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #248 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #251 <Method void zzac.zzdo(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzsg)
			break MISSING_BLOCK_LABEL_97;
	//    4    7:aload_0         
	//    5    8:getfield        #55  <Field boolean zzsg>
	//    6   11:ifne            97
		Object obj = zzsh;
	//    7   14:aload_0         
	//    8   15:getfield        #39  <Field Object zzsh>
	//    9   18:astore_1        
		obj;
	//   10   19:aload_1         
		JVM INSTR monitorenter ;
	//   11   20:monitorenter    
		if(zzsi == null || !zzsi.zzby())
	//*  12   21:aload_0         
	//*  13   22:getfield        #179 <Field AdvertisingIdClient$zza zzsi>
	//*  14   25:ifnull          38
	//*  15   28:aload_0         
	//*  16   29:getfield        #179 <Field AdvertisingIdClient$zza zzsi>
	//*  17   32:invokevirtual   #269 <Method boolean AdvertisingIdClient$zza.zzby()>
	//*  18   35:ifne            59
			throw new IOException("AdvertisingIdClient is not connected.");
	//   19   38:new             #61  <Class IOException>
	//   20   41:dup             
	//   21   42:ldc2            #271 <String "AdvertisingIdClient is not connected.">
	//   22   45:invokespecial   #152 <Method void IOException(String)>
	//   23   48:athrow          
		break MISSING_BLOCK_LABEL_59;
		Exception exception;
		exception;
	//   24   49:astore_2        
		obj;
	//   25   50:aload_1         
		JVM INSTR monitorexit ;
	//   26   51:monitorexit     
		throw exception;
	//   27   52:aload_2         
	//   28   53:athrow          
		obj;
	//   29   54:astore_1        
		this;
	//   30   55:aload_0         
		JVM INSTR monitorexit ;
	//   31   56:monitorexit     
		throw obj;
	//   32   57:aload_1         
	//   33   58:athrow          
		obj;
	//   34   59:aload_1         
		JVM INSTR monitorexit ;
	//   35   60:monitorexit     
		zze(false);
	//   36   61:aload_0         
	//   37   62:iconst_0        
	//   38   63:invokevirtual   #103 <Method void zze(boolean)>
		if(!zzsg)
	//*  39   66:aload_0         
	//*  40   67:getfield        #55  <Field boolean zzsg>
	//*  41   70:ifne            97
			throw new IOException("AdvertisingIdClient cannot reconnect.");
	//   42   73:new             #61  <Class IOException>
	//   43   76:dup             
	//   44   77:ldc2            #273 <String "AdvertisingIdClient cannot reconnect.">
	//   45   80:invokespecial   #152 <Method void IOException(String)>
	//   46   83:athrow          
		break MISSING_BLOCK_LABEL_97;
		Object obj1;
		obj1;
	//   47   84:astore_1        
		throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (obj1)));
	//   48   85:new             #61  <Class IOException>
	//   49   88:dup             
	//   50   89:ldc2            #273 <String "AdvertisingIdClient cannot reconnect.">
	//   51   92:aload_1         
	//   52   93:invokespecial   #276 <Method void IOException(String, Throwable)>
	//   53   96:athrow          
		zzac.zzw(((Object) (zzse)));
	//   54   97:aload_0         
	//   55   98:getfield        #253 <Field zza zzse>
	//   56  101:invokestatic    #45  <Method Object zzac.zzw(Object)>
	//   57  104:pop             
		zzac.zzw(((Object) (zzsf)));
	//   58  105:aload_0         
	//   59  106:getfield        #258 <Field zzcn zzsf>
	//   60  109:invokestatic    #45  <Method Object zzac.zzw(Object)>
	//   61  112:pop             
		obj1 = ((Object) (new Info(zzsf.getId(), zzsf.zzf(true))));
	//   62  113:new             #8   <Class AdvertisingIdClient$Info>
	//   63  116:dup             
	//   64  117:aload_0         
	//   65  118:getfield        #258 <Field zzcn zzsf>
	//   66  121:invokeinterface #281 <Method String zzcn.getId()>
	//   67  126:aload_0         
	//   68  127:getfield        #258 <Field zzcn zzsf>
	//   69  130:iconst_1        
	//   70  131:invokeinterface #284 <Method boolean zzcn.zzf(boolean)>
	//   71  136:invokespecial   #287 <Method void AdvertisingIdClient$Info(String, boolean)>
	//   72  139:astore_1        
		this;
	//   73  140:aload_0         
		JVM INSTR monitorexit ;
	//   74  141:monitorexit     
		zzbx();
	//   75  142:aload_0         
	//   76  143:invokespecial   #289 <Method void zzbx()>
		return ((Info) (obj1));
	//   77  146:aload_1         
	//   78  147:areturn         
		obj1;
	//   79  148:astore_1        
		Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (obj1)));
	//   80  149:ldc1            #115 <String "AdvertisingIdClient">
	//   81  151:ldc2            #291 <String "GMS remote exception ">
	//   82  154:aload_1         
	//   83  155:invokestatic    #263 <Method int Log.i(String, String, Throwable)>
	//   84  158:pop             
		throw new IOException("Remote exception");
	//   85  159:new             #61  <Class IOException>
	//   86  162:dup             
	//   87  163:ldc2            #293 <String "Remote exception">
	//   88  166:invokespecial   #152 <Method void IOException(String)>
	//   89  169:athrow          
	}

	public void start()
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		zze(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #103 <Method void zze(boolean)>
	//    3    5:return          
	}

	Uri zza(Info info, boolean flag, Throwable throwable)
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #295 <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #296 <Method void Bundle()>
	//    3    7:astore          5
		String s;
		if(flag)
	//*   4    9:iload_2         
	//*   5   10:ifeq            160
			s = "1";
	//    6   13:ldc2            #298 <String "1">
	//    7   16:astore          4
		else
	//*   8   18:aload           5
	//*   9   20:ldc2            #300 <String "app_context">
	//*  10   23:aload           4
	//*  11   25:invokevirtual   #304 <Method void Bundle.putString(String, String)>
	//*  12   28:aload_1         
	//*  13   29:ifnull          54
	//*  14   32:aload_1         
	//*  15   33:invokevirtual   #307 <Method boolean AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//*  16   36:ifeq            168
	//*  17   39:ldc2            #298 <String "1">
	//*  18   42:astore          4
	//*  19   44:aload           5
	//*  20   46:ldc2            #309 <String "limit_ad_tracking">
	//*  21   49:aload           4
	//*  22   51:invokevirtual   #304 <Method void Bundle.putString(String, String)>
	//*  23   54:aload_1         
	//*  24   55:ifnull          83
	//*  25   58:aload_1         
	//*  26   59:invokevirtual   #310 <Method String AdvertisingIdClient$Info.getId()>
	//*  27   62:ifnull          83
	//*  28   65:aload           5
	//*  29   67:ldc2            #312 <String "ad_id_size">
	//*  30   70:aload_1         
	//*  31   71:invokevirtual   #310 <Method String AdvertisingIdClient$Info.getId()>
	//*  32   74:invokevirtual   #318 <Method int String.length()>
	//*  33   77:invokestatic    #323 <Method String Integer.toString(int)>
	//*  34   80:invokevirtual   #304 <Method void Bundle.putString(String, String)>
	//*  35   83:aload_3         
	//*  36   84:ifnull          102
	//*  37   87:aload           5
	//*  38   89:ldc2            #325 <String "error">
	//*  39   92:aload_3         
	//*  40   93:invokevirtual   #329 <Method Class Object.getClass()>
	//*  41   96:invokevirtual   #334 <Method String Class.getName()>
	//*  42   99:invokevirtual   #304 <Method void Bundle.putString(String, String)>
	//*  43  102:ldc2            #336 <String "https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps">
	//*  44  105:invokestatic    #340 <Method Uri Uri.parse(String)>
	//*  45  108:invokevirtual   #344 <Method android.net.Uri$Builder Uri.buildUpon()>
	//*  46  111:astore_1        
	//*  47  112:aload           5
	//*  48  114:invokevirtual   #348 <Method Set Bundle.keySet()>
	//*  49  117:invokeinterface #354 <Method Iterator Set.iterator()>
	//*  50  122:astore_3        
	//*  51  123:aload_3         
	//*  52  124:invokeinterface #359 <Method boolean Iterator.hasNext()>
	//*  53  129:ifeq            176
	//*  54  132:aload_3         
	//*  55  133:invokeinterface #363 <Method Object Iterator.next()>
	//*  56  138:checkcast       #314 <Class String>
	//*  57  141:astore          4
	//*  58  143:aload_1         
	//*  59  144:aload           4
	//*  60  146:aload           5
	//*  61  148:aload           4
	//*  62  150:invokevirtual   #367 <Method String Bundle.getString(String)>
	//*  63  153:invokevirtual   #373 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//*  64  156:pop             
	//*  65  157:goto            123
			s = "0";
	//   66  160:ldc2            #375 <String "0">
	//   67  163:astore          4
		bundle.putString("app_context", s);
		if(info != null)
		{
			if(info.isLimitAdTrackingEnabled())
				s = "1";
			else
	//*  68  165:goto            18
				s = "0";
	//   69  168:ldc2            #375 <String "0">
	//   70  171:astore          4
			bundle.putString("limit_ad_tracking", s);
		}
		if(info != null && info.getId() != null)
			bundle.putString("ad_id_size", Integer.toString(info.getId().length()));
		if(throwable != null)
			bundle.putString("error", ((Object) (throwable)).getClass().getName());
		info = ((Info) (Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon()));
		for(throwable = ((Throwable) (bundle.keySet().iterator())); ((Iterator) (throwable)).hasNext(); ((android.net.Uri.Builder) (info)).appendQueryParameter(s, bundle.getString(s)))
			s = (String)((Iterator) (throwable)).next();

	//*  71  173:goto            44
		return ((android.net.Uri.Builder) (info)).build();
	//   72  176:aload_1         
	//   73  177:invokevirtual   #379 <Method Uri android.net.Uri$Builder.build()>
	//   74  180:areturn         
	}

	protected void zze(boolean flag)
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		zzac.zzdo("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #248 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #251 <Method void zzac.zzdo(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzsg)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean zzsg>
	//*   6   11:ifeq            18
			finish();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #113 <Method void finish()>
		zzse = zzf(mContext);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #53  <Field Context mContext>
	//   12   23:invokestatic    #381 <Method zza zzf(Context)>
	//   13   26:putfield        #253 <Field zza zzse>
		zzsf = zza(mContext, zzse);
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:getfield        #53  <Field Context mContext>
	//   17   34:aload_0         
	//   18   35:getfield        #253 <Field zza zzse>
	//   19   38:invokestatic    #383 <Method zzcn zza(Context, zza)>
	//   20   41:putfield        #258 <Field zzcn zzsf>
		zzsg = true;
	//   21   44:aload_0         
	//   22   45:iconst_1        
	//   23   46:putfield        #55  <Field boolean zzsg>
		if(!flag)
			break MISSING_BLOCK_LABEL_57;
	//   24   49:iload_1         
	//   25   50:ifeq            57
		zzbx();
	//   26   53:aload_0         
	//   27   54:invokespecial   #289 <Method void zzbx()>
		this;
	//   28   57:aload_0         
		JVM INSTR monitorexit ;
	//   29   58:monitorexit     
		return;
	//   30   59:return          
		Exception exception;
		exception;
	//   31   60:astore_2        
		this;
	//   32   61:aload_0         
		JVM INSTR monitorexit ;
	//   33   62:monitorexit     
		throw exception;
	//   34   63:aload_2         
	//   35   64:athrow          
	}

	private final Context mContext;
	com.google.android.gms.common.zza zzse;
	zzcn zzsf;
	boolean zzsg;
	Object zzsh;
	zza zzsi;
	final long zzsj;
}
