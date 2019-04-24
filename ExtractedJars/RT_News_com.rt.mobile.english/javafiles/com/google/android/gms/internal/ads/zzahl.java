// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzjj, zzahk

public final class zzahl
	implements android.os.Parcelable.Creator
{

	public zzahl()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #11  <Method void Object()>
	//    2    4:return          
	}

	public final Object createFromParcel(Parcel parcel)
	{
		int i = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #20  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore_2        
		zzjj zzjj1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          5
		String s = null;
	//    5    8:aconst_null     
	//    6    9:astore          4
		do
			if(parcel.dataPosition() < i)
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*   9   15:iload_2         
	//*  10   16:icmpge          86
			{
				int j = SafeParcelReader.readHeader(parcel);
	//   11   19:aload_1         
	//   12   20:invokestatic    #29  <Method int SafeParcelReader.readHeader(Parcel)>
	//   13   23:istore_3        
				switch(SafeParcelReader.getFieldId(j))
	//*  14   24:iload_3         
	//*  15   25:invokestatic    #33  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  16   28:tableswitch     2 3: default 52
	//	               2 70
	//	               3 60
				default:
					SafeParcelReader.skipUnknownField(parcel, j);
	//   17   52:aload_1         
	//   18   53:iload_3         
	//   19   54:invokestatic    #37  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  20   57:goto            11
				case 3: // '\003'
					s = SafeParcelReader.createString(parcel, j);
	//   21   60:aload_1         
	//   22   61:iload_3         
	//   23   62:invokestatic    #41  <Method String SafeParcelReader.createString(Parcel, int)>
	//   24   65:astore          4
					break;

	//*  25   67:goto            11
				case 2: // '\002'
					zzjj1 = (zzjj)SafeParcelReader.createParcelable(parcel, j, zzjj.CREATOR);
	//   26   70:aload_1         
	//   27   71:iload_3         
	//   28   72:getstatic       #47  <Field android.os.Parcelable$Creator zzjj.CREATOR>
	//   29   75:invokestatic    #51  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   30   78:checkcast       #43  <Class zzjj>
	//   31   81:astore          5
					break;
				}
			} else
	//*  32   83:goto            11
			{
				SafeParcelReader.ensureAtEnd(parcel, i);
	//   33   86:aload_1         
	//   34   87:iload_2         
	//   35   88:invokestatic    #54  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return ((Object) (new zzahk(zzjj1, s)));
	//   36   91:new             #56  <Class zzahk>
	//   37   94:dup             
	//   38   95:aload           5
	//   39   97:aload           4
	//   40   99:invokespecial   #59  <Method void zzahk(zzjj, String)>
	//   41  102:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzahk[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzahk[]
	//    2    4:areturn         
	}
}
