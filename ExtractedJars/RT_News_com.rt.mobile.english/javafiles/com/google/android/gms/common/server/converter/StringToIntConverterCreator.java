// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.server.converter:
//			StringToIntConverter

public class StringToIntConverterCreator
	implements android.os.Parcelable.Creator
{

	public StringToIntConverterCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public StringToIntConverter createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		java.util.ArrayList arraylist = null;
	//    5    7:aconst_null     
	//    6    8:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          85
			{
				int k = SafeParcelReader.readHeader(parcel);
	//   11   18:aload_1         
	//   12   19:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   13   22:istore          4
				switch(SafeParcelReader.getFieldId(k))
	//*  14   24:iload           4
	//*  15   26:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  16   29:tableswitch     1 2: default 52
	//	               1 75
	//	               2 61
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   17   52:aload_1         
	//   18   53:iload           4
	//   19   55:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  20   58:goto            10
				case 2: // '\002'
					arraylist = SafeParcelReader.createTypedList(parcel, k, StringToIntConverter.Entry.CREATOR);
	//   21   61:aload_1         
	//   22   62:iload           4
	//   23   64:getstatic       #46  <Field android.os.Parcelable$Creator StringToIntConverter$Entry.CREATOR>
	//   24   67:invokestatic    #50  <Method java.util.ArrayList SafeParcelReader.createTypedList(Parcel, int, android.os.Parcelable$Creator)>
	//   25   70:astore          5
					break;

	//*  26   72:goto            10
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   27   75:aload_1         
	//   28   76:iload           4
	//   29   78:invokestatic    #54  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   30   81:istore_2        
					break;
				}
			} else
	//*  31   82:goto            10
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   32   85:aload_1         
	//   33   86:iload_3         
	//   34   87:invokestatic    #57  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new StringToIntConverter(i, arraylist);
	//   35   90:new             #59  <Class StringToIntConverter>
	//   36   93:dup             
	//   37   94:iload_2         
	//   38   95:aload           5
	//   39   97:invokespecial   #62  <Method void StringToIntConverter(int, java.util.ArrayList)>
	//   40  100:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method StringToIntConverter createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public StringToIntConverter[] newArray(int i)
	{
		return new StringToIntConverter[i];
	//    0    0:iload_1         
	//    1    1:anewarray       StringToIntConverter[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method StringToIntConverter[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
