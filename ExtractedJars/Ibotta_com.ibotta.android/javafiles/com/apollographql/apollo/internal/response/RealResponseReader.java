// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.response;

import com.apollographql.apollo.CustomTypeAdapter;
import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.internal.field.FieldValueResolver;
import com.apollographql.apollo.internal.json.Utils;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.math.BigDecimal;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.response:
//			ResolveDelegate

public final class RealResponseReader
	implements ResponseReader
{
	private class ListItemReader
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
			return ((CustomTypeAdapter) (scalartype)).decode(RealResponseReader.normalizeCustomTypeValue(value));
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
					((List) (arraylist)).add(listreader.read(((com.apollographql.apollo.api.ResponseReader.ListItemReader) (new ListItemReader(field, obj)))));
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
			objectreader = ((com.apollographql.apollo.api.ResponseReader.ObjectReader) (objectreader.read(((ResponseReader) (new RealResponseReader(operationVariables, obj, fieldValueResolver, scalarTypeAdapters, resolveDelegate))))));
		//   11   25:aload_1         
		//   12   26:new             #8   <Class RealResponseReader>
		//   13   29:dup             
		//   14   30:aload_0         
		//   15   31:getfield        #19  <Field RealResponseReader this$0>
		//   16   34:getfield        #161 <Field com.apollographql.apollo.api.Operation$Variables RealResponseReader.operationVariables>
		//   17   37:aload_2         
		//   18   38:aload_0         
		//   19   39:getfield        #19  <Field RealResponseReader this$0>
		//   20   42:getfield        #165 <Field FieldValueResolver RealResponseReader.fieldValueResolver>
		//   21   45:aload_0         
		//   22   46:getfield        #19  <Field RealResponseReader this$0>
		//   23   49:getfield        #47  <Field ScalarTypeAdapters RealResponseReader.scalarTypeAdapters>
		//   24   52:aload_0         
		//   25   53:getfield        #19  <Field RealResponseReader this$0>
		//   26   56:getfield        #33  <Field ResolveDelegate RealResponseReader.resolveDelegate>
		//   27   59:invokespecial   #168 <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, FieldValueResolver, ScalarTypeAdapters, ResolveDelegate)>
		//   28   62:invokeinterface #173 <Method Object com.apollographql.apollo.api.ResponseReader$ObjectReader.read(ResponseReader)>
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

		ListItemReader(ResponseField responsefield, Object obj)
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


	public RealResponseReader(com.apollographql.apollo.api.Operation.Variables variables, Object obj, FieldValueResolver fieldvalueresolver, ScalarTypeAdapters scalartypeadapters, ResolveDelegate resolvedelegate)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		operationVariables = variables;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
		recordSet = obj;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #35  <Field Object recordSet>
		fieldValueResolver = fieldvalueresolver;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #37  <Field FieldValueResolver fieldValueResolver>
		scalarTypeAdapters = scalartypeadapters;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #39  <Field ScalarTypeAdapters scalarTypeAdapters>
		resolveDelegate = resolvedelegate;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #41  <Field ResolveDelegate resolveDelegate>
		variableValues = variables.valueMap();
	//   17   31:aload_0         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #47  <Method Map com.apollographql.apollo.api.Operation$Variables.valueMap()>
	//   20   36:putfield        #49  <Field Map variableValues>
	//   21   39:return          
	}

	private void checkValue(ResponseField responsefield, Object obj)
	{
		if(!responsefield.optional())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #65  <Method boolean ResponseField.optional()>
	//*   2    4:ifne            48
		{
			if(obj != null)
	//*   3    7:aload_2         
	//*   4    8:ifnull          12
			{
				return;
	//    5   11:return          
			} else
			{
				obj = ((Object) (new StringBuilder()));
	//    6   12:new             #67  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #68  <Method void StringBuilder()>
	//    9   19:astore_2        
				((StringBuilder) (obj)).append("corrupted response reader, expected non null value for ");
	//   10   20:aload_2         
	//   11   21:ldc1            #70  <String "corrupted response reader, expected non null value for ">
	//   12   23:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
				((StringBuilder) (obj)).append(responsefield.fieldName());
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:invokevirtual   #78  <Method String ResponseField.fieldName()>
	//   17   32:invokevirtual   #74  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
				throw new NullPointerException(((StringBuilder) (obj)).toString());
	//   19   36:new             #80  <Class NullPointerException>
	//   20   39:dup             
	//   21   40:aload_2         
	//   22   41:invokevirtual   #83  <Method String StringBuilder.toString()>
	//   23   44:invokespecial   #86  <Method void NullPointerException(String)>
	//   24   47:athrow          
			}
		} else
		{
			return;
	//   25   48:return          
		}
	}

	private void didResolve(ResponseField responsefield)
	{
		resolveDelegate.didResolve(responsefield, operationVariables);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//    5    9:invokeinterface #93  <Method void ResolveDelegate.didResolve(ResponseField, com.apollographql.apollo.api.Operation$Variables)>
	//    6   14:return          
	}

	private static String normalizeCustomTypeValue(Object obj)
	{
		if(!(obj instanceof Map) && !(obj instanceof List))
	//*   0    0:aload_0         
	//*   1    1:instanceof      #97  <Class Map>
	//*   2    4:ifne            22
	//*   3    7:aload_0         
	//*   4    8:instanceof      #99  <Class List>
	//*   5   11:ifeq            17
	//*   6   14:goto            22
			return obj.toString();
	//    7   17:aload_0         
	//    8   18:invokevirtual   #100 <Method String Object.toString()>
	//    9   21:areturn         
		try
		{
			obj = ((Object) (Utils.toJsonString(obj)));
	//   10   22:aload_0         
	//   11   23:invokestatic    #105 <Method String Utils.toJsonString(Object)>
	//   12   26:astore_0        
		}
	//*  13   27:aload_0         
	//*  14   28:areturn         
		// Misplaced declaration of an exception variable
		catch(Object obj)
	//*  15   29:astore_0        
		{
			throw new RuntimeException(((Throwable) (obj)));
	//   16   30:new             #107 <Class RuntimeException>
	//   17   33:dup             
	//   18   34:aload_0         
	//   19   35:invokespecial   #110 <Method void RuntimeException(Throwable)>
	//   20   38:athrow          
		}
		return ((String) (obj));
	}

	private boolean shouldSkip(ResponseField responsefield)
	{
label0:
		{
			responsefield = ((ResponseField) (responsefield.conditions().iterator()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #116 <Method List ResponseField.conditions()>
	//    2    4:invokeinterface #120 <Method Iterator List.iterator()>
	//    3    9:astore_1        
			Boolean boolean1;
label1:
			do
			{
				do
				{
					Object obj;
					do
					{
						if(!((Iterator) (responsefield)).hasNext())
							break label0;
	//    4   10:aload_1         
	//    5   11:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            89
						obj = ((Object) ((com.apollographql.apollo.api.ResponseField.Condition)((Iterator) (responsefield)).next()));
	//    7   19:aload_1         
	//    8   20:invokeinterface #129 <Method Object Iterator.next()>
	//    9   25:checkcast       #131 <Class com.apollographql.apollo.api.ResponseField$Condition>
	//   10   28:astore_2        
					} while(!(obj instanceof com.apollographql.apollo.api.ResponseField.BooleanCondition));
	//   11   29:aload_2         
	//   12   30:instanceof      #133 <Class com.apollographql.apollo.api.ResponseField$BooleanCondition>
	//   13   33:ifeq            10
					obj = ((Object) ((com.apollographql.apollo.api.ResponseField.BooleanCondition)obj));
	//   14   36:aload_2         
	//   15   37:checkcast       #133 <Class com.apollographql.apollo.api.ResponseField$BooleanCondition>
	//   16   40:astore_2        
					boolean1 = (Boolean)variableValues.get(((Object) (((com.apollographql.apollo.api.ResponseField.BooleanCondition) (obj)).variableName())));
	//   17   41:aload_0         
	//   18   42:getfield        #49  <Field Map variableValues>
	//   19   45:aload_2         
	//   20   46:invokevirtual   #136 <Method String com.apollographql.apollo.api.ResponseField$BooleanCondition.variableName()>
	//   21   49:invokeinterface #140 <Method Object Map.get(Object)>
	//   22   54:checkcast       #142 <Class Boolean>
	//   23   57:astore_3        
					if(!((com.apollographql.apollo.api.ResponseField.BooleanCondition) (obj)).inverted())
						continue label1;
	//   24   58:aload_2         
	//   25   59:invokevirtual   #145 <Method boolean com.apollographql.apollo.api.ResponseField$BooleanCondition.inverted()>
	//   26   62:ifeq            77
				} while(!Boolean.TRUE.equals(((Object) (boolean1))));
	//   27   65:getstatic       #149 <Field Boolean Boolean.TRUE>
	//   28   68:aload_3         
	//   29   69:invokevirtual   #153 <Method boolean Boolean.equals(Object)>
	//   30   72:ifeq            10
				return true;
	//   31   75:iconst_1        
	//   32   76:ireturn         
			} while(!Boolean.FALSE.equals(((Object) (boolean1))));
	//   33   77:getstatic       #156 <Field Boolean Boolean.FALSE>
	//   34   80:aload_3         
	//   35   81:invokevirtual   #153 <Method boolean Boolean.equals(Object)>
	//   36   84:ifeq            10
			return true;
	//   37   87:iconst_1        
	//   38   88:ireturn         
		}
		return false;
	//   39   89:iconst_0        
	//   40   90:ireturn         
	}

	private void willResolve(ResponseField responsefield)
	{
		resolveDelegate.willResolve(responsefield, operationVariables);
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//    2    4:aload_1         
	//    3    5:aload_0         
	//    4    6:getfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//    5    9:invokeinterface #159 <Method void ResolveDelegate.willResolve(ResponseField, com.apollographql.apollo.api.Operation$Variables)>
	//    6   14:return          
	}

	public Boolean readBoolean(ResponseField responsefield)
	{
		if(shouldSkip(responsefield))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//*   3    5:ifeq            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		willResolve(responsefield);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #165 <Method void willResolve(ResponseField)>
		Boolean boolean1 = (Boolean)fieldValueResolver.valueFor(recordSet, responsefield);
	//    9   15:aload_0         
	//   10   16:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   11   19:aload_0         
	//   12   20:getfield        #35  <Field Object recordSet>
	//   13   23:aload_1         
	//   14   24:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   15   29:checkcast       #142 <Class Boolean>
	//   16   32:astore_2        
		checkValue(responsefield, ((Object) (boolean1)));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		if(boolean1 == null)
	//*  21   39:aload_2         
	//*  22   40:ifnonnull       55
			resolveDelegate.didResolveNull();
	//   23   43:aload_0         
	//   24   44:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   25   47:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
		else
	//*  26   52:goto            65
			resolveDelegate.didResolveScalar(((Object) (boolean1)));
	//   27   55:aload_0         
	//   28   56:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   29   59:aload_2         
	//   30   60:invokeinterface #180 <Method void ResolveDelegate.didResolveScalar(Object)>
		didResolve(responsefield);
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:invokespecial   #182 <Method void didResolve(ResponseField)>
		return boolean1;
	//   34   70:aload_2         
	//   35   71:areturn         
	}

	public Object readConditional(ResponseField responsefield, com.apollographql.apollo.api.ResponseReader.ConditionalTypeReader conditionaltypereader)
	{
		if(shouldSkip(responsefield))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//*   3    5:ifeq            10
			return ((Object) (null));
	//    4    8:aconst_null     
	//    5    9:areturn         
		willResolve(responsefield);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #165 <Method void willResolve(ResponseField)>
		String s = (String)fieldValueResolver.valueFor(recordSet, responsefield);
	//    9   15:aload_0         
	//   10   16:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   11   19:aload_0         
	//   12   20:getfield        #35  <Field Object recordSet>
	//   13   23:aload_1         
	//   14   24:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   15   29:checkcast       #186 <Class String>
	//   16   32:astore_3        
		checkValue(responsefield, ((Object) (s)));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_3         
	//   20   36:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		if(s == null)
	//*  21   39:aload_3         
	//*  22   40:ifnonnull       59
		{
			resolveDelegate.didResolveNull();
	//   23   43:aload_0         
	//   24   44:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   25   47:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
			didResolve(responsefield);
	//   26   52:aload_0         
	//   27   53:aload_1         
	//   28   54:invokespecial   #182 <Method void didResolve(ResponseField)>
			return ((Object) (null));
	//   29   57:aconst_null     
	//   30   58:areturn         
		}
		resolveDelegate.didResolveScalar(((Object) (s)));
	//   31   59:aload_0         
	//   32   60:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   33   63:aload_3         
	//   34   64:invokeinterface #180 <Method void ResolveDelegate.didResolveScalar(Object)>
		didResolve(responsefield);
	//   35   69:aload_0         
	//   36   70:aload_1         
	//   37   71:invokespecial   #182 <Method void didResolve(ResponseField)>
		if(responsefield.type() == com.apollographql.apollo.api.ResponseField.Type.INLINE_FRAGMENT)
	//*  38   74:aload_1         
	//*  39   75:invokevirtual   #190 <Method com.apollographql.apollo.api.ResponseField$Type ResponseField.type()>
	//*  40   78:getstatic       #196 <Field com.apollographql.apollo.api.ResponseField$Type com.apollographql.apollo.api.ResponseField$Type.INLINE_FRAGMENT>
	//*  41   81:if_acmpne       148
		{
			for(responsefield = ((ResponseField) (responsefield.conditions().iterator())); ((Iterator) (responsefield)).hasNext();)
	//*  42   84:aload_1         
	//*  43   85:invokevirtual   #116 <Method List ResponseField.conditions()>
	//*  44   88:invokeinterface #120 <Method Iterator List.iterator()>
	//*  45   93:astore_1        
	//*  46   94:aload_1         
	//*  47   95:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//*  48  100:ifeq            146
			{
				com.apollographql.apollo.api.ResponseField.Condition condition = (com.apollographql.apollo.api.ResponseField.Condition)((Iterator) (responsefield)).next();
	//   49  103:aload_1         
	//   50  104:invokeinterface #129 <Method Object Iterator.next()>
	//   51  109:checkcast       #131 <Class com.apollographql.apollo.api.ResponseField$Condition>
	//   52  112:astore          4
				if((condition instanceof com.apollographql.apollo.api.ResponseField.TypeNameCondition) && ((com.apollographql.apollo.api.ResponseField.TypeNameCondition)condition).typeName().equals(((Object) (s))))
	//*  53  114:aload           4
	//*  54  116:instanceof      #198 <Class com.apollographql.apollo.api.ResponseField$TypeNameCondition>
	//*  55  119:ifeq            94
	//*  56  122:aload           4
	//*  57  124:checkcast       #198 <Class com.apollographql.apollo.api.ResponseField$TypeNameCondition>
	//*  58  127:invokevirtual   #201 <Method String com.apollographql.apollo.api.ResponseField$TypeNameCondition.typeName()>
	//*  59  130:aload_3         
	//*  60  131:invokevirtual   #202 <Method boolean String.equals(Object)>
	//*  61  134:ifeq            94
					return conditionaltypereader.read(s, ((ResponseReader) (this)));
	//   62  137:aload_2         
	//   63  138:aload_3         
	//   64  139:aload_0         
	//   65  140:invokeinterface #208 <Method Object com.apollographql.apollo.api.ResponseReader$ConditionalTypeReader.read(String, ResponseReader)>
	//   66  145:areturn         
			}

			return ((Object) (null));
	//   67  146:aconst_null     
	//   68  147:areturn         
		} else
		{
			return conditionaltypereader.read(s, ((ResponseReader) (this)));
	//   69  148:aload_2         
	//   70  149:aload_3         
	//   71  150:aload_0         
	//   72  151:invokeinterface #208 <Method Object com.apollographql.apollo.api.ResponseReader$ConditionalTypeReader.read(String, ResponseReader)>
	//   73  156:areturn         
		}
	}

	public Object readCustomType(com.apollographql.apollo.api.ResponseField.CustomTypeField customtypefield)
	{
		boolean flag = shouldSkip(((ResponseField) (customtypefield)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//    3    5:istore_2        
		Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            14
			return ((Object) (null));
	//    8   12:aconst_null     
	//    9   13:areturn         
		willResolve(((ResponseField) (customtypefield)));
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokespecial   #165 <Method void willResolve(ResponseField)>
		Object obj1 = fieldValueResolver.valueFor(recordSet, ((ResponseField) (customtypefield)));
	//   13   19:aload_0         
	//   14   20:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   15   23:aload_0         
	//   16   24:getfield        #35  <Field Object recordSet>
	//   17   27:aload_1         
	//   18   28:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   19   33:astore          4
		checkValue(((ResponseField) (customtypefield)), obj1);
	//   20   35:aload_0         
	//   21   36:aload_1         
	//   22   37:aload           4
	//   23   39:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		if(obj1 == null)
	//*  24   42:aload           4
	//*  25   44:ifnonnull       59
		{
			resolveDelegate.didResolveNull();
	//   26   47:aload_0         
	//   27   48:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   28   51:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
		} else
	//*  29   56:goto            98
		{
			obj = scalarTypeAdapters.adapterFor(customtypefield.scalarType()).decode(normalizeCustomTypeValue(obj1));
	//   30   59:aload_0         
	//   31   60:getfield        #39  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   32   63:aload_1         
	//   33   64:invokevirtual   #217 <Method ScalarType com.apollographql.apollo.api.ResponseField$CustomTypeField.scalarType()>
	//   34   67:invokevirtual   #223 <Method CustomTypeAdapter ScalarTypeAdapters.adapterFor(ScalarType)>
	//   35   70:aload           4
	//   36   72:invokestatic    #57  <Method String normalizeCustomTypeValue(Object)>
	//   37   75:invokeinterface #229 <Method Object CustomTypeAdapter.decode(String)>
	//   38   80:astore_3        
			checkValue(((ResponseField) (customtypefield)), obj);
	//   39   81:aload_0         
	//   40   82:aload_1         
	//   41   83:aload_3         
	//   42   84:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
			resolveDelegate.didResolveScalar(obj1);
	//   43   87:aload_0         
	//   44   88:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   45   91:aload           4
	//   46   93:invokeinterface #180 <Method void ResolveDelegate.didResolveScalar(Object)>
		}
		didResolve(((ResponseField) (customtypefield)));
	//   47   98:aload_0         
	//   48   99:aload_1         
	//   49  100:invokespecial   #182 <Method void didResolve(ResponseField)>
		return obj;
	//   50  103:aload_3         
	//   51  104:areturn         
	}

	public Double readDouble(ResponseField responsefield)
	{
		boolean flag = shouldSkip(responsefield);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//    3    5:istore_2        
		Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		willResolve(responsefield);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokespecial   #165 <Method void willResolve(ResponseField)>
		BigDecimal bigdecimal = (BigDecimal)fieldValueResolver.valueFor(recordSet, responsefield);
	//   13   19:aload_0         
	//   14   20:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   15   23:aload_0         
	//   16   24:getfield        #35  <Field Object recordSet>
	//   17   27:aload_1         
	//   18   28:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   19   33:checkcast       #234 <Class BigDecimal>
	//   20   36:astore          4
		checkValue(responsefield, ((Object) (bigdecimal)));
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:aload           4
	//   24   42:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		if(bigdecimal == null)
	//*  25   45:aload           4
	//*  26   47:ifnonnull       62
			resolveDelegate.didResolveNull();
	//   27   50:aload_0         
	//   28   51:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   29   54:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
		else
	//*  30   59:goto            73
			resolveDelegate.didResolveScalar(((Object) (bigdecimal)));
	//   31   62:aload_0         
	//   32   63:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   33   66:aload           4
	//   34   68:invokeinterface #180 <Method void ResolveDelegate.didResolveScalar(Object)>
		didResolve(responsefield);
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:invokespecial   #182 <Method void didResolve(ResponseField)>
		responsefield = ((ResponseField) (obj));
	//   38   78:aload_3         
	//   39   79:astore_1        
		if(bigdecimal != null)
	//*  40   80:aload           4
	//*  41   82:ifnull          94
			responsefield = ((ResponseField) (Double.valueOf(bigdecimal.doubleValue())));
	//   42   85:aload           4
	//   43   87:invokevirtual   #238 <Method double BigDecimal.doubleValue()>
	//   44   90:invokestatic    #244 <Method Double Double.valueOf(double)>
	//   45   93:astore_1        
		return ((Double) (responsefield));
	//   46   94:aload_1         
	//   47   95:areturn         
	}

	public Integer readInt(ResponseField responsefield)
	{
		boolean flag = shouldSkip(responsefield);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//    3    5:istore_2        
		Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		willResolve(responsefield);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokespecial   #165 <Method void willResolve(ResponseField)>
		BigDecimal bigdecimal = (BigDecimal)fieldValueResolver.valueFor(recordSet, responsefield);
	//   13   19:aload_0         
	//   14   20:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   15   23:aload_0         
	//   16   24:getfield        #35  <Field Object recordSet>
	//   17   27:aload_1         
	//   18   28:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   19   33:checkcast       #234 <Class BigDecimal>
	//   20   36:astore          4
		checkValue(responsefield, ((Object) (bigdecimal)));
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:aload           4
	//   24   42:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		if(bigdecimal == null)
	//*  25   45:aload           4
	//*  26   47:ifnonnull       62
			resolveDelegate.didResolveNull();
	//   27   50:aload_0         
	//   28   51:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   29   54:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
		else
	//*  30   59:goto            73
			resolveDelegate.didResolveScalar(((Object) (bigdecimal)));
	//   31   62:aload_0         
	//   32   63:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   33   66:aload           4
	//   34   68:invokeinterface #180 <Method void ResolveDelegate.didResolveScalar(Object)>
		didResolve(responsefield);
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:invokespecial   #182 <Method void didResolve(ResponseField)>
		responsefield = ((ResponseField) (obj));
	//   38   78:aload_3         
	//   39   79:astore_1        
		if(bigdecimal != null)
	//*  40   80:aload           4
	//*  41   82:ifnull          94
			responsefield = ((ResponseField) (Integer.valueOf(bigdecimal.intValue())));
	//   42   85:aload           4
	//   43   87:invokevirtual   #250 <Method int BigDecimal.intValue()>
	//   44   90:invokestatic    #255 <Method Integer Integer.valueOf(int)>
	//   45   93:astore_1        
		return ((Integer) (responsefield));
	//   46   94:aload_1         
	//   47   95:areturn         
	}

	public List readList(ResponseField responsefield, com.apollographql.apollo.api.ResponseReader.ListReader listreader)
	{
		boolean flag = shouldSkip(responsefield);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//    3    5:istore          4
		Object obj = null;
	//    4    7:aconst_null     
	//    5    8:astore          5
		if(flag)
	//*   6   10:iload           4
	//*   7   12:ifeq            17
			return null;
	//    8   15:aconst_null     
	//    9   16:areturn         
		willResolve(responsefield);
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:invokespecial   #165 <Method void willResolve(ResponseField)>
		List list = (List)fieldValueResolver.valueFor(recordSet, responsefield);
	//   13   22:aload_0         
	//   14   23:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   15   26:aload_0         
	//   16   27:getfield        #35  <Field Object recordSet>
	//   17   30:aload_1         
	//   18   31:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   19   36:checkcast       #99  <Class List>
	//   20   39:astore          7
		checkValue(responsefield, ((Object) (list)));
	//   21   41:aload_0         
	//   22   42:aload_1         
	//   23   43:aload           7
	//   24   45:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		if(list == null)
	//*  25   48:aload           7
	//*  26   50:ifnonnull       67
		{
			resolveDelegate.didResolveNull();
	//   27   53:aload_0         
	//   28   54:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   29   57:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
			listreader = null;
	//   30   62:aconst_null     
	//   31   63:astore_2        
		} else
	//*  32   64:goto            179
		{
			ArrayList arraylist = new ArrayList();
	//   33   67:new             #259 <Class ArrayList>
	//   34   70:dup             
	//   35   71:invokespecial   #260 <Method void ArrayList()>
	//   36   74:astore          6
			for(int i = 0; i < list.size(); i++)
	//*  37   76:iconst_0        
	//*  38   77:istore_3        
	//*  39   78:iload_3         
	//*  40   79:aload           7
	//*  41   81:invokeinterface #263 <Method int List.size()>
	//*  42   86:icmpge          165
			{
				resolveDelegate.willResolveElement(i);
	//   43   89:aload_0         
	//   44   90:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   45   93:iload_3         
	//   46   94:invokeinterface #267 <Method void ResolveDelegate.willResolveElement(int)>
				Object obj1 = list.get(i);
	//   47   99:aload           7
	//   48  101:iload_3         
	//   49  102:invokeinterface #270 <Method Object List.get(int)>
	//   50  107:astore          8
				if(obj1 != null)
	//*  51  109:aload           8
	//*  52  111:ifnull          148
				{
					obj1 = listreader.read(((com.apollographql.apollo.api.ResponseReader.ListItemReader) (new ListItemReader(responsefield, obj1))));
	//   53  114:aload_2         
	//   54  115:new             #9   <Class RealResponseReader$ListItemReader>
	//   55  118:dup             
	//   56  119:aload_0         
	//   57  120:aload_1         
	//   58  121:aload           8
	//   59  123:invokespecial   #273 <Method void RealResponseReader$ListItemReader(RealResponseReader, ResponseField, Object)>
	//   60  126:invokeinterface #278 <Method Object com.apollographql.apollo.api.ResponseReader$ListReader.read(com.apollographql.apollo.api.ResponseReader$ListItemReader)>
	//   61  131:astore          8
					if(obj1 != null)
	//*  62  133:aload           8
	//*  63  135:ifnull          148
						((List) (arraylist)).add(obj1);
	//   64  138:aload           6
	//   65  140:aload           8
	//   66  142:invokeinterface #281 <Method boolean List.add(Object)>
	//   67  147:pop             
				}
				resolveDelegate.didResolveElement(i);
	//   68  148:aload_0         
	//   69  149:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   70  152:iload_3         
	//   71  153:invokeinterface #284 <Method void ResolveDelegate.didResolveElement(int)>
			}

	//   72  158:iload_3         
	//   73  159:iconst_1        
	//   74  160:iadd            
	//   75  161:istore_3        
	//*  76  162:goto            78
			resolveDelegate.didResolveList(list);
	//   77  165:aload_0         
	//   78  166:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   79  169:aload           7
	//   80  171:invokeinterface #288 <Method void ResolveDelegate.didResolveList(List)>
			listreader = ((com.apollographql.apollo.api.ResponseReader.ListReader) (arraylist));
	//   81  176:aload           6
	//   82  178:astore_2        
		}
		didResolve(responsefield);
	//   83  179:aload_0         
	//   84  180:aload_1         
	//   85  181:invokespecial   #182 <Method void didResolve(ResponseField)>
		responsefield = ((ResponseField) (obj));
	//   86  184:aload           5
	//   87  186:astore_1        
		if(listreader != null)
	//*  88  187:aload_2         
	//*  89  188:ifnull          196
			responsefield = ((ResponseField) (Collections.unmodifiableList(((List) (listreader)))));
	//   90  191:aload_2         
	//   91  192:invokestatic    #294 <Method List Collections.unmodifiableList(List)>
	//   92  195:astore_1        
		return ((List) (responsefield));
	//   93  196:aload_1         
	//   94  197:areturn         
	}

	public Long readLong(ResponseField responsefield)
	{
		boolean flag = shouldSkip(responsefield);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//    3    5:istore_2        
		Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore_3        
		if(flag)
	//*   6    8:iload_2         
	//*   7    9:ifeq            14
			return null;
	//    8   12:aconst_null     
	//    9   13:areturn         
		willResolve(responsefield);
	//   10   14:aload_0         
	//   11   15:aload_1         
	//   12   16:invokespecial   #165 <Method void willResolve(ResponseField)>
		BigDecimal bigdecimal = (BigDecimal)fieldValueResolver.valueFor(recordSet, responsefield);
	//   13   19:aload_0         
	//   14   20:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   15   23:aload_0         
	//   16   24:getfield        #35  <Field Object recordSet>
	//   17   27:aload_1         
	//   18   28:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   19   33:checkcast       #234 <Class BigDecimal>
	//   20   36:astore          4
		checkValue(responsefield, ((Object) (bigdecimal)));
	//   21   38:aload_0         
	//   22   39:aload_1         
	//   23   40:aload           4
	//   24   42:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		if(bigdecimal == null)
	//*  25   45:aload           4
	//*  26   47:ifnonnull       62
			resolveDelegate.didResolveNull();
	//   27   50:aload_0         
	//   28   51:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   29   54:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
		else
	//*  30   59:goto            73
			resolveDelegate.didResolveScalar(((Object) (bigdecimal)));
	//   31   62:aload_0         
	//   32   63:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   33   66:aload           4
	//   34   68:invokeinterface #180 <Method void ResolveDelegate.didResolveScalar(Object)>
		didResolve(responsefield);
	//   35   73:aload_0         
	//   36   74:aload_1         
	//   37   75:invokespecial   #182 <Method void didResolve(ResponseField)>
		responsefield = ((ResponseField) (obj));
	//   38   78:aload_3         
	//   39   79:astore_1        
		if(bigdecimal != null)
	//*  40   80:aload           4
	//*  41   82:ifnull          94
			responsefield = ((ResponseField) (Long.valueOf(bigdecimal.longValue())));
	//   42   85:aload           4
	//   43   87:invokevirtual   #301 <Method long BigDecimal.longValue()>
	//   44   90:invokestatic    #306 <Method Long Long.valueOf(long)>
	//   45   93:astore_1        
		return ((Long) (responsefield));
	//   46   94:aload_1         
	//   47   95:areturn         
	}

	public Object readObject(ResponseField responsefield, com.apollographql.apollo.api.ResponseReader.ObjectReader objectreader)
	{
		boolean flag = shouldSkip(responsefield);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//    3    5:istore_3        
		Object obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          4
		if(flag)
	//*   6    9:iload_3         
	//*   7   10:ifeq            15
			return ((Object) (null));
	//    8   13:aconst_null     
	//    9   14:areturn         
		willResolve(responsefield);
	//   10   15:aload_0         
	//   11   16:aload_1         
	//   12   17:invokespecial   #165 <Method void willResolve(ResponseField)>
		Object obj1 = fieldValueResolver.valueFor(recordSet, responsefield);
	//   13   20:aload_0         
	//   14   21:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   15   24:aload_0         
	//   16   25:getfield        #35  <Field Object recordSet>
	//   17   28:aload_1         
	//   18   29:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   19   34:astore          5
		checkValue(responsefield, obj1);
	//   20   36:aload_0         
	//   21   37:aload_1         
	//   22   38:aload           5
	//   23   40:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		resolveDelegate.willResolveObject(responsefield, Optional.fromNullable(obj1));
	//   24   43:aload_0         
	//   25   44:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   26   47:aload_1         
	//   27   48:aload           5
	//   28   50:invokestatic    #314 <Method Optional Optional.fromNullable(Object)>
	//   29   53:invokeinterface #318 <Method void ResolveDelegate.willResolveObject(ResponseField, Optional)>
		if(obj1 == null)
	//*  30   58:aload           5
	//*  31   60:ifnonnull       78
		{
			resolveDelegate.didResolveNull();
	//   32   63:aload_0         
	//   33   64:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   34   67:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
			objectreader = ((com.apollographql.apollo.api.ResponseReader.ObjectReader) (obj));
	//   35   72:aload           4
	//   36   74:astore_2        
		} else
	//*  37   75:goto            110
		{
			objectreader = ((com.apollographql.apollo.api.ResponseReader.ObjectReader) (objectreader.read(((ResponseReader) (new RealResponseReader(operationVariables, obj1, fieldValueResolver, scalarTypeAdapters, resolveDelegate))))));
	//   38   78:aload_2         
	//   39   79:new             #2   <Class RealResponseReader>
	//   40   82:dup             
	//   41   83:aload_0         
	//   42   84:getfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//   43   87:aload           5
	//   44   89:aload_0         
	//   45   90:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   46   93:aload_0         
	//   47   94:getfield        #39  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   48   97:aload_0         
	//   49   98:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   50  101:invokespecial   #320 <Method void RealResponseReader(com.apollographql.apollo.api.Operation$Variables, Object, FieldValueResolver, ScalarTypeAdapters, ResolveDelegate)>
	//   51  104:invokeinterface #325 <Method Object com.apollographql.apollo.api.ResponseReader$ObjectReader.read(ResponseReader)>
	//   52  109:astore_2        
		}
		resolveDelegate.didResolveObject(responsefield, Optional.fromNullable(obj1));
	//   53  110:aload_0         
	//   54  111:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   55  114:aload_1         
	//   56  115:aload           5
	//   57  117:invokestatic    #314 <Method Optional Optional.fromNullable(Object)>
	//   58  120:invokeinterface #328 <Method void ResolveDelegate.didResolveObject(ResponseField, Optional)>
		didResolve(responsefield);
	//   59  125:aload_0         
	//   60  126:aload_1         
	//   61  127:invokespecial   #182 <Method void didResolve(ResponseField)>
		return ((Object) (objectreader));
	//   62  130:aload_2         
	//   63  131:areturn         
	}

	public String readString(ResponseField responsefield)
	{
		if(shouldSkip(responsefield))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #163 <Method boolean shouldSkip(ResponseField)>
	//*   3    5:ifeq            10
			return null;
	//    4    8:aconst_null     
	//    5    9:areturn         
		willResolve(responsefield);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokespecial   #165 <Method void willResolve(ResponseField)>
		String s = (String)fieldValueResolver.valueFor(recordSet, responsefield);
	//    9   15:aload_0         
	//   10   16:getfield        #37  <Field FieldValueResolver fieldValueResolver>
	//   11   19:aload_0         
	//   12   20:getfield        #35  <Field Object recordSet>
	//   13   23:aload_1         
	//   14   24:invokeinterface #171 <Method Object FieldValueResolver.valueFor(Object, ResponseField)>
	//   15   29:checkcast       #186 <Class String>
	//   16   32:astore_2        
		checkValue(responsefield, ((Object) (s)));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:invokespecial   #173 <Method void checkValue(ResponseField, Object)>
		if(s == null)
	//*  21   39:aload_2         
	//*  22   40:ifnonnull       55
			resolveDelegate.didResolveNull();
	//   23   43:aload_0         
	//   24   44:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   25   47:invokeinterface #176 <Method void ResolveDelegate.didResolveNull()>
		else
	//*  26   52:goto            65
			resolveDelegate.didResolveScalar(((Object) (s)));
	//   27   55:aload_0         
	//   28   56:getfield        #41  <Field ResolveDelegate resolveDelegate>
	//   29   59:aload_2         
	//   30   60:invokeinterface #180 <Method void ResolveDelegate.didResolveScalar(Object)>
		didResolve(responsefield);
	//   31   65:aload_0         
	//   32   66:aload_1         
	//   33   67:invokespecial   #182 <Method void didResolve(ResponseField)>
		return s;
	//   34   70:aload_2         
	//   35   71:areturn         
	}

	final FieldValueResolver fieldValueResolver;
	final com.apollographql.apollo.api.Operation.Variables operationVariables;
	private final Object recordSet;
	final ResolveDelegate resolveDelegate;
	final ScalarTypeAdapters scalarTypeAdapters;
	private final Map variableValues;


/*
	static String access$000(Object obj)
	{
		return normalizeCustomTypeValue(obj);
	//    0    0:aload_0         
	//    1    1:invokestatic    #57  <Method String normalizeCustomTypeValue(Object)>
	//    2    4:areturn         
	}

*/
}
