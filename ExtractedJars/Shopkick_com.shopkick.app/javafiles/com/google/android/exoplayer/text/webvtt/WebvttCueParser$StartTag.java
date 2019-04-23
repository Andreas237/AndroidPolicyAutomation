// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.webvtt;


// Referenced classes of package com.google.android.exoplayer.text.webvtt:
//			WebvttCueParser

private static final class WebvttCueParser$StartTag
{

	public final String name;
	public final int position;

	public WebvttCueParser$StartTag(String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #16  <Method void Object()>
		position = i;
	//    2    4:aload_0         
	//    3    5:iload_2         
	//    4    6:putfield        #18  <Field int position>
		name = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #20  <Field String name>
	//    8   14:return          
	}
}
