// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;

import com.itextpdf.xmp.*;
import com.itextpdf.xmp.options.PropertyOptions;

public class DublinCoreProperties
{

	public DublinCoreProperties()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
	//    2    4:return          
	}

	public static void addAuthor(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "creator", new PropertyOptions(1024), s, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #14  <String "creator">
	//    3    5:new             #63  <Class PropertyOptions>
	//    4    8:dup             
	//    5    9:sipush          1024
	//    6   12:invokespecial   #66  <Method void PropertyOptions(int)>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokeinterface #72  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//   10   22:return          
	}

	public static void addDescription(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "description", new PropertyOptions(2048), s, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #20  <String "description">
	//    3    5:new             #63  <Class PropertyOptions>
	//    4    8:dup             
	//    5    9:sipush          2048
	//    6   12:invokespecial   #66  <Method void PropertyOptions(int)>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokeinterface #72  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//   10   22:return          
	}

	public static void addPublisher(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "publisher", new PropertyOptions(1024), s, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #32  <String "publisher">
	//    3    5:new             #63  <Class PropertyOptions>
	//    4    8:dup             
	//    5    9:sipush          1024
	//    6   12:invokespecial   #66  <Method void PropertyOptions(int)>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokeinterface #72  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//   10   22:return          
	}

	public static void addSubject(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "subject", new PropertyOptions(512), s, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #44  <String "subject">
	//    3    5:new             #63  <Class PropertyOptions>
	//    4    8:dup             
	//    5    9:sipush          512
	//    6   12:invokespecial   #66  <Method void PropertyOptions(int)>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokeinterface #72  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//   10   22:return          
	}

	public static void addTitle(XMPMeta xmpmeta, String s)
		throws XMPException
	{
		xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "title", new PropertyOptions(2048), s, ((PropertyOptions) (null)));
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #47  <String "title">
	//    3    5:new             #63  <Class PropertyOptions>
	//    4    8:dup             
	//    5    9:sipush          2048
	//    6   12:invokespecial   #66  <Method void PropertyOptions(int)>
	//    7   15:aload_1         
	//    8   16:aconst_null     
	//    9   17:invokeinterface #72  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>
	//   10   22:return          
	}

	public static void setAuthor(XMPMeta xmpmeta, String as[])
		throws XMPException
	{
		XMPUtils.removeProperties(xmpmeta, "http://purl.org/dc/elements/1.1/", "creator", true, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #14  <String "creator">
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #85  <Method void XMPUtils.removeProperties(XMPMeta, String, String, boolean, boolean)>
		for(int i = 0; i < as.length; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:aload_1         
	//*  10   14:arraylength     
	//*  11   15:icmpge          49
			xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "creator", new PropertyOptions(1024), as[i], ((PropertyOptions) (null)));
	//   12   18:aload_0         
	//   13   19:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//   14   21:ldc1            #14  <String "creator">
	//   15   23:new             #63  <Class PropertyOptions>
	//   16   26:dup             
	//   17   27:sipush          1024
	//   18   30:invokespecial   #66  <Method void PropertyOptions(int)>
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:aaload          
	//   22   36:aconst_null     
	//   23   37:invokeinterface #72  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>

	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
	//*  28   46:goto            12
	//   29   49:return          
	}

	public static void setDescription(XMPMeta xmpmeta, String s, String s1, String s2)
		throws XMPException
	{
		xmpmeta.setLocalizedText("http://purl.org/dc/elements/1.1/", "description", s1, s2, s);
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #20  <String "description">
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokeinterface #91  <Method void XMPMeta.setLocalizedText(String, String, String, String, String)>
	//    7   13:return          
	}

	public static void setPublisher(XMPMeta xmpmeta, String as[])
		throws XMPException
	{
		XMPUtils.removeProperties(xmpmeta, "http://purl.org/dc/elements/1.1/", "publisher", true, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #32  <String "publisher">
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #85  <Method void XMPUtils.removeProperties(XMPMeta, String, String, boolean, boolean)>
		for(int i = 0; i < as.length; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:aload_1         
	//*  10   14:arraylength     
	//*  11   15:icmpge          49
			xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "publisher", new PropertyOptions(1024), as[i], ((PropertyOptions) (null)));
	//   12   18:aload_0         
	//   13   19:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//   14   21:ldc1            #32  <String "publisher">
	//   15   23:new             #63  <Class PropertyOptions>
	//   16   26:dup             
	//   17   27:sipush          1024
	//   18   30:invokespecial   #66  <Method void PropertyOptions(int)>
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:aaload          
	//   22   36:aconst_null     
	//   23   37:invokeinterface #72  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>

	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
	//*  28   46:goto            12
	//   29   49:return          
	}

	public static void setSubject(XMPMeta xmpmeta, String as[])
		throws XMPException
	{
		XMPUtils.removeProperties(xmpmeta, "http://purl.org/dc/elements/1.1/", "subject", true, true);
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #44  <String "subject">
	//    3    5:iconst_1        
	//    4    6:iconst_1        
	//    5    7:invokestatic    #85  <Method void XMPUtils.removeProperties(XMPMeta, String, String, boolean, boolean)>
		for(int i = 0; i < as.length; i++)
	//*   6   10:iconst_0        
	//*   7   11:istore_2        
	//*   8   12:iload_2         
	//*   9   13:aload_1         
	//*  10   14:arraylength     
	//*  11   15:icmpge          49
			xmpmeta.appendArrayItem("http://purl.org/dc/elements/1.1/", "subject", new PropertyOptions(512), as[i], ((PropertyOptions) (null)));
	//   12   18:aload_0         
	//   13   19:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//   14   21:ldc1            #44  <String "subject">
	//   15   23:new             #63  <Class PropertyOptions>
	//   16   26:dup             
	//   17   27:sipush          512
	//   18   30:invokespecial   #66  <Method void PropertyOptions(int)>
	//   19   33:aload_1         
	//   20   34:iload_2         
	//   21   35:aaload          
	//   22   36:aconst_null     
	//   23   37:invokeinterface #72  <Method void XMPMeta.appendArrayItem(String, String, PropertyOptions, String, PropertyOptions)>

	//   24   42:iload_2         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_2        
	//*  28   46:goto            12
	//   29   49:return          
	}

	public static void setTitle(XMPMeta xmpmeta, String s, String s1, String s2)
		throws XMPException
	{
		xmpmeta.setLocalizedText("http://purl.org/dc/elements/1.1/", "title", s1, s2, s);
	//    0    0:aload_0         
	//    1    1:ldc1            #61  <String "http://purl.org/dc/elements/1.1/">
	//    2    3:ldc1            #47  <String "title">
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload_1         
	//    6    8:invokeinterface #91  <Method void XMPMeta.setLocalizedText(String, String, String, String, String)>
	//    7   13:return          
	}

	public static final String CONTRIBUTOR = "contributor";
	public static final String COVERAGE = "coverage";
	public static final String CREATOR = "creator";
	public static final String DATE = "date";
	public static final String DESCRIPTION = "description";
	public static final String FORMAT = "format";
	public static final String IDENTIFIER = "identifier";
	public static final String LANGUAGE = "language";
	public static final String PUBLISHER = "publisher";
	public static final String RELATION = "relation";
	public static final String RIGHTS = "rights";
	public static final String SOURCE = "source";
	public static final String SUBJECT = "subject";
	public static final String TITLE = "title";
	public static final String TYPE = "type";
}
