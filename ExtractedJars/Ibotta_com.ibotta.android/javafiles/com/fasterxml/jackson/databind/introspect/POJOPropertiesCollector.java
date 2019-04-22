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
	//    1    1:invokespecial   #45  <Method void Object()>
		_config = mapperconfig;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #47  <Field MapperConfig _config>
		_stdBeanNaming = mapperconfig.isEnabled(MapperFeature.USE_STD_BEAN_NAMING);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:getstatic       #53  <Field MapperFeature MapperFeature.USE_STD_BEAN_NAMING>
	//    8   14:invokevirtual   #59  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//    9   17:putfield        #61  <Field boolean _stdBeanNaming>
		_forSerialization = flag;
	//   10   20:aload_0         
	//   11   21:iload_2         
	//   12   22:putfield        #63  <Field boolean _forSerialization>
		_type = javatype;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #65  <Field JavaType _type>
		_classDef = annotatedclass;
	//   16   30:aload_0         
	//   17   31:aload           4
	//   18   33:putfield        #67  <Field AnnotatedClass _classDef>
		String s1 = s;
	//   19   36:aload           5
	//   20   38:astore          6
		if(s == null)
	//*  21   40:aload           5
	//*  22   42:ifnonnull       49
			s1 = "set";
	//   23   45:ldc1            #69  <String "set">
	//   24   47:astore          6
		_mutatorPrefix = s1;
	//   25   49:aload_0         
	//   26   50:aload           6
	//   27   52:putfield        #71  <Field String _mutatorPrefix>
		if(mapperconfig.isAnnotationProcessingEnabled())
	//*  28   55:aload_1         
	//*  29   56:invokevirtual   #75  <Method boolean MapperConfig.isAnnotationProcessingEnabled()>
	//*  30   59:ifeq            81
		{
			_useAnnotations = true;
	//   31   62:aload_0         
	//   32   63:iconst_1        
	//   33   64:putfield        #77  <Field boolean _useAnnotations>
			_annotationIntrospector = _config.getAnnotationIntrospector();
	//   34   67:aload_0         
	//   35   68:aload_0         
	//   36   69:getfield        #47  <Field MapperConfig _config>
	//   37   72:invokevirtual   #81  <Method AnnotationIntrospector MapperConfig.getAnnotationIntrospector()>
	//   38   75:putfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
		} else
	//*  39   78:goto            93
		{
			_useAnnotations = false;
	//   40   81:aload_0         
	//   41   82:iconst_0        
	//   42   83:putfield        #77  <Field boolean _useAnnotations>
			_annotationIntrospector = AnnotationIntrospector.nopInstance();
	//   43   86:aload_0         
	//   44   87:invokestatic    #88  <Method AnnotationIntrospector AnnotationIntrospector.nopInstance()>
	//   45   90:putfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
		}
		_visibilityChecker = _config.getDefaultVisibilityChecker(javatype.getRawClass(), annotatedclass);
	//   46   93:aload_0         
	//   47   94:aload_0         
	//   48   95:getfield        #47  <Field MapperConfig _config>
	//   49   98:aload_3         
	//   50   99:invokevirtual   #94  <Method Class JavaType.getRawClass()>
	//   51  102:aload           4
	//   52  104:invokevirtual   #98  <Method VisibilityChecker MapperConfig.getDefaultVisibilityChecker(Class, AnnotatedClass)>
	//   53  107:putfield        #100 <Field VisibilityChecker _visibilityChecker>
	//   54  110:return          
	}

	private void _collectIgnorals(String s)
	{
		if(!_forSerialization)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field boolean _forSerialization>
	//*   2    4:ifne            34
		{
			if(_ignoredPropertyNames == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #107 <Field HashSet _ignoredPropertyNames>
	//*   5   11:ifnonnull       25
				_ignoredPropertyNames = new HashSet();
	//    6   14:aload_0         
	//    7   15:new             #109 <Class HashSet>
	//    8   18:dup             
	//    9   19:invokespecial   #110 <Method void HashSet()>
	//   10   22:putfield        #107 <Field HashSet _ignoredPropertyNames>
			_ignoredPropertyNames.add(((Object) (s)));
	//   11   25:aload_0         
	//   12   26:getfield        #107 <Field HashSet _ignoredPropertyNames>
	//   13   29:aload_1         
	//   14   30:invokevirtual   #114 <Method boolean HashSet.add(Object)>
	//   15   33:pop             
		}
	//   16   34:return          
	}

	private PropertyNamingStrategy _findNamingStrategy()
	{
		Object obj = _annotationIntrospector.findNamingStrategy(_classDef);
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field AnnotatedClass _classDef>
	//    4    8:invokevirtual   #120 <Method Object AnnotationIntrospector.findNamingStrategy(AnnotatedClass)>
	//    5   11:astore_1        
		if(obj == null)
	//*   6   12:aload_1         
	//*   7   13:ifnonnull       24
			return _config.getPropertyNamingStrategy();
	//    8   16:aload_0         
	//    9   17:getfield        #47  <Field MapperConfig _config>
	//   10   20:invokevirtual   #123 <Method PropertyNamingStrategy MapperConfig.getPropertyNamingStrategy()>
	//   11   23:areturn         
		if(obj instanceof PropertyNamingStrategy)
	//*  12   24:aload_1         
	//*  13   25:instanceof      #125 <Class PropertyNamingStrategy>
	//*  14   28:ifeq            36
			return (PropertyNamingStrategy)obj;
	//   15   31:aload_1         
	//   16   32:checkcast       #125 <Class PropertyNamingStrategy>
	//   17   35:areturn         
		if(obj instanceof Class)
	//*  18   36:aload_1         
	//*  19   37:instanceof      #127 <Class Class>
	//*  20   40:ifeq            155
		{
			obj = ((Object) ((Class)obj));
	//   21   43:aload_1         
	//   22   44:checkcast       #127 <Class Class>
	//   23   47:astore_1        
			if(obj == com/fasterxml/jackson/databind/PropertyNamingStrategy)
	//*  24   48:aload_1         
	//*  25   49:ldc1            #125 <Class PropertyNamingStrategy>
	//*  26   51:if_acmpne       56
				return null;
	//   27   54:aconst_null     
	//   28   55:areturn         
			if(((Class) (com/fasterxml/jackson/databind/PropertyNamingStrategy)).isAssignableFrom(((Class) (obj))))
	//*  29   56:ldc1            #125 <Class PropertyNamingStrategy>
	//*  30   58:aload_1         
	//*  31   59:invokevirtual   #131 <Method boolean Class.isAssignableFrom(Class)>
	//*  32   62:ifeq            112
			{
				Object obj1 = ((Object) (_config.getHandlerInstantiator()));
	//   33   65:aload_0         
	//   34   66:getfield        #47  <Field MapperConfig _config>
	//   35   69:invokevirtual   #135 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//   36   72:astore_2        
				if(obj1 != null)
	//*  37   73:aload_2         
	//*  38   74:ifnull          97
				{
					obj1 = ((Object) (((HandlerInstantiator) (obj1)).namingStrategyInstance(_config, ((Annotated) (_classDef)), ((Class) (obj)))));
	//   39   77:aload_2         
	//   40   78:aload_0         
	//   41   79:getfield        #47  <Field MapperConfig _config>
	//   42   82:aload_0         
	//   43   83:getfield        #67  <Field AnnotatedClass _classDef>
	//   44   86:aload_1         
	//   45   87:invokevirtual   #141 <Method PropertyNamingStrategy HandlerInstantiator.namingStrategyInstance(MapperConfig, Annotated, Class)>
	//   46   90:astore_2        
					if(obj1 != null)
	//*  47   91:aload_2         
	//*  48   92:ifnull          97
						return ((PropertyNamingStrategy) (obj1));
	//   49   95:aload_2         
	//   50   96:areturn         
				}
				return (PropertyNamingStrategy)ClassUtil.createInstance(((Class) (obj)), _config.canOverrideAccessModifiers());
	//   51   97:aload_1         
	//   52   98:aload_0         
	//   53   99:getfield        #47  <Field MapperConfig _config>
	//   54  102:invokevirtual   #144 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   55  105:invokestatic    #150 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   56  108:checkcast       #125 <Class PropertyNamingStrategy>
	//   57  111:areturn         
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   58  112:new             #152 <Class StringBuilder>
	//   59  115:dup             
	//   60  116:invokespecial   #153 <Method void StringBuilder()>
	//   61  119:astore_2        
				stringbuilder.append("AnnotationIntrospector returned Class ");
	//   62  120:aload_2         
	//   63  121:ldc1            #155 <String "AnnotationIntrospector returned Class ">
	//   64  123:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   65  126:pop             
				stringbuilder.append(((Class) (obj)).getName());
	//   66  127:aload_2         
	//   67  128:aload_1         
	//   68  129:invokevirtual   #163 <Method String Class.getName()>
	//   69  132:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   70  135:pop             
				stringbuilder.append("; expected Class<PropertyNamingStrategy>");
	//   71  136:aload_2         
	//   72  137:ldc1            #165 <String "; expected Class<PropertyNamingStrategy>">
	//   73  139:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   74  142:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//   75  143:new             #167 <Class IllegalStateException>
	//   76  146:dup             
	//   77  147:aload_2         
	//   78  148:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   79  151:invokespecial   #172 <Method void IllegalStateException(String)>
	//   80  154:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   81  155:new             #152 <Class StringBuilder>
	//   82  158:dup             
	//   83  159:invokespecial   #153 <Method void StringBuilder()>
	//   84  162:astore_2        
			stringbuilder1.append("AnnotationIntrospector returned PropertyNamingStrategy definition of type ");
	//   85  163:aload_2         
	//   86  164:ldc1            #174 <String "AnnotationIntrospector returned PropertyNamingStrategy definition of type ">
	//   87  166:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   88  169:pop             
			stringbuilder1.append(obj.getClass().getName());
	//   89  170:aload_2         
	//   90  171:aload_1         
	//   91  172:invokevirtual   #177 <Method Class Object.getClass()>
	//   92  175:invokevirtual   #163 <Method String Class.getName()>
	//   93  178:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   94  181:pop             
			stringbuilder1.append("; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead");
	//   95  182:aload_2         
	//   96  183:ldc1            #179 <String "; expected type PropertyNamingStrategy or Class<PropertyNamingStrategy> instead">
	//   97  185:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   98  188:pop             
			throw new IllegalStateException(stringbuilder1.toString());
	//   99  189:new             #167 <Class IllegalStateException>
	//  100  192:dup             
	//  101  193:aload_2         
	//  102  194:invokevirtual   #170 <Method String StringBuilder.toString()>
	//  103  197:invokespecial   #172 <Method void IllegalStateException(String)>
	//  104  200:athrow          
		}
	}

	private PropertyName _propNameFromSimple(String s)
	{
		return PropertyName.construct(s, ((String) (null)));
	//    0    0:aload_1         
	//    1    1:aconst_null     
	//    2    2:invokestatic    #187 <Method PropertyName PropertyName.construct(String, String)>
	//    3    5:areturn         
	}

	protected void _addCreatorParam(Map map, AnnotatedParameter annotatedparameter)
	{
		Object obj = ((Object) (_annotationIntrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedparameter)))));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:aload_2         
	//    3    5:invokevirtual   #193 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//    4    8:astore          5
		String s = ((String) (obj));
	//    5   10:aload           5
	//    6   12:astore          4
		if(obj == null)
	//*   7   14:aload           5
	//*   8   16:ifnonnull       23
			s = "";
	//    9   19:ldc1            #195 <String "">
	//   10   21:astore          4
		obj = ((Object) (_annotationIntrospector.findNameForDeserialization(((Annotated) (annotatedparameter)))));
	//   11   23:aload_0         
	//   12   24:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//   13   27:aload_2         
	//   14   28:invokevirtual   #199 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   15   31:astore          5
		boolean flag;
		if(obj != null && !((PropertyName) (obj)).isEmpty())
	//*  16   33:aload           5
	//*  17   35:ifnull          51
	//*  18   38:aload           5
	//*  19   40:invokevirtual   #202 <Method boolean PropertyName.isEmpty()>
	//*  20   43:ifne            51
			flag = true;
	//   21   46:iconst_1        
	//   22   47:istore_3        
		else
	//*  23   48:goto            53
			flag = false;
	//   24   51:iconst_0        
	//   25   52:istore_3        
		if(!flag)
	//*  26   53:iload_3         
	//*  27   54:ifne            108
		{
			if(s.isEmpty())
	//*  28   57:aload           4
	//*  29   59:invokevirtual   #205 <Method boolean String.isEmpty()>
	//*  30   62:ifeq            66
				return;
	//   31   65:return          
			obj = ((Object) (_annotationIntrospector.findCreatorAnnotation(_config, ((Annotated) (annotatedparameter.getOwner())))));
	//   32   66:aload_0         
	//   33   67:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//   34   70:aload_0         
	//   35   71:getfield        #47  <Field MapperConfig _config>
	//   36   74:aload_2         
	//   37   75:invokevirtual   #211 <Method AnnotatedWithParams AnnotatedParameter.getOwner()>
	//   38   78:invokevirtual   #215 <Method com.fasterxml.jackson.annotation.JsonCreator$Mode AnnotationIntrospector.findCreatorAnnotation(MapperConfig, Annotated)>
	//   39   81:astore          5
			if(obj != null)
	//*  40   83:aload           5
	//*  41   85:ifnull          107
			{
				if(obj == com.fasterxml.jackson.annotation.JsonCreator.Mode.DISABLED)
	//*  42   88:aload           5
	//*  43   90:getstatic       #221 <Field com.fasterxml.jackson.annotation.JsonCreator$Mode com.fasterxml.jackson.annotation.JsonCreator$Mode.DISABLED>
	//*  44   93:if_acmpne       97
					return;
	//   45   96:return          
				obj = ((Object) (PropertyName.construct(s)));
	//   46   97:aload           4
	//   47   99:invokestatic    #223 <Method PropertyName PropertyName.construct(String)>
	//   48  102:astore          5
			} else
	//*  49  104:goto            108
			{
				return;
	//   50  107:return          
			}
		}
		if(flag && s.isEmpty())
	//*  51  108:iload_3         
	//*  52  109:ifeq            131
	//*  53  112:aload           4
	//*  54  114:invokevirtual   #205 <Method boolean String.isEmpty()>
	//*  55  117:ifeq            131
			map = ((Map) (_property(map, ((PropertyName) (obj)))));
	//   56  120:aload_0         
	//   57  121:aload_1         
	//   58  122:aload           5
	//   59  124:invokevirtual   #227 <Method POJOPropertyBuilder _property(Map, PropertyName)>
	//   60  127:astore_1        
		else
	//*  61  128:goto            139
			map = ((Map) (_property(map, s)));
	//   62  131:aload_0         
	//   63  132:aload_1         
	//   64  133:aload           4
	//   65  135:invokevirtual   #230 <Method POJOPropertyBuilder _property(Map, String)>
	//   66  138:astore_1        
		((POJOPropertyBuilder) (map)).addCtor(annotatedparameter, ((PropertyName) (obj)), flag, true, false);
	//   67  139:aload_1         
	//   68  140:aload_2         
	//   69  141:aload           5
	//   70  143:iload_3         
	//   71  144:iconst_1        
	//   72  145:iconst_0        
	//   73  146:invokevirtual   #236 <Method void POJOPropertyBuilder.addCtor(AnnotatedParameter, PropertyName, boolean, boolean, boolean)>
		_creatorProperties.add(((Object) (map)));
	//   74  149:aload_0         
	//   75  150:getfield        #238 <Field LinkedList _creatorProperties>
	//   76  153:aload_1         
	//   77  154:invokevirtual   #241 <Method boolean LinkedList.add(Object)>
	//   78  157:pop             
	//   79  158:return          
	}

	protected void _addCreators(Map map)
	{
		if(!_useAnnotations)
	//*   0    0:aload_0         
	//*   1    1:getfield        #77  <Field boolean _useAnnotations>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Iterator iterator = _classDef.getConstructors().iterator();
	//    4    8:aload_0         
	//    5    9:getfield        #67  <Field AnnotatedClass _classDef>
	//    6   12:invokevirtual   #250 <Method List AnnotatedClass.getConstructors()>
	//    7   15:invokeinterface #256 <Method Iterator List.iterator()>
	//    8   20:astore          5
		do
		{
			boolean flag = iterator.hasNext();
	//    9   22:aload           5
	//   10   24:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   11   29:istore          4
			int i = 0;
	//   12   31:iconst_0        
	//   13   32:istore_2        
			if(!flag)
				break;
	//   14   33:iload           4
	//   15   35:ifeq            97
			AnnotatedConstructor annotatedconstructor = (AnnotatedConstructor)iterator.next();
	//   16   38:aload           5
	//   17   40:invokeinterface #265 <Method Object Iterator.next()>
	//   18   45:checkcast       #267 <Class AnnotatedConstructor>
	//   19   48:astore          6
			if(_creatorProperties == null)
	//*  20   50:aload_0         
	//*  21   51:getfield        #238 <Field LinkedList _creatorProperties>
	//*  22   54:ifnonnull       68
				_creatorProperties = new LinkedList();
	//   23   57:aload_0         
	//   24   58:new             #240 <Class LinkedList>
	//   25   61:dup             
	//   26   62:invokespecial   #268 <Method void LinkedList()>
	//   27   65:putfield        #238 <Field LinkedList _creatorProperties>
			int k = annotatedconstructor.getParameterCount();
	//   28   68:aload           6
	//   29   70:invokevirtual   #272 <Method int AnnotatedConstructor.getParameterCount()>
	//   30   73:istore_3        
			while(i < k) 
	//*  31   74:iload_2         
	//*  32   75:iload_3         
	//*  33   76:icmpge          22
			{
				_addCreatorParam(map, annotatedconstructor.getParameter(i));
	//   34   79:aload_0         
	//   35   80:aload_1         
	//   36   81:aload           6
	//   37   83:iload_2         
	//   38   84:invokevirtual   #276 <Method AnnotatedParameter AnnotatedConstructor.getParameter(int)>
	//   39   87:invokevirtual   #278 <Method void _addCreatorParam(Map, AnnotatedParameter)>
				i++;
	//   40   90:iload_2         
	//   41   91:iconst_1        
	//   42   92:iadd            
	//   43   93:istore_2        
			}
		} while(true);
	//   44   94:goto            74
		for(Iterator iterator1 = _classDef.getFactoryMethods().iterator(); iterator1.hasNext();)
	//*  45   97:aload_0         
	//*  46   98:getfield        #67  <Field AnnotatedClass _classDef>
	//*  47  101:invokevirtual   #281 <Method List AnnotatedClass.getFactoryMethods()>
	//*  48  104:invokeinterface #256 <Method Iterator List.iterator()>
	//*  49  109:astore          5
	//*  50  111:aload           5
	//*  51  113:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  52  118:ifeq            182
		{
			AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator1.next();
	//   53  121:aload           5
	//   54  123:invokeinterface #265 <Method Object Iterator.next()>
	//   55  128:checkcast       #283 <Class AnnotatedMethod>
	//   56  131:astore          6
			if(_creatorProperties == null)
	//*  57  133:aload_0         
	//*  58  134:getfield        #238 <Field LinkedList _creatorProperties>
	//*  59  137:ifnonnull       151
				_creatorProperties = new LinkedList();
	//   60  140:aload_0         
	//   61  141:new             #240 <Class LinkedList>
	//   62  144:dup             
	//   63  145:invokespecial   #268 <Method void LinkedList()>
	//   64  148:putfield        #238 <Field LinkedList _creatorProperties>
			int l = annotatedmethod.getParameterCount();
	//   65  151:aload           6
	//   66  153:invokevirtual   #284 <Method int AnnotatedMethod.getParameterCount()>
	//   67  156:istore_3        
			int j = 0;
	//   68  157:iconst_0        
	//   69  158:istore_2        
			while(j < l) 
	//*  70  159:iload_2         
	//*  71  160:iload_3         
	//*  72  161:icmpge          111
			{
				_addCreatorParam(map, annotatedmethod.getParameter(j));
	//   73  164:aload_0         
	//   74  165:aload_1         
	//   75  166:aload           6
	//   76  168:iload_2         
	//   77  169:invokevirtual   #285 <Method AnnotatedParameter AnnotatedMethod.getParameter(int)>
	//   78  172:invokevirtual   #278 <Method void _addCreatorParam(Map, AnnotatedParameter)>
				j++;
	//   79  175:iload_2         
	//   80  176:iconst_1        
	//   81  177:iadd            
	//   82  178:istore_2        
			}
		}

	//*  83  179:goto            159
	//   84  182:return          
	}

	protected void _addFields(Map map)
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore          10
		boolean flag;
		if(!_forSerialization && !_config.isEnabled(MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS))
	//*   3    6:aload_0         
	//*   4    7:getfield        #63  <Field boolean _forSerialization>
	//*   5   10:ifne            31
	//*   6   13:aload_0         
	//*   7   14:getfield        #47  <Field MapperConfig _config>
	//*   8   17:getstatic       #290 <Field MapperFeature MapperFeature.ALLOW_FINAL_FIELDS_AS_MUTATORS>
	//*   9   20:invokevirtual   #59  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//*  10   23:ifne            31
			flag = true;
	//   11   26:iconst_1        
	//   12   27:istore_2        
		else
	//*  13   28:goto            33
			flag = false;
	//   14   31:iconst_0        
	//   15   32:istore_2        
		boolean flag5 = _config.isEnabled(MapperFeature.PROPAGATE_TRANSIENT_MARKER);
	//   16   33:aload_0         
	//   17   34:getfield        #47  <Field MapperConfig _config>
	//   18   37:getstatic       #293 <Field MapperFeature MapperFeature.PROPAGATE_TRANSIENT_MARKER>
	//   19   40:invokevirtual   #59  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//   20   43:istore          7
		Iterator iterator = _classDef.fields().iterator();
	//   21   45:aload_0         
	//   22   46:getfield        #67  <Field AnnotatedClass _classDef>
	//   23   49:invokevirtual   #297 <Method Iterable AnnotatedClass.fields()>
	//   24   52:invokeinterface #300 <Method Iterator Iterable.iterator()>
	//   25   57:astore          11
		do
		{
			if(!iterator.hasNext())
				break;
	//   26   59:aload           11
	//   27   61:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   28   66:ifeq            405
			AnnotatedField annotatedfield = (AnnotatedField)iterator.next();
	//   29   69:aload           11
	//   30   71:invokeinterface #265 <Method Object Iterator.next()>
	//   31   76:checkcast       #302 <Class AnnotatedField>
	//   32   79:astore          12
			Object obj = ((Object) (annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedfield)))));
	//   33   81:aload           10
	//   34   83:aload           12
	//   35   85:invokevirtual   #193 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   36   88:astore          8
			if(Boolean.TRUE.equals(((Object) (annotationintrospector.hasAsValue(((Annotated) (annotatedfield)))))))
	//*  37   90:getstatic       #308 <Field Boolean Boolean.TRUE>
	//*  38   93:aload           10
	//*  39   95:aload           12
	//*  40   97:invokevirtual   #312 <Method Boolean AnnotationIntrospector.hasAsValue(Annotated)>
	//*  41  100:invokevirtual   #315 <Method boolean Boolean.equals(Object)>
	//*  42  103:ifeq            137
			{
				if(_jsonValueAccessors == null)
	//*  43  106:aload_0         
	//*  44  107:getfield        #317 <Field LinkedList _jsonValueAccessors>
	//*  45  110:ifnonnull       124
					_jsonValueAccessors = new LinkedList();
	//   46  113:aload_0         
	//   47  114:new             #240 <Class LinkedList>
	//   48  117:dup             
	//   49  118:invokespecial   #268 <Method void LinkedList()>
	//   50  121:putfield        #317 <Field LinkedList _jsonValueAccessors>
				_jsonValueAccessors.add(((Object) (annotatedfield)));
	//   51  124:aload_0         
	//   52  125:getfield        #317 <Field LinkedList _jsonValueAccessors>
	//   53  128:aload           12
	//   54  130:invokevirtual   #241 <Method boolean LinkedList.add(Object)>
	//   55  133:pop             
			} else
	//*  56  134:goto            59
			if(Boolean.TRUE.equals(((Object) (annotationintrospector.hasAnySetter(((Annotated) (annotatedfield)))))))
	//*  57  137:getstatic       #308 <Field Boolean Boolean.TRUE>
	//*  58  140:aload           10
	//*  59  142:aload           12
	//*  60  144:invokevirtual   #320 <Method Boolean AnnotationIntrospector.hasAnySetter(Annotated)>
	//*  61  147:invokevirtual   #315 <Method boolean Boolean.equals(Object)>
	//*  62  150:ifeq            184
			{
				if(_anySetterField == null)
	//*  63  153:aload_0         
	//*  64  154:getfield        #322 <Field LinkedList _anySetterField>
	//*  65  157:ifnonnull       171
					_anySetterField = new LinkedList();
	//   66  160:aload_0         
	//   67  161:new             #240 <Class LinkedList>
	//   68  164:dup             
	//   69  165:invokespecial   #268 <Method void LinkedList()>
	//   70  168:putfield        #322 <Field LinkedList _anySetterField>
				_anySetterField.add(((Object) (annotatedfield)));
	//   71  171:aload_0         
	//   72  172:getfield        #322 <Field LinkedList _anySetterField>
	//   73  175:aload           12
	//   74  177:invokevirtual   #241 <Method boolean LinkedList.add(Object)>
	//   75  180:pop             
			} else
	//*  76  181:goto            59
			{
				String s = ((String) (obj));
	//   77  184:aload           8
	//   78  186:astore          9
				if(obj == null)
	//*  79  188:aload           8
	//*  80  190:ifnonnull       200
					s = annotatedfield.getName();
	//   81  193:aload           12
	//   82  195:invokevirtual   #323 <Method String AnnotatedField.getName()>
	//   83  198:astore          9
				if(_forSerialization)
	//*  84  200:aload_0         
	//*  85  201:getfield        #63  <Field boolean _forSerialization>
	//*  86  204:ifeq            219
					obj = ((Object) (annotationintrospector.findNameForSerialization(((Annotated) (annotatedfield)))));
	//   87  207:aload           10
	//   88  209:aload           12
	//   89  211:invokevirtual   #326 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//   90  214:astore          8
				else
	//*  91  216:goto            228
					obj = ((Object) (annotationintrospector.findNameForDeserialization(((Annotated) (annotatedfield)))));
	//   92  219:aload           10
	//   93  221:aload           12
	//   94  223:invokevirtual   #199 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   95  226:astore          8
				boolean flag1;
				if(obj != null)
	//*  96  228:aload           8
	//*  97  230:ifnull          238
					flag1 = true;
	//   98  233:iconst_1        
	//   99  234:istore_3        
				else
	//* 100  235:goto            240
					flag1 = false;
	//  101  238:iconst_0        
	//  102  239:istore_3        
				boolean flag4;
				if(flag1 && ((PropertyName) (obj)).isEmpty())
	//* 103  240:iload_3         
	//* 104  241:ifeq            266
	//* 105  244:aload           8
	//* 106  246:invokevirtual   #202 <Method boolean PropertyName.isEmpty()>
	//* 107  249:ifeq            266
				{
					obj = ((Object) (_propNameFromSimple(s)));
	//  108  252:aload_0         
	//  109  253:aload           9
	//  110  255:invokespecial   #328 <Method PropertyName _propNameFromSimple(String)>
	//  111  258:astore          8
					flag4 = false;
	//  112  260:iconst_0        
	//  113  261:istore          6
				} else
	//* 114  263:goto            269
				{
					flag4 = flag1;
	//  115  266:iload_3         
	//  116  267:istore          6
				}
				boolean flag3;
				if(obj != null)
	//* 117  269:aload           8
	//* 118  271:ifnull          280
					flag3 = true;
	//  119  274:iconst_1        
	//  120  275:istore          5
				else
	//* 121  277:goto            283
					flag3 = false;
	//  122  280:iconst_0        
	//  123  281:istore          5
				boolean flag2 = flag3;
	//  124  283:iload           5
	//  125  285:istore          4
				if(!flag3)
	//* 126  287:iload           5
	//* 127  289:ifne            305
					flag2 = _visibilityChecker.isFieldVisible(annotatedfield);
	//  128  292:aload_0         
	//  129  293:getfield        #100 <Field VisibilityChecker _visibilityChecker>
	//  130  296:aload           12
	//  131  298:invokeinterface #334 <Method boolean VisibilityChecker.isFieldVisible(AnnotatedField)>
	//  132  303:istore          4
				flag3 = annotationintrospector.hasIgnoreMarker(((AnnotatedMember) (annotatedfield)));
	//  133  305:aload           10
	//  134  307:aload           12
	//  135  309:invokevirtual   #338 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//  136  312:istore          5
				if(annotatedfield.isTransient() && !flag1)
	//* 137  314:aload           12
	//* 138  316:invokevirtual   #341 <Method boolean AnnotatedField.isTransient()>
	//* 139  319:ifeq            348
	//* 140  322:iload_3         
	//* 141  323:ifne            348
				{
					if(flag5)
	//* 142  326:iload           7
	//* 143  328:ifeq            339
					{
						flag2 = true;
	//  144  331:iconst_1        
	//  145  332:istore          4
						flag1 = false;
	//  146  334:iconst_0        
	//  147  335:istore_3        
					} else
	//* 148  336:goto            355
					{
						flag1 = false;
	//  149  339:iconst_0        
	//  150  340:istore_3        
						flag2 = flag3;
	//  151  341:iload           5
	//  152  343:istore          4
					}
				} else
	//* 153  345:goto            355
				{
					flag1 = flag2;
	//  154  348:iload           4
	//  155  350:istore_3        
					flag2 = flag3;
	//  156  351:iload           5
	//  157  353:istore          4
				}
				if(!flag || obj != null || flag2 || !Modifier.isFinal(annotatedfield.getModifiers()))
	//* 158  355:iload_2         
	//* 159  356:ifeq            383
	//* 160  359:aload           8
	//* 161  361:ifnonnull       383
	//* 162  364:iload           4
	//* 163  366:ifne            383
	//* 164  369:aload           12
	//* 165  371:invokevirtual   #344 <Method int AnnotatedField.getModifiers()>
	//* 166  374:invokestatic    #350 <Method boolean Modifier.isFinal(int)>
	//* 167  377:ifeq            383
	//* 168  380:goto            59
					_property(map, s).addField(annotatedfield, ((PropertyName) (obj)), flag4, flag1, flag2);
	//  169  383:aload_0         
	//  170  384:aload_1         
	//  171  385:aload           9
	//  172  387:invokevirtual   #230 <Method POJOPropertyBuilder _property(Map, String)>
	//  173  390:aload           12
	//  174  392:aload           8
	//  175  394:iload           6
	//  176  396:iload_3         
	//  177  397:iload           4
	//  178  399:invokevirtual   #354 <Method void POJOPropertyBuilder.addField(AnnotatedField, PropertyName, boolean, boolean, boolean)>
			}
		} while(true);
	//  179  402:goto            59
	//  180  405:return          
	}

	protected void _addGetterMethod(Map map, AnnotatedMethod annotatedmethod, AnnotationIntrospector annotationintrospector)
	{
		if(!annotatedmethod.hasReturnType())
	//*   0    0:aload_2         
	//*   1    1:invokevirtual   #359 <Method boolean AnnotatedMethod.hasReturnType()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		if(Boolean.TRUE.equals(((Object) (annotationintrospector.hasAnyGetter(((Annotated) (annotatedmethod)))))))
	//*   4    8:getstatic       #308 <Field Boolean Boolean.TRUE>
	//*   5   11:aload_3         
	//*   6   12:aload_2         
	//*   7   13:invokevirtual   #362 <Method Boolean AnnotationIntrospector.hasAnyGetter(Annotated)>
	//*   8   16:invokevirtual   #315 <Method boolean Boolean.equals(Object)>
	//*   9   19:ifeq            50
		{
			if(_anyGetters == null)
	//*  10   22:aload_0         
	//*  11   23:getfield        #364 <Field LinkedList _anyGetters>
	//*  12   26:ifnonnull       40
				_anyGetters = new LinkedList();
	//   13   29:aload_0         
	//   14   30:new             #240 <Class LinkedList>
	//   15   33:dup             
	//   16   34:invokespecial   #268 <Method void LinkedList()>
	//   17   37:putfield        #364 <Field LinkedList _anyGetters>
			_anyGetters.add(((Object) (annotatedmethod)));
	//   18   40:aload_0         
	//   19   41:getfield        #364 <Field LinkedList _anyGetters>
	//   20   44:aload_2         
	//   21   45:invokevirtual   #241 <Method boolean LinkedList.add(Object)>
	//   22   48:pop             
			return;
	//   23   49:return          
		}
		if(Boolean.TRUE.equals(((Object) (annotationintrospector.hasAsValue(((Annotated) (annotatedmethod)))))))
	//*  24   50:getstatic       #308 <Field Boolean Boolean.TRUE>
	//*  25   53:aload_3         
	//*  26   54:aload_2         
	//*  27   55:invokevirtual   #312 <Method Boolean AnnotationIntrospector.hasAsValue(Annotated)>
	//*  28   58:invokevirtual   #315 <Method boolean Boolean.equals(Object)>
	//*  29   61:ifeq            92
		{
			if(_jsonValueAccessors == null)
	//*  30   64:aload_0         
	//*  31   65:getfield        #317 <Field LinkedList _jsonValueAccessors>
	//*  32   68:ifnonnull       82
				_jsonValueAccessors = new LinkedList();
	//   33   71:aload_0         
	//   34   72:new             #240 <Class LinkedList>
	//   35   75:dup             
	//   36   76:invokespecial   #268 <Method void LinkedList()>
	//   37   79:putfield        #317 <Field LinkedList _jsonValueAccessors>
			_jsonValueAccessors.add(((Object) (annotatedmethod)));
	//   38   82:aload_0         
	//   39   83:getfield        #317 <Field LinkedList _jsonValueAccessors>
	//   40   86:aload_2         
	//   41   87:invokevirtual   #241 <Method boolean LinkedList.add(Object)>
	//   42   90:pop             
			return;
	//   43   91:return          
		}
		PropertyName propertyname = annotationintrospector.findNameForSerialization(((Annotated) (annotatedmethod)));
	//   44   92:aload_3         
	//   45   93:aload_2         
	//   46   94:invokevirtual   #326 <Method PropertyName AnnotationIntrospector.findNameForSerialization(Annotated)>
	//   47   97:astore          7
		boolean flag;
		if(propertyname != null)
	//*  48   99:aload           7
	//*  49  101:ifnull          110
			flag = true;
	//   50  104:iconst_1        
	//   51  105:istore          4
		else
	//*  52  107:goto            113
			flag = false;
	//   53  110:iconst_0        
	//   54  111:istore          4
		boolean flag1;
		String s;
		if(!flag)
	//*  55  113:iload           4
	//*  56  115:ifne            203
		{
			String s1 = annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedmethod)));
	//   57  118:aload_3         
	//   58  119:aload_2         
	//   59  120:invokevirtual   #193 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   60  123:astore          9
			s = s1;
	//   61  125:aload           9
	//   62  127:astore          8
			if(s1 == null)
	//*  63  129:aload           9
	//*  64  131:ifnonnull       148
				s = BeanUtil.okNameForRegularGetter(annotatedmethod, annotatedmethod.getName(), _stdBeanNaming);
	//   65  134:aload_2         
	//   66  135:aload_2         
	//   67  136:invokevirtual   #365 <Method String AnnotatedMethod.getName()>
	//   68  139:aload_0         
	//   69  140:getfield        #61  <Field boolean _stdBeanNaming>
	//   70  143:invokestatic    #371 <Method String BeanUtil.okNameForRegularGetter(AnnotatedMethod, String, boolean)>
	//   71  146:astore          8
			if(s == null)
	//*  72  148:aload           8
	//*  73  150:ifnonnull       188
			{
				s = BeanUtil.okNameForIsGetter(annotatedmethod, annotatedmethod.getName(), _stdBeanNaming);
	//   74  153:aload_2         
	//   75  154:aload_2         
	//   76  155:invokevirtual   #365 <Method String AnnotatedMethod.getName()>
	//   77  158:aload_0         
	//   78  159:getfield        #61  <Field boolean _stdBeanNaming>
	//   79  162:invokestatic    #374 <Method String BeanUtil.okNameForIsGetter(AnnotatedMethod, String, boolean)>
	//   80  165:astore          8
				if(s == null)
	//*  81  167:aload           8
	//*  82  169:ifnonnull       173
					return;
	//   83  172:return          
				flag1 = _visibilityChecker.isIsGetterVisible(annotatedmethod);
	//   84  173:aload_0         
	//   85  174:getfield        #100 <Field VisibilityChecker _visibilityChecker>
	//   86  177:aload_2         
	//   87  178:invokeinterface #378 <Method boolean VisibilityChecker.isIsGetterVisible(AnnotatedMethod)>
	//   88  183:istore          5
			} else
	//*  89  185:goto            274
			{
				flag1 = _visibilityChecker.isGetterVisible(annotatedmethod);
	//   90  188:aload_0         
	//   91  189:getfield        #100 <Field VisibilityChecker _visibilityChecker>
	//   92  192:aload_2         
	//   93  193:invokeinterface #381 <Method boolean VisibilityChecker.isGetterVisible(AnnotatedMethod)>
	//   94  198:istore          5
			}
		} else
	//*  95  200:goto            274
		{
			s = annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedmethod)));
	//   96  203:aload_3         
	//   97  204:aload_2         
	//   98  205:invokevirtual   #193 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   99  208:astore          8
			Object obj = ((Object) (s));
	//  100  210:aload           8
	//  101  212:astore          9
			if(s == null)
	//* 102  214:aload           8
	//* 103  216:ifnonnull       229
				obj = ((Object) (BeanUtil.okNameForGetter(annotatedmethod, _stdBeanNaming)));
	//  104  219:aload_2         
	//  105  220:aload_0         
	//  106  221:getfield        #61  <Field boolean _stdBeanNaming>
	//  107  224:invokestatic    #385 <Method String BeanUtil.okNameForGetter(AnnotatedMethod, boolean)>
	//  108  227:astore          9
			s = ((String) (obj));
	//  109  229:aload           9
	//  110  231:astore          8
			if(obj == null)
	//* 111  233:aload           9
	//* 112  235:ifnonnull       244
				s = annotatedmethod.getName();
	//  113  238:aload_2         
	//  114  239:invokevirtual   #365 <Method String AnnotatedMethod.getName()>
	//  115  242:astore          8
			obj = ((Object) (propertyname));
	//  116  244:aload           7
	//  117  246:astore          9
			if(propertyname.isEmpty())
	//* 118  248:aload           7
	//* 119  250:invokevirtual   #202 <Method boolean PropertyName.isEmpty()>
	//* 120  253:ifeq            267
			{
				obj = ((Object) (_propNameFromSimple(s)));
	//  121  256:aload_0         
	//  122  257:aload           8
	//  123  259:invokespecial   #328 <Method PropertyName _propNameFromSimple(String)>
	//  124  262:astore          9
				flag = false;
	//  125  264:iconst_0        
	//  126  265:istore          4
			}
			flag1 = true;
	//  127  267:iconst_1        
	//  128  268:istore          5
			propertyname = ((PropertyName) (obj));
	//  129  270:aload           9
	//  130  272:astore          7
		}
		boolean flag2 = annotationintrospector.hasIgnoreMarker(((AnnotatedMember) (annotatedmethod)));
	//  131  274:aload_3         
	//  132  275:aload_2         
	//  133  276:invokevirtual   #338 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//  134  279:istore          6
		_property(map, s).addGetter(annotatedmethod, propertyname, flag, flag1, flag2);
	//  135  281:aload_0         
	//  136  282:aload_1         
	//  137  283:aload           8
	//  138  285:invokevirtual   #230 <Method POJOPropertyBuilder _property(Map, String)>
	//  139  288:aload_2         
	//  140  289:aload           7
	//  141  291:iload           4
	//  142  293:iload           5
	//  143  295:iload           6
	//  144  297:invokevirtual   #389 <Method void POJOPropertyBuilder.addGetter(AnnotatedMethod, PropertyName, boolean, boolean, boolean)>
	//  145  300:return          
	}

	protected void _addInjectables(Map map)
	{
		map = ((Map) (_annotationIntrospector));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_1        
		AnnotatedField annotatedfield;
		for(Iterator iterator = _classDef.fields().iterator(); iterator.hasNext(); _doAddInjectable(((AnnotationIntrospector) (map)).findInjectableValue(((AnnotatedMember) (annotatedfield))), ((AnnotatedMember) (annotatedfield))))
	//*   3    5:aload_0         
	//*   4    6:getfield        #67  <Field AnnotatedClass _classDef>
	//*   5    9:invokevirtual   #297 <Method Iterable AnnotatedClass.fields()>
	//*   6   12:invokeinterface #300 <Method Iterator Iterable.iterator()>
	//*   7   17:astore_2        
	//*   8   18:aload_2         
	//*   9   19:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  10   24:ifeq            50
			annotatedfield = (AnnotatedField)iterator.next();
	//   11   27:aload_2         
	//   12   28:invokeinterface #265 <Method Object Iterator.next()>
	//   13   33:checkcast       #302 <Class AnnotatedField>
	//   14   36:astore_3        

	//   15   37:aload_0         
	//   16   38:aload_1         
	//   17   39:aload_3         
	//   18   40:invokevirtual   #395 <Method com.fasterxml.jackson.annotation.JacksonInject$Value AnnotationIntrospector.findInjectableValue(AnnotatedMember)>
	//   19   43:aload_3         
	//   20   44:invokevirtual   #399 <Method void _doAddInjectable(com.fasterxml.jackson.annotation.JacksonInject$Value, AnnotatedMember)>
	//*  21   47:goto            18
		Iterator iterator1 = _classDef.memberMethods().iterator();
	//   22   50:aload_0         
	//   23   51:getfield        #67  <Field AnnotatedClass _classDef>
	//   24   54:invokevirtual   #402 <Method Iterable AnnotatedClass.memberMethods()>
	//   25   57:invokeinterface #300 <Method Iterator Iterable.iterator()>
	//   26   62:astore_2        
		do
		{
			if(!iterator1.hasNext())
				break;
	//   27   63:aload_2         
	//   28   64:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   29   69:ifeq            106
			AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator1.next();
	//   30   72:aload_2         
	//   31   73:invokeinterface #265 <Method Object Iterator.next()>
	//   32   78:checkcast       #283 <Class AnnotatedMethod>
	//   33   81:astore_3        
			if(annotatedmethod.getParameterCount() == 1)
	//*  34   82:aload_3         
	//*  35   83:invokevirtual   #284 <Method int AnnotatedMethod.getParameterCount()>
	//*  36   86:iconst_1        
	//*  37   87:icmpeq          93
	//*  38   90:goto            63
				_doAddInjectable(((AnnotationIntrospector) (map)).findInjectableValue(((AnnotatedMember) (annotatedmethod))), ((AnnotatedMember) (annotatedmethod)));
	//   39   93:aload_0         
	//   40   94:aload_1         
	//   41   95:aload_3         
	//   42   96:invokevirtual   #395 <Method com.fasterxml.jackson.annotation.JacksonInject$Value AnnotationIntrospector.findInjectableValue(AnnotatedMember)>
	//   43   99:aload_3         
	//   44  100:invokevirtual   #399 <Method void _doAddInjectable(com.fasterxml.jackson.annotation.JacksonInject$Value, AnnotatedMember)>
		} while(true);
	//   45  103:goto            63
	//   46  106:return          
	}

	protected void _addMethods(Map map)
	{
		AnnotationIntrospector annotationintrospector = _annotationIntrospector;
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore_3        
		Iterator iterator = _classDef.memberMethods().iterator();
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field AnnotatedClass _classDef>
	//    5    9:invokevirtual   #402 <Method Iterable AnnotatedClass.memberMethods()>
	//    6   12:invokeinterface #300 <Method Iterator Iterable.iterator()>
	//    7   17:astore          4
		do
		{
			if(!iterator.hasNext())
				break;
	//    8   19:aload           4
	//    9   21:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   10   26:ifeq            133
			AnnotatedMethod annotatedmethod = (AnnotatedMethod)iterator.next();
	//   11   29:aload           4
	//   12   31:invokeinterface #265 <Method Object Iterator.next()>
	//   13   36:checkcast       #283 <Class AnnotatedMethod>
	//   14   39:astore          5
			int i = annotatedmethod.getParameterCount();
	//   15   41:aload           5
	//   16   43:invokevirtual   #284 <Method int AnnotatedMethod.getParameterCount()>
	//   17   46:istore_2        
			if(i == 0)
	//*  18   47:iload_2         
	//*  19   48:ifne            62
				_addGetterMethod(map, annotatedmethod, annotationintrospector);
	//   20   51:aload_0         
	//   21   52:aload_1         
	//   22   53:aload           5
	//   23   55:aload_3         
	//   24   56:invokevirtual   #405 <Method void _addGetterMethod(Map, AnnotatedMethod, AnnotationIntrospector)>
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
	//   33   72:invokevirtual   #408 <Method void _addSetterMethod(Map, AnnotatedMethod, AnnotationIntrospector)>
			else
	//*  34   75:goto            19
			if(i == 2 && annotationintrospector != null && Boolean.TRUE.equals(((Object) (annotationintrospector.hasAnySetter(((Annotated) (annotatedmethod)))))))
	//*  35   78:iload_2         
	//*  36   79:iconst_2        
	//*  37   80:icmpne          19
	//*  38   83:aload_3         
	//*  39   84:ifnull          19
	//*  40   87:getstatic       #308 <Field Boolean Boolean.TRUE>
	//*  41   90:aload_3         
	//*  42   91:aload           5
	//*  43   93:invokevirtual   #320 <Method Boolean AnnotationIntrospector.hasAnySetter(Annotated)>
	//*  44   96:invokevirtual   #315 <Method boolean Boolean.equals(Object)>
	//*  45   99:ifeq            19
			{
				if(_anySetters == null)
	//*  46  102:aload_0         
	//*  47  103:getfield        #410 <Field LinkedList _anySetters>
	//*  48  106:ifnonnull       120
					_anySetters = new LinkedList();
	//   49  109:aload_0         
	//   50  110:new             #240 <Class LinkedList>
	//   51  113:dup             
	//   52  114:invokespecial   #268 <Method void LinkedList()>
	//   53  117:putfield        #410 <Field LinkedList _anySetters>
				_anySetters.add(((Object) (annotatedmethod)));
	//   54  120:aload_0         
	//   55  121:getfield        #410 <Field LinkedList _anySetters>
	//   56  124:aload           5
	//   57  126:invokevirtual   #241 <Method boolean LinkedList.add(Object)>
	//   58  129:pop             
			}
		} while(true);
	//   59  130:goto            19
	//   60  133:return          
	}

	protected void _addSetterMethod(Map map, AnnotatedMethod annotatedmethod, AnnotationIntrospector annotationintrospector)
	{
		String s = null;
	//    0    0:aconst_null     
	//    1    1:astore          8
		String s1 = null;
	//    2    3:aconst_null     
	//    3    4:astore          9
		PropertyName propertyname;
		if(annotationintrospector == null)
	//*   4    6:aload_3         
	//*   5    7:ifnonnull       16
			propertyname = null;
	//    6   10:aconst_null     
	//    7   11:astore          7
		else
	//*   8   13:goto            23
			propertyname = annotationintrospector.findNameForDeserialization(((Annotated) (annotatedmethod)));
	//    9   16:aload_3         
	//   10   17:aload_2         
	//   11   18:invokevirtual   #199 <Method PropertyName AnnotationIntrospector.findNameForDeserialization(Annotated)>
	//   12   21:astore          7
		boolean flag;
		if(propertyname != null)
	//*  13   23:aload           7
	//*  14   25:ifnull          34
			flag = true;
	//   15   28:iconst_1        
	//   16   29:istore          4
		else
	//*  17   31:goto            37
			flag = false;
	//   18   34:iconst_0        
	//   19   35:istore          4
		boolean flag1;
		if(!flag)
	//*  20   37:iload           4
	//*  21   39:ifne            100
		{
			if(annotationintrospector != null)
	//*  22   42:aload_3         
	//*  23   43:ifnonnull       49
	//*  24   46:goto            56
				s1 = annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedmethod)));
	//   25   49:aload_3         
	//   26   50:aload_2         
	//   27   51:invokevirtual   #193 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   28   54:astore          9
			s = s1;
	//   29   56:aload           9
	//   30   58:astore          8
			if(s1 == null)
	//*  31   60:aload           9
	//*  32   62:ifnonnull       79
				s = BeanUtil.okNameForMutator(annotatedmethod, _mutatorPrefix, _stdBeanNaming);
	//   33   65:aload_2         
	//   34   66:aload_0         
	//   35   67:getfield        #71  <Field String _mutatorPrefix>
	//   36   70:aload_0         
	//   37   71:getfield        #61  <Field boolean _stdBeanNaming>
	//   38   74:invokestatic    #413 <Method String BeanUtil.okNameForMutator(AnnotatedMethod, String, boolean)>
	//   39   77:astore          8
			if(s == null)
	//*  40   79:aload           8
	//*  41   81:ifnonnull       85
				return;
	//   42   84:return          
			flag1 = _visibilityChecker.isSetterVisible(annotatedmethod);
	//   43   85:aload_0         
	//   44   86:getfield        #100 <Field VisibilityChecker _visibilityChecker>
	//   45   89:aload_2         
	//   46   90:invokeinterface #416 <Method boolean VisibilityChecker.isSetterVisible(AnnotatedMethod)>
	//   47   95:istore          5
		} else
	//*  48   97:goto            182
		{
			if(annotationintrospector != null)
	//*  49  100:aload_3         
	//*  50  101:ifnonnull       107
	//*  51  104:goto            114
				s = annotationintrospector.findImplicitPropertyName(((AnnotatedMember) (annotatedmethod)));
	//   52  107:aload_3         
	//   53  108:aload_2         
	//   54  109:invokevirtual   #193 <Method String AnnotationIntrospector.findImplicitPropertyName(AnnotatedMember)>
	//   55  112:astore          8
			Object obj = ((Object) (s));
	//   56  114:aload           8
	//   57  116:astore          9
			if(s == null)
	//*  58  118:aload           8
	//*  59  120:ifnonnull       137
				obj = ((Object) (BeanUtil.okNameForMutator(annotatedmethod, _mutatorPrefix, _stdBeanNaming)));
	//   60  123:aload_2         
	//   61  124:aload_0         
	//   62  125:getfield        #71  <Field String _mutatorPrefix>
	//   63  128:aload_0         
	//   64  129:getfield        #61  <Field boolean _stdBeanNaming>
	//   65  132:invokestatic    #413 <Method String BeanUtil.okNameForMutator(AnnotatedMethod, String, boolean)>
	//   66  135:astore          9
			s = ((String) (obj));
	//   67  137:aload           9
	//   68  139:astore          8
			if(obj == null)
	//*  69  141:aload           9
	//*  70  143:ifnonnull       152
				s = annotatedmethod.getName();
	//   71  146:aload_2         
	//   72  147:invokevirtual   #365 <Method String AnnotatedMethod.getName()>
	//   73  150:astore          8
			obj = ((Object) (propertyname));
	//   74  152:aload           7
	//   75  154:astore          9
			if(propertyname.isEmpty())
	//*  76  156:aload           7
	//*  77  158:invokevirtual   #202 <Method boolean PropertyName.isEmpty()>
	//*  78  161:ifeq            175
			{
				obj = ((Object) (_propNameFromSimple(s)));
	//   79  164:aload_0         
	//   80  165:aload           8
	//   81  167:invokespecial   #328 <Method PropertyName _propNameFromSimple(String)>
	//   82  170:astore          9
				flag = false;
	//   83  172:iconst_0        
	//   84  173:istore          4
			}
			propertyname = ((PropertyName) (obj));
	//   85  175:aload           9
	//   86  177:astore          7
			flag1 = true;
	//   87  179:iconst_1        
	//   88  180:istore          5
		}
		boolean flag2;
		if(annotationintrospector == null)
	//*  89  182:aload_3         
	//*  90  183:ifnonnull       192
			flag2 = false;
	//   91  186:iconst_0        
	//   92  187:istore          6
		else
	//*  93  189:goto            199
			flag2 = annotationintrospector.hasIgnoreMarker(((AnnotatedMember) (annotatedmethod)));
	//   94  192:aload_3         
	//   95  193:aload_2         
	//   96  194:invokevirtual   #338 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//   97  197:istore          6
		_property(map, s).addSetter(annotatedmethod, propertyname, flag, flag1, flag2);
	//   98  199:aload_0         
	//   99  200:aload_1         
	//  100  201:aload           8
	//  101  203:invokevirtual   #230 <Method POJOPropertyBuilder _property(Map, String)>
	//  102  206:aload_2         
	//  103  207:aload           7
	//  104  209:iload           4
	//  105  211:iload           5
	//  106  213:iload           6
	//  107  215:invokevirtual   #419 <Method void POJOPropertyBuilder.addSetter(AnnotatedMethod, PropertyName, boolean, boolean, boolean)>
	//  108  218:return          
	}

	protected void _doAddInjectable(com.fasterxml.jackson.annotation.JacksonInject.Value value, AnnotatedMember annotatedmember)
	{
		if(value == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		value = ((com.fasterxml.jackson.annotation.JacksonInject.Value) (value.getId()));
	//    3    5:aload_1         
	//    4    6:invokevirtual   #424 <Method Object com.fasterxml.jackson.annotation.JacksonInject$Value.getId()>
	//    5    9:astore_1        
		if(_injectables == null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #426 <Field LinkedHashMap _injectables>
	//*   8   14:ifnonnull       28
			_injectables = new LinkedHashMap();
	//    9   17:aload_0         
	//   10   18:new             #428 <Class LinkedHashMap>
	//   11   21:dup             
	//   12   22:invokespecial   #429 <Method void LinkedHashMap()>
	//   13   25:putfield        #426 <Field LinkedHashMap _injectables>
		AnnotatedMember annotatedmember1 = (AnnotatedMember)_injectables.put(((Object) (value)), ((Object) (annotatedmember)));
	//   14   28:aload_0         
	//   15   29:getfield        #426 <Field LinkedHashMap _injectables>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #433 <Method Object LinkedHashMap.put(Object, Object)>
	//   19   37:checkcast       #435 <Class AnnotatedMember>
	//   20   40:astore_3        
		if(annotatedmember1 != null)
	//*  21   41:aload_3         
	//*  22   42:ifnull          124
		{
			if(((Object) (annotatedmember1)).getClass() != ((Object) (annotatedmember)).getClass())
	//*  23   45:aload_3         
	//*  24   46:invokevirtual   #177 <Method Class Object.getClass()>
	//*  25   49:aload_2         
	//*  26   50:invokevirtual   #177 <Method Class Object.getClass()>
	//*  27   53:if_acmpeq       57
			{
				return;
	//   28   56:return          
			} else
			{
				annotatedmember = ((AnnotatedMember) (((Object) (value)).getClass().getName()));
	//   29   57:aload_1         
	//   30   58:invokevirtual   #177 <Method Class Object.getClass()>
	//   31   61:invokevirtual   #163 <Method String Class.getName()>
	//   32   64:astore_2        
				StringBuilder stringbuilder = new StringBuilder();
	//   33   65:new             #152 <Class StringBuilder>
	//   34   68:dup             
	//   35   69:invokespecial   #153 <Method void StringBuilder()>
	//   36   72:astore_3        
				stringbuilder.append("Duplicate injectable value with id '");
	//   37   73:aload_3         
	//   38   74:ldc2            #437 <String "Duplicate injectable value with id '">
	//   39   77:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   40   80:pop             
				stringbuilder.append(String.valueOf(((Object) (value))));
	//   41   81:aload_3         
	//   42   82:aload_1         
	//   43   83:invokestatic    #441 <Method String String.valueOf(Object)>
	//   44   86:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   45   89:pop             
				stringbuilder.append("' (of type ");
	//   46   90:aload_3         
	//   47   91:ldc2            #443 <String "' (of type ">
	//   48   94:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   49   97:pop             
				stringbuilder.append(((String) (annotatedmember)));
	//   50   98:aload_3         
	//   51   99:aload_2         
	//   52  100:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   53  103:pop             
				stringbuilder.append(")");
	//   54  104:aload_3         
	//   55  105:ldc2            #445 <String ")">
	//   56  108:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   57  111:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   58  112:new             #447 <Class IllegalArgumentException>
	//   59  115:dup             
	//   60  116:aload_3         
	//   61  117:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   62  120:invokespecial   #448 <Method void IllegalArgumentException(String)>
	//   63  123:athrow          
			}
		} else
		{
			return;
	//   64  124:return          
		}
	}

	protected POJOPropertyBuilder _property(Map map, PropertyName propertyname)
	{
		String s = propertyname.getSimpleName();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #451 <Method String PropertyName.getSimpleName()>
	//    2    4:astore          5
		POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)map.get(((Object) (s)));
	//    3    6:aload_1         
	//    4    7:aload           5
	//    5    9:invokeinterface #457 <Method Object Map.get(Object)>
	//    6   14:checkcast       #232 <Class POJOPropertyBuilder>
	//    7   17:astore          4
		POJOPropertyBuilder pojopropertybuilder = pojopropertybuilder1;
	//    8   19:aload           4
	//    9   21:astore_3        
		if(pojopropertybuilder1 == null)
	//*  10   22:aload           4
	//*  11   24:ifnonnull       58
		{
			pojopropertybuilder = new POJOPropertyBuilder(_config, _annotationIntrospector, _forSerialization, propertyname);
	//   12   27:new             #232 <Class POJOPropertyBuilder>
	//   13   30:dup             
	//   14   31:aload_0         
	//   15   32:getfield        #47  <Field MapperConfig _config>
	//   16   35:aload_0         
	//   17   36:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//   18   39:aload_0         
	//   19   40:getfield        #63  <Field boolean _forSerialization>
	//   20   43:aload_2         
	//   21   44:invokespecial   #460 <Method void POJOPropertyBuilder(MapperConfig, AnnotationIntrospector, boolean, PropertyName)>
	//   22   47:astore_3        
			map.put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//   23   48:aload_1         
	//   24   49:aload           5
	//   25   51:aload_3         
	//   26   52:invokeinterface #461 <Method Object Map.put(Object, Object)>
	//   27   57:pop             
		}
		return pojopropertybuilder;
	//   28   58:aload_3         
	//   29   59:areturn         
	}

	protected POJOPropertyBuilder _property(Map map, String s)
	{
		POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)map.get(((Object) (s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #457 <Method Object Map.get(Object)>
	//    3    7:checkcast       #232 <Class POJOPropertyBuilder>
	//    4   10:astore          4
		POJOPropertyBuilder pojopropertybuilder = pojopropertybuilder1;
	//    5   12:aload           4
	//    6   14:astore_3        
		if(pojopropertybuilder1 == null)
	//*   7   15:aload           4
	//*   8   17:ifnonnull       53
		{
			pojopropertybuilder = new POJOPropertyBuilder(_config, _annotationIntrospector, _forSerialization, PropertyName.construct(s));
	//    9   20:new             #232 <Class POJOPropertyBuilder>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:getfield        #47  <Field MapperConfig _config>
	//   13   28:aload_0         
	//   14   29:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//   15   32:aload_0         
	//   16   33:getfield        #63  <Field boolean _forSerialization>
	//   17   36:aload_2         
	//   18   37:invokestatic    #223 <Method PropertyName PropertyName.construct(String)>
	//   19   40:invokespecial   #460 <Method void POJOPropertyBuilder(MapperConfig, AnnotationIntrospector, boolean, PropertyName)>
	//   20   43:astore_3        
			map.put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//   21   44:aload_1         
	//   22   45:aload_2         
	//   23   46:aload_3         
	//   24   47:invokeinterface #461 <Method Object Map.put(Object, Object)>
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
	//    1    1:getfield        #47  <Field MapperConfig _config>
	//    2    4:getstatic       #467 <Field MapperFeature MapperFeature.INFER_PROPERTY_MUTATORS>
	//    3    7:invokevirtual   #59  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//    4   10:istore_2        
		map = ((Map) (map.values().iterator()));
	//    5   11:aload_1         
	//    6   12:invokeinterface #471 <Method Collection Map.values()>
	//    7   17:invokeinterface #474 <Method Iterator Collection.iterator()>
	//    8   22:astore_1        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//    9   23:aload_1         
	//   10   24:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   11   29:ifeq            64
			POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (map)).next();
	//   12   32:aload_1         
	//   13   33:invokeinterface #265 <Method Object Iterator.next()>
	//   14   38:checkcast       #232 <Class POJOPropertyBuilder>
	//   15   41:astore_3        
			if(pojopropertybuilder.removeNonVisible(flag) == com.fasterxml.jackson.annotation.JsonProperty.Access.READ_ONLY)
	//*  16   42:aload_3         
	//*  17   43:iload_2         
	//*  18   44:invokevirtual   #478 <Method com.fasterxml.jackson.annotation.JsonProperty$Access POJOPropertyBuilder.removeNonVisible(boolean)>
	//*  19   47:getstatic       #484 <Field com.fasterxml.jackson.annotation.JsonProperty$Access com.fasterxml.jackson.annotation.JsonProperty$Access.READ_ONLY>
	//*  20   50:if_acmpne       23
				_collectIgnorals(pojopropertybuilder.getName());
	//   21   53:aload_0         
	//   22   54:aload_3         
	//   23   55:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//   24   58:invokespecial   #487 <Method void _collectIgnorals(String)>
		} while(true);
	//   25   61:goto            23
	//   26   64:return          
	}

	protected void _removeUnwantedProperties(Map map)
	{
		map = ((Map) (map.values().iterator()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #471 <Method Collection Map.values()>
	//    2    6:invokeinterface #474 <Method Iterator Collection.iterator()>
	//    3   11:astore_1        
		do
		{
			if(!((Iterator) (map)).hasNext())
				break;
	//    4   12:aload_1         
	//    5   13:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//    6   18:ifeq            100
			POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (map)).next();
	//    7   21:aload_1         
	//    8   22:invokeinterface #265 <Method Object Iterator.next()>
	//    9   27:checkcast       #232 <Class POJOPropertyBuilder>
	//   10   30:astore_2        
			if(!pojopropertybuilder.anyVisible())
	//*  11   31:aload_2         
	//*  12   32:invokevirtual   #491 <Method boolean POJOPropertyBuilder.anyVisible()>
	//*  13   35:ifne            47
				((Iterator) (map)).remove();
	//   14   38:aload_1         
	//   15   39:invokeinterface #494 <Method void Iterator.remove()>
			else
	//*  16   44:goto            12
			if(pojopropertybuilder.anyIgnorals())
	//*  17   47:aload_2         
	//*  18   48:invokevirtual   #497 <Method boolean POJOPropertyBuilder.anyIgnorals()>
	//*  19   51:ifeq            12
				if(!pojopropertybuilder.isExplicitlyIncluded())
	//*  20   54:aload_2         
	//*  21   55:invokevirtual   #500 <Method boolean POJOPropertyBuilder.isExplicitlyIncluded()>
	//*  22   58:ifne            78
				{
					((Iterator) (map)).remove();
	//   23   61:aload_1         
	//   24   62:invokeinterface #494 <Method void Iterator.remove()>
					_collectIgnorals(pojopropertybuilder.getName());
	//   25   67:aload_0         
	//   26   68:aload_2         
	//   27   69:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//   28   72:invokespecial   #487 <Method void _collectIgnorals(String)>
				} else
	//*  29   75:goto            12
				{
					pojopropertybuilder.removeIgnored();
	//   30   78:aload_2         
	//   31   79:invokevirtual   #503 <Method void POJOPropertyBuilder.removeIgnored()>
					if(!pojopropertybuilder.couldDeserialize())
	//*  32   82:aload_2         
	//*  33   83:invokevirtual   #506 <Method boolean POJOPropertyBuilder.couldDeserialize()>
	//*  34   86:ifne            12
						_collectIgnorals(pojopropertybuilder.getName());
	//   35   89:aload_0         
	//   36   90:aload_2         
	//   37   91:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//   38   94:invokespecial   #487 <Method void _collectIgnorals(String)>
				}
		} while(true);
	//   39   97:goto            12
	//   40  100:return          
	}

	protected void _renameProperties(Map map)
	{
		Iterator iterator = map.entrySet().iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #511 <Method Set Map.entrySet()>
	//    2    6:invokeinterface #514 <Method Iterator Set.iterator()>
	//    3   11:astore          4
		Object obj = null;
	//    4   13:aconst_null     
	//    5   14:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   15:aload           4
	//    7   17:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            144
			POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)((java.util.Map.Entry)iterator.next()).getValue();
	//    9   25:aload           4
	//   10   27:invokeinterface #265 <Method Object Iterator.next()>
	//   11   32:checkcast       #516 <Class java.util.Map$Entry>
	//   12   35:invokeinterface #519 <Method Object java.util.Map$Entry.getValue()>
	//   13   40:checkcast       #232 <Class POJOPropertyBuilder>
	//   14   43:astore          5
			Set set = pojopropertybuilder1.findExplicitNames();
	//   15   45:aload           5
	//   16   47:invokevirtual   #522 <Method Set POJOPropertyBuilder.findExplicitNames()>
	//   17   50:astore          6
			if(!((Collection) (set)).isEmpty())
	//*  18   52:aload           6
	//*  19   54:invokeinterface #523 <Method boolean Collection.isEmpty()>
	//*  20   59:ifeq            65
	//*  21   62:goto            15
			{
				iterator.remove();
	//   22   65:aload           4
	//   23   67:invokeinterface #494 <Method void Iterator.remove()>
				LinkedList linkedlist = ((LinkedList) (obj));
	//   24   72:aload_2         
	//   25   73:astore_3        
				if(obj == null)
	//*  26   74:aload_2         
	//*  27   75:ifnonnull       86
					linkedlist = new LinkedList();
	//   28   78:new             #240 <Class LinkedList>
	//   29   81:dup             
	//   30   82:invokespecial   #268 <Method void LinkedList()>
	//   31   85:astore_3        
				if(((Collection) (set)).size() == 1)
	//*  32   86:aload           6
	//*  33   88:invokeinterface #526 <Method int Collection.size()>
	//*  34   93:iconst_1        
	//*  35   94:icmpne          127
				{
					linkedlist.add(((Object) (pojopropertybuilder1.withName((PropertyName)((Collection) (set)).iterator().next()))));
	//   36   97:aload_3         
	//   37   98:aload           5
	//   38  100:aload           6
	//   39  102:invokeinterface #474 <Method Iterator Collection.iterator()>
	//   40  107:invokeinterface #265 <Method Object Iterator.next()>
	//   41  112:checkcast       #183 <Class PropertyName>
	//   42  115:invokevirtual   #530 <Method POJOPropertyBuilder POJOPropertyBuilder.withName(PropertyName)>
	//   43  118:invokevirtual   #241 <Method boolean LinkedList.add(Object)>
	//   44  121:pop             
					obj = ((Object) (linkedlist));
	//   45  122:aload_3         
	//   46  123:astore_2        
				} else
	//*  47  124:goto            15
				{
					linkedlist.addAll(pojopropertybuilder1.explode(((Collection) (set))));
	//   48  127:aload_3         
	//   49  128:aload           5
	//   50  130:aload           6
	//   51  132:invokevirtual   #534 <Method Collection POJOPropertyBuilder.explode(Collection)>
	//   52  135:invokevirtual   #538 <Method boolean LinkedList.addAll(Collection)>
	//   53  138:pop             
					obj = ((Object) (linkedlist));
	//   54  139:aload_3         
	//   55  140:astore_2        
				}
			}
		} while(true);
	//   56  141:goto            15
		if(obj != null)
	//*  57  144:aload_2         
	//*  58  145:ifnull          227
		{
			POJOPropertyBuilder pojopropertybuilder;
			for(obj = ((Object) (((LinkedList) (obj)).iterator())); ((Iterator) (obj)).hasNext(); _updateCreatorProperty(pojopropertybuilder, ((List) (_creatorProperties))))
	//*  59  148:aload_2         
	//*  60  149:invokevirtual   #539 <Method Iterator LinkedList.iterator()>
	//*  61  152:astore_2        
	//*  62  153:aload_2         
	//*  63  154:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  64  159:ifeq            227
			{
				pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (obj)).next();
	//   65  162:aload_2         
	//   66  163:invokeinterface #265 <Method Object Iterator.next()>
	//   67  168:checkcast       #232 <Class POJOPropertyBuilder>
	//   68  171:astore_3        
				String s = pojopropertybuilder.getName();
	//   69  172:aload_3         
	//   70  173:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//   71  176:astore          4
				POJOPropertyBuilder pojopropertybuilder2 = (POJOPropertyBuilder)map.get(((Object) (s)));
	//   72  178:aload_1         
	//   73  179:aload           4
	//   74  181:invokeinterface #457 <Method Object Map.get(Object)>
	//   75  186:checkcast       #232 <Class POJOPropertyBuilder>
	//   76  189:astore          5
				if(pojopropertybuilder2 == null)
	//*  77  191:aload           5
	//*  78  193:ifnonnull       209
					map.put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//   79  196:aload_1         
	//   80  197:aload           4
	//   81  199:aload_3         
	//   82  200:invokeinterface #461 <Method Object Map.put(Object, Object)>
	//   83  205:pop             
				else
	//*  84  206:goto            215
					pojopropertybuilder2.addAll(pojopropertybuilder);
	//   85  209:aload           5
	//   86  211:aload_3         
	//   87  212:invokevirtual   #542 <Method void POJOPropertyBuilder.addAll(POJOPropertyBuilder)>
			}

	//   88  215:aload_0         
	//   89  216:aload_3         
	//   90  217:aload_0         
	//   91  218:getfield        #238 <Field LinkedList _creatorProperties>
	//   92  221:invokevirtual   #546 <Method void _updateCreatorProperty(POJOPropertyBuilder, List)>
		}
	//*  93  224:goto            153
	//   94  227:return          
	}

	protected void _renameUsing(Map map, PropertyNamingStrategy propertynamingstrategy)
	{
		POJOPropertyBuilder apojopropertybuilder[] = (POJOPropertyBuilder[])map.values().toArray(((Object []) (new POJOPropertyBuilder[map.size()])));
	//    0    0:aload_1         
	//    1    1:invokeinterface #471 <Method Collection Map.values()>
	//    2    6:aload_1         
	//    3    7:invokeinterface #549 <Method int Map.size()>
	//    4   12:anewarray       POJOPropertyBuilder[]
	//    5   15:invokeinterface #553 <Method Object[] Collection.toArray(Object[])>
	//    6   20:checkcast       #555 <Class POJOPropertyBuilder[]>
	//    7   23:astore          8
		map.clear();
	//    8   25:aload_1         
	//    9   26:invokeinterface #558 <Method void Map.clear()>
		int j = apojopropertybuilder.length;
	//   10   31:aload           8
	//   11   33:arraylength     
	//   12   34:istore          4
		for(int i = 0; i < j; i++)
	//*  13   36:iconst_0        
	//*  14   37:istore_3        
	//*  15   38:iload_3         
	//*  16   39:iload           4
	//*  17   41:icmpge          373
		{
			String s;
			POJOPropertyBuilder pojopropertybuilder;
			PropertyName propertyname;
label0:
			{
				pojopropertybuilder = apojopropertybuilder[i];
	//   18   44:aload           8
	//   19   46:iload_3         
	//   20   47:aaload          
	//   21   48:astore          6
				propertyname = pojopropertybuilder.getFullName();
	//   22   50:aload           6
	//   23   52:invokevirtual   #562 <Method PropertyName POJOPropertyBuilder.getFullName()>
	//   24   55:astore          9
				Object obj = null;
	//   25   57:aconst_null     
	//   26   58:astore          7
				if(pojopropertybuilder.isExplicitlyNamed())
	//*  27   60:aload           6
	//*  28   62:invokevirtual   #565 <Method boolean POJOPropertyBuilder.isExplicitlyNamed()>
	//*  29   65:ifeq            85
				{
					s = ((String) (obj));
	//   30   68:aload           7
	//   31   70:astore          5
					if(!_config.isEnabled(MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING))
						break label0;
	//   32   72:aload_0         
	//   33   73:getfield        #47  <Field MapperConfig _config>
	//   34   76:getstatic       #568 <Field MapperFeature MapperFeature.ALLOW_EXPLICIT_PROPERTY_RENAMING>
	//   35   79:invokevirtual   #59  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//   36   82:ifeq            283
				}
				if(_forSerialization)
	//*  37   85:aload_0         
	//*  38   86:getfield        #63  <Field boolean _forSerialization>
	//*  39   89:ifeq            158
				{
					if(pojopropertybuilder.hasGetter())
	//*  40   92:aload           6
	//*  41   94:invokevirtual   #571 <Method boolean POJOPropertyBuilder.hasGetter()>
	//*  42   97:ifeq            123
					{
						s = propertynamingstrategy.nameForGetterMethod(_config, pojopropertybuilder.getGetter(), propertyname.getSimpleName());
	//   43  100:aload_2         
	//   44  101:aload_0         
	//   45  102:getfield        #47  <Field MapperConfig _config>
	//   46  105:aload           6
	//   47  107:invokevirtual   #575 <Method AnnotatedMethod POJOPropertyBuilder.getGetter()>
	//   48  110:aload           9
	//   49  112:invokevirtual   #451 <Method String PropertyName.getSimpleName()>
	//   50  115:invokevirtual   #579 <Method String PropertyNamingStrategy.nameForGetterMethod(MapperConfig, AnnotatedMethod, String)>
	//   51  118:astore          5
					} else
	//*  52  120:goto            283
					{
						s = ((String) (obj));
	//   53  123:aload           7
	//   54  125:astore          5
						if(pojopropertybuilder.hasField())
	//*  55  127:aload           6
	//*  56  129:invokevirtual   #582 <Method boolean POJOPropertyBuilder.hasField()>
	//*  57  132:ifeq            283
							s = propertynamingstrategy.nameForField(_config, pojopropertybuilder.getField(), propertyname.getSimpleName());
	//   58  135:aload_2         
	//   59  136:aload_0         
	//   60  137:getfield        #47  <Field MapperConfig _config>
	//   61  140:aload           6
	//   62  142:invokevirtual   #586 <Method AnnotatedField POJOPropertyBuilder.getField()>
	//   63  145:aload           9
	//   64  147:invokevirtual   #451 <Method String PropertyName.getSimpleName()>
	//   65  150:invokevirtual   #590 <Method String PropertyNamingStrategy.nameForField(MapperConfig, AnnotatedField, String)>
	//   66  153:astore          5
					}
				} else
	//*  67  155:goto            283
				if(pojopropertybuilder.hasSetter())
	//*  68  158:aload           6
	//*  69  160:invokevirtual   #593 <Method boolean POJOPropertyBuilder.hasSetter()>
	//*  70  163:ifeq            189
					s = propertynamingstrategy.nameForSetterMethod(_config, pojopropertybuilder.getSetter(), propertyname.getSimpleName());
	//   71  166:aload_2         
	//   72  167:aload_0         
	//   73  168:getfield        #47  <Field MapperConfig _config>
	//   74  171:aload           6
	//   75  173:invokevirtual   #596 <Method AnnotatedMethod POJOPropertyBuilder.getSetter()>
	//   76  176:aload           9
	//   77  178:invokevirtual   #451 <Method String PropertyName.getSimpleName()>
	//   78  181:invokevirtual   #599 <Method String PropertyNamingStrategy.nameForSetterMethod(MapperConfig, AnnotatedMethod, String)>
	//   79  184:astore          5
				else
	//*  80  186:goto            283
				if(pojopropertybuilder.hasConstructorParameter())
	//*  81  189:aload           6
	//*  82  191:invokevirtual   #602 <Method boolean POJOPropertyBuilder.hasConstructorParameter()>
	//*  83  194:ifeq            220
					s = propertynamingstrategy.nameForConstructorParameter(_config, pojopropertybuilder.getConstructorParameter(), propertyname.getSimpleName());
	//   84  197:aload_2         
	//   85  198:aload_0         
	//   86  199:getfield        #47  <Field MapperConfig _config>
	//   87  202:aload           6
	//   88  204:invokevirtual   #606 <Method AnnotatedParameter POJOPropertyBuilder.getConstructorParameter()>
	//   89  207:aload           9
	//   90  209:invokevirtual   #451 <Method String PropertyName.getSimpleName()>
	//   91  212:invokevirtual   #610 <Method String PropertyNamingStrategy.nameForConstructorParameter(MapperConfig, AnnotatedParameter, String)>
	//   92  215:astore          5
				else
	//*  93  217:goto            283
				if(pojopropertybuilder.hasField())
	//*  94  220:aload           6
	//*  95  222:invokevirtual   #582 <Method boolean POJOPropertyBuilder.hasField()>
	//*  96  225:ifeq            251
				{
					s = propertynamingstrategy.nameForField(_config, pojopropertybuilder.getField(), propertyname.getSimpleName());
	//   97  228:aload_2         
	//   98  229:aload_0         
	//   99  230:getfield        #47  <Field MapperConfig _config>
	//  100  233:aload           6
	//  101  235:invokevirtual   #586 <Method AnnotatedField POJOPropertyBuilder.getField()>
	//  102  238:aload           9
	//  103  240:invokevirtual   #451 <Method String PropertyName.getSimpleName()>
	//  104  243:invokevirtual   #590 <Method String PropertyNamingStrategy.nameForField(MapperConfig, AnnotatedField, String)>
	//  105  246:astore          5
				} else
	//* 106  248:goto            283
				{
					s = ((String) (obj));
	//  107  251:aload           7
	//  108  253:astore          5
					if(pojopropertybuilder.hasGetter())
	//* 109  255:aload           6
	//* 110  257:invokevirtual   #571 <Method boolean POJOPropertyBuilder.hasGetter()>
	//* 111  260:ifeq            283
						s = propertynamingstrategy.nameForGetterMethod(_config, pojopropertybuilder.getGetter(), propertyname.getSimpleName());
	//  112  263:aload_2         
	//  113  264:aload_0         
	//  114  265:getfield        #47  <Field MapperConfig _config>
	//  115  268:aload           6
	//  116  270:invokevirtual   #575 <Method AnnotatedMethod POJOPropertyBuilder.getGetter()>
	//  117  273:aload           9
	//  118  275:invokevirtual   #451 <Method String PropertyName.getSimpleName()>
	//  119  278:invokevirtual   #579 <Method String PropertyNamingStrategy.nameForGetterMethod(MapperConfig, AnnotatedMethod, String)>
	//  120  281:astore          5
				}
			}
			if(s != null && !propertyname.hasSimpleName(s))
	//* 121  283:aload           5
	//* 122  285:ifnull          310
	//* 123  288:aload           9
	//* 124  290:aload           5
	//* 125  292:invokevirtual   #614 <Method boolean PropertyName.hasSimpleName(String)>
	//* 126  295:ifne            310
				pojopropertybuilder = pojopropertybuilder.withSimpleName(s);
	//  127  298:aload           6
	//  128  300:aload           5
	//  129  302:invokevirtual   #618 <Method POJOPropertyBuilder POJOPropertyBuilder.withSimpleName(String)>
	//  130  305:astore          6
			else
	//* 131  307:goto            317
				s = propertyname.getSimpleName();
	//  132  310:aload           9
	//  133  312:invokevirtual   #451 <Method String PropertyName.getSimpleName()>
	//  134  315:astore          5
			POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)map.get(((Object) (s)));
	//  135  317:aload_1         
	//  136  318:aload           5
	//  137  320:invokeinterface #457 <Method Object Map.get(Object)>
	//  138  325:checkcast       #232 <Class POJOPropertyBuilder>
	//  139  328:astore          7
			if(pojopropertybuilder1 == null)
	//* 140  330:aload           7
	//* 141  332:ifnonnull       349
				map.put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//  142  335:aload_1         
	//  143  336:aload           5
	//  144  338:aload           6
	//  145  340:invokeinterface #461 <Method Object Map.put(Object, Object)>
	//  146  345:pop             
			else
	//* 147  346:goto            356
				pojopropertybuilder1.addAll(pojopropertybuilder);
	//  148  349:aload           7
	//  149  351:aload           6
	//  150  353:invokevirtual   #542 <Method void POJOPropertyBuilder.addAll(POJOPropertyBuilder)>
			_updateCreatorProperty(pojopropertybuilder, ((List) (_creatorProperties)));
	//  151  356:aload_0         
	//  152  357:aload           6
	//  153  359:aload_0         
	//  154  360:getfield        #238 <Field LinkedList _creatorProperties>
	//  155  363:invokevirtual   #546 <Method void _updateCreatorProperty(POJOPropertyBuilder, List)>
		}

	//  156  366:iload_3         
	//  157  367:iconst_1        
	//  158  368:iadd            
	//  159  369:istore_3        
	//* 160  370:goto            38
	//  161  373:return          
	}

	protected void _renameWithWrappers(Map map)
	{
		Iterator iterator = map.entrySet().iterator();
	//    0    0:aload_1         
	//    1    1:invokeinterface #511 <Method Set Map.entrySet()>
	//    2    6:invokeinterface #514 <Method Iterator Set.iterator()>
	//    3   11:astore          4
		Object obj = null;
	//    4   13:aconst_null     
	//    5   14:astore_2        
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   15:aload           4
	//    7   17:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//    8   22:ifeq            135
			POJOPropertyBuilder pojopropertybuilder1 = (POJOPropertyBuilder)((java.util.Map.Entry)iterator.next()).getValue();
	//    9   25:aload           4
	//   10   27:invokeinterface #265 <Method Object Iterator.next()>
	//   11   32:checkcast       #516 <Class java.util.Map$Entry>
	//   12   35:invokeinterface #519 <Method Object java.util.Map$Entry.getValue()>
	//   13   40:checkcast       #232 <Class POJOPropertyBuilder>
	//   14   43:astore          5
			AnnotatedMember annotatedmember = pojopropertybuilder1.getPrimaryMember();
	//   15   45:aload           5
	//   16   47:invokevirtual   #624 <Method AnnotatedMember POJOPropertyBuilder.getPrimaryMember()>
	//   17   50:astore_3        
			if(annotatedmember != null)
	//*  18   51:aload_3         
	//*  19   52:ifnonnull       58
	//*  20   55:goto            15
			{
				PropertyName propertyname = _annotationIntrospector.findWrapperName(((Annotated) (annotatedmember)));
	//   21   58:aload_0         
	//   22   59:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//   23   62:aload_3         
	//   24   63:invokevirtual   #627 <Method PropertyName AnnotationIntrospector.findWrapperName(Annotated)>
	//   25   66:astore          6
				if(propertyname != null && propertyname.hasSimpleName() && !propertyname.equals(((Object) (pojopropertybuilder1.getFullName()))))
	//*  26   68:aload           6
	//*  27   70:ifnull          15
	//*  28   73:aload           6
	//*  29   75:invokevirtual   #629 <Method boolean PropertyName.hasSimpleName()>
	//*  30   78:ifne            84
	//*  31   81:goto            15
	//*  32   84:aload           6
	//*  33   86:aload           5
	//*  34   88:invokevirtual   #562 <Method PropertyName POJOPropertyBuilder.getFullName()>
	//*  35   91:invokevirtual   #630 <Method boolean PropertyName.equals(Object)>
	//*  36   94:ifne            15
				{
					LinkedList linkedlist = ((LinkedList) (obj));
	//   37   97:aload_2         
	//   38   98:astore_3        
					if(obj == null)
	//*  39   99:aload_2         
	//*  40  100:ifnonnull       111
						linkedlist = new LinkedList();
	//   41  103:new             #240 <Class LinkedList>
	//   42  106:dup             
	//   43  107:invokespecial   #268 <Method void LinkedList()>
	//   44  110:astore_3        
					linkedlist.add(((Object) (pojopropertybuilder1.withName(propertyname))));
	//   45  111:aload_3         
	//   46  112:aload           5
	//   47  114:aload           6
	//   48  116:invokevirtual   #530 <Method POJOPropertyBuilder POJOPropertyBuilder.withName(PropertyName)>
	//   49  119:invokevirtual   #241 <Method boolean LinkedList.add(Object)>
	//   50  122:pop             
					iterator.remove();
	//   51  123:aload           4
	//   52  125:invokeinterface #494 <Method void Iterator.remove()>
					obj = ((Object) (linkedlist));
	//   53  130:aload_3         
	//   54  131:astore_2        
				}
			}
		} while(true);
	//   55  132:goto            15
		if(obj != null)
	//*  56  135:aload_2         
	//*  57  136:ifnull          209
			for(obj = ((Object) (((LinkedList) (obj)).iterator())); ((Iterator) (obj)).hasNext();)
	//*  58  139:aload_2         
	//*  59  140:invokevirtual   #539 <Method Iterator LinkedList.iterator()>
	//*  60  143:astore_2        
	//*  61  144:aload_2         
	//*  62  145:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  63  150:ifeq            209
			{
				POJOPropertyBuilder pojopropertybuilder = (POJOPropertyBuilder)((Iterator) (obj)).next();
	//   64  153:aload_2         
	//   65  154:invokeinterface #265 <Method Object Iterator.next()>
	//   66  159:checkcast       #232 <Class POJOPropertyBuilder>
	//   67  162:astore_3        
				String s = pojopropertybuilder.getName();
	//   68  163:aload_3         
	//   69  164:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//   70  167:astore          4
				POJOPropertyBuilder pojopropertybuilder2 = (POJOPropertyBuilder)map.get(((Object) (s)));
	//   71  169:aload_1         
	//   72  170:aload           4
	//   73  172:invokeinterface #457 <Method Object Map.get(Object)>
	//   74  177:checkcast       #232 <Class POJOPropertyBuilder>
	//   75  180:astore          5
				if(pojopropertybuilder2 == null)
	//*  76  182:aload           5
	//*  77  184:ifnonnull       200
					map.put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//   78  187:aload_1         
	//   79  188:aload           4
	//   80  190:aload_3         
	//   81  191:invokeinterface #461 <Method Object Map.put(Object, Object)>
	//   82  196:pop             
				else
	//*  83  197:goto            144
					pojopropertybuilder2.addAll(pojopropertybuilder);
	//   84  200:aload           5
	//   85  202:aload_3         
	//   86  203:invokevirtual   #542 <Method void POJOPropertyBuilder.addAll(POJOPropertyBuilder)>
			}

	//*  87  206:goto            144
	//   88  209:return          
	}

	protected void _sortProperties(Map map)
	{
		boolean flag;
		Object obj;
		LinkedHashMap linkedhashmap;
label0:
		{
			obj = ((Object) (_annotationIntrospector));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:astore          5
			Boolean boolean1 = ((AnnotationIntrospector) (obj)).findSerializationSortAlphabetically(((Annotated) (_classDef)));
	//    3    6:aload           5
	//    4    8:aload_0         
	//    5    9:getfield        #67  <Field AnnotatedClass _classDef>
	//    6   12:invokevirtual   #634 <Method Boolean AnnotationIntrospector.findSerializationSortAlphabetically(Annotated)>
	//    7   15:astore          6
			if(boolean1 == null)
	//*   8   17:aload           6
	//*   9   19:ifnonnull       34
				flag = _config.shouldSortPropertiesAlphabetically();
	//   10   22:aload_0         
	//   11   23:getfield        #47  <Field MapperConfig _config>
	//   12   26:invokevirtual   #637 <Method boolean MapperConfig.shouldSortPropertiesAlphabetically()>
	//   13   29:istore          4
			else
	//*  14   31:goto            41
				flag = boolean1.booleanValue();
	//   15   34:aload           6
	//   16   36:invokevirtual   #640 <Method boolean Boolean.booleanValue()>
	//   17   39:istore          4
			String as[] = ((AnnotationIntrospector) (obj)).findSerializationPropertyOrder(_classDef);
	//   18   41:aload           5
	//   19   43:aload_0         
	//   20   44:getfield        #67  <Field AnnotatedClass _classDef>
	//   21   47:invokevirtual   #644 <Method String[] AnnotationIntrospector.findSerializationPropertyOrder(AnnotatedClass)>
	//   22   50:astore          11
			if(!flag && _creatorProperties == null && as == null)
	//*  23   52:iload           4
	//*  24   54:ifne            70
	//*  25   57:aload_0         
	//*  26   58:getfield        #238 <Field LinkedList _creatorProperties>
	//*  27   61:ifnonnull       70
	//*  28   64:aload           11
	//*  29   66:ifnonnull       70
				return;
	//   30   69:return          
			int i = map.size();
	//   31   70:aload_1         
	//   32   71:invokeinterface #549 <Method int Map.size()>
	//   33   76:istore_2        
			if(flag)
	//*  34   77:iload           4
	//*  35   79:ifeq            94
				obj = ((Object) (new TreeMap()));
	//   36   82:new             #646 <Class TreeMap>
	//   37   85:dup             
	//   38   86:invokespecial   #647 <Method void TreeMap()>
	//   39   89:astore          5
			else
	//*  40   91:goto            106
				obj = ((Object) (new LinkedHashMap(i + i)));
	//   41   94:new             #428 <Class LinkedHashMap>
	//   42   97:dup             
	//   43   98:iload_2         
	//   44   99:iload_2         
	//   45  100:iadd            
	//   46  101:invokespecial   #650 <Method void LinkedHashMap(int)>
	//   47  104:astore          5
			POJOPropertyBuilder pojopropertybuilder1;
			for(Iterator iterator = map.values().iterator(); iterator.hasNext(); ((Map) (obj)).put(((Object) (pojopropertybuilder1.getName())), ((Object) (pojopropertybuilder1))))
	//*  48  106:aload_1         
	//*  49  107:invokeinterface #471 <Method Collection Map.values()>
	//*  50  112:invokeinterface #474 <Method Iterator Collection.iterator()>
	//*  51  117:astore          6
	//*  52  119:aload           6
	//*  53  121:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//*  54  126:ifeq            159
				pojopropertybuilder1 = (POJOPropertyBuilder)iterator.next();
	//   55  129:aload           6
	//   56  131:invokeinterface #265 <Method Object Iterator.next()>
	//   57  136:checkcast       #232 <Class POJOPropertyBuilder>
	//   58  139:astore          7

	//   59  141:aload           5
	//   60  143:aload           7
	//   61  145:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//   62  148:aload           7
	//   63  150:invokeinterface #461 <Method Object Map.put(Object, Object)>
	//   64  155:pop             
	//*  65  156:goto            119
			linkedhashmap = new LinkedHashMap(i + i);
	//   66  159:new             #428 <Class LinkedHashMap>
	//   67  162:dup             
	//   68  163:iload_2         
	//   69  164:iload_2         
	//   70  165:iadd            
	//   71  166:invokespecial   #650 <Method void LinkedHashMap(int)>
	//   72  169:astore          10
			if(as == null)
				break label0;
	//   73  171:aload           11
	//   74  173:ifnull          307
			int k = as.length;
	//   75  176:aload           11
	//   76  178:arraylength     
	//   77  179:istore_3        
			for(int j = 0; j < k; j++)
	//*  78  180:iconst_0        
	//*  79  181:istore_2        
	//*  80  182:iload_2         
	//*  81  183:iload_3         
	//*  82  184:icmpge          307
			{
				POJOPropertyBuilder pojopropertybuilder;
				String s;
label1:
				{
					String s1 = as[j];
	//   83  187:aload           11
	//   84  189:iload_2         
	//   85  190:aaload          
	//   86  191:astore          8
					POJOPropertyBuilder pojopropertybuilder4 = (POJOPropertyBuilder)((Map) (obj)).get(((Object) (s1)));
	//   87  193:aload           5
	//   88  195:aload           8
	//   89  197:invokeinterface #457 <Method Object Map.get(Object)>
	//   90  202:checkcast       #232 <Class POJOPropertyBuilder>
	//   91  205:astore          9
					s = s1;
	//   92  207:aload           8
	//   93  209:astore          7
					pojopropertybuilder = pojopropertybuilder4;
	//   94  211:aload           9
	//   95  213:astore          6
					if(pojopropertybuilder4 != null)
						break label1;
	//   96  215:aload           9
	//   97  217:ifnonnull       283
					Iterator iterator2 = map.values().iterator();
	//   98  220:aload_1         
	//   99  221:invokeinterface #471 <Method Collection Map.values()>
	//  100  226:invokeinterface #474 <Method Iterator Collection.iterator()>
	//  101  231:astore          12
					do
					{
						s = s1;
	//  102  233:aload           8
	//  103  235:astore          7
						pojopropertybuilder = pojopropertybuilder4;
	//  104  237:aload           9
	//  105  239:astore          6
						if(!iterator2.hasNext())
							break label1;
	//  106  241:aload           12
	//  107  243:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//  108  248:ifeq            283
						pojopropertybuilder = (POJOPropertyBuilder)iterator2.next();
	//  109  251:aload           12
	//  110  253:invokeinterface #265 <Method Object Iterator.next()>
	//  111  258:checkcast       #232 <Class POJOPropertyBuilder>
	//  112  261:astore          6
					} while(!s1.equals(((Object) (pojopropertybuilder.getInternalName()))));
	//  113  263:aload           8
	//  114  265:aload           6
	//  115  267:invokevirtual   #653 <Method String POJOPropertyBuilder.getInternalName()>
	//  116  270:invokevirtual   #654 <Method boolean String.equals(Object)>
	//  117  273:ifeq            233
					s = pojopropertybuilder.getName();
	//  118  276:aload           6
	//  119  278:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//  120  281:astore          7
				}
				if(pojopropertybuilder != null)
	//* 121  283:aload           6
	//* 122  285:ifnull          300
					((Map) (linkedhashmap)).put(((Object) (s)), ((Object) (pojopropertybuilder)));
	//  123  288:aload           10
	//  124  290:aload           7
	//  125  292:aload           6
	//  126  294:invokeinterface #461 <Method Object Map.put(Object, Object)>
	//  127  299:pop             
			}

	//  128  300:iload_2         
	//  129  301:iconst_1        
	//  130  302:iadd            
	//  131  303:istore_2        
		}
	//* 132  304:goto            182
		Object obj1 = ((Object) (_creatorProperties));
	//  133  307:aload_0         
	//  134  308:getfield        #238 <Field LinkedList _creatorProperties>
	//  135  311:astore          6
		if(obj1 != null)
	//* 136  313:aload           6
	//* 137  315:ifnull          451
		{
			if(flag)
	//* 138  318:iload           4
	//* 139  320:ifeq            386
			{
				obj1 = ((Object) (new TreeMap()));
	//  140  323:new             #646 <Class TreeMap>
	//  141  326:dup             
	//  142  327:invokespecial   #647 <Method void TreeMap()>
	//  143  330:astore          6
				POJOPropertyBuilder pojopropertybuilder3;
				for(Iterator iterator1 = _creatorProperties.iterator(); iterator1.hasNext(); ((TreeMap) (obj1)).put(((Object) (pojopropertybuilder3.getName())), ((Object) (pojopropertybuilder3))))
	//* 144  332:aload_0         
	//* 145  333:getfield        #238 <Field LinkedList _creatorProperties>
	//* 146  336:invokevirtual   #539 <Method Iterator LinkedList.iterator()>
	//* 147  339:astore          7
	//* 148  341:aload           7
	//* 149  343:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//* 150  348:ifeq            379
					pojopropertybuilder3 = (POJOPropertyBuilder)iterator1.next();
	//  151  351:aload           7
	//  152  353:invokeinterface #265 <Method Object Iterator.next()>
	//  153  358:checkcast       #232 <Class POJOPropertyBuilder>
	//  154  361:astore          8

	//  155  363:aload           6
	//  156  365:aload           8
	//  157  367:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//  158  370:aload           8
	//  159  372:invokevirtual   #655 <Method Object TreeMap.put(Object, Object)>
	//  160  375:pop             
	//* 161  376:goto            341
				obj1 = ((Object) (((TreeMap) (obj1)).values()));
	//  162  379:aload           6
	//  163  381:invokevirtual   #656 <Method Collection TreeMap.values()>
	//  164  384:astore          6
			}
			obj1 = ((Object) (((Collection) (obj1)).iterator()));
	//  165  386:aload           6
	//  166  388:invokeinterface #474 <Method Iterator Collection.iterator()>
	//  167  393:astore          6
			do
			{
				if(!((Iterator) (obj1)).hasNext())
					break;
	//  168  395:aload           6
	//  169  397:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//  170  402:ifeq            451
				POJOPropertyBuilder pojopropertybuilder2 = (POJOPropertyBuilder)((Iterator) (obj1)).next();
	//  171  405:aload           6
	//  172  407:invokeinterface #265 <Method Object Iterator.next()>
	//  173  412:checkcast       #232 <Class POJOPropertyBuilder>
	//  174  415:astore          7
				String s2 = pojopropertybuilder2.getName();
	//  175  417:aload           7
	//  176  419:invokevirtual   #485 <Method String POJOPropertyBuilder.getName()>
	//  177  422:astore          8
				if(((Map) (obj)).containsKey(((Object) (s2))))
	//* 178  424:aload           5
	//* 179  426:aload           8
	//* 180  428:invokeinterface #659 <Method boolean Map.containsKey(Object)>
	//* 181  433:ifeq            395
					((Map) (linkedhashmap)).put(((Object) (s2)), ((Object) (pojopropertybuilder2)));
	//  182  436:aload           10
	//  183  438:aload           8
	//  184  440:aload           7
	//  185  442:invokeinterface #461 <Method Object Map.put(Object, Object)>
	//  186  447:pop             
			} while(true);
	//  187  448:goto            395
		}
		((Map) (linkedhashmap)).putAll(((Map) (obj)));
	//  188  451:aload           10
	//  189  453:aload           5
	//  190  455:invokeinterface #662 <Method void Map.putAll(Map)>
		map.clear();
	//  191  460:aload_1         
	//  192  461:invokeinterface #558 <Method void Map.clear()>
		map.putAll(((Map) (linkedhashmap)));
	//  193  466:aload_1         
	//  194  467:aload           10
	//  195  469:invokeinterface #662 <Method void Map.putAll(Map)>
	//  196  474:return          
	}

	protected void _updateCreatorProperty(POJOPropertyBuilder pojopropertybuilder, List list)
	{
		if(list != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          60
		{
			int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_3        
			for(int j = list.size(); i < j; i++)
	//*   4    6:aload_2         
	//*   5    7:invokeinterface #663 <Method int List.size()>
	//*   6   12:istore          4
	//*   7   14:iload_3         
	//*   8   15:iload           4
	//*   9   17:icmpge          60
				if(((POJOPropertyBuilder)list.get(i)).getInternalName().equals(((Object) (pojopropertybuilder.getInternalName()))))
	//*  10   20:aload_2         
	//*  11   21:iload_3         
	//*  12   22:invokeinterface #666 <Method Object List.get(int)>
	//*  13   27:checkcast       #232 <Class POJOPropertyBuilder>
	//*  14   30:invokevirtual   #653 <Method String POJOPropertyBuilder.getInternalName()>
	//*  15   33:aload_1         
	//*  16   34:invokevirtual   #653 <Method String POJOPropertyBuilder.getInternalName()>
	//*  17   37:invokevirtual   #654 <Method boolean String.equals(Object)>
	//*  18   40:ifeq            53
				{
					list.set(i, ((Object) (pojopropertybuilder)));
	//   19   43:aload_2         
	//   20   44:iload_3         
	//   21   45:aload_1         
	//   22   46:invokeinterface #669 <Method Object List.set(int, Object)>
	//   23   51:pop             
					return;
	//   24   52:return          
				}

	//   25   53:iload_3         
	//   26   54:iconst_1        
	//   27   55:iadd            
	//   28   56:istore_3        
		}
	//*  29   57:goto            14
	//   30   60:return          
	}

	protected void collectAll()
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #428 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #429 <Method void LinkedHashMap()>
	//    3    7:astore_1        
		_addFields(((Map) (linkedhashmap)));
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:invokevirtual   #673 <Method void _addFields(Map)>
		_addMethods(((Map) (linkedhashmap)));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #675 <Method void _addMethods(Map)>
		if(!_classDef.isNonStaticInnerClass())
	//*  10   18:aload_0         
	//*  11   19:getfield        #67  <Field AnnotatedClass _classDef>
	//*  12   22:invokevirtual   #678 <Method boolean AnnotatedClass.isNonStaticInnerClass()>
	//*  13   25:ifne            33
			_addCreators(((Map) (linkedhashmap)));
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #680 <Method void _addCreators(Map)>
		_addInjectables(((Map) (linkedhashmap)));
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #682 <Method void _addInjectables(Map)>
		_removeUnwantedProperties(((Map) (linkedhashmap)));
	//   20   38:aload_0         
	//   21   39:aload_1         
	//   22   40:invokevirtual   #684 <Method void _removeUnwantedProperties(Map)>
		_removeUnwantedAccessor(((Map) (linkedhashmap)));
	//   23   43:aload_0         
	//   24   44:aload_1         
	//   25   45:invokevirtual   #686 <Method void _removeUnwantedAccessor(Map)>
		_renameProperties(((Map) (linkedhashmap)));
	//   26   48:aload_0         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #688 <Method void _renameProperties(Map)>
		for(Iterator iterator = linkedhashmap.values().iterator(); iterator.hasNext(); ((POJOPropertyBuilder)iterator.next()).mergeAnnotations(_forSerialization));
	//   29   53:aload_1         
	//   30   54:invokevirtual   #689 <Method Collection LinkedHashMap.values()>
	//   31   57:invokeinterface #474 <Method Iterator Collection.iterator()>
	//   32   62:astore_2        
	//   33   63:aload_2         
	//   34   64:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   35   69:ifeq            91
	//   36   72:aload_2         
	//   37   73:invokeinterface #265 <Method Object Iterator.next()>
	//   38   78:checkcast       #232 <Class POJOPropertyBuilder>
	//   39   81:aload_0         
	//   40   82:getfield        #63  <Field boolean _forSerialization>
	//   41   85:invokevirtual   #693 <Method void POJOPropertyBuilder.mergeAnnotations(boolean)>
	//*  42   88:goto            63
		PropertyNamingStrategy propertynamingstrategy = _findNamingStrategy();
	//   43   91:aload_0         
	//   44   92:invokespecial   #695 <Method PropertyNamingStrategy _findNamingStrategy()>
	//   45   95:astore_2        
		if(propertynamingstrategy != null)
	//*  46   96:aload_2         
	//*  47   97:ifnull          106
			_renameUsing(((Map) (linkedhashmap)), propertynamingstrategy);
	//   48  100:aload_0         
	//   49  101:aload_1         
	//   50  102:aload_2         
	//   51  103:invokevirtual   #697 <Method void _renameUsing(Map, PropertyNamingStrategy)>
		for(Iterator iterator1 = linkedhashmap.values().iterator(); iterator1.hasNext(); ((POJOPropertyBuilder)iterator1.next()).trimByVisibility());
	//   52  106:aload_1         
	//   53  107:invokevirtual   #689 <Method Collection LinkedHashMap.values()>
	//   54  110:invokeinterface #474 <Method Iterator Collection.iterator()>
	//   55  115:astore_2        
	//   56  116:aload_2         
	//   57  117:invokeinterface #261 <Method boolean Iterator.hasNext()>
	//   58  122:ifeq            140
	//   59  125:aload_2         
	//   60  126:invokeinterface #265 <Method Object Iterator.next()>
	//   61  131:checkcast       #232 <Class POJOPropertyBuilder>
	//   62  134:invokevirtual   #700 <Method void POJOPropertyBuilder.trimByVisibility()>
	//*  63  137:goto            116
		if(_config.isEnabled(MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME))
	//*  64  140:aload_0         
	//*  65  141:getfield        #47  <Field MapperConfig _config>
	//*  66  144:getstatic       #703 <Field MapperFeature MapperFeature.USE_WRAPPER_NAME_AS_PROPERTY_NAME>
	//*  67  147:invokevirtual   #59  <Method boolean MapperConfig.isEnabled(MapperFeature)>
	//*  68  150:ifeq            158
			_renameWithWrappers(((Map) (linkedhashmap)));
	//   69  153:aload_0         
	//   70  154:aload_1         
	//   71  155:invokevirtual   #705 <Method void _renameWithWrappers(Map)>
		_sortProperties(((Map) (linkedhashmap)));
	//   72  158:aload_0         
	//   73  159:aload_1         
	//   74  160:invokevirtual   #707 <Method void _sortProperties(Map)>
		_properties = linkedhashmap;
	//   75  163:aload_0         
	//   76  164:aload_1         
	//   77  165:putfield        #709 <Field LinkedHashMap _properties>
		_collected = true;
	//   78  168:aload_0         
	//   79  169:iconst_1        
	//   80  170:putfield        #711 <Field boolean _collected>
	//   81  173:return          
	}

	public AnnotatedMember getAnyGetter()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #711 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #714 <Method void collectAll()>
		LinkedList linkedlist = _anyGetters;
	//    5   11:aload_0         
	//    6   12:getfield        #364 <Field LinkedList _anyGetters>
	//    7   15:astore_1        
		if(linkedlist != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          72
		{
			if(linkedlist.size() > 1)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #715 <Method int LinkedList.size()>
	//*  12   24:iconst_1        
	//*  13   25:icmple          61
				reportProblem("Multiple 'any-getters' defined (%s vs %s)", new Object[] {
					_anyGetters.get(0), _anyGetters.get(1)
				});
	//   14   28:aload_0         
	//   15   29:ldc2            #717 <String "Multiple 'any-getters' defined (%s vs %s)">
	//   16   32:iconst_2        
	//   17   33:anewarray       Object[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:getfield        #364 <Field LinkedList _anyGetters>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   24   46:aastore         
	//   25   47:dup             
	//   26   48:iconst_1        
	//   27   49:aload_0         
	//   28   50:getfield        #364 <Field LinkedList _anyGetters>
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   31   57:aastore         
	//   32   58:invokevirtual   #722 <Method void reportProblem(String, Object[])>
			return (AnnotatedMember)_anyGetters.getFirst();
	//   33   61:aload_0         
	//   34   62:getfield        #364 <Field LinkedList _anyGetters>
	//   35   65:invokevirtual   #725 <Method Object LinkedList.getFirst()>
	//   36   68:checkcast       #435 <Class AnnotatedMember>
	//   37   71:areturn         
		} else
		{
			return null;
	//   38   72:aconst_null     
	//   39   73:areturn         
		}
	}

	public AnnotatedMember getAnySetterField()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #711 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #714 <Method void collectAll()>
		LinkedList linkedlist = _anySetterField;
	//    5   11:aload_0         
	//    6   12:getfield        #322 <Field LinkedList _anySetterField>
	//    7   15:astore_1        
		if(linkedlist != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          72
		{
			if(linkedlist.size() > 1)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #715 <Method int LinkedList.size()>
	//*  12   24:iconst_1        
	//*  13   25:icmple          61
				reportProblem("Multiple 'any-setter' fields defined (%s vs %s)", new Object[] {
					_anySetterField.get(0), _anySetterField.get(1)
				});
	//   14   28:aload_0         
	//   15   29:ldc2            #728 <String "Multiple 'any-setter' fields defined (%s vs %s)">
	//   16   32:iconst_2        
	//   17   33:anewarray       Object[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:getfield        #322 <Field LinkedList _anySetterField>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   24   46:aastore         
	//   25   47:dup             
	//   26   48:iconst_1        
	//   27   49:aload_0         
	//   28   50:getfield        #322 <Field LinkedList _anySetterField>
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   31   57:aastore         
	//   32   58:invokevirtual   #722 <Method void reportProblem(String, Object[])>
			return (AnnotatedMember)_anySetterField.getFirst();
	//   33   61:aload_0         
	//   34   62:getfield        #322 <Field LinkedList _anySetterField>
	//   35   65:invokevirtual   #725 <Method Object LinkedList.getFirst()>
	//   36   68:checkcast       #435 <Class AnnotatedMember>
	//   37   71:areturn         
		} else
		{
			return null;
	//   38   72:aconst_null     
	//   39   73:areturn         
		}
	}

	public AnnotatedMethod getAnySetterMethod()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #711 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #714 <Method void collectAll()>
		LinkedList linkedlist = _anySetters;
	//    5   11:aload_0         
	//    6   12:getfield        #410 <Field LinkedList _anySetters>
	//    7   15:astore_1        
		if(linkedlist != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          72
		{
			if(linkedlist.size() > 1)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #715 <Method int LinkedList.size()>
	//*  12   24:iconst_1        
	//*  13   25:icmple          61
				reportProblem("Multiple 'any-setter' methods defined (%s vs %s)", new Object[] {
					_anySetters.get(0), _anySetters.get(1)
				});
	//   14   28:aload_0         
	//   15   29:ldc2            #731 <String "Multiple 'any-setter' methods defined (%s vs %s)">
	//   16   32:iconst_2        
	//   17   33:anewarray       Object[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:getfield        #410 <Field LinkedList _anySetters>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   24   46:aastore         
	//   25   47:dup             
	//   26   48:iconst_1        
	//   27   49:aload_0         
	//   28   50:getfield        #410 <Field LinkedList _anySetters>
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   31   57:aastore         
	//   32   58:invokevirtual   #722 <Method void reportProblem(String, Object[])>
			return (AnnotatedMethod)_anySetters.getFirst();
	//   33   61:aload_0         
	//   34   62:getfield        #410 <Field LinkedList _anySetters>
	//   35   65:invokevirtual   #725 <Method Object LinkedList.getFirst()>
	//   36   68:checkcast       #283 <Class AnnotatedMethod>
	//   37   71:areturn         
		} else
		{
			return null;
	//   38   72:aconst_null     
	//   39   73:areturn         
		}
	}

	public AnnotatedClass getClassDef()
	{
		return _classDef;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field AnnotatedClass _classDef>
	//    2    4:areturn         
	}

	public MapperConfig getConfig()
	{
		return _config;
	//    0    0:aload_0         
	//    1    1:getfield        #47  <Field MapperConfig _config>
	//    2    4:areturn         
	}

	public Set getIgnoredPropertyNames()
	{
		return ((Set) (_ignoredPropertyNames));
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field HashSet _ignoredPropertyNames>
	//    2    4:areturn         
	}

	public Map getInjectables()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #711 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #714 <Method void collectAll()>
		return ((Map) (_injectables));
	//    5   11:aload_0         
	//    6   12:getfield        #426 <Field LinkedHashMap _injectables>
	//    7   15:areturn         
	}

	public AnnotatedMember getJsonValueAccessor()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #711 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #714 <Method void collectAll()>
		LinkedList linkedlist = _jsonValueAccessors;
	//    5   11:aload_0         
	//    6   12:getfield        #317 <Field LinkedList _jsonValueAccessors>
	//    7   15:astore_1        
		if(linkedlist != null)
	//*   8   16:aload_1         
	//*   9   17:ifnull          73
		{
			if(linkedlist.size() > 1)
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #715 <Method int LinkedList.size()>
	//*  12   24:iconst_1        
	//*  13   25:icmple          61
				reportProblem("Multiple 'as-value' properties defined (%s vs %s)", new Object[] {
					_jsonValueAccessors.get(0), _jsonValueAccessors.get(1)
				});
	//   14   28:aload_0         
	//   15   29:ldc2            #744 <String "Multiple 'as-value' properties defined (%s vs %s)">
	//   16   32:iconst_2        
	//   17   33:anewarray       Object[]
	//   18   36:dup             
	//   19   37:iconst_0        
	//   20   38:aload_0         
	//   21   39:getfield        #317 <Field LinkedList _jsonValueAccessors>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   24   46:aastore         
	//   25   47:dup             
	//   26   48:iconst_1        
	//   27   49:aload_0         
	//   28   50:getfield        #317 <Field LinkedList _jsonValueAccessors>
	//   29   53:iconst_1        
	//   30   54:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   31   57:aastore         
	//   32   58:invokevirtual   #722 <Method void reportProblem(String, Object[])>
			return (AnnotatedMember)_jsonValueAccessors.get(0);
	//   33   61:aload_0         
	//   34   62:getfield        #317 <Field LinkedList _jsonValueAccessors>
	//   35   65:iconst_0        
	//   36   66:invokevirtual   #718 <Method Object LinkedList.get(int)>
	//   37   69:checkcast       #435 <Class AnnotatedMember>
	//   38   72:areturn         
		} else
		{
			return null;
	//   39   73:aconst_null     
	//   40   74:areturn         
		}
	}

	public ObjectIdInfo getObjectIdInfo()
	{
		ObjectIdInfo objectidinfo1 = _annotationIntrospector.findObjectIdInfo(((Annotated) (_classDef)));
	//    0    0:aload_0         
	//    1    1:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//    2    4:aload_0         
	//    3    5:getfield        #67  <Field AnnotatedClass _classDef>
	//    4    8:invokevirtual   #750 <Method ObjectIdInfo AnnotationIntrospector.findObjectIdInfo(Annotated)>
	//    5   11:astore_2        
		ObjectIdInfo objectidinfo = objectidinfo1;
	//    6   12:aload_2         
	//    7   13:astore_1        
		if(objectidinfo1 != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          31
			objectidinfo = _annotationIntrospector.findObjectReferenceInfo(((Annotated) (_classDef)), objectidinfo1);
	//   10   18:aload_0         
	//   11   19:getfield        #83  <Field AnnotationIntrospector _annotationIntrospector>
	//   12   22:aload_0         
	//   13   23:getfield        #67  <Field AnnotatedClass _classDef>
	//   14   26:aload_2         
	//   15   27:invokevirtual   #754 <Method ObjectIdInfo AnnotationIntrospector.findObjectReferenceInfo(Annotated, ObjectIdInfo)>
	//   16   30:astore_1        
		return objectidinfo;
	//   17   31:aload_1         
	//   18   32:areturn         
	}

	public List getProperties()
	{
		return ((List) (new ArrayList(getPropertyMap().values())));
	//    0    0:new             #757 <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #760 <Method Map getPropertyMap()>
	//    4    8:invokeinterface #471 <Method Collection Map.values()>
	//    5   13:invokespecial   #763 <Method void ArrayList(Collection)>
	//    6   16:areturn         
	}

	protected Map getPropertyMap()
	{
		if(!_collected)
	//*   0    0:aload_0         
	//*   1    1:getfield        #711 <Field boolean _collected>
	//*   2    4:ifne            11
			collectAll();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #714 <Method void collectAll()>
		return ((Map) (_properties));
	//    5   11:aload_0         
	//    6   12:getfield        #709 <Field LinkedHashMap _properties>
	//    7   15:areturn         
	}

	public JavaType getType()
	{
		return _type;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field JavaType _type>
	//    2    4:areturn         
	}

	protected transient void reportProblem(String s, Object aobj[])
	{
		String s1 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(aobj.length > 0)
	//*   2    2:aload_2         
	//*   3    3:arraylength     
	//*   4    4:ifle            13
			s1 = String.format(s, aobj);
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:invokestatic    #771 <Method String String.format(String, Object[])>
	//    8   12:astore_3        
		s = ((String) (new StringBuilder()));
	//    9   13:new             #152 <Class StringBuilder>
	//   10   16:dup             
	//   11   17:invokespecial   #153 <Method void StringBuilder()>
	//   12   20:astore_1        
		((StringBuilder) (s)).append("Problem with definition of ");
	//   13   21:aload_1         
	//   14   22:ldc2            #773 <String "Problem with definition of ">
	//   15   25:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   16   28:pop             
		((StringBuilder) (s)).append(((Object) (_classDef)));
	//   17   29:aload_1         
	//   18   30:aload_0         
	//   19   31:getfield        #67  <Field AnnotatedClass _classDef>
	//   20   34:invokevirtual   #776 <Method StringBuilder StringBuilder.append(Object)>
	//   21   37:pop             
		((StringBuilder) (s)).append(": ");
	//   22   38:aload_1         
	//   23   39:ldc2            #778 <String ": ">
	//   24   42:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   25   45:pop             
		((StringBuilder) (s)).append(s1);
	//   26   46:aload_1         
	//   27   47:aload_3         
	//   28   48:invokevirtual   #159 <Method StringBuilder StringBuilder.append(String)>
	//   29   51:pop             
		throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   30   52:new             #447 <Class IllegalArgumentException>
	//   31   55:dup             
	//   32   56:aload_1         
	//   33   57:invokevirtual   #170 <Method String StringBuilder.toString()>
	//   34   60:invokespecial   #448 <Method void IllegalArgumentException(String)>
	//   35   63:athrow          
	}

	protected final AnnotationIntrospector _annotationIntrospector;
	protected LinkedList _anyGetters;
	protected LinkedList _anySetterField;
	protected LinkedList _anySetters;
	protected final AnnotatedClass _classDef;
	protected boolean _collected;
	protected final MapperConfig _config;
	protected LinkedList _creatorProperties;
	protected final boolean _forSerialization;
	protected HashSet _ignoredPropertyNames;
	protected LinkedHashMap _injectables;
	protected LinkedList _jsonValueAccessors;
	protected final String _mutatorPrefix;
	protected LinkedHashMap _properties;
	protected final boolean _stdBeanNaming;
	protected final JavaType _type;
	protected final boolean _useAnnotations;
	protected final VisibilityChecker _visibilityChecker;
}
