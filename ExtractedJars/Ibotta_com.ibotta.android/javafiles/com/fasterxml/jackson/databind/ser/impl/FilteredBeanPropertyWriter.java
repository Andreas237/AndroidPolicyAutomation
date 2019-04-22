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

public abstract class FilteredBeanPropertyWriter
{
	private static final class MultiView extends BeanPropertyWriter
		implements Serializable
	{

		private final boolean _inView(Class class1)
		{
			if(class1 == null)
		//*   0    0:aload_1         
		//*   1    1:ifnonnull       6
				return true;
		//    2    4:iconst_1        
		//    3    5:ireturn         
			int j = _views.length;
		//    4    6:aload_0         
		//    5    7:getfield        #27  <Field Class[] _views>
		//    6   10:arraylength     
		//    7   11:istore_3        
			for(int i = 0; i < j; i++)
		//*   8   12:iconst_0        
		//*   9   13:istore_2        
		//*  10   14:iload_2         
		//*  11   15:iload_3         
		//*  12   16:icmpge          41
				if(_views[i].isAssignableFrom(class1))
		//*  13   19:aload_0         
		//*  14   20:getfield        #27  <Field Class[] _views>
		//*  15   23:iload_2         
		//*  16   24:aaload          
		//*  17   25:aload_1         
		//*  18   26:invokevirtual   #37  <Method boolean Class.isAssignableFrom(Class)>
		//*  19   29:ifeq            34
					return true;
		//   20   32:iconst_1        
		//   21   33:ireturn         

		//   22   34:iload_2         
		//   23   35:iconst_1        
		//   24   36:iadd            
		//   25   37:istore_2        
		//*  26   38:goto            14
			return false;
		//   27   41:iconst_0        
		//   28   42:ireturn         
		}

		public void assignNullSerializer(JsonSerializer jsonserializer)
		{
			_delegate.assignNullSerializer(jsonserializer);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field BeanPropertyWriter _delegate>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #42  <Method void BeanPropertyWriter.assignNullSerializer(JsonSerializer)>
		//    4    8:return          
		}

		public void assignSerializer(JsonSerializer jsonserializer)
		{
			_delegate.assignSerializer(jsonserializer);
		//    0    0:aload_0         
		//    1    1:getfield        #25  <Field BeanPropertyWriter _delegate>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #46  <Method void BeanPropertyWriter.assignSerializer(JsonSerializer)>
		//    4    8:return          
		}

		public void depositSchemaProperty(JsonObjectFormatVisitor jsonobjectformatvisitor, SerializerProvider serializerprovider)
			throws JsonMappingException
		{
			if(_inView(serializerprovider.getActiveView()))
		//*   0    0:aload_0         
		//*   1    1:aload_2         
		//*   2    2:invokevirtual   #56  <Method Class SerializerProvider.getActiveView()>
		//*   3    5:invokespecial   #58  <Method boolean _inView(Class)>
		//*   4    8:ifeq            17
				super.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:aload_2         
		//    8   14:invokespecial   #60  <Method void BeanPropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
		//    9   17:return          
		}

		public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
		{
			return ((BeanPropertyWriter) (rename(nametransformer)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #66  <Method FilteredBeanPropertyWriter$MultiView rename(NameTransformer)>
		//    3    5:areturn         
		}

		public MultiView rename(NameTransformer nametransformer)
		{
			return new MultiView(_delegate.rename(nametransformer), _views);
		//    0    0:new             #2   <Class FilteredBeanPropertyWriter$MultiView>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #25  <Field BeanPropertyWriter _delegate>
		//    4    8:aload_1         
		//    5    9:invokevirtual   #68  <Method BeanPropertyWriter BeanPropertyWriter.rename(NameTransformer)>
		//    6   12:aload_0         
		//    7   13:getfield        #27  <Field Class[] _views>
		//    8   16:invokespecial   #70  <Method void FilteredBeanPropertyWriter$MultiView(BeanPropertyWriter, Class[])>
		//    9   19:areturn         
		}

		public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws Exception
		{
			if(_inView(serializerprovider.getActiveView()))
		//*   0    0:aload_0         
		//*   1    1:aload_3         
		//*   2    2:invokevirtual   #56  <Method Class SerializerProvider.getActiveView()>
		//*   3    5:invokespecial   #58  <Method boolean _inView(Class)>
		//*   4    8:ifeq            22
			{
				_delegate.serializeAsElement(obj, jsongenerator, serializerprovider);
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field BeanPropertyWriter _delegate>
		//    7   15:aload_1         
		//    8   16:aload_2         
		//    9   17:aload_3         
		//   10   18:invokevirtual   #76  <Method void BeanPropertyWriter.serializeAsElement(Object, JsonGenerator, SerializerProvider)>
				return;
		//   11   21:return          
			} else
			{
				_delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
		//   12   22:aload_0         
		//   13   23:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   14   26:aload_1         
		//   15   27:aload_2         
		//   16   28:aload_3         
		//   17   29:invokevirtual   #79  <Method void BeanPropertyWriter.serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
				return;
		//   18   32:return          
			}
		}

		public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws Exception
		{
			if(_inView(serializerprovider.getActiveView()))
		//*   0    0:aload_0         
		//*   1    1:aload_3         
		//*   2    2:invokevirtual   #56  <Method Class SerializerProvider.getActiveView()>
		//*   3    5:invokespecial   #58  <Method boolean _inView(Class)>
		//*   4    8:ifeq            22
			{
				_delegate.serializeAsField(obj, jsongenerator, serializerprovider);
		//    5   11:aload_0         
		//    6   12:getfield        #25  <Field BeanPropertyWriter _delegate>
		//    7   15:aload_1         
		//    8   16:aload_2         
		//    9   17:aload_3         
		//   10   18:invokevirtual   #82  <Method void BeanPropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
				return;
		//   11   21:return          
			} else
			{
				_delegate.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
		//   12   22:aload_0         
		//   13   23:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   14   26:aload_1         
		//   15   27:aload_2         
		//   16   28:aload_3         
		//   17   29:invokevirtual   #85  <Method void BeanPropertyWriter.serializeAsOmittedField(Object, JsonGenerator, SerializerProvider)>
				return;
		//   18   32:return          
			}
		}

		private static final long serialVersionUID = 1L;
		protected final BeanPropertyWriter _delegate;
		protected final Class _views[];

		protected MultiView(BeanPropertyWriter beanpropertywriter, Class aclass[])
		{
			super(beanpropertywriter);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #23  <Method void BeanPropertyWriter(BeanPropertyWriter)>
			_delegate = beanpropertywriter;
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:putfield        #25  <Field BeanPropertyWriter _delegate>
			_views = aclass;
		//    6   10:aload_0         
		//    7   11:aload_2         
		//    8   12:putfield        #27  <Field Class[] _views>
		//    9   15:return          
		}
	}

	private static final class SingleView extends BeanPropertyWriter
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

		public SingleView rename(NameTransformer nametransformer)
		{
			return new SingleView(_delegate.rename(nametransformer), _view);
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

		protected SingleView(BeanPropertyWriter beanpropertywriter, Class class1)
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


	public static BeanPropertyWriter constructViewBased(BeanPropertyWriter beanpropertywriter, Class aclass[])
	{
		if(aclass.length == 1)
	//*   0    0:aload_1         
	//*   1    1:arraylength     
	//*   2    2:iconst_1        
	//*   3    3:icmpne          18
			return ((BeanPropertyWriter) (new SingleView(beanpropertywriter, aclass[0])));
	//    4    6:new             #9   <Class FilteredBeanPropertyWriter$SingleView>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:iconst_0        
	//    9   13:aaload          
	//   10   14:invokespecial   #16  <Method void FilteredBeanPropertyWriter$SingleView(BeanPropertyWriter, Class)>
	//   11   17:areturn         
		else
			return ((BeanPropertyWriter) (new MultiView(beanpropertywriter, aclass)));
	//   12   18:new             #6   <Class FilteredBeanPropertyWriter$MultiView>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokespecial   #19  <Method void FilteredBeanPropertyWriter$MultiView(BeanPropertyWriter, Class[])>
	//   17   27:areturn         
	}
}
