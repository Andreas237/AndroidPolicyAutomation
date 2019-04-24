// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.simpleparser.handler;

import com.itextpdf.text.xml.simpleparser.NewLineHandler;
import java.util.HashSet;
import java.util.Set;

public class HTMLNewLineHandler
	implements NewLineHandler
{

	public HTMLNewLineHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #15  <Class HashSet>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void HashSet()>
	//    6   12:putfield        #18  <Field Set newLineTags>
		newLineTags.add("p");
	//    7   15:aload_0         
	//    8   16:getfield        #18  <Field Set newLineTags>
	//    9   19:ldc1            #20  <String "p">
	//   10   21:invokeinterface #26  <Method boolean Set.add(Object)>
	//   11   26:pop             
		newLineTags.add("blockquote");
	//   12   27:aload_0         
	//   13   28:getfield        #18  <Field Set newLineTags>
	//   14   31:ldc1            #28  <String "blockquote">
	//   15   33:invokeinterface #26  <Method boolean Set.add(Object)>
	//   16   38:pop             
		newLineTags.add("br");
	//   17   39:aload_0         
	//   18   40:getfield        #18  <Field Set newLineTags>
	//   19   43:ldc1            #30  <String "br">
	//   20   45:invokeinterface #26  <Method boolean Set.add(Object)>
	//   21   50:pop             
	//   22   51:return          
	}

	public boolean isNewLineTag(String s)
	{
		return newLineTags.contains(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Set newLineTags>
	//    2    4:aload_1         
	//    3    5:invokeinterface #36  <Method boolean Set.contains(Object)>
	//    4   10:ireturn         
	}

	private final Set newLineTags = new HashSet();
}
