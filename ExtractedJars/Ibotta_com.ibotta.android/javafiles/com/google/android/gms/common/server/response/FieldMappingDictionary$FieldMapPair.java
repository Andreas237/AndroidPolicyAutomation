// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FieldMappingDictionary, FieldMapPairCreator

public static class FieldMappingDictionary$FieldMapPair extends AbstractSafeParcelable
{

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #60  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, versionCode);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #42  <Field int versionCode>
	//    7   11:invokestatic    #64  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeString(parcel, 2, zzxo, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #44  <Field String zzxo>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #68  <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zzxp)), i, false);
	//   14   24:aload_1         
	//   15   25:iconst_3        
	//   16   26:aload_0         
	//   17   27:getfield        #46  <Field FastJsonResponse$Field zzxp>
	//   18   30:iload_2         
	//   19   31:iconst_0        
	//   20   32:invokestatic    #72  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   21   35:aload_1         
	//   22   36:iload_3         
	//   23   37:invokestatic    #75  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   24   40:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new FieldMapPairCreator();
	private final int versionCode;
	final String zzxo;
	final FastJsonResponse.Field zzxp;

	static 
	{
	//    0    0:new             #30  <Class FieldMapPairCreator>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void FieldMapPairCreator()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	FieldMappingDictionary$FieldMapPair(int i, String s, FastJsonResponse.Field field)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		versionCode = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #42  <Field int versionCode>
		zzxo = s;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #44  <Field String zzxo>
		zzxp = field;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #46  <Field FastJsonResponse$Field zzxp>
	//   11   19:return          
	}

	FieldMappingDictionary$FieldMapPair(String s, FastJsonResponse.Field field)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #40  <Method void AbstractSafeParcelable()>
		versionCode = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #42  <Field int versionCode>
		zzxo = s;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #44  <Field String zzxo>
		zzxp = field;
	//    8   14:aload_0         
	//    9   15:aload_2         
	//   10   16:putfield        #46  <Field FastJsonResponse$Field zzxp>
	//   11   19:return          
	}
}
