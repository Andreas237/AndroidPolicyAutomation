// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.support.v4.app;

import android.arch.lifecycle.Observer;
import android.support.v4.content.Loader;
import android.util.Log;
import java.io.PrintWriter;

// Referenced classes of package android.support.v4.app:
//			LoaderManagerImpl

static class LoaderManagerImpl$LoaderObserver
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

	LoaderManagerImpl$LoaderObserver(Loader loader, LoaderManager.LoaderCallbacks loadercallbacks)
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
