// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzbv;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzft, zzfs, zzaiy

public final class zzaix
	implements zzft
{

	public zzaix(Context context, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		Context context1 = context;
	//    2    4:aload_1         
	//    3    5:astore_3        
		if(context.getApplicationContext() != null)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #26  <Method Context Context.getApplicationContext()>
	//*   6   10:ifnull          18
			context1 = context.getApplicationContext();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #26  <Method Context Context.getApplicationContext()>
	//    9   17:astore_3        
		zzatx = context1;
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:putfield        #28  <Field Context zzatx>
		zzye = s;
	//   13   23:aload_0         
	//   14   24:aload_2         
	//   15   25:putfield        #30  <Field String zzye>
		zzcno = false;
	//   16   28:aload_0         
	//   17   29:iconst_0        
	//   18   30:putfield        #32  <Field boolean zzcno>
	//   19   33:aload_0         
	//   20   34:new             #4   <Class Object>
	//   21   37:dup             
	//   22   38:invokespecial   #20  <Method void Object()>
	//   23   41:putfield        #34  <Field Object mLock>
	//   24   44:return          
	}

	public final void setAdUnitId(String s)
	{
		zzye = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field String zzye>
	//    3    5:return          
	}

	public final void zza(zzfs zzfs1)
	{
		zzx(zzfs1.zztg);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #44  <Field boolean zzfs.zztg>
	//    3    5:invokevirtual   #48  <Method void zzx(boolean)>
	//    4    8:return          
	}

	public final void zzx(boolean flag)
	{
label0:
		{
			if(!zzbv.zzfh().zzs(zzatx))
	//*   0    0:invokestatic    #54  <Method zzaiy zzbv.zzfh()>
	//*   1    3:aload_0         
	//*   2    4:getfield        #28  <Field Context zzatx>
	//*   3    7:invokevirtual   #60  <Method boolean zzaiy.zzs(Context)>
	//*   4   10:ifne            14
				return;
	//    5   13:return          
			synchronized(mLock)
	//*   6   14:aload_0         
	//*   7   15:getfield        #34  <Field Object mLock>
	//*   8   18:astore_2        
	//*   9   19:aload_2         
	//*  10   20:monitorenter    
			{
				if(zzcno != flag)
					break label0;
	//   11   21:aload_0         
	//   12   22:getfield        #32  <Field boolean zzcno>
	//   13   25:iload_1         
	//   14   26:icmpne          32
			}
	//   15   29:aload_2         
	//   16   30:monitorexit     
			return;
	//   17   31:return          
		}
		zzcno = flag;
	//   18   32:aload_0         
	//   19   33:iload_1         
	//   20   34:putfield        #32  <Field boolean zzcno>
		if(!TextUtils.isEmpty(((CharSequence) (zzye))))
			break MISSING_BLOCK_LABEL_50;
	//   21   37:aload_0         
	//   22   38:getfield        #30  <Field String zzye>
	//   23   41:invokestatic    #66  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   24   44:ifeq            50
		obj;
	//   25   47:aload_2         
		JVM INSTR monitorexit ;
	//   26   48:monitorexit     
		return;
	//   27   49:return          
		if(zzcno)
	//*  28   50:aload_0         
	//*  29   51:getfield        #32  <Field boolean zzcno>
	//*  30   54:ifeq            74
		{
			zzbv.zzfh().zzb(zzatx, zzye);
	//   31   57:invokestatic    #54  <Method zzaiy zzbv.zzfh()>
	//   32   60:aload_0         
	//   33   61:getfield        #28  <Field Context zzatx>
	//   34   64:aload_0         
	//   35   65:getfield        #30  <Field String zzye>
	//   36   68:invokevirtual   #69  <Method void zzaiy.zzb(Context, String)>
			break MISSING_BLOCK_LABEL_88;
	//   37   71:goto            88
		}
		zzbv.zzfh().zzc(zzatx, zzye);
	//   38   74:invokestatic    #54  <Method zzaiy zzbv.zzfh()>
	//   39   77:aload_0         
	//   40   78:getfield        #28  <Field Context zzatx>
	//   41   81:aload_0         
	//   42   82:getfield        #30  <Field String zzye>
	//   43   85:invokevirtual   #72  <Method void zzaiy.zzc(Context, String)>
		obj;
	//   44   88:aload_2         
		JVM INSTR monitorexit ;
	//   45   89:monitorexit     
		return;
	//   46   90:return          
		exception;
	//   47   91:astore_3        
		obj;
	//   48   92:aload_2         
		JVM INSTR monitorexit ;
	//   49   93:monitorexit     
		throw exception;
	//   50   94:aload_3         
	//   51   95:athrow          
	}

	private final Object mLock = new Object();
	private final Context zzatx;
	private boolean zzcno;
	private String zzye;
}
