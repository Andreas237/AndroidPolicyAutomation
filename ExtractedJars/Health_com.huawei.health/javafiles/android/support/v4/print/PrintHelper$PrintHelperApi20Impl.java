// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.Context;

// Referenced classes of package android.support.v4.print:
//			PrintHelper, PrintHelperApi20

static final class PrintHelper$PrintHelperApi20Impl extends PrintHelper.PrintHelperImpl
{

	PrintHelper$PrintHelperApi20Impl(Context context)
	{
		super(((PrintHelperKitkat) (new PrintHelperApi20(context))));
	//    0    0:aload_0         
	//    1    1:new             #12  <Class PrintHelperApi20>
	//    2    4:dup             
	//    3    5:aload_1         
	//    4    6:invokespecial   #14  <Method void PrintHelperApi20(Context)>
	//    5    9:invokespecial   #17  <Method void PrintHelper$PrintHelperImpl(PrintHelperKitkat)>
	//    6   12:return          
	}
}
