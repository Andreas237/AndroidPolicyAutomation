// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssSelectorItem;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css.parser:
//			CssSelectorParser

static class CssSelectorParser$CssClassSelector
	implements CssSelectorItem
{

	public char getSeparator()
	{
		return '\0';
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int getSpecificity()
	{
		return 256;
	//    0    0:sipush          256
	//    1    3:ireturn         
	}

	public boolean matches(Tag tag)
	{
		tag = ((Tag) ((String)tag.getAttributes().get("class")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #31  <Method Map Tag.getAttributes()>
	//    2    4:ldc1            #33  <String "class">
	//    3    6:invokeinterface #39  <Method Object Map.get(Object)>
	//    4   11:checkcast       #41  <Class String>
	//    5   14:astore_1        
		if(tag != null && ((String) (tag)).length() != 0)
	//*   6   15:aload_1         
	//*   7   16:ifnull          26
	//*   8   19:aload_1         
	//*   9   20:invokevirtual   #44  <Method int String.length()>
	//*  10   23:ifne            28
	//*  11   26:iconst_0        
	//*  12   27:ireturn         
		{
			tag = ((Tag) (((String) (tag)).split(" ")));
	//   13   28:aload_1         
	//   14   29:ldc1            #46  <String " ">
	//   15   31:invokevirtual   #50  <Method String[] String.split(String)>
	//   16   34:astore_1        
			int j = tag.length;
	//   17   35:aload_1         
	//   18   36:arraylength     
	//   19   37:istore_3        
			int i = 0;
	//   20   38:iconst_0        
	//   21   39:istore_2        
			while(i < j) 
	//*  22   40:iload_2         
	//*  23   41:iload_3         
	//*  24   42:icmpge          26
			{
				String s = ((String) (tag[i]));
	//   25   45:aload_1         
	//   26   46:iload_2         
	//   27   47:aaload          
	//   28   48:astore          4
				if(className.equals(((Object) (s.trim()))))
	//*  29   50:aload_0         
	//*  30   51:getfield        #18  <Field String className>
	//*  31   54:aload           4
	//*  32   56:invokevirtual   #54  <Method String String.trim()>
	//*  33   59:invokevirtual   #58  <Method boolean String.equals(Object)>
	//*  34   62:ifeq            67
					return true;
	//   35   65:iconst_1        
	//   36   66:ireturn         
				i++;
	//   37   67:iload_2         
	//   38   68:iconst_1        
	//   39   69:iadd            
	//   40   70:istore_2        
			}
		}
		return false;
	//*  41   71:goto            40
	}

	public String toString()
	{
		return (new StringBuilder()).append(".").append(className).toString();
	//    0    0:new             #61  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #62  <Method void StringBuilder()>
	//    3    7:ldc1            #64  <String ".">
	//    4    9:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #18  <Field String className>
	//    7   16:invokevirtual   #68  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #70  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	private String className;

	CssSelectorParser$CssClassSelector(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		className = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String className>
	//    5    9:return          
	}
}
