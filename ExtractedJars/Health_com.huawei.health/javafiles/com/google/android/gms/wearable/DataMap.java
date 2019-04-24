// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.wearable;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.*;
import java.util.*;

// Referenced classes of package com.google.android.gms.wearable:
//			Asset

public class DataMap
{

	public DataMap()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #15  <Method void Object()>
	//    2    4:aload_0         
	//    3    5:new             #17  <Class HashMap>
	//    4    8:dup             
	//    5    9:invokespecial   #18  <Method void HashMap()>
	//    6   12:putfield        #20  <Field HashMap zzru>
	//    7   15:return          
	}

	public static ArrayList arrayListFromBundleArrayList(ArrayList arraylist)
	{
		ArrayList arraylist1 = new ArrayList();
	//    0    0:new             #25  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void ArrayList()>
	//    3    7:astore_1        
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext(); arraylist1.add(((Object) (fromBundle((Bundle)((Iterator) (arraylist)).next())))));
	//    4    8:aload_0         
	//    5    9:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//    6   12:astore_0        
	//    7   13:aload_0         
	//    8   14:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//    9   19:ifeq            42
	//   10   22:aload_1         
	//   11   23:aload_0         
	//   12   24:invokeinterface #40  <Method Object Iterator.next()>
	//   13   29:checkcast       #42  <Class Bundle>
	//   14   32:invokestatic    #46  <Method DataMap fromBundle(Bundle)>
	//   15   35:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//   16   38:pop             
	//*  17   39:goto            13
		return arraylist1;
	//   18   42:aload_1         
	//   19   43:areturn         
	}

	public static DataMap fromBundle(Bundle bundle)
	{
		bundle.setClassLoader(((Class) (com/google/android/gms/wearable/Asset)).getClassLoader());
	//    0    0:aload_0         
	//    1    1:ldc1            #54  <Class Asset>
	//    2    3:invokevirtual   #60  <Method ClassLoader Class.getClassLoader()>
	//    3    6:invokevirtual   #64  <Method void Bundle.setClassLoader(ClassLoader)>
		DataMap datamap = new DataMap();
	//    4    9:new             #2   <Class DataMap>
	//    5   12:dup             
	//    6   13:invokespecial   #65  <Method void DataMap()>
	//    7   16:astore_1        
		String s;
		for(Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); zza(datamap, s, bundle.get(s)))
	//*   8   17:aload_0         
	//*   9   18:invokevirtual   #69  <Method Set Bundle.keySet()>
	//*  10   21:invokeinterface #72  <Method Iterator Set.iterator()>
	//*  11   26:astore_2        
	//*  12   27:aload_2         
	//*  13   28:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*  14   33:ifeq            59
			s = (String)iterator.next();
	//   15   36:aload_2         
	//   16   37:invokeinterface #40  <Method Object Iterator.next()>
	//   17   42:checkcast       #74  <Class String>
	//   18   45:astore_3        

	//   19   46:aload_1         
	//   20   47:aload_3         
	//   21   48:aload_0         
	//   22   49:aload_3         
	//   23   50:invokevirtual   #78  <Method Object Bundle.get(String)>
	//   24   53:invokestatic    #82  <Method void zza(DataMap, String, Object)>
	//*  25   56:goto            27
		return datamap;
	//   26   59:aload_1         
	//   27   60:areturn         
	}

	public static DataMap fromByteArray(byte abyte0[])
	{
		try
		{
			abyte0 = ((byte []) (zzblc.zza(new com.google.android.gms.internal.zzblc.zza(zzbld.zzS(abyte0), ((java.util.List) (new ArrayList()))))));
	//    0    0:new             #88  <Class com.google.android.gms.internal.zzblc$zza>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #94  <Method zzbld zzbld.zzS(byte[])>
	//    4    8:new             #25  <Class ArrayList>
	//    5   11:dup             
	//    6   12:invokespecial   #26  <Method void ArrayList()>
	//    7   15:invokespecial   #97  <Method void com.google.android.gms.internal.zzblc$zza(zzbld, java.util.List)>
	//    8   18:invokestatic    #102 <Method DataMap zzblc.zza(com.google.android.gms.internal.zzblc$zza)>
	//    9   21:astore_0        
		}
	//*  10   22:aload_0         
	//*  11   23:areturn         
		// Misplaced declaration of an exception variable
		catch(byte abyte0[])
	//*  12   24:astore_0        
		{
			throw new IllegalArgumentException("Unable to convert data", ((Throwable) (abyte0)));
	//   13   25:new             #104 <Class IllegalArgumentException>
	//   14   28:dup             
	//   15   29:ldc1            #106 <String "Unable to convert data">
	//   16   31:aload_0         
	//   17   32:invokespecial   #109 <Method void IllegalArgumentException(String, Throwable)>
	//   18   35:athrow          
		}
		return ((DataMap) (abyte0));
	}

	private static void zza(DataMap datamap, String s, Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #74  <Class String>
	//*   2    4:ifeq            17
		{
			datamap.putString(s, (String)obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:checkcast       #74  <Class String>
	//    7   13:invokevirtual   #113 <Method void putString(String, String)>
			return;
	//    8   16:return          
		}
		if(obj instanceof Integer)
	//*   9   17:aload_2         
	//*  10   18:instanceof      #115 <Class Integer>
	//*  11   21:ifeq            37
		{
			datamap.putInt(s, ((Integer)obj).intValue());
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:checkcast       #115 <Class Integer>
	//   16   30:invokevirtual   #119 <Method int Integer.intValue()>
	//   17   33:invokevirtual   #123 <Method void putInt(String, int)>
			return;
	//   18   36:return          
		}
		if(obj instanceof Long)
	//*  19   37:aload_2         
	//*  20   38:instanceof      #125 <Class Long>
	//*  21   41:ifeq            57
		{
			datamap.putLong(s, ((Long)obj).longValue());
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:checkcast       #125 <Class Long>
	//   26   50:invokevirtual   #129 <Method long Long.longValue()>
	//   27   53:invokevirtual   #133 <Method void putLong(String, long)>
			return;
	//   28   56:return          
		}
		if(obj instanceof Double)
	//*  29   57:aload_2         
	//*  30   58:instanceof      #135 <Class Double>
	//*  31   61:ifeq            77
		{
			datamap.putDouble(s, ((Double)obj).doubleValue());
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:aload_2         
	//   35   67:checkcast       #135 <Class Double>
	//   36   70:invokevirtual   #139 <Method double Double.doubleValue()>
	//   37   73:invokevirtual   #143 <Method void putDouble(String, double)>
			return;
	//   38   76:return          
		}
		if(obj instanceof Float)
	//*  39   77:aload_2         
	//*  40   78:instanceof      #145 <Class Float>
	//*  41   81:ifeq            97
		{
			datamap.putFloat(s, ((Float)obj).floatValue());
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:checkcast       #145 <Class Float>
	//   46   90:invokevirtual   #149 <Method float Float.floatValue()>
	//   47   93:invokevirtual   #153 <Method void putFloat(String, float)>
			return;
	//   48   96:return          
		}
		if(obj instanceof Boolean)
	//*  49   97:aload_2         
	//*  50   98:instanceof      #155 <Class Boolean>
	//*  51  101:ifeq            117
		{
			datamap.putBoolean(s, ((Boolean)obj).booleanValue());
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:aload_2         
	//   55  107:checkcast       #155 <Class Boolean>
	//   56  110:invokevirtual   #158 <Method boolean Boolean.booleanValue()>
	//   57  113:invokevirtual   #162 <Method void putBoolean(String, boolean)>
			return;
	//   58  116:return          
		}
		if(obj instanceof Byte)
	//*  59  117:aload_2         
	//*  60  118:instanceof      #164 <Class Byte>
	//*  61  121:ifeq            137
		{
			datamap.putByte(s, ((Byte)obj).byteValue());
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:aload_2         
	//   65  127:checkcast       #164 <Class Byte>
	//   66  130:invokevirtual   #168 <Method byte Byte.byteValue()>
	//   67  133:invokevirtual   #172 <Method void putByte(String, byte)>
			return;
	//   68  136:return          
		}
		if(obj instanceof byte[])
	//*  69  137:aload_2         
	//*  70  138:instanceof      #174 <Class byte[]>
	//*  71  141:ifeq            154
		{
			datamap.putByteArray(s, (byte[])obj);
	//   72  144:aload_0         
	//   73  145:aload_1         
	//   74  146:aload_2         
	//   75  147:checkcast       #174 <Class byte[]>
	//   76  150:invokevirtual   #178 <Method void putByteArray(String, byte[])>
			return;
	//   77  153:return          
		}
		if(obj instanceof String[])
	//*  78  154:aload_2         
	//*  79  155:instanceof      #180 <Class String[]>
	//*  80  158:ifeq            171
		{
			datamap.putStringArray(s, (String[])obj);
	//   81  161:aload_0         
	//   82  162:aload_1         
	//   83  163:aload_2         
	//   84  164:checkcast       #180 <Class String[]>
	//   85  167:invokevirtual   #184 <Method void putStringArray(String, String[])>
			return;
	//   86  170:return          
		}
		if(obj instanceof long[])
	//*  87  171:aload_2         
	//*  88  172:instanceof      #186 <Class long[]>
	//*  89  175:ifeq            188
		{
			datamap.putLongArray(s, (long[])obj);
	//   90  178:aload_0         
	//   91  179:aload_1         
	//   92  180:aload_2         
	//   93  181:checkcast       #186 <Class long[]>
	//   94  184:invokevirtual   #190 <Method void putLongArray(String, long[])>
			return;
	//   95  187:return          
		}
		if(obj instanceof float[])
	//*  96  188:aload_2         
	//*  97  189:instanceof      #192 <Class float[]>
	//*  98  192:ifeq            205
		{
			datamap.putFloatArray(s, (float[])obj);
	//   99  195:aload_0         
	//  100  196:aload_1         
	//  101  197:aload_2         
	//  102  198:checkcast       #192 <Class float[]>
	//  103  201:invokevirtual   #196 <Method void putFloatArray(String, float[])>
			return;
	//  104  204:return          
		}
		if(obj instanceof Asset)
	//* 105  205:aload_2         
	//* 106  206:instanceof      #54  <Class Asset>
	//* 107  209:ifeq            222
		{
			datamap.putAsset(s, (Asset)obj);
	//  108  212:aload_0         
	//  109  213:aload_1         
	//  110  214:aload_2         
	//  111  215:checkcast       #54  <Class Asset>
	//  112  218:invokevirtual   #200 <Method void putAsset(String, Asset)>
			return;
	//  113  221:return          
		}
		if(obj instanceof Bundle)
	//* 114  222:aload_2         
	//* 115  223:instanceof      #42  <Class Bundle>
	//* 116  226:ifeq            242
		{
			datamap.putDataMap(s, fromBundle((Bundle)obj));
	//  117  229:aload_0         
	//  118  230:aload_1         
	//  119  231:aload_2         
	//  120  232:checkcast       #42  <Class Bundle>
	//  121  235:invokestatic    #46  <Method DataMap fromBundle(Bundle)>
	//  122  238:invokevirtual   #204 <Method void putDataMap(String, DataMap)>
			return;
	//  123  241:return          
		}
		if(obj instanceof ArrayList)
	//* 124  242:aload_2         
	//* 125  243:instanceof      #25  <Class ArrayList>
	//* 126  246:ifeq            349
			switch(zzj((ArrayList)obj))
	//* 127  249:aload_2         
	//* 128  250:checkcast       #25  <Class ArrayList>
	//* 129  253:invokestatic    #208 <Method int zzj(ArrayList)>
			{
	//* 130  256:tableswitch     0 5: default 296
	//	               0 297
	//	               1 307
	//	               2 327
	//	               3 317
	//	               4 349
	//	               5 337
			default:
				return;
	//  131  296:return          

			case 0: // '\0'
				datamap.putStringArrayList(s, (ArrayList)obj);
	//  132  297:aload_0         
	//  133  298:aload_1         
	//  134  299:aload_2         
	//  135  300:checkcast       #25  <Class ArrayList>
	//  136  303:invokevirtual   #212 <Method void putStringArrayList(String, ArrayList)>
				return;
	//  137  306:return          

			case 1: // '\001'
				datamap.putStringArrayList(s, (ArrayList)obj);
	//  138  307:aload_0         
	//  139  308:aload_1         
	//  140  309:aload_2         
	//  141  310:checkcast       #25  <Class ArrayList>
	//  142  313:invokevirtual   #212 <Method void putStringArrayList(String, ArrayList)>
				return;
	//  143  316:return          

			case 3: // '\003'
				datamap.putStringArrayList(s, (ArrayList)obj);
	//  144  317:aload_0         
	//  145  318:aload_1         
	//  146  319:aload_2         
	//  147  320:checkcast       #25  <Class ArrayList>
	//  148  323:invokevirtual   #212 <Method void putStringArrayList(String, ArrayList)>
				return;
	//  149  326:return          

			case 2: // '\002'
				datamap.putIntegerArrayList(s, (ArrayList)obj);
	//  150  327:aload_0         
	//  151  328:aload_1         
	//  152  329:aload_2         
	//  153  330:checkcast       #25  <Class ArrayList>
	//  154  333:invokevirtual   #215 <Method void putIntegerArrayList(String, ArrayList)>
				return;
	//  155  336:return          

			case 5: // '\005'
				datamap.putDataMapArrayList(s, arrayListFromBundleArrayList((ArrayList)obj));
	//  156  337:aload_0         
	//  157  338:aload_1         
	//  158  339:aload_2         
	//  159  340:checkcast       #25  <Class ArrayList>
	//  160  343:invokestatic    #217 <Method ArrayList arrayListFromBundleArrayList(ArrayList)>
	//  161  346:invokevirtual   #220 <Method void putDataMapArrayList(String, ArrayList)>
				break;

			case 4: // '\004'
				break;
			}
	//  162  349:return          
	}

	private void zza(String s, Object obj, String s1, ClassCastException classcastexception)
	{
		zza(s, obj, s1, "<null>", classcastexception);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #223 <String "<null>">
	//    5    6:aload           4
	//    6    8:invokespecial   #226 <Method void zza(String, Object, String, Object, ClassCastException)>
	//    7   11:return          
	}

	private void zza(String s, Object obj, String s1, Object obj1, ClassCastException classcastexception)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #228 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #229 <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("Key ");
	//    4    9:aload           6
	//    5   11:ldc1            #231 <String "Key ">
	//    6   13:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(s);
	//    8   17:aload           6
	//    9   19:aload_1         
	//   10   20:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(" expected ");
	//   12   24:aload           6
	//   13   26:ldc1            #237 <String " expected ">
	//   14   28:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   15   31:pop             
		stringbuilder.append(s1);
	//   16   32:aload           6
	//   17   34:aload_3         
	//   18   35:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		stringbuilder.append(" but value was a ");
	//   20   39:aload           6
	//   21   41:ldc1            #239 <String " but value was a ">
	//   22   43:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   23   46:pop             
		stringbuilder.append(obj.getClass().getName());
	//   24   47:aload           6
	//   25   49:aload_2         
	//   26   50:invokevirtual   #243 <Method Class Object.getClass()>
	//   27   53:invokevirtual   #247 <Method String Class.getName()>
	//   28   56:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   29   59:pop             
		stringbuilder.append(".  The default value ");
	//   30   60:aload           6
	//   31   62:ldc1            #249 <String ".  The default value ">
	//   32   64:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
		stringbuilder.append(obj1);
	//   34   68:aload           6
	//   35   70:aload           4
	//   36   72:invokevirtual   #252 <Method StringBuilder StringBuilder.append(Object)>
	//   37   75:pop             
		stringbuilder.append(" was returned.");
	//   38   76:aload           6
	//   39   78:ldc1            #254 <String " was returned.">
	//   40   80:invokevirtual   #235 <Method StringBuilder StringBuilder.append(String)>
	//   41   83:pop             
		Log.w("DataMap", stringbuilder.toString());
	//   42   84:ldc1            #8   <String "DataMap">
	//   43   86:aload           6
	//   44   88:invokevirtual   #257 <Method String StringBuilder.toString()>
	//   45   91:invokestatic    #263 <Method int Log.w(String, String)>
	//   46   94:pop             
		Log.w("DataMap", "Attempt to cast generated internal exception:", ((Throwable) (classcastexception)));
	//   47   95:ldc1            #8   <String "DataMap">
	//   48   97:ldc2            #265 <String "Attempt to cast generated internal exception:">
	//   49  100:aload           5
	//   50  102:invokestatic    #268 <Method int Log.w(String, String, Throwable)>
	//   51  105:pop             
	//   52  106:return          
	}

	private static boolean zza(Asset asset, Asset asset1)
	{
		if(asset == null || asset1 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          8
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       17
			return asset == asset1;
	//    4    8:aload_0         
	//    5    9:aload_1         
	//    6   10:if_acmpne       15
	//    7   13:iconst_1        
	//    8   14:ireturn         
	//    9   15:iconst_0        
	//   10   16:ireturn         
		if(!TextUtils.isEmpty(((CharSequence) (asset.getDigest()))))
	//*  11   17:aload_0         
	//*  12   18:invokevirtual   #272 <Method String Asset.getDigest()>
	//*  13   21:invokestatic    #278 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  14   24:ifne            39
			return asset.getDigest().equals(((Object) (asset1.getDigest())));
	//   15   27:aload_0         
	//   16   28:invokevirtual   #272 <Method String Asset.getDigest()>
	//   17   31:aload_1         
	//   18   32:invokevirtual   #272 <Method String Asset.getDigest()>
	//   19   35:invokevirtual   #281 <Method boolean String.equals(Object)>
	//   20   38:ireturn         
		else
			return Arrays.equals(asset.getData(), asset1.getData());
	//   21   39:aload_0         
	//   22   40:invokevirtual   #285 <Method byte[] Asset.getData()>
	//   23   43:aload_1         
	//   24   44:invokevirtual   #285 <Method byte[] Asset.getData()>
	//   25   47:invokestatic    #290 <Method boolean Arrays.equals(byte[], byte[])>
	//   26   50:ireturn         
	}

	private static boolean zza(DataMap datamap, DataMap datamap1)
	{
		if(datamap.size() != datamap1.size())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #294 <Method int size()>
	//*   2    4:aload_1         
	//*   3    5:invokevirtual   #294 <Method int size()>
	//*   4    8:icmpeq          13
			return false;
	//    5   11:iconst_0        
	//    6   12:ireturn         
		for(Iterator iterator = datamap.keySet().iterator(); iterator.hasNext();)
	//*   7   13:aload_0         
	//*   8   14:invokevirtual   #295 <Method Set keySet()>
	//*   9   17:invokeinterface #72  <Method Iterator Set.iterator()>
	//*  10   22:astore_2        
	//*  11   23:aload_2         
	//*  12   24:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*  13   29:ifeq            261
		{
			Object obj1 = ((Object) ((String)iterator.next()));
	//   14   32:aload_2         
	//   15   33:invokeinterface #40  <Method Object Iterator.next()>
	//   16   38:checkcast       #74  <Class String>
	//   17   41:astore          4
			Object obj = datamap.get(((String) (obj1)));
	//   18   43:aload_0         
	//   19   44:aload           4
	//   20   46:invokevirtual   #296 <Method Object get(String)>
	//   21   49:astore_3        
			obj1 = datamap1.get(((String) (obj1)));
	//   22   50:aload_1         
	//   23   51:aload           4
	//   24   53:invokevirtual   #296 <Method Object get(String)>
	//   25   56:astore          4
			if(obj instanceof Asset)
	//*  26   58:aload_3         
	//*  27   59:instanceof      #54  <Class Asset>
	//*  28   62:ifeq            92
			{
				if(!(obj1 instanceof Asset))
	//*  29   65:aload           4
	//*  30   67:instanceof      #54  <Class Asset>
	//*  31   70:ifne            75
					return false;
	//   32   73:iconst_0        
	//   33   74:ireturn         
				if(!zza((Asset)obj, (Asset)obj1))
	//*  34   75:aload_3         
	//*  35   76:checkcast       #54  <Class Asset>
	//*  36   79:aload           4
	//*  37   81:checkcast       #54  <Class Asset>
	//*  38   84:invokestatic    #298 <Method boolean zza(Asset, Asset)>
	//*  39   87:ifne            258
					return false;
	//   40   90:iconst_0        
	//   41   91:ireturn         
			} else
			if(obj instanceof String[])
	//*  42   92:aload_3         
	//*  43   93:instanceof      #180 <Class String[]>
	//*  44   96:ifeq            126
			{
				if(!(obj1 instanceof String[]))
	//*  45   99:aload           4
	//*  46  101:instanceof      #180 <Class String[]>
	//*  47  104:ifne            109
					return false;
	//   48  107:iconst_0        
	//   49  108:ireturn         
				if(!Arrays.equals(((Object []) ((String[])obj)), ((Object []) ((String[])obj1))))
	//*  50  109:aload_3         
	//*  51  110:checkcast       #180 <Class String[]>
	//*  52  113:aload           4
	//*  53  115:checkcast       #180 <Class String[]>
	//*  54  118:invokestatic    #301 <Method boolean Arrays.equals(Object[], Object[])>
	//*  55  121:ifne            258
					return false;
	//   56  124:iconst_0        
	//   57  125:ireturn         
			} else
			if(obj instanceof long[])
	//*  58  126:aload_3         
	//*  59  127:instanceof      #186 <Class long[]>
	//*  60  130:ifeq            160
			{
				if(!(obj1 instanceof long[]))
	//*  61  133:aload           4
	//*  62  135:instanceof      #186 <Class long[]>
	//*  63  138:ifne            143
					return false;
	//   64  141:iconst_0        
	//   65  142:ireturn         
				if(!Arrays.equals((long[])obj, (long[])obj1))
	//*  66  143:aload_3         
	//*  67  144:checkcast       #186 <Class long[]>
	//*  68  147:aload           4
	//*  69  149:checkcast       #186 <Class long[]>
	//*  70  152:invokestatic    #304 <Method boolean Arrays.equals(long[], long[])>
	//*  71  155:ifne            258
					return false;
	//   72  158:iconst_0        
	//   73  159:ireturn         
			} else
			if(obj instanceof float[])
	//*  74  160:aload_3         
	//*  75  161:instanceof      #192 <Class float[]>
	//*  76  164:ifeq            194
			{
				if(!(obj1 instanceof float[]))
	//*  77  167:aload           4
	//*  78  169:instanceof      #192 <Class float[]>
	//*  79  172:ifne            177
					return false;
	//   80  175:iconst_0        
	//   81  176:ireturn         
				if(!Arrays.equals((float[])obj, (float[])obj1))
	//*  82  177:aload_3         
	//*  83  178:checkcast       #192 <Class float[]>
	//*  84  181:aload           4
	//*  85  183:checkcast       #192 <Class float[]>
	//*  86  186:invokestatic    #307 <Method boolean Arrays.equals(float[], float[])>
	//*  87  189:ifne            258
					return false;
	//   88  192:iconst_0        
	//   89  193:ireturn         
			} else
			if(obj instanceof byte[])
	//*  90  194:aload_3         
	//*  91  195:instanceof      #174 <Class byte[]>
	//*  92  198:ifeq            228
			{
				if(!(obj1 instanceof byte[]))
	//*  93  201:aload           4
	//*  94  203:instanceof      #174 <Class byte[]>
	//*  95  206:ifne            211
					return false;
	//   96  209:iconst_0        
	//   97  210:ireturn         
				if(!Arrays.equals((byte[])obj, (byte[])obj1))
	//*  98  211:aload_3         
	//*  99  212:checkcast       #174 <Class byte[]>
	//* 100  215:aload           4
	//* 101  217:checkcast       #174 <Class byte[]>
	//* 102  220:invokestatic    #290 <Method boolean Arrays.equals(byte[], byte[])>
	//* 103  223:ifne            258
					return false;
	//  104  226:iconst_0        
	//  105  227:ireturn         
			} else
			{
				if(obj == null || obj1 == null)
	//* 106  228:aload_3         
	//* 107  229:ifnull          237
	//* 108  232:aload           4
	//* 109  234:ifnonnull       247
					return obj == obj1;
	//  110  237:aload_3         
	//  111  238:aload           4
	//  112  240:if_acmpne       245
	//  113  243:iconst_1        
	//  114  244:ireturn         
	//  115  245:iconst_0        
	//  116  246:ireturn         
				if(!obj.equals(obj1))
	//* 117  247:aload_3         
	//* 118  248:aload           4
	//* 119  250:invokevirtual   #308 <Method boolean Object.equals(Object)>
	//* 120  253:ifne            258
					return false;
	//  121  256:iconst_0        
	//  122  257:ireturn         
			}
		}

	//* 123  258:goto            23
		return true;
	//  124  261:iconst_1        
	//  125  262:ireturn         
	}

	private static void zzb(Bundle bundle, String s, Object obj)
	{
		if(obj instanceof String)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #74  <Class String>
	//*   2    4:ifeq            17
		{
			bundle.putString(s, (String)obj);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:checkcast       #74  <Class String>
	//    7   13:invokevirtual   #311 <Method void Bundle.putString(String, String)>
			return;
	//    8   16:return          
		}
		if(obj instanceof Integer)
	//*   9   17:aload_2         
	//*  10   18:instanceof      #115 <Class Integer>
	//*  11   21:ifeq            37
		{
			bundle.putInt(s, ((Integer)obj).intValue());
	//   12   24:aload_0         
	//   13   25:aload_1         
	//   14   26:aload_2         
	//   15   27:checkcast       #115 <Class Integer>
	//   16   30:invokevirtual   #119 <Method int Integer.intValue()>
	//   17   33:invokevirtual   #312 <Method void Bundle.putInt(String, int)>
			return;
	//   18   36:return          
		}
		if(obj instanceof Long)
	//*  19   37:aload_2         
	//*  20   38:instanceof      #125 <Class Long>
	//*  21   41:ifeq            57
		{
			bundle.putLong(s, ((Long)obj).longValue());
	//   22   44:aload_0         
	//   23   45:aload_1         
	//   24   46:aload_2         
	//   25   47:checkcast       #125 <Class Long>
	//   26   50:invokevirtual   #129 <Method long Long.longValue()>
	//   27   53:invokevirtual   #313 <Method void Bundle.putLong(String, long)>
			return;
	//   28   56:return          
		}
		if(obj instanceof Double)
	//*  29   57:aload_2         
	//*  30   58:instanceof      #135 <Class Double>
	//*  31   61:ifeq            77
		{
			bundle.putDouble(s, ((Double)obj).doubleValue());
	//   32   64:aload_0         
	//   33   65:aload_1         
	//   34   66:aload_2         
	//   35   67:checkcast       #135 <Class Double>
	//   36   70:invokevirtual   #139 <Method double Double.doubleValue()>
	//   37   73:invokevirtual   #314 <Method void Bundle.putDouble(String, double)>
			return;
	//   38   76:return          
		}
		if(obj instanceof Float)
	//*  39   77:aload_2         
	//*  40   78:instanceof      #145 <Class Float>
	//*  41   81:ifeq            97
		{
			bundle.putFloat(s, ((Float)obj).floatValue());
	//   42   84:aload_0         
	//   43   85:aload_1         
	//   44   86:aload_2         
	//   45   87:checkcast       #145 <Class Float>
	//   46   90:invokevirtual   #149 <Method float Float.floatValue()>
	//   47   93:invokevirtual   #315 <Method void Bundle.putFloat(String, float)>
			return;
	//   48   96:return          
		}
		if(obj instanceof Boolean)
	//*  49   97:aload_2         
	//*  50   98:instanceof      #155 <Class Boolean>
	//*  51  101:ifeq            117
		{
			bundle.putBoolean(s, ((Boolean)obj).booleanValue());
	//   52  104:aload_0         
	//   53  105:aload_1         
	//   54  106:aload_2         
	//   55  107:checkcast       #155 <Class Boolean>
	//   56  110:invokevirtual   #158 <Method boolean Boolean.booleanValue()>
	//   57  113:invokevirtual   #316 <Method void Bundle.putBoolean(String, boolean)>
			return;
	//   58  116:return          
		}
		if(obj instanceof Byte)
	//*  59  117:aload_2         
	//*  60  118:instanceof      #164 <Class Byte>
	//*  61  121:ifeq            137
		{
			bundle.putByte(s, ((Byte)obj).byteValue());
	//   62  124:aload_0         
	//   63  125:aload_1         
	//   64  126:aload_2         
	//   65  127:checkcast       #164 <Class Byte>
	//   66  130:invokevirtual   #168 <Method byte Byte.byteValue()>
	//   67  133:invokevirtual   #317 <Method void Bundle.putByte(String, byte)>
			return;
	//   68  136:return          
		}
		if(obj instanceof byte[])
	//*  69  137:aload_2         
	//*  70  138:instanceof      #174 <Class byte[]>
	//*  71  141:ifeq            154
		{
			bundle.putByteArray(s, (byte[])obj);
	//   72  144:aload_0         
	//   73  145:aload_1         
	//   74  146:aload_2         
	//   75  147:checkcast       #174 <Class byte[]>
	//   76  150:invokevirtual   #318 <Method void Bundle.putByteArray(String, byte[])>
			return;
	//   77  153:return          
		}
		if(obj instanceof String[])
	//*  78  154:aload_2         
	//*  79  155:instanceof      #180 <Class String[]>
	//*  80  158:ifeq            171
		{
			bundle.putStringArray(s, (String[])obj);
	//   81  161:aload_0         
	//   82  162:aload_1         
	//   83  163:aload_2         
	//   84  164:checkcast       #180 <Class String[]>
	//   85  167:invokevirtual   #319 <Method void Bundle.putStringArray(String, String[])>
			return;
	//   86  170:return          
		}
		if(obj instanceof long[])
	//*  87  171:aload_2         
	//*  88  172:instanceof      #186 <Class long[]>
	//*  89  175:ifeq            188
		{
			bundle.putLongArray(s, (long[])obj);
	//   90  178:aload_0         
	//   91  179:aload_1         
	//   92  180:aload_2         
	//   93  181:checkcast       #186 <Class long[]>
	//   94  184:invokevirtual   #320 <Method void Bundle.putLongArray(String, long[])>
			return;
	//   95  187:return          
		}
		if(obj instanceof float[])
	//*  96  188:aload_2         
	//*  97  189:instanceof      #192 <Class float[]>
	//*  98  192:ifeq            205
		{
			bundle.putFloatArray(s, (float[])obj);
	//   99  195:aload_0         
	//  100  196:aload_1         
	//  101  197:aload_2         
	//  102  198:checkcast       #192 <Class float[]>
	//  103  201:invokevirtual   #321 <Method void Bundle.putFloatArray(String, float[])>
			return;
	//  104  204:return          
		}
		if(obj instanceof Asset)
	//* 105  205:aload_2         
	//* 106  206:instanceof      #54  <Class Asset>
	//* 107  209:ifeq            222
		{
			bundle.putParcelable(s, ((android.os.Parcelable) ((Asset)obj)));
	//  108  212:aload_0         
	//  109  213:aload_1         
	//  110  214:aload_2         
	//  111  215:checkcast       #54  <Class Asset>
	//  112  218:invokevirtual   #325 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return;
	//  113  221:return          
		}
		if(obj instanceof DataMap)
	//* 114  222:aload_2         
	//* 115  223:instanceof      #2   <Class DataMap>
	//* 116  226:ifeq            242
		{
			bundle.putParcelable(s, ((android.os.Parcelable) (((DataMap)obj).toBundle())));
	//  117  229:aload_0         
	//  118  230:aload_1         
	//  119  231:aload_2         
	//  120  232:checkcast       #2   <Class DataMap>
	//  121  235:invokevirtual   #329 <Method Bundle toBundle()>
	//  122  238:invokevirtual   #325 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return;
	//  123  241:return          
		}
		if(obj instanceof ArrayList)
	//* 124  242:aload_2         
	//* 125  243:instanceof      #25  <Class ArrayList>
	//* 126  246:ifeq            384
		{
			ArrayList arraylist;
			switch(zzj((ArrayList)obj))
	//* 127  249:aload_2         
	//* 128  250:checkcast       #25  <Class ArrayList>
	//* 129  253:invokestatic    #208 <Method int zzj(ArrayList)>
			{
	//* 130  256:tableswitch     0 4: default 292
	//	               0 293
	//	               1 303
	//	               2 323
	//	               3 313
	//	               4 333
			default:
				return;
	//  131  292:return          

			case 0: // '\0'
				bundle.putStringArrayList(s, (ArrayList)obj);
	//  132  293:aload_0         
	//  133  294:aload_1         
	//  134  295:aload_2         
	//  135  296:checkcast       #25  <Class ArrayList>
	//  136  299:invokevirtual   #330 <Method void Bundle.putStringArrayList(String, ArrayList)>
				return;
	//  137  302:return          

			case 1: // '\001'
				bundle.putStringArrayList(s, (ArrayList)obj);
	//  138  303:aload_0         
	//  139  304:aload_1         
	//  140  305:aload_2         
	//  141  306:checkcast       #25  <Class ArrayList>
	//  142  309:invokevirtual   #330 <Method void Bundle.putStringArrayList(String, ArrayList)>
				return;
	//  143  312:return          

			case 3: // '\003'
				bundle.putStringArrayList(s, (ArrayList)obj);
	//  144  313:aload_0         
	//  145  314:aload_1         
	//  146  315:aload_2         
	//  147  316:checkcast       #25  <Class ArrayList>
	//  148  319:invokevirtual   #330 <Method void Bundle.putStringArrayList(String, ArrayList)>
				return;
	//  149  322:return          

			case 2: // '\002'
				bundle.putIntegerArrayList(s, (ArrayList)obj);
	//  150  323:aload_0         
	//  151  324:aload_1         
	//  152  325:aload_2         
	//  153  326:checkcast       #25  <Class ArrayList>
	//  154  329:invokevirtual   #331 <Method void Bundle.putIntegerArrayList(String, ArrayList)>
				return;
	//  155  332:return          

			case 4: // '\004'
				arraylist = new ArrayList();
	//  156  333:new             #25  <Class ArrayList>
	//  157  336:dup             
	//  158  337:invokespecial   #26  <Method void ArrayList()>
	//  159  340:astore_3        
				break;
			}
			for(obj = ((Object) (((ArrayList)obj).iterator())); ((Iterator) (obj)).hasNext(); arraylist.add(((Object) (((DataMap)((Iterator) (obj)).next()).toBundle()))));
	//  160  341:aload_2         
	//  161  342:checkcast       #25  <Class ArrayList>
	//  162  345:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//  163  348:astore_2        
	//  164  349:aload_2         
	//  165  350:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//  166  355:ifeq            378
	//  167  358:aload_3         
	//  168  359:aload_2         
	//  169  360:invokeinterface #40  <Method Object Iterator.next()>
	//  170  365:checkcast       #2   <Class DataMap>
	//  171  368:invokevirtual   #329 <Method Bundle toBundle()>
	//  172  371:invokevirtual   #50  <Method boolean ArrayList.add(Object)>
	//  173  374:pop             
	//* 174  375:goto            349
			bundle.putParcelableArrayList(s, arraylist);
	//  175  378:aload_0         
	//  176  379:aload_1         
	//  177  380:aload_3         
	//  178  381:invokevirtual   #334 <Method void Bundle.putParcelableArrayList(String, ArrayList)>
		}
	//  179  384:return          
	}

	private static int zzj(ArrayList arraylist)
	{
		if(arraylist.isEmpty())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #336 <Method boolean ArrayList.isEmpty()>
	//*   2    4:ifeq            9
			return 0;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		for(arraylist = ((ArrayList) (arraylist.iterator())); ((Iterator) (arraylist)).hasNext();)
	//*   5    9:aload_0         
	//*   6   10:invokevirtual   #30  <Method Iterator ArrayList.iterator()>
	//*   7   13:astore_0        
	//*   8   14:aload_0         
	//*   9   15:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*  10   20:ifeq            73
		{
			Object obj = ((Iterator) (arraylist)).next();
	//   11   23:aload_0         
	//   12   24:invokeinterface #40  <Method Object Iterator.next()>
	//   13   29:astore_1        
			if(obj != null)
	//*  14   30:aload_1         
	//*  15   31:ifnull          70
			{
				if(obj instanceof Integer)
	//*  16   34:aload_1         
	//*  17   35:instanceof      #115 <Class Integer>
	//*  18   38:ifeq            43
					return 2;
	//   19   41:iconst_2        
	//   20   42:ireturn         
				if(obj instanceof String)
	//*  21   43:aload_1         
	//*  22   44:instanceof      #74  <Class String>
	//*  23   47:ifeq            52
					return 3;
	//   24   50:iconst_3        
	//   25   51:ireturn         
				if(obj instanceof DataMap)
	//*  26   52:aload_1         
	//*  27   53:instanceof      #2   <Class DataMap>
	//*  28   56:ifeq            61
					return 4;
	//   29   59:iconst_4        
	//   30   60:ireturn         
				if(obj instanceof Bundle)
	//*  31   61:aload_1         
	//*  32   62:instanceof      #42  <Class Bundle>
	//*  33   65:ifeq            70
					return 5;
	//   34   68:iconst_5        
	//   35   69:ireturn         
			}
		}

	//*  36   70:goto            14
		return 1;
	//   37   73:iconst_1        
	//   38   74:ireturn         
	}

	public void clear()
	{
		zzru.clear();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:invokevirtual   #340 <Method void HashMap.clear()>
	//    3    7:return          
	}

	public boolean containsKey(String s)
	{
		return zzru.containsKey(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #344 <Method boolean HashMap.containsKey(Object)>
	//    4    8:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(!(obj instanceof DataMap))
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class DataMap>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		else
			return zza(this, (DataMap)obj);
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:checkcast       #2   <Class DataMap>
	//    8   14:invokestatic    #346 <Method boolean zza(DataMap, DataMap)>
	//    9   17:ireturn         
	}

	public Object get(String s)
	{
		return zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:areturn         
	}

	public Asset getAsset(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		Asset asset;
		try
		{
			asset = (Asset)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #54  <Class Asset>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "Asset", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #356 <String "Asset">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return asset;
	}

	public boolean getBoolean(String s)
	{
		return getBoolean(s, false);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #362 <Method boolean getBoolean(String, boolean)>
	//    4    6:ireturn         
	}

	public boolean getBoolean(String s, boolean flag)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore          4
		if(obj == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       17
			return flag;
	//    7   15:iload_2         
	//    8   16:ireturn         
		boolean flag1;
		try
		{
			flag1 = ((Boolean)obj).booleanValue();
	//    9   17:aload           4
	//   10   19:checkcast       #155 <Class Boolean>
	//   11   22:invokevirtual   #158 <Method boolean Boolean.booleanValue()>
	//   12   25:istore_3        
		}
	//*  13   26:iload_3         
	//*  14   27:ireturn         
		catch(ClassCastException classcastexception)
	//*  15   28:astore          5
		{
			zza(s, obj, "Boolean", ((Object) (Boolean.valueOf(flag))), classcastexception);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload           4
	//   19   34:ldc2            #364 <String "Boolean">
	//   20   37:iload_2         
	//   21   38:invokestatic    #368 <Method Boolean Boolean.valueOf(boolean)>
	//   22   41:aload           5
	//   23   43:invokespecial   #226 <Method void zza(String, Object, String, Object, ClassCastException)>
			return flag;
	//   24   46:iload_2         
	//   25   47:ireturn         
		}
		return flag1;
	}

	public byte getByte(String s)
	{
		return getByte(s, (byte)0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #373 <Method byte getByte(String, byte)>
	//    4    6:ireturn         
	}

	public byte getByte(String s, byte byte0)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore          4
		if(obj == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       17
			return byte0;
	//    7   15:iload_2         
	//    8   16:ireturn         
		byte byte1;
		try
		{
			byte1 = ((Byte)obj).byteValue();
	//    9   17:aload           4
	//   10   19:checkcast       #164 <Class Byte>
	//   11   22:invokevirtual   #168 <Method byte Byte.byteValue()>
	//   12   25:istore_3        
		}
	//*  13   26:iload_3         
	//*  14   27:ireturn         
		catch(ClassCastException classcastexception)
	//*  15   28:astore          5
		{
			zza(s, obj, "Byte", ((Object) (Byte.valueOf(byte0))), classcastexception);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload           4
	//   19   34:ldc2            #375 <String "Byte">
	//   20   37:iload_2         
	//   21   38:invokestatic    #378 <Method Byte Byte.valueOf(byte)>
	//   22   41:aload           5
	//   23   43:invokespecial   #226 <Method void zza(String, Object, String, Object, ClassCastException)>
			return byte0;
	//   24   46:iload_2         
	//   25   47:ireturn         
		}
		return byte1;
	}

	public byte[] getByteArray(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		byte abyte0[];
		try
		{
			abyte0 = (byte[])obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #174 <Class byte[]>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "byte[]", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #382 <String "byte[]">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return abyte0;
	}

	public DataMap getDataMap(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		DataMap datamap;
		try
		{
			datamap = (DataMap)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #2   <Class DataMap>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "DataMap", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc1            #8   <String "DataMap">
	//   19   28:aload_3         
	//   20   29:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   32:aconst_null     
	//   22   33:areturn         
		}
		return datamap;
	}

	public ArrayList getDataMapArrayList(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		ArrayList arraylist;
		try
		{
			arraylist = (ArrayList)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #25  <Class ArrayList>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "ArrayList<DataMap>", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #388 <String "ArrayList<DataMap>">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return arraylist;
	}

	public double getDouble(String s)
	{
		return getDouble(s, 0.0D);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:dconst_0        
	//    3    3:invokevirtual   #394 <Method double getDouble(String, double)>
	//    4    6:dreturn         
	}

	public double getDouble(String s, double d)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore          6
		if(obj == null)
	//*   5   10:aload           6
	//*   6   12:ifnonnull       17
			return d;
	//    7   15:dload_2         
	//    8   16:dreturn         
		double d1;
		try
		{
			d1 = ((Double)obj).doubleValue();
	//    9   17:aload           6
	//   10   19:checkcast       #135 <Class Double>
	//   11   22:invokevirtual   #139 <Method double Double.doubleValue()>
	//   12   25:dstore          4
		}
	//*  13   27:dload           4
	//*  14   29:dreturn         
		catch(ClassCastException classcastexception)
	//*  15   30:astore          7
		{
			zza(s, obj, "Double", ((Object) (Double.valueOf(d))), classcastexception);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:aload           6
	//   19   36:ldc2            #396 <String "Double">
	//   20   39:dload_2         
	//   21   40:invokestatic    #399 <Method Double Double.valueOf(double)>
	//   22   43:aload           7
	//   23   45:invokespecial   #226 <Method void zza(String, Object, String, Object, ClassCastException)>
			return d;
	//   24   48:dload_2         
	//   25   49:dreturn         
		}
		return d1;
	}

	public float getFloat(String s)
	{
		return getFloat(s, 0.0F);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:fconst_0        
	//    3    3:invokevirtual   #404 <Method float getFloat(String, float)>
	//    4    6:freturn         
	}

	public float getFloat(String s, float f)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore          4
		if(obj == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       17
			return f;
	//    7   15:fload_2         
	//    8   16:freturn         
		float f1;
		try
		{
			f1 = ((Float)obj).floatValue();
	//    9   17:aload           4
	//   10   19:checkcast       #145 <Class Float>
	//   11   22:invokevirtual   #149 <Method float Float.floatValue()>
	//   12   25:fstore_3        
		}
	//*  13   26:fload_3         
	//*  14   27:freturn         
		catch(ClassCastException classcastexception)
	//*  15   28:astore          5
		{
			zza(s, obj, "Float", ((Object) (Float.valueOf(f))), classcastexception);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload           4
	//   19   34:ldc2            #406 <String "Float">
	//   20   37:fload_2         
	//   21   38:invokestatic    #409 <Method Float Float.valueOf(float)>
	//   22   41:aload           5
	//   23   43:invokespecial   #226 <Method void zza(String, Object, String, Object, ClassCastException)>
			return f;
	//   24   46:fload_2         
	//   25   47:freturn         
		}
		return f1;
	}

	public float[] getFloatArray(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		float af[];
		try
		{
			af = (float[])obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #192 <Class float[]>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "float[]", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #413 <String "float[]">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return af;
	}

	public int getInt(String s)
	{
		return getInt(s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokevirtual   #418 <Method int getInt(String, int)>
	//    4    6:ireturn         
	}

	public int getInt(String s, int i)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore          4
		if(obj == null)
	//*   5   10:aload           4
	//*   6   12:ifnonnull       17
			return i;
	//    7   15:iload_2         
	//    8   16:ireturn         
		int j;
		try
		{
			j = ((Integer)obj).intValue();
	//    9   17:aload           4
	//   10   19:checkcast       #115 <Class Integer>
	//   11   22:invokevirtual   #119 <Method int Integer.intValue()>
	//   12   25:istore_3        
		}
	//*  13   26:iload_3         
	//*  14   27:ireturn         
		catch(ClassCastException classcastexception)
	//*  15   28:astore          5
		{
			zza(s, obj, "Integer", classcastexception);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:aload           4
	//   19   34:ldc2            #420 <String "Integer">
	//   20   37:aload           5
	//   21   39:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return i;
	//   22   42:iload_2         
	//   23   43:ireturn         
		}
		return j;
	}

	public ArrayList getIntegerArrayList(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		ArrayList arraylist;
		try
		{
			arraylist = (ArrayList)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #25  <Class ArrayList>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "ArrayList<Integer>", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #423 <String "ArrayList<Integer>">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return arraylist;
	}

	public long getLong(String s)
	{
		return getLong(s, 0L);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_0        
	//    3    3:invokevirtual   #429 <Method long getLong(String, long)>
	//    4    6:lreturn         
	}

	public long getLong(String s, long l)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore          6
		if(obj == null)
	//*   5   10:aload           6
	//*   6   12:ifnonnull       17
			return l;
	//    7   15:lload_2         
	//    8   16:lreturn         
		long l1;
		try
		{
			l1 = ((Long)obj).longValue();
	//    9   17:aload           6
	//   10   19:checkcast       #125 <Class Long>
	//   11   22:invokevirtual   #129 <Method long Long.longValue()>
	//   12   25:lstore          4
		}
	//*  13   27:lload           4
	//*  14   29:lreturn         
		catch(ClassCastException classcastexception)
	//*  15   30:astore          7
		{
			zza(s, obj, "long", classcastexception);
	//   16   32:aload_0         
	//   17   33:aload_1         
	//   18   34:aload           6
	//   19   36:ldc2            #431 <String "long">
	//   20   39:aload           7
	//   21   41:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return l;
	//   22   44:lload_2         
	//   23   45:lreturn         
		}
		return l1;
	}

	public long[] getLongArray(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		long al[];
		try
		{
			al = (long[])obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #186 <Class long[]>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "long[]", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #435 <String "long[]">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return al;
	}

	public String getString(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		String s1;
		try
		{
			s1 = (String)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #74  <Class String>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "String", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #439 <String "String">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return s1;
	}

	public String getString(String s, String s1)
	{
		s = getString(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #442 <Method String getString(String)>
	//    3    5:astore_1        
		if(s == null)
	//*   4    6:aload_1         
	//*   5    7:ifnonnull       12
			return s1;
	//    6   10:aload_2         
	//    7   11:areturn         
		else
			return s;
	//    8   12:aload_1         
	//    9   13:areturn         
	}

	public String[] getStringArray(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		String as[];
		try
		{
			as = (String[])obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #180 <Class String[]>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "String[]", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #446 <String "String[]">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return as;
	}

	public ArrayList getStringArrayList(String s)
	{
		Object obj = zzru.get(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//    4    8:astore_2        
		if(obj == null)
	//*   5    9:aload_2         
	//*   6   10:ifnonnull       15
			return null;
	//    7   13:aconst_null     
	//    8   14:areturn         
		ArrayList arraylist;
		try
		{
			arraylist = (ArrayList)obj;
	//    9   15:aload_2         
	//   10   16:checkcast       #25  <Class ArrayList>
	//   11   19:astore_3        
		}
	//*  12   20:aload_3         
	//*  13   21:areturn         
		catch(ClassCastException classcastexception)
	//*  14   22:astore_3        
		{
			zza(s, obj, "ArrayList<String>", classcastexception);
	//   15   23:aload_0         
	//   16   24:aload_1         
	//   17   25:aload_2         
	//   18   26:ldc2            #449 <String "ArrayList<String>">
	//   19   29:aload_3         
	//   20   30:invokespecial   #358 <Method void zza(String, Object, String, ClassCastException)>
			return null;
	//   21   33:aconst_null     
	//   22   34:areturn         
		}
		return arraylist;
	}

	public int hashCode()
	{
		return zzru.hashCode() * 29;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:invokevirtual   #453 <Method int HashMap.hashCode()>
	//    3    7:bipush          29
	//    4    9:imul            
	//    5   10:ireturn         
	}

	public boolean isEmpty()
	{
		return zzru.isEmpty();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:invokevirtual   #454 <Method boolean HashMap.isEmpty()>
	//    3    7:ireturn         
	}

	public Set keySet()
	{
		return zzru.keySet();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:invokevirtual   #455 <Method Set HashMap.keySet()>
	//    3    7:areturn         
	}

	public void putAll(DataMap datamap)
	{
		String s;
		for(Iterator iterator = datamap.keySet().iterator(); iterator.hasNext(); zzru.put(((Object) (s)), datamap.get(s)))
	//*   0    0:aload_1         
	//*   1    1:invokevirtual   #295 <Method Set keySet()>
	//*   2    4:invokeinterface #72  <Method Iterator Set.iterator()>
	//*   3    9:astore_2        
	//*   4   10:aload_2         
	//*   5   11:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            46
			s = (String)iterator.next();
	//    7   19:aload_2         
	//    8   20:invokeinterface #40  <Method Object Iterator.next()>
	//    9   25:checkcast       #74  <Class String>
	//   10   28:astore_3        

	//   11   29:aload_0         
	//   12   30:getfield        #20  <Field HashMap zzru>
	//   13   33:aload_3         
	//   14   34:aload_1         
	//   15   35:aload_3         
	//   16   36:invokevirtual   #296 <Method Object get(String)>
	//   17   39:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//   18   42:pop             
	//*  19   43:goto            10
	//   20   46:return          
	}

	public void putAsset(String s, Asset asset)
	{
		zzru.put(((Object) (s)), ((Object) (asset)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putBoolean(String s, boolean flag)
	{
		zzru.put(((Object) (s)), ((Object) (Boolean.valueOf(flag))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #368 <Method Boolean Boolean.valueOf(boolean)>
	//    5    9:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void putByte(String s, byte byte0)
	{
		zzru.put(((Object) (s)), ((Object) (Byte.valueOf(byte0))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #378 <Method Byte Byte.valueOf(byte)>
	//    5    9:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void putByteArray(String s, byte abyte0[])
	{
		zzru.put(((Object) (s)), ((Object) (abyte0)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putDataMap(String s, DataMap datamap)
	{
		zzru.put(((Object) (s)), ((Object) (datamap)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putDataMapArrayList(String s, ArrayList arraylist)
	{
		zzru.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putDouble(String s, double d)
	{
		zzru.put(((Object) (s)), ((Object) (Double.valueOf(d))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:dload_2         
	//    4    6:invokestatic    #399 <Method Double Double.valueOf(double)>
	//    5    9:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void putFloat(String s, float f)
	{
		zzru.put(((Object) (s)), ((Object) (Float.valueOf(f))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:fload_2         
	//    4    6:invokestatic    #409 <Method Float Float.valueOf(float)>
	//    5    9:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void putFloatArray(String s, float af[])
	{
		zzru.put(((Object) (s)), ((Object) (af)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putInt(String s, int i)
	{
		zzru.put(((Object) (s)), ((Object) (Integer.valueOf(i))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #466 <Method Integer Integer.valueOf(int)>
	//    5    9:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void putIntegerArrayList(String s, ArrayList arraylist)
	{
		zzru.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putLong(String s, long l)
	{
		zzru.put(((Object) (s)), ((Object) (Long.valueOf(l))));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:lload_2         
	//    4    6:invokestatic    #470 <Method Long Long.valueOf(long)>
	//    5    9:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    6   12:pop             
	//    7   13:return          
	}

	public void putLongArray(String s, long al[])
	{
		zzru.put(((Object) (s)), ((Object) (al)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putString(String s, String s1)
	{
		zzru.put(((Object) (s)), ((Object) (s1)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putStringArray(String s, String as[])
	{
		zzru.put(((Object) (s)), ((Object) (as)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public void putStringArrayList(String s, ArrayList arraylist)
	{
		zzru.put(((Object) (s)), ((Object) (arraylist)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:aload_2         
	//    4    6:invokevirtual   #462 <Method Object HashMap.put(Object, Object)>
	//    5    9:pop             
	//    6   10:return          
	}

	public Object remove(String s)
	{
		return zzru.remove(((Object) (s)));
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #474 <Method Object HashMap.remove(Object)>
	//    4    8:areturn         
	}

	public int size()
	{
		return zzru.size();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:invokevirtual   #475 <Method int HashMap.size()>
	//    3    7:ireturn         
	}

	public Bundle toBundle()
	{
		Bundle bundle = new Bundle();
	//    0    0:new             #42  <Class Bundle>
	//    1    3:dup             
	//    2    4:invokespecial   #476 <Method void Bundle()>
	//    3    7:astore_1        
		String s;
		for(Iterator iterator = zzru.keySet().iterator(); iterator.hasNext(); zzb(bundle, s, zzru.get(((Object) (s)))))
	//*   4    8:aload_0         
	//*   5    9:getfield        #20  <Field HashMap zzru>
	//*   6   12:invokevirtual   #455 <Method Set HashMap.keySet()>
	//*   7   15:invokeinterface #72  <Method Iterator Set.iterator()>
	//*   8   20:astore_2        
	//*   9   21:aload_2         
	//*  10   22:invokeinterface #36  <Method boolean Iterator.hasNext()>
	//*  11   27:ifeq            56
			s = (String)iterator.next();
	//   12   30:aload_2         
	//   13   31:invokeinterface #40  <Method Object Iterator.next()>
	//   14   36:checkcast       #74  <Class String>
	//   15   39:astore_3        

	//   16   40:aload_1         
	//   17   41:aload_3         
	//   18   42:aload_0         
	//   19   43:getfield        #20  <Field HashMap zzru>
	//   20   46:aload_3         
	//   21   47:invokevirtual   #349 <Method Object HashMap.get(Object)>
	//   22   50:invokestatic    #478 <Method void zzb(Bundle, String, Object)>
	//*  23   53:goto            21
		return bundle;
	//   24   56:aload_1         
	//   25   57:areturn         
	}

	public byte[] toByteArray()
	{
		return zzbxt.zzf(((zzbxt) (zzblc.zza(this).zzbVs)));
	//    0    0:aload_0         
	//    1    1:invokestatic    #482 <Method com.google.android.gms.internal.zzblc$zza zzblc.zza(DataMap)>
	//    2    4:getfield        #486 <Field zzbld com.google.android.gms.internal.zzblc$zza.zzbVs>
	//    3    7:invokestatic    #492 <Method byte[] zzbxt.zzf(zzbxt)>
	//    4   10:areturn         
	}

	public String toString()
	{
		return zzru.toString();
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field HashMap zzru>
	//    2    4:invokevirtual   #493 <Method String HashMap.toString()>
	//    3    7:areturn         
	}

	public static final String TAG = "DataMap";
	private final HashMap zzru = new HashMap();
}
