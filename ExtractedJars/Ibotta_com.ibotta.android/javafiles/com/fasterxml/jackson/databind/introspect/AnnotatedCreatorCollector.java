// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.util.*;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//			CollectorBase, MemberKey, AnnotatedConstructor, AnnotatedMethod, 
//			AnnotationCollector, AnnotationMap, AnnotatedMember, TypeResolutionContext

final class AnnotatedCreatorCollector extends CollectorBase
{

	AnnotatedCreatorCollector(AnnotationIntrospector annotationintrospector, TypeResolutionContext typeresolutioncontext)
	{
		super(annotationintrospector);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #13  <Method void CollectorBase(AnnotationIntrospector)>
		_typeContext = typeresolutioncontext;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #15  <Field TypeResolutionContext _typeContext>
	//    6   10:return          
	}

	private List _findPotentialConstructors(JavaType javatype, Class class1)
	{
		boolean flag1 = javatype.isEnumType();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #24  <Method boolean JavaType.isEnumType()>
	//    2    4:istore          8
		boolean flag = false;
	//    3    6:iconst_0        
	//    4    7:istore          6
		Object obj4;
		if(!flag1)
	//*   5    9:iload           8
	//*   6   11:ifne            126
		{
			com.fasterxml.jackson.databind.util.ClassUtil.Ctor actor[] = ClassUtil.getConstructors(javatype.getRawClass());
	//    7   14:aload_1         
	//    8   15:invokevirtual   #28  <Method Class JavaType.getRawClass()>
	//    9   18:invokestatic    #34  <Method com.fasterxml.jackson.databind.util.ClassUtil$Ctor[] ClassUtil.getConstructors(Class)>
	//   10   21:astore          12
			int k = actor.length;
	//   11   23:aload           12
	//   12   25:arraylength     
	//   13   26:istore          4
			Object obj2 = null;
	//   14   28:aconst_null     
	//   15   29:astore          10
			Object obj = obj2;
	//   16   31:aload           10
	//   17   33:astore          9
			int i = 0;
	//   18   35:iconst_0        
	//   19   36:istore_3        
			do
			{
				javatype = ((JavaType) (obj2));
	//   20   37:aload           10
	//   21   39:astore_1        
				obj4 = obj;
	//   22   40:aload           9
	//   23   42:astore          11
				if(i >= k)
					break;
	//   24   44:iload_3         
	//   25   45:iload           4
	//   26   47:icmpge          131
				obj4 = ((Object) (actor[i]));
	//   27   50:aload           12
	//   28   52:iload_3         
	//   29   53:aaload          
	//   30   54:astore          11
				if(!isIncludableConstructor(((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (obj4)).getConstructor()))
	//*  31   56:aload           11
	//*  32   58:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//*  33   61:invokestatic    #44  <Method boolean isIncludableConstructor(Constructor)>
	//*  34   64:ifne            73
					javatype = ((JavaType) (obj));
	//   35   67:aload           9
	//   36   69:astore_1        
				else
	//*  37   70:goto            116
				if(((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (obj4)).getParamCount() == 0)
	//*  38   73:aload           11
	//*  39   75:invokevirtual   #48  <Method int com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getParamCount()>
	//*  40   78:ifne            91
				{
					obj2 = obj4;
	//   41   81:aload           11
	//   42   83:astore          10
					javatype = ((JavaType) (obj));
	//   43   85:aload           9
	//   44   87:astore_1        
				} else
	//*  45   88:goto            116
				{
					javatype = ((JavaType) (obj));
	//   46   91:aload           9
	//   47   93:astore_1        
					if(obj == null)
	//*  48   94:aload           9
	//*  49   96:ifnonnull       107
						javatype = ((JavaType) (new ArrayList()));
	//   50   99:new             #50  <Class ArrayList>
	//   51  102:dup             
	//   52  103:invokespecial   #53  <Method void ArrayList()>
	//   53  106:astore_1        
					((List) (javatype)).add(obj4);
	//   54  107:aload_1         
	//   55  108:aload           11
	//   56  110:invokeinterface #59  <Method boolean List.add(Object)>
	//   57  115:pop             
				}
				i++;
	//   58  116:iload_3         
	//   59  117:iconst_1        
	//   60  118:iadd            
	//   61  119:istore_3        
				obj = ((Object) (javatype));
	//   62  120:aload_1         
	//   63  121:astore          9
			} while(true);
	//   64  123:goto            37
		} else
		{
			javatype = null;
	//   65  126:aconst_null     
	//   66  127:astore_1        
			obj4 = ((Object) (javatype));
	//   67  128:aload_1         
	//   68  129:astore          11
		}
		int j;
		Object obj3;
		if(obj4 == null)
	//*  69  131:aload           11
	//*  70  133:ifnonnull       153
		{
			obj3 = ((Object) (Collections.emptyList()));
	//   71  136:invokestatic    #65  <Method List Collections.emptyList()>
	//   72  139:astore          10
			if(javatype == null)
	//*  73  141:aload_1         
	//*  74  142:ifnonnull       148
				return ((List) (obj3));
	//   75  145:aload           10
	//   76  147:areturn         
			j = 0;
	//   77  148:iconst_0        
	//   78  149:istore_3        
		} else
	//*  79  150:goto            208
		{
			int k1 = ((List) (obj4)).size();
	//   80  153:aload           11
	//   81  155:invokeinterface #68  <Method int List.size()>
	//   82  160:istore          5
			ArrayList arraylist = new ArrayList(k1);
	//   83  162:new             #50  <Class ArrayList>
	//   84  165:dup             
	//   85  166:iload           5
	//   86  168:invokespecial   #71  <Method void ArrayList(int)>
	//   87  171:astore          9
			int l = 0;
	//   88  173:iconst_0        
	//   89  174:istore          4
			do
			{
				obj3 = ((Object) (arraylist));
	//   90  176:aload           9
	//   91  178:astore          10
				j = k1;
	//   92  180:iload           5
	//   93  182:istore_3        
				if(l >= k1)
					break;
	//   94  183:iload           4
	//   95  185:iload           5
	//   96  187:icmpge          208
				((List) (arraylist)).add(((Object) (null)));
	//   97  190:aload           9
	//   98  192:aconst_null     
	//   99  193:invokeinterface #59  <Method boolean List.add(Object)>
	//  100  198:pop             
				l++;
	//  101  199:iload           4
	//  102  201:iconst_1        
	//  103  202:iadd            
	//  104  203:istore          4
			} while(true);
	//  105  205:goto            176
		}
		Object obj1 = ((Object) (javatype));
	//  106  208:aload_1         
	//  107  209:astore          9
		if(class1 != null)
	//* 108  211:aload_2         
	//* 109  212:ifnull          459
		{
			com.fasterxml.jackson.databind.util.ClassUtil.Ctor actor1[] = ClassUtil.getConstructors(class1);
	//  110  215:aload_2         
	//  111  216:invokestatic    #34  <Method com.fasterxml.jackson.databind.util.ClassUtil$Ctor[] ClassUtil.getConstructors(Class)>
	//  112  219:astore          14
			int j2 = actor1.length;
	//  113  221:aload           14
	//  114  223:arraylength     
	//  115  224:istore          7
			class1 = null;
	//  116  226:aconst_null     
	//  117  227:astore_2        
			for(int i1 = 0; i1 < j2;)
	//* 118  228:iconst_0        
	//* 119  229:istore          4
	//* 120  231:iload           4
	//* 121  233:iload           7
	//* 122  235:icmpge          456
			{
				com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor = actor1[i1];
	//  123  238:aload           14
	//  124  240:iload           4
	//  125  242:aaload          
	//  126  243:astore          15
				JavaType javatype1;
				Object obj5;
				if(ctor.getParamCount() == 0)
	//* 127  245:aload           15
	//* 128  247:invokevirtual   #48  <Method int com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getParamCount()>
	//* 129  250:ifne            283
				{
					javatype1 = javatype;
	//  130  253:aload_1         
	//  131  254:astore          12
					obj5 = ((Object) (class1));
	//  132  256:aload_2         
	//  133  257:astore          13
					if(javatype != null)
	//* 134  259:aload_1         
	//* 135  260:ifnull          441
					{
						_defaultConstructor = constructDefaultConstructor(((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (javatype)), ctor);
	//  136  263:aload_0         
	//  137  264:aload_0         
	//  138  265:aload_1         
	//  139  266:aload           15
	//  140  268:invokevirtual   #75  <Method AnnotatedConstructor constructDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor)>
	//  141  271:putfield        #77  <Field AnnotatedConstructor _defaultConstructor>
						javatype1 = null;
	//  142  274:aconst_null     
	//  143  275:astore          12
						obj5 = ((Object) (class1));
	//  144  277:aload_2         
	//  145  278:astore          13
					}
				} else
	//* 146  280:goto            441
				{
					javatype1 = javatype;
	//  147  283:aload_1         
	//  148  284:astore          12
					obj5 = ((Object) (class1));
	//  149  286:aload_2         
	//  150  287:astore          13
					if(obj4 != null)
	//* 151  289:aload           11
	//* 152  291:ifnull          441
					{
						obj1 = ((Object) (class1));
	//  153  294:aload_2         
	//  154  295:astore          9
						if(class1 == null)
	//* 155  297:aload_2         
	//* 156  298:ifnonnull       353
						{
							class1 = ((Class) (new MemberKey[j]));
	//  157  301:iload_3         
	//  158  302:anewarray       MemberKey[]
	//  159  305:astore_2        
							int l1 = 0;
	//  160  306:iconst_0        
	//  161  307:istore          5
							do
							{
								obj1 = ((Object) (class1));
	//  162  309:aload_2         
	//  163  310:astore          9
								if(l1 >= j)
									break;
	//  164  312:iload           5
	//  165  314:iload_3         
	//  166  315:icmpge          353
								class1[l1] = ((/*<invalid signature>*/java.lang.Object) (new MemberKey(((com.fasterxml.jackson.databind.util.ClassUtil.Ctor)((List) (obj4)).get(l1)).getConstructor())));
	//  167  318:aload_2         
	//  168  319:iload           5
	//  169  321:new             #79  <Class MemberKey>
	//  170  324:dup             
	//  171  325:aload           11
	//  172  327:iload           5
	//  173  329:invokeinterface #83  <Method Object List.get(int)>
	//  174  334:checkcast       #36  <Class com.fasterxml.jackson.databind.util.ClassUtil$Ctor>
	//  175  337:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//  176  340:invokespecial   #86  <Method void MemberKey(Constructor)>
	//  177  343:aastore         
								l1++;
	//  178  344:iload           5
	//  179  346:iconst_1        
	//  180  347:iadd            
	//  181  348:istore          5
							} while(true);
	//  182  350:goto            309
						}
						class1 = ((Class) (new MemberKey(ctor.getConstructor())));
	//  183  353:new             #79  <Class MemberKey>
	//  184  356:dup             
	//  185  357:aload           15
	//  186  359:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//  187  362:invokespecial   #86  <Method void MemberKey(Constructor)>
	//  188  365:astore_2        
						int i2 = 0;
	//  189  366:iconst_0        
	//  190  367:istore          5
						do
						{
							javatype1 = javatype;
	//  191  369:aload_1         
	//  192  370:astore          12
							obj5 = obj1;
	//  193  372:aload           9
	//  194  374:astore          13
							if(i2 >= j)
								break;
	//  195  376:iload           5
	//  196  378:iload_3         
	//  197  379:icmpge          441
							if(((MemberKey) (class1)).equals(((Object) (obj1[i2]))))
	//* 198  382:aload_2         
	//* 199  383:aload           9
	//* 200  385:iload           5
	//* 201  387:aaload          
	//* 202  388:invokevirtual   #89  <Method boolean MemberKey.equals(Object)>
	//* 203  391:ifeq            432
							{
								((List) (obj3)).set(i2, ((Object) (constructNonDefaultConstructor((com.fasterxml.jackson.databind.util.ClassUtil.Ctor)((List) (obj4)).get(i2), ctor))));
	//  204  394:aload           10
	//  205  396:iload           5
	//  206  398:aload_0         
	//  207  399:aload           11
	//  208  401:iload           5
	//  209  403:invokeinterface #83  <Method Object List.get(int)>
	//  210  408:checkcast       #36  <Class com.fasterxml.jackson.databind.util.ClassUtil$Ctor>
	//  211  411:aload           15
	//  212  413:invokevirtual   #92  <Method AnnotatedConstructor constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor)>
	//  213  416:invokeinterface #96  <Method Object List.set(int, Object)>
	//  214  421:pop             
								javatype1 = javatype;
	//  215  422:aload_1         
	//  216  423:astore          12
								obj5 = obj1;
	//  217  425:aload           9
	//  218  427:astore          13
								break;
	//  219  429:goto            441
							}
							i2++;
	//  220  432:iload           5
	//  221  434:iconst_1        
	//  222  435:iadd            
	//  223  436:istore          5
						} while(true);
	//  224  438:goto            369
					}
				}
				i1++;
	//  225  441:iload           4
	//  226  443:iconst_1        
	//  227  444:iadd            
	//  228  445:istore          4
				javatype = javatype1;
	//  229  447:aload           12
	//  230  449:astore_1        
				class1 = ((Class) (obj5));
	//  231  450:aload           13
	//  232  452:astore_2        
			}

	//* 233  453:goto            231
			obj1 = ((Object) (javatype));
	//  234  456:aload_1         
	//  235  457:astore          9
		}
		int j1 = ((int) (flag));
	//  236  459:iload           6
	//  237  461:istore          4
		if(obj1 != null)
	//* 238  463:aload           9
	//* 239  465:ifnull          483
		{
			_defaultConstructor = constructDefaultConstructor(((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (obj1)), ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (null)));
	//  240  468:aload_0         
	//  241  469:aload_0         
	//  242  470:aload           9
	//  243  472:aconst_null     
	//  244  473:invokevirtual   #75  <Method AnnotatedConstructor constructDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor)>
	//  245  476:putfield        #77  <Field AnnotatedConstructor _defaultConstructor>
			j1 = ((int) (flag));
	//  246  479:iload           6
	//  247  481:istore          4
		}
		for(; j1 < j; j1++)
	//* 248  483:iload           4
	//* 249  485:iload_3         
	//* 250  486:icmpge          540
			if((AnnotatedConstructor)((List) (obj3)).get(j1) == null)
	//* 251  489:aload           10
	//* 252  491:iload           4
	//* 253  493:invokeinterface #83  <Method Object List.get(int)>
	//* 254  498:checkcast       #98  <Class AnnotatedConstructor>
	//* 255  501:ifnonnull       531
				((List) (obj3)).set(j1, ((Object) (constructNonDefaultConstructor((com.fasterxml.jackson.databind.util.ClassUtil.Ctor)((List) (obj4)).get(j1), ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (null))))));
	//  256  504:aload           10
	//  257  506:iload           4
	//  258  508:aload_0         
	//  259  509:aload           11
	//  260  511:iload           4
	//  261  513:invokeinterface #83  <Method Object List.get(int)>
	//  262  518:checkcast       #36  <Class com.fasterxml.jackson.databind.util.ClassUtil$Ctor>
	//  263  521:aconst_null     
	//  264  522:invokevirtual   #92  <Method AnnotatedConstructor constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor)>
	//  265  525:invokeinterface #96  <Method Object List.set(int, Object)>
	//  266  530:pop             

	//  267  531:iload           4
	//  268  533:iconst_1        
	//  269  534:iadd            
	//  270  535:istore          4
	//* 271  537:goto            483
		return ((List) (obj3));
	//  272  540:aload           10
	//  273  542:areturn         
	}

	private List _findPotentialFactories(JavaType javatype, Class class1)
	{
		Method amethod[] = ClassUtil.getClassMethods(javatype.getRawClass());
	//    0    0:aload_1         
	//    1    1:invokevirtual   #28  <Method Class JavaType.getRawClass()>
	//    2    4:invokestatic    #105 <Method Method[] ClassUtil.getClassMethods(Class)>
	//    3    7:astore          9
		int l = amethod.length;
	//    4    9:aload           9
	//    5   11:arraylength     
	//    6   12:istore          4
		boolean flag = false;
	//    7   14:iconst_0        
	//    8   15:istore          5
		javatype = null;
	//    9   17:aconst_null     
	//   10   18:astore_1        
		for(int i = 0; i < l; i++)
	//*  11   19:iconst_0        
	//*  12   20:istore_3        
	//*  13   21:iload_3         
	//*  14   22:iload           4
	//*  15   24:icmpge          83
		{
			Method method = amethod[i];
	//   16   27:aload           9
	//   17   29:iload_3         
	//   18   30:aaload          
	//   19   31:astore          10
			if(!Modifier.isStatic(method.getModifiers()))
	//*  20   33:aload           10
	//*  21   35:invokevirtual   #110 <Method int Method.getModifiers()>
	//*  22   38:invokestatic    #116 <Method boolean Modifier.isStatic(int)>
	//*  23   41:ifne            47
				continue;
	//   24   44:goto            76
			Object obj = ((Object) (javatype));
	//   25   47:aload_1         
	//   26   48:astore          8
			if(javatype == null)
	//*  27   50:aload_1         
	//*  28   51:ifnonnull       63
				obj = ((Object) (new ArrayList()));
	//   29   54:new             #50  <Class ArrayList>
	//   30   57:dup             
	//   31   58:invokespecial   #53  <Method void ArrayList()>
	//   32   61:astore          8
			((List) (obj)).add(((Object) (method)));
	//   33   63:aload           8
	//   34   65:aload           10
	//   35   67:invokeinterface #59  <Method boolean List.add(Object)>
	//   36   72:pop             
			javatype = ((JavaType) (obj));
	//   37   73:aload           8
	//   38   75:astore_1        
		}

	//   39   76:iload_3         
	//   40   77:iconst_1        
	//   41   78:iadd            
	//   42   79:istore_3        
	//*  43   80:goto            21
		if(javatype == null)
	//*  44   83:aload_1         
	//*  45   84:ifnonnull       91
			return Collections.emptyList();
	//   46   87:invokestatic    #65  <Method List Collections.emptyList()>
	//   47   90:areturn         
		int i1 = ((List) (javatype)).size();
	//   48   91:aload_1         
	//   49   92:invokeinterface #68  <Method int List.size()>
	//   50   97:istore          6
		ArrayList arraylist = new ArrayList(i1);
	//   51   99:new             #50  <Class ArrayList>
	//   52  102:dup             
	//   53  103:iload           6
	//   54  105:invokespecial   #71  <Method void ArrayList(int)>
	//   55  108:astore          9
		for(int j = 0; j < i1; j++)
	//*  56  110:iconst_0        
	//*  57  111:istore_3        
	//*  58  112:iload_3         
	//*  59  113:iload           6
	//*  60  115:icmpge          134
			((List) (arraylist)).add(((Object) (null)));
	//   61  118:aload           9
	//   62  120:aconst_null     
	//   63  121:invokeinterface #59  <Method boolean List.add(Object)>
	//   64  126:pop             

	//   65  127:iload_3         
	//   66  128:iconst_1        
	//   67  129:iadd            
	//   68  130:istore_3        
	//*  69  131:goto            112
		l = ((int) (flag));
	//   70  134:iload           5
	//   71  136:istore          4
		if(class1 != null)
	//*  72  138:aload_2         
	//*  73  139:ifnull          333
		{
			Method amethod1[] = ClassUtil.getDeclaredMethods(class1);
	//   74  142:aload_2         
	//   75  143:invokestatic    #119 <Method Method[] ClassUtil.getDeclaredMethods(Class)>
	//   76  146:astore          10
			int j1 = amethod1.length;
	//   77  148:aload           10
	//   78  150:arraylength     
	//   79  151:istore          7
			Object obj1 = null;
	//   80  153:aconst_null     
	//   81  154:astore          8
			int k = 0;
	//   82  156:iconst_0        
	//   83  157:istore_3        
			do
			{
				l = ((int) (flag));
	//   84  158:iload           5
	//   85  160:istore          4
				if(k >= j1)
					break;
	//   86  162:iload_3         
	//   87  163:iload           7
	//   88  165:icmpge          333
				Method method1 = amethod1[k];
	//   89  168:aload           10
	//   90  170:iload_3         
	//   91  171:aaload          
	//   92  172:astore          11
				if(Modifier.isStatic(method1.getModifiers()))
	//*  93  174:aload           11
	//*  94  176:invokevirtual   #110 <Method int Method.getModifiers()>
	//*  95  179:invokestatic    #116 <Method boolean Modifier.isStatic(int)>
	//*  96  182:ifne            188
	//*  97  185:goto            326
				{
					class1 = ((Class) (obj1));
	//   98  188:aload           8
	//   99  190:astore_2        
					if(obj1 == null)
	//* 100  191:aload           8
	//* 101  193:ifnonnull       248
					{
						obj1 = ((Object) (new MemberKey[i1]));
	//  102  196:iload           6
	//  103  198:anewarray       MemberKey[]
	//  104  201:astore          8
						l = 0;
	//  105  203:iconst_0        
	//  106  204:istore          4
						do
						{
							class1 = ((Class) (obj1));
	//  107  206:aload           8
	//  108  208:astore_2        
							if(l >= i1)
								break;
	//  109  209:iload           4
	//  110  211:iload           6
	//  111  213:icmpge          248
							obj1[l] = new MemberKey((Method)((List) (javatype)).get(l));
	//  112  216:aload           8
	//  113  218:iload           4
	//  114  220:new             #79  <Class MemberKey>
	//  115  223:dup             
	//  116  224:aload_1         
	//  117  225:iload           4
	//  118  227:invokeinterface #83  <Method Object List.get(int)>
	//  119  232:checkcast       #107 <Class Method>
	//  120  235:invokespecial   #122 <Method void MemberKey(Method)>
	//  121  238:aastore         
							l++;
	//  122  239:iload           4
	//  123  241:iconst_1        
	//  124  242:iadd            
	//  125  243:istore          4
						} while(true);
	//  126  245:goto            206
					}
					MemberKey memberkey = new MemberKey(method1);
	//  127  248:new             #79  <Class MemberKey>
	//  128  251:dup             
	//  129  252:aload           11
	//  130  254:invokespecial   #122 <Method void MemberKey(Method)>
	//  131  257:astore          12
					l = 0;
	//  132  259:iconst_0        
	//  133  260:istore          4
					do
					{
						obj1 = ((Object) (class1));
	//  134  262:aload_2         
	//  135  263:astore          8
						if(l >= i1)
							break;
	//  136  265:iload           4
	//  137  267:iload           6
	//  138  269:icmpge          326
						if(memberkey.equals(((Object) (class1[l]))))
	//* 139  272:aload           12
	//* 140  274:aload_2         
	//* 141  275:iload           4
	//* 142  277:aaload          
	//* 143  278:invokevirtual   #89  <Method boolean MemberKey.equals(Object)>
	//* 144  281:ifeq            317
						{
							((List) (arraylist)).set(l, ((Object) (constructFactoryCreator((Method)((List) (javatype)).get(l), method1))));
	//  145  284:aload           9
	//  146  286:iload           4
	//  147  288:aload_0         
	//  148  289:aload_1         
	//  149  290:iload           4
	//  150  292:invokeinterface #83  <Method Object List.get(int)>
	//  151  297:checkcast       #107 <Class Method>
	//  152  300:aload           11
	//  153  302:invokevirtual   #126 <Method AnnotatedMethod constructFactoryCreator(Method, Method)>
	//  154  305:invokeinterface #96  <Method Object List.set(int, Object)>
	//  155  310:pop             
							obj1 = ((Object) (class1));
	//  156  311:aload_2         
	//  157  312:astore          8
							break;
	//  158  314:goto            326
						}
						l++;
	//  159  317:iload           4
	//  160  319:iconst_1        
	//  161  320:iadd            
	//  162  321:istore          4
					} while(true);
	//  163  323:goto            262
				}
				k++;
	//  164  326:iload_3         
	//  165  327:iconst_1        
	//  166  328:iadd            
	//  167  329:istore_3        
			} while(true);
	//  168  330:goto            158
		}
		for(; l < i1; l++)
	//* 169  333:iload           4
	//* 170  335:iload           6
	//* 171  337:icmpge          390
			if((AnnotatedMethod)((List) (arraylist)).get(l) == null)
	//* 172  340:aload           9
	//* 173  342:iload           4
	//* 174  344:invokeinterface #83  <Method Object List.get(int)>
	//* 175  349:checkcast       #128 <Class AnnotatedMethod>
	//* 176  352:ifnonnull       381
				((List) (arraylist)).set(l, ((Object) (constructFactoryCreator((Method)((List) (javatype)).get(l), ((Method) (null))))));
	//  177  355:aload           9
	//  178  357:iload           4
	//  179  359:aload_0         
	//  180  360:aload_1         
	//  181  361:iload           4
	//  182  363:invokeinterface #83  <Method Object List.get(int)>
	//  183  368:checkcast       #107 <Class Method>
	//  184  371:aconst_null     
	//  185  372:invokevirtual   #126 <Method AnnotatedMethod constructFactoryCreator(Method, Method)>
	//  186  375:invokeinterface #96  <Method Object List.set(int, Object)>
	//  187  380:pop             

	//  188  381:iload           4
	//  189  383:iconst_1        
	//  190  384:iadd            
	//  191  385:istore          4
	//* 192  387:goto            333
		return ((List) (arraylist));
	//  193  390:aload           9
	//  194  392:areturn         
	}

	private AnnotationMap collectAnnotations(com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor, com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor1)
	{
		AnnotationCollector annotationcollector = collectAnnotations(ctor.getConstructor().getDeclaredAnnotations());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//    3    5:invokevirtual   #137 <Method Annotation[] Constructor.getDeclaredAnnotations()>
	//    4    8:invokevirtual   #140 <Method AnnotationCollector collectAnnotations(Annotation[])>
	//    5   11:astore_3        
		ctor = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (annotationcollector));
	//    6   12:aload_3         
	//    7   13:astore_1        
		if(ctor1 != null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          31
			ctor = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (collectAnnotations(annotationcollector, ctor1.getConstructor().getDeclaredAnnotations())));
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   14   24:invokevirtual   #137 <Method Annotation[] Constructor.getDeclaredAnnotations()>
	//   15   27:invokevirtual   #143 <Method AnnotationCollector collectAnnotations(AnnotationCollector, Annotation[])>
	//   16   30:astore_1        
		return ((AnnotationCollector) (ctor)).asAnnotationMap();
	//   17   31:aload_1         
	//   18   32:invokevirtual   #149 <Method AnnotationMap AnnotationCollector.asAnnotationMap()>
	//   19   35:areturn         
	}

	private final AnnotationMap collectAnnotations(AnnotatedElement annotatedelement, AnnotatedElement annotatedelement1)
	{
		AnnotationCollector annotationcollector = collectAnnotations(annotatedelement.getDeclaredAnnotations());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #153 <Method Annotation[] AnnotatedElement.getDeclaredAnnotations()>
	//    3    7:invokevirtual   #140 <Method AnnotationCollector collectAnnotations(Annotation[])>
	//    4   10:astore_3        
		annotatedelement = ((AnnotatedElement) (annotationcollector));
	//    5   11:aload_3         
	//    6   12:astore_1        
		if(annotatedelement1 != null)
	//*   7   13:aload_2         
	//*   8   14:ifnull          29
			annotatedelement = ((AnnotatedElement) (collectAnnotations(annotationcollector, annotatedelement1.getDeclaredAnnotations())));
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:aload_2         
	//   12   20:invokeinterface #153 <Method Annotation[] AnnotatedElement.getDeclaredAnnotations()>
	//   13   25:invokevirtual   #143 <Method AnnotationCollector collectAnnotations(AnnotationCollector, Annotation[])>
	//   14   28:astore_1        
		return ((AnnotationCollector) (annotatedelement)).asAnnotationMap();
	//   15   29:aload_1         
	//   16   30:invokevirtual   #149 <Method AnnotationMap AnnotationCollector.asAnnotationMap()>
	//   17   33:areturn         
	}

	private AnnotationMap[] collectAnnotations(Annotation aannotation[][], Annotation aannotation1[][])
	{
		int j = aannotation.length;
	//    0    0:aload_1         
	//    1    1:arraylength     
	//    2    2:istore          4
		AnnotationMap aannotationmap[] = new AnnotationMap[j];
	//    3    4:iload           4
	//    4    6:anewarray       AnnotationMap[]
	//    5    9:astore          7
		for(int i = 0; i < j; i++)
	//*   6   11:iconst_0        
	//*   7   12:istore_3        
	//*   8   13:iload_3         
	//*   9   14:iload           4
	//*  10   16:icmpge          66
		{
			AnnotationCollector annotationcollector1 = collectAnnotations(AnnotationCollector.emptyCollector(), aannotation[i]);
	//   11   19:aload_0         
	//   12   20:invokestatic    #160 <Method AnnotationCollector AnnotationCollector.emptyCollector()>
	//   13   23:aload_1         
	//   14   24:iload_3         
	//   15   25:aaload          
	//   16   26:invokevirtual   #143 <Method AnnotationCollector collectAnnotations(AnnotationCollector, Annotation[])>
	//   17   29:astore          6
			AnnotationCollector annotationcollector = annotationcollector1;
	//   18   31:aload           6
	//   19   33:astore          5
			if(aannotation1 != null)
	//*  20   35:aload_2         
	//*  21   36:ifnull          50
				annotationcollector = collectAnnotations(annotationcollector1, aannotation1[i]);
	//   22   39:aload_0         
	//   23   40:aload           6
	//   24   42:aload_2         
	//   25   43:iload_3         
	//   26   44:aaload          
	//   27   45:invokevirtual   #143 <Method AnnotationCollector collectAnnotations(AnnotationCollector, Annotation[])>
	//   28   48:astore          5
			aannotationmap[i] = annotationcollector.asAnnotationMap();
	//   29   50:aload           7
	//   30   52:iload_3         
	//   31   53:aload           5
	//   32   55:invokevirtual   #149 <Method AnnotationMap AnnotationCollector.asAnnotationMap()>
	//   33   58:aastore         
		}

	//   34   59:iload_3         
	//   35   60:iconst_1        
	//   36   61:iadd            
	//   37   62:istore_3        
	//*  38   63:goto            13
		return aannotationmap;
	//   39   66:aload           7
	//   40   68:areturn         
	}

	public static AnnotatedClass.Creators collectCreators(AnnotationIntrospector annotationintrospector, TypeResolutionContext typeresolutioncontext, JavaType javatype, Class class1)
	{
		return (new AnnotatedCreatorCollector(annotationintrospector, typeresolutioncontext)).collect(javatype, class1);
	//    0    0:new             #2   <Class AnnotatedCreatorCollector>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #164 <Method void AnnotatedCreatorCollector(AnnotationIntrospector, TypeResolutionContext)>
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:invokevirtual   #168 <Method AnnotatedClass$Creators collect(JavaType, Class)>
	//    8   14:areturn         
	}

	private static boolean isIncludableConstructor(Constructor constructor)
	{
		return constructor.isSynthetic() ^ true;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #172 <Method boolean Constructor.isSynthetic()>
	//    2    4:iconst_1        
	//    3    5:ixor            
	//    4    6:ireturn         
	}

	AnnotatedClass.Creators collect(JavaType javatype, Class class1)
	{
		List list = _findPotentialConstructors(javatype, class1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #175 <Method List _findPotentialConstructors(JavaType, Class)>
	//    4    6:astore          5
		javatype = ((JavaType) (_findPotentialFactories(javatype, class1)));
	//    5    8:aload_0         
	//    6    9:aload_1         
	//    7   10:aload_2         
	//    8   11:invokespecial   #177 <Method List _findPotentialFactories(JavaType, Class)>
	//    9   14:astore_1        
		if(_intr != null)
	//*  10   15:aload_0         
	//*  11   16:getfield        #181 <Field AnnotationIntrospector _intr>
	//*  12   19:ifnull          163
		{
			if(_defaultConstructor != null && _intr.hasIgnoreMarker(((AnnotatedMember) (_defaultConstructor))))
	//*  13   22:aload_0         
	//*  14   23:getfield        #77  <Field AnnotatedConstructor _defaultConstructor>
	//*  15   26:ifnull          48
	//*  16   29:aload_0         
	//*  17   30:getfield        #181 <Field AnnotationIntrospector _intr>
	//*  18   33:aload_0         
	//*  19   34:getfield        #77  <Field AnnotatedConstructor _defaultConstructor>
	//*  20   37:invokevirtual   #187 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//*  21   40:ifeq            48
				_defaultConstructor = null;
	//   22   43:aload_0         
	//   23   44:aconst_null     
	//   24   45:putfield        #77  <Field AnnotatedConstructor _defaultConstructor>
			int i = list.size();
	//   25   48:aload           5
	//   26   50:invokeinterface #68  <Method int List.size()>
	//   27   55:istore_3        
			do
			{
				int j = i - 1;
	//   28   56:iload_3         
	//   29   57:iconst_1        
	//   30   58:isub            
	//   31   59:istore          4
				if(j < 0)
					break;
	//   32   61:iload           4
	//   33   63:iflt            107
				i = j;
	//   34   66:iload           4
	//   35   68:istore_3        
				if(_intr.hasIgnoreMarker((AnnotatedMember)list.get(j)))
	//*  36   69:aload_0         
	//*  37   70:getfield        #181 <Field AnnotationIntrospector _intr>
	//*  38   73:aload           5
	//*  39   75:iload           4
	//*  40   77:invokeinterface #83  <Method Object List.get(int)>
	//*  41   82:checkcast       #189 <Class AnnotatedMember>
	//*  42   85:invokevirtual   #187 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//*  43   88:ifeq            56
				{
					list.remove(j);
	//   44   91:aload           5
	//   45   93:iload           4
	//   46   95:invokeinterface #192 <Method Object List.remove(int)>
	//   47  100:pop             
					i = j;
	//   48  101:iload           4
	//   49  103:istore_3        
				}
			} while(true);
	//   50  104:goto            56
			i = ((List) (javatype)).size();
	//   51  107:aload_1         
	//   52  108:invokeinterface #68  <Method int List.size()>
	//   53  113:istore_3        
			do
			{
				int k = i - 1;
	//   54  114:iload_3         
	//   55  115:iconst_1        
	//   56  116:isub            
	//   57  117:istore          4
				if(k < 0)
					break;
	//   58  119:iload           4
	//   59  121:iflt            163
				i = k;
	//   60  124:iload           4
	//   61  126:istore_3        
				if(_intr.hasIgnoreMarker((AnnotatedMember)((List) (javatype)).get(k)))
	//*  62  127:aload_0         
	//*  63  128:getfield        #181 <Field AnnotationIntrospector _intr>
	//*  64  131:aload_1         
	//*  65  132:iload           4
	//*  66  134:invokeinterface #83  <Method Object List.get(int)>
	//*  67  139:checkcast       #189 <Class AnnotatedMember>
	//*  68  142:invokevirtual   #187 <Method boolean AnnotationIntrospector.hasIgnoreMarker(AnnotatedMember)>
	//*  69  145:ifeq            114
				{
					((List) (javatype)).remove(k);
	//   70  148:aload_1         
	//   71  149:iload           4
	//   72  151:invokeinterface #192 <Method Object List.remove(int)>
	//   73  156:pop             
					i = k;
	//   74  157:iload           4
	//   75  159:istore_3        
				}
			} while(true);
	//   76  160:goto            114
		}
		return new AnnotatedClass.Creators(_defaultConstructor, list, ((List) (javatype)));
	//   77  163:new             #194 <Class AnnotatedClass$Creators>
	//   78  166:dup             
	//   79  167:aload_0         
	//   80  168:getfield        #77  <Field AnnotatedConstructor _defaultConstructor>
	//   81  171:aload           5
	//   82  173:aload_1         
	//   83  174:invokespecial   #197 <Method void AnnotatedClass$Creators(AnnotatedConstructor, List, List)>
	//   84  177:areturn         
	}

	protected AnnotatedConstructor constructDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor, com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor1)
	{
		if(_intr == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #181 <Field AnnotationIntrospector _intr>
	//*   2    4:ifnonnull       29
			return new AnnotatedConstructor(_typeContext, ctor.getConstructor(), _emptyAnnotationMap(), NO_ANNOTATION_MAPS);
	//    3    7:new             #98  <Class AnnotatedConstructor>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #15  <Field TypeResolutionContext _typeContext>
	//    7   15:aload_1         
	//    8   16:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//    9   19:invokestatic    #201 <Method AnnotationMap _emptyAnnotationMap()>
	//   10   22:getstatic       #205 <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//   11   25:invokespecial   #208 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   12   28:areturn         
		TypeResolutionContext typeresolutioncontext = _typeContext;
	//   13   29:aload_0         
	//   14   30:getfield        #15  <Field TypeResolutionContext _typeContext>
	//   15   33:astore_3        
		Constructor constructor = ctor.getConstructor();
	//   16   34:aload_1         
	//   17   35:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   18   38:astore          4
		AnnotationMap annotationmap = collectAnnotations(ctor, ctor1);
	//   19   40:aload_0         
	//   20   41:aload_1         
	//   21   42:aload_2         
	//   22   43:invokespecial   #210 <Method AnnotationMap collectAnnotations(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor)>
	//   23   46:astore          5
		Annotation aannotation[][] = ctor.getConstructor().getParameterAnnotations();
	//   24   48:aload_1         
	//   25   49:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   26   52:invokevirtual   #214 <Method Annotation[][] Constructor.getParameterAnnotations()>
	//   27   55:astore          6
		if(ctor1 == null)
	//*  28   57:aload_2         
	//*  29   58:ifnonnull       69
			ctor = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) ((Annotation[][])null));
	//   30   61:aconst_null     
	//   31   62:checkcast       #216 <Class Annotation[][]>
	//   32   65:astore_1        
		else
	//*  33   66:goto            77
			ctor = ((com.fasterxml.jackson.databind.util.ClassUtil.Ctor) (ctor1.getConstructor().getParameterAnnotations()));
	//   34   69:aload_2         
	//   35   70:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   36   73:invokevirtual   #214 <Method Annotation[][] Constructor.getParameterAnnotations()>
	//   37   76:astore_1        
		return new AnnotatedConstructor(typeresolutioncontext, constructor, annotationmap, collectAnnotations(aannotation, ((Annotation [][]) (ctor))));
	//   38   77:new             #98  <Class AnnotatedConstructor>
	//   39   80:dup             
	//   40   81:aload_3         
	//   41   82:aload           4
	//   42   84:aload           5
	//   43   86:aload_0         
	//   44   87:aload           6
	//   45   89:aload_1         
	//   46   90:invokespecial   #218 <Method AnnotationMap[] collectAnnotations(Annotation[][], Annotation[][])>
	//   47   93:invokespecial   #208 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   48   96:areturn         
	}

	protected AnnotatedMethod constructFactoryCreator(Method method, Method method1)
	{
		int i = method.getParameterTypes().length;
	//    0    0:aload_1         
	//    1    1:invokevirtual   #222 <Method Class[] Method.getParameterTypes()>
	//    2    4:arraylength     
	//    3    5:istore_3        
		if(_intr == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #181 <Field AnnotationIntrospector _intr>
	//*   6   10:ifnonnull       33
			return new AnnotatedMethod(_typeContext, method, _emptyAnnotationMap(), _emptyAnnotationMaps(i));
	//    7   13:new             #128 <Class AnnotatedMethod>
	//    8   16:dup             
	//    9   17:aload_0         
	//   10   18:getfield        #15  <Field TypeResolutionContext _typeContext>
	//   11   21:aload_1         
	//   12   22:invokestatic    #201 <Method AnnotationMap _emptyAnnotationMap()>
	//   13   25:iload_3         
	//   14   26:invokestatic    #226 <Method AnnotationMap[] _emptyAnnotationMaps(int)>
	//   15   29:invokespecial   #229 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   16   32:areturn         
		if(i == 0)
	//*  17   33:iload_3         
	//*  18   34:ifne            59
			return new AnnotatedMethod(_typeContext, method, collectAnnotations(((AnnotatedElement) (method)), ((AnnotatedElement) (method1))), NO_ANNOTATION_MAPS);
	//   19   37:new             #128 <Class AnnotatedMethod>
	//   20   40:dup             
	//   21   41:aload_0         
	//   22   42:getfield        #15  <Field TypeResolutionContext _typeContext>
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:aload_1         
	//   26   48:aload_2         
	//   27   49:invokespecial   #231 <Method AnnotationMap collectAnnotations(AnnotatedElement, AnnotatedElement)>
	//   28   52:getstatic       #205 <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//   29   55:invokespecial   #229 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   30   58:areturn         
		TypeResolutionContext typeresolutioncontext = _typeContext;
	//   31   59:aload_0         
	//   32   60:getfield        #15  <Field TypeResolutionContext _typeContext>
	//   33   63:astore          4
		AnnotationMap annotationmap = collectAnnotations(((AnnotatedElement) (method)), ((AnnotatedElement) (method1)));
	//   34   65:aload_0         
	//   35   66:aload_1         
	//   36   67:aload_2         
	//   37   68:invokespecial   #231 <Method AnnotationMap collectAnnotations(AnnotatedElement, AnnotatedElement)>
	//   38   71:astore          5
		Annotation aannotation[][] = method.getParameterAnnotations();
	//   39   73:aload_1         
	//   40   74:invokevirtual   #232 <Method Annotation[][] Method.getParameterAnnotations()>
	//   41   77:astore          6
		if(method1 == null)
	//*  42   79:aload_2         
	//*  43   80:ifnonnull       91
			method1 = ((Method) ((Annotation[][])null));
	//   44   83:aconst_null     
	//   45   84:checkcast       #216 <Class Annotation[][]>
	//   46   87:astore_2        
		else
	//*  47   88:goto            96
			method1 = ((Method) (method1.getParameterAnnotations()));
	//   48   91:aload_2         
	//   49   92:invokevirtual   #232 <Method Annotation[][] Method.getParameterAnnotations()>
	//   50   95:astore_2        
		return new AnnotatedMethod(typeresolutioncontext, method, annotationmap, collectAnnotations(aannotation, ((Annotation [][]) (method1))));
	//   51   96:new             #128 <Class AnnotatedMethod>
	//   52   99:dup             
	//   53  100:aload           4
	//   54  102:aload_1         
	//   55  103:aload           5
	//   56  105:aload_0         
	//   57  106:aload           6
	//   58  108:aload_2         
	//   59  109:invokespecial   #218 <Method AnnotationMap[] collectAnnotations(Annotation[][], Annotation[][])>
	//   60  112:invokespecial   #229 <Method void AnnotatedMethod(TypeResolutionContext, Method, AnnotationMap, AnnotationMap[])>
	//   61  115:areturn         
	}

	protected AnnotatedConstructor constructNonDefaultConstructor(com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor, com.fasterxml.jackson.databind.util.ClassUtil.Ctor ctor1)
	{
		int i = ctor.getParamCount();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #48  <Method int com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getParamCount()>
	//    2    4:istore_3        
		if(_intr == null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #181 <Field AnnotationIntrospector _intr>
	//*   5    9:ifnonnull       35
			return new AnnotatedConstructor(_typeContext, ctor.getConstructor(), _emptyAnnotationMap(), _emptyAnnotationMaps(i));
	//    6   12:new             #98  <Class AnnotatedConstructor>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #15  <Field TypeResolutionContext _typeContext>
	//   10   20:aload_1         
	//   11   21:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   12   24:invokestatic    #201 <Method AnnotationMap _emptyAnnotationMap()>
	//   13   27:iload_3         
	//   14   28:invokestatic    #226 <Method AnnotationMap[] _emptyAnnotationMaps(int)>
	//   15   31:invokespecial   #208 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   16   34:areturn         
		if(i == 0)
	//*  17   35:iload_3         
	//*  18   36:ifne            64
			return new AnnotatedConstructor(_typeContext, ctor.getConstructor(), collectAnnotations(ctor, ctor1), NO_ANNOTATION_MAPS);
	//   19   39:new             #98  <Class AnnotatedConstructor>
	//   20   42:dup             
	//   21   43:aload_0         
	//   22   44:getfield        #15  <Field TypeResolutionContext _typeContext>
	//   23   47:aload_1         
	//   24   48:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//   25   51:aload_0         
	//   26   52:aload_1         
	//   27   53:aload_2         
	//   28   54:invokespecial   #210 <Method AnnotationMap collectAnnotations(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor)>
	//   29   57:getstatic       #205 <Field AnnotationMap[] NO_ANNOTATION_MAPS>
	//   30   60:invokespecial   #208 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//   31   63:areturn         
		Annotation aannotation[][] = ctor.getParameterAnnotations();
	//   32   64:aload_1         
	//   33   65:invokevirtual   #233 <Method Annotation[][] com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getParameterAnnotations()>
	//   34   68:astore          6
		int j = aannotation.length;
	//   35   70:aload           6
	//   36   72:arraylength     
	//   37   73:istore          4
		AnnotationMap aannotationmap[] = null;
	//   38   75:aconst_null     
	//   39   76:astore          5
		if(i != j)
	//*  40   78:iload_3         
	//*  41   79:iload           4
	//*  42   81:icmpeq          273
		{
			Object obj = ((Object) (ctor.getDeclaringClass()));
	//   43   84:aload_1         
	//   44   85:invokevirtual   #236 <Method Class com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getDeclaringClass()>
	//   45   88:astore          7
			if(((Class) (obj)).isEnum() && i == aannotation.length + 2)
	//*  46   90:aload           7
	//*  47   92:invokevirtual   #241 <Method boolean Class.isEnum()>
	//*  48   95:ifeq            152
	//*  49   98:iload_3         
	//*  50   99:aload           6
	//*  51  101:arraylength     
	//*  52  102:iconst_2        
	//*  53  103:iadd            
	//*  54  104:icmpne          152
			{
				aannotationmap = ((AnnotationMap []) (new Annotation[aannotation.length + 2][]));
	//   55  107:aload           6
	//   56  109:arraylength     
	//   57  110:iconst_2        
	//   58  111:iadd            
	//   59  112:anewarray       Annotation[][]
	//   60  115:astore          5
				System.arraycopy(((Object) (aannotation)), 0, ((Object) (aannotationmap)), 2, aannotation.length);
	//   61  117:aload           6
	//   62  119:iconst_0        
	//   63  120:aload           5
	//   64  122:iconst_2        
	//   65  123:aload           6
	//   66  125:arraylength     
	//   67  126:invokestatic    #249 <Method void System.arraycopy(Object, int, Object, int, int)>
				obj = ((Object) (collectAnnotations(((Annotation [][]) (aannotationmap)), (Annotation[][])null)));
	//   68  129:aload_0         
	//   69  130:aload           5
	//   70  132:aconst_null     
	//   71  133:checkcast       #216 <Class Annotation[][]>
	//   72  136:invokespecial   #218 <Method AnnotationMap[] collectAnnotations(Annotation[][], Annotation[][])>
	//   73  139:astore          7
				aannotation = ((Annotation [][]) (aannotationmap));
	//   74  141:aload           5
	//   75  143:astore          6
				aannotationmap = ((AnnotationMap []) (obj));
	//   76  145:aload           7
	//   77  147:astore          5
			} else
	//*  78  149:goto            221
			if(((Class) (obj)).isMemberClass() && i == aannotation.length + 1)
	//*  79  152:aload           7
	//*  80  154:invokevirtual   #252 <Method boolean Class.isMemberClass()>
	//*  81  157:ifeq            221
	//*  82  160:iload_3         
	//*  83  161:aload           6
	//*  84  163:arraylength     
	//*  85  164:iconst_1        
	//*  86  165:iadd            
	//*  87  166:icmpne          221
			{
				aannotationmap = ((AnnotationMap []) (new Annotation[aannotation.length + 1][]));
	//   88  169:aload           6
	//   89  171:arraylength     
	//   90  172:iconst_1        
	//   91  173:iadd            
	//   92  174:anewarray       Annotation[][]
	//   93  177:astore          5
				System.arraycopy(((Object) (aannotation)), 0, ((Object) (aannotationmap)), 1, aannotation.length);
	//   94  179:aload           6
	//   95  181:iconst_0        
	//   96  182:aload           5
	//   97  184:iconst_1        
	//   98  185:aload           6
	//   99  187:arraylength     
	//  100  188:invokestatic    #249 <Method void System.arraycopy(Object, int, Object, int, int)>
				aannotationmap[0] = NO_ANNOTATIONS;
	//  101  191:aload           5
	//  102  193:iconst_0        
	//  103  194:getstatic       #255 <Field Annotation[] NO_ANNOTATIONS>
	//  104  197:aastore         
				AnnotationMap aannotationmap1[] = collectAnnotations(((Annotation [][]) (aannotationmap)), (Annotation[][])null);
	//  105  198:aload_0         
	//  106  199:aload           5
	//  107  201:aconst_null     
	//  108  202:checkcast       #216 <Class Annotation[][]>
	//  109  205:invokespecial   #218 <Method AnnotationMap[] collectAnnotations(Annotation[][], Annotation[][])>
	//  110  208:astore          7
				aannotation = ((Annotation [][]) (aannotationmap));
	//  111  210:aload           5
	//  112  212:astore          6
				aannotationmap = aannotationmap1;
	//  113  214:aload           7
	//  114  216:astore          5
			}
	//* 115  218:goto            221
			if(aannotationmap == null)
	//* 116  221:aload           5
	//* 117  223:ifnull          229
	//* 118  226:goto            302
				throw new IllegalStateException(String.format("Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations", new Object[] {
					ctor.getDeclaringClass().getName(), Integer.valueOf(i), Integer.valueOf(aannotation.length)
				}));
	//  119  229:new             #257 <Class IllegalStateException>
	//  120  232:dup             
	//  121  233:ldc2            #259 <String "Internal error: constructor for %s has mismatch: %d parameters; %d sets of annotations">
	//  122  236:iconst_3        
	//  123  237:anewarray       Object[]
	//  124  240:dup             
	//  125  241:iconst_0        
	//  126  242:aload_1         
	//  127  243:invokevirtual   #236 <Method Class com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getDeclaringClass()>
	//  128  246:invokevirtual   #265 <Method String Class.getName()>
	//  129  249:aastore         
	//  130  250:dup             
	//  131  251:iconst_1        
	//  132  252:iload_3         
	//  133  253:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//  134  256:aastore         
	//  135  257:dup             
	//  136  258:iconst_2        
	//  137  259:aload           6
	//  138  261:arraylength     
	//  139  262:invokestatic    #271 <Method Integer Integer.valueOf(int)>
	//  140  265:aastore         
	//  141  266:invokestatic    #277 <Method String String.format(String, Object[])>
	//  142  269:invokespecial   #280 <Method void IllegalStateException(String)>
	//  143  272:athrow          
		} else
		{
			if(ctor1 == null)
	//* 144  273:aload_2         
	//* 145  274:ifnonnull       286
				aannotationmap = ((AnnotationMap []) ((Annotation[][])null));
	//  146  277:aconst_null     
	//  147  278:checkcast       #216 <Class Annotation[][]>
	//  148  281:astore          5
			else
	//* 149  283:goto            292
				aannotationmap = ((AnnotationMap []) (ctor1.getParameterAnnotations()));
	//  150  286:aload_2         
	//  151  287:invokevirtual   #233 <Method Annotation[][] com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getParameterAnnotations()>
	//  152  290:astore          5
			aannotationmap = collectAnnotations(aannotation, ((Annotation [][]) (aannotationmap)));
	//  153  292:aload_0         
	//  154  293:aload           6
	//  155  295:aload           5
	//  156  297:invokespecial   #218 <Method AnnotationMap[] collectAnnotations(Annotation[][], Annotation[][])>
	//  157  300:astore          5
		}
		return new AnnotatedConstructor(_typeContext, ctor.getConstructor(), collectAnnotations(ctor, ctor1), aannotationmap);
	//  158  302:new             #98  <Class AnnotatedConstructor>
	//  159  305:dup             
	//  160  306:aload_0         
	//  161  307:getfield        #15  <Field TypeResolutionContext _typeContext>
	//  162  310:aload_1         
	//  163  311:invokevirtual   #40  <Method Constructor com.fasterxml.jackson.databind.util.ClassUtil$Ctor.getConstructor()>
	//  164  314:aload_0         
	//  165  315:aload_1         
	//  166  316:aload_2         
	//  167  317:invokespecial   #210 <Method AnnotationMap collectAnnotations(com.fasterxml.jackson.databind.util.ClassUtil$Ctor, com.fasterxml.jackson.databind.util.ClassUtil$Ctor)>
	//  168  320:aload           5
	//  169  322:invokespecial   #208 <Method void AnnotatedConstructor(TypeResolutionContext, Constructor, AnnotationMap, AnnotationMap[])>
	//  170  325:areturn         
	}

	private AnnotatedConstructor _defaultConstructor;
	private final TypeResolutionContext _typeContext;
}
