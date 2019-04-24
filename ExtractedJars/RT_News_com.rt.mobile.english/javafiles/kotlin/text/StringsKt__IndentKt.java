// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.text;

import java.util.*;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

// Referenced classes of package kotlin.text:
//			CharsKt, StringsKt

class StringsKt__IndentKt
{

	public StringsKt__IndentKt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void Object()>
	//    2    4:return          
	}

	private static final Function1 getIndentFunction$StringsKt__IndentKt(String s)
	{
		boolean flag;
		if(((CharSequence)s).length() == 0)
	//*   0    0:aload_0         
	//*   1    1:checkcast       #47  <Class CharSequence>
	//*   2    4:invokeinterface #51  <Method int CharSequence.length()>
	//*   3    9:ifne            17
			flag = true;
	//    4   12:iconst_1        
	//    5   13:istore_1        
		else
	//*   6   14:goto            19
			flag = false;
	//    7   17:iconst_0        
	//    8   18:istore_1        
	/* block-local class not found */
	class getIndentFunction._cls1 {}

	/* block-local class not found */
	class getIndentFunction._cls2 {}

		if(flag)
	//*   9   19:iload_1         
	//*  10   20:ifeq            30
			return (Function1)getIndentFunction._cls1.INSTANCE;
	//   11   23:getstatic       #57  <Field StringsKt__IndentKt$getIndentFunction$1 StringsKt__IndentKt$getIndentFunction$1.INSTANCE>
	//   12   26:checkcast       #59  <Class Function1>
	//   13   29:areturn         
		else
			return (Function1)new getIndentFunction._cls2(s);
	//   14   30:new             #61  <Class StringsKt__IndentKt$getIndentFunction$2>
	//   15   33:dup             
	//   16   34:aload_0         
	//   17   35:invokespecial   #64  <Method void StringsKt__IndentKt$getIndentFunction$2(String)>
	//   18   38:checkcast       #59  <Class Function1>
	//   19   41:areturn         
	}

	private static final int indentWidth$StringsKt__IndentKt(String s)
	{
		int i;
label0:
		{
			CharSequence charsequence = (CharSequence)s;
	//    0    0:aload_0         
	//    1    1:checkcast       #47  <Class CharSequence>
	//    2    4:astore_3        
			int j = charsequence.length();
	//    3    5:aload_3         
	//    4    6:invokeinterface #51  <Method int CharSequence.length()>
	//    5   11:istore_2        
			for(i = 0; i < j; i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:iload_2         
	//*  10   16:icmpge          44
				if(CharsKt.isWhitespace(charsequence.charAt(i)) ^ true)
	//*  11   19:aload_3         
	//*  12   20:iload_1         
	//*  13   21:invokeinterface #72  <Method char CharSequence.charAt(int)>
	//*  14   26:invokestatic    #78  <Method boolean CharsKt.isWhitespace(char)>
	//*  15   29:iconst_1        
	//*  16   30:ixor            
	//*  17   31:ifeq            37
					break label0;
	//   18   34:goto            46

	//   19   37:iload_1         
	//   20   38:iconst_1        
	//   21   39:iadd            
	//   22   40:istore_1        
	//*  23   41:goto            14
			i = -1;
	//   24   44:iconst_m1       
	//   25   45:istore_1        
		}
		int k = i;
	//   26   46:iload_1         
	//   27   47:istore_2        
		if(i == -1)
	//*  28   48:iload_1         
	//*  29   49:iconst_m1       
	//*  30   50:icmpne          58
			k = s.length();
	//   31   53:aload_0         
	//   32   54:invokevirtual   #81  <Method int String.length()>
	//   33   57:istore_2        
		return k;
	//   34   58:iload_2         
	//   35   59:ireturn         
	}

	public static final String prependIndent(String s, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #85  <String "receiver$0">
	//    2    3:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "indent");
	//    3    6:aload_1         
	//    4    7:ldc1            #92  <String "indent">
	//    5    9:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
	/* block-local class not found */
	class prependIndent._cls1 {}

		return SequencesKt.joinToString$default(SequencesKt.map(StringsKt.lineSequence((CharSequence)s), (Function1)new prependIndent._cls1(s1)), (CharSequence)"\n", ((CharSequence) (null)), ((CharSequence) (null)), 0, ((CharSequence) (null)), ((Function1) (null)), 62, ((Object) (null)));
	//    6   12:aload_0         
	//    7   13:checkcast       #47  <Class CharSequence>
	//    8   16:invokestatic    #97  <Method kotlin.sequences.Sequence StringsKt.lineSequence(CharSequence)>
	//    9   19:new             #99  <Class StringsKt__IndentKt$prependIndent$1>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokespecial   #100 <Method void StringsKt__IndentKt$prependIndent$1(String)>
	//   13   27:checkcast       #59  <Class Function1>
	//   14   30:invokestatic    #106 <Method kotlin.sequences.Sequence SequencesKt.map(kotlin.sequences.Sequence, Function1)>
	//   15   33:ldc1            #108 <String "\n">
	//   16   35:checkcast       #47  <Class CharSequence>
	//   17   38:aconst_null     
	//   18   39:aconst_null     
	//   19   40:iconst_0        
	//   20   41:aconst_null     
	//   21   42:aconst_null     
	//   22   43:bipush          62
	//   23   45:aconst_null     
	//   24   46:invokestatic    #112 <Method String SequencesKt.joinToString$default(kotlin.sequences.Sequence, CharSequence, CharSequence, CharSequence, int, CharSequence, Function1, int, Object)>
	//   25   49:areturn         
	}

	public static String prependIndent$default(String s, String s1, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            9
			s1 = "    ";
	//    4    6:ldc1            #117 <String "    ">
	//    5    8:astore_1        
		return StringsKt.prependIndent(s, s1);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:invokestatic    #119 <Method String StringsKt.prependIndent(String, String)>
	//    9   14:areturn         
	}

	private static final String reindent$StringsKt__IndentKt(List list, int i, Function1 function1, Function1 function1_1)
	{
		int k = CollectionsKt.getLastIndex(list);
	//    0    0:aload_0         
	//    1    1:invokestatic    #126 <Method int CollectionsKt.getLastIndex(List)>
	//    2    4:istore          5
		list = ((List) ((Iterable)list));
	//    3    6:aload_0         
	//    4    7:checkcast       #128 <Class Iterable>
	//    5   10:astore_0        
		Collection collection = (Collection)new ArrayList();
	//    6   11:new             #130 <Class ArrayList>
	//    7   14:dup             
	//    8   15:invokespecial   #131 <Method void ArrayList()>
	//    9   18:checkcast       #133 <Class Collection>
	//   10   21:astore          8
		Iterator iterator = ((Iterable) (list)).iterator();
	//   11   23:aload_0         
	//   12   24:invokeinterface #137 <Method Iterator Iterable.iterator()>
	//   13   29:astore          9
		for(int j = 0; iterator.hasNext(); j++)
	//*  14   31:iconst_0        
	//*  15   32:istore          4
	//*  16   34:aload           9
	//*  17   36:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  18   41:ifeq            186
		{
			list = ((List) (iterator.next()));
	//   19   44:aload           9
	//   20   46:invokeinterface #147 <Method Object Iterator.next()>
	//   21   51:astore_0        
			if(j < 0)
	//*  22   52:iload           4
	//*  23   54:ifge            85
				if(PlatformImplementationsKt.apiVersionIsAtLeast(1, 3, 0))
	//*  24   57:iconst_1        
	//*  25   58:iconst_3        
	//*  26   59:iconst_0        
	//*  27   60:invokestatic    #153 <Method boolean PlatformImplementationsKt.apiVersionIsAtLeast(int, int, int)>
	//*  28   63:ifeq            72
					CollectionsKt.throwIndexOverflow();
	//   29   66:invokestatic    #156 <Method void CollectionsKt.throwIndexOverflow()>
				else
	//*  30   69:goto            85
					throw (Throwable)new ArithmeticException("Index overflow has happened.");
	//   31   72:new             #158 <Class ArithmeticException>
	//   32   75:dup             
	//   33   76:ldc1            #160 <String "Index overflow has happened.">
	//   34   78:invokespecial   #161 <Method void ArithmeticException(String)>
	//   35   81:checkcast       #163 <Class Throwable>
	//   36   84:athrow          
			String s = (String)list;
	//   37   85:aload_0         
	//   38   86:checkcast       #80  <Class String>
	//   39   89:astore          6
			if((j == 0 || j == k) && StringsKt.isBlank((CharSequence)s))
	//*  40   91:iload           4
	//*  41   93:ifeq            103
	//*  42   96:iload           4
	//*  43   98:iload           5
	//*  44  100:icmpne          119
	//*  45  103:aload           6
	//*  46  105:checkcast       #47  <Class CharSequence>
	//*  47  108:invokestatic    #167 <Method boolean StringsKt.isBlank(CharSequence)>
	//*  48  111:ifeq            119
			{
				list = null;
	//   49  114:aconst_null     
	//   50  115:astore_0        
			} else
	//*  51  116:goto            164
			{
				String s1 = (String)function1_1.invoke(((Object) (s)));
	//   52  119:aload_3         
	//   53  120:aload           6
	//   54  122:invokeinterface #171 <Method Object Function1.invoke(Object)>
	//   55  127:checkcast       #80  <Class String>
	//   56  130:astore          7
				list = ((List) (s));
	//   57  132:aload           6
	//   58  134:astore_0        
				if(s1 != null)
	//*  59  135:aload           7
	//*  60  137:ifnull          164
				{
					s1 = (String)function1.invoke(((Object) (s1)));
	//   61  140:aload_2         
	//   62  141:aload           7
	//   63  143:invokeinterface #171 <Method Object Function1.invoke(Object)>
	//   64  148:checkcast       #80  <Class String>
	//   65  151:astore          7
					list = ((List) (s));
	//   66  153:aload           6
	//   67  155:astore_0        
					if(s1 != null)
	//*  68  156:aload           7
	//*  69  158:ifnull          164
						list = ((List) (s1));
	//   70  161:aload           7
	//   71  163:astore_0        
				}
			}
			if(list != null)
	//*  72  164:aload_0         
	//*  73  165:ifnull          177
				collection.add(((Object) (list)));
	//   74  168:aload           8
	//   75  170:aload_0         
	//   76  171:invokeinterface #175 <Method boolean Collection.add(Object)>
	//   77  176:pop             
		}

	//   78  177:iload           4
	//   79  179:iconst_1        
	//   80  180:iadd            
	//   81  181:istore          4
	//*  82  183:goto            34
		list = ((List) (((StringBuilder)CollectionsKt.joinTo$default((Iterable)(List)collection, (Appendable)new StringBuilder(i), (CharSequence)"\n", ((CharSequence) (null)), ((CharSequence) (null)), 0, ((CharSequence) (null)), ((Function1) (null)), 124, ((Object) (null)))).toString()));
	//   83  186:aload           8
	//   84  188:checkcast       #177 <Class List>
	//   85  191:checkcast       #128 <Class Iterable>
	//   86  194:new             #179 <Class StringBuilder>
	//   87  197:dup             
	//   88  198:iload_1         
	//   89  199:invokespecial   #182 <Method void StringBuilder(int)>
	//   90  202:checkcast       #184 <Class Appendable>
	//   91  205:ldc1            #108 <String "\n">
	//   92  207:checkcast       #47  <Class CharSequence>
	//   93  210:aconst_null     
	//   94  211:aconst_null     
	//   95  212:iconst_0        
	//   96  213:aconst_null     
	//   97  214:aconst_null     
	//   98  215:bipush          124
	//   99  217:aconst_null     
	//  100  218:invokestatic    #188 <Method Appendable CollectionsKt.joinTo$default(Iterable, Appendable, CharSequence, CharSequence, CharSequence, int, CharSequence, Function1, int, Object)>
	//  101  221:checkcast       #179 <Class StringBuilder>
	//  102  224:invokevirtual   #192 <Method String StringBuilder.toString()>
	//  103  227:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (list)), "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
	//  104  228:aload_0         
	//  105  229:ldc1            #194 <String "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()">
	//  106  231:invokestatic    #197 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return ((String) (list));
	//  107  234:aload_0         
	//  108  235:areturn         
	}

	public static final String replaceIndent(String s, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #85  <String "receiver$0">
	//    2    3:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "newIndent");
	//    3    6:aload_1         
	//    4    7:ldc1            #199 <String "newIndent">
	//    5    9:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Object obj = ((Object) (StringsKt.lines((CharSequence)s)));
	//    6   12:aload_0         
	//    7   13:checkcast       #47  <Class CharSequence>
	//    8   16:invokestatic    #203 <Method List StringsKt.lines(CharSequence)>
	//    9   19:astore          9
		Iterable iterable = (Iterable)obj;
	//   10   21:aload           9
	//   11   23:checkcast       #128 <Class Iterable>
	//   12   26:astore          8
		Object obj1 = ((Object) ((Collection)new ArrayList()));
	//   13   28:new             #130 <Class ArrayList>
	//   14   31:dup             
	//   15   32:invokespecial   #131 <Method void ArrayList()>
	//   16   35:checkcast       #133 <Class Collection>
	//   17   38:astore          10
		Object obj2 = ((Object) (iterable.iterator()));
	//   18   40:aload           8
	//   19   42:invokeinterface #137 <Method Iterator Iterable.iterator()>
	//   20   47:astore          11
		do
		{
			if(!((Iterator) (obj2)).hasNext())
				break;
	//   21   49:aload           11
	//   22   51:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   23   56:ifeq            97
			Object obj3 = ((Iterator) (obj2)).next();
	//   24   59:aload           11
	//   25   61:invokeinterface #147 <Method Object Iterator.next()>
	//   26   66:astore          12
			if(StringsKt.isBlank((CharSequence)(String)obj3) ^ true)
	//*  27   68:aload           12
	//*  28   70:checkcast       #80  <Class String>
	//*  29   73:checkcast       #47  <Class CharSequence>
	//*  30   76:invokestatic    #167 <Method boolean StringsKt.isBlank(CharSequence)>
	//*  31   79:iconst_1        
	//*  32   80:ixor            
	//*  33   81:ifeq            49
				((Collection) (obj1)).add(obj3);
	//   34   84:aload           10
	//   35   86:aload           12
	//   36   88:invokeinterface #175 <Method boolean Collection.add(Object)>
	//   37   93:pop             
		} while(true);
	//   38   94:goto            49
		obj2 = ((Object) ((Iterable)(List)obj1));
	//   39   97:aload           10
	//   40   99:checkcast       #177 <Class List>
	//   41  102:checkcast       #128 <Class Iterable>
	//   42  105:astore          11
		obj1 = ((Object) ((Collection)new ArrayList(CollectionsKt.collectionSizeOrDefault(((Iterable) (obj2)), 10))));
	//   43  107:new             #130 <Class ArrayList>
	//   44  110:dup             
	//   45  111:aload           11
	//   46  113:bipush          10
	//   47  115:invokestatic    #207 <Method int CollectionsKt.collectionSizeOrDefault(Iterable, int)>
	//   48  118:invokespecial   #208 <Method void ArrayList(int)>
	//   49  121:checkcast       #133 <Class Collection>
	//   50  124:astore          10
		for(obj2 = ((Object) (((Iterable) (obj2)).iterator())); ((Iterator) (obj2)).hasNext(); ((Collection) (obj1)).add(((Object) (Integer.valueOf(indentWidth$StringsKt__IndentKt((String)((Iterator) (obj2)).next()))))));
	//   51  126:aload           11
	//   52  128:invokeinterface #137 <Method Iterator Iterable.iterator()>
	//   53  133:astore          11
	//   54  135:aload           11
	//   55  137:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   56  142:ifeq            172
	//   57  145:aload           10
	//   58  147:aload           11
	//   59  149:invokeinterface #147 <Method Object Iterator.next()>
	//   60  154:checkcast       #80  <Class String>
	//   61  157:invokestatic    #210 <Method int indentWidth$StringsKt__IndentKt(String)>
	//   62  160:invokestatic    #216 <Method Integer Integer.valueOf(int)>
	//   63  163:invokeinterface #175 <Method boolean Collection.add(Object)>
	//   64  168:pop             
	//*  65  169:goto            135
		obj1 = ((Object) ((Integer)CollectionsKt.min((Iterable)(List)obj1)));
	//   66  172:aload           10
	//   67  174:checkcast       #177 <Class List>
	//   68  177:checkcast       #128 <Class Iterable>
	//   69  180:invokestatic    #220 <Method Comparable CollectionsKt.min(Iterable)>
	//   70  183:checkcast       #212 <Class Integer>
	//   71  186:astore          10
		int j = 0;
	//   72  188:iconst_0        
	//   73  189:istore_3        
		int i;
		if(obj1 != null)
	//*  74  190:aload           10
	//*  75  192:ifnull          204
			i = ((Integer) (obj1)).intValue();
	//   76  195:aload           10
	//   77  197:invokevirtual   #223 <Method int Integer.intValue()>
	//   78  200:istore_2        
		else
	//*  79  201:goto            206
			i = 0;
	//   80  204:iconst_0        
	//   81  205:istore_2        
		int k = s.length();
	//   82  206:aload_0         
	//   83  207:invokevirtual   #81  <Method int String.length()>
	//   84  210:istore          4
		int l = s1.length();
	//   85  212:aload_1         
	//   86  213:invokevirtual   #81  <Method int String.length()>
	//   87  216:istore          5
		int i1 = ((List) (obj)).size();
	//   88  218:aload           9
	//   89  220:invokeinterface #226 <Method int List.size()>
	//   90  225:istore          6
		obj1 = ((Object) (getIndentFunction$StringsKt__IndentKt(s1)));
	//   91  227:aload_1         
	//   92  228:invokestatic    #228 <Method Function1 getIndentFunction$StringsKt__IndentKt(String)>
	//   93  231:astore          10
		int j1 = CollectionsKt.getLastIndex(((List) (obj)));
	//   94  233:aload           9
	//   95  235:invokestatic    #126 <Method int CollectionsKt.getLastIndex(List)>
	//   96  238:istore          7
		obj = ((Object) ((Collection)new ArrayList()));
	//   97  240:new             #130 <Class ArrayList>
	//   98  243:dup             
	//   99  244:invokespecial   #131 <Method void ArrayList()>
	//  100  247:checkcast       #133 <Class Collection>
	//  101  250:astore          9
		for(Iterator iterator = iterable.iterator(); iterator.hasNext();)
	//* 102  252:aload           8
	//* 103  254:invokeinterface #137 <Method Iterator Iterable.iterator()>
	//* 104  259:astore          11
	//* 105  261:aload           11
	//* 106  263:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//* 107  268:ifeq            374
		{
			s = ((String) (iterator.next()));
	//  108  271:aload           11
	//  109  273:invokeinterface #147 <Method Object Iterator.next()>
	//  110  278:astore_0        
			if(j < 0)
	//* 111  279:iload_3         
	//* 112  280:ifge            286
				CollectionsKt.throwIndexOverflow();
	//  113  283:invokestatic    #156 <Method void CollectionsKt.throwIndexOverflow()>
			s1 = (String)s;
	//  114  286:aload_0         
	//  115  287:checkcast       #80  <Class String>
	//  116  290:astore_1        
			if((j == 0 || j == j1) && StringsKt.isBlank((CharSequence)s1))
	//* 117  291:iload_3         
	//* 118  292:ifeq            301
	//* 119  295:iload_3         
	//* 120  296:iload           7
	//* 121  298:icmpne          316
	//* 122  301:aload_1         
	//* 123  302:checkcast       #47  <Class CharSequence>
	//* 124  305:invokestatic    #167 <Method boolean StringsKt.isBlank(CharSequence)>
	//* 125  308:ifeq            316
			{
				s = null;
	//  126  311:aconst_null     
	//  127  312:astore_0        
			} else
	//* 128  313:goto            354
			{
				String s2 = StringsKt.drop(s1, i);
	//  129  316:aload_1         
	//  130  317:iload_2         
	//  131  318:invokestatic    #232 <Method String StringsKt.drop(String, int)>
	//  132  321:astore          8
				s = s1;
	//  133  323:aload_1         
	//  134  324:astore_0        
				if(s2 != null)
	//* 135  325:aload           8
	//* 136  327:ifnull          354
				{
					s2 = (String)((Function1) (obj1)).invoke(((Object) (s2)));
	//  137  330:aload           10
	//  138  332:aload           8
	//  139  334:invokeinterface #171 <Method Object Function1.invoke(Object)>
	//  140  339:checkcast       #80  <Class String>
	//  141  342:astore          8
					s = s1;
	//  142  344:aload_1         
	//  143  345:astore_0        
					if(s2 != null)
	//* 144  346:aload           8
	//* 145  348:ifnull          354
						s = s2;
	//  146  351:aload           8
	//  147  353:astore_0        
				}
			}
			if(s != null)
	//* 148  354:aload_0         
	//* 149  355:ifnull          367
				((Collection) (obj)).add(((Object) (s)));
	//  150  358:aload           9
	//  151  360:aload_0         
	//  152  361:invokeinterface #175 <Method boolean Collection.add(Object)>
	//  153  366:pop             
			j++;
	//  154  367:iload_3         
	//  155  368:iconst_1        
	//  156  369:iadd            
	//  157  370:istore_3        
		}

	//* 158  371:goto            261
		s = ((StringBuilder)CollectionsKt.joinTo$default((Iterable)(List)obj, (Appendable)new StringBuilder(k + l * i1), (CharSequence)"\n", ((CharSequence) (null)), ((CharSequence) (null)), 0, ((CharSequence) (null)), ((Function1) (null)), 124, ((Object) (null)))).toString();
	//  159  374:aload           9
	//  160  376:checkcast       #177 <Class List>
	//  161  379:checkcast       #128 <Class Iterable>
	//  162  382:new             #179 <Class StringBuilder>
	//  163  385:dup             
	//  164  386:iload           4
	//  165  388:iload           5
	//  166  390:iload           6
	//  167  392:imul            
	//  168  393:iadd            
	//  169  394:invokespecial   #182 <Method void StringBuilder(int)>
	//  170  397:checkcast       #184 <Class Appendable>
	//  171  400:ldc1            #108 <String "\n">
	//  172  402:checkcast       #47  <Class CharSequence>
	//  173  405:aconst_null     
	//  174  406:aconst_null     
	//  175  407:iconst_0        
	//  176  408:aconst_null     
	//  177  409:aconst_null     
	//  178  410:bipush          124
	//  179  412:aconst_null     
	//  180  413:invokestatic    #188 <Method Appendable CollectionsKt.joinTo$default(Iterable, Appendable, CharSequence, CharSequence, CharSequence, int, CharSequence, Function1, int, Object)>
	//  181  416:checkcast       #179 <Class StringBuilder>
	//  182  419:invokevirtual   #192 <Method String StringBuilder.toString()>
	//  183  422:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
	//  184  423:aload_0         
	//  185  424:ldc1            #194 <String "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()">
	//  186  426:invokestatic    #197 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//  187  429:aload_0         
	//  188  430:areturn         
	}

	public static String replaceIndent$default(String s, String s1, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            9
			s1 = "";
	//    4    6:ldc1            #234 <String "">
	//    5    8:astore_1        
		return StringsKt.replaceIndent(s, s1);
	//    6    9:aload_0         
	//    7   10:aload_1         
	//    8   11:invokestatic    #236 <Method String StringsKt.replaceIndent(String, String)>
	//    9   14:areturn         
	}

	public static final String replaceIndentByMargin(String s, String s1, String s2)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #85  <String "receiver$0">
	//    2    3:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "newIndent");
	//    3    6:aload_1         
	//    4    7:ldc1            #199 <String "newIndent">
	//    5    9:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s2)), "marginPrefix");
	//    6   12:aload_2         
	//    7   13:ldc1            #238 <String "marginPrefix">
	//    8   15:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		if(!(StringsKt.isBlank((CharSequence)s2) ^ true))
	//*   9   18:aload_2         
	//*  10   19:checkcast       #47  <Class CharSequence>
	//*  11   22:invokestatic    #167 <Method boolean StringsKt.isBlank(CharSequence)>
	//*  12   25:iconst_1        
	//*  13   26:ixor            
	//*  14   27:ifne            46
			throw (Throwable)new IllegalArgumentException(((Object) ("marginPrefix must be non-blank string.")).toString());
	//   15   30:new             #240 <Class IllegalArgumentException>
	//   16   33:dup             
	//   17   34:ldc1            #242 <String "marginPrefix must be non-blank string.">
	//   18   36:invokevirtual   #243 <Method String Object.toString()>
	//   19   39:invokespecial   #244 <Method void IllegalArgumentException(String)>
	//   20   42:checkcast       #163 <Class Throwable>
	//   21   45:athrow          
		List list = StringsKt.lines((CharSequence)s);
	//   22   46:aload_0         
	//   23   47:checkcast       #47  <Class CharSequence>
	//   24   50:invokestatic    #203 <Method List StringsKt.lines(CharSequence)>
	//   25   53:astore          10
		int k = s.length();
	//   26   55:aload_0         
	//   27   56:invokevirtual   #81  <Method int String.length()>
	//   28   59:istore          5
		int l = s1.length();
	//   29   61:aload_1         
	//   30   62:invokevirtual   #81  <Method int String.length()>
	//   31   65:istore          6
		int i1 = list.size();
	//   32   67:aload           10
	//   33   69:invokeinterface #226 <Method int List.size()>
	//   34   74:istore          7
		Function1 function1 = getIndentFunction$StringsKt__IndentKt(s1);
	//   35   76:aload_1         
	//   36   77:invokestatic    #228 <Method Function1 getIndentFunction$StringsKt__IndentKt(String)>
	//   37   80:astore          11
		int j1 = CollectionsKt.getLastIndex(list);
	//   38   82:aload           10
	//   39   84:invokestatic    #126 <Method int CollectionsKt.getLastIndex(List)>
	//   40   87:istore          8
		s = ((String) ((Iterable)list));
	//   41   89:aload           10
	//   42   91:checkcast       #128 <Class Iterable>
	//   43   94:astore_0        
		Collection collection = (Collection)new ArrayList();
	//   44   95:new             #130 <Class ArrayList>
	//   45   98:dup             
	//   46   99:invokespecial   #131 <Method void ArrayList()>
	//   47  102:checkcast       #133 <Class Collection>
	//   48  105:astore          12
		Iterator iterator = ((Iterable) (s)).iterator();
	//   49  107:aload_0         
	//   50  108:invokeinterface #137 <Method Iterator Iterable.iterator()>
	//   51  113:astore          13
		for(int j = 0; iterator.hasNext(); j++)
	//*  52  115:iconst_0        
	//*  53  116:istore          4
	//*  54  118:aload           13
	//*  55  120:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  56  125:ifeq            338
		{
label0:
			{
				int i;
				String s3;
label1:
				{
					s = ((String) (iterator.next()));
	//   57  128:aload           13
	//   58  130:invokeinterface #147 <Method Object Iterator.next()>
	//   59  135:astore_0        
					if(j < 0)
	//*  60  136:iload           4
	//*  61  138:ifge            144
						CollectionsKt.throwIndexOverflow();
	//   62  141:invokestatic    #156 <Method void CollectionsKt.throwIndexOverflow()>
					s3 = (String)s;
	//   63  144:aload_0         
	//   64  145:checkcast       #80  <Class String>
	//   65  148:astore          10
					s1 = null;
	//   66  150:aconst_null     
	//   67  151:astore_1        
					if((j == 0 || j == j1) && StringsKt.isBlank((CharSequence)s3))
	//*  68  152:iload           4
	//*  69  154:ifeq            164
	//*  70  157:iload           4
	//*  71  159:iload           8
	//*  72  161:icmpne          180
	//*  73  164:aload           10
	//*  74  166:checkcast       #47  <Class CharSequence>
	//*  75  169:invokestatic    #167 <Method boolean StringsKt.isBlank(CharSequence)>
	//*  76  172:ifeq            180
					{
						s = null;
	//   77  175:aconst_null     
	//   78  176:astore_0        
						break label0;
	//   79  177:goto            316
					}
					s = ((String) ((CharSequence)s3));
	//   80  180:aload           10
	//   81  182:checkcast       #47  <Class CharSequence>
	//   82  185:astore_0        
					int k1 = ((CharSequence) (s)).length();
	//   83  186:aload_0         
	//   84  187:invokeinterface #51  <Method int CharSequence.length()>
	//   85  192:istore          9
					for(i = 0; i < k1; i++)
	//*  86  194:iconst_0        
	//*  87  195:istore_3        
	//*  88  196:iload_3         
	//*  89  197:iload           9
	//*  90  199:icmpge          227
						if(CharsKt.isWhitespace(((CharSequence) (s)).charAt(i)) ^ true)
	//*  91  202:aload_0         
	//*  92  203:iload_3         
	//*  93  204:invokeinterface #72  <Method char CharSequence.charAt(int)>
	//*  94  209:invokestatic    #78  <Method boolean CharsKt.isWhitespace(char)>
	//*  95  212:iconst_1        
	//*  96  213:ixor            
	//*  97  214:ifeq            220
							break label1;
	//   98  217:goto            229

	//   99  220:iload_3         
	//  100  221:iconst_1        
	//  101  222:iadd            
	//  102  223:istore_3        
	//* 103  224:goto            196
					i = -1;
	//  104  227:iconst_m1       
	//  105  228:istore_3        
				}
				if(i != -1 && StringsKt.startsWith$default(s3, s2, i, false, 4, ((Object) (null))))
	//* 106  229:iload_3         
	//* 107  230:iconst_m1       
	//* 108  231:icmpne          237
	//* 109  234:goto            288
	//* 110  237:aload           10
	//* 111  239:aload_2         
	//* 112  240:iload_3         
	//* 113  241:iconst_0        
	//* 114  242:iconst_4        
	//* 115  243:aconst_null     
	//* 116  244:invokestatic    #248 <Method boolean StringsKt.startsWith$default(String, String, int, boolean, int, Object)>
	//* 117  247:ifeq            288
				{
					int l1 = s2.length();
	//  118  250:aload_2         
	//  119  251:invokevirtual   #81  <Method int String.length()>
	//  120  254:istore          9
					if(s3 == null)
	//* 121  256:aload           10
	//* 122  258:ifnonnull       271
						throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
	//  123  261:new             #250 <Class TypeCastException>
	//  124  264:dup             
	//  125  265:ldc1            #252 <String "null cannot be cast to non-null type java.lang.String">
	//  126  267:invokespecial   #253 <Method void TypeCastException(String)>
	//  127  270:athrow          
					s1 = s3.substring(i + l1);
	//  128  271:aload           10
	//  129  273:iload_3         
	//  130  274:iload           9
	//  131  276:iadd            
	//  132  277:invokevirtual   #257 <Method String String.substring(int)>
	//  133  280:astore_1        
					Intrinsics.checkExpressionValueIsNotNull(((Object) (s1)), "(this as java.lang.String).substring(startIndex)");
	//  134  281:aload_1         
	//  135  282:ldc2            #259 <String "(this as java.lang.String).substring(startIndex)">
	//  136  285:invokestatic    #197 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
				}
				s = s3;
	//  137  288:aload           10
	//  138  290:astore_0        
				if(s1 != null)
	//* 139  291:aload_1         
	//* 140  292:ifnull          316
				{
					s1 = (String)function1.invoke(((Object) (s1)));
	//  141  295:aload           11
	//  142  297:aload_1         
	//  143  298:invokeinterface #171 <Method Object Function1.invoke(Object)>
	//  144  303:checkcast       #80  <Class String>
	//  145  306:astore_1        
					s = s3;
	//  146  307:aload           10
	//  147  309:astore_0        
					if(s1 != null)
	//* 148  310:aload_1         
	//* 149  311:ifnull          316
						s = s1;
	//  150  314:aload_1         
	//  151  315:astore_0        
				}
			}
			if(s != null)
	//* 152  316:aload_0         
	//* 153  317:ifnull          329
				collection.add(((Object) (s)));
	//  154  320:aload           12
	//  155  322:aload_0         
	//  156  323:invokeinterface #175 <Method boolean Collection.add(Object)>
	//  157  328:pop             
		}

	//  158  329:iload           4
	//  159  331:iconst_1        
	//  160  332:iadd            
	//  161  333:istore          4
	//* 162  335:goto            118
		s = ((StringBuilder)CollectionsKt.joinTo$default((Iterable)(List)collection, (Appendable)new StringBuilder(k + l * i1), (CharSequence)"\n", ((CharSequence) (null)), ((CharSequence) (null)), 0, ((CharSequence) (null)), ((Function1) (null)), 124, ((Object) (null)))).toString();
	//  163  338:aload           12
	//  164  340:checkcast       #177 <Class List>
	//  165  343:checkcast       #128 <Class Iterable>
	//  166  346:new             #179 <Class StringBuilder>
	//  167  349:dup             
	//  168  350:iload           5
	//  169  352:iload           6
	//  170  354:iload           7
	//  171  356:imul            
	//  172  357:iadd            
	//  173  358:invokespecial   #182 <Method void StringBuilder(int)>
	//  174  361:checkcast       #184 <Class Appendable>
	//  175  364:ldc1            #108 <String "\n">
	//  176  366:checkcast       #47  <Class CharSequence>
	//  177  369:aconst_null     
	//  178  370:aconst_null     
	//  179  371:iconst_0        
	//  180  372:aconst_null     
	//  181  373:aconst_null     
	//  182  374:bipush          124
	//  183  376:aconst_null     
	//  184  377:invokestatic    #188 <Method Appendable CollectionsKt.joinTo$default(Iterable, Appendable, CharSequence, CharSequence, CharSequence, int, CharSequence, Function1, int, Object)>
	//  185  380:checkcast       #179 <Class StringBuilder>
	//  186  383:invokevirtual   #192 <Method String StringBuilder.toString()>
	//  187  386:astore_0        
		Intrinsics.checkExpressionValueIsNotNull(((Object) (s)), "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()");
	//  188  387:aload_0         
	//  189  388:ldc1            #194 <String "mapIndexedNotNull { inde\u2026\"\\n\")\n        .toString()">
	//  190  390:invokestatic    #197 <Method void Intrinsics.checkExpressionValueIsNotNull(Object, String)>
		return s;
	//  191  393:aload_0         
	//  192  394:areturn         
	}

	public static String replaceIndentByMargin$default(String s, String s1, String s2, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_3         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            9
			s1 = "";
	//    4    6:ldc1            #234 <String "">
	//    5    8:astore_1        
		if((i & 2) != 0)
	//*   6    9:iload_3         
	//*   7   10:iconst_2        
	//*   8   11:iand            
	//*   9   12:ifeq            19
			s2 = "|";
	//   10   15:ldc2            #263 <String "|">
	//   11   18:astore_2        
		return StringsKt.replaceIndentByMargin(s, s1, s2);
	//   12   19:aload_0         
	//   13   20:aload_1         
	//   14   21:aload_2         
	//   15   22:invokestatic    #265 <Method String StringsKt.replaceIndentByMargin(String, String, String)>
	//   16   25:areturn         
	}

	public static final String trimIndent(String s)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #85  <String "receiver$0">
	//    2    3:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.replaceIndent(s, "");
	//    3    6:aload_0         
	//    4    7:ldc1            #234 <String "">
	//    5    9:invokestatic    #236 <Method String StringsKt.replaceIndent(String, String)>
	//    6   12:areturn         
	}

	public static final String trimMargin(String s, String s1)
	{
		Intrinsics.checkParameterIsNotNull(((Object) (s)), "receiver$0");
	//    0    0:aload_0         
	//    1    1:ldc1            #85  <String "receiver$0">
	//    2    3:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		Intrinsics.checkParameterIsNotNull(((Object) (s1)), "marginPrefix");
	//    3    6:aload_1         
	//    4    7:ldc1            #238 <String "marginPrefix">
	//    5    9:invokestatic    #91  <Method void Intrinsics.checkParameterIsNotNull(Object, String)>
		return StringsKt.replaceIndentByMargin(s, "", s1);
	//    6   12:aload_0         
	//    7   13:ldc1            #234 <String "">
	//    8   15:aload_1         
	//    9   16:invokestatic    #265 <Method String StringsKt.replaceIndentByMargin(String, String, String)>
	//   10   19:areturn         
	}

	public static String trimMargin$default(String s, String s1, int i, Object obj)
	{
		if((i & 1) != 0)
	//*   0    0:iload_2         
	//*   1    1:iconst_1        
	//*   2    2:iand            
	//*   3    3:ifeq            10
			s1 = "|";
	//    4    6:ldc2            #263 <String "|">
	//    5    9:astore_1        
		return StringsKt.trimMargin(s, s1);
	//    6   10:aload_0         
	//    7   11:aload_1         
	//    8   12:invokestatic    #269 <Method String StringsKt.trimMargin(String, String)>
	//    9   15:areturn         
	}
}
