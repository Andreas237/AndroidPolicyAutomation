// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.database;

import android.net.Uri;

// Referenced classes of package com.facebook.stetho.inspector.database:
//			ContentProviderSchema

public static class ContentProviderSchema$Table
{
	public static class Builder
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

		public Builder name(String s)
		{
			mTableName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #33  <Field String mTableName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder projection(String as[])
		{
			mProjection = as;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #29  <Field String[] mProjection>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder uri(Uri uri1)
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
		static Uri access$500(Builder builder)
		{
			return builder.mUri;
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field Uri mUri>
		//    2    4:areturn         
		}

*/


/*
		static String[] access$600(Builder builder)
		{
			return builder.mProjection;
		//    0    0:aload_0         
		//    1    1:getfield        #29  <Field String[] mProjection>
		//    2    4:areturn         
		}

*/


/*
		static String access$700(Builder builder)
		{
			return builder.mTableName;
		//    0    0:aload_0         
		//    1    1:getfield        #33  <Field String mTableName>
		//    2    4:areturn         
		}

*/

		public Builder()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #20  <Method void Object()>
		//    2    4:return          
		}
	}


	private String mProjection[];
	private String mTableName;
	private Uri mUri;


/*
	static String access$100(ContentProviderSchema$Table contentproviderschema$table)
	{
		return contentproviderschema$table.mTableName;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String mTableName>
	//    2    4:areturn         
	}

*/


/*
	static Uri access$200(ContentProviderSchema$Table contentproviderschema$table)
	{
		return contentproviderschema$table.mUri;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field Uri mUri>
	//    2    4:areturn         
	}

*/


/*
	static String[] access$300(ContentProviderSchema$Table contentproviderschema$table)
	{
		return contentproviderschema$table.mProjection;
	//    0    0:aload_0         
	//    1    1:getfield        #33  <Field String[] mProjection>
	//    2    4:areturn         
	}

*/

	private ContentProviderSchema$Table(Builder builder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		mUri = builder.mUri;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #25  <Method Uri ContentProviderSchema$Table$Builder.access$500(ContentProviderSchema$Table$Builder)>
	//    5    9:putfield        #27  <Field Uri mUri>
		mProjection = builder.mProjection;
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokestatic    #31  <Method String[] ContentProviderSchema$Table$Builder.access$600(ContentProviderSchema$Table$Builder)>
	//    9   17:putfield        #33  <Field String[] mProjection>
		mTableName = builder.mTableName;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokestatic    #37  <Method String ContentProviderSchema$Table$Builder.access$700(ContentProviderSchema$Table$Builder)>
	//   13   25:putfield        #39  <Field String mTableName>
		if(mTableName == null)
	//*  14   28:aload_0         
	//*  15   29:getfield        #39  <Field String mTableName>
	//*  16   32:ifnonnull       46
			mTableName = mUri.getLastPathSegment();
	//   17   35:aload_0         
	//   18   36:aload_0         
	//   19   37:getfield        #27  <Field Uri mUri>
	//   20   40:invokevirtual   #45  <Method String Uri.getLastPathSegment()>
	//   21   43:putfield        #39  <Field String mTableName>
	//   22   46:return          
	}

	ContentProviderSchema$Table(Builder builder, ContentProviderSchema._cls1 _pcls1)
	{
		this(builder);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #49  <Method void ContentProviderSchema$Table(ContentProviderSchema$Table$Builder)>
	//    3    5:return          
	}
}
