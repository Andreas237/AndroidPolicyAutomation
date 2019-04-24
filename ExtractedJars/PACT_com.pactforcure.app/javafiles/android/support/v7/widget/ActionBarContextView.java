// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.widget;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
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
	//    3    3:invokespecial   #36  <Method void ActionBarContextView(Context, AttributeSet)>
	//    4    6:return          
	}

	public ActionBarContextView(Context context, AttributeSet attributeset)
	{
		this(context, attributeset, android.support.v7.appcompat.R.attr.actionModeStyle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:getstatic       #42  <Field int android.support.v7.appcompat.R$attr.actionModeStyle>
	//    4    6:invokespecial   #45  <Method void ActionBarContextView(Context, AttributeSet, int)>
	//    5    9:return          
	}

	public ActionBarContextView(Context context, AttributeSet attributeset, int i)
	{
		super(context, attributeset, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:iload_3         
	//    4    4:invokespecial   #46  <Method void AbsActionBarView(Context, AttributeSet, int)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, attributeset, android.support.v7.appcompat.R.styleable.ActionMode, i, 0)));
	//    5    7:aload_1         
	//    6    8:aload_2         
	//    7    9:getstatic       #52  <Field int[] android.support.v7.appcompat.R$styleable.ActionMode>
	//    8   12:iload_3         
	//    9   13:iconst_0        
	//   10   14:invokestatic    #58  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, AttributeSet, int[], int, int)>
	//   11   17:astore_1        
		ViewCompat.setBackground(((View) (this)), ((TintTypedArray) (context)).getDrawable(android.support.v7.appcompat.R.styleable.ActionMode_background));
	//   12   18:aload_0         
	//   13   19:aload_1         
	//   14   20:getstatic       #61  <Field int android.support.v7.appcompat.R$styleable.ActionMode_background>
	//   15   23:invokevirtual   #65  <Method android.graphics.drawable.Drawable TintTypedArray.getDrawable(int)>
	//   16   26:invokestatic    #71  <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		mTitleStyleRes = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_titleTextStyle, 0);
	//   17   29:aload_0         
	//   18   30:aload_1         
	//   19   31:getstatic       #74  <Field int android.support.v7.appcompat.R$styleable.ActionMode_titleTextStyle>
	//   20   34:iconst_0        
	//   21   35:invokevirtual   #78  <Method int TintTypedArray.getResourceId(int, int)>
	//   22   38:putfield        #80  <Field int mTitleStyleRes>
		mSubtitleStyleRes = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_subtitleTextStyle, 0);
	//   23   41:aload_0         
	//   24   42:aload_1         
	//   25   43:getstatic       #83  <Field int android.support.v7.appcompat.R$styleable.ActionMode_subtitleTextStyle>
	//   26   46:iconst_0        
	//   27   47:invokevirtual   #78  <Method int TintTypedArray.getResourceId(int, int)>
	//   28   50:putfield        #85  <Field int mSubtitleStyleRes>
		mContentHeight = ((TintTypedArray) (context)).getLayoutDimension(android.support.v7.appcompat.R.styleable.ActionMode_height, 0);
	//   29   53:aload_0         
	//   30   54:aload_1         
	//   31   55:getstatic       #88  <Field int android.support.v7.appcompat.R$styleable.ActionMode_height>
	//   32   58:iconst_0        
	//   33   59:invokevirtual   #91  <Method int TintTypedArray.getLayoutDimension(int, int)>
	//   34   62:putfield        #94  <Field int mContentHeight>
		mCloseItemLayout = ((TintTypedArray) (context)).getResourceId(android.support.v7.appcompat.R.styleable.ActionMode_closeItemLayout, android.support.v7.appcompat.R.layout.abc_action_mode_close_item_material);
	//   35   65:aload_0         
	//   36   66:aload_1         
	//   37   67:getstatic       #97  <Field int android.support.v7.appcompat.R$styleable.ActionMode_closeItemLayout>
	//   38   70:getstatic       #102 <Field int android.support.v7.appcompat.R$layout.abc_action_mode_close_item_material>
	//   39   73:invokevirtual   #78  <Method int TintTypedArray.getResourceId(int, int)>
	//   40   76:putfield        #104 <Field int mCloseItemLayout>
		((TintTypedArray) (context)).recycle();
	//   41   79:aload_1         
	//   42   80:invokevirtual   #108 <Method void TintTypedArray.recycle()>
	//   43   83:return          
	}

	private void initTitle()
	{
label0:
		{
			byte byte1 = 8;
	//    0    0:bipush          8
	//    1    2:istore          4
			if(mTitleLayout == null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #111 <Field LinearLayout mTitleLayout>
	//*   4    8:ifnonnull       121
			{
				LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_title_item, ((android.view.ViewGroup) (this)));
	//    5   11:aload_0         
	//    6   12:invokevirtual   #115 <Method Context getContext()>
	//    7   15:invokestatic    #121 <Method LayoutInflater LayoutInflater.from(Context)>
	//    8   18:getstatic       #124 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_title_item>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #128 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   11   25:pop             
				mTitleLayout = (LinearLayout)getChildAt(getChildCount() - 1);
	//   12   26:aload_0         
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:invokevirtual   #132 <Method int getChildCount()>
	//   16   32:iconst_1        
	//   17   33:isub            
	//   18   34:invokevirtual   #136 <Method View getChildAt(int)>
	//   19   37:checkcast       #138 <Class LinearLayout>
	//   20   40:putfield        #111 <Field LinearLayout mTitleLayout>
				mTitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_title);
	//   21   43:aload_0         
	//   22   44:aload_0         
	//   23   45:getfield        #111 <Field LinearLayout mTitleLayout>
	//   24   48:getstatic       #143 <Field int android.support.v7.appcompat.R$id.action_bar_title>
	//   25   51:invokevirtual   #146 <Method View LinearLayout.findViewById(int)>
	//   26   54:checkcast       #148 <Class TextView>
	//   27   57:putfield        #150 <Field TextView mTitleView>
				mSubtitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_subtitle);
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #111 <Field LinearLayout mTitleLayout>
	//   31   65:getstatic       #153 <Field int android.support.v7.appcompat.R$id.action_bar_subtitle>
	//   32   68:invokevirtual   #146 <Method View LinearLayout.findViewById(int)>
	//   33   71:checkcast       #148 <Class TextView>
	//   34   74:putfield        #155 <Field TextView mSubtitleView>
				if(mTitleStyleRes != 0)
	//*  35   77:aload_0         
	//*  36   78:getfield        #80  <Field int mTitleStyleRes>
	//*  37   81:ifeq            99
					mTitleView.setTextAppearance(getContext(), mTitleStyleRes);
	//   38   84:aload_0         
	//   39   85:getfield        #150 <Field TextView mTitleView>
	//   40   88:aload_0         
	//   41   89:invokevirtual   #115 <Method Context getContext()>
	//   42   92:aload_0         
	//   43   93:getfield        #80  <Field int mTitleStyleRes>
	//   44   96:invokevirtual   #159 <Method void TextView.setTextAppearance(Context, int)>
				if(mSubtitleStyleRes != 0)
	//*  45   99:aload_0         
	//*  46  100:getfield        #85  <Field int mSubtitleStyleRes>
	//*  47  103:ifeq            121
					mSubtitleView.setTextAppearance(getContext(), mSubtitleStyleRes);
	//   48  106:aload_0         
	//   49  107:getfield        #155 <Field TextView mSubtitleView>
	//   50  110:aload_0         
	//   51  111:invokevirtual   #115 <Method Context getContext()>
	//   52  114:aload_0         
	//   53  115:getfield        #85  <Field int mSubtitleStyleRes>
	//   54  118:invokevirtual   #159 <Method void TextView.setTextAppearance(Context, int)>
			}
			mTitleView.setText(mTitle);
	//   55  121:aload_0         
	//   56  122:getfield        #150 <Field TextView mTitleView>
	//   57  125:aload_0         
	//   58  126:getfield        #161 <Field CharSequence mTitle>
	//   59  129:invokevirtual   #165 <Method void TextView.setText(CharSequence)>
			mSubtitleView.setText(mSubtitle);
	//   60  132:aload_0         
	//   61  133:getfield        #155 <Field TextView mSubtitleView>
	//   62  136:aload_0         
	//   63  137:getfield        #167 <Field CharSequence mSubtitle>
	//   64  140:invokevirtual   #165 <Method void TextView.setText(CharSequence)>
			byte byte0;
			boolean flag;
			int i;
			Object obj;
			if(!TextUtils.isEmpty(mTitle))
	//*  65  143:aload_0         
	//*  66  144:getfield        #161 <Field CharSequence mTitle>
	//*  67  147:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  68  150:ifne            229
				byte0 = 1;
	//   69  153:iconst_1        
	//   70  154:istore_1        
			else
	//*  71  155:aload_0         
	//*  72  156:getfield        #167 <Field CharSequence mSubtitle>
	//*  73  159:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  74  162:ifne            234
	//*  75  165:iconst_1        
	//*  76  166:istore_2        
	//*  77  167:aload_0         
	//*  78  168:getfield        #155 <Field TextView mSubtitleView>
	//*  79  171:astore          5
	//*  80  173:iload_2         
	//*  81  174:ifeq            239
	//*  82  177:iconst_0        
	//*  83  178:istore_3        
	//*  84  179:aload           5
	//*  85  181:iload_3         
	//*  86  182:invokevirtual   #177 <Method void TextView.setVisibility(int)>
	//*  87  185:aload_0         
	//*  88  186:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  89  189:astore          5
	//*  90  191:iload_1         
	//*  91  192:ifne            202
	//*  92  195:iload           4
	//*  93  197:istore_1        
	//*  94  198:iload_2         
	//*  95  199:ifeq            204
	//*  96  202:iconst_0        
	//*  97  203:istore_1        
	//*  98  204:aload           5
	//*  99  206:iload_1         
	//* 100  207:invokevirtual   #178 <Method void LinearLayout.setVisibility(int)>
	//* 101  210:aload_0         
	//* 102  211:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 103  214:invokevirtual   #182 <Method android.view.ViewParent LinearLayout.getParent()>
	//* 104  217:ifnonnull       228
	//* 105  220:aload_0         
	//* 106  221:aload_0         
	//* 107  222:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 108  225:invokevirtual   #186 <Method void addView(View)>
	//* 109  228:return          
				byte0 = 0;
	//  110  229:iconst_0        
	//  111  230:istore_1        
			if(!TextUtils.isEmpty(mSubtitle))
				flag = true;
			else
	//* 112  231:goto            155
				flag = false;
	//  113  234:iconst_0        
	//  114  235:istore_2        
			obj = ((Object) (mSubtitleView));
			if(flag)
				i = 0;
			else
	//* 115  236:goto            167
				i = 8;
	//  116  239:bipush          8
	//  117  241:istore_3        
			((TextView) (obj)).setVisibility(i);
			obj = ((Object) (mTitleLayout));
			if(byte0 == 0)
			{
				byte0 = byte1;
				if(!flag)
					break label0;
			}
			byte0 = 0;
		}
		((LinearLayout) (obj)).setVisibility(((int) (byte0)));
		if(mTitleLayout.getParent() == null)
			addView(((View) (mTitleLayout)));
	//* 118  242:goto            179
	}

	public volatile void animateToVisibility(int i)
	{
		super.animateToVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #189 <Method void AbsActionBarView.animateToVisibility(int)>
	//    3    5:return          
	}

	public volatile boolean canShowOverflowMenu()
	{
		return super.canShowOverflowMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #193 <Method boolean AbsActionBarView.canShowOverflowMenu()>
	//    2    4:ireturn         
	}

	public void closeMode()
	{
		if(mClose == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field View mClose>
	//*   2    4:ifnonnull       11
			killMode();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #199 <Method void killMode()>
	//    5   11:return          
	}

	public volatile void dismissPopupMenus()
	{
		super.dismissPopupMenus();
	//    0    0:aload_0         
	//    1    1:invokespecial   #202 <Method void AbsActionBarView.dismissPopupMenus()>
	//    2    4:return          
	}

	protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
	{
		return ((android.view.ViewGroup.LayoutParams) (new android.view.ViewGroup.MarginLayoutParams(-1, -2)));
	//    0    0:new             #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//    1    3:dup             
	//    2    4:iconst_m1       
	//    3    5:bipush          -2
	//    4    7:invokespecial   #209 <Method void android.view.ViewGroup$MarginLayoutParams(int, int)>
	//    5   10:areturn         
	}

	public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
	{
		return ((android.view.ViewGroup.LayoutParams) (new android.view.ViewGroup.MarginLayoutParams(getContext(), attributeset)));
	//    0    0:new             #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokevirtual   #115 <Method Context getContext()>
	//    4    8:aload_1         
	//    5    9:invokespecial   #212 <Method void android.view.ViewGroup$MarginLayoutParams(Context, AttributeSet)>
	//    6   12:areturn         
	}

	public volatile int getAnimatedVisibility()
	{
		return super.getAnimatedVisibility();
	//    0    0:aload_0         
	//    1    1:invokespecial   #215 <Method int AbsActionBarView.getAnimatedVisibility()>
	//    2    4:ireturn         
	}

	public volatile int getContentHeight()
	{
		return super.getContentHeight();
	//    0    0:aload_0         
	//    1    1:invokespecial   #218 <Method int AbsActionBarView.getContentHeight()>
	//    2    4:ireturn         
	}

	public CharSequence getSubtitle()
	{
		return mSubtitle;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field CharSequence mSubtitle>
	//    2    4:areturn         
	}

	public CharSequence getTitle()
	{
		return mTitle;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field CharSequence mTitle>
	//    2    4:areturn         
	}

	public boolean hideOverflowMenu()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.hideOverflowMenu();
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #230 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//    6   14:ireturn         
		else
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
	}

	public void initForMode(final ActionMode mode)
	{
		if(mClose != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #196 <Field View mClose>
	//    2    4:ifnonnull       159
_L1:
		mClose = LayoutInflater.from(getContext()).inflate(mCloseItemLayout, ((android.view.ViewGroup) (this)), false);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokevirtual   #115 <Method Context getContext()>
	//    6   12:invokestatic    #121 <Method LayoutInflater LayoutInflater.from(Context)>
	//    7   15:aload_0         
	//    8   16:getfield        #104 <Field int mCloseItemLayout>
	//    9   19:aload_0         
	//   10   20:iconst_0        
	//   11   21:invokevirtual   #235 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//   12   24:putfield        #196 <Field View mClose>
		addView(mClose);
	//   13   27:aload_0         
	//   14   28:aload_0         
	//   15   29:getfield        #196 <Field View mClose>
	//   16   32:invokevirtual   #186 <Method void addView(View)>
_L4:
		mClose.findViewById(android.support.v7.appcompat.R.id.action_mode_close_button).setOnClickListener(new android.view.View.OnClickListener() {

			public void onClick(View view)
			{
				mode.finish();
			//    0    0:aload_0         
			//    1    1:getfield        #21  <Field ActionMode val$mode>
			//    2    4:invokevirtual   #32  <Method void ActionMode.finish()>
			//    3    7:return          
			}

			final ActionBarContextView this$0;
			final ActionMode val$mode;

			
			{
				this$0 = ActionBarContextView.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #19  <Field ActionBarContextView this$0>
				mode = actionmode;
			//    3    5:aload_0         
			//    4    6:aload_2         
			//    5    7:putfield        #21  <Field ActionMode val$mode>
				super();
			//    6   10:aload_0         
			//    7   11:invokespecial   #24  <Method void Object()>
			//    8   14:return          
			}
		}
);
	//   17   35:aload_0         
	//   18   36:getfield        #196 <Field View mClose>
	//   19   39:getstatic       #238 <Field int android.support.v7.appcompat.R$id.action_mode_close_button>
	//   20   42:invokevirtual   #241 <Method View View.findViewById(int)>
	//   21   45:new             #6   <Class ActionBarContextView$1>
	//   22   48:dup             
	//   23   49:aload_0         
	//   24   50:aload_1         
	//   25   51:invokespecial   #244 <Method void ActionBarContextView$1(ActionBarContextView, ActionMode)>
	//   26   54:invokevirtual   #248 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		mode = ((ActionMode) ((MenuBuilder)mode.getMenu()));
	//   27   57:aload_1         
	//   28   58:invokevirtual   #254 <Method android.view.Menu ActionMode.getMenu()>
	//   29   61:checkcast       #256 <Class MenuBuilder>
	//   30   64:astore_1        
		if(mActionMenuPresenter != null)
	//*  31   65:aload_0         
	//*  32   66:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//*  33   69:ifnull          80
			mActionMenuPresenter.dismissPopupMenus();
	//   34   72:aload_0         
	//   35   73:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   36   76:invokevirtual   #258 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
	//   37   79:pop             
		mActionMenuPresenter = new ActionMenuPresenter(getContext());
	//   38   80:aload_0         
	//   39   81:new             #228 <Class ActionMenuPresenter>
	//   40   84:dup             
	//   41   85:aload_0         
	//   42   86:invokevirtual   #115 <Method Context getContext()>
	//   43   89:invokespecial   #260 <Method void ActionMenuPresenter(Context)>
	//   44   92:putfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
		mActionMenuPresenter.setReserveOverflow(true);
	//   45   95:aload_0         
	//   46   96:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   47   99:iconst_1        
	//   48  100:invokevirtual   #264 <Method void ActionMenuPresenter.setReserveOverflow(boolean)>
		android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
	//   49  103:new             #266 <Class android.view.ViewGroup$LayoutParams>
	//   50  106:dup             
	//   51  107:bipush          -2
	//   52  109:iconst_m1       
	//   53  110:invokespecial   #267 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   54  113:astore_2        
		((MenuBuilder) (mode)).addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mActionMenuPresenter)), mPopupContext);
	//   55  114:aload_1         
	//   56  115:aload_0         
	//   57  116:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   58  119:aload_0         
	//   59  120:getfield        #271 <Field Context mPopupContext>
	//   60  123:invokevirtual   #275 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter, Context)>
		mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(((android.view.ViewGroup) (this)));
	//   61  126:aload_0         
	//   62  127:aload_0         
	//   63  128:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   64  131:aload_0         
	//   65  132:invokevirtual   #279 <Method android.support.v7.view.menu.MenuView ActionMenuPresenter.getMenuView(android.view.ViewGroup)>
	//   66  135:checkcast       #281 <Class ActionMenuView>
	//   67  138:putfield        #285 <Field ActionMenuView mMenuView>
		ViewCompat.setBackground(((View) (mMenuView)), ((android.graphics.drawable.Drawable) (null)));
	//   68  141:aload_0         
	//   69  142:getfield        #285 <Field ActionMenuView mMenuView>
	//   70  145:aconst_null     
	//   71  146:invokestatic    #71  <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		addView(((View) (mMenuView)), layoutparams);
	//   72  149:aload_0         
	//   73  150:aload_0         
	//   74  151:getfield        #285 <Field ActionMenuView mMenuView>
	//   75  154:aload_2         
	//   76  155:invokevirtual   #288 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
		return;
	//   77  158:return          
_L2:
		if(mClose.getParent() == null)
	//*  78  159:aload_0         
	//*  79  160:getfield        #196 <Field View mClose>
	//*  80  163:invokevirtual   #289 <Method android.view.ViewParent View.getParent()>
	//*  81  166:ifnonnull       35
			addView(mClose);
	//   82  169:aload_0         
	//   83  170:aload_0         
	//   84  171:getfield        #196 <Field View mClose>
	//   85  174:invokevirtual   #186 <Method void addView(View)>
		if(true) goto _L4; else goto _L3
	//   86  177:goto            35
_L3:
	}

	public volatile boolean isOverflowMenuShowPending()
	{
		return super.isOverflowMenuShowPending();
	//    0    0:aload_0         
	//    1    1:invokespecial   #292 <Method boolean AbsActionBarView.isOverflowMenuShowPending()>
	//    2    4:ireturn         
	}

	public boolean isOverflowMenuShowing()
	{
		if(mActionMenuPresenter != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.isOverflowMenuShowing();
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #295 <Method boolean ActionMenuPresenter.isOverflowMenuShowing()>
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
	//    1    1:invokespecial   #298 <Method boolean AbsActionBarView.isOverflowReserved()>
	//    2    4:ireturn         
	}

	public boolean isTitleOptional()
	{
		return mTitleOptional;
	//    0    0:aload_0         
	//    1    1:getfield        #301 <Field boolean mTitleOptional>
	//    2    4:ireturn         
	}

	public void killMode()
	{
		removeAllViews();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #304 <Method void removeAllViews()>
		mCustomView = null;
	//    2    4:aload_0         
	//    3    5:aconst_null     
	//    4    6:putfield        #306 <Field View mCustomView>
		mMenuView = null;
	//    5    9:aload_0         
	//    6   10:aconst_null     
	//    7   11:putfield        #285 <Field ActionMenuView mMenuView>
	//    8   14:return          
	}

	public void onDetachedFromWindow()
	{
		super.onDetachedFromWindow();
	//    0    0:aload_0         
	//    1    1:invokespecial   #309 <Method void AbsActionBarView.onDetachedFromWindow()>
		if(mActionMenuPresenter != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   4    8:ifnull          27
		{
			mActionMenuPresenter.hideOverflowMenu();
	//    5   11:aload_0         
	//    6   12:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//    7   15:invokevirtual   #230 <Method boolean ActionMenuPresenter.hideOverflowMenu()>
	//    8   18:pop             
			mActionMenuPresenter.hideSubMenus();
	//    9   19:aload_0         
	//   10   20:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   11   23:invokevirtual   #312 <Method boolean ActionMenuPresenter.hideSubMenus()>
	//   12   26:pop             
		}
	//   13   27:return          
	}

	public volatile boolean onHoverEvent(MotionEvent motionevent)
	{
		return super.onHoverEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #316 <Method boolean AbsActionBarView.onHoverEvent(MotionEvent)>
	//    3    5:ireturn         
	}

	public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
	{
		if(accessibilityevent.getEventType() == 32)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #323 <Method int AccessibilityEvent.getEventType()>
	//*   2    4:bipush          32
	//*   3    6:icmpne          45
		{
			accessibilityevent.setSource(((View) (this)));
	//    4    9:aload_1         
	//    5   10:aload_0         
	//    6   11:invokevirtual   #326 <Method void AccessibilityEvent.setSource(View)>
			accessibilityevent.setClassName(((CharSequence) (((Object)this).getClass().getName())));
	//    7   14:aload_1         
	//    8   15:aload_0         
	//    9   16:invokevirtual   #332 <Method Class Object.getClass()>
	//   10   19:invokevirtual   #338 <Method String Class.getName()>
	//   11   22:invokevirtual   #341 <Method void AccessibilityEvent.setClassName(CharSequence)>
			accessibilityevent.setPackageName(((CharSequence) (getContext().getPackageName())));
	//   12   25:aload_1         
	//   13   26:aload_0         
	//   14   27:invokevirtual   #115 <Method Context getContext()>
	//   15   30:invokevirtual   #346 <Method String Context.getPackageName()>
	//   16   33:invokevirtual   #349 <Method void AccessibilityEvent.setPackageName(CharSequence)>
			accessibilityevent.setContentDescription(mTitle);
	//   17   36:aload_1         
	//   18   37:aload_0         
	//   19   38:getfield        #161 <Field CharSequence mTitle>
	//   20   41:invokevirtual   #352 <Method void AccessibilityEvent.setContentDescription(CharSequence)>
			return;
	//   21   44:return          
		} else
		{
			super.onInitializeAccessibilityEvent(accessibilityevent);
	//   22   45:aload_0         
	//   23   46:aload_1         
	//   24   47:invokespecial   #354 <Method void AbsActionBarView.onInitializeAccessibilityEvent(AccessibilityEvent)>
			return;
	//   25   50:return          
		}
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		flag = ViewUtils.isLayoutRtl(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #362 <Method boolean ViewUtils.isLayoutRtl(View)>
	//    2    4:istore_1        
		int i1;
		int j1;
		int k1;
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            249
			i1 = k - i - getPaddingRight();
	//    5    9:iload           4
	//    6   11:iload_2         
	//    7   12:isub            
	//    8   13:aload_0         
	//    9   14:invokevirtual   #365 <Method int getPaddingRight()>
	//   10   17:isub            
	//   11   18:istore          6
		else
	//*  12   20:aload_0         
	//*  13   21:invokevirtual   #368 <Method int getPaddingTop()>
	//*  14   24:istore          7
	//*  15   26:iload           5
	//*  16   28:iload_3         
	//*  17   29:isub            
	//*  18   30:aload_0         
	//*  19   31:invokevirtual   #368 <Method int getPaddingTop()>
	//*  20   34:isub            
	//*  21   35:aload_0         
	//*  22   36:invokevirtual   #371 <Method int getPaddingBottom()>
	//*  23   39:isub            
	//*  24   40:istore          8
	//*  25   42:iload           6
	//*  26   44:istore_3        
	//*  27   45:aload_0         
	//*  28   46:getfield        #196 <Field View mClose>
	//*  29   49:ifnull          131
	//*  30   52:iload           6
	//*  31   54:istore_3        
	//*  32   55:aload_0         
	//*  33   56:getfield        #196 <Field View mClose>
	//*  34   59:invokevirtual   #374 <Method int View.getVisibility()>
	//*  35   62:bipush          8
	//*  36   64:icmpeq          131
	//*  37   67:aload_0         
	//*  38   68:getfield        #196 <Field View mClose>
	//*  39   71:invokevirtual   #377 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  40   74:checkcast       #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  41   77:astore          9
	//*  42   79:iload_1         
	//*  43   80:ifeq            258
	//*  44   83:aload           9
	//*  45   85:getfield        #380 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//*  46   88:istore_3        
	//*  47   89:iload_1         
	//*  48   90:ifeq            267
	//*  49   93:aload           9
	//*  50   95:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//*  51   98:istore          5
	//*  52  100:iload           6
	//*  53  102:iload_3         
	//*  54  103:iload_1         
	//*  55  104:invokestatic    #387 <Method int next(int, int, boolean)>
	//*  56  107:istore_3        
	//*  57  108:iload_3         
	//*  58  109:aload_0         
	//*  59  110:aload_0         
	//*  60  111:getfield        #196 <Field View mClose>
	//*  61  114:iload_3         
	//*  62  115:iload           7
	//*  63  117:iload           8
	//*  64  119:iload_1         
	//*  65  120:invokevirtual   #391 <Method int positionChild(View, int, int, int, boolean)>
	//*  66  123:iadd            
	//*  67  124:iload           5
	//*  68  126:iload_1         
	//*  69  127:invokestatic    #387 <Method int next(int, int, boolean)>
	//*  70  130:istore_3        
	//*  71  131:iload_3         
	//*  72  132:istore          5
	//*  73  134:aload_0         
	//*  74  135:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  75  138:ifnull          184
	//*  76  141:iload_3         
	//*  77  142:istore          5
	//*  78  144:aload_0         
	//*  79  145:getfield        #306 <Field View mCustomView>
	//*  80  148:ifnonnull       184
	//*  81  151:iload_3         
	//*  82  152:istore          5
	//*  83  154:aload_0         
	//*  84  155:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  85  158:invokevirtual   #392 <Method int LinearLayout.getVisibility()>
	//*  86  161:bipush          8
	//*  87  163:icmpeq          184
	//*  88  166:iload_3         
	//*  89  167:aload_0         
	//*  90  168:aload_0         
	//*  91  169:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  92  172:iload_3         
	//*  93  173:iload           7
	//*  94  175:iload           8
	//*  95  177:iload_1         
	//*  96  178:invokevirtual   #391 <Method int positionChild(View, int, int, int, boolean)>
	//*  97  181:iadd            
	//*  98  182:istore          5
	//*  99  184:aload_0         
	//* 100  185:getfield        #306 <Field View mCustomView>
	//* 101  188:ifnull          207
	//* 102  191:aload_0         
	//* 103  192:aload_0         
	//* 104  193:getfield        #306 <Field View mCustomView>
	//* 105  196:iload           5
	//* 106  198:iload           7
	//* 107  200:iload           8
	//* 108  202:iload_1         
	//* 109  203:invokevirtual   #391 <Method int positionChild(View, int, int, int, boolean)>
	//* 110  206:pop             
	//* 111  207:iload_1         
	//* 112  208:ifeq            277
	//* 113  211:aload_0         
	//* 114  212:invokevirtual   #395 <Method int getPaddingLeft()>
	//* 115  215:istore_2        
	//* 116  216:aload_0         
	//* 117  217:getfield        #285 <Field ActionMenuView mMenuView>
	//* 118  220:ifnull          248
	//* 119  223:aload_0         
	//* 120  224:getfield        #285 <Field ActionMenuView mMenuView>
	//* 121  227:astore          9
	//* 122  229:iload_1         
	//* 123  230:ifne            290
	//* 124  233:iconst_1        
	//* 125  234:istore_1        
	//* 126  235:aload_0         
	//* 127  236:aload           9
	//* 128  238:iload_2         
	//* 129  239:iload           7
	//* 130  241:iload           8
	//* 131  243:iload_1         
	//* 132  244:invokevirtual   #391 <Method int positionChild(View, int, int, int, boolean)>
	//* 133  247:pop             
	//* 134  248:return          
			i1 = getPaddingLeft();
	//  135  249:aload_0         
	//  136  250:invokevirtual   #395 <Method int getPaddingLeft()>
	//  137  253:istore          6
		j1 = getPaddingTop();
		k1 = l - j - getPaddingTop() - getPaddingBottom();
		j = i1;
		if(mClose != null)
		{
			j = i1;
			if(mClose.getVisibility() != 8)
			{
				Object obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()));
				if(flag)
					j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
				else
	//* 138  255:goto            20
					j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
	//  139  258:aload           9
	//  140  260:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//  141  263:istore_3        
				if(flag)
					l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
				else
	//* 142  264:goto            89
					l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
	//  143  267:aload           9
	//  144  269:getfield        #380 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//  145  272:istore          5
				j = next(i1, j, flag);
				j = next(j + positionChild(mClose, j, j1, k1, flag), l, flag);
			}
		}
		l = j;
		if(mTitleLayout != null)
		{
			l = j;
			if(mCustomView == null)
			{
				l = j;
				if(mTitleLayout.getVisibility() != 8)
					l = j + positionChild(((View) (mTitleLayout)), j, j1, k1, flag);
			}
		}
		if(mCustomView != null)
			positionChild(mCustomView, l, j1, k1, flag);
		if(flag)
			i = getPaddingLeft();
		else
	//* 146  274:goto            100
			i = k - i - getPaddingRight();
	//  147  277:iload           4
	//  148  279:iload_2         
	//  149  280:isub            
	//  150  281:aload_0         
	//  151  282:invokevirtual   #365 <Method int getPaddingRight()>
	//  152  285:isub            
	//  153  286:istore_2        
		if(mMenuView != null)
		{
			obj = ((Object) (mMenuView));
			if(!flag)
				flag = true;
			else
	//* 154  287:goto            216
				flag = false;
	//  155  290:iconst_0        
	//  156  291:istore_1        
			positionChild(((View) (obj)), i, j1, k1, flag);
		}
	//* 157  292:goto            235
	}

	protected void onMeasure(int i, int j)
	{
		if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #402 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   2    4:ldc2            #403 <Int 0x40000000>
	//*   3    7:icmpeq          50
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"match_parent\" (or fill_parent)").toString());
	//    4   10:new             #405 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:new             #407 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #409 <Method void StringBuilder()>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #332 <Method Class Object.getClass()>
	//   11   25:invokevirtual   #412 <Method String Class.getSimpleName()>
	//   12   28:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc2            #418 <String " can only be used ">
	//   14   34:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:ldc2            #420 <String "with android:layout_width=\"match_parent\" (or fill_parent)">
	//   16   40:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   17   43:invokevirtual   #423 <Method String StringBuilder.toString()>
	//   18   46:invokespecial   #426 <Method void IllegalStateException(String)>
	//   19   49:athrow          
		if(android.view.View.MeasureSpec.getMode(j) == 0)
	//*  20   50:iload_2         
	//*  21   51:invokestatic    #402 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  22   54:ifne            97
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
	//   23   57:new             #405 <Class IllegalStateException>
	//   24   60:dup             
	//   25   61:new             #407 <Class StringBuilder>
	//   26   64:dup             
	//   27   65:invokespecial   #409 <Method void StringBuilder()>
	//   28   68:aload_0         
	//   29   69:invokevirtual   #332 <Method Class Object.getClass()>
	//   30   72:invokevirtual   #412 <Method String Class.getSimpleName()>
	//   31   75:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   32   78:ldc2            #418 <String " can only be used ">
	//   33   81:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   34   84:ldc2            #428 <String "with android:layout_height=\"wrap_content\"">
	//   35   87:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   36   90:invokevirtual   #423 <Method String StringBuilder.toString()>
	//   37   93:invokespecial   #426 <Method void IllegalStateException(String)>
	//   38   96:athrow          
		int j1 = android.view.View.MeasureSpec.getSize(i);
	//   39   97:iload_1         
	//   40   98:invokestatic    #431 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   41  101:istore          6
		int k;
		int l;
		int i1;
		int k1;
		if(mContentHeight > 0)
	//*  42  103:aload_0         
	//*  43  104:getfield        #94  <Field int mContentHeight>
	//*  44  107:ifle            486
			k = mContentHeight;
	//   45  110:aload_0         
	//   46  111:getfield        #94  <Field int mContentHeight>
	//   47  114:istore_3        
		else
	//*  48  115:aload_0         
	//*  49  116:invokevirtual   #368 <Method int getPaddingTop()>
	//*  50  119:aload_0         
	//*  51  120:invokevirtual   #371 <Method int getPaddingBottom()>
	//*  52  123:iadd            
	//*  53  124:istore          7
	//*  54  126:iload           6
	//*  55  128:aload_0         
	//*  56  129:invokevirtual   #395 <Method int getPaddingLeft()>
	//*  57  132:isub            
	//*  58  133:aload_0         
	//*  59  134:invokevirtual   #365 <Method int getPaddingRight()>
	//*  60  137:isub            
	//*  61  138:istore_1        
	//*  62  139:iload_3         
	//*  63  140:iload           7
	//*  64  142:isub            
	//*  65  143:istore          5
	//*  66  145:iload           5
	//*  67  147:ldc2            #432 <Int 0x80000000>
	//*  68  150:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  69  153:istore          4
	//*  70  155:iload_1         
	//*  71  156:istore_2        
	//*  72  157:aload_0         
	//*  73  158:getfield        #196 <Field View mClose>
	//*  74  161:ifnull          203
	//*  75  164:aload_0         
	//*  76  165:aload_0         
	//*  77  166:getfield        #196 <Field View mClose>
	//*  78  169:iload_1         
	//*  79  170:iload           4
	//*  80  172:iconst_0        
	//*  81  173:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//*  82  176:istore_1        
	//*  83  177:aload_0         
	//*  84  178:getfield        #196 <Field View mClose>
	//*  85  181:invokevirtual   #377 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  86  184:checkcast       #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  87  187:astore          9
	//*  88  189:iload_1         
	//*  89  190:aload           9
	//*  90  192:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//*  91  195:aload           9
	//*  92  197:getfield        #380 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//*  93  200:iadd            
	//*  94  201:isub            
	//*  95  202:istore_2        
	//*  96  203:iload_2         
	//*  97  204:istore_1        
	//*  98  205:aload_0         
	//*  99  206:getfield        #285 <Field ActionMenuView mMenuView>
	//* 100  209:ifnull          238
	//* 101  212:iload_2         
	//* 102  213:istore_1        
	//* 103  214:aload_0         
	//* 104  215:getfield        #285 <Field ActionMenuView mMenuView>
	//* 105  218:invokevirtual   #440 <Method android.view.ViewParent ActionMenuView.getParent()>
	//* 106  221:aload_0         
	//* 107  222:if_acmpne       238
	//* 108  225:aload_0         
	//* 109  226:aload_0         
	//* 110  227:getfield        #285 <Field ActionMenuView mMenuView>
	//* 111  230:iload_2         
	//* 112  231:iload           4
	//* 113  233:iconst_0        
	//* 114  234:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//* 115  237:istore_1        
	//* 116  238:iload_1         
	//* 117  239:istore_2        
	//* 118  240:aload_0         
	//* 119  241:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 120  244:ifnull          328
	//* 121  247:iload_1         
	//* 122  248:istore_2        
	//* 123  249:aload_0         
	//* 124  250:getfield        #306 <Field View mCustomView>
	//* 125  253:ifnonnull       328
	//* 126  256:aload_0         
	//* 127  257:getfield        #301 <Field boolean mTitleOptional>
	//* 128  260:ifeq            506
	//* 129  263:iconst_0        
	//* 130  264:iconst_0        
	//* 131  265:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 132  268:istore_2        
	//* 133  269:aload_0         
	//* 134  270:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 135  273:iload_2         
	//* 136  274:iload           4
	//* 137  276:invokevirtual   #443 <Method void LinearLayout.measure(int, int)>
	//* 138  279:aload_0         
	//* 139  280:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 140  283:invokevirtual   #446 <Method int LinearLayout.getMeasuredWidth()>
	//* 141  286:istore          8
	//* 142  288:iload           8
	//* 143  290:iload_1         
	//* 144  291:icmpgt          494
	//* 145  294:iconst_1        
	//* 146  295:istore          4
	//* 147  297:iload_1         
	//* 148  298:istore_2        
	//* 149  299:iload           4
	//* 150  301:ifeq            309
	//* 151  304:iload_1         
	//* 152  305:iload           8
	//* 153  307:isub            
	//* 154  308:istore_2        
	//* 155  309:aload_0         
	//* 156  310:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 157  313:astore          9
	//* 158  315:iload           4
	//* 159  317:ifeq            500
	//* 160  320:iconst_0        
	//* 161  321:istore_1        
	//* 162  322:aload           9
	//* 163  324:iload_1         
	//* 164  325:invokevirtual   #178 <Method void LinearLayout.setVisibility(int)>
	//* 165  328:aload_0         
	//* 166  329:getfield        #306 <Field View mCustomView>
	//* 167  332:ifnull          430
	//* 168  335:aload_0         
	//* 169  336:getfield        #306 <Field View mCustomView>
	//* 170  339:invokevirtual   #377 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 171  342:astore          9
	//* 172  344:aload           9
	//* 173  346:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 174  349:bipush          -2
	//* 175  351:icmpeq          522
	//* 176  354:ldc2            #403 <Int 0x40000000>
	//* 177  357:istore_1        
	//* 178  358:aload           9
	//* 179  360:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 180  363:iflt            529
	//* 181  366:aload           9
	//* 182  368:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 183  371:iload_2         
	//* 184  372:invokestatic    #454 <Method int Math.min(int, int)>
	//* 185  375:istore_2        
	//* 186  376:aload           9
	//* 187  378:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 188  381:bipush          -2
	//* 189  383:icmpeq          532
	//* 190  386:ldc2            #403 <Int 0x40000000>
	//* 191  389:istore          4
	//* 192  391:aload           9
	//* 193  393:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 194  396:iflt            540
	//* 195  399:aload           9
	//* 196  401:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 197  404:iload           5
	//* 198  406:invokestatic    #454 <Method int Math.min(int, int)>
	//* 199  409:istore          5
	//* 200  411:aload_0         
	//* 201  412:getfield        #306 <Field View mCustomView>
	//* 202  415:iload_2         
	//* 203  416:iload_1         
	//* 204  417:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 205  420:iload           5
	//* 206  422:iload           4
	//* 207  424:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 208  427:invokevirtual   #458 <Method void View.measure(int, int)>
	//* 209  430:aload_0         
	//* 210  431:getfield        #94  <Field int mContentHeight>
	//* 211  434:ifgt            551
	//* 212  437:iconst_0        
	//* 213  438:istore_2        
	//* 214  439:aload_0         
	//* 215  440:invokevirtual   #132 <Method int getChildCount()>
	//* 216  443:istore          5
	//* 217  445:iconst_0        
	//* 218  446:istore_1        
	//* 219  447:iload_1         
	//* 220  448:iload           5
	//* 221  450:icmpge          543
	//* 222  453:aload_0         
	//* 223  454:iload_1         
	//* 224  455:invokevirtual   #136 <Method View getChildAt(int)>
	//* 225  458:invokevirtual   #461 <Method int View.getMeasuredHeight()>
	//* 226  461:iload           7
	//* 227  463:iadd            
	//* 228  464:istore          4
	//* 229  466:iload_2         
	//* 230  467:istore_3        
	//* 231  468:iload           4
	//* 232  470:iload_2         
	//* 233  471:icmple          477
	//* 234  474:iload           4
	//* 235  476:istore_3        
	//* 236  477:iload_1         
	//* 237  478:iconst_1        
	//* 238  479:iadd            
	//* 239  480:istore_1        
	//* 240  481:iload_3         
	//* 241  482:istore_2        
	//* 242  483:goto            447
			k = android.view.View.MeasureSpec.getSize(j);
	//  243  486:iload_2         
	//  244  487:invokestatic    #431 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  245  490:istore_3        
		k1 = getPaddingTop() + getPaddingBottom();
		i = j1 - getPaddingLeft() - getPaddingRight();
		i1 = k - k1;
		l = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
		j = i;
		if(mClose != null)
		{
			i = measureChildView(mClose, i, l, 0);
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
			j = i - (marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
		}
		i = j;
		if(mMenuView != null)
		{
			i = j;
			if(mMenuView.getParent() == this)
				i = measureChildView(((View) (mMenuView)), j, l, 0);
		}
		j = i;
		if(mTitleLayout != null)
		{
			j = i;
			if(mCustomView == null)
				if(mTitleOptional)
				{
					j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
					mTitleLayout.measure(j, l);
					int l1 = mTitleLayout.getMeasuredWidth();
					Object obj;
					if(l1 <= i)
						l = 1;
					else
	//* 246  491:goto            115
						l = 0;
	//  247  494:iconst_0        
	//  248  495:istore          4
					j = i;
					if(l != 0)
						j = i - l1;
					obj = ((Object) (mTitleLayout));
					if(l != 0)
						i = 0;
					else
	//* 249  497:goto            297
						i = 8;
	//  250  500:bipush          8
	//  251  502:istore_1        
					((LinearLayout) (obj)).setVisibility(i);
				} else
	//* 252  503:goto            322
				{
					j = measureChildView(((View) (mTitleLayout)), i, l, 0);
	//  253  506:aload_0         
	//  254  507:aload_0         
	//  255  508:getfield        #111 <Field LinearLayout mTitleLayout>
	//  256  511:iload_1         
	//  257  512:iload           4
	//  258  514:iconst_0        
	//  259  515:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//  260  518:istore_2        
				}
		}
		if(mCustomView != null)
		{
			obj = ((Object) (mCustomView.getLayoutParams()));
			if(((android.view.ViewGroup.LayoutParams) (obj)).width != -2)
				i = 0x40000000;
			else
	//* 261  519:goto            328
				i = 0x80000000;
	//  262  522:ldc2            #432 <Int 0x80000000>
	//  263  525:istore_1        
			if(((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
				j = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).width, j);
			if(((android.view.ViewGroup.LayoutParams) (obj)).height != -2)
				l = 0x40000000;
			else
	//* 264  526:goto            358
	//* 265  529:goto            376
				l = 0x80000000;
	//  266  532:ldc2            #432 <Int 0x80000000>
	//  267  535:istore          4
			if(((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
				i1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).height, i1);
			mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, i), android.view.View.MeasureSpec.makeMeasureSpec(i1, l));
		}
		if(mContentHeight <= 0)
		{
			j = 0;
			i1 = getChildCount();
			for(i = 0; i < i1;)
			{
				l = getChildAt(i).getMeasuredHeight() + k1;
				k = j;
				if(l > j)
					k = l;
				i++;
				j = k;
			}

	//* 268  537:goto            391
	//* 269  540:goto            411
			setMeasuredDimension(j1, j);
	//  270  543:aload_0         
	//  271  544:iload           6
	//  272  546:iload_2         
	//  273  547:invokevirtual   #464 <Method void setMeasuredDimension(int, int)>
			return;
	//  274  550:return          
		} else
		{
			setMeasuredDimension(j1, k);
	//  275  551:aload_0         
	//  276  552:iload           6
	//  277  554:iload_3         
	//  278  555:invokevirtual   #464 <Method void setMeasuredDimension(int, int)>
			return;
	//  279  558:return          
		}
	}

	public volatile boolean onTouchEvent(MotionEvent motionevent)
	{
		return super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #467 <Method boolean AbsActionBarView.onTouchEvent(MotionEvent)>
	//    3    5:ireturn         
	}

	public volatile void postShowOverflowMenu()
	{
		super.postShowOverflowMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #470 <Method void AbsActionBarView.postShowOverflowMenu()>
	//    2    4:return          
	}

	public void setContentHeight(int i)
	{
		mContentHeight = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #94  <Field int mContentHeight>
	//    3    5:return          
	}

	public void setCustomView(View view)
	{
		if(mCustomView != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #306 <Field View mCustomView>
	//*   2    4:ifnull          15
			removeView(mCustomView);
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:getfield        #306 <Field View mCustomView>
	//    6   12:invokevirtual   #475 <Method void removeView(View)>
		mCustomView = view;
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:putfield        #306 <Field View mCustomView>
		if(view != null && mTitleLayout != null)
	//*  10   20:aload_1         
	//*  11   21:ifnull          44
	//*  12   24:aload_0         
	//*  13   25:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  14   28:ifnull          44
		{
			removeView(((View) (mTitleLayout)));
	//   15   31:aload_0         
	//   16   32:aload_0         
	//   17   33:getfield        #111 <Field LinearLayout mTitleLayout>
	//   18   36:invokevirtual   #475 <Method void removeView(View)>
			mTitleLayout = null;
	//   19   39:aload_0         
	//   20   40:aconst_null     
	//   21   41:putfield        #111 <Field LinearLayout mTitleLayout>
		}
		if(view != null)
	//*  22   44:aload_1         
	//*  23   45:ifnull          53
			addView(view);
	//   24   48:aload_0         
	//   25   49:aload_1         
	//   26   50:invokevirtual   #186 <Method void addView(View)>
		requestLayout();
	//   27   53:aload_0         
	//   28   54:invokevirtual   #478 <Method void requestLayout()>
	//   29   57:return          
	}

	public void setSubtitle(CharSequence charsequence)
	{
		mSubtitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #167 <Field CharSequence mSubtitle>
		initTitle();
	//    3    5:aload_0         
	//    4    6:invokespecial   #481 <Method void initTitle()>
	//    5    9:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #161 <Field CharSequence mTitle>
		initTitle();
	//    3    5:aload_0         
	//    4    6:invokespecial   #481 <Method void initTitle()>
	//    5    9:return          
	}

	public void setTitleOptional(boolean flag)
	{
		if(flag != mTitleOptional)
	//*   0    0:iload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #301 <Field boolean mTitleOptional>
	//*   3    5:icmpeq          12
			requestLayout();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #478 <Method void requestLayout()>
		mTitleOptional = flag;
	//    6   12:aload_0         
	//    7   13:iload_1         
	//    8   14:putfield        #301 <Field boolean mTitleOptional>
	//    9   17:return          
	}

	public volatile void setVisibility(int i)
	{
		super.setVisibility(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #484 <Method void AbsActionBarView.setVisibility(int)>
	//    3    5:return          
	}

	public volatile ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long l)
	{
		return super.setupAnimatorToVisibility(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #488 <Method ViewPropertyAnimatorCompat AbsActionBarView.setupAnimatorToVisibility(int, long)>
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
	//*   1    1:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//*   2    4:ifnull          15
			return mActionMenuPresenter.showOverflowMenu();
	//    3    7:aload_0         
	//    4    8:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//    5   11:invokevirtual   #492 <Method boolean ActionMenuPresenter.showOverflowMenu()>
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
}
