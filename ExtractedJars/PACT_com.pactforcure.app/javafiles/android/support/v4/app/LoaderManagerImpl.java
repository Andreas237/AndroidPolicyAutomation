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
//			LoaderManager, FragmentHostCallback, FragmentManagerImpl

class LoaderManagerImpl extends LoaderManager
{
	final class LoaderInfo
		implements android.support.v4.content.Loader.OnLoadCompleteListener, android.support.v4.content.Loader.OnLoadCanceledListener
	{

		void callOnLoadFinished(Loader loader, Object obj)
		{
			String s;
			if(mCallbacks == null)
				break MISSING_BLOCK_LABEL_132;
		//    0    0:aload_0         
		//    1    1:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
		//    2    4:ifnull          132
			s = null;
		//    3    7:aconst_null     
		//    4    8:astore_3        
			if(mHost != null)
		//*   5    9:aload_0         
		//*   6   10:getfield        #41  <Field LoaderManagerImpl this$0>
		//*   7   13:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//*   8   16:ifnull          48
			{
				s = mHost.mFragmentManager.mNoTransactionsBecause;
		//    9   19:aload_0         
		//   10   20:getfield        #41  <Field LoaderManagerImpl this$0>
		//   11   23:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//   12   26:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
		//   13   29:getfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		//   14   32:astore_3        
				mHost.mFragmentManager.mNoTransactionsBecause = "onLoadFinished";
		//   15   33:aload_0         
		//   16   34:getfield        #41  <Field LoaderManagerImpl this$0>
		//   17   37:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//   18   40:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
		//   19   43:ldc1            #73  <String "onLoadFinished">
		//   20   45:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
			}
			if(LoaderManagerImpl.DEBUG)
		//*  21   48:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
		//*  22   51:ifeq            92
				Log.v("LoaderManager", (new StringBuilder()).append("  onLoadFinished in ").append(((Object) (loader))).append(": ").append(loader.dataToString(obj)).toString());
		//   23   54:ldc1            #78  <String "LoaderManager">
		//   24   56:new             #80  <Class StringBuilder>
		//   25   59:dup             
		//   26   60:invokespecial   #81  <Method void StringBuilder()>
		//   27   63:ldc1            #83  <String "  onLoadFinished in ">
		//   28   65:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
		//   29   68:aload_1         
		//   30   69:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
		//   31   72:ldc1            #92  <String ": ">
		//   32   74:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
		//   33   77:aload_1         
		//   34   78:aload_2         
		//   35   79:invokevirtual   #98  <Method String Loader.dataToString(Object)>
		//   36   82:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
		//   37   85:invokevirtual   #102 <Method String StringBuilder.toString()>
		//   38   88:invokestatic    #108 <Method int Log.v(String, String)>
		//   39   91:pop             
			mCallbacks.onLoadFinished(loader, obj);
		//   40   92:aload_0         
		//   41   93:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
		//   42   96:aload_1         
		//   43   97:aload_2         
		//   44   98:invokeinterface #112 <Method void LoaderManager$LoaderCallbacks.onLoadFinished(Loader, Object)>
			if(mHost != null)
		//*  45  103:aload_0         
		//*  46  104:getfield        #41  <Field LoaderManagerImpl this$0>
		//*  47  107:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//*  48  110:ifnull          127
				mHost.mFragmentManager.mNoTransactionsBecause = s;
		//   49  113:aload_0         
		//   50  114:getfield        #41  <Field LoaderManagerImpl this$0>
		//   51  117:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//   52  120:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
		//   53  123:aload_3         
		//   54  124:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
			mDeliveredData = true;
		//   55  127:aload_0         
		//   56  128:iconst_1        
		//   57  129:putfield        #114 <Field boolean mDeliveredData>
			return;
		//   58  132:return          
			loader;
		//   59  133:astore_1        
			if(mHost != null)
		//*  60  134:aload_0         
		//*  61  135:getfield        #41  <Field LoaderManagerImpl this$0>
		//*  62  138:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//*  63  141:ifnull          158
				mHost.mFragmentManager.mNoTransactionsBecause = s;
		//   64  144:aload_0         
		//   65  145:getfield        #41  <Field LoaderManagerImpl this$0>
		//   66  148:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//   67  151:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
		//   68  154:aload_3         
		//   69  155:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
			throw loader;
		//   70  158:aload_1         
		//   71  159:athrow          
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
			String s;
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
				break MISSING_BLOCK_LABEL_180;
		//   22   46:aload_0         
		//   23   47:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
		//   24   50:ifnull          180
		//   25   53:aload_0         
		//   26   54:getfield        #123 <Field Loader mLoader>
		//   27   57:ifnull          180
		//   28   60:aload_0         
		//   29   61:getfield        #139 <Field boolean mHaveData>
		//   30   64:ifeq            180
		//   31   67:iload_1         
		//   32   68:ifeq            180
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
			s = null;
		//   46  102:aconst_null     
		//   47  103:astore_2        
			if(mHost != null)
		//*  48  104:aload_0         
		//*  49  105:getfield        #41  <Field LoaderManagerImpl this$0>
		//*  50  108:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//*  51  111:ifnull          143
			{
				s = mHost.mFragmentManager.mNoTransactionsBecause;
		//   52  114:aload_0         
		//   53  115:getfield        #41  <Field LoaderManagerImpl this$0>
		//   54  118:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//   55  121:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
		//   56  124:getfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
		//   57  127:astore_2        
				mHost.mFragmentManager.mNoTransactionsBecause = "onLoaderReset";
		//   58  128:aload_0         
		//   59  129:getfield        #41  <Field LoaderManagerImpl this$0>
		//   60  132:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//   61  135:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
		//   62  138:ldc1            #143 <String "onLoaderReset">
		//   63  140:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
			}
			mCallbacks.onLoaderReset(mLoader);
		//   64  143:aload_0         
		//   65  144:getfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
		//   66  147:aload_0         
		//   67  148:getfield        #123 <Field Loader mLoader>
		//   68  151:invokeinterface #145 <Method void LoaderManager$LoaderCallbacks.onLoaderReset(Loader)>
			if(mHost != null)
		//*  69  156:aload_0         
		//*  70  157:getfield        #41  <Field LoaderManagerImpl this$0>
		//*  71  160:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//*  72  163:ifnull          180
				mHost.mFragmentManager.mNoTransactionsBecause = s;
		//   73  166:aload_0         
		//   74  167:getfield        #41  <Field LoaderManagerImpl this$0>
		//   75  170:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//   76  173:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
		//   77  176:aload_2         
		//   78  177:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
			mCallbacks = null;
		//   79  180:aload_0         
		//   80  181:aconst_null     
		//   81  182:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
			mData = null;
		//   82  185:aload_0         
		//   83  186:aconst_null     
		//   84  187:putfield        #147 <Field Object mData>
			mHaveData = false;
		//   85  190:aload_0         
		//   86  191:iconst_0        
		//   87  192:putfield        #139 <Field boolean mHaveData>
			if(mLoader != null)
		//*  88  195:aload_0         
		//*  89  196:getfield        #123 <Field Loader mLoader>
		//*  90  199:ifnull          237
			{
				if(mListenerRegistered)
		//*  91  202:aload_0         
		//*  92  203:getfield        #125 <Field boolean mListenerRegistered>
		//*  93  206:ifeq            230
				{
					mListenerRegistered = false;
		//   94  209:aload_0         
		//   95  210:iconst_0        
		//   96  211:putfield        #125 <Field boolean mListenerRegistered>
					mLoader.unregisterListener(((android.support.v4.content.Loader.OnLoadCompleteListener) (this)));
		//   97  214:aload_0         
		//   98  215:getfield        #123 <Field Loader mLoader>
		//   99  218:aload_0         
		//  100  219:invokevirtual   #151 <Method void Loader.unregisterListener(android.support.v4.content.Loader$OnLoadCompleteListener)>
					mLoader.unregisterOnLoadCanceledListener(((android.support.v4.content.Loader.OnLoadCanceledListener) (this)));
		//  101  222:aload_0         
		//  102  223:getfield        #123 <Field Loader mLoader>
		//  103  226:aload_0         
		//  104  227:invokevirtual   #155 <Method void Loader.unregisterOnLoadCanceledListener(android.support.v4.content.Loader$OnLoadCanceledListener)>
				}
				mLoader.reset();
		//  105  230:aload_0         
		//  106  231:getfield        #123 <Field Loader mLoader>
		//  107  234:invokevirtual   #158 <Method void Loader.reset()>
			}
			if(mPendingLoader != null)
		//* 108  237:aload_0         
		//* 109  238:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
		//* 110  241:ifnull          251
				mPendingLoader.destroy();
		//  111  244:aload_0         
		//  112  245:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
		//  113  248:invokevirtual   #162 <Method void destroy()>
			return;
		//  114  251:return          
			Exception exception;
			exception;
		//  115  252:astore_3        
			if(mHost != null)
		//* 116  253:aload_0         
		//* 117  254:getfield        #41  <Field LoaderManagerImpl this$0>
		//* 118  257:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//* 119  260:ifnull          277
				mHost.mFragmentManager.mNoTransactionsBecause = s;
		//  120  263:aload_0         
		//  121  264:getfield        #41  <Field LoaderManagerImpl this$0>
		//  122  267:getfield        #59  <Field FragmentHostCallback LoaderManagerImpl.mHost>
		//  123  270:getfield        #65  <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
		//  124  273:aload_2         
		//  125  274:putfield        #71  <Field String FragmentManagerImpl.mNoTransactionsBecause>
			throw exception;
		//  126  277:aload_3         
		//  127  278:athrow          
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
				installLoader(((LoaderInfo) (loader)));
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
			LoaderInfo loaderinfo = mPendingLoader;
		//   38   89:aload_0         
		//   39   90:getfield        #160 <Field LoaderManagerImpl$LoaderInfo mPendingLoader>
		//   40   93:astore_3        
			if(loaderinfo != null)
		//*  41   94:aload_3         
		//*  42   95:ifnull          162
			{
				if(LoaderManagerImpl.DEBUG)
		//*  43   98:getstatic       #76  <Field boolean LoaderManagerImpl.DEBUG>
		//*  44  101:ifeq            129
					Log.v("LoaderManager", (new StringBuilder()).append("  Switching to pending loader: ").append(((Object) (loaderinfo))).toString());
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
				installLoader(loaderinfo);
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
			loader = ((Loader) ((LoaderInfo)mInactiveLoaders.get(mId)));
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
				((LoaderInfo) (loader)).destroy();
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
						mLoader.registerListener(mId, ((android.support.v4.content.Loader.OnLoadCompleteListener) (this)));
		//   74  173:aload_0         
		//   75  174:getfield        #123 <Field Loader mLoader>
		//   76  177:aload_0         
		//   77  178:getfield        #46  <Field int mId>
		//   78  181:aload_0         
		//   79  182:invokevirtual   #321 <Method void Loader.registerListener(int, android.support.v4.content.Loader$OnLoadCompleteListener)>
						mLoader.registerOnLoadCanceledListener(((android.support.v4.content.Loader.OnLoadCanceledListener) (this)));
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
				mLoader.unregisterListener(((android.support.v4.content.Loader.OnLoadCompleteListener) (this)));
		//   28   63:aload_0         
		//   29   64:getfield        #123 <Field Loader mLoader>
		//   30   67:aload_0         
		//   31   68:invokevirtual   #151 <Method void Loader.unregisterListener(android.support.v4.content.Loader$OnLoadCompleteListener)>
				mLoader.unregisterOnLoadCanceledListener(((android.support.v4.content.Loader.OnLoadCanceledListener) (this)));
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
		LoaderManager.LoaderCallbacks mCallbacks;
		Object mData;
		boolean mDeliveredData;
		boolean mDestroyed;
		boolean mHaveData;
		final int mId;
		boolean mListenerRegistered;
		Loader mLoader;
		LoaderInfo mPendingLoader;
		boolean mReportNextStart;
		boolean mRetaining;
		boolean mRetainingStarted;
		boolean mStarted;
		final LoaderManagerImpl this$0;

		public LoaderInfo(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
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
			mCallbacks = loadercallbacks;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #50  <Field LoaderManager$LoaderCallbacks mCallbacks>
		//   14   25:return          
		}
	}


	LoaderManagerImpl(String s, FragmentHostCallback fragmenthostcallback, boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #34  <Method void LoaderManager()>
	//    2    4:aload_0         
	//    3    5:new             #36  <Class SparseArrayCompat>
	//    4    8:dup             
	//    5    9:invokespecial   #37  <Method void SparseArrayCompat()>
	//    6   12:putfield        #39  <Field SparseArrayCompat mLoaders>
	//    7   15:aload_0         
	//    8   16:new             #36  <Class SparseArrayCompat>
	//    9   19:dup             
	//   10   20:invokespecial   #37  <Method void SparseArrayCompat()>
	//   11   23:putfield        #41  <Field SparseArrayCompat mInactiveLoaders>
		mWho = s;
	//   12   26:aload_0         
	//   13   27:aload_1         
	//   14   28:putfield        #43  <Field String mWho>
		mHost = fragmenthostcallback;
	//   15   31:aload_0         
	//   16   32:aload_2         
	//   17   33:putfield        #45  <Field FragmentHostCallback mHost>
		mStarted = flag;
	//   18   36:aload_0         
	//   19   37:iload_3         
	//   20   38:putfield        #47  <Field boolean mStarted>
	//   21   41:return          
	}

	private LoaderInfo createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		mCreatingLoader = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #51  <Field boolean mCreatingLoader>
		bundle = ((Bundle) (createLoader(i, bundle, loadercallbacks)));
	//    3    5:aload_0         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:aload_3         
	//    7    9:invokespecial   #54  <Method LoaderManagerImpl$LoaderInfo createLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
	//    8   12:astore_2        
		installLoader(((LoaderInfo) (bundle)));
	//    9   13:aload_0         
	//   10   14:aload_2         
	//   11   15:invokevirtual   #58  <Method void installLoader(LoaderManagerImpl$LoaderInfo)>
		mCreatingLoader = false;
	//   12   18:aload_0         
	//   13   19:iconst_0        
	//   14   20:putfield        #51  <Field boolean mCreatingLoader>
		return ((LoaderInfo) (bundle));
	//   15   23:aload_2         
	//   16   24:areturn         
		bundle;
	//   17   25:astore_2        
		mCreatingLoader = false;
	//   18   26:aload_0         
	//   19   27:iconst_0        
	//   20   28:putfield        #51  <Field boolean mCreatingLoader>
		throw bundle;
	//   21   31:aload_2         
	//   22   32:athrow          
	}

	private LoaderInfo createLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		LoaderInfo loaderinfo = new LoaderInfo(i, bundle, loadercallbacks);
	//    0    0:new             #6   <Class LoaderManagerImpl$LoaderInfo>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:aload_2         
	//    5    7:aload_3         
	//    6    8:invokespecial   #63  <Method void LoaderManagerImpl$LoaderInfo(LoaderManagerImpl, int, Bundle, LoaderManager$LoaderCallbacks)>
	//    7   11:astore          4
		loaderinfo.mLoader = loadercallbacks.onCreateLoader(i, bundle);
	//    8   13:aload           4
	//    9   15:aload_3         
	//   10   16:iload_1         
	//   11   17:aload_2         
	//   12   18:invokeinterface #69  <Method Loader LoaderManager$LoaderCallbacks.onCreateLoader(int, Bundle)>
	//   13   23:putfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
		return loaderinfo;
	//   14   26:aload           4
	//   15   28:areturn         
	}

	public void destroyLoader(int i)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #77  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #79  <String "Called while creating a loader">
	//    6   13:invokespecial   #82  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(DEBUG)
	//*   8   17:getstatic       #29  <Field boolean DEBUG>
	//*   9   20:ifeq            57
			Log.v("LoaderManager", (new StringBuilder()).append("destroyLoader in ").append(((Object) (this))).append(" of ").append(i).toString());
	//   10   23:ldc1            #14  <String "LoaderManager">
	//   11   25:new             #84  <Class StringBuilder>
	//   12   28:dup             
	//   13   29:invokespecial   #85  <Method void StringBuilder()>
	//   14   32:ldc1            #87  <String "destroyLoader in ">
	//   15   34:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   16   37:aload_0         
	//   17   38:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   18   41:ldc1            #96  <String " of ">
	//   19   43:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   20   46:iload_1         
	//   21   47:invokevirtual   #99  <Method StringBuilder StringBuilder.append(int)>
	//   22   50:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   23   53:invokestatic    #109 <Method int Log.v(String, String)>
	//   24   56:pop             
		int j = mLoaders.indexOfKey(i);
	//   25   57:aload_0         
	//   26   58:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   27   61:iload_1         
	//   28   62:invokevirtual   #113 <Method int SparseArrayCompat.indexOfKey(int)>
	//   29   65:istore_2        
		if(j >= 0)
	//*  30   66:iload_2         
	//*  31   67:iflt            94
		{
			LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(j);
	//   32   70:aload_0         
	//   33   71:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   34   74:iload_2         
	//   35   75:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   36   78:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   37   81:astore_3        
			mLoaders.removeAt(j);
	//   38   82:aload_0         
	//   39   83:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   40   86:iload_2         
	//   41   87:invokevirtual   #120 <Method void SparseArrayCompat.removeAt(int)>
			loaderinfo.destroy();
	//   42   90:aload_3         
	//   43   91:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
		}
		i = mInactiveLoaders.indexOfKey(i);
	//   44   94:aload_0         
	//   45   95:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//   46   98:iload_1         
	//   47   99:invokevirtual   #113 <Method int SparseArrayCompat.indexOfKey(int)>
	//   48  102:istore_1        
		if(i >= 0)
	//*  49  103:iload_1         
	//*  50  104:iflt            131
		{
			LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.valueAt(i);
	//   51  107:aload_0         
	//   52  108:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//   53  111:iload_1         
	//   54  112:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   55  115:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   56  118:astore_3        
			mInactiveLoaders.removeAt(i);
	//   57  119:aload_0         
	//   58  120:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//   59  123:iload_1         
	//   60  124:invokevirtual   #120 <Method void SparseArrayCompat.removeAt(int)>
			loaderinfo1.destroy();
	//   61  127:aload_3         
	//   62  128:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
		}
		if(mHost != null && !hasRunningLoaders())
	//*  63  131:aload_0         
	//*  64  132:getfield        #45  <Field FragmentHostCallback mHost>
	//*  65  135:ifnull          155
	//*  66  138:aload_0         
	//*  67  139:invokevirtual   #127 <Method boolean hasRunningLoaders()>
	//*  68  142:ifne            155
			mHost.mFragmentManager.startPendingDeferredFragments();
	//   69  145:aload_0         
	//   70  146:getfield        #45  <Field FragmentHostCallback mHost>
	//   71  149:getfield        #133 <Field FragmentManagerImpl FragmentHostCallback.mFragmentManager>
	//   72  152:invokevirtual   #138 <Method void FragmentManagerImpl.startPendingDeferredFragments()>
	//   73  155:return          
	}

	void doDestroy()
	{
		if(!mRetaining)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field boolean mRetaining>
	//*   2    4:ifne            80
		{
			if(DEBUG)
	//*   3    7:getstatic       #29  <Field boolean DEBUG>
	//*   4   10:ifeq            38
				Log.v("LoaderManager", (new StringBuilder()).append("Destroying Active in ").append(((Object) (this))).toString());
	//    5   13:ldc1            #14  <String "LoaderManager">
	//    6   15:new             #84  <Class StringBuilder>
	//    7   18:dup             
	//    8   19:invokespecial   #85  <Method void StringBuilder()>
	//    9   22:ldc1            #143 <String "Destroying Active in ">
	//   10   24:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #109 <Method int Log.v(String, String)>
	//   15   37:pop             
			for(int i = mLoaders.size() - 1; i >= 0; i--)
	//*  16   38:aload_0         
	//*  17   39:getfield        #39  <Field SparseArrayCompat mLoaders>
	//*  18   42:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*  19   45:iconst_1        
	//*  20   46:isub            
	//*  21   47:istore_1        
	//*  22   48:iload_1         
	//*  23   49:iflt            73
				((LoaderInfo)mLoaders.valueAt(i)).destroy();
	//   24   52:aload_0         
	//   25   53:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   26   56:iload_1         
	//   27   57:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   28   60:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   29   63:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>

	//   30   66:iload_1         
	//   31   67:iconst_1        
	//   32   68:isub            
	//   33   69:istore_1        
	//*  34   70:goto            48
			mLoaders.clear();
	//   35   73:aload_0         
	//   36   74:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   37   77:invokevirtual   #150 <Method void SparseArrayCompat.clear()>
		}
		if(DEBUG)
	//*  38   80:getstatic       #29  <Field boolean DEBUG>
	//*  39   83:ifeq            111
			Log.v("LoaderManager", (new StringBuilder()).append("Destroying Inactive in ").append(((Object) (this))).toString());
	//   40   86:ldc1            #14  <String "LoaderManager">
	//   41   88:new             #84  <Class StringBuilder>
	//   42   91:dup             
	//   43   92:invokespecial   #85  <Method void StringBuilder()>
	//   44   95:ldc1            #152 <String "Destroying Inactive in ">
	//   45   97:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   46  100:aload_0         
	//   47  101:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   48  104:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   49  107:invokestatic    #109 <Method int Log.v(String, String)>
	//   50  110:pop             
		for(int j = mInactiveLoaders.size() - 1; j >= 0; j--)
	//*  51  111:aload_0         
	//*  52  112:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//*  53  115:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*  54  118:iconst_1        
	//*  55  119:isub            
	//*  56  120:istore_1        
	//*  57  121:iload_1         
	//*  58  122:iflt            146
			((LoaderInfo)mInactiveLoaders.valueAt(j)).destroy();
	//   59  125:aload_0         
	//   60  126:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//   61  129:iload_1         
	//   62  130:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   63  133:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   64  136:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>

	//   65  139:iload_1         
	//   66  140:iconst_1        
	//   67  141:isub            
	//   68  142:istore_1        
	//*  69  143:goto            121
		mInactiveLoaders.clear();
	//   70  146:aload_0         
	//   71  147:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//   72  150:invokevirtual   #150 <Method void SparseArrayCompat.clear()>
		mHost = null;
	//   73  153:aload_0         
	//   74  154:aconst_null     
	//   75  155:putfield        #45  <Field FragmentHostCallback mHost>
	//   76  158:return          
	}

	void doReportNextStart()
	{
		for(int i = mLoaders.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field SparseArrayCompat mLoaders>
	//*   2    4:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            36
			((LoaderInfo)mLoaders.valueAt(i)).mReportNextStart = true;
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   12   22:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   25:iconst_1        
	//   14   26:putfield        #156 <Field boolean LoaderManagerImpl$LoaderInfo.mReportNextStart>

	//   15   29:iload_1         
	//   16   30:iconst_1        
	//   17   31:isub            
	//   18   32:istore_1        
	//*  19   33:goto            10
	//   20   36:return          
	}

	void doReportStart()
	{
		for(int i = mLoaders.size() - 1; i >= 0; i--)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field SparseArrayCompat mLoaders>
	//*   2    4:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*   3    7:iconst_1        
	//*   4    8:isub            
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:iflt            35
			((LoaderInfo)mLoaders.valueAt(i)).reportStart();
	//    8   14:aload_0         
	//    9   15:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   10   18:iload_1         
	//   11   19:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   12   22:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   25:invokevirtual   #160 <Method void LoaderManagerImpl$LoaderInfo.reportStart()>

	//   14   28:iload_1         
	//   15   29:iconst_1        
	//   16   30:isub            
	//   17   31:istore_1        
	//*  18   32:goto            10
	//   19   35:return          
	}

	void doRetain()
	{
		if(DEBUG)
	//*   0    0:getstatic       #29  <Field boolean DEBUG>
	//*   1    3:ifeq            31
			Log.v("LoaderManager", (new StringBuilder()).append("Retaining in ").append(((Object) (this))).toString());
	//    2    6:ldc1            #14  <String "LoaderManager">
	//    3    8:new             #84  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #85  <Method void StringBuilder()>
	//    6   15:ldc1            #163 <String "Retaining in ">
	//    7   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   10   24:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   11   27:invokestatic    #109 <Method int Log.v(String, String)>
	//   12   30:pop             
		if(!mStarted)
	//*  13   31:aload_0         
	//*  14   32:getfield        #47  <Field boolean mStarted>
	//*  15   35:ifne            80
		{
			RuntimeException runtimeexception = new RuntimeException("here");
	//   16   38:new             #165 <Class RuntimeException>
	//   17   41:dup             
	//   18   42:ldc1            #167 <String "here">
	//   19   44:invokespecial   #168 <Method void RuntimeException(String)>
	//   20   47:astore_2        
			runtimeexception.fillInStackTrace();
	//   21   48:aload_2         
	//   22   49:invokevirtual   #172 <Method Throwable RuntimeException.fillInStackTrace()>
	//   23   52:pop             
			Log.w("LoaderManager", (new StringBuilder()).append("Called doRetain when not started: ").append(((Object) (this))).toString(), ((Throwable) (runtimeexception)));
	//   24   53:ldc1            #14  <String "LoaderManager">
	//   25   55:new             #84  <Class StringBuilder>
	//   26   58:dup             
	//   27   59:invokespecial   #85  <Method void StringBuilder()>
	//   28   62:ldc1            #174 <String "Called doRetain when not started: ">
	//   29   64:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   30   67:aload_0         
	//   31   68:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   32   71:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   33   74:aload_2         
	//   34   75:invokestatic    #178 <Method int Log.w(String, String, Throwable)>
	//   35   78:pop             
		} else
	//*  36   79:return          
		{
			mRetaining = true;
	//   37   80:aload_0         
	//   38   81:iconst_1        
	//   39   82:putfield        #141 <Field boolean mRetaining>
			mStarted = false;
	//   40   85:aload_0         
	//   41   86:iconst_0        
	//   42   87:putfield        #47  <Field boolean mStarted>
			int i = mLoaders.size() - 1;
	//   43   90:aload_0         
	//   44   91:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   45   94:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//   46   97:iconst_1        
	//   47   98:isub            
	//   48   99:istore_1        
			while(i >= 0) 
	//*  49  100:iload_1         
	//*  50  101:iflt            79
			{
				((LoaderInfo)mLoaders.valueAt(i)).retain();
	//   51  104:aload_0         
	//   52  105:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   53  108:iload_1         
	//   54  109:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   55  112:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   56  115:invokevirtual   #181 <Method void LoaderManagerImpl$LoaderInfo.retain()>
				i--;
	//   57  118:iload_1         
	//   58  119:iconst_1        
	//   59  120:isub            
	//   60  121:istore_1        
			}
		}
	//*  61  122:goto            100
	}

	void doStart()
	{
		if(DEBUG)
	//*   0    0:getstatic       #29  <Field boolean DEBUG>
	//*   1    3:ifeq            31
			Log.v("LoaderManager", (new StringBuilder()).append("Starting in ").append(((Object) (this))).toString());
	//    2    6:ldc1            #14  <String "LoaderManager">
	//    3    8:new             #84  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #85  <Method void StringBuilder()>
	//    6   15:ldc1            #184 <String "Starting in ">
	//    7   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   10   24:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   11   27:invokestatic    #109 <Method int Log.v(String, String)>
	//   12   30:pop             
		if(mStarted)
	//*  13   31:aload_0         
	//*  14   32:getfield        #47  <Field boolean mStarted>
	//*  15   35:ifeq            80
		{
			RuntimeException runtimeexception = new RuntimeException("here");
	//   16   38:new             #165 <Class RuntimeException>
	//   17   41:dup             
	//   18   42:ldc1            #167 <String "here">
	//   19   44:invokespecial   #168 <Method void RuntimeException(String)>
	//   20   47:astore_2        
			runtimeexception.fillInStackTrace();
	//   21   48:aload_2         
	//   22   49:invokevirtual   #172 <Method Throwable RuntimeException.fillInStackTrace()>
	//   23   52:pop             
			Log.w("LoaderManager", (new StringBuilder()).append("Called doStart when already started: ").append(((Object) (this))).toString(), ((Throwable) (runtimeexception)));
	//   24   53:ldc1            #14  <String "LoaderManager">
	//   25   55:new             #84  <Class StringBuilder>
	//   26   58:dup             
	//   27   59:invokespecial   #85  <Method void StringBuilder()>
	//   28   62:ldc1            #186 <String "Called doStart when already started: ">
	//   29   64:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   30   67:aload_0         
	//   31   68:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   32   71:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   33   74:aload_2         
	//   34   75:invokestatic    #178 <Method int Log.w(String, String, Throwable)>
	//   35   78:pop             
		} else
	//*  36   79:return          
		{
			mStarted = true;
	//   37   80:aload_0         
	//   38   81:iconst_1        
	//   39   82:putfield        #47  <Field boolean mStarted>
			int i = mLoaders.size() - 1;
	//   40   85:aload_0         
	//   41   86:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   42   89:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//   43   92:iconst_1        
	//   44   93:isub            
	//   45   94:istore_1        
			while(i >= 0) 
	//*  46   95:iload_1         
	//*  47   96:iflt            79
			{
				((LoaderInfo)mLoaders.valueAt(i)).start();
	//   48   99:aload_0         
	//   49  100:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   50  103:iload_1         
	//   51  104:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   52  107:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   53  110:invokevirtual   #189 <Method void LoaderManagerImpl$LoaderInfo.start()>
				i--;
	//   54  113:iload_1         
	//   55  114:iconst_1        
	//   56  115:isub            
	//   57  116:istore_1        
			}
		}
	//*  58  117:goto            95
	}

	void doStop()
	{
		if(DEBUG)
	//*   0    0:getstatic       #29  <Field boolean DEBUG>
	//*   1    3:ifeq            31
			Log.v("LoaderManager", (new StringBuilder()).append("Stopping in ").append(((Object) (this))).toString());
	//    2    6:ldc1            #14  <String "LoaderManager">
	//    3    8:new             #84  <Class StringBuilder>
	//    4   11:dup             
	//    5   12:invokespecial   #85  <Method void StringBuilder()>
	//    6   15:ldc1            #192 <String "Stopping in ">
	//    7   17:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   20:aload_0         
	//    9   21:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   10   24:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   11   27:invokestatic    #109 <Method int Log.v(String, String)>
	//   12   30:pop             
		if(!mStarted)
	//*  13   31:aload_0         
	//*  14   32:getfield        #47  <Field boolean mStarted>
	//*  15   35:ifne            80
		{
			RuntimeException runtimeexception = new RuntimeException("here");
	//   16   38:new             #165 <Class RuntimeException>
	//   17   41:dup             
	//   18   42:ldc1            #167 <String "here">
	//   19   44:invokespecial   #168 <Method void RuntimeException(String)>
	//   20   47:astore_2        
			runtimeexception.fillInStackTrace();
	//   21   48:aload_2         
	//   22   49:invokevirtual   #172 <Method Throwable RuntimeException.fillInStackTrace()>
	//   23   52:pop             
			Log.w("LoaderManager", (new StringBuilder()).append("Called doStop when not started: ").append(((Object) (this))).toString(), ((Throwable) (runtimeexception)));
	//   24   53:ldc1            #14  <String "LoaderManager">
	//   25   55:new             #84  <Class StringBuilder>
	//   26   58:dup             
	//   27   59:invokespecial   #85  <Method void StringBuilder()>
	//   28   62:ldc1            #194 <String "Called doStop when not started: ">
	//   29   64:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   30   67:aload_0         
	//   31   68:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   32   71:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   33   74:aload_2         
	//   34   75:invokestatic    #178 <Method int Log.w(String, String, Throwable)>
	//   35   78:pop             
			return;
	//   36   79:return          
		}
		for(int i = mLoaders.size() - 1; i >= 0; i--)
	//*  37   80:aload_0         
	//*  38   81:getfield        #39  <Field SparseArrayCompat mLoaders>
	//*  39   84:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*  40   87:iconst_1        
	//*  41   88:isub            
	//*  42   89:istore_1        
	//*  43   90:iload_1         
	//*  44   91:iflt            115
			((LoaderInfo)mLoaders.valueAt(i)).stop();
	//   45   94:aload_0         
	//   46   95:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   47   98:iload_1         
	//   48   99:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   49  102:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   50  105:invokevirtual   #197 <Method void LoaderManagerImpl$LoaderInfo.stop()>

	//   51  108:iload_1         
	//   52  109:iconst_1        
	//   53  110:isub            
	//   54  111:istore_1        
	//*  55  112:goto            90
		mStarted = false;
	//   56  115:aload_0         
	//   57  116:iconst_0        
	//   58  117:putfield        #47  <Field boolean mStarted>
	//   59  120:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		if(mLoaders.size() > 0)
	//*   0    0:aload_0         
	//*   1    1:getfield        #39  <Field SparseArrayCompat mLoaders>
	//*   2    4:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*   3    7:ifle            130
		{
			printwriter.print(s);
	//    4   10:aload_3         
	//    5   11:aload_1         
	//    6   12:invokevirtual   #204 <Method void PrintWriter.print(String)>
			printwriter.println("Active Loaders:");
	//    7   15:aload_3         
	//    8   16:ldc1            #206 <String "Active Loaders:">
	//    9   18:invokevirtual   #209 <Method void PrintWriter.println(String)>
			String s1 = (new StringBuilder()).append(s).append("    ").toString();
	//   10   21:new             #84  <Class StringBuilder>
	//   11   24:dup             
	//   12   25:invokespecial   #85  <Method void StringBuilder()>
	//   13   28:aload_1         
	//   14   29:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   15   32:ldc1            #211 <String "    ">
	//   16   34:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   18   40:astore          6
			for(int i = 0; i < mLoaders.size(); i++)
	//*  19   42:iconst_0        
	//*  20   43:istore          5
	//*  21   45:iload           5
	//*  22   47:aload_0         
	//*  23   48:getfield        #39  <Field SparseArrayCompat mLoaders>
	//*  24   51:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*  25   54:icmpge          130
			{
				LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(i);
	//   26   57:aload_0         
	//   27   58:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   28   61:iload           5
	//   29   63:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   30   66:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   31   69:astore          7
				printwriter.print(s);
	//   32   71:aload_3         
	//   33   72:aload_1         
	//   34   73:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//   35   76:aload_3         
	//   36   77:ldc1            #213 <String "  #">
	//   37   79:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.print(mLoaders.keyAt(i));
	//   38   82:aload_3         
	//   39   83:aload_0         
	//   40   84:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   41   87:iload           5
	//   42   89:invokevirtual   #216 <Method int SparseArrayCompat.keyAt(int)>
	//   43   92:invokevirtual   #218 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//   44   95:aload_3         
	//   45   96:ldc1            #220 <String ": ">
	//   46   98:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.println(loaderinfo.toString());
	//   47  101:aload_3         
	//   48  102:aload           7
	//   49  104:invokevirtual   #221 <Method String LoaderManagerImpl$LoaderInfo.toString()>
	//   50  107:invokevirtual   #209 <Method void PrintWriter.println(String)>
				loaderinfo.dump(s1, filedescriptor, printwriter, as);
	//   51  110:aload           7
	//   52  112:aload           6
	//   53  114:aload_2         
	//   54  115:aload_3         
	//   55  116:aload           4
	//   56  118:invokevirtual   #223 <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
			}

	//   57  121:iload           5
	//   58  123:iconst_1        
	//   59  124:iadd            
	//   60  125:istore          5
		}
	//*  61  127:goto            45
		if(mInactiveLoaders.size() > 0)
	//*  62  130:aload_0         
	//*  63  131:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//*  64  134:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*  65  137:ifle            260
		{
			printwriter.print(s);
	//   66  140:aload_3         
	//   67  141:aload_1         
	//   68  142:invokevirtual   #204 <Method void PrintWriter.print(String)>
			printwriter.println("Inactive Loaders:");
	//   69  145:aload_3         
	//   70  146:ldc1            #225 <String "Inactive Loaders:">
	//   71  148:invokevirtual   #209 <Method void PrintWriter.println(String)>
			String s2 = (new StringBuilder()).append(s).append("    ").toString();
	//   72  151:new             #84  <Class StringBuilder>
	//   73  154:dup             
	//   74  155:invokespecial   #85  <Method void StringBuilder()>
	//   75  158:aload_1         
	//   76  159:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   77  162:ldc1            #211 <String "    ">
	//   78  164:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   79  167:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   80  170:astore          6
			for(int j = 0; j < mInactiveLoaders.size(); j++)
	//*  81  172:iconst_0        
	//*  82  173:istore          5
	//*  83  175:iload           5
	//*  84  177:aload_0         
	//*  85  178:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//*  86  181:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*  87  184:icmpge          260
			{
				LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.valueAt(j);
	//   88  187:aload_0         
	//   89  188:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//   90  191:iload           5
	//   91  193:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   92  196:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   93  199:astore          7
				printwriter.print(s);
	//   94  201:aload_3         
	//   95  202:aload_1         
	//   96  203:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.print("  #");
	//   97  206:aload_3         
	//   98  207:ldc1            #213 <String "  #">
	//   99  209:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.print(mInactiveLoaders.keyAt(j));
	//  100  212:aload_3         
	//  101  213:aload_0         
	//  102  214:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//  103  217:iload           5
	//  104  219:invokevirtual   #216 <Method int SparseArrayCompat.keyAt(int)>
	//  105  222:invokevirtual   #218 <Method void PrintWriter.print(int)>
				printwriter.print(": ");
	//  106  225:aload_3         
	//  107  226:ldc1            #220 <String ": ">
	//  108  228:invokevirtual   #204 <Method void PrintWriter.print(String)>
				printwriter.println(loaderinfo1.toString());
	//  109  231:aload_3         
	//  110  232:aload           7
	//  111  234:invokevirtual   #221 <Method String LoaderManagerImpl$LoaderInfo.toString()>
	//  112  237:invokevirtual   #209 <Method void PrintWriter.println(String)>
				loaderinfo1.dump(s2, filedescriptor, printwriter, as);
	//  113  240:aload           7
	//  114  242:aload           6
	//  115  244:aload_2         
	//  116  245:aload_3         
	//  117  246:aload           4
	//  118  248:invokevirtual   #223 <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
			}

	//  119  251:iload           5
	//  120  253:iconst_1        
	//  121  254:iadd            
	//  122  255:istore          5
		}
	//* 123  257:goto            175
	//  124  260:return          
	}

	void finishRetain()
	{
		if(mRetaining)
	//*   0    0:aload_0         
	//*   1    1:getfield        #141 <Field boolean mRetaining>
	//*   2    4:ifeq            78
		{
			if(DEBUG)
	//*   3    7:getstatic       #29  <Field boolean DEBUG>
	//*   4   10:ifeq            38
				Log.v("LoaderManager", (new StringBuilder()).append("Finished Retaining in ").append(((Object) (this))).toString());
	//    5   13:ldc1            #14  <String "LoaderManager">
	//    6   15:new             #84  <Class StringBuilder>
	//    7   18:dup             
	//    8   19:invokespecial   #85  <Method void StringBuilder()>
	//    9   22:ldc1            #228 <String "Finished Retaining in ">
	//   10   24:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   11   27:aload_0         
	//   12   28:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   13   31:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   14   34:invokestatic    #109 <Method int Log.v(String, String)>
	//   15   37:pop             
			mRetaining = false;
	//   16   38:aload_0         
	//   17   39:iconst_0        
	//   18   40:putfield        #141 <Field boolean mRetaining>
			for(int i = mLoaders.size() - 1; i >= 0; i--)
	//*  19   43:aload_0         
	//*  20   44:getfield        #39  <Field SparseArrayCompat mLoaders>
	//*  21   47:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//*  22   50:iconst_1        
	//*  23   51:isub            
	//*  24   52:istore_1        
	//*  25   53:iload_1         
	//*  26   54:iflt            78
				((LoaderInfo)mLoaders.valueAt(i)).finishRetain();
	//   27   57:aload_0         
	//   28   58:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   29   61:iload_1         
	//   30   62:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   31   65:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   32   68:invokevirtual   #230 <Method void LoaderManagerImpl$LoaderInfo.finishRetain()>

	//   33   71:iload_1         
	//   34   72:iconst_1        
	//   35   73:isub            
	//   36   74:istore_1        
		}
	//*  37   75:goto            53
	//   38   78:return          
	}

	public Loader getLoader(int i)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #77  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #79  <String "Called while creating a loader">
	//    6   13:invokespecial   #82  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
	//    8   17:aload_0         
	//    9   18:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #235 <Method Object SparseArrayCompat.get(int)>
	//   12   25:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   28:astore_2        
		if(loaderinfo != null)
	//*  14   29:aload_2         
	//*  15   30:ifnull          53
		{
			if(loaderinfo.mPendingLoader != null)
	//*  16   33:aload_2         
	//*  17   34:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//*  18   37:ifnull          48
				return loaderinfo.mPendingLoader.mLoader;
	//   19   40:aload_2         
	//   20   41:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//   21   44:getfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
	//   22   47:areturn         
			else
				return loaderinfo.mLoader;
	//   23   48:aload_2         
	//   24   49:getfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
	//   25   52:areturn         
		} else
		{
			return null;
	//   26   53:aconst_null     
	//   27   54:areturn         
		}
	}

	public boolean hasRunningLoaders()
	{
		boolean flag1 = false;
	//    0    0:iconst_0        
	//    1    1:istore          4
		int j = mLoaders.size();
	//    2    3:aload_0         
	//    3    4:getfield        #39  <Field SparseArrayCompat mLoaders>
	//    4    7:invokevirtual   #147 <Method int SparseArrayCompat.size()>
	//    5   10:istore_3        
		int i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_1        
		while(i < j) 
	//*   8   13:iload_1         
	//*   9   14:iload_3         
	//*  10   15:icmpge          67
		{
			LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(i);
	//   11   18:aload_0         
	//   12   19:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   13   22:iload_1         
	//   14   23:invokevirtual   #117 <Method Object SparseArrayCompat.valueAt(int)>
	//   15   26:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   16   29:astore          5
			boolean flag;
			if(loaderinfo.mStarted && !loaderinfo.mDeliveredData)
	//*  17   31:aload           5
	//*  18   33:getfield        #241 <Field boolean LoaderManagerImpl$LoaderInfo.mStarted>
	//*  19   36:ifeq            62
	//*  20   39:aload           5
	//*  21   41:getfield        #244 <Field boolean LoaderManagerImpl$LoaderInfo.mDeliveredData>
	//*  22   44:ifne            62
				flag = true;
	//   23   47:iconst_1        
	//   24   48:istore_2        
			else
	//*  25   49:iload           4
	//*  26   51:iload_2         
	//*  27   52:ior             
	//*  28   53:istore          4
	//*  29   55:iload_1         
	//*  30   56:iconst_1        
	//*  31   57:iadd            
	//*  32   58:istore_1        
	//*  33   59:goto            13
				flag = false;
	//   34   62:iconst_0        
	//   35   63:istore_2        
			flag1 |= flag;
			i++;
		}
	//*  36   64:goto            49
		return flag1;
	//   37   67:iload           4
	//   38   69:ireturn         
	}

	public Loader initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #77  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #79  <String "Called while creating a loader">
	//    6   13:invokespecial   #82  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
	//    8   17:aload_0         
	//    9   18:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #235 <Method Object SparseArrayCompat.get(int)>
	//   12   25:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   28:astore          4
		if(DEBUG)
	//*  14   30:getstatic       #29  <Field boolean DEBUG>
	//*  15   33:ifeq            70
			Log.v("LoaderManager", (new StringBuilder()).append("initLoader in ").append(((Object) (this))).append(": args=").append(((Object) (bundle))).toString());
	//   16   36:ldc1            #14  <String "LoaderManager">
	//   17   38:new             #84  <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #85  <Method void StringBuilder()>
	//   20   45:ldc1            #248 <String "initLoader in ">
	//   21   47:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   22   50:aload_0         
	//   23   51:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   24   54:ldc1            #250 <String ": args=">
	//   25   56:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   26   59:aload_2         
	//   27   60:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   28   63:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   29   66:invokestatic    #109 <Method int Log.v(String, String)>
	//   30   69:pop             
		if(loaderinfo == null)
	//*  31   70:aload           4
	//*  32   72:ifnonnull       149
		{
			loadercallbacks = ((LoaderManager.LoaderCallbacks) (createAndInstallLoader(i, bundle, loadercallbacks)));
	//   33   75:aload_0         
	//   34   76:iload_1         
	//   35   77:aload_2         
	//   36   78:aload_3         
	//   37   79:invokespecial   #252 <Method LoaderManagerImpl$LoaderInfo createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
	//   38   82:astore_3        
			bundle = ((Bundle) (loadercallbacks));
	//   39   83:aload_3         
	//   40   84:astore_2        
			if(DEBUG)
	//*  41   85:getstatic       #29  <Field boolean DEBUG>
	//*  42   88:ifeq            118
			{
				Log.v("LoaderManager", (new StringBuilder()).append("  Created new loader ").append(((Object) (loadercallbacks))).toString());
	//   43   91:ldc1            #14  <String "LoaderManager">
	//   44   93:new             #84  <Class StringBuilder>
	//   45   96:dup             
	//   46   97:invokespecial   #85  <Method void StringBuilder()>
	//   47  100:ldc1            #254 <String "  Created new loader ">
	//   48  102:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   49  105:aload_3         
	//   50  106:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   51  109:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   52  112:invokestatic    #109 <Method int Log.v(String, String)>
	//   53  115:pop             
				bundle = ((Bundle) (loadercallbacks));
	//   54  116:aload_3         
	//   55  117:astore_2        
			}
		} else
	//*  56  118:aload_2         
	//*  57  119:getfield        #257 <Field boolean LoaderManagerImpl$LoaderInfo.mHaveData>
	//*  58  122:ifeq            144
	//*  59  125:aload_0         
	//*  60  126:getfield        #47  <Field boolean mStarted>
	//*  61  129:ifeq            144
	//*  62  132:aload_2         
	//*  63  133:aload_2         
	//*  64  134:getfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
	//*  65  137:aload_2         
	//*  66  138:getfield        #261 <Field Object LoaderManagerImpl$LoaderInfo.mData>
	//*  67  141:invokevirtual   #265 <Method void LoaderManagerImpl$LoaderInfo.callOnLoadFinished(Loader, Object)>
	//*  68  144:aload_2         
	//*  69  145:getfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
	//*  70  148:areturn         
		{
			if(DEBUG)
	//*  71  149:getstatic       #29  <Field boolean DEBUG>
	//*  72  152:ifeq            182
				Log.v("LoaderManager", (new StringBuilder()).append("  Re-using existing loader ").append(((Object) (loaderinfo))).toString());
	//   73  155:ldc1            #14  <String "LoaderManager">
	//   74  157:new             #84  <Class StringBuilder>
	//   75  160:dup             
	//   76  161:invokespecial   #85  <Method void StringBuilder()>
	//   77  164:ldc2            #267 <String "  Re-using existing loader ">
	//   78  167:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   79  170:aload           4
	//   80  172:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   81  175:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   82  178:invokestatic    #109 <Method int Log.v(String, String)>
	//   83  181:pop             
			loaderinfo.mCallbacks = loadercallbacks;
	//   84  182:aload           4
	//   85  184:aload_3         
	//   86  185:putfield        #271 <Field LoaderManager$LoaderCallbacks LoaderManagerImpl$LoaderInfo.mCallbacks>
			bundle = ((Bundle) (loaderinfo));
	//   87  188:aload           4
	//   88  190:astore_2        
		}
		if(((LoaderInfo) (bundle)).mHaveData && mStarted)
			((LoaderInfo) (bundle)).callOnLoadFinished(((LoaderInfo) (bundle)).mLoader, ((LoaderInfo) (bundle)).mData);
		return ((LoaderInfo) (bundle)).mLoader;
	//*  89  191:goto            118
	}

	void installLoader(LoaderInfo loaderinfo)
	{
		mLoaders.put(loaderinfo.mId, ((Object) (loaderinfo)));
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field SparseArrayCompat mLoaders>
	//    2    4:aload_1         
	//    3    5:getfield        #276 <Field int LoaderManagerImpl$LoaderInfo.mId>
	//    4    8:aload_1         
	//    5    9:invokevirtual   #280 <Method void SparseArrayCompat.put(int, Object)>
		if(mStarted)
	//*   6   12:aload_0         
	//*   7   13:getfield        #47  <Field boolean mStarted>
	//*   8   16:ifeq            23
			loaderinfo.start();
	//    9   19:aload_1         
	//   10   20:invokevirtual   #189 <Method void LoaderManagerImpl$LoaderInfo.start()>
	//   11   23:return          
	}

	public Loader restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #51  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #77  <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #79  <String "Called while creating a loader">
	//    6   13:invokespecial   #82  <Method void IllegalStateException(String)>
	//    7   16:athrow          
		LoaderInfo loaderinfo = (LoaderInfo)mLoaders.get(i);
	//    8   17:aload_0         
	//    9   18:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #235 <Method Object SparseArrayCompat.get(int)>
	//   12   25:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   13   28:astore          4
		if(DEBUG)
	//*  14   30:getstatic       #29  <Field boolean DEBUG>
	//*  15   33:ifeq            71
			Log.v("LoaderManager", (new StringBuilder()).append("restartLoader in ").append(((Object) (this))).append(": args=").append(((Object) (bundle))).toString());
	//   16   36:ldc1            #14  <String "LoaderManager">
	//   17   38:new             #84  <Class StringBuilder>
	//   18   41:dup             
	//   19   42:invokespecial   #85  <Method void StringBuilder()>
	//   20   45:ldc2            #283 <String "restartLoader in ">
	//   21   48:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   22   51:aload_0         
	//   23   52:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   24   55:ldc1            #250 <String ": args=">
	//   25   57:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   26   60:aload_2         
	//   27   61:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   28   64:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   29   67:invokestatic    #109 <Method int Log.v(String, String)>
	//   30   70:pop             
		if(loaderinfo != null)
	//*  31   71:aload           4
	//*  32   73:ifnull          164
		{
			LoaderInfo loaderinfo1 = (LoaderInfo)mInactiveLoaders.get(i);
	//   33   76:aload_0         
	//   34   77:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//   35   80:iload_1         
	//   36   81:invokevirtual   #235 <Method Object SparseArrayCompat.get(int)>
	//   37   84:checkcast       #6   <Class LoaderManagerImpl$LoaderInfo>
	//   38   87:astore          5
			if(loaderinfo1 != null)
	//*  39   89:aload           5
	//*  40   91:ifnull          324
			{
				if(loaderinfo.mHaveData)
	//*  41   94:aload           4
	//*  42   96:getfield        #257 <Field boolean LoaderManagerImpl$LoaderInfo.mHaveData>
	//*  43   99:ifeq            175
				{
					if(DEBUG)
	//*  44  102:getstatic       #29  <Field boolean DEBUG>
	//*  45  105:ifeq            135
						Log.v("LoaderManager", (new StringBuilder()).append("  Removing last inactive loader: ").append(((Object) (loaderinfo))).toString());
	//   46  108:ldc1            #14  <String "LoaderManager">
	//   47  110:new             #84  <Class StringBuilder>
	//   48  113:dup             
	//   49  114:invokespecial   #85  <Method void StringBuilder()>
	//   50  117:ldc2            #285 <String "  Removing last inactive loader: ">
	//   51  120:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   52  123:aload           4
	//   53  125:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//   54  128:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   55  131:invokestatic    #109 <Method int Log.v(String, String)>
	//   56  134:pop             
					loaderinfo1.mDeliveredData = false;
	//   57  135:aload           5
	//   58  137:iconst_0        
	//   59  138:putfield        #244 <Field boolean LoaderManagerImpl$LoaderInfo.mDeliveredData>
					loaderinfo1.destroy();
	//   60  141:aload           5
	//   61  143:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
					loaderinfo.mLoader.abandon();
	//   62  146:aload           4
	//   63  148:getfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
	//   64  151:invokevirtual   #290 <Method void Loader.abandon()>
					mInactiveLoaders.put(i, ((Object) (loaderinfo)));
	//   65  154:aload_0         
	//   66  155:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//   67  158:iload_1         
	//   68  159:aload           4
	//   69  161:invokevirtual   #280 <Method void SparseArrayCompat.put(int, Object)>
				} else
	//*  70  164:aload_0         
	//*  71  165:iload_1         
	//*  72  166:aload_2         
	//*  73  167:aload_3         
	//*  74  168:invokespecial   #252 <Method LoaderManagerImpl$LoaderInfo createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
	//*  75  171:getfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
	//*  76  174:areturn         
				if(!loaderinfo.cancel())
	//*  77  175:aload           4
	//*  78  177:invokevirtual   #293 <Method boolean LoaderManagerImpl$LoaderInfo.cancel()>
	//*  79  180:ifne            215
				{
					if(DEBUG)
	//*  80  183:getstatic       #29  <Field boolean DEBUG>
	//*  81  186:ifeq            198
						Log.v("LoaderManager", "  Current loader is stopped; replacing");
	//   82  189:ldc1            #14  <String "LoaderManager">
	//   83  191:ldc2            #295 <String "  Current loader is stopped; replacing">
	//   84  194:invokestatic    #109 <Method int Log.v(String, String)>
	//   85  197:pop             
					mLoaders.put(i, ((Object) (null)));
	//   86  198:aload_0         
	//   87  199:getfield        #39  <Field SparseArrayCompat mLoaders>
	//   88  202:iload_1         
	//   89  203:aconst_null     
	//   90  204:invokevirtual   #280 <Method void SparseArrayCompat.put(int, Object)>
					loaderinfo.destroy();
	//   91  207:aload           4
	//   92  209:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
				} else
	//*  93  212:goto            164
				{
					if(DEBUG)
	//*  94  215:getstatic       #29  <Field boolean DEBUG>
	//*  95  218:ifeq            230
						Log.v("LoaderManager", "  Current loader is running; configuring pending loader");
	//   96  221:ldc1            #14  <String "LoaderManager">
	//   97  223:ldc2            #297 <String "  Current loader is running; configuring pending loader">
	//   98  226:invokestatic    #109 <Method int Log.v(String, String)>
	//   99  229:pop             
					if(loaderinfo.mPendingLoader != null)
	//* 100  230:aload           4
	//* 101  232:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//* 102  235:ifnull          288
					{
						if(DEBUG)
	//* 103  238:getstatic       #29  <Field boolean DEBUG>
	//* 104  241:ifeq            274
							Log.v("LoaderManager", (new StringBuilder()).append("  Removing pending loader: ").append(((Object) (loaderinfo.mPendingLoader))).toString());
	//  105  244:ldc1            #14  <String "LoaderManager">
	//  106  246:new             #84  <Class StringBuilder>
	//  107  249:dup             
	//  108  250:invokespecial   #85  <Method void StringBuilder()>
	//  109  253:ldc2            #299 <String "  Removing pending loader: ">
	//  110  256:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  111  259:aload           4
	//  112  261:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//  113  264:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//  114  267:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  115  270:invokestatic    #109 <Method int Log.v(String, String)>
	//  116  273:pop             
						loaderinfo.mPendingLoader.destroy();
	//  117  274:aload           4
	//  118  276:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//  119  279:invokevirtual   #123 <Method void LoaderManagerImpl$LoaderInfo.destroy()>
						loaderinfo.mPendingLoader = null;
	//  120  282:aload           4
	//  121  284:aconst_null     
	//  122  285:putfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
					}
					if(DEBUG)
	//* 123  288:getstatic       #29  <Field boolean DEBUG>
	//* 124  291:ifeq            303
						Log.v("LoaderManager", "  Enqueuing as new pending loader");
	//  125  294:ldc1            #14  <String "LoaderManager">
	//  126  296:ldc2            #301 <String "  Enqueuing as new pending loader">
	//  127  299:invokestatic    #109 <Method int Log.v(String, String)>
	//  128  302:pop             
					loaderinfo.mPendingLoader = createLoader(i, bundle, loadercallbacks);
	//  129  303:aload           4
	//  130  305:aload_0         
	//  131  306:iload_1         
	//  132  307:aload_2         
	//  133  308:aload_3         
	//  134  309:invokespecial   #54  <Method LoaderManagerImpl$LoaderInfo createLoader(int, Bundle, LoaderManager$LoaderCallbacks)>
	//  135  312:putfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
					return loaderinfo.mPendingLoader.mLoader;
	//  136  315:aload           4
	//  137  317:getfield        #239 <Field LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderInfo.mPendingLoader>
	//  138  320:getfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
	//  139  323:areturn         
				}
			} else
			{
				if(DEBUG)
	//* 140  324:getstatic       #29  <Field boolean DEBUG>
	//* 141  327:ifeq            357
					Log.v("LoaderManager", (new StringBuilder()).append("  Making last loader inactive: ").append(((Object) (loaderinfo))).toString());
	//  142  330:ldc1            #14  <String "LoaderManager">
	//  143  332:new             #84  <Class StringBuilder>
	//  144  335:dup             
	//  145  336:invokespecial   #85  <Method void StringBuilder()>
	//  146  339:ldc2            #303 <String "  Making last loader inactive: ">
	//  147  342:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//  148  345:aload           4
	//  149  347:invokevirtual   #94  <Method StringBuilder StringBuilder.append(Object)>
	//  150  350:invokevirtual   #103 <Method String StringBuilder.toString()>
	//  151  353:invokestatic    #109 <Method int Log.v(String, String)>
	//  152  356:pop             
				loaderinfo.mLoader.abandon();
	//  153  357:aload           4
	//  154  359:getfield        #73  <Field Loader LoaderManagerImpl$LoaderInfo.mLoader>
	//  155  362:invokevirtual   #290 <Method void Loader.abandon()>
				mInactiveLoaders.put(i, ((Object) (loaderinfo)));
	//  156  365:aload_0         
	//  157  366:getfield        #41  <Field SparseArrayCompat mInactiveLoaders>
	//  158  369:iload_1         
	//  159  370:aload           4
	//  160  372:invokevirtual   #280 <Method void SparseArrayCompat.put(int, Object)>
			}
		}
		return createAndInstallLoader(i, bundle, loadercallbacks).mLoader;
	//* 161  375:goto            164
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #84  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #305 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("LoaderManager{");
	//    5   11:aload_1         
	//    6   12:ldc2            #307 <String "LoaderManager{">
	//    7   15:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   19:aload_1         
	//   10   20:aload_0         
	//   11   21:invokestatic    #313 <Method int System.identityHashCode(Object)>
	//   12   24:invokestatic    #319 <Method String Integer.toHexString(int)>
	//   13   27:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   14   30:pop             
		stringbuilder.append(" in ");
	//   15   31:aload_1         
	//   16   32:ldc2            #321 <String " in ">
	//   17   35:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   18   38:pop             
		DebugUtils.buildShortClassTag(((Object) (mHost)), stringbuilder);
	//   19   39:aload_0         
	//   20   40:getfield        #45  <Field FragmentHostCallback mHost>
	//   21   43:aload_1         
	//   22   44:invokestatic    #327 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   23   47:aload_1         
	//   24   48:ldc2            #329 <String "}}">
	//   25   51:invokevirtual   #91  <Method StringBuilder StringBuilder.append(String)>
	//   26   54:pop             
		return stringbuilder.toString();
	//   27   55:aload_1         
	//   28   56:invokevirtual   #103 <Method String StringBuilder.toString()>
	//   29   59:areturn         
	}

	void updateHostController(FragmentHostCallback fragmenthostcallback)
	{
		mHost = fragmenthostcallback;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #45  <Field FragmentHostCallback mHost>
	//    3    5:return          
	}

	static boolean DEBUG = false;
	static final String TAG = "LoaderManager";
	boolean mCreatingLoader;
	FragmentHostCallback mHost;
	final SparseArrayCompat mInactiveLoaders = new SparseArrayCompat();
	final SparseArrayCompat mLoaders = new SparseArrayCompat();
	boolean mRetaining;
	boolean mRetainingStarted;
	boolean mStarted;
	final String mWho;

	static 
	{
		DEBUG = false;
	//    0    0:iconst_0        
	//    1    1:putstatic       #29  <Field boolean DEBUG>
	//*   2    4:return          
	}
}
