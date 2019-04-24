// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v4.graphics.ColorUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import java.lang.annotation.Annotation;

// Referenced classes of package android.support.v7.app:
//			MediaRouteVolumeSlider

final class MediaRouterThemeHelper
{
	private static interface ControllerColorType
		extends Annotation
	{
	}


	private MediaRouterThemeHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
	//    2    4:return          
	}

	static Context createThemedButtonContext(Context context)
	{
		ContextThemeWrapper contextthemewrapper = new ContextThemeWrapper(context, getRouterThemeId(context));
	//    0    0:new             #24  <Class ContextThemeWrapper>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:invokestatic    #28  <Method int getRouterThemeId(Context)>
	//    5    9:invokespecial   #31  <Method void ContextThemeWrapper(Context, int)>
	//    6   12:astore_2        
		int i = getThemeResource(((Context) (contextthemewrapper)), android.support.v7.mediarouter.R.attr.mediaRouteTheme);
	//    7   13:aload_2         
	//    8   14:getstatic       #36  <Field int android.support.v7.mediarouter.R$attr.mediaRouteTheme>
	//    9   17:invokestatic    #40  <Method int getThemeResource(Context, int)>
	//   10   20:istore_1        
		context = ((Context) (contextthemewrapper));
	//   11   21:aload_2         
	//   12   22:astore_0        
		if(i != 0)
	//*  13   23:iload_1         
	//*  14   24:ifeq            37
			context = ((Context) (new ContextThemeWrapper(((Context) (contextthemewrapper)), i)));
	//   15   27:new             #24  <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_2         
	//   18   32:iload_1         
	//   19   33:invokespecial   #31  <Method void ContextThemeWrapper(Context, int)>
	//   20   36:astore_0        
		return context;
	//   21   37:aload_0         
	//   22   38:areturn         
	}

	static Context createThemedDialogContext(Context context, int i, boolean flag)
	{
		int j = i;
	//    0    0:iload_1         
	//    1    1:istore_3        
		if(i == 0)
	//*   2    2:iload_1         
	//*   3    3:ifne            27
		{
			if(!flag)
	//*   4    6:iload_2         
	//*   5    7:ifne            17
				i = android.support.v7.appcompat.R.attr.dialogTheme;
	//    6   10:getstatic       #47  <Field int android.support.v7.appcompat.R$attr.dialogTheme>
	//    7   13:istore_1        
			else
	//*   8   14:goto            21
				i = android.support.v7.appcompat.R.attr.alertDialogTheme;
	//    9   17:getstatic       #50  <Field int android.support.v7.appcompat.R$attr.alertDialogTheme>
	//   10   20:istore_1        
			j = getThemeResource(context, i);
	//   11   21:aload_0         
	//   12   22:iload_1         
	//   13   23:invokestatic    #40  <Method int getThemeResource(Context, int)>
	//   14   26:istore_3        
		}
		context = ((Context) (new ContextThemeWrapper(context, j)));
	//   15   27:new             #24  <Class ContextThemeWrapper>
	//   16   30:dup             
	//   17   31:aload_0         
	//   18   32:iload_3         
	//   19   33:invokespecial   #31  <Method void ContextThemeWrapper(Context, int)>
	//   20   36:astore_0        
		if(getThemeResource(context, android.support.v7.mediarouter.R.attr.mediaRouteTheme) != 0)
	//*  21   37:aload_0         
	//*  22   38:getstatic       #36  <Field int android.support.v7.mediarouter.R$attr.mediaRouteTheme>
	//*  23   41:invokestatic    #40  <Method int getThemeResource(Context, int)>
	//*  24   44:ifeq            60
			return ((Context) (new ContextThemeWrapper(context, getRouterThemeId(context))));
	//   25   47:new             #24  <Class ContextThemeWrapper>
	//   26   50:dup             
	//   27   51:aload_0         
	//   28   52:aload_0         
	//   29   53:invokestatic    #28  <Method int getRouterThemeId(Context)>
	//   30   56:invokespecial   #31  <Method void ContextThemeWrapper(Context, int)>
	//   31   59:areturn         
		else
			return context;
	//   32   60:aload_0         
	//   33   61:areturn         
	}

	static int createThemedDialogStyle(Context context)
	{
		int j = getThemeResource(context, android.support.v7.mediarouter.R.attr.mediaRouteTheme);
	//    0    0:aload_0         
	//    1    1:getstatic       #36  <Field int android.support.v7.mediarouter.R$attr.mediaRouteTheme>
	//    2    4:invokestatic    #40  <Method int getThemeResource(Context, int)>
	//    3    7:istore_2        
		int i = j;
	//    4    8:iload_2         
	//    5    9:istore_1        
		if(j == 0)
	//*   6   10:iload_2         
	//*   7   11:ifne            19
			i = getRouterThemeId(context);
	//    8   14:aload_0         
	//    9   15:invokestatic    #28  <Method int getRouterThemeId(Context)>
	//   10   18:istore_1        
		return i;
	//   11   19:iload_1         
	//   12   20:ireturn         
	}

	static int getButtonTextColor(Context context)
	{
		int i = getThemeColor(context, 0, android.support.v7.appcompat.R.attr.colorPrimary);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:getstatic       #55  <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//    3    5:invokestatic    #59  <Method int getThemeColor(Context, int, int)>
	//    4    8:istore_1        
		if(ColorUtils.calculateContrast(i, getThemeColor(context, 0, 0x1010031)) < 3D)
	//*   5    9:iload_1         
	//*   6   10:aload_0         
	//*   7   11:iconst_0        
	//*   8   12:ldc1            #60  <Int 0x1010031>
	//*   9   14:invokestatic    #59  <Method int getThemeColor(Context, int, int)>
	//*  10   17:invokestatic    #66  <Method double ColorUtils.calculateContrast(int, int)>
	//*  11   20:ldc2w           #67  <Double 3D>
	//*  12   23:dcmpg           
	//*  13   24:ifge            36
			return getThemeColor(context, 0, android.support.v7.appcompat.R.attr.colorAccent);
	//   14   27:aload_0         
	//   15   28:iconst_0        
	//   16   29:getstatic       #71  <Field int android.support.v7.appcompat.R$attr.colorAccent>
	//   17   32:invokestatic    #59  <Method int getThemeColor(Context, int, int)>
	//   18   35:ireturn         
		else
			return i;
	//   19   36:iload_1         
	//   20   37:ireturn         
	}

	static int getControllerColor(Context context, int i)
	{
		return ColorUtils.calculateContrast(-1, getThemeColor(context, i, android.support.v7.appcompat.R.attr.colorPrimary)) < 3D ? 0xde000000 : -1;
	//    0    0:iconst_m1       
	//    1    1:aload_0         
	//    2    2:iload_1         
	//    3    3:getstatic       #55  <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//    4    6:invokestatic    #59  <Method int getThemeColor(Context, int, int)>
	//    5    9:invokestatic    #66  <Method double ColorUtils.calculateContrast(int, int)>
	//    6   12:ldc2w           #67  <Double 3D>
	//    7   15:dcmpl           
	//    8   16:iflt            21
	//    9   19:iconst_m1       
	//   10   20:ireturn         
	//   11   21:ldc1            #10  <Int 0xde000000>
	//   12   23:ireturn         
	}

	static float getDisabledAlpha(Context context)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #76  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void TypedValue()>
	//    3    7:astore_1        
		if(context.getTheme().resolveAttribute(0x1010033, typedvalue, true))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #83  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   6   12:ldc1            #84  <Int 0x1010033>
	//*   7   14:aload_1         
	//*   8   15:iconst_1        
	//*   9   16:invokevirtual   #90  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  10   19:ifeq            27
			return typedvalue.getFloat();
	//   11   22:aload_1         
	//   12   23:invokevirtual   #94  <Method float TypedValue.getFloat()>
	//   13   26:freturn         
		else
			return 0.5F;
	//   14   27:ldc1            #95  <Float 0.5F>
	//   15   29:freturn         
	}

	private static int getRouterThemeId(Context context)
	{
		if(isLightTheme(context))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #99  <Method boolean isLightTheme(Context)>
	//*   2    4:ifeq            25
			if(getControllerColor(context, 0) == 0xde000000)
	//*   3    7:aload_0         
	//*   4    8:iconst_0        
	//*   5    9:invokestatic    #101 <Method int getControllerColor(Context, int)>
	//*   6   12:ldc1            #10  <Int 0xde000000>
	//*   7   14:icmpne          21
				return android.support.v7.mediarouter.R.style.Theme_MediaRouter_Light;
	//    8   17:getstatic       #106 <Field int android.support.v7.mediarouter.R$style.Theme_MediaRouter_Light>
	//    9   20:ireturn         
			else
				return android.support.v7.mediarouter.R.style.Theme_MediaRouter_Light_DarkControlPanel;
	//   10   21:getstatic       #109 <Field int android.support.v7.mediarouter.R$style.Theme_MediaRouter_Light_DarkControlPanel>
	//   11   24:ireturn         
		if(getControllerColor(context, 0) == 0xde000000)
	//*  12   25:aload_0         
	//*  13   26:iconst_0        
	//*  14   27:invokestatic    #101 <Method int getControllerColor(Context, int)>
	//*  15   30:ldc1            #10  <Int 0xde000000>
	//*  16   32:icmpne          39
			return android.support.v7.mediarouter.R.style.Theme_MediaRouter_LightControlPanel;
	//   17   35:getstatic       #112 <Field int android.support.v7.mediarouter.R$style.Theme_MediaRouter_LightControlPanel>
	//   18   38:ireturn         
		else
			return android.support.v7.mediarouter.R.style.Theme_MediaRouter;
	//   19   39:getstatic       #115 <Field int android.support.v7.mediarouter.R$style.Theme_MediaRouter>
	//   20   42:ireturn         
	}

	private static int getThemeColor(Context context, int i, int j)
	{
		if(i != 0)
	//*   0    0:iload_1         
	//*   1    1:ifeq            34
		{
			TypedArray typedarray = context.obtainStyledAttributes(i, new int[] {
				j
			});
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:iconst_1        
	//    5    7:newarray        int[]
	//    6    9:dup             
	//    7   10:iconst_0        
	//    8   11:iload_2         
	//    9   12:iastore         
	//   10   13:invokevirtual   #119 <Method TypedArray Context.obtainStyledAttributes(int, int[])>
	//   11   16:astore_3        
			i = typedarray.getColor(0, 0);
	//   12   17:aload_3         
	//   13   18:iconst_0        
	//   14   19:iconst_0        
	//   15   20:invokevirtual   #125 <Method int TypedArray.getColor(int, int)>
	//   16   23:istore_1        
			typedarray.recycle();
	//   17   24:aload_3         
	//   18   25:invokevirtual   #128 <Method void TypedArray.recycle()>
			if(i != 0)
	//*  19   28:iload_1         
	//*  20   29:ifeq            34
				return i;
	//   21   32:iload_1         
	//   22   33:ireturn         
		}
		TypedValue typedvalue = new TypedValue();
	//   23   34:new             #76  <Class TypedValue>
	//   24   37:dup             
	//   25   38:invokespecial   #77  <Method void TypedValue()>
	//   26   41:astore_3        
		context.getTheme().resolveAttribute(j, typedvalue, true);
	//   27   42:aload_0         
	//   28   43:invokevirtual   #83  <Method android.content.res.Resources$Theme Context.getTheme()>
	//   29   46:iload_2         
	//   30   47:aload_3         
	//   31   48:iconst_1        
	//   32   49:invokevirtual   #90  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   33   52:pop             
		if(typedvalue.resourceId != 0)
	//*  34   53:aload_3         
	//*  35   54:getfield        #131 <Field int TypedValue.resourceId>
	//*  36   57:ifeq            72
			return context.getResources().getColor(typedvalue.resourceId);
	//   37   60:aload_0         
	//   38   61:invokevirtual   #135 <Method Resources Context.getResources()>
	//   39   64:aload_3         
	//   40   65:getfield        #131 <Field int TypedValue.resourceId>
	//   41   68:invokevirtual   #140 <Method int Resources.getColor(int)>
	//   42   71:ireturn         
		else
			return typedvalue.data;
	//   43   72:aload_3         
	//   44   73:getfield        #143 <Field int TypedValue.data>
	//   45   76:ireturn         
	}

	static int getThemeResource(Context context, int i)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #76  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void TypedValue()>
	//    3    7:astore_2        
		if(context.getTheme().resolveAttribute(i, typedvalue, true))
	//*   4    8:aload_0         
	//*   5    9:invokevirtual   #83  <Method android.content.res.Resources$Theme Context.getTheme()>
	//*   6   12:iload_1         
	//*   7   13:aload_2         
	//*   8   14:iconst_1        
	//*   9   15:invokevirtual   #90  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//*  10   18:ifeq            26
			return typedvalue.resourceId;
	//   11   21:aload_2         
	//   12   22:getfield        #131 <Field int TypedValue.resourceId>
	//   13   25:ireturn         
		else
			return 0;
	//   14   26:iconst_0        
	//   15   27:ireturn         
	}

	private static boolean isLightTheme(Context context)
	{
		TypedValue typedvalue = new TypedValue();
	//    0    0:new             #76  <Class TypedValue>
	//    1    3:dup             
	//    2    4:invokespecial   #77  <Method void TypedValue()>
	//    3    7:astore_1        
		return context.getTheme().resolveAttribute(android.support.v7.appcompat.R.attr.isLightTheme, typedvalue, true) && typedvalue.data != 0;
	//    4    8:aload_0         
	//    5    9:invokevirtual   #83  <Method android.content.res.Resources$Theme Context.getTheme()>
	//    6   12:getstatic       #145 <Field int android.support.v7.appcompat.R$attr.isLightTheme>
	//    7   15:aload_1         
	//    8   16:iconst_1        
	//    9   17:invokevirtual   #90  <Method boolean android.content.res.Resources$Theme.resolveAttribute(int, TypedValue, boolean)>
	//   10   20:ifeq            32
	//   11   23:aload_1         
	//   12   24:getfield        #143 <Field int TypedValue.data>
	//   13   27:ifeq            32
	//   14   30:iconst_1        
	//   15   31:ireturn         
	//   16   32:iconst_0        
	//   17   33:ireturn         
	}

	static void setMediaControlsBackgroundColor(Context context, View view, View view1, boolean flag)
	{
		int i = getThemeColor(context, 0, android.support.v7.appcompat.R.attr.colorPrimary);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:getstatic       #55  <Field int android.support.v7.appcompat.R$attr.colorPrimary>
	//    3    5:invokestatic    #59  <Method int getThemeColor(Context, int, int)>
	//    4    8:istore          4
		int j = getThemeColor(context, 0, android.support.v7.appcompat.R.attr.colorPrimaryDark);
	//    5   10:aload_0         
	//    6   11:iconst_0        
	//    7   12:getstatic       #150 <Field int android.support.v7.appcompat.R$attr.colorPrimaryDark>
	//    8   15:invokestatic    #59  <Method int getThemeColor(Context, int, int)>
	//    9   18:istore          5
		int k;
		if(flag && getControllerColor(context, 0) == 0xde000000)
	//*  10   20:iload_3         
	//*  11   21:ifeq            40
	//*  12   24:aload_0         
	//*  13   25:iconst_0        
	//*  14   26:invokestatic    #101 <Method int getControllerColor(Context, int)>
	//*  15   29:ldc1            #10  <Int 0xde000000>
	//*  16   31:icmpne          40
		{
			k = -1;
	//   17   34:iconst_m1       
	//   18   35:istore          6
		} else
	//*  19   37:goto            48
		{
			k = i;
	//   20   40:iload           4
	//   21   42:istore          6
			i = j;
	//   22   44:iload           5
	//   23   46:istore          4
		}
		view.setBackgroundColor(k);
	//   24   48:aload_1         
	//   25   49:iload           6
	//   26   51:invokevirtual   #156 <Method void View.setBackgroundColor(int)>
		view1.setBackgroundColor(i);
	//   27   54:aload_2         
	//   28   55:iload           4
	//   29   57:invokevirtual   #156 <Method void View.setBackgroundColor(int)>
		view.setTag(((Object) (Integer.valueOf(k))));
	//   30   60:aload_1         
	//   31   61:iload           6
	//   32   63:invokestatic    #162 <Method Integer Integer.valueOf(int)>
	//   33   66:invokevirtual   #166 <Method void View.setTag(Object)>
		view1.setTag(((Object) (Integer.valueOf(i))));
	//   34   69:aload_2         
	//   35   70:iload           4
	//   36   72:invokestatic    #162 <Method Integer Integer.valueOf(int)>
	//   37   75:invokevirtual   #166 <Method void View.setTag(Object)>
	//   38   78:return          
	}

	static void setVolumeSliderColor(Context context, MediaRouteVolumeSlider mediaroutevolumeslider, View view)
	{
		int j = getControllerColor(context, 0);
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:invokestatic    #101 <Method int getControllerColor(Context, int)>
	//    3    5:istore          4
		int i = j;
	//    4    7:iload           4
	//    5    9:istore_3        
		if(Color.alpha(j) != 255)
	//*   6   10:iload           4
	//*   7   12:invokestatic    #173 <Method int Color.alpha(int)>
	//*   8   15:sipush          255
	//*   9   18:icmpeq          37
			i = ColorUtils.compositeColors(j, ((Integer)view.getTag()).intValue());
	//   10   21:iload           4
	//   11   23:aload_2         
	//   12   24:invokevirtual   #177 <Method Object View.getTag()>
	//   13   27:checkcast       #158 <Class Integer>
	//   14   30:invokevirtual   #181 <Method int Integer.intValue()>
	//   15   33:invokestatic    #184 <Method int ColorUtils.compositeColors(int, int)>
	//   16   36:istore_3        
		mediaroutevolumeslider.setColor(i);
	//   17   37:aload_1         
	//   18   38:iload_3         
	//   19   39:invokevirtual   #189 <Method void MediaRouteVolumeSlider.setColor(int)>
	//   20   42:return          
	}

	static final int COLOR_DARK_ON_LIGHT_BACKGROUND = 0xde000000;
	static final int COLOR_WHITE_ON_DARK_BACKGROUND = -1;
	private static final float MIN_CONTRAST = 3F;
}
