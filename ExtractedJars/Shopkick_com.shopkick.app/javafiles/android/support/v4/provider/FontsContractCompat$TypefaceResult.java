// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.provider;

import android.graphics.Typeface;

// Referenced classes of package android.support.v4.provider:
//			FontsContractCompat

private static final class FontsContractCompat$TypefaceResult
{

	final int mResult;
	final Typeface mTypeface;

	FontsContractCompat$TypefaceResult(Typeface typeface, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
		mTypeface = typeface;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Typeface mTypeface>
		mResult = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #21  <Field int mResult>
	//    8   14:return          
	}
}
