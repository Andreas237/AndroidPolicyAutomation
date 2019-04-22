// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.dynamic;

import android.content.Context;
import android.os.IBinder;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.internal.Preconditions;

public abstract class RemoteCreator
{
	public static class RemoteCreatorException extends Exception
	{

		public RemoteCreatorException(String s)
		{
			super(s);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokespecial   #11  <Method void Exception(String)>
		//    3    5:return          
		}

		public RemoteCreatorException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #15  <Method void Exception(String, Throwable)>
		//    4    6:return          
		}
	}


	protected RemoteCreator(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #18  <Method void Object()>
		zzabo = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #20  <Field String zzabo>
	//    5    9:return          
	}

	protected abstract Object getRemoteCreator(IBinder ibinder);

	protected final Object getRemoteCreatorInstance(Context context)
		throws RemoteCreatorException
	{
		if(zzabp == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #33  <Field Object zzabp>
	//*   2    4:ifnonnull       97
		{
			Preconditions.checkNotNull(((Object) (context)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #39  <Method Object Preconditions.checkNotNull(Object)>
	//    5   11:pop             
			context = GooglePlayServicesUtilLight.getRemoteContext(context);
	//    6   12:aload_1         
	//    7   13:invokestatic    #45  <Method Context GooglePlayServicesUtilLight.getRemoteContext(Context)>
	//    8   16:astore_1        
			if(context != null)
	//*   9   17:aload_1         
	//*  10   18:ifnull          87
			{
				context = ((Context) (context.getClassLoader()));
	//   11   21:aload_1         
	//   12   22:invokevirtual   #51  <Method ClassLoader Context.getClassLoader()>
	//   13   25:astore_1        
				try
				{
					zzabp = getRemoteCreator((IBinder)((ClassLoader) (context)).loadClass(zzabo).newInstance());
	//   14   26:aload_0         
	//   15   27:aload_0         
	//   16   28:aload_1         
	//   17   29:aload_0         
	//   18   30:getfield        #20  <Field String zzabo>
	//   19   33:invokevirtual   #57  <Method Class ClassLoader.loadClass(String)>
	//   20   36:invokevirtual   #63  <Method Object Class.newInstance()>
	//   21   39:checkcast       #65  <Class IBinder>
	//   22   42:invokevirtual   #67  <Method Object getRemoteCreator(IBinder)>
	//   23   45:putfield        #33  <Field Object zzabp>
				}
	//*  24   48:goto            97
	//*  25   51:astore_1        
	//*  26   52:new             #7   <Class RemoteCreator$RemoteCreatorException>
	//*  27   55:dup             
	//*  28   56:ldc1            #69  <String "Could not access creator.">
	//*  29   58:aload_1         
	//*  30   59:invokespecial   #72  <Method void RemoteCreator$RemoteCreatorException(String, Throwable)>
	//*  31   62:athrow          
	//*  32   63:astore_1        
	//*  33   64:new             #7   <Class RemoteCreator$RemoteCreatorException>
	//*  34   67:dup             
	//*  35   68:ldc1            #74  <String "Could not instantiate creator.">
	//*  36   70:aload_1         
	//*  37   71:invokespecial   #72  <Method void RemoteCreator$RemoteCreatorException(String, Throwable)>
	//*  38   74:athrow          
				// Misplaced declaration of an exception variable
				catch(Context context)
	//*  39   75:astore_1        
				{
					throw new RemoteCreatorException("Could not load creator class.", ((Throwable) (context)));
	//   40   76:new             #7   <Class RemoteCreator$RemoteCreatorException>
	//   41   79:dup             
	//   42   80:ldc1            #76  <String "Could not load creator class.">
	//   43   82:aload_1         
	//   44   83:invokespecial   #72  <Method void RemoteCreator$RemoteCreatorException(String, Throwable)>
	//   45   86:athrow          
				}
				// Misplaced declaration of an exception variable
				catch(Context context)
				{
					throw new RemoteCreatorException("Could not instantiate creator.", ((Throwable) (context)));
				}
				// Misplaced declaration of an exception variable
				catch(Context context)
				{
					throw new RemoteCreatorException("Could not access creator.", ((Throwable) (context)));
				}
			} else
			{
				throw new RemoteCreatorException("Could not get remote context.");
	//   46   87:new             #7   <Class RemoteCreator$RemoteCreatorException>
	//   47   90:dup             
	//   48   91:ldc1            #78  <String "Could not get remote context.">
	//   49   93:invokespecial   #80  <Method void RemoteCreator$RemoteCreatorException(String)>
	//   50   96:athrow          
			}
		}
		return zzabp;
	//   51   97:aload_0         
	//   52   98:getfield        #33  <Field Object zzabp>
	//   53  101:areturn         
	}

	private final String zzabo;
	private Object zzabp;
}
