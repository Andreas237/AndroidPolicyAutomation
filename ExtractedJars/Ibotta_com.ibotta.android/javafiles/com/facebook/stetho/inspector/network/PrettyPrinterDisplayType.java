// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.network;


public final class PrettyPrinterDisplayType extends Enum
{

	private PrettyPrinterDisplayType(String s, int i, com.facebook.stetho.inspector.protocol.module.Page.ResourceType resourcetype)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #42  <Method void Enum(String, int)>
		mResourceType = resourcetype;
	//    4    6:aload_0         
	//    5    7:aload_3         
	//    6    8:putfield        #44  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType mResourceType>
	//    7   11:return          
	}

	public static PrettyPrinterDisplayType valueOf(String s)
	{
		return (PrettyPrinterDisplayType)Enum.valueOf(com/facebook/stetho/inspector/network/PrettyPrinterDisplayType, s);
	//    0    0:ldc1            #2   <Class PrettyPrinterDisplayType>
	//    1    2:aload_0         
	//    2    3:invokestatic    #51  <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class PrettyPrinterDisplayType>
	//    4    9:areturn         
	}

	public static PrettyPrinterDisplayType[] values()
	{
		return (PrettyPrinterDisplayType[])((PrettyPrinterDisplayType []) ($VALUES)).clone();
	//    0    0:getstatic       #38  <Field PrettyPrinterDisplayType[] $VALUES>
	//    1    3:invokevirtual   #58  <Method Object _5B_Lcom.facebook.stetho.inspector.network.PrettyPrinterDisplayType_3B_.clone()>
	//    2    6:checkcast       #54  <Class PrettyPrinterDisplayType[]>
	//    3    9:areturn         
	}

	public com.facebook.stetho.inspector.protocol.module.Page.ResourceType getResourceType()
	{
		return mResourceType;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType mResourceType>
	//    2    4:areturn         
	}

	private static final PrettyPrinterDisplayType $VALUES[];
	public static final PrettyPrinterDisplayType HTML;
	public static final PrettyPrinterDisplayType JSON;
	public static final PrettyPrinterDisplayType TEXT;
	private final com.facebook.stetho.inspector.protocol.module.Page.ResourceType mResourceType;

	static 
	{
		JSON = new PrettyPrinterDisplayType("JSON", 0, com.facebook.stetho.inspector.protocol.module.Page.ResourceType.XHR);
	//    0    0:new             #2   <Class PrettyPrinterDisplayType>
	//    1    3:dup             
	//    2    4:ldc1            #16  <String "JSON">
	//    3    6:iconst_0        
	//    4    7:getstatic       #21  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.XHR>
	//    5   10:invokespecial   #25  <Method void PrettyPrinterDisplayType(String, int, com.facebook.stetho.inspector.protocol.module.Page$ResourceType)>
	//    6   13:putstatic       #27  <Field PrettyPrinterDisplayType JSON>
		HTML = new PrettyPrinterDisplayType("HTML", 1, com.facebook.stetho.inspector.protocol.module.Page.ResourceType.DOCUMENT);
	//    7   16:new             #2   <Class PrettyPrinterDisplayType>
	//    8   19:dup             
	//    9   20:ldc1            #28  <String "HTML">
	//   10   22:iconst_1        
	//   11   23:getstatic       #31  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.DOCUMENT>
	//   12   26:invokespecial   #25  <Method void PrettyPrinterDisplayType(String, int, com.facebook.stetho.inspector.protocol.module.Page$ResourceType)>
	//   13   29:putstatic       #33  <Field PrettyPrinterDisplayType HTML>
		TEXT = new PrettyPrinterDisplayType("TEXT", 2, com.facebook.stetho.inspector.protocol.module.Page.ResourceType.DOCUMENT);
	//   14   32:new             #2   <Class PrettyPrinterDisplayType>
	//   15   35:dup             
	//   16   36:ldc1            #34  <String "TEXT">
	//   17   38:iconst_2        
	//   18   39:getstatic       #31  <Field com.facebook.stetho.inspector.protocol.module.Page$ResourceType com.facebook.stetho.inspector.protocol.module.Page$ResourceType.DOCUMENT>
	//   19   42:invokespecial   #25  <Method void PrettyPrinterDisplayType(String, int, com.facebook.stetho.inspector.protocol.module.Page$ResourceType)>
	//   20   45:putstatic       #36  <Field PrettyPrinterDisplayType TEXT>
		$VALUES = (new PrettyPrinterDisplayType[] {
			JSON, HTML, TEXT
		});
	//   21   48:iconst_3        
	//   22   49:anewarray       PrettyPrinterDisplayType[]
	//   23   52:dup             
	//   24   53:iconst_0        
	//   25   54:getstatic       #27  <Field PrettyPrinterDisplayType JSON>
	//   26   57:aastore         
	//   27   58:dup             
	//   28   59:iconst_1        
	//   29   60:getstatic       #33  <Field PrettyPrinterDisplayType HTML>
	//   30   63:aastore         
	//   31   64:dup             
	//   32   65:iconst_2        
	//   33   66:getstatic       #36  <Field PrettyPrinterDisplayType TEXT>
	//   34   69:aastore         
	//   35   70:putstatic       #38  <Field PrettyPrinterDisplayType[] $VALUES>
	//*  36   73:return          
	}
}
