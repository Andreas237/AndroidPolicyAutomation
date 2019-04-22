// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.json;

import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.apollographql.apollo.internal.json:
//			ResponseJsonStreamReader

class ResponseJsonStreamReader$1
	implements jectReader
{

	public volatile Object read(ResponseJsonStreamReader responsejsonstreamreader)
		throws IOException
	{
		return ((Object) (read(responsejsonstreamreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #28  <Method Map read(ResponseJsonStreamReader)>
	//    3    5:areturn         
	}

	public Map read(ResponseJsonStreamReader responsejsonstreamreader)
		throws IOException
	{
		return responsejsonstreamreader.toMap();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #33  <Method Map ResponseJsonStreamReader.toMap()>
	//    2    4:areturn         
	}

	final ResponseJsonStreamReader this$0;

	ResponseJsonStreamReader$1()
	{
		this$0 = ResponseJsonStreamReader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field ResponseJsonStreamReader this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
