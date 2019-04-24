// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.upstream;


// Referenced classes of package com.google.android.exoplayer2.upstream:
//			HttpDataSource, DataSource

public static abstract class HttpDataSource$BaseFactory
	implements HttpDataSource.Factory
{

	public final void clearAllDefaultRequestProperties()
	{
		defaultRequestProperties.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//    2    4:invokevirtual   #26  <Method void HttpDataSource$RequestProperties.clear()>
	//    3    7:return          
	}

	public final void clearDefaultRequestProperty(String s)
	{
		defaultRequestProperties.remove(s);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #32  <Method void HttpDataSource$RequestProperties.remove(String)>
	//    4    8:return          
	}

	public volatile DataSource createDataSource()
	{
		return ((DataSource) (createDataSource()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #37  <Method HttpDataSource createDataSource()>
	//    2    4:areturn         
	}

	public final HttpDataSource createDataSource()
	{
		return createDataSourceInternal(defaultRequestProperties);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #20  <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//    3    5:invokevirtual   #41  <Method HttpDataSource createDataSourceInternal(HttpDataSource$RequestProperties)>
	//    4    8:areturn         
	}

	protected abstract HttpDataSource createDataSourceInternal(rties rties);

	public final rties getDefaultRequestProperties()
	{
		return defaultRequestProperties;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//    2    4:areturn         
	}

	public final void setDefaultRequestProperty(String s, String s1)
	{
		defaultRequestProperties.set(s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #48  <Method void HttpDataSource$RequestProperties.set(String, String)>
	//    5    9:return          
	}

	private final rties defaultRequestProperties = new rties();

	public HttpDataSource$BaseFactory()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HttpDataSource$RequestProperties>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HttpDataSource$RequestProperties()>
	//    6   12:putfield        #20  <Field HttpDataSource$RequestProperties defaultRequestProperties>
	//    7   15:return          
	}
}
