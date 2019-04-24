// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.raizlabs.android.dbflow.sql.language;


// Referenced classes of package com.raizlabs.android.dbflow.sql.language:
//			NameAlias

public static class NameAlias$Builder
{

	public NameAlias$Builder as(String s)
	{
		aliasName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field String aliasName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NameAlias build()
	{
		return new NameAlias(this, ((NameAlias._cls1) (null)));
	//    0    0:new             #6   <Class NameAlias>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #56  <Method void NameAlias(NameAlias$Builder, NameAlias$1)>
	//    5    9:areturn         
	}

	public NameAlias$Builder distinct()
	{
		return keyword("DISTINCT");
	//    0    0:aload_0         
	//    1    1:ldc1            #60  <String "DISTINCT">
	//    2    3:invokevirtual   #62  <Method NameAlias$Builder keyword(String)>
	//    3    6:areturn         
	}

	public NameAlias$Builder keyword(String s)
	{
		keyword = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field String keyword>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NameAlias$Builder shouldAddIdentifierToAliasName(boolean flag)
	{
		shouldAddIdentifierToAliasName = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field boolean shouldAddIdentifierToAliasName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NameAlias$Builder shouldAddIdentifierToName(boolean flag)
	{
		shouldAddIdentifierToQuery = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #28  <Field boolean shouldAddIdentifierToQuery>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NameAlias$Builder shouldStripAliasName(boolean flag)
	{
		shouldStripAliasName = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean shouldStripAliasName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NameAlias$Builder shouldStripIdentifier(boolean flag)
	{
		shouldStripIdentifier = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #24  <Field boolean shouldStripIdentifier>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public NameAlias$Builder withTable(String s)
	{
		tableName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #47  <Field String tableName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String aliasName;
	private String keyword;
	private final String name;
	private boolean shouldAddIdentifierToAliasName;
	private boolean shouldAddIdentifierToQuery;
	private boolean shouldStripAliasName;
	private boolean shouldStripIdentifier;
	private String tableName;


/*
	static boolean access$000(NameAlias$Builder namealias$builder)
	{
		return namealias$builder.shouldStripIdentifier;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field boolean shouldStripIdentifier>
	//    2    4:ireturn         
	}

*/


/*
	static String access$100(NameAlias$Builder namealias$builder)
	{
		return namealias$builder.name;
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field String name>
	//    2    4:areturn         
	}

*/


/*
	static String access$200(NameAlias$Builder namealias$builder)
	{
		return namealias$builder.keyword;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field String keyword>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$300(NameAlias$Builder namealias$builder)
	{
		return namealias$builder.shouldStripAliasName;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field boolean shouldStripAliasName>
	//    2    4:ireturn         
	}

*/


/*
	static String access$400(NameAlias$Builder namealias$builder)
	{
		return namealias$builder.aliasName;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field String aliasName>
	//    2    4:areturn         
	}

*/


/*
	static String access$500(NameAlias$Builder namealias$builder)
	{
		return namealias$builder.tableName;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field String tableName>
	//    2    4:areturn         
	}

*/


/*
	static boolean access$600(NameAlias$Builder namealias$builder)
	{
		return namealias$builder.shouldAddIdentifierToQuery;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field boolean shouldAddIdentifierToQuery>
	//    2    4:ireturn         
	}

*/


/*
	static boolean access$700(NameAlias$Builder namealias$builder)
	{
		return namealias$builder.shouldAddIdentifierToAliasName;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field boolean shouldAddIdentifierToAliasName>
	//    2    4:ireturn         
	}

*/

	public NameAlias$Builder(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		shouldStripIdentifier = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #24  <Field boolean shouldStripIdentifier>
		shouldStripAliasName = true;
	//    5    9:aload_0         
	//    6   10:iconst_1        
	//    7   11:putfield        #26  <Field boolean shouldStripAliasName>
		shouldAddIdentifierToQuery = true;
	//    8   14:aload_0         
	//    9   15:iconst_1        
	//   10   16:putfield        #28  <Field boolean shouldAddIdentifierToQuery>
		shouldAddIdentifierToAliasName = true;
	//   11   19:aload_0         
	//   12   20:iconst_1        
	//   13   21:putfield        #30  <Field boolean shouldAddIdentifierToAliasName>
		name = s;
	//   14   24:aload_0         
	//   15   25:aload_1         
	//   16   26:putfield        #32  <Field String name>
	//   17   29:return          
	}
}
