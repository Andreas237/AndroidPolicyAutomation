// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.SignInButtonCreator;
import com.google.android.gms.common.internal.SignInButtonImpl;
import java.lang.annotation.Annotation;

public final class SignInButton extends FrameLayout
	implements android.view.View.OnClickListener
{
	public static interface ButtonSize
		extends Annotation
	{
	}

	public static interface ColorScheme
		extends Annotation
	{
	}


	public SignInButton(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #33  <Method void SignInButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public SignInButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #37  <Method void SignInButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public SignInButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #38  <Method void FrameLayout(Context, AttributeSet, int)>
		zzbx = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #40  <Field android.view.View$OnClickListener zzbx>
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, com.google.android.gms.base.R.styleable.SignInButton, 0, 0)));
	//    8   12:aload_1         
	//    9   13:invokevirtual   #46  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   16:aload_2         
	//   11   17:getstatic       #52  <Field int[] com.google.android.gms.base.R$styleable.SignInButton>
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #58  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   15   25:astore_1        
		mSize = ((TypedArray) (context)).getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:getstatic       #61  <Field int com.google.android.gms.base.R$styleable.SignInButton_buttonSize>
	//   19   31:iconst_0        
	//   20   32:invokevirtual   #67  <Method int TypedArray.getInt(int, int)>
	//   21   35:putfield        #69  <Field int mSize>
		mColor = ((TypedArray) (context)).getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:getstatic       #72  <Field int com.google.android.gms.base.R$styleable.SignInButton_colorScheme>
	//   25   43:iconst_2        
	//   26   44:invokevirtual   #67  <Method int TypedArray.getInt(int, int)>
	//   27   47:putfield        #74  <Field int mColor>
		((TypedArray) (context)).recycle();
	//   28   50:aload_1         
	//   29   51:invokevirtual   #78  <Method void TypedArray.recycle()>
		setStyle(mSize, mColor);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #69  <Field int mSize>
	//   33   59:aload_0         
	//   34   60:getfield        #74  <Field int mColor>
	//   35   63:invokevirtual   #82  <Method void setStyle(int, int)>
		return;
	//   36   66:return          
		attributeset;
	//   37   67:astore_2        
		((TypedArray) (context)).recycle();
	//   38   68:aload_1         
	//   39   69:invokevirtual   #78  <Method void TypedArray.recycle()>
		throw attributeset;
	//   40   72:aload_2         
	//   41   73:athrow          
	}

	public final void onClick(View view)
	{
		if(zzbx != null && view == zzbw)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field android.view.View$OnClickListener zzbx>
	//*   2    4:ifnull          25
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #86  <Field View zzbw>
	//*   6   12:if_acmpne       25
			zzbx.onClick(((View) (this)));
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field android.view.View$OnClickListener zzbx>
	//    9   19:aload_0         
	//   10   20:invokeinterface #88  <Method void android.view.View$OnClickListener.onClick(View)>
	//   11   25:return          
	}

	public final void setColorScheme(int i)
	{
		setStyle(mSize, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #69  <Field int mSize>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #82  <Method void setStyle(int, int)>
	//    5    9:return          
	}

	public final void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #94  <Method void FrameLayout.setEnabled(boolean)>
		zzbw.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #86  <Field View zzbw>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #97  <Method void View.setEnabled(boolean)>
	//    7   13:return          
	}

	public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		zzbx = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field android.view.View$OnClickListener zzbx>
		if(zzbw != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #86  <Field View zzbw>
	//*   5    9:ifnull          20
			zzbw.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #86  <Field View zzbw>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #101 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   10   20:return          
	}

	public final void setScopes(Scope ascope[])
	{
		setStyle(mSize, mColor);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #69  <Field int mSize>
	//    3    5:aload_0         
	//    4    6:getfield        #74  <Field int mColor>
	//    5    9:invokevirtual   #82  <Method void setStyle(int, int)>
	//    6   12:return          
	}

	public final void setSize(int i)
	{
		setStyle(i, mColor);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #74  <Field int mColor>
	//    4    6:invokevirtual   #82  <Method void setStyle(int, int)>
	//    5    9:return          
	}

	public final void setStyle(int i, int j)
	{
		com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remotecreatorexception;
		mSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #69  <Field int mSize>
		mColor = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #74  <Field int mColor>
		Context context = getContext();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #112 <Method Context getContext()>
	//    8   14:astore_3        
		if(zzbw != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #86  <Field View zzbw>
	//*  11   19:ifnull          30
			removeView(zzbw);
	//   12   22:aload_0         
	//   13   23:aload_0         
	//   14   24:getfield        #86  <Field View zzbw>
	//   15   27:invokevirtual   #115 <Method void removeView(View)>
		SignInButtonImpl signinbuttonimpl;
		try
		{
			zzbw = SignInButtonCreator.createView(context, mSize, mColor);
	//   16   30:aload_0         
	//   17   31:aload_3         
	//   18   32:aload_0         
	//   19   33:getfield        #69  <Field int mSize>
	//   20   36:aload_0         
	//   21   37:getfield        #74  <Field int mColor>
	//   22   40:invokestatic    #121 <Method View SignInButtonCreator.createView(Context, int, int)>
	//   23   43:putfield        #86  <Field View zzbw>
		}
	//*  24   46:goto            94
	//*  25   49:ldc1            #122 <String "SignInButton">
	//*  26   51:ldc1            #124 <String "Sign in button not found, using placeholder instead">
	//*  27   53:invokestatic    #130 <Method int Log.w(String, String)>
	//*  28   56:pop             
	//*  29   57:aload_0         
	//*  30   58:getfield        #69  <Field int mSize>
	//*  31   61:istore_1        
	//*  32   62:aload_0         
	//*  33   63:getfield        #74  <Field int mColor>
	//*  34   66:istore_2        
	//*  35   67:new             #132 <Class SignInButtonImpl>
	//*  36   70:dup             
	//*  37   71:aload_3         
	//*  38   72:invokespecial   #134 <Method void SignInButtonImpl(Context)>
	//*  39   75:astore          4
	//*  40   77:aload           4
	//*  41   79:aload_3         
	//*  42   80:invokevirtual   #138 <Method android.content.res.Resources Context.getResources()>
	//*  43   83:iload_1         
	//*  44   84:iload_2         
	//*  45   85:invokevirtual   #142 <Method void SignInButtonImpl.configure(android.content.res.Resources, int, int)>
	//*  46   88:aload_0         
	//*  47   89:aload           4
	//*  48   91:putfield        #86  <Field View zzbw>
	//*  49   94:aload_0         
	//*  50   95:aload_0         
	//*  51   96:getfield        #86  <Field View zzbw>
	//*  52   99:invokevirtual   #145 <Method void addView(View)>
	//*  53  102:aload_0         
	//*  54  103:getfield        #86  <Field View zzbw>
	//*  55  106:aload_0         
	//*  56  107:invokevirtual   #149 <Method boolean isEnabled()>
	//*  57  110:invokevirtual   #97  <Method void View.setEnabled(boolean)>
	//*  58  113:aload_0         
	//*  59  114:getfield        #86  <Field View zzbw>
	//*  60  117:aload_0         
	//*  61  118:invokevirtual   #101 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//*  62  121:return          
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remotecreatorexception)
		{
			Log.w("SignInButton", "Sign in button not found, using placeholder instead");
			i = mSize;
			j = mColor;
			signinbuttonimpl = new SignInButtonImpl(context);
			signinbuttonimpl.configure(context.getResources(), i, j);
			zzbw = ((View) (signinbuttonimpl));
		}
		addView(zzbw);
		zzbw.setEnabled(isEnabled());
		zzbw.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//*  63  122:astore          4
	//*  64  124:goto            49
	}

	public final void setStyle(int i, int j, Scope ascope[])
	{
		setStyle(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #82  <Method void setStyle(int, int)>
	//    4    6:return          
	}

	public static final int COLOR_AUTO = 2;
	public static final int COLOR_DARK = 0;
	public static final int COLOR_LIGHT = 1;
	public static final int SIZE_ICON_ONLY = 2;
	public static final int SIZE_STANDARD = 0;
	public static final int SIZE_WIDE = 1;
	private int mColor;
	private int mSize;
	private View zzbw;
	private android.view.View.OnClickListener zzbx;
}
