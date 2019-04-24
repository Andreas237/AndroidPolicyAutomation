// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.*;
import android.view.LayoutInflater;

public class ContextThemeWrapper extends ContextWrapper
{

	public ContextThemeWrapper()
	{
		super(((Context) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #23  <Method void ContextWrapper(Context)>
	//    3    5:return          
	}

	public ContextThemeWrapper(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ContextWrapper(Context)>
		mThemeResource = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #28  <Field int mThemeResource>
	//    6   10:return          
	}

	public ContextThemeWrapper(Context context, android.content.res.Resources.Theme theme)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #23  <Method void ContextWrapper(Context)>
		mTheme = theme;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #32  <Field android.content.res.Resources$Theme mTheme>
	//    6   10:return          
	}

	private Resources getResourcesInternal()
	{
		if(mResources != null) goto _L2; else goto _L1
	//    0    0:aload_0         
	//    1    1:getfield        #36  <Field Resources mResources>
	//    2    4:ifnonnull       22
_L1:
		if(mOverrideConfiguration != null) goto _L4; else goto _L3
	//    3    7:aload_0         
	//    4    8:getfield        #38  <Field Configuration mOverrideConfiguration>
	//    5   11:ifnonnull       27
_L3:
		mResources = super.getResources();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:invokespecial   #41  <Method Resources ContextWrapper.getResources()>
	//    9   19:putfield        #36  <Field Resources mResources>
_L2:
		return mResources;
	//   10   22:aload_0         
	//   11   23:getfield        #36  <Field Resources mResources>
	//   12   26:areturn         
_L4:
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  13   27:getstatic       #46  <Field int android.os.Build$VERSION.SDK_INT>
	//*  14   30:bipush          17
	//*  15   32:icmplt          22
			mResources = createConfigurationContext(mOverrideConfiguration).getResources();
	//   16   35:aload_0         
	//   17   36:aload_0         
	//   18   37:aload_0         
	//   19   38:getfield        #38  <Field Configuration mOverrideConfiguration>
	//   20   41:invokevirtual   #50  <Method Context createConfigurationContext(Configuration)>
	//   21   44:invokevirtual   #53  <Method Resources Context.getResources()>
	//   22   47:putfield        #36  <Field Resources mResources>
		if(true) goto _L2; else goto _L5
	//   23   50:goto            22
_L5:
	}

	private void initializeTheme()
	{
		boolean flag;
		if(mTheme == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field android.content.res.Resources$Theme mTheme>
	//*   2    4:ifnonnull       58
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:iload_1         
	//*   6   10:ifeq            44
	//*   7   13:aload_0         
	//*   8   14:aload_0         
	//*   9   15:invokevirtual   #55  <Method Resources getResources()>
	//*  10   18:invokevirtual   #61  <Method android.content.res.Resources$Theme Resources.newTheme()>
	//*  11   21:putfield        #32  <Field android.content.res.Resources$Theme mTheme>
	//*  12   24:aload_0         
	//*  13   25:invokevirtual   #65  <Method Context getBaseContext()>
	//*  14   28:invokevirtual   #68  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*  15   31:astore_2        
	//*  16   32:aload_2         
	//*  17   33:ifnull          44
	//*  18   36:aload_0         
	//*  19   37:getfield        #32  <Field android.content.res.Resources$Theme mTheme>
	//*  20   40:aload_2         
	//*  21   41:invokevirtual   #74  <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
	//*  22   44:aload_0         
	//*  23   45:aload_0         
	//*  24   46:getfield        #32  <Field android.content.res.Resources$Theme mTheme>
	//*  25   49:aload_0         
	//*  26   50:getfield        #28  <Field int mThemeResource>
	//*  27   53:iload_1         
	//*  28   54:invokevirtual   #78  <Method void onApplyThemeResource(android.content.res.Resources$Theme, int, boolean)>
	//*  29   57:return          
			flag = false;
	//   30   58:iconst_0        
	//   31   59:istore_1        
		if(flag)
		{
			mTheme = getResources().newTheme();
			android.content.res.Resources.Theme theme = getBaseContext().getTheme();
			if(theme != null)
				mTheme.setTo(theme);
		}
		onApplyThemeResource(mTheme, mThemeResource, flag);
	//*  32   60:goto            9
	}

	public void applyOverrideConfiguration(Configuration configuration)
	{
		if(mResources != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #36  <Field Resources mResources>
	//*   2    4:ifnull          17
			throw new IllegalStateException("getResources() or getAssets() has already been called");
	//    3    7:new             #82  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #84  <String "getResources() or getAssets() has already been called">
	//    6   13:invokespecial   #87  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(mOverrideConfiguration != null)
	//*   8   17:aload_0         
	//*   9   18:getfield        #38  <Field Configuration mOverrideConfiguration>
	//*  10   21:ifnull          34
		{
			throw new IllegalStateException("Override configuration has already been set");
	//   11   24:new             #82  <Class IllegalStateException>
	//   12   27:dup             
	//   13   28:ldc1            #89  <String "Override configuration has already been set">
	//   14   30:invokespecial   #87  <Method void IllegalStateException(String)>
	//   15   33:athrow          
		} else
		{
			mOverrideConfiguration = new Configuration(configuration);
	//   16   34:aload_0         
	//   17   35:new             #91  <Class Configuration>
	//   18   38:dup             
	//   19   39:aload_1         
	//   20   40:invokespecial   #93  <Method void Configuration(Configuration)>
	//   21   43:putfield        #38  <Field Configuration mOverrideConfiguration>
			return;
	//   22   46:return          
		}
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void ContextWrapper.attachBaseContext(Context)>
	//    3    5:return          
	}

	public AssetManager getAssets()
	{
		return getResources().getAssets();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #55  <Method Resources getResources()>
	//    2    4:invokevirtual   #100 <Method AssetManager Resources.getAssets()>
	//    3    7:areturn         
	}

	public Configuration getOverrideConfiguration()
	{
		return mOverrideConfiguration;
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field Configuration mOverrideConfiguration>
	//    2    4:areturn         
	}

	public Resources getResources()
	{
		return getResourcesInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #104 <Method Resources getResourcesInternal()>
	//    2    4:areturn         
	}

	public Object getSystemService(String s)
	{
		if("layout_inflater".equals(((Object) (s))))
	//*   0    0:ldc1            #108 <String "layout_inflater">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #114 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            36
		{
			if(mInflater == null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #116 <Field LayoutInflater mInflater>
	//*   6   13:ifnonnull       31
				mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(((Context) (this)));
	//    7   16:aload_0         
	//    8   17:aload_0         
	//    9   18:invokevirtual   #65  <Method Context getBaseContext()>
	//   10   21:invokestatic    #122 <Method LayoutInflater LayoutInflater.from(Context)>
	//   11   24:aload_0         
	//   12   25:invokevirtual   #125 <Method LayoutInflater LayoutInflater.cloneInContext(Context)>
	//   13   28:putfield        #116 <Field LayoutInflater mInflater>
			return ((Object) (mInflater));
	//   14   31:aload_0         
	//   15   32:getfield        #116 <Field LayoutInflater mInflater>
	//   16   35:areturn         
		} else
		{
			return getBaseContext().getSystemService(s);
	//   17   36:aload_0         
	//   18   37:invokevirtual   #65  <Method Context getBaseContext()>
	//   19   40:aload_1         
	//   20   41:invokevirtual   #127 <Method Object Context.getSystemService(String)>
	//   21   44:areturn         
		}
	}

	public android.content.res.Resources.Theme getTheme()
	{
		if(mTheme != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field android.content.res.Resources$Theme mTheme>
	//*   2    4:ifnull          12
			return mTheme;
	//    3    7:aload_0         
	//    4    8:getfield        #32  <Field android.content.res.Resources$Theme mTheme>
	//    5   11:areturn         
		if(mThemeResource == 0)
	//*   6   12:aload_0         
	//*   7   13:getfield        #28  <Field int mThemeResource>
	//*   8   16:ifne            26
			mThemeResource = android.support.v7.appcompat.R.style.Theme_AppCompat_Light;
	//    9   19:aload_0         
	//   10   20:getstatic       #132 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_Light>
	//   11   23:putfield        #28  <Field int mThemeResource>
		initializeTheme();
	//   12   26:aload_0         
	//   13   27:invokespecial   #134 <Method void initializeTheme()>
		return mTheme;
	//   14   30:aload_0         
	//   15   31:getfield        #32  <Field android.content.res.Resources$Theme mTheme>
	//   16   34:areturn         
	}

	public int getThemeResId()
	{
		return mThemeResource;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field int mThemeResource>
	//    2    4:ireturn         
	}

	protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int i, boolean flag)
	{
		theme.applyStyle(i, true);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #140 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
	//    4    6:return          
	}

	public void setTheme(int i)
	{
		if(mThemeResource != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field int mThemeResource>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mThemeResource = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #28  <Field int mThemeResource>
			initializeTheme();
	//    7   13:aload_0         
	//    8   14:invokespecial   #134 <Method void initializeTheme()>
		}
	//    9   17:return          
	}

	private LayoutInflater mInflater;
	private Configuration mOverrideConfiguration;
	private Resources mResources;
	private android.content.res.Resources.Theme mTheme;
	private int mThemeResource;
}
