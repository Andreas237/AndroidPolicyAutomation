// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;

// Referenced classes of package com.digits.sdk.android:
//			ThemeUtils, ButtonThemer

public class InvertedAccentButton extends Button
{

	public InvertedAccentButton(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0x1010048);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:ldc1            #7   <Int 0x1010048>
	//    4    5:invokespecial   #10  <Method void InvertedAccentButton(Context, AttributeSet, int)>
	//    5    8:return          
	}

	public InvertedAccentButton(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #12  <Method void Button(Context, AttributeSet, int)>
		init();
	//    5    7:aload_0         
	//    6    8:invokevirtual   #16  <Method void init()>
	//    7   11:return          
	}

	void init()
	{
		int i = ThemeUtils.getAccentColor(getResources(), getContext().getTheme());
	//    0    0:aload_0         
	//    1    1:invokevirtual   #20  <Method android.content.res.Resources getResources()>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #24  <Method Context getContext()>
	//    4    8:invokevirtual   #30  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    5   11:invokestatic    #36  <Method int ThemeUtils.getAccentColor(android.content.res.Resources, android.content.res.Resources$Theme)>
	//    6   14:istore_1        
		ButtonThemer buttonthemer = new ButtonThemer(getResources());
	//    7   15:new             #38  <Class ButtonThemer>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:invokevirtual   #20  <Method android.content.res.Resources getResources()>
	//   11   23:invokespecial   #41  <Method void ButtonThemer(android.content.res.Resources)>
	//   12   26:astore_2        
		buttonthemer.disableDropShadow(((android.view.View) (this)));
	//   13   27:aload_2         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #45  <Method void ButtonThemer.disableDropShadow(android.view.View)>
		buttonthemer.setBackgroundAccentColorInverse(((android.view.View) (this)), i);
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:iload_1         
	//   19   35:invokevirtual   #49  <Method void ButtonThemer.setBackgroundAccentColorInverse(android.view.View, int)>
		buttonthemer.setTextAccentColorInverse(((android.widget.TextView) (this)), i);
	//   20   38:aload_2         
	//   21   39:aload_0         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #53  <Method void ButtonThemer.setTextAccentColorInverse(android.widget.TextView, int)>
	//   24   44:return          
	}
}
