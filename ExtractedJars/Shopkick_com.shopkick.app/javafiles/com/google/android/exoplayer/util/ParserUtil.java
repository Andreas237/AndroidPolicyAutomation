// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.util;

import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ParserUtil
{

	private ParserUtil()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	public static String getAttributeValue(XmlPullParser xmlpullparser, String s)
	{
		int j = xmlpullparser.getAttributeCount();
	//    0    0:aload_0         
	//    1    1:invokeinterface #17  <Method int XmlPullParser.getAttributeCount()>
	//    2    6:istore_3        
		for(int i = 0; i < j; i++)
	//*   3    7:iconst_0        
	//*   4    8:istore_2        
	//*   5    9:iload_2         
	//*   6   10:iload_3         
	//*   7   11:icmpge          43
			if(s.equals(((Object) (xmlpullparser.getAttributeName(i)))))
	//*   8   14:aload_1         
	//*   9   15:aload_0         
	//*  10   16:iload_2         
	//*  11   17:invokeinterface #21  <Method String XmlPullParser.getAttributeName(int)>
	//*  12   22:invokevirtual   #27  <Method boolean String.equals(Object)>
	//*  13   25:ifeq            36
				return xmlpullparser.getAttributeValue(i);
	//   14   28:aload_0         
	//   15   29:iload_2         
	//   16   30:invokeinterface #29  <Method String XmlPullParser.getAttributeValue(int)>
	//   17   35:areturn         

	//   18   36:iload_2         
	//   19   37:iconst_1        
	//   20   38:iadd            
	//   21   39:istore_2        
	//*  22   40:goto            9
		return null;
	//   23   43:aconst_null     
	//   24   44:areturn         
	}

	public static boolean isEndTag(XmlPullParser xmlpullparser)
		throws XmlPullParserException
	{
		return xmlpullparser.getEventType() == 3;
	//    0    0:aload_0         
	//    1    1:invokeinterface #36  <Method int XmlPullParser.getEventType()>
	//    2    6:iconst_3        
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static boolean isEndTag(XmlPullParser xmlpullparser, String s)
		throws XmlPullParserException
	{
		return isEndTag(xmlpullparser) && xmlpullparser.getName().equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #40  <Method boolean isEndTag(XmlPullParser)>
	//    2    4:ifeq            22
	//    3    7:aload_0         
	//    4    8:invokeinterface #44  <Method String XmlPullParser.getName()>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #27  <Method boolean String.equals(Object)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}

	public static boolean isStartTag(XmlPullParser xmlpullparser)
		throws XmlPullParserException
	{
		return xmlpullparser.getEventType() == 2;
	//    0    0:aload_0         
	//    1    1:invokeinterface #36  <Method int XmlPullParser.getEventType()>
	//    2    6:iconst_2        
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static boolean isStartTag(XmlPullParser xmlpullparser, String s)
		throws XmlPullParserException
	{
		return isStartTag(xmlpullparser) && xmlpullparser.getName().equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #47  <Method boolean isStartTag(XmlPullParser)>
	//    2    4:ifeq            22
	//    3    7:aload_0         
	//    4    8:invokeinterface #44  <Method String XmlPullParser.getName()>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #27  <Method boolean String.equals(Object)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}
}
