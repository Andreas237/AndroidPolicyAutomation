// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.*;
import android.support.design.internal.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.view.*;
import android.widget.FrameLayout;

public class BottomNavigationView extends FrameLayout
{
	public static interface OnNavigationItemReselectedListener
	{

		public abstract void onNavigationItemReselected(MenuItem menuitem);
	}

	public static interface OnNavigationItemSelectedListener
	{

		public abstract boolean onNavigationItemSelected(MenuItem menuitem);
	}

	static class SavedState extends AbsSavedState
	{

		private void readFromParcel(Parcel parcel, ClassLoader classloader)
		{
			menuPresenterState = parcel.readBundle(classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokevirtual   #37  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    4    6:putfield        #39  <Field Bundle menuPresenterState>
		//    5    9:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #44  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(menuPresenterState);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #39  <Field Bundle menuPresenterState>
		//    7   11:invokevirtual   #48  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class BottomNavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomNavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method BottomNavigationView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method BottomNavigationView$SavedState createFromParcel(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] newArray(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public volatile Object[] newArray(int i)
			{
				return ((Object []) (newArray(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #34  <Method BottomNavigationView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		Bundle menuPresenterState;

		static 
		{
		//    0    0:new             #9   <Class BottomNavigationView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void BottomNavigationView$SavedState$1()>
		//    3    7:putstatic       #21  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			readFromParcel(parcel, classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokespecial   #28  <Method void readFromParcel(Parcel, ClassLoader)>
		//    8   12:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #31  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public BottomNavigationView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #37  <Method void BottomNavigationView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.design.R.attr.bottomNavigationStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #43  <Field int android.support.design.R$attr.bottomNavigationStyle>
	//    4    6:invokespecial   #46  <Method void BottomNavigationView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public BottomNavigationView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #47  <Method void FrameLayout(Context, AttributeSet, int)>
		presenter = new BottomNavigationPresenter();
	//    5    7:aload_0         
	//    6    8:new             #49  <Class BottomNavigationPresenter>
	//    7   11:dup             
	//    8   12:invokespecial   #52  <Method void BottomNavigationPresenter()>
	//    9   15:putfield        #54  <Field BottomNavigationPresenter presenter>
		menu = ((MenuBuilder) (new BottomNavigationMenu(context)));
	//   10   18:aload_0         
	//   11   19:new             #56  <Class BottomNavigationMenu>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #58  <Method void BottomNavigationMenu(Context)>
	//   15   27:putfield        #60  <Field MenuBuilder menu>
		menuView = new BottomNavigationMenuView(context);
	//   16   30:aload_0         
	//   17   31:new             #62  <Class BottomNavigationMenuView>
	//   18   34:dup             
	//   19   35:aload_1         
	//   20   36:invokespecial   #63  <Method void BottomNavigationMenuView(Context)>
	//   21   39:putfield        #65  <Field BottomNavigationMenuView menuView>
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
	//   22   42:new             #67  <Class android.widget.FrameLayout$LayoutParams>
	//   23   45:dup             
	//   24   46:bipush          -2
	//   25   48:bipush          -2
	//   26   50:invokespecial   #70  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   27   53:astore          4
		layoutparams.gravity = 17;
	//   28   55:aload           4
	//   29   57:bipush          17
	//   30   59:putfield        #73  <Field int android.widget.FrameLayout$LayoutParams.gravity>
		menuView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   31   62:aload_0         
	//   32   63:getfield        #65  <Field BottomNavigationMenuView menuView>
	//   33   66:aload           4
	//   34   68:invokevirtual   #77  <Method void BottomNavigationMenuView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		presenter.setBottomNavigationMenuView(menuView);
	//   35   71:aload_0         
	//   36   72:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   37   75:aload_0         
	//   38   76:getfield        #65  <Field BottomNavigationMenuView menuView>
	//   39   79:invokevirtual   #81  <Method void BottomNavigationPresenter.setBottomNavigationMenuView(BottomNavigationMenuView)>
		presenter.setId(1);
	//   40   82:aload_0         
	//   41   83:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   42   86:iconst_1        
	//   43   87:invokevirtual   #85  <Method void BottomNavigationPresenter.setId(int)>
		menuView.setPresenter(presenter);
	//   44   90:aload_0         
	//   45   91:getfield        #65  <Field BottomNavigationMenuView menuView>
	//   46   94:aload_0         
	//   47   95:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   48   98:invokevirtual   #89  <Method void BottomNavigationMenuView.setPresenter(BottomNavigationPresenter)>
		menu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (presenter)));
	//   49  101:aload_0         
	//   50  102:getfield        #60  <Field MenuBuilder menu>
	//   51  105:aload_0         
	//   52  106:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   53  109:invokevirtual   #95  <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		presenter.initForMenu(getContext(), menu);
	//   54  112:aload_0         
	//   55  113:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   56  116:aload_0         
	//   57  117:invokevirtual   #99  <Method Context getContext()>
	//   58  120:aload_0         
	//   59  121:getfield        #60  <Field MenuBuilder menu>
	//   60  124:invokevirtual   #103 <Method void BottomNavigationPresenter.initForMenu(Context, MenuBuilder)>
		attributeset = ((AttributeSet) (ThemeEnforcement.obtainTintedStyledAttributes(context, attributeset, android.support.design.R.styleable.BottomNavigationView, i, android.support.design.R.style.Widget_Design_BottomNavigationView, new int[] {
			android.support.design.R.styleable.BottomNavigationView_itemTextAppearanceInactive, android.support.design.R.styleable.BottomNavigationView_itemTextAppearanceActive
		})));
	//   61  127:aload_1         
	//   62  128:aload_2         
	//   63  129:getstatic       #109 <Field int[] android.support.design.R$styleable.BottomNavigationView>
	//   64  132:iload_3         
	//   65  133:getstatic       #114 <Field int android.support.design.R$style.Widget_Design_BottomNavigationView>
	//   66  136:iconst_2        
	//   67  137:newarray        int[]
	//   68  139:dup             
	//   69  140:iconst_0        
	//   70  141:getstatic       #117 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextAppearanceInactive>
	//   71  144:iastore         
	//   72  145:dup             
	//   73  146:iconst_1        
	//   74  147:getstatic       #120 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextAppearanceActive>
	//   75  150:iastore         
	//   76  151:invokestatic    #126 <Method TintTypedArray ThemeEnforcement.obtainTintedStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   77  154:astore_2        
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_itemIconTint))
	//*  78  155:aload_2         
	//*  79  156:getstatic       #129 <Field int android.support.design.R$styleable.BottomNavigationView_itemIconTint>
	//*  80  159:invokevirtual   #135 <Method boolean TintTypedArray.hasValue(int)>
	//*  81  162:ifeq            182
		{
			menuView.setIconTintList(((TintTypedArray) (attributeset)).getColorStateList(android.support.design.R.styleable.BottomNavigationView_itemIconTint));
	//   82  165:aload_0         
	//   83  166:getfield        #65  <Field BottomNavigationMenuView menuView>
	//   84  169:aload_2         
	//   85  170:getstatic       #129 <Field int android.support.design.R$styleable.BottomNavigationView_itemIconTint>
	//   86  173:invokevirtual   #139 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   87  176:invokevirtual   #143 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
		} else
	//*  88  179:goto            200
		{
			BottomNavigationMenuView bottomnavigationmenuview = menuView;
	//   89  182:aload_0         
	//   90  183:getfield        #65  <Field BottomNavigationMenuView menuView>
	//   91  186:astore          5
			bottomnavigationmenuview.setIconTintList(bottomnavigationmenuview.createDefaultColorStateList(0x1010038));
	//   92  188:aload           5
	//   93  190:aload           5
	//   94  192:ldc1            #144 <Int 0x1010038>
	//   95  194:invokevirtual   #147 <Method ColorStateList BottomNavigationMenuView.createDefaultColorStateList(int)>
	//   96  197:invokevirtual   #143 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
		}
		setItemIconSize(((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_icon_size)));
	//   97  200:aload_0         
	//   98  201:aload_2         
	//   99  202:getstatic       #150 <Field int android.support.design.R$styleable.BottomNavigationView_itemIconSize>
	//  100  205:aload_0         
	//  101  206:invokevirtual   #154 <Method Resources getResources()>
	//  102  209:getstatic       #159 <Field int android.support.design.R$dimen.design_bottom_navigation_icon_size>
	//  103  212:invokevirtual   #165 <Method int Resources.getDimensionPixelSize(int)>
	//  104  215:invokevirtual   #168 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  105  218:invokevirtual   #171 <Method void setItemIconSize(int)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_itemTextAppearanceInactive))
	//* 106  221:aload_2         
	//* 107  222:getstatic       #117 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextAppearanceInactive>
	//* 108  225:invokevirtual   #135 <Method boolean TintTypedArray.hasValue(int)>
	//* 109  228:ifeq            243
			setItemTextAppearanceInactive(((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.BottomNavigationView_itemTextAppearanceInactive, 0));
	//  110  231:aload_0         
	//  111  232:aload_2         
	//  112  233:getstatic       #117 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextAppearanceInactive>
	//  113  236:iconst_0        
	//  114  237:invokevirtual   #174 <Method int TintTypedArray.getResourceId(int, int)>
	//  115  240:invokevirtual   #177 <Method void setItemTextAppearanceInactive(int)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_itemTextAppearanceActive))
	//* 116  243:aload_2         
	//* 117  244:getstatic       #120 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextAppearanceActive>
	//* 118  247:invokevirtual   #135 <Method boolean TintTypedArray.hasValue(int)>
	//* 119  250:ifeq            265
			setItemTextAppearanceActive(((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.BottomNavigationView_itemTextAppearanceActive, 0));
	//  120  253:aload_0         
	//  121  254:aload_2         
	//  122  255:getstatic       #120 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextAppearanceActive>
	//  123  258:iconst_0        
	//  124  259:invokevirtual   #174 <Method int TintTypedArray.getResourceId(int, int)>
	//  125  262:invokevirtual   #180 <Method void setItemTextAppearanceActive(int)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_itemTextColor))
	//* 126  265:aload_2         
	//* 127  266:getstatic       #183 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextColor>
	//* 128  269:invokevirtual   #135 <Method boolean TintTypedArray.hasValue(int)>
	//* 129  272:ifeq            286
			setItemTextColor(((TintTypedArray) (attributeset)).getColorStateList(android.support.design.R.styleable.BottomNavigationView_itemTextColor));
	//  130  275:aload_0         
	//  131  276:aload_2         
	//  132  277:getstatic       #183 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextColor>
	//  133  280:invokevirtual   #139 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//  134  283:invokevirtual   #186 <Method void setItemTextColor(ColorStateList)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_elevation))
	//* 135  286:aload_2         
	//* 136  287:getstatic       #189 <Field int android.support.design.R$styleable.BottomNavigationView_elevation>
	//* 137  290:invokevirtual   #135 <Method boolean TintTypedArray.hasValue(int)>
	//* 138  293:ifeq            309
			ViewCompat.setElevation(((View) (this)), ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.BottomNavigationView_elevation, 0));
	//  139  296:aload_0         
	//  140  297:aload_2         
	//  141  298:getstatic       #189 <Field int android.support.design.R$styleable.BottomNavigationView_elevation>
	//  142  301:iconst_0        
	//  143  302:invokevirtual   #168 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  144  305:i2f             
	//  145  306:invokestatic    #195 <Method void ViewCompat.setElevation(View, float)>
		setLabelVisibilityMode(((TintTypedArray) (attributeset)).getInteger(android.support.design.R.styleable.BottomNavigationView_labelVisibilityMode, -1));
	//  146  309:aload_0         
	//  147  310:aload_2         
	//  148  311:getstatic       #198 <Field int android.support.design.R$styleable.BottomNavigationView_labelVisibilityMode>
	//  149  314:iconst_m1       
	//  150  315:invokevirtual   #201 <Method int TintTypedArray.getInteger(int, int)>
	//  151  318:invokevirtual   #204 <Method void setLabelVisibilityMode(int)>
		setItemHorizontalTranslationEnabled(((TintTypedArray) (attributeset)).getBoolean(android.support.design.R.styleable.BottomNavigationView_itemHorizontalTranslationEnabled, true));
	//  152  321:aload_0         
	//  153  322:aload_2         
	//  154  323:getstatic       #207 <Field int android.support.design.R$styleable.BottomNavigationView_itemHorizontalTranslationEnabled>
	//  155  326:iconst_1        
	//  156  327:invokevirtual   #211 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//  157  330:invokevirtual   #215 <Method void setItemHorizontalTranslationEnabled(boolean)>
		i = ((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.BottomNavigationView_itemBackground, 0);
	//  158  333:aload_2         
	//  159  334:getstatic       #218 <Field int android.support.design.R$styleable.BottomNavigationView_itemBackground>
	//  160  337:iconst_0        
	//  161  338:invokevirtual   #174 <Method int TintTypedArray.getResourceId(int, int)>
	//  162  341:istore_3        
		menuView.setItemBackgroundRes(i);
	//  163  342:aload_0         
	//  164  343:getfield        #65  <Field BottomNavigationMenuView menuView>
	//  165  346:iload_3         
	//  166  347:invokevirtual   #221 <Method void BottomNavigationMenuView.setItemBackgroundRes(int)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_menu))
	//* 167  350:aload_2         
	//* 168  351:getstatic       #224 <Field int android.support.design.R$styleable.BottomNavigationView_menu>
	//* 169  354:invokevirtual   #135 <Method boolean TintTypedArray.hasValue(int)>
	//* 170  357:ifeq            372
			inflateMenu(((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.BottomNavigationView_menu, 0));
	//  171  360:aload_0         
	//  172  361:aload_2         
	//  173  362:getstatic       #224 <Field int android.support.design.R$styleable.BottomNavigationView_menu>
	//  174  365:iconst_0        
	//  175  366:invokevirtual   #174 <Method int TintTypedArray.getResourceId(int, int)>
	//  176  369:invokevirtual   #227 <Method void inflateMenu(int)>
		((TintTypedArray) (attributeset)).recycle();
	//  177  372:aload_2         
	//  178  373:invokevirtual   #230 <Method void TintTypedArray.recycle()>
		addView(((View) (menuView)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  179  376:aload_0         
	//  180  377:aload_0         
	//  181  378:getfield        #65  <Field BottomNavigationMenuView menuView>
	//  182  381:aload           4
	//  183  383:invokevirtual   #234 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//* 184  386:getstatic       #239 <Field int android.os.Build$VERSION.SDK_INT>
	//* 185  389:bipush          21
	//* 186  391:icmpge          399
			addCompatibilityTopDivider(context);
	//  187  394:aload_0         
	//  188  395:aload_1         
	//  189  396:invokespecial   #242 <Method void addCompatibilityTopDivider(Context)>
		menu.setCallback(new android.support.v7.view.menu.MenuBuilder.Callback() {

			public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
			{
				if(reselectedListener != null && menuitem.getItemId() == getSelectedItemId())
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field BottomNavigationView this$0>
			//*   2    4:invokestatic    #26  <Method BottomNavigationView$OnNavigationItemReselectedListener BottomNavigationView.access$000(BottomNavigationView)>
			//*   3    7:ifnull          41
			//*   4   10:aload_2         
			//*   5   11:invokeinterface #32  <Method int MenuItem.getItemId()>
			//*   6   16:aload_0         
			//*   7   17:getfield        #16  <Field BottomNavigationView this$0>
			//*   8   20:invokevirtual   #35  <Method int BottomNavigationView.getSelectedItemId()>
			//*   9   23:icmpne          41
				{
					reselectedListener.onNavigationItemReselected(menuitem);
			//   10   26:aload_0         
			//   11   27:getfield        #16  <Field BottomNavigationView this$0>
			//   12   30:invokestatic    #26  <Method BottomNavigationView$OnNavigationItemReselectedListener BottomNavigationView.access$000(BottomNavigationView)>
			//   13   33:aload_2         
			//   14   34:invokeinterface #41  <Method void BottomNavigationView$OnNavigationItemReselectedListener.onNavigationItemReselected(MenuItem)>
					return true;
			//   15   39:iconst_1        
			//   16   40:ireturn         
				}
				return selectedListener != null && !selectedListener.onNavigationItemSelected(menuitem);
			//   17   41:aload_0         
			//   18   42:getfield        #16  <Field BottomNavigationView this$0>
			//   19   45:invokestatic    #45  <Method BottomNavigationView$OnNavigationItemSelectedListener BottomNavigationView.access$100(BottomNavigationView)>
			//   20   48:ifnull          69
			//   21   51:aload_0         
			//   22   52:getfield        #16  <Field BottomNavigationView this$0>
			//   23   55:invokestatic    #45  <Method BottomNavigationView$OnNavigationItemSelectedListener BottomNavigationView.access$100(BottomNavigationView)>
			//   24   58:aload_2         
			//   25   59:invokeinterface #51  <Method boolean BottomNavigationView$OnNavigationItemSelectedListener.onNavigationItemSelected(MenuItem)>
			//   26   64:ifne            69
			//   27   67:iconst_1        
			//   28   68:ireturn         
			//   29   69:iconst_0        
			//   30   70:ireturn         
			}

			public void onMenuModeChange(MenuBuilder menubuilder)
			{
			//    0    0:return          
			}

			final BottomNavigationView this$0;

			
			{
				this$0 = BottomNavigationView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BottomNavigationView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  190  399:aload_0         
	//  191  400:getfield        #60  <Field MenuBuilder menu>
	//  192  403:new             #6   <Class BottomNavigationView$1>
	//  193  406:dup             
	//  194  407:aload_0         
	//  195  408:invokespecial   #245 <Method void BottomNavigationView$1(BottomNavigationView)>
	//  196  411:invokevirtual   #249 <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
	//  197  414:return          
	}

	private void addCompatibilityTopDivider(Context context)
	{
		View view = new View(context);
	//    0    0:new             #259 <Class View>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #260 <Method void View(Context)>
	//    4    8:astore_2        
		view.setBackgroundColor(ContextCompat.getColor(context, android.support.design.R.color.design_bottom_navigation_shadow_color));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:getstatic       #265 <Field int android.support.design.R$color.design_bottom_navigation_shadow_color>
	//    8   14:invokestatic    #271 <Method int ContextCompat.getColor(Context, int)>
	//    9   17:invokevirtual   #274 <Method void View.setBackgroundColor(int)>
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_shadow_height)))));
	//   10   20:aload_2         
	//   11   21:new             #67  <Class android.widget.FrameLayout$LayoutParams>
	//   12   24:dup             
	//   13   25:iconst_m1       
	//   14   26:aload_0         
	//   15   27:invokevirtual   #154 <Method Resources getResources()>
	//   16   30:getstatic       #277 <Field int android.support.design.R$dimen.design_bottom_navigation_shadow_height>
	//   17   33:invokevirtual   #165 <Method int Resources.getDimensionPixelSize(int)>
	//   18   36:invokespecial   #70  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   19   39:invokevirtual   #278 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		addView(view);
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:invokevirtual   #281 <Method void addView(View)>
	//   23   47:return          
	}

	private MenuInflater getMenuInflater()
	{
		if(menuInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #285 <Field MenuInflater menuInflater>
	//*   2    4:ifnonnull       22
			menuInflater = ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #287 <Class SupportMenuInflater>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #99  <Method Context getContext()>
	//    8   16:invokespecial   #288 <Method void SupportMenuInflater(Context)>
	//    9   19:putfield        #285 <Field MenuInflater menuInflater>
		return menuInflater;
	//   10   22:aload_0         
	//   11   23:getfield        #285 <Field MenuInflater menuInflater>
	//   12   26:areturn         
	}

	public Drawable getItemBackground()
	{
		return menuView.getItemBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #293 <Method Drawable BottomNavigationMenuView.getItemBackground()>
	//    3    7:areturn         
	}

	public int getItemBackgroundResource()
	{
		return menuView.getItemBackgroundRes();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #301 <Method int BottomNavigationMenuView.getItemBackgroundRes()>
	//    3    7:ireturn         
	}

	public int getItemIconSize()
	{
		return menuView.getItemIconSize();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #306 <Method int BottomNavigationMenuView.getItemIconSize()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return menuView.getIconTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #311 <Method ColorStateList BottomNavigationMenuView.getIconTintList()>
	//    3    7:areturn         
	}

	public int getItemTextAppearanceActive()
	{
		return menuView.getItemTextAppearanceActive();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #315 <Method int BottomNavigationMenuView.getItemTextAppearanceActive()>
	//    3    7:ireturn         
	}

	public int getItemTextAppearanceInactive()
	{
		return menuView.getItemTextAppearanceInactive();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #318 <Method int BottomNavigationMenuView.getItemTextAppearanceInactive()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemTextColor()
	{
		return menuView.getItemTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #321 <Method ColorStateList BottomNavigationMenuView.getItemTextColor()>
	//    3    7:areturn         
	}

	public int getLabelVisibilityMode()
	{
		return menuView.getLabelVisibilityMode();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #324 <Method int BottomNavigationMenuView.getLabelVisibilityMode()>
	//    3    7:ireturn         
	}

	public int getMaxItemCount()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (menu));
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field MenuBuilder menu>
	//    2    4:areturn         
	}

	public int getSelectedItemId()
	{
		return menuView.getSelectedItemId();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #332 <Method int BottomNavigationMenuView.getSelectedItemId()>
	//    3    7:ireturn         
	}

	public void inflateMenu(int i)
	{
		presenter.setUpdateSuspended(true);
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field BottomNavigationPresenter presenter>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #335 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
		getMenuInflater().inflate(i, ((Menu) (menu)));
	//    4    8:aload_0         
	//    5    9:invokespecial   #337 <Method MenuInflater getMenuInflater()>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #60  <Field MenuBuilder menu>
	//    9   17:invokevirtual   #343 <Method void MenuInflater.inflate(int, Menu)>
		presenter.setUpdateSuspended(false);
	//   10   20:aload_0         
	//   11   21:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #335 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
		presenter.updateMenuView(true);
	//   14   28:aload_0         
	//   15   29:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #346 <Method void BottomNavigationPresenter.updateMenuView(boolean)>
	//   18   36:return          
	}

	public boolean isItemHorizontalTranslationEnabled()
	{
		return menuView.isItemHorizontalTranslationEnabled();
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:invokevirtual   #350 <Method boolean BottomNavigationMenuView.isItemHorizontalTranslationEnabled()>
	//    3    7:ireturn         
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #14  <Class BottomNavigationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #354 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #14  <Class BottomNavigationView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #358 <Method Parcelable BottomNavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #354 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			menu.restorePresenterStates(((SavedState) (parcelable)).menuPresenterState);
	//   14   26:aload_0         
	//   15   27:getfield        #60  <Field MenuBuilder menu>
	//   16   30:aload_1         
	//   17   31:getfield        #362 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
	//   18   34:invokevirtual   #366 <Method void MenuBuilder.restorePresenterStates(Bundle)>
			return;
	//   19   37:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #14  <Class BottomNavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #369 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #371 <Method void BottomNavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.menuPresenterState = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #373 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #374 <Method void Bundle()>
	//   10   20:putfield        #362 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
		menu.savePresenterStates(savedstate.menuPresenterState);
	//   11   23:aload_0         
	//   12   24:getfield        #60  <Field MenuBuilder menu>
	//   13   27:aload_1         
	//   14   28:getfield        #362 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
	//   15   31:invokevirtual   #377 <Method void MenuBuilder.savePresenterStates(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void setItemBackground(Drawable drawable)
	{
		menuView.setItemBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #381 <Method void BottomNavigationMenuView.setItemBackground(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int i)
	{
		menuView.setItemBackgroundRes(i);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #221 <Method void BottomNavigationMenuView.setItemBackgroundRes(int)>
	//    4    8:return          
	}

	public void setItemHorizontalTranslationEnabled(boolean flag)
	{
		if(menuView.isItemHorizontalTranslationEnabled() != flag)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//*   2    4:invokevirtual   #350 <Method boolean BottomNavigationMenuView.isItemHorizontalTranslationEnabled()>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          27
		{
			menuView.setItemHorizontalTranslationEnabled(flag);
	//    5   11:aload_0         
	//    6   12:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #384 <Method void BottomNavigationMenuView.setItemHorizontalTranslationEnabled(boolean)>
			presenter.updateMenuView(false);
	//    9   19:aload_0         
	//   10   20:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #346 <Method void BottomNavigationPresenter.updateMenuView(boolean)>
		}
	//   13   27:return          
	}

	public void setItemIconSize(int i)
	{
		menuView.setItemIconSize(i);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #385 <Method void BottomNavigationMenuView.setItemIconSize(int)>
	//    4    8:return          
	}

	public void setItemIconSizeRes(int i)
	{
		setItemIconSize(getResources().getDimensionPixelSize(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #154 <Method Resources getResources()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #165 <Method int Resources.getDimensionPixelSize(int)>
	//    5    9:invokevirtual   #171 <Method void setItemIconSize(int)>
	//    6   12:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		menuView.setIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #143 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearanceActive(int i)
	{
		menuView.setItemTextAppearanceActive(i);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #389 <Method void BottomNavigationMenuView.setItemTextAppearanceActive(int)>
	//    4    8:return          
	}

	public void setItemTextAppearanceInactive(int i)
	{
		menuView.setItemTextAppearanceInactive(i);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #390 <Method void BottomNavigationMenuView.setItemTextAppearanceInactive(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		menuView.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #391 <Method void BottomNavigationMenuView.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setLabelVisibilityMode(int i)
	{
		if(menuView.getLabelVisibilityMode() != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #65  <Field BottomNavigationMenuView menuView>
	//*   2    4:invokevirtual   #324 <Method int BottomNavigationMenuView.getLabelVisibilityMode()>
	//*   3    7:iload_1         
	//*   4    8:icmpeq          27
		{
			menuView.setLabelVisibilityMode(i);
	//    5   11:aload_0         
	//    6   12:getfield        #65  <Field BottomNavigationMenuView menuView>
	//    7   15:iload_1         
	//    8   16:invokevirtual   #392 <Method void BottomNavigationMenuView.setLabelVisibilityMode(int)>
			presenter.updateMenuView(false);
	//    9   19:aload_0         
	//   10   20:getfield        #54  <Field BottomNavigationPresenter presenter>
	//   11   23:iconst_0        
	//   12   24:invokevirtual   #346 <Method void BottomNavigationPresenter.updateMenuView(boolean)>
		}
	//   13   27:return          
	}

	public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onnavigationitemreselectedlistener)
	{
		reselectedListener = onnavigationitemreselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #253 <Field BottomNavigationView$OnNavigationItemReselectedListener reselectedListener>
	//    3    5:return          
	}

	public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onnavigationitemselectedlistener)
	{
		selectedListener = onnavigationitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #257 <Field BottomNavigationView$OnNavigationItemSelectedListener selectedListener>
	//    3    5:return          
	}

	public void setSelectedItemId(int i)
	{
		MenuItem menuitem = menu.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #60  <Field MenuBuilder menu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #401 <Method MenuItem MenuBuilder.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null && !menu.performItemAction(menuitem, ((android.support.v7.view.menu.MenuPresenter) (presenter)), 0))
	//*   5    9:aload_2         
	//*   6   10:ifnull          37
	//*   7   13:aload_0         
	//*   8   14:getfield        #60  <Field MenuBuilder menu>
	//*   9   17:aload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #54  <Field BottomNavigationPresenter presenter>
	//*  12   22:iconst_0        
	//*  13   23:invokevirtual   #405 <Method boolean MenuBuilder.performItemAction(MenuItem, android.support.v7.view.menu.MenuPresenter, int)>
	//*  14   26:ifne            37
			menuitem.setChecked(true);
	//   15   29:aload_2         
	//   16   30:iconst_1        
	//   17   31:invokeinterface #411 <Method MenuItem MenuItem.setChecked(boolean)>
	//   18   36:pop             
	//   19   37:return          
	}

	private static final int MENU_PRESENTER_ID = 1;
	private final MenuBuilder menu;
	private MenuInflater menuInflater;
	private final BottomNavigationMenuView menuView;
	private final BottomNavigationPresenter presenter;
	private OnNavigationItemReselectedListener reselectedListener;
	private OnNavigationItemSelectedListener selectedListener;


/*
	static OnNavigationItemReselectedListener access$000(BottomNavigationView bottomnavigationview)
	{
		return bottomnavigationview.reselectedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #253 <Field BottomNavigationView$OnNavigationItemReselectedListener reselectedListener>
	//    2    4:areturn         
	}

*/


/*
	static OnNavigationItemSelectedListener access$100(BottomNavigationView bottomnavigationview)
	{
		return bottomnavigationview.selectedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field BottomNavigationView$OnNavigationItemSelectedListener selectedListener>
	//    2    4:areturn         
	}

*/
}
