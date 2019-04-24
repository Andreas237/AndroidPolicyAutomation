// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.Context;
import android.print.PrintAttributes;

// Referenced classes of package android.support.v4.print:
//			PrintHelper

private static class PrintHelper$PrintHelperApi23 extends PrintHelper$PrintHelperApi20
{

	protected android.print.PrintAttributes.Builder copyAttributes(PrintAttributes printattributes)
	{
		android.print.PrintAttributes.Builder builder = super.copyAttributes(printattributes);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method android.print.PrintAttributes$Builder PrintHelper$PrintHelperApi20.copyAttributes(PrintAttributes)>
	//    3    5:astore_2        
		if(printattributes.getDuplexMode() != 0)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #29  <Method int PrintAttributes.getDuplexMode()>
	//*   6   10:ifeq            22
			builder.setDuplexMode(printattributes.getDuplexMode());
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #29  <Method int PrintAttributes.getDuplexMode()>
	//   10   18:invokevirtual   #35  <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setDuplexMode(int)>
	//   11   21:pop             
		return builder;
	//   12   22:aload_2         
	//   13   23:areturn         
	}

	PrintHelper$PrintHelperApi23(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #14  <Method void PrintHelper$PrintHelperApi20(Context)>
		mIsMinMarginsHandlingCorrect = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #18  <Field boolean mIsMinMarginsHandlingCorrect>
	//    6   10:return          
	}
}
