// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;
import android.view.WindowInsets;

public class WindowInsetsCompat
{

	public WindowInsetsCompat(WindowInsetsCompat windowinsetscompat)
	{
		Object obj = null;
	//    0    0:aconst_null     
	//    1    1:astore_2        
		super();
	//    2    2:aload_0         
	//    3    3:invokespecial   #11  <Method void Object()>
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   4    6:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   5    9:bipush          20
	//*   6   11:icmplt          44
		{
			if(windowinsetscompat == null)
	//*   7   14:aload_1         
	//*   8   15:ifnonnull       26
				windowinsetscompat = ((WindowInsetsCompat) (obj));
	//    9   18:aload_2         
	//   10   19:astore_1        
			else
	//*  11   20:aload_0         
	//*  12   21:aload_1         
	//*  13   22:putfield        #19  <Field Object mInsets>
	//*  14   25:return          
				windowinsetscompat = ((WindowInsetsCompat) (new WindowInsets((WindowInsets)windowinsetscompat.mInsets)));
	//   15   26:new             #21  <Class WindowInsets>
	//   16   29:dup             
	//   17   30:aload_1         
	//   18   31:getfield        #19  <Field Object mInsets>
	//   19   34:checkcast       #21  <Class WindowInsets>
	//   20   37:invokespecial   #24  <Method void WindowInsets(WindowInsets)>
	//   21   40:astore_1        
			mInsets = ((Object) (windowinsetscompat));
			return;
		} else
	//*  22   41:goto            20
		{
			mInsets = null;
	//   23   44:aload_0         
	//   24   45:aconst_null     
	//   25   46:putfield        #19  <Field Object mInsets>
			return;
	//   26   49:return          
		}
	}

	private WindowInsetsCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mInsets = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #19  <Field Object mInsets>
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
	//    5    7:getfield        #19  <Field Object mInsets>
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
	//    6   13:getfield        #19  <Field Object mInsets>
	//    7   16:checkcast       #21  <Class WindowInsets>
	//    8   19:invokevirtual   #37  <Method WindowInsets WindowInsets.consumeStableInsets()>
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
	//    6   13:getfield        #19  <Field Object mInsets>
	//    7   16:checkcast       #21  <Class WindowInsets>
	//    8   19:invokevirtual   #40  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
	//    9   22:invokespecial   #32  <Method void WindowInsetsCompat(Object)>
	//   10   25:areturn         
		else
			return null;
	//   11   26:aconst_null     
	//   12   27:areturn         
	}

	public boolean equals(Object obj)
	{
		if(this != obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
	//*   3    5:iconst_1        
	//*   4    6:ireturn         
		{
			if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #46  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #46  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((WindowInsetsCompat)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class WindowInsetsCompat>
	//   16   28:astore_1        
			if(mInsets == null)
	//*  17   29:aload_0         
	//*  18   30:getfield        #19  <Field Object mInsets>
	//*  19   33:ifnonnull       45
			{
				if(((WindowInsetsCompat) (obj)).mInsets != null)
	//*  20   36:aload_1         
	//*  21   37:getfield        #19  <Field Object mInsets>
	//*  22   40:ifnull          5
					return false;
	//   23   43:iconst_0        
	//   24   44:ireturn         
			} else
			{
				return mInsets.equals(((WindowInsetsCompat) (obj)).mInsets);
	//   25   45:aload_0         
	//   26   46:getfield        #19  <Field Object mInsets>
	//   27   49:aload_1         
	//   28   50:getfield        #19  <Field Object mInsets>
	//   29   53:invokevirtual   #48  <Method boolean Object.equals(Object)>
	//   30   56:ireturn         
			}
		}
		return true;
	}

	public int getStableInsetBottom()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getStableInsetBottom();
	//    3    8:aload_0         
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #52  <Method int WindowInsets.getStableInsetBottom()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #55  <Method int WindowInsets.getStableInsetLeft()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #58  <Method int WindowInsets.getStableInsetRight()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #61  <Method int WindowInsets.getStableInsetTop()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #64  <Method int WindowInsets.getSystemWindowInsetBottom()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #67  <Method int WindowInsets.getSystemWindowInsetLeft()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #70  <Method int WindowInsets.getSystemWindowInsetRight()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #73  <Method int WindowInsets.getSystemWindowInsetTop()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #77  <Method boolean WindowInsets.hasInsets()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #80  <Method boolean WindowInsets.hasStableInsets()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #83  <Method boolean WindowInsets.hasSystemWindowInsets()>
	//    7   18:ireturn         
		else
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int hashCode()
	{
		if(mInsets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #19  <Field Object mInsets>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mInsets.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #19  <Field Object mInsets>
	//    7   13:invokevirtual   #86  <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public boolean isConsumed()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #17  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).isConsumed();
	//    3    8:aload_0         
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #89  <Method boolean WindowInsets.isConsumed()>
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
	//    4    9:getfield        #19  <Field Object mInsets>
	//    5   12:checkcast       #21  <Class WindowInsets>
	//    6   15:invokevirtual   #92  <Method boolean WindowInsets.isRound()>
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
	//    6   13:getfield        #19  <Field Object mInsets>
	//    7   16:checkcast       #21  <Class WindowInsets>
	//    8   19:iload_1         
	//    9   20:iload_2         
	//   10   21:iload_3         
	//   11   22:iload           4
	//   12   24:invokevirtual   #97  <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
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
	//    6   13:getfield        #19  <Field Object mInsets>
	//    7   16:checkcast       #21  <Class WindowInsets>
	//    8   19:aload_1         
	//    9   20:invokevirtual   #101 <Method WindowInsets WindowInsets.replaceSystemWindowInsets(Rect)>
	//   10   23:invokespecial   #32  <Method void WindowInsetsCompat(Object)>
	//   11   26:areturn         
		else
			return null;
	//   12   27:aconst_null     
	//   13   28:areturn         
	}

	private final Object mInsets;
}
