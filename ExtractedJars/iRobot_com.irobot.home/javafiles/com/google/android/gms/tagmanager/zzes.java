// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.concurrent.*;

// Referenced classes of package com.google.android.gms.tagmanager:
//			zzag, zzet, zzew, zzeu, 
//			zzdi, zzev, zzer, zzdh, 
//			zzal

final class zzes
	implements zzag
{

	public zzes(Context context, String s, zzal zzal)
	{
		this(context, s, zzal, ((zzew) (null)), ((zzev) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:aconst_null     
	//    5    5:aconst_null     
	//    6    6:invokespecial   #30  <Method void zzes(Context, String, zzal, zzew, zzev)>
	//    7    9:return          
	}

	private zzes(Context context, String s, zzal zzal, zzew zzew1, zzev zzev1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void Object()>
		zzbet = zzal;
	//    2    4:aload_0         
	//    3    5:aload_3         
	//    4    6:putfield        #37  <Field zzal zzbet>
		zzri = context;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field Context zzri>
		zzazq = s;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #41  <Field String zzazq>
		zzbev = ((zzew) (new zzet(this))).zzpq();
	//   11   19:aload_0         
	//   12   20:new             #43  <Class zzet>
	//   13   23:dup             
	//   14   24:aload_0         
	//   15   25:invokespecial   #46  <Method void zzet(zzes)>
	//   16   28:invokeinterface #52  <Method ScheduledExecutorService zzew.zzpq()>
	//   17   33:putfield        #54  <Field ScheduledExecutorService zzbev>
		zzbew = ((zzev) (new zzeu(this)));
	//   18   36:aload_0         
	//   19   37:new             #56  <Class zzeu>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:invokespecial   #57  <Method void zzeu(zzes)>
	//   23   45:putfield        #59  <Field zzev zzbew>
	//   24   48:return          
	}

	static Context zza(zzes zzes1)
	{
		return zzes1.zzri;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field Context zzri>
	//    2    4:areturn         
	}

	static String zzb(zzes zzes1)
	{
		return zzes1.zzazq;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String zzazq>
	//    2    4:areturn         
	}

	private final void zzpp()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(closed)
	//*   2    2:aload_0         
	//*   3    3:getfield        #67  <Field boolean closed>
	//*   4    6:ifeq            19
			throw new IllegalStateException("called method after closed");
	//    5    9:new             #69  <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc1            #71  <String "called method after closed">
	//    8   15:invokespecial   #74  <Method void IllegalStateException(String)>
	//    9   18:athrow          
		this;
	//   10   19:aload_0         
		JVM INSTR monitorexit ;
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		Exception exception;
		exception;
	//   13   22:astore_1        
	//*  14   23:aload_0         
		throw exception;
	//   15   24:monitorexit     
	//   16   25:aload_1         
	//   17   26:athrow          
	}

	public final void release()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzpp();
	//    2    2:aload_0         
	//    3    3:invokespecial   #77  <Method void zzpp()>
		if(zzbex != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #79  <Field ScheduledFuture zzbex>
	//*   6   10:ifnull          24
			zzbex.cancel(false);
	//    7   13:aload_0         
	//    8   14:getfield        #79  <Field ScheduledFuture zzbex>
	//    9   17:iconst_0        
	//   10   18:invokeinterface #85  <Method boolean ScheduledFuture.cancel(boolean)>
	//   11   23:pop             
		zzbev.shutdown();
	//   12   24:aload_0         
	//   13   25:getfield        #54  <Field ScheduledExecutorService zzbev>
	//   14   28:invokeinterface #90  <Method void ScheduledExecutorService.shutdown()>
		closed = true;
	//   15   33:aload_0         
	//   16   34:iconst_1        
	//   17   35:putfield        #67  <Field boolean closed>
		this;
	//   18   38:aload_0         
		JVM INSTR monitorexit ;
	//   19   39:monitorexit     
		return;
	//   20   40:return          
		Exception exception;
		exception;
	//   21   41:astore_1        
	//*  22   42:aload_0         
		throw exception;
	//   23   43:monitorexit     
	//   24   44:aload_1         
	//   25   45:athrow          
	}

	public final void zza(long l, String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Object obj = ((Object) (zzazq));
	//    2    2:aload_0         
	//    3    3:getfield        #41  <Field String zzazq>
	//    4    6:astore          4
		Object obj1 = ((Object) (new StringBuilder(String.valueOf(obj).length() + 55)));
	//    5    8:new             #93  <Class StringBuilder>
	//    6   11:dup             
	//    7   12:aload           4
	//    8   14:invokestatic    #99  <Method String String.valueOf(Object)>
	//    9   17:invokevirtual   #103 <Method int String.length()>
	//   10   20:bipush          55
	//   11   22:iadd            
	//   12   23:invokespecial   #106 <Method void StringBuilder(int)>
	//   13   26:astore          5
		((StringBuilder) (obj1)).append("loadAfterDelay: containerId=");
	//   14   28:aload           5
	//   15   30:ldc1            #108 <String "loadAfterDelay: containerId=">
	//   16   32:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   17   35:pop             
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   18   36:aload           5
	//   19   38:aload           4
	//   20   40:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   21   43:pop             
		((StringBuilder) (obj1)).append(" delay=");
	//   22   44:aload           5
	//   23   46:ldc1            #114 <String " delay=">
	//   24   48:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   25   51:pop             
		((StringBuilder) (obj1)).append(l);
	//   26   52:aload           5
	//   27   54:lload_1         
	//   28   55:invokevirtual   #117 <Method StringBuilder StringBuilder.append(long)>
	//   29   58:pop             
		zzdi.v(((StringBuilder) (obj1)).toString());
	//   30   59:aload           5
	//   31   61:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   32   64:invokestatic    #126 <Method void zzdi.v(String)>
		zzpp();
	//   33   67:aload_0         
	//   34   68:invokespecial   #77  <Method void zzpp()>
		if(zzbes == null)
	//*  35   71:aload_0         
	//*  36   72:getfield        #128 <Field zzdh zzbes>
	//*  37   75:ifnonnull       88
			throw new IllegalStateException("callback must be set before loadAfterDelay() is called.");
	//   38   78:new             #69  <Class IllegalStateException>
	//   39   81:dup             
	//   40   82:ldc1            #130 <String "callback must be set before loadAfterDelay() is called.">
	//   41   84:invokespecial   #74  <Method void IllegalStateException(String)>
	//   42   87:athrow          
		if(zzbex != null)
	//*  43   88:aload_0         
	//*  44   89:getfield        #79  <Field ScheduledFuture zzbex>
	//*  45   92:ifnull          106
			zzbex.cancel(false);
	//   46   95:aload_0         
	//   47   96:getfield        #79  <Field ScheduledFuture zzbex>
	//   48   99:iconst_0        
	//   49  100:invokeinterface #85  <Method boolean ScheduledFuture.cancel(boolean)>
	//   50  105:pop             
		obj = ((Object) (zzbev));
	//   51  106:aload_0         
	//   52  107:getfield        #54  <Field ScheduledExecutorService zzbev>
	//   53  110:astore          4
		obj1 = ((Object) (zzbew.zza(zzbet)));
	//   54  112:aload_0         
	//   55  113:getfield        #59  <Field zzev zzbew>
	//   56  116:aload_0         
	//   57  117:getfield        #37  <Field zzal zzbet>
	//   58  120:invokeinterface #135 <Method zzer zzev.zza(zzal)>
	//   59  125:astore          5
		((zzer) (obj1)).zza(zzbes);
	//   60  127:aload           5
	//   61  129:aload_0         
	//   62  130:getfield        #128 <Field zzdh zzbes>
	//   63  133:invokevirtual   #140 <Method void zzer.zza(zzdh)>
		((zzer) (obj1)).zzdg(zzbar);
	//   64  136:aload           5
	//   65  138:aload_0         
	//   66  139:getfield        #142 <Field String zzbar>
	//   67  142:invokevirtual   #145 <Method void zzer.zzdg(String)>
		((zzer) (obj1)).zzdy(s);
	//   68  145:aload           5
	//   69  147:aload_3         
	//   70  148:invokevirtual   #148 <Method void zzer.zzdy(String)>
		zzbex = ((ScheduledExecutorService) (obj)).schedule(((Runnable) (obj1)), l, TimeUnit.MILLISECONDS);
	//   71  151:aload_0         
	//   72  152:aload           4
	//   73  154:aload           5
	//   74  156:lload_1         
	//   75  157:getstatic       #154 <Field TimeUnit TimeUnit.MILLISECONDS>
	//   76  160:invokeinterface #158 <Method ScheduledFuture ScheduledExecutorService.schedule(Runnable, long, TimeUnit)>
	//   77  165:putfield        #79  <Field ScheduledFuture zzbex>
		this;
	//   78  168:aload_0         
		JVM INSTR monitorexit ;
	//   79  169:monitorexit     
		return;
	//   80  170:return          
		s;
	//   81  171:astore_3        
	//*  82  172:aload_0         
		throw s;
	//   83  173:monitorexit     
	//   84  174:aload_3         
	//   85  175:athrow          
	}

	public final void zza(zzdh zzdh)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzpp();
	//    2    2:aload_0         
	//    3    3:invokespecial   #77  <Method void zzpp()>
		zzbes = zzdh;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #128 <Field zzdh zzbes>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		zzdh;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw zzdh;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	public final void zzdg(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		zzpp();
	//    2    2:aload_0         
	//    3    3:invokespecial   #77  <Method void zzpp()>
		zzbar = s;
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:putfield        #142 <Field String zzbar>
		this;
	//    7   11:aload_0         
		JVM INSTR monitorexit ;
	//    8   12:monitorexit     
		return;
	//    9   13:return          
		s;
	//   10   14:astore_1        
	//*  11   15:aload_0         
		throw s;
	//   12   16:monitorexit     
	//   13   17:aload_1         
	//   14   18:athrow          
	}

	private boolean closed;
	private final String zzazq;
	private String zzbar;
	private zzdh zzbes;
	private zzal zzbet;
	private final ScheduledExecutorService zzbev;
	private final zzev zzbew;
	private ScheduledFuture zzbex;
	private final Context zzri;
}
