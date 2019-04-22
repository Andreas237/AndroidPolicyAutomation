// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.*;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v7.widget.*;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemImpl, ShowableListMenu

public class ActionMenuItemView extends AppCompatTextView
	implements MenuView.ItemView, android.support.v7.widget.ActionMenuView.ActionMenuChildView, android.view.View.OnClickListener
{
	private class ActionMenuItemForwardingListener extends ForwardingListener
	{

		public ShowableListMenu getPopup()
		{
			if(mPopupCallback != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #13  <Field ActionMenuItemView this$0>
		//*   2    4:getfield        #23  <Field ActionMenuItemView$PopupCallback ActionMenuItemView.mPopupCallback>
		//*   3    7:ifnull          21
				return mPopupCallback.getPopup();
		//    4   10:aload_0         
		//    5   11:getfield        #13  <Field ActionMenuItemView this$0>
		//    6   14:getfield        #23  <Field ActionMenuItemView$PopupCallback ActionMenuItemView.mPopupCallback>
		//    7   17:invokevirtual   #27  <Method ShowableListMenu ActionMenuItemView$PopupCallback.getPopup()>
		//    8   20:areturn         
			else
				return null;
		//    9   21:aconst_null     
		//   10   22:areturn         
		}

		protected boolean onForwardingStarted()
		{
			MenuBuilder.ItemInvoker iteminvoker = mItemInvoker;
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field ActionMenuItemView this$0>
		//    2    4:getfield        #33  <Field MenuBuilder$ItemInvoker ActionMenuItemView.mItemInvoker>
		//    3    7:astore_3        
			boolean flag1 = false;
		//    4    8:iconst_0        
		//    5    9:istore_2        
			if(iteminvoker != null && mItemInvoker.invokeItem(mItemData))
		//*   6   10:aload_3         
		//*   7   11:ifnull          62
		//*   8   14:aload_0         
		//*   9   15:getfield        #13  <Field ActionMenuItemView this$0>
		//*  10   18:getfield        #33  <Field MenuBuilder$ItemInvoker ActionMenuItemView.mItemInvoker>
		//*  11   21:aload_0         
		//*  12   22:getfield        #13  <Field ActionMenuItemView this$0>
		//*  13   25:getfield        #37  <Field MenuItemImpl ActionMenuItemView.mItemData>
		//*  14   28:invokeinterface #43  <Method boolean MenuBuilder$ItemInvoker.invokeItem(MenuItemImpl)>
		//*  15   33:ifeq            62
			{
				ShowableListMenu showablelistmenu = getPopup();
		//   16   36:aload_0         
		//   17   37:invokevirtual   #44  <Method ShowableListMenu getPopup()>
		//   18   40:astore_3        
				boolean flag = flag1;
		//   19   41:iload_2         
		//   20   42:istore_1        
				if(showablelistmenu != null)
		//*  21   43:aload_3         
		//*  22   44:ifnull          60
				{
					flag = flag1;
		//   23   47:iload_2         
		//   24   48:istore_1        
					if(showablelistmenu.isShowing())
		//*  25   49:aload_3         
		//*  26   50:invokeinterface #49  <Method boolean ShowableListMenu.isShowing()>
		//*  27   55:ifeq            60
						flag = true;
		//   28   58:iconst_1        
		//   29   59:istore_1        
				}
				return flag;
		//   30   60:iload_1         
		//   31   61:ireturn         
			} else
			{
				return false;
		//   32   62:iconst_0        
		//   33   63:ireturn         
			}
		}

		final ActionMenuItemView this$0;

		public ActionMenuItemForwardingListener()
		{
			this$0 = ActionMenuItemView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field ActionMenuItemView this$0>
			super(((View) (ActionMenuItemView.this)));
		//    3    5:aload_0         
		//    4    6:aload_1         
		//    5    7:invokespecial   #16  <Method void ForwardingListener(View)>
		//    6   10:return          
		}
	}

	public static abstract class PopupCallback
	{

		public abstract ShowableListMenu getPopup();

		public PopupCallback()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	public ActionMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #44  <Method void ActionMenuItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ActionMenuItemView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #46  <Method void AppCompatTextView(Context, AttributeSet, int)>
		Resources resources = context.getResources();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #52  <Method Resources Context.getResources()>
	//    7   11:astore          4
		mAllowTextWithIcon = shouldAllowTextWithIcon();
	//    8   13:aload_0         
	//    9   14:aload_0         
	//   10   15:invokespecial   #56  <Method boolean shouldAllowTextWithIcon()>
	//   11   18:putfield        #58  <Field boolean mAllowTextWithIcon>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionMenuItemView, i, 0)));
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:getstatic       #64  <Field int[] android.support.v7.appcompat.R$styleable.ActionMenuItemView>
	//   15   26:iload_3         
	//   16   27:iconst_0        
	//   17   28:invokevirtual   #68  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   18   31:astore_1        
		mMinWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionMenuItemView_android_minWidth, 0);
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:getstatic       #71  <Field int android.support.v7.appcompat.R$styleable.ActionMenuItemView_android_minWidth>
	//   22   37:iconst_0        
	//   23   38:invokevirtual   #77  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   24   41:putfield        #79  <Field int mMinWidth>
		((TypedArray) (context)).recycle();
	//   25   44:aload_1         
	//   26   45:invokevirtual   #83  <Method void TypedArray.recycle()>
		mMaxIconSize = (int)(resources.getDisplayMetrics().density * 32F + 0.5F);
	//   27   48:aload_0         
	//   28   49:aload           4
	//   29   51:invokevirtual   #89  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   30   54:getfield        #95  <Field float DisplayMetrics.density>
	//   31   57:ldc1            #96  <Float 32F>
	//   32   59:fmul            
	//   33   60:ldc1            #97  <Float 0.5F>
	//   34   62:fadd            
	//   35   63:f2i             
	//   36   64:putfield        #99  <Field int mMaxIconSize>
		setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   37   67:aload_0         
	//   38   68:aload_0         
	//   39   69:invokevirtual   #103 <Method void setOnClickListener(android.view.View$OnClickListener)>
		mSavedPaddingLeft = -1;
	//   40   72:aload_0         
	//   41   73:iconst_m1       
	//   42   74:putfield        #105 <Field int mSavedPaddingLeft>
		setSaveEnabled(false);
	//   43   77:aload_0         
	//   44   78:iconst_0        
	//   45   79:invokevirtual   #109 <Method void setSaveEnabled(boolean)>
	//   46   82:return          
	}

	private boolean shouldAllowTextWithIcon()
	{
		Configuration configuration = getContext().getResources().getConfiguration();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #113 <Method Context getContext()>
	//    2    4:invokevirtual   #52  <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #117 <Method Configuration Resources.getConfiguration()>
	//    4   10:astore_3        
		int i = configuration.screenWidthDp;
	//    5   11:aload_3         
	//    6   12:getfield        #122 <Field int Configuration.screenWidthDp>
	//    7   15:istore_1        
		int j = configuration.screenHeightDp;
	//    8   16:aload_3         
	//    9   17:getfield        #125 <Field int Configuration.screenHeightDp>
	//   10   20:istore_2        
		return i >= 480 || i >= 640 && j >= 480 || configuration.orientation == 2;
	//   11   21:iload_1         
	//   12   22:sipush          480
	//   13   25:icmpge          55
	//   14   28:iload_1         
	//   15   29:sipush          640
	//   16   32:icmplt          42
	//   17   35:iload_2         
	//   18   36:sipush          480
	//   19   39:icmpge          55
	//   20   42:aload_3         
	//   21   43:getfield        #128 <Field int Configuration.orientation>
	//   22   46:iconst_2        
	//   23   47:icmpne          53
	//   24   50:goto            55
	//   25   53:iconst_0        
	//   26   54:ireturn         
	//   27   55:iconst_1        
	//   28   56:ireturn         
	}

	private void updateTextButtonVisibility()
	{
		boolean flag;
		boolean flag2;
label0:
		{
			flag2 = TextUtils.isEmpty(mTitle);
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field CharSequence mTitle>
	//    2    4:invokestatic    #137 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:istore_3        
			boolean flag1 = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
			flag = flag1;
	//    6   10:iload_2         
	//    7   11:istore_1        
			if(mIcon == null)
				break label0;
	//    8   12:aload_0         
	//    9   13:getfield        #139 <Field Drawable mIcon>
	//   10   16:ifnull          52
			if(mItemData.showsTextAsAction())
	//*  11   19:aload_0         
	//*  12   20:getfield        #141 <Field MenuItemImpl mItemData>
	//*  13   23:invokevirtual   #146 <Method boolean MenuItemImpl.showsTextAsAction()>
	//*  14   26:ifeq            50
			{
				flag = flag1;
	//   15   29:iload_2         
	//   16   30:istore_1        
				if(mAllowTextWithIcon)
					break label0;
	//   17   31:aload_0         
	//   18   32:getfield        #58  <Field boolean mAllowTextWithIcon>
	//   19   35:ifne            52
				if(mExpandedFormat)
	//*  20   38:aload_0         
	//*  21   39:getfield        #148 <Field boolean mExpandedFormat>
	//*  22   42:ifeq            50
				{
					flag = flag1;
	//   23   45:iload_2         
	//   24   46:istore_1        
					break label0;
	//   25   47:goto            52
				}
			}
			flag = false;
	//   26   50:iconst_0        
	//   27   51:istore_1        
		}
		flag = (flag2 ^ true) & flag;
	//   28   52:iload_3         
	//   29   53:iconst_1        
	//   30   54:ixor            
	//   31   55:iload_1         
	//   32   56:iand            
	//   33   57:istore_1        
		Object obj = null;
	//   34   58:aconst_null     
	//   35   59:astore          5
		CharSequence charsequence;
		if(flag)
	//*  36   61:iload_1         
	//*  37   62:ifeq            74
			charsequence = mTitle;
	//   38   65:aload_0         
	//   39   66:getfield        #131 <Field CharSequence mTitle>
	//   40   69:astore          4
		else
	//*  41   71:goto            77
			charsequence = null;
	//   42   74:aconst_null     
	//   43   75:astore          4
		setText(charsequence);
	//   44   77:aload_0         
	//   45   78:aload           4
	//   46   80:invokevirtual   #152 <Method void setText(CharSequence)>
		charsequence = mItemData.getContentDescription();
	//   47   83:aload_0         
	//   48   84:getfield        #141 <Field MenuItemImpl mItemData>
	//   49   87:invokevirtual   #156 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   50   90:astore          4
		if(TextUtils.isEmpty(charsequence))
	//*  51   92:aload           4
	//*  52   94:invokestatic    #137 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  53   97:ifeq            128
		{
			if(flag)
	//*  54  100:iload_1         
	//*  55  101:ifeq            110
				charsequence = null;
	//   56  104:aconst_null     
	//   57  105:astore          4
			else
	//*  58  107:goto            119
				charsequence = mItemData.getTitle();
	//   59  110:aload_0         
	//   60  111:getfield        #141 <Field MenuItemImpl mItemData>
	//   61  114:invokevirtual   #159 <Method CharSequence MenuItemImpl.getTitle()>
	//   62  117:astore          4
			setContentDescription(charsequence);
	//   63  119:aload_0         
	//   64  120:aload           4
	//   65  122:invokevirtual   #162 <Method void setContentDescription(CharSequence)>
		} else
	//*  66  125:goto            134
		{
			setContentDescription(charsequence);
	//   67  128:aload_0         
	//   68  129:aload           4
	//   69  131:invokevirtual   #162 <Method void setContentDescription(CharSequence)>
		}
		charsequence = mItemData.getTooltipText();
	//   70  134:aload_0         
	//   71  135:getfield        #141 <Field MenuItemImpl mItemData>
	//   72  138:invokevirtual   #165 <Method CharSequence MenuItemImpl.getTooltipText()>
	//   73  141:astore          4
		if(TextUtils.isEmpty(charsequence))
	//*  74  143:aload           4
	//*  75  145:invokestatic    #137 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  76  148:ifeq            178
		{
			if(flag)
	//*  77  151:iload_1         
	//*  78  152:ifeq            162
				charsequence = ((CharSequence) (obj));
	//   79  155:aload           5
	//   80  157:astore          4
			else
	//*  81  159:goto            171
				charsequence = mItemData.getTitle();
	//   82  162:aload_0         
	//   83  163:getfield        #141 <Field MenuItemImpl mItemData>
	//   84  166:invokevirtual   #159 <Method CharSequence MenuItemImpl.getTitle()>
	//   85  169:astore          4
			TooltipCompat.setTooltipText(((View) (this)), charsequence);
	//   86  171:aload_0         
	//   87  172:aload           4
	//   88  174:invokestatic    #171 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
			return;
	//   89  177:return          
		} else
		{
			TooltipCompat.setTooltipText(((View) (this)), charsequence);
	//   90  178:aload_0         
	//   91  179:aload           4
	//   92  181:invokestatic    #171 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
			return;
	//   93  184:return          
		}
	}

	public MenuItemImpl getItemData()
	{
		return mItemData;
	//    0    0:aload_0         
	//    1    1:getfield        #141 <Field MenuItemImpl mItemData>
	//    2    4:areturn         
	}

	public boolean hasText()
	{
		return TextUtils.isEmpty(getText()) ^ true;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #177 <Method CharSequence getText()>
	//    2    4:invokestatic    #137 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i)
	{
		mItemData = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #141 <Field MenuItemImpl mItemData>
		setIcon(menuitemimpl.getIcon());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #183 <Method Drawable MenuItemImpl.getIcon()>
	//    6   10:invokevirtual   #187 <Method void setIcon(Drawable)>
		setTitle(menuitemimpl.getTitleForItemView(((MenuView.ItemView) (this))));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #191 <Method CharSequence MenuItemImpl.getTitleForItemView(MenuView$ItemView)>
	//   11   19:invokevirtual   #194 <Method void setTitle(CharSequence)>
		setId(menuitemimpl.getItemId());
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #198 <Method int MenuItemImpl.getItemId()>
	//   15   27:invokevirtual   #202 <Method void setId(int)>
		if(menuitemimpl.isVisible())
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #205 <Method boolean MenuItemImpl.isVisible()>
	//*  18   34:ifeq            42
			i = 0;
	//   19   37:iconst_0        
	//   20   38:istore_2        
		else
	//*  21   39:goto            45
			i = 8;
	//   22   42:bipush          8
	//   23   44:istore_2        
		setVisibility(i);
	//   24   45:aload_0         
	//   25   46:iload_2         
	//   26   47:invokevirtual   #208 <Method void setVisibility(int)>
		setEnabled(menuitemimpl.isEnabled());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #211 <Method boolean MenuItemImpl.isEnabled()>
	//   30   55:invokevirtual   #214 <Method void setEnabled(boolean)>
		if(menuitemimpl.hasSubMenu() && mForwardingListener == null)
	//*  31   58:aload_1         
	//*  32   59:invokevirtual   #217 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  33   62:ifeq            84
	//*  34   65:aload_0         
	//*  35   66:getfield        #219 <Field ForwardingListener mForwardingListener>
	//*  36   69:ifnonnull       84
			mForwardingListener = ((ForwardingListener) (new ActionMenuItemForwardingListener()));
	//   37   72:aload_0         
	//   38   73:new             #12  <Class ActionMenuItemView$ActionMenuItemForwardingListener>
	//   39   76:dup             
	//   40   77:aload_0         
	//   41   78:invokespecial   #222 <Method void ActionMenuItemView$ActionMenuItemForwardingListener(ActionMenuItemView)>
	//   42   81:putfield        #219 <Field ForwardingListener mForwardingListener>
	//   43   84:return          
	}

	public boolean needsDividerAfter()
	{
		return hasText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method boolean hasText()>
	//    2    4:ireturn         
	}

	public boolean needsDividerBefore()
	{
		return hasText() && mItemData.getIcon() == null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method boolean hasText()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #141 <Field MenuItemImpl mItemData>
	//    5   11:invokevirtual   #183 <Method Drawable MenuItemImpl.getIcon()>
	//    6   14:ifnonnull       19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void onClick(View view)
	{
		view = ((View) (mItemInvoker));
	//    0    0:aload_0         
	//    1    1:getfield        #230 <Field MenuBuilder$ItemInvoker mItemInvoker>
	//    2    4:astore_1        
		if(view != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          20
			((MenuBuilder.ItemInvoker) (view)).invokeItem(mItemData);
	//    5    9:aload_1         
	//    6   10:aload_0         
	//    7   11:getfield        #141 <Field MenuItemImpl mItemData>
	//    8   14:invokeinterface #236 <Method boolean MenuBuilder$ItemInvoker.invokeItem(MenuItemImpl)>
	//    9   19:pop             
	//   10   20:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #240 <Method void AppCompatTextView.onConfigurationChanged(Configuration)>
		mAllowTextWithIcon = shouldAllowTextWithIcon();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #56  <Method boolean shouldAllowTextWithIcon()>
	//    6   10:putfield        #58  <Field boolean mAllowTextWithIcon>
		updateTextButtonVisibility();
	//    7   13:aload_0         
	//    8   14:invokespecial   #242 <Method void updateTextButtonVisibility()>
	//    9   17:return          
	}

	protected void onMeasure(int i, int j)
	{
		boolean flag = hasText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #225 <Method boolean hasText()>
	//    2    4:istore          5
		if(flag)
	//*   3    6:iload           5
	//*   4    8:ifeq            37
		{
			int k = mSavedPaddingLeft;
	//    5   11:aload_0         
	//    6   12:getfield        #105 <Field int mSavedPaddingLeft>
	//    7   15:istore_3        
			if(k >= 0)
	//*   8   16:iload_3         
	//*   9   17:iflt            37
				super.setPadding(k, getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//   10   20:aload_0         
	//   11   21:iload_3         
	//   12   22:aload_0         
	//   13   23:invokevirtual   #247 <Method int getPaddingTop()>
	//   14   26:aload_0         
	//   15   27:invokevirtual   #250 <Method int getPaddingRight()>
	//   16   30:aload_0         
	//   17   31:invokevirtual   #253 <Method int getPaddingBottom()>
	//   18   34:invokespecial   #257 <Method void AppCompatTextView.setPadding(int, int, int, int)>
		}
		super.onMeasure(i, j);
	//   19   37:aload_0         
	//   20   38:iload_1         
	//   21   39:iload_2         
	//   22   40:invokespecial   #259 <Method void AppCompatTextView.onMeasure(int, int)>
		int l = android.view.View.MeasureSpec.getMode(i);
	//   23   43:iload_1         
	//   24   44:invokestatic    #265 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   25   47:istore_3        
		i = android.view.View.MeasureSpec.getSize(i);
	//   26   48:iload_1         
	//   27   49:invokestatic    #268 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   28   52:istore_1        
		int i1 = getMeasuredWidth();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #271 <Method int getMeasuredWidth()>
	//   31   57:istore          4
		if(l == 0x80000000)
	//*  32   59:iload_3         
	//*  33   60:ldc2            #272 <Int 0x80000000>
	//*  34   63:icmpne          78
			i = Math.min(i, mMinWidth);
	//   35   66:iload_1         
	//   36   67:aload_0         
	//   37   68:getfield        #79  <Field int mMinWidth>
	//   38   71:invokestatic    #277 <Method int Math.min(int, int)>
	//   39   74:istore_1        
		else
	//*  40   75:goto            83
			i = mMinWidth;
	//   41   78:aload_0         
	//   42   79:getfield        #79  <Field int mMinWidth>
	//   43   82:istore_1        
		if(l != 0x40000000 && mMinWidth > 0 && i1 < i)
	//*  44   83:iload_3         
	//*  45   84:ldc2            #278 <Int 0x40000000>
	//*  46   87:icmpeq          115
	//*  47   90:aload_0         
	//*  48   91:getfield        #79  <Field int mMinWidth>
	//*  49   94:ifle            115
	//*  50   97:iload           4
	//*  51   99:iload_1         
	//*  52  100:icmpge          115
			super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
	//   53  103:aload_0         
	//   54  104:iload_1         
	//   55  105:ldc2            #278 <Int 0x40000000>
	//   56  108:invokestatic    #281 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   57  111:iload_2         
	//   58  112:invokespecial   #259 <Method void AppCompatTextView.onMeasure(int, int)>
		if(!flag && mIcon != null)
	//*  59  115:iload           5
	//*  60  117:ifne            160
	//*  61  120:aload_0         
	//*  62  121:getfield        #139 <Field Drawable mIcon>
	//*  63  124:ifnull          160
			super.setPadding((getMeasuredWidth() - mIcon.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//   64  127:aload_0         
	//   65  128:aload_0         
	//   66  129:invokevirtual   #271 <Method int getMeasuredWidth()>
	//   67  132:aload_0         
	//   68  133:getfield        #139 <Field Drawable mIcon>
	//   69  136:invokevirtual   #287 <Method Rect Drawable.getBounds()>
	//   70  139:invokevirtual   #292 <Method int Rect.width()>
	//   71  142:isub            
	//   72  143:iconst_2        
	//   73  144:idiv            
	//   74  145:aload_0         
	//   75  146:invokevirtual   #247 <Method int getPaddingTop()>
	//   76  149:aload_0         
	//   77  150:invokevirtual   #250 <Method int getPaddingRight()>
	//   78  153:aload_0         
	//   79  154:invokevirtual   #253 <Method int getPaddingBottom()>
	//   80  157:invokespecial   #257 <Method void AppCompatTextView.setPadding(int, int, int, int)>
	//   81  160:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		super.onRestoreInstanceState(((Parcelable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #296 <Method void AppCompatTextView.onRestoreInstanceState(Parcelable)>
	//    3    5:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mItemData.hasSubMenu())
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field MenuItemImpl mItemData>
	//*   2    4:invokevirtual   #217 <Method boolean MenuItemImpl.hasSubMenu()>
	//*   3    7:ifeq            30
		{
			ForwardingListener forwardinglistener = mForwardingListener;
	//    4   10:aload_0         
	//    5   11:getfield        #219 <Field ForwardingListener mForwardingListener>
	//    6   14:astore_2        
			if(forwardinglistener != null && forwardinglistener.onTouch(((View) (this)), motionevent))
	//*   7   15:aload_2         
	//*   8   16:ifnull          30
	//*   9   19:aload_2         
	//*  10   20:aload_0         
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #304 <Method boolean ForwardingListener.onTouch(View, MotionEvent)>
	//*  13   25:ifeq            30
				return true;
	//   14   28:iconst_1        
	//   15   29:ireturn         
		}
		return super.onTouchEvent(motionevent);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokespecial   #306 <Method boolean AppCompatTextView.onTouchEvent(MotionEvent)>
	//   19   35:ireturn         
	}

	public boolean prefersCondensedTitle()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public void setCheckable(boolean flag)
	{
	//    0    0:return          
	}

	public void setChecked(boolean flag)
	{
	//    0    0:return          
	}

	public void setExpandedFormat(boolean flag)
	{
		if(mExpandedFormat != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #148 <Field boolean mExpandedFormat>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          26
		{
			mExpandedFormat = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #148 <Field boolean mExpandedFormat>
			MenuItemImpl menuitemimpl = mItemData;
	//    7   13:aload_0         
	//    8   14:getfield        #141 <Field MenuItemImpl mItemData>
	//    9   17:astore_2        
			if(menuitemimpl != null)
	//*  10   18:aload_2         
	//*  11   19:ifnull          26
				menuitemimpl.actionFormatChanged();
	//   12   22:aload_2         
	//   13   23:invokevirtual   #313 <Method void MenuItemImpl.actionFormatChanged()>
		}
	//   14   26:return          
	}

	public void setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #139 <Field Drawable mIcon>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          108
		{
			int l = drawable.getIntrinsicWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #316 <Method int Drawable.getIntrinsicWidth()>
	//    7   13:istore          6
			int i1 = drawable.getIntrinsicHeight();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #319 <Method int Drawable.getIntrinsicHeight()>
	//   10   19:istore          7
			int k = mMaxIconSize;
	//   11   21:aload_0         
	//   12   22:getfield        #99  <Field int mMaxIconSize>
	//   13   25:istore          5
			int j = l;
	//   14   27:iload           6
	//   15   29:istore          4
			int i = i1;
	//   16   31:iload           7
	//   17   33:istore_3        
			if(l > k)
	//*  18   34:iload           6
	//*  19   36:iload           5
	//*  20   38:icmple          60
			{
				float f = (float)k / (float)l;
	//   21   41:iload           5
	//   22   43:i2f             
	//   23   44:iload           6
	//   24   46:i2f             
	//   25   47:fdiv            
	//   26   48:fstore_2        
				i = (int)((float)i1 * f);
	//   27   49:iload           7
	//   28   51:i2f             
	//   29   52:fload_2         
	//   30   53:fmul            
	//   31   54:f2i             
	//   32   55:istore_3        
				j = k;
	//   33   56:iload           5
	//   34   58:istore          4
			}
			i1 = mMaxIconSize;
	//   35   60:aload_0         
	//   36   61:getfield        #99  <Field int mMaxIconSize>
	//   37   64:istore          7
			l = j;
	//   38   66:iload           4
	//   39   68:istore          6
			k = i;
	//   40   70:iload_3         
	//   41   71:istore          5
			if(i > i1)
	//*  42   73:iload_3         
	//*  43   74:iload           7
	//*  44   76:icmple          98
			{
				float f1 = (float)i1 / (float)i;
	//   45   79:iload           7
	//   46   81:i2f             
	//   47   82:iload_3         
	//   48   83:i2f             
	//   49   84:fdiv            
	//   50   85:fstore_2        
				l = (int)((float)j * f1);
	//   51   86:iload           4
	//   52   88:i2f             
	//   53   89:fload_2         
	//   54   90:fmul            
	//   55   91:f2i             
	//   56   92:istore          6
				k = i1;
	//   57   94:iload           7
	//   58   96:istore          5
			}
			drawable.setBounds(0, 0, l, k);
	//   59   98:aload_1         
	//   60   99:iconst_0        
	//   61  100:iconst_0        
	//   62  101:iload           6
	//   63  103:iload           5
	//   64  105:invokevirtual   #322 <Method void Drawable.setBounds(int, int, int, int)>
		}
		setCompoundDrawables(drawable, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   65  108:aload_0         
	//   66  109:aload_1         
	//   67  110:aconst_null     
	//   68  111:aconst_null     
	//   69  112:aconst_null     
	//   70  113:invokevirtual   #326 <Method void setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
		updateTextButtonVisibility();
	//   71  116:aload_0         
	//   72  117:invokespecial   #242 <Method void updateTextButtonVisibility()>
	//   73  120:return          
	}

	public void setItemInvoker(MenuBuilder.ItemInvoker iteminvoker)
	{
		mItemInvoker = iteminvoker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #230 <Field MenuBuilder$ItemInvoker mItemInvoker>
	//    3    5:return          
	}

	public void setPadding(int i, int j, int k, int l)
	{
		mSavedPaddingLeft = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #105 <Field int mSavedPaddingLeft>
		super.setPadding(i, j, k, l);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokespecial   #257 <Method void AppCompatTextView.setPadding(int, int, int, int)>
	//    9   14:return          
	}

	public void setPopupCallback(PopupCallback popupcallback)
	{
		mPopupCallback = popupcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #332 <Field ActionMenuItemView$PopupCallback mPopupCallback>
	//    3    5:return          
	}

	public void setShortcut(boolean flag, char c)
	{
	//    0    0:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #131 <Field CharSequence mTitle>
		updateTextButtonVisibility();
	//    3    5:aload_0         
	//    4    6:invokespecial   #242 <Method void updateTextButtonVisibility()>
	//    5    9:return          
	}

	public boolean showsIcon()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private boolean mAllowTextWithIcon;
	private boolean mExpandedFormat;
	private ForwardingListener mForwardingListener;
	private Drawable mIcon;
	MenuItemImpl mItemData;
	MenuBuilder.ItemInvoker mItemInvoker;
	private int mMaxIconSize;
	private int mMinWidth;
	PopupCallback mPopupCallback;
	private int mSavedPaddingLeft;
	private CharSequence mTitle;
}
