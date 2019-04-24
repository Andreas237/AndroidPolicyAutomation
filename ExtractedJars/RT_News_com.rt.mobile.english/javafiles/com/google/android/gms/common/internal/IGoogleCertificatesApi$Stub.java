// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.*;
import com.google.android.gms.common.GoogleCertificatesQuery;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.internal.stable.*;

// Referenced classes of package com.google.android.gms.common.internal:
//			IGoogleCertificatesApi

public static abstract class IGoogleCertificatesApi$Stub extends zzb
	implements IGoogleCertificatesApi
{
	public static class Proxy extends zza
		implements IGoogleCertificatesApi
	{

		public IObjectWrapper getGoogleCertificates()
			throws RemoteException
		{
			Parcel parcel = ((zza)this).transactAndReadException(1, ((zza)this).obtainAndWriteInterfaceToken());
		//    0    0:aload_0         
		//    1    1:iconst_1        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//    5    9:astore_1        
			IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
		//    6   10:aload_1         
		//    7   11:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
		//    8   14:invokestatic    #42  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//    9   17:astore_2        
			parcel.recycle();
		//   10   18:aload_1         
		//   11   19:invokevirtual   #46  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   12   22:aload_2         
		//   13   23:areturn         
		}

		public IObjectWrapper getGoogleReleaseCertificates()
			throws RemoteException
		{
			Parcel parcel = ((zza)this).transactAndReadException(2, ((zza)this).obtainAndWriteInterfaceToken());
		//    0    0:aload_0         
		//    1    1:iconst_2        
		//    2    2:aload_0         
		//    3    3:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    4    6:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//    5    9:astore_1        
			IObjectWrapper iobjectwrapper = com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
		//    6   10:aload_1         
		//    7   11:invokevirtual   #36  <Method IBinder Parcel.readStrongBinder()>
		//    8   14:invokestatic    #42  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
		//    9   17:astore_2        
			parcel.recycle();
		//   10   18:aload_1         
		//   11   19:invokevirtual   #46  <Method void Parcel.recycle()>
			return iobjectwrapper;
		//   12   22:aload_2         
		//   13   23:areturn         
		}

		public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googlecertificatesquery, IObjectWrapper iobjectwrapper)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          4
			zzc.zza(parcel, ((android.os.Parcelable) (googlecertificatesquery)));
		//    3    6:aload           4
		//    4    8:aload_1         
		//    5    9:invokestatic    #56  <Method void zzc.zza(Parcel, android.os.Parcelable)>
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
		//    6   12:aload           4
		//    7   14:aload_2         
		//    8   15:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
			googlecertificatesquery = ((GoogleCertificatesQuery) (((zza)this).transactAndReadException(5, parcel)));
		//    9   18:aload_0         
		//   10   19:iconst_5        
		//   11   20:aload           4
		//   12   22:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   13   25:astore_1        
			boolean flag = zzc.zza(((Parcel) (googlecertificatesquery)));
		//   14   26:aload_1         
		//   15   27:invokestatic    #62  <Method boolean zzc.zza(Parcel)>
		//   16   30:istore_3        
			((Parcel) (googlecertificatesquery)).recycle();
		//   17   31:aload_1         
		//   18   32:invokevirtual   #46  <Method void Parcel.recycle()>
			return flag;
		//   19   35:iload_3         
		//   20   36:ireturn         
		}

		public boolean isGoogleReleaseSigned(String s, IObjectWrapper iobjectwrapper)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          4
			parcel.writeString(s);
		//    3    6:aload           4
		//    4    8:aload_1         
		//    5    9:invokevirtual   #68  <Method void Parcel.writeString(String)>
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
		//    6   12:aload           4
		//    7   14:aload_2         
		//    8   15:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
			s = ((String) (((zza)this).transactAndReadException(3, parcel)));
		//    9   18:aload_0         
		//   10   19:iconst_3        
		//   11   20:aload           4
		//   12   22:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   13   25:astore_1        
			boolean flag = zzc.zza(((Parcel) (s)));
		//   14   26:aload_1         
		//   15   27:invokestatic    #62  <Method boolean zzc.zza(Parcel)>
		//   16   30:istore_3        
			((Parcel) (s)).recycle();
		//   17   31:aload_1         
		//   18   32:invokevirtual   #46  <Method void Parcel.recycle()>
			return flag;
		//   19   35:iload_3         
		//   20   36:ireturn         
		}

		public boolean isGoogleSigned(String s, IObjectWrapper iobjectwrapper)
			throws RemoteException
		{
			Parcel parcel = ((zza)this).obtainAndWriteInterfaceToken();
		//    0    0:aload_0         
		//    1    1:invokevirtual   #26  <Method Parcel zza.obtainAndWriteInterfaceToken()>
		//    2    4:astore          4
			parcel.writeString(s);
		//    3    6:aload           4
		//    4    8:aload_1         
		//    5    9:invokevirtual   #68  <Method void Parcel.writeString(String)>
			zzc.zza(parcel, ((android.os.IInterface) (iobjectwrapper)));
		//    6   12:aload           4
		//    7   14:aload_2         
		//    8   15:invokestatic    #59  <Method void zzc.zza(Parcel, android.os.IInterface)>
			s = ((String) (((zza)this).transactAndReadException(4, parcel)));
		//    9   18:aload_0         
		//   10   19:iconst_4        
		//   11   20:aload           4
		//   12   22:invokevirtual   #30  <Method Parcel zza.transactAndReadException(int, Parcel)>
		//   13   25:astore_1        
			boolean flag = zzc.zza(((Parcel) (s)));
		//   14   26:aload_1         
		//   15   27:invokestatic    #62  <Method boolean zzc.zza(Parcel)>
		//   16   30:istore_3        
			((Parcel) (s)).recycle();
		//   17   31:aload_1         
		//   18   32:invokevirtual   #46  <Method void Parcel.recycle()>
			return flag;
		//   19   35:iload_3         
		//   20   36:ireturn         
		}

		Proxy(IBinder ibinder)
		{
			super(ibinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:ldc1            #14  <String "com.google.android.gms.common.internal.IGoogleCertificatesApi">
		//    3    4:invokespecial   #17  <Method void zza(IBinder, String)>
		//    4    7:return          
		}
	}


	public static IGoogleCertificatesApi asInterface(IBinder ibinder)
	{
		if(ibinder == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		android.os.IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
	//    4    6:aload_0         
	//    5    7:ldc1            #14  <String "com.google.android.gms.common.internal.IGoogleCertificatesApi">
	//    6    9:invokeinterface #26  <Method android.os.IInterface IBinder.queryLocalInterface(String)>
	//    7   14:astore_1        
		if(iinterface instanceof IGoogleCertificatesApi)
	//*   8   15:aload_1         
	//*   9   16:instanceof      #6   <Class IGoogleCertificatesApi>
	//*  10   19:ifeq            27
			return (IGoogleCertificatesApi)iinterface;
	//   11   22:aload_1         
	//   12   23:checkcast       #6   <Class IGoogleCertificatesApi>
	//   13   26:areturn         
		else
			return ((IGoogleCertificatesApi) (new Proxy(ibinder)));
	//   14   27:new             #9   <Class IGoogleCertificatesApi$Stub$Proxy>
	//   15   30:dup             
	//   16   31:aload_0         
	//   17   32:invokespecial   #29  <Method void IGoogleCertificatesApi$Stub$Proxy(IBinder)>
	//   18   35:areturn         
	}

	protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel1, int j)
		throws RemoteException
	{
label0:
		{
label1:
			{
label2:
				{
label3:
					{
						boolean flag;
						switch(i)
	//*   0    0:iload_1         
						{
	//*   1    1:tableswitch     1 5: default 36
	//	               1 122
	//	               2 114
	//	               3 84
	//	               4 64
	//	               5 38
						default:
							return false;
	//    2   36:iconst_0        
	//    3   37:ireturn         

						case 1: // '\001'
							break label2;

						case 2: // '\002'
							break label3;

						case 5: // '\005'
							flag = isGoogleOrPlatformSigned((GoogleCertificatesQuery)zzc.zza(parcel, GoogleCertificatesQuery.CREATOR), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//    4   38:aload_0         
	//    5   39:aload_2         
	//    6   40:getstatic       #39  <Field android.os.Parcelable$Creator GoogleCertificatesQuery.CREATOR>
	//    7   43:invokestatic    #45  <Method android.os.Parcelable zzc.zza(Parcel, android.os.Parcelable$Creator)>
	//    8   46:checkcast       #35  <Class GoogleCertificatesQuery>
	//    9   49:aload_2         
	//   10   50:invokevirtual   #51  <Method IBinder Parcel.readStrongBinder()>
	//   11   53:invokestatic    #56  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   12   56:invokevirtual   #60  <Method boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery, IObjectWrapper)>
	//   13   59:istore          5
							break;
	//   14   61:goto            101

						case 4: // '\004'
							flag = isGoogleSigned(parcel.readString(), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   15   64:aload_0         
	//   16   65:aload_2         
	//   17   66:invokevirtual   #64  <Method String Parcel.readString()>
	//   18   69:aload_2         
	//   19   70:invokevirtual   #51  <Method IBinder Parcel.readStrongBinder()>
	//   20   73:invokestatic    #56  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   21   76:invokevirtual   #68  <Method boolean isGoogleSigned(String, IObjectWrapper)>
	//   22   79:istore          5
							break;
	//   23   81:goto            101

						case 3: // '\003'
							flag = isGoogleReleaseSigned(parcel.readString(), com.google.android.gms.dynamic.IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
	//   24   84:aload_0         
	//   25   85:aload_2         
	//   26   86:invokevirtual   #64  <Method String Parcel.readString()>
	//   27   89:aload_2         
	//   28   90:invokevirtual   #51  <Method IBinder Parcel.readStrongBinder()>
	//   29   93:invokestatic    #56  <Method IObjectWrapper com.google.android.gms.dynamic.IObjectWrapper$Stub.asInterface(IBinder)>
	//   30   96:invokevirtual   #71  <Method boolean isGoogleReleaseSigned(String, IObjectWrapper)>
	//   31   99:istore          5
							break;
						}
						parcel1.writeNoException();
	//   32  101:aload_3         
	//   33  102:invokevirtual   #74  <Method void Parcel.writeNoException()>
						zzc.zza(parcel1, flag);
	//   34  105:aload_3         
	//   35  106:iload           5
	//   36  108:invokestatic    #77  <Method void zzc.zza(Parcel, boolean)>
						break label0;
	//   37  111:goto            136
					}
					parcel = ((Parcel) (getGoogleReleaseCertificates()));
	//   38  114:aload_0         
	//   39  115:invokevirtual   #81  <Method IObjectWrapper getGoogleReleaseCertificates()>
	//   40  118:astore_2        
					break label1;
	//   41  119:goto            127
				}
				parcel = ((Parcel) (getGoogleCertificates()));
	//   42  122:aload_0         
	//   43  123:invokevirtual   #84  <Method IObjectWrapper getGoogleCertificates()>
	//   44  126:astore_2        
			}
			parcel1.writeNoException();
	//   45  127:aload_3         
	//   46  128:invokevirtual   #74  <Method void Parcel.writeNoException()>
			zzc.zza(parcel1, ((android.os.IInterface) (parcel)));
	//   47  131:aload_3         
	//   48  132:aload_2         
	//   49  133:invokestatic    #87  <Method void zzc.zza(Parcel, android.os.IInterface)>
		}
		return true;
	//   50  136:iconst_1        
	//   51  137:ireturn         
	}

	public IGoogleCertificatesApi$Stub()
	{
		super("com.google.android.gms.common.internal.IGoogleCertificatesApi");
	//    0    0:aload_0         
	//    1    1:ldc1            #14  <String "com.google.android.gms.common.internal.IGoogleCertificatesApi">
	//    2    3:invokespecial   #17  <Method void zzb(String)>
	//    3    6:return          
	}
}
