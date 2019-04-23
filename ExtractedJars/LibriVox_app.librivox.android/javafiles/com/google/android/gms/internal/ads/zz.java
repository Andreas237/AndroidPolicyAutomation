// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.JsonWriter;
import com.google.android.gms.common.util.*;
import java.io.IOException;
import java.io.StringWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			aag, aaf, zv, p, 
//			bwk, m, aae, aaa, 
//			aab, aad

public final class zz
{

	public zz()
	{
		this(((String) (null)));
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:invokespecial   #53  <Method void zz(String)>
	//    3    5:return          
	}

	public zz(String s)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #21  <Method void Object()>
		if(!c())
	//*   2    4:invokestatic    #56  <Method boolean c()>
	//*   3    7:ifne            21
		{
			s = ((String) (new ArrayList()));
	//    4   10:new             #58  <Class ArrayList>
	//    5   13:dup             
	//    6   14:invokespecial   #59  <Method void ArrayList()>
	//    7   17:astore_1        
		} else
	//*   8   18:goto            159
		{
			String s1 = UUID.randomUUID().toString();
	//    9   21:invokestatic    #65  <Method UUID UUID.randomUUID()>
	//   10   24:invokevirtual   #69  <Method String UUID.toString()>
	//   11   27:astore_2        
			if(s == null)
	//*  12   28:aload_1         
	//*  13   29:ifnonnull       79
			{
				s = String.valueOf(((Object) (s1)));
	//   14   32:aload_2         
	//   15   33:invokestatic    #73  <Method String String.valueOf(Object)>
	//   16   36:astore_1        
				if(s.length() != 0)
	//*  17   37:aload_1         
	//*  18   38:invokevirtual   #77  <Method int String.length()>
	//*  19   41:ifeq            54
					s = "network_request_".concat(s);
	//   20   44:ldc1            #79  <String "network_request_">
	//   21   46:aload_1         
	//   22   47:invokevirtual   #83  <Method String String.concat(String)>
	//   23   50:astore_1        
				else
	//*  24   51:goto            64
					s = new String("network_request_");
	//   25   54:new             #38  <Class String>
	//   26   57:dup             
	//   27   58:ldc1            #79  <String "network_request_">
	//   28   60:invokespecial   #84  <Method void String(String)>
	//   29   63:astore_1        
				s = ((String) (Arrays.asList(((Object []) (new String[] {
					s
				})))));
	//   30   64:iconst_1        
	//   31   65:anewarray       String[]
	//   32   68:dup             
	//   33   69:iconst_0        
	//   34   70:aload_1         
	//   35   71:aastore         
	//   36   72:invokestatic    #44  <Method List Arrays.asList(Object[])>
	//   37   75:astore_1        
			} else
	//*  38   76:goto            159
			{
				s = String.valueOf(((Object) (s)));
	//   39   79:aload_1         
	//   40   80:invokestatic    #73  <Method String String.valueOf(Object)>
	//   41   83:astore_1        
				if(s.length() != 0)
	//*  42   84:aload_1         
	//*  43   85:invokevirtual   #77  <Method int String.length()>
	//*  44   88:ifeq            101
					s = "ad_request_".concat(s);
	//   45   91:ldc1            #86  <String "ad_request_">
	//   46   93:aload_1         
	//   47   94:invokevirtual   #83  <Method String String.concat(String)>
	//   48   97:astore_1        
				else
	//*  49   98:goto            111
					s = new String("ad_request_");
	//   50  101:new             #38  <Class String>
	//   51  104:dup             
	//   52  105:ldc1            #86  <String "ad_request_">
	//   53  107:invokespecial   #84  <Method void String(String)>
	//   54  110:astore_1        
				s1 = String.valueOf(((Object) (s1)));
	//   55  111:aload_2         
	//   56  112:invokestatic    #73  <Method String String.valueOf(Object)>
	//   57  115:astore_2        
				if(s1.length() != 0)
	//*  58  116:aload_2         
	//*  59  117:invokevirtual   #77  <Method int String.length()>
	//*  60  120:ifeq            133
					s1 = "network_request_".concat(s1);
	//   61  123:ldc1            #79  <String "network_request_">
	//   62  125:aload_2         
	//   63  126:invokevirtual   #83  <Method String String.concat(String)>
	//   64  129:astore_2        
				else
	//*  65  130:goto            143
					s1 = new String("network_request_");
	//   66  133:new             #38  <Class String>
	//   67  136:dup             
	//   68  137:ldc1            #79  <String "network_request_">
	//   69  139:invokespecial   #84  <Method void String(String)>
	//   70  142:astore_2        
				s = ((String) (Arrays.asList(((Object []) (new String[] {
					s, s1
				})))));
	//   71  143:iconst_2        
	//   72  144:anewarray       String[]
	//   73  147:dup             
	//   74  148:iconst_0        
	//   75  149:aload_1         
	//   76  150:aastore         
	//   77  151:dup             
	//   78  152:iconst_1        
	//   79  153:aload_2         
	//   80  154:aastore         
	//   81  155:invokestatic    #44  <Method List Arrays.asList(Object[])>
	//   82  158:astore_1        
			}
		}
		f = ((List) (s));
	//   83  159:aload_0         
	//   84  160:aload_1         
	//   85  161:putfield        #88  <Field List f>
	//   86  164:return          
	}

	public static void a()
	{
		synchronized(a)
	//*   0    0:getstatic       #23  <Field Object a>
	//*   1    3:astore_0        
	//*   2    4:aload_0         
	//*   3    5:monitorenter    
		{
			b = false;
	//    4    6:iconst_0        
	//    5    7:putstatic       #25  <Field boolean b>
			c = false;
	//    6   10:iconst_0        
	//    7   11:putstatic       #27  <Field boolean c>
			com.google.android.gms.internal.ads.aag.e("Ad debug logging enablement is out of date.");
	//    8   14:ldc1            #90  <String "Ad debug logging enablement is out of date.">
	//    9   16:invokestatic    #94  <Method void com.google.android.gms.internal.ads.aag.e(String)>
		}
	//   10   19:aload_0         
	//   11   20:monitorexit     
		return;
	//   12   21:return          
		exception;
	//   13   22:astore_1        
		obj;
	//   14   23:aload_0         
		JVM INSTR monitorexit ;
	//   15   24:monitorexit     
		throw exception;
	//   16   25:aload_1         
	//   17   26:athrow          
	}

	static final void a(int i, Map map, JsonWriter jsonwriter)
	{
		jsonwriter.name("params").beginObject();
	//    0    0:aload_2         
	//    1    1:ldc1            #97  <String "params">
	//    2    3:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//    3    6:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//    4    9:pop             
		jsonwriter.name("firstline").beginObject();
	//    5   10:aload_2         
	//    6   11:ldc1            #109 <String "firstline">
	//    7   13:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//    8   16:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//    9   19:pop             
		jsonwriter.name("code").value(i);
	//   10   20:aload_2         
	//   11   21:ldc1            #111 <String "code">
	//   12   23:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   13   26:iload_0         
	//   14   27:i2l             
	//   15   28:invokevirtual   #115 <Method JsonWriter JsonWriter.value(long)>
	//   16   31:pop             
		jsonwriter.endObject();
	//   17   32:aload_2         
	//   18   33:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   19   36:pop             
		a(jsonwriter, map);
	//   20   37:aload_2         
	//   21   38:aload_1         
	//   22   39:invokestatic    #121 <Method void a(JsonWriter, Map)>
		jsonwriter.endObject();
	//   23   42:aload_2         
	//   24   43:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   25   46:pop             
	//   26   47:return          
	}

	private static void a(JsonWriter jsonwriter, Map map)
	{
label0:
		{
			if(map == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
				return;
	//    2    4:return          
			jsonwriter.name("headers").beginArray();
	//    3    5:aload_0         
	//    4    6:ldc1            #123 <String "headers">
	//    5    8:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//    6   11:invokevirtual   #126 <Method JsonWriter JsonWriter.beginArray()>
	//    7   14:pop             
			map = ((Map) (map.entrySet().iterator()));
	//    8   15:aload_1         
	//    9   16:invokeinterface #132 <Method Set Map.entrySet()>
	//   10   21:invokeinterface #138 <Method Iterator Set.iterator()>
	//   11   26:astore_1        
			do
			{
				String s;
				Object obj;
				do
				{
					if(!((Iterator) (map)).hasNext())
						break label0;
	//   12   27:aload_1         
	//   13   28:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   14   33:ifeq            211
					obj = ((Object) ((java.util.Map.Entry)((Iterator) (map)).next()));
	//   15   36:aload_1         
	//   16   37:invokeinterface #147 <Method Object Iterator.next()>
	//   17   42:checkcast       #149 <Class java.util.Map$Entry>
	//   18   45:astore_3        
					s = (String)((java.util.Map.Entry) (obj)).getKey();
	//   19   46:aload_3         
	//   20   47:invokeinterface #152 <Method Object java.util.Map$Entry.getKey()>
	//   21   52:checkcast       #38  <Class String>
	//   22   55:astore_2        
				} while(e.contains(((Object) (s))));
	//   23   56:getstatic       #49  <Field Set e>
	//   24   59:aload_2         
	//   25   60:invokeinterface #156 <Method boolean Set.contains(Object)>
	//   26   65:ifne            27
				if(((java.util.Map.Entry) (obj)).getValue() instanceof List)
	//*  27   68:aload_3         
	//*  28   69:invokeinterface #159 <Method Object java.util.Map$Entry.getValue()>
	//*  29   74:instanceof      #161 <Class List>
	//*  30   77:ifeq            151
				{
					obj = ((Object) (((List)((java.util.Map.Entry) (obj)).getValue()).iterator()));
	//   31   80:aload_3         
	//   32   81:invokeinterface #159 <Method Object java.util.Map$Entry.getValue()>
	//   33   86:checkcast       #161 <Class List>
	//   34   89:invokeinterface #162 <Method Iterator List.iterator()>
	//   35   94:astore_3        
					while(((Iterator) (obj)).hasNext()) 
	//*  36   95:aload_3         
	//*  37   96:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//*  38  101:ifeq            27
					{
						String s1 = (String)((Iterator) (obj)).next();
	//   39  104:aload_3         
	//   40  105:invokeinterface #147 <Method Object Iterator.next()>
	//   41  110:checkcast       #38  <Class String>
	//   42  113:astore          4
						jsonwriter.beginObject();
	//   43  115:aload_0         
	//   44  116:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//   45  119:pop             
						jsonwriter.name("name").value(s);
	//   46  120:aload_0         
	//   47  121:ldc1            #163 <String "name">
	//   48  123:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   49  126:aload_2         
	//   50  127:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   51  130:pop             
						jsonwriter.name("value").value(s1);
	//   52  131:aload_0         
	//   53  132:ldc1            #166 <String "value">
	//   54  134:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   55  137:aload           4
	//   56  139:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   57  142:pop             
						jsonwriter.endObject();
	//   58  143:aload_0         
	//   59  144:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   60  147:pop             
					}
					continue;
	//   61  148:goto            95
				}
				if(!(((java.util.Map.Entry) (obj)).getValue() instanceof String))
					break;
	//   62  151:aload_3         
	//   63  152:invokeinterface #159 <Method Object java.util.Map$Entry.getValue()>
	//   64  157:instanceof      #38  <Class String>
	//   65  160:ifeq            206
				jsonwriter.beginObject();
	//   66  163:aload_0         
	//   67  164:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//   68  167:pop             
				jsonwriter.name("name").value(s);
	//   69  168:aload_0         
	//   70  169:ldc1            #163 <String "name">
	//   71  171:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   72  174:aload_2         
	//   73  175:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   74  178:pop             
				jsonwriter.name("value").value((String)((java.util.Map.Entry) (obj)).getValue());
	//   75  179:aload_0         
	//   76  180:ldc1            #166 <String "value">
	//   77  182:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   78  185:aload_3         
	//   79  186:invokeinterface #159 <Method Object java.util.Map$Entry.getValue()>
	//   80  191:checkcast       #38  <Class String>
	//   81  194:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   82  197:pop             
				jsonwriter.endObject();
	//   83  198:aload_0         
	//   84  199:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   85  202:pop             
			} while(true);
	//   86  203:goto            27
			com.google.android.gms.internal.ads.aag.c("Connection headers should be either Map<String, String> or Map<String, List<String>>");
	//   87  206:ldc1            #168 <String "Connection headers should be either Map<String, String> or Map<String, List<String>>">
	//   88  208:invokestatic    #170 <Method void com.google.android.gms.internal.ads.aag.c(String)>
		}
		jsonwriter.endArray();
	//   89  211:aload_0         
	//   90  212:invokevirtual   #173 <Method JsonWriter JsonWriter.endArray()>
	//   91  215:pop             
	//   92  216:return          
	}

	static final void a(String s, JsonWriter jsonwriter)
	{
		jsonwriter.name("params").beginObject();
	//    0    0:aload_1         
	//    1    1:ldc1            #97  <String "params">
	//    2    3:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//    3    6:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//    4    9:pop             
		if(s != null)
	//*   5   10:aload_0         
	//*   6   11:ifnull          25
			jsonwriter.name("error_description").value(s);
	//    7   14:aload_1         
	//    8   15:ldc1            #176 <String "error_description">
	//    9   17:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   10   20:aload_0         
	//   11   21:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   12   24:pop             
		jsonwriter.endObject();
	//   13   25:aload_1         
	//   14   26:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   15   29:pop             
	//   16   30:return          
	}

	private final void a(String s, aaf aaf1)
	{
		StringWriter stringwriter;
		JsonWriter jsonwriter;
		stringwriter = new StringWriter();
	//    0    0:new             #181 <Class StringWriter>
	//    1    3:dup             
	//    2    4:invokespecial   #182 <Method void StringWriter()>
	//    3    7:astore_3        
		jsonwriter = new JsonWriter(((java.io.Writer) (stringwriter)));
	//    4    8:new             #99  <Class JsonWriter>
	//    5   11:dup             
	//    6   12:aload_3         
	//    7   13:invokespecial   #185 <Method void JsonWriter(java.io.Writer)>
	//    8   16:astore          4
		jsonwriter.beginObject();
	//    9   18:aload           4
	//   10   20:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//   11   23:pop             
		jsonwriter.name("timestamp").value(d.a());
	//   12   24:aload           4
	//   13   26:ldc1            #187 <String "timestamp">
	//   14   28:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   15   31:getstatic       #34  <Field e d>
	//   16   34:invokeinterface #192 <Method long e.a()>
	//   17   39:invokevirtual   #115 <Method JsonWriter JsonWriter.value(long)>
	//   18   42:pop             
		jsonwriter.name("event").value(s);
	//   19   43:aload           4
	//   20   45:ldc1            #194 <String "event">
	//   21   47:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   22   50:aload_1         
	//   23   51:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   24   54:pop             
		jsonwriter.name("components").beginArray();
	//   25   55:aload           4
	//   26   57:ldc1            #196 <String "components">
	//   27   59:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   28   62:invokevirtual   #126 <Method JsonWriter JsonWriter.beginArray()>
	//   29   65:pop             
		for(s = ((String) (f.iterator())); ((Iterator) (s)).hasNext(); jsonwriter.value((String)((Iterator) (s)).next()));
	//   30   66:aload_0         
	//   31   67:getfield        #88  <Field List f>
	//   32   70:invokeinterface #162 <Method Iterator List.iterator()>
	//   33   75:astore_1        
	//   34   76:aload_1         
	//   35   77:invokeinterface #143 <Method boolean Iterator.hasNext()>
	//   36   82:ifeq            103
	//   37   85:aload           4
	//   38   87:aload_1         
	//   39   88:invokeinterface #147 <Method Object Iterator.next()>
	//   40   93:checkcast       #38  <Class String>
	//   41   96:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   42   99:pop             
	//*  43  100:goto            76
		try
		{
			jsonwriter.endArray();
	//   44  103:aload           4
	//   45  105:invokevirtual   #173 <Method JsonWriter JsonWriter.endArray()>
	//   46  108:pop             
			aaf1.a(jsonwriter);
	//   47  109:aload_2         
	//   48  110:aload           4
	//   49  112:invokeinterface #201 <Method void aaf.a(JsonWriter)>
			jsonwriter.endObject();
	//   50  117:aload           4
	//   51  119:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   52  122:pop             
			jsonwriter.flush();
	//   53  123:aload           4
	//   54  125:invokevirtual   #204 <Method void JsonWriter.flush()>
			jsonwriter.close();
	//   55  128:aload           4
	//   56  130:invokevirtual   #207 <Method void JsonWriter.close()>
		}
	//*  57  133:goto            143
		// Misplaced declaration of an exception variable
		catch(String s)
	//*  58  136:astore_1        
		{
			aag.b("unable to log", ((Throwable) (s)));
	//   59  137:ldc1            #209 <String "unable to log">
	//   60  139:aload_1         
	//   61  140:invokestatic    #212 <Method void aag.b(String, Throwable)>
		}
		c(stringwriter.toString());
	//   62  143:aload_3         
	//   63  144:invokevirtual   #213 <Method String StringWriter.toString()>
	//   64  147:invokestatic    #214 <Method void c(String)>
		return;
	//   65  150:return          
	}

	static final void a(String s, String s1, Map map, byte abyte0[], JsonWriter jsonwriter)
	{
		jsonwriter.name("params").beginObject();
	//    0    0:aload           4
	//    1    2:ldc1            #97  <String "params">
	//    2    4:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//    3    7:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//    4   10:pop             
		jsonwriter.name("firstline").beginObject();
	//    5   11:aload           4
	//    6   13:ldc1            #109 <String "firstline">
	//    7   15:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//    8   18:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//    9   21:pop             
		jsonwriter.name("uri").value(s);
	//   10   22:aload           4
	//   11   24:ldc1            #217 <String "uri">
	//   12   26:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   13   29:aload_0         
	//   14   30:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   15   33:pop             
		jsonwriter.name("verb").value(s1);
	//   16   34:aload           4
	//   17   36:ldc1            #219 <String "verb">
	//   18   38:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   19   41:aload_1         
	//   20   42:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   21   45:pop             
		jsonwriter.endObject();
	//   22   46:aload           4
	//   23   48:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   24   51:pop             
		a(jsonwriter, map);
	//   25   52:aload           4
	//   26   54:aload_2         
	//   27   55:invokestatic    #121 <Method void a(JsonWriter, Map)>
		if(abyte0 != null)
	//*  28   58:aload_3         
	//*  29   59:ifnull          77
			jsonwriter.name("body").value(com.google.android.gms.common.util.c.a(abyte0));
	//   30   62:aload           4
	//   31   64:ldc1            #221 <String "body">
	//   32   66:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   33   69:aload_3         
	//   34   70:invokestatic    #226 <Method String c.a(byte[])>
	//   35   73:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   36   76:pop             
		jsonwriter.endObject();
	//   37   77:aload           4
	//   38   79:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   39   82:pop             
	//   40   83:return          
	}

	public static void a(boolean flag)
	{
		synchronized(a)
	//*   0    0:getstatic       #23  <Field Object a>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			b = true;
	//    4    6:iconst_1        
	//    5    7:putstatic       #25  <Field boolean b>
			c = flag;
	//    6   10:iload_0         
	//    7   11:putstatic       #27  <Field boolean c>
		}
	//    8   14:aload_1         
	//    9   15:monitorexit     
		return;
	//   10   16:return          
		exception;
	//   11   17:astore_2        
		obj;
	//   12   18:aload_1         
		JVM INSTR monitorexit ;
	//   13   19:monitorexit     
		throw exception;
	//   14   20:aload_2         
	//   15   21:athrow          
	}

	static final void a(byte abyte0[], JsonWriter jsonwriter)
	{
		jsonwriter.name("params").beginObject();
	//    0    0:aload_1         
	//    1    1:ldc1            #97  <String "params">
	//    2    3:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//    3    6:invokevirtual   #107 <Method JsonWriter JsonWriter.beginObject()>
	//    4    9:pop             
		int i = abyte0.length;
	//    5   10:aload_0         
	//    6   11:arraylength     
	//    7   12:istore_2        
		abyte0 = ((byte []) (com.google.android.gms.common.util.c.a(abyte0)));
	//    8   13:aload_0         
	//    9   14:invokestatic    #226 <Method String c.a(byte[])>
	//   10   17:astore_0        
		if(i < 10000)
	//*  11   18:iload_2         
	//*  12   19:sipush          10000
	//*  13   22:icmpge          39
		{
			jsonwriter.name("body").value(((String) (abyte0)));
	//   14   25:aload_1         
	//   15   26:ldc1            #221 <String "body">
	//   16   28:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   17   31:aload_0         
	//   18   32:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   19   35:pop             
		} else
	//*  20   36:goto            59
		{
			abyte0 = ((byte []) (zv.a(((String) (abyte0)))));
	//   21   39:aload_0         
	//   22   40:invokestatic    #232 <Method String zv.a(String)>
	//   23   43:astore_0        
			if(abyte0 != null)
	//*  24   44:aload_0         
	//*  25   45:ifnull          59
				jsonwriter.name("bodydigest").value(((String) (abyte0)));
	//   26   48:aload_1         
	//   27   49:ldc1            #234 <String "bodydigest">
	//   28   51:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   29   54:aload_0         
	//   30   55:invokevirtual   #165 <Method JsonWriter JsonWriter.value(String)>
	//   31   58:pop             
		}
		jsonwriter.name("bodylength").value(i);
	//   32   59:aload_1         
	//   33   60:ldc1            #236 <String "bodylength">
	//   34   62:invokevirtual   #103 <Method JsonWriter JsonWriter.name(String)>
	//   35   65:iload_2         
	//   36   66:i2l             
	//   37   67:invokevirtual   #115 <Method JsonWriter JsonWriter.value(long)>
	//   38   70:pop             
		jsonwriter.endObject();
	//   39   71:aload_1         
	//   40   72:invokevirtual   #118 <Method JsonWriter JsonWriter.endObject()>
	//   41   75:pop             
	//   42   76:return          
	}

	public static boolean a(Context context)
	{
		if(android.os.Build.VERSION.SDK_INT < 17)
	//*   0    0:getstatic       #245 <Field int android.os.Build$VERSION.SDK_INT>
	//*   1    3:bipush          17
	//*   2    5:icmpge          10
			return false;
	//    3    8:iconst_0        
	//    4    9:ireturn         
		com.google.android.gms.internal.ads.e e1 = p.aQ;
	//    5   10:getstatic       #251 <Field com.google.android.gms.internal.ads.e p.aQ>
	//    6   13:astore_2        
		if(!((Boolean)com.google.android.gms.internal.ads.bwk.e().a(e1)).booleanValue())
	//*   7   14:invokestatic    #256 <Method m com.google.android.gms.internal.ads.bwk.e()>
	//*   8   17:aload_2         
	//*   9   18:invokevirtual   #261 <Method Object m.a(com.google.android.gms.internal.ads.e)>
	//*  10   21:checkcast       #263 <Class Boolean>
	//*  11   24:invokevirtual   #266 <Method boolean Boolean.booleanValue()>
	//*  12   27:ifne            32
			return false;
	//   13   30:iconst_0        
	//   14   31:ireturn         
		int i;
		try
		{
			i = android.provider.Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0);
	//   15   32:aload_0         
	//   16   33:invokevirtual   #272 <Method android.content.ContentResolver Context.getContentResolver()>
	//   17   36:ldc2            #274 <String "development_settings_enabled">
	//   18   39:iconst_0        
	//   19   40:invokestatic    #280 <Method int android.provider.Settings$Global.getInt(android.content.ContentResolver, String, int)>
	//   20   43:istore_1        
		}
	//*  21   44:iload_1         
	//*  22   45:ifeq            50
	//*  23   48:iconst_1        
	//*  24   49:ireturn         
	//*  25   50:iconst_0        
	//*  26   51:ireturn         
		// Misplaced declaration of an exception variable
		catch(Context context)
	//*  27   52:astore_0        
		{
			com.google.android.gms.internal.ads.aag.c("Fail to determine debug setting.", ((Throwable) (context)));
	//   28   53:ldc2            #282 <String "Fail to determine debug setting.">
	//   29   56:aload_0         
	//   30   57:invokestatic    #284 <Method void com.google.android.gms.internal.ads.aag.c(String, Throwable)>
			return false;
	//   31   60:iconst_0        
	//   32   61:ireturn         
		}
		return i != 0;
	}

	private final void b(String s)
	{
		a("onNetworkRequestError", ((aaf) (new aae(s))));
	//    0    0:aload_0         
	//    1    1:ldc2            #286 <String "onNetworkRequestError">
	//    2    4:new             #288 <Class aae>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #289 <Method void aae(String)>
	//    6   12:invokespecial   #291 <Method void a(String, aaf)>
	//    7   15:return          
	}

	private final void b(String s, String s1, Map map, byte abyte0[])
	{
		a("onNetworkRequest", ((aaf) (new aaa(s, s1, map, abyte0))));
	//    0    0:aload_0         
	//    1    1:ldc2            #294 <String "onNetworkRequest">
	//    2    4:new             #296 <Class aaa>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #298 <Method void aaa(String, String, Map, byte[])>
	//    9   16:invokespecial   #291 <Method void a(String, aaf)>
	//   10   19:return          
	}

	private final void b(Map map, int i)
	{
		a("onNetworkResponse", ((aaf) (new aab(i, map))));
	//    0    0:aload_0         
	//    1    1:ldc2            #301 <String "onNetworkResponse">
	//    2    4:new             #303 <Class aab>
	//    3    7:dup             
	//    4    8:iload_2         
	//    5    9:aload_1         
	//    6   10:invokespecial   #306 <Method void aab(int, Map)>
	//    7   13:invokespecial   #291 <Method void a(String, aaf)>
	//    8   16:return          
	}

	public static boolean b()
	{
		boolean flag;
		synchronized(a)
	//*   0    0:getstatic       #23  <Field Object a>
	//*   1    3:astore_1        
	//*   2    4:aload_1         
	//*   3    5:monitorenter    
		{
			flag = b;
	//    4    6:getstatic       #25  <Field boolean b>
	//    5    9:istore_0        
		}
	//    6   10:aload_1         
	//    7   11:monitorexit     
		return flag;
	//    8   12:iload_0         
	//    9   13:ireturn         
		exception;
	//   10   14:astore_2        
		obj;
	//   11   15:aload_1         
		JVM INSTR monitorexit ;
	//   12   16:monitorexit     
		throw exception;
	//   13   17:aload_2         
	//   14   18:athrow          
	}

	private static void c(String s)
	{
		com/google/android/gms/internal/ads/zz;
	//    0    0:ldc1            #2   <Class zz>
		JVM INSTR monitorenter ;
	//    1    2:monitorenter    
		aag.d("GMA Debug BEGIN");
	//    2    3:ldc2            #308 <String "GMA Debug BEGIN">
	//    3    6:invokestatic    #310 <Method void aag.d(String)>
		int i = 0;
	//    4    9:iconst_0        
	//    5   10:istore_1        
_L2:
		if(i >= s.length())
			break; /* Loop/switch isn't completed */
	//    6   11:iload_1         
	//    7   12:aload_0         
	//    8   13:invokevirtual   #77  <Method int String.length()>
	//    9   16:icmpge          80
		int j = i + 4000;
	//   10   19:iload_1         
	//   11   20:sipush          4000
	//   12   23:iadd            
	//   13   24:istore_2        
		String s1;
		s1 = String.valueOf(((Object) (s.substring(i, Math.min(j, s.length())))));
	//   14   25:aload_0         
	//   15   26:iload_1         
	//   16   27:iload_2         
	//   17   28:aload_0         
	//   18   29:invokevirtual   #77  <Method int String.length()>
	//   19   32:invokestatic    #316 <Method int Math.min(int, int)>
	//   20   35:invokevirtual   #320 <Method String String.substring(int, int)>
	//   21   38:invokestatic    #73  <Method String String.valueOf(Object)>
	//   22   41:astore_3        
		if(s1.length() != 0)
	//*  23   42:aload_3         
	//*  24   43:invokevirtual   #77  <Method int String.length()>
	//*  25   46:ifeq            60
		{
			s1 = "GMA Debug CONTENT ".concat(s1);
	//   26   49:ldc2            #322 <String "GMA Debug CONTENT ">
	//   27   52:aload_3         
	//   28   53:invokevirtual   #83  <Method String String.concat(String)>
	//   29   56:astore_3        
			break MISSING_BLOCK_LABEL_71;
	//   30   57:goto            71
		}
		s1 = new String("GMA Debug CONTENT ");
	//   31   60:new             #38  <Class String>
	//   32   63:dup             
	//   33   64:ldc2            #322 <String "GMA Debug CONTENT ">
	//   34   67:invokespecial   #84  <Method void String(String)>
	//   35   70:astore_3        
		aag.d(s1);
	//   36   71:aload_3         
	//   37   72:invokestatic    #310 <Method void aag.d(String)>
		i = j;
	//   38   75:iload_2         
	//   39   76:istore_1        
		if(true) goto _L2; else goto _L1
	//   40   77:goto            11
_L1:
		aag.d("GMA Debug FINISH");
	//   41   80:ldc2            #324 <String "GMA Debug FINISH">
	//   42   83:invokestatic    #310 <Method void aag.d(String)>
		com/google/android/gms/internal/ads/zz;
	//   43   86:ldc1            #2   <Class zz>
		JVM INSTR monitorexit ;
	//   44   88:monitorexit     
		return;
	//   45   89:return          
		s;
	//   46   90:astore_0        
	//*  47   91:ldc1            #2   <Class zz>
		throw s;
	//   48   93:monitorexit     
	//   49   94:aload_0         
	//   50   95:athrow          
	}

	public static boolean c()
	{
		Object obj = a;
	//    0    0:getstatic       #23  <Field Object a>
	//    1    3:astore_1        
		obj;
	//    2    4:aload_1         
		JVM INSTR monitorenter ;
	//    3    5:monitorenter    
		boolean flag;
		Exception exception;
		if(b && c)
	//*   4    6:getstatic       #25  <Field boolean b>
	//*   5    9:ifeq            32
	//*   6   12:getstatic       #27  <Field boolean c>
	//*   7   15:ifeq            32
			flag = true;
	//    8   18:iconst_1        
	//    9   19:istore_0        
		else
	//*  10   20:goto            23
	//*  11   23:aload_1         
	//*  12   24:monitorexit     
	//*  13   25:iload_0         
	//*  14   26:ireturn         
	//*  15   27:astore_2        
	//*  16   28:aload_1         
	//*  17   29:monitorexit     
	//*  18   30:aload_2         
	//*  19   31:athrow          
			flag = false;
	//   20   32:iconst_0        
	//   21   33:istore_0        
		obj;
		JVM INSTR monitorexit ;
		return flag;
		exception;
		obj;
		JVM INSTR monitorexit ;
		throw exception;
	//*  22   34:goto            23
	}

	public final void a(String s)
	{
		if(!c())
	//*   0    0:invokestatic    #56  <Method boolean c()>
	//*   1    3:ifne            7
			return;
	//    2    6:return          
		if(s == null)
	//*   3    7:aload_1         
	//*   4    8:ifnonnull       12
		{
			return;
	//    5   11:return          
		} else
		{
			a(s.getBytes());
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #328 <Method byte[] String.getBytes()>
	//    9   17:invokevirtual   #331 <Method void a(byte[])>
			return;
	//   10   20:return          
		}
	}

	public final void a(String s, String s1, Map map, byte abyte0[])
	{
		if(!c())
	//*   0    0:invokestatic    #56  <Method boolean c()>
	//*   1    3:ifne            7
		{
			return;
	//    2    6:return          
		} else
		{
			b(s, s1, map, abyte0);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:aload_2         
	//    6   10:aload_3         
	//    7   11:aload           4
	//    8   13:invokespecial   #333 <Method void b(String, String, Map, byte[])>
			return;
	//    9   16:return          
		}
	}

	public final void a(HttpURLConnection httpurlconnection, int i)
	{
		if(!c())
	//*   0    0:invokestatic    #56  <Method boolean c()>
	//*   1    3:ifne            7
			return;
	//    2    6:return          
		Object obj = ((Object) (httpurlconnection.getHeaderFields()));
	//    3    7:aload_1         
	//    4    8:invokevirtual   #340 <Method Map HttpURLConnection.getHeaderFields()>
	//    5   11:astore_3        
		Object obj1 = null;
	//    6   12:aconst_null     
	//    7   13:astore          4
		if(obj == null)
	//*   8   15:aload_3         
	//*   9   16:ifnonnull       24
			obj = null;
	//   10   19:aconst_null     
	//   11   20:astore_3        
		else
	//*  12   21:goto            36
			obj = ((Object) (new HashMap(httpurlconnection.getHeaderFields())));
	//   13   24:new             #342 <Class HashMap>
	//   14   27:dup             
	//   15   28:aload_1         
	//   16   29:invokevirtual   #340 <Method Map HttpURLConnection.getHeaderFields()>
	//   17   32:invokespecial   #345 <Method void HashMap(Map)>
	//   18   35:astore_3        
		b(((Map) (obj)), i);
	//   19   36:aload_0         
	//   20   37:aload_3         
	//   21   38:iload_2         
	//   22   39:invokespecial   #347 <Method void b(Map, int)>
		if(i < 200 || i >= 300)
	//*  23   42:iload_2         
	//*  24   43:sipush          200
	//*  25   46:icmplt          56
	//*  26   49:iload_2         
	//*  27   50:sipush          300
	//*  28   53:icmplt          114
		{
			try
			{
				httpurlconnection = ((HttpURLConnection) (httpurlconnection.getResponseMessage()));
	//   29   56:aload_1         
	//   30   57:invokevirtual   #350 <Method String HttpURLConnection.getResponseMessage()>
	//   31   60:astore_1        
			}
	//*  32   61:goto            109
			// Misplaced declaration of an exception variable
			catch(HttpURLConnection httpurlconnection)
	//*  33   64:astore_1        
			{
				httpurlconnection = ((HttpURLConnection) (String.valueOf(((Object) (((IOException) (httpurlconnection)).getMessage())))));
	//   34   65:aload_1         
	//   35   66:invokevirtual   #353 <Method String IOException.getMessage()>
	//   36   69:invokestatic    #73  <Method String String.valueOf(Object)>
	//   37   72:astore_1        
				if(((String) (httpurlconnection)).length() != 0)
	//*  38   73:aload_1         
	//*  39   74:invokevirtual   #77  <Method int String.length()>
	//*  40   77:ifeq            91
					httpurlconnection = ((HttpURLConnection) ("Can not get error message from error HttpURLConnection\n".concat(((String) (httpurlconnection)))));
	//   41   80:ldc2            #355 <String "Can not get error message from error HttpURLConnection\n">
	//   42   83:aload_1         
	//   43   84:invokevirtual   #83  <Method String String.concat(String)>
	//   44   87:astore_1        
				else
	//*  45   88:goto            102
					httpurlconnection = ((HttpURLConnection) (new String("Can not get error message from error HttpURLConnection\n")));
	//   46   91:new             #38  <Class String>
	//   47   94:dup             
	//   48   95:ldc2            #355 <String "Can not get error message from error HttpURLConnection\n">
	//   49   98:invokespecial   #84  <Method void String(String)>
	//   50  101:astore_1        
				com.google.android.gms.internal.ads.aag.e(((String) (httpurlconnection)));
	//   51  102:aload_1         
	//   52  103:invokestatic    #94  <Method void com.google.android.gms.internal.ads.aag.e(String)>
				httpurlconnection = ((HttpURLConnection) (obj1));
	//   53  106:aload           4
	//   54  108:astore_1        
			}
			b(((String) (httpurlconnection)));
	//   55  109:aload_0         
	//   56  110:aload_1         
	//   57  111:invokespecial   #357 <Method void b(String)>
		}
	//   58  114:return          
	}

	public final void a(HttpURLConnection httpurlconnection, byte abyte0[])
	{
		if(!c())
	//*   0    0:invokestatic    #56  <Method boolean c()>
	//*   1    3:ifne            7
			return;
	//    2    6:return          
		HashMap hashmap;
		if(httpurlconnection.getRequestProperties() == null)
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #361 <Method Map HttpURLConnection.getRequestProperties()>
	//*   5   11:ifnonnull       19
			hashmap = null;
	//    6   14:aconst_null     
	//    7   15:astore_3        
		else
	//*   8   16:goto            31
			hashmap = new HashMap(httpurlconnection.getRequestProperties());
	//    9   19:new             #342 <Class HashMap>
	//   10   22:dup             
	//   11   23:aload_1         
	//   12   24:invokevirtual   #361 <Method Map HttpURLConnection.getRequestProperties()>
	//   13   27:invokespecial   #345 <Method void HashMap(Map)>
	//   14   30:astore_3        
		b(new String(httpurlconnection.getURL().toString()), new String(httpurlconnection.getRequestMethod()), ((Map) (hashmap)), abyte0);
	//   15   31:aload_0         
	//   16   32:new             #38  <Class String>
	//   17   35:dup             
	//   18   36:aload_1         
	//   19   37:invokevirtual   #365 <Method URL HttpURLConnection.getURL()>
	//   20   40:invokevirtual   #368 <Method String URL.toString()>
	//   21   43:invokespecial   #84  <Method void String(String)>
	//   22   46:new             #38  <Class String>
	//   23   49:dup             
	//   24   50:aload_1         
	//   25   51:invokevirtual   #371 <Method String HttpURLConnection.getRequestMethod()>
	//   26   54:invokespecial   #84  <Method void String(String)>
	//   27   57:aload_3         
	//   28   58:aload_2         
	//   29   59:invokespecial   #333 <Method void b(String, String, Map, byte[])>
	//   30   62:return          
	}

	public final void a(Map map, int i)
	{
		if(!c())
	//*   0    0:invokestatic    #56  <Method boolean c()>
	//*   1    3:ifne            7
			return;
	//    2    6:return          
		b(map, i);
	//    3    7:aload_0         
	//    4    8:aload_1         
	//    5    9:iload_2         
	//    6   10:invokespecial   #347 <Method void b(Map, int)>
		if(i < 200 || i >= 300)
	//*   7   13:iload_2         
	//*   8   14:sipush          200
	//*   9   17:icmplt          27
	//*  10   20:iload_2         
	//*  11   21:sipush          300
	//*  12   24:icmplt          32
			b(((String) (null)));
	//   13   27:aload_0         
	//   14   28:aconst_null     
	//   15   29:invokespecial   #357 <Method void b(String)>
	//   16   32:return          
	}

	public final void a(byte abyte0[])
	{
		a("onNetworkResponseBody", ((aaf) (new aad(abyte0))));
	//    0    0:aload_0         
	//    1    1:ldc2            #373 <String "onNetworkResponseBody">
	//    2    4:new             #375 <Class aad>
	//    3    7:dup             
	//    4    8:aload_1         
	//    5    9:invokespecial   #377 <Method void aad(byte[])>
	//    6   12:invokespecial   #291 <Method void a(String, aaf)>
	//    7   15:return          
	}

	private static Object a = new Object();
	private static boolean b = false;
	private static boolean c = false;
	private static e d = h.d();
	private static final Set e = new HashSet(((java.util.Collection) (Arrays.asList(((Object []) (new String[0]))))));
	private final List f;

	static 
	{
	//    0    0:new             #4   <Class Object>
	//    1    3:dup             
	//    2    4:invokespecial   #21  <Method void Object()>
	//    3    7:putstatic       #23  <Field Object a>
	//    4   10:iconst_0        
	//    5   11:putstatic       #25  <Field boolean b>
	//    6   14:iconst_0        
	//    7   15:putstatic       #27  <Field boolean c>
	//    8   18:invokestatic    #32  <Method e h.d()>
	//    9   21:putstatic       #34  <Field e d>
	//   10   24:new             #36  <Class HashSet>
	//   11   27:dup             
	//   12   28:iconst_0        
	//   13   29:anewarray       String[]
	//   14   32:invokestatic    #44  <Method List Arrays.asList(Object[])>
	//   15   35:invokespecial   #47  <Method void HashSet(java.util.Collection)>
	//   16   38:putstatic       #49  <Field Set e>
	//*  17   41:return          
	}
}
