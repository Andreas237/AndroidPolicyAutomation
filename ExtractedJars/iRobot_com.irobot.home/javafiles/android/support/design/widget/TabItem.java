// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.av;
import android.util.AttributeSet;
import android.view.View;

public final class TabItem extends View
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
		context = ((Context) (av.a(context, attributeset, android.support.design.a.k.TabItem)));
	//    4    6:aload_1         
	//    5    7:aload_2         
	//    6    8:getstatic       #23  <Field int[] android.support.design.a$k.TabItem>
	//    7   11:invokestatic    #28  <Method av av.a(Context, AttributeSet, int[])>
	//    8   14:astore_1        
		a = ((av) (context)).c(android.support.design.a.k.TabItem_android_text);
	//    9   15:aload_0         
	//   10   16:aload_1         
	//   11   17:getstatic       #31  <Field int android.support.design.a$k.TabItem_android_text>
	//   12   20:invokevirtual   #34  <Method CharSequence av.c(int)>
	//   13   23:putfield        #36  <Field CharSequence a>
		b = ((av) (context)).a(android.support.design.a.k.TabItem_android_icon);
	//   14   26:aload_0         
	//   15   27:aload_1         
	//   16   28:getstatic       #39  <Field int android.support.design.a$k.TabItem_android_icon>
	//   17   31:invokevirtual   #42  <Method Drawable av.a(int)>
	//   18   34:putfield        #44  <Field Drawable b>
		c = ((av) (context)).g(android.support.design.a.k.TabItem_android_layout, 0);
	//   19   37:aload_0         
	//   20   38:aload_1         
	//   21   39:getstatic       #47  <Field int android.support.design.a$k.TabItem_android_layout>
	//   22   42:iconst_0        
	//   23   43:invokevirtual   #51  <Method int av.g(int, int)>
	//   24   46:putfield        #53  <Field int c>
		((av) (context)).a();
	//   25   49:aload_1         
	//   26   50:invokevirtual   #56  <Method void av.a()>
	//   27   53:return          
	}

	final CharSequence a;
	final Drawable b;
	final int c;
}
