// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.ndk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.crashlytics.android.core.internal.models.*;
import com.newrelic.agent.android.instrumentation.JSONObjectInstrumentation;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import org.json.*;

// Referenced classes of package com.crashlytics.android.ndk:
//			Sha1FileIdStrategy, CrashlyticsNdk, ProcMapEntry, ProcMapEntryParser, 
//			FileIdStrategy

class JsonCrashDataParser
{

	public JsonCrashDataParser()
	{
		this(((FileIdStrategy) (new Sha1FileIdStrategy())));
	//    0    0:aload_0         
	//    1    1:new             #31  <Class Sha1FileIdStrategy>
	//    2    4:dup             
	//    3    5:invokespecial   #33  <Method void Sha1FileIdStrategy()>
	//    4    8:invokespecial   #36  <Method void JsonCrashDataParser(FileIdStrategy)>
	//    5   11:return          
	}

	JsonCrashDataParser(FileIdStrategy fileidstrategy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		fileIdStrategy = fileidstrategy;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #39  <Field FileIdStrategy fileIdStrategy>
	//    5    9:return          
	}

	private static File correctDataPath(File file)
	{
		if(!file.getAbsolutePath().startsWith("/data"))
			break MISSING_BLOCK_LABEL_62;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #49  <Method String File.getAbsolutePath()>
	//    2    4:ldc1            #51  <String "/data">
	//    3    6:invokevirtual   #57  <Method boolean String.startsWith(String)>
	//    4    9:ifeq            62
		Object obj;
		obj = ((Object) (CrashlyticsNdk.getInstance().getContext()));
	//    5   12:invokestatic    #63  <Method CrashlyticsNdk CrashlyticsNdk.getInstance()>
	//    6   15:invokevirtual   #67  <Method Context CrashlyticsNdk.getContext()>
	//    7   18:astore_1        
		obj = ((Object) (new File(((Context) (obj)).getPackageManager().getApplicationInfo(((Context) (obj)).getPackageName(), 0).nativeLibraryDir, file.getName())));
	//    8   19:new             #45  <Class File>
	//    9   22:dup             
	//   10   23:aload_1         
	//   11   24:invokevirtual   #73  <Method PackageManager Context.getPackageManager()>
	//   12   27:aload_1         
	//   13   28:invokevirtual   #76  <Method String Context.getPackageName()>
	//   14   31:iconst_0        
	//   15   32:invokevirtual   #82  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   16   35:getfield        #88  <Field String ApplicationInfo.nativeLibraryDir>
	//   17   38:aload_0         
	//   18   39:invokevirtual   #91  <Method String File.getName()>
	//   19   42:invokespecial   #94  <Method void File(String, String)>
	//   20   45:astore_1        
		return ((File) (obj));
	//   21   46:aload_1         
	//   22   47:areturn         
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
	//   23   48:astore_1        
		Fabric.getLogger().e("JsonCrashDataParser", "Error getting ApplicationInfo", ((Throwable) (namenotfoundexception)));
	//   24   49:invokestatic    #100 <Method Logger Fabric.getLogger()>
	//   25   52:ldc1            #102 <String "JsonCrashDataParser">
	//   26   54:ldc1            #104 <String "Error getting ApplicationInfo">
	//   27   56:aload_1         
	//   28   57:invokeinterface #110 <Method void Logger.e(String, String, Throwable)>
		return file;
	//   29   62:aload_0         
	//   30   63:areturn         
	}

	private static File getLibraryFile(String s)
	{
		File file = new File(s);
	//    0    0:new             #45  <Class File>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #115 <Method void File(String)>
	//    4    8:astore_1        
		s = ((String) (file));
	//    5    9:aload_1         
	//    6   10:astore_0        
		if(!file.exists())
	//*   7   11:aload_1         
	//*   8   12:invokevirtual   #119 <Method boolean File.exists()>
	//*   9   15:ifne            23
			s = ((String) (correctDataPath(file)));
	//   10   18:aload_1         
	//   11   19:invokestatic    #121 <Method File correctDataPath(File)>
	//   12   22:astore_0        
		return ((File) (s));
	//   13   23:aload_0         
	//   14   24:areturn         
	}

	private static boolean isRelevant(ProcMapEntry procmapentry)
	{
		return procmapentry.perms.indexOf('x') != -1 && procmapentry.path.indexOf('/') != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #128 <Field String ProcMapEntry.perms>
	//    2    4:bipush          120
	//    3    6:invokevirtual   #132 <Method int String.indexOf(int)>
	//    4    9:iconst_m1       
	//    5   10:icmpeq          28
	//    6   13:aload_0         
	//    7   14:getfield        #135 <Field String ProcMapEntry.path>
	//    8   17:bipush          47
	//    9   19:invokevirtual   #132 <Method int String.indexOf(int)>
	//   10   22:iconst_m1       
	//   11   23:icmpeq          28
	//   12   26:iconst_1        
	//   13   27:ireturn         
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	private static String joinMapsEntries(JSONArray jsonarray)
		throws JSONException
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #141 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #142 <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #148 <Method int JSONArray.length()>
	//*   9   15:icmpge          35
			stringbuilder.append(jsonarray.getString(i));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #152 <Method String JSONArray.getString(int)>
	//   14   24:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             

	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
	//*  20   32:goto            10
		return stringbuilder.toString();
	//   21   35:aload_2         
	//   22   36:invokevirtual   #159 <Method String StringBuilder.toString()>
	//   23   39:areturn         
	}

	public BinaryImageData[] parseBinaryImageData(JSONObject jsonobject)
	{
		if(jsonobject == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       8
			return EMPTY_BINARY_IMAGES;
	//    2    4:getstatic       #19  <Field BinaryImageData[] EMPTY_BINARY_IMAGES>
	//    3    7:areturn         
		LinkedList linkedlist;
		try
		{
			jsonobject = ((JSONObject) (joinMapsEntries(jsonobject.getJSONArray("maps"))));
	//    4    8:aload_1         
	//    5    9:ldc1            #166 <String "maps">
	//    6   11:invokevirtual   #172 <Method JSONArray JSONObject.getJSONArray(String)>
	//    7   14:invokestatic    #174 <Method String joinMapsEntries(JSONArray)>
	//    8   17:astore_1        
		}
	//*   9   18:aload_1         
	//*  10   19:ldc1            #176 <String "\\|">
	//*  11   21:invokevirtual   #180 <Method String[] String.split(String)>
	//*  12   24:astore_1        
	//*  13   25:new             #182 <Class LinkedList>
	//*  14   28:dup             
	//*  15   29:invokespecial   #183 <Method void LinkedList()>
	//*  16   32:astore_3        
	//*  17   33:iconst_0        
	//*  18   34:istore_2        
	//*  19   35:iload_2         
	//*  20   36:aload_1         
	//*  21   37:arraylength     
	//*  22   38:icmpge          181
	//*  23   41:aload_1         
	//*  24   42:iload_2         
	//*  25   43:aaload          
	//*  26   44:invokestatic    #189 <Method ProcMapEntry ProcMapEntryParser.parse(String)>
	//*  27   47:astore          4
	//*  28   49:aload           4
	//*  29   51:ifnull          174
	//*  30   54:aload           4
	//*  31   56:invokestatic    #191 <Method boolean isRelevant(ProcMapEntry)>
	//*  32   59:ifne            65
	//*  33   62:goto            174
	//*  34   65:aload           4
	//*  35   67:getfield        #135 <Field String ProcMapEntry.path>
	//*  36   70:astore          5
	//*  37   72:aload           5
	//*  38   74:invokestatic    #193 <Method File getLibraryFile(String)>
	//*  39   77:astore          6
	//*  40   79:aload_0         
	//*  41   80:getfield        #39  <Field FileIdStrategy fileIdStrategy>
	//*  42   83:aload           6
	//*  43   85:invokeinterface #199 <Method String FileIdStrategy.getId(File)>
	//*  44   90:astore          6
	//*  45   92:aload_3         
	//*  46   93:new             #17  <Class BinaryImageData>
	//*  47   96:dup             
	//*  48   97:aload           4
	//*  49   99:getfield        #203 <Field long ProcMapEntry.address>
	//*  50  102:aload           4
	//*  51  104:getfield        #206 <Field long ProcMapEntry.size>
	//*  52  107:aload           5
	//*  53  109:aload           6
	//*  54  111:invokespecial   #209 <Method void BinaryImageData(long, long, String, String)>
	//*  55  114:invokeinterface #215 <Method boolean List.add(Object)>
	//*  56  119:pop             
	//*  57  120:goto            174
	//*  58  123:astore          5
	//*  59  125:invokestatic    #100 <Method Logger Fabric.getLogger()>
	//*  60  128:astore          6
	//*  61  130:new             #141 <Class StringBuilder>
	//*  62  133:dup             
	//*  63  134:invokespecial   #142 <Method void StringBuilder()>
	//*  64  137:astore          7
	//*  65  139:aload           7
	//*  66  141:ldc1            #217 <String "Could not generate ID for file ">
	//*  67  143:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//*  68  146:pop             
	//*  69  147:aload           7
	//*  70  149:aload           4
	//*  71  151:getfield        #135 <Field String ProcMapEntry.path>
	//*  72  154:invokevirtual   #156 <Method StringBuilder StringBuilder.append(String)>
	//*  73  157:pop             
	//*  74  158:aload           6
	//*  75  160:ldc1            #102 <String "JsonCrashDataParser">
	//*  76  162:aload           7
	//*  77  164:invokevirtual   #159 <Method String StringBuilder.toString()>
	//*  78  167:aload           5
	//*  79  169:invokeinterface #220 <Method void Logger.d(String, String, Throwable)>
	//*  80  174:iload_2         
	//*  81  175:iconst_1        
	//*  82  176:iadd            
	//*  83  177:istore_2        
	//*  84  178:goto            35
	//*  85  181:aload_3         
	//*  86  182:aload_3         
	//*  87  183:invokeinterface #222 <Method int List.size()>
	//*  88  188:anewarray       BinaryImageData[]
	//*  89  191:invokeinterface #226 <Method Object[] List.toArray(Object[])>
	//*  90  196:checkcast       #227 <Class BinaryImageData[]>
	//*  91  199:areturn         
	//*  92  200:getstatic       #19  <Field BinaryImageData[] EMPTY_BINARY_IMAGES>
	//*  93  203:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONObject jsonobject)
		{
			return EMPTY_BINARY_IMAGES;
		}
		jsonobject = ((JSONObject) (((String) (jsonobject)).split("\\|")));
		linkedlist = new LinkedList();
		for(int i = 0; i < jsonobject.length;)
		{
			ProcMapEntry procmapentry = ProcMapEntryParser.parse(((String) (jsonobject[i])));
			if(procmapentry == null || !isRelevant(procmapentry))
				continue;
			String s = procmapentry.path;
			Object obj = ((Object) (getLibraryFile(s)));
			try
			{
				obj = ((Object) (fileIdStrategy.getId(((File) (obj)))));
				((List) (linkedlist)).add(((Object) (new BinaryImageData(procmapentry.address, procmapentry.size, s, ((String) (obj))))));
				continue;
			}
			catch(IOException ioexception)
			{
				Logger logger = Fabric.getLogger();
				StringBuilder stringbuilder = new StringBuilder();
				stringbuilder.append("Could not generate ID for file ");
				stringbuilder.append(procmapentry.path);
				logger.d("JsonCrashDataParser", stringbuilder.toString(), ((Throwable) (ioexception)));
				i++;
			}
		}

		return (BinaryImageData[])((List) (linkedlist)).toArray(((Object []) (new BinaryImageData[((List) (linkedlist)).size()])));
	//*  94  204:astore_1        
	//*  95  205:goto            200
	}

	public SessionEventData parseCrashEventData(String s)
		throws JSONException
	{
		int i;
		Object obj;
		JSONObject jsonobject2;
		JSONObject jsonobject3;
		JSONObject jsonobject4;
		JSONObject jsonobject5;
		JSONObject jsonobject6;
		Object obj1;
		String as[];
		as = s.split("\\n");
	//    0    0:aload_1         
	//    1    1:ldc1            #231 <String "\\n">
	//    2    3:invokevirtual   #180 <Method String[] String.split(String)>
	//    3    6:astore          13
		obj1 = null;
	//    4    8:aconst_null     
	//    5    9:astore          12
		i = 0;
	//    6   11:iconst_0        
	//    7   12:istore_2        
		jsonobject5 = null;
	//    8   13:aconst_null     
	//    9   14:astore          10
		JSONObject jsonobject = jsonobject5;
	//   10   16:aload           10
	//   11   18:astore          5
		obj = ((Object) (jsonobject));
	//   12   20:aload           5
	//   13   22:astore          6
		jsonobject2 = ((JSONObject) (obj));
	//   14   24:aload           6
	//   15   26:astore          7
		jsonobject3 = jsonobject2;
	//   16   28:aload           7
	//   17   30:astore          8
		jsonobject4 = jsonobject3;
	//   18   32:aload           8
	//   19   34:astore          9
		jsonobject6 = jsonobject;
	//   20   36:aload           5
	//   21   38:astore          11
_L2:
		if(i >= as.length)
			break; /* Loop/switch isn't completed */
	//   22   40:iload_2         
	//   23   41:aload           13
	//   24   43:arraylength     
	//   25   44:icmpge          153
		JSONObject jsonobject1 = JSONObjectInstrumentation.init(as[i]);
	//   26   47:aload           13
	//   27   49:iload_2         
	//   28   50:aaload          
	//   29   51:invokestatic    #237 <Method JSONObject JSONObjectInstrumentation.init(String)>
	//   30   54:astore          5
		switch(i)
	//*  31   56:iload_2         
		{
	//*  32   57:tableswitch     0 7: default 104
	//	               0 142
	//	               1 135
	//	               2 128
	//	               3 104
	//	               4 121
	//	               5 104
	//	               6 114
	//	               7 107
	//*  33  104:goto            146
		case 7: // '\007'
			jsonobject2 = jsonobject1;
	//   34  107:aload           5
	//   35  109:astore          7
			break;

	//*  36  111:goto            146
		case 6: // '\006'
			jsonobject4 = jsonobject1;
	//   37  114:aload           5
	//   38  116:astore          9
			break;

	//*  39  118:goto            146
		case 4: // '\004'
			jsonobject3 = jsonobject1;
	//   40  121:aload           5
	//   41  123:astore          8
			break;

	//*  42  125:goto            146
		case 2: // '\002'
			obj = ((Object) (jsonobject1));
	//   43  128:aload           5
	//   44  130:astore          6
			break;

	//*  45  132:goto            146
		case 1: // '\001'
			jsonobject6 = jsonobject1;
	//   46  135:aload           5
	//   47  137:astore          11
			break;

	//*  48  139:goto            146
		case 0: // '\0'
			jsonobject5 = jsonobject1;
	//   49  142:aload           5
	//   50  144:astore          10
			break;
		}
		i++;
	//   51  146:iload_2         
	//   52  147:iconst_1        
	//   53  148:iadd            
	//   54  149:istore_2        
		if(true) goto _L2; else goto _L1
	//   55  150:goto            40
_L1:
		if(obj != null && jsonobject6 != null && jsonobject5 != null)
	//*  56  153:aload           6
	//*  57  155:ifnull          252
	//*  58  158:aload           11
	//*  59  160:ifnull          252
	//*  60  163:aload           10
	//*  61  165:ifnull          252
		{
			long l = ((JSONObject) (obj)).getLong("time");
	//   62  168:aload           6
	//   63  170:ldc1            #239 <String "time">
	//   64  172:invokevirtual   #243 <Method long JSONObject.getLong(String)>
	//   65  175:lstore_3        
			obj = ((Object) (parseSignalData(jsonobject6)));
	//   66  176:aload_0         
	//   67  177:aload           11
	//   68  179:invokevirtual   #247 <Method SignalData parseSignalData(JSONObject)>
	//   69  182:astore          6
			ThreadData athreaddata[];
			if(jsonobject2 == null)
	//*  70  184:aload           7
	//*  71  186:ifnonnull       200
				athreaddata = parseTopFrameData(jsonobject5);
	//   72  189:aload_0         
	//   73  190:aload           10
	//   74  192:invokevirtual   #251 <Method ThreadData[] parseTopFrameData(JSONObject)>
	//   75  195:astore          5
			else
	//*  76  197:goto            208
				athreaddata = parseThreadData(jsonobject2);
	//   77  200:aload_0         
	//   78  201:aload           7
	//   79  203:invokevirtual   #254 <Method ThreadData[] parseThreadData(JSONObject)>
	//   80  206:astore          5
			CustomAttributeData acustomattributedata[] = parseCustomAttributes(s);
	//   81  208:aload_0         
	//   82  209:aload_1         
	//   83  210:invokevirtual   #258 <Method CustomAttributeData[] parseCustomAttributes(String)>
	//   84  213:astore          7
			s = ((String) (obj1));
	//   85  215:aload           12
	//   86  217:astore_1        
			if(jsonobject3 != null)
	//*  87  218:aload           8
	//*  88  220:ifnull          230
				s = ((String) (parseDeviceData(jsonobject3)));
	//   89  223:aload_0         
	//   90  224:aload           8
	//   91  226:invokevirtual   #262 <Method DeviceData parseDeviceData(JSONObject)>
	//   92  229:astore_1        
			return new SessionEventData(l, ((SignalData) (obj)), athreaddata, parseBinaryImageData(jsonobject4), acustomattributedata, ((DeviceData) (s)));
	//   93  230:new             #264 <Class SessionEventData>
	//   94  233:dup             
	//   95  234:lload_3         
	//   96  235:aload           6
	//   97  237:aload           5
	//   98  239:aload_0         
	//   99  240:aload           9
	//  100  242:invokevirtual   #266 <Method BinaryImageData[] parseBinaryImageData(JSONObject)>
	//  101  245:aload           7
	//  102  247:aload_1         
	//  103  248:invokespecial   #269 <Method void SessionEventData(long, SignalData, ThreadData[], BinaryImageData[], CustomAttributeData[], DeviceData)>
	//  104  251:areturn         
		} else
		{
			throw new JSONException("Could not parse required crash data");
	//  105  252:new             #139 <Class JSONException>
	//  106  255:dup             
	//  107  256:ldc2            #271 <String "Could not parse required crash data">
	//  108  259:invokespecial   #272 <Method void JSONException(String)>
	//  109  262:athrow          
		}
		JSONException jsonexception;
		jsonexception;
	//  110  263:astore          5
		if(true) goto _L1; else goto _L3
	//  111  265:goto            153
_L3:
	}

	public CustomAttributeData[] parseCustomAttributes(String s)
	{
		return (new CustomAttributeData[] {
			new CustomAttributeData("json_session", s)
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       CustomAttributeData[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #274 <Class CustomAttributeData>
	//    5    9:dup             
	//    6   10:ldc2            #276 <String "json_session">
	//    7   13:aload_1         
	//    8   14:invokespecial   #277 <Method void CustomAttributeData(String, String)>
	//    9   17:aastore         
	//   10   18:areturn         
	}

	public DeviceData parseDeviceData(JSONObject jsonobject)
	{
		return new DeviceData(jsonobject.optInt("orientation"), jsonobject.optLong("total_physical_memory"), jsonobject.optLong("total_internal_storage"), jsonobject.optLong("available_physical_memory"), jsonobject.optLong("available_internal_storage"), jsonobject.optInt("battery"), jsonobject.optInt("battery_velocity", 1), jsonobject.optBoolean("proximity_enabled", false));
	//    0    0:new             #279 <Class DeviceData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc2            #281 <String "orientation">
	//    4    8:invokevirtual   #285 <Method int JSONObject.optInt(String)>
	//    5   11:aload_1         
	//    6   12:ldc2            #287 <String "total_physical_memory">
	//    7   15:invokevirtual   #290 <Method long JSONObject.optLong(String)>
	//    8   18:aload_1         
	//    9   19:ldc2            #292 <String "total_internal_storage">
	//   10   22:invokevirtual   #290 <Method long JSONObject.optLong(String)>
	//   11   25:aload_1         
	//   12   26:ldc2            #294 <String "available_physical_memory">
	//   13   29:invokevirtual   #290 <Method long JSONObject.optLong(String)>
	//   14   32:aload_1         
	//   15   33:ldc2            #296 <String "available_internal_storage">
	//   16   36:invokevirtual   #290 <Method long JSONObject.optLong(String)>
	//   17   39:aload_1         
	//   18   40:ldc2            #298 <String "battery">
	//   19   43:invokevirtual   #285 <Method int JSONObject.optInt(String)>
	//   20   46:aload_1         
	//   21   47:ldc2            #300 <String "battery_velocity">
	//   22   50:iconst_1        
	//   23   51:invokevirtual   #303 <Method int JSONObject.optInt(String, int)>
	//   24   54:aload_1         
	//   25   55:ldc2            #305 <String "proximity_enabled">
	//   26   58:iconst_0        
	//   27   59:invokevirtual   #309 <Method boolean JSONObject.optBoolean(String, boolean)>
	//   28   62:invokespecial   #312 <Method void DeviceData(int, long, long, long, long, int, int, boolean)>
	//   29   65:areturn         
	}

	public com.crashlytics.android.core.internal.models.ThreadData.FrameData parseFrame(JSONObject jsonobject, int i)
	{
		long l = jsonobject.optLong("pc");
	//    0    0:aload_1         
	//    1    1:ldc2            #316 <String "pc">
	//    2    4:invokevirtual   #290 <Method long JSONObject.optLong(String)>
	//    3    7:lstore_3        
		String s = jsonobject.optString("symbol");
	//    4    8:aload_1         
	//    5    9:ldc2            #318 <String "symbol">
	//    6   12:invokevirtual   #322 <Method String JSONObject.optString(String)>
	//    7   15:astore          5
		jsonobject = ((JSONObject) (s));
	//    8   17:aload           5
	//    9   19:astore_1        
		if(s == null)
	//*  10   20:aload           5
	//*  11   22:ifnonnull       29
			jsonobject = "";
	//   12   25:ldc2            #324 <String "">
	//   13   28:astore_1        
		return new com.crashlytics.android.core.internal.models.ThreadData.FrameData(l, ((String) (jsonobject)), "", 0L, i);
	//   14   29:new             #25  <Class com.crashlytics.android.core.internal.models.ThreadData$FrameData>
	//   15   32:dup             
	//   16   33:lload_3         
	//   17   34:aload_1         
	//   18   35:ldc2            #324 <String "">
	//   19   38:lconst_0        
	//   20   39:iload_2         
	//   21   40:invokespecial   #327 <Method void com.crashlytics.android.core.internal.models.ThreadData$FrameData(long, String, String, long, int)>
	//   22   43:areturn         
	}

	public com.crashlytics.android.core.internal.models.ThreadData.FrameData[] parseFrames(JSONObject jsonobject, int i)
	{
		jsonobject = ((JSONObject) (jsonobject.optJSONArray("frames")));
	//    0    0:aload_1         
	//    1    1:ldc2            #331 <String "frames">
	//    2    4:invokevirtual   #334 <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    7:astore_1        
		if(jsonobject == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return EMPTY_FRAMES;
	//    6   12:getstatic       #27  <Field com.crashlytics.android.core.internal.models.ThreadData$FrameData[] EMPTY_FRAMES>
	//    7   15:areturn         
		int k = ((JSONArray) (jsonobject)).length();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #148 <Method int JSONArray.length()>
	//   10   20:istore          4
		com.crashlytics.android.core.internal.models.ThreadData.FrameData aframedata[] = new com.crashlytics.android.core.internal.models.ThreadData.FrameData[k];
	//   11   22:iload           4
	//   12   24:anewarray       com.crashlytics.android.core.internal.models.ThreadData.FrameData[]
	//   13   27:astore          5
		for(int j = 0; j < k; j++)
	//*  14   29:iconst_0        
	//*  15   30:istore_3        
	//*  16   31:iload_3         
	//*  17   32:iload           4
	//*  18   34:icmpge          70
		{
			JSONObject jsonobject1 = ((JSONArray) (jsonobject)).optJSONObject(j);
	//   19   37:aload_1         
	//   20   38:iload_3         
	//   21   39:invokevirtual   #338 <Method JSONObject JSONArray.optJSONObject(int)>
	//   22   42:astore          6
			if(jsonobject1 != null)
	//*  23   44:aload           6
	//*  24   46:ifnonnull       52
	//*  25   49:goto            63
				aframedata[j] = parseFrame(jsonobject1, i);
	//   26   52:aload           5
	//   27   54:iload_3         
	//   28   55:aload_0         
	//   29   56:aload           6
	//   30   58:iload_2         
	//   31   59:invokevirtual   #340 <Method com.crashlytics.android.core.internal.models.ThreadData$FrameData parseFrame(JSONObject, int)>
	//   32   62:aastore         
		}

	//   33   63:iload_3         
	//   34   64:iconst_1        
	//   35   65:iadd            
	//   36   66:istore_3        
	//*  37   67:goto            31
		return aframedata;
	//   38   70:aload           5
	//   39   72:areturn         
	}

	public SignalData parseSignalData(JSONObject jsonobject)
	{
		return new SignalData(jsonobject.optString("sig_name", ""), jsonobject.optString("sig_code", ""), jsonobject.optLong("si_addr"));
	//    0    0:new             #342 <Class SignalData>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:ldc2            #344 <String "sig_name">
	//    4    8:ldc2            #324 <String "">
	//    5   11:invokevirtual   #347 <Method String JSONObject.optString(String, String)>
	//    6   14:aload_1         
	//    7   15:ldc2            #349 <String "sig_code">
	//    8   18:ldc2            #324 <String "">
	//    9   21:invokevirtual   #347 <Method String JSONObject.optString(String, String)>
	//   10   24:aload_1         
	//   11   25:ldc2            #351 <String "si_addr">
	//   12   28:invokevirtual   #290 <Method long JSONObject.optLong(String)>
	//   13   31:invokespecial   #354 <Method void SignalData(String, String, long)>
	//   14   34:areturn         
	}

	public ThreadData[] parseThreadData(JSONObject jsonobject)
	{
		jsonobject = ((JSONObject) (jsonobject.optJSONArray("threads")));
	//    0    0:aload_1         
	//    1    1:ldc2            #356 <String "threads">
	//    2    4:invokevirtual   #334 <Method JSONArray JSONObject.optJSONArray(String)>
	//    3    7:astore_1        
		if(jsonobject == null)
	//*   4    8:aload_1         
	//*   5    9:ifnonnull       16
			return EMPTY_THREADS;
	//    6   12:getstatic       #23  <Field ThreadData[] EMPTY_THREADS>
	//    7   15:areturn         
		int j = ((JSONArray) (jsonobject)).length();
	//    8   16:aload_1         
	//    9   17:invokevirtual   #148 <Method int JSONArray.length()>
	//   10   20:istore          4
		ThreadData athreaddata[] = new ThreadData[j];
	//   11   22:iload           4
	//   12   24:anewarray       ThreadData[]
	//   13   27:astore          5
		for(int i = 0; i < j; i++)
	//*  14   29:iconst_0        
	//*  15   30:istore_2        
	//*  16   31:iload_2         
	//*  17   32:iload           4
	//*  18   34:icmpge          100
		{
			JSONObject jsonobject1 = ((JSONArray) (jsonobject)).optJSONObject(i);
	//   19   37:aload_1         
	//   20   38:iload_2         
	//   21   39:invokevirtual   #338 <Method JSONObject JSONArray.optJSONObject(int)>
	//   22   42:astore          6
			String s = jsonobject1.optString("name");
	//   23   44:aload           6
	//   24   46:ldc2            #358 <String "name">
	//   25   49:invokevirtual   #322 <Method String JSONObject.optString(String)>
	//   26   52:astore          7
			byte byte0;
			if(jsonobject1.optBoolean("crashed"))
	//*  27   54:aload           6
	//*  28   56:ldc2            #360 <String "crashed">
	//*  29   59:invokevirtual   #362 <Method boolean JSONObject.optBoolean(String)>
	//*  30   62:ifeq            70
				byte0 = 4;
	//   31   65:iconst_4        
	//   32   66:istore_3        
			else
	//*  33   67:goto            72
				byte0 = 0;
	//   34   70:iconst_0        
	//   35   71:istore_3        
			athreaddata[i] = new ThreadData(s, ((int) (byte0)), parseFrames(jsonobject1, ((int) (byte0))));
	//   36   72:aload           5
	//   37   74:iload_2         
	//   38   75:new             #21  <Class ThreadData>
	//   39   78:dup             
	//   40   79:aload           7
	//   41   81:iload_3         
	//   42   82:aload_0         
	//   43   83:aload           6
	//   44   85:iload_3         
	//   45   86:invokevirtual   #364 <Method com.crashlytics.android.core.internal.models.ThreadData$FrameData[] parseFrames(JSONObject, int)>
	//   46   89:invokespecial   #367 <Method void ThreadData(String, int, com.crashlytics.android.core.internal.models.ThreadData$FrameData[])>
	//   47   92:aastore         
		}

	//   48   93:iload_2         
	//   49   94:iconst_1        
	//   50   95:iadd            
	//   51   96:istore_2        
	//*  52   97:goto            31
		return athreaddata;
	//   53  100:aload           5
	//   54  102:areturn         
	}

	public ThreadData[] parseTopFrameData(JSONObject jsonobject)
	{
		return (new ThreadData[] {
			new ThreadData(4, new com.crashlytics.android.core.internal.models.ThreadData.FrameData[] {
				parseFrame(jsonobject, 4)
			})
		});
	//    0    0:iconst_1        
	//    1    1:anewarray       ThreadData[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:new             #21  <Class ThreadData>
	//    5    9:dup             
	//    6   10:iconst_4        
	//    7   11:iconst_1        
	//    8   12:anewarray       com.crashlytics.android.core.internal.models.ThreadData.FrameData[]
	//    9   15:dup             
	//   10   16:iconst_0        
	//   11   17:aload_0         
	//   12   18:aload_1         
	//   13   19:iconst_4        
	//   14   20:invokevirtual   #340 <Method com.crashlytics.android.core.internal.models.ThreadData$FrameData parseFrame(JSONObject, int)>
	//   15   23:aastore         
	//   16   24:invokespecial   #370 <Method void ThreadData(int, com.crashlytics.android.core.internal.models.ThreadData$FrameData[])>
	//   17   27:aastore         
	//   18   28:areturn         
	}

	private static final BinaryImageData EMPTY_BINARY_IMAGES[] = new BinaryImageData[0];
	private static final com.crashlytics.android.core.internal.models.ThreadData.FrameData EMPTY_FRAMES[] = new com.crashlytics.android.core.internal.models.ThreadData.FrameData[0];
	private static final ThreadData EMPTY_THREADS[] = new ThreadData[0];
	private final FileIdStrategy fileIdStrategy;

	static 
	{
	//    0    0:iconst_0        
	//    1    1:anewarray       BinaryImageData[]
	//    2    4:putstatic       #19  <Field BinaryImageData[] EMPTY_BINARY_IMAGES>
	//    3    7:iconst_0        
	//    4    8:anewarray       ThreadData[]
	//    5   11:putstatic       #23  <Field ThreadData[] EMPTY_THREADS>
	//    6   14:iconst_0        
	//    7   15:anewarray       com.crashlytics.android.core.internal.models.ThreadData.FrameData[]
	//    8   18:putstatic       #27  <Field com.crashlytics.android.core.internal.models.ThreadData$FrameData[] EMPTY_FRAMES>
	//*   9   21:return          
	}
}
