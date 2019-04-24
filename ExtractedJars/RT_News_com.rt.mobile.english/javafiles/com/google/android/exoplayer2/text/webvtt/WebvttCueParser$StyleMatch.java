// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.webvtt;


// Referenced classes of package com.google.android.exoplayer2.text.webvtt:
//			WebvttCueParser, WebvttCssStyle

private static final class WebvttCueParser$StyleMatch
	implements Comparable
{

	public int compareTo(WebvttCueParser$StyleMatch webvttcueparser$stylematch)
	{
		return score - webvttcueparser$stylematch.score;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field int score>
	//    2    4:aload_1         
	//    3    5:getfield        #21  <Field int score>
	//    4    8:isub            
	//    5    9:ireturn         
	}

	public volatile int compareTo(Object obj)
	{
		return compareTo((WebvttCueParser$StyleMatch)obj);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:checkcast       #2   <Class WebvttCueParser$StyleMatch>
	//    3    5:invokevirtual   #31  <Method int compareTo(WebvttCueParser$StyleMatch)>
	//    4    8:ireturn         
	}

	public final int score;
	public final WebvttCssStyle style;

	public WebvttCueParser$StyleMatch(int i, WebvttCssStyle webvttcssstyle)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		score = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #21  <Field int score>
		style = webvttcssstyle;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #23  <Field WebvttCssStyle style>
	//    8   14:return          
	}
}
