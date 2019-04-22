// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FieldMappingDictionary, SafeParcelResponse

public class SafeParcelResponseCreator
	implements android.os.Parcelable.Creator
{

	public SafeParcelResponseCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public SafeParcelResponse createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		Parcel parcel1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		FieldMappingDictionary fieldmappingdictionary = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          107
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   13   21:aload_1         
	//   14   22:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   15   25:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  16   27:iload           4
	//*  17   29:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  18   32:tableswitch     1 3: default 60
	//	               1 97
	//	               2 86
	//	               3 69
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   19   60:aload_1         
	//   20   61:iload           4
	//   21   63:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 3: // '\003'
					fieldmappingdictionary = (FieldMappingDictionary)SafeParcelReader.createParcelable(parcel, k, FieldMappingDictionary.CREATOR);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:getstatic       #46  <Field android.os.Parcelable$Creator FieldMappingDictionary.CREATOR>
	//   26   75:invokestatic    #50  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   27   78:checkcast       #42  <Class FieldMappingDictionary>
	//   28   81:astore          5
					break;

	//*  29   83:goto            13
				case 2: // '\002'
					parcel1 = SafeParcelReader.createParcel(parcel, k);
	//   30   86:aload_1         
	//   31   87:iload           4
	//   32   89:invokestatic    #54  <Method Parcel SafeParcelReader.createParcel(Parcel, int)>
	//   33   92:astore          6
					break;

	//*  34   94:goto            13
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   35   97:aload_1         
	//   36   98:iload           4
	//   37  100:invokestatic    #58  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   38  103:istore_2        
					break;
				}
			} else
	//*  39  104:goto            13
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   40  107:aload_1         
	//   41  108:iload_3         
	//   42  109:invokestatic    #61  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new SafeParcelResponse(i, parcel1, fieldmappingdictionary);
	//   43  112:new             #63  <Class SafeParcelResponse>
	//   44  115:dup             
	//   45  116:iload_2         
	//   46  117:aload           6
	//   47  119:aload           5
	//   48  121:invokespecial   #66  <Method void SafeParcelResponse(int, Parcel, FieldMappingDictionary)>
	//   49  124:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #69  <Method SafeParcelResponse createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public SafeParcelResponse[] newArray(int i)
	{
		return new SafeParcelResponse[i];
	//    0    0:iload_1         
	//    1    1:anewarray       SafeParcelResponse[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #74  <Method SafeParcelResponse[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
