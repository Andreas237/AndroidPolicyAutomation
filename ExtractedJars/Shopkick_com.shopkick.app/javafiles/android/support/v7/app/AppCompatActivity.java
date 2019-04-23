// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v7.view.ActionMode;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.VectorEnabledTintResources;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//			AppCompatCallback, AppCompatDelegate, ActionBar

public class AppCompatActivity extends FragmentActivity
	implements AppCompatCallback, android.support.v4.app.TaskStackBuilder.SupportParentable, ActionBarDrawerToggle.DelegateProvider
{

	public AppCompatActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void FragmentActivity()>
		mThemeId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #22  <Field int mThemeId>
	//    5    9:return          
	}

	private boolean performMenuItemShortcut(int i, KeyEvent keyevent)
	{
		if(android.os.Build.VERSION.SDK_INT < 26 && !keyevent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyevent.getMetaState()) && keyevent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyevent.getKeyCode()))
	//*   0    0:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          71
	//*   3    8:aload_2         
	//*   4    9:invokevirtual   #36  <Method boolean KeyEvent.isCtrlPressed()>
	//*   5   12:ifne            71
	//*   6   15:aload_2         
	//*   7   16:invokevirtual   #40  <Method int KeyEvent.getMetaState()>
	//*   8   19:invokestatic    #44  <Method boolean KeyEvent.metaStateHasNoModifiers(int)>
	//*   9   22:ifne            71
	//*  10   25:aload_2         
	//*  11   26:invokevirtual   #47  <Method int KeyEvent.getRepeatCount()>
	//*  12   29:ifne            71
	//*  13   32:aload_2         
	//*  14   33:invokevirtual   #50  <Method int KeyEvent.getKeyCode()>
	//*  15   36:invokestatic    #53  <Method boolean KeyEvent.isModifierKey(int)>
	//*  16   39:ifne            71
		{
			Window window = getWindow();
	//   17   42:aload_0         
	//   18   43:invokevirtual   #57  <Method Window getWindow()>
	//   19   46:astore_3        
			if(window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyevent))
	//*  20   47:aload_3         
	//*  21   48:ifnull          71
	//*  22   51:aload_3         
	//*  23   52:invokevirtual   #63  <Method View Window.getDecorView()>
	//*  24   55:ifnull          71
	//*  25   58:aload_3         
	//*  26   59:invokevirtual   #63  <Method View Window.getDecorView()>
	//*  27   62:aload_2         
	//*  28   63:invokevirtual   #69  <Method boolean View.dispatchKeyShortcutEvent(KeyEvent)>
	//*  29   66:ifeq            71
				return true;
	//   30   69:iconst_1        
	//   31   70:ireturn         
		}
		return false;
	//   32   71:iconst_0        
	//   33   72:ireturn         
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		getDelegate().addContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #79  <Method void AppCompatDelegate.addContentView(View, android.view.ViewGroup$LayoutParams)>
	//    5    9:return          
	}

	public void closeOptionsMenu()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(getWindow().hasFeature(0) && (actionbar == null || !actionbar.closeOptionsMenu()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #57  <Method Window getWindow()>
	//*   5    9:iconst_0        
	//*   6   10:invokevirtual   #87  <Method boolean Window.hasFeature(int)>
	//*   7   13:ifeq            31
	//*   8   16:aload_1         
	//*   9   17:ifnull          27
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #91  <Method boolean ActionBar.closeOptionsMenu()>
	//*  12   24:ifne            31
			super.closeOptionsMenu();
	//   13   27:aload_0         
	//   14   28:invokespecial   #93  <Method void FragmentActivity.closeOptionsMenu()>
	//   15   31:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		int i = keyevent.getKeyCode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #50  <Method int KeyEvent.getKeyCode()>
	//    2    4:istore_2        
		ActionBar actionbar = getSupportActionBar();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #84  <Method ActionBar getSupportActionBar()>
	//    5    9:astore_3        
		if(i == 82 && actionbar != null && actionbar.onMenuKeyEvent(keyevent))
	//*   6   10:iload_2         
	//*   7   11:bipush          82
	//*   8   13:icmpne          30
	//*   9   16:aload_3         
	//*  10   17:ifnull          30
	//*  11   20:aload_3         
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #97  <Method boolean ActionBar.onMenuKeyEvent(KeyEvent)>
	//*  14   25:ifeq            30
			return true;
	//   15   28:iconst_1        
	//   16   29:ireturn         
		else
			return super.dispatchKeyEvent(keyevent);
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:invokespecial   #99  <Method boolean FragmentActivity.dispatchKeyEvent(KeyEvent)>
	//   20   35:ireturn         
	}

	public View findViewById(int i)
	{
		return getDelegate().findViewById(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #104 <Method View AppCompatDelegate.findViewById(int)>
	//    4    8:areturn         
	}

	public AppCompatDelegate getDelegate()
	{
		if(mDelegate == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #110 <Field AppCompatDelegate mDelegate>
	//*   2    4:ifnonnull       16
			mDelegate = AppCompatDelegate.create(((android.app.Activity) (this)), ((AppCompatCallback) (this)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokestatic    #114 <Method AppCompatDelegate AppCompatDelegate.create(android.app.Activity, AppCompatCallback)>
	//    7   13:putfield        #110 <Field AppCompatDelegate mDelegate>
		return mDelegate;
	//    8   16:aload_0         
	//    9   17:getfield        #110 <Field AppCompatDelegate mDelegate>
	//   10   20:areturn         
	}

	public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
	{
		return getDelegate().getDrawerToggleDelegate();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #120 <Method ActionBarDrawerToggle$Delegate AppCompatDelegate.getDrawerToggleDelegate()>
	//    3    7:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return getDelegate().getMenuInflater();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #124 <Method MenuInflater AppCompatDelegate.getMenuInflater()>
	//    3    7:areturn         
	}

	public Resources getResources()
	{
		if(mResources == null && VectorEnabledTintResources.shouldBeUsed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #128 <Field Resources mResources>
	//*   2    4:ifnonnull       29
	//*   3    7:invokestatic    #133 <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//*   4   10:ifeq            29
			mResources = ((Resources) (new VectorEnabledTintResources(((android.content.Context) (this)), super.getResources())));
	//    5   13:aload_0         
	//    6   14:new             #130 <Class VectorEnabledTintResources>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:invokespecial   #135 <Method Resources FragmentActivity.getResources()>
	//   11   23:invokespecial   #138 <Method void VectorEnabledTintResources(android.content.Context, Resources)>
	//   12   26:putfield        #128 <Field Resources mResources>
		Resources resources1 = mResources;
	//   13   29:aload_0         
	//   14   30:getfield        #128 <Field Resources mResources>
	//   15   33:astore_2        
		Resources resources = resources1;
	//   16   34:aload_2         
	//   17   35:astore_1        
		if(resources1 == null)
	//*  18   36:aload_2         
	//*  19   37:ifnonnull       45
			resources = super.getResources();
	//   20   40:aload_0         
	//   21   41:invokespecial   #135 <Method Resources FragmentActivity.getResources()>
	//   22   44:astore_1        
		return resources;
	//   23   45:aload_1         
	//   24   46:areturn         
	}

	public ActionBar getSupportActionBar()
	{
		return getDelegate().getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #139 <Method ActionBar AppCompatDelegate.getSupportActionBar()>
	//    3    7:areturn         
	}

	public Intent getSupportParentActivityIntent()
	{
		return NavUtils.getParentActivityIntent(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #147 <Method Intent NavUtils.getParentActivityIntent(android.app.Activity)>
	//    2    4:areturn         
	}

	public void invalidateOptionsMenu()
	{
		getDelegate().invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #150 <Method void AppCompatDelegate.invalidateOptionsMenu()>
	//    3    7:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #154 <Method void FragmentActivity.onConfigurationChanged(Configuration)>
		getDelegate().onConfigurationChanged(configuration);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #155 <Method void AppCompatDelegate.onConfigurationChanged(Configuration)>
		if(mResources != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #128 <Field Resources mResources>
	//*   9   17:ifnull          37
		{
			android.util.DisplayMetrics displaymetrics = super.getResources().getDisplayMetrics();
	//   10   20:aload_0         
	//   11   21:invokespecial   #135 <Method Resources FragmentActivity.getResources()>
	//   12   24:invokevirtual   #161 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   13   27:astore_2        
			mResources.updateConfiguration(configuration, displaymetrics);
	//   14   28:aload_0         
	//   15   29:getfield        #128 <Field Resources mResources>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #165 <Method void Resources.updateConfiguration(Configuration, android.util.DisplayMetrics)>
		}
	//   19   37:return          
	}

	public void onContentChanged()
	{
		onSupportContentChanged();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #169 <Method void onSupportContentChanged()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		AppCompatDelegate appcompatdelegate = getDelegate();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:astore_2        
		appcompatdelegate.installViewFactory();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #174 <Method void AppCompatDelegate.installViewFactory()>
		appcompatdelegate.onCreate(bundle);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #176 <Method void AppCompatDelegate.onCreate(Bundle)>
		if(appcompatdelegate.applyDayNight() && mThemeId != 0)
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #179 <Method boolean AppCompatDelegate.applyDayNight()>
	//*  10   18:ifeq            60
	//*  11   21:aload_0         
	//*  12   22:getfield        #22  <Field int mThemeId>
	//*  13   25:ifeq            60
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  14   28:getstatic       #30  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   31:bipush          23
	//*  16   33:icmplt          52
				onApplyThemeResource(getTheme(), mThemeId, false);
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:invokevirtual   #183 <Method android.content.res.Resources$Theme getTheme()>
	//   20   41:aload_0         
	//   21   42:getfield        #22  <Field int mThemeId>
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #187 <Method void onApplyThemeResource(android.content.res.Resources$Theme, int, boolean)>
			else
	//*  24   49:goto            60
				setTheme(mThemeId);
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:getfield        #22  <Field int mThemeId>
	//   28   57:invokevirtual   #191 <Method void setTheme(int)>
		super.onCreate(bundle);
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:invokespecial   #192 <Method void FragmentActivity.onCreate(Bundle)>
	//   32   65:return          
	}

	public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
	{
		taskstackbuilder.addParentStack(((android.app.Activity) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #200 <Method TaskStackBuilder TaskStackBuilder.addParentStack(android.app.Activity)>
	//    3    5:pop             
	//    4    6:return          
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #203 <Method void FragmentActivity.onDestroy()>
		getDelegate().onDestroy();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #204 <Method void AppCompatDelegate.onDestroy()>
	//    5   11:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(performMenuItemShortcut(i, keyevent))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #207 <Method boolean performMenuItemShortcut(int, KeyEvent)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		else
			return super.onKeyDown(i, keyevent);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:aload_2         
	//   10   14:invokespecial   #209 <Method boolean FragmentActivity.onKeyDown(int, KeyEvent)>
	//   11   17:ireturn         
	}

	public final boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		if(super.onMenuItemSelected(i, menuitem))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #213 <Method boolean FragmentActivity.onMenuItemSelected(int, MenuItem)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		ActionBar actionbar = getSupportActionBar();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #84  <Method ActionBar getSupportActionBar()>
	//    9   15:astore_3        
		if(menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.getDisplayOptions() & 4) != 0)
	//*  10   16:aload_2         
	//*  11   17:invokeinterface #218 <Method int MenuItem.getItemId()>
	//*  12   22:ldc1            #219 <Int 0x102002c>
	//*  13   24:icmpne          45
	//*  14   27:aload_3         
	//*  15   28:ifnull          45
	//*  16   31:aload_3         
	//*  17   32:invokevirtual   #222 <Method int ActionBar.getDisplayOptions()>
	//*  18   35:iconst_4        
	//*  19   36:iand            
	//*  20   37:ifeq            45
			return onSupportNavigateUp();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #225 <Method boolean onSupportNavigateUp()>
	//   23   44:ireturn         
		else
			return false;
	//   24   45:iconst_0        
	//   25   46:ireturn         
	}

	public boolean onMenuOpened(int i, Menu menu)
	{
		return super.onMenuOpened(i, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #229 <Method boolean FragmentActivity.onMenuOpened(int, Menu)>
	//    4    6:ireturn         
	}

	public void onPanelClosed(int i, Menu menu)
	{
		super.onPanelClosed(i, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #233 <Method void FragmentActivity.onPanelClosed(int, Menu)>
	//    4    6:return          
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #236 <Method void FragmentActivity.onPostCreate(Bundle)>
		getDelegate().onPostCreate(bundle);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #237 <Method void AppCompatDelegate.onPostCreate(Bundle)>
	//    7   13:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #240 <Method void FragmentActivity.onPostResume()>
		getDelegate().onPostResume();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #241 <Method void AppCompatDelegate.onPostResume()>
	//    5   11:return          
	}

	public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
	{
	//    0    0:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #245 <Method void FragmentActivity.onSaveInstanceState(Bundle)>
		getDelegate().onSaveInstanceState(bundle);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #246 <Method void AppCompatDelegate.onSaveInstanceState(Bundle)>
	//    7   13:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #249 <Method void FragmentActivity.onStart()>
		getDelegate().onStart();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #250 <Method void AppCompatDelegate.onStart()>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #253 <Method void FragmentActivity.onStop()>
		getDelegate().onStop();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #254 <Method void AppCompatDelegate.onStop()>
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

	public void onSupportContentChanged()
	{
	//    0    0:return          
	}

	public boolean onSupportNavigateUp()
	{
		IllegalStateException illegalstateexception;
		Object obj = ((Object) (getSupportParentActivityIntent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #264 <Method Intent getSupportParentActivityIntent()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          57
		{
			if(supportShouldUpRecreateTask(((Intent) (obj))))
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #268 <Method boolean supportShouldUpRecreateTask(Intent)>
	//*   8   14:ifeq            50
			{
				obj = ((Object) (TaskStackBuilder.create(((android.content.Context) (this)))));
	//    9   17:aload_0         
	//   10   18:invokestatic    #271 <Method TaskStackBuilder TaskStackBuilder.create(android.content.Context)>
	//   11   21:astore_1        
				onCreateSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #273 <Method void onCreateSupportNavigateUpTaskStack(TaskStackBuilder)>
				onPrepareSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #275 <Method void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder)>
				((TaskStackBuilder) (obj)).startActivities();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #278 <Method void TaskStackBuilder.startActivities()>
				try
				{
					ActivityCompat.finishAffinity(((android.app.Activity) (this)));
	//   20   36:aload_0         
	//   21   37:invokestatic    #284 <Method void ActivityCompat.finishAffinity(android.app.Activity)>
				}
	//*  22   40:goto            55
	//*  23   43:aload_0         
	//*  24   44:invokevirtual   #287 <Method void finish()>
	//*  25   47:goto            55
	//*  26   50:aload_0         
	//*  27   51:aload_1         
	//*  28   52:invokevirtual   #291 <Method void supportNavigateUpTo(Intent)>
	//*  29   55:iconst_1        
	//*  30   56:ireturn         
	//*  31   57:iconst_0        
	//*  32   58:ireturn         
				// Misplaced declaration of an exception variable
				catch(IllegalStateException illegalstateexception)
				{
					finish();
				}
			} else
			{
				supportNavigateUpTo(((Intent) (obj)));
			}
			return true;
		} else
		{
			return false;
		}
	//*  33   59:astore_1        
	//*  34   60:goto            43
	}

	protected void onTitleChanged(CharSequence charsequence, int i)
	{
		super.onTitleChanged(charsequence, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #295 <Method void FragmentActivity.onTitleChanged(CharSequence, int)>
		getDelegate().setTitle(charsequence);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #299 <Method void AppCompatDelegate.setTitle(CharSequence)>
	//    8   14:return          
	}

	public ActionMode onWindowStartingSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void openOptionsMenu()
	{
		ActionBar actionbar = getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #84  <Method ActionBar getSupportActionBar()>
	//    2    4:astore_1        
		if(getWindow().hasFeature(0) && (actionbar == null || !actionbar.openOptionsMenu()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #57  <Method Window getWindow()>
	//*   5    9:iconst_0        
	//*   6   10:invokevirtual   #87  <Method boolean Window.hasFeature(int)>
	//*   7   13:ifeq            31
	//*   8   16:aload_1         
	//*   9   17:ifnull          27
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #304 <Method boolean ActionBar.openOptionsMenu()>
	//*  12   24:ifne            31
			super.openOptionsMenu();
	//   13   27:aload_0         
	//   14   28:invokespecial   #306 <Method void FragmentActivity.openOptionsMenu()>
	//   15   31:return          
	}

	public void setContentView(int i)
	{
		getDelegate().setContentView(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #310 <Method void AppCompatDelegate.setContentView(int)>
	//    4    8:return          
	}

	public void setContentView(View view)
	{
		getDelegate().setContentView(view);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #313 <Method void AppCompatDelegate.setContentView(View)>
	//    4    8:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		getDelegate().setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #315 <Method void AppCompatDelegate.setContentView(View, android.view.ViewGroup$LayoutParams)>
	//    5    9:return          
	}

	public void setSupportActionBar(Toolbar toolbar)
	{
		getDelegate().setSupportActionBar(toolbar);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #319 <Method void AppCompatDelegate.setSupportActionBar(Toolbar)>
	//    4    8:return          
	}

	public void setSupportProgress(int i)
	{
	//    0    0:return          
	}

	public void setSupportProgressBarIndeterminate(boolean flag)
	{
	//    0    0:return          
	}

	public void setSupportProgressBarIndeterminateVisibility(boolean flag)
	{
	//    0    0:return          
	}

	public void setSupportProgressBarVisibility(boolean flag)
	{
	//    0    0:return          
	}

	public void setTheme(int i)
	{
		super.setTheme(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #326 <Method void FragmentActivity.setTheme(int)>
		mThemeId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #22  <Field int mThemeId>
	//    6   10:return          
	}

	public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		return getDelegate().startSupportActionMode(callback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #329 <Method ActionMode AppCompatDelegate.startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//    4    8:areturn         
	}

	public void supportInvalidateOptionsMenu()
	{
		getDelegate().invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #150 <Method void AppCompatDelegate.invalidateOptionsMenu()>
	//    3    7:return          
	}

	public void supportNavigateUpTo(Intent intent)
	{
		NavUtils.navigateUpTo(((android.app.Activity) (this)), intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #334 <Method void NavUtils.navigateUpTo(android.app.Activity, Intent)>
	//    3    5:return          
	}

	public boolean supportRequestWindowFeature(int i)
	{
		return getDelegate().requestWindowFeature(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #75  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #338 <Method boolean AppCompatDelegate.requestWindowFeature(int)>
	//    4    8:ireturn         
	}

	public boolean supportShouldUpRecreateTask(Intent intent)
	{
		return NavUtils.shouldUpRecreateTask(((android.app.Activity) (this)), intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #342 <Method boolean NavUtils.shouldUpRecreateTask(android.app.Activity, Intent)>
	//    3    5:ireturn         
	}

	private AppCompatDelegate mDelegate;
	private Resources mResources;
	private int mThemeId;
}
