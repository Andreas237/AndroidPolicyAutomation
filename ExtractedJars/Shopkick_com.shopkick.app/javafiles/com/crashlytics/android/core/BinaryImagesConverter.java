// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.crashlytics.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import java.io.*;
import org.json.*;

// Referenced classes of package com.crashlytics.android.core:
//			ProcMapEntry, ProcMapEntryParser

class BinaryImagesConverter
{
	static interface FileIdStrategy
	{

		public abstract String createId(File file)
			throws IOException;
	}


	BinaryImagesConverter(Context context1, FileIdStrategy fileidstrategy)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		context = context1;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #22  <Field Context context>
		fileIdStrategy = fileidstrategy;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #24  <Field BinaryImagesConverter$FileIdStrategy fileIdStrategy>
	//    8   14:return          
	}

	private File correctDataPath(File file)
	{
		if(android.os.Build.VERSION.SDK_INT < 9)
	//*   0    0:getstatic       #35  <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          9
	//*   2    5:icmpge          10
			return file;
	//    3    8:aload_1         
	//    4    9:areturn         
		if(!file.getAbsolutePath().startsWith("/data"))
			break MISSING_BLOCK_LABEL_71;
	//    5   10:aload_1         
	//    6   11:invokevirtual   #41  <Method String File.getAbsolutePath()>
	//    7   14:ldc1            #11  <String "/data">
	//    8   16:invokevirtual   #47  <Method boolean String.startsWith(String)>
	//    9   19:ifeq            71
		File file1 = new File(context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).nativeLibraryDir, file.getName());
	//   10   22:new             #37  <Class File>
	//   11   25:dup             
	//   12   26:aload_0         
	//   13   27:getfield        #22  <Field Context context>
	//   14   30:invokevirtual   #53  <Method PackageManager Context.getPackageManager()>
	//   15   33:aload_0         
	//   16   34:getfield        #22  <Field Context context>
	//   17   37:invokevirtual   #56  <Method String Context.getPackageName()>
	//   18   40:iconst_0        
	//   19   41:invokevirtual   #62  <Method ApplicationInfo PackageManager.getApplicationInfo(String, int)>
	//   20   44:getfield        #67  <Field String ApplicationInfo.nativeLibraryDir>
	//   21   47:aload_1         
	//   22   48:invokevirtual   #70  <Method String File.getName()>
	//   23   51:invokespecial   #73  <Method void File(String, String)>
	//   24   54:astore_2        
		return file1;
	//   25   55:aload_2         
	//   26   56:areturn         
		android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
		namenotfoundexception;
	//   27   57:astore_2        
		Fabric.getLogger().e("CrashlyticsCore", "Error getting ApplicationInfo", ((Throwable) (namenotfoundexception)));
	//   28   58:invokestatic    #79  <Method Logger Fabric.getLogger()>
	//   29   61:ldc1            #81  <String "CrashlyticsCore">
	//   30   63:ldc1            #83  <String "Error getting ApplicationInfo">
	//   31   65:aload_2         
	//   32   66:invokeinterface #89  <Method void Logger.e(String, String, Throwable)>
		return file;
	//   33   71:aload_1         
	//   34   72:areturn         
	}

	private static JSONObject createBinaryImageJson(String s, ProcMapEntry procmapentry)
		throws JSONException
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #95  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject.put("base_address", procmapentry.address);
	//    4    8:aload_2         
	//    5    9:ldc1            #98  <String "base_address">
	//    6   11:aload_1         
	//    7   12:getfield        #104 <Field long ProcMapEntry.address>
	//    8   15:invokevirtual   #108 <Method JSONObject JSONObject.put(String, long)>
	//    9   18:pop             
		jsonobject.put("size", procmapentry.size);
	//   10   19:aload_2         
	//   11   20:ldc1            #110 <String "size">
	//   12   22:aload_1         
	//   13   23:getfield        #112 <Field long ProcMapEntry.size>
	//   14   26:invokevirtual   #108 <Method JSONObject JSONObject.put(String, long)>
	//   15   29:pop             
		jsonobject.put("name", ((Object) (procmapentry.path)));
	//   16   30:aload_2         
	//   17   31:ldc1            #114 <String "name">
	//   18   33:aload_1         
	//   19   34:getfield        #117 <Field String ProcMapEntry.path>
	//   20   37:invokevirtual   #120 <Method JSONObject JSONObject.put(String, Object)>
	//   21   40:pop             
		jsonobject.put("uuid", ((Object) (s)));
	//   22   41:aload_2         
	//   23   42:ldc1            #122 <String "uuid">
	//   24   44:aload_0         
	//   25   45:invokevirtual   #120 <Method JSONObject JSONObject.put(String, Object)>
	//   26   48:pop             
		return jsonobject;
	//   27   49:aload_2         
	//   28   50:areturn         
	}

	private static byte[] generateBinaryImagesJsonString(JSONArray jsonarray)
	{
		JSONObject jsonobject = new JSONObject();
	//    0    0:new             #95  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #96  <Method void JSONObject()>
	//    3    7:astore_1        
		try
		{
			jsonobject.put("binary_images", ((Object) (jsonarray)));
	//    4    8:aload_1         
	//    5    9:ldc1            #127 <String "binary_images">
	//    6   11:aload_0         
	//    7   12:invokevirtual   #120 <Method JSONObject JSONObject.put(String, Object)>
	//    8   15:pop             
		}
	//*   9   16:aload_1         
	//*  10   17:invokevirtual   #130 <Method String JSONObject.toString()>
	//*  11   20:invokevirtual   #134 <Method byte[] String.getBytes()>
	//*  12   23:areturn         
		// Misplaced declaration of an exception variable
		catch(JSONArray jsonarray)
	//*  13   24:astore_0        
		{
			Fabric.getLogger().w("CrashlyticsCore", "Binary images string is null", ((Throwable) (jsonarray)));
	//   14   25:invokestatic    #79  <Method Logger Fabric.getLogger()>
	//   15   28:ldc1            #81  <String "CrashlyticsCore">
	//   16   30:ldc1            #136 <String "Binary images string is null">
	//   17   32:aload_0         
	//   18   33:invokeinterface #139 <Method void Logger.w(String, String, Throwable)>
			return new byte[0];
	//   19   38:iconst_0        
	//   20   39:newarray        byte[]
	//   21   41:areturn         
		}
		return jsonobject.toString().getBytes();
	}

	private File getLibraryFile(String s)
	{
		File file = new File(s);
	//    0    0:new             #37  <Class File>
	//    1    3:dup             
	//    2    4:aload_1         
	//    3    5:invokespecial   #144 <Method void File(String)>
	//    4    8:astore_2        
		s = ((String) (file));
	//    5    9:aload_2         
	//    6   10:astore_1        
		if(!file.exists())
	//*   7   11:aload_2         
	//*   8   12:invokevirtual   #148 <Method boolean File.exists()>
	//*   9   15:ifne            24
			s = ((String) (correctDataPath(file)));
	//   10   18:aload_0         
	//   11   19:aload_2         
	//   12   20:invokespecial   #150 <Method File correctDataPath(File)>
	//   13   23:astore_1        
		return ((File) (s));
	//   14   24:aload_1         
	//   15   25:areturn         
	}

	private static boolean isRelevant(ProcMapEntry procmapentry)
	{
		return procmapentry.perms.indexOf('x') != -1 && procmapentry.path.indexOf('/') != -1;
	//    0    0:aload_0         
	//    1    1:getfield        #155 <Field String ProcMapEntry.perms>
	//    2    4:bipush          120
	//    3    6:invokevirtual   #159 <Method int String.indexOf(int)>
	//    4    9:iconst_m1       
	//    5   10:icmpeq          28
	//    6   13:aload_0         
	//    7   14:getfield        #117 <Field String ProcMapEntry.path>
	//    8   17:bipush          47
	//    9   19:invokevirtual   #159 <Method int String.indexOf(int)>
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
	//    0    0:new             #163 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void StringBuilder()>
	//    3    7:astore_2        
		for(int i = 0; i < jsonarray.length(); i++)
	//*   4    8:iconst_0        
	//*   5    9:istore_1        
	//*   6   10:iload_1         
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #170 <Method int JSONArray.length()>
	//*   9   15:icmpge          35
			stringbuilder.append(jsonarray.getString(i));
	//   10   18:aload_2         
	//   11   19:aload_0         
	//   12   20:iload_1         
	//   13   21:invokevirtual   #174 <Method String JSONArray.getString(int)>
	//   14   24:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   15   27:pop             

	//   16   28:iload_1         
	//   17   29:iconst_1        
	//   18   30:iadd            
	//   19   31:istore_1        
	//*  20   32:goto            10
		return stringbuilder.toString();
	//   21   35:aload_2         
	//   22   36:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   23   39:areturn         
	}

	private JSONObject jsonFromMapEntryString(String s)
	{
		s = ((String) (ProcMapEntryParser.parse(s)));
	//    0    0:aload_1         
	//    1    1:invokestatic    #189 <Method ProcMapEntry ProcMapEntryParser.parse(String)>
	//    2    4:astore_1        
		if(s != null)
	//*   3    5:aload_1         
	//*   4    6:ifnull          110
		{
			if(!isRelevant(((ProcMapEntry) (s))))
	//*   5    9:aload_1         
	//*   6   10:invokestatic    #191 <Method boolean isRelevant(ProcMapEntry)>
	//*   7   13:ifne            18
				return null;
	//    8   16:aconst_null     
	//    9   17:areturn         
			Object obj = ((Object) (getLibraryFile(((ProcMapEntry) (s)).path)));
	//   10   18:aload_0         
	//   11   19:aload_1         
	//   12   20:getfield        #117 <Field String ProcMapEntry.path>
	//   13   23:invokespecial   #193 <Method File getLibraryFile(String)>
	//   14   26:astore_2        
			try
			{
				obj = ((Object) (fileIdStrategy.createId(((File) (obj)))));
	//   15   27:aload_0         
	//   16   28:getfield        #24  <Field BinaryImagesConverter$FileIdStrategy fileIdStrategy>
	//   17   31:aload_2         
	//   18   32:invokeinterface #197 <Method String BinaryImagesConverter$FileIdStrategy.createId(File)>
	//   19   37:astore_2        
			}
	//*  20   38:aload_2         
	//*  21   39:aload_1         
	//*  22   40:invokestatic    #199 <Method JSONObject createBinaryImageJson(String, ProcMapEntry)>
	//*  23   43:astore_1        
	//*  24   44:aload_1         
	//*  25   45:areturn         
	//*  26   46:astore_1        
	//*  27   47:invokestatic    #79  <Method Logger Fabric.getLogger()>
	//*  28   50:ldc1            #81  <String "CrashlyticsCore">
	//*  29   52:ldc1            #201 <String "Could not create a binary image json string">
	//*  30   54:aload_1         
	//*  31   55:invokeinterface #204 <Method void Logger.d(String, String, Throwable)>
	//*  32   60:aconst_null     
	//*  33   61:areturn         
			catch(IOException ioexception)
	//*  34   62:astore_2        
			{
				Logger logger = Fabric.getLogger();
	//   35   63:invokestatic    #79  <Method Logger Fabric.getLogger()>
	//   36   66:astore_3        
				StringBuilder stringbuilder = new StringBuilder();
	//   37   67:new             #163 <Class StringBuilder>
	//   38   70:dup             
	//   39   71:invokespecial   #164 <Method void StringBuilder()>
	//   40   74:astore          4
				stringbuilder.append("Could not generate ID for file ");
	//   41   76:aload           4
	//   42   78:ldc1            #206 <String "Could not generate ID for file ">
	//   43   80:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   44   83:pop             
				stringbuilder.append(((ProcMapEntry) (s)).path);
	//   45   84:aload           4
	//   46   86:aload_1         
	//   47   87:getfield        #117 <Field String ProcMapEntry.path>
	//   48   90:invokevirtual   #178 <Method StringBuilder StringBuilder.append(String)>
	//   49   93:pop             
				logger.d("CrashlyticsCore", stringbuilder.toString(), ((Throwable) (ioexception)));
	//   50   94:aload_3         
	//   51   95:ldc1            #81  <String "CrashlyticsCore">
	//   52   97:aload           4
	//   53   99:invokevirtual   #179 <Method String StringBuilder.toString()>
	//   54  102:aload_2         
	//   55  103:invokeinterface #204 <Method void Logger.d(String, String, Throwable)>
				return null;
	//   56  108:aconst_null     
	//   57  109:areturn         
			}
			try
			{
				s = ((String) (createBinaryImageJson(((String) (obj)), ((ProcMapEntry) (s)))));
			}
			// Misplaced declaration of an exception variable
			catch(String s)
			{
				Fabric.getLogger().d("CrashlyticsCore", "Could not create a binary image json string", ((Throwable) (s)));
				return null;
			}
			return ((JSONObject) (s));
		} else
		{
			return null;
	//   58  110:aconst_null     
	//   59  111:areturn         
		}
	}

	private JSONArray parseProcMapsJsonFromStream(BufferedReader bufferedreader)
		throws IOException
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #166 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #209 <Method void JSONArray()>
	//    3    7:astore_2        
		do
		{
			Object obj = ((Object) (bufferedreader.readLine()));
	//    4    8:aload_1         
	//    5    9:invokevirtual   #214 <Method String BufferedReader.readLine()>
	//    6   12:astore_3        
			if(obj == null)
				break;
	//    7   13:aload_3         
	//    8   14:ifnull          36
			obj = ((Object) (jsonFromMapEntryString(((String) (obj)))));
	//    9   17:aload_0         
	//   10   18:aload_3         
	//   11   19:invokespecial   #216 <Method JSONObject jsonFromMapEntryString(String)>
	//   12   22:astore_3        
			if(obj != null)
	//*  13   23:aload_3         
	//*  14   24:ifnull          8
				jsonarray.put(obj);
	//   15   27:aload_2         
	//   16   28:aload_3         
	//   17   29:invokevirtual   #219 <Method JSONArray JSONArray.put(Object)>
	//   18   32:pop             
		} while(true);
	//   19   33:goto            8
		return jsonarray;
	//   20   36:aload_2         
	//   21   37:areturn         
	}

	private JSONArray parseProcMapsJsonFromString(String s)
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #166 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #209 <Method void JSONArray()>
	//    3    7:astore_3        
		try
		{
			s = joinMapsEntries((new JSONObject(s)).getJSONArray("maps"));
	//    4    8:new             #95  <Class JSONObject>
	//    5   11:dup             
	//    6   12:aload_1         
	//    7   13:invokespecial   #222 <Method void JSONObject(String)>
	//    8   16:ldc1            #224 <String "maps">
	//    9   18:invokevirtual   #227 <Method JSONArray JSONObject.getJSONArray(String)>
	//   10   21:invokestatic    #229 <Method String joinMapsEntries(JSONArray)>
	//   11   24:astore_1        
		}
	//*  12   25:aload_1         
	//*  13   26:ldc1            #231 <String "\\|">
	//*  14   28:invokevirtual   #235 <Method String[] String.split(String)>
	//*  15   31:astore_1        
	//*  16   32:iconst_0        
	//*  17   33:istore_2        
	//*  18   34:iload_2         
	//*  19   35:aload_1         
	//*  20   36:arraylength     
	//*  21   37:icmpge          68
	//*  22   40:aload_0         
	//*  23   41:aload_1         
	//*  24   42:iload_2         
	//*  25   43:aaload          
	//*  26   44:invokespecial   #216 <Method JSONObject jsonFromMapEntryString(String)>
	//*  27   47:astore          4
	//*  28   49:aload           4
	//*  29   51:ifnull          61
	//*  30   54:aload_3         
	//*  31   55:aload           4
	//*  32   57:invokevirtual   #219 <Method JSONArray JSONArray.put(Object)>
	//*  33   60:pop             
	//*  34   61:iload_2         
	//*  35   62:iconst_1        
	//*  36   63:iadd            
	//*  37   64:istore_2        
	//*  38   65:goto            34
	//*  39   68:aload_3         
	//*  40   69:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  41   70:astore_1        
		{
			Fabric.getLogger().w("CrashlyticsCore", "Unable to parse proc maps string", ((Throwable) (s)));
	//   42   71:invokestatic    #79  <Method Logger Fabric.getLogger()>
	//   43   74:ldc1            #81  <String "CrashlyticsCore">
	//   44   76:ldc1            #237 <String "Unable to parse proc maps string">
	//   45   78:aload_1         
	//   46   79:invokeinterface #139 <Method void Logger.w(String, String, Throwable)>
			return jsonarray;
	//   47   84:aload_3         
	//   48   85:areturn         
		}
		s = ((String) (s.split("\\|")));
		for(int i = 0; i < s.length; i++)
		{
			JSONObject jsonobject = jsonFromMapEntryString(((String) (s[i])));
			if(jsonobject != null)
				jsonarray.put(((Object) (jsonobject)));
		}

		return jsonarray;
	}

	byte[] convert(BufferedReader bufferedreader)
		throws IOException
	{
		return generateBinaryImagesJsonString(parseProcMapsJsonFromStream(bufferedreader));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #241 <Method JSONArray parseProcMapsJsonFromStream(BufferedReader)>
	//    3    5:invokestatic    #243 <Method byte[] generateBinaryImagesJsonString(JSONArray)>
	//    4    8:areturn         
	}

	byte[] convert(String s)
		throws IOException
	{
		return generateBinaryImagesJsonString(parseProcMapsJsonFromString(s));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #246 <Method JSONArray parseProcMapsJsonFromString(String)>
	//    3    5:invokestatic    #243 <Method byte[] generateBinaryImagesJsonString(JSONArray)>
	//    4    8:areturn         
	}

	private static final String DATA_DIR = "/data";
	private final Context context;
	private final FileIdStrategy fileIdStrategy;
}
