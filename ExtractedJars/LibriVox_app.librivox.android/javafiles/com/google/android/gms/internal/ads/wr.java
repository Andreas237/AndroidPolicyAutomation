// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.util.e;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bqo, wn, wp, wq, 
//			wf, wo, xa, p, 
//			bwk, m, zzwb

public final class wr
	implements bqo
{

	public wr(String s, xa xa1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #23  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #23  <Method void Object()>
	//    6   12:putfield        #25  <Field Object a>
	//    7   15:aload_0         
	//    8   16:new             #27  <Class HashSet>
	//    9   19:dup             
	//   10   20:invokespecial   #28  <Method void HashSet()>
	//   11   23:putfield        #30  <Field HashSet e>
	//   12   26:aload_0         
	//   13   27:new             #27  <Class HashSet>
	//   14   30:dup             
	//   15   31:invokespecial   #28  <Method void HashSet()>
	//   16   34:putfield        #32  <Field HashSet f>
		d = new wn(s, xa1);
	//   17   37:aload_0         
	//   18   38:new             #34  <Class wn>
	//   19   41:dup             
	//   20   42:aload_1         
	//   21   43:aload_2         
	//   22   44:invokespecial   #36  <Method void wn(String, xa)>
	//   23   47:putfield        #38  <Field wn d>
		b = xa1;
	//   24   50:aload_0         
	//   25   51:aload_2         
	//   26   52:putfield        #40  <Field xa b>
	//   27   55:aload_0         
	//   28   56:new             #42  <Class wp>
	//   29   59:dup             
	//   30   60:invokespecial   #43  <Method void wp()>
	//   31   63:putfield        #45  <Field wp c>
	//   32   66:return          
	}

	public final Bundle a(Context context, wo wo1)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #27  <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void HashSet()>
	//    3    7:astore_3        
		synchronized(a)
	//*   4    8:aload_0         
	//*   5    9:getfield        #25  <Field Object a>
	//*   6   12:astore          4
	//*   7   14:aload           4
	//*   8   16:monitorenter    
		{
			hashset.addAll(((java.util.Collection) (e)));
	//    9   17:aload_3         
	//   10   18:aload_0         
	//   11   19:getfield        #30  <Field HashSet e>
	//   12   22:invokevirtual   #51  <Method boolean HashSet.addAll(java.util.Collection)>
	//   13   25:pop             
			e.clear();
	//   14   26:aload_0         
	//   15   27:getfield        #30  <Field HashSet e>
	//   16   30:invokevirtual   #54  <Method void HashSet.clear()>
		}
	//   17   33:aload           4
	//   18   35:monitorexit     
		obj = ((Object) (new Bundle()));
	//   19   36:new             #56  <Class Bundle>
	//   20   39:dup             
	//   21   40:invokespecial   #57  <Method void Bundle()>
	//   22   43:astore          4
		((Bundle) (obj)).putBundle("app", d.a(context, c.b()));
	//   23   45:aload           4
	//   24   47:ldc1            #59  <String "app">
	//   25   49:aload_0         
	//   26   50:getfield        #38  <Field wn d>
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #45  <Field wp c>
	//   30   58:invokevirtual   #62  <Method String wp.b()>
	//   31   61:invokevirtual   #65  <Method Bundle wn.a(Context, String)>
	//   32   64:invokevirtual   #69  <Method void Bundle.putBundle(String, Bundle)>
		context = ((Context) (new Bundle()));
	//   33   67:new             #56  <Class Bundle>
	//   34   70:dup             
	//   35   71:invokespecial   #57  <Method void Bundle()>
	//   36   74:astore_1        
		wq wq1;
		for(Iterator iterator = f.iterator(); iterator.hasNext(); ((Bundle) (context)).putBundle(wq1.a(), wq1.b()))
	//*  37   75:aload_0         
	//*  38   76:getfield        #32  <Field HashSet f>
	//*  39   79:invokevirtual   #73  <Method Iterator HashSet.iterator()>
	//*  40   82:astore          5
	//*  41   84:aload           5
	//*  42   86:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*  43   91:ifeq            123
			wq1 = (wq)iterator.next();
	//   44   94:aload           5
	//   45   96:invokeinterface #83  <Method Object Iterator.next()>
	//   46  101:checkcast       #85  <Class wq>
	//   47  104:astore          6

	//   48  106:aload_1         
	//   49  107:aload           6
	//   50  109:invokevirtual   #87  <Method String wq.a()>
	//   51  112:aload           6
	//   52  114:invokevirtual   #90  <Method Bundle wq.b()>
	//   53  117:invokevirtual   #69  <Method void Bundle.putBundle(String, Bundle)>
	//*  54  120:goto            84
		((Bundle) (obj)).putBundle("slots", ((Bundle) (context)));
	//   55  123:aload           4
	//   56  125:ldc1            #92  <String "slots">
	//   57  127:aload_1         
	//   58  128:invokevirtual   #69  <Method void Bundle.putBundle(String, Bundle)>
		context = ((Context) (new ArrayList()));
	//   59  131:new             #94  <Class ArrayList>
	//   60  134:dup             
	//   61  135:invokespecial   #95  <Method void ArrayList()>
	//   62  138:astore_1        
		for(Iterator iterator1 = hashset.iterator(); iterator1.hasNext(); ((ArrayList) (context)).add(((Object) (((wf)iterator1.next()).d()))));
	//   63  139:aload_3         
	//   64  140:invokevirtual   #73  <Method Iterator HashSet.iterator()>
	//   65  143:astore          5
	//   66  145:aload           5
	//   67  147:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   68  152:ifeq            176
	//   69  155:aload_1         
	//   70  156:aload           5
	//   71  158:invokeinterface #83  <Method Object Iterator.next()>
	//   72  163:checkcast       #97  <Class wf>
	//   73  166:invokevirtual   #99  <Method Bundle wf.d()>
	//   74  169:invokevirtual   #103 <Method boolean ArrayList.add(Object)>
	//   75  172:pop             
	//*  76  173:goto            145
		((Bundle) (obj)).putParcelableArrayList("ads", ((ArrayList) (context)));
	//   77  176:aload           4
	//   78  178:ldc1            #105 <String "ads">
	//   79  180:aload_1         
	//   80  181:invokevirtual   #109 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		wo1.a(hashset);
	//   81  184:aload_2         
	//   82  185:aload_3         
	//   83  186:invokeinterface #114 <Method void wo.a(HashSet)>
		return ((Bundle) (obj));
	//   84  191:aload           4
	//   85  193:areturn         
		context;
	//   86  194:astore_1        
		obj;
	//   87  195:aload           4
		JVM INSTR monitorexit ;
	//   88  197:monitorexit     
		throw context;
	//   89  198:aload_1         
	//   90  199:athrow          
	}

	public final wf a(e e1, String s)
	{
		return new wf(e1, this, c.a(), s);
	//    0    0:new             #97  <Class wf>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:getfield        #45  <Field wp c>
	//    6   10:invokevirtual   #116 <Method String wp.a()>
	//    7   13:aload_2         
	//    8   14:invokespecial   #119 <Method void wf(e, wr, String, String)>
	//    9   17:areturn         
	}

	public final void a()
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			d.a();
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field wn d>
	//    7   11:invokevirtual   #121 <Method void wn.a()>
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

	public final void a(wf wf1)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			e.add(((Object) (wf1)));
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field HashSet e>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #123 <Method boolean HashSet.add(Object)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		wf1;
	//   13   19:astore_1        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw wf1;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public final void a(wq wq1)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			f.add(((Object) (wq1)));
	//    5    7:aload_0         
	//    6    8:getfield        #32  <Field HashSet f>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #123 <Method boolean HashSet.add(Object)>
	//    9   15:pop             
		}
	//   10   16:aload_2         
	//   11   17:monitorexit     
		return;
	//   12   18:return          
		wq1;
	//   13   19:astore_1        
		obj;
	//   14   20:aload_2         
		JVM INSTR monitorexit ;
	//   15   21:monitorexit     
		throw wq1;
	//   16   22:aload_1         
	//   17   23:athrow          
	}

	public final void a(zzwb zzwb, long l)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object a>
	//*   2    4:astore          4
	//*   3    6:aload           4
	//*   4    8:monitorenter    
		{
			d.a(zzwb, l);
	//    5    9:aload_0         
	//    6   10:getfield        #38  <Field wn d>
	//    7   13:aload_1         
	//    8   14:lload_2         
	//    9   15:invokevirtual   #127 <Method void wn.a(zzwb, long)>
		}
	//   10   18:aload           4
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		zzwb;
	//   13   22:astore_1        
		obj;
	//   14   23:aload           4
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		throw zzwb;
	//   16   26:aload_1         
	//   17   27:athrow          
	}

	public final void a(HashSet hashset)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object a>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			e.addAll(((java.util.Collection) (hashset)));
	//    5    7:aload_0         
	//    6    8:getfield        #30  <Field HashSet e>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #51  <Method boolean HashSet.addAll(java.util.Collection)>
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

	public final void a(boolean flag)
	{
		long l = aw.l().a();
	//    0    0:invokestatic    #134 <Method e aw.l()>
	//    1    3:invokeinterface #139 <Method long e.a()>
	//    2    8:lstore_2        
		if(flag)
	//*   3    9:iload_1         
	//*   4   10:ifeq            77
		{
			long l1 = b.i();
	//    5   13:aload_0         
	//    6   14:getfield        #40  <Field xa b>
	//    7   17:invokeinterface #144 <Method long xa.i()>
	//    8   22:lstore          4
			com.google.android.gms.internal.ads.e e1 = p.av;
	//    9   24:getstatic       #150 <Field com.google.android.gms.internal.ads.e p.av>
	//   10   27:astore          6
			if(l - l1 > ((Long)com.google.android.gms.internal.ads.bwk.e().a(e1)).longValue())
	//*  11   29:lload_2         
	//*  12   30:lload           4
	//*  13   32:lsub            
	//*  14   33:invokestatic    #155 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*  15   36:aload           6
	//*  16   38:invokevirtual   #160 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  17   41:checkcast       #162 <Class Long>
	//*  18   44:invokevirtual   #165 <Method long Long.longValue()>
	//*  19   47:lcmp            
	//*  20   48:ifle            60
			{
				d.a = -1;
	//   21   51:aload_0         
	//   22   52:getfield        #38  <Field wn d>
	//   23   55:iconst_m1       
	//   24   56:putfield        #168 <Field int wn.a>
				return;
	//   25   59:return          
			} else
			{
				d.a = b.j();
	//   26   60:aload_0         
	//   27   61:getfield        #38  <Field wn d>
	//   28   64:aload_0         
	//   29   65:getfield        #40  <Field xa b>
	//   30   68:invokeinterface #172 <Method int xa.j()>
	//   31   73:putfield        #168 <Field int wn.a>
				return;
	//   32   76:return          
			}
		} else
		{
			b.a(l);
	//   33   77:aload_0         
	//   34   78:getfield        #40  <Field xa b>
	//   35   81:lload_2         
	//   36   82:invokeinterface #175 <Method void xa.a(long)>
			b.b(d.a);
	//   37   87:aload_0         
	//   38   88:getfield        #40  <Field xa b>
	//   39   91:aload_0         
	//   40   92:getfield        #38  <Field wn d>
	//   41   95:getfield        #168 <Field int wn.a>
	//   42   98:invokeinterface #178 <Method void xa.b(int)>
			return;
	//   43  103:return          
		}
	}

	public final void b()
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #25  <Field Object a>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			d.b();
	//    5    7:aload_0         
	//    6    8:getfield        #38  <Field wn d>
	//    7   11:invokevirtual   #180 <Method void wn.b()>
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

	private final Object a = new Object();
	private final xa b;
	private final wp c = new wp();
	private final wn d;
	private final HashSet e = new HashSet();
	private final HashSet f = new HashSet();
}
