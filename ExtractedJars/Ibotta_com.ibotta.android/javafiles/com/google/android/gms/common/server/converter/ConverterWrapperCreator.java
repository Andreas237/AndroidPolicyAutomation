// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.server.converter:
//			StringToIntConverter, ConverterWrapper

public class ConverterWrapperCreator
	implements android.os.Parcelable.Creator
{

	public ConverterWrapperCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ConverterWrapper createFromParcel(Parcel parcel)
	{
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_3        
		int i = 0;
	//    3    5:iconst_0        
	//    4    6:istore_2        
		StringToIntConverter stringtointconverter = null;
	//    5    7:aconst_null     
	//    6    8:astore          5
		do
			if(parcel.dataPosition() < j)
	//*   7   10:aload_1         
	//*   8   11:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*   9   14:iload_3         
	//*  10   15:icmpge          88
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
	//	               1 78
	//	               2 61
				default:
					SafeParcelReader.skipUnknownField(parcel, k);
	//   17   52:aload_1         
	//   18   53:iload           4
	//   19   55:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  20   58:goto            10
				case 2: // '\002'
					stringtointconverter = (StringToIntConverter)SafeParcelReader.createParcelable(parcel, k, StringToIntConverter.CREATOR);
	//   21   61:aload_1         
	//   22   62:iload           4
	//   23   64:getstatic       #46  <Field android.os.Parcelable$Creator StringToIntConverter.CREATOR>
	//   24   67:invokestatic    #50  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   25   70:checkcast       #42  <Class StringToIntConverter>
	//   26   73:astore          5
					break;

	//*  27   75:goto            10
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, k);
	//   28   78:aload_1         
	//   29   79:iload           4
	//   30   81:invokestatic    #54  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   31   84:istore_2        
					break;
				}
			} else
	//*  32   85:goto            10
			{
				SafeParcelReader.ensureAtEnd(parcel, j);
	//   33   88:aload_1         
	//   34   89:iload_3         
	//   35   90:invokestatic    #57  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new ConverterWrapper(i, stringtointconverter);
	//   36   93:new             #59  <Class ConverterWrapper>
	//   37   96:dup             
	//   38   97:iload_2         
	//   39   98:aload           5
	//   40  100:invokespecial   #62  <Method void ConverterWrapper(int, StringToIntConverter)>
	//   41  103:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method ConverterWrapper createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ConverterWrapper[] newArray(int i)
	{
		return new ConverterWrapper[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ConverterWrapper[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method ConverterWrapper[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
