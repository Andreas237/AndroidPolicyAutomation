// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.core.utilities;

import java.util.*;

public class TreeNode
{

	public TreeNode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		children = ((Map) (new HashMap()));
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field Map children>
	//    7   15:return          
	}

	String toString(String s)
	{
		Object obj = ((Object) (new StringBuilder()));
	//    0    0:new             #25  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void StringBuilder()>
	//    3    7:astore_2        
		((StringBuilder) (obj)).append(s);
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//    7   13:pop             
		((StringBuilder) (obj)).append("<value>: ");
	//    8   14:aload_2         
	//    9   15:ldc1            #32  <String "<value>: ">
	//   10   17:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   11   20:pop             
		((StringBuilder) (obj)).append(value);
	//   12   21:aload_2         
	//   13   22:aload_0         
	//   14   23:getfield        #34  <Field Object value>
	//   15   26:invokevirtual   #37  <Method StringBuilder StringBuilder.append(Object)>
	//   16   29:pop             
		((StringBuilder) (obj)).append("\n");
	//   17   30:aload_2         
	//   18   31:ldc1            #39  <String "\n">
	//   19   33:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   20   36:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   21   37:aload_2         
	//   22   38:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   23   41:astore_2        
		if(children.isEmpty())
	//*  24   42:aload_0         
	//*  25   43:getfield        #20  <Field Map children>
	//*  26   46:invokeinterface #48  <Method boolean Map.isEmpty()>
	//*  27   51:ifeq            86
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   28   54:new             #25  <Class StringBuilder>
	//   29   57:dup             
	//   30   58:invokespecial   #26  <Method void StringBuilder()>
	//   31   61:astore_3        
			stringbuilder.append(((String) (obj)));
	//   32   62:aload_3         
	//   33   63:aload_2         
	//   34   64:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   35   67:pop             
			stringbuilder.append(s);
	//   36   68:aload_3         
	//   37   69:aload_1         
	//   38   70:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   39   73:pop             
			stringbuilder.append("<empty>");
	//   40   74:aload_3         
	//   41   75:ldc1            #50  <String "<empty>">
	//   42   77:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   43   80:pop             
			return stringbuilder.toString();
	//   44   81:aload_3         
	//   45   82:invokevirtual   #42  <Method String StringBuilder.toString()>
	//   46   85:areturn         
		}
		for(Iterator iterator = children.entrySet().iterator(); iterator.hasNext();)
	//*  47   86:aload_0         
	//*  48   87:getfield        #20  <Field Map children>
	//*  49   90:invokeinterface #54  <Method Set Map.entrySet()>
	//*  50   95:invokeinterface #60  <Method Iterator Set.iterator()>
	//*  51  100:astore_3        
	//*  52  101:aload_3         
	//*  53  102:invokeinterface #65  <Method boolean Iterator.hasNext()>
	//*  54  107:ifeq            232
		{
			Object obj1 = ((Object) ((java.util.Map.Entry)iterator.next()));
	//   55  110:aload_3         
	//   56  111:invokeinterface #69  <Method Object Iterator.next()>
	//   57  116:checkcast       #71  <Class java.util.Map$Entry>
	//   58  119:astore          5
			StringBuilder stringbuilder1 = new StringBuilder();
	//   59  121:new             #25  <Class StringBuilder>
	//   60  124:dup             
	//   61  125:invokespecial   #26  <Method void StringBuilder()>
	//   62  128:astore          4
			stringbuilder1.append(((String) (obj)));
	//   63  130:aload           4
	//   64  132:aload_2         
	//   65  133:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   66  136:pop             
			stringbuilder1.append(s);
	//   67  137:aload           4
	//   68  139:aload_1         
	//   69  140:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   70  143:pop             
			stringbuilder1.append(((java.util.Map.Entry) (obj1)).getKey());
	//   71  144:aload           4
	//   72  146:aload           5
	//   73  148:invokeinterface #74  <Method Object java.util.Map$Entry.getKey()>
	//   74  153:invokevirtual   #37  <Method StringBuilder StringBuilder.append(Object)>
	//   75  156:pop             
			stringbuilder1.append(":\n");
	//   76  157:aload           4
	//   77  159:ldc1            #76  <String ":\n">
	//   78  161:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   79  164:pop             
			obj = ((Object) ((TreeNode)((java.util.Map.Entry) (obj1)).getValue()));
	//   80  165:aload           5
	//   81  167:invokeinterface #79  <Method Object java.util.Map$Entry.getValue()>
	//   82  172:checkcast       #2   <Class TreeNode>
	//   83  175:astore_2        
			obj1 = ((Object) (new StringBuilder()));
	//   84  176:new             #25  <Class StringBuilder>
	//   85  179:dup             
	//   86  180:invokespecial   #26  <Method void StringBuilder()>
	//   87  183:astore          5
			((StringBuilder) (obj1)).append(s);
	//   88  185:aload           5
	//   89  187:aload_1         
	//   90  188:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   91  191:pop             
			((StringBuilder) (obj1)).append("\t");
	//   92  192:aload           5
	//   93  194:ldc1            #81  <String "\t">
	//   94  196:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//   95  199:pop             
			stringbuilder1.append(((TreeNode) (obj)).toString(((StringBuilder) (obj1)).toString()));
	//   96  200:aload           4
	//   97  202:aload_2         
	//   98  203:aload           5
	//   99  205:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  100  208:invokevirtual   #83  <Method String toString(String)>
	//  101  211:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//  102  214:pop             
			stringbuilder1.append("\n");
	//  103  215:aload           4
	//  104  217:ldc1            #39  <String "\n">
	//  105  219:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
	//  106  222:pop             
			obj = ((Object) (stringbuilder1.toString()));
	//  107  223:aload           4
	//  108  225:invokevirtual   #42  <Method String StringBuilder.toString()>
	//  109  228:astore_2        
		}

	//* 110  229:goto            101
		return ((String) (obj));
	//  111  232:aload_2         
	//  112  233:areturn         
	}

	public Map children;
	public Object value;
}
