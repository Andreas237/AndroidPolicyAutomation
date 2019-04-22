// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//			SettableBeanProperty, SettableAnyProperty, BeanDeserializer, AbstractDeserializer, 
//			BuilderBasedDeserializer, ValueInstantiator

public class BeanDeserializerBuilder
{

	public BeanDeserializerBuilder(BeanDescription beandescription, DeserializationContext deserializationcontext)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #39  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #41  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #42  <Method void LinkedHashMap()>
	//    6   12:putfield        #44  <Field Map _properties>
		_beanDesc = beandescription;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #46  <Field BeanDescription _beanDesc>
		_context = deserializationcontext;
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:putfield        #48  <Field DeserializationContext _context>
		_config = deserializationcontext.getConfig();
	//   13   25:aload_0         
	//   14   26:aload_2         
	//   15   27:invokevirtual   #54  <Method DeserializationConfig DeserializationContext.getConfig()>
	//   16   30:putfield        #56  <Field DeserializationConfig _config>
	//   17   33:return          
	}

	protected Map _collectAliases(Collection collection)
	{
		AnnotationIntrospector annotationintrospector = _config.getAnnotationIntrospector();
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field DeserializationConfig _config>
	//    2    4:invokevirtual   #65  <Method AnnotationIntrospector DeserializationConfig.getAnnotationIntrospector()>
	//    3    7:astore          4
		Object obj = null;
	//    4    9:aconst_null     
	//    5   10:astore_2        
		Object obj1 = null;
	//    6   11:aconst_null     
	//    7   12:astore_3        
		if(annotationintrospector != null)
	//*   8   13:aload           4
	//*   9   15:ifnull          112
		{
			Iterator iterator = collection.iterator();
	//   10   18:aload_1         
	//   11   19:invokeinterface #71  <Method Iterator Collection.iterator()>
	//   12   24:astore          5
			collection = ((Collection) (obj1));
	//   13   26:aload_3         
	//   14   27:astore_1        
			do
			{
				obj = ((Object) (collection));
	//   15   28:aload_1         
	//   16   29:astore_2        
				if(!iterator.hasNext())
					break;
	//   17   30:aload           5
	//   18   32:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   19   37:ifeq            112
				SettableBeanProperty settablebeanproperty = (SettableBeanProperty)iterator.next();
	//   20   40:aload           5
	//   21   42:invokeinterface #81  <Method Object Iterator.next()>
	//   22   47:checkcast       #83  <Class SettableBeanProperty>
	//   23   50:astore_3        
				List list = annotationintrospector.findPropertyAliases(((com.fasterxml.jackson.databind.introspect.Annotated) (settablebeanproperty.getMember())));
	//   24   51:aload           4
	//   25   53:aload_3         
	//   26   54:invokevirtual   #87  <Method AnnotatedMember SettableBeanProperty.getMember()>
	//   27   57:invokevirtual   #93  <Method List AnnotationIntrospector.findPropertyAliases(com.fasterxml.jackson.databind.introspect.Annotated)>
	//   28   60:astore          6
				if(list != null && !list.isEmpty())
	//*  29   62:aload           6
	//*  30   64:ifnull          28
	//*  31   67:aload           6
	//*  32   69:invokeinterface #98  <Method boolean List.isEmpty()>
	//*  33   74:ifeq            80
	//*  34   77:goto            28
				{
					obj = ((Object) (collection));
	//   35   80:aload_1         
	//   36   81:astore_2        
					if(collection == null)
	//*  37   82:aload_1         
	//*  38   83:ifnonnull       94
						obj = ((Object) (new HashMap()));
	//   39   86:new             #100 <Class HashMap>
	//   40   89:dup             
	//   41   90:invokespecial   #101 <Method void HashMap()>
	//   42   93:astore_2        
					((Map) (obj)).put(((Object) (settablebeanproperty.getName())), ((Object) (list)));
	//   43   94:aload_2         
	//   44   95:aload_3         
	//   45   96:invokevirtual   #105 <Method String SettableBeanProperty.getName()>
	//   46   99:aload           6
	//   47  101:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//   48  106:pop             
					collection = ((Collection) (obj));
	//   49  107:aload_2         
	//   50  108:astore_1        
				}
			} while(true);
	//   51  109:goto            28
		}
		if(obj == null)
	//*  52  112:aload_2         
	//*  53  113:ifnonnull       120
			return Collections.emptyMap();
	//   54  116:invokestatic    #117 <Method Map Collections.emptyMap()>
	//   55  119:areturn         
		else
			return ((Map) (obj));
	//   56  120:aload_2         
	//   57  121:areturn         
	}

	protected void _fixAccess(Collection collection)
	{
		for(collection = ((Collection) (collection.iterator())); ((Iterator) (collection)).hasNext(); ((SettableBeanProperty)((Iterator) (collection)).next()).fixAccess(_config));
	//    0    0:aload_1         
	//    1    1:invokeinterface #71  <Method Iterator Collection.iterator()>
	//    2    6:astore_1        
	//    3    7:aload_1         
	//    4    8:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//    5   13:ifeq            35
	//    6   16:aload_1         
	//    7   17:invokeinterface #81  <Method Object Iterator.next()>
	//    8   22:checkcast       #83  <Class SettableBeanProperty>
	//    9   25:aload_0         
	//   10   26:getfield        #56  <Field DeserializationConfig _config>
	//   11   29:invokevirtual   #125 <Method void SettableBeanProperty.fixAccess(DeserializationConfig)>
	//*  12   32:goto            7
		collection = ((Collection) (_anySetter));
	//   13   35:aload_0         
	//   14   36:getfield        #127 <Field SettableAnyProperty _anySetter>
	//   15   39:astore_1        
		if(collection != null)
	//*  16   40:aload_1         
	//*  17   41:ifnull          52
			((SettableAnyProperty) (collection)).fixAccess(_config);
	//   18   44:aload_1         
	//   19   45:aload_0         
	//   20   46:getfield        #56  <Field DeserializationConfig _config>
	//   21   49:invokevirtual   #130 <Method void SettableAnyProperty.fixAccess(DeserializationConfig)>
		collection = ((Collection) (_buildMethod));
	//   22   52:aload_0         
	//   23   53:getfield        #132 <Field AnnotatedMethod _buildMethod>
	//   24   56:astore_1        
		if(collection != null)
	//*  25   57:aload_1         
	//*  26   58:ifnull          75
			((AnnotatedMethod) (collection)).fixAccess(_config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS));
	//   27   61:aload_1         
	//   28   62:aload_0         
	//   29   63:getfield        #56  <Field DeserializationConfig _config>
	//   30   66:getstatic       #138 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//   31   69:invokevirtual   #142 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   32   72:invokevirtual   #147 <Method void AnnotatedMethod.fixAccess(boolean)>
	//   33   75:return          
	}

	public void addBackReferenceProperty(String s, SettableBeanProperty settablebeanproperty)
	{
		if(_backRefProperties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #152 <Field HashMap _backRefProperties>
	//*   2    4:ifnonnull       19
			_backRefProperties = new HashMap(4);
	//    3    7:aload_0         
	//    4    8:new             #100 <Class HashMap>
	//    5   11:dup             
	//    6   12:iconst_4        
	//    7   13:invokespecial   #155 <Method void HashMap(int)>
	//    8   16:putfield        #152 <Field HashMap _backRefProperties>
		settablebeanproperty.fixAccess(_config);
	//    9   19:aload_2         
	//   10   20:aload_0         
	//   11   21:getfield        #56  <Field DeserializationConfig _config>
	//   12   24:invokevirtual   #125 <Method void SettableBeanProperty.fixAccess(DeserializationConfig)>
		_backRefProperties.put(((Object) (s)), ((Object) (settablebeanproperty)));
	//   13   27:aload_0         
	//   14   28:getfield        #152 <Field HashMap _backRefProperties>
	//   15   31:aload_1         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #156 <Method Object HashMap.put(Object, Object)>
	//   18   36:pop             
	//   19   37:return          
	}

	public void addCreatorProperty(SettableBeanProperty settablebeanproperty)
	{
		addProperty(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #161 <Method void addProperty(SettableBeanProperty)>
	//    3    5:return          
	}

	public void addIgnorable(String s)
	{
		if(_ignorableProps == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #165 <Field HashSet _ignorableProps>
	//*   2    4:ifnonnull       18
			_ignorableProps = new HashSet();
	//    3    7:aload_0         
	//    4    8:new             #167 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #168 <Method void HashSet()>
	//    7   15:putfield        #165 <Field HashSet _ignorableProps>
		_ignorableProps.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #165 <Field HashSet _ignorableProps>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #172 <Method boolean HashSet.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void addInjectable(PropertyName propertyname, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember, Object obj)
	{
		if(_injectables == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #176 <Field List _injectables>
	//*   2    4:ifnonnull       18
			_injectables = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #178 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #179 <Method void ArrayList()>
	//    7   15:putfield        #176 <Field List _injectables>
		boolean flag1 = _config.canOverrideAccessModifiers();
	//    8   18:aload_0         
	//    9   19:getfield        #56  <Field DeserializationConfig _config>
	//   10   22:invokevirtual   #182 <Method boolean DeserializationConfig.canOverrideAccessModifiers()>
	//   11   25:istore          7
		boolean flag;
		if(flag1 && _config.isEnabled(MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS))
	//*  12   27:iload           7
	//*  13   29:ifeq            51
	//*  14   32:aload_0         
	//*  15   33:getfield        #56  <Field DeserializationConfig _config>
	//*  16   36:getstatic       #138 <Field MapperFeature MapperFeature.OVERRIDE_PUBLIC_ACCESS_MODIFIERS>
	//*  17   39:invokevirtual   #142 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//*  18   42:ifeq            51
			flag = true;
	//   19   45:iconst_1        
	//   20   46:istore          6
		else
	//*  21   48:goto            54
			flag = false;
	//   22   51:iconst_0        
	//   23   52:istore          6
		if(flag1)
	//*  24   54:iload           7
	//*  25   56:ifeq            66
			annotatedmember.fixAccess(flag);
	//   26   59:aload           4
	//   27   61:iload           6
	//   28   63:invokevirtual   #185 <Method void AnnotatedMember.fixAccess(boolean)>
		_injectables.add(((Object) (new ValueInjector(propertyname, javatype, annotatedmember, obj))));
	//   29   66:aload_0         
	//   30   67:getfield        #176 <Field List _injectables>
	//   31   70:new             #187 <Class ValueInjector>
	//   32   73:dup             
	//   33   74:aload_1         
	//   34   75:aload_2         
	//   35   76:aload           4
	//   36   78:aload           5
	//   37   80:invokespecial   #190 <Method void ValueInjector(PropertyName, JavaType, AnnotatedMember, Object)>
	//   38   83:invokeinterface #191 <Method boolean List.add(Object)>
	//   39   88:pop             
	//   40   89:return          
	}

	public void addOrReplaceProperty(SettableBeanProperty settablebeanproperty, boolean flag)
	{
		_properties.put(((Object) (settablebeanproperty.getName())), ((Object) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Map _properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method String SettableBeanProperty.getName()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void addProperty(SettableBeanProperty settablebeanproperty)
	{
		SettableBeanProperty settablebeanproperty1 = (SettableBeanProperty)_properties.put(((Object) (settablebeanproperty.getName())), ((Object) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Map _properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #105 <Method String SettableBeanProperty.getName()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #111 <Method Object Map.put(Object, Object)>
	//    6   14:checkcast       #83  <Class SettableBeanProperty>
	//    7   17:astore_2        
		if(settablebeanproperty1 != null)
	//*   8   18:aload_2         
	//*   9   19:ifnull          83
		{
			if(settablebeanproperty1 == settablebeanproperty)
	//*  10   22:aload_2         
	//*  11   23:aload_1         
	//*  12   24:if_acmpne       28
			{
				return;
	//   13   27:return          
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   14   28:new             #195 <Class StringBuilder>
	//   15   31:dup             
	//   16   32:invokespecial   #196 <Method void StringBuilder()>
	//   17   35:astore_2        
				stringbuilder.append("Duplicate property '");
	//   18   36:aload_2         
	//   19   37:ldc1            #198 <String "Duplicate property '">
	//   20   39:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
				stringbuilder.append(settablebeanproperty.getName());
	//   22   43:aload_2         
	//   23   44:aload_1         
	//   24   45:invokevirtual   #105 <Method String SettableBeanProperty.getName()>
	//   25   48:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
				stringbuilder.append("' for ");
	//   27   52:aload_2         
	//   28   53:ldc1            #204 <String "' for ">
	//   29   55:invokevirtual   #202 <Method StringBuilder StringBuilder.append(String)>
	//   30   58:pop             
				stringbuilder.append(((Object) (_beanDesc.getType())));
	//   31   59:aload_2         
	//   32   60:aload_0         
	//   33   61:getfield        #46  <Field BeanDescription _beanDesc>
	//   34   64:invokevirtual   #210 <Method JavaType BeanDescription.getType()>
	//   35   67:invokevirtual   #213 <Method StringBuilder StringBuilder.append(Object)>
	//   36   70:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   37   71:new             #215 <Class IllegalArgumentException>
	//   38   74:dup             
	//   39   75:aload_2         
	//   40   76:invokevirtual   #218 <Method String StringBuilder.toString()>
	//   41   79:invokespecial   #220 <Method void IllegalArgumentException(String)>
	//   42   82:athrow          
			}
		} else
		{
			return;
	//   43   83:return          
		}
	}

	public JsonDeserializer build()
	{
		boolean flag;
		BeanPropertyMap beanpropertymap;
label0:
		{
			Object obj = ((Object) (_properties.values()));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Map _properties>
	//    2    4:invokeinterface #226 <Method Collection Map.values()>
	//    3    9:astore_3        
			_fixAccess(((Collection) (obj)));
	//    4   10:aload_0         
	//    5   11:aload_3         
	//    6   12:invokevirtual   #228 <Method void _fixAccess(Collection)>
			beanpropertymap = BeanPropertyMap.construct(((Collection) (obj)), _config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), _collectAliases(((Collection) (obj))));
	//    7   15:aload_3         
	//    8   16:aload_0         
	//    9   17:getfield        #56  <Field DeserializationConfig _config>
	//   10   20:getstatic       #231 <Field MapperFeature MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//   11   23:invokevirtual   #142 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   12   26:aload_0         
	//   13   27:aload_3         
	//   14   28:invokevirtual   #233 <Method Map _collectAliases(Collection)>
	//   15   31:invokestatic    #239 <Method BeanPropertyMap BeanPropertyMap.construct(Collection, boolean, Map)>
	//   16   34:astore_2        
			beanpropertymap.assignIndexes();
	//   17   35:aload_2         
	//   18   36:invokevirtual   #243 <Method BeanPropertyMap BeanPropertyMap.assignIndexes()>
	//   19   39:pop             
			flag = _config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION) ^ true;
	//   20   40:aload_0         
	//   21   41:getfield        #56  <Field DeserializationConfig _config>
	//   22   44:getstatic       #246 <Field MapperFeature MapperFeature.DEFAULT_VIEW_INCLUSION>
	//   23   47:invokevirtual   #142 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   24   50:iconst_1        
	//   25   51:ixor            
	//   26   52:istore_1        
			if(flag)
				break label0;
	//   27   53:iload_1         
	//   28   54:ifne            93
			obj = ((Object) (((Collection) (obj)).iterator()));
	//   29   57:aload_3         
	//   30   58:invokeinterface #71  <Method Iterator Collection.iterator()>
	//   31   63:astore_3        
			do
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//   32   64:aload_3         
	//   33   65:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//   34   70:ifeq            93
			while(!((SettableBeanProperty)((Iterator) (obj)).next()).hasViews());
	//   35   73:aload_3         
	//   36   74:invokeinterface #81  <Method Object Iterator.next()>
	//   37   79:checkcast       #83  <Class SettableBeanProperty>
	//   38   82:invokevirtual   #249 <Method boolean SettableBeanProperty.hasViews()>
	//   39   85:ifeq            64
			flag = true;
	//   40   88:iconst_1        
	//   41   89:istore_1        
		}
	//*  42   90:goto            93
		ObjectIdReader objectidreader = _objectIdReader;
	//   43   93:aload_0         
	//   44   94:getfield        #251 <Field ObjectIdReader _objectIdReader>
	//   45   97:astore_3        
		if(objectidreader != null)
	//*  46   98:aload_3         
	//*  47   99:ifnull          121
			beanpropertymap = beanpropertymap.withProperty(((SettableBeanProperty) (new ObjectIdValueProperty(objectidreader, PropertyMetadata.STD_REQUIRED))));
	//   48  102:aload_2         
	//   49  103:new             #253 <Class ObjectIdValueProperty>
	//   50  106:dup             
	//   51  107:aload_3         
	//   52  108:getstatic       #259 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//   53  111:invokespecial   #262 <Method void ObjectIdValueProperty(ObjectIdReader, PropertyMetadata)>
	//   54  114:invokevirtual   #266 <Method BeanPropertyMap BeanPropertyMap.withProperty(SettableBeanProperty)>
	//   55  117:astore_2        
	//*  56  118:goto            121
		return ((JsonDeserializer) (new BeanDeserializer(this, _beanDesc, beanpropertymap, ((Map) (_backRefProperties)), _ignorableProps, _ignoreAllUnknown, flag)));
	//   57  121:new             #268 <Class BeanDeserializer>
	//   58  124:dup             
	//   59  125:aload_0         
	//   60  126:aload_0         
	//   61  127:getfield        #46  <Field BeanDescription _beanDesc>
	//   62  130:aload_2         
	//   63  131:aload_0         
	//   64  132:getfield        #152 <Field HashMap _backRefProperties>
	//   65  135:aload_0         
	//   66  136:getfield        #165 <Field HashSet _ignorableProps>
	//   67  139:aload_0         
	//   68  140:getfield        #270 <Field boolean _ignoreAllUnknown>
	//   69  143:iload_1         
	//   70  144:invokespecial   #273 <Method void BeanDeserializer(BeanDeserializerBuilder, BeanDescription, BeanPropertyMap, Map, HashSet, boolean, boolean)>
	//   71  147:areturn         
	}

	public AbstractDeserializer buildAbstract()
	{
		return new AbstractDeserializer(this, _beanDesc, ((Map) (_backRefProperties)), _properties);
	//    0    0:new             #278 <Class AbstractDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #46  <Field BeanDescription _beanDesc>
	//    5    9:aload_0         
	//    6   10:getfield        #152 <Field HashMap _backRefProperties>
	//    7   13:aload_0         
	//    8   14:getfield        #44  <Field Map _properties>
	//    9   17:invokespecial   #281 <Method void AbstractDeserializer(BeanDeserializerBuilder, BeanDescription, Map, Map)>
	//   10   20:areturn         
	}

	public JsonDeserializer buildBuilderBased(JavaType javatype, String s)
		throws JsonMappingException
	{
		boolean flag;
label0:
		{
			Object obj = ((Object) (_buildMethod));
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field AnnotatedMethod _buildMethod>
	//    2    4:astore          4
			if(obj == null)
	//*   3    6:aload           4
	//*   4    8:ifnonnull       63
			{
				if(!s.isEmpty())
	//*   5   11:aload_2         
	//*   6   12:invokevirtual   #288 <Method boolean String.isEmpty()>
	//*   7   15:ifne            151
					_context.reportBadDefinition(_beanDesc.getType(), String.format("Builder class %s does not have build method (name: '%s')", new Object[] {
						_beanDesc.getBeanClass().getName(), s
					}));
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field DeserializationContext _context>
	//   10   22:aload_0         
	//   11   23:getfield        #46  <Field BeanDescription _beanDesc>
	//   12   26:invokevirtual   #210 <Method JavaType BeanDescription.getType()>
	//   13   29:ldc2            #290 <String "Builder class %s does not have build method (name: '%s')">
	//   14   32:iconst_2        
	//   15   33:anewarray       Object[]
	//   16   36:dup             
	//   17   37:iconst_0        
	//   18   38:aload_0         
	//   19   39:getfield        #46  <Field BeanDescription _beanDesc>
	//   20   42:invokevirtual   #294 <Method Class BeanDescription.getBeanClass()>
	//   21   45:invokevirtual   #297 <Method String Class.getName()>
	//   22   48:aastore         
	//   23   49:dup             
	//   24   50:iconst_1        
	//   25   51:aload_2         
	//   26   52:aastore         
	//   27   53:invokestatic    #301 <Method String String.format(String, Object[])>
	//   28   56:invokevirtual   #305 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   29   59:pop             
			} else
	//*  30   60:goto            151
			{
				s = ((String) (((AnnotatedMethod) (obj)).getRawReturnType()));
	//   31   63:aload           4
	//   32   65:invokevirtual   #308 <Method Class AnnotatedMethod.getRawReturnType()>
	//   33   68:astore_2        
				obj = ((Object) (javatype.getRawClass()));
	//   34   69:aload_1         
	//   35   70:invokevirtual   #313 <Method Class JavaType.getRawClass()>
	//   36   73:astore          4
				if(s != obj && !((Class) (s)).isAssignableFrom(((Class) (obj))) && !((Class) (obj)).isAssignableFrom(((Class) (s))))
	//*  37   75:aload_2         
	//*  38   76:aload           4
	//*  39   78:if_acmpeq       151
	//*  40   81:aload_2         
	//*  41   82:aload           4
	//*  42   84:invokevirtual   #317 <Method boolean Class.isAssignableFrom(Class)>
	//*  43   87:ifne            151
	//*  44   90:aload           4
	//*  45   92:aload_2         
	//*  46   93:invokevirtual   #317 <Method boolean Class.isAssignableFrom(Class)>
	//*  47   96:ifne            151
					_context.reportBadDefinition(_beanDesc.getType(), String.format("Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)", new Object[] {
						_buildMethod.getFullName(), ((Class) (s)).getName(), javatype.getRawClass().getName()
					}));
	//   48   99:aload_0         
	//   49  100:getfield        #48  <Field DeserializationContext _context>
	//   50  103:aload_0         
	//   51  104:getfield        #46  <Field BeanDescription _beanDesc>
	//   52  107:invokevirtual   #210 <Method JavaType BeanDescription.getType()>
	//   53  110:ldc2            #319 <String "Build method '%s' has wrong return type (%s), not compatible with POJO type (%s)">
	//   54  113:iconst_3        
	//   55  114:anewarray       Object[]
	//   56  117:dup             
	//   57  118:iconst_0        
	//   58  119:aload_0         
	//   59  120:getfield        #132 <Field AnnotatedMethod _buildMethod>
	//   60  123:invokevirtual   #322 <Method String AnnotatedMethod.getFullName()>
	//   61  126:aastore         
	//   62  127:dup             
	//   63  128:iconst_1        
	//   64  129:aload_2         
	//   65  130:invokevirtual   #297 <Method String Class.getName()>
	//   66  133:aastore         
	//   67  134:dup             
	//   68  135:iconst_2        
	//   69  136:aload_1         
	//   70  137:invokevirtual   #313 <Method Class JavaType.getRawClass()>
	//   71  140:invokevirtual   #297 <Method String Class.getName()>
	//   72  143:aastore         
	//   73  144:invokestatic    #301 <Method String String.format(String, Object[])>
	//   74  147:invokevirtual   #305 <Method Object DeserializationContext.reportBadDefinition(JavaType, String)>
	//   75  150:pop             
			}
			obj = ((Object) (_properties.values()));
	//   76  151:aload_0         
	//   77  152:getfield        #44  <Field Map _properties>
	//   78  155:invokeinterface #226 <Method Collection Map.values()>
	//   79  160:astore          4
			_fixAccess(((Collection) (obj)));
	//   80  162:aload_0         
	//   81  163:aload           4
	//   82  165:invokevirtual   #228 <Method void _fixAccess(Collection)>
			s = ((String) (BeanPropertyMap.construct(((Collection) (obj)), _config.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES), _collectAliases(((Collection) (obj))))));
	//   83  168:aload           4
	//   84  170:aload_0         
	//   85  171:getfield        #56  <Field DeserializationConfig _config>
	//   86  174:getstatic       #231 <Field MapperFeature MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//   87  177:invokevirtual   #142 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   88  180:aload_0         
	//   89  181:aload           4
	//   90  183:invokevirtual   #233 <Method Map _collectAliases(Collection)>
	//   91  186:invokestatic    #239 <Method BeanPropertyMap BeanPropertyMap.construct(Collection, boolean, Map)>
	//   92  189:astore_2        
			((BeanPropertyMap) (s)).assignIndexes();
	//   93  190:aload_2         
	//   94  191:invokevirtual   #243 <Method BeanPropertyMap BeanPropertyMap.assignIndexes()>
	//   95  194:pop             
			flag = _config.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION) ^ true;
	//   96  195:aload_0         
	//   97  196:getfield        #56  <Field DeserializationConfig _config>
	//   98  199:getstatic       #246 <Field MapperFeature MapperFeature.DEFAULT_VIEW_INCLUSION>
	//   99  202:invokevirtual   #142 <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//  100  205:iconst_1        
	//  101  206:ixor            
	//  102  207:istore_3        
			if(flag)
				break label0;
	//  103  208:iload_3         
	//  104  209:ifne            252
			obj = ((Object) (((Collection) (obj)).iterator()));
	//  105  212:aload           4
	//  106  214:invokeinterface #71  <Method Iterator Collection.iterator()>
	//  107  219:astore          4
			do
				if(!((Iterator) (obj)).hasNext())
					break label0;
	//  108  221:aload           4
	//  109  223:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//  110  228:ifeq            252
			while(!((SettableBeanProperty)((Iterator) (obj)).next()).hasViews());
	//  111  231:aload           4
	//  112  233:invokeinterface #81  <Method Object Iterator.next()>
	//  113  238:checkcast       #83  <Class SettableBeanProperty>
	//  114  241:invokevirtual   #249 <Method boolean SettableBeanProperty.hasViews()>
	//  115  244:ifeq            221
			flag = true;
	//  116  247:iconst_1        
	//  117  248:istore_3        
		}
	//* 118  249:goto            252
		ObjectIdReader objectidreader = _objectIdReader;
	//  119  252:aload_0         
	//  120  253:getfield        #251 <Field ObjectIdReader _objectIdReader>
	//  121  256:astore          4
		if(objectidreader != null)
	//* 122  258:aload           4
	//* 123  260:ifnull          283
			s = ((String) (((BeanPropertyMap) (s)).withProperty(((SettableBeanProperty) (new ObjectIdValueProperty(objectidreader, PropertyMetadata.STD_REQUIRED))))));
	//  124  263:aload_2         
	//  125  264:new             #253 <Class ObjectIdValueProperty>
	//  126  267:dup             
	//  127  268:aload           4
	//  128  270:getstatic       #259 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//  129  273:invokespecial   #262 <Method void ObjectIdValueProperty(ObjectIdReader, PropertyMetadata)>
	//  130  276:invokevirtual   #266 <Method BeanPropertyMap BeanPropertyMap.withProperty(SettableBeanProperty)>
	//  131  279:astore_2        
	//* 132  280:goto            283
		return ((JsonDeserializer) (new BuilderBasedDeserializer(this, _beanDesc, javatype, ((BeanPropertyMap) (s)), ((Map) (_backRefProperties)), ((java.util.Set) (_ignorableProps)), _ignoreAllUnknown, flag)));
	//  133  283:new             #324 <Class BuilderBasedDeserializer>
	//  134  286:dup             
	//  135  287:aload_0         
	//  136  288:aload_0         
	//  137  289:getfield        #46  <Field BeanDescription _beanDesc>
	//  138  292:aload_1         
	//  139  293:aload_2         
	//  140  294:aload_0         
	//  141  295:getfield        #152 <Field HashMap _backRefProperties>
	//  142  298:aload_0         
	//  143  299:getfield        #165 <Field HashSet _ignorableProps>
	//  144  302:aload_0         
	//  145  303:getfield        #270 <Field boolean _ignoreAllUnknown>
	//  146  306:iload_3         
	//  147  307:invokespecial   #327 <Method void BuilderBasedDeserializer(BeanDeserializerBuilder, BeanDescription, JavaType, BeanPropertyMap, Map, java.util.Set, boolean, boolean)>
	//  148  310:areturn         
	}

	public SettableBeanProperty findProperty(PropertyName propertyname)
	{
		return (SettableBeanProperty)_properties.get(((Object) (propertyname.getSimpleName())));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Map _properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #336 <Method String PropertyName.getSimpleName()>
	//    4    8:invokeinterface #340 <Method Object Map.get(Object)>
	//    5   13:checkcast       #83  <Class SettableBeanProperty>
	//    6   16:areturn         
	}

	public SettableAnyProperty getAnySetter()
	{
		return _anySetter;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field SettableAnyProperty _anySetter>
	//    2    4:areturn         
	}

	public AnnotatedMethod getBuildMethod()
	{
		return _buildMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #132 <Field AnnotatedMethod _buildMethod>
	//    2    4:areturn         
	}

	public List getInjectables()
	{
		return _injectables;
	//    0    0:aload_0         
	//    1    1:getfield        #176 <Field List _injectables>
	//    2    4:areturn         
	}

	public ObjectIdReader getObjectIdReader()
	{
		return _objectIdReader;
	//    0    0:aload_0         
	//    1    1:getfield        #251 <Field ObjectIdReader _objectIdReader>
	//    2    4:areturn         
	}

	public ValueInstantiator getValueInstantiator()
	{
		return _valueInstantiator;
	//    0    0:aload_0         
	//    1    1:getfield        #353 <Field ValueInstantiator _valueInstantiator>
	//    2    4:areturn         
	}

	public boolean hasIgnorable(String s)
	{
		HashSet hashset = _ignorableProps;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field HashSet _ignorableProps>
	//    2    4:astore_2        
		return hashset != null && hashset.contains(((Object) (s)));
	//    3    5:aload_2         
	//    4    6:ifnull          19
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #358 <Method boolean HashSet.contains(Object)>
	//    8   14:ifeq            19
	//    9   17:iconst_1        
	//   10   18:ireturn         
	//   11   19:iconst_0        
	//   12   20:ireturn         
	}

	public void setAnySetter(SettableAnyProperty settableanyproperty)
	{
		if(_anySetter != null && settableanyproperty != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field SettableAnyProperty _anySetter>
	//*   2    4:ifnull          25
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       14
	//*   5   11:goto            25
		{
			throw new IllegalStateException("_anySetter already set to non-null");
	//    6   14:new             #362 <Class IllegalStateException>
	//    7   17:dup             
	//    8   18:ldc2            #364 <String "_anySetter already set to non-null">
	//    9   21:invokespecial   #365 <Method void IllegalStateException(String)>
	//   10   24:athrow          
		} else
		{
			_anySetter = settableanyproperty;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #127 <Field SettableAnyProperty _anySetter>
			return;
	//   14   30:return          
		}
	}

	public void setIgnoreUnknownProperties(boolean flag)
	{
		_ignoreAllUnknown = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #270 <Field boolean _ignoreAllUnknown>
	//    3    5:return          
	}

	public void setObjectIdReader(ObjectIdReader objectidreader)
	{
		_objectIdReader = objectidreader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #251 <Field ObjectIdReader _objectIdReader>
	//    3    5:return          
	}

	public void setPOJOBuilder(AnnotatedMethod annotatedmethod, com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value)
	{
		_buildMethod = annotatedmethod;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field AnnotatedMethod _buildMethod>
		_builderConfig = value;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #372 <Field com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value _builderConfig>
	//    6   10:return          
	}

	public void setValueInstantiator(ValueInstantiator valueinstantiator)
	{
		_valueInstantiator = valueinstantiator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #353 <Field ValueInstantiator _valueInstantiator>
	//    3    5:return          
	}

	protected SettableAnyProperty _anySetter;
	protected HashMap _backRefProperties;
	protected final BeanDescription _beanDesc;
	protected AnnotatedMethod _buildMethod;
	protected com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value _builderConfig;
	protected final DeserializationConfig _config;
	protected final DeserializationContext _context;
	protected HashSet _ignorableProps;
	protected boolean _ignoreAllUnknown;
	protected List _injectables;
	protected ObjectIdReader _objectIdReader;
	protected final Map _properties = new LinkedHashMap();
	protected ValueInstantiator _valueInstantiator;
}
