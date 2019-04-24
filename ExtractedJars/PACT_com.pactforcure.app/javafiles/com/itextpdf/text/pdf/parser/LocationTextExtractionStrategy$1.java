// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.parser;


// Referenced classes of package com.itextpdf.text.pdf.parser:
//			LocationTextExtractionStrategy, LineSegment, TextRenderInfo

class LocationTextExtractionStrategy$1
	implements xtChunkLocationStrategy
{

	public xtChunkLocation createLocation(TextRenderInfo textrenderinfo, LineSegment linesegment)
	{
		return ((xtChunkLocation) (new xtChunkLocationDefaultImp(linesegment.getStartPoint(), linesegment.getEndPoint(), textrenderinfo.getSingleSpaceWidth())));
	//    0    0:new             #17  <Class LocationTextExtractionStrategy$TextChunkLocationDefaultImp>
	//    1    3:dup             
	//    2    4:aload_2         
	//    3    5:invokevirtual   #23  <Method Vector LineSegment.getStartPoint()>
	//    4    8:aload_2         
	//    5    9:invokevirtual   #26  <Method Vector LineSegment.getEndPoint()>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #32  <Method float TextRenderInfo.getSingleSpaceWidth()>
	//    8   16:invokespecial   #35  <Method void LocationTextExtractionStrategy$TextChunkLocationDefaultImp(Vector, Vector, float)>
	//    9   19:areturn         
	}

	LocationTextExtractionStrategy$1()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
