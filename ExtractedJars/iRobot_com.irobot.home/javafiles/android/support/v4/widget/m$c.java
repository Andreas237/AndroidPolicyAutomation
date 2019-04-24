// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.widget;

import android.graphics.drawable.Drawable;
import android.widget.TextView;

// Referenced classes of package android.support.v4.widget:
//			m

static class m$c extends m$b
{

	public void a(TextView textview, Drawable drawable, Drawable drawable1, Drawable drawable2, Drawable drawable3)
	{
		textview.setCompoundDrawablesRelative(drawable, drawable1, drawable2, drawable3);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:aload_3         
	//    3    3:aload           4
	//    4    5:aload           5
	//    5    7:invokevirtual   #20  <Method void TextView.setCompoundDrawablesRelative(Drawable, Drawable, Drawable, Drawable)>
	//    6   10:return          
	}

	public Drawable[] b(TextView textview)
	{
		return textview.getCompoundDrawablesRelative();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #26  <Method Drawable[] TextView.getCompoundDrawablesRelative()>
	//    2    4:areturn         
	}

	m$c()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void m$b()>
	//    2    4:return          
	}
}
