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
		byte byte0;
		Object obj;
label0:
		{
			if(mTitleLayout == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #111 <Field LinearLayout mTitleLayout>
	//*   2    4:ifnonnull       117
			{
				LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_title_item, ((android.view.ViewGroup) (this)));
	//    3    7:aload_0         
	//    4    8:invokevirtual   #115 <Method Context getContext()>
	//    5   11:invokestatic    #121 <Method LayoutInflater LayoutInflater.from(Context)>
	//    6   14:getstatic       #124 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_title_item>
	//    7   17:aload_0         
	//    8   18:invokevirtual   #128 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//    9   21:pop             
				mTitleLayout = (LinearLayout)getChildAt(getChildCount() - 1);
	//   10   22:aload_0         
	//   11   23:aload_0         
	//   12   24:aload_0         
	//   13   25:invokevirtual   #132 <Method int getChildCount()>
	//   14   28:iconst_1        
	//   15   29:isub            
	//   16   30:invokevirtual   #136 <Method View getChildAt(int)>
	//   17   33:checkcast       #138 <Class LinearLayout>
	//   18   36:putfield        #111 <Field LinearLayout mTitleLayout>
				mTitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_title);
	//   19   39:aload_0         
	//   20   40:aload_0         
	//   21   41:getfield        #111 <Field LinearLayout mTitleLayout>
	//   22   44:getstatic       #143 <Field int android.support.v7.appcompat.R$id.action_bar_title>
	//   23   47:invokevirtual   #146 <Method View LinearLayout.findViewById(int)>
	//   24   50:checkcast       #148 <Class TextView>
	//   25   53:putfield        #150 <Field TextView mTitleView>
				mSubtitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_subtitle);
	//   26   56:aload_0         
	//   27   57:aload_0         
	//   28   58:getfield        #111 <Field LinearLayout mTitleLayout>
	//   29   61:getstatic       #153 <Field int android.support.v7.appcompat.R$id.action_bar_subtitle>
	//   30   64:invokevirtual   #146 <Method View LinearLayout.findViewById(int)>
	//   31   67:checkcast       #148 <Class TextView>
	//   32   70:putfield        #155 <Field TextView mSubtitleView>
				if(mTitleStyleRes != 0)
	//*  33   73:aload_0         
	//*  34   74:getfield        #80  <Field int mTitleStyleRes>
	//*  35   77:ifeq            95
					mTitleView.setTextAppearance(getContext(), mTitleStyleRes);
	//   36   80:aload_0         
	//   37   81:getfield        #150 <Field TextView mTitleView>
	//   38   84:aload_0         
	//   39   85:invokevirtual   #115 <Method Context getContext()>
	//   40   88:aload_0         
	//   41   89:getfield        #80  <Field int mTitleStyleRes>
	//   42   92:invokevirtual   #159 <Method void TextView.setTextAppearance(Context, int)>
				if(mSubtitleStyleRes != 0)
	//*  43   95:aload_0         
	//*  44   96:getfield        #85  <Field int mSubtitleStyleRes>
	//*  45   99:ifeq            117
					mSubtitleView.setTextAppearance(getContext(), mSubtitleStyleRes);
	//   46  102:aload_0         
	//   47  103:getfield        #155 <Field TextView mSubtitleView>
	//   48  106:aload_0         
	//   49  107:invokevirtual   #115 <Method Context getContext()>
	//   50  110:aload_0         
	//   51  111:getfield        #85  <Field int mSubtitleStyleRes>
	//   52  114:invokevirtual   #159 <Method void TextView.setTextAppearance(Context, int)>
			}
			mTitleView.setText(mTitle);
	//   53  117:aload_0         
	//   54  118:getfield        #150 <Field TextView mTitleView>
	//   55  121:aload_0         
	//   56  122:getfield        #161 <Field CharSequence mTitle>
	//   57  125:invokevirtual   #165 <Method void TextView.setText(CharSequence)>
			mSubtitleView.setText(mSubtitle);
	//   58  128:aload_0         
	//   59  129:getfield        #155 <Field TextView mSubtitleView>
	//   60  132:aload_0         
	//   61  133:getfield        #167 <Field CharSequence mSubtitle>
	//   62  136:invokevirtual   #165 <Method void TextView.setText(CharSequence)>
			boolean flag1 = TextUtils.isEmpty(mTitle);
	//   63  139:aload_0         
	//   64  140:getfield        #161 <Field CharSequence mTitle>
	//   65  143:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   66  146:istore          4
			boolean flag = TextUtils.isEmpty(mSubtitle) ^ true;
	//   67  148:aload_0         
	//   68  149:getfield        #167 <Field CharSequence mSubtitle>
	//   69  152:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   70  155:iconst_1        
	//   71  156:ixor            
	//   72  157:istore_3        
			obj = ((Object) (mSubtitleView));
	//   73  158:aload_0         
	//   74  159:getfield        #155 <Field TextView mSubtitleView>
	//   75  162:astore          5
			byte byte1 = 8;
	//   76  164:bipush          8
	//   77  166:istore_2        
			if(flag)
	//*  78  167:iload_3         
	//*  79  168:ifeq            176
				byte0 = 0;
	//   80  171:iconst_0        
	//   81  172:istore_1        
			else
	//*  82  173:goto            179
				byte0 = 8;
	//   83  176:bipush          8
	//   84  178:istore_1        
			((TextView) (obj)).setVisibility(((int) (byte0)));
	//   85  179:aload           5
	//   86  181:iload_1         
	//   87  182:invokevirtual   #177 <Method void TextView.setVisibility(int)>
			obj = ((Object) (mTitleLayout));
	//   88  185:aload_0         
	//   89  186:getfield        #111 <Field LinearLayout mTitleLayout>
	//   90  189:astore          5
			if(!(flag1 ^ true))
	//*  91  191:iload           4
	//*  92  193:iconst_1        
	//*  93  194:ixor            
	//*  94  195:ifne            204
			{
				byte0 = byte1;
	//   95  198:iload_2         
	//   96  199:istore_1        
				if(!flag)
					break label0;
	//   97  200:iload_3         
	//   98  201:ifeq            206
			}
			byte0 = 0;
	//   99  204:iconst_0        
	//  100  205:istore_1        
		}
		((LinearLayout) (obj)).setVisibility(((int) (byte0)));
	//  101  206:aload           5
	//  102  208:iload_1         
	//  103  209:invokevirtual   #178 <Method void LinearLayout.setVisibility(int)>
		if(mTitleLayout.getParent() == null)
	//* 104  212:aload_0         
	//* 105  213:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 106  216:invokevirtual   #182 <Method android.view.ViewParent LinearLayout.getParent()>
	//* 107  219:ifnonnull       230
			addView(((View) (mTitleLayout)));
	//  108  222:aload_0         
	//  109  223:aload_0         
	//  110  224:getfield        #111 <Field LinearLayout mTitleLayout>
	//  111  227:invokevirtual   #186 <Method void addView(View)>
	//  112  230:return          
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
	//*   2    4:ifnonnull       12
		{
			killMode();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #199 <Method void killMode()>
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
		if(mClose == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #196 <Field View mClose>
	//*   2    4:ifnonnull       38
		{
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
		} else
	//*  17   35:goto            56
		if(mClose.getParent() == null)
	//*  18   38:aload_0         
	//*  19   39:getfield        #196 <Field View mClose>
	//*  20   42:invokevirtual   #238 <Method android.view.ViewParent View.getParent()>
	//*  21   45:ifnonnull       56
			addView(mClose);
	//   22   48:aload_0         
	//   23   49:aload_0         
	//   24   50:getfield        #196 <Field View mClose>
	//   25   53:invokevirtual   #186 <Method void addView(View)>
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
	//   26   56:aload_0         
	//   27   57:getfield        #196 <Field View mClose>
	//   28   60:getstatic       #241 <Field int android.support.v7.appcompat.R$id.action_mode_close_button>
	//   29   63:invokevirtual   #242 <Method View View.findViewById(int)>
	//   30   66:new             #6   <Class ActionBarContextView$1>
	//   31   69:dup             
	//   32   70:aload_0         
	//   33   71:aload_1         
	//   34   72:invokespecial   #245 <Method void ActionBarContextView$1(ActionBarContextView, ActionMode)>
	//   35   75:invokevirtual   #249 <Method void View.setOnClickListener(android.view.View$OnClickListener)>
		mode = ((ActionMode) ((MenuBuilder)mode.getMenu()));
	//   36   78:aload_1         
	//   37   79:invokevirtual   #255 <Method android.view.Menu ActionMode.getMenu()>
	//   38   82:checkcast       #257 <Class MenuBuilder>
	//   39   85:astore_1        
		if(mActionMenuPresenter != null)
	//*  40   86:aload_0         
	//*  41   87:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//*  42   90:ifnull          101
			mActionMenuPresenter.dismissPopupMenus();
	//   43   93:aload_0         
	//   44   94:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   45   97:invokevirtual   #259 <Method boolean ActionMenuPresenter.dismissPopupMenus()>
	//   46  100:pop             
		mActionMenuPresenter = new ActionMenuPresenter(getContext());
	//   47  101:aload_0         
	//   48  102:new             #228 <Class ActionMenuPresenter>
	//   49  105:dup             
	//   50  106:aload_0         
	//   51  107:invokevirtual   #115 <Method Context getContext()>
	//   52  110:invokespecial   #261 <Method void ActionMenuPresenter(Context)>
	//   53  113:putfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
		mActionMenuPresenter.setReserveOverflow(true);
	//   54  116:aload_0         
	//   55  117:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   56  120:iconst_1        
	//   57  121:invokevirtual   #265 <Method void ActionMenuPresenter.setReserveOverflow(boolean)>
		android.view.ViewGroup.LayoutParams layoutparams = new android.view.ViewGroup.LayoutParams(-2, -1);
	//   58  124:new             #267 <Class android.view.ViewGroup$LayoutParams>
	//   59  127:dup             
	//   60  128:bipush          -2
	//   61  130:iconst_m1       
	//   62  131:invokespecial   #268 <Method void android.view.ViewGroup$LayoutParams(int, int)>
	//   63  134:astore_2        
		((MenuBuilder) (mode)).addMenuPresenter(((android.support.v7.view.menu.MenuPresenter) (mActionMenuPresenter)), mPopupContext);
	//   64  135:aload_1         
	//   65  136:aload_0         
	//   66  137:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   67  140:aload_0         
	//   68  141:getfield        #272 <Field Context mPopupContext>
	//   69  144:invokevirtual   #276 <Method void MenuBuilder.addMenuPresenter(android.support.v7.view.menu.MenuPresenter, Context)>
		mMenuView = (ActionMenuView)mActionMenuPresenter.getMenuView(((android.view.ViewGroup) (this)));
	//   70  147:aload_0         
	//   71  148:aload_0         
	//   72  149:getfield        #226 <Field ActionMenuPresenter mActionMenuPresenter>
	//   73  152:aload_0         
	//   74  153:invokevirtual   #280 <Method android.support.v7.view.menu.MenuView ActionMenuPresenter.getMenuView(android.view.ViewGroup)>
	//   75  156:checkcast       #282 <Class ActionMenuView>
	//   76  159:putfield        #286 <Field ActionMenuView mMenuView>
		ViewCompat.setBackground(((View) (mMenuView)), ((android.graphics.drawable.Drawable) (null)));
	//   77  162:aload_0         
	//   78  163:getfield        #286 <Field ActionMenuView mMenuView>
	//   79  166:aconst_null     
	//   80  167:invokestatic    #71  <Method void ViewCompat.setBackground(View, android.graphics.drawable.Drawable)>
		addView(((View) (mMenuView)), layoutparams);
	//   81  170:aload_0         
	//   82  171:aload_0         
	//   83  172:getfield        #286 <Field ActionMenuView mMenuView>
	//   84  175:aload_2         
	//   85  176:invokevirtual   #289 <Method void addView(View, android.view.ViewGroup$LayoutParams)>
	//   86  179:return          
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
	//    7   11:putfield        #286 <Field ActionMenuView mMenuView>
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
		if(flag)
	//*   3    5:iload_1         
	//*   4    6:ifeq            23
			i1 = k - i - getPaddingRight();
	//    5    9:iload           4
	//    6   11:iload_2         
	//    7   12:isub            
	//    8   13:aload_0         
	//    9   14:invokevirtual   #365 <Method int getPaddingRight()>
	//   10   17:isub            
	//   11   18:istore          6
		else
	//*  12   20:goto            29
			i1 = getPaddingLeft();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #368 <Method int getPaddingLeft()>
	//   15   27:istore          6
		int j1 = getPaddingTop();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #371 <Method int getPaddingTop()>
	//   18   33:istore          7
		int k1 = l - j - getPaddingTop() - getPaddingBottom();
	//   19   35:iload           5
	//   20   37:iload_3         
	//   21   38:isub            
	//   22   39:aload_0         
	//   23   40:invokevirtual   #371 <Method int getPaddingTop()>
	//   24   43:isub            
	//   25   44:aload_0         
	//   26   45:invokevirtual   #374 <Method int getPaddingBottom()>
	//   27   48:isub            
	//   28   49:istore          8
		if(mClose != null && mClose.getVisibility() != 8)
	//*  29   51:aload_0         
	//*  30   52:getfield        #196 <Field View mClose>
	//*  31   55:ifnull          156
	//*  32   58:aload_0         
	//*  33   59:getfield        #196 <Field View mClose>
	//*  34   62:invokevirtual   #377 <Method int View.getVisibility()>
	//*  35   65:bipush          8
	//*  36   67:icmpeq          156
		{
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
	//   37   70:aload_0         
	//   38   71:getfield        #196 <Field View mClose>
	//   39   74:invokevirtual   #380 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   40   77:checkcast       #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//   41   80:astore          9
			if(flag)
	//*  42   82:iload_1         
	//*  43   83:ifeq            95
				j = marginlayoutparams.rightMargin;
	//   44   86:aload           9
	//   45   88:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   46   91:istore_3        
			else
	//*  47   92:goto            101
				j = marginlayoutparams.leftMargin;
	//   48   95:aload           9
	//   49   97:getfield        #386 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   50  100:istore_3        
			if(flag)
	//*  51  101:iload_1         
	//*  52  102:ifeq            115
				l = marginlayoutparams.leftMargin;
	//   53  105:aload           9
	//   54  107:getfield        #386 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   55  110:istore          5
			else
	//*  56  112:goto            122
				l = marginlayoutparams.rightMargin;
	//   57  115:aload           9
	//   58  117:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   59  120:istore          5
			j = next(i1, j, flag);
	//   60  122:iload           6
	//   61  124:iload_3         
	//   62  125:iload_1         
	//   63  126:invokestatic    #390 <Method int next(int, int, boolean)>
	//   64  129:istore_3        
			j = next(j + positionChild(mClose, j, j1, k1, flag), l, flag);
	//   65  130:iload_3         
	//   66  131:aload_0         
	//   67  132:aload_0         
	//   68  133:getfield        #196 <Field View mClose>
	//   69  136:iload_3         
	//   70  137:iload           7
	//   71  139:iload           8
	//   72  141:iload_1         
	//   73  142:invokevirtual   #394 <Method int positionChild(View, int, int, int, boolean)>
	//   74  145:iadd            
	//   75  146:iload           5
	//   76  148:iload_1         
	//   77  149:invokestatic    #390 <Method int next(int, int, boolean)>
	//   78  152:istore_3        
		} else
	//*  79  153:goto            159
		{
			j = i1;
	//   80  156:iload           6
	//   81  158:istore_3        
		}
		l = j;
	//   82  159:iload_3         
	//   83  160:istore          5
		if(mTitleLayout != null)
	//*  84  162:aload_0         
	//*  85  163:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  86  166:ifnull          212
		{
			l = j;
	//   87  169:iload_3         
	//   88  170:istore          5
			if(mCustomView == null)
	//*  89  172:aload_0         
	//*  90  173:getfield        #306 <Field View mCustomView>
	//*  91  176:ifnonnull       212
			{
				l = j;
	//   92  179:iload_3         
	//   93  180:istore          5
				if(mTitleLayout.getVisibility() != 8)
	//*  94  182:aload_0         
	//*  95  183:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  96  186:invokevirtual   #395 <Method int LinearLayout.getVisibility()>
	//*  97  189:bipush          8
	//*  98  191:icmpeq          212
					l = j + positionChild(((View) (mTitleLayout)), j, j1, k1, flag);
	//   99  194:iload_3         
	//  100  195:aload_0         
	//  101  196:aload_0         
	//  102  197:getfield        #111 <Field LinearLayout mTitleLayout>
	//  103  200:iload_3         
	//  104  201:iload           7
	//  105  203:iload           8
	//  106  205:iload_1         
	//  107  206:invokevirtual   #394 <Method int positionChild(View, int, int, int, boolean)>
	//  108  209:iadd            
	//  109  210:istore          5
			}
		}
		if(mCustomView != null)
	//* 110  212:aload_0         
	//* 111  213:getfield        #306 <Field View mCustomView>
	//* 112  216:ifnull          235
			positionChild(mCustomView, l, j1, k1, flag);
	//  113  219:aload_0         
	//  114  220:aload_0         
	//  115  221:getfield        #306 <Field View mCustomView>
	//  116  224:iload           5
	//  117  226:iload           7
	//  118  228:iload           8
	//  119  230:iload_1         
	//  120  231:invokevirtual   #394 <Method int positionChild(View, int, int, int, boolean)>
	//  121  234:pop             
		if(flag)
	//* 122  235:iload_1         
	//* 123  236:ifeq            247
			i = getPaddingLeft();
	//  124  239:aload_0         
	//  125  240:invokevirtual   #368 <Method int getPaddingLeft()>
	//  126  243:istore_2        
		else
	//* 127  244:goto            257
			i = k - i - getPaddingRight();
	//  128  247:iload           4
	//  129  249:iload_2         
	//  130  250:isub            
	//  131  251:aload_0         
	//  132  252:invokevirtual   #365 <Method int getPaddingRight()>
	//  133  255:isub            
	//  134  256:istore_2        
		if(mMenuView != null)
	//* 135  257:aload_0         
	//* 136  258:getfield        #286 <Field ActionMenuView mMenuView>
	//* 137  261:ifnull          281
			positionChild(((View) (mMenuView)), i, j1, k1, flag ^ true);
	//  138  264:aload_0         
	//  139  265:aload_0         
	//  140  266:getfield        #286 <Field ActionMenuView mMenuView>
	//  141  269:iload_2         
	//  142  270:iload           7
	//  143  272:iload           8
	//  144  274:iload_1         
	//  145  275:iconst_1        
	//  146  276:ixor            
	//  147  277:invokevirtual   #394 <Method int positionChild(View, int, int, int, boolean)>
	//  148  280:pop             
	//  149  281:return          
	}

	protected void onMeasure(int i, int j)
	{
		int k = android.view.View.MeasureSpec.getMode(i);
	//    0    0:iload_1         
	//    1    1:invokestatic    #402 <Method int android.view.View$MeasureSpec.getMode(int)>
	//    2    4:istore_3        
		int k1 = 0x40000000;
	//    3    5:ldc2            #403 <Int 0x40000000>
	//    4    8:istore          5
		if(k != 0x40000000)
	//*   5   10:iload_3         
	//*   6   11:ldc2            #403 <Int 0x40000000>
	//*   7   14:icmpeq          70
		{
			StringBuilder stringbuilder = new StringBuilder();
	//    8   17:new             #405 <Class StringBuilder>
	//    9   20:dup             
	//   10   21:invokespecial   #407 <Method void StringBuilder()>
	//   11   24:astore          11
			stringbuilder.append(((Object)this).getClass().getSimpleName());
	//   12   26:aload           11
	//   13   28:aload_0         
	//   14   29:invokevirtual   #332 <Method Class Object.getClass()>
	//   15   32:invokevirtual   #410 <Method String Class.getSimpleName()>
	//   16   35:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   17   38:pop             
			stringbuilder.append(" can only be used ");
	//   18   39:aload           11
	//   19   41:ldc2            #416 <String " can only be used ">
	//   20   44:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
			stringbuilder.append("with android:layout_width=\"match_parent\" (or fill_parent)");
	//   22   48:aload           11
	//   23   50:ldc2            #418 <String "with android:layout_width=\"match_parent\" (or fill_parent)">
	//   24   53:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
			throw new IllegalStateException(stringbuilder.toString());
	//   26   57:new             #420 <Class IllegalStateException>
	//   27   60:dup             
	//   28   61:aload           11
	//   29   63:invokevirtual   #423 <Method String StringBuilder.toString()>
	//   30   66:invokespecial   #426 <Method void IllegalStateException(String)>
	//   31   69:athrow          
		}
		if(android.view.View.MeasureSpec.getMode(j) == 0)
	//*  32   70:iload_2         
	//*  33   71:invokestatic    #402 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  34   74:ifne            130
		{
			StringBuilder stringbuilder1 = new StringBuilder();
	//   35   77:new             #405 <Class StringBuilder>
	//   36   80:dup             
	//   37   81:invokespecial   #407 <Method void StringBuilder()>
	//   38   84:astore          11
			stringbuilder1.append(((Object)this).getClass().getSimpleName());
	//   39   86:aload           11
	//   40   88:aload_0         
	//   41   89:invokevirtual   #332 <Method Class Object.getClass()>
	//   42   92:invokevirtual   #410 <Method String Class.getSimpleName()>
	//   43   95:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   44   98:pop             
			stringbuilder1.append(" can only be used ");
	//   45   99:aload           11
	//   46  101:ldc2            #416 <String " can only be used ">
	//   47  104:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   48  107:pop             
			stringbuilder1.append("with android:layout_height=\"wrap_content\"");
	//   49  108:aload           11
	//   50  110:ldc2            #428 <String "with android:layout_height=\"wrap_content\"">
	//   51  113:invokevirtual   #414 <Method StringBuilder StringBuilder.append(String)>
	//   52  116:pop             
			throw new IllegalStateException(stringbuilder1.toString());
	//   53  117:new             #420 <Class IllegalStateException>
	//   54  120:dup             
	//   55  121:aload           11
	//   56  123:invokevirtual   #423 <Method String StringBuilder.toString()>
	//   57  126:invokespecial   #426 <Method void IllegalStateException(String)>
	//   58  129:athrow          
		}
		int j2 = android.view.View.MeasureSpec.getSize(i);
	//   59  130:iload_1         
	//   60  131:invokestatic    #431 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   61  134:istore          8
		if(mContentHeight > 0)
	//*  62  136:aload_0         
	//*  63  137:getfield        #94  <Field int mContentHeight>
	//*  64  140:ifle            151
			k = mContentHeight;
	//   65  143:aload_0         
	//   66  144:getfield        #94  <Field int mContentHeight>
	//   67  147:istore_3        
		else
	//*  68  148:goto            156
			k = android.view.View.MeasureSpec.getSize(j);
	//   69  151:iload_2         
	//   70  152:invokestatic    #431 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   71  155:istore_3        
		int k2 = getPaddingTop() + getPaddingBottom();
	//   72  156:aload_0         
	//   73  157:invokevirtual   #371 <Method int getPaddingTop()>
	//   74  160:aload_0         
	//   75  161:invokevirtual   #374 <Method int getPaddingBottom()>
	//   76  164:iadd            
	//   77  165:istore          9
		i = j2 - getPaddingLeft() - getPaddingRight();
	//   78  167:iload           8
	//   79  169:aload_0         
	//   80  170:invokevirtual   #368 <Method int getPaddingLeft()>
	//   81  173:isub            
	//   82  174:aload_0         
	//   83  175:invokevirtual   #365 <Method int getPaddingRight()>
	//   84  178:isub            
	//   85  179:istore_1        
		int i2 = k - k2;
	//   86  180:iload_3         
	//   87  181:iload           9
	//   88  183:isub            
	//   89  184:istore          7
		int l = android.view.View.MeasureSpec.makeMeasureSpec(i2, 0x80000000);
	//   90  186:iload           7
	//   91  188:ldc2            #432 <Int 0x80000000>
	//   92  191:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   93  194:istore          4
		View view = mClose;
	//   94  196:aload_0         
	//   95  197:getfield        #196 <Field View mClose>
	//   96  200:astore          11
		boolean flag = false;
	//   97  202:iconst_0        
	//   98  203:istore          6
		j = i;
	//   99  205:iload_1         
	//  100  206:istore_2        
		if(view != null)
	//* 101  207:aload           11
	//* 102  209:ifnull          251
		{
			i = measureChildView(mClose, i, l, 0);
	//  103  212:aload_0         
	//  104  213:aload_0         
	//  105  214:getfield        #196 <Field View mClose>
	//  106  217:iload_1         
	//  107  218:iload           4
	//  108  220:iconst_0        
	//  109  221:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//  110  224:istore_1        
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
	//  111  225:aload_0         
	//  112  226:getfield        #196 <Field View mClose>
	//  113  229:invokevirtual   #380 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  114  232:checkcast       #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//  115  235:astore          11
			j = i - (marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
	//  116  237:iload_1         
	//  117  238:aload           11
	//  118  240:getfield        #386 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//  119  243:aload           11
	//  120  245:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//  121  248:iadd            
	//  122  249:isub            
	//  123  250:istore_2        
		}
		i = j;
	//  124  251:iload_2         
	//  125  252:istore_1        
		if(mMenuView != null)
	//* 126  253:aload_0         
	//* 127  254:getfield        #286 <Field ActionMenuView mMenuView>
	//* 128  257:ifnull          286
		{
			i = j;
	//  129  260:iload_2         
	//  130  261:istore_1        
			if(mMenuView.getParent() == this)
	//* 131  262:aload_0         
	//* 132  263:getfield        #286 <Field ActionMenuView mMenuView>
	//* 133  266:invokevirtual   #440 <Method android.view.ViewParent ActionMenuView.getParent()>
	//* 134  269:aload_0         
	//* 135  270:if_acmpne       286
				i = measureChildView(((View) (mMenuView)), j, l, 0);
	//  136  273:aload_0         
	//  137  274:aload_0         
	//  138  275:getfield        #286 <Field ActionMenuView mMenuView>
	//  139  278:iload_2         
	//  140  279:iload           4
	//  141  281:iconst_0        
	//  142  282:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//  143  285:istore_1        
		}
		j = i;
	//  144  286:iload_1         
	//  145  287:istore_2        
		if(mTitleLayout != null)
	//* 146  288:aload_0         
	//* 147  289:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 148  292:ifnull          404
		{
			j = i;
	//  149  295:iload_1         
	//  150  296:istore_2        
			if(mCustomView == null)
	//* 151  297:aload_0         
	//* 152  298:getfield        #306 <Field View mCustomView>
	//* 153  301:ifnonnull       404
				if(mTitleOptional)
	//* 154  304:aload_0         
	//* 155  305:getfield        #301 <Field boolean mTitleOptional>
	//* 156  308:ifeq            391
				{
					j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  157  311:iconst_0        
	//  158  312:iconst_0        
	//  159  313:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  160  316:istore_2        
					mTitleLayout.measure(j, l);
	//  161  317:aload_0         
	//  162  318:getfield        #111 <Field LinearLayout mTitleLayout>
	//  163  321:iload_2         
	//  164  322:iload           4
	//  165  324:invokevirtual   #443 <Method void LinearLayout.measure(int, int)>
					int l2 = mTitleLayout.getMeasuredWidth();
	//  166  327:aload_0         
	//  167  328:getfield        #111 <Field LinearLayout mTitleLayout>
	//  168  331:invokevirtual   #446 <Method int LinearLayout.getMeasuredWidth()>
	//  169  334:istore          10
					if(l2 <= i)
	//* 170  336:iload           10
	//* 171  338:iload_1         
	//* 172  339:icmpgt          348
						l = 1;
	//  173  342:iconst_1        
	//  174  343:istore          4
					else
	//* 175  345:goto            351
						l = 0;
	//  176  348:iconst_0        
	//  177  349:istore          4
					j = i;
	//  178  351:iload_1         
	//  179  352:istore_2        
					if(l != 0)
	//* 180  353:iload           4
	//* 181  355:ifeq            363
						j = i - l2;
	//  182  358:iload_1         
	//  183  359:iload           10
	//  184  361:isub            
	//  185  362:istore_2        
					LinearLayout linearlayout = mTitleLayout;
	//  186  363:aload_0         
	//  187  364:getfield        #111 <Field LinearLayout mTitleLayout>
	//  188  367:astore          11
					if(l != 0)
	//* 189  369:iload           4
	//* 190  371:ifeq            379
						i = 0;
	//  191  374:iconst_0        
	//  192  375:istore_1        
					else
	//* 193  376:goto            382
						i = 8;
	//  194  379:bipush          8
	//  195  381:istore_1        
					linearlayout.setVisibility(i);
	//  196  382:aload           11
	//  197  384:iload_1         
	//  198  385:invokevirtual   #178 <Method void LinearLayout.setVisibility(int)>
				} else
	//* 199  388:goto            404
				{
					j = measureChildView(((View) (mTitleLayout)), i, l, 0);
	//  200  391:aload_0         
	//  201  392:aload_0         
	//  202  393:getfield        #111 <Field LinearLayout mTitleLayout>
	//  203  396:iload_1         
	//  204  397:iload           4
	//  205  399:iconst_0        
	//  206  400:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//  207  403:istore_2        
				}
		}
		if(mCustomView != null)
	//* 208  404:aload_0         
	//* 209  405:getfield        #306 <Field View mCustomView>
	//* 210  408:ifnull          526
		{
			android.view.ViewGroup.LayoutParams layoutparams = mCustomView.getLayoutParams();
	//  211  411:aload_0         
	//  212  412:getfield        #306 <Field View mCustomView>
	//  213  415:invokevirtual   #380 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  214  418:astore          11
			if(layoutparams.width != -2)
	//* 215  420:aload           11
	//* 216  422:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 217  425:bipush          -2
	//* 218  427:icmpeq          437
				i = 0x40000000;
	//  219  430:ldc2            #403 <Int 0x40000000>
	//  220  433:istore_1        
			else
	//* 221  434:goto            441
				i = 0x80000000;
	//  222  437:ldc2            #432 <Int 0x80000000>
	//  223  440:istore_1        
			int i1 = j;
	//  224  441:iload_2         
	//  225  442:istore          4
			if(layoutparams.width >= 0)
	//* 226  444:aload           11
	//* 227  446:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 228  449:iflt            463
				i1 = Math.min(layoutparams.width, j);
	//  229  452:aload           11
	//  230  454:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//  231  457:iload_2         
	//  232  458:invokestatic    #454 <Method int Math.min(int, int)>
	//  233  461:istore          4
			if(layoutparams.height != -2)
	//* 234  463:aload           11
	//* 235  465:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 236  468:bipush          -2
	//* 237  470:icmpeq          479
				j = k1;
	//  238  473:iload           5
	//  239  475:istore_2        
			else
	//* 240  476:goto            483
				j = 0x80000000;
	//  241  479:ldc2            #432 <Int 0x80000000>
	//  242  482:istore_2        
			k1 = i2;
	//  243  483:iload           7
	//  244  485:istore          5
			if(layoutparams.height >= 0)
	//* 245  487:aload           11
	//* 246  489:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 247  492:iflt            507
				k1 = Math.min(layoutparams.height, i2);
	//  248  495:aload           11
	//  249  497:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//  250  500:iload           7
	//  251  502:invokestatic    #454 <Method int Math.min(int, int)>
	//  252  505:istore          5
			mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, i), android.view.View.MeasureSpec.makeMeasureSpec(k1, j));
	//  253  507:aload_0         
	//  254  508:getfield        #306 <Field View mCustomView>
	//  255  511:iload           4
	//  256  513:iload_1         
	//  257  514:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  258  517:iload           5
	//  259  519:iload_2         
	//  260  520:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  261  523:invokevirtual   #458 <Method void View.measure(int, int)>
		}
		if(mContentHeight <= 0)
	//* 262  526:aload_0         
	//* 263  527:getfield        #94  <Field int mContentHeight>
	//* 264  530:ifgt            591
		{
			int l1 = getChildCount();
	//  265  533:aload_0         
	//  266  534:invokevirtual   #132 <Method int getChildCount()>
	//  267  537:istore          5
			j = 0;
	//  268  539:iconst_0        
	//  269  540:istore_2        
			for(i = ((int) (flag)); i < l1;)
	//* 270  541:iload           6
	//* 271  543:istore_1        
	//* 272  544:iload_1         
	//* 273  545:iload           5
	//* 274  547:icmpge          583
			{
				int j1 = getChildAt(i).getMeasuredHeight() + k2;
	//  275  550:aload_0         
	//  276  551:iload_1         
	//  277  552:invokevirtual   #136 <Method View getChildAt(int)>
	//  278  555:invokevirtual   #461 <Method int View.getMeasuredHeight()>
	//  279  558:iload           9
	//  280  560:iadd            
	//  281  561:istore          4
				k = j;
	//  282  563:iload_2         
	//  283  564:istore_3        
				if(j1 > j)
	//* 284  565:iload           4
	//* 285  567:iload_2         
	//* 286  568:icmple          574
					k = j1;
	//  287  571:iload           4
	//  288  573:istore_3        
				i++;
	//  289  574:iload_1         
	//  290  575:iconst_1        
	//  291  576:iadd            
	//  292  577:istore_1        
				j = k;
	//  293  578:iload_3         
	//  294  579:istore_2        
			}

	//* 295  580:goto            544
			setMeasuredDimension(j2, j);
	//  296  583:aload_0         
	//  297  584:iload           8
	//  298  586:iload_2         
	//  299  587:invokevirtual   #464 <Method void setMeasuredDimension(int, int)>
			return;
	//  300  590:return          
		} else
		{
			setMeasuredDimension(j2, k);
	//  301  591:aload_0         
	//  302  592:iload           8
	//  303  594:iload_3         
	//  304  595:invokevirtual   #464 <Method void setMeasuredDimension(int, int)>
			return;
	//  305  598:return          
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
