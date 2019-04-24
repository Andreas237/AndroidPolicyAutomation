// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			LocationTextExtractionStrategy, Vector

public static interface LocationTextExtractionStrategy$TextChunkLocation
	extends Comparable
{

	public abstract float distParallelEnd();

	public abstract float distParallelStart();

	public abstract int distPerpendicular();

	public abstract float distanceFromEndOf(LocationTextExtractionStrategy$TextChunkLocation locationtextextractionstrategy$textchunklocation);

	public abstract float getCharSpaceWidth();

	public abstract Vector getEndLocation();

	public abstract Vector getStartLocation();

	public abstract boolean isAtWordBoundary(LocationTextExtractionStrategy$TextChunkLocation locationtextextractionstrategy$textchunklocation);

	public abstract int orientationMagnitude();

	public abstract boolean sameLine(LocationTextExtractionStrategy$TextChunkLocation locationtextextractionstrategy$textchunklocation);
}
