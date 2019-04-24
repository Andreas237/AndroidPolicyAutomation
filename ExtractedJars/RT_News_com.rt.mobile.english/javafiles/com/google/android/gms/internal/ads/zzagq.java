// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.*;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaha, zzagr, zzjn, zznk, 
//			zzkb, zzni, zzakb, zzang, 
//			zzxn, zzagx, zzahe, zzahk, 
//			zzkx

public final class zzagq extends zzaha
{

	public zzagq(Context context, zzw zzw, zzxn zzxn, zzang zzang)
	{
		this(context, zzang, new zzagr(context, zzw, zzjn.zzhx(), zzxn, zzang));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload           4
	//    3    4:new             #19  <Class zzagr>
	//    4    7:dup             
	//    5    8:aload_1         
	//    6    9:aload_2         
	//    7   10:invokestatic    #25  <Method zzjn zzjn.zzhx()>
	//    8   13:aload_3         
	//    9   14:aload           4
	//   10   16:invokespecial   #28  <Method void zzagr(Context, zzw, zzjn, zzxn, zzang)>
	//   11   19:invokespecial   #31  <Method void zzagq(Context, zzang, zzagr)>
	//   12   22:return          
	}

	private zzagq(Context context, zzang zzang, zzagr zzagr1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void zzaha()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #38  <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #39  <Method void Object()>
	//    6   12:putfield        #41  <Field Object mLock>
		mContext = context;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #43  <Field Context mContext>
		zzyf = zzang;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #45  <Field zzang zzyf>
		zzcld = zzagr1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #47  <Field zzagr zzcld>
	//   16   30:return          
	}

	public final void destroy()
	{
		zzf(((IObjectWrapper) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #53  <Method void zzf(IObjectWrapper)>
	//    3    5:return          
	}

	public final String getMediationAdapterClassName()
	{
		String s;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			s = ((zzd) (zzcld)).getMediationAdapterClassName();
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:invokevirtual   #59  <Method String zzd.getMediationAdapterClassName()>
	//    8   14:astore_2        
		}
	//    9   15:aload_1         
	//   10   16:monitorexit     
		return s;
	//   11   17:aload_2         
	//   12   18:areturn         
		exception;
	//   13   19:astore_2        
		obj;
	//   14   20:aload_1         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw exception;
	//   16   22:aload_2         
	//   17   23:athrow          
	}

	public final boolean isLoaded()
	{
		boolean flag;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			flag = zzcld.isLoaded();
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:invokevirtual   #63  <Method boolean zzagr.isLoaded()>
	//    8   14:istore_1        
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return flag;
	//   11   17:iload_1         
	//   12   18:ireturn         
		exception;
	//   13   19:astore_3        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw exception;
	//   16   22:aload_3         
	//   17   23:athrow          
	}

	public final void pause()
	{
		zzd(((IObjectWrapper) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #67  <Method void zzd(IObjectWrapper)>
	//    3    5:return          
	}

	public final void resume()
	{
		zze(((IObjectWrapper) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokevirtual   #71  <Method void zze(IObjectWrapper)>
	//    3    5:return          
	}

	public final void setImmersiveMode(boolean flag)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			((zza) (zzcld)).setImmersiveMode(flag);
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:iload_1         
	//    8   12:invokevirtual   #77  <Method void zza.setImmersiveMode(boolean)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		exception;
	//   12   18:astore_3        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw exception;
	//   15   21:aload_3         
	//   16   22:athrow          
	}

	public final void setUserId(String s)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			((zza) (zzcld)).setUserId(s);
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #81  <Method void zza.setUserId(String)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		s;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw s;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final void show()
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzcld.zzoy();
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:invokevirtual   #85  <Method void zzagr.zzoy()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		obj;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public final void zza(zzagx zzagx)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			((zza) (zzcld)).zza(zzagx);
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #89  <Method void zza.zza(zzagx)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		zzagx;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw zzagx;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final void zza(zzahe zzahe)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			((zza) (zzcld)).zza(zzahe);
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #92  <Method void zza.zza(zzahe)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		zzahe;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw zzahe;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final void zza(zzahk zzahk)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzcld.zza(zzahk);
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #95  <Method void com.google.android.gms.internal.ads.zzagr.zza(zzahk)>
		}
	//    9   15:aload_2         
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		zzahk;
	//   12   18:astore_1        
		obj;
	//   13   19:aload_2         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw zzahk;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public final void zza(zzkx zzkx)
	{
		zzna zzna = zznk.zzayf;
	//    0    0:getstatic       #102 <Field zzna zznk.zzayf>
	//    1    3:astore_2        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #108 <Method zzni zzkb.zzik()>
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #113 <Method Object com.google.android.gms.internal.ads.zzni.zzd(zzna)>
	//*   5   11:checkcast       #115 <Class Boolean>
	//*   6   14:invokevirtual   #118 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            43
		{
			synchronized(mLock)
	//*   8   20:aload_0         
	//*   9   21:getfield        #41  <Field Object mLock>
	//*  10   24:astore_2        
	//*  11   25:aload_2         
	//*  12   26:monitorenter    
			{
				((zza) (zzcld)).zza(zzkx);
	//   13   27:aload_0         
	//   14   28:getfield        #47  <Field zzagr zzcld>
	//   15   31:aload_1         
	//   16   32:invokevirtual   #120 <Method void zza.zza(zzkx)>
			}
	//   17   35:aload_2         
	//   18   36:monitorexit     
			return;
	//   19   37:return          
		} else
	//*  20   38:astore_1        
	//*  21   39:aload_2         
	//*  22   40:monitorexit     
	//*  23   41:aload_1         
	//*  24   42:athrow          
		{
			return;
	//   25   43:return          
		}
		zzkx;
		obj;
		JVM INSTR monitorexit ;
		throw zzkx;
	}

	public final Bundle zzba()
	{
		zzna zzna = zznk.zzayf;
	//    0    0:getstatic       #102 <Field zzna zznk.zzayf>
	//    1    3:astore_1        
		if(((Boolean)zzkb.zzik().zzd(zzna)).booleanValue())
	//*   2    4:invokestatic    #108 <Method zzni zzkb.zzik()>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #113 <Method Object com.google.android.gms.internal.ads.zzni.zzd(zzna)>
	//*   5   11:checkcast       #115 <Class Boolean>
	//*   6   14:invokevirtual   #118 <Method boolean Boolean.booleanValue()>
	//*   7   17:ifeq            44
		{
			Bundle bundle;
			synchronized(mLock)
	//*   8   20:aload_0         
	//*   9   21:getfield        #41  <Field Object mLock>
	//*  10   24:astore_1        
	//*  11   25:aload_1         
	//*  12   26:monitorenter    
			{
				bundle = ((zza) (zzcld)).zzba();
	//   13   27:aload_0         
	//   14   28:getfield        #47  <Field zzagr zzcld>
	//   15   31:invokevirtual   #124 <Method Bundle zza.zzba()>
	//   16   34:astore_2        
			}
	//   17   35:aload_1         
	//   18   36:monitorexit     
			return bundle;
	//   19   37:aload_2         
	//   20   38:areturn         
		} else
	//*  21   39:astore_2        
	//*  22   40:aload_1         
	//*  23   41:monitorexit     
	//*  24   42:aload_2         
	//*  25   43:athrow          
		{
			return new Bundle();
	//   26   44:new             #126 <Class Bundle>
	//   27   47:dup             
	//   28   48:invokespecial   #127 <Method void Bundle()>
	//   29   51:areturn         
		}
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	}

	public final void zzd(IObjectWrapper iobjectwrapper)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			((zza) (zzcld)).pause();
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:invokevirtual   #129 <Method void zza.pause()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		iobjectwrapper;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public final void zze(IObjectWrapper iobjectwrapper)
	{
		Object obj = mLock;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field Object mLock>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(iobjectwrapper == null)
	//*   5    7:aload_1         
	//*   6    8:ifnonnull       16
		{
			iobjectwrapper = null;
	//    7   11:aconst_null     
	//    8   12:astore_1        
			break MISSING_BLOCK_LABEL_24;
	//    9   13:goto            24
		}
		iobjectwrapper = ((IObjectWrapper) ((Context)ObjectWrapper.unwrap(iobjectwrapper)));
	//   10   16:aload_1         
	//   11   17:invokestatic    #137 <Method Object ObjectWrapper.unwrap(IObjectWrapper)>
	//   12   20:checkcast       #139 <Class Context>
	//   13   23:astore_1        
		if(iobjectwrapper == null)
			break MISSING_BLOCK_LABEL_50;
	//   14   24:aload_1         
	//   15   25:ifnull          50
		try
		{
			zzcld.onContextChanged(((Context) (iobjectwrapper)));
	//   16   28:aload_0         
	//   17   29:getfield        #47  <Field zzagr zzcld>
	//   18   32:aload_1         
	//   19   33:invokevirtual   #143 <Method void zzagr.onContextChanged(Context)>
			break MISSING_BLOCK_LABEL_50;
	//   20   36:goto            50
		}
	//*  21   39:astore_1        
	//*  22   40:goto            60
		// Misplaced declaration of an exception variable
		catch(IObjectWrapper iobjectwrapper) { }
	//   23   43:astore_1        
		break MISSING_BLOCK_LABEL_44;
		iobjectwrapper;
		break MISSING_BLOCK_LABEL_60;
		zzakb.zzc("Unable to extract updated context.", ((Throwable) (iobjectwrapper)));
	//   24   44:ldc1            #145 <String "Unable to extract updated context.">
	//   25   46:aload_1         
	//   26   47:invokestatic    #151 <Method void zzakb.zzc(String, Throwable)>
		((zza) (zzcld)).resume();
	//   27   50:aload_0         
	//   28   51:getfield        #47  <Field zzagr zzcld>
	//   29   54:invokevirtual   #153 <Method void zza.resume()>
		obj;
	//   30   57:aload_2         
		JVM INSTR monitorexit ;
	//   31   58:monitorexit     
		return;
	//   32   59:return          
		obj;
	//   33   60:aload_2         
		JVM INSTR monitorexit ;
	//   34   61:monitorexit     
		throw iobjectwrapper;
	//   35   62:aload_1         
	//   36   63:athrow          
	}

	public final void zzf(IObjectWrapper iobjectwrapper)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #41  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			((zza) (zzcld)).destroy();
	//    5    7:aload_0         
	//    6    8:getfield        #47  <Field zzagr zzcld>
	//    7   11:invokevirtual   #155 <Method void zza.destroy()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		iobjectwrapper;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	private final Context mContext;
	private final Object mLock;
	private final zzagr zzcld;
	private final zzang zzyf;
}
