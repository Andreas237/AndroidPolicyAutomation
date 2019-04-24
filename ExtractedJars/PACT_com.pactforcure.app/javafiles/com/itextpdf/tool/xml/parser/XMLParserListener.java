// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.parser;

import java.util.Map;

public interface XMLParserListener
{

	public abstract void close();

	public abstract void comment(String s);

	public abstract void endElement(String s, String s1);

	public abstract void init();

	public abstract void startElement(String s, Map map, String s1);

	public abstract void text(String s);

	public abstract void unknownText(String s);
}
