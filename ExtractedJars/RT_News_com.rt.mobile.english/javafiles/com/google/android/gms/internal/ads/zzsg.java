// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzsh, zza, zzr

public final class zzsg extends AbstractSafeParcelable
{

	zzsg(String s, String as[], String as1[])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #37  <Field String url>
		zzbnh = as;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field String[] zzbnh>
		zzbni = as1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #41  <Field String[] zzbni>
	//   11   19:return          
	}

	public static zzsg zzh(zzr zzr1)
		throws zza
	{
		Object obj = ((Object) (zzr1.getHeaders()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method Map zzr.getHeaders()>
	//    2    4:astore          4
		int i = ((Map) (obj)).size();
	//    3    6:aload           4
	//    4    8:invokeinterface #59  <Method int Map.size()>
	//    5   13:istore_1        
		String as[] = new String[i];
	//    6   14:iload_1         
	//    7   15:anewarray       String[]
	//    8   18:astore_2        
		String as1[] = new String[i];
	//    9   19:iload_1         
	//   10   20:anewarray       String[]
	//   11   23:astore_3        
		obj = ((Object) (((Map) (obj)).entrySet().iterator()));
	//   12   24:aload           4
	//   13   26:invokeinterface #65  <Method Set Map.entrySet()>
	//   14   31:invokeinterface #71  <Method Iterator Set.iterator()>
	//   15   36:astore          4
		for(int j = 0; ((Iterator) (obj)).hasNext(); j++)
	//*  16   38:iconst_0        
	//*  17   39:istore_1        
	//*  18   40:aload           4
	//*  19   42:invokeinterface #77  <Method boolean Iterator.hasNext()>
	//*  20   47:ifeq            95
		{
			java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
	//   21   50:aload           4
	//   22   52:invokeinterface #81  <Method Object Iterator.next()>
	//   23   57:checkcast       #83  <Class java.util.Map$Entry>
	//   24   60:astore          5
			as[j] = (String)entry.getKey();
	//   25   62:aload_2         
	//   26   63:iload_1         
	//   27   64:aload           5
	//   28   66:invokeinterface #86  <Method Object java.util.Map$Entry.getKey()>
	//   29   71:checkcast       #61  <Class String>
	//   30   74:aastore         
			as1[j] = (String)entry.getValue();
	//   31   75:aload_3         
	//   32   76:iload_1         
	//   33   77:aload           5
	//   34   79:invokeinterface #89  <Method Object java.util.Map$Entry.getValue()>
	//   35   84:checkcast       #61  <Class String>
	//   36   87:aastore         
		}

	//   37   88:iload_1         
	//   38   89:iconst_1        
	//   39   90:iadd            
	//   40   91:istore_1        
	//*  41   92:goto            40
		return new zzsg(zzr1.getUrl(), as, as1);
	//   42   95:new             #2   <Class zzsg>
	//   43   98:dup             
	//   44   99:aload_0         
	//   45  100:invokevirtual   #93  <Method String zzr.getUrl()>
	//   46  103:aload_2         
	//   47  104:aload_3         
	//   48  105:invokespecial   #95  <Method void zzsg(String, String[], String[])>
	//   49  108:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #104 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 1, url, false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field String url>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #108 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeStringArray(parcel, 2, zzbnh, false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:getfield        #39  <Field String[] zzbnh>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #112 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.writeStringArray(parcel, 3, zzbni, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:getfield        #41  <Field String[] zzbni>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #112 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   21   35:aload_1         
	//   22   36:iload_2         
	//   23   37:invokestatic    #115 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   24   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzsh();
	private final String url;
	private final String zzbnh[];
	private final String zzbni[];

	static 
	{
	//    0    0:new             #25  <Class zzsh>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zzsh()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
