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
		java.util.Map.Entry entry;
		for(Iterator iterator = entrySet().iterator(); iterator.hasNext(); stringbuilder.append('{').append(entry.getKey()).append(':').append(entry.getValue()).append("}, "))
	//*   8   15:aload_0         
	//*   9   16:invokevirtual   #25  <Method Set entrySet()>
	//*  10   19:invokeinterface #31  <Method Iterator Set.iterator()>
	//*  11   24:astore_2        
	//*  12   25:aload_2         
	//*  13   26:invokeinterface #37  <Method boolean Iterator.hasNext()>
	//*  14   31:ifeq            82
			entry = (java.util.Map.Entry)iterator.next();
	//   15   34:aload_2         
	//   16   35:invokeinterface #41  <Method Object Iterator.next()>
	//   17   40:checkcast       #43  <Class java.util.Map$Entry>
	//   18   43:astore_3        

	//   19   44:aload_1         
	//   20   45:bipush          123
	//   21   47:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   22   50:aload_3         
	//   23   51:invokeinterface #49  <Method Object java.util.Map$Entry.getKey()>
	//   24   56:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   25   59:bipush          58
	//   26   61:invokevirtual   #46  <Method StringBuilder StringBuilder.append(char)>
	//   27   64:aload_3         
	//   28   65:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
	//   29   70:invokevirtual   #52  <Method StringBuilder StringBuilder.append(Object)>
	//   30   73:ldc1            #57  <String "}, ">
	//   31   75:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   32   78:pop             
	//*  33   79:goto            25
		if(!isEmpty())
	//*  34   82:aload_0         
	//*  35   83:invokevirtual   #60  <Method boolean isEmpty()>
	//*  36   86:ifne            106
			stringbuilder.replace(stringbuilder.length() - 2, stringbuilder.length(), "");
	//   37   89:aload_1         
	//   38   90:aload_1         
	//   39   91:invokevirtual   #64  <Method int StringBuilder.length()>
	//   40   94:iconst_2        
	//   41   95:isub            
	//   42   96:aload_1         
	//   43   97:invokevirtual   #64  <Method int StringBuilder.length()>
	//   44  100:ldc1            #66  <String "">
	//   45  102:invokevirtual   #70  <Method StringBuilder StringBuilder.replace(int, int, String)>
	//   46  105:pop             
		return stringbuilder.append(" )").toString();
	//   47  106:aload_1         
	//   48  107:ldc1            #72  <String " )">
	//   49  109:invokevirtual   #21  <Method StringBuilder StringBuilder.append(String)>
	//   50  112:invokevirtual   #74  <Method String StringBuilder.toString()>
	//   51  115:areturn         
	}
}
