// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.squareup.leakcanary;

import java.io.Serializable;
import java.util.*;

// Referenced classes of package com.squareup.leakcanary:
//			LeakTraceElement

public final class LeakTrace
	implements Serializable
{

	LeakTrace(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		elements = Collections.unmodifiableList(((List) (new ArrayList(((java.util.Collection) (list))))));
	//    2    4:aload_0         
	//    3    5:new             #16  <Class ArrayList>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #19  <Method void ArrayList(java.util.Collection)>
	//    7   13:invokestatic    #25  <Method List Collections.unmodifiableList(List)>
	//    8   16:putfield        #27  <Field List elements>
	//    9   19:return          
	}

	public String toDetailedString()
	{
		String s = "";
	//    0    0:ldc1            #34  <String "">
	//    1    2:astore_1        
		for(Iterator iterator = elements.iterator(); iterator.hasNext();)
	//*   2    3:aload_0         
	//*   3    4:getfield        #27  <Field List elements>
	//*   4    7:invokeinterface #40  <Method Iterator List.iterator()>
	//*   5   12:astore_2        
	//*   6   13:aload_2         
	//*   7   14:invokeinterface #46  <Method boolean Iterator.hasNext()>
	//*   8   19:ifeq            57
		{
			LeakTraceElement leaktraceelement = (LeakTraceElement)iterator.next();
	//    9   22:aload_2         
	//   10   23:invokeinterface #50  <Method Object Iterator.next()>
	//   11   28:checkcast       #52  <Class LeakTraceElement>
	//   12   31:astore_3        
			s = (new StringBuilder()).append(s).append(leaktraceelement.toDetailedString()).toString();
	//   13   32:new             #54  <Class StringBuilder>
	//   14   35:dup             
	//   15   36:invokespecial   #55  <Method void StringBuilder()>
	//   16   39:aload_1         
	//   17   40:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   18   43:aload_3         
	//   19   44:invokevirtual   #61  <Method String LeakTraceElement.toDetailedString()>
	//   20   47:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   21   50:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   22   53:astore_1        
		}

	//*  23   54:goto            13
		return s;
	//   24   57:aload_1         
	//   25   58:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #54  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #55  <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int i = 0; i < elements.size(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:getfield        #27  <Field List elements>
	//*   9   15:invokeinterface #68  <Method int List.size()>
	//*  10   20:icmpge          108
		{
			LeakTraceElement leaktraceelement = (LeakTraceElement)elements.get(i);
	//   11   23:aload_0         
	//   12   24:getfield        #27  <Field List elements>
	//   13   27:iload_1         
	//   14   28:invokeinterface #72  <Method Object List.get(int)>
	//   15   33:checkcast       #52  <Class LeakTraceElement>
	//   16   36:astore_3        
			stringbuilder.append("* ");
	//   17   37:aload_2         
	//   18   38:ldc1            #74  <String "* ">
	//   19   40:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   20   43:pop             
			if(i == 0)
	//*  21   44:iload_1         
	//*  22   45:ifne            58
				stringbuilder.append("GC ROOT ");
	//   23   48:aload_2         
	//   24   49:ldc1            #76  <String "GC ROOT ">
	//   25   51:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
			else
	//*  27   55:goto            90
			if(i == elements.size() - 1)
	//*  28   58:iload_1         
	//*  29   59:aload_0         
	//*  30   60:getfield        #27  <Field List elements>
	//*  31   63:invokeinterface #68  <Method int List.size()>
	//*  32   68:iconst_1        
	//*  33   69:isub            
	//*  34   70:icmpne          83
				stringbuilder.append("leaks ");
	//   35   73:aload_2         
	//   36   74:ldc1            #78  <String "leaks ">
	//   37   76:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   38   79:pop             
			else
	//*  39   80:goto            90
				stringbuilder.append("references ");
	//   40   83:aload_2         
	//   41   84:ldc1            #80  <String "references ">
	//   42   86:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
			stringbuilder.append(((Object) (leaktraceelement))).append("\n");
	//   44   90:aload_2         
	//   45   91:aload_3         
	//   46   92:invokevirtual   #83  <Method StringBuilder StringBuilder.append(Object)>
	//   47   95:ldc1            #85  <String "\n">
	//   48   97:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//   49  100:pop             
		}

	//   50  101:iload_1         
	//   51  102:iconst_1        
	//   52  103:iadd            
	//   53  104:istore_1        
	//*  54  105:goto            10
		return stringbuilder.toString();
	//   55  108:aload_2         
	//   56  109:invokevirtual   #64  <Method String StringBuilder.toString()>
	//   57  112:areturn         
	}

	public final List elements;
}
