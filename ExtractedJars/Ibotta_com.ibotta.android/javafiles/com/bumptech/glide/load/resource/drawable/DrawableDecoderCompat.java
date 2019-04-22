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

	public static Drawable getDrawable(Context context, int i, android.content.res.Resources.Theme theme)
	{
		return getDrawable(context, context, i, theme);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:aload_2         
	//    4    4:invokestatic    #17  <Method Drawable getDrawable(Context, Context, int, android.content.res.Resources$Theme)>
	//    5    7:areturn         
	}

	public static Drawable getDrawable(Context context, Context context1, int i)
	{
		return getDrawable(context, context1, i, ((android.content.res.Resources.Theme) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #17  <Method Drawable getDrawable(Context, Context, int, android.content.res.Resources$Theme)>
	//    5    7:areturn         
	}

	private static Drawable getDrawable(Context context, Context context1, int i, android.content.res.Resources.Theme theme)
	{
		if(!shouldCallAppCompatResources) goto _L2; else goto _L1
	//    0    0:getstatic       #27  <Field boolean shouldCallAppCompatResources>
	//    1    3:ifeq            47
_L1:
		Drawable drawable = loadDrawableV7(context1, i, theme);
	//    2    6:aload_1         
	//    3    7:iload_2         
	//    4    8:aload_3         
	//    5    9:invokestatic    #30  <Method Drawable loadDrawableV7(Context, int, android.content.res.Resources$Theme)>
	//    6   12:astore          4
		return drawable;
	//    7   14:aload           4
	//    8   16:areturn         
	//*   9   17:goto            47
		theme;
	//   10   20:astore_3        
		if(!context.getPackageName().equals(((Object) (context1.getPackageName()))))
	//*  11   21:aload_0         
	//*  12   22:invokevirtual   #36  <Method String Context.getPackageName()>
	//*  13   25:aload_1         
	//*  14   26:invokevirtual   #36  <Method String Context.getPackageName()>
	//*  15   29:invokevirtual   #42  <Method boolean String.equals(Object)>
	//*  16   32:ifne            41
			return ContextCompat.getDrawable(context1, i);
	//   17   35:aload_1         
	//   18   36:iload_2         
	//   19   37:invokestatic    #47  <Method Drawable ContextCompat.getDrawable(Context, int)>
	//   20   40:areturn         
		else
			throw theme;
	//   21   41:aload_3         
	//   22   42:athrow          
_L3:
		shouldCallAppCompatResources = false;
	//   23   43:iconst_0        
	//   24   44:putstatic       #27  <Field boolean shouldCallAppCompatResources>
_L2:
		if(theme == null)
	//*  25   47:aload_3         
	//*  26   48:ifnull          54
	//*  27   51:goto            59
			theme = context1.getTheme();
	//   28   54:aload_1         
	//   29   55:invokevirtual   #51  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   30   58:astore_3        
		return loadDrawableV4(context1, i, theme);
	//   31   59:aload_1         
	//   32   60:iload_2         
	//   33   61:aload_3         
	//   34   62:invokestatic    #54  <Method Drawable loadDrawableV4(Context, int, android.content.res.Resources$Theme)>
	//   35   65:areturn         
		context;
	//   36   66:astore_0        
		  goto _L3
	//*  37   67:goto            43
		context;
	//   38   70:astore_0        
		  goto _L2
	//*  39   71:goto            17
	}

	private static Drawable loadDrawableV4(Context context, int i, android.content.res.Resources.Theme theme)
	{
		return ResourcesCompat.getDrawable(context.getResources(), i, theme);
	//    0    0:aload_0         
	//    1    1:invokevirtual   #58  <Method android.content.res.Resources Context.getResources()>
	//    2    4:iload_1         
	//    3    5:aload_2         
	//    4    6:invokestatic    #63  <Method Drawable ResourcesCompat.getDrawable(android.content.res.Resources, int, android.content.res.Resources$Theme)>
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
	//    4    6:new             #65  <Class ContextThemeWrapper>
	//    5    9:dup             
	//    6   10:aload_0         
	//    7   11:aload_2         
	//    8   12:invokespecial   #69  <Method void ContextThemeWrapper(Context, android.content.res.Resources$Theme)>
	//    9   15:astore_3        
		return AppCompatResources.getDrawable(((Context) (obj)), i);
	//   10   16:aload_3         
	//   11   17:iload_1         
	//   12   18:invokestatic    #72  <Method Drawable AppCompatResources.getDrawable(Context, int)>
	//   13   21:areturn         
	}

	private static volatile boolean shouldCallAppCompatResources = true;

	static 
	{
	//    0    0:return          
	}
}
