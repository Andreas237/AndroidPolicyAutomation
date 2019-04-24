// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.Request;
import com.amazonaws.http.HttpMethodName;
import com.amazonaws.util.*;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.*;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

// Referenced classes of package com.amazonaws.auth:
//			AbstractAWSSigner, AWSCredentials, SigningAlgorithm, AnonymousAWSCredentials, 
//			AWSSessionCredentials

public class AWS4Signer extends AbstractAWSSigner
{
	protected static class HeaderSigningResult
	{

		public byte[] a()
		{
			byte abyte0[] = new byte[d.length];
		//    0    0:aload_0         
		//    1    1:getfield        #26  <Field byte[] d>
		//    2    4:arraylength     
		//    3    5:newarray        byte[]
		//    4    7:astore_1        
			System.arraycopy(((Object) (d)), 0, ((Object) (abyte0)), 0, d.length);
		//    5    8:aload_0         
		//    6    9:getfield        #26  <Field byte[] d>
		//    7   12:iconst_0        
		//    8   13:aload_1         
		//    9   14:iconst_0        
		//   10   15:aload_0         
		//   11   16:getfield        #26  <Field byte[] d>
		//   12   19:arraylength     
		//   13   20:invokestatic    #34  <Method void System.arraycopy(Object, int, Object, int, int)>
			return abyte0;
		//   14   23:aload_1         
		//   15   24:areturn         
		}

		private final String a;
		private final String b;
		private final byte c[];
		private final byte d[];

		public HeaderSigningResult(String s, String s1, byte abyte0[], byte abyte1[])
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #18  <Method void Object()>
			a = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #20  <Field String a>
			b = s1;
		//    5    9:aload_0         
		//    6   10:aload_2         
		//    7   11:putfield        #22  <Field String b>
			c = abyte0;
		//    8   14:aload_0         
		//    9   15:aload_3         
		//   10   16:putfield        #24  <Field byte[] c>
			d = abyte1;
		//   11   19:aload_0         
		//   12   20:aload           4
		//   13   22:putfield        #26  <Field byte[] d>
		//   14   25:return          
		}
	}


	public AWS4Signer()
	{
		this(true);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:invokespecial   #31  <Method void AWS4Signer(boolean)>
	//    3    5:return          
	}

	public AWS4Signer(boolean flag)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #33  <Method void AbstractAWSSigner()>
		d = flag;
	//    2    4:aload_0         
	//    3    5:iload_1         
	//    4    6:putfield        #35  <Field boolean d>
	//    5    9:return          
	}

	protected final HeaderSigningResult a(Request request, String s, String s1, String s2, String s3, AWSCredentials awscredentials)
	{
		String s4 = a(request.e());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #41  <Method URI Request.e()>
	//    3    7:invokevirtual   #44  <Method String a(URI)>
	//    4   10:astore          7
		String s5 = b(request.e());
	//    5   12:aload_0         
	//    6   13:aload_1         
	//    7   14:invokeinterface #41  <Method URI Request.e()>
	//    8   19:invokevirtual   #46  <Method String b(URI)>
	//    9   22:astore          8
		Object obj = ((Object) (new StringBuilder()));
	//   10   24:new             #48  <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #49  <Method void StringBuilder()>
	//   13   31:astore          9
		((StringBuilder) (obj)).append(s);
	//   14   33:aload           9
	//   15   35:aload_2         
	//   16   36:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   17   39:pop             
		((StringBuilder) (obj)).append("/");
	//   18   40:aload           9
	//   19   42:ldc1            #55  <String "/">
	//   20   44:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   21   47:pop             
		((StringBuilder) (obj)).append(s4);
	//   22   48:aload           9
	//   23   50:aload           7
	//   24   52:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
		((StringBuilder) (obj)).append("/");
	//   26   56:aload           9
	//   27   58:ldc1            #55  <String "/">
	//   28   60:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
		((StringBuilder) (obj)).append(s5);
	//   30   64:aload           9
	//   31   66:aload           8
	//   32   68:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
		((StringBuilder) (obj)).append("/");
	//   34   72:aload           9
	//   35   74:ldc1            #55  <String "/">
	//   36   76:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   37   79:pop             
		((StringBuilder) (obj)).append("aws4_request");
	//   38   80:aload           9
	//   39   82:ldc1            #57  <String "aws4_request">
	//   40   84:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   41   87:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   42   88:aload           9
	//   43   90:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   44   93:astore          9
		request = ((Request) (a(s2, s1, ((String) (obj)), a(request, s3))));
	//   45   95:aload_0         
	//   46   96:aload           4
	//   47   98:aload_3         
	//   48   99:aload           9
	//   49  101:aload_0         
	//   50  102:aload_1         
	//   51  103:aload           5
	//   52  105:invokevirtual   #64  <Method String a(Request, String)>
	//   53  108:invokevirtual   #67  <Method String a(String, String, String, String)>
	//   54  111:astore_1        
		s2 = ((String) (new StringBuilder()));
	//   55  112:new             #48  <Class StringBuilder>
	//   56  115:dup             
	//   57  116:invokespecial   #49  <Method void StringBuilder()>
	//   58  119:astore          4
		((StringBuilder) (s2)).append("AWS4");
	//   59  121:aload           4
	//   60  123:ldc1            #69  <String "AWS4">
	//   61  125:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   62  128:pop             
		((StringBuilder) (s2)).append(awscredentials.b());
	//   63  129:aload           4
	//   64  131:aload           6
	//   65  133:invokeinterface #73  <Method String AWSCredentials.b()>
	//   66  138:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   67  141:pop             
		s = ((String) (a("aws4_request", a(s5, a(s4, a(s, ((StringBuilder) (s2)).toString().getBytes(StringUtils.a), SigningAlgorithm.HmacSHA256), SigningAlgorithm.HmacSHA256), SigningAlgorithm.HmacSHA256), SigningAlgorithm.HmacSHA256)));
	//   68  142:aload_0         
	//   69  143:ldc1            #57  <String "aws4_request">
	//   70  145:aload_0         
	//   71  146:aload           8
	//   72  148:aload_0         
	//   73  149:aload           7
	//   74  151:aload_0         
	//   75  152:aload_2         
	//   76  153:aload           4
	//   77  155:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   78  158:getstatic       #78  <Field java.nio.charset.Charset StringUtils.a>
	//   79  161:invokevirtual   #84  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   80  164:getstatic       #90  <Field SigningAlgorithm SigningAlgorithm.HmacSHA256>
	//   81  167:invokevirtual   #93  <Method byte[] a(String, byte[], SigningAlgorithm)>
	//   82  170:getstatic       #90  <Field SigningAlgorithm SigningAlgorithm.HmacSHA256>
	//   83  173:invokevirtual   #93  <Method byte[] a(String, byte[], SigningAlgorithm)>
	//   84  176:getstatic       #90  <Field SigningAlgorithm SigningAlgorithm.HmacSHA256>
	//   85  179:invokevirtual   #93  <Method byte[] a(String, byte[], SigningAlgorithm)>
	//   86  182:getstatic       #90  <Field SigningAlgorithm SigningAlgorithm.HmacSHA256>
	//   87  185:invokevirtual   #93  <Method byte[] a(String, byte[], SigningAlgorithm)>
	//   88  188:astore_2        
		return new HeaderSigningResult(s1, ((String) (obj)), ((byte []) (s)), a(((String) (request)).getBytes(StringUtils.a), ((byte []) (s)), SigningAlgorithm.HmacSHA256));
	//   89  189:new             #6   <Class AWS4Signer$HeaderSigningResult>
	//   90  192:dup             
	//   91  193:aload_3         
	//   92  194:aload           9
	//   93  196:aload_2         
	//   94  197:aload_0         
	//   95  198:aload_1         
	//   96  199:getstatic       #78  <Field java.nio.charset.Charset StringUtils.a>
	//   97  202:invokevirtual   #84  <Method byte[] String.getBytes(java.nio.charset.Charset)>
	//   98  205:aload_2         
	//   99  206:getstatic       #90  <Field SigningAlgorithm SigningAlgorithm.HmacSHA256>
	//  100  209:invokevirtual   #96  <Method byte[] a(byte[], byte[], SigningAlgorithm)>
	//  101  212:invokespecial   #99  <Method void AWS4Signer$HeaderSigningResult(String, String, byte[], byte[])>
	//  102  215:areturn         
	}

	protected final String a(long l)
	{
		return DateUtils.a("yyyyMMdd'T'HHmmss'Z'", new Date(l));
	//    0    0:ldc1            #104 <String "yyyyMMdd'T'HHmmss'Z'">
	//    1    2:new             #106 <Class Date>
	//    2    5:dup             
	//    3    6:lload_1         
	//    4    7:invokespecial   #109 <Method void Date(long)>
	//    5   10:invokestatic    #114 <Method String DateUtils.a(String, Date)>
	//    6   13:areturn         
	}

	protected String a(Request request)
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #117 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #118 <Method void ArrayList()>
	//    3    7:astore_3        
		((List) (obj)).addAll(((java.util.Collection) (request.a().keySet())));
	//    4    8:aload_3         
	//    5    9:aload_1         
	//    6   10:invokeinterface #121 <Method Map Request.a()>
	//    7   15:invokeinterface #127 <Method java.util.Set Map.keySet()>
	//    8   20:invokeinterface #133 <Method boolean List.addAll(java.util.Collection)>
	//    9   25:pop             
		Collections.sort(((List) (obj)), String.CASE_INSENSITIVE_ORDER);
	//   10   26:aload_3         
	//   11   27:getstatic       #137 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//   12   30:invokestatic    #143 <Method void Collections.sort(List, java.util.Comparator)>
		StringBuilder stringbuilder = new StringBuilder();
	//   13   33:new             #48  <Class StringBuilder>
	//   14   36:dup             
	//   15   37:invokespecial   #49  <Method void StringBuilder()>
	//   16   40:astore_2        
		obj = ((Object) (((List) (obj)).iterator()));
	//   17   41:aload_3         
	//   18   42:invokeinterface #147 <Method Iterator List.iterator()>
	//   19   47:astore_3        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   48:aload_3         
	//   21   49:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//   22   54:ifeq            152
			String s1 = (String)((Iterator) (obj)).next();
	//   23   57:aload_3         
	//   24   58:invokeinterface #157 <Method Object Iterator.next()>
	//   25   63:checkcast       #80  <Class String>
	//   26   66:astore          5
			if(c(s1))
	//*  27   68:aload_0         
	//*  28   69:aload           5
	//*  29   71:invokevirtual   #160 <Method boolean c(String)>
	//*  30   74:ifeq            48
			{
				String s = StringUtils.a(s1).replaceAll("\\s+", " ");
	//   31   77:aload           5
	//   32   79:invokestatic    #163 <Method String StringUtils.a(String)>
	//   33   82:ldc1            #165 <String "\\s+">
	//   34   84:ldc1            #167 <String " ">
	//   35   86:invokevirtual   #171 <Method String String.replaceAll(String, String)>
	//   36   89:astore          4
				s1 = (String)request.a().get(((Object) (s1)));
	//   37   91:aload_1         
	//   38   92:invokeinterface #121 <Method Map Request.a()>
	//   39   97:aload           5
	//   40   99:invokeinterface #175 <Method Object Map.get(Object)>
	//   41  104:checkcast       #80  <Class String>
	//   42  107:astore          5
				stringbuilder.append(s);
	//   43  109:aload_2         
	//   44  110:aload           4
	//   45  112:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   46  115:pop             
				stringbuilder.append(":");
	//   47  116:aload_2         
	//   48  117:ldc1            #177 <String ":">
	//   49  119:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   50  122:pop             
				if(s1 != null)
	//*  51  123:aload           5
	//*  52  125:ifnull          142
					stringbuilder.append(s1.replaceAll("\\s+", " "));
	//   53  128:aload_2         
	//   54  129:aload           5
	//   55  131:ldc1            #165 <String "\\s+">
	//   56  133:ldc1            #167 <String " ">
	//   57  135:invokevirtual   #171 <Method String String.replaceAll(String, String)>
	//   58  138:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   59  141:pop             
				stringbuilder.append("\n");
	//   60  142:aload_2         
	//   61  143:ldc1            #179 <String "\n">
	//   62  145:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   63  148:pop             
			}
		} while(true);
	//   64  149:goto            48
		return stringbuilder.toString();
	//   65  152:aload_2         
	//   66  153:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   67  156:areturn         
	}

	protected String a(Request request, String s)
	{
		Object obj = ((Object) (HttpUtils.a(request.e().getPath(), request.b())));
	//    0    0:aload_1         
	//    1    1:invokeinterface #41  <Method URI Request.e()>
	//    2    6:invokevirtual   #185 <Method String URI.getPath()>
	//    3    9:aload_1         
	//    4   10:invokeinterface #186 <Method String Request.b()>
	//    5   15:invokestatic    #190 <Method String HttpUtils.a(String, String)>
	//    6   18:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//    7   19:new             #48  <Class StringBuilder>
	//    8   22:dup             
	//    9   23:invokespecial   #49  <Method void StringBuilder()>
	//   10   26:astore          4
		stringbuilder.append(request.d().toString());
	//   11   28:aload           4
	//   12   30:aload_1         
	//   13   31:invokeinterface #193 <Method HttpMethodName Request.d()>
	//   14   36:invokevirtual   #196 <Method String HttpMethodName.toString()>
	//   15   39:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   16   42:pop             
		stringbuilder.append("\n");
	//   17   43:aload           4
	//   18   45:ldc1            #179 <String "\n">
	//   19   47:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   20   50:pop             
		stringbuilder.append(a(((String) (obj)), d));
	//   21   51:aload           4
	//   22   53:aload_0         
	//   23   54:aload_3         
	//   24   55:aload_0         
	//   25   56:getfield        #35  <Field boolean d>
	//   26   59:invokevirtual   #199 <Method String a(String, boolean)>
	//   27   62:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   28   65:pop             
		stringbuilder.append("\n");
	//   29   66:aload           4
	//   30   68:ldc1            #179 <String "\n">
	//   31   70:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   32   73:pop             
		stringbuilder.append(f(request));
	//   33   74:aload           4
	//   34   76:aload_0         
	//   35   77:aload_1         
	//   36   78:invokevirtual   #202 <Method String f(Request)>
	//   37   81:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   38   84:pop             
		stringbuilder.append("\n");
	//   39   85:aload           4
	//   40   87:ldc1            #179 <String "\n">
	//   41   89:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   42   92:pop             
		stringbuilder.append(a(request));
	//   43   93:aload           4
	//   44   95:aload_0         
	//   45   96:aload_1         
	//   46   97:invokevirtual   #204 <Method String a(Request)>
	//   47  100:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   48  103:pop             
		stringbuilder.append("\n");
	//   49  104:aload           4
	//   50  106:ldc1            #179 <String "\n">
	//   51  108:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   52  111:pop             
		stringbuilder.append(b(request));
	//   53  112:aload           4
	//   54  114:aload_0         
	//   55  115:aload_1         
	//   56  116:invokevirtual   #206 <Method String b(Request)>
	//   57  119:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   58  122:pop             
		stringbuilder.append("\n");
	//   59  123:aload           4
	//   60  125:ldc1            #179 <String "\n">
	//   61  127:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   62  130:pop             
		stringbuilder.append(s);
	//   63  131:aload           4
	//   64  133:aload_2         
	//   65  134:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   66  137:pop             
		request = ((Request) (stringbuilder.toString()));
	//   67  138:aload           4
	//   68  140:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   69  143:astore_1        
		s = ((String) (e));
	//   70  144:getstatic       #26  <Field Log e>
	//   71  147:astore_2        
		obj = ((Object) (new StringBuilder()));
	//   72  148:new             #48  <Class StringBuilder>
	//   73  151:dup             
	//   74  152:invokespecial   #49  <Method void StringBuilder()>
	//   75  155:astore_3        
		((StringBuilder) (obj)).append("AWS4 Canonical Request: '\"");
	//   76  156:aload_3         
	//   77  157:ldc1            #208 <String "AWS4 Canonical Request: '\"">
	//   78  159:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   79  162:pop             
		((StringBuilder) (obj)).append(((String) (request)));
	//   80  163:aload_3         
	//   81  164:aload_1         
	//   82  165:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   83  168:pop             
		((StringBuilder) (obj)).append("\"");
	//   84  169:aload_3         
	//   85  170:ldc1            #210 <String "\"">
	//   86  172:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   87  175:pop             
		((Log) (s)).debug(((Object) (((StringBuilder) (obj)).toString())));
	//   88  176:aload_2         
	//   89  177:aload_3         
	//   90  178:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   91  181:invokeinterface #216 <Method void Log.debug(Object)>
		return ((String) (request));
	//   92  186:aload_1         
	//   93  187:areturn         
	}

	protected String a(String s, String s1, String s2, String s3)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #48  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #49  <Method void StringBuilder()>
	//    3    7:astore          5
		stringbuilder.append(s);
	//    4    9:aload           5
	//    5   11:aload_1         
	//    6   12:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append("\n");
	//    8   16:aload           5
	//    9   18:ldc1            #179 <String "\n">
	//   10   20:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		stringbuilder.append(s1);
	//   12   24:aload           5
	//   13   26:aload_2         
	//   14   27:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   15   30:pop             
		stringbuilder.append("\n");
	//   16   31:aload           5
	//   17   33:ldc1            #179 <String "\n">
	//   18   35:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   19   38:pop             
		stringbuilder.append(s2);
	//   20   39:aload           5
	//   21   41:aload_3         
	//   22   42:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   23   45:pop             
		stringbuilder.append("\n");
	//   24   46:aload           5
	//   25   48:ldc1            #179 <String "\n">
	//   26   50:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   27   53:pop             
		stringbuilder.append(BinaryUtils.a(d(s3)));
	//   28   54:aload           5
	//   29   56:aload_0         
	//   30   57:aload           4
	//   31   59:invokevirtual   #220 <Method byte[] d(String)>
	//   32   62:invokestatic    #225 <Method String BinaryUtils.a(byte[])>
	//   33   65:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   34   68:pop             
		s = stringbuilder.toString();
	//   35   69:aload           5
	//   36   71:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   37   74:astore_1        
		s1 = ((String) (e));
	//   38   75:getstatic       #26  <Field Log e>
	//   39   78:astore_2        
		s2 = ((String) (new StringBuilder()));
	//   40   79:new             #48  <Class StringBuilder>
	//   41   82:dup             
	//   42   83:invokespecial   #49  <Method void StringBuilder()>
	//   43   86:astore_3        
		((StringBuilder) (s2)).append("AWS4 String to Sign: '\"");
	//   44   87:aload_3         
	//   45   88:ldc1            #227 <String "AWS4 String to Sign: '\"">
	//   46   90:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   47   93:pop             
		((StringBuilder) (s2)).append(s);
	//   48   94:aload_3         
	//   49   95:aload_1         
	//   50   96:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   51   99:pop             
		((StringBuilder) (s2)).append("\"");
	//   52  100:aload_3         
	//   53  101:ldc1            #210 <String "\"">
	//   54  103:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   55  106:pop             
		((Log) (s1)).debug(((Object) (((StringBuilder) (s2)).toString())));
	//   56  107:aload_2         
	//   57  108:aload_3         
	//   58  109:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   59  112:invokeinterface #216 <Method void Log.debug(Object)>
		return s;
	//   60  117:aload_1         
	//   61  118:areturn         
	}

	protected String a(URI uri)
	{
		if(b != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #229 <Field String b>
	//*   2    4:ifnull          12
			return b;
	//    3    7:aload_0         
	//    4    8:getfield        #229 <Field String b>
	//    5   11:areturn         
		else
			return AwsHostNameUtils.a(uri.getHost(), a);
	//    6   12:aload_1         
	//    7   13:invokevirtual   #232 <Method String URI.getHost()>
	//    8   16:aload_0         
	//    9   17:getfield        #234 <Field String a>
	//   10   20:invokestatic    #237 <Method String AwsHostNameUtils.a(String, String)>
	//   11   23:areturn         
	}

	protected void a(Request request, HeaderSigningResult headersigningresult)
	{
	//    0    0:return          
	}

	public void a(Request request, AWSCredentials awscredentials)
	{
		if(awscredentials instanceof AnonymousAWSCredentials)
	//*   0    0:aload_2         
	//*   1    1:instanceof      #242 <Class AnonymousAWSCredentials>
	//*   2    4:ifeq            8
			return;
	//    3    7:return          
		awscredentials = a(awscredentials);
	//    4    8:aload_0         
	//    5    9:aload_2         
	//    6   10:invokevirtual   #245 <Method AWSCredentials a(AWSCredentials)>
	//    7   13:astore_2        
		if(awscredentials instanceof AWSSessionCredentials)
	//*   8   14:aload_2         
	//*   9   15:instanceof      #247 <Class AWSSessionCredentials>
	//*  10   18:ifeq            30
			a(request, (AWSSessionCredentials)awscredentials);
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:aload_2         
	//   14   24:checkcast       #247 <Class AWSSessionCredentials>
	//   15   27:invokevirtual   #250 <Method void a(Request, AWSSessionCredentials)>
		d(request);
	//   16   30:aload_0         
	//   17   31:aload_1         
	//   18   32:invokevirtual   #253 <Method void d(Request)>
		long l = c(request);
	//   19   35:aload_0         
	//   20   36:aload_1         
	//   21   37:invokevirtual   #256 <Method long c(Request)>
	//   22   40:lstore_3        
		Object obj = ((Object) (b(l)));
	//   23   41:aload_0         
	//   24   42:lload_3         
	//   25   43:invokevirtual   #258 <Method String b(long)>
	//   26   46:astore          5
		Object obj3 = ((Object) (b(request, ((String) (obj)))));
	//   27   48:aload_0         
	//   28   49:aload_1         
	//   29   50:aload           5
	//   30   52:invokevirtual   #260 <Method String b(Request, String)>
	//   31   55:astore          8
		Object obj1 = ((Object) (e(request)));
	//   32   57:aload_0         
	//   33   58:aload_1         
	//   34   59:invokevirtual   #262 <Method String e(Request)>
	//   35   62:astore          6
		Object obj2 = ((Object) (a(l)));
	//   36   64:aload_0         
	//   37   65:lload_3         
	//   38   66:invokevirtual   #264 <Method String a(long)>
	//   39   69:astore          7
		request.a("X-Amz-Date", ((String) (obj2)));
	//   40   71:aload_1         
	//   41   72:ldc2            #266 <String "X-Amz-Date">
	//   42   75:aload           7
	//   43   77:invokeinterface #269 <Method void Request.a(String, String)>
		if(request.a().get("x-amz-content-sha256") != null && ((String)request.a().get("x-amz-content-sha256")).equals("required"))
	//*  44   82:aload_1         
	//*  45   83:invokeinterface #121 <Method Map Request.a()>
	//*  46   88:ldc2            #271 <String "x-amz-content-sha256">
	//*  47   91:invokeinterface #175 <Method Object Map.get(Object)>
	//*  48   96:ifnull          136
	//*  49   99:aload_1         
	//*  50  100:invokeinterface #121 <Method Map Request.a()>
	//*  51  105:ldc2            #271 <String "x-amz-content-sha256">
	//*  52  108:invokeinterface #175 <Method Object Map.get(Object)>
	//*  53  113:checkcast       #80  <Class String>
	//*  54  116:ldc2            #273 <String "required">
	//*  55  119:invokevirtual   #277 <Method boolean String.equals(Object)>
	//*  56  122:ifeq            136
			request.a("x-amz-content-sha256", ((String) (obj1)));
	//   57  125:aload_1         
	//   58  126:ldc2            #271 <String "x-amz-content-sha256">
	//   59  129:aload           6
	//   60  131:invokeinterface #269 <Method void Request.a(String, String)>
		StringBuilder stringbuilder = new StringBuilder();
	//   61  136:new             #48  <Class StringBuilder>
	//   62  139:dup             
	//   63  140:invokespecial   #49  <Method void StringBuilder()>
	//   64  143:astore          9
		stringbuilder.append(awscredentials.a());
	//   65  145:aload           9
	//   66  147:aload_2         
	//   67  148:invokeinterface #279 <Method String AWSCredentials.a()>
	//   68  153:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   69  156:pop             
		stringbuilder.append("/");
	//   70  157:aload           9
	//   71  159:ldc1            #55  <String "/">
	//   72  161:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   73  164:pop             
		stringbuilder.append(((String) (obj3)));
	//   74  165:aload           9
	//   75  167:aload           8
	//   76  169:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   77  172:pop             
		obj3 = ((Object) (stringbuilder.toString()));
	//   78  173:aload           9
	//   79  175:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   80  178:astore          8
		awscredentials = ((AWSCredentials) (a(request, ((String) (obj)), ((String) (obj2)), "AWS4-HMAC-SHA256", ((String) (obj1)), awscredentials)));
	//   81  180:aload_0         
	//   82  181:aload_1         
	//   83  182:aload           5
	//   84  184:aload           7
	//   85  186:ldc2            #281 <String "AWS4-HMAC-SHA256">
	//   86  189:aload           6
	//   87  191:aload_2         
	//   88  192:invokevirtual   #283 <Method AWS4Signer$HeaderSigningResult a(Request, String, String, String, String, AWSCredentials)>
	//   89  195:astore_2        
		obj = ((Object) (new StringBuilder()));
	//   90  196:new             #48  <Class StringBuilder>
	//   91  199:dup             
	//   92  200:invokespecial   #49  <Method void StringBuilder()>
	//   93  203:astore          5
		((StringBuilder) (obj)).append("Credential=");
	//   94  205:aload           5
	//   95  207:ldc2            #285 <String "Credential=">
	//   96  210:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   97  213:pop             
		((StringBuilder) (obj)).append(((String) (obj3)));
	//   98  214:aload           5
	//   99  216:aload           8
	//  100  218:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  101  221:pop             
		obj = ((Object) (((StringBuilder) (obj)).toString()));
	//  102  222:aload           5
	//  103  224:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  104  227:astore          5
		obj1 = ((Object) (new StringBuilder()));
	//  105  229:new             #48  <Class StringBuilder>
	//  106  232:dup             
	//  107  233:invokespecial   #49  <Method void StringBuilder()>
	//  108  236:astore          6
		((StringBuilder) (obj1)).append("SignedHeaders=");
	//  109  238:aload           6
	//  110  240:ldc2            #287 <String "SignedHeaders=">
	//  111  243:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  112  246:pop             
		((StringBuilder) (obj1)).append(b(request));
	//  113  247:aload           6
	//  114  249:aload_0         
	//  115  250:aload_1         
	//  116  251:invokevirtual   #206 <Method String b(Request)>
	//  117  254:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  118  257:pop             
		obj1 = ((Object) (((StringBuilder) (obj1)).toString()));
	//  119  258:aload           6
	//  120  260:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  121  263:astore          6
		obj2 = ((Object) (new StringBuilder()));
	//  122  265:new             #48  <Class StringBuilder>
	//  123  268:dup             
	//  124  269:invokespecial   #49  <Method void StringBuilder()>
	//  125  272:astore          7
		((StringBuilder) (obj2)).append("Signature=");
	//  126  274:aload           7
	//  127  276:ldc2            #289 <String "Signature=">
	//  128  279:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  129  282:pop             
		((StringBuilder) (obj2)).append(BinaryUtils.a(((HeaderSigningResult) (awscredentials)).a()));
	//  130  283:aload           7
	//  131  285:aload_2         
	//  132  286:invokevirtual   #292 <Method byte[] AWS4Signer$HeaderSigningResult.a()>
	//  133  289:invokestatic    #225 <Method String BinaryUtils.a(byte[])>
	//  134  292:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  135  295:pop             
		obj2 = ((Object) (((StringBuilder) (obj2)).toString()));
	//  136  296:aload           7
	//  137  298:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  138  301:astore          7
		obj3 = ((Object) (new StringBuilder()));
	//  139  303:new             #48  <Class StringBuilder>
	//  140  306:dup             
	//  141  307:invokespecial   #49  <Method void StringBuilder()>
	//  142  310:astore          8
		((StringBuilder) (obj3)).append("AWS4-HMAC-SHA256 ");
	//  143  312:aload           8
	//  144  314:ldc2            #294 <String "AWS4-HMAC-SHA256 ">
	//  145  317:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  146  320:pop             
		((StringBuilder) (obj3)).append(((String) (obj)));
	//  147  321:aload           8
	//  148  323:aload           5
	//  149  325:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  150  328:pop             
		((StringBuilder) (obj3)).append(", ");
	//  151  329:aload           8
	//  152  331:ldc2            #296 <String ", ">
	//  153  334:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  154  337:pop             
		((StringBuilder) (obj3)).append(((String) (obj1)));
	//  155  338:aload           8
	//  156  340:aload           6
	//  157  342:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  158  345:pop             
		((StringBuilder) (obj3)).append(", ");
	//  159  346:aload           8
	//  160  348:ldc2            #296 <String ", ">
	//  161  351:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  162  354:pop             
		((StringBuilder) (obj3)).append(((String) (obj2)));
	//  163  355:aload           8
	//  164  357:aload           7
	//  165  359:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//  166  362:pop             
		request.a("Authorization", ((StringBuilder) (obj3)).toString());
	//  167  363:aload_1         
	//  168  364:ldc2            #298 <String "Authorization">
	//  169  367:aload           8
	//  170  369:invokevirtual   #61  <Method String StringBuilder.toString()>
	//  171  372:invokeinterface #269 <Method void Request.a(String, String)>
		a(request, ((HeaderSigningResult) (awscredentials)));
	//  172  377:aload_0         
	//  173  378:aload_1         
	//  174  379:aload_2         
	//  175  380:invokevirtual   #300 <Method void a(Request, AWS4Signer$HeaderSigningResult)>
	//  176  383:return          
	}

	protected void a(Request request, AWSSessionCredentials awssessioncredentials)
	{
		request.a("x-amz-security-token", awssessioncredentials.c());
	//    0    0:aload_1         
	//    1    1:ldc2            #303 <String "x-amz-security-token">
	//    2    4:aload_2         
	//    3    5:invokeinterface #305 <Method String AWSSessionCredentials.c()>
	//    4   10:invokeinterface #269 <Method void Request.a(String, String)>
	//    5   15:return          
	}

	public void a(String s)
	{
		a = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #234 <Field String a>
	//    3    5:return          
	}

	protected final String b(long l)
	{
		return DateUtils.a("yyyyMMdd", new Date(l));
	//    0    0:ldc2            #309 <String "yyyyMMdd">
	//    1    3:new             #106 <Class Date>
	//    2    6:dup             
	//    3    7:lload_1         
	//    4    8:invokespecial   #109 <Method void Date(long)>
	//    5   11:invokestatic    #114 <Method String DateUtils.a(String, Date)>
	//    6   14:areturn         
	}

	protected String b(Request request)
	{
		Object obj = ((Object) (new ArrayList()));
	//    0    0:new             #117 <Class ArrayList>
	//    1    3:dup             
	//    2    4:invokespecial   #118 <Method void ArrayList()>
	//    3    7:astore_2        
		((List) (obj)).addAll(((java.util.Collection) (request.a().keySet())));
	//    4    8:aload_2         
	//    5    9:aload_1         
	//    6   10:invokeinterface #121 <Method Map Request.a()>
	//    7   15:invokeinterface #127 <Method java.util.Set Map.keySet()>
	//    8   20:invokeinterface #133 <Method boolean List.addAll(java.util.Collection)>
	//    9   25:pop             
		Collections.sort(((List) (obj)), String.CASE_INSENSITIVE_ORDER);
	//   10   26:aload_2         
	//   11   27:getstatic       #137 <Field java.util.Comparator String.CASE_INSENSITIVE_ORDER>
	//   12   30:invokestatic    #143 <Method void Collections.sort(List, java.util.Comparator)>
		request = ((Request) (new StringBuilder()));
	//   13   33:new             #48  <Class StringBuilder>
	//   14   36:dup             
	//   15   37:invokespecial   #49  <Method void StringBuilder()>
	//   16   40:astore_1        
		obj = ((Object) (((List) (obj)).iterator()));
	//   17   41:aload_2         
	//   18   42:invokeinterface #147 <Method Iterator List.iterator()>
	//   19   47:astore_2        
		do
		{
			if(!((Iterator) (obj)).hasNext())
				break;
	//   20   48:aload_2         
	//   21   49:invokeinterface #153 <Method boolean Iterator.hasNext()>
	//   22   54:ifeq            102
			String s = (String)((Iterator) (obj)).next();
	//   23   57:aload_2         
	//   24   58:invokeinterface #157 <Method Object Iterator.next()>
	//   25   63:checkcast       #80  <Class String>
	//   26   66:astore_3        
			if(c(s))
	//*  27   67:aload_0         
	//*  28   68:aload_3         
	//*  29   69:invokevirtual   #160 <Method boolean c(String)>
	//*  30   72:ifeq            48
			{
				if(((StringBuilder) (request)).length() > 0)
	//*  31   75:aload_1         
	//*  32   76:invokevirtual   #313 <Method int StringBuilder.length()>
	//*  33   79:ifle            90
					((StringBuilder) (request)).append(";");
	//   34   82:aload_1         
	//   35   83:ldc2            #315 <String ";">
	//   36   86:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   37   89:pop             
				((StringBuilder) (request)).append(StringUtils.a(s));
	//   38   90:aload_1         
	//   39   91:aload_3         
	//   40   92:invokestatic    #163 <Method String StringUtils.a(String)>
	//   41   95:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   42   98:pop             
			}
		} while(true);
	//   43   99:goto            48
		return ((StringBuilder) (request)).toString();
	//   44  102:aload_1         
	//   45  103:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   46  106:areturn         
	}

	protected String b(Request request, String s)
	{
		String s1 = a(request.e());
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokeinterface #41  <Method URI Request.e()>
	//    3    7:invokevirtual   #44  <Method String a(URI)>
	//    4   10:astore_3        
		request = ((Request) (b(request.e())));
	//    5   11:aload_0         
	//    6   12:aload_1         
	//    7   13:invokeinterface #41  <Method URI Request.e()>
	//    8   18:invokevirtual   #46  <Method String b(URI)>
	//    9   21:astore_1        
		StringBuilder stringbuilder = new StringBuilder();
	//   10   22:new             #48  <Class StringBuilder>
	//   11   25:dup             
	//   12   26:invokespecial   #49  <Method void StringBuilder()>
	//   13   29:astore          4
		stringbuilder.append(s);
	//   14   31:aload           4
	//   15   33:aload_2         
	//   16   34:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
		stringbuilder.append("/");
	//   18   38:aload           4
	//   19   40:ldc1            #55  <String "/">
	//   20   42:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   21   45:pop             
		stringbuilder.append(s1);
	//   22   46:aload           4
	//   23   48:aload_3         
	//   24   49:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   25   52:pop             
		stringbuilder.append("/");
	//   26   53:aload           4
	//   27   55:ldc1            #55  <String "/">
	//   28   57:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   29   60:pop             
		stringbuilder.append(((String) (request)));
	//   30   61:aload           4
	//   31   63:aload_1         
	//   32   64:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   33   67:pop             
		stringbuilder.append("/");
	//   34   68:aload           4
	//   35   70:ldc1            #55  <String "/">
	//   36   72:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   37   75:pop             
		stringbuilder.append("aws4_request");
	//   38   76:aload           4
	//   39   78:ldc1            #57  <String "aws4_request">
	//   40   80:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   41   83:pop             
		return stringbuilder.toString();
	//   42   84:aload           4
	//   43   86:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   44   89:areturn         
	}

	protected String b(URI uri)
	{
		if(a != null)
	//*   0    0:aload_0         
	//*   1    1:getfield        #234 <Field String a>
	//*   2    4:ifnull          12
			return a;
	//    3    7:aload_0         
	//    4    8:getfield        #234 <Field String a>
	//    5   11:areturn         
		else
			return AwsHostNameUtils.a(uri);
	//    6   12:aload_1         
	//    7   13:invokestatic    #316 <Method String AwsHostNameUtils.a(URI)>
	//    8   16:areturn         
	}

	public void b(String s)
	{
		b = s;
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:putfield        #229 <Field String b>
	//    3    5:return          
	}

	protected final long c(Request request)
	{
		request = ((Request) (a(i(request))));
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:aload_1         
	//    3    3:invokevirtual   #320 <Method int i(Request)>
	//    4    6:invokevirtual   #323 <Method Date a(int)>
	//    5    9:astore_1        
		if(c != null)
	//*   6   10:aload_0         
	//*   7   11:getfield        #325 <Field Date c>
	//*   8   14:ifnull          22
			request = ((Request) (c));
	//    9   17:aload_0         
	//   10   18:getfield        #325 <Field Date c>
	//   11   21:astore_1        
		return ((Date) (request)).getTime();
	//   12   22:aload_1         
	//   13   23:invokevirtual   #329 <Method long Date.getTime()>
	//   14   26:lreturn         
	}

	boolean c(String s)
	{
		return s.equalsIgnoreCase("date") || s.equalsIgnoreCase("Content-MD5") || s.equalsIgnoreCase("host") || s.startsWith("x-amz") || s.startsWith("X-Amz");
	//    0    0:aload_1         
	//    1    1:ldc2            #332 <String "date">
	//    2    4:invokevirtual   #335 <Method boolean String.equalsIgnoreCase(String)>
	//    3    7:ifne            55
	//    4   10:aload_1         
	//    5   11:ldc2            #337 <String "Content-MD5">
	//    6   14:invokevirtual   #335 <Method boolean String.equalsIgnoreCase(String)>
	//    7   17:ifne            55
	//    8   20:aload_1         
	//    9   21:ldc2            #339 <String "host">
	//   10   24:invokevirtual   #335 <Method boolean String.equalsIgnoreCase(String)>
	//   11   27:ifne            55
	//   12   30:aload_1         
	//   13   31:ldc2            #341 <String "x-amz">
	//   14   34:invokevirtual   #344 <Method boolean String.startsWith(String)>
	//   15   37:ifne            55
	//   16   40:aload_1         
	//   17   41:ldc2            #346 <String "X-Amz">
	//   18   44:invokevirtual   #344 <Method boolean String.startsWith(String)>
	//   19   47:ifeq            53
	//   20   50:goto            55
	//   21   53:iconst_0        
	//   22   54:ireturn         
	//   23   55:iconst_1        
	//   24   56:ireturn         
	}

	protected void d(Request request)
	{
		String s = request.e().getHost();
	//    0    0:aload_1         
	//    1    1:invokeinterface #41  <Method URI Request.e()>
	//    2    6:invokevirtual   #232 <Method String URI.getHost()>
	//    3    9:astore_3        
		Object obj = ((Object) (s));
	//    4   10:aload_3         
	//    5   11:astore_2        
		if(HttpUtils.a(request.e()))
	//*   6   12:aload_1         
	//*   7   13:invokeinterface #41  <Method URI Request.e()>
	//*   8   18:invokestatic    #349 <Method boolean HttpUtils.a(URI)>
	//*   9   21:ifeq            64
		{
			obj = ((Object) (new StringBuilder()));
	//   10   24:new             #48  <Class StringBuilder>
	//   11   27:dup             
	//   12   28:invokespecial   #49  <Method void StringBuilder()>
	//   13   31:astore_2        
			((StringBuilder) (obj)).append(s);
	//   14   32:aload_2         
	//   15   33:aload_3         
	//   16   34:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   17   37:pop             
			((StringBuilder) (obj)).append(":");
	//   18   38:aload_2         
	//   19   39:ldc1            #177 <String ":">
	//   20   41:invokevirtual   #53  <Method StringBuilder StringBuilder.append(String)>
	//   21   44:pop             
			((StringBuilder) (obj)).append(request.e().getPort());
	//   22   45:aload_2         
	//   23   46:aload_1         
	//   24   47:invokeinterface #41  <Method URI Request.e()>
	//   25   52:invokevirtual   #352 <Method int URI.getPort()>
	//   26   55:invokevirtual   #355 <Method StringBuilder StringBuilder.append(int)>
	//   27   58:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   28   59:aload_2         
	//   29   60:invokevirtual   #61  <Method String StringBuilder.toString()>
	//   30   63:astore_2        
		}
		request.a("Host", ((String) (obj)));
	//   31   64:aload_1         
	//   32   65:ldc2            #357 <String "Host">
	//   33   68:aload_2         
	//   34   69:invokeinterface #269 <Method void Request.a(String, String)>
	//   35   74:return          
	}

	protected String e(Request request)
	{
		request = ((Request) (g(request)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #364 <Method InputStream g(Request)>
	//    3    5:astore_1        
		((InputStream) (request)).mark(-1);
	//    4    6:aload_1         
	//    5    7:iconst_m1       
	//    6    8:invokevirtual   #370 <Method void InputStream.mark(int)>
		String s = BinaryUtils.a(a(((InputStream) (request))));
	//    7   11:aload_0         
	//    8   12:aload_1         
	//    9   13:invokevirtual   #373 <Method byte[] a(InputStream)>
	//   10   16:invokestatic    #225 <Method String BinaryUtils.a(byte[])>
	//   11   19:astore_2        
		try
		{
			((InputStream) (request)).reset();
	//   12   20:aload_1         
	//   13   21:invokevirtual   #376 <Method void InputStream.reset()>
		}
	//*  14   24:aload_2         
	//*  15   25:areturn         
		// Misplaced declaration of an exception variable
		catch(Request request)
	//*  16   26:astore_1        
		{
			throw new AmazonClientException("Unable to reset stream after calculating AWS4 signature", ((Throwable) (request)));
	//   17   27:new             #378 <Class AmazonClientException>
	//   18   30:dup             
	//   19   31:ldc2            #380 <String "Unable to reset stream after calculating AWS4 signature">
	//   20   34:aload_1         
	//   21   35:invokespecial   #383 <Method void AmazonClientException(String, Throwable)>
	//   22   38:athrow          
		}
		return s;
	}

	protected static final Log e = LogFactory.getLog(com/amazonaws/auth/AWS4Signer);
	protected String a;
	protected String b;
	protected Date c;
	protected boolean d;

	static 
	{
	//    0    0:ldc1            #2   <Class AWS4Signer>
	//    1    2:invokestatic    #24  <Method Log LogFactory.getLog(Class)>
	//    2    5:putstatic       #26  <Field Log e>
	//*   3    8:return          
	}
}
