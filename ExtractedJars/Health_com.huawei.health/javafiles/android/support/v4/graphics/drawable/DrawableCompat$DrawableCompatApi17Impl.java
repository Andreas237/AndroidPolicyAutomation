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
	//*   0    0:getstatic       #34  <Field boolean sGetLayoutDirectionMethodFetched>
	//*   1    3:ifne            44
		{
			try
			{
				sGetLayoutDirectionMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("getLayoutDirection", new Class[0]);
	//    2    6:ldc1            #36  <Class Drawable>
	//    3    8:ldc1            #37  <String "getLayoutDirection">
	//    4   10:iconst_0        
	//    5   11:anewarray       Class[]
	//    6   14:invokevirtual   #43  <Method Method Class.getDeclaredMethod(String, Class[])>
	//    7   17:putstatic       #45  <Field Method sGetLayoutDirectionMethod>
				sGetLayoutDirectionMethod.setAccessible(true);
	//    8   20:getstatic       #45  <Field Method sGetLayoutDirectionMethod>
	//    9   23:iconst_1        
	//   10   24:invokevirtual   #51  <Method void Method.setAccessible(boolean)>
			}
	//*  11   27:goto            40
			catch(NoSuchMethodException nosuchmethodexception)
	//*  12   30:astore_3        
			{
				Log.i("DrawableCompatApi17", "Failed to retrieve getLayoutDirection() method", ((Throwable) (nosuchmethodexception)));
	//   13   31:ldc1            #14  <String "DrawableCompatApi17">
	//   14   33:ldc1            #53  <String "Failed to retrieve getLayoutDirection() method">
	//   15   35:aload_3         
	//   16   36:invokestatic    #59  <Method int Log.i(String, String, Throwable)>
	//   17   39:pop             
			}
			sGetLayoutDirectionMethodFetched = true;
	//   18   40:iconst_1        
	//   19   41:putstatic       #34  <Field boolean sGetLayoutDirectionMethodFetched>
		}
		if(sGetLayoutDirectionMethod == null)
			break MISSING_BLOCK_LABEL_84;
	//   20   44:getstatic       #45  <Field Method sGetLayoutDirectionMethod>
	//   21   47:ifnull          84
		int i = ((Integer)sGetLayoutDirectionMethod.invoke(((Object) (drawable)), new Object[0])).intValue();
	//   22   50:getstatic       #45  <Field Method sGetLayoutDirectionMethod>
	//   23   53:aload_1         
	//   24   54:iconst_0        
	//   25   55:anewarray       Object[]
	//   26   58:invokevirtual   #65  <Method Object Method.invoke(Object, Object[])>
	//   27   61:checkcast       #67  <Class Integer>
	//   28   64:invokevirtual   #71  <Method int Integer.intValue()>
	//   29   67:istore_2        
		return i;
	//   30   68:iload_2         
	//   31   69:ireturn         
		drawable;
	//   32   70:astore_1        
		Log.i("DrawableCompatApi17", "Failed to invoke getLayoutDirection() via reflection", ((Throwable) (drawable)));
	//   33   71:ldc1            #14  <String "DrawableCompatApi17">
	//   34   73:ldc1            #73  <String "Failed to invoke getLayoutDirection() via reflection">
	//   35   75:aload_1         
	//   36   76:invokestatic    #59  <Method int Log.i(String, String, Throwable)>
	//   37   79:pop             
		sGetLayoutDirectionMethod = null;
	//   38   80:aconst_null     
	//   39   81:putstatic       #45  <Field Method sGetLayoutDirectionMethod>
		return 0;
	//   40   84:iconst_0        
	//   41   85:ireturn         
	}

	public boolean setLayoutDirection(Drawable drawable, int i)
	{
		if(!sSetLayoutDirectionMethodFetched)
	//*   0    0:getstatic       #77  <Field boolean sSetLayoutDirectionMethodFetched>
	//*   1    3:ifne            50
		{
			try
			{
				sSetLayoutDirectionMethod = ((Class) (android/graphics/drawable/Drawable)).getDeclaredMethod("setLayoutDirection", new Class[] {
					Integer.TYPE
				});
	//    2    6:ldc1            #36  <Class Drawable>
	//    3    8:ldc1            #78  <String "setLayoutDirection">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:getstatic       #82  <Field Class Integer.TYPE>
	//    9   19:aastore         
	//   10   20:invokevirtual   #43  <Method Method Class.getDeclaredMethod(String, Class[])>
	//   11   23:putstatic       #84  <Field Method sSetLayoutDirectionMethod>
				sSetLayoutDirectionMethod.setAccessible(true);
	//   12   26:getstatic       #84  <Field Method sSetLayoutDirectionMethod>
	//   13   29:iconst_1        
	//   14   30:invokevirtual   #51  <Method void Method.setAccessible(boolean)>
			}
	//*  15   33:goto            46
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   36:astore_3        
			{
				Log.i("DrawableCompatApi17", "Failed to retrieve setLayoutDirection(int) method", ((Throwable) (nosuchmethodexception)));
	//   17   37:ldc1            #14  <String "DrawableCompatApi17">
	//   18   39:ldc1            #86  <String "Failed to retrieve setLayoutDirection(int) method">
	//   19   41:aload_3         
	//   20   42:invokestatic    #59  <Method int Log.i(String, String, Throwable)>
	//   21   45:pop             
			}
			sSetLayoutDirectionMethodFetched = true;
	//   22   46:iconst_1        
	//   23   47:putstatic       #77  <Field boolean sSetLayoutDirectionMethodFetched>
		}
		if(sSetLayoutDirectionMethod == null)
			break MISSING_BLOCK_LABEL_91;
	//   24   50:getstatic       #84  <Field Method sSetLayoutDirectionMethod>
	//   25   53:ifnull          91
		sSetLayoutDirectionMethod.invoke(((Object) (drawable)), new Object[] {
			Integer.valueOf(i)
		});
	//   26   56:getstatic       #84  <Field Method sSetLayoutDirectionMethod>
	//   27   59:aload_1         
	//   28   60:iconst_1        
	//   29   61:anewarray       Object[]
	//   30   64:dup             
	//   31   65:iconst_0        
	//   32   66:iload_2         
	//   33   67:invokestatic    #90  <Method Integer Integer.valueOf(int)>
	//   34   70:aastore         
	//   35   71:invokevirtual   #65  <Method Object Method.invoke(Object, Object[])>
	//   36   74:pop             
		return true;
	//   37   75:iconst_1        
	//   38   76:ireturn         
		drawable;
	//   39   77:astore_1        
		Log.i("DrawableCompatApi17", "Failed to invoke setLayoutDirection(int) via reflection", ((Throwable) (drawable)));
	//   40   78:ldc1            #14  <String "DrawableCompatApi17">
	//   41   80:ldc1            #92  <String "Failed to invoke setLayoutDirection(int) via reflection">
	//   42   82:aload_1         
	//   43   83:invokestatic    #59  <Method int Log.i(String, String, Throwable)>
	//   44   86:pop             
		sSetLayoutDirectionMethod = null;
	//   45   87:aconst_null     
	//   46   88:putstatic       #84  <Field Method sSetLayoutDirectionMethod>
		return false;
	//   47   91:iconst_0        
	//   48   92:ireturn         
	}

	private static final String TAG = "DrawableCompatApi17";
	private static Method sGetLayoutDirectionMethod;
	private static boolean sGetLayoutDirectionMethodFetched = false;
	private static Method sSetLayoutDirectionMethod;
	private static boolean sSetLayoutDirectionMethodFetched = false;

	DrawableCompat$DrawableCompatApi17Impl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #25  <Method void DrawableCompat$DrawableCompatBaseImpl()>
	//    2    4:return          
	}
}
