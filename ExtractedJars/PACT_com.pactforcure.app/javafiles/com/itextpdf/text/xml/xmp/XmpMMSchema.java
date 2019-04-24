// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.xmp;


// Referenced classes of package com.itextpdf.text.xml.xmp:
//			XmpSchema

public class XmpMMSchema extends XmpSchema
{

	public XmpMMSchema()
	{
		super("xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\"");
	//    0    0:aload_0         
	//    1    1:ldc1            #56  <String "xmlns:xmpMM=\"http://ns.adobe.com/xap/1.0/mm/\"">
	//    2    3:invokespecial   #59  <Method void XmpSchema(String)>
	//    3    6:return          
	}

	public static final String DEFAULT_XPATH_ID = "xmpMM";
	public static final String DEFAULT_XPATH_URI = "http://ns.adobe.com/xap/1.0/mm/";
	public static final String DERIVEDFROM = "xmpMM:DerivedFrom";
	public static final String DOCUMENTID = "xmpMM:DocumentID";
	public static final String HISTORY = "xmpMM:History";
	public static final String MANAGEDFROM = "xmpMM:ManagedFrom";
	public static final String MANAGER = "xmpMM:Manager";
	public static final String MANAGERVARIANT = "xmpMM:ManagerVariant";
	public static final String MANAGETO = "xmpMM:ManageTo";
	public static final String MANAGEUI = "xmpMM:ManageUI";
	public static final String RENDITIONCLASS = "xmpMM:RenditionClass";
	public static final String RENDITIONPARAMS = "xmpMM:RenditionParams";
	public static final String VERSIONID = "xmpMM:VersionID";
	public static final String VERSIONS = "xmpMM:Versions";
	private static final long serialVersionUID = 0xf8c3e6aeL;
}
