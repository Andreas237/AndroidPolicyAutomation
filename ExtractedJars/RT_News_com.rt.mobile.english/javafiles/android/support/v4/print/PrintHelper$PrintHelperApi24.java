// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.Context;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

private static class PrintHelper$PrintHelperApi24 extends PrintHelper$PrintHelperApi23
{

	PrintHelper$PrintHelperApi24(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void PrintHelper$PrintHelperApi23(Context)>
		mIsMinMarginsHandlingCorrect = true;
	//    3    5:aload_0         
	//    4    6:iconst_1        
	//    5    7:putfield        #18  <Field boolean mIsMinMarginsHandlingCorrect>
		mPrintActivityRespectsOrientation = true;
	//    6   10:aload_0         
	//    7   11:iconst_1        
	//    8   12:putfield        #21  <Field boolean mPrintActivityRespectsOrientation>
	//    9   15:return          
	}
}
