// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.support.v4.c.a.a;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.view.*;

// Referenced classes of package android.support.v7.view:
//			ActionMode

public class SupportActionModeWrapper extends ActionMode
{

	public SupportActionModeWrapper(Context context, android.support.v7.view.ActionMode actionmode)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void ActionMode()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #15  <Field Context mContext>
		mWrappedObject = actionmode;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    8   14:return          
	}

	public void finish()
	{
		mWrappedObject.finish();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #23  <Method void ActionMode.finish()>
	//    3    7:return          
	}

	public View getCustomView()
	{
		return mWrappedObject.getCustomView();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #27  <Method View ActionMode.getCustomView()>
	//    3    7:areturn         
	}

	public Menu getMenu()
	{
		return MenuWrapperFactory.wrapSupportMenu(mContext, (a)mWrappedObject.getMenu());
	//    0    0:aload_0         
	//    1    1:getfield        #15  <Field Context mContext>
	//    2    4:aload_0         
	//    3    5:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    4    8:invokevirtual   #31  <Method Menu ActionMode.getMenu()>
	//    5   11:checkcast       #33  <Class a>
	//    6   14:invokestatic    #39  <Method Menu MenuWrapperFactory.wrapSupportMenu(Context, a)>
	//    7   17:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return mWrappedObject.getMenuInflater();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #43  <Method MenuInflater ActionMode.getMenuInflater()>
	//    3    7:areturn         
	}

	public CharSequence getSubtitle()
	{
		return mWrappedObject.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #47  <Method CharSequence ActionMode.getSubtitle()>
	//    3    7:areturn         
	}

	public Object getTag()
	{
		return mWrappedObject.getTag();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #51  <Method Object ActionMode.getTag()>
	//    3    7:areturn         
	}

	public CharSequence getTitle()
	{
		return mWrappedObject.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #54  <Method CharSequence ActionMode.getTitle()>
	//    3    7:areturn         
	}

	public boolean getTitleOptionalHint()
	{
		return mWrappedObject.getTitleOptionalHint();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #58  <Method boolean ActionMode.getTitleOptionalHint()>
	//    3    7:ireturn         
	}

	public void invalidate()
	{
		mWrappedObject.invalidate();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #61  <Method void ActionMode.invalidate()>
	//    3    7:return          
	}

	public boolean isTitleOptional()
	{
		return mWrappedObject.isTitleOptional();
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:invokevirtual   #64  <Method boolean ActionMode.isTitleOptional()>
	//    3    7:ireturn         
	}

	public void setCustomView(View view)
	{
		mWrappedObject.setCustomView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #68  <Method void ActionMode.setCustomView(View)>
	//    4    8:return          
	}

	public void setSubtitle(int i)
	{
		mWrappedObject.setSubtitle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #72  <Method void ActionMode.setSubtitle(int)>
	//    4    8:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mWrappedObject.setSubtitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #75  <Method void ActionMode.setSubtitle(CharSequence)>
	//    4    8:return          
	}

	public void setTag(Object obj)
	{
		mWrappedObject.setTag(obj);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #79  <Method void ActionMode.setTag(Object)>
	//    4    8:return          
	}

	public void setTitle(int i)
	{
		mWrappedObject.setTitle(i);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #82  <Method void ActionMode.setTitle(int)>
	//    4    8:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mWrappedObject.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #84  <Method void ActionMode.setTitle(CharSequence)>
	//    4    8:return          
	}

	public void setTitleOptionalHint(boolean flag)
	{
		mWrappedObject.setTitleOptionalHint(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #17  <Field android.support.v7.view.ActionMode mWrappedObject>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #88  <Method void ActionMode.setTitleOptionalHint(boolean)>
	//    4    8:return          
	}

	final Context mContext;
	final android.support.v7.view.ActionMode mWrappedObject;
}
