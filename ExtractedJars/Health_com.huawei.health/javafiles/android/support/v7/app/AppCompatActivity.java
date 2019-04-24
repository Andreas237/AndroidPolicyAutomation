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
	//    1    1:invokespecial   #22  <Method void FragmentActivity()>
		mThemeId = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field int mThemeId>
	//    5    9:return          
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		getDelegate().addContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #35  <Method void AppCompatDelegate.addContentView(View, android.view.ViewGroup$LayoutParams)>
	//    5    9:return          
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		if(keyevent.isCtrlPressed() && keyevent.getUnicodeChar(keyevent.getMetaState() & 0xffff8fff) == 60)
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #43  <Method boolean KeyEvent.isCtrlPressed()>
	//*   2    4:ifeq            85
	//*   3    7:aload_1         
	//*   4    8:aload_1         
	//*   5    9:invokevirtual   #47  <Method int KeyEvent.getMetaState()>
	//*   6   12:sipush          -28673
	//*   7   15:iand            
	//*   8   16:invokevirtual   #51  <Method int KeyEvent.getUnicodeChar(int)>
	//*   9   19:bipush          60
	//*  10   21:icmpne          85
		{
			int i = keyevent.getAction();
	//   11   24:aload_1         
	//   12   25:invokevirtual   #54  <Method int KeyEvent.getAction()>
	//   13   28:istore_2        
			if(i == 0)
	//*  14   29:iload_2         
	//*  15   30:ifne            66
			{
				ActionBar actionbar = getSupportActionBar();
	//   16   33:aload_0         
	//   17   34:invokevirtual   #58  <Method ActionBar getSupportActionBar()>
	//   18   37:astore_3        
				if(actionbar != null && actionbar.isShowing() && actionbar.requestFocus())
	//*  19   38:aload_3         
	//*  20   39:ifnull          63
	//*  21   42:aload_3         
	//*  22   43:invokevirtual   #63  <Method boolean ActionBar.isShowing()>
	//*  23   46:ifeq            63
	//*  24   49:aload_3         
	//*  25   50:invokevirtual   #66  <Method boolean ActionBar.requestFocus()>
	//*  26   53:ifeq            63
				{
					mEatKeyUpEvent = true;
	//   27   56:aload_0         
	//   28   57:iconst_1        
	//   29   58:putfield        #68  <Field boolean mEatKeyUpEvent>
					return true;
	//   30   61:iconst_1        
	//   31   62:ireturn         
				}
			} else
	//*  32   63:goto            85
			if(i == 1 && mEatKeyUpEvent)
	//*  33   66:iload_2         
	//*  34   67:iconst_1        
	//*  35   68:icmpne          85
	//*  36   71:aload_0         
	//*  37   72:getfield        #68  <Field boolean mEatKeyUpEvent>
	//*  38   75:ifeq            85
			{
				mEatKeyUpEvent = false;
	//   39   78:aload_0         
	//   40   79:iconst_0        
	//   41   80:putfield        #68  <Field boolean mEatKeyUpEvent>
				return true;
	//   42   83:iconst_1        
	//   43   84:ireturn         
			}
		}
		return super.dispatchKeyEvent(keyevent);
	//   44   85:aload_0         
	//   45   86:aload_1         
	//   46   87:invokespecial   #70  <Method boolean FragmentActivity.dispatchKeyEvent(KeyEvent)>
	//   47   90:ireturn         
	}

	public View findViewById(int i)
	{
		return getDelegate().findViewById(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #75  <Method View AppCompatDelegate.findViewById(int)>
	//    4    8:areturn         
	}

	public AppCompatDelegate getDelegate()
	{
		if(mDelegate == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #79  <Field AppCompatDelegate mDelegate>
	//*   2    4:ifnonnull       16
			mDelegate = AppCompatDelegate.create(((android.app.Activity) (this)), ((AppCompatCallback) (this)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokestatic    #83  <Method AppCompatDelegate AppCompatDelegate.create(android.app.Activity, AppCompatCallback)>
	//    7   13:putfield        #79  <Field AppCompatDelegate mDelegate>
		return mDelegate;
	//    8   16:aload_0         
	//    9   17:getfield        #79  <Field AppCompatDelegate mDelegate>
	//   10   20:areturn         
	}

	public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
	{
		return getDelegate().getDrawerToggleDelegate();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #89  <Method ActionBarDrawerToggle$Delegate AppCompatDelegate.getDrawerToggleDelegate()>
	//    3    7:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return getDelegate().getMenuInflater();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #93  <Method MenuInflater AppCompatDelegate.getMenuInflater()>
	//    3    7:areturn         
	}

	public Resources getResources()
	{
		if(mResources == null && VectorEnabledTintResources.shouldBeUsed())
	//*   0    0:aload_0         
	//*   1    1:getfield        #97  <Field Resources mResources>
	//*   2    4:ifnonnull       29
	//*   3    7:invokestatic    #102 <Method boolean VectorEnabledTintResources.shouldBeUsed()>
	//*   4   10:ifeq            29
			mResources = ((Resources) (new VectorEnabledTintResources(((android.content.Context) (this)), super.getResources())));
	//    5   13:aload_0         
	//    6   14:new             #99  <Class VectorEnabledTintResources>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:invokespecial   #104 <Method Resources FragmentActivity.getResources()>
	//   11   23:invokespecial   #107 <Method void VectorEnabledTintResources(android.content.Context, Resources)>
	//   12   26:putfield        #97  <Field Resources mResources>
		if(mResources == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #97  <Field Resources mResources>
	//*  15   33:ifnonnull       41
			return super.getResources();
	//   16   36:aload_0         
	//   17   37:invokespecial   #104 <Method Resources FragmentActivity.getResources()>
	//   18   40:areturn         
		else
			return mResources;
	//   19   41:aload_0         
	//   20   42:getfield        #97  <Field Resources mResources>
	//   21   45:areturn         
	}

	public ActionBar getSupportActionBar()
	{
		return getDelegate().getSupportActionBar();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #108 <Method ActionBar AppCompatDelegate.getSupportActionBar()>
	//    3    7:areturn         
	}

	public Intent getSupportParentActivityIntent()
	{
		return NavUtils.getParentActivityIntent(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #116 <Method Intent NavUtils.getParentActivityIntent(android.app.Activity)>
	//    2    4:areturn         
	}

	public void invalidateOptionsMenu()
	{
		getDelegate().invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #119 <Method void AppCompatDelegate.invalidateOptionsMenu()>
	//    3    7:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #123 <Method void FragmentActivity.onConfigurationChanged(Configuration)>
		getDelegate().onConfigurationChanged(configuration);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #124 <Method void AppCompatDelegate.onConfigurationChanged(Configuration)>
		if(mResources != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #97  <Field Resources mResources>
	//*   9   17:ifnull          37
		{
			android.util.DisplayMetrics displaymetrics = super.getResources().getDisplayMetrics();
	//   10   20:aload_0         
	//   11   21:invokespecial   #104 <Method Resources FragmentActivity.getResources()>
	//   12   24:invokevirtual   #130 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   13   27:astore_2        
			mResources.updateConfiguration(configuration, displaymetrics);
	//   14   28:aload_0         
	//   15   29:getfield        #97  <Field Resources mResources>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #134 <Method void Resources.updateConfiguration(Configuration, android.util.DisplayMetrics)>
		}
	//   19   37:return          
	}

	public void onContentChanged()
	{
		onSupportContentChanged();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method void onSupportContentChanged()>
	//    2    4:return          
	}

	public void onCreate(Bundle bundle)
	{
		AppCompatDelegate appcompatdelegate = getDelegate();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:astore_2        
		appcompatdelegate.installViewFactory();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #143 <Method void AppCompatDelegate.installViewFactory()>
		appcompatdelegate.onCreate(bundle);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #145 <Method void AppCompatDelegate.onCreate(Bundle)>
		if(appcompatdelegate.applyDayNight() && mThemeId != 0)
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #148 <Method boolean AppCompatDelegate.applyDayNight()>
	//*  10   18:ifeq            60
	//*  11   21:aload_0         
	//*  12   22:getfield        #24  <Field int mThemeId>
	//*  13   25:ifeq            60
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  14   28:getstatic       #153 <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   31:bipush          23
	//*  16   33:icmplt          52
				onApplyThemeResource(getTheme(), mThemeId, false);
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:invokevirtual   #157 <Method android.content.res.Resources$Theme getTheme()>
	//   20   41:aload_0         
	//   21   42:getfield        #24  <Field int mThemeId>
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #161 <Method void onApplyThemeResource(android.content.res.Resources$Theme, int, boolean)>
			else
	//*  24   49:goto            60
				setTheme(mThemeId);
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:getfield        #24  <Field int mThemeId>
	//   28   57:invokevirtual   #165 <Method void setTheme(int)>
		super.onCreate(bundle);
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:invokespecial   #166 <Method void FragmentActivity.onCreate(Bundle)>
	//   32   65:return          
	}

	public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
	{
		taskstackbuilder.addParentStack(((android.app.Activity) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #174 <Method TaskStackBuilder TaskStackBuilder.addParentStack(android.app.Activity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #177 <Method void FragmentActivity.onDestroy()>
		getDelegate().onDestroy();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #178 <Method void AppCompatDelegate.onDestroy()>
	//    5   11:return          
	}

	public final boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		if(super.onMenuItemSelected(i, menuitem))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #182 <Method boolean FragmentActivity.onMenuItemSelected(int, MenuItem)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		ActionBar actionbar = getSupportActionBar();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #58  <Method ActionBar getSupportActionBar()>
	//    9   15:astore_3        
		if(menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.getDisplayOptions() & 4) != 0)
	//*  10   16:aload_2         
	//*  11   17:invokeinterface #187 <Method int MenuItem.getItemId()>
	//*  12   22:ldc1            #188 <Int 0x102002c>
	//*  13   24:icmpne          45
	//*  14   27:aload_3         
	//*  15   28:ifnull          45
	//*  16   31:aload_3         
	//*  17   32:invokevirtual   #191 <Method int ActionBar.getDisplayOptions()>
	//*  18   35:iconst_4        
	//*  19   36:iand            
	//*  20   37:ifeq            45
			return onSupportNavigateUp();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #194 <Method boolean onSupportNavigateUp()>
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
	//    3    3:invokespecial   #198 <Method boolean FragmentActivity.onMenuOpened(int, Menu)>
	//    4    6:ireturn         
	}

	public void onPanelClosed(int i, Menu menu)
	{
		super.onPanelClosed(i, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #202 <Method void FragmentActivity.onPanelClosed(int, Menu)>
	//    4    6:return          
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #205 <Method void FragmentActivity.onPostCreate(Bundle)>
		getDelegate().onPostCreate(bundle);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #206 <Method void AppCompatDelegate.onPostCreate(Bundle)>
	//    7   13:return          
	}

	public void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #209 <Method void FragmentActivity.onPostResume()>
		getDelegate().onPostResume();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #210 <Method void AppCompatDelegate.onPostResume()>
	//    5   11:return          
	}

	public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder taskstackbuilder)
	{
	//    0    0:return          
	}

	public void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #214 <Method void FragmentActivity.onSaveInstanceState(Bundle)>
		getDelegate().onSaveInstanceState(bundle);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #215 <Method void AppCompatDelegate.onSaveInstanceState(Bundle)>
	//    7   13:return          
	}

	public void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #218 <Method void FragmentActivity.onStart()>
		getDelegate().onStart();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #219 <Method void AppCompatDelegate.onStart()>
	//    5   11:return          
	}

	public void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #222 <Method void FragmentActivity.onStop()>
		getDelegate().onStop();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    4    8:invokevirtual   #223 <Method void AppCompatDelegate.onStop()>
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
		Object obj = ((Object) (getSupportParentActivityIntent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #233 <Method Intent getSupportParentActivityIntent()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          58
		{
			if(supportShouldUpRecreateTask(((Intent) (obj))))
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #237 <Method boolean supportShouldUpRecreateTask(Intent)>
	//*   8   14:ifeq            51
			{
				obj = ((Object) (TaskStackBuilder.create(((android.content.Context) (this)))));
	//    9   17:aload_0         
	//   10   18:invokestatic    #240 <Method TaskStackBuilder TaskStackBuilder.create(android.content.Context)>
	//   11   21:astore_1        
				onCreateSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #242 <Method void onCreateSupportNavigateUpTaskStack(TaskStackBuilder)>
				onPrepareSupportNavigateUpTaskStack(((TaskStackBuilder) (obj)));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #244 <Method void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder)>
				((TaskStackBuilder) (obj)).startActivities();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #247 <Method void TaskStackBuilder.startActivities()>
				try
				{
					ActivityCompat.finishAffinity(((android.app.Activity) (this)));
	//   20   36:aload_0         
	//   21   37:invokestatic    #253 <Method void ActivityCompat.finishAffinity(android.app.Activity)>
				}
	//*  22   40:goto            48
				// Misplaced declaration of an exception variable
				catch(Object obj)
	//*  23   43:astore_1        
				{
					finish();
	//   24   44:aload_0         
	//   25   45:invokevirtual   #256 <Method void finish()>
				}
			} else
	//*  26   48:goto            56
			{
				supportNavigateUpTo(((Intent) (obj)));
	//   27   51:aload_0         
	//   28   52:aload_1         
	//   29   53:invokevirtual   #260 <Method void supportNavigateUpTo(Intent)>
			}
			return true;
	//   30   56:iconst_1        
	//   31   57:ireturn         
		} else
		{
			return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
		}
	}

	protected void onTitleChanged(CharSequence charsequence, int i)
	{
		super.onTitleChanged(charsequence, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #264 <Method void FragmentActivity.onTitleChanged(CharSequence, int)>
		getDelegate().setTitle(charsequence);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #268 <Method void AppCompatDelegate.setTitle(CharSequence)>
	//    8   14:return          
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
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #274 <Method void AppCompatDelegate.setContentView(int)>
	//    4    8:return          
	}

	public void setContentView(View view)
	{
		getDelegate().setContentView(view);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #277 <Method void AppCompatDelegate.setContentView(View)>
	//    4    8:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		getDelegate().setContentView(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #279 <Method void AppCompatDelegate.setContentView(View, android.view.ViewGroup$LayoutParams)>
	//    5    9:return          
	}

	public void setSupportActionBar(Toolbar toolbar)
	{
		getDelegate().setSupportActionBar(toolbar);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #283 <Method void AppCompatDelegate.setSupportActionBar(Toolbar)>
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
	//    2    2:invokespecial   #290 <Method void FragmentActivity.setTheme(int)>
		mThemeId = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #24  <Field int mThemeId>
	//    6   10:return          
	}

	public ActionMode startSupportActionMode(android.support.v7.view.ActionMode.Callback callback)
	{
		return getDelegate().startSupportActionMode(callback);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #293 <Method ActionMode AppCompatDelegate.startSupportActionMode(android.support.v7.view.ActionMode$Callback)>
	//    4    8:areturn         
	}

	public void supportInvalidateOptionsMenu()
	{
		getDelegate().invalidateOptionsMenu();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:invokevirtual   #119 <Method void AppCompatDelegate.invalidateOptionsMenu()>
	//    3    7:return          
	}

	public void supportNavigateUpTo(Intent intent)
	{
		NavUtils.navigateUpTo(((android.app.Activity) (this)), intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #298 <Method void NavUtils.navigateUpTo(android.app.Activity, Intent)>
	//    3    5:return          
	}

	public boolean supportRequestWindowFeature(int i)
	{
		return getDelegate().requestWindowFeature(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #31  <Method AppCompatDelegate getDelegate()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #303 <Method boolean AppCompatDelegate.requestWindowFeature(int)>
	//    4    8:ireturn         
	}

	public boolean supportShouldUpRecreateTask(Intent intent)
	{
		return NavUtils.shouldUpRecreateTask(((android.app.Activity) (this)), intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #307 <Method boolean NavUtils.shouldUpRecreateTask(android.app.Activity, Intent)>
	//    3    5:ireturn         
	}

	private AppCompatDelegate mDelegate;
	private boolean mEatKeyUpEvent;
	private Resources mResources;
	private int mThemeId;
}
