// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.*;
import android.support.design.internal.*;
import android.support.v4.content.ContextCompat;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.view.AbsSavedState;
import android.support.v4.view.ViewCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;
import android.widget.FrameLayout;
import o.aa;

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
		//    3    3:invokevirtual   #43  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    4    6:putfield        #45  <Field Bundle menuPresenterState>
		//    5    9:return          
		}

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #50  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(menuPresenterState);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #45  <Field Bundle menuPresenterState>
		//    7   11:invokevirtual   #54  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

			public Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (e(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #23  <Method BottomNavigationView$SavedState e(Parcel, ClassLoader)>
			//    4    6:areturn         
			}

			public SavedState[] d(int i)
			{
				return new SavedState[i];
			//    0    0:iload_1         
			//    1    1:anewarray       SavedState[]
			//    2    4:areturn         
			}

			public SavedState e(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class BottomNavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #28  <Method void BottomNavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public Object[] newArray(int i)
			{
				return ((Object []) (d(i)));
			//    0    0:aload_0         
			//    1    1:iload_1         
			//    2    2:invokevirtual   #32  <Method BottomNavigationView$SavedState[] d(int)>
			//    3    5:areturn         
			}

		}
);
		Bundle menuPresenterState;

		static 
		{
		//    0    0:new             #9   <Class BottomNavigationView$SavedState$5>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void BottomNavigationView$SavedState$5()>
		//    3    7:invokestatic    #25  <Method android.os.Parcelable$Creator ParcelableCompat.newCreator(ParcelableCompatCreatorCallbacks)>
		//    4   10:putstatic       #27  <Field android.os.Parcelable$Creator CREATOR>
		//*   5   13:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #31  <Method void AbsSavedState(Parcel, ClassLoader)>
			readFromParcel(parcel, classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokespecial   #34  <Method void readFromParcel(Parcel, ClassLoader)>
		//    8   12:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public BottomNavigationView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #49  <Method void BottomNavigationView(Context, AttributeSet)>
	//    4    6:return          
	}

	public BottomNavigationView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #52  <Method void BottomNavigationView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public BottomNavigationView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #53  <Method void FrameLayout(Context, AttributeSet, int)>
		mPresenter = new BottomNavigationPresenter();
	//    5    7:aload_0         
	//    6    8:new             #55  <Class BottomNavigationPresenter>
	//    7   11:dup             
	//    8   12:invokespecial   #57  <Method void BottomNavigationPresenter()>
	//    9   15:putfield        #59  <Field BottomNavigationPresenter mPresenter>
		aa.b(context);
	//   10   18:aload_1         
	//   11   19:invokestatic    #64  <Method void aa.b(Context)>
		mMenu = ((MenuBuilder) (new BottomNavigationMenu(context)));
	//   12   22:aload_0         
	//   13   23:new             #66  <Class BottomNavigationMenu>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #68  <Method void BottomNavigationMenu(Context)>
	//   17   31:putfield        #70  <Field MenuBuilder mMenu>
		mMenuView = new BottomNavigationMenuView(context);
	//   18   34:aload_0         
	//   19   35:new             #72  <Class BottomNavigationMenuView>
	//   20   38:dup             
	//   21   39:aload_1         
	//   22   40:invokespecial   #73  <Method void BottomNavigationMenuView(Context)>
	//   23   43:putfield        #75  <Field BottomNavigationMenuView mMenuView>
		android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(-2, -2);
	//   24   46:new             #77  <Class android.widget.FrameLayout$LayoutParams>
	//   25   49:dup             
	//   26   50:bipush          -2
	//   27   52:bipush          -2
	//   28   54:invokespecial   #80  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   29   57:astore          4
		layoutparams.gravity = 17;
	//   30   59:aload           4
	//   31   61:bipush          17
	//   32   63:putfield        #83  <Field int android.widget.FrameLayout$LayoutParams.gravity>
		mMenuView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   33   66:aload_0         
	//   34   67:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//   35   70:aload           4
	//   36   72:invokevirtual   #87  <Method void BottomNavigationMenuView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		mPresenter.setBottomNavigationMenuView(mMenuView);
	//   37   75:aload_0         
	//   38   76:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//   39   79:aload_0         
	//   40   80:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//   41   83:invokevirtual   #91  <Method void BottomNavigationPresenter.setBottomNavigationMenuView(BottomNavigationMenuView)>
		mPresenter.setId(1);
	//   42   86:aload_0         
	//   43   87:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//   44   90:iconst_1        
	//   45   91:invokevirtual   #95  <Method void BottomNavigationPresenter.setId(int)>
		mMenuView.setPresenter(mPresenter);
	//   46   94:aload_0         
	//   47   95:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//   48   98:aload_0         
	//   49   99:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//   50  102:invokevirtual   #99  <Method void BottomNavigationMenuView.setPresenter(BottomNavigationPresenter)>
		mMenu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mPresenter)));
	//   51  105:aload_0         
	//   52  106:getfield        #70  <Field MenuBuilder mMenu>
	//   53  109:aload_0         
	//   54  110:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//   55  113:invokevirtual   #105 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		mPresenter.initForMenu(getContext(), mMenu);
	//   56  116:aload_0         
	//   57  117:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//   58  120:aload_0         
	//   59  121:invokevirtual   #109 <Method Context getContext()>
	//   60  124:aload_0         
	//   61  125:getfield        #70  <Field MenuBuilder mMenu>
	//   62  128:invokevirtual   #113 <Method void BottomNavigationPresenter.initForMenu(Context, MenuBuilder)>
		attributeset = ((AttributeSet) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.BottomNavigationView, i, android.support.design.R.style.Widget_Design_BottomNavigationView)));
	//   63  131:aload_1         
	//   64  132:aload_2         
	//   65  133:getstatic       #118 <Field int[] android.support.design.R$styleable.BottomNavigationView>
	//   66  136:iload_3         
	//   67  137:getstatic       #123 <Field int android.support.design.R$style.Widget_Design_BottomNavigationView>
	//   68  140:invokestatic    #129 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   69  143:astore_2        
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_itemIconTint))
	//*  70  144:aload_2         
	//*  71  145:getstatic       #132 <Field int android.support.design.R$styleable.BottomNavigationView_itemIconTint>
	//*  72  148:invokevirtual   #136 <Method boolean TintTypedArray.hasValue(int)>
	//*  73  151:ifeq            171
			mMenuView.setIconTintList(((TintTypedArray) (attributeset)).getColorStateList(android.support.design.R.styleable.BottomNavigationView_itemIconTint));
	//   74  154:aload_0         
	//   75  155:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//   76  158:aload_2         
	//   77  159:getstatic       #132 <Field int android.support.design.R$styleable.BottomNavigationView_itemIconTint>
	//   78  162:invokevirtual   #140 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   79  165:invokevirtual   #144 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
		else
	//*  80  168:goto            184
			mMenuView.setIconTintList(createDefaultColorStateList(0x1010038));
	//   81  171:aload_0         
	//   82  172:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//   83  175:aload_0         
	//   84  176:ldc1            #145 <Int 0x1010038>
	//   85  178:invokespecial   #148 <Method ColorStateList createDefaultColorStateList(int)>
	//   86  181:invokevirtual   #144 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_itemTextColor))
	//*  87  184:aload_2         
	//*  88  185:getstatic       #151 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextColor>
	//*  89  188:invokevirtual   #136 <Method boolean TintTypedArray.hasValue(int)>
	//*  90  191:ifeq            211
			mMenuView.setItemTextColor(((TintTypedArray) (attributeset)).getColorStateList(android.support.design.R.styleable.BottomNavigationView_itemTextColor));
	//   91  194:aload_0         
	//   92  195:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//   93  198:aload_2         
	//   94  199:getstatic       #151 <Field int android.support.design.R$styleable.BottomNavigationView_itemTextColor>
	//   95  202:invokevirtual   #140 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   96  205:invokevirtual   #154 <Method void BottomNavigationMenuView.setItemTextColor(ColorStateList)>
		else
	//*  97  208:goto            224
			mMenuView.setItemTextColor(createDefaultColorStateList(0x1010038));
	//   98  211:aload_0         
	//   99  212:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//  100  215:aload_0         
	//  101  216:ldc1            #145 <Int 0x1010038>
	//  102  218:invokespecial   #148 <Method ColorStateList createDefaultColorStateList(int)>
	//  103  221:invokevirtual   #154 <Method void BottomNavigationMenuView.setItemTextColor(ColorStateList)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_elevation))
	//* 104  224:aload_2         
	//* 105  225:getstatic       #157 <Field int android.support.design.R$styleable.BottomNavigationView_elevation>
	//* 106  228:invokevirtual   #136 <Method boolean TintTypedArray.hasValue(int)>
	//* 107  231:ifeq            247
			ViewCompat.setElevation(((View) (this)), ((TintTypedArray) (attributeset)).getDimensionPixelSize(android.support.design.R.styleable.BottomNavigationView_elevation, 0));
	//  108  234:aload_0         
	//  109  235:aload_2         
	//  110  236:getstatic       #157 <Field int android.support.design.R$styleable.BottomNavigationView_elevation>
	//  111  239:iconst_0        
	//  112  240:invokevirtual   #161 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  113  243:i2f             
	//  114  244:invokestatic    #167 <Method void ViewCompat.setElevation(View, float)>
		i = ((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.BottomNavigationView_itemBackground, 0);
	//  115  247:aload_2         
	//  116  248:getstatic       #170 <Field int android.support.design.R$styleable.BottomNavigationView_itemBackground>
	//  117  251:iconst_0        
	//  118  252:invokevirtual   #173 <Method int TintTypedArray.getResourceId(int, int)>
	//  119  255:istore_3        
		mMenuView.setItemBackgroundRes(i);
	//  120  256:aload_0         
	//  121  257:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//  122  260:iload_3         
	//  123  261:invokevirtual   #176 <Method void BottomNavigationMenuView.setItemBackgroundRes(int)>
		if(((TintTypedArray) (attributeset)).hasValue(android.support.design.R.styleable.BottomNavigationView_menu))
	//* 124  264:aload_2         
	//* 125  265:getstatic       #179 <Field int android.support.design.R$styleable.BottomNavigationView_menu>
	//* 126  268:invokevirtual   #136 <Method boolean TintTypedArray.hasValue(int)>
	//* 127  271:ifeq            286
			inflateMenu(((TintTypedArray) (attributeset)).getResourceId(android.support.design.R.styleable.BottomNavigationView_menu, 0));
	//  128  274:aload_0         
	//  129  275:aload_2         
	//  130  276:getstatic       #179 <Field int android.support.design.R$styleable.BottomNavigationView_menu>
	//  131  279:iconst_0        
	//  132  280:invokevirtual   #173 <Method int TintTypedArray.getResourceId(int, int)>
	//  133  283:invokevirtual   #182 <Method void inflateMenu(int)>
		((TintTypedArray) (attributeset)).recycle();
	//  134  286:aload_2         
	//  135  287:invokevirtual   #185 <Method void TintTypedArray.recycle()>
		addView(((View) (mMenuView)), ((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//  136  290:aload_0         
	//  137  291:aload_0         
	//  138  292:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//  139  295:aload           4
	//  140  297:invokevirtual   #189 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		if(android.os.Build.VERSION.SDK_INT < 21)
	//* 141  300:getstatic       #194 <Field int android.os.Build$VERSION.SDK_INT>
	//* 142  303:bipush          21
	//* 143  305:icmpge          313
			addCompatibilityTopDivider(context);
	//  144  308:aload_0         
	//  145  309:aload_1         
	//  146  310:invokespecial   #197 <Method void addCompatibilityTopDivider(Context)>
		mMenu.setCallback(new android.support.v7.view.menu.MenuBuilder.Callback() {

			public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
			{
				if(b.mReselectedListener != null && menuitem.getItemId() == b.getSelectedItemId())
			//*   0    0:aload_0         
			//*   1    1:getfield        #16  <Field BottomNavigationView b>
			//*   2    4:invokestatic    #26  <Method BottomNavigationView$OnNavigationItemReselectedListener BottomNavigationView.access$000(BottomNavigationView)>
			//*   3    7:ifnull          41
			//*   4   10:aload_2         
			//*   5   11:invokeinterface #32  <Method int MenuItem.getItemId()>
			//*   6   16:aload_0         
			//*   7   17:getfield        #16  <Field BottomNavigationView b>
			//*   8   20:invokevirtual   #35  <Method int BottomNavigationView.getSelectedItemId()>
			//*   9   23:icmpne          41
				{
					b.mReselectedListener.onNavigationItemReselected(menuitem);
			//   10   26:aload_0         
			//   11   27:getfield        #16  <Field BottomNavigationView b>
			//   12   30:invokestatic    #26  <Method BottomNavigationView$OnNavigationItemReselectedListener BottomNavigationView.access$000(BottomNavigationView)>
			//   13   33:aload_2         
			//   14   34:invokeinterface #41  <Method void BottomNavigationView$OnNavigationItemReselectedListener.onNavigationItemReselected(MenuItem)>
					return true;
			//   15   39:iconst_1        
			//   16   40:ireturn         
				}
				return b.mSelectedListener != null && !b.mSelectedListener.onNavigationItemSelected(menuitem);
			//   17   41:aload_0         
			//   18   42:getfield        #16  <Field BottomNavigationView b>
			//   19   45:invokestatic    #45  <Method BottomNavigationView$OnNavigationItemSelectedListener BottomNavigationView.access$100(BottomNavigationView)>
			//   20   48:ifnull          69
			//   21   51:aload_0         
			//   22   52:getfield        #16  <Field BottomNavigationView b>
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

			final BottomNavigationView b;

			
			{
				b = BottomNavigationView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field BottomNavigationView b>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  147  313:aload_0         
	//  148  314:getfield        #70  <Field MenuBuilder mMenu>
	//  149  317:new             #6   <Class BottomNavigationView$2>
	//  150  320:dup             
	//  151  321:aload_0         
	//  152  322:invokespecial   #200 <Method void BottomNavigationView$2(BottomNavigationView)>
	//  153  325:invokevirtual   #204 <Method void MenuBuilder.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
	//  154  328:return          
	}

	private void addCompatibilityTopDivider(Context context)
	{
		View view = new View(context);
	//    0    0:new             #214 <Class View>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #215 <Method void View(Context)>
	//    4    8:astore_2        
		view.setBackgroundColor(ContextCompat.getColor(context, android.support.design.R.color.design_bottom_navigation_shadow_color));
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:getstatic       #220 <Field int android.support.design.R$color.design_bottom_navigation_shadow_color>
	//    8   14:invokestatic    #226 <Method int ContextCompat.getColor(Context, int)>
	//    9   17:invokevirtual   #229 <Method void View.setBackgroundColor(int)>
		view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (new android.widget.FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(android.support.design.R.dimen.design_bottom_navigation_shadow_height)))));
	//   10   20:aload_2         
	//   11   21:new             #77  <Class android.widget.FrameLayout$LayoutParams>
	//   12   24:dup             
	//   13   25:iconst_m1       
	//   14   26:aload_0         
	//   15   27:invokevirtual   #233 <Method Resources getResources()>
	//   16   30:getstatic       #238 <Field int android.support.design.R$dimen.design_bottom_navigation_shadow_height>
	//   17   33:invokevirtual   #243 <Method int Resources.getDimensionPixelSize(int)>
	//   18   36:invokespecial   #80  <Method void android.widget.FrameLayout$LayoutParams(int, int)>
	//   19   39:invokevirtual   #244 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		addView(view);
	//   20   42:aload_0         
	//   21   43:aload_2         
	//   22   44:invokevirtual   #247 <Method void addView(View)>
	//   23   47:return          
	}

	private ColorStateList createDefaultColorStateList(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #249 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void TypedValue()>
	//    3    7:astore          5
		if(!getContext().getTheme().resolveAttribute(i, typedvalue, true))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #109 <Method Context getContext()>
	//*   6   13:invokevirtual   #256 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   16:iload_1         
	//*   8   17:aload           5
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #262 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifne            28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		ColorStateList colorstatelist = AppCompatResources.getColorStateList(getContext(), typedvalue.resourceId);
	//   14   28:aload_0         
	//   15   29:invokevirtual   #109 <Method Context getContext()>
	//   16   32:aload           5
	//   17   34:getfield        #265 <Field int TypedValue.resourceId>
	//   18   37:invokestatic    #270 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   19   40:astore          4
		if(!getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorPrimary, typedvalue, true))
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #109 <Method Context getContext()>
	//*  22   46:invokevirtual   #256 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  23   49:getstatic       #275 <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//*  24   52:aload           5
	//*  25   54:iconst_1        
	//*  26   55:invokevirtual   #262 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  27   58:ifne            63
		{
			return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
		} else
		{
			i = typedvalue.data;
	//   30   63:aload           5
	//   31   65:getfield        #278 <Field int TypedValue.data>
	//   32   68:istore_1        
			int j = colorstatelist.getDefaultColor();
	//   33   69:aload           4
	//   34   71:invokevirtual   #284 <Method int ColorStateList.getDefaultColor()>
	//   35   74:istore_2        
			int ai[] = DISABLED_STATE_SET;
	//   36   75:getstatic       #43  <Field int[] DISABLED_STATE_SET>
	//   37   78:astore          5
			int ai1[] = CHECKED_STATE_SET;
	//   38   80:getstatic       #40  <Field int[] CHECKED_STATE_SET>
	//   39   83:astore          6
			int ai2[] = EMPTY_STATE_SET;
	//   40   85:getstatic       #287 <Field int[] EMPTY_STATE_SET>
	//   41   88:astore          7
			int k = colorstatelist.getColorForState(DISABLED_STATE_SET, j);
	//   42   90:aload           4
	//   43   92:getstatic       #43  <Field int[] DISABLED_STATE_SET>
	//   44   95:iload_2         
	//   45   96:invokevirtual   #291 <Method int ColorStateList.getColorForState(int[], int)>
	//   46   99:istore_3        
			return new ColorStateList(new int[][] {
				ai, ai1, ai2
			}, new int[] {
				k, i, j
			});
	//   47  100:new             #280 <Class ColorStateList>
	//   48  103:dup             
	//   49  104:iconst_3        
	//   50  105:anewarray       int[][]
	//   51  108:dup             
	//   52  109:iconst_0        
	//   53  110:aload           5
	//   54  112:aastore         
	//   55  113:dup             
	//   56  114:iconst_1        
	//   57  115:aload           6
	//   58  117:aastore         
	//   59  118:dup             
	//   60  119:iconst_2        
	//   61  120:aload           7
	//   62  122:aastore         
	//   63  123:iconst_3        
	//   64  124:newarray        int[]
	//   65  126:dup             
	//   66  127:iconst_0        
	//   67  128:iload_3         
	//   68  129:iastore         
	//   69  130:dup             
	//   70  131:iconst_1        
	//   71  132:iload_1         
	//   72  133:iastore         
	//   73  134:dup             
	//   74  135:iconst_2        
	//   75  136:iload_2         
	//   76  137:iastore         
	//   77  138:invokespecial   #295 <Method void ColorStateList(int[][], int[])>
	//   78  141:areturn         
		}
	}

	private MenuInflater getMenuInflater()
	{
		if(mMenuInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #299 <Field MenuInflater mMenuInflater>
	//*   2    4:ifnonnull       22
			mMenuInflater = ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #301 <Class SupportMenuInflater>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #109 <Method Context getContext()>
	//    8   16:invokespecial   #302 <Method void SupportMenuInflater(Context)>
	//    9   19:putfield        #299 <Field MenuInflater mMenuInflater>
		return mMenuInflater;
	//   10   22:aload_0         
	//   11   23:getfield        #299 <Field MenuInflater mMenuInflater>
	//   12   26:areturn         
	}

	public int getItemBackgroundResource()
	{
		return mMenuView.getItemBackgroundRes();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//    2    4:invokevirtual   #307 <Method int BottomNavigationMenuView.getItemBackgroundRes()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return mMenuView.getIconTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//    2    4:invokevirtual   #314 <Method ColorStateList BottomNavigationMenuView.getIconTintList()>
	//    3    7:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return mMenuView.getItemTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//    2    4:invokevirtual   #317 <Method ColorStateList BottomNavigationMenuView.getItemTextColor()>
	//    3    7:areturn         
	}

	public int getMaxItemCount()
	{
		return 5;
	//    0    0:iconst_5        
	//    1    1:ireturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (mMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field MenuBuilder mMenu>
	//    2    4:areturn         
	}

	public int getSelectedItemId()
	{
		return mMenuView.getSelectedItemId();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//    2    4:invokevirtual   #325 <Method int BottomNavigationMenuView.getSelectedItemId()>
	//    3    7:ireturn         
	}

	public void inflateMenu(int i)
	{
		mPresenter.setUpdateSuspended(true);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #329 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
		getMenuInflater().inflate(i, ((Menu) (mMenu)));
	//    4    8:aload_0         
	//    5    9:invokespecial   #331 <Method MenuInflater getMenuInflater()>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #70  <Field MenuBuilder mMenu>
	//    9   17:invokevirtual   #337 <Method void MenuInflater.inflate(int, Menu)>
		mPresenter.setUpdateSuspended(false);
	//   10   20:aload_0         
	//   11   21:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #329 <Method void BottomNavigationPresenter.setUpdateSuspended(boolean)>
		mPresenter.updateMenuView(true);
	//   14   28:aload_0         
	//   15   29:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//   16   32:iconst_1        
	//   17   33:invokevirtual   #340 <Method void BottomNavigationPresenter.updateMenuView(boolean)>
	//   18   36:return          
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
	//    5    9:invokespecial   #344 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #348 <Method Parcelable BottomNavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #344 <Method void FrameLayout.onRestoreInstanceState(Parcelable)>
			mMenu.restorePresenterStates(((SavedState) (parcelable)).menuPresenterState);
	//   14   26:aload_0         
	//   15   27:getfield        #70  <Field MenuBuilder mMenu>
	//   16   30:aload_1         
	//   17   31:getfield        #352 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
	//   18   34:invokevirtual   #356 <Method void MenuBuilder.restorePresenterStates(Bundle)>
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
	//    3    5:invokespecial   #359 <Method Parcelable FrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #361 <Method void BottomNavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.menuPresenterState = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #363 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #364 <Method void Bundle()>
	//   10   20:putfield        #352 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
		mMenu.savePresenterStates(savedstate.menuPresenterState);
	//   11   23:aload_0         
	//   12   24:getfield        #70  <Field MenuBuilder mMenu>
	//   13   27:aload_1         
	//   14   28:getfield        #352 <Field Bundle BottomNavigationView$SavedState.menuPresenterState>
	//   15   31:invokevirtual   #367 <Method void MenuBuilder.savePresenterStates(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void setItemBackgroundResource(int i)
	{
		mMenuView.setItemBackgroundRes(i);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #176 <Method void BottomNavigationMenuView.setItemBackgroundRes(int)>
	//    4    8:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		mMenuView.setIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #144 <Method void BottomNavigationMenuView.setIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		mMenuView.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field BottomNavigationMenuView mMenuView>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #154 <Method void BottomNavigationMenuView.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setOnNavigationItemReselectedListener(OnNavigationItemReselectedListener onnavigationitemreselectedlistener)
	{
		mReselectedListener = onnavigationitemreselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #208 <Field BottomNavigationView$OnNavigationItemReselectedListener mReselectedListener>
	//    3    5:return          
	}

	public void setOnNavigationItemSelectedListener(OnNavigationItemSelectedListener onnavigationitemselectedlistener)
	{
		mSelectedListener = onnavigationitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #212 <Field BottomNavigationView$OnNavigationItemSelectedListener mSelectedListener>
	//    3    5:return          
	}

	public void setSelectedItemId(int i)
	{
		MenuItem menuitem = mMenu.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #70  <Field MenuBuilder mMenu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #379 <Method MenuItem MenuBuilder.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null && !mMenu.performItemAction(menuitem, ((android.support.v7.view.menu.MenuPresenter) (mPresenter)), 0))
	//*   5    9:aload_2         
	//*   6   10:ifnull          37
	//*   7   13:aload_0         
	//*   8   14:getfield        #70  <Field MenuBuilder mMenu>
	//*   9   17:aload_2         
	//*  10   18:aload_0         
	//*  11   19:getfield        #59  <Field BottomNavigationPresenter mPresenter>
	//*  12   22:iconst_0        
	//*  13   23:invokevirtual   #383 <Method boolean MenuBuilder.performItemAction(MenuItem, android.support.v7.view.menu.MenuPresenter, int)>
	//*  14   26:ifne            37
			menuitem.setChecked(true);
	//   15   29:aload_2         
	//   16   30:iconst_1        
	//   17   31:invokeinterface #389 <Method MenuItem MenuItem.setChecked(boolean)>
	//   18   36:pop             
	//   19   37:return          
	}

	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private static final int DISABLED_STATE_SET[] = {
		0xfefeff62
	};
	private static final int MENU_PRESENTER_ID = 1;
	private final MenuBuilder mMenu;
	private MenuInflater mMenuInflater;
	private final BottomNavigationMenuView mMenuView;
	private final BottomNavigationPresenter mPresenter;
	private OnNavigationItemReselectedListener mReselectedListener;
	private OnNavigationItemSelectedListener mSelectedListener;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #38  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #40  <Field int[] CHECKED_STATE_SET>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #41  <Int 0xfefeff62>
	//   12   18:iastore         
	//   13   19:putstatic       #43  <Field int[] DISABLED_STATE_SET>
	//*  14   22:return          
	}


/*
	static OnNavigationItemReselectedListener access$000(BottomNavigationView bottomnavigationview)
	{
		return bottomnavigationview.mReselectedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #208 <Field BottomNavigationView$OnNavigationItemReselectedListener mReselectedListener>
	//    2    4:areturn         
	}

*/


/*
	static OnNavigationItemSelectedListener access$100(BottomNavigationView bottomnavigationview)
	{
		return bottomnavigationview.mSelectedListener;
	//    0    0:aload_0         
	//    1    1:getfield        #212 <Field BottomNavigationView$OnNavigationItemSelectedListener mSelectedListener>
	//    2    4:areturn         
	}

*/
}
