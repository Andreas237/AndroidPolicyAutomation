// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			ChainedProperties

private static final class ChainedProperties$TagAttributes
{

	final Map attrs;
	final String tag;

	ChainedProperties$TagAttributes(String s, Map map)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		tag = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field String tag>
		attrs = map;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #21  <Field Map attrs>
	//    8   14:return          
	}
}
