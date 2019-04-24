// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.spi;

import ch.qos.logback.core.joran.event.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.joran.spi:
//			Interpreter, InterpretationContext

public class EventPlayer
{

	public EventPlayer(Interpreter interpreter1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		interpreter = interpreter1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #18  <Field Interpreter interpreter>
	//    5    9:return          
	}

	public void addEventsDynamically(List list, int i)
	{
		eventList.addAll(currentIndex + i, ((java.util.Collection) (list)));
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field List eventList>
	//    2    4:aload_0         
	//    3    5:getfield        #25  <Field int currentIndex>
	//    4    8:iload_2         
	//    5    9:iadd            
	//    6   10:aload_1         
	//    7   11:invokeinterface #31  <Method boolean List.addAll(int, java.util.Collection)>
	//    8   16:pop             
	//    9   17:return          
	}

	public List getCopyOfPlayerEventList()
	{
		return ((List) (new ArrayList(((java.util.Collection) (eventList)))));
	//    0    0:new             #37  <Class ArrayList>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #23  <Field List eventList>
	//    4    8:invokespecial   #40  <Method void ArrayList(java.util.Collection)>
	//    5   11:areturn         
	}

	public void play(List list)
	{
		eventList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field List eventList>
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		do
		{
			currentIndex = i;
	//    5    7:aload_0         
	//    6    8:iload_2         
	//    7    9:putfield        #25  <Field int currentIndex>
			if(currentIndex < eventList.size())
	//*   8   12:aload_0         
	//*   9   13:getfield        #25  <Field int currentIndex>
	//*  10   16:aload_0         
	//*  11   17:getfield        #23  <Field List eventList>
	//*  12   20:invokeinterface #47  <Method int List.size()>
	//*  13   25:icmpge          142
			{
				list = ((List) ((SaxEvent)eventList.get(currentIndex)));
	//   14   28:aload_0         
	//   15   29:getfield        #23  <Field List eventList>
	//   16   32:aload_0         
	//   17   33:getfield        #25  <Field int currentIndex>
	//   18   36:invokeinterface #51  <Method Object List.get(int)>
	//   19   41:checkcast       #53  <Class SaxEvent>
	//   20   44:astore_1        
				if(list instanceof StartEvent)
	//*  21   45:aload_1         
	//*  22   46:instanceof      #55  <Class StartEvent>
	//*  23   49:ifeq            74
				{
					interpreter.startElement((StartEvent)list);
	//   24   52:aload_0         
	//   25   53:getfield        #18  <Field Interpreter interpreter>
	//   26   56:aload_1         
	//   27   57:checkcast       #55  <Class StartEvent>
	//   28   60:invokevirtual   #61  <Method void Interpreter.startElement(StartEvent)>
					interpreter.getInterpretationContext().fireInPlay(((SaxEvent) (list)));
	//   29   63:aload_0         
	//   30   64:getfield        #18  <Field Interpreter interpreter>
	//   31   67:invokevirtual   #65  <Method InterpretationContext Interpreter.getInterpretationContext()>
	//   32   70:aload_1         
	//   33   71:invokevirtual   #71  <Method void InterpretationContext.fireInPlay(SaxEvent)>
				}
				if(list instanceof BodyEvent)
	//*  34   74:aload_1         
	//*  35   75:instanceof      #73  <Class BodyEvent>
	//*  36   78:ifeq            103
				{
					interpreter.getInterpretationContext().fireInPlay(((SaxEvent) (list)));
	//   37   81:aload_0         
	//   38   82:getfield        #18  <Field Interpreter interpreter>
	//   39   85:invokevirtual   #65  <Method InterpretationContext Interpreter.getInterpretationContext()>
	//   40   88:aload_1         
	//   41   89:invokevirtual   #71  <Method void InterpretationContext.fireInPlay(SaxEvent)>
					interpreter.characters((BodyEvent)list);
	//   42   92:aload_0         
	//   43   93:getfield        #18  <Field Interpreter interpreter>
	//   44   96:aload_1         
	//   45   97:checkcast       #73  <Class BodyEvent>
	//   46  100:invokevirtual   #77  <Method void Interpreter.characters(BodyEvent)>
				}
				if(list instanceof EndEvent)
	//*  47  103:aload_1         
	//*  48  104:instanceof      #79  <Class EndEvent>
	//*  49  107:ifeq            132
				{
					interpreter.getInterpretationContext().fireInPlay(((SaxEvent) (list)));
	//   50  110:aload_0         
	//   51  111:getfield        #18  <Field Interpreter interpreter>
	//   52  114:invokevirtual   #65  <Method InterpretationContext Interpreter.getInterpretationContext()>
	//   53  117:aload_1         
	//   54  118:invokevirtual   #71  <Method void InterpretationContext.fireInPlay(SaxEvent)>
					interpreter.endElement((EndEvent)list);
	//   55  121:aload_0         
	//   56  122:getfield        #18  <Field Interpreter interpreter>
	//   57  125:aload_1         
	//   58  126:checkcast       #79  <Class EndEvent>
	//   59  129:invokevirtual   #83  <Method void Interpreter.endElement(EndEvent)>
				}
				i = currentIndex + 1;
	//   60  132:aload_0         
	//   61  133:getfield        #25  <Field int currentIndex>
	//   62  136:iconst_1        
	//   63  137:iadd            
	//   64  138:istore_2        
			} else
	//*  65  139:goto            7
			{
				return;
	//   66  142:return          
			}
		} while(true);
	}

	int currentIndex;
	List eventList;
	final Interpreter interpreter;
}
