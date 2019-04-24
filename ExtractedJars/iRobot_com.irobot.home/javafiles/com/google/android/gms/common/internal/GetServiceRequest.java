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

// Referenced classes of package com.google.android.gms.common.internal:
//			zzd, AccountAccessor

public class GetServiceRequest extends AbstractSafeParcelable
{

	public GetServiceRequest(int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void AbstractSafeParcelable()>
		version = 4;
	//    2    4:aload_0         
	//    3    5:iconst_4        
	//    4    6:putfield        #61  <Field int version>
		zzdg = GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE;
	//    5    9:aload_0         
	//    6   10:getstatic       #66  <Field int GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE>
	//    7   13:putfield        #68  <Field int zzdg>
		zzdf = i;
	//    8   16:aload_0         
	//    9   17:iload_1         
	//   10   18:putfield        #70  <Field int zzdf>
		zzdo = true;
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:putfield        #72  <Field boolean zzdo>
	//   14   26:return          
	}

	GetServiceRequest(int i, int j, int k, String s, IBinder ibinder, Scope ascope[], Bundle bundle, 
			Account account, Feature afeature[], Feature afeature1[], boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #59  <Method void AbstractSafeParcelable()>
		version = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #61  <Field int version>
		zzdf = j;
	//    5    9:aload_0         
	//    6   10:iload_2         
	//    7   11:putfield        #70  <Field int zzdf>
		zzdg = k;
	//    8   14:aload_0         
	//    9   15:iload_3         
	//   10   16:putfield        #68  <Field int zzdg>
		if("com.google.android.gms".equals(((Object) (s))))
	//*  11   19:ldc1            #77  <String "com.google.android.gms">
	//*  12   21:aload           4
	//*  13   23:invokevirtual   #83  <Method boolean String.equals(Object)>
	//*  14   26:ifeq            38
			zzdh = "com.google.android.gms";
	//   15   29:aload_0         
	//   16   30:ldc1            #77  <String "com.google.android.gms">
	//   17   32:putfield        #85  <Field String zzdh>
		else
	//*  18   35:goto            44
			zzdh = s;
	//   19   38:aload_0         
	//   20   39:aload           4
	//   21   41:putfield        #85  <Field String zzdh>
		if(i < 2)
	//*  22   44:iload_1         
	//*  23   45:iconst_2        
	//*  24   46:icmpge          76
		{
			s = null;
	//   25   49:aconst_null     
	//   26   50:astore          4
			if(ibinder != null)
	//*  27   52:aload           5
	//*  28   54:ifnull          67
				s = ((String) (AccountAccessor.getAccountBinderSafe(IAccountAccessor.Stub.asInterface(ibinder))));
	//   29   57:aload           5
	//   30   59:invokestatic    #91  <Method IAccountAccessor IAccountAccessor$Stub.asInterface(IBinder)>
	//   31   62:invokestatic    #97  <Method Account AccountAccessor.getAccountBinderSafe(IAccountAccessor)>
	//   32   65:astore          4
			zzdl = ((Account) (s));
	//   33   67:aload_0         
	//   34   68:aload           4
	//   35   70:putfield        #99  <Field Account zzdl>
		} else
	//*  36   73:goto            88
		{
			zzdi = ibinder;
	//   37   76:aload_0         
	//   38   77:aload           5
	//   39   79:putfield        #101 <Field IBinder zzdi>
			zzdl = account;
	//   40   82:aload_0         
	//   41   83:aload           8
	//   42   85:putfield        #99  <Field Account zzdl>
		}
		zzdj = ascope;
	//   43   88:aload_0         
	//   44   89:aload           6
	//   45   91:putfield        #103 <Field Scope[] zzdj>
		zzdk = bundle;
	//   46   94:aload_0         
	//   47   95:aload           7
	//   48   97:putfield        #105 <Field Bundle zzdk>
		zzdm = afeature;
	//   49  100:aload_0         
	//   50  101:aload           9
	//   51  103:putfield        #107 <Field Feature[] zzdm>
		zzdn = afeature1;
	//   52  106:aload_0         
	//   53  107:aload           10
	//   54  109:putfield        #109 <Field Feature[] zzdn>
		zzdo = flag;
	//   55  112:aload_0         
	//   56  113:iload           11
	//   57  115:putfield        #72  <Field boolean zzdo>
	//   58  118:return          
	}

	public Bundle getExtraArgs()
	{
		return zzdk;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field Bundle zzdk>
	//    2    4:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #121 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, version);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #61  <Field int version>
	//    7   11:invokestatic    #125 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 2, zzdf);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #70  <Field int zzdf>
	//   12   20:invokestatic    #125 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeInt(parcel, 3, zzdg);
	//   13   23:aload_1         
	//   14   24:iconst_3        
	//   15   25:aload_0         
	//   16   26:getfield        #68  <Field int zzdg>
	//   17   29:invokestatic    #125 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 4, zzdh, false);
	//   18   32:aload_1         
	//   19   33:iconst_4        
	//   20   34:aload_0         
	//   21   35:getfield        #85  <Field String zzdh>
	//   22   38:iconst_0        
	//   23   39:invokestatic    #129 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeIBinder(parcel, 5, zzdi, false);
	//   24   42:aload_1         
	//   25   43:iconst_5        
	//   26   44:aload_0         
	//   27   45:getfield        #101 <Field IBinder zzdi>
	//   28   48:iconst_0        
	//   29   49:invokestatic    #133 <Method void SafeParcelWriter.writeIBinder(Parcel, int, IBinder, boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 6, ((android.os.Parcelable []) (zzdj)), i, false);
	//   30   52:aload_1         
	//   31   53:bipush          6
	//   32   55:aload_0         
	//   33   56:getfield        #103 <Field Scope[] zzdj>
	//   34   59:iload_2         
	//   35   60:iconst_0        
	//   36   61:invokestatic    #137 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeBundle(parcel, 7, zzdk, false);
	//   37   64:aload_1         
	//   38   65:bipush          7
	//   39   67:aload_0         
	//   40   68:getfield        #105 <Field Bundle zzdk>
	//   41   71:iconst_0        
	//   42   72:invokestatic    #141 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 8, ((android.os.Parcelable) (zzdl)), i, false);
	//   43   75:aload_1         
	//   44   76:bipush          8
	//   45   78:aload_0         
	//   46   79:getfield        #99  <Field Account zzdl>
	//   47   82:iload_2         
	//   48   83:iconst_0        
	//   49   84:invokestatic    #145 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 10, ((android.os.Parcelable []) (zzdm)), i, false);
	//   50   87:aload_1         
	//   51   88:bipush          10
	//   52   90:aload_0         
	//   53   91:getfield        #107 <Field Feature[] zzdm>
	//   54   94:iload_2         
	//   55   95:iconst_0        
	//   56   96:invokestatic    #137 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeTypedArray(parcel, 11, ((android.os.Parcelable []) (zzdn)), i, false);
	//   57   99:aload_1         
	//   58  100:bipush          11
	//   59  102:aload_0         
	//   60  103:getfield        #109 <Field Feature[] zzdn>
	//   61  106:iload_2         
	//   62  107:iconst_0        
	//   63  108:invokestatic    #137 <Method void SafeParcelWriter.writeTypedArray(Parcel, int, android.os.Parcelable[], int, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 12, zzdo);
	//   64  111:aload_1         
	//   65  112:bipush          12
	//   66  114:aload_0         
	//   67  115:getfield        #72  <Field boolean zzdo>
	//   68  118:invokestatic    #149 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   69  121:aload_1         
	//   70  122:iload_3         
	//   71  123:invokestatic    #152 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   72  126:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	private final int version;
	private final int zzdf;
	private int zzdg;
	String zzdh;
	IBinder zzdi;
	Scope zzdj[];
	Bundle zzdk;
	Account zzdl;
	Feature zzdm[];
	Feature zzdn[];
	private boolean zzdo;

	static 
	{
	//    0    0:new             #51  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #54  <Method void zzd()>
	//    3    7:putstatic       #56  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
