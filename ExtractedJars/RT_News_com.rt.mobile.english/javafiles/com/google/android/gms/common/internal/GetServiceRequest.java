// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.*;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collection;

// Referenced classes of package com.google.android.gms.common.internal:
//			GetServiceRequestCreator, AccountAccessor, IAccountAccessor

public class GetServiceRequest extends AbstractSafeParcelable
{

	public GetServiceRequest(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void AbstractSafeParcelable()>
		version = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #60  <Field int version>
		zzsu = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #65  <Field int GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    7   13:putfield        #67  <Field int zzsu>
		zzst = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #69  <Field int zzst>
		zztc = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #71  <Field boolean zztc>
	//   14   26:return          
	}

	GetServiceRequest(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
			Account account, Feature afeature[], Feature afeature1[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #58  <Method void AbstractSafeParcelable()>
		version = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #60  <Field int version>
		zzst = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #69  <Field int zzst>
		zzsu = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #67  <Field int zzsu>
		if("com.google.android.gms".equals(((Object) (s))))
	//*  11   19:ldc1            #76  <String "com.google.android.gms">
	//*  12   21:aload           4
	//*  13   23:invokevirtual   #82  <Method boolean String.equals(Object)>
	//*  14   26:ifeq            38
			zzsv = "com.google.android.gms";
	//   15   29:aload_0         
	//   16   30:ldc1            #76  <String "com.google.android.gms">
	//   17   32:putfield        #84  <Field String zzsv>
		else
	//*  18   35:goto            44
			zzsv = s;
	//   19   38:aload_0         
	//   20   39:aload           4
	//   21   41:putfield        #84  <Field String zzsv>
		if(i < 2)
	//*  22   44:iload_1         
	//*  23   45:iconst_2        
	//*  24   46:icmpge          61
		{
			zzsz = zzb(ibinder);
	//   25   49:aload_0         
	//   26   50:aload           5
	//   27   52:invokestatic    #88  <Method Account zzb(IBinder)>
	//   28   55:putfield        #90  <Field Account zzsz>
		} else
	//*  29   58:goto            73
		{
			zzsw = ibinder;
	//   30   61:aload_0         
	//   31   62:aload           5
	//   32   64:putfield        #92  <Field IBinder zzsw>
			zzsz = account;
	//   33   67:aload_0         
	//   34   68:aload           8
	//   35   70:putfield        #90  <Field Account zzsz>
		}
		zzsx = ascope;
	//   36   73:aload_0         
	//   37   74:aload           6
	//   38   76:putfield        #94  <Field Scope[] zzsx>
		zzsy = bundle;
	//   39   79:aload_0         
	//   40   80:aload           7
	//   41   82:putfield        #96  <Field Bundle zzsy>
		zzta = afeature;
	//   42   85:aload_0         
	//   43   86:aload           9
	//   44   88:putfield        #98  <Field Feature[] zzta>
		zztb = afeature1;
	//   45   91:aload_0         
	//   46   92:aload           10
	//   47   94:putfield        #100 <Field Feature[] zztb>
		zztc = flag;
	//   48   97:aload_0         
	//   49   98:iload           11
	//   50  100:putfield        #71  <Field boolean zztc>
	//   51  103:return          
	}

	public static android.os.Parcelable.Creator getCreator()
	{
		return CREATOR;
	//    0    0:getstatic       #55  <Field android.os.Parcelable$Creator CREATOR>
	//    1    3:areturn         
	}

	private static Account zzb(IBinder ibinder)
	{
		if(ibinder != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          12
			return AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(ibinder));
	//    2    4:aload_0         
	//    3    5:invokestatic    #112 <Method IAccountAccessor IAccountAccessor$Stub.asInterface(IBinder)>
	//    4    8:invokestatic    #118 <Method Account AccountAccessor.getAccountBinderSafe(IAccountAccessor)>
	//    5   11:areturn         
		else
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
	}

	public Account getAuthenticatedAccount()
	{
		return zzb(zzsw);
	//    0    0:aload_0         
	//    1    1:getfield        #92  <Field IBinder zzsw>
	//    2    4:invokestatic    #88  <Method Account zzb(IBinder)>
	//    3    7:areturn         
	}

	public String getCallingPackage()
	{
		return zzsv;
	//    0    0:aload_0         
	//    1    1:getfield        #84  <Field String zzsv>
	//    2    4:areturn         
	}

	public Feature[] getClientApiFeatures()
	{
		return zztb;
	//    0    0:aload_0         
	//    1    1:getfield        #100 <Field Feature[] zztb>
	//    2    4:areturn         
	}

	public int getClientLibraryVersion()
	{
		return zzsu;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field int zzsu>
	//    2    4:ireturn         
	}

	public Account getClientRequestedAccount()
	{
		return zzsz;
	//    0    0:aload_0         
	//    1    1:getfield        #90  <Field Account zzsz>
	//    2    4:areturn         
	}

	public Feature[] getClientRequiredFeatures()
	{
		return zzta;
	//    0    0:aload_0         
	//    1    1:getfield        #98  <Field Feature[] zzta>
	//    2    4:areturn         
	}

	public Bundle getExtraArgs()
	{
		return zzsy;
	//    0    0:aload_0         
	//    1    1:getfield        #96  <Field Bundle zzsy>
	//    2    4:areturn         
	}

	public Scope[] getScopes()
	{
		return zzsx;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Scope[] zzsx>
	//    2    4:areturn         
	}

	public int getServiceId()
	{
		return zzst;
	//    0    0:aload_0         
	//    1    1:getfield        #69  <Field int zzst>
	//    2    4:ireturn         
	}

	public boolean isRequestingConnectionInfo()
	{
		return zztc;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field boolean zztc>
	//    2    4:ireturn         
	}

	public GetServiceRequest setAuthenticatedAccount(IAccountAccessor iaccountaccessor)
	{
		if(iaccountaccessor != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          14
			zzsw = iaccountaccessor.asBinder();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #143 <Method IBinder IAccountAccessor.asBinder()>
	//    5   11:putfield        #92  <Field IBinder zzsw>
		return this;
	//    6   14:aload_0         
	//    7   15:areturn         
	}

	public GetServiceRequest setCallingPackage(String s)
	{
		zzsv = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #84  <Field String zzsv>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GetServiceRequest setClientApiFeatures(Feature afeature[])
	{
		zztb = afeature;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #100 <Field Feature[] zztb>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GetServiceRequest setClientLibraryVersion(int i)
	{
		zzsu = i;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #67  <Field int zzsu>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GetServiceRequest setClientRequestedAccount(Account account)
	{
		zzsz = account;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #90  <Field Account zzsz>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GetServiceRequest setClientRequiredFeatures(Feature afeature[])
	{
		zzta = afeature;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #98  <Field Feature[] zzta>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GetServiceRequest setExtraArgs(Bundle bundle)
	{
		zzsy = bundle;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #96  <Field Bundle zzsy>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GetServiceRequest setRequestingConnectionInfo(boolean flag)
	{
		zztc = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #71  <Field boolean zztc>
		return this;
	//    3    5:aload_0         
	//    4    6:areturn         
	}

	public GetServiceRequest setScopes(Collection collection)
	{
		zzsx = (Scope[])collection.toArray(((Object []) (new Scope[collection.size()])));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_1         
	//    3    3:invokeinterface #163 <Method int Collection.size()>
	//    4    8:anewarray       Scope[]
	//    5   11:invokeinterface #169 <Method Object[] Collection.toArray(Object[])>
	//    6   16:checkcast       #170 <Class Scope[]>
	//    7   19:putfield        #94  <Field Scope[] zzsx>
		return this;
	//    8   22:aload_0         
	//    9   23:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #179 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, version);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #60  <Field int version>
	//    7   11:invokestatic    #183 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, zzst);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #69  <Field int zzst>
	//   12   20:invokestatic    #183 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 3, zzsu);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #67  <Field int zzsu>
	//   17   29:invokestatic    #183 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 4, zzsv, false);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #84  <Field String zzsv>
	//   22   38:iconst_0        
	//   23   39:invokestatic    #187 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 5, zzsw, false);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #92  <Field IBinder zzsw>
	//   28   48:iconst_0        
	//   29   49:invokestatic    #191 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 6, ((android.os.Parcelable []) (zzsx)), i, false);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #94  <Field Scope[] zzsx>
	//   34   59:iload_2         
	//   35   60:iconst_0        
	//   36   61:invokestatic    #195 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeBundle(parcel, 7, zzsy, false);
	//   37   64:aload_1         
	//   38   65:bipush          7
	//   39   67:aload_0         
	//   40   68:getfield        #96  <Field Bundle zzsy>
	//   41   71:iconst_0        
	//   42   72:invokestatic    #199 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 8, ((android.os.Parcelable) (zzsz)), i, false);
	//   43   75:aload_1         
	//   44   76:bipush          8
	//   45   78:aload_0         
	//   46   79:getfield        #90  <Field Account zzsz>
	//   47   82:iload_2         
	//   48   83:iconst_0        
	//   49   84:invokestatic    #203 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 10, ((android.os.Parcelable []) (zzta)), i, false);
	//   50   87:aload_1         
	//   51   88:bipush          10
	//   52   90:aload_0         
	//   53   91:getfield        #98  <Field Feature[] zzta>
	//   54   94:iload_2         
	//   55   95:iconst_0        
	//   56   96:invokestatic    #195 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 11, ((android.os.Parcelable []) (zztb)), i, false);
	//   57   99:aload_1         
	//   58  100:bipush          11
	//   59  102:aload_0         
	//   60  103:getfield        #100 <Field Feature[] zztb>
	//   61  106:iload_2         
	//   62  107:iconst_0        
	//   63  108:invokestatic    #195 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 12, zztc);
	//   64  111:aload_1         
	//   65  112:bipush          12
	//   66  114:aload_0         
	//   67  115:getfield        #71  <Field boolean zztc>
	//   68  118:invokestatic    #207 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   69  121:aload_1         
	//   70  122:iload_3         
	//   71  123:invokestatic    #210 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   72  126:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new GetServiceRequestCreator();
	private final int version;
	private final int zzst;
	private int zzsu;
	private String zzsv;
	private IBinder zzsw;
	private Scope zzsx[];
	private Bundle zzsy;
	private Account zzsz;
	private Feature zzta[];
	private Feature zztb[];
	private boolean zztc;

	static 
	{
	//    0    0:new             #50  <Class GetServiceRequestCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #53  <Method void GetServiceRequestCreator()>
	//    3    7:putstatic       #55  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
