// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzaiq

public final class zzair
	implements android.os.Parcelable.Creator
{

	public zzair()
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
		boolean flag3 = false;
	//    3    5:iconst_0        
	//    4    6:istore          7
		boolean flag = flag3;
	//    5    8:iload           7
	//    6   10:istore          4
		boolean flag1 = flag;
	//    7   12:iload           4
	//    8   14:istore          5
		boolean flag2 = flag1;
	//    9   16:iload           5
	//   10   18:istore          6
		String s1 = null;
	//   11   20:aconst_null     
	//   12   21:astore          11
		String s = s1;
	//   13   23:aload           11
	//   14   25:astore          8
		Object obj = ((Object) (s));
	//   15   27:aload           8
	//   16   29:astore          9
		Object obj1 = obj;
	//   17   31:aload           9
	//   18   33:astore          10
		do
			if(parcel.dataPosition() < i)
	//*  19   35:aload_1         
	//*  20   36:invokevirtual   #26  <Method int Parcel.dataPosition()>
	//*  21   39:iload_2         
	//*  22   40:icmpge          188
			{
				int j = SafeParcelReader.readHeader(parcel);
	//   23   43:aload_1         
	//   24   44:invokestatic    #29  <Method int SafeParcelReader.readHeader(Parcel)>
	//   25   47:istore_3        
				switch(SafeParcelReader.getFieldId(j))
	//*  26   48:iload_3         
	//*  27   49:invokestatic    #33  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  28   52:tableswitch     2 9: default 100
	//	               2 178
	//	               3 168
	//	               4 158
	//	               5 148
	//	               6 138
	//	               7 128
	//	               8 118
	//	               9 108
				default:
					SafeParcelReader.skipUnknownField(parcel, j);
	//   29  100:aload_1         
	//   30  101:iload_3         
	//   31  102:invokestatic    #37  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  32  105:goto            35
				case 9: // '\t'
					obj1 = ((Object) (SafeParcelReader.createStringList(parcel, j)));
	//   33  108:aload_1         
	//   34  109:iload_3         
	//   35  110:invokestatic    #41  <Method java.util.ArrayList SafeParcelReader.createStringList(Parcel, int)>
	//   36  113:astore          10
					break;

	//*  37  115:goto            35
				case 8: // '\b'
					flag2 = SafeParcelReader.readBoolean(parcel, j);
	//   38  118:aload_1         
	//   39  119:iload_3         
	//   40  120:invokestatic    #45  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   41  123:istore          6
					break;

	//*  42  125:goto            35
				case 7: // '\007'
					flag1 = SafeParcelReader.readBoolean(parcel, j);
	//   43  128:aload_1         
	//   44  129:iload_3         
	//   45  130:invokestatic    #45  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   46  133:istore          5
					break;

	//*  47  135:goto            35
				case 6: // '\006'
					obj = ((Object) (SafeParcelReader.createStringList(parcel, j)));
	//   48  138:aload_1         
	//   49  139:iload_3         
	//   50  140:invokestatic    #41  <Method java.util.ArrayList SafeParcelReader.createStringList(Parcel, int)>
	//   51  143:astore          9
					break;

	//*  52  145:goto            35
				case 5: // '\005'
					flag = SafeParcelReader.readBoolean(parcel, j);
	//   53  148:aload_1         
	//   54  149:iload_3         
	//   55  150:invokestatic    #45  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   56  153:istore          4
					break;

	//*  57  155:goto            35
				case 4: // '\004'
					flag3 = SafeParcelReader.readBoolean(parcel, j);
	//   58  158:aload_1         
	//   59  159:iload_3         
	//   60  160:invokestatic    #45  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   61  163:istore          7
					break;

	//*  62  165:goto            35
				case 3: // '\003'
					s = SafeParcelReader.createString(parcel, j);
	//   63  168:aload_1         
	//   64  169:iload_3         
	//   65  170:invokestatic    #49  <Method String SafeParcelReader.createString(Parcel, int)>
	//   66  173:astore          8
					break;

	//*  67  175:goto            35
				case 2: // '\002'
					s1 = SafeParcelReader.createString(parcel, j);
	//   68  178:aload_1         
	//   69  179:iload_3         
	//   70  180:invokestatic    #49  <Method String SafeParcelReader.createString(Parcel, int)>
	//   71  183:astore          11
					break;
				}
			} else
	//*  72  185:goto            35
			{
				SafeParcelReader.ensureAtEnd(parcel, i);
	//   73  188:aload_1         
	//   74  189:iload_2         
	//   75  190:invokestatic    #52  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return ((Object) (new zzaiq(s1, s, flag3, flag, ((java.util.List) (obj)), flag1, flag2, ((java.util.List) (obj1)))));
	//   76  193:new             #54  <Class zzaiq>
	//   77  196:dup             
	//   78  197:aload           11
	//   79  199:aload           8
	//   80  201:iload           7
	//   81  203:iload           4
	//   82  205:aload           9
	//   83  207:iload           5
	//   84  209:iload           6
	//   85  211:aload           10
	//   86  213:invokespecial   #57  <Method void zzaiq(String, String, boolean, boolean, java.util.List, boolean, boolean, java.util.List)>
	//   87  216:areturn         
			}
		while(true);
	}

	public final Object[] newArray(int i)
	{
		return ((Object []) (new zzaiq[i]));
	//    0    0:iload_1         
	//    1    1:anewarray       zzaiq[]
	//    2    4:areturn         
	}
}
