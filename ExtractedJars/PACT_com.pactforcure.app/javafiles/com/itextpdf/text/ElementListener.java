// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text;

import java.util.EventListener;

// Referenced classes of package com.itextpdf.text:
//			DocumentException, Element

public interface ElementListener
	extends EventListener
{

	public abstract boolean add(Element element)
		throws DocumentException;
}
