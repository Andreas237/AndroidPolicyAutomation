// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine.bitmap_recycle;

import java.util.*;

class PrettyPrintTreeMap extends TreeMap
{

	PrettyPrintTreeMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #9   <Method void TreeMap()>
	//    2    4:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #14  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #15  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("( ");
	//    4    8:aload_1         
	//    5    9:ldc1            #17  <String "( ">
	//    6   11:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		for(Iterator iterator = entrySet().iterator(); iterator.hasNext(); stringbuilder.append("}, "))
	//*   8   15:aload_0         
	//*   9   16:invokevirtual   #25  <Method Set entrySet()>
	//*  10   19:invokeinterface #31  <Method Iterator Set.iterator()>
	//*  11   24:astore_2        
	//*  12   25:aload_2         
	//*  13   26:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//*  14   31:ifeq            90
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
	//   15   34:aload_2         
	//   16   35:invokeinterface #41  <Method Object Iterator.next()>
	//   17   40:checkcast       #43  <Class java.util.Map$Entry>
	//   18   43:astore_3        
			stringbuilder.append('{');
	//   19   44:aload_1         
	//   20   45:bipush          123
	//   21   47:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   22   50:pop             
			stringbuilder.append(entry.getKey());
	//   23   51:aload_1         
	//   24   52:aload_3         
	//   25   53:invokeinterface #49  <Method Object java.util.Map$Entry.getKey()>
	//   26   58:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   27   61:pop             
			stringbuilder.append(':');
	//   28   62:aload_1         
	//   29   63:bipush          58
	//   30   65:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   31   68:pop             
			stringbuilder.append(entry.getValue());
	//   32   69:aload_1         
	//   33   70:aload_3         
	//   34   71:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
	//   35   76:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   36   79:pop             
		}

	//   37   80:aload_1         
	//   38   81:ldc1            #57  <String "}, ">
	//   39   83:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   40   86:pop             
	//*  41   87:goto            25
		if(!isEmpty())
	//*  42   90:aload_0         
	//*  43   91:invokevirtual   #60  <Method boolean isEmpty()>
	//*  44   94:ifne            114
			stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length(), "");
	//   45   97:aload_1         
	//   46   98:aload_1         
	//   47   99:invokevirtual   #64  <Method int StringBuilder.length()>
	//   48  102:iconst_2        
	//   49  103:isub            
	//   50  104:aload_1         
	//   51  105:invokevirtual   #64  <Method int StringBuilder.length()>
	//   52  108:ldc1            #66  <String "">
	//   53  110:invokevirtual   #70  <Method StringBuilder StringBuilder.replace(int, int, String)>
	//   54  113:pop             
		stringbuilder.append(" )");
	//   55  114:aload_1         
	//   56  115:ldc1            #72  <String " )">
	//   57  117:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   58  120:pop             
		return stringbuilder.toString();
	//   59  121:aload_1         
	//   60  122:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   61  125:areturn         
	}
}
