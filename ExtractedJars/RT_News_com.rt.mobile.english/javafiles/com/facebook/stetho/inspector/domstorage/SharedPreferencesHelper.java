// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.stetho.inspector.domstorage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.io.File;
import java.util.*;
import org.json.JSONArray;
import org.json.JSONException;

public class SharedPreferencesHelper
{

	private SharedPreferencesHelper()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #12  <Method void Object()>
	//    2    4:return          
	}

	public static List getSharedPreferenceTags(Context context)
	{
		ArrayList arraylist = new ArrayList();
	//    0    0:new             #17  <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #18  <Method void ArrayList()>
	//    3    7:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    4    8:new             #20  <Class StringBuilder>
	//    5   11:dup             
	//    6   12:invokespecial   #21  <Method void StringBuilder()>
	//    7   15:astore          4
		stringbuilder.append(context.getApplicationInfo().dataDir);
	//    8   17:aload           4
	//    9   19:aload_0         
	//   10   20:invokevirtual   #27  <Method ApplicationInfo Context.getApplicationInfo()>
	//   11   23:getfield        #32  <Field String ApplicationInfo.dataDir>
	//   12   26:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   13   29:pop             
		stringbuilder.append("/shared_prefs");
	//   14   30:aload           4
	//   15   32:ldc1            #38  <String "/shared_prefs">
	//   16   34:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		context = ((Context) (new File(stringbuilder.toString())));
	//   18   38:new             #40  <Class File>
	//   19   41:dup             
	//   20   42:aload           4
	//   21   44:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   22   47:invokespecial   #47  <Method void File(String)>
	//   23   50:astore_0        
		if(((File) (context)).exists())
	//*  24   51:aload_0         
	//*  25   52:invokevirtual   #51  <Method boolean File.exists()>
	//*  26   55:ifeq            120
		{
			context = ((Context) (((File) (context)).listFiles()));
	//   27   58:aload_0         
	//   28   59:invokevirtual   #55  <Method File[] File.listFiles()>
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
	//*  37   70:icmpge          120
			{
				String s = ((File) (context[i])).getName();
	//   38   73:aload_0         
	//   39   74:iload_1         
	//   40   75:aaload          
	//   41   76:invokevirtual   #58  <Method String File.getName()>
	//   42   79:astore          4
				if(s.endsWith(".xml"))
	//*  43   81:aload           4
	//*  44   83:ldc1            #8   <String ".xml">
	//*  45   85:invokevirtual   #64  <Method boolean String.endsWith(String)>
	//*  46   88:ifeq            113
					arraylist.add(((Object) (s.substring(0, s.length() - ".xml".length()))));
	//   47   91:aload_3         
	//   48   92:aload           4
	//   49   94:iconst_0        
	//   50   95:aload           4
	//   51   97:invokevirtual   #68  <Method int String.length()>
	//   52  100:ldc1            #8   <String ".xml">
	//   53  102:invokevirtual   #68  <Method int String.length()>
	//   54  105:isub            
	//   55  106:invokevirtual   #72  <Method String String.substring(int, int)>
	//   56  109:invokevirtual   #76  <Method boolean ArrayList.add(Object)>
	//   57  112:pop             
			}

	//   58  113:iload_1         
	//   59  114:iconst_1        
	//   60  115:iadd            
	//   61  116:istore_1        
		}
	//*  62  117:goto            68
		return ((List) (arraylist));
	//   63  120:aload_3         
	//   64  121:areturn         
	}

	private static Boolean parseBoolean(String s)
		throws IllegalArgumentException
	{
		if(!"1".equals(((Object) (s))) && !"true".equalsIgnoreCase(s))
	//*   0    0:ldc1            #84  <String "1">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*   3    6:ifne            79
	//*   4    9:ldc1            #89  <String "true">
	//*   5   11:aload_0         
	//*   6   12:invokevirtual   #92  <Method boolean String.equalsIgnoreCase(String)>
	//*   7   15:ifeq            21
	//*   8   18:goto            79
		{
			if(!"0".equals(((Object) (s))) && !"false".equalsIgnoreCase(s))
	//*   9   21:ldc1            #94  <String "0">
	//*  10   23:aload_0         
	//*  11   24:invokevirtual   #87  <Method boolean String.equals(Object)>
	//*  12   27:ifne            75
	//*  13   30:ldc1            #96  <String "false">
	//*  14   32:aload_0         
	//*  15   33:invokevirtual   #92  <Method boolean String.equalsIgnoreCase(String)>
	//*  16   36:ifeq            42
	//*  17   39:goto            75
			{
				StringBuilder stringbuilder = new StringBuilder();
	//   18   42:new             #20  <Class StringBuilder>
	//   19   45:dup             
	//   20   46:invokespecial   #21  <Method void StringBuilder()>
	//   21   49:astore_1        
				stringbuilder.append("Expected boolean, got ");
	//   22   50:aload_1         
	//   23   51:ldc1            #98  <String "Expected boolean, got ">
	//   24   53:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   25   56:pop             
				stringbuilder.append(s);
	//   26   57:aload_1         
	//   27   58:aload_0         
	//   28   59:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   29   62:pop             
				throw new IllegalArgumentException(stringbuilder.toString());
	//   30   63:new             #82  <Class IllegalArgumentException>
	//   31   66:dup             
	//   32   67:aload_1         
	//   33   68:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   34   71:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   35   74:athrow          
			} else
			{
				return Boolean.FALSE;
	//   36   75:getstatic       #105 <Field Boolean Boolean.FALSE>
	//   37   78:areturn         
			}
		} else
		{
			return Boolean.TRUE;
	//   38   79:getstatic       #108 <Field Boolean Boolean.TRUE>
	//   39   82:areturn         
		}
	}

	public static Object valueFromString(String s, Object obj)
		throws IllegalArgumentException
	{
		if(obj instanceof Integer)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #116 <Class Integer>
	//*   2    4:ifeq            15
			return ((Object) (Integer.valueOf(Integer.parseInt(s))));
	//    3    7:aload_0         
	//    4    8:invokestatic    #120 <Method int Integer.parseInt(String)>
	//    5   11:invokestatic    #124 <Method Integer Integer.valueOf(int)>
	//    6   14:areturn         
		if(obj instanceof Long)
	//*   7   15:aload_1         
	//*   8   16:instanceof      #126 <Class Long>
	//*   9   19:ifeq            30
			return ((Object) (Long.valueOf(Long.parseLong(s))));
	//   10   22:aload_0         
	//   11   23:invokestatic    #130 <Method long Long.parseLong(String)>
	//   12   26:invokestatic    #133 <Method Long Long.valueOf(long)>
	//   13   29:areturn         
		if(obj instanceof Float)
	//*  14   30:aload_1         
	//*  15   31:instanceof      #135 <Class Float>
	//*  16   34:ifeq            45
			return ((Object) (Float.valueOf(Float.parseFloat(s))));
	//   17   37:aload_0         
	//   18   38:invokestatic    #139 <Method float Float.parseFloat(String)>
	//   19   41:invokestatic    #142 <Method Float Float.valueOf(float)>
	//   20   44:areturn         
		if(obj instanceof Boolean)
	//*  21   45:aload_1         
	//*  22   46:instanceof      #101 <Class Boolean>
	//*  23   49:ifeq            57
			return ((Object) (parseBoolean(s)));
	//   24   52:aload_0         
	//   25   53:invokestatic    #144 <Method Boolean parseBoolean(String)>
	//   26   56:areturn         
		if(obj instanceof String)
	//*  27   57:aload_1         
	//*  28   58:instanceof      #60  <Class String>
	//*  29   61:ifeq            66
			return ((Object) (s));
	//   30   64:aload_0         
	//   31   65:areturn         
		if(!(obj instanceof Set))
			break MISSING_BLOCK_LABEL_132;
	//   32   66:aload_1         
	//   33   67:instanceof      #146 <Class Set>
	//   34   70:ifeq            132
		int i;
		int j;
		try
		{
			s = ((String) (new JSONArray(s)));
	//   35   73:new             #148 <Class JSONArray>
	//   36   76:dup             
	//   37   77:aload_0         
	//   38   78:invokespecial   #149 <Method void JSONArray(String)>
	//   39   81:astore_0        
			j = ((JSONArray) (s)).length();
	//   40   82:aload_0         
	//   41   83:invokevirtual   #150 <Method int JSONArray.length()>
	//   42   86:istore_3        
			obj = ((Object) (new HashSet(j)));
	//   43   87:new             #152 <Class HashSet>
	//   44   90:dup             
	//   45   91:iload_3         
	//   46   92:invokespecial   #155 <Method void HashSet(int)>
	//   47   95:astore_1        
		}
	//*  48   96:iconst_0        
	//*  49   97:istore_2        
	//*  50   98:iload_2         
	//*  51   99:iload_3         
	//*  52  100:icmpge          120
	//*  53  103:aload_1         
	//*  54  104:aload_0         
	//*  55  105:iload_2         
	//*  56  106:invokevirtual   #159 <Method String JSONArray.getString(int)>
	//*  57  109:invokevirtual   #160 <Method boolean HashSet.add(Object)>
	//*  58  112:pop             
	//*  59  113:iload_2         
	//*  60  114:iconst_1        
	//*  61  115:iadd            
	//*  62  116:istore_2        
	//*  63  117:goto            98
	//*  64  120:aload_1         
	//*  65  121:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  66  122:astore_0        
		{
			throw new IllegalArgumentException(((Throwable) (s)));
	//   67  123:new             #82  <Class IllegalArgumentException>
	//   68  126:dup             
	//   69  127:aload_0         
	//   70  128:invokespecial   #163 <Method void IllegalArgumentException(Throwable)>
	//   71  131:athrow          
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		((HashSet) (obj)).add(((Object) (((JSONArray) (s)).getString(i))));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_98;
_L1:
		return obj;
		s = ((String) (new StringBuilder()));
	//   72  132:new             #20  <Class StringBuilder>
	//   73  135:dup             
	//   74  136:invokespecial   #21  <Method void StringBuilder()>
	//   75  139:astore_0        
		((StringBuilder) (s)).append("Unsupported type: ");
	//   76  140:aload_0         
	//   77  141:ldc1            #165 <String "Unsupported type: ">
	//   78  143:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   79  146:pop             
		((StringBuilder) (s)).append(obj.getClass().getName());
	//   80  147:aload_0         
	//   81  148:aload_1         
	//   82  149:invokevirtual   #169 <Method Class Object.getClass()>
	//   83  152:invokevirtual   #172 <Method String Class.getName()>
	//   84  155:invokevirtual   #36  <Method StringBuilder StringBuilder.append(String)>
	//   85  158:pop             
		throw new IllegalArgumentException(((StringBuilder) (s)).toString());
	//   86  159:new             #82  <Class IllegalArgumentException>
	//   87  162:dup             
	//   88  163:aload_0         
	//   89  164:invokevirtual   #44  <Method String StringBuilder.toString()>
	//   90  167:invokespecial   #99  <Method void IllegalArgumentException(String)>
	//   91  170:athrow          
	}

	public static String valueToString(Object obj)
	{
		if(obj != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          65
		{
			if(obj instanceof Set)
	//*   2    4:aload_0         
	//*   3    5:instanceof      #146 <Class Set>
	//*   4    8:ifeq            60
			{
				JSONArray jsonarray = new JSONArray();
	//    5   11:new             #148 <Class JSONArray>
	//    6   14:dup             
	//    7   15:invokespecial   #176 <Method void JSONArray()>
	//    8   18:astore_1        
				for(obj = ((Object) (((Set)obj).iterator())); ((Iterator) (obj)).hasNext(); jsonarray.put(((Object) ((String)((Iterator) (obj)).next()))));
	//    9   19:aload_0         
	//   10   20:checkcast       #146 <Class Set>
	//   11   23:invokeinterface #180 <Method Iterator Set.iterator()>
	//   12   28:astore_0        
	//   13   29:aload_0         
	//   14   30:invokeinterface #185 <Method boolean Iterator.hasNext()>
	//   15   35:ifeq            55
	//   16   38:aload_1         
	//   17   39:aload_0         
	//   18   40:invokeinterface #189 <Method Object Iterator.next()>
	//   19   45:checkcast       #60  <Class String>
	//   20   48:invokevirtual   #193 <Method JSONArray JSONArray.put(Object)>
	//   21   51:pop             
	//*  22   52:goto            29
				return jsonarray.toString();
	//   23   55:aload_1         
	//   24   56:invokevirtual   #194 <Method String JSONArray.toString()>
	//   25   59:areturn         
			} else
			{
				return obj.toString();
	//   26   60:aload_0         
	//   27   61:invokevirtual   #195 <Method String Object.toString()>
	//   28   64:areturn         
			}
		} else
		{
			return null;
	//   29   65:aconst_null     
	//   30   66:areturn         
		}
	}

	private static final String PREFS_SUFFIX = ".xml";
}
