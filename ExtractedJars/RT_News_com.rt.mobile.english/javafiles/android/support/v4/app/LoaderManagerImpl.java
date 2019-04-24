// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.*;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.support.v4.util.SparseArrayCompat;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;

// Referenced classes of package android.support.v4.app:
//			LoaderManager

class LoaderManagerImpl extends LoaderManager
{
	public static class LoaderInfo extends MutableLiveData
		implements android.support.v4.content.Loader.OnLoadCompleteListener
	{

		Loader destroy(boolean flag)
		{
			if(LoaderManagerImpl.DEBUG)
		//*   0    0:getstatic       #55  <Field boolean LoaderManagerImpl.DEBUG>
		//*   1    3:ifeq            37
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    2    6:new             #57  <Class StringBuilder>
		//    3    9:dup             
		//    4   10:invokespecial   #58  <Method void StringBuilder()>
		//    5   13:astore_2        
				stringbuilder.append("  Destroying: ");
		//    6   14:aload_2         
		//    7   15:ldc1            #60  <String "  Destroying: ">
		//    8   17:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    9   20:pop             
				stringbuilder.append(((Object) (this)));
		//   10   21:aload_2         
		//   11   22:aload_0         
		//   12   23:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   13   26:pop             
				Log.v("LoaderManager", stringbuilder.toString());
		//   14   27:ldc1            #69  <String "LoaderManager">
		//   15   29:aload_2         
		//   16   30:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   17   33:invokestatic    #79  <Method int Log.v(String, String)>
		//   18   36:pop             
			}
			mLoader.cancelLoad();
		//   19   37:aload_0         
		//   20   38:getfield        #36  <Field Loader mLoader>
		//   21   41:invokevirtual   #83  <Method boolean Loader.cancelLoad()>
		//   22   44:pop             
			mLoader.abandon();
		//   23   45:aload_0         
		//   24   46:getfield        #36  <Field Loader mLoader>
		//   25   49:invokevirtual   #86  <Method void Loader.abandon()>
			LoaderObserver loaderobserver = mObserver;
		//   26   52:aload_0         
		//   27   53:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//   28   56:astore_2        
			if(loaderobserver != null)
		//*  29   57:aload_2         
		//*  30   58:ifnull          74
			{
				removeObserver(((Observer) (loaderobserver)));
		//   31   61:aload_0         
		//   32   62:aload_2         
		//   33   63:invokevirtual   #92  <Method void removeObserver(Observer)>
				if(flag)
		//*  34   66:iload_1         
		//*  35   67:ifeq            74
					loaderobserver.reset();
		//   36   70:aload_2         
		//   37   71:invokevirtual   #97  <Method void LoaderManagerImpl$LoaderObserver.reset()>
			}
			mLoader.unregisterListener(((android.support.v4.content.Loader.OnLoadCompleteListener) (this)));
		//   38   74:aload_0         
		//   39   75:getfield        #36  <Field Loader mLoader>
		//   40   78:aload_0         
		//   41   79:invokevirtual   #101 <Method void Loader.unregisterListener(android.support.v4.content.Loader$OnLoadCompleteListener)>
			if(loaderobserver != null && !loaderobserver.hasDeliveredData() || flag)
		//*  42   82:aload_2         
		//*  43   83:ifnull          93
		//*  44   86:aload_2         
		//*  45   87:invokevirtual   #104 <Method boolean LoaderManagerImpl$LoaderObserver.hasDeliveredData()>
		//*  46   90:ifeq            97
		//*  47   93:iload_1         
		//*  48   94:ifeq            109
			{
				mLoader.reset();
		//   49   97:aload_0         
		//   50   98:getfield        #36  <Field Loader mLoader>
		//   51  101:invokevirtual   #105 <Method void Loader.reset()>
				return mPriorLoader;
		//   52  104:aload_0         
		//   53  105:getfield        #38  <Field Loader mPriorLoader>
		//   54  108:areturn         
			} else
			{
				return mLoader;
		//   55  109:aload_0         
		//   56  110:getfield        #36  <Field Loader mLoader>
		//   57  113:areturn         
			}
		}

		public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
		{
			printwriter.print(s);
		//    0    0:aload_3         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.print("mId=");
		//    3    5:aload_3         
		//    4    6:ldc1            #117 <String "mId=">
		//    5    8:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.print(mId);
		//    6   11:aload_3         
		//    7   12:aload_0         
		//    8   13:getfield        #32  <Field int mId>
		//    9   16:invokevirtual   #120 <Method void PrintWriter.print(int)>
			printwriter.print(" mArgs=");
		//   10   19:aload_3         
		//   11   20:ldc1            #122 <String " mArgs=">
		//   12   22:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mArgs)));
		//   13   25:aload_3         
		//   14   26:aload_0         
		//   15   27:getfield        #34  <Field Bundle mArgs>
		//   16   30:invokevirtual   #126 <Method void PrintWriter.println(Object)>
			printwriter.print(s);
		//   17   33:aload_3         
		//   18   34:aload_1         
		//   19   35:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.print("mLoader=");
		//   20   38:aload_3         
		//   21   39:ldc1            #128 <String "mLoader=">
		//   22   41:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.println(((Object) (mLoader)));
		//   23   44:aload_3         
		//   24   45:aload_0         
		//   25   46:getfield        #36  <Field Loader mLoader>
		//   26   49:invokevirtual   #126 <Method void PrintWriter.println(Object)>
			Loader loader = mLoader;
		//   27   52:aload_0         
		//   28   53:getfield        #36  <Field Loader mLoader>
		//   29   56:astore          5
			StringBuilder stringbuilder = new StringBuilder();
		//   30   58:new             #57  <Class StringBuilder>
		//   31   61:dup             
		//   32   62:invokespecial   #58  <Method void StringBuilder()>
		//   33   65:astore          6
			stringbuilder.append(s);
		//   34   67:aload           6
		//   35   69:aload_1         
		//   36   70:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   37   73:pop             
			stringbuilder.append("  ");
		//   38   74:aload           6
		//   39   76:ldc1            #130 <String "  ">
		//   40   78:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   41   81:pop             
			loader.dump(stringbuilder.toString(), filedescriptor, printwriter, as);
		//   42   82:aload           5
		//   43   84:aload           6
		//   44   86:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   45   89:aload_2         
		//   46   90:aload_3         
		//   47   91:aload           4
		//   48   93:invokevirtual   #132 <Method void Loader.dump(String, FileDescriptor, PrintWriter, String[])>
			if(mObserver != null)
		//*  49   96:aload_0         
		//*  50   97:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//*  51  100:ifnull          161
			{
				printwriter.print(s);
		//   52  103:aload_3         
		//   53  104:aload_1         
		//   54  105:invokevirtual   #115 <Method void PrintWriter.print(String)>
				printwriter.print("mCallbacks=");
		//   55  108:aload_3         
		//   56  109:ldc1            #134 <String "mCallbacks=">
		//   57  111:invokevirtual   #115 <Method void PrintWriter.print(String)>
				printwriter.println(((Object) (mObserver)));
		//   58  114:aload_3         
		//   59  115:aload_0         
		//   60  116:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//   61  119:invokevirtual   #126 <Method void PrintWriter.println(Object)>
				filedescriptor = ((FileDescriptor) (mObserver));
		//   62  122:aload_0         
		//   63  123:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//   64  126:astore_2        
				as = ((String []) (new StringBuilder()));
		//   65  127:new             #57  <Class StringBuilder>
		//   66  130:dup             
		//   67  131:invokespecial   #58  <Method void StringBuilder()>
		//   68  134:astore          4
				((StringBuilder) (as)).append(s);
		//   69  136:aload           4
		//   70  138:aload_1         
		//   71  139:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   72  142:pop             
				((StringBuilder) (as)).append("  ");
		//   73  143:aload           4
		//   74  145:ldc1            #130 <String "  ">
		//   75  147:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   76  150:pop             
				((LoaderObserver) (filedescriptor)).dump(((StringBuilder) (as)).toString(), printwriter);
		//   77  151:aload_2         
		//   78  152:aload           4
		//   79  154:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   80  157:aload_3         
		//   81  158:invokevirtual   #137 <Method void LoaderManagerImpl$LoaderObserver.dump(String, PrintWriter)>
			}
			printwriter.print(s);
		//   82  161:aload_3         
		//   83  162:aload_1         
		//   84  163:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.print("mData=");
		//   85  166:aload_3         
		//   86  167:ldc1            #139 <String "mData=">
		//   87  169:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.println(getLoader().dataToString(getValue()));
		//   88  172:aload_3         
		//   89  173:aload_0         
		//   90  174:invokevirtual   #143 <Method Loader getLoader()>
		//   91  177:aload_0         
		//   92  178:invokevirtual   #147 <Method Object getValue()>
		//   93  181:invokevirtual   #151 <Method String Loader.dataToString(Object)>
		//   94  184:invokevirtual   #153 <Method void PrintWriter.println(String)>
			printwriter.print(s);
		//   95  187:aload_3         
		//   96  188:aload_1         
		//   97  189:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.print("mStarted=");
		//   98  192:aload_3         
		//   99  193:ldc1            #155 <String "mStarted=">
		//  100  195:invokevirtual   #115 <Method void PrintWriter.print(String)>
			printwriter.println(hasActiveObservers());
		//  101  198:aload_3         
		//  102  199:aload_0         
		//  103  200:invokevirtual   #158 <Method boolean hasActiveObservers()>
		//  104  203:invokevirtual   #161 <Method void PrintWriter.println(boolean)>
		//  105  206:return          
		}

		Loader getLoader()
		{
			return mLoader;
		//    0    0:aload_0         
		//    1    1:getfield        #36  <Field Loader mLoader>
		//    2    4:areturn         
		}

		boolean isCallbackWaitingForData()
		{
			boolean flag = hasActiveObservers();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #158 <Method boolean hasActiveObservers()>
		//    2    4:istore_1        
			boolean flag1 = false;
		//    3    5:iconst_0        
		//    4    6:istore_2        
			if(!flag)
		//*   5    7:iload_1         
		//*   6    8:ifne            13
				return false;
		//    7   11:iconst_0        
		//    8   12:ireturn         
			flag = flag1;
		//    9   13:iload_2         
		//   10   14:istore_1        
			if(mObserver != null)
		//*  11   15:aload_0         
		//*  12   16:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//*  13   19:ifnull          36
			{
				flag = flag1;
		//   14   22:iload_2         
		//   15   23:istore_1        
				if(!mObserver.hasDeliveredData())
		//*  16   24:aload_0         
		//*  17   25:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//*  18   28:invokevirtual   #104 <Method boolean LoaderManagerImpl$LoaderObserver.hasDeliveredData()>
		//*  19   31:ifne            36
					flag = true;
		//   20   34:iconst_1        
		//   21   35:istore_1        
			}
			return flag;
		//   22   36:iload_1         
		//   23   37:ireturn         
		}

		void markForRedelivery()
		{
			LifecycleOwner lifecycleowner = mLifecycleOwner;
		//    0    0:aload_0         
		//    1    1:getfield        #166 <Field LifecycleOwner mLifecycleOwner>
		//    2    4:astore_1        
			LoaderObserver loaderobserver = mObserver;
		//    3    5:aload_0         
		//    4    6:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//    5    9:astore_2        
			if(lifecycleowner != null && loaderobserver != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          29
		//*   8   14:aload_2         
		//*   9   15:ifnull          29
			{
				super.removeObserver(((Observer) (loaderobserver)));
		//   10   18:aload_0         
		//   11   19:aload_2         
		//   12   20:invokespecial   #167 <Method void MutableLiveData.removeObserver(Observer)>
				observe(lifecycleowner, ((Observer) (loaderobserver)));
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:aload_2         
		//   16   26:invokevirtual   #171 <Method void observe(LifecycleOwner, Observer)>
			}
		//   17   29:return          
		}

		protected void onActive()
		{
			if(LoaderManagerImpl.DEBUG)
		//*   0    0:getstatic       #55  <Field boolean LoaderManagerImpl.DEBUG>
		//*   1    3:ifeq            37
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    2    6:new             #57  <Class StringBuilder>
		//    3    9:dup             
		//    4   10:invokespecial   #58  <Method void StringBuilder()>
		//    5   13:astore_1        
				stringbuilder.append("  Starting: ");
		//    6   14:aload_1         
		//    7   15:ldc1            #174 <String "  Starting: ">
		//    8   17:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    9   20:pop             
				stringbuilder.append(((Object) (this)));
		//   10   21:aload_1         
		//   11   22:aload_0         
		//   12   23:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   13   26:pop             
				Log.v("LoaderManager", stringbuilder.toString());
		//   14   27:ldc1            #69  <String "LoaderManager">
		//   15   29:aload_1         
		//   16   30:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   17   33:invokestatic    #79  <Method int Log.v(String, String)>
		//   18   36:pop             
			}
			mLoader.startLoading();
		//   19   37:aload_0         
		//   20   38:getfield        #36  <Field Loader mLoader>
		//   21   41:invokevirtual   #177 <Method void Loader.startLoading()>
		//   22   44:return          
		}

		protected void onInactive()
		{
			if(LoaderManagerImpl.DEBUG)
		//*   0    0:getstatic       #55  <Field boolean LoaderManagerImpl.DEBUG>
		//*   1    3:ifeq            37
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    2    6:new             #57  <Class StringBuilder>
		//    3    9:dup             
		//    4   10:invokespecial   #58  <Method void StringBuilder()>
		//    5   13:astore_1        
				stringbuilder.append("  Stopping: ");
		//    6   14:aload_1         
		//    7   15:ldc1            #180 <String "  Stopping: ">
		//    8   17:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    9   20:pop             
				stringbuilder.append(((Object) (this)));
		//   10   21:aload_1         
		//   11   22:aload_0         
		//   12   23:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   13   26:pop             
				Log.v("LoaderManager", stringbuilder.toString());
		//   14   27:ldc1            #69  <String "LoaderManager">
		//   15   29:aload_1         
		//   16   30:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   17   33:invokestatic    #79  <Method int Log.v(String, String)>
		//   18   36:pop             
			}
			mLoader.stopLoading();
		//   19   37:aload_0         
		//   20   38:getfield        #36  <Field Loader mLoader>
		//   21   41:invokevirtual   #183 <Method void Loader.stopLoading()>
		//   22   44:return          
		}

		public void onLoadComplete(Loader loader, Object obj)
		{
			if(LoaderManagerImpl.DEBUG)
		//*   0    0:getstatic       #55  <Field boolean LoaderManagerImpl.DEBUG>
		//*   1    3:ifeq            37
			{
				loader = ((Loader) (new StringBuilder()));
		//    2    6:new             #57  <Class StringBuilder>
		//    3    9:dup             
		//    4   10:invokespecial   #58  <Method void StringBuilder()>
		//    5   13:astore_1        
				((StringBuilder) (loader)).append("onLoadComplete: ");
		//    6   14:aload_1         
		//    7   15:ldc1            #187 <String "onLoadComplete: ">
		//    8   17:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    9   20:pop             
				((StringBuilder) (loader)).append(((Object) (this)));
		//   10   21:aload_1         
		//   11   22:aload_0         
		//   12   23:invokevirtual   #67  <Method StringBuilder StringBuilder.append(Object)>
		//   13   26:pop             
				Log.v("LoaderManager", ((StringBuilder) (loader)).toString());
		//   14   27:ldc1            #69  <String "LoaderManager">
		//   15   29:aload_1         
		//   16   30:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   17   33:invokestatic    #79  <Method int Log.v(String, String)>
		//   18   36:pop             
			}
			if(Looper.myLooper() == Looper.getMainLooper())
		//*  19   37:invokestatic    #193 <Method Looper Looper.myLooper()>
		//*  20   40:invokestatic    #196 <Method Looper Looper.getMainLooper()>
		//*  21   43:if_acmpne       52
			{
				setValue(obj);
		//   22   46:aload_0         
		//   23   47:aload_2         
		//   24   48:invokevirtual   #199 <Method void setValue(Object)>
				return;
		//   25   51:return          
			}
			if(LoaderManagerImpl.DEBUG)
		//*  26   52:getstatic       #55  <Field boolean LoaderManagerImpl.DEBUG>
		//*  27   55:ifeq            66
				Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
		//   28   58:ldc1            #69  <String "LoaderManager">
		//   29   60:ldc1            #201 <String "onLoadComplete was incorrectly called on a background thread">
		//   30   62:invokestatic    #204 <Method int Log.w(String, String)>
		//   31   65:pop             
			postValue(obj);
		//   32   66:aload_0         
		//   33   67:aload_2         
		//   34   68:invokevirtual   #207 <Method void postValue(Object)>
		//   35   71:return          
		}

		public void removeObserver(Observer observer)
		{
			super.removeObserver(observer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #167 <Method void MutableLiveData.removeObserver(Observer)>
			mLifecycleOwner = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #166 <Field LifecycleOwner mLifecycleOwner>
			mObserver = null;
		//    6   10:aload_0         
		//    7   11:aconst_null     
		//    8   12:putfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//    9   15:return          
		}

		Loader setCallback(LifecycleOwner lifecycleowner, LoaderManager.LoaderCallbacks loadercallbacks)
		{
			loadercallbacks = ((LoaderManager.LoaderCallbacks) (new LoaderObserver(mLoader, loadercallbacks)));
		//    0    0:new             #94  <Class LoaderManagerImpl$LoaderObserver>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #36  <Field Loader mLoader>
		//    4    8:aload_2         
		//    5    9:invokespecial   #214 <Method void LoaderManagerImpl$LoaderObserver(Loader, LoaderManager$LoaderCallbacks)>
		//    6   12:astore_2        
			observe(lifecycleowner, ((Observer) (loadercallbacks)));
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #171 <Method void observe(LifecycleOwner, Observer)>
			if(mObserver != null)
		//*  11   19:aload_0         
		//*  12   20:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//*  13   23:ifnull          34
				removeObserver(((Observer) (mObserver)));
		//   14   26:aload_0         
		//   15   27:aload_0         
		//   16   28:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//   17   31:invokevirtual   #92  <Method void removeObserver(Observer)>
			mLifecycleOwner = lifecycleowner;
		//   18   34:aload_0         
		//   19   35:aload_1         
		//   20   36:putfield        #166 <Field LifecycleOwner mLifecycleOwner>
			mObserver = ((LoaderObserver) (loadercallbacks));
		//   21   39:aload_0         
		//   22   40:aload_2         
		//   23   41:putfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
			return mLoader;
		//   24   44:aload_0         
		//   25   45:getfield        #36  <Field Loader mLoader>
		//   26   48:areturn         
		}

		public void setValue(Object obj)
		{
			super.setValue(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #216 <Method void MutableLiveData.setValue(Object)>
			if(mPriorLoader != null)
		//*   3    5:aload_0         
		//*   4    6:getfield        #38  <Field Loader mPriorLoader>
		//*   5    9:ifnull          24
			{
				mPriorLoader.reset();
		//    6   12:aload_0         
		//    7   13:getfield        #38  <Field Loader mPriorLoader>
		//    8   16:invokevirtual   #105 <Method void Loader.reset()>
				mPriorLoader = null;
		//    9   19:aload_0         
		//   10   20:aconst_null     
		//   11   21:putfield        #38  <Field Loader mPriorLoader>
			}
		//   12   24:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(64);
		//    0    0:new             #57  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:bipush          64
		//    3    6:invokespecial   #219 <Method void StringBuilder(int)>
		//    4    9:astore_1        
			stringbuilder.append("LoaderInfo{");
		//    5   10:aload_1         
		//    6   11:ldc1            #221 <String "LoaderInfo{">
		//    7   13:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:invokestatic    #227 <Method int System.identityHashCode(Object)>
		//   12   22:invokestatic    #233 <Method String Integer.toHexString(int)>
		//   13   25:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   14   28:pop             
			stringbuilder.append(" #");
		//   15   29:aload_1         
		//   16   30:ldc1            #235 <String " #">
		//   17   32:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   18   35:pop             
			stringbuilder.append(mId);
		//   19   36:aload_1         
		//   20   37:aload_0         
		//   21   38:getfield        #32  <Field int mId>
		//   22   41:invokevirtual   #238 <Method StringBuilder StringBuilder.append(int)>
		//   23   44:pop             
			stringbuilder.append(" : ");
		//   24   45:aload_1         
		//   25   46:ldc1            #240 <String " : ">
		//   26   48:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   27   51:pop             
			DebugUtils.buildShortClassTag(((Object) (mLoader)), stringbuilder);
		//   28   52:aload_0         
		//   29   53:getfield        #36  <Field Loader mLoader>
		//   30   56:aload_1         
		//   31   57:invokestatic    #246 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
			stringbuilder.append("}}");
		//   32   60:aload_1         
		//   33   61:ldc1            #248 <String "}}">
		//   34   63:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   35   66:pop             
			return stringbuilder.toString();
		//   36   67:aload_1         
		//   37   68:invokevirtual   #73  <Method String StringBuilder.toString()>
		//   38   71:areturn         
		}

		private final Bundle mArgs;
		private final int mId;
		private LifecycleOwner mLifecycleOwner;
		private final Loader mLoader;
		private LoaderObserver mObserver;
		private Loader mPriorLoader;

		LoaderInfo(int i, Bundle bundle, Loader loader, Loader loader1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #30  <Method void MutableLiveData()>
			mId = i;
		//    2    4:aload_0         
		//    3    5:iload_1         
		//    4    6:putfield        #32  <Field int mId>
			mArgs = bundle;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #34  <Field Bundle mArgs>
			mLoader = loader;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #36  <Field Loader mLoader>
			mPriorLoader = loader1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #38  <Field Loader mPriorLoader>
			mLoader.registerListener(i, ((android.support.v4.content.Loader.OnLoadCompleteListener) (this)));
		//   14   25:aload_0         
		//   15   26:getfield        #36  <Field Loader mLoader>
		//   16   29:iload_1         
		//   17   30:aload_0         
		//   18   31:invokevirtual   #44  <Method void Loader.registerListener(int, android.support.v4.content.Loader$OnLoadCompleteListener)>
		//   19   34:return          
		}
	}

	static class LoaderObserver
		implements Observer
	{

		public void dump(String s, PrintWriter printwriter)
		{
			printwriter.print(s);
		//    0    0:aload_2         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #42  <Method void PrintWriter.print(String)>
			printwriter.print("mDeliveredData=");
		//    3    5:aload_2         
		//    4    6:ldc1            #44  <String "mDeliveredData=">
		//    5    8:invokevirtual   #42  <Method void PrintWriter.print(String)>
			printwriter.println(mDeliveredData);
		//    6   11:aload_2         
		//    7   12:aload_0         
		//    8   13:getfield        #26  <Field boolean mDeliveredData>
		//    9   16:invokevirtual   #48  <Method void PrintWriter.println(boolean)>
		//   10   19:return          
		}

		boolean hasDeliveredData()
		{
			return mDeliveredData;
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field boolean mDeliveredData>
		//    2    4:ireturn         
		}

		public void onChanged(Object obj)
		{
			if(LoaderManagerImpl.DEBUG)
		//*   0    0:getstatic       #56  <Field boolean LoaderManagerImpl.DEBUG>
		//*   1    3:ifeq            60
			{
				StringBuilder stringbuilder = new StringBuilder();
		//    2    6:new             #58  <Class StringBuilder>
		//    3    9:dup             
		//    4   10:invokespecial   #59  <Method void StringBuilder()>
		//    5   13:astore_2        
				stringbuilder.append("  onLoadFinished in ");
		//    6   14:aload_2         
		//    7   15:ldc1            #61  <String "  onLoadFinished in ">
		//    8   17:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//    9   20:pop             
				stringbuilder.append(((Object) (mLoader)));
		//   10   21:aload_2         
		//   11   22:aload_0         
		//   12   23:getfield        #28  <Field Loader mLoader>
		//   13   26:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
		//   14   29:pop             
				stringbuilder.append(": ");
		//   15   30:aload_2         
		//   16   31:ldc1            #70  <String ": ">
		//   17   33:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   18   36:pop             
				stringbuilder.append(mLoader.dataToString(obj));
		//   19   37:aload_2         
		//   20   38:aload_0         
		//   21   39:getfield        #28  <Field Loader mLoader>
		//   22   42:aload_1         
		//   23   43:invokevirtual   #76  <Method String Loader.dataToString(Object)>
		//   24   46:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   25   49:pop             
				Log.v("LoaderManager", stringbuilder.toString());
		//   26   50:ldc1            #78  <String "LoaderManager">
		//   27   52:aload_2         
		//   28   53:invokevirtual   #82  <Method String StringBuilder.toString()>
		//   29   56:invokestatic    #88  <Method int Log.v(String, String)>
		//   30   59:pop             
			}
			mCallback.onLoadFinished(mLoader, obj);
		//   31   60:aload_0         
		//   32   61:getfield        #30  <Field LoaderManager$LoaderCallbacks mCallback>
		//   33   64:aload_0         
		//   34   65:getfield        #28  <Field Loader mLoader>
		//   35   68:aload_1         
		//   36   69:invokeinterface #94  <Method void LoaderManager$LoaderCallbacks.onLoadFinished(Loader, Object)>
			mDeliveredData = true;
		//   37   74:aload_0         
		//   38   75:iconst_1        
		//   39   76:putfield        #26  <Field boolean mDeliveredData>
		//   40   79:return          
		}

		void reset()
		{
			if(mDeliveredData)
		//*   0    0:aload_0         
		//*   1    1:getfield        #26  <Field boolean mDeliveredData>
		//*   2    4:ifeq            60
			{
				if(LoaderManagerImpl.DEBUG)
		//*   3    7:getstatic       #56  <Field boolean LoaderManagerImpl.DEBUG>
		//*   4   10:ifeq            47
				{
					StringBuilder stringbuilder = new StringBuilder();
		//    5   13:new             #58  <Class StringBuilder>
		//    6   16:dup             
		//    7   17:invokespecial   #59  <Method void StringBuilder()>
		//    8   20:astore_1        
					stringbuilder.append("  Resetting: ");
		//    9   21:aload_1         
		//   10   22:ldc1            #99  <String "  Resetting: ">
		//   11   24:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   12   27:pop             
					stringbuilder.append(((Object) (mLoader)));
		//   13   28:aload_1         
		//   14   29:aload_0         
		//   15   30:getfield        #28  <Field Loader mLoader>
		//   16   33:invokevirtual   #68  <Method StringBuilder StringBuilder.append(Object)>
		//   17   36:pop             
					Log.v("LoaderManager", stringbuilder.toString());
		//   18   37:ldc1            #78  <String "LoaderManager">
		//   19   39:aload_1         
		//   20   40:invokevirtual   #82  <Method String StringBuilder.toString()>
		//   21   43:invokestatic    #88  <Method int Log.v(String, String)>
		//   22   46:pop             
				}
				mCallback.onLoaderReset(mLoader);
		//   23   47:aload_0         
		//   24   48:getfield        #30  <Field LoaderManager$LoaderCallbacks mCallback>
		//   25   51:aload_0         
		//   26   52:getfield        #28  <Field Loader mLoader>
		//   27   55:invokeinterface #103 <Method void LoaderManager$LoaderCallbacks.onLoaderReset(Loader)>
			}
		//   28   60:return          
		}

		public String toString()
		{
			return ((Object) (mCallback)).toString();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field LoaderManager$LoaderCallbacks mCallback>
		//    2    4:invokevirtual   #105 <Method String Object.toString()>
		//    3    7:areturn         
		}

		private final LoaderManager.LoaderCallbacks mCallback;
		private boolean mDeliveredData;
		private final Loader mLoader;

		LoaderObserver(Loader loader, LoaderManager.LoaderCallbacks loadercallbacks)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			mDeliveredData = false;
		//    2    4:aload_0         
		//    3    5:iconst_0        
		//    4    6:putfield        #26  <Field boolean mDeliveredData>
			mLoader = loader;
		//    5    9:aload_0         
		//    6   10:aload_1         
		//    7   11:putfield        #28  <Field Loader mLoader>
			mCallback = loadercallbacks;
		//    8   14:aload_0         
		//    9   15:aload_2         
		//   10   16:putfield        #30  <Field LoaderManager$LoaderCallbacks mCallback>
		//   11   19:return          
		}
	}

	static class LoaderViewModel extends ViewModel
	{

		static LoaderViewModel getInstance(ViewModelStore viewmodelstore)
		{
			return (LoaderViewModel)(new ViewModelProvider(viewmodelstore, FACTORY)).get(android/support/v4/app/LoaderManagerImpl$LoaderViewModel);
		//    0    0:new             #33  <Class ViewModelProvider>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getstatic       #21  <Field android.arch.lifecycle.ViewModelProvider$Factory FACTORY>
		//    4    8:invokespecial   #36  <Method void ViewModelProvider(ViewModelStore, android.arch.lifecycle.ViewModelProvider$Factory)>
		//    5   11:ldc1            #2   <Class LoaderManagerImpl$LoaderViewModel>
		//    6   13:invokevirtual   #40  <Method ViewModel ViewModelProvider.get(Class)>
		//    7   16:checkcast       #2   <Class LoaderManagerImpl$LoaderViewModel>
		//    8   19:areturn         
		}

		public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
		{
			if(mLoaders.size() > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
		//*   2    4:invokevirtual   #47  <Method int SparseArrayCompat.size()>
		//*   3    7:ifle            140
			{
				printwriter.print(s);
		//    4   10:aload_3         
		//    5   11:aload_1         
		//    6   12:invokevirtual   #53  <Method void PrintWriter.print(String)>
				printwriter.println("Loaders:");
		//    7   15:aload_3         
		//    8   16:ldc1            #55  <String "Loaders:">
		//    9   18:invokevirtual   #58  <Method void PrintWriter.println(String)>
				Object obj = ((Object) (new StringBuilder()));
		//   10   21:new             #60  <Class StringBuilder>
		//   11   24:dup             
		//   12   25:invokespecial   #61  <Method void StringBuilder()>
		//   13   28:astore          6
				((StringBuilder) (obj)).append(s);
		//   14   30:aload           6
		//   15   32:aload_1         
		//   16   33:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   17   36:pop             
				((StringBuilder) (obj)).append("    ");
		//   18   37:aload           6
		//   19   39:ldc1            #67  <String "    ">
		//   20   41:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
		//   21   44:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
		//   22   45:aload           6
		//   23   47:invokevirtual   #71  <Method String StringBuilder.toString()>
		//   24   50:astore          6
				for(int i = 0; i < mLoaders.size(); i++)
		//*  25   52:iconst_0        
		//*  26   53:istore          5
		//*  27   55:iload           5
		//*  28   57:aload_0         
		//*  29   58:getfield        #28  <Field SparseArrayCompat mLoaders>
		//*  30   61:invokevirtual   #47  <Method int SparseArrayCompat.size()>
		//*  31   64:icmpge          140
				{
					LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(i);
		//   32   67:aload_0         
		//   33   68:getfield        #28  <Field SparseArrayCompat mLoaders>
		//   34   71:iload           5
		//   35   73:invokevirtual   #75  <Method Object SparseArrayCompat.valueAt(int)>
		//   36   76:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
		//   37   79:astore          7
					printwriter.print(s);
		//   38   81:aload_3         
		//   39   82:aload_1         
		//   40   83:invokevirtual   #53  <Method void PrintWriter.print(String)>
					printwriter.print("  #");
		//   41   86:aload_3         
		//   42   87:ldc1            #79  <String "  #">
		//   43   89:invokevirtual   #53  <Method void PrintWriter.print(String)>
					printwriter.print(mLoaders.keyAt(i));
		//   44   92:aload_3         
		//   45   93:aload_0         
		//   46   94:getfield        #28  <Field SparseArrayCompat mLoaders>
		//   47   97:iload           5
		//   48   99:invokevirtual   #83  <Method int SparseArrayCompat.keyAt(int)>
		//   49  102:invokevirtual   #86  <Method void PrintWriter.print(int)>
					printwriter.print(": ");
		//   50  105:aload_3         
		//   51  106:ldc1            #88  <String ": ">
		//   52  108:invokevirtual   #53  <Method void PrintWriter.print(String)>
					printwriter.println(loaderinfo.toString());
		//   53  111:aload_3         
		//   54  112:aload           7
		//   55  114:invokevirtual   #89  <Method String LoaderManagerImpl$LoaderInfo.toString()>
		//   56  117:invokevirtual   #58  <Method void PrintWriter.println(String)>
					loaderinfo.dump(((String) (obj)), filedescriptor, printwriter, as);
		//   57  120:aload           7
		//   58  122:aload           6
		//   59  124:aload_2         
		//   60  125:aload_3         
		//   61  126:aload           4
		//   62  128:invokevirtual   #91  <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
				}

		//   63  131:iload           5
		//   64  133:iconst_1        
		//   65  134:iadd            
		//   66  135:istore          5
			}
		//*  67  137:goto            55
		//   68  140:return          
		}

		LoaderInfo getLoader(int i)
		{
			return (LoaderInfo)mLoaders.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #95  <Method Object SparseArrayCompat.get(int)>
		//    4    8:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
		//    5   11:areturn         
		}

		boolean hasRunningLoaders()
		{
			int j = mLoaders.size();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
		//    2    4:invokevirtual   #47  <Method int SparseArrayCompat.size()>
		//    3    7:istore_2        
			for(int i = 0; i < j; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iload_2         
		//*   8   12:icmpge          41
				if(((LoaderInfo)mLoaders.valueAt(i)).isCallbackWaitingForData())
		//*   9   15:aload_0         
		//*  10   16:getfield        #28  <Field SparseArrayCompat mLoaders>
		//*  11   19:iload_1         
		//*  12   20:invokevirtual   #75  <Method Object SparseArrayCompat.valueAt(int)>
		//*  13   23:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
		//*  14   26:invokevirtual   #102 <Method boolean LoaderManagerImpl$LoaderInfo.isCallbackWaitingForData()>
		//*  15   29:ifeq            34
					return true;
		//   16   32:iconst_1        
		//   17   33:ireturn         

		//   18   34:iload_1         
		//   19   35:iconst_1        
		//   20   36:iadd            
		//   21   37:istore_1        
		//*  22   38:goto            10
			return false;
		//   23   41:iconst_0        
		//   24   42:ireturn         
		}

		void markForRedelivery()
		{
			int j = mLoaders.size();
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
		//    2    4:invokevirtual   #47  <Method int SparseArrayCompat.size()>
		//    3    7:istore_2        
			for(int i = 0; i < j; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iload_2         
		//*   8   12:icmpge          36
				((LoaderInfo)mLoaders.valueAt(i)).markForRedelivery();
		//    9   15:aload_0         
		//   10   16:getfield        #28  <Field SparseArrayCompat mLoaders>
		//   11   19:iload_1         
		//   12   20:invokevirtual   #75  <Method Object SparseArrayCompat.valueAt(int)>
		//   13   23:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
		//   14   26:invokevirtual   #105 <Method void LoaderManagerImpl$LoaderInfo.markForRedelivery()>

		//   15   29:iload_1         
		//   16   30:iconst_1        
		//   17   31:iadd            
		//   18   32:istore_1        
		//*  19   33:goto            10
		//   20   36:return          
		}

		protected void onCleared()
		{
			super.onCleared();
		//    0    0:aload_0         
		//    1    1:invokespecial   #108 <Method void ViewModel.onCleared()>
			int j = mLoaders.size();
		//    2    4:aload_0         
		//    3    5:getfield        #28  <Field SparseArrayCompat mLoaders>
		//    4    8:invokevirtual   #47  <Method int SparseArrayCompat.size()>
		//    5   11:istore_2        
			for(int i = 0; i < j; i++)
		//*   6   12:iconst_0        
		//*   7   13:istore_1        
		//*   8   14:iload_1         
		//*   9   15:iload_2         
		//*  10   16:icmpge          42
				((LoaderInfo)mLoaders.valueAt(i)).destroy(true);
		//   11   19:aload_0         
		//   12   20:getfield        #28  <Field SparseArrayCompat mLoaders>
		//   13   23:iload_1         
		//   14   24:invokevirtual   #75  <Method Object SparseArrayCompat.valueAt(int)>
		//   15   27:checkcast       #77  <Class LoaderManagerImpl$LoaderInfo>
		//   16   30:iconst_1        
		//   17   31:invokevirtual   #112 <Method Loader LoaderManagerImpl$LoaderInfo.destroy(boolean)>
		//   18   34:pop             

		//   19   35:iload_1         
		//   20   36:iconst_1        
		//   21   37:iadd            
		//   22   38:istore_1        
		//*  23   39:goto            14
			mLoaders.clear();
		//   24   42:aload_0         
		//   25   43:getfield        #28  <Field SparseArrayCompat mLoaders>
		//   26   46:invokevirtual   #115 <Method void SparseArrayCompat.clear()>
		//   27   49:return          
		}

		void putLoader(int i, LoaderInfo loaderinfo)
		{
			mLoaders.put(i, ((Object) (loaderinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #121 <Method void SparseArrayCompat.put(int, Object)>
		//    5    9:return          
		}

		void removeLoader(int i)
		{
			mLoaders.remove(i);
		//    0    0:aload_0         
		//    1    1:getfield        #28  <Field SparseArrayCompat mLoaders>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #126 <Method void SparseArrayCompat.remove(int)>
		//    4    8:return          
		}

		private static final android.arch.lifecycle.ViewModelProvider.Factory FACTORY = new android.arch.lifecycle.ViewModelProvider.Factory() {

			public ViewModel create(Class class1)
			{
				return ((ViewModel) (new LoaderViewModel()));
			//    0    0:new             #8   <Class LoaderManagerImpl$LoaderViewModel>
			//    1    3:dup             
			//    2    4:invokespecial   #20  <Method void LoaderManagerImpl$LoaderViewModel()>
			//    3    7:areturn         
			}

		}
;
		private SparseArrayCompat mLoaders;

		static 
		{
		//    0    0:new             #9   <Class LoaderManagerImpl$LoaderViewModel$1>
		//    1    3:dup             
		//    2    4:invokespecial   #19  <Method void LoaderManagerImpl$LoaderViewModel$1()>
		//    3    7:putstatic       #21  <Field android.arch.lifecycle.ViewModelProvider$Factory FACTORY>
		//*   4   10:return          
		}

		LoaderViewModel()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #23  <Method void ViewModel()>
			mLoaders = new SparseArrayCompat();
		//    2    4:aload_0         
		//    3    5:new             #25  <Class SparseArrayCompat>
		//    4    8:dup             
		//    5    9:invokespecial   #26  <Method void SparseArrayCompat()>
		//    6   12:putfield        #28  <Field SparseArrayCompat mLoaders>
		//    7   15:return          
		}
	}


	LoaderManagerImpl(LifecycleOwner lifecycleowner, ViewModelStore viewmodelstore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void LoaderManager()>
		mLifecycleOwner = lifecycleowner;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field LifecycleOwner mLifecycleOwner>
		mLoaderViewModel = LoaderViewModel.getInstance(viewmodelstore);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #41  <Method LoaderManagerImpl$LoaderViewModel LoaderManagerImpl$LoaderViewModel.getInstance(ViewModelStore)>
	//    8   14:putfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    9   17:return          
	}

	private Loader createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks, Loader loader)
	{
		mCreatingLoader = true;
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:putfield        #50  <Field boolean mCreatingLoader>
		Loader loader1 = loadercallbacks.onCreateLoader(i, bundle);
	//    3    5:aload_3         
	//    4    6:iload_1         
	//    5    7:aload_2         
	//    6    8:invokeinterface #56  <Method Loader LoaderManager$LoaderCallbacks.onCreateLoader(int, Bundle)>
	//    7   13:astore          5
		if(((Object) (loader1)).getClass().isMemberClass() && !Modifier.isStatic(((Object) (loader1)).getClass().getModifiers()))
	//*   8   15:aload           5
	//*   9   17:invokevirtual   #62  <Method Class Object.getClass()>
	//*  10   20:invokevirtual   #68  <Method boolean Class.isMemberClass()>
	//*  11   23:ifeq            74
	//*  12   26:aload           5
	//*  13   28:invokevirtual   #62  <Method Class Object.getClass()>
	//*  14   31:invokevirtual   #72  <Method int Class.getModifiers()>
	//*  15   34:invokestatic    #78  <Method boolean Modifier.isStatic(int)>
	//*  16   37:ifne            74
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   17   40:new             #80  <Class StringBuilder>
	//   18   43:dup             
	//   19   44:invokespecial   #81  <Method void StringBuilder()>
	//   20   47:astore_2        
			((StringBuilder) (bundle)).append("Object returned from onCreateLoader must not be a non-static inner member class: ");
	//   21   48:aload_2         
	//   22   49:ldc1            #83  <String "Object returned from onCreateLoader must not be a non-static inner member class: ">
	//   23   51:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
			((StringBuilder) (bundle)).append(((Object) (loader1)));
	//   25   55:aload_2         
	//   26   56:aload           5
	//   27   58:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   28   61:pop             
			throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
	//   29   62:new             #92  <Class IllegalArgumentException>
	//   30   65:dup             
	//   31   66:aload_2         
	//   32   67:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   33   70:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   34   73:athrow          
		}
		bundle = ((Bundle) (new LoaderInfo(i, bundle, loader1, loader)));
	//   35   74:new             #6   <Class LoaderManagerImpl$LoaderInfo>
	//   36   77:dup             
	//   37   78:iload_1         
	//   38   79:aload_2         
	//   39   80:aload           5
	//   40   82:aload           4
	//   41   84:invokespecial   #102 <Method void LoaderManagerImpl$LoaderInfo(int, Bundle, Loader, Loader)>
	//   42   87:astore_2        
		if(DEBUG)
	//*  43   88:getstatic       #104 <Field boolean DEBUG>
	//*  44   91:ifeq            129
		{
			loader = ((Loader) (new StringBuilder()));
	//   45   94:new             #80  <Class StringBuilder>
	//   46   97:dup             
	//   47   98:invokespecial   #81  <Method void StringBuilder()>
	//   48  101:astore          4
			((StringBuilder) (loader)).append("  Created new loader ");
	//   49  103:aload           4
	//   50  105:ldc1            #106 <String "  Created new loader ">
	//   51  107:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   52  110:pop             
			((StringBuilder) (loader)).append(((Object) (bundle)));
	//   53  111:aload           4
	//   54  113:aload_2         
	//   55  114:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   56  117:pop             
			Log.v("LoaderManager", ((StringBuilder) (loader)).toString());
	//   57  118:ldc1            #22  <String "LoaderManager">
	//   58  120:aload           4
	//   59  122:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   60  125:invokestatic    #112 <Method int Log.v(String, String)>
	//   61  128:pop             
		}
		mLoaderViewModel.putLoader(i, ((LoaderInfo) (bundle)));
	//   62  129:aload_0         
	//   63  130:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   64  133:iload_1         
	//   65  134:aload_2         
	//   66  135:invokevirtual   #116 <Method void LoaderManagerImpl$LoaderViewModel.putLoader(int, LoaderManagerImpl$LoaderInfo)>
		mCreatingLoader = false;
	//   67  138:aload_0         
	//   68  139:iconst_0        
	//   69  140:putfield        #50  <Field boolean mCreatingLoader>
		return ((LoaderInfo) (bundle)).setCallback(mLifecycleOwner, loadercallbacks);
	//   70  143:aload_2         
	//   71  144:aload_0         
	//   72  145:getfield        #37  <Field LifecycleOwner mLifecycleOwner>
	//   73  148:aload_3         
	//   74  149:invokevirtual   #120 <Method Loader LoaderManagerImpl$LoaderInfo.setCallback(LifecycleOwner, LoaderManager$LoaderCallbacks)>
	//   75  152:areturn         
		bundle;
	//   76  153:astore_2        
		mCreatingLoader = false;
	//   77  154:aload_0         
	//   78  155:iconst_0        
	//   79  156:putfield        #50  <Field boolean mCreatingLoader>
		throw bundle;
	//   80  159:aload_2         
	//   81  160:athrow          
	}

	public void destroyLoader(int i)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #127 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #129 <String "Called while creating a loader">
	//    6   13:invokespecial   #130 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(Looper.getMainLooper() != Looper.myLooper())
	//*   8   17:invokestatic    #136 <Method Looper Looper.getMainLooper()>
	//*   9   20:invokestatic    #139 <Method Looper Looper.myLooper()>
	//*  10   23:if_acmpeq       36
			throw new IllegalStateException("destroyLoader must be called on the main thread");
	//   11   26:new             #127 <Class IllegalStateException>
	//   12   29:dup             
	//   13   30:ldc1            #141 <String "destroyLoader must be called on the main thread">
	//   14   32:invokespecial   #130 <Method void IllegalStateException(String)>
	//   15   35:athrow          
		if(DEBUG)
	//*  16   36:getstatic       #104 <Field boolean DEBUG>
	//*  17   39:ifeq            86
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   42:new             #80  <Class StringBuilder>
	//   19   45:dup             
	//   20   46:invokespecial   #81  <Method void StringBuilder()>
	//   21   49:astore_2        
			stringbuilder.append("destroyLoader in ");
	//   22   50:aload_2         
	//   23   51:ldc1            #143 <String "destroyLoader in ">
	//   24   53:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
			stringbuilder.append(((Object) (this)));
	//   26   57:aload_2         
	//   27   58:aload_0         
	//   28   59:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   29   62:pop             
			stringbuilder.append(" of ");
	//   30   63:aload_2         
	//   31   64:ldc1            #145 <String " of ">
	//   32   66:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   33   69:pop             
			stringbuilder.append(i);
	//   34   70:aload_2         
	//   35   71:iload_1         
	//   36   72:invokevirtual   #148 <Method StringBuilder StringBuilder.append(int)>
	//   37   75:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   38   76:ldc1            #22  <String "LoaderManager">
	//   39   78:aload_2         
	//   40   79:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   41   82:invokestatic    #112 <Method int Log.v(String, String)>
	//   42   85:pop             
		}
		LoaderInfo loaderinfo = mLoaderViewModel.getLoader(i);
	//   43   86:aload_0         
	//   44   87:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   45   90:iload_1         
	//   46   91:invokevirtual   #152 <Method LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderViewModel.getLoader(int)>
	//   47   94:astore_2        
		if(loaderinfo != null)
	//*  48   95:aload_2         
	//*  49   96:ifnull          113
		{
			loaderinfo.destroy(true);
	//   50   99:aload_2         
	//   51  100:iconst_1        
	//   52  101:invokevirtual   #156 <Method Loader LoaderManagerImpl$LoaderInfo.destroy(boolean)>
	//   53  104:pop             
			mLoaderViewModel.removeLoader(i);
	//   54  105:aload_0         
	//   55  106:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   56  109:iload_1         
	//   57  110:invokevirtual   #159 <Method void LoaderManagerImpl$LoaderViewModel.removeLoader(int)>
		}
	//   58  113:return          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		mLoaderViewModel.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #163 <Method void LoaderManagerImpl$LoaderViewModel.dump(String, FileDescriptor, PrintWriter, String[])>
	//    7   12:return          
	}

	public Loader getLoader(int i)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #127 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #129 <String "Called while creating a loader">
	//    6   13:invokespecial   #130 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		LoaderInfo loaderinfo = mLoaderViewModel.getLoader(i);
	//    8   17:aload_0         
	//    9   18:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   10   21:iload_1         
	//   11   22:invokevirtual   #152 <Method LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderViewModel.getLoader(int)>
	//   12   25:astore_2        
		if(loaderinfo != null)
	//*  13   26:aload_2         
	//*  14   27:ifnull          35
			return loaderinfo.getLoader();
	//   15   30:aload_2         
	//   16   31:invokevirtual   #167 <Method Loader LoaderManagerImpl$LoaderInfo.getLoader()>
	//   17   34:areturn         
		else
			return null;
	//   18   35:aconst_null     
	//   19   36:areturn         
	}

	public boolean hasRunningLoaders()
	{
		return mLoaderViewModel.hasRunningLoaders();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    2    4:invokevirtual   #171 <Method boolean LoaderManagerImpl$LoaderViewModel.hasRunningLoaders()>
	//    3    7:ireturn         
	}

	public Loader initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #127 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #129 <String "Called while creating a loader">
	//    6   13:invokespecial   #130 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(Looper.getMainLooper() != Looper.myLooper())
	//*   8   17:invokestatic    #136 <Method Looper Looper.getMainLooper()>
	//*   9   20:invokestatic    #139 <Method Looper Looper.myLooper()>
	//*  10   23:if_acmpeq       36
			throw new IllegalStateException("initLoader must be called on the main thread");
	//   11   26:new             #127 <Class IllegalStateException>
	//   12   29:dup             
	//   13   30:ldc1            #175 <String "initLoader must be called on the main thread">
	//   14   32:invokespecial   #130 <Method void IllegalStateException(String)>
	//   15   35:athrow          
		LoaderInfo loaderinfo = mLoaderViewModel.getLoader(i);
	//   16   36:aload_0         
	//   17   37:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   18   40:iload_1         
	//   19   41:invokevirtual   #152 <Method LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderViewModel.getLoader(int)>
	//   20   44:astore          4
		if(DEBUG)
	//*  21   46:getstatic       #104 <Field boolean DEBUG>
	//*  22   49:ifeq            102
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   23   52:new             #80  <Class StringBuilder>
	//   24   55:dup             
	//   25   56:invokespecial   #81  <Method void StringBuilder()>
	//   26   59:astore          5
			stringbuilder.append("initLoader in ");
	//   27   61:aload           5
	//   28   63:ldc1            #177 <String "initLoader in ">
	//   29   65:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   30   68:pop             
			stringbuilder.append(((Object) (this)));
	//   31   69:aload           5
	//   32   71:aload_0         
	//   33   72:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   34   75:pop             
			stringbuilder.append(": args=");
	//   35   76:aload           5
	//   36   78:ldc1            #179 <String ": args=">
	//   37   80:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   38   83:pop             
			stringbuilder.append(((Object) (bundle)));
	//   39   84:aload           5
	//   40   86:aload_2         
	//   41   87:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   42   90:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   43   91:ldc1            #22  <String "LoaderManager">
	//   44   93:aload           5
	//   45   95:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   46   98:invokestatic    #112 <Method int Log.v(String, String)>
	//   47  101:pop             
		}
		if(loaderinfo == null)
	//*  48  102:aload           4
	//*  49  104:ifnonnull       116
			return createAndInstallLoader(i, bundle, loadercallbacks, ((Loader) (null)));
	//   50  107:aload_0         
	//   51  108:iload_1         
	//   52  109:aload_2         
	//   53  110:aload_3         
	//   54  111:aconst_null     
	//   55  112:invokespecial   #181 <Method Loader createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks, Loader)>
	//   56  115:areturn         
		if(DEBUG)
	//*  57  116:getstatic       #104 <Field boolean DEBUG>
	//*  58  119:ifeq            154
		{
			bundle = ((Bundle) (new StringBuilder()));
	//   59  122:new             #80  <Class StringBuilder>
	//   60  125:dup             
	//   61  126:invokespecial   #81  <Method void StringBuilder()>
	//   62  129:astore_2        
			((StringBuilder) (bundle)).append("  Re-using existing loader ");
	//   63  130:aload_2         
	//   64  131:ldc1            #183 <String "  Re-using existing loader ">
	//   65  133:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   66  136:pop             
			((StringBuilder) (bundle)).append(((Object) (loaderinfo)));
	//   67  137:aload_2         
	//   68  138:aload           4
	//   69  140:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   70  143:pop             
			Log.v("LoaderManager", ((StringBuilder) (bundle)).toString());
	//   71  144:ldc1            #22  <String "LoaderManager">
	//   72  146:aload_2         
	//   73  147:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   74  150:invokestatic    #112 <Method int Log.v(String, String)>
	//   75  153:pop             
		}
		return loaderinfo.setCallback(mLifecycleOwner, loadercallbacks);
	//   76  154:aload           4
	//   77  156:aload_0         
	//   78  157:getfield        #37  <Field LifecycleOwner mLifecycleOwner>
	//   79  160:aload_3         
	//   80  161:invokevirtual   #120 <Method Loader LoaderManagerImpl$LoaderInfo.setCallback(LifecycleOwner, LoaderManager$LoaderCallbacks)>
	//   81  164:areturn         
	}

	void markForRedelivery()
	{
		mLoaderViewModel.markForRedelivery();
	//    0    0:aload_0         
	//    1    1:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    2    4:invokevirtual   #187 <Method void LoaderManagerImpl$LoaderViewModel.markForRedelivery()>
	//    3    7:return          
	}

	public Loader restartLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		if(mCreatingLoader)
	//*   0    0:aload_0         
	//*   1    1:getfield        #50  <Field boolean mCreatingLoader>
	//*   2    4:ifeq            17
			throw new IllegalStateException("Called while creating a loader");
	//    3    7:new             #127 <Class IllegalStateException>
	//    4   10:dup             
	//    5   11:ldc1            #129 <String "Called while creating a loader">
	//    6   13:invokespecial   #130 <Method void IllegalStateException(String)>
	//    7   16:athrow          
		if(Looper.getMainLooper() != Looper.myLooper())
	//*   8   17:invokestatic    #136 <Method Looper Looper.getMainLooper()>
	//*   9   20:invokestatic    #139 <Method Looper Looper.myLooper()>
	//*  10   23:if_acmpeq       36
			throw new IllegalStateException("restartLoader must be called on the main thread");
	//   11   26:new             #127 <Class IllegalStateException>
	//   12   29:dup             
	//   13   30:ldc1            #190 <String "restartLoader must be called on the main thread">
	//   14   32:invokespecial   #130 <Method void IllegalStateException(String)>
	//   15   35:athrow          
		if(DEBUG)
	//*  16   36:getstatic       #104 <Field boolean DEBUG>
	//*  17   39:ifeq            92
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   42:new             #80  <Class StringBuilder>
	//   19   45:dup             
	//   20   46:invokespecial   #81  <Method void StringBuilder()>
	//   21   49:astore          4
			stringbuilder.append("restartLoader in ");
	//   22   51:aload           4
	//   23   53:ldc1            #192 <String "restartLoader in ">
	//   24   55:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   25   58:pop             
			stringbuilder.append(((Object) (this)));
	//   26   59:aload           4
	//   27   61:aload_0         
	//   28   62:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   29   65:pop             
			stringbuilder.append(": args=");
	//   30   66:aload           4
	//   31   68:ldc1            #179 <String ": args=">
	//   32   70:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   33   73:pop             
			stringbuilder.append(((Object) (bundle)));
	//   34   74:aload           4
	//   35   76:aload_2         
	//   36   77:invokevirtual   #90  <Method StringBuilder StringBuilder.append(Object)>
	//   37   80:pop             
			Log.v("LoaderManager", stringbuilder.toString());
	//   38   81:ldc1            #22  <String "LoaderManager">
	//   39   83:aload           4
	//   40   85:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   41   88:invokestatic    #112 <Method int Log.v(String, String)>
	//   42   91:pop             
		}
		LoaderInfo loaderinfo = mLoaderViewModel.getLoader(i);
	//   43   92:aload_0         
	//   44   93:getfield        #43  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   45   96:iload_1         
	//   46   97:invokevirtual   #152 <Method LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderViewModel.getLoader(int)>
	//   47  100:astore          5
		Loader loader = null;
	//   48  102:aconst_null     
	//   49  103:astore          4
		if(loaderinfo != null)
	//*  50  105:aload           5
	//*  51  107:ifnull          118
			loader = loaderinfo.destroy(false);
	//   52  110:aload           5
	//   53  112:iconst_0        
	//   54  113:invokevirtual   #156 <Method Loader LoaderManagerImpl$LoaderInfo.destroy(boolean)>
	//   55  116:astore          4
		return createAndInstallLoader(i, bundle, loadercallbacks, loader);
	//   56  118:aload_0         
	//   57  119:iload_1         
	//   58  120:aload_2         
	//   59  121:aload_3         
	//   60  122:aload           4
	//   61  124:invokespecial   #181 <Method Loader createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks, Loader)>
	//   62  127:areturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #80  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #194 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("LoaderManager{");
	//    5   11:aload_1         
	//    6   12:ldc1            #196 <String "LoaderManager{">
	//    7   14:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokestatic    #202 <Method int System.identityHashCode(Object)>
	//   12   23:invokestatic    #208 <Method String Integer.toHexString(int)>
	//   13   26:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(" in ");
	//   15   30:aload_1         
	//   16   31:ldc1            #210 <String " in ">
	//   17   33:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		DebugUtils.buildShortClassTag(((Object) (mLifecycleOwner)), stringbuilder);
	//   19   37:aload_0         
	//   20   38:getfield        #37  <Field LifecycleOwner mLifecycleOwner>
	//   21   41:aload_1         
	//   22   42:invokestatic    #216 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   23   45:aload_1         
	//   24   46:ldc1            #218 <String "}}">
	//   25   48:invokevirtual   #87  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		return stringbuilder.toString();
	//   27   52:aload_1         
	//   28   53:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   29   56:areturn         
	}

	static boolean DEBUG = false;
	static final String TAG = "LoaderManager";
	private boolean mCreatingLoader;
	private final LifecycleOwner mLifecycleOwner;
	private final LoaderViewModel mLoaderViewModel;

	static 
	{
	//    0    0:return          
	}
}
