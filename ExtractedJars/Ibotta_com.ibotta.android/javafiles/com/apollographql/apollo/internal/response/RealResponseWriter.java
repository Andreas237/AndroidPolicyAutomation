// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.apollographql.apollo.internal.response;

import com.apollographql.apollo.CustomTypeAdapter;
import com.apollographql.apollo.api.*;
import com.apollographql.apollo.api.internal.Optional;
import com.apollographql.apollo.response.ScalarTypeAdapters;
import java.math.BigDecimal;
import java.util.*;

// Referenced classes of package com.apollographql.apollo.internal.response:
//			ResolveDelegate

public final class RealResponseWriter
	implements ResponseWriter
{
	private static class FieldDescriptor
	{

		final ResponseField field;
		final Object value;

		FieldDescriptor(ResponseField responsefield, Object obj)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #16  <Method void Object()>
			field = responsefield;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #18  <Field ResponseField field>
			value = obj;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #20  <Field Object value>
		//    8   14:return          
		}
	}

	private static final class ListItemWriter
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
			responsefieldmarshaller.marshal(((ResponseWriter) (realresponsewriter)));
		//    8   16:aload_1         
		//    9   17:aload_2         
		//   10   18:invokeinterface #86  <Method void ResponseFieldMarshaller.marshal(ResponseWriter)>
			value = ((Object) (realresponsewriter.buffer));
		//   11   23:aload_0         
		//   12   24:aload_2         
		//   13   25:getfield        #90  <Field Map RealResponseWriter.buffer>
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

		ListItemWriter(com.apollographql.apollo.api.Operation.Variables variables, ScalarTypeAdapters scalartypeadapters)
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


	public RealResponseWriter(com.apollographql.apollo.api.Operation.Variables variables, ScalarTypeAdapters scalartypeadapters)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #26  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #28  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #29  <Method void LinkedHashMap()>
	//    6   12:putfield        #31  <Field Map buffer>
		operationVariables = variables;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
		scalarTypeAdapters = scalartypeadapters;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #35  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   13   25:return          
	}

	private static void checkFieldValue(ResponseField responsefield, Object obj)
	{
		if(!responsefield.optional())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #44  <Method boolean ResponseField.optional()>
	//*   2    4:ifne            36
		{
			if(obj != null)
	//*   3    7:aload_1         
	//*   4    8:ifnull          12
				return;
	//    5   11:return          
			else
				throw new NullPointerException(String.format("Mandatory response field `%s` resolved with null value", new Object[] {
					responsefield.responseName()
				}));
	//    6   12:new             #46  <Class NullPointerException>
	//    7   15:dup             
	//    8   16:ldc1            #48  <String "Mandatory response field `%s` resolved with null value">
	//    9   18:iconst_1        
	//   10   19:anewarray       Object[]
	//   11   22:dup             
	//   12   23:iconst_0        
	//   13   24:aload_0         
	//   14   25:invokevirtual   #52  <Method String ResponseField.responseName()>
	//   15   28:aastore         
	//   16   29:invokestatic    #58  <Method String String.format(String, Object[])>
	//   17   32:invokespecial   #61  <Method void NullPointerException(String)>
	//   18   35:athrow          
		} else
		{
			return;
	//   19   36:return          
		}
	}

	private Map rawFieldValues(Map map)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #28  <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #29  <Method void LinkedHashMap()>
	//    3    7:astore_2        
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext();)
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #69  <Method Set Map.entrySet()>
	//*   6   14:invokeinterface #75  <Method Iterator Set.iterator()>
	//*   7   19:astore_1        
	//*   8   20:aload_1         
	//*   9   21:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  10   26:ifeq            152
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//   11   29:aload_1         
	//   12   30:invokeinterface #84  <Method Object Iterator.next()>
	//   13   35:checkcast       #86  <Class java.util.Map$Entry>
	//   14   38:astore          4
			String s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   15   40:aload           4
	//   16   42:invokeinterface #89  <Method Object java.util.Map$Entry.getKey()>
	//   17   47:checkcast       #54  <Class String>
	//   18   50:astore_3        
			obj = ((FieldDescriptor)((java.util.Map.Entry) (obj)).getValue()).value;
	//   19   51:aload           4
	//   20   53:invokeinterface #92  <Method Object java.util.Map$Entry.getValue()>
	//   21   58:checkcast       #10  <Class RealResponseWriter$FieldDescriptor>
	//   22   61:getfield        #96  <Field Object RealResponseWriter$FieldDescriptor.value>
	//   23   64:astore          4
			if(obj == null)
	//*  24   66:aload           4
	//*  25   68:ifnonnull       83
				((Map) (linkedhashmap)).put(((Object) (s)), ((Object) (null)));
	//   26   71:aload_2         
	//   27   72:aload_3         
	//   28   73:aconst_null     
	//   29   74:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   30   79:pop             
			else
	//*  31   80:goto            20
			if(obj instanceof Map)
	//*  32   83:aload           4
	//*  33   85:instanceof      #65  <Class Map>
	//*  34   88:ifeq            111
				((Map) (linkedhashmap)).put(((Object) (s)), ((Object) (rawFieldValues((Map)obj))));
	//   35   91:aload_2         
	//   36   92:aload_3         
	//   37   93:aload_0         
	//   38   94:aload           4
	//   39   96:checkcast       #65  <Class Map>
	//   40   99:invokespecial   #102 <Method Map rawFieldValues(Map)>
	//   41  102:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   42  107:pop             
			else
	//*  43  108:goto            20
			if(obj instanceof List)
	//*  44  111:aload           4
	//*  45  113:instanceof      #104 <Class List>
	//*  46  116:ifeq            139
				((Map) (linkedhashmap)).put(((Object) (s)), ((Object) (rawListFieldValues((List)obj))));
	//   47  119:aload_2         
	//   48  120:aload_3         
	//   49  121:aload_0         
	//   50  122:aload           4
	//   51  124:checkcast       #104 <Class List>
	//   52  127:invokespecial   #108 <Method List rawListFieldValues(List)>
	//   53  130:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   54  135:pop             
			else
	//*  55  136:goto            20
				((Map) (linkedhashmap)).put(((Object) (s)), obj);
	//   56  139:aload_2         
	//   57  140:aload_3         
	//   58  141:aload           4
	//   59  143:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   60  148:pop             
		}

	//*  61  149:goto            20
		return ((Map) (linkedhashmap));
	//   62  152:aload_2         
	//   63  153:areturn         
	}

	private List rawListFieldValues(List list)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #112 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #113 <Method void ArrayList()>
	//    3    7:astore_2        
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   4    8:aload_1         
	//*   5    9:invokeinterface #114 <Method Iterator List.iterator()>
	//*   6   14:astore_1        
	//*   7   15:aload_1         
	//*   8   16:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*   9   21:ifeq            92
		{
			Object obj = ((Iterator) (list)).next();
	//   10   24:aload_1         
	//   11   25:invokeinterface #84  <Method Object Iterator.next()>
	//   12   30:astore_3        
			if(obj instanceof Map)
	//*  13   31:aload_3         
	//*  14   32:instanceof      #65  <Class Map>
	//*  15   35:ifeq            56
				((List) (arraylist)).add(((Object) (rawFieldValues((Map)obj))));
	//   16   38:aload_2         
	//   17   39:aload_0         
	//   18   40:aload_3         
	//   19   41:checkcast       #65  <Class Map>
	//   20   44:invokespecial   #102 <Method Map rawFieldValues(Map)>
	//   21   47:invokeinterface #118 <Method boolean List.add(Object)>
	//   22   52:pop             
			else
	//*  23   53:goto            15
			if(obj instanceof List)
	//*  24   56:aload_3         
	//*  25   57:instanceof      #104 <Class List>
	//*  26   60:ifeq            81
				((List) (arraylist)).add(((Object) (rawListFieldValues((List)obj))));
	//   27   63:aload_2         
	//   28   64:aload_0         
	//   29   65:aload_3         
	//   30   66:checkcast       #104 <Class List>
	//   31   69:invokespecial   #108 <Method List rawListFieldValues(List)>
	//   32   72:invokeinterface #118 <Method boolean List.add(Object)>
	//   33   77:pop             
			else
	//*  34   78:goto            15
				((List) (arraylist)).add(obj);
	//   35   81:aload_2         
	//   36   82:aload_3         
	//   37   83:invokeinterface #118 <Method boolean List.add(Object)>
	//   38   88:pop             
		}

	//*  39   89:goto            15
		return ((List) (arraylist));
	//   40   92:aload_2         
	//   41   93:areturn         
	}

	private void resolveFields(com.apollographql.apollo.api.Operation.Variables variables, ResolveDelegate resolvedelegate, Map map)
	{
		Map map1 = rawFieldValues(map);
	//    0    0:aload_0         
	//    1    1:aload_3         
	//    2    2:invokespecial   #102 <Method Map rawFieldValues(Map)>
	//    3    5:astore          4
		FieldDescriptor fielddescriptor;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); resolvedelegate.didResolve(fielddescriptor.field, variables))
	//*   4    7:aload_3         
	//*   5    8:invokeinterface #123 <Method Set Map.keySet()>
	//*   6   13:invokeinterface #75  <Method Iterator Set.iterator()>
	//*   7   18:astore          5
	//*   8   20:aload           5
	//*   9   22:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  10   27:ifeq            194
		{
			Object obj = ((Object) ((String)iterator.next()));
	//   11   30:aload           5
	//   12   32:invokeinterface #84  <Method Object Iterator.next()>
	//   13   37:checkcast       #54  <Class String>
	//   14   40:astore          7
			fielddescriptor = (FieldDescriptor)map.get(obj);
	//   15   42:aload_3         
	//   16   43:aload           7
	//   17   45:invokeinterface #127 <Method Object Map.get(Object)>
	//   18   50:checkcast       #10  <Class RealResponseWriter$FieldDescriptor>
	//   19   53:astore          6
			obj = map1.get(obj);
	//   20   55:aload           4
	//   21   57:aload           7
	//   22   59:invokeinterface #127 <Method Object Map.get(Object)>
	//   23   64:astore          7
			resolvedelegate.willResolve(fielddescriptor.field, variables);
	//   24   66:aload_2         
	//   25   67:aload           6
	//   26   69:getfield        #131 <Field ResponseField RealResponseWriter$FieldDescriptor.field>
	//   27   72:aload_1         
	//   28   73:invokeinterface #137 <Method void ResolveDelegate.willResolve(ResponseField, com.apollographql.apollo.api.Operation$Variables)>
			static class _cls1
			{

				static final int $SwitchMap$com$apollographql$apollo$api$ResponseField$Type[];

				static 
				{
					$SwitchMap$com$apollographql$apollo$api$ResponseField$Type = new int[com.apollographql.apollo.api.ResponseField.Type.values().length];
				//    0    0:invokestatic    #18  <Method com.apollographql.apollo.api.ResponseField$Type[] com.apollographql.apollo.api.ResponseField$Type.values()>
				//    1    3:arraylength     
				//    2    4:newarray        int[]
				//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
					try
					{
						$SwitchMap$com$apollographql$apollo$api$ResponseField$Type[com.apollographql.apollo.api.ResponseField.Type.OBJECT.ordinal()] = 1;
				//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
				//    5   12:getstatic       #24  <Field com.apollographql.apollo.api.ResponseField$Type com.apollographql.apollo.api.ResponseField$Type.OBJECT>
				//    6   15:invokevirtual   #28  <Method int com.apollographql.apollo.api.ResponseField$Type.ordinal()>
				//    7   18:iconst_1        
				//    8   19:iastore         
					}
				//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
				//*  10   23:getstatic       #31  <Field com.apollographql.apollo.api.ResponseField$Type com.apollographql.apollo.api.ResponseField$Type.LIST>
				//*  11   26:invokevirtual   #28  <Method int com.apollographql.apollo.api.ResponseField$Type.ordinal()>
				//*  12   29:iconst_2        
				//*  13   30:iastore         
				//*  14   31:return          
					catch(NoSuchFieldError nosuchfielderror) { }
				//   15   32:astore_0        
					try
					{
						$SwitchMap$com$apollographql$apollo$api$ResponseField$Type[com.apollographql.apollo.api.ResponseField.Type.LIST.ordinal()] = 2;
					}
				//*  16   33:goto            20
					catch(NoSuchFieldError nosuchfielderror1) { }
				//   17   36:astore_0        
				//*  18   37:return          
				}
			}

			switch(_cls1..SwitchMap.com.apollographql.apollo.api.ResponseField.Type[fielddescriptor.field.type().ordinal()])
	//*  29   78:getstatic       #141 <Field int[] RealResponseWriter$1.$SwitchMap$com$apollographql$apollo$api$ResponseField$Type>
	//*  30   81:aload           6
	//*  31   83:getfield        #131 <Field ResponseField RealResponseWriter$FieldDescriptor.field>
	//*  32   86:invokevirtual   #145 <Method com.apollographql.apollo.api.ResponseField$Type ResponseField.type()>
	//*  33   89:invokevirtual   #151 <Method int com.apollographql.apollo.api.ResponseField$Type.ordinal()>
	//*  34   92:iaload          
			{
	//*  35   93:tableswitch     1 2: default 116
	//	               1 156
	//	               2 130
			default:
				if(obj == null)
	//*  36  116:aload           7
	//*  37  118:ifnonnull       171
					resolvedelegate.didResolveNull();
	//   38  121:aload_2         
	//   39  122:invokeinterface #154 <Method void ResolveDelegate.didResolveNull()>
				else
	//*  40  127:goto            179
	//*  41  130:aload_0         
	//*  42  131:aload           6
	//*  43  133:getfield        #131 <Field ResponseField RealResponseWriter$FieldDescriptor.field>
	//*  44  136:aload           6
	//*  45  138:getfield        #96  <Field Object RealResponseWriter$FieldDescriptor.value>
	//*  46  141:checkcast       #104 <Class List>
	//*  47  144:aload           7
	//*  48  146:checkcast       #104 <Class List>
	//*  49  149:aload_2         
	//*  50  150:invokespecial   #158 <Method void resolveListField(ResponseField, List, List, ResolveDelegate)>
	//*  51  153:goto            179
	//*  52  156:aload_0         
	//*  53  157:aload           6
	//*  54  159:aload           7
	//*  55  161:checkcast       #65  <Class Map>
	//*  56  164:aload_2         
	//*  57  165:invokespecial   #162 <Method void resolveObjectFields(RealResponseWriter$FieldDescriptor, Map, ResolveDelegate)>
	//*  58  168:goto            179
					resolvedelegate.didResolveScalar(obj);
	//   59  171:aload_2         
	//   60  172:aload           7
	//   61  174:invokeinterface #166 <Method void ResolveDelegate.didResolveScalar(Object)>
				break;

			case 2: // '\002'
				resolveListField(fielddescriptor.field, (List)fielddescriptor.value, (List)obj, resolvedelegate);
				break;

			case 1: // '\001'
				resolveObjectFields(fielddescriptor, (Map)obj, resolvedelegate);
				break;
			}
		}

	//   62  179:aload_2         
	//   63  180:aload           6
	//   64  182:getfield        #131 <Field ResponseField RealResponseWriter$FieldDescriptor.field>
	//   65  185:aload_1         
	//   66  186:invokeinterface #169 <Method void ResolveDelegate.didResolve(ResponseField, com.apollographql.apollo.api.Operation$Variables)>
	//*  67  191:goto            20
	//   68  194:return          
	}

	private void resolveListField(ResponseField responsefield, List list, List list1, ResolveDelegate resolvedelegate)
	{
		if(list == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       12
		{
			resolvedelegate.didResolveNull();
	//    2    4:aload           4
	//    3    6:invokeinterface #154 <Method void ResolveDelegate.didResolveNull()>
			return;
	//    4   11:return          
		}
		for(int i = 0; i < list.size(); i++)
	//*   5   12:iconst_0        
	//*   6   13:istore          5
	//*   7   15:iload           5
	//*   8   17:aload_2         
	//*   9   18:invokeinterface #173 <Method int List.size()>
	//*  10   23:icmpge          182
		{
			resolvedelegate.willResolveElement(i);
	//   11   26:aload           4
	//   12   28:iload           5
	//   13   30:invokeinterface #177 <Method void ResolveDelegate.willResolveElement(int)>
			Object obj = list.get(i);
	//   14   35:aload_2         
	//   15   36:iload           5
	//   16   38:invokeinterface #180 <Method Object List.get(int)>
	//   17   43:astore          6
			if(obj instanceof Map)
	//*  18   45:aload           6
	//*  19   47:instanceof      #65  <Class Map>
	//*  20   50:ifeq            115
			{
				resolvedelegate.willResolveObject(responsefield, Optional.fromNullable(((Object) ((Map)list1.get(i)))));
	//   21   53:aload           4
	//   22   55:aload_1         
	//   23   56:aload_3         
	//   24   57:iload           5
	//   25   59:invokeinterface #180 <Method Object List.get(int)>
	//   26   64:checkcast       #65  <Class Map>
	//   27   67:invokestatic    #186 <Method Optional Optional.fromNullable(Object)>
	//   28   70:invokeinterface #190 <Method void ResolveDelegate.willResolveObject(ResponseField, Optional)>
				resolveFields(operationVariables, resolvedelegate, (Map)obj);
	//   29   75:aload_0         
	//   30   76:aload_0         
	//   31   77:getfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//   32   80:aload           4
	//   33   82:aload           6
	//   34   84:checkcast       #65  <Class Map>
	//   35   87:invokespecial   #192 <Method void resolveFields(com.apollographql.apollo.api.Operation$Variables, ResolveDelegate, Map)>
				resolvedelegate.didResolveObject(responsefield, Optional.fromNullable(((Object) ((Map)list1.get(i)))));
	//   36   90:aload           4
	//   37   92:aload_1         
	//   38   93:aload_3         
	//   39   94:iload           5
	//   40   96:invokeinterface #180 <Method Object List.get(int)>
	//   41  101:checkcast       #65  <Class Map>
	//   42  104:invokestatic    #186 <Method Optional Optional.fromNullable(Object)>
	//   43  107:invokeinterface #195 <Method void ResolveDelegate.didResolveObject(ResponseField, Optional)>
			} else
	//*  44  112:goto            164
			if(obj instanceof List)
	//*  45  115:aload           6
	//*  46  117:instanceof      #104 <Class List>
	//*  47  120:ifeq            149
				resolveListField(responsefield, (List)obj, (List)list1.get(i), resolvedelegate);
	//   48  123:aload_0         
	//   49  124:aload_1         
	//   50  125:aload           6
	//   51  127:checkcast       #104 <Class List>
	//   52  130:aload_3         
	//   53  131:iload           5
	//   54  133:invokeinterface #180 <Method Object List.get(int)>
	//   55  138:checkcast       #104 <Class List>
	//   56  141:aload           4
	//   57  143:invokespecial   #158 <Method void resolveListField(ResponseField, List, List, ResolveDelegate)>
			else
	//*  58  146:goto            164
				resolvedelegate.didResolveScalar(list1.get(i));
	//   59  149:aload           4
	//   60  151:aload_3         
	//   61  152:iload           5
	//   62  154:invokeinterface #180 <Method Object List.get(int)>
	//   63  159:invokeinterface #166 <Method void ResolveDelegate.didResolveScalar(Object)>
			resolvedelegate.didResolveElement(i);
	//   64  164:aload           4
	//   65  166:iload           5
	//   66  168:invokeinterface #198 <Method void ResolveDelegate.didResolveElement(int)>
		}

	//   67  173:iload           5
	//   68  175:iconst_1        
	//   69  176:iadd            
	//   70  177:istore          5
	//*  71  179:goto            15
		resolvedelegate.didResolveList(list1);
	//   72  182:aload           4
	//   73  184:aload_3         
	//   74  185:invokeinterface #202 <Method void ResolveDelegate.didResolveList(List)>
	//   75  190:return          
	}

	private void resolveObjectFields(FieldDescriptor fielddescriptor, Map map, ResolveDelegate resolvedelegate)
	{
		resolvedelegate.willResolveObject(fielddescriptor.field, Optional.fromNullable(((Object) (map))));
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:getfield        #131 <Field ResponseField RealResponseWriter$FieldDescriptor.field>
	//    3    5:aload_2         
	//    4    6:invokestatic    #186 <Method Optional Optional.fromNullable(Object)>
	//    5    9:invokeinterface #190 <Method void ResolveDelegate.willResolveObject(ResponseField, Optional)>
		if(fielddescriptor.value == null)
	//*   6   14:aload_1         
	//*   7   15:getfield        #96  <Field Object RealResponseWriter$FieldDescriptor.value>
	//*   8   18:ifnonnull       30
			resolvedelegate.didResolveNull();
	//    9   21:aload_3         
	//   10   22:invokeinterface #154 <Method void ResolveDelegate.didResolveNull()>
		else
	//*  11   27:goto            46
			resolveFields(operationVariables, resolvedelegate, (Map)fielddescriptor.value);
	//   12   30:aload_0         
	//   13   31:aload_0         
	//   14   32:getfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//   15   35:aload_3         
	//   16   36:aload_1         
	//   17   37:getfield        #96  <Field Object RealResponseWriter$FieldDescriptor.value>
	//   18   40:checkcast       #65  <Class Map>
	//   19   43:invokespecial   #192 <Method void resolveFields(com.apollographql.apollo.api.Operation$Variables, ResolveDelegate, Map)>
		resolvedelegate.didResolveObject(fielddescriptor.field, Optional.fromNullable(((Object) (map))));
	//   20   46:aload_3         
	//   21   47:aload_1         
	//   22   48:getfield        #131 <Field ResponseField RealResponseWriter$FieldDescriptor.field>
	//   23   51:aload_2         
	//   24   52:invokestatic    #186 <Method Optional Optional.fromNullable(Object)>
	//   25   55:invokeinterface #195 <Method void ResolveDelegate.didResolveObject(ResponseField, Optional)>
	//   26   60:return          
	}

	private List writeListItemValues(List list, com.apollographql.apollo.api.ResponseWriter.ListWriter listwriter)
	{
		ListItemWriter listitemwriter = new ListItemWriter(operationVariables, scalarTypeAdapters);
	//    0    0:new             #13  <Class RealResponseWriter$ListItemWriter>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//    4    8:aload_0         
	//    5    9:getfield        #35  <Field ScalarTypeAdapters scalarTypeAdapters>
	//    6   12:invokespecial   #208 <Method void RealResponseWriter$ListItemWriter(com.apollographql.apollo.api.Operation$Variables, ScalarTypeAdapters)>
	//    7   15:astore_3        
		ArrayList arraylist = new ArrayList();
	//    8   16:new             #112 <Class ArrayList>
	//    9   19:dup             
	//   10   20:invokespecial   #113 <Method void ArrayList()>
	//   11   23:astore          4
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*  12   25:aload_1         
	//*  13   26:invokeinterface #114 <Method Iterator List.iterator()>
	//*  14   31:astore_1        
	//*  15   32:aload_1         
	//*  16   33:invokeinterface #80  <Method boolean Iterator.hasNext()>
	//*  17   38:ifeq            102
		{
			Object obj = ((Iterator) (list)).next();
	//   18   41:aload_1         
	//   19   42:invokeinterface #84  <Method Object Iterator.next()>
	//   20   47:astore          5
			if(obj instanceof List)
	//*  21   49:aload           5
	//*  22   51:instanceof      #104 <Class List>
	//*  23   54:ifeq            78
			{
				((List) (arraylist)).add(((Object) (writeListItemValues((List)obj, listwriter))));
	//   24   57:aload           4
	//   25   59:aload_0         
	//   26   60:aload           5
	//   27   62:checkcast       #104 <Class List>
	//   28   65:aload_2         
	//   29   66:invokespecial   #210 <Method List writeListItemValues(List, com.apollographql.apollo.api.ResponseWriter$ListWriter)>
	//   30   69:invokeinterface #118 <Method boolean List.add(Object)>
	//   31   74:pop             
			} else
	//*  32   75:goto            32
			{
				listwriter.write(obj, ((com.apollographql.apollo.api.ResponseWriter.ListItemWriter) (listitemwriter)));
	//   33   78:aload_2         
	//   34   79:aload           5
	//   35   81:aload_3         
	//   36   82:invokeinterface #216 <Method void com.apollographql.apollo.api.ResponseWriter$ListWriter.write(Object, com.apollographql.apollo.api.ResponseWriter$ListItemWriter)>
				((List) (arraylist)).add(listitemwriter.value);
	//   37   87:aload           4
	//   38   89:aload_3         
	//   39   90:getfield        #217 <Field Object RealResponseWriter$ListItemWriter.value>
	//   40   93:invokeinterface #118 <Method boolean List.add(Object)>
	//   41   98:pop             
			}
		}

	//*  42   99:goto            32
		return ((List) (arraylist));
	//   43  102:aload           4
	//   44  104:areturn         
	}

	private void writeScalarFieldValue(ResponseField responsefield, Object obj)
	{
		checkFieldValue(responsefield, obj);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #220 <Method void checkFieldValue(ResponseField, Object)>
		buffer.put(((Object) (responsefield.responseName())), ((Object) (new FieldDescriptor(responsefield, obj))));
	//    3    5:aload_0         
	//    4    6:getfield        #31  <Field Map buffer>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #52  <Method String ResponseField.responseName()>
	//    7   13:new             #10  <Class RealResponseWriter$FieldDescriptor>
	//    8   16:dup             
	//    9   17:aload_1         
	//   10   18:aload_2         
	//   11   19:invokespecial   #222 <Method void RealResponseWriter$FieldDescriptor(ResponseField, Object)>
	//   12   22:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   13   27:pop             
	//   14   28:return          
	}

	public void resolveFields(ResolveDelegate resolvedelegate)
	{
		resolveFields(operationVariables, resolvedelegate, buffer);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//    3    5:aload_1         
	//    4    6:aload_0         
	//    5    7:getfield        #31  <Field Map buffer>
	//    6   10:invokespecial   #192 <Method void resolveFields(com.apollographql.apollo.api.Operation$Variables, ResolveDelegate, Map)>
	//    7   13:return          
	}

	public void writeBoolean(ResponseField responsefield, Boolean boolean1)
	{
		writeScalarFieldValue(responsefield, ((Object) (boolean1)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #230 <Method void writeScalarFieldValue(ResponseField, Object)>
	//    4    6:return          
	}

	public void writeCustom(com.apollographql.apollo.api.ResponseField.CustomTypeField customtypefield, Object obj)
	{
		CustomTypeAdapter customtypeadapter = scalarTypeAdapters.adapterFor(customtypefield.scalarType());
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field ScalarTypeAdapters scalarTypeAdapters>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #239 <Method ScalarType com.apollographql.apollo.api.ResponseField$CustomTypeField.scalarType()>
	//    4    8:invokevirtual   #245 <Method CustomTypeAdapter ScalarTypeAdapters.adapterFor(ScalarType)>
	//    5   11:astore_3        
		if(obj != null)
	//*   6   12:aload_2         
	//*   7   13:ifnull          27
			obj = ((Object) (customtypeadapter.encode(obj)));
	//    8   16:aload_3         
	//    9   17:aload_2         
	//   10   18:invokeinterface #251 <Method String CustomTypeAdapter.encode(Object)>
	//   11   23:astore_2        
		else
	//*  12   24:goto            29
			obj = null;
	//   13   27:aconst_null     
	//   14   28:astore_2        
		writeScalarFieldValue(((ResponseField) (customtypefield)), obj);
	//   15   29:aload_0         
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:invokespecial   #230 <Method void writeScalarFieldValue(ResponseField, Object)>
	//   19   35:return          
	}

	public void writeDouble(ResponseField responsefield, Double double1)
	{
		if(double1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          15
			double1 = ((Double) (BigDecimal.valueOf(double1.doubleValue())));
	//    2    4:aload_2         
	//    3    5:invokevirtual   #259 <Method double Double.doubleValue()>
	//    4    8:invokestatic    #265 <Method BigDecimal BigDecimal.valueOf(double)>
	//    5   11:astore_2        
		else
	//*   6   12:goto            17
			double1 = null;
	//    7   15:aconst_null     
	//    8   16:astore_2        
		writeScalarFieldValue(responsefield, ((Object) (double1)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #230 <Method void writeScalarFieldValue(ResponseField, Object)>
	//   13   23:return          
	}

	public void writeInt(ResponseField responsefield, Integer integer)
	{
		if(integer != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          16
			integer = ((Integer) (BigDecimal.valueOf(integer.intValue())));
	//    2    4:aload_2         
	//    3    5:invokevirtual   #272 <Method int Integer.intValue()>
	//    4    8:i2l             
	//    5    9:invokestatic    #275 <Method BigDecimal BigDecimal.valueOf(long)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			integer = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		writeScalarFieldValue(responsefield, ((Object) (integer)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:invokespecial   #230 <Method void writeScalarFieldValue(ResponseField, Object)>
	//   14   24:return          
	}

	public void writeList(ResponseField responsefield, List list, com.apollographql.apollo.api.ResponseWriter.ListWriter listwriter)
	{
		checkFieldValue(responsefield, ((Object) (list)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #220 <Method void checkFieldValue(ResponseField, Object)>
		if(list == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       33
		{
			buffer.put(((Object) (responsefield.responseName())), ((Object) (new FieldDescriptor(responsefield, ((Object) (null))))));
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field Map buffer>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #52  <Method String ResponseField.responseName()>
	//    9   17:new             #10  <Class RealResponseWriter$FieldDescriptor>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aconst_null     
	//   13   23:invokespecial   #222 <Method void RealResponseWriter$FieldDescriptor(ResponseField, Object)>
	//   14   26:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   15   31:pop             
			return;
	//   16   32:return          
		} else
		{
			list = writeListItemValues(list, listwriter);
	//   17   33:aload_0         
	//   18   34:aload_2         
	//   19   35:aload_3         
	//   20   36:invokespecial   #210 <Method List writeListItemValues(List, com.apollographql.apollo.api.ResponseWriter$ListWriter)>
	//   21   39:astore_2        
			buffer.put(((Object) (responsefield.responseName())), ((Object) (new FieldDescriptor(responsefield, ((Object) (list))))));
	//   22   40:aload_0         
	//   23   41:getfield        #31  <Field Map buffer>
	//   24   44:aload_1         
	//   25   45:invokevirtual   #52  <Method String ResponseField.responseName()>
	//   26   48:new             #10  <Class RealResponseWriter$FieldDescriptor>
	//   27   51:dup             
	//   28   52:aload_1         
	//   29   53:aload_2         
	//   30   54:invokespecial   #222 <Method void RealResponseWriter$FieldDescriptor(ResponseField, Object)>
	//   31   57:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   32   62:pop             
			return;
	//   33   63:return          
		}
	}

	public void writeLong(ResponseField responsefield, Long long1)
	{
		if(long1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          15
			long1 = ((Long) (BigDecimal.valueOf(long1.longValue())));
	//    2    4:aload_2         
	//    3    5:invokevirtual   #285 <Method long Long.longValue()>
	//    4    8:invokestatic    #275 <Method BigDecimal BigDecimal.valueOf(long)>
	//    5   11:astore_2        
		else
	//*   6   12:goto            17
			long1 = null;
	//    7   15:aconst_null     
	//    8   16:astore_2        
		writeScalarFieldValue(responsefield, ((Object) (long1)));
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:aload_2         
	//   12   20:invokespecial   #230 <Method void writeScalarFieldValue(ResponseField, Object)>
	//   13   23:return          
	}

	public void writeObject(ResponseField responsefield, ResponseFieldMarshaller responsefieldmarshaller)
	{
		checkFieldValue(responsefield, ((Object) (responsefieldmarshaller)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokestatic    #220 <Method void checkFieldValue(ResponseField, Object)>
		if(responsefieldmarshaller == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       33
		{
			buffer.put(((Object) (responsefield.responseName())), ((Object) (new FieldDescriptor(responsefield, ((Object) (null))))));
	//    5    9:aload_0         
	//    6   10:getfield        #31  <Field Map buffer>
	//    7   13:aload_1         
	//    8   14:invokevirtual   #52  <Method String ResponseField.responseName()>
	//    9   17:new             #10  <Class RealResponseWriter$FieldDescriptor>
	//   10   20:dup             
	//   11   21:aload_1         
	//   12   22:aconst_null     
	//   13   23:invokespecial   #222 <Method void RealResponseWriter$FieldDescriptor(ResponseField, Object)>
	//   14   26:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   15   31:pop             
			return;
	//   16   32:return          
		} else
		{
			RealResponseWriter realresponsewriter = new RealResponseWriter(operationVariables, scalarTypeAdapters);
	//   17   33:new             #2   <Class RealResponseWriter>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:getfield        #33  <Field com.apollographql.apollo.api.Operation$Variables operationVariables>
	//   21   41:aload_0         
	//   22   42:getfield        #35  <Field ScalarTypeAdapters scalarTypeAdapters>
	//   23   45:invokespecial   #288 <Method void RealResponseWriter(com.apollographql.apollo.api.Operation$Variables, ScalarTypeAdapters)>
	//   24   48:astore_3        
			responsefieldmarshaller.marshal(((ResponseWriter) (realresponsewriter)));
	//   25   49:aload_2         
	//   26   50:aload_3         
	//   27   51:invokeinterface #294 <Method void ResponseFieldMarshaller.marshal(ResponseWriter)>
			buffer.put(((Object) (responsefield.responseName())), ((Object) (new FieldDescriptor(responsefield, ((Object) (realresponsewriter.buffer))))));
	//   28   56:aload_0         
	//   29   57:getfield        #31  <Field Map buffer>
	//   30   60:aload_1         
	//   31   61:invokevirtual   #52  <Method String ResponseField.responseName()>
	//   32   64:new             #10  <Class RealResponseWriter$FieldDescriptor>
	//   33   67:dup             
	//   34   68:aload_1         
	//   35   69:aload_3         
	//   36   70:getfield        #31  <Field Map buffer>
	//   37   73:invokespecial   #222 <Method void RealResponseWriter$FieldDescriptor(ResponseField, Object)>
	//   38   76:invokeinterface #100 <Method Object Map.put(Object, Object)>
	//   39   81:pop             
			return;
	//   40   82:return          
		}
	}

	public void writeString(ResponseField responsefield, String s)
	{
		writeScalarFieldValue(responsefield, ((Object) (s)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #230 <Method void writeScalarFieldValue(ResponseField, Object)>
	//    4    6:return          
	}

	final Map buffer = new LinkedHashMap();
	private final com.apollographql.apollo.api.Operation.Variables operationVariables;
	private final ScalarTypeAdapters scalarTypeAdapters;
}
