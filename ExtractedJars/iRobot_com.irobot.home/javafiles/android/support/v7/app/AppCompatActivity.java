// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.*;
import android.support.v7.view.b;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.ba;
import android.view.*;

// Referenced classes of package android.support.v7.app:
//			b, c, ActionBar

public class AppCompatActivity extends FragmentActivity
	implements android.support.v4.app.TaskStackBuilder.SupportParentable, android.support.v7.app.b
{

	public AppCompatActivity()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void FragmentActivity()>
		b = 0;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #20  <Field int b>
	//    5    9:return          
	}

	private boolean a(int i, KeyEvent keyevent)
	{
		if(android.os.Build.VERSION.SDK_INT < 26 && !keyevent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyevent.getMetaState()) && keyevent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyevent.getKeyCode()))
	//*   0    0:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          26
	//*   2    5:icmpge          71
	//*   3    8:aload_2         
	//*   4    9:invokevirtual   #33  <Method boolean KeyEvent.isCtrlPressed()>
	//*   5   12:ifne            71
	//*   6   15:aload_2         
	//*   7   16:invokevirtual   #37  <Method int KeyEvent.getMetaState()>
	//*   8   19:invokestatic    #41  <Method boolean KeyEvent.metaStateHasNoModifiers(int)>
	//*   9   22:ifne            71
	//*  10   25:aload_2         
	//*  11   26:invokevirtual   #44  <Method int KeyEvent.getRepeatCount()>
	//*  12   29:ifne            71
	//*  13   32:aload_2         
	//*  14   33:invokevirtual   #47  <Method int KeyEvent.getKeyCode()>
	//*  15   36:invokestatic    #50  <Method boolean KeyEvent.isModifierKey(int)>
	//*  16   39:ifne            71
		{
			Window window = getWindow();
	//   17   42:aload_0         
	//   18   43:invokevirtual   #54  <Method Window getWindow()>
	//   19   46:astore_3        
			if(window != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyevent))
	//*  20   47:aload_3         
	//*  21   48:ifnull          71
	//*  22   51:aload_3         
	//*  23   52:invokevirtual   #60  <Method View Window.getDecorView()>
	//*  24   55:ifnull          71
	//*  25   58:aload_3         
	//*  26   59:invokevirtual   #60  <Method View Window.getDecorView()>
	//*  27   62:aload_2         
	//*  28   63:invokevirtual   #66  <Method boolean View.dispatchKeyShortcutEvent(KeyEvent)>
	//*  29   66:ifeq            71
				return true;
	//   30   69:iconst_1        
	//   31   70:ireturn         
		}
		return false;
	//   32   71:iconst_0        
	//   33   72:ireturn         
	}

	public ActionBar a()
	{
		return d().a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:invokevirtual   #75  <Method ActionBar c.a()>
	//    3    7:areturn         
	}

	public b a(android.support.v7.view.b.a a1)
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
	}

	public void a(TaskStackBuilder taskstackbuilder)
	{
		taskstackbuilder.addParentStack(((android.app.Activity) (this)));
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #83  <Method TaskStackBuilder TaskStackBuilder.addParentStack(android.app.Activity)>
	//    3    5:pop             
	//    4    6:return          
	}

	public void a(b b1)
	{
	//    0    0:return          
	}

	public void a(Toolbar toolbar)
	{
		d().a(toolbar);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #87  <Method void c.a(Toolbar)>
	//    4    8:return          
	}

	public boolean a(Intent intent)
	{
		return NavUtils.shouldUpRecreateTask(((android.app.Activity) (this)), intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #94  <Method boolean NavUtils.shouldUpRecreateTask(android.app.Activity, Intent)>
	//    3    5:ireturn         
	}

	public void addContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		d().b(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #98  <Method void android.support.v7.app.c.b(View, android.view.ViewGroup$LayoutParams)>
	//    5    9:return          
	}

	public void b(Intent intent)
	{
		NavUtils.navigateUpTo(((android.app.Activity) (this)), intent);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokestatic    #103 <Method void NavUtils.navigateUpTo(android.app.Activity, Intent)>
	//    3    5:return          
	}

	public void b(TaskStackBuilder taskstackbuilder)
	{
	//    0    0:return          
	}

	public void b(b b1)
	{
	//    0    0:return          
	}

	public boolean b()
	{
		IllegalStateException illegalstateexception;
		Object obj = ((Object) (getSupportParentActivityIntent()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #109 <Method Intent getSupportParentActivityIntent()>
	//    2    4:astore_1        
		if(obj != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          57
		{
			if(a(((Intent) (obj))))
	//*   5    9:aload_0         
	//*   6   10:aload_1         
	//*   7   11:invokevirtual   #111 <Method boolean a(Intent)>
	//*   8   14:ifeq            50
			{
				obj = ((Object) (TaskStackBuilder.create(((android.content.Context) (this)))));
	//    9   17:aload_0         
	//   10   18:invokestatic    #115 <Method TaskStackBuilder TaskStackBuilder.create(android.content.Context)>
	//   11   21:astore_1        
				a(((TaskStackBuilder) (obj)));
	//   12   22:aload_0         
	//   13   23:aload_1         
	//   14   24:invokevirtual   #117 <Method void a(TaskStackBuilder)>
				b(((TaskStackBuilder) (obj)));
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:invokevirtual   #119 <Method void b(TaskStackBuilder)>
				((TaskStackBuilder) (obj)).startActivities();
	//   18   32:aload_1         
	//   19   33:invokevirtual   #122 <Method void TaskStackBuilder.startActivities()>
				try
				{
					ActivityCompat.finishAffinity(((android.app.Activity) (this)));
	//   20   36:aload_0         
	//   21   37:invokestatic    #128 <Method void ActivityCompat.finishAffinity(android.app.Activity)>
				}
	//*  22   40:goto            55
	//*  23   43:aload_0         
	//*  24   44:invokevirtual   #131 <Method void finish()>
	//*  25   47:goto            55
	//*  26   50:aload_0         
	//*  27   51:aload_1         
	//*  28   52:invokevirtual   #133 <Method void b(Intent)>
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
				b(((Intent) (obj)));
			}
			return true;
		} else
		{
			return false;
		}
	//*  33   59:astore_1        
	//*  34   60:goto            43
	}

	public void c_()
	{
	//    0    0:return          
	}

	public void closeOptionsMenu()
	{
		ActionBar actionbar = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method ActionBar a()>
	//    2    4:astore_1        
		if(getWindow().hasFeature(0) && (actionbar == null || !actionbar.d()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #54  <Method Window getWindow()>
	//*   5    9:iconst_0        
	//*   6   10:invokevirtual   #141 <Method boolean Window.hasFeature(int)>
	//*   7   13:ifeq            31
	//*   8   16:aload_1         
	//*   9   17:ifnull          27
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #145 <Method boolean ActionBar.d()>
	//*  12   24:ifne            31
			super.closeOptionsMenu();
	//   13   27:aload_0         
	//   14   28:invokespecial   #147 <Method void FragmentActivity.closeOptionsMenu()>
	//   15   31:return          
	}

	public c d()
	{
		if(a == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #149 <Field c a>
	//*   2    4:ifnonnull       16
			a = android.support.v7.app.c.a(((android.app.Activity) (this)), ((android.support.v7.app.b) (this)));
	//    3    7:aload_0         
	//    4    8:aload_0         
	//    5    9:aload_0         
	//    6   10:invokestatic    #152 <Method c c.a(android.app.Activity, android.support.v7.app.b)>
	//    7   13:putfield        #149 <Field c a>
		return a;
	//    8   16:aload_0         
	//    9   17:getfield        #149 <Field c a>
	//   10   20:areturn         
	}

	public boolean dispatchKeyEvent(KeyEvent keyevent)
	{
		int i = keyevent.getKeyCode();
	//    0    0:aload_1         
	//    1    1:invokevirtual   #47  <Method int KeyEvent.getKeyCode()>
	//    2    4:istore_2        
		ActionBar actionbar = a();
	//    3    5:aload_0         
	//    4    6:invokevirtual   #138 <Method ActionBar a()>
	//    5    9:astore_3        
		if(i == 82 && actionbar != null && actionbar.a(keyevent))
	//*   6   10:iload_2         
	//*   7   11:bipush          82
	//*   8   13:icmpne          30
	//*   9   16:aload_3         
	//*  10   17:ifnull          30
	//*  11   20:aload_3         
	//*  12   21:aload_1         
	//*  13   22:invokevirtual   #155 <Method boolean ActionBar.a(KeyEvent)>
	//*  14   25:ifeq            30
			return true;
	//   15   28:iconst_1        
	//   16   29:ireturn         
		else
			return super.dispatchKeyEvent(keyevent);
	//   17   30:aload_0         
	//   18   31:aload_1         
	//   19   32:invokespecial   #157 <Method boolean FragmentActivity.dispatchKeyEvent(KeyEvent)>
	//   20   35:ireturn         
	}

	public View findViewById(int i)
	{
		return d().a(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #161 <Method View c.a(int)>
	//    4    8:areturn         
	}

	public MenuInflater getMenuInflater()
	{
		return d().b();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:invokevirtual   #167 <Method MenuInflater android.support.v7.app.c.b()>
	//    3    7:areturn         
	}

	public Resources getResources()
	{
		if(c == null && ba.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #171 <Field Resources c>
	//*   2    4:ifnonnull       29
	//*   3    7:invokestatic    #175 <Method boolean ba.a()>
	//*   4   10:ifeq            29
			c = ((Resources) (new ba(((android.content.Context) (this)), super.getResources())));
	//    5   13:aload_0         
	//    6   14:new             #173 <Class ba>
	//    7   17:dup             
	//    8   18:aload_0         
	//    9   19:aload_0         
	//   10   20:invokespecial   #177 <Method Resources FragmentActivity.getResources()>
	//   11   23:invokespecial   #180 <Method void ba(android.content.Context, Resources)>
	//   12   26:putfield        #171 <Field Resources c>
		if(c == null)
	//*  13   29:aload_0         
	//*  14   30:getfield        #171 <Field Resources c>
	//*  15   33:ifnonnull       41
			return super.getResources();
	//   16   36:aload_0         
	//   17   37:invokespecial   #177 <Method Resources FragmentActivity.getResources()>
	//   18   40:areturn         
		else
			return c;
	//   19   41:aload_0         
	//   20   42:getfield        #171 <Field Resources c>
	//   21   45:areturn         
	}

	public Intent getSupportParentActivityIntent()
	{
		return NavUtils.getParentActivityIntent(((android.app.Activity) (this)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #184 <Method Intent NavUtils.getParentActivityIntent(android.app.Activity)>
	//    2    4:areturn         
	}

	public void invalidateOptionsMenu()
	{
		d().f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:invokevirtual   #188 <Method void c.f()>
	//    3    7:return          
	}

	public void onConfigurationChanged(Configuration configuration)
	{
		super.onConfigurationChanged(configuration);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #192 <Method void FragmentActivity.onConfigurationChanged(Configuration)>
		d().a(configuration);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #71  <Method c d()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #194 <Method void c.a(Configuration)>
		if(c != null)
	//*   7   13:aload_0         
	//*   8   14:getfield        #171 <Field Resources c>
	//*   9   17:ifnull          37
		{
			android.util.DisplayMetrics displaymetrics = super.getResources().getDisplayMetrics();
	//   10   20:aload_0         
	//   11   21:invokespecial   #177 <Method Resources FragmentActivity.getResources()>
	//   12   24:invokevirtual   #200 <Method android.util.DisplayMetrics Resources.getDisplayMetrics()>
	//   13   27:astore_2        
			c.updateConfiguration(configuration, displaymetrics);
	//   14   28:aload_0         
	//   15   29:getfield        #171 <Field Resources c>
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokevirtual   #204 <Method void Resources.updateConfiguration(Configuration, android.util.DisplayMetrics)>
		}
	//   19   37:return          
	}

	public void onContentChanged()
	{
		c_();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #207 <Method void c_()>
	//    2    4:return          
	}

	protected void onCreate(Bundle bundle)
	{
		c c1 = d();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:astore_2        
		c1.h();
	//    3    5:aload_2         
	//    4    6:invokevirtual   #212 <Method void c.h()>
		c1.a(bundle);
	//    5    9:aload_2         
	//    6   10:aload_1         
	//    7   11:invokevirtual   #214 <Method void c.a(Bundle)>
		if(c1.i() && b != 0)
	//*   8   14:aload_2         
	//*   9   15:invokevirtual   #217 <Method boolean c.i()>
	//*  10   18:ifeq            60
	//*  11   21:aload_0         
	//*  12   22:getfield        #20  <Field int b>
	//*  13   25:ifeq            60
			if(android.os.Build.VERSION.SDK_INT >= 23)
	//*  14   28:getstatic       #27  <Field int android.os.Build$VERSION.SDK_INT>
	//*  15   31:bipush          23
	//*  16   33:icmplt          52
				onApplyThemeResource(getTheme(), b, false);
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:invokevirtual   #221 <Method android.content.res.Resources$Theme getTheme()>
	//   20   41:aload_0         
	//   21   42:getfield        #20  <Field int b>
	//   22   45:iconst_0        
	//   23   46:invokevirtual   #225 <Method void onApplyThemeResource(android.content.res.Resources$Theme, int, boolean)>
			else
	//*  24   49:goto            60
				setTheme(b);
	//   25   52:aload_0         
	//   26   53:aload_0         
	//   27   54:getfield        #20  <Field int b>
	//   28   57:invokevirtual   #229 <Method void setTheme(int)>
		super.onCreate(bundle);
	//   29   60:aload_0         
	//   30   61:aload_1         
	//   31   62:invokespecial   #231 <Method void FragmentActivity.onCreate(Bundle)>
	//   32   65:return          
	}

	protected void onDestroy()
	{
		super.onDestroy();
	//    0    0:aload_0         
	//    1    1:invokespecial   #234 <Method void FragmentActivity.onDestroy()>
		d().g();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #71  <Method c d()>
	//    4    8:invokevirtual   #237 <Method void c.g()>
	//    5   11:return          
	}

	public boolean onKeyDown(int i, KeyEvent keyevent)
	{
		if(a(i, keyevent))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #240 <Method boolean a(int, KeyEvent)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		else
			return super.onKeyDown(i, keyevent);
	//    7   11:aload_0         
	//    8   12:iload_1         
	//    9   13:aload_2         
	//   10   14:invokespecial   #242 <Method boolean FragmentActivity.onKeyDown(int, KeyEvent)>
	//   11   17:ireturn         
	}

	public final boolean onMenuItemSelected(int i, MenuItem menuitem)
	{
		if(super.onMenuItemSelected(i, menuitem))
	//*   0    0:aload_0         
	//*   1    1:iload_1         
	//*   2    2:aload_2         
	//*   3    3:invokespecial   #246 <Method boolean FragmentActivity.onMenuItemSelected(int, MenuItem)>
	//*   4    6:ifeq            11
			return true;
	//    5    9:iconst_1        
	//    6   10:ireturn         
		ActionBar actionbar = a();
	//    7   11:aload_0         
	//    8   12:invokevirtual   #138 <Method ActionBar a()>
	//    9   15:astore_3        
		if(menuitem.getItemId() == 0x102002c && actionbar != null && (actionbar.a() & 4) != 0)
	//*  10   16:aload_2         
	//*  11   17:invokeinterface #251 <Method int MenuItem.getItemId()>
	//*  12   22:ldc1            #252 <Int 0x102002c>
	//*  13   24:icmpne          45
	//*  14   27:aload_3         
	//*  15   28:ifnull          45
	//*  16   31:aload_3         
	//*  17   32:invokevirtual   #254 <Method int ActionBar.a()>
	//*  18   35:iconst_4        
	//*  19   36:iand            
	//*  20   37:ifeq            45
			return b();
	//   21   40:aload_0         
	//   22   41:invokevirtual   #256 <Method boolean b()>
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
	//    3    3:invokespecial   #260 <Method boolean FragmentActivity.onMenuOpened(int, Menu)>
	//    4    6:ireturn         
	}

	public void onPanelClosed(int i, Menu menu)
	{
		super.onPanelClosed(i, menu);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:aload_2         
	//    3    3:invokespecial   #264 <Method void FragmentActivity.onPanelClosed(int, Menu)>
	//    4    6:return          
	}

	protected void onPostCreate(Bundle bundle)
	{
		super.onPostCreate(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #267 <Method void FragmentActivity.onPostCreate(Bundle)>
		d().b(bundle);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #71  <Method c d()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #269 <Method void android.support.v7.app.c.b(Bundle)>
	//    7   13:return          
	}

	protected void onPostResume()
	{
		super.onPostResume();
	//    0    0:aload_0         
	//    1    1:invokespecial   #272 <Method void FragmentActivity.onPostResume()>
		d().e();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #71  <Method c d()>
	//    4    8:invokevirtual   #275 <Method void c.e()>
	//    5   11:return          
	}

	protected void onSaveInstanceState(Bundle bundle)
	{
		super.onSaveInstanceState(bundle);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #278 <Method void FragmentActivity.onSaveInstanceState(Bundle)>
		d().c(bundle);
	//    3    5:aload_0         
	//    4    6:invokevirtual   #71  <Method c d()>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #280 <Method void c.c(Bundle)>
	//    7   13:return          
	}

	protected void onStart()
	{
		super.onStart();
	//    0    0:aload_0         
	//    1    1:invokespecial   #283 <Method void FragmentActivity.onStart()>
		d().c();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #71  <Method c d()>
	//    4    8:invokevirtual   #285 <Method void c.c()>
	//    5   11:return          
	}

	protected void onStop()
	{
		super.onStop();
	//    0    0:aload_0         
	//    1    1:invokespecial   #288 <Method void FragmentActivity.onStop()>
		d().d();
	//    2    4:aload_0         
	//    3    5:invokevirtual   #71  <Method c d()>
	//    4    8:invokevirtual   #290 <Method void c.d()>
	//    5   11:return          
	}

	protected void onTitleChanged(CharSequence charsequence, int i)
	{
		super.onTitleChanged(charsequence, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokespecial   #294 <Method void FragmentActivity.onTitleChanged(CharSequence, int)>
		d().a(charsequence);
	//    4    6:aload_0         
	//    5    7:invokevirtual   #71  <Method c d()>
	//    6   10:aload_1         
	//    7   11:invokevirtual   #297 <Method void c.a(CharSequence)>
	//    8   14:return          
	}

	public void openOptionsMenu()
	{
		ActionBar actionbar = a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #138 <Method ActionBar a()>
	//    2    4:astore_1        
		if(getWindow().hasFeature(0) && (actionbar == null || !actionbar.c()))
	//*   3    5:aload_0         
	//*   4    6:invokevirtual   #54  <Method Window getWindow()>
	//*   5    9:iconst_0        
	//*   6   10:invokevirtual   #141 <Method boolean Window.hasFeature(int)>
	//*   7   13:ifeq            31
	//*   8   16:aload_1         
	//*   9   17:ifnull          27
	//*  10   20:aload_1         
	//*  11   21:invokevirtual   #300 <Method boolean ActionBar.c()>
	//*  12   24:ifne            31
			super.openOptionsMenu();
	//   13   27:aload_0         
	//   14   28:invokespecial   #302 <Method void FragmentActivity.openOptionsMenu()>
	//   15   31:return          
	}

	public void setContentView(int i)
	{
		d().b(i);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:iload_1         
	//    3    5:invokevirtual   #305 <Method void android.support.v7.app.c.b(int)>
	//    4    8:return          
	}

	public void setContentView(View view)
	{
		d().a(view);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #308 <Method void c.a(View)>
	//    4    8:return          
	}

	public void setContentView(View view, android.view.ViewGroup.LayoutParams layoutparams)
	{
		d().a(view, layoutparams);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #310 <Method void c.a(View, android.view.ViewGroup$LayoutParams)>
	//    5    9:return          
	}

	public void setTheme(int i)
	{
		super.setTheme(i);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #311 <Method void FragmentActivity.setTheme(int)>
		b = i;
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:putfield        #20  <Field int b>
	//    6   10:return          
	}

	public void supportInvalidateOptionsMenu()
	{
		d().f();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #71  <Method c d()>
	//    2    4:invokevirtual   #188 <Method void c.f()>
	//    3    7:return          
	}

	private c a;
	private int b;
	private Resources c;
}
