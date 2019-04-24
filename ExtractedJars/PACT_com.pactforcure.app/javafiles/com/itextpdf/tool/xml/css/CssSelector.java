// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssSelectorItem

public class CssSelector
{

	public CssSelector(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
		selectorItems = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #14  <Field List selectorItems>
	//    5    9:return          
	}

	private boolean matches(Tag tag, int i)
	{
		if(tag != null) goto _L2; else goto _L1
	//    0    0:aload_1         
	//    1    1:ifnonnull       6
_L1:
		return false;
	//    2    4:iconst_0        
	//    3    5:ireturn         
_L2:
		int j;
		char c;
		Object obj;
		obj = ((Object) (new Stack()));
	//    4    6:new             #21  <Class Stack>
	//    5    9:dup             
	//    6   10:invokespecial   #22  <Method void Stack()>
	//    7   13:astore          6
label0:
		do
		{
			if(i < 0 || ((CssSelectorItem)selectorItems.get(i)).getSeparator() != 0)
	//*   8   15:iload_2         
	//*   9   16:iflt            40
	//*  10   19:aload_0         
	//*  11   20:getfield        #14  <Field List selectorItems>
	//*  12   23:iload_2         
	//*  13   24:invokeinterface #28  <Method Object List.get(int)>
	//*  14   29:checkcast       #30  <Class CssSelectorItem>
	//*  15   32:invokeinterface #34  <Method char CssSelectorItem.getSeparator()>
	//*  16   37:ifeq            67
			{
				do
					if(((Stack) (obj)).empty())
						break label0;
	//   17   40:aload           6
	//   18   42:invokevirtual   #38  <Method boolean Stack.empty()>
	//   19   45:ifne            90
				while(((CssSelectorItem)((Stack) (obj)).pop()).matches(tag));
	//   20   48:aload           6
	//   21   50:invokevirtual   #42  <Method Object Stack.pop()>
	//   22   53:checkcast       #30  <Class CssSelectorItem>
	//   23   56:aload_1         
	//   24   57:invokeinterface #45  <Method boolean CssSelectorItem.matches(Tag)>
	//   25   62:ifne            40
				return false;
	//   26   65:iconst_0        
	//   27   66:ireturn         
			}
			((Stack) (obj)).push(selectorItems.get(i));
	//   28   67:aload           6
	//   29   69:aload_0         
	//   30   70:getfield        #14  <Field List selectorItems>
	//   31   73:iload_2         
	//   32   74:invokeinterface #28  <Method Object List.get(int)>
	//   33   79:invokevirtual   #49  <Method Object Stack.push(Object)>
	//   34   82:pop             
			i--;
	//   35   83:iload_2         
	//   36   84:iconst_1        
	//   37   85:isub            
	//   38   86:istore_2        
		} while(true);
	//   39   87:goto            15
		if(i == -1)
	//*  40   90:iload_2         
	//*  41   91:iconst_m1       
	//*  42   92:icmpne          97
			return true;
	//   43   95:iconst_1        
	//   44   96:ireturn         
		c = ((CssSelectorItem)selectorItems.get(i)).getSeparator();
	//   45   97:aload_0         
	//   46   98:getfield        #14  <Field List selectorItems>
	//   47  101:iload_2         
	//   48  102:invokeinterface #28  <Method Object List.get(int)>
	//   49  107:checkcast       #30  <Class CssSelectorItem>
	//   50  110:invokeinterface #34  <Method char CssSelectorItem.getSeparator()>
	//   51  115:istore          4
		if(c == 0)
			continue; /* Loop/switch isn't completed */
	//   52  117:iload           4
	//   53  119:ifeq            4
		j = i - 1;
	//   54  122:iload_2         
	//   55  123:iconst_1        
	//   56  124:isub            
	//   57  125:istore_3        
		obj = ((Object) (tag));
	//   58  126:aload_1         
	//   59  127:astore          6
		c;
	//   60  129:iload           4
		JVM INSTR lookupswitch 4: default 172
	//	               32: 174
	//	               43: 274
	//	               62: 194
	//	               126: 214;
	//   61  131:lookupswitch    4: default 172
	//	               32: 174
	//	               43: 274
	//	               62: 194
	//	               126: 214
		   goto _L3 _L4 _L5 _L6 _L7
_L5:
		continue; /* Loop/switch isn't completed */
_L3:
		return false;
	//   62  172:iconst_0        
	//   63  173:ireturn         
_L4:
		if(obj == null)
			break; /* Loop/switch isn't completed */
	//   64  174:aload           6
	//   65  176:ifnull          4
		if(matches(((Tag) (obj)).getParent(), j))
	//*  66  179:aload_0         
	//*  67  180:aload           6
	//*  68  182:invokevirtual   #55  <Method Tag Tag.getParent()>
	//*  69  185:iload_3         
	//*  70  186:invokespecial   #57  <Method boolean matches(Tag, int)>
	//*  71  189:ifeq            204
			return true;
	//   72  192:iconst_1        
	//   73  193:ireturn         
	//*  74  194:aload_0         
	//*  75  195:aload_1         
	//*  76  196:invokevirtual   #55  <Method Tag Tag.getParent()>
	//*  77  199:iload_3         
	//*  78  200:invokespecial   #57  <Method boolean matches(Tag, int)>
	//*  79  203:ireturn         
		obj = ((Object) (((Tag) (obj)).getParent()));
	//   80  204:aload           6
	//   81  206:invokevirtual   #55  <Method Tag Tag.getParent()>
	//   82  209:astore          6
		continue; /* Loop/switch isn't completed */
	//   83  211:goto            174
_L6:
		return matches(tag.getParent(), j);
		if(true) goto _L4; else goto _L8
_L8:
		break; /* Loop/switch isn't completed */
_L7:
		if(tag.hasParent())
	//*  84  214:aload_1         
	//*  85  215:invokevirtual   #60  <Method boolean Tag.hasParent()>
	//*  86  218:ifeq            4
		{
			i = tag.getParent().getChildren().indexOf(((Object) (tag))) - 1;
	//   87  221:aload_1         
	//   88  222:invokevirtual   #55  <Method Tag Tag.getParent()>
	//   89  225:invokevirtual   #64  <Method List Tag.getChildren()>
	//   90  228:aload_1         
	//   91  229:invokeinterface #68  <Method int List.indexOf(Object)>
	//   92  234:iconst_1        
	//   93  235:isub            
	//   94  236:istore_2        
			while(i >= 0) 
	//*  95  237:iload_2         
	//*  96  238:iflt            4
			{
				if(matches((Tag)tag.getParent().getChildren().get(i), j))
	//*  97  241:aload_0         
	//*  98  242:aload_1         
	//*  99  243:invokevirtual   #55  <Method Tag Tag.getParent()>
	//* 100  246:invokevirtual   #64  <Method List Tag.getChildren()>
	//* 101  249:iload_2         
	//* 102  250:invokeinterface #28  <Method Object List.get(int)>
	//* 103  255:checkcast       #51  <Class Tag>
	//* 104  258:iload_3         
	//* 105  259:invokespecial   #57  <Method boolean matches(Tag, int)>
	//* 106  262:ifeq            267
					return true;
	//  107  265:iconst_1        
	//  108  266:ireturn         
				i--;
	//  109  267:iload_2         
	//  110  268:iconst_1        
	//  111  269:isub            
	//  112  270:istore_2        
			}
		}
		if(true) goto _L1; else goto _L9
	//  113  271:goto            237
_L9:
		if(!tag.hasParent()) goto _L1; else goto _L10
	//  114  274:aload_1         
	//  115  275:invokevirtual   #60  <Method boolean Tag.hasParent()>
	//  116  278:ifeq            4
_L10:
		i = tag.getParent().getChildren().indexOf(((Object) (tag))) - 1;
	//  117  281:aload_1         
	//  118  282:invokevirtual   #55  <Method Tag Tag.getParent()>
	//  119  285:invokevirtual   #64  <Method List Tag.getChildren()>
	//  120  288:aload_1         
	//  121  289:invokeinterface #68  <Method int List.indexOf(Object)>
	//  122  294:iconst_1        
	//  123  295:isub            
	//  124  296:istore_2        
		boolean flag;
		if(i >= 0 && matches((Tag)tag.getParent().getChildren().get(i), j))
	//* 125  297:iload_2         
	//* 126  298:iflt            331
	//* 127  301:aload_0         
	//* 128  302:aload_1         
	//* 129  303:invokevirtual   #55  <Method Tag Tag.getParent()>
	//* 130  306:invokevirtual   #64  <Method List Tag.getChildren()>
	//* 131  309:iload_2         
	//* 132  310:invokeinterface #28  <Method Object List.get(int)>
	//* 133  315:checkcast       #51  <Class Tag>
	//* 134  318:iload_3         
	//* 135  319:invokespecial   #57  <Method boolean matches(Tag, int)>
	//* 136  322:ifeq            331
			flag = true;
	//  137  325:iconst_1        
	//  138  326:istore          5
		else
	//* 139  328:iload           5
	//* 140  330:ireturn         
			flag = false;
	//  141  331:iconst_0        
	//  142  332:istore          5
		return flag;
	//* 143  334:goto            328
	}

	public int calculateSpecifity()
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore_1        
		for(Iterator iterator = selectorItems.iterator(); iterator.hasNext();)
	//*   2    2:aload_0         
	//*   3    3:getfield        #14  <Field List selectorItems>
	//*   4    6:invokeinterface #74  <Method Iterator List.iterator()>
	//*   5   11:astore_2        
	//*   6   12:aload_2         
	//*   7   13:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            41
			i += ((CssSelectorItem)iterator.next()).getSpecificity();
	//    9   21:iload_1         
	//   10   22:aload_2         
	//   11   23:invokeinterface #82  <Method Object Iterator.next()>
	//   12   28:checkcast       #30  <Class CssSelectorItem>
	//   13   31:invokeinterface #85  <Method int CssSelectorItem.getSpecificity()>
	//   14   36:iadd            
	//   15   37:istore_1        

	//*  16   38:goto            12
		return i;
	//   17   41:iload_1         
	//   18   42:ireturn         
	}

	public boolean matches(Tag tag)
	{
		return matches(tag, selectorItems.size() - 1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #14  <Field List selectorItems>
	//    4    6:invokeinterface #88  <Method int List.size()>
	//    5   11:iconst_1        
	//    6   12:isub            
	//    7   13:invokespecial   #57  <Method boolean matches(Tag, int)>
	//    8   16:ireturn         
	}

	public String toString()
	{
		StringBuffer stringbuffer = new StringBuffer();
	//    0    0:new             #92  <Class StringBuffer>
	//    1    3:dup             
	//    2    4:invokespecial   #93  <Method void StringBuffer()>
	//    3    7:astore_1        
		for(Iterator iterator = selectorItems.iterator(); iterator.hasNext(); stringbuffer.append(((Object) ((CssSelectorItem)iterator.next())).toString()));
	//    4    8:aload_0         
	//    5    9:getfield        #14  <Field List selectorItems>
	//    6   12:invokeinterface #74  <Method Iterator List.iterator()>
	//    7   17:astore_2        
	//    8   18:aload_2         
	//    9   19:invokeinterface #79  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            47
	//   11   27:aload_1         
	//   12   28:aload_2         
	//   13   29:invokeinterface #82  <Method Object Iterator.next()>
	//   14   34:checkcast       #30  <Class CssSelectorItem>
	//   15   37:invokevirtual   #95  <Method String Object.toString()>
	//   16   40:invokevirtual   #99  <Method StringBuffer StringBuffer.append(String)>
	//   17   43:pop             
	//*  18   44:goto            18
		return stringbuffer.toString();
	//   19   47:aload_1         
	//   20   48:invokevirtual   #100 <Method String StringBuffer.toString()>
	//   21   51:areturn         
	}

	private List selectorItems;
}
