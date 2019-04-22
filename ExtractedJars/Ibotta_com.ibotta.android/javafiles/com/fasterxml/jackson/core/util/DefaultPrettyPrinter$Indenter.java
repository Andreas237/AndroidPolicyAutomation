// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.core.util:
//			DefaultPrettyPrinter

public static interface DefaultPrettyPrinter$Indenter
{

	public abstract boolean isInline();

	public abstract void writeIndentation(JsonGenerator jsongenerator, int i)
		throws IOException;
}
