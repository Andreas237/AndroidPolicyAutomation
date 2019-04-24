// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.birbit.android.jobqueue;

import com.birbit.android.jobqueue.log.JqLog;
import com.birbit.android.jobqueue.timer.Timer;
import java.util.*;

public class RunningJobSet
{

	public RunningJobSet(Timer timer1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #24  <Class TreeSet>
	//    4    8:dup             
	//    5    9:invokespecial   #25  <Method void TreeSet()>
	//    6   12:putfield        #27  <Field TreeSet internalSet>
	//    7   15:aload_0         
	//    8   16:new             #29  <Class HashMap>
	//    9   19:dup             
	//   10   20:invokespecial   #30  <Method void HashMap()>
	//   11   23:putfield        #32  <Field Map groupDelays>
		groupDelayTimeout = 0xffffffffL;
	//   12   26:aload_0         
	//   13   27:ldc2w           #33  <Long 0xffffffffL>
	//   14   30:putfield        #36  <Field long groupDelayTimeout>
		timer = timer1;
	//   15   33:aload_0         
	//   16   34:aload_1         
	//   17   35:putfield        #38  <Field Timer timer>
	//   18   38:return          
	}

	private long calculateNextDelayForGroups()
	{
		long l = 0xffffffffL;
	//    0    0:ldc2w           #33  <Long 0xffffffffL>
	//    1    3:lstore_1        
		Iterator iterator = groupDelays.values().iterator();
	//    2    4:aload_0         
	//    3    5:getfield        #32  <Field Map groupDelays>
	//    4    8:invokeinterface #47  <Method Collection Map.values()>
	//    5   13:invokeinterface #53  <Method Iterator Collection.iterator()>
	//    6   18:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    7   19:aload_3         
	//    8   20:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//    9   25:ifeq            58
			Long long1 = (Long)iterator.next();
	//   10   28:aload_3         
	//   11   29:invokeinterface #63  <Method Object Iterator.next()>
	//   12   34:checkcast       #65  <Class Long>
	//   13   37:astore          4
			if(long1.longValue() < l)
	//*  14   39:aload           4
	//*  15   41:invokevirtual   #68  <Method long Long.longValue()>
	//*  16   44:lload_1         
	//*  17   45:lcmp            
	//*  18   46:ifge            19
				l = long1.longValue();
	//   19   49:aload           4
	//   20   51:invokevirtual   #68  <Method long Long.longValue()>
	//   21   54:lstore_1        
		} while(true);
	//   22   55:goto            19
		return l;
	//   23   58:lload_1         
	//   24   59:lreturn         
	}

	public void add(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(s != null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnonnull       9
_L1:
		this;
	//    4    6:aload_0         
		JVM INSTR monitorexit ;
	//    5    7:monitorexit     
		return;
	//    6    8:return          
_L2:
		if(internalSet.add(((Object) (s))))
	//*   7    9:aload_0         
	//*   8   10:getfield        #27  <Field TreeSet internalSet>
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #73  <Method boolean TreeSet.add(Object)>
	//*  11   17:ifeq            6
			publicClone = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #75  <Field ArrayList publicClone>
		if(true) goto _L1; else goto _L3
	//   15   25:goto            6
_L3:
		s;
	//   16   28:astore_1        
	//*  17   29:aload_0         
		throw s;
	//   18   30:monitorexit     
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	public void addGroupUntil(String s, long l)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		Long long1;
		JqLog.d("add group delay to %s until %s", new Object[] {
			s, Long.valueOf(l)
		});
	//    2    2:ldc1            #79  <String "add group delay to %s until %s">
	//    3    4:iconst_2        
	//    4    5:anewarray       Object[]
	//    5    8:dup             
	//    6    9:iconst_0        
	//    7   10:aload_1         
	//    8   11:aastore         
	//    9   12:dup             
	//   10   13:iconst_1        
	//   11   14:lload_2         
	//   12   15:invokestatic    #83  <Method Long Long.valueOf(long)>
	//   13   18:aastore         
	//   14   19:invokestatic    #89  <Method void JqLog.d(String, Object[])>
		long1 = (Long)groupDelays.get(((Object) (s)));
	//   15   22:aload_0         
	//   16   23:getfield        #32  <Field Map groupDelays>
	//   17   26:aload_1         
	//   18   27:invokeinterface #93  <Method Object Map.get(Object)>
	//   19   32:checkcast       #65  <Class Long>
	//   20   35:astore          6
		if(long1 == null) goto _L2; else goto _L1
	//   21   37:aload           6
	//   22   39:ifnull          59
_L1:
		long l1 = long1.longValue();
	//   23   42:aload           6
	//   24   44:invokevirtual   #68  <Method long Long.longValue()>
	//   25   47:lstore          4
		if(l1 <= l) goto _L2; else goto _L3
	//   26   49:lload           4
	//   27   51:lload_2         
	//   28   52:lcmp            
	//   29   53:ifle            59
_L3:
		this;
	//   30   56:aload_0         
		JVM INSTR monitorexit ;
	//   31   57:monitorexit     
		return;
	//   32   58:return          
_L2:
		groupDelays.put(((Object) (s)), ((Object) (Long.valueOf(l))));
	//   33   59:aload_0         
	//   34   60:getfield        #32  <Field Map groupDelays>
	//   35   63:aload_1         
	//   36   64:lload_2         
	//   37   65:invokestatic    #83  <Method Long Long.valueOf(long)>
	//   38   68:invokeinterface #97  <Method Object Map.put(Object, Object)>
	//   39   73:pop             
		groupDelayTimeout = calculateNextDelayForGroups();
	//   40   74:aload_0         
	//   41   75:aload_0         
	//   42   76:invokespecial   #99  <Method long calculateNextDelayForGroups()>
	//   43   79:putfield        #36  <Field long groupDelayTimeout>
		publicClone = null;
	//   44   82:aload_0         
	//   45   83:aconst_null     
	//   46   84:putfield        #75  <Field ArrayList publicClone>
		if(true) goto _L3; else goto _L4
	//   47   87:goto            56
_L4:
		s;
	//   48   90:astore_1        
	//*  49   91:aload_0         
		throw s;
	//   50   92:monitorexit     
	//   51   93:aload_1         
	//   52   94:athrow          
	}

	public void clear()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		internalSet.clear();
	//    2    2:aload_0         
	//    3    3:getfield        #27  <Field TreeSet internalSet>
	//    4    6:invokevirtual   #102 <Method void TreeSet.clear()>
		groupDelays.clear();
	//    5    9:aload_0         
	//    6   10:getfield        #32  <Field Map groupDelays>
	//    7   13:invokeinterface #103 <Method void Map.clear()>
		publicClone = null;
	//    8   18:aload_0         
	//    9   19:aconst_null     
	//   10   20:putfield        #75  <Field ArrayList publicClone>
		this;
	//   11   23:aload_0         
		JVM INSTR monitorexit ;
	//   12   24:monitorexit     
		return;
	//   13   25:return          
		Exception exception;
		exception;
	//   14   26:astore_1        
	//*  15   27:aload_0         
		throw exception;
	//   16   28:monitorexit     
	//   17   29:aload_1         
	//   18   30:athrow          
	}

	public Long getNextDelayForGroups()
	{
		if(groupDelayTimeout == 0xffffffffL)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field long groupDelayTimeout>
	//*   2    4:ldc2w           #33  <Long 0xffffffffL>
	//*   3    7:lcmp            
	//*   4    8:ifne            13
			return null;
	//    5   11:aconst_null     
	//    6   12:areturn         
		else
			return Long.valueOf(groupDelayTimeout);
	//    7   13:aload_0         
	//    8   14:getfield        #36  <Field long groupDelayTimeout>
	//    9   17:invokestatic    #83  <Method Long Long.valueOf(long)>
	//   10   20:areturn         
	}

	public Collection getSafe()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		long l = timer.nanoTime();
	//    2    2:aload_0         
	//    3    3:getfield        #38  <Field Timer timer>
	//    4    6:invokeinterface #111 <Method long Timer.nanoTime()>
	//    5   11:lstore_1        
		if(publicClone != null && l <= groupDelayTimeout) goto _L2; else goto _L1
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field ArrayList publicClone>
	//    8   16:ifnull          28
	//    9   19:lload_1         
	//   10   20:aload_0         
	//   11   21:getfield        #36  <Field long groupDelayTimeout>
	//   12   24:lcmp            
	//   13   25:ifle            62
_L1:
		if(!groupDelays.isEmpty()) goto _L4; else goto _L3
	//   14   28:aload_0         
	//   15   29:getfield        #32  <Field Map groupDelays>
	//   16   32:invokeinterface #114 <Method boolean Map.isEmpty()>
	//   17   37:ifeq            71
_L3:
		publicClone = new ArrayList(((Collection) (internalSet)));
	//   18   40:aload_0         
	//   19   41:new             #116 <Class ArrayList>
	//   20   44:dup             
	//   21   45:aload_0         
	//   22   46:getfield        #27  <Field TreeSet internalSet>
	//   23   49:invokespecial   #119 <Method void ArrayList(Collection)>
	//   24   52:putfield        #75  <Field ArrayList publicClone>
		groupDelayTimeout = 0xffffffffL;
	//   25   55:aload_0         
	//   26   56:ldc2w           #33  <Long 0xffffffffL>
	//   27   59:putfield        #36  <Field long groupDelayTimeout>
_L2:
		Object obj = ((Object) (publicClone));
	//   28   62:aload_0         
	//   29   63:getfield        #75  <Field ArrayList publicClone>
	//   30   66:astore_3        
		this;
	//   31   67:aload_0         
		JVM INSTR monitorexit ;
	//   32   68:monitorexit     
		return ((Collection) (obj));
	//   33   69:aload_3         
	//   34   70:areturn         
_L4:
		Iterator iterator;
		obj = ((Object) (new TreeSet(((java.util.SortedSet) (internalSet)))));
	//   35   71:new             #24  <Class TreeSet>
	//   36   74:dup             
	//   37   75:aload_0         
	//   38   76:getfield        #27  <Field TreeSet internalSet>
	//   39   79:invokespecial   #122 <Method void TreeSet(java.util.SortedSet)>
	//   40   82:astore_3        
		iterator = groupDelays.entrySet().iterator();
	//   41   83:aload_0         
	//   42   84:getfield        #32  <Field Map groupDelays>
	//   43   87:invokeinterface #126 <Method Set Map.entrySet()>
	//   44   92:invokeinterface #129 <Method Iterator Set.iterator()>
	//   45   97:astore          4
_L5:
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_183;
	//   46   99:aload           4
	//   47  101:invokeinterface #59  <Method boolean Iterator.hasNext()>
	//   48  106:ifeq            183
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   49  109:aload           4
	//   50  111:invokeinterface #63  <Method Object Iterator.next()>
	//   51  116:checkcast       #131 <Class java.util.Map$Entry>
	//   52  119:astore          5
			if(((Long)entry.getValue()).longValue() <= l)
				break MISSING_BLOCK_LABEL_173;
	//   53  121:aload           5
	//   54  123:invokeinterface #134 <Method Object java.util.Map$Entry.getValue()>
	//   55  128:checkcast       #65  <Class Long>
	//   56  131:invokevirtual   #68  <Method long Long.longValue()>
	//   57  134:lload_1         
	//   58  135:lcmp            
	//   59  136:ifle            173
			if(!((TreeSet) (obj)).contains(entry.getKey()))
	//*  60  139:aload_3         
	//*  61  140:aload           5
	//*  62  142:invokeinterface #137 <Method Object java.util.Map$Entry.getKey()>
	//*  63  147:invokevirtual   #140 <Method boolean TreeSet.contains(Object)>
	//*  64  150:ifne            99
				((TreeSet) (obj)).add(entry.getKey());
	//   65  153:aload_3         
	//   66  154:aload           5
	//   67  156:invokeinterface #137 <Method Object java.util.Map$Entry.getKey()>
	//   68  161:invokevirtual   #73  <Method boolean TreeSet.add(Object)>
	//   69  164:pop             
		} while(true);
	//   70  165:goto            99
		obj;
	//   71  168:astore_3        
	//*  72  169:aload_0         
		throw obj;
	//   73  170:monitorexit     
	//   74  171:aload_3         
	//   75  172:athrow          
		iterator.remove();
	//   76  173:aload           4
	//   77  175:invokeinterface #143 <Method void Iterator.remove()>
		  goto _L5
	//*  78  180:goto            99
		publicClone = new ArrayList(((Collection) (obj)));
	//   79  183:aload_0         
	//   80  184:new             #116 <Class ArrayList>
	//   81  187:dup             
	//   82  188:aload_3         
	//   83  189:invokespecial   #119 <Method void ArrayList(Collection)>
	//   84  192:putfield        #75  <Field ArrayList publicClone>
		groupDelayTimeout = calculateNextDelayForGroups();
	//   85  195:aload_0         
	//   86  196:aload_0         
	//   87  197:invokespecial   #99  <Method long calculateNextDelayForGroups()>
	//   88  200:putfield        #36  <Field long groupDelayTimeout>
		  goto _L2
	//*  89  203:goto            62
	}

	public void remove(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		if(s != null) goto _L2; else goto _L1
	//    2    2:aload_1         
	//    3    3:ifnonnull       9
_L1:
		this;
	//    4    6:aload_0         
		JVM INSTR monitorexit ;
	//    5    7:monitorexit     
		return;
	//    6    8:return          
_L2:
		if(internalSet.remove(((Object) (s))))
	//*   7    9:aload_0         
	//*   8   10:getfield        #27  <Field TreeSet internalSet>
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #147 <Method boolean TreeSet.remove(Object)>
	//*  11   17:ifeq            6
			publicClone = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #75  <Field ArrayList publicClone>
		if(true) goto _L1; else goto _L3
	//   15   25:goto            6
_L3:
		s;
	//   16   28:astore_1        
	//*  17   29:aload_0         
		throw s;
	//   18   30:monitorexit     
	//   19   31:aload_1         
	//   20   32:athrow          
	}

	private long groupDelayTimeout;
	private final Map groupDelays = new HashMap();
	private final TreeSet internalSet = new TreeSet();
	private ArrayList publicClone;
	private final Timer timer;
}
