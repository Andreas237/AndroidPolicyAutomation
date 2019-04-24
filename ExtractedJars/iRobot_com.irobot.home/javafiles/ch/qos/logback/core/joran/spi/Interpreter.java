// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.action.ImplicitAction;
import ch.qos.logback.core.joran.event.*;
import java.util.*;
import org.xml.sax.Attributes;
import org.xml.sax.Locator;

// Referenced classes of package ch.qos.logback.core.joran.spi:
//			CAI_WithLocatorSupport, InterpretationContext, EventPlayer, ActionException, 
//			ElementPath, RuleStore

public class Interpreter
{

	public Interpreter(Context context, RuleStore rulestore, ElementPath elementpath)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
		skip = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #42  <Field ElementPath skip>
		cai = new CAI_WithLocatorSupport(context, this);
	//    5    9:aload_0         
	//    6   10:new             #44  <Class CAI_WithLocatorSupport>
	//    7   13:dup             
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokespecial   #47  <Method void CAI_WithLocatorSupport(Context, Interpreter)>
	//   11   19:putfield        #49  <Field CAI_WithLocatorSupport cai>
		ruleStore = rulestore;
	//   12   22:aload_0         
	//   13   23:aload_2         
	//   14   24:putfield        #51  <Field RuleStore ruleStore>
		interpretationContext = new InterpretationContext(context, this);
	//   15   27:aload_0         
	//   16   28:new             #53  <Class InterpretationContext>
	//   17   31:dup             
	//   18   32:aload_1         
	//   19   33:aload_0         
	//   20   34:invokespecial   #54  <Method void InterpretationContext(Context, Interpreter)>
	//   21   37:putfield        #56  <Field InterpretationContext interpretationContext>
	//   22   40:aload_0         
	//   23   41:new             #58  <Class ArrayList>
	//   24   44:dup             
	//   25   45:iconst_3        
	//   26   46:invokespecial   #59  <Method void ArrayList(int)>
	//   27   49:putfield        #61  <Field ArrayList implicitActions>
		elementPath = elementpath;
	//   28   52:aload_0         
	//   29   53:aload_3         
	//   30   54:putfield        #63  <Field ElementPath elementPath>
		actionListStack = new Stack();
	//   31   57:aload_0         
	//   32   58:new             #65  <Class Stack>
	//   33   61:dup             
	//   34   62:invokespecial   #66  <Method void Stack()>
	//   35   65:putfield        #68  <Field Stack actionListStack>
		eventPlayer = new EventPlayer(this);
	//   36   68:aload_0         
	//   37   69:new             #70  <Class EventPlayer>
	//   38   72:dup             
	//   39   73:aload_0         
	//   40   74:invokespecial   #73  <Method void EventPlayer(Interpreter)>
	//   41   77:putfield        #75  <Field EventPlayer eventPlayer>
	//   42   80:return          
	}

	private void callBodyAction(List list, String s)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		for(list = ((List) (list.iterator())); ((Iterator) (list)).hasNext();)
	//*   3    5:aload_1         
	//*   4    6:invokeinterface #85  <Method Iterator List.iterator()>
	//*   5   11:astore_1        
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//*   8   18:ifeq            98
		{
			Action action = (Action)((Iterator) (list)).next();
	//    9   21:aload_1         
	//   10   22:invokeinterface #95  <Method Object Iterator.next()>
	//   11   27:checkcast       #97  <Class Action>
	//   12   30:astore_3        
			try
			{
				action.body(interpretationContext, s);
	//   13   31:aload_3         
	//   14   32:aload_0         
	//   15   33:getfield        #56  <Field InterpretationContext interpretationContext>
	//   16   36:aload_2         
	//   17   37:invokevirtual   #101 <Method void Action.body(InterpretationContext, String)>
			}
	//*  18   40:goto            12
			catch(ActionException actionexception)
	//*  19   43:astore          4
			{
				CAI_WithLocatorSupport cai_withlocatorsupport = cai;
	//   20   45:aload_0         
	//   21   46:getfield        #49  <Field CAI_WithLocatorSupport cai>
	//   22   49:astore          5
				StringBuilder stringbuilder = new StringBuilder();
	//   23   51:new             #103 <Class StringBuilder>
	//   24   54:dup             
	//   25   55:invokespecial   #104 <Method void StringBuilder()>
	//   26   58:astore          6
				stringbuilder.append("Exception in end() methd for action [");
	//   27   60:aload           6
	//   28   62:ldc1            #106 <String "Exception in end() methd for action [">
	//   29   64:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   30   67:pop             
				stringbuilder.append(((Object) (action)));
	//   31   68:aload           6
	//   32   70:aload_3         
	//   33   71:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   34   74:pop             
				stringbuilder.append("]");
	//   35   75:aload           6
	//   36   77:ldc1            #115 <String "]">
	//   37   79:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   38   82:pop             
				cai_withlocatorsupport.addError(stringbuilder.toString(), ((Throwable) (actionexception)));
	//   39   83:aload           5
	//   40   85:aload           6
	//   41   87:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   42   90:aload           4
	//   43   92:invokevirtual   #123 <Method void CAI_WithLocatorSupport.addError(String, Throwable)>
			}
		}

	//*  44   95:goto            12
	//   45   98:return          
	}

	private void callEndAction(List list, String s)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Iterator iterator = list.iterator();
	//    3    5:aload_1         
	//    4    6:invokeinterface #85  <Method Iterator List.iterator()>
	//    5   11:astore          6
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   13:aload           6
	//    7   15:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            123
			list = ((List) ((Action)iterator.next()));
	//    9   23:aload           6
	//   10   25:invokeinterface #95  <Method Object Iterator.next()>
	//   11   30:checkcast       #97  <Class Action>
	//   12   33:astore_1        
			CAI_WithLocatorSupport cai_withlocatorsupport;
			StringBuilder stringbuilder;
			String s1;
			try
			{
				((Action) (list)).end(interpretationContext, s);
	//   13   34:aload_1         
	//   14   35:aload_0         
	//   15   36:getfield        #56  <Field InterpretationContext interpretationContext>
	//   16   39:aload_2         
	//   17   40:invokevirtual   #131 <Method void Action.end(InterpretationContext, String)>
				continue;
	//   18   43:goto            13
			}
	//*  19   46:astore_1        
	//*  20   47:aload_0         
	//*  21   48:getfield        #49  <Field CAI_WithLocatorSupport cai>
	//*  22   51:astore_3        
	//*  23   52:new             #103 <Class StringBuilder>
	//*  24   55:dup             
	//*  25   56:invokespecial   #104 <Method void StringBuilder()>
	//*  26   59:astore          4
	//*  27   61:ldc1            #133 <String "RuntimeException in Action for tag [">
	//*  28   63:astore          5
	//*  29   65:goto            87
			// Misplaced declaration of an exception variable
			catch(List list)
	//*  30   68:astore_1        
			{
				cai_withlocatorsupport = cai;
	//   31   69:aload_0         
	//   32   70:getfield        #49  <Field CAI_WithLocatorSupport cai>
	//   33   73:astore_3        
				stringbuilder = new StringBuilder();
	//   34   74:new             #103 <Class StringBuilder>
	//   35   77:dup             
	//   36   78:invokespecial   #104 <Method void StringBuilder()>
	//   37   81:astore          4
				s1 = "ActionException in Action for tag [";
	//   38   83:ldc1            #135 <String "ActionException in Action for tag [">
	//   39   85:astore          5
			}
			// Misplaced declaration of an exception variable
			catch(List list)
			{
				cai_withlocatorsupport = cai;
				stringbuilder = new StringBuilder();
				s1 = "RuntimeException in Action for tag [";
			}
			stringbuilder.append(s1);
	//   40   87:aload           4
	//   41   89:aload           5
	//   42   91:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   43   94:pop             
			stringbuilder.append(s);
	//   44   95:aload           4
	//   45   97:aload_2         
	//   46   98:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   47  101:pop             
			stringbuilder.append("]");
	//   48  102:aload           4
	//   49  104:ldc1            #115 <String "]">
	//   50  106:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   51  109:pop             
			cai_withlocatorsupport.addError(stringbuilder.toString(), ((Throwable) (list)));
	//   52  110:aload_3         
	//   53  111:aload           4
	//   54  113:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   55  116:aload_1         
	//   56  117:invokevirtual   #123 <Method void CAI_WithLocatorSupport.addError(String, Throwable)>
		} while(true);
	//   57  120:goto            13
	//   58  123:return          
	}

	private void endElement(String s, String s1, String s2)
	{
		s = ((String) ((List)actionListStack.pop()));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Stack actionListStack>
	//    2    4:invokevirtual   #140 <Method Object Stack.pop()>
	//    3    7:checkcast       #81  <Class List>
	//    4   10:astore_1        
		if(skip != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #42  <Field ElementPath skip>
	//*   7   15:ifnull          40
		{
			if(skip.equals(((Object) (elementPath))))
	//*   8   18:aload_0         
	//*   9   19:getfield        #42  <Field ElementPath skip>
	//*  10   22:aload_0         
	//*  11   23:getfield        #63  <Field ElementPath elementPath>
	//*  12   26:invokevirtual   #146 <Method boolean ElementPath.equals(Object)>
	//*  13   29:ifeq            58
				skip = null;
	//   14   32:aload_0         
	//   15   33:aconst_null     
	//   16   34:putfield        #42  <Field ElementPath skip>
		} else
	//*  17   37:goto            58
		if(s != EMPTY_LIST)
	//*  18   40:aload_1         
	//*  19   41:getstatic       #36  <Field List EMPTY_LIST>
	//*  20   44:if_acmpeq       58
			callEndAction(((List) (s)), getTagName(s1, s2));
	//   21   47:aload_0         
	//   22   48:aload_1         
	//   23   49:aload_0         
	//   24   50:aload_2         
	//   25   51:aload_3         
	//   26   52:invokevirtual   #150 <Method String getTagName(String, String)>
	//   27   55:invokespecial   #152 <Method void callEndAction(List, String)>
		elementPath.pop();
	//   28   58:aload_0         
	//   29   59:getfield        #63  <Field ElementPath elementPath>
	//   30   62:invokevirtual   #154 <Method void ElementPath.pop()>
	//   31   65:return          
	}

	private void pushEmptyActionList()
	{
		actionListStack.add(((Object) (EMPTY_LIST)));
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Stack actionListStack>
	//    2    4:getstatic       #36  <Field List EMPTY_LIST>
	//    3    7:invokevirtual   #158 <Method boolean Stack.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private void startElement(String s, String s1, String s2, Attributes attributes)
	{
		s = getTagName(s1, s2);
	//    0    0:aload_0         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:invokevirtual   #150 <Method String getTagName(String, String)>
	//    4    6:astore_1        
		elementPath.push(s);
	//    5    7:aload_0         
	//    6    8:getfield        #63  <Field ElementPath elementPath>
	//    7   11:aload_1         
	//    8   12:invokevirtual   #164 <Method void ElementPath.push(String)>
		if(skip != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #42  <Field ElementPath skip>
	//*  11   19:ifnull          27
		{
			pushEmptyActionList();
	//   12   22:aload_0         
	//   13   23:invokespecial   #166 <Method void pushEmptyActionList()>
			return;
	//   14   26:return          
		}
		s1 = ((String) (getApplicableActionList(elementPath, attributes)));
	//   15   27:aload_0         
	//   16   28:aload_0         
	//   17   29:getfield        #63  <Field ElementPath elementPath>
	//   18   32:aload           4
	//   19   34:invokevirtual   #170 <Method List getApplicableActionList(ElementPath, Attributes)>
	//   20   37:astore_2        
		if(s1 != null)
	//*  21   38:aload_2         
	//*  22   39:ifnull          60
		{
			actionListStack.add(((Object) (s1)));
	//   23   42:aload_0         
	//   24   43:getfield        #68  <Field Stack actionListStack>
	//   25   46:aload_2         
	//   26   47:invokevirtual   #158 <Method boolean Stack.add(Object)>
	//   27   50:pop             
			callBeginAction(((List) (s1)), s, attributes);
	//   28   51:aload_0         
	//   29   52:aload_2         
	//   30   53:aload_1         
	//   31   54:aload           4
	//   32   56:invokevirtual   #174 <Method void callBeginAction(List, String, Attributes)>
			return;
	//   33   59:return          
		} else
		{
			pushEmptyActionList();
	//   34   60:aload_0         
	//   35   61:invokespecial   #166 <Method void pushEmptyActionList()>
			s1 = ((String) (new StringBuilder()));
	//   36   64:new             #103 <Class StringBuilder>
	//   37   67:dup             
	//   38   68:invokespecial   #104 <Method void StringBuilder()>
	//   39   71:astore_2        
			((StringBuilder) (s1)).append("no applicable action for [");
	//   40   72:aload_2         
	//   41   73:ldc1            #176 <String "no applicable action for [">
	//   42   75:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   43   78:pop             
			((StringBuilder) (s1)).append(s);
	//   44   79:aload_2         
	//   45   80:aload_1         
	//   46   81:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   47   84:pop             
			((StringBuilder) (s1)).append("], current ElementPath  is [");
	//   48   85:aload_2         
	//   49   86:ldc1            #178 <String "], current ElementPath  is [">
	//   50   88:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   51   91:pop             
			((StringBuilder) (s1)).append(((Object) (elementPath)));
	//   52   92:aload_2         
	//   53   93:aload_0         
	//   54   94:getfield        #63  <Field ElementPath elementPath>
	//   55   97:invokevirtual   #113 <Method StringBuilder StringBuilder.append(Object)>
	//   56  100:pop             
			((StringBuilder) (s1)).append("]");
	//   57  101:aload_2         
	//   58  102:ldc1            #115 <String "]">
	//   59  104:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   60  107:pop             
			s = ((StringBuilder) (s1)).toString();
	//   61  108:aload_2         
	//   62  109:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   63  112:astore_1        
			cai.addError(s);
	//   64  113:aload_0         
	//   65  114:getfield        #49  <Field CAI_WithLocatorSupport cai>
	//   66  117:aload_1         
	//   67  118:invokevirtual   #180 <Method void CAI_WithLocatorSupport.addError(String)>
			return;
	//   68  121:return          
		}
	}

	public void addImplicitAction(ImplicitAction implicitaction)
	{
		implicitActions.add(((Object) (implicitaction)));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList implicitActions>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #183 <Method boolean ArrayList.add(Object)>
	//    4    8:pop             
	//    5    9:return          
	}

	void callBeginAction(List list, String s, Attributes attributes)
	{
		if(list == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
			return;
	//    2    4:return          
		Iterator iterator = list.iterator();
	//    3    5:aload_1         
	//    4    6:invokeinterface #85  <Method Iterator List.iterator()>
	//    5   11:astore          7
		do
		{
			if(!iterator.hasNext())
				break;
	//    6   13:aload           7
	//    7   15:invokeinterface #91  <Method boolean Iterator.hasNext()>
	//    8   20:ifeq            149
			list = ((List) ((Action)iterator.next()));
	//    9   23:aload           7
	//   10   25:invokeinterface #95  <Method Object Iterator.next()>
	//   11   30:checkcast       #97  <Class Action>
	//   12   33:astore_1        
			CAI_WithLocatorSupport cai_withlocatorsupport;
			StringBuilder stringbuilder;
			String s1;
			try
			{
				((Action) (list)).begin(interpretationContext, s, attributes);
	//   13   34:aload_1         
	//   14   35:aload_0         
	//   15   36:getfield        #56  <Field InterpretationContext interpretationContext>
	//   16   39:aload_2         
	//   17   40:aload_3         
	//   18   41:invokevirtual   #187 <Method void Action.begin(InterpretationContext, String, Attributes)>
				continue;
	//   19   44:goto            13
			}
	//*  20   47:astore_1        
	//*  21   48:aload_0         
	//*  22   49:aload_0         
	//*  23   50:getfield        #63  <Field ElementPath elementPath>
	//*  24   53:invokevirtual   #191 <Method ElementPath ElementPath.duplicate()>
	//*  25   56:putfield        #42  <Field ElementPath skip>
	//*  26   59:aload_0         
	//*  27   60:getfield        #49  <Field CAI_WithLocatorSupport cai>
	//*  28   63:astore          4
	//*  29   65:new             #103 <Class StringBuilder>
	//*  30   68:dup             
	//*  31   69:invokespecial   #104 <Method void StringBuilder()>
	//*  32   72:astore          5
	//*  33   74:ldc1            #133 <String "RuntimeException in Action for tag [">
	//*  34   76:astore          6
	//*  35   78:goto            112
			// Misplaced declaration of an exception variable
			catch(List list)
	//*  36   81:astore_1        
			{
				skip = elementPath.duplicate();
	//   37   82:aload_0         
	//   38   83:aload_0         
	//   39   84:getfield        #63  <Field ElementPath elementPath>
	//   40   87:invokevirtual   #191 <Method ElementPath ElementPath.duplicate()>
	//   41   90:putfield        #42  <Field ElementPath skip>
				cai_withlocatorsupport = cai;
	//   42   93:aload_0         
	//   43   94:getfield        #49  <Field CAI_WithLocatorSupport cai>
	//   44   97:astore          4
				stringbuilder = new StringBuilder();
	//   45   99:new             #103 <Class StringBuilder>
	//   46  102:dup             
	//   47  103:invokespecial   #104 <Method void StringBuilder()>
	//   48  106:astore          5
				s1 = "ActionException in Action for tag [";
	//   49  108:ldc1            #135 <String "ActionException in Action for tag [">
	//   50  110:astore          6
			}
			// Misplaced declaration of an exception variable
			catch(List list)
			{
				skip = elementPath.duplicate();
				cai_withlocatorsupport = cai;
				stringbuilder = new StringBuilder();
				s1 = "RuntimeException in Action for tag [";
			}
			stringbuilder.append(s1);
	//   51  112:aload           5
	//   52  114:aload           6
	//   53  116:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   54  119:pop             
			stringbuilder.append(s);
	//   55  120:aload           5
	//   56  122:aload_2         
	//   57  123:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   58  126:pop             
			stringbuilder.append("]");
	//   59  127:aload           5
	//   60  129:ldc1            #115 <String "]">
	//   61  131:invokevirtual   #110 <Method StringBuilder StringBuilder.append(String)>
	//   62  134:pop             
			cai_withlocatorsupport.addError(stringbuilder.toString(), ((Throwable) (list)));
	//   63  135:aload           4
	//   64  137:aload           5
	//   65  139:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   66  142:aload_1         
	//   67  143:invokevirtual   #123 <Method void CAI_WithLocatorSupport.addError(String, Throwable)>
		} while(true);
	//   68  146:goto            13
	//   69  149:return          
	}

	public void characters(BodyEvent bodyevent)
	{
		setDocumentLocator(bodyevent.locator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #198 <Field Locator BodyEvent.locator>
	//    3    5:invokevirtual   #202 <Method void setDocumentLocator(Locator)>
		String s = bodyevent.getText();
	//    4    8:aload_1         
	//    5    9:invokevirtual   #205 <Method String BodyEvent.getText()>
	//    6   12:astore_2        
		bodyevent = ((BodyEvent) ((List)actionListStack.peek()));
	//    7   13:aload_0         
	//    8   14:getfield        #68  <Field Stack actionListStack>
	//    9   17:invokevirtual   #208 <Method Object Stack.peek()>
	//   10   20:checkcast       #81  <Class List>
	//   11   23:astore_1        
		if(s != null)
	//*  12   24:aload_2         
	//*  13   25:ifnull          46
		{
			s = s.trim();
	//   14   28:aload_2         
	//   15   29:invokevirtual   #213 <Method String String.trim()>
	//   16   32:astore_2        
			if(s.length() > 0)
	//*  17   33:aload_2         
	//*  18   34:invokevirtual   #217 <Method int String.length()>
	//*  19   37:ifle            46
				callBodyAction(((List) (bodyevent)), s);
	//   20   40:aload_0         
	//   21   41:aload_1         
	//   22   42:aload_2         
	//   23   43:invokespecial   #219 <Method void callBodyAction(List, String)>
		}
	//   24   46:return          
	}

	public void endElement(EndEvent endevent)
	{
		setDocumentLocator(endevent.locator);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getfield        #223 <Field Locator EndEvent.locator>
	//    3    5:invokevirtual   #202 <Method void setDocumentLocator(Locator)>
		endElement(endevent.namespaceURI, endevent.localName, endevent.qName);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #227 <Field String EndEvent.namespaceURI>
	//    7   13:aload_1         
	//    8   14:getfield        #230 <Field String EndEvent.localName>
	//    9   17:aload_1         
	//   10   18:getfield        #233 <Field String EndEvent.qName>
	//   11   21:invokespecial   #235 <Method void endElement(String, String, String)>
	//   12   24:return          
	}

	List getApplicableActionList(ElementPath elementpath, Attributes attributes)
	{
		List list1 = ruleStore.matchActions(elementpath);
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RuleStore ruleStore>
	//    2    4:aload_1         
	//    3    5:invokeinterface #241 <Method List RuleStore.matchActions(ElementPath)>
	//    4   10:astore          4
		List list = list1;
	//    5   12:aload           4
	//    6   14:astore_3        
		if(list1 == null)
	//*   7   15:aload           4
	//*   8   17:ifnonnull       31
			list = lookupImplicitAction(elementpath, attributes, interpretationContext);
	//    9   20:aload_0         
	//   10   21:aload_1         
	//   11   22:aload_2         
	//   12   23:aload_0         
	//   13   24:getfield        #56  <Field InterpretationContext interpretationContext>
	//   14   27:invokevirtual   #245 <Method List lookupImplicitAction(ElementPath, Attributes, InterpretationContext)>
	//   15   30:astore_3        
		return list;
	//   16   31:aload_3         
	//   17   32:areturn         
	}

	public EventPlayer getEventPlayer()
	{
		return eventPlayer;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field EventPlayer eventPlayer>
	//    2    4:areturn         
	}

	public InterpretationContext getExecutionContext()
	{
		return getInterpretationContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #253 <Method InterpretationContext getInterpretationContext()>
	//    2    4:areturn         
	}

	public InterpretationContext getInterpretationContext()
	{
		return interpretationContext;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field InterpretationContext interpretationContext>
	//    2    4:areturn         
	}

	public Locator getLocator()
	{
		return locator;
	//    0    0:aload_0         
	//    1    1:getfield        #256 <Field Locator locator>
	//    2    4:areturn         
	}

	public RuleStore getRuleStore()
	{
		return ruleStore;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field RuleStore ruleStore>
	//    2    4:areturn         
	}

	String getTagName(String s, String s1)
	{
		String s2;
label0:
		{
			if(s != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			{
				s2 = s;
	//    2    4:aload_1         
	//    3    5:astore_3        
				if(s.length() >= 1)
					break label0;
	//    4    6:aload_1         
	//    5    7:invokevirtual   #217 <Method int String.length()>
	//    6   10:iconst_1        
	//    7   11:icmpge          16
			}
			s2 = s1;
	//    8   14:aload_2         
	//    9   15:astore_3        
		}
		return s2;
	//   10   16:aload_3         
	//   11   17:areturn         
	}

	List lookupImplicitAction(ElementPath elementpath, Attributes attributes, InterpretationContext interpretationcontext)
	{
		int j = implicitActions.size();
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field ArrayList implicitActions>
	//    2    4:invokevirtual   #261 <Method int ArrayList.size()>
	//    3    7:istore          5
		for(int i = 0; i < j; i++)
	//*   4    9:iconst_0        
	//*   5   10:istore          4
	//*   6   12:iload           4
	//*   7   14:iload           5
	//*   8   16:icmpge          73
		{
			ImplicitAction implicitaction = (ImplicitAction)implicitActions.get(i);
	//    9   19:aload_0         
	//   10   20:getfield        #61  <Field ArrayList implicitActions>
	//   11   23:iload           4
	//   12   25:invokevirtual   #265 <Method Object ArrayList.get(int)>
	//   13   28:checkcast       #267 <Class ImplicitAction>
	//   14   31:astore          6
			if(implicitaction.isApplicable(elementpath, attributes, interpretationcontext))
	//*  15   33:aload           6
	//*  16   35:aload_1         
	//*  17   36:aload_2         
	//*  18   37:aload_3         
	//*  19   38:invokevirtual   #271 <Method boolean ImplicitAction.isApplicable(ElementPath, Attributes, InterpretationContext)>
	//*  20   41:ifeq            64
			{
				elementpath = ((ElementPath) (new ArrayList(1)));
	//   21   44:new             #58  <Class ArrayList>
	//   22   47:dup             
	//   23   48:iconst_1        
	//   24   49:invokespecial   #59  <Method void ArrayList(int)>
	//   25   52:astore_1        
				((List) (elementpath)).add(((Object) (implicitaction)));
	//   26   53:aload_1         
	//   27   54:aload           6
	//   28   56:invokeinterface #272 <Method boolean List.add(Object)>
	//   29   61:pop             
				return ((List) (elementpath));
	//   30   62:aload_1         
	//   31   63:areturn         
			}
		}

	//   32   64:iload           4
	//   33   66:iconst_1        
	//   34   67:iadd            
	//   35   68:istore          4
	//*  36   70:goto            12
		return null;
	//   37   73:aconst_null     
	//   38   74:areturn         
	}

	public void setDocumentLocator(Locator locator1)
	{
		locator = locator1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #256 <Field Locator locator>
	//    3    5:return          
	}

	public void setInterpretationContextPropertiesMap(Map map)
	{
		interpretationContext.setPropertiesMap(map);
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field InterpretationContext interpretationContext>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #278 <Method void InterpretationContext.setPropertiesMap(Map)>
	//    4    8:return          
	}

	public void startDocument()
	{
	//    0    0:return          
	}

	public void startElement(StartEvent startevent)
	{
		setDocumentLocator(startevent.getLocator());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #285 <Method Locator StartEvent.getLocator()>
	//    3    5:invokevirtual   #202 <Method void setDocumentLocator(Locator)>
		startElement(startevent.namespaceURI, startevent.localName, startevent.qName, startevent.attributes);
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:getfield        #286 <Field String StartEvent.namespaceURI>
	//    7   13:aload_1         
	//    8   14:getfield        #287 <Field String StartEvent.localName>
	//    9   17:aload_1         
	//   10   18:getfield        #288 <Field String StartEvent.qName>
	//   11   21:aload_1         
	//   12   22:getfield        #292 <Field Attributes StartEvent.attributes>
	//   13   25:invokespecial   #294 <Method void startElement(String, String, String, Attributes)>
	//   14   28:return          
	}

	private static List EMPTY_LIST = new Vector(0);
	Stack actionListStack;
	private final CAI_WithLocatorSupport cai;
	private ElementPath elementPath;
	EventPlayer eventPlayer;
	private final ArrayList implicitActions = new ArrayList(3);
	private final InterpretationContext interpretationContext;
	Locator locator;
	private final RuleStore ruleStore;
	ElementPath skip;

	static 
	{
	//    0    0:new             #30  <Class Vector>
	//    1    3:dup             
	//    2    4:iconst_0        
	//    3    5:invokespecial   #34  <Method void Vector(int)>
	//    4    8:putstatic       #36  <Field List EMPTY_LIST>
	//*   5   11:return          
	}
}
