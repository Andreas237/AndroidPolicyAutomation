// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.print;


public final class PrintHelper
{
	public static interface OnPrintFinishCallback
	{

		public abstract void onFinish();
	}


	static final boolean IS_MIN_MARGINS_HANDLING_CORRECT;
	static final boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		boolean flag1 = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		boolean flag;
		if(i >= 20 && android.os.Build.VERSION.SDK_INT <= 23)
	//*   4    6:iload_0         
	//*   5    7:bipush          20
	//*   6    9:icmplt          28
	//*   7   12:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*   8   15:bipush          23
	//*   9   17:icmple          23
	//*  10   20:goto            28
			flag = false;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		else
	//*  13   25:goto            30
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_1        
		PRINT_ACTIVITY_RESPECTS_ORIENTATION = flag;
	//   16   30:iload_1         
	//   17   31:putstatic       #20  <Field boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION>
		flag = flag1;
	//   18   34:iload_2         
	//   19   35:istore_1        
		if(android.os.Build.VERSION.SDK_INT != 23)
	//*  20   36:getstatic       #18  <Field int android.os.Build$VERSION.SDK_INT>
	//*  21   39:bipush          23
	//*  22   41:icmpeq          46
			flag = true;
	//   23   44:iconst_1        
	//   24   45:istore_1        
		IS_MIN_MARGINS_HANDLING_CORRECT = flag;
	//   25   46:iload_1         
	//   26   47:putstatic       #22  <Field boolean IS_MIN_MARGINS_HANDLING_CORRECT>
	//*  27   50:return          
	}
}
