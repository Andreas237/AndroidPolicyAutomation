// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.WindowInsets;

// Referenced classes of package android.support.v4.view:
//			DisplayCutoutCompat

public class WindowInsetsCompat
{

	public WindowInsetsCompat(WindowInsetsCompat windowinsetscompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		int i = android.os.Build.VERSION.SDK_INT;
	//    2    4:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//    3    7:istore_2        
		Object obj = null;
	//    4    8:aconst_null     
	//    5    9:astore_3        
		if(i >= 20)
	//*   6   10:iload_2         
	//*   7   11:bipush          20
	//*   8   13:icmplt          46
		{
			if(windowinsetscompat == null)
	//*   9   16:aload_1         
	//*  10   17:ifnonnull       25
				windowinsetscompat = ((WindowInsetsCompat) (obj));
	//   11   20:aload_3         
	//   12   21:astore_1        
			else
	//*  13   22:goto            40
				windowinsetscompat = ((WindowInsetsCompat) (new WindowInsets((WindowInsets)windowinsetscompat.mInsets)));
	//   14   25:new             #19  <Class WindowInsets>
	//   15   28:dup             
	//   16   29:aload_1         
	//   17   30:getfield        #21  <Field Object mInsets>
	//   18   33:checkcast       #19  <Class WindowInsets>
	//   19   36:invokespecial   #24  <Method void WindowInsets(WindowInsets)>
	//   20   39:astore_1        
			mInsets = ((Object) (windowinsetscompat));
	//   21   40:aload_0         
	//   22   41:aload_1         
	//   23   42:putfield        #21  <Field Object mInsets>
			return;
	//   24   45:return          
		} else
		{
			mInsets = null;
	//   25   46:aload_0         
	//   26   47:aconst_null     
	//   27   48:putfield        #21  <Field Object mInsets>
			return;
	//   28   51:return          
		}
	}

	private WindowInsetsCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mInsets = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field Object mInsets>
	//    5    9:return          
	}

	static Object unwrap(WindowInsetsCompat windowinsetscompat)
	{
		if(windowinsetscompat == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return ((Object) (null));
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return windowinsetscompat.mInsets;
	//    4    6:aload_0         
	//    5    7:getfield        #21  <Field Object mInsets>
	//    6   10:areturn         
	}

	static WindowInsetsCompat wrap(Object obj)
	{
		if(obj == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		else
			return new WindowInsetsCompat(obj);
	//    4    6:new             #2   <Class WindowInsetsCompat>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:invokespecial   #32  <Method void WindowInsetsCompat(Object)>
	//    8   14:areturn         
	}

	public WindowInsetsCompat consumeDisplayCutout()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          26
			return new WindowInsetsCompat(((Object) (((WindowInsets)mInsets).consumeDisplayCutout())));
	//    3    8:new             #2   <Class WindowInsetsCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field Object mInsets>
	//    7   16:checkcast       #19  <Class WindowInsets>
	//    8   19:invokevirtual   #37  <Method WindowInsets WindowInsets.consumeDisplayCutout()>
	//    9   22:invokespecial   #32  <Method void WindowInsetsCompat(Object)>
	//   10   25:areturn         
		else
			return this;
	//   11   26:aload_0         
	//   12   27:areturn         
	}

	public WindowInsetsCompat consumeStableInsets()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          26
			return new WindowInsetsCompat(((Object) (((WindowInsets)mInsets).consumeStableInsets())));
	//    3    8:new             #2   <Class WindowInsetsCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field Object mInsets>
	//    7   16:checkcast       #19  <Class WindowInsets>
	//    8   19:invokevirtual   #40  <Method WindowInsets WindowInsets.consumeStableInsets()>
	//    9   22:invokespecial   #32  <Method void WindowInsetsCompat(Object)>
	//   10   25:areturn         
		else
			return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
	}

	public WindowInsetsCompat consumeSystemWindowInsets()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          26
			return new WindowInsetsCompat(((Object) (((WindowInsets)mInsets).consumeSystemWindowInsets())));
	//    3    8:new             #2   <Class WindowInsetsCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field Object mInsets>
	//    7   16:checkcast       #19  <Class WindowInsets>
	//    8   19:invokevirtual   #43  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
	//    9   22:invokespecial   #32  <Method void WindowInsetsCompat(Object)>
	//   10   25:areturn         
		else
			return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          58
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #49  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #49  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((WindowInsetsCompat)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class WindowInsetsCompat>
	//   16   28:astore_1        
			Object obj1 = mInsets;
	//   17   29:aload_0         
	//   18   30:getfield        #21  <Field Object mInsets>
	//   19   33:astore_2        
			if(obj1 == null)
	//*  20   34:aload_2         
	//*  21   35:ifnonnull       49
				return ((WindowInsetsCompat) (obj)).mInsets == null;
	//   22   38:aload_1         
	//   23   39:getfield        #21  <Field Object mInsets>
	//   24   42:ifnonnull       47
	//   25   45:iconst_1        
	//   26   46:ireturn         
	//   27   47:iconst_0        
	//   28   48:ireturn         
			else
				return obj1.equals(((WindowInsetsCompat) (obj)).mInsets);
	//   29   49:aload_2         
	//   30   50:aload_1         
	//   31   51:getfield        #21  <Field Object mInsets>
	//   32   54:invokevirtual   #51  <Method boolean Object.equals(Object)>
	//   33   57:ireturn         
		} else
		{
			return false;
	//   34   58:iconst_0        
	//   35   59:ireturn         
		}
	}

	public DisplayCutoutCompat getDisplayCutout()
	{
		if(android.os.Build.VERSION.SDK_INT >= 28)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          28
	//*   2    5:icmplt          22
			return DisplayCutoutCompat.wrap(((Object) (((WindowInsets)mInsets).getDisplayCutout())));
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #57  <Method android.view.DisplayCutout WindowInsets.getDisplayCutout()>
	//    7   18:invokestatic    #62  <Method DisplayCutoutCompat DisplayCutoutCompat.wrap(Object)>
	//    8   21:areturn         
		else
			return null;
	//    9   22:aconst_null     
	//   10   23:areturn         
	}

	public int getStableInsetBottom()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getStableInsetBottom();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #67  <Method int WindowInsets.getStableInsetBottom()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getStableInsetLeft()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getStableInsetLeft();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #70  <Method int WindowInsets.getStableInsetLeft()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getStableInsetRight()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getStableInsetRight();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #73  <Method int WindowInsets.getStableInsetRight()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getStableInsetTop()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getStableInsetTop();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #76  <Method int WindowInsets.getStableInsetTop()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSystemWindowInsetBottom()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getSystemWindowInsetBottom();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #79  <Method int WindowInsets.getSystemWindowInsetBottom()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSystemWindowInsetLeft()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getSystemWindowInsetLeft();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #82  <Method int WindowInsets.getSystemWindowInsetLeft()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSystemWindowInsetRight()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getSystemWindowInsetRight();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #85  <Method int WindowInsets.getSystemWindowInsetRight()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSystemWindowInsetTop()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getSystemWindowInsetTop();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #88  <Method int WindowInsets.getSystemWindowInsetTop()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public boolean hasInsets()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).hasInsets();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #92  <Method boolean WindowInsets.hasInsets()>
	//    7   18:ireturn         
		else
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public boolean hasStableInsets()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).hasStableInsets();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #95  <Method boolean WindowInsets.hasStableInsets()>
	//    7   18:ireturn         
		else
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public boolean hasSystemWindowInsets()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).hasSystemWindowInsets();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #98  <Method boolean WindowInsets.hasSystemWindowInsets()>
	//    7   18:ireturn         
		else
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int hashCode()
	{
		Object obj = mInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field Object mInsets>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return obj.hashCode();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #101 <Method int Object.hashCode()>
	//    9   15:ireturn         
	}

	public boolean isConsumed()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).isConsumed();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #104 <Method boolean WindowInsets.isConsumed()>
	//    7   18:ireturn         
		else
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public boolean isRound()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).isRound();
	//    3    8:aload_0         
	//    4    9:getfield        #21  <Field Object mInsets>
	//    5   12:checkcast       #19  <Class WindowInsets>
	//    6   15:invokevirtual   #107 <Method boolean WindowInsets.isRound()>
	//    7   18:ireturn         
		else
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public WindowInsetsCompat replaceSystemWindowInsets(int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          31
			return new WindowInsetsCompat(((Object) (((WindowInsets)mInsets).replaceSystemWindowInsets(i, j, k, l))));
	//    3    8:new             #2   <Class WindowInsetsCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field Object mInsets>
	//    7   16:checkcast       #19  <Class WindowInsets>
	//    8   19:iload_1         
	//    9   20:iload_2         
	//   10   21:iload_3         
	//   11   22:iload           4
	//   12   24:invokevirtual   #112 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//   13   27:invokespecial   #32  <Method void WindowInsetsCompat(Object)>
	//   14   30:areturn         
		else
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
	}

	public WindowInsetsCompat replaceSystemWindowInsets(Rect rect)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          27
			return new WindowInsetsCompat(((Object) (((WindowInsets)mInsets).replaceSystemWindowInsets(rect))));
	//    3    8:new             #2   <Class WindowInsetsCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #21  <Field Object mInsets>
	//    7   16:checkcast       #19  <Class WindowInsets>
	//    8   19:aload_1         
	//    9   20:invokevirtual   #116 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(Rect)>
	//   10   23:invokespecial   #32  <Method void WindowInsetsCompat(Object)>
	//   11   26:areturn         
		else
			return null;
	//   12   27:aconst_null     
	//   13   28:areturn         
	}

	private final Object mInsets;
}
