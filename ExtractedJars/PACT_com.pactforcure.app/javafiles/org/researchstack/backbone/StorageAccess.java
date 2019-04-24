// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package org.researchstack.backbone;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.*;
import org.researchstack.backbone.storage.database.AppDatabase;
import org.researchstack.backbone.storage.file.EncryptionProvider;
import org.researchstack.backbone.storage.file.FileAccess;
import org.researchstack.backbone.storage.file.PinCodeConfig;
import org.researchstack.backbone.storage.file.StorageAccessException;
import org.researchstack.backbone.storage.file.StorageAccessListener;
import org.researchstack.backbone.storage.file.aes.Encrypter;
import org.researchstack.backbone.utils.UiThreadContext;

public class StorageAccess
{

	private StorageAccess()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void Object()>
		handler = new Handler(Looper.getMainLooper());
	//    2    4:aload_0         
	//    3    5:new             #33  <Class Handler>
	//    4    8:dup             
	//    5    9:invokestatic    #39  <Method Looper Looper.getMainLooper()>
	//    6   12:invokespecial   #42  <Method void Handler(Looper)>
	//    7   15:putfield        #44  <Field Handler handler>
		listeners = Collections.synchronizedList(((List) (new ArrayList())));
	//    8   18:aload_0         
	//    9   19:new             #46  <Class ArrayList>
	//   10   22:dup             
	//   11   23:invokespecial   #47  <Method void ArrayList()>
	//   12   26:invokestatic    #53  <Method List Collections.synchronizedList(List)>
	//   13   29:putfield        #55  <Field List listeners>
	//   14   32:return          
	}

	public static StorageAccess getInstance()
	{
		return instance;
	//    0    0:getstatic       #29  <Field StorageAccess instance>
	//    1    3:areturn         
	}

	private void injectEncrypter()
	{
		fileAccess.setEncrypter(encryptionProvider.getEncrypter());
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field FileAccess fileAccess>
	//    2    4:aload_0         
	//    3    5:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//    4    8:invokeinterface #81  <Method Encrypter EncryptionProvider.getEncrypter()>
	//    5   13:invokeinterface #87  <Method void FileAccess.setEncrypter(Encrypter)>
		appDatabase.setEncryptionKey(encryptionProvider.getEncrypter().getDbKey());
	//    6   18:aload_0         
	//    7   19:getfield        #89  <Field AppDatabase appDatabase>
	//    8   22:aload_0         
	//    9   23:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//   10   26:invokeinterface #81  <Method Encrypter EncryptionProvider.getEncrypter()>
	//   11   31:invokeinterface #95  <Method String Encrypter.getDbKey()>
	//   12   36:invokeinterface #101 <Method void AppDatabase.setEncryptionKey(String)>
	//   13   41:return          
	}

	private void notifyHardFail()
	{
	/* block-local class not found */
	class .Lambda._cls2 {}

		handler.post(.Lambda._cls2.lambdaFactory.(this));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:invokestatic    #108 <Method Runnable StorageAccess$$Lambda$2.lambdaFactory$(StorageAccess)>
	//    4    8:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	private void notifyListenersHardFail()
	{
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((StorageAccessListener)iterator.next()).onDataFailed());
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List listeners>
	//    2    4:invokeinterface #119 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #129 <Method Object Iterator.next()>
	//    9   25:checkcast       #131 <Class StorageAccessListener>
	//   10   28:invokeinterface #134 <Method void StorageAccessListener.onDataFailed()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	private void notifyListenersReady()
	{
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((StorageAccessListener)iterator.next()).onDataReady());
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List listeners>
	//    2    4:invokeinterface #119 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #129 <Method Object Iterator.next()>
	//    9   25:checkcast       #131 <Class StorageAccessListener>
	//   10   28:invokeinterface #138 <Method void StorageAccessListener.onDataReady()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	private void notifyListenersSoftFail()
	{
		for(Iterator iterator = listeners.iterator(); iterator.hasNext(); ((StorageAccessListener)iterator.next()).onDataAuth());
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List listeners>
	//    2    4:invokeinterface #119 <Method Iterator List.iterator()>
	//    3    9:astore_1        
	//    4   10:aload_1         
	//    5   11:invokeinterface #125 <Method boolean Iterator.hasNext()>
	//    6   16:ifeq            36
	//    7   19:aload_1         
	//    8   20:invokeinterface #129 <Method Object Iterator.next()>
	//    9   25:checkcast       #131 <Class StorageAccessListener>
	//   10   28:invokeinterface #141 <Method void StorageAccessListener.onDataAuth()>
	//*  11   33:goto            10
	//   12   36:return          
	}

	private void notifyReady()
	{
	/* block-local class not found */
	class .Lambda._cls1 {}

		handler.post(.Lambda._cls1.lambdaFactory.(this));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:invokestatic    #145 <Method Runnable StorageAccess$$Lambda$1.lambdaFactory$(StorageAccess)>
	//    4    8:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	private void notifySoftFail()
	{
	/* block-local class not found */
	class .Lambda._cls3 {}

		handler.post(.Lambda._cls3.lambdaFactory.(this));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Handler handler>
	//    2    4:aload_0         
	//    3    5:invokestatic    #149 <Method Runnable StorageAccess$$Lambda$3.lambdaFactory$(StorageAccess)>
	//    4    8:invokevirtual   #112 <Method boolean Handler.post(Runnable)>
	//    5   11:pop             
	//    6   12:return          
	}

	public void authenticate(Context context, String s)
	{
		encryptionProvider.startWithPassphrase(context, s);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokeinterface #154 <Method void EncryptionProvider.startWithPassphrase(Context, String)>
		injectEncrypter();
	//    5   11:aload_0         
	//    6   12:invokespecial   #156 <Method void injectEncrypter()>
	//    7   15:return          
	}

	public void changePinCode(Context context, String s, String s1)
	{
		encryptionProvider.changePinCode(context, s, s1);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:aload_3         
	//    5    7:invokeinterface #160 <Method void EncryptionProvider.changePinCode(Context, String, String)>
		injectEncrypter();
	//    6   12:aload_0         
	//    7   13:invokespecial   #156 <Method void injectEncrypter()>
	//    8   16:return          
	}

	public void createPinCode(Context context, String s)
	{
		if(hasPinCode(context))
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:invokevirtual   #165 <Method boolean hasPinCode(Context)>
	//*   3    5:ifeq            18
		{
			throw new StorageAccessException("Attempted to create a pin when one already exists");
	//    4    8:new             #167 <Class StorageAccessException>
	//    5   11:dup             
	//    6   12:ldc1            #169 <String "Attempted to create a pin when one already exists">
	//    7   14:invokespecial   #171 <Method void StorageAccessException(String)>
	//    8   17:athrow          
		} else
		{
			encryptionProvider.createPinCode(context, s);
	//    9   18:aload_0         
	//   10   19:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//   11   22:aload_1         
	//   12   23:aload_2         
	//   13   24:invokeinterface #173 <Method void EncryptionProvider.createPinCode(Context, String)>
			injectEncrypter();
	//   14   29:aload_0         
	//   15   30:invokespecial   #156 <Method void injectEncrypter()>
			return;
	//   16   33:return          
		}
	}

	public AppDatabase getAppDatabase()
	{
		return appDatabase;
	//    0    0:aload_0         
	//    1    1:getfield        #89  <Field AppDatabase appDatabase>
	//    2    4:areturn         
	}

	public FileAccess getFileAccess()
	{
		return fileAccess;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field FileAccess fileAccess>
	//    2    4:areturn         
	}

	public PinCodeConfig getPinCodeConfig()
	{
		return pinCodeConfig;
	//    0    0:aload_0         
	//    1    1:getfield        #181 <Field PinCodeConfig pinCodeConfig>
	//    2    4:areturn         
	}

	public boolean hasPinCode(Context context)
	{
		return encryptionProvider.hasPinCode(context);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//    2    4:aload_1         
	//    3    5:invokeinterface #182 <Method boolean EncryptionProvider.hasPinCode(Context)>
	//    4   10:ireturn         
	}

	public void init(PinCodeConfig pincodeconfig, EncryptionProvider encryptionprovider, FileAccess fileaccess, AppDatabase appdatabase)
	{
		pinCodeConfig = pincodeconfig;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #181 <Field PinCodeConfig pinCodeConfig>
		appDatabase = appdatabase;
	//    3    5:aload_0         
	//    4    6:aload           4
	//    5    8:putfield        #89  <Field AppDatabase appDatabase>
		fileAccess = fileaccess;
	//    6   11:aload_0         
	//    7   12:aload_3         
	//    8   13:putfield        #73  <Field FileAccess fileAccess>
		encryptionProvider = encryptionprovider;
	//    9   16:aload_0         
	//   10   17:aload_2         
	//   11   18:putfield        #75  <Field EncryptionProvider encryptionProvider>
	//   12   21:return          
	}

	public void logAccessTime()
	{
		encryptionProvider.logAccessTime();
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//    2    4:invokeinterface #187 <Method void EncryptionProvider.logAccessTime()>
	//    3    9:return          
	}

	public final void register(StorageAccessListener storageaccesslistener)
	{
		if(listeners.contains(((Object) (storageaccesslistener))))
	//*   0    0:aload_0         
	//*   1    1:getfield        #55  <Field List listeners>
	//*   2    4:aload_1         
	//*   3    5:invokeinterface #193 <Method boolean List.contains(Object)>
	//*   4   10:ifeq            23
		{
			throw new StorageAccessException("Listener already registered");
	//    5   13:new             #167 <Class StorageAccessException>
	//    6   16:dup             
	//    7   17:ldc1            #195 <String "Listener already registered">
	//    8   19:invokespecial   #171 <Method void StorageAccessException(String)>
	//    9   22:athrow          
		} else
		{
			listeners.add(((Object) (storageaccesslistener)));
	//   10   23:aload_0         
	//   11   24:getfield        #55  <Field List listeners>
	//   12   27:aload_1         
	//   13   28:invokeinterface #198 <Method boolean List.add(Object)>
	//   14   33:pop             
			return;
	//   15   34:return          
		}
	}

	public void removePinCode(Context context)
	{
		encryptionProvider.removePinCode(context);
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//    2    4:aload_1         
	//    3    5:invokeinterface #202 <Method void EncryptionProvider.removePinCode(Context)>
	//    4   10:return          
	}

	public void requestStorageAccess(Context context)
	{
		UiThreadContext.assertUiThread();
	//    0    0:invokestatic    #208 <Method void UiThreadContext.assertUiThread()>
		if(encryptionProvider.needsAuth(context, pinCodeConfig))
	//*   1    3:aload_0         
	//*   2    4:getfield        #75  <Field EncryptionProvider encryptionProvider>
	//*   3    7:aload_1         
	//*   4    8:aload_0         
	//*   5    9:getfield        #181 <Field PinCodeConfig pinCodeConfig>
	//*   6   12:invokeinterface #212 <Method boolean EncryptionProvider.needsAuth(Context, PinCodeConfig)>
	//*   7   17:ifeq            25
		{
			notifySoftFail();
	//    8   20:aload_0         
	//    9   21:invokespecial   #214 <Method void notifySoftFail()>
			return;
	//   10   24:return          
		} else
		{
			notifyReady();
	//   11   25:aload_0         
	//   12   26:invokespecial   #216 <Method void notifyReady()>
			return;
	//   13   29:return          
		}
	}

	public final void unregister(StorageAccessListener storageaccesslistener)
	{
		listeners.remove(((Object) (storageaccesslistener)));
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field List listeners>
	//    2    4:aload_1         
	//    3    5:invokeinterface #220 <Method boolean List.remove(Object)>
	//    4   10:pop             
	//    5   11:return          
	}

	private static final boolean CHECK_THREADS = false;
	private static StorageAccess instance = new StorageAccess();
	private AppDatabase appDatabase;
	private EncryptionProvider encryptionProvider;
	private FileAccess fileAccess;
	private Handler handler;
	private List listeners;
	private PinCodeConfig pinCodeConfig;

	static 
	{
	//    0    0:new             #2   <Class StorageAccess>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void StorageAccess()>
	//    3    7:putstatic       #29  <Field StorageAccess instance>
	//*   4   10:return          
	}


/*
	static void access$lambda$0(StorageAccess storageaccess)
	{
		storageaccess.notifyListenersReady();
	//    0    0:aload_0         
	//    1    1:invokespecial   #60  <Method void notifyListenersReady()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$lambda$1(StorageAccess storageaccess)
	{
		storageaccess.notifyListenersHardFail();
	//    0    0:aload_0         
	//    1    1:invokespecial   #64  <Method void notifyListenersHardFail()>
		return;
	//    2    4:return          
	}

*/


/*
	static void access$lambda$2(StorageAccess storageaccess)
	{
		storageaccess.notifyListenersSoftFail();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void notifyListenersSoftFail()>
		return;
	//    2    4:return          
	}

*/
}
