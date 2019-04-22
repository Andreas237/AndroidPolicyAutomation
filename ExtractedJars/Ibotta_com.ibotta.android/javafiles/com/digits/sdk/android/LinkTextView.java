// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.TextView;

// Referenced classes of package com.digits.sdk.android:
//			ThemeUtils

public class LinkTextView extends TextView
{

	public LinkTextView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #8   <Method void TextView(Context, AttributeSet)>
		init(context);
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:invokespecial   #12  <Method void init(Context)>
	//    7   11:return          
	}

	private int getLinkColor(Context context)
	{
		TypedValue typedvalue = ThemeUtils.getTypedValueColor(context.getTheme(), 0x101009b);
	//    0    0:aload_1         
	//    1    1:invokevirtual   #21  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    2    4:ldc1            #22  <Int 0x101009b>
	//    3    6:invokestatic    #28  <Method TypedValue ThemeUtils.getTypedValueColor(android.content.res.Resources$Theme, int)>
	//    4    9:astore_2        
		if(typedvalue == null)
	//*   5   10:aload_2         
	//*   6   11:ifnonnull       26
			return ThemeUtils.getAccentColor(context.getResources(), context.getTheme());
	//    7   14:aload_1         
	//    8   15:invokevirtual   #32  <Method android.content.res.Resources Context.getResources()>
	//    9   18:aload_1         
	//   10   19:invokevirtual   #21  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   11   22:invokestatic    #36  <Method int ThemeUtils.getAccentColor(android.content.res.Resources, android.content.res.Resources$Theme)>
	//   12   25:ireturn         
		else
			return typedvalue.data;
	//   13   26:aload_2         
	//   14   27:getfield        #42  <Field int TypedValue.data>
	//   15   30:ireturn         
	}

	private void init(Context context)
	{
		setTextColor(getLinkColor(context));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokespecial   #44  <Method int getLinkColor(Context)>
	//    4    6:invokevirtual   #48  <Method void setTextColor(int)>
	//    5    9:return          
	}
}
