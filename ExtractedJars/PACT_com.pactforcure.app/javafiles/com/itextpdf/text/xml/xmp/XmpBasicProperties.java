// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.options.PropertyOptions;

public class XmpBasicProperties
{

	public XmpBasicProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
	//    2    4:return          
	}

	public static void setCreateDate(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.setProperty("http://ns.adobe.com/xap/1.0/", "CreateDate", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "http://ns.adobe.com/xap/1.0/">
	//    2    3:ldc1            #14  <String "CreateDate">
	//    3    5:aload_1         
	//    4    6:invokeinterface #49  <Method void XMPMeta.setProperty(String, String, Object)>
	//    5   11:return          
	}

	public static void setCreatorTool(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.setProperty("http://ns.adobe.com/xap/1.0/", "CreatorTool", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "http://ns.adobe.com/xap/1.0/">
	//    2    3:ldc1            #17  <String "CreatorTool">
	//    3    5:aload_1         
	//    4    6:invokeinterface #49  <Method void XMPMeta.setProperty(String, String, Object)>
	//    5   11:return          
	}

	public static void setIdentifiers(XMPMeta xmpmeta, String as[])
		throws XMPException
	{
		XMPUtils.removeProperties(xmpmeta, "http://purl.org/dc/elements/1.1/", "Identifier", true, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #55  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #20  <String "Identifier">
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #61  <Method void XMPUtils.removeProperties(XMPMeta, String, String, boolean, boolean)>
		for(int i = 0; i < as.length; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:aload_1         
	//*  10   14:arraylength     
	//*  11   15:icmpge          49
			xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "Identifier", new PropertyOptions(512), as[i], ((PropertyOptions) (null)));
	//   12   18:aload_0         
	//   13   19:ldc1            #55  <String "http://purl.org/dc/elements/1.1/">
	//   14   21:ldc1            #20  <String "Identifier">
	//   15   23:new             #63  <Class PropertyOptions>
	//   16   26:dup             
	//   17   27:sipush          512
	//   18   30:invokespecial   #66  <Method void PropertyOptions(int)>
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:aaload          
	//   22   36:aconst_null     
	//   23   37:invokeinterface #70  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>

	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
	//*  28   46:goto            12
	//   29   49:return          
	}

	public static void setMetaDataDate(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.setProperty("http://ns.adobe.com/xap/1.0/", "MetadataDate", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "http://ns.adobe.com/xap/1.0/">
	//    2    3:ldc1            #23  <String "MetadataDate">
	//    3    5:aload_1         
	//    4    6:invokeinterface #49  <Method void XMPMeta.setProperty(String, String, Object)>
	//    5   11:return          
	}

	public static void setModDate(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.setProperty("http://ns.adobe.com/xap/1.0/", "ModifyDate", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "http://ns.adobe.com/xap/1.0/">
	//    2    3:ldc1            #26  <String "ModifyDate">
	//    3    5:aload_1         
	//    4    6:invokeinterface #49  <Method void XMPMeta.setProperty(String, String, Object)>
	//    5   11:return          
	}

	public static void setNickname(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.setProperty("http://ns.adobe.com/xap/1.0/", "Nickname", ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:ldc1            #43  <String "http://ns.adobe.com/xap/1.0/">
	//    2    3:ldc1            #29  <String "Nickname">
	//    3    5:aload_1         
	//    4    6:invokeinterface #49  <Method void XMPMeta.setProperty(String, String, Object)>
	//    5   11:return          
	}

	public static final String ADVISORY = "Advisory";
	public static final String BASEURL = "BaseURL";
	public static final String CREATEDATE = "CreateDate";
	public static final String CREATORTOOL = "CreatorTool";
	public static final String IDENTIFIER = "Identifier";
	public static final String METADATADATE = "MetadataDate";
	public static final String MODIFYDATE = "ModifyDate";
	public static final String NICKNAME = "Nickname";
	public static final String THUMBNAILS = "Thumbnails";
}
