// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.filter;

import ch.qos.logback.core.boolex.EvaluationException;
import ch.qos.logback.core.boolex.EventEvaluator;
import ch.qos.logback.core.spi.FilterReply;

// Referenced classes of package ch.qos.logback.core.filter:
//			AbstractMatcherFilter

public class EvaluatorFilter extends AbstractMatcherFilter
{

	public EvaluatorFilter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void AbstractMatcherFilter()>
	//    2    4:return          
	}

	public FilterReply decide(Object obj)
	{
		if(isStarted() && evaluator.isStarted())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #21  <Method boolean isStarted()>
	//*   2    4:ifeq            97
	//*   3    7:aload_0         
	//*   4    8:getfield        #23  <Field EventEvaluator evaluator>
	//*   5   11:invokeinterface #26  <Method boolean EventEvaluator.isStarted()>
	//*   6   16:ifne            22
	//*   7   19:goto            97
		{
			try
			{
				if(evaluator.evaluate(obj))
	//*   8   22:aload_0         
	//*   9   23:getfield        #23  <Field EventEvaluator evaluator>
	//*  10   26:aload_1         
	//*  11   27:invokeinterface #30  <Method boolean EventEvaluator.evaluate(Object)>
	//*  12   32:ifeq            40
					return onMatch;
	//   13   35:aload_0         
	//   14   36:getfield        #34  <Field FilterReply onMatch>
	//   15   39:areturn         
				obj = ((Object) (onMismatch));
	//   16   40:aload_0         
	//   17   41:getfield        #37  <Field FilterReply onMismatch>
	//   18   44:astore_1        
			}
	//*  19   45:aload_1         
	//*  20   46:areturn         
			// Misplaced declaration of an exception variable
			catch(Object obj)
	//*  21   47:astore_1        
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   22   48:new             #39  <Class StringBuilder>
	//   23   51:dup             
	//   24   52:invokespecial   #40  <Method void StringBuilder()>
	//   25   55:astore_2        
				stringbuilder.append("Evaluator ");
	//   26   56:aload_2         
	//   27   57:ldc1            #42  <String "Evaluator ">
	//   28   59:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
				stringbuilder.append(evaluator.getName());
	//   30   63:aload_2         
	//   31   64:aload_0         
	//   32   65:getfield        #23  <Field EventEvaluator evaluator>
	//   33   68:invokeinterface #50  <Method String EventEvaluator.getName()>
	//   34   73:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   35   76:pop             
				stringbuilder.append(" threw an exception");
	//   36   77:aload_2         
	//   37   78:ldc1            #52  <String " threw an exception">
	//   38   80:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   39   83:pop             
				addError(stringbuilder.toString(), ((Throwable) (obj)));
	//   40   84:aload_0         
	//   41   85:aload_2         
	//   42   86:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   43   89:aload_1         
	//   44   90:invokevirtual   #59  <Method void addError(String, Throwable)>
				return FilterReply.NEUTRAL;
	//   45   93:getstatic       #64  <Field FilterReply FilterReply.NEUTRAL>
	//   46   96:areturn         
			}
			return ((FilterReply) (obj));
		} else
		{
			return FilterReply.NEUTRAL;
	//   47   97:getstatic       #64  <Field FilterReply FilterReply.NEUTRAL>
	//   48  100:areturn         
		}
	}

	public EventEvaluator getEvaluator()
	{
		return evaluator;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field EventEvaluator evaluator>
	//    2    4:areturn         
	}

	public void setEvaluator(EventEvaluator eventevaluator)
	{
		evaluator = eventevaluator;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #23  <Field EventEvaluator evaluator>
	//    3    5:return          
	}

	public void start()
	{
		if(evaluator != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #23  <Field EventEvaluator evaluator>
	//*   2    4:ifnull          12
		{
			super.start();
	//    3    7:aload_0         
	//    4    8:invokespecial   #75  <Method void AbstractMatcherFilter.start()>
			return;
	//    5   11:return          
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    6   12:new             #39  <Class StringBuilder>
	//    7   15:dup             
	//    8   16:invokespecial   #40  <Method void StringBuilder()>
	//    9   19:astore_1        
			stringbuilder.append("No evaluator set for filter ");
	//   10   20:aload_1         
	//   11   21:ldc1            #77  <String "No evaluator set for filter ">
	//   12   23:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   13   26:pop             
			stringbuilder.append(getName());
	//   14   27:aload_1         
	//   15   28:aload_0         
	//   16   29:invokevirtual   #78  <Method String getName()>
	//   17   32:invokevirtual   #46  <Method StringBuilder StringBuilder.append(String)>
	//   18   35:pop             
			addError(stringbuilder.toString());
	//   19   36:aload_0         
	//   20   37:aload_1         
	//   21   38:invokevirtual   #55  <Method String StringBuilder.toString()>
	//   22   41:invokevirtual   #81  <Method void addError(String)>
			return;
	//   23   44:return          
		}
	}

	EventEvaluator evaluator;
}
