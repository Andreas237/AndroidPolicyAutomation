// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ac;
import android.support.v4.view.au;
import android.support.v7.view.ActionMode;
import android.support.v7.view.menu.MenuBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.*;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package android.support.v7.widget:
//			AbsActionBarView, TintTypedArray, ActionMenuPresenter, ActionMenuView, 
//			ViewUtils

public class ActionBarContextView extends AbsActionBarView
{

	public ActionBarContextView(Context context)
	{
		this(context, ((AttributeSet) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokespecial   #30  <Method void ActionBarContextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionBarContextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.actionModeStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #36  <Field int android.support.v7.appcompat.R$attr.actionModeStyle>
	//    4    6:invokespecial   #39  <Method void ActionBarContextView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ActionBarContextView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #40  <Method void AbsActionBarView(Context, AttributeSet, int)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.ActionMode, i, 0)));
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:getstatic       #46  <Field int[] android.support.v7.appcompat.R$styleable.ActionMode>
	//    8   12:iload_3         
	//    9   13:iconst_0        
	//   10   14:invokestatic    #52  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   11   17:astore_1        
		ac.a(((View) (this)), ((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionMode_background));
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:getstatic       #55  <Field int android.support.v7.appcompat.R$styleable.ActionMode_background>
	//   15   23:invokevirtual   #59  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   16   26:invokestatic    #65  <Method void ac.a(View, android.graphics.drawable.Drawable)>
		mTitleStyleRes = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_titleTextStyle, 0);
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:getstatic       #68  <Field int android.support.v7.appcompat.R$styleable.ActionMode_titleTextStyle>
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #72  <Method int TintTypedArray.getResourceId(int, int)>
	//   22   38:putfield        #74  <Field int mTitleStyleRes>
		mSubtitleStyleRes = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_subtitleTextStyle, 0);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:getstatic       #77  <Field int android.support.v7.appcompat.R$styleable.ActionMode_subtitleTextStyle>
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #72  <Method int TintTypedArray.getResourceId(int, int)>
	//   28   50:putfield        #79  <Field int mSubtitleStyleRes>
		mContentHeight = ((TintTypedArray) (context)).getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionMode_height, 0);
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:getstatic       #82  <Field int android.support.v7.appcompat.R$styleable.ActionMode_height>
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #85  <Method int TintTypedArray.getLayoutDimension(int, int)>
	//   34   62:putfield        #88  <Field int mContentHeight>
		mCloseItemLayout = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_closeItemLayout, android.support.v7.appcompat.R.layout.abc_action_mode_close_item_material);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:getstatic       #91  <Field int android.support.v7.appcompat.R$styleable.ActionMode_closeItemLayout>
	//   38   70:getstatic       #96  <Field int android.support.v7.appcompat.R$layout.abc_action_mode_close_item_material>
	//   39   73:invokevirtual   #72  <Method int TintTypedArray.getResourceId(int, int)>
	//   40   76:putfield        #98  <Field int mCloseItemLayout>
		((TintTypedArray) (context)).recycle();
	//   41   79:aload_1         
	//   42   80:invokevirtual   #102 <Method void TintTypedArray.recycle()>
	//   43   83:return          
	}

	private void initTitle()
	{
		if(mTitleLayout == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #105 <Field LinearLayout mTitleLayout>
	//*   2    4:ifnonnull       117
		{
			LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_title_item, ((android.view.ViewGroup) (this)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #109 <Method Context getContext()>
	//    5   11:invokestatic    #115 <Method LayoutInflater LayoutInflater.from(Context)>
	//    6   14:getstatic       #118 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_title_item>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #122 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    9   21:pop             
			mTitleLayout = (LinearLayout)getChildAt(getChildCount() - 1);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #126 <Method int getChildCount()>
	//   14   28:iconst_1        
	//   15   29:isub            
	//   16   30:invokevirtual   #130 <Method View getChildAt(int)>
	//   17   33:checkcast       #132 <Class LinearLayout>
	//   18   36:putfield        #105 <Field LinearLayout mTitleLayout>
			mTitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_title);
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #105 <Field LinearLayout mTitleLayout>
	//   22   44:getstatic       #137 <Field int android.support.v7.appcompat.R$id.action_bar_title>
	//   23   47:invokevirtual   #140 <Method View LinearLayout.findViewById(int)>
	//   24   50:checkcast       #142 <Class TextView>
	//   25   53:putfield        #144 <Field TextView mTitleView>
			mSubtitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_subtitle);
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #105 <Field LinearLayout mTitleLayout>
	//   29   61:getstatic       #147 <Field int android.support.v7.appcompat.R$id.action_bar_subtitle>
	//   30   64:invokevirtual   #140 <Method View LinearLayout.findViewById(int)>
	//   31   67:checkcast       #142 <Class TextView>
	//   32   70:putfield        #149 <Field TextView mSubtitleView>
			if(mTitleStyleRes != 0)
	//*  33   73:aload_0         
	//*  34   74:getfield        #74  <Field int mTitleStyleRes>
	//*  35   77:ifeq            95
				mTitleView.setTextAppearance(getContext(), mTitleStyleRes);
	//   36   80:aload_0         
	//   37   81:getfield        #144 <Field TextView mTitleView>
	//   38   84:aload_0         
	//   39   85:invokevirtual   #109 <Method Context getContext()>
	//   40   88:aload_0         
	//   41   89:getfield        #74  <Field int mTitleStyleRes>
	//   42   92:invokevirtual   #153 <Method void TextView.setTextAppearance(Context, int)>
			if(mSubtitleStyleRes != 0)
	//*  43   95:aload_0         
	//*  44   96:getfield        #79  <Field int mSubtitleStyleRes>
	//*  45   99:ifeq            117
				mSubtitleView.setTextAppearance(getContext(), mSubtitleStyleRes);
	//   46  102:aload_0         
	//   47  103:getfield        #149 <Field TextView mSubtitleView>
	//   48  106:aload_0         
	//   49  107:invokevirtual   #109 <Method Context getContext()>
	//   50  110:aload_0         
	//   51  111:getfield        #79  <Field int mSubtitleStyleRes>
	//   52  114:invokevirtual   #153 <Method void TextView.setTextAppearance(Context, int)>
		}
		mTitleView.setText(mTitle);
	//   53  117:aload_0         
	//   54  118:getfield        #144 <Field TextView mTitleView>
	//   55  121:aload_0         
	//   56  122:getfield        #155 <Field CharSequence mTitle>
	//   57  125:invokevirtual   #159 <Method void TextView.setText(CharSequence)>
		mSubtitleView.setText(mSubtitle);
	//   58  128:aload_0         
	//   59  129:getfield        #149 <Field TextView mSubtitleView>
	//   60  132:aload_0         
	//   61  133:getfield        #161 <Field CharSequence mSubtitle>
	//   62  136:invokevirtual   #159 <Method void TextView.setText(CharSequence)>
		boolean flag2 = TextUtils.isEmpty(mTitle);
	//   63  139:aload_0         
	//   64  140:getfield        #155 <Field CharSequence mTitle>
	//   65  143:invokestatic    #167 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   66  146:istore          4
		boolean flag1 = TextUtils.isEmpty(mSubtitle) ^ true;
	//   67  148:aload_0         
	//   68  149:getfield        #161 <Field CharSequence mSubtitle>
	//   69  152:invokestatic    #167 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   70  155:iconst_1        
	//   71  156:ixor            
	//   72  157:istore_3        
		Object obj = ((Object) (mSubtitleView));
	//   73  158:aload_0         
	//   74  159:getfield        #149 <Field TextView mSubtitleView>
	//   75  162:astore          5
		boolean flag = false;
	//   76  164:iconst_0        
	//   77  165:istore_2        
		byte byte0;
		if(flag1)
	//*  78  166:iload_3         
	//*  79  167:ifeq            175
			byte0 = 0;
	//   80  170:iconst_0        
	//   81  171:istore_1        
		else
	//*  82  172:goto            178
			byte0 = 8;
	//   83  175:bipush          8
	//   84  177:istore_1        
		((TextView) (obj)).setVisibility(((int) (byte0)));
	//   85  178:aload           5
	//   86  180:iload_1         
	//   87  181:invokevirtual   #171 <Method void TextView.setVisibility(int)>
		obj = ((Object) (mTitleLayout));
	//   88  184:aload_0         
	//   89  185:getfield        #105 <Field LinearLayout mTitleLayout>
	//   90  188:astore          5
		byte0 = ((byte) (flag));
	//   91  190:iload_2         
	//   92  191:istore_1        
		if(!(flag2 ^ true))
	//*  93  192:iload           4
	//*  94  194:iconst_1        
	//*  95  195:ixor            
	//*  96  196:ifne            211
			if(flag1)
	//*  97  199:iload_3         
	//*  98  200:ifeq            208
				byte0 = ((byte) (flag));
	//   99  203:iload_2         
	//  100  204:istore_1        
			else
	//* 101  205:goto            211
				byte0 = 8;
	//  102  208:bipush          8
	//  103  210:istore_1        
		((LinearLayout) (obj)).setVisibility(((int) (byte0)));
	//  104  211:aload           5
	//  105  213:iload_1         
	//  106  214:invokevirtual   #172 <Method void LinearLayout.setVisibility(int)>
		if(mTitleLayout.getParent() == null)
	//* 107  217:aload_0         
	//* 108  218:getfield        #105 <Field LinearLayout mTitleLayout>
	//* 109  221:invokevirtual   #176 <Method android.view.ViewParent LinearLayout.getParent()>
	//* 110  224:ifnonnull       235
			addView(((View) (mTitleLayout)));
	//  111  227:aload_0         
	//  112  228:aload_0         
	//  113  229:getfield        #105 <Field LinearLayout mTitleLayout>
	//  114  232:invokevirtual   #180 <Method void addView(View)>
	//  115  235:return          
	}

	public volatile void animateToVisibility(int i)
	{
		super.animateToVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #183 <Method void AbsActionBarView.animateToVisibility(int)>
	//    3    5:return          
	}

	public volatile boolean canShowOverflowMenu()
	{
		return super.canShowOverflowMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #187 <Method boolean AbsActionBarView.canShowOverflowMenu()>
	//    2    4:ireturn         
	}

	public void closeMode()
	{
		if(mClose == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #190 <Field View mClose>
	//*   2    4:ifnonnull       12
		{
			killMode();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #193 <Method void killMode()>
			return;
	//    5   11:return          
		} else
		{
			return;
	//    6   12:return          
		}
	}

	public volatile void dismissPopupMenus()
	{
		super.dismissPopupMenus();
	//    0    0:aload_0         
	//    1    1:invokespecial   #196 <Method void AbsActionBarView.dismissPopupMenus()>
	//    2    4:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new android.view.ViewGroup.MarginLayoutParams(-1, -2)));
	//    0    0:new             #200 <Class android.view.ViewGroup$MarginLayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:bipush          -2
	//    4    7:invokespecial   #203 <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
	//    5   10:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset)));
	//    0    0:new             #200 <Class android.view.ViewGroup$MarginLayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #109 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #206 <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public volatile int getAnimatedVisibility()
	{
		return super.getAnimatedVisibility();
	//    0    0:aload_0         
	//    1    1:invokespecial   #209 <Method int AbsActionBarView.getAnimatedVisibility()>
	//    2    4:ireturn         
	}

	public volatile int getContentHeight()
	{
		return super.getContentHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #212 <Method int AbsActionBarView.getContentHeight()>
	//    2    4:ireturn         
	}

	public CharSequence getSubtitle()
	{
		return mSubtitle;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field CharSequence mSubtitle>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public boolean hideOverflowMenu()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.hideOverflowMenu();
	//    3    7:aload_0         
	//    4    8:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #224 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void initForMode(final ActionMode mode)
	{
		Object obj = ((Object) (mClose));
	//    0    0:aload_0         
	//    1    1:getfield        #190 <Field View mClose>
	//    2    4:astore_2        
		if(obj == null)
	//*   3    5:aload_2         
	//*   4    6:ifnonnull       40
		{
			mClose = LayoutInflater.from(getContext()).inflate(mCloseItemLayout, ((android.view.ViewGroup) (this)), false);
	//    5    9:aload_0         
	//    6   10:aload_0         
	//    7   11:invokevirtual   #109 <Method Context getContext()>
	//    8   14:invokestatic    #115 <Method LayoutInflater LayoutInflater.from(Context)>
	//    9   17:aload_0         
	//   10   18:getfield        #98  <Field int mCloseItemLayout>
	//   11   21:aload_0         
	//   12   22:iconst_0        
	//   13   23:invokevirtual   #229 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   14   26:putfield        #190 <Field View mClose>
			addView(mClose);
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:getfield        #190 <Field View mClose>
	//   18   34:invokevirtual   #180 <Method void addView(View)>
		} else
	//*  19   37:goto            55
		if(((View) (obj)).getParent() == null)
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #232 <Method android.view.ViewParent View.getParent()>
	//*  22   44:ifnonnull       55
			addView(mClose);
	//   23   47:aload_0         
	//   24   48:aload_0         
	//   25   49:getfield        #190 <Field View mClose>
	//   26   52:invokevirtual   #180 <Method void addView(View)>
		mClose.findViewById(android.support.v7.appcompat.R.id.action_mode_close_button).setOnClickListener(((android.view.View.OnClickListener) (new _cls1())));
	//   27   55:aload_0         
	//   28   56:getfield        #190 <Field View mClose>
	//   29   59:getstatic       #235 <Field int android.support.v7.appcompat.R$id.action_mode_close_button>
	//   30   62:invokevirtual   #236 <Method View View.findViewById(int)>
	//   31   65:new             #238 <Class ActionBarContextView$1>
	//   32   68:dup             
	//   33   69:aload_0         
	//   34   70:aload_1         
	//   35   71:invokespecial   #241 <Method void ActionBarContextView$1(ActionBarContextView, ActionMode)>
	//   36   74:invokevirtual   #245 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		mode = ((ActionMode) ((MenuBuilder)mode.getMenu()));
	//   37   77:aload_1         
	//   38   78:invokevirtual   #251 <Method android.view.Menu ActionMode.getMenu()>
	//   39   81:checkcast       #253 <Class MenuBuilder>
	//   40   84:astore_1        
		if(mActionMenuPresenter != null)
	//*  41   85:aload_0         
	//*  42   86:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//*  43   89:ifnull          100
			mActionMenuPresenter.dismissPopupMenus();
	//   44   92:aload_0         
	//   45   93:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//   46   96:invokevirtual   #255 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
	//   47   99:pop             
		mActionMenuPresenter = new ActionMenuPresenter(getContext());
	//   48  100:aload_0         
	//   49  101:new             #222 <Class ActionMenuPresenter>
	//   50  104:dup             
	//   51  105:aload_0         
	//   52  106:invokevirtual   #109 <Method Context getContext()>
	//   53  109:invokespecial   #257 <Method void ActionMenuPresenter(Context)>
	//   54  112:putfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
		mActionMenuPresenter.setReserveOverflow(true);
	//   55  115:aload_0         
	//   56  116:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//   57  119:iconst_1        
	//   58  120:invokevirtual   #261 <Method void ActionMenuPresenter.setReserveOverflow(boolean)>
		obj = ((Object) (new android.view.ViewGroup.LayoutParams(-2, -1)));
	//   59  123:new             #263 <Class android.view.ViewGroup$LayoutParams>
	//   60  126:dup             
	//   61  127:bipush          -2
	//   62  129:iconst_m1       
	//   63  130:invokespecial   #264 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   64  133:astore_2        
		((MenuBuilder) (mode)).a(((android.support.v7.view.menu.MenuPresenter) (mActionMenuPresenter)), mPopupContext);
	//   65  134:aload_1         
	//   66  135:aload_0         
	//   67  136:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//   68  139:aload_0         
	//   69  140:getfield        #268 <Field Context mPopupContext>
	//   70  143:invokevirtual   #271 <Method void MenuBuilder.a(android.support.v7.view.menu.MenuPresenter, Context)>
		mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(((android.view.ViewGroup) (this)));
	//   71  146:aload_0         
	//   72  147:aload_0         
	//   73  148:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//   74  151:aload_0         
	//   75  152:invokevirtual   #275 <Method android.support.v7.view.menu.MenuView ActionMenuPresenter.getMenuView(android.view.ViewGroup)>
	//   76  155:checkcast       #277 <Class ActionMenuView>
	//   77  158:putfield        #281 <Field ActionMenuView mMenuView>
		ac.a(((View) (mMenuView)), ((android.graphics.drawable.Drawable) (null)));
	//   78  161:aload_0         
	//   79  162:getfield        #281 <Field ActionMenuView mMenuView>
	//   80  165:aconst_null     
	//   81  166:invokestatic    #65  <Method void ac.a(View, android.graphics.drawable.Drawable)>
		addView(((View) (mMenuView)), ((android.view.ViewGroup.LayoutParams) (obj)));
	//   82  169:aload_0         
	//   83  170:aload_0         
	//   84  171:getfield        #281 <Field ActionMenuView mMenuView>
	//   85  174:aload_2         
	//   86  175:invokevirtual   #284 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
	//   87  178:return          
	}

	public volatile boolean isOverflowMenuShowPending()
	{
		return super.isOverflowMenuShowPending();
	//    0    0:aload_0         
	//    1    1:invokespecial   #287 <Method boolean AbsActionBarView.isOverflowMenuShowPending()>
	//    2    4:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.isOverflowMenuShowing();
	//    3    7:aload_0         
	//    4    8:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #290 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public volatile boolean isOverflowReserved()
	{
		return super.isOverflowReserved();
	//    0    0:aload_0         
	//    1    1:invokespecial   #293 <Method boolean AbsActionBarView.isOverflowReserved()>
	//    2    4:ireturn         
	}

	public boolean isTitleOptional()
	{
		return mTitleOptional;
	//    0    0:aload_0         
	//    1    1:getfield        #296 <Field boolean mTitleOptional>
	//    2    4:ireturn         
	}

	public void killMode()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #299 <Method void removeAllViews()>
		mCustomView = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #301 <Field View mCustomView>
		mMenuView = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #281 <Field ActionMenuView mMenuView>
	//    8   14:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #304 <Method void AbsActionBarView.onDetachedFromWindow()>
		if(mActionMenuPresenter != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   4    8:ifnull          27
		{
			mActionMenuPresenter.hideOverflowMenu();
	//    5   11:aload_0         
	//    6   12:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//    7   15:invokevirtual   #224 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//    8   18:pop             
			mActionMenuPresenter.hideSubMenus();
	//    9   19:aload_0         
	//   10   20:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//   11   23:invokevirtual   #307 <Method boolean ActionMenuPresenter.hideSubMenus()>
	//   12   26:pop             
		}
	//   13   27:return          
	}

	public volatile boolean onHoverEvent(MotionEvent motionevent)
	{
		return super.onHoverEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #311 <Method boolean AbsActionBarView.onHoverEvent(MotionEvent)>
	//    3    5:ireturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(accessibilityevent.getEventType() == 32)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #318 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:bipush          32
	//*   3    6:icmpne          45
		{
			accessibilityevent.setSource(((View) (this)));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #321 <Method void AccessibilityEvent.setSource(View)>
			accessibilityevent.setClassName(((CharSequence) (((Object)this).getClass().getName())));
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #327 <Method Class Object.getClass()>
	//   10   19:invokevirtual   #333 <Method String Class.getName()>
	//   11   22:invokevirtual   #336 <Method void AccessibilityEvent.setClassName(CharSequence)>
			accessibilityevent.setPackageName(((CharSequence) (getContext().getPackageName())));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #109 <Method Context getContext()>
	//   15   30:invokevirtual   #341 <Method String Context.getPackageName()>
	//   16   33:invokevirtual   #344 <Method void AccessibilityEvent.setPackageName(CharSequence)>
			accessibilityevent.setContentDescription(mTitle);
	//   17   36:aload_1         
	//   18   37:aload_0         
	//   19   38:getfield        #155 <Field CharSequence mTitle>
	//   20   41:invokevirtual   #347 <Method void AccessibilityEvent.setContentDescription(CharSequence)>
			return;
	//   21   44:return          
		} else
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:invokespecial   #349 <Method void AbsActionBarView.onInitializeAccessibilityEvent(AccessibilityEvent)>
			return;
	//   25   50:return          
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		flag = ViewUtils.isLayoutRtl(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #357 <Method boolean ViewUtils.isLayoutRtl(View)>
	//    2    4:istore_1        
		int i1;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            23
			i1 = k - i - getPaddingRight();
	//    5    9:iload           4
	//    6   11:iload_2         
	//    7   12:isub            
	//    8   13:aload_0         
	//    9   14:invokevirtual   #360 <Method int getPaddingRight()>
	//   10   17:isub            
	//   11   18:istore          6
		else
	//*  12   20:goto            29
			i1 = getPaddingLeft();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #363 <Method int getPaddingLeft()>
	//   15   27:istore          6
		int j1 = getPaddingTop();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #366 <Method int getPaddingTop()>
	//   18   33:istore          7
		int k1 = l - j - getPaddingTop() - getPaddingBottom();
	//   19   35:iload           5
	//   20   37:iload_3         
	//   21   38:isub            
	//   22   39:aload_0         
	//   23   40:invokevirtual   #366 <Method int getPaddingTop()>
	//   24   43:isub            
	//   25   44:aload_0         
	//   26   45:invokevirtual   #369 <Method int getPaddingBottom()>
	//   27   48:isub            
	//   28   49:istore          8
		Object obj = ((Object) (mClose));
	//   29   51:aload_0         
	//   30   52:getfield        #190 <Field View mClose>
	//   31   55:astore          9
		if(obj != null && ((View) (obj)).getVisibility() != 8)
	//*  32   57:aload           9
	//*  33   59:ifnull          158
	//*  34   62:aload           9
	//*  35   64:invokevirtual   #372 <Method int View.getVisibility()>
	//*  36   67:bipush          8
	//*  37   69:icmpeq          158
		{
			obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()));
	//   38   72:aload_0         
	//   39   73:getfield        #190 <Field View mClose>
	//   40   76:invokevirtual   #375 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   41   79:checkcast       #200 <Class android.view.ViewGroup$MarginLayoutParams>
	//   42   82:astore          9
			if(flag)
	//*  43   84:iload_1         
	//*  44   85:ifeq            97
				j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
	//   45   88:aload           9
	//   46   90:getfield        #378 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   47   93:istore_3        
			else
	//*  48   94:goto            103
				j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
	//   49   97:aload           9
	//   50   99:getfield        #381 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   51  102:istore_3        
			if(flag)
	//*  52  103:iload_1         
	//*  53  104:ifeq            117
				l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
	//   54  107:aload           9
	//   55  109:getfield        #381 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   56  112:istore          5
			else
	//*  57  114:goto            124
				l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
	//   58  117:aload           9
	//   59  119:getfield        #378 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   60  122:istore          5
			j = next(i1, j, flag);
	//   61  124:iload           6
	//   62  126:iload_3         
	//   63  127:iload_1         
	//   64  128:invokestatic    #385 <Method int next(int, int, boolean)>
	//   65  131:istore_3        
			j = next(j + positionChild(mClose, j, j1, k1, flag), l, flag);
	//   66  132:iload_3         
	//   67  133:aload_0         
	//   68  134:aload_0         
	//   69  135:getfield        #190 <Field View mClose>
	//   70  138:iload_3         
	//   71  139:iload           7
	//   72  141:iload           8
	//   73  143:iload_1         
	//   74  144:invokevirtual   #389 <Method int positionChild(View, int, int, int, boolean)>
	//   75  147:iadd            
	//   76  148:iload           5
	//   77  150:iload_1         
	//   78  151:invokestatic    #385 <Method int next(int, int, boolean)>
	//   79  154:istore_3        
		} else
	//*  80  155:goto            161
		{
			j = i1;
	//   81  158:iload           6
	//   82  160:istore_3        
		}
		obj = ((Object) (mTitleLayout));
	//   83  161:aload_0         
	//   84  162:getfield        #105 <Field LinearLayout mTitleLayout>
	//   85  165:astore          9
		if(obj != null && mCustomView == null && ((LinearLayout) (obj)).getVisibility() != 8)
	//*  86  167:aload           9
	//*  87  169:ifnull          209
	//*  88  172:aload_0         
	//*  89  173:getfield        #301 <Field View mCustomView>
	//*  90  176:ifnonnull       209
	//*  91  179:aload           9
	//*  92  181:invokevirtual   #390 <Method int LinearLayout.getVisibility()>
	//*  93  184:bipush          8
	//*  94  186:icmpeq          209
			j += positionChild(((View) (mTitleLayout)), j, j1, k1, flag);
	//   95  189:iload_3         
	//   96  190:aload_0         
	//   97  191:aload_0         
	//   98  192:getfield        #105 <Field LinearLayout mTitleLayout>
	//   99  195:iload_3         
	//  100  196:iload           7
	//  101  198:iload           8
	//  102  200:iload_1         
	//  103  201:invokevirtual   #389 <Method int positionChild(View, int, int, int, boolean)>
	//  104  204:iadd            
	//  105  205:istore_3        
	//* 106  206:goto            209
		obj = ((Object) (mCustomView));
	//  107  209:aload_0         
	//  108  210:getfield        #301 <Field View mCustomView>
	//  109  213:astore          9
		if(obj != null)
	//* 110  215:aload           9
	//* 111  217:ifnull          233
			positionChild(((View) (obj)), j, j1, k1, flag);
	//  112  220:aload_0         
	//  113  221:aload           9
	//  114  223:iload_3         
	//  115  224:iload           7
	//  116  226:iload           8
	//  117  228:iload_1         
	//  118  229:invokevirtual   #389 <Method int positionChild(View, int, int, int, boolean)>
	//  119  232:pop             
		if(flag)
	//* 120  233:iload_1         
	//* 121  234:ifeq            245
			i = getPaddingLeft();
	//  122  237:aload_0         
	//  123  238:invokevirtual   #363 <Method int getPaddingLeft()>
	//  124  241:istore_2        
		else
	//* 125  242:goto            255
			i = k - i - getPaddingRight();
	//  126  245:iload           4
	//  127  247:iload_2         
	//  128  248:isub            
	//  129  249:aload_0         
	//  130  250:invokevirtual   #360 <Method int getPaddingRight()>
	//  131  253:isub            
	//  132  254:istore_2        
		if(mMenuView != null)
	//* 133  255:aload_0         
	//* 134  256:getfield        #281 <Field ActionMenuView mMenuView>
	//* 135  259:ifnull          279
			positionChild(((View) (mMenuView)), i, j1, k1, flag ^ true);
	//  136  262:aload_0         
	//  137  263:aload_0         
	//  138  264:getfield        #281 <Field ActionMenuView mMenuView>
	//  139  267:iload_2         
	//  140  268:iload           7
	//  141  270:iload           8
	//  142  272:iload_1         
	//  143  273:iconst_1        
	//  144  274:ixor            
	//  145  275:invokevirtual   #389 <Method int positionChild(View, int, int, int, boolean)>
	//  146  278:pop             
	//  147  279:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #397 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		int l1 = 0x40000000;
	//    3    5:ldc2            #398 <Int 0x40000000>
	//    4    8:istore          5
		if(k == 0x40000000)
	//*   5   10:iload_3         
	//*   6   11:ldc2            #398 <Int 0x40000000>
	//*   7   14:icmpne          548
		{
			if(android.view.View.MeasureSpec.getMode(j) != 0)
	//*   8   17:iload_2         
	//*   9   18:invokestatic    #397 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  10   21:ifeq            495
			{
				int k2 = android.view.View.MeasureSpec.getSize(i);
	//   11   24:iload_1         
	//   12   25:invokestatic    #401 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   13   28:istore          8
				int l;
				if(mContentHeight > 0)
	//*  14   30:aload_0         
	//*  15   31:getfield        #88  <Field int mContentHeight>
	//*  16   34:ifle            45
					l = mContentHeight;
	//   17   37:aload_0         
	//   18   38:getfield        #88  <Field int mContentHeight>
	//   19   41:istore_3        
				else
	//*  20   42:goto            50
					l = android.view.View.MeasureSpec.getSize(j);
	//   21   45:iload_2         
	//   22   46:invokestatic    #401 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   23   49:istore_3        
				int l2 = getPaddingTop() + getPaddingBottom();
	//   24   50:aload_0         
	//   25   51:invokevirtual   #366 <Method int getPaddingTop()>
	//   26   54:aload_0         
	//   27   55:invokevirtual   #369 <Method int getPaddingBottom()>
	//   28   58:iadd            
	//   29   59:istore          9
				i = k2 - getPaddingLeft() - getPaddingRight();
	//   30   61:iload           8
	//   31   63:aload_0         
	//   32   64:invokevirtual   #363 <Method int getPaddingLeft()>
	//   33   67:isub            
	//   34   68:aload_0         
	//   35   69:invokevirtual   #360 <Method int getPaddingRight()>
	//   36   72:isub            
	//   37   73:istore_1        
				int j2 = l - l2;
	//   38   74:iload_3         
	//   39   75:iload           9
	//   40   77:isub            
	//   41   78:istore          7
				int i1 = android.view.View.MeasureSpec.makeMeasureSpec(j2, 0x80000000);
	//   42   80:iload           7
	//   43   82:ldc2            #402 <Int 0x80000000>
	//   44   85:invokestatic    #405 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   45   88:istore          4
				Object obj = ((Object) (mClose));
	//   46   90:aload_0         
	//   47   91:getfield        #190 <Field View mClose>
	//   48   94:astore          11
				boolean flag = false;
	//   49   96:iconst_0        
	//   50   97:istore          6
				j = i;
	//   51   99:iload_1         
	//   52  100:istore_2        
				if(obj != null)
	//*  53  101:aload           11
	//*  54  103:ifnull          143
				{
					i = measureChildView(((View) (obj)), i, i1, 0);
	//   55  106:aload_0         
	//   56  107:aload           11
	//   57  109:iload_1         
	//   58  110:iload           4
	//   59  112:iconst_0        
	//   60  113:invokevirtual   #409 <Method int measureChildView(View, int, int, int)>
	//   61  116:istore_1        
					obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()));
	//   62  117:aload_0         
	//   63  118:getfield        #190 <Field View mClose>
	//   64  121:invokevirtual   #375 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   65  124:checkcast       #200 <Class android.view.ViewGroup$MarginLayoutParams>
	//   66  127:astore          11
					j = i - (((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin + ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin);
	//   67  129:iload_1         
	//   68  130:aload           11
	//   69  132:getfield        #381 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   70  135:aload           11
	//   71  137:getfield        #378 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   72  140:iadd            
	//   73  141:isub            
	//   74  142:istore_2        
				}
				i = j;
	//   75  143:iload_2         
	//   76  144:istore_1        
				if(mMenuView != null)
	//*  77  145:aload_0         
	//*  78  146:getfield        #281 <Field ActionMenuView mMenuView>
	//*  79  149:ifnull          178
				{
					i = j;
	//   80  152:iload_2         
	//   81  153:istore_1        
					if(mMenuView.getParent() == this)
	//*  82  154:aload_0         
	//*  83  155:getfield        #281 <Field ActionMenuView mMenuView>
	//*  84  158:invokevirtual   #410 <Method android.view.ViewParent ActionMenuView.getParent()>
	//*  85  161:aload_0         
	//*  86  162:if_acmpne       178
						i = measureChildView(((View) (mMenuView)), j, i1, 0);
	//   87  165:aload_0         
	//   88  166:aload_0         
	//   89  167:getfield        #281 <Field ActionMenuView mMenuView>
	//   90  170:iload_2         
	//   91  171:iload           4
	//   92  173:iconst_0        
	//   93  174:invokevirtual   #409 <Method int measureChildView(View, int, int, int)>
	//   94  177:istore_1        
				}
				obj = ((Object) (mTitleLayout));
	//   95  178:aload_0         
	//   96  179:getfield        #105 <Field LinearLayout mTitleLayout>
	//   97  182:astore          11
				j = i;
	//   98  184:iload_1         
	//   99  185:istore_2        
				if(obj != null)
	//* 100  186:aload           11
	//* 101  188:ifnull          298
				{
					j = i;
	//  102  191:iload_1         
	//  103  192:istore_2        
					if(mCustomView == null)
	//* 104  193:aload_0         
	//* 105  194:getfield        #301 <Field View mCustomView>
	//* 106  197:ifnonnull       298
						if(mTitleOptional)
	//* 107  200:aload_0         
	//* 108  201:getfield        #296 <Field boolean mTitleOptional>
	//* 109  204:ifeq            287
						{
							j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  110  207:iconst_0        
	//  111  208:iconst_0        
	//  112  209:invokestatic    #405 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  113  212:istore_2        
							mTitleLayout.measure(j, i1);
	//  114  213:aload_0         
	//  115  214:getfield        #105 <Field LinearLayout mTitleLayout>
	//  116  217:iload_2         
	//  117  218:iload           4
	//  118  220:invokevirtual   #413 <Method void LinearLayout.measure(int, int)>
							int i3 = mTitleLayout.getMeasuredWidth();
	//  119  223:aload_0         
	//  120  224:getfield        #105 <Field LinearLayout mTitleLayout>
	//  121  227:invokevirtual   #416 <Method int LinearLayout.getMeasuredWidth()>
	//  122  230:istore          10
							if(i3 <= i)
	//* 123  232:iload           10
	//* 124  234:iload_1         
	//* 125  235:icmpgt          244
								i1 = 1;
	//  126  238:iconst_1        
	//  127  239:istore          4
							else
	//* 128  241:goto            247
								i1 = 0;
	//  129  244:iconst_0        
	//  130  245:istore          4
							j = i;
	//  131  247:iload_1         
	//  132  248:istore_2        
							if(i1 != 0)
	//* 133  249:iload           4
	//* 134  251:ifeq            259
								j = i - i3;
	//  135  254:iload_1         
	//  136  255:iload           10
	//  137  257:isub            
	//  138  258:istore_2        
							obj = ((Object) (mTitleLayout));
	//  139  259:aload_0         
	//  140  260:getfield        #105 <Field LinearLayout mTitleLayout>
	//  141  263:astore          11
							if(i1 != 0)
	//* 142  265:iload           4
	//* 143  267:ifeq            275
								i = 0;
	//  144  270:iconst_0        
	//  145  271:istore_1        
							else
	//* 146  272:goto            278
								i = 8;
	//  147  275:bipush          8
	//  148  277:istore_1        
							((LinearLayout) (obj)).setVisibility(i);
	//  149  278:aload           11
	//  150  280:iload_1         
	//  151  281:invokevirtual   #172 <Method void LinearLayout.setVisibility(int)>
						} else
	//* 152  284:goto            298
						{
							j = measureChildView(((View) (obj)), i, i1, 0);
	//  153  287:aload_0         
	//  154  288:aload           11
	//  155  290:iload_1         
	//  156  291:iload           4
	//  157  293:iconst_0        
	//  158  294:invokevirtual   #409 <Method int measureChildView(View, int, int, int)>
	//  159  297:istore_2        
						}
				}
				obj = ((Object) (mCustomView));
	//  160  298:aload_0         
	//  161  299:getfield        #301 <Field View mCustomView>
	//  162  302:astore          11
				if(obj != null)
	//* 163  304:aload           11
	//* 164  306:ifnull          422
				{
					obj = ((Object) (((View) (obj)).getLayoutParams()));
	//  165  309:aload           11
	//  166  311:invokevirtual   #375 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  167  314:astore          11
					if(((android.view.ViewGroup.LayoutParams) (obj)).width != -2)
	//* 168  316:aload           11
	//* 169  318:getfield        #419 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 170  321:bipush          -2
	//* 171  323:icmpeq          333
						i = 0x40000000;
	//  172  326:ldc2            #398 <Int 0x40000000>
	//  173  329:istore_1        
					else
	//* 174  330:goto            337
						i = 0x80000000;
	//  175  333:ldc2            #402 <Int 0x80000000>
	//  176  336:istore_1        
					int j1 = j;
	//  177  337:iload_2         
	//  178  338:istore          4
					if(((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
	//* 179  340:aload           11
	//* 180  342:getfield        #419 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 181  345:iflt            359
						j1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).width, j);
	//  182  348:aload           11
	//  183  350:getfield        #419 <Field int android.view.ViewGroup$LayoutParams.width>
	//  184  353:iload_2         
	//  185  354:invokestatic    #424 <Method int Math.min(int, int)>
	//  186  357:istore          4
					if(((android.view.ViewGroup.LayoutParams) (obj)).height != -2)
	//* 187  359:aload           11
	//* 188  361:getfield        #427 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 189  364:bipush          -2
	//* 190  366:icmpeq          375
						j = l1;
	//  191  369:iload           5
	//  192  371:istore_2        
					else
	//* 193  372:goto            379
						j = 0x80000000;
	//  194  375:ldc2            #402 <Int 0x80000000>
	//  195  378:istore_2        
					l1 = j2;
	//  196  379:iload           7
	//  197  381:istore          5
					if(((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
	//* 198  383:aload           11
	//* 199  385:getfield        #427 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 200  388:iflt            403
						l1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).height, j2);
	//  201  391:aload           11
	//  202  393:getfield        #427 <Field int android.view.ViewGroup$LayoutParams.height>
	//  203  396:iload           7
	//  204  398:invokestatic    #424 <Method int Math.min(int, int)>
	//  205  401:istore          5
					mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j1, i), android.view.View.MeasureSpec.makeMeasureSpec(l1, j));
	//  206  403:aload_0         
	//  207  404:getfield        #301 <Field View mCustomView>
	//  208  407:iload           4
	//  209  409:iload_1         
	//  210  410:invokestatic    #405 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  211  413:iload           5
	//  212  415:iload_2         
	//  213  416:invokestatic    #405 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  214  419:invokevirtual   #428 <Method void View.measure(int, int)>
				}
				if(mContentHeight <= 0)
	//* 215  422:aload_0         
	//* 216  423:getfield        #88  <Field int mContentHeight>
	//* 217  426:ifgt            487
				{
					int i2 = getChildCount();
	//  218  429:aload_0         
	//  219  430:invokevirtual   #126 <Method int getChildCount()>
	//  220  433:istore          5
					j = 0;
	//  221  435:iconst_0        
	//  222  436:istore_2        
					for(i = ((int) (flag)); i < i2;)
	//* 223  437:iload           6
	//* 224  439:istore_1        
	//* 225  440:iload_1         
	//* 226  441:iload           5
	//* 227  443:icmpge          479
					{
						int k1 = getChildAt(i).getMeasuredHeight() + l2;
	//  228  446:aload_0         
	//  229  447:iload_1         
	//  230  448:invokevirtual   #130 <Method View getChildAt(int)>
	//  231  451:invokevirtual   #431 <Method int View.getMeasuredHeight()>
	//  232  454:iload           9
	//  233  456:iadd            
	//  234  457:istore          4
						l = j;
	//  235  459:iload_2         
	//  236  460:istore_3        
						if(k1 > j)
	//* 237  461:iload           4
	//* 238  463:iload_2         
	//* 239  464:icmple          470
							l = k1;
	//  240  467:iload           4
	//  241  469:istore_3        
						i++;
	//  242  470:iload_1         
	//  243  471:iconst_1        
	//  244  472:iadd            
	//  245  473:istore_1        
						j = l;
	//  246  474:iload_3         
	//  247  475:istore_2        
					}

	//* 248  476:goto            440
					setMeasuredDimension(k2, j);
	//  249  479:aload_0         
	//  250  480:iload           8
	//  251  482:iload_2         
	//  252  483:invokevirtual   #434 <Method void setMeasuredDimension(int, int)>
					return;
	//  253  486:return          
				} else
				{
					setMeasuredDimension(k2, l);
	//  254  487:aload_0         
	//  255  488:iload           8
	//  256  490:iload_3         
	//  257  491:invokevirtual   #434 <Method void setMeasuredDimension(int, int)>
					return;
	//  258  494:return          
				}
			} else
			{
				StringBuilder stringbuilder = new StringBuilder();
	//  259  495:new             #436 <Class StringBuilder>
	//  260  498:dup             
	//  261  499:invokespecial   #438 <Method void StringBuilder()>
	//  262  502:astore          11
				stringbuilder.append(((Object)this).getClass().getSimpleName());
	//  263  504:aload           11
	//  264  506:aload_0         
	//  265  507:invokevirtual   #327 <Method Class Object.getClass()>
	//  266  510:invokevirtual   #441 <Method String Class.getSimpleName()>
	//  267  513:invokevirtual   #445 <Method StringBuilder StringBuilder.append(String)>
	//  268  516:pop             
				stringbuilder.append(" can only be used ");
	//  269  517:aload           11
	//  270  519:ldc2            #447 <String " can only be used ">
	//  271  522:invokevirtual   #445 <Method StringBuilder StringBuilder.append(String)>
	//  272  525:pop             
				stringbuilder.append("with android:layout_height=\"wrap_content\"");
	//  273  526:aload           11
	//  274  528:ldc2            #449 <String "with android:layout_height=\"wrap_content\"">
	//  275  531:invokevirtual   #445 <Method StringBuilder StringBuilder.append(String)>
	//  276  534:pop             
				throw new IllegalStateException(stringbuilder.toString());
	//  277  535:new             #451 <Class IllegalStateException>
	//  278  538:dup             
	//  279  539:aload           11
	//  280  541:invokevirtual   #454 <Method String StringBuilder.toString()>
	//  281  544:invokespecial   #457 <Method void IllegalStateException(String)>
	//  282  547:athrow          
			}
		} else
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//  283  548:new             #436 <Class StringBuilder>
	//  284  551:dup             
	//  285  552:invokespecial   #438 <Method void StringBuilder()>
	//  286  555:astore          11
			stringbuilder1.append(((Object)this).getClass().getSimpleName());
	//  287  557:aload           11
	//  288  559:aload_0         
	//  289  560:invokevirtual   #327 <Method Class Object.getClass()>
	//  290  563:invokevirtual   #441 <Method String Class.getSimpleName()>
	//  291  566:invokevirtual   #445 <Method StringBuilder StringBuilder.append(String)>
	//  292  569:pop             
			stringbuilder1.append(" can only be used ");
	//  293  570:aload           11
	//  294  572:ldc2            #447 <String " can only be used ">
	//  295  575:invokevirtual   #445 <Method StringBuilder StringBuilder.append(String)>
	//  296  578:pop             
			stringbuilder1.append("with android:layout_width=\"match_parent\" (or fill_parent)");
	//  297  579:aload           11
	//  298  581:ldc2            #459 <String "with android:layout_width=\"match_parent\" (or fill_parent)">
	//  299  584:invokevirtual   #445 <Method StringBuilder StringBuilder.append(String)>
	//  300  587:pop             
			throw new IllegalStateException(stringbuilder1.toString());
	//  301  588:new             #451 <Class IllegalStateException>
	//  302  591:dup             
	//  303  592:aload           11
	//  304  594:invokevirtual   #454 <Method String StringBuilder.toString()>
	//  305  597:invokespecial   #457 <Method void IllegalStateException(String)>
	//  306  600:athrow          
		}
	}

	public volatile boolean onTouchEvent(MotionEvent motionevent)
	{
		return super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #462 <Method boolean AbsActionBarView.onTouchEvent(MotionEvent)>
	//    3    5:ireturn         
	}

	public volatile void postShowOverflowMenu()
	{
		super.postShowOverflowMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #465 <Method void AbsActionBarView.postShowOverflowMenu()>
	//    2    4:return          
	}

	public void setContentHeight(int i)
	{
		mContentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #88  <Field int mContentHeight>
	//    3    5:return          
	}

	public void setCustomView(View view)
	{
		View view1 = mCustomView;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field View mCustomView>
	//    2    4:astore_2        
		if(view1 != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          14
			removeView(view1);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokevirtual   #470 <Method void removeView(View)>
		mCustomView = view;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #301 <Field View mCustomView>
		if(view != null)
	//*  11   19:aload_1         
	//*  12   20:ifnull          42
		{
			LinearLayout linearlayout = mTitleLayout;
	//   13   23:aload_0         
	//   14   24:getfield        #105 <Field LinearLayout mTitleLayout>
	//   15   27:astore_2        
			if(linearlayout != null)
	//*  16   28:aload_2         
	//*  17   29:ifnull          42
			{
				removeView(((View) (linearlayout)));
	//   18   32:aload_0         
	//   19   33:aload_2         
	//   20   34:invokevirtual   #470 <Method void removeView(View)>
				mTitleLayout = null;
	//   21   37:aload_0         
	//   22   38:aconst_null     
	//   23   39:putfield        #105 <Field LinearLayout mTitleLayout>
			}
		}
		if(view != null)
	//*  24   42:aload_1         
	//*  25   43:ifnull          51
			addView(view);
	//   26   46:aload_0         
	//   27   47:aload_1         
	//   28   48:invokevirtual   #180 <Method void addView(View)>
		requestLayout();
	//   29   51:aload_0         
	//   30   52:invokevirtual   #473 <Method void requestLayout()>
	//   31   55:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mSubtitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field CharSequence mSubtitle>
		initTitle();
	//    3    5:aload_0         
	//    4    6:invokespecial   #476 <Method void initTitle()>
	//    5    9:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #155 <Field CharSequence mTitle>
		initTitle();
	//    3    5:aload_0         
	//    4    6:invokespecial   #476 <Method void initTitle()>
	//    5    9:return          
	}

	public void setTitleOptional(boolean flag)
	{
		if(flag != mTitleOptional)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #296 <Field boolean mTitleOptional>
	//*   3    5:icmpeq          12
			requestLayout();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #473 <Method void requestLayout()>
		mTitleOptional = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #296 <Field boolean mTitleOptional>
	//    9   17:return          
	}

	public volatile void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #479 <Method void AbsActionBarView.setVisibility(int)>
	//    3    5:return          
	}

	public volatile au setupAnimatorToVisibility(int i, long l)
	{
		return super.setupAnimatorToVisibility(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #483 <Method au AbsActionBarView.setupAnimatorToVisibility(int, long)>
	//    4    6:areturn         
	}

	public boolean shouldDelayChildPressedState()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public boolean showOverflowMenu()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.showOverflowMenu();
	//    3    7:aload_0         
	//    4    8:getfield        #220 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #487 <Method boolean ActionMenuPresenter.showOverflowMenu()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	private static final String TAG = "ActionBarContextView";
	private View mClose;
	private int mCloseItemLayout;
	private View mCustomView;
	private CharSequence mSubtitle;
	private int mSubtitleStyleRes;
	private TextView mSubtitleView;
	private CharSequence mTitle;
	private LinearLayout mTitleLayout;
	private boolean mTitleOptional;
	private int mTitleStyleRes;
	private TextView mTitleView;

	private class _cls1
		implements android.view.View.OnClickListener
	{

		public void onClick(View view)
		{
			mode.finish();
		//    0    0:aload_0         
		//    1    1:getfield        #16  <Field ActionMode val$mode>
		//    2    4:invokevirtual   #27  <Method void ActionMode.finish()>
		//    3    7:return          
		}

		final ActionBarContextView this$0;
		final ActionMode val$mode;

		_cls1()
		{
			this$0 = ActionBarContextView.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #14  <Field ActionBarContextView this$0>
			mode = actionmode;
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:putfield        #16  <Field ActionMode val$mode>
			super();
		//    6   10:aload_0         
		//    7   11:invokespecial   #19  <Method void Object()>
		//    8   14:return          
		}
	}

}
