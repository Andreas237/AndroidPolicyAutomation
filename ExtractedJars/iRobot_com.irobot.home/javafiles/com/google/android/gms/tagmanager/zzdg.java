// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzej, zzdi

final class zzdg
	implements zzej
{

	public zzdg(int i, int j, long l, long l1, String s, 
			Clock clock)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #26  <Method void Object()>
	//    6   12:putfield        #28  <Field Object zzabf>
	//    7   15:aload_0         
	//    8   16:iconst_5        
	//    9   17:putfield        #30  <Field int zzabc>
		zzabd = Math.min(1, 5);
	//   10   20:aload_0         
	//   11   21:iconst_1        
	//   12   22:iconst_5        
	//   13   23:invokestatic    #36  <Method int Math.min(int, int)>
	//   14   26:i2d             
	//   15   27:putfield        #38  <Field double zzabd>
	//   16   30:aload_0         
	//   17   31:ldc2w           #39  <Long 0xdbba0L>
	//   18   34:putfield        #42  <Field long zzabb>
	//   19   37:aload_0         
	//   20   38:ldc2w           #43  <Long 5000L>
	//   21   41:putfield        #46  <Field long zzbdn>
		zzul = s;
	//   22   44:aload_0         
	//   23   45:aload           7
	//   24   47:putfield        #48  <Field String zzul>
		zzrz = clock;
	//   25   50:aload_0         
	//   26   51:aload           8
	//   27   53:putfield        #50  <Field Clock zzrz>
	//   28   56:return          
	}

	public final boolean zzew()
	{
		long l;
label0:
		{
			synchronized(zzabf)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field Object zzabf>
	//*   2    4:astore          5
	//*   3    6:aload           5
	//*   4    8:monitorenter    
			{
				l = zzrz.currentTimeMillis();
	//    5    9:aload_0         
	//    6   10:getfield        #50  <Field Clock zzrz>
	//    7   13:invokeinterface #59  <Method long Clock.currentTimeMillis()>
	//    8   18:lstore_3        
				if(l - zzabe >= zzbdn)
					break label0;
	//    9   19:lload_3         
	//   10   20:aload_0         
	//   11   21:getfield        #61  <Field long zzabe>
	//   12   24:lsub            
	//   13   25:aload_0         
	//   14   26:getfield        #46  <Field long zzbdn>
	//   15   29:lcmp            
	//   16   30:ifge            96
				String s = zzul;
	//   17   33:aload_0         
	//   18   34:getfield        #48  <Field String zzul>
	//   19   37:astore          6
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 34);
	//   20   39:new             #63  <Class StringBuilder>
	//   21   42:dup             
	//   22   43:aload           6
	//   23   45:invokestatic    #69  <Method String String.valueOf(Object)>
	//   24   48:invokevirtual   #73  <Method int String.length()>
	//   25   51:bipush          34
	//   26   53:iadd            
	//   27   54:invokespecial   #76  <Method void StringBuilder(int)>
	//   28   57:astore          7
				stringbuilder.append("Excessive ");
	//   29   59:aload           7
	//   30   61:ldc1            #78  <String "Excessive ">
	//   31   63:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   32   66:pop             
				stringbuilder.append(s);
	//   33   67:aload           7
	//   34   69:aload           6
	//   35   71:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   36   74:pop             
				stringbuilder.append(" detected; call ignored.");
	//   37   75:aload           7
	//   38   77:ldc1            #84  <String " detected; call ignored.">
	//   39   79:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//   40   82:pop             
				zzdi.zzab(stringbuilder.toString());
	//   41   83:aload           7
	//   42   85:invokevirtual   #88  <Method String StringBuilder.toString()>
	//   43   88:invokestatic    #94  <Method void zzdi.zzab(String)>
			}
	//   44   91:aload           5
	//   45   93:monitorexit     
			return false;
	//   46   94:iconst_0        
	//   47   95:ireturn         
		}
		double d;
		if(zzabd >= (double)zzabc)
			break MISSING_BLOCK_LABEL_147;
	//   48   96:aload_0         
	//   49   97:getfield        #38  <Field double zzabd>
	//   50  100:aload_0         
	//   51  101:getfield        #30  <Field int zzabc>
	//   52  104:i2d             
	//   53  105:dcmpg           
	//   54  106:ifge            147
		d = (double)(l - zzabe) / (double)zzabb;
	//   55  109:lload_3         
	//   56  110:aload_0         
	//   57  111:getfield        #61  <Field long zzabe>
	//   58  114:lsub            
	//   59  115:l2d             
	//   60  116:aload_0         
	//   61  117:getfield        #42  <Field long zzabb>
	//   62  120:l2d             
	//   63  121:ddiv            
	//   64  122:dstore_1        
		if(d <= 0.0D)
			break MISSING_BLOCK_LABEL_147;
	//   65  123:dload_1         
	//   66  124:dconst_0        
	//   67  125:dcmpl           
	//   68  126:ifle            147
		zzabd = Math.min(zzabc, zzabd + d);
	//   69  129:aload_0         
	//   70  130:aload_0         
	//   71  131:getfield        #30  <Field int zzabc>
	//   72  134:i2d             
	//   73  135:aload_0         
	//   74  136:getfield        #38  <Field double zzabd>
	//   75  139:dload_1         
	//   76  140:dadd            
	//   77  141:invokestatic    #97  <Method double Math.min(double, double)>
	//   78  144:putfield        #38  <Field double zzabd>
		zzabe = l;
	//   79  147:aload_0         
	//   80  148:lload_3         
	//   81  149:putfield        #61  <Field long zzabe>
		if(zzabd < 1.0D)
			break MISSING_BLOCK_LABEL_176;
	//   82  152:aload_0         
	//   83  153:getfield        #38  <Field double zzabd>
	//   84  156:dconst_1        
	//   85  157:dcmpl           
	//   86  158:iflt            176
		zzabd = zzabd - 1.0D;
	//   87  161:aload_0         
	//   88  162:aload_0         
	//   89  163:getfield        #38  <Field double zzabd>
	//   90  166:dconst_1        
	//   91  167:dsub            
	//   92  168:putfield        #38  <Field double zzabd>
		obj;
	//   93  171:aload           5
		JVM INSTR monitorexit ;
	//   94  173:monitorexit     
		return true;
	//   95  174:iconst_1        
	//   96  175:ireturn         
		String s1 = zzul;
	//   97  176:aload_0         
	//   98  177:getfield        #48  <Field String zzul>
	//   99  180:astore          6
		StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(((Object) (s1))).length() + 34);
	//  100  182:new             #63  <Class StringBuilder>
	//  101  185:dup             
	//  102  186:aload           6
	//  103  188:invokestatic    #69  <Method String String.valueOf(Object)>
	//  104  191:invokevirtual   #73  <Method int String.length()>
	//  105  194:bipush          34
	//  106  196:iadd            
	//  107  197:invokespecial   #76  <Method void StringBuilder(int)>
	//  108  200:astore          7
		stringbuilder1.append("Excessive ");
	//  109  202:aload           7
	//  110  204:ldc1            #78  <String "Excessive ">
	//  111  206:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  112  209:pop             
		stringbuilder1.append(s1);
	//  113  210:aload           7
	//  114  212:aload           6
	//  115  214:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  116  217:pop             
		stringbuilder1.append(" detected; call ignored.");
	//  117  218:aload           7
	//  118  220:ldc1            #84  <String " detected; call ignored.">
	//  119  222:invokevirtual   #82  <Method StringBuilder StringBuilder.append(String)>
	//  120  225:pop             
		zzdi.zzab(stringbuilder1.toString());
	//  121  226:aload           7
	//  122  228:invokevirtual   #88  <Method String StringBuilder.toString()>
	//  123  231:invokestatic    #94  <Method void zzdi.zzab(String)>
		obj;
	//  124  234:aload           5
		JVM INSTR monitorexit ;
	//  125  236:monitorexit     
		return false;
	//  126  237:iconst_0        
	//  127  238:ireturn         
		exception;
	//  128  239:astore          6
		obj;
	//  129  241:aload           5
		JVM INSTR monitorexit ;
	//  130  243:monitorexit     
		throw exception;
	//  131  244:aload           6
	//  132  246:athrow          
	}

	private final long zzabb = 0xdbba0L;
	private final int zzabc = 5;
	private double zzabd;
	private long zzabe;
	private final Object zzabf = new Object();
	private final long zzbdn = 5000L;
	private final Clock zzrz;
	private final String zzul;
}
