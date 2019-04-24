// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.codec.wmf;


public class MetaObject
{

	public MetaObject()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		type = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int type>
	//    5    9:return          
	}

	public MetaObject(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		type = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int type>
		type = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #20  <Field int type>
	//    8   14:return          
	}

	public int getType()
	{
		return type;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field int type>
	//    2    4:ireturn         
	}

	public static final int META_BRUSH = 2;
	public static final int META_FONT = 3;
	public static final int META_NOT_SUPPORTED = 0;
	public static final int META_PEN = 1;
	public int type;
}
