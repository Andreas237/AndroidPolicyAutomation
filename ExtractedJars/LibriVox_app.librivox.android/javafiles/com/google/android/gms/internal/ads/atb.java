// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;


// Referenced classes of package com.google.android.gms.internal.ads:
//			ars, asu, aqq, atv

public class atb
{

	public atb()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:return          
	}

	private final atv b(atv atv1)
	{
		if(c != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field atv c>
	//    2    4:ifnonnull       58
_L1:
		this;
	//    3    7:aload_0         
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		if(c == null) goto _L4; else goto _L3
	//    5    9:aload_0         
	//    6   10:getfield        #29  <Field atv c>
	//    7   13:ifnull          21
_L3:
		this;
	//    8   16:aload_0         
		JVM INSTR monitorexit ;
	//    9   17:monitorexit     
		  goto _L2
	//*  10   18:goto            58
_L4:
		c = atv1;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #29  <Field atv c>
		d = aqq.a;
	//   14   26:aload_0         
	//   15   27:getstatic       #33  <Field aqq aqq.a>
	//   16   30:putfield        #35  <Field aqq d>
		  goto _L5
	//*  17   33:goto            48
_L7:
		c = atv1;
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:putfield        #29  <Field atv c>
		d = aqq.a;
	//   21   41:aload_0         
	//   22   42:getstatic       #33  <Field aqq aqq.a>
	//   23   45:putfield        #35  <Field aqq d>
_L5:
		this;
	//   24   48:aload_0         
		JVM INSTR monitorexit ;
	//   25   49:monitorexit     
		  goto _L2
	//*  26   50:goto            58
		atv1;
	//   27   53:astore_1        
		this;
	//   28   54:aload_0         
		JVM INSTR monitorexit ;
	//   29   55:monitorexit     
		throw atv1;
	//   30   56:aload_1         
	//   31   57:athrow          
_L2:
		return c;
	//   32   58:aload_0         
	//   33   59:getfield        #29  <Field atv c>
	//   34   62:areturn         
		asu asu1;
		asu1;
	//   35   63:astore_2        
		if(true) goto _L7; else goto _L6
_L6:
	//*  36   64:goto            36
	}

	public final atv a(atv atv1)
	{
		atv atv2 = c;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field atv c>
	//    2    4:astore_2        
		b = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #37  <Field aqq b>
		d = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #35  <Field aqq d>
		c = atv1;
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:putfield        #29  <Field atv c>
		return atv2;
	//   12   20:aload_2         
	//   13   21:areturn         
	}

	public final int b()
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field aqq d>
	//*   2    4:ifnull          15
			return d.a();
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field aqq d>
	//    5   11:invokevirtual   #40  <Method int aqq.a()>
	//    6   14:ireturn         
		if(c != null)
	//*   7   15:aload_0         
	//*   8   16:getfield        #29  <Field atv c>
	//*   9   19:ifnull          32
			return c.l();
	//   10   22:aload_0         
	//   11   23:getfield        #29  <Field atv c>
	//   12   26:invokeinterface #45  <Method int atv.l()>
	//   13   31:ireturn         
		else
			return 0;
	//   14   32:iconst_0        
	//   15   33:ireturn         
	}

	public final aqq c()
	{
		if(d != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field aqq d>
	//*   2    4:ifnull          12
			return d;
	//    3    7:aload_0         
	//    4    8:getfield        #35  <Field aqq d>
	//    5   11:areturn         
		this;
	//    6   12:aload_0         
		JVM INSTR monitorenter ;
	//    7   13:monitorenter    
		aqq aqq1;
		if(d == null)
			break MISSING_BLOCK_LABEL_30;
	//    8   14:aload_0         
	//    9   15:getfield        #35  <Field aqq d>
	//   10   18:ifnull          30
		aqq1 = d;
	//   11   21:aload_0         
	//   12   22:getfield        #35  <Field aqq d>
	//   13   25:astore_1        
		this;
	//   14   26:aload_0         
		JVM INSTR monitorexit ;
	//   15   27:monitorexit     
		return aqq1;
	//   16   28:aload_1         
	//   17   29:areturn         
		if(c == null)
	//*  18   30:aload_0         
	//*  19   31:getfield        #29  <Field atv c>
	//*  20   34:ifnonnull       47
		{
			d = aqq.a;
	//   21   37:aload_0         
	//   22   38:getstatic       #33  <Field aqq aqq.a>
	//   23   41:putfield        #35  <Field aqq d>
			break MISSING_BLOCK_LABEL_60;
	//   24   44:goto            60
		}
		d = c.h();
	//   25   47:aload_0         
	//   26   48:aload_0         
	//   27   49:getfield        #29  <Field atv c>
	//   28   52:invokeinterface #49  <Method aqq atv.h()>
	//   29   57:putfield        #35  <Field aqq d>
		aqq1 = d;
	//   30   60:aload_0         
	//   31   61:getfield        #35  <Field aqq d>
	//   32   64:astore_1        
		this;
	//   33   65:aload_0         
		JVM INSTR monitorexit ;
	//   34   66:monitorexit     
		return aqq1;
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

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof atb))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class atb>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((atb)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class atb>
	//   12   20:astore_1        
		atv atv1 = c;
	//   13   21:aload_0         
	//   14   22:getfield        #29  <Field atv c>
	//   15   25:astore_2        
		atv atv2 = ((atb) (obj)).c;
	//   16   26:aload_1         
	//   17   27:getfield        #29  <Field atv c>
	//   18   30:astore_3        
		if(atv1 == null && atv2 == null)
	//*  19   31:aload_2         
	//*  20   32:ifnonnull       51
	//*  21   35:aload_3         
	//*  22   36:ifnonnull       51
			return c().equals(((Object) (((atb) (obj)).c())));
	//   23   39:aload_0         
	//   24   40:invokevirtual   #53  <Method aqq c()>
	//   25   43:aload_1         
	//   26   44:invokevirtual   #53  <Method aqq c()>
	//   27   47:invokevirtual   #55  <Method boolean aqq.equals(Object)>
	//   28   50:ireturn         
		if(atv1 != null && atv2 != null)
	//*  29   51:aload_2         
	//*  30   52:ifnull          65
	//*  31   55:aload_3         
	//*  32   56:ifnull          65
			return ((Object) (atv1)).equals(((Object) (atv2)));
	//   33   59:aload_2         
	//   34   60:aload_3         
	//   35   61:invokevirtual   #56  <Method boolean Object.equals(Object)>
	//   36   64:ireturn         
		if(atv1 != null)
	//*  37   65:aload_2         
	//*  38   66:ifnull          84
			return ((Object) (atv1)).equals(((Object) (((atb) (obj)).b(atv1.q()))));
	//   39   69:aload_2         
	//   40   70:aload_1         
	//   41   71:aload_2         
	//   42   72:invokeinterface #60  <Method atv atv.q()>
	//   43   77:invokespecial   #62  <Method atv b(atv)>
	//   44   80:invokevirtual   #56  <Method boolean Object.equals(Object)>
	//   45   83:ireturn         
		else
			return ((Object) (b(atv2.q()))).equals(((Object) (atv2)));
	//   46   84:aload_0         
	//   47   85:aload_3         
	//   48   86:invokeinterface #60  <Method atv atv.q()>
	//   49   91:invokespecial   #62  <Method atv b(atv)>
	//   50   94:aload_3         
	//   51   95:invokevirtual   #56  <Method boolean Object.equals(Object)>
	//   52   98:ireturn         
	}

	public int hashCode()
	{
		return 1;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final ars a = ars.a();
	private aqq b;
	private volatile atv c;
	private volatile aqq d;

	static 
	{
	//    0    0:invokestatic    #18  <Method ars ars.a()>
	//    1    3:putstatic       #20  <Field ars a>
	//*   2    6:return          
	}
}
