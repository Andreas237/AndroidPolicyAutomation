// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

// Referenced classes of package android.support.v7.widget:
//			as, f, l

public class AppCompatButton extends Button
	implements r
{

	public AppCompatButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void AppCompatButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.buttonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #22  <Field int android.support.v7.a.a$a.buttonStyle>
	//    4    6:invokespecial   #25  <Method void AppCompatButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatButton(Context context, AttributeSet attributeset, int i)
	{
		super(as.a(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #30  <Method Context as.a(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #31  <Method void Button(Context, AttributeSet, int)>
		a = new f(((android.view.View) (this)));
	//    6   10:aload_0         
	//    7   11:new             #33  <Class f>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #36  <Method void f(android.view.View)>
	//   11   19:putfield        #38  <Field f a>
		a.a(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #38  <Field f a>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #41  <Method void f.a(AttributeSet, int)>
		b = l.a(((android.widget.TextView) (this)));
	//   17   31:aload_0         
	//   18   32:aload_0         
	//   19   33:invokestatic    #46  <Method l l.a(android.widget.TextView)>
	//   20   36:putfield        #48  <Field l b>
		b.a(attributeset, i);
	//   21   39:aload_0         
	//   22   40:getfield        #48  <Field l b>
	//   23   43:aload_2         
	//   24   44:iload_3         
	//   25   45:invokevirtual   #49  <Method void l.a(AttributeSet, int)>
		b.a();
	//   26   48:aload_0         
	//   27   49:getfield        #48  <Field l b>
	//   28   52:invokevirtual   #52  <Method void l.a()>
	//   29   55:return          
	}

	protected void drawableStateChanged()
	{
		super.drawableStateChanged();
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void Button.drawableStateChanged()>
		if(a != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #38  <Field f a>
	//*   4    8:ifnull          18
			a.c();
	//    5   11:aload_0         
	//    6   12:getfield        #38  <Field f a>
	//    7   15:invokevirtual   #58  <Method void f.c()>
		if(b != null)
	//*   8   18:aload_0         
	//*   9   19:getfield        #48  <Field l b>
	//*  10   22:ifnull          32
			b.a();
	//   11   25:aload_0         
	//   12   26:getfield        #48  <Field l b>
	//   13   29:invokevirtual   #52  <Method void l.a()>
	//   14   32:return          
	}

	public int getAutoSizeMaxTextSize()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return super.getAutoSizeMaxTextSize();
	//    3    8:aload_0         
	//    4    9:invokespecial   #67  <Method int Button.getAutoSizeMaxTextSize()>
	//    5   12:ireturn         
		if(b != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #48  <Field l b>
	//*   8   17:ifnull          28
			return b.g();
	//    9   20:aload_0         
	//   10   21:getfield        #48  <Field l b>
	//   11   24:invokevirtual   #70  <Method int l.g()>
	//   12   27:ireturn         
		else
			return -1;
	//   13   28:iconst_m1       
	//   14   29:ireturn         
	}

	public int getAutoSizeMinTextSize()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return super.getAutoSizeMinTextSize();
	//    3    8:aload_0         
	//    4    9:invokespecial   #73  <Method int Button.getAutoSizeMinTextSize()>
	//    5   12:ireturn         
		if(b != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #48  <Field l b>
	//*   8   17:ifnull          28
			return b.f();
	//    9   20:aload_0         
	//   10   21:getfield        #48  <Field l b>
	//   11   24:invokevirtual   #76  <Method int l.f()>
	//   12   27:ireturn         
		else
			return -1;
	//   13   28:iconst_m1       
	//   14   29:ireturn         
	}

	public int getAutoSizeStepGranularity()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return super.getAutoSizeStepGranularity();
	//    3    8:aload_0         
	//    4    9:invokespecial   #79  <Method int Button.getAutoSizeStepGranularity()>
	//    5   12:ireturn         
		if(b != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #48  <Field l b>
	//*   8   17:ifnull          28
			return b.e();
	//    9   20:aload_0         
	//   10   21:getfield        #48  <Field l b>
	//   11   24:invokevirtual   #82  <Method int l.e()>
	//   12   27:ireturn         
		else
			return -1;
	//   13   28:iconst_m1       
	//   14   29:ireturn         
	}

	public int[] getAutoSizeTextAvailableSizes()
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          13
			return super.getAutoSizeTextAvailableSizes();
	//    3    8:aload_0         
	//    4    9:invokespecial   #86  <Method int[] Button.getAutoSizeTextAvailableSizes()>
	//    5   12:areturn         
		if(b != null)
	//*   6   13:aload_0         
	//*   7   14:getfield        #48  <Field l b>
	//*   8   17:ifnull          28
			return b.h();
	//    9   20:aload_0         
	//   10   21:getfield        #48  <Field l b>
	//   11   24:invokevirtual   #89  <Method int[] l.h()>
	//   12   27:areturn         
		else
			return new int[0];
	//   13   28:iconst_0        
	//   14   29:newarray        int[]
	//   15   31:areturn         
	}

	public int getAutoSizeTextType()
	{
		int j = android.os.Build.VERSION.SDK_INT;
	//    0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//    1    3:istore_2        
		int i = 0;
	//    2    4:iconst_0        
	//    3    5:istore_1        
		if(j >= 26)
	//*   4    6:iload_2         
	//*   5    7:bipush          26
	//*   6    9:icmplt          24
		{
			if(super.getAutoSizeTextType() == 1)
	//*   7   12:aload_0         
	//*   8   13:invokespecial   #92  <Method int Button.getAutoSizeTextType()>
	//*   9   16:iconst_1        
	//*  10   17:icmpne          22
				i = 1;
	//   11   20:iconst_1        
	//   12   21:istore_1        
			return i;
	//   13   22:iload_1         
	//   14   23:ireturn         
		}
		if(b != null)
	//*  15   24:aload_0         
	//*  16   25:getfield        #48  <Field l b>
	//*  17   28:ifnull          39
			return b.d();
	//   18   31:aload_0         
	//   19   32:getfield        #48  <Field l b>
	//   20   35:invokevirtual   #95  <Method int l.d()>
	//   21   38:ireturn         
		else
			return 0;
	//   22   39:iconst_0        
	//   23   40:ireturn         
	}

	public ColorStateList getSupportBackgroundTintList()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field f a>
	//*   2    4:ifnull          15
			return a.a();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field f a>
	//    5   11:invokevirtual   #99  <Method ColorStateList f.a()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportBackgroundTintMode()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field f a>
	//*   2    4:ifnull          15
			return a.b();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field f a>
	//    5   11:invokevirtual   #103 <Method android.graphics.PorterDuff$Mode f.b()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		super.onInitializeAccessibilityEvent(accessibilityevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #107 <Method void Button.onInitializeAccessibilityEvent(AccessibilityEvent)>
		accessibilityevent.setClassName(((CharSequence) (((Class) (android/widget/Button)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #4   <Class Button>
	//    5    8:invokevirtual   #113 <Method String Class.getName()>
	//    6   11:invokevirtual   #119 <Method void AccessibilityEvent.setClassName(CharSequence)>
	//    7   14:return          
	}

	public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
	{
		super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void Button.onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo)>
		accessibilitynodeinfo.setClassName(((CharSequence) (((Class) (android/widget/Button)).getName())));
	//    3    5:aload_1         
	//    4    6:ldc1            #4   <Class Button>
	//    5    8:invokevirtual   #113 <Method String Class.getName()>
	//    6   11:invokevirtual   #126 <Method void AccessibilityNodeInfo.setClassName(CharSequence)>
	//    7   14:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int i1)
	{
		super.onLayout(flag, i, j, k, i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:invokespecial   #130 <Method void Button.onLayout(boolean, int, int, int, int)>
		if(b != null)
	//*   7   11:aload_0         
	//*   8   12:getfield        #48  <Field l b>
	//*   9   15:ifnull          32
			b.a(flag, i, j, k, i1);
	//   10   18:aload_0         
	//   11   19:getfield        #48  <Field l b>
	//   12   22:iload_1         
	//   13   23:iload_2         
	//   14   24:iload_3         
	//   15   25:iload           4
	//   16   27:iload           5
	//   17   29:invokevirtual   #132 <Method void l.a(boolean, int, int, int, int)>
	//   18   32:return          
	}

	protected void onTextChanged(CharSequence charsequence, int i, int j, int k)
	{
		super.onTextChanged(charsequence, i, j, k);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:iload_3         
	//    4    4:iload           4
	//    5    6:invokespecial   #136 <Method void Button.onTextChanged(CharSequence, int, int, int)>
		if(b != null && android.os.Build.VERSION.SDK_INT < 26 && b.c())
	//*   6    9:aload_0         
	//*   7   10:getfield        #48  <Field l b>
	//*   8   13:ifnull          41
	//*   9   16:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*  10   19:bipush          26
	//*  11   21:icmpge          41
	//*  12   24:aload_0         
	//*  13   25:getfield        #48  <Field l b>
	//*  14   28:invokevirtual   #139 <Method boolean l.c()>
	//*  15   31:ifeq            41
			b.b();
	//   16   34:aload_0         
	//   17   35:getfield        #48  <Field l b>
	//   18   38:invokevirtual   #141 <Method void l.b()>
	//   19   41:return          
	}

	public void setAutoSizeTextTypeUniformWithConfiguration(int i, int j, int k, int i1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          18
		{
			super.setAutoSizeTextTypeUniformWithConfiguration(i, j, k, i1);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokespecial   #145 <Method void Button.setAutoSizeTextTypeUniformWithConfiguration(int, int, int, int)>
			return;
	//    9   17:return          
		}
		if(b != null)
	//*  10   18:aload_0         
	//*  11   19:getfield        #48  <Field l b>
	//*  12   22:ifnull          37
			b.a(i, j, k, i1);
	//   13   25:aload_0         
	//   14   26:getfield        #48  <Field l b>
	//   15   29:iload_1         
	//   16   30:iload_2         
	//   17   31:iload_3         
	//   18   32:iload           4
	//   19   34:invokevirtual   #147 <Method void l.a(int, int, int, int)>
	//   20   37:return          
	}

	public void setAutoSizeTextTypeUniformWithPresetSizes(int ai[], int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
		{
			super.setAutoSizeTextTypeUniformWithPresetSizes(ai, i);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:iload_2         
	//    6   11:invokespecial   #151 <Method void Button.setAutoSizeTextTypeUniformWithPresetSizes(int[], int)>
			return;
	//    7   14:return          
		}
		if(b != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #48  <Field l b>
	//*  10   19:ifnull          31
			b.a(ai, i);
	//   11   22:aload_0         
	//   12   23:getfield        #48  <Field l b>
	//   13   26:aload_1         
	//   14   27:iload_2         
	//   15   28:invokevirtual   #153 <Method void l.a(int[], int)>
	//   16   31:return          
	}

	public void setAutoSizeTextTypeWithDefaults(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          14
		{
			super.setAutoSizeTextTypeWithDefaults(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #157 <Method void Button.setAutoSizeTextTypeWithDefaults(int)>
			return;
	//    6   13:return          
		}
		if(b != null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #48  <Field l b>
	//*   9   18:ifnull          29
			b.a(i);
	//   10   21:aload_0         
	//   11   22:getfield        #48  <Field l b>
	//   12   25:iload_1         
	//   13   26:invokevirtual   #159 <Method void l.a(int)>
	//   14   29:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #163 <Method void Button.setBackgroundDrawable(Drawable)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field f a>
	//*   5    9:ifnull          20
			a.a(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field f a>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #165 <Method void f.a(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #168 <Method void Button.setBackgroundResource(int)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field f a>
	//*   5    9:ifnull          20
			a.a(i);
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field f a>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #169 <Method void f.a(int)>
	//   10   20:return          
	}

	public void setSupportAllCaps(boolean flag)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #48  <Field l b>
	//*   2    4:ifnull          15
			b.a(flag);
	//    3    7:aload_0         
	//    4    8:getfield        #48  <Field l b>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #173 <Method void l.a(boolean)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintList(ColorStateList colorstatelist)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field f a>
	//*   2    4:ifnull          15
			a.a(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field f a>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #177 <Method void f.a(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportBackgroundTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field f a>
	//*   2    4:ifnull          15
			a.a(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field f a>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #181 <Method void f.a(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #185 <Method void Button.setTextAppearance(Context, int)>
		if(b != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #48  <Field l b>
	//*   6   10:ifnull          22
			b.a(context, i);
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field l b>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #187 <Method void l.a(Context, int)>
	//   12   22:return          
	}

	public void setTextSize(int i, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 26)
	//*   0    0:getstatic       #65  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmplt          15
		{
			super.setTextSize(i, f1);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:fload_2         
	//    6   11:invokespecial   #191 <Method void Button.setTextSize(int, float)>
			return;
	//    7   14:return          
		}
		if(b != null)
	//*   8   15:aload_0         
	//*   9   16:getfield        #48  <Field l b>
	//*  10   19:ifnull          31
			b.a(i, f1);
	//   11   22:aload_0         
	//   12   23:getfield        #48  <Field l b>
	//   13   26:iload_1         
	//   14   27:fload_2         
	//   15   28:invokevirtual   #193 <Method void l.a(int, float)>
	//   16   31:return          
	}

	private final f a;
	private final l b;
}
