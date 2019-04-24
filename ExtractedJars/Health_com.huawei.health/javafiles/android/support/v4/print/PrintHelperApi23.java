// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;

import android.content.Context;
import android.print.PrintAttributes;

// Referenced classes of package android.support.v4.print:
//			PrintHelperApi20

class PrintHelperApi23 extends PrintHelperApi20
{

	PrintHelperApi23(Context context)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #11  <Method void PrintHelperApi20(Context)>
		mIsMinMarginsHandlingCorrect = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #15  <Field boolean mIsMinMarginsHandlingCorrect>
	//    6   10:return          
	}

	protected android.print.PrintAttributes.Builder copyAttributes(PrintAttributes printattributes)
	{
		android.print.PrintAttributes.Builder builder = super.copyAttributes(printattributes);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #20  <Method android.print.PrintAttributes$Builder PrintHelperApi20.copyAttributes(PrintAttributes)>
	//    3    5:astore_2        
		if(printattributes.getDuplexMode() != 0)
	//*   4    6:aload_1         
	//*   5    7:invokevirtual   #26  <Method int PrintAttributes.getDuplexMode()>
	//*   6   10:ifeq            22
			builder.setDuplexMode(printattributes.getDuplexMode());
	//    7   13:aload_2         
	//    8   14:aload_1         
	//    9   15:invokevirtual   #26  <Method int PrintAttributes.getDuplexMode()>
	//   10   18:invokevirtual   #32  <Method android.print.PrintAttributes$Builder android.print.PrintAttributes$Builder.setDuplexMode(int)>
	//   11   21:pop             
		return builder;
	//   12   22:aload_2         
	//   13   23:areturn         
	}
}
