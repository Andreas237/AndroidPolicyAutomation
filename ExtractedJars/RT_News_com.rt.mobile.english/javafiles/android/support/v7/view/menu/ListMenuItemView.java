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
	//*   2    4:ifnull          29
		{
			ImageView imageview = mSubMenuArrowView;
	//    3    7:aload_0         
	//    4    8:getfield        #159 <Field ImageView mSubMenuArrowView>
	//    5   11:astore_3        
			byte byte0;
			if(flag)
	//*   6   12:iload_1         
	//*   7   13:ifeq            21
				byte0 = 0;
	//    8   16:iconst_0        
	//    9   17:istore_2        
			else
	//*  10   18:goto            24
				byte0 = 8;
	//   11   21:bipush          8
	//   12   23:istore_2        
			imageview.setVisibility(((int) (byte0)));
	//   13   24:aload_3         
	//   14   25:iload_2         
	//   15   26:invokevirtual   #163 <Method void ImageView.setVisibility(int)>
		}
	//   16   29:return          
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
	//*   8   14:ifeq            22
			i = 0;
	//    9   17:iconst_0        
	//   10   18:istore_2        
		else
	//*  11   19:goto            25
			i = 8;
	//   12   22:bipush          8
	//   13   24:istore_2        
		setVisibility(i);
	//   14   25:aload_0         
	//   15   26:iload_2         
	//   16   27:invokevirtual   #178 <Method void setVisibility(int)>
		setTitle(menuitemimpl.getTitleForItemView(((MenuView.ItemView) (this))));
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:aload_0         
	//   20   33:invokevirtual   #182 <Method CharSequence MenuItemImpl.getTitleForItemView(MenuView$ItemView)>
	//   21   36:invokevirtual   #186 <Method void setTitle(CharSequence)>
		setCheckable(menuitemimpl.isCheckable());
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:invokevirtual   #189 <Method boolean MenuItemImpl.isCheckable()>
	//   25   44:invokevirtual   #192 <Method void setCheckable(boolean)>
		setShortcut(menuitemimpl.shouldShowShortcut(), menuitemimpl.getShortcut());
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:invokevirtual   #195 <Method boolean MenuItemImpl.shouldShowShortcut()>
	//   29   52:aload_1         
	//   30   53:invokevirtual   #199 <Method char MenuItemImpl.getShortcut()>
	//   31   56:invokevirtual   #203 <Method void setShortcut(boolean, char)>
		setIcon(menuitemimpl.getIcon());
	//   32   59:aload_0         
	//   33   60:aload_1         
	//   34   61:invokevirtual   #207 <Method Drawable MenuItemImpl.getIcon()>
	//   35   64:invokevirtual   #211 <Method void setIcon(Drawable)>
		setEnabled(menuitemimpl.isEnabled());
	//   36   67:aload_0         
	//   37   68:aload_1         
	//   38   69:invokevirtual   #214 <Method boolean MenuItemImpl.isEnabled()>
	//   39   72:invokevirtual   #217 <Method void setEnabled(boolean)>
		setSubMenuArrowVisible(menuitemimpl.hasSubMenu());
	//   40   75:aload_0         
	//   41   76:aload_1         
	//   42   77:invokevirtual   #220 <Method boolean MenuItemImpl.hasSubMenu()>
	//   43   80:invokespecial   #222 <Method void setSubMenuArrowVisible(boolean)>
		setContentDescription(menuitemimpl.getContentDescription());
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:invokevirtual   #226 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   47   88:invokevirtual   #229 <Method void setContentDescription(CharSequence)>
	//   48   91:return          
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
		if(!flag && mRadioButton == null && mCheckBox == null)
	//*   0    0:iload_1         
	//*   1    1:ifne            19
	//*   2    4:aload_0         
	//*   3    5:getfield        #155 <Field RadioButton mRadioButton>
	//*   4    8:ifnonnull       19
	//*   5   11:aload_0         
	//*   6   12:getfield        #132 <Field CheckBox mCheckBox>
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		Object obj;
		Object obj1;
		if(mItemData.isExclusiveCheckable())
	//*   9   19:aload_0         
	//*  10   20:getfield        #167 <Field MenuItemImpl mItemData>
	//*  11   23:invokevirtual   #289 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*  12   26:ifeq            54
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
	//*  24   51:goto            76
		{
			if(mCheckBox == null)
	//*  25   54:aload_0         
	//*  26   55:getfield        #132 <Field CheckBox mCheckBox>
	//*  27   58:ifnonnull       65
				insertCheckBox();
	//   28   61:aload_0         
	//   29   62:invokespecial   #293 <Method void insertCheckBox()>
			obj = ((Object) (mCheckBox));
	//   30   65:aload_0         
	//   31   66:getfield        #132 <Field CheckBox mCheckBox>
	//   32   69:astore_3        
			obj1 = ((Object) (mRadioButton));
	//   33   70:aload_0         
	//   34   71:getfield        #155 <Field RadioButton mRadioButton>
	//   35   74:astore          4
		}
		if(flag)
	//*  36   76:iload_1         
	//*  37   77:ifeq            139
		{
			((CompoundButton) (obj)).setChecked(mItemData.isChecked());
	//   38   80:aload_3         
	//   39   81:aload_0         
	//   40   82:getfield        #167 <Field MenuItemImpl mItemData>
	//   41   85:invokevirtual   #296 <Method boolean MenuItemImpl.isChecked()>
	//   42   88:invokevirtual   #301 <Method void CompoundButton.setChecked(boolean)>
			byte byte0;
			if(flag)
	//*  43   91:iload_1         
	//*  44   92:ifeq            100
				byte0 = 0;
	//   45   95:iconst_0        
	//   46   96:istore_2        
			else
	//*  47   97:goto            103
				byte0 = 8;
	//   48  100:bipush          8
	//   49  102:istore_2        
			if(((CompoundButton) (obj)).getVisibility() != byte0)
	//*  50  103:aload_3         
	//*  51  104:invokevirtual   #305 <Method int CompoundButton.getVisibility()>
	//*  52  107:iload_2         
	//*  53  108:icmpeq          116
				((CompoundButton) (obj)).setVisibility(((int) (byte0)));
	//   54  111:aload_3         
	//   55  112:iload_2         
	//   56  113:invokevirtual   #306 <Method void CompoundButton.setVisibility(int)>
			if(obj1 != null && ((CompoundButton) (obj1)).getVisibility() != 8)
	//*  57  116:aload           4
	//*  58  118:ifnull          171
	//*  59  121:aload           4
	//*  60  123:invokevirtual   #305 <Method int CompoundButton.getVisibility()>
	//*  61  126:bipush          8
	//*  62  128:icmpeq          171
			{
				((CompoundButton) (obj1)).setVisibility(8);
	//   63  131:aload           4
	//   64  133:bipush          8
	//   65  135:invokevirtual   #306 <Method void CompoundButton.setVisibility(int)>
				return;
	//   66  138:return          
			}
		} else
		{
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
	//*  76  159:ifnull          171
				mRadioButton.setVisibility(8);
	//   77  162:aload_0         
	//   78  163:getfield        #155 <Field RadioButton mRadioButton>
	//   79  166:bipush          8
	//   80  168:invokevirtual   #308 <Method void RadioButton.setVisibility(int)>
		}
	//   81  171:return          
	}

	public void setChecked(boolean flag)
	{
		Object obj;
		if(mItemData.isExclusiveCheckable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field MenuItemImpl mItemData>
	//*   2    4:invokevirtual   #289 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*   3    7:ifeq            29
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
	//*  12   26:goto            45
		{
			if(mCheckBox == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #132 <Field CheckBox mCheckBox>
	//*  15   33:ifnonnull       40
				insertCheckBox();
	//   16   36:aload_0         
	//   17   37:invokespecial   #293 <Method void insertCheckBox()>
			obj = ((Object) (mCheckBox));
	//   18   40:aload_0         
	//   19   41:getfield        #132 <Field CheckBox mCheckBox>
	//   20   44:astore_2        
		}
		((CompoundButton) (obj)).setChecked(flag);
	//   21   45:aload_2         
	//   22   46:iload_1         
	//   23   47:invokevirtual   #301 <Method void CompoundButton.setChecked(boolean)>
	//   24   50:return          
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
		if(!mItemData.shouldShowIcon() && !mForceShowIcon)
	//*   0    0:aload_0         
	//*   1    1:getfield        #167 <Field MenuItemImpl mItemData>
	//*   2    4:invokevirtual   #314 <Method boolean MenuItemImpl.shouldShowIcon()>
	//*   3    7:ifne            25
	//*   4   10:aload_0         
	//*   5   11:getfield        #311 <Field boolean mForceShowIcon>
	//*   6   14:ifeq            20
	//*   7   17:goto            25
			flag = false;
	//    8   20:iconst_0        
	//    9   21:istore_2        
		else
	//*  10   22:goto            27
			flag = true;
	//   11   25:iconst_1        
	//   12   26:istore_2        
		if(!flag && !mPreserveIconSpacing)
	//*  13   27:iload_2         
	//*  14   28:ifne            39
	//*  15   31:aload_0         
	//*  16   32:getfield        #95  <Field boolean mPreserveIconSpacing>
	//*  17   35:ifne            39
			return;
	//   18   38:return          
		if(mIconView == null && drawable == null && !mPreserveIconSpacing)
	//*  19   39:aload_0         
	//*  20   40:getfield        #144 <Field ImageView mIconView>
	//*  21   43:ifnonnull       58
	//*  22   46:aload_1         
	//*  23   47:ifnonnull       58
	//*  24   50:aload_0         
	//*  25   51:getfield        #95  <Field boolean mPreserveIconSpacing>
	//*  26   54:ifne            58
			return;
	//   27   57:return          
		if(mIconView == null)
	//*  28   58:aload_0         
	//*  29   59:getfield        #144 <Field ImageView mIconView>
	//*  30   62:ifnonnull       69
			insertIconView();
	//   31   65:aload_0         
	//   32   66:invokespecial   #316 <Method void insertIconView()>
		if(drawable == null && !mPreserveIconSpacing)
	//*  33   69:aload_1         
	//*  34   70:ifnonnull       93
	//*  35   73:aload_0         
	//*  36   74:getfield        #95  <Field boolean mPreserveIconSpacing>
	//*  37   77:ifeq            83
	//*  38   80:goto            93
		{
			mIconView.setVisibility(8);
	//   39   83:aload_0         
	//   40   84:getfield        #144 <Field ImageView mIconView>
	//   41   87:bipush          8
	//   42   89:invokevirtual   #163 <Method void ImageView.setVisibility(int)>
			return;
	//   43   92:return          
		}
		ImageView imageview = mIconView;
	//   44   93:aload_0         
	//   45   94:getfield        #144 <Field ImageView mIconView>
	//   46   97:astore_3        
		if(!flag)
	//*  47   98:iload_2         
	//*  48   99:ifeq            105
	//*  49  102:goto            107
			drawable = null;
	//   50  105:aconst_null     
	//   51  106:astore_1        
		imageview.setImageDrawable(drawable);
	//   52  107:aload_3         
	//   53  108:aload_1         
	//   54  109:invokevirtual   #266 <Method void ImageView.setImageDrawable(Drawable)>
		if(mIconView.getVisibility() != 0)
	//*  55  112:aload_0         
	//*  56  113:getfield        #144 <Field ImageView mIconView>
	//*  57  116:invokevirtual   #317 <Method int ImageView.getVisibility()>
	//*  58  119:ifeq            130
			mIconView.setVisibility(0);
	//   59  122:aload_0         
	//   60  123:getfield        #144 <Field ImageView mIconView>
	//   61  126:iconst_0        
	//   62  127:invokevirtual   #163 <Method void ImageView.setVisibility(int)>
	//   63  130:return          
	}

	public void setShortcut(boolean flag, char c)
	{
		if(flag && mItemData.shouldShowShortcut())
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
	//*   2    4:aload_0         
	//*   3    5:getfield        #167 <Field MenuItemImpl mItemData>
	//*   4    8:invokevirtual   #195 <Method boolean MenuItemImpl.shouldShowShortcut()>
	//*   5   11:ifeq            19
			c = '\0';
	//    6   14:iconst_0        
	//    7   15:istore_2        
		else
	//*   8   16:goto            22
			c = '\b';
	//    9   19:bipush          8
	//   10   21:istore_2        
		if(c == 0)
	//*  11   22:iload_2         
	//*  12   23:ifne            40
			mShortcutView.setText(((CharSequence) (mItemData.getShortcutLabel())));
	//   13   26:aload_0         
	//   14   27:getfield        #260 <Field TextView mShortcutView>
	//   15   30:aload_0         
	//   16   31:getfield        #167 <Field MenuItemImpl mItemData>
	//   17   34:invokevirtual   #321 <Method String MenuItemImpl.getShortcutLabel()>
	//   18   37:invokevirtual   #324 <Method void TextView.setText(CharSequence)>
		if(mShortcutView.getVisibility() != c)
	//*  19   40:aload_0         
	//*  20   41:getfield        #260 <Field TextView mShortcutView>
	//*  21   44:invokevirtual   #325 <Method int TextView.getVisibility()>
	//*  22   47:iload_2         
	//*  23   48:icmpeq          59
			mShortcutView.setVisibility(((int) (c)));
	//   24   51:aload_0         
	//   25   52:getfield        #260 <Field TextView mShortcutView>
	//   26   55:iload_2         
	//   27   56:invokevirtual   #326 <Method void TextView.setVisibility(int)>
	//   28   59:return          
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
	//*   9   19:ifeq            52
			{
				mTitleView.setVisibility(0);
	//   10   22:aload_0         
	//   11   23:getfield        #251 <Field TextView mTitleView>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #326 <Method void TextView.setVisibility(int)>
				return;
	//   14   30:return          
			}
		} else
		if(mTitleView.getVisibility() != 8)
	//*  15   31:aload_0         
	//*  16   32:getfield        #251 <Field TextView mTitleView>
	//*  17   35:invokevirtual   #325 <Method int TextView.getVisibility()>
	//*  18   38:bipush          8
	//*  19   40:icmpeq          52
			mTitleView.setVisibility(8);
	//   20   43:aload_0         
	//   21   44:getfield        #251 <Field TextView mTitleView>
	//   22   47:bipush          8
	//   23   49:invokevirtual   #326 <Method void TextView.setVisibility(int)>
	//   24   52:return          
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
