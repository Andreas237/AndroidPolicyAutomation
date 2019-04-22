// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.graphics.drawable.Drawable;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			ActionBar

public static abstract class ActionBar$Tab
{

	public abstract CharSequence getContentDescription();

	public abstract View getCustomView();

	public abstract Drawable getIcon();

	public abstract CharSequence getText();

	public abstract void select();

	public ActionBar$Tab()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}
}
