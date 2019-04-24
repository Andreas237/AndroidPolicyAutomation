// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.internal.measurement:
//			zzco

public final class zzcn
{

	private zzcn(int i, long l, String s, Clock clock)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
		zzabf = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Object()>
	//    6   12:putfield        #25  <Field Object zzabf>
		zzabc = 60;
	//    7   15:aload_0         
	//    8   16:bipush          60
	//    9   18:putfield        #27  <Field int zzabc>
		zzabd = zzabc;
	//   10   21:aload_0         
	//   11   22:aload_0         
	//   12   23:getfield        #27  <Field int zzabc>
	//   13   26:i2d             
	//   14   27:putfield        #29  <Field double zzabd>
		zzabb = 2000L;
	//   15   30:aload_0         
	//   16   31:ldc2w           #30  <Long 2000L>
	//   17   34:putfield        #33  <Field long zzabb>
		zzul = s;
	//   18   37:aload_0         
	//   19   38:aload           4
	//   20   40:putfield        #35  <Field String zzul>
		zzrz = clock;
	//   21   43:aload_0         
	//   22   44:aload           5
	//   23   46:putfield        #37  <Field Clock zzrz>
	//   24   49:return          
	}

	public zzcn(String s, Clock clock)
	{
		this(60, 2000L, s, clock);
	//    0    0:aload_0         
	//    1    1:bipush          60
	//    2    3:ldc2w           #30  <Long 2000L>
	//    3    6:aload_1         
	//    4    7:aload_2         
	//    5    8:invokespecial   #41  <Method void zzcn(int, long, String, Clock)>
	//    6   11:return          
	}

	public final boolean zzew()
	{
		Object obj = zzabf;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Object zzabf>
	//    2    4:astore          5
		obj;
	//    3    6:aload           5
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		double d;
		long l;
		l = zzrz.currentTimeMillis();
	//    5    9:aload_0         
	//    6   10:getfield        #37  <Field Clock zzrz>
	//    7   13:invokeinterface #49  <Method long Clock.currentTimeMillis()>
	//    8   18:lstore_3        
		if(zzabd >= (double)zzabc)
			break MISSING_BLOCK_LABEL_70;
	//    9   19:aload_0         
	//   10   20:getfield        #29  <Field double zzabd>
	//   11   23:aload_0         
	//   12   24:getfield        #27  <Field int zzabc>
	//   13   27:i2d             
	//   14   28:dcmpg           
	//   15   29:ifge            70
		d = (double)(l - zzabe) / (double)zzabb;
	//   16   32:lload_3         
	//   17   33:aload_0         
	//   18   34:getfield        #51  <Field long zzabe>
	//   19   37:lsub            
	//   20   38:l2d             
	//   21   39:aload_0         
	//   22   40:getfield        #33  <Field long zzabb>
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
	//   32   54:getfield        #27  <Field int zzabc>
	//   33   57:i2d             
	//   34   58:aload_0         
	//   35   59:getfield        #29  <Field double zzabd>
	//   36   62:dload_1         
	//   37   63:dadd            
	//   38   64:invokestatic    #57  <Method double Math.min(double, double)>
	//   39   67:putfield        #29  <Field double zzabd>
		zzabe = l;
	//   40   70:aload_0         
	//   41   71:lload_3         
	//   42   72:putfield        #51  <Field long zzabe>
		if(zzabd < 1.0D)
			break MISSING_BLOCK_LABEL_99;
	//   43   75:aload_0         
	//   44   76:getfield        #29  <Field double zzabd>
	//   45   79:dconst_1        
	//   46   80:dcmpl           
	//   47   81:iflt            99
		zzabd = zzabd - 1.0D;
	//   48   84:aload_0         
	//   49   85:aload_0         
	//   50   86:getfield        #29  <Field double zzabd>
	//   51   89:dconst_1        
	//   52   90:dsub            
	//   53   91:putfield        #29  <Field double zzabd>
		obj;
	//   54   94:aload           5
		JVM INSTR monitorexit ;
	//   55   96:monitorexit     
		return true;
	//   56   97:iconst_1        
	//   57   98:ireturn         
		String s = zzul;
	//   58   99:aload_0         
	//   59  100:getfield        #35  <Field String zzul>
	//   60  103:astore          6
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34);
	//   61  105:new             #59  <Class StringBuilder>
	//   62  108:dup             
	//   63  109:aload           6
	//   64  111:invokestatic    #65  <Method String String.valueOf(Object)>
	//   65  114:invokevirtual   #69  <Method int String.length()>
	//   66  117:bipush          34
	//   67  119:iadd            
	//   68  120:invokespecial   #72  <Method void StringBuilder(int)>
	//   69  123:astore          7
		stringbuilder.append("Excessive ");
	//   70  125:aload           7
	//   71  127:ldc1            #74  <String "Excessive ">
	//   72  129:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   73  132:pop             
		stringbuilder.append(s);
	//   74  133:aload           7
	//   75  135:aload           6
	//   76  137:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   77  140:pop             
		stringbuilder.append(" detected; call ignored.");
	//   78  141:aload           7
	//   79  143:ldc1            #80  <String " detected; call ignored.">
	//   80  145:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   81  148:pop             
		zzco.zzab(stringbuilder.toString());
	//   82  149:aload           7
	//   83  151:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   84  154:invokestatic    #90  <Method void zzco.zzab(String)>
		obj;
	//   85  157:aload           5
		JVM INSTR monitorexit ;
	//   86  159:monitorexit     
		return false;
	//   87  160:iconst_0        
	//   88  161:ireturn         
		Exception exception;
		exception;
	//   89  162:astore          6
		obj;
	//   90  164:aload           5
		JVM INSTR monitorexit ;
	//   91  166:monitorexit     
		throw exception;
	//   92  167:aload           6
	//   93  169:athrow          
	}

	private final long zzabb;
	private final int zzabc;
	private double zzabd;
	private long zzabe;
	private final Object zzabf;
	private final Clock zzrz;
	private final String zzul;
}
