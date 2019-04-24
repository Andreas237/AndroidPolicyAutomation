// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.common.data:
//			DataHolder

public class DataHolderCreator
	implements android.os.Parcelable.Creator
{

	public DataHolderCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public DataHolder createFromParcel(Parcel parcel)
	{
		int k = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          4
		int j = 0;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		int i = j;
	//    5    8:iload_3         
	//    6    9:istore_2        
		String as[] = null;
	//    7   10:aconst_null     
	//    8   11:astore          9
		Object aobj[] = ((Object []) (as));
	//    9   13:aload           9
	//   10   15:astore          7
		Object obj = ((Object) (aobj));
	//   11   17:aload           7
	//   12   19:astore          8
		do
			if(parcel.dataPosition() < k)
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  15   25:iload           4
	//*  16   27:icmpge          152
			{
				int l = SafeParcelReader.readHeader(parcel);
	//   17   30:aload_1         
	//   18   31:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   19   34:istore          5
				int i1 = SafeParcelReader.getFieldId(l);
	//   20   36:iload           5
	//   21   38:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
	//   22   41:istore          6
				if(i1 != 1000)
	//*  23   43:iload           6
	//*  24   45:sipush          1000
	//*  25   48:icmpeq          142
					switch(i1)
	//*  26   51:iload           6
					{
	//*  27   53:tableswitch     1 4: default 84
	//	               1 131
	//	               2 114
	//	               3 104
	//	               4 93
					default:
						SafeParcelReader.skipUnknownField(parcel, l);
	//   28   84:aload_1         
	//   29   85:iload           5
	//   30   87:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
						break;

	//*  31   90:goto            21
					case 4: // '\004'
						obj = ((Object) (SafeParcelReader.createBundle(parcel, l)));
	//   32   93:aload_1         
	//   33   94:iload           5
	//   34   96:invokestatic    #44  <Method android.os.Bundle SafeParcelReader.createBundle(Parcel, int)>
	//   35   99:astore          8
						break;

	//*  36  101:goto            21
					case 3: // '\003'
						i = SafeParcelReader.readInt(parcel, l);
	//   37  104:aload_1         
	//   38  105:iload           5
	//   39  107:invokestatic    #48  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   40  110:istore_2        
						break;

	//*  41  111:goto            21
					case 2: // '\002'
						aobj = ((Object []) ((CursorWindow[])SafeParcelReader.createTypedArray(parcel, l, CursorWindow.CREATOR)));
	//   42  114:aload_1         
	//   43  115:iload           5
	//   44  117:getstatic       #54  <Field android.os.Parcelable$Creator CursorWindow.CREATOR>
	//   45  120:invokestatic    #58  <Method Object[] SafeParcelReader.createTypedArray(Parcel, int, android.os.Parcelable$Creator)>
	//   46  123:checkcast       #60  <Class CursorWindow[]>
	//   47  126:astore          7
						break;

	//*  48  128:goto            21
					case 1: // '\001'
						as = SafeParcelReader.createStringArray(parcel, l);
	//   49  131:aload_1         
	//   50  132:iload           5
	//   51  134:invokestatic    #64  <Method String[] SafeParcelReader.createStringArray(Parcel, int)>
	//   52  137:astore          9
						break;
					}
				else
	//*  53  139:goto            21
					j = SafeParcelReader.readInt(parcel, l);
	//   54  142:aload_1         
	//   55  143:iload           5
	//   56  145:invokestatic    #48  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   57  148:istore_3        
			} else
	//*  58  149:goto            21
			{
				SafeParcelReader.ensureAtEnd(parcel, k);
	//   59  152:aload_1         
	//   60  153:iload           4
	//   61  155:invokestatic    #67  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				parcel = ((Parcel) (new DataHolder(j, as, ((CursorWindow []) (aobj)), i, ((android.os.Bundle) (obj)))));
	//   62  158:new             #69  <Class DataHolder>
	//   63  161:dup             
	//   64  162:iload_3         
	//   65  163:aload           9
	//   66  165:aload           7
	//   67  167:iload_2         
	//   68  168:aload           8
	//   69  170:invokespecial   #72  <Method void DataHolder(int, String[], CursorWindow[], int, android.os.Bundle)>
	//   70  173:astore_1        
				((DataHolder) (parcel)).validateContents();
	//   71  174:aload_1         
	//   72  175:invokevirtual   #75  <Method void DataHolder.validateContents()>
				return ((DataHolder) (parcel));
	//   73  178:aload_1         
	//   74  179:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #78  <Method DataHolder createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public DataHolder[] newArray(int i)
	{
		return new DataHolder[i];
	//    0    0:iload_1         
	//    1    1:anewarray       DataHolder[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #83  <Method DataHolder[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
