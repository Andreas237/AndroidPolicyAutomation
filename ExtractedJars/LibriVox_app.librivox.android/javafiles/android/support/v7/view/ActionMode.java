// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.view.*;

public abstract class ActionMode
{

	public ActionMode()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public abstract void finish();

	public abstract View getCustomView();

	public abstract Menu getMenu();

	public abstract MenuInflater getMenuInflater();

	public abstract CharSequence getSubtitle();

	public Object getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #26  <Field Object mTag>
	//    2    4:areturn         
	}

	public abstract CharSequence getTitle();

	public boolean getTitleOptionalHint()
	{
		return mTitleOptionalHint;
	//    0    0:aload_0         
	//    1    1:getfield        #31  <Field boolean mTitleOptionalHint>
	//    2    4:ireturn         
	}

	public abstract void invalidate();

	public boolean isTitleOptional()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean isUiFocusable()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public abstract void setCustomView(View view);

	public abstract void setSubtitle(int i);

	public abstract void setSubtitle(CharSequence charsequence);

	public void setTag(Object obj)
	{
		mTag = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #26  <Field Object mTag>
	//    3    5:return          
	}

	public abstract void setTitle(int i);

	public abstract void setTitle(CharSequence charsequence);

	public void setTitleOptionalHint(boolean flag)
	{
		mTitleOptionalHint = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #31  <Field boolean mTitleOptionalHint>
	//    3    5:return          
	}

	private Object mTag;
	private boolean mTitleOptionalHint;
}
