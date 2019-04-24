// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.util.PropertySetter;
import ch.qos.logback.core.util.AggregationType;
import java.util.Stack;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			ImplicitAction, IADataForBasicProperty

public class NestedBasicPropertyIA extends ImplicitAction
{

	public NestedBasicPropertyIA()
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
	//    0    0:return          
	}

	public void body(InterpretationContext interpretationcontext, String s)
	{
		interpretationcontext = ((InterpretationContext) (interpretationcontext.subst(s)));
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:invokevirtual   #29  <Method String InterpretationContext.subst(String)>
	//    3    5:astore_1        
		s = ((String) ((IADataForBasicProperty)actionDataStack.peek()));
	//    4    6:aload_0         
	//    5    7:getfield        #18  <Field Stack actionDataStack>
	//    6   10:invokevirtual   #33  <Method Object Stack.peek()>
	//    7   13:checkcast       #35  <Class IADataForBasicProperty>
	//    8   16:astore_2        
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
			//*  10   23:getstatic       #31  <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY>
			//*  11   26:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
			//*  15   34:getstatic       #34  <Field AggregationType AggregationType.AS_COMPLEX_PROPERTY_COLLECTION>
			//*  16   37:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
			//*  20   45:getstatic       #37  <Field AggregationType AggregationType.AS_BASIC_PROPERTY>
			//*  21   48:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:getstatic       #20  <Field int[] $SwitchMap$ch$qos$logback$core$util$AggregationType>
			//*  25   56:getstatic       #40  <Field AggregationType AggregationType.AS_BASIC_PROPERTY_COLLECTION>
			//*  26   59:invokevirtual   #28  <Method int AggregationType.ordinal()>
			//*  27   62:iconst_5        
			//*  28   63:iastore         
			//*  29   64:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   30   65:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY.ordinal()] = 2;
				}
			//*  31   66:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   32   69:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_COMPLEX_PROPERTY_COLLECTION.ordinal()] = 3;
				}
			//*  33   70:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   34   73:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY.ordinal()] = 4;
				}
			//*  35   74:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   36   77:astore_0        
				try
				{
					$SwitchMap$ch$qos$logback$core$util$AggregationType[AggregationType.AS_BASIC_PROPERTY_COLLECTION.ordinal()] = 5;
				}
			//*  37   78:goto            53
				catch(NoSuchFieldError nosuchfielderror4) { }
			//   38   81:astore_0        
			//*  39   82:return          
			}
		}

		switch(_cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[((IADataForBasicProperty) (s)).aggregationType.ordinal()])
	//*   9   17:getstatic       #39  <Field int[] NestedBasicPropertyIA$1.$SwitchMap$ch$qos$logback$core$util$AggregationType>
	//*  10   20:aload_2         
	//*  11   21:getfield        #43  <Field AggregationType IADataForBasicProperty.aggregationType>
	//*  12   24:invokevirtual   #49  <Method int AggregationType.ordinal()>
	//*  13   27:iaload          
		{
	//*  14   28:tableswitch     4 5: default 52
	//	               4 66
	//	               5 53
		default:
			return;
	//   15   52:return          

		case 5: // '\005'
			((IADataForBasicProperty) (s)).parentBean.addBasicProperty(((IADataForBasicProperty) (s)).propertyName, ((String) (interpretationcontext)));
	//   16   53:aload_2         
	//   17   54:getfield        #53  <Field PropertySetter IADataForBasicProperty.parentBean>
	//   18   57:aload_2         
	//   19   58:getfield        #57  <Field String IADataForBasicProperty.propertyName>
	//   20   61:aload_1         
	//   21   62:invokevirtual   #63  <Method void PropertySetter.addBasicProperty(String, String)>
			return;
	//   22   65:return          

		case 4: // '\004'
			((IADataForBasicProperty) (s)).parentBean.setProperty(((IADataForBasicProperty) (s)).propertyName, ((String) (interpretationcontext)));
	//   23   66:aload_2         
	//   24   67:getfield        #53  <Field PropertySetter IADataForBasicProperty.parentBean>
	//   25   70:aload_2         
	//   26   71:getfield        #57  <Field String IADataForBasicProperty.propertyName>
	//   27   74:aload_1         
	//   28   75:invokevirtual   #66  <Method void PropertySetter.setProperty(String, String)>
			return;
	//   29   78:return          
		}
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		actionDataStack.pop();
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field Stack actionDataStack>
	//    2    4:invokevirtual   #70  <Method Object Stack.pop()>
	//    3    7:pop             
	//    4    8:return          
	}

	public boolean isApplicable(ElementPath elementpath, Attributes attributes, InterpretationContext interpretationcontext)
	{
		elementpath = ((ElementPath) (elementpath.peekLast()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #78  <Method String ElementPath.peekLast()>
	//    2    4:astore_1        
		if(interpretationcontext.isEmpty())
	//*   3    5:aload_3         
	//*   4    6:invokevirtual   #82  <Method boolean InterpretationContext.isEmpty()>
	//*   5    9:ifeq            14
			return false;
	//    6   12:iconst_0        
	//    7   13:ireturn         
		interpretationcontext = ((InterpretationContext) (new PropertySetter(interpretationcontext.peekObject())));
	//    8   14:new             #59  <Class PropertySetter>
	//    9   17:dup             
	//   10   18:aload_3         
	//   11   19:invokevirtual   #85  <Method Object InterpretationContext.peekObject()>
	//   12   22:invokespecial   #88  <Method void PropertySetter(Object)>
	//   13   25:astore_3        
		((PropertySetter) (interpretationcontext)).setContext(context);
	//   14   26:aload_3         
	//   15   27:aload_0         
	//   16   28:getfield        #92  <Field ch.qos.logback.core.Context context>
	//   17   31:invokevirtual   #96  <Method void PropertySetter.setContext(ch.qos.logback.core.Context)>
		attributes = ((Attributes) (((PropertySetter) (interpretationcontext)).computeAggregationType(((String) (elementpath)))));
	//   18   34:aload_3         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #100 <Method AggregationType PropertySetter.computeAggregationType(String)>
	//   21   39:astore_2        
		switch(_cls1..SwitchMap.ch.qos.logback.core.util.AggregationType[((AggregationType) (attributes)).ordinal()])
	//*  22   40:getstatic       #39  <Field int[] NestedBasicPropertyIA$1.$SwitchMap$ch$qos$logback$core$util$AggregationType>
	//*  23   43:aload_2         
	//*  24   44:invokevirtual   #49  <Method int AggregationType.ordinal()>
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
	//   27   84:new             #102 <Class StringBuilder>
	//   28   87:dup             
	//   29   88:invokespecial   #103 <Method void StringBuilder()>
	//   30   91:astore_1        
			((StringBuilder) (elementpath)).append("PropertySetter.canContainComponent returned ");
	//   31   92:aload_1         
	//   32   93:ldc1            #105 <String "PropertySetter.canContainComponent returned ">
	//   33   95:invokevirtual   #109 <Method StringBuilder StringBuilder.append(String)>
	//   34   98:pop             
			((StringBuilder) (elementpath)).append(((Object) (attributes)));
	//   35   99:aload_1         
	//   36  100:aload_2         
	//   37  101:invokevirtual   #112 <Method StringBuilder StringBuilder.append(Object)>
	//   38  104:pop             
			addError(((StringBuilder) (elementpath)).toString());
	//   39  105:aload_0         
	//   40  106:aload_1         
	//   41  107:invokevirtual   #115 <Method String StringBuilder.toString()>
	//   42  110:invokevirtual   #119 <Method void addError(String)>
			return false;
	//   43  113:iconst_0        
	//   44  114:ireturn         

		case 4: // '\004'
		case 5: // '\005'
			elementpath = ((ElementPath) (new IADataForBasicProperty(((PropertySetter) (interpretationcontext)), ((AggregationType) (attributes)), ((String) (elementpath)))));
	//   45  115:new             #35  <Class IADataForBasicProperty>
	//   46  118:dup             
	//   47  119:aload_3         
	//   48  120:aload_2         
	//   49  121:aload_1         
	//   50  122:invokespecial   #122 <Method void IADataForBasicProperty(PropertySetter, AggregationType, String)>
	//   51  125:astore_1        
			actionDataStack.push(((Object) (elementpath)));
	//   52  126:aload_0         
	//   53  127:getfield        #18  <Field Stack actionDataStack>
	//   54  130:aload_1         
	//   55  131:invokevirtual   #126 <Method Object Stack.push(Object)>
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
