// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.huawei.hidatamanager.hwnaturalbase;

import android.content.Context;
import com.huawei.hidatamanager.util.LogUtils;
import com.huawei.nb.client.ServiceConnectCallback;
import dalvik.system.DexClassLoader;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class NBDataSourceManager
{

	public NBDataSourceManager(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #22  <Method void Object()>
		isInitialized = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #24  <Field boolean isInitialized>
		isConnected = false;
	//    5    9:aload_0         
	//    6   10:iconst_0        
	//    7   11:putfield        #26  <Field boolean isConnected>
		classLoader = null;
	//    8   14:aload_0         
	//    9   15:aconst_null     
	//   10   16:putfield        #28  <Field ClassLoader classLoader>
		mContext = context;
	//   11   19:aload_0         
	//   12   20:aload_1         
	//   13   21:putfield        #30  <Field Context mContext>
	//   14   24:return          
	}

	private boolean checkService()
	{
		if(!isInitialized)
	//*   0    0:aload_0         
	//*   1    1:getfield        #24  <Field boolean isInitialized>
	//*   2    4:ifne            20
		{
			LogUtils.w("NBDataSourceManager ", "service is not init, do init!");
	//    3    7:ldc1            #8   <String "NBDataSourceManager ">
	//    4    9:ldc1            #37  <String "service is not init, do init!">
	//    5   11:invokestatic    #43  <Method void LogUtils.w(String, String)>
			init();
	//    6   14:aload_0         
	//    7   15:invokevirtual   #46  <Method void init()>
			return false;
	//    8   18:iconst_0        
	//    9   19:ireturn         
		}
		if(!isConnected)
	//*  10   20:aload_0         
	//*  11   21:getfield        #26  <Field boolean isConnected>
	//*  12   24:ifne            40
		{
			LogUtils.w("NBDataSourceManager ", "service is not connected, do init!");
	//   13   27:ldc1            #8   <String "NBDataSourceManager ">
	//   14   29:ldc1            #48  <String "service is not connected, do init!">
	//   15   31:invokestatic    #43  <Method void LogUtils.w(String, String)>
			connectService();
	//   16   34:aload_0         
	//   17   35:invokespecial   #51  <Method void connectService()>
			return false;
	//   18   38:iconst_0        
	//   19   39:ireturn         
		} else
		{
			return true;
	//   20   40:iconst_1        
	//   21   41:ireturn         
		}
	}

	private void connectService()
	{
		if(classLoader == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ClassLoader classLoader>
	//*   2    4:ifnonnull       15
		{
			LogUtils.e("NBDataSourceManager ", "classLoader is null");
	//    3    7:ldc1            #8   <String "NBDataSourceManager ">
	//    4    9:ldc1            #55  <String "classLoader is null">
	//    5   11:invokestatic    #58  <Method void LogUtils.e(String, String)>
			return;
	//    6   14:return          
		}
		Object obj;
		obj = ((Object) (classLoader.loadClass("com.huawei.nb.client.DataServiceProxy")));
	//    7   15:aload_0         
	//    8   16:getfield        #28  <Field ClassLoader classLoader>
	//    9   19:ldc1            #60  <String "com.huawei.nb.client.DataServiceProxy">
	//   10   21:invokevirtual   #66  <Method Class ClassLoader.loadClass(String)>
	//   11   24:astore_1        
		mDataServiceProxy = ((Class) (obj)).getConstructor(new Class[] {
			android/content/Context
		}).newInstance(new Object[] {
			mContext
		});
	//   12   25:aload_0         
	//   13   26:aload_1         
	//   14   27:iconst_1        
	//   15   28:anewarray       Class[]
	//   16   31:dup             
	//   17   32:iconst_0        
	//   18   33:ldc1            #70  <Class Context>
	//   19   35:aastore         
	//   20   36:invokevirtual   #74  <Method Constructor Class.getConstructor(Class[])>
	//   21   39:iconst_1        
	//   22   40:anewarray       Object[]
	//   23   43:dup             
	//   24   44:iconst_0        
	//   25   45:aload_0         
	//   26   46:getfield        #30  <Field Context mContext>
	//   27   49:aastore         
	//   28   50:invokevirtual   #80  <Method Object Constructor.newInstance(Object[])>
	//   29   53:putfield        #82  <Field Object mDataServiceProxy>
		obj = ((Object) (((Class) (obj)).getMethod("connect", new Class[] {
			com/huawei/nb/client/ServiceConnectCallback
		})));
	//   30   56:aload_1         
	//   31   57:ldc1            #84  <String "connect">
	//   32   59:iconst_1        
	//   33   60:anewarray       Class[]
	//   34   63:dup             
	//   35   64:iconst_0        
	//   36   65:ldc1            #86  <Class ServiceConnectCallback>
	//   37   67:aastore         
	//   38   68:invokevirtual   #90  <Method Method Class.getMethod(String, Class[])>
	//   39   71:astore_1        
		if(obj == null)
	//*  40   72:aload_1         
	//*  41   73:ifnonnull       84
		{
			try
			{
				LogUtils.e("NBDataSourceManager ", "connect is null");
	//   42   76:ldc1            #8   <String "NBDataSourceManager ">
	//   43   78:ldc1            #92  <String "connect is null">
	//   44   80:invokestatic    #58  <Method void LogUtils.e(String, String)>
				return;
	//   45   83:return          
			}
	//*  46   84:aload_1         
	//*  47   85:aload_0         
	//*  48   86:getfield        #82  <Field Object mDataServiceProxy>
	//*  49   89:iconst_1        
	//*  50   90:anewarray       Object[]
	//*  51   93:dup             
	//*  52   94:iconst_0        
	//*  53   95:new             #94  <Class NBDataSourceManager$1>
	//*  54   98:dup             
	//*  55   99:aload_0         
	//*  56  100:invokespecial   #97  <Method void NBDataSourceManager$1(NBDataSourceManager)>
	//*  57  103:aastore         
	//*  58  104:invokevirtual   #103 <Method Object Method.invoke(Object, Object[])>
	//*  59  107:pop             
	//*  60  108:return          
			catch(Exception exception)
	//*  61  109:astore_1        
			{
				LogUtils.e("NBDataSourceManager ", (new StringBuilder()).append("try to connect fail").append(((Object) (exception))).toString());
	//   62  110:ldc1            #8   <String "NBDataSourceManager ">
	//   63  112:new             #105 <Class StringBuilder>
	//   64  115:dup             
	//   65  116:invokespecial   #106 <Method void StringBuilder()>
	//   66  119:ldc1            #108 <String "try to connect fail">
	//   67  121:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   68  124:aload_1         
	//   69  125:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
	//   70  128:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   71  131:invokestatic    #58  <Method void LogUtils.e(String, String)>
			}
			break MISSING_BLOCK_LABEL_134;
		}
		((Method) (obj)).invoke(mDataServiceProxy, new Object[] {
			new _cls1()
		});
		return;
	//   72  134:return          
	}

	public void disConnect()
	{
		if(mDataServiceProxy != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #82  <Field Object mDataServiceProxy>
	//*   2    4:ifnull          45
		{
			try
			{
				mDataServiceProxy.getClass().getMethod("disconnect", new Class[0]).invoke(mDataServiceProxy, new Object[0]);
	//    3    7:aload_0         
	//    4    8:getfield        #82  <Field Object mDataServiceProxy>
	//    5   11:invokevirtual   #124 <Method Class Object.getClass()>
	//    6   14:ldc1            #126 <String "disconnect">
	//    7   16:iconst_0        
	//    8   17:anewarray       Class[]
	//    9   20:invokevirtual   #90  <Method Method Class.getMethod(String, Class[])>
	//   10   23:aload_0         
	//   11   24:getfield        #82  <Field Object mDataServiceProxy>
	//   12   27:iconst_0        
	//   13   28:anewarray       Object[]
	//   14   31:invokevirtual   #103 <Method Object Method.invoke(Object, Object[])>
	//   15   34:pop             
			}
	//*  16   35:goto            40
			catch(Exception exception)
	//*  17   38:astore_1        
			{
				return;
	//   18   39:return          
			}
			mDataServiceProxy = null;
	//   19   40:aload_0         
	//   20   41:aconst_null     
	//   21   42:putfield        #82  <Field Object mDataServiceProxy>
		}
		isInitialized = false;
	//   22   45:aload_0         
	//   23   46:iconst_0        
	//   24   47:putfield        #24  <Field boolean isInitialized>
		isConnected = false;
	//   25   50:aload_0         
	//   26   51:iconst_0        
	//   27   52:putfield        #26  <Field boolean isConnected>
	//   28   55:return          
	}

	public ClassLoader getClassLoader()
	{
		if(classLoader == null && mContext != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #28  <Field ClassLoader classLoader>
	//*   2    4:ifnonnull       36
	//*   3    7:aload_0         
	//*   4    8:getfield        #30  <Field Context mContext>
	//*   5   11:ifnull          36
			classLoader = ((ClassLoader) (new DexClassLoader("/system/framework/com.huawei.nb.sdk.jar", ((String) (null)), ((String) (null)), mContext.getClassLoader())));
	//    6   14:aload_0         
	//    7   15:new             #130 <Class DexClassLoader>
	//    8   18:dup             
	//    9   19:ldc1            #132 <String "/system/framework/com.huawei.nb.sdk.jar">
	//   10   21:aconst_null     
	//   11   22:aconst_null     
	//   12   23:aload_0         
	//   13   24:getfield        #30  <Field Context mContext>
	//   14   27:invokevirtual   #134 <Method ClassLoader Context.getClassLoader()>
	//   15   30:invokespecial   #137 <Method void DexClassLoader(String, String, String, ClassLoader)>
	//   16   33:putfield        #28  <Field ClassLoader classLoader>
		return classLoader;
	//   17   36:aload_0         
	//   18   37:getfield        #28  <Field ClassLoader classLoader>
	//   19   40:areturn         
	}

	public void init()
	{
		LogUtils.d("NBDataSourceManager ", (new StringBuilder()).append("NBDataSourceManager, init, isInitialized=").append(isInitialized).toString());
	//    0    0:ldc1            #8   <String "NBDataSourceManager ">
	//    1    2:new             #105 <Class StringBuilder>
	//    2    5:dup             
	//    3    6:invokespecial   #106 <Method void StringBuilder()>
	//    4    9:ldc1            #139 <String "NBDataSourceManager, init, isInitialized=">
	//    5   11:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//    6   14:aload_0         
	//    7   15:getfield        #24  <Field boolean isInitialized>
	//    8   18:invokevirtual   #142 <Method StringBuilder StringBuilder.append(boolean)>
	//    9   21:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   10   24:invokestatic    #145 <Method void LogUtils.d(String, String)>
		if(isInitialized)
	//*  11   27:aload_0         
	//*  12   28:getfield        #24  <Field boolean isInitialized>
	//*  13   31:ifeq            35
		{
			return;
	//   14   34:return          
		} else
		{
			getClassLoader();
	//   15   35:aload_0         
	//   16   36:invokevirtual   #146 <Method ClassLoader getClassLoader()>
	//   17   39:pop             
			LogUtils.d("NBDataSourceManager ", "NBDataSourceManager, getClassLoader");
	//   18   40:ldc1            #8   <String "NBDataSourceManager ">
	//   19   42:ldc1            #148 <String "NBDataSourceManager, getClassLoader">
	//   20   44:invokestatic    #145 <Method void LogUtils.d(String, String)>
			connectService();
	//   21   47:aload_0         
	//   22   48:invokespecial   #51  <Method void connectService()>
			LogUtils.d("NBDataSourceManager ", "NBDataSourceManager, connectService");
	//   23   51:ldc1            #8   <String "NBDataSourceManager ">
	//   24   53:ldc1            #150 <String "NBDataSourceManager, connectService">
	//   25   55:invokestatic    #145 <Method void LogUtils.d(String, String)>
			isInitialized = true;
	//   26   58:aload_0         
	//   27   59:iconst_1        
	//   28   60:putfield        #24  <Field boolean isInitialized>
			return;
	//   29   63:return          
		}
	}

	public long insert(String s, Object obj)
	{
		if(!checkService())
	//*   0    0:aload_0         
	//*   1    1:invokespecial   #154 <Method boolean checkService()>
	//*   2    4:ifne            18
		{
			LogUtils.e("NBDataSourceManager ", "service not connected!");
	//    3    7:ldc1            #8   <String "NBDataSourceManager ">
	//    4    9:ldc1            #156 <String "service not connected!">
	//    5   11:invokestatic    #58  <Method void LogUtils.e(String, String)>
			return -1L;
	//    6   14:ldc2w           #157 <Long -1L>
	//    7   17:lreturn         
		}
		if(obj == null)
	//*   8   18:aload_2         
	//*   9   19:ifnonnull       33
		{
			LogUtils.e("NBDataSourceManager ", "NBDataSource, insert, content can NOT be null.");
	//   10   22:ldc1            #8   <String "NBDataSourceManager ">
	//   11   24:ldc1            #160 <String "NBDataSource, insert, content can NOT be null.">
	//   12   26:invokestatic    #58  <Method void LogUtils.e(String, String)>
			return -1L;
	//   13   29:ldc2w           #157 <Long -1L>
	//   14   32:lreturn         
		}
		if(mDataServiceProxy == null)
	//*  15   33:aload_0         
	//*  16   34:getfield        #82  <Field Object mDataServiceProxy>
	//*  17   37:ifnonnull       51
		{
			LogUtils.w("NBDataSourceManager ", "mDataServiceProxy is null!");
	//   18   40:ldc1            #8   <String "NBDataSourceManager ">
	//   19   42:ldc1            #162 <String "mDataServiceProxy is null!">
	//   20   44:invokestatic    #43  <Method void LogUtils.w(String, String)>
			return -1L;
	//   21   47:ldc2w           #157 <Long -1L>
	//   22   50:lreturn         
		}
		try
		{
			s = ((String) (classLoader.loadClass("com.huawei.odmf.core.AManagedObject")));
	//   23   51:aload_0         
	//   24   52:getfield        #28  <Field ClassLoader classLoader>
	//   25   55:ldc1            #164 <String "com.huawei.odmf.core.AManagedObject">
	//   26   57:invokevirtual   #66  <Method Class ClassLoader.loadClass(String)>
	//   27   60:astore_1        
		}
	//*  28   61:aload_1         
	//*  29   62:ifnonnull       76
	//*  30   65:ldc1            #8   <String "NBDataSourceManager ">
	//*  31   67:ldc1            #166 <String "NBDataSource,AManagedClass is null !">
	//*  32   69:invokestatic    #58  <Method void LogUtils.e(String, String)>
	//*  33   72:ldc2w           #157 <Long -1L>
	//*  34   75:lreturn         
	//*  35   76:aload_0         
	//*  36   77:getfield        #82  <Field Object mDataServiceProxy>
	//*  37   80:invokevirtual   #124 <Method Class Object.getClass()>
	//*  38   83:ldc1            #168 <String "executeInsert">
	//*  39   85:iconst_1        
	//*  40   86:anewarray       Class[]
	//*  41   89:dup             
	//*  42   90:iconst_0        
	//*  43   91:aload_1         
	//*  44   92:aastore         
	//*  45   93:invokevirtual   #90  <Method Method Class.getMethod(String, Class[])>
	//*  46   96:astore_1        
	//*  47   97:aload_1         
	//*  48   98:ifnonnull       112
	//*  49  101:ldc1            #8   <String "NBDataSourceManager ">
	//*  50  103:ldc1            #170 <String "executeInsert is null !">
	//*  51  105:invokestatic    #58  <Method void LogUtils.e(String, String)>
	//*  52  108:ldc2w           #157 <Long -1L>
	//*  53  111:lreturn         
	//*  54  112:aload_1         
	//*  55  113:aload_0         
	//*  56  114:getfield        #82  <Field Object mDataServiceProxy>
	//*  57  117:iconst_1        
	//*  58  118:anewarray       Object[]
	//*  59  121:dup             
	//*  60  122:iconst_0        
	//*  61  123:aload_2         
	//*  62  124:aastore         
	//*  63  125:invokevirtual   #103 <Method Object Method.invoke(Object, Object[])>
	//*  64  128:ifnonnull       142
	//*  65  131:ldc1            #8   <String "NBDataSourceManager ">
	//*  66  133:ldc1            #172 <String "NBDataSource, insert, failed. inserted null !">
	//*  67  135:invokestatic    #43  <Method void LogUtils.w(String, String)>
	//*  68  138:ldc2w           #157 <Long -1L>
	//*  69  141:lreturn         
	//*  70  142:ldc1            #8   <String "NBDataSourceManager ">
	//*  71  144:ldc1            #174 <String "NBDataSource, insert success, rowId=">
	//*  72  146:invokestatic    #145 <Method void LogUtils.d(String, String)>
	//*  73  149:lconst_0        
	//*  74  150:lreturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  75  151:astore_1        
		{
			LogUtils.e("NBDataSourceManager ", (new StringBuilder()).append("try to executeInsert fail").append(((Object) (s))).toString());
	//   76  152:ldc1            #8   <String "NBDataSourceManager ">
	//   77  154:new             #105 <Class StringBuilder>
	//   78  157:dup             
	//   79  158:invokespecial   #106 <Method void StringBuilder()>
	//   80  161:ldc1            #176 <String "try to executeInsert fail">
	//   81  163:invokevirtual   #112 <Method StringBuilder StringBuilder.append(String)>
	//   82  166:aload_1         
	//   83  167:invokevirtual   #115 <Method StringBuilder StringBuilder.append(Object)>
	//   84  170:invokevirtual   #119 <Method String StringBuilder.toString()>
	//   85  173:invokestatic    #58  <Method void LogUtils.e(String, String)>
			return -1L;
	//   86  176:ldc2w           #157 <Long -1L>
	//   87  179:lreturn         
		}
		if(s != null)
			break MISSING_BLOCK_LABEL_76;
		LogUtils.e("NBDataSourceManager ", "NBDataSource,AManagedClass is null !");
		return -1L;
		s = ((String) (mDataServiceProxy.getClass().getMethod("executeInsert", new Class[] {
			s
		})));
		if(s != null)
			break MISSING_BLOCK_LABEL_112;
		LogUtils.e("NBDataSourceManager ", "executeInsert is null !");
		return -1L;
		if(((Method) (s)).invoke(mDataServiceProxy, new Object[] {
	obj
}) != null)
			break MISSING_BLOCK_LABEL_142;
		LogUtils.w("NBDataSourceManager ", "NBDataSource, insert, failed. inserted null !");
		return -1L;
		LogUtils.d("NBDataSourceManager ", "NBDataSource, insert success, rowId=");
		return 0L;
	}

	private static final String TAG = "NBDataSourceManager ";
	private ClassLoader classLoader;
	private boolean isConnected;
	private boolean isInitialized;
	private Context mContext;
	private Object mDataServiceProxy;


/*
	static boolean access$002(NBDataSourceManager nbdatasourcemanager, boolean flag)
	{
		nbdatasourcemanager.isConnected = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #26  <Field boolean isConnected>
		return flag;
	//    3    5:iload_1         
	//    4    6:ireturn         
	}

*/

	/* member class not found */
	class _cls1 {}

}
