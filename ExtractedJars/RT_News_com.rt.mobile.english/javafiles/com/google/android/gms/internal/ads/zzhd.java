// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.*;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzhe, zzhg, zzhh, zzhk, 
//			zzamg, zznk, zzkb, zzni, 
//			zzhf, zzgg, zzhi, zzho, 
//			zzakb, zzakk, zzhl

public final class zzhd
{

	public zzhd()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class zzhe>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #27  <Method void zzhe(zzhd)>
	//    7   13:putfield        #29  <Field Runnable zzajq>
	//    8   16:aload_0         
	//    9   17:new             #4   <Class Object>
	//   10   20:dup             
	//   11   21:invokespecial   #22  <Method void Object()>
	//   12   24:putfield        #31  <Field Object mLock>
	//   13   27:return          
	}

	private final void connect()
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object mLock>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(mContext == null || zzajr != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #35  <Field Context mContext>
	//*   7   11:ifnull          75
	//*   8   14:aload_0         
	//*   9   15:getfield        #37  <Field zzhk zzajr>
	//*  10   18:ifnull          24
			break MISSING_BLOCK_LABEL_75;
	//   11   21:goto            75
		zzhg zzhg1 = new zzhg(this);
	//   12   24:new             #39  <Class zzhg>
	//   13   27:dup             
	//   14   28:aload_0         
	//   15   29:invokespecial   #40  <Method void zzhg(zzhd)>
	//   16   32:astore_2        
		zzhh zzhh1 = new zzhh(this);
	//   17   33:new             #42  <Class zzhh>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:invokespecial   #43  <Method void zzhh(zzhd)>
	//   21   41:astore_3        
		zzajr = new zzhk(mContext, zzbv.zzez().zzsa(), ((com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks) (zzhg1)), ((com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener) (zzhh1)));
	//   22   42:aload_0         
	//   23   43:new             #45  <Class zzhk>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:getfield        #35  <Field Context mContext>
	//   27   51:invokestatic    #51  <Method zzamg zzbv.zzez()>
	//   28   54:invokevirtual   #57  <Method android.os.Looper zzamg.zzsa()>
	//   29   57:aload_2         
	//   30   58:aload_3         
	//   31   59:invokespecial   #60  <Method void zzhk(Context, android.os.Looper, com.google.android.gms.common.internal.BaseGmsClient$BaseConnectionCallbacks, com.google.android.gms.common.internal.BaseGmsClient$BaseOnConnectionFailedListener)>
	//   32   62:putfield        #37  <Field zzhk zzajr>
		zzajr.checkAvailabilityAndConnect();
	//   33   65:aload_0         
	//   34   66:getfield        #37  <Field zzhk zzajr>
	//   35   69:invokevirtual   #63  <Method void zzhk.checkAvailabilityAndConnect()>
		obj;
	//   36   72:aload_1         
		JVM INSTR monitorexit ;
	//   37   73:monitorexit     
		return;
	//   38   74:return          
		obj;
	//   39   75:aload_1         
		JVM INSTR monitorexit ;
	//   40   76:monitorexit     
		return;
	//   41   77:return          
		Exception exception;
		exception;
	//   42   78:astore_2        
		obj;
	//   43   79:aload_1         
		JVM INSTR monitorexit ;
	//   44   80:monitorexit     
		throw exception;
	//   45   81:aload_2         
	//   46   82:athrow          
	}

	private final void disconnect()
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
			{
				if(zzajr != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field zzhk zzajr>
	//    7   11:ifnonnull       17
			}
	//    8   14:aload_1         
	//    9   15:monitorexit     
			return;
	//   10   16:return          
		}
		if(zzajr.isConnected() || zzajr.isConnecting())
	//*  11   17:aload_0         
	//*  12   18:getfield        #37  <Field zzhk zzajr>
	//*  13   21:invokevirtual   #68  <Method boolean zzhk.isConnected()>
	//*  14   24:ifne            37
	//*  15   27:aload_0         
	//*  16   28:getfield        #37  <Field zzhk zzajr>
	//*  17   31:invokevirtual   #71  <Method boolean zzhk.isConnecting()>
	//*  18   34:ifeq            44
			zzajr.disconnect();
	//   19   37:aload_0         
	//   20   38:getfield        #37  <Field zzhk zzajr>
	//   21   41:invokevirtual   #73  <Method void zzhk.disconnect()>
		zzajr = null;
	//   22   44:aload_0         
	//   23   45:aconst_null     
	//   24   46:putfield        #37  <Field zzhk zzajr>
		zzajs = null;
	//   25   49:aload_0         
	//   26   50:aconst_null     
	//   27   51:putfield        #75  <Field zzho zzajs>
		Binder.flushPendingCommands();
	//   28   54:invokestatic    #80  <Method void Binder.flushPendingCommands()>
		obj;
	//   29   57:aload_1         
		JVM INSTR monitorexit ;
	//   30   58:monitorexit     
		return;
	//   31   59:return          
		exception;
	//   32   60:astore_2        
		obj;
	//   33   61:aload_1         
		JVM INSTR monitorexit ;
	//   34   62:monitorexit     
		throw exception;
	//   35   63:aload_2         
	//   36   64:athrow          
	}

	static zzhk zza(zzhd zzhd1, zzhk zzhk1)
	{
		zzhd1.zzajr = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #37  <Field zzhk zzajr>
		return null;
	//    3    5:aconst_null     
	//    4    6:areturn         
	}

	static zzho zza(zzhd zzhd1, zzho zzho1)
	{
		zzhd1.zzajs = zzho1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field zzho zzajs>
		return zzho1;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

	static void zza(zzhd zzhd1)
	{
		zzhd1.disconnect();
	//    0    0:aload_0         
	//    1    1:invokespecial   #84  <Method void disconnect()>
	//    2    4:return          
	}

	static void zzb(zzhd zzhd1)
	{
		zzhd1.connect();
	//    0    0:aload_0         
	//    1    1:invokespecial   #87  <Method void connect()>
	//    2    4:return          
	}

	static Object zzc(zzhd zzhd1)
	{
		return zzhd1.mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field Object mLock>
	//    2    4:areturn         
	}

	static zzhk zzd(zzhd zzhd1)
	{
		return zzhd1.zzajr;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field zzhk zzajr>
	//    2    4:areturn         
	}

	public final void initialize(Context context)
	{
label0:
		{
			if(context == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
				return;
	//    2    4:return          
			synchronized(mLock)
	//*   3    5:aload_0         
	//*   4    6:getfield        #31  <Field Object mLock>
	//*   5    9:astore_2        
	//*   6   10:aload_2         
	//*   7   11:monitorenter    
			{
				if(mContext == null)
					break label0;
	//    8   12:aload_0         
	//    9   13:getfield        #35  <Field Context mContext>
	//   10   16:ifnull          22
			}
	//   11   19:aload_2         
	//   12   20:monitorexit     
			return;
	//   13   21:return          
		}
		mContext = context.getApplicationContext();
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokevirtual   #99  <Method Context Context.getApplicationContext()>
	//   17   27:putfield        #35  <Field Context mContext>
		context = ((Context) (zznk.zzbdo));
	//   18   30:getstatic       #105 <Field zzna zznk.zzbdo>
	//   19   33:astore_1        
		if(((Boolean)zzkb.zzik().zzd(((zzna) (context)))).booleanValue())
	//*  20   34:invokestatic    #111 <Method zzni zzkb.zzik()>
	//*  21   37:aload_1         
	//*  22   38:invokevirtual   #116 <Method Object zzni.zzd(zzna)>
	//*  23   41:checkcast       #118 <Class Boolean>
	//*  24   44:invokevirtual   #121 <Method boolean Boolean.booleanValue()>
	//*  25   47:ifeq            57
		{
			connect();
	//   26   50:aload_0         
	//   27   51:invokespecial   #87  <Method void connect()>
			break MISSING_BLOCK_LABEL_93;
	//   28   54:goto            93
		}
		context = ((Context) (zznk.zzbdn));
	//   29   57:getstatic       #124 <Field zzna zznk.zzbdn>
	//   30   60:astore_1        
		if(((Boolean)zzkb.zzik().zzd(((zzna) (context)))).booleanValue())
	//*  31   61:invokestatic    #111 <Method zzni zzkb.zzik()>
	//*  32   64:aload_1         
	//*  33   65:invokevirtual   #116 <Method Object zzni.zzd(zzna)>
	//*  34   68:checkcast       #118 <Class Boolean>
	//*  35   71:invokevirtual   #121 <Method boolean Boolean.booleanValue()>
	//*  36   74:ifeq            93
		{
			context = ((Context) (new zzhf(this)));
	//   37   77:new             #126 <Class zzhf>
	//   38   80:dup             
	//   39   81:aload_0         
	//   40   82:invokespecial   #127 <Method void zzhf(zzhd)>
	//   41   85:astore_1        
			zzbv.zzen().zza(((zzgj) (context)));
	//   42   86:invokestatic    #131 <Method zzgg zzbv.zzen()>
	//   43   89:aload_1         
	//   44   90:invokevirtual   #136 <Method void zzgg.zza(zzgj)>
		}
		obj;
	//   45   93:aload_2         
		JVM INSTR monitorexit ;
	//   46   94:monitorexit     
		return;
	//   47   95:return          
		context;
	//   48   96:astore_1        
		obj;
	//   49   97:aload_2         
		JVM INSTR monitorexit ;
	//   50   98:monitorexit     
		throw context;
	//   51   99:aload_1         
	//   52  100:athrow          
	}

	public final zzhi zza(zzhl zzhl)
	{
label0:
		{
			synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
			{
				if(zzajs != null)
					break label0;
	//    5    7:aload_0         
	//    6    8:getfield        #75  <Field zzho zzajs>
	//    7   11:ifnonnull       26
				zzhl = ((zzhl) (new zzhi()));
	//    8   14:new             #141 <Class zzhi>
	//    9   17:dup             
	//   10   18:invokespecial   #142 <Method void zzhi()>
	//   11   21:astore_1        
			}
	//   12   22:aload_2         
	//   13   23:monitorexit     
			return ((zzhi) (zzhl));
	//   14   24:aload_1         
	//   15   25:areturn         
		}
		zzhl = ((zzhl) (zzajs.zza(zzhl)));
	//   16   26:aload_0         
	//   17   27:getfield        #75  <Field zzho zzajs>
	//   18   30:aload_1         
	//   19   31:invokeinterface #146 <Method zzhi zzho.zza(zzhl)>
	//   20   36:astore_1        
		obj;
	//   21   37:aload_2         
		JVM INSTR monitorexit ;
	//   22   38:monitorexit     
		return ((zzhi) (zzhl));
	//   23   39:aload_1         
	//   24   40:areturn         
		zzhl;
	//   25   41:astore_1        
		zzakb.zzb("Unable to call into cache service.", ((Throwable) (zzhl)));
	//   26   42:ldc1            #148 <String "Unable to call into cache service.">
	//   27   44:aload_1         
	//   28   45:invokestatic    #153 <Method void zzakb.zzb(String, Throwable)>
		zzhl = ((zzhl) (new zzhi()));
	//   29   48:new             #141 <Class zzhi>
	//   30   51:dup             
	//   31   52:invokespecial   #142 <Method void zzhi()>
	//   32   55:astore_1        
		obj;
	//   33   56:aload_2         
		JVM INSTR monitorexit ;
	//   34   57:monitorexit     
		return ((zzhi) (zzhl));
	//   35   58:aload_1         
	//   36   59:areturn         
		zzhl;
	//   37   60:astore_1        
		obj;
	//   38   61:aload_2         
		JVM INSTR monitorexit ;
	//   39   62:monitorexit     
		throw zzhl;
	//   40   63:aload_1         
	//   41   64:athrow          
	}

	public final void zzhh()
	{
		zzna zzna = zznk.zzbdp;
	//    0    0:getstatic       #157 <Field zzna zznk.zzbdp>
	//    1    3:astore_1        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #111 <Method zzni zzkb.zzik()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #116 <Method Object zzni.zzd(zzna)>
	//*   5   11:checkcast       #118 <Class Boolean>
	//*   6   14:invokevirtual   #121 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            91
		{
			synchronized(mLock)
	//*   8   20:aload_0         
	//*   9   21:getfield        #31  <Field Object mLock>
	//*  10   24:astore_1        
	//*  11   25:aload_1         
	//*  12   26:monitorenter    
			{
				connect();
	//   13   27:aload_0         
	//   14   28:invokespecial   #87  <Method void connect()>
				zzbv.zzek();
	//   15   31:invokestatic    #161 <Method zzakk zzbv.zzek()>
	//   16   34:pop             
				zzakk.zzcrm.removeCallbacks(zzajq);
	//   17   35:getstatic       #167 <Field Handler zzakk.zzcrm>
	//   18   38:aload_0         
	//   19   39:getfield        #29  <Field Runnable zzajq>
	//   20   42:invokevirtual   #173 <Method void Handler.removeCallbacks(Runnable)>
				zzbv.zzek();
	//   21   45:invokestatic    #161 <Method zzakk zzbv.zzek()>
	//   22   48:pop             
				Handler handler = zzakk.zzcrm;
	//   23   49:getstatic       #167 <Field Handler zzakk.zzcrm>
	//   24   52:astore_2        
				Runnable runnable = zzajq;
	//   25   53:aload_0         
	//   26   54:getfield        #29  <Field Runnable zzajq>
	//   27   57:astore_3        
				zzna zzna1 = zznk.zzbdq;
	//   28   58:getstatic       #176 <Field zzna zznk.zzbdq>
	//   29   61:astore          4
				handler.postDelayed(runnable, ((Long)zzkb.zzik().zzd(zzna1)).longValue());
	//   30   63:aload_2         
	//   31   64:aload_3         
	//   32   65:invokestatic    #111 <Method zzni zzkb.zzik()>
	//   33   68:aload           4
	//   34   70:invokevirtual   #116 <Method Object zzni.zzd(zzna)>
	//   35   73:checkcast       #178 <Class Long>
	//   36   76:invokevirtual   #182 <Method long Long.longValue()>
	//   37   79:invokevirtual   #186 <Method boolean Handler.postDelayed(Runnable, long)>
	//   38   82:pop             
			}
	//   39   83:aload_1         
	//   40   84:monitorexit     
			return;
	//   41   85:return          
		} else
	//*  42   86:astore_2        
	//*  43   87:aload_1         
	//*  44   88:monitorexit     
	//*  45   89:aload_2         
	//*  46   90:athrow          
		{
			return;
	//   47   91:return          
		}
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	}

	private Context mContext;
	private final Object mLock = new Object();
	private final Runnable zzajq = new zzhe(this);
	private zzhk zzajr;
	private zzho zzajs;
}
