// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css.parser;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.CssSelectorItem;

// Referenced classes of package com.itextpdf.tool.xml.css.parser:
//			CssSelectorParser

static class CssSelectorParser$CssPseudoSelector
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
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean matches(Tag tag)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public String toString()
	{
		return selector;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field String selector>
	//    2    4:areturn         
	}

	private String selector;

	CssSelectorParser$CssPseudoSelector(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		selector = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field String selector>
	//    5    9:return          
	}
}
