// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.view.b;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;

public abstract class ActionBar
{
	public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
	{

		public int a;

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #13  <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
			a = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #15  <Field int a>
			a = 0x800013;
		//    7   11:aload_0         
		//    8   12:ldc1            #16  <Int 0x800013>
		//    9   14:putfield        #15  <Field int a>
		//   10   17:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #20  <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
			a = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #15  <Field int a>
			context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.a.a.j.ActionBarLayout)));
		//    7   11:aload_1         
		//    8   12:aload_2         
		//    9   13:getstatic       #26  <Field int[] android.support.v7.a.a$j.ActionBarLayout>
		//   10   16:invokevirtual   #32  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
		//   11   19:astore_1        
			a = ((TypedArray) (context)).getInt(android.support.v7.a.a.j.ActionBarLayout_android_layout_gravity, 0);
		//   12   20:aload_0         
		//   13   21:aload_1         
		//   14   22:getstatic       #35  <Field int android.support.v7.a.a$j.ActionBarLayout_android_layout_gravity>
		//   15   25:iconst_0        
		//   16   26:invokevirtual   #41  <Method int TypedArray.getInt(int, int)>
		//   17   29:putfield        #15  <Field int a>
			((TypedArray) (context)).recycle();
		//   18   32:aload_1         
		//   19   33:invokevirtual   #45  <Method void TypedArray.recycle()>
		//   20   36:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.view.ViewGroup.MarginLayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #49  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$MarginLayoutParams)>
			a = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #15  <Field int a>
			a = layoutparams.a;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #15  <Field int a>
		//    9   15:putfield        #15  <Field int a>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #52  <Method void android.view.ViewGroup$MarginLayoutParams(android.view.ViewGroup$LayoutParams)>
			a = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #15  <Field int a>
		//    6   10:return          
		}
	}

	public static interface a
	{

		public abstract void a(boolean flag);
	}

	public static abstract class b
	{

		public abstract Drawable a();

		public abstract CharSequence b();

		public abstract View c();

		public abstract void d();

		public abstract CharSequence e();

		public b()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #12  <Method void Object()>
		//    2    4:return          
		}
	}


	public ActionBar()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #17  <Method void Object()>
	//    2    4:return          
	}

	public abstract int a();

	public android.support.v7.view.b a(android.support.v7.view.b.a a1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(float f1)
	{
		if(f1 != 0.0F)
	//*   0    0:fload_1         
	//*   1    1:fconst_0        
	//*   2    2:fcmpl           
	//*   3    3:ifeq            16
			throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
	//    4    6:new             #23  <Class UnsupportedOperationException>
	//    5    9:dup             
	//    6   10:ldc1            #25  <String "Setting a non-zero elevation is not supported in this action bar configuration.">
	//    7   12:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    8   15:athrow          
		else
			return;
	//    9   16:return          
	}

	public abstract void a(int i);

	public void a(Configuration configuration)
	{
	//    0    0:return          
	}

	public abstract void a(CharSequence charsequence);

	public abstract void a(boolean flag);

	public boolean a(int i, KeyEvent keyevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean a(KeyEvent keyevent)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public Context b()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public abstract void b(int i);

	public abstract void b(CharSequence charsequence);

	public void b(boolean flag)
	{
	//    0    0:return          
	}

	public void c(int i)
	{
	//    0    0:return          
	}

	public void c(CharSequence charsequence)
	{
	//    0    0:return          
	}

	public void c(boolean flag)
	{
		if(flag)
	//*   0    0:iload_1         
	//*   1    1:ifeq            14
			throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
	//    2    4:new             #23  <Class UnsupportedOperationException>
	//    3    7:dup             
	//    4    8:ldc1            #38  <String "Hide on content scroll is not supported in this action bar configuration.">
	//    5   10:invokespecial   #28  <Method void UnsupportedOperationException(String)>
	//    6   13:athrow          
		else
			return;
	//    7   14:return          
	}

	public boolean c()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void d(boolean flag)
	{
	//    0    0:return          
	}

	public boolean d()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void e(boolean flag)
	{
	//    0    0:return          
	}

	public boolean e()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void f(boolean flag)
	{
	//    0    0:return          
	}

	public boolean f()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	void g()
	{
	//    0    0:return          
	}
}
