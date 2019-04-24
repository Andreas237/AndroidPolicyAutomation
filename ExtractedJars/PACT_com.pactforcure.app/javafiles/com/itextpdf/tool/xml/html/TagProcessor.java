// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.WorkerContext;
import java.util.List;

public interface TagProcessor
{

	public abstract List content(WorkerContext workercontext, Tag tag, String s);

	public abstract List endElement(WorkerContext workercontext, Tag tag, List list);

	public abstract boolean isStackOwner();

	public abstract List startElement(WorkerContext workercontext, Tag tag);
}
