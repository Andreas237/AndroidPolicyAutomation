// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.*;
import android.util.AttributeSet;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package android.support.v4.graphics.drawable:
//			WrappedDrawable, TintAwareDrawable, WrappedDrawableApi21, WrappedDrawableApi14

public final class DrawableCompat
{

	public static void applyTheme(Drawable drawable, android.content.res.Resources.Theme theme)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			drawable.applyTheme(theme);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #24  <Method void Drawable.applyTheme(android.content.res.Resources$Theme)>
	//    6   13:return          
	}

	public static boolean canApplyTheme(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return drawable.canApplyTheme();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #31  <Method boolean Drawable.canApplyTheme()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static void clearColorFilter(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
		{
			drawable.clearColorFilter();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #36  <Method void Drawable.clearColorFilter()>
			return;
	//    5   12:return          
		}
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   6   13:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   7   16:bipush          21
	//*   8   18:icmplt          118
		{
			drawable.clearColorFilter();
	//    9   21:aload_0         
	//   10   22:invokevirtual   #36  <Method void Drawable.clearColorFilter()>
			if(drawable instanceof InsetDrawable)
	//*  11   25:aload_0         
	//*  12   26:instanceof      #38  <Class InsetDrawable>
	//*  13   29:ifeq            43
			{
				clearColorFilter(((InsetDrawable)drawable).getDrawable());
	//   14   32:aload_0         
	//   15   33:checkcast       #38  <Class InsetDrawable>
	//   16   36:invokevirtual   #42  <Method Drawable InsetDrawable.getDrawable()>
	//   17   39:invokestatic    #44  <Method void clearColorFilter(Drawable)>
				return;
	//   18   42:return          
			}
			if(drawable instanceof WrappedDrawable)
	//*  19   43:aload_0         
	//*  20   44:instanceof      #46  <Class WrappedDrawable>
	//*  21   47:ifeq            63
			{
				clearColorFilter(((WrappedDrawable)drawable).getWrappedDrawable());
	//   22   50:aload_0         
	//   23   51:checkcast       #46  <Class WrappedDrawable>
	//   24   54:invokeinterface #49  <Method Drawable WrappedDrawable.getWrappedDrawable()>
	//   25   59:invokestatic    #44  <Method void clearColorFilter(Drawable)>
				return;
	//   26   62:return          
			}
			if(drawable instanceof DrawableContainer)
	//*  27   63:aload_0         
	//*  28   64:instanceof      #51  <Class DrawableContainer>
	//*  29   67:ifeq            122
			{
				drawable = ((Drawable) ((android.graphics.drawable.DrawableContainer.DrawableContainerState)((DrawableContainer)drawable).getConstantState()));
	//   30   70:aload_0         
	//   31   71:checkcast       #51  <Class DrawableContainer>
	//   32   74:invokevirtual   #55  <Method android.graphics.drawable.Drawable$ConstantState DrawableContainer.getConstantState()>
	//   33   77:checkcast       #57  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
	//   34   80:astore_0        
				if(drawable != null)
	//*  35   81:aload_0         
	//*  36   82:ifnull          122
				{
					int i = 0;
	//   37   85:iconst_0        
	//   38   86:istore_1        
					for(int j = ((android.graphics.drawable.DrawableContainer.DrawableContainerState) (drawable)).getChildCount(); i < j; i++)
	//*  39   87:aload_0         
	//*  40   88:invokevirtual   #61  <Method int android.graphics.drawable.DrawableContainer$DrawableContainerState.getChildCount()>
	//*  41   91:istore_2        
	//*  42   92:iload_1         
	//*  43   93:iload_2         
	//*  44   94:icmpge          122
					{
						Drawable drawable1 = ((android.graphics.drawable.DrawableContainer.DrawableContainerState) (drawable)).getChild(i);
	//   45   97:aload_0         
	//   46   98:iload_1         
	//   47   99:invokevirtual   #65  <Method Drawable android.graphics.drawable.DrawableContainer$DrawableContainerState.getChild(int)>
	//   48  102:astore_3        
						if(drawable1 != null)
	//*  49  103:aload_3         
	//*  50  104:ifnull          111
							clearColorFilter(drawable1);
	//   51  107:aload_3         
	//   52  108:invokestatic    #44  <Method void clearColorFilter(Drawable)>
					}

	//   53  111:iload_1         
	//   54  112:iconst_1        
	//   55  113:iadd            
	//   56  114:istore_1        
				}
			}
		} else
	//*  57  115:goto            92
		{
			drawable.clearColorFilter();
	//   58  118:aload_0         
	//   59  119:invokevirtual   #36  <Method void Drawable.clearColorFilter()>
		}
	//   60  122:return          
	}

	public static int getAlpha(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return drawable.getAlpha();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #69  <Method int Drawable.getAlpha()>
	//    5   12:ireturn         
		else
			return 0;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static ColorFilter getColorFilter(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          13
			return drawable.getColorFilter();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #74  <Method ColorFilter Drawable.getColorFilter()>
	//    5   12:areturn         
		else
			return null;
	//    6   13:aconst_null     
	//    7   14:areturn         
	}

	public static int getLayoutDirection(Drawable drawable)
	{
		Method method;
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          13
			return drawable.getLayoutDirection();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #81  <Method int Drawable.getLayoutDirection()>
	//    5   12:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 17)
			break MISSING_BLOCK_LABEL_107;
	//    6   13:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//    7   16:bipush          17
	//    8   18:icmplt          107
		if(!sGetLayoutDirectionMethodFetched)
	//*   9   21:getstatic       #83  <Field boolean sGetLayoutDirectionMethodFetched>
	//*  10   24:ifne            65
		{
			try
			{
				sGetLayoutDirectionMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("getLayoutDirection", new Class[0]);
	//   11   27:ldc1            #21  <Class Drawable>
	//   12   29:ldc1            #84  <String "getLayoutDirection">
	//   13   31:iconst_0        
	//   14   32:anewarray       Class[]
	//   15   35:invokevirtual   #90  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   16   38:putstatic       #92  <Field Method sGetLayoutDirectionMethod>
				sGetLayoutDirectionMethod.setAccessible(true);
	//   17   41:getstatic       #92  <Field Method sGetLayoutDirectionMethod>
	//   18   44:iconst_1        
	//   19   45:invokevirtual   #98  <Method void Method.setAccessible(boolean)>
			}
	//*  20   48:goto            61
			catch(NoSuchMethodException nosuchmethodexception)
	//*  21   51:astore_2        
			{
				Log.i("DrawableCompat", "Failed to retrieve getLayoutDirection() method", ((Throwable) (nosuchmethodexception)));
	//   22   52:ldc1            #100 <String "DrawableCompat">
	//   23   54:ldc1            #102 <String "Failed to retrieve getLayoutDirection() method">
	//   24   56:aload_2         
	//   25   57:invokestatic    #108 <Method int Log.i(String, String, Throwable)>
	//   26   60:pop             
			}
			sGetLayoutDirectionMethodFetched = true;
	//   27   61:iconst_1        
	//   28   62:putstatic       #83  <Field boolean sGetLayoutDirectionMethodFetched>
		}
		method = sGetLayoutDirectionMethod;
	//   29   65:getstatic       #92  <Field Method sGetLayoutDirectionMethod>
	//   30   68:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_105;
	//   31   69:aload_2         
	//   32   70:ifnull          105
		int i = ((Integer)method.invoke(((Object) (drawable)), new Object[0])).intValue();
	//   33   73:aload_2         
	//   34   74:aload_0         
	//   35   75:iconst_0        
	//   36   76:anewarray       Object[]
	//   37   79:invokevirtual   #112 <Method Object Method.invoke(Object, Object[])>
	//   38   82:checkcast       #114 <Class Integer>
	//   39   85:invokevirtual   #117 <Method int Integer.intValue()>
	//   40   88:istore_1        
		return i;
	//   41   89:iload_1         
	//   42   90:ireturn         
		drawable;
	//   43   91:astore_0        
		Log.i("DrawableCompat", "Failed to invoke getLayoutDirection() via reflection", ((Throwable) (drawable)));
	//   44   92:ldc1            #100 <String "DrawableCompat">
	//   45   94:ldc1            #119 <String "Failed to invoke getLayoutDirection() via reflection">
	//   46   96:aload_0         
	//   47   97:invokestatic    #108 <Method int Log.i(String, String, Throwable)>
	//   48  100:pop             
		sGetLayoutDirectionMethod = null;
	//   49  101:aconst_null     
	//   50  102:putstatic       #92  <Field Method sGetLayoutDirectionMethod>
		return 0;
	//   51  105:iconst_0        
	//   52  106:ireturn         
		return 0;
	//   53  107:iconst_0        
	//   54  108:ireturn         
	}

	public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          18
		{
			drawable.inflate(resources, xmlpullparser, attributeset, theme);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:aload_2         
	//    6   11:aload_3         
	//    7   12:aload           4
	//    8   14:invokevirtual   #129 <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
			return;
	//    9   17:return          
		} else
		{
			drawable.inflate(resources, xmlpullparser, attributeset);
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:aload_2         
	//   13   21:aload_3         
	//   14   22:invokevirtual   #132 <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet)>
			return;
	//   15   25:return          
		}
	}

	public static boolean isAutoMirrored(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			return drawable.isAutoMirrored();
	//    3    8:aload_0         
	//    4    9:invokevirtual   #136 <Method boolean Drawable.isAutoMirrored()>
	//    5   12:ireturn         
		else
			return false;
	//    6   13:iconst_0        
	//    7   14:ireturn         
	}

	public static void jumpToCurrentState(Drawable drawable)
	{
		drawable.jumpToCurrentState();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method void Drawable.jumpToCurrentState()>
	//    2    4:return          
	}

	public static void setAutoMirrored(Drawable drawable, boolean flag)
	{
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          19
	//*   2    5:icmplt          13
			drawable.setAutoMirrored(flag);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #145 <Method void Drawable.setAutoMirrored(boolean)>
	//    6   13:return          
	}

	public static void setHotspot(Drawable drawable, float f, float f1)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
			drawable.setHotspot(f, f1);
	//    3    8:aload_0         
	//    4    9:fload_1         
	//    5   10:fload_2         
	//    6   11:invokevirtual   #150 <Method void Drawable.setHotspot(float, float)>
	//    7   14:return          
	}

	public static void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          17
			drawable.setHotspotBounds(i, j, k, l);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:iload_2         
	//    6   11:iload_3         
	//    7   12:iload           4
	//    8   14:invokevirtual   #155 <Method void Drawable.setHotspotBounds(int, int, int, int)>
	//    9   17:return          
	}

	public static boolean setLayoutDirection(Drawable drawable, int i)
	{
		Method method;
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          14
			return drawable.setLayoutDirection(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #160 <Method boolean Drawable.setLayoutDirection(int)>
	//    6   13:ireturn         
		if(android.os.Build.VERSION.SDK_INT < 17)
			break MISSING_BLOCK_LABEL_115;
	//    7   14:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//    8   17:bipush          17
	//    9   19:icmplt          115
		if(!sSetLayoutDirectionMethodFetched)
	//*  10   22:getstatic       #162 <Field boolean sSetLayoutDirectionMethodFetched>
	//*  11   25:ifne            72
		{
			try
			{
				sSetLayoutDirectionMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("setLayoutDirection", new Class[] {
					Integer.TYPE
				});
	//   12   28:ldc1            #21  <Class Drawable>
	//   13   30:ldc1            #163 <String "setLayoutDirection">
	//   14   32:iconst_1        
	//   15   33:anewarray       Class[]
	//   16   36:dup             
	//   17   37:iconst_0        
	//   18   38:getstatic       #167 <Field Class Integer.TYPE>
	//   19   41:aastore         
	//   20   42:invokevirtual   #90  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   21   45:putstatic       #169 <Field Method sSetLayoutDirectionMethod>
				sSetLayoutDirectionMethod.setAccessible(true);
	//   22   48:getstatic       #169 <Field Method sSetLayoutDirectionMethod>
	//   23   51:iconst_1        
	//   24   52:invokevirtual   #98  <Method void Method.setAccessible(boolean)>
			}
	//*  25   55:goto            68
			catch(NoSuchMethodException nosuchmethodexception)
	//*  26   58:astore_2        
			{
				Log.i("DrawableCompat", "Failed to retrieve setLayoutDirection(int) method", ((Throwable) (nosuchmethodexception)));
	//   27   59:ldc1            #100 <String "DrawableCompat">
	//   28   61:ldc1            #171 <String "Failed to retrieve setLayoutDirection(int) method">
	//   29   63:aload_2         
	//   30   64:invokestatic    #108 <Method int Log.i(String, String, Throwable)>
	//   31   67:pop             
			}
			sSetLayoutDirectionMethodFetched = true;
	//   32   68:iconst_1        
	//   33   69:putstatic       #162 <Field boolean sSetLayoutDirectionMethodFetched>
		}
		method = sSetLayoutDirectionMethod;
	//   34   72:getstatic       #169 <Field Method sSetLayoutDirectionMethod>
	//   35   75:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_113;
	//   36   76:aload_2         
	//   37   77:ifnull          113
		method.invoke(((Object) (drawable)), new Object[] {
			Integer.valueOf(i)
		});
	//   38   80:aload_2         
	//   39   81:aload_0         
	//   40   82:iconst_1        
	//   41   83:anewarray       Object[]
	//   42   86:dup             
	//   43   87:iconst_0        
	//   44   88:iload_1         
	//   45   89:invokestatic    #175 <Method Integer Integer.valueOf(int)>
	//   46   92:aastore         
	//   47   93:invokevirtual   #112 <Method Object Method.invoke(Object, Object[])>
	//   48   96:pop             
		return true;
	//   49   97:iconst_1        
	//   50   98:ireturn         
		drawable;
	//   51   99:astore_0        
		Log.i("DrawableCompat", "Failed to invoke setLayoutDirection(int) via reflection", ((Throwable) (drawable)));
	//   52  100:ldc1            #100 <String "DrawableCompat">
	//   53  102:ldc1            #177 <String "Failed to invoke setLayoutDirection(int) via reflection">
	//   54  104:aload_0         
	//   55  105:invokestatic    #108 <Method int Log.i(String, String, Throwable)>
	//   56  108:pop             
		sSetLayoutDirectionMethod = null;
	//   57  109:aconst_null     
	//   58  110:putstatic       #169 <Field Method sSetLayoutDirectionMethod>
		return false;
	//   59  113:iconst_0        
	//   60  114:ireturn         
		return false;
	//   61  115:iconst_0        
	//   62  116:ireturn         
	}

	public static void setTint(Drawable drawable, int i)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			drawable.setTint(i);
	//    3    8:aload_0         
	//    4    9:iload_1         
	//    5   10:invokevirtual   #183 <Method void Drawable.setTint(int)>
			return;
	//    6   13:return          
		}
		if(drawable instanceof TintAwareDrawable)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #185 <Class TintAwareDrawable>
	//*   9   18:ifeq            31
			((TintAwareDrawable)drawable).setTint(i);
	//   10   21:aload_0         
	//   11   22:checkcast       #185 <Class TintAwareDrawable>
	//   12   25:iload_1         
	//   13   26:invokeinterface #186 <Method void TintAwareDrawable.setTint(int)>
	//   14   31:return          
	}

	public static void setTintList(Drawable drawable, ColorStateList colorstatelist)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			drawable.setTintList(colorstatelist);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #191 <Method void Drawable.setTintList(ColorStateList)>
			return;
	//    6   13:return          
		}
		if(drawable instanceof TintAwareDrawable)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #185 <Class TintAwareDrawable>
	//*   9   18:ifeq            31
			((TintAwareDrawable)drawable).setTintList(colorstatelist);
	//   10   21:aload_0         
	//   11   22:checkcast       #185 <Class TintAwareDrawable>
	//   12   25:aload_1         
	//   13   26:invokeinterface #192 <Method void TintAwareDrawable.setTintList(ColorStateList)>
	//   14   31:return          
	}

	public static void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
	{
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          21
	//*   2    5:icmplt          14
		{
			drawable.setTintMode(mode);
	//    3    8:aload_0         
	//    4    9:aload_1         
	//    5   10:invokevirtual   #197 <Method void Drawable.setTintMode(android.graphics.PorterDuff$Mode)>
			return;
	//    6   13:return          
		}
		if(drawable instanceof TintAwareDrawable)
	//*   7   14:aload_0         
	//*   8   15:instanceof      #185 <Class TintAwareDrawable>
	//*   9   18:ifeq            31
			((TintAwareDrawable)drawable).setTintMode(mode);
	//   10   21:aload_0         
	//   11   22:checkcast       #185 <Class TintAwareDrawable>
	//   12   25:aload_1         
	//   13   26:invokeinterface #198 <Method void TintAwareDrawable.setTintMode(android.graphics.PorterDuff$Mode)>
	//   14   31:return          
	}

	public static Drawable unwrap(Drawable drawable)
	{
		if(drawable instanceof WrappedDrawable)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #46  <Class WrappedDrawable>
	//*   2    4:ifeq            17
			return ((WrappedDrawable)drawable).getWrappedDrawable();
	//    3    7:aload_0         
	//    4    8:checkcast       #46  <Class WrappedDrawable>
	//    5   11:invokeinterface #49  <Method Drawable WrappedDrawable.getWrappedDrawable()>
	//    6   16:areturn         
		else
			return drawable;
	//    7   17:aload_0         
	//    8   18:areturn         
	}

	public static Drawable wrap(Drawable drawable)
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          10
			return drawable;
	//    3    8:aload_0         
	//    4    9:areturn         
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   5   10:getstatic       #19  <Field int android.os.Build$VERSION.SDK_INT>
	//*   6   13:bipush          21
	//*   7   15:icmplt          36
			if(!(drawable instanceof TintAwareDrawable))
	//*   8   18:aload_0         
	//*   9   19:instanceof      #185 <Class TintAwareDrawable>
	//*  10   22:ifne            34
				return ((Drawable) (new WrappedDrawableApi21(drawable)));
	//   11   25:new             #205 <Class WrappedDrawableApi21>
	//   12   28:dup             
	//   13   29:aload_0         
	//   14   30:invokespecial   #208 <Method void WrappedDrawableApi21(Drawable)>
	//   15   33:areturn         
			else
				return drawable;
	//   16   34:aload_0         
	//   17   35:areturn         
		if(!(drawable instanceof TintAwareDrawable))
	//*  18   36:aload_0         
	//*  19   37:instanceof      #185 <Class TintAwareDrawable>
	//*  20   40:ifne            52
			return ((Drawable) (new WrappedDrawableApi14(drawable)));
	//   21   43:new             #210 <Class WrappedDrawableApi14>
	//   22   46:dup             
	//   23   47:aload_0         
	//   24   48:invokespecial   #211 <Method void WrappedDrawableApi14(Drawable)>
	//   25   51:areturn         
		else
			return drawable;
	//   26   52:aload_0         
	//   27   53:areturn         
	}

	private static Method sGetLayoutDirectionMethod;
	private static boolean sGetLayoutDirectionMethodFetched;
	private static Method sSetLayoutDirectionMethod;
	private static boolean sSetLayoutDirectionMethodFetched;
}
