// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			DefaultPrettyPrinter

public static class DefaultPrettyPrinter$NopIndenter
	implements DefaultPrettyPrinter.Indenter, Serializable
{

	public boolean isInline()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void writeIndentation(JsonGenerator jsongenerator, int i)
		throws IOException
	{
	//    0    0:return          
	}

	public static final DefaultPrettyPrinter$NopIndenter instance = new DefaultPrettyPrinter$NopIndenter();

	static 
	{
	//    0    0:new             #2   <Class DefaultPrettyPrinter$NopIndenter>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void DefaultPrettyPrinter$NopIndenter()>
	//    3    7:putstatic       #20  <Field DefaultPrettyPrinter$NopIndenter instance>
	//*   4   10:return          
	}

	public DefaultPrettyPrinter$NopIndenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
	//    2    4:return          
	}
}
