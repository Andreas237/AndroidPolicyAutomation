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

	public abstract int getPosition();

	public abstract Object getTag();

	public abstract CharSequence getText();

	public abstract void select();

	public abstract ActionBar$Tab setContentDescription(int i);

	public abstract ActionBar$Tab setContentDescription(CharSequence charsequence);

	public abstract ActionBar$Tab setCustomView(int i);

	public abstract ActionBar$Tab setCustomView(View view);

	public abstract ActionBar$Tab setIcon(int i);

	public abstract ActionBar$Tab setIcon(Drawable drawable);

	public abstract ActionBar$Tab setTabListener(istener istener);

	public abstract ActionBar$Tab setTag(Object obj);

	public abstract ActionBar$Tab setText(int i);

	public abstract ActionBar$Tab setText(CharSequence charsequence);

	public static final int INVALID_POSITION = -1;

	public ActionBar$Tab()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:return          
	}
}
