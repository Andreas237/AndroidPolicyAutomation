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
import com.newrelic.agent.android.instrumentation.ViewInstrumentation;
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
	//    3    3:invokespecial   #34  <Method void SignInButton(Context, AttributeSet)>
	//    4    6:return          
	}

	public SignInButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #38  <Method void SignInButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public SignInButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #39  <Method void FrameLayout(Context, AttributeSet, int)>
		zzbx = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #41  <Field android.view.View$OnClickListener zzbx>
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, com.google.android.gms.base.R.styleable.SignInButton, 0, 0)));
	//    8   12:aload_1         
	//    9   13:invokevirtual   #47  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   16:aload_2         
	//   11   17:getstatic       #53  <Field int[] com.google.android.gms.base.R$styleable.SignInButton>
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:invokevirtual   #59  <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   15   25:astore_1        
		mSize = ((TypedArray) (context)).getInt(com.google.android.gms.base.R.styleable.SignInButton_buttonSize, 0);
	//   16   26:aload_0         
	//   17   27:aload_1         
	//   18   28:getstatic       #62  <Field int com.google.android.gms.base.R$styleable.SignInButton_buttonSize>
	//   19   31:iconst_0        
	//   20   32:invokevirtual   #68  <Method int TypedArray.getInt(int, int)>
	//   21   35:putfield        #70  <Field int mSize>
		mColor = ((TypedArray) (context)).getInt(com.google.android.gms.base.R.styleable.SignInButton_colorScheme, 2);
	//   22   38:aload_0         
	//   23   39:aload_1         
	//   24   40:getstatic       #73  <Field int com.google.android.gms.base.R$styleable.SignInButton_colorScheme>
	//   25   43:iconst_2        
	//   26   44:invokevirtual   #68  <Method int TypedArray.getInt(int, int)>
	//   27   47:putfield        #75  <Field int mColor>
		((TypedArray) (context)).recycle();
	//   28   50:aload_1         
	//   29   51:invokevirtual   #79  <Method void TypedArray.recycle()>
		setStyle(mSize, mColor);
	//   30   54:aload_0         
	//   31   55:aload_0         
	//   32   56:getfield        #70  <Field int mSize>
	//   33   59:aload_0         
	//   34   60:getfield        #75  <Field int mColor>
	//   35   63:invokevirtual   #83  <Method void setStyle(int, int)>
		return;
	//   36   66:return          
		attributeset;
	//   37   67:astore_2        
		((TypedArray) (context)).recycle();
	//   38   68:aload_1         
	//   39   69:invokevirtual   #79  <Method void TypedArray.recycle()>
		throw attributeset;
	//   40   72:aload_2         
	//   41   73:athrow          
	}

	public final void onClick(View view)
	{
		android.view.View.OnClickListener onclicklistener = zzbx;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field android.view.View$OnClickListener zzbx>
	//    2    4:astore_2        
		if(onclicklistener != null && view == zzbw)
	//*   3    5:aload_2         
	//*   4    6:ifnull          24
	//*   5    9:aload_1         
	//*   6   10:aload_0         
	//*   7   11:getfield        #87  <Field View zzbw>
	//*   8   14:if_acmpne       24
			onclicklistener.onClick(((View) (this)));
	//    9   17:aload_2         
	//   10   18:aload_0         
	//   11   19:invokeinterface #89  <Method void android.view.View$OnClickListener.onClick(View)>
	//   12   24:return          
	}

	public final void setColorScheme(int i)
	{
		setStyle(mSize, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field int mSize>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #83  <Method void setStyle(int, int)>
	//    5    9:return          
	}

	public final void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #95  <Method void FrameLayout.setEnabled(boolean)>
		zzbw.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #87  <Field View zzbw>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #98  <Method void View.setEnabled(boolean)>
	//    7   13:return          
	}

	public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		zzbx = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field android.view.View$OnClickListener zzbx>
		onclicklistener = ((android.view.View.OnClickListener) (zzbw));
	//    3    5:aload_0         
	//    4    6:getfield        #87  <Field View zzbw>
	//    5    9:astore_1        
		if(onclicklistener != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          35
		{
			if(!(onclicklistener instanceof View))
	//*   8   14:aload_1         
	//*   9   15:instanceof      #97  <Class View>
	//*  10   18:ifne            27
			{
				((View) (onclicklistener)).setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   11   21:aload_1         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #102 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
				return;
	//   14   26:return          
			}
			ViewInstrumentation.setOnClickListener((View)onclicklistener, ((android.view.View.OnClickListener) (this)));
	//   15   27:aload_1         
	//   16   28:checkcast       #97  <Class View>
	//   17   31:aload_0         
	//   18   32:invokestatic    #107 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
		}
	//   19   35:return          
	}

	public final void setScopes(Scope ascope[])
	{
		setStyle(mSize, mColor);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #70  <Field int mSize>
	//    3    5:aload_0         
	//    4    6:getfield        #75  <Field int mColor>
	//    5    9:invokevirtual   #83  <Method void setStyle(int, int)>
	//    6   12:return          
	}

	public final void setSize(int i)
	{
		setStyle(i, mColor);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #75  <Field int mColor>
	//    4    6:invokevirtual   #83  <Method void setStyle(int, int)>
	//    5    9:return          
	}

	public final void setStyle(int i, int j)
	{
		com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remotecreatorexception;
		mSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #70  <Field int mSize>
		mColor = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #75  <Field int mColor>
		Object obj = ((Object) (getContext()));
	//    6   10:aload_0         
	//    7   11:invokevirtual   #118 <Method Context getContext()>
	//    8   14:astore_3        
		Object obj1 = ((Object) (zzbw));
	//    9   15:aload_0         
	//   10   16:getfield        #87  <Field View zzbw>
	//   11   19:astore          4
		if(obj1 != null)
	//*  12   21:aload           4
	//*  13   23:ifnull          32
			removeView(((View) (obj1)));
	//   14   26:aload_0         
	//   15   27:aload           4
	//   16   29:invokevirtual   #121 <Method void removeView(View)>
		try
		{
			zzbw = SignInButtonCreator.createView(((Context) (obj)), mSize, mColor);
	//   17   32:aload_0         
	//   18   33:aload_3         
	//   19   34:aload_0         
	//   20   35:getfield        #70  <Field int mSize>
	//   21   38:aload_0         
	//   22   39:getfield        #75  <Field int mColor>
	//   23   42:invokestatic    #127 <Method View SignInButtonCreator.createView(Context, int, int)>
	//   24   45:putfield        #87  <Field View zzbw>
		}
	//*  25   48:goto            96
	//*  26   51:ldc1            #128 <String "SignInButton">
	//*  27   53:ldc1            #130 <String "Sign in button not found, using placeholder instead">
	//*  28   55:invokestatic    #136 <Method int Log.w(String, String)>
	//*  29   58:pop             
	//*  30   59:aload_0         
	//*  31   60:getfield        #70  <Field int mSize>
	//*  32   63:istore_1        
	//*  33   64:aload_0         
	//*  34   65:getfield        #75  <Field int mColor>
	//*  35   68:istore_2        
	//*  36   69:new             #138 <Class SignInButtonImpl>
	//*  37   72:dup             
	//*  38   73:aload_3         
	//*  39   74:invokespecial   #140 <Method void SignInButtonImpl(Context)>
	//*  40   77:astore          4
	//*  41   79:aload           4
	//*  42   81:aload_3         
	//*  43   82:invokevirtual   #144 <Method android.content.res.Resources Context.getResources()>
	//*  44   85:iload_1         
	//*  45   86:iload_2         
	//*  46   87:invokevirtual   #148 <Method void SignInButtonImpl.configure(android.content.res.Resources, int, int)>
	//*  47   90:aload_0         
	//*  48   91:aload           4
	//*  49   93:putfield        #87  <Field View zzbw>
	//*  50   96:aload_0         
	//*  51   97:aload_0         
	//*  52   98:getfield        #87  <Field View zzbw>
	//*  53  101:invokevirtual   #151 <Method void addView(View)>
	//*  54  104:aload_0         
	//*  55  105:getfield        #87  <Field View zzbw>
	//*  56  108:aload_0         
	//*  57  109:invokevirtual   #155 <Method boolean isEnabled()>
	//*  58  112:invokevirtual   #98  <Method void View.setEnabled(boolean)>
	//*  59  115:aload_0         
	//*  60  116:getfield        #87  <Field View zzbw>
	//*  61  119:astore_3        
	//*  62  120:aload_3         
	//*  63  121:instanceof      #97  <Class View>
	//*  64  124:ifne            133
	//*  65  127:aload_3         
	//*  66  128:aload_0         
	//*  67  129:invokevirtual   #102 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//*  68  132:return          
	//*  69  133:aload_3         
	//*  70  134:checkcast       #97  <Class View>
	//*  71  137:aload_0         
	//*  72  138:invokestatic    #107 <Method void ViewInstrumentation.setOnClickListener(View, android.view.View$OnClickListener)>
	//*  73  141:return          
		// Misplaced declaration of an exception variable
		catch(com.google.android.gms.dynamic.RemoteCreator.RemoteCreatorException remotecreatorexception)
		{
			Log.w("SignInButton", "Sign in button not found, using placeholder instead");
			i = mSize;
			j = mColor;
			obj1 = ((Object) (new SignInButtonImpl(((Context) (obj)))));
			((SignInButtonImpl) (obj1)).configure(((Context) (obj)).getResources(), i, j);
			zzbw = ((View) (obj1));
		}
		addView(zzbw);
		zzbw.setEnabled(isEnabled());
		obj = ((Object) (zzbw));
		if(!(obj instanceof View))
		{
			((View) (obj)).setOnClickListener(((android.view.View.OnClickListener) (this)));
			return;
		} else
		{
			ViewInstrumentation.setOnClickListener((View)obj, ((android.view.View.OnClickListener) (this)));
			return;
		}
	//*  74  142:astore          4
	//*  75  144:goto            51
	}

	public final void setStyle(int i, int j, Scope ascope[])
	{
		setStyle(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #83  <Method void setStyle(int, int)>
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
