// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package ch.qos.logback.core;

import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.PropertyDefiner;

public abstract class PropertyDefinerBase extends ContextAwareBase
	implements PropertyDefiner
{

	public PropertyDefinerBase()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #10  <Method void ContextAwareBase()>
	//    2    4:return          
	}

	protected static String booleanAsStr(boolean flag)
	{
		Boolean boolean1;
		if(flag)
	//*   0    0:iload_0         
	//*   1    1:ifeq            13
			boolean1 = Boolean.TRUE;
	//    2    4:getstatic       #19  <Field Boolean Boolean.TRUE>
	//    3    7:astore_1        
		else
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #23  <Method String Boolean.toString()>
	//*   6   12:areturn         
			boolean1 = Boolean.FALSE;
	//    7   13:getstatic       #26  <Field Boolean Boolean.FALSE>
	//    8   16:astore_1        
		return boolean1.toString();
	//*   9   17:goto            8
	}
}
