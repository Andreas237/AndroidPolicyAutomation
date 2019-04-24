// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer2.text.cea;


// Referenced classes of package com.google.android.exoplayer2.text.cea:
//			Cea608Decoder

private static class Cea608Decoder$CueBuilder$CueStyle
{

	public int start;
	public final int style;
	public final boolean underline;

	public Cea608Decoder$CueBuilder$CueStyle(int i, boolean flag, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		style = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #22  <Field int style>
		underline = flag;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #24  <Field boolean underline>
		start = j;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #26  <Field int start>
	//   11   19:return          
	}
}
