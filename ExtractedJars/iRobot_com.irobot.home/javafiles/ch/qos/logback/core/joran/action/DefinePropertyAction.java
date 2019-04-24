// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.spi.PropertyDefiner;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action, ActionUtil

public class DefinePropertyAction extends Action
{

	public DefinePropertyAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Action()>
	//    2    4:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		scopeStr = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #24  <Field String scopeStr>
		scope = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #26  <Field ActionUtil$Scope scope>
		propertyName = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #28  <Field String propertyName>
		definer = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #30  <Field PropertyDefiner definer>
		inError = false;
	//   12   20:aload_0         
	//   13   21:iconst_0        
	//   14   22:putfield        #32  <Field boolean inError>
		propertyName = attributes.getValue("name");
	//   15   25:aload_0         
	//   16   26:aload_3         
	//   17   27:ldc1            #34  <String "name">
	//   18   29:invokeinterface #40  <Method String Attributes.getValue(String)>
	//   19   34:putfield        #28  <Field String propertyName>
		scopeStr = attributes.getValue("scope");
	//   20   37:aload_0         
	//   21   38:aload_3         
	//   22   39:ldc1            #41  <String "scope">
	//   23   41:invokeinterface #40  <Method String Attributes.getValue(String)>
	//   24   46:putfield        #24  <Field String scopeStr>
		scope = ActionUtil.stringToScope(scopeStr);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #24  <Field String scopeStr>
	//   28   54:invokestatic    #47  <Method ActionUtil$Scope ActionUtil.stringToScope(String)>
	//   29   57:putfield        #26  <Field ActionUtil$Scope scope>
		if(!OptionHelper.isEmpty(propertyName)) goto _L2; else goto _L1
	//   30   60:aload_0         
	//   31   61:getfield        #28  <Field String propertyName>
	//   32   64:invokestatic    #53  <Method boolean OptionHelper.isEmpty(String)>
	//   33   67:ifeq            130
_L1:
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//   34   70:new             #55  <Class StringBuilder>
	//   35   73:dup             
	//   36   74:invokespecial   #56  <Method void StringBuilder()>
	//   37   77:astore          4
		attributes = "Missing property name for property definer. Near [";
	//   38   79:ldc1            #58  <String "Missing property name for property definer. Near [">
	//   39   81:astore_3        
_L4:
		stringbuilder.append(((String) (attributes)));
	//   40   82:aload           4
	//   41   84:aload_3         
	//   42   85:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   43   88:pop             
		stringbuilder.append(s);
	//   44   89:aload           4
	//   45   91:aload_2         
	//   46   92:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   47   95:pop             
		stringbuilder.append("] line ");
	//   48   96:aload           4
	//   49   98:ldc1            #64  <String "] line ">
	//   50  100:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   51  103:pop             
		stringbuilder.append(getLineNumber(interpretationcontext));
	//   52  104:aload           4
	//   53  106:aload_0         
	//   54  107:aload_1         
	//   55  108:invokevirtual   #68  <Method int getLineNumber(InterpretationContext)>
	//   56  111:invokevirtual   #71  <Method StringBuilder StringBuilder.append(int)>
	//   57  114:pop             
		addError(stringbuilder.toString());
	//   58  115:aload_0         
	//   59  116:aload           4
	//   60  118:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   61  121:invokevirtual   #79  <Method void addError(String)>
		inError = true;
	//   62  124:aload_0         
	//   63  125:iconst_1        
	//   64  126:putfield        #32  <Field boolean inError>
		return;
	//   65  129:return          
_L2:
		attributes = ((Attributes) (attributes.getValue("class")));
	//   66  130:aload_3         
	//   67  131:ldc1            #81  <String "class">
	//   68  133:invokeinterface #40  <Method String Attributes.getValue(String)>
	//   69  138:astore_3        
		if(!OptionHelper.isEmpty(((String) (attributes))))
			break; /* Loop/switch isn't completed */
	//   70  139:aload_3         
	//   71  140:invokestatic    #53  <Method boolean OptionHelper.isEmpty(String)>
	//   72  143:ifeq            161
		stringbuilder = new StringBuilder();
	//   73  146:new             #55  <Class StringBuilder>
	//   74  149:dup             
	//   75  150:invokespecial   #56  <Method void StringBuilder()>
	//   76  153:astore          4
		attributes = "Missing class name for property definer. Near [";
	//   77  155:ldc1            #83  <String "Missing class name for property definer. Near [">
	//   78  157:astore_3        
		if(true) goto _L4; else goto _L3
	//   79  158:goto            82
_L3:
		try
		{
			s = ((String) (new StringBuilder()));
	//   80  161:new             #55  <Class StringBuilder>
	//   81  164:dup             
	//   82  165:invokespecial   #56  <Method void StringBuilder()>
	//   83  168:astore_2        
			((StringBuilder) (s)).append("About to instantiate property definer of type [");
	//   84  169:aload_2         
	//   85  170:ldc1            #85  <String "About to instantiate property definer of type [">
	//   86  172:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   87  175:pop             
			((StringBuilder) (s)).append(((String) (attributes)));
	//   88  176:aload_2         
	//   89  177:aload_3         
	//   90  178:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   91  181:pop             
			((StringBuilder) (s)).append("]");
	//   92  182:aload_2         
	//   93  183:ldc1            #87  <String "]">
	//   94  185:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   95  188:pop             
			addInfo(((StringBuilder) (s)).toString());
	//   96  189:aload_0         
	//   97  190:aload_2         
	//   98  191:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   99  194:invokevirtual   #90  <Method void addInfo(String)>
			definer = (PropertyDefiner)OptionHelper.instantiateByClassName(((String) (attributes)), ch/qos/logback/core/spi/PropertyDefiner, context);
	//  100  197:aload_0         
	//  101  198:aload_3         
	//  102  199:ldc1            #92  <Class PropertyDefiner>
	//  103  201:aload_0         
	//  104  202:getfield        #96  <Field ch.qos.logback.core.Context context>
	//  105  205:invokestatic    #100 <Method Object OptionHelper.instantiateByClassName(String, Class, ch.qos.logback.core.Context)>
	//  106  208:checkcast       #92  <Class PropertyDefiner>
	//  107  211:putfield        #30  <Field PropertyDefiner definer>
			definer.setContext(context);
	//  108  214:aload_0         
	//  109  215:getfield        #30  <Field PropertyDefiner definer>
	//  110  218:aload_0         
	//  111  219:getfield        #96  <Field ch.qos.logback.core.Context context>
	//  112  222:invokeinterface #104 <Method void PropertyDefiner.setContext(ch.qos.logback.core.Context)>
			if(definer instanceof LifeCycle)
	//* 113  227:aload_0         
	//* 114  228:getfield        #30  <Field PropertyDefiner definer>
	//* 115  231:instanceof      #106 <Class LifeCycle>
	//* 116  234:ifeq            249
				((LifeCycle)definer).start();
	//  117  237:aload_0         
	//  118  238:getfield        #30  <Field PropertyDefiner definer>
	//  119  241:checkcast       #106 <Class LifeCycle>
	//  120  244:invokeinterface #109 <Method void LifeCycle.start()>
			interpretationcontext.pushObject(((Object) (definer)));
	//  121  249:aload_1         
	//  122  250:aload_0         
	//  123  251:getfield        #30  <Field PropertyDefiner definer>
	//  124  254:invokevirtual   #115 <Method void InterpretationContext.pushObject(Object)>
			return;
	//  125  257:return          
		}
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext)
	//* 126  258:astore_1        
		{
			inError = true;
	//  127  259:aload_0         
	//  128  260:iconst_1        
	//  129  261:putfield        #32  <Field boolean inError>
		}
		s = ((String) (new StringBuilder()));
	//  130  264:new             #55  <Class StringBuilder>
	//  131  267:dup             
	//  132  268:invokespecial   #56  <Method void StringBuilder()>
	//  133  271:astore_2        
		((StringBuilder) (s)).append("Could not create an PropertyDefiner of type [");
	//  134  272:aload_2         
	//  135  273:ldc1            #117 <String "Could not create an PropertyDefiner of type [">
	//  136  275:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  137  278:pop             
		((StringBuilder) (s)).append(((String) (attributes)));
	//  138  279:aload_2         
	//  139  280:aload_3         
	//  140  281:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  141  284:pop             
		((StringBuilder) (s)).append("].");
	//  142  285:aload_2         
	//  143  286:ldc1            #119 <String "].">
	//  144  288:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//  145  291:pop             
		addError(((StringBuilder) (s)).toString(), ((Throwable) (interpretationcontext)));
	//  146  292:aload_0         
	//  147  293:aload_2         
	//  148  294:invokevirtual   #75  <Method String StringBuilder.toString()>
	//  149  297:aload_1         
	//  150  298:invokevirtual   #122 <Method void addError(String, Throwable)>
		throw new ActionException(((Throwable) (interpretationcontext)));
	//  151  301:new             #124 <Class ActionException>
	//  152  304:dup             
	//  153  305:aload_1         
	//  154  306:invokespecial   #127 <Method void ActionException(Throwable)>
	//  155  309:athrow          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(inError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field boolean inError>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		if(interpretationcontext.peekObject() != definer)
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #133 <Method Object InterpretationContext.peekObject()>
	//*   6   12:aload_0         
	//*   7   13:getfield        #30  <Field PropertyDefiner definer>
	//*   8   16:if_acmpeq       59
		{
			interpretationcontext = ((InterpretationContext) (new StringBuilder()));
	//    9   19:new             #55  <Class StringBuilder>
	//   10   22:dup             
	//   11   23:invokespecial   #56  <Method void StringBuilder()>
	//   12   26:astore_1        
			((StringBuilder) (interpretationcontext)).append("The object at the of the stack is not the property definer for property named [");
	//   13   27:aload_1         
	//   14   28:ldc1            #135 <String "The object at the of the stack is not the property definer for property named [">
	//   15   30:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   16   33:pop             
			((StringBuilder) (interpretationcontext)).append(propertyName);
	//   17   34:aload_1         
	//   18   35:aload_0         
	//   19   36:getfield        #28  <Field String propertyName>
	//   20   39:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   21   42:pop             
			((StringBuilder) (interpretationcontext)).append("] pushed earlier.");
	//   22   43:aload_1         
	//   23   44:ldc1            #137 <String "] pushed earlier.">
	//   24   46:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   25   49:pop             
			addWarn(((StringBuilder) (interpretationcontext)).toString());
	//   26   50:aload_0         
	//   27   51:aload_1         
	//   28   52:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   29   55:invokevirtual   #140 <Method void addWarn(String)>
			return;
	//   30   58:return          
		}
		s = ((String) (new StringBuilder()));
	//   31   59:new             #55  <Class StringBuilder>
	//   32   62:dup             
	//   33   63:invokespecial   #56  <Method void StringBuilder()>
	//   34   66:astore_2        
		((StringBuilder) (s)).append("Popping property definer for property named [");
	//   35   67:aload_2         
	//   36   68:ldc1            #142 <String "Popping property definer for property named [">
	//   37   70:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   38   73:pop             
		((StringBuilder) (s)).append(propertyName);
	//   39   74:aload_2         
	//   40   75:aload_0         
	//   41   76:getfield        #28  <Field String propertyName>
	//   42   79:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
		((StringBuilder) (s)).append("] from the object stack");
	//   44   83:aload_2         
	//   45   84:ldc1            #144 <String "] from the object stack">
	//   46   86:invokevirtual   #62  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
		addInfo(((StringBuilder) (s)).toString());
	//   48   90:aload_0         
	//   49   91:aload_2         
	//   50   92:invokevirtual   #75  <Method String StringBuilder.toString()>
	//   51   95:invokevirtual   #90  <Method void addInfo(String)>
		interpretationcontext.popObject();
	//   52   98:aload_1         
	//   53   99:invokevirtual   #147 <Method Object InterpretationContext.popObject()>
	//   54  102:pop             
		s = definer.getPropertyValue();
	//   55  103:aload_0         
	//   56  104:getfield        #30  <Field PropertyDefiner definer>
	//   57  107:invokeinterface #150 <Method String PropertyDefiner.getPropertyValue()>
	//   58  112:astore_2        
		if(s != null)
	//*  59  113:aload_2         
	//*  60  114:ifnull          130
			ActionUtil.setProperty(interpretationcontext, propertyName, s, scope);
	//   61  117:aload_1         
	//   62  118:aload_0         
	//   63  119:getfield        #28  <Field String propertyName>
	//   64  122:aload_2         
	//   65  123:aload_0         
	//   66  124:getfield        #26  <Field ActionUtil$Scope scope>
	//   67  127:invokestatic    #154 <Method void ActionUtil.setProperty(InterpretationContext, String, String, ActionUtil$Scope)>
	//   68  130:return          
	}

	PropertyDefiner definer;
	boolean inError;
	String propertyName;
	ActionUtil.Scope scope;
	String scopeStr;
}
