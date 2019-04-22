// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.digits.sdk.android;

import android.text.TextUtils;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.newrelic.agent.android.instrumentation.GsonInstrumentation;
import com.twitter.sdk.android.core.*;
import com.twitter.sdk.android.core.internal.oauth.OAuth2Token;
import io.fabric.sdk.android.Fabric;
import io.fabric.sdk.android.Logger;
import io.fabric.sdk.android.services.persistence.SerializationStrategy;
import java.util.Iterator;
import java.util.List;
import retrofit.client.Header;
import retrofit.client.Response;

// Referenced classes of package com.digits.sdk.android:
//			DigitsSessionResponse, VerifyAccountResponse, DigitsUser

public class DigitsSession extends Session
{
	public static class Serializer
		implements SerializationStrategy
	{

		public DigitsSession deserialize(String s)
		{
			if(TextUtils.isEmpty(((CharSequence) (s))))
				break MISSING_BLOCK_LABEL_90;
		//    0    0:aload_1         
		//    1    1:invokestatic    #46  <Method boolean TextUtils.isEmpty(CharSequence)>
		//    2    4:ifne            90
			Gson gson1;
			gson1 = gson;
		//    3    7:aload_0         
		//    4    8:getfield        #35  <Field Gson gson>
		//    5   11:astore_2        
			if(!(gson1 instanceof Gson))
		//*   6   12:aload_2         
		//*   7   13:instanceof      #48  <Class Gson>
		//*   8   16:ifne            30
			{
				s = ((String) (gson1.fromJson(s, com/digits/sdk/android/DigitsSession)));
		//    9   19:aload_2         
		//   10   20:aload_1         
		//   11   21:ldc1            #9   <Class DigitsSession>
		//   12   23:invokevirtual   #52  <Method Object Gson.fromJson(String, Class)>
		//   13   26:astore_1        
				break MISSING_BLOCK_LABEL_41;
		//   14   27:goto            41
			}
			s = ((String) (GsonInstrumentation.fromJson((Gson)gson1, s, com/digits/sdk/android/DigitsSession)));
		//   15   30:aload_2         
		//   16   31:checkcast       #48  <Class Gson>
		//   17   34:aload_1         
		//   18   35:ldc1            #9   <Class DigitsSession>
		//   19   37:invokestatic    #57  <Method Object GsonInstrumentation.fromJson(Gson, String, Class)>
		//   20   40:astore_1        
			s = ((String) ((DigitsSession)s));
		//   21   41:aload_1         
		//   22   42:checkcast       #9   <Class DigitsSession>
		//   23   45:astore_1        
			if(((DigitsSession) (s)).phoneNumber != null)
				break MISSING_BLOCK_LABEL_73;
		//   24   46:aload_1         
		//   25   47:invokestatic    #61  <Method String DigitsSession.access$000(DigitsSession)>
		//   26   50:ifnonnull       73
			s = ((String) (new DigitsSession(((DigitsSession) (s)).getAuthToken(), ((DigitsSession) (s)).getId(), "")));
		//   27   53:new             #9   <Class DigitsSession>
		//   28   56:dup             
		//   29   57:aload_1         
		//   30   58:invokevirtual   #65  <Method AuthToken DigitsSession.getAuthToken()>
		//   31   61:aload_1         
		//   32   62:invokevirtual   #69  <Method long DigitsSession.getId()>
		//   33   65:ldc1            #71  <String "">
		//   34   67:invokespecial   #74  <Method void DigitsSession(AuthToken, long, String)>
		//   35   70:astore_1        
			return ((DigitsSession) (s));
		//   36   71:aload_1         
		//   37   72:areturn         
			return ((DigitsSession) (s));
		//   38   73:aload_1         
		//   39   74:areturn         
			s;
		//   40   75:astore_1        
			Fabric.getLogger().d("Digits", ((Exception) (s)).getMessage());
		//   41   76:invokestatic    #80  <Method Logger Fabric.getLogger()>
		//   42   79:ldc1            #82  <String "Digits">
		//   43   81:aload_1         
		//   44   82:invokevirtual   #86  <Method String Exception.getMessage()>
		//   45   85:invokeinterface #92  <Method void Logger.d(String, String)>
			return null;
		//   46   90:aconst_null     
		//   47   91:areturn         
		}

		public volatile Object deserialize(String s)
		{
			return ((Object) (deserialize(s)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #95  <Method DigitsSession deserialize(String)>
		//    3    5:areturn         
		}

		public String serialize(DigitsSession digitssession)
		{
			if(digitssession == null || digitssession.getAuthToken() == null)
				break MISSING_BLOCK_LABEL_55;
		//    0    0:aload_1         
		//    1    1:ifnull          55
		//    2    4:aload_1         
		//    3    5:invokevirtual   #65  <Method AuthToken DigitsSession.getAuthToken()>
		//    4    8:ifnull          55
			Gson gson1 = gson;
		//    5   11:aload_0         
		//    6   12:getfield        #35  <Field Gson gson>
		//    7   15:astore_2        
			if(!(gson1 instanceof Gson))
		//*   8   16:aload_2         
		//*   9   17:instanceof      #48  <Class Gson>
		//*  10   20:ifne            29
				return gson1.toJson(((Object) (digitssession)));
		//   11   23:aload_2         
		//   12   24:aload_1         
		//   13   25:invokevirtual   #100 <Method String Gson.toJson(Object)>
		//   14   28:areturn         
			digitssession = ((DigitsSession) (GsonInstrumentation.toJson((Gson)gson1, ((Object) (digitssession)))));
		//   15   29:aload_2         
		//   16   30:checkcast       #48  <Class Gson>
		//   17   33:aload_1         
		//   18   34:invokestatic    #103 <Method String GsonInstrumentation.toJson(Gson, Object)>
		//   19   37:astore_1        
			return ((String) (digitssession));
		//   20   38:aload_1         
		//   21   39:areturn         
			digitssession;
		//   22   40:astore_1        
			Fabric.getLogger().d("Digits", ((Exception) (digitssession)).getMessage());
		//   23   41:invokestatic    #80  <Method Logger Fabric.getLogger()>
		//   24   44:ldc1            #82  <String "Digits">
		//   25   46:aload_1         
		//   26   47:invokevirtual   #86  <Method String Exception.getMessage()>
		//   27   50:invokeinterface #92  <Method void Logger.d(String, String)>
			return "";
		//   28   55:ldc1            #71  <String "">
		//   29   57:areturn         
		}

		public volatile String serialize(Object obj)
		{
			return serialize((DigitsSession)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:checkcast       #9   <Class DigitsSession>
		//    3    5:invokevirtual   #105 <Method String serialize(DigitsSession)>
		//    4    8:areturn         
		}

		private final Gson gson = (new GsonBuilder()).registerTypeAdapter(com/twitter/sdk/android/core/AuthToken, ((Object) (new AuthTokenAdapter()))).create();

		public Serializer()
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #17  <Method void Object()>
		//    2    4:aload_0         
		//    3    5:new             #19  <Class GsonBuilder>
		//    4    8:dup             
		//    5    9:invokespecial   #20  <Method void GsonBuilder()>
		//    6   12:ldc1            #22  <Class AuthToken>
		//    7   14:new             #24  <Class AuthTokenAdapter>
		//    8   17:dup             
		//    9   18:invokespecial   #25  <Method void AuthTokenAdapter()>
		//   10   21:invokevirtual   #29  <Method GsonBuilder GsonBuilder.registerTypeAdapter(java.lang.reflect.Type, Object)>
		//   11   24:invokevirtual   #33  <Method Gson GsonBuilder.create()>
		//   12   27:putfield        #35  <Field Gson gson>
		//   13   30:return          
		}
	}


	public DigitsSession(AuthToken authtoken, long l, String s)
	{
		super(authtoken, l);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:invokespecial   #18  <Method void Session(AuthToken, long)>
		phoneNumber = s;
	//    4    6:aload_0         
	//    5    7:aload           4
	//    6    9:putfield        #20  <Field String phoneNumber>
	//    7   12:return          
	}

	public DigitsSession(OAuth2Token oauth2token)
	{
		this(((AuthToken) (oauth2token)), 0L, "");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_0        
	//    3    3:ldc1            #24  <String "">
	//    4    5:invokespecial   #26  <Method void DigitsSession(AuthToken, long, String)>
	//    5    8:return          
	}

	static DigitsSession create(DigitsSessionResponse digitssessionresponse, String s)
	{
		if(digitssessionresponse != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          46
		{
			if(s != null)
	//*   2    4:aload_1         
	//*   3    5:ifnull          36
				return new DigitsSession(((AuthToken) (new TwitterAuthToken(digitssessionresponse.token, digitssessionresponse.secret))), digitssessionresponse.userId, s);
	//    4    8:new             #2   <Class DigitsSession>
	//    5   11:dup             
	//    6   12:new             #32  <Class TwitterAuthToken>
	//    7   15:dup             
	//    8   16:aload_0         
	//    9   17:getfield        #37  <Field String DigitsSessionResponse.token>
	//   10   20:aload_0         
	//   11   21:getfield        #40  <Field String DigitsSessionResponse.secret>
	//   12   24:invokespecial   #43  <Method void TwitterAuthToken(String, String)>
	//   13   27:aload_0         
	//   14   28:getfield        #47  <Field long DigitsSessionResponse.userId>
	//   15   31:aload_1         
	//   16   32:invokespecial   #26  <Method void DigitsSession(AuthToken, long, String)>
	//   17   35:areturn         
			else
				throw new NullPointerException("phoneNumber must not be null");
	//   18   36:new             #49  <Class NullPointerException>
	//   19   39:dup             
	//   20   40:ldc1            #51  <String "phoneNumber must not be null">
	//   21   42:invokespecial   #54  <Method void NullPointerException(String)>
	//   22   45:athrow          
		} else
		{
			throw new NullPointerException("result must not be null");
	//   23   46:new             #49  <Class NullPointerException>
	//   24   49:dup             
	//   25   50:ldc1            #56  <String "result must not be null">
	//   26   52:invokespecial   #54  <Method void NullPointerException(String)>
	//   27   55:athrow          
		}
	}

	public static DigitsSession create(VerifyAccountResponse verifyaccountresponse)
	{
		if(verifyaccountresponse != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          24
			return new DigitsSession(((AuthToken) (verifyaccountresponse.token)), verifyaccountresponse.userId, verifyaccountresponse.phoneNumber);
	//    2    4:new             #2   <Class DigitsSession>
	//    3    7:dup             
	//    4    8:aload_0         
	//    5    9:getfield        #62  <Field TwitterAuthToken VerifyAccountResponse.token>
	//    6   12:aload_0         
	//    7   13:getfield        #63  <Field long VerifyAccountResponse.userId>
	//    8   16:aload_0         
	//    9   17:getfield        #64  <Field String VerifyAccountResponse.phoneNumber>
	//   10   20:invokespecial   #26  <Method void DigitsSession(AuthToken, long, String)>
	//   11   23:areturn         
		else
			throw new NullPointerException("verifyAccountResponse must not be null");
	//   12   24:new             #49  <Class NullPointerException>
	//   13   27:dup             
	//   14   28:ldc1            #66  <String "verifyAccountResponse must not be null">
	//   15   30:invokespecial   #54  <Method void NullPointerException(String)>
	//   16   33:athrow          
	}

	static DigitsSession create(Result result, String s)
	{
		if(result != null)
	//*   0    0:aload_0         
	//*   1    1:ifnull          217
		{
			if(result.data != null)
	//*   2    4:aload_0         
	//*   3    5:getfield        #73  <Field Object Result.data>
	//*   4    8:ifnull          207
			{
				if(result.response != null)
	//*   5   11:aload_0         
	//*   6   12:getfield        #77  <Field Response Result.response>
	//*   7   15:ifnull          197
				{
					if(s != null)
	//*   8   18:aload_1         
	//*   9   19:ifnull          187
					{
						Object obj = ((Object) (result.response.getHeaders()));
	//   10   22:aload_0         
	//   11   23:getfield        #77  <Field Response Result.response>
	//   12   26:invokevirtual   #83  <Method List Response.getHeaders()>
	//   13   29:astore          4
						String s2 = "";
	//   14   31:ldc1            #24  <String "">
	//   15   33:astore_3        
						String s1 = "";
	//   16   34:ldc1            #24  <String "">
	//   17   36:astore_2        
						Iterator iterator = ((List) (obj)).iterator();
	//   18   37:aload           4
	//   19   39:invokeinterface #89  <Method Iterator List.iterator()>
	//   20   44:astore          6
						String s3;
label0:
						do
						{
							do
							{
								obj = ((Object) (s2));
	//   21   46:aload_3         
	//   22   47:astore          4
								s3 = s1;
	//   23   49:aload_2         
	//   24   50:astore          5
								if(!iterator.hasNext())
									break label0;
	//   25   52:aload           6
	//   26   54:invokeinterface #95  <Method boolean Iterator.hasNext()>
	//   27   59:ifeq            157
								Header header = (Header)iterator.next();
	//   28   62:aload           6
	//   29   64:invokeinterface #99  <Method Object Iterator.next()>
	//   30   69:checkcast       #101 <Class Header>
	//   31   72:astore          7
								if("x-twitter-new-account-oauth-access-token".equals(((Object) (header.getName()))))
	//*  32   74:ldc1            #103 <String "x-twitter-new-account-oauth-access-token">
	//*  33   76:aload           7
	//*  34   78:invokevirtual   #107 <Method String Header.getName()>
	//*  35   81:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  36   84:ifeq            100
								{
									obj = ((Object) (header.getValue()));
	//   37   87:aload           7
	//   38   89:invokevirtual   #116 <Method String Header.getValue()>
	//   39   92:astore          4
									s3 = s1;
	//   40   94:aload_2         
	//   41   95:astore          5
								} else
	//*  42   97:goto            129
								{
									obj = ((Object) (s2));
	//   43  100:aload_3         
	//   44  101:astore          4
									s3 = s1;
	//   45  103:aload_2         
	//   46  104:astore          5
									if("x-twitter-new-account-oauth-secret".equals(((Object) (header.getName()))))
	//*  47  106:ldc1            #118 <String "x-twitter-new-account-oauth-secret">
	//*  48  108:aload           7
	//*  49  110:invokevirtual   #107 <Method String Header.getName()>
	//*  50  113:invokevirtual   #113 <Method boolean String.equals(Object)>
	//*  51  116:ifeq            129
									{
										s3 = header.getValue();
	//   52  119:aload           7
	//   53  121:invokevirtual   #116 <Method String Header.getValue()>
	//   54  124:astore          5
										obj = ((Object) (s2));
	//   55  126:aload_3         
	//   56  127:astore          4
									}
								}
								s2 = ((String) (obj));
	//   57  129:aload           4
	//   58  131:astore_3        
								s1 = s3;
	//   59  132:aload           5
	//   60  134:astore_2        
							} while(TextUtils.isEmpty(((CharSequence) (obj))));
	//   61  135:aload           4
	//   62  137:invokestatic    #124 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   63  140:ifne            46
							s2 = ((String) (obj));
	//   64  143:aload           4
	//   65  145:astore_3        
							s1 = s3;
	//   66  146:aload           5
	//   67  148:astore_2        
						} while(TextUtils.isEmpty(((CharSequence) (s3))));
	//   68  149:aload           5
	//   69  151:invokestatic    #124 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   70  154:ifne            46
						return new DigitsSession(((AuthToken) (new TwitterAuthToken(((String) (obj)), s3))), ((DigitsUser)result.data).id, s);
	//   71  157:new             #2   <Class DigitsSession>
	//   72  160:dup             
	//   73  161:new             #32  <Class TwitterAuthToken>
	//   74  164:dup             
	//   75  165:aload           4
	//   76  167:aload           5
	//   77  169:invokespecial   #43  <Method void TwitterAuthToken(String, String)>
	//   78  172:aload_0         
	//   79  173:getfield        #73  <Field Object Result.data>
	//   80  176:checkcast       #126 <Class DigitsUser>
	//   81  179:getfield        #129 <Field long DigitsUser.id>
	//   82  182:aload_1         
	//   83  183:invokespecial   #26  <Method void DigitsSession(AuthToken, long, String)>
	//   84  186:areturn         
					} else
					{
						throw new NullPointerException("phoneNumber must not be null");
	//   85  187:new             #49  <Class NullPointerException>
	//   86  190:dup             
	//   87  191:ldc1            #51  <String "phoneNumber must not be null">
	//   88  193:invokespecial   #54  <Method void NullPointerException(String)>
	//   89  196:athrow          
					}
				} else
				{
					throw new NullPointerException("result.response must not be null");
	//   90  197:new             #49  <Class NullPointerException>
	//   91  200:dup             
	//   92  201:ldc1            #131 <String "result.response must not be null">
	//   93  203:invokespecial   #54  <Method void NullPointerException(String)>
	//   94  206:athrow          
				}
			} else
			{
				throw new NullPointerException("result.data must not be null");
	//   95  207:new             #49  <Class NullPointerException>
	//   96  210:dup             
	//   97  211:ldc1            #133 <String "result.data must not be null">
	//   98  213:invokespecial   #54  <Method void NullPointerException(String)>
	//   99  216:athrow          
			}
		} else
		{
			throw new NullPointerException("result must not be null");
	//  100  217:new             #49  <Class NullPointerException>
	//  101  220:dup             
	//  102  221:ldc1            #56  <String "result must not be null">
	//  103  223:invokespecial   #54  <Method void NullPointerException(String)>
	//  104  226:athrow          
		}
	}

	private boolean isValidUserId(long l)
	{
		return !isLoggedOutUser() && l != -1L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #140 <Method boolean isLoggedOutUser()>
	//    2    4:ifne            17
	//    3    7:lload_1         
	//    4    8:ldc2w           #141 <Long -1L>
	//    5   11:lcmp            
	//    6   12:ifeq            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	private boolean isValidUserToken(AuthToken authtoken)
	{
		if(authtoken instanceof TwitterAuthToken)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #32  <Class TwitterAuthToken>
	//*   2    4:ifeq            28
		{
			authtoken = ((AuthToken) ((TwitterAuthToken)authtoken));
	//    3    7:aload_1         
	//    4    8:checkcast       #32  <Class TwitterAuthToken>
	//    5   11:astore_1        
			if(((TwitterAuthToken) (authtoken)).secret != null && ((TwitterAuthToken) (authtoken)).token != null)
	//*   6   12:aload_1         
	//*   7   13:getfield        #145 <Field String TwitterAuthToken.secret>
	//*   8   16:ifnull          28
	//*   9   19:aload_1         
	//*  10   20:getfield        #146 <Field String TwitterAuthToken.token>
	//*  11   23:ifnull          28
				return true;
	//   12   26:iconst_1        
	//   13   27:ireturn         
		}
		return false;
	//   14   28:iconst_0        
	//   15   29:ireturn         
	}

	public boolean equals(Object obj)
	{
		if(this == obj)
	//*   0    0:aload_0         
	//*   1    1:aload_1         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(obj != null)
	//*   5    7:aload_1         
	//*   6    8:ifnull          68
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #152 <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #152 <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			if(!super.equals(obj))
	//*  14   24:aload_0         
	//*  15   25:aload_1         
	//*  16   26:invokespecial   #153 <Method boolean Session.equals(Object)>
	//*  17   29:ifne            34
				return false;
	//   18   32:iconst_0        
	//   19   33:ireturn         
			obj = ((Object) ((DigitsSession)obj));
	//   20   34:aload_1         
	//   21   35:checkcast       #2   <Class DigitsSession>
	//   22   38:astore_1        
			String s = phoneNumber;
	//   23   39:aload_0         
	//   24   40:getfield        #20  <Field String phoneNumber>
	//   25   43:astore_2        
			if(s == null)
	//*  26   44:aload_2         
	//*  27   45:ifnonnull       59
				return ((DigitsSession) (obj)).phoneNumber == null;
	//   28   48:aload_1         
	//   29   49:getfield        #20  <Field String phoneNumber>
	//   30   52:ifnonnull       57
	//   31   55:iconst_1        
	//   32   56:ireturn         
	//   33   57:iconst_0        
	//   34   58:ireturn         
			else
				return s.equals(((Object) (((DigitsSession) (obj)).phoneNumber)));
	//   35   59:aload_2         
	//   36   60:aload_1         
	//   37   61:getfield        #20  <Field String phoneNumber>
	//   38   64:invokevirtual   #113 <Method boolean String.equals(Object)>
	//   39   67:ireturn         
		} else
		{
			return false;
	//   40   68:iconst_0        
	//   41   69:ireturn         
		}
	}

	public int hashCode()
	{
		int j = super.hashCode();
	//    0    0:aload_0         
	//    1    1:invokespecial   #157 <Method int Session.hashCode()>
	//    2    4:istore_2        
		String s = phoneNumber;
	//    3    5:aload_0         
	//    4    6:getfield        #20  <Field String phoneNumber>
	//    5    9:astore_3        
		int i;
		if(s != null)
	//*   6   10:aload_3         
	//*   7   11:ifnull          22
			i = s.hashCode();
	//    8   14:aload_3         
	//    9   15:invokevirtual   #158 <Method int String.hashCode()>
	//   10   18:istore_1        
		else
	//*  11   19:goto            24
			i = 0;
	//   12   22:iconst_0        
	//   13   23:istore_1        
		return j * 31 + i;
	//   14   24:iload_2         
	//   15   25:bipush          31
	//   16   27:imul            
	//   17   28:iload_1         
	//   18   29:iadd            
	//   19   30:ireturn         
	}

	public boolean isLoggedOutUser()
	{
		return getId() == 0L;
	//    0    0:aload_0         
	//    1    1:invokevirtual   #162 <Method long getId()>
	//    2    4:lconst_0        
	//    3    5:lcmp            
	//    4    6:ifne            11
	//    5    9:iconst_1        
	//    6   10:ireturn         
	//    7   11:iconst_0        
	//    8   12:ireturn         
	}

	public boolean isValidUser()
	{
		return isValidUserId(getId()) && isValidUserToken(getAuthToken());
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:invokevirtual   #162 <Method long getId()>
	//    3    5:invokespecial   #165 <Method boolean isValidUserId(long)>
	//    4    8:ifeq            24
	//    5   11:aload_0         
	//    6   12:aload_0         
	//    7   13:invokevirtual   #169 <Method AuthToken getAuthToken()>
	//    8   16:invokespecial   #171 <Method boolean isValidUserToken(AuthToken)>
	//    9   19:ifeq            24
	//   10   22:iconst_1        
	//   11   23:ireturn         
	//   12   24:iconst_0        
	//   13   25:ireturn         
	}

	private final String phoneNumber;


/*
	static String access$000(DigitsSession digitssession)
	{
		return digitssession.phoneNumber;
	//    0    0:aload_0         
	//    1    1:getfield        #20  <Field String phoneNumber>
	//    2    4:areturn         
	}

*/
}
