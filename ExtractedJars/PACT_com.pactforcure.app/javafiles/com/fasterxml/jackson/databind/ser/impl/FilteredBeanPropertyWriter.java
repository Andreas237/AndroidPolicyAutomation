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
		//    2    4:astore          5
			if(class1 != null)
		//*   3    6:aload           5
		//*   4    8:ifnull          54
			{
				int i = 0;
		//    5   11:iconst_0        
		//    6   12:istore_3        
				int j = _views.length;
		//    7   13:aload_0         
		//    8   14:getfield        #27  <Field Class[] _views>
		//    9   17:arraylength     
		//   10   18:istore          4
				do
				{
					if(i >= j || _views[i].isAssignableFrom(class1))
		//*  11   20:iload_3         
		//*  12   21:iload           4
		//*  13   23:icmpge          40
		//*  14   26:aload_0         
		//*  15   27:getfield        #27  <Field Class[] _views>
		//*  16   30:iload_3         
		//*  17   31:aaload          
		//*  18   32:aload           5
		//*  19   34:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
		//*  20   37:ifeq            47
					{
						if(i == j)
		//*  21   40:iload_3         
		//*  22   41:iload           4
		//*  23   43:icmpne          54
							return;
		//   24   46:return          
						break;
					}
					i++;
		//   25   47:iload_3         
		//   26   48:iconst_1        
		//   27   49:iadd            
		//   28   50:istore_3        
				} while(true);
		//   29   51:goto            20
			}
			super.depositSchemaProperty(jsonobjectformatvisitor, serializerprovider);
		//   30   54:aload_0         
		//   31   55:aload_1         
		//   32   56:aload_2         
		//   33   57:invokespecial   #56  <Method void BeanPropertyWriter.depositSchemaProperty(JsonObjectFormatVisitor, SerializerProvider)>
		//   34   60:return          
		}

		public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
		{
			return ((BeanPropertyWriter) (rename(nametransformer)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #62  <Method FilteredBeanPropertyWriter$MultiView rename(NameTransformer)>
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
		//    5    9:invokevirtual   #64  <Method BeanPropertyWriter BeanPropertyWriter.rename(NameTransformer)>
		//    6   12:aload_0         
		//    7   13:getfield        #27  <Field Class[] _views>
		//    8   16:invokespecial   #66  <Method void FilteredBeanPropertyWriter$MultiView(BeanPropertyWriter, Class[])>
		//    9   19:areturn         
		}

		public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws Exception
		{
			Class class1 = serializerprovider.getActiveView();
		//    0    0:aload_3         
		//    1    1:invokevirtual   #48  <Method Class SerializerProvider.getActiveView()>
		//    2    4:astore          6
			if(class1 != null)
		//*   3    6:aload           6
		//*   4    8:ifnull          70
			{
				int i = 0;
		//    5   11:iconst_0        
		//    6   12:istore          4
				int j = _views.length;
		//    7   14:aload_0         
		//    8   15:getfield        #27  <Field Class[] _views>
		//    9   18:arraylength     
		//   10   19:istore          5
				do
				{
					if(i >= j || _views[i].isAssignableFrom(class1))
		//*  11   21:iload           4
		//*  12   23:iload           5
		//*  13   25:icmpge          43
		//*  14   28:aload_0         
		//*  15   29:getfield        #27  <Field Class[] _views>
		//*  16   32:iload           4
		//*  17   34:aaload          
		//*  18   35:aload           6
		//*  19   37:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
		//*  20   40:ifeq            61
					{
						if(i == j)
		//*  21   43:iload           4
		//*  22   45:iload           5
		//*  23   47:icmpne          70
						{
							_delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
		//   24   50:aload_0         
		//   25   51:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   26   54:aload_1         
		//   27   55:aload_2         
		//   28   56:aload_3         
		//   29   57:invokevirtual   #73  <Method void BeanPropertyWriter.serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
							return;
		//   30   60:return          
						}
						break;
					}
					i++;
		//   31   61:iload           4
		//   32   63:iconst_1        
		//   33   64:iadd            
		//   34   65:istore          4
				} while(true);
		//   35   67:goto            21
			}
			_delegate.serializeAsElement(obj, jsongenerator, serializerprovider);
		//   36   70:aload_0         
		//   37   71:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   38   74:aload_1         
		//   39   75:aload_2         
		//   40   76:aload_3         
		//   41   77:invokevirtual   #75  <Method void BeanPropertyWriter.serializeAsElement(Object, JsonGenerator, SerializerProvider)>
		//   42   80:return          
		}

		public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws Exception
		{
			Class class1 = serializerprovider.getActiveView();
		//    0    0:aload_3         
		//    1    1:invokevirtual   #48  <Method Class SerializerProvider.getActiveView()>
		//    2    4:astore          6
			if(class1 != null)
		//*   3    6:aload           6
		//*   4    8:ifnull          70
			{
				int i = 0;
		//    5   11:iconst_0        
		//    6   12:istore          4
				int j = _views.length;
		//    7   14:aload_0         
		//    8   15:getfield        #27  <Field Class[] _views>
		//    9   18:arraylength     
		//   10   19:istore          5
				do
				{
					if(i >= j || _views[i].isAssignableFrom(class1))
		//*  11   21:iload           4
		//*  12   23:iload           5
		//*  13   25:icmpge          43
		//*  14   28:aload_0         
		//*  15   29:getfield        #27  <Field Class[] _views>
		//*  16   32:iload           4
		//*  17   34:aaload          
		//*  18   35:aload           6
		//*  19   37:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
		//*  20   40:ifeq            61
					{
						if(i == j)
		//*  21   43:iload           4
		//*  22   45:iload           5
		//*  23   47:icmpne          70
						{
							_delegate.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
		//   24   50:aload_0         
		//   25   51:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   26   54:aload_1         
		//   27   55:aload_2         
		//   28   56:aload_3         
		//   29   57:invokevirtual   #79  <Method void BeanPropertyWriter.serializeAsOmittedField(Object, JsonGenerator, SerializerProvider)>
							return;
		//   30   60:return          
						}
						break;
					}
					i++;
		//   31   61:iload           4
		//   32   63:iconst_1        
		//   33   64:iadd            
		//   34   65:istore          4
				} while(true);
		//   35   67:goto            21
			}
			_delegate.serializeAsField(obj, jsongenerator, serializerprovider);
		//   36   70:aload_0         
		//   37   71:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   38   74:aload_1         
		//   39   75:aload_2         
		//   40   76:aload_3         
		//   41   77:invokevirtual   #81  <Method void BeanPropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
		//   42   80:return          
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
			if(class1 == null || _view.isAssignableFrom(class1))
		//*   3    6:aload           4
		//*   4    8:ifnull          23
		//*   5   11:aload_0         
		//*   6   12:getfield        #27  <Field Class _view>
		//*   7   15:aload           4
		//*   8   17:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
		//*   9   20:ifeq            34
			{
				_delegate.serializeAsElement(obj, jsongenerator, serializerprovider);
		//   10   23:aload_0         
		//   11   24:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   12   27:aload_1         
		//   13   28:aload_2         
		//   14   29:aload_3         
		//   15   30:invokevirtual   #72  <Method void BeanPropertyWriter.serializeAsElement(Object, JsonGenerator, SerializerProvider)>
				return;
		//   16   33:return          
			} else
			{
				_delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
		//   17   34:aload_0         
		//   18   35:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   19   38:aload_1         
		//   20   39:aload_2         
		//   21   40:aload_3         
		//   22   41:invokevirtual   #75  <Method void BeanPropertyWriter.serializeAsPlaceholder(Object, JsonGenerator, SerializerProvider)>
				return;
		//   23   44:return          
			}
		}

		public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
			throws Exception
		{
			Class class1 = serializerprovider.getActiveView();
		//    0    0:aload_3         
		//    1    1:invokevirtual   #48  <Method Class SerializerProvider.getActiveView()>
		//    2    4:astore          4
			if(class1 == null || _view.isAssignableFrom(class1))
		//*   3    6:aload           4
		//*   4    8:ifnull          23
		//*   5   11:aload_0         
		//*   6   12:getfield        #27  <Field Class _view>
		//*   7   15:aload           4
		//*   8   17:invokevirtual   #54  <Method boolean Class.isAssignableFrom(Class)>
		//*   9   20:ifeq            34
			{
				_delegate.serializeAsField(obj, jsongenerator, serializerprovider);
		//   10   23:aload_0         
		//   11   24:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   12   27:aload_1         
		//   13   28:aload_2         
		//   14   29:aload_3         
		//   15   30:invokevirtual   #78  <Method void BeanPropertyWriter.serializeAsField(Object, JsonGenerator, SerializerProvider)>
				return;
		//   16   33:return          
			} else
			{
				_delegate.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
		//   17   34:aload_0         
		//   18   35:getfield        #25  <Field BeanPropertyWriter _delegate>
		//   19   38:aload_1         
		//   20   39:aload_2         
		//   21   40:aload_3         
		//   22   41:invokevirtual   #81  <Method void BeanPropertyWriter.serializeAsOmittedField(Object, JsonGenerator, SerializerProvider)>
				return;
		//   23   44:return          
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


	public FilteredBeanPropertyWriter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
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
	//   10   14:invokespecial   #20  <Method void FilteredBeanPropertyWriter$SingleView(BeanPropertyWriter, Class)>
	//   11   17:areturn         
		else
			return ((BeanPropertyWriter) (new MultiView(beanpropertywriter, aclass)));
	//   12   18:new             #6   <Class FilteredBeanPropertyWriter$MultiView>
	//   13   21:dup             
	//   14   22:aload_0         
	//   15   23:aload_1         
	//   16   24:invokespecial   #23  <Method void FilteredBeanPropertyWriter$MultiView(BeanPropertyWriter, Class[])>
	//   17   27:areturn         
	}
}
