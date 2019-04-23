// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.engine;

import com.bumptech.glide.load.DataSource;

// Referenced classes of package com.bumptech.glide.load.engine:
//			DecodeJob, Resource

private final class DecodeJob$DecodeCallback
	implements 
{

	public Resource onResourceDecoded(Resource resource)
	{
		return DecodeJob.this.onResourceDecoded(dataSource, resource);
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field DecodeJob this$0>
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field DataSource dataSource>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #30  <Method Resource DecodeJob.onResourceDecoded(DataSource, Resource)>
	//    6   12:areturn         
	}

	private final DataSource dataSource;
	final DecodeJob this$0;

	DecodeJob$DecodeCallback(DataSource datasource)
	{
		this$0 = DecodeJob.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field DecodeJob this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
		dataSource = datasource;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field DataSource dataSource>
	//    8   14:return          
	}
}
