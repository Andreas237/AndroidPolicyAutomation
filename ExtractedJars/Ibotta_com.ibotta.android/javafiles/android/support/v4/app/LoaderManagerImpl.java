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

		void markForRedelivery()
		{
			LifecycleOwner lifecycleowner = mLifecycleOwner;
		//    0    0:aload_0         
		//    1    1:getfield        #165 <Field LifecycleOwner mLifecycleOwner>
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
		//   12   20:invokespecial   #166 <Method void MutableLiveData.removeObserver(Observer)>
				observe(lifecycleowner, ((Observer) (loaderobserver)));
		//   13   23:aload_0         
		//   14   24:aload_1         
		//   15   25:aload_2         
		//   16   26:invokevirtual   #170 <Method void observe(LifecycleOwner, Observer)>
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
		//    7   15:ldc1            #173 <String "  Starting: ">
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
		//   21   41:invokevirtual   #176 <Method void Loader.startLoading()>
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
		//    7   15:ldc1            #179 <String "  Stopping: ">
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
		//   21   41:invokevirtual   #182 <Method void Loader.stopLoading()>
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
		//    7   15:ldc1            #186 <String "onLoadComplete: ">
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
		//*  19   37:invokestatic    #192 <Method Looper Looper.myLooper()>
		//*  20   40:invokestatic    #195 <Method Looper Looper.getMainLooper()>
		//*  21   43:if_acmpne       52
			{
				setValue(obj);
		//   22   46:aload_0         
		//   23   47:aload_2         
		//   24   48:invokevirtual   #198 <Method void setValue(Object)>
				return;
		//   25   51:return          
			}
			if(LoaderManagerImpl.DEBUG)
		//*  26   52:getstatic       #55  <Field boolean LoaderManagerImpl.DEBUG>
		//*  27   55:ifeq            66
				Log.w("LoaderManager", "onLoadComplete was incorrectly called on a background thread");
		//   28   58:ldc1            #69  <String "LoaderManager">
		//   29   60:ldc1            #200 <String "onLoadComplete was incorrectly called on a background thread">
		//   30   62:invokestatic    #203 <Method int Log.w(String, String)>
		//   31   65:pop             
			postValue(obj);
		//   32   66:aload_0         
		//   33   67:aload_2         
		//   34   68:invokevirtual   #206 <Method void postValue(Object)>
		//   35   71:return          
		}

		public void removeObserver(Observer observer)
		{
			super.removeObserver(observer);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #166 <Method void MutableLiveData.removeObserver(Observer)>
			mLifecycleOwner = null;
		//    3    5:aload_0         
		//    4    6:aconst_null     
		//    5    7:putfield        #165 <Field LifecycleOwner mLifecycleOwner>
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
		//    5    9:invokespecial   #213 <Method void LoaderManagerImpl$LoaderObserver(Loader, LoaderManager$LoaderCallbacks)>
		//    6   12:astore_2        
			observe(lifecycleowner, ((Observer) (loadercallbacks)));
		//    7   13:aload_0         
		//    8   14:aload_1         
		//    9   15:aload_2         
		//   10   16:invokevirtual   #170 <Method void observe(LifecycleOwner, Observer)>
			LoaderObserver loaderobserver = mObserver;
		//   11   19:aload_0         
		//   12   20:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
		//   13   23:astore_3        
			if(loaderobserver != null)
		//*  14   24:aload_3         
		//*  15   25:ifnull          33
				removeObserver(((Observer) (loaderobserver)));
		//   16   28:aload_0         
		//   17   29:aload_3         
		//   18   30:invokevirtual   #92  <Method void removeObserver(Observer)>
			mLifecycleOwner = lifecycleowner;
		//   19   33:aload_0         
		//   20   34:aload_1         
		//   21   35:putfield        #165 <Field LifecycleOwner mLifecycleOwner>
			mObserver = ((LoaderObserver) (loadercallbacks));
		//   22   38:aload_0         
		//   23   39:aload_2         
		//   24   40:putfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
			return mLoader;
		//   25   43:aload_0         
		//   26   44:getfield        #36  <Field Loader mLoader>
		//   27   47:areturn         
		}

		public void setValue(Object obj)
		{
			super.setValue(obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #215 <Method void MutableLiveData.setValue(Object)>
			obj = ((Object) (mPriorLoader));
		//    3    5:aload_0         
		//    4    6:getfield        #38  <Field Loader mPriorLoader>
		//    5    9:astore_1        
			if(obj != null)
		//*   6   10:aload_1         
		//*   7   11:ifnull          23
			{
				((Loader) (obj)).reset();
		//    8   14:aload_1         
		//    9   15:invokevirtual   #105 <Method void Loader.reset()>
				mPriorLoader = null;
		//   10   18:aload_0         
		//   11   19:aconst_null     
		//   12   20:putfield        #38  <Field Loader mPriorLoader>
			}
		//   13   23:return          
		}

		public String toString()
		{
			StringBuilder stringbuilder = new StringBuilder(64);
		//    0    0:new             #57  <Class StringBuilder>
		//    1    3:dup             
		//    2    4:bipush          64
		//    3    6:invokespecial   #218 <Method void StringBuilder(int)>
		//    4    9:astore_1        
			stringbuilder.append("LoaderInfo{");
		//    5   10:aload_1         
		//    6   11:ldc1            #220 <String "LoaderInfo{">
		//    7   13:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//    8   16:pop             
			stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
		//    9   17:aload_1         
		//   10   18:aload_0         
		//   11   19:invokestatic    #226 <Method int System.identityHashCode(Object)>
		//   12   22:invokestatic    #232 <Method String Integer.toHexString(int)>
		//   13   25:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   14   28:pop             
			stringbuilder.append(" #");
		//   15   29:aload_1         
		//   16   30:ldc1            #234 <String " #">
		//   17   32:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   18   35:pop             
			stringbuilder.append(mId);
		//   19   36:aload_1         
		//   20   37:aload_0         
		//   21   38:getfield        #32  <Field int mId>
		//   22   41:invokevirtual   #237 <Method StringBuilder StringBuilder.append(int)>
		//   23   44:pop             
			stringbuilder.append(" : ");
		//   24   45:aload_1         
		//   25   46:ldc1            #239 <String " : ">
		//   26   48:invokevirtual   #64  <Method StringBuilder StringBuilder.append(String)>
		//   27   51:pop             
			DebugUtils.buildShortClassTag(((Object) (mLoader)), stringbuilder);
		//   28   52:aload_0         
		//   29   53:getfield        #36  <Field Loader mLoader>
		//   30   56:aload_1         
		//   31   57:invokestatic    #245 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
			stringbuilder.append("}}");
		//   32   60:aload_1         
		//   33   61:ldc1            #247 <String "}}">
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
		//    0    0:new             #37  <Class ViewModelProvider>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getstatic       #23  <Field android.arch.lifecycle.ViewModelProvider$Factory FACTORY>
		//    4    8:invokespecial   #40  <Method void ViewModelProvider(ViewModelStore, android.arch.lifecycle.ViewModelProvider$Factory)>
		//    5   11:ldc1            #2   <Class LoaderManagerImpl$LoaderViewModel>
		//    6   13:invokevirtual   #44  <Method ViewModel ViewModelProvider.get(Class)>
		//    7   16:checkcast       #2   <Class LoaderManagerImpl$LoaderViewModel>
		//    8   19:areturn         
		}

		public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
		{
			if(mLoaders.size() > 0)
		//*   0    0:aload_0         
		//*   1    1:getfield        #30  <Field SparseArrayCompat mLoaders>
		//*   2    4:invokevirtual   #51  <Method int SparseArrayCompat.size()>
		//*   3    7:ifle            140
			{
				printwriter.print(s);
		//    4   10:aload_3         
		//    5   11:aload_1         
		//    6   12:invokevirtual   #57  <Method void PrintWriter.print(String)>
				printwriter.println("Loaders:");
		//    7   15:aload_3         
		//    8   16:ldc1            #59  <String "Loaders:">
		//    9   18:invokevirtual   #62  <Method void PrintWriter.println(String)>
				Object obj = ((Object) (new StringBuilder()));
		//   10   21:new             #64  <Class StringBuilder>
		//   11   24:dup             
		//   12   25:invokespecial   #65  <Method void StringBuilder()>
		//   13   28:astore          6
				((StringBuilder) (obj)).append(s);
		//   14   30:aload           6
		//   15   32:aload_1         
		//   16   33:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
		//   17   36:pop             
				((StringBuilder) (obj)).append("    ");
		//   18   37:aload           6
		//   19   39:ldc1            #71  <String "    ">
		//   20   41:invokevirtual   #69  <Method StringBuilder StringBuilder.append(String)>
		//   21   44:pop             
				obj = ((Object) (((StringBuilder) (obj)).toString()));
		//   22   45:aload           6
		//   23   47:invokevirtual   #75  <Method String StringBuilder.toString()>
		//   24   50:astore          6
				for(int i = 0; i < mLoaders.size(); i++)
		//*  25   52:iconst_0        
		//*  26   53:istore          5
		//*  27   55:iload           5
		//*  28   57:aload_0         
		//*  29   58:getfield        #30  <Field SparseArrayCompat mLoaders>
		//*  30   61:invokevirtual   #51  <Method int SparseArrayCompat.size()>
		//*  31   64:icmpge          140
				{
					LoaderInfo loaderinfo = (LoaderInfo)mLoaders.valueAt(i);
		//   32   67:aload_0         
		//   33   68:getfield        #30  <Field SparseArrayCompat mLoaders>
		//   34   71:iload           5
		//   35   73:invokevirtual   #79  <Method Object SparseArrayCompat.valueAt(int)>
		//   36   76:checkcast       #81  <Class LoaderManagerImpl$LoaderInfo>
		//   37   79:astore          7
					printwriter.print(s);
		//   38   81:aload_3         
		//   39   82:aload_1         
		//   40   83:invokevirtual   #57  <Method void PrintWriter.print(String)>
					printwriter.print("  #");
		//   41   86:aload_3         
		//   42   87:ldc1            #83  <String "  #">
		//   43   89:invokevirtual   #57  <Method void PrintWriter.print(String)>
					printwriter.print(mLoaders.keyAt(i));
		//   44   92:aload_3         
		//   45   93:aload_0         
		//   46   94:getfield        #30  <Field SparseArrayCompat mLoaders>
		//   47   97:iload           5
		//   48   99:invokevirtual   #87  <Method int SparseArrayCompat.keyAt(int)>
		//   49  102:invokevirtual   #90  <Method void PrintWriter.print(int)>
					printwriter.print(": ");
		//   50  105:aload_3         
		//   51  106:ldc1            #92  <String ": ">
		//   52  108:invokevirtual   #57  <Method void PrintWriter.print(String)>
					printwriter.println(loaderinfo.toString());
		//   53  111:aload_3         
		//   54  112:aload           7
		//   55  114:invokevirtual   #93  <Method String LoaderManagerImpl$LoaderInfo.toString()>
		//   56  117:invokevirtual   #62  <Method void PrintWriter.println(String)>
					loaderinfo.dump(((String) (obj)), filedescriptor, printwriter, as);
		//   57  120:aload           7
		//   58  122:aload           6
		//   59  124:aload_2         
		//   60  125:aload_3         
		//   61  126:aload           4
		//   62  128:invokevirtual   #95  <Method void LoaderManagerImpl$LoaderInfo.dump(String, FileDescriptor, PrintWriter, String[])>
				}

		//   63  131:iload           5
		//   64  133:iconst_1        
		//   65  134:iadd            
		//   66  135:istore          5
			}
		//*  67  137:goto            55
		//   68  140:return          
		}

		void finishCreatingLoader()
		{
			mCreatingLoader = false;
		//    0    0:aload_0         
		//    1    1:iconst_0        
		//    2    2:putfield        #32  <Field boolean mCreatingLoader>
		//    3    5:return          
		}

		LoaderInfo getLoader(int i)
		{
			return (LoaderInfo)mLoaders.get(i);
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field SparseArrayCompat mLoaders>
		//    2    4:iload_1         
		//    3    5:invokevirtual   #100 <Method Object SparseArrayCompat.get(int)>
		//    4    8:checkcast       #81  <Class LoaderManagerImpl$LoaderInfo>
		//    5   11:areturn         
		}

		boolean isCreatingLoader()
		{
			return mCreatingLoader;
		//    0    0:aload_0         
		//    1    1:getfield        #32  <Field boolean mCreatingLoader>
		//    2    4:ireturn         
		}

		void markForRedelivery()
		{
			int j = mLoaders.size();
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field SparseArrayCompat mLoaders>
		//    2    4:invokevirtual   #51  <Method int SparseArrayCompat.size()>
		//    3    7:istore_2        
			for(int i = 0; i < j; i++)
		//*   4    8:iconst_0        
		//*   5    9:istore_1        
		//*   6   10:iload_1         
		//*   7   11:iload_2         
		//*   8   12:icmpge          36
				((LoaderInfo)mLoaders.valueAt(i)).markForRedelivery();
		//    9   15:aload_0         
		//   10   16:getfield        #30  <Field SparseArrayCompat mLoaders>
		//   11   19:iload_1         
		//   12   20:invokevirtual   #79  <Method Object SparseArrayCompat.valueAt(int)>
		//   13   23:checkcast       #81  <Class LoaderManagerImpl$LoaderInfo>
		//   14   26:invokevirtual   #107 <Method void LoaderManagerImpl$LoaderInfo.markForRedelivery()>

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
		//    1    1:invokespecial   #110 <Method void ViewModel.onCleared()>
			int j = mLoaders.size();
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field SparseArrayCompat mLoaders>
		//    4    8:invokevirtual   #51  <Method int SparseArrayCompat.size()>
		//    5   11:istore_2        
			for(int i = 0; i < j; i++)
		//*   6   12:iconst_0        
		//*   7   13:istore_1        
		//*   8   14:iload_1         
		//*   9   15:iload_2         
		//*  10   16:icmpge          42
				((LoaderInfo)mLoaders.valueAt(i)).destroy(true);
		//   11   19:aload_0         
		//   12   20:getfield        #30  <Field SparseArrayCompat mLoaders>
		//   13   23:iload_1         
		//   14   24:invokevirtual   #79  <Method Object SparseArrayCompat.valueAt(int)>
		//   15   27:checkcast       #81  <Class LoaderManagerImpl$LoaderInfo>
		//   16   30:iconst_1        
		//   17   31:invokevirtual   #114 <Method Loader LoaderManagerImpl$LoaderInfo.destroy(boolean)>
		//   18   34:pop             

		//   19   35:iload_1         
		//   20   36:iconst_1        
		//   21   37:iadd            
		//   22   38:istore_1        
		//*  23   39:goto            14
			mLoaders.clear();
		//   24   42:aload_0         
		//   25   43:getfield        #30  <Field SparseArrayCompat mLoaders>
		//   26   46:invokevirtual   #117 <Method void SparseArrayCompat.clear()>
		//   27   49:return          
		}

		void putLoader(int i, LoaderInfo loaderinfo)
		{
			mLoaders.put(i, ((Object) (loaderinfo)));
		//    0    0:aload_0         
		//    1    1:getfield        #30  <Field SparseArrayCompat mLoaders>
		//    2    4:iload_1         
		//    3    5:aload_2         
		//    4    6:invokevirtual   #123 <Method void SparseArrayCompat.put(int, Object)>
		//    5    9:return          
		}

		void startCreatingLoader()
		{
			mCreatingLoader = true;
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:putfield        #32  <Field boolean mCreatingLoader>
		//    3    5:return          
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
		private boolean mCreatingLoader;
		private SparseArrayCompat mLoaders;

		static 
		{
		//    0    0:new             #9   <Class LoaderManagerImpl$LoaderViewModel$1>
		//    1    3:dup             
		//    2    4:invokespecial   #21  <Method void LoaderManagerImpl$LoaderViewModel$1()>
		//    3    7:putstatic       #23  <Field android.arch.lifecycle.ViewModelProvider$Factory FACTORY>
		//*   4   10:return          
		}

		LoaderViewModel()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #25  <Method void ViewModel()>
			mLoaders = new SparseArrayCompat();
		//    2    4:aload_0         
		//    3    5:new             #27  <Class SparseArrayCompat>
		//    4    8:dup             
		//    5    9:invokespecial   #28  <Method void SparseArrayCompat()>
		//    6   12:putfield        #30  <Field SparseArrayCompat mLoaders>
			mCreatingLoader = false;
		//    7   15:aload_0         
		//    8   16:iconst_0        
		//    9   17:putfield        #32  <Field boolean mCreatingLoader>
		//   10   20:return          
		}
	}


	LoaderManagerImpl(LifecycleOwner lifecycleowner, ViewModelStore viewmodelstore)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #30  <Method void LoaderManager()>
		mLifecycleOwner = lifecycleowner;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #32  <Field LifecycleOwner mLifecycleOwner>
		mLoaderViewModel = LoaderViewModel.getInstance(viewmodelstore);
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #36  <Method LoaderManagerImpl$LoaderViewModel LoaderManagerImpl$LoaderViewModel.getInstance(ViewModelStore)>
	//    8   14:putfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    9   17:return          
	}

	private Loader createAndInstallLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks, Loader loader)
	{
		Loader loader1;
		mLoaderViewModel.startCreatingLoader();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    2    4:invokevirtual   #46  <Method void LoaderManagerImpl$LoaderViewModel.startCreatingLoader()>
		loader1 = loadercallbacks.onCreateLoader(i, bundle);
	//    3    7:aload_3         
	//    4    8:iload_1         
	//    5    9:aload_2         
	//    6   10:invokeinterface #52  <Method Loader LoaderManager$LoaderCallbacks.onCreateLoader(int, Bundle)>
	//    7   15:astore          5
		if(loader1 == null)
			break MISSING_BLOCK_LABEL_165;
	//    8   17:aload           5
	//    9   19:ifnull          165
		if(!((Object) (loader1)).getClass().isMemberClass() || Modifier.isStatic(((Object) (loader1)).getClass().getModifiers()))
	//*  10   22:aload           5
	//*  11   24:invokevirtual   #58  <Method Class Object.getClass()>
	//*  12   27:invokevirtual   #64  <Method boolean Class.isMemberClass()>
	//*  13   30:ifeq            84
	//*  14   33:aload           5
	//*  15   35:invokevirtual   #58  <Method Class Object.getClass()>
	//*  16   38:invokevirtual   #68  <Method int Class.getModifiers()>
	//*  17   41:invokestatic    #74  <Method boolean Modifier.isStatic(int)>
	//*  18   44:ifeq            50
			break MISSING_BLOCK_LABEL_84;
	//   19   47:goto            84
		bundle = ((Bundle) (new StringBuilder()));
	//   20   50:new             #76  <Class StringBuilder>
	//   21   53:dup             
	//   22   54:invokespecial   #77  <Method void StringBuilder()>
	//   23   57:astore_2        
		((StringBuilder) (bundle)).append("Object returned from onCreateLoader must not be a non-static inner member class: ");
	//   24   58:aload_2         
	//   25   59:ldc1            #79  <String "Object returned from onCreateLoader must not be a non-static inner member class: ">
	//   26   61:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   27   64:pop             
		((StringBuilder) (bundle)).append(((Object) (loader1)));
	//   28   65:aload_2         
	//   29   66:aload           5
	//   30   68:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   31   71:pop             
		throw new IllegalArgumentException(((StringBuilder) (bundle)).toString());
	//   32   72:new             #88  <Class IllegalArgumentException>
	//   33   75:dup             
	//   34   76:aload_2         
	//   35   77:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   36   80:invokespecial   #95  <Method void IllegalArgumentException(String)>
	//   37   83:athrow          
		bundle = ((Bundle) (new LoaderInfo(i, bundle, loader1, loader)));
	//   38   84:new             #6   <Class LoaderManagerImpl$LoaderInfo>
	//   39   87:dup             
	//   40   88:iload_1         
	//   41   89:aload_2         
	//   42   90:aload           5
	//   43   92:aload           4
	//   44   94:invokespecial   #98  <Method void LoaderManagerImpl$LoaderInfo(int, Bundle, Loader, Loader)>
	//   45   97:astore_2        
		if(DEBUG)
	//*  46   98:getstatic       #100 <Field boolean DEBUG>
	//*  47  101:ifeq            139
		{
			loader = ((Loader) (new StringBuilder()));
	//   48  104:new             #76  <Class StringBuilder>
	//   49  107:dup             
	//   50  108:invokespecial   #77  <Method void StringBuilder()>
	//   51  111:astore          4
			((StringBuilder) (loader)).append("  Created new loader ");
	//   52  113:aload           4
	//   53  115:ldc1            #102 <String "  Created new loader ">
	//   54  117:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   55  120:pop             
			((StringBuilder) (loader)).append(((Object) (bundle)));
	//   56  121:aload           4
	//   57  123:aload_2         
	//   58  124:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   59  127:pop             
			Log.v("LoaderManager", ((StringBuilder) (loader)).toString());
	//   60  128:ldc1            #104 <String "LoaderManager">
	//   61  130:aload           4
	//   62  132:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   63  135:invokestatic    #110 <Method int Log.v(String, String)>
	//   64  138:pop             
		}
		mLoaderViewModel.putLoader(i, ((LoaderInfo) (bundle)));
	//   65  139:aload_0         
	//   66  140:getfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   67  143:iload_1         
	//   68  144:aload_2         
	//   69  145:invokevirtual   #114 <Method void LoaderManagerImpl$LoaderViewModel.putLoader(int, LoaderManagerImpl$LoaderInfo)>
		mLoaderViewModel.finishCreatingLoader();
	//   70  148:aload_0         
	//   71  149:getfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   72  152:invokevirtual   #117 <Method void LoaderManagerImpl$LoaderViewModel.finishCreatingLoader()>
		return ((LoaderInfo) (bundle)).setCallback(mLifecycleOwner, loadercallbacks);
	//   73  155:aload_2         
	//   74  156:aload_0         
	//   75  157:getfield        #32  <Field LifecycleOwner mLifecycleOwner>
	//   76  160:aload_3         
	//   77  161:invokevirtual   #121 <Method Loader LoaderManagerImpl$LoaderInfo.setCallback(LifecycleOwner, LoaderManager$LoaderCallbacks)>
	//   78  164:areturn         
		throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
	//   79  165:new             #88  <Class IllegalArgumentException>
	//   80  168:dup             
	//   81  169:ldc1            #123 <String "Object returned from onCreateLoader must not be null">
	//   82  171:invokespecial   #95  <Method void IllegalArgumentException(String)>
	//   83  174:athrow          
		bundle;
	//   84  175:astore_2        
		mLoaderViewModel.finishCreatingLoader();
	//   85  176:aload_0         
	//   86  177:getfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//   87  180:invokevirtual   #117 <Method void LoaderManagerImpl$LoaderViewModel.finishCreatingLoader()>
		throw bundle;
	//   88  183:aload_2         
	//   89  184:athrow          
	}

	public void dump(String s, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
	{
		mLoaderViewModel.dump(s, filedescriptor, printwriter, as);
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:aload           4
	//    6    9:invokevirtual   #131 <Method void LoaderManagerImpl$LoaderViewModel.dump(String, FileDescriptor, PrintWriter, String[])>
	//    7   12:return          
	}

	public Loader initLoader(int i, Bundle bundle, LoaderManager.LoaderCallbacks loadercallbacks)
	{
		if(!mLoaderViewModel.isCreatingLoader())
	//*   0    0:aload_0         
	//*   1    1:getfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//*   2    4:invokevirtual   #137 <Method boolean LoaderManagerImpl$LoaderViewModel.isCreatingLoader()>
	//*   3    7:ifne            158
		{
			if(Looper.getMainLooper() == Looper.myLooper())
	//*   4   10:invokestatic    #143 <Method Looper Looper.getMainLooper()>
	//*   5   13:invokestatic    #146 <Method Looper Looper.myLooper()>
	//*   6   16:if_acmpne       148
			{
				LoaderInfo loaderinfo = mLoaderViewModel.getLoader(i);
	//    7   19:aload_0         
	//    8   20:getfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    9   23:iload_1         
	//   10   24:invokevirtual   #150 <Method LoaderManagerImpl$LoaderInfo LoaderManagerImpl$LoaderViewModel.getLoader(int)>
	//   11   27:astore          4
				if(DEBUG)
	//*  12   29:getstatic       #100 <Field boolean DEBUG>
	//*  13   32:ifeq            85
				{
					StringBuilder stringbuilder = new StringBuilder();
	//   14   35:new             #76  <Class StringBuilder>
	//   15   38:dup             
	//   16   39:invokespecial   #77  <Method void StringBuilder()>
	//   17   42:astore          5
					stringbuilder.append("initLoader in ");
	//   18   44:aload           5
	//   19   46:ldc1            #152 <String "initLoader in ">
	//   20   48:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   21   51:pop             
					stringbuilder.append(((Object) (this)));
	//   22   52:aload           5
	//   23   54:aload_0         
	//   24   55:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   25   58:pop             
					stringbuilder.append(": args=");
	//   26   59:aload           5
	//   27   61:ldc1            #154 <String ": args=">
	//   28   63:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   29   66:pop             
					stringbuilder.append(((Object) (bundle)));
	//   30   67:aload           5
	//   31   69:aload_2         
	//   32   70:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   33   73:pop             
					Log.v("LoaderManager", stringbuilder.toString());
	//   34   74:ldc1            #104 <String "LoaderManager">
	//   35   76:aload           5
	//   36   78:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   37   81:invokestatic    #110 <Method int Log.v(String, String)>
	//   38   84:pop             
				}
				if(loaderinfo == null)
	//*  39   85:aload           4
	//*  40   87:ifnonnull       99
					return createAndInstallLoader(i, bundle, loadercallbacks, ((Loader) (null)));
	//   41   90:aload_0         
	//   42   91:iload_1         
	//   43   92:aload_2         
	//   44   93:aload_3         
	//   45   94:aconst_null     
	//   46   95:invokespecial   #156 <Method Loader createAndInstallLoader(int, Bundle, LoaderManager$LoaderCallbacks, Loader)>
	//   47   98:areturn         
				if(DEBUG)
	//*  48   99:getstatic       #100 <Field boolean DEBUG>
	//*  49  102:ifeq            137
				{
					bundle = ((Bundle) (new StringBuilder()));
	//   50  105:new             #76  <Class StringBuilder>
	//   51  108:dup             
	//   52  109:invokespecial   #77  <Method void StringBuilder()>
	//   53  112:astore_2        
					((StringBuilder) (bundle)).append("  Re-using existing loader ");
	//   54  113:aload_2         
	//   55  114:ldc1            #158 <String "  Re-using existing loader ">
	//   56  116:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   57  119:pop             
					((StringBuilder) (bundle)).append(((Object) (loaderinfo)));
	//   58  120:aload_2         
	//   59  121:aload           4
	//   60  123:invokevirtual   #86  <Method StringBuilder StringBuilder.append(Object)>
	//   61  126:pop             
					Log.v("LoaderManager", ((StringBuilder) (bundle)).toString());
	//   62  127:ldc1            #104 <String "LoaderManager">
	//   63  129:aload_2         
	//   64  130:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   65  133:invokestatic    #110 <Method int Log.v(String, String)>
	//   66  136:pop             
				}
				return loaderinfo.setCallback(mLifecycleOwner, loadercallbacks);
	//   67  137:aload           4
	//   68  139:aload_0         
	//   69  140:getfield        #32  <Field LifecycleOwner mLifecycleOwner>
	//   70  143:aload_3         
	//   71  144:invokevirtual   #121 <Method Loader LoaderManagerImpl$LoaderInfo.setCallback(LifecycleOwner, LoaderManager$LoaderCallbacks)>
	//   72  147:areturn         
			} else
			{
				throw new IllegalStateException("initLoader must be called on the main thread");
	//   73  148:new             #160 <Class IllegalStateException>
	//   74  151:dup             
	//   75  152:ldc1            #162 <String "initLoader must be called on the main thread">
	//   76  154:invokespecial   #163 <Method void IllegalStateException(String)>
	//   77  157:athrow          
			}
		} else
		{
			throw new IllegalStateException("Called while creating a loader");
	//   78  158:new             #160 <Class IllegalStateException>
	//   79  161:dup             
	//   80  162:ldc1            #165 <String "Called while creating a loader">
	//   81  164:invokespecial   #163 <Method void IllegalStateException(String)>
	//   82  167:athrow          
		}
	}

	public void markForRedelivery()
	{
		mLoaderViewModel.markForRedelivery();
	//    0    0:aload_0         
	//    1    1:getfield        #38  <Field LoaderManagerImpl$LoaderViewModel mLoaderViewModel>
	//    2    4:invokevirtual   #169 <Method void LoaderManagerImpl$LoaderViewModel.markForRedelivery()>
	//    3    7:return          
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder(128);
	//    0    0:new             #76  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:sipush          128
	//    3    7:invokespecial   #172 <Method void StringBuilder(int)>
	//    4   10:astore_1        
		stringbuilder.append("LoaderManager{");
	//    5   11:aload_1         
	//    6   12:ldc1            #174 <String "LoaderManager{">
	//    7   14:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//    8   17:pop             
		stringbuilder.append(Integer.toHexString(System.identityHashCode(((Object) (this)))));
	//    9   18:aload_1         
	//   10   19:aload_0         
	//   11   20:invokestatic    #180 <Method int System.identityHashCode(Object)>
	//   12   23:invokestatic    #186 <Method String Integer.toHexString(int)>
	//   13   26:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   14   29:pop             
		stringbuilder.append(" in ");
	//   15   30:aload_1         
	//   16   31:ldc1            #188 <String " in ">
	//   17   33:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   18   36:pop             
		DebugUtils.buildShortClassTag(((Object) (mLifecycleOwner)), stringbuilder);
	//   19   37:aload_0         
	//   20   38:getfield        #32  <Field LifecycleOwner mLifecycleOwner>
	//   21   41:aload_1         
	//   22   42:invokestatic    #194 <Method void DebugUtils.buildShortClassTag(Object, StringBuilder)>
		stringbuilder.append("}}");
	//   23   45:aload_1         
	//   24   46:ldc1            #196 <String "}}">
	//   25   48:invokevirtual   #83  <Method StringBuilder StringBuilder.append(String)>
	//   26   51:pop             
		return stringbuilder.toString();
	//   27   52:aload_1         
	//   28   53:invokevirtual   #92  <Method String StringBuilder.toString()>
	//   29   56:areturn         
	}

	static boolean DEBUG = false;
	private final LifecycleOwner mLifecycleOwner;
	private final LoaderViewModel mLoaderViewModel;

	static 
	{
	//    0    0:return          
	}
}
