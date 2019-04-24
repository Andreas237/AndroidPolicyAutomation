// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.joran.action;

import ch.qos.logback.core.joran.action.AbstractIncludeAction;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import java.io.FileNotFoundException;
import java.net.URL;
import java.net.UnknownHostException;
import org.xml.sax.Attributes;

public class ConditionalIncludeAction extends AbstractIncludeAction
{
	class State
	{

		URL getUrl()
		{
			return url;
		//    0    0:aload_0         
		//    1    1:getfield        #23  <Field URL url>
		//    2    4:areturn         
		}

		void setUrl(URL url1)
		{
			url = url1;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #23  <Field URL url>
		//    3    5:return          
		}

		final ConditionalIncludeAction this$0;
		private URL url;

		State()
		{
			this$0 = ConditionalIncludeAction.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field ConditionalIncludeAction this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}


	public ConditionalIncludeAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void AbstractIncludeAction()>
	//    2    4:return          
	}

	private URL peekPath(InterpretationContext interpretationcontext)
	{
		if(!interpretationcontext.isEmpty())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #20  <Method boolean InterpretationContext.isEmpty()>
	//*   2    4:ifne            33
		{
			interpretationcontext = ((InterpretationContext) (interpretationcontext.peekObject()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #24  <Method Object InterpretationContext.peekObject()>
	//    5   11:astore_1        
			if(interpretationcontext instanceof State)
	//*   6   12:aload_1         
	//*   7   13:instanceof      #6   <Class ConditionalIncludeAction$State>
	//*   8   16:ifeq            33
			{
				interpretationcontext = ((InterpretationContext) (((State)interpretationcontext).getUrl()));
	//    9   19:aload_1         
	//   10   20:checkcast       #6   <Class ConditionalIncludeAction$State>
	//   11   23:invokevirtual   #28  <Method URL ConditionalIncludeAction$State.getUrl()>
	//   12   26:astore_1        
				if(interpretationcontext != null)
	//*  13   27:aload_1         
	//*  14   28:ifnull          33
					return ((URL) (interpretationcontext));
	//   15   31:aload_1         
	//   16   32:areturn         
			}
		}
		return null;
	//   17   33:aconst_null     
	//   18   34:areturn         
	}

	private URL pushPath(InterpretationContext interpretationcontext, URL url)
	{
		State state = new State();
	//    0    0:new             #6   <Class ConditionalIncludeAction$State>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #33  <Method void ConditionalIncludeAction$State(ConditionalIncludeAction)>
	//    4    8:astore_3        
		state.setUrl(url);
	//    5    9:aload_3         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #37  <Method void ConditionalIncludeAction$State.setUrl(URL)>
		interpretationcontext.pushObject(((Object) (state)));
	//    8   14:aload_1         
	//    9   15:aload_3         
	//   10   16:invokevirtual   #41  <Method void InterpretationContext.pushObject(Object)>
		return url;
	//   11   19:aload_2         
	//   12   20:areturn         
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		if(peekPath(interpretationcontext) != null)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokespecial   #45  <Method URL peekPath(InterpretationContext)>
	//*   3    5:ifnull          9
		{
			return;
	//    4    8:return          
		} else
		{
			super.begin(interpretationcontext, s, attributes);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:aload_2         
	//    8   12:aload_3         
	//    9   13:invokespecial   #47  <Method void AbstractIncludeAction.begin(InterpretationContext, String, Attributes)>
			return;
	//   10   16:return          
		}
	}

	protected void handleError(String s, Exception exception)
	{
		if(exception != null && !(exception instanceof FileNotFoundException) && !(exception instanceof UnknownHostException))
	//*   0    0:aload_2         
	//*   1    1:ifnull          25
	//*   2    4:aload_2         
	//*   3    5:instanceof      #51  <Class FileNotFoundException>
	//*   4    8:ifne            25
	//*   5   11:aload_2         
	//*   6   12:instanceof      #53  <Class UnknownHostException>
	//*   7   15:ifne            25
		{
			addWarn(s, ((Throwable) (exception)));
	//    8   18:aload_0         
	//    9   19:aload_1         
	//   10   20:aload_2         
	//   11   21:invokevirtual   #57  <Method void addWarn(String, Throwable)>
			return;
	//   12   24:return          
		} else
		{
			addInfo(s);
	//   13   25:aload_0         
	//   14   26:aload_1         
	//   15   27:invokevirtual   #61  <Method void addInfo(String)>
			return;
	//   16   30:return          
		}
	}

	protected void processInclude(InterpretationContext interpretationcontext, URL url)
	{
		pushPath(interpretationcontext, url);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #65  <Method URL pushPath(InterpretationContext, URL)>
	//    4    6:pop             
	//    5    7:return          
	}
}
