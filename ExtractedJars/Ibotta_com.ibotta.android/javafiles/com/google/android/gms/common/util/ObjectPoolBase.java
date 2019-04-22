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
			break MISSING_BLOCK_LABEL_95;
	//   11   19:iload_2         
	//   12   20:iload_3         
	//   13   21:icmpge          95
		if(zzaag.get(i) == obj)
			break; /* Loop/switch isn't completed */
	//   14   24:aload_0         
	//   15   25:getfield        #21  <Field ArrayList zzaag>
	//   16   28:iload_2         
	//   17   29:invokevirtual   #46  <Method Object ArrayList.get(int)>
	//   18   32:aload_1         
	//   19   33:if_acmpeq       43
		i++;
	//   20   36:iload_2         
	//   21   37:iconst_1        
	//   22   38:iadd            
	//   23   39:istore_2        
		if(true) goto _L2; else goto _L1
	//   24   40:goto            19
_L1:
		obj = ((Object) (String.valueOf(obj)));
	//   25   43:aload_1         
	//   26   44:invokestatic    #52  <Method String String.valueOf(Object)>
	//   27   47:astore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(obj).length() + 25);
	//   28   48:new             #54  <Class StringBuilder>
	//   29   51:dup             
	//   30   52:aload_1         
	//   31   53:invokestatic    #52  <Method String String.valueOf(Object)>
	//   32   56:invokevirtual   #57  <Method int String.length()>
	//   33   59:bipush          25
	//   34   61:iadd            
	//   35   62:invokespecial   #58  <Method void StringBuilder(int)>
	//   36   65:astore          5
		stringbuilder.append("Object released already: ");
	//   37   67:aload           5
	//   38   69:ldc1            #60  <String "Object released already: ">
	//   39   71:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   40   74:pop             
		stringbuilder.append(((String) (obj)));
	//   41   75:aload           5
	//   42   77:aload_1         
	//   43   78:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
	//   44   81:pop             
		throw new IllegalArgumentException(stringbuilder.toString());
	//   45   82:new             #66  <Class IllegalArgumentException>
	//   46   85:dup             
	//   47   86:aload           5
	//   48   88:invokevirtual   #70  <Method String StringBuilder.toString()>
	//   49   91:invokespecial   #73  <Method void IllegalArgumentException(String)>
	//   50   94:athrow          
		if(j >= zzaah || !cleanUpObject(obj))
			break MISSING_BLOCK_LABEL_125;
	//   51   95:iload_3         
	//   52   96:aload_0         
	//   53   97:getfield        #23  <Field int zzaah>
	//   54  100:icmpge          125
	//   55  103:aload_0         
	//   56  104:aload_1         
	//   57  105:invokevirtual   #75  <Method boolean cleanUpObject(Object)>
	//   58  108:ifeq            125
		zzaag.add(obj);
	//   59  111:aload_0         
	//   60  112:getfield        #21  <Field ArrayList zzaag>
	//   61  115:aload_1         
	//   62  116:invokevirtual   #78  <Method boolean ArrayList.add(Object)>
	//   63  119:pop             
	//*  64  120:aload           4
	//*  65  122:monitorexit     
		return true;
	//   66  123:iconst_1        
	//   67  124:ireturn         
		arraylist;
	//   68  125:aload           4
		JVM INSTR monitorexit ;
	//   69  127:monitorexit     
		return false;
	//   70  128:iconst_0        
	//   71  129:ireturn         
		obj;
	//   72  130:astore_1        
		arraylist;
	//   73  131:aload           4
		JVM INSTR monitorexit ;
	//   74  133:monitorexit     
		throw obj;
	//   75  134:aload_1         
	//   76  135:athrow          
	}

	private final ArrayList zzaag;
	private final int zzaah;
}
