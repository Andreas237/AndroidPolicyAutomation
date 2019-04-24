// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.net.ReceiverBase;
import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.ActionException;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

public class ReceiverAction extends Action
{

	public ReceiverAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Action()>
	//    2    4:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		attributes = ((Attributes) (attributes.getValue("class")));
	//    0    0:aload_3         
	//    1    1:ldc1            #19  <String "class">
	//    2    3:invokeinterface #25  <Method String Attributes.getValue(String)>
	//    3    8:astore_3        
		if(OptionHelper.isEmpty(((String) (attributes))))
	//*   4    9:aload_3         
	//*   5   10:invokestatic    #31  <Method boolean OptionHelper.isEmpty(String)>
	//*   6   13:ifeq            68
		{
			attributes = ((Attributes) (new StringBuilder()));
	//    7   16:new             #33  <Class StringBuilder>
	//    8   19:dup             
	//    9   20:invokespecial   #34  <Method void StringBuilder()>
	//   10   23:astore_3        
			((StringBuilder) (attributes)).append("Missing class name for receiver. Near [");
	//   11   24:aload_3         
	//   12   25:ldc1            #36  <String "Missing class name for receiver. Near [">
	//   13   27:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
			((StringBuilder) (attributes)).append(s);
	//   15   31:aload_3         
	//   16   32:aload_2         
	//   17   33:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
			((StringBuilder) (attributes)).append("] line ");
	//   19   37:aload_3         
	//   20   38:ldc1            #42  <String "] line ">
	//   21   40:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   22   43:pop             
			((StringBuilder) (attributes)).append(getLineNumber(interpretationcontext));
	//   23   44:aload_3         
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:invokevirtual   #46  <Method int getLineNumber(InterpretationContext)>
	//   27   50:invokevirtual   #49  <Method StringBuilder StringBuilder.append(int)>
	//   28   53:pop             
			addError(((StringBuilder) (attributes)).toString());
	//   29   54:aload_0         
	//   30   55:aload_3         
	//   31   56:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   32   59:invokevirtual   #57  <Method void addError(String)>
			inError = true;
	//   33   62:aload_0         
	//   34   63:iconst_1        
	//   35   64:putfield        #59  <Field boolean inError>
			return;
	//   36   67:return          
		}
		try
		{
			s = ((String) (new StringBuilder()));
	//   37   68:new             #33  <Class StringBuilder>
	//   38   71:dup             
	//   39   72:invokespecial   #34  <Method void StringBuilder()>
	//   40   75:astore_2        
			((StringBuilder) (s)).append("About to instantiate receiver of type [");
	//   41   76:aload_2         
	//   42   77:ldc1            #61  <String "About to instantiate receiver of type [">
	//   43   79:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   44   82:pop             
			((StringBuilder) (s)).append(((String) (attributes)));
	//   45   83:aload_2         
	//   46   84:aload_3         
	//   47   85:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   48   88:pop             
			((StringBuilder) (s)).append("]");
	//   49   89:aload_2         
	//   50   90:ldc1            #63  <String "]">
	//   51   92:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   52   95:pop             
			addInfo(((StringBuilder) (s)).toString());
	//   53   96:aload_0         
	//   54   97:aload_2         
	//   55   98:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   56  101:invokevirtual   #66  <Method void addInfo(String)>
			receiver = (ReceiverBase)OptionHelper.instantiateByClassName(((String) (attributes)), ch/qos/logback/classic/net/ReceiverBase, context);
	//   57  104:aload_0         
	//   58  105:aload_3         
	//   59  106:ldc1            #68  <Class ReceiverBase>
	//   60  108:aload_0         
	//   61  109:getfield        #72  <Field Context context>
	//   62  112:invokestatic    #76  <Method Object OptionHelper.instantiateByClassName(String, Class, Context)>
	//   63  115:checkcast       #68  <Class ReceiverBase>
	//   64  118:putfield        #78  <Field ReceiverBase receiver>
			receiver.setContext(context);
	//   65  121:aload_0         
	//   66  122:getfield        #78  <Field ReceiverBase receiver>
	//   67  125:aload_0         
	//   68  126:getfield        #72  <Field Context context>
	//   69  129:invokevirtual   #82  <Method void ReceiverBase.setContext(Context)>
			interpretationcontext.pushObject(((Object) (receiver)));
	//   70  132:aload_1         
	//   71  133:aload_0         
	//   72  134:getfield        #78  <Field ReceiverBase receiver>
	//   73  137:invokevirtual   #88  <Method void InterpretationContext.pushObject(Object)>
			return;
	//   74  140:return          
		}
		// Misplaced declaration of an exception variable
		catch(InterpretationContext interpretationcontext)
	//*  75  141:astore_1        
		{
			inError = true;
	//   76  142:aload_0         
	//   77  143:iconst_1        
	//   78  144:putfield        #59  <Field boolean inError>
		}
		s = ((String) (new StringBuilder()));
	//   79  147:new             #33  <Class StringBuilder>
	//   80  150:dup             
	//   81  151:invokespecial   #34  <Method void StringBuilder()>
	//   82  154:astore_2        
		((StringBuilder) (s)).append("Could not create a receiver of type [");
	//   83  155:aload_2         
	//   84  156:ldc1            #90  <String "Could not create a receiver of type [">
	//   85  158:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   86  161:pop             
		((StringBuilder) (s)).append(((String) (attributes)));
	//   87  162:aload_2         
	//   88  163:aload_3         
	//   89  164:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   90  167:pop             
		((StringBuilder) (s)).append("].");
	//   91  168:aload_2         
	//   92  169:ldc1            #92  <String "].">
	//   93  171:invokevirtual   #40  <Method StringBuilder StringBuilder.append(String)>
	//   94  174:pop             
		addError(((StringBuilder) (s)).toString(), ((Throwable) (interpretationcontext)));
	//   95  175:aload_0         
	//   96  176:aload_2         
	//   97  177:invokevirtual   #53  <Method String StringBuilder.toString()>
	//   98  180:aload_1         
	//   99  181:invokevirtual   #95  <Method void addError(String, Throwable)>
		throw new ActionException(((Throwable) (interpretationcontext)));
	//  100  184:new             #97  <Class ActionException>
	//  101  187:dup             
	//  102  188:aload_1         
	//  103  189:invokespecial   #100 <Method void ActionException(Throwable)>
	//  104  192:athrow          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		if(inError)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field boolean inError>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		interpretationcontext.getContext().register(((ch.qos.logback.core.spi.LifeCycle) (receiver)));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #106 <Method Context InterpretationContext.getContext()>
	//    6   12:aload_0         
	//    7   13:getfield        #78  <Field ReceiverBase receiver>
	//    8   16:invokeinterface #112 <Method void Context.register(ch.qos.logback.core.spi.LifeCycle)>
		receiver.start();
	//    9   21:aload_0         
	//   10   22:getfield        #78  <Field ReceiverBase receiver>
	//   11   25:invokevirtual   #115 <Method void ReceiverBase.start()>
		if(interpretationcontext.peekObject() != receiver)
	//*  12   28:aload_1         
	//*  13   29:invokevirtual   #119 <Method Object InterpretationContext.peekObject()>
	//*  14   32:aload_0         
	//*  15   33:getfield        #78  <Field ReceiverBase receiver>
	//*  16   36:if_acmpeq       46
		{
			addWarn("The object at the of the stack is not the remote pushed earlier.");
	//   17   39:aload_0         
	//   18   40:ldc1            #121 <String "The object at the of the stack is not the remote pushed earlier.">
	//   19   42:invokevirtual   #124 <Method void addWarn(String)>
			return;
	//   20   45:return          
		} else
		{
			interpretationcontext.popObject();
	//   21   46:aload_1         
	//   22   47:invokevirtual   #127 <Method Object InterpretationContext.popObject()>
	//   23   50:pop             
			return;
	//   24   51:return          
		}
	}

	private boolean inError;
	private ReceiverBase receiver;
}
