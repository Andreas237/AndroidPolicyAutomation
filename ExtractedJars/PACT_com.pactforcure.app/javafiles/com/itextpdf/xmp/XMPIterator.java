// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.xmp;

import java.util.Iterator;

public interface XMPIterator
	extends Iterator
{

	public abstract void skipSiblings();

	public abstract void skipSubtree();
}
