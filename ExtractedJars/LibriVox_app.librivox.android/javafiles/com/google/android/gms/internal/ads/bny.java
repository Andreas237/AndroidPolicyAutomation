// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import org.xmlpull.v1.XmlPullParser;

public final class bny
{

	public static boolean a(XmlPullParser xmlpullparser)
	{
		return xmlpullparser.getEventType() == 2;
	//    0    0:aload_0         
	//    1    1:invokeinterface #12  <Method int XmlPullParser.getEventType()>
	//    2    6:iconst_2        
	//    3    7:icmpne          12
	//    4   10:iconst_1        
	//    5   11:ireturn         
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	public static boolean a(XmlPullParser xmlpullparser, String s)
	{
		return xmlpullparser.getEventType() == 3 && xmlpullparser.getName().equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokeinterface #12  <Method int XmlPullParser.getEventType()>
	//    2    6:iconst_3        
	//    3    7:icmpne          25
	//    4   10:aload_0         
	//    5   11:invokeinterface #18  <Method String XmlPullParser.getName()>
	//    6   16:aload_1         
	//    7   17:invokevirtual   #24  <Method boolean String.equals(Object)>
	//    8   20:ifeq            25
	//    9   23:iconst_1        
	//   10   24:ireturn         
	//   11   25:iconst_0        
	//   12   26:ireturn         
	}

	public static boolean b(XmlPullParser xmlpullparser, String s)
	{
		return a(xmlpullparser) && xmlpullparser.getName().equals(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #27  <Method boolean a(XmlPullParser)>
	//    2    4:ifeq            22
	//    3    7:aload_0         
	//    4    8:invokeinterface #18  <Method String XmlPullParser.getName()>
	//    5   13:aload_1         
	//    6   14:invokevirtual   #24  <Method boolean String.equals(Object)>
	//    7   17:ifeq            22
	//    8   20:iconst_1        
	//    9   21:ireturn         
	//   10   22:iconst_0        
	//   11   23:ireturn         
	}
}
