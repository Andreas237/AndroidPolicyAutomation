// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaez, zzang

public final class zzaey extends AbstractSafeParcelable
{

	public zzaey(Bundle bundle, zzang zzang, ApplicationInfo applicationinfo, String s, List list, PackageInfo packageinfo, String s1, 
			boolean flag, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #55  <Method void AbstractSafeParcelable()>
		zzcfy = bundle;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #57  <Field Bundle zzcfy>
		zzcfz = zzang;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #59  <Field zzang zzcfz>
		packageName = s;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #61  <Field String packageName>
		applicationInfo = applicationinfo;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #63  <Field ApplicationInfo applicationInfo>
		zzcdj = list;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #65  <Field List zzcdj>
		zzccw = packageinfo;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #67  <Field PackageInfo zzccw>
		zzcds = s1;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #69  <Field String zzcds>
		zzcga = flag;
	//   23   43:aload_0         
	//   24   44:iload           8
	//   25   46:putfield        #71  <Field boolean zzcga>
		zzcgb = s2;
	//   26   49:aload_0         
	//   27   50:aload           9
	//   28   52:putfield        #73  <Field String zzcgb>
	//   29   55:return          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #86  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeBundle(parcel, 1, zzcfy, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #57  <Field Bundle zzcfy>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #90  <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zzcfz)), i, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #59  <Field zzang zzcfz>
	//   13   21:iload_2         
	//   14   22:iconst_0        
	//   15   23:invokestatic    #94  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (applicationInfo)), i, false);
	//   16   26:aload_1         
	//   17   27:iconst_3        
	//   18   28:aload_0         
	//   19   29:getfield        #63  <Field ApplicationInfo applicationInfo>
	//   20   32:iload_2         
	//   21   33:iconst_0        
	//   22   34:invokestatic    #94  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 4, packageName, false);
	//   23   37:aload_1         
	//   24   38:iconst_4        
	//   25   39:aload_0         
	//   26   40:getfield        #61  <Field String packageName>
	//   27   43:iconst_0        
	//   28   44:invokestatic    #98  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeStringList(parcel, 5, zzcdj, false);
	//   29   47:aload_1         
	//   30   48:iconst_5        
	//   31   49:aload_0         
	//   32   50:getfield        #65  <Field List zzcdj>
	//   33   53:iconst_0        
	//   34   54:invokestatic    #102 <Method void SafeParcelWriter.writeStringList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 6, ((android.os.Parcelable) (zzccw)), i, false);
	//   35   57:aload_1         
	//   36   58:bipush          6
	//   37   60:aload_0         
	//   38   61:getfield        #67  <Field PackageInfo zzccw>
	//   39   64:iload_2         
	//   40   65:iconst_0        
	//   41   66:invokestatic    #94  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeString(parcel, 7, zzcds, false);
	//   42   69:aload_1         
	//   43   70:bipush          7
	//   44   72:aload_0         
	//   45   73:getfield        #69  <Field String zzcds>
	//   46   76:iconst_0        
	//   47   77:invokestatic    #98  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 8, zzcga);
	//   48   80:aload_1         
	//   49   81:bipush          8
	//   50   83:aload_0         
	//   51   84:getfield        #71  <Field boolean zzcga>
	//   52   87:invokestatic    #106 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeString(parcel, 9, zzcgb, false);
	//   53   90:aload_1         
	//   54   91:bipush          9
	//   55   93:aload_0         
	//   56   94:getfield        #73  <Field String zzcgb>
	//   57   97:iconst_0        
	//   58   98:invokestatic    #98  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   59  101:aload_1         
	//   60  102:iload_3         
	//   61  103:invokestatic    #109 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   62  106:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzaez();
	private final ApplicationInfo applicationInfo;
	private final String packageName;
	private final PackageInfo zzccw;
	private final List zzcdj;
	private final String zzcds;
	private final Bundle zzcfy;
	private final zzang zzcfz;
	private final boolean zzcga;
	private final String zzcgb;

	static 
	{
	//    0    0:new             #45  <Class zzaez>
	//    1    3:dup             
	//    2    4:invokespecial   #48  <Method void zzaez()>
	//    3    7:putstatic       #50  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
