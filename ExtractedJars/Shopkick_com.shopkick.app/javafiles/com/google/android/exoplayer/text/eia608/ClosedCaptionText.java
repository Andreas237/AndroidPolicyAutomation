// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.exoplayer.text.eia608;


// Referenced classes of package com.google.android.exoplayer.text.eia608:
//			ClosedCaption

final class ClosedCaptionText extends ClosedCaption
{

	public ClosedCaptionText(String s)
	{
		super(1);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #11  <Method void ClosedCaption(int)>
		text = s;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:putfield        #13  <Field String text>
	//    6   10:return          
	}

	public final String text;
}
