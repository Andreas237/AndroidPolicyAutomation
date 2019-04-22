// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.net;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;
import javax.net.ssl.*;

// Referenced classes of package com.google.android.gms.common.net:
//			ISocketFactoryCreator

public class SocketFactoryCreator extends RemoteCreator
{

	protected SocketFactoryCreator()
	{
		super("com.google.android.gms.common.net.SocketFactoryCreatorImpl");
	//    0    0:aload_0         
	//    1    1:ldc1            #11  <String "com.google.android.gms.common.net.SocketFactoryCreatorImpl">
	//    2    3:invokespecial   #14  <Method void RemoteCreator(String)>
	//    3    6:return          
	}

	public static SocketFactoryCreator getInstance()
	{
		if(zzvr == null)
	//*   0    0:getstatic       #19  <Field SocketFactoryCreator zzvr>
	//*   1    3:ifnonnull       16
			zzvr = new SocketFactoryCreator();
	//    2    6:new             #2   <Class SocketFactoryCreator>
	//    3    9:dup             
	//    4   10:invokespecial   #21  <Method void SocketFactoryCreator()>
	//    5   13:putstatic       #19  <Field SocketFactoryCreator zzvr>
		return zzvr;
	//    6   16:getstatic       #19  <Field SocketFactoryCreator zzvr>
	//    7   19:areturn         
	}

	protected ISocketFactoryCreator getRemoteCreator(IBinder ibinder)
	{
		return ISocketFactoryCreator.Stub.asInterface(ibinder);
	//    0    0:aload_1         
	//    1    1:invokestatic    #28  <Method ISocketFactoryCreator ISocketFactoryCreator$Stub.asInterface(IBinder)>
	//    2    4:areturn         
	}

	protected volatile Object getRemoteCreator(IBinder ibinder)
	{
		return ((Object) (getRemoteCreator(ibinder)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #31  <Method ISocketFactoryCreator getRemoteCreator(IBinder)>
	//    3    5:areturn         
	}

	public SSLSocketFactory makeSocketFactory(Context context, KeyManager akeymanager[], TrustManager atrustmanager[], boolean flag)
	{
		context = ((Context) ((SSLSocketFactory)ObjectWrapper.unwrap(((ISocketFactoryCreator)((RemoteCreator)this).getRemoteCreatorInstance(context)).newSocketFactory(ObjectWrapper.wrap(((Object) (context))), ObjectWrapper.wrap(((Object) (akeymanager))), ObjectWrapper.wrap(((Object) (atrustmanager))), flag))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method Object RemoteCreator.getRemoteCreatorInstance(Context)>
	//    3    5:checkcast       #43  <Class ISocketFactoryCreator>
	//    4    8:aload_1         
	//    5    9:invokestatic    #49  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    6   12:aload_2         
	//    7   13:invokestatic    #49  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   16:aload_3         
	//    9   17:invokestatic    #49  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   20:iload           4
	//   11   22:invokeinterface #53  <Method com.google.android.gms.dynamic.IObjectWrapper ISocketFactoryCreator.newSocketFactory(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, boolean)>
	//   12   27:invokestatic    #57  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   13   30:checkcast       #59  <Class SSLSocketFactory>
	//   14   33:astore_1        
		return ((SSLSocketFactory) (context));
	//   15   34:aload_1         
	//   16   35:areturn         
		context;
	//   17   36:astore_1        
		break MISSING_BLOCK_LABEL_41;
	//   18   37:goto            41
		context;
	//   19   40:astore_1        
		throw new RuntimeException(((Throwable) (context)));
	//   20   41:new             #61  <Class RuntimeException>
	//   21   44:dup             
	//   22   45:aload_1         
	//   23   46:invokespecial   #64  <Method void RuntimeException(Throwable)>
	//   24   49:athrow          
	}

	public SSLSocketFactory makeSocketFactoryWithCacheDir(Context context, KeyManager akeymanager[], TrustManager atrustmanager[], String s)
	{
		context = ((Context) ((SSLSocketFactory)ObjectWrapper.unwrap(((ISocketFactoryCreator)((RemoteCreator)this).getRemoteCreatorInstance(context)).newSocketFactoryWithCacheDir(ObjectWrapper.wrap(((Object) (context))), ObjectWrapper.wrap(((Object) (akeymanager))), ObjectWrapper.wrap(((Object) (atrustmanager))), s))));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #41  <Method Object RemoteCreator.getRemoteCreatorInstance(Context)>
	//    3    5:checkcast       #43  <Class ISocketFactoryCreator>
	//    4    8:aload_1         
	//    5    9:invokestatic    #49  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    6   12:aload_2         
	//    7   13:invokestatic    #49  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//    8   16:aload_3         
	//    9   17:invokestatic    #49  <Method com.google.android.gms.dynamic.IObjectWrapper ObjectWrapper.wrap(Object)>
	//   10   20:aload           4
	//   11   22:invokeinterface #70  <Method com.google.android.gms.dynamic.IObjectWrapper ISocketFactoryCreator.newSocketFactoryWithCacheDir(com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, com.google.android.gms.dynamic.IObjectWrapper, String)>
	//   12   27:invokestatic    #57  <Method Object ObjectWrapper.unwrap(com.google.android.gms.dynamic.IObjectWrapper)>
	//   13   30:checkcast       #59  <Class SSLSocketFactory>
	//   14   33:astore_1        
		return ((SSLSocketFactory) (context));
	//   15   34:aload_1         
	//   16   35:areturn         
		context;
	//   17   36:astore_1        
		break MISSING_BLOCK_LABEL_41;
	//   18   37:goto            41
		context;
	//   19   40:astore_1        
		throw new RuntimeException(((Throwable) (context)));
	//   20   41:new             #61  <Class RuntimeException>
	//   21   44:dup             
	//   22   45:aload_1         
	//   23   46:invokespecial   #64  <Method void RuntimeException(Throwable)>
	//   24   49:athrow          
	}

	private static SocketFactoryCreator zzvr;
}
