// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common:
//			GoogleCertificatesQuery

public class GoogleCertificatesQueryCreator
	implements android.os.Parcelable.Creator
{

	public GoogleCertificatesQueryCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public GoogleCertificatesQuery createFromParcel(Parcel parcel)
	{
		int i = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_2        
		String s = null;
	//    3    5:aconst_null     
	//    4    6:astore          6
		boolean flag = false;
	//    5    8:iconst_0        
	//    6    9:istore          4
		android.os.IBinder ibinder = null;
	//    7   11:aconst_null     
	//    8   12:astore          5
		do
			if(parcel.dataPosition() < i)
	//*   9   14:aload_1         
	//*  10   15:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  11   18:iload_2         
	//*  12   19:icmpge          94
			{
				int j = SafeParcelReader.readHeader(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   15   26:istore_3        
				switch(SafeParcelReader.getFieldId(j))
	//*  16   27:iload_3         
	//*  17   28:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  18   31:tableswitch     1 3: default 56
	//	               1 84
	//	               2 74
	//	               3 64
				default:
					SafeParcelReader.skipUnknownField(parcel, j);
	//   19   56:aload_1         
	//   20   57:iload_3         
	//   21   58:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   61:goto            14
				case 3: // '\003'
					flag = SafeParcelReader.readBoolean(parcel, j);
	//   23   64:aload_1         
	//   24   65:iload_3         
	//   25   66:invokestatic    #44  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   26   69:istore          4
					break;

	//*  27   71:goto            14
				case 2: // '\002'
					ibinder = SafeParcelReader.readIBinder(parcel, j);
	//   28   74:aload_1         
	//   29   75:iload_3         
	//   30   76:invokestatic    #48  <Method android.os.IBinder SafeParcelReader.readIBinder(Parcel, int)>
	//   31   79:astore          5
					break;

	//*  32   81:goto            14
				case 1: // '\001'
					s = SafeParcelReader.createString(parcel, j);
	//   33   84:aload_1         
	//   34   85:iload_3         
	//   35   86:invokestatic    #52  <Method String SafeParcelReader.createString(Parcel, int)>
	//   36   89:astore          6
					break;
				}
			} else
	//*  37   91:goto            14
			{
				SafeParcelReader.ensureAtEnd(parcel, i);
	//   38   94:aload_1         
	//   39   95:iload_2         
	//   40   96:invokestatic    #55  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new GoogleCertificatesQuery(s, ibinder, flag);
	//   41   99:new             #57  <Class GoogleCertificatesQuery>
	//   42  102:dup             
	//   43  103:aload           6
	//   44  105:aload           5
	//   45  107:iload           4
	//   46  109:invokespecial   #60  <Method void GoogleCertificatesQuery(String, android.os.IBinder, boolean)>
	//   47  112:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #63  <Method GoogleCertificatesQuery createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public GoogleCertificatesQuery[] newArray(int i)
	{
		return new GoogleCertificatesQuery[i];
	//    0    0:iload_1         
	//    1    1:anewarray       GoogleCertificatesQuery[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #68  <Method GoogleCertificatesQuery[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
