// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.extractor.webm;


// Referenced classes of package com.google.android.exoplayer.extractor.webm:
//			DefaultEbmlReader

private static final class DefaultEbmlReader$MasterElement
{

	private final long elementEndPosition;
	private final int elementId;


/*
	static long access$000(DefaultEbmlReader$MasterElement defaultebmlreader$masterelement)
	{
		return defaultebmlreader$masterelement.elementEndPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field long elementEndPosition>
	//    2    4:lreturn         
	}

*/


/*
	static int access$100(DefaultEbmlReader$MasterElement defaultebmlreader$masterelement)
	{
		return defaultebmlreader$masterelement.elementId;
	//    0    0:aload_0         
	//    1    1:getfield        #18  <Field int elementId>
	//    2    4:ireturn         
	}

*/

	private DefaultEbmlReader$MasterElement(int i, long l)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		elementId = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #18  <Field int elementId>
		elementEndPosition = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #20  <Field long elementEndPosition>
	//    8   14:return          
	}

	DefaultEbmlReader$MasterElement(int i, long l, DefaultEbmlReader._cls1 _pcls1)
	{
		this(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #24  <Method void DefaultEbmlReader$MasterElement(int, long)>
	//    4    6:return          
	}
}
