// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v4.app:
//			BundleCompat

static class BundleCompat$BundleCompatBaseImpl
{

	public static IBinder getBinder(Bundle bundle, String s)
	{
		if(!sGetIBinderMethodFetched)
	//*   0    0:getstatic       #34  <Field boolean sGetIBinderMethodFetched>
	//*   1    3:ifne            49
		{
			try
			{
				sGetIBinderMethod = ((Class) (android/os/Bundle)).getMethod("getIBinder", new Class[] {
					java/lang/String
				});
	//    2    6:ldc1            #36  <Class Bundle>
	//    3    8:ldc1            #38  <String "getIBinder">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #42  <Class String>
	//    9   18:aastore         
	//   10   19:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//   11   22:putstatic       #48  <Field Method sGetIBinderMethod>
				sGetIBinderMethod.setAccessible(true);
	//   12   25:getstatic       #48  <Field Method sGetIBinderMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #54  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_2        
			{
				Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #10  <String "BundleCompatBaseImpl">
	//   18   38:ldc1            #56  <String "Failed to retrieve getIBinder method">
	//   19   40:aload_2         
	//   20   41:invokestatic    #62  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			sGetIBinderMethodFetched = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #34  <Field boolean sGetIBinderMethodFetched>
		}
		if(sGetIBinderMethod == null)
			break MISSING_BLOCK_LABEL_90;
	//   24   49:getstatic       #48  <Field Method sGetIBinderMethod>
	//   25   52:ifnull          90
		bundle = ((Bundle) ((IBinder)sGetIBinderMethod.invoke(((Object) (bundle)), new Object[] {
			s
		})));
	//   26   55:getstatic       #48  <Field Method sGetIBinderMethod>
	//   27   58:aload_0         
	//   28   59:iconst_1        
	//   29   60:anewarray       Object[]
	//   30   63:dup             
	//   31   64:iconst_0        
	//   32   65:aload_1         
	//   33   66:aastore         
	//   34   67:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
	//   35   70:checkcast       #68  <Class IBinder>
	//   36   73:astore_0        
		return ((IBinder) (bundle));
	//   37   74:aload_0         
	//   38   75:areturn         
		bundle;
	//   39   76:astore_0        
		Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", ((Throwable) (bundle)));
	//   40   77:ldc1            #10  <String "BundleCompatBaseImpl">
	//   41   79:ldc1            #70  <String "Failed to invoke getIBinder via reflection">
	//   42   81:aload_0         
	//   43   82:invokestatic    #62  <Method int Log.i(String, String, Throwable)>
	//   44   85:pop             
		sGetIBinderMethod = null;
	//   45   86:aconst_null     
	//   46   87:putstatic       #48  <Field Method sGetIBinderMethod>
		return null;
	//   47   90:aconst_null     
	//   48   91:areturn         
	}

	public static void putBinder(Bundle bundle, String s, IBinder ibinder)
	{
		if(!sPutIBinderMethodFetched)
	//*   0    0:getstatic       #74  <Field boolean sPutIBinderMethodFetched>
	//*   1    3:ifne            54
		{
			try
			{
				sPutIBinderMethod = ((Class) (android/os/Bundle)).getMethod("putIBinder", new Class[] {
					java/lang/String, android/os/IBinder
				});
	//    2    6:ldc1            #36  <Class Bundle>
	//    3    8:ldc1            #76  <String "putIBinder">
	//    4   10:iconst_2        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #42  <Class String>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:ldc1            #68  <Class IBinder>
	//   13   23:aastore         
	//   14   24:invokevirtual   #46  <Method Method Class.getMethod(String, Class[])>
	//   15   27:putstatic       #78  <Field Method sPutIBinderMethod>
				sPutIBinderMethod.setAccessible(true);
	//   16   30:getstatic       #78  <Field Method sPutIBinderMethod>
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #54  <Method void Method.setAccessible(boolean)>
			}
	//*  19   37:goto            50
			catch(NoSuchMethodException nosuchmethodexception)
	//*  20   40:astore_3        
			{
				Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", ((Throwable) (nosuchmethodexception)));
	//   21   41:ldc1            #10  <String "BundleCompatBaseImpl">
	//   22   43:ldc1            #80  <String "Failed to retrieve putIBinder method">
	//   23   45:aload_3         
	//   24   46:invokestatic    #62  <Method int Log.i(String, String, Throwable)>
	//   25   49:pop             
			}
			sPutIBinderMethodFetched = true;
	//   26   50:iconst_1        
	//   27   51:putstatic       #74  <Field boolean sPutIBinderMethodFetched>
		}
		if(sPutIBinderMethod == null)
			break MISSING_BLOCK_LABEL_95;
	//   28   54:getstatic       #78  <Field Method sPutIBinderMethod>
	//   29   57:ifnull          95
		try
		{
			sPutIBinderMethod.invoke(((Object) (bundle)), new Object[] {
				s, ibinder
			});
	//   30   60:getstatic       #78  <Field Method sPutIBinderMethod>
	//   31   63:aload_0         
	//   32   64:iconst_2        
	//   33   65:anewarray       Object[]
	//   34   68:dup             
	//   35   69:iconst_0        
	//   36   70:aload_1         
	//   37   71:aastore         
	//   38   72:dup             
	//   39   73:iconst_1        
	//   40   74:aload_2         
	//   41   75:aastore         
	//   42   76:invokevirtual   #66  <Method Object Method.invoke(Object, Object[])>
	//   43   79:pop             
			return;
	//   44   80:return          
		}
		// Misplaced declaration of an exception variable
		catch(Bundle bundle)
	//*  45   81:astore_0        
		{
			Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", ((Throwable) (bundle)));
	//   46   82:ldc1            #10  <String "BundleCompatBaseImpl">
	//   47   84:ldc1            #82  <String "Failed to invoke putIBinder via reflection">
	//   48   86:aload_0         
	//   49   87:invokestatic    #62  <Method int Log.i(String, String, Throwable)>
	//   50   90:pop             
		}
		sPutIBinderMethod = null;
	//   51   91:aconst_null     
	//   52   92:putstatic       #78  <Field Method sPutIBinderMethod>
	//   53   95:return          
	}

	private static final String TAG = "BundleCompatBaseImpl";
	private static Method sGetIBinderMethod;
	private static boolean sGetIBinderMethodFetched = false;
	private static Method sPutIBinderMethod;
	private static boolean sPutIBinderMethodFetched = false;

	BundleCompat$BundleCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}
}
