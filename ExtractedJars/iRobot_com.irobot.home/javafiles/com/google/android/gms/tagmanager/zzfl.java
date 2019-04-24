// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzej, zzdi

final class zzfl
	implements zzej
{

	public zzfl()
	{
		this(60, 2000L);
	//    0    0:aload_0         
	//    1    1:bipush          60
	//    2    3:ldc2w           #20  <Long 2000L>
	//    3    6:invokespecial   #24  <Method void zzfl(int, long)>
	//    4    9:return          
	}

	private zzfl(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void Object()>
		zzabf = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void Object()>
	//    6   12:putfield        #29  <Field Object zzabf>
		zzabc = 60;
	//    7   15:aload_0         
	//    8   16:bipush          60
	//    9   18:putfield        #31  <Field int zzabc>
		zzabd = zzabc;
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #31  <Field int zzabc>
	//   13   26:i2d             
	//   14   27:putfield        #33  <Field double zzabd>
		zzabb = 2000L;
	//   15   30:aload_0         
	//   16   31:ldc2w           #20  <Long 2000L>
	//   17   34:putfield        #35  <Field long zzabb>
		zzrz = DefaultClock.getInstance();
	//   18   37:aload_0         
	//   19   38:invokestatic    #41  <Method Clock DefaultClock.getInstance()>
	//   20   41:putfield        #43  <Field Clock zzrz>
	//   21   44:return          
	}

	public final boolean zzew()
	{
		Object obj = zzabf;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field Object zzabf>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		double d;
		long l;
		l = zzrz.currentTimeMillis();
	//    5    9:aload_0         
	//    6   10:getfield        #43  <Field Clock zzrz>
	//    7   13:invokeinterface #51  <Method long Clock.currentTimeMillis()>
	//    8   18:lstore_3        
		if(zzabd >= (double)zzabc)
			break MISSING_BLOCK_LABEL_70;
	//    9   19:aload_0         
	//   10   20:getfield        #33  <Field double zzabd>
	//   11   23:aload_0         
	//   12   24:getfield        #31  <Field int zzabc>
	//   13   27:i2d             
	//   14   28:dcmpg           
	//   15   29:ifge            70
		d = (double)(l - zzbfy) / (double)zzabb;
	//   16   32:lload_3         
	//   17   33:aload_0         
	//   18   34:getfield        #53  <Field long zzbfy>
	//   19   37:lsub            
	//   20   38:l2d             
	//   21   39:aload_0         
	//   22   40:getfield        #35  <Field long zzabb>
	//   23   43:l2d             
	//   24   44:ddiv            
	//   25   45:dstore_1        
		if(d <= 0.0D)
			break MISSING_BLOCK_LABEL_70;
	//   26   46:dload_1         
	//   27   47:dconst_0        
	//   28   48:dcmpl           
	//   29   49:ifle            70
		zzabd = Math.min(zzabc, zzabd + d);
	//   30   52:aload_0         
	//   31   53:aload_0         
	//   32   54:getfield        #31  <Field int zzabc>
	//   33   57:i2d             
	//   34   58:aload_0         
	//   35   59:getfield        #33  <Field double zzabd>
	//   36   62:dload_1         
	//   37   63:dadd            
	//   38   64:invokestatic    #59  <Method double Math.min(double, double)>
	//   39   67:putfield        #33  <Field double zzabd>
		zzbfy = l;
	//   40   70:aload_0         
	//   41   71:lload_3         
	//   42   72:putfield        #53  <Field long zzbfy>
		if(zzabd < 1.0D)
			break MISSING_BLOCK_LABEL_99;
	//   43   75:aload_0         
	//   44   76:getfield        #33  <Field double zzabd>
	//   45   79:dconst_1        
	//   46   80:dcmpl           
	//   47   81:iflt            99
		zzabd = zzabd - 1.0D;
	//   48   84:aload_0         
	//   49   85:aload_0         
	//   50   86:getfield        #33  <Field double zzabd>
	//   51   89:dconst_1        
	//   52   90:dsub            
	//   53   91:putfield        #33  <Field double zzabd>
		obj;
	//   54   94:aload           5
		JVM INSTR monitorexit ;
	//   55   96:monitorexit     
		return true;
	//   56   97:iconst_1        
	//   57   98:ireturn         
		zzdi.zzab("No more tokens available.");
	//   58   99:ldc1            #61  <String "No more tokens available.">
	//   59  101:invokestatic    #67  <Method void zzdi.zzab(String)>
		obj;
	//   60  104:aload           5
		JVM INSTR monitorexit ;
	//   61  106:monitorexit     
		return false;
	//   62  107:iconst_0        
	//   63  108:ireturn         
		Exception exception;
		exception;
	//   64  109:astore          6
		obj;
	//   65  111:aload           5
		JVM INSTR monitorexit ;
	//   66  113:monitorexit     
		throw exception;
	//   67  114:aload           6
	//   68  116:athrow          
	}

	private final long zzabb;
	private final int zzabc;
	private double zzabd;
	private final Object zzabf;
	private long zzbfy;
	private final Clock zzrz;
}
