// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.response;

import com.apollographql.apollo.CustomTypeAdapter;
import com.apollographql.apollo.api.ResponseFieldMarshaller;
import com.apollographql.apollo.api.ScalarType;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.math.BigDecimal;

// Referenced classes of package com.apollographql.apollo.internal.response:
//			RealResponseWriter

private static final class RealResponseWriter$ListItemWriter
	implements com.apollographql.apollo.api.ResponseWriter.ListItemWriter
{

	public void writeBoolean(Object obj)
	{
		value = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Object value>
	//    3    5:return          
	}

	public void writeCustom(ScalarType scalartype, Object obj)
	{
		scalartype = ((ScalarType) (scalarTypeAdapters.adapterFor(scalartype)));
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field ScalarTypeAdapters scalarTypeAdapters>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method CustomTypeAdapter ScalarTypeAdapters.adapterFor(ScalarType)>
	//    4    8:astore_1        
		if(obj != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          24
			scalartype = ((ScalarType) (((CustomTypeAdapter) (scalartype)).encode(obj)));
	//    7   13:aload_1         
	//    8   14:aload_2         
	//    9   15:invokeinterface #46  <Method String CustomTypeAdapter.encode(Object)>
	//   10   20:astore_1        
		else
	//*  11   21:goto            26
			scalartype = null;
	//   12   24:aconst_null     
	//   13   25:astore_1        
		value = ((Object) (scalartype));
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:putfield        #30  <Field Object value>
	//   17   31:return          
	}

	public void writeDouble(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			obj = ((Object) (BigDecimal.valueOf(((Double)obj).doubleValue())));
	//    2    4:aload_1         
	//    3    5:checkcast       #49  <Class Double>
	//    4    8:invokevirtual   #53  <Method double Double.doubleValue()>
	//    5   11:invokestatic    #59  <Method BigDecimal BigDecimal.valueOf(double)>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			obj = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		value = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #30  <Field Object value>
	//   13   25:return          
	}

	public void writeInt(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          19
			obj = ((Object) (BigDecimal.valueOf(((Integer)obj).intValue())));
	//    2    4:aload_1         
	//    3    5:checkcast       #62  <Class Integer>
	//    4    8:invokevirtual   #66  <Method int Integer.intValue()>
	//    5   11:i2l             
	//    6   12:invokestatic    #69  <Method BigDecimal BigDecimal.valueOf(long)>
	//    7   15:astore_1        
		else
	//*   8   16:goto            21
			obj = null;
	//    9   19:aconst_null     
	//   10   20:astore_1        
		value = obj;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #30  <Field Object value>
	//   14   26:return          
	}

	public void writeLong(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          18
			obj = ((Object) (BigDecimal.valueOf(((Long)obj).longValue())));
	//    2    4:aload_1         
	//    3    5:checkcast       #72  <Class Long>
	//    4    8:invokevirtual   #76  <Method long Long.longValue()>
	//    5   11:invokestatic    #69  <Method BigDecimal BigDecimal.valueOf(long)>
	//    6   14:astore_1        
		else
	//*   7   15:goto            20
			obj = null;
	//    8   18:aconst_null     
	//    9   19:astore_1        
		value = obj;
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:putfield        #30  <Field Object value>
	//   13   25:return          
	}

	public void writeObject(ResponseFieldMarshaller responsefieldmarshaller)
	{
		RealResponseWriter realresponsewriter = new RealResponseWriter(operationVariables, scalarTypeAdapters);
	//    0    0:new             #8   <Class RealResponseWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #22  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//    4    8:aload_0         
	//    5    9:getfield        #24  <Field ScalarTypeAdapters scalarTypeAdapters>
	//    6   12:invokespecial   #80  <Method void RealResponseWriter(com.apollographql.apollo.api.Operation$Variables, ScalarTypeAdapters)>
	//    7   15:astore_2        
		responsefieldmarshaller.marshal(((com.apollographql.apollo.api.ResponseWriter) (realresponsewriter)));
	//    8   16:aload_1         
	//    9   17:aload_2         
	//   10   18:invokeinterface #86  <Method void ResponseFieldMarshaller.marshal(com.apollographql.apollo.api.ResponseWriter)>
		value = ((Object) (realresponsewriter.buffer));
	//   11   23:aload_0         
	//   12   24:aload_2         
	//   13   25:getfield        #90  <Field java.util.Map RealResponseWriter.buffer>
	//   14   28:putfield        #30  <Field Object value>
	//   15   31:return          
	}

	public void writeString(Object obj)
	{
		value = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field Object value>
	//    3    5:return          
	}

	final com.apollographql.apollo.api.Operation.Variables operationVariables;
	final ScalarTypeAdapters scalarTypeAdapters;
	Object value;

	RealResponseWriter$ListItemWriter(com.apollographql.apollo.api.Operation.Variables variables, ScalarTypeAdapters scalartypeadapters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		operationVariables = variables;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
		scalarTypeAdapters = scalartypeadapters;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ScalarTypeAdapters scalarTypeAdapters>
	//    8   14:return          
	}
}
