// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.irobot.home.aws.authentication;

import android.os.Looper;
import android.text.TextUtils;
import com.amazonaws.auth.AWSSessionCredentials;
import com.amazonaws.regions.Region;
import com.amazonaws.regions.Regions;
import com.google.gson.Gson;
import com.irobot.awsservices.a.b;
import com.irobot.awsservices.apigateway.ApiGatewayResponse;
import com.irobot.core.AccountError;
import com.irobot.core.AccountErrorEvent;
import com.irobot.core.AccountInfoUpdatedEvent;
import com.irobot.core.AccountLoggedInEvent;
import com.irobot.core.AccountService;
import com.irobot.core.Assembler;
import com.irobot.core.AssetId;
import com.irobot.core.AuthenticationHandler;
import com.irobot.core.EventType;
import com.irobot.core.ServiceDiscovery;
import com.irobot.core.ServiceDiscoveryData;
import com.irobot.home.aws.authentication.model.AccountAssociationStatus;
import com.irobot.home.aws.authentication.model.LoginRequestData;
import com.irobot.home.aws.authentication.model.LoginResponse;
import com.irobot.home.aws.authentication.model.LoginResponseCredentials;
import com.irobot.home.i.a;
import com.irobot.home.util.j;
import com.irobot.home.util.o;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.irobot.home.aws.authentication:
//			a

public class AwsCredentialsService extends AuthenticationHandler
	implements b
{
	private static class a
	{

		static AwsCredentialsService a()
		{
			return a;
		//    0    0:getstatic       #16  <Field AwsCredentialsService a>
		//    1    3:areturn         
		}

		private static AwsCredentialsService a = new AwsCredentialsService();

		static 
		{
		//    0    0:new             #6   <Class AwsCredentialsService>
		//    1    3:dup             
		//    2    4:aconst_null     
		//    3    5:invokespecial   #14  <Method void AwsCredentialsService(AwsCredentialsService$1)>
		//    4    8:putstatic       #16  <Field AwsCredentialsService a>
		//*   5   11:return          
		}
	}


	private AwsCredentialsService()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #73  <Method void AuthenticationHandler()>
		e = new Gson();
	//    2    4:aload_0         
	//    3    5:new             #75  <Class Gson>
	//    4    8:dup             
	//    5    9:invokespecial   #76  <Method void Gson()>
	//    6   12:putfield        #78  <Field Gson e>
		f = null;
	//    7   15:aload_0         
	//    8   16:aconst_null     
	//    9   17:putfield        #80  <Field LoginResponse f>
		g = false;
	//   10   20:aload_0         
	//   11   21:iconst_0        
	//   12   22:putfield        #82  <Field boolean g>
		h = false;
	//   13   25:aload_0         
	//   14   26:iconst_0        
	//   15   27:putfield        #84  <Field boolean h>
		i = null;
	//   16   30:aload_0         
	//   17   31:aconst_null     
	//   18   32:putfield        #86  <Field Map i>
		j = "Not Associated";
	//   19   35:aload_0         
	//   20   36:ldc1            #88  <String "Not Associated">
	//   21   38:putfield        #90  <Field String j>
		k = null;
	//   22   41:aload_0         
	//   23   42:aconst_null     
	//   24   43:putfield        #92  <Field AWSSessionCredentials k>
		l = null;
	//   25   46:aload_0         
	//   26   47:aconst_null     
	//   27   48:putfield        #94  <Field Date l>
		n = null;
	//   28   51:aload_0         
	//   29   52:aconst_null     
	//   30   53:putfield        #96  <Field LoginRequestData n>
		o = new Object();
	//   31   56:aload_0         
	//   32   57:new             #98  <Class Object>
	//   33   60:dup             
	//   34   61:invokespecial   #99  <Method void Object()>
	//   35   64:putfield        #101 <Field Object o>
		d.setTimeZone(TimeZone.getTimeZone("UTC"));
	//   36   67:getstatic       #70  <Field DateFormat d>
	//   37   70:ldc1            #103 <String "UTC">
	//   38   72:invokestatic    #109 <Method TimeZone TimeZone.getTimeZone(String)>
	//   39   75:invokevirtual   #115 <Method void DateFormat.setTimeZone(TimeZone)>
		m = (com.irobot.home.i.a)Assembler.getInstance().getDomainEventBus();
	//   40   78:aload_0         
	//   41   79:invokestatic    #121 <Method Assembler Assembler.getInstance()>
	//   42   82:invokevirtual   #125 <Method com.irobot.core.EventBusHandler Assembler.getDomainEventBus()>
	//   43   85:checkcast       #127 <Class a>
	//   44   88:putfield        #129 <Field a m>
		m.a(((Object) (this)), EventType.AccountInfoUpdatedEvent);
	//   45   91:aload_0         
	//   46   92:getfield        #129 <Field a m>
	//   47   95:aload_0         
	//   48   96:getstatic       #135 <Field EventType EventType.AccountInfoUpdatedEvent>
	//   49   99:invokevirtual   #138 <Method void a.a(Object, EventType)>
		m.a(((Object) (this)), EventType.AccountLoggedInEvent);
	//   50  102:aload_0         
	//   51  103:getfield        #129 <Field a m>
	//   52  106:aload_0         
	//   53  107:getstatic       #141 <Field EventType EventType.AccountLoggedInEvent>
	//   54  110:invokevirtual   #138 <Method void a.a(Object, EventType)>
		m.a(((Object) (this)), EventType.AccountErrorEvent);
	//   55  113:aload_0         
	//   56  114:getfield        #129 <Field a m>
	//   57  117:aload_0         
	//   58  118:getstatic       #144 <Field EventType EventType.AccountErrorEvent>
	//   59  121:invokevirtual   #138 <Method void a.a(Object, EventType)>
	//   60  124:return          
	}


	private AWSSessionCredentials a(LoginRequestData loginrequestdata, com.irobot.awsservices.a.a a1)
	{
		if(a1 != null)
	//*   0    0:aload_2         
	//*   1    1:ifnull          65
		{
			String s2 = c;
	//    2    4:getstatic       #153 <Field String c>
	//    3    7:astore          5
			StringBuilder stringbuilder2 = new StringBuilder();
	//    4    9:new             #155 <Class StringBuilder>
	//    5   12:dup             
	//    6   13:invokespecial   #156 <Method void StringBuilder()>
	//    7   16:astore          6
			stringbuilder2.append("Attempting to fetch session credentials using authentication type ");
	//    8   18:aload           6
	//    9   20:ldc1            #158 <String "Attempting to fetch session credentials using authentication type ">
	//   10   22:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   11   25:pop             
			String s;
			if(a1.a() == com.irobot.awsservices.a.a.a.Asset)
	//*  12   26:aload_2         
	//*  13   27:invokevirtual   #167 <Method com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a.a()>
	//*  14   30:getstatic       #173 <Field com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a$a.Asset>
	//*  15   33:if_acmpne       43
				s = " asset.";
	//   16   36:ldc1            #175 <String " asset.">
	//   17   38:astore          4
			else
	//*  18   40:goto            47
				s = "account";
	//   19   43:ldc1            #177 <String "account">
	//   20   45:astore          4
			stringbuilder2.append(s);
	//   21   47:aload           6
	//   22   49:aload           4
	//   23   51:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   24   54:pop             
			com.irobot.home.util.o.b(s2, stringbuilder2.toString());
	//   25   55:aload           5
	//   26   57:aload           6
	//   27   59:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   28   62:invokestatic    #186 <Method void o.b(String, String)>
		}
		int i1;
		String s1;
		StringBuilder stringbuilder1;
		try
		{
			loginrequestdata = ((LoginRequestData) ((new com.irobot.awsservices.apigateway.a.a()).b(b(loginrequestdata, a1))));
	//   29   65:new             #188 <Class com.irobot.awsservices.apigateway.a.a>
	//   30   68:dup             
	//   31   69:invokespecial   #189 <Method void com.irobot.awsservices.apigateway.a.a()>
	//   32   72:aload_0         
	//   33   73:aload_1         
	//   34   74:aload_2         
	//   35   75:invokespecial   #192 <Method com.irobot.awsservices.apigateway.a b(LoginRequestData, com.irobot.awsservices.a.a)>
	//   36   78:invokevirtual   #195 <Method ApiGatewayResponse com.irobot.awsservices.apigateway.a.a.b(com.irobot.awsservices.apigateway.a)>
	//   37   81:astore_1        
		}
	//*  38   82:aload_1         
	//*  39   83:ifnull          152
	//*  40   86:aload_1         
	//*  41   87:invokevirtual   #200 <Method int ApiGatewayResponse.a()>
	//*  42   90:istore_3        
	//*  43   91:iload_3         
	//*  44   92:sipush          200
	//*  45   95:icmpeq          132
	//*  46   98:iload_3         
	//*  47   99:sipush          400
	//*  48  102:icmpeq          124
	//*  49  105:new             #202 <Class com.irobot.awsservices.a.b$a>
	//*  50  108:dup             
	//*  51  109:ldc1            #204 <String "Internal AWS service error">
	//*  52  111:new             #149 <Class Exception>
	//*  53  114:dup             
	//*  54  115:ldc1            #204 <String "Internal AWS service error">
	//*  55  117:invokespecial   #205 <Method void Exception(String)>
	//*  56  120:invokespecial   #208 <Method void com.irobot.awsservices.a.b$a(String, Throwable)>
	//*  57  123:athrow          
	//*  58  124:aload_0         
	//*  59  125:iconst_1        
	//*  60  126:putfield        #82  <Field boolean g>
	//*  61  129:goto            152
	//*  62  132:aload_0         
	//*  63  133:aload_0         
	//*  64  134:getfield        #78  <Field Gson e>
	//*  65  137:aload_1         
	//*  66  138:invokevirtual   #210 <Method String ApiGatewayResponse.c()>
	//*  67  141:ldc1            #212 <Class LoginResponse>
	//*  68  143:invokevirtual   #216 <Method Object Gson.fromJson(String, Class)>
	//*  69  146:checkcast       #212 <Class LoginResponse>
	//*  70  149:putfield        #80  <Field LoginResponse f>
	//*  71  152:aload_0         
	//*  72  153:getfield        #80  <Field LoginResponse f>
	//*  73  156:ifnull          386
	//*  74  159:aload_0         
	//*  75  160:getfield        #80  <Field LoginResponse f>
	//*  76  163:invokevirtual   #220 <Method boolean LoginResponse.hasValidCredentials()>
	//*  77  166:ifeq            386
	//*  78  169:aload_0         
	//*  79  170:getfield        #80  <Field LoginResponse f>
	//*  80  173:invokevirtual   #224 <Method LoginResponseCredentials LoginResponse.getCredentials()>
	//*  81  176:invokevirtual   #230 <Method AWSSessionCredentials LoginResponseCredentials.getAwsCredentials()>
	//*  82  179:astore_1        
	//*  83  180:getstatic       #153 <Field String c>
	//*  84  183:ldc1            #232 <String "AWS session credentials: \n\tsecretKey = %s\n\taccessKeyId = %s\n\tsessionToken = %s">
	//*  85  185:iconst_3        
	//*  86  186:anewarray       Object[]
	//*  87  189:dup             
	//*  88  190:iconst_0        
	//*  89  191:aload_1         
	//*  90  192:invokeinterface #236 <Method String AWSSessionCredentials.b()>
	//*  91  197:aastore         
	//*  92  198:dup             
	//*  93  199:iconst_1        
	//*  94  200:aload_1         
	//*  95  201:invokeinterface #238 <Method String AWSSessionCredentials.a()>
	//*  96  206:aastore         
	//*  97  207:dup             
	//*  98  208:iconst_2        
	//*  99  209:aload_1         
	//* 100  210:invokeinterface #239 <Method String AWSSessionCredentials.c()>
	//* 101  215:aastore         
	//* 102  216:invokestatic    #245 <Method String String.format(String, Object[])>
	//* 103  219:invokestatic    #186 <Method void o.b(String, String)>
	//* 104  222:aload_0         
	//* 105  223:getfield        #80  <Field LoginResponse f>
	//* 106  226:invokevirtual   #249 <Method HashMap LoginResponse.getAssociations()>
	//* 107  229:ifnull          307
	//* 108  232:aload_2         
	//* 109  233:invokevirtual   #250 <Method String com.irobot.awsservices.a.a.c()>
	//* 110  236:aload_0         
	//* 111  237:getfield        #80  <Field LoginResponse f>
	//* 112  240:invokevirtual   #249 <Method HashMap LoginResponse.getAssociations()>
	//* 113  243:aload_0         
	//* 114  244:getfield        #86  <Field Map i>
	//* 115  247:invokestatic    #255 <Method String com.irobot.home.aws.authentication.a.a(String, HashMap, Map)>
	//* 116  250:astore          4
	//* 117  252:aload           4
	//* 118  254:invokestatic    #261 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 119  257:ifne            307
	//* 120  260:getstatic       #153 <Field String c>
	//* 121  263:ldc2            #263 <String "Cognito_id is not associated with asset %s due to %s">
	//* 122  266:iconst_2        
	//* 123  267:anewarray       Object[]
	//* 124  270:dup             
	//* 125  271:iconst_0        
	//* 126  272:aload_2         
	//* 127  273:invokevirtual   #250 <Method String com.irobot.awsservices.a.a.c()>
	//* 128  276:aastore         
	//* 129  277:dup             
	//* 130  278:iconst_1        
	//* 131  279:aload           4
	//* 132  281:aastore         
	//* 133  282:invokestatic    #245 <Method String String.format(String, Object[])>
	//* 134  285:invokestatic    #186 <Method void o.b(String, String)>
	//* 135  288:new             #202 <Class com.irobot.awsservices.a.b$a>
	//* 136  291:dup             
	//* 137  292:aload           4
	//* 138  294:new             #149 <Class Exception>
	//* 139  297:dup             
	//* 140  298:aload           4
	//* 141  300:invokespecial   #205 <Method void Exception(String)>
	//* 142  303:invokespecial   #208 <Method void com.irobot.awsservices.a.b$a(String, Throwable)>
	//* 143  306:athrow          
	//* 144  307:aload_0         
	//* 145  308:getfield        #80  <Field LoginResponse f>
	//* 146  311:invokevirtual   #224 <Method LoginResponseCredentials LoginResponse.getCredentials()>
	//* 147  314:invokevirtual   #266 <Method String LoginResponseCredentials.getExpiration()>
	//* 148  317:astore_2        
	//* 149  318:aload_0         
	//* 150  319:getstatic       #70  <Field DateFormat d>
	//* 151  322:aload_2         
	//* 152  323:invokevirtual   #270 <Method Date DateFormat.parse(String)>
	//* 153  326:putfield        #94  <Field Date l>
	//* 154  329:getstatic       #153 <Field String c>
	//* 155  332:astore          4
	//* 156  334:new             #155 <Class StringBuilder>
	//* 157  337:dup             
	//* 158  338:invokespecial   #156 <Method void StringBuilder()>
	//* 159  341:astore          5
	//* 160  343:aload           5
	//* 161  345:ldc2            #272 <String "Credentials expiration timestamp: ">
	//* 162  348:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//* 163  351:pop             
	//* 164  352:aload           5
	//* 165  354:aload_2         
	//* 166  355:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//* 167  358:pop             
	//* 168  359:aload           4
	//* 169  361:aload           5
	//* 170  363:invokevirtual   #181 <Method String StringBuilder.toString()>
	//* 171  366:invokestatic    #186 <Method void o.b(String, String)>
	//* 172  369:goto            381
	//* 173  372:getstatic       #153 <Field String c>
	//* 174  375:ldc2            #274 <String "Failed to parse credentials expiration timestamp!">
	//* 175  378:invokestatic    #276 <Method void o.e(String, String)>
	//* 176  381:invokestatic    #278 <Method void com.irobot.home.aws.authentication.a.a()>
	//* 177  384:aload_1         
	//* 178  385:areturn         
	//* 179  386:aconst_null     
	//* 180  387:areturn         
		// Misplaced declaration of an exception variable
		catch(LoginRequestData loginrequestdata)
	//* 181  388:astore_1        
		{
			a1 = ((com.irobot.awsservices.a.a) (c));
	//  182  389:getstatic       #153 <Field String c>
	//  183  392:astore_2        
			StringBuilder stringbuilder = new StringBuilder();
	//  184  393:new             #155 <Class StringBuilder>
	//  185  396:dup             
	//  186  397:invokespecial   #156 <Method void StringBuilder()>
	//  187  400:astore          4
			stringbuilder.append("Login request to API gateway failed - ");
	//  188  402:aload           4
	//  189  404:ldc2            #280 <String "Login request to API gateway failed - ">
	//  190  407:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  191  410:pop             
			stringbuilder.append(((Exception) (loginrequestdata)).getMessage());
	//  192  411:aload           4
	//  193  413:aload_1         
	//  194  414:invokevirtual   #283 <Method String Exception.getMessage()>
	//  195  417:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//  196  420:pop             
			com.irobot.home.util.o.b(((String) (a1)), stringbuilder.toString());
	//  197  421:aload_2         
	//  198  422:aload           4
	//  199  424:invokevirtual   #181 <Method String StringBuilder.toString()>
	//  200  427:invokestatic    #186 <Method void o.b(String, String)>
			throw new com.irobot.awsservices.a.b.a(((Exception) (loginrequestdata)).getMessage(), ((Throwable) (loginrequestdata)));
	//  201  430:new             #202 <Class com.irobot.awsservices.a.b$a>
	//  202  433:dup             
	//  203  434:aload_1         
	//  204  435:invokevirtual   #283 <Method String Exception.getMessage()>
	//  205  438:aload_1         
	//  206  439:invokespecial   #208 <Method void com.irobot.awsservices.a.b$a(String, Throwable)>
	//  207  442:athrow          
		}
		if(loginrequestdata == null)
			break MISSING_BLOCK_LABEL_152;
		i1 = ((ApiGatewayResponse) (loginrequestdata)).a();
		if(i1 == 200)
			break MISSING_BLOCK_LABEL_132;
		if(i1 == 400)
			break MISSING_BLOCK_LABEL_124;
		throw new com.irobot.awsservices.a.b.a("Internal AWS service error", ((Throwable) (new Exception("Internal AWS service error"))));
		g = true;
		break MISSING_BLOCK_LABEL_152;
		f = (LoginResponse)e.fromJson(((ApiGatewayResponse) (loginrequestdata)).c(), com/irobot/home/aws/authentication/model/LoginResponse);
		if(f == null || !f.hasValidCredentials()) goto _L2; else goto _L1
_L1:
		loginrequestdata = ((LoginRequestData) (f.getCredentials().getAwsCredentials()));
		com.irobot.home.util.o.b(c, String.format("AWS session credentials: \n\tsecretKey = %s\n\taccessKeyId = %s\n\tsessionToken = %s", new Object[] {
			((AWSSessionCredentials) (loginrequestdata)).b(), ((AWSSessionCredentials) (loginrequestdata)).a(), ((AWSSessionCredentials) (loginrequestdata)).c()
		}));
		if(f.getAssociations() != null)
		{
			s1 = com.irobot.home.aws.authentication.a.a(a1.c(), f.getAssociations(), i);
			if(!TextUtils.isEmpty(((CharSequence) (s1))))
			{
				com.irobot.home.util.o.b(c, String.format("Cognito_id is not associated with asset %s due to %s", new Object[] {
					a1.c(), s1
				}));
				throw new com.irobot.awsservices.a.b.a(s1, ((Throwable) (new Exception(s1))));
			}
		}
		a1 = ((com.irobot.awsservices.a.a) (f.getCredentials().getExpiration()));
		l = d.parse(((String) (a1)));
		s1 = c;
		stringbuilder1 = new StringBuilder();
		stringbuilder1.append("Credentials expiration timestamp: ");
		stringbuilder1.append(((String) (a1)));
		com.irobot.home.util.o.b(s1, stringbuilder1.toString());
		  goto _L3
_L5:
		com.irobot.home.util.o.e(c, "Failed to parse credentials expiration timestamp!");
_L3:
		com.irobot.home.aws.authentication.a.a();
		return ((AWSSessionCredentials) (loginrequestdata));
_L2:
		return null;
		a1;
	//  208  443:astore_2        
		if(true) goto _L5; else goto _L4
_L4:
	//* 209  444:goto            372
	}

	private String a(String s)
	{
		if(!TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_1         
	//*   1    1:invokestatic    #261 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifne            28
		{
			s = ((String) (b.matcher(((CharSequence) (s)))));
	//    3    7:getstatic       #60  <Field Pattern b>
	//    4   10:aload_1         
	//    5   11:invokevirtual   #288 <Method Matcher Pattern.matcher(CharSequence)>
	//    6   14:astore_1        
			if(((Matcher) (s)).matches())
	//*   7   15:aload_1         
	//*   8   16:invokevirtual   #293 <Method boolean Matcher.matches()>
	//*   9   19:ifeq            28
				return ((Matcher) (s)).group(2);
	//   10   22:aload_1         
	//   11   23:iconst_2        
	//   12   24:invokevirtual   #297 <Method String Matcher.group(int)>
	//   13   27:areturn         
		}
		return null;
	//   14   28:aconst_null     
	//   15   29:areturn         
	}

	private com.irobot.awsservices.apigateway.a b(LoginRequestData loginrequestdata, com.irobot.awsservices.a.a a1)
	{
		if(loginrequestdata == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       15
			throw new com.irobot.home.j.a("No request data supplied for prepareLoginRequest()");
	//    2    4:new             #301 <Class com.irobot.home.j.a>
	//    3    7:dup             
	//    4    8:ldc2            #303 <String "No request data supplied for prepareLoginRequest()">
	//    5   11:invokespecial   #304 <Method void com.irobot.home.j.a(String)>
	//    6   14:athrow          
		HashMap hashmap = new HashMap();
	//    7   15:new             #306 <Class HashMap>
	//    8   18:dup             
	//    9   19:invokespecial   #307 <Method void HashMap()>
	//   10   22:astore          5
		((Map) (hashmap)).put("requestMethod", "POST");
	//   11   24:aload           5
	//   12   26:ldc2            #309 <String "requestMethod">
	//   13   29:ldc2            #311 <String "POST">
	//   14   32:invokeinterface #317 <Method Object Map.put(Object, Object)>
	//   15   37:pop             
		Object obj1 = ((Object) (a(c(a1))));
	//   16   38:aload_0         
	//   17   39:aload_0         
	//   18   40:aload_2         
	//   19   41:invokespecial   #320 <Method String c(com.irobot.awsservices.a.a)>
	//   20   44:invokespecial   #322 <Method String a(String)>
	//   21   47:astore          4
		Object obj = obj1;
	//   22   49:aload           4
	//   23   51:astore_3        
		if(obj1 == null)
	//*  24   52:aload           4
	//*  25   54:ifnonnull       61
			obj = "";
	//   26   57:ldc2            #324 <String "">
	//   27   60:astore_3        
		obj1 = ((Object) (new StringBuilder()));
	//   28   61:new             #155 <Class StringBuilder>
	//   29   64:dup             
	//   30   65:invokespecial   #156 <Method void StringBuilder()>
	//   31   68:astore          4
		((StringBuilder) (obj1)).append(((String) (obj)));
	//   32   70:aload           4
	//   33   72:aload_3         
	//   34   73:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   35   76:pop             
		((StringBuilder) (obj1)).append("/v1");
	//   36   77:aload           4
	//   37   79:ldc2            #326 <String "/v1">
	//   38   82:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   39   85:pop             
		((StringBuilder) (obj1)).append(loginrequestdata.getLoginPath());
	//   40   86:aload           4
	//   41   88:aload_1         
	//   42   89:invokevirtual   #331 <Method String LoginRequestData.getLoginPath()>
	//   43   92:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   44   95:pop             
		((Map) (hashmap)).put("requestPath", ((Object) (((StringBuilder) (obj1)).toString())));
	//   45   96:aload           5
	//   46   98:ldc2            #333 <String "requestPath">
	//   47  101:aload           4
	//   48  103:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   49  106:invokeinterface #317 <Method Object Map.put(Object, Object)>
	//   50  111:pop             
		((Map) (hashmap)).put("requestPayload", ((Object) (e.toJson(((Object) (loginrequestdata)), ((java.lang.reflect.Type) (((Object) (loginrequestdata)).getClass()))))));
	//   51  112:aload           5
	//   52  114:ldc2            #335 <String "requestPayload">
	//   53  117:aload_0         
	//   54  118:getfield        #78  <Field Gson e>
	//   55  121:aload_1         
	//   56  122:aload_1         
	//   57  123:invokevirtual   #339 <Method Class Object.getClass()>
	//   58  126:invokevirtual   #343 <Method String Gson.toJson(Object, java.lang.reflect.Type)>
	//   59  129:invokeinterface #317 <Method Object Map.put(Object, Object)>
	//   60  134:pop             
		((Map) (hashmap)).put("timeout", ((Object) (Integer.valueOf(6000))));
	//   61  135:aload           5
	//   62  137:ldc2            #345 <String "timeout">
	//   63  140:sipush          6000
	//   64  143:invokestatic    #351 <Method Integer Integer.valueOf(int)>
	//   65  146:invokeinterface #317 <Method Object Map.put(Object, Object)>
	//   66  151:pop             
		obj = ((Object) (new com.irobot.awsservices.apigateway.a()));
	//   67  152:new             #353 <Class com.irobot.awsservices.apigateway.a>
	//   68  155:dup             
	//   69  156:invokespecial   #354 <Method void com.irobot.awsservices.apigateway.a()>
	//   70  159:astore_3        
		((com.irobot.awsservices.apigateway.a) (obj)).a(Region.a(b(a1)));
	//   71  160:aload_3         
	//   72  161:aload_0         
	//   73  162:aload_2         
	//   74  163:invokevirtual   #357 <Method Regions b(com.irobot.awsservices.a.a)>
	//   75  166:invokestatic    #362 <Method Region Region.a(Regions)>
	//   76  169:invokevirtual   #365 <Method void com.irobot.awsservices.apigateway.a.a(Region)>
		((com.irobot.awsservices.apigateway.a) (obj)).a("execute-api");
	//   77  172:aload_3         
	//   78  173:ldc2            #367 <String "execute-api">
	//   79  176:invokevirtual   #369 <Method void com.irobot.awsservices.apigateway.a.a(String)>
		try
		{
			loginrequestdata = ((LoginRequestData) ((new URL(c(a1))).getHost()));
	//   80  179:new             #371 <Class URL>
	//   81  182:dup             
	//   82  183:aload_0         
	//   83  184:aload_2         
	//   84  185:invokespecial   #320 <Method String c(com.irobot.awsservices.a.a)>
	//   85  188:invokespecial   #372 <Method void URL(String)>
	//   86  191:invokevirtual   #375 <Method String URL.getHost()>
	//   87  194:astore_1        
		}
	//*  88  195:goto            205
		// Misplaced declaration of an exception variable
		catch(LoginRequestData loginrequestdata)
	//*  89  198:astore_1        
		{
			((MalformedURLException) (loginrequestdata)).printStackTrace();
	//   90  199:aload_1         
	//   91  200:invokevirtual   #378 <Method void MalformedURLException.printStackTrace()>
			loginrequestdata = null;
	//   92  203:aconst_null     
	//   93  204:astore_1        
		}
		((com.irobot.awsservices.apigateway.a) (obj)).b(((String) (loginrequestdata)));
	//   94  205:aload_3         
	//   95  206:aload_1         
	//   96  207:invokevirtual   #380 <Method void com.irobot.awsservices.apigateway.a.b(String)>
		((com.irobot.awsservices.apigateway.a) (obj)).a(((Map) (hashmap)));
	//   97  210:aload_3         
	//   98  211:aload           5
	//   99  213:invokevirtual   #383 <Method void com.irobot.awsservices.apigateway.a.a(Map)>
		return ((com.irobot.awsservices.apigateway.a) (obj));
	//  100  216:aload_3         
	//  101  217:areturn         
	}

	private String c(com.irobot.awsservices.a.a a1)
	{
		ServiceDiscovery servicediscovery = ServiceDiscovery.getInstance();
	//    0    0:invokestatic    #388 <Method ServiceDiscovery ServiceDiscovery.getInstance()>
	//    1    3:astore_2        
		static class _cls1
		{

			static final int a[];

			static 
			{
				a = new int[com.irobot.awsservices.a.a.a.values().length];
			//    0    0:invokestatic    #18  <Method com.irobot.awsservices.a.a$a[] com.irobot.awsservices.a.a$a.values()>
			//    1    3:arraylength     
			//    2    4:newarray        int[]
			//    3    6:putstatic       #20  <Field int[] a>
				try
				{
					a[com.irobot.awsservices.a.a.a.Account.ordinal()] = 1;
			//    4    9:getstatic       #20  <Field int[] a>
			//    5   12:getstatic       #24  <Field com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a$a.Account>
			//    6   15:invokevirtual   #28  <Method int com.irobot.awsservices.a.a$a.ordinal()>
			//    7   18:iconst_1        
			//    8   19:iastore         
				}
			//*   9   20:getstatic       #20  <Field int[] a>
			//*  10   23:getstatic       #31  <Field com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a$a.Asset>
			//*  11   26:invokevirtual   #28  <Method int com.irobot.awsservices.a.a$a.ordinal()>
			//*  12   29:iconst_2        
			//*  13   30:iastore         
			//*  14   31:return          
				catch(NoSuchFieldError nosuchfielderror) { }
			//   15   32:astore_0        
				try
				{
					a[com.irobot.awsservices.a.a.a.Asset.ordinal()] = 2;
				}
			//*  16   33:goto            20
				catch(NoSuchFieldError nosuchfielderror1) { }
			//   17   36:astore_0        
			//*  18   37:return          
			}
		}

		com.irobot.home.aws.authentication._cls1.a[a1.a().ordinal()];
	//    2    4:getstatic       #391 <Field int[] com.irobot.home.aws.authentication.AwsCredentialsService$1.a>
	//    3    7:aload_1         
	//    4    8:invokevirtual   #167 <Method com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a.a()>
	//    5   11:invokevirtual   #394 <Method int com.irobot.awsservices.a.a$a.ordinal()>
	//    6   14:iaload          
		JVM INSTR tableswitch 1 2: default 36
	//	               1 56
	//	               2 41;
	//    7   15:tableswitch     1 2: default 36
	//	               1 56
	//	               2 41
		   goto _L1 _L2 _L3
_L1:
		a1 = null;
	//    8   36:aconst_null     
	//    9   37:astore_1        
		  goto _L4
	//*  10   38:goto            70
_L3:
		a1 = ((com.irobot.awsservices.a.a) (servicediscovery.getServiceDiscoveryData(AssetId.assetIdForString(a1.c()))));
	//   11   41:aload_2         
	//   12   42:aload_1         
	//   13   43:invokevirtual   #250 <Method String com.irobot.awsservices.a.a.c()>
	//   14   46:invokestatic    #400 <Method AssetId AssetId.assetIdForString(String)>
	//   15   49:invokevirtual   #404 <Method ServiceDiscoveryData ServiceDiscovery.getServiceDiscoveryData(AssetId)>
	//   16   52:astore_1        
		  goto _L5
	//*  17   53:goto            65
_L2:
		a1 = ((com.irobot.awsservices.a.a) (servicediscovery.getAppServiceDiscoveryData(a1.c())));
	//   18   56:aload_2         
	//   19   57:aload_1         
	//   20   58:invokevirtual   #250 <Method String com.irobot.awsservices.a.a.c()>
	//   21   61:invokevirtual   #408 <Method ServiceDiscoveryData ServiceDiscovery.getAppServiceDiscoveryData(String)>
	//   22   64:astore_1        
_L5:
		a1 = ((com.irobot.awsservices.a.a) (((ServiceDiscoveryData) (a1)).getApiGatewayUnauthenticatedUrl()));
	//   23   65:aload_1         
	//   24   66:invokevirtual   #413 <Method String ServiceDiscoveryData.getApiGatewayUnauthenticatedUrl()>
	//   25   69:astore_1        
_L4:
		String s = c;
	//   26   70:getstatic       #153 <Field String c>
	//   27   73:astore_2        
		StringBuilder stringbuilder = new StringBuilder();
	//   28   74:new             #155 <Class StringBuilder>
	//   29   77:dup             
	//   30   78:invokespecial   #156 <Method void StringBuilder()>
	//   31   81:astore_3        
		stringbuilder.append("Api gateway end point: ");
	//   32   82:aload_3         
	//   33   83:ldc2            #415 <String "Api gateway end point: ">
	//   34   86:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   35   89:pop             
		stringbuilder.append(((String) (a1)));
	//   36   90:aload_3         
	//   37   91:aload_1         
	//   38   92:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   39   95:pop             
		com.irobot.home.util.o.b(s, stringbuilder.toString());
	//   40   96:aload_2         
	//   41   97:aload_3         
	//   42   98:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   43  101:invokestatic    #186 <Method void o.b(String, String)>
		return ((String) (a1));
	//   44  104:aload_1         
	//   45  105:areturn         
	}

	public static AwsCredentialsService f()
	{
		return com.irobot.home.aws.authentication.a.a();
	//    0    0:invokestatic    #418 <Method AwsCredentialsService com.irobot.home.aws.authentication.AwsCredentialsService$a.a()>
	//    1    3:areturn         
	}

	private void g()
	{
		Object obj = o;
	//    0    0:aload_0         
	//    1    1:getfield        #101 <Field Object o>
	//    2    4:astore_1        
		obj;
	//    3    5:aload_1         
		JVM INSTR monitorenter ;
	//    4    6:monitorenter    
		Assembler.getInstance().getAccountService().refreshAccountInfo();
	//    5    7:invokestatic    #121 <Method Assembler Assembler.getInstance()>
	//    6   10:invokevirtual   #424 <Method AccountService Assembler.getAccountService()>
	//    7   13:invokevirtual   #429 <Method void AccountService.refreshAccountInfo()>
		o.wait();
	//    8   16:aload_0         
	//    9   17:getfield        #101 <Field Object o>
	//   10   20:invokevirtual   #432 <Method void Object.wait()>
		break MISSING_BLOCK_LABEL_31;
	//   11   23:goto            31
		Object obj1;
		obj1;
	//   12   26:astore_2        
		((InterruptedException) (obj1)).printStackTrace();
	//   13   27:aload_2         
	//   14   28:invokevirtual   #433 <Method void InterruptedException.printStackTrace()>
		obj;
	//   15   31:aload_1         
		JVM INSTR monitorexit ;
	//   16   32:monitorexit     
		return;
	//   17   33:return          
		obj1;
	//   18   34:astore_2        
		obj;
	//   19   35:aload_1         
		JVM INSTR monitorexit ;
	//   20   36:monitorexit     
		throw obj1;
	//   21   37:aload_2         
	//   22   38:athrow          
	}

	private static void h()
	{
		if(Thread.currentThread() == Looper.getMainLooper().getThread())
	//*   0    0:invokestatic    #439 <Method Thread Thread.currentThread()>
	//*   1    3:invokestatic    #445 <Method Looper Looper.getMainLooper()>
	//*   2    6:invokevirtual   #448 <Method Thread Looper.getThread()>
	//*   3    9:if_acmpne       63
		{
			Object obj = ((Object) (new StringBuilder()));
	//    4   12:new             #155 <Class StringBuilder>
	//    5   15:dup             
	//    6   16:invokespecial   #156 <Method void StringBuilder()>
	//    7   19:astore_0        
			((StringBuilder) (obj)).append("Please do not call into public synchronized methods of ");
	//    8   20:aload_0         
	//    9   21:ldc2            #450 <String "Please do not call into public synchronized methods of ">
	//   10   24:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   11   27:pop             
			((StringBuilder) (obj)).append(((Class) (com/irobot/home/aws/authentication/AwsCredentialsService)).getSimpleName());
	//   12   28:aload_0         
	//   13   29:ldc1            #2   <Class AwsCredentialsService>
	//   14   31:invokevirtual   #455 <Method String Class.getSimpleName()>
	//   15   34:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   16   37:pop             
			((StringBuilder) (obj)).append("from the main thread. Gigya callbacks returning on main thread, can cause deadlocks");
	//   17   38:aload_0         
	//   18   39:ldc2            #457 <String "from the main thread. Gigya callbacks returning on main thread, can cause deadlocks">
	//   19   42:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   20   45:pop             
			obj = ((Object) (((StringBuilder) (obj)).toString()));
	//   21   46:aload_0         
	//   22   47:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   23   50:astore_0        
			com.irobot.home.util.o.e(c, ((String) (obj)));
	//   24   51:getstatic       #153 <Field String c>
	//   25   54:aload_0         
	//   26   55:invokestatic    #276 <Method void o.e(String, String)>
			junit.b.a.a(((String) (obj)), false);
	//   27   58:aload_0         
	//   28   59:iconst_0        
	//   29   60:invokestatic    #462 <Method void junit.b.a.a(String, boolean)>
		}
	//   30   63:return          
	}

	public AWSSessionCredentials a(com.irobot.awsservices.a.a a1)
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		h();
	//    2    2:invokestatic    #465 <Method void h()>
		if(!b())
			break MISSING_BLOCK_LABEL_21;
	//    3    5:aload_0         
	//    4    6:invokevirtual   #467 <Method boolean b()>
	//    5    9:ifeq            21
		a1 = ((com.irobot.awsservices.a.a) (k));
	//    6   12:aload_0         
	//    7   13:getfield        #92  <Field AWSSessionCredentials k>
	//    8   16:astore_1        
		this;
	//    9   17:aload_0         
		JVM INSTR monitorexit ;
	//   10   18:monitorexit     
		return ((AWSSessionCredentials) (a1));
	//   11   19:aload_1         
	//   12   20:areturn         
		g = false;
	//   13   21:aload_0         
	//   14   22:iconst_0        
	//   15   23:putfield        #82  <Field boolean g>
		if(Assembler.getInstance().getAccountService().isLoggedIn())
	//*  16   26:invokestatic    #121 <Method Assembler Assembler.getInstance()>
	//*  17   29:invokevirtual   #424 <Method AccountService Assembler.getAccountService()>
	//*  18   32:invokevirtual   #470 <Method boolean AccountService.isLoggedIn()>
	//*  19   35:ifeq            96
		{
			g();
	//   20   38:aload_0         
	//   21   39:invokespecial   #472 <Method void g()>
			k = a(n, a1);
	//   22   42:aload_0         
	//   23   43:aload_0         
	//   24   44:aload_0         
	//   25   45:getfield        #96  <Field LoginRequestData n>
	//   26   48:aload_1         
	//   27   49:invokespecial   #474 <Method AWSSessionCredentials a(LoginRequestData, com.irobot.awsservices.a.a)>
	//   28   52:putfield        #92  <Field AWSSessionCredentials k>
			if(g)
	//*  29   55:aload_0         
	//*  30   56:getfield        #82  <Field boolean g>
	//*  31   59:ifeq            100
			{
				com.irobot.home.util.o.d(c, "Last authentication request failed. Retrying...");
	//   32   62:getstatic       #153 <Field String c>
	//   33   65:ldc2            #476 <String "Last authentication request failed. Retrying...">
	//   34   68:invokestatic    #478 <Method void o.d(String, String)>
				g();
	//   35   71:aload_0         
	//   36   72:invokespecial   #472 <Method void g()>
				k = a(n, a1);
	//   37   75:aload_0         
	//   38   76:aload_0         
	//   39   77:aload_0         
	//   40   78:getfield        #96  <Field LoginRequestData n>
	//   41   81:aload_1         
	//   42   82:invokespecial   #474 <Method AWSSessionCredentials a(LoginRequestData, com.irobot.awsservices.a.a)>
	//   43   85:putfield        #92  <Field AWSSessionCredentials k>
				g = false;
	//   44   88:aload_0         
	//   45   89:iconst_0        
	//   46   90:putfield        #82  <Field boolean g>
			}
			break MISSING_BLOCK_LABEL_100;
	//   47   93:goto            100
		}
		a();
	//   48   96:aload_0         
	//   49   97:invokevirtual   #479 <Method void a()>
		a1 = ((com.irobot.awsservices.a.a) (k));
	//   50  100:aload_0         
	//   51  101:getfield        #92  <Field AWSSessionCredentials k>
	//   52  104:astore_1        
		this;
	//   53  105:aload_0         
		JVM INSTR monitorexit ;
	//   54  106:monitorexit     
		return ((AWSSessionCredentials) (a1));
	//   55  107:aload_1         
	//   56  108:areturn         
		a1;
	//   57  109:astore_1        
	//*  58  110:aload_0         
		throw a1;
	//   59  111:monitorexit     
	//   60  112:aload_1         
	//   61  113:athrow          
	}

	public void a()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		h();
	//    2    2:invokestatic    #465 <Method void h()>
		k = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #92  <Field AWSSessionCredentials k>
		l = null;
	//    6   10:aload_0         
	//    7   11:aconst_null     
	//    8   12:putfield        #94  <Field Date l>
		this;
	//    9   15:aload_0         
		JVM INSTR monitorexit ;
	//   10   16:monitorexit     
		return;
	//   11   17:return          
		Exception exception;
		exception;
	//   12   18:astore_1        
	//*  13   19:aload_0         
		throw exception;
	//   14   20:monitorexit     
	//   15   21:aload_1         
	//   16   22:athrow          
	}

	public void a(ApiGatewayResponse apigatewayresponse)
	{
		apigatewayresponse = ((ApiGatewayResponse) ((AccountAssociationStatus)e.fromJson(apigatewayresponse.c(), com/irobot/home/aws/authentication/model/AccountAssociationStatus)));
	//    0    0:aload_0         
	//    1    1:getfield        #78  <Field Gson e>
	//    2    4:aload_1         
	//    3    5:invokevirtual   #210 <Method String ApiGatewayResponse.c()>
	//    4    8:ldc2            #482 <Class AccountAssociationStatus>
	//    5   11:invokevirtual   #216 <Method Object Gson.fromJson(String, Class)>
	//    6   14:checkcast       #482 <Class AccountAssociationStatus>
	//    7   17:astore_1        
		if(apigatewayresponse != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          36
			try
			{
				j = ((AccountAssociationStatus) (apigatewayresponse)).getAssociationStatus();
	//   10   22:aload_0         
	//   11   23:aload_1         
	//   12   24:invokevirtual   #485 <Method String AccountAssociationStatus.getAssociationStatus()>
	//   13   27:putfield        #90  <Field String j>
				return;
	//   14   30:return          
			}
			// Misplaced declaration of an exception variable
			catch(ApiGatewayResponse apigatewayresponse)
	//*  15   31:astore_1        
			{
				((Exception) (apigatewayresponse)).printStackTrace();
	//   16   32:aload_1         
	//   17   33:invokevirtual   #486 <Method void Exception.printStackTrace()>
			}
		return;
	//   18   36:return          
	}

	public Regions b(com.irobot.awsservices.a.a a1)
	{
label0:
		{
			ServiceDiscovery servicediscovery = ServiceDiscovery.getInstance();
	//    0    0:invokestatic    #388 <Method ServiceDiscovery ServiceDiscovery.getInstance()>
	//    1    3:astore_2        
			switch(com.irobot.home.aws.authentication._cls1.a[a1.a().ordinal()])
	//*   2    4:getstatic       #391 <Field int[] com.irobot.home.aws.authentication.AwsCredentialsService$1.a>
	//*   3    7:aload_1         
	//*   4    8:invokevirtual   #167 <Method com.irobot.awsservices.a.a$a com.irobot.awsservices.a.a.a()>
	//*   5   11:invokevirtual   #394 <Method int com.irobot.awsservices.a.a$a.ordinal()>
	//*   6   14:iaload          
			{
	//*   7   15:tableswitch     1 2: default 36
	//	               1 56
	//	               2 41
			default:
				a1 = null;
	//    8   36:aconst_null     
	//    9   37:astore_1        
				break label0;
	//   10   38:goto            70

			case 2: // '\002'
				a1 = ((com.irobot.awsservices.a.a) (servicediscovery.getServiceDiscoveryData(AssetId.assetIdForString(a1.c()))));
	//   11   41:aload_2         
	//   12   42:aload_1         
	//   13   43:invokevirtual   #250 <Method String com.irobot.awsservices.a.a.c()>
	//   14   46:invokestatic    #400 <Method AssetId AssetId.assetIdForString(String)>
	//   15   49:invokevirtual   #404 <Method ServiceDiscoveryData ServiceDiscovery.getServiceDiscoveryData(AssetId)>
	//   16   52:astore_1        
				break;
	//   17   53:goto            65

			case 1: // '\001'
				a1 = ((com.irobot.awsservices.a.a) (servicediscovery.getAppServiceDiscoveryData(a1.c())));
	//   18   56:aload_2         
	//   19   57:aload_1         
	//   20   58:invokevirtual   #250 <Method String com.irobot.awsservices.a.a.c()>
	//   21   61:invokevirtual   #408 <Method ServiceDiscoveryData ServiceDiscovery.getAppServiceDiscoveryData(String)>
	//   22   64:astore_1        
				break;
			}
			a1 = ((com.irobot.awsservices.a.a) (((ServiceDiscoveryData) (a1)).getAwsRegion()));
	//   23   65:aload_1         
	//   24   66:invokevirtual   #489 <Method String ServiceDiscoveryData.getAwsRegion()>
	//   25   69:astore_1        
		}
		if(com.irobot.home.util.j.i(((String) (a1))))
	//*  26   70:aload_1         
	//*  27   71:invokestatic    #494 <Method boolean j.i(String)>
	//*  28   74:ifeq            82
			return Regions.fromName(((String) (a1)));
	//   29   77:aload_1         
	//   30   78:invokestatic    #498 <Method Regions Regions.fromName(String)>
	//   31   81:areturn         
		else
			return a;
	//   32   82:getstatic       #50  <Field Regions a>
	//   33   85:areturn         
	}

	public boolean b()
	{
		this;
	//    0    0:aload_0         
		JVM INSTR monitorenter ;
	//    1    1:monitorenter    
		AWSSessionCredentials awssessioncredentials;
		h();
	//    2    2:invokestatic    #465 <Method void h()>
		awssessioncredentials = k;
	//    3    5:aload_0         
	//    4    6:getfield        #92  <Field AWSSessionCredentials k>
	//    5    9:astore_3        
		boolean flag;
		flag = false;
	//    6   10:iconst_0        
	//    7   11:istore_2        
		if(awssessioncredentials == null)
			break MISSING_BLOCK_LABEL_84;
	//    8   12:aload_3         
	//    9   13:ifnull          84
		int i1;
		if(l == null)
			break MISSING_BLOCK_LABEL_84;
	//   10   16:aload_0         
	//   11   17:getfield        #94  <Field Date l>
	//   12   20:ifnull          84
		i1 = (int)(l.getTime() - System.currentTimeMillis());
	//   13   23:aload_0         
	//   14   24:getfield        #94  <Field Date l>
	//   15   27:invokevirtual   #504 <Method long Date.getTime()>
	//   16   30:invokestatic    #509 <Method long System.currentTimeMillis()>
	//   17   33:lsub            
	//   18   34:l2i             
	//   19   35:istore_1        
		String s = c;
	//   20   36:getstatic       #153 <Field String c>
	//   21   39:astore_3        
		StringBuilder stringbuilder = new StringBuilder();
	//   22   40:new             #155 <Class StringBuilder>
	//   23   43:dup             
	//   24   44:invokespecial   #156 <Method void StringBuilder()>
	//   25   47:astore          4
		stringbuilder.append("Time until credentials expire: ");
	//   26   49:aload           4
	//   27   51:ldc2            #511 <String "Time until credentials expire: ">
	//   28   54:invokevirtual   #162 <Method StringBuilder StringBuilder.append(String)>
	//   29   57:pop             
		stringbuilder.append(i1);
	//   30   58:aload           4
	//   31   60:iload_1         
	//   32   61:invokevirtual   #514 <Method StringBuilder StringBuilder.append(int)>
	//   33   64:pop             
		com.irobot.home.util.o.a(s, stringbuilder.toString());
	//   34   65:aload_3         
	//   35   66:aload           4
	//   36   68:invokevirtual   #181 <Method String StringBuilder.toString()>
	//   37   71:invokestatic    #516 <Method void o.a(String, String)>
		if(i1 > 0)
	//*  38   74:iload_1         
	//*  39   75:ifle            80
			flag = true;
	//   40   78:iconst_1        
	//   41   79:istore_2        
		this;
	//   42   80:aload_0         
		JVM INSTR monitorexit ;
	//   43   81:monitorexit     
		return flag;
	//   44   82:iload_2         
	//   45   83:ireturn         
		this;
	//   46   84:aload_0         
		JVM INSTR monitorexit ;
	//   47   85:monitorexit     
		return false;
	//   48   86:iconst_0        
	//   49   87:ireturn         
		Exception exception;
		exception;
	//   50   88:astore_3        
	//*  51   89:aload_0         
		throw exception;
	//   52   90:monitorexit     
	//   53   91:aload_3         
	//   54   92:athrow          
	}

	public void c()
	{
		a();
	//    0    0:aload_0         
	//    1    1:invokevirtual   #479 <Method void a()>
		h = true;
	//    2    4:aload_0         
	//    3    5:iconst_1        
	//    4    6:putfield        #84  <Field boolean h>
	//    5    9:return          
	}

	public void d()
	{
		h = false;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #84  <Field boolean h>
	//    3    5:return          
	}

	public com.irobot.awsservices.a.b.a e()
	{
		if(h)
	//*   0    0:aload_0         
	//*   1    1:getfield        #84  <Field boolean h>
	//*   2    4:ifeq            30
			return new com.irobot.awsservices.a.b.a(j, ((Throwable) (new Exception(j))));
	//    3    7:new             #202 <Class com.irobot.awsservices.a.b$a>
	//    4   10:dup             
	//    5   11:aload_0         
	//    6   12:getfield        #90  <Field String j>
	//    7   15:new             #149 <Class Exception>
	//    8   18:dup             
	//    9   19:aload_0         
	//   10   20:getfield        #90  <Field String j>
	//   11   23:invokespecial   #205 <Method void Exception(String)>
	//   12   26:invokespecial   #208 <Method void com.irobot.awsservices.a.b$a(String, Throwable)>
	//   13   29:areturn         
		else
			return null;
	//   14   30:aconst_null     
	//   15   31:areturn         
	}

	public boolean isAuthenticated()
	{
		Date date = l;
	//    0    0:aload_0         
	//    1    1:getfield        #94  <Field Date l>
	//    2    4:astore          4
		boolean flag2 = false;
	//    3    6:iconst_0        
	//    4    7:istore_3        
		boolean flag;
		if(date != null && (int)(l.getTime() - System.currentTimeMillis()) <= 0)
	//*   5    8:aload           4
	//*   6   10:ifnull          33
	//*   7   13:aload_0         
	//*   8   14:getfield        #94  <Field Date l>
	//*   9   17:invokevirtual   #504 <Method long Date.getTime()>
	//*  10   20:invokestatic    #509 <Method long System.currentTimeMillis()>
	//*  11   23:lsub            
	//*  12   24:l2i             
	//*  13   25:ifgt            33
			flag = true;
	//   14   28:iconst_1        
	//   15   29:istore_1        
		else
	//*  16   30:goto            35
			flag = false;
	//   17   33:iconst_0        
	//   18   34:istore_1        
		boolean flag1 = flag2;
	//   19   35:iload_3         
	//   20   36:istore_2        
		if(k != null)
	//*  21   37:aload_0         
	//*  22   38:getfield        #92  <Field AWSSessionCredentials k>
	//*  23   41:ifnull          103
		{
			flag1 = flag2;
	//   24   44:iload_3         
	//   25   45:istore_2        
			if(!TextUtils.isEmpty(((CharSequence) (k.a()))))
	//*  26   46:aload_0         
	//*  27   47:getfield        #92  <Field AWSSessionCredentials k>
	//*  28   50:invokeinterface #238 <Method String AWSSessionCredentials.a()>
	//*  29   55:invokestatic    #261 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  30   58:ifne            103
			{
				flag1 = flag2;
	//   31   61:iload_3         
	//   32   62:istore_2        
				if(!TextUtils.isEmpty(((CharSequence) (k.b()))))
	//*  33   63:aload_0         
	//*  34   64:getfield        #92  <Field AWSSessionCredentials k>
	//*  35   67:invokeinterface #236 <Method String AWSSessionCredentials.b()>
	//*  36   72:invokestatic    #261 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  37   75:ifne            103
				{
					flag1 = flag2;
	//   38   78:iload_3         
	//   39   79:istore_2        
					if(!TextUtils.isEmpty(((CharSequence) (k.c()))))
	//*  40   80:aload_0         
	//*  41   81:getfield        #92  <Field AWSSessionCredentials k>
	//*  42   84:invokeinterface #239 <Method String AWSSessionCredentials.c()>
	//*  43   89:invokestatic    #261 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  44   92:ifne            103
					{
						flag1 = flag2;
	//   45   95:iload_3         
	//   46   96:istore_2        
						if(!flag)
	//*  47   97:iload_1         
	//*  48   98:ifne            103
							flag1 = true;
	//   49  101:iconst_1        
	//   50  102:istore_2        
					}
				}
			}
		}
		return flag1;
	//   51  103:iload_2         
	//   52  104:ireturn         
	}

	public void onAccountErrorEvent(AccountErrorEvent accounterrorevent)
	{
		synchronized(o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Object o>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			if(accounterrorevent.error() == AccountError.AccountInfoRefreshFailed)
	//*   5    7:aload_1         
	//*   6    8:invokevirtual   #527 <Method AccountError AccountErrorEvent.error()>
	//*   7   11:getstatic       #533 <Field AccountError AccountError.AccountInfoRefreshFailed>
	//*   8   14:if_acmpne       22
				n = null;
	//    9   17:aload_0         
	//   10   18:aconst_null     
	//   11   19:putfield        #96  <Field LoginRequestData n>
			o.notifyAll();
	//   12   22:aload_0         
	//   13   23:getfield        #101 <Field Object o>
	//   14   26:invokevirtual   #536 <Method void Object.notifyAll()>
		}
	//   15   29:aload_2         
	//   16   30:monitorexit     
		return;
	//   17   31:return          
		accounterrorevent;
	//   18   32:astore_1        
		obj;
	//   19   33:aload_2         
		JVM INSTR monitorexit ;
	//   20   34:monitorexit     
		throw accounterrorevent;
	//   21   35:aload_1         
	//   22   36:athrow          
	}

	public void onAccountInfoUpdatedEvent(AccountInfoUpdatedEvent accountinfoupdatedevent)
	{
		synchronized(o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Object o>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			n = LoginRequestData.create(accountinfoupdatedevent.accountInfo(), com.irobot.home.util.j.h());
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #545 <Method com.irobot.core.AccountInfo AccountInfoUpdatedEvent.accountInfo()>
	//    8   12:invokestatic    #547 <Method String j.h()>
	//    9   15:invokestatic    #551 <Method LoginRequestData LoginRequestData.create(com.irobot.core.AccountInfo, String)>
	//   10   18:putfield        #96  <Field LoginRequestData n>
			o.notifyAll();
	//   11   21:aload_0         
	//   12   22:getfield        #101 <Field Object o>
	//   13   25:invokevirtual   #536 <Method void Object.notifyAll()>
		}
	//   14   28:aload_2         
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		accountinfoupdatedevent;
	//   17   31:astore_1        
		obj;
	//   18   32:aload_2         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw accountinfoupdatedevent;
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	public void onAccountLoggedInEvent(AccountLoggedInEvent accountloggedinevent)
	{
		synchronized(o)
	//*   0    0:aload_0         
	//*   1    1:getfield        #101 <Field Object o>
	//*   2    4:astore_2        
	//*   3    5:aload_2         
	//*   4    6:monitorenter    
		{
			n = LoginRequestData.create(accountloggedinevent.accountInfo(), com.irobot.home.util.j.h());
	//    5    7:aload_0         
	//    6    8:aload_1         
	//    7    9:invokevirtual   #556 <Method com.irobot.core.AccountInfo AccountLoggedInEvent.accountInfo()>
	//    8   12:invokestatic    #547 <Method String j.h()>
	//    9   15:invokestatic    #551 <Method LoginRequestData LoginRequestData.create(com.irobot.core.AccountInfo, String)>
	//   10   18:putfield        #96  <Field LoginRequestData n>
			o.notifyAll();
	//   11   21:aload_0         
	//   12   22:getfield        #101 <Field Object o>
	//   13   25:invokevirtual   #536 <Method void Object.notifyAll()>
		}
	//   14   28:aload_2         
	//   15   29:monitorexit     
		return;
	//   16   30:return          
		accountloggedinevent;
	//   17   31:astore_1        
		obj;
	//   18   32:aload_2         
		JVM INSTR monitorexit ;
	//   19   33:monitorexit     
		throw accountloggedinevent;
	//   20   34:aload_1         
	//   21   35:athrow          
	}

	private static final Regions a;
	private static Pattern b = Pattern.compile("^https?://\\w+.execute-api.([a-z0-9-]+).amazonaws.com(/.*)");
	private static final String c = "AwsCredentialsService";
	private static final DateFormat d = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
	private final Gson e;
	private LoginResponse f;
	private boolean g;
	private boolean h;
	private Map i;
	private String j;
	private AWSSessionCredentials k;
	private Date l;
	private com.irobot.home.i.a m;
	private LoginRequestData n;
	private Object o;

	static 
	{
		a = Regions.US_EAST_1;
	//    0    0:getstatic       #48  <Field Regions Regions.US_EAST_1>
	//    1    3:putstatic       #50  <Field Regions a>
	//    2    6:ldc1            #52  <String "^https?://\\w+.execute-api.([a-z0-9-]+).amazonaws.com(/.*)">
	//    3    8:invokestatic    #58  <Method Pattern Pattern.compile(String)>
	//    4   11:putstatic       #60  <Field Pattern b>
	//    5   14:new             #62  <Class SimpleDateFormat>
	//    6   17:dup             
	//    7   18:ldc1            #64  <String "yyyy-MM-dd'T'HH:mm:ssZ">
	//    8   20:invokespecial   #68  <Method void SimpleDateFormat(String)>
	//    9   23:putstatic       #70  <Field DateFormat d>
	//*  10   26:return          
	}
}
