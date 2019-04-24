// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.pipeline;

import com.itextpdf.text.Element;
import com.itextpdf.tool.xml.Writable;
import java.util.ArrayList;
import java.util.List;

public class WritableElement
	implements Writable
{

	public WritableElement()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
		list = new ArrayList();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void ArrayList()>
	//    6   12:putfield        #18  <Field ArrayList list>
	//    7   15:return          
	}

	public WritableElement(Element element)
	{
		this();
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void WritableElement()>
		list.add(((Object) (element)));
	//    2    4:aload_0         
	//    3    5:getfield        #18  <Field ArrayList list>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #25  <Method boolean ArrayList.add(Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void add(Element element)
	{
		list.add(((Object) (element)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList list>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #25  <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	public void addAll(List list1)
	{
		list.addAll(((java.util.Collection) (list1)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList list>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #30  <Method boolean ArrayList.addAll(java.util.Collection)>
	//    4    8:pop             
	//    5    9:return          
	}

	public List elements()
	{
		return ((List) (list));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ArrayList list>
	//    2    4:areturn         
	}

	private final ArrayList list;
}
