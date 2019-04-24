// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.graphics.drawable;

import android.graphics.drawable.Drawable;
import android.util.Log;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.graphics.drawable:
//			DrawableCompat

static class DrawableCompat$DrawableCompatApi17Impl extends DrawableCompat.DrawableCompatBaseImpl
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

	DrawableCompat$DrawableCompatApi17Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #24  <Method void DrawableCompat$DrawableCompatBaseImpl()>
	//    2    4:return          
	}
}
