// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;

// Referenced classes of package com.google.android.gms.common.server.converter:
//			zab, StringToIntConverter

public final class zaa extends AbstractSafeParcelable
{

	zaa(int i, StringToIntConverter stringtointconverter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #37  <Field int zale>
		zapk = stringtointconverter;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #39  <Field StringToIntConverter zapk>
	//    8   14:return          
	}

	private zaa(StringToIntConverter stringtointconverter)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #35  <Method void AbstractSafeParcelable()>
		zale = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #37  <Field int zale>
		zapk = stringtointconverter;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #39  <Field StringToIntConverter zapk>
	//    8   14:return          
	}

	public static zaa zaa(com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter fieldconverter)
	{
		if(fieldconverter instanceof StringToIntConverter)
	//*   0    0:aload_0         
	//*   1    1:instanceof      #46  <Class StringToIntConverter>
	//*   2    4:ifeq            19
			return new zaa((StringToIntConverter)fieldconverter);
	//    3    7:new             #2   <Class zaa>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:checkcast       #46  <Class StringToIntConverter>
	//    7   15:invokespecial   #48  <Method void zaa(StringToIntConverter)>
	//    8   18:areturn         
		else
			throw new IllegalArgumentException("Unsupported safe parcelable field converter class.");
	//    9   19:new             #50  <Class IllegalArgumentException>
	//   10   22:dup             
	//   11   23:ldc1            #52  <String "Unsupported safe parcelable field converter class.">
	//   12   25:invokespecial   #55  <Method void IllegalArgumentException(String)>
	//   13   28:athrow          
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #65  <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #37  <Field int zale>
	//    7   11:invokestatic    #69  <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcelable(parcel, 2, ((android.os.Parcelable) (zapk)), i, false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:getfield        #39  <Field StringToIntConverter zapk>
	//   12   20:iload_2         
	//   13   21:iconst_0        
	//   14   22:invokestatic    #73  <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   15   25:aload_1         
	//   16   26:iload_3         
	//   17   27:invokestatic    #76  <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   18   30:return          
	}

	public final com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter zaci()
	{
		StringToIntConverter stringtointconverter = zapk;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field StringToIntConverter zapk>
	//    2    4:astore_1        
		if(stringtointconverter != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          11
			return ((com.google.android.gms.common.server.response.FastJsonResponse.FieldConverter) (stringtointconverter));
	//    5    9:aload_1         
	//    6   10:areturn         
		else
			throw new IllegalStateException("There was no converter wrapped in this ConverterWrapper.");
	//    7   11:new             #80  <Class IllegalStateException>
	//    8   14:dup             
	//    9   15:ldc1            #82  <String "There was no converter wrapped in this ConverterWrapper.">
	//   10   17:invokespecial   #83  <Method void IllegalStateException(String)>
	//   11   20:athrow          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zab();
	private final int zale;
	private final StringToIntConverter zapk;

	static 
	{
	//    0    0:new             #25  <Class zab>
	//    1    3:dup             
	//    2    4:invokespecial   #28  <Method void zab()>
	//    3    7:putstatic       #30  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
