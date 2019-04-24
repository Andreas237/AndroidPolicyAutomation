// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.widget.ScrollingTabContainerView;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.v7.app:
//			WindowDecorActionBar

public class WindowDecorActionBar$TabImpl extends ActionBar.Tab
{

	public ActionBar.TabListener getCallback()
	{
		return mCallback;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field ActionBar$TabListener mCallback>
	//    2    4:areturn         
	}

	public CharSequence getContentDescription()
	{
		return mContentDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field CharSequence mContentDesc>
	//    2    4:areturn         
	}

	public View getCustomView()
	{
		return mCustomView;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field View mCustomView>
	//    2    4:areturn         
	}

	public Drawable getIcon()
	{
		return mIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field Drawable mIcon>
	//    2    4:areturn         
	}

	public int getPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field int mPosition>
	//    2    4:ireturn         
	}

	public Object getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field Object mTag>
	//    2    4:areturn         
	}

	public CharSequence getText()
	{
		return mText;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field CharSequence mText>
	//    2    4:areturn         
	}

	public void select()
	{
		selectTab(((ActionBar.Tab) (this)));
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field WindowDecorActionBar this$0>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #66  <Method void WindowDecorActionBar.selectTab(ActionBar$Tab)>
	//    4    8:return          
	}

	public ActionBar.Tab setContentDescription(int i)
	{
		return setContentDescription(mContext.getResources().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field WindowDecorActionBar this$0>
	//    3    5:getfield        #72  <Field Context WindowDecorActionBar.mContext>
	//    4    8:invokevirtual   #78  <Method Resources Context.getResources()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #83  <Method CharSequence Resources.getText(int)>
	//    7   15:invokevirtual   #86  <Method ActionBar$Tab setContentDescription(CharSequence)>
	//    8   18:areturn         
	}

	public ActionBar.Tab setContentDescription(CharSequence charsequence)
	{
		mContentDesc = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #44  <Field CharSequence mContentDesc>
		if(mPosition >= 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field int mPosition>
	//*   5    9:iflt            26
			mTabScrollView.updateTab(mPosition);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field WindowDecorActionBar this$0>
	//    8   16:getfield        #90  <Field ScrollingTabContainerView WindowDecorActionBar.mTabScrollView>
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field int mPosition>
	//   11   23:invokevirtual   #96  <Method void ScrollingTabContainerView.updateTab(int)>
		return ((ActionBar.Tab) (this));
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public ActionBar.Tab setCustomView(int i)
	{
		return setCustomView(LayoutInflater.from(getThemedContext()).inflate(i, ((android.view.ViewGroup) (null))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field WindowDecorActionBar this$0>
	//    3    5:invokevirtual   #101 <Method Context WindowDecorActionBar.getThemedContext()>
	//    4    8:invokestatic    #107 <Method LayoutInflater LayoutInflater.from(Context)>
	//    5   11:iload_1         
	//    6   12:aconst_null     
	//    7   13:invokevirtual   #111 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    8   16:invokevirtual   #114 <Method ActionBar$Tab setCustomView(View)>
	//    9   19:areturn         
	}

	public ActionBar.Tab setCustomView(View view)
	{
		mCustomView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #48  <Field View mCustomView>
		if(mPosition >= 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field int mPosition>
	//*   5    9:iflt            26
			mTabScrollView.updateTab(mPosition);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field WindowDecorActionBar this$0>
	//    8   16:getfield        #90  <Field ScrollingTabContainerView WindowDecorActionBar.mTabScrollView>
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field int mPosition>
	//   11   23:invokevirtual   #96  <Method void ScrollingTabContainerView.updateTab(int)>
		return ((ActionBar.Tab) (this));
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public ActionBar.Tab setIcon(int i)
	{
		return setIcon(AppCompatResources.getDrawable(mContext, i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field WindowDecorActionBar this$0>
	//    3    5:getfield        #72  <Field Context WindowDecorActionBar.mContext>
	//    4    8:iload_1         
	//    5    9:invokestatic    #121 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:invokevirtual   #124 <Method ActionBar$Tab setIcon(Drawable)>
	//    7   15:areturn         
	}

	public ActionBar.Tab setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field Drawable mIcon>
		if(mPosition >= 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field int mPosition>
	//*   5    9:iflt            26
			mTabScrollView.updateTab(mPosition);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field WindowDecorActionBar this$0>
	//    8   16:getfield        #90  <Field ScrollingTabContainerView WindowDecorActionBar.mTabScrollView>
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field int mPosition>
	//   11   23:invokevirtual   #96  <Method void ScrollingTabContainerView.updateTab(int)>
		return ((ActionBar.Tab) (this));
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	public void setPosition(int i)
	{
		mPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #35  <Field int mPosition>
	//    3    5:return          
	}

	public ActionBar.Tab setTabListener(ActionBar.TabListener tablistener)
	{
		mCallback = tablistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #40  <Field ActionBar$TabListener mCallback>
		return ((ActionBar.Tab) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ActionBar.Tab setTag(Object obj)
	{
		mTag = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #58  <Field Object mTag>
		return ((ActionBar.Tab) (this));
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public ActionBar.Tab setText(int i)
	{
		return setText(mContext.getResources().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #30  <Field WindowDecorActionBar this$0>
	//    3    5:getfield        #72  <Field Context WindowDecorActionBar.mContext>
	//    4    8:invokevirtual   #78  <Method Resources Context.getResources()>
	//    5   11:iload_1         
	//    6   12:invokevirtual   #83  <Method CharSequence Resources.getText(int)>
	//    7   15:invokevirtual   #132 <Method ActionBar$Tab setText(CharSequence)>
	//    8   18:areturn         
	}

	public ActionBar.Tab setText(CharSequence charsequence)
	{
		mText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #61  <Field CharSequence mText>
		if(mPosition >= 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #35  <Field int mPosition>
	//*   5    9:iflt            26
			mTabScrollView.updateTab(mPosition);
	//    6   12:aload_0         
	//    7   13:getfield        #30  <Field WindowDecorActionBar this$0>
	//    8   16:getfield        #90  <Field ScrollingTabContainerView WindowDecorActionBar.mTabScrollView>
	//    9   19:aload_0         
	//   10   20:getfield        #35  <Field int mPosition>
	//   11   23:invokevirtual   #96  <Method void ScrollingTabContainerView.updateTab(int)>
		return ((ActionBar.Tab) (this));
	//   12   26:aload_0         
	//   13   27:areturn         
	}

	private ActionBar.TabListener mCallback;
	private CharSequence mContentDesc;
	private View mCustomView;
	private Drawable mIcon;
	private int mPosition;
	private Object mTag;
	private CharSequence mText;
	final WindowDecorActionBar this$0;

	public WindowDecorActionBar$TabImpl()
	{
		this$0 = WindowDecorActionBar.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #30  <Field WindowDecorActionBar this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #33  <Method void ActionBar$Tab()>
		mPosition = -1;
	//    5    9:aload_0         
	//    6   10:iconst_m1       
	//    7   11:putfield        #35  <Field int mPosition>
	//    8   14:return          
	}
}
