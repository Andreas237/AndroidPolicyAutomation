// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.pattern;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.spi.*;
import ch.qos.logback.core.status.Status;
import java.util.List;

// Referenced classes of package ch.qos.logback.core.pattern:
//			FormattingConverter

public abstract class DynamicConverter extends FormattingConverter
	implements ContextAware, LifeCycle
{

	public DynamicConverter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void FormattingConverter()>
		cab = new ContextAwareBase(((ContextAware) (this)));
	//    2    4:aload_0         
	//    3    5:new             #22  <Class ContextAwareBase>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #25  <Method void ContextAwareBase(ContextAware)>
	//    7   13:putfield        #27  <Field ContextAwareBase cab>
		started = false;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #29  <Field boolean started>
	//   11   21:return          
	}

	public void addError(String s)
	{
		cab.addError(s);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #34  <Method void ContextAwareBase.addError(String)>
	//    4    8:return          
	}

	public void addError(String s, Throwable throwable)
	{
		cab.addError(s, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #37  <Method void ContextAwareBase.addError(String, Throwable)>
	//    5    9:return          
	}

	public void addInfo(String s)
	{
		cab.addInfo(s);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #40  <Method void ContextAwareBase.addInfo(String)>
	//    4    8:return          
	}

	public void addInfo(String s, Throwable throwable)
	{
		cab.addInfo(s, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #42  <Method void ContextAwareBase.addInfo(String, Throwable)>
	//    5    9:return          
	}

	public void addStatus(Status status)
	{
		cab.addStatus(status);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #46  <Method void ContextAwareBase.addStatus(Status)>
	//    4    8:return          
	}

	public void addWarn(String s)
	{
		cab.addWarn(s);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #49  <Method void ContextAwareBase.addWarn(String)>
	//    4    8:return          
	}

	public void addWarn(String s, Throwable throwable)
	{
		cab.addWarn(s, throwable);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #51  <Method void ContextAwareBase.addWarn(String, Throwable)>
	//    5    9:return          
	}

	public Context getContext()
	{
		return cab.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:invokevirtual   #55  <Method Context ContextAwareBase.getContext()>
	//    3    7:areturn         
	}

	public String getFirstOption()
	{
		if(optionList != null && optionList.size() != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #59  <Field List optionList>
	//*   2    4:ifnull          36
	//*   3    7:aload_0         
	//*   4    8:getfield        #59  <Field List optionList>
	//*   5   11:invokeinterface #65  <Method int List.size()>
	//*   6   16:ifne            22
	//*   7   19:goto            36
			return (String)optionList.get(0);
	//    8   22:aload_0         
	//    9   23:getfield        #59  <Field List optionList>
	//   10   26:iconst_0        
	//   11   27:invokeinterface #69  <Method Object List.get(int)>
	//   12   32:checkcast       #71  <Class String>
	//   13   35:areturn         
		else
			return null;
	//   14   36:aconst_null     
	//   15   37:areturn         
	}

	protected List getOptionList()
	{
		return optionList;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field List optionList>
	//    2    4:areturn         
	}

	public boolean isStarted()
	{
		return started;
	//    0    0:aload_0         
	//    1    1:getfield        #29  <Field boolean started>
	//    2    4:ireturn         
	}

	public void setContext(Context context)
	{
		cab.setContext(context);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field ContextAwareBase cab>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #81  <Method void ContextAwareBase.setContext(Context)>
	//    4    8:return          
	}

	public void setOptionList(List list)
	{
		optionList = list;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field List optionList>
	//    3    5:return          
	}

	public void start()
	{
		started = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #29  <Field boolean started>
	//    3    5:return          
	}

	public void stop()
	{
		started = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #29  <Field boolean started>
	//    3    5:return          
	}

	ContextAwareBase cab;
	private List optionList;
	protected boolean started;
}
