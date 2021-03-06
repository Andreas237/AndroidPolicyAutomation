// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.design.widget;

import android.content.Context;
import android.content.res.ColorStateList;
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

// Referenced classes of package android.support.design.widget:
//			ThemeUtils

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
		this(context, attributeset, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iconst_0        
	//    4    4:invokespecial   #46  <Method void NavigationView(Context, AttributeSet, int)>
	//    5    7:return          
	}

	public NavigationView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #47  <Method void ScrimInsetsFrameLayout(Context, AttributeSet, int)>
		mPresenter = new NavigationMenuPresenter();
	//    5    7:aload_0         
	//    6    8:new             #49  <Class NavigationMenuPresenter>
	//    7   11:dup             
	//    8   12:invokespecial   #51  <Method void NavigationMenuPresenter()>
	//    9   15:putfield        #53  <Field NavigationMenuPresenter mPresenter>
		ThemeUtils.checkAppCompatTheme(context);
	//   10   18:aload_1         
	//   11   19:invokestatic    #58  <Method void ThemeUtils.checkAppCompatTheme(Context)>
		mMenu = new NavigationMenu(context);
	//   12   22:aload_0         
	//   13   23:new             #60  <Class NavigationMenu>
	//   14   26:dup             
	//   15   27:aload_1         
	//   16   28:invokespecial   #62  <Method void NavigationMenu(Context)>
	//   17   31:putfield        #64  <Field NavigationMenu mMenu>
		TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.design.R.styleable.NavigationView, i, android.support.design.R.style.Widget_Design_NavigationView);
	//   18   34:aload_1         
	//   19   35:aload_2         
	//   20   36:getstatic       #69  <Field int[] android.support.design.R$styleable.NavigationView>
	//   21   39:iload_3         
	//   22   40:getstatic       #74  <Field int android.support.design.R$style.Widget_Design_NavigationView>
	//   23   43:invokestatic    #80  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   24   46:astore          7
		ViewCompat.setBackground(((View) (this)), tinttypedarray.getDrawable(android.support.design.R.styleable.NavigationView_android_background));
	//   25   48:aload_0         
	//   26   49:aload           7
	//   27   51:getstatic       #83  <Field int android.support.design.R$styleable.NavigationView_android_background>
	//   28   54:invokevirtual   #87  <Method Drawable TintTypedArray.getDrawable(int)>
	//   29   57:invokestatic    #93  <Method void ViewCompat.setBackground(View, Drawable)>
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_elevation))
	//*  30   60:aload           7
	//*  31   62:getstatic       #96  <Field int android.support.design.R$styleable.NavigationView_elevation>
	//*  32   65:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//*  33   68:ifeq            85
			ViewCompat.setElevation(((View) (this)), tinttypedarray.getDimensionPixelSize(android.support.design.R.styleable.NavigationView_elevation, 0));
	//   34   71:aload_0         
	//   35   72:aload           7
	//   36   74:getstatic       #96  <Field int android.support.design.R$styleable.NavigationView_elevation>
	//   37   77:iconst_0        
	//   38   78:invokevirtual   #104 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   39   81:i2f             
	//   40   82:invokestatic    #108 <Method void ViewCompat.setElevation(View, float)>
		ViewCompat.setFitsSystemWindows(((View) (this)), tinttypedarray.getBoolean(android.support.design.R.styleable.NavigationView_android_fitsSystemWindows, false));
	//   41   85:aload_0         
	//   42   86:aload           7
	//   43   88:getstatic       #111 <Field int android.support.design.R$styleable.NavigationView_android_fitsSystemWindows>
	//   44   91:iconst_0        
	//   45   92:invokevirtual   #115 <Method boolean TintTypedArray.getBoolean(int, boolean)>
	//   46   95:invokestatic    #119 <Method void ViewCompat.setFitsSystemWindows(View, boolean)>
		mMaxWidth = tinttypedarray.getDimensionPixelSize(android.support.design.R.styleable.NavigationView_android_maxWidth, 0);
	//   47   98:aload_0         
	//   48   99:aload           7
	//   49  101:getstatic       #122 <Field int android.support.design.R$styleable.NavigationView_android_maxWidth>
	//   50  104:iconst_0        
	//   51  105:invokevirtual   #104 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//   52  108:putfield        #124 <Field int mMaxWidth>
		ColorStateList colorstatelist;
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemIconTint))
	//*  53  111:aload           7
	//*  54  113:getstatic       #127 <Field int android.support.design.R$styleable.NavigationView_itemIconTint>
	//*  55  116:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//*  56  119:ifeq            135
			colorstatelist = tinttypedarray.getColorStateList(android.support.design.R.styleable.NavigationView_itemIconTint);
	//   57  122:aload           7
	//   58  124:getstatic       #127 <Field int android.support.design.R$styleable.NavigationView_itemIconTint>
	//   59  127:invokevirtual   #131 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   60  130:astore          5
		else
	//*  61  132:goto            143
			colorstatelist = createDefaultColorStateList(0x1010038);
	//   62  135:aload_0         
	//   63  136:ldc1            #132 <Int 0x1010038>
	//   64  138:invokespecial   #135 <Method ColorStateList createDefaultColorStateList(int)>
	//   65  141:astore          5
		int j;
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemTextAppearance))
	//*  66  143:aload           7
	//*  67  145:getstatic       #138 <Field int android.support.design.R$styleable.NavigationView_itemTextAppearance>
	//*  68  148:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//*  69  151:ifeq            170
		{
			j = tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_itemTextAppearance, 0);
	//   70  154:aload           7
	//   71  156:getstatic       #138 <Field int android.support.design.R$styleable.NavigationView_itemTextAppearance>
	//   72  159:iconst_0        
	//   73  160:invokevirtual   #141 <Method int TintTypedArray.getResourceId(int, int)>
	//   74  163:istore          4
			i = 1;
	//   75  165:iconst_1        
	//   76  166:istore_3        
		} else
	//*  77  167:goto            175
		{
			i = 0;
	//   78  170:iconst_0        
	//   79  171:istore_3        
			j = i;
	//   80  172:iload_3         
	//   81  173:istore          4
		}
		attributeset = null;
	//   82  175:aconst_null     
	//   83  176:astore_2        
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemTextColor))
	//*  84  177:aload           7
	//*  85  179:getstatic       #144 <Field int android.support.design.R$styleable.NavigationView_itemTextColor>
	//*  86  182:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//*  87  185:ifeq            197
			attributeset = ((AttributeSet) (tinttypedarray.getColorStateList(android.support.design.R.styleable.NavigationView_itemTextColor)));
	//   88  188:aload           7
	//   89  190:getstatic       #144 <Field int android.support.design.R$styleable.NavigationView_itemTextColor>
	//   90  193:invokevirtual   #131 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   91  196:astore_2        
		Object obj = ((Object) (attributeset));
	//   92  197:aload_2         
	//   93  198:astore          6
		if(i == 0)
	//*  94  200:iload_3         
	//*  95  201:ifne            219
		{
			obj = ((Object) (attributeset));
	//   96  204:aload_2         
	//   97  205:astore          6
			if(attributeset == null)
	//*  98  207:aload_2         
	//*  99  208:ifnonnull       219
				obj = ((Object) (createDefaultColorStateList(0x1010036)));
	//  100  211:aload_0         
	//  101  212:ldc1            #145 <Int 0x1010036>
	//  102  214:invokespecial   #135 <Method ColorStateList createDefaultColorStateList(int)>
	//  103  217:astore          6
		}
		attributeset = ((AttributeSet) (tinttypedarray.getDrawable(android.support.design.R.styleable.NavigationView_itemBackground)));
	//  104  219:aload           7
	//  105  221:getstatic       #148 <Field int android.support.design.R$styleable.NavigationView_itemBackground>
	//  106  224:invokevirtual   #87  <Method Drawable TintTypedArray.getDrawable(int)>
	//  107  227:astore_2        
		mMenu.setCallback(new android.support.v7.view.menu.MenuBuilder.Callback() {

			public boolean onMenuItemSelected(MenuBuilder menubuilder, MenuItem menuitem)
			{
				return mListener != null && mListener.onNavigationItemSelected(menuitem);
			//    0    0:aload_0         
			//    1    1:getfield        #16  <Field NavigationView this$0>
			//    2    4:getfield        #26  <Field NavigationView$OnNavigationItemSelectedListener NavigationView.mListener>
			//    3    7:ifnull          28
			//    4   10:aload_0         
			//    5   11:getfield        #16  <Field NavigationView this$0>
			//    6   14:getfield        #26  <Field NavigationView$OnNavigationItemSelectedListener NavigationView.mListener>
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
	//  108  228:aload_0         
	//  109  229:getfield        #64  <Field NavigationMenu mMenu>
	//  110  232:new             #6   <Class NavigationView$1>
	//  111  235:dup             
	//  112  236:aload_0         
	//  113  237:invokespecial   #151 <Method void NavigationView$1(NavigationView)>
	//  114  240:invokevirtual   #155 <Method void NavigationMenu.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
		mPresenter.setId(1);
	//  115  243:aload_0         
	//  116  244:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//  117  247:iconst_1        
	//  118  248:invokevirtual   #159 <Method void NavigationMenuPresenter.setId(int)>
		mPresenter.initForMenu(context, ((MenuBuilder) (mMenu)));
	//  119  251:aload_0         
	//  120  252:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//  121  255:aload_1         
	//  122  256:aload_0         
	//  123  257:getfield        #64  <Field NavigationMenu mMenu>
	//  124  260:invokevirtual   #163 <Method void NavigationMenuPresenter.initForMenu(Context, MenuBuilder)>
		mPresenter.setItemIconTintList(colorstatelist);
	//  125  263:aload_0         
	//  126  264:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//  127  267:aload           5
	//  128  269:invokevirtual   #167 <Method void NavigationMenuPresenter.setItemIconTintList(ColorStateList)>
		if(i != 0)
	//* 129  272:iload_3         
	//* 130  273:ifeq            285
			mPresenter.setItemTextAppearance(j);
	//  131  276:aload_0         
	//  132  277:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//  133  280:iload           4
	//  134  282:invokevirtual   #170 <Method void NavigationMenuPresenter.setItemTextAppearance(int)>
		mPresenter.setItemTextColor(((ColorStateList) (obj)));
	//  135  285:aload_0         
	//  136  286:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//  137  289:aload           6
	//  138  291:invokevirtual   #173 <Method void NavigationMenuPresenter.setItemTextColor(ColorStateList)>
		mPresenter.setItemBackground(((Drawable) (attributeset)));
	//  139  294:aload_0         
	//  140  295:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//  141  298:aload_2         
	//  142  299:invokevirtual   #177 <Method void NavigationMenuPresenter.setItemBackground(Drawable)>
		mMenu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mPresenter)));
	//  143  302:aload_0         
	//  144  303:getfield        #64  <Field NavigationMenu mMenu>
	//  145  306:aload_0         
	//  146  307:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//  147  310:invokevirtual   #181 <Method void NavigationMenu.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
		addView((View)mPresenter.getMenuView(((android.view.ViewGroup) (this))));
	//  148  313:aload_0         
	//  149  314:aload_0         
	//  150  315:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//  151  318:aload_0         
	//  152  319:invokevirtual   #185 <Method android.support.v7.view.menu.MenuView NavigationMenuPresenter.getMenuView(android.view.ViewGroup)>
	//  153  322:checkcast       #187 <Class View>
	//  154  325:invokevirtual   #191 <Method void addView(View)>
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_menu))
	//* 155  328:aload           7
	//* 156  330:getstatic       #194 <Field int android.support.design.R$styleable.NavigationView_menu>
	//* 157  333:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//* 158  336:ifeq            352
			inflateMenu(tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_menu, 0));
	//  159  339:aload_0         
	//  160  340:aload           7
	//  161  342:getstatic       #194 <Field int android.support.design.R$styleable.NavigationView_menu>
	//  162  345:iconst_0        
	//  163  346:invokevirtual   #141 <Method int TintTypedArray.getResourceId(int, int)>
	//  164  349:invokevirtual   #197 <Method void inflateMenu(int)>
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_headerLayout))
	//* 165  352:aload           7
	//* 166  354:getstatic       #200 <Field int android.support.design.R$styleable.NavigationView_headerLayout>
	//* 167  357:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//* 168  360:ifeq            377
			inflateHeaderView(tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_headerLayout, 0));
	//  169  363:aload_0         
	//  170  364:aload           7
	//  171  366:getstatic       #200 <Field int android.support.design.R$styleable.NavigationView_headerLayout>
	//  172  369:iconst_0        
	//  173  370:invokevirtual   #141 <Method int TintTypedArray.getResourceId(int, int)>
	//  174  373:invokevirtual   #204 <Method View inflateHeaderView(int)>
	//  175  376:pop             
		tinttypedarray.recycle();
	//  176  377:aload           7
	//  177  379:invokevirtual   #207 <Method void TintTypedArray.recycle()>
	//  178  382:return          
	}

	private ColorStateList createDefaultColorStateList(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #209 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #210 <Method void TypedValue()>
	//    3    7:astore          5
		if(!getContext().getTheme().resolveAttribute(i, typedvalue, true))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #214 <Method Context getContext()>
	//*   6   13:invokevirtual   #220 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   16:iload_1         
	//*   8   17:aload           5
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #226 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifne            28
			return null;
	//   12   26:aconst_null     
	//   13   27:areturn         
		ColorStateList colorstatelist = AppCompatResources.getColorStateList(getContext(), typedvalue.resourceId);
	//   14   28:aload_0         
	//   15   29:invokevirtual   #214 <Method Context getContext()>
	//   16   32:aload           5
	//   17   34:getfield        #229 <Field int TypedValue.resourceId>
	//   18   37:invokestatic    #234 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   19   40:astore          4
		if(!getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorPrimary, typedvalue, true))
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #214 <Method Context getContext()>
	//*  22   46:invokevirtual   #220 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  23   49:getstatic       #239 <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//*  24   52:aload           5
	//*  25   54:iconst_1        
	//*  26   55:invokevirtual   #226 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  27   58:ifne            63
		{
			return null;
	//   28   61:aconst_null     
	//   29   62:areturn         
		} else
		{
			i = typedvalue.data;
	//   30   63:aload           5
	//   31   65:getfield        #242 <Field int TypedValue.data>
	//   32   68:istore_1        
			int j = colorstatelist.getDefaultColor();
	//   33   69:aload           4
	//   34   71:invokevirtual   #248 <Method int ColorStateList.getDefaultColor()>
	//   35   74:istore_2        
			int ai[] = DISABLED_STATE_SET;
	//   36   75:getstatic       #37  <Field int[] DISABLED_STATE_SET>
	//   37   78:astore          5
			int ai1[] = CHECKED_STATE_SET;
	//   38   80:getstatic       #34  <Field int[] CHECKED_STATE_SET>
	//   39   83:astore          6
			int ai2[] = EMPTY_STATE_SET;
	//   40   85:getstatic       #251 <Field int[] EMPTY_STATE_SET>
	//   41   88:astore          7
			int k = colorstatelist.getColorForState(DISABLED_STATE_SET, j);
	//   42   90:aload           4
	//   43   92:getstatic       #37  <Field int[] DISABLED_STATE_SET>
	//   44   95:iload_2         
	//   45   96:invokevirtual   #255 <Method int ColorStateList.getColorForState(int[], int)>
	//   46   99:istore_3        
			return new ColorStateList(new int[][] {
				ai, ai1, ai2
			}, new int[] {
				k, i, j
			});
	//   47  100:new             #244 <Class ColorStateList>
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
	//   77  138:invokespecial   #259 <Method void ColorStateList(int[][], int[])>
	//   78  141:areturn         
		}
	}

	private MenuInflater getMenuInflater()
	{
		if(mMenuInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #263 <Field MenuInflater mMenuInflater>
	//*   2    4:ifnonnull       22
			mMenuInflater = ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #265 <Class SupportMenuInflater>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #214 <Method Context getContext()>
	//    8   16:invokespecial   #266 <Method void SupportMenuInflater(Context)>
	//    9   19:putfield        #263 <Field MenuInflater mMenuInflater>
		return mMenuInflater;
	//   10   22:aload_0         
	//   11   23:getfield        #263 <Field MenuInflater mMenuInflater>
	//   12   26:areturn         
	}

	public void addHeaderView(View view)
	{
		mPresenter.addHeaderView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #270 <Method void NavigationMenuPresenter.addHeaderView(View)>
	//    4    8:return          
	}

	public int getHeaderCount()
	{
		return mPresenter.getHeaderCount();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:invokevirtual   #274 <Method int NavigationMenuPresenter.getHeaderCount()>
	//    3    7:ireturn         
	}

	public View getHeaderView(int i)
	{
		return mPresenter.getHeaderView(i);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #277 <Method View NavigationMenuPresenter.getHeaderView(int)>
	//    4    8:areturn         
	}

	public Drawable getItemBackground()
	{
		return mPresenter.getItemBackground();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:invokevirtual   #282 <Method Drawable NavigationMenuPresenter.getItemBackground()>
	//    3    7:areturn         
	}

	public ColorStateList getItemIconTintList()
	{
		return mPresenter.getItemTintList();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:invokevirtual   #288 <Method ColorStateList NavigationMenuPresenter.getItemTintList()>
	//    3    7:areturn         
	}

	public ColorStateList getItemTextColor()
	{
		return mPresenter.getItemTextColor();
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:invokevirtual   #291 <Method ColorStateList NavigationMenuPresenter.getItemTextColor()>
	//    3    7:areturn         
	}

	public Menu getMenu()
	{
		return ((Menu) (mMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field NavigationMenu mMenu>
	//    2    4:areturn         
	}

	public View inflateHeaderView(int i)
	{
		return mPresenter.inflateHeaderView(i);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #295 <Method View NavigationMenuPresenter.inflateHeaderView(int)>
	//    4    8:areturn         
	}

	public void inflateMenu(int i)
	{
		mPresenter.setUpdateSuspended(true);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:iconst_1        
	//    3    5:invokevirtual   #299 <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
		getMenuInflater().inflate(i, ((Menu) (mMenu)));
	//    4    8:aload_0         
	//    5    9:invokespecial   #301 <Method MenuInflater getMenuInflater()>
	//    6   12:iload_1         
	//    7   13:aload_0         
	//    8   14:getfield        #64  <Field NavigationMenu mMenu>
	//    9   17:invokevirtual   #307 <Method void MenuInflater.inflate(int, Menu)>
		mPresenter.setUpdateSuspended(false);
	//   10   20:aload_0         
	//   11   21:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//   12   24:iconst_0        
	//   13   25:invokevirtual   #299 <Method void NavigationMenuPresenter.setUpdateSuspended(boolean)>
		mPresenter.updateMenuView(false);
	//   14   28:aload_0         
	//   15   29:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//   16   32:iconst_0        
	//   17   33:invokevirtual   #310 <Method void NavigationMenuPresenter.updateMenuView(boolean)>
	//   18   36:return          
	}

	protected void onInsetsChanged(WindowInsetsCompat windowinsetscompat)
	{
		mPresenter.dispatchApplyWindowInsets(windowinsetscompat);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #319 <Method void NavigationMenuPresenter.dispatchApplyWindowInsets(WindowInsetsCompat)>
	//    4    8:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #327 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		if(k != 0x80000000)
	//*   3    5:iload_3         
	//*   4    6:ldc2            #328 <Int 0x80000000>
	//*   5    9:icmpeq          33
		{
			if(k == 0)
	//*   6   12:iload_3         
	//*   7   13:ifeq            19
	//*   8   16:goto            51
				i = android.view.View.MeasureSpec.makeMeasureSpec(mMaxWidth, 0x40000000);
	//    9   19:aload_0         
	//   10   20:getfield        #124 <Field int mMaxWidth>
	//   11   23:ldc2            #329 <Int 0x40000000>
	//   12   26:invokestatic    #332 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   13   29:istore_1        
		} else
	//*  14   30:goto            51
		{
			i = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(android.view.View.MeasureSpec.getSize(i), mMaxWidth), 0x40000000);
	//   15   33:iload_1         
	//   16   34:invokestatic    #335 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   17   37:aload_0         
	//   18   38:getfield        #124 <Field int mMaxWidth>
	//   19   41:invokestatic    #340 <Method int Math.min(int, int)>
	//   20   44:ldc2            #329 <Int 0x40000000>
	//   21   47:invokestatic    #332 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   22   50:istore_1        
		}
		super.onMeasure(i, j);
	//   23   51:aload_0         
	//   24   52:iload_1         
	//   25   53:iload_2         
	//   26   54:invokespecial   #342 <Method void ScrimInsetsFrameLayout.onMeasure(int, int)>
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
	//    5    9:invokespecial   #346 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #350 <Method Parcelable NavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #346 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
			mMenu.restorePresenterStates(((SavedState) (parcelable)).menuState);
	//   14   26:aload_0         
	//   15   27:getfield        #64  <Field NavigationMenu mMenu>
	//   16   30:aload_1         
	//   17   31:getfield        #354 <Field Bundle NavigationView$SavedState.menuState>
	//   18   34:invokevirtual   #358 <Method void NavigationMenu.restorePresenterStates(Bundle)>
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
	//    3    5:invokespecial   #361 <Method Parcelable ScrimInsetsFrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #363 <Method void NavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.menuState = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #365 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #366 <Method void Bundle()>
	//   10   20:putfield        #354 <Field Bundle NavigationView$SavedState.menuState>
		mMenu.savePresenterStates(savedstate.menuState);
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field NavigationMenu mMenu>
	//   13   27:aload_1         
	//   14   28:getfield        #354 <Field Bundle NavigationView$SavedState.menuState>
	//   15   31:invokevirtual   #369 <Method void NavigationMenu.savePresenterStates(Bundle)>
		return ((Parcelable) (savedstate));
	//   16   34:aload_1         
	//   17   35:areturn         
	}

	public void removeHeaderView(View view)
	{
		mPresenter.removeHeaderView(view);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #372 <Method void NavigationMenuPresenter.removeHeaderView(View)>
	//    4    8:return          
	}

	public void setCheckedItem(int i)
	{
		MenuItem menuitem = mMenu.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field NavigationMenu mMenu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #378 <Method MenuItem NavigationMenu.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          24
			mPresenter.setCheckedItem((MenuItemImpl)menuitem);
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    9   17:aload_2         
	//   10   18:checkcast       #380 <Class MenuItemImpl>
	//   11   21:invokevirtual   #383 <Method void NavigationMenuPresenter.setCheckedItem(MenuItemImpl)>
	//   12   24:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		mPresenter.setItemBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #177 <Method void NavigationMenuPresenter.setItemBackground(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int i)
	{
		setItemBackground(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #214 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #390 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #391 <Method void setItemBackground(Drawable)>
	//    6   12:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		mPresenter.setItemIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #167 <Method void NavigationMenuPresenter.setItemIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearance(int i)
	{
		mPresenter.setItemTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #170 <Method void NavigationMenuPresenter.setItemTextAppearance(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		mPresenter.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #173 <Method void NavigationMenuPresenter.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onnavigationitemselectedlistener)
	{
		mListener = onnavigationitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #396 <Field NavigationView$OnNavigationItemSelectedListener mListener>
	//    3    5:return          
	}

	private static final int CHECKED_STATE_SET[] = {
		0x10100a0
	};
	private static final int DISABLED_STATE_SET[] = {
		0xfefeff62
	};
	private static final int PRESENTER_NAVIGATION_VIEW_ID = 1;
	OnNavigationItemSelectedListener mListener;
	private int mMaxWidth;
	private final NavigationMenu mMenu;
	private MenuInflater mMenuInflater;
	private final NavigationMenuPresenter mPresenter;

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
