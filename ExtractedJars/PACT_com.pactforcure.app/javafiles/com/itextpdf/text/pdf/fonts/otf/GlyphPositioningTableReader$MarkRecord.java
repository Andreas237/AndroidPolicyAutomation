// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.otf;


// Referenced classes of package com.itextpdf.text.pdf.fonts.otf:
//			GlyphPositioningTableReader

static class GlyphPositioningTableReader$MarkRecord
{

	final int markAnchorOffset;
	final int markClass;

	public GlyphPositioningTableReader$MarkRecord(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		markClass = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int markClass>
		markAnchorOffset = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int markAnchorOffset>
	//    8   14:return          
	}
}
