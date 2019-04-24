// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.util.Clock;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzgj, zzkb, zzajr, zzaju, 
//			zzajj, zzajs, zzajm, zzakd, 
//			zznk, zzni, zzjj

public final class zzajv
	implements zzgj
{

	public zzajv()
	{
		this(zzkb.zzih());
	//    0    0:aload_0         
	//    1    1:invokestatic    #25  <Method String zzkb.zzih()>
	//    2    4:invokespecial   #28  <Method void zzajv(String)>
	//    3    7:return          
	}

	private zzajv(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		lock = new Object();
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #31  <Method void Object()>
	//    6   12:putfield        #33  <Field Object lock>
		zzcqo = new HashSet();
	//    7   15:aload_0         
	//    8   16:new             #35  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #36  <Method void HashSet()>
	//   11   23:putfield        #38  <Field HashSet zzcqo>
		zzcqp = new HashSet();
	//   12   26:aload_0         
	//   13   27:new             #35  <Class HashSet>
	//   14   30:dup             
	//   15   31:invokespecial   #36  <Method void HashSet()>
	//   16   34:putfield        #40  <Field HashSet zzcqp>
		zzcqn = new zzajr(s);
	//   17   37:aload_0         
	//   18   38:new             #42  <Class zzajr>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:invokespecial   #43  <Method void zzajr(String)>
	//   22   46:putfield        #45  <Field zzajr zzcqn>
	//   23   49:return          
	}

	public final Bundle zza(Context context, zzajs zzajs1, String s)
	{
		Object obj = lock;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field Object lock>
	//    2    4:astore          4
		obj;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		Bundle bundle;
		bundle = new Bundle();
	//    5    9:new             #49  <Class Bundle>
	//    6   12:dup             
	//    7   13:invokespecial   #50  <Method void Bundle()>
	//    8   16:astore          5
		bundle.putBundle("app", zzcqn.zzk(context, s));
	//    9   18:aload           5
	//   10   20:ldc1            #52  <String "app">
	//   11   22:aload_0         
	//   12   23:getfield        #45  <Field zzajr zzcqn>
	//   13   26:aload_1         
	//   14   27:aload_3         
	//   15   28:invokevirtual   #56  <Method Bundle zzajr.zzk(Context, String)>
	//   16   31:invokevirtual   #60  <Method void Bundle.putBundle(String, Bundle)>
		context = ((Context) (new Bundle()));
	//   17   34:new             #49  <Class Bundle>
	//   18   37:dup             
	//   19   38:invokespecial   #50  <Method void Bundle()>
	//   20   41:astore_1        
		zzaju zzaju1;
		for(s = ((String) (zzcqp.iterator())); ((Iterator) (s)).hasNext(); ((Bundle) (context)).putBundle(zzaju1.zzqm(), zzaju1.toBundle()))
	//*  21   42:aload_0         
	//*  22   43:getfield        #40  <Field HashSet zzcqp>
	//*  23   46:invokevirtual   #64  <Method Iterator HashSet.iterator()>
	//*  24   49:astore_3        
	//*  25   50:aload_3         
	//*  26   51:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//*  27   56:ifeq            87
			zzaju1 = (zzaju)((Iterator) (s)).next();
	//   28   59:aload_3         
	//   29   60:invokeinterface #74  <Method Object Iterator.next()>
	//   30   65:checkcast       #76  <Class zzaju>
	//   31   68:astore          6

	//   32   70:aload_1         
	//   33   71:aload           6
	//   34   73:invokevirtual   #79  <Method String zzaju.zzqm()>
	//   35   76:aload           6
	//   36   78:invokevirtual   #83  <Method Bundle zzaju.toBundle()>
	//   37   81:invokevirtual   #60  <Method void Bundle.putBundle(String, Bundle)>
	//*  38   84:goto            50
		bundle.putBundle("slots", ((Bundle) (context)));
	//   39   87:aload           5
	//   40   89:ldc1            #85  <String "slots">
	//   41   91:aload_1         
	//   42   92:invokevirtual   #60  <Method void Bundle.putBundle(String, Bundle)>
		context = ((Context) (new ArrayList()));
	//   43   95:new             #87  <Class ArrayList>
	//   44   98:dup             
	//   45   99:invokespecial   #88  <Method void ArrayList()>
	//   46  102:astore_1        
		for(s = ((String) (zzcqo.iterator())); ((Iterator) (s)).hasNext(); ((ArrayList) (context)).add(((Object) (((zzajj)((Iterator) (s)).next()).toBundle()))));
	//   47  103:aload_0         
	//   48  104:getfield        #38  <Field HashSet zzcqo>
	//   49  107:invokevirtual   #64  <Method Iterator HashSet.iterator()>
	//   50  110:astore_3        
	//   51  111:aload_3         
	//   52  112:invokeinterface #70  <Method boolean Iterator.hasNext()>
	//   53  117:ifeq            140
	//   54  120:aload_1         
	//   55  121:aload_3         
	//   56  122:invokeinterface #74  <Method Object Iterator.next()>
	//   57  127:checkcast       #90  <Class zzajj>
	//   58  130:invokevirtual   #91  <Method Bundle zzajj.toBundle()>
	//   59  133:invokevirtual   #95  <Method boolean ArrayList.add(Object)>
	//   60  136:pop             
	//*  61  137:goto            111
		bundle.putParcelableArrayList("ads", ((ArrayList) (context)));
	//   62  140:aload           5
	//   63  142:ldc1            #97  <String "ads">
	//   64  144:aload_1         
	//   65  145:invokevirtual   #101 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		zzajs1.zza(zzcqo);
	//   66  148:aload_2         
	//   67  149:aload_0         
	//   68  150:getfield        #38  <Field HashSet zzcqo>
	//   69  153:invokeinterface #106 <Method void zzajs.zza(HashSet)>
		zzcqo.clear();
	//   70  158:aload_0         
	//   71  159:getfield        #38  <Field HashSet zzcqo>
	//   72  162:invokevirtual   #109 <Method void HashSet.clear()>
		obj;
	//   73  165:aload           4
		JVM INSTR monitorexit ;
	//   74  167:monitorexit     
		return bundle;
	//   75  168:aload           5
	//   76  170:areturn         
		context;
	//   77  171:astore_1        
		obj;
	//   78  172:aload           4
		JVM INSTR monitorexit ;
	//   79  174:monitorexit     
		throw context;
	//   80  175:aload_1         
	//   81  176:athrow          
	}

	public final void zza(zzajj zzajj1)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzcqo.add(((Object) (zzajj1)));
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field HashSet zzcqo>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #111 <Method boolean HashSet.add(Object)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		zzajj1;
	//   13   19:astore_1        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw zzajj1;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public final void zza(zzaju zzaju1)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzcqp.add(((Object) (zzaju1)));
	//    5    7:aload_0         
	//    6    8:getfield        #40  <Field HashSet zzcqp>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #111 <Method boolean HashSet.add(Object)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		zzaju1;
	//   13   19:astore_1        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw zzaju1;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public final void zzb(zzjj zzjj, long l)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object lock>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			zzcqn.zzb(zzjj, l);
	//    5    9:aload_0         
	//    6   10:getfield        #45  <Field zzajr zzcqn>
	//    7   13:aload_1         
	//    8   14:lload_2         
	//    9   15:invokevirtual   #116 <Method void zzajr.zzb(zzjj, long)>
		}
	//   10   18:aload           4
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		zzjj;
	//   13   22:astore_1        
		obj;
	//   14   23:aload           4
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw zzjj;
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	public final void zzb(HashSet hashset)
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object lock>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			zzcqo.addAll(((java.util.Collection) (hashset)));
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field HashSet zzcqo>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #120 <Method boolean HashSet.addAll(java.util.Collection)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		hashset;
	//   13   19:astore_1        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw hashset;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public final void zzh(boolean flag)
	{
		long l = zzbv.zzer().currentTimeMillis();
	//    0    0:invokestatic    #130 <Method Clock zzbv.zzer()>
	//    1    3:invokeinterface #136 <Method long Clock.currentTimeMillis()>
	//    2    8:lstore_2        
		if(flag)
	//*   3    9:iload_1         
	//*   4   10:ifeq            77
		{
			long l1 = zzbv.zzeo().zzqh().zzrb();
	//    5   13:invokestatic    #140 <Method zzajm zzbv.zzeo()>
	//    6   16:invokevirtual   #146 <Method zzakd zzajm.zzqh()>
	//    7   19:invokevirtual   #151 <Method long zzakd.zzrb()>
	//    8   22:lstore          4
			zzna zzna = zznk.zzayi;
	//    9   24:getstatic       #157 <Field zzna zznk.zzayi>
	//   10   27:astore          6
			if(l - l1 > ((Long)zzkb.zzik().zzd(zzna)).longValue())
	//*  11   29:lload_2         
	//*  12   30:lload           4
	//*  13   32:lsub            
	//*  14   33:invokestatic    #161 <Method zzni zzkb.zzik()>
	//*  15   36:aload           6
	//*  16   38:invokevirtual   #167 <Method Object zzni.zzd(zzna)>
	//*  17   41:checkcast       #169 <Class Long>
	//*  18   44:invokevirtual   #172 <Method long Long.longValue()>
	//*  19   47:lcmp            
	//*  20   48:ifle            60
			{
				zzcqn.zzcqg = -1;
	//   21   51:aload_0         
	//   22   52:getfield        #45  <Field zzajr zzcqn>
	//   23   55:iconst_m1       
	//   24   56:putfield        #176 <Field int zzajr.zzcqg>
				return;
	//   25   59:return          
			} else
			{
				zzcqn.zzcqg = zzbv.zzeo().zzqh().zzrc();
	//   26   60:aload_0         
	//   27   61:getfield        #45  <Field zzajr zzcqn>
	//   28   64:invokestatic    #140 <Method zzajm zzbv.zzeo()>
	//   29   67:invokevirtual   #146 <Method zzakd zzajm.zzqh()>
	//   30   70:invokevirtual   #180 <Method int zzakd.zzrc()>
	//   31   73:putfield        #176 <Field int zzajr.zzcqg>
				return;
	//   32   76:return          
			}
		} else
		{
			zzbv.zzeo().zzqh().zzj(l);
	//   33   77:invokestatic    #140 <Method zzajm zzbv.zzeo()>
	//   34   80:invokevirtual   #146 <Method zzakd zzajm.zzqh()>
	//   35   83:lload_2         
	//   36   84:invokevirtual   #184 <Method void zzakd.zzj(long)>
			zzbv.zzeo().zzqh().zzaf(zzcqn.zzcqg);
	//   37   87:invokestatic    #140 <Method zzajm zzbv.zzeo()>
	//   38   90:invokevirtual   #146 <Method zzakd zzajm.zzqh()>
	//   39   93:aload_0         
	//   40   94:getfield        #45  <Field zzajr zzcqn>
	//   41   97:getfield        #176 <Field int zzajr.zzcqg>
	//   42  100:invokevirtual   #188 <Method void zzakd.zzaf(int)>
			return;
	//   43  103:return          
		}
	}

	public final void zzpm()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzcqn.zzpm();
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field zzajr zzcqn>
	//    7   11:invokevirtual   #191 <Method void zzajr.zzpm()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		obj;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	public final void zzpn()
	{
		synchronized(lock)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object lock>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			zzcqn.zzpn();
	//    5    7:aload_0         
	//    6    8:getfield        #45  <Field zzajr zzcqn>
	//    7   11:invokevirtual   #194 <Method void zzajr.zzpn()>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		obj;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	private final Object lock;
	private final zzajr zzcqn;
	private final HashSet zzcqo;
	private final HashSet zzcqp;
}
