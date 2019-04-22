// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package butterknife;

import java.lang.annotation.Annotation;

public interface BindFont
	extends Annotation
{
	public static interface TypefaceStyle
		extends Annotation
	{
	}


	public abstract int style();

	public abstract int value();
}
