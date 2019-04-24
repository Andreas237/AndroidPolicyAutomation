// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.RemoteException;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzhx, zzen, zzane, zzhy

public final class zzhz
{

	private zzhz(zzhx zzhx1, byte abyte0[])
	{
		zzals = zzhx1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #15  <Field zzhx zzals>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #18  <Method void Object()>
		zzalp = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #20  <Field byte[] zzalp>
	//    8   14:return          
	}

	zzhz(zzhx zzhx1, byte abyte0[], zzhy zzhy)
	{
		this(zzhx1, abyte0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #24  <Method void zzhz(zzhx, byte[])>
	//    4    6:return          
	}

	public final void zzbd()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzals.zzalo)
	//*   2    2:aload_0         
	//*   3    3:getfield        #15  <Field zzhx zzals>
	//*   4    6:getfield        #33  <Field boolean zzhx.zzalo>
	//*   5    9:ifeq            85
		{
			zzals.zzaln.zzc(zzalp);
	//    6   12:aload_0         
	//    7   13:getfield        #15  <Field zzhx zzals>
	//    8   16:getfield        #37  <Field zzen zzhx.zzaln>
	//    9   19:aload_0         
	//   10   20:getfield        #20  <Field byte[] zzalp>
	//   11   23:invokeinterface #43  <Method void zzen.zzc(byte[])>
			zzals.zzaln.zzg(zzalq);
	//   12   28:aload_0         
	//   13   29:getfield        #15  <Field zzhx zzals>
	//   14   32:getfield        #37  <Field zzen zzhx.zzaln>
	//   15   35:aload_0         
	//   16   36:getfield        #45  <Field int zzalq>
	//   17   39:invokeinterface #49  <Method void zzen.zzg(int)>
			zzals.zzaln.zzh(zzalr);
	//   18   44:aload_0         
	//   19   45:getfield        #15  <Field zzhx zzals>
	//   20   48:getfield        #37  <Field zzen zzhx.zzaln>
	//   21   51:aload_0         
	//   22   52:getfield        #51  <Field int zzalr>
	//   23   55:invokeinterface #54  <Method void zzen.zzh(int)>
			zzals.zzaln.zza(((int []) (null)));
	//   24   60:aload_0         
	//   25   61:getfield        #15  <Field zzhx zzals>
	//   26   64:getfield        #37  <Field zzen zzhx.zzaln>
	//   27   67:aconst_null     
	//   28   68:invokeinterface #58  <Method void zzen.zza(int[])>
			zzals.zzaln.zzbd();
	//   29   73:aload_0         
	//   30   74:getfield        #15  <Field zzhx zzals>
	//   31   77:getfield        #37  <Field zzen zzhx.zzaln>
	//   32   80:invokeinterface #60  <Method void zzen.zzbd()>
		}
		this;
	//   33   85:aload_0         
		JVM INSTR monitorexit ;
	//   34   86:monitorexit     
		return;
	//   35   87:return          
		Object obj;
		obj;
	//   36   88:astore_1        
		break MISSING_BLOCK_LABEL_103;
	//   37   89:goto            102
		obj;
	//   38   92:astore_1        
		zzane.zza("Clearcut log failed", ((Throwable) (obj)));
	//   39   93:ldc1            #62  <String "Clearcut log failed">
	//   40   95:aload_1         
	//   41   96:invokestatic    #67  <Method void zzane.zza(String, Throwable)>
		this;
	//   42   99:aload_0         
		JVM INSTR monitorexit ;
	//   43  100:monitorexit     
		return;
	//   44  101:return          
	//*  45  102:aload_0         
		throw obj;
	//   46  103:monitorexit     
	//   47  104:aload_1         
	//   48  105:athrow          
	}

	public final zzhz zzr(int i)
	{
		zzalq = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int zzalq>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public final zzhz zzs(int i)
	{
		zzalr = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #51  <Field int zzalr>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private final byte zzalp[];
	private int zzalq;
	private int zzalr;
	private final zzhx zzals;
}
