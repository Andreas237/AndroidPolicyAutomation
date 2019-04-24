// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;


// Referenced classes of package com.itextpdf.text.xml.xmp:
//			XmpSchema, XmpArray, LangAlt

public class DublinCoreSchema extends XmpSchema
{

	public DublinCoreSchema()
	{
		super("xmlns:dc=\"http://purl.org/dc/elements/1.1/\"");
	//    0    0:aload_0         
	//    1    1:ldc1            #65  <String "xmlns:dc=\"http://purl.org/dc/elements/1.1/\"">
	//    2    3:invokespecial   #68  <Method void XmpSchema(String)>
		setProperty("dc:format", "application/pdf");
	//    3    6:aload_0         
	//    4    7:ldc1            #30  <String "dc:format">
	//    5    9:ldc1            #70  <String "application/pdf">
	//    6   11:invokevirtual   #74  <Method Object setProperty(String, String)>
	//    7   14:pop             
	//    8   15:return          
	}

	public void addAuthor(String s)
	{
		XmpArray xmparray = new XmpArray("rdf:Seq");
	//    0    0:new             #78  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #80  <String "rdf:Seq">
	//    3    6:invokespecial   #81  <Method void XmpArray(String)>
	//    4    9:astore_2        
		xmparray.add(((Object) (s)));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #85  <Method boolean XmpArray.add(Object)>
	//    8   15:pop             
		setProperty("dc:creator", xmparray);
	//    9   16:aload_0         
	//   10   17:ldc1            #15  <String "dc:creator">
	//   11   19:aload_2         
	//   12   20:invokevirtual   #88  <Method Object setProperty(String, XmpArray)>
	//   13   23:pop             
	//   14   24:return          
	}

	public void addAuthor(String as[])
	{
		XmpArray xmparray = new XmpArray("rdf:Seq");
	//    0    0:new             #78  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #80  <String "rdf:Seq">
	//    3    6:invokespecial   #81  <Method void XmpArray(String)>
	//    4    9:astore_3        
		for(int i = 0; i < as.length; i++)
	//*   5   10:iconst_0        
	//*   6   11:istore_2        
	//*   7   12:iload_2         
	//*   8   13:aload_1         
	//*   9   14:arraylength     
	//*  10   15:icmpge          33
			xmparray.add(((Object) (as[i])));
	//   11   18:aload_3         
	//   12   19:aload_1         
	//   13   20:iload_2         
	//   14   21:aaload          
	//   15   22:invokevirtual   #85  <Method boolean XmpArray.add(Object)>
	//   16   25:pop             

	//   17   26:iload_2         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_2        
	//*  21   30:goto            12
		setProperty("dc:creator", xmparray);
	//   22   33:aload_0         
	//   23   34:ldc1            #15  <String "dc:creator">
	//   24   36:aload_3         
	//   25   37:invokevirtual   #88  <Method Object setProperty(String, XmpArray)>
	//   26   40:pop             
	//   27   41:return          
	}

	public void addDescription(LangAlt langalt)
	{
		setProperty("dc:description", langalt);
	//    0    0:aload_0         
	//    1    1:ldc1            #27  <String "dc:description">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #94  <Method Object setProperty(String, LangAlt)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void addDescription(String s)
	{
		XmpArray xmparray = new XmpArray("rdf:Alt");
	//    0    0:new             #78  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #96  <String "rdf:Alt">
	//    3    6:invokespecial   #81  <Method void XmpArray(String)>
	//    4    9:astore_2        
		xmparray.add(((Object) (s)));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #85  <Method boolean XmpArray.add(Object)>
	//    8   15:pop             
		setProperty("dc:description", xmparray);
	//    9   16:aload_0         
	//   10   17:ldc1            #27  <String "dc:description">
	//   11   19:aload_2         
	//   12   20:invokevirtual   #88  <Method Object setProperty(String, XmpArray)>
	//   13   23:pop             
	//   14   24:return          
	}

	public void addPublisher(String s)
	{
		XmpArray xmparray = new XmpArray("rdf:Seq");
	//    0    0:new             #78  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #80  <String "rdf:Seq">
	//    3    6:invokespecial   #81  <Method void XmpArray(String)>
	//    4    9:astore_2        
		xmparray.add(((Object) (s)));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #85  <Method boolean XmpArray.add(Object)>
	//    8   15:pop             
		setProperty("dc:publisher", xmparray);
	//    9   16:aload_0         
	//   10   17:ldc1            #39  <String "dc:publisher">
	//   11   19:aload_2         
	//   12   20:invokevirtual   #88  <Method Object setProperty(String, XmpArray)>
	//   13   23:pop             
	//   14   24:return          
	}

	public void addPublisher(String as[])
	{
		XmpArray xmparray = new XmpArray("rdf:Seq");
	//    0    0:new             #78  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #80  <String "rdf:Seq">
	//    3    6:invokespecial   #81  <Method void XmpArray(String)>
	//    4    9:astore_3        
		for(int i = 0; i < as.length; i++)
	//*   5   10:iconst_0        
	//*   6   11:istore_2        
	//*   7   12:iload_2         
	//*   8   13:aload_1         
	//*   9   14:arraylength     
	//*  10   15:icmpge          33
			xmparray.add(((Object) (as[i])));
	//   11   18:aload_3         
	//   12   19:aload_1         
	//   13   20:iload_2         
	//   14   21:aaload          
	//   15   22:invokevirtual   #85  <Method boolean XmpArray.add(Object)>
	//   16   25:pop             

	//   17   26:iload_2         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_2        
	//*  21   30:goto            12
		setProperty("dc:publisher", xmparray);
	//   22   33:aload_0         
	//   23   34:ldc1            #39  <String "dc:publisher">
	//   24   36:aload_3         
	//   25   37:invokevirtual   #88  <Method Object setProperty(String, XmpArray)>
	//   26   40:pop             
	//   27   41:return          
	}

	public void addSubject(String s)
	{
		XmpArray xmparray = new XmpArray("rdf:Bag");
	//    0    0:new             #78  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #100 <String "rdf:Bag">
	//    3    6:invokespecial   #81  <Method void XmpArray(String)>
	//    4    9:astore_2        
		xmparray.add(((Object) (s)));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #85  <Method boolean XmpArray.add(Object)>
	//    8   15:pop             
		setProperty("dc:subject", xmparray);
	//    9   16:aload_0         
	//   10   17:ldc1            #51  <String "dc:subject">
	//   11   19:aload_2         
	//   12   20:invokevirtual   #88  <Method Object setProperty(String, XmpArray)>
	//   13   23:pop             
	//   14   24:return          
	}

	public void addSubject(String as[])
	{
		XmpArray xmparray = new XmpArray("rdf:Bag");
	//    0    0:new             #78  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #100 <String "rdf:Bag">
	//    3    6:invokespecial   #81  <Method void XmpArray(String)>
	//    4    9:astore_3        
		for(int i = 0; i < as.length; i++)
	//*   5   10:iconst_0        
	//*   6   11:istore_2        
	//*   7   12:iload_2         
	//*   8   13:aload_1         
	//*   9   14:arraylength     
	//*  10   15:icmpge          33
			xmparray.add(((Object) (as[i])));
	//   11   18:aload_3         
	//   12   19:aload_1         
	//   13   20:iload_2         
	//   14   21:aaload          
	//   15   22:invokevirtual   #85  <Method boolean XmpArray.add(Object)>
	//   16   25:pop             

	//   17   26:iload_2         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_2        
	//*  21   30:goto            12
		setProperty("dc:subject", xmparray);
	//   22   33:aload_0         
	//   23   34:ldc1            #51  <String "dc:subject">
	//   24   36:aload_3         
	//   25   37:invokevirtual   #88  <Method Object setProperty(String, XmpArray)>
	//   26   40:pop             
	//   27   41:return          
	}

	public void addTitle(LangAlt langalt)
	{
		setProperty("dc:title", langalt);
	//    0    0:aload_0         
	//    1    1:ldc1            #54  <String "dc:title">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #94  <Method Object setProperty(String, LangAlt)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void addTitle(String s)
	{
		XmpArray xmparray = new XmpArray("rdf:Alt");
	//    0    0:new             #78  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #96  <String "rdf:Alt">
	//    3    6:invokespecial   #81  <Method void XmpArray(String)>
	//    4    9:astore_2        
		xmparray.add(((Object) (s)));
	//    5   10:aload_2         
	//    6   11:aload_1         
	//    7   12:invokevirtual   #85  <Method boolean XmpArray.add(Object)>
	//    8   15:pop             
		setProperty("dc:title", xmparray);
	//    9   16:aload_0         
	//   10   17:ldc1            #54  <String "dc:title">
	//   11   19:aload_2         
	//   12   20:invokevirtual   #88  <Method Object setProperty(String, XmpArray)>
	//   13   23:pop             
	//   14   24:return          
	}

	public static final String CONTRIBUTOR = "dc:contributor";
	public static final String COVERAGE = "dc:coverage";
	public static final String CREATOR = "dc:creator";
	public static final String DATE = "dc:date";
	public static final String DEFAULT_XPATH_ID = "dc";
	public static final String DEFAULT_XPATH_URI = "http://purl.org/dc/elements/1.1/";
	public static final String DESCRIPTION = "dc:description";
	public static final String FORMAT = "dc:format";
	public static final String IDENTIFIER = "dc:identifier";
	public static final String LANGUAGE = "dc:language";
	public static final String PUBLISHER = "dc:publisher";
	public static final String RELATION = "dc:relation";
	public static final String RIGHTS = "dc:rights";
	public static final String SOURCE = "dc:source";
	public static final String SUBJECT = "dc:subject";
	public static final String TITLE = "dc:title";
	public static final String TYPE = "dc:type";
	private static final long serialVersionUID = 0x3fd353eeL;
}
