// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.content.res.ResourcesCompat;
import android.support.v7.content.res.AppCompatResources;
import android.support.v7.view.ContextThemeWrapper;

public final class DrawableDecoderCompat
{

	private DrawableDecoderCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static Drawable getDrawable(Context context, int i, android.content.res.Resources.Theme theme)
	{
		return getDrawable(context, context, i, theme);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:invokestatic    #20  <Method Drawable getDrawable(Context, Context, int, android.content.res.Resources$Theme)>
	//    5    7:areturn         
	}

	public static Drawable getDrawable(Context context, Context context1, int i)
	{
		return getDrawable(context, context1, i, ((android.content.res.Resources.Theme) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #20  <Method Drawable getDrawable(Context, Context, int, android.content.res.Resources$Theme)>
	//    5    7:areturn         
	}

	private static Drawable getDrawable(Context context, Context context1, int i, android.content.res.Resources.Theme theme)
	{
		if(!shouldCallAppCompatResources) goto _L2; else goto _L1
	//    0    0:getstatic       #30  <Field boolean shouldCallAppCompatResources>
	//    1    3:ifeq            44
_L1:
		Drawable drawable = loadDrawableV7(context1, i, theme);
	//    2    6:aload_1         
	//    3    7:iload_2         
	//    4    8:aload_3         
	//    5    9:invokestatic    #33  <Method Drawable loadDrawableV7(Context, int, android.content.res.Resources$Theme)>
	//    6   12:astore          4
		return drawable;
	//    7   14:aload           4
	//    8   16:areturn         
		theme;
	//    9   17:astore_3        
		if(!context.getPackageName().equals(((Object) (context1.getPackageName()))))
	//*  10   18:aload_0         
	//*  11   19:invokevirtual   #39  <Method String Context.getPackageName()>
	//*  12   22:aload_1         
	//*  13   23:invokevirtual   #39  <Method String Context.getPackageName()>
	//*  14   26:invokevirtual   #45  <Method boolean String.equals(Object)>
	//*  15   29:ifne            38
			return ContextCompat.getDrawable(context1, i);
	//   16   32:aload_1         
	//   17   33:iload_2         
	//   18   34:invokestatic    #50  <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   19   37:areturn         
		else
			throw theme;
	//   20   38:aload_3         
	//   21   39:athrow          
_L3:
		shouldCallAppCompatResources = false;
	//   22   40:iconst_0        
	//   23   41:putstatic       #30  <Field boolean shouldCallAppCompatResources>
_L2:
		if(theme == null)
	//*  24   44:aload_3         
	//*  25   45:ifnull          51
	//*  26   48:goto            56
			theme = context1.getTheme();
	//   27   51:aload_1         
	//   28   52:invokevirtual   #54  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   29   55:astore_3        
		return loadDrawableV4(context1, i, theme);
	//   30   56:aload_1         
	//   31   57:iload_2         
	//   32   58:aload_3         
	//   33   59:invokestatic    #57  <Method Drawable loadDrawableV4(Context, int, android.content.res.Resources$Theme)>
	//   34   62:areturn         
		context;
	//   35   63:astore_0        
		  goto _L3
	//*  36   64:goto            40
		context;
	//   37   67:astore_0        
		  goto _L2
	//*  38   68:goto            44
	}

	private static Drawable loadDrawableV4(Context context, int i, android.content.res.Resources.Theme theme)
	{
		return ResourcesCompat.getDrawable(context.getResources(), i, theme);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #61  <Method android.content.res.Resources Context.getResources()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #66  <Method Drawable ResourcesCompat.getDrawable(android.content.res.Resources, int, android.content.res.Resources$Theme)>
	//    5    9:areturn         
	}

	private static Drawable loadDrawableV7(Context context, int i, android.content.res.Resources.Theme theme)
	{
		Object obj = ((Object) (context));
	//    0    0:aload_0         
	//    1    1:astore_3        
		if(theme != null)
	//*   2    2:aload_2         
	//*   3    3:ifnull          16
			obj = ((Object) (new ContextThemeWrapper(context, theme)));
	//    4    6:new             #68  <Class ContextThemeWrapper>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #71  <Method void ContextThemeWrapper(Context, android.content.res.Resources$Theme)>
	//    9   15:astore_3        
		return AppCompatResources.getDrawable(((Context) (obj)), i);
	//   10   16:aload_3         
	//   11   17:iload_1         
	//   12   18:invokestatic    #74  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   13   21:areturn         
	}

	private static volatile boolean shouldCallAppCompatResources = true;

	static 
	{
	//    0    0:return          
	}
}
