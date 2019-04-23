// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.aw;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			wx, bqj, wi, xa

public final class bqk
{

	public bqk()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #4   <Class Object>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Object()>
	//    6   12:putfield        #18  <Field Object a>
		c = ((List) (new LinkedList()));
	//    7   15:aload_0         
	//    8   16:new             #20  <Class LinkedList>
	//    9   19:dup             
	//   10   20:invokespecial   #21  <Method void LinkedList()>
	//   11   23:putfield        #23  <Field List c>
	//   12   26:return          
	}

	public final bqj a()
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object a>
	//    2    4:astore          8
		obj;
	//    3    6:aload           8
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int i = c.size();
	//    5    9:aload_0         
	//    6   10:getfield        #23  <Field List c>
	//    7   13:invokeinterface #31  <Method int List.size()>
	//    8   18:istore_1        
		bqj bqj1;
		bqj1 = null;
	//    9   19:aconst_null     
	//   10   20:astore          6
		if(i != 0)
			break MISSING_BLOCK_LABEL_36;
	//   11   22:iload_1         
	//   12   23:ifne            36
		wx.b("Queue empty");
	//   13   26:ldc1            #33  <String "Queue empty">
	//   14   28:invokestatic    #38  <Method void wx.b(String)>
		obj;
	//   15   31:aload           8
		JVM INSTR monitorexit ;
	//   16   33:monitorexit     
		return null;
	//   17   34:aconst_null     
	//   18   35:areturn         
		i = c.size();
	//   19   36:aload_0         
	//   20   37:getfield        #23  <Field List c>
	//   21   40:invokeinterface #31  <Method int List.size()>
	//   22   45:istore_1        
		int l = 0;
	//   23   46:iconst_0        
	//   24   47:istore          4
		if(i < 2) goto _L2; else goto _L1
	//   25   49:iload_1         
	//   26   50:iconst_2        
	//   27   51:icmplt          138
_L1:
		int k = 0x80000000;
	//   28   54:ldc1            #39  <Int 0x80000000>
	//   29   56:istore_3        
		Iterator iterator = c.iterator();
	//   30   57:aload_0         
	//   31   58:getfield        #23  <Field List c>
	//   32   61:invokeinterface #43  <Method Iterator List.iterator()>
	//   33   66:astore          9
		i = 0;
	//   34   68:iconst_0        
	//   35   69:istore_1        
_L4:
		int i1;
		bqj bqj2;
		if(!iterator.hasNext())
			break MISSING_BLOCK_LABEL_120;
	//   36   70:aload           9
	//   37   72:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   38   77:ifeq            120
		bqj2 = (bqj)iterator.next();
	//   39   80:aload           9
	//   40   82:invokeinterface #53  <Method Object Iterator.next()>
	//   41   87:checkcast       #55  <Class bqj>
	//   42   90:astore          7
		i1 = bqj2.i();
	//   43   92:aload           7
	//   44   94:invokevirtual   #58  <Method int bqj.i()>
	//   45   97:istore          5
		int j = k;
	//   46   99:iload_3         
	//   47  100:istore_2        
		Exception exception;
		if(i1 > k)
	//*  48  101:iload           5
	//*  49  103:iload_3         
	//*  50  104:icmple          172
		{
			l = i;
	//   51  107:iload_1         
	//   52  108:istore          4
			bqj1 = bqj2;
	//   53  110:aload           7
	//   54  112:astore          6
			j = i1;
	//   55  114:iload           5
	//   56  116:istore_2        
		}
	//*  57  117:goto            172
	//*  58  120:aload_0         
	//*  59  121:getfield        #23  <Field List c>
	//*  60  124:iload           4
	//*  61  126:invokeinterface #62  <Method Object List.remove(int)>
	//*  62  131:pop             
	//*  63  132:aload           8
	//*  64  134:monitorexit     
	//*  65  135:aload           6
	//*  66  137:areturn         
	//*  67  138:aload_0         
	//*  68  139:getfield        #23  <Field List c>
	//*  69  142:iconst_0        
	//*  70  143:invokeinterface #65  <Method Object List.get(int)>
	//*  71  148:checkcast       #55  <Class bqj>
	//*  72  151:astore          6
	//*  73  153:aload           6
	//*  74  155:invokevirtual   #68  <Method void bqj.e()>
	//*  75  158:aload           8
	//*  76  160:monitorexit     
	//*  77  161:aload           6
	//*  78  163:areturn         
	//*  79  164:astore          6
	//*  80  166:aload           8
	//*  81  168:monitorexit     
	//*  82  169:aload           6
	//*  83  171:athrow          
		i++;
	//   84  172:iload_1         
	//   85  173:iconst_1        
	//   86  174:iadd            
	//   87  175:istore_1        
		k = j;
	//   88  176:iload_2         
	//   89  177:istore_3        
		continue; /* Loop/switch isn't completed */
	//   90  178:goto            70
		c.remove(l);
		obj;
		JVM INSTR monitorexit ;
		return bqj1;
_L2:
		bqj1 = (bqj)c.get(0);
		bqj1.e();
		obj;
		JVM INSTR monitorexit ;
		return bqj1;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
		if(true) goto _L4; else goto _L3
_L3:
	}

	public final boolean a(bqj bqj1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		if(c.contains(((Object) (bqj1))))
	//*   5    7:aload_0         
	//*   6    8:getfield        #23  <Field List c>
	//*   7   11:aload_1         
	//*   8   12:invokeinterface #73  <Method boolean List.contains(Object)>
	//*   9   17:ifeq            24
	//*  10   20:aload_2         
	//*  11   21:monitorexit     
			return true;
	//   12   22:iconst_1        
	//   13   23:ireturn         
		obj;
	//   14   24:aload_2         
		JVM INSTR monitorexit ;
	//   15   25:monitorexit     
		return false;
	//   16   26:iconst_0        
	//   17   27:ireturn         
		bqj1;
	//   18   28:astore_1        
		obj;
	//   19   29:aload_2         
		JVM INSTR monitorexit ;
	//   20   30:monitorexit     
		throw bqj1;
	//   21   31:aload_1         
	//   22   32:athrow          
	}

	public final boolean b(bqj bqj1)
	{
		Object obj = a;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Object a>
	//    2    4:astore_2        
		obj;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Iterator iterator = c.iterator();
	//    5    7:aload_0         
	//    6    8:getfield        #23  <Field List c>
	//    7   11:invokeinterface #43  <Method Iterator List.iterator()>
	//    8   16:astore_3        
_L2:
		bqj bqj2;
		do
		{
			if(!iterator.hasNext())
				break MISSING_BLOCK_LABEL_127;
	//    9   17:aload_3         
	//   10   18:invokeinterface #49  <Method boolean Iterator.hasNext()>
	//   11   23:ifeq            127
			bqj2 = (bqj)iterator.next();
	//   12   26:aload_3         
	//   13   27:invokeinterface #53  <Method Object Iterator.next()>
	//   14   32:checkcast       #55  <Class bqj>
	//   15   35:astore          4
			if(aw.i().k().b())
				continue; /* Loop/switch isn't completed */
	//   16   37:invokestatic    #78  <Method wi aw.i()>
	//   17   40:invokevirtual   #84  <Method xa wi.k()>
	//   18   43:invokeinterface #88  <Method boolean xa.b()>
	//   19   48:ifne            82
		} while(bqj1 == bqj2);
	//   20   51:aload_1         
	//   21   52:aload           4
	//   22   54:if_acmpeq       17
		if(!bqj2.b().equals(((Object) (bqj1.b())))) goto _L2; else goto _L1
	//   23   57:aload           4
	//   24   59:invokevirtual   #91  <Method String bqj.b()>
	//   25   62:aload_1         
	//   26   63:invokevirtual   #91  <Method String bqj.b()>
	//   27   66:invokevirtual   #96  <Method boolean String.equals(Object)>
	//   28   69:ifeq            17
_L1:
		iterator.remove();
	//   29   72:aload_3         
	//   30   73:invokeinterface #98  <Method void Iterator.remove()>
		obj;
	//   31   78:aload_2         
		JVM INSTR monitorexit ;
	//   32   79:monitorexit     
		return true;
	//   33   80:iconst_1        
	//   34   81:ireturn         
		if(aw.i().k().d() || bqj1 == bqj2) goto _L2; else goto _L3
	//   35   82:invokestatic    #78  <Method wi aw.i()>
	//   36   85:invokevirtual   #84  <Method xa wi.k()>
	//   37   88:invokeinterface #101 <Method boolean xa.d()>
	//   38   93:ifne            17
	//   39   96:aload_1         
	//   40   97:aload           4
	//   41   99:if_acmpeq       17
_L3:
		if(!bqj2.d().equals(((Object) (bqj1.d())))) goto _L2; else goto _L4
	//   42  102:aload           4
	//   43  104:invokevirtual   #103 <Method String bqj.d()>
	//   44  107:aload_1         
	//   45  108:invokevirtual   #103 <Method String bqj.d()>
	//   46  111:invokevirtual   #96  <Method boolean String.equals(Object)>
	//   47  114:ifeq            17
_L4:
		iterator.remove();
	//   48  117:aload_3         
	//   49  118:invokeinterface #98  <Method void Iterator.remove()>
		obj;
	//   50  123:aload_2         
		JVM INSTR monitorexit ;
	//   51  124:monitorexit     
		return true;
	//   52  125:iconst_1        
	//   53  126:ireturn         
		obj;
	//   54  127:aload_2         
		JVM INSTR monitorexit ;
	//   55  128:monitorexit     
		return false;
	//   56  129:iconst_0        
	//   57  130:ireturn         
		bqj1;
	//   58  131:astore_1        
		obj;
	//   59  132:aload_2         
		JVM INSTR monitorexit ;
	//   60  133:monitorexit     
		throw bqj1;
	//   61  134:aload_1         
	//   62  135:athrow          
	}

	public final void c(bqj bqj1)
	{
		synchronized(a)
	//*   0    0:aload_0         
	//*   1    1:getfield        #18  <Field Object a>
	//*   2    4:astore_3        
	//*   3    5:aload_3         
	//*   4    6:monitorenter    
		{
			if(c.size() >= 10)
	//*   5    7:aload_0         
	//*   6    8:getfield        #23  <Field List c>
	//*   7   11:invokeinterface #31  <Method int List.size()>
	//*   8   16:bipush          10
	//*   9   18:icmplt          76
			{
				int i = c.size();
	//   10   21:aload_0         
	//   11   22:getfield        #23  <Field List c>
	//   12   25:invokeinterface #31  <Method int List.size()>
	//   13   30:istore_2        
				StringBuilder stringbuilder = new StringBuilder(41);
	//   14   31:new             #106 <Class StringBuilder>
	//   15   34:dup             
	//   16   35:bipush          41
	//   17   37:invokespecial   #109 <Method void StringBuilder(int)>
	//   18   40:astore          4
				stringbuilder.append("Queue is full, current size = ");
	//   19   42:aload           4
	//   20   44:ldc1            #111 <String "Queue is full, current size = ">
	//   21   46:invokevirtual   #115 <Method StringBuilder StringBuilder.append(String)>
	//   22   49:pop             
				stringbuilder.append(i);
	//   23   50:aload           4
	//   24   52:iload_2         
	//   25   53:invokevirtual   #118 <Method StringBuilder StringBuilder.append(int)>
	//   26   56:pop             
				wx.b(stringbuilder.toString());
	//   27   57:aload           4
	//   28   59:invokevirtual   #121 <Method String StringBuilder.toString()>
	//   29   62:invokestatic    #38  <Method void wx.b(String)>
				c.remove(0);
	//   30   65:aload_0         
	//   31   66:getfield        #23  <Field List c>
	//   32   69:iconst_0        
	//   33   70:invokeinterface #62  <Method Object List.remove(int)>
	//   34   75:pop             
			}
			int j = b;
	//   35   76:aload_0         
	//   36   77:getfield        #123 <Field int b>
	//   37   80:istore_2        
			b = j + 1;
	//   38   81:aload_0         
	//   39   82:iload_2         
	//   40   83:iconst_1        
	//   41   84:iadd            
	//   42   85:putfield        #123 <Field int b>
			bqj1.a(j);
	//   43   88:aload_1         
	//   44   89:iload_2         
	//   45   90:invokevirtual   #125 <Method void bqj.a(int)>
			c.add(((Object) (bqj1)));
	//   46   93:aload_0         
	//   47   94:getfield        #23  <Field List c>
	//   48   97:aload_1         
	//   49   98:invokeinterface #128 <Method boolean List.add(Object)>
	//   50  103:pop             
		}
	//   51  104:aload_3         
	//   52  105:monitorexit     
		return;
	//   53  106:return          
		bqj1;
	//   54  107:astore_1        
		obj;
	//   55  108:aload_3         
		JVM INSTR monitorexit ;
	//   56  109:monitorexit     
		throw bqj1;
	//   57  110:aload_1         
	//   58  111:athrow          
	}

	private final Object a = new Object();
	private int b;
	private List c;
}
