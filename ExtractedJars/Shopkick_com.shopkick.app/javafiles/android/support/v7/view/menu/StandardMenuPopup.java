// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
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
	//    1    1:invokespecial   #63  <Method void MenuPopup()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class StandardMenuPopup$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #66  <Method void StandardMenuPopup$1(StandardMenuPopup)>
	//    7   13:putfield        #68  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//    8   16:aload_0         
	//    9   17:new             #16  <Class StandardMenuPopup$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:invokespecial   #69  <Method void StandardMenuPopup$2(StandardMenuPopup)>
	//   13   25:putfield        #71  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
		mDropDownGravity = 0;
	//   14   28:aload_0         
	//   15   29:iconst_0        
	//   16   30:putfield        #73  <Field int mDropDownGravity>
		mContext = context;
	//   17   33:aload_0         
	//   18   34:aload_1         
	//   19   35:putfield        #75  <Field Context mContext>
		mMenu = menubuilder;
	//   20   38:aload_0         
	//   21   39:aload_2         
	//   22   40:putfield        #77  <Field MenuBuilder mMenu>
		mOverflowOnly = flag;
	//   23   43:aload_0         
	//   24   44:iload           6
	//   25   46:putfield        #79  <Field boolean mOverflowOnly>
		mAdapter = new MenuAdapter(menubuilder, LayoutInflater.from(context), mOverflowOnly, ITEM_LAYOUT);
	//   26   49:aload_0         
	//   27   50:new             #81  <Class MenuAdapter>
	//   28   53:dup             
	//   29   54:aload_2         
	//   30   55:aload_1         
	//   31   56:invokestatic    #87  <Method LayoutInflater LayoutInflater.from(Context)>
	//   32   59:aload_0         
	//   33   60:getfield        #79  <Field boolean mOverflowOnly>
	//   34   63:getstatic       #58  <Field int ITEM_LAYOUT>
	//   35   66:invokespecial   #90  <Method void MenuAdapter(MenuBuilder, LayoutInflater, boolean, int)>
	//   36   69:putfield        #92  <Field MenuAdapter mAdapter>
		mPopupStyleAttr = i;
	//   37   72:aload_0         
	//   38   73:iload           4
	//   39   75:putfield        #94  <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   40   78:aload_0         
	//   41   79:iload           5
	//   42   81:putfield        #96  <Field int mPopupStyleRes>
		Resources resources = context.getResources();
	//   43   84:aload_1         
	//   44   85:invokevirtual   #102 <Method Resources Context.getResources()>
	//   45   88:astore          7
		mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//   46   90:aload_0         
	//   47   91:aload           7
	//   48   93:invokevirtual   #108 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   49   96:getfield        #113 <Field int DisplayMetrics.widthPixels>
	//   50   99:iconst_2        
	//   51  100:idiv            
	//   52  101:aload           7
	//   53  103:getstatic       #118 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//   54  106:invokevirtual   #122 <Method int Resources.getDimensionPixelSize(int)>
	//   55  109:invokestatic    #128 <Method int Math.max(int, int)>
	//   56  112:putfield        #130 <Field int mPopupMaxWidth>
		mAnchorView = view;
	//   57  115:aload_0         
	//   58  116:aload_3         
	//   59  117:putfield        #132 <Field View mAnchorView>
		mPopup = new MenuPopupWindow(mContext, ((android.util.AttributeSet) (null)), mPopupStyleAttr, mPopupStyleRes);
	//   60  120:aload_0         
	//   61  121:new             #134 <Class MenuPopupWindow>
	//   62  124:dup             
	//   63  125:aload_0         
	//   64  126:getfield        #75  <Field Context mContext>
	//   65  129:aconst_null     
	//   66  130:aload_0         
	//   67  131:getfield        #94  <Field int mPopupStyleAttr>
	//   68  134:aload_0         
	//   69  135:getfield        #96  <Field int mPopupStyleRes>
	//   70  138:invokespecial   #137 <Method void MenuPopupWindow(Context, android.util.AttributeSet, int, int)>
	//   71  141:putfield        #139 <Field MenuPopupWindow mPopup>
		menubuilder.addMenuPresenter(((MenuPresenter) (this)), context);
	//   72  144:aload_2         
	//   73  145:aload_0         
	//   74  146:aload_1         
	//   75  147:invokevirtual   #145 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
	//   76  150:return          
	}

	private boolean tryShow()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #150 <Method boolean isShowing()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(!mWasDismissed)
	//*   5    9:aload_0         
	//*   6   10:getfield        #152 <Field boolean mWasDismissed>
	//*   7   13:ifne            303
		{
			Object obj = ((Object) (mAnchorView));
	//    8   16:aload_0         
	//    9   17:getfield        #132 <Field View mAnchorView>
	//   10   20:astore_2        
			if(obj == null)
	//*  11   21:aload_2         
	//*  12   22:ifnonnull       27
				return false;
	//   13   25:iconst_0        
	//   14   26:ireturn         
			mShownAnchorView = ((View) (obj));
	//   15   27:aload_0         
	//   16   28:aload_2         
	//   17   29:putfield        #154 <Field View mShownAnchorView>
			mPopup.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (this)));
	//   18   32:aload_0         
	//   19   33:getfield        #139 <Field MenuPopupWindow mPopup>
	//   20   36:aload_0         
	//   21   37:invokevirtual   #158 <Method void MenuPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
			mPopup.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   22   40:aload_0         
	//   23   41:getfield        #139 <Field MenuPopupWindow mPopup>
	//   24   44:aload_0         
	//   25   45:invokevirtual   #162 <Method void MenuPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
			mPopup.setModal(true);
	//   26   48:aload_0         
	//   27   49:getfield        #139 <Field MenuPopupWindow mPopup>
	//   28   52:iconst_1        
	//   29   53:invokevirtual   #166 <Method void MenuPopupWindow.setModal(boolean)>
			obj = ((Object) (mShownAnchorView));
	//   30   56:aload_0         
	//   31   57:getfield        #154 <Field View mShownAnchorView>
	//   32   60:astore_2        
			boolean flag;
			if(mTreeObserver == null)
	//*  33   61:aload_0         
	//*  34   62:getfield        #168 <Field ViewTreeObserver mTreeObserver>
	//*  35   65:ifnonnull       73
				flag = true;
	//   36   68:iconst_1        
	//   37   69:istore_1        
			else
	//*  38   70:goto            75
				flag = false;
	//   39   73:iconst_0        
	//   40   74:istore_1        
			mTreeObserver = ((View) (obj)).getViewTreeObserver();
	//   41   75:aload_0         
	//   42   76:aload_2         
	//   43   77:invokevirtual   #174 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   44   80:putfield        #168 <Field ViewTreeObserver mTreeObserver>
			if(flag)
	//*  45   83:iload_1         
	//*  46   84:ifeq            98
				mTreeObserver.addOnGlobalLayoutListener(mGlobalLayoutListener);
	//   47   87:aload_0         
	//   48   88:getfield        #168 <Field ViewTreeObserver mTreeObserver>
	//   49   91:aload_0         
	//   50   92:getfield        #68  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   51   95:invokevirtual   #180 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			((View) (obj)).addOnAttachStateChangeListener(mAttachStateChangeListener);
	//   52   98:aload_2         
	//   53   99:aload_0         
	//   54  100:getfield        #71  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//   55  103:invokevirtual   #184 <Method void View.addOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
			mPopup.setAnchorView(((View) (obj)));
	//   56  106:aload_0         
	//   57  107:getfield        #139 <Field MenuPopupWindow mPopup>
	//   58  110:aload_2         
	//   59  111:invokevirtual   #188 <Method void MenuPopupWindow.setAnchorView(View)>
			mPopup.setDropDownGravity(mDropDownGravity);
	//   60  114:aload_0         
	//   61  115:getfield        #139 <Field MenuPopupWindow mPopup>
	//   62  118:aload_0         
	//   63  119:getfield        #73  <Field int mDropDownGravity>
	//   64  122:invokevirtual   #192 <Method void MenuPopupWindow.setDropDownGravity(int)>
			if(!mHasContentWidth)
	//*  65  125:aload_0         
	//*  66  126:getfield        #194 <Field boolean mHasContentWidth>
	//*  67  129:ifne            157
			{
				mContentWidth = measureIndividualMenuWidth(((android.widget.ListAdapter) (mAdapter)), ((android.view.ViewGroup) (null)), mContext, mPopupMaxWidth);
	//   68  132:aload_0         
	//   69  133:aload_0         
	//   70  134:getfield        #92  <Field MenuAdapter mAdapter>
	//   71  137:aconst_null     
	//   72  138:aload_0         
	//   73  139:getfield        #75  <Field Context mContext>
	//   74  142:aload_0         
	//   75  143:getfield        #130 <Field int mPopupMaxWidth>
	//   76  146:invokestatic    #198 <Method int measureIndividualMenuWidth(android.widget.ListAdapter, android.view.ViewGroup, Context, int)>
	//   77  149:putfield        #200 <Field int mContentWidth>
				mHasContentWidth = true;
	//   78  152:aload_0         
	//   79  153:iconst_1        
	//   80  154:putfield        #194 <Field boolean mHasContentWidth>
			}
			mPopup.setContentWidth(mContentWidth);
	//   81  157:aload_0         
	//   82  158:getfield        #139 <Field MenuPopupWindow mPopup>
	//   83  161:aload_0         
	//   84  162:getfield        #200 <Field int mContentWidth>
	//   85  165:invokevirtual   #203 <Method void MenuPopupWindow.setContentWidth(int)>
			mPopup.setInputMethodMode(2);
	//   86  168:aload_0         
	//   87  169:getfield        #139 <Field MenuPopupWindow mPopup>
	//   88  172:iconst_2        
	//   89  173:invokevirtual   #206 <Method void MenuPopupWindow.setInputMethodMode(int)>
			mPopup.setEpicenterBounds(getEpicenterBounds());
	//   90  176:aload_0         
	//   91  177:getfield        #139 <Field MenuPopupWindow mPopup>
	//   92  180:aload_0         
	//   93  181:invokevirtual   #210 <Method android.graphics.Rect getEpicenterBounds()>
	//   94  184:invokevirtual   #214 <Method void MenuPopupWindow.setEpicenterBounds(android.graphics.Rect)>
			mPopup.show();
	//   95  187:aload_0         
	//   96  188:getfield        #139 <Field MenuPopupWindow mPopup>
	//   97  191:invokevirtual   #217 <Method void MenuPopupWindow.show()>
			obj = ((Object) (mPopup.getListView()));
	//   98  194:aload_0         
	//   99  195:getfield        #139 <Field MenuPopupWindow mPopup>
	//  100  198:invokevirtual   #221 <Method ListView MenuPopupWindow.getListView()>
	//  101  201:astore_2        
			((ListView) (obj)).setOnKeyListener(((android.view.View.OnKeyListener) (this)));
	//  102  202:aload_2         
	//  103  203:aload_0         
	//  104  204:invokevirtual   #227 <Method void ListView.setOnKeyListener(android.view.View$OnKeyListener)>
			if(mShowTitle && mMenu.getHeaderTitle() != null)
	//* 105  207:aload_0         
	//* 106  208:getfield        #229 <Field boolean mShowTitle>
	//* 107  211:ifeq            283
	//* 108  214:aload_0         
	//* 109  215:getfield        #77  <Field MenuBuilder mMenu>
	//* 110  218:invokevirtual   #233 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//* 111  221:ifnull          283
			{
				FrameLayout framelayout = (FrameLayout)LayoutInflater.from(mContext).inflate(android.support.v7.appcompat.R.layout.abc_popup_menu_header_item_layout, ((android.view.ViewGroup) (obj)), false);
	//  112  224:aload_0         
	//  113  225:getfield        #75  <Field Context mContext>
	//  114  228:invokestatic    #87  <Method LayoutInflater LayoutInflater.from(Context)>
	//  115  231:getstatic       #236 <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_header_item_layout>
	//  116  234:aload_2         
	//  117  235:iconst_0        
	//  118  236:invokevirtual   #240 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//  119  239:checkcast       #242 <Class FrameLayout>
	//  120  242:astore_3        
				TextView textview = (TextView)framelayout.findViewById(0x1020016);
	//  121  243:aload_3         
	//  122  244:ldc1            #243 <Int 0x1020016>
	//  123  246:invokevirtual   #247 <Method View FrameLayout.findViewById(int)>
	//  124  249:checkcast       #249 <Class TextView>
	//  125  252:astore          4
				if(textview != null)
	//* 126  254:aload           4
	//* 127  256:ifnull          271
					textview.setText(mMenu.getHeaderTitle());
	//  128  259:aload           4
	//  129  261:aload_0         
	//  130  262:getfield        #77  <Field MenuBuilder mMenu>
	//  131  265:invokevirtual   #233 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//  132  268:invokevirtual   #253 <Method void TextView.setText(CharSequence)>
				framelayout.setEnabled(false);
	//  133  271:aload_3         
	//  134  272:iconst_0        
	//  135  273:invokevirtual   #256 <Method void FrameLayout.setEnabled(boolean)>
				((ListView) (obj)).addHeaderView(((View) (framelayout)), ((Object) (null)), false);
	//  136  276:aload_2         
	//  137  277:aload_3         
	//  138  278:aconst_null     
	//  139  279:iconst_0        
	//  140  280:invokevirtual   #260 <Method void ListView.addHeaderView(View, Object, boolean)>
			}
			mPopup.setAdapter(((android.widget.ListAdapter) (mAdapter)));
	//  141  283:aload_0         
	//  142  284:getfield        #139 <Field MenuPopupWindow mPopup>
	//  143  287:aload_0         
	//  144  288:getfield        #92  <Field MenuAdapter mAdapter>
	//  145  291:invokevirtual   #264 <Method void MenuPopupWindow.setAdapter(android.widget.ListAdapter)>
			mPopup.show();
	//  146  294:aload_0         
	//  147  295:getfield        #139 <Field MenuPopupWindow mPopup>
	//  148  298:invokevirtual   #217 <Method void MenuPopupWindow.show()>
			return true;
	//  149  301:iconst_1        
	//  150  302:ireturn         
		} else
		{
			return false;
	//  151  303:iconst_0        
	//  152  304:ireturn         
		}
	}

	public void addMenu(MenuBuilder menubuilder)
	{
	//    0    0:return          
	}

	public void dismiss()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #150 <Method boolean isShowing()>
	//*   2    4:ifeq            14
			mPopup.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field MenuPopupWindow mPopup>
	//    5   11:invokevirtual   #269 <Method void MenuPopupWindow.dismiss()>
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
	//    1    1:getfield        #139 <Field MenuPopupWindow mPopup>
	//    2    4:invokevirtual   #221 <Method ListView MenuPopupWindow.getListView()>
	//    3    7:areturn         
	}

	public boolean isShowing()
	{
		return !mWasDismissed && mPopup.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #152 <Field boolean mWasDismissed>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #139 <Field MenuPopupWindow mPopup>
	//    5   11:invokevirtual   #271 <Method boolean MenuPopupWindow.isShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(menubuilder != mMenu)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:getfield        #77  <Field MenuBuilder mMenu>
	//*   3    5:if_acmpeq       9
			return;
	//    4    8:return          
		dismiss();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #274 <Method void dismiss()>
		MenuPresenter.Callback callback = mPresenterCallback;
	//    7   13:aload_0         
	//    8   14:getfield        #276 <Field MenuPresenter$Callback mPresenterCallback>
	//    9   17:astore_3        
		if(callback != null)
	//*  10   18:aload_3         
	//*  11   19:ifnull          30
			callback.onCloseMenu(menubuilder, flag);
	//   12   22:aload_3         
	//   13   23:aload_1         
	//   14   24:iload_2         
	//   15   25:invokeinterface #280 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//   16   30:return          
	}

	public void onDismiss()
	{
		mWasDismissed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #152 <Field boolean mWasDismissed>
		mMenu.close();
	//    3    5:aload_0         
	//    4    6:getfield        #77  <Field MenuBuilder mMenu>
	//    5    9:invokevirtual   #284 <Method void MenuBuilder.close()>
		Object obj = ((Object) (mTreeObserver));
	//    6   12:aload_0         
	//    7   13:getfield        #168 <Field ViewTreeObserver mTreeObserver>
	//    8   16:astore_1        
		if(obj != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          55
		{
			if(!((ViewTreeObserver) (obj)).isAlive())
	//*  11   21:aload_1         
	//*  12   22:invokevirtual   #287 <Method boolean ViewTreeObserver.isAlive()>
	//*  13   25:ifne            39
				mTreeObserver = mShownAnchorView.getViewTreeObserver();
	//   14   28:aload_0         
	//   15   29:aload_0         
	//   16   30:getfield        #154 <Field View mShownAnchorView>
	//   17   33:invokevirtual   #174 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   18   36:putfield        #168 <Field ViewTreeObserver mTreeObserver>
			mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
	//   19   39:aload_0         
	//   20   40:getfield        #168 <Field ViewTreeObserver mTreeObserver>
	//   21   43:aload_0         
	//   22   44:getfield        #68  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   23   47:invokevirtual   #290 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			mTreeObserver = null;
	//   24   50:aload_0         
	//   25   51:aconst_null     
	//   26   52:putfield        #168 <Field ViewTreeObserver mTreeObserver>
		}
		mShownAnchorView.removeOnAttachStateChangeListener(mAttachStateChangeListener);
	//   27   55:aload_0         
	//   28   56:getfield        #154 <Field View mShownAnchorView>
	//   29   59:aload_0         
	//   30   60:getfield        #71  <Field android.view.View$OnAttachStateChangeListener mAttachStateChangeListener>
	//   31   63:invokevirtual   #293 <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		obj = ((Object) (mOnDismissListener));
	//   32   66:aload_0         
	//   33   67:getfield        #295 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//   34   70:astore_1        
		if(obj != null)
	//*  35   71:aload_1         
	//*  36   72:ifnull          81
			((android.widget.PopupWindow.OnDismissListener) (obj)).onDismiss();
	//   37   75:aload_1         
	//   38   76:invokeinterface #297 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//   39   81:return          
	}

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1 && i == 82)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #305 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          20
	//*   4    8:iload_2         
	//*   5    9:bipush          82
	//*   6   11:icmpne          20
		{
			dismiss();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #274 <Method void dismiss()>
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
	//*   1    1:invokevirtual   #316 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*   2    4:ifeq            160
		{
			MenuPopupHelper menupopuphelper = new MenuPopupHelper(mContext, ((MenuBuilder) (submenubuilder)), mShownAnchorView, mOverflowOnly, mPopupStyleAttr, mPopupStyleRes);
	//    3    7:new             #318 <Class MenuPopupHelper>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #75  <Field Context mContext>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #154 <Field View mShownAnchorView>
	//   10   20:aload_0         
	//   11   21:getfield        #79  <Field boolean mOverflowOnly>
	//   12   24:aload_0         
	//   13   25:getfield        #94  <Field int mPopupStyleAttr>
	//   14   28:aload_0         
	//   15   29:getfield        #96  <Field int mPopupStyleRes>
	//   16   32:invokespecial   #321 <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//   17   35:astore          5
			menupopuphelper.setPresenterCallback(mPresenterCallback);
	//   18   37:aload           5
	//   19   39:aload_0         
	//   20   40:getfield        #276 <Field MenuPresenter$Callback mPresenterCallback>
	//   21   43:invokevirtual   #325 <Method void MenuPopupHelper.setPresenterCallback(MenuPresenter$Callback)>
			menupopuphelper.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(((MenuBuilder) (submenubuilder))));
	//   22   46:aload           5
	//   23   48:aload_1         
	//   24   49:invokestatic    #329 <Method boolean MenuPopup.shouldPreserveIconSpacing(MenuBuilder)>
	//   25   52:invokevirtual   #332 <Method void MenuPopupHelper.setForceShowIcon(boolean)>
			menupopuphelper.setOnDismissListener(mOnDismissListener);
	//   26   55:aload           5
	//   27   57:aload_0         
	//   28   58:getfield        #295 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//   29   61:invokevirtual   #333 <Method void MenuPopupHelper.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
			mOnDismissListener = null;
	//   30   64:aload_0         
	//   31   65:aconst_null     
	//   32   66:putfield        #295 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
			mMenu.close(false);
	//   33   69:aload_0         
	//   34   70:getfield        #77  <Field MenuBuilder mMenu>
	//   35   73:iconst_0        
	//   36   74:invokevirtual   #335 <Method void MenuBuilder.close(boolean)>
			int j = mPopup.getHorizontalOffset();
	//   37   77:aload_0         
	//   38   78:getfield        #139 <Field MenuPopupWindow mPopup>
	//   39   81:invokevirtual   #338 <Method int MenuPopupWindow.getHorizontalOffset()>
	//   40   84:istore_3        
			int k = mPopup.getVerticalOffset();
	//   41   85:aload_0         
	//   42   86:getfield        #139 <Field MenuPopupWindow mPopup>
	//   43   89:invokevirtual   #341 <Method int MenuPopupWindow.getVerticalOffset()>
	//   44   92:istore          4
			int i = j;
	//   45   94:iload_3         
	//   46   95:istore_2        
			if((Gravity.getAbsoluteGravity(mDropDownGravity, ViewCompat.getLayoutDirection(mAnchorView)) & 7) == 5)
	//*  47   96:aload_0         
	//*  48   97:getfield        #73  <Field int mDropDownGravity>
	//*  49  100:aload_0         
	//*  50  101:getfield        #132 <Field View mAnchorView>
	//*  51  104:invokestatic    #347 <Method int ViewCompat.getLayoutDirection(View)>
	//*  52  107:invokestatic    #352 <Method int Gravity.getAbsoluteGravity(int, int)>
	//*  53  110:bipush          7
	//*  54  112:iand            
	//*  55  113:iconst_5        
	//*  56  114:icmpne          127
				i = j + mAnchorView.getWidth();
	//   57  117:iload_3         
	//   58  118:aload_0         
	//   59  119:getfield        #132 <Field View mAnchorView>
	//   60  122:invokevirtual   #355 <Method int View.getWidth()>
	//   61  125:iadd            
	//   62  126:istore_2        
			if(menupopuphelper.tryShow(i, k))
	//*  63  127:aload           5
	//*  64  129:iload_2         
	//*  65  130:iload           4
	//*  66  132:invokevirtual   #358 <Method boolean MenuPopupHelper.tryShow(int, int)>
	//*  67  135:ifeq            160
			{
				MenuPresenter.Callback callback = mPresenterCallback;
	//   68  138:aload_0         
	//   69  139:getfield        #276 <Field MenuPresenter$Callback mPresenterCallback>
	//   70  142:astore          5
				if(callback != null)
	//*  71  144:aload           5
	//*  72  146:ifnull          158
					callback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//   73  149:aload           5
	//   74  151:aload_1         
	//   75  152:invokeinterface #361 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   76  157:pop             
				return true;
	//   77  158:iconst_1        
	//   78  159:ireturn         
			}
		}
		return false;
	//   79  160:iconst_0        
	//   80  161:ireturn         
	}

	public void setAnchorView(View view)
	{
		mAnchorView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #132 <Field View mAnchorView>
	//    3    5:return          
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #276 <Field MenuPresenter$Callback mPresenterCallback>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mAdapter.setForceShowIcon(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field MenuAdapter mAdapter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #363 <Method void MenuAdapter.setForceShowIcon(boolean)>
	//    4    8:return          
	}

	public void setGravity(int i)
	{
		mDropDownGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #73  <Field int mDropDownGravity>
	//    3    5:return          
	}

	public void setHorizontalOffset(int i)
	{
		mPopup.setHorizontalOffset(i);
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field MenuPopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #367 <Method void MenuPopupWindow.setHorizontalOffset(int)>
	//    4    8:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #295 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setShowTitle(boolean flag)
	{
		mShowTitle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #229 <Field boolean mShowTitle>
	//    3    5:return          
	}

	public void setVerticalOffset(int i)
	{
		mPopup.setVerticalOffset(i);
	//    0    0:aload_0         
	//    1    1:getfield        #139 <Field MenuPopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #371 <Method void MenuPopupWindow.setVerticalOffset(int)>
	//    4    8:return          
	}

	public void show()
	{
		if(tryShow())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #373 <Method boolean tryShow()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
	//    4    8:new             #375 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc2            #377 <String "StandardMenuPopup cannot be used without an anchor">
	//    7   15:invokespecial   #380 <Method void IllegalStateException(String)>
	//    8   18:athrow          
	}

	public void updateMenuView(boolean flag)
	{
		mHasContentWidth = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #194 <Field boolean mHasContentWidth>
		MenuAdapter menuadapter = mAdapter;
	//    3    5:aload_0         
	//    4    6:getfield        #92  <Field MenuAdapter mAdapter>
	//    5    9:astore_2        
		if(menuadapter != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          18
			menuadapter.notifyDataSetChanged();
	//    8   14:aload_2         
	//    9   15:invokevirtual   #384 <Method void MenuAdapter.notifyDataSetChanged()>
	//   10   18:return          
	}

	private static final int ITEM_LAYOUT;
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
		//*   2    4:getfield        #25  <Field ViewTreeObserver StandardMenuPopup.mTreeObserver>
		//*   3    7:ifnull          51
			{
				if(!mTreeObserver.isAlive())
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field StandardMenuPopup this$0>
		//*   6   14:getfield        #25  <Field ViewTreeObserver StandardMenuPopup.mTreeObserver>
		//*   7   17:invokevirtual   #31  <Method boolean ViewTreeObserver.isAlive()>
		//*   8   20:ifne            34
					mTreeObserver = view1.getViewTreeObserver();
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field StandardMenuPopup this$0>
		//   11   27:aload_1         
		//   12   28:invokevirtual   #37  <Method ViewTreeObserver View.getViewTreeObserver()>
		//   13   31:putfield        #25  <Field ViewTreeObserver StandardMenuPopup.mTreeObserver>
				mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
		//   14   34:aload_0         
		//   15   35:getfield        #14  <Field StandardMenuPopup this$0>
		//   16   38:getfield        #25  <Field ViewTreeObserver StandardMenuPopup.mTreeObserver>
		//   17   41:aload_0         
		//   18   42:getfield        #14  <Field StandardMenuPopup this$0>
		//   19   45:getfield        #41  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener StandardMenuPopup.mGlobalLayoutListener>
		//   20   48:invokevirtual   #45  <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			}
			view1.removeOnAttachStateChangeListener(((android.view.View.OnAttachStateChangeListener) (this)));
		//   21   51:aload_1         
		//   22   52:aload_0         
		//   23   53:invokevirtual   #49  <Method void View.removeOnAttachStateChangeListener(android.view.View$OnAttachStateChangeListener)>
		//   24   56:return          
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
	final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

		public void onGlobalLayout()
		{
			if(isShowing() && !mPopup.isModal())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field StandardMenuPopup this$0>
		//*   2    4:invokevirtual   #23  <Method boolean StandardMenuPopup.isShowing()>
		//*   3    7:ifeq            63
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field StandardMenuPopup this$0>
		//*   6   14:getfield        #27  <Field MenuPopupWindow StandardMenuPopup.mPopup>
		//*   7   17:invokevirtual   #32  <Method boolean MenuPopupWindow.isModal()>
		//*   8   20:ifne            63
			{
				View view1 = mShownAnchorView;
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field StandardMenuPopup this$0>
		//   11   27:getfield        #36  <Field View StandardMenuPopup.mShownAnchorView>
		//   12   30:astore_1        
				if(view1 != null && view1.isShown())
		//*  13   31:aload_1         
		//*  14   32:ifnull          56
		//*  15   35:aload_1         
		//*  16   36:invokevirtual   #41  <Method boolean View.isShown()>
		//*  17   39:ifne            45
		//*  18   42:goto            56
				{
					mPopup.show();
		//   19   45:aload_0         
		//   20   46:getfield        #14  <Field StandardMenuPopup this$0>
		//   21   49:getfield        #27  <Field MenuPopupWindow StandardMenuPopup.mPopup>
		//   22   52:invokevirtual   #44  <Method void MenuPopupWindow.show()>
					return;
		//   23   55:return          
				}
				dismiss();
		//   24   56:aload_0         
		//   25   57:getfield        #14  <Field StandardMenuPopup this$0>
		//   26   60:invokevirtual   #47  <Method void StandardMenuPopup.dismiss()>
			}
		//   27   63:return          
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
	ViewTreeObserver mTreeObserver;
	private boolean mWasDismissed;

	static 
	{
		ITEM_LAYOUT = android.support.v7.appcompat.R.layout.abc_popup_menu_item_layout;
	//    0    0:getstatic       #56  <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_item_layout>
	//    1    3:putstatic       #58  <Field int ITEM_LAYOUT>
	//*   2    6:return          
	}
}
