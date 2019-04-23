// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.m;
import android.support.v4.view.n;
import android.support.v7.view.ActionMode;
import android.util.TypedValue;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatCallback, AppCompatDelegate, ActionBar

public class AppCompatDialog extends Dialog
	implements AppCompatCallback
{

	public AppCompatDialog(Context context)
	{
		this(context, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #15  <Method void AppCompatDialog(Context, int)>
	//    4    6:return          
	}

	public AppCompatDialog(Context context, int i)
	{
		super(context, getThemeResId(context, i));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:iload_2         
	//    4    4:invokestatic    #20  <Method int getThemeResId(Context, int)>
	//    5    7:invokespecial   #21  <Method void Dialog(Context, int)>
		mKeyDispatcher = ((n) (new _cls1()));
	//    6   10:aload_0         
	//    7   11:new             #23  <Class AppCompatDialog$1>
	//    8   14:dup             
	//    9   15:aload_0         
	//   10   16:invokespecial   #26  <Method void AppCompatDialog$1(AppCompatDialog)>
	//   11   19:putfield        #28  <Field n mKeyDispatcher>
		getDelegate().onCreate(((Bundle) (null)));
	//   12   22:aload_0         
	//   13   23:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//   14   26:aconst_null     
	//   15   27:invokevirtual   #38  <Method void AppCompatDelegate.onCreate(Bundle)>
		getDelegate().applyDayNight();
	//   16   30:aload_0         
	//   17   31:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//   18   34:invokevirtual   #42  <Method boolean AppCompatDelegate.applyDayNight()>
	//   19   37:pop             
	//   20   38:return          
	}

	protected AppCompatDialog(Context context, boolean flag, android.content.DialogInterface.OnCancelListener oncancellistener)
	{
		super(context, flag, oncancellistener);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aload_3         
	//    4    4:invokespecial   #45  <Method void Dialog(Context, boolean, android.content.DialogInterface$OnCancelListener)>
		mKeyDispatcher = ((n) (new _cls1()));
	//    5    7:aload_0         
	//    6    8:new             #23  <Class AppCompatDialog$1>
	//    7   11:dup             
	//    8   12:aload_0         
	//    9   13:invokespecial   #26  <Method void AppCompatDialog$1(AppCompatDialog)>
	//   10   16:putfield        #28  <Field n mKeyDispatcher>
	//   11   19:return          
	}

	private static int getThemeResId(Context context, int i)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_2        
		if(i == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            32
		{
			TypedValue typedvalue = new TypedValue();
	//    4    6:new             #47  <Class TypedValue>
	//    5    9:dup             
	//    6   10:invokespecial   #50  <Method void TypedValue()>
	//    7   13:astore_3        
			context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.dialogTheme, typedvalue, true);
	//    8   14:aload_0         
	//    9   15:invokevirtual   #56  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   10   18:getstatic       #62  <Field int android.support.v7.appcompat.R$attr.dialogTheme>
	//   11   21:aload_3         
	//   12   22:iconst_1        
	//   13   23:invokevirtual   #68  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   14   26:pop             
			j = typedvalue.resourceId;
	//   15   27:aload_3         
	//   16   28:getfield        #71  <Field int TypedValue.resourceId>
	//   17   31:istore_2        
		}
		return j;
	//   18   32:iload_2         
	//   19   33:ireturn         
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		getDelegate().addContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #75  <Method void AppCompatDelegate.addContentView(View, android.view.ViewGroup$LayoutParams)>
	//    5    9:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		View view = getWindow().getDecorView();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #81  <Method Window getWindow()>
	//    2    4:invokevirtual   #87  <Method View Window.getDecorView()>
	//    3    7:astore_2        
		return m.a(mKeyDispatcher, view, ((android.view.Window.Callback) (this)), keyevent);
	//    4    8:aload_0         
	//    5    9:getfield        #28  <Field n mKeyDispatcher>
	//    6   12:aload_2         
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:invokestatic    #93  <Method boolean m.a(n, View, android.view.Window$Callback, KeyEvent)>
	//   10   18:ireturn         
	}

	public View findViewById(int i)
	{
		return getDelegate().findViewById(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #97  <Method View AppCompatDelegate.findViewById(int)>
	//    4    8:areturn         
	}

	public AppCompatDelegate getDelegate()
	{
		if(mDelegate == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #99  <Field AppCompatDelegate mDelegate>
	//*   2    4:ifnonnull       16
			mDelegate = AppCompatDelegate.create(((Dialog) (this)), ((AppCompatCallback) (this)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokestatic    #103 <Method AppCompatDelegate AppCompatDelegate.create(Dialog, AppCompatCallback)>
	//    7   13:putfield        #99  <Field AppCompatDelegate mDelegate>
		return mDelegate;
	//    8   16:aload_0         
	//    9   17:getfield        #99  <Field AppCompatDelegate mDelegate>
	//   10   20:areturn         
	}

	public ActionBar getSupportActionBar()
	{
		return getDelegate().getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #107 <Method ActionBar AppCompatDelegate.getSupportActionBar()>
	//    3    7:areturn         
	}

	public void invalidateOptionsMenu()
	{
		getDelegate().invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #110 <Method void AppCompatDelegate.invalidateOptionsMenu()>
	//    3    7:return          
	}

	protected void onCreate(Bundle bundle)
	{
		getDelegate().installViewFactory();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #113 <Method void AppCompatDelegate.installViewFactory()>
		super.onCreate(bundle);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:invokespecial   #114 <Method void Dialog.onCreate(Bundle)>
		getDelegate().onCreate(bundle);
	//    6   12:aload_0         
	//    7   13:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    8   16:aload_1         
	//    9   17:invokevirtual   #38  <Method void AppCompatDelegate.onCreate(Bundle)>
	//   10   20:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #117 <Method void Dialog.onStop()>
		getDelegate().onStop();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #118 <Method void AppCompatDelegate.onStop()>
	//    5   11:return          
	}

	public void onSupportActionModeFinished(ActionMode actionmode)
	{
	//    0    0:return          
	}

	public void onSupportActionModeStarted(ActionMode actionmode)
	{
	//    0    0:return          
	}

	public ActionMode onWindowStartingSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void setContentView(int i)
	{
		getDelegate().setContentView(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #127 <Method void AppCompatDelegate.setContentView(int)>
	//    4    8:return          
	}

	public void setContentView(View view)
	{
		getDelegate().setContentView(view);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #130 <Method void AppCompatDelegate.setContentView(View)>
	//    4    8:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		getDelegate().setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #132 <Method void AppCompatDelegate.setContentView(View, android.view.ViewGroup$LayoutParams)>
	//    5    9:return          
	}

	public void setTitle(int i)
	{
		super.setTitle(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #135 <Method void Dialog.setTitle(int)>
		getDelegate().setTitle(((CharSequence) (getContext().getString(i))));
	//    3    5:aload_0         
	//    4    6:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    5    9:aload_0         
	//    6   10:invokevirtual   #139 <Method Context getContext()>
	//    7   13:iload_1         
	//    8   14:invokevirtual   #143 <Method String Context.getString(int)>
	//    9   17:invokevirtual   #146 <Method void AppCompatDelegate.setTitle(CharSequence)>
	//   10   20:return          
	}

	public void setTitle(CharSequence charsequence)
	{
		super.setTitle(charsequence);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #147 <Method void Dialog.setTitle(CharSequence)>
		getDelegate().setTitle(charsequence);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #146 <Method void AppCompatDelegate.setTitle(CharSequence)>
	//    7   13:return          
	}

	boolean superDispatchKeyEvent(KeyEvent keyevent)
	{
		return super.dispatchKeyEvent(keyevent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #150 <Method boolean Dialog.dispatchKeyEvent(KeyEvent)>
	//    3    5:ireturn         
	}

	public boolean supportRequestWindowFeature(int i)
	{
		return getDelegate().requestWindowFeature(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #32  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #155 <Method boolean AppCompatDelegate.requestWindowFeature(int)>
	//    4    8:ireturn         
	}

	private AppCompatDelegate mDelegate;
	private final n mKeyDispatcher;

	private class _cls1
		implements n
	{

		public boolean superDispatchKeyEvent(KeyEvent keyevent)
		{
			return AppCompatDialog.this.superDispatchKeyEvent(keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #12  <Field AppCompatDialog this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #22  <Method boolean AppCompatDialog.superDispatchKeyEvent(KeyEvent)>
		//    4    8:ireturn         
		}

		final AppCompatDialog this$0;

		_cls1()
		{
			this$0 = AppCompatDialog.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #12  <Field AppCompatDialog this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #15  <Method void Object()>
		//    5    9:return          
		}
	}

}
