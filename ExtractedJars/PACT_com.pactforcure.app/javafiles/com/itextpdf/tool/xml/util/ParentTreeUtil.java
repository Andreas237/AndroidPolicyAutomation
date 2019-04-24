// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.util;

import com.itextpdf.tool.xml.Tag;
import java.util.ArrayList;
import java.util.List;

public class ParentTreeUtil
{

	public ParentTreeUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public List getParentTagTree(Tag tag, List list)
	{
		list = ((List) (new ArrayList()));
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore_2        
		for(tag = tag.getParent(); tag != null && !tag.getName().equals("html"); tag = tag.getParent())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #20  <Method Tag Tag.getParent()>
	//*   6   12:astore_1        
	//*   7   13:aload_1         
	//*   8   14:ifnull          45
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #24  <Method String Tag.getName()>
	//*  11   21:ldc1            #26  <String "html">
	//*  12   23:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  13   26:ifne            45
			list.add(((Object) (tag)));
	//   14   29:aload_2         
	//   15   30:aload_1         
	//   16   31:invokeinterface #37  <Method boolean List.add(Object)>
	//   17   36:pop             

	//   18   37:aload_1         
	//   19   38:invokevirtual   #20  <Method Tag Tag.getParent()>
	//   20   41:astore_1        
	//*  21   42:goto            13
		return list;
	//   22   45:aload_2         
	//   23   46:areturn         
	}

	public List getParentTree(Tag tag)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void ArrayList()>
	//    3    7:astore_2        
		for(tag = tag.getParent(); tag != null && !tag.getName().equals("body"); tag = tag.getParent())
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #20  <Method Tag Tag.getParent()>
	//*   6   12:astore_1        
	//*   7   13:aload_1         
	//*   8   14:ifnull          48
	//*   9   17:aload_1         
	//*  10   18:invokevirtual   #24  <Method String Tag.getName()>
	//*  11   21:ldc1            #43  <String "body">
	//*  12   23:invokevirtual   #32  <Method boolean String.equals(Object)>
	//*  13   26:ifne            48
			((List) (arraylist)).add(((Object) (tag.getName())));
	//   14   29:aload_2         
	//   15   30:aload_1         
	//   16   31:invokevirtual   #24  <Method String Tag.getName()>
	//   17   34:invokeinterface #37  <Method boolean List.add(Object)>
	//   18   39:pop             

	//   19   40:aload_1         
	//   20   41:invokevirtual   #20  <Method Tag Tag.getParent()>
	//   21   44:astore_1        
	//*  22   45:goto            13
		return ((List) (arraylist));
	//   23   48:aload_2         
	//   24   49:areturn         
	}
}
