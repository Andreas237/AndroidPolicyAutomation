// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			zzbbb, zzbbu, zzbah, zzbcu

public class zzbcb
{

	public zzbcb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private final zzbcu zzk(zzbcu zzbcu1)
	{
		if(zzdvl != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzbcu zzdvl>
	//    2    4:ifnonnull       56
_L1:
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(zzdvl == null) goto _L4; else goto _L3
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field zzbcu zzdvl>
	//    7   13:ifnull          21
_L3:
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		  goto _L2
	//*  10   18:goto            56
_L4:
		zzdvl = zzbcu1;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #31  <Field zzbcu zzdvl>
		zzdvm = zzbah.zzdpq;
	//   14   26:aload_0         
	//   15   27:getstatic       #36  <Field zzbah zzbah.zzdpq>
	//   16   30:putfield        #38  <Field zzbah zzdvm>
		  goto _L3
	//*  17   33:goto            16
_L5:
		zzdvl = zzbcu1;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #31  <Field zzbcu zzdvl>
		zzdvm = zzbah.zzdpq;
	//   21   41:aload_0         
	//   22   42:getstatic       #36  <Field zzbah zzbah.zzdpq>
	//   23   45:putfield        #38  <Field zzbah zzdvm>
		  goto _L3
	//*  24   48:goto            16
		zzbcu1;
	//   25   51:astore_1        
		this;
	//   26   52:aload_0         
		JVM INSTR monitorexit ;
	//   27   53:monitorexit     
		throw zzbcu1;
	//   28   54:aload_1         
	//   29   55:athrow          
_L2:
		return zzdvl;
	//   30   56:aload_0         
	//   31   57:getfield        #31  <Field zzbcu zzdvl>
	//   32   60:areturn         
		zzbbu zzbbu1;
		zzbbu1;
	//   33   61:astore_2        
		  goto _L5
	//*  34   62:goto            36
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof zzbcb))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzbcb>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzbcb)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzbcb>
	//   12   20:astore_1        
		zzbcu zzbcu1 = zzdvl;
	//   13   21:aload_0         
	//   14   22:getfield        #31  <Field zzbcu zzdvl>
	//   15   25:astore_2        
		zzbcu zzbcu2 = ((zzbcb) (obj)).zzdvl;
	//   16   26:aload_1         
	//   17   27:getfield        #31  <Field zzbcu zzdvl>
	//   18   30:astore_3        
		if(zzbcu1 == null && zzbcu2 == null)
	//*  19   31:aload_2         
	//*  20   32:ifnonnull       51
	//*  21   35:aload_3         
	//*  22   36:ifnonnull       51
			return zzaav().equals(((Object) (((zzbcb) (obj)).zzaav())));
	//   23   39:aload_0         
	//   24   40:invokevirtual   #44  <Method zzbah zzaav()>
	//   25   43:aload_1         
	//   26   44:invokevirtual   #44  <Method zzbah zzaav()>
	//   27   47:invokevirtual   #46  <Method boolean zzbah.equals(Object)>
	//   28   50:ireturn         
		if(zzbcu1 != null && zzbcu2 != null)
	//*  29   51:aload_2         
	//*  30   52:ifnull          65
	//*  31   55:aload_3         
	//*  32   56:ifnull          65
			return ((Object) (zzbcu1)).equals(((Object) (zzbcu2)));
	//   33   59:aload_2         
	//   34   60:aload_3         
	//   35   61:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   36   64:ireturn         
		if(zzbcu1 != null)
	//*  37   65:aload_2         
	//*  38   66:ifnull          84
			return ((Object) (zzbcu1)).equals(((Object) (((zzbcb) (obj)).zzk(zzbcu1.zzadg()))));
	//   39   69:aload_2         
	//   40   70:aload_1         
	//   41   71:aload_2         
	//   42   72:invokeinterface #53  <Method zzbcu zzbcu.zzadg()>
	//   43   77:invokespecial   #55  <Method zzbcu zzk(zzbcu)>
	//   44   80:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   45   83:ireturn         
		else
			return ((Object) (zzk(zzbcu2.zzadg()))).equals(((Object) (zzbcu2)));
	//   46   84:aload_0         
	//   47   85:aload_3         
	//   48   86:invokeinterface #53  <Method zzbcu zzbcu.zzadg()>
	//   49   91:invokespecial   #55  <Method zzbcu zzk(zzbcu)>
	//   50   94:aload_3         
	//   51   95:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   52   98:ireturn         
	}

	public int hashCode()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public final zzbah zzaav()
	{
		if(zzdvm != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field zzbah zzdvm>
	//*   2    4:ifnull          12
			return zzdvm;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field zzbah zzdvm>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		zzbah zzbah1;
		if(zzdvm == null)
			break MISSING_BLOCK_LABEL_30;
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field zzbah zzdvm>
	//   10   18:ifnull          30
		zzbah1 = zzdvm;
	//   11   21:aload_0         
	//   12   22:getfield        #38  <Field zzbah zzdvm>
	//   13   25:astore_1        
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return zzbah1;
	//   16   28:aload_1         
	//   17   29:areturn         
		if(zzdvl != null)
			break MISSING_BLOCK_LABEL_49;
	//   18   30:aload_0         
	//   19   31:getfield        #31  <Field zzbcu zzdvl>
	//   20   34:ifnonnull       49
		zzbah1 = zzbah.zzdpq;
	//   21   37:getstatic       #36  <Field zzbah zzbah.zzdpq>
	//   22   40:astore_1        
_L1:
		zzdvm = zzbah1;
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:putfield        #38  <Field zzbah zzdvm>
		break MISSING_BLOCK_LABEL_62;
	//   26   46:goto            62
		zzbah1 = zzdvl.zzaav();
	//   27   49:aload_0         
	//   28   50:getfield        #31  <Field zzbcu zzdvl>
	//   29   53:invokeinterface #58  <Method zzbah zzbcu.zzaav()>
	//   30   58:astore_1        
		  goto _L1
	//*  31   59:goto            41
		zzbah1 = zzdvm;
	//   32   62:aload_0         
	//   33   63:getfield        #38  <Field zzbah zzdvm>
	//   34   66:astore_1        
		this;
	//   35   67:aload_0         
		JVM INSTR monitorexit ;
	//   36   68:monitorexit     
		return zzbah1;
	//   37   69:aload_1         
	//   38   70:areturn         
		Exception exception;
		exception;
	//   39   71:astore_1        
		this;
	//   40   72:aload_0         
		JVM INSTR monitorexit ;
	//   41   73:monitorexit     
		throw exception;
	//   42   74:aload_1         
	//   43   75:athrow          
	}

	public final int zzacw()
	{
		if(zzdvm != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field zzbah zzdvm>
	//*   2    4:ifnull          15
			return zzdvm.size();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field zzbah zzdvm>
	//    5   11:invokevirtual   #62  <Method int zzbah.size()>
	//    6   14:ireturn         
		if(zzdvl != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #31  <Field zzbcu zzdvl>
	//*   9   19:ifnull          32
			return zzdvl.zzacw();
	//   10   22:aload_0         
	//   11   23:getfield        #31  <Field zzbcu zzdvl>
	//   12   26:invokeinterface #64  <Method int zzbcu.zzacw()>
	//   13   31:ireturn         
		else
			return 0;
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public final zzbcu zzl(zzbcu zzbcu1)
	{
		zzbcu zzbcu2 = zzdvl;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzbcu zzdvl>
	//    2    4:astore_2        
		zzdvk = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #67  <Field zzbah zzdvk>
		zzdvm = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #38  <Field zzbah zzdvm>
		zzdvl = zzbcu1;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #31  <Field zzbcu zzdvl>
		return zzbcu2;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	private static final zzbbb zzdph = zzbbb.zzacr();
	private zzbah zzdvk;
	private volatile zzbcu zzdvl;
	private volatile zzbah zzdvm;

	static 
	{
	//    0    0:invokestatic    #19  <Method zzbbb zzbbb.zzacr()>
	//    1    3:putstatic       #21  <Field zzbbb zzdph>
	//*   2    6:return          
	}
}
