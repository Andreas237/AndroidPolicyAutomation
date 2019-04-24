// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.itextpdf.text.pdf.fonts.otf;


// Referenced classes of package com.itextpdf.text.pdf.fonts.otf:
//			GlyphPositioningTableReader

static class GlyphPositioningTableReader$PosLookupRecord
{

	final int lookupListIndex;
	final int sequenceIndex;

	public GlyphPositioningTableReader$PosLookupRecord(int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
		sequenceIndex = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #17  <Field int sequenceIndex>
		lookupListIndex = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #19  <Field int lookupListIndex>
	//    8   14:return          
	}
}
