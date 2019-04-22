// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.appboy.support;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.newrelic.agent.android.instrumentation.JSONArrayInstrumentation;
import java.security.MessageDigest;
import java.util.*;
import org.json.JSONArray;

// Referenced classes of package com.appboy.support:
//			AppboyLogger

public final class StringUtils
{

	public StringUtils()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
	//    2    4:return          
	}

	private static String a(String s, String s1)
	{
		if(isNullOrBlank(s1))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #26  <Method boolean isNullOrBlank(String)>
	//*   2    4:ifeq            33
		{
			s1 = ((String) (new StringBuilder()));
	//    3    7:new             #28  <Class StringBuilder>
	//    4   10:dup             
	//    5   11:invokespecial   #29  <Method void StringBuilder()>
	//    6   14:astore_1        
			((StringBuilder) (s1)).append(".");
	//    7   15:aload_1         
	//    8   16:ldc1            #31  <String ".">
	//    9   18:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   10   21:pop             
			((StringBuilder) (s1)).append(s);
	//   11   22:aload_1         
	//   12   23:aload_0         
	//   13   24:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   14   27:pop             
			return ((StringBuilder) (s1)).toString();
	//   15   28:aload_1         
	//   16   29:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   17   32:areturn         
		} else
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   18   33:new             #28  <Class StringBuilder>
	//   19   36:dup             
	//   20   37:invokespecial   #29  <Method void StringBuilder()>
	//   21   40:astore_2        
			stringbuilder.append(".");
	//   22   41:aload_2         
	//   23   42:ldc1            #31  <String ".">
	//   24   44:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   25   47:pop             
			stringbuilder.append(s);
	//   26   48:aload_2         
	//   27   49:aload_0         
	//   28   50:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   29   53:pop             
			stringbuilder.append(".");
	//   30   54:aload_2         
	//   31   55:ldc1            #31  <String ".">
	//   32   57:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
			stringbuilder.append(s1);
	//   34   61:aload_2         
	//   35   62:aload_1         
	//   36   63:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   37   66:pop             
			return stringbuilder.toString();
	//   38   67:aload_2         
	//   39   68:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   40   71:areturn         
		}
	}

	public static String checkNotNullOrEmpty(String s)
	{
		if(s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          23
		{
			if(s.length() != 0)
	//*   2    4:aload_0         
	//*   3    5:invokevirtual   #47  <Method int String.length()>
	//*   4    8:ifeq            13
				return s;
	//    5   11:aload_0         
	//    6   12:areturn         
			else
				throw new IllegalArgumentException("Provided String must be non-empty.");
	//    7   13:new             #49  <Class IllegalArgumentException>
	//    8   16:dup             
	//    9   17:ldc1            #51  <String "Provided String must be non-empty.">
	//   10   19:invokespecial   #54  <Method void IllegalArgumentException(String)>
	//   11   22:athrow          
		} else
		{
			throw new NullPointerException("Provided String must be non-null.");
	//   12   23:new             #56  <Class NullPointerException>
	//   13   26:dup             
	//   14   27:ldc1            #58  <String "Provided String must be non-null.">
	//   15   29:invokespecial   #59  <Method void NullPointerException(String)>
	//   16   32:athrow          
		}
	}

	public static int countOccurrences(String s, String s1)
	{
		return s.split(s1, -1).length - 1;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_m1       
	//    3    3:invokevirtual   #65  <Method String[] String.split(String, int)>
	//    4    6:arraylength     
	//    5    7:iconst_1        
	//    6    8:isub            
	//    7    9:ireturn         
	}

	public static String emptyToNull(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s.trim().equals(""))
	//*   2    2:aload_0         
	//*   3    3:invokevirtual   #69  <Method String String.trim()>
	//*   4    6:ldc1            #71  <String "">
	//*   5    8:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*   6   11:ifeq            16
			s1 = null;
	//    7   14:aconst_null     
	//    8   15:astore_1        
		return s1;
	//    9   16:aload_1         
	//   10   17:areturn         
	}

	public static String getCacheFileSuffix(Context context, String s)
	{
		return getCacheFileSuffix(context, s, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:invokestatic    #80  <Method String getCacheFileSuffix(Context, String, String)>
	//    4    6:areturn         
	}

	public static String getCacheFileSuffix(Context context, String s, String s1)
	{
		String s2 = s;
	//    0    0:aload_1         
	//    1    1:astore_3        
		if(s == null)
	//*   2    2:aload_1         
	//*   3    3:ifnonnull       9
			s2 = "null";
	//    4    6:ldc1            #82  <String "null">
	//    5    8:astore_3        
		if(s2.equals("null"))
	//*   6    9:aload_3         
	//*   7   10:ldc1            #82  <String "null">
	//*   8   12:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*   9   15:ifeq            25
			return a("37a6259cc0c1dae299a7866489dff0bd", s1);
	//   10   18:ldc1            #84  <String "37a6259cc0c1dae299a7866489dff0bd">
	//   11   20:aload_2         
	//   12   21:invokestatic    #86  <Method String a(String, String)>
	//   13   24:areturn         
		SharedPreferences sharedpreferences = context.getSharedPreferences("com.appboy.support.stringutils.cachefilesuffix", 0);
	//   14   25:aload_0         
	//   15   26:ldc1            #88  <String "com.appboy.support.stringutils.cachefilesuffix">
	//   16   28:iconst_0        
	//   17   29:invokevirtual   #94  <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   18   32:astore          4
		context = ((Context) (sharedpreferences.getString("user_id_key", ((String) (null)))));
	//   19   34:aload           4
	//   20   36:ldc1            #96  <String "user_id_key">
	//   21   38:aconst_null     
	//   22   39:invokeinterface #101 <Method String SharedPreferences.getString(String, String)>
	//   23   44:astore_0        
		if(context != null && ((String) (context)).equals(((Object) (s2))))
	//*  24   45:aload_0         
	//*  25   46:ifnull          90
	//*  26   49:aload_0         
	//*  27   50:aload_3         
	//*  28   51:invokevirtual   #75  <Method boolean String.equals(Object)>
	//*  29   54:ifeq            90
		{
			context = ((Context) (sharedpreferences.getString("user_id_hash_value", ((String) (null)))));
	//   30   57:aload           4
	//   31   59:ldc1            #103 <String "user_id_hash_value">
	//   32   61:aconst_null     
	//   33   62:invokeinterface #101 <Method String SharedPreferences.getString(String, String)>
	//   34   67:astore_0        
			if(!isNullOrEmpty(((String) (context))))
	//*  35   68:aload_0         
	//*  36   69:invokestatic    #106 <Method boolean isNullOrEmpty(String)>
	//*  37   72:ifne            81
				return a(((String) (context)), s1);
	//   38   75:aload_0         
	//   39   76:aload_2         
	//   40   77:invokestatic    #86  <Method String a(String, String)>
	//   41   80:areturn         
			AppboyLogger.d(a, "The saved user id hash was null or empty.");
	//   42   81:getstatic       #17  <Field String a>
	//   43   84:ldc1            #108 <String "The saved user id hash was null or empty.">
	//   44   86:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   45   89:pop             
		}
		context = ((Context) (a));
	//   46   90:getstatic       #17  <Field String a>
	//   47   93:astore_0        
		s = ((String) (new StringBuilder()));
	//   48   94:new             #28  <Class StringBuilder>
	//   49   97:dup             
	//   50   98:invokespecial   #29  <Method void StringBuilder()>
	//   51  101:astore_1        
		((StringBuilder) (s)).append("Generating MD5 for user id: ");
	//   52  102:aload_1         
	//   53  103:ldc1            #113 <String "Generating MD5 for user id: ">
	//   54  105:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   55  108:pop             
		((StringBuilder) (s)).append(s2);
	//   56  109:aload_1         
	//   57  110:aload_3         
	//   58  111:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   59  114:pop             
		((StringBuilder) (s)).append(" apiKey: ");
	//   60  115:aload_1         
	//   61  116:ldc1            #115 <String " apiKey: ">
	//   62  118:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   63  121:pop             
		((StringBuilder) (s)).append(s1);
	//   64  122:aload_1         
	//   65  123:aload_2         
	//   66  124:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   67  127:pop             
		AppboyLogger.d(((String) (context)), ((StringBuilder) (s)).toString());
	//   68  128:aload_0         
	//   69  129:aload_1         
	//   70  130:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   71  133:invokestatic    #111 <Method int AppboyLogger.d(String, String)>
	//   72  136:pop             
		s = getMd5Hash(s2);
	//   73  137:aload_3         
	//   74  138:invokestatic    #118 <Method String getMd5Hash(String)>
	//   75  141:astore_1        
		context = ((Context) (s));
	//   76  142:aload_1         
	//   77  143:astore_0        
		if(s == null)
	//*  78  144:aload_1         
	//*  79  145:ifnonnull       156
			context = ((Context) (Integer.toString(s2.hashCode())));
	//   80  148:aload_3         
	//   81  149:invokevirtual   #121 <Method int String.hashCode()>
	//   82  152:invokestatic    #126 <Method String Integer.toString(int)>
	//   83  155:astore_0        
		s = ((String) (sharedpreferences.edit()));
	//   84  156:aload           4
	//   85  158:invokeinterface #130 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//   86  163:astore_1        
		((android.content.SharedPreferences.Editor) (s)).putString("user_id_key", s2);
	//   87  164:aload_1         
	//   88  165:ldc1            #96  <String "user_id_key">
	//   89  167:aload_3         
	//   90  168:invokeinterface #136 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   91  173:pop             
		((android.content.SharedPreferences.Editor) (s)).putString("user_id_hash_value", ((String) (context)));
	//   92  174:aload_1         
	//   93  175:ldc1            #103 <String "user_id_hash_value">
	//   94  177:aload_0         
	//   95  178:invokeinterface #136 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.putString(String, String)>
	//   96  183:pop             
		((android.content.SharedPreferences.Editor) (s)).apply();
	//   97  184:aload_1         
	//   98  185:invokeinterface #139 <Method void android.content.SharedPreferences$Editor.apply()>
		return a(((String) (context)), s1);
	//   99  190:aload_0         
	//  100  191:aload_2         
	//  101  192:invokestatic    #86  <Method String a(String, String)>
	//  102  195:areturn         
	}

	public static String getMd5Hash(String s)
	{
		int i;
		int j;
		StringBuilder stringbuilder;
		try
		{
			s = ((String) (MessageDigest.getInstance("MD5").digest(s.getBytes())));
	//    0    0:ldc1            #144 <String "MD5">
	//    1    2:invokestatic    #150 <Method MessageDigest MessageDigest.getInstance(String)>
	//    2    5:aload_0         
	//    3    6:invokevirtual   #154 <Method byte[] String.getBytes()>
	//    4    9:invokevirtual   #158 <Method byte[] MessageDigest.digest(byte[])>
	//    5   12:astore_0        
			stringbuilder = new StringBuilder();
	//    6   13:new             #28  <Class StringBuilder>
	//    7   16:dup             
	//    8   17:invokespecial   #29  <Method void StringBuilder()>
	//    9   20:astore_3        
			j = s.length;
	//   10   21:aload_0         
	//   11   22:arraylength     
	//   12   23:istore_2        
		}
	//*  13   24:iconst_0        
	//*  14   25:istore_1        
	//*  15   26:iload_1         
	//*  16   27:iload_2         
	//*  17   28:icmpge          62
	//*  18   31:aload_3         
	//*  19   32:aload_0         
	//*  20   33:iload_1         
	//*  21   34:baload          
	//*  22   35:sipush          255
	//*  23   38:iand            
	//*  24   39:sipush          256
	//*  25   42:ior             
	//*  26   43:invokestatic    #161 <Method String Integer.toHexString(int)>
	//*  27   46:iconst_1        
	//*  28   47:iconst_3        
	//*  29   48:invokevirtual   #165 <Method String String.substring(int, int)>
	//*  30   51:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//*  31   54:pop             
	//*  32   55:iload_1         
	//*  33   56:iconst_1        
	//*  34   57:iadd            
	//*  35   58:istore_1        
	//*  36   59:goto            26
	//*  37   62:aload_3         
	//*  38   63:invokevirtual   #39  <Method String StringBuilder.toString()>
	//*  39   66:astore_0        
	//*  40   67:aload_0         
	//*  41   68:areturn         
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  42   69:astore_0        
		{
			AppboyLogger.e(a, "Failed to calculate MD5 hash", ((Throwable) (s)));
	//   43   70:getstatic       #17  <Field String a>
	//   44   73:ldc1            #167 <String "Failed to calculate MD5 hash">
	//   45   75:aload_0         
	//   46   76:invokestatic    #171 <Method int AppboyLogger.e(String, String, Throwable)>
	//   47   79:pop             
			return null;
	//   48   80:aconst_null     
	//   49   81:areturn         
		}
		i = 0;
		if(i >= j)
			break; /* Loop/switch isn't completed */
		stringbuilder.append(Integer.toHexString(s[i] & 0xff | 0x100).substring(1, 3));
		i++;
		if(true) goto _L2; else goto _L1
_L2:
		break MISSING_BLOCK_LABEL_26;
_L1:
		s = stringbuilder.toString();
		return s;
	}

	public static String getOptionalStringResource(Resources resources, int i, String s)
	{
		try
		{
			resources = ((Resources) (resources.getString(i)));
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokevirtual   #180 <Method String Resources.getString(int)>
	//    3    5:astore_0        
		}
	//*   4    6:aload_0         
	//*   5    7:areturn         
		// Misplaced declaration of an exception variable
		catch(Resources resources)
	//*   6    8:astore_0        
		{
			return s;
	//    7    9:aload_2         
	//    8   10:areturn         
		}
		return ((String) (resources));
	}

	public static boolean isNullOrBlank(String s)
	{
		return s == null || s.trim().length() == 0;
	//    0    0:aload_0         
	//    1    1:ifnull          19
	//    2    4:aload_0         
	//    3    5:invokevirtual   #69  <Method String String.trim()>
	//    4    8:invokevirtual   #47  <Method int String.length()>
	//    5   11:ifne            17
	//    6   14:goto            19
	//    7   17:iconst_0        
	//    8   18:ireturn         
	//    9   19:iconst_1        
	//   10   20:ireturn         
	}

	public static boolean isNullOrEmpty(String s)
	{
		return s == null || s.length() == 0;
	//    0    0:aload_0         
	//    1    1:ifnull          16
	//    2    4:aload_0         
	//    3    5:invokevirtual   #47  <Method int String.length()>
	//    4    8:ifne            14
	//    5   11:goto            16
	//    6   14:iconst_0        
	//    7   15:ireturn         
	//    8   16:iconst_1        
	//    9   17:ireturn         
	}

	public static String join(Collection collection, String s)
	{
		if(collection == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #71  <String "">
	//    3    6:areturn         
		else
			return join((String[])collection.toArray(((Object []) (new String[collection.size()]))), s);
	//    4    7:aload_0         
	//    5    8:aload_0         
	//    6    9:invokeinterface #187 <Method int Collection.size()>
	//    7   14:anewarray       String[]
	//    8   17:invokeinterface #191 <Method Object[] Collection.toArray(Object[])>
	//    9   22:checkcast       #193 <Class String[]>
	//   10   25:aload_1         
	//   11   26:invokestatic    #196 <Method String join(String[], String)>
	//   12   29:areturn         
	}

	public static String join(String as[], String s)
	{
		if(as != null && s != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          100
	//*   2    4:aload_1         
	//*   3    5:ifnonnull       11
	//*   4    8:goto            100
		{
			Object obj = ((Object) (new StringBuilder()));
	//    5   11:new             #28  <Class StringBuilder>
	//    6   14:dup             
	//    7   15:invokespecial   #29  <Method void StringBuilder()>
	//    8   18:astore          4
			int j = as.length;
	//    9   20:aload_0         
	//   10   21:arraylength     
	//   11   22:istore_3        
			for(int i = 0; i < j; i++)
	//*  12   23:iconst_0        
	//*  13   24:istore_2        
	//*  14   25:iload_2         
	//*  15   26:iload_3         
	//*  16   27:icmpge          62
			{
				String s1 = as[i];
	//   17   30:aload_0         
	//   18   31:iload_2         
	//   19   32:aaload          
	//   20   33:astore          5
				if(s1 != null)
	//*  21   35:aload           5
	//*  22   37:ifnull          55
				{
					((StringBuilder) (obj)).append(s1);
	//   23   40:aload           4
	//   24   42:aload           5
	//   25   44:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   26   47:pop             
					((StringBuilder) (obj)).append(s);
	//   27   48:aload           4
	//   28   50:aload_1         
	//   29   51:invokevirtual   #35  <Method StringBuilder StringBuilder.append(String)>
	//   30   54:pop             
				}
			}

	//   31   55:iload_2         
	//   32   56:iconst_1        
	//   33   57:iadd            
	//   34   58:istore_2        
	//*  35   59:goto            25
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   36   62:aload           4
	//   37   64:invokevirtual   #39  <Method String StringBuilder.toString()>
	//   38   67:astore          4
			as = ((String []) (obj));
	//   39   69:aload           4
	//   40   71:astore_0        
			if(((String) (obj)).endsWith(s))
	//*  41   72:aload           4
	//*  42   74:aload_1         
	//*  43   75:invokevirtual   #201 <Method boolean String.endsWith(String)>
	//*  44   78:ifeq            98
				as = ((String []) (((String) (obj)).substring(0, ((String) (obj)).length() - s.length())));
	//   45   81:aload           4
	//   46   83:iconst_0        
	//   47   84:aload           4
	//   48   86:invokevirtual   #47  <Method int String.length()>
	//   49   89:aload_1         
	//   50   90:invokevirtual   #47  <Method int String.length()>
	//   51   93:isub            
	//   52   94:invokevirtual   #165 <Method String String.substring(int, int)>
	//   53   97:astore_0        
			return ((String) (as));
	//   54   98:aload_0         
	//   55   99:areturn         
		} else
		{
			return "";
	//   56  100:ldc1            #71  <String "">
	//   57  102:areturn         
		}
	}

	public static HashSet jsonArrayToHashSet(JSONArray jsonarray)
	{
		HashSet hashset = new HashSet();
	//    0    0:new             #205 <Class HashSet>
	//    1    3:dup             
	//    2    4:invokespecial   #206 <Method void HashSet()>
	//    3    7:astore_2        
		if(jsonarray != null)
	//*   4    8:aload_0         
	//*   5    9:ifnull          42
		{
			for(int i = 0; i < jsonarray.length(); i++)
	//*   6   12:iconst_0        
	//*   7   13:istore_1        
	//*   8   14:iload_1         
	//*   9   15:aload_0         
	//*  10   16:invokevirtual   #209 <Method int JSONArray.length()>
	//*  11   19:icmpge          42
				hashset.add(((Object) (jsonarray.get(i).toString())));
	//   12   22:aload_2         
	//   13   23:aload_0         
	//   14   24:iload_1         
	//   15   25:invokevirtual   #213 <Method Object JSONArray.get(int)>
	//   16   28:invokevirtual   #214 <Method String Object.toString()>
	//   17   31:invokevirtual   #217 <Method boolean HashSet.add(Object)>
	//   18   34:pop             

	//   19   35:iload_1         
	//   20   36:iconst_1        
	//   21   37:iadd            
	//   22   38:istore_1        
		}
	//*  23   39:goto            14
		return hashset;
	//   24   42:aload_2         
	//   25   43:areturn         
	}

	public static HashSet stringArrayToHashSet(String as[])
	{
		return new HashSet(((Collection) (Arrays.asList(((Object []) (as))))));
	//    0    0:new             #205 <Class HashSet>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokestatic    #226 <Method java.util.List Arrays.asList(Object[])>
	//    4    8:invokespecial   #229 <Method void HashSet(Collection)>
	//    5   11:areturn         
	}

	public static String stringArrayToJsonString(String as[])
	{
		JSONArray jsonarray = new JSONArray();
	//    0    0:new             #208 <Class JSONArray>
	//    1    3:dup             
	//    2    4:invokespecial   #233 <Method void JSONArray()>
	//    3    7:astore_3        
		if(as == null)
	//*   4    8:aload_0         
	//*   5    9:ifnonnull       14
			return null;
	//    6   12:aconst_null     
	//    7   13:areturn         
		if(as.length == 0)
	//*   8   14:aload_0         
	//*   9   15:arraylength     
	//*  10   16:ifne            22
			return "[]";
	//   11   19:ldc1            #235 <String "[]">
	//   12   21:areturn         
		int j = as.length;
	//   13   22:aload_0         
	//   14   23:arraylength     
	//   15   24:istore_2        
		for(int i = 0; i < j; i++)
	//*  16   25:iconst_0        
	//*  17   26:istore_1        
	//*  18   27:iload_1         
	//*  19   28:iload_2         
	//*  20   29:icmpge          47
			jsonarray.put(((Object) (as[i])));
	//   21   32:aload_3         
	//   22   33:aload_0         
	//   23   34:iload_1         
	//   24   35:aaload          
	//   25   36:invokevirtual   #239 <Method JSONArray JSONArray.put(Object)>
	//   26   39:pop             

	//   27   40:iload_1         
	//   28   41:iconst_1        
	//   29   42:iadd            
	//   30   43:istore_1        
	//*  31   44:goto            27
		if(!(jsonarray instanceof JSONArray))
	//*  32   47:aload_3         
	//*  33   48:instanceof      #208 <Class JSONArray>
	//*  34   51:ifne            59
			return jsonarray.toString();
	//   35   54:aload_3         
	//   36   55:invokevirtual   #240 <Method String JSONArray.toString()>
	//   37   58:areturn         
		else
			return JSONArrayInstrumentation.toString((JSONArray)jsonarray);
	//   38   59:aload_3         
	//   39   60:checkcast       #208 <Class JSONArray>
	//   40   63:invokestatic    #245 <Method String JSONArrayInstrumentation.toString(JSONArray)>
	//   41   66:areturn         
	}

	private static final String a = AppboyLogger.getAppboyLogTag(com/appboy/support/StringUtils);

	static 
	{
	//    0    0:ldc1            #2   <Class StringUtils>
	//    1    2:invokestatic    #15  <Method String AppboyLogger.getAppboyLogTag(Class)>
	//    2    5:putstatic       #17  <Field String a>
	//*   3    8:return          
	}
}
