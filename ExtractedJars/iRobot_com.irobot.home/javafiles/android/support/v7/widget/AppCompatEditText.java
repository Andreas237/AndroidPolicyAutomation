// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.view.r;
import android.util.AttributeSet;
import android.widget.EditText;

// Referenced classes of package android.support.v7.widget:
//			as, f, l

public class AppCompatEditText extends EditText
	implements r
{

	public AppCompatEditText(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void AppCompatEditText(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatEditText(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.editTextStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #22  <Field int android.support.v7.a.a$a.editTextStyle>
	//    4    6:invokespecial   #25  <Method void AppCompatEditText(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatEditText(Context context, AttributeSet attributeset, int i)
	{
		super(as.a(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #30  <Method Context as.a(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #31  <Method void EditText(Context, AttributeSet, int)>
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
	//    1    1:invokespecial   #55  <Method void EditText.drawableStateChanged()>
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

	public ColorStateList getSupportBackgroundTintList()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field f a>
	//*   2    4:ifnull          15
			return a.a();
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field f a>
	//    5   11:invokevirtual   #62  <Method ColorStateList f.a()>
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
	//    5   11:invokevirtual   #66  <Method android.graphics.PorterDuff$Mode f.b()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		super.setBackgroundDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void EditText.setBackgroundDrawable(Drawable)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field f a>
	//*   5    9:ifnull          20
			a.a(drawable);
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field f a>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #72  <Method void f.a(Drawable)>
	//   10   20:return          
	}

	public void setBackgroundResource(int i)
	{
		super.setBackgroundResource(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #76  <Method void EditText.setBackgroundResource(int)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #38  <Field f a>
	//*   5    9:ifnull          20
			a.a(i);
	//    6   12:aload_0         
	//    7   13:getfield        #38  <Field f a>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #78  <Method void f.a(int)>
	//   10   20:return          
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
	//    6   12:invokevirtual   #82  <Method void f.a(ColorStateList)>
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
	//    6   12:invokevirtual   #86  <Method void f.a(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	public void setTextAppearance(Context context, int i)
	{
		super.setTextAppearance(context, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #90  <Method void EditText.setTextAppearance(Context, int)>
		if(b != null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #48  <Field l b>
	//*   6   10:ifnull          22
			b.a(context, i);
	//    7   13:aload_0         
	//    8   14:getfield        #48  <Field l b>
	//    9   17:aload_1         
	//   10   18:iload_2         
	//   11   19:invokevirtual   #92  <Method void l.a(Context, int)>
	//   12   22:return          
	}

	private final f a;
	private final l b;
}
