// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.reflect.Modifier;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			AnnotatedParameter, POJOPropertyBuilder, AnnotatedClass, AnnotatedConstructor, 
//			AnnotatedMethod, AnnotatedField, VisibilityChecker, AnnotatedMember, 
//			ObjectIdInfo

public class POJOPropertiesCollector
{

	protected POJOPropertiesCollector(MapperConfig mapperconfig, boolean flag, JavaType javatype, AnnotatedClass annotatedclass, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
		_config = mapperconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #45  <Field MapperConfig _config>
		_stdBeanNaming = mapperconfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #51  <Field MapperFeature MapperFeature.USE_STD_BEAN_NAMING>
	//    8   14:invokevirtual   #57  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//    9   17:putfield        #59  <Field boolean _stdBeanNaming>
		_forSerialization = flag;
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:putfield        #61  <Field boolean _forSerialization>
		_type = javatype;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #63  <Field JavaType _type>
		_classDef = annotatedclass;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #65  <Field AnnotatedClass _classDef>
		javatype = ((JavaType) (s));
	//   19   36:aload           5
	//   20   38:astore_3        
		if(s == null)
	//*  21   39:aload           5
	//*  22   41:ifnonnull       47
			javatype = "set";
	//   23   44:ldc1            #67  <String "set">
	//   24   46:astore_3        
		_mutatorPrefix = ((String) (javatype));
	//   25   47:aload_0         
	//   26   48:aload_3         
	//   27   49:putfield        #69  <Field String _mutatorPrefix>
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #73  <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*  30   56:ifeq            91
			mapperconfig = ((MapperConfig) (_config.getAnnotationIntrospector()));
	//   31   59:aload_0         
	//   32   60:getfield        #45  <Field MapperConfig _config>
	//   33   63:invokevirtual   #77  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   34   66:astore_1        
		else
	//*  35   67:aload_0         
	//*  36   68:aload_1         
	//*  37   69:putfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//*  38   72:aload_0         
	//*  39   73:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//*  40   76:ifnonnull       96
	//*  41   79:aload_0         
	//*  42   80:aload_0         
	//*  43   81:getfield        #45  <Field MapperConfig _config>
	//*  44   84:invokevirtual   #83  <Method VisibilityChecker MapperConfig.getDefaultVisibilityChecker()>
	//*  45   87:putfield        #85  <Field VisibilityChecker _visibilityChecker>
	//*  46   90:return          
			mapperconfig = null;
	//   47   91:aconst_null     
	//   48   92:astore_1        
		_annotationIntrospector = ((AnnotationIntrospector) (mapperconfig));
		if(_annotationIntrospector == null)
		{
			_visibilityChecker = _config.getDefaultVisibilityChecker();
			return;
		} else
	//*  49   93:goto            67
		{
			_visibilityChecker = _annotationIntrospector.findAutoDetectVisibility(annotatedclass, _config.getDefaultVisibilityChecker());
	//   50   96:aload_0         
	//   51   97:aload_0         
	//   52   98:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//   53  101:aload           4
	//   54  103:aload_0         
	//   55  104:getfield        #45  <Field MapperConfig _config>
	//   56  107:invokevirtual   #83  <Method VisibilityChecker MapperConfig.getDefaultVisibilityChecker()>
	//   57  110:invokevirtual   #91  <Method VisibilityChecker AnnotationIntrospector.findAutoDetectVisibility(AnnotatedClass, VisibilityChecker)>
	//   58  113:putfield        #85  <Field VisibilityChecker _visibilityChecker>
			return;
	//   59  116:return          
		}
	}

	private void _collectIgnorals(String s)
	{
		if(!_forSerialization)
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field boolean _forSerialization>
	//*   2    4:ifne            34
		{
			if(_ignoredPropertyNames == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #98  <Field HashSet _ignoredPropertyNames>
	//*   5   11:ifnonnull       25
				_ignoredPropertyNames = new HashSet();
	//    6   14:aload_0         
	//    7   15:new             #100 <Class HashSet>
	//    8   18:dup             
	//    9   19:invokespecial   #101 <Method void HashSet()>
	//   10   22:putfield        #98  <Field HashSet _ignoredPropertyNames>
			_ignoredPropertyNames.add(((Object) (s)));
	//   11   25:aload_0         
	//   12   26:getfield        #98  <Field HashSet _ignoredPropertyNames>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #105 <Method boolean HashSet.add(Object)>
	//   15   33:pop             
		}
	//   16   34:return          
	}

	private PropertyNamingStrategy _findNamingStrategy()
	{
		Object obj;
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       21
			obj = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		else
	//*   5    9:aload_1         
	//*   6   10:ifnonnull       36
	//*   7   13:aload_0         
	//*   8   14:getfield        #45  <Field MapperConfig _config>
	//*   9   17:invokevirtual   #110 <Method PropertyNamingStrategy MapperConfig.getPropertyNamingStrategy()>
	//*  10   20:areturn         
			obj = _annotationIntrospector.findNamingStrategy(_classDef);
	//   11   21:aload_0         
	//   12   22:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//   13   25:aload_0         
	//   14   26:getfield        #65  <Field AnnotatedClass _classDef>
	//   15   29:invokevirtual   #114 <Method Object AnnotationIntrospector.findNamingStrategy(AnnotatedClass)>
	//   16   32:astore_1        
		if(obj == null)
			return _config.getPropertyNamingStrategy();
	//*  17   33:goto            9
		if(obj instanceof PropertyNamingStrategy)
	//*  18   36:aload_1         
	//*  19   37:instanceof      #116 <Class PropertyNamingStrategy>
	//*  20   40:ifeq            48
			return (PropertyNamingStrategy)obj;
	//   21   43:aload_1         
	//   22   44:checkcast       #116 <Class PropertyNamingStrategy>
	//   23   47:areturn         
		if(!(obj instanceof Class))
	//*  24   48:aload_1         
	//*  25   49:instanceof      #118 <Class Class>
	//*  26   52:ifne            93
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned PropertyNamingStrategy definition of type ").append(obj.getClass().getName()).append("; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead").toString());
	//   27   55:new             #120 <Class IllegalStateException>
	//   28   58:dup             
	//   29   59:new             #122 <Class StringBuilder>
	//   30   62:dup             
	//   31   63:invokespecial   #123 <Method void StringBuilder()>
	//   32   66:ldc1            #125 <String "AnnotationIntrospector returned PropertyNamingStrategy definition of type ">
	//   33   68:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   34   71:aload_1         
	//   35   72:invokevirtual   #133 <Method Class Object.getClass()>
	//   36   75:invokevirtual   #137 <Method String Class.getName()>
	//   37   78:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   38   81:ldc1            #139 <String "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead">
	//   39   83:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   40   86:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   41   89:invokespecial   #144 <Method void IllegalStateException(String)>
	//   42   92:athrow          
		obj = ((Object) ((Class)obj));
	//   43   93:aload_1         
	//   44   94:checkcast       #118 <Class Class>
	//   45   97:astore_1        
		if(obj == com/fasterxml/jackson/databind/PropertyNamingStrategy)
	//*  46   98:aload_1         
	//*  47   99:ldc1            #116 <Class PropertyNamingStrategy>
	//*  48  101:if_acmpne       106
			return null;
	//   49  104:aconst_null     
	//   50  105:areturn         
		if(!((Class) (com/fasterxml/jackson/databind/PropertyNamingStrategy)).isAssignableFrom(((Class) (obj))))
	//*  51  106:ldc1            #116 <Class PropertyNamingStrategy>
	//*  52  108:aload_1         
	//*  53  109:invokevirtual   #148 <Method boolean Class.isAssignableFrom(Class)>
	//*  54  112:ifne            150
			throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector returned Class ").append(((Class) (obj)).getName()).append("; expected Class<PropertyNamingStrategy>").toString());
	//   55  115:new             #120 <Class IllegalStateException>
	//   56  118:dup             
	//   57  119:new             #122 <Class StringBuilder>
	//   58  122:dup             
	//   59  123:invokespecial   #123 <Method void StringBuilder()>
	//   60  126:ldc1            #150 <String "AnnotationIntrospector returned Class ">
	//   61  128:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   62  131:aload_1         
	//   63  132:invokevirtual   #137 <Method String Class.getName()>
	//   64  135:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   65  138:ldc1            #152 <String "; expected Class<PropertyNamingStrategy>">
	//   66  140:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   67  143:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   68  146:invokespecial   #144 <Method void IllegalStateException(String)>
	//   69  149:athrow          
		Object obj1 = ((Object) (_config.getHandlerInstantiator()));
	//   70  150:aload_0         
	//   71  151:getfield        #45  <Field MapperConfig _config>
	//   72  154:invokevirtual   #156 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//   73  157:astore_2        
		if(obj1 != null)
	//*  74  158:aload_2         
	//*  75  159:ifnull          182
		{
			obj1 = ((Object) (((HandlerInstantiator) (obj1)).namingStrategyInstance(_config, ((Annotated) (_classDef)), ((Class) (obj)))));
	//   76  162:aload_2         
	//   77  163:aload_0         
	//   78  164:getfield        #45  <Field MapperConfig _config>
	//   79  167:aload_0         
	//   80  168:getfield        #65  <Field AnnotatedClass _classDef>
	//   81  171:aload_1         
	//   82  172:invokevirtual   #162 <Method PropertyNamingStrategy HandlerInstantiator.namingStrategyInstance(MapperConfig, Annotated, Class)>
	//   83  175:astore_2        
			if(obj1 != null)
	//*  84  176:aload_2         
	//*  85  177:ifnull          182
				return ((PropertyNamingStrategy) (obj1));
	//   86  180:aload_2         
	//   87  181:areturn         
		}
		return (PropertyNamingStrategy)ClassUtil.createInstance(((Class) (obj)), _config.canOverrideAccessModifiers());
	//   88  182:aload_1         
	//   89  183:aload_0         
	//   90  184:getfield        #45  <Field MapperConfig _config>
	//   91  187:invokevirtual   #165 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   92  190:invokestatic    #171 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   93  193:checkcast       #116 <Class PropertyNamingStrategy>
	//   94  196:areturn         
	}

	private PropertyName _propNameFromSimple(String s)
	{
		return PropertyName.construct(s, ((String) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #179 <Method PropertyName PropertyName.construct(String, String)>
	//    3    5:areturn         
	}

	protected void _addCreatorParam(Map map, AnnotatedParameter annotatedparameter)
	{
		Object obj = ((Object) (_annotationIntrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedparameter)))));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #185 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//    4    8:astore          5
		String s = ((String) (obj));
	//    5   10:aload           5
	//    6   12:astore          4
		if(obj == null)
	//*   7   14:aload           5
	//*   8   16:ifnonnull       23
			s = "";
	//    9   19:ldc1            #187 <String "">
	//   10   21:astore          4
		obj = ((Object) (_annotationIntrospector.findNameForDeserialization(((Annotated) (annotatedparameter)))));
	//   11   23:aload_0         
	//   12   24:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #191 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   15   31:astore          5
		boolean flag;
		if(obj != null && !((PropertyName) (obj)).isEmpty())
	//*  16   33:aload           5
	//*  17   35:ifnull          61
	//*  18   38:aload           5
	//*  19   40:invokevirtual   #194 <Method boolean PropertyName.isEmpty()>
	//*  20   43:ifne            61
			flag = true;
	//   21   46:iconst_1        
	//   22   47:istore_3        
		else
	//*  23   48:iload_3         
	//*  24   49:ifne            87
	//*  25   52:aload           4
	//*  26   54:invokevirtual   #197 <Method boolean String.isEmpty()>
	//*  27   57:ifeq            66
	//*  28   60:return          
			flag = false;
	//   29   61:iconst_0        
	//   30   62:istore_3        
		if(!flag)
		{
			while(s.isEmpty() || !_annotationIntrospector.hasCreatorAnnotation(((Annotated) (annotatedparameter.getOwner())))) 
				return;
	//   31   63:goto            48
	//   32   66:aload_0         
	//   33   67:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//   34   70:aload_2         
	//   35   71:invokevirtual   #203 <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
	//   36   74:invokevirtual   #207 <Method boolean AnnotationIntrospector.hasCreatorAnnotation(Annotated)>
	//   37   77:ifeq            60
			obj = ((Object) (PropertyName.construct(s)));
	//   38   80:aload           4
	//   39   82:invokestatic    #209 <Method PropertyName PropertyName.construct(String)>
	//   40   85:astore          5
		}
		if(flag && s.isEmpty())
	//*  41   87:iload_3         
	//*  42   88:ifeq            127
	//*  43   91:aload           4
	//*  44   93:invokevirtual   #197 <Method boolean String.isEmpty()>
	//*  45   96:ifeq            127
			map = ((Map) (_property(map, ((PropertyName) (obj)))));
	//   46   99:aload_0         
	//   47  100:aload_1         
	//   48  101:aload           5
	//   49  103:invokevirtual   #213 <Method POJOPropertyBuilder _property(Map, PropertyName)>
	//   50  106:astore_1        
		else
	//*  51  107:aload_1         
	//*  52  108:aload_2         
	//*  53  109:aload           5
	//*  54  111:iload_3         
	//*  55  112:iconst_1        
	//*  56  113:iconst_0        
	//*  57  114:invokevirtual   #219 <Method void POJOPropertyBuilder.addCtor(AnnotatedParameter, PropertyName, boolean, boolean, boolean)>
	//*  58  117:aload_0         
	//*  59  118:getfield        #221 <Field LinkedList _creatorProperties>
	//*  60  121:aload_1         
	//*  61  122:invokevirtual   #224 <Method boolean LinkedList.add(Object)>
	//*  62  125:pop             
	//*  63  126:return          
			map = ((Map) (_property(map, s)));
	//   64  127:aload_0         
	//   65  128:aload_1         
	//   66  129:aload           4
	//   67  131:invokevirtual   #227 <Method POJOPropertyBuilder _property(Map, String)>
	//   68  134:astore_1        
		((POJOPropertyBuilder) (map)).addCtor(annotatedparameter, ((PropertyName) (obj)), flag, true, false);
		_creatorProperties.add(((Object) (map)));
	//*  69  135:goto            107
	}

	protected void _addCreators(Map map)
	{
		if(_annotationIntrospector != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnull          177
		{
			for(Iterator iterator = _classDef.getConstructors().iterator(); iterator.hasNext();)
	//*   3    7:aload_0         
	//*   4    8:getfield        #65  <Field AnnotatedClass _classDef>
	//*   5   11:invokevirtual   #236 <Method List AnnotatedClass.getConstructors()>
	//*   6   14:invokeinterface #242 <Method Iterator List.iterator()>
	//*   7   19:astore          4
	//*   8   21:aload           4
	//*   9   23:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//*  10   28:ifeq            92
			{
				AnnotatedConstructor annotatedconstructor = (AnnotatedConstructor)iterator.next();
	//   11   31:aload           4
	//   12   33:invokeinterface #251 <Method Object Iterator.next()>
	//   13   38:checkcast       #253 <Class AnnotatedConstructor>
	//   14   41:astore          5
				if(_creatorProperties == null)
	//*  15   43:aload_0         
	//*  16   44:getfield        #221 <Field LinkedList _creatorProperties>
	//*  17   47:ifnonnull       61
					_creatorProperties = new LinkedList();
	//   18   50:aload_0         
	//   19   51:new             #223 <Class LinkedList>
	//   20   54:dup             
	//   21   55:invokespecial   #254 <Method void LinkedList()>
	//   22   58:putfield        #221 <Field LinkedList _creatorProperties>
				int i = 0;
	//   23   61:iconst_0        
	//   24   62:istore_2        
				int k = annotatedconstructor.getParameterCount();
	//   25   63:aload           5
	//   26   65:invokevirtual   #258 <Method int AnnotatedConstructor.getParameterCount()>
	//   27   68:istore_3        
				while(i < k) 
	//*  28   69:iload_2         
	//*  29   70:iload_3         
	//*  30   71:icmpge          21
				{
					_addCreatorParam(map, annotatedconstructor.getParameter(i));
	//   31   74:aload_0         
	//   32   75:aload_1         
	//   33   76:aload           5
	//   34   78:iload_2         
	//   35   79:invokevirtual   #262 <Method AnnotatedParameter AnnotatedConstructor.getParameter(int)>
	//   36   82:invokevirtual   #264 <Method void _addCreatorParam(Map, AnnotatedParameter)>
					i++;
	//   37   85:iload_2         
	//   38   86:iconst_1        
	//   39   87:iadd            
	//   40   88:istore_2        
				}
			}

	//*  41   89:goto            69
			for(Iterator iterator1 = _classDef.getStaticMethods().iterator(); iterator1.hasNext();)
	//*  42   92:aload_0         
	//*  43   93:getfield        #65  <Field AnnotatedClass _classDef>
	//*  44   96:invokevirtual   #267 <Method List AnnotatedClass.getStaticMethods()>
	//*  45   99:invokeinterface #242 <Method Iterator List.iterator()>
	//*  46  104:astore          4
	//*  47  106:aload           4
	//*  48  108:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//*  49  113:ifeq            177
			{
				AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator1.next();
	//   50  116:aload           4
	//   51  118:invokeinterface #251 <Method Object Iterator.next()>
	//   52  123:checkcast       #269 <Class AnnotatedMethod>
	//   53  126:astore          5
				if(_creatorProperties == null)
	//*  54  128:aload_0         
	//*  55  129:getfield        #221 <Field LinkedList _creatorProperties>
	//*  56  132:ifnonnull       146
					_creatorProperties = new LinkedList();
	//   57  135:aload_0         
	//   58  136:new             #223 <Class LinkedList>
	//   59  139:dup             
	//   60  140:invokespecial   #254 <Method void LinkedList()>
	//   61  143:putfield        #221 <Field LinkedList _creatorProperties>
				int j = 0;
	//   62  146:iconst_0        
	//   63  147:istore_2        
				int l = annotatedmethod.getParameterCount();
	//   64  148:aload           5
	//   65  150:invokevirtual   #270 <Method int AnnotatedMethod.getParameterCount()>
	//   66  153:istore_3        
				while(j < l) 
	//*  67  154:iload_2         
	//*  68  155:iload_3         
	//*  69  156:icmpge          106
				{
					_addCreatorParam(map, annotatedmethod.getParameter(j));
	//   70  159:aload_0         
	//   71  160:aload_1         
	//   72  161:aload           5
	//   73  163:iload_2         
	//   74  164:invokevirtual   #271 <Method AnnotatedParameter AnnotatedMethod.getParameter(int)>
	//   75  167:invokevirtual   #264 <Method void _addCreatorParam(Map, AnnotatedParameter)>
					j++;
	//   76  170:iload_2         
	//   77  171:iconst_1        
	//   78  172:iadd            
	//   79  173:istore_2        
				}
			}

		}
	//*  80  174:goto            154
	//   81  177:return          
	}

	protected void _addFields(Map map)
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore          12
		boolean flag;
		boolean flag6;
		Iterator iterator;
		if(!_forSerialization && !_config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS))
	//*   3    6:aload_0         
	//*   4    7:getfield        #61  <Field boolean _forSerialization>
	//*   5   10:ifne            278
	//*   6   13:aload_0         
	//*   7   14:getfield        #45  <Field MapperConfig _config>
	//*   8   17:getstatic       #276 <Field MapperFeature MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS>
	//*   9   20:invokevirtual   #57  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//*  10   23:ifne            278
			flag = true;
	//   11   26:iconst_1        
	//   12   27:istore_2        
		else
	//*  13   28:aload_0         
	//*  14   29:getfield        #45  <Field MapperConfig _config>
	//*  15   32:getstatic       #279 <Field MapperFeature MapperFeature.PROPAGATE_TRANSIENT_MARKER>
	//*  16   35:invokevirtual   #57  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//*  17   38:istore          8
	//*  18   40:aload_0         
	//*  19   41:getfield        #65  <Field AnnotatedClass _classDef>
	//*  20   44:invokevirtual   #283 <Method Iterable AnnotatedClass.fields()>
	//*  21   47:invokeinterface #286 <Method Iterator Iterable.iterator()>
	//*  22   52:astore          13
	//*  23   54:aload           13
	//*  24   56:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//*  25   61:ifeq            343
	//*  26   64:aload           13
	//*  27   66:invokeinterface #251 <Method Object Iterator.next()>
	//*  28   71:checkcast       #288 <Class AnnotatedField>
	//*  29   74:astore          14
	//*  30   76:aload           12
	//*  31   78:ifnonnull       283
	//*  32   81:aconst_null     
	//*  33   82:astore          9
	//*  34   84:aload           9
	//*  35   86:astore          10
	//*  36   88:aload           9
	//*  37   90:ifnonnull       100
	//*  38   93:aload           14
	//*  39   95:invokevirtual   #289 <Method String AnnotatedField.getName()>
	//*  40   98:astore          10
	//*  41  100:aload           12
	//*  42  102:ifnonnull       295
	//*  43  105:aconst_null     
	//*  44  106:astore          9
	//*  45  108:aload           9
	//*  46  110:ifnull          326
	//*  47  113:iconst_1        
	//*  48  114:istore_3        
	//*  49  115:aload           9
	//*  50  117:astore          11
	//*  51  119:iload_3         
	//*  52  120:istore          5
	//*  53  122:iload_3         
	//*  54  123:ifeq            152
	//*  55  126:aload           9
	//*  56  128:astore          11
	//*  57  130:iload_3         
	//*  58  131:istore          5
	//*  59  133:aload           9
	//*  60  135:invokevirtual   #194 <Method boolean PropertyName.isEmpty()>
	//*  61  138:ifeq            152
	//*  62  141:aload_0         
	//*  63  142:aload           10
	//*  64  144:invokespecial   #291 <Method PropertyName _propNameFromSimple(String)>
	//*  65  147:astore          11
	//*  66  149:iconst_0        
	//*  67  150:istore          5
	//*  68  152:aload           11
	//*  69  154:ifnull          331
	//*  70  157:iconst_1        
	//*  71  158:istore          4
	//*  72  160:iload           4
	//*  73  162:istore_3        
	//*  74  163:iload           4
	//*  75  165:ifne            180
	//*  76  168:aload_0         
	//*  77  169:getfield        #85  <Field VisibilityChecker _visibilityChecker>
	//*  78  172:aload           14
	//*  79  174:invokeinterface #297 <Method boolean VisibilityChecker.isFieldVisible(AnnotatedField)>
	//*  80  179:istore_3        
	//*  81  180:aload           12
	//*  82  182:ifnull          337
	//*  83  185:aload           12
	//*  84  187:aload           14
	//*  85  189:invokevirtual   #301 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//*  86  192:ifeq            337
	//*  87  195:iconst_1        
	//*  88  196:istore          4
	//*  89  198:iload           4
	//*  90  200:istore          6
	//*  91  202:aload           14
	//*  92  204:invokevirtual   #304 <Method boolean AnnotatedField.isTransient()>
	//*  93  207:ifeq            231
	//*  94  210:iconst_0        
	//*  95  211:istore          7
	//*  96  213:iload           7
	//*  97  215:istore_3        
	//*  98  216:iload           4
	//*  99  218:istore          6
	//* 100  220:iload           8
	//* 101  222:ifeq            231
	//* 102  225:iconst_1        
	//* 103  226:istore          6
	//* 104  228:iload           7
	//* 105  230:istore_3        
	//* 106  231:iload_2         
	//* 107  232:ifeq            256
	//* 108  235:aload           11
	//* 109  237:ifnonnull       256
	//* 110  240:iload           6
	//* 111  242:ifne            256
	//* 112  245:aload           14
	//* 113  247:invokevirtual   #307 <Method int AnnotatedField.getModifiers()>
	//* 114  250:invokestatic    #313 <Method boolean Modifier.isFinal(int)>
	//* 115  253:ifne            54
	//* 116  256:aload_0         
	//* 117  257:aload_1         
	//* 118  258:aload           10
	//* 119  260:invokevirtual   #227 <Method POJOPropertyBuilder _property(Map, String)>
	//* 120  263:aload           14
	//* 121  265:aload           11
	//* 122  267:iload           5
	//* 123  269:iload_3         
	//* 124  270:iload           6
	//* 125  272:invokevirtual   #317 <Method void POJOPropertyBuilder.addField(AnnotatedField, PropertyName, boolean, boolean, boolean)>
	//* 126  275:goto            54
			flag = false;
	//  127  278:iconst_0        
	//  128  279:istore_2        
		flag6 = _config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
		iterator = _classDef.fields().iterator();
		do
			if(iterator.hasNext())
			{
				AnnotatedField annotatedfield = (AnnotatedField)iterator.next();
				boolean flag1;
				boolean flag2;
				boolean flag3;
				boolean flag4;
				Object obj;
				String s;
				Object obj1;
				if(annotationintrospector == null)
					obj = null;
				else
	//* 129  280:goto            28
					obj = ((Object) (annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedfield)))));
	//  130  283:aload           12
	//  131  285:aload           14
	//  132  287:invokevirtual   #185 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//  133  290:astore          9
				s = ((String) (obj));
				if(obj == null)
					s = annotatedfield.getName();
				if(annotationintrospector == null)
					obj = null;
				else
	//* 134  292:goto            84
				if(_forSerialization)
	//* 135  295:aload_0         
	//* 136  296:getfield        #61  <Field boolean _forSerialization>
	//* 137  299:ifeq            314
					obj = ((Object) (annotationintrospector.findNameForSerialization(((Annotated) (annotatedfield)))));
	//  138  302:aload           12
	//  139  304:aload           14
	//  140  306:invokevirtual   #320 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//  141  309:astore          9
				else
	//* 142  311:goto            108
					obj = ((Object) (annotationintrospector.findNameForDeserialization(((Annotated) (annotatedfield)))));
	//  143  314:aload           12
	//  144  316:aload           14
	//  145  318:invokevirtual   #191 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//  146  321:astore          9
				if(obj != null)
					flag1 = true;
				else
	//* 147  323:goto            108
					flag1 = false;
	//  148  326:iconst_0        
	//  149  327:istore_3        
				obj1 = obj;
				flag3 = flag1;
				if(flag1)
				{
					obj1 = obj;
					flag3 = flag1;
					if(((PropertyName) (obj)).isEmpty())
					{
						obj1 = ((Object) (_propNameFromSimple(s)));
						flag3 = false;
					}
				}
				if(obj1 != null)
					flag2 = true;
				else
	//* 150  328:goto            115
					flag2 = false;
	//  151  331:iconst_0        
	//  152  332:istore          4
				flag1 = flag2;
				if(!flag2)
					flag1 = _visibilityChecker.isFieldVisible(annotatedfield);
				if(annotationintrospector != null && annotationintrospector.hasIgnoreMarker(((AnnotatedMember) (annotatedfield))))
					flag2 = true;
				else
	//* 153  334:goto            160
					flag2 = false;
	//  154  337:iconst_0        
	//  155  338:istore          4
				flag4 = flag2;
				if(annotatedfield.isTransient())
				{
					boolean flag5 = false;
					flag1 = flag5;
					flag4 = flag2;
					if(flag6)
					{
						flag4 = true;
						flag1 = flag5;
					}
				}
				if(!flag || obj1 != null || flag4 || !Modifier.isFinal(annotatedfield.getModifiers()))
					_property(map, s).addField(annotatedfield, ((PropertyName) (obj1)), flag3, flag1, flag4);
			} else
	//* 156  340:goto            198
			{
				return;
	//  157  343:return          
			}
		while(true);
	}

	protected void _addGetterMethod(Map map, AnnotatedMethod annotatedmethod, AnnotationIntrospector annotationintrospector)
	{
		boolean flag2;
		String s;
		Object obj;
		flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		s = null;
	//    2    3:aconst_null     
	//    3    4:astore          8
		obj = null;
	//    4    6:aconst_null     
	//    5    7:astore          9
		if(annotatedmethod.hasReturnType()) goto _L2; else goto _L1
	//    6    9:aload_2         
	//    7   10:invokevirtual   #325 <Method boolean AnnotatedMethod.hasReturnType()>
	//    8   13:ifne            17
_L1:
		return;
	//    9   16:return          
_L2:
		boolean flag;
		boolean flag1;
		PropertyName propertyname;
		if(annotationintrospector != null)
	//*  10   17:aload_3         
	//*  11   18:ifnull          93
		{
			if(annotationintrospector.hasAnyGetterAnnotation(annotatedmethod))
	//*  12   21:aload_3         
	//*  13   22:aload_2         
	//*  14   23:invokevirtual   #329 <Method boolean AnnotationIntrospector.hasAnyGetterAnnotation(AnnotatedMethod)>
	//*  15   26:ifeq            57
			{
				if(_anyGetters == null)
	//*  16   29:aload_0         
	//*  17   30:getfield        #331 <Field LinkedList _anyGetters>
	//*  18   33:ifnonnull       47
					_anyGetters = new LinkedList();
	//   19   36:aload_0         
	//   20   37:new             #223 <Class LinkedList>
	//   21   40:dup             
	//   22   41:invokespecial   #254 <Method void LinkedList()>
	//   23   44:putfield        #331 <Field LinkedList _anyGetters>
				_anyGetters.add(((Object) (annotatedmethod)));
	//   24   47:aload_0         
	//   25   48:getfield        #331 <Field LinkedList _anyGetters>
	//   26   51:aload_2         
	//   27   52:invokevirtual   #224 <Method boolean LinkedList.add(Object)>
	//   28   55:pop             
				return;
	//   29   56:return          
			}
			if(annotationintrospector.hasAsValueAnnotation(annotatedmethod))
	//*  30   57:aload_3         
	//*  31   58:aload_2         
	//*  32   59:invokevirtual   #334 <Method boolean AnnotationIntrospector.hasAsValueAnnotation(AnnotatedMethod)>
	//*  33   62:ifeq            93
			{
				if(_jsonValueGetters == null)
	//*  34   65:aload_0         
	//*  35   66:getfield        #336 <Field LinkedList _jsonValueGetters>
	//*  36   69:ifnonnull       83
					_jsonValueGetters = new LinkedList();
	//   37   72:aload_0         
	//   38   73:new             #223 <Class LinkedList>
	//   39   76:dup             
	//   40   77:invokespecial   #254 <Method void LinkedList()>
	//   41   80:putfield        #336 <Field LinkedList _jsonValueGetters>
				_jsonValueGetters.add(((Object) (annotatedmethod)));
	//   42   83:aload_0         
	//   43   84:getfield        #336 <Field LinkedList _jsonValueGetters>
	//   44   87:aload_2         
	//   45   88:invokevirtual   #224 <Method boolean LinkedList.add(Object)>
	//   46   91:pop             
				return;
	//   47   92:return          
			}
		}
		if(annotationintrospector == null)
	//*  48   93:aload_3         
	//*  49   94:ifnonnull       200
			propertyname = null;
	//   50   97:aconst_null     
	//   51   98:astore          7
		else
	//*  52  100:aload           7
	//*  53  102:ifnull          210
	//*  54  105:iconst_1        
	//*  55  106:istore          4
	//*  56  108:iload           4
	//*  57  110:ifne            241
	//*  58  113:aload_3         
	//*  59  114:ifnonnull       216
	//*  60  117:aload           9
	//*  61  119:astore          8
	//*  62  121:aload           9
	//*  63  123:ifnonnull       140
	//*  64  126:aload_2         
	//*  65  127:aload_2         
	//*  66  128:invokevirtual   #337 <Method String AnnotatedMethod.getName()>
	//*  67  131:aload_0         
	//*  68  132:getfield        #59  <Field boolean _stdBeanNaming>
	//*  69  135:invokestatic    #343 <Method String BeanUtil.okNameForRegularGetter(AnnotatedMethod, String, boolean)>
	//*  70  138:astore          8
	//*  71  140:aload           8
	//*  72  142:ifnonnull       226
	//*  73  145:aload_2         
	//*  74  146:aload_2         
	//*  75  147:invokevirtual   #337 <Method String AnnotatedMethod.getName()>
	//*  76  150:aload_0         
	//*  77  151:getfield        #59  <Field boolean _stdBeanNaming>
	//*  78  154:invokestatic    #346 <Method String BeanUtil.okNameForIsGetter(AnnotatedMethod, String, boolean)>
	//*  79  157:astore          8
	//*  80  159:aload           8
	//*  81  161:ifnull          16
	//*  82  164:aload_0         
	//*  83  165:getfield        #85  <Field VisibilityChecker _visibilityChecker>
	//*  84  168:aload_2         
	//*  85  169:invokeinterface #349 <Method boolean VisibilityChecker.isIsGetterVisible(AnnotatedMethod)>
	//*  86  174:istore          5
	//*  87  176:aload_3         
	//*  88  177:ifnonnull       322
	//*  89  180:aload_0         
	//*  90  181:aload_1         
	//*  91  182:aload           8
	//*  92  184:invokevirtual   #227 <Method POJOPropertyBuilder _property(Map, String)>
	//*  93  187:aload_2         
	//*  94  188:aload           7
	//*  95  190:iload           4
	//*  96  192:iload           5
	//*  97  194:iload           6
	//*  98  196:invokevirtual   #353 <Method void POJOPropertyBuilder.addGetter(AnnotatedMethod, PropertyName, boolean, boolean, boolean)>
	//*  99  199:return          
			propertyname = annotationintrospector.findNameForSerialization(((Annotated) (annotatedmethod)));
	//  100  200:aload_3         
	//  101  201:aload_2         
	//  102  202:invokevirtual   #320 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//  103  205:astore          7
		if(propertyname != null)
			flag = true;
		else
	//* 104  207:goto            100
			flag = false;
	//  105  210:iconst_0        
	//  106  211:istore          4
		if(flag)
			break MISSING_BLOCK_LABEL_241;
		if(annotationintrospector != null)
	//* 107  213:goto            108
			obj = ((Object) (annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedmethod)))));
	//  108  216:aload_3         
	//  109  217:aload_2         
	//  110  218:invokevirtual   #185 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//  111  221:astore          9
		s = ((String) (obj));
		if(obj == null)
			s = BeanUtil.okNameForRegularGetter(annotatedmethod, annotatedmethod.getName(), _stdBeanNaming);
		if(s != null) goto _L4; else goto _L3
_L3:
		s = BeanUtil.okNameForIsGetter(annotatedmethod, annotatedmethod.getName(), _stdBeanNaming);
		if(s == null) goto _L1; else goto _L5
_L5:
		flag1 = _visibilityChecker.isIsGetterVisible(annotatedmethod);
_L6:
		if(annotationintrospector != null)
	//* 112  223:goto            117
	//* 113  226:aload_0         
	//* 114  227:getfield        #85  <Field VisibilityChecker _visibilityChecker>
	//* 115  230:aload_2         
	//* 116  231:invokeinterface #356 <Method boolean VisibilityChecker.isGetterVisible(AnnotatedMethod)>
	//* 117  236:istore          5
	//* 118  238:goto            176
	//* 119  241:aload_3         
	//* 120  242:ifnonnull       312
	//* 121  245:aload           8
	//* 122  247:astore          9
	//* 123  249:aload           8
	//* 124  251:ifnonnull       264
	//* 125  254:aload_2         
	//* 126  255:aload_0         
	//* 127  256:getfield        #59  <Field boolean _stdBeanNaming>
	//* 128  259:invokestatic    #360 <Method String BeanUtil.okNameForGetter(AnnotatedMethod, boolean)>
	//* 129  262:astore          9
	//* 130  264:aload           9
	//* 131  266:astore          8
	//* 132  268:aload           9
	//* 133  270:ifnonnull       279
	//* 134  273:aload_2         
	//* 135  274:invokevirtual   #337 <Method String AnnotatedMethod.getName()>
	//* 136  277:astore          8
	//* 137  279:aload           7
	//* 138  281:astore          9
	//* 139  283:aload           7
	//* 140  285:invokevirtual   #194 <Method boolean PropertyName.isEmpty()>
	//* 141  288:ifeq            302
	//* 142  291:aload_0         
	//* 143  292:aload           8
	//* 144  294:invokespecial   #291 <Method PropertyName _propNameFromSimple(String)>
	//* 145  297:astore          9
	//* 146  299:iconst_0        
	//* 147  300:istore          4
	//* 148  302:iconst_1        
	//* 149  303:istore          5
	//* 150  305:aload           9
	//* 151  307:astore          7
	//* 152  309:goto            176
	//* 153  312:aload_3         
	//* 154  313:aload_2         
	//* 155  314:invokevirtual   #185 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//* 156  317:astore          8
	//* 157  319:goto            245
			flag2 = annotationintrospector.hasIgnoreMarker(((AnnotatedMember) (annotatedmethod)));
	//  158  322:aload_3         
	//  159  323:aload_2         
	//  160  324:invokevirtual   #301 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//  161  327:istore          6
		_property(map, s).addGetter(annotatedmethod, propertyname, flag, flag1, flag2);
		return;
_L4:
		flag1 = _visibilityChecker.isGetterVisible(annotatedmethod);
		  goto _L6
		if(annotationintrospector != null)
			s = annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedmethod)));
		obj = ((Object) (s));
		if(s == null)
			obj = ((Object) (BeanUtil.okNameForGetter(annotatedmethod, _stdBeanNaming)));
		s = ((String) (obj));
		if(obj == null)
			s = annotatedmethod.getName();
		obj = ((Object) (propertyname));
		if(propertyname.isEmpty())
		{
			obj = ((Object) (_propNameFromSimple(s)));
			flag = false;
		}
		flag1 = true;
		propertyname = ((PropertyName) (obj));
		  goto _L6
	//* 162  329:goto            180
	}

	protected void _addInjectables(Map map)
	{
		map = ((Map) (_annotationIntrospector));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_1        
		if(map != null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       10
	//*   5    9:return          
		{
			AnnotatedField annotatedfield;
			for(Iterator iterator = _classDef.fields().iterator(); iterator.hasNext(); _doAddInjectable(((AnnotationIntrospector) (map)).findInjectableValueId(((AnnotatedMember) (annotatedfield))), ((AnnotatedMember) (annotatedfield))))
	//*   6   10:aload_0         
	//*   7   11:getfield        #65  <Field AnnotatedClass _classDef>
	//*   8   14:invokevirtual   #283 <Method Iterable AnnotatedClass.fields()>
	//*   9   17:invokeinterface #286 <Method Iterator Iterable.iterator()>
	//*  10   22:astore_2        
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            55
				annotatedfield = (AnnotatedField)iterator.next();
	//   14   32:aload_2         
	//   15   33:invokeinterface #251 <Method Object Iterator.next()>
	//   16   38:checkcast       #288 <Class AnnotatedField>
	//   17   41:astore_3        

	//   18   42:aload_0         
	//   19   43:aload_1         
	//   20   44:aload_3         
	//   21   45:invokevirtual   #366 <Method Object AnnotationIntrospector.findInjectableValueId(AnnotatedMember)>
	//   22   48:aload_3         
	//   23   49:invokevirtual   #370 <Method void _doAddInjectable(Object, AnnotatedMember)>
	//*  24   52:goto            23
			Iterator iterator1 = _classDef.memberMethods().iterator();
	//   25   55:aload_0         
	//   26   56:getfield        #65  <Field AnnotatedClass _classDef>
	//   27   59:invokevirtual   #373 <Method Iterable AnnotatedClass.memberMethods()>
	//   28   62:invokeinterface #286 <Method Iterator Iterable.iterator()>
	//   29   67:astore_2        
			while(iterator1.hasNext()) 
	//*  30   68:aload_2         
	//*  31   69:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//*  32   74:ifeq            9
			{
				AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator1.next();
	//   33   77:aload_2         
	//   34   78:invokeinterface #251 <Method Object Iterator.next()>
	//   35   83:checkcast       #269 <Class AnnotatedMethod>
	//   36   86:astore_3        
				if(annotatedmethod.getParameterCount() == 1)
	//*  37   87:aload_3         
	//*  38   88:invokevirtual   #270 <Method int AnnotatedMethod.getParameterCount()>
	//*  39   91:iconst_1        
	//*  40   92:icmpne          68
					_doAddInjectable(((AnnotationIntrospector) (map)).findInjectableValueId(((AnnotatedMember) (annotatedmethod))), ((AnnotatedMember) (annotatedmethod)));
	//   41   95:aload_0         
	//   42   96:aload_1         
	//   43   97:aload_3         
	//   44   98:invokevirtual   #366 <Method Object AnnotationIntrospector.findInjectableValueId(AnnotatedMember)>
	//   45  101:aload_3         
	//   46  102:invokevirtual   #370 <Method void _doAddInjectable(Object, AnnotatedMember)>
			}
		}
	//*  47  105:goto            68
	}

	protected void _addMethods(Map map)
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_3        
		Iterator iterator = _classDef.memberMethods().iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #65  <Field AnnotatedClass _classDef>
	//    5    9:invokevirtual   #373 <Method Iterable AnnotatedClass.memberMethods()>
	//    6   12:invokeinterface #286 <Method Iterator Iterable.iterator()>
	//    7   17:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   19:aload           4
	//    9   21:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            127
			AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
	//   11   29:aload           4
	//   12   31:invokeinterface #251 <Method Object Iterator.next()>
	//   13   36:checkcast       #269 <Class AnnotatedMethod>
	//   14   39:astore          5
			int i = annotatedmethod.getParameterCount();
	//   15   41:aload           5
	//   16   43:invokevirtual   #270 <Method int AnnotatedMethod.getParameterCount()>
	//   17   46:istore_2        
			if(i == 0)
	//*  18   47:iload_2         
	//*  19   48:ifne            62
				_addGetterMethod(map, annotatedmethod, annotationintrospector);
	//   20   51:aload_0         
	//   21   52:aload_1         
	//   22   53:aload           5
	//   23   55:aload_3         
	//   24   56:invokevirtual   #376 <Method void _addGetterMethod(Map, AnnotatedMethod, AnnotationIntrospector)>
			else
	//*  25   59:goto            19
			if(i == 1)
	//*  26   62:iload_2         
	//*  27   63:iconst_1        
	//*  28   64:icmpne          78
				_addSetterMethod(map, annotatedmethod, annotationintrospector);
	//   29   67:aload_0         
	//   30   68:aload_1         
	//   31   69:aload           5
	//   32   71:aload_3         
	//   33   72:invokevirtual   #379 <Method void _addSetterMethod(Map, AnnotatedMethod, AnnotationIntrospector)>
			else
	//*  34   75:goto            19
			if(i == 2 && annotationintrospector != null && annotationintrospector.hasAnySetterAnnotation(annotatedmethod))
	//*  35   78:iload_2         
	//*  36   79:iconst_2        
	//*  37   80:icmpne          19
	//*  38   83:aload_3         
	//*  39   84:ifnull          19
	//*  40   87:aload_3         
	//*  41   88:aload           5
	//*  42   90:invokevirtual   #382 <Method boolean AnnotationIntrospector.hasAnySetterAnnotation(AnnotatedMethod)>
	//*  43   93:ifeq            19
			{
				if(_anySetters == null)
	//*  44   96:aload_0         
	//*  45   97:getfield        #384 <Field LinkedList _anySetters>
	//*  46  100:ifnonnull       114
					_anySetters = new LinkedList();
	//   47  103:aload_0         
	//   48  104:new             #223 <Class LinkedList>
	//   49  107:dup             
	//   50  108:invokespecial   #254 <Method void LinkedList()>
	//   51  111:putfield        #384 <Field LinkedList _anySetters>
				_anySetters.add(((Object) (annotatedmethod)));
	//   52  114:aload_0         
	//   53  115:getfield        #384 <Field LinkedList _anySetters>
	//   54  118:aload           5
	//   55  120:invokevirtual   #224 <Method boolean LinkedList.add(Object)>
	//   56  123:pop             
			}
		} while(true);
	//   57  124:goto            19
	//   58  127:return          
	}

	protected void _addSetterMethod(Map map, AnnotatedMethod annotatedmethod, AnnotationIntrospector annotationintrospector)
	{
		boolean flag2 = false;
	//    0    0:iconst_0        
	//    1    1:istore          6
		Object obj = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		String s = null;
	//    4    6:aconst_null     
	//    5    7:astore          8
		boolean flag;
		PropertyName propertyname;
		if(annotationintrospector == null)
	//*   6    9:aload_3         
	//*   7   10:ifnonnull       62
			propertyname = null;
	//    8   13:aconst_null     
	//    9   14:astore          7
		else
	//*  10   16:aload           7
	//*  11   18:ifnull          72
	//*  12   21:iconst_1        
	//*  13   22:istore          4
	//*  14   24:iload           4
	//*  15   26:ifne            128
	//*  16   29:aload_3         
	//*  17   30:ifnonnull       78
	//*  18   33:aload           8
	//*  19   35:astore          9
	//*  20   37:aload           8
	//*  21   39:ifnonnull       56
	//*  22   42:aload_2         
	//*  23   43:aload_0         
	//*  24   44:getfield        #69  <Field String _mutatorPrefix>
	//*  25   47:aload_0         
	//*  26   48:getfield        #59  <Field boolean _stdBeanNaming>
	//*  27   51:invokestatic    #387 <Method String BeanUtil.okNameForMutator(AnnotatedMethod, String, boolean)>
	//*  28   54:astore          9
	//*  29   56:aload           9
	//*  30   58:ifnonnull       88
	//*  31   61:return          
			propertyname = annotationintrospector.findNameForDeserialization(((Annotated) (annotatedmethod)));
	//   32   62:aload_3         
	//   33   63:aload_2         
	//   34   64:invokevirtual   #191 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   35   67:astore          7
		if(propertyname != null)
			flag = true;
		else
	//*  36   69:goto            16
			flag = false;
	//   37   72:iconst_0        
	//   38   73:istore          4
		boolean flag1;
		if(!flag)
		{
			if(annotationintrospector != null)
	//*  39   75:goto            24
				s = annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedmethod)));
	//   40   78:aload_3         
	//   41   79:aload_2         
	//   42   80:invokevirtual   #185 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   43   83:astore          8
			obj = ((Object) (s));
			if(s == null)
				obj = ((Object) (BeanUtil.okNameForMutator(annotatedmethod, _mutatorPrefix, _stdBeanNaming)));
			if(obj == null)
				return;
	//*  44   85:goto            33
			flag1 = _visibilityChecker.isSetterVisible(annotatedmethod);
	//   45   88:aload_0         
	//   46   89:getfield        #85  <Field VisibilityChecker _visibilityChecker>
	//   47   92:aload_2         
	//   48   93:invokeinterface #390 <Method boolean VisibilityChecker.isSetterVisible(AnnotatedMethod)>
	//   49   98:istore          5
			s = ((String) (obj));
	//   50  100:aload           9
	//   51  102:astore          8
		} else
	//*  52  104:aload_3         
	//*  53  105:ifnonnull       217
	//*  54  108:aload_0         
	//*  55  109:aload_1         
	//*  56  110:aload           8
	//*  57  112:invokevirtual   #227 <Method POJOPropertyBuilder _property(Map, String)>
	//*  58  115:aload_2         
	//*  59  116:aload           7
	//*  60  118:iload           4
	//*  61  120:iload           5
	//*  62  122:iload           6
	//*  63  124:invokevirtual   #393 <Method void POJOPropertyBuilder.addSetter(AnnotatedMethod, PropertyName, boolean, boolean, boolean)>
	//*  64  127:return          
		{
			if(annotationintrospector == null)
	//*  65  128:aload_3         
	//*  66  129:ifnonnull       207
				s = ((String) (obj));
	//   67  132:aload           9
	//   68  134:astore          8
			else
	//*  69  136:aload           8
	//*  70  138:astore          9
	//*  71  140:aload           8
	//*  72  142:ifnonnull       159
	//*  73  145:aload_2         
	//*  74  146:aload_0         
	//*  75  147:getfield        #69  <Field String _mutatorPrefix>
	//*  76  150:aload_0         
	//*  77  151:getfield        #59  <Field boolean _stdBeanNaming>
	//*  78  154:invokestatic    #387 <Method String BeanUtil.okNameForMutator(AnnotatedMethod, String, boolean)>
	//*  79  157:astore          9
	//*  80  159:aload           9
	//*  81  161:astore          8
	//*  82  163:aload           9
	//*  83  165:ifnonnull       174
	//*  84  168:aload_2         
	//*  85  169:invokevirtual   #337 <Method String AnnotatedMethod.getName()>
	//*  86  172:astore          8
	//*  87  174:aload           7
	//*  88  176:astore          9
	//*  89  178:aload           7
	//*  90  180:invokevirtual   #194 <Method boolean PropertyName.isEmpty()>
	//*  91  183:ifeq            197
	//*  92  186:aload_0         
	//*  93  187:aload           8
	//*  94  189:invokespecial   #291 <Method PropertyName _propNameFromSimple(String)>
	//*  95  192:astore          9
	//*  96  194:iconst_0        
	//*  97  195:istore          4
	//*  98  197:iconst_1        
	//*  99  198:istore          5
	//* 100  200:aload           9
	//* 101  202:astore          7
	//* 102  204:goto            104
				s = annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedmethod)));
	//  103  207:aload_3         
	//  104  208:aload_2         
	//  105  209:invokevirtual   #185 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//  106  212:astore          8
			obj = ((Object) (s));
			if(s == null)
				obj = ((Object) (BeanUtil.okNameForMutator(annotatedmethod, _mutatorPrefix, _stdBeanNaming)));
			s = ((String) (obj));
			if(obj == null)
				s = annotatedmethod.getName();
			obj = ((Object) (propertyname));
			if(propertyname.isEmpty())
			{
				obj = ((Object) (_propNameFromSimple(s)));
				flag = false;
			}
			flag1 = true;
			propertyname = ((PropertyName) (obj));
		}
		if(annotationintrospector != null)
	//* 107  214:goto            136
			flag2 = annotationintrospector.hasIgnoreMarker(((AnnotatedMember) (annotatedmethod)));
	//  108  217:aload_3         
	//  109  218:aload_2         
	//  110  219:invokevirtual   #301 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//  111  222:istore          6
		_property(map, s).addSetter(annotatedmethod, propertyname, flag, flag1, flag2);
	//* 112  224:goto            108
	}

	protected void _doAddInjectable(Object obj, AnnotatedMember annotatedmember)
	{
		if(obj != null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
	//*   2    4:return          
		{
			if(_injectables == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #395 <Field LinkedHashMap _injectables>
	//*   5    9:ifnonnull       23
				_injectables = new LinkedHashMap();
	//    6   12:aload_0         
	//    7   13:new             #397 <Class LinkedHashMap>
	//    8   16:dup             
	//    9   17:invokespecial   #398 <Method void LinkedHashMap()>
	//   10   20:putfield        #395 <Field LinkedHashMap _injectables>
			if((AnnotatedMember)_injectables.put(obj, ((Object) (annotatedmember))) != null)
	//*  11   23:aload_0         
	//*  12   24:getfield        #395 <Field LinkedHashMap _injectables>
	//*  13   27:aload_1         
	//*  14   28:aload_2         
	//*  15   29:invokevirtual   #402 <Method Object LinkedHashMap.put(Object, Object)>
	//*  16   32:checkcast       #404 <Class AnnotatedMember>
	//*  17   35:ifnull          4
			{
				annotatedmember = ((AnnotatedMember) (obj.getClass().getName()));
	//   18   38:aload_1         
	//   19   39:invokevirtual   #133 <Method Class Object.getClass()>
	//   20   42:invokevirtual   #137 <Method String Class.getName()>
	//   21   45:astore_2        
				throw new IllegalArgumentException((new StringBuilder()).append("Duplicate injectable value with id '").append(String.valueOf(obj)).append("' (of type ").append(((String) (annotatedmember))).append(")").toString());
	//   22   46:new             #406 <Class IllegalArgumentException>
	//   23   49:dup             
	//   24   50:new             #122 <Class StringBuilder>
	//   25   53:dup             
	//   26   54:invokespecial   #123 <Method void StringBuilder()>
	//   27   57:ldc2            #408 <String "Duplicate injectable value with id '">
	//   28   60:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:aload_1         
	//   30   64:invokestatic    #412 <Method String String.valueOf(Object)>
	//   31   67:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   32   70:ldc2            #414 <String "' (of type ">
	//   33   73:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   34   76:aload_2         
	//   35   77:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   36   80:ldc2            #416 <String ")">
	//   37   83:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   38   86:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   39   89:invokespecial   #417 <Method void IllegalArgumentException(String)>
	//   40   92:athrow          
			}
		}
	}

	protected POJOPropertyBuilder _property(Map map, PropertyName propertyname)
	{
		return _property(map, propertyname.getSimpleName());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokevirtual   #420 <Method String PropertyName.getSimpleName()>
	//    4    6:invokevirtual   #227 <Method POJOPropertyBuilder _property(Map, String)>
	//    5    9:areturn         
	}

	protected POJOPropertyBuilder _property(Map map, String s)
	{
		POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)map.get(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #427 <Method Object Map.get(Object)>
	//    3    7:checkcast       #215 <Class POJOPropertyBuilder>
	//    4   10:astore          4
		POJOPropertyBuilder pojopropertybuilder = pojopropertybuilder1;
	//    5   12:aload           4
	//    6   14:astore_3        
		if(pojopropertybuilder1 == null)
	//*   7   15:aload           4
	//*   8   17:ifnonnull       53
		{
			pojopropertybuilder = new POJOPropertyBuilder(_config, _annotationIntrospector, _forSerialization, PropertyName.construct(s));
	//    9   20:new             #215 <Class POJOPropertyBuilder>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:getfield        #45  <Field MapperConfig _config>
	//   13   28:aload_0         
	//   14   29:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//   15   32:aload_0         
	//   16   33:getfield        #61  <Field boolean _forSerialization>
	//   17   36:aload_2         
	//   18   37:invokestatic    #209 <Method PropertyName PropertyName.construct(String)>
	//   19   40:invokespecial   #430 <Method void POJOPropertyBuilder(MapperConfig, AnnotationIntrospector, boolean, PropertyName)>
	//   20   43:astore_3        
			map.put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//   21   44:aload_1         
	//   22   45:aload_2         
	//   23   46:aload_3         
	//   24   47:invokeinterface #431 <Method Object Map.put(Object, Object)>
	//   25   52:pop             
		}
		return pojopropertybuilder;
	//   26   53:aload_3         
	//   27   54:areturn         
	}

	protected void _removeUnwantedAccessor(Map map)
	{
		boolean flag = _config.isEnabled(MapperFeature.INFER_PROPERTY_MUTATORS);
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field MapperConfig _config>
	//    2    4:getstatic       #436 <Field MapperFeature MapperFeature.INFER_PROPERTY_MUTATORS>
	//    3    7:invokevirtual   #57  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//    4   10:istore_2        
		for(map = ((Map) (map.values().iterator())); ((Iterator) (map)).hasNext(); ((POJOPropertyBuilder)((Iterator) (map)).next()).removeNonVisible(flag));
	//    5   11:aload_1         
	//    6   12:invokeinterface #440 <Method Collection Map.values()>
	//    7   17:invokeinterface #443 <Method Iterator Collection.iterator()>
	//    8   22:astore_1        
	//    9   23:aload_1         
	//   10   24:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            48
	//   12   32:aload_1         
	//   13   33:invokeinterface #251 <Method Object Iterator.next()>
	//   14   38:checkcast       #215 <Class POJOPropertyBuilder>
	//   15   41:iload_2         
	//   16   42:invokevirtual   #447 <Method void POJOPropertyBuilder.removeNonVisible(boolean)>
	//*  17   45:goto            23
	//   18   48:return          
	}

	protected void _removeUnwantedProperties(Map map)
	{
		map = ((Map) (map.values().iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #440 <Method Collection Map.values()>
	//    2    6:invokeinterface #443 <Method Iterator Collection.iterator()>
	//    3   11:astore_1        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//    4   12:aload_1         
	//    5   13:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            107
			POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #251 <Method Object Iterator.next()>
	//    9   27:checkcast       #215 <Class POJOPropertyBuilder>
	//   10   30:astore_2        
			if(!pojopropertybuilder.anyVisible())
	//*  11   31:aload_2         
	//*  12   32:invokevirtual   #451 <Method boolean POJOPropertyBuilder.anyVisible()>
	//*  13   35:ifne            47
				((Iterator) (map)).remove();
	//   14   38:aload_1         
	//   15   39:invokeinterface #454 <Method void Iterator.remove()>
			else
	//*  16   44:goto            12
			if(pojopropertybuilder.anyIgnorals())
	//*  17   47:aload_2         
	//*  18   48:invokevirtual   #457 <Method boolean POJOPropertyBuilder.anyIgnorals()>
	//*  19   51:ifeq            12
				if(!pojopropertybuilder.isExplicitlyIncluded())
	//*  20   54:aload_2         
	//*  21   55:invokevirtual   #460 <Method boolean POJOPropertyBuilder.isExplicitlyIncluded()>
	//*  22   58:ifne            78
				{
					((Iterator) (map)).remove();
	//   23   61:aload_1         
	//   24   62:invokeinterface #454 <Method void Iterator.remove()>
					_collectIgnorals(pojopropertybuilder.getName());
	//   25   67:aload_0         
	//   26   68:aload_2         
	//   27   69:invokevirtual   #461 <Method String POJOPropertyBuilder.getName()>
	//   28   72:invokespecial   #463 <Method void _collectIgnorals(String)>
				} else
	//*  29   75:goto            12
				{
					pojopropertybuilder.removeIgnored();
	//   30   78:aload_2         
	//   31   79:invokevirtual   #466 <Method void POJOPropertyBuilder.removeIgnored()>
					if(!_forSerialization && !pojopropertybuilder.couldDeserialize())
	//*  32   82:aload_0         
	//*  33   83:getfield        #61  <Field boolean _forSerialization>
	//*  34   86:ifne            12
	//*  35   89:aload_2         
	//*  36   90:invokevirtual   #469 <Method boolean POJOPropertyBuilder.couldDeserialize()>
	//*  37   93:ifne            12
						_collectIgnorals(pojopropertybuilder.getName());
	//   38   96:aload_0         
	//   39   97:aload_2         
	//   40   98:invokevirtual   #461 <Method String POJOPropertyBuilder.getName()>
	//   41  101:invokespecial   #463 <Method void _collectIgnorals(String)>
				}
		} while(true);
	//   42  104:goto            12
	//   43  107:return          
	}

	protected void _renameProperties(Map map)
	{
		Iterator iterator = map.entrySet().iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #474 <Method Set Map.entrySet()>
	//    2    6:invokeinterface #477 <Method Iterator Set.iterator()>
	//    3   11:astore          4
		Object obj = null;
	//    4   13:aconst_null     
	//    5   14:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   15:aload           4
	//    7   17:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            141
			POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)((java.util.Map.Entry)iterator.next()).getValue();
	//    9   25:aload           4
	//   10   27:invokeinterface #251 <Method Object Iterator.next()>
	//   11   32:checkcast       #479 <Class java.util.Map$Entry>
	//   12   35:invokeinterface #482 <Method Object java.util.Map$Entry.getValue()>
	//   13   40:checkcast       #215 <Class POJOPropertyBuilder>
	//   14   43:astore          5
			Set set = pojopropertybuilder1.findExplicitNames();
	//   15   45:aload           5
	//   16   47:invokevirtual   #485 <Method Set POJOPropertyBuilder.findExplicitNames()>
	//   17   50:astore          6
			if(!((Collection) (set)).isEmpty())
	//*  18   52:aload           6
	//*  19   54:invokeinterface #486 <Method boolean Collection.isEmpty()>
	//*  20   59:ifne            15
			{
				iterator.remove();
	//   21   62:aload           4
	//   22   64:invokeinterface #454 <Method void Iterator.remove()>
				LinkedList linkedlist = ((LinkedList) (obj));
	//   23   69:aload_2         
	//   24   70:astore_3        
				if(obj == null)
	//*  25   71:aload_2         
	//*  26   72:ifnonnull       83
					linkedlist = new LinkedList();
	//   27   75:new             #223 <Class LinkedList>
	//   28   78:dup             
	//   29   79:invokespecial   #254 <Method void LinkedList()>
	//   30   82:astore_3        
				if(((Collection) (set)).size() == 1)
	//*  31   83:aload           6
	//*  32   85:invokeinterface #489 <Method int Collection.size()>
	//*  33   90:iconst_1        
	//*  34   91:icmpne          124
				{
					linkedlist.add(((Object) (pojopropertybuilder1.withName((PropertyName)((Collection) (set)).iterator().next()))));
	//   35   94:aload_3         
	//   36   95:aload           5
	//   37   97:aload           6
	//   38   99:invokeinterface #443 <Method Iterator Collection.iterator()>
	//   39  104:invokeinterface #251 <Method Object Iterator.next()>
	//   40  109:checkcast       #175 <Class PropertyName>
	//   41  112:invokevirtual   #493 <Method POJOPropertyBuilder POJOPropertyBuilder.withName(PropertyName)>
	//   42  115:invokevirtual   #224 <Method boolean LinkedList.add(Object)>
	//   43  118:pop             
					obj = ((Object) (linkedlist));
	//   44  119:aload_3         
	//   45  120:astore_2        
				} else
	//*  46  121:goto            15
				{
					linkedlist.addAll(pojopropertybuilder1.explode(((Collection) (set))));
	//   47  124:aload_3         
	//   48  125:aload           5
	//   49  127:aload           6
	//   50  129:invokevirtual   #497 <Method Collection POJOPropertyBuilder.explode(Collection)>
	//   51  132:invokevirtual   #501 <Method boolean LinkedList.addAll(Collection)>
	//   52  135:pop             
					obj = ((Object) (linkedlist));
	//   53  136:aload_3         
	//   54  137:astore_2        
				}
			}
		} while(true);
	//   55  138:goto            15
		if(obj != null)
	//*  56  141:aload_2         
	//*  57  142:ifnull          224
		{
			obj = ((Object) (((LinkedList) (obj)).iterator()));
	//   58  145:aload_2         
	//   59  146:invokevirtual   #502 <Method Iterator LinkedList.iterator()>
	//   60  149:astore_2        
			while(((Iterator) (obj)).hasNext()) 
	//*  61  150:aload_2         
	//*  62  151:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//*  63  156:ifeq            224
			{
				POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (obj)).next();
	//   64  159:aload_2         
	//   65  160:invokeinterface #251 <Method Object Iterator.next()>
	//   66  165:checkcast       #215 <Class POJOPropertyBuilder>
	//   67  168:astore_3        
				String s = pojopropertybuilder.getName();
	//   68  169:aload_3         
	//   69  170:invokevirtual   #461 <Method String POJOPropertyBuilder.getName()>
	//   70  173:astore          4
				POJOPropertyBuilder pojopropertybuilder2 = (POJOPropertyBuilder)map.get(((Object) (s)));
	//   71  175:aload_1         
	//   72  176:aload           4
	//   73  178:invokeinterface #427 <Method Object Map.get(Object)>
	//   74  183:checkcast       #215 <Class POJOPropertyBuilder>
	//   75  186:astore          5
				if(pojopropertybuilder2 == null)
	//*  76  188:aload           5
	//*  77  190:ifnonnull       215
					map.put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//   78  193:aload_1         
	//   79  194:aload           4
	//   80  196:aload_3         
	//   81  197:invokeinterface #431 <Method Object Map.put(Object, Object)>
	//   82  202:pop             
				else
	//*  83  203:aload_0         
	//*  84  204:aload_3         
	//*  85  205:aload_0         
	//*  86  206:getfield        #221 <Field LinkedList _creatorProperties>
	//*  87  209:invokevirtual   #506 <Method void _updateCreatorProperty(POJOPropertyBuilder, List)>
	//*  88  212:goto            150
					pojopropertybuilder2.addAll(pojopropertybuilder);
	//   89  215:aload           5
	//   90  217:aload_3         
	//   91  218:invokevirtual   #509 <Method void POJOPropertyBuilder.addAll(POJOPropertyBuilder)>
				_updateCreatorProperty(pojopropertybuilder, ((List) (_creatorProperties)));
			}
		}
	//*  92  221:goto            203
	//   93  224:return          
	}

	protected void _renameUsing(Map map, PropertyNamingStrategy propertynamingstrategy)
	{
		POJOPropertyBuilder apojopropertybuilder[] = (POJOPropertyBuilder[])map.values().toArray(((Object []) (new POJOPropertyBuilder[map.size()])));
	//    0    0:aload_1         
	//    1    1:invokeinterface #440 <Method Collection Map.values()>
	//    2    6:aload_1         
	//    3    7:invokeinterface #512 <Method int Map.size()>
	//    4   12:anewarray       POJOPropertyBuilder[]
	//    5   15:invokeinterface #516 <Method Object[] Collection.toArray(Object[])>
	//    6   20:checkcast       #518 <Class POJOPropertyBuilder[]>
	//    7   23:astore          8
		map.clear();
	//    8   25:aload_1         
	//    9   26:invokeinterface #521 <Method void Map.clear()>
		int j = apojopropertybuilder.length;
	//   10   31:aload           8
	//   11   33:arraylength     
	//   12   34:istore          4
		int i = 0;
	//   13   36:iconst_0        
	//   14   37:istore_3        
		while(i < j) 
	//*  15   38:iload_3         
	//*  16   39:iload           4
	//*  17   41:icmpge          389
		{
			Object obj;
			Object obj1;
			Object obj2;
			PropertyName propertyname;
label0:
			{
				obj1 = ((Object) (apojopropertybuilder[i]));
	//   18   44:aload           8
	//   19   46:iload_3         
	//   20   47:aaload          
	//   21   48:astore          6
				propertyname = ((POJOPropertyBuilder) (obj1)).getFullName();
	//   22   50:aload           6
	//   23   52:invokevirtual   #525 <Method PropertyName POJOPropertyBuilder.getFullName()>
	//   24   55:astore          9
				obj2 = null;
	//   25   57:aconst_null     
	//   26   58:astore          7
				if(((POJOPropertyBuilder) (obj1)).isExplicitlyNamed())
	//*  27   60:aload           6
	//*  28   62:invokevirtual   #528 <Method boolean POJOPropertyBuilder.isExplicitlyNamed()>
	//*  29   65:ifeq            85
				{
					obj = obj2;
	//   30   68:aload           7
	//   31   70:astore          5
					if(!_config.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING))
						break label0;
	//   32   72:aload_0         
	//   33   73:getfield        #45  <Field MapperConfig _config>
	//   34   76:getstatic       #531 <Field MapperFeature MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING>
	//   35   79:invokevirtual   #57  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//   36   82:ifeq            120
				}
				if(_forSerialization)
	//*  37   85:aload_0         
	//*  38   86:getfield        #61  <Field boolean _forSerialization>
	//*  39   89:ifeq            233
				{
					if(((POJOPropertyBuilder) (obj1)).hasGetter())
	//*  40   92:aload           6
	//*  41   94:invokevirtual   #534 <Method boolean POJOPropertyBuilder.hasGetter()>
	//*  42   97:ifeq            198
					{
						obj = ((Object) (propertynamingstrategy.nameForGetterMethod(_config, ((POJOPropertyBuilder) (obj1)).getGetter(), propertyname.getSimpleName())));
	//   43  100:aload_2         
	//   44  101:aload_0         
	//   45  102:getfield        #45  <Field MapperConfig _config>
	//   46  105:aload           6
	//   47  107:invokevirtual   #538 <Method AnnotatedMethod POJOPropertyBuilder.getGetter()>
	//   48  110:aload           9
	//   49  112:invokevirtual   #420 <Method String PropertyName.getSimpleName()>
	//   50  115:invokevirtual   #542 <Method String PropertyNamingStrategy.nameForGetterMethod(MapperConfig, AnnotatedMethod, String)>
	//   51  118:astore          5
					} else
	//*  52  120:aload           5
	//*  53  122:ifnull          361
	//*  54  125:aload           9
	//*  55  127:aload           5
	//*  56  129:invokevirtual   #546 <Method boolean PropertyName.hasSimpleName(String)>
	//*  57  132:ifne            361
	//*  58  135:aload           6
	//*  59  137:aload           5
	//*  60  139:invokevirtual   #550 <Method POJOPropertyBuilder POJOPropertyBuilder.withSimpleName(String)>
	//*  61  142:astore          7
	//*  62  144:aload           5
	//*  63  146:astore          6
	//*  64  148:aload           7
	//*  65  150:astore          5
	//*  66  152:aload_1         
	//*  67  153:aload           6
	//*  68  155:invokeinterface #427 <Method Object Map.get(Object)>
	//*  69  160:checkcast       #215 <Class POJOPropertyBuilder>
	//*  70  163:astore          7
	//*  71  165:aload           7
	//*  72  167:ifnonnull       379
	//*  73  170:aload_1         
	//*  74  171:aload           6
	//*  75  173:aload           5
	//*  76  175:invokeinterface #431 <Method Object Map.put(Object, Object)>
	//*  77  180:pop             
	//*  78  181:aload_0         
	//*  79  182:aload           5
	//*  80  184:aload_0         
	//*  81  185:getfield        #221 <Field LinkedList _creatorProperties>
	//*  82  188:invokevirtual   #506 <Method void _updateCreatorProperty(POJOPropertyBuilder, List)>
	//*  83  191:iload_3         
	//*  84  192:iconst_1        
	//*  85  193:iadd            
	//*  86  194:istore_3        
	//*  87  195:goto            38
					{
						obj = obj2;
	//   88  198:aload           7
	//   89  200:astore          5
						if(((POJOPropertyBuilder) (obj1)).hasField())
	//*  90  202:aload           6
	//*  91  204:invokevirtual   #553 <Method boolean POJOPropertyBuilder.hasField()>
	//*  92  207:ifeq            120
							obj = ((Object) (propertynamingstrategy.nameForField(_config, ((POJOPropertyBuilder) (obj1)).getField(), propertyname.getSimpleName())));
	//   93  210:aload_2         
	//   94  211:aload_0         
	//   95  212:getfield        #45  <Field MapperConfig _config>
	//   96  215:aload           6
	//   97  217:invokevirtual   #557 <Method AnnotatedField POJOPropertyBuilder.getField()>
	//   98  220:aload           9
	//   99  222:invokevirtual   #420 <Method String PropertyName.getSimpleName()>
	//  100  225:invokevirtual   #561 <Method String PropertyNamingStrategy.nameForField(MapperConfig, AnnotatedField, String)>
	//  101  228:astore          5
					}
				} else
	//* 102  230:goto            120
				if(((POJOPropertyBuilder) (obj1)).hasSetter())
	//* 103  233:aload           6
	//* 104  235:invokevirtual   #564 <Method boolean POJOPropertyBuilder.hasSetter()>
	//* 105  238:ifeq            264
					obj = ((Object) (propertynamingstrategy.nameForSetterMethod(_config, ((POJOPropertyBuilder) (obj1)).getSetter(), propertyname.getSimpleName())));
	//  106  241:aload_2         
	//  107  242:aload_0         
	//  108  243:getfield        #45  <Field MapperConfig _config>
	//  109  246:aload           6
	//  110  248:invokevirtual   #567 <Method AnnotatedMethod POJOPropertyBuilder.getSetter()>
	//  111  251:aload           9
	//  112  253:invokevirtual   #420 <Method String PropertyName.getSimpleName()>
	//  113  256:invokevirtual   #570 <Method String PropertyNamingStrategy.nameForSetterMethod(MapperConfig, AnnotatedMethod, String)>
	//  114  259:astore          5
				else
	//* 115  261:goto            120
				if(((POJOPropertyBuilder) (obj1)).hasConstructorParameter())
	//* 116  264:aload           6
	//* 117  266:invokevirtual   #573 <Method boolean POJOPropertyBuilder.hasConstructorParameter()>
	//* 118  269:ifeq            295
					obj = ((Object) (propertynamingstrategy.nameForConstructorParameter(_config, ((POJOPropertyBuilder) (obj1)).getConstructorParameter(), propertyname.getSimpleName())));
	//  119  272:aload_2         
	//  120  273:aload_0         
	//  121  274:getfield        #45  <Field MapperConfig _config>
	//  122  277:aload           6
	//  123  279:invokevirtual   #577 <Method AnnotatedParameter POJOPropertyBuilder.getConstructorParameter()>
	//  124  282:aload           9
	//  125  284:invokevirtual   #420 <Method String PropertyName.getSimpleName()>
	//  126  287:invokevirtual   #581 <Method String PropertyNamingStrategy.nameForConstructorParameter(MapperConfig, AnnotatedParameter, String)>
	//  127  290:astore          5
				else
	//* 128  292:goto            120
				if(((POJOPropertyBuilder) (obj1)).hasField())
	//* 129  295:aload           6
	//* 130  297:invokevirtual   #553 <Method boolean POJOPropertyBuilder.hasField()>
	//* 131  300:ifeq            326
				{
					obj = ((Object) (propertynamingstrategy.nameForField(_config, ((POJOPropertyBuilder) (obj1)).getField(), propertyname.getSimpleName())));
	//  132  303:aload_2         
	//  133  304:aload_0         
	//  134  305:getfield        #45  <Field MapperConfig _config>
	//  135  308:aload           6
	//  136  310:invokevirtual   #557 <Method AnnotatedField POJOPropertyBuilder.getField()>
	//  137  313:aload           9
	//  138  315:invokevirtual   #420 <Method String PropertyName.getSimpleName()>
	//  139  318:invokevirtual   #561 <Method String PropertyNamingStrategy.nameForField(MapperConfig, AnnotatedField, String)>
	//  140  321:astore          5
				} else
	//* 141  323:goto            120
				{
					obj = obj2;
	//  142  326:aload           7
	//  143  328:astore          5
					if(((POJOPropertyBuilder) (obj1)).hasGetter())
	//* 144  330:aload           6
	//* 145  332:invokevirtual   #534 <Method boolean POJOPropertyBuilder.hasGetter()>
	//* 146  335:ifeq            120
						obj = ((Object) (propertynamingstrategy.nameForGetterMethod(_config, ((POJOPropertyBuilder) (obj1)).getGetter(), propertyname.getSimpleName())));
	//  147  338:aload_2         
	//  148  339:aload_0         
	//  149  340:getfield        #45  <Field MapperConfig _config>
	//  150  343:aload           6
	//  151  345:invokevirtual   #538 <Method AnnotatedMethod POJOPropertyBuilder.getGetter()>
	//  152  348:aload           9
	//  153  350:invokevirtual   #420 <Method String PropertyName.getSimpleName()>
	//  154  353:invokevirtual   #542 <Method String PropertyNamingStrategy.nameForGetterMethod(MapperConfig, AnnotatedMethod, String)>
	//  155  356:astore          5
				}
			}
			if(obj != null && !propertyname.hasSimpleName(((String) (obj))))
			{
				obj2 = ((Object) (((POJOPropertyBuilder) (obj1)).withSimpleName(((String) (obj)))));
				obj1 = obj;
				obj = obj2;
			} else
	//* 156  358:goto            120
			{
				obj2 = ((Object) (propertyname.getSimpleName()));
	//  157  361:aload           9
	//  158  363:invokevirtual   #420 <Method String PropertyName.getSimpleName()>
	//  159  366:astore          7
				obj = obj1;
	//  160  368:aload           6
	//  161  370:astore          5
				obj1 = obj2;
	//  162  372:aload           7
	//  163  374:astore          6
			}
			obj2 = ((Object) ((POJOPropertyBuilder)map.get(obj1)));
			if(obj2 == null)
				map.put(obj1, obj);
			else
	//* 164  376:goto            152
				((POJOPropertyBuilder) (obj2)).addAll(((POJOPropertyBuilder) (obj)));
	//  165  379:aload           7
	//  166  381:aload           5
	//  167  383:invokevirtual   #509 <Method void POJOPropertyBuilder.addAll(POJOPropertyBuilder)>
			_updateCreatorProperty(((POJOPropertyBuilder) (obj)), ((List) (_creatorProperties)));
			i++;
		}
	//* 168  386:goto            181
	//  169  389:return          
	}

	protected void _renameWithWrappers(Map map)
	{
		Iterator iterator = map.entrySet().iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #474 <Method Set Map.entrySet()>
	//    2    6:invokeinterface #477 <Method Iterator Set.iterator()>
	//    3   11:astore          4
		Object obj = null;
	//    4   13:aconst_null     
	//    5   14:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   15:aload           4
	//    7   17:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            129
			POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)((java.util.Map.Entry)iterator.next()).getValue();
	//    9   25:aload           4
	//   10   27:invokeinterface #251 <Method Object Iterator.next()>
	//   11   32:checkcast       #479 <Class java.util.Map$Entry>
	//   12   35:invokeinterface #482 <Method Object java.util.Map$Entry.getValue()>
	//   13   40:checkcast       #215 <Class POJOPropertyBuilder>
	//   14   43:astore          5
			AnnotatedMember annotatedmember = pojopropertybuilder1.getPrimaryMember();
	//   15   45:aload           5
	//   16   47:invokevirtual   #587 <Method AnnotatedMember POJOPropertyBuilder.getPrimaryMember()>
	//   17   50:astore_3        
			if(annotatedmember != null)
	//*  18   51:aload_3         
	//*  19   52:ifnull          15
			{
				PropertyName propertyname = _annotationIntrospector.findWrapperName(((Annotated) (annotatedmember)));
	//   20   55:aload_0         
	//   21   56:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//   22   59:aload_3         
	//   23   60:invokevirtual   #590 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//   24   63:astore          6
				if(propertyname != null && propertyname.hasSimpleName() && !propertyname.equals(((Object) (pojopropertybuilder1.getFullName()))))
	//*  25   65:aload           6
	//*  26   67:ifnull          15
	//*  27   70:aload           6
	//*  28   72:invokevirtual   #592 <Method boolean PropertyName.hasSimpleName()>
	//*  29   75:ifeq            15
	//*  30   78:aload           6
	//*  31   80:aload           5
	//*  32   82:invokevirtual   #525 <Method PropertyName POJOPropertyBuilder.getFullName()>
	//*  33   85:invokevirtual   #595 <Method boolean PropertyName.equals(Object)>
	//*  34   88:ifne            15
				{
					LinkedList linkedlist = ((LinkedList) (obj));
	//   35   91:aload_2         
	//   36   92:astore_3        
					if(obj == null)
	//*  37   93:aload_2         
	//*  38   94:ifnonnull       105
						linkedlist = new LinkedList();
	//   39   97:new             #223 <Class LinkedList>
	//   40  100:dup             
	//   41  101:invokespecial   #254 <Method void LinkedList()>
	//   42  104:astore_3        
					linkedlist.add(((Object) (pojopropertybuilder1.withName(propertyname))));
	//   43  105:aload_3         
	//   44  106:aload           5
	//   45  108:aload           6
	//   46  110:invokevirtual   #493 <Method POJOPropertyBuilder POJOPropertyBuilder.withName(PropertyName)>
	//   47  113:invokevirtual   #224 <Method boolean LinkedList.add(Object)>
	//   48  116:pop             
					iterator.remove();
	//   49  117:aload           4
	//   50  119:invokeinterface #454 <Method void Iterator.remove()>
					obj = ((Object) (linkedlist));
	//   51  124:aload_3         
	//   52  125:astore_2        
				}
			}
		} while(true);
	//   53  126:goto            15
		if(obj != null)
	//*  54  129:aload_2         
	//*  55  130:ifnull          203
			for(obj = ((Object) (((LinkedList) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  56  133:aload_2         
	//*  57  134:invokevirtual   #502 <Method Iterator LinkedList.iterator()>
	//*  58  137:astore_2        
	//*  59  138:aload_2         
	//*  60  139:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//*  61  144:ifeq            203
			{
				POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (obj)).next();
	//   62  147:aload_2         
	//   63  148:invokeinterface #251 <Method Object Iterator.next()>
	//   64  153:checkcast       #215 <Class POJOPropertyBuilder>
	//   65  156:astore_3        
				String s = pojopropertybuilder.getName();
	//   66  157:aload_3         
	//   67  158:invokevirtual   #461 <Method String POJOPropertyBuilder.getName()>
	//   68  161:astore          4
				POJOPropertyBuilder pojopropertybuilder2 = (POJOPropertyBuilder)map.get(((Object) (s)));
	//   69  163:aload_1         
	//   70  164:aload           4
	//   71  166:invokeinterface #427 <Method Object Map.get(Object)>
	//   72  171:checkcast       #215 <Class POJOPropertyBuilder>
	//   73  174:astore          5
				if(pojopropertybuilder2 == null)
	//*  74  176:aload           5
	//*  75  178:ifnonnull       194
					map.put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//   76  181:aload_1         
	//   77  182:aload           4
	//   78  184:aload_3         
	//   79  185:invokeinterface #431 <Method Object Map.put(Object, Object)>
	//   80  190:pop             
				else
	//*  81  191:goto            138
					pojopropertybuilder2.addAll(pojopropertybuilder);
	//   82  194:aload           5
	//   83  196:aload_3         
	//   84  197:invokevirtual   #509 <Method void POJOPropertyBuilder.addAll(POJOPropertyBuilder)>
			}

	//*  85  200:goto            138
	//   86  203:return          
	}

	protected void _sortProperties(Map map)
	{
		boolean flag;
		Object obj;
		LinkedHashMap linkedhashmap;
label0:
		{
			Object obj1 = ((Object) (_annotationIntrospector));
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore          6
			if(obj1 == null)
	//*   3    6:aload           6
	//*   4    8:ifnonnull       54
				obj = null;
	//    5   11:aconst_null     
	//    6   12:astore          5
			else
	//*   7   14:aload           5
	//*   8   16:ifnonnull       68
	//*   9   19:aload_0         
	//*  10   20:getfield        #45  <Field MapperConfig _config>
	//*  11   23:invokevirtual   #599 <Method boolean MapperConfig.shouldSortPropertiesAlphabetically()>
	//*  12   26:istore          4
	//*  13   28:aload           6
	//*  14   30:ifnonnull       78
	//*  15   33:aconst_null     
	//*  16   34:astore          6
	//*  17   36:iload           4
	//*  18   38:ifne            92
	//*  19   41:aload_0         
	//*  20   42:getfield        #221 <Field LinkedList _creatorProperties>
	//*  21   45:ifnonnull       92
	//*  22   48:aload           6
	//*  23   50:ifnonnull       92
	//*  24   53:return          
				obj = ((Object) (((AnnotationIntrospector) (obj1)).findSerializationSortAlphabetically(((Annotated) (_classDef)))));
	//   25   54:aload           6
	//   26   56:aload_0         
	//   27   57:getfield        #65  <Field AnnotatedClass _classDef>
	//   28   60:invokevirtual   #603 <Method Boolean AnnotationIntrospector.findSerializationSortAlphabetically(Annotated)>
	//   29   63:astore          5
			if(obj == null)
				flag = _config.shouldSortPropertiesAlphabetically();
			else
	//*  30   65:goto            14
				flag = ((Boolean) (obj)).booleanValue();
	//   31   68:aload           5
	//   32   70:invokevirtual   #608 <Method boolean Boolean.booleanValue()>
	//   33   73:istore          4
			if(obj1 == null)
				obj1 = null;
			else
	//*  34   75:goto            28
				obj1 = ((Object) (((AnnotationIntrospector) (obj1)).findSerializationPropertyOrder(_classDef)));
	//   35   78:aload           6
	//   36   80:aload_0         
	//   37   81:getfield        #65  <Field AnnotatedClass _classDef>
	//   38   84:invokevirtual   #612 <Method String[] AnnotationIntrospector.findSerializationPropertyOrder(AnnotatedClass)>
	//   39   87:astore          6
			if(!flag && _creatorProperties == null && obj1 == null)
				return;
	//*  40   89:goto            36
			int i = map.size();
	//   41   92:aload_1         
	//   42   93:invokeinterface #512 <Method int Map.size()>
	//   43   98:istore_2        
			Iterator iterator;
			POJOPropertyBuilder pojopropertybuilder1;
			if(flag)
	//*  44   99:iload           4
	//*  45  101:ifeq            166
				obj = ((Object) (new TreeMap()));
	//   46  104:new             #614 <Class TreeMap>
	//   47  107:dup             
	//   48  108:invokespecial   #615 <Method void TreeMap()>
	//   49  111:astore          5
			else
	//*  50  113:aload_1         
	//*  51  114:invokeinterface #440 <Method Collection Map.values()>
	//*  52  119:invokeinterface #443 <Method Iterator Collection.iterator()>
	//*  53  124:astore          7
	//*  54  126:aload           7
	//*  55  128:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//*  56  133:ifeq            181
	//*  57  136:aload           7
	//*  58  138:invokeinterface #251 <Method Object Iterator.next()>
	//*  59  143:checkcast       #215 <Class POJOPropertyBuilder>
	//*  60  146:astore          8
	//*  61  148:aload           5
	//*  62  150:aload           8
	//*  63  152:invokevirtual   #461 <Method String POJOPropertyBuilder.getName()>
	//*  64  155:aload           8
	//*  65  157:invokeinterface #431 <Method Object Map.put(Object, Object)>
	//*  66  162:pop             
	//*  67  163:goto            126
				obj = ((Object) (new LinkedHashMap(i + i)));
	//   68  166:new             #397 <Class LinkedHashMap>
	//   69  169:dup             
	//   70  170:iload_2         
	//   71  171:iload_2         
	//   72  172:iadd            
	//   73  173:invokespecial   #618 <Method void LinkedHashMap(int)>
	//   74  176:astore          5
			for(iterator = map.values().iterator(); iterator.hasNext(); ((Map) (obj)).put(((Object) (pojopropertybuilder1.getName())), ((Object) (pojopropertybuilder1))))
				pojopropertybuilder1 = (POJOPropertyBuilder)iterator.next();

	//*  75  178:goto            113
			linkedhashmap = new LinkedHashMap(i + i);
	//   76  181:new             #397 <Class LinkedHashMap>
	//   77  184:dup             
	//   78  185:iload_2         
	//   79  186:iload_2         
	//   80  187:iadd            
	//   81  188:invokespecial   #618 <Method void LinkedHashMap(int)>
	//   82  191:astore          11
			if(obj1 == null)
				break label0;
	//   83  193:aload           6
	//   84  195:ifnull          333
			int k = obj1.length;
	//   85  198:aload           6
	//   86  200:arraylength     
	//   87  201:istore_3        
			for(int j = 0; j < k; j++)
	//*  88  202:iconst_0        
	//*  89  203:istore_2        
	//*  90  204:iload_2         
	//*  91  205:iload_3         
	//*  92  206:icmpge          333
			{
				Object obj3;
				Object obj4;
label1:
				{
					String s = ((String) (obj1[j]));
	//   93  209:aload           6
	//   94  211:iload_2         
	//   95  212:aaload          
	//   96  213:astore          9
					POJOPropertyBuilder pojopropertybuilder3 = (POJOPropertyBuilder)((Map) (obj)).get(((Object) (s)));
	//   97  215:aload           5
	//   98  217:aload           9
	//   99  219:invokeinterface #427 <Method Object Map.get(Object)>
	//  100  224:checkcast       #215 <Class POJOPropertyBuilder>
	//  101  227:astore          10
					obj4 = ((Object) (s));
	//  102  229:aload           9
	//  103  231:astore          8
					obj3 = ((Object) (pojopropertybuilder3));
	//  104  233:aload           10
	//  105  235:astore          7
					if(pojopropertybuilder3 != null)
						break label1;
	//  106  237:aload           10
	//  107  239:ifnonnull       309
					Iterator iterator2 = map.values().iterator();
	//  108  242:aload_1         
	//  109  243:invokeinterface #440 <Method Collection Map.values()>
	//  110  248:invokeinterface #443 <Method Iterator Collection.iterator()>
	//  111  253:astore          12
					do
					{
						obj4 = ((Object) (s));
	//  112  255:aload           9
	//  113  257:astore          8
						obj3 = ((Object) (pojopropertybuilder3));
	//  114  259:aload           10
	//  115  261:astore          7
						if(!iterator2.hasNext())
							break label1;
	//  116  263:aload           12
	//  117  265:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//  118  270:ifeq            309
						obj4 = ((Object) ((POJOPropertyBuilder)iterator2.next()));
	//  119  273:aload           12
	//  120  275:invokeinterface #251 <Method Object Iterator.next()>
	//  121  280:checkcast       #215 <Class POJOPropertyBuilder>
	//  122  283:astore          8
					} while(!s.equals(((Object) (((POJOPropertyBuilder) (obj4)).getInternalName()))));
	//  123  285:aload           9
	//  124  287:aload           8
	//  125  289:invokevirtual   #621 <Method String POJOPropertyBuilder.getInternalName()>
	//  126  292:invokevirtual   #622 <Method boolean String.equals(Object)>
	//  127  295:ifeq            255
					obj3 = obj4;
	//  128  298:aload           8
	//  129  300:astore          7
					obj4 = ((Object) (((POJOPropertyBuilder) (obj4)).getName()));
	//  130  302:aload           8
	//  131  304:invokevirtual   #461 <Method String POJOPropertyBuilder.getName()>
	//  132  307:astore          8
				}
				if(obj3 != null)
	//* 133  309:aload           7
	//* 134  311:ifnull          326
					((Map) (linkedhashmap)).put(obj4, obj3);
	//  135  314:aload           11
	//  136  316:aload           8
	//  137  318:aload           7
	//  138  320:invokeinterface #431 <Method Object Map.put(Object, Object)>
	//  139  325:pop             
			}

	//  140  326:iload_2         
	//  141  327:iconst_1        
	//  142  328:iadd            
	//  143  329:istore_2        
		}
	//* 144  330:goto            204
		if(_creatorProperties != null)
	//* 145  333:aload_0         
	//* 146  334:getfield        #221 <Field LinkedList _creatorProperties>
	//* 147  337:ifnull          466
		{
			Object obj2;
			POJOPropertyBuilder pojopropertybuilder;
			if(flag)
	//* 148  340:iload           4
	//* 149  342:ifeq            457
			{
				obj2 = ((Object) (new TreeMap()));
	//  150  345:new             #614 <Class TreeMap>
	//  151  348:dup             
	//  152  349:invokespecial   #615 <Method void TreeMap()>
	//  153  352:astore          6
				POJOPropertyBuilder pojopropertybuilder2;
				for(Iterator iterator1 = _creatorProperties.iterator(); iterator1.hasNext(); ((TreeMap) (obj2)).put(((Object) (pojopropertybuilder2.getName())), ((Object) (pojopropertybuilder2))))
	//* 154  354:aload_0         
	//* 155  355:getfield        #221 <Field LinkedList _creatorProperties>
	//* 156  358:invokevirtual   #502 <Method Iterator LinkedList.iterator()>
	//* 157  361:astore          7
	//* 158  363:aload           7
	//* 159  365:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//* 160  370:ifeq            401
					pojopropertybuilder2 = (POJOPropertyBuilder)iterator1.next();
	//  161  373:aload           7
	//  162  375:invokeinterface #251 <Method Object Iterator.next()>
	//  163  380:checkcast       #215 <Class POJOPropertyBuilder>
	//  164  383:astore          8

	//  165  385:aload           6
	//  166  387:aload           8
	//  167  389:invokevirtual   #461 <Method String POJOPropertyBuilder.getName()>
	//  168  392:aload           8
	//  169  394:invokevirtual   #623 <Method Object TreeMap.put(Object, Object)>
	//  170  397:pop             
	//* 171  398:goto            363
				obj2 = ((Object) (((TreeMap) (obj2)).values()));
	//  172  401:aload           6
	//  173  403:invokevirtual   #624 <Method Collection TreeMap.values()>
	//  174  406:astore          6
			} else
	//* 175  408:aload           6
	//* 176  410:invokeinterface #443 <Method Iterator Collection.iterator()>
	//* 177  415:astore          6
	//* 178  417:aload           6
	//* 179  419:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//* 180  424:ifeq            466
	//* 181  427:aload           6
	//* 182  429:invokeinterface #251 <Method Object Iterator.next()>
	//* 183  434:checkcast       #215 <Class POJOPropertyBuilder>
	//* 184  437:astore          7
	//* 185  439:aload           11
	//* 186  441:aload           7
	//* 187  443:invokevirtual   #461 <Method String POJOPropertyBuilder.getName()>
	//* 188  446:aload           7
	//* 189  448:invokeinterface #431 <Method Object Map.put(Object, Object)>
	//* 190  453:pop             
	//* 191  454:goto            417
			{
				obj2 = ((Object) (_creatorProperties));
	//  192  457:aload_0         
	//  193  458:getfield        #221 <Field LinkedList _creatorProperties>
	//  194  461:astore          6
			}
			for(obj2 = ((Object) (((Collection) (obj2)).iterator())); ((Iterator) (obj2)).hasNext(); ((Map) (linkedhashmap)).put(((Object) (pojopropertybuilder.getName())), ((Object) (pojopropertybuilder))))
				pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (obj2)).next();

		}
	//* 195  463:goto            408
		((Map) (linkedhashmap)).putAll(((Map) (obj)));
	//  196  466:aload           11
	//  197  468:aload           5
	//  198  470:invokeinterface #627 <Method void Map.putAll(Map)>
		map.clear();
	//  199  475:aload_1         
	//  200  476:invokeinterface #521 <Method void Map.clear()>
		map.putAll(((Map) (linkedhashmap)));
	//  201  481:aload_1         
	//  202  482:aload           11
	//  203  484:invokeinterface #627 <Method void Map.putAll(Map)>
	//  204  489:return          
	}

	protected void _updateCreatorProperty(POJOPropertyBuilder pojopropertybuilder, List list)
	{
		if(list == null) goto _L2; else goto _L1
	//    0    0:aload_2         
	//    1    1:ifnull          52
_L1:
		int i;
		int j;
		i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_3        
		j = list.size();
	//    4    6:aload_2         
	//    5    7:invokeinterface #628 <Method int List.size()>
	//    6   12:istore          4
_L7:
		if(i >= j) goto _L2; else goto _L3
	//    7   14:iload_3         
	//    8   15:iload           4
	//    9   17:icmpge          52
_L3:
		if(!((POJOPropertyBuilder)list.get(i)).getInternalName().equals(((Object) (pojopropertybuilder.getInternalName())))) goto _L5; else goto _L4
	//   10   20:aload_2         
	//   11   21:iload_3         
	//   12   22:invokeinterface #631 <Method Object List.get(int)>
	//   13   27:checkcast       #215 <Class POJOPropertyBuilder>
	//   14   30:invokevirtual   #621 <Method String POJOPropertyBuilder.getInternalName()>
	//   15   33:aload_1         
	//   16   34:invokevirtual   #621 <Method String POJOPropertyBuilder.getInternalName()>
	//   17   37:invokevirtual   #622 <Method boolean String.equals(Object)>
	//   18   40:ifeq            53
_L4:
		list.set(i, ((Object) (pojopropertybuilder)));
	//   19   43:aload_2         
	//   20   44:iload_3         
	//   21   45:aload_1         
	//   22   46:invokeinterface #634 <Method Object List.set(int, Object)>
	//   23   51:pop             
_L2:
		return;
	//   24   52:return          
_L5:
		i++;
	//   25   53:iload_3         
	//   26   54:iconst_1        
	//   27   55:iadd            
	//   28   56:istore_3        
		if(true) goto _L7; else goto _L6
	//   29   57:goto            14
_L6:
	}

	public POJOPropertiesCollector collect()
	{
		return this;
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	protected void collectAll()
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #397 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #398 <Method void LinkedHashMap()>
	//    3    7:astore_1        
		_addFields(((Map) (linkedhashmap)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #642 <Method void _addFields(Map)>
		_addMethods(((Map) (linkedhashmap)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #644 <Method void _addMethods(Map)>
		_addCreators(((Map) (linkedhashmap)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #646 <Method void _addCreators(Map)>
		_addInjectables(((Map) (linkedhashmap)));
	//   13   23:aload_0         
	//   14   24:aload_1         
	//   15   25:invokevirtual   #648 <Method void _addInjectables(Map)>
		_removeUnwantedProperties(((Map) (linkedhashmap)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:invokevirtual   #650 <Method void _removeUnwantedProperties(Map)>
		for(Iterator iterator = linkedhashmap.values().iterator(); iterator.hasNext(); ((POJOPropertyBuilder)iterator.next()).mergeAnnotations(_forSerialization));
	//   19   33:aload_1         
	//   20   34:invokevirtual   #651 <Method Collection LinkedHashMap.values()>
	//   21   37:invokeinterface #443 <Method Iterator Collection.iterator()>
	//   22   42:astore_2        
	//   23   43:aload_2         
	//   24   44:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//   25   49:ifeq            71
	//   26   52:aload_2         
	//   27   53:invokeinterface #251 <Method Object Iterator.next()>
	//   28   58:checkcast       #215 <Class POJOPropertyBuilder>
	//   29   61:aload_0         
	//   30   62:getfield        #61  <Field boolean _forSerialization>
	//   31   65:invokevirtual   #654 <Method void POJOPropertyBuilder.mergeAnnotations(boolean)>
	//*  32   68:goto            43
		_removeUnwantedAccessor(((Map) (linkedhashmap)));
	//   33   71:aload_0         
	//   34   72:aload_1         
	//   35   73:invokevirtual   #656 <Method void _removeUnwantedAccessor(Map)>
		_renameProperties(((Map) (linkedhashmap)));
	//   36   76:aload_0         
	//   37   77:aload_1         
	//   38   78:invokevirtual   #658 <Method void _renameProperties(Map)>
		PropertyNamingStrategy propertynamingstrategy = _findNamingStrategy();
	//   39   81:aload_0         
	//   40   82:invokespecial   #660 <Method PropertyNamingStrategy _findNamingStrategy()>
	//   41   85:astore_2        
		if(propertynamingstrategy != null)
	//*  42   86:aload_2         
	//*  43   87:ifnull          96
			_renameUsing(((Map) (linkedhashmap)), propertynamingstrategy);
	//   44   90:aload_0         
	//   45   91:aload_1         
	//   46   92:aload_2         
	//   47   93:invokevirtual   #662 <Method void _renameUsing(Map, PropertyNamingStrategy)>
		for(Iterator iterator1 = linkedhashmap.values().iterator(); iterator1.hasNext(); ((POJOPropertyBuilder)iterator1.next()).trimByVisibility());
	//   48   96:aload_1         
	//   49   97:invokevirtual   #651 <Method Collection LinkedHashMap.values()>
	//   50  100:invokeinterface #443 <Method Iterator Collection.iterator()>
	//   51  105:astore_2        
	//   52  106:aload_2         
	//   53  107:invokeinterface #247 <Method boolean Iterator.hasNext()>
	//   54  112:ifeq            130
	//   55  115:aload_2         
	//   56  116:invokeinterface #251 <Method Object Iterator.next()>
	//   57  121:checkcast       #215 <Class POJOPropertyBuilder>
	//   58  124:invokevirtual   #665 <Method void POJOPropertyBuilder.trimByVisibility()>
	//*  59  127:goto            106
		if(_config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME))
	//*  60  130:aload_0         
	//*  61  131:getfield        #45  <Field MapperConfig _config>
	//*  62  134:getstatic       #668 <Field MapperFeature MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME>
	//*  63  137:invokevirtual   #57  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//*  64  140:ifeq            148
			_renameWithWrappers(((Map) (linkedhashmap)));
	//   65  143:aload_0         
	//   66  144:aload_1         
	//   67  145:invokevirtual   #670 <Method void _renameWithWrappers(Map)>
		_sortProperties(((Map) (linkedhashmap)));
	//   68  148:aload_0         
	//   69  149:aload_1         
	//   70  150:invokevirtual   #672 <Method void _sortProperties(Map)>
		_properties = linkedhashmap;
	//   71  153:aload_0         
	//   72  154:aload_1         
	//   73  155:putfield        #674 <Field LinkedHashMap _properties>
		_collected = true;
	//   74  158:aload_0         
	//   75  159:iconst_1        
	//   76  160:putfield        #676 <Field boolean _collected>
	//   77  163:return          
	}

	public Class findPOJOBuilderClass()
	{
		return _annotationIntrospector.findPOJOBuilder(_classDef);
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:aload_0         
	//    3    5:getfield        #65  <Field AnnotatedClass _classDef>
	//    4    8:invokevirtual   #681 <Method Class AnnotationIntrospector.findPOJOBuilder(AnnotatedClass)>
	//    5   11:areturn         
	}

	public AnnotationIntrospector getAnnotationIntrospector()
	{
		return _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:areturn         
	}

	public AnnotatedMember getAnyGetter()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #676 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #685 <Method void collectAll()>
		if(_anyGetters != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #331 <Field LinkedList _anyGetters>
	//*   7   15:ifnull          94
		{
			if(_anyGetters.size() > 1)
	//*   8   18:aload_0         
	//*   9   19:getfield        #331 <Field LinkedList _anyGetters>
	//*  10   22:invokevirtual   #686 <Method int LinkedList.size()>
	//*  11   25:iconst_1        
	//*  12   26:icmple          83
				reportProblem((new StringBuilder()).append("Multiple 'any-getters' defined (").append(_anyGetters.get(0)).append(" vs ").append(_anyGetters.get(1)).append(")").toString());
	//   13   29:aload_0         
	//   14   30:new             #122 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #123 <Method void StringBuilder()>
	//   17   37:ldc2            #688 <String "Multiple 'any-getters' defined (">
	//   18   40:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:aload_0         
	//   20   44:getfield        #331 <Field LinkedList _anyGetters>
	//   21   47:iconst_0        
	//   22   48:invokevirtual   #689 <Method Object LinkedList.get(int)>
	//   23   51:invokevirtual   #692 <Method StringBuilder StringBuilder.append(Object)>
	//   24   54:ldc2            #694 <String " vs ">
	//   25   57:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload_0         
	//   27   61:getfield        #331 <Field LinkedList _anyGetters>
	//   28   64:iconst_1        
	//   29   65:invokevirtual   #689 <Method Object LinkedList.get(int)>
	//   30   68:invokevirtual   #692 <Method StringBuilder StringBuilder.append(Object)>
	//   31   71:ldc2            #416 <String ")">
	//   32   74:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   33   77:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   34   80:invokevirtual   #697 <Method void reportProblem(String)>
			return (AnnotatedMember)_anyGetters.getFirst();
	//   35   83:aload_0         
	//   36   84:getfield        #331 <Field LinkedList _anyGetters>
	//   37   87:invokevirtual   #700 <Method Object LinkedList.getFirst()>
	//   38   90:checkcast       #404 <Class AnnotatedMember>
	//   39   93:areturn         
		} else
		{
			return null;
	//   40   94:aconst_null     
	//   41   95:areturn         
		}
	}

	public AnnotatedMethod getAnySetterMethod()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #676 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #685 <Method void collectAll()>
		if(_anySetters != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #384 <Field LinkedList _anySetters>
	//*   7   15:ifnull          94
		{
			if(_anySetters.size() > 1)
	//*   8   18:aload_0         
	//*   9   19:getfield        #384 <Field LinkedList _anySetters>
	//*  10   22:invokevirtual   #686 <Method int LinkedList.size()>
	//*  11   25:iconst_1        
	//*  12   26:icmple          83
				reportProblem((new StringBuilder()).append("Multiple 'any-setters' defined (").append(_anySetters.get(0)).append(" vs ").append(_anySetters.get(1)).append(")").toString());
	//   13   29:aload_0         
	//   14   30:new             #122 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #123 <Method void StringBuilder()>
	//   17   37:ldc2            #703 <String "Multiple 'any-setters' defined (">
	//   18   40:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:aload_0         
	//   20   44:getfield        #384 <Field LinkedList _anySetters>
	//   21   47:iconst_0        
	//   22   48:invokevirtual   #689 <Method Object LinkedList.get(int)>
	//   23   51:invokevirtual   #692 <Method StringBuilder StringBuilder.append(Object)>
	//   24   54:ldc2            #694 <String " vs ">
	//   25   57:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload_0         
	//   27   61:getfield        #384 <Field LinkedList _anySetters>
	//   28   64:iconst_1        
	//   29   65:invokevirtual   #689 <Method Object LinkedList.get(int)>
	//   30   68:invokevirtual   #692 <Method StringBuilder StringBuilder.append(Object)>
	//   31   71:ldc2            #416 <String ")">
	//   32   74:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   33   77:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   34   80:invokevirtual   #697 <Method void reportProblem(String)>
			return (AnnotatedMethod)_anySetters.getFirst();
	//   35   83:aload_0         
	//   36   84:getfield        #384 <Field LinkedList _anySetters>
	//   37   87:invokevirtual   #700 <Method Object LinkedList.getFirst()>
	//   38   90:checkcast       #269 <Class AnnotatedMethod>
	//   39   93:areturn         
		} else
		{
			return null;
	//   40   94:aconst_null     
	//   41   95:areturn         
		}
	}

	public AnnotatedClass getClassDef()
	{
		return _classDef;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field AnnotatedClass _classDef>
	//    2    4:areturn         
	}

	public MapperConfig getConfig()
	{
		return _config;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field MapperConfig _config>
	//    2    4:areturn         
	}

	public Set getIgnoredPropertyNames()
	{
		return ((Set) (_ignoredPropertyNames));
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field HashSet _ignoredPropertyNames>
	//    2    4:areturn         
	}

	public Map getInjectables()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #676 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #685 <Method void collectAll()>
		return ((Map) (_injectables));
	//    5   11:aload_0         
	//    6   12:getfield        #395 <Field LinkedHashMap _injectables>
	//    7   15:areturn         
	}

	public AnnotatedMethod getJsonValueMethod()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #676 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #685 <Method void collectAll()>
		if(_jsonValueGetters != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #336 <Field LinkedList _jsonValueGetters>
	//*   7   15:ifnull          95
		{
			if(_jsonValueGetters.size() > 1)
	//*   8   18:aload_0         
	//*   9   19:getfield        #336 <Field LinkedList _jsonValueGetters>
	//*  10   22:invokevirtual   #686 <Method int LinkedList.size()>
	//*  11   25:iconst_1        
	//*  12   26:icmple          83
				reportProblem((new StringBuilder()).append("Multiple value properties defined (").append(_jsonValueGetters.get(0)).append(" vs ").append(_jsonValueGetters.get(1)).append(")").toString());
	//   13   29:aload_0         
	//   14   30:new             #122 <Class StringBuilder>
	//   15   33:dup             
	//   16   34:invokespecial   #123 <Method void StringBuilder()>
	//   17   37:ldc2            #716 <String "Multiple value properties defined (">
	//   18   40:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   19   43:aload_0         
	//   20   44:getfield        #336 <Field LinkedList _jsonValueGetters>
	//   21   47:iconst_0        
	//   22   48:invokevirtual   #689 <Method Object LinkedList.get(int)>
	//   23   51:invokevirtual   #692 <Method StringBuilder StringBuilder.append(Object)>
	//   24   54:ldc2            #694 <String " vs ">
	//   25   57:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload_0         
	//   27   61:getfield        #336 <Field LinkedList _jsonValueGetters>
	//   28   64:iconst_1        
	//   29   65:invokevirtual   #689 <Method Object LinkedList.get(int)>
	//   30   68:invokevirtual   #692 <Method StringBuilder StringBuilder.append(Object)>
	//   31   71:ldc2            #416 <String ")">
	//   32   74:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   33   77:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   34   80:invokevirtual   #697 <Method void reportProblem(String)>
			return (AnnotatedMethod)_jsonValueGetters.get(0);
	//   35   83:aload_0         
	//   36   84:getfield        #336 <Field LinkedList _jsonValueGetters>
	//   37   87:iconst_0        
	//   38   88:invokevirtual   #689 <Method Object LinkedList.get(int)>
	//   39   91:checkcast       #269 <Class AnnotatedMethod>
	//   40   94:areturn         
		} else
		{
			return null;
	//   41   95:aconst_null     
	//   42   96:areturn         
		}
	}

	public ObjectIdInfo getObjectIdInfo()
	{
		ObjectIdInfo objectidinfo;
		if(_annotationIntrospector == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//*   2    4:ifnonnull       11
		{
			objectidinfo = null;
	//    3    7:aconst_null     
	//    4    8:astore_1        
		} else
	//*   5    9:aload_1         
	//*   6   10:areturn         
		{
			ObjectIdInfo objectidinfo1 = _annotationIntrospector.findObjectIdInfo(((Annotated) (_classDef)));
	//    7   11:aload_0         
	//    8   12:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//    9   15:aload_0         
	//   10   16:getfield        #65  <Field AnnotatedClass _classDef>
	//   11   19:invokevirtual   #722 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(Annotated)>
	//   12   22:astore_2        
			objectidinfo = objectidinfo1;
	//   13   23:aload_2         
	//   14   24:astore_1        
			if(objectidinfo1 != null)
	//*  15   25:aload_2         
	//*  16   26:ifnull          9
				return _annotationIntrospector.findObjectReferenceInfo(((Annotated) (_classDef)), objectidinfo1);
	//   17   29:aload_0         
	//   18   30:getfield        #79  <Field AnnotationIntrospector _annotationIntrospector>
	//   19   33:aload_0         
	//   20   34:getfield        #65  <Field AnnotatedClass _classDef>
	//   21   37:aload_2         
	//   22   38:invokevirtual   #726 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(Annotated, ObjectIdInfo)>
	//   23   41:areturn         
		}
		return objectidinfo;
	}

	public List getProperties()
	{
		return ((List) (new ArrayList(getPropertyMap().values())));
	//    0    0:new             #729 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #732 <Method Map getPropertyMap()>
	//    4    8:invokeinterface #440 <Method Collection Map.values()>
	//    5   13:invokespecial   #735 <Method void ArrayList(Collection)>
	//    6   16:areturn         
	}

	protected Map getPropertyMap()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #676 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #685 <Method void collectAll()>
		return ((Map) (_properties));
	//    5   11:aload_0         
	//    6   12:getfield        #674 <Field LinkedHashMap _properties>
	//    7   15:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field JavaType _type>
	//    2    4:areturn         
	}

	protected void reportProblem(String s)
	{
		throw new IllegalArgumentException((new StringBuilder()).append("Problem with definition of ").append(((Object) (_classDef))).append(": ").append(s).toString());
	//    0    0:new             #406 <Class IllegalArgumentException>
	//    1    3:dup             
	//    2    4:new             #122 <Class StringBuilder>
	//    3    7:dup             
	//    4    8:invokespecial   #123 <Method void StringBuilder()>
	//    5   11:ldc2            #741 <String "Problem with definition of ">
	//    6   14:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//    7   17:aload_0         
	//    8   18:getfield        #65  <Field AnnotatedClass _classDef>
	//    9   21:invokevirtual   #692 <Method StringBuilder StringBuilder.append(Object)>
	//   10   24:ldc2            #743 <String ": ">
	//   11   27:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   12   30:aload_1         
	//   13   31:invokevirtual   #129 <Method StringBuilder StringBuilder.append(String)>
	//   14   34:invokevirtual   #142 <Method String StringBuilder.toString()>
	//   15   37:invokespecial   #417 <Method void IllegalArgumentException(String)>
	//   16   40:athrow          
	}

	protected final AnnotationIntrospector _annotationIntrospector;
	protected LinkedList _anyGetters;
	protected LinkedList _anySetters;
	protected final AnnotatedClass _classDef;
	protected boolean _collected;
	protected final MapperConfig _config;
	protected LinkedList _creatorProperties;
	protected final boolean _forSerialization;
	protected HashSet _ignoredPropertyNames;
	protected LinkedHashMap _injectables;
	protected LinkedList _jsonValueGetters;
	protected final String _mutatorPrefix;
	protected LinkedHashMap _properties;
	protected final boolean _stdBeanNaming;
	protected final JavaType _type;
	protected final VisibilityChecker _visibilityChecker;
}
