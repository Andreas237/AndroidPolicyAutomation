// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v7.widget.MenuPopupWindow;
import android.util.DisplayMetrics;
import android.view.*;
import android.widget.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuPopup, MenuPresenter, MenuAdapter, MenuBuilder, 
//			SubMenuBuilder, MenuPopupHelper

final class StandardMenuPopup extends MenuPopup
	implements android.widget.PopupWindow.OnDismissListener, android.widget.AdapterView.OnItemClickListener, MenuPresenter, android.view.View.OnKeyListener
{

	public StandardMenuPopup(Context context, MenuBuilder menubuilder, View view, int i, int j, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #53  <Method void MenuPopup()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class StandardMenuPopup$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #56  <Method void StandardMenuPopup$1(StandardMenuPopup)>
	//    7   13:putfield        #58  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//    8   16:aload_0         
	//    9   17:new             #16  <Class StandardMenuPopup$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #59  <Method void StandardMenuPopup$2(StandardMenuPopup)>
	//   13   25:putfield        #61  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
		mDropDownGravity = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #63  <Field int mDropDownGravity>
		mContext = context;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:putfield        #65  <Field Context mContext>
		mMenu = menubuilder;
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:putfield        #67  <Field MenuBuilder mMenu>
		mOverflowOnly = flag;
	//   23   43:aload_0         
	//   24   44:iload           6
	//   25   46:putfield        #69  <Field boolean mOverflowOnly>
		mAdapter = new MenuAdapter(menubuilder, LayoutInflater.from(context), mOverflowOnly);
	//   26   49:aload_0         
	//   27   50:new             #71  <Class MenuAdapter>
	//   28   53:dup             
	//   29   54:aload_2         
	//   30   55:aload_1         
	//   31   56:invokestatic    #77  <Method LayoutInflater LayoutInflater.from(Context)>
	//   32   59:aload_0         
	//   33   60:getfield        #69  <Field boolean mOverflowOnly>
	//   34   63:invokespecial   #80  <Method void MenuAdapter(MenuBuilder, LayoutInflater, boolean)>
	//   35   66:putfield        #82  <Field MenuAdapter mAdapter>
		mPopupStyleAttr = i;
	//   36   69:aload_0         
	//   37   70:iload           4
	//   38   72:putfield        #84  <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   39   75:aload_0         
	//   40   76:iload           5
	//   41   78:putfield        #86  <Field int mPopupStyleRes>
		Resources resources = context.getResources();
	//   42   81:aload_1         
	//   43   82:invokevirtual   #92  <Method Resources Context.getResources()>
	//   44   85:astore          7
		mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//   45   87:aload_0         
	//   46   88:aload           7
	//   47   90:invokevirtual   #98  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   48   93:getfield        #103 <Field int DisplayMetrics.widthPixels>
	//   49   96:iconst_2        
	//   50   97:idiv            
	//   51   98:aload           7
	//   52  100:getstatic       #108 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//   53  103:invokevirtual   #112 <Method int Resources.getDimensionPixelSize(int)>
	//   54  106:invokestatic    #118 <Method int Math.max(int, int)>
	//   55  109:putfield        #120 <Field int mPopupMaxWidth>
		mAnchorView = view;
	//   56  112:aload_0         
	//   57  113:aload_3         
	//   58  114:putfield        #122 <Field View mAnchorView>
		mPopup = new MenuPopupWindow(mContext, ((android.util.AttributeSet) (null)), mPopupStyleAttr, mPopupStyleRes);
	//   59  117:aload_0         
	//   60  118:new             #124 <Class MenuPopupWindow>
	//   61  121:dup             
	//   62  122:aload_0         
	//   63  123:getfield        #65  <Field Context mContext>
	//   64  126:aconst_null     
	//   65  127:aload_0         
	//   66  128:getfield        #84  <Field int mPopupStyleAttr>
	//   67  131:aload_0         
	//   68  132:getfield        #86  <Field int mPopupStyleRes>
	//   69  135:invokespecial   #127 <Method void MenuPopupWindow(Context, android.util.AttributeSet, int, int)>
	//   70  138:putfield        #129 <Field MenuPopupWindow mPopup>
		menubuilder.addMenuPresenter(((MenuPresenter) (this)), context);
	//   71  141:aload_2         
	//   72  142:aload_0         
	//   73  143:aload_1         
	//   74  144:invokevirtual   #135 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
	//   75  147:return          
	}

	private boolean tryShow()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #149 <Method boolean isShowing()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(mWasDismissed || mAnchorView == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #151 <Field boolean mWasDismissed>
	//*   7   13:ifne            23
	//*   8   16:aload_0         
	//*   9   17:getfield        #122 <Field View mAnchorView>
	//*  10   20:ifnonnull       25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		mShownAnchorView = mAnchorView;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #122 <Field View mAnchorView>
	//   16   30:putfield        #153 <Field View mShownAnchorView>
		mPopup.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (this)));
	//   17   33:aload_0         
	//   18   34:getfield        #129 <Field MenuPopupWindow mPopup>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #157 <Method void MenuPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		mPopup.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   21   41:aload_0         
	//   22   42:getfield        #129 <Field MenuPopupWindow mPopup>
	//   23   45:aload_0         
	//   24   46:invokevirtual   #161 <Method void MenuPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		mPopup.setModal(true);
	//   25   49:aload_0         
	//   26   50:getfield        #129 <Field MenuPopupWindow mPopup>
	//   27   53:iconst_1        
	//   28   54:invokevirtual   #165 <Method void MenuPopupWindow.setModal(boolean)>
		Object obj = ((Object) (mShownAnchorView));
	//   29   57:aload_0         
	//   30   58:getfield        #153 <Field View mShownAnchorView>
	//   31   61:astore_2        
		boolean flag;
		if(mTreeObserver == null)
	//*  32   62:aload_0         
	//*  33   63:getfield        #140 <Field ViewTreeObserver mTreeObserver>
	//*  34   66:ifnonnull       299
			flag = true;
	//   35   69:iconst_1        
	//   36   70:istore_1        
		else
	//*  37   71:aload_0         
	//*  38   72:aload_2         
	//*  39   73:invokevirtual   #171 <Method ViewTreeObserver View.getViewTreeObserver()>
	//*  40   76:putfield        #140 <Field ViewTreeObserver mTreeObserver>
	//*  41   79:iload_1         
	//*  42   80:ifeq            94
	//*  43   83:aload_0         
	//*  44   84:getfield        #140 <Field ViewTreeObserver mTreeObserver>
	//*  45   87:aload_0         
	//*  46   88:getfield        #58  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//*  47   91:invokevirtual   #177 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
	//*  48   94:aload_2         
	//*  49   95:aload_0         
	//*  50   96:getfield        #61  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//*  51   99:invokevirtual   #181 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
	//*  52  102:aload_0         
	//*  53  103:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  54  106:aload_2         
	//*  55  107:invokevirtual   #185 <Method void MenuPopupWindow.setAnchorView(View)>
	//*  56  110:aload_0         
	//*  57  111:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  58  114:aload_0         
	//*  59  115:getfield        #63  <Field int mDropDownGravity>
	//*  60  118:invokevirtual   #189 <Method void MenuPopupWindow.setDropDownGravity(int)>
	//*  61  121:aload_0         
	//*  62  122:getfield        #191 <Field boolean mHasContentWidth>
	//*  63  125:ifne            153
	//*  64  128:aload_0         
	//*  65  129:aload_0         
	//*  66  130:getfield        #82  <Field MenuAdapter mAdapter>
	//*  67  133:aconst_null     
	//*  68  134:aload_0         
	//*  69  135:getfield        #65  <Field Context mContext>
	//*  70  138:aload_0         
	//*  71  139:getfield        #120 <Field int mPopupMaxWidth>
	//*  72  142:invokestatic    #195 <Method int measureIndividualMenuWidth(android.widget.ListAdapter, android.view.ViewGroup, Context, int)>
	//*  73  145:putfield        #197 <Field int mContentWidth>
	//*  74  148:aload_0         
	//*  75  149:iconst_1        
	//*  76  150:putfield        #191 <Field boolean mHasContentWidth>
	//*  77  153:aload_0         
	//*  78  154:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  79  157:aload_0         
	//*  80  158:getfield        #197 <Field int mContentWidth>
	//*  81  161:invokevirtual   #200 <Method void MenuPopupWindow.setContentWidth(int)>
	//*  82  164:aload_0         
	//*  83  165:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  84  168:iconst_2        
	//*  85  169:invokevirtual   #203 <Method void MenuPopupWindow.setInputMethodMode(int)>
	//*  86  172:aload_0         
	//*  87  173:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  88  176:aload_0         
	//*  89  177:invokevirtual   #207 <Method android.graphics.Rect getEpicenterBounds()>
	//*  90  180:invokevirtual   #211 <Method void MenuPopupWindow.setEpicenterBounds(android.graphics.Rect)>
	//*  91  183:aload_0         
	//*  92  184:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  93  187:invokevirtual   #214 <Method void MenuPopupWindow.show()>
	//*  94  190:aload_0         
	//*  95  191:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  96  194:invokevirtual   #218 <Method ListView MenuPopupWindow.getListView()>
	//*  97  197:astore_2        
	//*  98  198:aload_2         
	//*  99  199:aload_0         
	//* 100  200:invokevirtual   #224 <Method void ListView.setOnKeyListener(android.view.View$OnKeyListener)>
	//* 101  203:aload_0         
	//* 102  204:getfield        #226 <Field boolean mShowTitle>
	//* 103  207:ifeq            279
	//* 104  210:aload_0         
	//* 105  211:getfield        #67  <Field MenuBuilder mMenu>
	//* 106  214:invokevirtual   #230 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//* 107  217:ifnull          279
	//* 108  220:aload_0         
	//* 109  221:getfield        #65  <Field Context mContext>
	//* 110  224:invokestatic    #77  <Method LayoutInflater LayoutInflater.from(Context)>
	//* 111  227:getstatic       #235 <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_header_item_layout>
	//* 112  230:aload_2         
	//* 113  231:iconst_0        
	//* 114  232:invokevirtual   #239 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//* 115  235:checkcast       #241 <Class FrameLayout>
	//* 116  238:astore_3        
	//* 117  239:aload_3         
	//* 118  240:ldc1            #242 <Int 0x1020016>
	//* 119  242:invokevirtual   #246 <Method View FrameLayout.findViewById(int)>
	//* 120  245:checkcast       #248 <Class TextView>
	//* 121  248:astore          4
	//* 122  250:aload           4
	//* 123  252:ifnull          267
	//* 124  255:aload           4
	//* 125  257:aload_0         
	//* 126  258:getfield        #67  <Field MenuBuilder mMenu>
	//* 127  261:invokevirtual   #230 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//* 128  264:invokevirtual   #252 <Method void TextView.setText(CharSequence)>
	//* 129  267:aload_3         
	//* 130  268:iconst_0        
	//* 131  269:invokevirtual   #255 <Method void FrameLayout.setEnabled(boolean)>
	//* 132  272:aload_2         
	//* 133  273:aload_3         
	//* 134  274:aconst_null     
	//* 135  275:iconst_0        
	//* 136  276:invokevirtual   #259 <Method void ListView.addHeaderView(View, Object, boolean)>
	//* 137  279:aload_0         
	//* 138  280:getfield        #129 <Field MenuPopupWindow mPopup>
	//* 139  283:aload_0         
	//* 140  284:getfield        #82  <Field MenuAdapter mAdapter>
	//* 141  287:invokevirtual   #263 <Method void MenuPopupWindow.setAdapter(android.widget.ListAdapter)>
	//* 142  290:aload_0         
	//* 143  291:getfield        #129 <Field MenuPopupWindow mPopup>
	//* 144  294:invokevirtual   #214 <Method void MenuPopupWindow.show()>
	//* 145  297:iconst_1        
	//* 146  298:ireturn         
			flag = false;
	//  147  299:iconst_0        
	//  148  300:istore_1        
		mTreeObserver = ((View) (obj)).getViewTreeObserver();
		if(flag)
			mTreeObserver.addOnGlobalLayoutListener(mGlobalLayoutListener);
		((View) (obj)).addOnAttachStateChangeListener(mAttachStateChangeListener);
		mPopup.setAnchorView(((View) (obj)));
		mPopup.setDropDownGravity(mDropDownGravity);
		if(!mHasContentWidth)
		{
			mContentWidth = measureIndividualMenuWidth(((android.widget.ListAdapter) (mAdapter)), ((android.view.ViewGroup) (null)), mContext, mPopupMaxWidth);
			mHasContentWidth = true;
		}
		mPopup.setContentWidth(mContentWidth);
		mPopup.setInputMethodMode(2);
		mPopup.setEpicenterBounds(getEpicenterBounds());
		mPopup.show();
		obj = ((Object) (mPopup.getListView()));
		((ListView) (obj)).setOnKeyListener(((android.view.View.OnKeyListener) (this)));
		if(mShowTitle && mMenu.getHeaderTitle() != null)
		{
			FrameLayout framelayout = (FrameLayout)LayoutInflater.from(mContext).inflate(android.support.v7.appcompat.R.layout.abc_popup_menu_header_item_layout, ((android.view.ViewGroup) (obj)), false);
			TextView textview = (TextView)framelayout.findViewById(0x1020016);
			if(textview != null)
				textview.setText(mMenu.getHeaderTitle());
			framelayout.setEnabled(false);
			((ListView) (obj)).addHeaderView(((View) (framelayout)), ((Object) (null)), false);
		}
		mPopup.setAdapter(((android.widget.ListAdapter) (mAdapter)));
		mPopup.show();
		return true;
	//* 149  301:goto            71
	}

	public void addMenu(MenuBuilder menubuilder)
	{
	//    0    0:return          
	}

	public void dismiss()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #149 <Method boolean isShowing()>
	//*   2    4:ifeq            14
			mPopup.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field MenuPopupWindow mPopup>
	//    5   11:invokevirtual   #268 <Method void MenuPopupWindow.dismiss()>
	//    6   14:return          
	}

	public boolean flagActionItems()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public ListView getListView()
	{
		return mPopup.getListView();
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field MenuPopupWindow mPopup>
	//    2    4:invokevirtual   #218 <Method ListView MenuPopupWindow.getListView()>
	//    3    7:areturn         
	}

	public boolean isShowing()
	{
		return !mWasDismissed && mPopup.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field boolean mWasDismissed>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #129 <Field MenuPopupWindow mPopup>
	//    5   11:invokevirtual   #270 <Method boolean MenuPopupWindow.isShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(menubuilder == mMenu)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #67  <Field MenuBuilder mMenu>
	//*   3    5:if_acmpeq       9
	//*   4    8:return          
		{
			dismiss();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #273 <Method void dismiss()>
			if(mPresenterCallback != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #275 <Field MenuPresenter$Callback mPresenterCallback>
	//*   9   17:ifnull          8
			{
				mPresenterCallback.onCloseMenu(menubuilder, flag);
	//   10   20:aload_0         
	//   11   21:getfield        #275 <Field MenuPresenter$Callback mPresenterCallback>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokeinterface #279 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
				return;
	//   15   31:return          
			}
		}
	}

	public void onDismiss()
	{
		mWasDismissed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #151 <Field boolean mWasDismissed>
		mMenu.close();
	//    3    5:aload_0         
	//    4    6:getfield        #67  <Field MenuBuilder mMenu>
	//    5    9:invokevirtual   #283 <Method void MenuBuilder.close()>
		if(mTreeObserver != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #140 <Field ViewTreeObserver mTreeObserver>
	//*   8   16:ifnull          56
		{
			if(!mTreeObserver.isAlive())
	//*   9   19:aload_0         
	//*  10   20:getfield        #140 <Field ViewTreeObserver mTreeObserver>
	//*  11   23:invokevirtual   #286 <Method boolean ViewTreeObserver.isAlive()>
	//*  12   26:ifne            40
				mTreeObserver = mShownAnchorView.getViewTreeObserver();
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #153 <Field View mShownAnchorView>
	//   16   34:invokevirtual   #171 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   17   37:putfield        #140 <Field ViewTreeObserver mTreeObserver>
			mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
	//   18   40:aload_0         
	//   19   41:getfield        #140 <Field ViewTreeObserver mTreeObserver>
	//   20   44:aload_0         
	//   21   45:getfield        #58  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   22   48:invokevirtual   #289 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			mTreeObserver = null;
	//   23   51:aload_0         
	//   24   52:aconst_null     
	//   25   53:putfield        #140 <Field ViewTreeObserver mTreeObserver>
		}
		mShownAnchorView.removeOnAttachStateChangeListener(mAttachStateChangeListener);
	//   26   56:aload_0         
	//   27   57:getfield        #153 <Field View mShownAnchorView>
	//   28   60:aload_0         
	//   29   61:getfield        #61  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//   30   64:invokevirtual   #292 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		if(mOnDismissListener != null)
	//*  31   67:aload_0         
	//*  32   68:getfield        #294 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//*  33   71:ifnull          83
			mOnDismissListener.onDismiss();
	//   34   74:aload_0         
	//   35   75:getfield        #294 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//   36   78:invokeinterface #296 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//   37   83:return          
	}

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1 && i == 82)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #304 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          20
	//*   4    8:iload_2         
	//*   5    9:bipush          82
	//*   6   11:icmpne          20
		{
			dismiss();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #273 <Method void dismiss()>
			return true;
	//    9   18:iconst_1        
	//   10   19:ireturn         
		} else
		{
			return false;
	//   11   20:iconst_0        
	//   12   21:ireturn         
		}
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

	public boolean onSubMenuSelected(SubMenuBuilder submenubuilder)
	{
		if(submenubuilder.hasVisibleItems())
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #315 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*   2    4:ifeq            122
		{
			MenuPopupHelper menupopuphelper = new MenuPopupHelper(mContext, ((MenuBuilder) (submenubuilder)), mShownAnchorView, mOverflowOnly, mPopupStyleAttr, mPopupStyleRes);
	//    3    7:new             #317 <Class MenuPopupHelper>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #65  <Field Context mContext>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #153 <Field View mShownAnchorView>
	//   10   20:aload_0         
	//   11   21:getfield        #69  <Field boolean mOverflowOnly>
	//   12   24:aload_0         
	//   13   25:getfield        #84  <Field int mPopupStyleAttr>
	//   14   28:aload_0         
	//   15   29:getfield        #86  <Field int mPopupStyleRes>
	//   16   32:invokespecial   #320 <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//   17   35:astore_2        
			menupopuphelper.setPresenterCallback(mPresenterCallback);
	//   18   36:aload_2         
	//   19   37:aload_0         
	//   20   38:getfield        #275 <Field MenuPresenter$Callback mPresenterCallback>
	//   21   41:invokevirtual   #324 <Method void MenuPopupHelper.setPresenterCallback(MenuPresenter$Callback)>
			menupopuphelper.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(((MenuBuilder) (submenubuilder))));
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:invokestatic    #328 <Method boolean MenuPopup.shouldPreserveIconSpacing(MenuBuilder)>
	//   25   49:invokevirtual   #331 <Method void MenuPopupHelper.setForceShowIcon(boolean)>
			menupopuphelper.setGravity(mDropDownGravity);
	//   26   52:aload_2         
	//   27   53:aload_0         
	//   28   54:getfield        #63  <Field int mDropDownGravity>
	//   29   57:invokevirtual   #334 <Method void MenuPopupHelper.setGravity(int)>
			menupopuphelper.setOnDismissListener(mOnDismissListener);
	//   30   60:aload_2         
	//   31   61:aload_0         
	//   32   62:getfield        #294 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//   33   65:invokevirtual   #335 <Method void MenuPopupHelper.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
			mOnDismissListener = null;
	//   34   68:aload_0         
	//   35   69:aconst_null     
	//   36   70:putfield        #294 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
			mMenu.close(false);
	//   37   73:aload_0         
	//   38   74:getfield        #67  <Field MenuBuilder mMenu>
	//   39   77:iconst_0        
	//   40   78:invokevirtual   #337 <Method void MenuBuilder.close(boolean)>
			if(menupopuphelper.tryShow(mPopup.getHorizontalOffset(), mPopup.getVerticalOffset()))
	//*  41   81:aload_2         
	//*  42   82:aload_0         
	//*  43   83:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  44   86:invokevirtual   #340 <Method int MenuPopupWindow.getHorizontalOffset()>
	//*  45   89:aload_0         
	//*  46   90:getfield        #129 <Field MenuPopupWindow mPopup>
	//*  47   93:invokevirtual   #343 <Method int MenuPopupWindow.getVerticalOffset()>
	//*  48   96:invokevirtual   #346 <Method boolean MenuPopupHelper.tryShow(int, int)>
	//*  49   99:ifeq            122
			{
				if(mPresenterCallback != null)
	//*  50  102:aload_0         
	//*  51  103:getfield        #275 <Field MenuPresenter$Callback mPresenterCallback>
	//*  52  106:ifnull          120
					mPresenterCallback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//   53  109:aload_0         
	//   54  110:getfield        #275 <Field MenuPresenter$Callback mPresenterCallback>
	//   55  113:aload_1         
	//   56  114:invokeinterface #349 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   57  119:pop             
				return true;
	//   58  120:iconst_1        
	//   59  121:ireturn         
			}
		}
		return false;
	//   60  122:iconst_0        
	//   61  123:ireturn         
	}

	public void setAnchorView(View view)
	{
		mAnchorView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #122 <Field View mAnchorView>
	//    3    5:return          
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #275 <Field MenuPresenter$Callback mPresenterCallback>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mAdapter.setForceShowIcon(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #82  <Field MenuAdapter mAdapter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #351 <Method void MenuAdapter.setForceShowIcon(boolean)>
	//    4    8:return          
	}

	public void setGravity(int i)
	{
		mDropDownGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #63  <Field int mDropDownGravity>
	//    3    5:return          
	}

	public void setHorizontalOffset(int i)
	{
		mPopup.setHorizontalOffset(i);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field MenuPopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #354 <Method void MenuPopupWindow.setHorizontalOffset(int)>
	//    4    8:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #294 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setShowTitle(boolean flag)
	{
		mShowTitle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #226 <Field boolean mShowTitle>
	//    3    5:return          
	}

	public void setVerticalOffset(int i)
	{
		mPopup.setVerticalOffset(i);
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field MenuPopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #358 <Method void MenuPopupWindow.setVerticalOffset(int)>
	//    4    8:return          
	}

	public void show()
	{
		if(!tryShow())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #360 <Method boolean tryShow()>
	//*   2    4:ifne            18
			throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
	//    3    7:new             #362 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #364 <String "StandardMenuPopup cannot be used without an anchor">
	//    6   14:invokespecial   #367 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void updateMenuView(boolean flag)
	{
		mHasContentWidth = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #191 <Field boolean mHasContentWidth>
		if(mAdapter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #82  <Field MenuAdapter mAdapter>
	//*   5    9:ifnull          19
			mAdapter.notifyDataSetChanged();
	//    6   12:aload_0         
	//    7   13:getfield        #82  <Field MenuAdapter mAdapter>
	//    8   16:invokevirtual   #371 <Method void MenuAdapter.notifyDataSetChanged()>
	//    9   19:return          
	}

	private final MenuAdapter mAdapter;
	private View mAnchorView;
	private final android.view.View.OnAttachStateChangeListener mAttachStateChangeListener = new android.view.View.OnAttachStateChangeListener() {

		public void onViewAttachedToWindow(View view1)
		{
		//    0    0:return          
		}

		public void onViewDetachedFromWindow(View view1)
		{
			if(mTreeObserver != null)
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field StandardMenuPopup this$0>
		//*   2    4:invokestatic    #25  <Method ViewTreeObserver StandardMenuPopup.access$000(StandardMenuPopup)>
		//*   3    7:ifnull          52
			{
				if(!mTreeObserver.isAlive())
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field StandardMenuPopup this$0>
		//*   6   14:invokestatic    #25  <Method ViewTreeObserver StandardMenuPopup.access$000(StandardMenuPopup)>
		//*   7   17:invokevirtual   #31  <Method boolean ViewTreeObserver.isAlive()>
		//*   8   20:ifne            35
					mTreeObserver = view1.getViewTreeObserver();
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field StandardMenuPopup this$0>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
		//   13   31:invokestatic    #41  <Method ViewTreeObserver StandardMenuPopup.access$002(StandardMenuPopup, ViewTreeObserver)>
		//   14   34:pop             
				mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
		//   15   35:aload_0         
		//   16   36:getfield        #14  <Field StandardMenuPopup this$0>
		//   17   39:invokestatic    #25  <Method ViewTreeObserver StandardMenuPopup.access$000(StandardMenuPopup)>
		//   18   42:aload_0         
		//   19   43:getfield        #14  <Field StandardMenuPopup this$0>
		//   20   46:invokestatic    #45  <Method android.view.ViewTreeObserver$OnGlobalLayoutListener StandardMenuPopup.access$100(StandardMenuPopup)>
		//   21   49:invokevirtual   #49  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			view1.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
		//   22   52:aload_1         
		//   23   53:aload_0         
		//   24   54:invokevirtual   #53  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		//   25   57:return          
		}

		final StandardMenuPopup this$0;

			
			{
				this$0 = StandardMenuPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field StandardMenuPopup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private int mContentWidth;
	private final Context mContext;
	private int mDropDownGravity;
	private final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

		public void onGlobalLayout()
		{
label0:
			{
				if(isShowing() && !mPopup.isModal())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field StandardMenuPopup this$0>
		//*   2    4:invokevirtual   #23  <Method boolean StandardMenuPopup.isShowing()>
		//*   3    7:ifeq            49
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field StandardMenuPopup this$0>
		//*   6   14:getfield        #27  <Field MenuPopupWindow StandardMenuPopup.mPopup>
		//*   7   17:invokevirtual   #32  <Method boolean MenuPopupWindow.isModal()>
		//*   8   20:ifne            49
				{
					View view1 = mShownAnchorView;
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field StandardMenuPopup this$0>
		//   11   27:getfield        #36  <Field View StandardMenuPopup.mShownAnchorView>
		//   12   30:astore_1        
					if(view1 != null && view1.isShown())
						break label0;
		//   13   31:aload_1         
		//   14   32:ifnull          42
		//   15   35:aload_1         
		//   16   36:invokevirtual   #41  <Method boolean View.isShown()>
		//   17   39:ifne            50
					dismiss();
		//   18   42:aload_0         
		//   19   43:getfield        #14  <Field StandardMenuPopup this$0>
		//   20   46:invokevirtual   #44  <Method void StandardMenuPopup.dismiss()>
				}
				return;
		//   21   49:return          
			}
			mPopup.show();
		//   22   50:aload_0         
		//   23   51:getfield        #14  <Field StandardMenuPopup this$0>
		//   24   54:getfield        #27  <Field MenuPopupWindow StandardMenuPopup.mPopup>
		//   25   57:invokevirtual   #47  <Method void MenuPopupWindow.show()>
		//   26   60:return          
		}

		final StandardMenuPopup this$0;

			
			{
				this$0 = StandardMenuPopup.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field StandardMenuPopup this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
	}
;
	private boolean mHasContentWidth;
	private final MenuBuilder mMenu;
	private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
	private final boolean mOverflowOnly;
	final MenuPopupWindow mPopup;
	private final int mPopupMaxWidth;
	private final int mPopupStyleAttr;
	private final int mPopupStyleRes;
	private MenuPresenter.Callback mPresenterCallback;
	private boolean mShowTitle;
	View mShownAnchorView;
	private ViewTreeObserver mTreeObserver;
	private boolean mWasDismissed;


/*
	static ViewTreeObserver access$000(StandardMenuPopup standardmenupopup)
	{
		return standardmenupopup.mTreeObserver;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field ViewTreeObserver mTreeObserver>
	//    2    4:areturn         
	}

*/


/*
	static ViewTreeObserver access$002(StandardMenuPopup standardmenupopup, ViewTreeObserver viewtreeobserver)
	{
		standardmenupopup.mTreeObserver = viewtreeobserver;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #140 <Field ViewTreeObserver mTreeObserver>
		return viewtreeobserver;
	//    3    5:aload_1         
	//    4    6:areturn         
	}

*/


/*
	static android.view.ViewTreeObserver.OnGlobalLayoutListener access$100(StandardMenuPopup standardmenupopup)
	{
		return standardmenupopup.mGlobalLayoutListener;
	//    0    0:aload_0         
	//    1    1:getfield        #58  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//    2    4:areturn         
	}

*/
}
