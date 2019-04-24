// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.parser.CssSelectorParser;
import java.util.*;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssFile, CssRule, CssSelector

public class CssFileImpl
	implements CssFile
{

	public CssFileImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		persistent = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #17  <Field boolean persistent>
	//    5    9:aload_0         
	//    6   10:new             #19  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #20  <Method void ArrayList()>
	//    9   17:putfield        #22  <Field List rules>
	//   10   20:return          
	}

	public boolean add(String s, Map map)
	{
		s = ((String) (CssSelectorParser.createCssSelector(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #31  <Method List CssSelectorParser.createCssSelector(String)>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          30
		{
			rules.add(((Object) (new CssRule(((List) (s)), map))));
	//    5    9:aload_0         
	//    6   10:getfield        #22  <Field List rules>
	//    7   13:new             #33  <Class CssRule>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokespecial   #36  <Method void CssRule(List, Map)>
	//   12   22:invokeinterface #41  <Method boolean List.add(Object)>
	//   13   27:pop             
			return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		} else
		{
			return false;
	//   16   30:iconst_0        
	//   17   31:ireturn         
		}
	}

	public List get(Tag tag)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #19  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #20  <Method void ArrayList()>
	//    3    7:astore_2        
		Iterator iterator = rules.iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #22  <Field List rules>
	//    6   12:invokeinterface #49  <Method Iterator List.iterator()>
	//    7   17:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   18:aload_3         
	//    9   19:invokeinterface #55  <Method boolean Iterator.hasNext()>
	//   10   24:ifeq            62
			CssRule cssrule = (CssRule)iterator.next();
	//   11   27:aload_3         
	//   12   28:invokeinterface #59  <Method Object Iterator.next()>
	//   13   33:checkcast       #33  <Class CssRule>
	//   14   36:astore          4
			if(cssrule.getSelector().matches(tag))
	//*  15   38:aload           4
	//*  16   40:invokevirtual   #63  <Method CssSelector CssRule.getSelector()>
	//*  17   43:aload_1         
	//*  18   44:invokevirtual   #69  <Method boolean CssSelector.matches(Tag)>
	//*  19   47:ifeq            18
				((List) (arraylist)).add(((Object) (cssrule)));
	//   20   50:aload_2         
	//   21   51:aload           4
	//   22   53:invokeinterface #41  <Method boolean List.add(Object)>
	//   23   58:pop             
		} while(true);
	//   24   59:goto            18
		return ((List) (arraylist));
	//   25   62:aload_2         
	//   26   63:areturn         
	}

	public void isPersistent(boolean flag)
	{
		persistent = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #17  <Field boolean persistent>
	//    3    5:return          
	}

	public boolean isPersistent()
	{
		return persistent;
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field boolean persistent>
	//    2    4:ireturn         
	}

	private boolean persistent;
	private final List rules = new ArrayList();
}
