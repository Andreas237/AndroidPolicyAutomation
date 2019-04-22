// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.images:
//			WebImage

public class WebImageCreator
	implements android.os.Parcelable.Creator
{

	public WebImageCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public WebImage createFromParcel(Parcel parcel)
	{
		int l = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          5
		int k = 0;
	//    3    6:iconst_0        
	//    4    7:istore          4
		Uri uri = null;
	//    5    9:aconst_null     
	//    6   10:astore          7
		int j = 0;
	//    7   12:iconst_0        
	//    8   13:istore_3        
		int i = 0;
	//    9   14:iconst_0        
	//   10   15:istore_2        
		do
			if(parcel.dataPosition() < l)
	//*  11   16:aload_1         
	//*  12   17:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  13   20:iload           5
	//*  14   22:icmpge          125
			{
				int i1 = SafeParcelReader.readHeader(parcel);
	//   15   25:aload_1         
	//   16   26:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   17   29:istore          6
				switch(SafeParcelReader.getFieldId(i1))
	//*  18   31:iload           6
	//*  19   33:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  20   36:tableswitch     1 4: default 68
	//	               1 114
	//	               2 97
	//	               3 87
	//	               4 77
				default:
					SafeParcelReader.skipUnknownField(parcel, i1);
	//   21   68:aload_1         
	//   22   69:iload           6
	//   23   71:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  24   74:goto            16
				case 4: // '\004'
					i = SafeParcelReader.readInt(parcel, i1);
	//   25   77:aload_1         
	//   26   78:iload           6
	//   27   80:invokestatic    #44  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   28   83:istore_2        
					break;

	//*  29   84:goto            16
				case 3: // '\003'
					j = SafeParcelReader.readInt(parcel, i1);
	//   30   87:aload_1         
	//   31   88:iload           6
	//   32   90:invokestatic    #44  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   33   93:istore_3        
					break;

	//*  34   94:goto            16
				case 2: // '\002'
					uri = (Uri)SafeParcelReader.createParcelable(parcel, i1, Uri.CREATOR);
	//   35   97:aload_1         
	//   36   98:iload           6
	//   37  100:getstatic       #50  <Field android.os.Parcelable$Creator Uri.CREATOR>
	//   38  103:invokestatic    #54  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   39  106:checkcast       #46  <Class Uri>
	//   40  109:astore          7
					break;

	//*  41  111:goto            16
				case 1: // '\001'
					k = SafeParcelReader.readInt(parcel, i1);
	//   42  114:aload_1         
	//   43  115:iload           6
	//   44  117:invokestatic    #44  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   45  120:istore          4
					break;
				}
			} else
	//*  46  122:goto            16
			{
				SafeParcelReader.ensureAtEnd(parcel, l);
	//   47  125:aload_1         
	//   48  126:iload           5
	//   49  128:invokestatic    #57  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new WebImage(k, uri, j, i);
	//   50  131:new             #59  <Class WebImage>
	//   51  134:dup             
	//   52  135:iload           4
	//   53  137:aload           7
	//   54  139:iload_3         
	//   55  140:iload_2         
	//   56  141:invokespecial   #62  <Method void WebImage(int, Uri, int, int)>
	//   57  144:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #65  <Method WebImage createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public WebImage[] newArray(int i)
	{
		return new WebImage[i];
	//    0    0:iload_1         
	//    1    1:anewarray       WebImage[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #70  <Method WebImage[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
