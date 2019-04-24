// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaf, zzag

static final class zzaf$zza
{

	protected final void finalize()
		throws Throwable
	{
		if(!zzbm)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field boolean zzbm>
	//*   2    4:ifne            22
		{
			zzc("Request on the loose");
	//    3    7:aload_0         
	//    4    8:ldc1            #36  <String "Request on the loose">
	//    5   10:invokevirtual   #40  <Method void zzc(String)>
			zzaf.e("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
	//    6   13:ldc1            #42  <String "Marker log finalized without finish() - uncaught exit point for request">
	//    7   15:iconst_0        
	//    8   16:anewarray       Object[]
	//    9   19:invokestatic    #46  <Method void zzaf.e(String, Object[])>
		}
	//   10   22:return          
	}

	public final void zza(String s, long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(zzbm)
	//*   2    2:aload_0         
	//*   3    3:getfield        #31  <Field boolean zzbm>
	//*   4    6:ifeq            19
			throw new IllegalStateException("Marker added to finished log");
	//    5    9:new             #50  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #52  <String "Marker added to finished log">
	//    8   15:invokespecial   #54  <Method void IllegalStateException(String)>
	//    9   18:athrow          
		zzbl.add(((Object) (new zzag(s, l, SystemClock.elapsedRealtime()))));
	//   10   19:aload_0         
	//   11   20:getfield        #29  <Field List zzbl>
	//   12   23:new             #56  <Class zzag>
	//   13   26:dup             
	//   14   27:aload_1         
	//   15   28:lload_2         
	//   16   29:invokestatic    #62  <Method long SystemClock.elapsedRealtime()>
	//   17   32:invokespecial   #65  <Method void zzag(String, long, long)>
	//   18   35:invokeinterface #71  <Method boolean List.add(Object)>
	//   19   40:pop             
		this;
	//   20   41:aload_0         
		JVM INSTR monitorexit ;
	//   21   42:monitorexit     
		return;
	//   22   43:return          
		s;
	//   23   44:astore_1        
	//*  24   45:aload_0         
		throw s;
	//   25   46:monitorexit     
	//   26   47:aload_1         
	//   27   48:athrow          
	}

	public final void zzc(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzbm = true;
	//    2    2:aload_0         
	//    3    3:iconst_1        
	//    4    4:putfield        #31  <Field boolean zzbm>
		long l;
		if(zzbl.size() == 0)
	//*   5    7:aload_0         
	//*   6    8:getfield        #29  <Field List zzbl>
	//*   7   11:invokeinterface #75  <Method int List.size()>
	//*   8   16:ifne            24
		{
			l = 0L;
	//    9   19:lconst_0        
	//   10   20:lstore_2        
			break MISSING_BLOCK_LABEL_74;
	//   11   21:goto            74
		}
		long l1;
		l = ((zzag)zzbl.get(0)).time;
	//   12   24:aload_0         
	//   13   25:getfield        #29  <Field List zzbl>
	//   14   28:iconst_0        
	//   15   29:invokeinterface #79  <Method Object List.get(int)>
	//   16   34:checkcast       #56  <Class zzag>
	//   17   37:getfield        #83  <Field long zzag.time>
	//   18   40:lstore_2        
		l1 = ((zzag)zzbl.get(zzbl.size() - 1)).time;
	//   19   41:aload_0         
	//   20   42:getfield        #29  <Field List zzbl>
	//   21   45:aload_0         
	//   22   46:getfield        #29  <Field List zzbl>
	//   23   49:invokeinterface #75  <Method int List.size()>
	//   24   54:iconst_1        
	//   25   55:isub            
	//   26   56:invokeinterface #79  <Method Object List.get(int)>
	//   27   61:checkcast       #56  <Class zzag>
	//   28   64:getfield        #83  <Field long zzag.time>
	//   29   67:lstore          4
		l = l1 - l;
	//   30   69:lload           4
	//   31   71:lload_2         
	//   32   72:lsub            
	//   33   73:lstore_2        
		if(l <= 0L)
	//*  34   74:lload_2         
	//*  35   75:lconst_0        
	//*  36   76:lcmp            
	//*  37   77:ifgt            83
	//*  38   80:aload_0         
			return;
	//   39   81:monitorexit     
	//   40   82:return          
		l1 = ((zzag)zzbl.get(0)).time;
	//   41   83:aload_0         
	//   42   84:getfield        #29  <Field List zzbl>
	//   43   87:iconst_0        
	//   44   88:invokeinterface #79  <Method Object List.get(int)>
	//   45   93:checkcast       #56  <Class zzag>
	//   46   96:getfield        #83  <Field long zzag.time>
	//   47   99:lstore          4
		zzaf.d("(%-4d ms) %s", new Object[] {
			Long.valueOf(l), s
		});
	//   48  101:ldc1            #85  <String "(%-4d ms) %s">
	//   49  103:iconst_2        
	//   50  104:anewarray       Object[]
	//   51  107:dup             
	//   52  108:iconst_0        
	//   53  109:lload_2         
	//   54  110:invokestatic    #91  <Method Long Long.valueOf(long)>
	//   55  113:aastore         
	//   56  114:dup             
	//   57  115:iconst_1        
	//   58  116:aload_1         
	//   59  117:aastore         
	//   60  118:invokestatic    #94  <Method void zzaf.d(String, Object[])>
		s = ((String) (zzbl.iterator()));
	//   61  121:aload_0         
	//   62  122:getfield        #29  <Field List zzbl>
	//   63  125:invokeinterface #98  <Method Iterator List.iterator()>
	//   64  130:astore_1        
		l = l1;
	//   65  131:lload           4
	//   66  133:lstore_2        
_L2:
		if(!((Iterator) (s)).hasNext())
			break; /* Loop/switch isn't completed */
	//   67  134:aload_1         
	//   68  135:invokeinterface #104 <Method boolean Iterator.hasNext()>
	//   69  140:ifeq            205
		zzag zzag1 = (zzag)((Iterator) (s)).next();
	//   70  143:aload_1         
	//   71  144:invokeinterface #108 <Method Object Iterator.next()>
	//   72  149:checkcast       #56  <Class zzag>
	//   73  152:astore          6
		l1 = zzag1.time;
	//   74  154:aload           6
	//   75  156:getfield        #83  <Field long zzag.time>
	//   76  159:lstore          4
		zzaf.d("(+%-4d) [%2d] %s", new Object[] {
			Long.valueOf(l1 - l), Long.valueOf(zzag1.zzbn), zzag1.name
		});
	//   77  161:ldc1            #110 <String "(+%-4d) [%2d] %s">
	//   78  163:iconst_3        
	//   79  164:anewarray       Object[]
	//   80  167:dup             
	//   81  168:iconst_0        
	//   82  169:lload           4
	//   83  171:lload_2         
	//   84  172:lsub            
	//   85  173:invokestatic    #91  <Method Long Long.valueOf(long)>
	//   86  176:aastore         
	//   87  177:dup             
	//   88  178:iconst_1        
	//   89  179:aload           6
	//   90  181:getfield        #113 <Field long zzag.zzbn>
	//   91  184:invokestatic    #91  <Method Long Long.valueOf(long)>
	//   92  187:aastore         
	//   93  188:dup             
	//   94  189:iconst_2        
	//   95  190:aload           6
	//   96  192:getfield        #117 <Field String zzag.name>
	//   97  195:aastore         
	//   98  196:invokestatic    #94  <Method void zzaf.d(String, Object[])>
		l = l1;
	//   99  199:lload           4
	//  100  201:lstore_2        
		if(true) goto _L2; else goto _L1
	//  101  202:goto            134
	//* 102  205:aload_0         
_L1:
		return;
	//  103  206:monitorexit     
	//  104  207:return          
		s;
	//  105  208:astore_1        
	//* 106  209:aload_0         
		throw s;
	//  107  210:monitorexit     
	//  108  211:aload_1         
	//  109  212:athrow          
	}

	public static final boolean zzbk;
	private final List zzbl = new ArrayList();
	private boolean zzbm;

	static 
	{
		zzbk = zzaf.DEBUG;
	//    0    0:getstatic       #18  <Field boolean zzaf.DEBUG>
	//    1    3:putstatic       #20  <Field boolean zzbk>
	//*   2    6:return          
	}

	zzaf$zza()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #26  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #27  <Method void ArrayList()>
	//    6   12:putfield        #29  <Field List zzbl>
		zzbm = false;
	//    7   15:aload_0         
	//    8   16:iconst_0        
	//    9   17:putfield        #31  <Field boolean zzbm>
	//   10   20:return          
	}
}
