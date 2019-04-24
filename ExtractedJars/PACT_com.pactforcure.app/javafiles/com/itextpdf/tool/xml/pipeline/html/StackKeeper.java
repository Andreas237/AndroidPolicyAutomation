// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline.html;

import com.itextpdf.text.Element;
import com.itextpdf.tool.xml.Tag;
import java.util.*;

public class StackKeeper
{

	public StackKeeper(Tag tag1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
		tag = tag1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field Tag tag>
	//    5    9:aload_0         
	//    6   10:new             #18  <Class ArrayList>
	//    7   13:dup             
	//    8   14:invokespecial   #19  <Method void ArrayList()>
	//    9   17:putfield        #21  <Field List stack>
	//   10   20:return          
	}

	public void add(Element element)
	{
		stack.add(((Object) (element)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List stack>
	//    2    4:aload_1         
	//    3    5:invokeinterface #29  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public void add(Collection collection)
	{
		Element element;
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); stack.add(((Object) (element))))
	//*   0    0:aload_1         
	//*   1    1:invokeinterface #36  <Method Iterator Collection.iterator()>
	//*   2    6:astore_1        
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #42  <Method boolean Iterator.hasNext()>
	//*   5   13:ifeq            40
			element = (Element)((Iterator) (collection)).next();
	//    6   16:aload_1         
	//    7   17:invokeinterface #46  <Method Object Iterator.next()>
	//    8   22:checkcast       #48  <Class Element>
	//    9   25:astore_2        

	//   10   26:aload_0         
	//   11   27:getfield        #21  <Field List stack>
	//   12   30:aload_2         
	//   13   31:invokeinterface #29  <Method boolean List.add(Object)>
	//   14   36:pop             
	//*  15   37:goto            7
	//   16   40:return          
	}

	public List getElements()
	{
		return stack;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List stack>
	//    2    4:areturn         
	}

	public Tag getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field Tag tag>
	//    2    4:areturn         
	}

	private final List stack = new ArrayList();
	private final Tag tag;
}
