// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.v4.widget.n;
import android.support.v7.c.a.b;
import android.util.AttributeSet;
import android.widget.RadioButton;

// Referenced classes of package android.support.v7.widget:
//			as, g

public class AppCompatRadioButton extends RadioButton
	implements n
{

	public AppCompatRadioButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #13  <Method void AppCompatRadioButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public AppCompatRadioButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.a.a.a.radioButtonStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #20  <Field int android.support.v7.a.a$a.radioButtonStyle>
	//    4    6:invokespecial   #23  <Method void AppCompatRadioButton(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public AppCompatRadioButton(Context context, AttributeSet attributeset, int i)
	{
		super(as.a(context), attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #28  <Method Context as.a(Context)>
	//    3    5:aload_2         
	//    4    6:iload_3         
	//    5    7:invokespecial   #29  <Method void RadioButton(Context, AttributeSet, int)>
		a = new g(((android.widget.CompoundButton) (this)));
	//    6   10:aload_0         
	//    7   11:new             #31  <Class g>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #34  <Method void g(android.widget.CompoundButton)>
	//   11   19:putfield        #36  <Field g a>
		a.a(attributeset, i);
	//   12   22:aload_0         
	//   13   23:getfield        #36  <Field g a>
	//   14   26:aload_2         
	//   15   27:iload_3         
	//   16   28:invokevirtual   #39  <Method void g.a(AttributeSet, int)>
	//   17   31:return          
	}

	public int getCompoundPaddingLeft()
	{
		int j = super.getCompoundPaddingLeft();
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method int RadioButton.getCompoundPaddingLeft()>
	//    2    4:istore_2        
		int i = j;
	//    3    5:iload_2         
	//    4    6:istore_1        
		if(a != null)
	//*   5    7:aload_0         
	//*   6    8:getfield        #36  <Field g a>
	//*   7   11:ifnull          23
			i = a.a(j);
	//    8   14:aload_0         
	//    9   15:getfield        #36  <Field g a>
	//   10   18:iload_2         
	//   11   19:invokevirtual   #46  <Method int g.a(int)>
	//   12   22:istore_1        
		return i;
	//   13   23:iload_1         
	//   14   24:ireturn         
	}

	public ColorStateList getSupportButtonTintList()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field g a>
	//*   2    4:ifnull          15
			return a.a();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field g a>
	//    5   11:invokevirtual   #50  <Method ColorStateList g.a()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public android.graphics.PorterDuff.Mode getSupportButtonTintMode()
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field g a>
	//*   2    4:ifnull          15
			return a.b();
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field g a>
	//    5   11:invokevirtual   #55  <Method android.graphics.PorterDuff$Mode android.support.v7.widget.g.b()>
	//    6   14:areturn         
		else
			return null;
	//    7   15:aconst_null     
	//    8   16:areturn         
	}

	public void setButtonDrawable(int i)
	{
		setButtonDrawable(b.b(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #61  <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #66  <Method Drawable b.b(Context, int)>
	//    5    9:invokevirtual   #69  <Method void setButtonDrawable(Drawable)>
	//    6   12:return          
	}

	public void setButtonDrawable(Drawable drawable)
	{
		super.setButtonDrawable(drawable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #70  <Method void RadioButton.setButtonDrawable(Drawable)>
		if(a != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #36  <Field g a>
	//*   5    9:ifnull          19
			a.c();
	//    6   12:aload_0         
	//    7   13:getfield        #36  <Field g a>
	//    8   16:invokevirtual   #74  <Method void g.c()>
	//    9   19:return          
	}

	public void setSupportButtonTintList(ColorStateList colorstatelist)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field g a>
	//*   2    4:ifnull          15
			a.a(colorstatelist);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field g a>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #78  <Method void g.a(ColorStateList)>
	//    7   15:return          
	}

	public void setSupportButtonTintMode(android.graphics.PorterDuff.Mode mode)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field g a>
	//*   2    4:ifnull          15
			a.a(mode);
	//    3    7:aload_0         
	//    4    8:getfield        #36  <Field g a>
	//    5   11:aload_1         
	//    6   12:invokevirtual   #82  <Method void g.a(android.graphics.PorterDuff$Mode)>
	//    7   15:return          
	}

	private final g a;
}
