// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.graphics.drawable.DrawableContainer;
import android.util.Log;
import java.lang.reflect.Method;

public class t
{

	private static boolean c(DrawableContainer drawablecontainer, android.graphics.drawable.Drawable.ConstantState constantstate)
	{
		if(!b)
	//*   0    0:getstatic       #16  <Field boolean b>
	//*   1    3:ifne            48
		{
			try
			{
				d = ((Class) (android/graphics/drawable/DrawableContainer)).getDeclaredMethod("setConstantState", new Class[] {
					android/graphics/drawable/DrawableContainer$DrawableContainerState
				});
	//    2    6:ldc1            #18  <Class DrawableContainer>
	//    3    8:ldc1            #20  <String "setConstantState">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #24  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//    9   18:aastore         
	//   10   19:invokevirtual   #28  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   22:putstatic       #30  <Field Method d>
				d.setAccessible(true);
	//   12   25:getstatic       #30  <Field Method d>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #36  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            44
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_2        
			{
				Log.e("DrawableUtils", "Could not fetch setConstantState(). Oh well.");
	//   17   36:ldc1            #38  <String "DrawableUtils">
	//   18   38:ldc1            #40  <String "Could not fetch setConstantState(). Oh well.">
	//   19   40:invokestatic    #46  <Method int Log.e(String, String)>
	//   20   43:pop             
			}
			b = true;
	//   21   44:iconst_1        
	//   22   45:putstatic       #16  <Field boolean b>
		}
		if(d == null)
			break MISSING_BLOCK_LABEL_81;
	//   23   48:getstatic       #30  <Field Method d>
	//   24   51:ifnull          81
		d.invoke(((Object) (drawablecontainer)), new Object[] {
			constantstate
		});
	//   25   54:getstatic       #30  <Field Method d>
	//   26   57:aload_0         
	//   27   58:iconst_1        
	//   28   59:anewarray       Object[]
	//   29   62:dup             
	//   30   63:iconst_0        
	//   31   64:aload_1         
	//   32   65:aastore         
	//   33   66:invokevirtual   #50  <Method Object Method.invoke(Object, Object[])>
	//   34   69:pop             
		return true;
	//   35   70:iconst_1        
	//   36   71:ireturn         
		drawablecontainer;
	//   37   72:astore_0        
		Log.e("DrawableUtils", "Could not invoke setConstantState(). Oh well.");
	//   38   73:ldc1            #38  <String "DrawableUtils">
	//   39   75:ldc1            #52  <String "Could not invoke setConstantState(). Oh well.">
	//   40   77:invokestatic    #46  <Method int Log.e(String, String)>
	//   41   80:pop             
		return false;
	//   42   81:iconst_0        
	//   43   82:ireturn         
	}

	public static boolean d(DrawableContainer drawablecontainer, android.graphics.drawable.Drawable.ConstantState constantstate)
	{
		return c(drawablecontainer, constantstate);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #55  <Method boolean c(DrawableContainer, android.graphics.drawable.Drawable$ConstantState)>
	//    3    5:ireturn         
	}

	private static boolean b;
	private static Method d;
}
