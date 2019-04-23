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
		parcel = ((Parcel) (zapy));
	//   16   30:aload_0         
	//   17   31:getfield        #63  <Field zak zapy>
	//   18   34:astore_2        
		if(parcel == null)
	//*  19   35:aload_2         
	//*  20   36:ifnonnull       47
			mClassName = null;
	//   21   39:aload_0         
	//   22   40:aconst_null     
	//   23   41:putfield        #65  <Field String mClassName>
		else
	//*  24   44:goto            55
			mClassName = ((zak) (parcel)).zact();
	//   25   47:aload_0         
	//   26   48:aload_2         
	//   27   49:invokevirtual   #71  <Method String zak.zact()>
	//   28   52:putfield        #65  <Field String mClassName>
		zarc = 2;
	//   29   55:aload_0         
	//   30   56:iconst_2        
	//   31   57:putfield        #73  <Field int zarc>
	//   32   60:return          
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
		do
		{
			if(parcel.dataPosition() >= j)
				break;
	//   32   80:aload_3         
	//   33   81:invokevirtual   #277 <Method int Parcel.dataPosition()>
	//   34   84:iload           5
	//   35   86:icmpge          1305
			int k = SafeParcelReader.readHeader(parcel);
	//   36   89:aload_3         
	//   37   90:invokestatic    #280 <Method int SafeParcelReader.readHeader(Parcel)>
	//   38   93:istore          6
			map = ((Map) ((java.util.Map.Entry)sparsearray.get(SafeParcelReader.getFieldId(k))));
	//   39   95:aload           7
	//   40   97:iload           6
	//   41   99:invokestatic    #284 <Method int SafeParcelReader.getFieldId(int)>
	//   42  102:invokevirtual   #287 <Method Object SparseArray.get(int)>
	//   43  105:checkcast       #255 <Class java.util.Map$Entry>
	//   44  108:astore_2        
			if(map != null)
	//*  45  109:aload_2         
	//*  46  110:ifnull          80
			{
				if(i != 0)
	//*  47  113:iload           4
	//*  48  115:ifeq            126
					stringbuilder.append(",");
	//   49  118:aload_1         
	//   50  119:ldc2            #289 <String ",">
	//   51  122:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   52  125:pop             
				String s = (String)((java.util.Map.Entry) (map)).getKey();
	//   53  126:aload_2         
	//   54  127:invokeinterface #292 <Method Object java.util.Map$Entry.getKey()>
	//   55  132:checkcast       #88  <Class String>
	//   56  135:astore          8
				map = ((Map) ((FastJsonResponse.Field)((java.util.Map.Entry) (map)).getValue()));
	//   57  137:aload_2         
	//   58  138:invokeinterface #258 <Method Object java.util.Map$Entry.getValue()>
	//   59  143:checkcast       #162 <Class FastJsonResponse$Field>
	//   60  146:astore_2        
				stringbuilder.append("\"");
	//   61  147:aload_1         
	//   62  148:ldc1            #226 <String "\"">
	//   63  150:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   64  153:pop             
				stringbuilder.append(s);
	//   65  154:aload_1         
	//   66  155:aload           8
	//   67  157:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   68  160:pop             
				stringbuilder.append("\":");
	//   69  161:aload_1         
	//   70  162:ldc2            #294 <String "\":">
	//   71  165:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   72  168:pop             
				if(((FastJsonResponse.Field) (map)).zacn())
	//*  73  169:aload_2         
	//*  74  170:invokevirtual   #297 <Method boolean FastJsonResponse$Field.zacn()>
	//*  75  173:ifeq            567
					switch(((FastJsonResponse.Field) (map)).zaps)
	//*  76  176:aload_2         
	//*  77  177:getfield        #300 <Field int FastJsonResponse$Field.zaps>
					{
	//*  78  180:tableswitch     0 11: default 244
	//	               0 545
	//	               1 526
	//	               2 504
	//	               3 482
	//	               4 460
	//	               5 441
	//	               6 419
	//	               7 400
	//	               8 381
	//	               9 381
	//	               10 297
	//	               11 287
					default:
						i = ((FastJsonResponse.Field) (map)).zaps;
	//   79  244:aload_2         
	//   80  245:getfield        #300 <Field int FastJsonResponse$Field.zaps>
	//   81  248:istore          4
						stringbuilder = new StringBuilder(36);
	//   82  250:new             #196 <Class StringBuilder>
	//   83  253:dup             
	//   84  254:bipush          36
	//   85  256:invokespecial   #199 <Method void StringBuilder(int)>
	//   86  259:astore_1        
						stringbuilder.append("Unknown field out type = ");
	//   87  260:aload_1         
	//   88  261:ldc2            #302 <String "Unknown field out type = ">
	//   89  264:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   90  267:pop             
						stringbuilder.append(i);
	//   91  268:aload_1         
	//   92  269:iload           4
	//   93  271:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//   94  274:pop             
						throw new IllegalArgumentException(stringbuilder.toString());
	//   95  275:new             #210 <Class IllegalArgumentException>
	//   96  278:dup             
	//   97  279:aload_1         
	//   98  280:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   99  283:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//  100  286:athrow          

					case 11: // '\013'
						throw new IllegalArgumentException("Method does not accept concrete type.");
	//  101  287:new             #210 <Class IllegalArgumentException>
	//  102  290:dup             
	//  103  291:ldc1            #216 <String "Method does not accept concrete type.">
	//  104  293:invokespecial   #214 <Method void IllegalArgumentException(String)>
	//  105  296:athrow          

					case 10: // '\n'
						Bundle bundle = SafeParcelReader.createBundle(parcel, k);
	//  106  297:aload_3         
	//  107  298:iload           6
	//  108  300:invokestatic    #306 <Method Bundle SafeParcelReader.createBundle(Parcel, int)>
	//  109  303:astore          8
						HashMap hashmap = new HashMap();
	//  110  305:new             #218 <Class HashMap>
	//  111  308:dup             
	//  112  309:invokespecial   #307 <Method void HashMap()>
	//  113  312:astore          9
						String s2;
						for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(((Object) (s2)), ((Object) (bundle.getString(s2)))))
	//* 114  314:aload           8
	//* 115  316:invokevirtual   #310 <Method Set Bundle.keySet()>
	//* 116  319:invokeinterface #147 <Method Iterator Set.iterator()>
	//* 117  324:astore          10
	//* 118  326:aload           10
	//* 119  328:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//* 120  333:ifeq            366
							s2 = (String)iterator.next();
	//  121  336:aload           10
	//  122  338:invokeinterface #157 <Method Object Iterator.next()>
	//  123  343:checkcast       #88  <Class String>
	//  124  346:astore          11

	//  125  348:aload           9
	//  126  350:aload           11
	//  127  352:aload           8
	//  128  354:aload           11
	//  129  356:invokevirtual   #313 <Method String Bundle.getString(String)>
	//  130  359:invokevirtual   #316 <Method Object HashMap.put(Object, Object)>
	//  131  362:pop             
	//* 132  363:goto            326
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (hashmap))));
	//  133  366:aload_0         
	//  134  367:aload_1         
	//  135  368:aload_2         
	//  136  369:aload_2         
	//  137  370:aload           9
	//  138  372:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  139  375:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 140  378:goto            1299
					case 8: // '\b'
					case 9: // '\t'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (SafeParcelReader.createByteArray(parcel, k)))));
	//  141  381:aload_0         
	//  142  382:aload_1         
	//  143  383:aload_2         
	//  144  384:aload_2         
	//  145  385:aload_3         
	//  146  386:iload           6
	//  147  388:invokestatic    #327 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  148  391:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  149  394:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 150  397:goto            1299
					case 7: // '\007'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (SafeParcelReader.createString(parcel, k)))));
	//  151  400:aload_0         
	//  152  401:aload_1         
	//  153  402:aload_2         
	//  154  403:aload_2         
	//  155  404:aload_3         
	//  156  405:iload           6
	//  157  407:invokestatic    #331 <Method String SafeParcelReader.createString(Parcel, int)>
	//  158  410:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  159  413:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 160  416:goto            1299
					case 6: // '\006'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (Boolean.valueOf(SafeParcelReader.readBoolean(parcel, k))))));
	//  161  419:aload_0         
	//  162  420:aload_1         
	//  163  421:aload_2         
	//  164  422:aload_2         
	//  165  423:aload_3         
	//  166  424:iload           6
	//  167  426:invokestatic    #335 <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//  168  429:invokestatic    #340 <Method Boolean Boolean.valueOf(boolean)>
	//  169  432:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  170  435:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 171  438:goto            1299
					case 5: // '\005'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (SafeParcelReader.createBigDecimal(parcel, k)))));
	//  172  441:aload_0         
	//  173  442:aload_1         
	//  174  443:aload_2         
	//  175  444:aload_2         
	//  176  445:aload_3         
	//  177  446:iload           6
	//  178  448:invokestatic    #344 <Method BigDecimal SafeParcelReader.createBigDecimal(Parcel, int)>
	//  179  451:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  180  454:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 181  457:goto            1299
					case 4: // '\004'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (Double.valueOf(SafeParcelReader.readDouble(parcel, k))))));
	//  182  460:aload_0         
	//  183  461:aload_1         
	//  184  462:aload_2         
	//  185  463:aload_2         
	//  186  464:aload_3         
	//  187  465:iload           6
	//  188  467:invokestatic    #348 <Method double SafeParcelReader.readDouble(Parcel, int)>
	//  189  470:invokestatic    #353 <Method Double Double.valueOf(double)>
	//  190  473:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  191  476:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 192  479:goto            1299
					case 3: // '\003'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (Float.valueOf(SafeParcelReader.readFloat(parcel, k))))));
	//  193  482:aload_0         
	//  194  483:aload_1         
	//  195  484:aload_2         
	//  196  485:aload_2         
	//  197  486:aload_3         
	//  198  487:iload           6
	//  199  489:invokestatic    #357 <Method float SafeParcelReader.readFloat(Parcel, int)>
	//  200  492:invokestatic    #362 <Method Float Float.valueOf(float)>
	//  201  495:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  202  498:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 203  501:goto            1299
					case 2: // '\002'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (Long.valueOf(SafeParcelReader.readLong(parcel, k))))));
	//  204  504:aload_0         
	//  205  505:aload_1         
	//  206  506:aload_2         
	//  207  507:aload_2         
	//  208  508:aload_3         
	//  209  509:iload           6
	//  210  511:invokestatic    #366 <Method long SafeParcelReader.readLong(Parcel, int)>
	//  211  514:invokestatic    #371 <Method Long Long.valueOf(long)>
	//  212  517:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  213  520:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 214  523:goto            1299
					case 1: // '\001'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (SafeParcelReader.createBigInteger(parcel, k)))));
	//  215  526:aload_0         
	//  216  527:aload_1         
	//  217  528:aload_2         
	//  218  529:aload_2         
	//  219  530:aload_3         
	//  220  531:iload           6
	//  221  533:invokestatic    #375 <Method BigInteger SafeParcelReader.createBigInteger(Parcel, int)>
	//  222  536:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  223  539:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;

	//* 224  542:goto            1299
					case 0: // '\0'
						zab(stringbuilder, ((FastJsonResponse.Field) (map)), zab(((FastJsonResponse.Field) (map)), ((Object) (Integer.valueOf(SafeParcelReader.readInt(parcel, k))))));
	//  225  545:aload_0         
	//  226  546:aload_1         
	//  227  547:aload_2         
	//  228  548:aload_2         
	//  229  549:aload_3         
	//  230  550:iload           6
	//  231  552:invokestatic    #379 <Method int SafeParcelReader.readInt(Parcel, int)>
	//  232  555:invokestatic    #384 <Method Integer Integer.valueOf(int)>
	//  233  558:invokestatic    #320 <Method Object zab(FastJsonResponse$Field, Object)>
	//  234  561:invokespecial   #323 <Method void zab(StringBuilder, FastJsonResponse$Field, Object)>
						break;
					}
				else
	//* 235  564:goto            1299
				if(((FastJsonResponse.Field) (map)).zapt)
	//* 236  567:aload_2         
	//* 237  568:getfield        #388 <Field boolean FastJsonResponse$Field.zapt>
	//* 238  571:ifeq            850
				{
					stringbuilder.append("[");
	//  239  574:aload_1         
	//  240  575:ldc2            #390 <String "[">
	//  241  578:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  242  581:pop             
label0:
					switch(((FastJsonResponse.Field) (map)).zaps)
	//* 243  582:aload_2         
	//* 244  583:getfield        #300 <Field int FastJsonResponse$Field.zaps>
					{
	//* 245  586:tableswitch     0 11: default 648
	//	               0 829
	//	               1 816
	//	               2 803
	//	               3 790
	//	               4 777
	//	               5 764
	//	               6 751
	//	               7 738
	//	               8 727
	//	               9 727
	//	               10 727
	//	               11 659
					default:
						throw new IllegalStateException("Unknown field type out.");
	//  246  648:new             #188 <Class IllegalStateException>
	//  247  651:dup             
	//  248  652:ldc2            #392 <String "Unknown field type out.">
	//  249  655:invokespecial   #393 <Method void IllegalStateException(String)>
	//  250  658:athrow          

					case 11: // '\013'
						Parcel aparcel[] = SafeParcelReader.createParcelArray(parcel, k);
	//  251  659:aload_3         
	//  252  660:iload           6
	//  253  662:invokestatic    #397 <Method Parcel[] SafeParcelReader.createParcelArray(Parcel, int)>
	//  254  665:astore          8
						k = aparcel.length;
	//  255  667:aload           8
	//  256  669:arraylength     
	//  257  670:istore          6
						i = 0;
	//  258  672:iconst_0        
	//  259  673:istore          4
						do
						{
							if(i >= k)
								break label0;
	//  260  675:iload           4
	//  261  677:iload           6
	//  262  679:icmpge          839
							if(i > 0)
	//* 263  682:iload           4
	//* 264  684:ifle            695
								stringbuilder.append(",");
	//  265  687:aload_1         
	//  266  688:ldc2            #289 <String ",">
	//  267  691:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  268  694:pop             
							aparcel[i].setDataPosition(0);
	//  269  695:aload           8
	//  270  697:iload           4
	//  271  699:aaload          
	//  272  700:iconst_0        
	//  273  701:invokevirtual   #400 <Method void Parcel.setDataPosition(int)>
							zaa(stringbuilder, ((FastJsonResponse.Field) (map)).zacq(), aparcel[i]);
	//  274  704:aload_0         
	//  275  705:aload_1         
	//  276  706:aload_2         
	//  277  707:invokevirtual   #403 <Method Map FastJsonResponse$Field.zacq()>
	//  278  710:aload           8
	//  279  712:iload           4
	//  280  714:aaload          
	//  281  715:invokespecial   #405 <Method void zaa(StringBuilder, Map, Parcel)>
							i++;
	//  282  718:iload           4
	//  283  720:iconst_1        
	//  284  721:iadd            
	//  285  722:istore          4
						} while(true);
	//  286  724:goto            675

					case 8: // '\b'
					case 9: // '\t'
					case 10: // '\n'
						throw new UnsupportedOperationException("List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported");
	//  287  727:new             #407 <Class UnsupportedOperationException>
	//  288  730:dup             
	//  289  731:ldc2            #409 <String "List of type BASE64, BASE64_URL_SAFE, or STRING_MAP is not supported">
	//  290  734:invokespecial   #410 <Method void UnsupportedOperationException(String)>
	//  291  737:athrow          

					case 7: // '\007'
						ArrayUtils.writeStringArray(stringbuilder, SafeParcelReader.createStringArray(parcel, k));
	//  292  738:aload_1         
	//  293  739:aload_3         
	//  294  740:iload           6
	//  295  742:invokestatic    #414 <Method String[] SafeParcelReader.createStringArray(Parcel, int)>
	//  296  745:invokestatic    #420 <Method void ArrayUtils.writeStringArray(StringBuilder, String[])>
						break;

	//* 297  748:goto            839
					case 6: // '\006'
						ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createBooleanArray(parcel, k));
	//  298  751:aload_1         
	//  299  752:aload_3         
	//  300  753:iload           6
	//  301  755:invokestatic    #424 <Method boolean[] SafeParcelReader.createBooleanArray(Parcel, int)>
	//  302  758:invokestatic    #428 <Method void ArrayUtils.writeArray(StringBuilder, boolean[])>
						break;

	//* 303  761:goto            839
					case 5: // '\005'
						ArrayUtils.writeArray(stringbuilder, ((Object []) (SafeParcelReader.createBigDecimalArray(parcel, k))));
	//  304  764:aload_1         
	//  305  765:aload_3         
	//  306  766:iload           6
	//  307  768:invokestatic    #432 <Method BigDecimal[] SafeParcelReader.createBigDecimalArray(Parcel, int)>
	//  308  771:invokestatic    #435 <Method void ArrayUtils.writeArray(StringBuilder, Object[])>
						break;

	//* 309  774:goto            839
					case 4: // '\004'
						ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createDoubleArray(parcel, k));
	//  310  777:aload_1         
	//  311  778:aload_3         
	//  312  779:iload           6
	//  313  781:invokestatic    #439 <Method double[] SafeParcelReader.createDoubleArray(Parcel, int)>
	//  314  784:invokestatic    #442 <Method void ArrayUtils.writeArray(StringBuilder, double[])>
						break;

	//* 315  787:goto            839
					case 3: // '\003'
						ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createFloatArray(parcel, k));
	//  316  790:aload_1         
	//  317  791:aload_3         
	//  318  792:iload           6
	//  319  794:invokestatic    #446 <Method float[] SafeParcelReader.createFloatArray(Parcel, int)>
	//  320  797:invokestatic    #449 <Method void ArrayUtils.writeArray(StringBuilder, float[])>
						break;

	//* 321  800:goto            839
					case 2: // '\002'
						ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createLongArray(parcel, k));
	//  322  803:aload_1         
	//  323  804:aload_3         
	//  324  805:iload           6
	//  325  807:invokestatic    #453 <Method long[] SafeParcelReader.createLongArray(Parcel, int)>
	//  326  810:invokestatic    #456 <Method void ArrayUtils.writeArray(StringBuilder, long[])>
						break;

	//* 327  813:goto            839
					case 1: // '\001'
						ArrayUtils.writeArray(stringbuilder, ((Object []) (SafeParcelReader.createBigIntegerArray(parcel, k))));
	//  328  816:aload_1         
	//  329  817:aload_3         
	//  330  818:iload           6
	//  331  820:invokestatic    #460 <Method BigInteger[] SafeParcelReader.createBigIntegerArray(Parcel, int)>
	//  332  823:invokestatic    #435 <Method void ArrayUtils.writeArray(StringBuilder, Object[])>
						break;

	//* 333  826:goto            839
					case 0: // '\0'
						ArrayUtils.writeArray(stringbuilder, SafeParcelReader.createIntArray(parcel, k));
	//  334  829:aload_1         
	//  335  830:aload_3         
	//  336  831:iload           6
	//  337  833:invokestatic    #464 <Method int[] SafeParcelReader.createIntArray(Parcel, int)>
	//  338  836:invokestatic    #467 <Method void ArrayUtils.writeArray(StringBuilder, int[])>
						break;
					}
					stringbuilder.append("]");
	//  339  839:aload_1         
	//  340  840:ldc2            #469 <String "]">
	//  341  843:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  342  846:pop             
				} else
	//* 343  847:goto            1299
				{
					switch(((FastJsonResponse.Field) (map)).zaps)
	//* 344  850:aload_2         
	//* 345  851:getfield        #300 <Field int FastJsonResponse$Field.zaps>
					{
	//* 346  854:tableswitch     0 11: default 916
	//	               0 1288
	//	               1 1274
	//	               2 1260
	//	               3 1246
	//	               4 1232
	//	               5 1218
	//	               6 1204
	//	               7 1171
	//	               8 1138
	//	               9 1105
	//	               10 955
	//	               11 927
					default:
						throw new IllegalStateException("Unknown field type out");
	//  347  916:new             #188 <Class IllegalStateException>
	//  348  919:dup             
	//  349  920:ldc2            #471 <String "Unknown field type out">
	//  350  923:invokespecial   #393 <Method void IllegalStateException(String)>
	//  351  926:athrow          

					case 11: // '\013'
						Parcel parcel1 = SafeParcelReader.createParcel(parcel, k);
	//  352  927:aload_3         
	//  353  928:iload           6
	//  354  930:invokestatic    #475 <Method Parcel SafeParcelReader.createParcel(Parcel, int)>
	//  355  933:astore          8
						parcel1.setDataPosition(0);
	//  356  935:aload           8
	//  357  937:iconst_0        
	//  358  938:invokevirtual   #400 <Method void Parcel.setDataPosition(int)>
						zaa(stringbuilder, ((FastJsonResponse.Field) (map)).zacq(), parcel1);
	//  359  941:aload_0         
	//  360  942:aload_1         
	//  361  943:aload_2         
	//  362  944:invokevirtual   #403 <Method Map FastJsonResponse$Field.zacq()>
	//  363  947:aload           8
	//  364  949:invokespecial   #405 <Method void zaa(StringBuilder, Map, Parcel)>
						break;
	//  365  952:goto            1299

					case 10: // '\n'
						map = ((Map) (SafeParcelReader.createBundle(parcel, k)));
	//  366  955:aload_3         
	//  367  956:iload           6
	//  368  958:invokestatic    #306 <Method Bundle SafeParcelReader.createBundle(Parcel, int)>
	//  369  961:astore_2        
						Object obj = ((Object) (((Bundle) (map)).keySet()));
	//  370  962:aload_2         
	//  371  963:invokevirtual   #310 <Method Set Bundle.keySet()>
	//  372  966:astore          8
						((Set) (obj)).size();
	//  373  968:aload           8
	//  374  970:invokeinterface #478 <Method int Set.size()>
	//  375  975:pop             
						stringbuilder.append("{");
	//  376  976:aload_1         
	//  377  977:ldc2            #480 <String "{">
	//  378  980:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  379  983:pop             
						obj = ((Object) (((Set) (obj)).iterator()));
	//  380  984:aload           8
	//  381  986:invokeinterface #147 <Method Iterator Set.iterator()>
	//  382  991:astore          8
						for(i = 1; ((Iterator) (obj)).hasNext(); i = 0)
	//* 383  993:iconst_1        
	//* 384  994:istore          4
	//* 385  996:aload           8
	//* 386  998:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//* 387 1003:ifeq            1094
						{
							String s1 = (String)((Iterator) (obj)).next();
	//  388 1006:aload           8
	//  389 1008:invokeinterface #157 <Method Object Iterator.next()>
	//  390 1013:checkcast       #88  <Class String>
	//  391 1016:astore          9
							if(i == 0)
	//* 392 1018:iload           4
	//* 393 1020:ifne            1031
								stringbuilder.append(",");
	//  394 1023:aload_1         
	//  395 1024:ldc2            #289 <String ",">
	//  396 1027:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  397 1030:pop             
							stringbuilder.append("\"");
	//  398 1031:aload_1         
	//  399 1032:ldc1            #226 <String "\"">
	//  400 1034:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  401 1037:pop             
							stringbuilder.append(s1);
	//  402 1038:aload_1         
	//  403 1039:aload           9
	//  404 1041:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  405 1044:pop             
							stringbuilder.append("\"");
	//  406 1045:aload_1         
	//  407 1046:ldc1            #226 <String "\"">
	//  408 1048:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  409 1051:pop             
							stringbuilder.append(":");
	//  410 1052:aload_1         
	//  411 1053:ldc2            #482 <String ":">
	//  412 1056:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  413 1059:pop             
							stringbuilder.append("\"");
	//  414 1060:aload_1         
	//  415 1061:ldc1            #226 <String "\"">
	//  416 1063:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  417 1066:pop             
							stringbuilder.append(JsonUtils.escapeString(((Bundle) (map)).getString(s1)));
	//  418 1067:aload_1         
	//  419 1068:aload_2         
	//  420 1069:aload           9
	//  421 1071:invokevirtual   #313 <Method String Bundle.getString(String)>
	//  422 1074:invokestatic    #243 <Method String JsonUtils.escapeString(String)>
	//  423 1077:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  424 1080:pop             
							stringbuilder.append("\"");
	//  425 1081:aload_1         
	//  426 1082:ldc1            #226 <String "\"">
	//  427 1084:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  428 1087:pop             
						}

	//  429 1088:iconst_0        
	//  430 1089:istore          4
	//* 431 1091:goto            996
						stringbuilder.append("}");
	//  432 1094:aload_1         
	//  433 1095:ldc2            #484 <String "}">
	//  434 1098:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  435 1101:pop             
						break;

	//* 436 1102:goto            1299
					case 9: // '\t'
						map = ((Map) (SafeParcelReader.createByteArray(parcel, k)));
	//  437 1105:aload_3         
	//  438 1106:iload           6
	//  439 1108:invokestatic    #327 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  440 1111:astore_2        
						stringbuilder.append("\"");
	//  441 1112:aload_1         
	//  442 1113:ldc1            #226 <String "\"">
	//  443 1115:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  444 1118:pop             
						stringbuilder.append(Base64Utils.encodeUrlSafe(((byte []) (map))));
	//  445 1119:aload_1         
	//  446 1120:aload_2         
	//  447 1121:invokestatic    #234 <Method String Base64Utils.encodeUrlSafe(byte[])>
	//  448 1124:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  449 1127:pop             
						stringbuilder.append("\"");
	//  450 1128:aload_1         
	//  451 1129:ldc1            #226 <String "\"">
	//  452 1131:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  453 1134:pop             
						break;

	//* 454 1135:goto            1299
					case 8: // '\b'
						map = ((Map) (SafeParcelReader.createByteArray(parcel, k)));
	//  455 1138:aload_3         
	//  456 1139:iload           6
	//  457 1141:invokestatic    #327 <Method byte[] SafeParcelReader.createByteArray(Parcel, int)>
	//  458 1144:astore_2        
						stringbuilder.append("\"");
	//  459 1145:aload_1         
	//  460 1146:ldc1            #226 <String "\"">
	//  461 1148:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  462 1151:pop             
						stringbuilder.append(Base64Utils.encode(((byte []) (map))));
	//  463 1152:aload_1         
	//  464 1153:aload_2         
	//  465 1154:invokestatic    #237 <Method String Base64Utils.encode(byte[])>
	//  466 1157:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  467 1160:pop             
						stringbuilder.append("\"");
	//  468 1161:aload_1         
	//  469 1162:ldc1            #226 <String "\"">
	//  470 1164:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  471 1167:pop             
						break;

	//* 472 1168:goto            1299
					case 7: // '\007'
						map = ((Map) (SafeParcelReader.createString(parcel, k)));
	//  473 1171:aload_3         
	//  474 1172:iload           6
	//  475 1174:invokestatic    #331 <Method String SafeParcelReader.createString(Parcel, int)>
	//  476 1177:astore_2        
						stringbuilder.append("\"");
	//  477 1178:aload_1         
	//  478 1179:ldc1            #226 <String "\"">
	//  479 1181:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  480 1184:pop             
						stringbuilder.append(JsonUtils.escapeString(((String) (map))));
	//  481 1185:aload_1         
	//  482 1186:aload_2         
	//  483 1187:invokestatic    #243 <Method String JsonUtils.escapeString(String)>
	//  484 1190:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  485 1193:pop             
						stringbuilder.append("\"");
	//  486 1194:aload_1         
	//  487 1195:ldc1            #226 <String "\"">
	//  488 1197:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  489 1200:pop             
						break;

	//* 490 1201:goto            1299
					case 6: // '\006'
						stringbuilder.append(SafeParcelReader.readBoolean(parcel, k));
	//  491 1204:aload_1         
	//  492 1205:aload_3         
	//  493 1206:iload           6
	//  494 1208:invokestatic    #335 <Method boolean SafeParcelReader.readBoolean(Parcel, int)>
	//  495 1211:invokevirtual   #487 <Method StringBuilder StringBuilder.append(boolean)>
	//  496 1214:pop             
						break;

	//* 497 1215:goto            1299
					case 5: // '\005'
						stringbuilder.append(((Object) (SafeParcelReader.createBigDecimal(parcel, k))));
	//  498 1218:aload_1         
	//  499 1219:aload_3         
	//  500 1220:iload           6
	//  501 1222:invokestatic    #344 <Method BigDecimal SafeParcelReader.createBigDecimal(Parcel, int)>
	//  502 1225:invokevirtual   #246 <Method StringBuilder StringBuilder.append(Object)>
	//  503 1228:pop             
						break;

	//* 504 1229:goto            1299
					case 4: // '\004'
						stringbuilder.append(SafeParcelReader.readDouble(parcel, k));
	//  505 1232:aload_1         
	//  506 1233:aload_3         
	//  507 1234:iload           6
	//  508 1236:invokestatic    #348 <Method double SafeParcelReader.readDouble(Parcel, int)>
	//  509 1239:invokevirtual   #490 <Method StringBuilder StringBuilder.append(double)>
	//  510 1242:pop             
						break;

	//* 511 1243:goto            1299
					case 3: // '\003'
						stringbuilder.append(SafeParcelReader.readFloat(parcel, k));
	//  512 1246:aload_1         
	//  513 1247:aload_3         
	//  514 1248:iload           6
	//  515 1250:invokestatic    #357 <Method float SafeParcelReader.readFloat(Parcel, int)>
	//  516 1253:invokevirtual   #493 <Method StringBuilder StringBuilder.append(float)>
	//  517 1256:pop             
						break;

	//* 518 1257:goto            1299
					case 2: // '\002'
						stringbuilder.append(SafeParcelReader.readLong(parcel, k));
	//  519 1260:aload_1         
	//  520 1261:aload_3         
	//  521 1262:iload           6
	//  522 1264:invokestatic    #366 <Method long SafeParcelReader.readLong(Parcel, int)>
	//  523 1267:invokevirtual   #496 <Method StringBuilder StringBuilder.append(long)>
	//  524 1270:pop             
						break;

	//* 525 1271:goto            1299
					case 1: // '\001'
						stringbuilder.append(((Object) (SafeParcelReader.createBigInteger(parcel, k))));
	//  526 1274:aload_1         
	//  527 1275:aload_3         
	//  528 1276:iload           6
	//  529 1278:invokestatic    #375 <Method BigInteger SafeParcelReader.createBigInteger(Parcel, int)>
	//  530 1281:invokevirtual   #246 <Method StringBuilder StringBuilder.append(Object)>
	//  531 1284:pop             
						break;

	//* 532 1285:goto            1299
					case 0: // '\0'
						stringbuilder.append(SafeParcelReader.readInt(parcel, k));
	//  533 1288:aload_1         
	//  534 1289:aload_3         
	//  535 1290:iload           6
	//  536 1292:invokestatic    #379 <Method int SafeParcelReader.readInt(Parcel, int)>
	//  537 1295:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//  538 1298:pop             
						break;
					}
				}
				i = 1;
	//  539 1299:iconst_1        
	//  540 1300:istore          4
			}
		} while(true);
	//  541 1302:goto            80
		if(parcel.dataPosition() == j)
	//* 542 1305:aload_3         
	//* 543 1306:invokevirtual   #277 <Method int Parcel.dataPosition()>
	//* 544 1309:iload           5
	//* 545 1311:icmpne          1322
		{
			stringbuilder.append('}');
	//  546 1314:aload_1         
	//  547 1315:bipush          125
	//  548 1317:invokevirtual   #268 <Method StringBuilder StringBuilder.append(char)>
	//  549 1320:pop             
			return;
	//  550 1321:return          
		} else
		{
			stringbuilder = new StringBuilder(37);
	//  551 1322:new             #196 <Class StringBuilder>
	//  552 1325:dup             
	//  553 1326:bipush          37
	//  554 1328:invokespecial   #199 <Method void StringBuilder(int)>
	//  555 1331:astore_1        
			stringbuilder.append("Overread allowed size end=");
	//  556 1332:aload_1         
	//  557 1333:ldc2            #498 <String "Overread allowed size end=">
	//  558 1336:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//  559 1339:pop             
			stringbuilder.append(j);
	//  560 1340:aload_1         
	//  561 1341:iload           5
	//  562 1343:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//  563 1346:pop             
			throw new com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException(stringbuilder.toString(), parcel);
	//  564 1347:new             #500 <Class com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException>
	//  565 1350:dup             
	//  566 1351:aload_1         
	//  567 1352:invokevirtual   #213 <Method String StringBuilder.toString()>
	//  568 1355:aload_3         
	//  569 1356:invokespecial   #503 <Method void com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException(String, Parcel)>
	//  570 1359:athrow          
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
		if(flag)
	//*   9   15:iload_2         
	//*  10   16:ifeq            108
		{
			field = ((FastJsonResponse.Field) (zara));
	//   11   19:aload_0         
	//   12   20:getfield        #59  <Field Parcel zara>
	//   13   23:astore_1        
			if(field != null)
	//*  14   24:aload_1         
	//*  15   25:ifnull          97
			{
				switch(zarc)
	//*  16   28:aload_0         
	//*  17   29:getfield        #73  <Field int zarc>
				{
	//*  18   32:tableswitch     0 2: default 60
	//	               0 83
	//	               1 82
	//	               2 71
				default:
					throw new IllegalStateException("Unknown parse state in SafeParcelResponse.");
	//   19   60:new             #188 <Class IllegalStateException>
	//   20   63:dup             
	//   21   64:ldc2            #510 <String "Unknown parse state in SafeParcelResponse.">
	//   22   67:invokespecial   #393 <Method void IllegalStateException(String)>
	//   23   70:athrow          

				case 2: // '\002'
					throw new IllegalStateException("Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.");
	//   24   71:new             #188 <Class IllegalStateException>
	//   25   74:dup             
	//   26   75:ldc2            #512 <String "Attempted to parse JSON with a SafeParcelResponse object that is already filled with data.">
	//   27   78:invokespecial   #393 <Method void IllegalStateException(String)>
	//   28   81:athrow          

				case 1: // '\001'
					return;
	//   29   82:return          

				case 0: // '\0'
					zard = SafeParcelWriter.beginObjectHeader(((Parcel) (field)));
	//   30   83:aload_0         
	//   31   84:aload_1         
	//   32   85:invokestatic    #517 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//   33   88:putfield        #519 <Field int zard>
					break;
				}
				zarc = 1;
	//   34   91:aload_0         
	//   35   92:iconst_1        
	//   36   93:putfield        #73  <Field int zarc>
				return;
	//   37   96:return          
			} else
			{
				throw new IllegalStateException("Internal Parcel object is null.");
	//   38   97:new             #188 <Class IllegalStateException>
	//   39  100:dup             
	//   40  101:ldc2            #521 <String "Internal Parcel object is null.">
	//   41  104:invokespecial   #393 <Method void IllegalStateException(String)>
	//   42  107:athrow          
			}
		} else
		{
			throw new IllegalStateException("Field does not have a valid safe parcelable field id.");
	//   43  108:new             #188 <Class IllegalStateException>
	//   44  111:dup             
	//   45  112:ldc2            #523 <String "Field does not have a valid safe parcelable field id.">
	//   46  115:invokespecial   #393 <Method void IllegalStateException(String)>
	//   47  118:athrow          
		}
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
	//    7   36:invokestatic    #517 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    8   39:putfield        #519 <Field int zard>
			// fall through

		case 1: // '\001'
			SafeParcelWriter.finishObjectHeader(zara, zard);
	//    9   42:aload_0         
	//   10   43:getfield        #59  <Field Parcel zara>
	//   11   46:aload_0         
	//   12   47:getfield        #519 <Field int zard>
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
		zak zak1 = zapy;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field zak zapy>
	//    2    4:astore_1        
		if(zak1 == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return null;
	//    5    9:aconst_null     
	//    6   10:areturn         
		else
			return zak1.zai(mClassName);
	//    7   11:aload_1         
	//    8   12:aload_0         
	//    9   13:getfield        #65  <Field String mClassName>
	//   10   16:invokevirtual   #568 <Method Map zak.zai(String)>
	//   11   19:areturn         
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
	//    1    1:invokestatic    #517 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
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
		int k = zarb;
	//   14   24:aload_0         
	//   15   25:getfield        #61  <Field int zarb>
	//   16   28:istore          4
		zak zak1;
		switch(k)
	//*  17   30:iload           4
		{
	//*  18   32:tableswitch     0 2: default 60
	//	               0 115
	//	               1 106
	//	               2 97
		default:
			parcel = ((Parcel) (new StringBuilder(34)));
	//   19   60:new             #196 <Class StringBuilder>
	//   20   63:dup             
	//   21   64:bipush          34
	//   22   66:invokespecial   #199 <Method void StringBuilder(int)>
	//   23   69:astore_1        
			((StringBuilder) (parcel)).append("Invalid creation type: ");
	//   24   70:aload_1         
	//   25   71:ldc2            #621 <String "Invalid creation type: ">
	//   26   74:invokevirtual   #205 <Method StringBuilder StringBuilder.append(String)>
	//   27   77:pop             
			((StringBuilder) (parcel)).append(k);
	//   28   78:aload_1         
	//   29   79:iload           4
	//   30   81:invokevirtual   #208 <Method StringBuilder StringBuilder.append(int)>
	//   31   84:pop             
			throw new IllegalStateException(((StringBuilder) (parcel)).toString());
	//   32   85:new             #188 <Class IllegalStateException>
	//   33   88:dup             
	//   34   89:aload_1         
	//   35   90:invokevirtual   #213 <Method String StringBuilder.toString()>
	//   36   93:invokespecial   #393 <Method void IllegalStateException(String)>
	//   37   96:athrow          

		case 2: // '\002'
			zak1 = zapy;
	//   38   97:aload_0         
	//   39   98:getfield        #63  <Field zak zapy>
	//   40  101:astore          5
			break;

	//*  41  103:goto            118
		case 1: // '\001'
			zak1 = zapy;
	//   42  106:aload_0         
	//   43  107:getfield        #63  <Field zak zapy>
	//   44  110:astore          5
			break;

	//*  45  112:goto            118
		case 0: // '\0'
			zak1 = null;
	//   46  115:aconst_null     
	//   47  116:astore          5
			break;
		}
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (zak1)), i, false);
	//   48  118:aload_1         
	//   49  119:iconst_3        
	//   50  120:aload           5
	//   51  122:iload_2         
	//   52  123:iconst_0        
	//   53  124:invokestatic    #625 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   54  127:aload_1         
	//   55  128:iload_3         
	//   56  129:invokestatic    #541 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   57  132:return          
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
	//   19   35:checkcast       #381 <Class Integer>
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
	//   19   35:checkcast       #368 <Class Long>
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
	//   19   35:checkcast       #359 <Class Float>
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
	//   19   35:checkcast       #350 <Class Double>
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
	//   19   35:checkcast       #337 <Class Boolean>
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
