// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.res.TypedArray;

public class aa
{

	aa()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}

	public static void b(Context context)
	{
		context = ((Context) (context.obtainStyledAttributes(e)));
	//    0    0:aload_0         
	//    1    1:getstatic       #16  <Field int[] e>
	//    2    4:invokevirtual   #28  <Method TypedArray Context.obtainStyledAttributes(int[])>
	//    3    7:astore_0        
		boolean flag;
		if(!((TypedArray) (context)).hasValue(0))
	//*   4    8:aload_0         
	//*   5    9:iconst_0        
	//*   6   10:invokevirtual   #34  <Method boolean TypedArray.hasValue(int)>
	//*   7   13:ifne            21
			flag = true;
	//    8   16:iconst_1        
	//    9   17:istore_1        
		else
	//*  10   18:goto            23
			flag = false;
	//   11   21:iconst_0        
	//   12   22:istore_1        
		if(context != null)
	//*  13   23:aload_0         
	//*  14   24:ifnull          31
			((TypedArray) (context)).recycle();
	//   15   27:aload_0         
	//   16   28:invokevirtual   #37  <Method void TypedArray.recycle()>
		if(flag)
	//*  17   31:iload_1         
	//*  18   32:ifeq            45
			throw new IllegalArgumentException("You need to use a Theme.AppCompat theme (or descendant) with the design library.");
	//   19   35:new             #39  <Class IllegalArgumentException>
	//   20   38:dup             
	//   21   39:ldc1            #41  <String "You need to use a Theme.AppCompat theme (or descendant) with the design library.">
	//   22   41:invokespecial   #44  <Method void IllegalArgumentException(String)>
	//   23   44:athrow          
		else
			return;
	//   24   45:return          
	}

	private static final int e[];

	static 
	{
		e = (new int[] {
			android.support.v7.appcompat.R.attr.colorPrimary
		});
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:getstatic       #14  <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//    5    8:iastore         
	//    6    9:putstatic       #16  <Field int[] e>
	//*   7   12:return          
	}
}
