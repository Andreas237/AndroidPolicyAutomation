// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;


// Referenced classes of package com.facebook.stetho.inspector.database:
//			ContentProviderSchema

public static class ContentProviderSchema$Builder
{

	public ContentProviderSchema build()
	{
		return new ContentProviderSchema(this, ((ContentProviderSchema._cls1) (null)));
	//    0    0:new             #6   <Class ContentProviderSchema>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #23  <Method void ContentProviderSchema(ContentProviderSchema$Builder, ContentProviderSchema$1)>
	//    5    9:areturn         
	}

	public ContentProviderSchema$Builder table(ContentProviderSchema.Table table1)
	{
		mTable = table1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ContentProviderSchema$Table mTable>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private ContentProviderSchema.Table mTable;


/*
	static ContentProviderSchema.Table access$000(ContentProviderSchema$Builder contentproviderschema$builder)
	{
		return contentproviderschema$builder.mTable;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field ContentProviderSchema$Table mTable>
	//    2    4:areturn         
	}

*/

	public ContentProviderSchema$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}
}
