// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package androidx.browser.browseractions;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.LinearLayout;

public class BrowserActionsFallbackMenuView extends LinearLayout
{

	public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #15  <Method void LinearLayout(Context, AttributeSet)>
		mBrowserActionsMenuMinPaddingPx = getResources().getDimensionPixelOffset(android.support.customtabs.R.dimen.browser_actions_context_menu_min_padding);
	//    4    6:aload_0         
	//    5    7:aload_0         
	//    6    8:invokevirtual   #19  <Method Resources getResources()>
	//    7   11:getstatic       #24  <Field int android.support.customtabs.R$dimen.browser_actions_context_menu_min_padding>
	//    8   14:invokevirtual   #30  <Method int Resources.getDimensionPixelOffset(int)>
	//    9   17:putfield        #32  <Field int mBrowserActionsMenuMinPaddingPx>
		mBrowserActionsMenuMaxWidthPx = getResources().getDimensionPixelOffset(android.support.customtabs.R.dimen.browser_actions_context_menu_max_width);
	//   10   20:aload_0         
	//   11   21:aload_0         
	//   12   22:invokevirtual   #19  <Method Resources getResources()>
	//   13   25:getstatic       #35  <Field int android.support.customtabs.R$dimen.browser_actions_context_menu_max_width>
	//   14   28:invokevirtual   #30  <Method int Resources.getDimensionPixelOffset(int)>
	//   15   31:putfield        #37  <Field int mBrowserActionsMenuMaxWidthPx>
	//   16   34:return          
	}

	protected void onMeasure(int i, int j)
	{
		super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - 2 * mBrowserActionsMenuMinPaddingPx, mBrowserActionsMenuMaxWidthPx), 0x40000000), j);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #19  <Method Resources getResources()>
	//    3    5:invokevirtual   #44  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//    4    8:getfield        #49  <Field int DisplayMetrics.widthPixels>
	//    5   11:iconst_2        
	//    6   12:aload_0         
	//    7   13:getfield        #32  <Field int mBrowserActionsMenuMinPaddingPx>
	//    8   16:imul            
	//    9   17:isub            
	//   10   18:aload_0         
	//   11   19:getfield        #37  <Field int mBrowserActionsMenuMaxWidthPx>
	//   12   22:invokestatic    #55  <Method int Math.min(int, int)>
	//   13   25:ldc1            #56  <Int 0x40000000>
	//   14   27:invokestatic    #61  <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   15   30:iload_2         
	//   16   31:invokespecial   #63  <Method void LinearLayout.onMeasure(int, int)>
	//   17   34:return          
	}

	private final int mBrowserActionsMenuMaxWidthPx;
	private final int mBrowserActionsMenuMinPaddingPx;
}
