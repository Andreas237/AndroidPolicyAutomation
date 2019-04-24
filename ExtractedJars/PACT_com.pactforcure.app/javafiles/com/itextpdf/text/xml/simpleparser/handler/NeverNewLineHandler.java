// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.simpleparser.handler;

import com.itextpdf.text.xml.simpleparser.NewLineHandler;

public class NeverNewLineHandler
	implements NewLineHandler
{

	public NeverNewLineHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void Object()>
	//    2    4:return          
	}

	public boolean isNewLineTag(String s)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}
}
