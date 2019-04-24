// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser;

import java.util.LinkedHashMap;
import java.util.Map;

public class XMLParserMemory
{

	public XMLParserMemory(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class StringBuilder>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void StringBuilder()>
	//    6   12:putfield        #31  <Field StringBuilder currentEntity>
	//    7   15:aload_0         
	//    8   16:new             #28  <Class StringBuilder>
	//    9   19:dup             
	//   10   20:invokespecial   #29  <Method void StringBuilder()>
	//   11   23:putfield        #33  <Field StringBuilder comment>
	//   12   26:aload_0         
	//   13   27:new             #28  <Class StringBuilder>
	//   14   30:dup             
	//   15   31:invokespecial   #29  <Method void StringBuilder()>
	//   16   34:putfield        #35  <Field StringBuilder baos>
		wsTag = "";
	//   17   37:aload_0         
	//   18   38:ldc1            #37  <String "">
	//   19   40:putfield        #39  <Field String wsTag>
		currentNameSpace = "";
	//   20   43:aload_0         
	//   21   44:ldc1            #37  <String "">
	//   22   46:putfield        #41  <Field String currentNameSpace>
	//   23   49:aload_0         
	//   24   50:new             #43  <Class LinkedHashMap>
	//   25   53:dup             
	//   26   54:invokespecial   #44  <Method void LinkedHashMap()>
	//   27   57:putfield        #46  <Field Map attr>
		isHtml = flag;
	//   28   60:aload_0         
	//   29   61:iload_1         
	//   30   62:putfield        #48  <Field boolean isHtml>
	//   31   65:return          
	}

	public StringBuilder comment()
	{
		return comment;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field StringBuilder comment>
	//    2    4:areturn         
	}

	public StringBuilder current()
	{
		return baos;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field StringBuilder baos>
	//    2    4:areturn         
	}

	public void currentAttr(String s)
	{
		currentAttr = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field String currentAttr>
	//    3    5:return          
	}

	public StringBuilder currentEntity()
	{
		return currentEntity;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field StringBuilder currentEntity>
	//    2    4:areturn         
	}

	public void currentTag(String s)
	{
		currentTag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field String currentTag>
		wsTag = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #39  <Field String wsTag>
		attr.clear();
	//    6   10:aload_0         
	//    7   11:getfield        #46  <Field Map attr>
	//    8   14:invokeinterface #61  <Method void Map.clear()>
	//    9   19:return          
	}

	public void flushNameSpace()
	{
		currentNameSpace = "";
	//    0    0:aload_0         
	//    1    1:ldc1            #37  <String "">
	//    2    3:putfield        #41  <Field String currentNameSpace>
	//    3    6:return          
	}

	public Map getAttributes()
	{
		return ((Map) (new LinkedHashMap(attr)));
	//    0    0:new             #43  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #46  <Field Map attr>
	//    4    8:invokespecial   #67  <Method void LinkedHashMap(Map)>
	//    5   11:areturn         
	}

	public String getCurrentTag()
	{
		return currentTag;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field String currentTag>
	//    2    4:areturn         
	}

	public String getNameSpace()
	{
		return currentNameSpace;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String currentNameSpace>
	//    2    4:areturn         
	}

	public String getStoredString()
	{
		return storedString;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field String storedString>
	//    2    4:areturn         
	}

	public boolean hasCurrentAttribute()
	{
		return currentAttr != null;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field String currentAttr>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public char lastChar()
	{
		return lastChar;
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field char lastChar>
	//    2    4:ireturn         
	}

	public void lastChar(char c)
	{
		lastChar = c;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #80  <Field char lastChar>
	//    3    5:return          
	}

	public void namespace(String s)
	{
		currentNameSpace = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field String currentNameSpace>
	//    3    5:return          
	}

	public void putCurrentAttrValue(String s)
	{
		if(currentAttr != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #54  <Field String currentAttr>
	//*   2    4:ifnull          37
		{
			if(isHtml)
	//*   3    7:aload_0         
	//*   4    8:getfield        #48  <Field boolean isHtml>
	//*   5   11:ifeq            38
				attr.put(((Object) (currentAttr.toLowerCase())), ((Object) (s)));
	//    6   14:aload_0         
	//    7   15:getfield        #46  <Field Map attr>
	//    8   18:aload_0         
	//    9   19:getfield        #54  <Field String currentAttr>
	//   10   22:invokevirtual   #88  <Method String String.toLowerCase()>
	//   11   25:aload_1         
	//   12   26:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   13   31:pop             
			else
	//*  14   32:aload_0         
	//*  15   33:aconst_null     
	//*  16   34:putfield        #54  <Field String currentAttr>
	//*  17   37:return          
				attr.put(((Object) (currentAttr)), ((Object) (s)));
	//   18   38:aload_0         
	//   19   39:getfield        #46  <Field Map attr>
	//   20   42:aload_0         
	//   21   43:getfield        #54  <Field String currentAttr>
	//   22   46:aload_1         
	//   23   47:invokeinterface #92  <Method Object Map.put(Object, Object)>
	//   24   52:pop             
			currentAttr = null;
		}
	//*  25   53:goto            32
	}

	public void resetBuffer()
	{
		baos.setLength(0);
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field StringBuilder baos>
	//    2    4:iconst_0        
	//    3    5:invokevirtual   #97  <Method void StringBuilder.setLength(int)>
	//    4    8:return          
	}

	public void setStoredString(String s)
	{
		storedString = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #75  <Field String storedString>
	//    3    5:return          
	}

	public String whitespaceTag()
	{
		return wsTag;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String wsTag>
	//    2    4:areturn         
	}

	public void whitespaceTag(String s)
	{
		wsTag = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #39  <Field String wsTag>
	//    3    5:return          
	}

	private final Map attr = new LinkedHashMap();
	private final StringBuilder baos = new StringBuilder();
	private final StringBuilder comment = new StringBuilder();
	private String currentAttr;
	private final StringBuilder currentEntity = new StringBuilder();
	private String currentNameSpace;
	private String currentTag;
	private final boolean isHtml;
	private char lastChar;
	private String storedString;
	private String wsTag;
}
