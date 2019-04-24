// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;


// Referenced classes of package com.itextpdf.text.xml.xmp:
//			XmpSchema, XmpArray

public class XmpBasicSchema extends XmpSchema
{

	public XmpBasicSchema()
	{
		super("xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\"");
	//    0    0:aload_0         
	//    1    1:ldc1            #47  <String "xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\"">
	//    2    3:invokespecial   #50  <Method void XmpSchema(String)>
	//    3    6:return          
	}

	public void addCreateDate(String s)
	{
		setProperty("xmp:CreateDate", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #15  <String "xmp:CreateDate">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #56  <Method Object setProperty(String, String)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void addCreatorTool(String s)
	{
		setProperty("xmp:CreatorTool", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #18  <String "xmp:CreatorTool">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #56  <Method Object setProperty(String, String)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void addIdentifiers(String as[])
	{
		XmpArray xmparray = new XmpArray("rdf:Bag");
	//    0    0:new             #61  <Class XmpArray>
	//    1    3:dup             
	//    2    4:ldc1            #63  <String "rdf:Bag">
	//    3    6:invokespecial   #64  <Method void XmpArray(String)>
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
	//   15   22:invokevirtual   #68  <Method boolean XmpArray.add(Object)>
	//   16   25:pop             

	//   17   26:iload_2         
	//   18   27:iconst_1        
	//   19   28:iadd            
	//   20   29:istore_2        
	//*  21   30:goto            12
		setProperty("xmp:Identifier", xmparray);
	//   22   33:aload_0         
	//   23   34:ldc1            #27  <String "xmp:Identifier">
	//   24   36:aload_3         
	//   25   37:invokevirtual   #71  <Method Object setProperty(String, XmpArray)>
	//   26   40:pop             
	//   27   41:return          
	}

	public void addMetaDataDate(String s)
	{
		setProperty("xmp:MetadataDate", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #30  <String "xmp:MetadataDate">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #56  <Method Object setProperty(String, String)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void addModDate(String s)
	{
		setProperty("xmp:ModifyDate", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #33  <String "xmp:ModifyDate">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #56  <Method Object setProperty(String, String)>
	//    4    7:pop             
	//    5    8:return          
	}

	public void addNickname(String s)
	{
		setProperty("xmp:Nickname", s);
	//    0    0:aload_0         
	//    1    1:ldc1            #36  <String "xmp:Nickname">
	//    2    3:aload_1         
	//    3    4:invokevirtual   #56  <Method Object setProperty(String, String)>
	//    4    7:pop             
	//    5    8:return          
	}

	public static final String ADVISORY = "xmp:Advisory";
	public static final String BASEURL = "xmp:BaseURL";
	public static final String CREATEDATE = "xmp:CreateDate";
	public static final String CREATORTOOL = "xmp:CreatorTool";
	public static final String DEFAULT_XPATH_ID = "xmp";
	public static final String DEFAULT_XPATH_URI = "http://ns.adobe.com/xap/1.0/";
	public static final String IDENTIFIER = "xmp:Identifier";
	public static final String METADATADATE = "xmp:MetadataDate";
	public static final String MODIFYDATE = "xmp:ModifyDate";
	public static final String NICKNAME = "xmp:Nickname";
	public static final String THUMBNAILS = "xmp:Thumbnails";
	private static final long serialVersionUID = 0x8255e63eL;
}
