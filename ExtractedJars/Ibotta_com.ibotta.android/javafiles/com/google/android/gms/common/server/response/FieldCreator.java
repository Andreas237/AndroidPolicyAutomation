// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.common.server.converter.ConverterWrapper;

public class FieldCreator
	implements android.os.Parcelable.Creator
{

	public FieldCreator()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #14  <Method void Object()>
	//    2    4:return          
	}

	public FastJsonResponse.Field createFromParcel(Parcel parcel)
	{
		int i1 = SafeParcelReader.validateObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #23  <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//    2    4:istore          6
		String s1 = null;
	//    3    6:aconst_null     
	//    4    7:astore          12
		String s = s1;
	//    5    9:aload           12
	//    6   11:astore          10
		Object obj = ((Object) (s));
	//    7   13:aload           10
	//    8   15:astore          11
		int l = 0;
	//    9   17:iconst_0        
	//   10   18:istore          5
		int k = 0;
	//   11   20:iconst_0        
	//   12   21:istore          4
		boolean flag1 = false;
	//   13   23:iconst_0        
	//   14   24:istore          9
		int j = 0;
	//   15   26:iconst_0        
	//   16   27:istore_3        
		boolean flag = false;
	//   17   28:iconst_0        
	//   18   29:istore          8
		int i = 0;
	//   19   31:iconst_0        
	//   20   32:istore_2        
		do
			if(parcel.dataPosition() < i1)
	//*  21   33:aload_1         
	//*  22   34:invokevirtual   #29  <Method int Parcel.dataPosition()>
	//*  23   37:iload           6
	//*  24   39:icmpge          216
			{
				int j1 = SafeParcelReader.readHeader(parcel);
	//   25   42:aload_1         
	//   26   43:invokestatic    #32  <Method int SafeParcelReader.readHeader(Parcel)>
	//   27   46:istore          7
				switch(SafeParcelReader.getFieldId(j1))
	//*  28   48:iload           7
	//*  29   50:invokestatic    #36  <Method int SafeParcelReader.getFieldId(int)>
				{
	//*  30   53:tableswitch     1 9: default 104
	//	               1 205
	//	               2 194
	//	               3 183
	//	               4 173
	//	               5 162
	//	               6 151
	//	               7 141
	//	               8 130
	//	               9 113
				default:
					SafeParcelReader.skipUnknownField(parcel, j1);
	//   31  104:aload_1         
	//   32  105:iload           7
	//   33  107:invokestatic    #40  <Method void SafeParcelReader.skipUnknownField(Parcel, int)>
					break;

	//*  34  110:goto            33
				case 9: // '\t'
					obj = ((Object) ((ConverterWrapper)SafeParcelReader.createParcelable(parcel, j1, ConverterWrapper.CREATOR)));
	//   35  113:aload_1         
	//   36  114:iload           7
	//   37  116:getstatic       #46  <Field android.os.Parcelable$Creator ConverterWrapper.CREATOR>
	//   38  119:invokestatic    #50  <Method android.os.Parcelable SafeParcelReader.createParcelable(Parcel, int, android.os.Parcelable$Creator)>
	//   39  122:checkcast       #42  <Class ConverterWrapper>
	//   40  125:astore          11
					break;

	//*  41  127:goto            33
				case 8: // '\b'
					s = SafeParcelReader.createString(parcel, j1);
	//   42  130:aload_1         
	//   43  131:iload           7
	//   44  133:invokestatic    #54  <Method String SafeParcelReader.createString(Parcel, int)>
	//   45  136:astore          10
					break;

	//*  46  138:goto            33
				case 7: // '\007'
					i = SafeParcelReader.readInt(parcel, j1);
	//   47  141:aload_1         
	//   48  142:iload           7
	//   49  144:invokestatic    #58  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   50  147:istore_2        
					break;

	//*  51  148:goto            33
				case 6: // '\006'
					s1 = SafeParcelReader.createString(parcel, j1);
	//   52  151:aload_1         
	//   53  152:iload           7
	//   54  154:invokestatic    #54  <Method String SafeParcelReader.createString(Parcel, int)>
	//   55  157:astore          12
					break;

	//*  56  159:goto            33
				case 5: // '\005'
					flag = SafeParcelReader.readBoolean(parcel, j1);
	//   57  162:aload_1         
	//   58  163:iload           7
	//   59  165:invokestatic    #62  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   60  168:istore          8
					break;

	//*  61  170:goto            33
				case 4: // '\004'
					j = SafeParcelReader.readInt(parcel, j1);
	//   62  173:aload_1         
	//   63  174:iload           7
	//   64  176:invokestatic    #58  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   65  179:istore_3        
					break;

	//*  66  180:goto            33
				case 3: // '\003'
					flag1 = SafeParcelReader.readBoolean(parcel, j1);
	//   67  183:aload_1         
	//   68  184:iload           7
	//   69  186:invokestatic    #62  <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//   70  189:istore          9
					break;

	//*  71  191:goto            33
				case 2: // '\002'
					k = SafeParcelReader.readInt(parcel, j1);
	//   72  194:aload_1         
	//   73  195:iload           7
	//   74  197:invokestatic    #58  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   75  200:istore          4
					break;

	//*  76  202:goto            33
				case 1: // '\001'
					l = SafeParcelReader.readInt(parcel, j1);
	//   77  205:aload_1         
	//   78  206:iload           7
	//   79  208:invokestatic    #58  <Method int SafeParcelReader.readInt(Parcel, int)>
	//   80  211:istore          5
					break;
				}
			} else
	//*  81  213:goto            33
			{
				SafeParcelReader.ensureAtEnd(parcel, i1);
	//   82  216:aload_1         
	//   83  217:iload           6
	//   84  219:invokestatic    #65  <Method void SafeParcelReader.ensureAtEnd(Parcel, int)>
				return new FastJsonResponse.Field(l, k, flag1, j, flag, s1, i, s, ((ConverterWrapper) (obj)));
	//   85  222:new             #67  <Class FastJsonResponse$Field>
	//   86  225:dup             
	//   87  226:iload           5
	//   88  228:iload           4
	//   89  230:iload           9
	//   90  232:iload_3         
	//   91  233:iload           8
	//   92  235:aload           12
	//   93  237:iload_2         
	//   94  238:aload           10
	//   95  240:aload           11
	//   96  242:invokespecial   #70  <Method void FastJsonResponse$Field(int, int, boolean, int, boolean, String, int, String, ConverterWrapper)>
	//   97  245:areturn         
			}
		while(true);
	}

	public volatile Object createFromParcel(Parcel parcel)
	{
		return ((Object) (createFromParcel(parcel)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #73  <Method FastJsonResponse$Field createFromParcel(Parcel)>
	//    3    5:areturn         
	}

	public FastJsonResponse.Field[] newArray(int i)
	{
		return new FastJsonResponse.Field[i];
	//    0    0:iload_1         
	//    1    1:anewarray       FastJsonResponse.Field[]
	//    2    4:areturn         
	}

	public volatile Object[] newArray(int i)
	{
		return ((Object []) (newArray(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #78  <Method FastJsonResponse$Field[] newArray(int)>
	//    3    5:areturn         
	}

	public static final int CONTENT_DESCRIPTION = 0;
}
