// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.os.Bundle;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//			LoaderManagerImpl, FragmentHostCallback, FragmentManagerImpl

final class LoaderManagerImpl$LoaderInfo
	implements android.support.v4.content., android.support.v4.content.
{

	void callOnLoadFinished(Loader loader, Object obj)
	{
		if(mCallbacks == null)
			break MISSING_BLOCK_LABEL_130;
	//    0    0:aload_0         
	//    1    1:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//    2    4:ifnull          130
		String s;
		if(mHost != null)
	//*   3    7:aload_0         
	//*   4    8:getfield        #41  <Field LoaderManagerImpl this$0>
	//*   5   11:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*   6   14:ifnull          158
		{
			s = mHost.mFragmentManager.mNoTransactionsBecause;
	//    7   17:aload_0         
	//    8   18:getfield        #41  <Field LoaderManagerImpl this$0>
	//    9   21:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   10   24:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   11   27:getfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
	//   12   30:astore_3        
			mHost.mFragmentManager.mNoTransactionsBecause = "onLoadFinished";
	//   13   31:aload_0         
	//   14   32:getfield        #41  <Field LoaderManagerImpl this$0>
	//   15   35:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   16   38:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   17   41:ldc1            #73  <String "onLoadFinished">
	//   18   43:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		} else
	//*  19   46:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  20   49:ifeq            90
	//*  21   52:ldc1            #78  <String "LoaderManager">
	//*  22   54:new             #80  <Class StringBuilder>
	//*  23   57:dup             
	//*  24   58:invokespecial   #81  <Method void StringBuilder()>
	//*  25   61:ldc1            #83  <String "  onLoadFinished in ">
	//*  26   63:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  27   66:aload_1         
	//*  28   67:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//*  29   70:ldc1            #92  <String ": ">
	//*  30   72:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  31   75:aload_1         
	//*  32   76:aload_2         
	//*  33   77:invokevirtual   #98  <Method String Loader.dataToString(Object)>
	//*  34   80:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//*  35   83:invokevirtual   #102 <Method String StringBuilder.toString()>
	//*  36   86:invokestatic    #108 <Method int Log.v(String, String)>
	//*  37   89:pop             
	//*  38   90:aload_0         
	//*  39   91:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//*  40   94:aload_1         
	//*  41   95:aload_2         
	//*  42   96:invokeinterface #112 <Method void LoaderManager$LoaderCallbacks.onLoadFinished(Loader, Object)>
	//*  43  101:aload_0         
	//*  44  102:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  45  105:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  46  108:ifnull          125
	//*  47  111:aload_0         
	//*  48  112:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  49  115:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  50  118:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//*  51  121:aload_3         
	//*  52  122:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
	//*  53  125:aload_0         
	//*  54  126:iconst_1        
	//*  55  127:putfield        #114 <Field boolean mDeliveredData>
	//*  56  130:return          
	//*  57  131:astore_1        
	//*  58  132:aload_0         
	//*  59  133:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  60  136:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  61  139:ifnull          156
	//*  62  142:aload_0         
	//*  63  143:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  64  146:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  65  149:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//*  66  152:aload_3         
	//*  67  153:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
	//*  68  156:aload_1         
	//*  69  157:athrow          
		{
			s = null;
	//   70  158:aconst_null     
	//   71  159:astore_3        
		}
		if(LoaderManagerImpl.DEBUG)
			Log.v("LoaderManager", (new StringBuilder()).append("  onLoadFinished in ").append(((Object) (loader))).append(": ").append(loader.dataToString(obj)).toString());
		mCallbacks.onLoadFinished(loader, obj);
		if(mHost != null)
			mHost.mFragmentManager.mNoTransactionsBecause = s;
		mDeliveredData = true;
		return;
		loader;
		if(mHost != null)
			mHost.mFragmentManager.mNoTransactionsBecause = s;
		throw loader;
	//*  72  160:goto            46
	}

	boolean cancel()
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            31
			Log.v("LoaderManager", (new StringBuilder()).append("  Canceling: ").append(((Object) (this))).toString());
	//    2    6:ldc1            #78  <String "LoaderManager">
	//    3    8:new             #80  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #81  <Method void StringBuilder()>
	//    6   15:ldc1            #119 <String "  Canceling: ">
	//    7   17:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   10   24:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   11   27:invokestatic    #108 <Method int Log.v(String, String)>
	//   12   30:pop             
		if(mStarted && mLoader != null && mListenerRegistered)
	//*  13   31:aload_0         
	//*  14   32:getfield        #121 <Field boolean mStarted>
	//*  15   35:ifeq            74
	//*  16   38:aload_0         
	//*  17   39:getfield        #123 <Field Loader mLoader>
	//*  18   42:ifnull          74
	//*  19   45:aload_0         
	//*  20   46:getfield        #125 <Field boolean mListenerRegistered>
	//*  21   49:ifeq            74
		{
			boolean flag = mLoader.cancelLoad();
	//   22   52:aload_0         
	//   23   53:getfield        #123 <Field Loader mLoader>
	//   24   56:invokevirtual   #128 <Method boolean Loader.cancelLoad()>
	//   25   59:istore_1        
			if(!flag)
	//*  26   60:iload_1         
	//*  27   61:ifne            72
				onLoadCanceled(mLoader);
	//   28   64:aload_0         
	//   29   65:aload_0         
	//   30   66:getfield        #123 <Field Loader mLoader>
	//   31   69:invokevirtual   #132 <Method void onLoadCanceled(Loader)>
			return flag;
	//   32   72:iload_1         
	//   33   73:ireturn         
		} else
		{
			return false;
	//   34   74:iconst_0        
	//   35   75:ireturn         
		}
	}

	void destroy()
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            31
			Log.v("LoaderManager", (new StringBuilder()).append("  Destroying: ").append(((Object) (this))).toString());
	//    2    6:ldc1            #78  <String "LoaderManager">
	//    3    8:new             #80  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #81  <Method void StringBuilder()>
	//    6   15:ldc1            #135 <String "  Destroying: ">
	//    7   17:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   10   24:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   11   27:invokestatic    #108 <Method int Log.v(String, String)>
	//   12   30:pop             
		mDestroyed = true;
	//   13   31:aload_0         
	//   14   32:iconst_1        
	//   15   33:putfield        #137 <Field boolean mDestroyed>
		boolean flag = mDeliveredData;
	//   16   36:aload_0         
	//   17   37:getfield        #114 <Field boolean mDeliveredData>
	//   18   40:istore_1        
		mDeliveredData = false;
	//   19   41:aload_0         
	//   20   42:iconst_0        
	//   21   43:putfield        #114 <Field boolean mDeliveredData>
		if(mCallbacks == null || mLoader == null || !mHaveData || !flag)
			break MISSING_BLOCK_LABEL_178;
	//   22   46:aload_0         
	//   23   47:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   24   50:ifnull          178
	//   25   53:aload_0         
	//   26   54:getfield        #123 <Field Loader mLoader>
	//   27   57:ifnull          178
	//   28   60:aload_0         
	//   29   61:getfield        #139 <Field boolean mHaveData>
	//   30   64:ifeq            178
	//   31   67:iload_1         
	//   32   68:ifeq            178
		if(LoaderManagerImpl.DEBUG)
	//*  33   71:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  34   74:ifeq            102
			Log.v("LoaderManager", (new StringBuilder()).append("  Resetting: ").append(((Object) (this))).toString());
	//   35   77:ldc1            #78  <String "LoaderManager">
	//   36   79:new             #80  <Class StringBuilder>
	//   37   82:dup             
	//   38   83:invokespecial   #81  <Method void StringBuilder()>
	//   39   86:ldc1            #141 <String "  Resetting: ">
	//   40   88:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   41   91:aload_0         
	//   42   92:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   43   95:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   44   98:invokestatic    #108 <Method int Log.v(String, String)>
	//   45  101:pop             
		String s;
		Exception exception;
		if(mHost != null)
	//*  46  102:aload_0         
	//*  47  103:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  48  106:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  49  109:ifnull          277
		{
			s = mHost.mFragmentManager.mNoTransactionsBecause;
	//   50  112:aload_0         
	//   51  113:getfield        #41  <Field LoaderManagerImpl this$0>
	//   52  116:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   53  119:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   54  122:getfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
	//   55  125:astore_2        
			mHost.mFragmentManager.mNoTransactionsBecause = "onLoaderReset";
	//   56  126:aload_0         
	//   57  127:getfield        #41  <Field LoaderManagerImpl this$0>
	//   58  130:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//   59  133:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   60  136:ldc1            #143 <String "onLoaderReset">
	//   61  138:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		} else
	//*  62  141:aload_0         
	//*  63  142:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//*  64  145:aload_0         
	//*  65  146:getfield        #123 <Field Loader mLoader>
	//*  66  149:invokeinterface #145 <Method void LoaderManager$LoaderCallbacks.onLoaderReset(Loader)>
	//*  67  154:aload_0         
	//*  68  155:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  69  158:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  70  161:ifnull          178
	//*  71  164:aload_0         
	//*  72  165:getfield        #41  <Field LoaderManagerImpl this$0>
	//*  73  168:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//*  74  171:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//*  75  174:aload_2         
	//*  76  175:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
	//*  77  178:aload_0         
	//*  78  179:aconst_null     
	//*  79  180:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//*  80  183:aload_0         
	//*  81  184:aconst_null     
	//*  82  185:putfield        #147 <Field Object mData>
	//*  83  188:aload_0         
	//*  84  189:iconst_0        
	//*  85  190:putfield        #139 <Field boolean mHaveData>
	//*  86  193:aload_0         
	//*  87  194:getfield        #123 <Field Loader mLoader>
	//*  88  197:ifnull          235
	//*  89  200:aload_0         
	//*  90  201:getfield        #125 <Field boolean mListenerRegistered>
	//*  91  204:ifeq            228
	//*  92  207:aload_0         
	//*  93  208:iconst_0        
	//*  94  209:putfield        #125 <Field boolean mListenerRegistered>
	//*  95  212:aload_0         
	//*  96  213:getfield        #123 <Field Loader mLoader>
	//*  97  216:aload_0         
	//*  98  217:invokevirtual   #151 <Method void Loader.unregisterListener(android.support.v4.content.Loader$OnLoadCompleteListener)>
	//*  99  220:aload_0         
	//* 100  221:getfield        #123 <Field Loader mLoader>
	//* 101  224:aload_0         
	//* 102  225:invokevirtual   #155 <Method void Loader.unregisterOnLoadCanceledListener(android.support.v4.content.Loader$OnLoadCanceledListener)>
	//* 103  228:aload_0         
	//* 104  229:getfield        #123 <Field Loader mLoader>
	//* 105  232:invokevirtual   #158 <Method void Loader.reset()>
	//* 106  235:aload_0         
	//* 107  236:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//* 108  239:ifnull          249
	//* 109  242:aload_0         
	//* 110  243:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//* 111  246:invokevirtual   #162 <Method void destroy()>
	//* 112  249:return          
	//* 113  250:astore_3        
	//* 114  251:aload_0         
	//* 115  252:getfield        #41  <Field LoaderManagerImpl this$0>
	//* 116  255:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//* 117  258:ifnull          275
	//* 118  261:aload_0         
	//* 119  262:getfield        #41  <Field LoaderManagerImpl this$0>
	//* 120  265:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//* 121  268:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//* 122  271:aload_2         
	//* 123  272:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
	//* 124  275:aload_3         
	//* 125  276:athrow          
		{
			s = null;
	//  126  277:aconst_null     
	//  127  278:astore_2        
		}
		mCallbacks.onLoaderReset(mLoader);
		if(mHost != null)
			mHost.mFragmentManager.mNoTransactionsBecause = s;
		mCallbacks = null;
		mData = null;
		mHaveData = false;
		if(mLoader != null)
		{
			if(mListenerRegistered)
			{
				mListenerRegistered = false;
				mLoader.unregisterListener(((android.support.v4.content.) (this)));
				mLoader.unregisterOnLoadCanceledListener(((android.support.v4.content.) (this)));
			}
			mLoader.reset();
		}
		if(mPendingLoader != null)
			mPendingLoader.destroy();
		return;
		exception;
		if(mHost != null)
			mHost.mFragmentManager.mNoTransactionsBecause = s;
		throw exception;
	//* 128  279:goto            141
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		printwriter.print(s);
	//    0    0:aload_3         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print("mId=");
	//    3    5:aload_3         
	//    4    6:ldc1            #172 <String "mId=">
	//    5    8:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print(mId);
	//    6   11:aload_3         
	//    7   12:aload_0         
	//    8   13:getfield        #46  <Field int mId>
	//    9   16:invokevirtual   #175 <Method void PrintWriter.print(int)>
		printwriter.print(" mArgs=");
	//   10   19:aload_3         
	//   11   20:ldc1            #177 <String " mArgs=">
	//   12   22:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mArgs)));
	//   13   25:aload_3         
	//   14   26:aload_0         
	//   15   27:getfield        #48  <Field Bundle mArgs>
	//   16   30:invokevirtual   #181 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//   17   33:aload_3         
	//   18   34:aload_1         
	//   19   35:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print("mCallbacks=");
	//   20   38:aload_3         
	//   21   39:ldc1            #183 <String "mCallbacks=">
	//   22   41:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mCallbacks)));
	//   23   44:aload_3         
	//   24   45:aload_0         
	//   25   46:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   26   49:invokevirtual   #181 <Method void PrintWriter.println(Object)>
		printwriter.print(s);
	//   27   52:aload_3         
	//   28   53:aload_1         
	//   29   54:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print("mLoader=");
	//   30   57:aload_3         
	//   31   58:ldc1            #185 <String "mLoader=">
	//   32   60:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.println(((Object) (mLoader)));
	//   33   63:aload_3         
	//   34   64:aload_0         
	//   35   65:getfield        #123 <Field Loader mLoader>
	//   36   68:invokevirtual   #181 <Method void PrintWriter.println(Object)>
		if(mLoader != null)
	//*  37   71:aload_0         
	//*  38   72:getfield        #123 <Field Loader mLoader>
	//*  39   75:ifnull          108
			mLoader.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
	//   40   78:aload_0         
	//   41   79:getfield        #123 <Field Loader mLoader>
	//   42   82:new             #80  <Class StringBuilder>
	//   43   85:dup             
	//   44   86:invokespecial   #81  <Method void StringBuilder()>
	//   45   89:aload_1         
	//   46   90:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   47   93:ldc1            #187 <String "  ">
	//   48   95:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   49   98:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   50  101:aload_2         
	//   51  102:aload_3         
	//   52  103:aload           4
	//   53  105:invokevirtual   #189 <Method void Loader.dump(String, FileDescriptor, PrintWriter, String[])>
		if(mHaveData || mDeliveredData)
	//*  54  108:aload_0         
	//*  55  109:getfield        #139 <Field boolean mHaveData>
	//*  56  112:ifne            122
	//*  57  115:aload_0         
	//*  58  116:getfield        #114 <Field boolean mDeliveredData>
	//*  59  119:ifeq            174
		{
			printwriter.print(s);
	//   60  122:aload_3         
	//   61  123:aload_1         
	//   62  124:invokevirtual   #170 <Method void PrintWriter.print(String)>
			printwriter.print("mHaveData=");
	//   63  127:aload_3         
	//   64  128:ldc1            #191 <String "mHaveData=">
	//   65  130:invokevirtual   #170 <Method void PrintWriter.print(String)>
			printwriter.print(mHaveData);
	//   66  133:aload_3         
	//   67  134:aload_0         
	//   68  135:getfield        #139 <Field boolean mHaveData>
	//   69  138:invokevirtual   #194 <Method void PrintWriter.print(boolean)>
			printwriter.print("  mDeliveredData=");
	//   70  141:aload_3         
	//   71  142:ldc1            #196 <String "  mDeliveredData=">
	//   72  144:invokevirtual   #170 <Method void PrintWriter.print(String)>
			printwriter.println(mDeliveredData);
	//   73  147:aload_3         
	//   74  148:aload_0         
	//   75  149:getfield        #114 <Field boolean mDeliveredData>
	//   76  152:invokevirtual   #198 <Method void PrintWriter.println(boolean)>
			printwriter.print(s);
	//   77  155:aload_3         
	//   78  156:aload_1         
	//   79  157:invokevirtual   #170 <Method void PrintWriter.print(String)>
			printwriter.print("mData=");
	//   80  160:aload_3         
	//   81  161:ldc1            #200 <String "mData=">
	//   82  163:invokevirtual   #170 <Method void PrintWriter.print(String)>
			printwriter.println(mData);
	//   83  166:aload_3         
	//   84  167:aload_0         
	//   85  168:getfield        #147 <Field Object mData>
	//   86  171:invokevirtual   #181 <Method void PrintWriter.println(Object)>
		}
		printwriter.print(s);
	//   87  174:aload_3         
	//   88  175:aload_1         
	//   89  176:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print("mStarted=");
	//   90  179:aload_3         
	//   91  180:ldc1            #202 <String "mStarted=">
	//   92  182:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print(mStarted);
	//   93  185:aload_3         
	//   94  186:aload_0         
	//   95  187:getfield        #121 <Field boolean mStarted>
	//   96  190:invokevirtual   #194 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mReportNextStart=");
	//   97  193:aload_3         
	//   98  194:ldc1            #204 <String " mReportNextStart=">
	//   99  196:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print(mReportNextStart);
	//  100  199:aload_3         
	//  101  200:aload_0         
	//  102  201:getfield        #206 <Field boolean mReportNextStart>
	//  103  204:invokevirtual   #194 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mDestroyed=");
	//  104  207:aload_3         
	//  105  208:ldc1            #208 <String " mDestroyed=">
	//  106  210:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.println(mDestroyed);
	//  107  213:aload_3         
	//  108  214:aload_0         
	//  109  215:getfield        #137 <Field boolean mDestroyed>
	//  110  218:invokevirtual   #198 <Method void PrintWriter.println(boolean)>
		printwriter.print(s);
	//  111  221:aload_3         
	//  112  222:aload_1         
	//  113  223:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print("mRetaining=");
	//  114  226:aload_3         
	//  115  227:ldc1            #210 <String "mRetaining=">
	//  116  229:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print(mRetaining);
	//  117  232:aload_3         
	//  118  233:aload_0         
	//  119  234:getfield        #212 <Field boolean mRetaining>
	//  120  237:invokevirtual   #194 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mRetainingStarted=");
	//  121  240:aload_3         
	//  122  241:ldc1            #214 <String " mRetainingStarted=">
	//  123  243:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.print(mRetainingStarted);
	//  124  246:aload_3         
	//  125  247:aload_0         
	//  126  248:getfield        #216 <Field boolean mRetainingStarted>
	//  127  251:invokevirtual   #194 <Method void PrintWriter.print(boolean)>
		printwriter.print(" mListenerRegistered=");
	//  128  254:aload_3         
	//  129  255:ldc1            #218 <String " mListenerRegistered=">
	//  130  257:invokevirtual   #170 <Method void PrintWriter.print(String)>
		printwriter.println(mListenerRegistered);
	//  131  260:aload_3         
	//  132  261:aload_0         
	//  133  262:getfield        #125 <Field boolean mListenerRegistered>
	//  134  265:invokevirtual   #198 <Method void PrintWriter.println(boolean)>
		if(mPendingLoader != null)
	//* 135  268:aload_0         
	//* 136  269:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//* 137  272:ifnull          330
		{
			printwriter.print(s);
	//  138  275:aload_3         
	//  139  276:aload_1         
	//  140  277:invokevirtual   #170 <Method void PrintWriter.print(String)>
			printwriter.println("Pending Loader ");
	//  141  280:aload_3         
	//  142  281:ldc1            #220 <String "Pending Loader ">
	//  143  283:invokevirtual   #222 <Method void PrintWriter.println(String)>
			printwriter.print(((Object) (mPendingLoader)));
	//  144  286:aload_3         
	//  145  287:aload_0         
	//  146  288:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//  147  291:invokevirtual   #224 <Method void PrintWriter.print(Object)>
			printwriter.println(":");
	//  148  294:aload_3         
	//  149  295:ldc1            #226 <String ":">
	//  150  297:invokevirtual   #222 <Method void PrintWriter.println(String)>
			mPendingLoader.dump((new StringBuilder()).append(s).append("  ").toString(), filedescriptor, printwriter, as);
	//  151  300:aload_0         
	//  152  301:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//  153  304:new             #80  <Class StringBuilder>
	//  154  307:dup             
	//  155  308:invokespecial   #81  <Method void StringBuilder()>
	//  156  311:aload_1         
	//  157  312:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  158  315:ldc1            #187 <String "  ">
	//  159  317:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//  160  320:invokevirtual   #102 <Method String StringBuilder.toString()>
	//  161  323:aload_2         
	//  162  324:aload_3         
	//  163  325:aload           4
	//  164  327:invokevirtual   #227 <Method void dump(String, FileDescriptor, PrintWriter, String[])>
		}
	//  165  330:return          
	}

	void finishRetain()
	{
		if(mRetaining)
	//*   0    0:aload_0         
	//*   1    1:getfield        #212 <Field boolean mRetaining>
	//*   2    4:ifeq            65
		{
			if(LoaderManagerImpl.DEBUG)
	//*   3    7:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   4   10:ifeq            38
				Log.v("LoaderManager", (new StringBuilder()).append("  Finished Retaining: ").append(((Object) (this))).toString());
	//    5   13:ldc1            #78  <String "LoaderManager">
	//    6   15:new             #80  <Class StringBuilder>
	//    7   18:dup             
	//    8   19:invokespecial   #81  <Method void StringBuilder()>
	//    9   22:ldc1            #230 <String "  Finished Retaining: ">
	//   10   24:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #108 <Method int Log.v(String, String)>
	//   15   37:pop             
			mRetaining = false;
	//   16   38:aload_0         
	//   17   39:iconst_0        
	//   18   40:putfield        #212 <Field boolean mRetaining>
			if(mStarted != mRetainingStarted && !mStarted)
	//*  19   43:aload_0         
	//*  20   44:getfield        #121 <Field boolean mStarted>
	//*  21   47:aload_0         
	//*  22   48:getfield        #216 <Field boolean mRetainingStarted>
	//*  23   51:icmpeq          65
	//*  24   54:aload_0         
	//*  25   55:getfield        #121 <Field boolean mStarted>
	//*  26   58:ifne            65
				stop();
	//   27   61:aload_0         
	//   28   62:invokevirtual   #233 <Method void stop()>
		}
		if(mStarted && mHaveData && !mReportNextStart)
	//*  29   65:aload_0         
	//*  30   66:getfield        #121 <Field boolean mStarted>
	//*  31   69:ifeq            98
	//*  32   72:aload_0         
	//*  33   73:getfield        #139 <Field boolean mHaveData>
	//*  34   76:ifeq            98
	//*  35   79:aload_0         
	//*  36   80:getfield        #206 <Field boolean mReportNextStart>
	//*  37   83:ifne            98
			callOnLoadFinished(mLoader, mData);
	//   38   86:aload_0         
	//   39   87:aload_0         
	//   40   88:getfield        #123 <Field Loader mLoader>
	//   41   91:aload_0         
	//   42   92:getfield        #147 <Field Object mData>
	//   43   95:invokevirtual   #235 <Method void callOnLoadFinished(Loader, Object)>
	//   44   98:return          
	}

	public void onLoadCanceled(Loader loader)
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            31
			Log.v("LoaderManager", (new StringBuilder()).append("onLoadCanceled: ").append(((Object) (this))).toString());
	//    2    6:ldc1            #78  <String "LoaderManager">
	//    3    8:new             #80  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #81  <Method void StringBuilder()>
	//    6   15:ldc1            #237 <String "onLoadCanceled: ">
	//    7   17:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   10   24:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   11   27:invokestatic    #108 <Method int Log.v(String, String)>
	//   12   30:pop             
		if(!mDestroyed) goto _L2; else goto _L1
	//   13   31:aload_0         
	//   14   32:getfield        #137 <Field boolean mDestroyed>
	//   15   35:ifeq            53
_L1:
		if(LoaderManagerImpl.DEBUG)
	//*  16   38:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  17   41:ifeq            52
			Log.v("LoaderManager", "  Ignoring load canceled -- destroyed");
	//   18   44:ldc1            #78  <String "LoaderManager">
	//   19   46:ldc1            #239 <String "  Ignoring load canceled -- destroyed">
	//   20   48:invokestatic    #108 <Method int Log.v(String, String)>
	//   21   51:pop             
_L4:
		return;
	//   22   52:return          
_L2:
		if(mLoaders.get(mId) == this)
			break; /* Loop/switch isn't completed */
	//   23   53:aload_0         
	//   24   54:getfield        #41  <Field LoaderManagerImpl this$0>
	//   25   57:getfield        #243 <Field SparseArrayCompat LoaderManagerImpl.mLoaders>
	//   26   60:aload_0         
	//   27   61:getfield        #46  <Field int mId>
	//   28   64:invokevirtual   #249 <Method Object SparseArrayCompat.get(int)>
	//   29   67:aload_0         
	//   30   68:if_acmpeq       86
		if(LoaderManagerImpl.DEBUG)
	//*  31   71:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  32   74:ifeq            52
		{
			Log.v("LoaderManager", "  Ignoring load canceled -- not active");
	//   33   77:ldc1            #78  <String "LoaderManager">
	//   34   79:ldc1            #251 <String "  Ignoring load canceled -- not active">
	//   35   81:invokestatic    #108 <Method int Log.v(String, String)>
	//   36   84:pop             
			return;
	//   37   85:return          
		}
		if(true) goto _L4; else goto _L3
_L3:
		loader = ((Loader) (mPendingLoader));
	//   38   86:aload_0         
	//   39   87:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//   40   90:astore_1        
		if(loader != null)
	//*  41   91:aload_1         
	//*  42   92:ifnull          52
		{
			if(LoaderManagerImpl.DEBUG)
	//*  43   95:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  44   98:ifeq            126
				Log.v("LoaderManager", (new StringBuilder()).append("  Switching to pending loader: ").append(((Object) (loader))).toString());
	//   45  101:ldc1            #78  <String "LoaderManager">
	//   46  103:new             #80  <Class StringBuilder>
	//   47  106:dup             
	//   48  107:invokespecial   #81  <Method void StringBuilder()>
	//   49  110:ldc1            #253 <String "  Switching to pending loader: ">
	//   50  112:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   51  115:aload_1         
	//   52  116:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   53  119:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   54  122:invokestatic    #108 <Method int Log.v(String, String)>
	//   55  125:pop             
			mPendingLoader = null;
	//   56  126:aload_0         
	//   57  127:aconst_null     
	//   58  128:putfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
			mLoaders.put(mId, ((Object) (null)));
	//   59  131:aload_0         
	//   60  132:getfield        #41  <Field LoaderManagerImpl this$0>
	//   61  135:getfield        #243 <Field SparseArrayCompat LoaderManagerImpl.mLoaders>
	//   62  138:aload_0         
	//   63  139:getfield        #46  <Field int mId>
	//   64  142:aconst_null     
	//   65  143:invokevirtual   #257 <Method void SparseArrayCompat.put(int, Object)>
			destroy();
	//   66  146:aload_0         
	//   67  147:invokevirtual   #162 <Method void destroy()>
			installLoader(((LoaderManagerImpl$LoaderInfo) (loader)));
	//   68  150:aload_0         
	//   69  151:getfield        #41  <Field LoaderManagerImpl this$0>
	//   70  154:aload_1         
	//   71  155:invokevirtual   #261 <Method void LoaderManagerImpl.installLoader(LoaderManagerImpl$LoaderInfo)>
			return;
	//   72  158:return          
		}
		if(true) goto _L4; else goto _L5
_L5:
	}

	public void onLoadComplete(Loader loader, Object obj)
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            32
			Log.v("LoaderManager", (new StringBuilder()).append("onLoadComplete: ").append(((Object) (this))).toString());
	//    2    6:ldc1            #78  <String "LoaderManager">
	//    3    8:new             #80  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #81  <Method void StringBuilder()>
	//    6   15:ldc2            #265 <String "onLoadComplete: ">
	//    7   18:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_0         
	//    9   22:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #108 <Method int Log.v(String, String)>
	//   12   31:pop             
		if(!mDestroyed) goto _L2; else goto _L1
	//   13   32:aload_0         
	//   14   33:getfield        #137 <Field boolean mDestroyed>
	//   15   36:ifeq            55
_L1:
		if(LoaderManagerImpl.DEBUG)
	//*  16   39:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  17   42:ifeq            54
			Log.v("LoaderManager", "  Ignoring load complete -- destroyed");
	//   18   45:ldc1            #78  <String "LoaderManager">
	//   19   47:ldc2            #267 <String "  Ignoring load complete -- destroyed">
	//   20   50:invokestatic    #108 <Method int Log.v(String, String)>
	//   21   53:pop             
_L4:
		return;
	//   22   54:return          
_L2:
		if(mLoaders.get(mId) == this)
			break; /* Loop/switch isn't completed */
	//   23   55:aload_0         
	//   24   56:getfield        #41  <Field LoaderManagerImpl this$0>
	//   25   59:getfield        #243 <Field SparseArrayCompat LoaderManagerImpl.mLoaders>
	//   26   62:aload_0         
	//   27   63:getfield        #46  <Field int mId>
	//   28   66:invokevirtual   #249 <Method Object SparseArrayCompat.get(int)>
	//   29   69:aload_0         
	//   30   70:if_acmpeq       89
		if(LoaderManagerImpl.DEBUG)
	//*  31   73:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  32   76:ifeq            54
		{
			Log.v("LoaderManager", "  Ignoring load complete -- not active");
	//   33   79:ldc1            #78  <String "LoaderManager">
	//   34   81:ldc2            #269 <String "  Ignoring load complete -- not active">
	//   35   84:invokestatic    #108 <Method int Log.v(String, String)>
	//   36   87:pop             
			return;
	//   37   88:return          
		}
		if(true) goto _L4; else goto _L3
_L3:
		LoaderManagerImpl$LoaderInfo loadermanagerimpl$loaderinfo = mPendingLoader;
	//   38   89:aload_0         
	//   39   90:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
	//   40   93:astore_3        
		if(loadermanagerimpl$loaderinfo != null)
	//*  41   94:aload_3         
	//*  42   95:ifnull          162
		{
			if(LoaderManagerImpl.DEBUG)
	//*  43   98:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  44  101:ifeq            129
				Log.v("LoaderManager", (new StringBuilder()).append("  Switching to pending loader: ").append(((Object) (loadermanagerimpl$loaderinfo))).toString());
	//   45  104:ldc1            #78  <String "LoaderManager">
	//   46  106:new             #80  <Class StringBuilder>
	//   47  109:dup             
	//   48  110:invokespecial   #81  <Method void StringBuilder()>
	//   49  113:ldc1            #253 <String "  Switching to pending loader: ">
	//   50  115:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   51  118:aload_3         
	//   52  119:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   53  122:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   54  125:invokestatic    #108 <Method int Log.v(String, String)>
	//   55  128:pop             
			mPendingLoader = null;
	//   56  129:aload_0         
	//   57  130:aconst_null     
	//   58  131:putfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
			mLoaders.put(mId, ((Object) (null)));
	//   59  134:aload_0         
	//   60  135:getfield        #41  <Field LoaderManagerImpl this$0>
	//   61  138:getfield        #243 <Field SparseArrayCompat LoaderManagerImpl.mLoaders>
	//   62  141:aload_0         
	//   63  142:getfield        #46  <Field int mId>
	//   64  145:aconst_null     
	//   65  146:invokevirtual   #257 <Method void SparseArrayCompat.put(int, Object)>
			destroy();
	//   66  149:aload_0         
	//   67  150:invokevirtual   #162 <Method void destroy()>
			installLoader(loadermanagerimpl$loaderinfo);
	//   68  153:aload_0         
	//   69  154:getfield        #41  <Field LoaderManagerImpl this$0>
	//   70  157:aload_3         
	//   71  158:invokevirtual   #261 <Method void LoaderManagerImpl.installLoader(LoaderManagerImpl$LoaderInfo)>
			return;
	//   72  161:return          
		}
		if(mData != obj || !mHaveData)
	//*  73  162:aload_0         
	//*  74  163:getfield        #147 <Field Object mData>
	//*  75  166:aload_2         
	//*  76  167:if_acmpne       177
	//*  77  170:aload_0         
	//*  78  171:getfield        #139 <Field boolean mHaveData>
	//*  79  174:ifne            200
		{
			mData = obj;
	//   80  177:aload_0         
	//   81  178:aload_2         
	//   82  179:putfield        #147 <Field Object mData>
			mHaveData = true;
	//   83  182:aload_0         
	//   84  183:iconst_1        
	//   85  184:putfield        #139 <Field boolean mHaveData>
			if(mStarted)
	//*  86  187:aload_0         
	//*  87  188:getfield        #121 <Field boolean mStarted>
	//*  88  191:ifeq            200
				callOnLoadFinished(loader, obj);
	//   89  194:aload_0         
	//   90  195:aload_1         
	//   91  196:aload_2         
	//   92  197:invokevirtual   #235 <Method void callOnLoadFinished(Loader, Object)>
		}
		loader = ((Loader) ((LoaderManagerImpl$LoaderInfo)mInactiveLoaders.get(mId)));
	//   93  200:aload_0         
	//   94  201:getfield        #41  <Field LoaderManagerImpl this$0>
	//   95  204:getfield        #272 <Field SparseArrayCompat LoaderManagerImpl.mInactiveLoaders>
	//   96  207:aload_0         
	//   97  208:getfield        #46  <Field int mId>
	//   98  211:invokevirtual   #249 <Method Object SparseArrayCompat.get(int)>
	//   99  214:checkcast       #2   <Class LoaderManagerImpl$LoaderInfo>
	//  100  217:astore_1        
		if(loader != null && loader != this)
	//* 101  218:aload_1         
	//* 102  219:ifnull          250
	//* 103  222:aload_1         
	//* 104  223:aload_0         
	//* 105  224:if_acmpeq       250
		{
			loader.mDeliveredData = false;
	//  106  227:aload_1         
	//  107  228:iconst_0        
	//  108  229:putfield        #114 <Field boolean mDeliveredData>
			((LoaderManagerImpl$LoaderInfo) (loader)).destroy();
	//  109  232:aload_1         
	//  110  233:invokevirtual   #162 <Method void destroy()>
			mInactiveLoaders.remove(mId);
	//  111  236:aload_0         
	//  112  237:getfield        #41  <Field LoaderManagerImpl this$0>
	//  113  240:getfield        #272 <Field SparseArrayCompat LoaderManagerImpl.mInactiveLoaders>
	//  114  243:aload_0         
	//  115  244:getfield        #46  <Field int mId>
	//  116  247:invokevirtual   #275 <Method void SparseArrayCompat.remove(int)>
		}
		if(mHost != null && !hasRunningLoaders())
	//* 117  250:aload_0         
	//* 118  251:getfield        #41  <Field LoaderManagerImpl this$0>
	//* 119  254:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//* 120  257:ifnull          54
	//* 121  260:aload_0         
	//* 122  261:getfield        #41  <Field LoaderManagerImpl this$0>
	//* 123  264:invokevirtual   #278 <Method boolean LoaderManagerImpl.hasRunningLoaders()>
	//* 124  267:ifne            54
		{
			mHost.mFragmentManager.startPendingDeferredFragments();
	//  125  270:aload_0         
	//  126  271:getfield        #41  <Field LoaderManagerImpl this$0>
	//  127  274:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
	//  128  277:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//  129  280:invokevirtual   #281 <Method void FragmentManagerImpl.startPendingDeferredFragments()>
			return;
	//  130  283:return          
		}
		if(true) goto _L4; else goto _L5
_L5:
	}

	void reportStart()
	{
		if(mStarted && mReportNextStart)
	//*   0    0:aload_0         
	//*   1    1:getfield        #121 <Field boolean mStarted>
	//*   2    4:ifeq            45
	//*   3    7:aload_0         
	//*   4    8:getfield        #206 <Field boolean mReportNextStart>
	//*   5   11:ifeq            45
		{
			mReportNextStart = false;
	//    6   14:aload_0         
	//    7   15:iconst_0        
	//    8   16:putfield        #206 <Field boolean mReportNextStart>
			if(mHaveData && !mRetaining)
	//*   9   19:aload_0         
	//*  10   20:getfield        #139 <Field boolean mHaveData>
	//*  11   23:ifeq            45
	//*  12   26:aload_0         
	//*  13   27:getfield        #212 <Field boolean mRetaining>
	//*  14   30:ifne            45
				callOnLoadFinished(mLoader, mData);
	//   15   33:aload_0         
	//   16   34:aload_0         
	//   17   35:getfield        #123 <Field Loader mLoader>
	//   18   38:aload_0         
	//   19   39:getfield        #147 <Field Object mData>
	//   20   42:invokevirtual   #235 <Method void callOnLoadFinished(Loader, Object)>
		}
	//   21   45:return          
	}

	void retain()
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            32
			Log.v("LoaderManager", (new StringBuilder()).append("  Retaining: ").append(((Object) (this))).toString());
	//    2    6:ldc1            #78  <String "LoaderManager">
	//    3    8:new             #80  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #81  <Method void StringBuilder()>
	//    6   15:ldc2            #285 <String "  Retaining: ">
	//    7   18:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_0         
	//    9   22:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #108 <Method int Log.v(String, String)>
	//   12   31:pop             
		mRetaining = true;
	//   13   32:aload_0         
	//   14   33:iconst_1        
	//   15   34:putfield        #212 <Field boolean mRetaining>
		mRetainingStarted = mStarted;
	//   16   37:aload_0         
	//   17   38:aload_0         
	//   18   39:getfield        #121 <Field boolean mStarted>
	//   19   42:putfield        #216 <Field boolean mRetainingStarted>
		mStarted = false;
	//   20   45:aload_0         
	//   21   46:iconst_0        
	//   22   47:putfield        #121 <Field boolean mStarted>
		mCallbacks = null;
	//   23   50:aload_0         
	//   24   51:aconst_null     
	//   25   52:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   26   55:return          
	}

	void start()
	{
		if(mRetaining && mRetainingStarted)
	//*   0    0:aload_0         
	//*   1    1:getfield        #212 <Field boolean mRetaining>
	//*   2    4:ifeq            20
	//*   3    7:aload_0         
	//*   4    8:getfield        #216 <Field boolean mRetainingStarted>
	//*   5   11:ifeq            20
			mStarted = true;
	//    6   14:aload_0         
	//    7   15:iconst_1        
	//    8   16:putfield        #121 <Field boolean mStarted>
		else
	//*   9   19:return          
		if(!mStarted)
	//*  10   20:aload_0         
	//*  11   21:getfield        #121 <Field boolean mStarted>
	//*  12   24:ifne            19
		{
			mStarted = true;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #121 <Field boolean mStarted>
			if(LoaderManagerImpl.DEBUG)
	//*  16   32:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*  17   35:ifeq            64
				Log.v("LoaderManager", (new StringBuilder()).append("  Starting: ").append(((Object) (this))).toString());
	//   18   38:ldc1            #78  <String "LoaderManager">
	//   19   40:new             #80  <Class StringBuilder>
	//   20   43:dup             
	//   21   44:invokespecial   #81  <Method void StringBuilder()>
	//   22   47:ldc2            #288 <String "  Starting: ">
	//   23   50:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   24   53:aload_0         
	//   25   54:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   26   57:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   27   60:invokestatic    #108 <Method int Log.v(String, String)>
	//   28   63:pop             
			if(mLoader == null && mCallbacks != null)
	//*  29   64:aload_0         
	//*  30   65:getfield        #123 <Field Loader mLoader>
	//*  31   68:ifnonnull       99
	//*  32   71:aload_0         
	//*  33   72:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//*  34   75:ifnull          99
				mLoader = mCallbacks.onCreateLoader(mId, mArgs);
	//   35   78:aload_0         
	//   36   79:aload_0         
	//   37   80:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   38   83:aload_0         
	//   39   84:getfield        #46  <Field int mId>
	//   40   87:aload_0         
	//   41   88:getfield        #48  <Field Bundle mArgs>
	//   42   91:invokeinterface #292 <Method Loader LoaderManager$LoaderCallbacks.onCreateLoader(int, Bundle)>
	//   43   96:putfield        #123 <Field Loader mLoader>
			if(mLoader != null)
	//*  44   99:aload_0         
	//*  45  100:getfield        #123 <Field Loader mLoader>
	//*  46  103:ifnull          19
			{
				if(((Object) (mLoader)).getClass().isMemberClass() && !Modifier.isStatic(((Object) (mLoader)).getClass().getModifiers()))
	//*  47  106:aload_0         
	//*  48  107:getfield        #123 <Field Loader mLoader>
	//*  49  110:invokevirtual   #296 <Method Class Object.getClass()>
	//*  50  113:invokevirtual   #301 <Method boolean Class.isMemberClass()>
	//*  51  116:ifeq            166
	//*  52  119:aload_0         
	//*  53  120:getfield        #123 <Field Loader mLoader>
	//*  54  123:invokevirtual   #296 <Method Class Object.getClass()>
	//*  55  126:invokevirtual   #305 <Method int Class.getModifiers()>
	//*  56  129:invokestatic    #311 <Method boolean Modifier.isStatic(int)>
	//*  57  132:ifne            166
					throw new IllegalArgumentException((new StringBuilder()).append("Object returned from onCreateLoader must not be a non-static inner member class: ").append(((Object) (mLoader))).toString());
	//   58  135:new             #313 <Class IllegalArgumentException>
	//   59  138:dup             
	//   60  139:new             #80  <Class StringBuilder>
	//   61  142:dup             
	//   62  143:invokespecial   #81  <Method void StringBuilder()>
	//   63  146:ldc2            #315 <String "Object returned from onCreateLoader must not be a non-static inner member class: ">
	//   64  149:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   65  152:aload_0         
	//   66  153:getfield        #123 <Field Loader mLoader>
	//   67  156:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   68  159:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   69  162:invokespecial   #317 <Method void IllegalArgumentException(String)>
	//   70  165:athrow          
				if(!mListenerRegistered)
	//*  71  166:aload_0         
	//*  72  167:getfield        #125 <Field boolean mListenerRegistered>
	//*  73  170:ifne            198
				{
					mLoader.registerListener(mId, ((android.support.v4.content.) (this)));
	//   74  173:aload_0         
	//   75  174:getfield        #123 <Field Loader mLoader>
	//   76  177:aload_0         
	//   77  178:getfield        #46  <Field int mId>
	//   78  181:aload_0         
	//   79  182:invokevirtual   #321 <Method void Loader.registerListener(int, android.support.v4.content.Loader$OnLoadCompleteListener)>
					mLoader.registerOnLoadCanceledListener(((android.support.v4.content.) (this)));
	//   80  185:aload_0         
	//   81  186:getfield        #123 <Field Loader mLoader>
	//   82  189:aload_0         
	//   83  190:invokevirtual   #324 <Method void Loader.registerOnLoadCanceledListener(android.support.v4.content.Loader$OnLoadCanceledListener)>
					mListenerRegistered = true;
	//   84  193:aload_0         
	//   85  194:iconst_1        
	//   86  195:putfield        #125 <Field boolean mListenerRegistered>
				}
				mLoader.startLoading();
	//   87  198:aload_0         
	//   88  199:getfield        #123 <Field Loader mLoader>
	//   89  202:invokevirtual   #327 <Method void Loader.startLoading()>
				return;
	//   90  205:return          
			}
		}
	}

	void stop()
	{
		if(LoaderManagerImpl.DEBUG)
	//*   0    0:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
	//*   1    3:ifeq            32
			Log.v("LoaderManager", (new StringBuilder()).append("  Stopping: ").append(((Object) (this))).toString());
	//    2    6:ldc1            #78  <String "LoaderManager">
	//    3    8:new             #80  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #81  <Method void StringBuilder()>
	//    6   15:ldc2            #329 <String "  Stopping: ">
	//    7   18:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   21:aload_0         
	//    9   22:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   10   25:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   11   28:invokestatic    #108 <Method int Log.v(String, String)>
	//   12   31:pop             
		mStarted = false;
	//   13   32:aload_0         
	//   14   33:iconst_0        
	//   15   34:putfield        #121 <Field boolean mStarted>
		if(!mRetaining && mLoader != null && mListenerRegistered)
	//*  16   37:aload_0         
	//*  17   38:getfield        #212 <Field boolean mRetaining>
	//*  18   41:ifne            86
	//*  19   44:aload_0         
	//*  20   45:getfield        #123 <Field Loader mLoader>
	//*  21   48:ifnull          86
	//*  22   51:aload_0         
	//*  23   52:getfield        #125 <Field boolean mListenerRegistered>
	//*  24   55:ifeq            86
		{
			mListenerRegistered = false;
	//   25   58:aload_0         
	//   26   59:iconst_0        
	//   27   60:putfield        #125 <Field boolean mListenerRegistered>
			mLoader.unregisterListener(((android.support.v4.content.) (this)));
	//   28   63:aload_0         
	//   29   64:getfield        #123 <Field Loader mLoader>
	//   30   67:aload_0         
	//   31   68:invokevirtual   #151 <Method void Loader.unregisterListener(android.support.v4.content.Loader$OnLoadCompleteListener)>
			mLoader.unregisterOnLoadCanceledListener(((android.support.v4.content.) (this)));
	//   32   71:aload_0         
	//   33   72:getfield        #123 <Field Loader mLoader>
	//   34   75:aload_0         
	//   35   76:invokevirtual   #155 <Method void Loader.unregisterOnLoadCanceledListener(android.support.v4.content.Loader$OnLoadCanceledListener)>
			mLoader.stopLoading();
	//   36   79:aload_0         
	//   37   80:getfield        #123 <Field Loader mLoader>
	//   38   83:invokevirtual   #332 <Method void Loader.stopLoading()>
		}
	//   39   86:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(64);
	//    0    0:new             #80  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:bipush          64
	//    3    6:invokespecial   #334 <Method void StringBuilder(int)>
	//    4    9:astore_1        
		stringbuilder.append("LoaderInfo{");
	//    5   10:aload_1         
	//    6   11:ldc2            #336 <String "LoaderInfo{">
	//    7   14:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokestatic    #342 <Method int System.identityHashCode(Object)>
	//   12   23:invokestatic    #348 <Method String Integer.toHexString(int)>
	//   13   26:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(" #");
	//   15   30:aload_1         
	//   16   31:ldc2            #350 <String " #">
	//   17   34:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   18   37:pop             
		stringbuilder.append(mId);
	//   19   38:aload_1         
	//   20   39:aload_0         
	//   21   40:getfield        #46  <Field int mId>
	//   22   43:invokevirtual   #353 <Method StringBuilder StringBuilder.append(int)>
	//   23   46:pop             
		stringbuilder.append(" : ");
	//   24   47:aload_1         
	//   25   48:ldc2            #355 <String " : ">
	//   26   51:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   27   54:pop             
		DebugUtils.buildShortClassTag(((Object) (mLoader)), stringbuilder);
	//   28   55:aload_0         
	//   29   56:getfield        #123 <Field Loader mLoader>
	//   30   59:aload_1         
	//   31   60:invokestatic    #361 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   32   63:aload_1         
	//   33   64:ldc2            #363 <String "}}">
	//   34   67:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   35   70:pop             
		return stringbuilder.toString();
	//   36   71:aload_1         
	//   37   72:invokevirtual   #102 <Method String StringBuilder.toString()>
	//   38   75:areturn         
	}

	final Bundle mArgs;
	 mCallbacks;
	Object mData;
	boolean mDeliveredData;
	boolean mDestroyed;
	boolean mHaveData;
	final int mId;
	boolean mListenerRegistered;
	Loader mLoader;
	LoaderManagerImpl$LoaderInfo mPendingLoader;
	boolean mReportNextStart;
	boolean mRetaining;
	boolean mRetainingStarted;
	boolean mStarted;
	final LoaderManagerImpl this$0;

	public LoaderManagerImpl$LoaderInfo(int i, Bundle bundle,  )
	{
		this$0 = LoaderManagerImpl.this;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #41  <Field LoaderManagerImpl this$0>
		super();
	//    3    5:aload_0         
	//    4    6:invokespecial   #44  <Method void Object()>
		mId = i;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #46  <Field int mId>
		mArgs = bundle;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #48  <Field Bundle mArgs>
		mCallbacks = ;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
	//   14   25:return          
	}
}
