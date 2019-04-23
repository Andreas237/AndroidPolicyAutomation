// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;


// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzub, zzuv, zzte, zzvv

public class zzvc
{

	public zzvc()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
	//    2    4:return          
	}

	private final zzvv zzh(zzvv zzvv1)
	{
		if(zzbzv != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzvv zzbzv>
	//    2    4:ifnonnull       58
_L1:
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(zzbzv == null) goto _L4; else goto _L3
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field zzvv zzbzv>
	//    7   13:ifnull          21
_L3:
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		  goto _L2
	//*  10   18:goto            58
_L4:
		zzbzv = zzvv1;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #31  <Field zzvv zzbzv>
		zzbzw = zzte.zzbtq;
	//   14   26:aload_0         
	//   15   27:getstatic       #36  <Field zzte zzte.zzbtq>
	//   16   30:putfield        #38  <Field zzte zzbzw>
		  goto _L5
	//*  17   33:goto            48
_L7:
		zzbzv = zzvv1;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #31  <Field zzvv zzbzv>
		zzbzw = zzte.zzbtq;
	//   21   41:aload_0         
	//   22   42:getstatic       #36  <Field zzte zzte.zzbtq>
	//   23   45:putfield        #38  <Field zzte zzbzw>
_L5:
		this;
	//   24   48:aload_0         
		JVM INSTR monitorexit ;
	//   25   49:monitorexit     
		  goto _L2
	//*  26   50:goto            58
		zzvv1;
	//   27   53:astore_1        
		this;
	//   28   54:aload_0         
		JVM INSTR monitorexit ;
	//   29   55:monitorexit     
		throw zzvv1;
	//   30   56:aload_1         
	//   31   57:athrow          
_L2:
		return zzbzv;
	//   32   58:aload_0         
	//   33   59:getfield        #31  <Field zzvv zzbzv>
	//   34   62:areturn         
		zzuv zzuv1;
		zzuv1;
	//   35   63:astore_2        
		if(true) goto _L7; else goto _L6
_L6:
	//*  36   64:goto            36
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
		if(!(obj instanceof zzvc))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class zzvc>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((zzvc)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class zzvc>
	//   12   20:astore_1        
		zzvv zzvv1 = zzbzv;
	//   13   21:aload_0         
	//   14   22:getfield        #31  <Field zzvv zzbzv>
	//   15   25:astore_2        
		zzvv zzvv2 = ((zzvc) (obj)).zzbzv;
	//   16   26:aload_1         
	//   17   27:getfield        #31  <Field zzvv zzbzv>
	//   18   30:astore_3        
		if(zzvv1 == null && zzvv2 == null)
	//*  19   31:aload_2         
	//*  20   32:ifnonnull       51
	//*  21   35:aload_3         
	//*  22   36:ifnonnull       51
			return zztw().equals(((Object) (((zzvc) (obj)).zztw())));
	//   23   39:aload_0         
	//   24   40:invokevirtual   #44  <Method zzte zztw()>
	//   25   43:aload_1         
	//   26   44:invokevirtual   #44  <Method zzte zztw()>
	//   27   47:invokevirtual   #46  <Method boolean zzte.equals(Object)>
	//   28   50:ireturn         
		if(zzvv1 != null && zzvv2 != null)
	//*  29   51:aload_2         
	//*  30   52:ifnull          65
	//*  31   55:aload_3         
	//*  32   56:ifnull          65
			return ((Object) (zzvv1)).equals(((Object) (zzvv2)));
	//   33   59:aload_2         
	//   34   60:aload_3         
	//   35   61:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   36   64:ireturn         
		if(zzvv1 != null)
	//*  37   65:aload_2         
	//*  38   66:ifnull          84
			return ((Object) (zzvv1)).equals(((Object) (((zzvc) (obj)).zzh(zzvv1.zzwj()))));
	//   39   69:aload_2         
	//   40   70:aload_1         
	//   41   71:aload_2         
	//   42   72:invokeinterface #53  <Method zzvv zzvv.zzwj()>
	//   43   77:invokespecial   #55  <Method zzvv zzh(zzvv)>
	//   44   80:invokevirtual   #47  <Method boolean Object.equals(Object)>
	//   45   83:ireturn         
		else
			return ((Object) (zzh(zzvv2.zzwj()))).equals(((Object) (zzvv2)));
	//   46   84:aload_0         
	//   47   85:aload_3         
	//   48   86:invokeinterface #53  <Method zzvv zzvv.zzwj()>
	//   49   91:invokespecial   #55  <Method zzvv zzh(zzvv)>
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

	public final zzvv zzi(zzvv zzvv1)
	{
		zzvv zzvv2 = zzbzv;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field zzvv zzbzv>
	//    2    4:astore_2        
		zzbzu = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #60  <Field zzte zzbzu>
		zzbzw = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #38  <Field zzte zzbzw>
		zzbzv = zzvv1;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #31  <Field zzvv zzbzv>
		return zzvv2;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	public final zzte zztw()
	{
		if(zzbzw != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field zzte zzbzw>
	//*   2    4:ifnull          12
			return zzbzw;
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field zzte zzbzw>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		zzte zzte1;
		if(zzbzw == null)
			break MISSING_BLOCK_LABEL_30;
	//    8   14:aload_0         
	//    9   15:getfield        #38  <Field zzte zzbzw>
	//   10   18:ifnull          30
		zzte1 = zzbzw;
	//   11   21:aload_0         
	//   12   22:getfield        #38  <Field zzte zzbzw>
	//   13   25:astore_1        
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return zzte1;
	//   16   28:aload_1         
	//   17   29:areturn         
		if(zzbzv == null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #31  <Field zzvv zzbzv>
	//*  20   34:ifnonnull       47
		{
			zzbzw = zzte.zzbtq;
	//   21   37:aload_0         
	//   22   38:getstatic       #36  <Field zzte zzte.zzbtq>
	//   23   41:putfield        #38  <Field zzte zzbzw>
			break MISSING_BLOCK_LABEL_60;
	//   24   44:goto            60
		}
		zzbzw = zzbzv.zztw();
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #31  <Field zzvv zzbzv>
	//   28   52:invokeinterface #61  <Method zzte zzvv.zztw()>
	//   29   57:putfield        #38  <Field zzte zzbzw>
		zzte1 = zzbzw;
	//   30   60:aload_0         
	//   31   61:getfield        #38  <Field zzte zzbzw>
	//   32   64:astore_1        
		this;
	//   33   65:aload_0         
		JVM INSTR monitorexit ;
	//   34   66:monitorexit     
		return zzte1;
	//   35   67:aload_1         
	//   36   68:areturn         
		Exception exception;
		exception;
	//   37   69:astore_1        
		this;
	//   38   70:aload_0         
		JVM INSTR monitorexit ;
	//   39   71:monitorexit     
		throw exception;
	//   40   72:aload_1         
	//   41   73:athrow          
	}

	public final int zzvx()
	{
		if(zzbzw != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field zzte zzbzw>
	//*   2    4:ifnull          15
			return zzbzw.size();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field zzte zzbzw>
	//    5   11:invokevirtual   #65  <Method int zzte.size()>
	//    6   14:ireturn         
		if(zzbzv != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #31  <Field zzvv zzbzv>
	//*   9   19:ifnull          32
			return zzbzv.zzvx();
	//   10   22:aload_0         
	//   11   23:getfield        #31  <Field zzvv zzbzv>
	//   12   26:invokeinterface #67  <Method int zzvv.zzvx()>
	//   13   31:ireturn         
		else
			return 0;
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	private static final zzub zzbtk = zzub.zzvr();
	private zzte zzbzu;
	private volatile zzvv zzbzv;
	private volatile zzte zzbzw;

	static 
	{
	//    0    0:invokestatic    #19  <Method zzub zzub.zzvr()>
	//    1    3:putstatic       #21  <Field zzub zzbtk>
	//*   2    6:return          
	}
}
