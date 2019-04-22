// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind:
//			JavaType, JsonMappingException

public abstract class DatabindContext
{

	public DatabindContext()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Object()>
	//    2    4:return          
	}

	protected String _colonConcat(String s, String s1)
	{
		if(s1 == null)
	//*   0    0:aload_2         
	//*   1    1:ifnonnull       6
		{
			return s;
	//    2    4:aload_1         
	//    3    5:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    4    6:new             #13  <Class StringBuilder>
	//    5    9:dup             
	//    6   10:invokespecial   #14  <Method void StringBuilder()>
	//    7   13:astore_3        
			stringbuilder.append(s);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   11   19:pop             
			stringbuilder.append(": ");
	//   12   20:aload_3         
	//   13   21:ldc1            #20  <String ": ">
	//   14   23:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   15   26:pop             
			stringbuilder.append(s1);
	//   16   27:aload_3         
	//   17   28:aload_2         
	//   18   29:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   19   32:pop             
			return stringbuilder.toString();
	//   20   33:aload_3         
	//   21   34:invokevirtual   #24  <Method String StringBuilder.toString()>
	//   22   37:areturn         
		}
	}

	protected final transient String _format(String s, Object aobj[])
	{
		if(aobj.length > 0)
	//*   0    0:aload_2         
	//*   1    1:arraylength     
	//*   2    2:ifle            11
			return String.format(s, aobj);
	//    3    5:aload_1         
	//    4    6:aload_2         
	//    5    7:invokestatic    #31  <Method String String.format(String, Object[])>
	//    6   10:areturn         
		else
			return s;
	//    7   11:aload_1         
	//    8   12:areturn         
	}

	protected String _quotedString(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
			return "[N/A]";
	//    2    4:ldc1            #35  <String "[N/A]">
	//    3    6:areturn         
		else
			return String.format("\"%s\"", new Object[] {
				_truncate(s)
			});
	//    4    7:ldc1            #37  <String "\"%s\"">
	//    5    9:iconst_1        
	//    6   10:anewarray       Object[]
	//    7   13:dup             
	//    8   14:iconst_0        
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:invokevirtual   #40  <Method String _truncate(String)>
	//   12   20:aastore         
	//   13   21:invokestatic    #31  <Method String String.format(String, Object[])>
	//   14   24:areturn         
	}

	protected final String _truncate(String s)
	{
		if(s == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #42  <String "">
	//    3    6:areturn         
		if(s.length() <= 500)
	//*   4    7:aload_1         
	//*   5    8:invokevirtual   #46  <Method int String.length()>
	//*   6   11:sipush          500
	//*   7   14:icmpgt          19
		{
			return s;
	//    8   17:aload_1         
	//    9   18:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   10   19:new             #13  <Class StringBuilder>
	//   11   22:dup             
	//   12   23:invokespecial   #14  <Method void StringBuilder()>
	//   13   26:astore_2        
			stringbuilder.append(s.substring(0, 500));
	//   14   27:aload_2         
	//   15   28:aload_1         
	//   16   29:iconst_0        
	//   17   30:sipush          500
	//   18   33:invokevirtual   #50  <Method String String.substring(int, int)>
	//   19   36:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   20   39:pop             
			stringbuilder.append("]...[");
	//   21   40:aload_2         
	//   22   41:ldc1            #52  <String "]...[">
	//   23   43:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   24   46:pop             
			stringbuilder.append(s.substring(s.length() - 500));
	//   25   47:aload_2         
	//   26   48:aload_1         
	//   27   49:aload_1         
	//   28   50:invokevirtual   #46  <Method int String.length()>
	//   29   53:sipush          500
	//   30   56:isub            
	//   31   57:invokevirtual   #55  <Method String String.substring(int)>
	//   32   60:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   33   63:pop             
			return stringbuilder.toString();
	//   34   64:aload_2         
	//   35   65:invokevirtual   #24  <Method String StringBuilder.toString()>
	//   36   68:areturn         
		}
	}

	public JavaType constructSpecializedType(JavaType javatype, Class class1)
	{
		if(javatype.getRawClass() == class1)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #63  <Method Class JavaType.getRawClass()>
	//*   2    4:aload_2         
	//*   3    5:if_acmpne       10
			return javatype;
	//    4    8:aload_1         
	//    5    9:areturn         
		else
			return getConfig().constructSpecializedType(javatype, class1);
	//    6   10:aload_0         
	//    7   11:invokevirtual   #67  <Method MapperConfig getConfig()>
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #71  <Method JavaType MapperConfig.constructSpecializedType(JavaType, Class)>
	//   11   19:areturn         
	}

	public JavaType constructType(Type type)
	{
		if(type == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return getTypeFactory().constructType(type);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #79  <Method TypeFactory getTypeFactory()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #83  <Method JavaType TypeFactory.constructType(Type)>
	//    8   14:areturn         
	}

	public Converter converterInstance(Annotated annotated, Object obj)
		throws JsonMappingException
	{
		Object obj1 = null;
	//    0    0:aconst_null     
	//    1    1:astore_3        
		if(obj == null)
	//*   2    2:aload_2         
	//*   3    3:ifnonnull       8
			return null;
	//    4    6:aconst_null     
	//    5    7:areturn         
		if(obj instanceof Converter)
	//*   6    8:aload_2         
	//*   7    9:instanceof      #89  <Class Converter>
	//*   8   12:ifeq            20
			return (Converter)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #89  <Class Converter>
	//   11   19:areturn         
		if(obj instanceof Class)
	//*  12   20:aload_2         
	//*  13   21:instanceof      #91  <Class Class>
	//*  14   24:ifeq            159
		{
			Class class1 = (Class)obj;
	//   15   27:aload_2         
	//   16   28:checkcast       #91  <Class Class>
	//   17   31:astore          4
			if(class1 != com/fasterxml/jackson/databind/util/Converter$None)
	//*  18   33:aload           4
	//*  19   35:ldc1            #93  <Class com.fasterxml.jackson.databind.util.Converter$None>
	//*  20   37:if_acmpeq       157
			{
				if(ClassUtil.isBogusClass(class1))
	//*  21   40:aload           4
	//*  22   42:invokestatic    #99  <Method boolean ClassUtil.isBogusClass(Class)>
	//*  23   45:ifeq            50
					return null;
	//   24   48:aconst_null     
	//   25   49:areturn         
				if(((Class) (com/fasterxml/jackson/databind/util/Converter)).isAssignableFrom(class1))
	//*  26   50:ldc1            #89  <Class Converter>
	//*  27   52:aload           4
	//*  28   54:invokevirtual   #102 <Method boolean Class.isAssignableFrom(Class)>
	//*  29   57:ifeq            113
				{
					MapperConfig mapperconfig = getConfig();
	//   30   60:aload_0         
	//   31   61:invokevirtual   #67  <Method MapperConfig getConfig()>
	//   32   64:astore          5
					obj = ((Object) (mapperconfig.getHandlerInstantiator()));
	//   33   66:aload           5
	//   34   68:invokevirtual   #106 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//   35   71:astore_2        
					if(obj == null)
	//*  36   72:aload_2         
	//*  37   73:ifnonnull       81
						annotated = ((Annotated) (obj1));
	//   38   76:aload_3         
	//   39   77:astore_1        
					else
	//*  40   78:goto            91
						annotated = ((Annotated) (((HandlerInstantiator) (obj)).converterInstance(mapperconfig, annotated, class1)));
	//   41   81:aload_2         
	//   42   82:aload           5
	//   43   84:aload_1         
	//   44   85:aload           4
	//   45   87:invokevirtual   #111 <Method Converter HandlerInstantiator.converterInstance(MapperConfig, Annotated, Class)>
	//   46   90:astore_1        
					obj = ((Object) (annotated));
	//   47   91:aload_1         
	//   48   92:astore_2        
					if(annotated == null)
	//*  49   93:aload_1         
	//*  50   94:ifnonnull       111
						obj = ((Object) ((Converter)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers())));
	//   51   97:aload           4
	//   52   99:aload           5
	//   53  101:invokevirtual   #115 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   54  104:invokestatic    #119 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   55  107:checkcast       #89  <Class Converter>
	//   56  110:astore_2        
					return ((Converter) (obj));
	//   57  111:aload_2         
	//   58  112:areturn         
				} else
				{
					annotated = ((Annotated) (new StringBuilder()));
	//   59  113:new             #13  <Class StringBuilder>
	//   60  116:dup             
	//   61  117:invokespecial   #14  <Method void StringBuilder()>
	//   62  120:astore_1        
					((StringBuilder) (annotated)).append("AnnotationIntrospector returned Class ");
	//   63  121:aload_1         
	//   64  122:ldc1            #121 <String "AnnotationIntrospector returned Class ">
	//   65  124:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   66  127:pop             
					((StringBuilder) (annotated)).append(class1.getName());
	//   67  128:aload_1         
	//   68  129:aload           4
	//   69  131:invokevirtual   #124 <Method String Class.getName()>
	//   70  134:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   71  137:pop             
					((StringBuilder) (annotated)).append("; expected Class<Converter>");
	//   72  138:aload_1         
	//   73  139:ldc1            #126 <String "; expected Class<Converter>">
	//   74  141:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   75  144:pop             
					throw new IllegalStateException(((StringBuilder) (annotated)).toString());
	//   76  145:new             #128 <Class IllegalStateException>
	//   77  148:dup             
	//   78  149:aload_1         
	//   79  150:invokevirtual   #24  <Method String StringBuilder.toString()>
	//   80  153:invokespecial   #131 <Method void IllegalStateException(String)>
	//   81  156:athrow          
				}
			} else
			{
				return null;
	//   82  157:aconst_null     
	//   83  158:areturn         
			}
		} else
		{
			annotated = ((Annotated) (new StringBuilder()));
	//   84  159:new             #13  <Class StringBuilder>
	//   85  162:dup             
	//   86  163:invokespecial   #14  <Method void StringBuilder()>
	//   87  166:astore_1        
			((StringBuilder) (annotated)).append("AnnotationIntrospector returned Converter definition of type ");
	//   88  167:aload_1         
	//   89  168:ldc1            #133 <String "AnnotationIntrospector returned Converter definition of type ">
	//   90  170:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   91  173:pop             
			((StringBuilder) (annotated)).append(obj.getClass().getName());
	//   92  174:aload_1         
	//   93  175:aload_2         
	//   94  176:invokevirtual   #136 <Method Class Object.getClass()>
	//   95  179:invokevirtual   #124 <Method String Class.getName()>
	//   96  182:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//   97  185:pop             
			((StringBuilder) (annotated)).append("; expected type Converter or Class<Converter> instead");
	//   98  186:aload_1         
	//   99  187:ldc1            #138 <String "; expected type Converter or Class<Converter> instead">
	//  100  189:invokevirtual   #18  <Method StringBuilder StringBuilder.append(String)>
	//  101  192:pop             
			throw new IllegalStateException(((StringBuilder) (annotated)).toString());
	//  102  193:new             #128 <Class IllegalStateException>
	//  103  196:dup             
	//  104  197:aload_1         
	//  105  198:invokevirtual   #24  <Method String StringBuilder.toString()>
	//  106  201:invokespecial   #131 <Method void IllegalStateException(String)>
	//  107  204:athrow          
		}
	}

	public abstract MapperConfig getConfig();

	public abstract TypeFactory getTypeFactory();

	protected abstract JsonMappingException invalidTypeIdException(JavaType javatype, String s, String s1);

	public ObjectIdGenerator objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectidinfo)
		throws JsonMappingException
	{
		Class class1 = objectidinfo.getGeneratorType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #149 <Method Class ObjectIdInfo.getGeneratorType()>
	//    2    4:astore          4
		MapperConfig mapperconfig = getConfig();
	//    3    6:aload_0         
	//    4    7:invokevirtual   #67  <Method MapperConfig getConfig()>
	//    5   10:astore          5
		Object obj = ((Object) (mapperconfig.getHandlerInstantiator()));
	//    6   12:aload           5
	//    7   14:invokevirtual   #106 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//    8   17:astore_3        
		if(obj == null)
	//*   9   18:aload_3         
	//*  10   19:ifnonnull       27
			annotated = null;
	//   11   22:aconst_null     
	//   12   23:astore_1        
		else
	//*  13   24:goto            37
			annotated = ((Annotated) (((HandlerInstantiator) (obj)).objectIdGeneratorInstance(mapperconfig, annotated, class1)));
	//   14   27:aload_3         
	//   15   28:aload           5
	//   16   30:aload_1         
	//   17   31:aload           4
	//   18   33:invokevirtual   #152 <Method ObjectIdGenerator HandlerInstantiator.objectIdGeneratorInstance(MapperConfig, Annotated, Class)>
	//   19   36:astore_1        
		obj = ((Object) (annotated));
	//   20   37:aload_1         
	//   21   38:astore_3        
		if(annotated == null)
	//*  22   39:aload_1         
	//*  23   40:ifnonnull       57
			obj = ((Object) ((ObjectIdGenerator)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers())));
	//   24   43:aload           4
	//   25   45:aload           5
	//   26   47:invokevirtual   #115 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   27   50:invokestatic    #119 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   28   53:checkcast       #154 <Class ObjectIdGenerator>
	//   29   56:astore_3        
		return ((ObjectIdGenerator) (obj)).forScope(objectidinfo.getScope());
	//   30   57:aload_3         
	//   31   58:aload_2         
	//   32   59:invokevirtual   #157 <Method Class ObjectIdInfo.getScope()>
	//   33   62:invokevirtual   #161 <Method ObjectIdGenerator ObjectIdGenerator.forScope(Class)>
	//   34   65:areturn         
	}

	public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectidinfo)
	{
		Class class1 = objectidinfo.getResolverType();
	//    0    0:aload_2         
	//    1    1:invokevirtual   #167 <Method Class ObjectIdInfo.getResolverType()>
	//    2    4:astore_3        
		MapperConfig mapperconfig = getConfig();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #67  <Method MapperConfig getConfig()>
	//    5    9:astore          4
		objectidinfo = ((ObjectIdInfo) (mapperconfig.getHandlerInstantiator()));
	//    6   11:aload           4
	//    7   13:invokevirtual   #106 <Method HandlerInstantiator MapperConfig.getHandlerInstantiator()>
	//    8   16:astore_2        
		if(objectidinfo == null)
	//*   9   17:aload_2         
	//*  10   18:ifnonnull       26
			annotated = null;
	//   11   21:aconst_null     
	//   12   22:astore_1        
		else
	//*  13   23:goto            35
			annotated = ((Annotated) (((HandlerInstantiator) (objectidinfo)).resolverIdGeneratorInstance(mapperconfig, annotated, class1)));
	//   14   26:aload_2         
	//   15   27:aload           4
	//   16   29:aload_1         
	//   17   30:aload_3         
	//   18   31:invokevirtual   #171 <Method ObjectIdResolver HandlerInstantiator.resolverIdGeneratorInstance(MapperConfig, Annotated, Class)>
	//   19   34:astore_1        
		objectidinfo = ((ObjectIdInfo) (annotated));
	//   20   35:aload_1         
	//   21   36:astore_2        
		if(annotated == null)
	//*  22   37:aload_1         
	//*  23   38:ifnonnull       54
			objectidinfo = ((ObjectIdInfo) ((ObjectIdResolver)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers())));
	//   24   41:aload_3         
	//   25   42:aload           4
	//   26   44:invokevirtual   #115 <Method boolean MapperConfig.canOverrideAccessModifiers()>
	//   27   47:invokestatic    #119 <Method Object ClassUtil.createInstance(Class, boolean)>
	//   28   50:checkcast       #173 <Class ObjectIdResolver>
	//   29   53:astore_2        
		return ((ObjectIdResolver) (objectidinfo));
	//   30   54:aload_2         
	//   31   55:areturn         
	}

	public abstract Object reportBadDefinition(JavaType javatype, String s)
		throws JsonMappingException;

	public Object reportBadDefinition(Class class1, String s)
		throws JsonMappingException
	{
		return reportBadDefinition(constructType(((Type) (class1))), s);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #177 <Method JavaType constructType(Type)>
	//    4    6:aload_2         
	//    5    7:invokevirtual   #179 <Method Object reportBadDefinition(JavaType, String)>
	//    6   10:areturn         
	}

	public JavaType resolveSubType(JavaType javatype, String s)
		throws JsonMappingException
	{
		if(s.indexOf('<') > 0)
	//*   0    0:aload_2         
	//*   1    1:bipush          60
	//*   2    3:invokevirtual   #190 <Method int String.indexOf(int)>
	//*   3    6:ifle            31
		{
			JavaType javatype1 = getTypeFactory().constructFromCanonical(s);
	//    4    9:aload_0         
	//    5   10:invokevirtual   #79  <Method TypeFactory getTypeFactory()>
	//    6   13:aload_2         
	//    7   14:invokevirtual   #194 <Method JavaType TypeFactory.constructFromCanonical(String)>
	//    8   17:astore_3        
			if(javatype1.isTypeOrSubTypeOf(javatype.getRawClass()))
	//*   9   18:aload_3         
	//*  10   19:aload_1         
	//*  11   20:invokevirtual   #63  <Method Class JavaType.getRawClass()>
	//*  12   23:invokevirtual   #197 <Method boolean JavaType.isTypeOrSubTypeOf(Class)>
	//*  13   26:ifeq            58
				return javatype1;
	//   14   29:aload_3         
	//   15   30:areturn         
		} else
		{
			Class class1;
			try
			{
				class1 = getTypeFactory().findClass(s);
	//   16   31:aload_0         
	//   17   32:invokevirtual   #79  <Method TypeFactory getTypeFactory()>
	//   18   35:aload_2         
	//   19   36:invokevirtual   #201 <Method Class TypeFactory.findClass(String)>
	//   20   39:astore_3        
			}
	//*  21   40:aload_1         
	//*  22   41:aload_3         
	//*  23   42:invokevirtual   #204 <Method boolean JavaType.isTypeOrSuperTypeOf(Class)>
	//*  24   45:ifeq            58
	//*  25   48:aload_0         
	//*  26   49:invokevirtual   #79  <Method TypeFactory getTypeFactory()>
	//*  27   52:aload_1         
	//*  28   53:aload_3         
	//*  29   54:invokevirtual   #205 <Method JavaType TypeFactory.constructSpecializedType(JavaType, Class)>
	//*  30   57:areturn         
	//*  31   58:aload_0         
	//*  32   59:aload_1         
	//*  33   60:aload_2         
	//*  34   61:ldc1            #207 <String "Not a subtype">
	//*  35   63:invokevirtual   #209 <Method JsonMappingException invalidTypeIdException(JavaType, String, String)>
	//*  36   66:athrow          
	//*  37   67:astore_3        
	//*  38   68:aload_0         
	//*  39   69:aload_1         
	//*  40   70:aload_2         
	//*  41   71:ldc1            #211 <String "problem: (%s) %s">
	//*  42   73:iconst_2        
	//*  43   74:anewarray       Object[]
	//*  44   77:dup             
	//*  45   78:iconst_0        
	//*  46   79:aload_3         
	//*  47   80:invokevirtual   #136 <Method Class Object.getClass()>
	//*  48   83:invokevirtual   #124 <Method String Class.getName()>
	//*  49   86:aastore         
	//*  50   87:dup             
	//*  51   88:iconst_1        
	//*  52   89:aload_3         
	//*  53   90:invokevirtual   #214 <Method String Exception.getMessage()>
	//*  54   93:aastore         
	//*  55   94:invokestatic    #31  <Method String String.format(String, Object[])>
	//*  56   97:invokevirtual   #209 <Method JsonMappingException invalidTypeIdException(JavaType, String, String)>
	//*  57  100:athrow          
	//*  58  101:aconst_null     
	//*  59  102:areturn         
			// Misplaced declaration of an exception variable
			catch(JavaType javatype)
			{
				return null;
			}
			catch(Exception exception)
			{
				throw invalidTypeIdException(javatype, s, String.format("problem: (%s) %s", new Object[] {
					((Object) (exception)).getClass().getName(), exception.getMessage()
				}));
			}
			if(javatype.isTypeOrSuperTypeOf(class1))
				return getTypeFactory().constructSpecializedType(javatype, class1);
		}
		throw invalidTypeIdException(javatype, s, "Not a subtype");
	//*  60  103:astore_1        
	//*  61  104:goto            101
	}
}
