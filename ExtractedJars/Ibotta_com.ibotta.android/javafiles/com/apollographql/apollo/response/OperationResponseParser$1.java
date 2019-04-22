// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.response;

import com.apollographql.apollo.api.Operation;
import com.apollographql.apollo.api.ResponseFieldMapper;
import com.apollographql.apollo.internal.field.MapFieldValueResolver;
import com.apollographql.apollo.internal.json.ResponseJsonStreamReader;
import com.apollographql.apollo.internal.response.RealResponseReader;
import java.io.IOException;

// Referenced classes of package com.apollographql.apollo.response:
//			OperationResponseParser

class OperationResponseParser$1
	implements com.apollographql.apollo.internal.json.bjectReader
{

	public Object read(ResponseJsonStreamReader responsejsonstreamreader)
		throws IOException
	{
		responsejsonstreamreader = ((ResponseJsonStreamReader) (responsejsonstreamreader.toMap()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #32  <Method java.util.Map ResponseJsonStreamReader.toMap()>
	//    2    4:astore_1        
		responsejsonstreamreader = ((ResponseJsonStreamReader) (new RealResponseReader(operation.variables(), ((Object) (responsejsonstreamreader)), ((com.apollographql.apollo.internal.field.FieldValueResolver) (new MapFieldValueResolver())), scalarTypeAdapters, ((com.apollographql.apollo.internal.response.ResolveDelegate) (responseNormalizer)))));
	//    3    5:new             #34  <Class RealResponseReader>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:getfield        #18  <Field OperationResponseParser this$0>
	//    7   13:getfield        #38  <Field Operation OperationResponseParser.operation>
	//    8   16:invokeinterface #44  <Method com.apollographql.apollo.api.Operation$Variables Operation.variables()>
	//    9   21:aload_1         
	//   10   22:new             #46  <Class MapFieldValueResolver>
	//   11   25:dup             
	//   12   26:invokespecial   #47  <Method void MapFieldValueResolver()>
	//   13   29:aload_0         
	//   14   30:getfield        #18  <Field OperationResponseParser this$0>
	//   15   33:getfield        #51  <Field ScalarTypeAdapters OperationResponseParser.scalarTypeAdapters>
	//   16   36:aload_0         
	//   17   37:getfield        #18  <Field OperationResponseParser this$0>
	//   18   40:getfield        #55  <Field com.apollographql.apollo.internal.cache.normalized.ResponseNormalizer OperationResponseParser.responseNormalizer>
	//   19   43:invokespecial   #58  <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, ScalarTypeAdapters, com.apollographql.apollo.internal.response.ResolveDelegate)>
	//   20   46:astore_1        
		return responseFieldMapper.map(((com.apollographql.apollo.api.ResponseReader) (responsejsonstreamreader)));
	//   21   47:aload_0         
	//   22   48:getfield        #18  <Field OperationResponseParser this$0>
	//   23   51:getfield        #62  <Field ResponseFieldMapper OperationResponseParser.responseFieldMapper>
	//   24   54:aload_1         
	//   25   55:invokeinterface #68  <Method Object ResponseFieldMapper.map(com.apollographql.apollo.api.ResponseReader)>
	//   26   60:areturn         
	}

	final OperationResponseParser this$0;

	OperationResponseParser$1()
	{
		this$0 = OperationResponseParser.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #18  <Field OperationResponseParser this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #21  <Method void Object()>
	//    5    9:return          
	}
}
