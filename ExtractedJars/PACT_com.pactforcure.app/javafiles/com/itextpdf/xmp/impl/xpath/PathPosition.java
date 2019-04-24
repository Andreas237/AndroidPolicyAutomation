// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl.xpath;


class PathPosition
{

	PathPosition()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		path = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #17  <Field String path>
		nameStart = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #19  <Field int nameStart>
		nameEnd = 0;
	//    8   14:aload_0         
	//    9   15:iconst_0        
	//   10   16:putfield        #21  <Field int nameEnd>
		stepBegin = 0;
	//   11   19:aload_0         
	//   12   20:iconst_0        
	//   13   21:putfield        #23  <Field int stepBegin>
		stepEnd = 0;
	//   14   24:aload_0         
	//   15   25:iconst_0        
	//   16   26:putfield        #25  <Field int stepEnd>
	//   17   29:return          
	}

	int nameEnd;
	int nameStart;
	public String path;
	int stepBegin;
	int stepEnd;
}
