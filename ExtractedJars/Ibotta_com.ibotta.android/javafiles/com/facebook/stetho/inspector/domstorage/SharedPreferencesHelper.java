// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.domstorage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import java.io.File;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONException;

public class SharedPreferencesHelper
{

	private SharedPreferencesHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	public static List getSharedPreferenceTags(Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #18  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #19  <Method void ArrayList()>
	//    3    7:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #21  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #22  <Method void StringBuilder()>
	//    7   15:astore          4
		stringbuilder.append(context.getApplicationInfo().dataDir);
	//    8   17:aload           4
	//    9   19:aload_0         
	//   10   20:invokevirtual   #28  <Method ApplicationInfo Context.getApplicationInfo()>
	//   11   23:getfield        #33  <Field String ApplicationInfo.dataDir>
	//   12   26:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		stringbuilder.append("/shared_prefs");
	//   14   30:aload           4
	//   15   32:ldc1            #39  <String "/shared_prefs">
	//   16   34:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		context = ((Context) (new File(stringbuilder.toString())));
	//   18   38:new             #41  <Class File>
	//   19   41:dup             
	//   20   42:aload           4
	//   21   44:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   22   47:invokespecial   #48  <Method void File(String)>
	//   23   50:astore_0        
		if(((File) (context)).exists())
	//*  24   51:aload_0         
	//*  25   52:invokevirtual   #52  <Method boolean File.exists()>
	//*  26   55:ifeq            116
		{
			context = ((Context) (((File) (context)).listFiles()));
	//   27   58:aload_0         
	//   28   59:invokevirtual   #56  <Method File[] File.listFiles()>
	//   29   62:astore_0        
			int j = context.length;
	//   30   63:aload_0         
	//   31   64:arraylength     
	//   32   65:istore_2        
			for(int i = 0; i < j; i++)
	//*  33   66:iconst_0        
	//*  34   67:istore_1        
	//*  35   68:iload_1         
	//*  36   69:iload_2         
	//*  37   70:icmpge          116
			{
				String s = ((File) (context[i])).getName();
	//   38   73:aload_0         
	//   39   74:iload_1         
	//   40   75:aaload          
	//   41   76:invokevirtual   #59  <Method String File.getName()>
	//   42   79:astore          4
				if(s.endsWith(".xml"))
	//*  43   81:aload           4
	//*  44   83:ldc1            #9   <String ".xml">
	//*  45   85:invokevirtual   #65  <Method boolean String.endsWith(String)>
	//*  46   88:ifeq            109
					arraylist.add(((Object) (s.substring(0, s.length() - 4))));
	//   47   91:aload_3         
	//   48   92:aload           4
	//   49   94:iconst_0        
	//   50   95:aload           4
	//   51   97:invokevirtual   #69  <Method int String.length()>
	//   52  100:iconst_4        
	//   53  101:isub            
	//   54  102:invokevirtual   #73  <Method String String.substring(int, int)>
	//   55  105:invokevirtual   #77  <Method boolean ArrayList.add(Object)>
	//   56  108:pop             
			}

	//   57  109:iload_1         
	//   58  110:iconst_1        
	//   59  111:iadd            
	//   60  112:istore_1        
		}
	//*  61  113:goto            68
		Collections.sort(((List) (arraylist)));
	//   62  116:aload_3         
	//   63  117:invokestatic    #83  <Method void Collections.sort(List)>
		return ((List) (arraylist));
	//   64  120:aload_3         
	//   65  121:areturn         
	}

	private static Boolean parseBoolean(String s)
		throws IllegalArgumentException
	{
		if(!"1".equals(((Object) (s))) && !"true".equalsIgnoreCase(s))
	//*   0    0:ldc1            #91  <String "1">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*   3    6:ifne            79
	//*   4    9:ldc1            #96  <String "true">
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #99  <Method boolean String.equalsIgnoreCase(String)>
	//*   7   15:ifeq            21
	//*   8   18:goto            79
		{
			if(!"0".equals(((Object) (s))) && !"false".equalsIgnoreCase(s))
	//*   9   21:ldc1            #101 <String "0">
	//*  10   23:aload_0         
	//*  11   24:invokevirtual   #94  <Method boolean String.equals(Object)>
	//*  12   27:ifne            75
	//*  13   30:ldc1            #103 <String "false">
	//*  14   32:aload_0         
	//*  15   33:invokevirtual   #99  <Method boolean String.equalsIgnoreCase(String)>
	//*  16   36:ifeq            42
	//*  17   39:goto            75
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   18   42:new             #21  <Class StringBuilder>
	//   19   45:dup             
	//   20   46:invokespecial   #22  <Method void StringBuilder()>
	//   21   49:astore_1        
				stringbuilder.append("Expected boolean, got ");
	//   22   50:aload_1         
	//   23   51:ldc1            #105 <String "Expected boolean, got ">
	//   24   53:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
				stringbuilder.append(s);
	//   26   57:aload_1         
	//   27   58:aload_0         
	//   28   59:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   30   63:new             #89  <Class IllegalArgumentException>
	//   31   66:dup             
	//   32   67:aload_1         
	//   33   68:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   34   71:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   35   74:athrow          
			} else
			{
				return Boolean.FALSE;
	//   36   75:getstatic       #112 <Field Boolean Boolean.FALSE>
	//   37   78:areturn         
			}
		} else
		{
			return Boolean.TRUE;
	//   38   79:getstatic       #115 <Field Boolean Boolean.TRUE>
	//   39   82:areturn         
		}
	}

	public static Object valueFromString(String s, Object obj)
		throws IllegalArgumentException
	{
		if(obj instanceof Integer)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #123 <Class Integer>
	//*   2    4:ifeq            15
			return ((Object) (Integer.valueOf(Integer.parseInt(s))));
	//    3    7:aload_0         
	//    4    8:invokestatic    #127 <Method int Integer.parseInt(String)>
	//    5   11:invokestatic    #131 <Method Integer Integer.valueOf(int)>
	//    6   14:areturn         
		if(obj instanceof Long)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #133 <Class Long>
	//*   9   19:ifeq            30
			return ((Object) (Long.valueOf(Long.parseLong(s))));
	//   10   22:aload_0         
	//   11   23:invokestatic    #137 <Method long Long.parseLong(String)>
	//   12   26:invokestatic    #140 <Method Long Long.valueOf(long)>
	//   13   29:areturn         
		if(obj instanceof Float)
	//*  14   30:aload_1         
	//*  15   31:instanceof      #142 <Class Float>
	//*  16   34:ifeq            45
			return ((Object) (Float.valueOf(Float.parseFloat(s))));
	//   17   37:aload_0         
	//   18   38:invokestatic    #146 <Method float Float.parseFloat(String)>
	//   19   41:invokestatic    #149 <Method Float Float.valueOf(float)>
	//   20   44:areturn         
		if(obj instanceof Boolean)
	//*  21   45:aload_1         
	//*  22   46:instanceof      #108 <Class Boolean>
	//*  23   49:ifeq            57
			return ((Object) (parseBoolean(s)));
	//   24   52:aload_0         
	//   25   53:invokestatic    #151 <Method Boolean parseBoolean(String)>
	//   26   56:areturn         
		if(obj instanceof String)
	//*  27   57:aload_1         
	//*  28   58:instanceof      #61  <Class String>
	//*  29   61:ifeq            66
			return ((Object) (s));
	//   30   64:aload_0         
	//   31   65:areturn         
		if(!(obj instanceof Set))
			break MISSING_BLOCK_LABEL_128;
	//   32   66:aload_1         
	//   33   67:instanceof      #153 <Class Set>
	//   34   70:ifeq            128
		int i;
		int j;
		try
		{
			s = ((String) (JSONArrayInstrumentation.init(s)));
	//   35   73:aload_0         
	//   36   74:invokestatic    #159 <Method JSONArray JSONArrayInstrumentation.init(String)>
	//   37   77:astore_0        
			j = ((JSONArray) (s)).length();
	//   38   78:aload_0         
	//   39   79:invokevirtual   #162 <Method int JSONArray.length()>
	//   40   82:istore_3        
			obj = ((Object) (new HashSet(j)));
	//   41   83:new             #164 <Class HashSet>
	//   42   86:dup             
	//   43   87:iload_3         
	//   44   88:invokespecial   #167 <Method void HashSet(int)>
	//   45   91:astore_1        
		}
	//*  46   92:iconst_0        
	//*  47   93:istore_2        
	//*  48   94:iload_2         
	//*  49   95:iload_3         
	//*  50   96:icmpge          116
	//*  51   99:aload_1         
	//*  52  100:aload_0         
	//*  53  101:iload_2         
	//*  54  102:invokevirtual   #171 <Method String JSONArray.getString(int)>
	//*  55  105:invokevirtual   #172 <Method boolean HashSet.add(Object)>
	//*  56  108:pop             
	//*  57  109:iload_2         
	//*  58  110:iconst_1        
	//*  59  111:iadd            
	//*  60  112:istore_2        
	//*  61  113:goto            94
	//*  62  116:aload_1         
	//*  63  117:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  64  118:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (s)));
	//   65  119:new             #89  <Class IllegalArgumentException>
	//   66  122:dup             
	//   67  123:aload_0         
	//   68  124:invokespecial   #175 <Method void IllegalArgumentException(Throwable)>
	//   69  127:athrow          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		((HashSet) (obj)).add(((Object) (((JSONArray) (s)).getString(i))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_94;
_L1:
		return obj;
		s = ((String) (new StringBuilder()));
	//   70  128:new             #21  <Class StringBuilder>
	//   71  131:dup             
	//   72  132:invokespecial   #22  <Method void StringBuilder()>
	//   73  135:astore_0        
		((StringBuilder) (s)).append("Unsupported type: ");
	//   74  136:aload_0         
	//   75  137:ldc1            #177 <String "Unsupported type: ">
	//   76  139:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   77  142:pop             
		((StringBuilder) (s)).append(obj.getClass().getName());
	//   78  143:aload_0         
	//   79  144:aload_1         
	//   80  145:invokevirtual   #181 <Method Class Object.getClass()>
	//   81  148:invokevirtual   #184 <Method String Class.getName()>
	//   82  151:invokevirtual   #37  <Method StringBuilder StringBuilder.append(String)>
	//   83  154:pop             
		throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   84  155:new             #89  <Class IllegalArgumentException>
	//   85  158:dup             
	//   86  159:aload_0         
	//   87  160:invokevirtual   #45  <Method String StringBuilder.toString()>
	//   88  163:invokespecial   #106 <Method void IllegalArgumentException(String)>
	//   89  166:athrow          
	}

	public static String valueToString(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          80
		{
			if(obj instanceof Set)
	//*   2    4:aload_0         
	//*   3    5:instanceof      #153 <Class Set>
	//*   4    8:ifeq            75
			{
				JSONArray jsonarray = new JSONArray();
	//    5   11:new             #161 <Class JSONArray>
	//    6   14:dup             
	//    7   15:invokespecial   #188 <Method void JSONArray()>
	//    8   18:astore_1        
				for(obj = ((Object) (((Set)obj).iterator())); ((Iterator) (obj)).hasNext(); jsonarray.put(((Object) ((String)((Iterator) (obj)).next()))));
	//    9   19:aload_0         
	//   10   20:checkcast       #153 <Class Set>
	//   11   23:invokeinterface #192 <Method Iterator Set.iterator()>
	//   12   28:astore_0        
	//   13   29:aload_0         
	//   14   30:invokeinterface #197 <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            55
	//   16   38:aload_1         
	//   17   39:aload_0         
	//   18   40:invokeinterface #201 <Method Object Iterator.next()>
	//   19   45:checkcast       #61  <Class String>
	//   20   48:invokevirtual   #205 <Method JSONArray JSONArray.put(Object)>
	//   21   51:pop             
	//*  22   52:goto            29
				if(!(jsonarray instanceof JSONArray))
	//*  23   55:aload_1         
	//*  24   56:instanceof      #161 <Class JSONArray>
	//*  25   59:ifne            67
					return jsonarray.toString();
	//   26   62:aload_1         
	//   27   63:invokevirtual   #206 <Method String JSONArray.toString()>
	//   28   66:areturn         
				else
					return JSONArrayInstrumentation.toString((JSONArray)jsonarray);
	//   29   67:aload_1         
	//   30   68:checkcast       #161 <Class JSONArray>
	//   31   71:invokestatic    #209 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//   32   74:areturn         
			} else
			{
				return obj.toString();
	//   33   75:aload_0         
	//   34   76:invokevirtual   #210 <Method String Object.toString()>
	//   35   79:areturn         
			}
		} else
		{
			return null;
	//   36   80:aconst_null     
	//   37   81:areturn         
		}
	}

	private static final String PREFS_SUFFIX = ".xml";
}
