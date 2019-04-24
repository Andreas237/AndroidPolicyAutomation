// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.*;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.spi.ContextAware;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.util.*;
import java.util.Stack;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			ImplicitAction, IADataForComplexProperty

public class NestedComplexPropertyIA extends ImplicitAction
{

	public NestedComplexPropertyIA()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ImplicitAction()>
		actionDataStack = new Stack();
	//    2    4:aload_0         
	//    3    5:new             #15  <Class Stack>
	//    4    8:dup             
	//    5    9:invokespecial   #16  <Method void Stack()>
	//    6   12:putfield        #18  <Field Stack actionDataStack>
	//    7   15:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		IADataForComplexProperty iadataforcomplexproperty;
		String s1;
		iadataforcomplexproperty = (IADataForComplexProperty)actionDataStack.peek();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Stack actionDataStack>
	//    2    4:invokevirtual   #27  <Method Object Stack.peek()>
	//    3    7:checkcast       #29  <Class IADataForComplexProperty>
	//    4   10:astore          4
		s1 = interpretationcontext.subst(attributes.getValue("class"));
	//    5   12:aload_1         
	//    6   13:aload_3         
	//    7   14:ldc1            #31  <String "class">
	//    8   16:invokeinterface #37  <Method String Attributes.getValue(String)>
	//    9   21:invokevirtual   #42  <Method String InterpretationContext.subst(String)>
	//   10   24:astore          5
		if(!OptionHelper.isEmpty(s1))
	//*  11   26:aload           5
	//*  12   28:invokestatic    #48  <Method boolean OptionHelper.isEmpty(String)>
	//*  13   31:ifne            47
		{
			attributes = ((Attributes) (Loader.loadClass(s1, context)));
	//   14   34:aload           5
	//   15   36:aload_0         
	//   16   37:getfield        #52  <Field ch.qos.logback.core.Context context>
	//   17   40:invokestatic    #58  <Method Class Loader.loadClass(String, ch.qos.logback.core.Context)>
	//   18   43:astore_3        
			break MISSING_BLOCK_LABEL_70;
	//   19   44:goto            70
		}
		attributes = ((Attributes) (iadataforcomplexproperty.parentBean.getClassNameViaImplicitRules(iadataforcomplexproperty.getComplexPropertyName(), iadataforcomplexproperty.getAggregationType(), interpretationcontext.getDefaultNestedComponentRegistry())));
	//   20   47:aload           4
	//   21   49:getfield        #62  <Field PropertySetter IADataForComplexProperty.parentBean>
	//   22   52:aload           4
	//   23   54:invokevirtual   #66  <Method String IADataForComplexProperty.getComplexPropertyName()>
	//   24   57:aload           4
	//   25   59:invokevirtual   #70  <Method AggregationType IADataForComplexProperty.getAggregationType()>
	//   26   62:aload_1         
	//   27   63:invokevirtual   #74  <Method ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry InterpretationContext.getDefaultNestedComponentRegistry()>
	//   28   66:invokevirtual   #80  <Method Class PropertySetter.getClassNameViaImplicitRules(String, AggregationType, ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry)>
	//   29   69:astore_3        
		if(attributes == null)
	//*  30   70:aload_3         
	//*  31   71:ifnonnull       117
		{
			StringBuilder stringbuilder;
			try
			{
				iadataforcomplexproperty.inError = true;
	//   32   74:aload           4
	//   33   76:iconst_1        
	//   34   77:putfield        #84  <Field boolean IADataForComplexProperty.inError>
				interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//   35   80:new             #86  <Class StringBuilder>
	//   36   83:dup             
	//   37   84:invokespecial   #87  <Method void StringBuilder()>
	//   38   87:astore_1        
				((StringBuilder) (interpretationcontext)).append("Could not find an appropriate class for property [");
	//   39   88:aload_1         
	//   40   89:ldc1            #89  <String "Could not find an appropriate class for property [">
	//   41   91:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   42   94:pop             
				((StringBuilder) (interpretationcontext)).append(s);
	//   43   95:aload_1         
	//   44   96:aload_2         
	//   45   97:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   46  100:pop             
				((StringBuilder) (interpretationcontext)).append("]");
	//   47  101:aload_1         
	//   48  102:ldc1            #95  <String "]">
	//   49  104:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   50  107:pop             
				addError(((StringBuilder) (interpretationcontext)).toString());
	//   51  108:aload_0         
	//   52  109:aload_1         
	//   53  110:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   54  113:invokevirtual   #102 <Method void addError(String)>
				return;
	//   55  116:return          
			}
	//*  56  117:aload           5
	//*  57  119:invokestatic    #48  <Method boolean OptionHelper.isEmpty(String)>
	//*  58  122:ifeq            184
	//*  59  125:new             #86  <Class StringBuilder>
	//*  60  128:dup             
	//*  61  129:invokespecial   #87  <Method void StringBuilder()>
	//*  62  132:astore          6
	//*  63  134:aload           6
	//*  64  136:ldc1            #104 <String "Assuming default type [">
	//*  65  138:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  66  141:pop             
	//*  67  142:aload           6
	//*  68  144:aload_3         
	//*  69  145:invokevirtual   #109 <Method String Class.getName()>
	//*  70  148:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  71  151:pop             
	//*  72  152:aload           6
	//*  73  154:ldc1            #111 <String "] for [">
	//*  74  156:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  75  159:pop             
	//*  76  160:aload           6
	//*  77  162:aload_2         
	//*  78  163:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  79  166:pop             
	//*  80  167:aload           6
	//*  81  169:ldc1            #113 <String "] property">
	//*  82  171:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//*  83  174:pop             
	//*  84  175:aload_0         
	//*  85  176:aload           6
	//*  86  178:invokevirtual   #98  <Method String StringBuilder.toString()>
	//*  87  181:invokevirtual   #116 <Method void addInfo(String)>
	//*  88  184:aload           4
	//*  89  186:aload_3         
	//*  90  187:invokevirtual   #119 <Method Object Class.newInstance()>
	//*  91  190:invokevirtual   #123 <Method void IADataForComplexProperty.setNestedComplexProperty(Object)>
	//*  92  193:aload           4
	//*  93  195:invokevirtual   #126 <Method Object IADataForComplexProperty.getNestedComplexProperty()>
	//*  94  198:instanceof      #128 <Class ContextAware>
	//*  95  201:ifeq            221
	//*  96  204:aload           4
	//*  97  206:invokevirtual   #126 <Method Object IADataForComplexProperty.getNestedComplexProperty()>
	//*  98  209:checkcast       #128 <Class ContextAware>
	//*  99  212:aload_0         
	//* 100  213:getfield        #52  <Field ch.qos.logback.core.Context context>
	//* 101  216:invokeinterface #132 <Method void ContextAware.setContext(ch.qos.logback.core.Context)>
	//* 102  221:aload_1         
	//* 103  222:aload           4
	//* 104  224:invokevirtual   #126 <Method Object IADataForComplexProperty.getNestedComplexProperty()>
	//* 105  227:invokevirtual   #135 <Method void InterpretationContext.pushObject(Object)>
	//* 106  230:return          
			// Misplaced declaration of an exception variable
			catch(InterpretationContext interpretationcontext)
	//* 107  231:astore_1        
			{
				iadataforcomplexproperty.inError = true;
	//  108  232:aload           4
	//  109  234:iconst_1        
	//  110  235:putfield        #84  <Field boolean IADataForComplexProperty.inError>
			}
			break MISSING_BLOCK_LABEL_238;
		}
		if(OptionHelper.isEmpty(s1))
		{
			stringbuilder = new StringBuilder();
			stringbuilder.append("Assuming default type [");
			stringbuilder.append(((Class) (attributes)).getName());
			stringbuilder.append("] for [");
			stringbuilder.append(s);
			stringbuilder.append("] property");
			addInfo(stringbuilder.toString());
		}
		iadataforcomplexproperty.setNestedComplexProperty(((Class) (attributes)).newInstance());
		if(iadataforcomplexproperty.getNestedComplexProperty() instanceof ContextAware)
			((ContextAware)iadataforcomplexproperty.getNestedComplexProperty()).setContext(context);
		interpretationcontext.pushObject(iadataforcomplexproperty.getNestedComplexProperty());
		return;
		attributes = ((Attributes) (new StringBuilder()));
	//  111  238:new             #86  <Class StringBuilder>
	//  112  241:dup             
	//  113  242:invokespecial   #87  <Method void StringBuilder()>
	//  114  245:astore_3        
		((StringBuilder) (attributes)).append("Could not create component [");
	//  115  246:aload_3         
	//  116  247:ldc1            #137 <String "Could not create component [">
	//  117  249:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//  118  252:pop             
		((StringBuilder) (attributes)).append(s);
	//  119  253:aload_3         
	//  120  254:aload_2         
	//  121  255:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//  122  258:pop             
		((StringBuilder) (attributes)).append("] of type [");
	//  123  259:aload_3         
	//  124  260:ldc1            #139 <String "] of type [">
	//  125  262:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//  126  265:pop             
		((StringBuilder) (attributes)).append(s1);
	//  127  266:aload_3         
	//  128  267:aload           5
	//  129  269:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//  130  272:pop             
		((StringBuilder) (attributes)).append("]");
	//  131  273:aload_3         
	//  132  274:ldc1            #95  <String "]">
	//  133  276:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//  134  279:pop             
		addError(((StringBuilder) (attributes)).toString(), ((Throwable) (interpretationcontext)));
	//  135  280:aload_0         
	//  136  281:aload_3         
	//  137  282:invokevirtual   #98  <Method String StringBuilder.toString()>
	//  138  285:aload_1         
	//  139  286:invokevirtual   #142 <Method void addError(String, Throwable)>
		return;
	//  140  289:return          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		IADataForComplexProperty iadataforcomplexproperty = (IADataForComplexProperty)actionDataStack.pop();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Stack actionDataStack>
	//    2    4:invokevirtual   #147 <Method Object Stack.pop()>
	//    3    7:checkcast       #29  <Class IADataForComplexProperty>
	//    4   10:astore_3        
		if(iadataforcomplexproperty.inError)
	//*   5   11:aload_3         
	//*   6   12:getfield        #84  <Field boolean IADataForComplexProperty.inError>
	//*   7   15:ifeq            19
			return;
	//    8   18:return          
		Object obj = ((Object) (new PropertySetter(iadataforcomplexproperty.getNestedComplexProperty())));
	//    9   19:new             #76  <Class PropertySetter>
	//   10   22:dup             
	//   11   23:aload_3         
	//   12   24:invokevirtual   #126 <Method Object IADataForComplexProperty.getNestedComplexProperty()>
	//   13   27:invokespecial   #149 <Method void PropertySetter(Object)>
	//   14   30:astore          4
		((PropertySetter) (obj)).setContext(context);
	//   15   32:aload           4
	//   16   34:aload_0         
	//   17   35:getfield        #52  <Field ch.qos.logback.core.Context context>
	//   18   38:invokevirtual   #150 <Method void PropertySetter.setContext(ch.qos.logback.core.Context)>
		if(((PropertySetter) (obj)).computeAggregationType("parent") == AggregationType.AS_COMPLEX_PROPERTY)
	//*  19   41:aload           4
	//*  20   43:ldc1            #152 <String "parent">
	//*  21   45:invokevirtual   #156 <Method AggregationType PropertySetter.computeAggregationType(String)>
	//*  22   48:getstatic       #162 <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY>
	//*  23   51:if_acmpne       68
			((PropertySetter) (obj)).setComplexProperty("parent", iadataforcomplexproperty.parentBean.getObj());
	//   24   54:aload           4
	//   25   56:ldc1            #152 <String "parent">
	//   26   58:aload_3         
	//   27   59:getfield        #62  <Field PropertySetter IADataForComplexProperty.parentBean>
	//   28   62:invokevirtual   #165 <Method Object PropertySetter.getObj()>
	//   29   65:invokevirtual   #169 <Method void PropertySetter.setComplexProperty(String, Object)>
		obj = iadataforcomplexproperty.getNestedComplexProperty();
	//   30   68:aload_3         
	//   31   69:invokevirtual   #126 <Method Object IADataForComplexProperty.getNestedComplexProperty()>
	//   32   72:astore          4
		if((obj instanceof LifeCycle) && NoAutoStartUtil.notMarkedWithNoAutoStart(obj))
	//*  33   74:aload           4
	//*  34   76:instanceof      #171 <Class LifeCycle>
	//*  35   79:ifeq            100
	//*  36   82:aload           4
	//*  37   84:invokestatic    #177 <Method boolean NoAutoStartUtil.notMarkedWithNoAutoStart(Object)>
	//*  38   87:ifeq            100
			((LifeCycle)obj).start();
	//   39   90:aload           4
	//   40   92:checkcast       #171 <Class LifeCycle>
	//   41   95:invokeinterface #180 <Method void LifeCycle.start()>
		if(interpretationcontext.peekObject() != iadataforcomplexproperty.getNestedComplexProperty())
	//*  42  100:aload_1         
	//*  43  101:invokevirtual   #183 <Method Object InterpretationContext.peekObject()>
	//*  44  104:aload_3         
	//*  45  105:invokevirtual   #126 <Method Object IADataForComplexProperty.getNestedComplexProperty()>
	//*  46  108:if_acmpeq       118
		{
			addError("The object on the top the of the stack is not the component pushed earlier.");
	//   47  111:aload_0         
	//   48  112:ldc1            #185 <String "The object on the top the of the stack is not the component pushed earlier.">
	//   49  114:invokevirtual   #102 <Method void addError(String)>
			return;
	//   50  117:return          
		}
		interpretationcontext.popObject();
	//   51  118:aload_1         
	//   52  119:invokevirtual   #188 <Method Object InterpretationContext.popObject()>
	//   53  122:pop             
		static class _cls1
		{

			static final int $SwitchMap$ch$qos$logback$core$util$AggregationType[];

			static 
			{
				$SwitchMap$ch$qos$logback$core$util$AggregationType = new int[AggregationType.values().length];
			//    0    0:invokestatic    #18  <Method AggregationType[] AggregationType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.NOT_FOUND.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
			//    5   12:getstatic       #24  <Field AggregationType AggregationType.NOT_FOUND>
			//    6   15:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
			//*  10   23:getstatic       #31  <Field AggregationType AggregationType.AS_BASIC_PROPERTY>
			//*  11   26:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
			//*  15   34:getstatic       #34  <Field AggregationType AggregationType.AS_BASIC_PROPERTY_COLLECTION>
			//*  16   37:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
			//*  20   45:getstatic       #37  <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY_COLLECTION>
			//*  21   48:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
			//*  25   56:getstatic       #40  <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY>
			//*  26   59:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[iadataforcomplexproperty.aggregationType.ordinal()])
	//*  54  123:getstatic       #192 <Field int[] NestedComplexPropertyIA$1.$SwitchMap$ch$qos$logback$core$util$AggregationType>
	//*  55  126:aload_3         
	//*  56  127:getfield        #195 <Field AggregationType IADataForComplexProperty.aggregationType>
	//*  57  130:invokevirtual   #199 <Method int AggregationType.ordinal()>
	//*  58  133:iaload          
		{
	//*  59  134:tableswitch     4 5: default 156
	//	               4 170
	//	               5 157
		default:
			return;
	//   60  156:return          

		case 5: // '\005'
			iadataforcomplexproperty.parentBean.setComplexProperty(s, iadataforcomplexproperty.getNestedComplexProperty());
	//   61  157:aload_3         
	//   62  158:getfield        #62  <Field PropertySetter IADataForComplexProperty.parentBean>
	//   63  161:aload_2         
	//   64  162:aload_3         
	//   65  163:invokevirtual   #126 <Method Object IADataForComplexProperty.getNestedComplexProperty()>
	//   66  166:invokevirtual   #169 <Method void PropertySetter.setComplexProperty(String, Object)>
			return;
	//   67  169:return          

		case 4: // '\004'
			iadataforcomplexproperty.parentBean.addComplexProperty(s, iadataforcomplexproperty.getNestedComplexProperty());
	//   68  170:aload_3         
	//   69  171:getfield        #62  <Field PropertySetter IADataForComplexProperty.parentBean>
	//   70  174:aload_2         
	//   71  175:aload_3         
	//   72  176:invokevirtual   #126 <Method Object IADataForComplexProperty.getNestedComplexProperty()>
	//   73  179:invokevirtual   #202 <Method void PropertySetter.addComplexProperty(String, Object)>
			return;
	//   74  182:return          
		}
	}

	public boolean isApplicable(ElementPath elementpath, Attributes attributes, InterpretationContext interpretationcontext)
	{
		elementpath = ((ElementPath) (elementpath.peekLast()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #209 <Method String ElementPath.peekLast()>
	//    2    4:astore_1        
		if(interpretationcontext.isEmpty())
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #212 <Method boolean InterpretationContext.isEmpty()>
	//*   5    9:ifeq            14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		interpretationcontext = ((InterpretationContext) (new PropertySetter(interpretationcontext.peekObject())));
	//    8   14:new             #76  <Class PropertySetter>
	//    9   17:dup             
	//   10   18:aload_3         
	//   11   19:invokevirtual   #183 <Method Object InterpretationContext.peekObject()>
	//   12   22:invokespecial   #149 <Method void PropertySetter(Object)>
	//   13   25:astore_3        
		((PropertySetter) (interpretationcontext)).setContext(context);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #52  <Field ch.qos.logback.core.Context context>
	//   17   31:invokevirtual   #150 <Method void PropertySetter.setContext(ch.qos.logback.core.Context)>
		attributes = ((Attributes) (((PropertySetter) (interpretationcontext)).computeAggregationType(((String) (elementpath)))));
	//   18   34:aload_3         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #156 <Method AggregationType PropertySetter.computeAggregationType(String)>
	//   21   39:astore_2        
		switch(_cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[((AggregationType) (attributes)).ordinal()])
	//*  22   40:getstatic       #192 <Field int[] NestedComplexPropertyIA$1.$SwitchMap$ch$qos$logback$core$util$AggregationType>
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #199 <Method int AggregationType.ordinal()>
	//*  25   47:iaload          
		{
	//*  26   48:tableswitch     1 5: default 84
	//	               1 137
	//	               2 137
	//	               3 137
	//	               4 115
	//	               5 115
		default:
			elementpath = ((ElementPath) (new StringBuilder()));
	//   27   84:new             #86  <Class StringBuilder>
	//   28   87:dup             
	//   29   88:invokespecial   #87  <Method void StringBuilder()>
	//   30   91:astore_1        
			((StringBuilder) (elementpath)).append("PropertySetter.computeAggregationType returned ");
	//   31   92:aload_1         
	//   32   93:ldc1            #214 <String "PropertySetter.computeAggregationType returned ">
	//   33   95:invokevirtual   #93  <Method StringBuilder StringBuilder.append(String)>
	//   34   98:pop             
			((StringBuilder) (elementpath)).append(((Object) (attributes)));
	//   35   99:aload_1         
	//   36  100:aload_2         
	//   37  101:invokevirtual   #217 <Method StringBuilder StringBuilder.append(Object)>
	//   38  104:pop             
			addError(((StringBuilder) (elementpath)).toString());
	//   39  105:aload_0         
	//   40  106:aload_1         
	//   41  107:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   42  110:invokevirtual   #102 <Method void addError(String)>
			return false;
	//   43  113:iconst_0        
	//   44  114:ireturn         

		case 4: // '\004'
		case 5: // '\005'
			elementpath = ((ElementPath) (new IADataForComplexProperty(((PropertySetter) (interpretationcontext)), ((AggregationType) (attributes)), ((String) (elementpath)))));
	//   45  115:new             #29  <Class IADataForComplexProperty>
	//   46  118:dup             
	//   47  119:aload_3         
	//   48  120:aload_2         
	//   49  121:aload_1         
	//   50  122:invokespecial   #220 <Method void IADataForComplexProperty(PropertySetter, AggregationType, String)>
	//   51  125:astore_1        
			actionDataStack.push(((Object) (elementpath)));
	//   52  126:aload_0         
	//   53  127:getfield        #18  <Field Stack actionDataStack>
	//   54  130:aload_1         
	//   55  131:invokevirtual   #224 <Method Object Stack.push(Object)>
	//   56  134:pop             
			return true;
	//   57  135:iconst_1        
	//   58  136:ireturn         

		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
			return false;
	//   59  137:iconst_0        
	//   60  138:ireturn         
		}
	}

	Stack actionDataStack;
}
