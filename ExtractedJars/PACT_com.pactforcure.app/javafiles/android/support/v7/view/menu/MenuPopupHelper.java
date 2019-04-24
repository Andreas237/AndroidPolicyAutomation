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
//			MenuHelper, CascadingMenuPopup, MenuPopup, StandardMenuPopup, 
//			MenuBuilder

public class MenuPopupHelper
	implements MenuHelper
{

	public MenuPopupHelper(Context context, MenuBuilder menubuilder)
	{
		this(context, menubuilder, ((View) (null)), false, android.support.v7.appcompat.R.attr.popupMenuStyle, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:iconst_0        
	//    5    5:getstatic       #42  <Field int android.support.v7.appcompat.R$attr.popupMenuStyle>
	//    6    8:iconst_0        
	//    7    9:invokespecial   #45  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//    8   12:return          
	}

	public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view)
	{
		this(context, menubuilder, view, false, android.support.v7.appcompat.R.attr.popupMenuStyle, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:iconst_0        
	//    5    5:getstatic       #42  <Field int android.support.v7.appcompat.R$attr.popupMenuStyle>
	//    6    8:iconst_0        
	//    7    9:invokespecial   #45  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//    8   12:return          
	}

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
	//    7    9:invokespecial   #45  <Method void MenuPopupHelper(Context, MenuBuilder, View, boolean, int, int)>
	//    8   12:return          
	}

	public MenuPopupHelper(Context context, MenuBuilder menubuilder, View view, boolean flag, int i, int j)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #54  <Method void Object()>
		mDropDownGravity = 0x800003;
	//    2    4:aload_0         
	//    3    5:ldc1            #55  <Int 0x800003>
	//    4    7:putfield        #57  <Field int mDropDownGravity>
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
	//    9   16:invokespecial   #60  <Method void MenuPopupHelper$1(MenuPopupHelper)>
	//   10   19:putfield        #62  <Field android.widget.PopupWindow$OnDismissListener mInternalOnDismissListener>
		mContext = context;
	//   11   22:aload_0         
	//   12   23:aload_1         
	//   13   24:putfield        #64  <Field Context mContext>
		mMenu = menubuilder;
	//   14   27:aload_0         
	//   15   28:aload_2         
	//   16   29:putfield        #66  <Field MenuBuilder mMenu>
		mAnchorView = view;
	//   17   32:aload_0         
	//   18   33:aload_3         
	//   19   34:putfield        #68  <Field View mAnchorView>
		mOverflowOnly = flag;
	//   20   37:aload_0         
	//   21   38:iload           4
	//   22   40:putfield        #70  <Field boolean mOverflowOnly>
		mPopupStyleAttr = i;
	//   23   43:aload_0         
	//   24   44:iload           5
	//   25   46:putfield        #72  <Field int mPopupStyleAttr>
		mPopupStyleRes = j;
	//   26   49:aload_0         
	//   27   50:iload           6
	//   28   52:putfield        #74  <Field int mPopupStyleRes>
	//   29   55:return          
	}

	private MenuPopup createPopup()
	{
		Object obj = ((Object) (((WindowManager)mContext.getSystemService("window")).getDefaultDisplay()));
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field Context mContext>
	//    2    4:ldc1            #78  <String "window">
	//    3    6:invokevirtual   #84  <Method Object Context.getSystemService(String)>
	//    4    9:checkcast       #86  <Class WindowManager>
	//    5   12:invokeinterface #90  <Method Display WindowManager.getDefaultDisplay()>
	//    6   17:astore_2        
		Point point = new Point();
	//    7   18:new             #92  <Class Point>
	//    8   21:dup             
	//    9   22:invokespecial   #93  <Method void Point()>
	//   10   25:astore_3        
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  11   26:getstatic       #98  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   29:bipush          17
	//*  13   31:icmplt          150
			((Display) (obj)).getRealSize(point);
	//   14   34:aload_2         
	//   15   35:aload_3         
	//   16   36:invokevirtual   #104 <Method void Display.getRealSize(Point)>
		else
	//*  17   39:aload_3         
	//*  18   40:getfield        #107 <Field int Point.x>
	//*  19   43:aload_3         
	//*  20   44:getfield        #110 <Field int Point.y>
	//*  21   47:invokestatic    #116 <Method int Math.min(int, int)>
	//*  22   50:aload_0         
	//*  23   51:getfield        #64  <Field Context mContext>
	//*  24   54:invokevirtual   #120 <Method Resources Context.getResources()>
	//*  25   57:getstatic       #125 <Field int android.support.v7.appcompat.R$dimen.abc_cascading_menus_min_smallest_width>
	//*  26   60:invokevirtual   #131 <Method int Resources.getDimensionPixelSize(int)>
	//*  27   63:icmplt          158
	//*  28   66:iconst_1        
	//*  29   67:istore_1        
	//*  30   68:iload_1         
	//*  31   69:ifeq            163
	//*  32   72:new             #133 <Class CascadingMenuPopup>
	//*  33   75:dup             
	//*  34   76:aload_0         
	//*  35   77:getfield        #64  <Field Context mContext>
	//*  36   80:aload_0         
	//*  37   81:getfield        #68  <Field View mAnchorView>
	//*  38   84:aload_0         
	//*  39   85:getfield        #72  <Field int mPopupStyleAttr>
	//*  40   88:aload_0         
	//*  41   89:getfield        #74  <Field int mPopupStyleRes>
	//*  42   92:aload_0         
	//*  43   93:getfield        #70  <Field boolean mOverflowOnly>
	//*  44   96:invokespecial   #136 <Method void CascadingMenuPopup(Context, View, int, int, boolean)>
	//*  45   99:astore_2        
	//*  46  100:aload_2         
	//*  47  101:aload_0         
	//*  48  102:getfield        #66  <Field MenuBuilder mMenu>
	//*  49  105:invokevirtual   #142 <Method void MenuPopup.addMenu(MenuBuilder)>
	//*  50  108:aload_2         
	//*  51  109:aload_0         
	//*  52  110:getfield        #62  <Field android.widget.PopupWindow$OnDismissListener mInternalOnDismissListener>
	//*  53  113:invokevirtual   #146 <Method void MenuPopup.setOnDismissListener(android.widget.PopupWindow$OnDismissListener)>
	//*  54  116:aload_2         
	//*  55  117:aload_0         
	//*  56  118:getfield        #68  <Field View mAnchorView>
	//*  57  121:invokevirtual   #150 <Method void MenuPopup.setAnchorView(View)>
	//*  58  124:aload_2         
	//*  59  125:aload_0         
	//*  60  126:getfield        #152 <Field MenuPresenter$Callback mPresenterCallback>
	//*  61  129:invokevirtual   #156 <Method void MenuPopup.setCallback(MenuPresenter$Callback)>
	//*  62  132:aload_2         
	//*  63  133:aload_0         
	//*  64  134:getfield        #158 <Field boolean mForceShowIcon>
	//*  65  137:invokevirtual   #162 <Method void MenuPopup.setForceShowIcon(boolean)>
	//*  66  140:aload_2         
	//*  67  141:aload_0         
	//*  68  142:getfield        #57  <Field int mDropDownGravity>
	//*  69  145:invokevirtual   #166 <Method void MenuPopup.setGravity(int)>
	//*  70  148:aload_2         
	//*  71  149:areturn         
			((Display) (obj)).getSize(point);
	//   72  150:aload_2         
	//   73  151:aload_3         
	//   74  152:invokevirtual   #169 <Method void Display.getSize(Point)>
		if(Math.min(point.x, point.y) >= mContext.getResources().getDimensionPixelSize(android.support.v7.appcompat.R.dimen.abc_cascading_menus_min_smallest_width))
			flag = true;
		else
	//*  75  155:goto            39
			flag = false;
	//   76  158:iconst_0        
	//   77  159:istore_1        
		if(flag)
			obj = ((Object) (new CascadingMenuPopup(mContext, mAnchorView, mPopupStyleAttr, mPopupStyleRes, mOverflowOnly)));
		else
	//*  78  160:goto            68
			obj = ((Object) (new StandardMenuPopup(mContext, mMenu, mAnchorView, mPopupStyleAttr, mPopupStyleRes, mOverflowOnly)));
	//   79  163:new             #171 <Class StandardMenuPopup>
	//   80  166:dup             
	//   81  167:aload_0         
	//   82  168:getfield        #64  <Field Context mContext>
	//   83  171:aload_0         
	//   84  172:getfield        #66  <Field MenuBuilder mMenu>
	//   85  175:aload_0         
	//   86  176:getfield        #68  <Field View mAnchorView>
	//   87  179:aload_0         
	//   88  180:getfield        #72  <Field int mPopupStyleAttr>
	//   89  183:aload_0         
	//   90  184:getfield        #74  <Field int mPopupStyleRes>
	//   91  187:aload_0         
	//   92  188:getfield        #70  <Field boolean mOverflowOnly>
	//   93  191:invokespecial   #174 <Method void StandardMenuPopup(Context, MenuBuilder, View, int, int, boolean)>
	//   94  194:astore_2        
		((MenuPopup) (obj)).addMenu(mMenu);
		((MenuPopup) (obj)).setOnDismissListener(mInternalOnDismissListener);
		((MenuPopup) (obj)).setAnchorView(mAnchorView);
		((MenuPopup) (obj)).setCallback(mPresenterCallback);
		((MenuPopup) (obj)).setForceShowIcon(mForceShowIcon);
		((MenuPopup) (obj)).setGravity(mDropDownGravity);
		return ((MenuPopup) (obj));
	//*  95  195:goto            100
	}

	private void showPopup(int i, int j, boolean flag, boolean flag1)
	{
		MenuPopup menupopup = getPopup();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #180 <Method MenuPopup getPopup()>
	//    2    4:astore          6
		menupopup.setShowTitle(flag1);
	//    3    6:aload           6
	//    4    8:iload           4
	//    5   10:invokevirtual   #183 <Method void MenuPopup.setShowTitle(boolean)>
		if(flag)
	//*   6   13:iload_3         
	//*   7   14:ifeq            111
		{
			int k = i;
	//    8   17:iload_1         
	//    9   18:istore          5
			if((GravityCompat.getAbsoluteGravity(mDropDownGravity, ViewCompat.getLayoutDirection(mAnchorView)) & 7) == 5)
	//*  10   20:aload_0         
	//*  11   21:getfield        #57  <Field int mDropDownGravity>
	//*  12   24:aload_0         
	//*  13   25:getfield        #68  <Field View mAnchorView>
	//*  14   28:invokestatic    #189 <Method int ViewCompat.getLayoutDirection(View)>
	//*  15   31:invokestatic    #194 <Method int GravityCompat.getAbsoluteGravity(int, int)>
	//*  16   34:bipush          7
	//*  17   36:iand            
	//*  18   37:iconst_5        
	//*  19   38:icmpne          52
				k = i + mAnchorView.getWidth();
	//   20   41:iload_1         
	//   21   42:aload_0         
	//   22   43:getfield        #68  <Field View mAnchorView>
	//   23   46:invokevirtual   #200 <Method int View.getWidth()>
	//   24   49:iadd            
	//   25   50:istore          5
			menupopup.setHorizontalOffset(k);
	//   26   52:aload           6
	//   27   54:iload           5
	//   28   56:invokevirtual   #203 <Method void MenuPopup.setHorizontalOffset(int)>
			menupopup.setVerticalOffset(j);
	//   29   59:aload           6
	//   30   61:iload_2         
	//   31   62:invokevirtual   #206 <Method void MenuPopup.setVerticalOffset(int)>
			i = (int)((48F * mContext.getResources().getDisplayMetrics().density) / 2.0F);
	//   32   65:ldc1            #207 <Float 48F>
	//   33   67:aload_0         
	//   34   68:getfield        #64  <Field Context mContext>
	//   35   71:invokevirtual   #120 <Method Resources Context.getResources()>
	//   36   74:invokevirtual   #211 <Method DisplayMetrics Resources.getDisplayMetrics()>
	//   37   77:getfield        #217 <Field float DisplayMetrics.density>
	//   38   80:fmul            
	//   39   81:fconst_2        
	//   40   82:fdiv            
	//   41   83:f2i             
	//   42   84:istore_1        
			menupopup.setEpicenterBounds(new Rect(k - i, j - i, k + i, j + i));
	//   43   85:aload           6
	//   44   87:new             #219 <Class Rect>
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
	//   58  105:invokespecial   #222 <Method void Rect(int, int, int, int)>
	//   59  108:invokevirtual   #226 <Method void MenuPopup.setEpicenterBounds(Rect)>
		}
		menupopup.show();
	//   60  111:aload           6
	//   61  113:invokevirtual   #229 <Method void MenuPopup.show()>
	//   62  116:return          
	}

	public void dismiss()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #234 <Method boolean isShowing()>
	//*   2    4:ifeq            14
			mPopup.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #236 <Field MenuPopup mPopup>
	//    5   11:invokevirtual   #238 <Method void MenuPopup.dismiss()>
	//    6   14:return          
	}

	public int getGravity()
	{
		return mDropDownGravity;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field int mDropDownGravity>
	//    2    4:ireturn         
	}

	public MenuPopup getPopup()
	{
		if(mPopup == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #236 <Field MenuPopup mPopup>
	//*   2    4:ifnonnull       15
			mPopup = createPopup();
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:invokespecial   #241 <Method MenuPopup createPopup()>
	//    6   12:putfield        #236 <Field MenuPopup mPopup>
		return mPopup;
	//    7   15:aload_0         
	//    8   16:getfield        #236 <Field MenuPopup mPopup>
	//    9   19:areturn         
	}

	public boolean isShowing()
	{
		return mPopup != null && mPopup.isShowing();
	//    0    0:aload_0         
	//    1    1:getfield        #236 <Field MenuPopup mPopup>
	//    2    4:ifnull          19
	//    3    7:aload_0         
	//    4    8:getfield        #236 <Field MenuPopup mPopup>
	//    5   11:invokevirtual   #242 <Method boolean MenuPopup.isShowing()>
	//    6   14:ifeq            19
	//    7   17:iconst_1        
	//    8   18:ireturn         
	//    9   19:iconst_0        
	//   10   20:ireturn         
	}

	protected void onDismiss()
	{
		mPopup = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #236 <Field MenuPopup mPopup>
		if(mOnDismissListener != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #245 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//*   5    9:ifnull          21
			mOnDismissListener.onDismiss();
	//    6   12:aload_0         
	//    7   13:getfield        #245 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    8   16:invokeinterface #249 <Method void android.widget.PopupWindow$OnDismissListener.onDismiss()>
	//    9   21:return          
	}

	public void setAnchorView(View view)
	{
		mAnchorView = view;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #68  <Field View mAnchorView>
	//    3    5:return          
	}

	public void setForceShowIcon(boolean flag)
	{
		mForceShowIcon = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #158 <Field boolean mForceShowIcon>
		if(mPopup != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #236 <Field MenuPopup mPopup>
	//*   5    9:ifnull          20
			mPopup.setForceShowIcon(flag);
	//    6   12:aload_0         
	//    7   13:getfield        #236 <Field MenuPopup mPopup>
	//    8   16:iload_1         
	//    9   17:invokevirtual   #162 <Method void MenuPopup.setForceShowIcon(boolean)>
	//   10   20:return          
	}

	public void setGravity(int i)
	{
		mDropDownGravity = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #57  <Field int mDropDownGravity>
	//    3    5:return          
	}

	public void setOnDismissListener(android.widget.PopupWindow.OnDismissListener ondismisslistener)
	{
		mOnDismissListener = ondismisslistener;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #245 <Field android.widget.PopupWindow$OnDismissListener mOnDismissListener>
	//    3    5:return          
	}

	public void setPresenterCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #152 <Field MenuPresenter$Callback mPresenterCallback>
		if(mPopup != null)
	//*   3    5:aload_0         
	//*   4    6:getfield        #236 <Field MenuPopup mPopup>
	//*   5    9:ifnull          20
			mPopup.setCallback(callback);
	//    6   12:aload_0         
	//    7   13:getfield        #236 <Field MenuPopup mPopup>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #156 <Method void MenuPopup.setCallback(MenuPresenter$Callback)>
	//   10   20:return          
	}

	public void show()
	{
		if(!tryShow())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #254 <Method boolean tryShow()>
	//*   2    4:ifne            18
			throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
	//    3    7:new             #256 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc2            #258 <String "MenuPopupHelper cannot be used without an anchor">
	//    6   14:invokespecial   #261 <Method void IllegalStateException(String)>
	//    7   17:athrow          
		else
			return;
	//    8   18:return          
	}

	public void show(int i, int j)
	{
		if(!tryShow(i, j))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:iload_2         
	//*   3    3:invokevirtual   #265 <Method boolean tryShow(int, int)>
	//*   4    6:ifne            20
			throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
	//    5    9:new             #256 <Class IllegalStateException>
	//    6   12:dup             
	//    7   13:ldc2            #258 <String "MenuPopupHelper cannot be used without an anchor">
	//    8   16:invokespecial   #261 <Method void IllegalStateException(String)>
	//    9   19:athrow          
		else
			return;
	//   10   20:return          
	}

	public boolean tryShow()
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #234 <Method boolean isShowing()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(mAnchorView == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #68  <Field View mAnchorView>
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
	//   15   23:invokespecial   #267 <Method void showPopup(int, int, boolean, boolean)>
			return true;
	//   16   26:iconst_1        
	//   17   27:ireturn         
		}
	}

	public boolean tryShow(int i, int j)
	{
		if(isShowing())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #234 <Method boolean isShowing()>
	//*   2    4:ifeq            9
			return true;
	//    3    7:iconst_1        
	//    4    8:ireturn         
		if(mAnchorView == null)
	//*   5    9:aload_0         
	//*   6   10:getfield        #68  <Field View mAnchorView>
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
	//   15   23:invokespecial   #267 <Method void showPopup(int, int, boolean, boolean)>
			return true;
	//   16   26:iconst_1        
	//   17   27:ireturn         
		}
	}

	private static final int TOUCH_EPICENTER_SIZE_DP = 48;
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
