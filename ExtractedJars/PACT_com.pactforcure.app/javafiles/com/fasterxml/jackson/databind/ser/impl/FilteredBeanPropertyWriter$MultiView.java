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

private static final class FilteredBeanPropertyWriter$MultiView extends BeanPropertyWriter
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

	public FilteredBeanPropertyWriter$MultiView rename(NameTransformer nametransformer)
	{
		return new FilteredBeanPropertyWriter$MultiView(_delegate.rename(nametransformer), _views);
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

	protected FilteredBeanPropertyWriter$MultiView(BeanPropertyWriter beanpropertywriter, Class aclass[])
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
