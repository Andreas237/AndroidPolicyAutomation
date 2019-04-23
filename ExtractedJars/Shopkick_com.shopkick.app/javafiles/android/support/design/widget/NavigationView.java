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
import android.support.v4.view.*;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.support.v7.widget.TintTypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.*;

public class NavigationView extends ScrimInsetsFrameLayout
{
	public static interface OnNavigationItemSelectedListener
	{

		public abstract boolean onNavigationItemSelected(MenuItem menuitem);
	}

	public static class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			super.writeToParcel(parcel, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #41  <Method void AbsSavedState.writeToParcel(Parcel, int)>
			parcel.writeBundle(menuState);
		//    4    6:aload_1         
		//    5    7:aload_0         
		//    6    8:getfield        #33  <Field Bundle menuState>
		//    7   11:invokevirtual   #45  <Method void Parcel.writeBundle(Bundle)>
		//    8   14:return          
		}

		public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.ClassLoaderCreator() {

			public SavedState createFromParcel(Parcel parcel)
			{
				return new SavedState(parcel, ((ClassLoader) (null)));
			//    0    0:new             #9   <Class NavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aconst_null     
			//    4    6:invokespecial   #22  <Method void NavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return new SavedState(parcel, classloader);
			//    0    0:new             #9   <Class NavigationView$SavedState>
			//    1    3:dup             
			//    2    4:aload_1         
			//    3    5:aload_2         
			//    4    6:invokespecial   #22  <Method void NavigationView$SavedState(Parcel, ClassLoader)>
			//    5    9:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel)
			{
				return ((Object) (createFromParcel(parcel)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:invokevirtual   #26  <Method NavigationView$SavedState createFromParcel(Parcel)>
			//    3    5:areturn         
			}

			public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
			{
				return ((Object) (createFromParcel(parcel, classloader)));
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:aload_2         
			//    3    3:invokevirtual   #29  <Method NavigationView$SavedState createFromParcel(Parcel, ClassLoader)>
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
			//    2    2:invokevirtual   #34  <Method NavigationView$SavedState[] newArray(int)>
			//    3    5:areturn         
			}

		}
;
		public Bundle menuState;

		static 
		{
		//    0    0:new             #9   <Class NavigationView$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void NavigationView$SavedState$1()>
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
			menuState = parcel.readBundle(classloader);
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:aload_2         
		//    7    9:invokevirtual   #31  <Method Bundle Parcel.readBundle(ClassLoader)>
		//    8   12:putfield        #33  <Field Bundle menuState>
		//    9   15:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #36  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}


	public NavigationView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #43  <Method void NavigationView(Context, AttributeSet)>
	//    4    6:return          
	}

	public NavigationView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.design.R.attr.navigationViewStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #48  <Field int android.support.design.R$attr.navigationViewStyle>
	//    4    6:invokespecial   #51  <Method void NavigationView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public NavigationView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #52  <Method void ScrimInsetsFrameLayout(Context, AttributeSet, int)>
		presenter = new NavigationMenuPresenter();
	//    5    7:aload_0         
	//    6    8:new             #54  <Class NavigationMenuPresenter>
	//    7   11:dup             
	//    8   12:invokespecial   #56  <Method void NavigationMenuPresenter()>
	//    9   15:putfield        #58  <Field NavigationMenuPresenter presenter>
		menu = new NavigationMenu(context);
	//   10   18:aload_0         
	//   11   19:new             #60  <Class NavigationMenu>
	//   12   22:dup             
	//   13   23:aload_1         
	//   14   24:invokespecial   #62  <Method void NavigationMenu(Context)>
	//   15   27:putfield        #64  <Field NavigationMenu menu>
		TintTypedArray tinttypedarray = ThemeEnforcement.obtainTintedStyledAttributes(context, attributeset, android.support.design.R.styleable.NavigationView, i, android.support.design.R.style.Widget_Design_NavigationView, new int[0]);
	//   16   30:aload_1         
	//   17   31:aload_2         
	//   18   32:getstatic       #69  <Field int[] android.support.design.R$styleable.NavigationView>
	//   19   35:iload_3         
	//   20   36:getstatic       #74  <Field int android.support.design.R$style.Widget_Design_NavigationView>
	//   21   39:iconst_0        
	//   22   40:newarray        int[]
	//   23   42:invokestatic    #80  <Method TintTypedArray ThemeEnforcement.obtainTintedStyledAttributes(Context, AttributeSet, int[], int, int, int[])>
	//   24   45:astore          8
		ViewCompat.setBackground(((View) (this)), tinttypedarray.getDrawable(android.support.design.R.styleable.NavigationView_android_background));
	//   25   47:aload_0         
	//   26   48:aload           8
	//   27   50:getstatic       #83  <Field int android.support.design.R$styleable.NavigationView_android_background>
	//   28   53:invokevirtual   #89  <Method Drawable TintTypedArray.getDrawable(int)>
	//   29   56:invokestatic    #95  <Method void ViewCompat.setBackground(View, Drawable)>
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_elevation))
	//*  30   59:aload           8
	//*  31   61:getstatic       #98  <Field int android.support.design.R$styleable.NavigationView_elevation>
	//*  32   64:invokevirtual   #102 <Method boolean TintTypedArray.hasValue(int)>
	//*  33   67:ifeq            84
			ViewCompat.setElevation(((View) (this)), tinttypedarray.getDimensionPixelSize(android.support.design.R.styleable.NavigationView_elevation, 0));
	//   34   70:aload_0         
	//   35   71:aload           8
	//   36   73:getstatic       #98  <Field int android.support.design.R$styleable.NavigationView_elevation>
	//   37   76:iconst_0        
	//   38   77:invokevirtual   #106 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   39   80:i2f             
	//   40   81:invokestatic    #110 <Method void ViewCompat.setElevation(View, float)>
		ViewCompat.setFitsSystemWindows(((View) (this)), tinttypedarray.getBoolean(android.support.design.R.styleable.NavigationView_android_fitsSystemWindows, false));
	//   41   84:aload_0         
	//   42   85:aload           8
	//   43   87:getstatic       #113 <Field int android.support.design.R$styleable.NavigationView_android_fitsSystemWindows>
	//   44   90:iconst_0        
	//   45   91:invokevirtual   #117 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   46   94:invokestatic    #121 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
		maxWidth = tinttypedarray.getDimensionPixelSize(android.support.design.R.styleable.NavigationView_android_maxWidth, 0);
	//   47   97:aload_0         
	//   48   98:aload           8
	//   49  100:getstatic       #124 <Field int android.support.design.R$styleable.NavigationView_android_maxWidth>
	//   50  103:iconst_0        
	//   51  104:invokevirtual   #106 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   52  107:putfield        #126 <Field int maxWidth>
		ColorStateList colorstatelist;
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemIconTint))
	//*  53  110:aload           8
	//*  54  112:getstatic       #129 <Field int android.support.design.R$styleable.NavigationView_itemIconTint>
	//*  55  115:invokevirtual   #102 <Method boolean TintTypedArray.hasValue(int)>
	//*  56  118:ifeq            134
			colorstatelist = tinttypedarray.getColorStateList(android.support.design.R.styleable.NavigationView_itemIconTint);
	//   57  121:aload           8
	//   58  123:getstatic       #129 <Field int android.support.design.R$styleable.NavigationView_itemIconTint>
	//   59  126:invokevirtual   #133 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   60  129:astore          6
		else
	//*  61  131:goto            142
			colorstatelist = createDefaultColorStateList(0x1010038);
	//   62  134:aload_0         
	//   63  135:ldc1            #134 <Int 0x1010038>
	//   64  137:invokespecial   #137 <Method ColorStateList createDefaultColorStateList(int)>
	//   65  140:astore          6
		int j;
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemTextAppearance))
	//*  66  142:aload           8
	//*  67  144:getstatic       #140 <Field int android.support.design.R$styleable.NavigationView_itemTextAppearance>
	//*  68  147:invokevirtual   #102 <Method boolean TintTypedArray.hasValue(int)>
	//*  69  150:ifeq            169
		{
			j = tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_itemTextAppearance, 0);
	//   70  153:aload           8
	//   71  155:getstatic       #140 <Field int android.support.design.R$styleable.NavigationView_itemTextAppearance>
	//   72  158:iconst_0        
	//   73  159:invokevirtual   #143 <Method int TintTypedArray.getResourceId(int, int)>
	//   74  162:istore          4
			i = 1;
	//   75  164:iconst_1        
	//   76  165:istore_3        
		} else
	//*  77  166:goto            174
		{
			i = 0;
	//   78  169:iconst_0        
	//   79  170:istore_3        
			j = i;
	//   80  171:iload_3         
	//   81  172:istore          4
		}
		attributeset = null;
	//   82  174:aconst_null     
	//   83  175:astore_2        
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemTextColor))
	//*  84  176:aload           8
	//*  85  178:getstatic       #146 <Field int android.support.design.R$styleable.NavigationView_itemTextColor>
	//*  86  181:invokevirtual   #102 <Method boolean TintTypedArray.hasValue(int)>
	//*  87  184:ifeq            196
			attributeset = ((AttributeSet) (tinttypedarray.getColorStateList(android.support.design.R.styleable.NavigationView_itemTextColor)));
	//   88  187:aload           8
	//   89  189:getstatic       #146 <Field int android.support.design.R$styleable.NavigationView_itemTextColor>
	//   90  192:invokevirtual   #133 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   91  195:astore_2        
		Object obj = ((Object) (attributeset));
	//   92  196:aload_2         
	//   93  197:astore          7
		if(i == 0)
	//*  94  199:iload_3         
	//*  95  200:ifne            218
		{
			obj = ((Object) (attributeset));
	//   96  203:aload_2         
	//   97  204:astore          7
			if(attributeset == null)
	//*  98  206:aload_2         
	//*  99  207:ifnonnull       218
				obj = ((Object) (createDefaultColorStateList(0x1010036)));
	//  100  210:aload_0         
	//  101  211:ldc1            #147 <Int 0x1010036>
	//  102  213:invokespecial   #137 <Method ColorStateList createDefaultColorStateList(int)>
	//  103  216:astore          7
		}
		attributeset = ((AttributeSet) (tinttypedarray.getDrawable(android.support.design.R.styleable.NavigationView_itemBackground)));
	//  104  218:aload           8
	//  105  220:getstatic       #150 <Field int android.support.design.R$styleable.NavigationView_itemBackground>
	//  106  223:invokevirtual   #89  <Method Drawable TintTypedArray.getDrawable(int)>
	//  107  226:astore_2        
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemHorizontalPadding))
	//* 108  227:aload           8
	//* 109  229:getstatic       #153 <Field int android.support.design.R$styleable.NavigationView_itemHorizontalPadding>
	//* 110  232:invokevirtual   #102 <Method boolean TintTypedArray.hasValue(int)>
	//* 111  235:ifeq            258
		{
			int k = tinttypedarray.getDimensionPixelSize(android.support.design.R.styleable.NavigationView_itemHorizontalPadding, 0);
	//  112  238:aload           8
	//  113  240:getstatic       #153 <Field int android.support.design.R$styleable.NavigationView_itemHorizontalPadding>
	//  114  243:iconst_0        
	//  115  244:invokevirtual   #106 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  116  247:istore          5
			presenter.setItemHorizontalPadding(k);
	//  117  249:aload_0         
	//  118  250:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  119  253:iload           5
	//  120  255:invokevirtual   #157 <Method void NavigationMenuPresenter.setItemHorizontalPadding(int)>
		}
		int l = tinttypedarray.getDimensionPixelSize(android.support.design.R.styleable.NavigationView_itemIconPadding, 0);
	//  121  258:aload           8
	//  122  260:getstatic       #160 <Field int android.support.design.R$styleable.NavigationView_itemIconPadding>
	//  123  263:iconst_0        
	//  124  264:invokevirtual   #106 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  125  267:istore          5
		menu.setCallback(new android.support.v7.view.menu.MenuBuilder.Callback() {

			public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
			{
				return listener != null && listener.onNavigationItemSelected(menuitem);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field NavigationView this$0>
			//    2    4:getfield        #26  <Field NavigationView$OnNavigationItemSelectedListener NavigationView.listener>
			//    3    7:ifnull          28
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field NavigationView this$0>
			//    6   14:getfield        #26  <Field NavigationView$OnNavigationItemSelectedListener NavigationView.listener>
			//    7   17:aload_2         
			//    8   18:invokeinterface #32  <Method boolean NavigationView$OnNavigationItemSelectedListener.onNavigationItemSelected(MenuItem)>
			//    9   23:ifeq            28
			//   10   26:iconst_1        
			//   11   27:ireturn         
			//   12   28:iconst_0        
			//   13   29:ireturn         
			}

			public void onMenuModeChange(MenuBuilder menubuilder)
			{
			//    0    0:return          
			}

			final NavigationView this$0;

			
			{
				this$0 = NavigationView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #16  <Field NavigationView this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #19  <Method void Object()>
			//    5    9:return          
			}
		}
);
	//  126  269:aload_0         
	//  127  270:getfield        #64  <Field NavigationMenu menu>
	//  128  273:new             #6   <Class NavigationView$1>
	//  129  276:dup             
	//  130  277:aload_0         
	//  131  278:invokespecial   #163 <Method void NavigationView$1(NavigationView)>
	//  132  281:invokevirtual   #167 <Method void NavigationMenu.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
		presenter.setId(1);
	//  133  284:aload_0         
	//  134  285:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  135  288:iconst_1        
	//  136  289:invokevirtual   #170 <Method void NavigationMenuPresenter.setId(int)>
		presenter.initForMenu(context, ((MenuBuilder) (menu)));
	//  137  292:aload_0         
	//  138  293:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  139  296:aload_1         
	//  140  297:aload_0         
	//  141  298:getfield        #64  <Field NavigationMenu menu>
	//  142  301:invokevirtual   #174 <Method void NavigationMenuPresenter.initForMenu(Context, MenuBuilder)>
		presenter.setItemIconTintList(colorstatelist);
	//  143  304:aload_0         
	//  144  305:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  145  308:aload           6
	//  146  310:invokevirtual   #178 <Method void NavigationMenuPresenter.setItemIconTintList(ColorStateList)>
		if(i != 0)
	//* 147  313:iload_3         
	//* 148  314:ifeq            326
			presenter.setItemTextAppearance(j);
	//  149  317:aload_0         
	//  150  318:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  151  321:iload           4
	//  152  323:invokevirtual   #181 <Method void NavigationMenuPresenter.setItemTextAppearance(int)>
		presenter.setItemTextColor(((ColorStateList) (obj)));
	//  153  326:aload_0         
	//  154  327:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  155  330:aload           7
	//  156  332:invokevirtual   #184 <Method void NavigationMenuPresenter.setItemTextColor(ColorStateList)>
		presenter.setItemBackground(((Drawable) (attributeset)));
	//  157  335:aload_0         
	//  158  336:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  159  339:aload_2         
	//  160  340:invokevirtual   #188 <Method void NavigationMenuPresenter.setItemBackground(Drawable)>
		presenter.setItemIconPadding(l);
	//  161  343:aload_0         
	//  162  344:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  163  347:iload           5
	//  164  349:invokevirtual   #191 <Method void NavigationMenuPresenter.setItemIconPadding(int)>
		menu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (presenter)));
	//  165  352:aload_0         
	//  166  353:getfield        #64  <Field NavigationMenu menu>
	//  167  356:aload_0         
	//  168  357:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  169  360:invokevirtual   #195 <Method void NavigationMenu.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		addView((View)presenter.getMenuView(((android.view.ViewGroup) (this))));
	//  170  363:aload_0         
	//  171  364:aload_0         
	//  172  365:getfield        #58  <Field NavigationMenuPresenter presenter>
	//  173  368:aload_0         
	//  174  369:invokevirtual   #199 <Method android.support.v7.view.menu.MenuView NavigationMenuPresenter.getMenuView(android.view.ViewGroup)>
	//  175  372:checkcast       #201 <Class View>
	//  176  375:invokevirtual   #205 <Method void addView(View)>
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_menu))
	//* 177  378:aload           8
	//* 178  380:getstatic       #208 <Field int android.support.design.R$styleable.NavigationView_menu>
	//* 179  383:invokevirtual   #102 <Method boolean TintTypedArray.hasValue(int)>
	//* 180  386:ifeq            402
			inflateMenu(tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_menu, 0));
	//  181  389:aload_0         
	//  182  390:aload           8
	//  183  392:getstatic       #208 <Field int android.support.design.R$styleable.NavigationView_menu>
	//  184  395:iconst_0        
	//  185  396:invokevirtual   #143 <Method int TintTypedArray.getResourceId(int, int)>
	//  186  399:invokevirtual   #211 <Method void inflateMenu(int)>
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_headerLayout))
	//* 187  402:aload           8
	//* 188  404:getstatic       #214 <Field int android.support.design.R$styleable.NavigationView_headerLayout>
	//* 189  407:invokevirtual   #102 <Method boolean TintTypedArray.hasValue(int)>
	//* 190  410:ifeq            427
			inflateHeaderView(tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_headerLayout, 0));
	//  191  413:aload_0         
	//  192  414:aload           8
	//  193  416:getstatic       #214 <Field int android.support.design.R$styleable.NavigationView_headerLayout>
	//  194  419:iconst_0        
	//  195  420:invokevirtual   #143 <Method int TintTypedArray.getResourceId(int, int)>
	//  196  423:invokevirtual   #218 <Method View inflateHeaderView(int)>
	//  197  426:pop             
		tinttypedarray.recycle();
	//  198  427:aload           8
	//  199  429:invokevirtual   #221 <Method void TintTypedArray.recycle()>
	//  200  432:return          
	}

	private ColorStateList createDefaultColorStateList(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #223 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #224 <Method void TypedValue()>
	//    3    7:astore          5
		if(!getContext().getTheme().resolveAttribute(i, typedvalue, true))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #228 <Method Context getContext()>
	//*   6   13:invokevirtual   #234 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   16:iload_1         
	//*   8   17:aload           5
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #240 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifne            28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		ColorStateList colorstatelist = AppCompatResources.getColorStateList(getContext(), typedvalue.resourceId);
	//   14   28:aload_0         
	//   15   29:invokevirtual   #228 <Method Context getContext()>
	//   16   32:aload           5
	//   17   34:getfield        #243 <Field int TypedValue.resourceId>
	//   18   37:invokestatic    #248 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   19   40:astore          4
		if(!getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorPrimary, typedvalue, true))
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #228 <Method Context getContext()>
	//*  22   46:invokevirtual   #234 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  23   49:getstatic       #253 <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//*  24   52:aload           5
	//*  25   54:iconst_1        
	//*  26   55:invokevirtual   #240 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  27   58:ifne            63
		{
			return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
		} else
		{
			i = typedvalue.data;
	//   30   63:aload           5
	//   31   65:getfield        #256 <Field int TypedValue.data>
	//   32   68:istore_1        
			int j = colorstatelist.getDefaultColor();
	//   33   69:aload           4
	//   34   71:invokevirtual   #262 <Method int ColorStateList.getDefaultColor()>
	//   35   74:istore_2        
			int ai[] = DISABLED_STATE_SET;
	//   36   75:getstatic       #37  <Field int[] DISABLED_STATE_SET>
	//   37   78:astore          5
			int ai1[] = CHECKED_STATE_SET;
	//   38   80:getstatic       #34  <Field int[] CHECKED_STATE_SET>
	//   39   83:astore          6
			int ai2[] = EMPTY_STATE_SET;
	//   40   85:getstatic       #265 <Field int[] EMPTY_STATE_SET>
	//   41   88:astore          7
			int k = colorstatelist.getColorForState(DISABLED_STATE_SET, j);
	//   42   90:aload           4
	//   43   92:getstatic       #37  <Field int[] DISABLED_STATE_SET>
	//   44   95:iload_2         
	//   45   96:invokevirtual   #269 <Method int ColorStateList.getColorForState(int[], int)>
	//   46   99:istore_3        
			return new ColorStateList(new int[][] {
				ai, ai1, ai2
			}, new int[] {
				k, i, j
			});
	//   47  100:new             #258 <Class ColorStateList>
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
	//   77  138:invokespecial   #273 <Method void ColorStateList(int[][], int[])>
	//   78  141:areturn         
		}
	}

	private MenuInflater getMenuInflater()
	{
		if(menuInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #277 <Field MenuInflater menuInflater>
	//*   2    4:ifnonnull       22
			menuInflater = ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #279 <Class SupportMenuInflater>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #228 <Method Context getContext()>
	//    8   16:invokespecial   #280 <Method void SupportMenuInflater(Context)>
	//    9   19:putfield        #277 <Field MenuInflater menuInflater>
		return menuInflater;
	//   10   22:aload_0         
	//   11   23:getfield        #277 <Field MenuInflater menuInflater>
	//   12   26:areturn         
	}

	public void addHeaderView(View view)
	{
		presenter.addHeaderView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #284 <Method void NavigationMenuPresenter.addHeaderView(View)>
	//    4    8:return          
	}

	public MenuItem getCheckedItem()
	{
		return ((MenuItem) (presenter.getCheckedItem()));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #291 <Method MenuItemImpl NavigationMenuPresenter.getCheckedItem()>
	//    3    7:areturn         
	}

	public int getHeaderCount()
	{
		return presenter.getHeaderCount();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #295 <Method int NavigationMenuPresenter.getHeaderCount()>
	//    3    7:ireturn         
	}

	public View getHeaderView(int i)
	{
		return presenter.getHeaderView(i);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #298 <Method View NavigationMenuPresenter.getHeaderView(int)>
	//    4    8:areturn         
	}

	public Drawable getItemBackground()
	{
		return presenter.getItemBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #302 <Method Drawable NavigationMenuPresenter.getItemBackground()>
	//    3    7:areturn         
	}

	public int getItemHorizontalPadding()
	{
		return presenter.getItemHorizontalPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #306 <Method int NavigationMenuPresenter.getItemHorizontalPadding()>
	//    3    7:ireturn         
	}

	public int getItemIconPadding()
	{
		return presenter.getItemIconPadding();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #309 <Method int NavigationMenuPresenter.getItemIconPadding()>
	//    3    7:ireturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return presenter.getItemTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #314 <Method ColorStateList NavigationMenuPresenter.getItemTintList()>
	//    3    7:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return presenter.getItemTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:invokevirtual   #317 <Method ColorStateList NavigationMenuPresenter.getItemTextColor()>
	//    3    7:areturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (menu));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field NavigationMenu menu>
	//    2    4:areturn         
	}

	public View inflateHeaderView(int i)
	{
		return presenter.inflateHeaderView(i);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #321 <Method View NavigationMenuPresenter.inflateHeaderView(int)>
	//    4    8:areturn         
	}

	public void inflateMenu(int i)
	{
		presenter.setUpdateSuspended(true);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #325 <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
		getMenuInflater().inflate(i, ((Menu) (menu)));
	//    4    8:aload_0         
	//    5    9:invokespecial   #327 <Method MenuInflater getMenuInflater()>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #64  <Field NavigationMenu menu>
	//    9   17:invokevirtual   #333 <Method void MenuInflater.inflate(int, Menu)>
		presenter.setUpdateSuspended(false);
	//   10   20:aload_0         
	//   11   21:getfield        #58  <Field NavigationMenuPresenter presenter>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #325 <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
		presenter.updateMenuView(false);
	//   14   28:aload_0         
	//   15   29:getfield        #58  <Field NavigationMenuPresenter presenter>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #336 <Method void NavigationMenuPresenter.updateMenuView(boolean)>
	//   18   36:return          
	}

	protected void onInsetsChanged(WindowInsetsCompat windowinsetscompat)
	{
		presenter.dispatchApplyWindowInsets(windowinsetscompat);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #345 <Method void NavigationMenuPresenter.dispatchApplyWindowInsets(WindowInsetsCompat)>
	//    4    8:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #353 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		if(k != 0x80000000)
	//*   3    5:iload_3         
	//*   4    6:ldc2            #354 <Int 0x80000000>
	//*   5    9:icmpeq          33
		{
			if(k == 0)
	//*   6   12:iload_3         
	//*   7   13:ifeq            19
	//*   8   16:goto            51
				i = android.view.View.MeasureSpec.makeMeasureSpec(maxWidth, 0x40000000);
	//    9   19:aload_0         
	//   10   20:getfield        #126 <Field int maxWidth>
	//   11   23:ldc2            #355 <Int 0x40000000>
	//   12   26:invokestatic    #358 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   29:istore_1        
		} else
	//*  14   30:goto            51
		{
			i = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(android.view.View.MeasureSpec.getSize(i), maxWidth), 0x40000000);
	//   15   33:iload_1         
	//   16   34:invokestatic    #361 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   17   37:aload_0         
	//   18   38:getfield        #126 <Field int maxWidth>
	//   19   41:invokestatic    #366 <Method int Math.min(int, int)>
	//   20   44:ldc2            #355 <Int 0x40000000>
	//   21   47:invokestatic    #358 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   22   50:istore_1        
		}
		super.onMeasure(i, j);
	//   23   51:aload_0         
	//   24   52:iload_1         
	//   25   53:iload_2         
	//   26   54:invokespecial   #368 <Method void ScrimInsetsFrameLayout.onMeasure(int, int)>
	//   27   57:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #11  <Class NavigationView$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #372 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		} else
		{
			parcelable = ((Parcelable) ((SavedState)parcelable));
	//    7   13:aload_1         
	//    8   14:checkcast       #11  <Class NavigationView$SavedState>
	//    9   17:astore_1        
			super.onRestoreInstanceState(((SavedState) (parcelable)).getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:invokevirtual   #376 <Method Parcelable NavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #372 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
			menu.restorePresenterStates(((SavedState) (parcelable)).menuState);
	//   14   26:aload_0         
	//   15   27:getfield        #64  <Field NavigationMenu menu>
	//   16   30:aload_1         
	//   17   31:getfield        #380 <Field Bundle NavigationView$SavedState.menuState>
	//   18   34:invokevirtual   #384 <Method void NavigationMenu.restorePresenterStates(Bundle)>
			return;
	//   19   37:return          
		}
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #11  <Class NavigationView$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #387 <Method Parcelable ScrimInsetsFrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #389 <Method void NavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.menuState = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #391 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #392 <Method void Bundle()>
	//   10   20:putfield        #380 <Field Bundle NavigationView$SavedState.menuState>
		menu.savePresenterStates(savedstate.menuState);
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field NavigationMenu menu>
	//   13   27:aload_1         
	//   14   28:getfield        #380 <Field Bundle NavigationView$SavedState.menuState>
	//   15   31:invokevirtual   #395 <Method void NavigationMenu.savePresenterStates(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void removeHeaderView(View view)
	{
		presenter.removeHeaderView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #398 <Method void NavigationMenuPresenter.removeHeaderView(View)>
	//    4    8:return          
	}

	public void setCheckedItem(int i)
	{
		MenuItem menuitem = menu.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field NavigationMenu menu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #404 <Method MenuItem NavigationMenu.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          24
			presenter.setCheckedItem((MenuItemImpl)menuitem);
	//    7   13:aload_0         
	//    8   14:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    9   17:aload_2         
	//   10   18:checkcast       #406 <Class MenuItemImpl>
	//   11   21:invokevirtual   #409 <Method void NavigationMenuPresenter.setCheckedItem(MenuItemImpl)>
	//   12   24:return          
	}

	public void setCheckedItem(MenuItem menuitem)
	{
		menuitem = menu.findItem(menuitem.getItemId());
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field NavigationMenu menu>
	//    2    4:aload_1         
	//    3    5:invokeinterface #415 <Method int MenuItem.getItemId()>
	//    4   10:invokevirtual   #404 <Method MenuItem NavigationMenu.findItem(int)>
	//    5   13:astore_1        
		if(menuitem != null)
	//*   6   14:aload_1         
	//*   7   15:ifnull          30
		{
			presenter.setCheckedItem((MenuItemImpl)menuitem);
	//    8   18:aload_0         
	//    9   19:getfield        #58  <Field NavigationMenuPresenter presenter>
	//   10   22:aload_1         
	//   11   23:checkcast       #406 <Class MenuItemImpl>
	//   12   26:invokevirtual   #409 <Method void NavigationMenuPresenter.setCheckedItem(MenuItemImpl)>
			return;
	//   13   29:return          
		} else
		{
			throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
	//   14   30:new             #417 <Class IllegalArgumentException>
	//   15   33:dup             
	//   16   34:ldc2            #419 <String "Called setCheckedItem(MenuItem) with an item that is not in the current menu.">
	//   17   37:invokespecial   #422 <Method void IllegalArgumentException(String)>
	//   18   40:athrow          
		}
	}

	public void setItemBackground(Drawable drawable)
	{
		presenter.setItemBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #188 <Method void NavigationMenuPresenter.setItemBackground(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int i)
	{
		setItemBackground(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #228 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #429 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #430 <Method void setItemBackground(Drawable)>
	//    6   12:return          
	}

	public void setItemHorizontalPadding(int i)
	{
		presenter.setItemHorizontalPadding(i);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #157 <Method void NavigationMenuPresenter.setItemHorizontalPadding(int)>
	//    4    8:return          
	}

	public void setItemHorizontalPaddingResource(int i)
	{
		presenter.setItemHorizontalPadding(getResources().getDimensionPixelSize(i));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #436 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #440 <Method int Resources.getDimensionPixelSize(int)>
	//    6   12:invokevirtual   #157 <Method void NavigationMenuPresenter.setItemHorizontalPadding(int)>
	//    7   15:return          
	}

	public void setItemIconPadding(int i)
	{
		presenter.setItemIconPadding(i);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #191 <Method void NavigationMenuPresenter.setItemIconPadding(int)>
	//    4    8:return          
	}

	public void setItemIconPaddingResource(int i)
	{
		presenter.setItemIconPadding(getResources().getDimensionPixelSize(i));
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_0         
	//    3    5:invokevirtual   #436 <Method Resources getResources()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #440 <Method int Resources.getDimensionPixelSize(int)>
	//    6   12:invokevirtual   #191 <Method void NavigationMenuPresenter.setItemIconPadding(int)>
	//    7   15:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		presenter.setItemIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #178 <Method void NavigationMenuPresenter.setItemIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearance(int i)
	{
		presenter.setItemTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #181 <Method void NavigationMenuPresenter.setItemTextAppearance(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		presenter.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field NavigationMenuPresenter presenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #184 <Method void NavigationMenuPresenter.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onnavigationitemselectedlistener)
	{
		listener = onnavigationitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #446 <Field NavigationView$OnNavigationItemSelectedListener listener>
	//    3    5:return          
	}

	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private static final int DISABLED_STATE_SET[] = {
		0xfefeff62
	};
	private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
	OnNavigationItemSelectedListener listener;
	private final int maxWidth;
	private final NavigationMenu menu;
	private MenuInflater menuInflater;
	private final NavigationMenuPresenter presenter;

	static 
	{
	//    0    0:iconst_1        
	//    1    1:newarray        int[]
	//    2    3:dup             
	//    3    4:iconst_0        
	//    4    5:ldc1            #32  <Int 0x10100a0>
	//    5    7:iastore         
	//    6    8:putstatic       #34  <Field int[] CHECKED_STATE_SET>
	//    7   11:iconst_1        
	//    8   12:newarray        int[]
	//    9   14:dup             
	//   10   15:iconst_0        
	//   11   16:ldc1            #35  <Int 0xfefeff62>
	//   12   18:iastore         
	//   13   19:putstatic       #37  <Field int[] DISABLED_STATE_SET>
	//*  14   22:return          
	}
}
