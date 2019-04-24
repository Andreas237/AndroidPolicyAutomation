// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.internal;

import android.os.Parcel;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.internal:
//			ConnectionInfo

public class ConnectionInfoCreator
	implements android.os.Parcelable.Creator
{

	public ConnectionInfoCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ConnectionInfo createFromParcel(Parcel parcel)
	{
		int i = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_2        
		android.os.Bundle bundle = null;
	//    3    5:aconst_null     
	//    4    6:astore          5
		Feature afeature[] = null;
	//    5    8:aconst_null     
	//    6    9:astore          4
		do
			if(parcel.dataPosition() < i)
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*   9   15:iload_2         
	//*  10   16:icmpge          86
			{
				int j = SafeParcelReader.readHeader(parcel);
	//   11   19:aload_1         
	//   12   20:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   13   23:istore_3        
				switch(SafeParcelReader.getFieldId(j))
	//*  14   24:iload_3         
	//*  15   25:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  16   28:tableswitch     1 2: default 52
	//	               1 76
	//	               2 60
				default:
					SafeParcelReader.skipUnknownField(parcel, j);
	//   17   52:aload_1         
	//   18   53:iload_3         
	//   19   54:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  20   57:goto            11
				case 2: // '\002'
					afeature = (Feature[])SafeParcelReader.createTypedArray(parcel, j, Feature.CREATOR);
	//   21   60:aload_1         
	//   22   61:iload_3         
	//   23   62:getstatic       #46  <Field android.os.Parcelable$Creator Feature.CREATOR>
	//   24   65:invokestatic    #50  <Method Object[] SafeParcelReader.createTypedArray(Parcel, int, android.os.Parcelable$Creator)>
	//   25   68:checkcast       #52  <Class Feature[]>
	//   26   71:astore          4
					break;

	//*  27   73:goto            11
				case 1: // '\001'
					bundle = SafeParcelReader.createBundle(parcel, j);
	//   28   76:aload_1         
	//   29   77:iload_3         
	//   30   78:invokestatic    #56  <Method android.os.Bundle SafeParcelReader.createBundle(Parcel, int)>
	//   31   81:astore          5
					break;
				}
			} else
	//*  32   83:goto            11
			{
				SafeParcelReader.ensureAtEnd(parcel, i);
	//   33   86:aload_1         
	//   34   87:iload_2         
	//   35   88:invokestatic    #59  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new ConnectionInfo(bundle, afeature);
	//   36   91:new             #61  <Class ConnectionInfo>
	//   37   94:dup             
	//   38   95:aload           5
	//   39   97:aload           4
	//   40   99:invokespecial   #64  <Method void ConnectionInfo(android.os.Bundle, Feature[])>
	//   41  102:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #67  <Method ConnectionInfo createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ConnectionInfo[] newArray(int i)
	{
		return new ConnectionInfo[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ConnectionInfo[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #72  <Method ConnectionInfo[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
