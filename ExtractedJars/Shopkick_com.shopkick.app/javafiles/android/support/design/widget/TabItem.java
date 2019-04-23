// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.View;

public class TabItem extends View
{

	public TabItem(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #15  <Method void TabItem(Context, AttributeSet)>
	//    4    6:return          
	}

	public TabItem(Context context, AttributeSet attributeset)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #17  <Method void View(Context, AttributeSet)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.TabItem)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #23  <Field int[] android.support.design.R$styleable.TabItem>
	//    7   11:invokestatic    #29  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[])>
	//    8   14:astore_1        
		text = ((TintTypedArray) (context)).getText(android.support.design.R.styleable.TabItem_android_text);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #32  <Field int android.support.design.R$styleable.TabItem_android_text>
	//   12   20:invokevirtual   #36  <Method CharSequence TintTypedArray.getText(int)>
	//   13   23:putfield        #38  <Field CharSequence text>
		icon = ((TintTypedArray) (context)).getDrawable(android.support.design.R.styleable.TabItem_android_icon);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getstatic       #41  <Field int android.support.design.R$styleable.TabItem_android_icon>
	//   17   31:invokevirtual   #45  <Method Drawable TintTypedArray.getDrawable(int)>
	//   18   34:putfield        #47  <Field Drawable icon>
		customLayout = ((TintTypedArray) (context)).getResourceId(android.support.design.R.styleable.TabItem_android_layout, 0);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getstatic       #50  <Field int android.support.design.R$styleable.TabItem_android_layout>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #54  <Method int TintTypedArray.getResourceId(int, int)>
	//   24   46:putfield        #56  <Field int customLayout>
		((TintTypedArray) (context)).recycle();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #60  <Method void TintTypedArray.recycle()>
	//   27   53:return          
	}

	public final int customLayout;
	public final Drawable icon;
	public final CharSequence text;
}
