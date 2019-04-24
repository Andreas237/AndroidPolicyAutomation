// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzadx, zzalc, zzaei, zzaen, 
//			zzakb, zzajm, zzaej, zzaea, 
//			zzaeb, zzaol, zzaef

public abstract class zzadz
	implements zzadx, zzalc
{

	public zzadz(zzaol zzaol1, zzadx zzadx1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #5   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #22  <Method void Object()>
	//    6   12:putfield        #24  <Field Object mLock>
		zzccp = zzaol1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #26  <Field zzaol zzccp>
		zzccq = zzadx1;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #28  <Field zzadx zzccq>
	//   13   25:return          
	}

	public final void cancel()
	{
		zznz();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #35  <Method void zznz()>
	//    2    4:return          
	}

	public final void zza(zzaej zzaej1)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field Object mLock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzccq.zza(zzaej1);
	//    5    7:aload_0         
	//    6    8:getfield        #28  <Field zzadx zzccq>
	//    7   11:aload_1         
	//    8   12:invokeinterface #39  <Method void zzadx.zza(zzaej)>
			zznz();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #35  <Method void zznz()>
		}
	//   11   21:aload_2         
	//   12   22:monitorexit     
		return;
	//   13   23:return          
		zzaej1;
	//   14   24:astore_1        
		obj;
	//   15   25:aload_2         
		JVM INSTR monitorexit ;
	//   16   26:monitorexit     
		throw zzaej1;
	//   17   27:aload_1         
	//   18   28:athrow          
	}

	final boolean zza(zzaen zzaen1, zzaef zzaef)
	{
		try
		{
			zzaen1.zza(zzaef, ((zzaeq) (new zzaei(((zzadx) (this))))));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:new             #45  <Class zzaei>
	//    3    5:dup             
	//    4    6:aload_0         
	//    5    7:invokespecial   #48  <Method void zzaei(zzadx)>
	//    6   10:invokeinterface #53  <Method void zzaen.zza(zzaef, zzaeq)>
		}
	//*   7   15:iconst_1        
	//*   8   16:ireturn         
		// Misplaced declaration of an exception variable
		catch(zzaen zzaen1)
	//*   9   17:astore_1        
		{
			zzakb.zzc("Could not fetch ad response from ad request service due to an Exception.", ((Throwable) (zzaen1)));
	//   10   18:ldc1            #55  <String "Could not fetch ad response from ad request service due to an Exception.">
	//   11   20:aload_1         
	//   12   21:invokestatic    #61  <Method void zzakb.zzc(String, Throwable)>
			zzbv.zzeo().zza(((Throwable) (zzaen1)), "AdRequestClientTask.getAdResponseFromService");
	//   13   24:invokestatic    #67  <Method zzajm zzbv.zzeo()>
	//   14   27:aload_1         
	//   15   28:ldc1            #69  <String "AdRequestClientTask.getAdResponseFromService">
	//   16   30:invokevirtual   #74  <Method void zzajm.zza(Throwable, String)>
			zzccq.zza(new zzaej(0));
	//   17   33:aload_0         
	//   18   34:getfield        #28  <Field zzadx zzccq>
	//   19   37:new             #76  <Class zzaej>
	//   20   40:dup             
	//   21   41:iconst_0        
	//   22   42:invokespecial   #79  <Method void zzaej(int)>
	//   23   45:invokeinterface #39  <Method void zzadx.zza(zzaej)>
			return false;
	//   24   50:iconst_0        
	//   25   51:ireturn         
		}
		return true;
	}

	public final Object zznt()
	{
		zzaen zzaen1 = zzoa();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #86  <Method zzaen zzoa()>
	//    2    4:astore_1        
		if(zzaen1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       32
		{
			zzccq.zza(new zzaej(0));
	//    5    9:aload_0         
	//    6   10:getfield        #28  <Field zzadx zzccq>
	//    7   13:new             #76  <Class zzaej>
	//    8   16:dup             
	//    9   17:iconst_0        
	//   10   18:invokespecial   #79  <Method void zzaej(int)>
	//   11   21:invokeinterface #39  <Method void zzadx.zza(zzaej)>
			zznz();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #35  <Method void zznz()>
			return ((Object) (null));
	//   14   30:aconst_null     
	//   15   31:areturn         
		} else
		{
			zzccp.zza(((zzaoo) (new zzaea(this, zzaen1))), ((zzaom) (new zzaeb(this))));
	//   16   32:aload_0         
	//   17   33:getfield        #26  <Field zzaol zzccp>
	//   18   36:new             #88  <Class zzaea>
	//   19   39:dup             
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:invokespecial   #91  <Method void zzaea(zzadz, zzaen)>
	//   23   45:new             #93  <Class zzaeb>
	//   24   48:dup             
	//   25   49:aload_0         
	//   26   50:invokespecial   #96  <Method void zzaeb(zzadz)>
	//   27   53:invokeinterface #101 <Method void zzaol.zza(zzaoo, zzaom)>
			return ((Object) (null));
	//   28   58:aconst_null     
	//   29   59:areturn         
		}
	}

	public abstract void zznz();

	public abstract zzaen zzoa();

	private final Object mLock = new Object();
	private final zzaol zzccp;
	private final zzadx zzccq;
}
