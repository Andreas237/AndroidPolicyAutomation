// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.view.WindowInsets;

public class WindowInsetsCompat
{

	private WindowInsetsCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
		mInsets = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #13  <Field Object mInsets>
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
	//    5    7:getfield        #13  <Field Object mInsets>
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
	//    7   11:invokespecial   #20  <Method void WindowInsetsCompat(Object)>
	//    8   14:areturn         
	}

	public WindowInsetsCompat consumeSystemWindowInsets()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          26
			return new WindowInsetsCompat(((Object) (((WindowInsets)mInsets).consumeSystemWindowInsets())));
	//    3    8:new             #2   <Class WindowInsetsCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #13  <Field Object mInsets>
	//    7   16:checkcast       #30  <Class WindowInsets>
	//    8   19:invokevirtual   #33  <Method WindowInsets WindowInsets.consumeSystemWindowInsets()>
	//    9   22:invokespecial   #20  <Method void WindowInsetsCompat(Object)>
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
	//*   8   12:invokevirtual   #39  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #39  <Method Class Object.getClass()>
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
	//   18   30:getfield        #13  <Field Object mInsets>
	//   19   33:astore_2        
			if(obj1 == null)
	//*  20   34:aload_2         
	//*  21   35:ifnonnull       49
				return ((WindowInsetsCompat) (obj)).mInsets == null;
	//   22   38:aload_1         
	//   23   39:getfield        #13  <Field Object mInsets>
	//   24   42:ifnonnull       47
	//   25   45:iconst_1        
	//   26   46:ireturn         
	//   27   47:iconst_0        
	//   28   48:ireturn         
			else
				return obj1.equals(((WindowInsetsCompat) (obj)).mInsets);
	//   29   49:aload_2         
	//   30   50:aload_1         
	//   31   51:getfield        #13  <Field Object mInsets>
	//   32   54:invokevirtual   #41  <Method boolean Object.equals(Object)>
	//   33   57:ireturn         
		} else
		{
			return false;
	//   34   58:iconst_0        
	//   35   59:ireturn         
		}
	}

	public int getSystemWindowInsetBottom()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getSystemWindowInsetBottom();
	//    3    8:aload_0         
	//    4    9:getfield        #13  <Field Object mInsets>
	//    5   12:checkcast       #30  <Class WindowInsets>
	//    6   15:invokevirtual   #45  <Method int WindowInsets.getSystemWindowInsetBottom()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSystemWindowInsetLeft()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getSystemWindowInsetLeft();
	//    3    8:aload_0         
	//    4    9:getfield        #13  <Field Object mInsets>
	//    5   12:checkcast       #30  <Class WindowInsets>
	//    6   15:invokevirtual   #48  <Method int WindowInsets.getSystemWindowInsetLeft()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSystemWindowInsetRight()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getSystemWindowInsetRight();
	//    3    8:aload_0         
	//    4    9:getfield        #13  <Field Object mInsets>
	//    5   12:checkcast       #30  <Class WindowInsets>
	//    6   15:invokevirtual   #51  <Method int WindowInsets.getSystemWindowInsetRight()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int getSystemWindowInsetTop()
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).getSystemWindowInsetTop();
	//    3    8:aload_0         
	//    4    9:getfield        #13  <Field Object mInsets>
	//    5   12:checkcast       #30  <Class WindowInsets>
	//    6   15:invokevirtual   #54  <Method int WindowInsets.getSystemWindowInsetTop()>
	//    7   18:ireturn         
		else
			return 0;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public int hashCode()
	{
		Object obj = mInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #13  <Field Object mInsets>
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
	//    8   12:invokevirtual   #57  <Method int Object.hashCode()>
	//    9   15:ireturn         
	}

	public boolean isConsumed()
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          19
			return ((WindowInsets)mInsets).isConsumed();
	//    3    8:aload_0         
	//    4    9:getfield        #13  <Field Object mInsets>
	//    5   12:checkcast       #30  <Class WindowInsets>
	//    6   15:invokevirtual   #61  <Method boolean WindowInsets.isConsumed()>
	//    7   18:ireturn         
		else
			return false;
	//    8   19:iconst_0        
	//    9   20:ireturn         
	}

	public WindowInsetsCompat replaceSystemWindowInsets(int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 20)
	//*   0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          20
	//*   2    5:icmplt          31
			return new WindowInsetsCompat(((Object) (((WindowInsets)mInsets).replaceSystemWindowInsets(i, j, k, l))));
	//    3    8:new             #2   <Class WindowInsetsCompat>
	//    4   11:dup             
	//    5   12:aload_0         
	//    6   13:getfield        #13  <Field Object mInsets>
	//    7   16:checkcast       #30  <Class WindowInsets>
	//    8   19:iload_1         
	//    9   20:iload_2         
	//   10   21:iload_3         
	//   11   22:iload           4
	//   12   24:invokevirtual   #66  <Method WindowInsets WindowInsets.replaceSystemWindowInsets(int, int, int, int)>
	//   13   27:invokespecial   #20  <Method void WindowInsetsCompat(Object)>
	//   14   30:areturn         
		else
			return null;
	//   15   31:aconst_null     
	//   16   32:areturn         
	}

	private final Object mInsets;
}
