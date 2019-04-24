// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.widget:
//			DrawerLayoutImpl

class DrawerLayoutCompatApi21
{
	static class InsetsListener
		implements android.view.View.OnApplyWindowInsetsListener
	{

		public WindowInsets onApplyWindowInsets(View view, WindowInsets windowinsets)
		{
			view = ((View) ((DrawerLayoutImpl)view));
		//    0    0:aload_1         
		//    1    1:checkcast       #18  <Class DrawerLayoutImpl>
		//    2    4:astore_1        
			boolean flag;
			if(windowinsets.getSystemWindowInsetTop() > 0)
		//*   3    5:aload_2         
		//*   4    6:invokevirtual   #24  <Method int WindowInsets.getSystemWindowInsetTop()>
		//*   5    9:ifle            17
				flag = true;
		//    6   12:iconst_1        
		//    7   13:istore_3        
			else
		//*   8   14:goto            19
				flag = false;
		//    9   17:iconst_0        
		//   10   18:istore_3        
			((DrawerLayoutImpl) (view)).setChildInsets(((Object) (windowinsets)), flag);
		//   11   19:aload_1         
		//   12   20:aload_2         
		//   13   21:iload_3         
		//   14   22:invokeinterface #28  <Method void DrawerLayoutImpl.setChildInsets(Object, boolean)>
			return windowinsets.consumeSystemWindowInsets();
		//   15   27:aload_2         
		//   16   28:invokevirtual   #32  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
		//   17   31:areturn         
		}

		InsetsListener()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}


	DrawerLayoutCompatApi21()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	public static void applyMarginInsets(android.view.ViewGroup.MarginLayoutParams marginlayoutparams, Object obj, int i)
	{
		WindowInsets windowinsets = (WindowInsets)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #25  <Class WindowInsets>
	//    2    4:astore_3        
		if(i == 3)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:icmpne          31
		{
			obj = ((Object) (windowinsets.replaceSystemWindowInsets(windowinsets.getSystemWindowInsetLeft(), windowinsets.getSystemWindowInsetTop(), 0, windowinsets.getSystemWindowInsetBottom())));
	//    6   10:aload_3         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #29  <Method int WindowInsets.getSystemWindowInsetLeft()>
	//    9   15:aload_3         
	//   10   16:invokevirtual   #32  <Method int WindowInsets.getSystemWindowInsetTop()>
	//   11   19:iconst_0        
	//   12   20:aload_3         
	//   13   21:invokevirtual   #35  <Method int WindowInsets.getSystemWindowInsetBottom()>
	//   14   24:invokevirtual   #39  <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//   15   27:astore_1        
		} else
	//*  16   28:goto            56
		{
			obj = ((Object) (windowinsets));
	//   17   31:aload_3         
	//   18   32:astore_1        
			if(i == 5)
	//*  19   33:iload_2         
	//*  20   34:iconst_5        
	//*  21   35:icmpne          56
				obj = ((Object) (windowinsets.replaceSystemWindowInsets(0, windowinsets.getSystemWindowInsetTop(), windowinsets.getSystemWindowInsetRight(), windowinsets.getSystemWindowInsetBottom())));
	//   22   38:aload_3         
	//   23   39:iconst_0        
	//   24   40:aload_3         
	//   25   41:invokevirtual   #32  <Method int WindowInsets.getSystemWindowInsetTop()>
	//   26   44:aload_3         
	//   27   45:invokevirtual   #42  <Method int WindowInsets.getSystemWindowInsetRight()>
	//   28   48:aload_3         
	//   29   49:invokevirtual   #35  <Method int WindowInsets.getSystemWindowInsetBottom()>
	//   30   52:invokevirtual   #39  <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//   31   55:astore_1        
		}
		marginlayoutparams.leftMargin = ((WindowInsets) (obj)).getSystemWindowInsetLeft();
	//   32   56:aload_0         
	//   33   57:aload_1         
	//   34   58:invokevirtual   #29  <Method int WindowInsets.getSystemWindowInsetLeft()>
	//   35   61:putfield        #48  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
		marginlayoutparams.topMargin = ((WindowInsets) (obj)).getSystemWindowInsetTop();
	//   36   64:aload_0         
	//   37   65:aload_1         
	//   38   66:invokevirtual   #32  <Method int WindowInsets.getSystemWindowInsetTop()>
	//   39   69:putfield        #51  <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
		marginlayoutparams.rightMargin = ((WindowInsets) (obj)).getSystemWindowInsetRight();
	//   40   72:aload_0         
	//   41   73:aload_1         
	//   42   74:invokevirtual   #42  <Method int WindowInsets.getSystemWindowInsetRight()>
	//   43   77:putfield        #54  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
		marginlayoutparams.bottomMargin = ((WindowInsets) (obj)).getSystemWindowInsetBottom();
	//   44   80:aload_0         
	//   45   81:aload_1         
	//   46   82:invokevirtual   #35  <Method int WindowInsets.getSystemWindowInsetBottom()>
	//   47   85:putfield        #57  <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   48   88:return          
	}

	public static void configureApplyInsets(View view)
	{
		if(view instanceof DrawerLayoutImpl)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #61  <Class DrawerLayoutImpl>
	//*   2    4:ifeq            25
		{
			view.setOnApplyWindowInsetsListener(((android.view.View.OnApplyWindowInsetsListener) (new InsetsListener())));
	//    3    7:aload_0         
	//    4    8:new             #6   <Class DrawerLayoutCompatApi21$InsetsListener>
	//    5   11:dup             
	//    6   12:invokespecial   #62  <Method void DrawerLayoutCompatApi21$InsetsListener()>
	//    7   15:invokevirtual   #68  <Method void View.setOnApplyWindowInsetsListener(android.view.View$OnApplyWindowInsetsListener)>
			view.setSystemUiVisibility(1280);
	//    8   18:aload_0         
	//    9   19:sipush          1280
	//   10   22:invokevirtual   #72  <Method void View.setSystemUiVisibility(int)>
		}
	//   11   25:return          
	}

	public static void dispatchChildInsets(View view, Object obj, int i)
	{
		WindowInsets windowinsets = (WindowInsets)obj;
	//    0    0:aload_1         
	//    1    1:checkcast       #25  <Class WindowInsets>
	//    2    4:astore_3        
		if(i == 3)
	//*   3    5:iload_2         
	//*   4    6:iconst_3        
	//*   5    7:icmpne          31
		{
			obj = ((Object) (windowinsets.replaceSystemWindowInsets(windowinsets.getSystemWindowInsetLeft(), windowinsets.getSystemWindowInsetTop(), 0, windowinsets.getSystemWindowInsetBottom())));
	//    6   10:aload_3         
	//    7   11:aload_3         
	//    8   12:invokevirtual   #29  <Method int WindowInsets.getSystemWindowInsetLeft()>
	//    9   15:aload_3         
	//   10   16:invokevirtual   #32  <Method int WindowInsets.getSystemWindowInsetTop()>
	//   11   19:iconst_0        
	//   12   20:aload_3         
	//   13   21:invokevirtual   #35  <Method int WindowInsets.getSystemWindowInsetBottom()>
	//   14   24:invokevirtual   #39  <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//   15   27:astore_1        
		} else
	//*  16   28:goto            56
		{
			obj = ((Object) (windowinsets));
	//   17   31:aload_3         
	//   18   32:astore_1        
			if(i == 5)
	//*  19   33:iload_2         
	//*  20   34:iconst_5        
	//*  21   35:icmpne          56
				obj = ((Object) (windowinsets.replaceSystemWindowInsets(0, windowinsets.getSystemWindowInsetTop(), windowinsets.getSystemWindowInsetRight(), windowinsets.getSystemWindowInsetBottom())));
	//   22   38:aload_3         
	//   23   39:iconst_0        
	//   24   40:aload_3         
	//   25   41:invokevirtual   #32  <Method int WindowInsets.getSystemWindowInsetTop()>
	//   26   44:aload_3         
	//   27   45:invokevirtual   #42  <Method int WindowInsets.getSystemWindowInsetRight()>
	//   28   48:aload_3         
	//   29   49:invokevirtual   #35  <Method int WindowInsets.getSystemWindowInsetBottom()>
	//   30   52:invokevirtual   #39  <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//   31   55:astore_1        
		}
		view.dispatchApplyWindowInsets(((WindowInsets) (obj)));
	//   32   56:aload_0         
	//   33   57:aload_1         
	//   34   58:invokevirtual   #78  <Method WindowInsets View.dispatchApplyWindowInsets(WindowInsets)>
	//   35   61:pop             
	//   36   62:return          
	}

	public static Drawable getDefaultStatusBarBackground(Context context)
	{
		context = ((Context) (context.obtainStyledAttributes(THEME_ATTRS)));
	//    0    0:aload_0         
	//    1    1:getstatic       #17  <Field int[] THEME_ATTRS>
	//    2    4:invokevirtual   #86  <Method TypedArray Context.obtainStyledAttributes(int[])>
	//    3    7:astore_0        
		Drawable drawable = ((TypedArray) (context)).getDrawable(0);
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #92  <Method Drawable TypedArray.getDrawable(int)>
	//    7   13:astore_1        
		((TypedArray) (context)).recycle();
	//    8   14:aload_0         
	//    9   15:invokevirtual   #95  <Method void TypedArray.recycle()>
		return drawable;
	//   10   18:aload_1         
	//   11   19:areturn         
		Exception exception;
		exception;
	//   12   20:astore_1        
		((TypedArray) (context)).recycle();
	//   13   21:aload_0         
	//   14   22:invokevirtual   #95  <Method void TypedArray.recycle()>
		throw exception;
	//   15   25:aload_1         
	//   16   26:athrow          
	}

	public static int getTopInset(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return ((WindowInsets)obj).getSystemWindowInsetTop();
	//    2    4:aload_0         
	//    3    5:checkcast       #25  <Class WindowInsets>
	//    4    8:invokevirtual   #32  <Method int WindowInsets.getSystemWindowInsetTop()>
	//    5   11:ireturn         
		else
			return 0;
	//    6   12:iconst_0        
	//    7   13:ireturn         
	}

	private static final int THEME_ATTRS[] = {
		0x1010434
	};

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #15  <Int 0x1010434>
	//    5    7:iastore         
	//    6    8:putstatic       #17  <Field int[] THEME_ATTRS>
	//*   7   11:return          
	}
}
