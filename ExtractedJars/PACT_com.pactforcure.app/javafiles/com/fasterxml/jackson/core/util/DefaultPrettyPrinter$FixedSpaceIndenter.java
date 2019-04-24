// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			DefaultPrettyPrinter

public static class DefaultPrettyPrinter$FixedSpaceIndenter extends DefaultPrettyPrinter.NopIndenter
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
		jsongenerator.writeRaw(' ');
	//    0    0:aload_1         
	//    1    1:bipush          32
	//    2    3:invokevirtual   #30  <Method void JsonGenerator.writeRaw(char)>
	//    3    6:return          
	}

	public static final DefaultPrettyPrinter$FixedSpaceIndenter instance = new DefaultPrettyPrinter$FixedSpaceIndenter();

	static 
	{
	//    0    0:new             #2   <Class DefaultPrettyPrinter$FixedSpaceIndenter>
	//    1    3:dup             
	//    2    4:invokespecial   #14  <Method void DefaultPrettyPrinter$FixedSpaceIndenter()>
	//    3    7:putstatic       #16  <Field DefaultPrettyPrinter$FixedSpaceIndenter instance>
	//*   4   10:return          
	}

	public DefaultPrettyPrinter$FixedSpaceIndenter()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void DefaultPrettyPrinter$NopIndenter()>
	//    2    4:return          
	}
}
