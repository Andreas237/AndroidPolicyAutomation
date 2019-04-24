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
		boolean flag;
		if(!TextUtils.isEmpty(mTitle))
	//*  63  139:aload_0         
	//*  64  140:getfield        #161 <Field CharSequence mTitle>
	//*  65  143:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  66  146:ifne            154
			flag = true;
	//   67  149:iconst_1        
	//   68  150:istore_1        
		else
	//*  69  151:goto            156
			flag = false;
	//   70  154:iconst_0        
	//   71  155:istore_1        
		boolean flag1;
		if(!TextUtils.isEmpty(mSubtitle))
	//*  72  156:aload_0         
	//*  73  157:getfield        #167 <Field CharSequence mSubtitle>
	//*  74  160:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  75  163:ifne            171
			flag1 = true;
	//   76  166:iconst_1        
	//   77  167:istore_2        
		else
	//*  78  168:goto            173
			flag1 = false;
	//   79  171:iconst_0        
	//   80  172:istore_2        
		Object obj = ((Object) (mSubtitleView));
	//   81  173:aload_0         
	//   82  174:getfield        #155 <Field TextView mSubtitleView>
	//   83  177:astore          4
		byte byte1;
		if(flag1)
	//*  84  179:iload_2         
	//*  85  180:ifeq            188
			byte1 = 0;
	//   86  183:iconst_0        
	//   87  184:istore_3        
		else
	//*  88  185:goto            191
			byte1 = 8;
	//   89  188:bipush          8
	//   90  190:istore_3        
		((TextView) (obj)).setVisibility(((int) (byte1)));
	//   91  191:aload           4
	//   92  193:iload_3         
	//   93  194:invokevirtual   #177 <Method void TextView.setVisibility(int)>
		obj = ((Object) (mTitleLayout));
	//   94  197:aload_0         
	//   95  198:getfield        #111 <Field LinearLayout mTitleLayout>
	//   96  201:astore          4
		byte byte0;
		if(flag || flag1)
	//*  97  203:iload_1         
	//*  98  204:ifne            211
	//*  99  207:iload_2         
	//* 100  208:ifeq            216
			byte0 = 0;
	//  101  211:iconst_0        
	//  102  212:istore_1        
		else
	//* 103  213:goto            219
			byte0 = 8;
	//  104  216:bipush          8
	//  105  218:istore_1        
		((LinearLayout) (obj)).setVisibility(((int) (byte0)));
	//  106  219:aload           4
	//  107  221:iload_1         
	//  108  222:invokevirtual   #178 <Method void LinearLayout.setVisibility(int)>
		if(mTitleLayout.getParent() == null)
	//* 109  225:aload_0         
	//* 110  226:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 111  229:invokevirtual   #182 <Method android.view.ViewParent LinearLayout.getParent()>
	//* 112  232:ifnonnull       243
			addView(((View) (mTitleLayout)));
	//  113  235:aload_0         
	//  114  236:aload_0         
	//  115  237:getfield        #111 <Field LinearLayout mTitleLayout>
	//  116  240:invokevirtual   #186 <Method void addView(View)>
	//  117  243:return          
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
		if(android.os.Build.VERSION.SDK_INT >= 14)
	//*   0    0:getstatic       #323 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          14
	//*   2    5:icmplt          58
		{
			if(accessibilityevent.getEventType() == 32)
	//*   3    8:aload_1         
	//*   4    9:invokevirtual   #328 <Method int AccessibilityEvent.getEventType()>
	//*   5   12:bipush          32
	//*   6   14:icmpne          53
			{
				accessibilityevent.setSource(((View) (this)));
	//    7   17:aload_1         
	//    8   18:aload_0         
	//    9   19:invokevirtual   #331 <Method void AccessibilityEvent.setSource(View)>
				accessibilityevent.setClassName(((CharSequence) (((Object)this).getClass().getName())));
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokevirtual   #337 <Method Class Object.getClass()>
	//   13   27:invokevirtual   #343 <Method String Class.getName()>
	//   14   30:invokevirtual   #346 <Method void AccessibilityEvent.setClassName(CharSequence)>
				accessibilityevent.setPackageName(((CharSequence) (getContext().getPackageName())));
	//   15   33:aload_1         
	//   16   34:aload_0         
	//   17   35:invokevirtual   #115 <Method Context getContext()>
	//   18   38:invokevirtual   #351 <Method String Context.getPackageName()>
	//   19   41:invokevirtual   #354 <Method void AccessibilityEvent.setPackageName(CharSequence)>
				accessibilityevent.setContentDescription(mTitle);
	//   20   44:aload_1         
	//   21   45:aload_0         
	//   22   46:getfield        #161 <Field CharSequence mTitle>
	//   23   49:invokevirtual   #357 <Method void AccessibilityEvent.setContentDescription(CharSequence)>
				return;
	//   24   52:return          
			}
			super.onInitializeAccessibilityEvent(accessibilityevent);
	//   25   53:aload_0         
	//   26   54:aload_1         
	//   27   55:invokespecial   #359 <Method void AbsActionBarView.onInitializeAccessibilityEvent(AccessibilityEvent)>
		}
	//   28   58:return          
	}

	protected void onLayout(boolean flag, int i, int j, int k, int l)
	{
		flag = ViewUtils.isLayoutRtl(((View) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #367 <Method boolean ViewUtils.isLayoutRtl(View)>
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
	//    9   14:invokevirtual   #370 <Method int getPaddingRight()>
	//   10   17:isub            
	//   11   18:istore          6
		else
	//*  12   20:goto            29
			i1 = getPaddingLeft();
	//   13   23:aload_0         
	//   14   24:invokevirtual   #373 <Method int getPaddingLeft()>
	//   15   27:istore          6
		int j1 = getPaddingTop();
	//   16   29:aload_0         
	//   17   30:invokevirtual   #376 <Method int getPaddingTop()>
	//   18   33:istore          7
		int k1 = l - j - getPaddingTop() - getPaddingBottom();
	//   19   35:iload           5
	//   20   37:iload_3         
	//   21   38:isub            
	//   22   39:aload_0         
	//   23   40:invokevirtual   #376 <Method int getPaddingTop()>
	//   24   43:isub            
	//   25   44:aload_0         
	//   26   45:invokevirtual   #379 <Method int getPaddingBottom()>
	//   27   48:isub            
	//   28   49:istore          8
		j = i1;
	//   29   51:iload           6
	//   30   53:istore_3        
		if(mClose != null)
	//*  31   54:aload_0         
	//*  32   55:getfield        #196 <Field View mClose>
	//*  33   58:ifnull          159
		{
			j = i1;
	//   34   61:iload           6
	//   35   63:istore_3        
			if(mClose.getVisibility() != 8)
	//*  36   64:aload_0         
	//*  37   65:getfield        #196 <Field View mClose>
	//*  38   68:invokevirtual   #382 <Method int View.getVisibility()>
	//*  39   71:bipush          8
	//*  40   73:icmpeq          159
			{
				android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
	//   41   76:aload_0         
	//   42   77:getfield        #196 <Field View mClose>
	//   43   80:invokevirtual   #385 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   44   83:checkcast       #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//   45   86:astore          9
				if(flag)
	//*  46   88:iload_1         
	//*  47   89:ifeq            101
					j = marginlayoutparams.rightMargin;
	//   48   92:aload           9
	//   49   94:getfield        #388 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   50   97:istore_3        
				else
	//*  51   98:goto            107
					j = marginlayoutparams.leftMargin;
	//   52  101:aload           9
	//   53  103:getfield        #391 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   54  106:istore_3        
				if(flag)
	//*  55  107:iload_1         
	//*  56  108:ifeq            121
					l = marginlayoutparams.leftMargin;
	//   57  111:aload           9
	//   58  113:getfield        #391 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   59  116:istore          5
				else
	//*  60  118:goto            128
					l = marginlayoutparams.rightMargin;
	//   61  121:aload           9
	//   62  123:getfield        #388 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   63  126:istore          5
				j = next(i1, j, flag);
	//   64  128:iload           6
	//   65  130:iload_3         
	//   66  131:iload_1         
	//   67  132:invokestatic    #395 <Method int next(int, int, boolean)>
	//   68  135:istore_3        
				j = next(j + positionChild(mClose, j, j1, k1, flag), l, flag);
	//   69  136:iload_3         
	//   70  137:aload_0         
	//   71  138:aload_0         
	//   72  139:getfield        #196 <Field View mClose>
	//   73  142:iload_3         
	//   74  143:iload           7
	//   75  145:iload           8
	//   76  147:iload_1         
	//   77  148:invokevirtual   #399 <Method int positionChild(View, int, int, int, boolean)>
	//   78  151:iadd            
	//   79  152:iload           5
	//   80  154:iload_1         
	//   81  155:invokestatic    #395 <Method int next(int, int, boolean)>
	//   82  158:istore_3        
			}
		}
		l = j;
	//   83  159:iload_3         
	//   84  160:istore          5
		if(mTitleLayout != null)
	//*  85  162:aload_0         
	//*  86  163:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  87  166:ifnull          212
		{
			l = j;
	//   88  169:iload_3         
	//   89  170:istore          5
			if(mCustomView == null)
	//*  90  172:aload_0         
	//*  91  173:getfield        #306 <Field View mCustomView>
	//*  92  176:ifnonnull       212
			{
				l = j;
	//   93  179:iload_3         
	//   94  180:istore          5
				if(mTitleLayout.getVisibility() != 8)
	//*  95  182:aload_0         
	//*  96  183:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  97  186:invokevirtual   #400 <Method int LinearLayout.getVisibility()>
	//*  98  189:bipush          8
	//*  99  191:icmpeq          212
					l = j + positionChild(((View) (mTitleLayout)), j, j1, k1, flag);
	//  100  194:iload_3         
	//  101  195:aload_0         
	//  102  196:aload_0         
	//  103  197:getfield        #111 <Field LinearLayout mTitleLayout>
	//  104  200:iload_3         
	//  105  201:iload           7
	//  106  203:iload           8
	//  107  205:iload_1         
	//  108  206:invokevirtual   #399 <Method int positionChild(View, int, int, int, boolean)>
	//  109  209:iadd            
	//  110  210:istore          5
			}
		}
		if(mCustomView != null)
	//* 111  212:aload_0         
	//* 112  213:getfield        #306 <Field View mCustomView>
	//* 113  216:ifnull          235
			positionChild(mCustomView, l, j1, k1, flag);
	//  114  219:aload_0         
	//  115  220:aload_0         
	//  116  221:getfield        #306 <Field View mCustomView>
	//  117  224:iload           5
	//  118  226:iload           7
	//  119  228:iload           8
	//  120  230:iload_1         
	//  121  231:invokevirtual   #399 <Method int positionChild(View, int, int, int, boolean)>
	//  122  234:pop             
		if(flag)
	//* 123  235:iload_1         
	//* 124  236:ifeq            247
			i = getPaddingLeft();
	//  125  239:aload_0         
	//  126  240:invokevirtual   #373 <Method int getPaddingLeft()>
	//  127  243:istore_2        
		else
	//* 128  244:goto            257
			i = k - i - getPaddingRight();
	//  129  247:iload           4
	//  130  249:iload_2         
	//  131  250:isub            
	//  132  251:aload_0         
	//  133  252:invokevirtual   #370 <Method int getPaddingRight()>
	//  134  255:isub            
	//  135  256:istore_2        
		if(mMenuView != null)
	//* 136  257:aload_0         
	//* 137  258:getfield        #286 <Field ActionMenuView mMenuView>
	//* 138  261:ifnull          294
		{
			ActionMenuView actionmenuview = mMenuView;
	//  139  264:aload_0         
	//  140  265:getfield        #286 <Field ActionMenuView mMenuView>
	//  141  268:astore          9
			if(!flag)
	//* 142  270:iload_1         
	//* 143  271:ifne            279
				flag = true;
	//  144  274:iconst_1        
	//  145  275:istore_1        
			else
	//* 146  276:goto            281
				flag = false;
	//  147  279:iconst_0        
	//  148  280:istore_1        
			positionChild(((View) (actionmenuview)), i, j1, k1, flag);
	//  149  281:aload_0         
	//  150  282:aload           9
	//  151  284:iload_2         
	//  152  285:iload           7
	//  153  287:iload           8
	//  154  289:iload_1         
	//  155  290:invokevirtual   #399 <Method int positionChild(View, int, int, int, boolean)>
	//  156  293:pop             
		}
	//  157  294:return          
	}

	protected void onMeasure(int i, int j)
	{
		if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
	//*   0    0:iload_1         
	//*   1    1:invokestatic    #407 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   2    4:ldc2            #408 <Int 0x40000000>
	//*   3    7:icmpeq          50
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"match_parent\" (or fill_parent)").toString());
	//    4   10:new             #410 <Class IllegalStateException>
	//    5   13:dup             
	//    6   14:new             #412 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #414 <Method void StringBuilder()>
	//    9   21:aload_0         
	//   10   22:invokevirtual   #337 <Method Class Object.getClass()>
	//   11   25:invokevirtual   #417 <Method String Class.getSimpleName()>
	//   12   28:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:ldc2            #423 <String " can only be used ">
	//   14   34:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   15   37:ldc2            #425 <String "with android:layout_width=\"match_parent\" (or fill_parent)">
	//   16   40:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   17   43:invokevirtual   #428 <Method String StringBuilder.toString()>
	//   18   46:invokespecial   #431 <Method void IllegalStateException(String)>
	//   19   49:athrow          
		if(android.view.View.MeasureSpec.getMode(j) == 0)
	//*  20   50:iload_2         
	//*  21   51:invokestatic    #407 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  22   54:ifne            97
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
	//   23   57:new             #410 <Class IllegalStateException>
	//   24   60:dup             
	//   25   61:new             #412 <Class StringBuilder>
	//   26   64:dup             
	//   27   65:invokespecial   #414 <Method void StringBuilder()>
	//   28   68:aload_0         
	//   29   69:invokevirtual   #337 <Method Class Object.getClass()>
	//   30   72:invokevirtual   #417 <Method String Class.getSimpleName()>
	//   31   75:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   32   78:ldc2            #423 <String " can only be used ">
	//   33   81:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   34   84:ldc2            #433 <String "with android:layout_height=\"wrap_content\"">
	//   35   87:invokevirtual   #421 <Method StringBuilder StringBuilder.append(String)>
	//   36   90:invokevirtual   #428 <Method String StringBuilder.toString()>
	//   37   93:invokespecial   #431 <Method void IllegalStateException(String)>
	//   38   96:athrow          
		int i2 = android.view.View.MeasureSpec.getSize(i);
	//   39   97:iload_1         
	//   40   98:invokestatic    #436 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   41  101:istore          6
		int k;
		if(mContentHeight > 0)
	//*  42  103:aload_0         
	//*  43  104:getfield        #94  <Field int mContentHeight>
	//*  44  107:ifle            118
			k = mContentHeight;
	//   45  110:aload_0         
	//   46  111:getfield        #94  <Field int mContentHeight>
	//   47  114:istore_3        
		else
	//*  48  115:goto            123
			k = android.view.View.MeasureSpec.getSize(j);
	//   49  118:iload_2         
	//   50  119:invokestatic    #436 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   51  122:istore_3        
		int j2 = getPaddingTop() + getPaddingBottom();
	//   52  123:aload_0         
	//   53  124:invokevirtual   #376 <Method int getPaddingTop()>
	//   54  127:aload_0         
	//   55  128:invokevirtual   #379 <Method int getPaddingBottom()>
	//   56  131:iadd            
	//   57  132:istore          7
		i = i2 - getPaddingLeft() - getPaddingRight();
	//   58  134:iload           6
	//   59  136:aload_0         
	//   60  137:invokevirtual   #373 <Method int getPaddingLeft()>
	//   61  140:isub            
	//   62  141:aload_0         
	//   63  142:invokevirtual   #370 <Method int getPaddingRight()>
	//   64  145:isub            
	//   65  146:istore_1        
		int k1 = k - j2;
	//   66  147:iload_3         
	//   67  148:iload           7
	//   68  150:isub            
	//   69  151:istore          5
		int l = android.view.View.MeasureSpec.makeMeasureSpec(k1, 0x80000000);
	//   70  153:iload           5
	//   71  155:ldc2            #437 <Int 0x80000000>
	//   72  158:invokestatic    #440 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//   73  161:istore          4
		j = i;
	//   74  163:iload_1         
	//   75  164:istore_2        
		if(mClose != null)
	//*  76  165:aload_0         
	//*  77  166:getfield        #196 <Field View mClose>
	//*  78  169:ifnull          211
		{
			i = measureChildView(mClose, i, l, 0);
	//   79  172:aload_0         
	//   80  173:aload_0         
	//   81  174:getfield        #196 <Field View mClose>
	//   82  177:iload_1         
	//   83  178:iload           4
	//   84  180:iconst_0        
	//   85  181:invokevirtual   #444 <Method int measureChildView(View, int, int, int)>
	//   86  184:istore_1        
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
	//   87  185:aload_0         
	//   88  186:getfield        #196 <Field View mClose>
	//   89  189:invokevirtual   #385 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//   90  192:checkcast       #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//   91  195:astore          9
			j = i - (marginlayoutparams.leftMargin + marginlayoutparams.rightMargin);
	//   92  197:iload_1         
	//   93  198:aload           9
	//   94  200:getfield        #391 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//   95  203:aload           9
	//   96  205:getfield        #388 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//   97  208:iadd            
	//   98  209:isub            
	//   99  210:istore_2        
		}
		i = j;
	//  100  211:iload_2         
	//  101  212:istore_1        
		if(mMenuView != null)
	//* 102  213:aload_0         
	//* 103  214:getfield        #286 <Field ActionMenuView mMenuView>
	//* 104  217:ifnull          246
		{
			i = j;
	//  105  220:iload_2         
	//  106  221:istore_1        
			if(mMenuView.getParent() == this)
	//* 107  222:aload_0         
	//* 108  223:getfield        #286 <Field ActionMenuView mMenuView>
	//* 109  226:invokevirtual   #445 <Method android.view.ViewParent ActionMenuView.getParent()>
	//* 110  229:aload_0         
	//* 111  230:if_acmpne       246
				i = measureChildView(((View) (mMenuView)), j, l, 0);
	//  112  233:aload_0         
	//  113  234:aload_0         
	//  114  235:getfield        #286 <Field ActionMenuView mMenuView>
	//  115  238:iload_2         
	//  116  239:iload           4
	//  117  241:iconst_0        
	//  118  242:invokevirtual   #444 <Method int measureChildView(View, int, int, int)>
	//  119  245:istore_1        
		}
		j = i;
	//  120  246:iload_1         
	//  121  247:istore_2        
		if(mTitleLayout != null)
	//* 122  248:aload_0         
	//* 123  249:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 124  252:ifnull          364
		{
			j = i;
	//  125  255:iload_1         
	//  126  256:istore_2        
			if(mCustomView == null)
	//* 127  257:aload_0         
	//* 128  258:getfield        #306 <Field View mCustomView>
	//* 129  261:ifnonnull       364
				if(mTitleOptional)
	//* 130  264:aload_0         
	//* 131  265:getfield        #301 <Field boolean mTitleOptional>
	//* 132  268:ifeq            351
				{
					j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
	//  133  271:iconst_0        
	//  134  272:iconst_0        
	//  135  273:invokestatic    #440 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  136  276:istore_2        
					mTitleLayout.measure(j, l);
	//  137  277:aload_0         
	//  138  278:getfield        #111 <Field LinearLayout mTitleLayout>
	//  139  281:iload_2         
	//  140  282:iload           4
	//  141  284:invokevirtual   #448 <Method void LinearLayout.measure(int, int)>
					int k2 = mTitleLayout.getMeasuredWidth();
	//  142  287:aload_0         
	//  143  288:getfield        #111 <Field LinearLayout mTitleLayout>
	//  144  291:invokevirtual   #451 <Method int LinearLayout.getMeasuredWidth()>
	//  145  294:istore          8
					if(k2 <= i)
	//* 146  296:iload           8
	//* 147  298:iload_1         
	//* 148  299:icmpgt          308
						l = 1;
	//  149  302:iconst_1        
	//  150  303:istore          4
					else
	//* 151  305:goto            311
						l = 0;
	//  152  308:iconst_0        
	//  153  309:istore          4
					j = i;
	//  154  311:iload_1         
	//  155  312:istore_2        
					if(l != 0)
	//* 156  313:iload           4
	//* 157  315:ifeq            323
						j = i - k2;
	//  158  318:iload_1         
	//  159  319:iload           8
	//  160  321:isub            
	//  161  322:istore_2        
					LinearLayout linearlayout = mTitleLayout;
	//  162  323:aload_0         
	//  163  324:getfield        #111 <Field LinearLayout mTitleLayout>
	//  164  327:astore          9
					if(l != 0)
	//* 165  329:iload           4
	//* 166  331:ifeq            339
						i = 0;
	//  167  334:iconst_0        
	//  168  335:istore_1        
					else
	//* 169  336:goto            342
						i = 8;
	//  170  339:bipush          8
	//  171  341:istore_1        
					linearlayout.setVisibility(i);
	//  172  342:aload           9
	//  173  344:iload_1         
	//  174  345:invokevirtual   #178 <Method void LinearLayout.setVisibility(int)>
				} else
	//* 175  348:goto            364
				{
					j = measureChildView(((View) (mTitleLayout)), i, l, 0);
	//  176  351:aload_0         
	//  177  352:aload_0         
	//  178  353:getfield        #111 <Field LinearLayout mTitleLayout>
	//  179  356:iload_1         
	//  180  357:iload           4
	//  181  359:iconst_0        
	//  182  360:invokevirtual   #444 <Method int measureChildView(View, int, int, int)>
	//  183  363:istore_2        
				}
		}
		if(mCustomView != null)
	//* 184  364:aload_0         
	//* 185  365:getfield        #306 <Field View mCustomView>
	//* 186  368:ifnull          487
		{
			android.view.ViewGroup.LayoutParams layoutparams = mCustomView.getLayoutParams();
	//  187  371:aload_0         
	//  188  372:getfield        #306 <Field View mCustomView>
	//  189  375:invokevirtual   #385 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//  190  378:astore          9
			if(layoutparams.width != -2)
	//* 191  380:aload           9
	//* 192  382:getfield        #454 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 193  385:bipush          -2
	//* 194  387:icmpeq          397
				i = 0x40000000;
	//  195  390:ldc2            #408 <Int 0x40000000>
	//  196  393:istore_1        
			else
	//* 197  394:goto            401
				i = 0x80000000;
	//  198  397:ldc2            #437 <Int 0x80000000>
	//  199  400:istore_1        
			if(layoutparams.width >= 0)
	//* 200  401:aload           9
	//* 201  403:getfield        #454 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 202  406:iflt            422
				j = Math.min(layoutparams.width, j);
	//  203  409:aload           9
	//  204  411:getfield        #454 <Field int android.view.ViewGroup$LayoutParams.width>
	//  205  414:iload_2         
	//  206  415:invokestatic    #459 <Method int Math.min(int, int)>
	//  207  418:istore_2        
	//* 208  419:goto            422
			int i1;
			if(layoutparams.height != -2)
	//* 209  422:aload           9
	//* 210  424:getfield        #462 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 211  427:bipush          -2
	//* 212  429:icmpeq          440
				i1 = 0x40000000;
	//  213  432:ldc2            #408 <Int 0x40000000>
	//  214  435:istore          4
			else
	//* 215  437:goto            445
				i1 = 0x80000000;
	//  216  440:ldc2            #437 <Int 0x80000000>
	//  217  443:istore          4
			if(layoutparams.height >= 0)
	//* 218  445:aload           9
	//* 219  447:getfield        #462 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 220  450:iflt            468
				k1 = Math.min(layoutparams.height, k1);
	//  221  453:aload           9
	//  222  455:getfield        #462 <Field int android.view.ViewGroup$LayoutParams.height>
	//  223  458:iload           5
	//  224  460:invokestatic    #459 <Method int Math.min(int, int)>
	//  225  463:istore          5
	//* 226  465:goto            468
			mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(j, i), android.view.View.MeasureSpec.makeMeasureSpec(k1, i1));
	//  227  468:aload_0         
	//  228  469:getfield        #306 <Field View mCustomView>
	//  229  472:iload_2         
	//  230  473:iload_1         
	//  231  474:invokestatic    #440 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  232  477:iload           5
	//  233  479:iload           4
	//  234  481:invokestatic    #440 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//  235  484:invokevirtual   #463 <Method void View.measure(int, int)>
		}
		if(mContentHeight <= 0)
	//* 236  487:aload_0         
	//* 237  488:getfield        #94  <Field int mContentHeight>
	//* 238  491:ifgt            551
		{
			j = 0;
	//  239  494:iconst_0        
	//  240  495:istore_2        
			int l1 = getChildCount();
	//  241  496:aload_0         
	//  242  497:invokevirtual   #132 <Method int getChildCount()>
	//  243  500:istore          5
			for(i = 0; i < l1;)
	//* 244  502:iconst_0        
	//* 245  503:istore_1        
	//* 246  504:iload_1         
	//* 247  505:iload           5
	//* 248  507:icmpge          543
			{
				int j1 = getChildAt(i).getMeasuredHeight() + j2;
	//  249  510:aload_0         
	//  250  511:iload_1         
	//  251  512:invokevirtual   #136 <Method View getChildAt(int)>
	//  252  515:invokevirtual   #466 <Method int View.getMeasuredHeight()>
	//  253  518:iload           7
	//  254  520:iadd            
	//  255  521:istore          4
				k = j;
	//  256  523:iload_2         
	//  257  524:istore_3        
				if(j1 > j)
	//* 258  525:iload           4
	//* 259  527:iload_2         
	//* 260  528:icmple          534
					k = j1;
	//  261  531:iload           4
	//  262  533:istore_3        
				i++;
	//  263  534:iload_1         
	//  264  535:iconst_1        
	//  265  536:iadd            
	//  266  537:istore_1        
				j = k;
	//  267  538:iload_3         
	//  268  539:istore_2        
			}

	//* 269  540:goto            504
			setMeasuredDimension(i2, j);
	//  270  543:aload_0         
	//  271  544:iload           6
	//  272  546:iload_2         
	//  273  547:invokevirtual   #469 <Method void setMeasuredDimension(int, int)>
			return;
	//  274  550:return          
		} else
		{
			setMeasuredDimension(i2, k);
	//  275  551:aload_0         
	//  276  552:iload           6
	//  277  554:iload_3         
	//  278  555:invokevirtual   #469 <Method void setMeasuredDimension(int, int)>
			return;
	//  279  558:return          
		}
	}

	public volatile boolean onTouchEvent(MotionEvent motionevent)
	{
		return super.onTouchEvent(motionevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #472 <Method boolean AbsActionBarView.onTouchEvent(MotionEvent)>
	//    3    5:ireturn         
	}

	public volatile void postShowOverflowMenu()
	{
		super.postShowOverflowMenu();
	//    0    0:aload_0         
	//    1    1:invokespecial   #475 <Method void AbsActionBarView.postShowOverflowMenu()>
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
	//    6   12:invokevirtual   #480 <Method void removeView(View)>
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
	//   18   36:invokevirtual   #480 <Method void removeView(View)>
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
	//   28   54:invokevirtual   #483 <Method void requestLayout()>
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
	//    4    6:invokespecial   #486 <Method void initTitle()>
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
	//    4    6:invokespecial   #486 <Method void initTitle()>
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
	//    5    9:invokevirtual   #483 <Method void requestLayout()>
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
	//    2    2:invokespecial   #489 <Method void AbsActionBarView.setVisibility(int)>
	//    3    5:return          
	}

	public volatile ViewPropertyAnimatorCompat setupAnimatorToVisibility(int i, long l)
	{
		return super.setupAnimatorToVisibility(i, l);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #493 <Method ViewPropertyAnimatorCompat AbsActionBarView.setupAnimatorToVisibility(int, long)>
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
	//    5   11:invokevirtual   #497 <Method boolean ActionMenuPresenter.showOverflowMenu()>
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
