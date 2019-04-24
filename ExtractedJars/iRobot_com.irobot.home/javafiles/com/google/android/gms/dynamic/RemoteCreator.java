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
		//    2    2:invokespecial   #12  <Method void Exception(String)>
		//    3    5:return          
		}

		public RemoteCreatorException(String s, Throwable throwable)
		{
			super(s, throwable);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:invokespecial   #16  <Method void Exception(String, Throwable)>
		//    4    6:return          
		}
	}


	protected RemoteCreator(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		zzia = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String zzia>
	//    5    9:return          
	}

	protected abstract Object getRemoteCreator(IBinder ibinder);

	protected final Object getRemoteCreatorInstance(Context context)
	{
		if(zzib == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #35  <Field Object zzib>
	//*   2    4:ifnonnull       97
		{
			Preconditions.checkNotNull(((Object) (context)));
	//    3    7:aload_1         
	//    4    8:invokestatic    #41  <Method Object Preconditions.checkNotNull(Object)>
	//    5   11:pop             
			context = GooglePlayServicesUtilLight.getRemoteContext(context);
	//    6   12:aload_1         
	//    7   13:invokestatic    #47  <Method Context GooglePlayServicesUtilLight.getRemoteContext(Context)>
	//    8   16:astore_1        
			if(context == null)
	//*   9   17:aload_1         
	//*  10   18:ifnonnull       31
				throw new RemoteCreatorException("Could not get remote context.");
	//   11   21:new             #7   <Class RemoteCreator$RemoteCreatorException>
	//   12   24:dup             
	//   13   25:ldc1            #49  <String "Could not get remote context.">
	//   14   27:invokespecial   #51  <Method void RemoteCreator$RemoteCreatorException(String)>
	//   15   30:athrow          
			context = ((Context) (context.getClassLoader()));
	//   16   31:aload_1         
	//   17   32:invokevirtual   #57  <Method ClassLoader Context.getClassLoader()>
	//   18   35:astore_1        
			try
			{
				zzib = getRemoteCreator((IBinder)((ClassLoader) (context)).loadClass(zzia).newInstance());
	//   19   36:aload_0         
	//   20   37:aload_0         
	//   21   38:aload_1         
	//   22   39:aload_0         
	//   23   40:getfield        #21  <Field String zzia>
	//   24   43:invokevirtual   #63  <Method Class ClassLoader.loadClass(String)>
	//   25   46:invokevirtual   #69  <Method Object Class.newInstance()>
	//   26   49:checkcast       #71  <Class IBinder>
	//   27   52:invokevirtual   #73  <Method Object getRemoteCreator(IBinder)>
	//   28   55:putfield        #35  <Field Object zzib>
			}
	//*  29   58:goto            97
	//*  30   61:astore_1        
	//*  31   62:new             #7   <Class RemoteCreator$RemoteCreatorException>
	//*  32   65:dup             
	//*  33   66:ldc1            #75  <String "Could not access creator.">
	//*  34   68:aload_1         
	//*  35   69:invokespecial   #78  <Method void RemoteCreator$RemoteCreatorException(String, Throwable)>
	//*  36   72:athrow          
	//*  37   73:astore_1        
	//*  38   74:new             #7   <Class RemoteCreator$RemoteCreatorException>
	//*  39   77:dup             
	//*  40   78:ldc1            #80  <String "Could not instantiate creator.">
	//*  41   80:aload_1         
	//*  42   81:invokespecial   #78  <Method void RemoteCreator$RemoteCreatorException(String, Throwable)>
	//*  43   84:athrow          
			// Misplaced declaration of an exception variable
			catch(Context context)
	//*  44   85:astore_1        
			{
				throw new RemoteCreatorException("Could not load creator class.", ((Throwable) (context)));
	//   45   86:new             #7   <Class RemoteCreator$RemoteCreatorException>
	//   46   89:dup             
	//   47   90:ldc1            #82  <String "Could not load creator class.">
	//   48   92:aload_1         
	//   49   93:invokespecial   #78  <Method void RemoteCreator$RemoteCreatorException(String, Throwable)>
	//   50   96:athrow          
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
		}
		return zzib;
	//   51   97:aload_0         
	//   52   98:getfield        #35  <Field Object zzib>
	//   53  101:areturn         
	}

	private final String zzia;
	private Object zzib;
}
