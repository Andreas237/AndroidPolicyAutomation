// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.zzaj;
import com.google.android.gms.common.internal.zzak;
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
		zzaxt = null;
	//    5    7:aload_0         
	//    6    8:aconst_null     
	//    7    9:putfield        #40  <Field android.view.View$OnClickListener zzaxt>
		zzb(context, attributeset);
	//    8   12:aload_0         
	//    9   13:aload_1         
	//   10   14:aload_2         
	//   11   15:invokespecial   #43  <Method void zzb(Context, AttributeSet)>
		setStyle(mSize, mColor);
	//   12   18:aload_0         
	//   13   19:aload_0         
	//   14   20:getfield        #45  <Field int mSize>
	//   15   23:aload_0         
	//   16   24:getfield        #47  <Field int mColor>
	//   17   27:invokevirtual   #51  <Method void setStyle(int, int)>
	//   18   30:return          
	}

	private void zzaw(Context context)
	{
		if(zzaxs != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #56  <Field View zzaxs>
	//*   2    4:ifnull          15
			removeView(zzaxs);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #56  <Field View zzaxs>
	//    6   12:invokevirtual   #60  <Method void removeView(View)>
		try
		{
			zzaxs = zzaj.zzd(context, mSize, mColor);
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #45  <Field int mSize>
	//   11   21:aload_0         
	//   12   22:getfield        #47  <Field int mColor>
	//   13   25:invokestatic    #66  <Method View zzaj.zzd(Context, int, int)>
	//   14   28:putfield        #56  <Field View zzaxs>
		}
	//*  15   31:aload_0         
	//*  16   32:aload_0         
	//*  17   33:getfield        #56  <Field View zzaxs>
	//*  18   36:invokevirtual   #69  <Method void addView(View)>
	//*  19   39:aload_0         
	//*  20   40:getfield        #56  <Field View zzaxs>
	//*  21   43:aload_0         
	//*  22   44:invokevirtual   #73  <Method boolean isEnabled()>
	//*  23   47:invokevirtual   #79  <Method void View.setEnabled(boolean)>
	//*  24   50:aload_0         
	//*  25   51:getfield        #56  <Field View zzaxs>
	//*  26   54:aload_0         
	//*  27   55:invokevirtual   #83  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//*  28   58:return          
		catch(com.google.android.gms.dynamic.zzg.zza zza)
	//*  29   59:astore_2        
		{
			Log.w("SignInButton", "Sign in button not found, using placeholder instead");
	//   30   60:ldc1            #85  <String "SignInButton">
	//   31   62:ldc1            #87  <String "Sign in button not found, using placeholder instead">
	//   32   64:invokestatic    #93  <Method int Log.w(String, String)>
	//   33   67:pop             
			zzaxs = ((View) (zzc(context, mSize, mColor)));
	//   34   68:aload_0         
	//   35   69:aload_1         
	//   36   70:aload_0         
	//   37   71:getfield        #45  <Field int mSize>
	//   38   74:aload_0         
	//   39   75:getfield        #47  <Field int mColor>
	//   40   78:invokestatic    #97  <Method Button zzc(Context, int, int)>
	//   41   81:putfield        #56  <Field View zzaxs>
		}
		addView(zzaxs);
		zzaxs.setEnabled(isEnabled());
		zzaxs.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//*  42   84:goto            31
	}

	private void zzb(Context context, AttributeSet attributeset)
	{
		context = ((Context) (context.getTheme().obtainStyledAttributes(attributeset, com.google.android.gms.R.styleable.SignInButton, 0, 0)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #103 <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:aload_2         
	//    3    5:getstatic       #108 <Field int[] com.google.android.gms.R$styleable.SignInButton>
	//    4    8:iconst_0        
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #114 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//    7   13:astore_1        
		mSize = ((TypedArray) (context)).getInt(com.google.android.gms.R.styleable.SignInButton_buttonSize, 0);
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:getstatic       #117 <Field int com.google.android.gms.R$styleable.SignInButton_buttonSize>
	//   11   19:iconst_0        
	//   12   20:invokevirtual   #123 <Method int TypedArray.getInt(int, int)>
	//   13   23:putfield        #45  <Field int mSize>
		mColor = ((TypedArray) (context)).getInt(com.google.android.gms.R.styleable.SignInButton_colorScheme, 2);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getstatic       #126 <Field int com.google.android.gms.R$styleable.SignInButton_colorScheme>
	//   17   31:iconst_2        
	//   18   32:invokevirtual   #123 <Method int TypedArray.getInt(int, int)>
	//   19   35:putfield        #47  <Field int mColor>
		((TypedArray) (context)).recycle();
	//   20   38:aload_1         
	//   21   39:invokevirtual   #130 <Method void TypedArray.recycle()>
		return;
	//   22   42:return          
		attributeset;
	//   23   43:astore_2        
		((TypedArray) (context)).recycle();
	//   24   44:aload_1         
	//   25   45:invokevirtual   #130 <Method void TypedArray.recycle()>
		throw attributeset;
	//   26   48:aload_2         
	//   27   49:athrow          
	}

	private static Button zzc(Context context, int i, int j)
	{
		zzak zzak1 = new zzak(context);
	//    0    0:new             #132 <Class zzak>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #134 <Method void zzak(Context)>
	//    4    8:astore_3        
		zzak1.zza(context.getResources(), i, j);
	//    5    9:aload_3         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #138 <Method android.content.res.Resources Context.getResources()>
	//    8   14:iload_1         
	//    9   15:iload_2         
	//   10   16:invokevirtual   #142 <Method void zzak.zza(android.content.res.Resources, int, int)>
		return ((Button) (zzak1));
	//   11   19:aload_3         
	//   12   20:areturn         
	}

	public void onClick(View view)
	{
		if(zzaxt != null && view == zzaxs)
	//*   0    0:aload_0         
	//*   1    1:getfield        #40  <Field android.view.View$OnClickListener zzaxt>
	//*   2    4:ifnull          25
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #56  <Field View zzaxs>
	//*   6   12:if_acmpne       25
			zzaxt.onClick(((View) (this)));
	//    7   15:aload_0         
	//    8   16:getfield        #40  <Field android.view.View$OnClickListener zzaxt>
	//    9   19:aload_0         
	//   10   20:invokeinterface #145 <Method void android.view.View$OnClickListener.onClick(View)>
	//   11   25:return          
	}

	public void setColorScheme(int i)
	{
		setStyle(mSize, i);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field int mSize>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #51  <Method void setStyle(int, int)>
	//    5    9:return          
	}

	public void setEnabled(boolean flag)
	{
		super.setEnabled(flag);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #148 <Method void FrameLayout.setEnabled(boolean)>
		zzaxs.setEnabled(flag);
	//    3    5:aload_0         
	//    4    6:getfield        #56  <Field View zzaxs>
	//    5    9:iload_1         
	//    6   10:invokevirtual   #79  <Method void View.setEnabled(boolean)>
	//    7   13:return          
	}

	public void setOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		zzaxt = onclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field android.view.View$OnClickListener zzaxt>
		if(zzaxs != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #56  <Field View zzaxs>
	//*   5    9:ifnull          20
			zzaxs.setOnClickListener(((android.view.View.OnClickListener) (this)));
	//    6   12:aload_0         
	//    7   13:getfield        #56  <Field View zzaxs>
	//    8   16:aload_0         
	//    9   17:invokevirtual   #83  <Method void View.setOnClickListener(android.view.View$OnClickListener)>
	//   10   20:return          
	}

	public void setScopes(Scope ascope[])
	{
		setStyle(mSize, mColor);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #45  <Field int mSize>
	//    3    5:aload_0         
	//    4    6:getfield        #47  <Field int mColor>
	//    5    9:invokevirtual   #51  <Method void setStyle(int, int)>
	//    6   12:return          
	}

	public void setSize(int i)
	{
		setStyle(i, mColor);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_0         
	//    3    3:getfield        #47  <Field int mColor>
	//    4    6:invokevirtual   #51  <Method void setStyle(int, int)>
	//    5    9:return          
	}

	public void setStyle(int i, int j)
	{
		mSize = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #45  <Field int mSize>
		mColor = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #47  <Field int mColor>
		zzaw(getContext());
	//    6   10:aload_0         
	//    7   11:aload_0         
	//    8   12:invokevirtual   #157 <Method Context getContext()>
	//    9   15:invokespecial   #159 <Method void zzaw(Context)>
	//   10   18:return          
	}

	public void setStyle(int i, int j, Scope ascope[])
	{
		setStyle(i, j);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:iload_2         
	//    3    3:invokevirtual   #51  <Method void setStyle(int, int)>
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
	private View zzaxs;
	private android.view.View.OnClickListener zzaxt;
}
