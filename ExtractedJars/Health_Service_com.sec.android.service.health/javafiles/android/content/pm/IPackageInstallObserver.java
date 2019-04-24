// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package android.content.pm;

import android.os.*;

public interface IPackageInstallObserver
	extends IInterface
{
	public static abstract class Stub extends Binder
		implements IPackageInstallObserver
	{

		public static IPackageInstallObserver asInterface(IBinder ibinder)
		{
			throw new RuntimeException("Stub!");
		//    0    0:new             #13  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #15  <String "Stub!">
		//    3    6:invokespecial   #18  <Method void RuntimeException(String)>
		//    4    9:athrow          
		}

		public IBinder asBinder()
		{
			throw new RuntimeException("Stub!");
		//    0    0:new             #13  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #15  <String "Stub!">
		//    3    6:invokespecial   #18  <Method void RuntimeException(String)>
		//    4    9:athrow          
		}

		public boolean onTransact(int i, Parcel parcel, Parcel parcel1, int j)
			throws RemoteException
		{
			throw new RuntimeException("Stub!");
		//    0    0:new             #13  <Class RuntimeException>
		//    1    3:dup             
		//    2    4:ldc1            #15  <String "Stub!">
		//    3    6:invokespecial   #18  <Method void RuntimeException(String)>
		//    4    9:athrow          
		}

		public Stub()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #11  <Method void Binder()>
			throw new RuntimeException("Stub!");
		//    2    4:new             #13  <Class RuntimeException>
		//    3    7:dup             
		//    4    8:ldc1            #15  <String "Stub!">
		//    5   10:invokespecial   #18  <Method void RuntimeException(String)>
		//    6   13:athrow          
		}
	}


	public abstract void packageInstalled(String s, int i)
		throws RemoteException;
}
