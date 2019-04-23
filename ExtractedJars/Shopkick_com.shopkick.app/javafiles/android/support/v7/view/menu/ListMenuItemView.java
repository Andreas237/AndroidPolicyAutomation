// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuItemImpl

public class ListMenuItemView extends LinearLayout
	implements MenuView.ItemView, android.widget.AbsListView.SelectionBoundsAdjuster
{

	public ListMenuItemView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.listMenuViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #52  <Field int android.support.v7.appcompat.R$attr.listMenuViewStyle>
	//    4    6:invokespecial   #55  <Method void ListMenuItemView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ListMenuItemView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #58  <Method void LinearLayout(Context, AttributeSet)>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(getContext(), attributeset, android.support.v7.appcompat.R.styleable.MenuView, i, 0)));
	//    4    6:aload_0         
	//    5    7:invokevirtual   #62  <Method Context getContext()>
	//    6   10:aload_2         
	//    7   11:getstatic       #68  <Field int[] android.support.v7.appcompat.R$styleable.MenuView>
	//    8   14:iload_3         
	//    9   15:iconst_0        
	//   10   16:invokestatic    #74  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   11   19:astore_2        
		mBackground = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.MenuView_android_itemBackground);
	//   12   20:aload_0         
	//   13   21:aload_2         
	//   14   22:getstatic       #77  <Field int android.support.v7.appcompat.R$styleable.MenuView_android_itemBackground>
	//   15   25:invokevirtual   #81  <Method Drawable TintTypedArray.getDrawable(int)>
	//   16   28:putfield        #83  <Field Drawable mBackground>
		mTextAppearance = ((TintTypedArray) (attributeset)).getResourceId(android.support.v7.appcompat.R.styleable.MenuView_android_itemTextAppearance, -1);
	//   17   31:aload_0         
	//   18   32:aload_2         
	//   19   33:getstatic       #86  <Field int android.support.v7.appcompat.R$styleable.MenuView_android_itemTextAppearance>
	//   20   36:iconst_m1       
	//   21   37:invokevirtual   #90  <Method int TintTypedArray.getResourceId(int, int)>
	//   22   40:putfield        #92  <Field int mTextAppearance>
		mPreserveIconSpacing = ((TintTypedArray) (attributeset)).getBoolean(android.support.v7.appcompat.R.styleable.MenuView_preserveIconSpacing, false);
	//   23   43:aload_0         
	//   24   44:aload_2         
	//   25   45:getstatic       #95  <Field int android.support.v7.appcompat.R$styleable.MenuView_preserveIconSpacing>
	//   26   48:iconst_0        
	//   27   49:invokevirtual   #99  <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   28   52:putfield        #101 <Field boolean mPreserveIconSpacing>
		mTextAppearanceContext = context;
	//   29   55:aload_0         
	//   30   56:aload_1         
	//   31   57:putfield        #103 <Field Context mTextAppearanceContext>
		mSubMenuArrow = ((TintTypedArray) (attributeset)).getDrawable(android.support.v7.appcompat.R.styleable.MenuView_subMenuArrow);
	//   32   60:aload_0         
	//   33   61:aload_2         
	//   34   62:getstatic       #106 <Field int android.support.v7.appcompat.R$styleable.MenuView_subMenuArrow>
	//   35   65:invokevirtual   #81  <Method Drawable TintTypedArray.getDrawable(int)>
	//   36   68:putfield        #108 <Field Drawable mSubMenuArrow>
		context = ((Context) (context.getTheme()));
	//   37   71:aload_1         
	//   38   72:invokevirtual   #114 <Method android.content.res.Resources$Theme Context.getTheme()>
	//   39   75:astore_1        
		i = android.support.v7.appcompat.R.attr.dropDownListViewStyle;
	//   40   76:getstatic       #117 <Field int android.support.v7.appcompat.R$attr.dropDownListViewStyle>
	//   41   79:istore_3        
		context = ((Context) (((android.content.res.Resources.Theme) (context)).obtainStyledAttributes(((AttributeSet) (null)), new int[] {
			0x1010129
		}, i, 0)));
	//   42   80:aload_1         
	//   43   81:aconst_null     
	//   44   82:iconst_1        
	//   45   83:newarray        int[]
	//   46   85:dup             
	//   47   86:iconst_0        
	//   48   87:ldc1            #118 <Int 0x1010129>
	//   49   89:iastore         
	//   50   90:iload_3         
	//   51   91:iconst_0        
	//   52   92:invokevirtual   #123 <Method TypedArray android.content.res.Resources$Theme.obtainStyledAttributes(AttributeSet, int[], int, int)>
	//   53   95:astore_1        
		mHasListDivider = ((TypedArray) (context)).hasValue(0);
	//   54   96:aload_0         
	//   55   97:aload_1         
	//   56   98:iconst_0        
	//   57   99:invokevirtual   #129 <Method boolean TypedArray.hasValue(int)>
	//   58  102:putfield        #131 <Field boolean mHasListDivider>
		((TintTypedArray) (attributeset)).recycle();
	//   59  105:aload_2         
	//   60  106:invokevirtual   #135 <Method void TintTypedArray.recycle()>
		((TypedArray) (context)).recycle();
	//   61  109:aload_1         
	//   62  110:invokevirtual   #136 <Method void TypedArray.recycle()>
	//   63  113:return          
	}

	private void addContentView(View view)
	{
		addContentView(view, -1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokespecial   #141 <Method void addContentView(View, int)>
	//    4    6:return          
	}

	private void addContentView(View view, int i)
	{
		LinearLayout linearlayout = mContent;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field LinearLayout mContent>
	//    2    4:astore_3        
		if(linearlayout != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          16
		{
			linearlayout.addView(view, i);
	//    5    9:aload_3         
	//    6   10:aload_1         
	//    7   11:iload_2         
	//    8   12:invokevirtual   #146 <Method void LinearLayout.addView(View, int)>
			return;
	//    9   15:return          
		} else
		{
			addView(view, i);
	//   10   16:aload_0         
	//   11   17:aload_1         
	//   12   18:iload_2         
	//   13   19:invokevirtual   #147 <Method void addView(View, int)>
			return;
	//   14   22:return          
		}
	}

	private LayoutInflater getInflater()
	{
		if(mInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #151 <Field LayoutInflater mInflater>
	//*   2    4:ifnonnull       18
			mInflater = LayoutInflater.from(getContext());
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #62  <Method Context getContext()>
	//    6   12:invokestatic    #157 <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   15:putfield        #151 <Field LayoutInflater mInflater>
		return mInflater;
	//    8   18:aload_0         
	//    9   19:getfield        #151 <Field LayoutInflater mInflater>
	//   10   22:areturn         
	}

	private void insertCheckBox()
	{
		mCheckBox = (CheckBox)getInflater().inflate(android.support.v7.appcompat.R.layout.abc_list_menu_item_checkbox, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #160 <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #165 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_checkbox>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #169 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #171 <Class CheckBox>
	//    8   16:putfield        #173 <Field CheckBox mCheckBox>
		addContentView(((View) (mCheckBox)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #173 <Field CheckBox mCheckBox>
	//   12   24:invokespecial   #175 <Method void addContentView(View)>
	//   13   27:return          
	}

	private void insertIconView()
	{
		mIconView = (ImageView)getInflater().inflate(android.support.v7.appcompat.R.layout.abc_list_menu_item_icon, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #160 <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #179 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_icon>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #169 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #181 <Class ImageView>
	//    8   16:putfield        #183 <Field ImageView mIconView>
		addContentView(((View) (mIconView)), 0);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #183 <Field ImageView mIconView>
	//   12   24:iconst_0        
	//   13   25:invokespecial   #141 <Method void addContentView(View, int)>
	//   14   28:return          
	}

	private void insertRadioButton()
	{
		mRadioButton = (RadioButton)getInflater().inflate(android.support.v7.appcompat.R.layout.abc_list_menu_item_radio, ((android.view.ViewGroup) (this)), false);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokespecial   #160 <Method LayoutInflater getInflater()>
	//    3    5:getstatic       #187 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_radio>
	//    4    8:aload_0         
	//    5    9:iconst_0        
	//    6   10:invokevirtual   #169 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//    7   13:checkcast       #189 <Class RadioButton>
	//    8   16:putfield        #191 <Field RadioButton mRadioButton>
		addContentView(((View) (mRadioButton)));
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #191 <Field RadioButton mRadioButton>
	//   12   24:invokespecial   #175 <Method void addContentView(View)>
	//   13   27:return          
	}

	private void setSubMenuArrowVisible(boolean flag)
	{
		ImageView imageview = mSubMenuArrowView;
	//    0    0:aload_0         
	//    1    1:getfield        #195 <Field ImageView mSubMenuArrowView>
	//    2    4:astore_3        
		if(imageview != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          26
		{
			byte byte0;
			if(flag)
	//*   5    9:iload_1         
	//*   6   10:ifeq            18
				byte0 = 0;
	//    7   13:iconst_0        
	//    8   14:istore_2        
			else
	//*   9   15:goto            21
				byte0 = 8;
	//   10   18:bipush          8
	//   11   20:istore_2        
			imageview.setVisibility(((int) (byte0)));
	//   12   21:aload_3         
	//   13   22:iload_2         
	//   14   23:invokevirtual   #199 <Method void ImageView.setVisibility(int)>
		}
	//   15   26:return          
	}

	public void adjustListItemSelectionBounds(Rect rect)
	{
		ImageView imageview = mGroupDivider;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field ImageView mGroupDivider>
	//    2    4:astore_2        
		if(imageview != null && imageview.getVisibility() == 0)
	//*   3    5:aload_2         
	//*   4    6:ifnull          53
	//*   5    9:aload_2         
	//*   6   10:invokevirtual   #207 <Method int ImageView.getVisibility()>
	//*   7   13:ifne            53
		{
			android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)mGroupDivider.getLayoutParams();
	//    8   16:aload_0         
	//    9   17:getfield        #203 <Field ImageView mGroupDivider>
	//   10   20:invokevirtual   #211 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   11   23:checkcast       #213 <Class android.widget.LinearLayout$LayoutParams>
	//   12   26:astore_2        
			rect.top = rect.top + (mGroupDivider.getHeight() + layoutparams.topMargin + layoutparams.bottomMargin);
	//   13   27:aload_1         
	//   14   28:aload_1         
	//   15   29:getfield        #218 <Field int Rect.top>
	//   16   32:aload_0         
	//   17   33:getfield        #203 <Field ImageView mGroupDivider>
	//   18   36:invokevirtual   #221 <Method int ImageView.getHeight()>
	//   19   39:aload_2         
	//   20   40:getfield        #224 <Field int android.widget.LinearLayout$LayoutParams.topMargin>
	//   21   43:iadd            
	//   22   44:aload_2         
	//   23   45:getfield        #227 <Field int android.widget.LinearLayout$LayoutParams.bottomMargin>
	//   24   48:iadd            
	//   25   49:iadd            
	//   26   50:putfield        #218 <Field int Rect.top>
		}
	//   27   53:return          
	}

	public MenuItemImpl getItemData()
	{
		return mItemData;
	//    0    0:aload_0         
	//    1    1:getfield        #231 <Field MenuItemImpl mItemData>
	//    2    4:areturn         
	}

	public void initialize(MenuItemImpl menuitemimpl, int i)
	{
		mItemData = menuitemimpl;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #231 <Field MenuItemImpl mItemData>
		mMenuType = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #235 <Field int mMenuType>
		if(menuitemimpl.isVisible())
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #241 <Method boolean MenuItemImpl.isVisible()>
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
	//   16   27:invokevirtual   #242 <Method void setVisibility(int)>
		setTitle(menuitemimpl.getTitleForItemView(((MenuView.ItemView) (this))));
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:aload_0         
	//   20   33:invokevirtual   #246 <Method CharSequence MenuItemImpl.getTitleForItemView(MenuView$ItemView)>
	//   21   36:invokevirtual   #250 <Method void setTitle(CharSequence)>
		setCheckable(menuitemimpl.isCheckable());
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:invokevirtual   #253 <Method boolean MenuItemImpl.isCheckable()>
	//   25   44:invokevirtual   #256 <Method void setCheckable(boolean)>
		setShortcut(menuitemimpl.shouldShowShortcut(), menuitemimpl.getShortcut());
	//   26   47:aload_0         
	//   27   48:aload_1         
	//   28   49:invokevirtual   #259 <Method boolean MenuItemImpl.shouldShowShortcut()>
	//   29   52:aload_1         
	//   30   53:invokevirtual   #263 <Method char MenuItemImpl.getShortcut()>
	//   31   56:invokevirtual   #267 <Method void setShortcut(boolean, char)>
		setIcon(menuitemimpl.getIcon());
	//   32   59:aload_0         
	//   33   60:aload_1         
	//   34   61:invokevirtual   #271 <Method Drawable MenuItemImpl.getIcon()>
	//   35   64:invokevirtual   #275 <Method void setIcon(Drawable)>
		setEnabled(menuitemimpl.isEnabled());
	//   36   67:aload_0         
	//   37   68:aload_1         
	//   38   69:invokevirtual   #278 <Method boolean MenuItemImpl.isEnabled()>
	//   39   72:invokevirtual   #281 <Method void setEnabled(boolean)>
		setSubMenuArrowVisible(menuitemimpl.hasSubMenu());
	//   40   75:aload_0         
	//   41   76:aload_1         
	//   42   77:invokevirtual   #284 <Method boolean MenuItemImpl.hasSubMenu()>
	//   43   80:invokespecial   #286 <Method void setSubMenuArrowVisible(boolean)>
		setContentDescription(menuitemimpl.getContentDescription());
	//   44   83:aload_0         
	//   45   84:aload_1         
	//   46   85:invokevirtual   #290 <Method CharSequence MenuItemImpl.getContentDescription()>
	//   47   88:invokevirtual   #293 <Method void setContentDescription(CharSequence)>
	//   48   91:return          
	}

	protected void onFinishInflate()
	{
		super.onFinishInflate();
	//    0    0:aload_0         
	//    1    1:invokespecial   #296 <Method void LinearLayout.onFinishInflate()>
		ViewCompat.setBackground(((View) (this)), mBackground);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #83  <Field Drawable mBackground>
	//    5    9:invokestatic    #302 <Method void ViewCompat.setBackground(View, Drawable)>
		mTitleView = (TextView)findViewById(android.support.v7.appcompat.R.id.title);
	//    6   12:aload_0         
	//    7   13:aload_0         
	//    8   14:getstatic       #307 <Field int android.support.v7.appcompat.R$id.title>
	//    9   17:invokevirtual   #311 <Method View findViewById(int)>
	//   10   20:checkcast       #313 <Class TextView>
	//   11   23:putfield        #315 <Field TextView mTitleView>
		int i = mTextAppearance;
	//   12   26:aload_0         
	//   13   27:getfield        #92  <Field int mTextAppearance>
	//   14   30:istore_1        
		if(i != -1)
	//*  15   31:iload_1         
	//*  16   32:iconst_m1       
	//*  17   33:icmpeq          48
			mTitleView.setTextAppearance(mTextAppearanceContext, i);
	//   18   36:aload_0         
	//   19   37:getfield        #315 <Field TextView mTitleView>
	//   20   40:aload_0         
	//   21   41:getfield        #103 <Field Context mTextAppearanceContext>
	//   22   44:iload_1         
	//   23   45:invokevirtual   #319 <Method void TextView.setTextAppearance(Context, int)>
		mShortcutView = (TextView)findViewById(android.support.v7.appcompat.R.id.shortcut);
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getstatic       #322 <Field int android.support.v7.appcompat.R$id.shortcut>
	//   27   53:invokevirtual   #311 <Method View findViewById(int)>
	//   28   56:checkcast       #313 <Class TextView>
	//   29   59:putfield        #324 <Field TextView mShortcutView>
		mSubMenuArrowView = (ImageView)findViewById(android.support.v7.appcompat.R.id.submenuarrow);
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:getstatic       #327 <Field int android.support.v7.appcompat.R$id.submenuarrow>
	//   33   67:invokevirtual   #311 <Method View findViewById(int)>
	//   34   70:checkcast       #181 <Class ImageView>
	//   35   73:putfield        #195 <Field ImageView mSubMenuArrowView>
		ImageView imageview = mSubMenuArrowView;
	//   36   76:aload_0         
	//   37   77:getfield        #195 <Field ImageView mSubMenuArrowView>
	//   38   80:astore_2        
		if(imageview != null)
	//*  39   81:aload_2         
	//*  40   82:ifnull          93
			imageview.setImageDrawable(mSubMenuArrow);
	//   41   85:aload_2         
	//   42   86:aload_0         
	//   43   87:getfield        #108 <Field Drawable mSubMenuArrow>
	//   44   90:invokevirtual   #330 <Method void ImageView.setImageDrawable(Drawable)>
		mGroupDivider = (ImageView)findViewById(android.support.v7.appcompat.R.id.group_divider);
	//   45   93:aload_0         
	//   46   94:aload_0         
	//   47   95:getstatic       #333 <Field int android.support.v7.appcompat.R$id.group_divider>
	//   48   98:invokevirtual   #311 <Method View findViewById(int)>
	//   49  101:checkcast       #181 <Class ImageView>
	//   50  104:putfield        #203 <Field ImageView mGroupDivider>
		mContent = (LinearLayout)findViewById(android.support.v7.appcompat.R.id.content);
	//   51  107:aload_0         
	//   52  108:aload_0         
	//   53  109:getstatic       #336 <Field int android.support.v7.appcompat.R$id.content>
	//   54  112:invokevirtual   #311 <Method View findViewById(int)>
	//   55  115:checkcast       #4   <Class LinearLayout>
	//   56  118:putfield        #143 <Field LinearLayout mContent>
	//   57  121:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(mIconView != null && mPreserveIconSpacing)
	//*   0    0:aload_0         
	//*   1    1:getfield        #183 <Field ImageView mIconView>
	//*   2    4:ifnull          55
	//*   3    7:aload_0         
	//*   4    8:getfield        #101 <Field boolean mPreserveIconSpacing>
	//*   5   11:ifeq            55
		{
			android.view.ViewGroup.LayoutParams layoutparams = getLayoutParams();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #339 <Method android.view.ViewGroup$LayoutParams getLayoutParams()>
	//    8   18:astore_3        
			android.widget.LinearLayout.LayoutParams layoutparams1 = (android.widget.LinearLayout.LayoutParams)mIconView.getLayoutParams();
	//    9   19:aload_0         
	//   10   20:getfield        #183 <Field ImageView mIconView>
	//   11   23:invokevirtual   #211 <Method android.view.ViewGroup$LayoutParams ImageView.getLayoutParams()>
	//   12   26:checkcast       #213 <Class android.widget.LinearLayout$LayoutParams>
	//   13   29:astore          4
			if(layoutparams.height > 0 && layoutparams1.width <= 0)
	//*  14   31:aload_3         
	//*  15   32:getfield        #344 <Field int android.view.ViewGroup$LayoutParams.height>
	//*  16   35:ifle            55
	//*  17   38:aload           4
	//*  18   40:getfield        #347 <Field int android.widget.LinearLayout$LayoutParams.width>
	//*  19   43:ifgt            55
				layoutparams1.width = layoutparams.height;
	//   20   46:aload           4
	//   21   48:aload_3         
	//   22   49:getfield        #344 <Field int android.view.ViewGroup$LayoutParams.height>
	//   23   52:putfield        #347 <Field int android.widget.LinearLayout$LayoutParams.width>
		}
		super.onMeasure(i, j);
	//   24   55:aload_0         
	//   25   56:iload_1         
	//   26   57:iload_2         
	//   27   58:invokespecial   #349 <Method void LinearLayout.onMeasure(int, int)>
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
	//*   3    5:getfield        #191 <Field RadioButton mRadioButton>
	//*   4    8:ifnonnull       19
	//*   5   11:aload_0         
	//*   6   12:getfield        #173 <Field CheckBox mCheckBox>
	//*   7   15:ifnonnull       19
			return;
	//    8   18:return          
		Object obj;
		Object obj2;
		if(mItemData.isExclusiveCheckable())
	//*   9   19:aload_0         
	//*  10   20:getfield        #231 <Field MenuItemImpl mItemData>
	//*  11   23:invokevirtual   #353 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*  12   26:ifeq            53
		{
			if(mRadioButton == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #191 <Field RadioButton mRadioButton>
	//*  15   33:ifnonnull       40
				insertRadioButton();
	//   16   36:aload_0         
	//   17   37:invokespecial   #355 <Method void insertRadioButton()>
			obj = ((Object) (mRadioButton));
	//   18   40:aload_0         
	//   19   41:getfield        #191 <Field RadioButton mRadioButton>
	//   20   44:astore_2        
			obj2 = ((Object) (mCheckBox));
	//   21   45:aload_0         
	//   22   46:getfield        #173 <Field CheckBox mCheckBox>
	//   23   49:astore_3        
		} else
	//*  24   50:goto            74
		{
			if(mCheckBox == null)
	//*  25   53:aload_0         
	//*  26   54:getfield        #173 <Field CheckBox mCheckBox>
	//*  27   57:ifnonnull       64
				insertCheckBox();
	//   28   60:aload_0         
	//   29   61:invokespecial   #357 <Method void insertCheckBox()>
			obj = ((Object) (mCheckBox));
	//   30   64:aload_0         
	//   31   65:getfield        #173 <Field CheckBox mCheckBox>
	//   32   68:astore_2        
			obj2 = ((Object) (mRadioButton));
	//   33   69:aload_0         
	//   34   70:getfield        #191 <Field RadioButton mRadioButton>
	//   35   73:astore_3        
		}
		if(flag)
	//*  36   74:iload_1         
	//*  37   75:ifeq            121
		{
			((CompoundButton) (obj)).setChecked(mItemData.isChecked());
	//   38   78:aload_2         
	//   39   79:aload_0         
	//   40   80:getfield        #231 <Field MenuItemImpl mItemData>
	//   41   83:invokevirtual   #360 <Method boolean MenuItemImpl.isChecked()>
	//   42   86:invokevirtual   #365 <Method void CompoundButton.setChecked(boolean)>
			if(((CompoundButton) (obj)).getVisibility() != 0)
	//*  43   89:aload_2         
	//*  44   90:invokevirtual   #366 <Method int CompoundButton.getVisibility()>
	//*  45   93:ifeq            101
				((CompoundButton) (obj)).setVisibility(0);
	//   46   96:aload_2         
	//   47   97:iconst_0        
	//   48   98:invokevirtual   #367 <Method void CompoundButton.setVisibility(int)>
			if(obj2 != null && ((CompoundButton) (obj2)).getVisibility() != 8)
	//*  49  101:aload_3         
	//*  50  102:ifnull          151
	//*  51  105:aload_3         
	//*  52  106:invokevirtual   #366 <Method int CompoundButton.getVisibility()>
	//*  53  109:bipush          8
	//*  54  111:icmpeq          151
			{
				((CompoundButton) (obj2)).setVisibility(8);
	//   55  114:aload_3         
	//   56  115:bipush          8
	//   57  117:invokevirtual   #367 <Method void CompoundButton.setVisibility(int)>
				return;
	//   58  120:return          
			}
		} else
		{
			Object obj1 = ((Object) (mCheckBox));
	//   59  121:aload_0         
	//   60  122:getfield        #173 <Field CheckBox mCheckBox>
	//   61  125:astore_2        
			if(obj1 != null)
	//*  62  126:aload_2         
	//*  63  127:ifnull          136
				((CheckBox) (obj1)).setVisibility(8);
	//   64  130:aload_2         
	//   65  131:bipush          8
	//   66  133:invokevirtual   #368 <Method void CheckBox.setVisibility(int)>
			obj1 = ((Object) (mRadioButton));
	//   67  136:aload_0         
	//   68  137:getfield        #191 <Field RadioButton mRadioButton>
	//   69  140:astore_2        
			if(obj1 != null)
	//*  70  141:aload_2         
	//*  71  142:ifnull          151
				((RadioButton) (obj1)).setVisibility(8);
	//   72  145:aload_2         
	//   73  146:bipush          8
	//   74  148:invokevirtual   #369 <Method void RadioButton.setVisibility(int)>
		}
	//   75  151:return          
	}

	public void setChecked(boolean flag)
	{
		Object obj;
		if(mItemData.isExclusiveCheckable())
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field MenuItemImpl mItemData>
	//*   2    4:invokevirtual   #353 <Method boolean MenuItemImpl.isExclusiveCheckable()>
	//*   3    7:ifeq            29
		{
			if(mRadioButton == null)
	//*   4   10:aload_0         
	//*   5   11:getfield        #191 <Field RadioButton mRadioButton>
	//*   6   14:ifnonnull       21
				insertRadioButton();
	//    7   17:aload_0         
	//    8   18:invokespecial   #355 <Method void insertRadioButton()>
			obj = ((Object) (mRadioButton));
	//    9   21:aload_0         
	//   10   22:getfield        #191 <Field RadioButton mRadioButton>
	//   11   25:astore_2        
		} else
	//*  12   26:goto            45
		{
			if(mCheckBox == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #173 <Field CheckBox mCheckBox>
	//*  15   33:ifnonnull       40
				insertCheckBox();
	//   16   36:aload_0         
	//   17   37:invokespecial   #357 <Method void insertCheckBox()>
			obj = ((Object) (mCheckBox));
	//   18   40:aload_0         
	//   19   41:getfield        #173 <Field CheckBox mCheckBox>
	//   20   44:astore_2        
		}
		((CompoundButton) (obj)).setChecked(flag);
	//   21   45:aload_2         
	//   22   46:iload_1         
	//   23   47:invokevirtual   #365 <Method void CompoundButton.setChecked(boolean)>
	//   24   50:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #372 <Field boolean mForceShowIcon>
		mPreserveIconSpacing = flag;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #101 <Field boolean mPreserveIconSpacing>
	//    6   10:return          
	}

	public void setGroupDividerEnabled(boolean flag)
	{
		ImageView imageview = mGroupDivider;
	//    0    0:aload_0         
	//    1    1:getfield        #203 <Field ImageView mGroupDivider>
	//    2    4:astore_3        
		if(imageview != null)
	//*   3    5:aload_3         
	//*   4    6:ifnull          33
		{
			byte byte0;
			if(!mHasListDivider && flag)
	//*   5    9:aload_0         
	//*   6   10:getfield        #131 <Field boolean mHasListDivider>
	//*   7   13:ifne            25
	//*   8   16:iload_1         
	//*   9   17:ifeq            25
				byte0 = 0;
	//   10   20:iconst_0        
	//   11   21:istore_2        
			else
	//*  12   22:goto            28
				byte0 = 8;
	//   13   25:bipush          8
	//   14   27:istore_2        
			imageview.setVisibility(((int) (byte0)));
	//   15   28:aload_3         
	//   16   29:iload_2         
	//   17   30:invokevirtual   #199 <Method void ImageView.setVisibility(int)>
		}
	//   18   33:return          
	}

	public void setIcon(Drawable drawable)
	{
		boolean flag;
		if(!mItemData.shouldShowIcon() && !mForceShowIcon)
	//*   0    0:aload_0         
	//*   1    1:getfield        #231 <Field MenuItemImpl mItemData>
	//*   2    4:invokevirtual   #376 <Method boolean MenuItemImpl.shouldShowIcon()>
	//*   3    7:ifne            25
	//*   4   10:aload_0         
	//*   5   11:getfield        #372 <Field boolean mForceShowIcon>
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
	//*  16   32:getfield        #101 <Field boolean mPreserveIconSpacing>
	//*  17   35:ifne            39
			return;
	//   18   38:return          
		if(mIconView == null && drawable == null && !mPreserveIconSpacing)
	//*  19   39:aload_0         
	//*  20   40:getfield        #183 <Field ImageView mIconView>
	//*  21   43:ifnonnull       58
	//*  22   46:aload_1         
	//*  23   47:ifnonnull       58
	//*  24   50:aload_0         
	//*  25   51:getfield        #101 <Field boolean mPreserveIconSpacing>
	//*  26   54:ifne            58
			return;
	//   27   57:return          
		if(mIconView == null)
	//*  28   58:aload_0         
	//*  29   59:getfield        #183 <Field ImageView mIconView>
	//*  30   62:ifnonnull       69
			insertIconView();
	//   31   65:aload_0         
	//   32   66:invokespecial   #378 <Method void insertIconView()>
		if(drawable == null && !mPreserveIconSpacing)
	//*  33   69:aload_1         
	//*  34   70:ifnonnull       93
	//*  35   73:aload_0         
	//*  36   74:getfield        #101 <Field boolean mPreserveIconSpacing>
	//*  37   77:ifeq            83
	//*  38   80:goto            93
		{
			mIconView.setVisibility(8);
	//   39   83:aload_0         
	//   40   84:getfield        #183 <Field ImageView mIconView>
	//   41   87:bipush          8
	//   42   89:invokevirtual   #199 <Method void ImageView.setVisibility(int)>
			return;
	//   43   92:return          
		}
		ImageView imageview = mIconView;
	//   44   93:aload_0         
	//   45   94:getfield        #183 <Field ImageView mIconView>
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
	//   54  109:invokevirtual   #330 <Method void ImageView.setImageDrawable(Drawable)>
		if(mIconView.getVisibility() != 0)
	//*  55  112:aload_0         
	//*  56  113:getfield        #183 <Field ImageView mIconView>
	//*  57  116:invokevirtual   #207 <Method int ImageView.getVisibility()>
	//*  58  119:ifeq            130
			mIconView.setVisibility(0);
	//   59  122:aload_0         
	//   60  123:getfield        #183 <Field ImageView mIconView>
	//   61  126:iconst_0        
	//   62  127:invokevirtual   #199 <Method void ImageView.setVisibility(int)>
	//   63  130:return          
	}

	public void setShortcut(boolean flag, char c)
	{
		if(flag && mItemData.shouldShowShortcut())
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
	//*   2    4:aload_0         
	//*   3    5:getfield        #231 <Field MenuItemImpl mItemData>
	//*   4    8:invokevirtual   #259 <Method boolean MenuItemImpl.shouldShowShortcut()>
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
	//   14   27:getfield        #324 <Field TextView mShortcutView>
	//   15   30:aload_0         
	//   16   31:getfield        #231 <Field MenuItemImpl mItemData>
	//   17   34:invokevirtual   #382 <Method String MenuItemImpl.getShortcutLabel()>
	//   18   37:invokevirtual   #385 <Method void TextView.setText(CharSequence)>
		if(mShortcutView.getVisibility() != c)
	//*  19   40:aload_0         
	//*  20   41:getfield        #324 <Field TextView mShortcutView>
	//*  21   44:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*  22   47:iload_2         
	//*  23   48:icmpeq          59
			mShortcutView.setVisibility(((int) (c)));
	//   24   51:aload_0         
	//   25   52:getfield        #324 <Field TextView mShortcutView>
	//   26   55:iload_2         
	//   27   56:invokevirtual   #387 <Method void TextView.setVisibility(int)>
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
	//    3    5:getfield        #315 <Field TextView mTitleView>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #385 <Method void TextView.setText(CharSequence)>
			if(mTitleView.getVisibility() != 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #315 <Field TextView mTitleView>
	//*   8   16:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*   9   19:ifeq            52
			{
				mTitleView.setVisibility(0);
	//   10   22:aload_0         
	//   11   23:getfield        #315 <Field TextView mTitleView>
	//   12   26:iconst_0        
	//   13   27:invokevirtual   #387 <Method void TextView.setVisibility(int)>
				return;
	//   14   30:return          
			}
		} else
		if(mTitleView.getVisibility() != 8)
	//*  15   31:aload_0         
	//*  16   32:getfield        #315 <Field TextView mTitleView>
	//*  17   35:invokevirtual   #386 <Method int TextView.getVisibility()>
	//*  18   38:bipush          8
	//*  19   40:icmpeq          52
			mTitleView.setVisibility(8);
	//   20   43:aload_0         
	//   21   44:getfield        #315 <Field TextView mTitleView>
	//   22   47:bipush          8
	//   23   49:invokevirtual   #387 <Method void TextView.setVisibility(int)>
	//   24   52:return          
	}

	public boolean showsIcon()
	{
		return mForceShowIcon;
	//    0    0:aload_0         
	//    1    1:getfield        #372 <Field boolean mForceShowIcon>
	//    2    4:ireturn         
	}

	private static final String TAG = "ListMenuItemView";
	private Drawable mBackground;
	private CheckBox mCheckBox;
	private LinearLayout mContent;
	private boolean mForceShowIcon;
	private ImageView mGroupDivider;
	private boolean mHasListDivider;
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
