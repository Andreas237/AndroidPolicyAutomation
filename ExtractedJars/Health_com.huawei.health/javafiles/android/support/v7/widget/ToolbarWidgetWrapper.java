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
	//   29   54:putfield        #91  <Field boolean mTitleSet>
		mNavIcon = toolbar.getNavigationIcon();
	//   30   57:aload_0         
	//   31   58:aload_1         
	//   32   59:invokevirtual   #95  <Method Drawable Toolbar.getNavigationIcon()>
	//   33   62:putfield        #97  <Field Drawable mNavIcon>
		toolbar = ((Toolbar) (TintTypedArray.obtainStyledAttributes(toolbar.getContext(), ((android.util.AttributeSet) (null)), android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0)));
	//   34   65:aload_1         
	//   35   66:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//   36   69:aconst_null     
	//   37   70:getstatic       #107 <Field int[] android.support.v7.appcompat.R$styleable.ActionBar>
	//   38   73:getstatic       #112 <Field int android.support.v7.appcompat.R$attr.actionBarStyle>
	//   39   76:iconst_0        
	//   40   77:invokestatic    #118 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[], int, int)>
	//   41   80:astore_1        
		mDefaultNavigationIcon = ((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_homeAsUpIndicator);
	//   42   81:aload_0         
	//   43   82:aload_1         
	//   44   83:getstatic       #121 <Field int android.support.v7.appcompat.R$styleable.ActionBar_homeAsUpIndicator>
	//   45   86:invokevirtual   #125 <Method Drawable TintTypedArray.getDrawable(int)>
	//   46   89:putfield        #127 <Field Drawable mDefaultNavigationIcon>
		if(flag)
	//*  47   92:iload_2         
	//*  48   93:ifeq            444
		{
			Object obj = ((Object) (((TintTypedArray) (toolbar)).getText(android.support.v7.appcompat.R.styleable.ActionBar_title)));
	//   49   96:aload_1         
	//   50   97:getstatic       #130 <Field int android.support.v7.appcompat.R$styleable.ActionBar_title>
	//   51  100:invokevirtual   #134 <Method CharSequence TintTypedArray.getText(int)>
	//   52  103:astore          7
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  53  105:aload           7
	//*  54  107:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  55  110:ifne            119
				setTitle(((CharSequence) (obj)));
	//   56  113:aload_0         
	//   57  114:aload           7
	//   58  116:invokevirtual   #144 <Method void setTitle(CharSequence)>
			obj = ((Object) (((TintTypedArray) (toolbar)).getText(android.support.v7.appcompat.R.styleable.ActionBar_subtitle)));
	//   59  119:aload_1         
	//   60  120:getstatic       #147 <Field int android.support.v7.appcompat.R$styleable.ActionBar_subtitle>
	//   61  123:invokevirtual   #134 <Method CharSequence TintTypedArray.getText(int)>
	//   62  126:astore          7
			if(!TextUtils.isEmpty(((CharSequence) (obj))))
	//*  63  128:aload           7
	//*  64  130:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  65  133:ifne            142
				setSubtitle(((CharSequence) (obj)));
	//   66  136:aload_0         
	//   67  137:aload           7
	//   68  139:invokevirtual   #150 <Method void setSubtitle(CharSequence)>
			obj = ((Object) (((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_logo)));
	//   69  142:aload_1         
	//   70  143:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.ActionBar_logo>
	//   71  146:invokevirtual   #125 <Method Drawable TintTypedArray.getDrawable(int)>
	//   72  149:astore          7
			if(obj != null)
	//*  73  151:aload           7
	//*  74  153:ifnull          162
				setLogo(((Drawable) (obj)));
	//   75  156:aload_0         
	//   76  157:aload           7
	//   77  159:invokevirtual   #157 <Method void setLogo(Drawable)>
			obj = ((Object) (((TintTypedArray) (toolbar)).getDrawable(android.support.v7.appcompat.R.styleable.ActionBar_icon)));
	//   78  162:aload_1         
	//   79  163:getstatic       #160 <Field int android.support.v7.appcompat.R$styleable.ActionBar_icon>
	//   80  166:invokevirtual   #125 <Method Drawable TintTypedArray.getDrawable(int)>
	//   81  169:astore          7
			if(obj != null)
	//*  82  171:aload           7
	//*  83  173:ifnull          182
				setIcon(((Drawable) (obj)));
	//   84  176:aload_0         
	//   85  177:aload           7
	//   86  179:invokevirtual   #163 <Method void setIcon(Drawable)>
			if(mNavIcon == null && mDefaultNavigationIcon != null)
	//*  87  182:aload_0         
	//*  88  183:getfield        #97  <Field Drawable mNavIcon>
	//*  89  186:ifnonnull       204
	//*  90  189:aload_0         
	//*  91  190:getfield        #127 <Field Drawable mDefaultNavigationIcon>
	//*  92  193:ifnull          204
				setNavigationIcon(mDefaultNavigationIcon);
	//   93  196:aload_0         
	//   94  197:aload_0         
	//   95  198:getfield        #127 <Field Drawable mDefaultNavigationIcon>
	//   96  201:invokevirtual   #166 <Method void setNavigationIcon(Drawable)>
			setDisplayOptions(((TintTypedArray) (toolbar)).getInt(android.support.v7.appcompat.R.styleable.ActionBar_displayOptions, 0));
	//   97  204:aload_0         
	//   98  205:aload_1         
	//   99  206:getstatic       #169 <Field int android.support.v7.appcompat.R$styleable.ActionBar_displayOptions>
	//  100  209:iconst_0        
	//  101  210:invokevirtual   #173 <Method int TintTypedArray.getInt(int, int)>
	//  102  213:invokevirtual   #177 <Method void setDisplayOptions(int)>
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_customNavigationLayout, 0);
	//  103  216:aload_1         
	//  104  217:getstatic       #180 <Field int android.support.v7.appcompat.R$styleable.ActionBar_customNavigationLayout>
	//  105  220:iconst_0        
	//  106  221:invokevirtual   #183 <Method int TintTypedArray.getResourceId(int, int)>
	//  107  224:istore          4
			if(j != 0)
	//* 108  226:iload           4
	//* 109  228:ifeq            266
			{
				setCustomView(LayoutInflater.from(mToolbar.getContext()).inflate(j, ((ViewGroup) (mToolbar)), false));
	//  110  231:aload_0         
	//  111  232:aload_0         
	//  112  233:getfield        #76  <Field Toolbar mToolbar>
	//  113  236:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//  114  239:invokestatic    #189 <Method LayoutInflater LayoutInflater.from(Context)>
	//  115  242:iload           4
	//  116  244:aload_0         
	//  117  245:getfield        #76  <Field Toolbar mToolbar>
	//  118  248:iconst_0        
	//  119  249:invokevirtual   #193 <Method View LayoutInflater.inflate(int, ViewGroup, boolean)>
	//  120  252:invokevirtual   #197 <Method void setCustomView(View)>
				setDisplayOptions(mDisplayOpts | 0x10);
	//  121  255:aload_0         
	//  122  256:aload_0         
	//  123  257:getfield        #199 <Field int mDisplayOpts>
	//  124  260:bipush          16
	//  125  262:ior             
	//  126  263:invokevirtual   #177 <Method void setDisplayOptions(int)>
			}
			j = ((TintTypedArray) (toolbar)).getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionBar_height, 0);
	//  127  266:aload_1         
	//  128  267:getstatic       #202 <Field int android.support.v7.appcompat.R$styleable.ActionBar_height>
	//  129  270:iconst_0        
	//  130  271:invokevirtual   #205 <Method int TintTypedArray.getLayoutDimension(int, int)>
	//  131  274:istore          4
			if(j > 0)
	//* 132  276:iload           4
	//* 133  278:ifle            306
			{
				android.view.ViewGroup.LayoutParams layoutparams = mToolbar.getLayoutParams();
	//  134  281:aload_0         
	//  135  282:getfield        #76  <Field Toolbar mToolbar>
	//  136  285:invokevirtual   #209 <Method android.view.ViewGroup$LayoutParams Toolbar.getLayoutParams()>
	//  137  288:astore          7
				layoutparams.height = j;
	//  138  290:aload           7
	//  139  292:iload           4
	//  140  294:putfield        #214 <Field int android.view.ViewGroup$LayoutParams.height>
				mToolbar.setLayoutParams(layoutparams);
	//  141  297:aload_0         
	//  142  298:getfield        #76  <Field Toolbar mToolbar>
	//  143  301:aload           7
	//  144  303:invokevirtual   #218 <Method void Toolbar.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			}
			j = ((TintTypedArray) (toolbar)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ActionBar_contentInsetStart, -1);
	//  145  306:aload_1         
	//  146  307:getstatic       #221 <Field int android.support.v7.appcompat.R$styleable.ActionBar_contentInsetStart>
	//  147  310:iconst_m1       
	//  148  311:invokevirtual   #224 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  149  314:istore          4
			int k = ((TintTypedArray) (toolbar)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.ActionBar_contentInsetEnd, -1);
	//  150  316:aload_1         
	//  151  317:getstatic       #227 <Field int android.support.v7.appcompat.R$styleable.ActionBar_contentInsetEnd>
	//  152  320:iconst_m1       
	//  153  321:invokevirtual   #224 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  154  324:istore          5
			if(j >= 0 || k >= 0)
	//* 155  326:iload           4
	//* 156  328:ifge            336
	//* 157  331:iload           5
	//* 158  333:iflt            355
				mToolbar.setContentInsetsRelative(Math.max(j, 0), Math.max(k, 0));
	//  159  336:aload_0         
	//  160  337:getfield        #76  <Field Toolbar mToolbar>
	//  161  340:iload           4
	//  162  342:iconst_0        
	//  163  343:invokestatic    #232 <Method int Math.max(int, int)>
	//  164  346:iload           5
	//  165  348:iconst_0        
	//  166  349:invokestatic    #232 <Method int Math.max(int, int)>
	//  167  352:invokevirtual   #236 <Method void Toolbar.setContentInsetsRelative(int, int)>
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_titleTextStyle, 0);
	//  168  355:aload_1         
	//  169  356:getstatic       #239 <Field int android.support.v7.appcompat.R$styleable.ActionBar_titleTextStyle>
	//  170  359:iconst_0        
	//  171  360:invokevirtual   #183 <Method int TintTypedArray.getResourceId(int, int)>
	//  172  363:istore          4
			if(j != 0)
	//* 173  365:iload           4
	//* 174  367:ifeq            386
				mToolbar.setTitleTextAppearance(mToolbar.getContext(), j);
	//  175  370:aload_0         
	//  176  371:getfield        #76  <Field Toolbar mToolbar>
	//  177  374:aload_0         
	//  178  375:getfield        #76  <Field Toolbar mToolbar>
	//  179  378:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//  180  381:iload           4
	//  181  383:invokevirtual   #243 <Method void Toolbar.setTitleTextAppearance(Context, int)>
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_subtitleTextStyle, 0);
	//  182  386:aload_1         
	//  183  387:getstatic       #246 <Field int android.support.v7.appcompat.R$styleable.ActionBar_subtitleTextStyle>
	//  184  390:iconst_0        
	//  185  391:invokevirtual   #183 <Method int TintTypedArray.getResourceId(int, int)>
	//  186  394:istore          4
			if(j != 0)
	//* 187  396:iload           4
	//* 188  398:ifeq            417
				mToolbar.setSubtitleTextAppearance(mToolbar.getContext(), j);
	//  189  401:aload_0         
	//  190  402:getfield        #76  <Field Toolbar mToolbar>
	//  191  405:aload_0         
	//  192  406:getfield        #76  <Field Toolbar mToolbar>
	//  193  409:invokevirtual   #101 <Method Context Toolbar.getContext()>
	//  194  412:iload           4
	//  195  414:invokevirtual   #249 <Method void Toolbar.setSubtitleTextAppearance(Context, int)>
			j = ((TintTypedArray) (toolbar)).getResourceId(android.support.v7.appcompat.R.styleable.ActionBar_popupTheme, 0);
	//  196  417:aload_1         
	//  197  418:getstatic       #252 <Field int android.support.v7.appcompat.R$styleable.ActionBar_popupTheme>
	//  198  421:iconst_0        
	//  199  422:invokevirtual   #183 <Method int TintTypedArray.getResourceId(int, int)>
	//  200  425:istore          4
			if(j != 0)
	//* 201  427:iload           4
	//* 202  429:ifeq            441
				mToolbar.setPopupTheme(j);
	//  203  432:aload_0         
	//  204  433:getfield        #76  <Field Toolbar mToolbar>
	//  205  436:iload           4
	//  206  438:invokevirtual   #255 <Method void Toolbar.setPopupTheme(int)>
		} else
	//* 207  441:goto            452
		{
			mDisplayOpts = detectDisplayOptions();
	//  208  444:aload_0         
	//  209  445:aload_0         
	//  210  446:invokespecial   #259 <Method int detectDisplayOptions()>
	//  211  449:putfield        #199 <Field int mDisplayOpts>
		}
		((TintTypedArray) (toolbar)).recycle();
	//  212  452:aload_1         
	//  213  453:invokevirtual   #262 <Method void TintTypedArray.recycle()>
		setDefaultNavigationContentDescription(i);
	//  214  456:aload_0         
	//  215  457:iload_3         
	//  216  458:invokevirtual   #265 <Method void setDefaultNavigationContentDescription(int)>
		mHomeDescription = mToolbar.getNavigationContentDescription();
	//  217  461:aload_0         
	//  218  462:aload_0         
	//  219  463:getfield        #76  <Field Toolbar mToolbar>
	//  220  466:invokevirtual   #268 <Method CharSequence Toolbar.getNavigationContentDescription()>
	//  221  469:putfield        #270 <Field CharSequence mHomeDescription>
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
	//  222  472:aload_0         
	//  223  473:getfield        #76  <Field Toolbar mToolbar>
	//  224  476:new             #8   <Class ToolbarWidgetWrapper$1>
	//  225  479:dup             
	//  226  480:aload_0         
	//  227  481:invokespecial   #273 <Method void ToolbarWidgetWrapper$1(ToolbarWidgetWrapper)>
	//  228  484:invokevirtual   #277 <Method void Toolbar.setNavigationOnClickListener(android.view.View$OnClickListener)>
	//  229  487:return          
	}

	private int detectDisplayOptions()
	{
		byte byte0 = 11;
	//    0    0:bipush          11
	//    1    2:istore_1        
		if(mToolbar.getNavigationIcon() != null)
	//*   2    3:aload_0         
	//*   3    4:getfield        #76  <Field Toolbar mToolbar>
	//*   4    7:invokevirtual   #95  <Method Drawable Toolbar.getNavigationIcon()>
	//*   5   10:ifnull          27
		{
			byte0 = 15;
	//    6   13:bipush          15
	//    7   15:istore_1        
			mDefaultNavigationIcon = mToolbar.getNavigationIcon();
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #76  <Field Toolbar mToolbar>
	//   11   21:invokevirtual   #95  <Method Drawable Toolbar.getNavigationIcon()>
	//   12   24:putfield        #127 <Field Drawable mDefaultNavigationIcon>
		}
		return ((int) (byte0));
	//   13   27:iload_1         
	//   14   28:ireturn         
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
		if((mDisplayOpts & 4) != 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #199 <Field int mDisplayOpts>
	//*   2    4:iconst_4        
	//*   3    5:iand            
	//*   4    6:ifeq            42
		{
			if(TextUtils.isEmpty(mHomeDescription))
	//*   5    9:aload_0         
	//*   6   10:getfield        #270 <Field CharSequence mHomeDescription>
	//*   7   13:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   8   16:ifeq            31
			{
				mToolbar.setNavigationContentDescription(mDefaultNavigationContentDescription);
	//    9   19:aload_0         
	//   10   20:getfield        #76  <Field Toolbar mToolbar>
	//   11   23:aload_0         
	//   12   24:getfield        #74  <Field int mDefaultNavigationContentDescription>
	//   13   27:invokevirtual   #304 <Method void Toolbar.setNavigationContentDescription(int)>
				return;
	//   14   30:return          
			}
			mToolbar.setNavigationContentDescription(mHomeDescription);
	//   15   31:aload_0         
	//   16   32:getfield        #76  <Field Toolbar mToolbar>
	//   17   35:aload_0         
	//   18   36:getfield        #270 <Field CharSequence mHomeDescription>
	//   19   39:invokevirtual   #306 <Method void Toolbar.setNavigationContentDescription(CharSequence)>
		}
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
	//*  10   18:ifnull          29
				drawable = mNavIcon;
	//   11   21:aload_0         
	//   12   22:getfield        #97  <Field Drawable mNavIcon>
	//   13   25:astore_1        
			else
	//*  14   26:goto            34
				drawable = mDefaultNavigationIcon;
	//   15   29:aload_0         
	//   16   30:getfield        #127 <Field Drawable mDefaultNavigationIcon>
	//   17   33:astore_1        
			toolbar.setNavigationIcon(drawable);
	//   18   34:aload_2         
	//   19   35:aload_1         
	//   20   36:invokevirtual   #308 <Method void Toolbar.setNavigationIcon(Drawable)>
			return;
	//   21   39:return          
		} else
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
	//*   6    8:ifeq            48
			if((mDisplayOpts & 1) != 0)
	//*   7   11:aload_0         
	//*   8   12:getfield        #199 <Field int mDisplayOpts>
	//*   9   15:iconst_1        
	//*  10   16:iand            
	//*  11   17:ifeq            43
			{
				if(mLogo != null)
	//*  12   20:aload_0         
	//*  13   21:getfield        #311 <Field Drawable mLogo>
	//*  14   24:ifnull          35
					drawable = mLogo;
	//   15   27:aload_0         
	//   16   28:getfield        #311 <Field Drawable mLogo>
	//   17   31:astore_1        
				else
	//*  18   32:goto            40
					drawable = mIcon;
	//   19   35:aload_0         
	//   20   36:getfield        #313 <Field Drawable mIcon>
	//   21   39:astore_1        
			} else
	//*  22   40:goto            48
			{
				drawable = mIcon;
	//   23   43:aload_0         
	//   24   44:getfield        #313 <Field Drawable mIcon>
	//   25   47:astore_1        
			}
		mToolbar.setLogo(drawable);
	//   26   48:aload_0         
	//   27   49:getfield        #76  <Field Toolbar mToolbar>
	//   28   52:aload_1         
	//   29   53:invokevirtual   #314 <Method void Toolbar.setLogo(Drawable)>
	//   30   56:return          
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
	//    1    1:getfield        #313 <Field Drawable mIcon>
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
		if(i == mDefaultNavigationContentDescription)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #74  <Field int mDefaultNavigationContentDescription>
	//*   3    5:icmpne          9
			return;
	//    4    8:return          
		mDefaultNavigationContentDescription = i;
	//    5    9:aload_0         
	//    6   10:iload_1         
	//    7   11:putfield        #74  <Field int mDefaultNavigationContentDescription>
		if(TextUtils.isEmpty(mToolbar.getNavigationContentDescription()))
	//*   8   14:aload_0         
	//*   9   15:getfield        #76  <Field Toolbar mToolbar>
	//*  10   18:invokevirtual   #268 <Method CharSequence Toolbar.getNavigationContentDescription()>
	//*  11   21:invokestatic    #140 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  12   24:ifeq            35
			setNavigationContentDescription(mDefaultNavigationContentDescription);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #74  <Field int mDefaultNavigationContentDescription>
	//   16   32:invokevirtual   #417 <Method void setNavigationContentDescription(int)>
	//   17   35:return          
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
	//*   9   13:ifeq            145
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
	//*  31   50:ifeq            101
				if((i & 8) != 0)
	//*  32   53:iload_1         
	//*  33   54:bipush          8
	//*  34   56:iand            
	//*  35   57:ifeq            85
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
	//*  46   82:goto            101
				{
					mToolbar.setTitle(((CharSequence) (null)));
	//   47   85:aload_0         
	//   48   86:getfield        #76  <Field Toolbar mToolbar>
	//   49   89:aconst_null     
	//   50   90:invokevirtual   #300 <Method void Toolbar.setTitle(CharSequence)>
					mToolbar.setSubtitle(((CharSequence) (null)));
	//   51   93:aload_0         
	//   52   94:getfield        #76  <Field Toolbar mToolbar>
	//   53   97:aconst_null     
	//   54   98:invokevirtual   #425 <Method void Toolbar.setSubtitle(CharSequence)>
				}
			if((j & 0x10) != 0 && mCustomView != null)
	//*  55  101:iload_2         
	//*  56  102:bipush          16
	//*  57  104:iand            
	//*  58  105:ifeq            145
	//*  59  108:aload_0         
	//*  60  109:getfield        #338 <Field View mCustomView>
	//*  61  112:ifnull          145
			{
				if((i & 0x10) != 0)
	//*  62  115:iload_1         
	//*  63  116:bipush          16
	//*  64  118:iand            
	//*  65  119:ifeq            134
				{
					mToolbar.addView(mCustomView);
	//   66  122:aload_0         
	//   67  123:getfield        #76  <Field Toolbar mToolbar>
	//   68  126:aload_0         
	//   69  127:getfield        #338 <Field View mCustomView>
	//   70  130:invokevirtual   #416 <Method void Toolbar.addView(View)>
					return;
	//   71  133:return          
				}
				mToolbar.removeView(mCustomView);
	//   72  134:aload_0         
	//   73  135:getfield        #76  <Field Toolbar mToolbar>
	//   74  138:aload_0         
	//   75  139:getfield        #338 <Field View mCustomView>
	//   76  142:invokevirtual   #413 <Method void Toolbar.removeView(View)>
			}
		}
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
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #283 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #479 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setIcon(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #163 <Method void setIcon(Drawable)>
	//   13   23:return          
	}

	public void setIcon(Drawable drawable)
	{
		mIcon = drawable;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #313 <Field Drawable mIcon>
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
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #283 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #479 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setLogo(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #157 <Method void setLogo(Drawable)>
	//   13   23:return          
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
	//    6   10:invokevirtual   #283 <Method Context getContext()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #518 <Method String Context.getString(int)>
	//    9   17:astore_2        
		setNavigationContentDescription(((CharSequence) (s)));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #519 <Method void setNavigationContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setNavigationContentDescription(CharSequence charsequence)
	{
		mHomeDescription = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #270 <Field CharSequence mHomeDescription>
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
	//*   1    1:ifeq            16
			drawable = AppCompatResources.getDrawable(getContext(), i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #283 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokestatic    #479 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			drawable = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setNavigationIcon(drawable);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #166 <Method void setNavigationIcon(Drawable)>
	//   13   23:return          
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

	//*   7   11:lookupswitch    2: default 36
	//	               1: 39
	//	               2: 74
	//*   8   36:goto            106
			case 1: // '\001'
				if(mSpinner != null && mSpinner.getParent() == mToolbar)
	//*   9   39:aload_0         
	//*  10   40:getfield        #280 <Field Spinner mSpinner>
	//*  11   43:ifnull          106
	//*  12   46:aload_0         
	//*  13   47:getfield        #280 <Field Spinner mSpinner>
	//*  14   50:invokevirtual   #521 <Method android.view.ViewParent Spinner.getParent()>
	//*  15   53:aload_0         
	//*  16   54:getfield        #76  <Field Toolbar mToolbar>
	//*  17   57:if_acmpne       106
					mToolbar.removeView(((View) (mSpinner)));
	//   18   60:aload_0         
	//   19   61:getfield        #76  <Field Toolbar mToolbar>
	//   20   64:aload_0         
	//   21   65:getfield        #280 <Field Spinner mSpinner>
	//   22   68:invokevirtual   #413 <Method void Toolbar.removeView(View)>
				break;
	//   23   71:goto            106

			case 2: // '\002'
				if(mTabView != null && mTabView.getParent() == mToolbar)
	//*  24   74:aload_0         
	//*  25   75:getfield        #363 <Field View mTabView>
	//*  26   78:ifnull          106
	//*  27   81:aload_0         
	//*  28   82:getfield        #363 <Field View mTabView>
	//*  29   85:invokevirtual   #456 <Method android.view.ViewParent View.getParent()>
	//*  30   88:aload_0         
	//*  31   89:getfield        #76  <Field Toolbar mToolbar>
	//*  32   92:if_acmpne       106
					mToolbar.removeView(mTabView);
	//   33   95:aload_0         
	//   34   96:getfield        #76  <Field Toolbar mToolbar>
	//   35   99:aload_0         
	//   36  100:getfield        #363 <Field View mTabView>
	//   37  103:invokevirtual   #413 <Method void Toolbar.removeView(View)>
				break;
			}
			mNavigationMode = i;
	//   38  106:aload_0         
	//   39  107:iload_1         
	//   40  108:putfield        #72  <Field int mNavigationMode>
			switch(i)
	//*  41  111:iload_1         
			{
	//*  42  112:tableswitch     0 2: default 140
	//	               0 143
	//	               1 144
	//	               2 161
	//*  43  140:goto            211
			case 0: // '\0'
				return;
	//   44  143:return          

			case 1: // '\001'
				ensureSpinner();
	//   45  144:aload_0         
	//   46  145:invokespecial   #429 <Method void ensureSpinner()>
				mToolbar.addView(((View) (mSpinner)), 0);
	//   47  148:aload_0         
	//   48  149:getfield        #76  <Field Toolbar mToolbar>
	//   49  152:aload_0         
	//   50  153:getfield        #280 <Field Spinner mSpinner>
	//   51  156:iconst_0        
	//   52  157:invokevirtual   #459 <Method void Toolbar.addView(View, int)>
				return;
	//   53  160:return          

			case 2: // '\002'
				if(mTabView != null)
	//*  54  161:aload_0         
	//*  55  162:getfield        #363 <Field View mTabView>
	//*  56  165:ifnull          239
				{
					mToolbar.addView(mTabView, 0);
	//   57  168:aload_0         
	//   58  169:getfield        #76  <Field Toolbar mToolbar>
	//   59  172:aload_0         
	//   60  173:getfield        #363 <Field View mTabView>
	//   61  176:iconst_0        
	//   62  177:invokevirtual   #459 <Method void Toolbar.addView(View, int)>
					Toolbar.LayoutParams layoutparams = (Toolbar.LayoutParams)mTabView.getLayoutParams();
	//   63  180:aload_0         
	//   64  181:getfield        #363 <Field View mTabView>
	//   65  184:invokevirtual   #460 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   66  187:checkcast       #291 <Class Toolbar$LayoutParams>
	//   67  190:astore_3        
					layoutparams.width = -2;
	//   68  191:aload_3         
	//   69  192:bipush          -2
	//   70  194:putfield        #463 <Field int Toolbar$LayoutParams.width>
					layoutparams.height = -2;
	//   71  197:aload_3         
	//   72  198:bipush          -2
	//   73  200:putfield        #464 <Field int Toolbar$LayoutParams.height>
					layoutparams.gravity = 0x800053;
	//   74  203:aload_3         
	//   75  204:ldc2            #465 <Int 0x800053>
	//   76  207:putfield        #468 <Field int Toolbar$LayoutParams.gravity>
					return;
	//   77  210:return          
				}
				break;

			default:
				throw new IllegalArgumentException((new StringBuilder()).append("Invalid navigation mode ").append(i).toString());
	//   78  211:new             #523 <Class IllegalArgumentException>
	//   79  214:dup             
	//   80  215:new             #525 <Class StringBuilder>
	//   81  218:dup             
	//   82  219:invokespecial   #526 <Method void StringBuilder()>
	//   83  222:ldc2            #528 <String "Invalid navigation mode ">
	//   84  225:invokevirtual   #532 <Method StringBuilder StringBuilder.append(String)>
	//   85  228:iload_1         
	//   86  229:invokevirtual   #535 <Method StringBuilder StringBuilder.append(int)>
	//   87  232:invokevirtual   #539 <Method String StringBuilder.toString()>
	//   88  235:invokespecial   #540 <Method void IllegalArgumentException(String)>
	//   89  238:athrow          
			}
		}
	//   90  239:return          
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
	//   13   26:invokevirtual   #558 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.alpha(float)>
	//   14   29:lload_2         
	//   15   30:invokevirtual   #562 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setDuration(long)>
	//   16   33:new             #10  <Class ToolbarWidgetWrapper$2>
	//   17   36:dup             
	//   18   37:aload_0         
	//   19   38:iload_1         
	//   20   39:invokespecial   #565 <Method void ToolbarWidgetWrapper$2(ToolbarWidgetWrapper, int)>
	//   21   42:invokevirtual   #569 <Method ViewPropertyAnimatorCompat ViewPropertyAnimatorCompat.setListener(android.support.v4.view.ViewPropertyAnimatorListener)>
	//   22   45:areturn         
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
