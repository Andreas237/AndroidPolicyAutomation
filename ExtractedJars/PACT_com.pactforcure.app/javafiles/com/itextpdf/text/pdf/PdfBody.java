// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf;

import com.itextpdf.text.*;
import java.util.List;

public class PdfBody extends Rectangle
	implements Element
{

	public PdfBody(Rectangle rectangle)
	{
		super(rectangle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #10  <Method void Rectangle(Rectangle)>
	//    3    5:return          
	}

	public List getChunks()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public boolean isContent()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isNestable()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean process(ElementListener elementlistener)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public int type()
	{
		return 38;
	//    0    0:bipush          38
	//    1    2:ireturn         
	}
}
