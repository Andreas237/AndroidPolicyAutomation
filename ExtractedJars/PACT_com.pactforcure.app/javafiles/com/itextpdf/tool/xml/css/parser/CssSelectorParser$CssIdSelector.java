// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssSelectorItem;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css.parser:
//			CssSelectorParser

static class CssSelectorParser$CssIdSelector
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
		return 0x10000;
	//    0    0:ldc1            #24  <Int 0x10000>
	//    1    2:ireturn         
	}

	public boolean matches(Tag tag)
	{
		tag = ((Tag) ((String)tag.getAttributes().get("id")));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method Map Tag.getAttributes()>
	//    2    4:ldc1            #33  <String "id">
	//    3    6:invokeinterface #39  <Method Object Map.get(Object)>
	//    4   11:checkcast       #41  <Class String>
	//    5   14:astore_1        
		return tag != null && id.equals(((Object) (((String) (tag)).trim())));
	//    6   15:aload_1         
	//    7   16:ifnull          35
	//    8   19:aload_0         
	//    9   20:getfield        #18  <Field String id>
	//   10   23:aload_1         
	//   11   24:invokevirtual   #45  <Method String String.trim()>
	//   12   27:invokevirtual   #49  <Method boolean String.equals(Object)>
	//   13   30:ifeq            35
	//   14   33:iconst_1        
	//   15   34:ireturn         
	//   16   35:iconst_0        
	//   17   36:ireturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append("#").append(id).toString();
	//    0    0:new             #52  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void StringBuilder()>
	//    3    7:ldc1            #55  <String "#">
	//    4    9:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    5   12:aload_0         
	//    6   13:getfield        #18  <Field String id>
	//    7   16:invokevirtual   #59  <Method StringBuilder StringBuilder.append(String)>
	//    8   19:invokevirtual   #61  <Method String StringBuilder.toString()>
	//    9   22:areturn         
	}

	private String id;

	CssSelectorParser$CssIdSelector(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		id = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String id>
	//    5    9:return          
	}
}
