// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewCompat;
import android.util.DisplayMetrics;
import android.view.*;

// Referenced classes of package android.support.v7.view.menu:
//			MenuHelper, CascadingMenuPopup, StandardMenuPopup, MenuPopup, 
//			MenuBuilder

public class MenuPopupHelper
	implements MenuHelper
{

	public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view, boolean flag, int i)
	{
		this(context, menubuilder, view, flag, i, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iload           4
	//    5    6:iload           5
	//    6    8:iconst_0        
	//    7    9:invokespecial   #39  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//    8   12:return          
	}

	public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view, boolean flag, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #45  <Method void Object()>
		mDropDownGravity = 0x800003;
	//    2    4:aload_0         
	//    3    5:ldc1            #46  <Int 0x800003>
	//    4    7:putfield        #48  <Field int mDropDownGravity>
		mInternalOnDismissListener = new android.widget.PopupWindow.OnDismissListener() {

			public void onDismiss()
			{
				MenuPopupHelper.this.onDismiss();
			//    0    0:aload_0         
			//    1    1:getfield        #14  <Field MenuPopupHelper this$0>
			//    2    4:invokevirtual   #21  <Method void MenuPopupHelper.onDismiss()>
			//    3    7:return          
			}

			final MenuPopupHelper this$0;

			
			{
				this$0 = MenuPopupHelper.this;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field MenuPopupHelper this$0>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
		}
;
	//    5   10:aload_0         
	//    6   11:new             #8   <Class MenuPopupHelper$1>
	//    7   14:dup             
	//    8   15:aload_0         
	//    9   16:invokespecial   #51  <Method void MenuPopupHelper$1(MenuPopupHelper)>
	//   10   19:putfield        #53  <Field android.widget.PopupWindow$OnDismissListener mInternalOnDismissListener>
		mContext = context;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #55  <Field Context mContext>
		mMenu = menubuilder;
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:putfield        #57  <Field MenuBuilder mMenu>
		mAnchorView = view;
	//   17   32:aload_0         
	//   18   33:aload_3         
	//   19   34:putfield        #59  <Field View mAnchorView>
		mOverflowOnly = flag;
	//   20   37:aload_0         
	//   21   38:iload           4
	//   22   40:putfield        #61  <Field boolean mOverflowOnly>
		mPopupStyleAttr = i;
	//   23   43:aload_0         
	//   24   44:iload           5
	//   25   46:putfield        #63  <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   26   49:aload_0         
	//   27   50:iload           6
	//   28   52:putfield        #65  <Field int mPopupStyleRes>
	//   29   55:return          
	}

	private MenuPopup createPopup()
	{
		Object obj = ((Object) (((WindowManager)mContext.getSystemService("window")).getDefaultDisplay()));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field Context mContext>
	//    2    4:ldc1            #69  <String "window">
	//    3    6:invokevirtual   #75  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #77  <Class WindowManager>
	//    5   12:invokeinterface #81  <Method Display WindowManager.getDefaultDisplay()>
	//    6   17:astore_2        
		Point point = new Point();
	//    7   18:new             #83  <Class Point>
	//    8   21:dup             
	//    9   22:invokespecial   #84  <Method void Point()>
	//   10   25:astore_3        
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  11   26:getstatic       #89  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   29:bipush          17
	//*  13   31:icmplt          42
			((Display) (obj)).getRealSize(point);
	//   14   34:aload_2         
	//   15   35:aload_3         
	//   16   36:invokevirtual   #95  <Method void Display.getRealSize(Point)>
		else
	//*  17   39:goto            47
			((Display) (obj)).getSize(point);
	//   18   42:aload_2         
	//   19   43:aload_3         
	//   20   44:invokevirtual   #98  <Method void Display.getSize(Point)>
		boolean flag;
		if(Math.min(point.x, point.y) >= mContext.getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_cascading_menus_min_smallest_width))
	//*  21   47:aload_3         
	//*  22   48:getfield        #101 <Field int Point.x>
	//*  23   51:aload_3         
	//*  24   52:getfield        #104 <Field int Point.y>
	//*  25   55:invokestatic    #110 <Method int Math.min(int, int)>
	//*  26   58:aload_0         
	//*  27   59:getfield        #55  <Field Context mContext>
	//*  28   62:invokevirtual   #114 <Method Resources Context.getResources()>
	//*  29   65:getstatic       #119 <Field int android.support.v7.appcompat.R$dimen.abc_cascading_menus_min_smallest_width>
	//*  30   68:invokevirtual   #125 <Method int Resources.getDimensionPixelSize(int)>
	//*  31   71:icmplt          79
			flag = true;
	//   32   74:iconst_1        
	//   33   75:istore_1        
		else
	//*  34   76:goto            81
			flag = false;
	//   35   79:iconst_0        
	//   36   80:istore_1        
		if(flag)
	//*  37   81:iload_1         
	//*  38   82:ifeq            116
			obj = ((Object) (new CascadingMenuPopup(mContext, mAnchorView, mPopupStyleAttr, mPopupStyleRes, mOverflowOnly)));
	//   39   85:new             #127 <Class CascadingMenuPopup>
	//   40   88:dup             
	//   41   89:aload_0         
	//   42   90:getfield        #55  <Field Context mContext>
	//   43   93:aload_0         
	//   44   94:getfield        #59  <Field View mAnchorView>
	//   45   97:aload_0         
	//   46   98:getfield        #63  <Field int mPopupStyleAttr>
	//   47  101:aload_0         
	//   48  102:getfield        #65  <Field int mPopupStyleRes>
	//   49  105:aload_0         
	//   50  106:getfield        #61  <Field boolean mOverflowOnly>
	//   51  109:invokespecial   #130 <Method void CascadingMenuPopup(Context, View, int, int, boolean)>
	//   52  112:astore_2        
		else
	//*  53  113:goto            148
			obj = ((Object) (new StandardMenuPopup(mContext, mMenu, mAnchorView, mPopupStyleAttr, mPopupStyleRes, mOverflowOnly)));
	//   54  116:new             #132 <Class StandardMenuPopup>
	//   55  119:dup             
	//   56  120:aload_0         
	//   57  121:getfield        #55  <Field Context mContext>
	//   58  124:aload_0         
	//   59  125:getfield        #57  <Field MenuBuilder mMenu>
	//   60  128:aload_0         
	//   61  129:getfield        #59  <Field View mAnchorView>
	//   62  132:aload_0         
	//   63  133:getfield        #63  <Field int mPopupStyleAttr>
	//   64  136:aload_0         
	//   65  137:getfield        #65  <Field int mPopupStyleRes>
	//   66  140:aload_0         
	//   67  141:getfield        #61  <Field boolean mOverflowOnly>
	//   68  144:invokespecial   #135 <Method void StandardMenuPopup(Context, MenuBuilder, View, int, int, boolean)>
	//   69  147:astore_2        
		((MenuPopup) (obj)).addMenu(mMenu);
	//   70  148:aload_2         
	//   71  149:aload_0         
	//   72  150:getfield        #57  <Field MenuBuilder mMenu>
	//   73  153:invokevirtual   #141 <Method void MenuPopup.addMenu(MenuBuilder)>
		((MenuPopup) (obj)).setOnDismissListener(mInternalOnDismissListener);
	//   74  156:aload_2         
	//   75  157:aload_0         
	//   76  158:getfield        #53  <Field android.widget.PopupWindow$OnDismissListener mInternalOnDismissListener>
	//   77  161:invokevirtual   #145 <Method void MenuPopup.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
		((MenuPopup) (obj)).setAnchorView(mAnchorView);
	//   78  164:aload_2         
	//   79  165:aload_0         
	//   80  166:getfield        #59  <Field View mAnchorView>
	//   81  169:invokevirtual   #149 <Method void MenuPopup.setAnchorView(View)>
		((MenuPopup) (obj)).setCallback(mPresenterCallback);
	//   82  172:aload_2         
	//   83  173:aload_0         
	//   84  174:getfield        #151 <Field MenuPresenter$Callback mPresenterCallback>
	//   85  177:invokevirtual   #155 <Method void MenuPopup.setCallback(MenuPresenter$Callback)>
		((MenuPopup) (obj)).setForceShowIcon(mForceShowIcon);
	//   86  180:aload_2         
	//   87  181:aload_0         
	//   88  182:getfield        #157 <Field boolean mForceShowIcon>
	//   89  185:invokevirtual   #161 <Method void MenuPopup.setForceShowIcon(boolean)>
		((MenuPopup) (obj)).setGravity(mDropDownGravity);
	//   90  188:aload_2         
	//   91  189:aload_0         
	//   92  190:getfield        #48  <Field int mDropDownGravity>
	//   93  193:invokevirtual   #165 <Method void MenuPopup.setGravity(int)>
		return ((MenuPopup) (obj));
	//   94  196:aload_2         
	//   95  197:areturn         
	}

	private void showPopup(int i, int j, boolean flag, boolean flag1)
	{
		MenuPopup menupopup = getPopup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #171 <Method MenuPopup getPopup()>
	//    2    4:astore          6
		menupopup.setShowTitle(flag1);
	//    3    6:aload           6
	//    4    8:iload           4
	//    5   10:invokevirtual   #174 <Method void MenuPopup.setShowTitle(boolean)>
		if(flag)
	//*   6   13:iload_3         
	//*   7   14:ifeq            111
		{
			int k = i;
	//    8   17:iload_1         
	//    9   18:istore          5
			if((GravityCompat.getAbsoluteGravity(mDropDownGravity, ViewCompat.getLayoutDirection(mAnchorView)) & 7) == 5)
	//*  10   20:aload_0         
	//*  11   21:getfield        #48  <Field int mDropDownGravity>
	//*  12   24:aload_0         
	//*  13   25:getfield        #59  <Field View mAnchorView>
	//*  14   28:invokestatic    #180 <Method int ViewCompat.getLayoutDirection(View)>
	//*  15   31:invokestatic    #185 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  16   34:bipush          7
	//*  17   36:iand            
	//*  18   37:iconst_5        
	//*  19   38:icmpne          52
				k = i - mAnchorView.getWidth();
	//   20   41:iload_1         
	//   21   42:aload_0         
	//   22   43:getfield        #59  <Field View mAnchorView>
	//   23   46:invokevirtual   #191 <Method int View.getWidth()>
	//   24   49:isub            
	//   25   50:istore          5
			menupopup.setHorizontalOffset(k);
	//   26   52:aload           6
	//   27   54:iload           5
	//   28   56:invokevirtual   #194 <Method void MenuPopup.setHorizontalOffset(int)>
			menupopup.setVerticalOffset(j);
	//   29   59:aload           6
	//   30   61:iload_2         
	//   31   62:invokevirtual   #197 <Method void MenuPopup.setVerticalOffset(int)>
			i = (int)((mContext.getResources().getDisplayMetrics().density * 48F) / 2.0F);
	//   32   65:aload_0         
	//   33   66:getfield        #55  <Field Context mContext>
	//   34   69:invokevirtual   #114 <Method Resources Context.getResources()>
	//   35   72:invokevirtual   #201 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   36   75:getfield        #207 <Field float DisplayMetrics.density>
	//   37   78:ldc1            #208 <Float 48F>
	//   38   80:fmul            
	//   39   81:fconst_2        
	//   40   82:fdiv            
	//   41   83:f2i             
	//   42   84:istore_1        
			menupopup.setEpicenterBounds(new Rect(k - i, j - i, k + i, j + i));
	//   43   85:aload           6
	//   44   87:new             #210 <Class Rect>
	//   45   90:dup             
	//   46   91:iload           5
	//   47   93:iload_1         
	//   48   94:isub            
	//   49   95:iload_2         
	//   50   96:iload_1         
	//   51   97:isub            
	//   52   98:iload           5
	//   53  100:iload_1         
	//   54  101:iadd            
	//   55  102:iload_2         
	//   56  103:iload_1         
	//   57  104:iadd            
	//   58  105:invokespecial   #213 <Method void Rect(int, int, int, int)>
	//   59  108:invokevirtual   #217 <Method void MenuPopup.setEpicenterBounds(Rect)>
		}
		menupopup.show();
	//   60  111:aload           6
	//   61  113:invokevirtual   #220 <Method void MenuPopup.show()>
	//   62  116:return          
	}

	public void dismiss()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #225 <Method boolean isShowing()>
	//*   2    4:ifeq            14
			mPopup.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #227 <Field MenuPopup mPopup>
	//    5   11:invokevirtual   #229 <Method void MenuPopup.dismiss()>
	//    6   14:return          
	}

	public MenuPopup getPopup()
	{
		if(mPopup == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #227 <Field MenuPopup mPopup>
	//*   2    4:ifnonnull       15
			mPopup = createPopup();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #231 <Method MenuPopup createPopup()>
	//    6   12:putfield        #227 <Field MenuPopup mPopup>
		return mPopup;
	//    7   15:aload_0         
	//    8   16:getfield        #227 <Field MenuPopup mPopup>
	//    9   19:areturn         
	}

	public boolean isShowing()
	{
		MenuPopup menupopup = mPopup;
	//    0    0:aload_0         
	//    1    1:getfield        #227 <Field MenuPopup mPopup>
	//    2    4:astore_1        
		return menupopup != null && menupopup.isShowing();
	//    3    5:aload_1         
	//    4    6:ifnull          18
	//    5    9:aload_1         
	//    6   10:invokevirtual   #232 <Method boolean MenuPopup.isShowing()>
	//    7   13:ifeq            18
	//    8   16:iconst_1        
	//    9   17:ireturn         
	//   10   18:iconst_0        
	//   11   19:ireturn         
	}

	protected void onDismiss()
	{
		mPopup = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #227 <Field MenuPopup mPopup>
		android.widget.PopupWindow.OnDismissListener ondismisslistener = mOnDismissListener;
	//    3    5:aload_0         
	//    4    6:getfield        #235 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    5    9:astore_1        
		if(ondismisslistener != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          20
			ondismisslistener.onDismiss();
	//    8   14:aload_1         
	//    9   15:invokeinterface #239 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//   10   20:return          
	}

	public void setAnchorView(View view)
	{
		mAnchorView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #59  <Field View mAnchorView>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #157 <Field boolean mForceShowIcon>
		MenuPopup menupopup = mPopup;
	//    3    5:aload_0         
	//    4    6:getfield        #227 <Field MenuPopup mPopup>
	//    5    9:astore_2        
		if(menupopup != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			menupopup.setForceShowIcon(flag);
	//    8   14:aload_2         
	//    9   15:iload_1         
	//   10   16:invokevirtual   #161 <Method void MenuPopup.setForceShowIcon(boolean)>
	//   11   19:return          
	}

	public void setGravity(int i)
	{
		mDropDownGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #48  <Field int mDropDownGravity>
	//    3    5:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #235 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setPresenterCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #151 <Field MenuPresenter$Callback mPresenterCallback>
		MenuPopup menupopup = mPopup;
	//    3    5:aload_0         
	//    4    6:getfield        #227 <Field MenuPopup mPopup>
	//    5    9:astore_2        
		if(menupopup != null)
	//*   6   10:aload_2         
	//*   7   11:ifnull          19
			menupopup.setCallback(callback);
	//    8   14:aload_2         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #155 <Method void MenuPopup.setCallback(MenuPresenter$Callback)>
	//   11   19:return          
	}

	public void show()
	{
		if(tryShow())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #244 <Method boolean tryShow()>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		else
			throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
	//    4    8:new             #246 <Class IllegalStateException>
	//    5   11:dup             
	//    6   12:ldc1            #248 <String "MenuPopupHelper cannot be used without an anchor">
	//    7   14:invokespecial   #251 <Method void IllegalStateException(String)>
	//    8   17:athrow          
	}

	public boolean tryShow()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #225 <Method boolean isShowing()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(mAnchorView == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #59  <Field View mAnchorView>
	//*   7   13:ifnonnull       18
		{
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		} else
		{
			showPopup(0, 0, false, false);
	//   10   18:aload_0         
	//   11   19:iconst_0        
	//   12   20:iconst_0        
	//   13   21:iconst_0        
	//   14   22:iconst_0        
	//   15   23:invokespecial   #253 <Method void showPopup(int, int, boolean, boolean)>
			return true;
	//   16   26:iconst_1        
	//   17   27:ireturn         
		}
	}

	public boolean tryShow(int i, int j)
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #225 <Method boolean isShowing()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(mAnchorView == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #59  <Field View mAnchorView>
	//*   7   13:ifnonnull       18
		{
			return false;
	//    8   16:iconst_0        
	//    9   17:ireturn         
		} else
		{
			showPopup(i, j, true, true);
	//   10   18:aload_0         
	//   11   19:iload_1         
	//   12   20:iload_2         
	//   13   21:iconst_1        
	//   14   22:iconst_1        
	//   15   23:invokespecial   #253 <Method void showPopup(int, int, boolean, boolean)>
			return true;
	//   16   26:iconst_1        
	//   17   27:ireturn         
		}
	}

	private View mAnchorView;
	private final Context mContext;
	private int mDropDownGravity;
	private boolean mForceShowIcon;
	private final android.widget.PopupWindow.OnDismissListener mInternalOnDismissListener;
	private final MenuBuilder mMenu;
	private android.widget.PopupWindow.OnDismissListener mOnDismissListener;
	private final boolean mOverflowOnly;
	private MenuPopup mPopup;
	private final int mPopupStyleAttr;
	private final int mPopupStyleRes;
	private MenuPresenter.Callback mPresenterCallback;
}
