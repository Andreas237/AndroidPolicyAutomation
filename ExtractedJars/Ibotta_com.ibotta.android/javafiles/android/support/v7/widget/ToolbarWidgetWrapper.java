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
	//    3    3:getstatic       #48  <Field int android.support.v7.appcompat.R$string.abc_action_bar_up_description>
	//    4    6:getstatic       #53  <Field int android.support.v7.appcompat.R$drawable.abc_ic_ab_back_material>
	//    5    9:invokespecial   #56  <Method void ToolbarWidgetWrapper(Toolbar, boolean, int, int)>
	//    6   12:return          
	}

	public ToolbarWidgetWrapper(Toolbar toolbar, boolean flag, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void Object()>
		mNavigationMode = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #62  <Field int mNavigationMode>
		mDefaultNavigationContentDescription = 0;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #64  <Field int mDefaultNavigationContentDescription>
		mToolbar = toolbar;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #66  <Field Toolbar mToolbar>
		mTitle = toolbar.getTitle();
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:invokevirtual   #72  <Method CharSequence Toolbar.getTitle()>
	//   14   24:putfield        #74  <Field CharSequence mTitle>
		mSubtitle = toolbar.getSubtitle();
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #77  <Method CharSequence Toolbar.getSubtitle()>
	//   18   32:putfield        #79  <Field CharSequence mSubtitle>
		boolean flag1;
		if(mTitle != null)
	//*  19   35:aload_0         
	//*  20   36:getfield        #74  <Field CharSequence mTitle>
	//*  21   39:ifnull          48
			flag1 = true;
	//   22   42:iconst_1        
	//   23   43:istore          6
		else
	//*  24   45:goto            51
			flag1 = false;
	//   25   48:iconst_0        
	//   26   49:istore          6
		mTitleSet = flag1;
	//   27   51:aload_0         
	//   28   52:iload           6
	//   29   54:putfield        #81  <Field boolean mTitleSet>
		mNavIcon = toolbar.getNavigationIcon();
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:invokevirtual   #85  <Method Drawable Toolbar.getNavigationIcon()>
	//   33   62:putfield        #87  <Field Drawable mNavIcon>
		toolbar = ((Toolbar) (TintTypedArray.obtainStyledAttributes(toolbar.getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
	//   34   65:aload_1         
	//   35   66:invokevirtual   #91  <Method Context Toolbar.getContext()>
	//   36   69:aconst_null     
	//   37   70:getstatic       #97  <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//   38   73:getstatic       #102 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//   39   76:iconst_0        
	//   40   77:invokestatic    #108 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[], int, int)>
	//   41   80:astore_1        
		mDefaultNavigationIcon = ((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_homeAsUpIndicator);
	//   42   81:aload_0         
	//   43   82:aload_1         
	//   44   83:getstatic       #111 <Field int android.support.v7.appcompat.R$styleable.ActionBar_homeAsUpIndicator>
	//   45   86:invokevirtual   #115 <Method Drawable TintTypedArray.getDrawable(int)>
	//   46   89:putfield        #117 <Field Drawable mDefaultNavigationIcon>
		if(flag)
	//*  47   92:iload_2         
	//*  48   93:ifeq            450
		{
			Object obj = ((Object) (((TintTypedArray) (toolbar)).getText(android.support.v7.appcompat.R.styleable.ActionBar_title)));
	//   49   96:aload_1         
	//   50   97:getstatic       #120 <Field int android.support.v7.appcompat.R$styleable.ActionBar_title>
	//   51  100:invokevirtual   #124 <Method CharSequence TintTypedArray.getText(int)>
	//   52  103:astore          7
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  53  105:aload           7
	//*  54  107:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  110:ifne            119
				setTitle(((CharSequence) (obj)));
	//   56  113:aload_0         
	//   57  114:aload           7
	//   58  116:invokevirtual   #134 <Method void setTitle(CharSequence)>
			obj = ((Object) (((TintTypedArray) (toolbar)).getText(android.support.v7.appcompat.R.styleable.ActionBar_subtitle)));
	//   59  119:aload_1         
	//   60  120:getstatic       #137 <Field int android.support.v7.appcompat.R$styleable.ActionBar_subtitle>
	//   61  123:invokevirtual   #124 <Method CharSequence TintTypedArray.getText(int)>
	//   62  126:astore          7
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  63  128:aload           7
	//*  64  130:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  65  133:ifne            142
				setSubtitle(((CharSequence) (obj)));
	//   66  136:aload_0         
	//   67  137:aload           7
	//   68  139:invokevirtual   #140 <Method void setSubtitle(CharSequence)>
			obj = ((Object) (((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_logo)));
	//   69  142:aload_1         
	//   70  143:getstatic       #143 <Field int android.support.v7.appcompat.R$styleable.ActionBar_logo>
	//   71  146:invokevirtual   #115 <Method Drawable TintTypedArray.getDrawable(int)>
	//   72  149:astore          7
			if(obj != null)
	//*  73  151:aload           7
	//*  74  153:ifnull          162
				setLogo(((Drawable) (obj)));
	//   75  156:aload_0         
	//   76  157:aload           7
	//   77  159:invokevirtual   #147 <Method void setLogo(Drawable)>
			obj = ((Object) (((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_icon)));
	//   78  162:aload_1         
	//   79  163:getstatic       #150 <Field int android.support.v7.appcompat.R$styleable.ActionBar_icon>
	//   80  166:invokevirtual   #115 <Method Drawable TintTypedArray.getDrawable(int)>
	//   81  169:astore          7
			if(obj != null)
	//*  82  171:aload           7
	//*  83  173:ifnull          182
				setIcon(((Drawable) (obj)));
	//   84  176:aload_0         
	//   85  177:aload           7
	//   86  179:invokevirtual   #153 <Method void setIcon(Drawable)>
			if(mNavIcon == null)
	//*  87  182:aload_0         
	//*  88  183:getfield        #87  <Field Drawable mNavIcon>
	//*  89  186:ifnonnull       206
			{
				Drawable drawable = mDefaultNavigationIcon;
	//   90  189:aload_0         
	//   91  190:getfield        #117 <Field Drawable mDefaultNavigationIcon>
	//   92  193:astore          7
				if(drawable != null)
	//*  93  195:aload           7
	//*  94  197:ifnull          206
					setNavigationIcon(drawable);
	//   95  200:aload_0         
	//   96  201:aload           7
	//   97  203:invokevirtual   #156 <Method void setNavigationIcon(Drawable)>
			}
			setDisplayOptions(((TintTypedArray) (toolbar)).getInt(android.support.v7.appcompat.R.styleable.ActionBar_displayOptions, 0));
	//   98  206:aload_0         
	//   99  207:aload_1         
	//  100  208:getstatic       #159 <Field int android.support.v7.appcompat.R$styleable.ActionBar_displayOptions>
	//  101  211:iconst_0        
	//  102  212:invokevirtual   #163 <Method int TintTypedArray.getInt(int, int)>
	//  103  215:invokevirtual   #167 <Method void setDisplayOptions(int)>
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_customNavigationLayout, 0);
	//  104  218:aload_1         
	//  105  219:getstatic       #170 <Field int android.support.v7.appcompat.R$styleable.ActionBar_customNavigationLayout>
	//  106  222:iconst_0        
	//  107  223:invokevirtual   #173 <Method int TintTypedArray.getResourceId(int, int)>
	//  108  226:istore          4
			if(j != 0)
	//* 109  228:iload           4
	//* 110  230:ifeq            268
			{
				setCustomView(LayoutInflater.from(mToolbar.getContext()).inflate(j, ((ViewGroup) (mToolbar)), false));
	//  111  233:aload_0         
	//  112  234:aload_0         
	//  113  235:getfield        #66  <Field Toolbar mToolbar>
	//  114  238:invokevirtual   #91  <Method Context Toolbar.getContext()>
	//  115  241:invokestatic    #179 <Method LayoutInflater LayoutInflater.from(Context)>
	//  116  244:iload           4
	//  117  246:aload_0         
	//  118  247:getfield        #66  <Field Toolbar mToolbar>
	//  119  250:iconst_0        
	//  120  251:invokevirtual   #183 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  121  254:invokevirtual   #187 <Method void setCustomView(View)>
				setDisplayOptions(mDisplayOpts | 0x10);
	//  122  257:aload_0         
	//  123  258:aload_0         
	//  124  259:getfield        #189 <Field int mDisplayOpts>
	//  125  262:bipush          16
	//  126  264:ior             
	//  127  265:invokevirtual   #167 <Method void setDisplayOptions(int)>
			}
			j = ((TintTypedArray) (toolbar)).getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionBar_height, 0);
	//  128  268:aload_1         
	//  129  269:getstatic       #192 <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//  130  272:iconst_0        
	//  131  273:invokevirtual   #195 <Method int TintTypedArray.getLayoutDimension(int, int)>
	//  132  276:istore          4
			if(j > 0)
	//* 133  278:iload           4
	//* 134  280:ifle            308
			{
				android.view.ViewGroup.LayoutParams layoutparams = mToolbar.getLayoutParams();
	//  135  283:aload_0         
	//  136  284:getfield        #66  <Field Toolbar mToolbar>
	//  137  287:invokevirtual   #199 <Method android.view.ViewGroup$LayoutParams Toolbar.getLayoutParams()>
	//  138  290:astore          7
				layoutparams.height = j;
	//  139  292:aload           7
	//  140  294:iload           4
	//  141  296:putfield        #204 <Field int android.view.ViewGroup$LayoutParams.height>
				mToolbar.setLayoutParams(layoutparams);
	//  142  299:aload_0         
	//  143  300:getfield        #66  <Field Toolbar mToolbar>
	//  144  303:aload           7
	//  145  305:invokevirtual   #208 <Method void Toolbar.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			j = ((TintTypedArray) (toolbar)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ActionBar_contentInsetStart, -1);
	//  146  308:aload_1         
	//  147  309:getstatic       #211 <Field int android.support.v7.appcompat.R$styleable.ActionBar_contentInsetStart>
	//  148  312:iconst_m1       
	//  149  313:invokevirtual   #214 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  150  316:istore          4
			int k = ((TintTypedArray) (toolbar)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ActionBar_contentInsetEnd, -1);
	//  151  318:aload_1         
	//  152  319:getstatic       #217 <Field int android.support.v7.appcompat.R$styleable.ActionBar_contentInsetEnd>
	//  153  322:iconst_m1       
	//  154  323:invokevirtual   #214 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  155  326:istore          5
			if(j >= 0 || k >= 0)
	//* 156  328:iload           4
	//* 157  330:ifge            338
	//* 158  333:iload           5
	//* 159  335:iflt            357
				mToolbar.setContentInsetsRelative(Math.max(j, 0), Math.max(k, 0));
	//  160  338:aload_0         
	//  161  339:getfield        #66  <Field Toolbar mToolbar>
	//  162  342:iload           4
	//  163  344:iconst_0        
	//  164  345:invokestatic    #222 <Method int Math.max(int, int)>
	//  165  348:iload           5
	//  166  350:iconst_0        
	//  167  351:invokestatic    #222 <Method int Math.max(int, int)>
	//  168  354:invokevirtual   #226 <Method void Toolbar.setContentInsetsRelative(int, int)>
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_titleTextStyle, 0);
	//  169  357:aload_1         
	//  170  358:getstatic       #229 <Field int android.support.v7.appcompat.R$styleable.ActionBar_titleTextStyle>
	//  171  361:iconst_0        
	//  172  362:invokevirtual   #173 <Method int TintTypedArray.getResourceId(int, int)>
	//  173  365:istore          4
			if(j != 0)
	//* 174  367:iload           4
	//* 175  369:ifeq            390
			{
				Toolbar toolbar1 = mToolbar;
	//  176  372:aload_0         
	//  177  373:getfield        #66  <Field Toolbar mToolbar>
	//  178  376:astore          7
				toolbar1.setTitleTextAppearance(toolbar1.getContext(), j);
	//  179  378:aload           7
	//  180  380:aload           7
	//  181  382:invokevirtual   #91  <Method Context Toolbar.getContext()>
	//  182  385:iload           4
	//  183  387:invokevirtual   #233 <Method void Toolbar.setTitleTextAppearance(Context, int)>
			}
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_subtitleTextStyle, 0);
	//  184  390:aload_1         
	//  185  391:getstatic       #236 <Field int android.support.v7.appcompat.R$styleable.ActionBar_subtitleTextStyle>
	//  186  394:iconst_0        
	//  187  395:invokevirtual   #173 <Method int TintTypedArray.getResourceId(int, int)>
	//  188  398:istore          4
			if(j != 0)
	//* 189  400:iload           4
	//* 190  402:ifeq            423
			{
				Toolbar toolbar2 = mToolbar;
	//  191  405:aload_0         
	//  192  406:getfield        #66  <Field Toolbar mToolbar>
	//  193  409:astore          7
				toolbar2.setSubtitleTextAppearance(toolbar2.getContext(), j);
	//  194  411:aload           7
	//  195  413:aload           7
	//  196  415:invokevirtual   #91  <Method Context Toolbar.getContext()>
	//  197  418:iload           4
	//  198  420:invokevirtual   #239 <Method void Toolbar.setSubtitleTextAppearance(Context, int)>
			}
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_popupTheme, 0);
	//  199  423:aload_1         
	//  200  424:getstatic       #242 <Field int android.support.v7.appcompat.R$styleable.ActionBar_popupTheme>
	//  201  427:iconst_0        
	//  202  428:invokevirtual   #173 <Method int TintTypedArray.getResourceId(int, int)>
	//  203  431:istore          4
			if(j != 0)
	//* 204  433:iload           4
	//* 205  435:ifeq            458
				mToolbar.setPopupTheme(j);
	//  206  438:aload_0         
	//  207  439:getfield        #66  <Field Toolbar mToolbar>
	//  208  442:iload           4
	//  209  444:invokevirtual   #245 <Method void Toolbar.setPopupTheme(int)>
		} else
	//* 210  447:goto            458
		{
			mDisplayOpts = detectDisplayOptions();
	//  211  450:aload_0         
	//  212  451:aload_0         
	//  213  452:invokespecial   #249 <Method int detectDisplayOptions()>
	//  214  455:putfield        #189 <Field int mDisplayOpts>
		}
		((TintTypedArray) (toolbar)).recycle();
	//  215  458:aload_1         
	//  216  459:invokevirtual   #252 <Method void TintTypedArray.recycle()>
		setDefaultNavigationContentDescription(i);
	//  217  462:aload_0         
	//  218  463:iload_3         
	//  219  464:invokevirtual   #255 <Method void setDefaultNavigationContentDescription(int)>
		mHomeDescription = mToolbar.getNavigationContentDescription();
	//  220  467:aload_0         
	//  221  468:aload_0         
	//  222  469:getfield        #66  <Field Toolbar mToolbar>
	//  223  472:invokevirtual   #258 <Method CharSequence Toolbar.getNavigationContentDescription()>
	//  224  475:putfield        #260 <Field CharSequence mHomeDescription>
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
	//  225  478:aload_0         
	//  226  479:getfield        #66  <Field Toolbar mToolbar>
	//  227  482:new             #8   <Class ToolbarWidgetWrapper$1>
	//  228  485:dup             
	//  229  486:aload_0         
	//  230  487:invokespecial   #263 <Method void ToolbarWidgetWrapper$1(ToolbarWidgetWrapper)>
	//  231  490:invokevirtual   #267 <Method void Toolbar.setNavigationOnClickListener(android.view.View$OnClickListener)>
	//  232  493:return          
	}

	private int detectDisplayOptions()
	{
		if(mToolbar.getNavigationIcon() != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Toolbar mToolbar>
	//*   2    4:invokevirtual   #85  <Method Drawable Toolbar.getNavigationIcon()>
	//*   3    7:ifnull          24
		{
			mDefaultNavigationIcon = mToolbar.getNavigationIcon();
	//    4   10:aload_0         
	//    5   11:aload_0         
	//    6   12:getfield        #66  <Field Toolbar mToolbar>
	//    7   15:invokevirtual   #85  <Method Drawable Toolbar.getNavigationIcon()>
	//    8   18:putfield        #117 <Field Drawable mDefaultNavigationIcon>
			return 15;
	//    9   21:bipush          15
	//   10   23:ireturn         
		} else
		{
			return 11;
	//   11   24:bipush          11
	//   12   26:ireturn         
		}
	}

	private void ensureSpinner()
	{
		if(mSpinner == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #270 <Field Spinner mSpinner>
	//*   2    4:ifnonnull       49
		{
			mSpinner = ((Spinner) (new AppCompatSpinner(getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.attr.actionDropDownStyle)));
	//    3    7:aload_0         
	//    4    8:new             #272 <Class AppCompatSpinner>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #273 <Method Context getContext()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #276 <Field int android.support.v7.appcompat.R$attr.actionDropDownStyle>
	//   10   20:invokespecial   #279 <Method void AppCompatSpinner(Context, android.util.AttributeSet, int)>
	//   11   23:putfield        #270 <Field Spinner mSpinner>
			Toolbar.LayoutParams layoutparams = new Toolbar.LayoutParams(-2, -2, 0x800013);
	//   12   26:new             #281 <Class Toolbar$LayoutParams>
	//   13   29:dup             
	//   14   30:bipush          -2
	//   15   32:bipush          -2
	//   16   34:ldc2            #282 <Int 0x800013>
	//   17   37:invokespecial   #285 <Method void Toolbar$LayoutParams(int, int, int)>
	//   18   40:astore_1        
			mSpinner.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   19   41:aload_0         
	//   20   42:getfield        #270 <Field Spinner mSpinner>
	//   21   45:aload_1         
	//   22   46:invokevirtual   #288 <Method void Spinner.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
	//   23   49:return          
	}

	private void setTitleInt(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #74  <Field CharSequence mTitle>
		if((mDisplayOpts & 8) != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #189 <Field int mDisplayOpts>
	//*   5    9:bipush          8
	//*   6   11:iand            
	//*   7   12:ifeq            23
			mToolbar.setTitle(charsequence);
	//    8   15:aload_0         
	//    9   16:getfield        #66  <Field Toolbar mToolbar>
	//   10   19:aload_1         
	//   11   20:invokevirtual   #290 <Method void Toolbar.setTitle(CharSequence)>
	//   12   23:return          
	}

	private void updateHomeAccessibility()
	{
		if((mDisplayOpts & 4) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field int mDisplayOpts>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifeq            42
		{
			if(TextUtils.isEmpty(mHomeDescription))
	//*   5    9:aload_0         
	//*   6   10:getfield        #260 <Field CharSequence mHomeDescription>
	//*   7   13:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            31
			{
				mToolbar.setNavigationContentDescription(mDefaultNavigationContentDescription);
	//    9   19:aload_0         
	//   10   20:getfield        #66  <Field Toolbar mToolbar>
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field int mDefaultNavigationContentDescription>
	//   13   27:invokevirtual   #294 <Method void Toolbar.setNavigationContentDescription(int)>
				return;
	//   14   30:return          
			}
			mToolbar.setNavigationContentDescription(mHomeDescription);
	//   15   31:aload_0         
	//   16   32:getfield        #66  <Field Toolbar mToolbar>
	//   17   35:aload_0         
	//   18   36:getfield        #260 <Field CharSequence mHomeDescription>
	//   19   39:invokevirtual   #296 <Method void Toolbar.setNavigationContentDescription(CharSequence)>
		}
	//   20   42:return          
	}

	private void updateNavigationIcon()
	{
		if((mDisplayOpts & 4) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #189 <Field int mDisplayOpts>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifeq            37
		{
			Toolbar toolbar = mToolbar;
	//    5    9:aload_0         
	//    6   10:getfield        #66  <Field Toolbar mToolbar>
	//    7   13:astore_2        
			Drawable drawable = mNavIcon;
	//    8   14:aload_0         
	//    9   15:getfield        #87  <Field Drawable mNavIcon>
	//   10   18:astore_1        
			if(drawable == null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          26
	//*  13   23:goto            31
				drawable = mDefaultNavigationIcon;
	//   14   26:aload_0         
	//   15   27:getfield        #117 <Field Drawable mDefaultNavigationIcon>
	//   16   30:astore_1        
			toolbar.setNavigationIcon(drawable);
	//   17   31:aload_2         
	//   18   32:aload_1         
	//   19   33:invokevirtual   #298 <Method void Toolbar.setNavigationIcon(Drawable)>
			return;
	//   20   36:return          
		} else
		{
			mToolbar.setNavigationIcon(((Drawable) (null)));
	//   21   37:aload_0         
	//   22   38:getfield        #66  <Field Toolbar mToolbar>
	//   23   41:aconst_null     
	//   24   42:invokevirtual   #298 <Method void Toolbar.setNavigationIcon(Drawable)>
			return;
	//   25   45:return          
		}
	}

	private void updateToolbarLogo()
	{
		int i = mDisplayOpts;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int mDisplayOpts>
	//    2    4:istore_1        
		Drawable drawable;
		if((i & 2) != 0)
	//*   3    5:iload_1         
	//*   4    6:iconst_2        
	//*   5    7:iand            
	//*   6    8:ifeq            45
		{
			if((i & 1) != 0)
	//*   7   11:iload_1         
	//*   8   12:iconst_1        
	//*   9   13:iand            
	//*  10   14:ifeq            37
			{
				drawable = mLogo;
	//   11   17:aload_0         
	//   12   18:getfield        #301 <Field Drawable mLogo>
	//   13   21:astore_2        
				if(drawable == null)
	//*  14   22:aload_2         
	//*  15   23:ifnull          29
	//*  16   26:goto            47
					drawable = mIcon;
	//   17   29:aload_0         
	//   18   30:getfield        #303 <Field Drawable mIcon>
	//   19   33:astore_2        
			} else
	//*  20   34:goto            47
			{
				drawable = mIcon;
	//   21   37:aload_0         
	//   22   38:getfield        #303 <Field Drawable mIcon>
	//   23   41:astore_2        
			}
		} else
	//*  24   42:goto            47
		{
			drawable = null;
	//   25   45:aconst_null     
	//   26   46:astore_2        
		}
		mToolbar.setLogo(drawable);
	//   27   47:aload_0         
	//   28   48:getfield        #66  <Field Toolbar mToolbar>
	//   29   51:aload_2         
	//   30   52:invokevirtual   #304 <Method void Toolbar.setLogo(Drawable)>
	//   31   55:return          
	}

	public void animateToVisibility(int i)
	{
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat = setupAnimatorToVisibility(i, 200L);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:ldc2w           #306 <Long 200L>
	//    3    5:invokevirtual   #311 <Method ViewPropertyAnimatorCompat setupAnimatorToVisibility(int, long)>
	//    4    8:astore_2        
		if(viewpropertyanimatorcompat != null)
	//*   5    9:aload_2         
	//*   6   10:ifnull          17
			viewpropertyanimatorcompat.start();
	//    7   13:aload_2         
	//    8   14:invokevirtual   #316 <Method void ViewPropertyAnimatorCompat.start()>
	//    9   17:return          
	}

	public boolean canShowOverflowMenu()
	{
		return mToolbar.canShowOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #320 <Method boolean Toolbar.canShowOverflowMenu()>
	//    3    7:ireturn         
	}

	public void collapseActionView()
	{
		mToolbar.collapseActionView();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #323 <Method void Toolbar.collapseActionView()>
	//    3    7:return          
	}

	public void dismissPopupMenus()
	{
		mToolbar.dismissPopupMenus();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #326 <Method void Toolbar.dismissPopupMenus()>
	//    3    7:return          
	}

	public Context getContext()
	{
		return mToolbar.getContext();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #91  <Method Context Toolbar.getContext()>
	//    3    7:areturn         
	}

	public View getCustomView()
	{
		return mCustomView;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field View mCustomView>
	//    2    4:areturn         
	}

	public int getDisplayOptions()
	{
		return mDisplayOpts;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int mDisplayOpts>
	//    2    4:ireturn         
	}

	public int getDropdownItemCount()
	{
		Spinner spinner = mSpinner;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field Spinner mSpinner>
	//    2    4:astore_1        
		if(spinner != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return spinner.getCount();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #335 <Method int Spinner.getCount()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getDropdownSelectedPosition()
	{
		Spinner spinner = mSpinner;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field Spinner mSpinner>
	//    2    4:astore_1        
		if(spinner != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return spinner.getSelectedItemPosition();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #339 <Method int Spinner.getSelectedItemPosition()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getHeight()
	{
		return mToolbar.getHeight();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #342 <Method int Toolbar.getHeight()>
	//    3    7:ireturn         
	}

	public Menu getMenu()
	{
		return mToolbar.getMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #346 <Method Menu Toolbar.getMenu()>
	//    3    7:areturn         
	}

	public int getNavigationMode()
	{
		return mNavigationMode;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int mNavigationMode>
	//    2    4:ireturn         
	}

	public CharSequence getSubtitle()
	{
		return mToolbar.getSubtitle();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #77  <Method CharSequence Toolbar.getSubtitle()>
	//    3    7:areturn         
	}

	public CharSequence getTitle()
	{
		return mToolbar.getTitle();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #72  <Method CharSequence Toolbar.getTitle()>
	//    3    7:areturn         
	}

	public ViewGroup getViewGroup()
	{
		return ((ViewGroup) (mToolbar));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:areturn         
	}

	public int getVisibility()
	{
		return mToolbar.getVisibility();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #352 <Method int Toolbar.getVisibility()>
	//    3    7:ireturn         
	}

	public boolean hasEmbeddedTabs()
	{
		return mTabView != null;
	//    0    0:aload_0         
	//    1    1:getfield        #355 <Field View mTabView>
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
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #358 <Method boolean Toolbar.hasExpandedActionView()>
	//    3    7:ireturn         
	}

	public boolean hasIcon()
	{
		return mIcon != null;
	//    0    0:aload_0         
	//    1    1:getfield        #303 <Field Drawable mIcon>
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
	//    1    1:getfield        #301 <Field Drawable mLogo>
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
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #363 <Method boolean Toolbar.hideOverflowMenu()>
	//    3    7:ireturn         
	}

	public void initIndeterminateProgress()
	{
		Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
	//    0    0:ldc2            #366 <String "ToolbarWidgetWrapper">
	//    1    3:ldc2            #368 <String "Progress display unsupported">
	//    2    6:invokestatic    #374 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public void initProgress()
	{
		Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
	//    0    0:ldc2            #366 <String "ToolbarWidgetWrapper">
	//    1    3:ldc2            #368 <String "Progress display unsupported">
	//    2    6:invokestatic    #374 <Method int Log.i(String, String)>
	//    3    9:pop             
	//    4   10:return          
	}

	public boolean isOverflowMenuShowPending()
	{
		return mToolbar.isOverflowMenuShowPending();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #378 <Method boolean Toolbar.isOverflowMenuShowPending()>
	//    3    7:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		return mToolbar.isOverflowMenuShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #381 <Method boolean Toolbar.isOverflowMenuShowing()>
	//    3    7:ireturn         
	}

	public boolean isTitleTruncated()
	{
		return mToolbar.isTitleTruncated();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #384 <Method boolean Toolbar.isTitleTruncated()>
	//    3    7:ireturn         
	}

	public void restoreHierarchyState(SparseArray sparsearray)
	{
		mToolbar.restoreHierarchyState(sparsearray);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #388 <Method void Toolbar.restoreHierarchyState(SparseArray)>
	//    4    8:return          
	}

	public void saveHierarchyState(SparseArray sparsearray)
	{
		mToolbar.saveHierarchyState(sparsearray);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #393 <Method void Toolbar.saveHierarchyState(SparseArray)>
	//    4    8:return          
	}

	public void setBackgroundDrawable(Drawable drawable)
	{
		ViewCompat.setBackground(((View) (mToolbar)), drawable);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:invokestatic    #400 <Method void ViewCompat.setBackground(View, Drawable)>
	//    4    8:return          
	}

	public void setCollapsible(boolean flag)
	{
		mToolbar.setCollapsible(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #404 <Method void Toolbar.setCollapsible(boolean)>
	//    4    8:return          
	}

	public void setCustomView(View view)
	{
		View view1 = mCustomView;
	//    0    0:aload_0         
	//    1    1:getfield        #330 <Field View mCustomView>
	//    2    4:astore_2        
		if(view1 != null && (mDisplayOpts & 0x10) != 0)
	//*   3    5:aload_2         
	//*   4    6:ifnull          27
	//*   5    9:aload_0         
	//*   6   10:getfield        #189 <Field int mDisplayOpts>
	//*   7   13:bipush          16
	//*   8   15:iand            
	//*   9   16:ifeq            27
			mToolbar.removeView(view1);
	//   10   19:aload_0         
	//   11   20:getfield        #66  <Field Toolbar mToolbar>
	//   12   23:aload_2         
	//   13   24:invokevirtual   #407 <Method void Toolbar.removeView(View)>
		mCustomView = view;
	//   14   27:aload_0         
	//   15   28:aload_1         
	//   16   29:putfield        #330 <Field View mCustomView>
		if(view != null && (mDisplayOpts & 0x10) != 0)
	//*  17   32:aload_1         
	//*  18   33:ifnull          57
	//*  19   36:aload_0         
	//*  20   37:getfield        #189 <Field int mDisplayOpts>
	//*  21   40:bipush          16
	//*  22   42:iand            
	//*  23   43:ifeq            57
			mToolbar.addView(mCustomView);
	//   24   46:aload_0         
	//   25   47:getfield        #66  <Field Toolbar mToolbar>
	//   26   50:aload_0         
	//   27   51:getfield        #330 <Field View mCustomView>
	//   28   54:invokevirtual   #410 <Method void Toolbar.addView(View)>
	//   29   57:return          
	}

	public void setDefaultNavigationContentDescription(int i)
	{
		if(i == mDefaultNavigationContentDescription)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #64  <Field int mDefaultNavigationContentDescription>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mDefaultNavigationContentDescription = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #64  <Field int mDefaultNavigationContentDescription>
		if(TextUtils.isEmpty(mToolbar.getNavigationContentDescription()))
	//*   8   14:aload_0         
	//*   9   15:getfield        #66  <Field Toolbar mToolbar>
	//*  10   18:invokevirtual   #258 <Method CharSequence Toolbar.getNavigationContentDescription()>
	//*  11   21:invokestatic    #130 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   24:ifeq            35
			setNavigationContentDescription(mDefaultNavigationContentDescription);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #64  <Field int mDefaultNavigationContentDescription>
	//   16   32:invokevirtual   #411 <Method void setNavigationContentDescription(int)>
	//   17   35:return          
	}

	public void setDefaultNavigationIcon(Drawable drawable)
	{
		if(mDefaultNavigationIcon != drawable)
	//*   0    0:aload_0         
	//*   1    1:getfield        #117 <Field Drawable mDefaultNavigationIcon>
	//*   2    4:aload_1         
	//*   3    5:if_acmpeq       17
		{
			mDefaultNavigationIcon = drawable;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:putfield        #117 <Field Drawable mDefaultNavigationIcon>
			updateNavigationIcon();
	//    7   13:aload_0         
	//    8   14:invokespecial   #414 <Method void updateNavigationIcon()>
		}
	//    9   17:return          
	}

	public void setDisplayOptions(int i)
	{
		int j = mDisplayOpts ^ i;
	//    0    0:aload_0         
	//    1    1:getfield        #189 <Field int mDisplayOpts>
	//    2    4:iload_1         
	//    3    5:ixor            
	//    4    6:istore_2        
		mDisplayOpts = i;
	//    5    7:aload_0         
	//    6    8:iload_1         
	//    7    9:putfield        #189 <Field int mDisplayOpts>
		if(j != 0)
	//*   8   12:iload_2         
	//*   9   13:ifeq            141
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
	//   19   29:invokespecial   #416 <Method void updateHomeAccessibility()>
				updateNavigationIcon();
	//   20   32:aload_0         
	//   21   33:invokespecial   #414 <Method void updateNavigationIcon()>
			}
			if((j & 3) != 0)
	//*  22   36:iload_2         
	//*  23   37:iconst_3        
	//*  24   38:iand            
	//*  25   39:ifeq            46
				updateToolbarLogo();
	//   26   42:aload_0         
	//   27   43:invokespecial   #418 <Method void updateToolbarLogo()>
			if((j & 8) != 0)
	//*  28   46:iload_2         
	//*  29   47:bipush          8
	//*  30   49:iand            
	//*  31   50:ifeq            101
				if((i & 8) != 0)
	//*  32   53:iload_1         
	//*  33   54:bipush          8
	//*  34   56:iand            
	//*  35   57:ifeq            85
				{
					mToolbar.setTitle(mTitle);
	//   36   60:aload_0         
	//   37   61:getfield        #66  <Field Toolbar mToolbar>
	//   38   64:aload_0         
	//   39   65:getfield        #74  <Field CharSequence mTitle>
	//   40   68:invokevirtual   #290 <Method void Toolbar.setTitle(CharSequence)>
					mToolbar.setSubtitle(mSubtitle);
	//   41   71:aload_0         
	//   42   72:getfield        #66  <Field Toolbar mToolbar>
	//   43   75:aload_0         
	//   44   76:getfield        #79  <Field CharSequence mSubtitle>
	//   45   79:invokevirtual   #419 <Method void Toolbar.setSubtitle(CharSequence)>
				} else
	//*  46   82:goto            101
				{
					mToolbar.setTitle(((CharSequence) (null)));
	//   47   85:aload_0         
	//   48   86:getfield        #66  <Field Toolbar mToolbar>
	//   49   89:aconst_null     
	//   50   90:invokevirtual   #290 <Method void Toolbar.setTitle(CharSequence)>
					mToolbar.setSubtitle(((CharSequence) (null)));
	//   51   93:aload_0         
	//   52   94:getfield        #66  <Field Toolbar mToolbar>
	//   53   97:aconst_null     
	//   54   98:invokevirtual   #419 <Method void Toolbar.setSubtitle(CharSequence)>
				}
			if((j & 0x10) != 0)
	//*  55  101:iload_2         
	//*  56  102:bipush          16
	//*  57  104:iand            
	//*  58  105:ifeq            141
			{
				View view = mCustomView;
	//   59  108:aload_0         
	//   60  109:getfield        #330 <Field View mCustomView>
	//   61  112:astore_3        
				if(view != null)
	//*  62  113:aload_3         
	//*  63  114:ifnull          141
				{
					if((i & 0x10) != 0)
	//*  64  117:iload_1         
	//*  65  118:bipush          16
	//*  66  120:iand            
	//*  67  121:ifeq            133
					{
						mToolbar.addView(view);
	//   68  124:aload_0         
	//   69  125:getfield        #66  <Field Toolbar mToolbar>
	//   70  128:aload_3         
	//   71  129:invokevirtual   #410 <Method void Toolbar.addView(View)>
						return;
	//   72  132:return          
					}
					mToolbar.removeView(view);
	//   73  133:aload_0         
	//   74  134:getfield        #66  <Field Toolbar mToolbar>
	//   75  137:aload_3         
	//   76  138:invokevirtual   #407 <Method void Toolbar.removeView(View)>
				}
			}
		}
	//   77  141:return          
	}

	public void setDropdownParams(SpinnerAdapter spinneradapter, android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
	{
		ensureSpinner();
	//    0    0:aload_0         
	//    1    1:invokespecial   #423 <Method void ensureSpinner()>
		mSpinner.setAdapter(spinneradapter);
	//    2    4:aload_0         
	//    3    5:getfield        #270 <Field Spinner mSpinner>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #427 <Method void Spinner.setAdapter(SpinnerAdapter)>
		mSpinner.setOnItemSelectedListener(onitemselectedlistener);
	//    6   12:aload_0         
	//    7   13:getfield        #270 <Field Spinner mSpinner>
	//    8   16:aload_2         
	//    9   17:invokevirtual   #431 <Method void Spinner.setOnItemSelectedListener(android.widget.AdapterView$OnItemSelectedListener)>
	//   10   20:return          
	}

	public void setDropdownSelectedPosition(int i)
	{
		Spinner spinner = mSpinner;
	//    0    0:aload_0         
	//    1    1:getfield        #270 <Field Spinner mSpinner>
	//    2    4:astore_2        
		if(spinner != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          15
		{
			spinner.setSelection(i);
	//    5    9:aload_2         
	//    6   10:iload_1         
	//    7   11:invokevirtual   #435 <Method void Spinner.setSelection(int)>
			return;
	//    8   14:return          
		} else
		{
			throw new IllegalStateException("Can't set dropdown selected position without an adapter");
	//    9   15:new             #437 <Class IllegalStateException>
	//   10   18:dup             
	//   11   19:ldc2            #439 <String "Can't set dropdown selected position without an adapter">
	//   12   22:invokespecial   #442 <Method void IllegalStateException(String)>
	//   13   25:athrow          
		}
	}

	public void setEmbeddedTabView(ScrollingTabContainerView scrollingtabcontainerview)
	{
		Object obj = ((Object) (mTabView));
	//    0    0:aload_0         
	//    1    1:getfield        #355 <Field View mTabView>
	//    2    4:astore_2        
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          32
		{
			obj = ((Object) (((View) (obj)).getParent()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #450 <Method android.view.ViewParent View.getParent()>
	//    7   13:astore_2        
			Toolbar toolbar = mToolbar;
	//    8   14:aload_0         
	//    9   15:getfield        #66  <Field Toolbar mToolbar>
	//   10   18:astore_3        
			if(obj == toolbar)
	//*  11   19:aload_2         
	//*  12   20:aload_3         
	//*  13   21:if_acmpne       32
				toolbar.removeView(mTabView);
	//   14   24:aload_3         
	//   15   25:aload_0         
	//   16   26:getfield        #355 <Field View mTabView>
	//   17   29:invokevirtual   #407 <Method void Toolbar.removeView(View)>
		}
		mTabView = ((View) (scrollingtabcontainerview));
	//   18   32:aload_0         
	//   19   33:aload_1         
	//   20   34:putfield        #355 <Field View mTabView>
		if(scrollingtabcontainerview != null && mNavigationMode == 2)
	//*  21   37:aload_1         
	//*  22   38:ifnull          96
	//*  23   41:aload_0         
	//*  24   42:getfield        #62  <Field int mNavigationMode>
	//*  25   45:iconst_2        
	//*  26   46:icmpne          96
		{
			mToolbar.addView(mTabView, 0);
	//   27   49:aload_0         
	//   28   50:getfield        #66  <Field Toolbar mToolbar>
	//   29   53:aload_0         
	//   30   54:getfield        #355 <Field View mTabView>
	//   31   57:iconst_0        
	//   32   58:invokevirtual   #453 <Method void Toolbar.addView(View, int)>
			Toolbar.LayoutParams layoutparams = (Toolbar.LayoutParams)mTabView.getLayoutParams();
	//   33   61:aload_0         
	//   34   62:getfield        #355 <Field View mTabView>
	//   35   65:invokevirtual   #454 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   36   68:checkcast       #281 <Class Toolbar$LayoutParams>
	//   37   71:astore_2        
			layoutparams.width = -2;
	//   38   72:aload_2         
	//   39   73:bipush          -2
	//   40   75:putfield        #457 <Field int Toolbar$LayoutParams.width>
			layoutparams.height = -2;
	//   41   78:aload_2         
	//   42   79:bipush          -2
	//   43   81:putfield        #458 <Field int Toolbar$LayoutParams.height>
			layoutparams.gravity = 0x800053;
	//   44   84:aload_2         
	//   45   85:ldc2            #459 <Int 0x800053>
	//   46   88:putfield        #462 <Field int Toolbar$LayoutParams.gravity>
			scrollingtabcontainerview.setAllowCollapse(true);
	//   47   91:aload_1         
	//   48   92:iconst_1        
	//   49   93:invokevirtual   #467 <Method void ScrollingTabContainerView.setAllowCollapse(boolean)>
		}
	//   50   96:return          
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
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #273 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #473 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setIcon(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #153 <Method void setIcon(Drawable)>
	//   13   23:return          
	}

	public void setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #303 <Field Drawable mIcon>
		updateToolbarLogo();
	//    3    5:aload_0         
	//    4    6:invokespecial   #418 <Method void updateToolbarLogo()>
	//    5    9:return          
	}

	public void setLogo(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #273 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #473 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setLogo(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #147 <Method void setLogo(Drawable)>
	//   13   23:return          
	}

	public void setLogo(Drawable drawable)
	{
		mLogo = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #301 <Field Drawable mLogo>
		updateToolbarLogo();
	//    3    5:aload_0         
	//    4    6:invokespecial   #418 <Method void updateToolbarLogo()>
	//    5    9:return          
	}

	public void setMenu(Menu menu, android.support.v7.view.menu.MenuPresenter.Callback callback)
	{
		if(mActionMenuPresenter == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #477 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnonnull       35
		{
			mActionMenuPresenter = new ActionMenuPresenter(mToolbar.getContext());
	//    3    7:aload_0         
	//    4    8:new             #479 <Class ActionMenuPresenter>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:getfield        #66  <Field Toolbar mToolbar>
	//    8   16:invokevirtual   #91  <Method Context Toolbar.getContext()>
	//    9   19:invokespecial   #482 <Method void ActionMenuPresenter(Context)>
	//   10   22:putfield        #477 <Field ActionMenuPresenter mActionMenuPresenter>
			mActionMenuPresenter.setId(android.support.v7.appcompat.R.id.action_menu_presenter);
	//   11   25:aload_0         
	//   12   26:getfield        #477 <Field ActionMenuPresenter mActionMenuPresenter>
	//   13   29:getstatic       #487 <Field int android.support.v7.appcompat.R$id.action_menu_presenter>
	//   14   32:invokevirtual   #490 <Method void ActionMenuPresenter.setId(int)>
		}
		mActionMenuPresenter.setCallback(callback);
	//   15   35:aload_0         
	//   16   36:getfield        #477 <Field ActionMenuPresenter mActionMenuPresenter>
	//   17   39:aload_2         
	//   18   40:invokevirtual   #494 <Method void ActionMenuPresenter.setCallback(android.support.v7.view.menu.MenuPresenter$Callback)>
		mToolbar.setMenu((MenuBuilder)menu, mActionMenuPresenter);
	//   19   43:aload_0         
	//   20   44:getfield        #66  <Field Toolbar mToolbar>
	//   21   47:aload_1         
	//   22   48:checkcast       #496 <Class MenuBuilder>
	//   23   51:aload_0         
	//   24   52:getfield        #477 <Field ActionMenuPresenter mActionMenuPresenter>
	//   25   55:invokevirtual   #499 <Method void Toolbar.setMenu(MenuBuilder, ActionMenuPresenter)>
	//   26   58:return          
	}

	public void setMenuCallbacks(android.support.v7.view.menu.MenuPresenter.Callback callback, android.support.v7.view.menu.MenuBuilder.Callback callback1)
	{
		mToolbar.setMenuCallbacks(callback, callback1);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #503 <Method void Toolbar.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
	//    5    9:return          
	}

	public void setMenuPrepared()
	{
		mMenuPrepared = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #506 <Field boolean mMenuPrepared>
	//    3    5:return          
	}

	public void setNavigationContentDescription(int i)
	{
		String s;
		if(i == 0)
	//*   0    0:iload_1         
	//*   1    1:ifne            9
			s = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		else
	//*   4    6:goto            18
			s = getContext().getString(i);
	//    5    9:aload_0         
	//    6   10:invokevirtual   #273 <Method Context getContext()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #512 <Method String Context.getString(int)>
	//    9   17:astore_2        
		setNavigationContentDescription(((CharSequence) (s)));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #513 <Method void setNavigationContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setNavigationContentDescription(CharSequence charsequence)
	{
		mHomeDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #260 <Field CharSequence mHomeDescription>
		updateHomeAccessibility();
	//    3    5:aload_0         
	//    4    6:invokespecial   #416 <Method void updateHomeAccessibility()>
	//    5    9:return          
	}

	public void setNavigationIcon(int i)
	{
		Drawable drawable;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #273 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #473 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setNavigationIcon(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #156 <Method void setNavigationIcon(Drawable)>
	//   13   23:return          
	}

	public void setNavigationIcon(Drawable drawable)
	{
		mNavIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #87  <Field Drawable mNavIcon>
		updateNavigationIcon();
	//    3    5:aload_0         
	//    4    6:invokespecial   #414 <Method void updateNavigationIcon()>
	//    5    9:return          
	}

	public void setNavigationMode(int i)
	{
		int j = mNavigationMode;
	//    0    0:aload_0         
	//    1    1:getfield        #62  <Field int mNavigationMode>
	//    2    4:istore_2        
		if(i != j)
	//*   3    5:iload_1         
	//*   4    6:iload_2         
	//*   5    7:icmpeq          239
		{
			switch(j)
	//*   6   10:iload_2         
			{
			default:
				break;

	//*   7   11:tableswitch     1 2: default 32
	//	               1 73
	//	               2 35
	//*   8   32:goto            108
			case 2: // '\002'
				Object obj = ((Object) (mTabView));
	//    9   35:aload_0         
	//   10   36:getfield        #355 <Field View mTabView>
	//   11   39:astore_3        
				if(obj != null)
	//*  12   40:aload_3         
	//*  13   41:ifnull          108
				{
					obj = ((Object) (((View) (obj)).getParent()));
	//   14   44:aload_3         
	//   15   45:invokevirtual   #450 <Method android.view.ViewParent View.getParent()>
	//   16   48:astore_3        
					Toolbar toolbar = mToolbar;
	//   17   49:aload_0         
	//   18   50:getfield        #66  <Field Toolbar mToolbar>
	//   19   53:astore          4
					if(obj == toolbar)
	//*  20   55:aload_3         
	//*  21   56:aload           4
	//*  22   58:if_acmpne       108
						toolbar.removeView(mTabView);
	//   23   61:aload           4
	//   24   63:aload_0         
	//   25   64:getfield        #355 <Field View mTabView>
	//   26   67:invokevirtual   #407 <Method void Toolbar.removeView(View)>
				}
				break;
	//   27   70:goto            108

			case 1: // '\001'
				Object obj1 = ((Object) (mSpinner));
	//   28   73:aload_0         
	//   29   74:getfield        #270 <Field Spinner mSpinner>
	//   30   77:astore_3        
				if(obj1 == null)
					break;
	//   31   78:aload_3         
	//   32   79:ifnull          108
				obj1 = ((Object) (((Spinner) (obj1)).getParent()));
	//   33   82:aload_3         
	//   34   83:invokevirtual   #515 <Method android.view.ViewParent Spinner.getParent()>
	//   35   86:astore_3        
				Toolbar toolbar1 = mToolbar;
	//   36   87:aload_0         
	//   37   88:getfield        #66  <Field Toolbar mToolbar>
	//   38   91:astore          4
				if(obj1 == toolbar1)
	//*  39   93:aload_3         
	//*  40   94:aload           4
	//*  41   96:if_acmpne       108
					toolbar1.removeView(((View) (mSpinner)));
	//   42   99:aload           4
	//   43  101:aload_0         
	//   44  102:getfield        #270 <Field Spinner mSpinner>
	//   45  105:invokevirtual   #407 <Method void Toolbar.removeView(View)>
				break;
			}
			mNavigationMode = i;
	//   46  108:aload_0         
	//   47  109:iload_1         
	//   48  110:putfield        #62  <Field int mNavigationMode>
			switch(i)
	//*  49  113:iload_1         
			{
	//*  50  114:tableswitch     0 2: default 140
	//	               0 239
	//	               1 223
	//	               2 174
			default:
				StringBuilder stringbuilder = new StringBuilder();
	//   51  140:new             #517 <Class StringBuilder>
	//   52  143:dup             
	//   53  144:invokespecial   #518 <Method void StringBuilder()>
	//   54  147:astore_3        
				stringbuilder.append("Invalid navigation mode ");
	//   55  148:aload_3         
	//   56  149:ldc2            #520 <String "Invalid navigation mode ">
	//   57  152:invokevirtual   #524 <Method StringBuilder StringBuilder.append(String)>
	//   58  155:pop             
				stringbuilder.append(i);
	//   59  156:aload_3         
	//   60  157:iload_1         
	//   61  158:invokevirtual   #527 <Method StringBuilder StringBuilder.append(int)>
	//   62  161:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   63  162:new             #529 <Class IllegalArgumentException>
	//   64  165:dup             
	//   65  166:aload_3         
	//   66  167:invokevirtual   #533 <Method String StringBuilder.toString()>
	//   67  170:invokespecial   #534 <Method void IllegalArgumentException(String)>
	//   68  173:athrow          

			case 0: // '\0'
				break;

			case 2: // '\002'
				Object obj2 = ((Object) (mTabView));
	//   69  174:aload_0         
	//   70  175:getfield        #355 <Field View mTabView>
	//   71  178:astore_3        
				if(obj2 != null)
	//*  72  179:aload_3         
	//*  73  180:ifnull          239
				{
					mToolbar.addView(((View) (obj2)), 0);
	//   74  183:aload_0         
	//   75  184:getfield        #66  <Field Toolbar mToolbar>
	//   76  187:aload_3         
	//   77  188:iconst_0        
	//   78  189:invokevirtual   #453 <Method void Toolbar.addView(View, int)>
					obj2 = ((Object) ((Toolbar.LayoutParams)mTabView.getLayoutParams()));
	//   79  192:aload_0         
	//   80  193:getfield        #355 <Field View mTabView>
	//   81  196:invokevirtual   #454 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   82  199:checkcast       #281 <Class Toolbar$LayoutParams>
	//   83  202:astore_3        
					obj2.width = -2;
	//   84  203:aload_3         
	//   85  204:bipush          -2
	//   86  206:putfield        #457 <Field int Toolbar$LayoutParams.width>
					obj2.height = -2;
	//   87  209:aload_3         
	//   88  210:bipush          -2
	//   89  212:putfield        #458 <Field int Toolbar$LayoutParams.height>
					obj2.gravity = 0x800053;
	//   90  215:aload_3         
	//   91  216:ldc2            #459 <Int 0x800053>
	//   92  219:putfield        #462 <Field int Toolbar$LayoutParams.gravity>
					return;
	//   93  222:return          
				}
				break;

			case 1: // '\001'
				ensureSpinner();
	//   94  223:aload_0         
	//   95  224:invokespecial   #423 <Method void ensureSpinner()>
				mToolbar.addView(((View) (mSpinner)), 0);
	//   96  227:aload_0         
	//   97  228:getfield        #66  <Field Toolbar mToolbar>
	//   98  231:aload_0         
	//   99  232:getfield        #270 <Field Spinner mSpinner>
	//  100  235:iconst_0        
	//  101  236:invokevirtual   #453 <Method void Toolbar.addView(View, int)>
				break;
			}
		}
	//  102  239:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mSubtitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #79  <Field CharSequence mSubtitle>
		if((mDisplayOpts & 8) != 0)
	//*   3    5:aload_0         
	//*   4    6:getfield        #189 <Field int mDisplayOpts>
	//*   5    9:bipush          8
	//*   6   11:iand            
	//*   7   12:ifeq            23
			mToolbar.setSubtitle(charsequence);
	//    8   15:aload_0         
	//    9   16:getfield        #66  <Field Toolbar mToolbar>
	//   10   19:aload_1         
	//   11   20:invokevirtual   #419 <Method void Toolbar.setSubtitle(CharSequence)>
	//   12   23:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitleSet = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #81  <Field boolean mTitleSet>
		setTitleInt(charsequence);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokespecial   #536 <Method void setTitleInt(CharSequence)>
	//    6   10:return          
	}

	public void setVisibility(int i)
	{
		mToolbar.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #539 <Method void Toolbar.setVisibility(int)>
	//    4    8:return          
	}

	public void setWindowCallback(android.view.Window.Callback callback)
	{
		mWindowCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #543 <Field android.view.Window$Callback mWindowCallback>
	//    3    5:return          
	}

	public void setWindowTitle(CharSequence charsequence)
	{
		if(!mTitleSet)
	//*   0    0:aload_0         
	//*   1    1:getfield        #81  <Field boolean mTitleSet>
	//*   2    4:ifne            12
			setTitleInt(charsequence);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #536 <Method void setTitleInt(CharSequence)>
	//    6   12:return          
	}

	public ViewPropertyAnimatorCompat setupAnimatorToVisibility(final int visibility, long l)
	{
		ViewPropertyAnimatorCompat viewpropertyanimatorcompat = ViewCompat.animate(((View) (mToolbar)));
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokestatic    #548 <Method ViewPropertyAnimatorCompat ViewCompat.animate(View)>
	//    3    7:astore          5
		float f;
		if(visibility == 0)
	//*   4    9:iload_1         
	//*   5   10:ifne            19
			f = 1.0F;
	//    6   13:fconst_1        
	//    7   14:fstore          4
		else
	//*   8   16:goto            22
			f = 0.0F;
	//    9   19:fconst_0        
	//   10   20:fstore          4
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
	//   11   22:aload           5
	//   12   24:fload           4
	//   13   26:invokevirtual   #552 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//   14   29:lload_2         
	//   15   30:invokevirtual   #556 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setDuration(long)>
	//   16   33:new             #10  <Class ToolbarWidgetWrapper$2>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:iload_1         
	//   20   39:invokespecial   #559 <Method void ToolbarWidgetWrapper$2(ToolbarWidgetWrapper, int)>
	//   21   42:invokevirtual   #563 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//   22   45:areturn         
	}

	public boolean showOverflowMenu()
	{
		return mToolbar.showOverflowMenu();
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Toolbar mToolbar>
	//    2    4:invokevirtual   #566 <Method boolean Toolbar.showOverflowMenu()>
	//    3    7:ireturn         
	}

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
