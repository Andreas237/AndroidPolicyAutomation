// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package kotlin.annotation;


public final class AnnotationTarget extends Enum
{

	protected AnnotationTarget(String s, int i)
	{
		super(s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #94  <Method void Enum(String, int)>
	//    4    6:return          
	}

	public static AnnotationTarget valueOf(String s)
	{
		return (AnnotationTarget)Enum.valueOf(kotlin/annotation/AnnotationTarget, s);
	//    0    0:ldc1            #2   <Class AnnotationTarget>
	//    1    2:aload_0         
	//    2    3:invokestatic    #100 <Method Enum Enum.valueOf(Class, String)>
	//    3    6:checkcast       #2   <Class AnnotationTarget>
	//    4    9:areturn         
	}

	public static AnnotationTarget[] values()
	{
		return (AnnotationTarget[])((AnnotationTarget []) ($VALUES)).clone();
	//    0    0:getstatic       #92  <Field AnnotationTarget[] $VALUES>
	//    1    3:invokevirtual   #107 <Method Object _5B_Lkotlin.annotation.AnnotationTarget_3B_.clone()>
	//    2    6:checkcast       #103 <Class AnnotationTarget[]>
	//    3    9:areturn         
	}

	private static final AnnotationTarget $VALUES[];
	public static final AnnotationTarget ANNOTATION_CLASS;
	public static final AnnotationTarget CLASS;
	public static final AnnotationTarget CONSTRUCTOR;
	public static final AnnotationTarget EXPRESSION;
	public static final AnnotationTarget FIELD;
	public static final AnnotationTarget FILE;
	public static final AnnotationTarget FUNCTION;
	public static final AnnotationTarget LOCAL_VARIABLE;
	public static final AnnotationTarget PROPERTY;
	public static final AnnotationTarget PROPERTY_GETTER;
	public static final AnnotationTarget PROPERTY_SETTER;
	public static final AnnotationTarget TYPE;
	public static final AnnotationTarget TYPEALIAS;
	public static final AnnotationTarget TYPE_PARAMETER;
	public static final AnnotationTarget VALUE_PARAMETER;

	static 
	{
		AnnotationTarget annotationtarget = new AnnotationTarget("CLASS", 0);
	//    0    0:new             #2   <Class AnnotationTarget>
	//    1    3:dup             
	//    2    4:ldc1            #43  <String "CLASS">
	//    3    6:iconst_0        
	//    4    7:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//    5   10:astore_0        
		CLASS = annotationtarget;
	//    6   11:aload_0         
	//    7   12:putstatic       #48  <Field AnnotationTarget CLASS>
		AnnotationTarget annotationtarget1 = new AnnotationTarget("ANNOTATION_CLASS", 1);
	//    8   15:new             #2   <Class AnnotationTarget>
	//    9   18:dup             
	//   10   19:ldc1            #49  <String "ANNOTATION_CLASS">
	//   11   21:iconst_1        
	//   12   22:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   13   25:astore_1        
		ANNOTATION_CLASS = annotationtarget1;
	//   14   26:aload_1         
	//   15   27:putstatic       #51  <Field AnnotationTarget ANNOTATION_CLASS>
		AnnotationTarget annotationtarget2 = new AnnotationTarget("TYPE_PARAMETER", 2);
	//   16   30:new             #2   <Class AnnotationTarget>
	//   17   33:dup             
	//   18   34:ldc1            #52  <String "TYPE_PARAMETER">
	//   19   36:iconst_2        
	//   20   37:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   21   40:astore_2        
		TYPE_PARAMETER = annotationtarget2;
	//   22   41:aload_2         
	//   23   42:putstatic       #54  <Field AnnotationTarget TYPE_PARAMETER>
		AnnotationTarget annotationtarget3 = new AnnotationTarget("PROPERTY", 3);
	//   24   45:new             #2   <Class AnnotationTarget>
	//   25   48:dup             
	//   26   49:ldc1            #55  <String "PROPERTY">
	//   27   51:iconst_3        
	//   28   52:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   29   55:astore_3        
		PROPERTY = annotationtarget3;
	//   30   56:aload_3         
	//   31   57:putstatic       #57  <Field AnnotationTarget PROPERTY>
		AnnotationTarget annotationtarget4 = new AnnotationTarget("FIELD", 4);
	//   32   60:new             #2   <Class AnnotationTarget>
	//   33   63:dup             
	//   34   64:ldc1            #58  <String "FIELD">
	//   35   66:iconst_4        
	//   36   67:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   37   70:astore          4
		FIELD = annotationtarget4;
	//   38   72:aload           4
	//   39   74:putstatic       #60  <Field AnnotationTarget FIELD>
		AnnotationTarget annotationtarget5 = new AnnotationTarget("LOCAL_VARIABLE", 5);
	//   40   77:new             #2   <Class AnnotationTarget>
	//   41   80:dup             
	//   42   81:ldc1            #61  <String "LOCAL_VARIABLE">
	//   43   83:iconst_5        
	//   44   84:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   45   87:astore          5
		LOCAL_VARIABLE = annotationtarget5;
	//   46   89:aload           5
	//   47   91:putstatic       #63  <Field AnnotationTarget LOCAL_VARIABLE>
		AnnotationTarget annotationtarget6 = new AnnotationTarget("VALUE_PARAMETER", 6);
	//   48   94:new             #2   <Class AnnotationTarget>
	//   49   97:dup             
	//   50   98:ldc1            #64  <String "VALUE_PARAMETER">
	//   51  100:bipush          6
	//   52  102:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   53  105:astore          6
		VALUE_PARAMETER = annotationtarget6;
	//   54  107:aload           6
	//   55  109:putstatic       #66  <Field AnnotationTarget VALUE_PARAMETER>
		AnnotationTarget annotationtarget7 = new AnnotationTarget("CONSTRUCTOR", 7);
	//   56  112:new             #2   <Class AnnotationTarget>
	//   57  115:dup             
	//   58  116:ldc1            #67  <String "CONSTRUCTOR">
	//   59  118:bipush          7
	//   60  120:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   61  123:astore          7
		CONSTRUCTOR = annotationtarget7;
	//   62  125:aload           7
	//   63  127:putstatic       #69  <Field AnnotationTarget CONSTRUCTOR>
		AnnotationTarget annotationtarget8 = new AnnotationTarget("FUNCTION", 8);
	//   64  130:new             #2   <Class AnnotationTarget>
	//   65  133:dup             
	//   66  134:ldc1            #70  <String "FUNCTION">
	//   67  136:bipush          8
	//   68  138:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   69  141:astore          8
		FUNCTION = annotationtarget8;
	//   70  143:aload           8
	//   71  145:putstatic       #72  <Field AnnotationTarget FUNCTION>
		AnnotationTarget annotationtarget9 = new AnnotationTarget("PROPERTY_GETTER", 9);
	//   72  148:new             #2   <Class AnnotationTarget>
	//   73  151:dup             
	//   74  152:ldc1            #73  <String "PROPERTY_GETTER">
	//   75  154:bipush          9
	//   76  156:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   77  159:astore          9
		PROPERTY_GETTER = annotationtarget9;
	//   78  161:aload           9
	//   79  163:putstatic       #75  <Field AnnotationTarget PROPERTY_GETTER>
		AnnotationTarget annotationtarget10 = new AnnotationTarget("PROPERTY_SETTER", 10);
	//   80  166:new             #2   <Class AnnotationTarget>
	//   81  169:dup             
	//   82  170:ldc1            #76  <String "PROPERTY_SETTER">
	//   83  172:bipush          10
	//   84  174:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   85  177:astore          10
		PROPERTY_SETTER = annotationtarget10;
	//   86  179:aload           10
	//   87  181:putstatic       #78  <Field AnnotationTarget PROPERTY_SETTER>
		AnnotationTarget annotationtarget11 = new AnnotationTarget("TYPE", 11);
	//   88  184:new             #2   <Class AnnotationTarget>
	//   89  187:dup             
	//   90  188:ldc1            #79  <String "TYPE">
	//   91  190:bipush          11
	//   92  192:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//   93  195:astore          11
		TYPE = annotationtarget11;
	//   94  197:aload           11
	//   95  199:putstatic       #81  <Field AnnotationTarget TYPE>
		AnnotationTarget annotationtarget12 = new AnnotationTarget("EXPRESSION", 12);
	//   96  202:new             #2   <Class AnnotationTarget>
	//   97  205:dup             
	//   98  206:ldc1            #82  <String "EXPRESSION">
	//   99  208:bipush          12
	//  100  210:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//  101  213:astore          12
		EXPRESSION = annotationtarget12;
	//  102  215:aload           12
	//  103  217:putstatic       #84  <Field AnnotationTarget EXPRESSION>
		AnnotationTarget annotationtarget13 = new AnnotationTarget("FILE", 13);
	//  104  220:new             #2   <Class AnnotationTarget>
	//  105  223:dup             
	//  106  224:ldc1            #85  <String "FILE">
	//  107  226:bipush          13
	//  108  228:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//  109  231:astore          13
		FILE = annotationtarget13;
	//  110  233:aload           13
	//  111  235:putstatic       #87  <Field AnnotationTarget FILE>
		AnnotationTarget annotationtarget14 = new AnnotationTarget("TYPEALIAS", 14);
	//  112  238:new             #2   <Class AnnotationTarget>
	//  113  241:dup             
	//  114  242:ldc1            #88  <String "TYPEALIAS">
	//  115  244:bipush          14
	//  116  246:invokespecial   #46  <Method void AnnotationTarget(String, int)>
	//  117  249:astore          14
		TYPEALIAS = annotationtarget14;
	//  118  251:aload           14
	//  119  253:putstatic       #90  <Field AnnotationTarget TYPEALIAS>
		$VALUES = (new AnnotationTarget[] {
			annotationtarget, annotationtarget1, annotationtarget2, annotationtarget3, annotationtarget4, annotationtarget5, annotationtarget6, annotationtarget7, annotationtarget8, annotationtarget9, 
			annotationtarget10, annotationtarget11, annotationtarget12, annotationtarget13, annotationtarget14
		});
	//  120  256:bipush          15
	//  121  258:anewarray       AnnotationTarget[]
	//  122  261:dup             
	//  123  262:iconst_0        
	//  124  263:aload_0         
	//  125  264:aastore         
	//  126  265:dup             
	//  127  266:iconst_1        
	//  128  267:aload_1         
	//  129  268:aastore         
	//  130  269:dup             
	//  131  270:iconst_2        
	//  132  271:aload_2         
	//  133  272:aastore         
	//  134  273:dup             
	//  135  274:iconst_3        
	//  136  275:aload_3         
	//  137  276:aastore         
	//  138  277:dup             
	//  139  278:iconst_4        
	//  140  279:aload           4
	//  141  281:aastore         
	//  142  282:dup             
	//  143  283:iconst_5        
	//  144  284:aload           5
	//  145  286:aastore         
	//  146  287:dup             
	//  147  288:bipush          6
	//  148  290:aload           6
	//  149  292:aastore         
	//  150  293:dup             
	//  151  294:bipush          7
	//  152  296:aload           7
	//  153  298:aastore         
	//  154  299:dup             
	//  155  300:bipush          8
	//  156  302:aload           8
	//  157  304:aastore         
	//  158  305:dup             
	//  159  306:bipush          9
	//  160  308:aload           9
	//  161  310:aastore         
	//  162  311:dup             
	//  163  312:bipush          10
	//  164  314:aload           10
	//  165  316:aastore         
	//  166  317:dup             
	//  167  318:bipush          11
	//  168  320:aload           11
	//  169  322:aastore         
	//  170  323:dup             
	//  171  324:bipush          12
	//  172  326:aload           12
	//  173  328:aastore         
	//  174  329:dup             
	//  175  330:bipush          13
	//  176  332:aload           13
	//  177  334:aastore         
	//  178  335:dup             
	//  179  336:bipush          14
	//  180  338:aload           14
	//  181  340:aastore         
	//  182  341:putstatic       #92  <Field AnnotationTarget[] $VALUES>
	//* 183  344:return          
	}
}
