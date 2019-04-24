// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml;


// Referenced classes of package com.itextpdf.tool.xml:
//			NoCustomContextException, CustomContext, Tag

public interface WorkerContext
{

	public abstract CustomContext get(String s)
		throws NoCustomContextException;

	public abstract Tag getCurrentTag();

	public abstract void put(String s, CustomContext customcontext);

	public abstract void setCurrentTag(Tag tag);
}
