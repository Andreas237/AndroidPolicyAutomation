// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.support.v4.view.*;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.SupportMenuInflater;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuItemImpl;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.widget.*;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//			TintTypedArray, RtlSpacingHelper, AppCompatImageView, ActionMenuView, 
//			AppCompatImageButton, ToolbarWidgetWrapper, ViewUtils, ActionMenuPresenter, 
//			AppCompatTextView, DecorToolbar

public class Toolbar extends ViewGroup
{

	public Toolbar(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #75  <Method void Toolbar(Context, AttributeSet)>
	//    4    6:return          
	}

	public Toolbar(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.toolbarStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #81  <Field int android.support.v7.appcompat.R$attr.toolbarStyle>
	//    4    6:invokespecial   #84  <Method void Toolbar(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public Toolbar(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #85  <Method void ViewGroup(Context, AttributeSet, int)>
		mGravity = 0x800013;
	//    5    7:aload_0         
	//    6    8:ldc1            #86  <Int 0x800013>
	//    7   10:putfield        #88  <Field int mGravity>
		mTempViews = new ArrayList();
	//    8   13:aload_0         
	//    9   14:new             #90  <Class ArrayList>
	//   10   17:dup             
	//   11   18:invokespecial   #93  <Method void ArrayList()>
	//   12   21:putfield        #95  <Field ArrayList mTempViews>
		mHiddenViews = new ArrayList();
	//   13   24:aload_0         
	//   14   25:new             #90  <Class ArrayList>
	//   15   28:dup             
	//   16   29:invokespecial   #93  <Method void ArrayList()>
	//   17   32:putfield        #97  <Field ArrayList mHiddenViews>
		mTempMargins = new int[2];
	//   18   35:aload_0         
	//   19   36:iconst_2        
	//   20   37:newarray        int[]
	//   21   39:putfield        #99  <Field int[] mTempMargins>
		mMenuViewItemClickListener = ((ActionMenuView.OnMenuItemClickListener) (new _cls1()));
	//   22   42:aload_0         
	//   23   43:new             #101 <Class Toolbar$1>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:invokespecial   #104 <Method void Toolbar$1(Toolbar)>
	//   27   51:putfield        #106 <Field ActionMenuView$OnMenuItemClickListener mMenuViewItemClickListener>
		mShowOverflowMenuRunnable = ((Runnable) (new _cls2()));
	//   28   54:aload_0         
	//   29   55:new             #108 <Class Toolbar$2>
	//   30   58:dup             
	//   31   59:aload_0         
	//   32   60:invokespecial   #109 <Method void Toolbar$2(Toolbar)>
	//   33   63:putfield        #111 <Field Runnable mShowOverflowMenuRunnable>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(getContext(), attributeset, android.support.v7.appcompat.R.styleable.Toolbar, i, 0)));
	//   34   66:aload_0         
	//   35   67:invokevirtual   #115 <Method Context getContext()>
	//   36   70:aload_2         
	//   37   71:getstatic       #119 <Field int[] android.support.v7.appcompat.R$styleable.Toolbar>
	//   38   74:iload_3         
	//   39   75:iconst_0        
	//   40   76:invokestatic    #125 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   41   79:astore_1        
		mTitleTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_titleTextAppearance, 0);
	//   42   80:aload_0         
	//   43   81:aload_1         
	//   44   82:getstatic       #128 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleTextAppearance>
	//   45   85:iconst_0        
	//   46   86:invokevirtual   #132 <Method int TintTypedArray.getResourceId(int, int)>
	//   47   89:putfield        #134 <Field int mTitleTextAppearance>
		mSubtitleTextAppearance = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextAppearance, 0);
	//   48   92:aload_0         
	//   49   93:aload_1         
	//   50   94:getstatic       #137 <Field int android.support.v7.appcompat.R$styleable.Toolbar_subtitleTextAppearance>
	//   51   97:iconst_0        
	//   52   98:invokevirtual   #132 <Method int TintTypedArray.getResourceId(int, int)>
	//   53  101:putfield        #139 <Field int mSubtitleTextAppearance>
		mGravity = ((TintTypedArray) (context)).getInteger(android.support.v7.appcompat.R.styleable.Toolbar_android_gravity, mGravity);
	//   54  104:aload_0         
	//   55  105:aload_1         
	//   56  106:getstatic       #142 <Field int android.support.v7.appcompat.R$styleable.Toolbar_android_gravity>
	//   57  109:aload_0         
	//   58  110:getfield        #88  <Field int mGravity>
	//   59  113:invokevirtual   #145 <Method int TintTypedArray.getInteger(int, int)>
	//   60  116:putfield        #88  <Field int mGravity>
		mButtonGravity = ((TintTypedArray) (context)).getInteger(android.support.v7.appcompat.R.styleable.Toolbar_buttonGravity, 48);
	//   61  119:aload_0         
	//   62  120:aload_1         
	//   63  121:getstatic       #148 <Field int android.support.v7.appcompat.R$styleable.Toolbar_buttonGravity>
	//   64  124:bipush          48
	//   65  126:invokevirtual   #145 <Method int TintTypedArray.getInteger(int, int)>
	//   66  129:putfield        #150 <Field int mButtonGravity>
		int j = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMargin, 0);
	//   67  132:aload_1         
	//   68  133:getstatic       #153 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMargin>
	//   69  136:iconst_0        
	//   70  137:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//   71  140:istore          4
		i = j;
	//   72  142:iload           4
	//   73  144:istore_3        
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.Toolbar_titleMargins))
	//*  74  145:aload_1         
	//*  75  146:getstatic       #159 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMargins>
	//*  76  149:invokevirtual   #163 <Method boolean TintTypedArray.hasValue(int)>
	//*  77  152:ifeq            165
			i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMargins, j);
	//   78  155:aload_1         
	//   79  156:getstatic       #159 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMargins>
	//   80  159:iload           4
	//   81  161:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//   82  164:istore_3        
		mTitleMarginBottom = i;
	//   83  165:aload_0         
	//   84  166:iload_3         
	//   85  167:putfield        #165 <Field int mTitleMarginBottom>
		mTitleMarginTop = i;
	//   86  170:aload_0         
	//   87  171:iload_3         
	//   88  172:putfield        #167 <Field int mTitleMarginTop>
		mTitleMarginEnd = i;
	//   89  175:aload_0         
	//   90  176:iload_3         
	//   91  177:putfield        #169 <Field int mTitleMarginEnd>
		mTitleMarginStart = i;
	//   92  180:aload_0         
	//   93  181:iload_3         
	//   94  182:putfield        #171 <Field int mTitleMarginStart>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginStart, -1);
	//   95  185:aload_1         
	//   96  186:getstatic       #174 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMarginStart>
	//   97  189:iconst_m1       
	//   98  190:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//   99  193:istore_3        
		if(i >= 0)
	//* 100  194:iload_3         
	//* 101  195:iflt            203
			mTitleMarginStart = i;
	//  102  198:aload_0         
	//  103  199:iload_3         
	//  104  200:putfield        #171 <Field int mTitleMarginStart>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginEnd, -1);
	//  105  203:aload_1         
	//  106  204:getstatic       #177 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMarginEnd>
	//  107  207:iconst_m1       
	//  108  208:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  109  211:istore_3        
		if(i >= 0)
	//* 110  212:iload_3         
	//* 111  213:iflt            221
			mTitleMarginEnd = i;
	//  112  216:aload_0         
	//  113  217:iload_3         
	//  114  218:putfield        #169 <Field int mTitleMarginEnd>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginTop, -1);
	//  115  221:aload_1         
	//  116  222:getstatic       #180 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMarginTop>
	//  117  225:iconst_m1       
	//  118  226:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  119  229:istore_3        
		if(i >= 0)
	//* 120  230:iload_3         
	//* 121  231:iflt            239
			mTitleMarginTop = i;
	//  122  234:aload_0         
	//  123  235:iload_3         
	//  124  236:putfield        #167 <Field int mTitleMarginTop>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_titleMarginBottom, -1);
	//  125  239:aload_1         
	//  126  240:getstatic       #183 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleMarginBottom>
	//  127  243:iconst_m1       
	//  128  244:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  129  247:istore_3        
		if(i >= 0)
	//* 130  248:iload_3         
	//* 131  249:iflt            257
			mTitleMarginBottom = i;
	//  132  252:aload_0         
	//  133  253:iload_3         
	//  134  254:putfield        #165 <Field int mTitleMarginBottom>
		mMaxButtonHeight = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_maxButtonHeight, -1);
	//  135  257:aload_0         
	//  136  258:aload_1         
	//  137  259:getstatic       #186 <Field int android.support.v7.appcompat.R$styleable.Toolbar_maxButtonHeight>
	//  138  262:iconst_m1       
	//  139  263:invokevirtual   #189 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  140  266:putfield        #191 <Field int mMaxButtonHeight>
		i = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetStart, 0x80000000);
	//  141  269:aload_1         
	//  142  270:getstatic       #194 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetStart>
	//  143  273:ldc1            #195 <Int 0x80000000>
	//  144  275:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  145  278:istore_3        
		j = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetEnd, 0x80000000);
	//  146  279:aload_1         
	//  147  280:getstatic       #198 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetEnd>
	//  148  283:ldc1            #195 <Int 0x80000000>
	//  149  285:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  150  288:istore          4
		int k = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetLeft, 0);
	//  151  290:aload_1         
	//  152  291:getstatic       #201 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetLeft>
	//  153  294:iconst_0        
	//  154  295:invokevirtual   #189 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  155  298:istore          5
		int i1 = ((TintTypedArray) (context)).getDimensionPixelSize(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetRight, 0);
	//  156  300:aload_1         
	//  157  301:getstatic       #204 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetRight>
	//  158  304:iconst_0        
	//  159  305:invokevirtual   #189 <Method int TintTypedArray.getDimensionPixelSize(int, int)>
	//  160  308:istore          6
		ensureContentInsets();
	//  161  310:aload_0         
	//  162  311:invokespecial   #207 <Method void ensureContentInsets()>
		mContentInsets.setAbsolute(k, i1);
	//  163  314:aload_0         
	//  164  315:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//  165  318:iload           5
	//  166  320:iload           6
	//  167  322:invokevirtual   #215 <Method void RtlSpacingHelper.setAbsolute(int, int)>
		if(i != 0x80000000 || j != 0x80000000)
	//* 168  325:iload_3         
	//* 169  326:ldc1            #195 <Int 0x80000000>
	//* 170  328:icmpne          338
	//* 171  331:iload           4
	//* 172  333:ldc1            #195 <Int 0x80000000>
	//* 173  335:icmpeq          348
			mContentInsets.setRelative(i, j);
	//  174  338:aload_0         
	//  175  339:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//  176  342:iload_3         
	//  177  343:iload           4
	//  178  345:invokevirtual   #218 <Method void RtlSpacingHelper.setRelative(int, int)>
		mContentInsetStartWithNavigation = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetStartWithNavigation, 0x80000000);
	//  179  348:aload_0         
	//  180  349:aload_1         
	//  181  350:getstatic       #221 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetStartWithNavigation>
	//  182  353:ldc1            #195 <Int 0x80000000>
	//  183  355:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  184  358:putfield        #223 <Field int mContentInsetStartWithNavigation>
		mContentInsetEndWithActions = ((TintTypedArray) (context)).getDimensionPixelOffset(android.support.v7.appcompat.R.styleable.Toolbar_contentInsetEndWithActions, 0x80000000);
	//  185  361:aload_0         
	//  186  362:aload_1         
	//  187  363:getstatic       #226 <Field int android.support.v7.appcompat.R$styleable.Toolbar_contentInsetEndWithActions>
	//  188  366:ldc1            #195 <Int 0x80000000>
	//  189  368:invokevirtual   #156 <Method int TintTypedArray.getDimensionPixelOffset(int, int)>
	//  190  371:putfield        #228 <Field int mContentInsetEndWithActions>
		mCollapseIcon = ((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_collapseIcon);
	//  191  374:aload_0         
	//  192  375:aload_1         
	//  193  376:getstatic       #231 <Field int android.support.v7.appcompat.R$styleable.Toolbar_collapseIcon>
	//  194  379:invokevirtual   #235 <Method Drawable TintTypedArray.getDrawable(int)>
	//  195  382:putfield        #237 <Field Drawable mCollapseIcon>
		mCollapseDescription = ((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_collapseContentDescription);
	//  196  385:aload_0         
	//  197  386:aload_1         
	//  198  387:getstatic       #240 <Field int android.support.v7.appcompat.R$styleable.Toolbar_collapseContentDescription>
	//  199  390:invokevirtual   #244 <Method CharSequence TintTypedArray.getText(int)>
	//  200  393:putfield        #246 <Field CharSequence mCollapseDescription>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_title)));
	//  201  396:aload_1         
	//  202  397:getstatic       #249 <Field int android.support.v7.appcompat.R$styleable.Toolbar_title>
	//  203  400:invokevirtual   #244 <Method CharSequence TintTypedArray.getText(int)>
	//  204  403:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 205  404:aload_2         
	//* 206  405:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 207  408:ifne            416
			setTitle(((CharSequence) (attributeset)));
	//  208  411:aload_0         
	//  209  412:aload_2         
	//  210  413:invokevirtual   #259 <Method void setTitle(CharSequence)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_subtitle)));
	//  211  416:aload_1         
	//  212  417:getstatic       #262 <Field int android.support.v7.appcompat.R$styleable.Toolbar_subtitle>
	//  213  420:invokevirtual   #244 <Method CharSequence TintTypedArray.getText(int)>
	//  214  423:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 215  424:aload_2         
	//* 216  425:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 217  428:ifne            436
			setSubtitle(((CharSequence) (attributeset)));
	//  218  431:aload_0         
	//  219  432:aload_2         
	//  220  433:invokevirtual   #265 <Method void setSubtitle(CharSequence)>
		mPopupContext = getContext();
	//  221  436:aload_0         
	//  222  437:aload_0         
	//  223  438:invokevirtual   #115 <Method Context getContext()>
	//  224  441:putfield        #267 <Field Context mPopupContext>
		setPopupTheme(((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.Toolbar_popupTheme, 0));
	//  225  444:aload_0         
	//  226  445:aload_1         
	//  227  446:getstatic       #270 <Field int android.support.v7.appcompat.R$styleable.Toolbar_popupTheme>
	//  228  449:iconst_0        
	//  229  450:invokevirtual   #132 <Method int TintTypedArray.getResourceId(int, int)>
	//  230  453:invokevirtual   #274 <Method void setPopupTheme(int)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_navigationIcon)));
	//  231  456:aload_1         
	//  232  457:getstatic       #277 <Field int android.support.v7.appcompat.R$styleable.Toolbar_navigationIcon>
	//  233  460:invokevirtual   #235 <Method Drawable TintTypedArray.getDrawable(int)>
	//  234  463:astore_2        
		if(attributeset != null)
	//* 235  464:aload_2         
	//* 236  465:ifnull          473
			setNavigationIcon(((Drawable) (attributeset)));
	//  237  468:aload_0         
	//  238  469:aload_2         
	//  239  470:invokevirtual   #281 <Method void setNavigationIcon(Drawable)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_navigationContentDescription)));
	//  240  473:aload_1         
	//  241  474:getstatic       #284 <Field int android.support.v7.appcompat.R$styleable.Toolbar_navigationContentDescription>
	//  242  477:invokevirtual   #244 <Method CharSequence TintTypedArray.getText(int)>
	//  243  480:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 244  481:aload_2         
	//* 245  482:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 246  485:ifne            493
			setNavigationContentDescription(((CharSequence) (attributeset)));
	//  247  488:aload_0         
	//  248  489:aload_2         
	//  249  490:invokevirtual   #287 <Method void setNavigationContentDescription(CharSequence)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.Toolbar_logo)));
	//  250  493:aload_1         
	//  251  494:getstatic       #290 <Field int android.support.v7.appcompat.R$styleable.Toolbar_logo>
	//  252  497:invokevirtual   #235 <Method Drawable TintTypedArray.getDrawable(int)>
	//  253  500:astore_2        
		if(attributeset != null)
	//* 254  501:aload_2         
	//* 255  502:ifnull          510
			setLogo(((Drawable) (attributeset)));
	//  256  505:aload_0         
	//  257  506:aload_2         
	//  258  507:invokevirtual   #293 <Method void setLogo(Drawable)>
		attributeset = ((AttributeSet) (((TintTypedArray) (context)).getText(android.support.v7.appcompat.R.styleable.Toolbar_logoDescription)));
	//  259  510:aload_1         
	//  260  511:getstatic       #296 <Field int android.support.v7.appcompat.R$styleable.Toolbar_logoDescription>
	//  261  514:invokevirtual   #244 <Method CharSequence TintTypedArray.getText(int)>
	//  262  517:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (attributeset))))
	//* 263  518:aload_2         
	//* 264  519:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 265  522:ifne            530
			setLogoDescription(((CharSequence) (attributeset)));
	//  266  525:aload_0         
	//  267  526:aload_2         
	//  268  527:invokevirtual   #299 <Method void setLogoDescription(CharSequence)>
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.Toolbar_titleTextColor))
	//* 269  530:aload_1         
	//* 270  531:getstatic       #302 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleTextColor>
	//* 271  534:invokevirtual   #163 <Method boolean TintTypedArray.hasValue(int)>
	//* 272  537:ifeq            552
			setTitleTextColor(((TintTypedArray) (context)).getColor(android.support.v7.appcompat.R.styleable.Toolbar_titleTextColor, -1));
	//  273  540:aload_0         
	//  274  541:aload_1         
	//  275  542:getstatic       #302 <Field int android.support.v7.appcompat.R$styleable.Toolbar_titleTextColor>
	//  276  545:iconst_m1       
	//  277  546:invokevirtual   #305 <Method int TintTypedArray.getColor(int, int)>
	//  278  549:invokevirtual   #308 <Method void setTitleTextColor(int)>
		if(((TintTypedArray) (context)).hasValue(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextColor))
	//* 279  552:aload_1         
	//* 280  553:getstatic       #311 <Field int android.support.v7.appcompat.R$styleable.Toolbar_subtitleTextColor>
	//* 281  556:invokevirtual   #163 <Method boolean TintTypedArray.hasValue(int)>
	//* 282  559:ifeq            574
			setSubtitleTextColor(((TintTypedArray) (context)).getColor(android.support.v7.appcompat.R.styleable.Toolbar_subtitleTextColor, -1));
	//  283  562:aload_0         
	//  284  563:aload_1         
	//  285  564:getstatic       #311 <Field int android.support.v7.appcompat.R$styleable.Toolbar_subtitleTextColor>
	//  286  567:iconst_m1       
	//  287  568:invokevirtual   #305 <Method int TintTypedArray.getColor(int, int)>
	//  288  571:invokevirtual   #314 <Method void setSubtitleTextColor(int)>
		((TintTypedArray) (context)).recycle();
	//  289  574:aload_1         
	//  290  575:invokevirtual   #317 <Method void TintTypedArray.recycle()>
	//  291  578:return          
	}

	private void addCustomViewsWithGravity(List list, int i)
	{
		int j = ac.f(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #325 <Method int ac.f(View)>
	//    2    4:istore_3        
		boolean flag1 = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		boolean flag;
		if(j == 1)
	//*   5    8:iload_3         
	//*   6    9:iconst_1        
	//*   7   10:icmpne          18
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore_3        
		else
	//*  10   15:goto            20
			flag = false;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		int i1 = getChildCount();
	//   13   20:aload_0         
	//   14   21:invokevirtual   #329 <Method int getChildCount()>
	//   15   24:istore          6
		int k = l.a(i, ac.f(((View) (this))));
	//   16   26:iload_2         
	//   17   27:aload_0         
	//   18   28:invokestatic    #325 <Method int ac.f(View)>
	//   19   31:invokestatic    #334 <Method int l.a(int, int)>
	//   20   34:istore          5
		list.clear();
	//   21   36:aload_1         
	//   22   37:invokeinterface #339 <Method void List.clear()>
		i = ((int) (flag1));
	//   23   42:iload           4
	//   24   44:istore_2        
		if(flag)
	//*  25   45:iload_3         
	//*  26   46:ifeq            122
			for(i = i1 - 1; i >= 0; i--)
	//*  27   49:iload           6
	//*  28   51:iconst_1        
	//*  29   52:isub            
	//*  30   53:istore_2        
	//*  31   54:iload_2         
	//*  32   55:iflt            192
			{
				View view = getChildAt(i);
	//   33   58:aload_0         
	//   34   59:iload_2         
	//   35   60:invokevirtual   #343 <Method View getChildAt(int)>
	//   36   63:astore          7
				LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//   37   65:aload           7
	//   38   67:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   39   70:checkcast       #351 <Class Toolbar$LayoutParams>
	//   40   73:astore          8
				if(layoutparams.mViewType == 0 && shouldLayout(view) && getChildHorizontalGravity(layoutparams.gravity) == k)
	//*  41   75:aload           8
	//*  42   77:getfield        #354 <Field int Toolbar$LayoutParams.mViewType>
	//*  43   80:ifne            115
	//*  44   83:aload_0         
	//*  45   84:aload           7
	//*  46   86:invokespecial   #358 <Method boolean shouldLayout(View)>
	//*  47   89:ifeq            115
	//*  48   92:aload_0         
	//*  49   93:aload           8
	//*  50   95:getfield        #361 <Field int Toolbar$LayoutParams.gravity>
	//*  51   98:invokespecial   #365 <Method int getChildHorizontalGravity(int)>
	//*  52  101:iload           5
	//*  53  103:icmpne          115
					list.add(((Object) (view)));
	//   54  106:aload_1         
	//   55  107:aload           7
	//   56  109:invokeinterface #369 <Method boolean List.add(Object)>
	//   57  114:pop             
			}

	//   58  115:iload_2         
	//   59  116:iconst_1        
	//   60  117:isub            
	//   61  118:istore_2        
		else
	//*  62  119:goto            54
			for(; i < i1; i++)
	//*  63  122:iload_2         
	//*  64  123:iload           6
	//*  65  125:icmpge          192
			{
				View view1 = getChildAt(i);
	//   66  128:aload_0         
	//   67  129:iload_2         
	//   68  130:invokevirtual   #343 <Method View getChildAt(int)>
	//   69  133:astore          7
				LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
	//   70  135:aload           7
	//   71  137:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   72  140:checkcast       #351 <Class Toolbar$LayoutParams>
	//   73  143:astore          8
				if(layoutparams1.mViewType == 0 && shouldLayout(view1) && getChildHorizontalGravity(layoutparams1.gravity) == k)
	//*  74  145:aload           8
	//*  75  147:getfield        #354 <Field int Toolbar$LayoutParams.mViewType>
	//*  76  150:ifne            185
	//*  77  153:aload_0         
	//*  78  154:aload           7
	//*  79  156:invokespecial   #358 <Method boolean shouldLayout(View)>
	//*  80  159:ifeq            185
	//*  81  162:aload_0         
	//*  82  163:aload           8
	//*  83  165:getfield        #361 <Field int Toolbar$LayoutParams.gravity>
	//*  84  168:invokespecial   #365 <Method int getChildHorizontalGravity(int)>
	//*  85  171:iload           5
	//*  86  173:icmpne          185
					list.add(((Object) (view1)));
	//   87  176:aload_1         
	//   88  177:aload           7
	//   89  179:invokeinterface #369 <Method boolean List.add(Object)>
	//   90  184:pop             
			}

	//   91  185:iload_2         
	//   92  186:iconst_1        
	//   93  187:iadd            
	//   94  188:istore_2        
	//*  95  189:goto            122
	//   96  192:return          
	}

	private void addSystemView(View view, boolean flag)
	{
		Object obj = ((Object) (view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       17
			obj = ((Object) (generateDefaultLayoutParams()));
	//    5    9:aload_0         
	//    6   10:invokevirtual   #375 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//    7   13:astore_3        
		else
	//*   8   14:goto            39
		if(!checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
	//*   9   17:aload_0         
	//*  10   18:aload_3         
	//*  11   19:invokevirtual   #379 <Method boolean checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//*  12   22:ifne            34
			obj = ((Object) (generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)))));
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:invokevirtual   #383 <Method Toolbar$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//   16   30:astore_3        
		else
	//*  17   31:goto            39
			obj = ((Object) ((LayoutParams)obj));
	//   18   34:aload_3         
	//   19   35:checkcast       #351 <Class Toolbar$LayoutParams>
	//   20   38:astore_3        
		obj.mViewType = 1;
	//   21   39:aload_3         
	//   22   40:iconst_1        
	//   23   41:putfield        #354 <Field int Toolbar$LayoutParams.mViewType>
		if(flag && mExpandedActionView != null)
	//*  24   44:iload_2         
	//*  25   45:ifeq            70
	//*  26   48:aload_0         
	//*  27   49:getfield        #385 <Field View mExpandedActionView>
	//*  28   52:ifnull          70
		{
			view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
	//   29   55:aload_1         
	//   30   56:aload_3         
	//   31   57:invokevirtual   #389 <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			mHiddenViews.add(((Object) (view)));
	//   32   60:aload_0         
	//   33   61:getfield        #97  <Field ArrayList mHiddenViews>
	//   34   64:aload_1         
	//   35   65:invokevirtual   #390 <Method boolean ArrayList.add(Object)>
	//   36   68:pop             
			return;
	//   37   69:return          
		} else
		{
			addView(view, ((android.view.ViewGroup.LayoutParams) (obj)));
	//   38   70:aload_0         
	//   39   71:aload_1         
	//   40   72:aload_3         
	//   41   73:invokevirtual   #394 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
			return;
	//   42   76:return          
		}
	}

	private void ensureContentInsets()
	{
		if(mContentInsets == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//*   2    4:ifnonnull       18
			mContentInsets = new RtlSpacingHelper();
	//    3    7:aload_0         
	//    4    8:new             #211 <Class RtlSpacingHelper>
	//    5   11:dup             
	//    6   12:invokespecial   #395 <Method void RtlSpacingHelper()>
	//    7   15:putfield        #209 <Field RtlSpacingHelper mContentInsets>
	//    8   18:return          
	}

	private void ensureLogoView()
	{
		if(mLogoView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #398 <Field ImageView mLogoView>
	//*   2    4:ifnonnull       22
			mLogoView = ((ImageView) (new AppCompatImageView(getContext())));
	//    3    7:aload_0         
	//    4    8:new             #400 <Class AppCompatImageView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #115 <Method Context getContext()>
	//    8   16:invokespecial   #402 <Method void AppCompatImageView(Context)>
	//    9   19:putfield        #398 <Field ImageView mLogoView>
	//   10   22:return          
	}

	private void ensureMenu()
	{
		ensureMenuView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #406 <Method void ensureMenuView()>
		if(mMenuView.peekMenu() == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #408 <Field ActionMenuView mMenuView>
	//*   4    8:invokevirtual   #414 <Method MenuBuilder ActionMenuView.peekMenu()>
	//*   5   11:ifnonnull       64
		{
			MenuBuilder menubuilder = (MenuBuilder)mMenuView.getMenu();
	//    6   14:aload_0         
	//    7   15:getfield        #408 <Field ActionMenuView mMenuView>
	//    8   18:invokevirtual   #418 <Method Menu ActionMenuView.getMenu()>
	//    9   21:checkcast       #420 <Class MenuBuilder>
	//   10   24:astore_1        
			if(mExpandedMenuPresenter == null)
	//*  11   25:aload_0         
	//*  12   26:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  13   29:ifnonnull       44
				mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
	//   14   32:aload_0         
	//   15   33:new             #424 <Class Toolbar$ExpandedActionViewMenuPresenter>
	//   16   36:dup             
	//   17   37:aload_0         
	//   18   38:invokespecial   #425 <Method void Toolbar$ExpandedActionViewMenuPresenter(Toolbar)>
	//   19   41:putfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
			mMenuView.setExpandedActionViewsExclusive(true);
	//   20   44:aload_0         
	//   21   45:getfield        #408 <Field ActionMenuView mMenuView>
	//   22   48:iconst_1        
	//   23   49:invokevirtual   #429 <Method void ActionMenuView.setExpandedActionViewsExclusive(boolean)>
			menubuilder.a(((MenuPresenter) (mExpandedMenuPresenter)), mPopupContext);
	//   24   52:aload_1         
	//   25   53:aload_0         
	//   26   54:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   27   57:aload_0         
	//   28   58:getfield        #267 <Field Context mPopupContext>
	//   29   61:invokevirtual   #432 <Method void MenuBuilder.a(MenuPresenter, Context)>
		}
	//   30   64:return          
	}

	private void ensureMenuView()
	{
		if(mMenuView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #408 <Field ActionMenuView mMenuView>
	//*   2    4:ifnonnull       96
		{
			mMenuView = new ActionMenuView(getContext());
	//    3    7:aload_0         
	//    4    8:new             #410 <Class ActionMenuView>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #115 <Method Context getContext()>
	//    8   16:invokespecial   #433 <Method void ActionMenuView(Context)>
	//    9   19:putfield        #408 <Field ActionMenuView mMenuView>
			mMenuView.setPopupTheme(mPopupTheme);
	//   10   22:aload_0         
	//   11   23:getfield        #408 <Field ActionMenuView mMenuView>
	//   12   26:aload_0         
	//   13   27:getfield        #435 <Field int mPopupTheme>
	//   14   30:invokevirtual   #436 <Method void ActionMenuView.setPopupTheme(int)>
			mMenuView.setOnMenuItemClickListener(mMenuViewItemClickListener);
	//   15   33:aload_0         
	//   16   34:getfield        #408 <Field ActionMenuView mMenuView>
	//   17   37:aload_0         
	//   18   38:getfield        #106 <Field ActionMenuView$OnMenuItemClickListener mMenuViewItemClickListener>
	//   19   41:invokevirtual   #440 <Method void ActionMenuView.setOnMenuItemClickListener(ActionMenuView$OnMenuItemClickListener)>
			mMenuView.setMenuCallbacks(mActionMenuPresenterCallback, mMenuBuilderCallback);
	//   20   44:aload_0         
	//   21   45:getfield        #408 <Field ActionMenuView mMenuView>
	//   22   48:aload_0         
	//   23   49:getfield        #442 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
	//   24   52:aload_0         
	//   25   53:getfield        #444 <Field android.support.v7.view.menu.MenuBuilder$Callback mMenuBuilderCallback>
	//   26   56:invokevirtual   #448 <Method void ActionMenuView.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
			LayoutParams layoutparams = generateDefaultLayoutParams();
	//   27   59:aload_0         
	//   28   60:invokevirtual   #375 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//   29   63:astore_1        
			layoutparams.gravity = 0x800005 | mButtonGravity & 0x70;
	//   30   64:aload_1         
	//   31   65:ldc2            #449 <Int 0x800005>
	//   32   68:aload_0         
	//   33   69:getfield        #150 <Field int mButtonGravity>
	//   34   72:bipush          112
	//   35   74:iand            
	//   36   75:ior             
	//   37   76:putfield        #361 <Field int Toolbar$LayoutParams.gravity>
			mMenuView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   38   79:aload_0         
	//   39   80:getfield        #408 <Field ActionMenuView mMenuView>
	//   40   83:aload_1         
	//   41   84:invokevirtual   #450 <Method void ActionMenuView.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			addSystemView(((View) (mMenuView)), false);
	//   42   87:aload_0         
	//   43   88:aload_0         
	//   44   89:getfield        #408 <Field ActionMenuView mMenuView>
	//   45   92:iconst_0        
	//   46   93:invokespecial   #452 <Method void addSystemView(View, boolean)>
		}
	//   47   96:return          
	}

	private void ensureNavButtonView()
	{
		if(mNavButtonView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #455 <Field ImageButton mNavButtonView>
	//*   2    4:ifnonnull       54
		{
			mNavButtonView = ((ImageButton) (new AppCompatImageButton(getContext(), ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.toolbarNavigationButtonStyle)));
	//    3    7:aload_0         
	//    4    8:new             #457 <Class AppCompatImageButton>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #115 <Method Context getContext()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #460 <Field int android.support.v7.appcompat.R$attr.toolbarNavigationButtonStyle>
	//   10   20:invokespecial   #461 <Method void AppCompatImageButton(Context, AttributeSet, int)>
	//   11   23:putfield        #455 <Field ImageButton mNavButtonView>
			LayoutParams layoutparams = generateDefaultLayoutParams();
	//   12   26:aload_0         
	//   13   27:invokevirtual   #375 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//   14   30:astore_1        
			layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
	//   15   31:aload_1         
	//   16   32:ldc2            #462 <Int 0x800003>
	//   17   35:aload_0         
	//   18   36:getfield        #150 <Field int mButtonGravity>
	//   19   39:bipush          112
	//   20   41:iand            
	//   21   42:ior             
	//   22   43:putfield        #361 <Field int Toolbar$LayoutParams.gravity>
			mNavButtonView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   23   46:aload_0         
	//   24   47:getfield        #455 <Field ImageButton mNavButtonView>
	//   25   50:aload_1         
	//   26   51:invokevirtual   #465 <Method void ImageButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
		}
	//   27   54:return          
	}

	private int getChildHorizontalGravity(int i)
	{
		int j = ac.f(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #325 <Method int ac.f(View)>
	//    2    4:istore_2        
		int k = l.a(i, j) & 7;
	//    3    5:iload_1         
	//    4    6:iload_2         
	//    5    7:invokestatic    #334 <Method int l.a(int, int)>
	//    6   10:bipush          7
	//    7   12:iand            
	//    8   13:istore_3        
		if(k != 1)
	//*   9   14:iload_3         
	//*  10   15:iconst_1        
	//*  11   16:icmpeq          40
		{
			i = 3;
	//   12   19:iconst_3        
	//   13   20:istore_1        
			if(k != 3 && k != 5)
	//*  14   21:iload_3         
	//*  15   22:iconst_3        
	//*  16   23:icmpeq          40
	//*  17   26:iload_3         
	//*  18   27:iconst_5        
	//*  19   28:icmpeq          40
			{
				if(j == 1)
	//*  20   31:iload_2         
	//*  21   32:iconst_1        
	//*  22   33:icmpne          38
					i = 5;
	//   23   36:iconst_5        
	//   24   37:istore_1        
				return i;
	//   25   38:iload_1         
	//   26   39:ireturn         
			}
		}
		return k;
	//   27   40:iload_3         
	//   28   41:ireturn         
	}

	private int getChildTop(View view, int i)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #351 <Class Toolbar$LayoutParams>
	//    3    7:astore          7
		int i1 = view.getMeasuredHeight();
	//    4    9:aload_1         
	//    5   10:invokevirtual   #470 <Method int View.getMeasuredHeight()>
	//    6   13:istore          4
		if(i > 0)
	//*   7   15:iload_2         
	//*   8   16:ifle            29
			i = (i1 - i) / 2;
	//    9   19:iload           4
	//   10   21:iload_2         
	//   11   22:isub            
	//   12   23:iconst_2        
	//   13   24:idiv            
	//   14   25:istore_2        
		else
	//*  15   26:goto            31
			i = 0;
	//   16   29:iconst_0        
	//   17   30:istore_2        
		int j = getChildVerticalGravity(layoutparams.gravity);
	//   18   31:aload_0         
	//   19   32:aload           7
	//   20   34:getfield        #361 <Field int Toolbar$LayoutParams.gravity>
	//   21   37:invokespecial   #473 <Method int getChildVerticalGravity(int)>
	//   22   40:istore_3        
		if(j != 48)
	//*  23   41:iload_3         
	//*  24   42:bipush          48
	//*  25   44:icmpeq          168
		{
			if(j != 80)
	//*  26   47:iload_3         
	//*  27   48:bipush          80
	//*  28   50:icmpeq          147
			{
				int j1 = getPaddingTop();
	//   29   53:aload_0         
	//   30   54:invokevirtual   #476 <Method int getPaddingTop()>
	//   31   57:istore          5
				i = getPaddingBottom();
	//   32   59:aload_0         
	//   33   60:invokevirtual   #479 <Method int getPaddingBottom()>
	//   34   63:istore_2        
				int k1 = getHeight();
	//   35   64:aload_0         
	//   36   65:invokevirtual   #482 <Method int getHeight()>
	//   37   68:istore          6
				int k = (k1 - j1 - i - i1) / 2;
	//   38   70:iload           6
	//   39   72:iload           5
	//   40   74:isub            
	//   41   75:iload_2         
	//   42   76:isub            
	//   43   77:iload           4
	//   44   79:isub            
	//   45   80:iconst_2        
	//   46   81:idiv            
	//   47   82:istore_3        
				if(k < layoutparams.topMargin)
	//*  48   83:iload_3         
	//*  49   84:aload           7
	//*  50   86:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//*  51   89:icmpge          101
				{
					i = layoutparams.topMargin;
	//   52   92:aload           7
	//   53   94:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//   54   97:istore_2        
				} else
	//*  55   98:goto            142
				{
					i1 = k1 - i - i1 - k - j1;
	//   56  101:iload           6
	//   57  103:iload_2         
	//   58  104:isub            
	//   59  105:iload           4
	//   60  107:isub            
	//   61  108:iload_3         
	//   62  109:isub            
	//   63  110:iload           5
	//   64  112:isub            
	//   65  113:istore          4
					i = k;
	//   66  115:iload_3         
	//   67  116:istore_2        
					if(i1 < layoutparams.bottomMargin)
	//*  68  117:iload           4
	//*  69  119:aload           7
	//*  70  121:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//*  71  124:icmpge          142
						i = Math.max(0, k - (layoutparams.bottomMargin - i1));
	//   72  127:iconst_0        
	//   73  128:iload_3         
	//   74  129:aload           7
	//   75  131:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//   76  134:iload           4
	//   77  136:isub            
	//   78  137:isub            
	//   79  138:invokestatic    #493 <Method int Math.max(int, int)>
	//   80  141:istore_2        
				}
				return j1 + i;
	//   81  142:iload           5
	//   82  144:iload_2         
	//   83  145:iadd            
	//   84  146:ireturn         
			} else
			{
				return getHeight() - getPaddingBottom() - i1 - layoutparams.bottomMargin - i;
	//   85  147:aload_0         
	//   86  148:invokevirtual   #482 <Method int getHeight()>
	//   87  151:aload_0         
	//   88  152:invokevirtual   #479 <Method int getPaddingBottom()>
	//   89  155:isub            
	//   90  156:iload           4
	//   91  158:isub            
	//   92  159:aload           7
	//   93  161:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//   94  164:isub            
	//   95  165:iload_2         
	//   96  166:isub            
	//   97  167:ireturn         
			}
		} else
		{
			return getPaddingTop() - i;
	//   98  168:aload_0         
	//   99  169:invokevirtual   #476 <Method int getPaddingTop()>
	//  100  172:iload_2         
	//  101  173:isub            
	//  102  174:ireturn         
		}
	}

	private int getChildVerticalGravity(int i)
	{
		i &= 0x70;
	//    0    0:iload_1         
	//    1    1:bipush          112
	//    2    3:iand            
	//    3    4:istore_1        
		if(i != 16 && i != 48 && i != 80)
	//*   4    5:iload_1         
	//*   5    6:bipush          16
	//*   6    8:icmpeq          31
	//*   7   11:iload_1         
	//*   8   12:bipush          48
	//*   9   14:icmpeq          31
	//*  10   17:iload_1         
	//*  11   18:bipush          80
	//*  12   20:icmpeq          31
			return mGravity & 0x70;
	//   13   23:aload_0         
	//   14   24:getfield        #88  <Field int mGravity>
	//   15   27:bipush          112
	//   16   29:iand            
	//   17   30:ireturn         
		else
			return i;
	//   18   31:iload_1         
	//   19   32:ireturn         
	}

	private int getHorizontalMargins(View view)
	{
		view = ((View) ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #496 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore_1        
		return p.a(((android.view.ViewGroup.MarginLayoutParams) (view))) + p.b(((android.view.ViewGroup.MarginLayoutParams) (view)));
	//    4    8:aload_1         
	//    5    9:invokestatic    #501 <Method int p.a(android.view.ViewGroup$MarginLayoutParams)>
	//    6   12:aload_1         
	//    7   13:invokestatic    #504 <Method int p.b(android.view.ViewGroup$MarginLayoutParams)>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	private MenuInflater getMenuInflater()
	{
		return ((MenuInflater) (new SupportMenuInflater(getContext())));
	//    0    0:new             #508 <Class SupportMenuInflater>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method Context getContext()>
	//    4    8:invokespecial   #509 <Method void SupportMenuInflater(Context)>
	//    5   11:areturn         
	}

	private int getVerticalMargins(View view)
	{
		view = ((View) ((android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #496 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore_1        
		return ((android.view.ViewGroup.MarginLayoutParams) (view)).topMargin + ((android.view.ViewGroup.MarginLayoutParams) (view)).bottomMargin;
	//    4    8:aload_1         
	//    5    9:getfield        #511 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//    6   12:aload_1         
	//    7   13:getfield        #512 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//    8   16:iadd            
	//    9   17:ireturn         
	}

	private int getViewListMeasuredWidth(List list, int ai[])
	{
		int i1 = ai[0];
	//    0    0:aload_2         
	//    1    1:iconst_0        
	//    2    2:iaload          
	//    3    3:istore          6
		int k = ai[1];
	//    4    5:aload_2         
	//    5    6:iconst_1        
	//    6    7:iaload          
	//    7    8:istore          5
		int j1 = list.size();
	//    8   10:aload_1         
	//    9   11:invokeinterface #517 <Method int List.size()>
	//   10   16:istore          7
		int i = 0;
	//   11   18:iconst_0        
	//   12   19:istore_3        
		int j = 0;
	//   13   20:iconst_0        
	//   14   21:istore          4
		for(; i < j1; i++)
	//*  15   23:iload_3         
	//*  16   24:iload           7
	//*  17   26:icmpge          125
		{
			ai = ((int []) ((View)list.get(i)));
	//   18   29:aload_1         
	//   19   30:iload_3         
	//   20   31:invokeinterface #521 <Method Object List.get(int)>
	//   21   36:checkcast       #345 <Class View>
	//   22   39:astore_2        
			LayoutParams layoutparams = (LayoutParams)((View) (ai)).getLayoutParams();
	//   23   40:aload_2         
	//   24   41:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   25   44:checkcast       #351 <Class Toolbar$LayoutParams>
	//   26   47:astore          10
			i1 = layoutparams.leftMargin - i1;
	//   27   49:aload           10
	//   28   51:getfield        #524 <Field int Toolbar$LayoutParams.leftMargin>
	//   29   54:iload           6
	//   30   56:isub            
	//   31   57:istore          6
			k = layoutparams.rightMargin - k;
	//   32   59:aload           10
	//   33   61:getfield        #527 <Field int Toolbar$LayoutParams.rightMargin>
	//   34   64:iload           5
	//   35   66:isub            
	//   36   67:istore          5
			int k1 = Math.max(0, i1);
	//   37   69:iconst_0        
	//   38   70:iload           6
	//   39   72:invokestatic    #493 <Method int Math.max(int, int)>
	//   40   75:istore          8
			int l1 = Math.max(0, k);
	//   41   77:iconst_0        
	//   42   78:iload           5
	//   43   80:invokestatic    #493 <Method int Math.max(int, int)>
	//   44   83:istore          9
			i1 = Math.max(0, -i1);
	//   45   85:iconst_0        
	//   46   86:iload           6
	//   47   88:ineg            
	//   48   89:invokestatic    #493 <Method int Math.max(int, int)>
	//   49   92:istore          6
			k = Math.max(0, -k);
	//   50   94:iconst_0        
	//   51   95:iload           5
	//   52   97:ineg            
	//   53   98:invokestatic    #493 <Method int Math.max(int, int)>
	//   54  101:istore          5
			j += k1 + ((View) (ai)).getMeasuredWidth() + l1;
	//   55  103:iload           4
	//   56  105:iload           8
	//   57  107:aload_2         
	//   58  108:invokevirtual   #530 <Method int View.getMeasuredWidth()>
	//   59  111:iadd            
	//   60  112:iload           9
	//   61  114:iadd            
	//   62  115:iadd            
	//   63  116:istore          4
		}

	//   64  118:iload_3         
	//   65  119:iconst_1        
	//   66  120:iadd            
	//   67  121:istore_3        
	//*  68  122:goto            23
		return j;
	//   69  125:iload           4
	//   70  127:ireturn         
	}

	private boolean isChildOrHidden(View view)
	{
		return view.getParent() == this || mHiddenViews.contains(((Object) (view)));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #535 <Method android.view.ViewParent View.getParent()>
	//    2    4:aload_0         
	//    3    5:if_acmpeq       24
	//    4    8:aload_0         
	//    5    9:getfield        #97  <Field ArrayList mHiddenViews>
	//    6   12:aload_1         
	//    7   13:invokevirtual   #538 <Method boolean ArrayList.contains(Object)>
	//    8   16:ifeq            22
	//    9   19:goto            24
	//   10   22:iconst_0        
	//   11   23:ireturn         
	//   12   24:iconst_1        
	//   13   25:ireturn         
	}

	private static boolean isCustomView(View view)
	{
		return ((LayoutParams)view.getLayoutParams()).mViewType == 0;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #351 <Class Toolbar$LayoutParams>
	//    3    7:getfield        #354 <Field int Toolbar$LayoutParams.mViewType>
	//    4   10:ifne            15
	//    5   13:iconst_1        
	//    6   14:ireturn         
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private int layoutChildLeft(View view, int i, int ai[], int j)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #351 <Class Toolbar$LayoutParams>
	//    3    7:astore          6
		int k = layoutparams.leftMargin - ai[0];
	//    4    9:aload           6
	//    5   11:getfield        #524 <Field int Toolbar$LayoutParams.leftMargin>
	//    6   14:aload_3         
	//    7   15:iconst_0        
	//    8   16:iaload          
	//    9   17:isub            
	//   10   18:istore          5
		i += Math.max(0, k);
	//   11   20:iload_2         
	//   12   21:iconst_0        
	//   13   22:iload           5
	//   14   24:invokestatic    #493 <Method int Math.max(int, int)>
	//   15   27:iadd            
	//   16   28:istore_2        
		ai[0] = Math.max(0, -k);
	//   17   29:aload_3         
	//   18   30:iconst_0        
	//   19   31:iconst_0        
	//   20   32:iload           5
	//   21   34:ineg            
	//   22   35:invokestatic    #493 <Method int Math.max(int, int)>
	//   23   38:iastore         
		j = getChildTop(view, j);
	//   24   39:aload_0         
	//   25   40:aload_1         
	//   26   41:iload           4
	//   27   43:invokespecial   #543 <Method int getChildTop(View, int)>
	//   28   46:istore          4
		k = view.getMeasuredWidth();
	//   29   48:aload_1         
	//   30   49:invokevirtual   #530 <Method int View.getMeasuredWidth()>
	//   31   52:istore          5
		view.layout(i, j, i + k, view.getMeasuredHeight() + j);
	//   32   54:aload_1         
	//   33   55:iload_2         
	//   34   56:iload           4
	//   35   58:iload_2         
	//   36   59:iload           5
	//   37   61:iadd            
	//   38   62:aload_1         
	//   39   63:invokevirtual   #470 <Method int View.getMeasuredHeight()>
	//   40   66:iload           4
	//   41   68:iadd            
	//   42   69:invokevirtual   #547 <Method void View.layout(int, int, int, int)>
		return i + (k + layoutparams.rightMargin);
	//   43   72:iload_2         
	//   44   73:iload           5
	//   45   75:aload           6
	//   46   77:getfield        #527 <Field int Toolbar$LayoutParams.rightMargin>
	//   47   80:iadd            
	//   48   81:iadd            
	//   49   82:ireturn         
	}

	private int layoutChildRight(View view, int i, int ai[], int j)
	{
		LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #351 <Class Toolbar$LayoutParams>
	//    3    7:astore          6
		int k = layoutparams.rightMargin - ai[1];
	//    4    9:aload           6
	//    5   11:getfield        #527 <Field int Toolbar$LayoutParams.rightMargin>
	//    6   14:aload_3         
	//    7   15:iconst_1        
	//    8   16:iaload          
	//    9   17:isub            
	//   10   18:istore          5
		i -= Math.max(0, k);
	//   11   20:iload_2         
	//   12   21:iconst_0        
	//   13   22:iload           5
	//   14   24:invokestatic    #493 <Method int Math.max(int, int)>
	//   15   27:isub            
	//   16   28:istore_2        
		ai[1] = Math.max(0, -k);
	//   17   29:aload_3         
	//   18   30:iconst_1        
	//   19   31:iconst_0        
	//   20   32:iload           5
	//   21   34:ineg            
	//   22   35:invokestatic    #493 <Method int Math.max(int, int)>
	//   23   38:iastore         
		j = getChildTop(view, j);
	//   24   39:aload_0         
	//   25   40:aload_1         
	//   26   41:iload           4
	//   27   43:invokespecial   #543 <Method int getChildTop(View, int)>
	//   28   46:istore          4
		k = view.getMeasuredWidth();
	//   29   48:aload_1         
	//   30   49:invokevirtual   #530 <Method int View.getMeasuredWidth()>
	//   31   52:istore          5
		view.layout(i - k, j, i, view.getMeasuredHeight() + j);
	//   32   54:aload_1         
	//   33   55:iload_2         
	//   34   56:iload           5
	//   35   58:isub            
	//   36   59:iload           4
	//   37   61:iload_2         
	//   38   62:aload_1         
	//   39   63:invokevirtual   #470 <Method int View.getMeasuredHeight()>
	//   40   66:iload           4
	//   41   68:iadd            
	//   42   69:invokevirtual   #547 <Method void View.layout(int, int, int, int)>
		return i - (k + layoutparams.leftMargin);
	//   43   72:iload_2         
	//   44   73:iload           5
	//   45   75:aload           6
	//   46   77:getfield        #524 <Field int Toolbar$LayoutParams.leftMargin>
	//   47   80:iadd            
	//   48   81:isub            
	//   49   82:ireturn         
	}

	private int measureChildCollapseMargins(View view, int i, int j, int k, int i1, int ai[])
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #496 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          10
		int j1 = marginlayoutparams.leftMargin - ai[0];
	//    4    9:aload           10
	//    5   11:getfield        #551 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//    6   14:aload           6
	//    7   16:iconst_0        
	//    8   17:iaload          
	//    9   18:isub            
	//   10   19:istore          7
		int k1 = marginlayoutparams.rightMargin - ai[1];
	//   11   21:aload           10
	//   12   23:getfield        #552 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   13   26:aload           6
	//   14   28:iconst_1        
	//   15   29:iaload          
	//   16   30:isub            
	//   17   31:istore          8
		int l1 = Math.max(0, j1) + Math.max(0, k1);
	//   18   33:iconst_0        
	//   19   34:iload           7
	//   20   36:invokestatic    #493 <Method int Math.max(int, int)>
	//   21   39:iconst_0        
	//   22   40:iload           8
	//   23   42:invokestatic    #493 <Method int Math.max(int, int)>
	//   24   45:iadd            
	//   25   46:istore          9
		ai[0] = Math.max(0, -j1);
	//   26   48:aload           6
	//   27   50:iconst_0        
	//   28   51:iconst_0        
	//   29   52:iload           7
	//   30   54:ineg            
	//   31   55:invokestatic    #493 <Method int Math.max(int, int)>
	//   32   58:iastore         
		ai[1] = Math.max(0, -k1);
	//   33   59:aload           6
	//   34   61:iconst_1        
	//   35   62:iconst_0        
	//   36   63:iload           8
	//   37   65:ineg            
	//   38   66:invokestatic    #493 <Method int Math.max(int, int)>
	//   39   69:iastore         
		view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + l1 + j, marginlayoutparams.width), getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + i1, marginlayoutparams.height));
	//   40   70:aload_1         
	//   41   71:iload_2         
	//   42   72:aload_0         
	//   43   73:invokevirtual   #555 <Method int getPaddingLeft()>
	//   44   76:aload_0         
	//   45   77:invokevirtual   #558 <Method int getPaddingRight()>
	//   46   80:iadd            
	//   47   81:iload           9
	//   48   83:iadd            
	//   49   84:iload_3         
	//   50   85:iadd            
	//   51   86:aload           10
	//   52   88:getfield        #561 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   53   91:invokestatic    #565 <Method int getChildMeasureSpec(int, int, int)>
	//   54   94:iload           4
	//   55   96:aload_0         
	//   56   97:invokevirtual   #476 <Method int getPaddingTop()>
	//   57  100:aload_0         
	//   58  101:invokevirtual   #479 <Method int getPaddingBottom()>
	//   59  104:iadd            
	//   60  105:aload           10
	//   61  107:getfield        #511 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   62  110:iadd            
	//   63  111:aload           10
	//   64  113:getfield        #512 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   65  116:iadd            
	//   66  117:iload           5
	//   67  119:iadd            
	//   68  120:aload           10
	//   69  122:getfield        #568 <Field int android.view.ViewGroup$MarginLayoutParams.height>
	//   70  125:invokestatic    #565 <Method int getChildMeasureSpec(int, int, int)>
	//   71  128:invokevirtual   #571 <Method void View.measure(int, int)>
		return view.getMeasuredWidth() + l1;
	//   72  131:aload_1         
	//   73  132:invokevirtual   #530 <Method int View.getMeasuredWidth()>
	//   74  135:iload           9
	//   75  137:iadd            
	//   76  138:ireturn         
	}

	private void measureChildConstrained(View view, int i, int j, int k, int i1, int j1)
	{
		android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)view.getLayoutParams();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//    2    4:checkcast       #496 <Class android.view.ViewGroup$MarginLayoutParams>
	//    3    7:astore          8
		int k1 = getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight() + marginlayoutparams.leftMargin + marginlayoutparams.rightMargin + j, marginlayoutparams.width);
	//    4    9:iload_2         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #555 <Method int getPaddingLeft()>
	//    7   14:aload_0         
	//    8   15:invokevirtual   #558 <Method int getPaddingRight()>
	//    9   18:iadd            
	//   10   19:aload           8
	//   11   21:getfield        #551 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   12   24:iadd            
	//   13   25:aload           8
	//   14   27:getfield        #552 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   15   30:iadd            
	//   16   31:iload_3         
	//   17   32:iadd            
	//   18   33:aload           8
	//   19   35:getfield        #561 <Field int android.view.ViewGroup$MarginLayoutParams.width>
	//   20   38:invokestatic    #565 <Method int getChildMeasureSpec(int, int, int)>
	//   21   41:istore          7
		j = getChildMeasureSpec(k, getPaddingTop() + getPaddingBottom() + marginlayoutparams.topMargin + marginlayoutparams.bottomMargin + i1, marginlayoutparams.height);
	//   22   43:iload           4
	//   23   45:aload_0         
	//   24   46:invokevirtual   #476 <Method int getPaddingTop()>
	//   25   49:aload_0         
	//   26   50:invokevirtual   #479 <Method int getPaddingBottom()>
	//   27   53:iadd            
	//   28   54:aload           8
	//   29   56:getfield        #511 <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
	//   30   59:iadd            
	//   31   60:aload           8
	//   32   62:getfield        #512 <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
	//   33   65:iadd            
	//   34   66:iload           5
	//   35   68:iadd            
	//   36   69:aload           8
	//   37   71:getfield        #568 <Field int android.view.ViewGroup$MarginLayoutParams.height>
	//   38   74:invokestatic    #565 <Method int getChildMeasureSpec(int, int, int)>
	//   39   77:istore_3        
		k = android.view.View.MeasureSpec.getMode(j);
	//   40   78:iload_3         
	//   41   79:invokestatic    #578 <Method int android.view.View$MeasureSpec.getMode(int)>
	//   42   82:istore          4
		i = j;
	//   43   84:iload_3         
	//   44   85:istore_2        
		if(k != 0x40000000)
	//*  45   86:iload           4
	//*  46   88:ldc2            #579 <Int 0x40000000>
	//*  47   91:icmpeq          127
		{
			i = j;
	//   48   94:iload_3         
	//   49   95:istore_2        
			if(j1 >= 0)
	//*  50   96:iload           6
	//*  51   98:iflt            127
			{
				i = j1;
	//   52  101:iload           6
	//   53  103:istore_2        
				if(k != 0)
	//*  54  104:iload           4
	//*  55  106:ifeq            119
					i = Math.min(android.view.View.MeasureSpec.getSize(j), j1);
	//   56  109:iload_3         
	//   57  110:invokestatic    #582 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   58  113:iload           6
	//   59  115:invokestatic    #585 <Method int Math.min(int, int)>
	//   60  118:istore_2        
				i = android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
	//   61  119:iload_2         
	//   62  120:ldc2            #579 <Int 0x40000000>
	//   63  123:invokestatic    #588 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   64  126:istore_2        
			}
		}
		view.measure(k1, i);
	//   65  127:aload_1         
	//   66  128:iload           7
	//   67  130:iload_2         
	//   68  131:invokevirtual   #571 <Method void View.measure(int, int)>
	//   69  134:return          
	}

	private void postShowOverflowMenu()
	{
		removeCallbacks(mShowOverflowMenuRunnable);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #111 <Field Runnable mShowOverflowMenuRunnable>
	//    3    5:invokevirtual   #593 <Method boolean removeCallbacks(Runnable)>
	//    4    8:pop             
		post(mShowOverflowMenuRunnable);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:getfield        #111 <Field Runnable mShowOverflowMenuRunnable>
	//    8   14:invokevirtual   #596 <Method boolean post(Runnable)>
	//    9   17:pop             
	//   10   18:return          
	}

	private boolean shouldCollapse()
	{
		if(!mCollapsible)
	//*   0    0:aload_0         
	//*   1    1:getfield        #600 <Field boolean mCollapsible>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int j = getChildCount();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #329 <Method int getChildCount()>
	//    7   13:istore_2        
		for(int i = 0; i < j; i++)
	//*   8   14:iconst_0        
	//*   9   15:istore_1        
	//*  10   16:iload_1         
	//*  11   17:iload_2         
	//*  12   18:icmpge          58
		{
			View view = getChildAt(i);
	//   13   21:aload_0         
	//   14   22:iload_1         
	//   15   23:invokevirtual   #343 <Method View getChildAt(int)>
	//   16   26:astore_3        
			if(shouldLayout(view) && view.getMeasuredWidth() > 0 && view.getMeasuredHeight() > 0)
	//*  17   27:aload_0         
	//*  18   28:aload_3         
	//*  19   29:invokespecial   #358 <Method boolean shouldLayout(View)>
	//*  20   32:ifeq            51
	//*  21   35:aload_3         
	//*  22   36:invokevirtual   #530 <Method int View.getMeasuredWidth()>
	//*  23   39:ifle            51
	//*  24   42:aload_3         
	//*  25   43:invokevirtual   #470 <Method int View.getMeasuredHeight()>
	//*  26   46:ifle            51
				return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
		}

	//   29   51:iload_1         
	//   30   52:iconst_1        
	//   31   53:iadd            
	//   32   54:istore_1        
	//*  33   55:goto            16
		return true;
	//   34   58:iconst_1        
	//   35   59:ireturn         
	}

	private boolean shouldLayout(View view)
	{
		return view != null && view.getParent() == this && view.getVisibility() != 8;
	//    0    0:aload_1         
	//    1    1:ifnull          23
	//    2    4:aload_1         
	//    3    5:invokevirtual   #535 <Method android.view.ViewParent View.getParent()>
	//    4    8:aload_0         
	//    5    9:if_acmpne       23
	//    6   12:aload_1         
	//    7   13:invokevirtual   #603 <Method int View.getVisibility()>
	//    8   16:bipush          8
	//    9   18:icmpeq          23
	//   10   21:iconst_1        
	//   11   22:ireturn         
	//   12   23:iconst_0        
	//   13   24:ireturn         
	}

	void addChildrenForExpandedActionView()
	{
		for(int i = mHiddenViews.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field ArrayList mHiddenViews>
	//*   2    4:invokevirtual   #605 <Method int ArrayList.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            36
			addView((View)mHiddenViews.get(i));
	//    8   14:aload_0         
	//    9   15:aload_0         
	//   10   16:getfield        #97  <Field ArrayList mHiddenViews>
	//   11   19:iload_1         
	//   12   20:invokevirtual   #606 <Method Object ArrayList.get(int)>
	//   13   23:checkcast       #345 <Class View>
	//   14   26:invokevirtual   #609 <Method void addView(View)>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:istore_1        
	//*  19   33:goto            10
		mHiddenViews.clear();
	//   20   36:aload_0         
	//   21   37:getfield        #97  <Field ArrayList mHiddenViews>
	//   22   40:invokevirtual   #610 <Method void ArrayList.clear()>
	//   23   43:return          
	}

	public boolean canShowOverflowMenu()
	{
		if(getVisibility() == 0)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #612 <Method int getVisibility()>
	//*   2    4:ifne            25
		{
			ActionMenuView actionmenuview = mMenuView;
	//    3    7:aload_0         
	//    4    8:getfield        #408 <Field ActionMenuView mMenuView>
	//    5   11:astore_1        
			if(actionmenuview != null && actionmenuview.isOverflowReserved())
	//*   6   12:aload_1         
	//*   7   13:ifnull          25
	//*   8   16:aload_1         
	//*   9   17:invokevirtual   #615 <Method boolean ActionMenuView.isOverflowReserved()>
	//*  10   20:ifeq            25
				return true;
	//   11   23:iconst_1        
	//   12   24:ireturn         
		}
		return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
	}

	protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return super.checkLayoutParams(layoutparams) && (layoutparams instanceof LayoutParams);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #616 <Method boolean ViewGroup.checkLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:ifeq            17
	//    4    8:aload_1         
	//    5    9:instanceof      #351 <Class Toolbar$LayoutParams>
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	public void collapseActionView()
	{
		Object obj = ((Object) (mExpandedMenuPresenter));
	//    0    0:aload_0         
	//    1    1:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//    2    4:astore_1        
		if(obj == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       14
			obj = null;
	//    5    9:aconst_null     
	//    6   10:astore_1        
		else
	//*   7   11:goto            19
			obj = ((Object) (((ExpandedActionViewMenuPresenter) (obj)).mCurrentExpandedItem));
	//    8   14:aload_1         
	//    9   15:getfield        #621 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//   10   18:astore_1        
		if(obj != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          28
			((MenuItemImpl) (obj)).collapseActionView();
	//   13   23:aload_1         
	//   14   24:invokevirtual   #625 <Method boolean MenuItemImpl.collapseActionView()>
	//   15   27:pop             
	//   16   28:return          
	}

	public void dismissPopupMenus()
	{
		ActionMenuView actionmenuview = mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field ActionMenuView mMenuView>
	//    2    4:astore_1        
		if(actionmenuview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          13
			actionmenuview.dismissPopupMenus();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #628 <Method void ActionMenuView.dismissPopupMenus()>
	//    7   13:return          
	}

	void ensureCollapseButtonView()
	{
		if(mCollapseButtonView == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #631 <Field ImageButton mCollapseButtonView>
	//*   2    4:ifnonnull       96
		{
			mCollapseButtonView = ((ImageButton) (new AppCompatImageButton(getContext(), ((AttributeSet) (null)), android.support.v7.appcompat.R.attr.toolbarNavigationButtonStyle)));
	//    3    7:aload_0         
	//    4    8:new             #457 <Class AppCompatImageButton>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #115 <Method Context getContext()>
	//    8   16:aconst_null     
	//    9   17:getstatic       #460 <Field int android.support.v7.appcompat.R$attr.toolbarNavigationButtonStyle>
	//   10   20:invokespecial   #461 <Method void AppCompatImageButton(Context, AttributeSet, int)>
	//   11   23:putfield        #631 <Field ImageButton mCollapseButtonView>
			mCollapseButtonView.setImageDrawable(mCollapseIcon);
	//   12   26:aload_0         
	//   13   27:getfield        #631 <Field ImageButton mCollapseButtonView>
	//   14   30:aload_0         
	//   15   31:getfield        #237 <Field Drawable mCollapseIcon>
	//   16   34:invokevirtual   #634 <Method void ImageButton.setImageDrawable(Drawable)>
			mCollapseButtonView.setContentDescription(mCollapseDescription);
	//   17   37:aload_0         
	//   18   38:getfield        #631 <Field ImageButton mCollapseButtonView>
	//   19   41:aload_0         
	//   20   42:getfield        #246 <Field CharSequence mCollapseDescription>
	//   21   45:invokevirtual   #637 <Method void ImageButton.setContentDescription(CharSequence)>
			LayoutParams layoutparams = generateDefaultLayoutParams();
	//   22   48:aload_0         
	//   23   49:invokevirtual   #375 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//   24   52:astore_1        
			layoutparams.gravity = 0x800003 | mButtonGravity & 0x70;
	//   25   53:aload_1         
	//   26   54:ldc2            #462 <Int 0x800003>
	//   27   57:aload_0         
	//   28   58:getfield        #150 <Field int mButtonGravity>
	//   29   61:bipush          112
	//   30   63:iand            
	//   31   64:ior             
	//   32   65:putfield        #361 <Field int Toolbar$LayoutParams.gravity>
			layoutparams.mViewType = 2;
	//   33   68:aload_1         
	//   34   69:iconst_2        
	//   35   70:putfield        #354 <Field int Toolbar$LayoutParams.mViewType>
			mCollapseButtonView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (layoutparams)));
	//   36   73:aload_0         
	//   37   74:getfield        #631 <Field ImageButton mCollapseButtonView>
	//   38   77:aload_1         
	//   39   78:invokevirtual   #465 <Method void ImageButton.setLayoutParams(android.view.ViewGroup$LayoutParams)>
			mCollapseButtonView.setOnClickListener(((android.view.View.OnClickListener) (new _cls3())));
	//   40   81:aload_0         
	//   41   82:getfield        #631 <Field ImageButton mCollapseButtonView>
	//   42   85:new             #639 <Class Toolbar$3>
	//   43   88:dup             
	//   44   89:aload_0         
	//   45   90:invokespecial   #640 <Method void Toolbar$3(Toolbar)>
	//   46   93:invokevirtual   #644 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
		}
	//   47   96:return          
	}

	protected LayoutParams generateDefaultLayoutParams()
	{
		return new LayoutParams(-2, -2);
	//    0    0:new             #351 <Class Toolbar$LayoutParams>
	//    1    3:dup             
	//    2    4:bipush          -2
	//    3    6:bipush          -2
	//    4    8:invokespecial   #646 <Method void Toolbar$LayoutParams(int, int)>
	//    5   11:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (generateDefaultLayoutParams()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #375 <Method Toolbar$LayoutParams generateDefaultLayoutParams()>
	//    2    4:areturn         
	}

	public LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return new LayoutParams(getContext(), attributeset);
	//    0    0:new             #351 <Class Toolbar$LayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #648 <Method void Toolbar$LayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	protected LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		if(layoutparams instanceof LayoutParams)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #351 <Class Toolbar$LayoutParams>
	//*   2    4:ifeq            19
			return new LayoutParams((LayoutParams)layoutparams);
	//    3    7:new             #351 <Class Toolbar$LayoutParams>
	//    4   10:dup             
	//    5   11:aload_1         
	//    6   12:checkcast       #351 <Class Toolbar$LayoutParams>
	//    7   15:invokespecial   #651 <Method void Toolbar$LayoutParams(Toolbar$LayoutParams)>
	//    8   18:areturn         
		if(layoutparams instanceof android.support.v7.app.ActionBar.LayoutParams)
	//*   9   19:aload_1         
	//*  10   20:instanceof      #653 <Class android.support.v7.app.ActionBar$LayoutParams>
	//*  11   23:ifeq            38
			return new LayoutParams((android.support.v7.app.ActionBar.LayoutParams)layoutparams);
	//   12   26:new             #351 <Class Toolbar$LayoutParams>
	//   13   29:dup             
	//   14   30:aload_1         
	//   15   31:checkcast       #653 <Class android.support.v7.app.ActionBar$LayoutParams>
	//   16   34:invokespecial   #656 <Method void Toolbar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
	//   17   37:areturn         
		if(layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
	//*  18   38:aload_1         
	//*  19   39:instanceof      #496 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  20   42:ifeq            57
			return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
	//   21   45:new             #351 <Class Toolbar$LayoutParams>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:checkcast       #496 <Class android.view.ViewGroup$MarginLayoutParams>
	//   25   53:invokespecial   #659 <Method void Toolbar$LayoutParams(android.view.ViewGroup$MarginLayoutParams)>
	//   26   56:areturn         
		else
			return new LayoutParams(layoutparams);
	//   27   57:new             #351 <Class Toolbar$LayoutParams>
	//   28   60:dup             
	//   29   61:aload_1         
	//   30   62:invokespecial   #661 <Method void Toolbar$LayoutParams(android.view.ViewGroup$LayoutParams)>
	//   31   65:areturn         
	}

	public volatile android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(attributeset)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #664 <Method Toolbar$LayoutParams generateLayoutParams(AttributeSet)>
	//    3    5:areturn         
	}

	protected volatile android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
	{
		return ((android.view.ViewGroup.LayoutParams) (generateLayoutParams(layoutparams)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #383 <Method Toolbar$LayoutParams generateLayoutParams(android.view.ViewGroup$LayoutParams)>
	//    3    5:areturn         
	}

	public int getContentInsetEnd()
	{
		RtlSpacingHelper rtlspacinghelper = mContentInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//    2    4:astore_1        
		if(rtlspacinghelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return rtlspacinghelper.getEnd();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #669 <Method int RtlSpacingHelper.getEnd()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getContentInsetEndWithActions()
	{
		int i = mContentInsetEndWithActions;
	//    0    0:aload_0         
	//    1    1:getfield        #228 <Field int mContentInsetEndWithActions>
	//    2    4:istore_1        
		if(i != 0x80000000)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #195 <Int 0x80000000>
	//*   5    8:icmpeq          13
			return i;
	//    6   11:iload_1         
	//    7   12:ireturn         
		else
			return getContentInsetEnd();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #672 <Method int getContentInsetEnd()>
	//   10   17:ireturn         
	}

	public int getContentInsetLeft()
	{
		RtlSpacingHelper rtlspacinghelper = mContentInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//    2    4:astore_1        
		if(rtlspacinghelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return rtlspacinghelper.getLeft();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #676 <Method int RtlSpacingHelper.getLeft()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getContentInsetRight()
	{
		RtlSpacingHelper rtlspacinghelper = mContentInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//    2    4:astore_1        
		if(rtlspacinghelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return rtlspacinghelper.getRight();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #680 <Method int RtlSpacingHelper.getRight()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getContentInsetStart()
	{
		RtlSpacingHelper rtlspacinghelper = mContentInsets;
	//    0    0:aload_0         
	//    1    1:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//    2    4:astore_1        
		if(rtlspacinghelper != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return rtlspacinghelper.getStart();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #684 <Method int RtlSpacingHelper.getStart()>
	//    7   13:ireturn         
		else
			return 0;
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public int getContentInsetStartWithNavigation()
	{
		int i = mContentInsetStartWithNavigation;
	//    0    0:aload_0         
	//    1    1:getfield        #223 <Field int mContentInsetStartWithNavigation>
	//    2    4:istore_1        
		if(i != 0x80000000)
	//*   3    5:iload_1         
	//*   4    6:ldc1            #195 <Int 0x80000000>
	//*   5    8:icmpeq          13
			return i;
	//    6   11:iload_1         
	//    7   12:ireturn         
		else
			return getContentInsetStart();
	//    8   13:aload_0         
	//    9   14:invokevirtual   #687 <Method int getContentInsetStart()>
	//   10   17:ireturn         
	}

	public int getCurrentContentInsetEnd()
	{
		Object obj = ((Object) (mMenuView));
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field ActionMenuView mMenuView>
	//    2    4:astore_2        
		boolean flag;
		if(obj != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          35
		{
			obj = ((Object) (((ActionMenuView) (obj)).peekMenu()));
	//    5    9:aload_2         
	//    6   10:invokevirtual   #414 <Method MenuBuilder ActionMenuView.peekMenu()>
	//    7   13:astore_2        
			if(obj != null && ((MenuBuilder) (obj)).hasVisibleItems())
	//*   8   14:aload_2         
	//*   9   15:ifnull          30
	//*  10   18:aload_2         
	//*  11   19:invokevirtual   #691 <Method boolean MenuBuilder.hasVisibleItems()>
	//*  12   22:ifeq            30
				flag = true;
	//   13   25:iconst_1        
	//   14   26:istore_1        
			else
	//*  15   27:goto            37
				flag = false;
	//   16   30:iconst_0        
	//   17   31:istore_1        
		} else
	//*  18   32:goto            37
		{
			flag = false;
	//   19   35:iconst_0        
	//   20   36:istore_1        
		}
		if(flag)
	//*  21   37:iload_1         
	//*  22   38:ifeq            57
			return Math.max(getContentInsetEnd(), Math.max(mContentInsetEndWithActions, 0));
	//   23   41:aload_0         
	//   24   42:invokevirtual   #672 <Method int getContentInsetEnd()>
	//   25   45:aload_0         
	//   26   46:getfield        #228 <Field int mContentInsetEndWithActions>
	//   27   49:iconst_0        
	//   28   50:invokestatic    #493 <Method int Math.max(int, int)>
	//   29   53:invokestatic    #493 <Method int Math.max(int, int)>
	//   30   56:ireturn         
		else
			return getContentInsetEnd();
	//   31   57:aload_0         
	//   32   58:invokevirtual   #672 <Method int getContentInsetEnd()>
	//   33   61:ireturn         
	}

	public int getCurrentContentInsetLeft()
	{
		if(ac.f(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #325 <Method int ac.f(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return getCurrentContentInsetEnd();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #694 <Method int getCurrentContentInsetEnd()>
	//    6   12:ireturn         
		else
			return getCurrentContentInsetStart();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #697 <Method int getCurrentContentInsetStart()>
	//    9   17:ireturn         
	}

	public int getCurrentContentInsetRight()
	{
		if(ac.f(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #325 <Method int ac.f(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          13
			return getCurrentContentInsetStart();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #697 <Method int getCurrentContentInsetStart()>
	//    6   12:ireturn         
		else
			return getCurrentContentInsetEnd();
	//    7   13:aload_0         
	//    8   14:invokevirtual   #694 <Method int getCurrentContentInsetEnd()>
	//    9   17:ireturn         
	}

	public int getCurrentContentInsetStart()
	{
		if(getNavigationIcon() != null)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #702 <Method Drawable getNavigationIcon()>
	//*   2    4:ifnull          23
			return Math.max(getContentInsetStart(), Math.max(mContentInsetStartWithNavigation, 0));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #687 <Method int getContentInsetStart()>
	//    5   11:aload_0         
	//    6   12:getfield        #223 <Field int mContentInsetStartWithNavigation>
	//    7   15:iconst_0        
	//    8   16:invokestatic    #493 <Method int Math.max(int, int)>
	//    9   19:invokestatic    #493 <Method int Math.max(int, int)>
	//   10   22:ireturn         
		else
			return getContentInsetStart();
	//   11   23:aload_0         
	//   12   24:invokevirtual   #687 <Method int getContentInsetStart()>
	//   13   27:ireturn         
	}

	public Drawable getLogo()
	{
		ImageView imageview = mLogoView;
	//    0    0:aload_0         
	//    1    1:getfield        #398 <Field ImageView mLogoView>
	//    2    4:astore_1        
		if(imageview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return imageview.getDrawable();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #707 <Method Drawable ImageView.getDrawable()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public CharSequence getLogoDescription()
	{
		ImageView imageview = mLogoView;
	//    0    0:aload_0         
	//    1    1:getfield        #398 <Field ImageView mLogoView>
	//    2    4:astore_1        
		if(imageview != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return imageview.getContentDescription();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #712 <Method CharSequence ImageView.getContentDescription()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public Menu getMenu()
	{
		ensureMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #714 <Method void ensureMenu()>
		return mMenuView.getMenu();
	//    2    4:aload_0         
	//    3    5:getfield        #408 <Field ActionMenuView mMenuView>
	//    4    8:invokevirtual   #418 <Method Menu ActionMenuView.getMenu()>
	//    5   11:areturn         
	}

	public CharSequence getNavigationContentDescription()
	{
		ImageButton imagebutton = mNavButtonView;
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field ImageButton mNavButtonView>
	//    2    4:astore_1        
		if(imagebutton != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return imagebutton.getContentDescription();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #716 <Method CharSequence ImageButton.getContentDescription()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	public Drawable getNavigationIcon()
	{
		ImageButton imagebutton = mNavButtonView;
	//    0    0:aload_0         
	//    1    1:getfield        #455 <Field ImageButton mNavButtonView>
	//    2    4:astore_1        
		if(imagebutton != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          14
			return imagebutton.getDrawable();
	//    5    9:aload_1         
	//    6   10:invokevirtual   #717 <Method Drawable ImageButton.getDrawable()>
	//    7   13:areturn         
		else
			return null;
	//    8   14:aconst_null     
	//    9   15:areturn         
	}

	ActionMenuPresenter getOuterActionMenuPresenter()
	{
		return mOuterActionMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #721 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//    2    4:areturn         
	}

	public Drawable getOverflowIcon()
	{
		ensureMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #714 <Method void ensureMenu()>
		return mMenuView.getOverflowIcon();
	//    2    4:aload_0         
	//    3    5:getfield        #408 <Field ActionMenuView mMenuView>
	//    4    8:invokevirtual   #724 <Method Drawable ActionMenuView.getOverflowIcon()>
	//    5   11:areturn         
	}

	Context getPopupContext()
	{
		return mPopupContext;
	//    0    0:aload_0         
	//    1    1:getfield        #267 <Field Context mPopupContext>
	//    2    4:areturn         
	}

	public int getPopupTheme()
	{
		return mPopupTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #435 <Field int mPopupTheme>
	//    2    4:ireturn         
	}

	public CharSequence getSubtitle()
	{
		return mSubtitleText;
	//    0    0:aload_0         
	//    1    1:getfield        #729 <Field CharSequence mSubtitleText>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitleText;
	//    0    0:aload_0         
	//    1    1:getfield        #732 <Field CharSequence mTitleText>
	//    2    4:areturn         
	}

	public int getTitleMarginBottom()
	{
		return mTitleMarginBottom;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field int mTitleMarginBottom>
	//    2    4:ireturn         
	}

	public int getTitleMarginEnd()
	{
		return mTitleMarginEnd;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field int mTitleMarginEnd>
	//    2    4:ireturn         
	}

	public int getTitleMarginStart()
	{
		return mTitleMarginStart;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field int mTitleMarginStart>
	//    2    4:ireturn         
	}

	public int getTitleMarginTop()
	{
		return mTitleMarginTop;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field int mTitleMarginTop>
	//    2    4:ireturn         
	}

	public DecorToolbar getWrapper()
	{
		if(mWrapper == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #740 <Field ToolbarWidgetWrapper mWrapper>
	//*   2    4:ifnonnull       20
			mWrapper = new ToolbarWidgetWrapper(this, true);
	//    3    7:aload_0         
	//    4    8:new             #742 <Class ToolbarWidgetWrapper>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:iconst_1        
	//    8   14:invokespecial   #745 <Method void ToolbarWidgetWrapper(Toolbar, boolean)>
	//    9   17:putfield        #740 <Field ToolbarWidgetWrapper mWrapper>
		return ((DecorToolbar) (mWrapper));
	//   10   20:aload_0         
	//   11   21:getfield        #740 <Field ToolbarWidgetWrapper mWrapper>
	//   12   24:areturn         
	}

	public boolean hasExpandedActionView()
	{
		ExpandedActionViewMenuPresenter expandedactionviewmenupresenter = mExpandedMenuPresenter;
	//    0    0:aload_0         
	//    1    1:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//    2    4:astore_1        
		return expandedactionviewmenupresenter != null && expandedactionviewmenupresenter.mCurrentExpandedItem != null;
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:getfield        #621 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//    7   13:ifnull          18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean hideOverflowMenu()
	{
		ActionMenuView actionmenuview = mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field ActionMenuView mMenuView>
	//    2    4:astore_1        
		return actionmenuview != null && actionmenuview.hideOverflowMenu();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #749 <Method boolean ActionMenuView.hideOverflowMenu()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public void inflateMenu(int i)
	{
		getMenuInflater().inflate(i, getMenu());
	//    0    0:aload_0         
	//    1    1:invokespecial   #752 <Method MenuInflater getMenuInflater()>
	//    2    4:iload_1         
	//    3    5:aload_0         
	//    4    6:invokevirtual   #753 <Method Menu getMenu()>
	//    5    9:invokevirtual   #759 <Method void MenuInflater.inflate(int, Menu)>
	//    6   12:return          
	}

	public boolean isOverflowMenuShowPending()
	{
		ActionMenuView actionmenuview = mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field ActionMenuView mMenuView>
	//    2    4:astore_1        
		return actionmenuview != null && actionmenuview.isOverflowMenuShowPending();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #762 <Method boolean ActionMenuView.isOverflowMenuShowPending()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		ActionMenuView actionmenuview = mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field ActionMenuView mMenuView>
	//    2    4:astore_1        
		return actionmenuview != null && actionmenuview.isOverflowMenuShowing();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #765 <Method boolean ActionMenuView.isOverflowMenuShowing()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	public boolean isTitleTruncated()
	{
		Object obj = ((Object) (mTitleTextView));
	//    0    0:aload_0         
	//    1    1:getfield        #768 <Field TextView mTitleTextView>
	//    2    4:astore_3        
		if(obj == null)
	//*   3    5:aload_3         
	//*   4    6:ifnonnull       11
			return false;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		obj = ((Object) (((TextView) (obj)).getLayout()));
	//    7   11:aload_3         
	//    8   12:invokevirtual   #774 <Method Layout TextView.getLayout()>
	//    9   15:astore_3        
		if(obj == null)
	//*  10   16:aload_3         
	//*  11   17:ifnonnull       22
			return false;
	//   12   20:iconst_0        
	//   13   21:ireturn         
		int j = ((Layout) (obj)).getLineCount();
	//   14   22:aload_3         
	//   15   23:invokevirtual   #779 <Method int Layout.getLineCount()>
	//   16   26:istore_2        
		for(int i = 0; i < j; i++)
	//*  17   27:iconst_0        
	//*  18   28:istore_1        
	//*  19   29:iload_1         
	//*  20   30:iload_2         
	//*  21   31:icmpge          51
			if(((Layout) (obj)).getEllipsisCount(i) > 0)
	//*  22   34:aload_3         
	//*  23   35:iload_1         
	//*  24   36:invokevirtual   #782 <Method int Layout.getEllipsisCount(int)>
	//*  25   39:ifle            44
				return true;
	//   26   42:iconst_1        
	//   27   43:ireturn         

	//   28   44:iload_1         
	//   29   45:iconst_1        
	//   30   46:iadd            
	//   31   47:istore_1        
	//*  32   48:goto            29
		return false;
	//   33   51:iconst_0        
	//   34   52:ireturn         
	}

	protected void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #785 <Method void ViewGroup.onDetachedFromWindow()>
		removeCallbacks(mShowOverflowMenuRunnable);
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #111 <Field Runnable mShowOverflowMenuRunnable>
	//    5    9:invokevirtual   #593 <Method boolean removeCallbacks(Runnable)>
	//    6   12:pop             
	//    7   13:return          
	}

	public boolean onHoverEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #792 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 9)
	//*   3    5:iload_2         
	//*   4    6:bipush          9
	//*   5    8:icmpne          16
			mEatingHover = false;
	//    6   11:aload_0         
	//    7   12:iconst_0        
	//    8   13:putfield        #794 <Field boolean mEatingHover>
		if(!mEatingHover)
	//*   9   16:aload_0         
	//*  10   17:getfield        #794 <Field boolean mEatingHover>
	//*  11   20:ifne            44
		{
			boolean flag = super.onHoverEvent(motionevent);
	//   12   23:aload_0         
	//   13   24:aload_1         
	//   14   25:invokespecial   #796 <Method boolean ViewGroup.onHoverEvent(MotionEvent)>
	//   15   28:istore_3        
			if(i == 9 && !flag)
	//*  16   29:iload_2         
	//*  17   30:bipush          9
	//*  18   32:icmpne          44
	//*  19   35:iload_3         
	//*  20   36:ifne            44
				mEatingHover = true;
	//   21   39:aload_0         
	//   22   40:iconst_1        
	//   23   41:putfield        #794 <Field boolean mEatingHover>
		}
		if(i == 10 || i == 3)
	//*  24   44:iload_2         
	//*  25   45:bipush          10
	//*  26   47:icmpeq          55
	//*  27   50:iload_2         
	//*  28   51:iconst_3        
	//*  29   52:icmpne          60
			mEatingHover = false;
	//   30   55:aload_0         
	//   31   56:iconst_0        
	//   32   57:putfield        #794 <Field boolean mEatingHover>
		return true;
	//   33   60:iconst_1        
	//   34   61:ireturn         
	}

	protected void onLayout(boolean flag, int i, int j, int k, int i1)
	{
		boolean flag2;
		if(ac.f(((View) (this))) == 1)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #325 <Method int ac.f(View)>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          14
			flag2 = true;
	//    4    8:iconst_1        
	//    5    9:istore          8
		else
	//*   6   11:goto            17
			flag2 = false;
	//    7   14:iconst_0        
	//    8   15:istore          8
		int i3 = getWidth();
	//    9   17:aload_0         
	//   10   18:invokevirtual   #801 <Method int getWidth()>
	//   11   21:istore          10
		int j4 = getHeight();
	//   12   23:aload_0         
	//   13   24:invokevirtual   #482 <Method int getHeight()>
	//   14   27:istore          13
		k = getPaddingLeft();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #555 <Method int getPaddingLeft()>
	//   17   33:istore          4
		int j3 = getPaddingRight();
	//   18   35:aload_0         
	//   19   36:invokevirtual   #558 <Method int getPaddingRight()>
	//   20   39:istore          11
		int k3 = getPaddingTop();
	//   21   41:aload_0         
	//   22   42:invokevirtual   #476 <Method int getPaddingTop()>
	//   23   45:istore          12
		int k4 = getPaddingBottom();
	//   24   47:aload_0         
	//   25   48:invokevirtual   #479 <Method int getPaddingBottom()>
	//   26   51:istore          14
		int k2 = i3 - j3;
	//   27   53:iload           10
	//   28   55:iload           11
	//   29   57:isub            
	//   30   58:istore          9
		int ai[] = mTempMargins;
	//   31   60:aload_0         
	//   32   61:getfield        #99  <Field int[] mTempMargins>
	//   33   64:astore          18
		ai[1] = 0;
	//   34   66:aload           18
	//   35   68:iconst_1        
	//   36   69:iconst_0        
	//   37   70:iastore         
		ai[0] = 0;
	//   38   71:aload           18
	//   39   73:iconst_0        
	//   40   74:iconst_0        
	//   41   75:iastore         
		i = ac.k(((View) (this)));
	//   42   76:aload_0         
	//   43   77:invokestatic    #804 <Method int ac.k(View)>
	//   44   80:istore_2        
		if(i >= 0)
	//*  45   81:iload_2         
	//*  46   82:iflt            98
			i1 = Math.min(i, i1 - j);
	//   47   85:iload_2         
	//   48   86:iload           5
	//   49   88:iload_3         
	//   50   89:isub            
	//   51   90:invokestatic    #585 <Method int Math.min(int, int)>
	//   52   93:istore          5
		else
	//*  53   95:goto            101
			i1 = 0;
	//   54   98:iconst_0        
	//   55   99:istore          5
		if(shouldLayout(((View) (mNavButtonView))))
	//*  56  101:aload_0         
	//*  57  102:aload_0         
	//*  58  103:getfield        #455 <Field ImageButton mNavButtonView>
	//*  59  106:invokespecial   #358 <Method boolean shouldLayout(View)>
	//*  60  109:ifeq            159
		{
			if(flag2)
	//*  61  112:iload           8
	//*  62  114:ifeq            138
			{
				j = layoutChildRight(((View) (mNavButtonView)), k2, ai, i1);
	//   63  117:aload_0         
	//   64  118:aload_0         
	//   65  119:getfield        #455 <Field ImageButton mNavButtonView>
	//   66  122:iload           9
	//   67  124:aload           18
	//   68  126:iload           5
	//   69  128:invokespecial   #806 <Method int layoutChildRight(View, int, int[], int)>
	//   70  131:istore_3        
				i = k;
	//   71  132:iload           4
	//   72  134:istore_2        
			} else
	//*  73  135:goto            165
			{
				i = layoutChildLeft(((View) (mNavButtonView)), k, ai, i1);
	//   74  138:aload_0         
	//   75  139:aload_0         
	//   76  140:getfield        #455 <Field ImageButton mNavButtonView>
	//   77  143:iload           4
	//   78  145:aload           18
	//   79  147:iload           5
	//   80  149:invokespecial   #808 <Method int layoutChildLeft(View, int, int[], int)>
	//   81  152:istore_2        
				j = k2;
	//   82  153:iload           9
	//   83  155:istore_3        
			}
		} else
	//*  84  156:goto            165
		{
			i = k;
	//   85  159:iload           4
	//   86  161:istore_2        
			j = k2;
	//   87  162:iload           9
	//   88  164:istore_3        
		}
		int j1 = i;
	//   89  165:iload_2         
	//   90  166:istore          6
		int k1 = j;
	//   91  168:iload_3         
	//   92  169:istore          7
		if(shouldLayout(((View) (mCollapseButtonView))))
	//*  93  171:aload_0         
	//*  94  172:aload_0         
	//*  95  173:getfield        #631 <Field ImageButton mCollapseButtonView>
	//*  96  176:invokespecial   #358 <Method boolean shouldLayout(View)>
	//*  97  179:ifeq            226
			if(flag2)
	//*  98  182:iload           8
	//*  99  184:ifeq            208
			{
				k1 = layoutChildRight(((View) (mCollapseButtonView)), j, ai, i1);
	//  100  187:aload_0         
	//  101  188:aload_0         
	//  102  189:getfield        #631 <Field ImageButton mCollapseButtonView>
	//  103  192:iload_3         
	//  104  193:aload           18
	//  105  195:iload           5
	//  106  197:invokespecial   #806 <Method int layoutChildRight(View, int, int[], int)>
	//  107  200:istore          7
				j1 = i;
	//  108  202:iload_2         
	//  109  203:istore          6
			} else
	//* 110  205:goto            226
			{
				j1 = layoutChildLeft(((View) (mCollapseButtonView)), i, ai, i1);
	//  111  208:aload_0         
	//  112  209:aload_0         
	//  113  210:getfield        #631 <Field ImageButton mCollapseButtonView>
	//  114  213:iload_2         
	//  115  214:aload           18
	//  116  216:iload           5
	//  117  218:invokespecial   #808 <Method int layoutChildLeft(View, int, int[], int)>
	//  118  221:istore          6
				k1 = j;
	//  119  223:iload_3         
	//  120  224:istore          7
			}
		j = j1;
	//  121  226:iload           6
	//  122  228:istore_3        
		i = k1;
	//  123  229:iload           7
	//  124  231:istore_2        
		if(shouldLayout(((View) (mMenuView))))
	//* 125  232:aload_0         
	//* 126  233:aload_0         
	//* 127  234:getfield        #408 <Field ActionMenuView mMenuView>
	//* 128  237:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 129  240:ifeq            287
			if(flag2)
	//* 130  243:iload           8
	//* 131  245:ifeq            269
			{
				j = layoutChildLeft(((View) (mMenuView)), j1, ai, i1);
	//  132  248:aload_0         
	//  133  249:aload_0         
	//  134  250:getfield        #408 <Field ActionMenuView mMenuView>
	//  135  253:iload           6
	//  136  255:aload           18
	//  137  257:iload           5
	//  138  259:invokespecial   #808 <Method int layoutChildLeft(View, int, int[], int)>
	//  139  262:istore_3        
				i = k1;
	//  140  263:iload           7
	//  141  265:istore_2        
			} else
	//* 142  266:goto            287
			{
				i = layoutChildRight(((View) (mMenuView)), k1, ai, i1);
	//  143  269:aload_0         
	//  144  270:aload_0         
	//  145  271:getfield        #408 <Field ActionMenuView mMenuView>
	//  146  274:iload           7
	//  147  276:aload           18
	//  148  278:iload           5
	//  149  280:invokespecial   #806 <Method int layoutChildRight(View, int, int[], int)>
	//  150  283:istore_2        
				j = j1;
	//  151  284:iload           6
	//  152  286:istore_3        
			}
		k1 = getCurrentContentInsetLeft();
	//  153  287:aload_0         
	//  154  288:invokevirtual   #810 <Method int getCurrentContentInsetLeft()>
	//  155  291:istore          7
		j1 = getCurrentContentInsetRight();
	//  156  293:aload_0         
	//  157  294:invokevirtual   #812 <Method int getCurrentContentInsetRight()>
	//  158  297:istore          6
		ai[0] = Math.max(0, k1 - j);
	//  159  299:aload           18
	//  160  301:iconst_0        
	//  161  302:iconst_0        
	//  162  303:iload           7
	//  163  305:iload_3         
	//  164  306:isub            
	//  165  307:invokestatic    #493 <Method int Math.max(int, int)>
	//  166  310:iastore         
		ai[1] = Math.max(0, j1 - (k2 - i));
	//  167  311:aload           18
	//  168  313:iconst_1        
	//  169  314:iconst_0        
	//  170  315:iload           6
	//  171  317:iload           9
	//  172  319:iload_2         
	//  173  320:isub            
	//  174  321:isub            
	//  175  322:invokestatic    #493 <Method int Math.max(int, int)>
	//  176  325:iastore         
		j = Math.max(j, k1);
	//  177  326:iload_3         
	//  178  327:iload           7
	//  179  329:invokestatic    #493 <Method int Math.max(int, int)>
	//  180  332:istore_3        
		j1 = Math.min(i, k2 - j1);
	//  181  333:iload_2         
	//  182  334:iload           9
	//  183  336:iload           6
	//  184  338:isub            
	//  185  339:invokestatic    #585 <Method int Math.min(int, int)>
	//  186  342:istore          6
		i = j;
	//  187  344:iload_3         
	//  188  345:istore_2        
		k1 = j1;
	//  189  346:iload           6
	//  190  348:istore          7
		if(shouldLayout(mExpandedActionView))
	//* 191  350:aload_0         
	//* 192  351:aload_0         
	//* 193  352:getfield        #385 <Field View mExpandedActionView>
	//* 194  355:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 195  358:ifeq            405
			if(flag2)
	//* 196  361:iload           8
	//* 197  363:ifeq            387
			{
				k1 = layoutChildRight(mExpandedActionView, j1, ai, i1);
	//  198  366:aload_0         
	//  199  367:aload_0         
	//  200  368:getfield        #385 <Field View mExpandedActionView>
	//  201  371:iload           6
	//  202  373:aload           18
	//  203  375:iload           5
	//  204  377:invokespecial   #806 <Method int layoutChildRight(View, int, int[], int)>
	//  205  380:istore          7
				i = j;
	//  206  382:iload_3         
	//  207  383:istore_2        
			} else
	//* 208  384:goto            405
			{
				i = layoutChildLeft(mExpandedActionView, j, ai, i1);
	//  209  387:aload_0         
	//  210  388:aload_0         
	//  211  389:getfield        #385 <Field View mExpandedActionView>
	//  212  392:iload_3         
	//  213  393:aload           18
	//  214  395:iload           5
	//  215  397:invokespecial   #808 <Method int layoutChildLeft(View, int, int[], int)>
	//  216  400:istore_2        
				k1 = j1;
	//  217  401:iload           6
	//  218  403:istore          7
			}
		j = i;
	//  219  405:iload_2         
	//  220  406:istore_3        
		j1 = k1;
	//  221  407:iload           7
	//  222  409:istore          6
		if(shouldLayout(((View) (mLogoView))))
	//* 223  411:aload_0         
	//* 224  412:aload_0         
	//* 225  413:getfield        #398 <Field ImageView mLogoView>
	//* 226  416:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 227  419:ifeq            466
			if(flag2)
	//* 228  422:iload           8
	//* 229  424:ifeq            448
			{
				j1 = layoutChildRight(((View) (mLogoView)), k1, ai, i1);
	//  230  427:aload_0         
	//  231  428:aload_0         
	//  232  429:getfield        #398 <Field ImageView mLogoView>
	//  233  432:iload           7
	//  234  434:aload           18
	//  235  436:iload           5
	//  236  438:invokespecial   #806 <Method int layoutChildRight(View, int, int[], int)>
	//  237  441:istore          6
				j = i;
	//  238  443:iload_2         
	//  239  444:istore_3        
			} else
	//* 240  445:goto            466
			{
				j = layoutChildLeft(((View) (mLogoView)), i, ai, i1);
	//  241  448:aload_0         
	//  242  449:aload_0         
	//  243  450:getfield        #398 <Field ImageView mLogoView>
	//  244  453:iload_2         
	//  245  454:aload           18
	//  246  456:iload           5
	//  247  458:invokespecial   #808 <Method int layoutChildLeft(View, int, int[], int)>
	//  248  461:istore_3        
				j1 = k1;
	//  249  462:iload           7
	//  250  464:istore          6
			}
		flag = shouldLayout(((View) (mTitleTextView)));
	//  251  466:aload_0         
	//  252  467:aload_0         
	//  253  468:getfield        #768 <Field TextView mTitleTextView>
	//  254  471:invokespecial   #358 <Method boolean shouldLayout(View)>
	//  255  474:istore_1        
		boolean flag3 = shouldLayout(((View) (mSubtitleTextView)));
	//  256  475:aload_0         
	//  257  476:aload_0         
	//  258  477:getfield        #814 <Field TextView mSubtitleTextView>
	//  259  480:invokespecial   #358 <Method boolean shouldLayout(View)>
	//  260  483:istore          15
		if(flag)
	//* 261  485:iload_1         
	//* 262  486:ifeq            526
		{
			LayoutParams layoutparams = (LayoutParams)mTitleTextView.getLayoutParams();
	//  263  489:aload_0         
	//  264  490:getfield        #768 <Field TextView mTitleTextView>
	//  265  493:invokevirtual   #815 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  266  496:checkcast       #351 <Class Toolbar$LayoutParams>
	//  267  499:astore          16
			i = layoutparams.topMargin + mTitleTextView.getMeasuredHeight() + layoutparams.bottomMargin + 0;
	//  268  501:aload           16
	//  269  503:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//  270  506:aload_0         
	//  271  507:getfield        #768 <Field TextView mTitleTextView>
	//  272  510:invokevirtual   #816 <Method int TextView.getMeasuredHeight()>
	//  273  513:iadd            
	//  274  514:aload           16
	//  275  516:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//  276  519:iadd            
	//  277  520:iconst_0        
	//  278  521:iadd            
	//  279  522:istore_2        
		} else
	//* 280  523:goto            528
		{
			i = 0;
	//  281  526:iconst_0        
	//  282  527:istore_2        
		}
		if(flag3)
	//* 283  528:iload           15
	//* 284  530:ifeq            570
		{
			LayoutParams layoutparams1 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  285  533:aload_0         
	//  286  534:getfield        #814 <Field TextView mSubtitleTextView>
	//  287  537:invokevirtual   #815 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  288  540:checkcast       #351 <Class Toolbar$LayoutParams>
	//  289  543:astore          16
			i += layoutparams1.topMargin + mSubtitleTextView.getMeasuredHeight() + layoutparams1.bottomMargin;
	//  290  545:iload_2         
	//  291  546:aload           16
	//  292  548:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//  293  551:aload_0         
	//  294  552:getfield        #814 <Field TextView mSubtitleTextView>
	//  295  555:invokevirtual   #816 <Method int TextView.getMeasuredHeight()>
	//  296  558:iadd            
	//  297  559:aload           16
	//  298  561:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//  299  564:iadd            
	//  300  565:iadd            
	//  301  566:istore_2        
		}
	//* 302  567:goto            570
		if(!flag && !flag3)
	//* 303  570:iload_1         
	//* 304  571:ifne            590
	//* 305  574:iload           15
	//* 306  576:ifeq            582
	//* 307  579:goto            590
		{
			i = j;
	//  308  582:iload_3         
	//  309  583:istore_2        
			j = j1;
	//  310  584:iload           6
	//  311  586:istore_3        
		} else
	//* 312  587:goto            1310
		{
			Object obj;
			if(flag)
	//* 313  590:iload_1         
	//* 314  591:ifeq            603
				obj = ((Object) (mTitleTextView));
	//  315  594:aload_0         
	//  316  595:getfield        #768 <Field TextView mTitleTextView>
	//  317  598:astore          16
			else
	//* 318  600:goto            609
				obj = ((Object) (mSubtitleTextView));
	//  319  603:aload_0         
	//  320  604:getfield        #814 <Field TextView mSubtitleTextView>
	//  321  607:astore          16
			Object obj1;
			if(flag3)
	//* 322  609:iload           15
	//* 323  611:ifeq            623
				obj1 = ((Object) (mSubtitleTextView));
	//  324  614:aload_0         
	//  325  615:getfield        #814 <Field TextView mSubtitleTextView>
	//  326  618:astore          17
			else
	//* 327  620:goto            629
				obj1 = ((Object) (mTitleTextView));
	//  328  623:aload_0         
	//  329  624:getfield        #768 <Field TextView mTitleTextView>
	//  330  627:astore          17
			obj = ((Object) ((LayoutParams)((View) (obj)).getLayoutParams()));
	//  331  629:aload           16
	//  332  631:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  333  634:checkcast       #351 <Class Toolbar$LayoutParams>
	//  334  637:astore          16
			obj1 = ((Object) ((LayoutParams)((View) (obj1)).getLayoutParams()));
	//  335  639:aload           17
	//  336  641:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  337  644:checkcast       #351 <Class Toolbar$LayoutParams>
	//  338  647:astore          17
			boolean flag1;
			if(flag && mTitleTextView.getMeasuredWidth() > 0 || flag3 && mSubtitleTextView.getMeasuredWidth() > 0)
	//* 339  649:iload_1         
	//* 340  650:ifeq            663
	//* 341  653:aload_0         
	//* 342  654:getfield        #768 <Field TextView mTitleTextView>
	//* 343  657:invokevirtual   #817 <Method int TextView.getMeasuredWidth()>
	//* 344  660:ifgt            678
	//* 345  663:iload           15
	//* 346  665:ifeq            684
	//* 347  668:aload_0         
	//* 348  669:getfield        #814 <Field TextView mSubtitleTextView>
	//* 349  672:invokevirtual   #817 <Method int TextView.getMeasuredWidth()>
	//* 350  675:ifle            684
				flag1 = true;
	//  351  678:iconst_1        
	//  352  679:istore          7
			else
	//* 353  681:goto            687
				flag1 = false;
	//  354  684:iconst_0        
	//  355  685:istore          7
			int l2 = mGravity & 0x70;
	//  356  687:aload_0         
	//  357  688:getfield        #88  <Field int mGravity>
	//  358  691:bipush          112
	//  359  693:iand            
	//  360  694:istore          9
			if(l2 != 48)
	//* 361  696:iload           9
	//* 362  698:bipush          48
	//* 363  700:icmpeq          837
			{
				if(l2 != 80)
	//* 364  703:iload           9
	//* 365  705:bipush          80
	//* 366  707:icmpeq          815
				{
					l2 = (j4 - k3 - k4 - i) / 2;
	//  367  710:iload           13
	//  368  712:iload           12
	//  369  714:isub            
	//  370  715:iload           14
	//  371  717:isub            
	//  372  718:iload_2         
	//  373  719:isub            
	//  374  720:iconst_2        
	//  375  721:idiv            
	//  376  722:istore          9
					if(l2 < ((LayoutParams) (obj)).topMargin + mTitleMarginTop)
	//* 377  724:iload           9
	//* 378  726:aload           16
	//* 379  728:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//* 380  731:aload_0         
	//* 381  732:getfield        #167 <Field int mTitleMarginTop>
	//* 382  735:iadd            
	//* 383  736:icmpge          753
					{
						i = ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
	//  384  739:aload           16
	//  385  741:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//  386  744:aload_0         
	//  387  745:getfield        #167 <Field int mTitleMarginTop>
	//  388  748:iadd            
	//  389  749:istore_2        
					} else
	//* 390  750:goto            807
					{
						j4 = j4 - k4 - i - l2 - k3;
	//  391  753:iload           13
	//  392  755:iload           14
	//  393  757:isub            
	//  394  758:iload_2         
	//  395  759:isub            
	//  396  760:iload           9
	//  397  762:isub            
	//  398  763:iload           12
	//  399  765:isub            
	//  400  766:istore          13
						i = l2;
	//  401  768:iload           9
	//  402  770:istore_2        
						if(j4 < ((LayoutParams) (obj)).bottomMargin + mTitleMarginBottom)
	//* 403  771:iload           13
	//* 404  773:aload           16
	//* 405  775:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//* 406  778:aload_0         
	//* 407  779:getfield        #165 <Field int mTitleMarginBottom>
	//* 408  782:iadd            
	//* 409  783:icmpge          807
							i = Math.max(0, l2 - ((((LayoutParams) (obj1)).bottomMargin + mTitleMarginBottom) - j4));
	//  410  786:iconst_0        
	//  411  787:iload           9
	//  412  789:aload           17
	//  413  791:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//  414  794:aload_0         
	//  415  795:getfield        #165 <Field int mTitleMarginBottom>
	//  416  798:iadd            
	//  417  799:iload           13
	//  418  801:isub            
	//  419  802:isub            
	//  420  803:invokestatic    #493 <Method int Math.max(int, int)>
	//  421  806:istore_2        
					}
					i = k3 + i;
	//  422  807:iload           12
	//  423  809:iload_2         
	//  424  810:iadd            
	//  425  811:istore_2        
				} else
	//* 426  812:goto            853
				{
					i = j4 - k4 - ((LayoutParams) (obj1)).bottomMargin - mTitleMarginBottom - i;
	//  427  815:iload           13
	//  428  817:iload           14
	//  429  819:isub            
	//  430  820:aload           17
	//  431  822:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//  432  825:isub            
	//  433  826:aload_0         
	//  434  827:getfield        #165 <Field int mTitleMarginBottom>
	//  435  830:isub            
	//  436  831:iload_2         
	//  437  832:isub            
	//  438  833:istore_2        
				}
			} else
	//* 439  834:goto            853
			{
				i = getPaddingTop() + ((LayoutParams) (obj)).topMargin + mTitleMarginTop;
	//  440  837:aload_0         
	//  441  838:invokevirtual   #476 <Method int getPaddingTop()>
	//  442  841:aload           16
	//  443  843:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//  444  846:iadd            
	//  445  847:aload_0         
	//  446  848:getfield        #167 <Field int mTitleMarginTop>
	//  447  851:iadd            
	//  448  852:istore_2        
			}
			l2 = j;
	//  449  853:iload_3         
	//  450  854:istore          9
			if(flag2)
	//* 451  856:iload           8
	//* 452  858:ifeq            1089
			{
				if(flag1)
	//* 453  861:iload           7
	//* 454  863:ifeq            874
					j = mTitleMarginStart;
	//  455  866:aload_0         
	//  456  867:getfield        #171 <Field int mTitleMarginStart>
	//  457  870:istore_3        
				else
	//* 458  871:goto            876
					j = 0;
	//  459  874:iconst_0        
	//  460  875:istore_3        
				int l1 = j - ai[1];
	//  461  876:iload_3         
	//  462  877:aload           18
	//  463  879:iconst_1        
	//  464  880:iaload          
	//  465  881:isub            
	//  466  882:istore          8
				j = j1 - Math.max(0, l1);
	//  467  884:iload           6
	//  468  886:iconst_0        
	//  469  887:iload           8
	//  470  889:invokestatic    #493 <Method int Math.max(int, int)>
	//  471  892:isub            
	//  472  893:istore_3        
				ai[1] = Math.max(0, -l1);
	//  473  894:aload           18
	//  474  896:iconst_1        
	//  475  897:iconst_0        
	//  476  898:iload           8
	//  477  900:ineg            
	//  478  901:invokestatic    #493 <Method int Math.max(int, int)>
	//  479  904:iastore         
				if(flag)
	//* 480  905:iload_1         
	//* 481  906:ifeq            977
				{
					LayoutParams layoutparams2 = (LayoutParams)mTitleTextView.getLayoutParams();
	//  482  909:aload_0         
	//  483  910:getfield        #768 <Field TextView mTitleTextView>
	//  484  913:invokevirtual   #815 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  485  916:checkcast       #351 <Class Toolbar$LayoutParams>
	//  486  919:astore          16
					l1 = j - mTitleTextView.getMeasuredWidth();
	//  487  921:iload_3         
	//  488  922:aload_0         
	//  489  923:getfield        #768 <Field TextView mTitleTextView>
	//  490  926:invokevirtual   #817 <Method int TextView.getMeasuredWidth()>
	//  491  929:isub            
	//  492  930:istore          8
					j1 = mTitleTextView.getMeasuredHeight() + i;
	//  493  932:aload_0         
	//  494  933:getfield        #768 <Field TextView mTitleTextView>
	//  495  936:invokevirtual   #816 <Method int TextView.getMeasuredHeight()>
	//  496  939:iload_2         
	//  497  940:iadd            
	//  498  941:istore          6
					mTitleTextView.layout(l1, i, j, j1);
	//  499  943:aload_0         
	//  500  944:getfield        #768 <Field TextView mTitleTextView>
	//  501  947:iload           8
	//  502  949:iload_2         
	//  503  950:iload_3         
	//  504  951:iload           6
	//  505  953:invokevirtual   #818 <Method void TextView.layout(int, int, int, int)>
					i = l1 - mTitleMarginEnd;
	//  506  956:iload           8
	//  507  958:aload_0         
	//  508  959:getfield        #169 <Field int mTitleMarginEnd>
	//  509  962:isub            
	//  510  963:istore_2        
					l1 = j1 + layoutparams2.bottomMargin;
	//  511  964:iload           6
	//  512  966:aload           16
	//  513  968:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//  514  971:iadd            
	//  515  972:istore          8
				} else
	//* 516  974:goto            986
				{
					j1 = j;
	//  517  977:iload_3         
	//  518  978:istore          6
					l1 = i;
	//  519  980:iload_2         
	//  520  981:istore          8
					i = j1;
	//  521  983:iload           6
	//  522  985:istore_2        
				}
				if(flag3)
	//* 523  986:iload           15
	//* 524  988:ifeq            1068
				{
					LayoutParams layoutparams3 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  525  991:aload_0         
	//  526  992:getfield        #814 <Field TextView mSubtitleTextView>
	//  527  995:invokevirtual   #815 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  528  998:checkcast       #351 <Class Toolbar$LayoutParams>
	//  529 1001:astore          16
					j1 = l1 + layoutparams3.topMargin;
	//  530 1003:iload           8
	//  531 1005:aload           16
	//  532 1007:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//  533 1010:iadd            
	//  534 1011:istore          6
					l1 = mSubtitleTextView.getMeasuredWidth();
	//  535 1013:aload_0         
	//  536 1014:getfield        #814 <Field TextView mSubtitleTextView>
	//  537 1017:invokevirtual   #817 <Method int TextView.getMeasuredWidth()>
	//  538 1020:istore          8
					int l3 = mSubtitleTextView.getMeasuredHeight();
	//  539 1022:aload_0         
	//  540 1023:getfield        #814 <Field TextView mSubtitleTextView>
	//  541 1026:invokevirtual   #816 <Method int TextView.getMeasuredHeight()>
	//  542 1029:istore          12
					mSubtitleTextView.layout(j - l1, j1, j, l3 + j1);
	//  543 1031:aload_0         
	//  544 1032:getfield        #814 <Field TextView mSubtitleTextView>
	//  545 1035:iload_3         
	//  546 1036:iload           8
	//  547 1038:isub            
	//  548 1039:iload           6
	//  549 1041:iload_3         
	//  550 1042:iload           12
	//  551 1044:iload           6
	//  552 1046:iadd            
	//  553 1047:invokevirtual   #818 <Method void TextView.layout(int, int, int, int)>
					j1 = j - mTitleMarginEnd;
	//  554 1050:iload_3         
	//  555 1051:aload_0         
	//  556 1052:getfield        #169 <Field int mTitleMarginEnd>
	//  557 1055:isub            
	//  558 1056:istore          6
					l1 = layoutparams3.bottomMargin;
	//  559 1058:aload           16
	//  560 1060:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//  561 1063:istore          8
				} else
	//* 562 1065:goto            1071
				{
					j1 = j;
	//  563 1068:iload_3         
	//  564 1069:istore          6
				}
				if(flag1)
	//* 565 1071:iload           7
	//* 566 1073:ifeq            1083
					j = Math.min(i, j1);
	//  567 1076:iload_2         
	//  568 1077:iload           6
	//  569 1079:invokestatic    #585 <Method int Math.min(int, int)>
	//  570 1082:istore_3        
				i = l2;
	//  571 1083:iload           9
	//  572 1085:istore_2        
			} else
	//* 573 1086:goto            1310
			{
				if(flag1)
	//* 574 1089:iload           7
	//* 575 1091:ifeq            1102
					j = mTitleMarginStart;
	//  576 1094:aload_0         
	//  577 1095:getfield        #171 <Field int mTitleMarginStart>
	//  578 1098:istore_3        
				else
	//* 579 1099:goto            1104
					j = 0;
	//  580 1102:iconst_0        
	//  581 1103:istore_3        
				int i2 = j - ai[0];
	//  582 1104:iload_3         
	//  583 1105:aload           18
	//  584 1107:iconst_0        
	//  585 1108:iaload          
	//  586 1109:isub            
	//  587 1110:istore          8
				j = l2 + Math.max(0, i2);
	//  588 1112:iload           9
	//  589 1114:iconst_0        
	//  590 1115:iload           8
	//  591 1117:invokestatic    #493 <Method int Math.max(int, int)>
	//  592 1120:iadd            
	//  593 1121:istore_3        
				ai[0] = Math.max(0, -i2);
	//  594 1122:aload           18
	//  595 1124:iconst_0        
	//  596 1125:iconst_0        
	//  597 1126:iload           8
	//  598 1128:ineg            
	//  599 1129:invokestatic    #493 <Method int Math.max(int, int)>
	//  600 1132:iastore         
				if(flag)
	//* 601 1133:iload_1         
	//* 602 1134:ifeq            1205
				{
					LayoutParams layoutparams4 = (LayoutParams)mTitleTextView.getLayoutParams();
	//  603 1137:aload_0         
	//  604 1138:getfield        #768 <Field TextView mTitleTextView>
	//  605 1141:invokevirtual   #815 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  606 1144:checkcast       #351 <Class Toolbar$LayoutParams>
	//  607 1147:astore          16
					i2 = mTitleTextView.getMeasuredWidth() + j;
	//  608 1149:aload_0         
	//  609 1150:getfield        #768 <Field TextView mTitleTextView>
	//  610 1153:invokevirtual   #817 <Method int TextView.getMeasuredWidth()>
	//  611 1156:iload_3         
	//  612 1157:iadd            
	//  613 1158:istore          8
					l2 = mTitleTextView.getMeasuredHeight() + i;
	//  614 1160:aload_0         
	//  615 1161:getfield        #768 <Field TextView mTitleTextView>
	//  616 1164:invokevirtual   #816 <Method int TextView.getMeasuredHeight()>
	//  617 1167:iload_2         
	//  618 1168:iadd            
	//  619 1169:istore          9
					mTitleTextView.layout(j, i, i2, l2);
	//  620 1171:aload_0         
	//  621 1172:getfield        #768 <Field TextView mTitleTextView>
	//  622 1175:iload_3         
	//  623 1176:iload_2         
	//  624 1177:iload           8
	//  625 1179:iload           9
	//  626 1181:invokevirtual   #818 <Method void TextView.layout(int, int, int, int)>
					i2 += mTitleMarginEnd;
	//  627 1184:iload           8
	//  628 1186:aload_0         
	//  629 1187:getfield        #169 <Field int mTitleMarginEnd>
	//  630 1190:iadd            
	//  631 1191:istore          8
					i = l2 + layoutparams4.bottomMargin;
	//  632 1193:iload           9
	//  633 1195:aload           16
	//  634 1197:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//  635 1200:iadd            
	//  636 1201:istore_2        
				} else
	//* 637 1202:goto            1208
				{
					i2 = j;
	//  638 1205:iload_3         
	//  639 1206:istore          8
				}
				if(flag3)
	//* 640 1208:iload           15
	//* 641 1210:ifeq            1286
				{
					LayoutParams layoutparams5 = (LayoutParams)mSubtitleTextView.getLayoutParams();
	//  642 1213:aload_0         
	//  643 1214:getfield        #814 <Field TextView mSubtitleTextView>
	//  644 1217:invokevirtual   #815 <Method android.view.ViewGroup$LayoutParams TextView.getLayoutParams()>
	//  645 1220:checkcast       #351 <Class Toolbar$LayoutParams>
	//  646 1223:astore          16
					i += layoutparams5.topMargin;
	//  647 1225:iload_2         
	//  648 1226:aload           16
	//  649 1228:getfield        #485 <Field int Toolbar$LayoutParams.topMargin>
	//  650 1231:iadd            
	//  651 1232:istore_2        
					l2 = mSubtitleTextView.getMeasuredWidth() + j;
	//  652 1233:aload_0         
	//  653 1234:getfield        #814 <Field TextView mSubtitleTextView>
	//  654 1237:invokevirtual   #817 <Method int TextView.getMeasuredWidth()>
	//  655 1240:iload_3         
	//  656 1241:iadd            
	//  657 1242:istore          9
					int i4 = mSubtitleTextView.getMeasuredHeight();
	//  658 1244:aload_0         
	//  659 1245:getfield        #814 <Field TextView mSubtitleTextView>
	//  660 1248:invokevirtual   #816 <Method int TextView.getMeasuredHeight()>
	//  661 1251:istore          12
					mSubtitleTextView.layout(j, i, l2, i4 + i);
	//  662 1253:aload_0         
	//  663 1254:getfield        #814 <Field TextView mSubtitleTextView>
	//  664 1257:iload_3         
	//  665 1258:iload_2         
	//  666 1259:iload           9
	//  667 1261:iload           12
	//  668 1263:iload_2         
	//  669 1264:iadd            
	//  670 1265:invokevirtual   #818 <Method void TextView.layout(int, int, int, int)>
					l2 += mTitleMarginEnd;
	//  671 1268:iload           9
	//  672 1270:aload_0         
	//  673 1271:getfield        #169 <Field int mTitleMarginEnd>
	//  674 1274:iadd            
	//  675 1275:istore          9
					i = layoutparams5.bottomMargin;
	//  676 1277:aload           16
	//  677 1279:getfield        #488 <Field int Toolbar$LayoutParams.bottomMargin>
	//  678 1282:istore_2        
				} else
	//* 679 1283:goto            1289
				{
					l2 = j;
	//  680 1286:iload_3         
	//  681 1287:istore          9
				}
				i = j;
	//  682 1289:iload_3         
	//  683 1290:istore_2        
				j = j1;
	//  684 1291:iload           6
	//  685 1293:istore_3        
				if(flag1)
	//* 686 1294:iload           7
	//* 687 1296:ifeq            1310
				{
					i = Math.max(i2, l2);
	//  688 1299:iload           8
	//  689 1301:iload           9
	//  690 1303:invokestatic    #493 <Method int Math.max(int, int)>
	//  691 1306:istore_2        
					j = j1;
	//  692 1307:iload           6
	//  693 1309:istore_3        
				}
			}
		}
		flag1 = ((boolean) (k));
	//  694 1310:iload           4
	//  695 1312:istore          7
		j1 = 0;
	//  696 1314:iconst_0        
	//  697 1315:istore          6
		addCustomViewsWithGravity(((List) (mTempViews)), 3);
	//  698 1317:aload_0         
	//  699 1318:aload_0         
	//  700 1319:getfield        #95  <Field ArrayList mTempViews>
	//  701 1322:iconst_3        
	//  702 1323:invokespecial   #820 <Method void addCustomViewsWithGravity(List, int)>
		int j2 = mTempViews.size();
	//  703 1326:aload_0         
	//  704 1327:getfield        #95  <Field ArrayList mTempViews>
	//  705 1330:invokevirtual   #605 <Method int ArrayList.size()>
	//  706 1333:istore          8
		for(k = 0; k < j2; k++)
	//* 707 1335:iconst_0        
	//* 708 1336:istore          4
	//* 709 1338:iload           4
	//* 710 1340:iload           8
	//* 711 1342:icmpge          1376
			i = layoutChildLeft((View)mTempViews.get(k), i, ai, i1);
	//  712 1345:aload_0         
	//  713 1346:aload_0         
	//  714 1347:getfield        #95  <Field ArrayList mTempViews>
	//  715 1350:iload           4
	//  716 1352:invokevirtual   #606 <Method Object ArrayList.get(int)>
	//  717 1355:checkcast       #345 <Class View>
	//  718 1358:iload_2         
	//  719 1359:aload           18
	//  720 1361:iload           5
	//  721 1363:invokespecial   #808 <Method int layoutChildLeft(View, int, int[], int)>
	//  722 1366:istore_2        

	//  723 1367:iload           4
	//  724 1369:iconst_1        
	//  725 1370:iadd            
	//  726 1371:istore          4
	//* 727 1373:goto            1338
		addCustomViewsWithGravity(((List) (mTempViews)), 5);
	//  728 1376:aload_0         
	//  729 1377:aload_0         
	//  730 1378:getfield        #95  <Field ArrayList mTempViews>
	//  731 1381:iconst_5        
	//  732 1382:invokespecial   #820 <Method void addCustomViewsWithGravity(List, int)>
		j2 = mTempViews.size();
	//  733 1385:aload_0         
	//  734 1386:getfield        #95  <Field ArrayList mTempViews>
	//  735 1389:invokevirtual   #605 <Method int ArrayList.size()>
	//  736 1392:istore          8
		for(k = 0; k < j2; k++)
	//* 737 1394:iconst_0        
	//* 738 1395:istore          4
	//* 739 1397:iload           4
	//* 740 1399:iload           8
	//* 741 1401:icmpge          1435
			j = layoutChildRight((View)mTempViews.get(k), j, ai, i1);
	//  742 1404:aload_0         
	//  743 1405:aload_0         
	//  744 1406:getfield        #95  <Field ArrayList mTempViews>
	//  745 1409:iload           4
	//  746 1411:invokevirtual   #606 <Method Object ArrayList.get(int)>
	//  747 1414:checkcast       #345 <Class View>
	//  748 1417:iload_3         
	//  749 1418:aload           18
	//  750 1420:iload           5
	//  751 1422:invokespecial   #806 <Method int layoutChildRight(View, int, int[], int)>
	//  752 1425:istore_3        

	//  753 1426:iload           4
	//  754 1428:iconst_1        
	//  755 1429:iadd            
	//  756 1430:istore          4
	//* 757 1432:goto            1397
		addCustomViewsWithGravity(((List) (mTempViews)), 1);
	//  758 1435:aload_0         
	//  759 1436:aload_0         
	//  760 1437:getfield        #95  <Field ArrayList mTempViews>
	//  761 1440:iconst_1        
	//  762 1441:invokespecial   #820 <Method void addCustomViewsWithGravity(List, int)>
		j2 = getViewListMeasuredWidth(((List) (mTempViews)), ai);
	//  763 1444:aload_0         
	//  764 1445:aload_0         
	//  765 1446:getfield        #95  <Field ArrayList mTempViews>
	//  766 1449:aload           18
	//  767 1451:invokespecial   #822 <Method int getViewListMeasuredWidth(List, int[])>
	//  768 1454:istore          8
		k = (flag1 + (i3 - flag1 - j3) / 2) - j2 / 2;
	//  769 1456:iload           7
	//  770 1458:iload           10
	//  771 1460:iload           7
	//  772 1462:isub            
	//  773 1463:iload           11
	//  774 1465:isub            
	//  775 1466:iconst_2        
	//  776 1467:idiv            
	//  777 1468:iadd            
	//  778 1469:iload           8
	//  779 1471:iconst_2        
	//  780 1472:idiv            
	//  781 1473:isub            
	//  782 1474:istore          4
		flag1 = ((boolean) (j2 + k));
	//  783 1476:iload           8
	//  784 1478:iload           4
	//  785 1480:iadd            
	//  786 1481:istore          7
		if(k >= i)
	//* 787 1483:iload           4
	//* 788 1485:iload_2         
	//* 789 1486:icmpge          1492
	//* 790 1489:goto            1512
			if(flag1 > j)
	//* 791 1492:iload           7
	//* 792 1494:iload_3         
	//* 793 1495:icmple          1509
				i = k - (flag1 - j);
	//  794 1498:iload           4
	//  795 1500:iload           7
	//  796 1502:iload_3         
	//  797 1503:isub            
	//  798 1504:isub            
	//  799 1505:istore_2        
			else
	//* 800 1506:goto            1512
				i = k;
	//  801 1509:iload           4
	//  802 1511:istore_2        
		k = mTempViews.size();
	//  803 1512:aload_0         
	//  804 1513:getfield        #95  <Field ArrayList mTempViews>
	//  805 1516:invokevirtual   #605 <Method int ArrayList.size()>
	//  806 1519:istore          4
		for(j = j1; j < k; j++)
	//* 807 1521:iload           6
	//* 808 1523:istore_3        
	//* 809 1524:iload_3         
	//* 810 1525:iload           4
	//* 811 1527:icmpge          1558
			i = layoutChildLeft((View)mTempViews.get(j), i, ai, i1);
	//  812 1530:aload_0         
	//  813 1531:aload_0         
	//  814 1532:getfield        #95  <Field ArrayList mTempViews>
	//  815 1535:iload_3         
	//  816 1536:invokevirtual   #606 <Method Object ArrayList.get(int)>
	//  817 1539:checkcast       #345 <Class View>
	//  818 1542:iload_2         
	//  819 1543:aload           18
	//  820 1545:iload           5
	//  821 1547:invokespecial   #808 <Method int layoutChildLeft(View, int, int[], int)>
	//  822 1550:istore_2        

	//  823 1551:iload_3         
	//  824 1552:iconst_1        
	//  825 1553:iadd            
	//  826 1554:istore_3        
	//* 827 1555:goto            1524
		mTempViews.clear();
	//  828 1558:aload_0         
	//  829 1559:getfield        #95  <Field ArrayList mTempViews>
	//  830 1562:invokevirtual   #610 <Method void ArrayList.clear()>
	//  831 1565:return          
	}

	protected void onMeasure(int i, int j)
	{
		int ai[] = mTempMargins;
	//    0    0:aload_0         
	//    1    1:getfield        #99  <Field int[] mTempMargins>
	//    2    4:astore          12
		int l1;
		int i2;
		if(ViewUtils.isLayoutRtl(((View) (this))))
	//*   3    6:aload_0         
	//*   4    7:invokestatic    #828 <Method boolean ViewUtils.isLayoutRtl(View)>
	//*   5   10:ifeq            22
		{
			i2 = 1;
	//    6   13:iconst_1        
	//    7   14:istore          8
			l1 = 0;
	//    8   16:iconst_0        
	//    9   17:istore          7
		} else
	//*  10   19:goto            28
		{
			i2 = 0;
	//   11   22:iconst_0        
	//   12   23:istore          8
			l1 = 1;
	//   13   25:iconst_1        
	//   14   26:istore          7
		}
		int k;
		int j1;
		int k1;
		if(shouldLayout(((View) (mNavButtonView))))
	//*  15   28:aload_0         
	//*  16   29:aload_0         
	//*  17   30:getfield        #455 <Field ImageButton mNavButtonView>
	//*  18   33:invokespecial   #358 <Method boolean shouldLayout(View)>
	//*  19   36:ifeq            110
		{
			measureChildConstrained(((View) (mNavButtonView)), i, 0, j, 0, mMaxButtonHeight);
	//   20   39:aload_0         
	//   21   40:aload_0         
	//   22   41:getfield        #455 <Field ImageButton mNavButtonView>
	//   23   44:iload_1         
	//   24   45:iconst_0        
	//   25   46:iload_2         
	//   26   47:iconst_0        
	//   27   48:aload_0         
	//   28   49:getfield        #191 <Field int mMaxButtonHeight>
	//   29   52:invokespecial   #830 <Method void measureChildConstrained(View, int, int, int, int, int)>
			k = mNavButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mNavButtonView)));
	//   30   55:aload_0         
	//   31   56:getfield        #455 <Field ImageButton mNavButtonView>
	//   32   59:invokevirtual   #831 <Method int ImageButton.getMeasuredWidth()>
	//   33   62:aload_0         
	//   34   63:aload_0         
	//   35   64:getfield        #455 <Field ImageButton mNavButtonView>
	//   36   67:invokespecial   #833 <Method int getHorizontalMargins(View)>
	//   37   70:iadd            
	//   38   71:istore_3        
			k1 = Math.max(0, mNavButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mNavButtonView))));
	//   39   72:iconst_0        
	//   40   73:aload_0         
	//   41   74:getfield        #455 <Field ImageButton mNavButtonView>
	//   42   77:invokevirtual   #834 <Method int ImageButton.getMeasuredHeight()>
	//   43   80:aload_0         
	//   44   81:aload_0         
	//   45   82:getfield        #455 <Field ImageButton mNavButtonView>
	//   46   85:invokespecial   #836 <Method int getVerticalMargins(View)>
	//   47   88:iadd            
	//   48   89:invokestatic    #493 <Method int Math.max(int, int)>
	//   49   92:istore          6
			j1 = View.combineMeasuredStates(0, mNavButtonView.getMeasuredState());
	//   50   94:iconst_0        
	//   51   95:aload_0         
	//   52   96:getfield        #455 <Field ImageButton mNavButtonView>
	//   53   99:invokevirtual   #839 <Method int ImageButton.getMeasuredState()>
	//   54  102:invokestatic    #842 <Method int View.combineMeasuredStates(int, int)>
	//   55  105:istore          5
		} else
	//*  56  107:goto            118
		{
			k = 0;
	//   57  110:iconst_0        
	//   58  111:istore_3        
			k1 = 0;
	//   59  112:iconst_0        
	//   60  113:istore          6
			j1 = 0;
	//   61  115:iconst_0        
	//   62  116:istore          5
		}
		int j2 = k;
	//   63  118:iload_3         
	//   64  119:istore          9
		int i1 = k1;
	//   65  121:iload           6
	//   66  123:istore          4
		k = j1;
	//   67  125:iload           5
	//   68  127:istore_3        
		if(shouldLayout(((View) (mCollapseButtonView))))
	//*  69  128:aload_0         
	//*  70  129:aload_0         
	//*  71  130:getfield        #631 <Field ImageButton mCollapseButtonView>
	//*  72  133:invokespecial   #358 <Method boolean shouldLayout(View)>
	//*  73  136:ifeq            209
		{
			measureChildConstrained(((View) (mCollapseButtonView)), i, 0, j, 0, mMaxButtonHeight);
	//   74  139:aload_0         
	//   75  140:aload_0         
	//   76  141:getfield        #631 <Field ImageButton mCollapseButtonView>
	//   77  144:iload_1         
	//   78  145:iconst_0        
	//   79  146:iload_2         
	//   80  147:iconst_0        
	//   81  148:aload_0         
	//   82  149:getfield        #191 <Field int mMaxButtonHeight>
	//   83  152:invokespecial   #830 <Method void measureChildConstrained(View, int, int, int, int, int)>
			j2 = mCollapseButtonView.getMeasuredWidth() + getHorizontalMargins(((View) (mCollapseButtonView)));
	//   84  155:aload_0         
	//   85  156:getfield        #631 <Field ImageButton mCollapseButtonView>
	//   86  159:invokevirtual   #831 <Method int ImageButton.getMeasuredWidth()>
	//   87  162:aload_0         
	//   88  163:aload_0         
	//   89  164:getfield        #631 <Field ImageButton mCollapseButtonView>
	//   90  167:invokespecial   #833 <Method int getHorizontalMargins(View)>
	//   91  170:iadd            
	//   92  171:istore          9
			i1 = Math.max(k1, mCollapseButtonView.getMeasuredHeight() + getVerticalMargins(((View) (mCollapseButtonView))));
	//   93  173:iload           6
	//   94  175:aload_0         
	//   95  176:getfield        #631 <Field ImageButton mCollapseButtonView>
	//   96  179:invokevirtual   #834 <Method int ImageButton.getMeasuredHeight()>
	//   97  182:aload_0         
	//   98  183:aload_0         
	//   99  184:getfield        #631 <Field ImageButton mCollapseButtonView>
	//  100  187:invokespecial   #836 <Method int getVerticalMargins(View)>
	//  101  190:iadd            
	//  102  191:invokestatic    #493 <Method int Math.max(int, int)>
	//  103  194:istore          4
			k = View.combineMeasuredStates(j1, mCollapseButtonView.getMeasuredState());
	//  104  196:iload           5
	//  105  198:aload_0         
	//  106  199:getfield        #631 <Field ImageButton mCollapseButtonView>
	//  107  202:invokevirtual   #839 <Method int ImageButton.getMeasuredState()>
	//  108  205:invokestatic    #842 <Method int View.combineMeasuredStates(int, int)>
	//  109  208:istore_3        
		}
		j1 = getCurrentContentInsetStart();
	//  110  209:aload_0         
	//  111  210:invokevirtual   #697 <Method int getCurrentContentInsetStart()>
	//  112  213:istore          5
		k1 = 0 + Math.max(j1, j2);
	//  113  215:iconst_0        
	//  114  216:iload           5
	//  115  218:iload           9
	//  116  220:invokestatic    #493 <Method int Math.max(int, int)>
	//  117  223:iadd            
	//  118  224:istore          6
		ai[i2] = Math.max(0, j1 - j2);
	//  119  226:aload           12
	//  120  228:iload           8
	//  121  230:iconst_0        
	//  122  231:iload           5
	//  123  233:iload           9
	//  124  235:isub            
	//  125  236:invokestatic    #493 <Method int Math.max(int, int)>
	//  126  239:iastore         
		if(shouldLayout(((View) (mMenuView))))
	//* 127  240:aload_0         
	//* 128  241:aload_0         
	//* 129  242:getfield        #408 <Field ActionMenuView mMenuView>
	//* 130  245:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 131  248:ifeq            324
		{
			measureChildConstrained(((View) (mMenuView)), i, k1, j, 0, mMaxButtonHeight);
	//  132  251:aload_0         
	//  133  252:aload_0         
	//  134  253:getfield        #408 <Field ActionMenuView mMenuView>
	//  135  256:iload_1         
	//  136  257:iload           6
	//  137  259:iload_2         
	//  138  260:iconst_0        
	//  139  261:aload_0         
	//  140  262:getfield        #191 <Field int mMaxButtonHeight>
	//  141  265:invokespecial   #830 <Method void measureChildConstrained(View, int, int, int, int, int)>
			j1 = mMenuView.getMeasuredWidth() + getHorizontalMargins(((View) (mMenuView)));
	//  142  268:aload_0         
	//  143  269:getfield        #408 <Field ActionMenuView mMenuView>
	//  144  272:invokevirtual   #843 <Method int ActionMenuView.getMeasuredWidth()>
	//  145  275:aload_0         
	//  146  276:aload_0         
	//  147  277:getfield        #408 <Field ActionMenuView mMenuView>
	//  148  280:invokespecial   #833 <Method int getHorizontalMargins(View)>
	//  149  283:iadd            
	//  150  284:istore          5
			i1 = Math.max(i1, mMenuView.getMeasuredHeight() + getVerticalMargins(((View) (mMenuView))));
	//  151  286:iload           4
	//  152  288:aload_0         
	//  153  289:getfield        #408 <Field ActionMenuView mMenuView>
	//  154  292:invokevirtual   #844 <Method int ActionMenuView.getMeasuredHeight()>
	//  155  295:aload_0         
	//  156  296:aload_0         
	//  157  297:getfield        #408 <Field ActionMenuView mMenuView>
	//  158  300:invokespecial   #836 <Method int getVerticalMargins(View)>
	//  159  303:iadd            
	//  160  304:invokestatic    #493 <Method int Math.max(int, int)>
	//  161  307:istore          4
			k = View.combineMeasuredStates(k, mMenuView.getMeasuredState());
	//  162  309:iload_3         
	//  163  310:aload_0         
	//  164  311:getfield        #408 <Field ActionMenuView mMenuView>
	//  165  314:invokevirtual   #845 <Method int ActionMenuView.getMeasuredState()>
	//  166  317:invokestatic    #842 <Method int View.combineMeasuredStates(int, int)>
	//  167  320:istore_3        
		} else
	//* 168  321:goto            327
		{
			j1 = 0;
	//  169  324:iconst_0        
	//  170  325:istore          5
		}
		j2 = getCurrentContentInsetEnd();
	//  171  327:aload_0         
	//  172  328:invokevirtual   #694 <Method int getCurrentContentInsetEnd()>
	//  173  331:istore          9
		i2 = k1 + Math.max(j2, j1);
	//  174  333:iload           6
	//  175  335:iload           9
	//  176  337:iload           5
	//  177  339:invokestatic    #493 <Method int Math.max(int, int)>
	//  178  342:iadd            
	//  179  343:istore          8
		ai[l1] = Math.max(0, j2 - j1);
	//  180  345:aload           12
	//  181  347:iload           7
	//  182  349:iconst_0        
	//  183  350:iload           9
	//  184  352:iload           5
	//  185  354:isub            
	//  186  355:invokestatic    #493 <Method int Math.max(int, int)>
	//  187  358:iastore         
		l1 = i2;
	//  188  359:iload           8
	//  189  361:istore          7
		k1 = i1;
	//  190  363:iload           4
	//  191  365:istore          6
		j1 = k;
	//  192  367:iload_3         
	//  193  368:istore          5
		if(shouldLayout(mExpandedActionView))
	//* 194  370:aload_0         
	//* 195  371:aload_0         
	//* 196  372:getfield        #385 <Field View mExpandedActionView>
	//* 197  375:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 198  378:ifeq            437
		{
			l1 = i2 + measureChildCollapseMargins(mExpandedActionView, i, i2, j, 0, ai);
	//  199  381:iload           8
	//  200  383:aload_0         
	//  201  384:aload_0         
	//  202  385:getfield        #385 <Field View mExpandedActionView>
	//  203  388:iload_1         
	//  204  389:iload           8
	//  205  391:iload_2         
	//  206  392:iconst_0        
	//  207  393:aload           12
	//  208  395:invokespecial   #847 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  209  398:iadd            
	//  210  399:istore          7
			k1 = Math.max(i1, mExpandedActionView.getMeasuredHeight() + getVerticalMargins(mExpandedActionView));
	//  211  401:iload           4
	//  212  403:aload_0         
	//  213  404:getfield        #385 <Field View mExpandedActionView>
	//  214  407:invokevirtual   #470 <Method int View.getMeasuredHeight()>
	//  215  410:aload_0         
	//  216  411:aload_0         
	//  217  412:getfield        #385 <Field View mExpandedActionView>
	//  218  415:invokespecial   #836 <Method int getVerticalMargins(View)>
	//  219  418:iadd            
	//  220  419:invokestatic    #493 <Method int Math.max(int, int)>
	//  221  422:istore          6
			j1 = View.combineMeasuredStates(k, mExpandedActionView.getMeasuredState());
	//  222  424:iload_3         
	//  223  425:aload_0         
	//  224  426:getfield        #385 <Field View mExpandedActionView>
	//  225  429:invokevirtual   #848 <Method int View.getMeasuredState()>
	//  226  432:invokestatic    #842 <Method int View.combineMeasuredStates(int, int)>
	//  227  435:istore          5
		}
		i1 = l1;
	//  228  437:iload           7
	//  229  439:istore          4
		i2 = k1;
	//  230  441:iload           6
	//  231  443:istore          8
		k = j1;
	//  232  445:iload           5
	//  233  447:istore_3        
		if(shouldLayout(((View) (mLogoView))))
	//* 234  448:aload_0         
	//* 235  449:aload_0         
	//* 236  450:getfield        #398 <Field ImageView mLogoView>
	//* 237  453:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 238  456:ifeq            515
		{
			i1 = l1 + measureChildCollapseMargins(((View) (mLogoView)), i, l1, j, 0, ai);
	//  239  459:iload           7
	//  240  461:aload_0         
	//  241  462:aload_0         
	//  242  463:getfield        #398 <Field ImageView mLogoView>
	//  243  466:iload_1         
	//  244  467:iload           7
	//  245  469:iload_2         
	//  246  470:iconst_0        
	//  247  471:aload           12
	//  248  473:invokespecial   #847 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  249  476:iadd            
	//  250  477:istore          4
			i2 = Math.max(k1, mLogoView.getMeasuredHeight() + getVerticalMargins(((View) (mLogoView))));
	//  251  479:iload           6
	//  252  481:aload_0         
	//  253  482:getfield        #398 <Field ImageView mLogoView>
	//  254  485:invokevirtual   #849 <Method int ImageView.getMeasuredHeight()>
	//  255  488:aload_0         
	//  256  489:aload_0         
	//  257  490:getfield        #398 <Field ImageView mLogoView>
	//  258  493:invokespecial   #836 <Method int getVerticalMargins(View)>
	//  259  496:iadd            
	//  260  497:invokestatic    #493 <Method int Math.max(int, int)>
	//  261  500:istore          8
			k = View.combineMeasuredStates(j1, mLogoView.getMeasuredState());
	//  262  502:iload           5
	//  263  504:aload_0         
	//  264  505:getfield        #398 <Field ImageView mLogoView>
	//  265  508:invokevirtual   #850 <Method int ImageView.getMeasuredState()>
	//  266  511:invokestatic    #842 <Method int View.combineMeasuredStates(int, int)>
	//  267  514:istore_3        
		}
		int k2 = getChildCount();
	//  268  515:aload_0         
	//  269  516:invokevirtual   #329 <Method int getChildCount()>
	//  270  519:istore          10
		l1 = i2;
	//  271  521:iload           8
	//  272  523:istore          7
		j1 = 0;
	//  273  525:iconst_0        
	//  274  526:istore          5
		k1 = i1;
	//  275  528:iload           4
	//  276  530:istore          6
		for(i1 = j1; i1 < k2;)
	//* 277  532:iload           5
	//* 278  534:istore          4
	//* 279  536:iload           4
	//* 280  538:iload           10
	//* 281  540:icmpge          667
		{
			View view = getChildAt(i1);
	//  282  543:aload_0         
	//  283  544:iload           4
	//  284  546:invokevirtual   #343 <Method View getChildAt(int)>
	//  285  549:astore          13
			j2 = k1;
	//  286  551:iload           6
	//  287  553:istore          9
			i2 = k;
	//  288  555:iload_3         
	//  289  556:istore          8
			j1 = l1;
	//  290  558:iload           7
	//  291  560:istore          5
			if(((LayoutParams)view.getLayoutParams()).mViewType == 0)
	//* 292  562:aload           13
	//* 293  564:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 294  567:checkcast       #351 <Class Toolbar$LayoutParams>
	//* 295  570:getfield        #354 <Field int Toolbar$LayoutParams.mViewType>
	//* 296  573:ifne            647
				if(!shouldLayout(view))
	//* 297  576:aload_0         
	//* 298  577:aload           13
	//* 299  579:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 300  582:ifne            599
				{
					j2 = k1;
	//  301  585:iload           6
	//  302  587:istore          9
					i2 = k;
	//  303  589:iload_3         
	//  304  590:istore          8
					j1 = l1;
	//  305  592:iload           7
	//  306  594:istore          5
				} else
	//* 307  596:goto            647
				{
					j2 = k1 + measureChildCollapseMargins(view, i, k1, j, 0, ai);
	//  308  599:iload           6
	//  309  601:aload_0         
	//  310  602:aload           13
	//  311  604:iload_1         
	//  312  605:iload           6
	//  313  607:iload_2         
	//  314  608:iconst_0        
	//  315  609:aload           12
	//  316  611:invokespecial   #847 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  317  614:iadd            
	//  318  615:istore          9
					j1 = Math.max(l1, view.getMeasuredHeight() + getVerticalMargins(view));
	//  319  617:iload           7
	//  320  619:aload           13
	//  321  621:invokevirtual   #470 <Method int View.getMeasuredHeight()>
	//  322  624:aload_0         
	//  323  625:aload           13
	//  324  627:invokespecial   #836 <Method int getVerticalMargins(View)>
	//  325  630:iadd            
	//  326  631:invokestatic    #493 <Method int Math.max(int, int)>
	//  327  634:istore          5
					i2 = View.combineMeasuredStates(k, view.getMeasuredState());
	//  328  636:iload_3         
	//  329  637:aload           13
	//  330  639:invokevirtual   #848 <Method int View.getMeasuredState()>
	//  331  642:invokestatic    #842 <Method int View.combineMeasuredStates(int, int)>
	//  332  645:istore          8
				}
			i1++;
	//  333  647:iload           4
	//  334  649:iconst_1        
	//  335  650:iadd            
	//  336  651:istore          4
			k1 = j2;
	//  337  653:iload           9
	//  338  655:istore          6
			k = i2;
	//  339  657:iload           8
	//  340  659:istore_3        
			l1 = j1;
	//  341  660:iload           5
	//  342  662:istore          7
		}

	//* 343  664:goto            536
		i2 = mTitleMarginTop + mTitleMarginBottom;
	//  344  667:aload_0         
	//  345  668:getfield        #167 <Field int mTitleMarginTop>
	//  346  671:aload_0         
	//  347  672:getfield        #165 <Field int mTitleMarginBottom>
	//  348  675:iadd            
	//  349  676:istore          8
		j2 = mTitleMarginStart + mTitleMarginEnd;
	//  350  678:aload_0         
	//  351  679:getfield        #171 <Field int mTitleMarginStart>
	//  352  682:aload_0         
	//  353  683:getfield        #169 <Field int mTitleMarginEnd>
	//  354  686:iadd            
	//  355  687:istore          9
		if(shouldLayout(((View) (mTitleTextView))))
	//* 356  689:aload_0         
	//* 357  690:aload_0         
	//* 358  691:getfield        #768 <Field TextView mTitleTextView>
	//* 359  694:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 360  697:ifeq            787
		{
			measureChildCollapseMargins(((View) (mTitleTextView)), i, k1 + j2, j, i2, ai);
	//  361  700:aload_0         
	//  362  701:aload_0         
	//  363  702:getfield        #768 <Field TextView mTitleTextView>
	//  364  705:iload_1         
	//  365  706:iload           6
	//  366  708:iload           9
	//  367  710:iadd            
	//  368  711:iload_2         
	//  369  712:iload           8
	//  370  714:aload           12
	//  371  716:invokespecial   #847 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  372  719:pop             
			i1 = mTitleTextView.getMeasuredWidth();
	//  373  720:aload_0         
	//  374  721:getfield        #768 <Field TextView mTitleTextView>
	//  375  724:invokevirtual   #817 <Method int TextView.getMeasuredWidth()>
	//  376  727:istore          4
			k2 = getHorizontalMargins(((View) (mTitleTextView)));
	//  377  729:aload_0         
	//  378  730:aload_0         
	//  379  731:getfield        #768 <Field TextView mTitleTextView>
	//  380  734:invokespecial   #833 <Method int getHorizontalMargins(View)>
	//  381  737:istore          10
			j1 = mTitleTextView.getMeasuredHeight();
	//  382  739:aload_0         
	//  383  740:getfield        #768 <Field TextView mTitleTextView>
	//  384  743:invokevirtual   #816 <Method int TextView.getMeasuredHeight()>
	//  385  746:istore          5
			int l2 = getVerticalMargins(((View) (mTitleTextView)));
	//  386  748:aload_0         
	//  387  749:aload_0         
	//  388  750:getfield        #768 <Field TextView mTitleTextView>
	//  389  753:invokespecial   #836 <Method int getVerticalMargins(View)>
	//  390  756:istore          11
			k = View.combineMeasuredStates(k, mTitleTextView.getMeasuredState());
	//  391  758:iload_3         
	//  392  759:aload_0         
	//  393  760:getfield        #768 <Field TextView mTitleTextView>
	//  394  763:invokevirtual   #851 <Method int TextView.getMeasuredState()>
	//  395  766:invokestatic    #842 <Method int View.combineMeasuredStates(int, int)>
	//  396  769:istore_3        
			j1 += l2;
	//  397  770:iload           5
	//  398  772:iload           11
	//  399  774:iadd            
	//  400  775:istore          5
			i1 += k2;
	//  401  777:iload           4
	//  402  779:iload           10
	//  403  781:iadd            
	//  404  782:istore          4
		} else
	//* 405  784:goto            793
		{
			i1 = 0;
	//  406  787:iconst_0        
	//  407  788:istore          4
			j1 = 0;
	//  408  790:iconst_0        
	//  409  791:istore          5
		}
		if(shouldLayout(((View) (mSubtitleTextView))))
	//* 410  793:aload_0         
	//* 411  794:aload_0         
	//* 412  795:getfield        #814 <Field TextView mSubtitleTextView>
	//* 413  798:invokespecial   #358 <Method boolean shouldLayout(View)>
	//* 414  801:ifeq            869
		{
			i1 = Math.max(i1, measureChildCollapseMargins(((View) (mSubtitleTextView)), i, k1 + j2, j, j1 + i2, ai));
	//  415  804:iload           4
	//  416  806:aload_0         
	//  417  807:aload_0         
	//  418  808:getfield        #814 <Field TextView mSubtitleTextView>
	//  419  811:iload_1         
	//  420  812:iload           6
	//  421  814:iload           9
	//  422  816:iadd            
	//  423  817:iload_2         
	//  424  818:iload           5
	//  425  820:iload           8
	//  426  822:iadd            
	//  427  823:aload           12
	//  428  825:invokespecial   #847 <Method int measureChildCollapseMargins(View, int, int, int, int, int[])>
	//  429  828:invokestatic    #493 <Method int Math.max(int, int)>
	//  430  831:istore          4
			j1 += mSubtitleTextView.getMeasuredHeight() + getVerticalMargins(((View) (mSubtitleTextView)));
	//  431  833:iload           5
	//  432  835:aload_0         
	//  433  836:getfield        #814 <Field TextView mSubtitleTextView>
	//  434  839:invokevirtual   #816 <Method int TextView.getMeasuredHeight()>
	//  435  842:aload_0         
	//  436  843:aload_0         
	//  437  844:getfield        #814 <Field TextView mSubtitleTextView>
	//  438  847:invokespecial   #836 <Method int getVerticalMargins(View)>
	//  439  850:iadd            
	//  440  851:iadd            
	//  441  852:istore          5
			k = View.combineMeasuredStates(k, mSubtitleTextView.getMeasuredState());
	//  442  854:iload_3         
	//  443  855:aload_0         
	//  444  856:getfield        #814 <Field TextView mSubtitleTextView>
	//  445  859:invokevirtual   #851 <Method int TextView.getMeasuredState()>
	//  446  862:invokestatic    #842 <Method int View.combineMeasuredStates(int, int)>
	//  447  865:istore_3        
		}
	//* 448  866:goto            869
		j1 = Math.max(l1, j1);
	//  449  869:iload           7
	//  450  871:iload           5
	//  451  873:invokestatic    #493 <Method int Math.max(int, int)>
	//  452  876:istore          5
		j2 = getPaddingLeft();
	//  453  878:aload_0         
	//  454  879:invokevirtual   #555 <Method int getPaddingLeft()>
	//  455  882:istore          9
		k2 = getPaddingRight();
	//  456  884:aload_0         
	//  457  885:invokevirtual   #558 <Method int getPaddingRight()>
	//  458  888:istore          10
		l1 = getPaddingTop();
	//  459  890:aload_0         
	//  460  891:invokevirtual   #476 <Method int getPaddingTop()>
	//  461  894:istore          7
		i2 = getPaddingBottom();
	//  462  896:aload_0         
	//  463  897:invokevirtual   #479 <Method int getPaddingBottom()>
	//  464  900:istore          8
		i1 = View.resolveSizeAndState(Math.max(k1 + i1 + (j2 + k2), getSuggestedMinimumWidth()), i, 0xff000000 & k);
	//  465  902:iload           6
	//  466  904:iload           4
	//  467  906:iadd            
	//  468  907:iload           9
	//  469  909:iload           10
	//  470  911:iadd            
	//  471  912:iadd            
	//  472  913:aload_0         
	//  473  914:invokevirtual   #854 <Method int getSuggestedMinimumWidth()>
	//  474  917:invokestatic    #493 <Method int Math.max(int, int)>
	//  475  920:iload_1         
	//  476  921:ldc2            #855 <Int 0xff000000>
	//  477  924:iload_3         
	//  478  925:iand            
	//  479  926:invokestatic    #858 <Method int View.resolveSizeAndState(int, int, int)>
	//  480  929:istore          4
		i = View.resolveSizeAndState(Math.max(j1 + (l1 + i2), getSuggestedMinimumHeight()), j, k << 16);
	//  481  931:iload           5
	//  482  933:iload           7
	//  483  935:iload           8
	//  484  937:iadd            
	//  485  938:iadd            
	//  486  939:aload_0         
	//  487  940:invokevirtual   #861 <Method int getSuggestedMinimumHeight()>
	//  488  943:invokestatic    #493 <Method int Math.max(int, int)>
	//  489  946:iload_2         
	//  490  947:iload_3         
	//  491  948:bipush          16
	//  492  950:ishl            
	//  493  951:invokestatic    #858 <Method int View.resolveSizeAndState(int, int, int)>
	//  494  954:istore_1        
		if(shouldCollapse())
	//* 495  955:aload_0         
	//* 496  956:invokespecial   #863 <Method boolean shouldCollapse()>
	//* 497  959:ifeq            964
			i = 0;
	//  498  962:iconst_0        
	//  499  963:istore_1        
		setMeasuredDimension(i1, i);
	//  500  964:aload_0         
	//  501  965:iload           4
	//  502  967:iload_1         
	//  503  968:invokevirtual   #866 <Method void setMeasuredDimension(int, int)>
	//  504  971:return          
	}

	protected void onRestoreInstanceState(Parcelable parcelable)
	{
		if(!(parcelable instanceof SavedState))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #870 <Class Toolbar$SavedState>
	//*   2    4:ifne            13
		{
			super.onRestoreInstanceState(parcelable);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #872 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
			return;
	//    6   12:return          
		}
		SavedState savedstate = (SavedState)parcelable;
	//    7   13:aload_1         
	//    8   14:checkcast       #870 <Class Toolbar$SavedState>
	//    9   17:astore_2        
		super.onRestoreInstanceState(savedstate.getSuperState());
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #876 <Method Parcelable Toolbar$SavedState.getSuperState()>
	//   13   23:invokespecial   #872 <Method void ViewGroup.onRestoreInstanceState(Parcelable)>
		parcelable = ((Parcelable) (mMenuView));
	//   14   26:aload_0         
	//   15   27:getfield        #408 <Field ActionMenuView mMenuView>
	//   16   30:astore_1        
		if(parcelable != null)
	//*  17   31:aload_1         
	//*  18   32:ifnull          43
			parcelable = ((Parcelable) (((ActionMenuView) (parcelable)).peekMenu()));
	//   19   35:aload_1         
	//   20   36:invokevirtual   #414 <Method MenuBuilder ActionMenuView.peekMenu()>
	//   21   39:astore_1        
		else
	//*  22   40:goto            45
			parcelable = null;
	//   23   43:aconst_null     
	//   24   44:astore_1        
		if(savedstate.expandedMenuItemId != 0 && mExpandedMenuPresenter != null && parcelable != null)
	//*  25   45:aload_2         
	//*  26   46:getfield        #879 <Field int Toolbar$SavedState.expandedMenuItemId>
	//*  27   49:ifeq            85
	//*  28   52:aload_0         
	//*  29   53:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  30   56:ifnull          85
	//*  31   59:aload_1         
	//*  32   60:ifnull          85
		{
			parcelable = ((Parcelable) (((Menu) (parcelable)).findItem(savedstate.expandedMenuItemId)));
	//   33   63:aload_1         
	//   34   64:aload_2         
	//   35   65:getfield        #879 <Field int Toolbar$SavedState.expandedMenuItemId>
	//   36   68:invokeinterface #885 <Method MenuItem Menu.findItem(int)>
	//   37   73:astore_1        
			if(parcelable != null)
	//*  38   74:aload_1         
	//*  39   75:ifnull          85
				((MenuItem) (parcelable)).expandActionView();
	//   40   78:aload_1         
	//   41   79:invokeinterface #890 <Method boolean MenuItem.expandActionView()>
	//   42   84:pop             
		}
		if(savedstate.isOverflowOpen)
	//*  43   85:aload_2         
	//*  44   86:getfield        #893 <Field boolean Toolbar$SavedState.isOverflowOpen>
	//*  45   89:ifeq            96
			postShowOverflowMenu();
	//   46   92:aload_0         
	//   47   93:invokespecial   #895 <Method void postShowOverflowMenu()>
	//   48   96:return          
	}

	public void onRtlPropertiesChanged(int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*   0    0:getstatic       #901 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmplt          13
			super.onRtlPropertiesChanged(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokespecial   #903 <Method void ViewGroup.onRtlPropertiesChanged(int)>
		ensureContentInsets();
	//    6   13:aload_0         
	//    7   14:invokespecial   #207 <Method void ensureContentInsets()>
		RtlSpacingHelper rtlspacinghelper = mContentInsets;
	//    8   17:aload_0         
	//    9   18:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//   10   21:astore_3        
		boolean flag = true;
	//   11   22:iconst_1        
	//   12   23:istore_2        
		if(i != 1)
	//*  13   24:iload_1         
	//*  14   25:iconst_1        
	//*  15   26:icmpne          32
	//*  16   29:goto            34
			flag = false;
	//   17   32:iconst_0        
	//   18   33:istore_2        
		rtlspacinghelper.setDirection(flag);
	//   19   34:aload_3         
	//   20   35:iload_2         
	//   21   36:invokevirtual   #906 <Method void RtlSpacingHelper.setDirection(boolean)>
	//   22   39:return          
	}

	protected Parcelable onSaveInstanceState()
	{
		SavedState savedstate = new SavedState(super.onSaveInstanceState());
	//    0    0:new             #870 <Class Toolbar$SavedState>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #909 <Method Parcelable ViewGroup.onSaveInstanceState()>
	//    4    8:invokespecial   #911 <Method void Toolbar$SavedState(Parcelable)>
	//    5   11:astore_1        
		ExpandedActionViewMenuPresenter expandedactionviewmenupresenter = mExpandedMenuPresenter;
	//    6   12:aload_0         
	//    7   13:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//    8   16:astore_2        
		if(expandedactionviewmenupresenter != null && expandedactionviewmenupresenter.mCurrentExpandedItem != null)
	//*   9   17:aload_2         
	//*  10   18:ifnull          42
	//*  11   21:aload_2         
	//*  12   22:getfield        #621 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//*  13   25:ifnull          42
			savedstate.expandedMenuItemId = mExpandedMenuPresenter.mCurrentExpandedItem.getItemId();
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   17   33:getfield        #621 <Field MenuItemImpl Toolbar$ExpandedActionViewMenuPresenter.mCurrentExpandedItem>
	//   18   36:invokevirtual   #914 <Method int MenuItemImpl.getItemId()>
	//   19   39:putfield        #879 <Field int Toolbar$SavedState.expandedMenuItemId>
		savedstate.isOverflowOpen = isOverflowMenuShowing();
	//   20   42:aload_1         
	//   21   43:aload_0         
	//   22   44:invokevirtual   #915 <Method boolean isOverflowMenuShowing()>
	//   23   47:putfield        #893 <Field boolean Toolbar$SavedState.isOverflowOpen>
		return ((Parcelable) (savedstate));
	//   24   50:aload_1         
	//   25   51:areturn         
	}

	public boolean onTouchEvent(MotionEvent motionevent)
	{
		int i = motionevent.getActionMasked();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #792 <Method int MotionEvent.getActionMasked()>
	//    2    4:istore_2        
		if(i == 0)
	//*   3    5:iload_2         
	//*   4    6:ifne            14
			mEatingTouch = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #918 <Field boolean mEatingTouch>
		if(!mEatingTouch)
	//*   8   14:aload_0         
	//*   9   15:getfield        #918 <Field boolean mEatingTouch>
	//*  10   18:ifne            40
		{
			boolean flag = super.onTouchEvent(motionevent);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #920 <Method boolean ViewGroup.onTouchEvent(MotionEvent)>
	//   14   26:istore_3        
			if(i == 0 && !flag)
	//*  15   27:iload_2         
	//*  16   28:ifne            40
	//*  17   31:iload_3         
	//*  18   32:ifne            40
				mEatingTouch = true;
	//   19   35:aload_0         
	//   20   36:iconst_1        
	//   21   37:putfield        #918 <Field boolean mEatingTouch>
		}
		if(i == 1 || i == 3)
	//*  22   40:iload_2         
	//*  23   41:iconst_1        
	//*  24   42:icmpeq          50
	//*  25   45:iload_2         
	//*  26   46:iconst_3        
	//*  27   47:icmpne          55
			mEatingTouch = false;
	//   28   50:aload_0         
	//   29   51:iconst_0        
	//   30   52:putfield        #918 <Field boolean mEatingTouch>
		return true;
	//   31   55:iconst_1        
	//   32   56:ireturn         
	}

	void removeChildrenForExpandedActionView()
	{
		for(int i = getChildCount() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #329 <Method int getChildCount()>
	//*   2    4:iconst_1        
	//*   3    5:isub            
	//*   4    6:istore_1        
	//*   5    7:iload_1         
	//*   6    8:iflt            60
		{
			View view = getChildAt(i);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:invokevirtual   #343 <Method View getChildAt(int)>
	//   10   16:astore_2        
			if(((LayoutParams)view.getLayoutParams()).mViewType != 2 && view != mMenuView)
	//*  11   17:aload_2         
	//*  12   18:invokevirtual   #349 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  13   21:checkcast       #351 <Class Toolbar$LayoutParams>
	//*  14   24:getfield        #354 <Field int Toolbar$LayoutParams.mViewType>
	//*  15   27:iconst_2        
	//*  16   28:icmpeq          53
	//*  17   31:aload_2         
	//*  18   32:aload_0         
	//*  19   33:getfield        #408 <Field ActionMenuView mMenuView>
	//*  20   36:if_acmpeq       53
			{
				removeViewAt(i);
	//   21   39:aload_0         
	//   22   40:iload_1         
	//   23   41:invokevirtual   #924 <Method void removeViewAt(int)>
				mHiddenViews.add(((Object) (view)));
	//   24   44:aload_0         
	//   25   45:getfield        #97  <Field ArrayList mHiddenViews>
	//   26   48:aload_2         
	//   27   49:invokevirtual   #390 <Method boolean ArrayList.add(Object)>
	//   28   52:pop             
			}
		}

	//   29   53:iload_1         
	//   30   54:iconst_1        
	//   31   55:isub            
	//   32   56:istore_1        
	//*  33   57:goto            7
	//   34   60:return          
	}

	public void setCollapsible(boolean flag)
	{
		mCollapsible = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #600 <Field boolean mCollapsible>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #928 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setContentInsetEndWithActions(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            9
			j = 0x80000000;
	//    4    6:ldc1            #195 <Int 0x80000000>
	//    5    8:istore_2        
		if(j != mContentInsetEndWithActions)
	//*   6    9:iload_2         
	//*   7   10:aload_0         
	//*   8   11:getfield        #228 <Field int mContentInsetEndWithActions>
	//*   9   14:icmpeq          33
		{
			mContentInsetEndWithActions = j;
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:putfield        #228 <Field int mContentInsetEndWithActions>
			if(getNavigationIcon() != null)
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #702 <Method Drawable getNavigationIcon()>
	//*  15   26:ifnull          33
				requestLayout();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #928 <Method void requestLayout()>
		}
	//   18   33:return          
	}

	public void setContentInsetStartWithNavigation(int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i < 0)
	//*   2    2:iload_1         
	//*   3    3:ifge            9
			j = 0x80000000;
	//    4    6:ldc1            #195 <Int 0x80000000>
	//    5    8:istore_2        
		if(j != mContentInsetStartWithNavigation)
	//*   6    9:iload_2         
	//*   7   10:aload_0         
	//*   8   11:getfield        #223 <Field int mContentInsetStartWithNavigation>
	//*   9   14:icmpeq          33
		{
			mContentInsetStartWithNavigation = j;
	//   10   17:aload_0         
	//   11   18:iload_2         
	//   12   19:putfield        #223 <Field int mContentInsetStartWithNavigation>
			if(getNavigationIcon() != null)
	//*  13   22:aload_0         
	//*  14   23:invokevirtual   #702 <Method Drawable getNavigationIcon()>
	//*  15   26:ifnull          33
				requestLayout();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #928 <Method void requestLayout()>
		}
	//   18   33:return          
	}

	public void setContentInsetsAbsolute(int i, int j)
	{
		ensureContentInsets();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void ensureContentInsets()>
		mContentInsets.setAbsolute(i, j);
	//    2    4:aload_0         
	//    3    5:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #215 <Method void RtlSpacingHelper.setAbsolute(int, int)>
	//    7   13:return          
	}

	public void setContentInsetsRelative(int i, int j)
	{
		ensureContentInsets();
	//    0    0:aload_0         
	//    1    1:invokespecial   #207 <Method void ensureContentInsets()>
		mContentInsets.setRelative(i, j);
	//    2    4:aload_0         
	//    3    5:getfield        #209 <Field RtlSpacingHelper mContentInsets>
	//    4    8:iload_1         
	//    5    9:iload_2         
	//    6   10:invokevirtual   #218 <Method void RtlSpacingHelper.setRelative(int, int)>
	//    7   13:return          
	}

	public void setLogo(int i)
	{
		setLogo(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #115 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #937 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #293 <Method void setLogo(Drawable)>
	//    6   12:return          
	}

	public void setLogo(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			ensureLogoView();
	//    2    4:aload_0         
	//    3    5:invokespecial   #939 <Method void ensureLogoView()>
			if(!isChildOrHidden(((View) (mLogoView))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #398 <Field ImageView mLogoView>
	//*   7   13:invokespecial   #941 <Method boolean isChildOrHidden(View)>
	//*   8   16:ifne            68
				addSystemView(((View) (mLogoView)), true);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #398 <Field ImageView mLogoView>
	//   12   24:iconst_1        
	//   13   25:invokespecial   #452 <Method void addSystemView(View, boolean)>
		} else
	//*  14   28:goto            68
		{
			ImageView imageview = mLogoView;
	//   15   31:aload_0         
	//   16   32:getfield        #398 <Field ImageView mLogoView>
	//   17   35:astore_2        
			if(imageview != null && isChildOrHidden(((View) (imageview))))
	//*  18   36:aload_2         
	//*  19   37:ifnull          68
	//*  20   40:aload_0         
	//*  21   41:aload_2         
	//*  22   42:invokespecial   #941 <Method boolean isChildOrHidden(View)>
	//*  23   45:ifeq            68
			{
				removeView(((View) (mLogoView)));
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #398 <Field ImageView mLogoView>
	//   27   53:invokevirtual   #944 <Method void removeView(View)>
				mHiddenViews.remove(((Object) (mLogoView)));
	//   28   56:aload_0         
	//   29   57:getfield        #97  <Field ArrayList mHiddenViews>
	//   30   60:aload_0         
	//   31   61:getfield        #398 <Field ImageView mLogoView>
	//   32   64:invokevirtual   #947 <Method boolean ArrayList.remove(Object)>
	//   33   67:pop             
			}
		}
		ImageView imageview1 = mLogoView;
	//   34   68:aload_0         
	//   35   69:getfield        #398 <Field ImageView mLogoView>
	//   36   72:astore_2        
		if(imageview1 != null)
	//*  37   73:aload_2         
	//*  38   74:ifnull          82
			imageview1.setImageDrawable(drawable);
	//   39   77:aload_2         
	//   40   78:aload_1         
	//   41   79:invokevirtual   #948 <Method void ImageView.setImageDrawable(Drawable)>
	//   42   82:return          
	}

	public void setLogoDescription(int i)
	{
		setLogoDescription(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #115 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #951 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #299 <Method void setLogoDescription(CharSequence)>
	//    6   12:return          
	}

	public void setLogoDescription(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            11
			ensureLogoView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #939 <Method void ensureLogoView()>
		ImageView imageview = mLogoView;
	//    5   11:aload_0         
	//    6   12:getfield        #398 <Field ImageView mLogoView>
	//    7   15:astore_2        
		if(imageview != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          25
			imageview.setContentDescription(charsequence);
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #952 <Method void ImageView.setContentDescription(CharSequence)>
	//   13   25:return          
	}

	public void setMenu(MenuBuilder menubuilder, ActionMenuPresenter actionmenupresenter)
	{
		if(menubuilder == null && mMenuView == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       12
	//*   2    4:aload_0         
	//*   3    5:getfield        #408 <Field ActionMenuView mMenuView>
	//*   4    8:ifnonnull       12
			return;
	//    5   11:return          
		ensureMenuView();
	//    6   12:aload_0         
	//    7   13:invokespecial   #406 <Method void ensureMenuView()>
		MenuBuilder menubuilder1 = mMenuView.peekMenu();
	//    8   16:aload_0         
	//    9   17:getfield        #408 <Field ActionMenuView mMenuView>
	//   10   20:invokevirtual   #414 <Method MenuBuilder ActionMenuView.peekMenu()>
	//   11   23:astore_3        
		if(menubuilder1 == menubuilder)
	//*  12   24:aload_3         
	//*  13   25:aload_1         
	//*  14   26:if_acmpne       30
			return;
	//   15   29:return          
		if(menubuilder1 != null)
	//*  16   30:aload_3         
	//*  17   31:ifnull          50
		{
			menubuilder1.b(((MenuPresenter) (mOuterActionMenuPresenter)));
	//   18   34:aload_3         
	//   19   35:aload_0         
	//   20   36:getfield        #721 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//   21   39:invokevirtual   #957 <Method void MenuBuilder.b(MenuPresenter)>
			menubuilder1.b(((MenuPresenter) (mExpandedMenuPresenter)));
	//   22   42:aload_3         
	//   23   43:aload_0         
	//   24   44:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   25   47:invokevirtual   #957 <Method void MenuBuilder.b(MenuPresenter)>
		}
		if(mExpandedMenuPresenter == null)
	//*  26   50:aload_0         
	//*  27   51:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//*  28   54:ifnonnull       69
			mExpandedMenuPresenter = new ExpandedActionViewMenuPresenter();
	//   29   57:aload_0         
	//   30   58:new             #424 <Class Toolbar$ExpandedActionViewMenuPresenter>
	//   31   61:dup             
	//   32   62:aload_0         
	//   33   63:invokespecial   #425 <Method void Toolbar$ExpandedActionViewMenuPresenter(Toolbar)>
	//   34   66:putfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
		actionmenupresenter.setExpandedActionViewsExclusive(true);
	//   35   69:aload_2         
	//   36   70:iconst_1        
	//   37   71:invokevirtual   #960 <Method void ActionMenuPresenter.setExpandedActionViewsExclusive(boolean)>
		if(menubuilder != null)
	//*  38   74:aload_1         
	//*  39   75:ifnull          102
		{
			menubuilder.a(((MenuPresenter) (actionmenupresenter)), mPopupContext);
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:aload_0         
	//   43   81:getfield        #267 <Field Context mPopupContext>
	//   44   84:invokevirtual   #432 <Method void MenuBuilder.a(MenuPresenter, Context)>
			menubuilder.a(((MenuPresenter) (mExpandedMenuPresenter)), mPopupContext);
	//   45   87:aload_1         
	//   46   88:aload_0         
	//   47   89:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   48   92:aload_0         
	//   49   93:getfield        #267 <Field Context mPopupContext>
	//   50   96:invokevirtual   #432 <Method void MenuBuilder.a(MenuPresenter, Context)>
		} else
	//*  51   99:goto            136
		{
			actionmenupresenter.initForMenu(mPopupContext, ((MenuBuilder) (null)));
	//   52  102:aload_2         
	//   53  103:aload_0         
	//   54  104:getfield        #267 <Field Context mPopupContext>
	//   55  107:aconst_null     
	//   56  108:invokevirtual   #964 <Method void ActionMenuPresenter.initForMenu(Context, MenuBuilder)>
			mExpandedMenuPresenter.initForMenu(mPopupContext, ((MenuBuilder) (null)));
	//   57  111:aload_0         
	//   58  112:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   59  115:aload_0         
	//   60  116:getfield        #267 <Field Context mPopupContext>
	//   61  119:aconst_null     
	//   62  120:invokevirtual   #965 <Method void Toolbar$ExpandedActionViewMenuPresenter.initForMenu(Context, MenuBuilder)>
			actionmenupresenter.updateMenuView(true);
	//   63  123:aload_2         
	//   64  124:iconst_1        
	//   65  125:invokevirtual   #968 <Method void ActionMenuPresenter.updateMenuView(boolean)>
			mExpandedMenuPresenter.updateMenuView(true);
	//   66  128:aload_0         
	//   67  129:getfield        #422 <Field Toolbar$ExpandedActionViewMenuPresenter mExpandedMenuPresenter>
	//   68  132:iconst_1        
	//   69  133:invokevirtual   #969 <Method void Toolbar$ExpandedActionViewMenuPresenter.updateMenuView(boolean)>
		}
		mMenuView.setPopupTheme(mPopupTheme);
	//   70  136:aload_0         
	//   71  137:getfield        #408 <Field ActionMenuView mMenuView>
	//   72  140:aload_0         
	//   73  141:getfield        #435 <Field int mPopupTheme>
	//   74  144:invokevirtual   #436 <Method void ActionMenuView.setPopupTheme(int)>
		mMenuView.setPresenter(actionmenupresenter);
	//   75  147:aload_0         
	//   76  148:getfield        #408 <Field ActionMenuView mMenuView>
	//   77  151:aload_2         
	//   78  152:invokevirtual   #973 <Method void ActionMenuView.setPresenter(ActionMenuPresenter)>
		mOuterActionMenuPresenter = actionmenupresenter;
	//   79  155:aload_0         
	//   80  156:aload_2         
	//   81  157:putfield        #721 <Field ActionMenuPresenter mOuterActionMenuPresenter>
	//   82  160:return          
	}

	public void setMenuCallbacks(android.support.v7.view.menu.MenuPresenter.Callback callback, android.support.v7.view.menu.MenuBuilder.Callback callback1)
	{
		mActionMenuPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #442 <Field android.support.v7.view.menu.MenuPresenter$Callback mActionMenuPresenterCallback>
		mMenuBuilderCallback = callback1;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #444 <Field android.support.v7.view.menu.MenuBuilder$Callback mMenuBuilderCallback>
		ActionMenuView actionmenuview = mMenuView;
	//    6   10:aload_0         
	//    7   11:getfield        #408 <Field ActionMenuView mMenuView>
	//    8   14:astore_3        
		if(actionmenuview != null)
	//*   9   15:aload_3         
	//*  10   16:ifnull          25
			actionmenuview.setMenuCallbacks(callback, callback1);
	//   11   19:aload_3         
	//   12   20:aload_1         
	//   13   21:aload_2         
	//   14   22:invokevirtual   #448 <Method void ActionMenuView.setMenuCallbacks(android.support.v7.view.menu.MenuPresenter$Callback, android.support.v7.view.menu.MenuBuilder$Callback)>
	//   15   25:return          
	}

	public void setNavigationContentDescription(int i)
	{
		CharSequence charsequence;
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            16
			charsequence = getContext().getText(i);
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method Context getContext()>
	//    4    8:iload_1         
	//    5    9:invokevirtual   #951 <Method CharSequence Context.getText(int)>
	//    6   12:astore_2        
		else
	//*   7   13:goto            18
			charsequence = null;
	//    8   16:aconst_null     
	//    9   17:astore_2        
		setNavigationContentDescription(charsequence);
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokevirtual   #287 <Method void setNavigationContentDescription(CharSequence)>
	//   13   23:return          
	}

	public void setNavigationContentDescription(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            11
			ensureNavButtonView();
	//    3    7:aload_0         
	//    4    8:invokespecial   #975 <Method void ensureNavButtonView()>
		ImageButton imagebutton = mNavButtonView;
	//    5   11:aload_0         
	//    6   12:getfield        #455 <Field ImageButton mNavButtonView>
	//    7   15:astore_2        
		if(imagebutton != null)
	//*   8   16:aload_2         
	//*   9   17:ifnull          25
			imagebutton.setContentDescription(charsequence);
	//   10   20:aload_2         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #637 <Method void ImageButton.setContentDescription(CharSequence)>
	//   13   25:return          
	}

	public void setNavigationIcon(int i)
	{
		setNavigationIcon(AppCompatResources.getDrawable(getContext(), i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #115 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokestatic    #937 <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//    5    9:invokevirtual   #281 <Method void setNavigationIcon(Drawable)>
	//    6   12:return          
	}

	public void setNavigationIcon(Drawable drawable)
	{
		if(drawable != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          31
		{
			ensureNavButtonView();
	//    2    4:aload_0         
	//    3    5:invokespecial   #975 <Method void ensureNavButtonView()>
			if(!isChildOrHidden(((View) (mNavButtonView))))
	//*   4    8:aload_0         
	//*   5    9:aload_0         
	//*   6   10:getfield        #455 <Field ImageButton mNavButtonView>
	//*   7   13:invokespecial   #941 <Method boolean isChildOrHidden(View)>
	//*   8   16:ifne            68
				addSystemView(((View) (mNavButtonView)), true);
	//    9   19:aload_0         
	//   10   20:aload_0         
	//   11   21:getfield        #455 <Field ImageButton mNavButtonView>
	//   12   24:iconst_1        
	//   13   25:invokespecial   #452 <Method void addSystemView(View, boolean)>
		} else
	//*  14   28:goto            68
		{
			ImageButton imagebutton = mNavButtonView;
	//   15   31:aload_0         
	//   16   32:getfield        #455 <Field ImageButton mNavButtonView>
	//   17   35:astore_2        
			if(imagebutton != null && isChildOrHidden(((View) (imagebutton))))
	//*  18   36:aload_2         
	//*  19   37:ifnull          68
	//*  20   40:aload_0         
	//*  21   41:aload_2         
	//*  22   42:invokespecial   #941 <Method boolean isChildOrHidden(View)>
	//*  23   45:ifeq            68
			{
				removeView(((View) (mNavButtonView)));
	//   24   48:aload_0         
	//   25   49:aload_0         
	//   26   50:getfield        #455 <Field ImageButton mNavButtonView>
	//   27   53:invokevirtual   #944 <Method void removeView(View)>
				mHiddenViews.remove(((Object) (mNavButtonView)));
	//   28   56:aload_0         
	//   29   57:getfield        #97  <Field ArrayList mHiddenViews>
	//   30   60:aload_0         
	//   31   61:getfield        #455 <Field ImageButton mNavButtonView>
	//   32   64:invokevirtual   #947 <Method boolean ArrayList.remove(Object)>
	//   33   67:pop             
			}
		}
		ImageButton imagebutton1 = mNavButtonView;
	//   34   68:aload_0         
	//   35   69:getfield        #455 <Field ImageButton mNavButtonView>
	//   36   72:astore_2        
		if(imagebutton1 != null)
	//*  37   73:aload_2         
	//*  38   74:ifnull          82
			imagebutton1.setImageDrawable(drawable);
	//   39   77:aload_2         
	//   40   78:aload_1         
	//   41   79:invokevirtual   #634 <Method void ImageButton.setImageDrawable(Drawable)>
	//   42   82:return          
	}

	public void setNavigationOnClickListener(android.view.View.OnClickListener onclicklistener)
	{
		ensureNavButtonView();
	//    0    0:aload_0         
	//    1    1:invokespecial   #975 <Method void ensureNavButtonView()>
		mNavButtonView.setOnClickListener(onclicklistener);
	//    2    4:aload_0         
	//    3    5:getfield        #455 <Field ImageButton mNavButtonView>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #644 <Method void ImageButton.setOnClickListener(android.view.View$OnClickListener)>
	//    6   12:return          
	}

	public void setOnMenuItemClickListener(OnMenuItemClickListener onmenuitemclicklistener)
	{
		mOnMenuItemClickListener = onmenuitemclicklistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #979 <Field Toolbar$OnMenuItemClickListener mOnMenuItemClickListener>
	//    3    5:return          
	}

	public void setOverflowIcon(Drawable drawable)
	{
		ensureMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #714 <Method void ensureMenu()>
		mMenuView.setOverflowIcon(drawable);
	//    2    4:aload_0         
	//    3    5:getfield        #408 <Field ActionMenuView mMenuView>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #982 <Method void ActionMenuView.setOverflowIcon(Drawable)>
	//    6   12:return          
	}

	public void setPopupTheme(int i)
	{
		if(mPopupTheme != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #435 <Field int mPopupTheme>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          42
		{
			mPopupTheme = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #435 <Field int mPopupTheme>
			if(i == 0)
	//*   7   13:iload_1         
	//*   8   14:ifne            26
			{
				mPopupContext = getContext();
	//    9   17:aload_0         
	//   10   18:aload_0         
	//   11   19:invokevirtual   #115 <Method Context getContext()>
	//   12   22:putfield        #267 <Field Context mPopupContext>
				return;
	//   13   25:return          
			}
			mPopupContext = ((Context) (new ContextThemeWrapper(getContext(), i)));
	//   14   26:aload_0         
	//   15   27:new             #984 <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:invokevirtual   #115 <Method Context getContext()>
	//   19   35:iload_1         
	//   20   36:invokespecial   #987 <Method void ContextThemeWrapper(Context, int)>
	//   21   39:putfield        #267 <Field Context mPopupContext>
		}
	//   22   42:return          
	}

	public void setSubtitle(int i)
	{
		setSubtitle(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #115 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #951 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #265 <Method void setSubtitle(CharSequence)>
	//    6   12:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            106
		{
			if(mSubtitleTextView == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #814 <Field TextView mSubtitleTextView>
	//*   5   11:ifnonnull       83
			{
				Context context = getContext();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #115 <Method Context getContext()>
	//    8   18:astore_3        
				mSubtitleTextView = ((TextView) (new AppCompatTextView(context)));
	//    9   19:aload_0         
	//   10   20:new             #989 <Class AppCompatTextView>
	//   11   23:dup             
	//   12   24:aload_3         
	//   13   25:invokespecial   #990 <Method void AppCompatTextView(Context)>
	//   14   28:putfield        #814 <Field TextView mSubtitleTextView>
				mSubtitleTextView.setSingleLine();
	//   15   31:aload_0         
	//   16   32:getfield        #814 <Field TextView mSubtitleTextView>
	//   17   35:invokevirtual   #993 <Method void TextView.setSingleLine()>
				mSubtitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   18   38:aload_0         
	//   19   39:getfield        #814 <Field TextView mSubtitleTextView>
	//   20   42:getstatic       #999 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   21   45:invokevirtual   #1003 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
				int i = mSubtitleTextAppearance;
	//   22   48:aload_0         
	//   23   49:getfield        #139 <Field int mSubtitleTextAppearance>
	//   24   52:istore_2        
				if(i != 0)
	//*  25   53:iload_2         
	//*  26   54:ifeq            66
					mSubtitleTextView.setTextAppearance(context, i);
	//   27   57:aload_0         
	//   28   58:getfield        #814 <Field TextView mSubtitleTextView>
	//   29   61:aload_3         
	//   30   62:iload_2         
	//   31   63:invokevirtual   #1006 <Method void TextView.setTextAppearance(Context, int)>
				i = mSubtitleTextColor;
	//   32   66:aload_0         
	//   33   67:getfield        #1008 <Field int mSubtitleTextColor>
	//   34   70:istore_2        
				if(i != 0)
	//*  35   71:iload_2         
	//*  36   72:ifeq            83
					mSubtitleTextView.setTextColor(i);
	//   37   75:aload_0         
	//   38   76:getfield        #814 <Field TextView mSubtitleTextView>
	//   39   79:iload_2         
	//   40   80:invokevirtual   #1011 <Method void TextView.setTextColor(int)>
			}
			if(!isChildOrHidden(((View) (mSubtitleTextView))))
	//*  41   83:aload_0         
	//*  42   84:aload_0         
	//*  43   85:getfield        #814 <Field TextView mSubtitleTextView>
	//*  44   88:invokespecial   #941 <Method boolean isChildOrHidden(View)>
	//*  45   91:ifne            143
				addSystemView(((View) (mSubtitleTextView)), true);
	//   46   94:aload_0         
	//   47   95:aload_0         
	//   48   96:getfield        #814 <Field TextView mSubtitleTextView>
	//   49   99:iconst_1        
	//   50  100:invokespecial   #452 <Method void addSystemView(View, boolean)>
		} else
	//*  51  103:goto            143
		{
			TextView textview = mSubtitleTextView;
	//   52  106:aload_0         
	//   53  107:getfield        #814 <Field TextView mSubtitleTextView>
	//   54  110:astore_3        
			if(textview != null && isChildOrHidden(((View) (textview))))
	//*  55  111:aload_3         
	//*  56  112:ifnull          143
	//*  57  115:aload_0         
	//*  58  116:aload_3         
	//*  59  117:invokespecial   #941 <Method boolean isChildOrHidden(View)>
	//*  60  120:ifeq            143
			{
				removeView(((View) (mSubtitleTextView)));
	//   61  123:aload_0         
	//   62  124:aload_0         
	//   63  125:getfield        #814 <Field TextView mSubtitleTextView>
	//   64  128:invokevirtual   #944 <Method void removeView(View)>
				mHiddenViews.remove(((Object) (mSubtitleTextView)));
	//   65  131:aload_0         
	//   66  132:getfield        #97  <Field ArrayList mHiddenViews>
	//   67  135:aload_0         
	//   68  136:getfield        #814 <Field TextView mSubtitleTextView>
	//   69  139:invokevirtual   #947 <Method boolean ArrayList.remove(Object)>
	//   70  142:pop             
			}
		}
		TextView textview1 = mSubtitleTextView;
	//   71  143:aload_0         
	//   72  144:getfield        #814 <Field TextView mSubtitleTextView>
	//   73  147:astore_3        
		if(textview1 != null)
	//*  74  148:aload_3         
	//*  75  149:ifnull          157
			textview1.setText(charsequence);
	//   76  152:aload_3         
	//   77  153:aload_1         
	//   78  154:invokevirtual   #1014 <Method void TextView.setText(CharSequence)>
		mSubtitleText = charsequence;
	//   79  157:aload_0         
	//   80  158:aload_1         
	//   81  159:putfield        #729 <Field CharSequence mSubtitleText>
	//   82  162:return          
	}

	public void setSubtitleTextAppearance(Context context, int i)
	{
		mSubtitleTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #139 <Field int mSubtitleTextAppearance>
		TextView textview = mSubtitleTextView;
	//    3    5:aload_0         
	//    4    6:getfield        #814 <Field TextView mSubtitleTextView>
	//    5    9:astore_3        
		if(textview != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
			textview.setTextAppearance(context, i);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #1006 <Method void TextView.setTextAppearance(Context, int)>
	//   12   20:return          
	}

	public void setSubtitleTextColor(int i)
	{
		mSubtitleTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1008 <Field int mSubtitleTextColor>
		TextView textview = mSubtitleTextView;
	//    3    5:aload_0         
	//    4    6:getfield        #814 <Field TextView mSubtitleTextView>
	//    5    9:astore_2        
		if(textview != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			textview.setTextColor(i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #1011 <Method void TextView.setTextColor(int)>
	//   11   19:return          
	}

	public void setTitle(int i)
	{
		setTitle(getContext().getText(i));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #115 <Method Context getContext()>
	//    3    5:iload_1         
	//    4    6:invokevirtual   #951 <Method CharSequence Context.getText(int)>
	//    5    9:invokevirtual   #259 <Method void setTitle(CharSequence)>
	//    6   12:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		if(!TextUtils.isEmpty(charsequence))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #255 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            106
		{
			if(mTitleTextView == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #768 <Field TextView mTitleTextView>
	//*   5   11:ifnonnull       83
			{
				Context context = getContext();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #115 <Method Context getContext()>
	//    8   18:astore_3        
				mTitleTextView = ((TextView) (new AppCompatTextView(context)));
	//    9   19:aload_0         
	//   10   20:new             #989 <Class AppCompatTextView>
	//   11   23:dup             
	//   12   24:aload_3         
	//   13   25:invokespecial   #990 <Method void AppCompatTextView(Context)>
	//   14   28:putfield        #768 <Field TextView mTitleTextView>
				mTitleTextView.setSingleLine();
	//   15   31:aload_0         
	//   16   32:getfield        #768 <Field TextView mTitleTextView>
	//   17   35:invokevirtual   #993 <Method void TextView.setSingleLine()>
				mTitleTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
	//   18   38:aload_0         
	//   19   39:getfield        #768 <Field TextView mTitleTextView>
	//   20   42:getstatic       #999 <Field android.text.TextUtils$TruncateAt android.text.TextUtils$TruncateAt.END>
	//   21   45:invokevirtual   #1003 <Method void TextView.setEllipsize(android.text.TextUtils$TruncateAt)>
				int i = mTitleTextAppearance;
	//   22   48:aload_0         
	//   23   49:getfield        #134 <Field int mTitleTextAppearance>
	//   24   52:istore_2        
				if(i != 0)
	//*  25   53:iload_2         
	//*  26   54:ifeq            66
					mTitleTextView.setTextAppearance(context, i);
	//   27   57:aload_0         
	//   28   58:getfield        #768 <Field TextView mTitleTextView>
	//   29   61:aload_3         
	//   30   62:iload_2         
	//   31   63:invokevirtual   #1006 <Method void TextView.setTextAppearance(Context, int)>
				i = mTitleTextColor;
	//   32   66:aload_0         
	//   33   67:getfield        #1017 <Field int mTitleTextColor>
	//   34   70:istore_2        
				if(i != 0)
	//*  35   71:iload_2         
	//*  36   72:ifeq            83
					mTitleTextView.setTextColor(i);
	//   37   75:aload_0         
	//   38   76:getfield        #768 <Field TextView mTitleTextView>
	//   39   79:iload_2         
	//   40   80:invokevirtual   #1011 <Method void TextView.setTextColor(int)>
			}
			if(!isChildOrHidden(((View) (mTitleTextView))))
	//*  41   83:aload_0         
	//*  42   84:aload_0         
	//*  43   85:getfield        #768 <Field TextView mTitleTextView>
	//*  44   88:invokespecial   #941 <Method boolean isChildOrHidden(View)>
	//*  45   91:ifne            143
				addSystemView(((View) (mTitleTextView)), true);
	//   46   94:aload_0         
	//   47   95:aload_0         
	//   48   96:getfield        #768 <Field TextView mTitleTextView>
	//   49   99:iconst_1        
	//   50  100:invokespecial   #452 <Method void addSystemView(View, boolean)>
		} else
	//*  51  103:goto            143
		{
			TextView textview = mTitleTextView;
	//   52  106:aload_0         
	//   53  107:getfield        #768 <Field TextView mTitleTextView>
	//   54  110:astore_3        
			if(textview != null && isChildOrHidden(((View) (textview))))
	//*  55  111:aload_3         
	//*  56  112:ifnull          143
	//*  57  115:aload_0         
	//*  58  116:aload_3         
	//*  59  117:invokespecial   #941 <Method boolean isChildOrHidden(View)>
	//*  60  120:ifeq            143
			{
				removeView(((View) (mTitleTextView)));
	//   61  123:aload_0         
	//   62  124:aload_0         
	//   63  125:getfield        #768 <Field TextView mTitleTextView>
	//   64  128:invokevirtual   #944 <Method void removeView(View)>
				mHiddenViews.remove(((Object) (mTitleTextView)));
	//   65  131:aload_0         
	//   66  132:getfield        #97  <Field ArrayList mHiddenViews>
	//   67  135:aload_0         
	//   68  136:getfield        #768 <Field TextView mTitleTextView>
	//   69  139:invokevirtual   #947 <Method boolean ArrayList.remove(Object)>
	//   70  142:pop             
			}
		}
		TextView textview1 = mTitleTextView;
	//   71  143:aload_0         
	//   72  144:getfield        #768 <Field TextView mTitleTextView>
	//   73  147:astore_3        
		if(textview1 != null)
	//*  74  148:aload_3         
	//*  75  149:ifnull          157
			textview1.setText(charsequence);
	//   76  152:aload_3         
	//   77  153:aload_1         
	//   78  154:invokevirtual   #1014 <Method void TextView.setText(CharSequence)>
		mTitleText = charsequence;
	//   79  157:aload_0         
	//   80  158:aload_1         
	//   81  159:putfield        #732 <Field CharSequence mTitleText>
	//   82  162:return          
	}

	public void setTitleMargin(int i, int j, int k, int i1)
	{
		mTitleMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #171 <Field int mTitleMarginStart>
		mTitleMarginTop = j;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #167 <Field int mTitleMarginTop>
		mTitleMarginEnd = k;
	//    6   10:aload_0         
	//    7   11:iload_3         
	//    8   12:putfield        #169 <Field int mTitleMarginEnd>
		mTitleMarginBottom = i1;
	//    9   15:aload_0         
	//   10   16:iload           4
	//   11   18:putfield        #165 <Field int mTitleMarginBottom>
		requestLayout();
	//   12   21:aload_0         
	//   13   22:invokevirtual   #928 <Method void requestLayout()>
	//   14   25:return          
	}

	public void setTitleMarginBottom(int i)
	{
		mTitleMarginBottom = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #165 <Field int mTitleMarginBottom>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #928 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginEnd(int i)
	{
		mTitleMarginEnd = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #169 <Field int mTitleMarginEnd>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #928 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginStart(int i)
	{
		mTitleMarginStart = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #171 <Field int mTitleMarginStart>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #928 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleMarginTop(int i)
	{
		mTitleMarginTop = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #167 <Field int mTitleMarginTop>
		requestLayout();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #928 <Method void requestLayout()>
	//    5    9:return          
	}

	public void setTitleTextAppearance(Context context, int i)
	{
		mTitleTextAppearance = i;
	//    0    0:aload_0         
	//    1    1:iload_2         
	//    2    2:putfield        #134 <Field int mTitleTextAppearance>
		TextView textview = mTitleTextView;
	//    3    5:aload_0         
	//    4    6:getfield        #768 <Field TextView mTitleTextView>
	//    5    9:astore_3        
		if(textview != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          20
			textview.setTextAppearance(context, i);
	//    8   14:aload_3         
	//    9   15:aload_1         
	//   10   16:iload_2         
	//   11   17:invokevirtual   #1006 <Method void TextView.setTextAppearance(Context, int)>
	//   12   20:return          
	}

	public void setTitleTextColor(int i)
	{
		mTitleTextColor = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #1017 <Field int mTitleTextColor>
		TextView textview = mTitleTextView;
	//    3    5:aload_0         
	//    4    6:getfield        #768 <Field TextView mTitleTextView>
	//    5    9:astore_2        
		if(textview != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			textview.setTextColor(i);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #1011 <Method void TextView.setTextColor(int)>
	//   11   19:return          
	}

	public boolean showOverflowMenu()
	{
		ActionMenuView actionmenuview = mMenuView;
	//    0    0:aload_0         
	//    1    1:getfield        #408 <Field ActionMenuView mMenuView>
	//    2    4:astore_1        
		return actionmenuview != null && actionmenuview.showOverflowMenu();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #1026 <Method boolean ActionMenuView.showOverflowMenu()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	private static final String TAG = "Toolbar";
	private android.support.v7.view.menu.MenuPresenter.Callback mActionMenuPresenterCallback;
	int mButtonGravity;
	ImageButton mCollapseButtonView;
	private CharSequence mCollapseDescription;
	private Drawable mCollapseIcon;
	private boolean mCollapsible;
	private int mContentInsetEndWithActions;
	private int mContentInsetStartWithNavigation;
	private RtlSpacingHelper mContentInsets;
	private boolean mEatingHover;
	private boolean mEatingTouch;
	View mExpandedActionView;
	private ExpandedActionViewMenuPresenter mExpandedMenuPresenter;
	private int mGravity;
	private final ArrayList mHiddenViews;
	private ImageView mLogoView;
	private int mMaxButtonHeight;
	private android.support.v7.view.menu.MenuBuilder.Callback mMenuBuilderCallback;
	private ActionMenuView mMenuView;
	private final ActionMenuView.OnMenuItemClickListener mMenuViewItemClickListener;
	private ImageButton mNavButtonView;
	OnMenuItemClickListener mOnMenuItemClickListener;
	private ActionMenuPresenter mOuterActionMenuPresenter;
	private Context mPopupContext;
	private int mPopupTheme;
	private final Runnable mShowOverflowMenuRunnable;
	private CharSequence mSubtitleText;
	private int mSubtitleTextAppearance;
	private int mSubtitleTextColor;
	private TextView mSubtitleTextView;
	private final int mTempMargins[];
	private final ArrayList mTempViews;
	private int mTitleMarginBottom;
	private int mTitleMarginEnd;
	private int mTitleMarginStart;
	private int mTitleMarginTop;
	private CharSequence mTitleText;
	private int mTitleTextAppearance;
	private int mTitleTextColor;
	private TextView mTitleTextView;
	private ToolbarWidgetWrapper mWrapper;

	private class _cls1
		implements ActionMenuView.OnMenuItemClickListener
	{

		public boolean onMenuItemClick(MenuItem menuitem)
		{
			if(mOnMenuItemClickListener != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #12  <Field Toolbar this$0>
		//*   2    4:getfield        #24  <Field Toolbar$OnMenuItemClickListener Toolbar.mOnMenuItemClickListener>
		//*   3    7:ifnull          24
				return mOnMenuItemClickListener.onMenuItemClick(menuitem);
		//    4   10:aload_0         
		//    5   11:getfield        #12  <Field Toolbar this$0>
		//    6   14:getfield        #24  <Field Toolbar$OnMenuItemClickListener Toolbar.mOnMenuItemClickListener>
		//    7   17:aload_1         
		//    8   18:invokeinterface #28  <Method boolean Toolbar$OnMenuItemClickListener.onMenuItemClick(MenuItem)>
		//    9   23:ireturn         
			else
				return false;
		//   10   24:iconst_0        
		//   11   25:ireturn         
		}

		final Toolbar this$0;

		_cls1()
		{
			this$0 = Toolbar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field Toolbar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}

		private class OnMenuItemClickListener
		{

			public abstract boolean onMenuItemClick(MenuItem menuitem);
		}

	}


	private class _cls2
		implements Runnable
	{

		public void run()
		{
			showOverflowMenu();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field Toolbar this$0>
		//    2    4:invokevirtual   #23  <Method boolean Toolbar.showOverflowMenu()>
		//    3    7:pop             
		//    4    8:return          
		}

		final Toolbar this$0;

		_cls2()
		{
			this$0 = Toolbar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field Toolbar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class LayoutParams extends android.support.v7.app.ActionBar.LayoutParams
	{

		void copyMarginsFromCompat(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			leftMargin = marginlayoutparams.leftMargin;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:getfield        #46  <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
		//    3    5:putfield        #47  <Field int leftMargin>
			topMargin = marginlayoutparams.topMargin;
		//    4    8:aload_0         
		//    5    9:aload_1         
		//    6   10:getfield        #50  <Field int android.view.ViewGroup$MarginLayoutParams.topMargin>
		//    7   13:putfield        #51  <Field int topMargin>
			rightMargin = marginlayoutparams.rightMargin;
		//    8   16:aload_0         
		//    9   17:aload_1         
		//   10   18:getfield        #54  <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
		//   11   21:putfield        #55  <Field int rightMargin>
			bottomMargin = marginlayoutparams.bottomMargin;
		//   12   24:aload_0         
		//   13   25:aload_1         
		//   14   26:getfield        #58  <Field int android.view.ViewGroup$MarginLayoutParams.bottomMargin>
		//   15   29:putfield        #59  <Field int bottomMargin>
		//   16   32:return          
		}

		static final int CUSTOM = 0;
		static final int EXPANDED = 2;
		static final int SYSTEM = 1;
		int mViewType;

		public LayoutParams(int i)
		{
			this(-2, -1, i);
		//    0    0:aload_0         
		//    1    1:bipush          -2
		//    2    3:iconst_m1       
		//    3    4:iload_1         
		//    4    5:invokespecial   #17  <Method void Toolbar$LayoutParams(int, int, int)>
		//    5    8:return          
		}

		public LayoutParams(int i, int j)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #21  <Method void android.support.v7.app.ActionBar$LayoutParams(int, int)>
			mViewType = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #23  <Field int mViewType>
			gravity = 0x800013;
		//    7   11:aload_0         
		//    8   12:ldc1            #24  <Int 0x800013>
		//    9   14:putfield        #27  <Field int gravity>
		//   10   17:return          
		}

		public LayoutParams(int i, int j, int k)
		{
			super(i, j);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #21  <Method void android.support.v7.app.ActionBar$LayoutParams(int, int)>
			mViewType = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #23  <Field int mViewType>
			gravity = k;
		//    7   11:aload_0         
		//    8   12:iload_3         
		//    9   13:putfield        #27  <Field int gravity>
		//   10   16:return          
		}

		public LayoutParams(Context context, AttributeSet attributeset)
		{
			super(context, attributeset);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #30  <Method void android.support.v7.app.ActionBar$LayoutParams(Context, AttributeSet)>
			mViewType = 0;
		//    4    6:aload_0         
		//    5    7:iconst_0        
		//    6    8:putfield        #23  <Field int mViewType>
		//    7   11:return          
		}

		public LayoutParams(android.support.v7.app.ActionBar.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method void android.support.v7.app.ActionBar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
			mViewType = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #23  <Field int mViewType>
		//    6   10:return          
		}

		public LayoutParams(LayoutParams layoutparams)
		{
			super(((android.support.v7.app.ActionBar.LayoutParams) (layoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #33  <Method void android.support.v7.app.ActionBar$LayoutParams(android.support.v7.app.ActionBar$LayoutParams)>
			mViewType = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #23  <Field int mViewType>
			mViewType = layoutparams.mViewType;
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:getfield        #23  <Field int mViewType>
		//    9   15:putfield        #23  <Field int mViewType>
		//   10   18:return          
		}

		public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
		{
			super(layoutparams);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method void android.support.v7.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
			mViewType = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #23  <Field int mViewType>
		//    6   10:return          
		}

		public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
		{
			super(((android.view.ViewGroup.LayoutParams) (marginlayoutparams)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #37  <Method void android.support.v7.app.ActionBar$LayoutParams(android.view.ViewGroup$LayoutParams)>
			mViewType = 0;
		//    3    5:aload_0         
		//    4    6:iconst_0        
		//    5    7:putfield        #23  <Field int mViewType>
			copyMarginsFromCompat(marginlayoutparams);
		//    6   10:aload_0         
		//    7   11:aload_1         
		//    8   12:invokevirtual   #41  <Method void copyMarginsFromCompat(android.view.ViewGroup$MarginLayoutParams)>
		//    9   15:return          
		}
	}


	private class ExpandedActionViewMenuPresenter
		implements MenuPresenter
	{

		public boolean collapseItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
		{
			if(mExpandedActionView instanceof CollapsibleActionView)
		//*   0    0:aload_0         
		//*   1    1:getfield        #16  <Field Toolbar this$0>
		//*   2    4:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//*   3    7:instanceof      #30  <Class CollapsibleActionView>
		//*   4   10:ifeq            28
				((CollapsibleActionView)mExpandedActionView).onActionViewCollapsed();
		//    5   13:aload_0         
		//    6   14:getfield        #16  <Field Toolbar this$0>
		//    7   17:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//    8   20:checkcast       #30  <Class CollapsibleActionView>
		//    9   23:invokeinterface #33  <Method void CollapsibleActionView.onActionViewCollapsed()>
			menubuilder = ((MenuBuilder) (Toolbar.this));
		//   10   28:aload_0         
		//   11   29:getfield        #16  <Field Toolbar this$0>
		//   12   32:astore_1        
			((Toolbar) (menubuilder)).removeView(((Toolbar) (menubuilder)).mExpandedActionView);
		//   13   33:aload_1         
		//   14   34:aload_1         
		//   15   35:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//   16   38:invokevirtual   #37  <Method void Toolbar.removeView(View)>
			menubuilder = ((MenuBuilder) (Toolbar.this));
		//   17   41:aload_0         
		//   18   42:getfield        #16  <Field Toolbar this$0>
		//   19   45:astore_1        
			((Toolbar) (menubuilder)).removeView(((View) (((Toolbar) (menubuilder)).mCollapseButtonView)));
		//   20   46:aload_1         
		//   21   47:aload_1         
		//   22   48:getfield        #41  <Field ImageButton Toolbar.mCollapseButtonView>
		//   23   51:invokevirtual   #37  <Method void Toolbar.removeView(View)>
			menubuilder = ((MenuBuilder) (Toolbar.this));
		//   24   54:aload_0         
		//   25   55:getfield        #16  <Field Toolbar this$0>
		//   26   58:astore_1        
			menubuilder.mExpandedActionView = null;
		//   27   59:aload_1         
		//   28   60:aconst_null     
		//   29   61:putfield        #28  <Field View Toolbar.mExpandedActionView>
			((Toolbar) (menubuilder)).addChildrenForExpandedActionView();
		//   30   64:aload_1         
		//   31   65:invokevirtual   #44  <Method void Toolbar.addChildrenForExpandedActionView()>
			mCurrentExpandedItem = null;
		//   32   68:aload_0         
		//   33   69:aconst_null     
		//   34   70:putfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
			requestLayout();
		//   35   73:aload_0         
		//   36   74:getfield        #16  <Field Toolbar this$0>
		//   37   77:invokevirtual   #49  <Method void Toolbar.requestLayout()>
			menuitemimpl.setActionViewExpanded(false);
		//   38   80:aload_2         
		//   39   81:iconst_0        
		//   40   82:invokevirtual   #55  <Method void MenuItemImpl.setActionViewExpanded(boolean)>
			return true;
		//   41   85:iconst_1        
		//   42   86:ireturn         
		}

		public boolean expandItemActionView(MenuBuilder menubuilder, MenuItemImpl menuitemimpl)
		{
			ensureCollapseButtonView();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field Toolbar this$0>
		//    2    4:invokevirtual   #59  <Method void Toolbar.ensureCollapseButtonView()>
			menubuilder = ((MenuBuilder) (mCollapseButtonView.getParent()));
		//    3    7:aload_0         
		//    4    8:getfield        #16  <Field Toolbar this$0>
		//    5   11:getfield        #41  <Field ImageButton Toolbar.mCollapseButtonView>
		//    6   14:invokevirtual   #65  <Method android.view.ViewParent ImageButton.getParent()>
		//    7   17:astore_1        
			Toolbar toolbar = Toolbar.this;
		//    8   18:aload_0         
		//    9   19:getfield        #16  <Field Toolbar this$0>
		//   10   22:astore_3        
			if(menubuilder != toolbar)
		//*  11   23:aload_1         
		//*  12   24:aload_3         
		//*  13   25:if_acmpeq       59
			{
				if(menubuilder instanceof ViewGroup)
		//*  14   28:aload_1         
		//*  15   29:instanceof      #67  <Class ViewGroup>
		//*  16   32:ifeq            46
					((ViewGroup)menubuilder).removeView(((View) (toolbar.mCollapseButtonView)));
		//   17   35:aload_1         
		//   18   36:checkcast       #67  <Class ViewGroup>
		//   19   39:aload_3         
		//   20   40:getfield        #41  <Field ImageButton Toolbar.mCollapseButtonView>
		//   21   43:invokevirtual   #68  <Method void ViewGroup.removeView(View)>
				menubuilder = ((MenuBuilder) (Toolbar.this));
		//   22   46:aload_0         
		//   23   47:getfield        #16  <Field Toolbar this$0>
		//   24   50:astore_1        
				((Toolbar) (menubuilder)).addView(((View) (((Toolbar) (menubuilder)).mCollapseButtonView)));
		//   25   51:aload_1         
		//   26   52:aload_1         
		//   27   53:getfield        #41  <Field ImageButton Toolbar.mCollapseButtonView>
		//   28   56:invokevirtual   #71  <Method void Toolbar.addView(View)>
			}
			mExpandedActionView = menuitemimpl.getActionView();
		//   29   59:aload_0         
		//   30   60:getfield        #16  <Field Toolbar this$0>
		//   31   63:aload_2         
		//   32   64:invokevirtual   #75  <Method View MenuItemImpl.getActionView()>
		//   33   67:putfield        #28  <Field View Toolbar.mExpandedActionView>
			mCurrentExpandedItem = menuitemimpl;
		//   34   70:aload_0         
		//   35   71:aload_2         
		//   36   72:putfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
			menubuilder = ((MenuBuilder) (mExpandedActionView.getParent()));
		//   37   75:aload_0         
		//   38   76:getfield        #16  <Field Toolbar this$0>
		//   39   79:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//   40   82:invokevirtual   #78  <Method android.view.ViewParent View.getParent()>
		//   41   85:astore_1        
			toolbar = Toolbar.this;
		//   42   86:aload_0         
		//   43   87:getfield        #16  <Field Toolbar this$0>
		//   44   90:astore_3        
			if(menubuilder != toolbar)
		//*  45   91:aload_1         
		//*  46   92:aload_3         
		//*  47   93:if_acmpeq       168
			{
				if(menubuilder instanceof ViewGroup)
		//*  48   96:aload_1         
		//*  49   97:instanceof      #67  <Class ViewGroup>
		//*  50  100:ifeq            114
					((ViewGroup)menubuilder).removeView(toolbar.mExpandedActionView);
		//   51  103:aload_1         
		//   52  104:checkcast       #67  <Class ViewGroup>
		//   53  107:aload_3         
		//   54  108:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//   55  111:invokevirtual   #68  <Method void ViewGroup.removeView(View)>
				menubuilder = ((MenuBuilder) (generateDefaultLayoutParams()));
		//   56  114:aload_0         
		//   57  115:getfield        #16  <Field Toolbar this$0>
		//   58  118:invokevirtual   #82  <Method Toolbar$LayoutParams Toolbar.generateDefaultLayoutParams()>
		//   59  121:astore_1        
				menubuilder.gravity = 0x800003 | mButtonGravity & 0x70;
		//   60  122:aload_1         
		//   61  123:ldc1            #83  <Int 0x800003>
		//   62  125:aload_0         
		//   63  126:getfield        #16  <Field Toolbar this$0>
		//   64  129:getfield        #87  <Field int Toolbar.mButtonGravity>
		//   65  132:bipush          112
		//   66  134:iand            
		//   67  135:ior             
		//   68  136:putfield        #92  <Field int Toolbar$LayoutParams.gravity>
				menubuilder.mViewType = 2;
		//   69  139:aload_1         
		//   70  140:iconst_2        
		//   71  141:putfield        #95  <Field int Toolbar$LayoutParams.mViewType>
				mExpandedActionView.setLayoutParams(((android.view.ViewGroup.LayoutParams) (menubuilder)));
		//   72  144:aload_0         
		//   73  145:getfield        #16  <Field Toolbar this$0>
		//   74  148:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//   75  151:aload_1         
		//   76  152:invokevirtual   #99  <Method void View.setLayoutParams(android.view.ViewGroup$LayoutParams)>
				menubuilder = ((MenuBuilder) (Toolbar.this));
		//   77  155:aload_0         
		//   78  156:getfield        #16  <Field Toolbar this$0>
		//   79  159:astore_1        
				((Toolbar) (menubuilder)).addView(((Toolbar) (menubuilder)).mExpandedActionView);
		//   80  160:aload_1         
		//   81  161:aload_1         
		//   82  162:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//   83  165:invokevirtual   #71  <Method void Toolbar.addView(View)>
			}
			removeChildrenForExpandedActionView();
		//   84  168:aload_0         
		//   85  169:getfield        #16  <Field Toolbar this$0>
		//   86  172:invokevirtual   #102 <Method void Toolbar.removeChildrenForExpandedActionView()>
			requestLayout();
		//   87  175:aload_0         
		//   88  176:getfield        #16  <Field Toolbar this$0>
		//   89  179:invokevirtual   #49  <Method void Toolbar.requestLayout()>
			menuitemimpl.setActionViewExpanded(true);
		//   90  182:aload_2         
		//   91  183:iconst_1        
		//   92  184:invokevirtual   #55  <Method void MenuItemImpl.setActionViewExpanded(boolean)>
			if(mExpandedActionView instanceof CollapsibleActionView)
		//*  93  187:aload_0         
		//*  94  188:getfield        #16  <Field Toolbar this$0>
		//*  95  191:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//*  96  194:instanceof      #30  <Class CollapsibleActionView>
		//*  97  197:ifeq            215
				((CollapsibleActionView)mExpandedActionView).onActionViewExpanded();
		//   98  200:aload_0         
		//   99  201:getfield        #16  <Field Toolbar this$0>
		//  100  204:getfield        #28  <Field View Toolbar.mExpandedActionView>
		//  101  207:checkcast       #30  <Class CollapsibleActionView>
		//  102  210:invokeinterface #105 <Method void CollapsibleActionView.onActionViewExpanded()>
			return true;
		//  103  215:iconst_1        
		//  104  216:ireturn         
		}

		public boolean flagActionItems()
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public int getId()
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public MenuView getMenuView(ViewGroup viewgroup)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public void initForMenu(Context context, MenuBuilder menubuilder)
		{
			context = ((Context) (mMenu));
		//    0    0:aload_0         
		//    1    1:getfield        #115 <Field MenuBuilder mMenu>
		//    2    4:astore_1        
			if(context != null)
		//*   3    5:aload_1         
		//*   4    6:ifnull          24
			{
				MenuItemImpl menuitemimpl = mCurrentExpandedItem;
		//    5    9:aload_0         
		//    6   10:getfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
		//    7   13:astore_3        
				if(menuitemimpl != null)
		//*   8   14:aload_3         
		//*   9   15:ifnull          24
					((MenuBuilder) (context)).d(menuitemimpl);
		//   10   18:aload_1         
		//   11   19:aload_3         
		//   12   20:invokevirtual   #121 <Method boolean MenuBuilder.d(MenuItemImpl)>
		//   13   23:pop             
			}
			mMenu = menubuilder;
		//   14   24:aload_0         
		//   15   25:aload_2         
		//   16   26:putfield        #115 <Field MenuBuilder mMenu>
		//   17   29:return          
		}

		public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
		{
		//    0    0:return          
		}

		public void onRestoreInstanceState(Parcelable parcelable)
		{
		//    0    0:return          
		}

		public Parcelable onSaveInstanceState()
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public boolean onSubMenuSelected(a a)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void setCallback(android.support.v7.view.menu.MenuPresenter.Callback callback)
		{
		//    0    0:return          
		}

		public void updateMenuView(boolean flag)
		{
			if(mCurrentExpandedItem != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
		//*   2    4:ifnull          86
			{
				MenuBuilder menubuilder = mMenu;
		//    3    7:aload_0         
		//    4    8:getfield        #115 <Field MenuBuilder mMenu>
		//    5   11:astore          6
				boolean flag2 = false;
		//    6   13:iconst_0        
		//    7   14:istore          4
				boolean flag1 = flag2;
		//    8   16:iload           4
		//    9   18:istore_3        
				if(menubuilder != null)
		//*  10   19:aload           6
		//*  11   21:ifnull          69
				{
					int j = menubuilder.size();
		//   12   24:aload           6
		//   13   26:invokevirtual   #135 <Method int MenuBuilder.size()>
		//   14   29:istore          5
					int i = 0;
		//   15   31:iconst_0        
		//   16   32:istore_2        
					do
					{
						flag1 = flag2;
		//   17   33:iload           4
		//   18   35:istore_3        
						if(i >= j)
							break;
		//   19   36:iload_2         
		//   20   37:iload           5
		//   21   39:icmpge          69
						if(mMenu.getItem(i) == mCurrentExpandedItem)
		//*  22   42:aload_0         
		//*  23   43:getfield        #115 <Field MenuBuilder mMenu>
		//*  24   46:iload_2         
		//*  25   47:invokevirtual   #139 <Method MenuItem MenuBuilder.getItem(int)>
		//*  26   50:aload_0         
		//*  27   51:getfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
		//*  28   54:if_acmpne       62
						{
							flag1 = true;
		//   29   57:iconst_1        
		//   30   58:istore_3        
							break;
		//   31   59:goto            69
						}
						i++;
		//   32   62:iload_2         
		//   33   63:iconst_1        
		//   34   64:iadd            
		//   35   65:istore_2        
					} while(true);
		//   36   66:goto            33
				}
				if(!flag1)
		//*  37   69:iload_3         
		//*  38   70:ifne            86
					collapseItemActionView(mMenu, mCurrentExpandedItem);
		//   39   73:aload_0         
		//   40   74:aload_0         
		//   41   75:getfield        #115 <Field MenuBuilder mMenu>
		//   42   78:aload_0         
		//   43   79:getfield        #46  <Field MenuItemImpl mCurrentExpandedItem>
		//   44   82:invokevirtual   #141 <Method boolean collapseItemActionView(MenuBuilder, MenuItemImpl)>
		//   45   85:pop             
			}
		//   46   86:return          
		}

		MenuItemImpl mCurrentExpandedItem;
		MenuBuilder mMenu;
		final Toolbar this$0;

		ExpandedActionViewMenuPresenter()
		{
			this$0 = Toolbar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #16  <Field Toolbar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #19  <Method void Object()>
		//    5    9:return          
		}
	}


	private class _cls3
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			collapseActionView();
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field Toolbar this$0>
		//    2    4:invokevirtual   #23  <Method void Toolbar.collapseActionView()>
		//    3    7:return          
		}

		final Toolbar this$0;

		_cls3()
		{
			this$0 = Toolbar.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field Toolbar this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}


	private class SavedState extends AbsSavedState
	{

		public void writeToParcel(Parcel parcel, int i)
		{
			throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
		//    0    0:new             #42  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #44  <String "d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n">
		//    3    6:invokespecial   #49  <Method void Runtime(String)>
		//    4    9:athrow          
		}

		public static final android.os.Parcelable.Creator CREATOR = new _cls1();
		int expandedMenuItemId;
		boolean isOverflowOpen;

		static 
		{
			class _cls1
				implements android.os.Parcelable.ClassLoaderCreator
			{

				public SavedState createFromParcel(Parcel parcel)
				{
					return new SavedState(parcel, ((ClassLoader) (null)));
				//    0    0:new             #15  <Class Toolbar$SavedState>
				//    1    3:dup             
				//    2    4:aload_1         
				//    3    5:aconst_null     
				//    4    6:invokespecial   #18  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
				//    5    9:areturn         
				}

				public SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
				{
					return new SavedState(parcel, classloader);
				//    0    0:new             #15  <Class Toolbar$SavedState>
				//    1    3:dup             
				//    2    4:aload_1         
				//    3    5:aload_2         
				//    4    6:invokespecial   #18  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
				//    5    9:areturn         
				}

				public volatile Object createFromParcel(Parcel parcel)
				{
					return ((Object) (createFromParcel(parcel)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #22  <Method Toolbar$SavedState createFromParcel(Parcel)>
				//    3    5:areturn         
				}

				public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
				{
					return ((Object) (createFromParcel(parcel, classloader)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:invokevirtual   #25  <Method Toolbar$SavedState createFromParcel(Parcel, ClassLoader)>
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
				//    2    2:invokevirtual   #30  <Method Toolbar$SavedState[] newArray(int)>
				//    3    5:areturn         
				}

				_cls1()
				{
				//    0    0:aload_0         
				//    1    1:invokespecial   #10  <Method void Object()>
				//    2    4:return          
				}
			}

		//    0    0:new             #14  <Class Toolbar$SavedState$1>
		//    1    3:dup             
		//    2    4:invokespecial   #17  <Method void Toolbar$SavedState$1()>
		//    3    7:putstatic       #19  <Field android.os.Parcelable$Creator CREATOR>
		//*   4   10:return          
		}

		public SavedState(Parcel parcel)
		{
			this(parcel, ((ClassLoader) (null)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aconst_null     
		//    3    3:invokespecial   #24  <Method void Toolbar$SavedState(Parcel, ClassLoader)>
		//    4    6:return          
		}

		public SavedState(Parcel parcel, ClassLoader classloader)
		{
			super(parcel, classloader);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #25  <Method void AbsSavedState(Parcel, ClassLoader)>
			expandedMenuItemId = parcel.readInt();
		//    4    6:aload_0         
		//    5    7:aload_1         
		//    6    8:invokevirtual   #31  <Method int Parcel.readInt()>
		//    7   11:putfield        #33  <Field int expandedMenuItemId>
			boolean flag;
			if(parcel.readInt() != 0)
		//*   8   14:aload_1         
		//*   9   15:invokevirtual   #31  <Method int Parcel.readInt()>
		//*  10   18:ifeq            26
				flag = true;
		//   11   21:iconst_1        
		//   12   22:istore_3        
			else
		//*  13   23:goto            28
				flag = false;
		//   14   26:iconst_0        
		//   15   27:istore_3        
			isOverflowOpen = flag;
		//   16   28:aload_0         
		//   17   29:iload_3         
		//   18   30:putfield        #35  <Field boolean isOverflowOpen>
		//   19   33:return          
		}

		public SavedState(Parcelable parcelable)
		{
			super(parcelable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #38  <Method void AbsSavedState(Parcelable)>
		//    3    5:return          
		}
	}

}
