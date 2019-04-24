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
	//    1    1:invokespecial   #49  <Method void MenuPopup()>
	//    2    4:aload_0         
	//    3    5:new             #14  <Class StandardMenuPopup$1>
	//    4    8:dup             
	//    5    9:aload_0         
	//    6   10:invokespecial   #52  <Method void StandardMenuPopup$1(StandardMenuPopup)>
	//    7   13:putfield        #54  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
		mDropDownGravity = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #56  <Field int mDropDownGravity>
		mContext = context;
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:putfield        #58  <Field Context mContext>
		mMenu = menubuilder;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #60  <Field MenuBuilder mMenu>
		mOverflowOnly = flag;
	//   17   31:aload_0         
	//   18   32:iload           6
	//   19   34:putfield        #62  <Field boolean mOverflowOnly>
		mAdapter = new MenuAdapter(menubuilder, LayoutInflater.from(context), mOverflowOnly);
	//   20   37:aload_0         
	//   21   38:new             #64  <Class MenuAdapter>
	//   22   41:dup             
	//   23   42:aload_2         
	//   24   43:aload_1         
	//   25   44:invokestatic    #70  <Method LayoutInflater LayoutInflater.from(Context)>
	//   26   47:aload_0         
	//   27   48:getfield        #62  <Field boolean mOverflowOnly>
	//   28   51:invokespecial   #73  <Method void MenuAdapter(MenuBuilder, LayoutInflater, boolean)>
	//   29   54:putfield        #75  <Field MenuAdapter mAdapter>
		mPopupStyleAttr = i;
	//   30   57:aload_0         
	//   31   58:iload           4
	//   32   60:putfield        #77  <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   33   63:aload_0         
	//   34   64:iload           5
	//   35   66:putfield        #79  <Field int mPopupStyleRes>
		Resources resources = context.getResources();
	//   36   69:aload_1         
	//   37   70:invokevirtual   #85  <Method Resources Context.getResources()>
	//   38   73:astore          7
		mPopupMaxWidth = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_config_prefDialogWidth));
	//   39   75:aload_0         
	//   40   76:aload           7
	//   41   78:invokevirtual   #91  <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   42   81:getfield        #96  <Field int DisplayMetrics.widthPixels>
	//   43   84:iconst_2        
	//   44   85:idiv            
	//   45   86:aload           7
	//   46   88:getstatic       #101 <Field int android.support.v7.appcompat.R$dimen.abc_config_prefDialogWidth>
	//   47   91:invokevirtual   #105 <Method int Resources.getDimensionPixelSize(int)>
	//   48   94:invokestatic    #111 <Method int Math.max(int, int)>
	//   49   97:putfield        #113 <Field int mPopupMaxWidth>
		mAnchorView = view;
	//   50  100:aload_0         
	//   51  101:aload_3         
	//   52  102:putfield        #115 <Field View mAnchorView>
		mPopup = new MenuPopupWindow(mContext, ((android.util.AttributeSet) (null)), mPopupStyleAttr, mPopupStyleRes);
	//   53  105:aload_0         
	//   54  106:new             #117 <Class MenuPopupWindow>
	//   55  109:dup             
	//   56  110:aload_0         
	//   57  111:getfield        #58  <Field Context mContext>
	//   58  114:aconst_null     
	//   59  115:aload_0         
	//   60  116:getfield        #77  <Field int mPopupStyleAttr>
	//   61  119:aload_0         
	//   62  120:getfield        #79  <Field int mPopupStyleRes>
	//   63  123:invokespecial   #120 <Method void MenuPopupWindow(Context, android.util.AttributeSet, int, int)>
	//   64  126:putfield        #122 <Field MenuPopupWindow mPopup>
		menubuilder.addMenuPresenter(((MenuPresenter) (this)), context);
	//   65  129:aload_2         
	//   66  130:aload_0         
	//   67  131:aload_1         
	//   68  132:invokevirtual   #128 <Method void MenuBuilder.addMenuPresenter(MenuPresenter, Context)>
	//   69  135:return          
	}

	private boolean tryShow()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #134 <Method boolean isShowing()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(mWasDismissed || mAnchorView == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #136 <Field boolean mWasDismissed>
	//*   7   13:ifne            23
	//*   8   16:aload_0         
	//*   9   17:getfield        #115 <Field View mAnchorView>
	//*  10   20:ifnonnull       25
			return false;
	//   11   23:iconst_0        
	//   12   24:ireturn         
		mShownAnchorView = mAnchorView;
	//   13   25:aload_0         
	//   14   26:aload_0         
	//   15   27:getfield        #115 <Field View mAnchorView>
	//   16   30:putfield        #138 <Field View mShownAnchorView>
		mPopup.setOnDismissListener(((android.widget.PopupWindow.OnDismissListener) (this)));
	//   17   33:aload_0         
	//   18   34:getfield        #122 <Field MenuPopupWindow mPopup>
	//   19   37:aload_0         
	//   20   38:invokevirtual   #142 <Method void MenuPopupWindow.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		mPopup.setOnItemClickListener(((android.widget.AdapterView.OnItemClickListener) (this)));
	//   21   41:aload_0         
	//   22   42:getfield        #122 <Field MenuPopupWindow mPopup>
	//   23   45:aload_0         
	//   24   46:invokevirtual   #146 <Method void MenuPopupWindow.setOnItemClickListener(android.widget.AdapterView$OnItemClickListener)>
		mPopup.setModal(true);
	//   25   49:aload_0         
	//   26   50:getfield        #122 <Field MenuPopupWindow mPopup>
	//   27   53:iconst_1        
	//   28   54:invokevirtual   #150 <Method void MenuPopupWindow.setModal(boolean)>
		Object obj = ((Object) (mShownAnchorView));
	//   29   57:aload_0         
	//   30   58:getfield        #138 <Field View mShownAnchorView>
	//   31   61:astore_2        
		boolean flag;
		if(mTreeObserver == null)
	//*  32   62:aload_0         
	//*  33   63:getfield        #152 <Field ViewTreeObserver mTreeObserver>
	//*  34   66:ifnonnull       74
			flag = true;
	//   35   69:iconst_1        
	//   36   70:istore_1        
		else
	//*  37   71:goto            76
			flag = false;
	//   38   74:iconst_0        
	//   39   75:istore_1        
		mTreeObserver = ((View) (obj)).getViewTreeObserver();
	//   40   76:aload_0         
	//   41   77:aload_2         
	//   42   78:invokevirtual   #158 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   43   81:putfield        #152 <Field ViewTreeObserver mTreeObserver>
		if(flag)
	//*  44   84:iload_1         
	//*  45   85:ifeq            99
			mTreeObserver.addOnGlobalLayoutListener(mGlobalLayoutListener);
	//   46   88:aload_0         
	//   47   89:getfield        #152 <Field ViewTreeObserver mTreeObserver>
	//   48   92:aload_0         
	//   49   93:getfield        #54  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   50   96:invokevirtual   #164 <Method void ViewTreeObserver.addOnGlobalLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
		mPopup.setAnchorView(((View) (obj)));
	//   51   99:aload_0         
	//   52  100:getfield        #122 <Field MenuPopupWindow mPopup>
	//   53  103:aload_2         
	//   54  104:invokevirtual   #168 <Method void MenuPopupWindow.setAnchorView(View)>
		mPopup.setDropDownGravity(mDropDownGravity);
	//   55  107:aload_0         
	//   56  108:getfield        #122 <Field MenuPopupWindow mPopup>
	//   57  111:aload_0         
	//   58  112:getfield        #56  <Field int mDropDownGravity>
	//   59  115:invokevirtual   #172 <Method void MenuPopupWindow.setDropDownGravity(int)>
		if(!mHasContentWidth)
	//*  60  118:aload_0         
	//*  61  119:getfield        #174 <Field boolean mHasContentWidth>
	//*  62  122:ifne            150
		{
			mContentWidth = measureIndividualMenuWidth(((android.widget.ListAdapter) (mAdapter)), ((android.view.ViewGroup) (null)), mContext, mPopupMaxWidth);
	//   63  125:aload_0         
	//   64  126:aload_0         
	//   65  127:getfield        #75  <Field MenuAdapter mAdapter>
	//   66  130:aconst_null     
	//   67  131:aload_0         
	//   68  132:getfield        #58  <Field Context mContext>
	//   69  135:aload_0         
	//   70  136:getfield        #113 <Field int mPopupMaxWidth>
	//   71  139:invokestatic    #178 <Method int measureIndividualMenuWidth(android.widget.ListAdapter, android.view.ViewGroup, Context, int)>
	//   72  142:putfield        #180 <Field int mContentWidth>
			mHasContentWidth = true;
	//   73  145:aload_0         
	//   74  146:iconst_1        
	//   75  147:putfield        #174 <Field boolean mHasContentWidth>
		}
		mPopup.setContentWidth(mContentWidth);
	//   76  150:aload_0         
	//   77  151:getfield        #122 <Field MenuPopupWindow mPopup>
	//   78  154:aload_0         
	//   79  155:getfield        #180 <Field int mContentWidth>
	//   80  158:invokevirtual   #183 <Method void MenuPopupWindow.setContentWidth(int)>
		mPopup.setInputMethodMode(2);
	//   81  161:aload_0         
	//   82  162:getfield        #122 <Field MenuPopupWindow mPopup>
	//   83  165:iconst_2        
	//   84  166:invokevirtual   #186 <Method void MenuPopupWindow.setInputMethodMode(int)>
		mPopup.setEpicenterBounds(getEpicenterBounds());
	//   85  169:aload_0         
	//   86  170:getfield        #122 <Field MenuPopupWindow mPopup>
	//   87  173:aload_0         
	//   88  174:invokevirtual   #190 <Method android.graphics.Rect getEpicenterBounds()>
	//   89  177:invokevirtual   #194 <Method void MenuPopupWindow.setEpicenterBounds(android.graphics.Rect)>
		mPopup.show();
	//   90  180:aload_0         
	//   91  181:getfield        #122 <Field MenuPopupWindow mPopup>
	//   92  184:invokevirtual   #197 <Method void MenuPopupWindow.show()>
		obj = ((Object) (mPopup.getListView()));
	//   93  187:aload_0         
	//   94  188:getfield        #122 <Field MenuPopupWindow mPopup>
	//   95  191:invokevirtual   #201 <Method ListView MenuPopupWindow.getListView()>
	//   96  194:astore_2        
		((ListView) (obj)).setOnKeyListener(((android.view.View.OnKeyListener) (this)));
	//   97  195:aload_2         
	//   98  196:aload_0         
	//   99  197:invokevirtual   #207 <Method void ListView.setOnKeyListener(android.view.View$OnKeyListener)>
		if(mShowTitle && mMenu.getHeaderTitle() != null)
	//* 100  200:aload_0         
	//* 101  201:getfield        #209 <Field boolean mShowTitle>
	//* 102  204:ifeq            276
	//* 103  207:aload_0         
	//* 104  208:getfield        #60  <Field MenuBuilder mMenu>
	//* 105  211:invokevirtual   #213 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//* 106  214:ifnull          276
		{
			FrameLayout framelayout = (FrameLayout)LayoutInflater.from(mContext).inflate(android.support.v7.appcompat.R.layout.abc_popup_menu_header_item_layout, ((android.view.ViewGroup) (obj)), false);
	//  107  217:aload_0         
	//  108  218:getfield        #58  <Field Context mContext>
	//  109  221:invokestatic    #70  <Method LayoutInflater LayoutInflater.from(Context)>
	//  110  224:getstatic       #218 <Field int android.support.v7.appcompat.R$layout.abc_popup_menu_header_item_layout>
	//  111  227:aload_2         
	//  112  228:iconst_0        
	//  113  229:invokevirtual   #222 <Method View LayoutInflater.inflate(int, android.view.ViewGroup, boolean)>
	//  114  232:checkcast       #224 <Class FrameLayout>
	//  115  235:astore_3        
			TextView textview = (TextView)framelayout.findViewById(0x1020016);
	//  116  236:aload_3         
	//  117  237:ldc1            #225 <Int 0x1020016>
	//  118  239:invokevirtual   #229 <Method View FrameLayout.findViewById(int)>
	//  119  242:checkcast       #231 <Class TextView>
	//  120  245:astore          4
			if(textview != null)
	//* 121  247:aload           4
	//* 122  249:ifnull          264
				textview.setText(mMenu.getHeaderTitle());
	//  123  252:aload           4
	//  124  254:aload_0         
	//  125  255:getfield        #60  <Field MenuBuilder mMenu>
	//  126  258:invokevirtual   #213 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//  127  261:invokevirtual   #235 <Method void TextView.setText(CharSequence)>
			framelayout.setEnabled(false);
	//  128  264:aload_3         
	//  129  265:iconst_0        
	//  130  266:invokevirtual   #238 <Method void FrameLayout.setEnabled(boolean)>
			((ListView) (obj)).addHeaderView(((View) (framelayout)), ((Object) (null)), false);
	//  131  269:aload_2         
	//  132  270:aload_3         
	//  133  271:aconst_null     
	//  134  272:iconst_0        
	//  135  273:invokevirtual   #242 <Method void ListView.addHeaderView(View, Object, boolean)>
		}
		mPopup.setAdapter(((android.widget.ListAdapter) (mAdapter)));
	//  136  276:aload_0         
	//  137  277:getfield        #122 <Field MenuPopupWindow mPopup>
	//  138  280:aload_0         
	//  139  281:getfield        #75  <Field MenuAdapter mAdapter>
	//  140  284:invokevirtual   #246 <Method void MenuPopupWindow.setAdapter(android.widget.ListAdapter)>
		mPopup.show();
	//  141  287:aload_0         
	//  142  288:getfield        #122 <Field MenuPopupWindow mPopup>
	//  143  291:invokevirtual   #197 <Method void MenuPopupWindow.show()>
		return true;
	//  144  294:iconst_1        
	//  145  295:ireturn         
	}

	public void addMenu(MenuBuilder menubuilder)
	{
	//    0    0:return          
	}

	public void dismiss()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #134 <Method boolean isShowing()>
	//*   2    4:ifeq            14
			mPopup.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #122 <Field MenuPopupWindow mPopup>
	//    5   11:invokevirtual   #251 <Method void MenuPopupWindow.dismiss()>
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
	//    1    1:getfield        #122 <Field MenuPopupWindow mPopup>
	//    2    4:invokevirtual   #201 <Method ListView MenuPopupWindow.getListView()>
	//    3    7:areturn         
	}

	public boolean isShowing()
	{
		return !mWasDismissed && mPopup.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #136 <Field boolean mWasDismissed>
	//    2    4:ifne            19
	//    3    7:aload_0         
	//    4    8:getfield        #122 <Field MenuPopupWindow mPopup>
	//    5   11:invokevirtual   #253 <Method boolean MenuPopupWindow.isShowing()>
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
	//*   2    2:getfield        #60  <Field MenuBuilder mMenu>
	//*   3    5:if_acmpeq       9
			return;
	//    4    8:return          
		dismiss();
	//    5    9:aload_0         
	//    6   10:invokevirtual   #256 <Method void dismiss()>
		if(mPresenterCallback != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #258 <Field MenuPresenter$Callback mPresenterCallback>
	//*   9   17:ifnull          31
			mPresenterCallback.onCloseMenu(menubuilder, flag);
	//   10   20:aload_0         
	//   11   21:getfield        #258 <Field MenuPresenter$Callback mPresenterCallback>
	//   12   24:aload_1         
	//   13   25:iload_2         
	//   14   26:invokeinterface #262 <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//   15   31:return          
	}

	public void onDismiss()
	{
		mWasDismissed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #136 <Field boolean mWasDismissed>
		mMenu.close();
	//    3    5:aload_0         
	//    4    6:getfield        #60  <Field MenuBuilder mMenu>
	//    5    9:invokevirtual   #266 <Method void MenuBuilder.close()>
		if(mTreeObserver != null)
	//*   6   12:aload_0         
	//*   7   13:getfield        #152 <Field ViewTreeObserver mTreeObserver>
	//*   8   16:ifnull          56
		{
			if(!mTreeObserver.isAlive())
	//*   9   19:aload_0         
	//*  10   20:getfield        #152 <Field ViewTreeObserver mTreeObserver>
	//*  11   23:invokevirtual   #269 <Method boolean ViewTreeObserver.isAlive()>
	//*  12   26:ifne            40
				mTreeObserver = mShownAnchorView.getViewTreeObserver();
	//   13   29:aload_0         
	//   14   30:aload_0         
	//   15   31:getfield        #138 <Field View mShownAnchorView>
	//   16   34:invokevirtual   #158 <Method ViewTreeObserver View.getViewTreeObserver()>
	//   17   37:putfield        #152 <Field ViewTreeObserver mTreeObserver>
			mTreeObserver.removeGlobalOnLayoutListener(mGlobalLayoutListener);
	//   18   40:aload_0         
	//   19   41:getfield        #152 <Field ViewTreeObserver mTreeObserver>
	//   20   44:aload_0         
	//   21   45:getfield        #54  <Field android.view.ViewTreeObserver$OnGlobalLayoutListener mGlobalLayoutListener>
	//   22   48:invokevirtual   #272 <Method void ViewTreeObserver.removeGlobalOnLayoutListener(android.view.ViewTreeObserver$OnGlobalLayoutListener)>
			mTreeObserver = null;
	//   23   51:aload_0         
	//   24   52:aconst_null     
	//   25   53:putfield        #152 <Field ViewTreeObserver mTreeObserver>
		}
		if(mOnDismissListener != null)
	//*  26   56:aload_0         
	//*  27   57:getfield        #274 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//*  28   60:ifnull          72
			mOnDismissListener.onDismiss();
	//   29   63:aload_0         
	//   30   64:getfield        #274 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//   31   67:invokeinterface #276 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//   32   72:return          
	}

	public boolean onKey(View view, int i, KeyEvent keyevent)
	{
		if(keyevent.getAction() == 1 && i == 82)
	//*   0    0:aload_3         
	//*   1    1:invokevirtual   #284 <Method int KeyEvent.getAction()>
	//*   2    4:iconst_1        
	//*   3    5:icmpne          20
	//*   4    8:iload_2         
	//*   5    9:bipush          82
	//*   6   11:icmpne          20
		{
			dismiss();
	//    7   14:aload_0         
	//    8   15:invokevirtual   #256 <Method void dismiss()>
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
	//*   1    1:invokevirtual   #295 <Method boolean SubMenuBuilder.hasVisibleItems()>
	//*   2    4:ifeq            114
		{
			MenuPopupHelper menupopuphelper = new MenuPopupHelper(mContext, ((MenuBuilder) (submenubuilder)), mShownAnchorView, mOverflowOnly, mPopupStyleAttr, mPopupStyleRes);
	//    3    7:new             #297 <Class MenuPopupHelper>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #58  <Field Context mContext>
	//    7   15:aload_1         
	//    8   16:aload_0         
	//    9   17:getfield        #138 <Field View mShownAnchorView>
	//   10   20:aload_0         
	//   11   21:getfield        #62  <Field boolean mOverflowOnly>
	//   12   24:aload_0         
	//   13   25:getfield        #77  <Field int mPopupStyleAttr>
	//   14   28:aload_0         
	//   15   29:getfield        #79  <Field int mPopupStyleRes>
	//   16   32:invokespecial   #300 <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//   17   35:astore_2        
			menupopuphelper.setPresenterCallback(mPresenterCallback);
	//   18   36:aload_2         
	//   19   37:aload_0         
	//   20   38:getfield        #258 <Field MenuPresenter$Callback mPresenterCallback>
	//   21   41:invokevirtual   #304 <Method void MenuPopupHelper.setPresenterCallback(MenuPresenter$Callback)>
			menupopuphelper.setForceShowIcon(MenuPopup.shouldPreserveIconSpacing(((MenuBuilder) (submenubuilder))));
	//   22   44:aload_2         
	//   23   45:aload_1         
	//   24   46:invokestatic    #308 <Method boolean MenuPopup.shouldPreserveIconSpacing(MenuBuilder)>
	//   25   49:invokevirtual   #311 <Method void MenuPopupHelper.setForceShowIcon(boolean)>
			menupopuphelper.setOnDismissListener(mOnDismissListener);
	//   26   52:aload_2         
	//   27   53:aload_0         
	//   28   54:getfield        #274 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//   29   57:invokevirtual   #312 <Method void MenuPopupHelper.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
			mOnDismissListener = null;
	//   30   60:aload_0         
	//   31   61:aconst_null     
	//   32   62:putfield        #274 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
			mMenu.close(false);
	//   33   65:aload_0         
	//   34   66:getfield        #60  <Field MenuBuilder mMenu>
	//   35   69:iconst_0        
	//   36   70:invokevirtual   #314 <Method void MenuBuilder.close(boolean)>
			if(menupopuphelper.tryShow(mPopup.getHorizontalOffset(), mPopup.getVerticalOffset()))
	//*  37   73:aload_2         
	//*  38   74:aload_0         
	//*  39   75:getfield        #122 <Field MenuPopupWindow mPopup>
	//*  40   78:invokevirtual   #317 <Method int MenuPopupWindow.getHorizontalOffset()>
	//*  41   81:aload_0         
	//*  42   82:getfield        #122 <Field MenuPopupWindow mPopup>
	//*  43   85:invokevirtual   #320 <Method int MenuPopupWindow.getVerticalOffset()>
	//*  44   88:invokevirtual   #323 <Method boolean MenuPopupHelper.tryShow(int, int)>
	//*  45   91:ifeq            114
			{
				if(mPresenterCallback != null)
	//*  46   94:aload_0         
	//*  47   95:getfield        #258 <Field MenuPresenter$Callback mPresenterCallback>
	//*  48   98:ifnull          112
					mPresenterCallback.onOpenSubMenu(((MenuBuilder) (submenubuilder)));
	//   49  101:aload_0         
	//   50  102:getfield        #258 <Field MenuPresenter$Callback mPresenterCallback>
	//   51  105:aload_1         
	//   52  106:invokeinterface #326 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//   53  111:pop             
				return true;
	//   54  112:iconst_1        
	//   55  113:ireturn         
			}
		}
		return false;
	//   56  114:iconst_0        
	//   57  115:ireturn         
	}

	public void setAnchorView(View view)
	{
		mAnchorView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #115 <Field View mAnchorView>
	//    3    5:return          
	}

	public void setCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #258 <Field MenuPresenter$Callback mPresenterCallback>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mAdapter.setForceShowIcon(flag);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field MenuAdapter mAdapter>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #328 <Method void MenuAdapter.setForceShowIcon(boolean)>
	//    4    8:return          
	}

	public void setGravity(int i)
	{
		mDropDownGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #56  <Field int mDropDownGravity>
	//    3    5:return          
	}

	public void setHorizontalOffset(int i)
	{
		mPopup.setHorizontalOffset(i);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MenuPopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #332 <Method void MenuPopupWindow.setHorizontalOffset(int)>
	//    4    8:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #274 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setShowTitle(boolean flag)
	{
		mShowTitle = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #209 <Field boolean mShowTitle>
	//    3    5:return          
	}

	public void setVerticalOffset(int i)
	{
		mPopup.setVerticalOffset(i);
	//    0    0:aload_0         
	//    1    1:getfield        #122 <Field MenuPopupWindow mPopup>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #336 <Method void MenuPopupWindow.setVerticalOffset(int)>
	//    4    8:return          
	}

	public void show()
	{
		if(!tryShow())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #338 <Method boolean tryShow()>
	//*   2    4:ifne            18
			throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
	//    3    7:new             #340 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #342 <String "StandardMenuPopup cannot be used without an anchor">
	//    6   14:invokespecial   #345 <Method void IllegalStateException(String)>
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
	//    2    2:putfield        #174 <Field boolean mHasContentWidth>
		if(mAdapter != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #75  <Field MenuAdapter mAdapter>
	//*   5    9:ifnull          19
			mAdapter.notifyDataSetChanged();
	//    6   12:aload_0         
	//    7   13:getfield        #75  <Field MenuAdapter mAdapter>
	//    8   16:invokevirtual   #349 <Method void MenuAdapter.notifyDataSetChanged()>
	//    9   19:return          
	}

	private final MenuAdapter mAdapter;
	private View mAnchorView;
	private int mContentWidth;
	private final Context mContext;
	private int mDropDownGravity;
	private final android.view.ViewTreeObserver.OnGlobalLayoutListener mGlobalLayoutListener = new android.view.ViewTreeObserver.OnGlobalLayoutListener() {

		public void onGlobalLayout()
		{
			if(isShowing() && !mPopup.isModal())
		//*   0    0:aload_0         
		//*   1    1:getfield        #14  <Field StandardMenuPopup this$0>
		//*   2    4:invokevirtual   #23  <Method boolean StandardMenuPopup.isShowing()>
		//*   3    7:ifeq            60
		//*   4   10:aload_0         
		//*   5   11:getfield        #14  <Field StandardMenuPopup this$0>
		//*   6   14:getfield        #27  <Field MenuPopupWindow StandardMenuPopup.mPopup>
		//*   7   17:invokevirtual   #32  <Method boolean MenuPopupWindow.isModal()>
		//*   8   20:ifne            60
			{
				View view1 = mShownAnchorView;
		//    9   23:aload_0         
		//   10   24:getfield        #14  <Field StandardMenuPopup this$0>
		//   11   27:getfield        #36  <Field View StandardMenuPopup.mShownAnchorView>
		//   12   30:astore_1        
				if(view1 == null || !view1.isShown())
		//*  13   31:aload_1         
		//*  14   32:ifnull          42
		//*  15   35:aload_1         
		//*  16   36:invokevirtual   #41  <Method boolean View.isShown()>
		//*  17   39:ifne            50
				{
					dismiss();
		//   18   42:aload_0         
		//   19   43:getfield        #14  <Field StandardMenuPopup this$0>
		//   20   46:invokevirtual   #44  <Method void StandardMenuPopup.dismiss()>
					return;
		//   21   49:return          
				}
				mPopup.show();
		//   22   50:aload_0         
		//   23   51:getfield        #14  <Field StandardMenuPopup this$0>
		//   24   54:getfield        #27  <Field MenuPopupWindow StandardMenuPopup.mPopup>
		//   25   57:invokevirtual   #47  <Method void MenuPopupWindow.show()>
			}
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
}
