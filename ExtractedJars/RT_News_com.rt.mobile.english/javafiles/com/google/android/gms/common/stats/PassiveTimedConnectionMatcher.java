// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.stats;

import android.os.SystemClock;
import android.support.v4.util.SimpleArrayMap;
import android.util.Log;

public class PassiveTimedConnectionMatcher
{

	public PassiveTimedConnectionMatcher()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzym = 60000L;
	//    2    4:aload_0         
	//    3    5:ldc2w           #16  <Long 60000L>
	//    4    8:putfield        #19  <Field long zzym>
		zzyn = 10;
	//    5   11:aload_0         
	//    6   12:bipush          10
	//    7   14:putfield        #21  <Field int zzyn>
		zzyo = new SimpleArrayMap(10);
	//    8   17:aload_0         
	//    9   18:new             #23  <Class SimpleArrayMap>
	//   10   21:dup             
	//   11   22:bipush          10
	//   12   24:invokespecial   #26  <Method void SimpleArrayMap(int)>
	//   13   27:putfield        #28  <Field SimpleArrayMap zzyo>
	//   14   30:return          
	}

	public PassiveTimedConnectionMatcher(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzym = l;
	//    2    4:aload_0         
	//    3    5:lload_2         
	//    4    6:putfield        #19  <Field long zzym>
		zzyn = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #21  <Field int zzyn>
		zzyo = new SimpleArrayMap();
	//    8   14:aload_0         
	//    9   15:new             #23  <Class SimpleArrayMap>
	//   10   18:dup             
	//   11   19:invokespecial   #31  <Method void SimpleArrayMap()>
	//   12   22:putfield        #28  <Field SimpleArrayMap zzyo>
	//   13   25:return          
	}

	public Long get(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		s = ((String) ((Long)zzyo.get(((Object) (s)))));
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field SimpleArrayMap zzyo>
	//    4    6:aload_1         
	//    5    7:invokevirtual   #36  <Method Object SimpleArrayMap.get(Object)>
	//    6   10:checkcast       #38  <Class Long>
	//    7   13:astore_1        
		this;
	//    8   14:aload_0         
		JVM INSTR monitorexit ;
	//    9   15:monitorexit     
		return ((Long) (s));
	//   10   16:aload_1         
	//   11   17:areturn         
		s;
	//   12   18:astore_1        
		this;
	//   13   19:aload_0         
		JVM INSTR monitorexit ;
	//   14   20:monitorexit     
		throw s;
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public Long put(String s)
	{
		long l1 = SystemClock.elapsedRealtime();
	//    0    0:invokestatic    #45  <Method long SystemClock.elapsedRealtime()>
	//    1    3:lstore          5
		long l = zzym;
	//    2    5:aload_0         
	//    3    6:getfield        #19  <Field long zzym>
	//    4    9:lstore_3        
		this;
	//    5   10:aload_0         
		JVM INSTR monitorenter ;
	//    6   11:monitorenter    
_L3:
		if(zzyo.size() < zzyn) goto _L2; else goto _L1
	//    7   12:aload_0         
	//    8   13:getfield        #28  <Field SimpleArrayMap zzyo>
	//    9   16:invokevirtual   #49  <Method int SimpleArrayMap.size()>
	//   10   19:aload_0         
	//   11   20:getfield        #21  <Field int zzyn>
	//   12   23:icmplt          140
_L1:
		int i = zzyo.size() - 1;
	//   13   26:aload_0         
	//   14   27:getfield        #28  <Field SimpleArrayMap zzyo>
	//   15   30:invokevirtual   #49  <Method int SimpleArrayMap.size()>
	//   16   33:iconst_1        
	//   17   34:isub            
	//   18   35:istore_2        
_L4:
		if(i < 0)
			break MISSING_BLOCK_LABEL_74;
	//   19   36:iload_2         
	//   20   37:iflt            74
		if(l1 - ((Long)zzyo.valueAt(i)).longValue() > l)
	//*  21   40:lload           5
	//*  22   42:aload_0         
	//*  23   43:getfield        #28  <Field SimpleArrayMap zzyo>
	//*  24   46:iload_2         
	//*  25   47:invokevirtual   #53  <Method Object SimpleArrayMap.valueAt(int)>
	//*  26   50:checkcast       #38  <Class Long>
	//*  27   53:invokevirtual   #56  <Method long Long.longValue()>
	//*  28   56:lsub            
	//*  29   57:lload_3         
	//*  30   58:lcmp            
	//*  31   59:ifle            166
			zzyo.removeAt(i);
	//   32   62:aload_0         
	//   33   63:getfield        #28  <Field SimpleArrayMap zzyo>
	//   34   66:iload_2         
	//   35   67:invokevirtual   #59  <Method Object SimpleArrayMap.removeAt(int)>
	//   36   70:pop             
		break MISSING_BLOCK_LABEL_166;
	//   37   71:goto            166
		l /= 2L;
	//   38   74:lload_3         
	//   39   75:ldc2w           #60  <Long 2L>
	//   40   78:ldiv            
	//   41   79:lstore_3        
		i = zzyn;
	//   42   80:aload_0         
	//   43   81:getfield        #21  <Field int zzyn>
	//   44   84:istore_2        
		StringBuilder stringbuilder = new StringBuilder(94);
	//   45   85:new             #63  <Class StringBuilder>
	//   46   88:dup             
	//   47   89:bipush          94
	//   48   91:invokespecial   #64  <Method void StringBuilder(int)>
	//   49   94:astore          7
		stringbuilder.append("The max capacity ");
	//   50   96:aload           7
	//   51   98:ldc1            #66  <String "The max capacity ">
	//   52  100:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   53  103:pop             
		stringbuilder.append(i);
	//   54  104:aload           7
	//   55  106:iload_2         
	//   56  107:invokevirtual   #73  <Method StringBuilder StringBuilder.append(int)>
	//   57  110:pop             
		stringbuilder.append(" is not enough. Current durationThreshold is: ");
	//   58  111:aload           7
	//   59  113:ldc1            #75  <String " is not enough. Current durationThreshold is: ">
	//   60  115:invokevirtual   #70  <Method StringBuilder StringBuilder.append(String)>
	//   61  118:pop             
		stringbuilder.append(l);
	//   62  119:aload           7
	//   63  121:lload_3         
	//   64  122:invokevirtual   #78  <Method StringBuilder StringBuilder.append(long)>
	//   65  125:pop             
		Log.w("ConnectionTracker", stringbuilder.toString());
	//   66  126:ldc1            #80  <String "ConnectionTracker">
	//   67  128:aload           7
	//   68  130:invokevirtual   #84  <Method String StringBuilder.toString()>
	//   69  133:invokestatic    #90  <Method int Log.w(String, String)>
	//   70  136:pop             
		  goto _L3
	//*  71  137:goto            12
_L2:
		s = ((String) ((Long)zzyo.put(((Object) (s)), ((Object) (Long.valueOf(l1))))));
	//   72  140:aload_0         
	//   73  141:getfield        #28  <Field SimpleArrayMap zzyo>
	//   74  144:aload_1         
	//   75  145:lload           5
	//   76  147:invokestatic    #94  <Method Long Long.valueOf(long)>
	//   77  150:invokevirtual   #97  <Method Object SimpleArrayMap.put(Object, Object)>
	//   78  153:checkcast       #38  <Class Long>
	//   79  156:astore_1        
		this;
	//   80  157:aload_0         
		JVM INSTR monitorexit ;
	//   81  158:monitorexit     
		return ((Long) (s));
	//   82  159:aload_1         
	//   83  160:areturn         
		s;
	//   84  161:astore_1        
		this;
	//   85  162:aload_0         
		JVM INSTR monitorexit ;
	//   86  163:monitorexit     
		throw s;
	//   87  164:aload_1         
	//   88  165:athrow          
		i--;
	//   89  166:iload_2         
	//   90  167:iconst_1        
	//   91  168:isub            
	//   92  169:istore_2        
		  goto _L4
	//*  93  170:goto            36
	}

	public boolean remove(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		boolean flag;
		if(zzyo.remove(((Object) (s))) != null)
	//*   2    2:aload_0         
	//*   3    3:getfield        #28  <Field SimpleArrayMap zzyo>
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #101 <Method Object SimpleArrayMap.remove(Object)>
	//*   6   10:ifnull          27
			flag = true;
	//    7   13:iconst_1        
	//    8   14:istore_2        
		else
	//*   9   15:goto            18
	//*  10   18:aload_0         
	//*  11   19:monitorexit     
	//*  12   20:iload_2         
	//*  13   21:ireturn         
	//*  14   22:astore_1        
	//*  15   23:aload_0         
	//*  16   24:monitorexit     
	//*  17   25:aload_1         
	//*  18   26:athrow          
			flag = false;
	//   19   27:iconst_0        
	//   20   28:istore_2        
		this;
		JVM INSTR monitorexit ;
		return flag;
		s;
		this;
		JVM INSTR monitorexit ;
		throw s;
	//*  21   29:goto            18
	}

	public boolean removeByPrefix(String s)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i;
		boolean flag;
		i = 0;
	//    2    2:iconst_0        
	//    3    3:istore_2        
		flag = false;
	//    4    4:iconst_0        
	//    5    5:istore_3        
_L2:
		String s1;
		if(i >= size())
			break MISSING_BLOCK_LABEL_63;
	//    6    6:iload_2         
	//    7    7:aload_0         
	//    8    8:invokevirtual   #103 <Method int size()>
	//    9   11:icmpge          63
		s1 = (String)zzyo.keyAt(i);
	//   10   14:aload_0         
	//   11   15:getfield        #28  <Field SimpleArrayMap zzyo>
	//   12   18:iload_2         
	//   13   19:invokevirtual   #106 <Method Object SimpleArrayMap.keyAt(int)>
	//   14   22:checkcast       #108 <Class String>
	//   15   25:astore          5
		boolean flag1;
		flag1 = flag;
	//   16   27:iload_3         
	//   17   28:istore          4
		if(s1 == null)
			break MISSING_BLOCK_LABEL_72;
	//   18   30:aload           5
	//   19   32:ifnull          72
		flag1 = flag;
	//   20   35:iload_3         
	//   21   36:istore          4
		if(!s1.startsWith(s))
			break MISSING_BLOCK_LABEL_72;
	//   22   38:aload           5
	//   23   40:aload_1         
	//   24   41:invokevirtual   #111 <Method boolean String.startsWith(String)>
	//   25   44:ifeq            72
		zzyo.remove(((Object) (s1)));
	//   26   47:aload_0         
	//   27   48:getfield        #28  <Field SimpleArrayMap zzyo>
	//   28   51:aload           5
	//   29   53:invokevirtual   #101 <Method Object SimpleArrayMap.remove(Object)>
	//   30   56:pop             
		flag1 = true;
	//   31   57:iconst_1        
	//   32   58:istore          4
		break MISSING_BLOCK_LABEL_72;
	//   33   60:goto            72
		this;
	//   34   63:aload_0         
		JVM INSTR monitorexit ;
	//   35   64:monitorexit     
		return flag;
	//   36   65:iload_3         
	//   37   66:ireturn         
		s;
	//   38   67:astore_1        
		this;
	//   39   68:aload_0         
		JVM INSTR monitorexit ;
	//   40   69:monitorexit     
		throw s;
	//   41   70:aload_1         
	//   42   71:athrow          
		i++;
	//   43   72:iload_2         
	//   44   73:iconst_1        
	//   45   74:iadd            
	//   46   75:istore_2        
		flag = flag1;
	//   47   76:iload           4
	//   48   78:istore_3        
		if(true) goto _L2; else goto _L1
	//   49   79:goto            6
_L1:
	}

	public int size()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		int i = zzyo.size();
	//    2    2:aload_0         
	//    3    3:getfield        #28  <Field SimpleArrayMap zzyo>
	//    4    6:invokevirtual   #49  <Method int SimpleArrayMap.size()>
	//    5    9:istore_1        
		this;
	//    6   10:aload_0         
		JVM INSTR monitorexit ;
	//    7   11:monitorexit     
		return i;
	//    8   12:iload_1         
	//    9   13:ireturn         
		Exception exception;
		exception;
	//   10   14:astore_2        
		this;
	//   11   15:aload_0         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_2         
	//   14   18:athrow          
	}

	private final long zzym;
	private final int zzyn;
	private final SimpleArrayMap zzyo;
}
