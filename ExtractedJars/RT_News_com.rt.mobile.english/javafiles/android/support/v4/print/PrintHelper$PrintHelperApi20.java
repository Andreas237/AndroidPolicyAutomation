// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.Context;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

private static class PrintHelper$PrintHelperApi20 extends PrintHelper$PrintHelperApi19
{

	PrintHelper$PrintHelperApi20(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void PrintHelper$PrintHelperApi19(Context)>
		mPrintActivityRespectsOrientation = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #18  <Field boolean mPrintActivityRespectsOrientation>
	//    6   10:return          
	}
}
