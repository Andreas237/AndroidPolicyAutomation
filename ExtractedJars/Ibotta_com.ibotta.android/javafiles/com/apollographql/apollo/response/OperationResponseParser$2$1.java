// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.response;

import com.apollographql.apollo.api.Error;
import com.apollographql.apollo.internal.json.ResponseJsonStreamReader;
import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.response:
//			OperationResponseParser

class OperationResponseParser$2$1
	implements com.apollographql.apollo.internal.json.ectReader
{

	public Error read(ResponseJsonStreamReader responsejsonstreamreader)
		throws IOException
	{
		return OperationResponseParser.access$000(this$0, responsejsonstreamreader.toMap());
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field OperationResponseParser$2 this$1>
	//    2    4:getfield        #28  <Field OperationResponseParser OperationResponseParser$2.this$0>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #34  <Method java.util.Map ResponseJsonStreamReader.toMap()>
	//    5   11:invokestatic    #40  <Method Error OperationResponseParser.access$000(OperationResponseParser, java.util.Map)>
	//    6   14:areturn         
	}

	public volatile Object read(ResponseJsonStreamReader responsejsonstreamreader)
		throws IOException
	{
		return ((Object) (read(responsejsonstreamreader)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #43  <Method Error read(ResponseJsonStreamReader)>
	//    3    5:areturn         
	}

	final OperationResponseParser._cls2 this$1;

	OperationResponseParser$2$1()
	{
		this$1 = OperationResponseParser._cls2.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field OperationResponseParser$2 this$1>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}

	// Unreferenced inner class com/apollographql/apollo/response/OperationResponseParser$2

/* anonymous class */
	class OperationResponseParser._cls2
		implements com.apollographql.apollo.internal.json.ResponseJsonStreamReader.ListReader
	{

		public Error read(ResponseJsonStreamReader responsejsonstreamreader)
			throws IOException
		{
			return (Error)responsejsonstreamreader.nextObject(true, ((com.apollographql.apollo.internal.json.ResponseJsonStreamReader.ObjectReader) (new OperationResponseParser._cls2._cls1())));
		//    0    0:aload_1         
		//    1    1:iconst_1        
		//    2    2:new             #14  <Class OperationResponseParser$2$1>
		//    3    5:dup             
		//    4    6:aload_0         
		//    5    7:invokespecial   #31  <Method void OperationResponseParser$2$1(OperationResponseParser$2)>
		//    6   10:invokevirtual   #37  <Method Object ResponseJsonStreamReader.nextObject(boolean, com.apollographql.apollo.internal.json.ResponseJsonStreamReader$ObjectReader)>
		//    7   13:checkcast       #39  <Class Error>
		//    8   16:areturn         
		}

		public volatile Object read(ResponseJsonStreamReader responsejsonstreamreader)
			throws IOException
		{
			return ((Object) (read(responsejsonstreamreader)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #43  <Method Error read(ResponseJsonStreamReader)>
		//    3    5:areturn         
		}

		final OperationResponseParser this$0;

			
			{
				this$0 = OperationResponseParser.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #20  <Field OperationResponseParser this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #23  <Method void Object()>
			//    5    9:return          
			}
	}

}
