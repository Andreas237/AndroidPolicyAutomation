// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.zza;
import com.google.android.gms.common.internal.zzac;
import com.google.android.gms.wearable.DataItemAsset;

// Referenced classes of package com.google.android.gms.wearable.internal:
//			zzal

public class DataItemAssetParcelable extends zza
	implements ReflectedParcelable, DataItemAsset
{

	public DataItemAssetParcelable(DataItemAsset dataitemasset)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		zzGV = (String)zzac.zzw(((Object) (dataitemasset.getId())));
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokeinterface #31  <Method String DataItemAsset.getId()>
	//    5   11:invokestatic    #37  <Method Object zzac.zzw(Object)>
	//    6   14:checkcast       #39  <Class String>
	//    7   17:putfield        #41  <Field String zzGV>
		zzAX = (String)zzac.zzw(((Object) (dataitemasset.getDataItemKey())));
	//    8   20:aload_0         
	//    9   21:aload_1         
	//   10   22:invokeinterface #44  <Method String DataItemAsset.getDataItemKey()>
	//   11   27:invokestatic    #37  <Method Object zzac.zzw(Object)>
	//   12   30:checkcast       #39  <Class String>
	//   13   33:putfield        #46  <Field String zzAX>
	//   14   36:return          
	}

	DataItemAssetParcelable(String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void zza()>
		zzGV = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #41  <Field String zzGV>
		zzAX = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #46  <Field String zzAX>
	//    8   14:return          
	}

	public Object freeze()
	{
		return ((Object) (zzUw()));
	//    0    0:aload_0         
	//    1    1:invokevirtual   #53  <Method DataItemAsset zzUw()>
	//    2    4:areturn         
	}

	public String getDataItemKey()
	{
		return zzAX;
	//    0    0:aload_0         
	//    1    1:getfield        #46  <Field String zzAX>
	//    2    4:areturn         
	}

	public String getId()
	{
		return zzGV;
	//    0    0:aload_0         
	//    1    1:getfield        #41  <Field String zzGV>
	//    2    4:areturn         
	}

	public boolean isDataValid()
	{
		return true;
	//    0    0:iconst_1        
	//    1    1:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #58  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #59  <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("DataItemAssetParcelable[");
	//    4    8:aload_1         
	//    5    9:ldc1            #61  <String "DataItemAssetParcelable[">
	//    6   11:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append("@");
	//    8   15:aload_1         
	//    9   16:ldc1            #67  <String "@">
	//   10   18:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		stringbuilder.append(Integer.toHexString(((Object)this).hashCode()));
	//   12   22:aload_1         
	//   13   23:aload_0         
	//   14   24:invokevirtual   #73  <Method int Object.hashCode()>
	//   15   27:invokestatic    #79  <Method String Integer.toHexString(int)>
	//   16   30:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   17   33:pop             
		if(zzGV == null)
	//*  18   34:aload_0         
	//*  19   35:getfield        #41  <Field String zzGV>
	//*  20   38:ifnonnull       51
		{
			stringbuilder.append(",noid");
	//   21   41:aload_1         
	//   22   42:ldc1            #81  <String ",noid">
	//   23   44:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   24   47:pop             
		} else
	//*  25   48:goto            67
		{
			stringbuilder.append(",");
	//   26   51:aload_1         
	//   27   52:ldc1            #83  <String ",">
	//   28   54:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
			stringbuilder.append(zzGV);
	//   30   58:aload_1         
	//   31   59:aload_0         
	//   32   60:getfield        #41  <Field String zzGV>
	//   33   63:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   34   66:pop             
		}
		stringbuilder.append(", key=");
	//   35   67:aload_1         
	//   36   68:ldc1            #85  <String ", key=">
	//   37   70:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   38   73:pop             
		stringbuilder.append(zzAX);
	//   39   74:aload_1         
	//   40   75:aload_0         
	//   41   76:getfield        #46  <Field String zzAX>
	//   42   79:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   43   82:pop             
		stringbuilder.append("]");
	//   44   83:aload_1         
	//   45   84:ldc1            #87  <String "]">
	//   46   86:invokevirtual   #65  <Method StringBuilder StringBuilder.append(String)>
	//   47   89:pop             
		return stringbuilder.toString();
	//   48   90:aload_1         
	//   49   91:invokevirtual   #89  <Method String StringBuilder.toString()>
	//   50   94:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		com.google.android.gms.wearable.internal.zzal.zza(this, parcel, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iload_2         
	//    3    3:invokestatic    #95  <Method void com.google.android.gms.wearable.internal.zzal.zza(DataItemAssetParcelable, Parcel, int)>
	//    4    6:return          
	}

	public DataItemAsset zzUw()
	{
		return ((DataItemAsset) (this));
	//    0    0:aload_0         
	//    1    1:areturn         
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzal();
	private final String zzAX;
	private final String zzGV;

	static 
	{
	//    0    0:new             #19  <Class zzal>
	//    1    3:dup             
	//    2    4:invokespecial   #22  <Method void zzal()>
	//    3    7:putstatic       #24  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
