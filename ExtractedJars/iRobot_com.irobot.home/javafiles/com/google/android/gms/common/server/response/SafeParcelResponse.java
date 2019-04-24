// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.common.server.response;

import android.os.Bundle;
import android.os.Parcel;
import android.util.SparseArray;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.*;
import com.google.android.gms.common.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;

// Referenced classes of package com.google.android.gms.common.server.response:
//			FastSafeParcelableJsonResponse, zap, zak, FastJsonResponse

public class SafeParcelResponse extends FastSafeParcelableJsonResponse
{

	SafeParcelResponse(int i, Parcel parcel, zak zak1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void FastSafeParcelableJsonResponse()>
		zale = i;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #49  <Field int zale>
		zara = (Parcel)Preconditions.checkNotNull(((Object) (parcel)));
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:invokestatic    #55  <Method Object Preconditions.checkNotNull(Object)>
	//    8   14:checkcast       #57  <Class Parcel>
	//    9   17:putfield        #59  <Field Parcel zara>
		zarb = 2;
	//   10   20:aload_0         
	//   11   21:iconst_2        
	//   12   22:putfield        #61  <Field int zarb>
		zapy = zak1;
	//   13   25:aload_0         
	//   14   26:aload_3         
	//   15   27:putfield        #63  <Field zak zapy>
		if(zapy == null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #63  <Field zak zapy>
	//*  18   34:ifnonnull       47
			parcel = null;
	//   19   37:aconst_null     
	//   20   38:astore_2        
		else
	//*  21   39:aload_0         
	//*  22   40:aload_2         
	//*  23   41:putfield        #65  <Field String mClassName>
	//*  24   44:goto            58
			parcel = ((Parcel) (zapy.zact()));
	//   25   47:aload_0         
	//   26   48:getfield        #63  <Field zak zapy>
	//   27   51:invokevirtual   #71  <Method String zak.zact()>
	//   28   54:astore_2        
		mClassName = ((String) (parcel));
	//*  29   55:goto            39
		zarc = 2;
	//   30   58:aload_0         
	//   31   59:iconst_2        
	//   32   60:putfield        #73  <Field int zarc>
	//   33   63:return          
	}

	private SafeParcelResponse(SafeParcelable safeparcelable, zak zak1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void FastSafeParcelableJsonResponse()>
		zale = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #49  <Field int zale>
		zara = Parcel.obtain();
	//    5    9:aload_0         
	//    6   10:invokestatic    #80  <Method Parcel Parcel.obtain()>
	//    7   13:putfield        #59  <Field Parcel zara>
		safeparcelable.writeToParcel(zara, 0);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #59  <Field Parcel zara>
	//   11   21:iconst_0        
	//   12   22:invokeinterface #86  <Method void SafeParcelable.writeToParcel(Parcel, int)>
		zarb = 1;
	//   13   27:aload_0         
	//   14   28:iconst_1        
	//   15   29:putfield        #61  <Field int zarb>
		zapy = (zak)Preconditions.checkNotNull(((Object) (zak1)));
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokestatic    #55  <Method Object Preconditions.checkNotNull(Object)>
	//   19   37:checkcast       #67  <Class zak>
	//   20   40:putfield        #63  <Field zak zapy>
		mClassName = (String)Preconditions.checkNotNull(((Object) (s)));
	//   21   43:aload_0         
	//   22   44:aload_3         
	//   23   45:invokestatic    #55  <Method Object Preconditions.checkNotNull(Object)>
	//   24   48:checkcast       #88  <Class String>
	//   25   51:putfield        #65  <Field String mClassName>
		zarc = 2;
	//   26   54:aload_0         
	//   27   55:iconst_2        
	//   28   56:putfield        #73  <Field int zarc>
	//   29   59:return          
	}

	public SafeParcelResponse(zak zak1, String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void FastSafeParcelableJsonResponse()>
		zale = 1;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #49  <Field int zale>
		zara = Parcel.obtain();
	//    5    9:aload_0         
	//    6   10:invokestatic    #80  <Method Parcel Parcel.obtain()>
	//    7   13:putfield        #59  <Field Parcel zara>
		zarb = 0;
	//    8   16:aload_0         
	//    9   17:iconst_0        
	//   10   18:putfield        #61  <Field int zarb>
		zapy = (zak)Preconditions.checkNotNull(((Object) (zak1)));
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokestatic    #55  <Method Object Preconditions.checkNotNull(Object)>
	//   14   26:checkcast       #67  <Class zak>
	//   15   29:putfield        #63  <Field zak zapy>
		mClassName = (String)Preconditions.checkNotNull(((Object) (s)));
	//   16   32:aload_0         
	//   17   33:aload_2         
	//   18   34:invokestatic    #55  <Method Object Preconditions.checkNotNull(Object)>
	//   19   37:checkcast       #88  <Class String>
	//   20   40:putfield        #65  <Field String mClassName>
		zarc = 0;
	//   21   43:aload_0         
	//   22   44:iconst_0        
	//   23   45:putfield        #73  <Field int zarc>
	//   24   48:return          
	}

	public static SafeParcelResponse from(FastJsonResponse fastjsonresponse)
	{
		String s = ((Object) (fastjsonresponse)).getClass().getCanonicalName();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #97  <Method Class Object.getClass()>
	//    2    4:invokevirtual   #102 <Method String Class.getCanonicalName()>
	//    3    7:astore_1        
		zak zak1 = new zak(((Object) (fastjsonresponse)).getClass());
	//    4    8:new             #67  <Class zak>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:invokevirtual   #97  <Method Class Object.getClass()>
	//    8   16:invokespecial   #105 <Method void zak(Class)>
	//    9   19:astore_2        
		zaa(zak1, fastjsonresponse);
	//   10   20:aload_2         
	//   11   21:aload_0         
	//   12   22:invokestatic    #109 <Method void zaa(zak, FastJsonResponse)>
		zak1.zacs();
	//   13   25:aload_2         
	//   14   26:invokevirtual   #112 <Method void zak.zacs()>
		zak1.zacr();
	//   15   29:aload_2         
	//   16   30:invokevirtual   #115 <Method void zak.zacr()>
		return new SafeParcelResponse((SafeParcelable)fastjsonresponse, zak1, s);
	//   17   33:new             #2   <Class SafeParcelResponse>
	//   18   36:dup             
	//   19   37:aload_0         
	//   20   38:checkcast       #82  <Class SafeParcelable>
	//   21   41:aload_2         
	//   22   42:aload_1         
	//   23   43:invokespecial   #117 <Method void SafeParcelResponse(SafeParcelable, zak, String)>
	//   24   46:areturn         
	}

	private static void zaa(zak zak1, FastJsonResponse fastjsonresponse)
	{
		Object obj = ((Object) (((Object) (fastjsonresponse)).getClass()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #97  <Method Class Object.getClass()>
	//    2    4:astore_3        
		if(!zak1.zaa(((Class) (obj))))
	//*   3    5:aload_0         
	//*   4    6:aload_3         
	//*   5    7:invokevirtual   #126 <Method boolean zak.zaa(Class)>
	//*   6   10:ifne            188
		{
			Map map = fastjsonresponse.getFieldMappings();
	//    7   13:aload_1         
	//    8   14:invokevirtual   #132 <Method Map FastJsonResponse.getFieldMappings()>
	//    9   17:astore_2        
			zak1.zaa(((Class) (obj)), map);
	//   10   18:aload_0         
	//   11   19:aload_3         
	//   12   20:aload_2         
	//   13   21:invokevirtual   #135 <Method void zak.zaa(Class, Map)>
			obj = ((Object) (map.keySet().iterator()));
	//   14   24:aload_2         
	//   15   25:invokeinterface #141 <Method Set Map.keySet()>
	//   16   30:invokeinterface #147 <Method Iterator Set.iterator()>
	//   17   35:astore_3        
			do
			{
				if(!((Iterator) (obj)).hasNext())
					break;
	//   18   36:aload_3         
	//   19   37:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//   20   42:ifeq            188
				fastjsonresponse = ((FastJsonResponse) ((FastJsonResponse.Field)map.get(((Object) ((String)((Iterator) (obj)).next())))));
	//   21   45:aload_2         
	//   22   46:aload_3         
	//   23   47:invokeinterface #157 <Method Object Iterator.next()>
	//   24   52:checkcast       #88  <Class String>
	//   25   55:invokeinterface #160 <Method Object Map.get(Object)>
	//   26   60:checkcast       #162 <Class FastJsonResponse$Field>
	//   27   63:astore_1        
				Class class1 = ((FastJsonResponse.Field) (fastjsonresponse)).zapw;
	//   28   64:aload_1         
	//   29   65:getfield        #166 <Field Class FastJsonResponse$Field.zapw>
	//   30   68:astore          4
				if(class1 != null)
	//*  31   70:aload           4
	//*  32   72:ifnull          36
					try
					{
						zaa(zak1, (FastJsonResponse)class1.newInstance());
	//   33   75:aload_0         
	//   34   76:aload           4
	//   35   78:invokevirtual   #169 <Method Object Class.newInstance()>
	//   36   81:checkcast       #128 <Class FastJsonResponse>
	//   37   84:invokestatic    #109 <Method void zaa(zak, FastJsonResponse)>
					}
	//*  38   87:goto            36
	//*  39   90:astore_2        
	//*  40   91:aload_1         
	//*  41   92:getfield        #166 <Field Class FastJsonResponse$Field.zapw>
	//*  42   95:invokevirtual   #102 <Method String Class.getCanonicalName()>
	//*  43   98:invokestatic    #173 <Method String String.valueOf(Object)>
	//*  44  101:astore_0        
	//*  45  102:aload_0         
	//*  46  103:invokevirtual   #177 <Method int String.length()>
	//*  47  106:ifeq            119
	//*  48  109:ldc1            #179 <String "Could not access object of type ">
	//*  49  111:aload_0         
	//*  50  112:invokevirtual   #183 <Method String String.concat(String)>
	//*  51  115:astore_0        
	//*  52  116:goto            129
	//*  53  119:new             #88  <Class String>
	//*  54  122:dup             
	//*  55  123:ldc1            #179 <String "Could not access object of type ">
	//*  56  125:invokespecial   #186 <Method void String(String)>
	//*  57  128:astore_0        
	//*  58  129:new             #188 <Class IllegalStateException>
	//*  59  132:dup             
	//*  60  133:aload_0         
	//*  61  134:aload_2         
	//*  62  135:invokespecial   #191 <Method void IllegalStateException(String, Throwable)>
	//*  63  138:athrow          
					catch(InstantiationException instantiationexception)
	//*  64  139:astore_2        
					{
						zak1 = ((zak) (String.valueOf(((Object) (((FastJsonResponse.Field) (fastjsonresponse)).zapw.getCanonicalName())))));
	//   65  140:aload_1         
	//   66  141:getfield        #166 <Field Class FastJsonResponse$Field.zapw>
	//   67  144:invokevirtual   #102 <Method String Class.getCanonicalName()>
	//   68  147:invokestatic    #173 <Method String String.valueOf(Object)>
	//   69  150:astore_0        
						if(((String) (zak1)).length() != 0)
	//*  70  151:aload_0         
	//*  71  152:invokevirtual   #177 <Method int String.length()>
	//*  72  155:ifeq            168
							zak1 = ((zak) ("Could not instantiate an object of type ".concat(((String) (zak1)))));
	//   73  158:ldc1            #193 <String "Could not instantiate an object of type ">
	//   74  160:aload_0         
	//   75  161:invokevirtual   #183 <Method String String.concat(String)>
	//   76  164:astore_0        
						else
	//*  77  165:goto            178
							zak1 = ((zak) (new String("Could not instantiate an object of type ")));
	//   78  168:new             #88  <Class String>
	//   79  171:dup             
	//   80  172:ldc1            #193 <String "Could not instantiate an object of type ">
	//   81  174:invokespecial   #186 <Method void String(String)>
	//   82  177:astore_0        
						throw new IllegalStateException(((String) (zak1)), ((Throwable) (instantiationexception)));
	//   83  178:new             #188 <Class IllegalStateException>
	//   84  181:dup             
	//   85  182:aload_0         
	//   86  183:aload_2         
	//   87  184:invokespecial   #191 <Method void IllegalStateException(String, Throwable)>
	//   88  187:athrow          
					}
					catch(IllegalAccessException illegalaccessexception)
					{
						zak1 = ((zak) (String.valueOf(((Object) (((FastJsonResponse.Field) (fastjsonresponse)).zapw.getCanonicalName())))));
						if(((String) (zak1)).length() != 0)
							zak1 = ((zak) ("Could not access object of type ".concat(((String) (zak1)))));
						else
							zak1 = ((zak) (new String("Could not access object of type ")));
						throw new IllegalStateException(((String) (zak1)), ((Throwable) (illegalaccessexception)));
					}
			} while(true);
		}
	//   89  188:return          
	}

	private static void zaa(StringBuilder stringbuilder, int i, Object obj)
	{
		switch(i)
	//*   0    0:iload_1         
		{
	//*   1    1:tableswitch     0 11: default 64
	//	               0 199
	//	               1 199
	//	               2 199
	//	               3 199
	//	               4 199
	//	               5 199
	//	               6 199
	//	               7 172
	//	               8 145
	//	               9 118
	//	               10 109
	//	               11 99
		default:
			stringbuilder = new StringBuilder(26);
	//    2   64:new             #196 <Class StringBuilder>
	//    3   67:dup             
	//    4   68:bipush          26
	//    5   70:invokespecial   #199 <Method void StringBuilder(int)>
	//    6   73:astore_0        
			stringbuilder.append("Unknown type = ");
	//    7   74:aload_0         
	//    8   75:ldc1            #201 <String "Unknown type = ">
	//    9   77:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   10   80:pop             
			stringbuilder.append(i);
	//   11   81:aload_0         
	//   12   82:iload_1         
	//   13   83:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//   14   86:pop             
			throw new IllegalArgumentException(stringbuilder.toString());
	//   15   87:new             #210 <Class IllegalArgumentException>
	//   16   90:dup             
	//   17   91:aload_0         
	//   18   92:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   19   95:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//   20   98:athrow          

		case 11: // '\013'
			throw new IllegalArgumentException("Method does not accept concrete type.");
	//   21   99:new             #210 <Class IllegalArgumentException>
	//   22  102:dup             
	//   23  103:ldc1            #216 <String "Method does not accept concrete type.">
	//   24  105:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//   25  108:athrow          

		case 10: // '\n'
			MapUtils.writeStringMapToJson(stringbuilder, (HashMap)obj);
	//   26  109:aload_0         
	//   27  110:aload_2         
	//   28  111:checkcast       #218 <Class HashMap>
	//   29  114:invokestatic    #224 <Method void MapUtils.writeStringMapToJson(StringBuilder, HashMap)>
			return;
	//   30  117:return          

		case 9: // '\t'
			stringbuilder.append("\"");
	//   31  118:aload_0         
	//   32  119:ldc1            #226 <String "\"">
	//   33  121:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   34  124:pop             
			stringbuilder.append(Base64Utils.encodeUrlSafe((byte[])obj));
	//   35  125:aload_0         
	//   36  126:aload_2         
	//   37  127:checkcast       #228 <Class byte[]>
	//   38  130:invokestatic    #234 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//   39  133:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   40  136:pop             
			stringbuilder.append("\"");
	//   41  137:aload_0         
	//   42  138:ldc1            #226 <String "\"">
	//   43  140:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   44  143:pop             
			return;
	//   45  144:return          

		case 8: // '\b'
			stringbuilder.append("\"");
	//   46  145:aload_0         
	//   47  146:ldc1            #226 <String "\"">
	//   48  148:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   49  151:pop             
			stringbuilder.append(Base64Utils.encode((byte[])obj));
	//   50  152:aload_0         
	//   51  153:aload_2         
	//   52  154:checkcast       #228 <Class byte[]>
	//   53  157:invokestatic    #237 <Method String Base64Utils.encode(byte[])>
	//   54  160:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   55  163:pop             
			stringbuilder.append("\"");
	//   56  164:aload_0         
	//   57  165:ldc1            #226 <String "\"">
	//   58  167:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   59  170:pop             
			return;
	//   60  171:return          

		case 7: // '\007'
			stringbuilder.append("\"");
	//   61  172:aload_0         
	//   62  173:ldc1            #226 <String "\"">
	//   63  175:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   64  178:pop             
			stringbuilder.append(JsonUtils.escapeString(obj.toString()));
	//   65  179:aload_0         
	//   66  180:aload_2         
	//   67  181:invokevirtual   #238 <Method String Object.toString()>
	//   68  184:invokestatic    #243 <Method String JsonUtils.escapeString(String)>
	//   69  187:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   70  190:pop             
			stringbuilder.append("\"");
	//   71  191:aload_0         
	//   72  192:ldc1            #226 <String "\"">
	//   73  194:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   74  197:pop             
			return;
	//   75  198:return          

		case 0: // '\0'
		case 1: // '\001'
		case 2: // '\002'
		case 3: // '\003'
		case 4: // '\004'
		case 5: // '\005'
		case 6: // '\006'
			stringbuilder.append(obj);
	//   76  199:aload_0         
	//   77  200:aload_2         
	//   78  201:invokevirtual   #246 <Method StringBuilder StringBuilder.append(Object)>
	//   79  204:pop             
			return;
	//   80  205:return          
		}
	}

	private final void zaa(StringBuilder stringbuilder, Map map, Parcel parcel)
	{
		SparseArray sparsearray = new SparseArray();
	//    0    0:new             #249 <Class SparseArray>
	//    1    3:dup             
	//    2    4:invokespecial   #250 <Method void SparseArray()>
	//    3    7:astore          7
		java.util.Map.Entry entry;
		for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); sparsearray.put(((FastJsonResponse.Field)entry.getValue()).getSafeParcelableFieldId(), ((Object) (entry))))
	//*   4    9:aload_2         
	//*   5   10:invokeinterface #253 <Method Set Map.entrySet()>
	//*   6   15:invokeinterface #147 <Method Iterator Set.iterator()>
	//*   7   20:astore_2        
	//*   8   21:aload_2         
	//*   9   22:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//*  10   27:ifeq            64
			entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   11   30:aload_2         
	//   12   31:invokeinterface #157 <Method Object Iterator.next()>
	//   13   36:checkcast       #255 <Class java.util.Map$Entry>
	//   14   39:astore          8

	//   15   41:aload           7
	//   16   43:aload           8
	//   17   45:invokeinterface #258 <Method Object java.util.Map$Entry.getValue()>
	//   18   50:checkcast       #162 <Class FastJsonResponse$Field>
	//   19   53:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   20   56:aload           8
	//   21   58:invokevirtual   #265 <Method void SparseArray.put(int, Object)>
	//*  22   61:goto            21
		stringbuilder.append('{');
	//   23   64:aload_1         
	//   24   65:bipush          123
	//   25   67:invokevirtual   #268 <Method StringBuilder StringBuilder.append(char)>
	//   26   70:pop             
		int j = SafeParcelReader.validateObjectHeader(parcel);
	//   27   71:aload_3         
	//   28   72:invokestatic    #274 <Method int SafeParcelReader.validateObjectHeader(Parcel)>
	//   29   75:istore          5
		int i = 0;
	//   30   77:iconst_0        
	//   31   78:istore          4
label0:
		do
		{
label1:
			{
				int k;
				Object obj;
label2:
				{
label3:
					{
						if(parcel.dataPosition() >= j)
							break label0;
	//   32   80:aload_3         
	//   33   81:invokevirtual   #277 <Method int Parcel.dataPosition()>
	//   34   84:iload           5
	//   35   86:icmpge          1207
						k = SafeParcelReader.readHeader(parcel);
	//   36   89:aload_3         
	//   37   90:invokestatic    #280 <Method int SafeParcelReader.readHeader(Parcel)>
	//   38   93:istore          6
						obj = ((Object) ((java.util.Map.Entry)sparsearray.get(SafeParcelReader.getFieldId(k))));
	//   39   95:aload           7
	//   40   97:iload           6
	//   41   99:invokestatic    #284 <Method int SafeParcelReader.getFieldId(int)>
	//   42  102:invokevirtual   #287 <Method Object SparseArray.get(int)>
	//   43  105:checkcast       #255 <Class java.util.Map$Entry>
	//   44  108:astore          8
						if(obj == null)
							continue;
	//   45  110:aload           8
	//   46  112:ifnull          80
						if(i != 0)
	//*  47  115:iload           4
	//*  48  117:ifeq            128
							stringbuilder.append(",");
	//   49  120:aload_1         
	//   50  121:ldc2            #289 <String ",">
	//   51  124:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   52  127:pop             
						map = ((Map) ((String)((java.util.Map.Entry) (obj)).getKey()));
	//   53  128:aload           8
	//   54  130:invokeinterface #292 <Method Object java.util.Map$Entry.getKey()>
	//   55  135:checkcast       #88  <Class String>
	//   56  138:astore_2        
						obj = ((Object) ((FastJsonResponse.Field)((java.util.Map.Entry) (obj)).getValue()));
	//   57  139:aload           8
	//   58  141:invokeinterface #258 <Method Object java.util.Map$Entry.getValue()>
	//   59  146:checkcast       #162 <Class FastJsonResponse$Field>
	//   60  149:astore          8
						stringbuilder.append("\"");
	//   61  151:aload_1         
	//   62  152:ldc1            #226 <String "\"">
	//   63  154:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   64  157:pop             
						stringbuilder.append(((String) (map)));
	//   65  158:aload_1         
	//   66  159:aload_2         
	//   67  160:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   68  163:pop             
						stringbuilder.append("\":");
	//   69  164:aload_1         
	//   70  165:ldc2            #294 <String "\":">
	//   71  168:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   72  171:pop             
						if(!((FastJsonResponse.Field) (obj)).zacn())
							break label2;
	//   73  172:aload           8
	//   74  174:invokevirtual   #297 <Method boolean FastJsonResponse$Field.zacn()>
	//   75  177:ifeq            499
						switch(((FastJsonResponse.Field) (obj)).zaps)
	//*  76  180:aload           8
	//*  77  182:getfield        #300 <Field int FastJsonResponse$Field.zaps>
						{
	//*  78  185:tableswitch     0 11: default 248
	//	               0 471
	//	               1 461
	//	               2 448
	//	               3 435
	//	               4 422
	//	               5 412
	//	               6 399
	//	               7 389
	//	               8 379
	//	               9 379
	//	               10 302
	//	               11 292
						default:
							i = ((FastJsonResponse.Field) (obj)).zaps;
	//   79  248:aload           8
	//   80  250:getfield        #300 <Field int FastJsonResponse$Field.zaps>
	//   81  253:istore          4
							stringbuilder = new StringBuilder(36);
	//   82  255:new             #196 <Class StringBuilder>
	//   83  258:dup             
	//   84  259:bipush          36
	//   85  261:invokespecial   #199 <Method void StringBuilder(int)>
	//   86  264:astore_1        
							stringbuilder.append("Unknown field out type = ");
	//   87  265:aload_1         
	//   88  266:ldc2            #302 <String "Unknown field out type = ">
	//   89  269:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   90  272:pop             
							stringbuilder.append(i);
	//   91  273:aload_1         
	//   92  274:iload           4
	//   93  276:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//   94  279:pop             
							throw new IllegalArgumentException(stringbuilder.toString());
	//   95  280:new             #210 <Class IllegalArgumentException>
	//   96  283:dup             
	//   97  284:aload_1         
	//   98  285:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   99  288:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//  100  291:athrow          

						case 11: // '\013'
							throw new IllegalArgumentException("Method does not accept concrete type.");
	//  101  292:new             #210 <Class IllegalArgumentException>
	//  102  295:dup             
	//  103  296:ldc1            #216 <String "Method does not accept concrete type.">
	//  104  298:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//  105  301:athrow          

						case 10: // '\n'
							map = ((Map) (SafeParcelReader.createBundle(parcel, k)));
	//  106  302:aload_3         
	//  107  303:iload           6
	//  108  305:invokestatic    #306 <Method Bundle SafeParcelReader.createBundle(Parcel, int)>
	//  109  308:astore_2        
							HashMap hashmap = new HashMap();
	//  110  309:new             #218 <Class HashMap>
	//  111  312:dup             
	//  112  313:invokespecial   #307 <Method void HashMap()>
	//  113  316:astore          9
							String s1;
							for(Iterator iterator = ((Bundle) (map)).keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s1)), ((Object) (((Bundle) (map)).getString(s1)))))
	//* 114  318:aload_2         
	//* 115  319:invokevirtual   #310 <Method Set Bundle.keySet()>
	//* 116  322:invokeinterface #147 <Method Iterator Set.iterator()>
	//* 117  327:astore          10
	//* 118  329:aload           10
	//* 119  331:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//* 120  336:ifeq            368
								s1 = (String)iterator.next();
	//  121  339:aload           10
	//  122  341:invokeinterface #157 <Method Object Iterator.next()>
	//  123  346:checkcast       #88  <Class String>
	//  124  349:astore          11

	//  125  351:aload           9
	//  126  353:aload           11
	//  127  355:aload_2         
	//  128  356:aload           11
	//  129  358:invokevirtual   #313 <Method String Bundle.getString(String)>
	//  130  361:invokevirtual   #316 <Method Object HashMap.put(Object, Object)>
	//  131  364:pop             
	//* 132  365:goto            329
							map = ((Map) (zab(((FastJsonResponse.Field) (obj)), ((Object) (hashmap)))));
	//  133  368:aload           8
	//  134  370:aload           9
	//  135  372:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  136  375:astore_2        
							break label3;
	//  137  376:goto            488

						case 8: // '\b'
						case 9: // '\t'
							map = ((Map) (SafeParcelReader.createByteArray(parcel, k)));
	//  138  379:aload_3         
	//  139  380:iload           6
	//  140  382:invokestatic    #324 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  141  385:astore_2        
							break;
	//  142  386:goto            481

						case 7: // '\007'
							map = ((Map) (SafeParcelReader.createString(parcel, k)));
	//  143  389:aload_3         
	//  144  390:iload           6
	//  145  392:invokestatic    #328 <Method String SafeParcelReader.createString(Parcel, int)>
	//  146  395:astore_2        
							break;
	//  147  396:goto            481

						case 6: // '\006'
							map = ((Map) (Boolean.valueOf(SafeParcelReader.readBoolean(parcel, k))));
	//  148  399:aload_3         
	//  149  400:iload           6
	//  150  402:invokestatic    #332 <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//  151  405:invokestatic    #337 <Method Boolean Boolean.valueOf(boolean)>
	//  152  408:astore_2        
							break;
	//  153  409:goto            481

						case 5: // '\005'
							map = ((Map) (SafeParcelReader.createBigDecimal(parcel, k)));
	//  154  412:aload_3         
	//  155  413:iload           6
	//  156  415:invokestatic    #341 <Method BigDecimal SafeParcelReader.createBigDecimal(Parcel, int)>
	//  157  418:astore_2        
							break;
	//  158  419:goto            481

						case 4: // '\004'
							map = ((Map) (Double.valueOf(SafeParcelReader.readDouble(parcel, k))));
	//  159  422:aload_3         
	//  160  423:iload           6
	//  161  425:invokestatic    #345 <Method double SafeParcelReader.readDouble(Parcel, int)>
	//  162  428:invokestatic    #350 <Method Double Double.valueOf(double)>
	//  163  431:astore_2        
							break;
	//  164  432:goto            481

						case 3: // '\003'
							map = ((Map) (Float.valueOf(SafeParcelReader.readFloat(parcel, k))));
	//  165  435:aload_3         
	//  166  436:iload           6
	//  167  438:invokestatic    #354 <Method float SafeParcelReader.readFloat(Parcel, int)>
	//  168  441:invokestatic    #359 <Method Float Float.valueOf(float)>
	//  169  444:astore_2        
							break;
	//  170  445:goto            481

						case 2: // '\002'
							map = ((Map) (Long.valueOf(SafeParcelReader.readLong(parcel, k))));
	//  171  448:aload_3         
	//  172  449:iload           6
	//  173  451:invokestatic    #363 <Method long SafeParcelReader.readLong(Parcel, int)>
	//  174  454:invokestatic    #368 <Method Long Long.valueOf(long)>
	//  175  457:astore_2        
							break;
	//  176  458:goto            481

						case 1: // '\001'
							map = ((Map) (SafeParcelReader.createBigInteger(parcel, k)));
	//  177  461:aload_3         
	//  178  462:iload           6
	//  179  464:invokestatic    #372 <Method BigInteger SafeParcelReader.createBigInteger(Parcel, int)>
	//  180  467:astore_2        
							break;
	//  181  468:goto            481

						case 0: // '\0'
							map = ((Map) (Integer.valueOf(SafeParcelReader.readInt(parcel, k))));
	//  182  471:aload_3         
	//  183  472:iload           6
	//  184  474:invokestatic    #376 <Method int SafeParcelReader.readInt(Parcel, int)>
	//  185  477:invokestatic    #381 <Method Integer Integer.valueOf(int)>
	//  186  480:astore_2        
							break;
						}
						map = ((Map) (zab(((FastJsonResponse.Field) (obj)), ((Object) (map)))));
	//  187  481:aload           8
	//  188  483:aload_2         
	//  189  484:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  190  487:astore_2        
					}
					zab(stringbuilder, ((FastJsonResponse.Field) (obj)), ((Object) (map)));
	//  191  488:aload_0         
	//  192  489:aload_1         
	//  193  490:aload           8
	//  194  492:aload_2         
	//  195  493:invokespecial   #384 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
					break label1;
	//  196  496:goto            1201
				}
label4:
				{
label5:
					{
label6:
						{
label7:
							{
label8:
								{
label9:
									{
label10:
										{
label11:
											{
label12:
												{
label13:
													{
label14:
														{
label15:
															{
																if(!((FastJsonResponse.Field) (obj)).zapt)
																	break label13;
	//  197  499:aload           8
	//  198  501:getfield        #388 <Field boolean FastJsonResponse$Field.zapt>
	//  199  504:ifeq            778
																stringbuilder.append("[");
	//  200  507:aload_1         
	//  201  508:ldc2            #390 <String "[">
	//  202  511:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  203  514:pop             
																switch(((FastJsonResponse.Field) (obj)).zaps)
	//* 204  515:aload           8
	//* 205  517:getfield        #300 <Field int FastJsonResponse$Field.zaps>
																{
	//* 206  520:tableswitch     0 11: default 584
	//	               0 761
	//	               1 746
	//	               2 733
	//	               3 720
	//	               4 707
	//	               5 697
	//	               6 684
	//	               7 671
	//	               8 660
	//	               9 660
	//	               10 660
	//	               11 595
																default:
																	throw new IllegalStateException("Unknown field type out.");
	//  207  584:new             #188 <Class IllegalStateException>
	//  208  587:dup             
	//  209  588:ldc2            #392 <String "Unknown field type out.">
	//  210  591:invokespecial   #393 <Method void IllegalStateException(String)>
	//  211  594:athrow          

																case 0: // '\0'
																	break label15;

																case 11: // '\013'
																	map = ((Map) (SafeParcelReader.createParcelArray(parcel, k)));
	//  212  595:aload_3         
	//  213  596:iload           6
	//  214  598:invokestatic    #397 <Method Parcel[] SafeParcelReader.createParcelArray(Parcel, int)>
	//  215  601:astore_2        
																	k = map.length;
	//  216  602:aload_2         
	//  217  603:arraylength     
	//  218  604:istore          6
																	for(i = 0; i < k; i++)
	//* 219  606:iconst_0        
	//* 220  607:istore          4
	//* 221  609:iload           4
	//* 222  611:iload           6
	//* 223  613:icmpge          771
																	{
																		if(i > 0)
	//* 224  616:iload           4
	//* 225  618:ifle            629
																			stringbuilder.append(",");
	//  226  621:aload_1         
	//  227  622:ldc2            #289 <String ",">
	//  228  625:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  229  628:pop             
																		((Parcel) (map[i])).setDataPosition(0);
	//  230  629:aload_2         
	//  231  630:iload           4
	//  232  632:aaload          
	//  233  633:iconst_0        
	//  234  634:invokevirtual   #400 <Method void Parcel.setDataPosition(int)>
																		zaa(stringbuilder, ((FastJsonResponse.Field) (obj)).zacq(), ((Parcel) (map[i])));
	//  235  637:aload_0         
	//  236  638:aload_1         
	//  237  639:aload           8
	//  238  641:invokevirtual   #403 <Method Map FastJsonResponse$Field.zacq()>
	//  239  644:aload_2         
	//  240  645:iload           4
	//  241  647:aaload          
	//  242  648:invokespecial   #405 <Method void zaa(StringBuilder, Map, Parcel)>
																	}

	//  243  651:iload           4
	//  244  653:iconst_1        
	//  245  654:iadd            
	//  246  655:istore          4
																	break label14;
	//  247  657:goto            609

																case 8: // '\b'
																case 9: // '\t'
																case 10: // '\n'
																	throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
	//  248  660:new             #407 <Class UnsupportedOperationException>
	//  249  663:dup             
	//  250  664:ldc2            #409 <String "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported">
	//  251  667:invokespecial   #410 <Method void UnsupportedOperationException(String)>
	//  252  670:athrow          

																case 7: // '\007'
																	ArrayUtils.writeStringArray(stringbuilder, SafeParcelReader.createStringArray(parcel, k));
	//  253  671:aload_1         
	//  254  672:aload_3         
	//  255  673:iload           6
	//  256  675:invokestatic    #414 <Method String[] SafeParcelReader.createStringArray(Parcel, int)>
	//  257  678:invokestatic    #420 <Method void ArrayUtils.writeStringArray(StringBuilder, String[])>
																	break label14;
	//  258  681:goto            771

																case 6: // '\006'
																	ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createBooleanArray(parcel, k));
	//  259  684:aload_1         
	//  260  685:aload_3         
	//  261  686:iload           6
	//  262  688:invokestatic    #424 <Method boolean[] SafeParcelReader.createBooleanArray(Parcel, int)>
	//  263  691:invokestatic    #428 <Method void ArrayUtils.writeArray(StringBuilder, boolean[])>
																	break label14;
	//  264  694:goto            771

																case 5: // '\005'
																	map = ((Map) (SafeParcelReader.createBigDecimalArray(parcel, k)));
	//  265  697:aload_3         
	//  266  698:iload           6
	//  267  700:invokestatic    #432 <Method BigDecimal[] SafeParcelReader.createBigDecimalArray(Parcel, int)>
	//  268  703:astore_2        
																	break;
	//  269  704:goto            753

																case 4: // '\004'
																	ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createDoubleArray(parcel, k));
	//  270  707:aload_1         
	//  271  708:aload_3         
	//  272  709:iload           6
	//  273  711:invokestatic    #436 <Method double[] SafeParcelReader.createDoubleArray(Parcel, int)>
	//  274  714:invokestatic    #439 <Method void ArrayUtils.writeArray(StringBuilder, double[])>
																	break label14;
	//  275  717:goto            771

																case 3: // '\003'
																	ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createFloatArray(parcel, k));
	//  276  720:aload_1         
	//  277  721:aload_3         
	//  278  722:iload           6
	//  279  724:invokestatic    #443 <Method float[] SafeParcelReader.createFloatArray(Parcel, int)>
	//  280  727:invokestatic    #446 <Method void ArrayUtils.writeArray(StringBuilder, float[])>
																	break label14;
	//  281  730:goto            771

																case 2: // '\002'
																	ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createLongArray(parcel, k));
	//  282  733:aload_1         
	//  283  734:aload_3         
	//  284  735:iload           6
	//  285  737:invokestatic    #450 <Method long[] SafeParcelReader.createLongArray(Parcel, int)>
	//  286  740:invokestatic    #453 <Method void ArrayUtils.writeArray(StringBuilder, long[])>
																	break label14;
	//  287  743:goto            771

																case 1: // '\001'
																	map = ((Map) (SafeParcelReader.createBigIntegerArray(parcel, k)));
	//  288  746:aload_3         
	//  289  747:iload           6
	//  290  749:invokestatic    #457 <Method BigInteger[] SafeParcelReader.createBigIntegerArray(Parcel, int)>
	//  291  752:astore_2        
																	break;
																}
																ArrayUtils.writeArray(stringbuilder, ((Object []) (map)));
	//  292  753:aload_1         
	//  293  754:aload_2         
	//  294  755:invokestatic    #460 <Method void ArrayUtils.writeArray(StringBuilder, Object[])>
																break label14;
	//  295  758:goto            771
															}
															ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createIntArray(parcel, k));
	//  296  761:aload_1         
	//  297  762:aload_3         
	//  298  763:iload           6
	//  299  765:invokestatic    #464 <Method int[] SafeParcelReader.createIntArray(Parcel, int)>
	//  300  768:invokestatic    #467 <Method void ArrayUtils.writeArray(StringBuilder, int[])>
														}
														map = "]";
	//  301  771:ldc2            #469 <String "]">
	//  302  774:astore_2        
														break label12;
	//  303  775:goto            1099
													}
													switch(((FastJsonResponse.Field) (obj)).zaps)
	//* 304  778:aload           8
	//* 305  780:getfield        #300 <Field int FastJsonResponse$Field.zaps>
													{
	//* 306  783:tableswitch     0 11: default 844
	//	               0 1190
	//	               1 1174
	//	               2 1160
	//	               3 1146
	//	               4 1132
	//	               5 1122
	//	               6 1108
	//	               7 1071
	//	               8 1049
	//	               9 1027
	//	               10 881
	//	               11 855
													default:
														throw new IllegalStateException("Unknown field type out");
	//  307  844:new             #188 <Class IllegalStateException>
	//  308  847:dup             
	//  309  848:ldc2            #471 <String "Unknown field type out">
	//  310  851:invokespecial   #393 <Method void IllegalStateException(String)>
	//  311  854:athrow          

													case 0: // '\0'
														break label4;

													case 1: // '\001'
														break label6;

													case 2: // '\002'
														break label7;

													case 3: // '\003'
														break label8;

													case 4: // '\004'
														break label9;

													case 5: // '\005'
														break label10;

													case 6: // '\006'
														break label11;

													case 11: // '\013'
														map = ((Map) (SafeParcelReader.createParcel(parcel, k)));
	//  312  855:aload_3         
	//  313  856:iload           6
	//  314  858:invokestatic    #475 <Method Parcel SafeParcelReader.createParcel(Parcel, int)>
	//  315  861:astore_2        
														((Parcel) (map)).setDataPosition(0);
	//  316  862:aload_2         
	//  317  863:iconst_0        
	//  318  864:invokevirtual   #400 <Method void Parcel.setDataPosition(int)>
														zaa(stringbuilder, ((FastJsonResponse.Field) (obj)).zacq(), ((Parcel) (map)));
	//  319  867:aload_0         
	//  320  868:aload_1         
	//  321  869:aload           8
	//  322  871:invokevirtual   #403 <Method Map FastJsonResponse$Field.zacq()>
	//  323  874:aload_2         
	//  324  875:invokespecial   #405 <Method void zaa(StringBuilder, Map, Parcel)>
														break label1;
	//  325  878:goto            1201

													case 10: // '\n'
														map = ((Map) (SafeParcelReader.createBundle(parcel, k)));
	//  326  881:aload_3         
	//  327  882:iload           6
	//  328  884:invokestatic    #306 <Method Bundle SafeParcelReader.createBundle(Parcel, int)>
	//  329  887:astore_2        
														Object obj1 = ((Object) (((Bundle) (map)).keySet()));
	//  330  888:aload_2         
	//  331  889:invokevirtual   #310 <Method Set Bundle.keySet()>
	//  332  892:astore          8
														((Set) (obj1)).size();
	//  333  894:aload           8
	//  334  896:invokeinterface #478 <Method int Set.size()>
	//  335  901:pop             
														stringbuilder.append("{");
	//  336  902:aload_1         
	//  337  903:ldc2            #480 <String "{">
	//  338  906:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  339  909:pop             
														obj1 = ((Object) (((Set) (obj1)).iterator()));
	//  340  910:aload           8
	//  341  912:invokeinterface #147 <Method Iterator Set.iterator()>
	//  342  917:astore          8
														for(i = 1; ((Iterator) (obj1)).hasNext(); i = 0)
	//* 343  919:iconst_1        
	//* 344  920:istore          4
	//* 345  922:aload           8
	//* 346  924:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//* 347  929:ifeq            1020
														{
															String s = (String)((Iterator) (obj1)).next();
	//  348  932:aload           8
	//  349  934:invokeinterface #157 <Method Object Iterator.next()>
	//  350  939:checkcast       #88  <Class String>
	//  351  942:astore          9
															if(i == 0)
	//* 352  944:iload           4
	//* 353  946:ifne            957
																stringbuilder.append(",");
	//  354  949:aload_1         
	//  355  950:ldc2            #289 <String ",">
	//  356  953:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  357  956:pop             
															stringbuilder.append("\"");
	//  358  957:aload_1         
	//  359  958:ldc1            #226 <String "\"">
	//  360  960:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  361  963:pop             
															stringbuilder.append(s);
	//  362  964:aload_1         
	//  363  965:aload           9
	//  364  967:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  365  970:pop             
															stringbuilder.append("\"");
	//  366  971:aload_1         
	//  367  972:ldc1            #226 <String "\"">
	//  368  974:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  369  977:pop             
															stringbuilder.append(":");
	//  370  978:aload_1         
	//  371  979:ldc2            #482 <String ":">
	//  372  982:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  373  985:pop             
															stringbuilder.append("\"");
	//  374  986:aload_1         
	//  375  987:ldc1            #226 <String "\"">
	//  376  989:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  377  992:pop             
															stringbuilder.append(JsonUtils.escapeString(((Bundle) (map)).getString(s)));
	//  378  993:aload_1         
	//  379  994:aload_2         
	//  380  995:aload           9
	//  381  997:invokevirtual   #313 <Method String Bundle.getString(String)>
	//  382 1000:invokestatic    #243 <Method String JsonUtils.escapeString(String)>
	//  383 1003:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  384 1006:pop             
															stringbuilder.append("\"");
	//  385 1007:aload_1         
	//  386 1008:ldc1            #226 <String "\"">
	//  387 1010:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  388 1013:pop             
														}

	//  389 1014:iconst_0        
	//  390 1015:istore          4
	//* 391 1017:goto            922
														map = "}";
	//  392 1020:ldc2            #484 <String "}">
	//  393 1023:astore_2        
														break label12;
	//  394 1024:goto            1099

													case 9: // '\t'
														map = ((Map) (SafeParcelReader.createByteArray(parcel, k)));
	//  395 1027:aload_3         
	//  396 1028:iload           6
	//  397 1030:invokestatic    #324 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  398 1033:astore_2        
														stringbuilder.append("\"");
	//  399 1034:aload_1         
	//  400 1035:ldc1            #226 <String "\"">
	//  401 1037:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  402 1040:pop             
														map = ((Map) (Base64Utils.encodeUrlSafe(((byte []) (map)))));
	//  403 1041:aload_2         
	//  404 1042:invokestatic    #234 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//  405 1045:astore_2        
														break;
	//  406 1046:goto            1090

													case 8: // '\b'
														map = ((Map) (SafeParcelReader.createByteArray(parcel, k)));
	//  407 1049:aload_3         
	//  408 1050:iload           6
	//  409 1052:invokestatic    #324 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  410 1055:astore_2        
														stringbuilder.append("\"");
	//  411 1056:aload_1         
	//  412 1057:ldc1            #226 <String "\"">
	//  413 1059:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  414 1062:pop             
														map = ((Map) (Base64Utils.encode(((byte []) (map)))));
	//  415 1063:aload_2         
	//  416 1064:invokestatic    #237 <Method String Base64Utils.encode(byte[])>
	//  417 1067:astore_2        
														break;
	//  418 1068:goto            1090

													case 7: // '\007'
														map = ((Map) (SafeParcelReader.createString(parcel, k)));
	//  419 1071:aload_3         
	//  420 1072:iload           6
	//  421 1074:invokestatic    #328 <Method String SafeParcelReader.createString(Parcel, int)>
	//  422 1077:astore_2        
														stringbuilder.append("\"");
	//  423 1078:aload_1         
	//  424 1079:ldc1            #226 <String "\"">
	//  425 1081:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  426 1084:pop             
														map = ((Map) (JsonUtils.escapeString(((String) (map)))));
	//  427 1085:aload_2         
	//  428 1086:invokestatic    #243 <Method String JsonUtils.escapeString(String)>
	//  429 1089:astore_2        
														break;
													}
													stringbuilder.append(((String) (map)));
	//  430 1090:aload_1         
	//  431 1091:aload_2         
	//  432 1092:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  433 1095:pop             
													map = "\"";
	//  434 1096:ldc1            #226 <String "\"">
	//  435 1098:astore_2        
												}
												stringbuilder.append(((String) (map)));
	//  436 1099:aload_1         
	//  437 1100:aload_2         
	//  438 1101:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  439 1104:pop             
												break label1;
	//  440 1105:goto            1201
											}
											stringbuilder.append(SafeParcelReader.readBoolean(parcel, k));
	//  441 1108:aload_1         
	//  442 1109:aload_3         
	//  443 1110:iload           6
	//  444 1112:invokestatic    #332 <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//  445 1115:invokevirtual   #487 <Method StringBuilder StringBuilder.append(boolean)>
	//  446 1118:pop             
											break label1;
	//  447 1119:goto            1201
										}
										map = ((Map) (SafeParcelReader.createBigDecimal(parcel, k)));
	//  448 1122:aload_3         
	//  449 1123:iload           6
	//  450 1125:invokestatic    #341 <Method BigDecimal SafeParcelReader.createBigDecimal(Parcel, int)>
	//  451 1128:astore_2        
										break label5;
	//  452 1129:goto            1181
									}
									stringbuilder.append(SafeParcelReader.readDouble(parcel, k));
	//  453 1132:aload_1         
	//  454 1133:aload_3         
	//  455 1134:iload           6
	//  456 1136:invokestatic    #345 <Method double SafeParcelReader.readDouble(Parcel, int)>
	//  457 1139:invokevirtual   #490 <Method StringBuilder StringBuilder.append(double)>
	//  458 1142:pop             
									break label1;
	//  459 1143:goto            1201
								}
								stringbuilder.append(SafeParcelReader.readFloat(parcel, k));
	//  460 1146:aload_1         
	//  461 1147:aload_3         
	//  462 1148:iload           6
	//  463 1150:invokestatic    #354 <Method float SafeParcelReader.readFloat(Parcel, int)>
	//  464 1153:invokevirtual   #493 <Method StringBuilder StringBuilder.append(float)>
	//  465 1156:pop             
								break label1;
	//  466 1157:goto            1201
							}
							stringbuilder.append(SafeParcelReader.readLong(parcel, k));
	//  467 1160:aload_1         
	//  468 1161:aload_3         
	//  469 1162:iload           6
	//  470 1164:invokestatic    #363 <Method long SafeParcelReader.readLong(Parcel, int)>
	//  471 1167:invokevirtual   #496 <Method StringBuilder StringBuilder.append(long)>
	//  472 1170:pop             
							break label1;
	//  473 1171:goto            1201
						}
						map = ((Map) (SafeParcelReader.createBigInteger(parcel, k)));
	//  474 1174:aload_3         
	//  475 1175:iload           6
	//  476 1177:invokestatic    #372 <Method BigInteger SafeParcelReader.createBigInteger(Parcel, int)>
	//  477 1180:astore_2        
					}
					stringbuilder.append(((Object) (map)));
	//  478 1181:aload_1         
	//  479 1182:aload_2         
	//  480 1183:invokevirtual   #246 <Method StringBuilder StringBuilder.append(Object)>
	//  481 1186:pop             
					break label1;
	//  482 1187:goto            1201
				}
				stringbuilder.append(SafeParcelReader.readInt(parcel, k));
	//  483 1190:aload_1         
	//  484 1191:aload_3         
	//  485 1192:iload           6
	//  486 1194:invokestatic    #376 <Method int SafeParcelReader.readInt(Parcel, int)>
	//  487 1197:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//  488 1200:pop             
			}
			i = 1;
	//  489 1201:iconst_1        
	//  490 1202:istore          4
		} while(true);
	//  491 1204:goto            80
		if(parcel.dataPosition() != j)
	//* 492 1207:aload_3         
	//* 493 1208:invokevirtual   #277 <Method int Parcel.dataPosition()>
	//* 494 1211:iload           5
	//* 495 1213:icmpeq          1254
		{
			stringbuilder = new StringBuilder(37);
	//  496 1216:new             #196 <Class StringBuilder>
	//  497 1219:dup             
	//  498 1220:bipush          37
	//  499 1222:invokespecial   #199 <Method void StringBuilder(int)>
	//  500 1225:astore_1        
			stringbuilder.append("Overread allowed size end=");
	//  501 1226:aload_1         
	//  502 1227:ldc2            #498 <String "Overread allowed size end=">
	//  503 1230:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  504 1233:pop             
			stringbuilder.append(j);
	//  505 1234:aload_1         
	//  506 1235:iload           5
	//  507 1237:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//  508 1240:pop             
			throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(stringbuilder.toString(), parcel);
	//  509 1241:new             #500 <Class com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException>
	//  510 1244:dup             
	//  511 1245:aload_1         
	//  512 1246:invokevirtual   #213 <Method String StringBuilder.toString()>
	//  513 1249:aload_3         
	//  514 1250:invokespecial   #503 <Method void com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(String, Parcel)>
	//  515 1253:athrow          
		} else
		{
			stringbuilder.append('}');
	//  516 1254:aload_1         
	//  517 1255:bipush          125
	//  518 1257:invokevirtual   #268 <Method StringBuilder StringBuilder.append(char)>
	//  519 1260:pop             
			return;
	//  520 1261:return          
		}
	}

	private final void zab(FastJsonResponse.Field field)
	{
		boolean flag;
		if(field.zapv != -1)
	//*   0    0:aload_1         
	//*   1    1:getfield        #508 <Field int FastJsonResponse$Field.zapv>
	//*   2    4:iconst_m1       
	//*   3    5:icmpeq          13
			flag = true;
	//    4    8:iconst_1        
	//    5    9:istore_2        
		else
	//*   6   10:goto            15
			flag = false;
	//    7   13:iconst_0        
	//    8   14:istore_2        
		if(!flag)
	//*   9   15:iload_2         
	//*  10   16:ifne            30
			throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
	//   11   19:new             #188 <Class IllegalStateException>
	//   12   22:dup             
	//   13   23:ldc2            #510 <String "Field does not have a valid safe parcelable field id.">
	//   14   26:invokespecial   #393 <Method void IllegalStateException(String)>
	//   15   29:athrow          
		if(zara == null)
	//*  16   30:aload_0         
	//*  17   31:getfield        #59  <Field Parcel zara>
	//*  18   34:ifnonnull       48
			throw new IllegalStateException("Internal Parcel object is null.");
	//   19   37:new             #188 <Class IllegalStateException>
	//   20   40:dup             
	//   21   41:ldc2            #512 <String "Internal Parcel object is null.">
	//   22   44:invokespecial   #393 <Method void IllegalStateException(String)>
	//   23   47:athrow          
		switch(zarc)
	//*  24   48:aload_0         
	//*  25   49:getfield        #73  <Field int zarc>
		{
	//*  26   52:tableswitch     0 2: default 80
	//	               0 103
	//	               1 102
	//	               2 91
		default:
			throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
	//   27   80:new             #188 <Class IllegalStateException>
	//   28   83:dup             
	//   29   84:ldc2            #514 <String "Unknown parse state in SafeParcelResponse.">
	//   30   87:invokespecial   #393 <Method void IllegalStateException(String)>
	//   31   90:athrow          

		case 2: // '\002'
			throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
	//   32   91:new             #188 <Class IllegalStateException>
	//   33   94:dup             
	//   34   95:ldc2            #516 <String "Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.">
	//   35   98:invokespecial   #393 <Method void IllegalStateException(String)>
	//   36  101:athrow          

		case 1: // '\001'
			return;
	//   37  102:return          

		case 0: // '\0'
			zard = SafeParcelWriter.beginObjectHeader(zara);
	//   38  103:aload_0         
	//   39  104:aload_0         
	//   40  105:getfield        #59  <Field Parcel zara>
	//   41  108:invokestatic    #521 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   42  111:putfield        #523 <Field int zard>
			break;
		}
		zarc = 1;
	//   43  114:aload_0         
	//   44  115:iconst_1        
	//   45  116:putfield        #73  <Field int zarc>
	//   46  119:return          
	}

	private final void zab(StringBuilder stringbuilder, FastJsonResponse.Field field, Object obj)
	{
		if(field.zapr)
	//*   0    0:aload_2         
	//*   1    1:getfield        #527 <Field boolean FastJsonResponse$Field.zapr>
	//*   2    4:ifeq            81
		{
			obj = ((Object) ((ArrayList)obj));
	//    3    7:aload_3         
	//    4    8:checkcast       #529 <Class ArrayList>
	//    5   11:astore_3        
			stringbuilder.append("[");
	//    6   12:aload_1         
	//    7   13:ldc2            #390 <String "[">
	//    8   16:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//    9   19:pop             
			int j = ((ArrayList) (obj)).size();
	//   10   20:aload_3         
	//   11   21:invokevirtual   #530 <Method int ArrayList.size()>
	//   12   24:istore          5
			for(int i = 0; i < j; i++)
	//*  13   26:iconst_0        
	//*  14   27:istore          4
	//*  15   29:iload           4
	//*  16   31:iload           5
	//*  17   33:icmpge          72
			{
				if(i != 0)
	//*  18   36:iload           4
	//*  19   38:ifeq            49
					stringbuilder.append(",");
	//   20   41:aload_1         
	//   21   42:ldc2            #289 <String ",">
	//   22   45:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   23   48:pop             
				zaa(stringbuilder, field.zapq, ((ArrayList) (obj)).get(i));
	//   24   49:aload_1         
	//   25   50:aload_2         
	//   26   51:getfield        #533 <Field int FastJsonResponse$Field.zapq>
	//   27   54:aload_3         
	//   28   55:iload           4
	//   29   57:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   30   60:invokestatic    #536 <Method void zaa(StringBuilder, int, Object)>
			}

	//   31   63:iload           4
	//   32   65:iconst_1        
	//   33   66:iadd            
	//   34   67:istore          4
	//*  35   69:goto            29
			stringbuilder.append("]");
	//   36   72:aload_1         
	//   37   73:ldc2            #469 <String "]">
	//   38   76:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   39   79:pop             
			return;
	//   40   80:return          
		} else
		{
			zaa(stringbuilder, field.zapq, obj);
	//   41   81:aload_1         
	//   42   82:aload_2         
	//   43   83:getfield        #533 <Field int FastJsonResponse$Field.zapq>
	//   44   86:aload_3         
	//   45   87:invokestatic    #536 <Method void zaa(StringBuilder, int, Object)>
			return;
	//   46   90:return          
		}
	}

	private final Parcel zacu()
	{
		switch(zarc)
	//*   0    0:aload_0         
	//*   1    1:getfield        #73  <Field int zarc>
		{
	//*   2    4:tableswitch     0 1: default 28
	//	               0 31
	//	               1 42
	//*   3   28:goto            58
		case 0: // '\0'
			zard = SafeParcelWriter.beginObjectHeader(zara);
	//    4   31:aload_0         
	//    5   32:aload_0         
	//    6   33:getfield        #59  <Field Parcel zara>
	//    7   36:invokestatic    #521 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    8   39:putfield        #523 <Field int zard>
			// fall through

		case 1: // '\001'
			SafeParcelWriter.finishObjectHeader(zara, zard);
	//    9   42:aload_0         
	//   10   43:getfield        #59  <Field Parcel zara>
	//   11   46:aload_0         
	//   12   47:getfield        #523 <Field int zard>
	//   13   50:invokestatic    #541 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
			zarc = 2;
	//   14   53:aload_0         
	//   15   54:iconst_2        
	//   16   55:putfield        #73  <Field int zarc>
			// fall through

		default:
			return zara;
	//   17   58:aload_0         
	//   18   59:getfield        #59  <Field Parcel zara>
	//   19   62:areturn         
		}
	}

	public void addConcreteTypeArrayInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		s = ((String) (new ArrayList()));
	//    3    5:new             #529 <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #546 <Method void ArrayList()>
	//    6   12:astore_2        
		arraylist.size();
	//    7   13:aload_3         
	//    8   14:invokevirtual   #530 <Method int ArrayList.size()>
	//    9   17:pop             
		arraylist = (ArrayList)arraylist;
	//   10   18:aload_3         
	//   11   19:checkcast       #529 <Class ArrayList>
	//   12   22:astore_3        
		int j = arraylist.size();
	//   13   23:aload_3         
	//   14   24:invokevirtual   #530 <Method int ArrayList.size()>
	//   15   27:istore          5
		for(int i = 0; i < j;)
	//*  16   29:iconst_0        
	//*  17   30:istore          4
	//*  18   32:iload           4
	//*  19   34:iload           5
	//*  20   36:icmpge          72
		{
			Object obj = arraylist.get(i);
	//   21   39:aload_3         
	//   22   40:iload           4
	//   23   42:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   24   45:astore          6
			i++;
	//   25   47:iload           4
	//   26   49:iconst_1        
	//   27   50:iadd            
	//   28   51:istore          4
			((ArrayList) (s)).add(((Object) (((SafeParcelResponse)(FastJsonResponse)obj).zacu())));
	//   29   53:aload_2         
	//   30   54:aload           6
	//   31   56:checkcast       #128 <Class FastJsonResponse>
	//   32   59:checkcast       #2   <Class SafeParcelResponse>
	//   33   62:invokespecial   #548 <Method Parcel zacu()>
	//   34   65:invokevirtual   #552 <Method boolean ArrayList.add(Object)>
	//   35   68:pop             
		}

	//*  36   69:goto            32
		SafeParcelWriter.writeParcelList(zara, field.getSafeParcelableFieldId(), ((java.util.List) (s)), true);
	//   37   72:aload_0         
	//   38   73:getfield        #59  <Field Parcel zara>
	//   39   76:aload_1         
	//   40   77:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   41   80:aload_2         
	//   42   81:iconst_1        
	//   43   82:invokestatic    #556 <Method void SafeParcelWriter.writeParcelList(Parcel, int, java.util.List, boolean)>
	//   44   85:return          
	}

	public void addConcreteTypeInternal(FastJsonResponse.Field field, String s, FastJsonResponse fastjsonresponse)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		s = ((String) (((SafeParcelResponse)fastjsonresponse).zacu()));
	//    3    5:aload_3         
	//    4    6:checkcast       #2   <Class SafeParcelResponse>
	//    5    9:invokespecial   #548 <Method Parcel zacu()>
	//    6   12:astore_2        
		SafeParcelWriter.writeParcel(zara, field.getSafeParcelableFieldId(), ((Parcel) (s)), true);
	//    7   13:aload_0         
	//    8   14:getfield        #59  <Field Parcel zara>
	//    9   17:aload_1         
	//   10   18:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   11   21:aload_2         
	//   12   22:iconst_1        
	//   13   23:invokestatic    #563 <Method void SafeParcelWriter.writeParcel(Parcel, int, Parcel, boolean)>
	//   14   26:return          
	}

	public Map getFieldMappings()
	{
		if(zapy == null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #63  <Field zak zapy>
	//*   2    4:ifnonnull       9
			return null;
	//    3    7:aconst_null     
	//    4    8:areturn         
		else
			return zapy.zai(mClassName);
	//    5    9:aload_0         
	//    6   10:getfield        #63  <Field zak zapy>
	//    7   13:aload_0         
	//    8   14:getfield        #65  <Field String mClassName>
	//    9   17:invokevirtual   #568 <Method Map zak.zai(String)>
	//   10   20:areturn         
	}

	public Object getValueObject(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #407 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #573 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #410 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	public boolean isPrimitiveFieldSet(String s)
	{
		throw new UnsupportedOperationException("Converting to JSON does not require this method.");
	//    0    0:new             #407 <Class UnsupportedOperationException>
	//    1    3:dup             
	//    2    4:ldc2            #573 <String "Converting to JSON does not require this method.">
	//    3    7:invokespecial   #410 <Method void UnsupportedOperationException(String)>
	//    4   10:athrow          
	}

	protected void setBooleanInternal(FastJsonResponse.Field field, String s, boolean flag)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeBoolean(zara, field.getSafeParcelableFieldId(), flag);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:iload_3         
	//    8   14:invokestatic    #581 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
	//    9   17:return          
	}

	protected void setDecodedBytesInternal(FastJsonResponse.Field field, String s, byte abyte0[])
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeByteArray(zara, field.getSafeParcelableFieldId(), abyte0, true);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #588 <Method void SafeParcelWriter.writeByteArray(Parcel, int, byte[], boolean)>
	//   10   18:return          
	}

	protected void setIntegerInternal(FastJsonResponse.Field field, String s, int i)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeInt(zara, field.getSafeParcelableFieldId(), i);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:iload_3         
	//    8   14:invokestatic    #595 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
	//    9   17:return          
	}

	protected void setLongInternal(FastJsonResponse.Field field, String s, long l)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeLong(zara, field.getSafeParcelableFieldId(), l);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:lload_3         
	//    8   14:invokestatic    #602 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
	//    9   17:return          
	}

	protected void setStringInternal(FastJsonResponse.Field field, String s, String s1)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeString(zara, field.getSafeParcelableFieldId(), s1, true);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #609 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
	//   10   18:return          
	}

	protected void setStringsInternal(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #530 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new String[j]));
	//    6   11:iload           5
	//    7   13:anewarray       String[]
	//    8   16:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore          4
	//*  11   20:iload           4
	//*  12   22:iload           5
	//*  13   24:icmpge          49
			s[i] = ((/*<invalid signature>*/java.lang.Object) ((String)arraylist.get(i)));
	//   14   27:aload_2         
	//   15   28:iload           4
	//   16   30:aload_3         
	//   17   31:iload           4
	//   18   33:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   19   36:checkcast       #88  <Class String>
	//   20   39:aastore         

	//   21   40:iload           4
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          4
	//*  25   46:goto            20
		SafeParcelWriter.writeStringArray(zara, field.getSafeParcelableFieldId(), ((String []) (s)), true);
	//   26   49:aload_0         
	//   27   50:getfield        #59  <Field Parcel zara>
	//   28   53:aload_1         
	//   29   54:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #614 <Method void SafeParcelWriter.writeStringArray(Parcel, int, String[], boolean)>
	//   33   62:return          
	}

	public String toString()
	{
		Preconditions.checkNotNull(((Object) (zapy)), "Cannot convert to JSON on client side.");
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field zak zapy>
	//    2    4:ldc2            #617 <String "Cannot convert to JSON on client side.">
	//    3    7:invokestatic    #619 <Method Object Preconditions.checkNotNull(Object, Object)>
	//    4   10:pop             
		Parcel parcel = zacu();
	//    5   11:aload_0         
	//    6   12:invokespecial   #548 <Method Parcel zacu()>
	//    7   15:astore_1        
		parcel.setDataPosition(0);
	//    8   16:aload_1         
	//    9   17:iconst_0        
	//   10   18:invokevirtual   #400 <Method void Parcel.setDataPosition(int)>
		StringBuilder stringbuilder = new StringBuilder(100);
	//   11   21:new             #196 <Class StringBuilder>
	//   12   24:dup             
	//   13   25:bipush          100
	//   14   27:invokespecial   #199 <Method void StringBuilder(int)>
	//   15   30:astore_2        
		zaa(stringbuilder, zapy.zai(mClassName), parcel);
	//   16   31:aload_0         
	//   17   32:aload_2         
	//   18   33:aload_0         
	//   19   34:getfield        #63  <Field zak zapy>
	//   20   37:aload_0         
	//   21   38:getfield        #65  <Field String mClassName>
	//   22   41:invokevirtual   #568 <Method Map zak.zai(String)>
	//   23   44:aload_1         
	//   24   45:invokespecial   #405 <Method void zaa(StringBuilder, Map, Parcel)>
		return stringbuilder.toString();
	//   25   48:aload_2         
	//   26   49:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   27   52:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #521 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeInt(parcel, 1, zale);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:getfield        #49  <Field int zale>
	//    7   11:invokestatic    #595 <Method void SafeParcelWriter.writeInt(Parcel, int, int)>
		SafeParcelWriter.writeParcel(parcel, 2, zacu(), false);
	//    8   14:aload_1         
	//    9   15:iconst_2        
	//   10   16:aload_0         
	//   11   17:invokespecial   #548 <Method Parcel zacu()>
	//   12   20:iconst_0        
	//   13   21:invokestatic    #563 <Method void SafeParcelWriter.writeParcel(Parcel, int, Parcel, boolean)>
		zak zak1;
		switch(zarb)
	//*  14   24:aload_0         
	//*  15   25:getfield        #61  <Field int zarb>
		{
	//*  16   28:tableswitch     0 2: default 56
	//	               0 106
	//	               1 97
	//	               2 97
		default:
			i = zarb;
	//   17   56:aload_0         
	//   18   57:getfield        #61  <Field int zarb>
	//   19   60:istore_2        
			parcel = ((Parcel) (new StringBuilder(34)));
	//   20   61:new             #196 <Class StringBuilder>
	//   21   64:dup             
	//   22   65:bipush          34
	//   23   67:invokespecial   #199 <Method void StringBuilder(int)>
	//   24   70:astore_1        
			((StringBuilder) (parcel)).append("Invalid creation type: ");
	//   25   71:aload_1         
	//   26   72:ldc2            #621 <String "Invalid creation type: ">
	//   27   75:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   28   78:pop             
			((StringBuilder) (parcel)).append(i);
	//   29   79:aload_1         
	//   30   80:iload_2         
	//   31   81:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//   32   84:pop             
			throw new IllegalStateException(((StringBuilder) (parcel)).toString());
	//   33   85:new             #188 <Class IllegalStateException>
	//   34   88:dup             
	//   35   89:aload_1         
	//   36   90:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   37   93:invokespecial   #393 <Method void IllegalStateException(String)>
	//   38   96:athrow          

		case 1: // '\001'
		case 2: // '\002'
			zak1 = zapy;
	//   39   97:aload_0         
	//   40   98:getfield        #63  <Field zak zapy>
	//   41  101:astore          4
			break;

	//*  42  103:goto            109
		case 0: // '\0'
			zak1 = null;
	//   43  106:aconst_null     
	//   44  107:astore          4
			break;
		}
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zak1)), i, false);
	//   45  109:aload_1         
	//   46  110:iconst_3        
	//   47  111:aload           4
	//   48  113:iload_2         
	//   49  114:iconst_0        
	//   50  115:invokestatic    #625 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   51  118:aload_1         
	//   52  119:iload_3         
	//   53  120:invokestatic    #541 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   54  123:return          
	}

	protected final void zaa(FastJsonResponse.Field field, String s, double d)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeDouble(zara, field.getSafeParcelableFieldId(), d);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:dload_3         
	//    8   14:invokestatic    #630 <Method void SafeParcelWriter.writeDouble(Parcel, int, double)>
	//    9   17:return          
	}

	protected final void zaa(FastJsonResponse.Field field, String s, float f)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeFloat(zara, field.getSafeParcelableFieldId(), f);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:fload_3         
	//    8   14:invokestatic    #636 <Method void SafeParcelWriter.writeFloat(Parcel, int, float)>
	//    9   17:return          
	}

	protected final void zaa(FastJsonResponse.Field field, String s, BigDecimal bigdecimal)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeBigDecimal(zara, field.getSafeParcelableFieldId(), bigdecimal, true);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #642 <Method void SafeParcelWriter.writeBigDecimal(Parcel, int, BigDecimal, boolean)>
	//   10   18:return          
	}

	protected final void zaa(FastJsonResponse.Field field, String s, BigInteger biginteger)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		SafeParcelWriter.writeBigInteger(zara, field.getSafeParcelableFieldId(), biginteger, true);
	//    3    5:aload_0         
	//    4    6:getfield        #59  <Field Parcel zara>
	//    5    9:aload_1         
	//    6   10:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//    7   13:aload_3         
	//    8   14:iconst_1        
	//    9   15:invokestatic    #648 <Method void SafeParcelWriter.writeBigInteger(Parcel, int, BigInteger, boolean)>
	//   10   18:return          
	}

	protected final void zaa(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #530 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new int[j]));
	//    6   11:iload           5
	//    7   13:newarray        int[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((Integer)arraylist.get(i)).intValue();
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #378 <Class Integer>
	//   20   38:invokevirtual   #652 <Method int Integer.intValue()>
	//   21   41:iastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeIntArray(zara, field.getSafeParcelableFieldId(), ((int []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #59  <Field Parcel zara>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #656 <Method void SafeParcelWriter.writeIntArray(Parcel, int, int[], boolean)>
	//   34   64:return          
	}

	protected final void zaa(FastJsonResponse.Field field, String s, Map map)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		s = ((String) (new Bundle()));
	//    3    5:new             #309 <Class Bundle>
	//    4    8:dup             
	//    5    9:invokespecial   #659 <Method void Bundle()>
	//    6   12:astore_2        
		String s1;
		for(Iterator iterator = map.keySet().iterator(); iterator.hasNext(); ((Bundle) (s)).putString(s1, (String)map.get(((Object) (s1)))))
	//*   7   13:aload_3         
	//*   8   14:invokeinterface #141 <Method Set Map.keySet()>
	//*   9   19:invokeinterface #147 <Method Iterator Set.iterator()>
	//*  10   24:astore          4
	//*  11   26:aload           4
	//*  12   28:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//*  13   33:ifeq            68
			s1 = (String)iterator.next();
	//   14   36:aload           4
	//   15   38:invokeinterface #157 <Method Object Iterator.next()>
	//   16   43:checkcast       #88  <Class String>
	//   17   46:astore          5

	//   18   48:aload_2         
	//   19   49:aload           5
	//   20   51:aload_3         
	//   21   52:aload           5
	//   22   54:invokeinterface #160 <Method Object Map.get(Object)>
	//   23   59:checkcast       #88  <Class String>
	//   24   62:invokevirtual   #663 <Method void Bundle.putString(String, String)>
	//*  25   65:goto            26
		SafeParcelWriter.writeBundle(zara, field.getSafeParcelableFieldId(), ((Bundle) (s)), true);
	//   26   68:aload_0         
	//   27   69:getfield        #59  <Field Parcel zara>
	//   28   72:aload_1         
	//   29   73:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   30   76:aload_2         
	//   31   77:iconst_1        
	//   32   78:invokestatic    #667 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
	//   33   81:return          
	}

	protected final void zab(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #530 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new BigInteger[j]));
	//    6   11:iload           5
	//    7   13:anewarray       BigInteger[]
	//    8   16:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore          4
	//*  11   20:iload           4
	//*  12   22:iload           5
	//*  13   24:icmpge          49
			s[i] = ((/*<invalid signature>*/java.lang.Object) ((BigInteger)arraylist.get(i)));
	//   14   27:aload_2         
	//   15   28:iload           4
	//   16   30:aload_3         
	//   17   31:iload           4
	//   18   33:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   19   36:checkcast       #670 <Class BigInteger>
	//   20   39:aastore         

	//   21   40:iload           4
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          4
	//*  25   46:goto            20
		SafeParcelWriter.writeBigIntegerArray(zara, field.getSafeParcelableFieldId(), ((BigInteger []) (s)), true);
	//   26   49:aload_0         
	//   27   50:getfield        #59  <Field Parcel zara>
	//   28   53:aload_1         
	//   29   54:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #674 <Method void SafeParcelWriter.writeBigIntegerArray(Parcel, int, BigInteger[], boolean)>
	//   33   62:return          
	}

	protected final void zac(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #530 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new long[j]));
	//    6   11:iload           5
	//    7   13:newarray        long[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((Long)arraylist.get(i)).longValue();
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #365 <Class Long>
	//   20   38:invokevirtual   #680 <Method long Long.longValue()>
	//   21   41:lastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeLongArray(zara, field.getSafeParcelableFieldId(), ((long []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #59  <Field Parcel zara>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #684 <Method void SafeParcelWriter.writeLongArray(Parcel, int, long[], boolean)>
	//   34   64:return          
	}

	protected final void zad(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #530 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new float[j]));
	//    6   11:iload           5
	//    7   13:newarray        float[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((Float)arraylist.get(i)).floatValue();
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #356 <Class Float>
	//   20   38:invokevirtual   #690 <Method float Float.floatValue()>
	//   21   41:fastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeFloatArray(zara, field.getSafeParcelableFieldId(), ((float []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #59  <Field Parcel zara>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #694 <Method void SafeParcelWriter.writeFloatArray(Parcel, int, float[], boolean)>
	//   34   64:return          
	}

	protected final void zae(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #530 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new double[j]));
	//    6   11:iload           5
	//    7   13:newarray        double[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((Double)arraylist.get(i)).doubleValue();
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #347 <Class Double>
	//   20   38:invokevirtual   #700 <Method double Double.doubleValue()>
	//   21   41:dastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeDoubleArray(zara, field.getSafeParcelableFieldId(), ((double []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #59  <Field Parcel zara>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #704 <Method void SafeParcelWriter.writeDoubleArray(Parcel, int, double[], boolean)>
	//   34   64:return          
	}

	protected final void zaf(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #530 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new BigDecimal[j]));
	//    6   11:iload           5
	//    7   13:anewarray       BigDecimal[]
	//    8   16:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   17:iconst_0        
	//*  10   18:istore          4
	//*  11   20:iload           4
	//*  12   22:iload           5
	//*  13   24:icmpge          49
			s[i] = ((/*<invalid signature>*/java.lang.Object) ((BigDecimal)arraylist.get(i)));
	//   14   27:aload_2         
	//   15   28:iload           4
	//   16   30:aload_3         
	//   17   31:iload           4
	//   18   33:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   19   36:checkcast       #708 <Class BigDecimal>
	//   20   39:aastore         

	//   21   40:iload           4
	//   22   42:iconst_1        
	//   23   43:iadd            
	//   24   44:istore          4
	//*  25   46:goto            20
		SafeParcelWriter.writeBigDecimalArray(zara, field.getSafeParcelableFieldId(), ((BigDecimal []) (s)), true);
	//   26   49:aload_0         
	//   27   50:getfield        #59  <Field Parcel zara>
	//   28   53:aload_1         
	//   29   54:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   30   57:aload_2         
	//   31   58:iconst_1        
	//   32   59:invokestatic    #712 <Method void SafeParcelWriter.writeBigDecimalArray(Parcel, int, BigDecimal[], boolean)>
	//   33   62:return          
	}

	protected final void zag(FastJsonResponse.Field field, String s, ArrayList arraylist)
	{
		zab(field);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #545 <Method void zab(FastJsonResponse$Field)>
		int j = arraylist.size();
	//    3    5:aload_3         
	//    4    6:invokevirtual   #530 <Method int ArrayList.size()>
	//    5    9:istore          5
		s = ((String) (new boolean[j]));
	//    6   11:iload           5
	//    7   13:newarray        boolean[]
	//    8   15:astore_2        
		for(int i = 0; i < j; i++)
	//*   9   16:iconst_0        
	//*  10   17:istore          4
	//*  11   19:iload           4
	//*  12   21:iload           5
	//*  13   23:icmpge          51
			s[i] = ((byte) (((Boolean)arraylist.get(i)).booleanValue()));
	//   14   26:aload_2         
	//   15   27:iload           4
	//   16   29:aload_3         
	//   17   30:iload           4
	//   18   32:invokevirtual   #534 <Method Object ArrayList.get(int)>
	//   19   35:checkcast       #334 <Class Boolean>
	//   20   38:invokevirtual   #717 <Method boolean Boolean.booleanValue()>
	//   21   41:bastore         

	//   22   42:iload           4
	//   23   44:iconst_1        
	//   24   45:iadd            
	//   25   46:istore          4
	//*  26   48:goto            19
		SafeParcelWriter.writeBooleanArray(zara, field.getSafeParcelableFieldId(), ((boolean []) (s)), true);
	//   27   51:aload_0         
	//   28   52:getfield        #59  <Field Parcel zara>
	//   29   55:aload_1         
	//   30   56:invokevirtual   #261 <Method int FastJsonResponse$Field.getSafeParcelableFieldId()>
	//   31   59:aload_2         
	//   32   60:iconst_1        
	//   33   61:invokestatic    #721 <Method void SafeParcelWriter.writeBooleanArray(Parcel, int, boolean[], boolean)>
	//   34   64:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zap();
	private final String mClassName;
	private final int zale;
	private final zak zapy;
	private final Parcel zara;
	private final int zarb;
	private int zarc;
	private int zard;

	static 
	{
	//    0    0:new             #37  <Class zap>
	//    1    3:dup             
	//    2    4:invokespecial   #40  <Method void zap()>
	//    3    7:putstatic       #42  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
