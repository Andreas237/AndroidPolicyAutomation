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
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzg;
import com.google.android.gms.internal.zzcq;
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
			return zzsl;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field String zzsl>
		//    2    4:areturn         
		}

		public boolean isLimitAdTrackingEnabled()
		{
			return zzsm;
		//    0    0:aload_0         
		//    1    1:getfield        #20  <Field boolean zzsm>
		//    2    4:ireturn         
		}

		public String toString()
		{
			String s = zzsl;
		//    0    0:aload_0         
		//    1    1:getfield        #18  <Field String zzsl>
		//    2    4:astore_2        
			boolean flag = zzsm;
		//    3    5:aload_0         
		//    4    6:getfield        #20  <Field boolean zzsm>
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

		private final String zzsl;
		private final boolean zzsm;

		public Info(String s, boolean flag)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			zzsl = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field String zzsl>
			zzsm = flag;
		//    5    9:aload_0         
		//    6   10:iload_2         
		//    7   11:putfield        #20  <Field boolean zzsm>
		//    8   14:return          
		}
	}

	static class zza extends Thread
	{

		private void disconnect()
		{
			AdvertisingIdClient advertisingidclient = (AdvertisingIdClient)zzsh.get();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field WeakReference zzsh>
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
				zzsk = true;
		//    9   19:aload_0         
		//   10   20:iconst_1        
		//   11   21:putfield        #39  <Field boolean zzsk>
			}
		//   12   24:return          
		}

		public void cancel()
		{
			zzsj.countDown();
		//    0    0:aload_0         
		//    1    1:getfield        #37  <Field CountDownLatch zzsj>
		//    2    4:invokevirtual   #55  <Method void CountDownLatch.countDown()>
		//    3    7:return          
		}

		public void run()
		{
			InterruptedException interruptedexception;
			try
			{
				if(!zzsj.await(zzsi, TimeUnit.MILLISECONDS))
		//*   0    0:aload_0         
		//*   1    1:getfield        #37  <Field CountDownLatch zzsj>
		//*   2    4:aload_0         
		//*   3    5:getfield        #30  <Field long zzsi>
		//*   4    8:getstatic       #64  <Field TimeUnit TimeUnit.MILLISECONDS>
		//*   5   11:invokevirtual   #68  <Method boolean CountDownLatch.await(long, TimeUnit)>
		//*   6   14:ifne            21
					disconnect();
		//    7   17:aload_0         
		//    8   18:invokespecial   #70  <Method void disconnect()>
				return;
		//    9   21:return          
			}
		//*  10   22:aload_0         
		//*  11   23:invokespecial   #70  <Method void disconnect()>
		//*  12   26:return          
			// Misplaced declaration of an exception variable
			catch(InterruptedException interruptedexception)
			{
				disconnect();
			}
		//*  13   27:astore_1        
		//*  14   28:goto            22
		}

		public boolean zzbx()
		{
			return zzsk;
		//    0    0:aload_0         
		//    1    1:getfield        #39  <Field boolean zzsk>
		//    2    4:ireturn         
		}

		private WeakReference zzsh;
		private long zzsi;
		CountDownLatch zzsj;
		boolean zzsk;

		public zza(AdvertisingIdClient advertisingidclient, long l)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #21  <Method void Thread()>
			zzsh = new WeakReference(((Object) (advertisingidclient)));
		//    2    4:aload_0         
		//    3    5:new             #23  <Class WeakReference>
		//    4    8:dup             
		//    5    9:aload_1         
		//    6   10:invokespecial   #26  <Method void WeakReference(Object)>
		//    7   13:putfield        #28  <Field WeakReference zzsh>
			zzsi = l;
		//    8   16:aload_0         
		//    9   17:lload_2         
		//   10   18:putfield        #30  <Field long zzsi>
			zzsj = new CountDownLatch(1);
		//   11   21:aload_0         
		//   12   22:new             #32  <Class CountDownLatch>
		//   13   25:dup             
		//   14   26:iconst_1        
		//   15   27:invokespecial   #35  <Method void CountDownLatch(int)>
		//   16   30:putfield        #37  <Field CountDownLatch zzsj>
			zzsk = false;
		//   17   33:aload_0         
		//   18   34:iconst_0        
		//   19   35:putfield        #39  <Field boolean zzsk>
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
		zzsd = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void Object()>
	//    6   12:putfield        #39  <Field Object zzsd>
		zzac.zzw(((Object) (context)));
	//    7   15:aload_1         
	//    8   16:invokestatic    #45  <Method Object zzac.zzw(Object)>
	//    9   19:pop             
		if(flag)
	//*  10   20:iload           4
	//*  11   22:ifeq            50
		{
			Context context1 = context.getApplicationContext();
	//   12   25:aload_1         
	//   13   26:invokevirtual   #51  <Method Context Context.getApplicationContext()>
	//   14   29:astore          5
			if(context1 != null)
	//*  15   31:aload           5
	//*  16   33:ifnonnull       39
	//*  17   36:goto            42
				context = context1;
	//   18   39:aload           5
	//   19   41:astore_1        
			mContext = context;
	//   20   42:aload_0         
	//   21   43:aload_1         
	//   22   44:putfield        #53  <Field Context mContext>
		} else
	//*  23   47:goto            55
		{
			mContext = context;
	//   24   50:aload_0         
	//   25   51:aload_1         
	//   26   52:putfield        #53  <Field Context mContext>
		}
		zzsc = false;
	//   27   55:aload_0         
	//   28   56:iconst_0        
	//   29   57:putfield        #55  <Field boolean zzsc>
		zzsf = l;
	//   30   60:aload_0         
	//   31   61:lload_2         
	//   32   62:putfield        #57  <Field long zzsf>
	//   33   65:return          
	}

	public static Info getAdvertisingIdInfo(Context context)
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		float f;
		float f1;
		boolean flag;
		boolean flag1;
		boolean flag2;
		flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		flag2 = false;
	//    2    3:iconst_0        
	//    3    4:istore          5
		f1 = 0.0F;
	//    4    6:fconst_0        
	//    5    7:fstore_2        
		f = 0.0F;
	//    6    8:fconst_0        
	//    7    9:fstore_1        
		flag = flag1;
	//    8   10:iload           4
	//    9   12:istore_3        
		Object obj = ((Object) (zzg.getRemoteContext(context)));
	//   10   13:aload_0         
	//   11   14:invokestatic    #77  <Method Context zzg.getRemoteContext(Context)>
	//   12   17:astore          6
		flag = flag2;
	//   13   19:iload           5
	//   14   21:istore_3        
		if(obj == null)
			break MISSING_BLOCK_LABEL_89;
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
		break MISSING_BLOCK_LABEL_89;
	//   40   72:goto            89
		Object obj1;
		obj1;
	//   41   75:astore          6
		Log.w("AdvertisingIdClient", "Error while reading from SharedPreferences ", ((Throwable) (obj1)));
	//   42   77:ldc1            #99  <String "AdvertisingIdClient">
	//   43   79:ldc1            #101 <String "Error while reading from SharedPreferences ">
	//   44   81:aload           6
	//   45   83:invokestatic    #107 <Method int Log.w(String, String, Throwable)>
	//   46   86:pop             
		f = f1;
	//   47   87:fload_2         
	//   48   88:fstore_1        
		context = ((Context) (new AdvertisingIdClient(context, -1L, flag)));
	//   49   89:new             #2   <Class AdvertisingIdClient>
	//   50   92:dup             
	//   51   93:aload_0         
	//   52   94:ldc2w           #108 <Long -1L>
	//   53   97:iload_3         
	//   54   98:invokespecial   #33  <Method void AdvertisingIdClient(Context, long, boolean)>
	//   55  101:astore_0        
		((AdvertisingIdClient) (context)).zze(false);
	//   56  102:aload_0         
	//   57  103:iconst_0        
	//   58  104:invokevirtual   #113 <Method void zze(boolean)>
		obj1 = ((Object) (((AdvertisingIdClient) (context)).getInfo()));
	//   59  107:aload_0         
	//   60  108:invokevirtual   #117 <Method AdvertisingIdClient$Info getInfo()>
	//   61  111:astore          6
		((AdvertisingIdClient) (context)).zza(((Info) (obj1)), flag, f, ((Throwable) (null)));
	//   62  113:aload_0         
	//   63  114:aload           6
	//   64  116:iload_3         
	//   65  117:fload_1         
	//   66  118:aconst_null     
	//   67  119:invokespecial   #120 <Method void zza(AdvertisingIdClient$Info, boolean, float, Throwable)>
		((AdvertisingIdClient) (context)).finish();
	//   68  122:aload_0         
	//   69  123:invokevirtual   #123 <Method void finish()>
		return ((Info) (obj1));
	//   70  126:aload           6
	//   71  128:areturn         
		obj1;
	//   72  129:astore          6
		((AdvertisingIdClient) (context)).zza(((Info) (null)), flag, f, ((Throwable) (obj1)));
	//   73  131:aload_0         
	//   74  132:aconst_null     
	//   75  133:iload_3         
	//   76  134:fload_1         
	//   77  135:aload           6
	//   78  137:invokespecial   #120 <Method void zza(AdvertisingIdClient$Info, boolean, float, Throwable)>
		((AdvertisingIdClient) (context)).finish();
	//   79  140:aload_0         
	//   80  141:invokevirtual   #123 <Method void finish()>
		return null;
	//   81  144:aconst_null     
	//   82  145:areturn         
		obj1;
	//   83  146:astore          6
		((AdvertisingIdClient) (context)).finish();
	//   84  148:aload_0         
	//   85  149:invokevirtual   #123 <Method void finish()>
		throw obj1;
	//   86  152:aload           6
	//   87  154:athrow          
	}

	public static void setShouldSkipGmsCoreVersionCheck(boolean flag)
	{
	//    0    0:return          
	}

	static zzcq zza(Context context, com.google.android.gms.common.zza zza1)
		throws IOException
	{
		try
		{
			context = ((Context) (com.google.android.gms.internal.zzcq.zza.zzf(zza1.zza(10000L, TimeUnit.MILLISECONDS))));
	//    0    0:aload_1         
	//    1    1:ldc2w           #129 <Long 10000L>
	//    2    4:getstatic       #136 <Field TimeUnit TimeUnit.MILLISECONDS>
	//    3    7:invokevirtual   #141 <Method android.os.IBinder zza.zza(long, TimeUnit)>
	//    4   10:invokestatic    #147 <Method zzcq com.google.android.gms.internal.zzcq$zza.zzf(android.os.IBinder)>
	//    5   13:astore_0        
		}
	//*   6   14:aload_0         
	//*   7   15:areturn         
	//*   8   16:new             #61  <Class IOException>
	//*   9   19:dup             
	//*  10   20:ldc1            #149 <String "Interrupted exception">
	//*  11   22:invokespecial   #152 <Method void IOException(String)>
	//*  12   25:athrow          
	//*  13   26:astore_0        
	//*  14   27:new             #61  <Class IOException>
	//*  15   30:dup             
	//*  16   31:aload_0         
	//*  17   32:invokespecial   #155 <Method void IOException(Throwable)>
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
		return ((zzcq) (context));
	//*  19   36:astore_0        
	//*  20   37:goto            16
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
					(new com.google.android.gms.ads.identifier.zza()).zzu(zzsg);
				//    0    0:new             #22  <Class com.google.android.gms.ads.identifier.zza>
				//    1    3:dup             
				//    2    4:invokespecial   #23  <Method void com.google.android.gms.ads.identifier.zza()>
				//    3    7:aload_0         
				//    4    8:getfield        #15  <Field String zzsg>
				//    5   11:invokevirtual   #27  <Method void zza.zzu(String)>
				//    6   14:return          
				}

				final String zzsg;

			
			{
				zzsg = s;
			//    0    0:aload_0         
			//    1    1:aload_2         
			//    2    2:putfield        #15  <Field String zzsg>
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

	private void zzbw()
	{
		Object obj = zzsd;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Object zzsd>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(zzse == null)
			break MISSING_BLOCK_LABEL_28;
	//    5    7:aload_0         
	//    6    8:getfield        #179 <Field AdvertisingIdClient$zza zzse>
	//    7   11:ifnull          28
		zzse.cancel();
	//    8   14:aload_0         
	//    9   15:getfield        #179 <Field AdvertisingIdClient$zza zzse>
	//   10   18:invokevirtual   #182 <Method void AdvertisingIdClient$zza.cancel()>
		Exception exception;
		try
		{
			zzse.join();
	//   11   21:aload_0         
	//   12   22:getfield        #179 <Field AdvertisingIdClient$zza zzse>
	//   13   25:invokevirtual   #185 <Method void AdvertisingIdClient$zza.join()>
		}
	//*  14   28:aload_0         
	//*  15   29:getfield        #57  <Field long zzsf>
	//*  16   32:lconst_0        
	//*  17   33:lcmp            
	//*  18   34:ifle            53
	//*  19   37:aload_0         
	//*  20   38:new             #11  <Class AdvertisingIdClient$zza>
	//*  21   41:dup             
	//*  22   42:aload_0         
	//*  23   43:aload_0         
	//*  24   44:getfield        #57  <Field long zzsf>
	//*  25   47:invokespecial   #188 <Method void AdvertisingIdClient$zza(AdvertisingIdClient, long)>
	//*  26   50:putfield        #179 <Field AdvertisingIdClient$zza zzse>
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
		if(zzsf > 0L)
			zzse = new zza(this, zzsf);
		obj;
		JVM INSTR monitorexit ;
		return;
		exception;
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
	//*   6   11:goto            24
	//*   7   14:new             #65  <Class GooglePlayServicesNotAvailableException>
	//*   8   17:dup             
	//*   9   18:bipush          9
	//*  10   20:invokespecial   #206 <Method void GooglePlayServicesNotAvailableException(int)>
	//*  11   23:athrow          
	//*  12   24:invokestatic    #212 <Method zze zze.zzuY()>
	//*  13   27:aload_0         
	//*  14   28:invokevirtual   #216 <Method int zze.isGooglePlayServicesAvailable(Context)>
	//*  15   31:lookupswitch    2: default 56
	//	               0: 59
	//	               2: 59
	//*  16   56:goto            62
	//*  17   59:goto            72
	//*  18   62:new             #61  <Class IOException>
	//*  19   65:dup             
	//*  20   66:ldc1            #218 <String "Google Play services not available">
	//*  21   68:invokespecial   #152 <Method void IOException(String)>
	//*  22   71:athrow          
	//*  23   72:new             #138 <Class zza>
	//*  24   75:dup             
	//*  25   76:invokespecial   #219 <Method void zza()>
	//*  26   79:astore_2        
	//*  27   80:new             #221 <Class Intent>
	//*  28   83:dup             
	//*  29   84:ldc1            #223 <String "com.google.android.gms.ads.identifier.service.START">
	//*  30   86:invokespecial   #224 <Method void Intent(String)>
	//*  31   89:astore_3        
	//*  32   90:aload_3         
	//*  33   91:ldc1            #226 <String "com.google.android.gms">
	//*  34   93:invokevirtual   #230 <Method Intent Intent.setPackage(String)>
	//*  35   96:pop             
	//*  36   97:invokestatic    #236 <Method com.google.android.gms.common.stats.zza com.google.android.gms.common.stats.zza.zzyJ()>
	//*  37  100:aload_0         
	//*  38  101:aload_3         
	//*  39  102:aload_2         
	//*  40  103:iconst_1        
	//*  41  104:invokevirtual   #239 <Method boolean com.google.android.gms.common.stats.zza.zza(Context, Intent, android.content.ServiceConnection, int)>
	//*  42  107:istore_1        
	//*  43  108:iload_1         
	//*  44  109:ifeq            114
	//*  45  112:aload_2         
	//*  46  113:areturn         
	//*  47  114:goto            127
	//*  48  117:astore_0        
	//*  49  118:new             #61  <Class IOException>
	//*  50  121:dup             
	//*  51  122:aload_0         
	//*  52  123:invokespecial   #155 <Method void IOException(Throwable)>
	//*  53  126:athrow          
	//*  54  127:new             #61  <Class IOException>
	//*  55  130:dup             
	//*  56  131:ldc1            #241 <String "Connection failure">
	//*  57  133:invokespecial   #152 <Method void IOException(String)>
	//*  58  136:athrow          
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new GooglePlayServicesNotAvailableException(9);
		}
		com.google.android.gms.common.zza zza1;
		switch(com.google.android.gms.common.zze.zzuY().isGooglePlayServicesAvailable(context))
		{
		default:
			throw new IOException("Google Play services not available");

		case 0: // '\0'
		case 2: // '\002'
			zza1 = new com.google.android.gms.common.zza();
			break;
		}
		Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
		intent.setPackage("com.google.android.gms");
		boolean flag;
		try
		{
			flag = com.google.android.gms.common.stats.zza.zzyJ().zza(context, intent, ((android.content.ServiceConnection) (zza1)), 1);
		}
		// Misplaced declaration of an exception variable
		catch(Context context)
		{
			throw new IOException(((Throwable) (context)));
		}
		if(flag)
			return zza1;
		else
			throw new IOException("Connection failure");
	//*  59  137:astore_0        
	//*  60  138:goto            14
	}

	protected void finalize()
		throws Throwable
	{
		finish();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #123 <Method void finish()>
		super.finalize();
	//    2    4:aload_0         
	//    3    5:invokespecial   #244 <Method void Object.finalize()>
	//    4    8:return          
	}

	public void finish()
	{
		zzac.zzdk("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #248 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #251 <Method void zzac.zzdk(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		com.google.android.gms.common.zza zza1;
		if(mContext == null)
			break MISSING_BLOCK_LABEL_23;
	//    4    7:aload_0         
	//    5    8:getfield        #53  <Field Context mContext>
	//    6   11:ifnull          23
		zza1 = zzsa;
	//    7   14:aload_0         
	//    8   15:getfield        #253 <Field zza zzsa>
	//    9   18:astore_1        
		if(zza1 != null)
			break MISSING_BLOCK_LABEL_26;
	//   10   19:aload_1         
	//   11   20:ifnonnull       26
		this;
	//   12   23:aload_0         
		JVM INSTR monitorexit ;
	//   13   24:monitorexit     
		return;
	//   14   25:return          
		if(zzsc)
	//*  15   26:aload_0         
	//*  16   27:getfield        #55  <Field boolean zzsc>
	//*  17   30:ifeq            47
			com.google.android.gms.common.stats.zza.zzyJ().zza(mContext, ((android.content.ServiceConnection) (zzsa)));
	//   18   33:invokestatic    #236 <Method com.google.android.gms.common.stats.zza com.google.android.gms.common.stats.zza.zzyJ()>
	//   19   36:aload_0         
	//   20   37:getfield        #53  <Field Context mContext>
	//   21   40:aload_0         
	//   22   41:getfield        #253 <Field zza zzsa>
	//   23   44:invokevirtual   #256 <Method void com.google.android.gms.common.stats.zza.zza(Context, android.content.ServiceConnection)>
		break MISSING_BLOCK_LABEL_75;
	//   24   47:goto            75
		Object obj;
		obj;
	//   25   50:astore_1        
		Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
	//   26   51:ldc1            #99  <String "AdvertisingIdClient">
	//   27   53:ldc2            #258 <String "AdvertisingIdClient unbindService failed.">
	//   28   56:aload_1         
	//   29   57:invokestatic    #261 <Method int Log.i(String, String, Throwable)>
	//   30   60:pop             
		break MISSING_BLOCK_LABEL_75;
	//   31   61:goto            75
		obj;
	//   32   64:astore_1        
		Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", ((Throwable) (obj)));
	//   33   65:ldc1            #99  <String "AdvertisingIdClient">
	//   34   67:ldc2            #258 <String "AdvertisingIdClient unbindService failed.">
	//   35   70:aload_1         
	//   36   71:invokestatic    #261 <Method int Log.i(String, String, Throwable)>
	//   37   74:pop             
		zzsc = false;
	//   38   75:aload_0         
	//   39   76:iconst_0        
	//   40   77:putfield        #55  <Field boolean zzsc>
		zzsb = null;
	//   41   80:aload_0         
	//   42   81:aconst_null     
	//   43   82:putfield        #263 <Field zzcq zzsb>
		zzsa = null;
	//   44   85:aload_0         
	//   45   86:aconst_null     
	//   46   87:putfield        #253 <Field zza zzsa>
		this;
	//   47   90:aload_0         
		JVM INSTR monitorexit ;
	//   48   91:monitorexit     
		return;
	//   49   92:return          
		obj;
	//   50   93:astore_1        
	//*  51   94:aload_0         
		throw obj;
	//   52   95:monitorexit     
	//   53   96:aload_1         
	//   54   97:athrow          
	}

	public Info getInfo()
		throws IOException
	{
		zzac.zzdk("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #248 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #251 <Method void zzac.zzdk(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzsc) goto _L2; else goto _L1
	//    4    7:aload_0         
	//    5    8:getfield        #55  <Field boolean zzsc>
	//    6   11:ifne            98
_L1:
		Object obj = zzsd;
	//    7   14:aload_0         
	//    8   15:getfield        #39  <Field Object zzsd>
	//    9   18:astore_1        
		obj;
	//   10   19:aload_1         
		JVM INSTR monitorenter ;
	//   11   20:monitorenter    
		if(zzse == null || !zzse.zzbx())
	//*  12   21:aload_0         
	//*  13   22:getfield        #179 <Field AdvertisingIdClient$zza zzse>
	//*  14   25:ifnull          38
	//*  15   28:aload_0         
	//*  16   29:getfield        #179 <Field AdvertisingIdClient$zza zzse>
	//*  17   32:invokevirtual   #269 <Method boolean AdvertisingIdClient$zza.zzbx()>
	//*  18   35:ifne            49
			throw new IOException("AdvertisingIdClient is not connected.");
	//   19   38:new             #61  <Class IOException>
	//   20   41:dup             
	//   21   42:ldc2            #271 <String "AdvertisingIdClient is not connected.">
	//   22   45:invokespecial   #152 <Method void IOException(String)>
	//   23   48:athrow          
		obj;
	//   24   49:aload_1         
		JVM INSTR monitorexit ;
	//   25   50:monitorexit     
		break MISSING_BLOCK_LABEL_59;
	//   26   51:goto            59
		Exception exception1;
		exception1;
	//   27   54:astore_2        
	//*  28   55:aload_1         
		throw exception1;
	//   29   56:monitorexit     
	//   30   57:aload_2         
	//   31   58:athrow          
		zze(false);
	//   32   59:aload_0         
	//   33   60:iconst_0        
	//   34   61:invokevirtual   #113 <Method void zze(boolean)>
		  goto _L3
	//*  35   64:goto            80
		Exception exception;
		exception;
	//   36   67:astore_1        
		throw new IOException("AdvertisingIdClient cannot reconnect.", ((Throwable) (exception)));
	//   37   68:new             #61  <Class IOException>
	//   38   71:dup             
	//   39   72:ldc2            #273 <String "AdvertisingIdClient cannot reconnect.">
	//   40   75:aload_1         
	//   41   76:invokespecial   #276 <Method void IOException(String, Throwable)>
	//   42   79:athrow          
_L3:
		if(!zzsc)
	//*  43   80:aload_0         
	//*  44   81:getfield        #55  <Field boolean zzsc>
	//*  45   84:ifne            98
			throw new IOException("AdvertisingIdClient cannot reconnect.");
	//   46   87:new             #61  <Class IOException>
	//   47   90:dup             
	//   48   91:ldc2            #273 <String "AdvertisingIdClient cannot reconnect.">
	//   49   94:invokespecial   #152 <Method void IOException(String)>
	//   50   97:athrow          
_L2:
		zzac.zzw(((Object) (zzsa)));
	//   51   98:aload_0         
	//   52   99:getfield        #253 <Field zza zzsa>
	//   53  102:invokestatic    #45  <Method Object zzac.zzw(Object)>
	//   54  105:pop             
		zzac.zzw(((Object) (zzsb)));
	//   55  106:aload_0         
	//   56  107:getfield        #263 <Field zzcq zzsb>
	//   57  110:invokestatic    #45  <Method Object zzac.zzw(Object)>
	//   58  113:pop             
		exception = ((Exception) (new Info(zzsb.getId(), zzsb.zzf(true))));
	//   59  114:new             #8   <Class AdvertisingIdClient$Info>
	//   60  117:dup             
	//   61  118:aload_0         
	//   62  119:getfield        #263 <Field zzcq zzsb>
	//   63  122:invokeinterface #281 <Method String zzcq.getId()>
	//   64  127:aload_0         
	//   65  128:getfield        #263 <Field zzcq zzsb>
	//   66  131:iconst_1        
	//   67  132:invokeinterface #284 <Method boolean zzcq.zzf(boolean)>
	//   68  137:invokespecial   #287 <Method void AdvertisingIdClient$Info(String, boolean)>
	//   69  140:astore_1        
		  goto _L4
	//*  70  141:goto            166
		exception;
	//   71  144:astore_1        
		Log.i("AdvertisingIdClient", "GMS remote exception ", ((Throwable) (exception)));
	//   72  145:ldc1            #99  <String "AdvertisingIdClient">
	//   73  147:ldc2            #289 <String "GMS remote exception ">
	//   74  150:aload_1         
	//   75  151:invokestatic    #261 <Method int Log.i(String, String, Throwable)>
	//   76  154:pop             
		throw new IOException("Remote exception");
	//   77  155:new             #61  <Class IOException>
	//   78  158:dup             
	//   79  159:ldc2            #291 <String "Remote exception">
	//   80  162:invokespecial   #152 <Method void IOException(String)>
	//   81  165:athrow          
_L4:
		this;
	//   82  166:aload_0         
		JVM INSTR monitorexit ;
	//   83  167:monitorexit     
		  goto _L5
	//*  84  168:goto            176
		exception;
	//   85  171:astore_1        
	//*  86  172:aload_0         
		throw exception;
	//   87  173:monitorexit     
	//   88  174:aload_1         
	//   89  175:athrow          
_L5:
		zzbw();
	//   90  176:aload_0         
	//   91  177:invokespecial   #293 <Method void zzbw()>
		return ((Info) (exception));
	//   92  180:aload_1         
	//   93  181:areturn         
	}

	public void start()
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		zze(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #113 <Method void zze(boolean)>
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
	//*   5   10:ifeq            21
			s = "1";
	//    6   13:ldc2            #298 <String "1">
	//    7   16:astore          4
		else
	//*   8   18:goto            26
			s = "0";
	//    9   21:ldc2            #300 <String "0">
	//   10   24:astore          4
		bundle.putString("app_context", s);
	//   11   26:aload           5
	//   12   28:ldc2            #302 <String "app_context">
	//   13   31:aload           4
	//   14   33:invokevirtual   #306 <Method void Bundle.putString(String, String)>
		if(info != null)
	//*  15   36:aload_1         
	//*  16   37:ifnull          70
		{
			String s1;
			if(info.isLimitAdTrackingEnabled())
	//*  17   40:aload_1         
	//*  18   41:invokevirtual   #309 <Method boolean AdvertisingIdClient$Info.isLimitAdTrackingEnabled()>
	//*  19   44:ifeq            55
				s1 = "1";
	//   20   47:ldc2            #298 <String "1">
	//   21   50:astore          4
			else
	//*  22   52:goto            60
				s1 = "0";
	//   23   55:ldc2            #300 <String "0">
	//   24   58:astore          4
			bundle.putString("limit_ad_tracking", s1);
	//   25   60:aload           5
	//   26   62:ldc2            #311 <String "limit_ad_tracking">
	//   27   65:aload           4
	//   28   67:invokevirtual   #306 <Method void Bundle.putString(String, String)>
		}
		if(info != null && info.getId() != null)
	//*  29   70:aload_1         
	//*  30   71:ifnull          99
	//*  31   74:aload_1         
	//*  32   75:invokevirtual   #312 <Method String AdvertisingIdClient$Info.getId()>
	//*  33   78:ifnull          99
			bundle.putString("ad_id_size", Integer.toString(info.getId().length()));
	//   34   81:aload           5
	//   35   83:ldc2            #314 <String "ad_id_size">
	//   36   86:aload_1         
	//   37   87:invokevirtual   #312 <Method String AdvertisingIdClient$Info.getId()>
	//   38   90:invokevirtual   #320 <Method int String.length()>
	//   39   93:invokestatic    #325 <Method String Integer.toString(int)>
	//   40   96:invokevirtual   #306 <Method void Bundle.putString(String, String)>
		if(throwable != null)
	//*  41   99:aload_3         
	//*  42  100:ifnull          118
			bundle.putString("error", ((Object) (throwable)).getClass().getName());
	//   43  103:aload           5
	//   44  105:ldc2            #327 <String "error">
	//   45  108:aload_3         
	//   46  109:invokevirtual   #331 <Method Class Object.getClass()>
	//   47  112:invokevirtual   #336 <Method String Class.getName()>
	//   48  115:invokevirtual   #306 <Method void Bundle.putString(String, String)>
		info = ((Info) (Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon()));
	//   49  118:ldc2            #338 <String "https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps">
	//   50  121:invokestatic    #342 <Method Uri Uri.parse(String)>
	//   51  124:invokevirtual   #346 <Method android.net.Uri$Builder Uri.buildUpon()>
	//   52  127:astore_1        
		String s2;
		for(throwable = ((Throwable) (bundle.keySet().iterator())); ((Iterator) (throwable)).hasNext(); ((android.net.Uri.Builder) (info)).appendQueryParameter(s2, bundle.getString(s2)))
	//*  53  128:aload           5
	//*  54  130:invokevirtual   #350 <Method Set Bundle.keySet()>
	//*  55  133:invokeinterface #356 <Method Iterator Set.iterator()>
	//*  56  138:astore_3        
	//*  57  139:aload_3         
	//*  58  140:invokeinterface #361 <Method boolean Iterator.hasNext()>
	//*  59  145:ifeq            176
			s2 = (String)((Iterator) (throwable)).next();
	//   60  148:aload_3         
	//   61  149:invokeinterface #365 <Method Object Iterator.next()>
	//   62  154:checkcast       #316 <Class String>
	//   63  157:astore          4

	//   64  159:aload_1         
	//   65  160:aload           4
	//   66  162:aload           5
	//   67  164:aload           4
	//   68  166:invokevirtual   #369 <Method String Bundle.getString(String)>
	//   69  169:invokevirtual   #375 <Method android.net.Uri$Builder android.net.Uri$Builder.appendQueryParameter(String, String)>
	//   70  172:pop             
	//*  71  173:goto            139
		return ((android.net.Uri.Builder) (info)).build();
	//   72  176:aload_1         
	//   73  177:invokevirtual   #379 <Method Uri android.net.Uri$Builder.build()>
	//   74  180:areturn         
	}

	protected void zze(boolean flag)
		throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException
	{
		zzac.zzdk("Calling this from your main thread can lead to deadlock");
	//    0    0:ldc1            #248 <String "Calling this from your main thread can lead to deadlock">
	//    1    2:invokestatic    #251 <Method void zzac.zzdk(String)>
		this;
	//    2    5:aload_0         
		JVM INSTR monitorenter ;
	//    3    6:monitorenter    
		if(zzsc)
	//*   4    7:aload_0         
	//*   5    8:getfield        #55  <Field boolean zzsc>
	//*   6   11:ifeq            18
			finish();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #123 <Method void finish()>
		zzsa = zzf(mContext);
	//    9   18:aload_0         
	//   10   19:aload_0         
	//   11   20:getfield        #53  <Field Context mContext>
	//   12   23:invokestatic    #381 <Method zza zzf(Context)>
	//   13   26:putfield        #253 <Field zza zzsa>
		zzsb = zza(mContext, zzsa);
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:getfield        #53  <Field Context mContext>
	//   17   34:aload_0         
	//   18   35:getfield        #253 <Field zza zzsa>
	//   19   38:invokestatic    #383 <Method zzcq zza(Context, zza)>
	//   20   41:putfield        #263 <Field zzcq zzsb>
		zzsc = true;
	//   21   44:aload_0         
	//   22   45:iconst_1        
	//   23   46:putfield        #55  <Field boolean zzsc>
		if(!flag)
			break MISSING_BLOCK_LABEL_57;
	//   24   49:iload_1         
	//   25   50:ifeq            57
		zzbw();
	//   26   53:aload_0         
	//   27   54:invokespecial   #293 <Method void zzbw()>
		this;
	//   28   57:aload_0         
		JVM INSTR monitorexit ;
	//   29   58:monitorexit     
		return;
	//   30   59:return          
		Exception exception;
		exception;
	//   31   60:astore_2        
	//*  32   61:aload_0         
		throw exception;
	//   33   62:monitorexit     
	//   34   63:aload_2         
	//   35   64:athrow          
	}

	private final Context mContext;
	com.google.android.gms.common.zza zzsa;
	zzcq zzsb;
	boolean zzsc;
	Object zzsd;
	zza zzse;
	final long zzsf;
}
