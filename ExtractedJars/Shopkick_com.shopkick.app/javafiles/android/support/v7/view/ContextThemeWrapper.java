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
	//    2    2:invokespecial   #19  <Method void ContextWrapper(Context)>
	//    3    5:return          
	}

	public ContextThemeWrapper(Context context, int i)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void ContextWrapper(Context)>
		mThemeResource = i;
	//    3    5:aload_0         
	//    4    6:iload_2         
	//    5    7:putfield        #24  <Field int mThemeResource>
	//    6   10:return          
	}

	public ContextThemeWrapper(Context context, android.content.res.Resources.Theme theme)
	{
		super(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #19  <Method void ContextWrapper(Context)>
		mTheme = theme;
	//    3    5:aload_0         
	//    4    6:aload_2         
	//    5    7:putfield        #28  <Field android.content.res.Resources$Theme mTheme>
	//    6   10:return          
	}

	private Resources getResourcesInternal()
	{
		if(mResources == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Resources mResources>
	//*   2    4:ifnonnull       48
			if(mOverrideConfiguration == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field Configuration mOverrideConfiguration>
	//*   5   11:ifnonnull       25
				mResources = super.getResources();
	//    6   14:aload_0         
	//    7   15:aload_0         
	//    8   16:invokespecial   #37  <Method Resources ContextWrapper.getResources()>
	//    9   19:putfield        #32  <Field Resources mResources>
			else
	//*  10   22:goto            48
			if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  11   25:getstatic       #42  <Field int android.os.Build$VERSION.SDK_INT>
	//*  12   28:bipush          17
	//*  13   30:icmplt          48
				mResources = createConfigurationContext(mOverrideConfiguration).getResources();
	//   14   33:aload_0         
	//   15   34:aload_0         
	//   16   35:aload_0         
	//   17   36:getfield        #34  <Field Configuration mOverrideConfiguration>
	//   18   39:invokevirtual   #46  <Method Context createConfigurationContext(Configuration)>
	//   19   42:invokevirtual   #49  <Method Resources Context.getResources()>
	//   20   45:putfield        #32  <Field Resources mResources>
		return mResources;
	//   21   48:aload_0         
	//   22   49:getfield        #32  <Field Resources mResources>
	//   23   52:areturn         
	}

	private void initializeTheme()
	{
		boolean flag;
		if(mTheme == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field android.content.res.Resources$Theme mTheme>
	//*   2    4:ifnonnull       12
			flag = true;
	//    3    7:iconst_1        
	//    4    8:istore_1        
		else
	//*   5    9:goto            14
			flag = false;
	//    6   12:iconst_0        
	//    7   13:istore_1        
		if(flag)
	//*   8   14:iload_1         
	//*   9   15:ifeq            49
		{
			mTheme = getResources().newTheme();
	//   10   18:aload_0         
	//   11   19:aload_0         
	//   12   20:invokevirtual   #51  <Method Resources getResources()>
	//   13   23:invokevirtual   #57  <Method android.content.res.Resources$Theme Resources.newTheme()>
	//   14   26:putfield        #28  <Field android.content.res.Resources$Theme mTheme>
			android.content.res.Resources.Theme theme = getBaseContext().getTheme();
	//   15   29:aload_0         
	//   16   30:invokevirtual   #61  <Method Context getBaseContext()>
	//   17   33:invokevirtual   #64  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   18   36:astore_2        
			if(theme != null)
	//*  19   37:aload_2         
	//*  20   38:ifnull          49
				mTheme.setTo(theme);
	//   21   41:aload_0         
	//   22   42:getfield        #28  <Field android.content.res.Resources$Theme mTheme>
	//   23   45:aload_2         
	//   24   46:invokevirtual   #70  <Method void android.content.res.Resources$Theme.setTo(android.content.res.Resources$Theme)>
		}
		onApplyThemeResource(mTheme, mThemeResource, flag);
	//   25   49:aload_0         
	//   26   50:aload_0         
	//   27   51:getfield        #28  <Field android.content.res.Resources$Theme mTheme>
	//   28   54:aload_0         
	//   29   55:getfield        #24  <Field int mThemeResource>
	//   30   58:iload_1         
	//   31   59:invokevirtual   #74  <Method void onApplyThemeResource(android.content.res.Resources$Theme, int, boolean)>
	//   32   62:return          
	}

	public void applyOverrideConfiguration(Configuration configuration)
	{
		if(mResources == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #32  <Field Resources mResources>
	//*   2    4:ifnonnull       37
		{
			if(mOverrideConfiguration == null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #34  <Field Configuration mOverrideConfiguration>
	//*   5   11:ifnonnull       27
			{
				mOverrideConfiguration = new Configuration(configuration);
	//    6   14:aload_0         
	//    7   15:new             #78  <Class Configuration>
	//    8   18:dup             
	//    9   19:aload_1         
	//   10   20:invokespecial   #80  <Method void Configuration(Configuration)>
	//   11   23:putfield        #34  <Field Configuration mOverrideConfiguration>
				return;
	//   12   26:return          
			} else
			{
				throw new IllegalStateException("Override configuration has already been set");
	//   13   27:new             #82  <Class IllegalStateException>
	//   14   30:dup             
	//   15   31:ldc1            #84  <String "Override configuration has already been set">
	//   16   33:invokespecial   #87  <Method void IllegalStateException(String)>
	//   17   36:athrow          
			}
		} else
		{
			throw new IllegalStateException("getResources() or getAssets() has already been called");
	//   18   37:new             #82  <Class IllegalStateException>
	//   19   40:dup             
	//   20   41:ldc1            #89  <String "getResources() or getAssets() has already been called">
	//   21   43:invokespecial   #87  <Method void IllegalStateException(String)>
	//   22   46:athrow          
		}
	}

	protected void attachBaseContext(Context context)
	{
		super.attachBaseContext(context);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void ContextWrapper.attachBaseContext(Context)>
	//    3    5:return          
	}

	public AssetManager getAssets()
	{
		return getResources().getAssets();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #51  <Method Resources getResources()>
	//    2    4:invokevirtual   #96  <Method AssetManager Resources.getAssets()>
	//    3    7:areturn         
	}

	public Resources getResources()
	{
		return getResourcesInternal();
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method Resources getResourcesInternal()>
	//    2    4:areturn         
	}

	public Object getSystemService(String s)
	{
		if("layout_inflater".equals(((Object) (s))))
	//*   0    0:ldc1            #102 <String "layout_inflater">
	//*   1    2:aload_1         
	//*   2    3:invokevirtual   #108 <Method boolean String.equals(Object)>
	//*   3    6:ifeq            36
		{
			if(mInflater == null)
	//*   4    9:aload_0         
	//*   5   10:getfield        #110 <Field LayoutInflater mInflater>
	//*   6   13:ifnonnull       31
				mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(((Context) (this)));
	//    7   16:aload_0         
	//    8   17:aload_0         
	//    9   18:invokevirtual   #61  <Method Context getBaseContext()>
	//   10   21:invokestatic    #116 <Method LayoutInflater LayoutInflater.from(Context)>
	//   11   24:aload_0         
	//   12   25:invokevirtual   #119 <Method LayoutInflater LayoutInflater.cloneInContext(Context)>
	//   13   28:putfield        #110 <Field LayoutInflater mInflater>
			return ((Object) (mInflater));
	//   14   31:aload_0         
	//   15   32:getfield        #110 <Field LayoutInflater mInflater>
	//   16   35:areturn         
		} else
		{
			return getBaseContext().getSystemService(s);
	//   17   36:aload_0         
	//   18   37:invokevirtual   #61  <Method Context getBaseContext()>
	//   19   40:aload_1         
	//   20   41:invokevirtual   #121 <Method Object Context.getSystemService(String)>
	//   21   44:areturn         
		}
	}

	public android.content.res.Resources.Theme getTheme()
	{
		android.content.res.Resources.Theme theme = mTheme;
	//    0    0:aload_0         
	//    1    1:getfield        #28  <Field android.content.res.Resources$Theme mTheme>
	//    2    4:astore_1        
		if(theme != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return theme;
	//    5    9:aload_1         
	//    6   10:areturn         
		if(mThemeResource == 0)
	//*   7   11:aload_0         
	//*   8   12:getfield        #24  <Field int mThemeResource>
	//*   9   15:ifne            25
			mThemeResource = android.support.v7.appcompat.R.style.Theme_AppCompat_Light;
	//   10   18:aload_0         
	//   11   19:getstatic       #126 <Field int android.support.v7.appcompat.R$style.Theme_AppCompat_Light>
	//   12   22:putfield        #24  <Field int mThemeResource>
		initializeTheme();
	//   13   25:aload_0         
	//   14   26:invokespecial   #128 <Method void initializeTheme()>
		return mTheme;
	//   15   29:aload_0         
	//   16   30:getfield        #28  <Field android.content.res.Resources$Theme mTheme>
	//   17   33:areturn         
	}

	public int getThemeResId()
	{
		return mThemeResource;
	//    0    0:aload_0         
	//    1    1:getfield        #24  <Field int mThemeResource>
	//    2    4:ireturn         
	}

	protected void onApplyThemeResource(android.content.res.Resources.Theme theme, int i, boolean flag)
	{
		theme.applyStyle(i, true);
	//    0    0:aload_1         
	//    1    1:iload_2         
	//    2    2:iconst_1        
	//    3    3:invokevirtual   #134 <Method void android.content.res.Resources$Theme.applyStyle(int, boolean)>
	//    4    6:return          
	}

	public void setTheme(int i)
	{
		if(mThemeResource != i)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field int mThemeResource>
	//*   2    4:iload_1         
	//*   3    5:icmpeq          17
		{
			mThemeResource = i;
	//    4    8:aload_0         
	//    5    9:iload_1         
	//    6   10:putfield        #24  <Field int mThemeResource>
			initializeTheme();
	//    7   13:aload_0         
	//    8   14:invokespecial   #128 <Method void initializeTheme()>
		}
	//    9   17:return          
	}

	private LayoutInflater mInflater;
	private Configuration mOverrideConfiguration;
	private Resources mResources;
	private android.content.res.Resources.Theme mTheme;
	private int mThemeResource;
}
