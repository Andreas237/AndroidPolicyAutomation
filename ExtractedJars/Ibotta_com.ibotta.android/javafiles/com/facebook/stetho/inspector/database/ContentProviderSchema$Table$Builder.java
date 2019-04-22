// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;

import android.net.Uri;

// Referenced classes of package com.facebook.stetho.inspector.database:
//			ContentProviderSchema

public static class ContentProviderSchema$Table$Builder
{

	public ContentProviderSchema.Table build()
	{
		return new ContentProviderSchema.Table(this, ((ContentProviderSchema._cls1) (null)));
	//    0    0:new             #6   <Class ContentProviderSchema$Table>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:invokespecial   #38  <Method void ContentProviderSchema$Table(ContentProviderSchema$Table$Builder, ContentProviderSchema$1)>
	//    5    9:areturn         
	}

	public ContentProviderSchema$Table$Builder name(String s)
	{
		mTableName = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #33  <Field String mTableName>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ContentProviderSchema$Table$Builder projection(String as[])
	{
		mProjection = as;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #29  <Field String[] mProjection>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ContentProviderSchema$Table$Builder uri(Uri uri1)
	{
		mUri = uri1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #25  <Field Uri mUri>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	private String mProjection[];
	private String mTableName;
	private Uri mUri;


/*
	static Uri access$500(ContentProviderSchema$Table$Builder contentproviderschema$table$builder)
	{
		return contentproviderschema$table$builder.mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field Uri mUri>
	//    2    4:areturn         
	}

*/


/*
	static String[] access$600(ContentProviderSchema$Table$Builder contentproviderschema$table$builder)
	{
		return contentproviderschema$table$builder.mProjection;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field String[] mProjection>
	//    2    4:areturn         
	}

*/


/*
	static String access$700(ContentProviderSchema$Table$Builder contentproviderschema$table$builder)
	{
		return contentproviderschema$table$builder.mTableName;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String mTableName>
	//    2    4:areturn         
	}

*/

	public ContentProviderSchema$Table$Builder()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}
}
