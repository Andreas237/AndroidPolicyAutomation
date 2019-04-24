// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.Context;

// Referenced classes of package android.support.v4.print:
//			PrintHelperKitkat

class PrintHelperApi20 extends PrintHelperKitkat
{

	PrintHelperApi20(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void PrintHelperKitkat(Context)>
		mPrintActivityRespectsOrientation = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field boolean mPrintActivityRespectsOrientation>
	//    6   10:return          
	}
}
