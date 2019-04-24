// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.util.*;

public class UnwrappedPropertyHandler
{

	public UnwrappedPropertyHandler()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		_properties = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #13  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #14  <Method void ArrayList()>
	//    6   12:putfield        #16  <Field List _properties>
	//    7   15:return          
	}

	protected UnwrappedPropertyHandler(List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		_properties = list;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #16  <Field List _properties>
	//    5    9:return          
	}

	public void addProperty(SettableBeanProperty settablebeanproperty)
	{
		_properties.add(((Object) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #16  <Field List _properties>
	//    2    4:aload_1         
	//    3    5:invokeinterface #28  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	public Object processUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
		throws IOException, JsonProcessingException
	{
		int i = 0;
	//    0    0:iconst_0        
	//    1    1:istore          5
		for(int j = _properties.size(); i < j; i++)
	//*   2    3:aload_0         
	//*   3    4:getfield        #16  <Field List _properties>
	//*   4    7:invokeinterface #38  <Method int List.size()>
	//*   5   12:istore          6
	//*   6   14:iload           5
	//*   7   16:iload           6
	//*   8   18:icmpge          66
		{
			jsonparser = ((JsonParser) ((SettableBeanProperty)_properties.get(i)));
	//    9   21:aload_0         
	//   10   22:getfield        #16  <Field List _properties>
	//   11   25:iload           5
	//   12   27:invokeinterface #42  <Method Object List.get(int)>
	//   13   32:checkcast       #44  <Class SettableBeanProperty>
	//   14   35:astore_1        
			JsonParser jsonparser1 = tokenbuffer.asParser();
	//   15   36:aload           4
	//   16   38:invokevirtual   #50  <Method JsonParser TokenBuffer.asParser()>
	//   17   41:astore          7
			jsonparser1.nextToken();
	//   18   43:aload           7
	//   19   45:invokevirtual   #56  <Method com.fasterxml.jackson.core.JsonToken JsonParser.nextToken()>
	//   20   48:pop             
			((SettableBeanProperty) (jsonparser)).deserializeAndSet(jsonparser1, deserializationcontext, obj);
	//   21   49:aload_1         
	//   22   50:aload           7
	//   23   52:aload_2         
	//   24   53:aload_3         
	//   25   54:invokevirtual   #60  <Method void SettableBeanProperty.deserializeAndSet(JsonParser, DeserializationContext, Object)>
		}

	//   26   57:iload           5
	//   27   59:iconst_1        
	//   28   60:iadd            
	//   29   61:istore          5
	//*  30   63:goto            14
		return obj;
	//   31   66:aload_3         
	//   32   67:areturn         
	}

	public UnwrappedPropertyHandler renameAll(NameTransformer nametransformer)
	{
		ArrayList arraylist = new ArrayList(_properties.size());
	//    0    0:new             #13  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #16  <Field List _properties>
	//    4    8:invokeinterface #38  <Method int List.size()>
	//    5   13:invokespecial   #66  <Method void ArrayList(int)>
	//    6   16:astore          4
		SettableBeanProperty settablebeanproperty;
		for(Iterator iterator = _properties.iterator(); iterator.hasNext(); arraylist.add(((Object) (settablebeanproperty))))
	//*   7   18:aload_0         
	//*   8   19:getfield        #16  <Field List _properties>
	//*   9   22:invokeinterface #70  <Method Iterator List.iterator()>
	//*  10   27:astore          5
	//*  11   29:aload           5
	//*  12   31:invokeinterface #76  <Method boolean Iterator.hasNext()>
	//*  13   36:ifeq            110
		{
			settablebeanproperty = (SettableBeanProperty)iterator.next();
	//   14   39:aload           5
	//   15   41:invokeinterface #80  <Method Object Iterator.next()>
	//   16   46:checkcast       #44  <Class SettableBeanProperty>
	//   17   49:astore_2        
			SettableBeanProperty settablebeanproperty1 = settablebeanproperty.withSimpleName(nametransformer.transform(settablebeanproperty.getName()));
	//   18   50:aload_2         
	//   19   51:aload_1         
	//   20   52:aload_2         
	//   21   53:invokevirtual   #84  <Method String SettableBeanProperty.getName()>
	//   22   56:invokevirtual   #90  <Method String NameTransformer.transform(String)>
	//   23   59:invokevirtual   #94  <Method SettableBeanProperty SettableBeanProperty.withSimpleName(String)>
	//   24   62:astore_3        
			JsonDeserializer jsondeserializer = settablebeanproperty1.getValueDeserializer();
	//   25   63:aload_3         
	//   26   64:invokevirtual   #98  <Method JsonDeserializer SettableBeanProperty.getValueDeserializer()>
	//   27   67:astore          6
			settablebeanproperty = settablebeanproperty1;
	//   28   69:aload_3         
	//   29   70:astore_2        
			if(jsondeserializer == null)
				continue;
	//   30   71:aload           6
	//   31   73:ifnull          100
			JsonDeserializer jsondeserializer1 = jsondeserializer.unwrappingDeserializer(nametransformer);
	//   32   76:aload           6
	//   33   78:aload_1         
	//   34   79:invokevirtual   #104 <Method JsonDeserializer JsonDeserializer.unwrappingDeserializer(NameTransformer)>
	//   35   82:astore          7
			settablebeanproperty = settablebeanproperty1;
	//   36   84:aload_3         
	//   37   85:astore_2        
			if(jsondeserializer1 != jsondeserializer)
	//*  38   86:aload           7
	//*  39   88:aload           6
	//*  40   90:if_acmpeq       100
				settablebeanproperty = settablebeanproperty1.withValueDeserializer(jsondeserializer1);
	//   41   93:aload_3         
	//   42   94:aload           7
	//   43   96:invokevirtual   #108 <Method SettableBeanProperty SettableBeanProperty.withValueDeserializer(JsonDeserializer)>
	//   44   99:astore_2        
		}

	//   45  100:aload           4
	//   46  102:aload_2         
	//   47  103:invokevirtual   #109 <Method boolean ArrayList.add(Object)>
	//   48  106:pop             
	//*  49  107:goto            29
		return new UnwrappedPropertyHandler(((List) (arraylist)));
	//   50  110:new             #2   <Class UnwrappedPropertyHandler>
	//   51  113:dup             
	//   52  114:aload           4
	//   53  116:invokespecial   #111 <Method void UnwrappedPropertyHandler(List)>
	//   54  119:areturn         
	}

	protected final List _properties;
}
