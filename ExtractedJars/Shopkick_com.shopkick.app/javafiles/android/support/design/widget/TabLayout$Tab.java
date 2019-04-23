// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.content.res.AppCompatResources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//			TabLayout

public static class TabLayout$Tab
{

	public CharSequence getContentDescription()
	{
		iew iew = view;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field TabLayout$TabView view>
	//    2    4:astore_1        
		if(iew == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return iew.getContentDescription();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #47  <Method CharSequence TabLayout$TabView.getContentDescription()>
	//    9   15:areturn         
	}

	public View getCustomView()
	{
		return customView;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field View customView>
	//    2    4:areturn         
	}

	public Drawable getIcon()
	{
		return icon;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field Drawable icon>
	//    2    4:areturn         
	}

	public int getPosition()
	{
		return position;
	//    0    0:aload_0         
	//    1    1:getfield        #30  <Field int position>
	//    2    4:ireturn         
	}

	public Object getTag()
	{
		return tag;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field Object tag>
	//    2    4:areturn         
	}

	public CharSequence getText()
	{
		return text;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field CharSequence text>
	//    2    4:areturn         
	}

	public boolean isSelected()
	{
		TabLayout tablayout = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field TabLayout parent>
	//    2    4:astore_1        
		if(tablayout != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          24
			return tablayout.getSelectedTabPosition() == position;
	//    5    9:aload_1         
	//    6   10:invokevirtual   #70  <Method int TabLayout.getSelectedTabPosition()>
	//    7   13:aload_0         
	//    8   14:getfield        #30  <Field int position>
	//    9   17:icmpne          22
	//   10   20:iconst_1        
	//   11   21:ireturn         
	//   12   22:iconst_0        
	//   13   23:ireturn         
		else
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//   14   24:new             #72  <Class IllegalArgumentException>
	//   15   27:dup             
	//   16   28:ldc1            #74  <String "Tab not attached to a TabLayout">
	//   17   30:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//   18   33:athrow          
	}

	void reset()
	{
		parent = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #67  <Field TabLayout parent>
		view = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #43  <Field TabLayout$TabView view>
		tag = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #62  <Field Object tag>
		icon = null;
	//    9   15:aload_0         
	//   10   16:aconst_null     
	//   11   17:putfield        #56  <Field Drawable icon>
		text = null;
	//   12   20:aload_0         
	//   13   21:aconst_null     
	//   14   22:putfield        #38  <Field CharSequence text>
		contentDesc = null;
	//   15   25:aload_0         
	//   16   26:aconst_null     
	//   17   27:putfield        #35  <Field CharSequence contentDesc>
		position = -1;
	//   18   30:aload_0         
	//   19   31:iconst_m1       
	//   20   32:putfield        #30  <Field int position>
		customView = null;
	//   21   35:aload_0         
	//   22   36:aconst_null     
	//   23   37:putfield        #52  <Field View customView>
	//   24   40:return          
	}

	public void select()
	{
		TabLayout tablayout = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field TabLayout parent>
	//    2    4:astore_1        
		if(tablayout != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          15
		{
			tablayout.selectTab(this);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #83  <Method void TabLayout.selectTab(TabLayout$Tab)>
			return;
	//    8   14:return          
		} else
		{
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//    9   15:new             #72  <Class IllegalArgumentException>
	//   10   18:dup             
	//   11   19:ldc1            #74  <String "Tab not attached to a TabLayout">
	//   12   21:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//   13   24:athrow          
		}
	}

	public TabLayout$Tab setContentDescription(int i)
	{
		TabLayout tablayout = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field TabLayout parent>
	//    2    4:astore_2        
		if(tablayout != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
			return setContentDescription(tablayout.getResources().getText(i));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #91  <Method Resources TabLayout.getResources()>
	//    8   14:iload_1         
	//    9   15:invokevirtual   #96  <Method CharSequence Resources.getText(int)>
	//   10   18:invokevirtual   #99  <Method TabLayout$Tab setContentDescription(CharSequence)>
	//   11   21:areturn         
		else
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//   12   22:new             #72  <Class IllegalArgumentException>
	//   13   25:dup             
	//   14   26:ldc1            #74  <String "Tab not attached to a TabLayout">
	//   15   28:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//   16   31:athrow          
	}

	public TabLayout$Tab setContentDescription(CharSequence charsequence)
	{
		contentDesc = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #35  <Field CharSequence contentDesc>
		updateView();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #103 <Method void updateView()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TabLayout$Tab setCustomView(int i)
	{
		return setCustomView(LayoutInflater.from(view.getContext()).inflate(i, ((android.view.ViewGroup) (view)), false));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #43  <Field TabLayout$TabView view>
	//    3    5:invokevirtual   #109 <Method android.content.Context TabLayout$TabView.getContext()>
	//    4    8:invokestatic    #115 <Method LayoutInflater LayoutInflater.from(android.content.Context)>
	//    5   11:iload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #43  <Field TabLayout$TabView view>
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #119 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   10   20:invokevirtual   #122 <Method TabLayout$Tab setCustomView(View)>
	//   11   23:areturn         
	}

	public TabLayout$Tab setCustomView(View view1)
	{
		customView = view1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #52  <Field View customView>
		updateView();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #103 <Method void updateView()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	public TabLayout$Tab setIcon(int i)
	{
		TabLayout tablayout = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field TabLayout parent>
	//    2    4:astore_2        
		if(tablayout != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
			return setIcon(AppCompatResources.getDrawable(tablayout.getContext(), i));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #125 <Method android.content.Context TabLayout.getContext()>
	//    8   14:iload_1         
	//    9   15:invokestatic    #131 <Method Drawable AppCompatResources.getDrawable(android.content.Context, int)>
	//   10   18:invokevirtual   #134 <Method TabLayout$Tab setIcon(Drawable)>
	//   11   21:areturn         
		else
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//   12   22:new             #72  <Class IllegalArgumentException>
	//   13   25:dup             
	//   14   26:ldc1            #74  <String "Tab not attached to a TabLayout">
	//   15   28:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//   16   31:athrow          
	}

	public TabLayout$Tab setIcon(Drawable drawable)
	{
		icon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #56  <Field Drawable icon>
		updateView();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #103 <Method void updateView()>
		return this;
	//    5    9:aload_0         
	//    6   10:areturn         
	}

	void setPosition(int i)
	{
		position = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #30  <Field int position>
	//    3    5:return          
	}

	public TabLayout$Tab setTag(Object obj)
	{
		tag = obj;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #62  <Field Object tag>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public TabLayout$Tab setText(int i)
	{
		TabLayout tablayout = parent;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field TabLayout parent>
	//    2    4:astore_2        
		if(tablayout != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          22
			return setText(tablayout.getResources().getText(i));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #91  <Method Resources TabLayout.getResources()>
	//    8   14:iload_1         
	//    9   15:invokevirtual   #96  <Method CharSequence Resources.getText(int)>
	//   10   18:invokevirtual   #141 <Method TabLayout$Tab setText(CharSequence)>
	//   11   21:areturn         
		else
			throw new IllegalArgumentException("Tab not attached to a TabLayout");
	//   12   22:new             #72  <Class IllegalArgumentException>
	//   13   25:dup             
	//   14   26:ldc1            #74  <String "Tab not attached to a TabLayout">
	//   15   28:invokespecial   #77  <Method void IllegalArgumentException(String)>
	//   16   31:athrow          
	}

	public TabLayout$Tab setText(CharSequence charsequence)
	{
		if(TextUtils.isEmpty(contentDesc) && !TextUtils.isEmpty(charsequence))
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field CharSequence contentDesc>
	//*   2    4:invokestatic    #147 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   3    7:ifeq            25
	//*   4   10:aload_1         
	//*   5   11:invokestatic    #147 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   14:ifne            25
			view.setContentDescription(charsequence);
	//    7   17:aload_0         
	//    8   18:getfield        #43  <Field TabLayout$TabView view>
	//    9   21:aload_1         
	//   10   22:invokevirtual   #150 <Method void TabLayout$TabView.setContentDescription(CharSequence)>
		text = charsequence;
	//   11   25:aload_0         
	//   12   26:aload_1         
	//   13   27:putfield        #38  <Field CharSequence text>
		updateView();
	//   14   30:aload_0         
	//   15   31:invokevirtual   #103 <Method void updateView()>
		return this;
	//   16   34:aload_0         
	//   17   35:areturn         
	}

	void updateView()
	{
		iew iew = view;
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field TabLayout$TabView view>
	//    2    4:astore_1        
		if(iew != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			iew.update();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #153 <Method void TabLayout$TabView.update()>
	//    7   13:return          
	}

	public static final int INVALID_POSITION = -1;
	private CharSequence contentDesc;
	private View customView;
	private Drawable icon;
	public TabLayout parent;
	private int position;
	private Object tag;
	private CharSequence text;
	public iew view;


/*
	static CharSequence access$100(TabLayout$Tab tablayout$tab)
	{
		return tablayout$tab.contentDesc;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field CharSequence contentDesc>
	//    2    4:areturn         
	}

*/


/*
	static CharSequence access$200(TabLayout$Tab tablayout$tab)
	{
		return tablayout$tab.text;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field CharSequence text>
	//    2    4:areturn         
	}

*/

	public TabLayout$Tab()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
		position = -1;
	//    2    4:aload_0         
	//    3    5:iconst_m1       
	//    4    6:putfield        #30  <Field int position>
	//    5    9:return          
	}
}
