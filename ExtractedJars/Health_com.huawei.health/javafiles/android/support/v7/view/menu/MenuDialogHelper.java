// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.support.v7.app.AlertDialog;
import android.view.*;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.view.menu:
//			ListMenuPresenter, MenuItemImpl, MenuBuilder

class MenuDialogHelper
	implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, MenuPresenter.Callback
{

	public MenuDialogHelper(MenuBuilder menubuilder)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void Object()>
		mMenu = menubuilder;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #27  <Field MenuBuilder mMenu>
	//    5    9:return          
	}

	public void dismiss()
	{
		if(mDialog != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #31  <Field AlertDialog mDialog>
	//*   2    4:ifnull          14
			mDialog.dismiss();
	//    3    7:aload_0         
	//    4    8:getfield        #31  <Field AlertDialog mDialog>
	//    5   11:invokevirtual   #35  <Method void AlertDialog.dismiss()>
	//    6   14:return          
	}

	public void onClick(DialogInterface dialoginterface, int i)
	{
		mMenu.performItemAction(((android.view.MenuItem) ((MenuItemImpl)mPresenter.getAdapter().getItem(i))), 0);
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field MenuBuilder mMenu>
	//    2    4:aload_0         
	//    3    5:getfield        #39  <Field ListMenuPresenter mPresenter>
	//    4    8:invokevirtual   #45  <Method ListAdapter ListMenuPresenter.getAdapter()>
	//    5   11:iload_2         
	//    6   12:invokeinterface #51  <Method Object ListAdapter.getItem(int)>
	//    7   17:checkcast       #53  <Class MenuItemImpl>
	//    8   20:iconst_0        
	//    9   21:invokevirtual   #59  <Method boolean MenuBuilder.performItemAction(android.view.MenuItem, int)>
	//   10   24:pop             
	//   11   25:return          
	}

	public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
	{
		if(flag || menubuilder == mMenu)
	//*   0    0:iload_2         
	//*   1    1:ifne            12
	//*   2    4:aload_1         
	//*   3    5:aload_0         
	//*   4    6:getfield        #27  <Field MenuBuilder mMenu>
	//*   5    9:if_acmpne       16
			dismiss();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #62  <Method void dismiss()>
		if(mPresenterCallback != null)
	//*   8   16:aload_0         
	//*   9   17:getfield        #64  <Field MenuPresenter$Callback mPresenterCallback>
	//*  10   20:ifnull          34
			mPresenterCallback.onCloseMenu(menubuilder, flag);
	//   11   23:aload_0         
	//   12   24:getfield        #64  <Field MenuPresenter$Callback mPresenterCallback>
	//   13   27:aload_1         
	//   14   28:iload_2         
	//   15   29:invokeinterface #66  <Method void MenuPresenter$Callback.onCloseMenu(MenuBuilder, boolean)>
	//   16   34:return          
	}

	public void onDismiss(DialogInterface dialoginterface)
	{
		mPresenter.onCloseMenu(mMenu, true);
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field ListMenuPresenter mPresenter>
	//    2    4:aload_0         
	//    3    5:getfield        #27  <Field MenuBuilder mMenu>
	//    4    8:iconst_1        
	//    5    9:invokevirtual   #69  <Method void ListMenuPresenter.onCloseMenu(MenuBuilder, boolean)>
	//    6   12:return          
	}

	public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
	{
		if(i == 82 || i == 4)
	//*   0    0:iload_2         
	//*   1    1:bipush          82
	//*   2    3:icmpeq          11
	//*   3    6:iload_2         
	//*   4    7:iconst_4        
	//*   5    8:icmpne          144
			if(keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
	//*   6   11:aload_3         
	//*   7   12:invokevirtual   #77  <Method int KeyEvent.getAction()>
	//*   8   15:ifne            66
	//*   9   18:aload_3         
	//*  10   19:invokevirtual   #80  <Method int KeyEvent.getRepeatCount()>
	//*  11   22:ifne            66
			{
				dialoginterface = ((DialogInterface) (mDialog.getWindow()));
	//   12   25:aload_0         
	//   13   26:getfield        #31  <Field AlertDialog mDialog>
	//   14   29:invokevirtual   #84  <Method Window AlertDialog.getWindow()>
	//   15   32:astore_1        
				if(dialoginterface != null)
	//*  16   33:aload_1         
	//*  17   34:ifnull          63
				{
					dialoginterface = ((DialogInterface) (((Window) (dialoginterface)).getDecorView()));
	//   18   37:aload_1         
	//   19   38:invokevirtual   #90  <Method View Window.getDecorView()>
	//   20   41:astore_1        
					if(dialoginterface != null)
	//*  21   42:aload_1         
	//*  22   43:ifnull          63
					{
						dialoginterface = ((DialogInterface) (((View) (dialoginterface)).getKeyDispatcherState()));
	//   23   46:aload_1         
	//   24   47:invokevirtual   #96  <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   25   50:astore_1        
						if(dialoginterface != null)
	//*  26   51:aload_1         
	//*  27   52:ifnull          63
						{
							((android.view.KeyEvent.DispatcherState) (dialoginterface)).startTracking(keyevent, ((Object) (this)));
	//   28   55:aload_1         
	//   29   56:aload_3         
	//   30   57:aload_0         
	//   31   58:invokevirtual   #102 <Method void android.view.KeyEvent$DispatcherState.startTracking(KeyEvent, Object)>
							return true;
	//   32   61:iconst_1        
	//   33   62:ireturn         
						}
					}
				}
			} else
	//*  34   63:goto            144
			if(keyevent.getAction() == 1 && !keyevent.isCanceled())
	//*  35   66:aload_3         
	//*  36   67:invokevirtual   #77  <Method int KeyEvent.getAction()>
	//*  37   70:iconst_1        
	//*  38   71:icmpne          144
	//*  39   74:aload_3         
	//*  40   75:invokevirtual   #106 <Method boolean KeyEvent.isCanceled()>
	//*  41   78:ifne            144
			{
				Object obj = ((Object) (mDialog.getWindow()));
	//   42   81:aload_0         
	//   43   82:getfield        #31  <Field AlertDialog mDialog>
	//   44   85:invokevirtual   #84  <Method Window AlertDialog.getWindow()>
	//   45   88:astore          4
				if(obj != null)
	//*  46   90:aload           4
	//*  47   92:ifnull          144
				{
					obj = ((Object) (((Window) (obj)).getDecorView()));
	//   48   95:aload           4
	//   49   97:invokevirtual   #90  <Method View Window.getDecorView()>
	//   50  100:astore          4
					if(obj != null)
	//*  51  102:aload           4
	//*  52  104:ifnull          144
					{
						obj = ((Object) (((View) (obj)).getKeyDispatcherState()));
	//   53  107:aload           4
	//   54  109:invokevirtual   #96  <Method android.view.KeyEvent$DispatcherState View.getKeyDispatcherState()>
	//   55  112:astore          4
						if(obj != null && ((android.view.KeyEvent.DispatcherState) (obj)).isTracking(keyevent))
	//*  56  114:aload           4
	//*  57  116:ifnull          144
	//*  58  119:aload           4
	//*  59  121:aload_3         
	//*  60  122:invokevirtual   #110 <Method boolean android.view.KeyEvent$DispatcherState.isTracking(KeyEvent)>
	//*  61  125:ifeq            144
						{
							mMenu.close(true);
	//   62  128:aload_0         
	//   63  129:getfield        #27  <Field MenuBuilder mMenu>
	//   64  132:iconst_1        
	//   65  133:invokevirtual   #114 <Method void MenuBuilder.close(boolean)>
							dialoginterface.dismiss();
	//   66  136:aload_1         
	//   67  137:invokeinterface #117 <Method void DialogInterface.dismiss()>
							return true;
	//   68  142:iconst_1        
	//   69  143:ireturn         
						}
					}
				}
			}
		return mMenu.performShortcut(i, keyevent, 0);
	//   70  144:aload_0         
	//   71  145:getfield        #27  <Field MenuBuilder mMenu>
	//   72  148:iload_2         
	//   73  149:aload_3         
	//   74  150:iconst_0        
	//   75  151:invokevirtual   #121 <Method boolean MenuBuilder.performShortcut(int, KeyEvent, int)>
	//   76  154:ireturn         
	}

	public boolean onOpenSubMenu(MenuBuilder menubuilder)
	{
		if(mPresenterCallback != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #64  <Field MenuPresenter$Callback mPresenterCallback>
	//*   2    4:ifnull          18
			return mPresenterCallback.onOpenSubMenu(menubuilder);
	//    3    7:aload_0         
	//    4    8:getfield        #64  <Field MenuPresenter$Callback mPresenterCallback>
	//    5   11:aload_1         
	//    6   12:invokeinterface #125 <Method boolean MenuPresenter$Callback.onOpenSubMenu(MenuBuilder)>
	//    7   17:ireturn         
		else
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
	}

	public void setPresenterCallback(MenuPresenter.Callback callback)
	{
		mPresenterCallback = callback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #64  <Field MenuPresenter$Callback mPresenterCallback>
	//    3    5:return          
	}

	public void show(IBinder ibinder)
	{
		Object obj = ((Object) (mMenu));
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field MenuBuilder mMenu>
	//    2    4:astore_2        
		android.support.v7.app.AlertDialog.Builder builder = new android.support.v7.app.AlertDialog.Builder(((MenuBuilder) (obj)).getContext());
	//    3    5:new             #131 <Class android.support.v7.app.AlertDialog$Builder>
	//    4    8:dup             
	//    5    9:aload_2         
	//    6   10:invokevirtual   #135 <Method android.content.Context MenuBuilder.getContext()>
	//    7   13:invokespecial   #138 <Method void android.support.v7.app.AlertDialog$Builder(android.content.Context)>
	//    8   16:astore_3        
		mPresenter = new ListMenuPresenter(builder.getContext(), android.support.v7.appcompat.R.layout.abc_list_menu_item_layout);
	//    9   17:aload_0         
	//   10   18:new             #41  <Class ListMenuPresenter>
	//   11   21:dup             
	//   12   22:aload_3         
	//   13   23:invokevirtual   #139 <Method android.content.Context android.support.v7.app.AlertDialog$Builder.getContext()>
	//   14   26:getstatic       #145 <Field int android.support.v7.appcompat.R$layout.abc_list_menu_item_layout>
	//   15   29:invokespecial   #148 <Method void ListMenuPresenter(android.content.Context, int)>
	//   16   32:putfield        #39  <Field ListMenuPresenter mPresenter>
		mPresenter.setCallback(((MenuPresenter.Callback) (this)));
	//   17   35:aload_0         
	//   18   36:getfield        #39  <Field ListMenuPresenter mPresenter>
	//   19   39:aload_0         
	//   20   40:invokevirtual   #151 <Method void ListMenuPresenter.setCallback(MenuPresenter$Callback)>
		mMenu.addMenuPresenter(((MenuPresenter) (mPresenter)));
	//   21   43:aload_0         
	//   22   44:getfield        #27  <Field MenuBuilder mMenu>
	//   23   47:aload_0         
	//   24   48:getfield        #39  <Field ListMenuPresenter mPresenter>
	//   25   51:invokevirtual   #155 <Method void MenuBuilder.addMenuPresenter(MenuPresenter)>
		builder.setAdapter(mPresenter.getAdapter(), ((android.content.DialogInterface.OnClickListener) (this)));
	//   26   54:aload_3         
	//   27   55:aload_0         
	//   28   56:getfield        #39  <Field ListMenuPresenter mPresenter>
	//   29   59:invokevirtual   #45  <Method ListAdapter ListMenuPresenter.getAdapter()>
	//   30   62:aload_0         
	//   31   63:invokevirtual   #159 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setAdapter(ListAdapter, android.content.DialogInterface$OnClickListener)>
	//   32   66:pop             
		View view = ((MenuBuilder) (obj)).getHeaderView();
	//   33   67:aload_2         
	//   34   68:invokevirtual   #162 <Method View MenuBuilder.getHeaderView()>
	//   35   71:astore          4
		if(view != null)
	//*  36   73:aload           4
	//*  37   75:ifnull          88
			builder.setCustomTitle(view);
	//   38   78:aload_3         
	//   39   79:aload           4
	//   40   81:invokevirtual   #166 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setCustomTitle(View)>
	//   41   84:pop             
		else
	//*  42   85:goto            104
			builder.setIcon(((MenuBuilder) (obj)).getHeaderIcon()).setTitle(((MenuBuilder) (obj)).getHeaderTitle());
	//   43   88:aload_3         
	//   44   89:aload_2         
	//   45   90:invokevirtual   #170 <Method android.graphics.drawable.Drawable MenuBuilder.getHeaderIcon()>
	//   46   93:invokevirtual   #174 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setIcon(android.graphics.drawable.Drawable)>
	//   47   96:aload_2         
	//   48   97:invokevirtual   #178 <Method CharSequence MenuBuilder.getHeaderTitle()>
	//   49  100:invokevirtual   #182 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setTitle(CharSequence)>
	//   50  103:pop             
		builder.setOnKeyListener(((android.content.DialogInterface.OnKeyListener) (this)));
	//   51  104:aload_3         
	//   52  105:aload_0         
	//   53  106:invokevirtual   #186 <Method android.support.v7.app.AlertDialog$Builder android.support.v7.app.AlertDialog$Builder.setOnKeyListener(android.content.DialogInterface$OnKeyListener)>
	//   54  109:pop             
		mDialog = builder.create();
	//   55  110:aload_0         
	//   56  111:aload_3         
	//   57  112:invokevirtual   #190 <Method AlertDialog android.support.v7.app.AlertDialog$Builder.create()>
	//   58  115:putfield        #31  <Field AlertDialog mDialog>
		mDialog.setOnDismissListener(((android.content.DialogInterface.OnDismissListener) (this)));
	//   59  118:aload_0         
	//   60  119:getfield        #31  <Field AlertDialog mDialog>
	//   61  122:aload_0         
	//   62  123:invokevirtual   #194 <Method void AlertDialog.setOnDismissListener(android.content.DialogInterface$OnDismissListener)>
		obj = ((Object) (mDialog.getWindow().getAttributes()));
	//   63  126:aload_0         
	//   64  127:getfield        #31  <Field AlertDialog mDialog>
	//   65  130:invokevirtual   #84  <Method Window AlertDialog.getWindow()>
	//   66  133:invokevirtual   #198 <Method android.view.WindowManager$LayoutParams Window.getAttributes()>
	//   67  136:astore_2        
		obj.type = 1003;
	//   68  137:aload_2         
	//   69  138:sipush          1003
	//   70  141:putfield        #203 <Field int android.view.WindowManager$LayoutParams.type>
		if(ibinder != null)
	//*  71  144:aload_1         
	//*  72  145:ifnull          153
			obj.token = ibinder;
	//   73  148:aload_2         
	//   74  149:aload_1         
	//   75  150:putfield        #207 <Field IBinder android.view.WindowManager$LayoutParams.token>
		obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
	//   76  153:aload_2         
	//   77  154:aload_2         
	//   78  155:getfield        #210 <Field int android.view.WindowManager$LayoutParams.flags>
	//   79  158:ldc1            #211 <Int 0x20000>
	//   80  160:ior             
	//   81  161:putfield        #210 <Field int android.view.WindowManager$LayoutParams.flags>
		mDialog.show();
	//   82  164:aload_0         
	//   83  165:getfield        #31  <Field AlertDialog mDialog>
	//   84  168:invokevirtual   #213 <Method void AlertDialog.show()>
	//   85  171:return          
	}

	private AlertDialog mDialog;
	private MenuBuilder mMenu;
	ListMenuPresenter mPresenter;
	private MenuPresenter.Callback mPresenterCallback;
}
