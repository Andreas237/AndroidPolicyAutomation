// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife.internal;

import butterknife.*;
import com.google.devtools.build.android.desugar.runtime.ThrowableExtension;
import java.io.*;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.*;
import javax.annotation.processing.*;
import javax.lang.model.SourceVersion;
import javax.lang.model.element.*;
import javax.lang.model.type.*;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;
import javax.tools.JavaFileObject;

// Referenced classes of package butterknife.internal:
//			ViewInjector, ViewInjection, ViewBinding, CollectionBinding, 
//			ListenerClass, ListenerMethod, Parameter, ListenerBinding

public final class ButterKnifeProcessor extends AbstractProcessor
{

	public ButterKnifeProcessor()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #76  <Method void AbstractProcessor()>
	//    2    4:return          
	}

	private String doubleErasure(TypeMirror typemirror)
	{
		String s = typeUtils.erasure(typemirror).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #80  <Field Types typeUtils>
	//    2    4:aload_1         
	//    3    5:invokeinterface #86  <Method TypeMirror Types.erasure(TypeMirror)>
	//    4   10:invokeinterface #91  <Method String TypeMirror.toString()>
	//    5   15:astore_3        
		int i = s.indexOf('<');
	//    6   16:aload_3         
	//    7   17:bipush          60
	//    8   19:invokevirtual   #97  <Method int String.indexOf(int)>
	//    9   22:istore_2        
		typemirror = ((TypeMirror) (s));
	//   10   23:aload_3         
	//   11   24:astore_1        
		if(i != -1)
	//*  12   25:iload_2         
	//*  13   26:iconst_m1       
	//*  14   27:icmpeq          37
			typemirror = ((TypeMirror) (s.substring(0, i)));
	//   15   30:aload_3         
	//   16   31:iconst_0        
	//   17   32:iload_2         
	//   18   33:invokevirtual   #101 <Method String String.substring(int, int)>
	//   19   36:astore_1        
		return ((String) (typemirror));
	//   20   37:aload_1         
	//   21   38:areturn         
	}

	private transient void error(Element element, String s, Object aobj[])
	{
		String s1 = s;
	//    0    0:aload_2         
	//    1    1:astore          4
		if(aobj.length > 0)
	//*   2    3:aload_3         
	//*   3    4:arraylength     
	//*   4    5:ifle            15
			s1 = String.format(s, aobj);
	//    5    8:aload_2         
	//    6    9:aload_3         
	//    7   10:invokestatic    #107 <Method String String.format(String, Object[])>
	//    8   13:astore          4
		processingEnv.getMessager().printMessage(javax.tools.Diagnostic.Kind.ERROR, ((CharSequence) (s1)), element);
	//    9   15:aload_0         
	//   10   16:getfield        #111 <Field ProcessingEnvironment processingEnv>
	//   11   19:invokeinterface #117 <Method Messager ProcessingEnvironment.getMessager()>
	//   12   24:getstatic       #123 <Field javax.tools.Diagnostic$Kind javax.tools.Diagnostic$Kind.ERROR>
	//   13   27:aload           4
	//   14   29:aload_1         
	//   15   30:invokeinterface #129 <Method void Messager.printMessage(javax.tools.Diagnostic$Kind, CharSequence, Element)>
	//   16   35:return          
	}

	private void findAndParseListener(RoundEnvironment roundenvironment, Class class1, Map map, Set set)
	{
		for(roundenvironment = ((RoundEnvironment) (roundenvironment.getElementsAnnotatedWith(class1).iterator())); ((Iterator) (roundenvironment)).hasNext();)
	//*   0    0:aload_1         
	//*   1    1:aload_2         
	//*   2    2:invokeinterface #139 <Method Set RoundEnvironment.getElementsAnnotatedWith(Class)>
	//*   3    7:invokeinterface #145 <Method Iterator Set.iterator()>
	//*   4   12:astore_1        
	//*   5   13:aload_1         
	//*   6   14:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//*   7   19:ifeq            101
		{
			Element element = (Element)((Iterator) (roundenvironment)).next();
	//    8   22:aload_1         
	//    9   23:invokeinterface #155 <Method Object Iterator.next()>
	//   10   28:checkcast       #157 <Class Element>
	//   11   31:astore          5
			try
			{
				parseListenerAnnotation(class1, element, map, set);
	//   12   33:aload_0         
	//   13   34:aload_2         
	//   14   35:aload           5
	//   15   37:aload_3         
	//   16   38:aload           4
	//   17   40:invokespecial   #161 <Method void parseListenerAnnotation(Class, Element, Map, Set)>
			}
	//*  18   43:goto            13
			catch(Exception exception)
	//*  19   46:astore          6
			{
				StringWriter stringwriter = new StringWriter();
	//   20   48:new             #163 <Class StringWriter>
	//   21   51:dup             
	//   22   52:invokespecial   #164 <Method void StringWriter()>
	//   23   55:astore          7
				ThrowableExtension.printStackTrace(((Throwable) (exception)), new PrintWriter(((Writer) (stringwriter))));
	//   24   57:aload           6
	//   25   59:new             #166 <Class PrintWriter>
	//   26   62:dup             
	//   27   63:aload           7
	//   28   65:invokespecial   #169 <Method void PrintWriter(Writer)>
	//   29   68:invokestatic    #175 <Method void ThrowableExtension.printStackTrace(Throwable, PrintWriter)>
				error(element, "Unable to generate view injector for @%s.\n\n%s", new Object[] {
					class1.getSimpleName(), stringwriter.toString()
				});
	//   30   71:aload_0         
	//   31   72:aload           5
	//   32   74:ldc1            #177 <String "Unable to generate view injector for @%s.\n\n%s">
	//   33   76:iconst_2        
	//   34   77:anewarray       Object[]
	//   35   80:dup             
	//   36   81:iconst_0        
	//   37   82:aload_2         
	//   38   83:invokevirtual   #182 <Method String Class.getSimpleName()>
	//   39   86:aastore         
	//   40   87:dup             
	//   41   88:iconst_1        
	//   42   89:aload           7
	//   43   91:invokevirtual   #183 <Method String StringWriter.toString()>
	//   44   94:aastore         
	//   45   95:invokespecial   #185 <Method void error(Element, String, Object[])>
			}
		}

	//*  46   98:goto            13
	//   47  101:return          
	}

	private Map findAndParseTargets(RoundEnvironment roundenvironment)
	{
		LinkedHashMap linkedhashmap = new LinkedHashMap();
	//    0    0:new             #191 <Class LinkedHashMap>
	//    1    3:dup             
	//    2    4:invokespecial   #192 <Method void LinkedHashMap()>
	//    3    7:astore_2        
		LinkedHashSet linkedhashset = new LinkedHashSet();
	//    4    8:new             #194 <Class LinkedHashSet>
	//    5   11:dup             
	//    6   12:invokespecial   #195 <Method void LinkedHashSet()>
	//    7   15:astore_3        
		for(Iterator iterator = roundenvironment.getElementsAnnotatedWith(butterknife/InjectView).iterator(); iterator.hasNext();)
	//*   8   16:aload_1         
	//*   9   17:ldc1            #197 <Class InjectView>
	//*  10   19:invokeinterface #139 <Method Set RoundEnvironment.getElementsAnnotatedWith(Class)>
	//*  11   24:invokeinterface #145 <Method Iterator Set.iterator()>
	//*  12   29:astore          4
	//*  13   31:aload           4
	//*  14   33:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//*  15   38:ifeq            109
		{
			Element element = (Element)iterator.next();
	//   16   41:aload           4
	//   17   43:invokeinterface #155 <Method Object Iterator.next()>
	//   18   48:checkcast       #157 <Class Element>
	//   19   51:astore          5
			try
			{
				parseInjectView(element, ((Map) (linkedhashmap)), ((Set) (linkedhashset)));
	//   20   53:aload_0         
	//   21   54:aload           5
	//   22   56:aload_2         
	//   23   57:aload_3         
	//   24   58:invokespecial   #201 <Method void parseInjectView(Element, Map, Set)>
			}
	//*  25   61:goto            31
			catch(Exception exception)
	//*  26   64:astore          6
			{
				StringWriter stringwriter = new StringWriter();
	//   27   66:new             #163 <Class StringWriter>
	//   28   69:dup             
	//   29   70:invokespecial   #164 <Method void StringWriter()>
	//   30   73:astore          7
				ThrowableExtension.printStackTrace(((Throwable) (exception)), new PrintWriter(((Writer) (stringwriter))));
	//   31   75:aload           6
	//   32   77:new             #166 <Class PrintWriter>
	//   33   80:dup             
	//   34   81:aload           7
	//   35   83:invokespecial   #169 <Method void PrintWriter(Writer)>
	//   36   86:invokestatic    #175 <Method void ThrowableExtension.printStackTrace(Throwable, PrintWriter)>
				error(element, "Unable to generate view injector for @InjectView.\n\n%s", new Object[] {
					stringwriter
				});
	//   37   89:aload_0         
	//   38   90:aload           5
	//   39   92:ldc1            #203 <String "Unable to generate view injector for @InjectView.\n\n%s">
	//   40   94:iconst_1        
	//   41   95:anewarray       Object[]
	//   42   98:dup             
	//   43   99:iconst_0        
	//   44  100:aload           7
	//   45  102:aastore         
	//   46  103:invokespecial   #185 <Method void error(Element, String, Object[])>
			}
		}

	//*  47  106:goto            31
		for(Iterator iterator1 = roundenvironment.getElementsAnnotatedWith(butterknife/InjectViews).iterator(); iterator1.hasNext();)
	//*  48  109:aload_1         
	//*  49  110:ldc1            #205 <Class InjectViews>
	//*  50  112:invokeinterface #139 <Method Set RoundEnvironment.getElementsAnnotatedWith(Class)>
	//*  51  117:invokeinterface #145 <Method Iterator Set.iterator()>
	//*  52  122:astore          4
	//*  53  124:aload           4
	//*  54  126:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//*  55  131:ifeq            202
		{
			Element element1 = (Element)iterator1.next();
	//   56  134:aload           4
	//   57  136:invokeinterface #155 <Method Object Iterator.next()>
	//   58  141:checkcast       #157 <Class Element>
	//   59  144:astore          5
			try
			{
				parseInjectViews(element1, ((Map) (linkedhashmap)), ((Set) (linkedhashset)));
	//   60  146:aload_0         
	//   61  147:aload           5
	//   62  149:aload_2         
	//   63  150:aload_3         
	//   64  151:invokespecial   #208 <Method void parseInjectViews(Element, Map, Set)>
			}
	//*  65  154:goto            124
			catch(Exception exception1)
	//*  66  157:astore          6
			{
				StringWriter stringwriter1 = new StringWriter();
	//   67  159:new             #163 <Class StringWriter>
	//   68  162:dup             
	//   69  163:invokespecial   #164 <Method void StringWriter()>
	//   70  166:astore          7
				ThrowableExtension.printStackTrace(((Throwable) (exception1)), new PrintWriter(((Writer) (stringwriter1))));
	//   71  168:aload           6
	//   72  170:new             #166 <Class PrintWriter>
	//   73  173:dup             
	//   74  174:aload           7
	//   75  176:invokespecial   #169 <Method void PrintWriter(Writer)>
	//   76  179:invokestatic    #175 <Method void ThrowableExtension.printStackTrace(Throwable, PrintWriter)>
				error(element1, "Unable to generate view injector for @InjectViews.\n\n%s", new Object[] {
					stringwriter1
				});
	//   77  182:aload_0         
	//   78  183:aload           5
	//   79  185:ldc1            #210 <String "Unable to generate view injector for @InjectViews.\n\n%s">
	//   80  187:iconst_1        
	//   81  188:anewarray       Object[]
	//   82  191:dup             
	//   83  192:iconst_0        
	//   84  193:aload           7
	//   85  195:aastore         
	//   86  196:invokespecial   #185 <Method void error(Element, String, Object[])>
			}
		}

	//*  87  199:goto            124
		for(Iterator iterator2 = LISTENERS.iterator(); iterator2.hasNext(); findAndParseListener(roundenvironment, (Class)iterator2.next(), ((Map) (linkedhashmap)), ((Set) (linkedhashset))));
	//   88  202:getstatic       #72  <Field List LISTENERS>
	//   89  205:invokeinterface #211 <Method Iterator List.iterator()>
	//   90  210:astore          4
	//   91  212:aload           4
	//   92  214:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//   93  219:ifeq            242
	//   94  222:aload_0         
	//   95  223:aload_1         
	//   96  224:aload           4
	//   97  226:invokeinterface #155 <Method Object Iterator.next()>
	//   98  231:checkcast       #36  <Class Class>
	//   99  234:aload_2         
	//  100  235:aload_3         
	//  101  236:invokespecial   #213 <Method void findAndParseListener(RoundEnvironment, Class, Map, Set)>
	//* 102  239:goto            212
		roundenvironment = ((RoundEnvironment) (((Map) (linkedhashmap)).entrySet().iterator()));
	//  103  242:aload_2         
	//  104  243:invokeinterface #219 <Method Set Map.entrySet()>
	//  105  248:invokeinterface #145 <Method Iterator Set.iterator()>
	//  106  253:astore_1        
		do
		{
			if(!((Iterator) (roundenvironment)).hasNext())
				break;
	//  107  254:aload_1         
	//  108  255:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//  109  260:ifeq            346
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (roundenvironment)).next()));
	//  110  263:aload_1         
	//  111  264:invokeinterface #155 <Method Object Iterator.next()>
	//  112  269:checkcast       #221 <Class java.util.Map$Entry>
	//  113  272:astore          5
			String s = findParentFqcn((TypeElement)((java.util.Map.Entry) (obj)).getKey(), ((Set) (linkedhashset)));
	//  114  274:aload_0         
	//  115  275:aload           5
	//  116  277:invokeinterface #224 <Method Object java.util.Map$Entry.getKey()>
	//  117  282:checkcast       #226 <Class TypeElement>
	//  118  285:aload_3         
	//  119  286:invokespecial   #230 <Method String findParentFqcn(TypeElement, Set)>
	//  120  289:astore          4
			if(s != null)
	//* 121  291:aload           4
	//* 122  293:ifnull          254
			{
				obj = ((Object) ((ViewInjector)((java.util.Map.Entry) (obj)).getValue()));
	//  123  296:aload           5
	//  124  298:invokeinterface #233 <Method Object java.util.Map$Entry.getValue()>
	//  125  303:checkcast       #235 <Class ViewInjector>
	//  126  306:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//  127  308:new             #237 <Class StringBuilder>
	//  128  311:dup             
	//  129  312:invokespecial   #238 <Method void StringBuilder()>
	//  130  315:astore          6
				stringbuilder.append(s);
	//  131  317:aload           6
	//  132  319:aload           4
	//  133  321:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  134  324:pop             
				stringbuilder.append("$$ViewInjector");
	//  135  325:aload           6
	//  136  327:ldc1            #21  <String "$$ViewInjector">
	//  137  329:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  138  332:pop             
				((ViewInjector) (obj)).setParentInjector(stringbuilder.toString());
	//  139  333:aload           5
	//  140  335:aload           6
	//  141  337:invokevirtual   #243 <Method String StringBuilder.toString()>
	//  142  340:invokevirtual   #247 <Method void ViewInjector.setParentInjector(String)>
			}
		} while(true);
	//  143  343:goto            254
		return ((Map) (linkedhashmap));
	//  144  346:aload_2         
	//  145  347:areturn         
	}

	private static Integer findDuplicate(int ai[])
	{
		LinkedHashSet linkedhashset = new LinkedHashSet();
	//    0    0:new             #194 <Class LinkedHashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #195 <Method void LinkedHashSet()>
	//    3    7:astore          4
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_1        
		for(int j = ai.length; i < j; i++)
	//*   6   11:aload_0         
	//*   7   12:arraylength     
	//*   8   13:istore_2        
	//*   9   14:iload_1         
	//*  10   15:iload_2         
	//*  11   16:icmpge          49
		{
			int k = ai[i];
	//   12   19:aload_0         
	//   13   20:iload_1         
	//   14   21:iaload          
	//   15   22:istore_3        
			if(!((Set) (linkedhashset)).add(((Object) (Integer.valueOf(k)))))
	//*  16   23:aload           4
	//*  17   25:iload_3         
	//*  18   26:invokestatic    #256 <Method Integer Integer.valueOf(int)>
	//*  19   29:invokeinterface #260 <Method boolean Set.add(Object)>
	//*  20   34:ifne            42
				return Integer.valueOf(k);
	//   21   37:iload_3         
	//   22   38:invokestatic    #256 <Method Integer Integer.valueOf(int)>
	//   23   41:areturn         
		}

	//   24   42:iload_1         
	//   25   43:iconst_1        
	//   26   44:iadd            
	//   27   45:istore_1        
	//*  28   46:goto            14
		return null;
	//   29   49:aconst_null     
	//   30   50:areturn         
	}

	private String findParentFqcn(TypeElement typeelement, Set set)
	{
		TypeElement typeelement1;
		do
		{
			typeelement = ((TypeElement) (typeelement.getSuperclass()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #264 <Method TypeMirror TypeElement.getSuperclass()>
	//    2    6:astore_1        
			if(((TypeMirror) (typeelement)).getKind() == TypeKind.NONE)
	//*   3    7:aload_1         
	//*   4    8:invokeinterface #268 <Method TypeKind TypeMirror.getKind()>
	//*   5   13:getstatic       #274 <Field TypeKind TypeKind.NONE>
	//*   6   16:if_acmpne       21
				return null;
	//    7   19:aconst_null     
	//    8   20:areturn         
			typeelement1 = (TypeElement)((DeclaredType)typeelement).asElement();
	//    9   21:aload_1         
	//   10   22:checkcast       #276 <Class DeclaredType>
	//   11   25:invokeinterface #280 <Method Element DeclaredType.asElement()>
	//   12   30:checkcast       #226 <Class TypeElement>
	//   13   33:astore_3        
			typeelement = typeelement1;
	//   14   34:aload_3         
	//   15   35:astore_1        
		} while(!set.contains(((Object) (((Object) (typeelement1)).toString()))));
	//   16   36:aload_2         
	//   17   37:aload_3         
	//   18   38:invokevirtual   #281 <Method String Object.toString()>
	//   19   41:invokeinterface #284 <Method boolean Set.contains(Object)>
	//   20   46:ifeq            0
		typeelement = ((TypeElement) (getPackageName(typeelement1)));
	//   21   49:aload_0         
	//   22   50:aload_3         
	//   23   51:invokespecial   #288 <Method String getPackageName(TypeElement)>
	//   24   54:astore_1        
		set = ((Set) (new StringBuilder()));
	//   25   55:new             #237 <Class StringBuilder>
	//   26   58:dup             
	//   27   59:invokespecial   #238 <Method void StringBuilder()>
	//   28   62:astore_2        
		((StringBuilder) (set)).append(((String) (typeelement)));
	//   29   63:aload_2         
	//   30   64:aload_1         
	//   31   65:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   32   68:pop             
		((StringBuilder) (set)).append(".");
	//   33   69:aload_2         
	//   34   70:ldc2            #290 <String ".">
	//   35   73:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   36   76:pop             
		((StringBuilder) (set)).append(getClassName(typeelement1, ((String) (typeelement))));
	//   37   77:aload_2         
	//   38   78:aload_3         
	//   39   79:aload_1         
	//   40   80:invokestatic    #294 <Method String getClassName(TypeElement, String)>
	//   41   83:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   42   86:pop             
		return ((StringBuilder) (set)).toString();
	//   43   87:aload_2         
	//   44   88:invokevirtual   #243 <Method String StringBuilder.toString()>
	//   45   91:areturn         
	}

	private static String getClassName(TypeElement typeelement, String s)
	{
		int i = s.length();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #299 <Method int String.length()>
	//    2    4:istore_2        
		return ((Object) (typeelement.getQualifiedName())).toString().substring(i + 1).replace('.', '$');
	//    3    5:aload_0         
	//    4    6:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//    5   11:invokevirtual   #281 <Method String Object.toString()>
	//    6   14:iload_2         
	//    7   15:iconst_1        
	//    8   16:iadd            
	//    9   17:invokevirtual   #306 <Method String String.substring(int)>
	//   10   20:bipush          46
	//   11   22:bipush          36
	//   12   24:invokevirtual   #310 <Method String String.replace(char, char)>
	//   13   27:areturn         
	}

	private ViewInjector getOrCreateTargetClass(Map map, TypeElement typeelement)
	{
		ViewInjector viewinjector = (ViewInjector)map.get(((Object) (typeelement)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokeinterface #316 <Method Object Map.get(Object)>
	//    3    7:checkcast       #235 <Class ViewInjector>
	//    4   10:astore          4
		Object obj = ((Object) (viewinjector));
	//    5   12:aload           4
	//    6   14:astore_3        
		if(viewinjector == null)
	//*   7   15:aload           4
	//*   8   17:ifnonnull       91
		{
			obj = ((Object) (((Object) (typeelement.getQualifiedName())).toString()));
	//    9   20:aload_2         
	//   10   21:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//   11   26:invokevirtual   #281 <Method String Object.toString()>
	//   12   29:astore_3        
			String s = getPackageName(typeelement);
	//   13   30:aload_0         
	//   14   31:aload_2         
	//   15   32:invokespecial   #288 <Method String getPackageName(TypeElement)>
	//   16   35:astore          4
			StringBuilder stringbuilder = new StringBuilder();
	//   17   37:new             #237 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:invokespecial   #238 <Method void StringBuilder()>
	//   20   44:astore          5
			stringbuilder.append(getClassName(typeelement, s));
	//   21   46:aload           5
	//   22   48:aload_2         
	//   23   49:aload           4
	//   24   51:invokestatic    #294 <Method String getClassName(TypeElement, String)>
	//   25   54:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   26   57:pop             
			stringbuilder.append("$$ViewInjector");
	//   27   58:aload           5
	//   28   60:ldc1            #21  <String "$$ViewInjector">
	//   29   62:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//   30   65:pop             
			obj = ((Object) (new ViewInjector(s, stringbuilder.toString(), ((String) (obj)))));
	//   31   66:new             #235 <Class ViewInjector>
	//   32   69:dup             
	//   33   70:aload           4
	//   34   72:aload           5
	//   35   74:invokevirtual   #243 <Method String StringBuilder.toString()>
	//   36   77:aload_3         
	//   37   78:invokespecial   #319 <Method void ViewInjector(String, String, String)>
	//   38   81:astore_3        
			map.put(((Object) (typeelement)), obj);
	//   39   82:aload_1         
	//   40   83:aload_2         
	//   41   84:aload_3         
	//   42   85:invokeinterface #323 <Method Object Map.put(Object, Object)>
	//   43   90:pop             
		}
		return ((ViewInjector) (obj));
	//   44   91:aload_3         
	//   45   92:areturn         
	}

	private String getPackageName(TypeElement typeelement)
	{
		return ((Object) (elementUtils.getPackageOf(((Element) (typeelement))).getQualifiedName())).toString();
	//    0    0:aload_0         
	//    1    1:getfield        #326 <Field Elements elementUtils>
	//    2    4:aload_1         
	//    3    5:invokeinterface #332 <Method PackageElement Elements.getPackageOf(Element)>
	//    4   10:invokeinterface #335 <Method javax.lang.model.element.Name PackageElement.getQualifiedName()>
	//    5   15:invokevirtual   #281 <Method String Object.toString()>
	//    6   18:areturn         
	}

	private boolean isBindingInWrongPackage(Class class1, Element element)
	{
		String s = ((Object) (((TypeElement)element.getEnclosingElement()).getQualifiedName())).toString();
	//    0    0:aload_2         
	//    1    1:invokeinterface #340 <Method Element Element.getEnclosingElement()>
	//    2    6:checkcast       #226 <Class TypeElement>
	//    3    9:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//    4   14:invokevirtual   #281 <Method String Object.toString()>
	//    5   17:astore_3        
		if(s.startsWith("android."))
	//*   6   18:aload_3         
	//*   7   19:ldc1            #11  <String "android.">
	//*   8   21:invokevirtual   #344 <Method boolean String.startsWith(String)>
	//*   9   24:ifeq            52
		{
			error(element, "@%s-annotated class incorrectly in Android framework package. (%s)", new Object[] {
				class1.getSimpleName(), s
			});
	//   10   27:aload_0         
	//   11   28:aload_2         
	//   12   29:ldc2            #346 <String "@%s-annotated class incorrectly in Android framework package. (%s)">
	//   13   32:iconst_2        
	//   14   33:anewarray       Object[]
	//   15   36:dup             
	//   16   37:iconst_0        
	//   17   38:aload_1         
	//   18   39:invokevirtual   #182 <Method String Class.getSimpleName()>
	//   19   42:aastore         
	//   20   43:dup             
	//   21   44:iconst_1        
	//   22   45:aload_3         
	//   23   46:aastore         
	//   24   47:invokespecial   #185 <Method void error(Element, String, Object[])>
			return true;
	//   25   50:iconst_1        
	//   26   51:ireturn         
		}
		if(s.startsWith("java."))
	//*  27   52:aload_3         
	//*  28   53:ldc1            #14  <String "java.">
	//*  29   55:invokevirtual   #344 <Method boolean String.startsWith(String)>
	//*  30   58:ifeq            86
		{
			error(element, "@%s-annotated class incorrectly in Java framework package. (%s)", new Object[] {
				class1.getSimpleName(), s
			});
	//   31   61:aload_0         
	//   32   62:aload_2         
	//   33   63:ldc2            #348 <String "@%s-annotated class incorrectly in Java framework package. (%s)">
	//   34   66:iconst_2        
	//   35   67:anewarray       Object[]
	//   36   70:dup             
	//   37   71:iconst_0        
	//   38   72:aload_1         
	//   39   73:invokevirtual   #182 <Method String Class.getSimpleName()>
	//   40   76:aastore         
	//   41   77:dup             
	//   42   78:iconst_1        
	//   43   79:aload_3         
	//   44   80:aastore         
	//   45   81:invokespecial   #185 <Method void error(Element, String, Object[])>
			return true;
	//   46   84:iconst_1        
	//   47   85:ireturn         
		} else
		{
			return false;
	//   48   86:iconst_0        
	//   49   87:ireturn         
		}
	}

	private boolean isSubtypeOfType(TypeMirror typemirror, String s)
	{
		if(s.equals(((Object) (typemirror.toString()))))
	//*   0    0:aload_2         
	//*   1    1:aload_1         
	//*   2    2:invokeinterface #91  <Method String TypeMirror.toString()>
	//*   3    7:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*   4   10:ifeq            15
			return true;
	//    5   13:iconst_1        
	//    6   14:ireturn         
		if(!(typemirror instanceof DeclaredType))
	//*   7   15:aload_1         
	//*   8   16:instanceof      #276 <Class DeclaredType>
	//*   9   19:ifne            24
			return false;
	//   10   22:iconst_0        
	//   11   23:ireturn         
		typemirror = ((TypeMirror) ((DeclaredType)typemirror));
	//   12   24:aload_1         
	//   13   25:checkcast       #276 <Class DeclaredType>
	//   14   28:astore_1        
		List list = ((DeclaredType) (typemirror)).getTypeArguments();
	//   15   29:aload_1         
	//   16   30:invokeinterface #358 <Method List DeclaredType.getTypeArguments()>
	//   17   35:astore          4
		if(list.size() > 0)
	//*  18   37:aload           4
	//*  19   39:invokeinterface #361 <Method int List.size()>
	//*  20   44:ifle            135
		{
			StringBuilder stringbuilder = new StringBuilder(((Object) (((DeclaredType) (typemirror)).asElement())).toString());
	//   21   47:new             #237 <Class StringBuilder>
	//   22   50:dup             
	//   23   51:aload_1         
	//   24   52:invokeinterface #280 <Method Element DeclaredType.asElement()>
	//   25   57:invokevirtual   #281 <Method String Object.toString()>
	//   26   60:invokespecial   #363 <Method void StringBuilder(String)>
	//   27   63:astore          5
			stringbuilder.append('<');
	//   28   65:aload           5
	//   29   67:bipush          60
	//   30   69:invokevirtual   #366 <Method StringBuilder StringBuilder.append(char)>
	//   31   72:pop             
			for(int i = 0; i < list.size(); i++)
	//*  32   73:iconst_0        
	//*  33   74:istore_3        
	//*  34   75:iload_3         
	//*  35   76:aload           4
	//*  36   78:invokeinterface #361 <Method int List.size()>
	//*  37   83:icmpge          113
			{
				if(i > 0)
	//*  38   86:iload_3         
	//*  39   87:ifle            98
					stringbuilder.append(',');
	//   40   90:aload           5
	//   41   92:bipush          44
	//   42   94:invokevirtual   #366 <Method StringBuilder StringBuilder.append(char)>
	//   43   97:pop             
				stringbuilder.append('?');
	//   44   98:aload           5
	//   45  100:bipush          63
	//   46  102:invokevirtual   #366 <Method StringBuilder StringBuilder.append(char)>
	//   47  105:pop             
			}

	//   48  106:iload_3         
	//   49  107:iconst_1        
	//   50  108:iadd            
	//   51  109:istore_3        
	//*  52  110:goto            75
			stringbuilder.append('>');
	//   53  113:aload           5
	//   54  115:bipush          62
	//   55  117:invokevirtual   #366 <Method StringBuilder StringBuilder.append(char)>
	//   56  120:pop             
			if(stringbuilder.toString().equals(((Object) (s))))
	//*  57  121:aload           5
	//*  58  123:invokevirtual   #243 <Method String StringBuilder.toString()>
	//*  59  126:aload_2         
	//*  60  127:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*  61  130:ifeq            135
				return true;
	//   62  133:iconst_1        
	//   63  134:ireturn         
		}
		typemirror = ((TypeMirror) (((DeclaredType) (typemirror)).asElement()));
	//   64  135:aload_1         
	//   65  136:invokeinterface #280 <Method Element DeclaredType.asElement()>
	//   66  141:astore_1        
		if(!(typemirror instanceof TypeElement))
	//*  67  142:aload_1         
	//*  68  143:instanceof      #226 <Class TypeElement>
	//*  69  146:ifne            151
			return false;
	//   70  149:iconst_0        
	//   71  150:ireturn         
		typemirror = ((TypeMirror) ((TypeElement)typemirror));
	//   72  151:aload_1         
	//   73  152:checkcast       #226 <Class TypeElement>
	//   74  155:astore_1        
		if(isSubtypeOfType(((TypeElement) (typemirror)).getSuperclass(), s))
	//*  75  156:aload_0         
	//*  76  157:aload_1         
	//*  77  158:invokeinterface #264 <Method TypeMirror TypeElement.getSuperclass()>
	//*  78  163:aload_2         
	//*  79  164:invokespecial   #368 <Method boolean isSubtypeOfType(TypeMirror, String)>
	//*  80  167:ifeq            172
			return true;
	//   81  170:iconst_1        
	//   82  171:ireturn         
		for(typemirror = ((TypeMirror) (((TypeElement) (typemirror)).getInterfaces().iterator())); ((Iterator) (typemirror)).hasNext();)
	//*  83  172:aload_1         
	//*  84  173:invokeinterface #371 <Method List TypeElement.getInterfaces()>
	//*  85  178:invokeinterface #211 <Method Iterator List.iterator()>
	//*  86  183:astore_1        
	//*  87  184:aload_1         
	//*  88  185:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//*  89  190:ifeq            212
			if(isSubtypeOfType((TypeMirror)((Iterator) (typemirror)).next(), s))
	//*  90  193:aload_0         
	//*  91  194:aload_1         
	//*  92  195:invokeinterface #155 <Method Object Iterator.next()>
	//*  93  200:checkcast       #88  <Class TypeMirror>
	//*  94  203:aload_2         
	//*  95  204:invokespecial   #368 <Method boolean isSubtypeOfType(TypeMirror, String)>
	//*  96  207:ifeq            184
				return true;
	//   97  210:iconst_1        
	//   98  211:ireturn         

		return false;
	//   99  212:iconst_0        
	//  100  213:ireturn         
	}

	private boolean isValidForGeneratedCode(Class class1, String s, Element element)
	{
		TypeElement typeelement = (TypeElement)element.getEnclosingElement();
	//    0    0:aload_3         
	//    1    1:invokeinterface #340 <Method Element Element.getEnclosingElement()>
	//    2    6:checkcast       #226 <Class TypeElement>
	//    3    9:astore          5
		Set set = element.getModifiers();
	//    4   11:aload_3         
	//    5   12:invokeinterface #376 <Method Set Element.getModifiers()>
	//    6   17:astore          6
		boolean flag;
		if(!set.contains(((Object) (Modifier.PRIVATE))) && !set.contains(((Object) (Modifier.STATIC))))
	//*   7   19:aload           6
	//*   8   21:getstatic       #382 <Field Modifier Modifier.PRIVATE>
	//*   9   24:invokeinterface #284 <Method boolean Set.contains(Object)>
	//*  10   29:ifne            54
	//*  11   32:aload           6
	//*  12   34:getstatic       #385 <Field Modifier Modifier.STATIC>
	//*  13   37:invokeinterface #284 <Method boolean Set.contains(Object)>
	//*  14   42:ifeq            48
	//*  15   45:goto            54
		{
			flag = false;
	//   16   48:iconst_0        
	//   17   49:istore          4
		} else
	//*  18   51:goto            99
		{
			error(element, "@%s %s must not be private or static. (%s.%s)", new Object[] {
				class1.getSimpleName(), s, typeelement.getQualifiedName(), element.getSimpleName()
			});
	//   19   54:aload_0         
	//   20   55:aload_3         
	//   21   56:ldc2            #387 <String "@%s %s must not be private or static. (%s.%s)">
	//   22   59:iconst_4        
	//   23   60:anewarray       Object[]
	//   24   63:dup             
	//   25   64:iconst_0        
	//   26   65:aload_1         
	//   27   66:invokevirtual   #182 <Method String Class.getSimpleName()>
	//   28   69:aastore         
	//   29   70:dup             
	//   30   71:iconst_1        
	//   31   72:aload_2         
	//   32   73:aastore         
	//   33   74:dup             
	//   34   75:iconst_2        
	//   35   76:aload           5
	//   36   78:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//   37   83:aastore         
	//   38   84:dup             
	//   39   85:iconst_3        
	//   40   86:aload_3         
	//   41   87:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//   42   92:aastore         
	//   43   93:invokespecial   #185 <Method void error(Element, String, Object[])>
			flag = true;
	//   44   96:iconst_1        
	//   45   97:istore          4
		}
		if(typeelement.getKind() != ElementKind.CLASS)
	//*  46   99:aload           5
	//*  47  101:invokeinterface #392 <Method ElementKind TypeElement.getKind()>
	//*  48  106:getstatic       #398 <Field ElementKind ElementKind.CLASS>
	//*  49  109:if_acmpeq       158
		{
			error(((Element) (typeelement)), "@%s %s may only be contained in classes. (%s.%s)", new Object[] {
				class1.getSimpleName(), s, typeelement.getQualifiedName(), element.getSimpleName()
			});
	//   50  112:aload_0         
	//   51  113:aload           5
	//   52  115:ldc2            #400 <String "@%s %s may only be contained in classes. (%s.%s)">
	//   53  118:iconst_4        
	//   54  119:anewarray       Object[]
	//   55  122:dup             
	//   56  123:iconst_0        
	//   57  124:aload_1         
	//   58  125:invokevirtual   #182 <Method String Class.getSimpleName()>
	//   59  128:aastore         
	//   60  129:dup             
	//   61  130:iconst_1        
	//   62  131:aload_2         
	//   63  132:aastore         
	//   64  133:dup             
	//   65  134:iconst_2        
	//   66  135:aload           5
	//   67  137:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//   68  142:aastore         
	//   69  143:dup             
	//   70  144:iconst_3        
	//   71  145:aload_3         
	//   72  146:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//   73  151:aastore         
	//   74  152:invokespecial   #185 <Method void error(Element, String, Object[])>
			flag = true;
	//   75  155:iconst_1        
	//   76  156:istore          4
		}
		if(typeelement.getModifiers().contains(((Object) (Modifier.PRIVATE))))
	//*  77  158:aload           5
	//*  78  160:invokeinterface #401 <Method Set TypeElement.getModifiers()>
	//*  79  165:getstatic       #382 <Field Modifier Modifier.PRIVATE>
	//*  80  168:invokeinterface #284 <Method boolean Set.contains(Object)>
	//*  81  173:ifeq            222
		{
			error(((Element) (typeelement)), "@%s %s may not be contained in private classes. (%s.%s)", new Object[] {
				class1.getSimpleName(), s, typeelement.getQualifiedName(), element.getSimpleName()
			});
	//   82  176:aload_0         
	//   83  177:aload           5
	//   84  179:ldc2            #403 <String "@%s %s may not be contained in private classes. (%s.%s)">
	//   85  182:iconst_4        
	//   86  183:anewarray       Object[]
	//   87  186:dup             
	//   88  187:iconst_0        
	//   89  188:aload_1         
	//   90  189:invokevirtual   #182 <Method String Class.getSimpleName()>
	//   91  192:aastore         
	//   92  193:dup             
	//   93  194:iconst_1        
	//   94  195:aload_2         
	//   95  196:aastore         
	//   96  197:dup             
	//   97  198:iconst_2        
	//   98  199:aload           5
	//   99  201:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  100  206:aastore         
	//  101  207:dup             
	//  102  208:iconst_3        
	//  103  209:aload_3         
	//  104  210:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  105  215:aastore         
	//  106  216:invokespecial   #185 <Method void error(Element, String, Object[])>
			flag = true;
	//  107  219:iconst_1        
	//  108  220:istore          4
		}
		return flag;
	//  109  222:iload           4
	//  110  224:ireturn         
	}

	private void parseInjectView(Element element, Map map, Set set)
	{
		TypeElement typeelement = (TypeElement)element.getEnclosingElement();
	//    0    0:aload_1         
	//    1    1:invokeinterface #340 <Method Element Element.getEnclosingElement()>
	//    2    6:checkcast       #226 <Class TypeElement>
	//    3    9:astore          9
		Object obj1 = ((Object) (element.asType()));
	//    4   11:aload_1         
	//    5   12:invokeinterface #407 <Method TypeMirror Element.asType()>
	//    6   17:astore          8
		Object obj = obj1;
	//    7   19:aload           8
	//    8   21:astore          7
		if(obj1 instanceof TypeVariable)
	//*   9   23:aload           8
	//*  10   25:instanceof      #409 <Class TypeVariable>
	//*  11   28:ifeq            43
			obj = ((Object) (((TypeVariable)obj1).getUpperBound()));
	//   12   31:aload           8
	//   13   33:checkcast       #409 <Class TypeVariable>
	//   14   36:invokeinterface #412 <Method TypeMirror TypeVariable.getUpperBound()>
	//   15   41:astore          7
		boolean flag1 = isSubtypeOfType(((TypeMirror) (obj)), "android.view.View");
	//   16   43:aload_0         
	//   17   44:aload           7
	//   18   46:ldc1            #24  <String "android.view.View">
	//   19   48:invokespecial   #368 <Method boolean isSubtypeOfType(TypeMirror, String)>
	//   20   51:istore          6
		boolean flag = false;
	//   21   53:iconst_0        
	//   22   54:istore          5
		int i;
		if(!flag1)
	//*  23   56:iload           6
	//*  24   58:ifne            98
		{
			error(element, "@InjectView fields must extend from View. (%s.%s)", new Object[] {
				typeelement.getQualifiedName(), element.getSimpleName()
			});
	//   25   61:aload_0         
	//   26   62:aload_1         
	//   27   63:ldc2            #414 <String "@InjectView fields must extend from View. (%s.%s)">
	//   28   66:iconst_2        
	//   29   67:anewarray       Object[]
	//   30   70:dup             
	//   31   71:iconst_0        
	//   32   72:aload           9
	//   33   74:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//   34   79:aastore         
	//   35   80:dup             
	//   36   81:iconst_1        
	//   37   82:aload_1         
	//   38   83:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//   39   88:aastore         
	//   40   89:invokespecial   #185 <Method void error(Element, String, Object[])>
			i = 1;
	//   41   92:iconst_1        
	//   42   93:istore          4
		} else
	//*  43   95:goto            101
		{
			i = 0;
	//   44   98:iconst_0        
	//   45   99:istore          4
		}
		i = ((int) (i | isValidForGeneratedCode(butterknife/InjectView, "fields", element) | isBindingInWrongPackage(butterknife/InjectView, element)));
	//   46  101:iload           4
	//   47  103:aload_0         
	//   48  104:ldc1            #197 <Class InjectView>
	//   49  106:ldc2            #416 <String "fields">
	//   50  109:aload_1         
	//   51  110:invokespecial   #418 <Method boolean isValidForGeneratedCode(Class, String, Element)>
	//   52  113:ior             
	//   53  114:aload_0         
	//   54  115:ldc1            #197 <Class InjectView>
	//   55  117:aload_1         
	//   56  118:invokespecial   #420 <Method boolean isBindingInWrongPackage(Class, Element)>
	//   57  121:ior             
	//   58  122:istore          4
		if(element.getAnnotation(butterknife/InjectViews) != null)
	//*  59  124:aload_1         
	//*  60  125:ldc1            #205 <Class InjectViews>
	//*  61  127:invokeinterface #424 <Method java.lang.annotation.Annotation Element.getAnnotation(Class)>
	//*  62  132:ifnull          169
		{
			error(element, "Only one of @InjectView and @InjectViews is allowed. (%s.%s)", new Object[] {
				typeelement.getQualifiedName(), element.getSimpleName()
			});
	//   63  135:aload_0         
	//   64  136:aload_1         
	//   65  137:ldc2            #426 <String "Only one of @InjectView and @InjectViews is allowed. (%s.%s)">
	//   66  140:iconst_2        
	//   67  141:anewarray       Object[]
	//   68  144:dup             
	//   69  145:iconst_0        
	//   70  146:aload           9
	//   71  148:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//   72  153:aastore         
	//   73  154:dup             
	//   74  155:iconst_1        
	//   75  156:aload_1         
	//   76  157:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//   77  162:aastore         
	//   78  163:invokespecial   #185 <Method void error(Element, String, Object[])>
			i = 1;
	//   79  166:iconst_1        
	//   80  167:istore          4
		}
		if(i)
	//*  81  169:iload           4
	//*  82  171:ifeq            175
			return;
	//   83  174:return          
		i = ((InjectView)element.getAnnotation(butterknife/InjectView)).value();
	//   84  175:aload_1         
	//   85  176:ldc1            #197 <Class InjectView>
	//   86  178:invokeinterface #424 <Method java.lang.annotation.Annotation Element.getAnnotation(Class)>
	//   87  183:checkcast       #197 <Class InjectView>
	//   88  186:invokeinterface #429 <Method int InjectView.value()>
	//   89  191:istore          4
		obj1 = ((Object) ((ViewInjector)map.get(((Object) (typeelement)))));
	//   90  193:aload_2         
	//   91  194:aload           9
	//   92  196:invokeinterface #316 <Method Object Map.get(Object)>
	//   93  201:checkcast       #235 <Class ViewInjector>
	//   94  204:astore          8
		if(obj1 != null)
	//*  95  206:aload           8
	//*  96  208:ifnull          303
		{
			obj1 = ((Object) (((ViewInjector) (obj1)).getViewInjection(i)));
	//   97  211:aload           8
	//   98  213:iload           4
	//   99  215:invokevirtual   #433 <Method ViewInjection ViewInjector.getViewInjection(int)>
	//  100  218:astore          8
			if(obj1 != null)
	//* 101  220:aload           8
	//* 102  222:ifnull          303
			{
				obj1 = ((Object) (((ViewInjection) (obj1)).getViewBindings().iterator()));
	//  103  225:aload           8
	//  104  227:invokevirtual   #439 <Method Collection ViewInjection.getViewBindings()>
	//  105  230:invokeinterface #442 <Method Iterator Collection.iterator()>
	//  106  235:astore          8
				if(((Iterator) (obj1)).hasNext())
	//* 107  237:aload           8
	//* 108  239:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//* 109  244:ifeq            303
				{
					error(element, "Attempt to use @InjectView for an already injected ID %d on '%s'. (%s.%s)", new Object[] {
						Integer.valueOf(i), ((ViewBinding)((Iterator) (obj1)).next()).getName(), typeelement.getQualifiedName(), element.getSimpleName()
					});
	//  110  247:aload_0         
	//  111  248:aload_1         
	//  112  249:ldc2            #444 <String "Attempt to use @InjectView for an already injected ID %d on '%s'. (%s.%s)">
	//  113  252:iconst_4        
	//  114  253:anewarray       Object[]
	//  115  256:dup             
	//  116  257:iconst_0        
	//  117  258:iload           4
	//  118  260:invokestatic    #256 <Method Integer Integer.valueOf(int)>
	//  119  263:aastore         
	//  120  264:dup             
	//  121  265:iconst_1        
	//  122  266:aload           8
	//  123  268:invokeinterface #155 <Method Object Iterator.next()>
	//  124  273:checkcast       #446 <Class ViewBinding>
	//  125  276:invokevirtual   #449 <Method String ViewBinding.getName()>
	//  126  279:aastore         
	//  127  280:dup             
	//  128  281:iconst_2        
	//  129  282:aload           9
	//  130  284:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  131  289:aastore         
	//  132  290:dup             
	//  133  291:iconst_3        
	//  134  292:aload_1         
	//  135  293:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  136  298:aastore         
	//  137  299:invokespecial   #185 <Method void error(Element, String, Object[])>
					return;
	//  138  302:return          
				}
			}
		}
		obj1 = ((Object) (((Object) (element.getSimpleName())).toString()));
	//  139  303:aload_1         
	//  140  304:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  141  309:invokevirtual   #281 <Method String Object.toString()>
	//  142  312:astore          8
		obj = ((Object) (((TypeMirror) (obj)).toString()));
	//  143  314:aload           7
	//  144  316:invokeinterface #91  <Method String TypeMirror.toString()>
	//  145  321:astore          7
		if(element.getAnnotation(butterknife/Optional) == null)
	//* 146  323:aload_1         
	//* 147  324:ldc2            #451 <Class Optional>
	//* 148  327:invokeinterface #424 <Method java.lang.annotation.Annotation Element.getAnnotation(Class)>
	//* 149  332:ifnonnull       338
			flag = true;
	//  150  335:iconst_1        
	//  151  336:istore          5
		getOrCreateTargetClass(map, typeelement).addView(i, new ViewBinding(((String) (obj1)), ((String) (obj)), flag));
	//  152  338:aload_0         
	//  153  339:aload_2         
	//  154  340:aload           9
	//  155  342:invokespecial   #453 <Method ViewInjector getOrCreateTargetClass(Map, TypeElement)>
	//  156  345:iload           4
	//  157  347:new             #446 <Class ViewBinding>
	//  158  350:dup             
	//  159  351:aload           8
	//  160  353:aload           7
	//  161  355:iload           5
	//  162  357:invokespecial   #456 <Method void ViewBinding(String, String, boolean)>
	//  163  360:invokevirtual   #460 <Method void ViewInjector.addView(int, ViewBinding)>
		set.add(((Object) (((Object) (typeelement)).toString())));
	//  164  363:aload_3         
	//  165  364:aload           9
	//  166  366:invokevirtual   #281 <Method String Object.toString()>
	//  167  369:invokeinterface #260 <Method boolean Set.add(Object)>
	//  168  374:pop             
	//  169  375:return          
	}

	private void parseInjectViews(Element element, Map map, Set set)
	{
		TypeElement typeelement = (TypeElement)element.getEnclosingElement();
	//    0    0:aload_1         
	//    1    1:invokeinterface #340 <Method Element Element.getEnclosingElement()>
	//    2    6:checkcast       #226 <Class TypeElement>
	//    3    9:astore          10
		Object obj2 = ((Object) (element.asType()));
	//    4   11:aload_1         
	//    5   12:invokeinterface #407 <Method TypeMirror Element.asType()>
	//    6   17:astore          9
		String s = doubleErasure(((TypeMirror) (obj2)));
	//    7   19:aload_0         
	//    8   20:aload           9
	//    9   22:invokespecial   #463 <Method String doubleErasure(TypeMirror)>
	//   10   25:astore          11
		Object obj3 = ((Object) (((TypeMirror) (obj2)).getKind()));
	//   11   27:aload           9
	//   12   29:invokeinterface #268 <Method TypeKind TypeMirror.getKind()>
	//   13   34:astore          12
		TypeKind typekind = TypeKind.ARRAY;
	//   14   36:getstatic       #466 <Field TypeKind TypeKind.ARRAY>
	//   15   39:astore          13
		Object obj1 = null;
	//   16   41:aconst_null     
	//   17   42:astore          8
		Object obj = null;
	//   18   44:aconst_null     
	//   19   45:astore          7
		boolean flag2 = false;
	//   20   47:iconst_0        
	//   21   48:istore          6
		boolean flag;
		if(obj3 == typekind)
	//*  22   50:aload           12
	//*  23   52:aload           13
	//*  24   54:if_acmpne       80
		{
			obj = ((Object) (((ArrayType)obj2).getComponentType()));
	//   25   57:aload           9
	//   26   59:checkcast       #468 <Class ArrayType>
	//   27   62:invokeinterface #471 <Method TypeMirror ArrayType.getComponentType()>
	//   28   67:astore          7
			obj1 = ((Object) (CollectionBinding.Kind.ARRAY));
	//   29   69:getstatic       #476 <Field CollectionBinding$Kind CollectionBinding$Kind.ARRAY>
	//   30   72:astore          8
			flag = false;
	//   31   74:iconst_0        
	//   32   75:istore          4
		} else
	//*  33   77:goto            220
		if(LIST_TYPE.equals(((Object) (s))))
	//*  34   80:getstatic       #42  <Field String LIST_TYPE>
	//*  35   83:aload           11
	//*  36   85:invokevirtual   #354 <Method boolean String.equals(Object)>
	//*  37   88:ifeq            175
		{
			obj1 = ((Object) (((DeclaredType)obj2).getTypeArguments()));
	//   38   91:aload           9
	//   39   93:checkcast       #276 <Class DeclaredType>
	//   40   96:invokeinterface #358 <Method List DeclaredType.getTypeArguments()>
	//   41  101:astore          8
			if(((List) (obj1)).size() != 1)
	//*  42  103:aload           8
	//*  43  105:invokeinterface #361 <Method int List.size()>
	//*  44  110:iconst_1        
	//*  45  111:icmpeq          151
			{
				error(element, "@InjectViews List must have a generic component. (%s.%s)", new Object[] {
					typeelement.getQualifiedName(), element.getSimpleName()
				});
	//   46  114:aload_0         
	//   47  115:aload_1         
	//   48  116:ldc2            #478 <String "@InjectViews List must have a generic component. (%s.%s)">
	//   49  119:iconst_2        
	//   50  120:anewarray       Object[]
	//   51  123:dup             
	//   52  124:iconst_0        
	//   53  125:aload           10
	//   54  127:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//   55  132:aastore         
	//   56  133:dup             
	//   57  134:iconst_1        
	//   58  135:aload_1         
	//   59  136:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//   60  141:aastore         
	//   61  142:invokespecial   #185 <Method void error(Element, String, Object[])>
				flag = true;
	//   62  145:iconst_1        
	//   63  146:istore          4
			} else
	//*  64  148:goto            167
			{
				obj = ((Object) ((TypeMirror)((List) (obj1)).get(0)));
	//   65  151:aload           8
	//   66  153:iconst_0        
	//   67  154:invokeinterface #481 <Method Object List.get(int)>
	//   68  159:checkcast       #88  <Class TypeMirror>
	//   69  162:astore          7
				flag = false;
	//   70  164:iconst_0        
	//   71  165:istore          4
			}
			obj1 = ((Object) (CollectionBinding.Kind.LIST));
	//   72  167:getstatic       #484 <Field CollectionBinding$Kind CollectionBinding$Kind.LIST>
	//   73  170:astore          8
		} else
	//*  74  172:goto            220
		{
			error(element, "@InjectViews must be a List or array. (%s.%s)", new Object[] {
				typeelement.getQualifiedName(), element.getSimpleName()
			});
	//   75  175:aload_0         
	//   76  176:aload_1         
	//   77  177:ldc2            #486 <String "@InjectViews must be a List or array. (%s.%s)">
	//   78  180:iconst_2        
	//   79  181:anewarray       Object[]
	//   80  184:dup             
	//   81  185:iconst_0        
	//   82  186:aload           10
	//   83  188:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//   84  193:aastore         
	//   85  194:dup             
	//   86  195:iconst_1        
	//   87  196:aload_1         
	//   88  197:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//   89  202:aastore         
	//   90  203:invokespecial   #185 <Method void error(Element, String, Object[])>
			obj2 = null;
	//   91  206:aconst_null     
	//   92  207:astore          9
			flag = true;
	//   93  209:iconst_1        
	//   94  210:istore          4
			obj = obj1;
	//   95  212:aload           8
	//   96  214:astore          7
			obj1 = obj2;
	//   97  216:aload           9
	//   98  218:astore          8
		}
		obj2 = obj;
	//   99  220:aload           7
	//  100  222:astore          9
		if(obj instanceof TypeVariable)
	//* 101  224:aload           7
	//* 102  226:instanceof      #409 <Class TypeVariable>
	//* 103  229:ifeq            244
			obj2 = ((Object) (((TypeVariable)obj).getUpperBound()));
	//  104  232:aload           7
	//  105  234:checkcast       #409 <Class TypeVariable>
	//  106  237:invokeinterface #412 <Method TypeMirror TypeVariable.getUpperBound()>
	//  107  242:astore          9
		boolean flag1 = flag;
	//  108  244:iload           4
	//  109  246:istore          5
		if(obj2 != null)
	//* 110  248:aload           9
	//* 111  250:ifnull          302
		{
			flag1 = flag;
	//  112  253:iload           4
	//  113  255:istore          5
			if(!isSubtypeOfType(((TypeMirror) (obj2)), "android.view.View"))
	//* 114  257:aload_0         
	//* 115  258:aload           9
	//* 116  260:ldc1            #24  <String "android.view.View">
	//* 117  262:invokespecial   #368 <Method boolean isSubtypeOfType(TypeMirror, String)>
	//* 118  265:ifne            302
			{
				error(element, "@InjectViews type must extend from View. (%s.%s)", new Object[] {
					typeelement.getQualifiedName(), element.getSimpleName()
				});
	//  119  268:aload_0         
	//  120  269:aload_1         
	//  121  270:ldc2            #488 <String "@InjectViews type must extend from View. (%s.%s)">
	//  122  273:iconst_2        
	//  123  274:anewarray       Object[]
	//  124  277:dup             
	//  125  278:iconst_0        
	//  126  279:aload           10
	//  127  281:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  128  286:aastore         
	//  129  287:dup             
	//  130  288:iconst_1        
	//  131  289:aload_1         
	//  132  290:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  133  295:aastore         
	//  134  296:invokespecial   #185 <Method void error(Element, String, Object[])>
				flag1 = true;
	//  135  299:iconst_1        
	//  136  300:istore          5
			}
		}
		if(flag1 | isValidForGeneratedCode(butterknife/InjectViews, "fields", element) | isBindingInWrongPackage(butterknife/InjectViews, element))
	//* 137  302:iload           5
	//* 138  304:aload_0         
	//* 139  305:ldc1            #205 <Class InjectViews>
	//* 140  307:ldc2            #416 <String "fields">
	//* 141  310:aload_1         
	//* 142  311:invokespecial   #418 <Method boolean isValidForGeneratedCode(Class, String, Element)>
	//* 143  314:ior             
	//* 144  315:aload_0         
	//* 145  316:ldc1            #205 <Class InjectViews>
	//* 146  318:aload_1         
	//* 147  319:invokespecial   #420 <Method boolean isBindingInWrongPackage(Class, Element)>
	//* 148  322:ior             
	//* 149  323:ifeq            327
			return;
	//  150  326:return          
		obj = ((Object) (((Object) (element.getSimpleName())).toString()));
	//  151  327:aload_1         
	//  152  328:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  153  333:invokevirtual   #281 <Method String Object.toString()>
	//  154  336:astore          7
		int ai[] = ((InjectViews)element.getAnnotation(butterknife/InjectViews)).value();
	//  155  338:aload_1         
	//  156  339:ldc1            #205 <Class InjectViews>
	//  157  341:invokeinterface #424 <Method java.lang.annotation.Annotation Element.getAnnotation(Class)>
	//  158  346:checkcast       #205 <Class InjectViews>
	//  159  349:invokeinterface #491 <Method int[] InjectViews.value()>
	//  160  354:astore          11
		if(ai.length == 0)
	//* 161  356:aload           11
	//* 162  358:arraylength     
	//* 163  359:ifne            394
		{
			error(element, "@InjectViews must specify at least one ID. (%s.%s)", new Object[] {
				typeelement.getQualifiedName(), element.getSimpleName()
			});
	//  164  362:aload_0         
	//  165  363:aload_1         
	//  166  364:ldc2            #493 <String "@InjectViews must specify at least one ID. (%s.%s)">
	//  167  367:iconst_2        
	//  168  368:anewarray       Object[]
	//  169  371:dup             
	//  170  372:iconst_0        
	//  171  373:aload           10
	//  172  375:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  173  380:aastore         
	//  174  381:dup             
	//  175  382:iconst_1        
	//  176  383:aload_1         
	//  177  384:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  178  389:aastore         
	//  179  390:invokespecial   #185 <Method void error(Element, String, Object[])>
			return;
	//  180  393:return          
		}
		obj3 = ((Object) (findDuplicate(ai)));
	//  181  394:aload           11
	//  182  396:invokestatic    #495 <Method Integer findDuplicate(int[])>
	//  183  399:astore          12
		if(obj3 != null)
	//* 184  401:aload           12
	//* 185  403:ifnull          442
			error(element, "@InjectViews annotation contains duplicate ID %d. (%s.%s)", new Object[] {
				obj3, typeelement.getQualifiedName(), element.getSimpleName()
			});
	//  186  406:aload_0         
	//  187  407:aload_1         
	//  188  408:ldc2            #497 <String "@InjectViews annotation contains duplicate ID %d. (%s.%s)">
	//  189  411:iconst_3        
	//  190  412:anewarray       Object[]
	//  191  415:dup             
	//  192  416:iconst_0        
	//  193  417:aload           12
	//  194  419:aastore         
	//  195  420:dup             
	//  196  421:iconst_1        
	//  197  422:aload           10
	//  198  424:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  199  429:aastore         
	//  200  430:dup             
	//  201  431:iconst_2        
	//  202  432:aload_1         
	//  203  433:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  204  438:aastore         
	//  205  439:invokespecial   #185 <Method void error(Element, String, Object[])>
		obj2 = ((Object) (((TypeMirror) (obj2)).toString()));
	//  206  442:aload           9
	//  207  444:invokeinterface #91  <Method String TypeMirror.toString()>
	//  208  449:astore          9
		if(element.getAnnotation(butterknife/Optional) == null)
	//* 209  451:aload_1         
	//* 210  452:ldc2            #451 <Class Optional>
	//* 211  455:invokeinterface #424 <Method java.lang.annotation.Annotation Element.getAnnotation(Class)>
	//* 212  460:ifnonnull       466
			flag2 = true;
	//  213  463:iconst_1        
	//  214  464:istore          6
		getOrCreateTargetClass(map, typeelement).addCollection(ai, new CollectionBinding(((String) (obj)), ((String) (obj2)), ((CollectionBinding.Kind) (obj1)), flag2));
	//  215  466:aload_0         
	//  216  467:aload_2         
	//  217  468:aload           10
	//  218  470:invokespecial   #453 <Method ViewInjector getOrCreateTargetClass(Map, TypeElement)>
	//  219  473:aload           11
	//  220  475:new             #499 <Class CollectionBinding>
	//  221  478:dup             
	//  222  479:aload           7
	//  223  481:aload           9
	//  224  483:aload           8
	//  225  485:iload           6
	//  226  487:invokespecial   #502 <Method void CollectionBinding(String, String, CollectionBinding$Kind, boolean)>
	//  227  490:invokevirtual   #506 <Method void ViewInjector.addCollection(int[], CollectionBinding)>
		set.add(((Object) (((Object) (typeelement)).toString())));
	//  228  493:aload_3         
	//  229  494:aload           10
	//  230  496:invokevirtual   #281 <Method String Object.toString()>
	//  231  499:invokeinterface #260 <Method boolean Set.add(Object)>
	//  232  504:pop             
	//  233  505:return          
	}

	private void parseListenerAnnotation(Class class1, Element element, Map map, Set set)
		throws Exception
	{
		if((element instanceof ExecutableElement) && element.getKind() == ElementKind.METHOD)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #508 <Class ExecutableElement>
	//*   2    4:ifeq            1545
	//*   3    7:aload_2         
	//*   4    8:invokeinterface #509 <Method ElementKind Element.getKind()>
	//*   5   13:getstatic       #512 <Field ElementKind ElementKind.METHOD>
	//*   6   16:if_acmpeq       22
	//*   7   19:goto            1545
		{
			ExecutableElement executableelement = (ExecutableElement)element;
	//    8   22:aload_2         
	//    9   23:checkcast       #508 <Class ExecutableElement>
	//   10   26:astore          19
			TypeElement typeelement = (TypeElement)element.getEnclosingElement();
	//   11   28:aload_2         
	//   12   29:invokeinterface #340 <Method Element Element.getEnclosingElement()>
	//   13   34:checkcast       #226 <Class TypeElement>
	//   14   37:astore          18
			Object obj1 = ((Object) (element.getAnnotation(class1)));
	//   15   39:aload_2         
	//   16   40:aload_1         
	//   17   41:invokeinterface #424 <Method java.lang.annotation.Annotation Element.getAnnotation(Class)>
	//   18   46:astore          13
			Method method = class1.getDeclaredMethod("value", new Class[0]);
	//   19   48:aload_1         
	//   20   49:ldc2            #513 <String "value">
	//   21   52:iconst_0        
	//   22   53:anewarray       Class[]
	//   23   56:invokevirtual   #517 <Method Method Class.getDeclaredMethod(String, Class[])>
	//   24   59:astore          11
			if(method.getReturnType() != [I)
	//*  25   61:aload           11
	//*  26   63:invokevirtual   #523 <Method Class Method.getReturnType()>
	//*  27   66:ldc2            #525 <Class int[]>
	//*  28   69:if_acmpeq       94
				throw new IllegalStateException(String.format("@%s annotation value() type not int[].", new Object[] {
					class1
				}));
	//   29   72:new             #527 <Class IllegalStateException>
	//   30   75:dup             
	//   31   76:ldc2            #529 <String "@%s annotation value() type not int[].">
	//   32   79:iconst_1        
	//   33   80:anewarray       Object[]
	//   34   83:dup             
	//   35   84:iconst_0        
	//   36   85:aload_1         
	//   37   86:aastore         
	//   38   87:invokestatic    #107 <Method String String.format(String, Object[])>
	//   39   90:invokespecial   #530 <Method void IllegalStateException(String)>
	//   40   93:athrow          
			int ai[] = (int[])method.invoke(obj1, new Object[0]);
	//   41   94:aload           11
	//   42   96:aload           13
	//   43   98:iconst_0        
	//   44   99:anewarray       Object[]
	//   45  102:invokevirtual   #534 <Method Object Method.invoke(Object, Object[])>
	//   46  105:checkcast       #525 <Class int[]>
	//   47  108:astore          11
			String s1 = ((Object) (executableelement.getSimpleName())).toString();
	//   48  110:aload           19
	//   49  112:invokeinterface #535 <Method javax.lang.model.element.Name ExecutableElement.getSimpleName()>
	//   50  117:invokevirtual   #281 <Method String Object.toString()>
	//   51  120:astore          20
			boolean flag2;
			if(element.getAnnotation(butterknife/Optional) == null)
	//*  52  122:aload_2         
	//*  53  123:ldc2            #451 <Class Optional>
	//*  54  126:invokeinterface #424 <Method java.lang.annotation.Annotation Element.getAnnotation(Class)>
	//*  55  131:ifnonnull       140
				flag2 = true;
	//   56  134:iconst_1        
	//   57  135:istore          10
			else
	//*  58  137:goto            143
				flag2 = false;
	//   59  140:iconst_0        
	//   60  141:istore          10
			boolean flag = isValidForGeneratedCode(class1, "methods", element) | isBindingInWrongPackage(class1, element);
	//   61  143:aload_0         
	//   62  144:aload_1         
	//   63  145:ldc2            #537 <String "methods">
	//   64  148:aload_2         
	//   65  149:invokespecial   #418 <Method boolean isValidForGeneratedCode(Class, String, Element)>
	//   66  152:aload_0         
	//   67  153:aload_1         
	//   68  154:aload_2         
	//   69  155:invokespecial   #420 <Method boolean isBindingInWrongPackage(Class, Element)>
	//   70  158:ior             
	//   71  159:istore          5
			Object obj = ((Object) (findDuplicate(ai)));
	//   72  161:aload           11
	//   73  163:invokestatic    #495 <Method Integer findDuplicate(int[])>
	//   74  166:astore          12
			if(obj != null)
	//*  75  168:aload           12
	//*  76  170:ifnull          219
			{
				error(element, "@%s annotation for method contains duplicate ID %d. (%s.%s)", new Object[] {
					class1.getSimpleName(), obj, typeelement.getQualifiedName(), element.getSimpleName()
				});
	//   77  173:aload_0         
	//   78  174:aload_2         
	//   79  175:ldc2            #539 <String "@%s annotation for method contains duplicate ID %d. (%s.%s)">
	//   80  178:iconst_4        
	//   81  179:anewarray       Object[]
	//   82  182:dup             
	//   83  183:iconst_0        
	//   84  184:aload_1         
	//   85  185:invokevirtual   #182 <Method String Class.getSimpleName()>
	//   86  188:aastore         
	//   87  189:dup             
	//   88  190:iconst_1        
	//   89  191:aload           12
	//   90  193:aastore         
	//   91  194:dup             
	//   92  195:iconst_2        
	//   93  196:aload           18
	//   94  198:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//   95  203:aastore         
	//   96  204:dup             
	//   97  205:iconst_3        
	//   98  206:aload_2         
	//   99  207:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  100  212:aastore         
	//  101  213:invokespecial   #185 <Method void error(Element, String, Object[])>
				flag = true;
	//  102  216:iconst_1        
	//  103  217:istore          5
			}
			obj = ((Object) ((ListenerClass)class1.getAnnotation(butterknife/internal/ListenerClass)));
	//  104  219:aload_1         
	//  105  220:ldc2            #541 <Class ListenerClass>
	//  106  223:invokevirtual   #542 <Method java.lang.annotation.Annotation Class.getAnnotation(Class)>
	//  107  226:checkcast       #541 <Class ListenerClass>
	//  108  229:astore          12
			if(obj == null)
	//* 109  231:aload           12
	//* 110  233:ifnonnull       270
				throw new IllegalStateException(String.format("No @%s defined on @%s.", new Object[] {
					((Class) (butterknife/internal/ListenerClass)).getSimpleName(), class1.getSimpleName()
				}));
	//  111  236:new             #527 <Class IllegalStateException>
	//  112  239:dup             
	//  113  240:ldc2            #544 <String "No @%s defined on @%s.">
	//  114  243:iconst_2        
	//  115  244:anewarray       Object[]
	//  116  247:dup             
	//  117  248:iconst_0        
	//  118  249:ldc2            #541 <Class ListenerClass>
	//  119  252:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  120  255:aastore         
	//  121  256:dup             
	//  122  257:iconst_1        
	//  123  258:aload_1         
	//  124  259:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  125  262:aastore         
	//  126  263:invokestatic    #107 <Method String String.format(String, Object[])>
	//  127  266:invokespecial   #530 <Method void IllegalStateException(String)>
	//  128  269:athrow          
			int i2 = ai.length;
	//  129  270:aload           11
	//  130  272:arraylength     
	//  131  273:istore          8
			for(int k1 = 0; k1 < i2;)
	//* 132  275:iconst_0        
	//* 133  276:istore          7
	//* 134  278:iload           7
	//* 135  280:iload           8
	//* 136  282:icmpge          491
			{
				int j2 = ai[k1];
	//  137  285:aload           11
	//  138  287:iload           7
	//  139  289:iaload          
	//  140  290:istore          9
				boolean flag1 = flag;
	//  141  292:iload           5
	//  142  294:istore          6
				if(j2 == -1)
	//* 143  296:iload           9
	//* 144  298:iconst_m1       
	//* 145  299:icmpne          478
					if(ai.length == 1)
	//* 146  302:aload           11
	//* 147  304:arraylength     
	//* 148  305:iconst_1        
	//* 149  306:icmpne          429
					{
						if(!flag2)
	//* 150  309:iload           10
	//* 151  311:ifne            348
						{
							error(element, "ID free injection must not be annotated with @Optional. (%s.%s)", new Object[] {
								typeelement.getQualifiedName(), element.getSimpleName()
							});
	//  152  314:aload_0         
	//  153  315:aload_2         
	//  154  316:ldc2            #546 <String "ID free injection must not be annotated with @Optional. (%s.%s)">
	//  155  319:iconst_2        
	//  156  320:anewarray       Object[]
	//  157  323:dup             
	//  158  324:iconst_0        
	//  159  325:aload           18
	//  160  327:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  161  332:aastore         
	//  162  333:dup             
	//  163  334:iconst_1        
	//  164  335:aload_2         
	//  165  336:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  166  341:aastore         
	//  167  342:invokespecial   #185 <Method void error(Element, String, Object[])>
							flag = true;
	//  168  345:iconst_1        
	//  169  346:istore          5
						}
						String s = ((ListenerClass) (obj)).targetType();
	//  170  348:aload           12
	//  171  350:invokeinterface #549 <Method String ListenerClass.targetType()>
	//  172  355:astore          14
						if(!isSubtypeOfType(typeelement.asType(), s))
	//* 173  357:aload_0         
	//* 174  358:aload           18
	//* 175  360:invokeinterface #550 <Method TypeMirror TypeElement.asType()>
	//* 176  365:aload           14
	//* 177  367:invokespecial   #368 <Method boolean isSubtypeOfType(TypeMirror, String)>
	//* 178  370:ifne            422
						{
							error(element, "@%s annotation without an ID may only be used with an object of type \"%s\". (%s.%s)", new Object[] {
								class1.getSimpleName(), s, typeelement.getQualifiedName(), element.getSimpleName()
							});
	//  179  373:aload_0         
	//  180  374:aload_2         
	//  181  375:ldc2            #552 <String "@%s annotation without an ID may only be used with an object of type \"%s\". (%s.%s)">
	//  182  378:iconst_4        
	//  183  379:anewarray       Object[]
	//  184  382:dup             
	//  185  383:iconst_0        
	//  186  384:aload_1         
	//  187  385:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  188  388:aastore         
	//  189  389:dup             
	//  190  390:iconst_1        
	//  191  391:aload           14
	//  192  393:aastore         
	//  193  394:dup             
	//  194  395:iconst_2        
	//  195  396:aload           18
	//  196  398:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  197  403:aastore         
	//  198  404:dup             
	//  199  405:iconst_3        
	//  200  406:aload_2         
	//  201  407:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  202  412:aastore         
	//  203  413:invokespecial   #185 <Method void error(Element, String, Object[])>
							flag = true;
	//  204  416:iconst_1        
	//  205  417:istore          5
						}
	//* 206  419:goto            422
						flag1 = flag;
	//  207  422:iload           5
	//  208  424:istore          6
					} else
	//* 209  426:goto            478
					{
						error(element, "@%s annotation contains invalid ID %d. (%s.%s)", new Object[] {
							class1.getSimpleName(), Integer.valueOf(j2), typeelement.getQualifiedName(), element.getSimpleName()
						});
	//  210  429:aload_0         
	//  211  430:aload_2         
	//  212  431:ldc2            #554 <String "@%s annotation contains invalid ID %d. (%s.%s)">
	//  213  434:iconst_4        
	//  214  435:anewarray       Object[]
	//  215  438:dup             
	//  216  439:iconst_0        
	//  217  440:aload_1         
	//  218  441:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  219  444:aastore         
	//  220  445:dup             
	//  221  446:iconst_1        
	//  222  447:iload           9
	//  223  449:invokestatic    #256 <Method Integer Integer.valueOf(int)>
	//  224  452:aastore         
	//  225  453:dup             
	//  226  454:iconst_2        
	//  227  455:aload           18
	//  228  457:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  229  462:aastore         
	//  230  463:dup             
	//  231  464:iconst_3        
	//  232  465:aload_2         
	//  233  466:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  234  471:aastore         
	//  235  472:invokespecial   #185 <Method void error(Element, String, Object[])>
						flag1 = true;
	//  236  475:iconst_1        
	//  237  476:istore          6
					}
				k1++;
	//  238  478:iload           7
	//  239  480:iconst_1        
	//  240  481:iadd            
	//  241  482:istore          7
				flag = flag1;
	//  242  484:iload           6
	//  243  486:istore          5
			}

	//* 244  488:goto            278
			ListenerMethod alistenermethod[] = ((ListenerClass) (obj)).method();
	//  245  491:aload           12
	//  246  493:invokeinterface #558 <Method ListenerMethod[] ListenerClass.method()>
	//  247  498:astore          14
			if(alistenermethod.length > 1)
	//* 248  500:aload           14
	//* 249  502:arraylength     
	//* 250  503:iconst_1        
	//* 251  504:icmple          532
				throw new IllegalStateException(String.format("Multiple listener methods specified on @%s.", new Object[] {
					class1.getSimpleName()
				}));
	//  252  507:new             #527 <Class IllegalStateException>
	//  253  510:dup             
	//  254  511:ldc2            #560 <String "Multiple listener methods specified on @%s.">
	//  255  514:iconst_1        
	//  256  515:anewarray       Object[]
	//  257  518:dup             
	//  258  519:iconst_0        
	//  259  520:aload_1         
	//  260  521:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  261  524:aastore         
	//  262  525:invokestatic    #107 <Method String String.format(String, Object[])>
	//  263  528:invokespecial   #530 <Method void IllegalStateException(String)>
	//  264  531:athrow          
			ListenerMethod listenermethod;
			if(alistenermethod.length == 1)
	//* 265  532:aload           14
	//* 266  534:arraylength     
	//* 267  535:iconst_1        
	//* 268  536:icmpne          586
			{
				if(((ListenerClass) (obj)).callbacks() != butterknife/internal/ListenerClass$NONE)
	//* 269  539:aload           12
	//* 270  541:invokeinterface #563 <Method Class ListenerClass.callbacks()>
	//* 271  546:ldc2            #565 <Class ListenerClass$NONE>
	//* 272  549:if_acmpeq       577
					throw new IllegalStateException(String.format("Both method() and callback() defined on @%s.", new Object[] {
						class1.getSimpleName()
					}));
	//  273  552:new             #527 <Class IllegalStateException>
	//  274  555:dup             
	//  275  556:ldc2            #567 <String "Both method() and callback() defined on @%s.">
	//  276  559:iconst_1        
	//  277  560:anewarray       Object[]
	//  278  563:dup             
	//  279  564:iconst_0        
	//  280  565:aload_1         
	//  281  566:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  282  569:aastore         
	//  283  570:invokestatic    #107 <Method String String.format(String, Object[])>
	//  284  573:invokespecial   #530 <Method void IllegalStateException(String)>
	//  285  576:athrow          
				listenermethod = alistenermethod[0];
	//  286  577:aload           14
	//  287  579:iconst_0        
	//  288  580:aaload          
	//  289  581:astore          14
			} else
	//* 290  583:goto            693
			{
				obj1 = ((Object) ((Enum)class1.getDeclaredMethod("callback", new Class[0]).invoke(obj1, new Object[0])));
	//  291  586:aload_1         
	//  292  587:ldc2            #569 <String "callback">
	//  293  590:iconst_0        
	//  294  591:anewarray       Class[]
	//  295  594:invokevirtual   #517 <Method Method Class.getDeclaredMethod(String, Class[])>
	//  296  597:aload           13
	//  297  599:iconst_0        
	//  298  600:anewarray       Object[]
	//  299  603:invokevirtual   #534 <Method Object Method.invoke(Object, Object[])>
	//  300  606:checkcast       #571 <Class Enum>
	//  301  609:astore          13
				listenermethod = (ListenerMethod)((Enum) (obj1)).getDeclaringClass().getField(((Enum) (obj1)).name()).getAnnotation(butterknife/internal/ListenerMethod);
	//  302  611:aload           13
	//  303  613:invokevirtual   #574 <Method Class Enum.getDeclaringClass()>
	//  304  616:aload           13
	//  305  618:invokevirtual   #577 <Method String Enum.name()>
	//  306  621:invokevirtual   #581 <Method Field Class.getField(String)>
	//  307  624:ldc2            #583 <Class ListenerMethod>
	//  308  627:invokevirtual   #586 <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
	//  309  630:checkcast       #583 <Class ListenerMethod>
	//  310  633:astore          14
				if(listenermethod == null)
	//* 311  635:aload           14
	//* 312  637:ifnonnull       693
					throw new IllegalStateException(String.format("No @%s defined on @%s's %s.%s.", new Object[] {
						((Class) (butterknife/internal/ListenerMethod)).getSimpleName(), class1.getSimpleName(), ((Enum) (obj1)).getDeclaringClass().getSimpleName(), ((Enum) (obj1)).name()
					}));
	//  313  640:new             #527 <Class IllegalStateException>
	//  314  643:dup             
	//  315  644:ldc2            #588 <String "No @%s defined on @%s's %s.%s.">
	//  316  647:iconst_4        
	//  317  648:anewarray       Object[]
	//  318  651:dup             
	//  319  652:iconst_0        
	//  320  653:ldc2            #583 <Class ListenerMethod>
	//  321  656:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  322  659:aastore         
	//  323  660:dup             
	//  324  661:iconst_1        
	//  325  662:aload_1         
	//  326  663:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  327  666:aastore         
	//  328  667:dup             
	//  329  668:iconst_2        
	//  330  669:aload           13
	//  331  671:invokevirtual   #574 <Method Class Enum.getDeclaringClass()>
	//  332  674:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  333  677:aastore         
	//  334  678:dup             
	//  335  679:iconst_3        
	//  336  680:aload           13
	//  337  682:invokevirtual   #577 <Method String Enum.name()>
	//  338  685:aastore         
	//  339  686:invokestatic    #107 <Method String String.format(String, Object[])>
	//  340  689:invokespecial   #530 <Method void IllegalStateException(String)>
	//  341  692:athrow          
			}
			List list = executableelement.getParameters();
	//  342  693:aload           19
	//  343  695:invokeinterface #591 <Method List ExecutableElement.getParameters()>
	//  344  700:astore          21
			if(list.size() > listenermethod.parameters().length)
	//* 345  702:aload           21
	//* 346  704:invokeinterface #361 <Method int List.size()>
	//* 347  709:aload           14
	//* 348  711:invokeinterface #595 <Method String[] ListenerMethod.parameters()>
	//* 349  716:arraylength     
	//* 350  717:icmple          775
			{
				error(element, "@%s methods can have at most %s parameter(s). (%s.%s)", new Object[] {
					class1.getSimpleName(), Integer.valueOf(listenermethod.parameters().length), typeelement.getQualifiedName(), element.getSimpleName()
				});
	//  351  720:aload_0         
	//  352  721:aload_2         
	//  353  722:ldc2            #597 <String "@%s methods can have at most %s parameter(s). (%s.%s)">
	//  354  725:iconst_4        
	//  355  726:anewarray       Object[]
	//  356  729:dup             
	//  357  730:iconst_0        
	//  358  731:aload_1         
	//  359  732:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  360  735:aastore         
	//  361  736:dup             
	//  362  737:iconst_1        
	//  363  738:aload           14
	//  364  740:invokeinterface #595 <Method String[] ListenerMethod.parameters()>
	//  365  745:arraylength     
	//  366  746:invokestatic    #256 <Method Integer Integer.valueOf(int)>
	//  367  749:aastore         
	//  368  750:dup             
	//  369  751:iconst_2        
	//  370  752:aload           18
	//  371  754:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  372  759:aastore         
	//  373  760:dup             
	//  374  761:iconst_3        
	//  375  762:aload_2         
	//  376  763:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  377  768:aastore         
	//  378  769:invokespecial   #185 <Method void error(Element, String, Object[])>
				flag = true;
	//  379  772:iconst_1        
	//  380  773:istore          5
			}
			Object obj2 = ((Object) (executableelement.getReturnType()));
	//  381  775:aload           19
	//  382  777:invokeinterface #599 <Method TypeMirror ExecutableElement.getReturnType()>
	//  383  782:astore          15
			obj1 = obj2;
	//  384  784:aload           15
	//  385  786:astore          13
			if(obj2 instanceof TypeVariable)
	//* 386  788:aload           15
	//* 387  790:instanceof      #409 <Class TypeVariable>
	//* 388  793:ifeq            808
				obj1 = ((Object) (((TypeVariable)obj2).getUpperBound()));
	//  389  796:aload           15
	//  390  798:checkcast       #409 <Class TypeVariable>
	//  391  801:invokeinterface #412 <Method TypeMirror TypeVariable.getUpperBound()>
	//  392  806:astore          13
			if(!((TypeMirror) (obj1)).toString().equals(((Object) (listenermethod.returnType()))))
	//* 393  808:aload           13
	//* 394  810:invokeinterface #91  <Method String TypeMirror.toString()>
	//* 395  815:aload           14
	//* 396  817:invokeinterface #602 <Method String ListenerMethod.returnType()>
	//* 397  822:invokevirtual   #354 <Method boolean String.equals(Object)>
	//* 398  825:ifne            879
			{
				error(element, "@%s methods must have a '%s' return type. (%s.%s)", new Object[] {
					class1.getSimpleName(), listenermethod.returnType(), typeelement.getQualifiedName(), element.getSimpleName()
				});
	//  399  828:aload_0         
	//  400  829:aload_2         
	//  401  830:ldc2            #604 <String "@%s methods must have a '%s' return type. (%s.%s)">
	//  402  833:iconst_4        
	//  403  834:anewarray       Object[]
	//  404  837:dup             
	//  405  838:iconst_0        
	//  406  839:aload_1         
	//  407  840:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  408  843:aastore         
	//  409  844:dup             
	//  410  845:iconst_1        
	//  411  846:aload           14
	//  412  848:invokeinterface #602 <Method String ListenerMethod.returnType()>
	//  413  853:aastore         
	//  414  854:dup             
	//  415  855:iconst_2        
	//  416  856:aload           18
	//  417  858:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  418  863:aastore         
	//  419  864:dup             
	//  420  865:iconst_3        
	//  421  866:aload_2         
	//  422  867:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  423  872:aastore         
	//  424  873:invokespecial   #185 <Method void error(Element, String, Object[])>
				flag = true;
	//  425  876:iconst_1        
	//  426  877:istore          5
			}
			if(flag)
	//* 427  879:iload           5
	//* 428  881:ifeq            885
				return;
	//  429  884:return          
			Parameter aparameter[] = Parameter.NONE;
	//  430  885:getstatic       #609 <Field Parameter[] Parameter.NONE>
	//  431  888:astore          16
			obj2 = ((Object) (ai));
	//  432  890:aload           11
	//  433  892:astore          15
			obj1 = obj;
	//  434  894:aload           12
	//  435  896:astore          13
			if(!list.isEmpty())
	//* 436  898:aload           21
	//* 437  900:invokeinterface #612 <Method boolean List.isEmpty()>
	//* 438  905:ifne            1421
			{
				Parameter aparameter1[] = new Parameter[list.size()];
	//  439  908:aload           21
	//  440  910:invokeinterface #361 <Method int List.size()>
	//  441  915:anewarray       Parameter[]
	//  442  918:astore          17
				BitSet bitset = new BitSet(list.size());
	//  443  920:new             #614 <Class BitSet>
	//  444  923:dup             
	//  445  924:aload           21
	//  446  926:invokeinterface #361 <Method int List.size()>
	//  447  931:invokespecial   #617 <Method void BitSet(int)>
	//  448  934:astore          22
				String as[] = listenermethod.parameters();
	//  449  936:aload           14
	//  450  938:invokeinterface #595 <Method String[] ListenerMethod.parameters()>
	//  451  943:astore          23
				int i = 0;
	//  452  945:iconst_0        
	//  453  946:istore          5
				do
				{
					aparameter = aparameter1;
	//  454  948:aload           17
	//  455  950:astore          16
					obj2 = ((Object) (ai));
	//  456  952:aload           11
	//  457  954:astore          15
					obj1 = obj;
	//  458  956:aload           12
	//  459  958:astore          13
					if(i >= list.size())
						break;
	//  460  960:iload           5
	//  461  962:aload           21
	//  462  964:invokeinterface #361 <Method int List.size()>
	//  463  969:icmpge          1421
					obj2 = ((Object) (((VariableElement)list.get(i)).asType()));
	//  464  972:aload           21
	//  465  974:iload           5
	//  466  976:invokeinterface #481 <Method Object List.get(int)>
	//  467  981:checkcast       #619 <Class VariableElement>
	//  468  984:invokeinterface #620 <Method TypeMirror VariableElement.asType()>
	//  469  989:astore          15
					obj1 = obj2;
	//  470  991:aload           15
	//  471  993:astore          13
					if(obj2 instanceof TypeVariable)
	//* 472  995:aload           15
	//* 473  997:instanceof      #409 <Class TypeVariable>
	//* 474 1000:ifeq            1015
						obj1 = ((Object) (((TypeVariable)obj2).getUpperBound()));
	//  475 1003:aload           15
	//  476 1005:checkcast       #409 <Class TypeVariable>
	//  477 1008:invokeinterface #412 <Method TypeMirror TypeVariable.getUpperBound()>
	//  478 1013:astore          13
					int k = 0;
	//  479 1015:iconst_0        
	//  480 1016:istore          6
					do
					{
						if(k >= as.length)
							break;
	//  481 1018:iload           6
	//  482 1020:aload           23
	//  483 1022:arraylength     
	//  484 1023:icmpge          1093
						if(!bitset.get(k) && isSubtypeOfType(((TypeMirror) (obj1)), as[k]))
	//* 485 1026:aload           22
	//* 486 1028:iload           6
	//* 487 1030:invokevirtual   #623 <Method boolean BitSet.get(int)>
	//* 488 1033:ifeq            1039
	//* 489 1036:goto            1084
	//* 490 1039:aload_0         
	//* 491 1040:aload           13
	//* 492 1042:aload           23
	//* 493 1044:iload           6
	//* 494 1046:aaload          
	//* 495 1047:invokespecial   #368 <Method boolean isSubtypeOfType(TypeMirror, String)>
	//* 496 1050:ifeq            1084
						{
							aparameter1[i] = new Parameter(k, ((TypeMirror) (obj1)).toString());
	//  497 1053:aload           17
	//  498 1055:iload           5
	//  499 1057:new             #606 <Class Parameter>
	//  500 1060:dup             
	//  501 1061:iload           6
	//  502 1063:aload           13
	//  503 1065:invokeinterface #91  <Method String TypeMirror.toString()>
	//  504 1070:invokespecial   #626 <Method void Parameter(int, String)>
	//  505 1073:aastore         
							bitset.set(k);
	//  506 1074:aload           22
	//  507 1076:iload           6
	//  508 1078:invokevirtual   #629 <Method void BitSet.set(int)>
							break;
	//  509 1081:goto            1093
						}
						k++;
	//  510 1084:iload           6
	//  511 1086:iconst_1        
	//  512 1087:iadd            
	//  513 1088:istore          6
					} while(true);
	//  514 1090:goto            1018
					if(aparameter1[i] == null)
	//* 515 1093:aload           17
	//* 516 1095:iload           5
	//* 517 1097:aaload          
	//* 518 1098:ifnonnull       1412
					{
						map = ((Map) (new StringBuilder()));
	//  519 1101:new             #237 <Class StringBuilder>
	//  520 1104:dup             
	//  521 1105:invokespecial   #238 <Method void StringBuilder()>
	//  522 1108:astore_3        
						((StringBuilder) (map)).append("Unable to match @");
	//  523 1109:aload_3         
	//  524 1110:ldc2            #631 <String "Unable to match @">
	//  525 1113:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  526 1116:pop             
						((StringBuilder) (map)).append(class1.getSimpleName());
	//  527 1117:aload_3         
	//  528 1118:aload_1         
	//  529 1119:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  530 1122:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  531 1125:pop             
						((StringBuilder) (map)).append(" method arguments. (");
	//  532 1126:aload_3         
	//  533 1127:ldc2            #633 <String " method arguments. (">
	//  534 1130:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  535 1133:pop             
						((StringBuilder) (map)).append(((CharSequence) (typeelement.getQualifiedName())));
	//  536 1134:aload_3         
	//  537 1135:aload           18
	//  538 1137:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  539 1142:invokevirtual   #636 <Method StringBuilder StringBuilder.append(CharSequence)>
	//  540 1145:pop             
						((StringBuilder) (map)).append('.');
	//  541 1146:aload_3         
	//  542 1147:bipush          46
	//  543 1149:invokevirtual   #366 <Method StringBuilder StringBuilder.append(char)>
	//  544 1152:pop             
						((StringBuilder) (map)).append(((CharSequence) (element.getSimpleName())));
	//  545 1153:aload_3         
	//  546 1154:aload_2         
	//  547 1155:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  548 1160:invokevirtual   #636 <Method StringBuilder StringBuilder.append(CharSequence)>
	//  549 1163:pop             
						((StringBuilder) (map)).append(')');
	//  550 1164:aload_3         
	//  551 1165:bipush          41
	//  552 1167:invokevirtual   #366 <Method StringBuilder StringBuilder.append(char)>
	//  553 1170:pop             
						int l;
						for(i = 0; i < aparameter1.length; i = l)
	//* 554 1171:iconst_0        
	//* 555 1172:istore          5
	//* 556 1174:iload           5
	//* 557 1176:aload           17
	//* 558 1178:arraylength     
	//* 559 1179:icmpge          1310
						{
							class1 = ((Class) (aparameter1[i]));
	//  560 1182:aload           17
	//  561 1184:iload           5
	//  562 1186:aaload          
	//  563 1187:astore_1        
							((StringBuilder) (map)).append("\n\n  Parameter #");
	//  564 1188:aload_3         
	//  565 1189:ldc2            #638 <String "\n\n  Parameter #">
	//  566 1192:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  567 1195:pop             
							l = i + 1;
	//  568 1196:iload           5
	//  569 1198:iconst_1        
	//  570 1199:iadd            
	//  571 1200:istore          6
							((StringBuilder) (map)).append(l);
	//  572 1202:aload_3         
	//  573 1203:iload           6
	//  574 1205:invokevirtual   #641 <Method StringBuilder StringBuilder.append(int)>
	//  575 1208:pop             
							((StringBuilder) (map)).append(": ");
	//  576 1209:aload_3         
	//  577 1210:ldc2            #643 <String ": ">
	//  578 1213:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  579 1216:pop             
							((StringBuilder) (map)).append(((VariableElement)list.get(i)).asType().toString());
	//  580 1217:aload_3         
	//  581 1218:aload           21
	//  582 1220:iload           5
	//  583 1222:invokeinterface #481 <Method Object List.get(int)>
	//  584 1227:checkcast       #619 <Class VariableElement>
	//  585 1230:invokeinterface #620 <Method TypeMirror VariableElement.asType()>
	//  586 1235:invokeinterface #91  <Method String TypeMirror.toString()>
	//  587 1240:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  588 1243:pop             
							((StringBuilder) (map)).append("\n    ");
	//  589 1244:aload_3         
	//  590 1245:ldc2            #645 <String "\n    ">
	//  591 1248:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  592 1251:pop             
							if(class1 == null)
	//* 593 1252:aload_1         
	//* 594 1253:ifnonnull       1267
							{
								((StringBuilder) (map)).append("did not match any listener parameters");
	//  595 1256:aload_3         
	//  596 1257:ldc2            #647 <String "did not match any listener parameters">
	//  597 1260:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  598 1263:pop             
							} else
	//* 599 1264:goto            1303
							{
								((StringBuilder) (map)).append("matched listener parameter #");
	//  600 1267:aload_3         
	//  601 1268:ldc2            #649 <String "matched listener parameter #">
	//  602 1271:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  603 1274:pop             
								((StringBuilder) (map)).append(((Parameter) (class1)).getListenerPosition() + 1);
	//  604 1275:aload_3         
	//  605 1276:aload_1         
	//  606 1277:invokevirtual   #652 <Method int Parameter.getListenerPosition()>
	//  607 1280:iconst_1        
	//  608 1281:iadd            
	//  609 1282:invokevirtual   #641 <Method StringBuilder StringBuilder.append(int)>
	//  610 1285:pop             
								((StringBuilder) (map)).append(": ");
	//  611 1286:aload_3         
	//  612 1287:ldc2            #643 <String ": ">
	//  613 1290:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  614 1293:pop             
								((StringBuilder) (map)).append(((Parameter) (class1)).getType());
	//  615 1294:aload_3         
	//  616 1295:aload_1         
	//  617 1296:invokevirtual   #655 <Method String Parameter.getType()>
	//  618 1299:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  619 1302:pop             
							}
						}

	//  620 1303:iload           6
	//  621 1305:istore          5
	//* 622 1307:goto            1174
						((StringBuilder) (map)).append("\n\nMethods may have up to ");
	//  623 1310:aload_3         
	//  624 1311:ldc2            #657 <String "\n\nMethods may have up to ">
	//  625 1314:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  626 1317:pop             
						((StringBuilder) (map)).append(listenermethod.parameters().length);
	//  627 1318:aload_3         
	//  628 1319:aload           14
	//  629 1321:invokeinterface #595 <Method String[] ListenerMethod.parameters()>
	//  630 1326:arraylength     
	//  631 1327:invokevirtual   #641 <Method StringBuilder StringBuilder.append(int)>
	//  632 1330:pop             
						((StringBuilder) (map)).append(" parameter(s):\n");
	//  633 1331:aload_3         
	//  634 1332:ldc2            #659 <String " parameter(s):\n">
	//  635 1335:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  636 1338:pop             
						class1 = ((Class) (listenermethod.parameters()));
	//  637 1339:aload           14
	//  638 1341:invokeinterface #595 <Method String[] ListenerMethod.parameters()>
	//  639 1346:astore_1        
						int i1 = class1.length;
	//  640 1347:aload_1         
	//  641 1348:arraylength     
	//  642 1349:istore          6
						for(i = 0; i < i1; i++)
	//* 643 1351:iconst_0        
	//* 644 1352:istore          5
	//* 645 1354:iload           5
	//* 646 1356:iload           6
	//* 647 1358:icmpge          1389
						{
							element = ((Element) (class1[i]));
	//  648 1361:aload_1         
	//  649 1362:iload           5
	//  650 1364:aaload          
	//  651 1365:astore_2        
							((StringBuilder) (map)).append("\n  ");
	//  652 1366:aload_3         
	//  653 1367:ldc2            #661 <String "\n  ">
	//  654 1370:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  655 1373:pop             
							((StringBuilder) (map)).append(((String) (element)));
	//  656 1374:aload_3         
	//  657 1375:aload_2         
	//  658 1376:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  659 1379:pop             
						}

	//  660 1380:iload           5
	//  661 1382:iconst_1        
	//  662 1383:iadd            
	//  663 1384:istore          5
	//* 664 1386:goto            1354
						((StringBuilder) (map)).append("\n\nThese may be listed in any order but will be searched for from top to bottom.");
	//  665 1389:aload_3         
	//  666 1390:ldc2            #663 <String "\n\nThese may be listed in any order but will be searched for from top to bottom.">
	//  667 1393:invokevirtual   #242 <Method StringBuilder StringBuilder.append(String)>
	//  668 1396:pop             
						error(((Element) (executableelement)), ((StringBuilder) (map)).toString(), new Object[0]);
	//  669 1397:aload_0         
	//  670 1398:aload           19
	//  671 1400:aload_3         
	//  672 1401:invokevirtual   #243 <Method String StringBuilder.toString()>
	//  673 1404:iconst_0        
	//  674 1405:anewarray       Object[]
	//  675 1408:invokespecial   #185 <Method void error(Element, String, Object[])>
						return;
	//  676 1411:return          
					}
					i++;
	//  677 1412:iload           5
	//  678 1414:iconst_1        
	//  679 1415:iadd            
	//  680 1416:istore          5
				} while(true);
	//  681 1418:goto            948
			}
			class1 = ((Class) (new ListenerBinding(s1, Arrays.asList(((Object []) (aparameter))), flag2)));
	//  682 1421:new             #665 <Class ListenerBinding>
	//  683 1424:dup             
	//  684 1425:aload           20
	//  685 1427:aload           16
	//  686 1429:invokestatic    #70  <Method List Arrays.asList(Object[])>
	//  687 1432:iload           10
	//  688 1434:invokespecial   #668 <Method void ListenerBinding(String, List, boolean)>
	//  689 1437:astore_1        
			map = ((Map) (getOrCreateTargetClass(map, typeelement)));
	//  690 1438:aload_0         
	//  691 1439:aload_3         
	//  692 1440:aload           18
	//  693 1442:invokespecial   #453 <Method ViewInjector getOrCreateTargetClass(Map, TypeElement)>
	//  694 1445:astore_3        
			int j1 = obj2.length;
	//  695 1446:aload           15
	//  696 1448:arraylength     
	//  697 1449:istore          6
			for(int j = 0; j < j1; j++)
	//* 698 1451:iconst_0        
	//* 699 1452:istore          5
	//* 700 1454:iload           5
	//* 701 1456:iload           6
	//* 702 1458:icmpge          1531
			{
				int l1 = obj2[j];
	//  703 1461:aload           15
	//  704 1463:iload           5
	//  705 1465:iaload          
	//  706 1466:istore          7
				if(!((ViewInjector) (map)).addListener(l1, ((ListenerClass) (obj1)), listenermethod, ((ListenerBinding) (class1))))
	//* 707 1468:aload_3         
	//* 708 1469:iload           7
	//* 709 1471:aload           13
	//* 710 1473:aload           14
	//* 711 1475:aload_1         
	//* 712 1476:invokevirtual   #672 <Method boolean ViewInjector.addListener(int, ListenerClass, ListenerMethod, ListenerBinding)>
	//* 713 1479:ifne            1522
				{
					error(element, "Multiple listener methods with return value specified for ID %d. (%s.%s)", new Object[] {
						Integer.valueOf(l1), typeelement.getQualifiedName(), element.getSimpleName()
					});
	//  714 1482:aload_0         
	//  715 1483:aload_2         
	//  716 1484:ldc2            #674 <String "Multiple listener methods with return value specified for ID %d. (%s.%s)">
	//  717 1487:iconst_3        
	//  718 1488:anewarray       Object[]
	//  719 1491:dup             
	//  720 1492:iconst_0        
	//  721 1493:iload           7
	//  722 1495:invokestatic    #256 <Method Integer Integer.valueOf(int)>
	//  723 1498:aastore         
	//  724 1499:dup             
	//  725 1500:iconst_1        
	//  726 1501:aload           18
	//  727 1503:invokeinterface #303 <Method javax.lang.model.element.Name TypeElement.getQualifiedName()>
	//  728 1508:aastore         
	//  729 1509:dup             
	//  730 1510:iconst_2        
	//  731 1511:aload_2         
	//  732 1512:invokeinterface #389 <Method javax.lang.model.element.Name Element.getSimpleName()>
	//  733 1517:aastore         
	//  734 1518:invokespecial   #185 <Method void error(Element, String, Object[])>
					return;
	//  735 1521:return          
				}
			}

	//  736 1522:iload           5
	//  737 1524:iconst_1        
	//  738 1525:iadd            
	//  739 1526:istore          5
	//* 740 1528:goto            1454
			set.add(((Object) (((Object) (typeelement)).toString())));
	//  741 1531:aload           4
	//  742 1533:aload           18
	//  743 1535:invokevirtual   #281 <Method String Object.toString()>
	//  744 1538:invokeinterface #260 <Method boolean Set.add(Object)>
	//  745 1543:pop             
			return;
	//  746 1544:return          
		} else
		{
			throw new IllegalStateException(String.format("@%s annotation must be on a method.", new Object[] {
				class1.getSimpleName()
			}));
	//  747 1545:new             #527 <Class IllegalStateException>
	//  748 1548:dup             
	//  749 1549:ldc2            #676 <String "@%s annotation must be on a method.">
	//  750 1552:iconst_1        
	//  751 1553:anewarray       Object[]
	//  752 1556:dup             
	//  753 1557:iconst_0        
	//  754 1558:aload_1         
	//  755 1559:invokevirtual   #182 <Method String Class.getSimpleName()>
	//  756 1562:aastore         
	//  757 1563:invokestatic    #107 <Method String String.format(String, Object[])>
	//  758 1566:invokespecial   #530 <Method void IllegalStateException(String)>
	//  759 1569:athrow          
		}
	}

	public Set getSupportedAnnotationTypes()
	{
		LinkedHashSet linkedhashset = new LinkedHashSet();
	//    0    0:new             #194 <Class LinkedHashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #195 <Method void LinkedHashSet()>
	//    3    7:astore_1        
		((Set) (linkedhashset)).add(((Object) (((Class) (butterknife/InjectView)).getCanonicalName())));
	//    4    8:aload_1         
	//    5    9:ldc1            #197 <Class InjectView>
	//    6   11:invokevirtual   #40  <Method String Class.getCanonicalName()>
	//    7   14:invokeinterface #260 <Method boolean Set.add(Object)>
	//    8   19:pop             
		((Set) (linkedhashset)).add(((Object) (((Class) (butterknife/InjectViews)).getCanonicalName())));
	//    9   20:aload_1         
	//   10   21:ldc1            #205 <Class InjectViews>
	//   11   23:invokevirtual   #40  <Method String Class.getCanonicalName()>
	//   12   26:invokeinterface #260 <Method boolean Set.add(Object)>
	//   13   31:pop             
		for(Iterator iterator = LISTENERS.iterator(); iterator.hasNext(); ((Set) (linkedhashset)).add(((Object) (((Class)iterator.next()).getCanonicalName()))));
	//   14   32:getstatic       #72  <Field List LISTENERS>
	//   15   35:invokeinterface #211 <Method Iterator List.iterator()>
	//   16   40:astore_2        
	//   17   41:aload_2         
	//   18   42:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//   19   47:ifeq            72
	//   20   50:aload_1         
	//   21   51:aload_2         
	//   22   52:invokeinterface #155 <Method Object Iterator.next()>
	//   23   57:checkcast       #36  <Class Class>
	//   24   60:invokevirtual   #40  <Method String Class.getCanonicalName()>
	//   25   63:invokeinterface #260 <Method boolean Set.add(Object)>
	//   26   68:pop             
	//*  27   69:goto            41
		return ((Set) (linkedhashset));
	//   28   72:aload_1         
	//   29   73:areturn         
	}

	public SourceVersion getSupportedSourceVersion()
	{
		return SourceVersion.latestSupported();
	//    0    0:invokestatic    #687 <Method SourceVersion SourceVersion.latestSupported()>
	//    1    3:areturn         
	}

	public void init(ProcessingEnvironment processingenvironment)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		super.init(processingenvironment);
	//    2    2:aload_0         
	//    3    3:aload_1         
	//    4    4:invokespecial   #691 <Method void AbstractProcessor.init(ProcessingEnvironment)>
		elementUtils = processingenvironment.getElementUtils();
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokeinterface #695 <Method Elements ProcessingEnvironment.getElementUtils()>
	//    8   14:putfield        #326 <Field Elements elementUtils>
		typeUtils = processingenvironment.getTypeUtils();
	//    9   17:aload_0         
	//   10   18:aload_1         
	//   11   19:invokeinterface #699 <Method Types ProcessingEnvironment.getTypeUtils()>
	//   12   24:putfield        #80  <Field Types typeUtils>
		filer = processingenvironment.getFiler();
	//   13   27:aload_0         
	//   14   28:aload_1         
	//   15   29:invokeinterface #703 <Method Filer ProcessingEnvironment.getFiler()>
	//   16   34:putfield        #705 <Field Filer filer>
		this;
	//   17   37:aload_0         
		JVM INSTR monitorexit ;
	//   18   38:monitorexit     
		return;
	//   19   39:return          
		processingenvironment;
	//   20   40:astore_1        
	//*  21   41:aload_0         
		throw processingenvironment;
	//   22   42:monitorexit     
	//   23   43:aload_1         
	//   24   44:athrow          
	}

	public boolean process(Set set, RoundEnvironment roundenvironment)
	{
		for(set = ((Set) (findAndParseTargets(roundenvironment).entrySet().iterator())); ((Iterator) (set)).hasNext();)
	//*   0    0:aload_0         
	//*   1    1:aload_2         
	//*   2    2:invokespecial   #711 <Method Map findAndParseTargets(RoundEnvironment)>
	//*   3    5:invokeinterface #219 <Method Set Map.entrySet()>
	//*   4   10:invokeinterface #145 <Method Iterator Set.iterator()>
	//*   5   15:astore_1        
	//*   6   16:aload_1         
	//*   7   17:invokeinterface #151 <Method boolean Iterator.hasNext()>
	//*   8   22:ifeq            132
		{
			Object obj = ((Object) ((java.util.Map.Entry)((Iterator) (set)).next()));
	//    9   25:aload_1         
	//   10   26:invokeinterface #155 <Method Object Iterator.next()>
	//   11   31:checkcast       #221 <Class java.util.Map$Entry>
	//   12   34:astore_3        
			roundenvironment = ((RoundEnvironment) ((TypeElement)((java.util.Map.Entry) (obj)).getKey()));
	//   13   35:aload_3         
	//   14   36:invokeinterface #224 <Method Object java.util.Map$Entry.getKey()>
	//   15   41:checkcast       #226 <Class TypeElement>
	//   16   44:astore_2        
			obj = ((Object) ((ViewInjector)((java.util.Map.Entry) (obj)).getValue()));
	//   17   45:aload_3         
	//   18   46:invokeinterface #233 <Method Object java.util.Map$Entry.getValue()>
	//   19   51:checkcast       #235 <Class ViewInjector>
	//   20   54:astore_3        
			try
			{
				Writer writer = filer.createSourceFile(((CharSequence) (((ViewInjector) (obj)).getFqcn())), new Element[] {
					roundenvironment
				}).openWriter();
	//   21   55:aload_0         
	//   22   56:getfield        #705 <Field Filer filer>
	//   23   59:aload_3         
	//   24   60:invokevirtual   #714 <Method String ViewInjector.getFqcn()>
	//   25   63:iconst_1        
	//   26   64:anewarray       Element[]
	//   27   67:dup             
	//   28   68:iconst_0        
	//   29   69:aload_2         
	//   30   70:aastore         
	//   31   71:invokeinterface #720 <Method JavaFileObject Filer.createSourceFile(CharSequence, Element[])>
	//   32   76:invokeinterface #726 <Method Writer JavaFileObject.openWriter()>
	//   33   81:astore          4
				writer.write(((ViewInjector) (obj)).brewJava());
	//   34   83:aload           4
	//   35   85:aload_3         
	//   36   86:invokevirtual   #729 <Method String ViewInjector.brewJava()>
	//   37   89:invokevirtual   #734 <Method void Writer.write(String)>
				writer.flush();
	//   38   92:aload           4
	//   39   94:invokevirtual   #737 <Method void Writer.flush()>
				writer.close();
	//   40   97:aload           4
	//   41   99:invokevirtual   #740 <Method void Writer.close()>
			}
	//*  42  102:goto            16
			catch(IOException ioexception)
	//*  43  105:astore_3        
			{
				error(((Element) (roundenvironment)), "Unable to write injector for type %s: %s", new Object[] {
					roundenvironment, ioexception.getMessage()
				});
	//   44  106:aload_0         
	//   45  107:aload_2         
	//   46  108:ldc2            #742 <String "Unable to write injector for type %s: %s">
	//   47  111:iconst_2        
	//   48  112:anewarray       Object[]
	//   49  115:dup             
	//   50  116:iconst_0        
	//   51  117:aload_2         
	//   52  118:aastore         
	//   53  119:dup             
	//   54  120:iconst_1        
	//   55  121:aload_3         
	//   56  122:invokevirtual   #745 <Method String IOException.getMessage()>
	//   57  125:aastore         
	//   58  126:invokespecial   #185 <Method void error(Element, String, Object[])>
			}
		}

	//*  59  129:goto            16
		return true;
	//   60  132:iconst_1        
	//   61  133:ireturn         
	}

	static final boolean $assertionsDisabled = false;
	public static final String ANDROID_PREFIX = "android.";
	public static final String JAVA_PREFIX = "java.";
	private static final List LISTENERS = Arrays.asList(((Object []) (new Class[] {
		butterknife/OnCheckedChanged, butterknife/OnClick, butterknife/OnEditorAction, butterknife/OnFocusChange, butterknife/OnItemClick, butterknife/OnItemLongClick, butterknife/OnItemSelected, butterknife/OnLongClick, butterknife/OnPageChange, butterknife/OnTextChanged, 
		butterknife/OnTouch
	})));
	private static final String LIST_TYPE = ((Class) (java/util/List)).getCanonicalName();
	public static final String SUFFIX = "$$ViewInjector";
	static final String VIEW_TYPE = "android.view.View";
	private Elements elementUtils;
	private Filer filer;
	private Types typeUtils;

	static 
	{
	//    0    0:ldc1            #34  <Class List>
	//    1    2:invokevirtual   #40  <Method String Class.getCanonicalName()>
	//    2    5:putstatic       #42  <Field String LIST_TYPE>
	//    3    8:bipush          11
	//    4   10:anewarray       Class[]
	//    5   13:dup             
	//    6   14:iconst_0        
	//    7   15:ldc1            #44  <Class OnCheckedChanged>
	//    8   17:aastore         
	//    9   18:dup             
	//   10   19:iconst_1        
	//   11   20:ldc1            #46  <Class OnClick>
	//   12   22:aastore         
	//   13   23:dup             
	//   14   24:iconst_2        
	//   15   25:ldc1            #48  <Class OnEditorAction>
	//   16   27:aastore         
	//   17   28:dup             
	//   18   29:iconst_3        
	//   19   30:ldc1            #50  <Class OnFocusChange>
	//   20   32:aastore         
	//   21   33:dup             
	//   22   34:iconst_4        
	//   23   35:ldc1            #52  <Class OnItemClick>
	//   24   37:aastore         
	//   25   38:dup             
	//   26   39:iconst_5        
	//   27   40:ldc1            #54  <Class OnItemLongClick>
	//   28   42:aastore         
	//   29   43:dup             
	//   30   44:bipush          6
	//   31   46:ldc1            #56  <Class OnItemSelected>
	//   32   48:aastore         
	//   33   49:dup             
	//   34   50:bipush          7
	//   35   52:ldc1            #58  <Class OnLongClick>
	//   36   54:aastore         
	//   37   55:dup             
	//   38   56:bipush          8
	//   39   58:ldc1            #60  <Class OnPageChange>
	//   40   60:aastore         
	//   41   61:dup             
	//   42   62:bipush          9
	//   43   64:ldc1            #62  <Class OnTextChanged>
	//   44   66:aastore         
	//   45   67:dup             
	//   46   68:bipush          10
	//   47   70:ldc1            #64  <Class OnTouch>
	//   48   72:aastore         
	//   49   73:invokestatic    #70  <Method List Arrays.asList(Object[])>
	//   50   76:putstatic       #72  <Field List LISTENERS>
	//*  51   79:return          
	}
}
