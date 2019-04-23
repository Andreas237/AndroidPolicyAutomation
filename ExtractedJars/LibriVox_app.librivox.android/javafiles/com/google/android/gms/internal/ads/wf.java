// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.common.util.e;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wr, wg, zzwb

public final class wf
{

	wf(e e1, wr wr1, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #33  <Method void Object()>
	//    6   12:putfield        #35  <Field Object d>
		g = -1L;
	//    7   15:aload_0         
	//    8   16:ldc2w           #36  <Long -1L>
	//    9   19:putfield        #39  <Field long g>
		h = -1L;
	//   10   22:aload_0         
	//   11   23:ldc2w           #36  <Long -1L>
	//   12   26:putfield        #41  <Field long h>
		i = false;
	//   13   29:aload_0         
	//   14   30:iconst_0        
	//   15   31:putfield        #43  <Field boolean i>
		j = -1L;
	//   16   34:aload_0         
	//   17   35:ldc2w           #36  <Long -1L>
	//   18   38:putfield        #45  <Field long j>
		k = 0L;
	//   19   41:aload_0         
	//   20   42:lconst_0        
	//   21   43:putfield        #47  <Field long k>
		l = -1L;
	//   22   46:aload_0         
	//   23   47:ldc2w           #36  <Long -1L>
	//   24   50:putfield        #49  <Field long l>
		m = -1L;
	//   25   53:aload_0         
	//   26   54:ldc2w           #36  <Long -1L>
	//   27   57:putfield        #51  <Field long m>
		a = e1;
	//   28   60:aload_0         
	//   29   61:aload_1         
	//   30   62:putfield        #53  <Field e a>
		b = wr1;
	//   31   65:aload_0         
	//   32   66:aload_2         
	//   33   67:putfield        #55  <Field wr b>
		e = s;
	//   34   70:aload_0         
	//   35   71:aload_3         
	//   36   72:putfield        #57  <Field String e>
		f = s1;
	//   37   75:aload_0         
	//   38   76:aload           4
	//   39   78:putfield        #59  <Field String f>
	//   40   81:aload_0         
	//   41   82:new             #61  <Class LinkedList>
	//   42   85:dup             
	//   43   86:invokespecial   #62  <Method void LinkedList()>
	//   44   89:putfield        #64  <Field LinkedList c>
	//   45   92:return          
	}

	static e a(wf wf1)
	{
		return wf1.a;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field e a>
	//    2    4:areturn         
	}

	public final void a()
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(m != -1L && h == -1L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #51  <Field long m>
	//*   7   11:ldc2w           #36  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            50
	//*  10   18:aload_0         
	//*  11   19:getfield        #41  <Field long h>
	//*  12   22:ldc2w           #36  <Long -1L>
	//*  13   25:lcmp            
	//*  14   26:ifne            50
			{
				h = a.b();
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #53  <Field e a>
	//   18   34:invokeinterface #71  <Method long e.b()>
	//   19   39:putfield        #41  <Field long h>
				b.a(this);
	//   20   42:aload_0         
	//   21   43:getfield        #55  <Field wr b>
	//   22   46:aload_0         
	//   23   47:invokevirtual   #76  <Method void wr.a(wf)>
			}
			b.b();
	//   24   50:aload_0         
	//   25   51:getfield        #55  <Field wr b>
	//   26   54:invokevirtual   #78  <Method void wr.b()>
		}
	//   27   57:aload_1         
	//   28   58:monitorexit     
		return;
	//   29   59:return          
		exception;
	//   30   60:astore_2        
		obj;
	//   31   61:aload_1         
		JVM INSTR monitorexit ;
	//   32   62:monitorexit     
		throw exception;
	//   33   63:aload_2         
	//   34   64:athrow          
	}

	public final void a(long l1)
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object d>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			m = l1;
	//    5    7:aload_0         
	//    6    8:lload_1         
	//    7    9:putfield        #51  <Field long m>
			if(m != -1L)
	//*   8   12:aload_0         
	//*   9   13:getfield        #51  <Field long m>
	//*  10   16:ldc2w           #36  <Long -1L>
	//*  11   19:lcmp            
	//*  12   20:ifeq            31
				b.a(this);
	//   13   23:aload_0         
	//   14   24:getfield        #55  <Field wr b>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #76  <Method void wr.a(wf)>
		}
	//   17   31:aload_3         
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		exception;
	//   20   34:astore          4
		obj;
	//   21   36:aload_3         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw exception;
	//   23   38:aload           4
	//   24   40:athrow          
	}

	public final void a(zzwb zzwb)
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object d>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			l = a.b();
	//    5    7:aload_0         
	//    6    8:aload_0         
	//    7    9:getfield        #53  <Field e a>
	//    8   12:invokeinterface #71  <Method long e.b()>
	//    9   17:putfield        #49  <Field long l>
			b.a(zzwb, l);
	//   10   20:aload_0         
	//   11   21:getfield        #55  <Field wr b>
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #49  <Field long l>
	//   15   29:invokevirtual   #83  <Method void wr.a(zzwb, long)>
		}
	//   16   32:aload_2         
	//   17   33:monitorexit     
		return;
	//   18   34:return          
		zzwb;
	//   19   35:astore_1        
		obj;
	//   20   36:aload_2         
		JVM INSTR monitorexit ;
	//   21   37:monitorexit     
		throw zzwb;
	//   22   38:aload_1         
	//   23   39:athrow          
	}

	public final void a(boolean flag)
	{
		Object obj = d;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object d>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(m == -1L)
			break MISSING_BLOCK_LABEL_51;
	//    5    7:aload_0         
	//    6    8:getfield        #51  <Field long m>
	//    7   11:ldc2w           #36  <Long -1L>
	//    8   14:lcmp            
	//    9   15:ifeq            51
		j = a.b();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #53  <Field e a>
	//   13   23:invokeinterface #71  <Method long e.b()>
	//   14   28:putfield        #45  <Field long j>
		if(flag)
			break MISSING_BLOCK_LABEL_51;
	//   15   31:iload_1         
	//   16   32:ifne            51
		h = j;
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #45  <Field long j>
	//   20   40:putfield        #41  <Field long h>
		b.a(this);
	//   21   43:aload_0         
	//   22   44:getfield        #55  <Field wr b>
	//   23   47:aload_0         
	//   24   48:invokevirtual   #76  <Method void wr.a(wf)>
		obj;
	//   25   51:aload_2         
		JVM INSTR monitorexit ;
	//   26   52:monitorexit     
		return;
	//   27   53:return          
		Exception exception;
		exception;
	//   28   54:astore_3        
		obj;
	//   29   55:aload_2         
		JVM INSTR monitorexit ;
	//   30   56:monitorexit     
		throw exception;
	//   31   57:aload_3         
	//   32   58:athrow          
	}

	public final void b()
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(m != -1L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #51  <Field long m>
	//*   7   11:ldc2w           #36  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            65
			{
				wg wg1 = new wg(this);
	//   10   18:new             #86  <Class wg>
	//   11   21:dup             
	//   12   22:aload_0         
	//   13   23:invokespecial   #88  <Method void wg(wf)>
	//   14   26:astore_2        
				wg1.c();
	//   15   27:aload_2         
	//   16   28:invokevirtual   #90  <Method void wg.c()>
				c.add(((Object) (wg1)));
	//   17   31:aload_0         
	//   18   32:getfield        #64  <Field LinkedList c>
	//   19   35:aload_2         
	//   20   36:invokevirtual   #94  <Method boolean LinkedList.add(Object)>
	//   21   39:pop             
				k = k + 1L;
	//   22   40:aload_0         
	//   23   41:aload_0         
	//   24   42:getfield        #47  <Field long k>
	//   25   45:lconst_1        
	//   26   46:ladd            
	//   27   47:putfield        #47  <Field long k>
				b.a();
	//   28   50:aload_0         
	//   29   51:getfield        #55  <Field wr b>
	//   30   54:invokevirtual   #96  <Method void wr.a()>
				b.a(this);
	//   31   57:aload_0         
	//   32   58:getfield        #55  <Field wr b>
	//   33   61:aload_0         
	//   34   62:invokevirtual   #76  <Method void wr.a(wf)>
			}
		}
	//   35   65:aload_1         
	//   36   66:monitorexit     
		return;
	//   37   67:return          
		exception;
	//   38   68:astore_2        
		obj;
	//   39   69:aload_1         
		JVM INSTR monitorexit ;
	//   40   70:monitorexit     
		throw exception;
	//   41   71:aload_2         
	//   42   72:athrow          
	}

	public final void b(long l1)
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object d>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			if(m != -1L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #51  <Field long m>
	//*   7   11:ldc2w           #36  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            31
			{
				g = l1;
	//   10   18:aload_0         
	//   11   19:lload_1         
	//   12   20:putfield        #39  <Field long g>
				b.a(this);
	//   13   23:aload_0         
	//   14   24:getfield        #55  <Field wr b>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #76  <Method void wr.a(wf)>
			}
		}
	//   17   31:aload_3         
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		exception;
	//   20   34:astore          4
		obj;
	//   21   36:aload_3         
		JVM INSTR monitorexit ;
	//   22   37:monitorexit     
		throw exception;
	//   23   38:aload           4
	//   24   40:athrow          
	}

	public final void b(boolean flag)
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object d>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(m != -1L)
	//*   5    7:aload_0         
	//*   6    8:getfield        #51  <Field long m>
	//*   7   11:ldc2w           #36  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            31
			{
				i = flag;
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:putfield        #43  <Field boolean i>
				b.a(this);
	//   13   23:aload_0         
	//   14   24:getfield        #55  <Field wr b>
	//   15   27:aload_0         
	//   16   28:invokevirtual   #76  <Method void wr.a(wf)>
			}
		}
	//   17   31:aload_2         
	//   18   32:monitorexit     
		return;
	//   19   33:return          
		exception;
	//   20   34:astore_3        
		obj;
	//   21   35:aload_2         
		JVM INSTR monitorexit ;
	//   22   36:monitorexit     
		throw exception;
	//   23   37:aload_3         
	//   24   38:athrow          
	}

	public final void c()
	{
		synchronized(d)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object d>
	//*   2    4:astore_1        
	//*   3    5:aload_1         
	//*   4    6:monitorenter    
		{
			if(m != -1L && !c.isEmpty())
	//*   5    7:aload_0         
	//*   6    8:getfield        #51  <Field long m>
	//*   7   11:ldc2w           #36  <Long -1L>
	//*   8   14:lcmp            
	//*   9   15:ifeq            62
	//*  10   18:aload_0         
	//*  11   19:getfield        #64  <Field LinkedList c>
	//*  12   22:invokevirtual   #100 <Method boolean LinkedList.isEmpty()>
	//*  13   25:ifne            62
			{
				wg wg1 = (wg)c.getLast();
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field LinkedList c>
	//   16   32:invokevirtual   #104 <Method Object LinkedList.getLast()>
	//   17   35:checkcast       #86  <Class wg>
	//   18   38:astore_2        
				if(wg1.a() == -1L)
	//*  19   39:aload_2         
	//*  20   40:invokevirtual   #106 <Method long wg.a()>
	//*  21   43:ldc2w           #36  <Long -1L>
	//*  22   46:lcmp            
	//*  23   47:ifne            62
				{
					wg1.b();
	//   24   50:aload_2         
	//   25   51:invokevirtual   #107 <Method void wg.b()>
					b.a(this);
	//   26   54:aload_0         
	//   27   55:getfield        #55  <Field wr b>
	//   28   58:aload_0         
	//   29   59:invokevirtual   #76  <Method void wr.a(wf)>
				}
			}
		}
	//   30   62:aload_1         
	//   31   63:monitorexit     
		return;
	//   32   64:return          
		exception;
	//   33   65:astore_2        
		obj;
	//   34   66:aload_1         
		JVM INSTR monitorexit ;
	//   35   67:monitorexit     
		throw exception;
	//   36   68:aload_2         
	//   37   69:athrow          
	}

	public final Bundle d()
	{
		Object obj = d;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Object d>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Bundle bundle;
		ArrayList arraylist;
		bundle = new Bundle();
	//    5    7:new             #110 <Class Bundle>
	//    6   10:dup             
	//    7   11:invokespecial   #111 <Method void Bundle()>
	//    8   14:astore_2        
		bundle.putString("seq_num", e);
	//    9   15:aload_2         
	//   10   16:ldc1            #113 <String "seq_num">
	//   11   18:aload_0         
	//   12   19:getfield        #57  <Field String e>
	//   13   22:invokevirtual   #117 <Method void Bundle.putString(String, String)>
		bundle.putString("slotid", f);
	//   14   25:aload_2         
	//   15   26:ldc1            #119 <String "slotid">
	//   16   28:aload_0         
	//   17   29:getfield        #59  <Field String f>
	//   18   32:invokevirtual   #117 <Method void Bundle.putString(String, String)>
		bundle.putBoolean("ismediation", i);
	//   19   35:aload_2         
	//   20   36:ldc1            #121 <String "ismediation">
	//   21   38:aload_0         
	//   22   39:getfield        #43  <Field boolean i>
	//   23   42:invokevirtual   #125 <Method void Bundle.putBoolean(String, boolean)>
		bundle.putLong("treq", l);
	//   24   45:aload_2         
	//   25   46:ldc1            #127 <String "treq">
	//   26   48:aload_0         
	//   27   49:getfield        #49  <Field long l>
	//   28   52:invokevirtual   #131 <Method void Bundle.putLong(String, long)>
		bundle.putLong("tresponse", m);
	//   29   55:aload_2         
	//   30   56:ldc1            #133 <String "tresponse">
	//   31   58:aload_0         
	//   32   59:getfield        #51  <Field long m>
	//   33   62:invokevirtual   #131 <Method void Bundle.putLong(String, long)>
		bundle.putLong("timp", h);
	//   34   65:aload_2         
	//   35   66:ldc1            #135 <String "timp">
	//   36   68:aload_0         
	//   37   69:getfield        #41  <Field long h>
	//   38   72:invokevirtual   #131 <Method void Bundle.putLong(String, long)>
		bundle.putLong("tload", j);
	//   39   75:aload_2         
	//   40   76:ldc1            #137 <String "tload">
	//   41   78:aload_0         
	//   42   79:getfield        #45  <Field long j>
	//   43   82:invokevirtual   #131 <Method void Bundle.putLong(String, long)>
		bundle.putLong("pcc", k);
	//   44   85:aload_2         
	//   45   86:ldc1            #139 <String "pcc">
	//   46   88:aload_0         
	//   47   89:getfield        #47  <Field long k>
	//   48   92:invokevirtual   #131 <Method void Bundle.putLong(String, long)>
		bundle.putLong("tfetch", g);
	//   49   95:aload_2         
	//   50   96:ldc1            #141 <String "tfetch">
	//   51   98:aload_0         
	//   52   99:getfield        #39  <Field long g>
	//   53  102:invokevirtual   #131 <Method void Bundle.putLong(String, long)>
		arraylist = new ArrayList();
	//   54  105:new             #143 <Class ArrayList>
	//   55  108:dup             
	//   56  109:invokespecial   #144 <Method void ArrayList()>
	//   57  112:astore_3        
		for(Iterator iterator = c.iterator(); iterator.hasNext(); arraylist.add(((Object) (((wg)iterator.next()).d()))));
	//   58  113:aload_0         
	//   59  114:getfield        #64  <Field LinkedList c>
	//   60  117:invokevirtual   #148 <Method Iterator LinkedList.iterator()>
	//   61  120:astore          4
	//   62  122:aload           4
	//   63  124:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//   64  129:ifeq            153
	//   65  132:aload_3         
	//   66  133:aload           4
	//   67  135:invokeinterface #156 <Method Object Iterator.next()>
	//   68  140:checkcast       #86  <Class wg>
	//   69  143:invokevirtual   #158 <Method Bundle wg.d()>
	//   70  146:invokevirtual   #159 <Method boolean ArrayList.add(Object)>
	//   71  149:pop             
	//*  72  150:goto            122
		bundle.putParcelableArrayList("tclick", arraylist);
	//   73  153:aload_2         
	//   74  154:ldc1            #161 <String "tclick">
	//   75  156:aload_3         
	//   76  157:invokevirtual   #165 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		obj;
	//   77  160:aload_1         
		JVM INSTR monitorexit ;
	//   78  161:monitorexit     
		return bundle;
	//   79  162:aload_2         
	//   80  163:areturn         
		Exception exception;
		exception;
	//   81  164:astore_2        
		obj;
	//   82  165:aload_1         
		JVM INSTR monitorexit ;
	//   83  166:monitorexit     
		throw exception;
	//   84  167:aload_2         
	//   85  168:athrow          
	}

	public final String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String e>
	//    2    4:areturn         
	}

	private final e a;
	private final wr b;
	private final LinkedList c = new LinkedList();
	private final Object d = new Object();
	private final String e;
	private final String f;
	private long g;
	private long h;
	private boolean i;
	private long j;
	private long k;
	private long l;
	private long m;
}
