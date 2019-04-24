// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core.joran.action;

import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import org.xml.sax.Attributes;

// Referenced classes of package ch.qos.logback.core.joran.action:
//			Action

public abstract class ImplicitAction extends Action
{

	public ImplicitAction()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #8   <Method void Action()>
	//    2    4:return          
	}

	public abstract boolean isApplicable(ElementPath elementpath, Attributes attributes, InterpretationContext interpretationcontext);
}
