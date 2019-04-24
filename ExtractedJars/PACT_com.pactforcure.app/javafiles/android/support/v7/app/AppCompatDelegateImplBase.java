// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.view.*;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.widget.TintTypedArray;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatDelegate, ActionBar, AppCompatCallback

abstract class AppCompatDelegateImplBase extends AppCompatDelegate
{
	private class ActionBarDrawableToggleImpl
		implements ActionBarDrawerToggle.Delegate
	{

		public Context getActionBarThemedContext()
		{
			return AppCompatDelegateImplBase.this.getActionBarThemedContext();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImplBase this$0>
		//    2    4:invokevirtual   #23  <Method Context AppCompatDelegateImplBase.getActionBarThemedContext()>
		//    3    7:areturn         
		}

		public Drawable getThemeUpIndicator()
		{
			TintTypedArray tinttypedarray = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), ((android.util.AttributeSet) (null)), new int[] {
				android.support.v7.appcompat.R.attr.homeAsUpIndicator
			});
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Context getActionBarThemedContext()>
		//    2    4:aconst_null     
		//    3    5:iconst_1        
		//    4    6:newarray        int[]
		//    5    8:dup             
		//    6    9:iconst_0        
		//    7   10:getstatic       #32  <Field int android.support.v7.appcompat.R$attr.homeAsUpIndicator>
		//    8   13:iastore         
		//    9   14:invokestatic    #38  <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[])>
		//   10   17:astore_1        
			Drawable drawable = tinttypedarray.getDrawable(0);
		//   11   18:aload_1         
		//   12   19:iconst_0        
		//   13   20:invokevirtual   #42  <Method Drawable TintTypedArray.getDrawable(int)>
		//   14   23:astore_2        
			tinttypedarray.recycle();
		//   15   24:aload_1         
		//   16   25:invokevirtual   #45  <Method void TintTypedArray.recycle()>
			return drawable;
		//   17   28:aload_2         
		//   18   29:areturn         
		}

		public boolean isNavigationVisible()
		{
			ActionBar actionbar = getSupportActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImplBase this$0>
		//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImplBase.getSupportActionBar()>
		//    3    7:astore_1        
			return actionbar != null && (actionbar.getDisplayOptions() & 4) != 0;
		//    4    8:aload_1         
		//    5    9:ifnull          23
		//    6   12:aload_1         
		//    7   13:invokevirtual   #57  <Method int ActionBar.getDisplayOptions()>
		//    8   16:iconst_4        
		//    9   17:iand            
		//   10   18:ifeq            23
		//   11   21:iconst_1        
		//   12   22:ireturn         
		//   13   23:iconst_0        
		//   14   24:ireturn         
		}

		public void setActionBarDescription(int i)
		{
			ActionBar actionbar = getSupportActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImplBase this$0>
		//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImplBase.getSupportActionBar()>
		//    3    7:astore_2        
			if(actionbar != null)
		//*   4    8:aload_2         
		//*   5    9:ifnull          17
				actionbar.setHomeActionContentDescription(i);
		//    6   12:aload_2         
		//    7   13:iload_1         
		//    8   14:invokevirtual   #62  <Method void ActionBar.setHomeActionContentDescription(int)>
		//    9   17:return          
		}

		public void setActionBarUpIndicator(Drawable drawable, int i)
		{
			ActionBar actionbar = getSupportActionBar();
		//    0    0:aload_0         
		//    1    1:getfield        #15  <Field AppCompatDelegateImplBase this$0>
		//    2    4:invokevirtual   #51  <Method ActionBar AppCompatDelegateImplBase.getSupportActionBar()>
		//    3    7:astore_3        
			if(actionbar != null)
		//*   4    8:aload_3         
		//*   5    9:ifnull          22
			{
				actionbar.setHomeAsUpIndicator(drawable);
		//    6   12:aload_3         
		//    7   13:aload_1         
		//    8   14:invokevirtual   #68  <Method void ActionBar.setHomeAsUpIndicator(Drawable)>
				actionbar.setHomeActionContentDescription(i);
		//    9   17:aload_3         
		//   10   18:iload_2         
		//   11   19:invokevirtual   #62  <Method void ActionBar.setHomeActionContentDescription(int)>
			}
		//   12   22:return          
		}

		final AppCompatDelegateImplBase this$0;

		ActionBarDrawableToggleImpl()
		{
			this$0 = AppCompatDelegateImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #15  <Field AppCompatDelegateImplBase this$0>
			super();
		//    3    5:aload_0         
		//    4    6:invokespecial   #18  <Method void Object()>
		//    5    9:return          
		}
	}

	class AppCompatWindowCallbackBase extends WindowCallbackWrapper
	{

		public boolean dispatchKeyEvent(KeyEvent keyevent)
		{
			return AppCompatDelegateImplBase.this.dispatchKeyEvent(keyevent) || super.dispatchKeyEvent(keyevent);
		//    0    0:aload_0         
		//    1    1:getfield        #13  <Field AppCompatDelegateImplBase this$0>
		//    2    4:aload_1         
		//    3    5:invokevirtual   #21  <Method boolean AppCompatDelegateImplBase.dispatchKeyEvent(KeyEvent)>
		//    4    8:ifne            19
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:invokespecial   #22  <Method boolean WindowCallbackWrapper.dispatchKeyEvent(KeyEvent)>
		//    8   16:ifeq            21
		//    9   19:iconst_1        
		//   10   20:ireturn         
		//   11   21:iconst_0        
		//   12   22:ireturn         
		}

		public boolean dispatchKeyShortcutEvent(KeyEvent keyevent)
		{
			return super.dispatchKeyShortcutEvent(keyevent) || onKeyShortcut(keyevent.getKeyCode(), keyevent);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #25  <Method boolean WindowCallbackWrapper.dispatchKeyShortcutEvent(KeyEvent)>
		//    3    5:ifne            23
		//    4    8:aload_0         
		//    5    9:getfield        #13  <Field AppCompatDelegateImplBase this$0>
		//    6   12:aload_1         
		//    7   13:invokevirtual   #31  <Method int KeyEvent.getKeyCode()>
		//    8   16:aload_1         
		//    9   17:invokevirtual   #35  <Method boolean AppCompatDelegateImplBase.onKeyShortcut(int, KeyEvent)>
		//   10   20:ifeq            25
		//   11   23:iconst_1        
		//   12   24:ireturn         
		//   13   25:iconst_0        
		//   14   26:ireturn         
		}

		public void onContentChanged()
		{
		//    0    0:return          
		}

		public boolean onCreatePanelMenu(int i, Menu menu)
		{
			if(i == 0 && !(menu instanceof MenuBuilder))
		//*   0    0:iload_1         
		//*   1    1:ifne            13
		//*   2    4:aload_2         
		//*   3    5:instanceof      #41  <Class MenuBuilder>
		//*   4    8:ifne            13
				return false;
		//    5   11:iconst_0        
		//    6   12:ireturn         
			else
				return super.onCreatePanelMenu(i, menu);
		//    7   13:aload_0         
		//    8   14:iload_1         
		//    9   15:aload_2         
		//   10   16:invokespecial   #43  <Method boolean WindowCallbackWrapper.onCreatePanelMenu(int, Menu)>
		//   11   19:ireturn         
		}

		public boolean onMenuOpened(int i, Menu menu)
		{
			super.onMenuOpened(i, menu);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #46  <Method boolean WindowCallbackWrapper.onMenuOpened(int, Menu)>
		//    4    6:pop             
			AppCompatDelegateImplBase.this.onMenuOpened(i, menu);
		//    5    7:aload_0         
		//    6    8:getfield        #13  <Field AppCompatDelegateImplBase this$0>
		//    7   11:iload_1         
		//    8   12:aload_2         
		//    9   13:invokevirtual   #47  <Method boolean AppCompatDelegateImplBase.onMenuOpened(int, Menu)>
		//   10   16:pop             
			return true;
		//   11   17:iconst_1        
		//   12   18:ireturn         
		}

		public void onPanelClosed(int i, Menu menu)
		{
			super.onPanelClosed(i, menu);
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #51  <Method void WindowCallbackWrapper.onPanelClosed(int, Menu)>
			AppCompatDelegateImplBase.this.onPanelClosed(i, menu);
		//    4    6:aload_0         
		//    5    7:getfield        #13  <Field AppCompatDelegateImplBase this$0>
		//    6   10:iload_1         
		//    7   11:aload_2         
		//    8   12:invokevirtual   #52  <Method void AppCompatDelegateImplBase.onPanelClosed(int, Menu)>
		//    9   15:return          
		}

		public boolean onPreparePanel(int i, View view, Menu menu)
		{
			boolean flag;
			MenuBuilder menubuilder;
			if(menu instanceof MenuBuilder)
		//*   0    0:aload_3         
		//*   1    1:instanceof      #41  <Class MenuBuilder>
		//*   2    4:ifeq            28
				menubuilder = (MenuBuilder)menu;
		//    3    7:aload_3         
		//    4    8:checkcast       #41  <Class MenuBuilder>
		//    5   11:astore          6
			else
		//*   6   13:iload_1         
		//*   7   14:ifne            34
		//*   8   17:aload           6
		//*   9   19:ifnonnull       34
		//*  10   22:iconst_0        
		//*  11   23:istore          4
		//*  12   25:iload           4
		//*  13   27:ireturn         
				menubuilder = null;
		//   14   28:aconst_null     
		//   15   29:astore          6
			if(i == 0 && menubuilder == null)
			{
				flag = false;
			} else
		//*  16   31:goto            13
			{
				if(menubuilder != null)
		//*  17   34:aload           6
		//*  18   36:ifnull          45
					menubuilder.setOverrideVisibleItems(true);
		//   19   39:aload           6
		//   20   41:iconst_1        
		//   21   42:invokevirtual   #58  <Method void MenuBuilder.setOverrideVisibleItems(boolean)>
				boolean flag1 = super.onPreparePanel(i, view, menu);
		//   22   45:aload_0         
		//   23   46:iload_1         
		//   24   47:aload_2         
		//   25   48:aload_3         
		//   26   49:invokespecial   #60  <Method boolean WindowCallbackWrapper.onPreparePanel(int, View, Menu)>
		//   27   52:istore          5
				flag = flag1;
		//   28   54:iload           5
		//   29   56:istore          4
				if(menubuilder != null)
		//*  30   58:aload           6
		//*  31   60:ifnull          25
				{
					menubuilder.setOverrideVisibleItems(false);
		//   32   63:aload           6
		//   33   65:iconst_0        
		//   34   66:invokevirtual   #58  <Method void MenuBuilder.setOverrideVisibleItems(boolean)>
					return flag1;
		//   35   69:iload           5
		//   36   71:ireturn         
				}
			}
			return flag;
		}

		final AppCompatDelegateImplBase this$0;

		AppCompatWindowCallbackBase(android.view.Window.Callback callback)
		{
			this$0 = AppCompatDelegateImplBase.this;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #13  <Field AppCompatDelegateImplBase this$0>
			super(callback);
		//    3    5:aload_0         
		//    4    6:aload_2         
		//    5    7:invokespecial   #16  <Method void WindowCallbackWrapper(android.view.Window$Callback)>
		//    6   10:return          
		}
	}


	AppCompatDelegateImplBase(Context context, Window window, AppCompatCallback appcompatcallback)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #81  <Method void AppCompatDelegate()>
		mContext = context;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #83  <Field Context mContext>
		mWindow = window;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #85  <Field Window mWindow>
		mAppCompatCallback = appcompatcallback;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #87  <Field AppCompatCallback mAppCompatCallback>
		mOriginalWindowCallback = mWindow.getCallback();
	//   11   19:aload_0         
	//   12   20:aload_0         
	//   13   21:getfield        #85  <Field Window mWindow>
	//   14   24:invokevirtual   #93  <Method android.view.Window$Callback Window.getCallback()>
	//   15   27:putfield        #95  <Field android.view.Window$Callback mOriginalWindowCallback>
		if(mOriginalWindowCallback instanceof AppCompatWindowCallbackBase)
	//*  16   30:aload_0         
	//*  17   31:getfield        #95  <Field android.view.Window$Callback mOriginalWindowCallback>
	//*  18   34:instanceof      #11  <Class AppCompatDelegateImplBase$AppCompatWindowCallbackBase>
	//*  19   37:ifeq            50
			throw new IllegalStateException("AppCompat has already installed itself into the Window");
	//   20   40:new             #97  <Class IllegalStateException>
	//   21   43:dup             
	//   22   44:ldc1            #99  <String "AppCompat has already installed itself into the Window">
	//   23   46:invokespecial   #102 <Method void IllegalStateException(String)>
	//   24   49:athrow          
		mAppCompatWindowCallback = wrapWindowCallback(mOriginalWindowCallback);
	//   25   50:aload_0         
	//   26   51:aload_0         
	//   27   52:aload_0         
	//   28   53:getfield        #95  <Field android.view.Window$Callback mOriginalWindowCallback>
	//   29   56:invokevirtual   #106 <Method android.view.Window$Callback wrapWindowCallback(android.view.Window$Callback)>
	//   30   59:putfield        #108 <Field android.view.Window$Callback mAppCompatWindowCallback>
		mWindow.setCallback(mAppCompatWindowCallback);
	//   31   62:aload_0         
	//   32   63:getfield        #85  <Field Window mWindow>
	//   33   66:aload_0         
	//   34   67:getfield        #108 <Field android.view.Window$Callback mAppCompatWindowCallback>
	//   35   70:invokevirtual   #112 <Method void Window.setCallback(android.view.Window$Callback)>
		context = ((Context) (TintTypedArray.obtainStyledAttributes(context, ((android.util.AttributeSet) (null)), sWindowBackgroundStyleable)));
	//   36   73:aload_1         
	//   37   74:aconst_null     
	//   38   75:getstatic       #77  <Field int[] sWindowBackgroundStyleable>
	//   39   78:invokestatic    #118 <Method TintTypedArray TintTypedArray.obtainStyledAttributes(Context, android.util.AttributeSet, int[])>
	//   40   81:astore_1        
		window = ((Window) (((TintTypedArray) (context)).getDrawableIfKnown(0)));
	//   41   82:aload_1         
	//   42   83:iconst_0        
	//   43   84:invokevirtual   #122 <Method Drawable TintTypedArray.getDrawableIfKnown(int)>
	//   44   87:astore_2        
		if(window != null)
	//*  45   88:aload_2         
	//*  46   89:ifnull          100
			mWindow.setBackgroundDrawable(((Drawable) (window)));
	//   47   92:aload_0         
	//   48   93:getfield        #85  <Field Window mWindow>
	//   49   96:aload_2         
	//   50   97:invokevirtual   #126 <Method void Window.setBackgroundDrawable(Drawable)>
		((TintTypedArray) (context)).recycle();
	//   51  100:aload_1         
	//   52  101:invokevirtual   #129 <Method void TintTypedArray.recycle()>
	//   53  104:return          
	}

	public boolean applyDayNight()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	abstract boolean dispatchKeyEvent(KeyEvent keyevent);

	final Context getActionBarThemedContext()
	{
		Context context = null;
	//    0    0:aconst_null     
	//    1    1:astore_1        
		Object obj = ((Object) (getSupportActionBar()));
	//    2    2:aload_0         
	//    3    3:invokevirtual   #139 <Method ActionBar getSupportActionBar()>
	//    4    6:astore_2        
		if(obj != null)
	//*   5    7:aload_2         
	//*   6    8:ifnull          16
			context = ((ActionBar) (obj)).getThemedContext();
	//    7   11:aload_2         
	//    8   12:invokevirtual   #144 <Method Context ActionBar.getThemedContext()>
	//    9   15:astore_1        
		obj = ((Object) (context));
	//   10   16:aload_1         
	//   11   17:astore_2        
		if(context == null)
	//*  12   18:aload_1         
	//*  13   19:ifnonnull       27
			obj = ((Object) (mContext));
	//   14   22:aload_0         
	//   15   23:getfield        #83  <Field Context mContext>
	//   16   26:astore_2        
		return ((Context) (obj));
	//   17   27:aload_2         
	//   18   28:areturn         
	}

	public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
	{
		return ((ActionBarDrawerToggle.Delegate) (new ActionBarDrawableToggleImpl()));
	//    0    0:new             #8   <Class AppCompatDelegateImplBase$ActionBarDrawableToggleImpl>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #149 <Method void AppCompatDelegateImplBase$ActionBarDrawableToggleImpl(AppCompatDelegateImplBase)>
	//    4    8:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		if(mMenuInflater == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #153 <Field MenuInflater mMenuInflater>
	//*   2    4:ifnonnull       38
		{
			initWindowDecorActionBar();
	//    3    7:aload_0         
	//    4    8:invokevirtual   #156 <Method void initWindowDecorActionBar()>
			Context context;
			if(mActionBar != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #158 <Field ActionBar mActionBar>
	//*   7   15:ifnull          43
				context = mActionBar.getThemedContext();
	//    8   18:aload_0         
	//    9   19:getfield        #158 <Field ActionBar mActionBar>
	//   10   22:invokevirtual   #144 <Method Context ActionBar.getThemedContext()>
	//   11   25:astore_1        
			else
	//*  12   26:aload_0         
	//*  13   27:new             #160 <Class SupportMenuInflater>
	//*  14   30:dup             
	//*  15   31:aload_1         
	//*  16   32:invokespecial   #163 <Method void SupportMenuInflater(Context)>
	//*  17   35:putfield        #153 <Field MenuInflater mMenuInflater>
	//*  18   38:aload_0         
	//*  19   39:getfield        #153 <Field MenuInflater mMenuInflater>
	//*  20   42:areturn         
				context = mContext;
	//   21   43:aload_0         
	//   22   44:getfield        #83  <Field Context mContext>
	//   23   47:astore_1        
			mMenuInflater = ((MenuInflater) (new SupportMenuInflater(context)));
		}
		return mMenuInflater;
	//*  24   48:goto            26
	}

	public ActionBar getSupportActionBar()
	{
		initWindowDecorActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #156 <Method void initWindowDecorActionBar()>
		return mActionBar;
	//    2    4:aload_0         
	//    3    5:getfield        #158 <Field ActionBar mActionBar>
	//    4    8:areturn         
	}

	final CharSequence getTitle()
	{
		if(mOriginalWindowCallback instanceof Activity)
	//*   0    0:aload_0         
	//*   1    1:getfield        #95  <Field android.view.Window$Callback mOriginalWindowCallback>
	//*   2    4:instanceof      #167 <Class Activity>
	//*   3    7:ifeq            21
			return ((Activity)mOriginalWindowCallback).getTitle();
	//    4   10:aload_0         
	//    5   11:getfield        #95  <Field android.view.Window$Callback mOriginalWindowCallback>
	//    6   14:checkcast       #167 <Class Activity>
	//    7   17:invokevirtual   #169 <Method CharSequence Activity.getTitle()>
	//    8   20:areturn         
		else
			return mTitle;
	//    9   21:aload_0         
	//   10   22:getfield        #171 <Field CharSequence mTitle>
	//   11   25:areturn         
	}

	final android.view.Window.Callback getWindowCallback()
	{
		return mWindow.getCallback();
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field Window mWindow>
	//    2    4:invokevirtual   #93  <Method android.view.Window$Callback Window.getCallback()>
	//    3    7:areturn         
	}

	abstract void initWindowDecorActionBar();

	final boolean isDestroyed()
	{
		return mIsDestroyed;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field boolean mIsDestroyed>
	//    2    4:ireturn         
	}

	public boolean isHandleNativeActionModesEnabled()
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	final boolean isStarted()
	{
		return mIsStarted;
	//    0    0:aload_0         
	//    1    1:getfield        #179 <Field boolean mIsStarted>
	//    2    4:ireturn         
	}

	public void onDestroy()
	{
		mIsDestroyed = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #175 <Field boolean mIsDestroyed>
	//    3    5:return          
	}

	abstract boolean onKeyShortcut(int i, KeyEvent keyevent);

	abstract boolean onMenuOpened(int i, Menu menu);

	abstract void onPanelClosed(int i, Menu menu);

	public void onSaveInstanceState(Bundle bundle)
	{
	//    0    0:return          
	}

	public void onStart()
	{
		mIsStarted = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #179 <Field boolean mIsStarted>
	//    3    5:return          
	}

	public void onStop()
	{
		mIsStarted = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #179 <Field boolean mIsStarted>
	//    3    5:return          
	}

	abstract void onTitleChanged(CharSequence charsequence);

	final ActionBar peekSupportActionBar()
	{
		return mActionBar;
	//    0    0:aload_0         
	//    1    1:getfield        #158 <Field ActionBar mActionBar>
	//    2    4:areturn         
	}

	public void setHandleNativeActionModesEnabled(boolean flag)
	{
	//    0    0:return          
	}

	public void setLocalNightMode(int i)
	{
	//    0    0:return          
	}

	public final void setTitle(CharSequence charsequence)
	{
		mTitle = charsequence;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #171 <Field CharSequence mTitle>
		onTitleChanged(charsequence);
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:invokevirtual   #200 <Method void onTitleChanged(CharSequence)>
	//    6   10:return          
	}

	abstract ActionMode startSupportActionModeFromWindow(android.support.v7.view.ActionMode.Callback callback);

	android.view.Window.Callback wrapWindowCallback(android.view.Window.Callback callback)
	{
		return ((android.view.Window.Callback) (new AppCompatWindowCallbackBase(callback)));
	//    0    0:new             #11  <Class AppCompatDelegateImplBase$AppCompatWindowCallbackBase>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokespecial   #205 <Method void AppCompatDelegateImplBase$AppCompatWindowCallbackBase(AppCompatDelegateImplBase, android.view.Window$Callback)>
	//    5    9:areturn         
	}

	static final boolean DEBUG = false;
	static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
	private static final boolean SHOULD_INSTALL_EXCEPTION_HANDLER;
	private static boolean sInstalledExceptionHandler;
	private static final int sWindowBackgroundStyleable[] = {
		0x1010054
	};
	ActionBar mActionBar;
	final AppCompatCallback mAppCompatCallback;
	final android.view.Window.Callback mAppCompatWindowCallback;
	final Context mContext;
	private boolean mEatKeyUpEvent;
	boolean mHasActionBar;
	private boolean mIsDestroyed;
	boolean mIsFloating;
	private boolean mIsStarted;
	MenuInflater mMenuInflater;
	final android.view.Window.Callback mOriginalWindowCallback;
	boolean mOverlayActionBar;
	boolean mOverlayActionMode;
	private CharSequence mTitle;
	final Window mWindow;
	boolean mWindowNoTitle;

	static 
	{
		boolean flag;
		if(android.os.Build.VERSION.SDK_INT < 21)
	//*   0    0:getstatic       #57  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmpge          55
			flag = true;
	//    3    8:iconst_1        
	//    4    9:istore_0        
		else
	//*   5   10:iload_0         
	//*   6   11:putstatic       #59  <Field boolean SHOULD_INSTALL_EXCEPTION_HANDLER>
	//*   7   14:getstatic       #59  <Field boolean SHOULD_INSTALL_EXCEPTION_HANDLER>
	//*   8   17:ifeq            43
	//*   9   20:getstatic       #61  <Field boolean sInstalledExceptionHandler>
	//*  10   23:ifne            43
	//*  11   26:new             #6   <Class AppCompatDelegateImplBase$1>
	//*  12   29:dup             
	//*  13   30:invokestatic    #67  <Method Thread$UncaughtExceptionHandler Thread.getDefaultUncaughtExceptionHandler()>
	//*  14   33:invokespecial   #71  <Method void AppCompatDelegateImplBase$1(Thread$UncaughtExceptionHandler)>
	//*  15   36:invokestatic    #74  <Method void Thread.setDefaultUncaughtExceptionHandler(Thread$UncaughtExceptionHandler)>
	//*  16   39:iconst_1        
	//*  17   40:putstatic       #61  <Field boolean sInstalledExceptionHandler>
	//*  18   43:iconst_1        
	//*  19   44:newarray        int[]
	//*  20   46:dup             
	//*  21   47:iconst_0        
	//*  22   48:ldc1            #75  <Int 0x1010054>
	//*  23   50:iastore         
	//*  24   51:putstatic       #77  <Field int[] sWindowBackgroundStyleable>
	//*  25   54:return          
			flag = false;
	//   26   55:iconst_0        
	//   27   56:istore_0        
		SHOULD_INSTALL_EXCEPTION_HANDLER = flag;
		if(SHOULD_INSTALL_EXCEPTION_HANDLER && !sInstalledExceptionHandler)
		{
			Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(Thread.getDefaultUncaughtExceptionHandler()) {

				private boolean shouldWrapException(Throwable throwable)
				{
					boolean flag1;
label0:
					{
						boolean flag2 = false;
				//    0    0:iconst_0        
				//    1    1:istore_3        
						flag1 = flag2;
				//    2    2:iload_3         
				//    3    3:istore_2        
						if(!(throwable instanceof android.content.res.Resources.NotFoundException))
							break label0;
				//    4    4:aload_1         
				//    5    5:instanceof      #22  <Class android.content.res.Resources$NotFoundException>
				//    6    8:ifeq            44
						throwable = ((Throwable) (throwable.getMessage()));
				//    7   11:aload_1         
				//    8   12:invokevirtual   #28  <Method String Throwable.getMessage()>
				//    9   15:astore_1        
						flag1 = flag2;
				//   10   16:iload_3         
				//   11   17:istore_2        
						if(throwable == null)
							break label0;
				//   12   18:aload_1         
				//   13   19:ifnull          44
						if(!((String) (throwable)).contains("drawable"))
				//*  14   22:aload_1         
				//*  15   23:ldc1            #30  <String "drawable">
				//*  16   25:invokevirtual   #36  <Method boolean String.contains(CharSequence)>
				//*  17   28:ifne            42
						{
							flag1 = flag2;
				//   18   31:iload_3         
				//   19   32:istore_2        
							if(!((String) (throwable)).contains("Drawable"))
								break label0;
				//   20   33:aload_1         
				//   21   34:ldc1            #38  <String "Drawable">
				//   22   36:invokevirtual   #36  <Method boolean String.contains(CharSequence)>
				//   23   39:ifeq            44
						}
						flag1 = true;
				//   24   42:iconst_1        
				//   25   43:istore_2        
					}
					return flag1;
				//   26   44:iload_2         
				//   27   45:ireturn         
				}

				public void uncaughtException(Thread thread, Throwable throwable)
				{
					if(shouldWrapException(throwable))
				//*   0    0:aload_0         
				//*   1    1:aload_2         
				//*   2    2:invokespecial   #42  <Method boolean shouldWrapException(Throwable)>
				//*   3    5:ifeq            67
					{
						android.content.res.Resources.NotFoundException notfoundexception = new android.content.res.Resources.NotFoundException((new StringBuilder()).append(throwable.getMessage()).append(". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.").toString());
				//    4    8:new             #22  <Class android.content.res.Resources$NotFoundException>
				//    5   11:dup             
				//    6   12:new             #44  <Class StringBuilder>
				//    7   15:dup             
				//    8   16:invokespecial   #45  <Method void StringBuilder()>
				//    9   19:aload_2         
				//   10   20:invokevirtual   #28  <Method String Throwable.getMessage()>
				//   11   23:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
				//   12   26:ldc1            #51  <String ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.">
				//   13   28:invokevirtual   #49  <Method StringBuilder StringBuilder.append(String)>
				//   14   31:invokevirtual   #54  <Method String StringBuilder.toString()>
				//   15   34:invokespecial   #57  <Method void android.content.res.Resources$NotFoundException(String)>
				//   16   37:astore_3        
						((Throwable) (notfoundexception)).initCause(throwable.getCause());
				//   17   38:aload_3         
				//   18   39:aload_2         
				//   19   40:invokevirtual   #61  <Method Throwable Throwable.getCause()>
				//   20   43:invokevirtual   #65  <Method Throwable Throwable.initCause(Throwable)>
				//   21   46:pop             
						((Throwable) (notfoundexception)).setStackTrace(throwable.getStackTrace());
				//   22   47:aload_3         
				//   23   48:aload_2         
				//   24   49:invokevirtual   #69  <Method StackTraceElement[] Throwable.getStackTrace()>
				//   25   52:invokevirtual   #73  <Method void Throwable.setStackTrace(StackTraceElement[])>
						defHandler.uncaughtException(thread, ((Throwable) (notfoundexception)));
				//   26   55:aload_0         
				//   27   56:getfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
				//   28   59:aload_1         
				//   29   60:aload_3         
				//   30   61:invokeinterface #75  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
						return;
				//   31   66:return          
					} else
					{
						defHandler.uncaughtException(thread, throwable);
				//   32   67:aload_0         
				//   33   68:getfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
				//   34   71:aload_1         
				//   35   72:aload_2         
				//   36   73:invokeinterface #75  <Method void Thread$UncaughtExceptionHandler.uncaughtException(Thread, Throwable)>
						return;
				//   37   78:return          
					}
				}

				final Thread.UncaughtExceptionHandler val$defHandler;

			
			{
				defHandler = uncaughtexceptionhandler;
			//    0    0:aload_0         
			//    1    1:aload_1         
			//    2    2:putfield        #14  <Field Thread$UncaughtExceptionHandler val$defHandler>
				super();
			//    3    5:aload_0         
			//    4    6:invokespecial   #17  <Method void Object()>
			//    5    9:return          
			}
			}
);
			sInstalledExceptionHandler = true;
		}
	//*  28   57:goto            10
	}
}
