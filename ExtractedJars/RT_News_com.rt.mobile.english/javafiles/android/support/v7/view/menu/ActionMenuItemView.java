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
	implements MenuView.ItemView, android.view.View.OnClickListener, android.support.v7.widget.ActionMenuView.ActionMenuChildView
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


	public ActionMenuItemView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #50  <Method void ActionMenuItemView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #54  <Method void ActionMenuItemView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public ActionMenuItemView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #55  <Method void AppCompatTextView(Context, AttributeSet, int)>
		Resources resources = context.getResources();
	//    5    7:aload_1         
	//    6    8:invokevirtual   #61  <Method Resources Context.getResources()>
	//    7   11:astore          4
		mAllowTextWithIcon = shouldAllowTextWithIcon();
	//    8   13:aload_0         
	//    9   14:aload_0         
	//   10   15:invokespecial   #65  <Method boolean shouldAllowTextWithIcon()>
	//   11   18:putfield        #67  <Field boolean mAllowTextWithIcon>
		context = ((Context) (context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionMenuItemView, i, 0)));
	//   12   21:aload_1         
	//   13   22:aload_2         
	//   14   23:getstatic       #72  <Field int[] android.support.v7.appcompat.R$styleable.ActionMenuItemView>
	//   15   26:iload_3         
	//   16   27:iconst_0        
	//   17   28:invokevirtual   #76  <Method TypedArray Context.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   18   31:astore_1        
		mMinWidth = ((TypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.ActionMenuItemView_android_minWidth, 0);
	//   19   32:aload_0         
	//   20   33:aload_1         
	//   21   34:getstatic       #79  <Field int android.support.v7.appcompat.R$styleable.ActionMenuItemView_android_minWidth>
	//   22   37:iconst_0        
	//   23   38:invokevirtual   #85  <Method int TypedArray.getDimensionPixelSize(int, int)>
	//   24   41:putfield        #87  <Field int mMinWidth>
		((TypedArray) (context)).recycle();
	//   25   44:aload_1         
	//   26   45:invokevirtual   #91  <Method void TypedArray.recycle()>
		mMaxIconSize = (int)(32F * resources.getDisplayMetrics().density + 0.5F);
	//   27   48:aload_0         
	//   28   49:ldc1            #92  <Float 32F>
	//   29   51:aload           4
	//   30   53:invokevirtual   #98  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   31   56:getfield        #104 <Field float DisplayMetrics.density>
	//   32   59:fmul            
	//   33   60:ldc1            #105 <Float 0.5F>
	//   34   62:fadd            
	//   35   63:f2i             
	//   36   64:putfield        #107 <Field int mMaxIconSize>
		setOnClickListener(((android.view.View.OnClickListener) (this)));
	//   37   67:aload_0         
	//   38   68:aload_0         
	//   39   69:invokevirtual   #111 <Method void setOnClickListener(android.view.View$OnClickListener)>
		mSavedPaddingLeft = -1;
	//   40   72:aload_0         
	//   41   73:iconst_m1       
	//   42   74:putfield        #113 <Field int mSavedPaddingLeft>
		setSaveEnabled(false);
	//   43   77:aload_0         
	//   44   78:iconst_0        
	//   45   79:invokevirtual   #117 <Method void setSaveEnabled(boolean)>
	//   46   82:return          
	}

	private boolean shouldAllowTextWithIcon()
	{
		Configuration configuration = getContext().getResources().getConfiguration();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #121 <Method Context getContext()>
	//    2    4:invokevirtual   #61  <Method Resources Context.getResources()>
	//    3    7:invokevirtual   #125 <Method Configuration Resources.getConfiguration()>
	//    4   10:astore_3        
		int i = configuration.screenWidthDp;
	//    5   11:aload_3         
	//    6   12:getfield        #130 <Field int Configuration.screenWidthDp>
	//    7   15:istore_1        
		int j = configuration.screenHeightDp;
	//    8   16:aload_3         
	//    9   17:getfield        #133 <Field int Configuration.screenHeightDp>
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
	//   21   43:getfield        #136 <Field int Configuration.orientation>
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
	//    1    1:getfield        #139 <Field CharSequence mTitle>
	//    2    4:invokestatic    #145 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//    9   13:getfield        #147 <Field Drawable mIcon>
	//   10   16:ifnull          52
			if(mItemData.showsTextAsAction())
	//*  11   19:aload_0         
	//*  12   20:getfield        #149 <Field MenuItemImpl mItemData>
	//*  13   23:invokevirtual   #154 <Method boolean MenuItemImpl.showsTextAsAction()>
	//*  14   26:ifeq            50
			{
				flag = flag1;
	//   15   29:iload_2         
	//   16   30:istore_1        
				if(mAllowTextWithIcon)
					break label0;
	//   17   31:aload_0         
	//   18   32:getfield        #67  <Field boolean mAllowTextWithIcon>
	//   19   35:ifne            52
				if(mExpandedFormat)
	//*  20   38:aload_0         
	//*  21   39:getfield        #156 <Field boolean mExpandedFormat>
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
	//   39   66:getfield        #139 <Field CharSequence mTitle>
	//   40   69:astore          4
		else
	//*  41   71:goto            77
			charsequence = null;
	//   42   74:aconst_null     
	//   43   75:astore          4
		setText(charsequence);
	//   44   77:aload_0         
	//   45   78:aload           4
	//   46   80:invokevirtual   #160 <Method void setText(CharSequence)>
		charsequence = mItemData.getContentDescription();
	//   47   83:aload_0         
	//   48   84:getfield        #149 <Field MenuItemImpl mItemData>
	//   49   87:invokevirtual   #164 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   50   90:astore          4
		if(TextUtils.isEmpty(charsequence))
	//*  51   92:aload           4
	//*  52   94:invokestatic    #145 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//   60  111:getfield        #149 <Field MenuItemImpl mItemData>
	//   61  114:invokevirtual   #167 <Method CharSequence MenuItemImpl.getTitle()>
	//   62  117:astore          4
			setContentDescription(charsequence);
	//   63  119:aload_0         
	//   64  120:aload           4
	//   65  122:invokevirtual   #170 <Method void setContentDescription(CharSequence)>
		} else
	//*  66  125:goto            134
		{
			setContentDescription(charsequence);
	//   67  128:aload_0         
	//   68  129:aload           4
	//   69  131:invokevirtual   #170 <Method void setContentDescription(CharSequence)>
		}
		charsequence = mItemData.getTooltipText();
	//   70  134:aload_0         
	//   71  135:getfield        #149 <Field MenuItemImpl mItemData>
	//   72  138:invokevirtual   #173 <Method CharSequence MenuItemImpl.getTooltipText()>
	//   73  141:astore          4
		if(TextUtils.isEmpty(charsequence))
	//*  74  143:aload           4
	//*  75  145:invokestatic    #145 <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//   83  163:getfield        #149 <Field MenuItemImpl mItemData>
	//   84  166:invokevirtual   #167 <Method CharSequence MenuItemImpl.getTitle()>
	//   85  169:astore          4
			TooltipCompat.setTooltipText(((View) (this)), charsequence);
	//   86  171:aload_0         
	//   87  172:aload           4
	//   88  174:invokestatic    #179 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
			return;
	//   89  177:return          
		} else
		{
			TooltipCompat.setTooltipText(((View) (this)), charsequence);
	//   90  178:aload_0         
	//   91  179:aload           4
	//   92  181:invokestatic    #179 <Method void TooltipCompat.setTooltipText(View, CharSequence)>
			return;
	//   93  184:return          
		}
	}

	public MenuItemImpl getItemData()
	{
		return mItemData;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field MenuItemImpl mItemData>
	//    2    4:areturn         
	}

	public boolean hasText()
	{
		return TextUtils.isEmpty(getText()) ^ true;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #185 <Method CharSequence getText()>
	//    2    4:invokestatic    #145 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    3    7:iconst_1        
	//    4    8:ixor            
	//    5    9:ireturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i)
	{
		mItemData = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #149 <Field MenuItemImpl mItemData>
		setIcon(menuitemimpl.getIcon());
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #191 <Method Drawable MenuItemImpl.getIcon()>
	//    6   10:invokevirtual   #195 <Method void setIcon(Drawable)>
		setTitle(menuitemimpl.getTitleForItemView(((MenuView.ItemView) (this))));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_0         
	//   10   16:invokevirtual   #199 <Method CharSequence MenuItemImpl.getTitleForItemView(MenuView$ItemView)>
	//   11   19:invokevirtual   #202 <Method void setTitle(CharSequence)>
		setId(menuitemimpl.getItemId());
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #206 <Method int MenuItemImpl.getItemId()>
	//   15   27:invokevirtual   #210 <Method void setId(int)>
		if(menuitemimpl.isVisible())
	//*  16   30:aload_1         
	//*  17   31:invokevirtual   #213 <Method boolean MenuItemImpl.isVisible()>
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
	//   26   47:invokevirtual   #216 <Method void setVisibility(int)>
		setEnabled(menuitemimpl.isEnabled());
	//   27   50:aload_0         
	//   28   51:aload_1         
	//   29   52:invokevirtual   #219 <Method boolean MenuItemImpl.isEnabled()>
	//   30   55:invokevirtual   #222 <Method void setEnabled(boolean)>
		if(menuitemimpl.hasSubMenu() && mForwardingListener == null)
	//*  31   58:aload_1         
	//*  32   59:invokevirtual   #225 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  33   62:ifeq            84
	//*  34   65:aload_0         
	//*  35   66:getfield        #227 <Field ForwardingListener mForwardingListener>
	//*  36   69:ifnonnull       84
			mForwardingListener = ((ForwardingListener) (new ActionMenuItemForwardingListener()));
	//   37   72:aload_0         
	//   38   73:new             #12  <Class ActionMenuItemView$ActionMenuItemForwardingListener>
	//   39   76:dup             
	//   40   77:aload_0         
	//   41   78:invokespecial   #230 <Method void ActionMenuItemView$ActionMenuItemForwardingListener(ActionMenuItemView)>
	//   42   81:putfield        #227 <Field ForwardingListener mForwardingListener>
	//   43   84:return          
	}

	public boolean needsDividerAfter()
	{
		return hasText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method boolean hasText()>
	//    2    4:ireturn         
	}

	public boolean needsDividerBefore()
	{
		return hasText() && mItemData.getIcon() == null;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method boolean hasText()>
	//    2    4:ifeq            19
	//    3    7:aload_0         
	//    4    8:getfield        #149 <Field MenuItemImpl mItemData>
	//    5   11:invokevirtual   #191 <Method Drawable MenuItemImpl.getIcon()>
	//    6   14:ifnonnull       19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void onClick(View view)
	{
		if(mItemInvoker != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #238 <Field MenuBuilder$ItemInvoker mItemInvoker>
	//*   2    4:ifnull          21
			mItemInvoker.invokeItem(mItemData);
	//    3    7:aload_0         
	//    4    8:getfield        #238 <Field MenuBuilder$ItemInvoker mItemInvoker>
	//    5   11:aload_0         
	//    6   12:getfield        #149 <Field MenuItemImpl mItemData>
	//    7   15:invokeinterface #244 <Method boolean MenuBuilder$ItemInvoker.invokeItem(MenuItemImpl)>
	//    8   20:pop             
	//    9   21:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #248 <Method void AppCompatTextView.onConfigurationChanged(Configuration)>
		mAllowTextWithIcon = shouldAllowTextWithIcon();
	//    3    5:aload_0         
	//    4    6:aload_0         
	//    5    7:invokespecial   #65  <Method boolean shouldAllowTextWithIcon()>
	//    6   10:putfield        #67  <Field boolean mAllowTextWithIcon>
		updateTextButtonVisibility();
	//    7   13:aload_0         
	//    8   14:invokespecial   #250 <Method void updateTextButtonVisibility()>
	//    9   17:return          
	}

	protected void onMeasure(int i, int j)
	{
		boolean flag = hasText();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method boolean hasText()>
	//    2    4:istore          5
		if(flag && mSavedPaddingLeft >= 0)
	//*   3    6:iload           5
	//*   4    8:ifeq            38
	//*   5   11:aload_0         
	//*   6   12:getfield        #113 <Field int mSavedPaddingLeft>
	//*   7   15:iflt            38
			super.setPadding(mSavedPaddingLeft, getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:getfield        #113 <Field int mSavedPaddingLeft>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #255 <Method int getPaddingTop()>
	//   13   27:aload_0         
	//   14   28:invokevirtual   #258 <Method int getPaddingRight()>
	//   15   31:aload_0         
	//   16   32:invokevirtual   #261 <Method int getPaddingBottom()>
	//   17   35:invokespecial   #265 <Method void AppCompatTextView.setPadding(int, int, int, int)>
		super.onMeasure(i, j);
	//   18   38:aload_0         
	//   19   39:iload_1         
	//   20   40:iload_2         
	//   21   41:invokespecial   #267 <Method void AppCompatTextView.onMeasure(int, int)>
		int k = android.view.View.MeasureSpec.getMode(i);
	//   22   44:iload_1         
	//   23   45:invokestatic    #273 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   24   48:istore_3        
		i = android.view.View.MeasureSpec.getSize(i);
	//   25   49:iload_1         
	//   26   50:invokestatic    #276 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   27   53:istore_1        
		int l = getMeasuredWidth();
	//   28   54:aload_0         
	//   29   55:invokevirtual   #279 <Method int getMeasuredWidth()>
	//   30   58:istore          4
		if(k == 0x80000000)
	//*  31   60:iload_3         
	//*  32   61:ldc2            #280 <Int 0x80000000>
	//*  33   64:icmpne          79
			i = Math.min(i, mMinWidth);
	//   34   67:iload_1         
	//   35   68:aload_0         
	//   36   69:getfield        #87  <Field int mMinWidth>
	//   37   72:invokestatic    #285 <Method int Math.min(int, int)>
	//   38   75:istore_1        
		else
	//*  39   76:goto            84
			i = mMinWidth;
	//   40   79:aload_0         
	//   41   80:getfield        #87  <Field int mMinWidth>
	//   42   83:istore_1        
		if(k != 0x40000000 && mMinWidth > 0 && l < i)
	//*  43   84:iload_3         
	//*  44   85:ldc2            #286 <Int 0x40000000>
	//*  45   88:icmpeq          116
	//*  46   91:aload_0         
	//*  47   92:getfield        #87  <Field int mMinWidth>
	//*  48   95:ifle            116
	//*  49   98:iload           4
	//*  50  100:iload_1         
	//*  51  101:icmpge          116
			super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000), j);
	//   52  104:aload_0         
	//   53  105:iload_1         
	//   54  106:ldc2            #286 <Int 0x40000000>
	//   55  109:invokestatic    #289 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   56  112:iload_2         
	//   57  113:invokespecial   #267 <Method void AppCompatTextView.onMeasure(int, int)>
		if(!flag && mIcon != null)
	//*  58  116:iload           5
	//*  59  118:ifne            161
	//*  60  121:aload_0         
	//*  61  122:getfield        #147 <Field Drawable mIcon>
	//*  62  125:ifnull          161
			super.setPadding((getMeasuredWidth() - mIcon.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
	//   63  128:aload_0         
	//   64  129:aload_0         
	//   65  130:invokevirtual   #279 <Method int getMeasuredWidth()>
	//   66  133:aload_0         
	//   67  134:getfield        #147 <Field Drawable mIcon>
	//   68  137:invokevirtual   #295 <Method Rect Drawable.getBounds()>
	//   69  140:invokevirtual   #300 <Method int Rect.width()>
	//   70  143:isub            
	//   71  144:iconst_2        
	//   72  145:idiv            
	//   73  146:aload_0         
	//   74  147:invokevirtual   #255 <Method int getPaddingTop()>
	//   75  150:aload_0         
	//   76  151:invokevirtual   #258 <Method int getPaddingRight()>
	//   77  154:aload_0         
	//   78  155:invokevirtual   #261 <Method int getPaddingBottom()>
	//   79  158:invokespecial   #265 <Method void AppCompatTextView.setPadding(int, int, int, int)>
	//   80  161:return          
	}

	public void onRestoreInstanceState(Parcelable parcelable)
	{
		super.onRestoreInstanceState(((Parcelable) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #304 <Method void AppCompatTextView.onRestoreInstanceState(Parcelable)>
	//    3    5:return          
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		if(mItemData.hasSubMenu() && mForwardingListener != null && mForwardingListener.onTouch(((View) (this)), motionevent))
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field MenuItemImpl mItemData>
	//*   2    4:invokevirtual   #225 <Method boolean MenuItemImpl.hasSubMenu()>
	//*   3    7:ifeq            31
	//*   4   10:aload_0         
	//*   5   11:getfield        #227 <Field ForwardingListener mForwardingListener>
	//*   6   14:ifnull          31
	//*   7   17:aload_0         
	//*   8   18:getfield        #227 <Field ForwardingListener mForwardingListener>
	//*   9   21:aload_0         
	//*  10   22:aload_1         
	//*  11   23:invokevirtual   #312 <Method boolean ForwardingListener.onTouch(View, MotionEvent)>
	//*  12   26:ifeq            31
			return true;
	//   13   29:iconst_1        
	//   14   30:ireturn         
		else
			return super.onTouchEvent(motionevent);
	//   15   31:aload_0         
	//   16   32:aload_1         
	//   17   33:invokespecial   #314 <Method boolean AppCompatTextView.onTouchEvent(MotionEvent)>
	//   18   36:ireturn         
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
	//*   1    1:getfield        #156 <Field boolean mExpandedFormat>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          27
		{
			mExpandedFormat = flag;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #156 <Field boolean mExpandedFormat>
			if(mItemData != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #149 <Field MenuItemImpl mItemData>
	//*   9   17:ifnull          27
				mItemData.actionFormatChanged();
	//   10   20:aload_0         
	//   11   21:getfield        #149 <Field MenuItemImpl mItemData>
	//   12   24:invokevirtual   #321 <Method void MenuItemImpl.actionFormatChanged()>
		}
	//   13   27:return          
	}

	public void setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #147 <Field Drawable mIcon>
		if(drawable != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          109
		{
			int l = drawable.getIntrinsicWidth();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #324 <Method int Drawable.getIntrinsicWidth()>
	//    7   13:istore          6
			int k = drawable.getIntrinsicHeight();
	//    8   15:aload_1         
	//    9   16:invokevirtual   #327 <Method int Drawable.getIntrinsicHeight()>
	//   10   19:istore          5
			int i = l;
	//   11   21:iload           6
	//   12   23:istore_3        
			int j = k;
	//   13   24:iload           5
	//   14   26:istore          4
			if(l > mMaxIconSize)
	//*  15   28:iload           6
	//*  16   30:aload_0         
	//*  17   31:getfield        #107 <Field int mMaxIconSize>
	//*  18   34:icmple          60
			{
				float f = (float)mMaxIconSize / (float)l;
	//   19   37:aload_0         
	//   20   38:getfield        #107 <Field int mMaxIconSize>
	//   21   41:i2f             
	//   22   42:iload           6
	//   23   44:i2f             
	//   24   45:fdiv            
	//   25   46:fstore_2        
				i = mMaxIconSize;
	//   26   47:aload_0         
	//   27   48:getfield        #107 <Field int mMaxIconSize>
	//   28   51:istore_3        
				j = (int)((float)k * f);
	//   29   52:iload           5
	//   30   54:i2f             
	//   31   55:fload_2         
	//   32   56:fmul            
	//   33   57:f2i             
	//   34   58:istore          4
			}
			l = i;
	//   35   60:iload_3         
	//   36   61:istore          6
			k = j;
	//   37   63:iload           4
	//   38   65:istore          5
			if(j > mMaxIconSize)
	//*  39   67:iload           4
	//*  40   69:aload_0         
	//*  41   70:getfield        #107 <Field int mMaxIconSize>
	//*  42   73:icmple          99
			{
				float f1 = (float)mMaxIconSize / (float)j;
	//   43   76:aload_0         
	//   44   77:getfield        #107 <Field int mMaxIconSize>
	//   45   80:i2f             
	//   46   81:iload           4
	//   47   83:i2f             
	//   48   84:fdiv            
	//   49   85:fstore_2        
				k = mMaxIconSize;
	//   50   86:aload_0         
	//   51   87:getfield        #107 <Field int mMaxIconSize>
	//   52   90:istore          5
				l = (int)((float)i * f1);
	//   53   92:iload_3         
	//   54   93:i2f             
	//   55   94:fload_2         
	//   56   95:fmul            
	//   57   96:f2i             
	//   58   97:istore          6
			}
			drawable.setBounds(0, 0, l, k);
	//   59   99:aload_1         
	//   60  100:iconst_0        
	//   61  101:iconst_0        
	//   62  102:iload           6
	//   63  104:iload           5
	//   64  106:invokevirtual   #330 <Method void Drawable.setBounds(int, int, int, int)>
		}
		setCompoundDrawables(drawable, ((Drawable) (null)), ((Drawable) (null)), ((Drawable) (null)));
	//   65  109:aload_0         
	//   66  110:aload_1         
	//   67  111:aconst_null     
	//   68  112:aconst_null     
	//   69  113:aconst_null     
	//   70  114:invokevirtual   #334 <Method void setCompoundDrawables(Drawable, Drawable, Drawable, Drawable)>
		updateTextButtonVisibility();
	//   71  117:aload_0         
	//   72  118:invokespecial   #250 <Method void updateTextButtonVisibility()>
	//   73  121:return          
	}

	public void setItemInvoker(MenuBuilder.ItemInvoker iteminvoker)
	{
		mItemInvoker = iteminvoker;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #238 <Field MenuBuilder$ItemInvoker mItemInvoker>
	//    3    5:return          
	}

	public void setPadding(int i, int j, int k, int l)
	{
		mSavedPaddingLeft = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #113 <Field int mSavedPaddingLeft>
		super.setPadding(i, j, k, l);
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:iload_2         
	//    6    8:iload_3         
	//    7    9:iload           4
	//    8   11:invokespecial   #265 <Method void AppCompatTextView.setPadding(int, int, int, int)>
	//    9   14:return          
	}

	public void setPopupCallback(PopupCallback popupcallback)
	{
		mPopupCallback = popupcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #340 <Field ActionMenuItemView$PopupCallback mPopupCallback>
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
	//    2    2:putfield        #139 <Field CharSequence mTitle>
		updateTextButtonVisibility();
	//    3    5:aload_0         
	//    4    6:invokespecial   #250 <Method void updateTextButtonVisibility()>
	//    5    9:return          
	}

	public boolean showsIcon()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	private static final int MAX_ICON_SIZE = 32;
	private static final String TAG = "ActionMenuItemView";
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
