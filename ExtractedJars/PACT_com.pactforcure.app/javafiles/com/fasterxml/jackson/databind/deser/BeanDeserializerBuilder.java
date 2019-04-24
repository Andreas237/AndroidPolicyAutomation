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
//			SettableBeanProperty, BeanDeserializer, AbstractDeserializer, BuilderBasedDeserializer, 
//			SettableAnyProperty, ValueInstantiator

public class BeanDeserializerBuilder
{

	public BeanDeserializerBuilder(BeanDescription beandescription, DeserializationConfig deserializationconfig)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		_properties = ((Map) (new LinkedHashMap()));
	//    2    4:aload_0         
	//    3    5:new             #39  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void LinkedHashMap()>
	//    6   12:putfield        #42  <Field Map _properties>
		_beanDesc = beandescription;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #44  <Field BeanDescription _beanDesc>
		_defaultViewInclusion = deserializationconfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
	//   10   20:aload_0         
	//   11   21:aload_2         
	//   12   22:getstatic       #50  <Field MapperFeature MapperFeature.DEFAULT_VIEW_INCLUSION>
	//   13   25:invokevirtual   #56  <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   14   28:putfield        #58  <Field boolean _defaultViewInclusion>
		_caseInsensitivePropertyComparison = deserializationconfig.isEnabled(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:getstatic       #61  <Field MapperFeature MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES>
	//   18   36:invokevirtual   #56  <Method boolean DeserializationConfig.isEnabled(MapperFeature)>
	//   19   39:putfield        #63  <Field boolean _caseInsensitivePropertyComparison>
	//   20   42:return          
	}

	protected BeanDeserializerBuilder(BeanDeserializerBuilder beandeserializerbuilder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		_properties = ((Map) (new LinkedHashMap()));
	//    2    4:aload_0         
	//    3    5:new             #39  <Class LinkedHashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #40  <Method void LinkedHashMap()>
	//    6   12:putfield        #42  <Field Map _properties>
		_beanDesc = beandeserializerbuilder._beanDesc;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:getfield        #44  <Field BeanDescription _beanDesc>
	//   10   20:putfield        #44  <Field BeanDescription _beanDesc>
		_defaultViewInclusion = beandeserializerbuilder._defaultViewInclusion;
	//   11   23:aload_0         
	//   12   24:aload_1         
	//   13   25:getfield        #58  <Field boolean _defaultViewInclusion>
	//   14   28:putfield        #58  <Field boolean _defaultViewInclusion>
		_caseInsensitivePropertyComparison = beandeserializerbuilder._caseInsensitivePropertyComparison;
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:getfield        #63  <Field boolean _caseInsensitivePropertyComparison>
	//   18   36:putfield        #63  <Field boolean _caseInsensitivePropertyComparison>
		_properties.putAll(beandeserializerbuilder._properties);
	//   19   39:aload_0         
	//   20   40:getfield        #42  <Field Map _properties>
	//   21   43:aload_1         
	//   22   44:getfield        #42  <Field Map _properties>
	//   23   47:invokeinterface #71  <Method void Map.putAll(Map)>
		_injectables = _copy(beandeserializerbuilder._injectables);
	//   24   52:aload_0         
	//   25   53:aload_1         
	//   26   54:getfield        #73  <Field List _injectables>
	//   27   57:invokestatic    #77  <Method List _copy(List)>
	//   28   60:putfield        #73  <Field List _injectables>
		_backRefProperties = _copy(beandeserializerbuilder._backRefProperties);
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:getfield        #79  <Field HashMap _backRefProperties>
	//   32   68:invokestatic    #82  <Method HashMap _copy(HashMap)>
	//   33   71:putfield        #79  <Field HashMap _backRefProperties>
		_ignorableProps = beandeserializerbuilder._ignorableProps;
	//   34   74:aload_0         
	//   35   75:aload_1         
	//   36   76:getfield        #84  <Field HashSet _ignorableProps>
	//   37   79:putfield        #84  <Field HashSet _ignorableProps>
		_valueInstantiator = beandeserializerbuilder._valueInstantiator;
	//   38   82:aload_0         
	//   39   83:aload_1         
	//   40   84:getfield        #86  <Field ValueInstantiator _valueInstantiator>
	//   41   87:putfield        #86  <Field ValueInstantiator _valueInstantiator>
		_objectIdReader = beandeserializerbuilder._objectIdReader;
	//   42   90:aload_0         
	//   43   91:aload_1         
	//   44   92:getfield        #88  <Field ObjectIdReader _objectIdReader>
	//   45   95:putfield        #88  <Field ObjectIdReader _objectIdReader>
		_anySetter = beandeserializerbuilder._anySetter;
	//   46   98:aload_0         
	//   47   99:aload_1         
	//   48  100:getfield        #90  <Field SettableAnyProperty _anySetter>
	//   49  103:putfield        #90  <Field SettableAnyProperty _anySetter>
		_ignoreAllUnknown = beandeserializerbuilder._ignoreAllUnknown;
	//   50  106:aload_0         
	//   51  107:aload_1         
	//   52  108:getfield        #92  <Field boolean _ignoreAllUnknown>
	//   53  111:putfield        #92  <Field boolean _ignoreAllUnknown>
		_buildMethod = beandeserializerbuilder._buildMethod;
	//   54  114:aload_0         
	//   55  115:aload_1         
	//   56  116:getfield        #94  <Field AnnotatedMethod _buildMethod>
	//   57  119:putfield        #94  <Field AnnotatedMethod _buildMethod>
		_builderConfig = beandeserializerbuilder._builderConfig;
	//   58  122:aload_0         
	//   59  123:aload_1         
	//   60  124:getfield        #96  <Field com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value _builderConfig>
	//   61  127:putfield        #96  <Field com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value _builderConfig>
	//   62  130:return          
	}

	private static HashMap _copy(HashMap hashmap)
	{
		if(hashmap == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new HashMap(((Map) (hashmap)));
	//    4    6:new             #98  <Class HashMap>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #100 <Method void HashMap(Map)>
	//    8   14:areturn         
	}

	private static List _copy(List list)
	{
		if(list == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return ((List) (new ArrayList(((Collection) (list)))));
	//    4    6:new             #104 <Class ArrayList>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #107 <Method void ArrayList(Collection)>
	//    8   14:areturn         
	}

	public void addBackReferenceProperty(String s, SettableBeanProperty settablebeanproperty)
	{
		if(_backRefProperties == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field HashMap _backRefProperties>
	//*   2    4:ifnonnull       19
			_backRefProperties = new HashMap(4);
	//    3    7:aload_0         
	//    4    8:new             #98  <Class HashMap>
	//    5   11:dup             
	//    6   12:iconst_4        
	//    7   13:invokespecial   #113 <Method void HashMap(int)>
	//    8   16:putfield        #79  <Field HashMap _backRefProperties>
		_backRefProperties.put(((Object) (s)), ((Object) (settablebeanproperty)));
	//    9   19:aload_0         
	//   10   20:getfield        #79  <Field HashMap _backRefProperties>
	//   11   23:aload_1         
	//   12   24:aload_2         
	//   13   25:invokevirtual   #117 <Method Object HashMap.put(Object, Object)>
	//   14   28:pop             
		if(_properties != null)
	//*  15   29:aload_0         
	//*  16   30:getfield        #42  <Field Map _properties>
	//*  17   33:ifnull          50
			_properties.remove(((Object) (settablebeanproperty.getName())));
	//   18   36:aload_0         
	//   19   37:getfield        #42  <Field Map _properties>
	//   20   40:aload_2         
	//   21   41:invokevirtual   #123 <Method String SettableBeanProperty.getName()>
	//   22   44:invokeinterface #127 <Method Object Map.remove(Object)>
	//   23   49:pop             
	//   24   50:return          
	}

	public void addCreatorProperty(SettableBeanProperty settablebeanproperty)
	{
		addProperty(settablebeanproperty);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #132 <Method void addProperty(SettableBeanProperty)>
	//    3    5:return          
	}

	public void addIgnorable(String s)
	{
		if(_ignorableProps == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field HashSet _ignorableProps>
	//*   2    4:ifnonnull       18
			_ignorableProps = new HashSet();
	//    3    7:aload_0         
	//    4    8:new             #136 <Class HashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #137 <Method void HashSet()>
	//    7   15:putfield        #84  <Field HashSet _ignorableProps>
		_ignorableProps.add(((Object) (s)));
	//    8   18:aload_0         
	//    9   19:getfield        #84  <Field HashSet _ignorableProps>
	//   10   22:aload_1         
	//   11   23:invokevirtual   #141 <Method boolean HashSet.add(Object)>
	//   12   26:pop             
	//   13   27:return          
	}

	public void addInjectable(PropertyName propertyname, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember, Object obj)
	{
		if(_injectables == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field List _injectables>
	//*   2    4:ifnonnull       18
			_injectables = ((List) (new ArrayList()));
	//    3    7:aload_0         
	//    4    8:new             #104 <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #144 <Method void ArrayList()>
	//    7   15:putfield        #73  <Field List _injectables>
		_injectables.add(((Object) (new ValueInjector(propertyname, javatype, annotations, annotatedmember, obj))));
	//    8   18:aload_0         
	//    9   19:getfield        #73  <Field List _injectables>
	//   10   22:new             #146 <Class ValueInjector>
	//   11   25:dup             
	//   12   26:aload_1         
	//   13   27:aload_2         
	//   14   28:aload_3         
	//   15   29:aload           4
	//   16   31:aload           5
	//   17   33:invokespecial   #148 <Method void ValueInjector(PropertyName, JavaType, Annotations, AnnotatedMember, Object)>
	//   18   36:invokeinterface #151 <Method boolean List.add(Object)>
	//   19   41:pop             
	//   20   42:return          
	}

	public void addOrReplaceProperty(SettableBeanProperty settablebeanproperty, boolean flag)
	{
		_properties.put(((Object) (settablebeanproperty.getName())), ((Object) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map _properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method String SettableBeanProperty.getName()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//    6   14:pop             
	//    7   15:return          
	}

	public void addProperty(SettableBeanProperty settablebeanproperty)
	{
		SettableBeanProperty settablebeanproperty1 = (SettableBeanProperty)_properties.put(((Object) (settablebeanproperty.getName())), ((Object) (settablebeanproperty)));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map _properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #123 <Method String SettableBeanProperty.getName()>
	//    4    8:aload_1         
	//    5    9:invokeinterface #154 <Method Object Map.put(Object, Object)>
	//    6   14:checkcast       #119 <Class SettableBeanProperty>
	//    7   17:astore_2        
		if(settablebeanproperty1 != null && settablebeanproperty1 != settablebeanproperty)
	//*   8   18:aload_2         
	//*   9   19:ifnull          72
	//*  10   22:aload_2         
	//*  11   23:aload_1         
	//*  12   24:if_acmpeq       72
			throw new IllegalArgumentException((new StringBuilder()).append("Duplicate property '").append(settablebeanproperty.getName()).append("' for ").append(((Object) (_beanDesc.getType()))).toString());
	//   13   27:new             #156 <Class IllegalArgumentException>
	//   14   30:dup             
	//   15   31:new             #158 <Class StringBuilder>
	//   16   34:dup             
	//   17   35:invokespecial   #159 <Method void StringBuilder()>
	//   18   38:ldc1            #161 <String "Duplicate property '">
	//   19   40:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   20   43:aload_1         
	//   21   44:invokevirtual   #123 <Method String SettableBeanProperty.getName()>
	//   22   47:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   23   50:ldc1            #167 <String "' for ">
	//   24   52:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:aload_0         
	//   26   56:getfield        #44  <Field BeanDescription _beanDesc>
	//   27   59:invokevirtual   #173 <Method JavaType BeanDescription.getType()>
	//   28   62:invokevirtual   #176 <Method StringBuilder StringBuilder.append(Object)>
	//   29   65:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   30   68:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   31   71:athrow          
		else
			return;
	//   32   72:return          
	}

	public JsonDeserializer build()
	{
label0:
		{
			Object obj = ((Object) (_properties.values()));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map _properties>
	//    2    4:invokeinterface #187 <Method Collection Map.values()>
	//    3    9:astore_3        
			BeanPropertyMap beanpropertymap = BeanPropertyMap.construct(((Collection) (obj)), _caseInsensitivePropertyComparison);
	//    4   10:aload_3         
	//    5   11:aload_0         
	//    6   12:getfield        #63  <Field boolean _caseInsensitivePropertyComparison>
	//    7   15:invokestatic    #193 <Method BeanPropertyMap BeanPropertyMap.construct(Collection, boolean)>
	//    8   18:astore          4
			beanpropertymap.assignIndexes();
	//    9   20:aload           4
	//   10   22:invokevirtual   #197 <Method BeanPropertyMap BeanPropertyMap.assignIndexes()>
	//   11   25:pop             
			boolean flag;
			boolean flag1;
			if(!_defaultViewInclusion)
	//*  12   26:aload_0         
	//*  13   27:getfield        #58  <Field boolean _defaultViewInclusion>
	//*  14   30:ifne            133
				flag = true;
	//   15   33:iconst_1        
	//   16   34:istore_1        
			else
	//*  17   35:iload_1         
	//*  18   36:istore_2        
	//*  19   37:iload_1         
	//*  20   38:ifne            76
	//*  21   41:aload_3         
	//*  22   42:invokeinterface #203 <Method Iterator Collection.iterator()>
	//*  23   47:astore_3        
	//*  24   48:iload_1         
	//*  25   49:istore_2        
	//*  26   50:aload_3         
	//*  27   51:invokeinterface #209 <Method boolean Iterator.hasNext()>
	//*  28   56:ifeq            76
	//*  29   59:aload_3         
	//*  30   60:invokeinterface #213 <Method Object Iterator.next()>
	//*  31   65:checkcast       #119 <Class SettableBeanProperty>
	//*  32   68:invokevirtual   #216 <Method boolean SettableBeanProperty.hasViews()>
	//*  33   71:ifeq            48
	//*  34   74:iconst_1        
	//*  35   75:istore_2        
	//*  36   76:aload           4
	//*  37   78:astore_3        
	//*  38   79:aload_0         
	//*  39   80:getfield        #88  <Field ObjectIdReader _objectIdReader>
	//*  40   83:ifnull          106
	//*  41   86:aload           4
	//*  42   88:new             #218 <Class ObjectIdValueProperty>
	//*  43   91:dup             
	//*  44   92:aload_0         
	//*  45   93:getfield        #88  <Field ObjectIdReader _objectIdReader>
	//*  46   96:getstatic       #224 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//*  47   99:invokespecial   #227 <Method void ObjectIdValueProperty(ObjectIdReader, PropertyMetadata)>
	//*  48  102:invokevirtual   #231 <Method BeanPropertyMap BeanPropertyMap.withProperty(SettableBeanProperty)>
	//*  49  105:astore_3        
	//*  50  106:new             #233 <Class BeanDeserializer>
	//*  51  109:dup             
	//*  52  110:aload_0         
	//*  53  111:aload_0         
	//*  54  112:getfield        #44  <Field BeanDescription _beanDesc>
	//*  55  115:aload_3         
	//*  56  116:aload_0         
	//*  57  117:getfield        #79  <Field HashMap _backRefProperties>
	//*  58  120:aload_0         
	//*  59  121:getfield        #84  <Field HashSet _ignorableProps>
	//*  60  124:aload_0         
	//*  61  125:getfield        #92  <Field boolean _ignoreAllUnknown>
	//*  62  128:iload_2         
	//*  63  129:invokespecial   #236 <Method void BeanDeserializer(BeanDeserializerBuilder, BeanDescription, BeanPropertyMap, Map, HashSet, boolean, boolean)>
	//*  64  132:areturn         
				flag = false;
	//   65  133:iconst_0        
	//   66  134:istore_1        
			flag1 = flag;
			if(flag)
				break label0;
			obj = ((Object) (((Collection) (obj)).iterator()));
			do
			{
				flag1 = flag;
				if(!((Iterator) (obj)).hasNext())
					break label0;
			} while(!((SettableBeanProperty)((Iterator) (obj)).next()).hasViews());
			flag1 = true;
		}
		obj = ((Object) (beanpropertymap));
		if(_objectIdReader != null)
			obj = ((Object) (beanpropertymap.withProperty(((SettableBeanProperty) (new ObjectIdValueProperty(_objectIdReader, PropertyMetadata.STD_REQUIRED))))));
		return ((JsonDeserializer) (new BeanDeserializer(this, _beanDesc, ((BeanPropertyMap) (obj)), ((Map) (_backRefProperties)), _ignorableProps, _ignoreAllUnknown, flag1)));
	//*  67  135:goto            35
	}

	public AbstractDeserializer buildAbstract()
	{
		return new AbstractDeserializer(this, _beanDesc, ((Map) (_backRefProperties)));
	//    0    0:new             #241 <Class AbstractDeserializer>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #44  <Field BeanDescription _beanDesc>
	//    5    9:aload_0         
	//    6   10:getfield        #79  <Field HashMap _backRefProperties>
	//    7   13:invokespecial   #244 <Method void AbstractDeserializer(BeanDeserializerBuilder, BeanDescription, Map)>
	//    8   16:areturn         
	}

	public JsonDeserializer buildBuilderBased(JavaType javatype, String s)
	{
label0:
		{
			if(_buildMethod == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #94  <Field AnnotatedMethod _buildMethod>
	//*   2    4:ifnonnull       66
			{
				if(!s.isEmpty())
	//*   3    7:aload_2         
	//*   4    8:invokevirtual   #251 <Method boolean String.isEmpty()>
	//*   5   11:ifne            173
					throw new IllegalArgumentException((new StringBuilder()).append("Builder class ").append(_beanDesc.getBeanClass().getName()).append(" does not have build method (name: '").append(s).append("')").toString());
	//    6   14:new             #156 <Class IllegalArgumentException>
	//    7   17:dup             
	//    8   18:new             #158 <Class StringBuilder>
	//    9   21:dup             
	//   10   22:invokespecial   #159 <Method void StringBuilder()>
	//   11   25:ldc1            #253 <String "Builder class ">
	//   12   27:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   13   30:aload_0         
	//   14   31:getfield        #44  <Field BeanDescription _beanDesc>
	//   15   34:invokevirtual   #257 <Method Class BeanDescription.getBeanClass()>
	//   16   37:invokevirtual   #260 <Method String Class.getName()>
	//   17   40:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   18   43:ldc2            #262 <String " does not have build method (name: '">
	//   19   46:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   20   49:aload_2         
	//   21   50:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   22   53:ldc2            #264 <String "')">
	//   23   56:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   24   59:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   25   62:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   26   65:athrow          
			} else
			{
				s = ((String) (_buildMethod.getRawReturnType()));
	//   27   66:aload_0         
	//   28   67:getfield        #94  <Field AnnotatedMethod _buildMethod>
	//   29   70:invokevirtual   #269 <Method Class AnnotatedMethod.getRawReturnType()>
	//   30   73:astore_2        
				Class class1 = javatype.getRawClass();
	//   31   74:aload_1         
	//   32   75:invokevirtual   #274 <Method Class JavaType.getRawClass()>
	//   33   78:astore          5
				if(s != class1 && !((Class) (s)).isAssignableFrom(class1) && !class1.isAssignableFrom(((Class) (s))))
	//*  34   80:aload_2         
	//*  35   81:aload           5
	//*  36   83:if_acmpeq       173
	//*  37   86:aload_2         
	//*  38   87:aload           5
	//*  39   89:invokevirtual   #278 <Method boolean Class.isAssignableFrom(Class)>
	//*  40   92:ifne            173
	//*  41   95:aload           5
	//*  42   97:aload_2         
	//*  43   98:invokevirtual   #278 <Method boolean Class.isAssignableFrom(Class)>
	//*  44  101:ifne            173
					throw new IllegalArgumentException((new StringBuilder()).append("Build method '").append(_buildMethod.getFullName()).append(" has bad return type (").append(((Class) (s)).getName()).append("), not compatible with POJO type (").append(javatype.getRawClass().getName()).append(")").toString());
	//   45  104:new             #156 <Class IllegalArgumentException>
	//   46  107:dup             
	//   47  108:new             #158 <Class StringBuilder>
	//   48  111:dup             
	//   49  112:invokespecial   #159 <Method void StringBuilder()>
	//   50  115:ldc2            #280 <String "Build method '">
	//   51  118:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   52  121:aload_0         
	//   53  122:getfield        #94  <Field AnnotatedMethod _buildMethod>
	//   54  125:invokevirtual   #283 <Method String AnnotatedMethod.getFullName()>
	//   55  128:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   56  131:ldc2            #285 <String " has bad return type (">
	//   57  134:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   58  137:aload_2         
	//   59  138:invokevirtual   #260 <Method String Class.getName()>
	//   60  141:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   61  144:ldc2            #287 <String "), not compatible with POJO type (">
	//   62  147:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   63  150:aload_1         
	//   64  151:invokevirtual   #274 <Method Class JavaType.getRawClass()>
	//   65  154:invokevirtual   #260 <Method String Class.getName()>
	//   66  157:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   67  160:ldc2            #289 <String ")">
	//   68  163:invokevirtual   #165 <Method StringBuilder StringBuilder.append(String)>
	//   69  166:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   70  169:invokespecial   #181 <Method void IllegalArgumentException(String)>
	//   71  172:athrow          
			}
			javatype = ((JavaType) (_properties.values()));
	//   72  173:aload_0         
	//   73  174:getfield        #42  <Field Map _properties>
	//   74  177:invokeinterface #187 <Method Collection Map.values()>
	//   75  182:astore_1        
			s = ((String) (BeanPropertyMap.construct(((Collection) (javatype)), _caseInsensitivePropertyComparison)));
	//   76  183:aload_1         
	//   77  184:aload_0         
	//   78  185:getfield        #63  <Field boolean _caseInsensitivePropertyComparison>
	//   79  188:invokestatic    #193 <Method BeanPropertyMap BeanPropertyMap.construct(Collection, boolean)>
	//   80  191:astore_2        
			((BeanPropertyMap) (s)).assignIndexes();
	//   81  192:aload_2         
	//   82  193:invokevirtual   #197 <Method BeanPropertyMap BeanPropertyMap.assignIndexes()>
	//   83  196:pop             
			boolean flag;
			boolean flag1;
			if(!_defaultViewInclusion)
	//*  84  197:aload_0         
	//*  85  198:getfield        #58  <Field boolean _defaultViewInclusion>
	//*  86  201:ifne            306
				flag = true;
	//   87  204:iconst_1        
	//   88  205:istore_3        
			else
	//*  89  206:iload_3         
	//*  90  207:istore          4
	//*  91  209:iload_3         
	//*  92  210:ifne            250
	//*  93  213:aload_1         
	//*  94  214:invokeinterface #203 <Method Iterator Collection.iterator()>
	//*  95  219:astore_1        
	//*  96  220:iload_3         
	//*  97  221:istore          4
	//*  98  223:aload_1         
	//*  99  224:invokeinterface #209 <Method boolean Iterator.hasNext()>
	//* 100  229:ifeq            250
	//* 101  232:aload_1         
	//* 102  233:invokeinterface #213 <Method Object Iterator.next()>
	//* 103  238:checkcast       #119 <Class SettableBeanProperty>
	//* 104  241:invokevirtual   #216 <Method boolean SettableBeanProperty.hasViews()>
	//* 105  244:ifeq            220
	//* 106  247:iconst_1        
	//* 107  248:istore          4
	//* 108  250:aload_2         
	//* 109  251:astore_1        
	//* 110  252:aload_0         
	//* 111  253:getfield        #88  <Field ObjectIdReader _objectIdReader>
	//* 112  256:ifnull          278
	//* 113  259:aload_2         
	//* 114  260:new             #218 <Class ObjectIdValueProperty>
	//* 115  263:dup             
	//* 116  264:aload_0         
	//* 117  265:getfield        #88  <Field ObjectIdReader _objectIdReader>
	//* 118  268:getstatic       #224 <Field PropertyMetadata PropertyMetadata.STD_REQUIRED>
	//* 119  271:invokespecial   #227 <Method void ObjectIdValueProperty(ObjectIdReader, PropertyMetadata)>
	//* 120  274:invokevirtual   #231 <Method BeanPropertyMap BeanPropertyMap.withProperty(SettableBeanProperty)>
	//* 121  277:astore_1        
	//* 122  278:new             #291 <Class BuilderBasedDeserializer>
	//* 123  281:dup             
	//* 124  282:aload_0         
	//* 125  283:aload_0         
	//* 126  284:getfield        #44  <Field BeanDescription _beanDesc>
	//* 127  287:aload_1         
	//* 128  288:aload_0         
	//* 129  289:getfield        #79  <Field HashMap _backRefProperties>
	//* 130  292:aload_0         
	//* 131  293:getfield        #84  <Field HashSet _ignorableProps>
	//* 132  296:aload_0         
	//* 133  297:getfield        #92  <Field boolean _ignoreAllUnknown>
	//* 134  300:iload           4
	//* 135  302:invokespecial   #292 <Method void BuilderBasedDeserializer(BeanDeserializerBuilder, BeanDescription, BeanPropertyMap, Map, HashSet, boolean, boolean)>
	//* 136  305:areturn         
				flag = false;
	//  137  306:iconst_0        
	//  138  307:istore_3        
			flag1 = flag;
			if(flag)
				break label0;
			javatype = ((JavaType) (((Collection) (javatype)).iterator()));
			do
			{
				flag1 = flag;
				if(!((Iterator) (javatype)).hasNext())
					break label0;
			} while(!((SettableBeanProperty)((Iterator) (javatype)).next()).hasViews());
			flag1 = true;
		}
		javatype = ((JavaType) (s));
		if(_objectIdReader != null)
			javatype = ((JavaType) (((BeanPropertyMap) (s)).withProperty(((SettableBeanProperty) (new ObjectIdValueProperty(_objectIdReader, PropertyMetadata.STD_REQUIRED))))));
		return ((JsonDeserializer) (new BuilderBasedDeserializer(this, _beanDesc, ((BeanPropertyMap) (javatype)), ((Map) (_backRefProperties)), _ignorableProps, _ignoreAllUnknown, flag1)));
	//* 139  308:goto            206
	}

	public SettableBeanProperty findProperty(PropertyName propertyname)
	{
		return (SettableBeanProperty)_properties.get(((Object) (propertyname.getSimpleName())));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map _properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #300 <Method String PropertyName.getSimpleName()>
	//    4    8:invokeinterface #303 <Method Object Map.get(Object)>
	//    5   13:checkcast       #119 <Class SettableBeanProperty>
	//    6   16:areturn         
	}

	public SettableAnyProperty getAnySetter()
	{
		return _anySetter;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field SettableAnyProperty _anySetter>
	//    2    4:areturn         
	}

	public AnnotatedMethod getBuildMethod()
	{
		return _buildMethod;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field AnnotatedMethod _buildMethod>
	//    2    4:areturn         
	}

	public com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value getBuilderConfig()
	{
		return _builderConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value _builderConfig>
	//    2    4:areturn         
	}

	public List getInjectables()
	{
		return _injectables;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field List _injectables>
	//    2    4:areturn         
	}

	public ObjectIdReader getObjectIdReader()
	{
		return _objectIdReader;
	//    0    0:aload_0         
	//    1    1:getfield        #88  <Field ObjectIdReader _objectIdReader>
	//    2    4:areturn         
	}

	public Iterator getProperties()
	{
		return _properties.values().iterator();
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map _properties>
	//    2    4:invokeinterface #187 <Method Collection Map.values()>
	//    3    9:invokeinterface #203 <Method Iterator Collection.iterator()>
	//    4   14:areturn         
	}

	public ValueInstantiator getValueInstantiator()
	{
		return _valueInstantiator;
	//    0    0:aload_0         
	//    1    1:getfield        #86  <Field ValueInstantiator _valueInstantiator>
	//    2    4:areturn         
	}

	public boolean hasProperty(PropertyName propertyname)
	{
		return findProperty(propertyname) != null;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #322 <Method SettableBeanProperty findProperty(PropertyName)>
	//    3    5:ifnull          10
	//    4    8:iconst_1        
	//    5    9:ireturn         
	//    6   10:iconst_0        
	//    7   11:ireturn         
	}

	public SettableBeanProperty removeProperty(PropertyName propertyname)
	{
		return (SettableBeanProperty)_properties.remove(((Object) (propertyname.getSimpleName())));
	//    0    0:aload_0         
	//    1    1:getfield        #42  <Field Map _properties>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #300 <Method String PropertyName.getSimpleName()>
	//    4    8:invokeinterface #127 <Method Object Map.remove(Object)>
	//    5   13:checkcast       #119 <Class SettableBeanProperty>
	//    6   16:areturn         
	}

	public void setAnySetter(SettableAnyProperty settableanyproperty)
	{
		if(_anySetter != null && settableanyproperty != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #90  <Field SettableAnyProperty _anySetter>
	//*   2    4:ifnull          22
	//*   3    7:aload_1         
	//*   4    8:ifnull          22
		{
			throw new IllegalStateException("_anySetter already set to non-null");
	//    5   11:new             #327 <Class IllegalStateException>
	//    6   14:dup             
	//    7   15:ldc2            #329 <String "_anySetter already set to non-null">
	//    8   18:invokespecial   #330 <Method void IllegalStateException(String)>
	//    9   21:athrow          
		} else
		{
			_anySetter = settableanyproperty;
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:putfield        #90  <Field SettableAnyProperty _anySetter>
			return;
	//   13   27:return          
		}
	}

	public void setIgnoreUnknownProperties(boolean flag)
	{
		_ignoreAllUnknown = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #92  <Field boolean _ignoreAllUnknown>
	//    3    5:return          
	}

	public void setObjectIdReader(ObjectIdReader objectidreader)
	{
		_objectIdReader = objectidreader;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #88  <Field ObjectIdReader _objectIdReader>
	//    3    5:return          
	}

	public void setPOJOBuilder(AnnotatedMethod annotatedmethod, com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value)
	{
		_buildMethod = annotatedmethod;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #94  <Field AnnotatedMethod _buildMethod>
		_builderConfig = value;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #96  <Field com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder$Value _builderConfig>
	//    6   10:return          
	}

	public void setValueInstantiator(ValueInstantiator valueinstantiator)
	{
		_valueInstantiator = valueinstantiator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #86  <Field ValueInstantiator _valueInstantiator>
	//    3    5:return          
	}

	protected SettableAnyProperty _anySetter;
	protected HashMap _backRefProperties;
	protected final BeanDescription _beanDesc;
	protected AnnotatedMethod _buildMethod;
	protected com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value _builderConfig;
	protected final boolean _caseInsensitivePropertyComparison;
	protected final boolean _defaultViewInclusion;
	protected HashSet _ignorableProps;
	protected boolean _ignoreAllUnknown;
	protected List _injectables;
	protected ObjectIdReader _objectIdReader;
	protected final Map _properties;
	protected ValueInstantiator _valueInstantiator;
}
