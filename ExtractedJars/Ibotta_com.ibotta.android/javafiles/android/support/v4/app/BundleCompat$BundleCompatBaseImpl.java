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
		Method method;
		if(!sGetIBinderMethodFetched)
	//*   0    0:getstatic       #25  <Field boolean sGetIBinderMethodFetched>
	//*   1    3:ifne            49
		{
			try
			{
				sGetIBinderMethod = ((Class) (android/os/Bundle)).getMethod("getIBinder", new Class[] {
					java/lang/String
				});
	//    2    6:ldc1            #27  <Class Bundle>
	//    3    8:ldc1            #29  <String "getIBinder">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #33  <Class String>
	//    9   18:aastore         
	//   10   19:invokevirtual   #37  <Method Method Class.getMethod(String, Class[])>
	//   11   22:putstatic       #39  <Field Method sGetIBinderMethod>
				sGetIBinderMethod.setAccessible(true);
	//   12   25:getstatic       #39  <Field Method sGetIBinderMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #45  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:goto            45
			catch(NoSuchMethodException nosuchmethodexception)
	//*  16   35:astore_2        
			{
				Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", ((Throwable) (nosuchmethodexception)));
	//   17   36:ldc1            #46  <String "BundleCompatBaseImpl">
	//   18   38:ldc1            #48  <String "Failed to retrieve getIBinder method">
	//   19   40:aload_2         
	//   20   41:invokestatic    #54  <Method int Log.i(String, String, Throwable)>
	//   21   44:pop             
			}
			sGetIBinderMethodFetched = true;
	//   22   45:iconst_1        
	//   23   46:putstatic       #25  <Field boolean sGetIBinderMethodFetched>
		}
		method = sGetIBinderMethod;
	//   24   49:getstatic       #39  <Field Method sGetIBinderMethod>
	//   25   52:astore_2        
		if(method == null)
			break MISSING_BLOCK_LABEL_98;
	//   26   53:aload_2         
	//   27   54:ifnull          98
		bundle = ((Bundle) ((IBinder)method.invoke(((Object) (bundle)), new Object[] {
			s
		})));
	//   28   57:aload_2         
	//   29   58:aload_0         
	//   30   59:iconst_1        
	//   31   60:anewarray       Object[]
	//   32   63:dup             
	//   33   64:iconst_0        
	//   34   65:aload_1         
	//   35   66:aastore         
	//   36   67:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
	//   37   70:checkcast       #60  <Class IBinder>
	//   38   73:astore_0        
		return ((IBinder) (bundle));
	//   39   74:aload_0         
	//   40   75:areturn         
		bundle;
	//   41   76:astore_0        
		break MISSING_BLOCK_LABEL_85;
	//   42   77:goto            85
		bundle;
	//   43   80:astore_0        
		break MISSING_BLOCK_LABEL_85;
	//   44   81:goto            85
		bundle;
	//   45   84:astore_0        
		Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", ((Throwable) (bundle)));
	//   46   85:ldc1            #46  <String "BundleCompatBaseImpl">
	//   47   87:ldc1            #62  <String "Failed to invoke getIBinder via reflection">
	//   48   89:aload_0         
	//   49   90:invokestatic    #54  <Method int Log.i(String, String, Throwable)>
	//   50   93:pop             
		sGetIBinderMethod = null;
	//   51   94:aconst_null     
	//   52   95:putstatic       #39  <Field Method sGetIBinderMethod>
		return null;
	//   53   98:aconst_null     
	//   54   99:areturn         
	}

	public static void putBinder(Bundle bundle, String s, IBinder ibinder)
	{
		if(!sPutIBinderMethodFetched)
	//*   0    0:getstatic       #67  <Field boolean sPutIBinderMethodFetched>
	//*   1    3:ifne            54
		{
			try
			{
				sPutIBinderMethod = ((Class) (android/os/Bundle)).getMethod("putIBinder", new Class[] {
					java/lang/String, android/os/IBinder
				});
	//    2    6:ldc1            #27  <Class Bundle>
	//    3    8:ldc1            #69  <String "putIBinder">
	//    4   10:iconst_2        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #33  <Class String>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:ldc1            #60  <Class IBinder>
	//   13   23:aastore         
	//   14   24:invokevirtual   #37  <Method Method Class.getMethod(String, Class[])>
	//   15   27:putstatic       #71  <Field Method sPutIBinderMethod>
				sPutIBinderMethod.setAccessible(true);
	//   16   30:getstatic       #71  <Field Method sPutIBinderMethod>
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #45  <Method void Method.setAccessible(boolean)>
			}
	//*  19   37:goto            50
			catch(NoSuchMethodException nosuchmethodexception)
	//*  20   40:astore_3        
			{
				Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", ((Throwable) (nosuchmethodexception)));
	//   21   41:ldc1            #46  <String "BundleCompatBaseImpl">
	//   22   43:ldc1            #73  <String "Failed to retrieve putIBinder method">
	//   23   45:aload_3         
	//   24   46:invokestatic    #54  <Method int Log.i(String, String, Throwable)>
	//   25   49:pop             
			}
			sPutIBinderMethodFetched = true;
	//   26   50:iconst_1        
	//   27   51:putstatic       #67  <Field boolean sPutIBinderMethodFetched>
		}
		Method method = sPutIBinderMethod;
	//   28   54:getstatic       #71  <Field Method sPutIBinderMethod>
	//   29   57:astore_3        
		if(method != null)
	//*  30   58:aload_3         
	//*  31   59:ifnull          103
		{
			try
			{
				method.invoke(((Object) (bundle)), new Object[] {
					s, ibinder
				});
	//   32   62:aload_3         
	//   33   63:aload_0         
	//   34   64:iconst_2        
	//   35   65:anewarray       Object[]
	//   36   68:dup             
	//   37   69:iconst_0        
	//   38   70:aload_1         
	//   39   71:aastore         
	//   40   72:dup             
	//   41   73:iconst_1        
	//   42   74:aload_2         
	//   43   75:aastore         
	//   44   76:invokevirtual   #58  <Method Object Method.invoke(Object, Object[])>
	//   45   79:pop             
				return;
	//   46   80:return          
			}
	//*  47   81:astore_0        
	//*  48   82:goto            90
	//*  49   85:astore_0        
	//*  50   86:goto            90
			// Misplaced declaration of an exception variable
			catch(Bundle bundle) { }
	//   51   89:astore_0        
			// Misplaced declaration of an exception variable
			catch(Bundle bundle) { }
			// Misplaced declaration of an exception variable
			catch(Bundle bundle) { }
			Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", ((Throwable) (bundle)));
	//   52   90:ldc1            #46  <String "BundleCompatBaseImpl">
	//   53   92:ldc1            #75  <String "Failed to invoke putIBinder via reflection">
	//   54   94:aload_0         
	//   55   95:invokestatic    #54  <Method int Log.i(String, String, Throwable)>
	//   56   98:pop             
			sPutIBinderMethod = null;
	//   57   99:aconst_null     
	//   58  100:putstatic       #71  <Field Method sPutIBinderMethod>
		}
	//   59  103:return          
	}

	private static Method sGetIBinderMethod;
	private static boolean sGetIBinderMethodFetched;
	private static Method sPutIBinderMethod;
	private static boolean sPutIBinderMethodFetched;
}
