// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.view;

import android.graphics.Rect;

// Referenced classes of package android.support.v4.view:
//			WindowInsetsCompatApi20, WindowInsetsCompatApi21

public class WindowInsetsCompat
{
	static class WindowInsetsCompatApi20Impl extends WindowInsetsCompatBaseImpl
	{

		public WindowInsetsCompat consumeSystemWindowInsets(Object obj)
		{
			return new WindowInsetsCompat(WindowInsetsCompatApi20.consumeSystemWindowInsets(obj));
		//    0    0:new             #6   <Class WindowInsetsCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokestatic    #19  <Method Object WindowInsetsCompatApi20.consumeSystemWindowInsets(Object)>
		//    4    8:invokespecial   #22  <Method void WindowInsetsCompat(Object)>
		//    5   11:areturn         
		}

		public Object getSourceWindowInsets(Object obj)
		{
			return WindowInsetsCompatApi20.getSourceWindowInsets(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #25  <Method Object WindowInsetsCompatApi20.getSourceWindowInsets(Object)>
		//    2    4:areturn         
		}

		public int getSystemWindowInsetBottom(Object obj)
		{
			return WindowInsetsCompatApi20.getSystemWindowInsetBottom(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #29  <Method int WindowInsetsCompatApi20.getSystemWindowInsetBottom(Object)>
		//    2    4:ireturn         
		}

		public int getSystemWindowInsetLeft(Object obj)
		{
			return WindowInsetsCompatApi20.getSystemWindowInsetLeft(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #32  <Method int WindowInsetsCompatApi20.getSystemWindowInsetLeft(Object)>
		//    2    4:ireturn         
		}

		public int getSystemWindowInsetRight(Object obj)
		{
			return WindowInsetsCompatApi20.getSystemWindowInsetRight(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #35  <Method int WindowInsetsCompatApi20.getSystemWindowInsetRight(Object)>
		//    2    4:ireturn         
		}

		public int getSystemWindowInsetTop(Object obj)
		{
			return WindowInsetsCompatApi20.getSystemWindowInsetTop(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #38  <Method int WindowInsetsCompatApi20.getSystemWindowInsetTop(Object)>
		//    2    4:ireturn         
		}

		public boolean hasInsets(Object obj)
		{
			return WindowInsetsCompatApi20.hasInsets(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #42  <Method boolean WindowInsetsCompatApi20.hasInsets(Object)>
		//    2    4:ireturn         
		}

		public boolean hasSystemWindowInsets(Object obj)
		{
			return WindowInsetsCompatApi20.hasSystemWindowInsets(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #45  <Method boolean WindowInsetsCompatApi20.hasSystemWindowInsets(Object)>
		//    2    4:ireturn         
		}

		public boolean isRound(Object obj)
		{
			return WindowInsetsCompatApi20.isRound(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #48  <Method boolean WindowInsetsCompatApi20.isRound(Object)>
		//    2    4:ireturn         
		}

		public WindowInsetsCompat replaceSystemWindowInsets(Object obj, int i, int j, int k, int l)
		{
			return new WindowInsetsCompat(WindowInsetsCompatApi20.replaceSystemWindowInsets(obj, i, j, k, l));
		//    0    0:new             #6   <Class WindowInsetsCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:iload_2         
		//    4    6:iload_3         
		//    5    7:iload           4
		//    6    9:iload           5
		//    7   11:invokestatic    #53  <Method Object WindowInsetsCompatApi20.replaceSystemWindowInsets(Object, int, int, int, int)>
		//    8   14:invokespecial   #22  <Method void WindowInsetsCompat(Object)>
		//    9   17:areturn         
		}

		WindowInsetsCompatApi20Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void WindowInsetsCompat$WindowInsetsCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class WindowInsetsCompatApi21Impl extends WindowInsetsCompatApi20Impl
	{

		public WindowInsetsCompat consumeStableInsets(Object obj)
		{
			return new WindowInsetsCompat(WindowInsetsCompatApi21.consumeStableInsets(obj));
		//    0    0:new             #6   <Class WindowInsetsCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:invokestatic    #19  <Method Object WindowInsetsCompatApi21.consumeStableInsets(Object)>
		//    4    8:invokespecial   #22  <Method void WindowInsetsCompat(Object)>
		//    5   11:areturn         
		}

		public int getStableInsetBottom(Object obj)
		{
			return WindowInsetsCompatApi21.getStableInsetBottom(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #26  <Method int WindowInsetsCompatApi21.getStableInsetBottom(Object)>
		//    2    4:ireturn         
		}

		public int getStableInsetLeft(Object obj)
		{
			return WindowInsetsCompatApi21.getStableInsetLeft(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #29  <Method int WindowInsetsCompatApi21.getStableInsetLeft(Object)>
		//    2    4:ireturn         
		}

		public int getStableInsetRight(Object obj)
		{
			return WindowInsetsCompatApi21.getStableInsetRight(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #32  <Method int WindowInsetsCompatApi21.getStableInsetRight(Object)>
		//    2    4:ireturn         
		}

		public int getStableInsetTop(Object obj)
		{
			return WindowInsetsCompatApi21.getStableInsetTop(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #35  <Method int WindowInsetsCompatApi21.getStableInsetTop(Object)>
		//    2    4:ireturn         
		}

		public boolean hasStableInsets(Object obj)
		{
			return WindowInsetsCompatApi21.hasStableInsets(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #39  <Method boolean WindowInsetsCompatApi21.hasStableInsets(Object)>
		//    2    4:ireturn         
		}

		public boolean isConsumed(Object obj)
		{
			return WindowInsetsCompatApi21.isConsumed(obj);
		//    0    0:aload_1         
		//    1    1:invokestatic    #42  <Method boolean WindowInsetsCompatApi21.isConsumed(Object)>
		//    2    4:ireturn         
		}

		public WindowInsetsCompat replaceSystemWindowInsets(Object obj, Rect rect)
		{
			return new WindowInsetsCompat(WindowInsetsCompatApi21.replaceSystemWindowInsets(obj, rect));
		//    0    0:new             #6   <Class WindowInsetsCompat>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aload_2         
		//    4    6:invokestatic    #47  <Method Object WindowInsetsCompatApi21.replaceSystemWindowInsets(Object, Rect)>
		//    5    9:invokespecial   #22  <Method void WindowInsetsCompat(Object)>
		//    6   12:areturn         
		}

		WindowInsetsCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void WindowInsetsCompat$WindowInsetsCompatApi20Impl()>
		//    2    4:return          
		}
	}

	static class WindowInsetsCompatBaseImpl
		implements WindowInsetsCompatImpl
	{

		public WindowInsetsCompat consumeStableInsets(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public WindowInsetsCompat consumeSystemWindowInsets(Object obj)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public Object getSourceWindowInsets(Object obj)
		{
			return ((Object) (null));
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getStableInsetBottom(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getStableInsetLeft(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getStableInsetRight(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getStableInsetTop(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSystemWindowInsetBottom(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSystemWindowInsetLeft(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSystemWindowInsetRight(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getSystemWindowInsetTop(Object obj)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean hasInsets(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean hasStableInsets(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean hasSystemWindowInsets(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isConsumed(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public boolean isRound(Object obj)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public WindowInsetsCompat replaceSystemWindowInsets(Object obj, int i, int j, int k, int l)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public WindowInsetsCompat replaceSystemWindowInsets(Object obj, Rect rect)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		WindowInsetsCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #13  <Method void Object()>
		//    2    4:return          
		}
	}

	static interface WindowInsetsCompatImpl
	{

		public abstract WindowInsetsCompat consumeStableInsets(Object obj);

		public abstract WindowInsetsCompat consumeSystemWindowInsets(Object obj);

		public abstract Object getSourceWindowInsets(Object obj);

		public abstract int getStableInsetBottom(Object obj);

		public abstract int getStableInsetLeft(Object obj);

		public abstract int getStableInsetRight(Object obj);

		public abstract int getStableInsetTop(Object obj);

		public abstract int getSystemWindowInsetBottom(Object obj);

		public abstract int getSystemWindowInsetLeft(Object obj);

		public abstract int getSystemWindowInsetRight(Object obj);

		public abstract int getSystemWindowInsetTop(Object obj);

		public abstract boolean hasInsets(Object obj);

		public abstract boolean hasStableInsets(Object obj);

		public abstract boolean hasSystemWindowInsets(Object obj);

		public abstract boolean isConsumed(Object obj);

		public abstract boolean isRound(Object obj);

		public abstract WindowInsetsCompat replaceSystemWindowInsets(Object obj, int i, int j, int k, int l);

		public abstract WindowInsetsCompat replaceSystemWindowInsets(Object obj, Rect rect);
	}


	public WindowInsetsCompat(WindowInsetsCompat windowinsetscompat)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		if(windowinsetscompat == null)
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       13
			windowinsetscompat = null;
	//    4    8:aconst_null     
	//    5    9:astore_1        
		else
	//*   6   10:goto            26
			windowinsetscompat = ((WindowInsetsCompat) (IMPL.getSourceWindowInsets(windowinsetscompat.mInsets)));
	//    7   13:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    8   16:aload_1         
	//    9   17:getfield        #40  <Field Object mInsets>
	//   10   20:invokeinterface #44  <Method Object WindowInsetsCompat$WindowInsetsCompatImpl.getSourceWindowInsets(Object)>
	//   11   25:astore_1        
		mInsets = ((Object) (windowinsetscompat));
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #40  <Field Object mInsets>
	//   15   31:return          
	}

	WindowInsetsCompat(Object obj)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		mInsets = obj;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #40  <Field Object mInsets>
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
	//    5    7:getfield        #40  <Field Object mInsets>
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
	//    7   11:invokespecial   #51  <Method void WindowInsetsCompat(Object)>
	//    8   14:areturn         
	}

	public WindowInsetsCompat consumeStableInsets()
	{
		return IMPL.consumeStableInsets(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #55  <Method WindowInsetsCompat WindowInsetsCompat$WindowInsetsCompatImpl.consumeStableInsets(Object)>
	//    4   12:areturn         
	}

	public WindowInsetsCompat consumeSystemWindowInsets()
	{
		return IMPL.consumeSystemWindowInsets(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #58  <Method WindowInsetsCompat WindowInsetsCompat$WindowInsetsCompatImpl.consumeSystemWindowInsets(Object)>
	//    4   12:areturn         
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
		if(obj == null || ((Object)this).getClass() != obj.getClass())
	//*   5    7:aload_1         
	//*   6    8:ifnull          22
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #64  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #64  <Method Class Object.getClass()>
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
	//*  18   30:getfield        #40  <Field Object mInsets>
	//*  19   33:ifnonnull       47
			return ((WindowInsetsCompat) (obj)).mInsets == null;
	//   20   36:aload_1         
	//   21   37:getfield        #40  <Field Object mInsets>
	//   22   40:ifnonnull       45
	//   23   43:iconst_1        
	//   24   44:ireturn         
	//   25   45:iconst_0        
	//   26   46:ireturn         
		else
			return mInsets.equals(((WindowInsetsCompat) (obj)).mInsets);
	//   27   47:aload_0         
	//   28   48:getfield        #40  <Field Object mInsets>
	//   29   51:aload_1         
	//   30   52:getfield        #40  <Field Object mInsets>
	//   31   55:invokevirtual   #66  <Method boolean Object.equals(Object)>
	//   32   58:ireturn         
	}

	public int getStableInsetBottom()
	{
		return IMPL.getStableInsetBottom(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #71  <Method int WindowInsetsCompat$WindowInsetsCompatImpl.getStableInsetBottom(Object)>
	//    4   12:ireturn         
	}

	public int getStableInsetLeft()
	{
		return IMPL.getStableInsetLeft(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #74  <Method int WindowInsetsCompat$WindowInsetsCompatImpl.getStableInsetLeft(Object)>
	//    4   12:ireturn         
	}

	public int getStableInsetRight()
	{
		return IMPL.getStableInsetRight(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #77  <Method int WindowInsetsCompat$WindowInsetsCompatImpl.getStableInsetRight(Object)>
	//    4   12:ireturn         
	}

	public int getStableInsetTop()
	{
		return IMPL.getStableInsetTop(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #80  <Method int WindowInsetsCompat$WindowInsetsCompatImpl.getStableInsetTop(Object)>
	//    4   12:ireturn         
	}

	public int getSystemWindowInsetBottom()
	{
		return IMPL.getSystemWindowInsetBottom(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #83  <Method int WindowInsetsCompat$WindowInsetsCompatImpl.getSystemWindowInsetBottom(Object)>
	//    4   12:ireturn         
	}

	public int getSystemWindowInsetLeft()
	{
		return IMPL.getSystemWindowInsetLeft(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #86  <Method int WindowInsetsCompat$WindowInsetsCompatImpl.getSystemWindowInsetLeft(Object)>
	//    4   12:ireturn         
	}

	public int getSystemWindowInsetRight()
	{
		return IMPL.getSystemWindowInsetRight(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #89  <Method int WindowInsetsCompat$WindowInsetsCompatImpl.getSystemWindowInsetRight(Object)>
	//    4   12:ireturn         
	}

	public int getSystemWindowInsetTop()
	{
		return IMPL.getSystemWindowInsetTop(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #92  <Method int WindowInsetsCompat$WindowInsetsCompatImpl.getSystemWindowInsetTop(Object)>
	//    4   12:ireturn         
	}

	public boolean hasInsets()
	{
		return IMPL.hasInsets(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #96  <Method boolean WindowInsetsCompat$WindowInsetsCompatImpl.hasInsets(Object)>
	//    4   12:ireturn         
	}

	public boolean hasStableInsets()
	{
		return IMPL.hasStableInsets(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #99  <Method boolean WindowInsetsCompat$WindowInsetsCompatImpl.hasStableInsets(Object)>
	//    4   12:ireturn         
	}

	public boolean hasSystemWindowInsets()
	{
		return IMPL.hasSystemWindowInsets(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #102 <Method boolean WindowInsetsCompat$WindowInsetsCompatImpl.hasSystemWindowInsets(Object)>
	//    4   12:ireturn         
	}

	public int hashCode()
	{
		if(mInsets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field Object mInsets>
	//*   2    4:ifnonnull       9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return mInsets.hashCode();
	//    5    9:aload_0         
	//    6   10:getfield        #40  <Field Object mInsets>
	//    7   13:invokevirtual   #105 <Method int Object.hashCode()>
	//    8   16:ireturn         
	}

	public boolean isConsumed()
	{
		return IMPL.isConsumed(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #108 <Method boolean WindowInsetsCompat$WindowInsetsCompatImpl.isConsumed(Object)>
	//    4   12:ireturn         
	}

	public boolean isRound()
	{
		return IMPL.isRound(mInsets);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:invokeinterface #111 <Method boolean WindowInsetsCompat$WindowInsetsCompatImpl.isRound(Object)>
	//    4   12:ireturn         
	}

	public WindowInsetsCompat replaceSystemWindowInsets(int i, int j, int k, int l)
	{
		return IMPL.replaceSystemWindowInsets(mInsets, i, j, k, l);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:iload_1         
	//    4    8:iload_2         
	//    5    9:iload_3         
	//    6   10:iload           4
	//    7   12:invokeinterface #116 <Method WindowInsetsCompat WindowInsetsCompat$WindowInsetsCompatImpl.replaceSystemWindowInsets(Object, int, int, int, int)>
	//    8   17:areturn         
	}

	public WindowInsetsCompat replaceSystemWindowInsets(Rect rect)
	{
		return IMPL.replaceSystemWindowInsets(mInsets, rect);
	//    0    0:getstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    1    3:aload_0         
	//    2    4:getfield        #40  <Field Object mInsets>
	//    3    7:aload_1         
	//    4    8:invokeinterface #120 <Method WindowInsetsCompat WindowInsetsCompat$WindowInsetsCompatImpl.replaceSystemWindowInsets(Object, Rect)>
	//    5   13:areturn         
	}

	private static final WindowInsetsCompatImpl IMPL;
	private final Object mInsets;

	static 
	{
		int i = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #28  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_0        
		if(i >= 21)
	//*   2    4:iload_0         
	//*   3    5:bipush          21
	//*   4    7:icmplt          21
			IMPL = ((WindowInsetsCompatImpl) (new WindowInsetsCompatApi21Impl()));
	//    5   10:new             #9   <Class WindowInsetsCompat$WindowInsetsCompatApi21Impl>
	//    6   13:dup             
	//    7   14:invokespecial   #31  <Method void WindowInsetsCompat$WindowInsetsCompatApi21Impl()>
	//    8   17:putstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//    9   20:return          
		else
		if(i >= 20)
	//*  10   21:iload_0         
	//*  11   22:bipush          20
	//*  12   24:icmplt          38
			IMPL = ((WindowInsetsCompatImpl) (new WindowInsetsCompatApi20Impl()));
	//   13   27:new             #6   <Class WindowInsetsCompat$WindowInsetsCompatApi20Impl>
	//   14   30:dup             
	//   15   31:invokespecial   #34  <Method void WindowInsetsCompat$WindowInsetsCompatApi20Impl()>
	//   16   34:putstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//   17   37:return          
		else
			IMPL = ((WindowInsetsCompatImpl) (new WindowInsetsCompatBaseImpl()));
	//   18   38:new             #12  <Class WindowInsetsCompat$WindowInsetsCompatBaseImpl>
	//   19   41:dup             
	//   20   42:invokespecial   #35  <Method void WindowInsetsCompat$WindowInsetsCompatBaseImpl()>
	//   21   45:putstatic       #33  <Field WindowInsetsCompat$WindowInsetsCompatImpl IMPL>
	//*  22   48:return          
	}
}
