// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssFile

public class CSSFileWrapper
	implements CssFile
{

	public CSSFileWrapper(CssFile cssfile, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		css = cssfile;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #17  <Field CssFile css>
		persistent = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field boolean persistent>
	//    8   14:return          
	}

	public boolean add(String s, Map map)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #24  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public List get(Tag tag)
	{
		return css.get(tag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field CssFile css>
	//    2    4:aload_1         
	//    3    5:invokeinterface #31  <Method List CssFile.get(Tag)>
	//    4   10:areturn         
	}

	public void isPersistent(boolean flag)
	{
		throw new UnsupportedOperationException();
	//    0    0:new             #24  <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:invokespecial   #25  <Method void UnsupportedOperationException()>
	//    3    7:athrow          
	}

	public boolean isPersistent()
	{
		return persistent;
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field boolean persistent>
	//    2    4:ireturn         
	}

	private final CssFile css;
	private final boolean persistent;
}
