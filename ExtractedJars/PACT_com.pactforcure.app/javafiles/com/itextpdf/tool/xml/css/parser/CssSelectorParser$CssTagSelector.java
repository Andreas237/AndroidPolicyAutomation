// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssSelectorItem;

// Referenced classes of package com.itextpdf.tool.xml.css.parser:
//			CssSelectorParser

static class CssSelectorParser$CssTagSelector
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
		return !isUniversal ? 1 : 0;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean isUniversal>
	//    2    4:ifeq            9
	//    3    7:iconst_0        
	//    4    8:ireturn         
	//    5    9:iconst_1        
	//    6   10:ireturn         
	}

	public boolean matches(Tag tag)
	{
		return isUniversal || t.equals(((Object) (tag.getName())));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean isUniversal>
	//    2    4:ifne            21
	//    3    7:aload_0         
	//    4    8:getfield        #20  <Field String t>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #43  <Method String Tag.getName()>
	//    7   15:invokevirtual   #28  <Method boolean String.equals(Object)>
	//    8   18:ifeq            23
	//    9   21:iconst_1        
	//   10   22:ireturn         
	//   11   23:iconst_0        
	//   12   24:ireturn         
	}

	public String toString()
	{
		return t;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String t>
	//    2    4:areturn         
	}

	private boolean isUniversal;
	private String t;

	CssSelectorParser$CssTagSelector(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		t = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String t>
		boolean flag;
		if(t.equals("*"))
	//*   5    9:aload_0         
	//*   6   10:getfield        #20  <Field String t>
	//*   7   13:ldc1            #22  <String "*">
	//*   8   15:invokevirtual   #28  <Method boolean String.equals(Object)>
	//*   9   18:ifeq            29
			flag = true;
	//   10   21:iconst_1        
	//   11   22:istore_2        
		else
	//*  12   23:aload_0         
	//*  13   24:iload_2         
	//*  14   25:putfield        #30  <Field boolean isUniversal>
	//*  15   28:return          
			flag = false;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		isUniversal = flag;
	//*  18   31:goto            23
	}
}
