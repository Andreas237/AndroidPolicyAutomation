// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//			FilteredBeanPropertyWriter

private static final class FilteredBeanPropertyWriter$SingleView extends BeanPropertyWriter
	implements Serializable
{

	public void assignNullSerializer(JsonSerializer jsonserializer)
	{
		_delegate.assignNullSerializer(jsonserializer);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BeanPropertyWriter _delegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void BeanPropertyWriter.assignNullSerializer(JsonSerializer)>
	//    4    8:return          
	}

	public void assignSerializer(JsonSerializer jsonserializer)
	{
		_delegate.assignSerializer(jsonserializer);
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field BeanPropertyWriter _delegate>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #38  <Method void BeanPropertyWriter.assignSerializer(JsonSerializer)>
	//    4    8:return          
	}

	public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
		throws JsonMappingException
	{
		Class class1 = serializerprovider.getActiveView();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #48  <Method Class SerializerProvider.getActiveView()>
	//    2    4:astore_3        
		if(class1 == null || _view.isAssignableFrom(class1))
	//*   3    5:aload_3         
	//*   4    6:ifnull          20
	//*   5    9:aload_0         
	//*   6   10:getfield        #27  <Field Class _view>
	//*   7   13:aload_3         
	//*   8   14:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*   9   17:ifeq            26
			super.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:aload_2         
	//   13   23:invokespecial   #56  <Method void BeanPropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
	//   14   26:return          
	}

	public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
	{
		return ((BeanPropertyWriter) (rename(nametransformer)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #62  <Method FilteredBeanPropertyWriter$SingleView rename(NameTransformer)>
	//    3    5:areturn         
	}

	public FilteredBeanPropertyWriter$SingleView rename(NameTransformer nametransformer)
	{
		return new FilteredBeanPropertyWriter$SingleView(_delegate.rename(nametransformer), _view);
	//    0    0:new             #2   <Class FilteredBeanPropertyWriter$SingleView>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field BeanPropertyWriter _delegate>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #64  <Method BeanPropertyWriter BeanPropertyWriter.rename(NameTransformer)>
	//    6   12:aload_0         
	//    7   13:getfield        #27  <Field Class _view>
	//    8   16:invokespecial   #66  <Method void FilteredBeanPropertyWriter$SingleView(BeanPropertyWriter, Class)>
	//    9   19:areturn         
	}

	public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Class class1 = serializerprovider.getActiveView();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #48  <Method Class SerializerProvider.getActiveView()>
	//    2    4:astore          4
		if(class1 != null && !_view.isAssignableFrom(class1))
	//*   3    6:aload           4
	//*   4    8:ifnull          37
	//*   5   11:aload_0         
	//*   6   12:getfield        #27  <Field Class _view>
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*   9   20:ifeq            26
	//*  10   23:goto            37
		{
			_delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
	//   11   26:aload_0         
	//   12   27:getfield        #25  <Field BeanPropertyWriter _delegate>
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload_3         
	//   16   33:invokevirtual   #73  <Method void BeanPropertyWriter.serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
			return;
	//   17   36:return          
		} else
		{
			_delegate.serializeAsElement(obj, jsongenerator, serializerprovider);
	//   18   37:aload_0         
	//   19   38:getfield        #25  <Field BeanPropertyWriter _delegate>
	//   20   41:aload_1         
	//   21   42:aload_2         
	//   22   43:aload_3         
	//   23   44:invokevirtual   #75  <Method void BeanPropertyWriter.serializeAsElement(Object, JsonGenerator, SerializerProvider)>
			return;
	//   24   47:return          
		}
	}

	public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
		throws Exception
	{
		Class class1 = serializerprovider.getActiveView();
	//    0    0:aload_3         
	//    1    1:invokevirtual   #48  <Method Class SerializerProvider.getActiveView()>
	//    2    4:astore          4
		if(class1 != null && !_view.isAssignableFrom(class1))
	//*   3    6:aload           4
	//*   4    8:ifnull          37
	//*   5   11:aload_0         
	//*   6   12:getfield        #27  <Field Class _view>
	//*   7   15:aload           4
	//*   8   17:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
	//*   9   20:ifeq            26
	//*  10   23:goto            37
		{
			_delegate.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
	//   11   26:aload_0         
	//   12   27:getfield        #25  <Field BeanPropertyWriter _delegate>
	//   13   30:aload_1         
	//   14   31:aload_2         
	//   15   32:aload_3         
	//   16   33:invokevirtual   #79  <Method void BeanPropertyWriter.serializeAsOmittedField(Object, JsonGenerator, SerializerProvider)>
			return;
	//   17   36:return          
		} else
		{
			_delegate.serializeAsField(obj, jsongenerator, serializerprovider);
	//   18   37:aload_0         
	//   19   38:getfield        #25  <Field BeanPropertyWriter _delegate>
	//   20   41:aload_1         
	//   21   42:aload_2         
	//   22   43:aload_3         
	//   23   44:invokevirtual   #81  <Method void BeanPropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
			return;
	//   24   47:return          
		}
	}

	private static final long serialVersionUID = 1L;
	protected final BeanPropertyWriter _delegate;
	protected final Class _view;

	protected FilteredBeanPropertyWriter$SingleView(BeanPropertyWriter beanpropertywriter, Class class1)
	{
		super(beanpropertywriter);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void BeanPropertyWriter(BeanPropertyWriter)>
		_delegate = beanpropertywriter;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #25  <Field BeanPropertyWriter _delegate>
		_view = class1;
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:putfield        #27  <Field Class _view>
	//    9   15:return          
	}
}
