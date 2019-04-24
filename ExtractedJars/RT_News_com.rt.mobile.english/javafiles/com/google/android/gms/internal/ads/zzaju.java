// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzajv

public final class zzaju
{

	private zzaju(zzajv zzajv1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mLock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #21  <Method void Object()>
	//    6   12:putfield        #23  <Field Object mLock>
		zzacn = zzajv1;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #25  <Field zzajv zzacn>
		zzcov = s;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #27  <Field String zzcov>
	//   13   25:return          
	}

	public zzaju(String s)
	{
		this(zzbv.zzep(), s);
	//    0    0:aload_0         
	//    1    1:invokestatic    #35  <Method zzajv zzbv.zzep()>
	//    2    4:aload_1         
	//    3    5:invokespecial   #37  <Method void zzaju(zzajv, String)>
	//    4    8:return          
	}

	public final boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          57
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #43  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #43  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((zzaju)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class zzaju>
	//   16   28:astore_1        
			if(zzcov != null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #27  <Field String zzcov>
	//*  19   33:ifnull          48
				return zzcov.equals(((Object) (((zzaju) (obj)).zzcov)));
	//   20   36:aload_0         
	//   21   37:getfield        #27  <Field String zzcov>
	//   22   40:aload_1         
	//   23   41:getfield        #27  <Field String zzcov>
	//   24   44:invokevirtual   #47  <Method boolean String.equals(Object)>
	//   25   47:ireturn         
			if(((zzaju) (obj)).zzcov == null)
	//*  26   48:aload_1         
	//*  27   49:getfield        #27  <Field String zzcov>
	//*  28   52:ifnonnull       57
				return true;
	//   29   55:iconst_1        
	//   30   56:ireturn         
		}
		return false;
	//   31   57:iconst_0        
	//   32   58:ireturn         
	}

	public final int hashCode()
	{
		if(zzcov != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #27  <Field String zzcov>
	//*   2    4:ifnull          15
			return zzcov.hashCode();
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String zzcov>
	//    5   11:invokevirtual   #51  <Method int String.hashCode()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public final Bundle toBundle()
	{
		Bundle bundle;
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Object mLock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			bundle = new Bundle();
	//    5    7:new             #55  <Class Bundle>
	//    6   10:dup             
	//    7   11:invokespecial   #56  <Method void Bundle()>
	//    8   14:astore_2        
			bundle.putInt("pmnli", zzcql);
	//    9   15:aload_2         
	//   10   16:ldc1            #58  <String "pmnli">
	//   11   18:aload_0         
	//   12   19:getfield        #60  <Field int zzcql>
	//   13   22:invokevirtual   #64  <Method void Bundle.putInt(String, int)>
			bundle.putInt("pmnll", zzcqm);
	//   14   25:aload_2         
	//   15   26:ldc1            #66  <String "pmnll">
	//   16   28:aload_0         
	//   17   29:getfield        #68  <Field int zzcqm>
	//   18   32:invokevirtual   #64  <Method void Bundle.putInt(String, int)>
		}
	//   19   35:aload_1         
	//   20   36:monitorexit     
		return bundle;
	//   21   37:aload_2         
	//   22   38:areturn         
		exception;
	//   23   39:astore_2        
		obj;
	//   24   40:aload_1         
		JVM INSTR monitorexit ;
	//   25   41:monitorexit     
		throw exception;
	//   26   42:aload_2         
	//   27   43:athrow          
	}

	public final void zze(int i, int j)
	{
		synchronized(mLock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field Object mLock>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			zzcql = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #60  <Field int zzcql>
			zzcqm = j;
	//    8   12:aload_0         
	//    9   13:iload_2         
	//   10   14:putfield        #68  <Field int zzcqm>
			zzacn.zza(this);
	//   11   17:aload_0         
	//   12   18:getfield        #25  <Field zzajv zzacn>
	//   13   21:aload_0         
	//   14   22:invokevirtual   #76  <Method void zzajv.zza(zzaju)>
		}
	//   15   25:aload_3         
	//   16   26:monitorexit     
		return;
	//   17   27:return          
		exception;
	//   18   28:astore          4
		obj;
	//   19   30:aload_3         
		JVM INSTR monitorexit ;
	//   20   31:monitorexit     
		throw exception;
	//   21   32:aload           4
	//   22   34:athrow          
	}

	public final String zzqm()
	{
		return zzcov;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String zzcov>
	//    2    4:areturn         
	}

	private final Object mLock;
	private final zzajv zzacn;
	private final String zzcov;
	private int zzcql;
	private int zzcqm;
}
