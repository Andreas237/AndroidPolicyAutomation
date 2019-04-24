// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.html;

import com.itextpdf.text.Element;
import com.itextpdf.tool.xml.Tag;
import com.itextpdf.tool.xml.css.apply.*;
import com.itextpdf.tool.xml.pipeline.html.HtmlPipelineContext;

public interface CssAppliers
{

	public abstract Element apply(Element element, Tag tag, MarginMemory marginmemory, PageSizeContainable pagesizecontainable, HtmlPipelineContext htmlpipelinecontext);

	public abstract Element apply(Element element, Tag tag, HtmlPipelineContext htmlpipelinecontext);

	public abstract CssAppliers clone();

	public abstract ChunkCssApplier getChunkCssAplier();

	public abstract void setChunkCssAplier(ChunkCssApplier chunkcssapplier);
}
