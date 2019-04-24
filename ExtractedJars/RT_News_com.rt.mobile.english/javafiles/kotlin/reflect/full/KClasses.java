// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.reflect.full;

import java.util.*;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.*;
import kotlin.reflect.jvm.internal.*;
import kotlin.reflect.jvm.internal.impl.descriptors.*;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;
import kotlin.reflect.jvm.internal.impl.utils.DFS;

public final class KClasses
{

	public static void allSuperclasses$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void allSupertypes$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static final Object cast(KClass kclass, Object obj)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!kclass.isInstance(obj))
	//*   3    6:aload_0         
	//*   4    7:aload_1         
	//*   5    8:invokeinterface #130 <Method boolean KClass.isInstance(Object)>
	//*   6   13:ifne            57
		{
			obj = ((Object) (new StringBuilder()));
	//    7   16:new             #132 <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #136 <Method void StringBuilder()>
	//   10   23:astore_1        
			((StringBuilder) (obj)).append("Value cannot be cast to ");
	//   11   24:aload_1         
	//   12   25:ldc1            #138 <String "Value cannot be cast to ">
	//   13   27:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			((StringBuilder) (obj)).append(kclass.getQualifiedName());
	//   15   31:aload_1         
	//   16   32:aload_0         
	//   17   33:invokeinterface #146 <Method String KClass.getQualifiedName()>
	//   18   38:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   19   41:pop             
			throw (Throwable)new TypeCastException(((StringBuilder) (obj)).toString());
	//   20   42:new             #148 <Class TypeCastException>
	//   21   45:dup             
	//   22   46:aload_1         
	//   23   47:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   24   50:invokespecial   #154 <Method void TypeCastException(String)>
	//   25   53:checkcast       #156 <Class Throwable>
	//   26   56:athrow          
		}
		if(obj == null)
	//*  27   57:aload_1         
	//*  28   58:ifnonnull       71
			throw new TypeCastException("null cannot be cast to non-null type T");
	//   29   61:new             #148 <Class TypeCastException>
	//   30   64:dup             
	//   31   65:ldc1            #158 <String "null cannot be cast to non-null type T">
	//   32   67:invokespecial   #154 <Method void TypeCastException(String)>
	//   33   70:athrow          
		else
			return obj;
	//   34   71:aload_1         
	//   35   72:areturn         
	}

	public static void companionObject$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void companionObjectInstance$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static final Object createInstance(KClass kclass)
	{
		boolean flag;
		Object obj;
		Object obj1;
		Iterator iterator;
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		iterator = ((Iterable)kclass.getConstructors()).iterator();
	//    3    6:aload_0         
	//    4    7:invokeinterface #165 <Method Collection KClass.getConstructors()>
	//    5   12:checkcast       #167 <Class Iterable>
	//    6   15:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//    7   20:astore          6
		obj1 = null;
	//    8   22:aconst_null     
	//    9   23:astore          4
		flag = false;
	//   10   25:iconst_0        
	//   11   26:istore_1        
		obj = null;
	//   12   27:aconst_null     
	//   13   28:astore_3        
_L7:
		Object obj2;
		Object obj3;
		if(!iterator.hasNext())
			break; /* Loop/switch isn't completed */
	//   14   29:aload           6
	//   15   31:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   16   36:ifeq            150
		obj2 = iterator.next();
	//   17   39:aload           6
	//   18   41:invokeinterface #181 <Method Object Iterator.next()>
	//   19   46:astore          5
		obj3 = ((Object) ((Iterable)((KFunction)obj2).getParameters()));
	//   20   48:aload           5
	//   21   50:checkcast       #183 <Class KFunction>
	//   22   53:invokeinterface #187 <Method List KFunction.getParameters()>
	//   23   58:checkcast       #167 <Class Iterable>
	//   24   61:astore          7
		if(!(obj3 instanceof Collection) || !((Collection)obj3).isEmpty()) goto _L2; else goto _L1
	//   25   63:aload           7
	//   26   65:instanceof      #189 <Class Collection>
	//   27   68:ifeq            89
	//   28   71:aload           7
	//   29   73:checkcast       #189 <Class Collection>
	//   30   76:invokeinterface #192 <Method boolean Collection.isEmpty()>
	//   31   81:ifeq            89
_L1:
		boolean flag1;
		flag1 = true;
	//   32   84:iconst_1        
	//   33   85:istore_2        
		break MISSING_BLOCK_LABEL_128;
	//   34   86:goto            128
_L2:
		obj3 = ((Object) (((Iterable) (obj3)).iterator()));
	//   35   89:aload           7
	//   36   91:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   37   96:astore          7
_L5:
		if(!((Iterator) (obj3)).hasNext()) goto _L1; else goto _L3
	//   38   98:aload           7
	//   39  100:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   40  105:ifeq            84
_L3:
		if(((KParameter)((Iterator) (obj3)).next()).isOptional()) goto _L5; else goto _L4
	//   41  108:aload           7
	//   42  110:invokeinterface #181 <Method Object Iterator.next()>
	//   43  115:checkcast       #194 <Class KParameter>
	//   44  118:invokeinterface #197 <Method boolean KParameter.isOptional()>
	//   45  123:ifne            98
_L4:
		flag1 = false;
	//   46  126:iconst_0        
	//   47  127:istore_2        
		if(!flag1)
			continue; /* Loop/switch isn't completed */
	//   48  128:iload_2         
	//   49  129:ifeq            29
		if(flag)
	//*  50  132:iload_1         
	//*  51  133:ifeq            142
		{
			obj = ((Object) (obj1));
	//   52  136:aload           4
	//   53  138:astore_3        
			break MISSING_BLOCK_LABEL_160;
	//   54  139:goto            160
		}
		obj = obj2;
	//   55  142:aload           5
	//   56  144:astore_3        
		flag = true;
	//   57  145:iconst_1        
	//   58  146:istore_1        
		if(true) goto _L7; else goto _L6
	//   59  147:goto            29
_L6:
		if(!flag)
	//*  60  150:iload_1         
	//*  61  151:ifne            160
			obj = ((Object) (obj1));
	//   62  154:aload           4
	//   63  156:astore_3        
	//*  64  157:goto            160
		obj = ((Object) ((KFunction)obj));
	//   65  160:aload_3         
	//   66  161:checkcast       #183 <Class KFunction>
	//   67  164:astore_3        
		if(obj != null)
	//*  68  165:aload_3         
	//*  69  166:ifnull          179
		{
			return ((KFunction) (obj)).callBy(MapsKt.emptyMap());
	//   70  169:aload_3         
	//   71  170:invokestatic    #203 <Method java.util.Map MapsKt.emptyMap()>
	//   72  173:invokeinterface #207 <Method Object KFunction.callBy(java.util.Map)>
	//   73  178:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   74  179:new             #132 <Class StringBuilder>
	//   75  182:dup             
	//   76  183:invokespecial   #136 <Method void StringBuilder()>
	//   77  186:astore_3        
			stringbuilder.append("Class should have a single no-arg constructor: ");
	//   78  187:aload_3         
	//   79  188:ldc1            #209 <String "Class should have a single no-arg constructor: ">
	//   80  190:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   81  193:pop             
			stringbuilder.append(((Object) (kclass)));
	//   82  194:aload_3         
	//   83  195:aload_0         
	//   84  196:invokevirtual   #212 <Method StringBuilder StringBuilder.append(Object)>
	//   85  199:pop             
			throw (Throwable)new IllegalArgumentException(stringbuilder.toString());
	//   86  200:new             #214 <Class IllegalArgumentException>
	//   87  203:dup             
	//   88  204:aload_3         
	//   89  205:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   90  208:invokespecial   #215 <Method void IllegalArgumentException(String)>
	//   91  211:checkcast       #156 <Class Throwable>
	//   92  214:athrow          
		}
	}

	public static void declaredFunctions$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void declaredMemberExtensionFunctions$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void declaredMemberExtensionProperties$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void declaredMemberFunctions$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void declaredMemberProperties$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void declaredMembers$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void defaultType$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void functions$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static final Collection getAllSuperclasses(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kclass = ((KClass) ((Iterable)getAllSupertypes(kclass)));
	//    3    6:aload_0         
	//    4    7:invokestatic    #222 <Method Collection getAllSupertypes(KClass)>
	//    5   10:checkcast       #167 <Class Iterable>
	//    6   13:astore_0        
		Collection collection = (Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(((Iterable) (kclass)), 10));
	//    7   14:new             #224 <Class ArrayList>
	//    8   17:dup             
	//    9   18:aload_0         
	//   10   19:bipush          10
	//   11   21:invokestatic    #230 <Method int CollectionsKt.collectionSizeOrDefault(Iterable, int)>
	//   12   24:invokespecial   #233 <Method void ArrayList(int)>
	//   13   27:checkcast       #189 <Class Collection>
	//   14   30:astore_2        
		for(Iterator iterator = ((Iterable) (kclass)).iterator(); iterator.hasNext();)
	//*  15   31:aload_0         
	//*  16   32:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//*  17   37:astore          4
	//*  18   39:aload           4
	//*  19   41:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//*  20   46:ifeq            134
		{
			KType ktype = (KType)iterator.next();
	//   21   49:aload           4
	//   22   51:invokeinterface #181 <Method Object Iterator.next()>
	//   23   56:checkcast       #235 <Class KType>
	//   24   59:astore_3        
			kotlin.reflect.KClassifier kclassifier = ktype.getClassifier();
	//   25   60:aload_3         
	//   26   61:invokeinterface #239 <Method kotlin.reflect.KClassifier KType.getClassifier()>
	//   27   66:astore_1        
			kclass = ((KClass) (kclassifier));
	//   28   67:aload_1         
	//   29   68:astore_0        
			if(!(kclassifier instanceof KClass))
	//*  30   69:aload_1         
	//*  31   70:instanceof      #126 <Class KClass>
	//*  32   73:ifne            78
				kclass = null;
	//   33   76:aconst_null     
	//   34   77:astore_0        
			kclass = (KClass)kclass;
	//   35   78:aload_0         
	//   36   79:checkcast       #126 <Class KClass>
	//   37   82:astore_0        
			if(kclass != null)
	//*  38   83:aload_0         
	//*  39   84:ifnull          98
			{
				collection.add(((Object) (kclass)));
	//   40   87:aload_2         
	//   41   88:aload_0         
	//   42   89:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   43   94:pop             
			} else
	//*  44   95:goto            39
			{
				kclass = ((KClass) (new StringBuilder()));
	//   45   98:new             #132 <Class StringBuilder>
	//   46  101:dup             
	//   47  102:invokespecial   #136 <Method void StringBuilder()>
	//   48  105:astore_0        
				((StringBuilder) (kclass)).append("Supertype not a class: ");
	//   49  106:aload_0         
	//   50  107:ldc1            #244 <String "Supertype not a class: ">
	//   51  109:invokevirtual   #142 <Method StringBuilder StringBuilder.append(String)>
	//   52  112:pop             
				((StringBuilder) (kclass)).append(((Object) (ktype)));
	//   53  113:aload_0         
	//   54  114:aload_3         
	//   55  115:invokevirtual   #212 <Method StringBuilder StringBuilder.append(Object)>
	//   56  118:pop             
				throw (Throwable)new KotlinReflectionInternalError(((StringBuilder) (kclass)).toString());
	//   57  119:new             #246 <Class KotlinReflectionInternalError>
	//   58  122:dup             
	//   59  123:aload_0         
	//   60  124:invokevirtual   #151 <Method String StringBuilder.toString()>
	//   61  127:invokespecial   #247 <Method void KotlinReflectionInternalError(String)>
	//   62  130:checkcast       #156 <Class Throwable>
	//   63  133:athrow          
			}
		}

		return (Collection)(List)collection;
	//   64  134:aload_2         
	//   65  135:checkcast       #249 <Class List>
	//   66  138:checkcast       #189 <Class Collection>
	//   67  141:areturn         
	}

	public static final Collection getAllSupertypes(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class allSupertypes._cls1 {}

	/* block-local class not found */
	class allSupertypes._cls2 {}

		kclass = ((KClass) (DFS.dfs((Collection)kclass.getSupertypes(), (kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors)allSupertypes._cls1.INSTANCE, (kotlin.reflect.jvm.internal.impl.utils.DFS.Visited)new kotlin.reflect.jvm.internal.impl.utils.DFS.VisitedWithSet(), (kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandler)new allSupertypes._cls2())));
	//    3    6:aload_0         
	//    4    7:invokeinterface #253 <Method List KClass.getSupertypes()>
	//    5   12:checkcast       #189 <Class Collection>
	//    6   15:getstatic       #259 <Field KClasses$allSupertypes$1 KClasses$allSupertypes$1.INSTANCE>
	//    7   18:checkcast       #261 <Class kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors>
	//    8   21:new             #263 <Class kotlin.reflect.jvm.internal.impl.utils.DFS$VisitedWithSet>
	//    9   24:dup             
	//   10   25:invokespecial   #264 <Method void kotlin.reflect.jvm.internal.impl.utils.DFS$VisitedWithSet()>
	//   11   28:checkcast       #266 <Class kotlin.reflect.jvm.internal.impl.utils.DFS$Visited>
	//   12   31:new             #268 <Class KClasses$allSupertypes$2>
	//   13   34:dup             
	//   14   35:invokespecial   #269 <Method void KClasses$allSupertypes$2()>
	//   15   38:checkcast       #271 <Class kotlin.reflect.jvm.internal.impl.utils.DFS$NodeHandler>
	//   16   41:invokestatic    #277 <Method Object DFS.dfs(Collection, kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors, kotlin.reflect.jvm.internal.impl.utils.DFS$Visited, kotlin.reflect.jvm.internal.impl.utils.DFS$NodeHandler)>
	//   17   44:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (kclass)), "DFS.dfs(\n            sup\u2026    }\n            }\n    )");
	//   18   45:aload_0         
	//   19   46:ldc2            #279 <String "DFS.dfs(\n            sup\u2026    }\n            }\n    )">
	//   20   49:invokestatic    #282 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return (Collection)kclass;
	//   21   52:aload_0         
	//   22   53:checkcast       #189 <Class Collection>
	//   23   56:areturn         
	}

	public static final KClass getCompanionObject(KClass kclass)
	{
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			for(Iterator iterator = ((Iterable)kclass.getNestedClasses()).iterator(); iterator.hasNext();)
	//*   3    6:aload_0         
	//*   4    7:invokeinterface #286 <Method Collection KClass.getNestedClasses()>
	//*   5   12:checkcast       #167 <Class Iterable>
	//*   6   15:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//*   7   20:astore_1        
	//*   8   21:aload_1         
	//*   9   22:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//*  10   27:ifeq            75
			{
				kclass = ((KClass) (iterator.next()));
	//   11   30:aload_1         
	//   12   31:invokeinterface #181 <Method Object Iterator.next()>
	//   13   36:astore_0        
				KClass kclass1 = (KClass)kclass;
	//   14   37:aload_0         
	//   15   38:checkcast       #126 <Class KClass>
	//   16   41:astore_2        
				if(kclass1 == null)
	//*  17   42:aload_2         
	//*  18   43:ifnonnull       57
					throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
	//   19   46:new             #148 <Class TypeCastException>
	//   20   49:dup             
	//   21   50:ldc2            #288 <String "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>">
	//   22   53:invokespecial   #154 <Method void TypeCastException(String)>
	//   23   56:athrow          
				if(((KClassImpl)kclass1).getDescriptor().isCompanionObject())
	//*  24   57:aload_2         
	//*  25   58:checkcast       #290 <Class KClassImpl>
	//*  26   61:invokevirtual   #294 <Method ClassDescriptor KClassImpl.getDescriptor()>
	//*  27   64:invokeinterface #299 <Method boolean ClassDescriptor.isCompanionObject()>
	//*  28   69:ifeq            21
					break label0;
	//   29   72:goto            77
			}

			kclass = null;
	//   30   75:aconst_null     
	//   31   76:astore_0        
		}
		return (KClass)kclass;
	//   32   77:aload_0         
	//   33   78:checkcast       #126 <Class KClass>
	//   34   81:areturn         
	}

	public static final Object getCompanionObjectInstance(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kclass = getCompanionObject(kclass);
	//    3    6:aload_0         
	//    4    7:invokestatic    #302 <Method KClass getCompanionObject(KClass)>
	//    5   10:astore_0        
		if(kclass != null)
	//*   6   11:aload_0         
	//*   7   12:ifnull          22
			return kclass.getObjectInstance();
	//    8   15:aload_0         
	//    9   16:invokeinterface #305 <Method Object KClass.getObjectInstance()>
	//   10   21:areturn         
		else
			return ((Object) (null));
	//   11   22:aconst_null     
	//   12   23:areturn         
	}

	public static final Collection getDeclaredFunctions(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getDeclaredMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #319 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getDeclaredMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_1        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_1         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_1        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_1         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            78
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_1         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_2        
			if(obj1 instanceof KFunction)
	//*  25   60:aload_2         
	//*  26   61:instanceof      #183 <Class KFunction>
	//*  27   64:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   28   67:aload_0         
	//   29   68:aload_2         
	//   30   69:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   31   74:pop             
		} while(true);
	//   32   75:goto            44
		return (Collection)(List)kclass;
	//   33   78:aload_0         
	//   34   79:checkcast       #249 <Class List>
	//   35   82:checkcast       #189 <Class Collection>
	//   36   85:areturn         
	}

	public static final Collection getDeclaredMemberExtensionFunctions(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getDeclaredNonStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #324 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getDeclaredNonStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isExtension(kcallableimpl) && (kcallableimpl instanceof KFunction))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #328 <Method boolean isExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #183 <Class KFunction>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final Collection getDeclaredMemberExtensionProperties(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getDeclaredNonStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #324 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getDeclaredNonStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isExtension(kcallableimpl) && (kcallableimpl instanceof KProperty2))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #328 <Method boolean isExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #330 <Class KProperty2>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final Collection getDeclaredMemberFunctions(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getDeclaredNonStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #324 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getDeclaredNonStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isNotExtension(kcallableimpl) && (kcallableimpl instanceof KFunction))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #333 <Method boolean isNotExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #183 <Class KFunction>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final Collection getDeclaredMemberProperties(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getDeclaredNonStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #324 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getDeclaredNonStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isNotExtension(kcallableimpl) && (kcallableimpl instanceof KProperty1))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #333 <Method boolean isNotExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #335 <Class KProperty1>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final Collection getDeclaredMembers(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return ((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getDeclaredMembers();
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #319 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getDeclaredMembers()>
	//    9   22:areturn         
	}

	public static final KType getDefaultType(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kotlin.reflect.jvm.internal.impl.types.SimpleType simpletype = ((KClassImpl)kclass).getDescriptor().getDefaultType();
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #294 <Method ClassDescriptor KClassImpl.getDescriptor()>
	//    6   13:invokeinterface #340 <Method kotlin.reflect.jvm.internal.impl.types.SimpleType ClassDescriptor.getDefaultType()>
	//    7   18:astore_1        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (simpletype)), "(this as KClassImpl<*>).descriptor.defaultType");
	//    8   19:aload_1         
	//    9   20:ldc2            #342 <String "(this as KClassImpl<*>).descriptor.defaultType">
	//   10   23:invokestatic    #282 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
	/* block-local class not found */
	class defaultType._cls1 {}

		return (KType)new KTypeImpl((KotlinType)simpletype, (Function0)new defaultType._cls1(kclass));
	//   11   26:new             #344 <Class KTypeImpl>
	//   12   29:dup             
	//   13   30:aload_1         
	//   14   31:checkcast       #346 <Class KotlinType>
	//   15   34:new             #348 <Class KClasses$defaultType$1>
	//   16   37:dup             
	//   17   38:aload_0         
	//   18   39:invokespecial   #350 <Method void KClasses$defaultType$1(KClass)>
	//   19   42:checkcast       #352 <Class Function0>
	//   20   45:invokespecial   #355 <Method void KTypeImpl(KotlinType, Function0)>
	//   21   48:checkcast       #235 <Class KType>
	//   22   51:areturn         
	}

	public static final Collection getFunctions(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)kclass.getMembers()));
	//    3    6:aload_0         
	//    4    7:invokeinterface #359 <Method Collection KClass.getMembers()>
	//    5   12:checkcast       #167 <Class Iterable>
	//    6   15:astore_1        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//    7   16:new             #224 <Class ArrayList>
	//    8   19:dup             
	//    9   20:invokespecial   #320 <Method void ArrayList()>
	//   10   23:checkcast       #189 <Class Collection>
	//   11   26:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   12   27:aload_1         
	//   13   28:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   14   33:astore_1        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   15   34:aload_1         
	//   16   35:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   17   40:ifeq            68
			Object obj1 = ((Iterator) (obj)).next();
	//   18   43:aload_1         
	//   19   44:invokeinterface #181 <Method Object Iterator.next()>
	//   20   49:astore_2        
			if(obj1 instanceof KFunction)
	//*  21   50:aload_2         
	//*  22   51:instanceof      #183 <Class KFunction>
	//*  23   54:ifeq            34
				((Collection) (kclass)).add(obj1);
	//   24   57:aload_0         
	//   25   58:aload_2         
	//   26   59:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   27   64:pop             
		} while(true);
	//   28   65:goto            34
		return (Collection)(List)kclass;
	//   29   68:aload_0         
	//   30   69:checkcast       #249 <Class List>
	//   31   72:checkcast       #189 <Class Collection>
	//   32   75:areturn         
	}

	public static final Collection getMemberExtensionFunctions(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getAllNonStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #362 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getAllNonStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isExtension(kcallableimpl) && (kcallableimpl instanceof KFunction))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #328 <Method boolean isExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #183 <Class KFunction>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final Collection getMemberExtensionProperties(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getAllNonStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #362 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getAllNonStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isExtension(kcallableimpl) && (kcallableimpl instanceof KProperty2))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #328 <Method boolean isExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #330 <Class KProperty2>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final Collection getMemberFunctions(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getAllNonStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #362 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getAllNonStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isNotExtension(kcallableimpl) && (kcallableimpl instanceof KFunction))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #333 <Method boolean isNotExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #183 <Class KFunction>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final Collection getMemberProperties(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getAllNonStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #362 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getAllNonStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isNotExtension(kcallableimpl) && (kcallableimpl instanceof KProperty1))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #333 <Method boolean isNotExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #335 <Class KProperty1>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final KFunction getPrimaryConstructor(KClass kclass)
	{
label0:
		{
			Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
			for(Iterator iterator = ((Iterable)((KClassImpl)kclass).getConstructors()).iterator(); iterator.hasNext();)
	//*   3    6:aload_0         
	//*   4    7:checkcast       #290 <Class KClassImpl>
	//*   5   10:invokevirtual   #363 <Method Collection KClassImpl.getConstructors()>
	//*   6   13:checkcast       #167 <Class Iterable>
	//*   7   16:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//*   8   21:astore_1        
	//*   9   22:aload_1         
	//*  10   23:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//*  11   28:ifeq            96
			{
				kclass = ((KClass) (iterator.next()));
	//   12   31:aload_1         
	//   13   32:invokeinterface #181 <Method Object Iterator.next()>
	//   14   37:astore_0        
				Object obj = ((Object) ((KFunction)kclass));
	//   15   38:aload_0         
	//   16   39:checkcast       #183 <Class KFunction>
	//   17   42:astore_2        
				if(obj == null)
	//*  18   43:aload_2         
	//*  19   44:ifnonnull       58
					throw new TypeCastException("null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
	//   20   47:new             #148 <Class TypeCastException>
	//   21   50:dup             
	//   22   51:ldc2            #365 <String "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl">
	//   23   54:invokespecial   #154 <Method void TypeCastException(String)>
	//   24   57:athrow          
				obj = ((Object) (((KFunctionImpl)obj).getDescriptor()));
	//   25   58:aload_2         
	//   26   59:checkcast       #367 <Class KFunctionImpl>
	//   27   62:invokevirtual   #370 <Method kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor KFunctionImpl.getDescriptor()>
	//   28   65:astore_2        
				if(obj == null)
	//*  29   66:aload_2         
	//*  30   67:ifnonnull       81
					throw new TypeCastException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
	//   31   70:new             #148 <Class TypeCastException>
	//   32   73:dup             
	//   33   74:ldc2            #372 <String "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor">
	//   34   77:invokespecial   #154 <Method void TypeCastException(String)>
	//   35   80:athrow          
				if(((ConstructorDescriptor)obj).isPrimary())
	//*  36   81:aload_2         
	//*  37   82:checkcast       #374 <Class ConstructorDescriptor>
	//*  38   85:invokeinterface #377 <Method boolean ConstructorDescriptor.isPrimary()>
	//*  39   90:ifeq            22
					break label0;
	//   40   93:goto            98
			}

			kclass = null;
	//   41   96:aconst_null     
	//   42   97:astore_0        
		}
		return (KFunction)kclass;
	//   43   98:aload_0         
	//   44   99:checkcast       #183 <Class KFunction>
	//   45  102:areturn         
	}

	public static final Collection getStaticFunctions(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getAllStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #381 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getAllStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_1        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_1         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_1        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_1         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            78
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_1         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_2        
			if(obj1 instanceof KFunction)
	//*  25   60:aload_2         
	//*  26   61:instanceof      #183 <Class KFunction>
	//*  27   64:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   28   67:aload_0         
	//   29   68:aload_2         
	//   30   69:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   31   74:pop             
		} while(true);
	//   32   75:goto            44
		return (Collection)(List)kclass;
	//   33   78:aload_0         
	//   34   79:checkcast       #249 <Class List>
	//   35   82:checkcast       #189 <Class Collection>
	//   36   85:areturn         
	}

	public static final Collection getStaticProperties(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) ((Iterable)((kotlin.reflect.jvm.internal.KClassImpl.Data)((KClassImpl)kclass).getData().invoke()).getAllStaticMembers()));
	//    3    6:aload_0         
	//    4    7:checkcast       #290 <Class KClassImpl>
	//    5   10:invokevirtual   #310 <Method kotlin.reflect.jvm.internal.ReflectProperties$LazyVal KClassImpl.getData()>
	//    6   13:invokevirtual   #315 <Method Object kotlin.reflect.jvm.internal.ReflectProperties$LazyVal.invoke()>
	//    7   16:checkcast       #317 <Class kotlin.reflect.jvm.internal.KClassImpl$Data>
	//    8   19:invokevirtual   #381 <Method Collection kotlin.reflect.jvm.internal.KClassImpl$Data.getAllStaticMembers()>
	//    9   22:checkcast       #167 <Class Iterable>
	//   10   25:astore_2        
		kclass = ((KClass) ((Collection)new ArrayList()));
	//   11   26:new             #224 <Class ArrayList>
	//   12   29:dup             
	//   13   30:invokespecial   #320 <Method void ArrayList()>
	//   14   33:checkcast       #189 <Class Collection>
	//   15   36:astore_0        
		obj = ((Object) (((Iterable) (obj)).iterator()));
	//   16   37:aload_2         
	//   17   38:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   18   43:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   19   44:aload_2         
	//   20   45:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   21   50:ifeq            104
			Object obj1 = ((Iterator) (obj)).next();
	//   22   53:aload_2         
	//   23   54:invokeinterface #181 <Method Object Iterator.next()>
	//   24   59:astore_3        
			KCallableImpl kcallableimpl = (KCallableImpl)obj1;
	//   25   60:aload_3         
	//   26   61:checkcast       #326 <Class KCallableImpl>
	//   27   64:astore          4
			boolean flag;
			if(isNotExtension(kcallableimpl) && (kcallableimpl instanceof KProperty0))
	//*  28   66:aload           4
	//*  29   68:invokestatic    #333 <Method boolean isNotExtension(KCallableImpl)>
	//*  30   71:ifeq            87
	//*  31   74:aload           4
	//*  32   76:instanceof      #383 <Class KProperty0>
	//*  33   79:ifeq            87
				flag = true;
	//   34   82:iconst_1        
	//   35   83:istore_1        
			else
	//*  36   84:goto            89
				flag = false;
	//   37   87:iconst_0        
	//   38   88:istore_1        
			if(flag)
	//*  39   89:iload_1         
	//*  40   90:ifeq            44
				((Collection) (kclass)).add(obj1);
	//   41   93:aload_0         
	//   42   94:aload_3         
	//   43   95:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   44  100:pop             
		} while(true);
	//   45  101:goto            44
		return (Collection)(List)kclass;
	//   46  104:aload_0         
	//   47  105:checkcast       #249 <Class List>
	//   48  108:checkcast       #189 <Class Collection>
	//   49  111:areturn         
	}

	public static final List getSuperclasses(KClass kclass)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		kclass = ((KClass) ((Iterable)kclass.getSupertypes()));
	//    3    6:aload_0         
	//    4    7:invokeinterface #253 <Method List KClass.getSupertypes()>
	//    5   12:checkcast       #167 <Class Iterable>
	//    6   15:astore_0        
		Collection collection = (Collection)new ArrayList();
	//    7   16:new             #224 <Class ArrayList>
	//    8   19:dup             
	//    9   20:invokespecial   #320 <Method void ArrayList()>
	//   10   23:checkcast       #189 <Class Collection>
	//   11   26:astore_2        
		Iterator iterator = ((Iterable) (kclass)).iterator();
	//   12   27:aload_0         
	//   13   28:invokeinterface #171 <Method Iterator Iterable.iterator()>
	//   14   33:astore_3        
		do
		{
			if(!iterator.hasNext())
				break;
	//   15   34:aload_3         
	//   16   35:invokeinterface #177 <Method boolean Iterator.hasNext()>
	//   17   40:ifeq            89
			kotlin.reflect.KClassifier kclassifier = ((KType)iterator.next()).getClassifier();
	//   18   43:aload_3         
	//   19   44:invokeinterface #181 <Method Object Iterator.next()>
	//   20   49:checkcast       #235 <Class KType>
	//   21   52:invokeinterface #239 <Method kotlin.reflect.KClassifier KType.getClassifier()>
	//   22   57:astore_1        
			kclass = ((KClass) (kclassifier));
	//   23   58:aload_1         
	//   24   59:astore_0        
			if(!(kclassifier instanceof KClass))
	//*  25   60:aload_1         
	//*  26   61:instanceof      #126 <Class KClass>
	//*  27   64:ifne            69
				kclass = null;
	//   28   67:aconst_null     
	//   29   68:astore_0        
			kclass = (KClass)kclass;
	//   30   69:aload_0         
	//   31   70:checkcast       #126 <Class KClass>
	//   32   73:astore_0        
			if(kclass != null)
	//*  33   74:aload_0         
	//*  34   75:ifnull          34
				collection.add(((Object) (kclass)));
	//   35   78:aload_2         
	//   36   79:aload_0         
	//   37   80:invokeinterface #242 <Method boolean Collection.add(Object)>
	//   38   85:pop             
		} while(true);
	//   39   86:goto            34
		return (List)collection;
	//   40   89:aload_2         
	//   41   90:checkcast       #249 <Class List>
	//   42   93:areturn         
	}

	private static final boolean isExtension(KCallableImpl kcallableimpl)
	{
		return kcallableimpl.getDescriptor().getExtensionReceiverParameter() != null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #388 <Method CallableMemberDescriptor KCallableImpl.getDescriptor()>
	//    2    4:invokeinterface #394 <Method kotlin.reflect.jvm.internal.impl.descriptors.ReceiverParameterDescriptor CallableMemberDescriptor.getExtensionReceiverParameter()>
	//    3    9:ifnull          14
	//    4   12:iconst_1        
	//    5   13:ireturn         
	//    6   14:iconst_0        
	//    7   15:ireturn         
	}

	private static final boolean isNotExtension(KCallableImpl kcallableimpl)
	{
		return isExtension(kcallableimpl) ^ true;
	//    0    0:aload_0         
	//    1    1:invokestatic    #328 <Method boolean isExtension(KCallableImpl)>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	public static final boolean isSubclassOf(KClass kclass, KClass kclass1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (kclass1)), "base");
	//    3    6:aload_1         
	//    4    7:ldc2            #397 <String "base">
	//    5   10:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!Intrinsics.areEqual(((Object) (kclass)), ((Object) (kclass1))))
	//*   6   13:aload_0         
	//*   7   14:aload_1         
	//*   8   15:invokestatic    #401 <Method boolean Intrinsics.areEqual(Object, Object)>
	//*   9   18:ifne            90
		{
			Collection collection = (Collection)CollectionsKt.listOf(((Object) (kclass)));
	//   10   21:aload_0         
	//   11   22:invokestatic    #405 <Method List CollectionsKt.listOf(Object)>
	//   12   25:checkcast       #189 <Class Collection>
	//   13   28:astore_3        
	/* block-local class not found */
	class isSubclassOf._cls1 {}

			Function1 function1 = (Function1)isSubclassOf._cls1.INSTANCE;
	//   14   29:getstatic       #409 <Field KProperty1 KClasses$isSubclassOf$1.INSTANCE>
	//   15   32:checkcast       #411 <Class Function1>
	//   16   35:astore_2        
			kclass = ((KClass) (function1));
	//   17   36:aload_2         
	//   18   37:astore_0        
	/* block-local class not found */
	class sam.org_jetbrains_kotlin_utils_DFS_Neighbors._cls0 {}

			if(function1 != null)
	//*  19   38:aload_2         
	//*  20   39:ifnull          51
				kclass = ((KClass) (new sam.org_jetbrains_kotlin_utils_DFS_Neighbors._cls0(function1)));
	//   21   42:new             #413 <Class KClasses$sam$org_jetbrains_kotlin_utils_DFS_Neighbors$0>
	//   22   45:dup             
	//   23   46:aload_2         
	//   24   47:invokespecial   #416 <Method void KClasses$sam$org_jetbrains_kotlin_utils_DFS_Neighbors$0(Function1)>
	//   25   50:astore_0        
	/* block-local class not found */
	class isSubclassOf._cls2 {}

			kclass = ((KClass) (DFS.ifAny(collection, (kotlin.reflect.jvm.internal.impl.utils.DFS.Neighbors)kclass, (Function1)new isSubclassOf._cls2(kclass1))));
	//   26   51:aload_3         
	//   27   52:aload_0         
	//   28   53:checkcast       #261 <Class kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors>
	//   29   56:new             #418 <Class KClasses$isSubclassOf$2>
	//   30   59:dup             
	//   31   60:aload_1         
	//   32   61:invokespecial   #419 <Method void KClasses$isSubclassOf$2(KClass)>
	//   33   64:checkcast       #411 <Class Function1>
	//   34   67:invokestatic    #423 <Method Boolean DFS.ifAny(Collection, kotlin.reflect.jvm.internal.impl.utils.DFS$Neighbors, Function1)>
	//   35   70:astore_0        
			Intrinsics.checkExpressionValueIsNotNull(((Object) (kclass)), "DFS.ifAny(listOf(this), \u2026erclasses) { it == base }");
	//   36   71:aload_0         
	//   37   72:ldc2            #425 <String "DFS.ifAny(listOf(this), \u2026erclasses) { it == base }">
	//   38   75:invokestatic    #282 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
			if(!((Boolean) (kclass)).booleanValue())
	//*  39   78:aload_0         
	//*  40   79:invokevirtual   #430 <Method boolean Boolean.booleanValue()>
	//*  41   82:ifeq            88
	//*  42   85:goto            90
				return false;
	//   43   88:iconst_0        
	//   44   89:ireturn         
		}
		return true;
	//   45   90:iconst_1        
	//   46   91:ireturn         
	}

	public static final boolean isSuperclassOf(KClass kclass, KClass kclass1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (kclass1)), "derived");
	//    3    6:aload_1         
	//    4    7:ldc2            #432 <String "derived">
	//    5   10:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return isSubclassOf(kclass1, kclass);
	//    6   13:aload_1         
	//    7   14:aload_0         
	//    8   15:invokestatic    #434 <Method boolean isSubclassOf(KClass, KClass)>
	//    9   18:ireturn         
	}

	public static void memberExtensionFunctions$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void memberExtensionProperties$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void memberFunctions$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void memberProperties$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void primaryConstructor$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static final Object safeCast(KClass kclass, Object obj)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (kclass)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #118 <String "receiver$0">
	//    2    3:invokestatic    #124 <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(kclass.isInstance(obj))
	//*   3    6:aload_0         
	//*   4    7:aload_1         
	//*   5    8:invokeinterface #130 <Method boolean KClass.isInstance(Object)>
	//*   6   13:ifeq            32
		{
			kclass = ((KClass) (obj));
	//    7   16:aload_1         
	//    8   17:astore_0        
			if(obj == null)
	//*   9   18:aload_1         
	//*  10   19:ifnonnull       34
				throw new TypeCastException("null cannot be cast to non-null type T");
	//   11   22:new             #148 <Class TypeCastException>
	//   12   25:dup             
	//   13   26:ldc1            #158 <String "null cannot be cast to non-null type T">
	//   14   28:invokespecial   #154 <Method void TypeCastException(String)>
	//   15   31:athrow          
		} else
		{
			kclass = null;
	//   16   32:aconst_null     
	//   17   33:astore_0        
		}
		return ((Object) (kclass));
	//   18   34:aload_0         
	//   19   35:areturn         
	}

	public static void staticFunctions$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void staticProperties$annotations(KClass kclass)
	{
	//    0    0:return          
	}

	public static void superclasses$annotations(KClass kclass)
	{
	//    0    0:return          
	}
}
