// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FieldMappingDictionary

public class FieldMappingDictionaryCreator
	implements android.os.Parcelable.Creator
{

	public FieldMappingDictionaryCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public FieldMappingDictionary createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		java.util.ArrayList arraylist = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		int i = 0;
	//    5    8:iconst_0        
	//    6    9:istore_2        
		String s = null;
	//    7   10:aconst_null     
	//    8   11:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  11   17:iload_3         
	//*  12   18:icmpge          104
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
	//	               1 94
	//	               2 80
	//	               3 69
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   19   60:aload_1         
	//   20   61:iload           4
	//   21   63:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 3: // '\003'
					s = SafeParcelReader.createString(parcel, k);
	//   23   69:aload_1         
	//   24   70:iload           4
	//   25   72:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   26   75:astore          5
					break;

	//*  27   77:goto            13
				case 2: // '\002'
					arraylist = SafeParcelReader.createTypedList(parcel, k, FieldMappingDictionary.Entry.CREATOR);
	//   28   80:aload_1         
	//   29   81:iload           4
	//   30   83:getstatic       #50  <Field android.os.Parcelable$Creator FieldMappingDictionary$Entry.CREATOR>
	//   31   86:invokestatic    #54  <Method java.util.ArrayList SafeParcelReader.createTypedList(Parcel, int, android.os.Parcelable$Creator)>
	//   32   89:astore          6
					break;

	//*  33   91:goto            13
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   34   94:aload_1         
	//   35   95:iload           4
	//   36   97:invokestatic    #58  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   37  100:istore_2        
					break;
				}
			} else
	//*  38  101:goto            13
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   39  104:aload_1         
	//   40  105:iload_3         
	//   41  106:invokestatic    #61  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new FieldMappingDictionary(i, arraylist, s);
	//   42  109:new             #63  <Class FieldMappingDictionary>
	//   43  112:dup             
	//   44  113:iload_2         
	//   45  114:aload           6
	//   46  116:aload           5
	//   47  118:invokespecial   #66  <Method void FieldMappingDictionary(int, java.util.ArrayList, String)>
	//   48  121:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #69  <Method FieldMappingDictionary createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public FieldMappingDictionary[] newArray(int i)
	{
		return new FieldMappingDictionary[i];
	//    0    0:iload_1         
	//    1    1:anewarray       FieldMappingDictionary[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #74  <Method FieldMappingDictionary[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
