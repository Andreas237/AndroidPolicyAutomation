// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			TabLayout

public static final class TabLayout$Tab
{

	public CharSequence getContentDescription()
	{
		return mContentDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field CharSequence mContentDesc>
	//    2    4:areturn         
	}

	public View getCustomView()
	{
		return mCustomView;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field View mCustomView>
	//    2    4:areturn         
	}

	public Drawable getIcon()
	{
		return mIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #45  <Field Drawable mIcon>
	//    2    4:areturn         
	}

	public int getPosition()
	{
		return mPosition;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int mPosition>
	//    2    4:ireturn         
	}

	public Object getTag()
	{
		return mTag;
	//    0    0:aload_0         
	//    1    1:getfield        #51  <Field Object mTag>
	//    2    4:areturn         
	}

	public CharSequence getText()
	{
		return mText;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field CharSequence mText>
	//    2    4:areturn         
	}

	public boolean isSelected()
	{
		if(mParent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field TabLayout mParent>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//    3    7:new             #60  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
	//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		return mParent.getSelectedTabPosition() == mPosition;
	//    8   17:aload_0         
	//    9   18:getfield        #58  <Field TabLayout mParent>
	//   10   21:invokevirtual   #68  <Method int TabLayout.getSelectedTabPosition()>
	//   11   24:aload_0         
	//   12   25:getfield        #30  <Field int mPosition>
	//   13   28:icmpne          33
	//   14   31:iconst_1        
	//   15   32:ireturn         
	//   16   33:iconst_0        
	//   17   34:ireturn         
	}

	void reset()
	{
		mParent = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #58  <Field TabLayout mParent>
		mView = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #71  <Field TabLayout$a mView>
		mTag = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #51  <Field Object mTag>
		mIcon = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #45  <Field Drawable mIcon>
		mText = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #54  <Field CharSequence mText>
		mContentDesc = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #36  <Field CharSequence mContentDesc>
		mPosition = -1;
	//   18   30:aload_0         
	//   19   31:iconst_m1       
	//   20   32:putfield        #30  <Field int mPosition>
		mCustomView = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #41  <Field View mCustomView>
	//   24   40:return          
	}

	public void select()
	{
		if(mParent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field TabLayout mParent>
	//*   2    4:ifnonnull       17
		{
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//    3    7:new             #60  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
	//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		} else
		{
			mParent.selectTab(this);
	//    8   17:aload_0         
	//    9   18:getfield        #58  <Field TabLayout mParent>
	//   10   21:aload_0         
	//   11   22:invokevirtual   #76  <Method void TabLayout.selectTab(TabLayout$Tab)>
			return;
	//   12   25:return          
		}
	}

	public TabLayout$Tab setContentDescription(int i)
	{
		if(mParent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field TabLayout mParent>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//    3    7:new             #60  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
	//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return setContentDescription(mParent.getResources().getText(i));
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:getfield        #58  <Field TabLayout mParent>
	//   11   22:invokevirtual   #84  <Method Resources TabLayout.getResources()>
	//   12   25:iload_1         
	//   13   26:invokevirtual   #89  <Method CharSequence Resources.getText(int)>
	//   14   29:invokevirtual   #92  <Method TabLayout$Tab setContentDescription(CharSequence)>
	//   15   32:areturn         
	}

	public TabLayout$Tab setContentDescription(CharSequence charsequence)
	{
		mContentDesc = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #36  <Field CharSequence mContentDesc>
		updateView();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #96  <Method void updateView()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TabLayout$Tab setCustomView(int i)
	{
		return setCustomView(LayoutInflater.from(mView.getContext()).inflate(i, ((android.view.ViewGroup) (mView)), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #71  <Field TabLayout$a mView>
	//    3    5:invokevirtual   #104 <Method android.content.Context TabLayout$a.getContext()>
	//    4    8:invokestatic    #110 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    5   11:iload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #71  <Field TabLayout$a mView>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #114 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   10   20:invokevirtual   #117 <Method TabLayout$Tab setCustomView(View)>
	//   11   23:areturn         
	}

	public TabLayout$Tab setCustomView(View view)
	{
		mCustomView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field View mCustomView>
		updateView();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #96  <Method void updateView()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TabLayout$Tab setIcon(int i)
	{
		if(mParent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field TabLayout mParent>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//    3    7:new             #60  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
	//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return setIcon(AppCompatResources.getDrawable(mParent.getContext(), i));
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:getfield        #58  <Field TabLayout mParent>
	//   11   22:invokevirtual   #120 <Method android.content.Context TabLayout.getContext()>
	//   12   25:iload_1         
	//   13   26:invokestatic    #126 <Method Drawable AppCompatResources.getDrawable(android.content.Context, int)>
	//   14   29:invokevirtual   #129 <Method TabLayout$Tab setIcon(Drawable)>
	//   15   32:areturn         
	}

	public TabLayout$Tab setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field Drawable mIcon>
		updateView();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #96  <Method void updateView()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	void setPosition(int i)
	{
		mPosition = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int mPosition>
	//    3    5:return          
	}

	public TabLayout$Tab setTag(Object obj)
	{
		mTag = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #51  <Field Object mTag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TabLayout$Tab setText(int i)
	{
		if(mParent == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #58  <Field TabLayout mParent>
	//*   2    4:ifnonnull       17
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//    3    7:new             #60  <Class IllegalArgumentException>
	//    4   10:dup             
	//    5   11:ldc1            #62  <String "Tab not attached to a TabLayout">
	//    6   13:invokespecial   #65  <Method void IllegalArgumentException(String)>
	//    7   16:athrow          
		else
			return setText(mParent.getResources().getText(i));
	//    8   17:aload_0         
	//    9   18:aload_0         
	//   10   19:getfield        #58  <Field TabLayout mParent>
	//   11   22:invokevirtual   #84  <Method Resources TabLayout.getResources()>
	//   12   25:iload_1         
	//   13   26:invokevirtual   #89  <Method CharSequence Resources.getText(int)>
	//   14   29:invokevirtual   #136 <Method TabLayout$Tab setText(CharSequence)>
	//   15   32:areturn         
	}

	public TabLayout$Tab setText(CharSequence charsequence)
	{
		mText = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #54  <Field CharSequence mText>
		updateView();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #96  <Method void updateView()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	void updateView()
	{
		if(mView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #71  <Field TabLayout$a mView>
	//*   2    4:ifnull          14
			mView.d();
	//    3    7:aload_0         
	//    4    8:getfield        #71  <Field TabLayout$a mView>
	//    5   11:invokevirtual   #139 <Method void TabLayout$a.d()>
	//    6   14:return          
	}

	public static final int INVALID_POSITION = -1;
	private CharSequence mContentDesc;
	private View mCustomView;
	private Drawable mIcon;
	TabLayout mParent;
	private int mPosition;
	private Object mTag;
	private CharSequence mText;
	TabLayout.a mView;

	TabLayout$Tab()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		mPosition = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #30  <Field int mPosition>
	//    5    9:return          
	}
}
