// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.*;

// Referenced classes of package com.digits.sdk.android:
//			ThemeUtils, ButtonThemer

public class StateButton extends RelativeLayout
{

	public StateButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #23  <Method void StateButton(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public StateButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #25  <Method void RelativeLayout(Context, AttributeSet, int)>
		attributeset = ((AttributeSet) (context.obtainStyledAttributes(attributeset, R.styleable.StateButton)));
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:getstatic       #31  <Field int[] R$styleable.StateButton>
	//    8   12:invokevirtual   #37  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[])>
	//    9   15:astore_2        
		init(((TypedArray) (attributeset)));
	//   10   16:aload_0         
	//   11   17:aload_2         
	//   12   18:invokevirtual   #41  <Method void init(TypedArray)>
		((TypedArray) (attributeset)).recycle();
	//   13   21:aload_2         
	//   14   22:invokevirtual   #47  <Method void TypedArray.recycle()>
		accentColor = ThemeUtils.getAccentColor(getResources(), context.getTheme());
	//   15   25:aload_0         
	//   16   26:aload_0         
	//   17   27:invokevirtual   #51  <Method Resources getResources()>
	//   18   30:aload_1         
	//   19   31:invokevirtual   #55  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   20   34:invokestatic    #61  <Method int ThemeUtils.getAccentColor(Resources, android.content.res.Resources$Theme)>
	//   21   37:putfield        #63  <Field int accentColor>
		buttonThemer = new ButtonThemer(getResources());
	//   22   40:aload_0         
	//   23   41:new             #65  <Class ButtonThemer>
	//   24   44:dup             
	//   25   45:aload_0         
	//   26   46:invokevirtual   #51  <Method Resources getResources()>
	//   27   49:invokespecial   #68  <Method void ButtonThemer(Resources)>
	//   28   52:putfield        #70  <Field ButtonThemer buttonThemer>
		buttonThemer.setBackgroundAccentColor(((android.view.View) (this)), accentColor);
	//   29   55:aload_0         
	//   30   56:getfield        #70  <Field ButtonThemer buttonThemer>
	//   31   59:aload_0         
	//   32   60:aload_0         
	//   33   61:getfield        #63  <Field int accentColor>
	//   34   64:invokevirtual   #74  <Method void ButtonThemer.setBackgroundAccentColor(android.view.View, int)>
		buttonThemer.setTextAccentColor(textView, accentColor);
	//   35   67:aload_0         
	//   36   68:getfield        #70  <Field ButtonThemer buttonThemer>
	//   37   71:aload_0         
	//   38   72:getfield        #76  <Field TextView textView>
	//   39   75:aload_0         
	//   40   76:getfield        #63  <Field int accentColor>
	//   41   79:invokevirtual   #80  <Method void ButtonThemer.setTextAccentColor(TextView, int)>
		setImageAccentColor();
	//   42   82:aload_0         
	//   43   83:invokevirtual   #83  <Method void setImageAccentColor()>
		setSpinnerAccentColor();
	//   44   86:aload_0         
	//   45   87:invokevirtual   #86  <Method void setSpinnerAccentColor()>
	//   46   90:return          
	}

	private void initView()
	{
		inflate(getContext(), R.layout.dgts__state_button, ((android.view.ViewGroup) (this)));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method Context getContext()>
	//    2    4:getstatic       #96  <Field int R$layout.dgts__state_button>
	//    3    7:aload_0         
	//    4    8:invokestatic    #100 <Method android.view.View inflate(Context, int, android.view.ViewGroup)>
	//    5   11:pop             
		textView = (TextView)findViewById(R.id.dgts__state_button);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getstatic       #103 <Field int R$id.dgts__state_button>
	//    9   17:invokevirtual   #107 <Method android.view.View findViewById(int)>
	//   10   20:checkcast       #109 <Class TextView>
	//   11   23:putfield        #76  <Field TextView textView>
		progressBar = (ProgressBar)findViewById(R.id.dgts__state_progress);
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:getstatic       #112 <Field int R$id.dgts__state_progress>
	//   15   31:invokevirtual   #107 <Method android.view.View findViewById(int)>
	//   16   34:checkcast       #114 <Class ProgressBar>
	//   17   37:putfield        #116 <Field ProgressBar progressBar>
		imageView = (ImageView)findViewById(R.id.dgts__state_success);
	//   18   40:aload_0         
	//   19   41:aload_0         
	//   20   42:getstatic       #119 <Field int R$id.dgts__state_success>
	//   21   45:invokevirtual   #107 <Method android.view.View findViewById(int)>
	//   22   48:checkcast       #121 <Class ImageView>
	//   23   51:putfield        #123 <Field ImageView imageView>
		showStart();
	//   24   54:aload_0         
	//   25   55:invokevirtual   #126 <Method void showStart()>
	//   26   58:return          
	}

	Drawable getProgressDrawable()
	{
		int i;
		Resources resources;
		if(ThemeUtils.isLightColor(accentColor))
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field int accentColor>
	//*   2    4:invokestatic    #132 <Method boolean ThemeUtils.isLightColor(int)>
	//*   3    7:ifeq            22
		{
			resources = getResources();
	//    4   10:aload_0         
	//    5   11:invokevirtual   #51  <Method Resources getResources()>
	//    6   14:astore_2        
			i = R.drawable.progress_dark;
	//    7   15:getstatic       #137 <Field int R$drawable.progress_dark>
	//    8   18:istore_1        
		} else
	//*   9   19:goto            31
		{
			resources = getResources();
	//   10   22:aload_0         
	//   11   23:invokevirtual   #51  <Method Resources getResources()>
	//   12   26:astore_2        
			i = R.drawable.progress_light;
	//   13   27:getstatic       #140 <Field int R$drawable.progress_light>
	//   14   30:istore_1        
		}
		return resources.getDrawable(i);
	//   15   31:aload_2         
	//   16   32:iload_1         
	//   17   33:invokevirtual   #146 <Method Drawable Resources.getDrawable(int)>
	//   18   36:areturn         
	}

	int getTextColor()
	{
		return buttonThemer.getTextColor(accentColor);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field ButtonThemer buttonThemer>
	//    2    4:aload_0         
	//    3    5:getfield        #63  <Field int accentColor>
	//    4    8:invokevirtual   #151 <Method int ButtonThemer.getTextColor(int)>
	//    5   11:ireturn         
	}

	void init(TypedArray typedarray)
	{
		startText = typedarray.getText(R.styleable.StateButton_startStateText);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:getstatic       #154 <Field int R$styleable.StateButton_startStateText>
	//    3    5:invokevirtual   #158 <Method CharSequence TypedArray.getText(int)>
	//    4    8:putfield        #160 <Field CharSequence startText>
		progressText = typedarray.getText(R.styleable.StateButton_progressStateText);
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:getstatic       #163 <Field int R$styleable.StateButton_progressStateText>
	//    8   16:invokevirtual   #158 <Method CharSequence TypedArray.getText(int)>
	//    9   19:putfield        #165 <Field CharSequence progressText>
		finishText = typedarray.getText(R.styleable.StateButton_finishStateText);
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:getstatic       #168 <Field int R$styleable.StateButton_finishStateText>
	//   13   27:invokevirtual   #158 <Method CharSequence TypedArray.getText(int)>
	//   14   30:putfield        #170 <Field CharSequence finishText>
		initView();
	//   15   33:aload_0         
	//   16   34:invokespecial   #172 <Method void initView()>
	//   17   37:return          
	}

	void setImageAccentColor()
	{
		imageView.setColorFilter(getTextColor(), android.graphics.PorterDuff.Mode.SRC_IN);
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field ImageView imageView>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #174 <Method int getTextColor()>
	//    4    8:getstatic       #180 <Field android.graphics.PorterDuff$Mode android.graphics.PorterDuff$Mode.SRC_IN>
	//    5   11:invokevirtual   #184 <Method void ImageView.setColorFilter(int, android.graphics.PorterDuff$Mode)>
	//    6   14:return          
	}

	void setSpinnerAccentColor()
	{
		progressBar.setIndeterminateDrawable(getProgressDrawable());
	//    0    0:aload_0         
	//    1    1:getfield        #116 <Field ProgressBar progressBar>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #186 <Method Drawable getProgressDrawable()>
	//    4    8:invokevirtual   #190 <Method void ProgressBar.setIndeterminateDrawable(Drawable)>
	//    5   11:return          
	}

	public void setStatesText(int i, int j, int k)
	{
		Context context = getContext();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #91  <Method Context getContext()>
	//    2    4:astore          4
		startText = ((CharSequence) (context.getString(i)));
	//    3    6:aload_0         
	//    4    7:aload           4
	//    5    9:iload_1         
	//    6   10:invokevirtual   #196 <Method String Context.getString(int)>
	//    7   13:putfield        #160 <Field CharSequence startText>
		progressText = ((CharSequence) (context.getString(j)));
	//    8   16:aload_0         
	//    9   17:aload           4
	//   10   19:iload_2         
	//   11   20:invokevirtual   #196 <Method String Context.getString(int)>
	//   12   23:putfield        #165 <Field CharSequence progressText>
		finishText = ((CharSequence) (context.getString(k)));
	//   13   26:aload_0         
	//   14   27:aload           4
	//   15   29:iload_3         
	//   16   30:invokevirtual   #196 <Method String Context.getString(int)>
	//   17   33:putfield        #170 <Field CharSequence finishText>
	//   18   36:return          
	}

	public void showError()
	{
		showStart();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #126 <Method void showStart()>
	//    2    4:return          
	}

	public void showFinish()
	{
		setClickable(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #202 <Method void setClickable(boolean)>
		textView.setText(finishText);
	//    3    5:aload_0         
	//    4    6:getfield        #76  <Field TextView textView>
	//    5    9:aload_0         
	//    6   10:getfield        #170 <Field CharSequence finishText>
	//    7   13:invokevirtual   #206 <Method void TextView.setText(CharSequence)>
		progressBar.setVisibility(8);
	//    8   16:aload_0         
	//    9   17:getfield        #116 <Field ProgressBar progressBar>
	//   10   20:bipush          8
	//   11   22:invokevirtual   #210 <Method void ProgressBar.setVisibility(int)>
		imageView.setVisibility(0);
	//   12   25:aload_0         
	//   13   26:getfield        #123 <Field ImageView imageView>
	//   14   29:iconst_0        
	//   15   30:invokevirtual   #211 <Method void ImageView.setVisibility(int)>
	//   16   33:return          
	}

	public void showProgress()
	{
		setClickable(false);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokevirtual   #202 <Method void setClickable(boolean)>
		textView.setText(progressText);
	//    3    5:aload_0         
	//    4    6:getfield        #76  <Field TextView textView>
	//    5    9:aload_0         
	//    6   10:getfield        #165 <Field CharSequence progressText>
	//    7   13:invokevirtual   #206 <Method void TextView.setText(CharSequence)>
		progressBar.setVisibility(0);
	//    8   16:aload_0         
	//    9   17:getfield        #116 <Field ProgressBar progressBar>
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #210 <Method void ProgressBar.setVisibility(int)>
		imageView.setVisibility(8);
	//   12   24:aload_0         
	//   13   25:getfield        #123 <Field ImageView imageView>
	//   14   28:bipush          8
	//   15   30:invokevirtual   #211 <Method void ImageView.setVisibility(int)>
	//   16   33:return          
	}

	public void showStart()
	{
		setClickable(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokevirtual   #202 <Method void setClickable(boolean)>
		textView.setText(startText);
	//    3    5:aload_0         
	//    4    6:getfield        #76  <Field TextView textView>
	//    5    9:aload_0         
	//    6   10:getfield        #160 <Field CharSequence startText>
	//    7   13:invokevirtual   #206 <Method void TextView.setText(CharSequence)>
		progressBar.setVisibility(8);
	//    8   16:aload_0         
	//    9   17:getfield        #116 <Field ProgressBar progressBar>
	//   10   20:bipush          8
	//   11   22:invokevirtual   #210 <Method void ProgressBar.setVisibility(int)>
		imageView.setVisibility(8);
	//   12   25:aload_0         
	//   13   26:getfield        #123 <Field ImageView imageView>
	//   14   29:bipush          8
	//   15   31:invokevirtual   #211 <Method void ImageView.setVisibility(int)>
	//   16   34:return          
	}

	int accentColor;
	ButtonThemer buttonThemer;
	CharSequence finishText;
	ImageView imageView;
	ProgressBar progressBar;
	CharSequence progressText;
	CharSequence startText;
	TextView textView;
}
