// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.data:
//			BitmapTeleporter

public class BitmapTeleporterCreator
	implements android.os.Parcelable.Creator
{

	public BitmapTeleporterCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public BitmapTeleporter createFromParcel(Parcel parcel)
	{
		int k = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		ParcelFileDescriptor parcelfiledescriptor = null;
	//    5    8:aconst_null     
	//    6    9:astore          6
		int i = 0;
	//    7   11:iconst_0        
	//    8   12:istore_2        
		do
			if(parcel.dataPosition() < k)
	//*   9   13:aload_1         
	//*  10   14:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  11   17:iload           4
	//*  12   19:icmpge          106
			{
				int l = SafeParcelReader.readHeader(parcel);
	//   13   22:aload_1         
	//   14   23:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   15   26:istore          5
				switch(SafeParcelReader.getFieldId(l))
	//*  16   28:iload           5
	//*  17   30:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  18   33:tableswitch     1 3: default 60
	//	               1 96
	//	               2 79
	//	               3 69
				default:
					SafeParcelReader.skipUnknownField(parcel, l);
	//   19   60:aload_1         
	//   20   61:iload           5
	//   21   63:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  22   66:goto            13
				case 3: // '\003'
					i = SafeParcelReader.readInt(parcel, l);
	//   23   69:aload_1         
	//   24   70:iload           5
	//   25   72:invokestatic    #44  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   26   75:istore_2        
					break;

	//*  27   76:goto            13
				case 2: // '\002'
					parcelfiledescriptor = (ParcelFileDescriptor)SafeParcelReader.createParcelable(parcel, l, ParcelFileDescriptor.CREATOR);
	//   28   79:aload_1         
	//   29   80:iload           5
	//   30   82:getstatic       #50  <Field android.os.Parcelable$Creator ParcelFileDescriptor.CREATOR>
	//   31   85:invokestatic    #54  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   32   88:checkcast       #46  <Class ParcelFileDescriptor>
	//   33   91:astore          6
					break;

	//*  34   93:goto            13
				case 1: // '\001'
					j = SafeParcelReader.readInt(parcel, l);
	//   35   96:aload_1         
	//   36   97:iload           5
	//   37   99:invokestatic    #44  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   38  102:istore_3        
					break;
				}
			} else
	//*  39  103:goto            13
			{
				SafeParcelReader.ensureAtEnd(parcel, k);
	//   40  106:aload_1         
	//   41  107:iload           4
	//   42  109:invokestatic    #57  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new BitmapTeleporter(j, parcelfiledescriptor, i);
	//   43  112:new             #59  <Class BitmapTeleporter>
	//   44  115:dup             
	//   45  116:iload_3         
	//   46  117:aload           6
	//   47  119:iload_2         
	//   48  120:invokespecial   #62  <Method void BitmapTeleporter(int, ParcelFileDescriptor, int)>
	//   49  123:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method BitmapTeleporter createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public BitmapTeleporter[] newArray(int i)
	{
		return new BitmapTeleporter[i];
	//    0    0:iload_1         
	//    1    1:anewarray       BitmapTeleporter[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method BitmapTeleporter[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
