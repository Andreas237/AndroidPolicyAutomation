// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.html.simpleparser;

import com.itextpdf.text.DocListener;
import com.itextpdf.text.Image;
import java.util.Map;

// Referenced classes of package com.itextpdf.text.html.simpleparser:
//			ChainedProperties

public interface ImageProcessor
{

	public abstract boolean process(Image image, Map map, ChainedProperties chainedproperties, DocListener doclistener);
}
