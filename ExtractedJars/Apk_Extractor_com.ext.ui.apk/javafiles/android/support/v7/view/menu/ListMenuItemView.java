// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemImpl

public class ListMenuItemView extends LinearLayout
	implements MenuView.ItemView
{

	public ListMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.listMenuViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #46  <Field int android.support.v7.appcompat.R$attr.listMenuViewStyle>
	//    4    6:invokespecial   #49  <Method void ListMenuItemView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ListMenuItemView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #52  <Method void LinearLayout(Context, AttributeSet)>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(getContext(), attributeset, android.support.v7.appcompat.R.styleable.MenuView, i, 0)));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #56  <Method Context getContext()>
	//    6   10:aload_2         
	//    7   11:getstatic       #62  <Field int[] android.support.v7.appcompat.R$styleable.MenuView>
	//    8   14:iload_3         
	//    9   15:iconst_0        
	//   10   16:invokestatic    #68  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   11   19:astore_2        
		mBackground = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.MenuView_android_itemBackground);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:getstatic       #71  <Field int android.support.v7.appcompat.R$styleable.MenuView_android_itemBackground>
	//   15   25:invokevirtual   #75  <Method Drawable TintTypedArray.getDrawable(int)>
	//   16   28:putfield        #77  <Field Drawable mBackground>
		mTextAppearance = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuView_android_itemTextAppearance, -1);
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:getstatic       #80  <Field int android.support.v7.appcompat.R$styleable.MenuView_android_itemTextAppearance>
	//   20   36:iconst_m1       
	//   21   37:invokevirtual   #84  <Method int TintTypedArray.getResourceId(int, int)>
	//   22   40:putfield        #86  <Field int mTextAppearance>
		mPreserveIconSpacing = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuView_preserveIconSpacing, false);
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:getstatic       #89  <Field int android.support.v7.appcompat.R$styleable.MenuView_preserveIconSpacing>
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #93  <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   28   52:putfield        #95  <Field boolean mPreserveIconSpacing>
		mTextAppearanceContext = context;
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:putfield        #97  <Field Context mTextAppearanceContext>
		mSubMenuArrow = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.MenuView_subMenuArrow);
	//   32   60:aload_0         
	//   33   61:aload_2         
	//   34   62:getstatic       #100 <Field int android.support.v7.appcompat.R$styleable.MenuView_subMenuArrow>
	//   35   65:invokevirtual   #75  <Method Drawable TintTypedArray.getDrawable(int)>
	//   36   68:putfield        #102 <Field Drawable mSubMenuArrow>
		((TintTypedArray) (attributeset)).recycle();
	//   37   71:aload_2         
	//   38   72:invokevirtual   #106 <Method void TintTypedArray.recycle()>
	//   39   75:return          
	}

	private LayoutInflater getInflater()
	{
		if(mInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field LayoutInflater mInflater>
	//*   2    4:ifnonnull       18
			mInflater = LayoutInflater.from(getContext());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #56  <Method Context getContext()>
	//    6   12:invokestatic    #116 <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   15:putfield        #110 <Field LayoutInflater mInflater>
		return mInflater;
	//    8   18:aload_0         
	//    9   19:getfield        #110 <Field LayoutInflater mInflater>
	//   10   22:areturn         
	}

	private void insertCheckBox()
	{
		mCheckBox = (CheckBox)getInflater().inflate(android.support.v7.appcompat.R.layout.abc_list_menu_item_checkbox, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #119 <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #124 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_checkbox>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #128 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #130 <Class CheckBox>
	//    8   16:putfield        #132 <Field CheckBox mCheckBox>
		addView(((android.view.View) (mCheckBox)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #132 <Field CheckBox mCheckBox>
	//   12   24:invokevirtual   #136 <Method void addView(android.view.View)>
	//   13   27:return          
	}

	private void insertIconView()
	{
		mIconView = (ImageView)getInflater().inflate(android.support.v7.appcompat.R.layout.abc_list_menu_item_icon, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #119 <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #140 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_icon>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #128 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #142 <Class ImageView>
	//    8   16:putfield        #144 <Field ImageView mIconView>
		addView(((android.view.View) (mIconView)), 0);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #144 <Field ImageView mIconView>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #147 <Method void addView(android.view.View, int)>
	//   14   28:return          
	}

	private void insertRadioButton()
	{
		mRadioButton = (RadioButton)getInflater().inflate(android.support.v7.appcompat.R.layout.abc_list_menu_item_radio, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #119 <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #151 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_radio>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #128 <Method android.view.View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #153 <Class RadioButton>
	//    8   16:putfield        #155 <Field RadioButton mRadioButton>
		addView(((android.view.View) (mRadioButton)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #155 <Field RadioButton mRadioButton>
	//   12   24:invokevirtual   #136 <Method void addView(android.view.View)>
	//   13   27:return          
	}

	private void setSubMenuArrowVisible(boolean flag)
	{
		if(mSubMenuArrowView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #159 <Field ImageView mSubMenuArrowView>
	//*   2    4:ifnull          23
		{
			ImageView imageview = mSubMenuArrowView;
	//    3    7:aload_0         
	//    4    8:getfield        #159 <Field ImageView mSubMenuArrowView>
	//    5   11:astore_3        
			int i;
			if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            24
				i = 0;
	//    8   16:iconst_0        
	//    9   17:istore_2        
			else
	//*  10   18:aload_3         
	//*  11   19:iload_2         
	//*  12   20:invokevirtual   #163 <Method void ImageView.setVisibility(int)>
	//*  13   23:return          
				i = 8;
	//   14   24:bipush          8
	//   15   26:istore_2        
			imageview.setVisibility(i);
		}
	//*  16   27:goto            18
	}

	public MenuItemImpl getItemData()
	{
		return mItemData;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field MenuItemImpl mItemData>
	//    2    4:areturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i)
	{
		mItemData = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #167 <Field MenuItemImpl mItemData>
		mMenuType = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #171 <Field int mMenuType>
		if(menuitemimpl.isVisible())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #177 <Method boolean MenuItemImpl.isVisible()>
	//*   8   14:ifeq            86
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		else
	//*  11   19:aload_0         
	//*  12   20:iload_2         
	//*  13   21:invokevirtual   #178 <Method void setVisibility(int)>
	//*  14   24:aload_0         
	//*  15   25:aload_1         
	//*  16   26:aload_0         
	//*  17   27:invokevirtual   #182 <Method CharSequence MenuItemImpl.getTitleForItemView(MenuView$ItemView)>
	//*  18   30:invokevirtual   #186 <Method void setTitle(CharSequence)>
	//*  19   33:aload_0         
	//*  20   34:aload_1         
	//*  21   35:invokevirtual   #189 <Method boolean MenuItemImpl.isCheckable()>
	//*  22   38:invokevirtual   #192 <Method void setCheckable(boolean)>
	//*  23   41:aload_0         
	//*  24   42:aload_1         
	//*  25   43:invokevirtual   #195 <Method boolean MenuItemImpl.shouldShowShortcut()>
	//*  26   46:aload_1         
	//*  27   47:invokevirtual   #199 <Method char MenuItemImpl.getShortcut()>
	//*  28   50:invokevirtual   #203 <Method void setShortcut(boolean, char)>
	//*  29   53:aload_0         
	//*  30   54:aload_1         
	//*  31   55:invokevirtual   #207 <Method Drawable MenuItemImpl.getIcon()>
	//*  32   58:invokevirtual   #211 <Method void setIcon(Drawable)>
	//*  33   61:aload_0         
	//*  34   62:aload_1         
	//*  35   63:invokevirtual   #214 <Method boolean MenuItemImpl.isEnabled()>
	//*  36   66:invokevirtual   #217 <Method void setEnabled(boolean)>
	//*  37   69:aload_0         
	//*  38   70:aload_1         
	//*  39   71:invokevirtual   #220 <Method boolean MenuItemImpl.hasSubMenu()>
	//*  40   74:invokespecial   #222 <Method void setSubMenuArrowVisible(boolean)>
	//*  41   77:aload_0         
	//*  42   78:aload_1         
	//*  43   79:invokevirtual   #226 <Method CharSequence MenuItemImpl.getContentDescription()>
	//*  44   82:invokevirtual   #229 <Method void setContentDescription(CharSequence)>
	//*  45   85:return          
			i = 8;
	//   46   86:bipush          8
	//   47   88:istore_2        
		setVisibility(i);
		setTitle(menuitemimpl.getTitleForItemView(((MenuView.ItemView) (this))));
		setCheckable(menuitemimpl.isCheckable());
		setShortcut(menuitemimpl.shouldShowShortcut(), menuitemimpl.getShortcut());
		setIcon(menuitemimpl.getIcon());
		setEnabled(menuitemimpl.isEnabled());
		setSubMenuArrowVisible(menuitemimpl.hasSubMenu());
		setContentDescription(menuitemimpl.getContentDescription());
	//*  48   89:goto            19
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #232 <Method void LinearLayout.onFinishInflate()>
		ViewCompat.setBackground(((android.view.View) (this)), mBackground);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #77  <Field Drawable mBackground>
	//    5    9:invokestatic    #238 <Method void ViewCompat.setBackground(android.view.View, Drawable)>
		mTitleView = (TextView)findViewById(android.support.v7.appcompat.R.id.title);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getstatic       #243 <Field int android.support.v7.appcompat.R$id.title>
	//    9   17:invokevirtual   #247 <Method android.view.View findViewById(int)>
	//   10   20:checkcast       #249 <Class TextView>
	//   11   23:putfield        #251 <Field TextView mTitleView>
		if(mTextAppearance != -1)
	//*  12   26:aload_0         
	//*  13   27:getfield        #86  <Field int mTextAppearance>
	//*  14   30:iconst_m1       
	//*  15   31:icmpeq          49
			mTitleView.setTextAppearance(mTextAppearanceContext, mTextAppearance);
	//   16   34:aload_0         
	//   17   35:getfield        #251 <Field TextView mTitleView>
	//   18   38:aload_0         
	//   19   39:getfield        #97  <Field Context mTextAppearanceContext>
	//   20   42:aload_0         
	//   21   43:getfield        #86  <Field int mTextAppearance>
	//   22   46:invokevirtual   #255 <Method void TextView.setTextAppearance(Context, int)>
		mShortcutView = (TextView)findViewById(android.support.v7.appcompat.R.id.shortcut);
	//   23   49:aload_0         
	//   24   50:aload_0         
	//   25   51:getstatic       #258 <Field int android.support.v7.appcompat.R$id.shortcut>
	//   26   54:invokevirtual   #247 <Method android.view.View findViewById(int)>
	//   27   57:checkcast       #249 <Class TextView>
	//   28   60:putfield        #260 <Field TextView mShortcutView>
		mSubMenuArrowView = (ImageView)findViewById(android.support.v7.appcompat.R.id.submenuarrow);
	//   29   63:aload_0         
	//   30   64:aload_0         
	//   31   65:getstatic       #263 <Field int android.support.v7.appcompat.R$id.submenuarrow>
	//   32   68:invokevirtual   #247 <Method android.view.View findViewById(int)>
	//   33   71:checkcast       #142 <Class ImageView>
	//   34   74:putfield        #159 <Field ImageView mSubMenuArrowView>
		if(mSubMenuArrowView != null)
	//*  35   77:aload_0         
	//*  36   78:getfield        #159 <Field ImageView mSubMenuArrowView>
	//*  37   81:ifnull          95
			mSubMenuArrowView.setImageDrawable(mSubMenuArrow);
	//   38   84:aload_0         
	//   39   85:getfield        #159 <Field ImageView mSubMenuArrowView>
	//   40   88:aload_0         
	//   41   89:getfield        #102 <Field Drawable mSubMenuArrow>
	//   42   92:invokevirtual   #266 <Method void ImageView.setImageDrawable(Drawable)>
	//   43   95:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(mIconView != null && mPreserveIconSpacing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #144 <Field ImageView mIconView>
	//*   2    4:ifnull          55
	//*   3    7:aload_0         
	//*   4    8:getfield        #95  <Field boolean mPreserveIconSpacing>
	//*   5   11:ifeq            55
		{
			android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #272 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//    8   18:astore_3        
			android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)mIconView.getLayoutParams();
	//    9   19:aload_0         
	//   10   20:getfield        #144 <Field ImageView mIconView>
	//   11   23:invokevirtual   #273 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   12   26:checkcast       #275 <Class android.widget.LinearLayout$LayoutParams>
	//   13   29:astore          4
			if(layoutparams.height > 0 && layoutparams1.width <= 0)
	//*  14   31:aload_3         
	//*  15   32:getfield        #280 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  16   35:ifle            55
	//*  17   38:aload           4
	//*  18   40:getfield        #283 <Field int android.widget.LinearLayout$LayoutParams.width>
	//*  19   43:ifgt            55
				layoutparams1.width = layoutparams.height;
	//   20   46:aload           4
	//   21   48:aload_3         
	//   22   49:getfield        #280 <Field int android.view.ViewGroup$LayoutParams.height>
	//   23   52:putfield        #283 <Field int android.widget.LinearLayout$LayoutParams.width>
		}
		super.onMeasure(i, j);
	//   24   55:aload_0         
	//   25   56:iload_1         
	//   26   57:iload_2         
	//   27   58:invokespecial   #285 <Method void LinearLayout.onMeasure(int, int)>
	//   28   61:return          
	}

	public boolean prefersCondensedTitle()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void setCheckable(boolean flag)
	{
		if(flag || mRadioButton != null || mCheckBox != null) goto _L2; else goto _L1
	//    0    0:iload_1         
	//    1    1:ifne            19
	//    2    4:aload_0         
	//    3    5:getfield        #155 <Field RadioButton mRadioButton>
	//    4    8:ifnonnull       19
	//    5   11:aload_0         
	//    6   12:getfield        #132 <Field CheckBox mCheckBox>
	//    7   15:ifnonnull       19
_L1:
		return;
	//    8   18:return          
_L2:
		Object obj;
		Object obj1;
		if(mItemData.isExclusiveCheckable())
	//*   9   19:aload_0         
	//*  10   20:getfield        #167 <Field MenuItemImpl mItemData>
	//*  11   23:invokevirtual   #289 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*  12   26:ifeq            108
		{
			if(mRadioButton == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #155 <Field RadioButton mRadioButton>
	//*  15   33:ifnonnull       40
				insertRadioButton();
	//   16   36:aload_0         
	//   17   37:invokespecial   #291 <Method void insertRadioButton()>
			obj = ((Object) (mRadioButton));
	//   18   40:aload_0         
	//   19   41:getfield        #155 <Field RadioButton mRadioButton>
	//   20   44:astore_3        
			obj1 = ((Object) (mCheckBox));
	//   21   45:aload_0         
	//   22   46:getfield        #132 <Field CheckBox mCheckBox>
	//   23   49:astore          4
		} else
	//*  24   51:iload_1         
	//*  25   52:ifeq            139
	//*  26   55:aload_3         
	//*  27   56:aload_0         
	//*  28   57:getfield        #167 <Field MenuItemImpl mItemData>
	//*  29   60:invokevirtual   #294 <Method boolean MenuItemImpl.isChecked()>
	//*  30   63:invokevirtual   #299 <Method void CompoundButton.setChecked(boolean)>
	//*  31   66:iload_1         
	//*  32   67:ifeq            133
	//*  33   70:iconst_0        
	//*  34   71:istore_2        
	//*  35   72:aload_3         
	//*  36   73:invokevirtual   #303 <Method int CompoundButton.getVisibility()>
	//*  37   76:iload_2         
	//*  38   77:icmpeq          85
	//*  39   80:aload_3         
	//*  40   81:iload_2         
	//*  41   82:invokevirtual   #304 <Method void CompoundButton.setVisibility(int)>
	//*  42   85:aload           4
	//*  43   87:ifnull          18
	//*  44   90:aload           4
	//*  45   92:invokevirtual   #303 <Method int CompoundButton.getVisibility()>
	//*  46   95:bipush          8
	//*  47   97:icmpeq          18
	//*  48  100:aload           4
	//*  49  102:bipush          8
	//*  50  104:invokevirtual   #304 <Method void CompoundButton.setVisibility(int)>
	//*  51  107:return          
		{
			if(mCheckBox == null)
	//*  52  108:aload_0         
	//*  53  109:getfield        #132 <Field CheckBox mCheckBox>
	//*  54  112:ifnonnull       119
				insertCheckBox();
	//   55  115:aload_0         
	//   56  116:invokespecial   #306 <Method void insertCheckBox()>
			obj = ((Object) (mCheckBox));
	//   57  119:aload_0         
	//   58  120:getfield        #132 <Field CheckBox mCheckBox>
	//   59  123:astore_3        
			obj1 = ((Object) (mRadioButton));
	//   60  124:aload_0         
	//   61  125:getfield        #155 <Field RadioButton mRadioButton>
	//   62  128:astore          4
		}
		if(flag)
		{
			((CompoundButton) (obj)).setChecked(mItemData.isChecked());
			int i;
			if(flag)
				i = 0;
			else
	//*  63  130:goto            51
				i = 8;
	//   64  133:bipush          8
	//   65  135:istore_2        
			if(((CompoundButton) (obj)).getVisibility() != i)
				((CompoundButton) (obj)).setVisibility(i);
			if(obj1 != null && ((CompoundButton) (obj1)).getVisibility() != 8)
			{
				((CompoundButton) (obj1)).setVisibility(8);
				return;
			}
			if(true)
				continue; /* Loop/switch isn't completed */
	//   66  136:goto            72
		}
		if(mCheckBox != null)
	//*  67  139:aload_0         
	//*  68  140:getfield        #132 <Field CheckBox mCheckBox>
	//*  69  143:ifnull          155
			mCheckBox.setVisibility(8);
	//   70  146:aload_0         
	//   71  147:getfield        #132 <Field CheckBox mCheckBox>
	//   72  150:bipush          8
	//   73  152:invokevirtual   #307 <Method void CheckBox.setVisibility(int)>
		if(mRadioButton != null)
	//*  74  155:aload_0         
	//*  75  156:getfield        #155 <Field RadioButton mRadioButton>
	//*  76  159:ifnull          18
		{
			mRadioButton.setVisibility(8);
	//   77  162:aload_0         
	//   78  163:getfield        #155 <Field RadioButton mRadioButton>
	//   79  166:bipush          8
	//   80  168:invokevirtual   #308 <Method void RadioButton.setVisibility(int)>
			return;
	//   81  171:return          
		}
		if(true) goto _L1; else goto _L3
_L3:
	}

	public void setChecked(boolean flag)
	{
		Object obj;
		if(mItemData.isExclusiveCheckable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field MenuItemImpl mItemData>
	//*   2    4:invokevirtual   #289 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*   3    7:ifeq            32
		{
			if(mRadioButton == null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #155 <Field RadioButton mRadioButton>
	//*   6   14:ifnonnull       21
				insertRadioButton();
	//    7   17:aload_0         
	//    8   18:invokespecial   #291 <Method void insertRadioButton()>
			obj = ((Object) (mRadioButton));
	//    9   21:aload_0         
	//   10   22:getfield        #155 <Field RadioButton mRadioButton>
	//   11   25:astore_2        
		} else
	//*  12   26:aload_2         
	//*  13   27:iload_1         
	//*  14   28:invokevirtual   #299 <Method void CompoundButton.setChecked(boolean)>
	//*  15   31:return          
		{
			if(mCheckBox == null)
	//*  16   32:aload_0         
	//*  17   33:getfield        #132 <Field CheckBox mCheckBox>
	//*  18   36:ifnonnull       43
				insertCheckBox();
	//   19   39:aload_0         
	//   20   40:invokespecial   #306 <Method void insertCheckBox()>
			obj = ((Object) (mCheckBox));
	//   21   43:aload_0         
	//   22   44:getfield        #132 <Field CheckBox mCheckBox>
	//   23   47:astore_2        
		}
		((CompoundButton) (obj)).setChecked(flag);
	//*  24   48:goto            26
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #311 <Field boolean mForceShowIcon>
		mPreserveIconSpacing = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #95  <Field boolean mPreserveIconSpacing>
	//    6   10:return          
	}

	public void setIcon(Drawable drawable)
	{
		boolean flag;
		if(mItemData.shouldShowIcon() || mForceShowIcon)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field MenuItemImpl mItemData>
	//*   2    4:invokevirtual   #314 <Method boolean MenuItemImpl.shouldShowIcon()>
	//*   3    7:ifne            17
	//*   4   10:aload_0         
	//*   5   11:getfield        #311 <Field boolean mForceShowIcon>
	//*   6   14:ifeq            31
			flag = true;
	//    7   17:iconst_1        
	//    8   18:istore_2        
		else
	//*   9   19:iload_2         
	//*  10   20:ifne            36
	//*  11   23:aload_0         
	//*  12   24:getfield        #95  <Field boolean mPreserveIconSpacing>
	//*  13   27:ifne            36
	//*  14   30:return          
			flag = false;
	//   15   31:iconst_0        
	//   16   32:istore_2        
		break MISSING_BLOCK_LABEL_19;
	//   17   33:goto            19
		if((flag || mPreserveIconSpacing) && (mIconView != null || drawable != null || mPreserveIconSpacing))
	//*  18   36:aload_0         
	//*  19   37:getfield        #144 <Field ImageView mIconView>
	//*  20   40:ifnonnull       54
	//*  21   43:aload_1         
	//*  22   44:ifnonnull       54
	//*  23   47:aload_0         
	//*  24   48:getfield        #95  <Field boolean mPreserveIconSpacing>
	//*  25   51:ifeq            30
		{
			if(mIconView == null)
	//*  26   54:aload_0         
	//*  27   55:getfield        #144 <Field ImageView mIconView>
	//*  28   58:ifnonnull       65
				insertIconView();
	//   29   61:aload_0         
	//   30   62:invokespecial   #316 <Method void insertIconView()>
			if(drawable != null || mPreserveIconSpacing)
	//*  31   65:aload_1         
	//*  32   66:ifnonnull       76
	//*  33   69:aload_0         
	//*  34   70:getfield        #95  <Field boolean mPreserveIconSpacing>
	//*  35   73:ifeq            114
			{
				ImageView imageview = mIconView;
	//   36   76:aload_0         
	//   37   77:getfield        #144 <Field ImageView mIconView>
	//   38   80:astore_3        
				if(!flag)
	//*  39   81:iload_2         
	//*  40   82:ifeq            109
	//*  41   85:aload_3         
	//*  42   86:aload_1         
	//*  43   87:invokevirtual   #266 <Method void ImageView.setImageDrawable(Drawable)>
	//*  44   90:aload_0         
	//*  45   91:getfield        #144 <Field ImageView mIconView>
	//*  46   94:invokevirtual   #317 <Method int ImageView.getVisibility()>
	//*  47   97:ifeq            30
	//*  48  100:aload_0         
	//*  49  101:getfield        #144 <Field ImageView mIconView>
	//*  50  104:iconst_0        
	//*  51  105:invokevirtual   #163 <Method void ImageView.setVisibility(int)>
	//*  52  108:return          
					drawable = null;
	//   53  109:aconst_null     
	//   54  110:astore_1        
				imageview.setImageDrawable(drawable);
				if(mIconView.getVisibility() != 0)
				{
					mIconView.setVisibility(0);
					return;
				}
			} else
	//*  55  111:goto            85
			{
				mIconView.setVisibility(8);
	//   56  114:aload_0         
	//   57  115:getfield        #144 <Field ImageView mIconView>
	//   58  118:bipush          8
	//   59  120:invokevirtual   #163 <Method void ImageView.setVisibility(int)>
				return;
	//   60  123:return          
			}
		}
		return;
	}

	public void setShortcut(boolean flag, char c)
	{
		if(flag && mItemData.shouldShowShortcut())
	//*   0    0:iload_1         
	//*   1    1:ifeq            54
	//*   2    4:aload_0         
	//*   3    5:getfield        #167 <Field MenuItemImpl mItemData>
	//*   4    8:invokevirtual   #195 <Method boolean MenuItemImpl.shouldShowShortcut()>
	//*   5   11:ifeq            54
			c = '\0';
	//    6   14:iconst_0        
	//    7   15:istore_2        
		else
	//*   8   16:iload_2         
	//*   9   17:ifne            34
	//*  10   20:aload_0         
	//*  11   21:getfield        #260 <Field TextView mShortcutView>
	//*  12   24:aload_0         
	//*  13   25:getfield        #167 <Field MenuItemImpl mItemData>
	//*  14   28:invokevirtual   #321 <Method String MenuItemImpl.getShortcutLabel()>
	//*  15   31:invokevirtual   #324 <Method void TextView.setText(CharSequence)>
	//*  16   34:aload_0         
	//*  17   35:getfield        #260 <Field TextView mShortcutView>
	//*  18   38:invokevirtual   #325 <Method int TextView.getVisibility()>
	//*  19   41:iload_2         
	//*  20   42:icmpeq          53
	//*  21   45:aload_0         
	//*  22   46:getfield        #260 <Field TextView mShortcutView>
	//*  23   49:iload_2         
	//*  24   50:invokevirtual   #326 <Method void TextView.setVisibility(int)>
	//*  25   53:return          
			c = '\b';
	//   26   54:bipush          8
	//   27   56:istore_2        
		if(c == 0)
			mShortcutView.setText(((CharSequence) (mItemData.getShortcutLabel())));
		if(mShortcutView.getVisibility() != c)
			mShortcutView.setVisibility(((int) (c)));
	//*  28   57:goto            16
	}

	public void setTitle(CharSequence charsequence)
	{
		if(charsequence != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			mTitleView.setText(charsequence);
	//    2    4:aload_0         
	//    3    5:getfield        #251 <Field TextView mTitleView>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #324 <Method void TextView.setText(CharSequence)>
			if(mTitleView.getVisibility() != 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #251 <Field TextView mTitleView>
	//*   8   16:invokevirtual   #325 <Method int TextView.getVisibility()>
	//*   9   19:ifeq            30
				mTitleView.setVisibility(0);
	//   10   22:aload_0         
	//   11   23:getfield        #251 <Field TextView mTitleView>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #326 <Method void TextView.setVisibility(int)>
		} else
	//*  14   30:return          
		if(mTitleView.getVisibility() != 8)
	//*  15   31:aload_0         
	//*  16   32:getfield        #251 <Field TextView mTitleView>
	//*  17   35:invokevirtual   #325 <Method int TextView.getVisibility()>
	//*  18   38:bipush          8
	//*  19   40:icmpeq          30
		{
			mTitleView.setVisibility(8);
	//   20   43:aload_0         
	//   21   44:getfield        #251 <Field TextView mTitleView>
	//   22   47:bipush          8
	//   23   49:invokevirtual   #326 <Method void TextView.setVisibility(int)>
			return;
	//   24   52:return          
		}
	}

	public boolean showsIcon()
	{
		return mForceShowIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field boolean mForceShowIcon>
	//    2    4:ireturn         
	}

	private static final String TAG = "ListMenuItemView";
	private Drawable mBackground;
	private CheckBox mCheckBox;
	private boolean mForceShowIcon;
	private ImageView mIconView;
	private LayoutInflater mInflater;
	private MenuItemImpl mItemData;
	private int mMenuType;
	private boolean mPreserveIconSpacing;
	private RadioButton mRadioButton;
	private TextView mShortcutView;
	private Drawable mSubMenuArrow;
	private ImageView mSubMenuArrowView;
	private int mTextAppearance;
	private Context mTextAppearanceContext;
	private TextView mTitleView;
}
