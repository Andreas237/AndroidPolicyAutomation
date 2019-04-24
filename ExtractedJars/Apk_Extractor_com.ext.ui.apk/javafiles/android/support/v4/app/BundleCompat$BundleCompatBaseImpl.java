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
	//*   0    0:getstatic       #33  <Field boolean sGetIBinderMethodFetched>
	//*   1    3:ifne            36
		{
			try
			{
				sGetIBinderMethod = ((Class) (android/os/Bundle)).getMethod("getIBinder", new Class[] {
					java/lang/String
				});
	//    2    6:ldc1            #35  <Class Bundle>
	//    3    8:ldc1            #37  <String "getIBinder">
	//    4   10:iconst_1        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #41  <Class String>
	//    9   18:aastore         
	//   10   19:invokevirtual   #45  <Method Method Class.getMethod(String, Class[])>
	//   11   22:putstatic       #47  <Field Method sGetIBinderMethod>
				sGetIBinderMethod.setAccessible(true);
	//   12   25:getstatic       #47  <Field Method sGetIBinderMethod>
	//   13   28:iconst_1        
	//   14   29:invokevirtual   #53  <Method void Method.setAccessible(boolean)>
			}
	//*  15   32:iconst_1        
	//*  16   33:putstatic       #33  <Field boolean sGetIBinderMethodFetched>
	//*  17   36:getstatic       #47  <Field Method sGetIBinderMethod>
	//*  18   39:ifnull          90
	//*  19   42:getstatic       #47  <Field Method sGetIBinderMethod>
	//*  20   45:aload_0         
	//*  21   46:iconst_1        
	//*  22   47:anewarray       Object[]
	//*  23   50:dup             
	//*  24   51:iconst_0        
	//*  25   52:aload_1         
	//*  26   53:aastore         
	//*  27   54:invokevirtual   #57  <Method Object Method.invoke(Object, Object[])>
	//*  28   57:checkcast       #59  <Class IBinder>
	//*  29   60:astore_0        
	//*  30   61:aload_0         
	//*  31   62:areturn         
			catch(NoSuchMethodException nosuchmethodexception)
	//*  32   63:astore_2        
			{
				Log.i("BundleCompatBaseImpl", "Failed to retrieve getIBinder method", ((Throwable) (nosuchmethodexception)));
	//   33   64:ldc1            #10  <String "BundleCompatBaseImpl">
	//   34   66:ldc1            #61  <String "Failed to retrieve getIBinder method">
	//   35   68:aload_2         
	//   36   69:invokestatic    #67  <Method int Log.i(String, String, Throwable)>
	//   37   72:pop             
			}
			sGetIBinderMethodFetched = true;
		}
		if(sGetIBinderMethod == null) goto _L2; else goto _L1
_L1:
		bundle = ((Bundle) ((IBinder)sGetIBinderMethod.invoke(((Object) (bundle)), new Object[] {
			s
		})));
		return ((IBinder) (bundle));
	//*  38   73:goto            32
		bundle;
	//   39   76:astore_0        
_L4:
		Log.i("BundleCompatBaseImpl", "Failed to invoke getIBinder via reflection", ((Throwable) (bundle)));
	//   40   77:ldc1            #10  <String "BundleCompatBaseImpl">
	//   41   79:ldc1            #69  <String "Failed to invoke getIBinder via reflection">
	//   42   81:aload_0         
	//   43   82:invokestatic    #67  <Method int Log.i(String, String, Throwable)>
	//   44   85:pop             
		sGetIBinderMethod = null;
	//   45   86:aconst_null     
	//   46   87:putstatic       #47  <Field Method sGetIBinderMethod>
_L2:
		return null;
	//   47   90:aconst_null     
	//   48   91:areturn         
		bundle;
	//   49   92:astore_0        
		continue; /* Loop/switch isn't completed */
	//   50   93:goto            77
		bundle;
	//   51   96:astore_0        
		if(true) goto _L4; else goto _L3
_L3:
	//*  52   97:goto            77
	}

	public static void putBinder(Bundle bundle, String s, IBinder ibinder)
	{
		if(!sPutIBinderMethodFetched)
	//*   0    0:getstatic       #73  <Field boolean sPutIBinderMethodFetched>
	//*   1    3:ifne            41
		{
			try
			{
				sPutIBinderMethod = ((Class) (android/os/Bundle)).getMethod("putIBinder", new Class[] {
					java/lang/String, android/os/IBinder
				});
	//    2    6:ldc1            #35  <Class Bundle>
	//    3    8:ldc1            #75  <String "putIBinder">
	//    4   10:iconst_2        
	//    5   11:anewarray       Class[]
	//    6   14:dup             
	//    7   15:iconst_0        
	//    8   16:ldc1            #41  <Class String>
	//    9   18:aastore         
	//   10   19:dup             
	//   11   20:iconst_1        
	//   12   21:ldc1            #59  <Class IBinder>
	//   13   23:aastore         
	//   14   24:invokevirtual   #45  <Method Method Class.getMethod(String, Class[])>
	//   15   27:putstatic       #77  <Field Method sPutIBinderMethod>
				sPutIBinderMethod.setAccessible(true);
	//   16   30:getstatic       #77  <Field Method sPutIBinderMethod>
	//   17   33:iconst_1        
	//   18   34:invokevirtual   #53  <Method void Method.setAccessible(boolean)>
			}
	//*  19   37:iconst_1        
	//*  20   38:putstatic       #73  <Field boolean sPutIBinderMethodFetched>
	//*  21   41:getstatic       #77  <Field Method sPutIBinderMethod>
	//*  22   44:ifnull          67
	//*  23   47:getstatic       #77  <Field Method sPutIBinderMethod>
	//*  24   50:aload_0         
	//*  25   51:iconst_2        
	//*  26   52:anewarray       Object[]
	//*  27   55:dup             
	//*  28   56:iconst_0        
	//*  29   57:aload_1         
	//*  30   58:aastore         
	//*  31   59:dup             
	//*  32   60:iconst_1        
	//*  33   61:aload_2         
	//*  34   62:aastore         
	//*  35   63:invokevirtual   #57  <Method Object Method.invoke(Object, Object[])>
	//*  36   66:pop             
	//*  37   67:return          
			catch(NoSuchMethodException nosuchmethodexception)
	//*  38   68:astore_3        
			{
				Log.i("BundleCompatBaseImpl", "Failed to retrieve putIBinder method", ((Throwable) (nosuchmethodexception)));
	//   39   69:ldc1            #10  <String "BundleCompatBaseImpl">
	//   40   71:ldc1            #79  <String "Failed to retrieve putIBinder method">
	//   41   73:aload_3         
	//   42   74:invokestatic    #67  <Method int Log.i(String, String, Throwable)>
	//   43   77:pop             
			}
			sPutIBinderMethodFetched = true;
		}
		if(sPutIBinderMethod == null)
			break MISSING_BLOCK_LABEL_67;
		sPutIBinderMethod.invoke(((Object) (bundle)), new Object[] {
			s, ibinder
		});
		return;
	//*  44   78:goto            37
		bundle;
	//   45   81:astore_0        
_L2:
		Log.i("BundleCompatBaseImpl", "Failed to invoke putIBinder via reflection", ((Throwable) (bundle)));
	//   46   82:ldc1            #10  <String "BundleCompatBaseImpl">
	//   47   84:ldc1            #81  <String "Failed to invoke putIBinder via reflection">
	//   48   86:aload_0         
	//   49   87:invokestatic    #67  <Method int Log.i(String, String, Throwable)>
	//   50   90:pop             
		sPutIBinderMethod = null;
	//   51   91:aconst_null     
	//   52   92:putstatic       #77  <Field Method sPutIBinderMethod>
		return;
	//   53   95:return          
		bundle;
	//   54   96:astore_0        
		continue; /* Loop/switch isn't completed */
	//   55   97:goto            82
		bundle;
	//   56  100:astore_0        
		if(true) goto _L2; else goto _L1
_L1:
	//*  57  101:goto            82
	}

	private static final String TAG = "BundleCompatBaseImpl";
	private static Method sGetIBinderMethod;
	private static boolean sGetIBinderMethodFetched;
	private static Method sPutIBinderMethod;
	private static boolean sPutIBinderMethodFetched;

	BundleCompat$BundleCompatBaseImpl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
	//    2    4:return          
	}
}
