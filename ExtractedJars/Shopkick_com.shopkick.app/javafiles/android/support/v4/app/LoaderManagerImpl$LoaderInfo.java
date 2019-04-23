// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.*;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.content.Loader;
import android.support.v4.util.DebugUtils;
import android.util.Log;
import java.io.FileDescriptor;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			LoaderManagerImpl

public static class LoaderManagerImpl$LoaderInfo extends MutableLiveData
	implements android.support.v4.content.
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
		ver ver = mObserver;
	//   26   52:aload_0         
	//   27   53:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
	//   28   56:astore_2        
		if(ver != null)
	//*  29   57:aload_2         
	//*  30   58:ifnull          74
		{
			removeObserver(((Observer) (ver)));
	//   31   61:aload_0         
	//   32   62:aload_2         
	//   33   63:invokevirtual   #92  <Method void removeObserver(Observer)>
			if(flag)
	//*  34   66:iload_1         
	//*  35   67:ifeq            74
				ver.reset();
	//   36   70:aload_2         
	//   37   71:invokevirtual   #97  <Method void LoaderManagerImpl$LoaderObserver.reset()>
		}
		mLoader.unregisterListener(((android.support.v4.content.) (this)));
	//   38   74:aload_0         
	//   39   75:getfield        #36  <Field Loader mLoader>
	//   40   78:aload_0         
	//   41   79:invokevirtual   #101 <Method void Loader.unregisterListener(android.support.v4.content.Loader$OnLoadCompleteListener)>
		if(ver != null && !ver.hasDeliveredData() || flag)
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
			((ver) (filedescriptor)).dump(((StringBuilder) (as)).toString(), printwriter);
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
		ver ver = mObserver;
	//    9   13:aload_0         
	//   10   14:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
	//   11   17:astore_3        
		flag = flag1;
	//   12   18:iload_2         
	//   13   19:istore_1        
		if(ver != null)
	//*  14   20:aload_3         
	//*  15   21:ifnull          35
		{
			flag = flag1;
	//   16   24:iload_2         
	//   17   25:istore_1        
			if(!ver.hasDeliveredData())
	//*  18   26:aload_3         
	//*  19   27:invokevirtual   #104 <Method boolean LoaderManagerImpl$LoaderObserver.hasDeliveredData()>
	//*  20   30:ifne            35
				flag = true;
	//   21   33:iconst_1        
	//   22   34:istore_1        
		}
		return flag;
	//   23   35:iload_1         
	//   24   36:ireturn         
	}

	void markForRedelivery()
	{
		LifecycleOwner lifecycleowner = mLifecycleOwner;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field LifecycleOwner mLifecycleOwner>
	//    2    4:astore_1        
		ver ver = mObserver;
	//    3    5:aload_0         
	//    4    6:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
	//    5    9:astore_2        
		if(lifecycleowner != null && ver != null)
	//*   6   10:aload_1         
	//*   7   11:ifnull          29
	//*   8   14:aload_2         
	//*   9   15:ifnull          29
		{
			super.removeObserver(((Observer) (ver)));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokespecial   #167 <Method void MutableLiveData.removeObserver(Observer)>
			observe(lifecycleowner, ((Observer) (ver)));
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

	Loader setCallback(LifecycleOwner lifecycleowner,  )
	{
		 = (() (new ver(mLoader, )));
	//    0    0:new             #94  <Class LoaderManagerImpl$LoaderObserver>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getfield        #36  <Field Loader mLoader>
	//    4    8:aload_2         
	//    5    9:invokespecial   #214 <Method void LoaderManagerImpl$LoaderObserver(Loader, LoaderManager$LoaderCallbacks)>
	//    6   12:astore_2        
		observe(lifecycleowner, ((Observer) ()));
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:aload_2         
	//   10   16:invokevirtual   #171 <Method void observe(LifecycleOwner, Observer)>
		ver ver = mObserver;
	//   11   19:aload_0         
	//   12   20:getfield        #88  <Field LoaderManagerImpl$LoaderObserver mObserver>
	//   13   23:astore_3        
		if(ver != null)
	//*  14   24:aload_3         
	//*  15   25:ifnull          33
			removeObserver(((Observer) (ver)));
	//   16   28:aload_0         
	//   17   29:aload_3         
	//   18   30:invokevirtual   #92  <Method void removeObserver(Observer)>
		mLifecycleOwner = lifecycleowner;
	//   19   33:aload_0         
	//   20   34:aload_1         
	//   21   35:putfield        #166 <Field LifecycleOwner mLifecycleOwner>
		mObserver = ((ver) ());
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
	//    2    2:invokespecial   #216 <Method void MutableLiveData.setValue(Object)>
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
	private ver mObserver;
	private Loader mPriorLoader;

	LoaderManagerImpl$LoaderInfo(int i, Bundle bundle, Loader loader, Loader loader1)
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
		mLoader.registerListener(i, ((android.support.v4.content.) (this)));
	//   14   25:aload_0         
	//   15   26:getfield        #36  <Field Loader mLoader>
	//   16   29:iload_1         
	//   17   30:aload_0         
	//   18   31:invokevirtual   #44  <Method void Loader.registerListener(int, android.support.v4.content.Loader$OnLoadCompleteListener)>
	//   19   34:return          
	}
}
