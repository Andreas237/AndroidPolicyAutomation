// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp.impl;

import com.itextpdf.xmp.options.AliasOptions;
import com.itextpdf.xmp.properties.XMPAliasInfo;

// Referenced classes of package com.itextpdf.xmp.impl:
//			XMPSchemaRegistryImpl

class XMPSchemaRegistryImpl$1
	implements XMPAliasInfo
{

	public AliasOptions getAliasForm()
	{
		return val$aliasOpts;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field AliasOptions val$aliasOpts>
	//    2    4:areturn         
	}

	public String getNamespace()
	{
		return val$actualNS;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String val$actualNS>
	//    2    4:areturn         
	}

	public String getPrefix()
	{
		return val$actualPrefix;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String val$actualPrefix>
	//    2    4:areturn         
	}

	public String getPropName()
	{
		return val$actualProp;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String val$actualProp>
	//    2    4:areturn         
	}

	public String toString()
	{
		return (new StringBuilder()).append(val$actualPrefix).append(val$actualProp).append(" NS(").append(val$actualNS).append("), FORM (").append(((Object) (getAliasForm()))).append(")").toString();
	//    0    0:new             #44  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #45  <Method void StringBuilder()>
	//    3    7:aload_0         
	//    4    8:getfield        #27  <Field String val$actualPrefix>
	//    5   11:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #29  <Field String val$actualProp>
	//    8   18:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//    9   21:ldc1            #51  <String " NS(">
	//   10   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   11   26:aload_0         
	//   12   27:getfield        #25  <Field String val$actualNS>
	//   13   30:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   14   33:ldc1            #53  <String "), FORM (">
	//   15   35:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   16   38:aload_0         
	//   17   39:invokevirtual   #55  <Method AliasOptions getAliasForm()>
	//   18   42:invokevirtual   #58  <Method StringBuilder StringBuilder.append(Object)>
	//   19   45:ldc1            #60  <String ")">
	//   20   47:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
	//   21   50:invokevirtual   #62  <Method String StringBuilder.toString()>
	//   22   53:areturn         
	}

	final XMPSchemaRegistryImpl this$0;
	final String val$actualNS;
	final String val$actualPrefix;
	final String val$actualProp;
	final AliasOptions val$aliasOpts;

	XMPSchemaRegistryImpl$1()
	{
		this$0 = final_xmpschemaregistryimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field XMPSchemaRegistryImpl this$0>
		val$actualNS = s;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #25  <Field String val$actualNS>
		val$actualPrefix = s1;
	//    6   10:aload_0         
	//    7   11:aload_3         
	//    8   12:putfield        #27  <Field String val$actualPrefix>
		val$actualProp = s2;
	//    9   15:aload_0         
	//   10   16:aload           4
	//   11   18:putfield        #29  <Field String val$actualProp>
		val$aliasOpts = AliasOptions.this;
	//   12   21:aload_0         
	//   13   22:aload           5
	//   14   24:putfield        #31  <Field AliasOptions val$aliasOpts>
		super();
	//   15   27:aload_0         
	//   16   28:invokespecial   #34  <Method void Object()>
	//   17   31:return          
	}
}
