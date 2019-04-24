// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.awt.geom;


public interface PathIterator
{

	public abstract int currentSegment(double ad[]);

	public abstract int currentSegment(float af[]);

	public abstract int getWindingRule();

	public abstract boolean isDone();

	public abstract void next();

	public static final int SEG_CLOSE = 4;
	public static final int SEG_CUBICTO = 3;
	public static final int SEG_LINETO = 1;
	public static final int SEG_MOVETO = 0;
	public static final int SEG_QUADTO = 2;
	public static final int WIND_EVEN_ODD = 0;
	public static final int WIND_NON_ZERO = 1;
}
