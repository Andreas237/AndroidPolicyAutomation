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
		boolean flag;
		ColorStateList colorstatelist;
		Object obj;
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemIconTint))
	//*  53  111:aload           7
	//*  54  113:getstatic       #127 <Field int android.support.design.R$styleable.NavigationView_itemIconTint>
	//*  55  116:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//*  56  119:ifeq            365
			colorstatelist = tinttypedarray.getColorStateList(android.support.design.R.styleable.NavigationView_itemIconTint);
	//   57  122:aload           7
	//   58  124:getstatic       #127 <Field int android.support.design.R$styleable.NavigationView_itemIconTint>
	//   59  127:invokevirtual   #131 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//   60  130:astore          5
		else
	//*  61  132:aload           7
	//*  62  134:getstatic       #134 <Field int android.support.design.R$styleable.NavigationView_itemTextAppearance>
	//*  63  137:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//*  64  140:ifeq            376
	//*  65  143:aload           7
	//*  66  145:getstatic       #134 <Field int android.support.design.R$styleable.NavigationView_itemTextAppearance>
	//*  67  148:iconst_0        
	//*  68  149:invokevirtual   #137 <Method int TintTypedArray.getResourceId(int, int)>
	//*  69  152:istore_3        
	//*  70  153:iconst_1        
	//*  71  154:istore          4
	//*  72  156:aconst_null     
	//*  73  157:astore_2        
	//*  74  158:aload           7
	//*  75  160:getstatic       #140 <Field int android.support.design.R$styleable.NavigationView_itemTextColor>
	//*  76  163:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//*  77  166:ifeq            178
	//*  78  169:aload           7
	//*  79  171:getstatic       #140 <Field int android.support.design.R$styleable.NavigationView_itemTextColor>
	//*  80  174:invokevirtual   #131 <Method ColorStateList TintTypedArray.getColorStateList(int)>
	//*  81  177:astore_2        
	//*  82  178:aload_2         
	//*  83  179:astore          6
	//*  84  181:iload           4
	//*  85  183:ifne            201
	//*  86  186:aload_2         
	//*  87  187:astore          6
	//*  88  189:aload_2         
	//*  89  190:ifnonnull       201
	//*  90  193:aload_0         
	//*  91  194:ldc1            #141 <Int 0x1010036>
	//*  92  196:invokespecial   #144 <Method ColorStateList createDefaultColorStateList(int)>
	//*  93  199:astore          6
	//*  94  201:aload           7
	//*  95  203:getstatic       #147 <Field int android.support.design.R$styleable.NavigationView_itemBackground>
	//*  96  206:invokevirtual   #87  <Method Drawable TintTypedArray.getDrawable(int)>
	//*  97  209:astore_2        
	//*  98  210:aload_0         
	//*  99  211:getfield        #64  <Field NavigationMenu mMenu>
	//* 100  214:new             #6   <Class NavigationView$1>
	//* 101  217:dup             
	//* 102  218:aload_0         
	//* 103  219:invokespecial   #150 <Method void NavigationView$1(NavigationView)>
	//* 104  222:invokevirtual   #154 <Method void NavigationMenu.setCallback(android.support.v7.view.menu.MenuBuilder$Callback)>
	//* 105  225:aload_0         
	//* 106  226:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//* 107  229:iconst_1        
	//* 108  230:invokevirtual   #158 <Method void NavigationMenuPresenter.setId(int)>
	//* 109  233:aload_0         
	//* 110  234:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//* 111  237:aload_1         
	//* 112  238:aload_0         
	//* 113  239:getfield        #64  <Field NavigationMenu mMenu>
	//* 114  242:invokevirtual   #162 <Method void NavigationMenuPresenter.initForMenu(Context, MenuBuilder)>
	//* 115  245:aload_0         
	//* 116  246:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//* 117  249:aload           5
	//* 118  251:invokevirtual   #166 <Method void NavigationMenuPresenter.setItemIconTintList(ColorStateList)>
	//* 119  254:iload           4
	//* 120  256:ifeq            267
	//* 121  259:aload_0         
	//* 122  260:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//* 123  263:iload_3         
	//* 124  264:invokevirtual   #169 <Method void NavigationMenuPresenter.setItemTextAppearance(int)>
	//* 125  267:aload_0         
	//* 126  268:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//* 127  271:aload           6
	//* 128  273:invokevirtual   #172 <Method void NavigationMenuPresenter.setItemTextColor(ColorStateList)>
	//* 129  276:aload_0         
	//* 130  277:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//* 131  280:aload_2         
	//* 132  281:invokevirtual   #176 <Method void NavigationMenuPresenter.setItemBackground(Drawable)>
	//* 133  284:aload_0         
	//* 134  285:getfield        #64  <Field NavigationMenu mMenu>
	//* 135  288:aload_0         
	//* 136  289:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//* 137  292:invokevirtual   #180 <Method void NavigationMenu.addMenuPresenter(android.support.v7.view.menu.MenuPresenter)>
	//* 138  295:aload_0         
	//* 139  296:aload_0         
	//* 140  297:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//* 141  300:aload_0         
	//* 142  301:invokevirtual   #184 <Method android.support.v7.view.menu.MenuView NavigationMenuPresenter.getMenuView(android.view.ViewGroup)>
	//* 143  304:checkcast       #186 <Class View>
	//* 144  307:invokevirtual   #190 <Method void addView(View)>
	//* 145  310:aload           7
	//* 146  312:getstatic       #193 <Field int android.support.design.R$styleable.NavigationView_menu>
	//* 147  315:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//* 148  318:ifeq            334
	//* 149  321:aload_0         
	//* 150  322:aload           7
	//* 151  324:getstatic       #193 <Field int android.support.design.R$styleable.NavigationView_menu>
	//* 152  327:iconst_0        
	//* 153  328:invokevirtual   #137 <Method int TintTypedArray.getResourceId(int, int)>
	//* 154  331:invokevirtual   #196 <Method void inflateMenu(int)>
	//* 155  334:aload           7
	//* 156  336:getstatic       #199 <Field int android.support.design.R$styleable.NavigationView_headerLayout>
	//* 157  339:invokevirtual   #100 <Method boolean TintTypedArray.hasValue(int)>
	//* 158  342:ifeq            359
	//* 159  345:aload_0         
	//* 160  346:aload           7
	//* 161  348:getstatic       #199 <Field int android.support.design.R$styleable.NavigationView_headerLayout>
	//* 162  351:iconst_0        
	//* 163  352:invokevirtual   #137 <Method int TintTypedArray.getResourceId(int, int)>
	//* 164  355:invokevirtual   #203 <Method View inflateHeaderView(int)>
	//* 165  358:pop             
	//* 166  359:aload           7
	//* 167  361:invokevirtual   #206 <Method void TintTypedArray.recycle()>
	//* 168  364:return          
			colorstatelist = createDefaultColorStateList(0x1010038);
	//  169  365:aload_0         
	//  170  366:ldc1            #207 <Int 0x1010038>
	//  171  368:invokespecial   #144 <Method ColorStateList createDefaultColorStateList(int)>
	//  172  371:astore          5
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemTextAppearance))
		{
			i = tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_itemTextAppearance, 0);
			flag = true;
		} else
	//* 173  373:goto            132
		{
			i = 0;
	//  174  376:iconst_0        
	//  175  377:istore_3        
			flag = false;
	//  176  378:iconst_0        
	//  177  379:istore          4
		}
		attributeset = null;
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_itemTextColor))
			attributeset = ((AttributeSet) (tinttypedarray.getColorStateList(android.support.design.R.styleable.NavigationView_itemTextColor)));
		obj = ((Object) (attributeset));
		if(!flag)
		{
			obj = ((Object) (attributeset));
			if(attributeset == null)
				obj = ((Object) (createDefaultColorStateList(0x1010036)));
		}
		attributeset = ((AttributeSet) (tinttypedarray.getDrawable(android.support.design.R.styleable.NavigationView_itemBackground)));
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
		mPresenter.setId(1);
		mPresenter.initForMenu(context, ((MenuBuilder) (mMenu)));
		mPresenter.setItemIconTintList(colorstatelist);
		if(flag)
			mPresenter.setItemTextAppearance(i);
		mPresenter.setItemTextColor(((ColorStateList) (obj)));
		mPresenter.setItemBackground(((Drawable) (attributeset)));
		mMenu.addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mPresenter)));
		addView((View)mPresenter.getMenuView(((android.view.ViewGroup) (this))));
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_menu))
			inflateMenu(tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_menu, 0));
		if(tinttypedarray.hasValue(android.support.design.R.styleable.NavigationView_headerLayout))
			inflateHeaderView(tinttypedarray.getResourceId(android.support.design.R.styleable.NavigationView_headerLayout, 0));
		tinttypedarray.recycle();
	//* 178  381:goto            156
	}

	private ColorStateList createDefaultColorStateList(int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #209 <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #210 <Method void TypedValue()>
	//    3    7:astore          5
		if(getContext().getTheme().resolveAttribute(i, typedvalue, true))
	//*   4    9:aload_0         
	//*   5   10:invokevirtual   #214 <Method Context getContext()>
	//*   6   13:invokevirtual   #220 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   7   16:iload_1         
	//*   8   17:aload           5
	//*   9   19:iconst_1        
	//*  10   20:invokevirtual   #226 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  11   23:ifne            28
	//*  12   26:aconst_null     
	//*  13   27:areturn         
		{
			ColorStateList colorstatelist = AppCompatResources.getColorStateList(getContext(), typedvalue.resourceId);
	//   14   28:aload_0         
	//   15   29:invokevirtual   #214 <Method Context getContext()>
	//   16   32:aload           5
	//   17   34:getfield        #229 <Field int TypedValue.resourceId>
	//   18   37:invokestatic    #234 <Method ColorStateList AppCompatResources.getColorStateList(Context, int)>
	//   19   40:astore          4
			if(getContext().getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.colorPrimary, typedvalue, true))
	//*  20   42:aload_0         
	//*  21   43:invokevirtual   #214 <Method Context getContext()>
	//*  22   46:invokevirtual   #220 <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  23   49:getstatic       #239 <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//*  24   52:aload           5
	//*  25   54:iconst_1        
	//*  26   55:invokevirtual   #226 <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  27   58:ifeq            26
			{
				i = typedvalue.data;
	//   28   61:aload           5
	//   29   63:getfield        #242 <Field int TypedValue.data>
	//   30   66:istore_1        
				int j = colorstatelist.getDefaultColor();
	//   31   67:aload           4
	//   32   69:invokevirtual   #248 <Method int ColorStateList.getDefaultColor()>
	//   33   72:istore_2        
				int ai[] = DISABLED_STATE_SET;
	//   34   73:getstatic       #37  <Field int[] DISABLED_STATE_SET>
	//   35   76:astore          5
				int ai1[] = CHECKED_STATE_SET;
	//   36   78:getstatic       #34  <Field int[] CHECKED_STATE_SET>
	//   37   81:astore          6
				int ai2[] = EMPTY_STATE_SET;
	//   38   83:getstatic       #251 <Field int[] EMPTY_STATE_SET>
	//   39   86:astore          7
				int k = colorstatelist.getColorForState(DISABLED_STATE_SET, j);
	//   40   88:aload           4
	//   41   90:getstatic       #37  <Field int[] DISABLED_STATE_SET>
	//   42   93:iload_2         
	//   43   94:invokevirtual   #255 <Method int ColorStateList.getColorForState(int[], int)>
	//   44   97:istore_3        
				return new ColorStateList(new int[][] {
					ai, ai1, ai2
				}, new int[] {
					k, i, j
				});
	//   45   98:new             #244 <Class ColorStateList>
	//   46  101:dup             
	//   47  102:iconst_3        
	//   48  103:anewarray       int[][]
	//   49  106:dup             
	//   50  107:iconst_0        
	//   51  108:aload           5
	//   52  110:aastore         
	//   53  111:dup             
	//   54  112:iconst_1        
	//   55  113:aload           6
	//   56  115:aastore         
	//   57  116:dup             
	//   58  117:iconst_2        
	//   59  118:aload           7
	//   60  120:aastore         
	//   61  121:iconst_3        
	//   62  122:newarray        int[]
	//   63  124:dup             
	//   64  125:iconst_0        
	//   65  126:iload_3         
	//   66  127:iastore         
	//   67  128:dup             
	//   68  129:iconst_1        
	//   69  130:iload_1         
	//   70  131:iastore         
	//   71  132:dup             
	//   72  133:iconst_2        
	//   73  134:iload_2         
	//   74  135:iastore         
	//   75  136:invokespecial   #259 <Method void ColorStateList(int[][], int[])>
	//   76  139:areturn         
			}
		}
		return null;
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
		int k = i;
	//    0    0:iload_1         
	//    1    1:istore_3        
		android.view.View.MeasureSpec.getMode(i);
	//    2    2:iload_1         
	//    3    3:invokestatic    #327 <Method int android.view.View$MeasureSpec.getMode(int)>
		JVM INSTR lookupswitch 3: default 40
	//	               -2147483648: 49
	//	               0: 70
	//	               1073741824: 42;
	//    4    6:lookupswitch    3: default 40
	//	               -2147483648: 49
	//	               0: 70
	//	               1073741824: 42
		   goto _L1 _L2 _L3 _L4
_L4:
		break; /* Loop/switch isn't completed */
_L1:
		k = i;
	//    5   40:iload_1         
	//    6   41:istore_3        
_L6:
		super.onMeasure(k, j);
	//    7   42:aload_0         
	//    8   43:iload_3         
	//    9   44:iload_2         
	//   10   45:invokespecial   #329 <Method void ScrimInsetsFrameLayout.onMeasure(int, int)>
		return;
	//   11   48:return          
_L2:
		k = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(android.view.View.MeasureSpec.getSize(i), mMaxWidth), 0x40000000);
	//   12   49:iload_1         
	//   13   50:invokestatic    #332 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   14   53:aload_0         
	//   15   54:getfield        #124 <Field int mMaxWidth>
	//   16   57:invokestatic    #337 <Method int Math.min(int, int)>
	//   17   60:ldc2            #338 <Int 0x40000000>
	//   18   63:invokestatic    #341 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   19   66:istore_3        
		continue; /* Loop/switch isn't completed */
	//   20   67:goto            42
_L3:
		k = android.view.View.MeasureSpec.makeMeasureSpec(mMaxWidth, 0x40000000);
	//   21   70:aload_0         
	//   22   71:getfield        #124 <Field int mMaxWidth>
	//   23   74:ldc2            #338 <Int 0x40000000>
	//   24   77:invokestatic    #341 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   25   80:istore_3        
		if(true) goto _L6; else goto _L5
	//   26   81:goto            42
_L5:
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
	//    5    9:invokespecial   #345 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
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
	//   12   20:invokevirtual   #349 <Method Parcelable NavigationView$SavedState.getSuperState()>
	//   13   23:invokespecial   #345 <Method void ScrimInsetsFrameLayout.onRestoreInstanceState(Parcelable)>
			mMenu.restorePresenterStates(((SavedState) (parcelable)).menuState);
	//   14   26:aload_0         
	//   15   27:getfield        #64  <Field NavigationMenu mMenu>
	//   16   30:aload_1         
	//   17   31:getfield        #353 <Field Bundle NavigationView$SavedState.menuState>
	//   18   34:invokevirtual   #357 <Method void NavigationMenu.restorePresenterStates(Bundle)>
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
	//    3    5:invokespecial   #360 <Method Parcelable ScrimInsetsFrameLayout.onSaveInstanceState()>
	//    4    8:invokespecial   #362 <Method void NavigationView$SavedState(Parcelable)>
	//    5   11:astore_1        
		savedstate.menuState = new Bundle();
	//    6   12:aload_1         
	//    7   13:new             #364 <Class Bundle>
	//    8   16:dup             
	//    9   17:invokespecial   #365 <Method void Bundle()>
	//   10   20:putfield        #353 <Field Bundle NavigationView$SavedState.menuState>
		mMenu.savePresenterStates(savedstate.menuState);
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field NavigationMenu mMenu>
	//   13   27:aload_1         
	//   14   28:getfield        #353 <Field Bundle NavigationView$SavedState.menuState>
	//   15   31:invokevirtual   #368 <Method void NavigationMenu.savePresenterStates(Bundle)>
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
	//    3    5:invokevirtual   #371 <Method void NavigationMenuPresenter.removeHeaderView(View)>
	//    4    8:return          
	}

	public void setCheckedItem(int i)
	{
		MenuItem menuitem = mMenu.findItem(i);
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field NavigationMenu mMenu>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #377 <Method MenuItem NavigationMenu.findItem(int)>
	//    4    8:astore_2        
		if(menuitem != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          24
			mPresenter.setCheckedItem((MenuItemImpl)menuitem);
	//    7   13:aload_0         
	//    8   14:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    9   17:aload_2         
	//   10   18:checkcast       #379 <Class MenuItemImpl>
	//   11   21:invokevirtual   #382 <Method void NavigationMenuPresenter.setCheckedItem(MenuItemImpl)>
	//   12   24:return          
	}

	public void setItemBackground(Drawable drawable)
	{
		mPresenter.setItemBackground(drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #176 <Method void NavigationMenuPresenter.setItemBackground(Drawable)>
	//    4    8:return          
	}

	public void setItemBackgroundResource(int i)
	{
		setItemBackground(ContextCompat.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #214 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #389 <Method Drawable ContextCompat.getDrawable(Context, int)>
	//    5    9:invokevirtual   #390 <Method void setItemBackground(Drawable)>
	//    6   12:return          
	}

	public void setItemIconTintList(ColorStateList colorstatelist)
	{
		mPresenter.setItemIconTintList(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #166 <Method void NavigationMenuPresenter.setItemIconTintList(ColorStateList)>
	//    4    8:return          
	}

	public void setItemTextAppearance(int i)
	{
		mPresenter.setItemTextAppearance(i);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #169 <Method void NavigationMenuPresenter.setItemTextAppearance(int)>
	//    4    8:return          
	}

	public void setItemTextColor(ColorStateList colorstatelist)
	{
		mPresenter.setItemTextColor(colorstatelist);
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field NavigationMenuPresenter mPresenter>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #172 <Method void NavigationMenuPresenter.setItemTextColor(ColorStateList)>
	//    4    8:return          
	}

	public void setNavigationItemSelectedListener(OnNavigationItemSelectedListener onnavigationitemselectedlistener)
	{
		mListener = onnavigationitemselectedlistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #395 <Field NavigationView$OnNavigationItemSelectedListener mListener>
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
