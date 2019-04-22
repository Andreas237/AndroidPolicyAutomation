// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client.utilities;

import java.io.UnsupportedEncodingException;
import java.net.*;
import java.util.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.*;
import org.apache.http.message.BasicNameValuePair;

public class HttpUtilities
{
	public static final class HttpRequestType extends Enum
	{

		public static HttpRequestType valueOf(String s)
		{
			return (HttpRequestType)Enum.valueOf(com/firebase/client/utilities/HttpUtilities$HttpRequestType, s);
		//    0    0:ldc1            #2   <Class HttpUtilities$HttpRequestType>
		//    1    2:aload_0         
		//    2    3:invokestatic    #43  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class HttpUtilities$HttpRequestType>
		//    4    9:areturn         
		}

		public static HttpRequestType[] values()
		{
			return (HttpRequestType[])((HttpRequestType []) ($VALUES)).clone();
		//    0    0:getstatic       #35  <Field HttpUtilities$HttpRequestType[] $VALUES>
		//    1    3:invokevirtual   #50  <Method Object _5B_Lcom.firebase.client.utilities.HttpUtilities$HttpRequestType_3B_.clone()>
		//    2    6:checkcast       #46  <Class HttpUtilities$HttpRequestType[]>
		//    3    9:areturn         
		}

		private static final HttpRequestType $VALUES[];
		public static final HttpRequestType DELETE;
		public static final HttpRequestType GET;
		public static final HttpRequestType POST;
		public static final HttpRequestType PUT;

		static 
		{
			GET = new HttpRequestType("GET", 0);
		//    0    0:new             #2   <Class HttpUtilities$HttpRequestType>
		//    1    3:dup             
		//    2    4:ldc1            #18  <String "GET">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #22  <Method void HttpUtilities$HttpRequestType(String, int)>
		//    5   10:putstatic       #24  <Field HttpUtilities$HttpRequestType GET>
			POST = new HttpRequestType("POST", 1);
		//    6   13:new             #2   <Class HttpUtilities$HttpRequestType>
		//    7   16:dup             
		//    8   17:ldc1            #25  <String "POST">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #22  <Method void HttpUtilities$HttpRequestType(String, int)>
		//   11   23:putstatic       #27  <Field HttpUtilities$HttpRequestType POST>
			DELETE = new HttpRequestType("DELETE", 2);
		//   12   26:new             #2   <Class HttpUtilities$HttpRequestType>
		//   13   29:dup             
		//   14   30:ldc1            #28  <String "DELETE">
		//   15   32:iconst_2        
		//   16   33:invokespecial   #22  <Method void HttpUtilities$HttpRequestType(String, int)>
		//   17   36:putstatic       #30  <Field HttpUtilities$HttpRequestType DELETE>
			PUT = new HttpRequestType("PUT", 3);
		//   18   39:new             #2   <Class HttpUtilities$HttpRequestType>
		//   19   42:dup             
		//   20   43:ldc1            #31  <String "PUT">
		//   21   45:iconst_3        
		//   22   46:invokespecial   #22  <Method void HttpUtilities$HttpRequestType(String, int)>
		//   23   49:putstatic       #33  <Field HttpUtilities$HttpRequestType PUT>
			$VALUES = (new HttpRequestType[] {
				GET, POST, DELETE, PUT
			});
		//   24   52:iconst_4        
		//   25   53:anewarray       HttpRequestType[]
		//   26   56:dup             
		//   27   57:iconst_0        
		//   28   58:getstatic       #24  <Field HttpUtilities$HttpRequestType GET>
		//   29   61:aastore         
		//   30   62:dup             
		//   31   63:iconst_1        
		//   32   64:getstatic       #27  <Field HttpUtilities$HttpRequestType POST>
		//   33   67:aastore         
		//   34   68:dup             
		//   35   69:iconst_2        
		//   36   70:getstatic       #30  <Field HttpUtilities$HttpRequestType DELETE>
		//   37   73:aastore         
		//   38   74:dup             
		//   39   75:iconst_3        
		//   40   76:getstatic       #33  <Field HttpUtilities$HttpRequestType PUT>
		//   41   79:aastore         
		//   42   80:putstatic       #35  <Field HttpUtilities$HttpRequestType[] $VALUES>
		//*  43   83:return          
		}

		private HttpRequestType(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #37  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public HttpUtilities()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #13  <Method void Object()>
	//    2    4:return          
	}

	private static void addMethodParams(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase, Map map)
	{
		if(map != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          105
		{
			ArrayList arraylist = new ArrayList();
	//    2    4:new             #20  <Class ArrayList>
	//    3    7:dup             
	//    4    8:invokespecial   #21  <Method void ArrayList()>
	//    5   11:astore_2        
			java.util.Map.Entry entry;
			for(map = ((Map) (map.entrySet().iterator())); ((Iterator) (map)).hasNext(); ((List) (arraylist)).add(((Object) (new BasicNameValuePair((String)entry.getKey(), (String)entry.getValue())))))
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #27  <Method Set Map.entrySet()>
	//*   8   18:invokeinterface #33  <Method Iterator Set.iterator()>
	//*   9   23:astore_1        
	//*  10   24:aload_1         
	//*  11   25:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//*  12   30:ifeq            78
				entry = (java.util.Map.Entry)((Iterator) (map)).next();
	//   13   33:aload_1         
	//   14   34:invokeinterface #43  <Method Object Iterator.next()>
	//   15   39:checkcast       #45  <Class java.util.Map$Entry>
	//   16   42:astore_3        

	//   17   43:aload_2         
	//   18   44:new             #47  <Class BasicNameValuePair>
	//   19   47:dup             
	//   20   48:aload_3         
	//   21   49:invokeinterface #50  <Method Object java.util.Map$Entry.getKey()>
	//   22   54:checkcast       #52  <Class String>
	//   23   57:aload_3         
	//   24   58:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
	//   25   63:checkcast       #52  <Class String>
	//   26   66:invokespecial   #58  <Method void BasicNameValuePair(String, String)>
	//   27   69:invokeinterface #64  <Method boolean List.add(Object)>
	//   28   74:pop             
	//*  29   75:goto            24
			try
			{
				httpentityenclosingrequestbase.setEntity(((org.apache.http.HttpEntity) (new UrlEncodedFormEntity(((List) (arraylist)), "utf-8"))));
	//   30   78:aload_0         
	//   31   79:new             #66  <Class UrlEncodedFormEntity>
	//   32   82:dup             
	//   33   83:aload_2         
	//   34   84:ldc1            #68  <String "utf-8">
	//   35   86:invokespecial   #71  <Method void UrlEncodedFormEntity(List, String)>
	//   36   89:invokevirtual   #77  <Method void HttpEntityEnclosingRequestBase.setEntity(org.apache.http.HttpEntity)>
				return;
	//   37   92:return          
			}
			// Misplaced declaration of an exception variable
			catch(HttpEntityEnclosingRequestBase httpentityenclosingrequestbase)
	//*  38   93:astore_0        
			{
				throw new RuntimeException("Didn't find utf-8 encoding", ((Throwable) (httpentityenclosingrequestbase)));
	//   39   94:new             #79  <Class RuntimeException>
	//   40   97:dup             
	//   41   98:ldc1            #81  <String "Didn't find utf-8 encoding">
	//   42  100:aload_0         
	//   43  101:invokespecial   #84  <Method void RuntimeException(String, Throwable)>
	//   44  104:athrow          
			}
		} else
		{
			return;
	//   45  105:return          
		}
	}

	public static URI buildUrl(String s, String s1, Map map)
	{
		boolean flag;
		java.util.Map.Entry entry;
		try
		{
			s = ((String) (new URI(s)));
	//    0    0:new             #92  <Class URI>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:invokespecial   #95  <Method void URI(String)>
	//    4    8:astore_0        
			s1 = ((String) (new URI(((URI) (s)).getScheme(), ((URI) (s)).getAuthority(), s1, ((String) (null)), ((String) (null)))));
	//    5    9:new             #92  <Class URI>
	//    6   12:dup             
	//    7   13:aload_0         
	//    8   14:invokevirtual   #99  <Method String URI.getScheme()>
	//    9   17:aload_0         
	//   10   18:invokevirtual   #102 <Method String URI.getAuthority()>
	//   11   21:aload_1         
	//   12   22:aconst_null     
	//   13   23:aconst_null     
	//   14   24:invokespecial   #105 <Method void URI(String, String, String, String, String)>
	//   15   27:astore_1        
		}
	//*  16   28:aconst_null     
	//*  17   29:astore_0        
	//*  18   30:aload_2         
	//*  19   31:ifnull          144
	//*  20   34:new             #107 <Class StringBuilder>
	//*  21   37:dup             
	//*  22   38:invokespecial   #108 <Method void StringBuilder()>
	//*  23   41:astore_0        
	//*  24   42:iconst_1        
	//*  25   43:istore_3        
	//*  26   44:aload_2         
	//*  27   45:invokeinterface #27  <Method Set Map.entrySet()>
	//*  28   50:invokeinterface #33  <Method Iterator Set.iterator()>
	//*  29   55:astore_2        
	//*  30   56:aload_2         
	//*  31   57:invokeinterface #39  <Method boolean Iterator.hasNext()>
	//*  32   62:ifeq            139
	//*  33   65:aload_2         
	//*  34   66:invokeinterface #43  <Method Object Iterator.next()>
	//*  35   71:checkcast       #45  <Class java.util.Map$Entry>
	//*  36   74:astore          4
	//*  37   76:iload_3         
	//*  38   77:ifne            87
	//*  39   80:aload_0         
	//*  40   81:ldc1            #110 <String "&">
	//*  41   83:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//*  42   86:pop             
	//*  43   87:iconst_0        
	//*  44   88:istore_3        
	//*  45   89:aload_0         
	//*  46   90:aload           4
	//*  47   92:invokeinterface #50  <Method Object java.util.Map$Entry.getKey()>
	//*  48   97:checkcast       #52  <Class String>
	//*  49  100:ldc1            #68  <String "utf-8">
	//*  50  102:invokestatic    #120 <Method String URLEncoder.encode(String, String)>
	//*  51  105:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//*  52  108:pop             
	//*  53  109:aload_0         
	//*  54  110:ldc1            #122 <String "=">
	//*  55  112:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//*  56  115:pop             
	//*  57  116:aload_0         
	//*  58  117:aload           4
	//*  59  119:invokeinterface #55  <Method Object java.util.Map$Entry.getValue()>
	//*  60  124:checkcast       #52  <Class String>
	//*  61  127:ldc1            #68  <String "utf-8">
	//*  62  129:invokestatic    #120 <Method String URLEncoder.encode(String, String)>
	//*  63  132:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//*  64  135:pop             
	//*  65  136:goto            56
	//*  66  139:aload_0         
	//*  67  140:invokevirtual   #125 <Method String StringBuilder.toString()>
	//*  68  143:astore_0        
	//*  69  144:aload_0         
	//*  70  145:ifnull          192
	//*  71  148:new             #107 <Class StringBuilder>
	//*  72  151:dup             
	//*  73  152:invokespecial   #108 <Method void StringBuilder()>
	//*  74  155:astore_2        
	//*  75  156:aload_2         
	//*  76  157:aload_1         
	//*  77  158:invokevirtual   #128 <Method String URI.toASCIIString()>
	//*  78  161:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//*  79  164:pop             
	//*  80  165:aload_2         
	//*  81  166:ldc1            #130 <String "?">
	//*  82  168:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//*  83  171:pop             
	//*  84  172:aload_2         
	//*  85  173:aload_0         
	//*  86  174:invokevirtual   #114 <Method StringBuilder StringBuilder.append(String)>
	//*  87  177:pop             
	//*  88  178:new             #92  <Class URI>
	//*  89  181:dup             
	//*  90  182:aload_2         
	//*  91  183:invokevirtual   #125 <Method String StringBuilder.toString()>
	//*  92  186:invokespecial   #95  <Method void URI(String)>
	//*  93  189:astore_0        
	//*  94  190:aload_0         
	//*  95  191:areturn         
	//*  96  192:aload_1         
	//*  97  193:areturn         
	//*  98  194:astore_0        
	//*  99  195:new             #79  <Class RuntimeException>
	//* 100  198:dup             
	//* 101  199:ldc1            #132 <String "Couldn't build valid auth URI.">
	//* 102  201:aload_0         
	//* 103  202:invokespecial   #84  <Method void RuntimeException(String, Throwable)>
	//* 104  205:athrow          
		// Misplaced declaration of an exception variable
		catch(String s)
	//* 105  206:astore_0        
		{
			throw new RuntimeException("Couldn't build valid auth URI.", ((Throwable) (s)));
	//  106  207:new             #79  <Class RuntimeException>
	//  107  210:dup             
	//  108  211:ldc1            #132 <String "Couldn't build valid auth URI.">
	//  109  213:aload_0         
	//  110  214:invokespecial   #84  <Method void RuntimeException(String, Throwable)>
	//  111  217:athrow          
		}
		// Misplaced declaration of an exception variable
		catch(String s)
		{
			throw new RuntimeException("Couldn't build valid auth URI.", ((Throwable) (s)));
		}
		s = null;
		if(map == null)
			break MISSING_BLOCK_LABEL_144;
		s = ((String) (new StringBuilder()));
		flag = true;
		map = ((Map) (map.entrySet().iterator()));
_L1:
		if(!((Iterator) (map)).hasNext())
			break MISSING_BLOCK_LABEL_139;
		entry = (java.util.Map.Entry)((Iterator) (map)).next();
		if(flag)
			break MISSING_BLOCK_LABEL_87;
		((StringBuilder) (s)).append("&");
		flag = false;
		((StringBuilder) (s)).append(URLEncoder.encode((String)entry.getKey(), "utf-8"));
		((StringBuilder) (s)).append("=");
		((StringBuilder) (s)).append(URLEncoder.encode((String)entry.getValue(), "utf-8"));
		  goto _L1
		s = ((StringBuilder) (s)).toString();
		if(s == null)
			break MISSING_BLOCK_LABEL_192;
		map = ((Map) (new StringBuilder()));
		((StringBuilder) (map)).append(((URI) (s1)).toASCIIString());
		((StringBuilder) (map)).append("?");
		((StringBuilder) (map)).append(s);
		s = ((String) (new URI(((StringBuilder) (map)).toString())));
		return ((URI) (s));
		return ((URI) (s1));
	}

	public static HttpUriRequest requestWithType(String s, String s1, HttpRequestType httprequesttype, Map map, Map map1)
	{
		static class _cls1
		{

			static final int $SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType[];

			static 
			{
				$SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType = new int[HttpRequestType.values().length];
			//    0    0:invokestatic    #18  <Method HttpUtilities$HttpRequestType[] HttpUtilities$HttpRequestType.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] $SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType>
				try
				{
					$SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType[HttpRequestType.GET.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType>
			//    5   12:getstatic       #24  <Field HttpUtilities$HttpRequestType HttpUtilities$HttpRequestType.GET>
			//    6   15:invokevirtual   #28  <Method int HttpUtilities$HttpRequestType.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType>
			//*  10   23:getstatic       #31  <Field HttpUtilities$HttpRequestType HttpUtilities$HttpRequestType.DELETE>
			//*  11   26:invokevirtual   #28  <Method int HttpUtilities$HttpRequestType.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType>
			//*  15   34:getstatic       #34  <Field HttpUtilities$HttpRequestType HttpUtilities$HttpRequestType.POST>
			//*  16   37:invokevirtual   #28  <Method int HttpUtilities$HttpRequestType.ordinal()>
			//*  17   40:iconst_3        
			//*  18   41:iastore         
			//*  19   42:getstatic       #20  <Field int[] $SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType>
			//*  20   45:getstatic       #37  <Field HttpUtilities$HttpRequestType HttpUtilities$HttpRequestType.PUT>
			//*  21   48:invokevirtual   #28  <Method int HttpUtilities$HttpRequestType.ordinal()>
			//*  22   51:iconst_4        
			//*  23   52:iastore         
			//*  24   53:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   25   54:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType[HttpRequestType.DELETE.ordinal()] = 2;
				}
			//*  26   55:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   27   58:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType[HttpRequestType.POST.ordinal()] = 3;
				}
			//*  28   59:goto            31
				catch(NoSuchFieldError nosuchfielderror2) { }
			//   29   62:astore_0        
				try
				{
					$SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType[HttpRequestType.PUT.ordinal()] = 4;
				}
			//*  30   63:goto            42
				catch(NoSuchFieldError nosuchfielderror3) { }
			//   31   66:astore_0        
			//*  32   67:return          
			}
		}

		switch(_cls1..SwitchMap.com.firebase.client.utilities.HttpUtilities.HttpRequestType[httprequesttype.ordinal()])
	//*   0    0:getstatic       #139 <Field int[] HttpUtilities$1.$SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType>
	//*   1    3:aload_2         
	//*   2    4:invokevirtual   #143 <Method int HttpUtilities$HttpRequestType.ordinal()>
	//*   3    7:iaload          
		{
	//*   4    8:tableswitch     1 2: default 32
	//	               1 35
	//	               2 35
	//*   5   32:goto            52
		case 1: // '\001'
		case 2: // '\002'
			map = ((Map) (new HashMap(map)));
	//    6   35:new             #145 <Class HashMap>
	//    7   38:dup             
	//    8   39:aload_3         
	//    9   40:invokespecial   #148 <Method void HashMap(Map)>
	//   10   43:astore_3        
			map.putAll(map1);
	//   11   44:aload_3         
	//   12   45:aload           4
	//   13   47:invokeinterface #151 <Method void Map.putAll(Map)>
			break;
		}
		if(httprequesttype == HttpRequestType.DELETE)
	//*  14   52:aload_2         
	//*  15   53:getstatic       #155 <Field HttpUtilities$HttpRequestType HttpUtilities$HttpRequestType.DELETE>
	//*  16   56:if_acmpne       70
			map.put("_method", "delete");
	//   17   59:aload_3         
	//   18   60:ldc1            #157 <String "_method">
	//   19   62:ldc1            #159 <String "delete">
	//   20   64:invokeinterface #163 <Method Object Map.put(Object, Object)>
	//   21   69:pop             
		s = ((String) (buildUrl(s, s1, map)));
	//   22   70:aload_0         
	//   23   71:aload_1         
	//   24   72:aload_3         
	//   25   73:invokestatic    #165 <Method URI buildUrl(String, String, Map)>
	//   26   76:astore_0        
		switch(_cls1..SwitchMap.com.firebase.client.utilities.HttpUtilities.HttpRequestType[httprequesttype.ordinal()])
	//*  27   77:getstatic       #139 <Field int[] HttpUtilities$1.$SwitchMap$com$firebase$client$utilities$HttpUtilities$HttpRequestType>
	//*  28   80:aload_2         
	//*  29   81:invokevirtual   #143 <Method int HttpUtilities$HttpRequestType.ordinal()>
	//*  30   84:iaload          
		{
	//*  31   85:tableswitch     1 4: default 116
	//	               1 179
	//	               2 170
	//	               3 148
	//	               4 126
		default:
			throw new IllegalStateException("Shouldn't reach here!");
	//   32  116:new             #167 <Class IllegalStateException>
	//   33  119:dup             
	//   34  120:ldc1            #169 <String "Shouldn't reach here!">
	//   35  122:invokespecial   #170 <Method void IllegalStateException(String)>
	//   36  125:athrow          

		case 4: // '\004'
			s = ((String) (new HttpPut(((URI) (s)))));
	//   37  126:new             #172 <Class HttpPut>
	//   38  129:dup             
	//   39  130:aload_0         
	//   40  131:invokespecial   #175 <Method void HttpPut(URI)>
	//   41  134:astore_0        
			if(map1 != null)
	//*  42  135:aload           4
	//*  43  137:ifnull          146
				addMethodParams(((HttpEntityEnclosingRequestBase) (s)), map1);
	//   44  140:aload_0         
	//   45  141:aload           4
	//   46  143:invokestatic    #177 <Method void addMethodParams(HttpEntityEnclosingRequestBase, Map)>
			return ((HttpUriRequest) (s));
	//   47  146:aload_0         
	//   48  147:areturn         

		case 3: // '\003'
			s = ((String) (new HttpPost(((URI) (s)))));
	//   49  148:new             #179 <Class HttpPost>
	//   50  151:dup             
	//   51  152:aload_0         
	//   52  153:invokespecial   #180 <Method void HttpPost(URI)>
	//   53  156:astore_0        
			if(map1 != null)
	//*  54  157:aload           4
	//*  55  159:ifnull          168
				addMethodParams(((HttpEntityEnclosingRequestBase) (s)), map1);
	//   56  162:aload_0         
	//   57  163:aload           4
	//   58  165:invokestatic    #177 <Method void addMethodParams(HttpEntityEnclosingRequestBase, Map)>
			return ((HttpUriRequest) (s));
	//   59  168:aload_0         
	//   60  169:areturn         

		case 2: // '\002'
			return ((HttpUriRequest) (new HttpDelete(((URI) (s)))));
	//   61  170:new             #182 <Class HttpDelete>
	//   62  173:dup             
	//   63  174:aload_0         
	//   64  175:invokespecial   #183 <Method void HttpDelete(URI)>
	//   65  178:areturn         

		case 1: // '\001'
			return ((HttpUriRequest) (new HttpGet(((URI) (s)))));
	//   66  179:new             #185 <Class HttpGet>
	//   67  182:dup             
	//   68  183:aload_0         
	//   69  184:invokespecial   #186 <Method void HttpGet(URI)>
	//   70  187:areturn         
		}
	}
}
