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
//			DrawableWrapper, TintAwareDrawable, DrawableWrapperApi14, DrawableWrapperApi19, 
//			DrawableWrapperApi21

public final class DrawableCompat
{
	static class DrawableCompatApi17Impl extends DrawableCompatBaseImpl
	{

		public int getLayoutDirection(Drawable drawable)
		{
			if(!sGetLayoutDirectionMethodFetched)
		//*   0    0:getstatic       #33  <Field boolean sGetLayoutDirectionMethodFetched>
		//*   1    3:ifne            31
			{
				int i;
				try
				{
					sGetLayoutDirectionMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("getLayoutDirection", new Class[0]);
		//    2    6:ldc1            #35  <Class Drawable>
		//    3    8:ldc1            #36  <String "getLayoutDirection">
		//    4   10:iconst_0        
		//    5   11:anewarray       Class[]
		//    6   14:invokevirtual   #42  <Method Method Class.getDeclaredMethod(String, Class[])>
		//    7   17:putstatic       #44  <Field Method sGetLayoutDirectionMethod>
					sGetLayoutDirectionMethod.setAccessible(true);
		//    8   20:getstatic       #44  <Field Method sGetLayoutDirectionMethod>
		//    9   23:iconst_1        
		//   10   24:invokevirtual   #50  <Method void Method.setAccessible(boolean)>
				}
		//*  11   27:iconst_1        
		//*  12   28:putstatic       #33  <Field boolean sGetLayoutDirectionMethodFetched>
		//*  13   31:getstatic       #44  <Field Method sGetLayoutDirectionMethod>
		//*  14   34:ifnull          84
		//*  15   37:getstatic       #44  <Field Method sGetLayoutDirectionMethod>
		//*  16   40:aload_1         
		//*  17   41:iconst_0        
		//*  18   42:anewarray       Object[]
		//*  19   45:invokevirtual   #56  <Method Object Method.invoke(Object, Object[])>
		//*  20   48:checkcast       #58  <Class Integer>
		//*  21   51:invokevirtual   #62  <Method int Integer.intValue()>
		//*  22   54:istore_2        
		//*  23   55:iload_2         
		//*  24   56:ireturn         
				catch(NoSuchMethodException nosuchmethodexception)
		//*  25   57:astore_3        
				{
					Log.i("DrawableCompatApi17", "Failed to retrieve getLayoutDirection() method", ((Throwable) (nosuchmethodexception)));
		//   26   58:ldc1            #14  <String "DrawableCompatApi17">
		//   27   60:ldc1            #64  <String "Failed to retrieve getLayoutDirection() method">
		//   28   62:aload_3         
		//   29   63:invokestatic    #70  <Method int Log.i(String, String, Throwable)>
		//   30   66:pop             
				}
				sGetLayoutDirectionMethodFetched = true;
			}
			if(sGetLayoutDirectionMethod == null)
				break MISSING_BLOCK_LABEL_84;
			i = ((Integer)sGetLayoutDirectionMethod.invoke(((Object) (drawable)), new Object[0])).intValue();
			return i;
		//*  31   67:goto            27
			drawable;
		//   32   70:astore_1        
			Log.i("DrawableCompatApi17", "Failed to invoke getLayoutDirection() via reflection", ((Throwable) (drawable)));
		//   33   71:ldc1            #14  <String "DrawableCompatApi17">
		//   34   73:ldc1            #72  <String "Failed to invoke getLayoutDirection() via reflection">
		//   35   75:aload_1         
		//   36   76:invokestatic    #70  <Method int Log.i(String, String, Throwable)>
		//   37   79:pop             
			sGetLayoutDirectionMethod = null;
		//   38   80:aconst_null     
		//   39   81:putstatic       #44  <Field Method sGetLayoutDirectionMethod>
			return 0;
		//   40   84:iconst_0        
		//   41   85:ireturn         
		}

		public boolean setLayoutDirection(Drawable drawable, int i)
		{
			if(!sSetLayoutDirectionMethodFetched)
		//*   0    0:getstatic       #76  <Field boolean sSetLayoutDirectionMethodFetched>
		//*   1    3:ifne            37
			{
				try
				{
					sSetLayoutDirectionMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("setLayoutDirection", new Class[] {
						Integer.TYPE
					});
		//    2    6:ldc1            #35  <Class Drawable>
		//    3    8:ldc1            #77  <String "setLayoutDirection">
		//    4   10:iconst_1        
		//    5   11:anewarray       Class[]
		//    6   14:dup             
		//    7   15:iconst_0        
		//    8   16:getstatic       #81  <Field Class Integer.TYPE>
		//    9   19:aastore         
		//   10   20:invokevirtual   #42  <Method Method Class.getDeclaredMethod(String, Class[])>
		//   11   23:putstatic       #83  <Field Method sSetLayoutDirectionMethod>
					sSetLayoutDirectionMethod.setAccessible(true);
		//   12   26:getstatic       #83  <Field Method sSetLayoutDirectionMethod>
		//   13   29:iconst_1        
		//   14   30:invokevirtual   #50  <Method void Method.setAccessible(boolean)>
				}
		//*  15   33:iconst_1        
		//*  16   34:putstatic       #76  <Field boolean sSetLayoutDirectionMethodFetched>
		//*  17   37:getstatic       #83  <Field Method sSetLayoutDirectionMethod>
		//*  18   40:ifnull          91
		//*  19   43:getstatic       #83  <Field Method sSetLayoutDirectionMethod>
		//*  20   46:aload_1         
		//*  21   47:iconst_1        
		//*  22   48:anewarray       Object[]
		//*  23   51:dup             
		//*  24   52:iconst_0        
		//*  25   53:iload_2         
		//*  26   54:invokestatic    #87  <Method Integer Integer.valueOf(int)>
		//*  27   57:aastore         
		//*  28   58:invokevirtual   #56  <Method Object Method.invoke(Object, Object[])>
		//*  29   61:pop             
		//*  30   62:iconst_1        
		//*  31   63:ireturn         
				catch(NoSuchMethodException nosuchmethodexception)
		//*  32   64:astore_3        
				{
					Log.i("DrawableCompatApi17", "Failed to retrieve setLayoutDirection(int) method", ((Throwable) (nosuchmethodexception)));
		//   33   65:ldc1            #14  <String "DrawableCompatApi17">
		//   34   67:ldc1            #89  <String "Failed to retrieve setLayoutDirection(int) method">
		//   35   69:aload_3         
		//   36   70:invokestatic    #70  <Method int Log.i(String, String, Throwable)>
		//   37   73:pop             
				}
				sSetLayoutDirectionMethodFetched = true;
			}
			if(sSetLayoutDirectionMethod == null)
				break MISSING_BLOCK_LABEL_91;
			sSetLayoutDirectionMethod.invoke(((Object) (drawable)), new Object[] {
				Integer.valueOf(i)
			});
			return true;
		//*  38   74:goto            33
			drawable;
		//   39   77:astore_1        
			Log.i("DrawableCompatApi17", "Failed to invoke setLayoutDirection(int) via reflection", ((Throwable) (drawable)));
		//   40   78:ldc1            #14  <String "DrawableCompatApi17">
		//   41   80:ldc1            #91  <String "Failed to invoke setLayoutDirection(int) via reflection">
		//   42   82:aload_1         
		//   43   83:invokestatic    #70  <Method int Log.i(String, String, Throwable)>
		//   44   86:pop             
			sSetLayoutDirectionMethod = null;
		//   45   87:aconst_null     
		//   46   88:putstatic       #83  <Field Method sSetLayoutDirectionMethod>
			return false;
		//   47   91:iconst_0        
		//   48   92:ireturn         
		}

		private static final String TAG = "DrawableCompatApi17";
		private static Method sGetLayoutDirectionMethod;
		private static boolean sGetLayoutDirectionMethodFetched;
		private static Method sSetLayoutDirectionMethod;
		private static boolean sSetLayoutDirectionMethodFetched;

		DrawableCompatApi17Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void DrawableCompat$DrawableCompatBaseImpl()>
		//    2    4:return          
		}
	}

	static class DrawableCompatApi19Impl extends DrawableCompatApi17Impl
	{

		public int getAlpha(Drawable drawable)
		{
			return drawable.getAlpha();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method int Drawable.getAlpha()>
		//    2    4:ireturn         
		}

		public boolean isAutoMirrored(Drawable drawable)
		{
			return drawable.isAutoMirrored();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method boolean Drawable.isAutoMirrored()>
		//    2    4:ireturn         
		}

		public void setAutoMirrored(Drawable drawable, boolean flag)
		{
			drawable.setAutoMirrored(flag);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #32  <Method void Drawable.setAutoMirrored(boolean)>
		//    3    5:return          
		}

		public Drawable wrap(Drawable drawable)
		{
			Object obj = ((Object) (drawable));
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(!(drawable instanceof TintAwareDrawable))
		//*   2    2:aload_1         
		//*   3    3:instanceof      #36  <Class TintAwareDrawable>
		//*   4    6:ifne            18
				obj = ((Object) (new DrawableWrapperApi19(drawable)));
		//    5    9:new             #38  <Class DrawableWrapperApi19>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:invokespecial   #41  <Method void DrawableWrapperApi19(Drawable)>
		//    9   17:astore_2        
			return ((Drawable) (obj));
		//   10   18:aload_2         
		//   11   19:areturn         
		}

		DrawableCompatApi19Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void DrawableCompat$DrawableCompatApi17Impl()>
		//    2    4:return          
		}
	}

	static class DrawableCompatApi21Impl extends DrawableCompatApi19Impl
	{

		public void applyTheme(Drawable drawable, android.content.res.Resources.Theme theme)
		{
			drawable.applyTheme(theme);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #22  <Method void Drawable.applyTheme(android.content.res.Resources$Theme)>
		//    3    5:return          
		}

		public boolean canApplyTheme(Drawable drawable)
		{
			return drawable.canApplyTheme();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #27  <Method boolean Drawable.canApplyTheme()>
		//    2    4:ireturn         
		}

		public void clearColorFilter(Drawable drawable)
		{
			drawable.clearColorFilter();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #31  <Method void Drawable.clearColorFilter()>
			if(!(drawable instanceof InsetDrawable)) goto _L2; else goto _L1
		//    2    4:aload_1         
		//    3    5:instanceof      #33  <Class InsetDrawable>
		//    4    8:ifeq            23
_L1:
			clearColorFilter(((InsetDrawable)drawable).getDrawable());
		//    5   11:aload_0         
		//    6   12:aload_1         
		//    7   13:checkcast       #33  <Class InsetDrawable>
		//    8   16:invokevirtual   #37  <Method Drawable InsetDrawable.getDrawable()>
		//    9   19:invokevirtual   #39  <Method void clearColorFilter(Drawable)>
_L4:
			return;
		//   10   22:return          
_L2:
			if(drawable instanceof DrawableWrapper)
		//*  11   23:aload_1         
		//*  12   24:instanceof      #41  <Class DrawableWrapper>
		//*  13   27:ifeq            44
			{
				clearColorFilter(((DrawableWrapper)drawable).getWrappedDrawable());
		//   14   30:aload_0         
		//   15   31:aload_1         
		//   16   32:checkcast       #41  <Class DrawableWrapper>
		//   17   35:invokeinterface #44  <Method Drawable DrawableWrapper.getWrappedDrawable()>
		//   18   40:invokevirtual   #39  <Method void clearColorFilter(Drawable)>
				return;
		//   19   43:return          
			}
			if(drawable instanceof DrawableContainer)
		//*  20   44:aload_1         
		//*  21   45:instanceof      #46  <Class DrawableContainer>
		//*  22   48:ifeq            22
			{
				drawable = ((Drawable) ((android.graphics.drawable.DrawableContainer.DrawableContainerState)((DrawableContainer)drawable).getConstantState()));
		//   23   51:aload_1         
		//   24   52:checkcast       #46  <Class DrawableContainer>
		//   25   55:invokevirtual   #50  <Method android.graphics.drawable.Drawable$ConstantState DrawableContainer.getConstantState()>
		//   26   58:checkcast       #52  <Class android.graphics.drawable.DrawableContainer$DrawableContainerState>
		//   27   61:astore_1        
				if(drawable != null)
		//*  28   62:aload_1         
		//*  29   63:ifnull          22
				{
					int i = 0;
		//   30   66:iconst_0        
		//   31   67:istore_2        
					int j = ((android.graphics.drawable.DrawableContainer.DrawableContainerState) (drawable)).getChildCount();
		//   32   68:aload_1         
		//   33   69:invokevirtual   #56  <Method int android.graphics.drawable.DrawableContainer$DrawableContainerState.getChildCount()>
		//   34   72:istore_3        
					while(i < j) 
		//*  35   73:iload_2         
		//*  36   74:iload_3         
		//*  37   75:icmpge          22
					{
						Drawable drawable1 = ((android.graphics.drawable.DrawableContainer.DrawableContainerState) (drawable)).getChild(i);
		//   38   78:aload_1         
		//   39   79:iload_2         
		//   40   80:invokevirtual   #60  <Method Drawable android.graphics.drawable.DrawableContainer$DrawableContainerState.getChild(int)>
		//   41   83:astore          4
						if(drawable1 != null)
		//*  42   85:aload           4
		//*  43   87:ifnull          96
							clearColorFilter(drawable1);
		//   44   90:aload_0         
		//   45   91:aload           4
		//   46   93:invokevirtual   #39  <Method void clearColorFilter(Drawable)>
						i++;
		//   47   96:iload_2         
		//   48   97:iconst_1        
		//   49   98:iadd            
		//   50   99:istore_2        
					}
				}
			}
			if(true) goto _L4; else goto _L3
		//   51  100:goto            73
_L3:
		}

		public ColorFilter getColorFilter(Drawable drawable)
		{
			return drawable.getColorFilter();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #65  <Method ColorFilter Drawable.getColorFilter()>
		//    2    4:areturn         
		}

		public void inflate(Drawable drawable, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
			throws IOException, XmlPullParserException
		{
			drawable.inflate(resources, xmlpullparser, attributeset, theme);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:aload           5
		//    5    7:invokevirtual   #74  <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
		//    6   10:return          
		}

		public void setHotspot(Drawable drawable, float f, float f1)
		{
			drawable.setHotspot(f, f1);
		//    0    0:aload_1         
		//    1    1:fload_2         
		//    2    2:fload_3         
		//    3    3:invokevirtual   #80  <Method void Drawable.setHotspot(float, float)>
		//    4    6:return          
		}

		public void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
		{
			drawable.setHotspotBounds(i, j, k, l);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:iload_3         
		//    3    3:iload           4
		//    4    5:iload           5
		//    5    7:invokevirtual   #85  <Method void Drawable.setHotspotBounds(int, int, int, int)>
		//    6   10:return          
		}

		public void setTint(Drawable drawable, int i)
		{
			drawable.setTint(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #90  <Method void Drawable.setTint(int)>
		//    3    5:return          
		}

		public void setTintList(Drawable drawable, ColorStateList colorstatelist)
		{
			drawable.setTintList(colorstatelist);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #95  <Method void Drawable.setTintList(ColorStateList)>
		//    3    5:return          
		}

		public void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
		{
			drawable.setTintMode(mode);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:invokevirtual   #100 <Method void Drawable.setTintMode(android.graphics.PorterDuff$Mode)>
		//    3    5:return          
		}

		public Drawable wrap(Drawable drawable)
		{
			Object obj = ((Object) (drawable));
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(!(drawable instanceof TintAwareDrawable))
		//*   2    2:aload_1         
		//*   3    3:instanceof      #104 <Class TintAwareDrawable>
		//*   4    6:ifne            18
				obj = ((Object) (new DrawableWrapperApi21(drawable)));
		//    5    9:new             #106 <Class DrawableWrapperApi21>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:invokespecial   #108 <Method void DrawableWrapperApi21(Drawable)>
		//    9   17:astore_2        
			return ((Drawable) (obj));
		//   10   18:aload_2         
		//   11   19:areturn         
		}

		DrawableCompatApi21Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void DrawableCompat$DrawableCompatApi19Impl()>
		//    2    4:return          
		}
	}

	static class DrawableCompatApi23Impl extends DrawableCompatApi21Impl
	{

		public void clearColorFilter(Drawable drawable)
		{
			drawable.clearColorFilter();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #21  <Method void Drawable.clearColorFilter()>
		//    2    4:return          
		}

		public int getLayoutDirection(Drawable drawable)
		{
			return drawable.getLayoutDirection();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #26  <Method int Drawable.getLayoutDirection()>
		//    2    4:ireturn         
		}

		public boolean setLayoutDirection(Drawable drawable, int i)
		{
			return drawable.setLayoutDirection(i);
		//    0    0:aload_1         
		//    1    1:iload_2         
		//    2    2:invokevirtual   #31  <Method boolean Drawable.setLayoutDirection(int)>
		//    3    5:ireturn         
		}

		public Drawable wrap(Drawable drawable)
		{
			return drawable;
		//    0    0:aload_1         
		//    1    1:areturn         
		}

		DrawableCompatApi23Impl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #14  <Method void DrawableCompat$DrawableCompatApi21Impl()>
		//    2    4:return          
		}
	}

	static class DrawableCompatBaseImpl
	{

		public void applyTheme(Drawable drawable, android.content.res.Resources.Theme theme)
		{
		//    0    0:return          
		}

		public boolean canApplyTheme(Drawable drawable)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void clearColorFilter(Drawable drawable)
		{
			drawable.clearColorFilter();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #22  <Method void Drawable.clearColorFilter()>
		//    2    4:return          
		}

		public int getAlpha(Drawable drawable)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public ColorFilter getColorFilter(Drawable drawable)
		{
			return null;
		//    0    0:aconst_null     
		//    1    1:areturn         
		}

		public int getLayoutDirection(Drawable drawable)
		{
			return 0;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void inflate(Drawable drawable, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
			throws IOException, XmlPullParserException
		{
			drawable.inflate(resources, xmlpullparser, attributeset);
		//    0    0:aload_1         
		//    1    1:aload_2         
		//    2    2:aload_3         
		//    3    3:aload           4
		//    4    5:invokevirtual   #36  <Method void Drawable.inflate(Resources, XmlPullParser, AttributeSet)>
		//    5    8:return          
		}

		public boolean isAutoMirrored(Drawable drawable)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void jumpToCurrentState(Drawable drawable)
		{
			drawable.jumpToCurrentState();
		//    0    0:aload_1         
		//    1    1:invokevirtual   #41  <Method void Drawable.jumpToCurrentState()>
		//    2    4:return          
		}

		public void setAutoMirrored(Drawable drawable, boolean flag)
		{
		//    0    0:return          
		}

		public void setHotspot(Drawable drawable, float f, float f1)
		{
		//    0    0:return          
		}

		public void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
		{
		//    0    0:return          
		}

		public boolean setLayoutDirection(Drawable drawable, int i)
		{
			return false;
		//    0    0:iconst_0        
		//    1    1:ireturn         
		}

		public void setTint(Drawable drawable, int i)
		{
			if(drawable instanceof TintAwareDrawable)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #53  <Class TintAwareDrawable>
		//*   2    4:ifeq            17
				((TintAwareDrawable)drawable).setTint(i);
		//    3    7:aload_1         
		//    4    8:checkcast       #53  <Class TintAwareDrawable>
		//    5   11:iload_2         
		//    6   12:invokeinterface #56  <Method void TintAwareDrawable.setTint(int)>
		//    7   17:return          
		}

		public void setTintList(Drawable drawable, ColorStateList colorstatelist)
		{
			if(drawable instanceof TintAwareDrawable)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #53  <Class TintAwareDrawable>
		//*   2    4:ifeq            17
				((TintAwareDrawable)drawable).setTintList(colorstatelist);
		//    3    7:aload_1         
		//    4    8:checkcast       #53  <Class TintAwareDrawable>
		//    5   11:aload_2         
		//    6   12:invokeinterface #61  <Method void TintAwareDrawable.setTintList(ColorStateList)>
		//    7   17:return          
		}

		public void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
		{
			if(drawable instanceof TintAwareDrawable)
		//*   0    0:aload_1         
		//*   1    1:instanceof      #53  <Class TintAwareDrawable>
		//*   2    4:ifeq            17
				((TintAwareDrawable)drawable).setTintMode(mode);
		//    3    7:aload_1         
		//    4    8:checkcast       #53  <Class TintAwareDrawable>
		//    5   11:aload_2         
		//    6   12:invokeinterface #66  <Method void TintAwareDrawable.setTintMode(android.graphics.PorterDuff$Mode)>
		//    7   17:return          
		}

		public Drawable wrap(Drawable drawable)
		{
			Object obj = ((Object) (drawable));
		//    0    0:aload_1         
		//    1    1:astore_2        
			if(!(drawable instanceof TintAwareDrawable))
		//*   2    2:aload_1         
		//*   3    3:instanceof      #53  <Class TintAwareDrawable>
		//*   4    6:ifne            18
				obj = ((Object) (new DrawableWrapperApi14(drawable)));
		//    5    9:new             #70  <Class DrawableWrapperApi14>
		//    6   12:dup             
		//    7   13:aload_1         
		//    8   14:invokespecial   #72  <Method void DrawableWrapperApi14(Drawable)>
		//    9   17:astore_2        
			return ((Drawable) (obj));
		//   10   18:aload_2         
		//   11   19:areturn         
		}

		DrawableCompatBaseImpl()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Object()>
		//    2    4:return          
		}
	}


	private DrawableCompat()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void Object()>
	//    2    4:return          
	}

	public static void applyTheme(Drawable drawable, android.content.res.Resources.Theme theme)
	{
		IMPL.applyTheme(drawable, theme);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #45  <Method void DrawableCompat$DrawableCompatBaseImpl.applyTheme(Drawable, android.content.res.Resources$Theme)>
	//    4    8:return          
	}

	public static boolean canApplyTheme(Drawable drawable)
	{
		return IMPL.canApplyTheme(drawable);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #50  <Method boolean DrawableCompat$DrawableCompatBaseImpl.canApplyTheme(Drawable)>
	//    3    7:ireturn         
	}

	public static void clearColorFilter(Drawable drawable)
	{
		IMPL.clearColorFilter(drawable);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #54  <Method void DrawableCompat$DrawableCompatBaseImpl.clearColorFilter(Drawable)>
	//    3    7:return          
	}

	public static int getAlpha(Drawable drawable)
	{
		return IMPL.getAlpha(drawable);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #58  <Method int DrawableCompat$DrawableCompatBaseImpl.getAlpha(Drawable)>
	//    3    7:ireturn         
	}

	public static ColorFilter getColorFilter(Drawable drawable)
	{
		return IMPL.getColorFilter(drawable);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #62  <Method ColorFilter DrawableCompat$DrawableCompatBaseImpl.getColorFilter(Drawable)>
	//    3    7:areturn         
	}

	public static int getLayoutDirection(Drawable drawable)
	{
		return IMPL.getLayoutDirection(drawable);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #65  <Method int DrawableCompat$DrawableCompatBaseImpl.getLayoutDirection(Drawable)>
	//    3    7:ireturn         
	}

	public static void inflate(Drawable drawable, Resources resources, XmlPullParser xmlpullparser, AttributeSet attributeset, android.content.res.Resources.Theme theme)
		throws XmlPullParserException, IOException
	{
		IMPL.inflate(drawable, resources, xmlpullparser, attributeset, theme);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #74  <Method void DrawableCompat$DrawableCompatBaseImpl.inflate(Drawable, Resources, XmlPullParser, AttributeSet, android.content.res.Resources$Theme)>
	//    7   12:return          
	}

	public static boolean isAutoMirrored(Drawable drawable)
	{
		return IMPL.isAutoMirrored(drawable);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #78  <Method boolean DrawableCompat$DrawableCompatBaseImpl.isAutoMirrored(Drawable)>
	//    3    7:ireturn         
	}

	public static void jumpToCurrentState(Drawable drawable)
	{
		IMPL.jumpToCurrentState(drawable);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #81  <Method void DrawableCompat$DrawableCompatBaseImpl.jumpToCurrentState(Drawable)>
	//    3    7:return          
	}

	public static void setAutoMirrored(Drawable drawable, boolean flag)
	{
		IMPL.setAutoMirrored(drawable, flag);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #85  <Method void DrawableCompat$DrawableCompatBaseImpl.setAutoMirrored(Drawable, boolean)>
	//    4    8:return          
	}

	public static void setHotspot(Drawable drawable, float f, float f1)
	{
		IMPL.setHotspot(drawable, f, f1);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:fload_1         
	//    3    5:fload_2         
	//    4    6:invokevirtual   #89  <Method void DrawableCompat$DrawableCompatBaseImpl.setHotspot(Drawable, float, float)>
	//    5    9:return          
	}

	public static void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
	{
		IMPL.setHotspotBounds(drawable, i, j, k, l);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:iload_3         
	//    5    7:iload           4
	//    6    9:invokevirtual   #93  <Method void DrawableCompat$DrawableCompatBaseImpl.setHotspotBounds(Drawable, int, int, int, int)>
	//    7   12:return          
	}

	public static boolean setLayoutDirection(Drawable drawable, int i)
	{
		return IMPL.setLayoutDirection(drawable, i);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #97  <Method boolean DrawableCompat$DrawableCompatBaseImpl.setLayoutDirection(Drawable, int)>
	//    4    8:ireturn         
	}

	public static void setTint(Drawable drawable, int i)
	{
		IMPL.setTint(drawable, i);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:iload_1         
	//    3    5:invokevirtual   #102 <Method void DrawableCompat$DrawableCompatBaseImpl.setTint(Drawable, int)>
	//    4    8:return          
	}

	public static void setTintList(Drawable drawable, ColorStateList colorstatelist)
	{
		IMPL.setTintList(drawable, colorstatelist);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #106 <Method void DrawableCompat$DrawableCompatBaseImpl.setTintList(Drawable, ColorStateList)>
	//    4    8:return          
	}

	public static void setTintMode(Drawable drawable, android.graphics.PorterDuff.Mode mode)
	{
		IMPL.setTintMode(drawable, mode);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:aload_1         
	//    3    5:invokevirtual   #110 <Method void DrawableCompat$DrawableCompatBaseImpl.setTintMode(Drawable, android.graphics.PorterDuff$Mode)>
	//    4    8:return          
	}

	public static Drawable unwrap(Drawable drawable)
	{
		Drawable drawable1 = drawable;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(drawable instanceof DrawableWrapper)
	//*   2    2:aload_0         
	//*   3    3:instanceof      #114 <Class DrawableWrapper>
	//*   4    6:ifeq            19
			drawable1 = ((DrawableWrapper)drawable).getWrappedDrawable();
	//    5    9:aload_0         
	//    6   10:checkcast       #114 <Class DrawableWrapper>
	//    7   13:invokeinterface #118 <Method Drawable DrawableWrapper.getWrappedDrawable()>
	//    8   18:astore_1        
		return drawable1;
	//    9   19:aload_1         
	//   10   20:areturn         
	}

	public static Drawable wrap(Drawable drawable)
	{
		return IMPL.wrap(drawable);
	//    0    0:getstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #123 <Method Drawable DrawableCompat$DrawableCompatBaseImpl.wrap(Drawable)>
	//    3    7:areturn         
	}

	static final DrawableCompatBaseImpl IMPL;

	static 
	{
		if(android.os.Build.VERSION.SDK_INT >= 23)
	//*   0    0:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          23
	//*   2    5:icmplt          19
			IMPL = ((DrawableCompatBaseImpl) (new DrawableCompatApi23Impl()));
	//    3    8:new             #15  <Class DrawableCompat$DrawableCompatApi23Impl>
	//    4   11:dup             
	//    5   12:invokespecial   #32  <Method void DrawableCompat$DrawableCompatApi23Impl()>
	//    6   15:putstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//    7   18:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 21)
	//*   8   19:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*   9   22:bipush          21
	//*  10   24:icmplt          38
			IMPL = ((DrawableCompatBaseImpl) (new DrawableCompatApi21Impl()));
	//   11   27:new             #12  <Class DrawableCompat$DrawableCompatApi21Impl>
	//   12   30:dup             
	//   13   31:invokespecial   #35  <Method void DrawableCompat$DrawableCompatApi21Impl()>
	//   14   34:putstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//   15   37:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 19)
	//*  16   38:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*  17   41:bipush          19
	//*  18   43:icmplt          57
			IMPL = ((DrawableCompatBaseImpl) (new DrawableCompatApi19Impl()));
	//   19   46:new             #9   <Class DrawableCompat$DrawableCompatApi19Impl>
	//   20   49:dup             
	//   21   50:invokespecial   #36  <Method void DrawableCompat$DrawableCompatApi19Impl()>
	//   22   53:putstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//   23   56:return          
		else
		if(android.os.Build.VERSION.SDK_INT >= 17)
	//*  24   57:getstatic       #29  <Field int android.os.Build$VERSION.SDK_INT>
	//*  25   60:bipush          17
	//*  26   62:icmplt          76
			IMPL = ((DrawableCompatBaseImpl) (new DrawableCompatApi17Impl()));
	//   27   65:new             #6   <Class DrawableCompat$DrawableCompatApi17Impl>
	//   28   68:dup             
	//   29   69:invokespecial   #37  <Method void DrawableCompat$DrawableCompatApi17Impl()>
	//   30   72:putstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//   31   75:return          
		else
			IMPL = new DrawableCompatBaseImpl();
	//   32   76:new             #18  <Class DrawableCompat$DrawableCompatBaseImpl>
	//   33   79:dup             
	//   34   80:invokespecial   #38  <Method void DrawableCompat$DrawableCompatBaseImpl()>
	//   35   83:putstatic       #34  <Field DrawableCompat$DrawableCompatBaseImpl IMPL>
	//*  36   86:return          
	}
}
