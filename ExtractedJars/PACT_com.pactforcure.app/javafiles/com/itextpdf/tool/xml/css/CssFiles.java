// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.tool.xml.css;

import com.itextpdf.tool.xml.Tag;
import java.util.Map;

// Referenced classes of package com.itextpdf.tool.xml.css:
//			CssFile

public interface CssFiles
{

	public abstract void add(CssFile cssfile);

	public abstract void clear();

	public abstract Map getCSS(Tag tag);

	public abstract boolean hasFiles();
}
