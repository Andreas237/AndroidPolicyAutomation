// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common:
//			ConnectionResult

public class ConnectionResultCreator
	implements android.os.Parcelable.Creator
{

	public ConnectionResultCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public ConnectionResult createFromParcel(Parcel parcel)
	{
		int k = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          4
		int i = 0;
	//    3    6:iconst_0        
	//    4    7:istore_2        
		PendingIntent pendingintent = null;
	//    5    8:aconst_null     
	//    6    9:astore          7
		Object obj = ((Object) (pendingintent));
	//    7   11:aload           7
	//    8   13:astore          6
		int j = 0;
	//    9   15:iconst_0        
	//   10   16:istore_3        
		do
			if(parcel.dataPosition() < k)
	//*  11   17:aload_1         
	//*  12   18:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  13   21:iload           4
	//*  14   23:icmpge          125
			{
				int l = SafeParcelReader.readHeader(parcel);
	//   15   26:aload_1         
	//   16   27:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   17   30:istore          5
				switch(SafeParcelReader.getFieldId(l))
	//*  18   32:iload           5
	//*  19   34:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  20   37:tableswitch     1 4: default 68
	//	               1 115
	//	               2 105
	//	               3 88
	//	               4 77
				default:
					SafeParcelReader.skipUnknownField(parcel, l);
	//   21   68:aload_1         
	//   22   69:iload           5
	//   23   71:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  24   74:goto            17
				case 4: // '\004'
					obj = ((Object) (SafeParcelReader.createString(parcel, l)));
	//   25   77:aload_1         
	//   26   78:iload           5
	//   27   80:invokestatic    #44  <Method String SafeParcelReader.createString(Parcel, int)>
	//   28   83:astore          6
					break;

	//*  29   85:goto            17
				case 3: // '\003'
					pendingintent = (PendingIntent)SafeParcelReader.createParcelable(parcel, l, PendingIntent.CREATOR);
	//   30   88:aload_1         
	//   31   89:iload           5
	//   32   91:getstatic       #50  <Field android.os.Parcelable$Creator PendingIntent.CREATOR>
	//   33   94:invokestatic    #54  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   34   97:checkcast       #46  <Class PendingIntent>
	//   35  100:astore          7
					break;

	//*  36  102:goto            17
				case 2: // '\002'
					j = SafeParcelReader.readInt(parcel, l);
	//   37  105:aload_1         
	//   38  106:iload           5
	//   39  108:invokestatic    #58  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   40  111:istore_3        
					break;

	//*  41  112:goto            17
				case 1: // '\001'
					i = SafeParcelReader.readInt(parcel, l);
	//   42  115:aload_1         
	//   43  116:iload           5
	//   44  118:invokestatic    #58  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   45  121:istore_2        
					break;
				}
			} else
	//*  46  122:goto            17
			{
				SafeParcelReader.ensureAtEnd(parcel, k);
	//   47  125:aload_1         
	//   48  126:iload           4
	//   49  128:invokestatic    #61  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new ConnectionResult(i, j, pendingintent, ((String) (obj)));
	//   50  131:new             #63  <Class ConnectionResult>
	//   51  134:dup             
	//   52  135:iload_2         
	//   53  136:iload_3         
	//   54  137:aload           7
	//   55  139:aload           6
	//   56  141:invokespecial   #66  <Method void ConnectionResult(int, int, PendingIntent, String)>
	//   57  144:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #69  <Method ConnectionResult createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public ConnectionResult[] newArray(int i)
	{
		return new ConnectionResult[i];
	//    0    0:iload_1         
	//    1    1:anewarray       ConnectionResult[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #74  <Method ConnectionResult[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
