// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzael

public final class zzaem
	implements android.os.Parcelable.Creator
{

	public zzaem()
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
		boolean flag = false;
	//    3    5:iconst_0        
	//    4    6:istore          4
		java.util.ArrayList arraylist = null;
	//    5    8:aconst_null     
	//    6    9:astore          5
		do
			if(parcel.dataPosition() < i)
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*   9   15:iload_2         
	//*  10   16:icmpge          80
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
					arraylist = SafeParcelReader.createStringList(parcel, j);
	//   21   60:aload_1         
	//   22   61:iload_3         
	//   23   62:invokestatic    #41  <Method java.util.ArrayList SafeParcelReader.createStringList(Parcel, int)>
	//   24   65:astore          5
					break;

	//*  25   67:goto            11
				case 2: // '\002'
					flag = SafeParcelReader.readBoolean(parcel, j);
	//   26   70:aload_1         
	//   27   71:iload_3         
	//   28   72:invokestatic    #45  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   29   75:istore          4
					break;
				}
			} else
	//*  30   77:goto            11
			{
				SafeParcelReader.ensureAtEnd(parcel, i);
	//   31   80:aload_1         
	//   32   81:iload_2         
	//   33   82:invokestatic    #48  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return ((Object) (new zzael(flag, ((java.util.List) (arraylist)))));
	//   34   85:new             #50  <Class zzael>
	//   35   88:dup             
	//   36   89:iload           4
	//   37   91:aload           5
	//   38   93:invokespecial   #53  <Method void zzael(boolean, java.util.List)>
	//   39   96:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzael[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzael[]
	//    2    4:areturn         
	}
}
