// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.util;

import java.util.ArrayList;

public abstract class ObjectPoolBase
{

	public ObjectPoolBase(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		zzaag = new ArrayList(i);
	//    2    4:aload_0         
	//    3    5:new             #17  <Class ArrayList>
	//    4    8:dup             
	//    5    9:iload_1         
	//    6   10:invokespecial   #19  <Method void ArrayList(int)>
	//    7   13:putfield        #21  <Field ArrayList zzaag>
		zzaah = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #23  <Field int zzaah>
	//   11   21:return          
	}

	public final Object aquire()
	{
		ArrayList arraylist = zzaag;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList zzaag>
	//    2    4:astore_2        
		arraylist;
	//    3    5:aload_2         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		int i = zzaag.size();
	//    5    7:aload_0         
	//    6    8:getfield        #21  <Field ArrayList zzaag>
	//    7   11:invokevirtual   #30  <Method int ArrayList.size()>
	//    8   14:istore_1        
		if(i <= 0)
			break MISSING_BLOCK_LABEL_34;
	//    9   15:iload_1         
	//   10   16:ifle            34
		Object obj = zzaag.remove(i - 1);
	//   11   19:aload_0         
	//   12   20:getfield        #21  <Field ArrayList zzaag>
	//   13   23:iload_1         
	//   14   24:iconst_1        
	//   15   25:isub            
	//   16   26:invokevirtual   #34  <Method Object ArrayList.remove(int)>
	//   17   29:astore_3        
		arraylist;
	//   18   30:aload_2         
		JVM INSTR monitorexit ;
	//   19   31:monitorexit     
		return obj;
	//   20   32:aload_3         
	//   21   33:areturn         
		obj = newObject();
	//   22   34:aload_0         
	//   23   35:invokevirtual   #37  <Method Object newObject()>
	//   24   38:astore_3        
		arraylist;
	//   25   39:aload_2         
		JVM INSTR monitorexit ;
	//   26   40:monitorexit     
		return obj;
	//   27   41:aload_3         
	//   28   42:areturn         
		Exception exception;
		exception;
	//   29   43:astore_3        
		arraylist;
	//   30   44:aload_2         
		JVM INSTR monitorexit ;
	//   31   45:monitorexit     
		throw exception;
	//   32   46:aload_3         
	//   33   47:athrow          
	}

	protected boolean cleanUpObject(Object obj)
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	protected abstract Object newObject();

	public final boolean release(Object obj)
	{
		ArrayList arraylist = zzaag;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field ArrayList zzaag>
	//    2    4:astore          4
		arraylist;
	//    3    6:aload           4
		JVM INSTR monitorenter ;
	//    4    8:monitorenter    
		int j = zzaag.size();
	//    5    9:aload_0         
	//    6   10:getfield        #21  <Field ArrayList zzaag>
	//    7   13:invokevirtual   #30  <Method int ArrayList.size()>
	//    8   16:istore_3        
		int i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
_L2:
		if(i >= j)
			break MISSING_BLOCK_LABEL_88;
	//   11   19:iload_2         
	//   12   20:iload_3         
	//   13   21:icmpge          88
		if(zzaag.get(i) == obj)
	//*  14   24:aload_0         
	//*  15   25:getfield        #21  <Field ArrayList zzaag>
	//*  16   28:iload_2         
	//*  17   29:invokevirtual   #46  <Method Object ArrayList.get(int)>
	//*  18   32:aload_1         
	//*  19   33:if_acmpne       129
		{
			obj = ((Object) (String.valueOf(obj)));
	//   20   36:aload_1         
	//   21   37:invokestatic    #52  <Method String String.valueOf(Object)>
	//   22   40:astore_1        
			StringBuilder stringbuilder = new StringBuilder(25 + String.valueOf(obj).length());
	//   23   41:new             #54  <Class StringBuilder>
	//   24   44:dup             
	//   25   45:bipush          25
	//   26   47:aload_1         
	//   27   48:invokestatic    #52  <Method String String.valueOf(Object)>
	//   28   51:invokevirtual   #57  <Method int String.length()>
	//   29   54:iadd            
	//   30   55:invokespecial   #58  <Method void StringBuilder(int)>
	//   31   58:astore          5
			stringbuilder.append("Object released already: ");
	//   32   60:aload           5
	//   33   62:ldc1            #60  <String "Object released already: ">
	//   34   64:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			stringbuilder.append(((String) (obj)));
	//   36   68:aload           5
	//   37   70:aload_1         
	//   38   71:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   39   74:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   40   75:new             #66  <Class IllegalArgumentException>
	//   41   78:dup             
	//   42   79:aload           5
	//   43   81:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   44   84:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   45   87:athrow          
		}
		break MISSING_BLOCK_LABEL_129;
		if(j >= zzaah || !cleanUpObject(obj))
			break MISSING_BLOCK_LABEL_118;
	//   46   88:iload_3         
	//   47   89:aload_0         
	//   48   90:getfield        #23  <Field int zzaah>
	//   49   93:icmpge          118
	//   50   96:aload_0         
	//   51   97:aload_1         
	//   52   98:invokevirtual   #75  <Method boolean cleanUpObject(Object)>
	//   53  101:ifeq            118
		zzaag.add(obj);
	//   54  104:aload_0         
	//   55  105:getfield        #21  <Field ArrayList zzaag>
	//   56  108:aload_1         
	//   57  109:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
	//   58  112:pop             
	//*  59  113:aload           4
	//*  60  115:monitorexit     
		return true;
	//   61  116:iconst_1        
	//   62  117:ireturn         
		arraylist;
	//   63  118:aload           4
		JVM INSTR monitorexit ;
	//   64  120:monitorexit     
		return false;
	//   65  121:iconst_0        
	//   66  122:ireturn         
		obj;
	//   67  123:astore_1        
		arraylist;
	//   68  124:aload           4
		JVM INSTR monitorexit ;
	//   69  126:monitorexit     
		throw obj;
	//   70  127:aload_1         
	//   71  128:athrow          
		i++;
	//   72  129:iload_2         
	//   73  130:iconst_1        
	//   74  131:iadd            
	//   75  132:istore_2        
		if(true) goto _L2; else goto _L1
	//   76  133:goto            19
_L1:
	}

	private final ArrayList zzaag;
	private final int zzaah;
}
