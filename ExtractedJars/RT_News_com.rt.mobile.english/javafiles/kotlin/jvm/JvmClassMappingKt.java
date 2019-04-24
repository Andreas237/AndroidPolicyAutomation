// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.jvm;

import java.lang.annotation.Annotation;
import kotlin.TypeCastException;
import kotlin.jvm.internal.ClassBasedDeclarationContainer;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

public final class JvmClassMappingKt
{

	public static final KClass getAnnotationClass(Annotation annotation)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (annotation)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		annotation = ((Annotation) (annotation.annotationType()));
	//    3    6:aload_0         
	//    4    7:invokeinterface #60  <Method Class Annotation.annotationType()>
	//    5   12:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (annotation)), "(this as java.lang.annot\u2026otation).annotationType()");
	//    6   13:aload_0         
	//    7   14:ldc1            #62  <String "(this as java.lang.annot\u2026otation).annotationType()">
	//    8   16:invokestatic    #65  <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		annotation = ((Annotation) (getKotlinClass(((Class) (annotation)))));
	//    9   19:aload_0         
	//   10   20:invokestatic    #67  <Method KClass getKotlinClass(Class)>
	//   11   23:astore_0        
		if(annotation == null)
	//*  12   24:aload_0         
	//*  13   25:ifnonnull       38
			throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.KClass<out T>");
	//   14   28:new             #69  <Class TypeCastException>
	//   15   31:dup             
	//   16   32:ldc1            #71  <String "null cannot be cast to non-null type kotlin.reflect.KClass<out T>">
	//   17   34:invokespecial   #75  <Method void TypeCastException(String)>
	//   18   37:athrow          
		else
			return ((KClass) (annotation));
	//   19   38:aload_0         
	//   20   39:areturn         
	}

	public static final Class getJavaClass(Object obj)
	{
		Intrinsics.checkParameterIsNotNull(obj, "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		obj = ((Object) (obj.getClass()));
	//    3    6:aload_0         
	//    4    7:invokevirtual   #83  <Method Class Object.getClass()>
	//    5   10:astore_0        
		if(obj == null)
	//*   6   11:aload_0         
	//*   7   12:ifnonnull       25
			throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
	//    8   15:new             #69  <Class TypeCastException>
	//    9   18:dup             
	//   10   19:ldc1            #85  <String "null cannot be cast to non-null type java.lang.Class<T>">
	//   11   21:invokespecial   #75  <Method void TypeCastException(String)>
	//   12   24:athrow          
		else
			return ((Class) (obj));
	//   13   25:aload_0         
	//   14   26:areturn         
	}

	public static final Class getJavaClass(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kclass = ((KClass) (((ClassBasedDeclarationContainer)kclass).getJClass()));
	//    3    6:aload_0         
	//    4    7:checkcast       #88  <Class ClassBasedDeclarationContainer>
	//    5   10:invokeinterface #91  <Method Class ClassBasedDeclarationContainer.getJClass()>
	//    6   15:astore_0        
		if(kclass == null)
	//*   7   16:aload_0         
	//*   8   17:ifnonnull       30
			throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
	//    9   20:new             #69  <Class TypeCastException>
	//   10   23:dup             
	//   11   24:ldc1            #85  <String "null cannot be cast to non-null type java.lang.Class<T>">
	//   12   26:invokespecial   #75  <Method void TypeCastException(String)>
	//   13   29:athrow          
		else
			return ((Class) (kclass));
	//   14   30:aload_0         
	//   15   31:areturn         
	}

	public static final Class getJavaObjectType(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kclass = ((KClass) (((ClassBasedDeclarationContainer)kclass).getJClass()));
	//    3    6:aload_0         
	//    4    7:checkcast       #88  <Class ClassBasedDeclarationContainer>
	//    5   10:invokeinterface #91  <Method Class ClassBasedDeclarationContainer.getJClass()>
	//    6   15:astore_0        
		if(!((Class) (kclass)).isPrimitive())
	//*   7   16:aload_0         
	//*   8   17:invokevirtual   #98  <Method boolean Class.isPrimitive()>
	//*   9   20:ifne            39
			if(kclass == null)
	//*  10   23:aload_0         
	//*  11   24:ifnonnull       37
				throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
	//   12   27:new             #69  <Class TypeCastException>
	//   13   30:dup             
	//   14   31:ldc1            #85  <String "null cannot be cast to non-null type java.lang.Class<T>">
	//   15   33:invokespecial   #75  <Method void TypeCastException(String)>
	//   16   36:athrow          
			else
				return ((Class) (kclass));
	//   17   37:aload_0         
	//   18   38:areturn         
		String s = ((Class) (kclass)).getName();
	//   19   39:aload_0         
	//   20   40:invokevirtual   #102 <Method String Class.getName()>
	//   21   43:astore_1        
		if(s != null)
	//*  22   44:aload_1         
	//*  23   45:ifnonnull       51
	//*  24   48:goto            271
			switch(s.hashCode())
	//*  25   51:aload_1         
	//*  26   52:invokevirtual   #108 <Method int String.hashCode()>
			{
			default:
				break;

	//*  27   55:lookupswitch    9: default 136
	//	               -1325958191: 259
	//	               104431: 244
	//	               3039496: 229
	//	               3052374: 214
	//	               3327612: 199
	//	               3625364: 184
	//	               64711720: 169
	//	               97526364: 154
	//	               109413500: 139
	//*  28  136:goto            271
			case 109413500: 
				if(s.equals("short"))
	//*  29  139:aload_1         
	//*  30  140:ldc1            #110 <String "short">
	//*  31  142:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  32  145:ifeq            271
					kclass = java/lang/Short;
	//   33  148:ldc1            #116 <Class Short>
	//   34  150:astore_0        
				break;
	//   35  151:goto            271

			case 97526364: 
				if(s.equals("float"))
	//*  36  154:aload_1         
	//*  37  155:ldc1            #118 <String "float">
	//*  38  157:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  39  160:ifeq            271
					kclass = java/lang/Float;
	//   40  163:ldc1            #120 <Class Float>
	//   41  165:astore_0        
				break;
	//   42  166:goto            271

			case 64711720: 
				if(s.equals("boolean"))
	//*  43  169:aload_1         
	//*  44  170:ldc1            #122 <String "boolean">
	//*  45  172:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  46  175:ifeq            271
					kclass = java/lang/Boolean;
	//   47  178:ldc1            #124 <Class Boolean>
	//   48  180:astore_0        
				break;
	//   49  181:goto            271

			case 3625364: 
				if(s.equals("void"))
	//*  50  184:aload_1         
	//*  51  185:ldc1            #126 <String "void">
	//*  52  187:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  53  190:ifeq            271
					kclass = java/lang/Void;
	//   54  193:ldc1            #128 <Class Void>
	//   55  195:astore_0        
				break;
	//   56  196:goto            271

			case 3327612: 
				if(s.equals("long"))
	//*  57  199:aload_1         
	//*  58  200:ldc1            #130 <String "long">
	//*  59  202:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  60  205:ifeq            271
					kclass = java/lang/Long;
	//   61  208:ldc1            #132 <Class Long>
	//   62  210:astore_0        
				break;
	//   63  211:goto            271

			case 3052374: 
				if(s.equals("char"))
	//*  64  214:aload_1         
	//*  65  215:ldc1            #134 <String "char">
	//*  66  217:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  67  220:ifeq            271
					kclass = java/lang/Character;
	//   68  223:ldc1            #136 <Class Character>
	//   69  225:astore_0        
				break;
	//   70  226:goto            271

			case 3039496: 
				if(s.equals("byte"))
	//*  71  229:aload_1         
	//*  72  230:ldc1            #138 <String "byte">
	//*  73  232:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  74  235:ifeq            271
					kclass = java/lang/Byte;
	//   75  238:ldc1            #140 <Class Byte>
	//   76  240:astore_0        
				break;
	//   77  241:goto            271

			case 104431: 
				if(s.equals("int"))
	//*  78  244:aload_1         
	//*  79  245:ldc1            #142 <String "int">
	//*  80  247:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  81  250:ifeq            271
					kclass = java/lang/Integer;
	//   82  253:ldc1            #144 <Class Integer>
	//   83  255:astore_0        
				break;
	//   84  256:goto            271

			case -1325958191: 
				if(s.equals("double"))
	//*  85  259:aload_1         
	//*  86  260:ldc1            #146 <String "double">
	//*  87  262:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  88  265:ifeq            271
					kclass = java/lang/Double;
	//   89  268:ldc1            #148 <Class Double>
	//   90  270:astore_0        
				break;
			}
		if(kclass == null)
	//*  91  271:aload_0         
	//*  92  272:ifnonnull       285
			throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
	//   93  275:new             #69  <Class TypeCastException>
	//   94  278:dup             
	//   95  279:ldc1            #85  <String "null cannot be cast to non-null type java.lang.Class<T>">
	//   96  281:invokespecial   #75  <Method void TypeCastException(String)>
	//   97  284:athrow          
		else
			return ((Class) (kclass));
	//   98  285:aload_0         
	//   99  286:areturn         
	}

	public static final Class getJavaPrimitiveType(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kclass = ((KClass) (((ClassBasedDeclarationContainer)kclass).getJClass()));
	//    3    6:aload_0         
	//    4    7:checkcast       #88  <Class ClassBasedDeclarationContainer>
	//    5   10:invokeinterface #91  <Method Class ClassBasedDeclarationContainer.getJClass()>
	//    6   15:astore_0        
		if(((Class) (kclass)).isPrimitive())
	//*   7   16:aload_0         
	//*   8   17:invokevirtual   #98  <Method boolean Class.isPrimitive()>
	//*   9   20:ifeq            39
			if(kclass == null)
	//*  10   23:aload_0         
	//*  11   24:ifnonnull       37
				throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<T>");
	//   12   27:new             #69  <Class TypeCastException>
	//   13   30:dup             
	//   14   31:ldc1            #85  <String "null cannot be cast to non-null type java.lang.Class<T>">
	//   15   33:invokespecial   #75  <Method void TypeCastException(String)>
	//   16   36:athrow          
			else
				return ((Class) (kclass));
	//   17   37:aload_0         
	//   18   38:areturn         
		kclass = ((KClass) (((Class) (kclass)).getName()));
	//   19   39:aload_0         
	//   20   40:invokevirtual   #102 <Method String Class.getName()>
	//   21   43:astore_0        
		if(kclass != null)
	//*  22   44:aload_0         
	//*  23   45:ifnonnull       51
	//*  24   48:goto            256
			switch(((String) (kclass)).hashCode())
	//*  25   51:aload_0         
	//*  26   52:invokevirtual   #108 <Method int String.hashCode()>
			{
			default:
				break;

	//*  27   55:lookupswitch    9: default 136
	//	               -2056817302: 243
	//	               -527879800: 230
	//	               -515992664: 217
	//	               155276373: 204
	//	               344809556: 191
	//	               398507100: 178
	//	               398795216: 165
	//	               399092968: 152
	//	               761287205: 139
	//*  28  136:goto            256
			case 761287205: 
				if(((String) (kclass)).equals("java.lang.Double"))
	//*  29  139:aload_0         
	//*  30  140:ldc1            #151 <String "java.lang.Double">
	//*  31  142:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  32  145:ifeq            256
					return Double.TYPE;
	//   33  148:getstatic       #154 <Field Class Double.TYPE>
	//   34  151:areturn         
				break;

			case 399092968: 
				if(((String) (kclass)).equals("java.lang.Void"))
	//*  35  152:aload_0         
	//*  36  153:ldc1            #156 <String "java.lang.Void">
	//*  37  155:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  38  158:ifeq            256
					return Void.TYPE;
	//   39  161:getstatic       #157 <Field Class Void.TYPE>
	//   40  164:areturn         
				break;

			case 398795216: 
				if(((String) (kclass)).equals("java.lang.Long"))
	//*  41  165:aload_0         
	//*  42  166:ldc1            #159 <String "java.lang.Long">
	//*  43  168:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  44  171:ifeq            256
					return Long.TYPE;
	//   45  174:getstatic       #160 <Field Class Long.TYPE>
	//   46  177:areturn         
				break;

			case 398507100: 
				if(((String) (kclass)).equals("java.lang.Byte"))
	//*  47  178:aload_0         
	//*  48  179:ldc1            #162 <String "java.lang.Byte">
	//*  49  181:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  50  184:ifeq            256
					return Byte.TYPE;
	//   51  187:getstatic       #163 <Field Class Byte.TYPE>
	//   52  190:areturn         
				break;

			case 344809556: 
				if(((String) (kclass)).equals("java.lang.Boolean"))
	//*  53  191:aload_0         
	//*  54  192:ldc1            #165 <String "java.lang.Boolean">
	//*  55  194:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  56  197:ifeq            256
					return Boolean.TYPE;
	//   57  200:getstatic       #166 <Field Class Boolean.TYPE>
	//   58  203:areturn         
				break;

			case 155276373: 
				if(((String) (kclass)).equals("java.lang.Character"))
	//*  59  204:aload_0         
	//*  60  205:ldc1            #168 <String "java.lang.Character">
	//*  61  207:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  62  210:ifeq            256
					return Character.TYPE;
	//   63  213:getstatic       #169 <Field Class Character.TYPE>
	//   64  216:areturn         
				break;

			case -515992664: 
				if(((String) (kclass)).equals("java.lang.Short"))
	//*  65  217:aload_0         
	//*  66  218:ldc1            #171 <String "java.lang.Short">
	//*  67  220:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  68  223:ifeq            256
					return Short.TYPE;
	//   69  226:getstatic       #172 <Field Class Short.TYPE>
	//   70  229:areturn         
				break;

			case -527879800: 
				if(((String) (kclass)).equals("java.lang.Float"))
	//*  71  230:aload_0         
	//*  72  231:ldc1            #174 <String "java.lang.Float">
	//*  73  233:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  74  236:ifeq            256
					return Float.TYPE;
	//   75  239:getstatic       #175 <Field Class Float.TYPE>
	//   76  242:areturn         
				break;

			case -2056817302: 
				if(((String) (kclass)).equals("java.lang.Integer"))
	//*  77  243:aload_0         
	//*  78  244:ldc1            #177 <String "java.lang.Integer">
	//*  79  246:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*  80  249:ifeq            256
					return Integer.TYPE;
	//   81  252:getstatic       #178 <Field Class Integer.TYPE>
	//   82  255:areturn         
				break;
			}
		return null;
	//   83  256:aconst_null     
	//   84  257:areturn         
	}

	public static final KClass getKotlinClass(Class class1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (class1)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return Reflection.getOrCreateKotlinClass(class1);
	//    3    6:aload_0         
	//    4    7:invokestatic    #183 <Method KClass Reflection.getOrCreateKotlinClass(Class)>
	//    5   10:areturn         
	}

	public static final Class getRuntimeClassOfKClassInstance(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #48  <String "receiver$0">
	//    2    3:invokestatic    #54  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kclass = ((KClass) (((Object)kclass).getClass()));
	//    3    6:aload_0         
	//    4    7:checkcast       #4   <Class Object>
	//    5   10:invokevirtual   #83  <Method Class Object.getClass()>
	//    6   13:astore_0        
		if(kclass == null)
	//*   7   14:aload_0         
	//*   8   15:ifnonnull       28
			throw new TypeCastException("null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T>>");
	//    9   18:new             #69  <Class TypeCastException>
	//   10   21:dup             
	//   11   22:ldc1            #186 <String "null cannot be cast to non-null type java.lang.Class<kotlin.reflect.KClass<T>>">
	//   12   24:invokespecial   #75  <Method void TypeCastException(String)>
	//   13   27:athrow          
		else
			return ((Class) (kclass));
	//   14   28:aload_0         
	//   15   29:areturn         
	}

	private static final boolean isArrayOf(Object aobj[])
	{
		Intrinsics.reifiedOperationMarker(4, "T");
	//    0    0:iconst_4        
	//    1    1:ldc1            #188 <String "T">
	//    2    3:invokestatic    #192 <Method void Intrinsics.reifiedOperationMarker(int, String)>
		return ((Class) (java/lang/Object)).isAssignableFrom(((Object) (aobj)).getClass().getComponentType());
	//    3    6:ldc1            #4   <Class Object>
	//    4    8:aload_0         
	//    5    9:invokevirtual   #83  <Method Class Object.getClass()>
	//    6   12:invokevirtual   #195 <Method Class Class.getComponentType()>
	//    7   15:invokevirtual   #199 <Method boolean Class.isAssignableFrom(Class)>
	//    8   18:ireturn         
	}

	public static void java$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void javaClass$annotations(KClass kclass)
	{
	//    0    0:return          
	}
}
