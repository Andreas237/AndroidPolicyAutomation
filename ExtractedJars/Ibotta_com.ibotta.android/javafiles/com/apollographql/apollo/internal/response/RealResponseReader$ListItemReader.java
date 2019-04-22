// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.response;

import com.apollographql.apollo.CustomTypeAdapter;
import com.apollographql.apollo.api.ResponseField;
import com.apollographql.apollo.api.ScalarType;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.math.BigDecimal;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.response:
//			RealResponseReader, ResolveDelegate

private class RealResponseReader$ListItemReader
	implements com.apollographql.apollo.api.ResponseReader.ListItemReader
{

	public Boolean readBoolean()
	{
		resolveDelegate.didResolveScalar(value);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealResponseReader this$0>
	//    2    4:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Object value>
	//    5   11:invokeinterface #39  <Method void ResolveDelegate.didResolveScalar(Object)>
		return (Boolean)value;
	//    6   16:aload_0         
	//    7   17:getfield        #26  <Field Object value>
	//    8   20:checkcast       #41  <Class Boolean>
	//    9   23:areturn         
	}

	public Object readCustomType(ScalarType scalartype)
	{
		scalartype = ((ScalarType) (scalarTypeAdapters.adapterFor(scalartype)));
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealResponseReader this$0>
	//    2    4:getfield        #47  <Field ScalarTypeAdapters RealResponseReader.scalarTypeAdapters>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #53  <Method CustomTypeAdapter ScalarTypeAdapters.adapterFor(ScalarType)>
	//    5   11:astore_1        
		resolveDelegate.didResolveScalar(value);
	//    6   12:aload_0         
	//    7   13:getfield        #19  <Field RealResponseReader this$0>
	//    8   16:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//    9   19:aload_0         
	//   10   20:getfield        #26  <Field Object value>
	//   11   23:invokeinterface #39  <Method void ResolveDelegate.didResolveScalar(Object)>
		return ((CustomTypeAdapter) (scalartype)).decode(RealResponseReader.access$000(value));
	//   12   28:aload_1         
	//   13   29:aload_0         
	//   14   30:getfield        #26  <Field Object value>
	//   15   33:invokestatic    #57  <Method String RealResponseReader.access$000(Object)>
	//   16   36:invokeinterface #63  <Method Object CustomTypeAdapter.decode(String)>
	//   17   41:areturn         
	}

	public Double readDouble()
	{
		resolveDelegate.didResolveScalar(value);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealResponseReader this$0>
	//    2    4:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Object value>
	//    5   11:invokeinterface #39  <Method void ResolveDelegate.didResolveScalar(Object)>
		return Double.valueOf(((BigDecimal)value).doubleValue());
	//    6   16:aload_0         
	//    7   17:getfield        #26  <Field Object value>
	//    8   20:checkcast       #69  <Class BigDecimal>
	//    9   23:invokevirtual   #73  <Method double BigDecimal.doubleValue()>
	//   10   26:invokestatic    #79  <Method Double Double.valueOf(double)>
	//   11   29:areturn         
	}

	public Integer readInt()
	{
		resolveDelegate.didResolveScalar(value);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealResponseReader this$0>
	//    2    4:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Object value>
	//    5   11:invokeinterface #39  <Method void ResolveDelegate.didResolveScalar(Object)>
		return Integer.valueOf(((BigDecimal)value).intValue());
	//    6   16:aload_0         
	//    7   17:getfield        #26  <Field Object value>
	//    8   20:checkcast       #69  <Class BigDecimal>
	//    9   23:invokevirtual   #85  <Method int BigDecimal.intValue()>
	//   10   26:invokestatic    #90  <Method Integer Integer.valueOf(int)>
	//   11   29:areturn         
	}

	public List readList(com.apollographql.apollo.api.ResponseReader.ListReader listreader)
	{
		List list = (List)value;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object value>
	//    2    4:checkcast       #94  <Class List>
	//    3    7:astore_3        
		if(list == null)
	//*   4    8:aload_3         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		ArrayList arraylist = new ArrayList();
	//    8   14:new             #96  <Class ArrayList>
	//    9   17:dup             
	//   10   18:invokespecial   #97  <Method void ArrayList()>
	//   11   21:astore          4
		for(int i = 0; i < list.size(); i++)
	//*  12   23:iconst_0        
	//*  13   24:istore_2        
	//*  14   25:iload_2         
	//*  15   26:aload_3         
	//*  16   27:invokeinterface #100 <Method int List.size()>
	//*  17   32:icmpge          113
		{
			resolveDelegate.willResolveElement(i);
	//   18   35:aload_0         
	//   19   36:getfield        #19  <Field RealResponseReader this$0>
	//   20   39:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//   21   42:iload_2         
	//   22   43:invokeinterface #104 <Method void ResolveDelegate.willResolveElement(int)>
			Object obj = list.get(i);
	//   23   48:aload_3         
	//   24   49:iload_2         
	//   25   50:invokeinterface #108 <Method Object List.get(int)>
	//   26   55:astore          5
			if(obj != null)
	//*  27   57:aload           5
	//*  28   59:ifnull          93
				((List) (arraylist)).add(listreader.read(((com.apollographql.apollo.api.ResponseReader.ListItemReader) (new RealResponseReader$ListItemReader(field, obj)))));
	//   29   62:aload           4
	//   30   64:aload_1         
	//   31   65:new             #2   <Class RealResponseReader$ListItemReader>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:getfield        #19  <Field RealResponseReader this$0>
	//   35   73:aload_0         
	//   36   74:getfield        #24  <Field ResponseField field>
	//   37   77:aload           5
	//   38   79:invokespecial   #110 <Method void RealResponseReader$ListItemReader(RealResponseReader, ResponseField, Object)>
	//   39   82:invokeinterface #116 <Method Object com.apollographql.apollo.api.ResponseReader$ListReader.read(com.apollographql.apollo.api.ResponseReader$ListItemReader)>
	//   40   87:invokeinterface #120 <Method boolean List.add(Object)>
	//   41   92:pop             
			resolveDelegate.didResolveElement(i);
	//   42   93:aload_0         
	//   43   94:getfield        #19  <Field RealResponseReader this$0>
	//   44   97:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//   45  100:iload_2         
	//   46  101:invokeinterface #123 <Method void ResolveDelegate.didResolveElement(int)>
		}

	//   47  106:iload_2         
	//   48  107:iconst_1        
	//   49  108:iadd            
	//   50  109:istore_2        
	//*  51  110:goto            25
		resolveDelegate.didResolveList(list);
	//   52  113:aload_0         
	//   53  114:getfield        #19  <Field RealResponseReader this$0>
	//   54  117:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//   55  120:aload_3         
	//   56  121:invokeinterface #127 <Method void ResolveDelegate.didResolveList(List)>
		return Collections.unmodifiableList(((List) (arraylist)));
	//   57  126:aload           4
	//   58  128:invokestatic    #133 <Method List Collections.unmodifiableList(List)>
	//   59  131:areturn         
	}

	public Long readLong()
	{
		resolveDelegate.didResolveScalar(value);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealResponseReader this$0>
	//    2    4:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Object value>
	//    5   11:invokeinterface #39  <Method void ResolveDelegate.didResolveScalar(Object)>
		return Long.valueOf(((BigDecimal)value).longValue());
	//    6   16:aload_0         
	//    7   17:getfield        #26  <Field Object value>
	//    8   20:checkcast       #69  <Class BigDecimal>
	//    9   23:invokevirtual   #140 <Method long BigDecimal.longValue()>
	//   10   26:invokestatic    #145 <Method Long Long.valueOf(long)>
	//   11   29:areturn         
	}

	public Object readObject(com.apollographql.apollo.api.ResponseReader.ObjectReader objectreader)
	{
		Object obj = value;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object value>
	//    2    4:astore_2        
		resolveDelegate.willResolveObject(field, Optional.fromNullable(obj));
	//    3    5:aload_0         
	//    4    6:getfield        #19  <Field RealResponseReader this$0>
	//    5    9:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//    6   12:aload_0         
	//    7   13:getfield        #24  <Field ResponseField field>
	//    8   16:aload_2         
	//    9   17:invokestatic    #153 <Method Optional Optional.fromNullable(Object)>
	//   10   20:invokeinterface #157 <Method void ResolveDelegate.willResolveObject(ResponseField, Optional)>
		objectreader = ((com.apollographql.apollo.api.ResponseReader.ObjectReader) (objectreader.read(((com.apollographql.apollo.api.ResponseReader) (new RealResponseReader(operationVariables, obj, fieldValueResolver, scalarTypeAdapters, resolveDelegate))))));
	//   11   25:aload_1         
	//   12   26:new             #8   <Class RealResponseReader>
	//   13   29:dup             
	//   14   30:aload_0         
	//   15   31:getfield        #19  <Field RealResponseReader this$0>
	//   16   34:getfield        #161 <Field com.apollographql.apollo.api.Operation$Variables RealResponseReader.operationVariables>
	//   17   37:aload_2         
	//   18   38:aload_0         
	//   19   39:getfield        #19  <Field RealResponseReader this$0>
	//   20   42:getfield        #165 <Field com.apollographql.apollo.internal.field.FieldValueResolver RealResponseReader.fieldValueResolver>
	//   21   45:aload_0         
	//   22   46:getfield        #19  <Field RealResponseReader this$0>
	//   23   49:getfield        #47  <Field ScalarTypeAdapters RealResponseReader.scalarTypeAdapters>
	//   24   52:aload_0         
	//   25   53:getfield        #19  <Field RealResponseReader this$0>
	//   26   56:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//   27   59:invokespecial   #168 <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, com.apollographql.apollo.internal.field.FieldValueResolver, ScalarTypeAdapters, ResolveDelegate)>
	//   28   62:invokeinterface #173 <Method Object com.apollographql.apollo.api.ResponseReader$ObjectReader.read(com.apollographql.apollo.api.ResponseReader)>
	//   29   67:astore_1        
		resolveDelegate.didResolveObject(field, Optional.fromNullable(obj));
	//   30   68:aload_0         
	//   31   69:getfield        #19  <Field RealResponseReader this$0>
	//   32   72:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//   33   75:aload_0         
	//   34   76:getfield        #24  <Field ResponseField field>
	//   35   79:aload_2         
	//   36   80:invokestatic    #153 <Method Optional Optional.fromNullable(Object)>
	//   37   83:invokeinterface #176 <Method void ResolveDelegate.didResolveObject(ResponseField, Optional)>
		return ((Object) (objectreader));
	//   38   88:aload_1         
	//   39   89:areturn         
	}

	public String readString()
	{
		resolveDelegate.didResolveScalar(value);
	//    0    0:aload_0         
	//    1    1:getfield        #19  <Field RealResponseReader this$0>
	//    2    4:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
	//    3    7:aload_0         
	//    4    8:getfield        #26  <Field Object value>
	//    5   11:invokeinterface #39  <Method void ResolveDelegate.didResolveScalar(Object)>
		return (String)value;
	//    6   16:aload_0         
	//    7   17:getfield        #26  <Field Object value>
	//    8   20:checkcast       #181 <Class String>
	//    9   23:areturn         
	}

	private final ResponseField field;
	final RealResponseReader this$0;
	private final Object value;

	RealResponseReader$ListItemReader(ResponseField responsefield, Object obj)
	{
		this$0 = RealResponseReader.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #19  <Field RealResponseReader this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #22  <Method void Object()>
		field = responsefield;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field ResponseField field>
		value = obj;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #26  <Field Object value>
	//   11   19:return          
	}
}
