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
			boolean flag = true;
	//    2    4:iconst_1        
	//    3    5:istore_2        
			if(mTitleLayout == null)
	//*   4    6:aload_0         
	//*   5    7:getfield        #111 <Field LinearLayout mTitleLayout>
	//*   6   10:ifnonnull       123
			{
				LayoutInflater.from(getContext()).inflate(android.support.v7.appcompat.R.layout.abc_action_bar_title_item, ((android.view.ViewGroup) (this)));
	//    7   13:aload_0         
	//    8   14:invokevirtual   #115 <Method Context getContext()>
	//    9   17:invokestatic    #121 <Method LayoutInflater LayoutInflater.from(Context)>
	//   10   20:getstatic       #124 <Field int android.support.v7.appcompat.R$layout.abc_action_bar_title_item>
	//   11   23:aload_0         
	//   12   24:invokevirtual   #128 <Method View LayoutInflater.inflate(int, android.view.ViewGroup)>
	//   13   27:pop             
				mTitleLayout = (LinearLayout)getChildAt(getChildCount() - 1);
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:aload_0         
	//   17   31:invokevirtual   #132 <Method int getChildCount()>
	//   18   34:iconst_1        
	//   19   35:isub            
	//   20   36:invokevirtual   #136 <Method View getChildAt(int)>
	//   21   39:checkcast       #138 <Class LinearLayout>
	//   22   42:putfield        #111 <Field LinearLayout mTitleLayout>
				mTitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_title);
	//   23   45:aload_0         
	//   24   46:aload_0         
	//   25   47:getfield        #111 <Field LinearLayout mTitleLayout>
	//   26   50:getstatic       #143 <Field int android.support.v7.appcompat.R$id.action_bar_title>
	//   27   53:invokevirtual   #146 <Method View LinearLayout.findViewById(int)>
	//   28   56:checkcast       #148 <Class TextView>
	//   29   59:putfield        #150 <Field TextView mTitleView>
				mSubtitleView = (TextView)mTitleLayout.findViewById(android.support.v7.appcompat.R.id.action_bar_subtitle);
	//   30   62:aload_0         
	//   31   63:aload_0         
	//   32   64:getfield        #111 <Field LinearLayout mTitleLayout>
	//   33   67:getstatic       #153 <Field int android.support.v7.appcompat.R$id.action_bar_subtitle>
	//   34   70:invokevirtual   #146 <Method View LinearLayout.findViewById(int)>
	//   35   73:checkcast       #148 <Class TextView>
	//   36   76:putfield        #155 <Field TextView mSubtitleView>
				if(mTitleStyleRes != 0)
	//*  37   79:aload_0         
	//*  38   80:getfield        #80  <Field int mTitleStyleRes>
	//*  39   83:ifeq            101
					mTitleView.setTextAppearance(getContext(), mTitleStyleRes);
	//   40   86:aload_0         
	//   41   87:getfield        #150 <Field TextView mTitleView>
	//   42   90:aload_0         
	//   43   91:invokevirtual   #115 <Method Context getContext()>
	//   44   94:aload_0         
	//   45   95:getfield        #80  <Field int mTitleStyleRes>
	//   46   98:invokevirtual   #159 <Method void TextView.setTextAppearance(Context, int)>
				if(mSubtitleStyleRes != 0)
	//*  47  101:aload_0         
	//*  48  102:getfield        #85  <Field int mSubtitleStyleRes>
	//*  49  105:ifeq            123
					mSubtitleView.setTextAppearance(getContext(), mSubtitleStyleRes);
	//   50  108:aload_0         
	//   51  109:getfield        #155 <Field TextView mSubtitleView>
	//   52  112:aload_0         
	//   53  113:invokevirtual   #115 <Method Context getContext()>
	//   54  116:aload_0         
	//   55  117:getfield        #85  <Field int mSubtitleStyleRes>
	//   56  120:invokevirtual   #159 <Method void TextView.setTextAppearance(Context, int)>
			}
			mTitleView.setText(mTitle);
	//   57  123:aload_0         
	//   58  124:getfield        #150 <Field TextView mTitleView>
	//   59  127:aload_0         
	//   60  128:getfield        #161 <Field CharSequence mTitle>
	//   61  131:invokevirtual   #165 <Method void TextView.setText(CharSequence)>
			mSubtitleView.setText(mSubtitle);
	//   62  134:aload_0         
	//   63  135:getfield        #155 <Field TextView mSubtitleView>
	//   64  138:aload_0         
	//   65  139:getfield        #167 <Field CharSequence mSubtitle>
	//   66  142:invokevirtual   #165 <Method void TextView.setText(CharSequence)>
			byte byte0;
			int i;
			Object obj;
			if(!TextUtils.isEmpty(mTitle))
	//*  67  145:aload_0         
	//*  68  146:getfield        #161 <Field CharSequence mTitle>
	//*  69  149:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  70  152:ifne            229
				byte0 = 1;
	//   71  155:iconst_1        
	//   72  156:istore_1        
			else
	//*  73  157:aload_0         
	//*  74  158:getfield        #167 <Field CharSequence mSubtitle>
	//*  75  161:invokestatic    #173 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  76  164:ifne            234
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
			if(TextUtils.isEmpty(mSubtitle))
	//* 112  231:goto            157
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
	//*   4    6:ifeq            243
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
	//*  25   42:aload_0         
	//*  26   43:getfield        #196 <Field View mClose>
	//*  27   46:ifnull          289
	//*  28   49:aload_0         
	//*  29   50:getfield        #196 <Field View mClose>
	//*  30   53:invokevirtual   #374 <Method int View.getVisibility()>
	//*  31   56:bipush          8
	//*  32   58:icmpeq          289
	//*  33   61:aload_0         
	//*  34   62:getfield        #196 <Field View mClose>
	//*  35   65:invokevirtual   #377 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  36   68:checkcast       #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  37   71:astore          9
	//*  38   73:iload_1         
	//*  39   74:ifeq            252
	//*  40   77:aload           9
	//*  41   79:getfield        #380 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//*  42   82:istore_3        
	//*  43   83:iload_1         
	//*  44   84:ifeq            261
	//*  45   87:aload           9
	//*  46   89:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//*  47   92:istore          5
	//*  48   94:iload           6
	//*  49   96:iload_3         
	//*  50   97:iload_1         
	//*  51   98:invokestatic    #387 <Method int next(int, int, boolean)>
	//*  52  101:istore_3        
	//*  53  102:aload_0         
	//*  54  103:aload_0         
	//*  55  104:getfield        #196 <Field View mClose>
	//*  56  107:iload_3         
	//*  57  108:iload           7
	//*  58  110:iload           8
	//*  59  112:iload_1         
	//*  60  113:invokevirtual   #391 <Method int positionChild(View, int, int, int, boolean)>
	//*  61  116:iload_3         
	//*  62  117:iadd            
	//*  63  118:iload           5
	//*  64  120:iload_1         
	//*  65  121:invokestatic    #387 <Method int next(int, int, boolean)>
	//*  66  124:istore_3        
	//*  67  125:iload_3         
	//*  68  126:istore          5
	//*  69  128:aload_0         
	//*  70  129:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  71  132:ifnull          178
	//*  72  135:iload_3         
	//*  73  136:istore          5
	//*  74  138:aload_0         
	//*  75  139:getfield        #306 <Field View mCustomView>
	//*  76  142:ifnonnull       178
	//*  77  145:iload_3         
	//*  78  146:istore          5
	//*  79  148:aload_0         
	//*  80  149:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  81  152:invokevirtual   #392 <Method int LinearLayout.getVisibility()>
	//*  82  155:bipush          8
	//*  83  157:icmpeq          178
	//*  84  160:iload_3         
	//*  85  161:aload_0         
	//*  86  162:aload_0         
	//*  87  163:getfield        #111 <Field LinearLayout mTitleLayout>
	//*  88  166:iload_3         
	//*  89  167:iload           7
	//*  90  169:iload           8
	//*  91  171:iload_1         
	//*  92  172:invokevirtual   #391 <Method int positionChild(View, int, int, int, boolean)>
	//*  93  175:iadd            
	//*  94  176:istore          5
	//*  95  178:aload_0         
	//*  96  179:getfield        #306 <Field View mCustomView>
	//*  97  182:ifnull          201
	//*  98  185:aload_0         
	//*  99  186:aload_0         
	//* 100  187:getfield        #306 <Field View mCustomView>
	//* 101  190:iload           5
	//* 102  192:iload           7
	//* 103  194:iload           8
	//* 104  196:iload_1         
	//* 105  197:invokevirtual   #391 <Method int positionChild(View, int, int, int, boolean)>
	//* 106  200:pop             
	//* 107  201:iload_1         
	//* 108  202:ifeq            271
	//* 109  205:aload_0         
	//* 110  206:invokevirtual   #395 <Method int getPaddingLeft()>
	//* 111  209:istore_2        
	//* 112  210:aload_0         
	//* 113  211:getfield        #285 <Field ActionMenuView mMenuView>
	//* 114  214:ifnull          242
	//* 115  217:aload_0         
	//* 116  218:getfield        #285 <Field ActionMenuView mMenuView>
	//* 117  221:astore          9
	//* 118  223:iload_1         
	//* 119  224:ifne            284
	//* 120  227:iconst_1        
	//* 121  228:istore_1        
	//* 122  229:aload_0         
	//* 123  230:aload           9
	//* 124  232:iload_2         
	//* 125  233:iload           7
	//* 126  235:iload           8
	//* 127  237:iload_1         
	//* 128  238:invokevirtual   #391 <Method int positionChild(View, int, int, int, boolean)>
	//* 129  241:pop             
	//* 130  242:return          
			i1 = getPaddingLeft();
	//  131  243:aload_0         
	//  132  244:invokevirtual   #395 <Method int getPaddingLeft()>
	//  133  247:istore          6
		j1 = getPaddingTop();
		k1 = l - j - getPaddingTop() - getPaddingBottom();
		if(mClose != null && mClose.getVisibility() != 8)
		{
			Object obj = ((Object) ((android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams()));
			if(flag)
				j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
			else
	//* 134  249:goto            20
				j = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
	//  135  252:aload           9
	//  136  254:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//  137  257:istore_3        
			if(flag)
				l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).leftMargin;
			else
	//* 138  258:goto            83
				l = ((android.view.ViewGroup.MarginLayoutParams) (obj)).rightMargin;
	//  139  261:aload           9
	//  140  263:getfield        #380 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//  141  266:istore          5
			j = next(i1, j, flag);
			j = next(positionChild(mClose, j, j1, k1, flag) + j, l, flag);
		} else
	//* 142  268:goto            94
	//* 143  271:iload           4
	//* 144  273:iload_2         
	//* 145  274:isub            
	//* 146  275:aload_0         
	//* 147  276:invokevirtual   #365 <Method int getPaddingRight()>
	//* 148  279:isub            
	//* 149  280:istore_2        
	//* 150  281:goto            210
	//* 151  284:iconst_0        
	//* 152  285:istore_1        
	//* 153  286:goto            229
		{
			j = i1;
	//  154  289:iload           6
	//  155  291:istore_3        
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
			i = k - i - getPaddingRight();
		if(mMenuView != null)
		{
			obj = ((Object) (mMenuView));
			if(!flag)
				flag = true;
			else
				flag = false;
			positionChild(((View) (obj)), i, j1, k1, flag);
		}
	//* 156  292:goto            125
	}

	protected void onMeasure(int i, int j)
	{
		int i1 = 0x40000000;
	//    0    0:ldc2            #397 <Int 0x40000000>
	//    1    3:istore          5
		boolean flag = false;
	//    2    5:iconst_0        
	//    3    6:istore          6
		if(android.view.View.MeasureSpec.getMode(i) != 0x40000000)
	//*   4    8:iload_1         
	//*   5    9:invokestatic    #403 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*   6   12:ldc2            #397 <Int 0x40000000>
	//*   7   15:icmpeq          58
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" can only be used ").append("with android:layout_width=\"match_parent\" (or fill_parent)").toString());
	//    8   18:new             #405 <Class IllegalStateException>
	//    9   21:dup             
	//   10   22:new             #407 <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #409 <Method void StringBuilder()>
	//   13   29:aload_0         
	//   14   30:invokevirtual   #332 <Method Class Object.getClass()>
	//   15   33:invokevirtual   #412 <Method String Class.getSimpleName()>
	//   16   36:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   17   39:ldc2            #418 <String " can only be used ">
	//   18   42:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   19   45:ldc2            #420 <String "with android:layout_width=\"match_parent\" (or fill_parent)">
	//   20   48:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   21   51:invokevirtual   #423 <Method String StringBuilder.toString()>
	//   22   54:invokespecial   #426 <Method void IllegalStateException(String)>
	//   23   57:athrow          
		if(android.view.View.MeasureSpec.getMode(j) == 0)
	//*  24   58:iload_2         
	//*  25   59:invokestatic    #403 <Method int android.view.View$MeasureSpec.getMode(int)>
	//*  26   62:ifne            105
			throw new IllegalStateException((new StringBuilder()).append(((Object)this).getClass().getSimpleName()).append(" can only be used ").append("with android:layout_height=\"wrap_content\"").toString());
	//   27   65:new             #405 <Class IllegalStateException>
	//   28   68:dup             
	//   29   69:new             #407 <Class StringBuilder>
	//   30   72:dup             
	//   31   73:invokespecial   #409 <Method void StringBuilder()>
	//   32   76:aload_0         
	//   33   77:invokevirtual   #332 <Method Class Object.getClass()>
	//   34   80:invokevirtual   #412 <Method String Class.getSimpleName()>
	//   35   83:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   36   86:ldc2            #418 <String " can only be used ">
	//   37   89:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   38   92:ldc2            #428 <String "with android:layout_height=\"wrap_content\"">
	//   39   95:invokevirtual   #416 <Method StringBuilder StringBuilder.append(String)>
	//   40   98:invokevirtual   #423 <Method String StringBuilder.toString()>
	//   41  101:invokespecial   #426 <Method void IllegalStateException(String)>
	//   42  104:athrow          
		int k1 = android.view.View.MeasureSpec.getSize(i);
	//   43  105:iload_1         
	//   44  106:invokestatic    #431 <Method int android.view.View$MeasureSpec.getSize(int)>
	//   45  109:istore          8
		int k;
		int l;
		int j1;
		int l1;
		if(mContentHeight > 0)
	//*  46  111:aload_0         
	//*  47  112:getfield        #94  <Field int mContentHeight>
	//*  48  115:ifle            492
			k = mContentHeight;
	//   49  118:aload_0         
	//   50  119:getfield        #94  <Field int mContentHeight>
	//   51  122:istore_3        
		else
	//*  52  123:aload_0         
	//*  53  124:invokevirtual   #368 <Method int getPaddingTop()>
	//*  54  127:aload_0         
	//*  55  128:invokevirtual   #371 <Method int getPaddingBottom()>
	//*  56  131:iadd            
	//*  57  132:istore          9
	//*  58  134:iload           8
	//*  59  136:aload_0         
	//*  60  137:invokevirtual   #395 <Method int getPaddingLeft()>
	//*  61  140:isub            
	//*  62  141:aload_0         
	//*  63  142:invokevirtual   #365 <Method int getPaddingRight()>
	//*  64  145:isub            
	//*  65  146:istore_1        
	//*  66  147:iload_3         
	//*  67  148:iload           9
	//*  68  150:isub            
	//*  69  151:istore          7
	//*  70  153:iload           7
	//*  71  155:ldc2            #432 <Int 0x80000000>
	//*  72  158:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//*  73  161:istore          4
	//*  74  163:iload_1         
	//*  75  164:istore_2        
	//*  76  165:aload_0         
	//*  77  166:getfield        #196 <Field View mClose>
	//*  78  169:ifnull          213
	//*  79  172:aload_0         
	//*  80  173:aload_0         
	//*  81  174:getfield        #196 <Field View mClose>
	//*  82  177:iload_1         
	//*  83  178:iload           4
	//*  84  180:iconst_0        
	//*  85  181:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//*  86  184:istore_1        
	//*  87  185:aload_0         
	//*  88  186:getfield        #196 <Field View mClose>
	//*  89  189:invokevirtual   #377 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//*  90  192:checkcast       #206 <Class android.view.ViewGroup$MarginLayoutParams>
	//*  91  195:astore          11
	//*  92  197:aload           11
	//*  93  199:getfield        #383 <Field int android.view.ViewGroup$MarginLayoutParams.leftMargin>
	//*  94  202:istore_2        
	//*  95  203:iload_1         
	//*  96  204:aload           11
	//*  97  206:getfield        #380 <Field int android.view.ViewGroup$MarginLayoutParams.rightMargin>
	//*  98  209:iload_2         
	//*  99  210:iadd            
	//* 100  211:isub            
	//* 101  212:istore_2        
	//* 102  213:iload_2         
	//* 103  214:istore_1        
	//* 104  215:aload_0         
	//* 105  216:getfield        #285 <Field ActionMenuView mMenuView>
	//* 106  219:ifnull          248
	//* 107  222:iload_2         
	//* 108  223:istore_1        
	//* 109  224:aload_0         
	//* 110  225:getfield        #285 <Field ActionMenuView mMenuView>
	//* 111  228:invokevirtual   #440 <Method android.view.ViewParent ActionMenuView.getParent()>
	//* 112  231:aload_0         
	//* 113  232:if_acmpne       248
	//* 114  235:aload_0         
	//* 115  236:aload_0         
	//* 116  237:getfield        #285 <Field ActionMenuView mMenuView>
	//* 117  240:iload_2         
	//* 118  241:iload           4
	//* 119  243:iconst_0        
	//* 120  244:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//* 121  247:istore_1        
	//* 122  248:iload_1         
	//* 123  249:istore_2        
	//* 124  250:aload_0         
	//* 125  251:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 126  254:ifnull          338
	//* 127  257:iload_1         
	//* 128  258:istore_2        
	//* 129  259:aload_0         
	//* 130  260:getfield        #306 <Field View mCustomView>
	//* 131  263:ifnonnull       338
	//* 132  266:aload_0         
	//* 133  267:getfield        #301 <Field boolean mTitleOptional>
	//* 134  270:ifeq            512
	//* 135  273:iconst_0        
	//* 136  274:iconst_0        
	//* 137  275:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 138  278:istore_2        
	//* 139  279:aload_0         
	//* 140  280:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 141  283:iload_2         
	//* 142  284:iload           4
	//* 143  286:invokevirtual   #443 <Method void LinearLayout.measure(int, int)>
	//* 144  289:aload_0         
	//* 145  290:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 146  293:invokevirtual   #446 <Method int LinearLayout.getMeasuredWidth()>
	//* 147  296:istore          10
	//* 148  298:iload           10
	//* 149  300:iload_1         
	//* 150  301:icmpgt          500
	//* 151  304:iconst_1        
	//* 152  305:istore          4
	//* 153  307:iload_1         
	//* 154  308:istore_2        
	//* 155  309:iload           4
	//* 156  311:ifeq            319
	//* 157  314:iload_1         
	//* 158  315:iload           10
	//* 159  317:isub            
	//* 160  318:istore_2        
	//* 161  319:aload_0         
	//* 162  320:getfield        #111 <Field LinearLayout mTitleLayout>
	//* 163  323:astore          11
	//* 164  325:iload           4
	//* 165  327:ifeq            506
	//* 166  330:iconst_0        
	//* 167  331:istore_1        
	//* 168  332:aload           11
	//* 169  334:iload_1         
	//* 170  335:invokevirtual   #178 <Method void LinearLayout.setVisibility(int)>
	//* 171  338:aload_0         
	//* 172  339:getfield        #306 <Field View mCustomView>
	//* 173  342:ifnull          442
	//* 174  345:aload_0         
	//* 175  346:getfield        #306 <Field View mCustomView>
	//* 176  349:invokevirtual   #377 <Method android.view.ViewGroup$LayoutParams View.getLayoutParams()>
	//* 177  352:astore          11
	//* 178  354:aload           11
	//* 179  356:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 180  359:bipush          -2
	//* 181  361:icmpeq          528
	//* 182  364:ldc2            #397 <Int 0x40000000>
	//* 183  367:istore_1        
	//* 184  368:iload_2         
	//* 185  369:istore          4
	//* 186  371:aload           11
	//* 187  373:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 188  376:iflt            390
	//* 189  379:aload           11
	//* 190  381:getfield        #449 <Field int android.view.ViewGroup$LayoutParams.width>
	//* 191  384:iload_2         
	//* 192  385:invokestatic    #454 <Method int Math.min(int, int)>
	//* 193  388:istore          4
	//* 194  390:aload           11
	//* 195  392:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 196  395:bipush          -2
	//* 197  397:icmpeq          535
	//* 198  400:iload           5
	//* 199  402:istore_2        
	//* 200  403:aload           11
	//* 201  405:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 202  408:iflt            542
	//* 203  411:aload           11
	//* 204  413:getfield        #457 <Field int android.view.ViewGroup$LayoutParams.height>
	//* 205  416:iload           7
	//* 206  418:invokestatic    #454 <Method int Math.min(int, int)>
	//* 207  421:istore          5
	//* 208  423:aload_0         
	//* 209  424:getfield        #306 <Field View mCustomView>
	//* 210  427:iload           4
	//* 211  429:iload_1         
	//* 212  430:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 213  433:iload           5
	//* 214  435:iload_2         
	//* 215  436:invokestatic    #435 <Method int android.view.View$MeasureSpec.makeMeasureSpec(int, int)>
	//* 216  439:invokevirtual   #458 <Method void View.measure(int, int)>
	//* 217  442:aload_0         
	//* 218  443:getfield        #94  <Field int mContentHeight>
	//* 219  446:ifgt            557
	//* 220  449:aload_0         
	//* 221  450:invokevirtual   #132 <Method int getChildCount()>
	//* 222  453:istore          4
	//* 223  455:iconst_0        
	//* 224  456:istore_1        
	//* 225  457:iload           6
	//* 226  459:istore_2        
	//* 227  460:iload_2         
	//* 228  461:iload           4
	//* 229  463:icmpge          549
	//* 230  466:aload_0         
	//* 231  467:iload_2         
	//* 232  468:invokevirtual   #136 <Method View getChildAt(int)>
	//* 233  471:invokevirtual   #461 <Method int View.getMeasuredHeight()>
	//* 234  474:iload           9
	//* 235  476:iadd            
	//* 236  477:istore_3        
	//* 237  478:iload_3         
	//* 238  479:iload_1         
	//* 239  480:icmple          565
	//* 240  483:iload_3         
	//* 241  484:istore_1        
	//* 242  485:iload_2         
	//* 243  486:iconst_1        
	//* 244  487:iadd            
	//* 245  488:istore_2        
	//* 246  489:goto            460
			k = android.view.View.MeasureSpec.getSize(j);
	//  247  492:iload_2         
	//  248  493:invokestatic    #431 <Method int android.view.View$MeasureSpec.getSize(int)>
	//  249  496:istore_3        
		l1 = getPaddingTop() + getPaddingBottom();
		i = k1 - getPaddingLeft() - getPaddingRight();
		j1 = k - l1;
		l = android.view.View.MeasureSpec.makeMeasureSpec(j1, 0x80000000);
		j = i;
		if(mClose != null)
		{
			i = measureChildView(mClose, i, l, 0);
			android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)mClose.getLayoutParams();
			j = marginlayoutparams.leftMargin;
			j = i - (marginlayoutparams.rightMargin + j);
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
					int i2 = mTitleLayout.getMeasuredWidth();
					Object obj;
					if(i2 <= i)
						l = 1;
					else
	//* 250  497:goto            123
						l = 0;
	//  251  500:iconst_0        
	//  252  501:istore          4
					j = i;
					if(l != 0)
						j = i - i2;
					obj = ((Object) (mTitleLayout));
					if(l != 0)
						i = 0;
					else
	//* 253  503:goto            307
						i = 8;
	//  254  506:bipush          8
	//  255  508:istore_1        
					((LinearLayout) (obj)).setVisibility(i);
				} else
	//* 256  509:goto            332
				{
					j = measureChildView(((View) (mTitleLayout)), i, l, 0);
	//  257  512:aload_0         
	//  258  513:aload_0         
	//  259  514:getfield        #111 <Field LinearLayout mTitleLayout>
	//  260  517:iload_1         
	//  261  518:iload           4
	//  262  520:iconst_0        
	//  263  521:invokevirtual   #439 <Method int measureChildView(View, int, int, int)>
	//  264  524:istore_2        
				}
		}
		if(mCustomView != null)
		{
			obj = ((Object) (mCustomView.getLayoutParams()));
			if(((android.view.ViewGroup.LayoutParams) (obj)).width != -2)
				i = 0x40000000;
			else
	//* 265  525:goto            338
				i = 0x80000000;
	//  266  528:ldc2            #432 <Int 0x80000000>
	//  267  531:istore_1        
			l = j;
			if(((android.view.ViewGroup.LayoutParams) (obj)).width >= 0)
				l = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).width, j);
			if(((android.view.ViewGroup.LayoutParams) (obj)).height != -2)
				j = i1;
			else
	//* 268  532:goto            368
				j = 0x80000000;
	//  269  535:ldc2            #432 <Int 0x80000000>
	//  270  538:istore_2        
			if(((android.view.ViewGroup.LayoutParams) (obj)).height >= 0)
				i1 = Math.min(((android.view.ViewGroup.LayoutParams) (obj)).height, j1);
			else
	//* 271  539:goto            403
				i1 = j1;
	//  272  542:iload           7
	//  273  544:istore          5
			mCustomView.measure(android.view.View.MeasureSpec.makeMeasureSpec(l, i), android.view.View.MeasureSpec.makeMeasureSpec(i1, j));
		}
		if(mContentHeight <= 0)
		{
			l = getChildCount();
			i = 0;
			for(j = ((int) (flag)); j < l; j++)
			{
				k = getChildAt(j).getMeasuredHeight() + l1;
				if(k > i)
					i = k;
			}

	//* 274  546:goto            423
			setMeasuredDimension(k1, i);
	//  275  549:aload_0         
	//  276  550:iload           8
	//  277  552:iload_1         
	//  278  553:invokevirtual   #464 <Method void setMeasuredDimension(int, int)>
			return;
	//  279  556:return          
		} else
		{
			setMeasuredDimension(k1, k);
	//  280  557:aload_0         
	//  281  558:iload           8
	//  282  560:iload_3         
	//  283  561:invokevirtual   #464 <Method void setMeasuredDimension(int, int)>
			return;
	//  284  564:return          
		}
	//* 285  565:goto            485
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
