// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.view.*;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.menu.ActionMenuItem;
import android.support.v7.view.menu.MenuBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.*;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;

// Referenced classes of package android.support.v7.widget:
//			DecorToolbar, Toolbar, TintTypedArray, AppCompatSpinner, 
//			ScrollingTabContainerView, ActionMenuPresenter

public class ToolbarWidgetWrapper
	implements DecorToolbar
{

	public ToolbarWidgetWrapper(Toolbar toolbar, boolean flag)
	{
		this(toolbar, flag, android.support.v7.appcompat.R.string.abc_action_bar_up_description, android.support.v7.appcompat.R.drawable.abc_ic_ab_back_material);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:getstatic       #58  <Field int android.support.v7.appcompat.R$string.abc_action_bar_up_description>
	//    4    6:getstatic       #63  <Field int android.support.v7.appcompat.R$drawable.abc_ic_ab_back_material>
	//    5    9:invokespecial   #66  <Method void ToolbarWidgetWrapper(Toolbar, boolean, int, int)>
	//    6   12:return          
	}

	public ToolbarWidgetWrapper(Toolbar toolbar, boolean flag, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #70  <Method void Object()>
		mNavigationMode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #72  <Field int mNavigationMode>
		mDefaultNavigationContentDescription = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #74  <Field int mDefaultNavigationContentDescription>
		mToolbar = toolbar;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #76  <Field Toolbar mToolbar>
		mTitle = toolbar.getTitle();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #82  <Method CharSequence Toolbar.getTitle()>
	//   14   24:putfield        #84  <Field CharSequence mTitle>
		mSubtitle = toolbar.getSubtitle();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #87  <Method CharSequence Toolbar.getSubtitle()>
	//   18   32:putfield        #89  <Field CharSequence mSubtitle>
		boolean flag1;
		if(mTitle != null)
	//*  19   35:aload_0         
	//*  20   36:getfield        #84  <Field CharSequence mTitle>
	//*  21   39:ifnull          471
			flag1 = true;
	//   22   42:iconst_1        
	//   23   43:istore          6
		else
	//*  24   45:aload_0         
	//*  25   46:iload           6
	//*  26   48:putfield        #91  <Field boolean mTitleSet>
	//*  27   51:aload_0         
	//*  28   52:aload_1         
	//*  29   53:invokevirtual   #95  <Method Drawable Toolbar.getNavigationIcon()>
	//*  30   56:putfield        #97  <Field Drawable mNavIcon>
	//*  31   59:aload_1         
	//*  32   60:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//*  33   63:aconst_null     
	//*  34   64:getstatic       #107 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//*  35   67:getstatic       #112 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//*  36   70:iconst_0        
	//*  37   71:invokestatic    #118 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[], int, int)>
	//*  38   74:astore_1        
	//*  39   75:aload_0         
	//*  40   76:aload_1         
	//*  41   77:getstatic       #121 <Field int android.support.v7.appcompat.R$styleable.ActionBar_homeAsUpIndicator>
	//*  42   80:invokevirtual   #125 <Method Drawable TintTypedArray.getDrawable(int)>
	//*  43   83:putfield        #127 <Field Drawable mDefaultNavigationIcon>
	//*  44   86:iload_2         
	//*  45   87:ifeq            477
	//*  46   90:aload_1         
	//*  47   91:getstatic       #130 <Field int android.support.v7.appcompat.R$styleable.ActionBar_title>
	//*  48   94:invokevirtual   #134 <Method CharSequence TintTypedArray.getText(int)>
	//*  49   97:astore          7
	//*  50   99:aload           7
	//*  51  101:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  52  104:ifne            113
	//*  53  107:aload_0         
	//*  54  108:aload           7
	//*  55  110:invokevirtual   #144 <Method void setTitle(CharSequence)>
	//*  56  113:aload_1         
	//*  57  114:getstatic       #147 <Field int android.support.v7.appcompat.R$styleable.ActionBar_subtitle>
	//*  58  117:invokevirtual   #134 <Method CharSequence TintTypedArray.getText(int)>
	//*  59  120:astore          7
	//*  60  122:aload           7
	//*  61  124:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  62  127:ifne            136
	//*  63  130:aload_0         
	//*  64  131:aload           7
	//*  65  133:invokevirtual   #150 <Method void setSubtitle(CharSequence)>
	//*  66  136:aload_1         
	//*  67  137:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.ActionBar_logo>
	//*  68  140:invokevirtual   #125 <Method Drawable TintTypedArray.getDrawable(int)>
	//*  69  143:astore          7
	//*  70  145:aload           7
	//*  71  147:ifnull          156
	//*  72  150:aload_0         
	//*  73  151:aload           7
	//*  74  153:invokevirtual   #157 <Method void setLogo(Drawable)>
	//*  75  156:aload_1         
	//*  76  157:getstatic       #160 <Field int android.support.v7.appcompat.R$styleable.ActionBar_icon>
	//*  77  160:invokevirtual   #125 <Method Drawable TintTypedArray.getDrawable(int)>
	//*  78  163:astore          7
	//*  79  165:aload           7
	//*  80  167:ifnull          176
	//*  81  170:aload_0         
	//*  82  171:aload           7
	//*  83  173:invokevirtual   #163 <Method void setIcon(Drawable)>
	//*  84  176:aload_0         
	//*  85  177:getfield        #97  <Field Drawable mNavIcon>
	//*  86  180:ifnonnull       198
	//*  87  183:aload_0         
	//*  88  184:getfield        #127 <Field Drawable mDefaultNavigationIcon>
	//*  89  187:ifnull          198
	//*  90  190:aload_0         
	//*  91  191:aload_0         
	//*  92  192:getfield        #127 <Field Drawable mDefaultNavigationIcon>
	//*  93  195:invokevirtual   #166 <Method void setNavigationIcon(Drawable)>
	//*  94  198:aload_0         
	//*  95  199:aload_1         
	//*  96  200:getstatic       #169 <Field int android.support.v7.appcompat.R$styleable.ActionBar_displayOptions>
	//*  97  203:iconst_0        
	//*  98  204:invokevirtual   #173 <Method int TintTypedArray.getInt(int, int)>
	//*  99  207:invokevirtual   #177 <Method void setDisplayOptions(int)>
	//* 100  210:aload_1         
	//* 101  211:getstatic       #180 <Field int android.support.v7.appcompat.R$styleable.ActionBar_customNavigationLayout>
	//* 102  214:iconst_0        
	//* 103  215:invokevirtual   #183 <Method int TintTypedArray.getResourceId(int, int)>
	//* 104  218:istore          4
	//* 105  220:iload           4
	//* 106  222:ifeq            260
	//* 107  225:aload_0         
	//* 108  226:aload_0         
	//* 109  227:getfield        #76  <Field Toolbar mToolbar>
	//* 110  230:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//* 111  233:invokestatic    #189 <Method LayoutInflater LayoutInflater.from(Context)>
	//* 112  236:iload           4
	//* 113  238:aload_0         
	//* 114  239:getfield        #76  <Field Toolbar mToolbar>
	//* 115  242:iconst_0        
	//* 116  243:invokevirtual   #193 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//* 117  246:invokevirtual   #197 <Method void setCustomView(View)>
	//* 118  249:aload_0         
	//* 119  250:aload_0         
	//* 120  251:getfield        #199 <Field int mDisplayOpts>
	//* 121  254:bipush          16
	//* 122  256:ior             
	//* 123  257:invokevirtual   #177 <Method void setDisplayOptions(int)>
	//* 124  260:aload_1         
	//* 125  261:getstatic       #202 <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//* 126  264:iconst_0        
	//* 127  265:invokevirtual   #205 <Method int TintTypedArray.getLayoutDimension(int, int)>
	//* 128  268:istore          4
	//* 129  270:iload           4
	//* 130  272:ifle            300
	//* 131  275:aload_0         
	//* 132  276:getfield        #76  <Field Toolbar mToolbar>
	//* 133  279:invokevirtual   #209 <Method android.view.ViewGroup$LayoutParams Toolbar.getLayoutParams()>
	//* 134  282:astore          7
	//* 135  284:aload           7
	//* 136  286:iload           4
	//* 137  288:putfield        #214 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 138  291:aload_0         
	//* 139  292:getfield        #76  <Field Toolbar mToolbar>
	//* 140  295:aload           7
	//* 141  297:invokevirtual   #218 <Method void Toolbar.setLayoutParams(android.view.ViewGroup$LayoutParams)>
	//* 142  300:aload_1         
	//* 143  301:getstatic       #221 <Field int android.support.v7.appcompat.R$styleable.ActionBar_contentInsetStart>
	//* 144  304:iconst_m1       
	//* 145  305:invokevirtual   #224 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//* 146  308:istore          4
	//* 147  310:aload_1         
	//* 148  311:getstatic       #227 <Field int android.support.v7.appcompat.R$styleable.ActionBar_contentInsetEnd>
	//* 149  314:iconst_m1       
	//* 150  315:invokevirtual   #224 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//* 151  318:istore          5
	//* 152  320:iload           4
	//* 153  322:ifge            330
	//* 154  325:iload           5
	//* 155  327:iflt            349
	//* 156  330:aload_0         
	//* 157  331:getfield        #76  <Field Toolbar mToolbar>
	//* 158  334:iload           4
	//* 159  336:iconst_0        
	//* 160  337:invokestatic    #232 <Method int Math.max(int, int)>
	//* 161  340:iload           5
	//* 162  342:iconst_0        
	//* 163  343:invokestatic    #232 <Method int Math.max(int, int)>
	//* 164  346:invokevirtual   #236 <Method void Toolbar.setContentInsetsRelative(int, int)>
	//* 165  349:aload_1         
	//* 166  350:getstatic       #239 <Field int android.support.v7.appcompat.R$styleable.ActionBar_titleTextStyle>
	//* 167  353:iconst_0        
	//* 168  354:invokevirtual   #183 <Method int TintTypedArray.getResourceId(int, int)>
	//* 169  357:istore          4
	//* 170  359:iload           4
	//* 171  361:ifeq            380
	//* 172  364:aload_0         
	//* 173  365:getfield        #76  <Field Toolbar mToolbar>
	//* 174  368:aload_0         
	//* 175  369:getfield        #76  <Field Toolbar mToolbar>
	//* 176  372:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//* 177  375:iload           4
	//* 178  377:invokevirtual   #243 <Method void Toolbar.setTitleTextAppearance(Context, int)>
	//* 179  380:aload_1         
	//* 180  381:getstatic       #246 <Field int android.support.v7.appcompat.R$styleable.ActionBar_subtitleTextStyle>
	//* 181  384:iconst_0        
	//* 182  385:invokevirtual   #183 <Method int TintTypedArray.getResourceId(int, int)>
	//* 183  388:istore          4
	//* 184  390:iload           4
	//* 185  392:ifeq            411
	//* 186  395:aload_0         
	//* 187  396:getfield        #76  <Field Toolbar mToolbar>
	//* 188  399:aload_0         
	//* 189  400:getfield        #76  <Field Toolbar mToolbar>
	//* 190  403:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//* 191  406:iload           4
	//* 192  408:invokevirtual   #249 <Method void Toolbar.setSubtitleTextAppearance(Context, int)>
	//* 193  411:aload_1         
	//* 194  412:getstatic       #252 <Field int android.support.v7.appcompat.R$styleable.ActionBar_popupTheme>
	//* 195  415:iconst_0        
	//* 196  416:invokevirtual   #183 <Method int TintTypedArray.getResourceId(int, int)>
	//* 197  419:istore          4
	//* 198  421:iload           4
	//* 199  423:ifeq            435
	//* 200  426:aload_0         
	//* 201  427:getfield        #76  <Field Toolbar mToolbar>
	//* 202  430:iload           4
	//* 203  432:invokevirtual   #255 <Method void Toolbar.setPopupTheme(int)>
	//* 204  435:aload_1         
	//* 205  436:invokevirtual   #258 <Method void TintTypedArray.recycle()>
	//* 206  439:aload_0         
	//* 207  440:iload_3         
	//* 208  441:invokevirtual   #261 <Method void setDefaultNavigationContentDescription(int)>
	//* 209  444:aload_0         
	//* 210  445:aload_0         
	//* 211  446:getfield        #76  <Field Toolbar mToolbar>
	//* 212  449:invokevirtual   #264 <Method CharSequence Toolbar.getNavigationContentDescription()>
	//* 213  452:putfield        #266 <Field CharSequence mHomeDescription>
	//* 214  455:aload_0         
	//* 215  456:getfield        #76  <Field Toolbar mToolbar>
	//* 216  459:new             #8   <Class ToolbarWidgetWrapper$1>
	//* 217  462:dup             
	//* 218  463:aload_0         
	//* 219  464:invokespecial   #269 <Method void ToolbarWidgetWrapper$1(ToolbarWidgetWrapper)>
	//* 220  467:invokevirtual   #273 <Method void Toolbar.setNavigationOnClickListener(android.view.View$OnClickListener)>
	//* 221  470:return          
			flag1 = false;
	//  222  471:iconst_0        
	//  223  472:istore          6
		mTitleSet = flag1;
		mNavIcon = toolbar.getNavigationIcon();
		toolbar = ((Toolbar) (TintTypedArray.obtainStyledAttributes(toolbar.getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
		mDefaultNavigationIcon = ((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_homeAsUpIndicator);
		if(flag)
		{
			Object obj = ((Object) (((TintTypedArray) (toolbar)).getText(android.support.v7.appcompat.R.styleable.ActionBar_title)));
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
				setTitle(((CharSequence) (obj)));
			obj = ((Object) (((TintTypedArray) (toolbar)).getText(android.support.v7.appcompat.R.styleable.ActionBar_subtitle)));
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
				setSubtitle(((CharSequence) (obj)));
			obj = ((Object) (((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_logo)));
			if(obj != null)
				setLogo(((Drawable) (obj)));
			obj = ((Object) (((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_icon)));
			if(obj != null)
				setIcon(((Drawable) (obj)));
			if(mNavIcon == null && mDefaultNavigationIcon != null)
				setNavigationIcon(mDefaultNavigationIcon);
			setDisplayOptions(((TintTypedArray) (toolbar)).getInt(android.support.v7.appcompat.R.styleable.ActionBar_displayOptions, 0));
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_customNavigationLayout, 0);
			if(j != 0)
			{
				setCustomView(LayoutInflater.from(mToolbar.getContext()).inflate(j, ((ViewGroup) (mToolbar)), false));
				setDisplayOptions(mDisplayOpts | 0x10);
			}
			j = ((TintTypedArray) (toolbar)).getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionBar_height, 0);
			if(j > 0)
			{
				android.view.ViewGroup.LayoutParams layoutparams = mToolbar.getLayoutParams();
				layoutparams.height = j;
				mToolbar.setLayoutParams(layoutparams);
			}
			j = ((TintTypedArray) (toolbar)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ActionBar_contentInsetStart, -1);
			int k = ((TintTypedArray) (toolbar)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ActionBar_contentInsetEnd, -1);
			if(j >= 0 || k >= 0)
				mToolbar.setContentInsetsRelative(Math.max(j, 0), Math.max(k, 0));
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_titleTextStyle, 0);
			if(j != 0)
				mToolbar.setTitleTextAppearance(mToolbar.getContext(), j);
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_subtitleTextStyle, 0);
			if(j != 0)
				mToolbar.setSubtitleTextAppearance(mToolbar.getContext(), j);
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_popupTheme, 0);
			if(j != 0)
				mToolbar.setPopupTheme(j);
		} else
	//* 224  474:goto            45
		{
			mDisplayOpts = detectDisplayOptions();
	//  225  477:aload_0         
	//  226  478:aload_0         
	//  227  479:invokespecial   #277 <Method int detectDisplayOptions()>
	//  228  482:putfield        #199 <Field int mDisplayOpts>
		}
		((TintTypedArray) (toolbar)).recycle();
		setDefaultNavigationContentDescription(i);
		mHomeDescription = mToolbar.getNavigationContentDescription();
		mToolbar.setNavigationOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				if(mWindowCallback != null && mMenuPrepared)
			//*   0    0:aload_0         
			//*   1    1:getfield        #18  <Field ToolbarWidgetWrapper this$0>
			//*   2    4:getfield        #50  <Field android.view.Window$Callback ToolbarWidgetWrapper.mWindowCallback>
			//*   3    7:ifnull          38
			//*   4   10:aload_0         
			//*   5   11:getfield        #18  <Field ToolbarWidgetWrapper this$0>
			//*   6   14:getfield        #54  <Field boolean ToolbarWidgetWrapper.mMenuPrepared>
			//*   7   17:ifeq            38
					mWindowCallback.onMenuItemSelected(0, ((android.view.MenuItem) (mNavItem)));
			//    8   20:aload_0         
			//    9   21:getfield        #18  <Field ToolbarWidgetWrapper this$0>
			//   10   24:getfield        #50  <Field android.view.Window$Callback ToolbarWidgetWrapper.mWindowCallback>
			//   11   27:iconst_0        
			//   12   28:aload_0         
			//   13   29:getfield        #43  <Field ActionMenuItem mNavItem>
			//   14   32:invokeinterface #60  <Method boolean android.view.Window$Callback.onMenuItemSelected(int, android.view.MenuItem)>
			//   15   37:pop             
			//   16   38:return          
			}

			final ActionMenuItem mNavItem;
			final ToolbarWidgetWrapper this$0;

			
			{
				this$0 = ToolbarWidgetWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #18  <Field ToolbarWidgetWrapper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #21  <Method void Object()>
				mNavItem = new ActionMenuItem(mToolbar.getContext(), 0, 0x102002c, 0, 0, mTitle);
			//    5    9:aload_0         
			//    6   10:new             #23  <Class ActionMenuItem>
			//    7   13:dup             
			//    8   14:aload_0         
			//    9   15:getfield        #18  <Field ToolbarWidgetWrapper this$0>
			//   10   18:getfield        #27  <Field Toolbar ToolbarWidgetWrapper.mToolbar>
			//   11   21:invokevirtual   #33  <Method Context Toolbar.getContext()>
			//   12   24:iconst_0        
			//   13   25:ldc1            #34  <Int 0x102002c>
			//   14   27:iconst_0        
			//   15   28:iconst_0        
			//   16   29:aload_0         
			//   17   30:getfield        #18  <Field ToolbarWidgetWrapper this$0>
			//   18   33:getfield        #38  <Field CharSequence ToolbarWidgetWrapper.mTitle>
			//   19   36:invokespecial   #41  <Method void ActionMenuItem(Context, int, int, int, int, CharSequence)>
			//   20   39:putfield        #43  <Field ActionMenuItem mNavItem>
			//   21   42:return          
			}
		}
);
	//* 229  485:goto            435
	}

	private int detectDisplayOptions()
	{
		int i = 11;
	//    0    0:bipush          11
	//    1    2:istore_1        
		if(mToolbar.getNavigationIcon() != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #76  <Field Toolbar mToolbar>
	//*   4    7:invokevirtual   #95  <Method Drawable Toolbar.getNavigationIcon()>
	//*   5   10:ifnull          29
		{
			i = 0xb | 4;
	//    6   13:bipush          11
	//    7   15:iconst_4        
	//    8   16:ior             
	//    9   17:istore_1        
			mDefaultNavigationIcon = mToolbar.getNavigationIcon();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:getfield        #76  <Field Toolbar mToolbar>
	//   13   23:invokevirtual   #95  <Method Drawable Toolbar.getNavigationIcon()>
	//   14   26:putfield        #127 <Field Drawable mDefaultNavigationIcon>
		}
		return i;
	//   15   29:iload_1         
	//   16   30:ireturn         
	}

	private void ensureSpinner()
	{
		if(mSpinner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #280 <Field Spinner mSpinner>
	//*   2    4:ifnonnull       49
		{
			mSpinner = ((Spinner) (new AppCompatSpinner(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionDropDownStyle)));
	//    3    7:aload_0         
	//    4    8:new             #282 <Class AppCompatSpinner>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #283 <Method Context getContext()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #286 <Field int android.support.v7.appcompat.R$attr.actionDropDownStyle>
	//   10   20:invokespecial   #289 <Method void AppCompatSpinner(Context, android.util.AttributeSet, int)>
	//   11   23:putfield        #280 <Field Spinner mSpinner>
			Toolbar.LayoutParams layoutparams = new Toolbar.LayoutParams(-2, -2, 0x800013);
	//   12   26:new             #291 <Class Toolbar$LayoutParams>
	//   13   29:dup             
	//   14   30:bipush          -2
	//   15   32:bipush          -2
	//   16   34:ldc2            #292 <Int 0x800013>
	//   17   37:invokespecial   #295 <Method void Toolbar$LayoutParams(int, int, int)>
	//   18   40:astore_1        
			mSpinner.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   19   41:aload_0         
	//   20   42:getfield        #280 <Field Spinner mSpinner>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #298 <Method void Spinner.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
	//   23   49:return          
	}

	private void setTitleInt(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field CharSequence mTitle>
		if((mDisplayOpts & 8) != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #199 <Field int mDisplayOpts>
	//*   5    9:bipush          8
	//*   6   11:iand            
	//*   7   12:ifeq            23
			mToolbar.setTitle(charsequence);
	//    8   15:aload_0         
	//    9   16:getfield        #76  <Field Toolbar mToolbar>
	//   10   19:aload_1         
	//   11   20:invokevirtual   #300 <Method void Toolbar.setTitle(CharSequence)>
	//   12   23:return          
	}

	private void updateHomeAccessibility()
	{
label0:
		{
			if((mDisplayOpts & 4) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field int mDisplayOpts>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifeq            30
			{
				if(!TextUtils.isEmpty(mHomeDescription))
					break label0;
	//    5    9:aload_0         
	//    6   10:getfield        #266 <Field CharSequence mHomeDescription>
	//    7   13:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    8   16:ifeq            31
				mToolbar.setNavigationContentDescription(mDefaultNavigationContentDescription);
	//    9   19:aload_0         
	//   10   20:getfield        #76  <Field Toolbar mToolbar>
	//   11   23:aload_0         
	//   12   24:getfield        #74  <Field int mDefaultNavigationContentDescription>
	//   13   27:invokevirtual   #304 <Method void Toolbar.setNavigationContentDescription(int)>
			}
			return;
	//   14   30:return          
		}
		mToolbar.setNavigationContentDescription(mHomeDescription);
	//   15   31:aload_0         
	//   16   32:getfield        #76  <Field Toolbar mToolbar>
	//   17   35:aload_0         
	//   18   36:getfield        #266 <Field CharSequence mHomeDescription>
	//   19   39:invokevirtual   #306 <Method void Toolbar.setNavigationContentDescription(CharSequence)>
	//   20   42:return          
	}

	private void updateNavigationIcon()
	{
		if((mDisplayOpts & 4) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field int mDisplayOpts>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifeq            40
		{
			Toolbar toolbar = mToolbar;
	//    5    9:aload_0         
	//    6   10:getfield        #76  <Field Toolbar mToolbar>
	//    7   13:astore_2        
			Drawable drawable;
			if(mNavIcon != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #97  <Field Drawable mNavIcon>
	//*  10   18:ifnull          32
				drawable = mNavIcon;
	//   11   21:aload_0         
	//   12   22:getfield        #97  <Field Drawable mNavIcon>
	//   13   25:astore_1        
			else
	//*  14   26:aload_2         
	//*  15   27:aload_1         
	//*  16   28:invokevirtual   #308 <Method void Toolbar.setNavigationIcon(Drawable)>
	//*  17   31:return          
				drawable = mDefaultNavigationIcon;
	//   18   32:aload_0         
	//   19   33:getfield        #127 <Field Drawable mDefaultNavigationIcon>
	//   20   36:astore_1        
			toolbar.setNavigationIcon(drawable);
			return;
		} else
	//*  21   37:goto            26
		{
			mToolbar.setNavigationIcon(((Drawable) (null)));
	//   22   40:aload_0         
	//   23   41:getfield        #76  <Field Toolbar mToolbar>
	//   24   44:aconst_null     
	//   25   45:invokevirtual   #308 <Method void Toolbar.setNavigationIcon(Drawable)>
			return;
	//   26   48:return          
		}
	}

	private void updateToolbarLogo()
	{
		Drawable drawable = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		if((mDisplayOpts & 2) != 0)
	//*   2    2:aload_0         
	//*   3    3:getfield        #199 <Field int mDisplayOpts>
	//*   4    6:iconst_2        
	//*   5    7:iand            
	//*   6    8:ifeq            32
			if((mDisplayOpts & 1) != 0)
	//*   7   11:aload_0         
	//*   8   12:getfield        #199 <Field int mDisplayOpts>
	//*   9   15:iconst_1        
	//*  10   16:iand            
	//*  11   17:ifeq            49
			{
				if(mLogo != null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #311 <Field Drawable mLogo>
	//*  14   24:ifnull          41
					drawable = mLogo;
	//   15   27:aload_0         
	//   16   28:getfield        #311 <Field Drawable mLogo>
	//   17   31:astore_1        
				else
	//*  18   32:aload_0         
	//*  19   33:getfield        #76  <Field Toolbar mToolbar>
	//*  20   36:aload_1         
	//*  21   37:invokevirtual   #312 <Method void Toolbar.setLogo(Drawable)>
	//*  22   40:return          
					drawable = mIcon;
	//   23   41:aload_0         
	//   24   42:getfield        #314 <Field Drawable mIcon>
	//   25   45:astore_1        
			} else
	//*  26   46:goto            32
			{
				drawable = mIcon;
	//   27   49:aload_0         
	//   28   50:getfield        #314 <Field Drawable mIcon>
	//   29   53:astore_1        
			}
		mToolbar.setLogo(drawable);
	//*  30   54:goto            32
	}

	public void animateToVisibility(int i)
	{
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat = setupAnimatorToVisibility(i, 200L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2w           #20  <Long 200L>
	//    3    5:invokevirtual   #319 <Method ViewPropertyAnimatorCompat setupAnimatorToVisibility(int, long)>
	//    4    8:astore_2        
		if(viewpropertyanimatorcompat != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          17
			viewpropertyanimatorcompat.start();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #324 <Method void ViewPropertyAnimatorCompat.start()>
	//    9   17:return          
	}

	public boolean canShowOverflowMenu()
	{
		return mToolbar.canShowOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #328 <Method boolean Toolbar.canShowOverflowMenu()>
	//    3    7:ireturn         
	}

	public void collapseActionView()
	{
		mToolbar.collapseActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #331 <Method void Toolbar.collapseActionView()>
	//    3    7:return          
	}

	public void dismissPopupMenus()
	{
		mToolbar.dismissPopupMenus();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #334 <Method void Toolbar.dismissPopupMenus()>
	//    3    7:return          
	}

	public Context getContext()
	{
		return mToolbar.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//    3    7:areturn         
	}

	public View getCustomView()
	{
		return mCustomView;
	//    0    0:aload_0         
	//    1    1:getfield        #338 <Field View mCustomView>
	//    2    4:areturn         
	}

	public int getDisplayOptions()
	{
		return mDisplayOpts;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field int mDisplayOpts>
	//    2    4:ireturn         
	}

	public int getDropdownItemCount()
	{
		if(mSpinner != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #280 <Field Spinner mSpinner>
	//*   2    4:ifnull          15
			return mSpinner.getCount();
	//    3    7:aload_0         
	//    4    8:getfield        #280 <Field Spinner mSpinner>
	//    5   11:invokevirtual   #343 <Method int Spinner.getCount()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getDropdownSelectedPosition()
	{
		if(mSpinner != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #280 <Field Spinner mSpinner>
	//*   2    4:ifnull          15
			return mSpinner.getSelectedItemPosition();
	//    3    7:aload_0         
	//    4    8:getfield        #280 <Field Spinner mSpinner>
	//    5   11:invokevirtual   #347 <Method int Spinner.getSelectedItemPosition()>
	//    6   14:ireturn         
		else
			return 0;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public int getHeight()
	{
		return mToolbar.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #350 <Method int Toolbar.getHeight()>
	//    3    7:ireturn         
	}

	public Menu getMenu()
	{
		return mToolbar.getMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #354 <Method Menu Toolbar.getMenu()>
	//    3    7:areturn         
	}

	public int getNavigationMode()
	{
		return mNavigationMode;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int mNavigationMode>
	//    2    4:ireturn         
	}

	public CharSequence getSubtitle()
	{
		return mToolbar.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #87  <Method CharSequence Toolbar.getSubtitle()>
	//    3    7:areturn         
	}

	public CharSequence getTitle()
	{
		return mToolbar.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #82  <Method CharSequence Toolbar.getTitle()>
	//    3    7:areturn         
	}

	public ViewGroup getViewGroup()
	{
		return ((ViewGroup) (mToolbar));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:areturn         
	}

	public int getVisibility()
	{
		return mToolbar.getVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #360 <Method int Toolbar.getVisibility()>
	//    3    7:ireturn         
	}

	public boolean hasEmbeddedTabs()
	{
		return mTabView != null;
	//    0    0:aload_0         
	//    1    1:getfield        #363 <Field View mTabView>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasExpandedActionView()
	{
		return mToolbar.hasExpandedActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #366 <Method boolean Toolbar.hasExpandedActionView()>
	//    3    7:ireturn         
	}

	public boolean hasIcon()
	{
		return mIcon != null;
	//    0    0:aload_0         
	//    1    1:getfield        #314 <Field Drawable mIcon>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hasLogo()
	{
		return mLogo != null;
	//    0    0:aload_0         
	//    1    1:getfield        #311 <Field Drawable mLogo>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		return mToolbar.hideOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #371 <Method boolean Toolbar.hideOverflowMenu()>
	//    3    7:ireturn         
	}

	public void initIndeterminateProgress()
	{
		Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
	//    0    0:ldc1            #25  <String "ToolbarWidgetWrapper">
	//    1    2:ldc2            #374 <String "Progress display unsupported">
	//    2    5:invokestatic    #380 <Method int Log.i(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public void initProgress()
	{
		Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
	//    0    0:ldc1            #25  <String "ToolbarWidgetWrapper">
	//    1    2:ldc2            #374 <String "Progress display unsupported">
	//    2    5:invokestatic    #380 <Method int Log.i(String, String)>
	//    3    8:pop             
	//    4    9:return          
	}

	public boolean isOverflowMenuShowPending()
	{
		return mToolbar.isOverflowMenuShowPending();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #384 <Method boolean Toolbar.isOverflowMenuShowPending()>
	//    3    7:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		return mToolbar.isOverflowMenuShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #387 <Method boolean Toolbar.isOverflowMenuShowing()>
	//    3    7:ireturn         
	}

	public boolean isTitleTruncated()
	{
		return mToolbar.isTitleTruncated();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #390 <Method boolean Toolbar.isTitleTruncated()>
	//    3    7:ireturn         
	}

	public void restoreHierarchyState(SparseArray sparsearray)
	{
		mToolbar.restoreHierarchyState(sparsearray);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #394 <Method void Toolbar.restoreHierarchyState(SparseArray)>
	//    4    8:return          
	}

	public void saveHierarchyState(SparseArray sparsearray)
	{
		mToolbar.saveHierarchyState(sparsearray);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #399 <Method void Toolbar.saveHierarchyState(SparseArray)>
	//    4    8:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		ViewCompat.setBackground(((View) (mToolbar)), drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:invokestatic    #406 <Method void ViewCompat.setBackground(View, Drawable)>
	//    4    8:return          
	}

	public void setCollapsible(boolean flag)
	{
		mToolbar.setCollapsible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #410 <Method void Toolbar.setCollapsible(boolean)>
	//    4    8:return          
	}

	public void setCustomView(View view)
	{
		if(mCustomView != null && (mDisplayOpts & 0x10) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #338 <Field View mCustomView>
	//*   2    4:ifnull          28
	//*   3    7:aload_0         
	//*   4    8:getfield        #199 <Field int mDisplayOpts>
	//*   5   11:bipush          16
	//*   6   13:iand            
	//*   7   14:ifeq            28
			mToolbar.removeView(mCustomView);
	//    8   17:aload_0         
	//    9   18:getfield        #76  <Field Toolbar mToolbar>
	//   10   21:aload_0         
	//   11   22:getfield        #338 <Field View mCustomView>
	//   12   25:invokevirtual   #413 <Method void Toolbar.removeView(View)>
		mCustomView = view;
	//   13   28:aload_0         
	//   14   29:aload_1         
	//   15   30:putfield        #338 <Field View mCustomView>
		if(view != null && (mDisplayOpts & 0x10) != 0)
	//*  16   33:aload_1         
	//*  17   34:ifnull          58
	//*  18   37:aload_0         
	//*  19   38:getfield        #199 <Field int mDisplayOpts>
	//*  20   41:bipush          16
	//*  21   43:iand            
	//*  22   44:ifeq            58
			mToolbar.addView(mCustomView);
	//   23   47:aload_0         
	//   24   48:getfield        #76  <Field Toolbar mToolbar>
	//   25   51:aload_0         
	//   26   52:getfield        #338 <Field View mCustomView>
	//   27   55:invokevirtual   #416 <Method void Toolbar.addView(View)>
	//   28   58:return          
	}

	public void setDefaultNavigationContentDescription(int i)
	{
		if(i != mDefaultNavigationContentDescription)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #74  <Field int mDefaultNavigationContentDescription>
	//*   3    5:icmpne          9
	//*   4    8:return          
		{
			mDefaultNavigationContentDescription = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #74  <Field int mDefaultNavigationContentDescription>
			if(TextUtils.isEmpty(mToolbar.getNavigationContentDescription()))
	//*   8   14:aload_0         
	//*   9   15:getfield        #76  <Field Toolbar mToolbar>
	//*  10   18:invokevirtual   #264 <Method CharSequence Toolbar.getNavigationContentDescription()>
	//*  11   21:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   24:ifeq            8
			{
				setNavigationContentDescription(mDefaultNavigationContentDescription);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #74  <Field int mDefaultNavigationContentDescription>
	//   16   32:invokevirtual   #417 <Method void setNavigationContentDescription(int)>
				return;
	//   17   35:return          
			}
		}
	}

	public void setDefaultNavigationIcon(Drawable drawable)
	{
		if(mDefaultNavigationIcon != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #127 <Field Drawable mDefaultNavigationIcon>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mDefaultNavigationIcon = drawable;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #127 <Field Drawable mDefaultNavigationIcon>
			updateNavigationIcon();
	//    7   13:aload_0         
	//    8   14:invokespecial   #420 <Method void updateNavigationIcon()>
		}
	//    9   17:return          
	}

	public void setDisplayOptions(int i)
	{
label0:
		{
			int j = mDisplayOpts ^ i;
	//    0    0:aload_0         
	//    1    1:getfield        #199 <Field int mDisplayOpts>
	//    2    4:iload_1         
	//    3    5:ixor            
	//    4    6:istore_2        
			mDisplayOpts = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #199 <Field int mDisplayOpts>
			if(j != 0)
	//*   8   12:iload_2         
	//*   9   13:ifeq            114
			{
				if((j & 4) != 0)
	//*  10   16:iload_2         
	//*  11   17:iconst_4        
	//*  12   18:iand            
	//*  13   19:ifeq            36
				{
					if((i & 4) != 0)
	//*  14   22:iload_1         
	//*  15   23:iconst_4        
	//*  16   24:iand            
	//*  17   25:ifeq            32
						updateHomeAccessibility();
	//   18   28:aload_0         
	//   19   29:invokespecial   #422 <Method void updateHomeAccessibility()>
					updateNavigationIcon();
	//   20   32:aload_0         
	//   21   33:invokespecial   #420 <Method void updateNavigationIcon()>
				}
				if((j & 3) != 0)
	//*  22   36:iload_2         
	//*  23   37:iconst_3        
	//*  24   38:iand            
	//*  25   39:ifeq            46
					updateToolbarLogo();
	//   26   42:aload_0         
	//   27   43:invokespecial   #424 <Method void updateToolbarLogo()>
				if((j & 8) != 0)
	//*  28   46:iload_2         
	//*  29   47:bipush          8
	//*  30   49:iand            
	//*  31   50:ifeq            82
					if((i & 8) != 0)
	//*  32   53:iload_1         
	//*  33   54:bipush          8
	//*  34   56:iand            
	//*  35   57:ifeq            115
					{
						mToolbar.setTitle(mTitle);
	//   36   60:aload_0         
	//   37   61:getfield        #76  <Field Toolbar mToolbar>
	//   38   64:aload_0         
	//   39   65:getfield        #84  <Field CharSequence mTitle>
	//   40   68:invokevirtual   #300 <Method void Toolbar.setTitle(CharSequence)>
						mToolbar.setSubtitle(mSubtitle);
	//   41   71:aload_0         
	//   42   72:getfield        #76  <Field Toolbar mToolbar>
	//   43   75:aload_0         
	//   44   76:getfield        #89  <Field CharSequence mSubtitle>
	//   45   79:invokevirtual   #425 <Method void Toolbar.setSubtitle(CharSequence)>
					} else
	//*  46   82:iload_2         
	//*  47   83:bipush          16
	//*  48   85:iand            
	//*  49   86:ifeq            114
	//*  50   89:aload_0         
	//*  51   90:getfield        #338 <Field View mCustomView>
	//*  52   93:ifnull          114
	//*  53   96:iload_1         
	//*  54   97:bipush          16
	//*  55   99:iand            
	//*  56  100:ifeq            134
	//*  57  103:aload_0         
	//*  58  104:getfield        #76  <Field Toolbar mToolbar>
	//*  59  107:aload_0         
	//*  60  108:getfield        #338 <Field View mCustomView>
	//*  61  111:invokevirtual   #416 <Method void Toolbar.addView(View)>
	//*  62  114:return          
					{
						mToolbar.setTitle(((CharSequence) (null)));
	//   63  115:aload_0         
	//   64  116:getfield        #76  <Field Toolbar mToolbar>
	//   65  119:aconst_null     
	//   66  120:invokevirtual   #300 <Method void Toolbar.setTitle(CharSequence)>
						mToolbar.setSubtitle(((CharSequence) (null)));
	//   67  123:aload_0         
	//   68  124:getfield        #76  <Field Toolbar mToolbar>
	//   69  127:aconst_null     
	//   70  128:invokevirtual   #425 <Method void Toolbar.setSubtitle(CharSequence)>
					}
				if((j & 0x10) != 0 && mCustomView != null)
				{
					if((i & 0x10) == 0)
						break label0;
					mToolbar.addView(mCustomView);
				}
			}
			return;
		}
	//*  71  131:goto            82
		mToolbar.removeView(mCustomView);
	//   72  134:aload_0         
	//   73  135:getfield        #76  <Field Toolbar mToolbar>
	//   74  138:aload_0         
	//   75  139:getfield        #338 <Field View mCustomView>
	//   76  142:invokevirtual   #413 <Method void Toolbar.removeView(View)>
	//   77  145:return          
	}

	public void setDropdownParams(SpinnerAdapter spinneradapter, android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
	{
		ensureSpinner();
	//    0    0:aload_0         
	//    1    1:invokespecial   #429 <Method void ensureSpinner()>
		mSpinner.setAdapter(spinneradapter);
	//    2    4:aload_0         
	//    3    5:getfield        #280 <Field Spinner mSpinner>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #433 <Method void Spinner.setAdapter(SpinnerAdapter)>
		mSpinner.setOnItemSelectedListener(onitemselectedlistener);
	//    6   12:aload_0         
	//    7   13:getfield        #280 <Field Spinner mSpinner>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #437 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//   10   20:return          
	}

	public void setDropdownSelectedPosition(int i)
	{
		if(mSpinner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #280 <Field Spinner mSpinner>
	//*   2    4:ifnonnull       18
		{
			throw new IllegalStateException("Can't set dropdown selected position without an adapter");
	//    3    7:new             #440 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #442 <String "Can't set dropdown selected position without an adapter">
	//    6   14:invokespecial   #445 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		} else
		{
			mSpinner.setSelection(i);
	//    8   18:aload_0         
	//    9   19:getfield        #280 <Field Spinner mSpinner>
	//   10   22:iload_1         
	//   11   23:invokevirtual   #448 <Method void Spinner.setSelection(int)>
			return;
	//   12   26:return          
		}
	}

	public void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview)
	{
		if(mTabView != null && mTabView.getParent() == mToolbar)
	//*   0    0:aload_0         
	//*   1    1:getfield        #363 <Field View mTabView>
	//*   2    4:ifnull          32
	//*   3    7:aload_0         
	//*   4    8:getfield        #363 <Field View mTabView>
	//*   5   11:invokevirtual   #456 <Method android.view.ViewParent View.getParent()>
	//*   6   14:aload_0         
	//*   7   15:getfield        #76  <Field Toolbar mToolbar>
	//*   8   18:if_acmpne       32
			mToolbar.removeView(mTabView);
	//    9   21:aload_0         
	//   10   22:getfield        #76  <Field Toolbar mToolbar>
	//   11   25:aload_0         
	//   12   26:getfield        #363 <Field View mTabView>
	//   13   29:invokevirtual   #413 <Method void Toolbar.removeView(View)>
		mTabView = ((View) (scrollingtabcontainerview));
	//   14   32:aload_0         
	//   15   33:aload_1         
	//   16   34:putfield        #363 <Field View mTabView>
		if(scrollingtabcontainerview != null && mNavigationMode == 2)
	//*  17   37:aload_1         
	//*  18   38:ifnull          96
	//*  19   41:aload_0         
	//*  20   42:getfield        #72  <Field int mNavigationMode>
	//*  21   45:iconst_2        
	//*  22   46:icmpne          96
		{
			mToolbar.addView(mTabView, 0);
	//   23   49:aload_0         
	//   24   50:getfield        #76  <Field Toolbar mToolbar>
	//   25   53:aload_0         
	//   26   54:getfield        #363 <Field View mTabView>
	//   27   57:iconst_0        
	//   28   58:invokevirtual   #459 <Method void Toolbar.addView(View, int)>
			Toolbar.LayoutParams layoutparams = (Toolbar.LayoutParams)mTabView.getLayoutParams();
	//   29   61:aload_0         
	//   30   62:getfield        #363 <Field View mTabView>
	//   31   65:invokevirtual   #460 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   32   68:checkcast       #291 <Class Toolbar$LayoutParams>
	//   33   71:astore_2        
			layoutparams.width = -2;
	//   34   72:aload_2         
	//   35   73:bipush          -2
	//   36   75:putfield        #463 <Field int Toolbar$LayoutParams.width>
			layoutparams.height = -2;
	//   37   78:aload_2         
	//   38   79:bipush          -2
	//   39   81:putfield        #464 <Field int Toolbar$LayoutParams.height>
			layoutparams.gravity = 0x800053;
	//   40   84:aload_2         
	//   41   85:ldc2            #465 <Int 0x800053>
	//   42   88:putfield        #468 <Field int Toolbar$LayoutParams.gravity>
			scrollingtabcontainerview.setAllowCollapse(true);
	//   43   91:aload_1         
	//   44   92:iconst_1        
	//   45   93:invokevirtual   #473 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
		}
	//   46   96:return          
	}

	public void setHomeButtonEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public void setIcon(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #283 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #479 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #163 <Method void setIcon(Drawable)>
	//*  10   18:return          
			drawable = null;
	//   11   19:aconst_null     
	//   12   20:astore_2        
		setIcon(drawable);
	//*  13   21:goto            13
	}

	public void setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #314 <Field Drawable mIcon>
		updateToolbarLogo();
	//    3    5:aload_0         
	//    4    6:invokespecial   #424 <Method void updateToolbarLogo()>
	//    5    9:return          
	}

	public void setLogo(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #283 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #479 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #157 <Method void setLogo(Drawable)>
	//*  10   18:return          
			drawable = null;
	//   11   19:aconst_null     
	//   12   20:astore_2        
		setLogo(drawable);
	//*  13   21:goto            13
	}

	public void setLogo(Drawable drawable)
	{
		mLogo = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #311 <Field Drawable mLogo>
		updateToolbarLogo();
	//    3    5:aload_0         
	//    4    6:invokespecial   #424 <Method void updateToolbarLogo()>
	//    5    9:return          
	}

	public void setMenu(Menu menu, android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
		if(mActionMenuPresenter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #483 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnonnull       35
		{
			mActionMenuPresenter = new ActionMenuPresenter(mToolbar.getContext());
	//    3    7:aload_0         
	//    4    8:new             #485 <Class ActionMenuPresenter>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #76  <Field Toolbar mToolbar>
	//    8   16:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//    9   19:invokespecial   #488 <Method void ActionMenuPresenter(Context)>
	//   10   22:putfield        #483 <Field ActionMenuPresenter mActionMenuPresenter>
			mActionMenuPresenter.setId(android.support.v7.appcompat.R.id.action_menu_presenter);
	//   11   25:aload_0         
	//   12   26:getfield        #483 <Field ActionMenuPresenter mActionMenuPresenter>
	//   13   29:getstatic       #493 <Field int android.support.v7.appcompat.R$id.action_menu_presenter>
	//   14   32:invokevirtual   #496 <Method void ActionMenuPresenter.setId(int)>
		}
		mActionMenuPresenter.setCallback(callback);
	//   15   35:aload_0         
	//   16   36:getfield        #483 <Field ActionMenuPresenter mActionMenuPresenter>
	//   17   39:aload_2         
	//   18   40:invokevirtual   #500 <Method void ActionMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
		mToolbar.setMenu((MenuBuilder)menu, mActionMenuPresenter);
	//   19   43:aload_0         
	//   20   44:getfield        #76  <Field Toolbar mToolbar>
	//   21   47:aload_1         
	//   22   48:checkcast       #502 <Class MenuBuilder>
	//   23   51:aload_0         
	//   24   52:getfield        #483 <Field ActionMenuPresenter mActionMenuPresenter>
	//   25   55:invokevirtual   #505 <Method void Toolbar.setMenu(MenuBuilder, ActionMenuPresenter)>
	//   26   58:return          
	}

	public void setMenuCallbacks(android.support.v7.view.menu.MenuPresenter.Callback callback, android.support.v7.view.menu.MenuBuilder.Callback callback1)
	{
		mToolbar.setMenuCallbacks(callback, callback1);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #509 <Method void Toolbar.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
	//    5    9:return          
	}

	public void setMenuPrepared()
	{
		mMenuPrepared = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #512 <Field boolean mMenuPrepared>
	//    3    5:return          
	}

	public void setNavigationContentDescription(int i)
	{
		Object obj;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            12
			obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:aload_0         
	//*   5    7:aload_2         
	//*   6    8:invokevirtual   #513 <Method void setNavigationContentDescription(CharSequence)>
	//*   7   11:return          
			obj = ((Object) (getContext().getString(i)));
	//    8   12:aload_0         
	//    9   13:invokevirtual   #283 <Method Context getContext()>
	//   10   16:iload_1         
	//   11   17:invokevirtual   #519 <Method String Context.getString(int)>
	//   12   20:astore_2        
		setNavigationContentDescription(((CharSequence) (obj)));
	//*  13   21:goto            6
	}

	public void setNavigationContentDescription(CharSequence charsequence)
	{
		mHomeDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #266 <Field CharSequence mHomeDescription>
		updateHomeAccessibility();
	//    3    5:aload_0         
	//    4    6:invokespecial   #422 <Method void updateHomeAccessibility()>
	//    5    9:return          
	}

	public void setNavigationIcon(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            19
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #283 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #479 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:aload_0         
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #166 <Method void setNavigationIcon(Drawable)>
	//*  10   18:return          
			drawable = null;
	//   11   19:aconst_null     
	//   12   20:astore_2        
		setNavigationIcon(drawable);
	//*  13   21:goto            13
	}

	public void setNavigationIcon(Drawable drawable)
	{
		mNavIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #97  <Field Drawable mNavIcon>
		updateNavigationIcon();
	//    3    5:aload_0         
	//    4    6:invokespecial   #420 <Method void updateNavigationIcon()>
	//    5    9:return          
	}

	public void setNavigationMode(int i)
	{
		int j = mNavigationMode;
	//    0    0:aload_0         
	//    1    1:getfield        #72  <Field int mNavigationMode>
	//    2    4:istore_2        
		if(i == j) goto _L2; else goto _L1
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:icmpeq          178
_L1:
		j;
	//    6   10:iload_2         
		JVM INSTR tableswitch 1 2: default 32
	//	               1 92
	//	               2 127;
	//    7   11:tableswitch     1 2: default 32
	//	               1 92
	//	               2 127
		   goto _L3 _L4 _L5
_L3:
		mNavigationMode = i;
	//    8   32:aload_0         
	//    9   33:iload_1         
	//   10   34:putfield        #72  <Field int mNavigationMode>
		i;
	//   11   37:iload_1         
		JVM INSTR tableswitch 0 2: default 64
	//	               0 178
	//	               1 162
	//	               2 179;
	//   12   38:tableswitch     0 2: default 64
	//	               0 178
	//	               1 162
	//	               2 179
		   goto _L6 _L2 _L7 _L8
_L6:
		throw new IllegalArgumentException((new StringBuilder()).append("Invalid navigation mode ").append(i).toString());
	//   13   64:new             #522 <Class IllegalArgumentException>
	//   14   67:dup             
	//   15   68:new             #524 <Class StringBuilder>
	//   16   71:dup             
	//   17   72:invokespecial   #525 <Method void StringBuilder()>
	//   18   75:ldc2            #527 <String "Invalid navigation mode ">
	//   19   78:invokevirtual   #531 <Method StringBuilder StringBuilder.append(String)>
	//   20   81:iload_1         
	//   21   82:invokevirtual   #534 <Method StringBuilder StringBuilder.append(int)>
	//   22   85:invokevirtual   #538 <Method String StringBuilder.toString()>
	//   23   88:invokespecial   #539 <Method void IllegalArgumentException(String)>
	//   24   91:athrow          
_L4:
		if(mSpinner != null && mSpinner.getParent() == mToolbar)
	//*  25   92:aload_0         
	//*  26   93:getfield        #280 <Field Spinner mSpinner>
	//*  27   96:ifnull          32
	//*  28   99:aload_0         
	//*  29  100:getfield        #280 <Field Spinner mSpinner>
	//*  30  103:invokevirtual   #540 <Method android.view.ViewParent Spinner.getParent()>
	//*  31  106:aload_0         
	//*  32  107:getfield        #76  <Field Toolbar mToolbar>
	//*  33  110:if_acmpne       32
			mToolbar.removeView(((View) (mSpinner)));
	//   34  113:aload_0         
	//   35  114:getfield        #76  <Field Toolbar mToolbar>
	//   36  117:aload_0         
	//   37  118:getfield        #280 <Field Spinner mSpinner>
	//   38  121:invokevirtual   #413 <Method void Toolbar.removeView(View)>
		  goto _L3
	//*  39  124:goto            32
_L5:
		if(mTabView != null && mTabView.getParent() == mToolbar)
	//*  40  127:aload_0         
	//*  41  128:getfield        #363 <Field View mTabView>
	//*  42  131:ifnull          32
	//*  43  134:aload_0         
	//*  44  135:getfield        #363 <Field View mTabView>
	//*  45  138:invokevirtual   #456 <Method android.view.ViewParent View.getParent()>
	//*  46  141:aload_0         
	//*  47  142:getfield        #76  <Field Toolbar mToolbar>
	//*  48  145:if_acmpne       32
			mToolbar.removeView(mTabView);
	//   49  148:aload_0         
	//   50  149:getfield        #76  <Field Toolbar mToolbar>
	//   51  152:aload_0         
	//   52  153:getfield        #363 <Field View mTabView>
	//   53  156:invokevirtual   #413 <Method void Toolbar.removeView(View)>
		  goto _L3
	//*  54  159:goto            32
_L7:
		ensureSpinner();
	//   55  162:aload_0         
	//   56  163:invokespecial   #429 <Method void ensureSpinner()>
		mToolbar.addView(((View) (mSpinner)), 0);
	//   57  166:aload_0         
	//   58  167:getfield        #76  <Field Toolbar mToolbar>
	//   59  170:aload_0         
	//   60  171:getfield        #280 <Field Spinner mSpinner>
	//   61  174:iconst_0        
	//   62  175:invokevirtual   #459 <Method void Toolbar.addView(View, int)>
_L2:
		return;
	//   63  178:return          
_L8:
		if(mTabView != null)
	//*  64  179:aload_0         
	//*  65  180:getfield        #363 <Field View mTabView>
	//*  66  183:ifnull          178
		{
			mToolbar.addView(mTabView, 0);
	//   67  186:aload_0         
	//   68  187:getfield        #76  <Field Toolbar mToolbar>
	//   69  190:aload_0         
	//   70  191:getfield        #363 <Field View mTabView>
	//   71  194:iconst_0        
	//   72  195:invokevirtual   #459 <Method void Toolbar.addView(View, int)>
			Toolbar.LayoutParams layoutparams = (Toolbar.LayoutParams)mTabView.getLayoutParams();
	//   73  198:aload_0         
	//   74  199:getfield        #363 <Field View mTabView>
	//   75  202:invokevirtual   #460 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   76  205:checkcast       #291 <Class Toolbar$LayoutParams>
	//   77  208:astore_3        
			layoutparams.width = -2;
	//   78  209:aload_3         
	//   79  210:bipush          -2
	//   80  212:putfield        #463 <Field int Toolbar$LayoutParams.width>
			layoutparams.height = -2;
	//   81  215:aload_3         
	//   82  216:bipush          -2
	//   83  218:putfield        #464 <Field int Toolbar$LayoutParams.height>
			layoutparams.gravity = 0x800053;
	//   84  221:aload_3         
	//   85  222:ldc2            #465 <Int 0x800053>
	//   86  225:putfield        #468 <Field int Toolbar$LayoutParams.gravity>
			return;
	//   87  228:return          
		}
		if(true) goto _L2; else goto _L9
_L9:
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mSubtitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #89  <Field CharSequence mSubtitle>
		if((mDisplayOpts & 8) != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #199 <Field int mDisplayOpts>
	//*   5    9:bipush          8
	//*   6   11:iand            
	//*   7   12:ifeq            23
			mToolbar.setSubtitle(charsequence);
	//    8   15:aload_0         
	//    9   16:getfield        #76  <Field Toolbar mToolbar>
	//   10   19:aload_1         
	//   11   20:invokevirtual   #425 <Method void Toolbar.setSubtitle(CharSequence)>
	//   12   23:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitleSet = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #91  <Field boolean mTitleSet>
		setTitleInt(charsequence);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #542 <Method void setTitleInt(CharSequence)>
	//    6   10:return          
	}

	public void setVisibility(int i)
	{
		mToolbar.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #545 <Method void Toolbar.setVisibility(int)>
	//    4    8:return          
	}

	public void setWindowCallback(android.view.Window.Callback callback)
	{
		mWindowCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #549 <Field android.view.Window$Callback mWindowCallback>
	//    3    5:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		if(!mTitleSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #91  <Field boolean mTitleSet>
	//*   2    4:ifne            12
			setTitleInt(charsequence);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #542 <Method void setTitleInt(CharSequence)>
	//    6   12:return          
	}

	public ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int visibility, long l)
	{
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mToolbar)));
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokestatic    #554 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//    3    7:astore          5
		float f;
		if(visibility == 0)
	//*   4    9:iload_1         
	//*   5   10:ifne            40
			f = 1.0F;
	//    6   13:fconst_1        
	//    7   14:fstore          4
		else
	//*   8   16:aload           5
	//*   9   18:fload           4
	//*  10   20:invokevirtual   #558 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//*  11   23:lload_2         
	//*  12   24:invokevirtual   #562 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setDuration(long)>
	//*  13   27:new             #10  <Class ToolbarWidgetWrapper$2>
	//*  14   30:dup             
	//*  15   31:aload_0         
	//*  16   32:iload_1         
	//*  17   33:invokespecial   #565 <Method void ToolbarWidgetWrapper$2(ToolbarWidgetWrapper, int)>
	//*  18   36:invokevirtual   #569 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//*  19   39:areturn         
			f = 0.0F;
	//   20   40:fconst_0        
	//   21   41:fstore          4
		return viewpropertyanimatorcompat.alpha(f).setDuration(l).setListener(((android.support.v4.view.ViewPropertyAnimatorListener) (new ViewPropertyAnimatorListenerAdapter() {

			public void onAnimationCancel(View view)
			{
				mCanceled = true;
			//    0    0:aload_0         
			//    1    1:iconst_1        
			//    2    2:putfield        #26  <Field boolean mCanceled>
			//    3    5:return          
			}

			public void onAnimationEnd(View view)
			{
				if(!mCanceled)
			//*   0    0:aload_0         
			//*   1    1:getfield        #26  <Field boolean mCanceled>
			//*   2    4:ifne            21
					mToolbar.setVisibility(visibility);
			//    3    7:aload_0         
			//    4    8:getfield        #19  <Field ToolbarWidgetWrapper this$0>
			//    5   11:getfield        #34  <Field Toolbar ToolbarWidgetWrapper.mToolbar>
			//    6   14:aload_0         
			//    7   15:getfield        #21  <Field int val$visibility>
			//    8   18:invokevirtual   #40  <Method void Toolbar.setVisibility(int)>
			//    9   21:return          
			}

			public void onAnimationStart(View view)
			{
				mToolbar.setVisibility(0);
			//    0    0:aload_0         
			//    1    1:getfield        #19  <Field ToolbarWidgetWrapper this$0>
			//    2    4:getfield        #34  <Field Toolbar ToolbarWidgetWrapper.mToolbar>
			//    3    7:iconst_0        
			//    4    8:invokevirtual   #40  <Method void Toolbar.setVisibility(int)>
			//    5   11:return          
			}

			private boolean mCanceled;
			final ToolbarWidgetWrapper this$0;
			final int val$visibility;

			
			{
				this$0 = ToolbarWidgetWrapper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ToolbarWidgetWrapper this$0>
				visibility = i;
			//    3    5:aload_0         
			//    4    6:iload_2         
			//    5    7:putfield        #21  <Field int val$visibility>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void ViewPropertyAnimatorListenerAdapter()>
				mCanceled = false;
			//    8   14:aload_0         
			//    9   15:iconst_0        
			//   10   16:putfield        #26  <Field boolean mCanceled>
			//   11   19:return          
			}
		}
)));
	//*  22   43:goto            16
	}

	public boolean showOverflowMenu()
	{
		return mToolbar.showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #76  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #572 <Method boolean Toolbar.showOverflowMenu()>
	//    3    7:ireturn         
	}

	private static final int AFFECTS_LOGO_MASK = 3;
	private static final long DEFAULT_FADE_DURATION_MS = 200L;
	private static final String TAG = "ToolbarWidgetWrapper";
	private ActionMenuPresenter mActionMenuPresenter;
	private View mCustomView;
	private int mDefaultNavigationContentDescription;
	private Drawable mDefaultNavigationIcon;
	private int mDisplayOpts;
	private CharSequence mHomeDescription;
	private Drawable mIcon;
	private Drawable mLogo;
	boolean mMenuPrepared;
	private Drawable mNavIcon;
	private int mNavigationMode;
	private Spinner mSpinner;
	private CharSequence mSubtitle;
	private View mTabView;
	CharSequence mTitle;
	private boolean mTitleSet;
	Toolbar mToolbar;
	android.view.Window.Callback mWindowCallback;
}
