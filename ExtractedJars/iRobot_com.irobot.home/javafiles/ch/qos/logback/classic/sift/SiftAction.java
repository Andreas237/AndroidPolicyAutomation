// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.classic.sift;

import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.event.InPlayListener;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import java.util.ArrayList;
import java.util.List;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.classic.sift:
//			SiftingAppender, AppenderFactoryUsingJoran

public class SiftAction extends Action
	implements InPlayListener
{

	public SiftAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Action()>
	//    2    4:return          
	}

	public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
	{
		seList = ((List) (new ArrayList()));
	//    0    0:aload_0         
	//    1    1:new             #18  <Class ArrayList>
	//    2    4:dup             
	//    3    5:invokespecial   #19  <Method void ArrayList()>
	//    4    8:putfield        #21  <Field List seList>
		interpretationcontext.addInPlayListener(((InPlayListener) (this)));
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #27  <Method void InterpretationContext.addInPlayListener(InPlayListener)>
	//    8   16:return          
	}

	public void end(InterpretationContext interpretationcontext, String s)
	{
		interpretationcontext.removeInPlayListener(((InPlayListener) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #33  <Method boolean InterpretationContext.removeInPlayListener(InPlayListener)>
	//    3    5:pop             
		s = ((String) (interpretationcontext.peekObject()));
	//    4    6:aload_1         
	//    5    7:invokevirtual   #37  <Method Object InterpretationContext.peekObject()>
	//    6   10:astore_2        
		if(s instanceof SiftingAppender)
	//*   7   11:aload_2         
	//*   8   12:instanceof      #39  <Class SiftingAppender>
	//*   9   15:ifeq            48
		{
			s = ((String) ((SiftingAppender)s));
	//   10   18:aload_2         
	//   11   19:checkcast       #39  <Class SiftingAppender>
	//   12   22:astore_2        
			interpretationcontext = ((InterpretationContext) (interpretationcontext.getCopyOfPropertyMap()));
	//   13   23:aload_1         
	//   14   24:invokevirtual   #43  <Method java.util.Map InterpretationContext.getCopyOfPropertyMap()>
	//   15   27:astore_1        
			((SiftingAppender) (s)).setAppenderFactory(((ch.qos.logback.core.sift.AppenderFactory) (new AppenderFactoryUsingJoran(seList, ((SiftingAppender) (s)).getDiscriminatorKey(), ((java.util.Map) (interpretationcontext))))));
	//   16   28:aload_2         
	//   17   29:new             #45  <Class AppenderFactoryUsingJoran>
	//   18   32:dup             
	//   19   33:aload_0         
	//   20   34:getfield        #21  <Field List seList>
	//   21   37:aload_2         
	//   22   38:invokevirtual   #49  <Method String SiftingAppender.getDiscriminatorKey()>
	//   23   41:aload_1         
	//   24   42:invokespecial   #52  <Method void AppenderFactoryUsingJoran(List, String, java.util.Map)>
	//   25   45:invokevirtual   #56  <Method void SiftingAppender.setAppenderFactory(ch.qos.logback.core.sift.AppenderFactory)>
		}
	//   26   48:return          
	}

	public List getSeList()
	{
		return seList;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List seList>
	//    2    4:areturn         
	}

	public void inPlay(SaxEvent saxevent)
	{
		seList.add(((Object) (saxevent)));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field List seList>
	//    2    4:aload_1         
	//    3    5:invokeinterface #68  <Method boolean List.add(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	List seList;
}
