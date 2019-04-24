// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.xml.simpleparser;

import java.util.Map;

public interface SimpleXMLDocHandler
{

	public abstract void endDocument();

	public abstract void endElement(String s);

	public abstract void startDocument();

	public abstract void startElement(String s, Map map);

	public abstract void text(String s);
}
