// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.gigya.socialize.android.managers;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.gigya.socialize.android.*;
import com.gigya.socialize.android.keyStore.BaseKey;
import com.gigya.socialize.android.log.GigyaLog;
import com.gigya.socialize.android.model.Environment;
import com.gigya.socialize.android.utils.GSEncryptedPrefs;
import com.gigya.socialize.android.utils.Utils;
import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import org.json.JSONException;
import org.json.JSONObject;

public class SessionManager
{
	public static final class SessionEncryption extends Enum
	{

		public static SessionEncryption valueOf(String s)
		{
			return (SessionEncryption)Enum.valueOf(com/gigya/socialize/android/managers/SessionManager$SessionEncryption, s);
		//    0    0:ldc1            #2   <Class SessionManager$SessionEncryption>
		//    1    2:aload_0         
		//    2    3:invokestatic    #35  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class SessionManager$SessionEncryption>
		//    4    9:areturn         
		}

		public static SessionEncryption[] values()
		{
			return (SessionEncryption[])((SessionEncryption []) ($VALUES)).clone();
		//    0    0:getstatic       #27  <Field SessionManager$SessionEncryption[] $VALUES>
		//    1    3:invokevirtual   #42  <Method Object _5B_Lcom.gigya.socialize.android.managers.SessionManager$SessionEncryption_3B_.clone()>
		//    2    6:checkcast       #38  <Class SessionManager$SessionEncryption[]>
		//    3    9:areturn         
		}

		private static final SessionEncryption $VALUES[];
		public static final SessionEncryption DEFAULT;
		public static final SessionEncryption FINGERPRINT;

		static 
		{
			DEFAULT = new SessionEncryption("DEFAULT", 0);
		//    0    0:new             #2   <Class SessionManager$SessionEncryption>
		//    1    3:dup             
		//    2    4:ldc1            #16  <String "DEFAULT">
		//    3    6:iconst_0        
		//    4    7:invokespecial   #20  <Method void SessionManager$SessionEncryption(String, int)>
		//    5   10:putstatic       #22  <Field SessionManager$SessionEncryption DEFAULT>
			FINGERPRINT = new SessionEncryption("FINGERPRINT", 1);
		//    6   13:new             #2   <Class SessionManager$SessionEncryption>
		//    7   16:dup             
		//    8   17:ldc1            #23  <String "FINGERPRINT">
		//    9   19:iconst_1        
		//   10   20:invokespecial   #20  <Method void SessionManager$SessionEncryption(String, int)>
		//   11   23:putstatic       #25  <Field SessionManager$SessionEncryption FINGERPRINT>
			$VALUES = (new SessionEncryption[] {
				DEFAULT, FINGERPRINT
			});
		//   12   26:iconst_2        
		//   13   27:anewarray       SessionEncryption[]
		//   14   30:dup             
		//   15   31:iconst_0        
		//   16   32:getstatic       #22  <Field SessionManager$SessionEncryption DEFAULT>
		//   17   35:aastore         
		//   18   36:dup             
		//   19   37:iconst_1        
		//   20   38:getstatic       #25  <Field SessionManager$SessionEncryption FINGERPRINT>
		//   21   41:aastore         
		//   22   42:putstatic       #27  <Field SessionManager$SessionEncryption[] $VALUES>
		//*  23   45:return          
		}

		private SessionEncryption(String s, int i)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #29  <Method void Enum(String, int)>
		//    4    6:return          
		}
	}


	public SessionManager()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #28  <Method void Object()>
	//    2    4:return          
	}

	private String AESDecrypt(String s)
	{
		GigyaLog.i("SessionManager", "AESDecrypt");
	//    0    0:ldc1            #17  <String "SessionManager">
	//    1    2:ldc1            #32  <String "AESDecrypt">
	//    2    4:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		javax.crypto.SecretKey secretkey = GSEncryptedPrefs.getInstance(GSAPI.getInstance().getContext()).getSecretKey();
	//    3    7:invokestatic    #44  <Method GSAPI GSAPI.getInstance()>
	//    4   10:invokevirtual   #48  <Method Context GSAPI.getContext()>
	//    5   13:invokestatic    #53  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(Context)>
	//    6   16:invokevirtual   #57  <Method javax.crypto.SecretKey GSEncryptedPrefs.getSecretKey()>
	//    7   19:astore_2        
		Cipher cipher = Cipher.getInstance("AES");
	//    8   20:ldc1            #59  <String "AES">
	//    9   22:invokestatic    #64  <Method Cipher Cipher.getInstance(String)>
	//   10   25:astore_3        
		cipher.init(2, ((java.security.Key) (secretkey)));
	//   11   26:aload_3         
	//   12   27:iconst_2        
	//   13   28:aload_2         
	//   14   29:invokevirtual   #68  <Method void Cipher.init(int, java.security.Key)>
		return new String(cipher.doFinal(Utils.stringToBytes(s)));
	//   15   32:new             #70  <Class String>
	//   16   35:dup             
	//   17   36:aload_3         
	//   18   37:aload_1         
	//   19   38:invokestatic    #76  <Method byte[] Utils.stringToBytes(String)>
	//   20   41:invokevirtual   #80  <Method byte[] Cipher.doFinal(byte[])>
	//   21   44:invokespecial   #83  <Method void String(byte[])>
	//   22   47:areturn         
	}

	private String AESEncrypt(String s)
	{
		GigyaLog.i("SessionManager", "AESEncrypt");
	//    0    0:ldc1            #17  <String "SessionManager">
	//    1    2:ldc1            #85  <String "AESEncrypt">
	//    2    4:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		javax.crypto.SecretKey secretkey = GSEncryptedPrefs.getInstance(GSAPI.getInstance().getContext()).getSecretKey();
	//    3    7:invokestatic    #44  <Method GSAPI GSAPI.getInstance()>
	//    4   10:invokevirtual   #48  <Method Context GSAPI.getContext()>
	//    5   13:invokestatic    #53  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(Context)>
	//    6   16:invokevirtual   #57  <Method javax.crypto.SecretKey GSEncryptedPrefs.getSecretKey()>
	//    7   19:astore_2        
		Cipher cipher = Cipher.getInstance("AES");
	//    8   20:ldc1            #59  <String "AES">
	//    9   22:invokestatic    #64  <Method Cipher Cipher.getInstance(String)>
	//   10   25:astore_3        
		cipher.init(1, ((java.security.Key) (secretkey)));
	//   11   26:aload_3         
	//   12   27:iconst_1        
	//   13   28:aload_2         
	//   14   29:invokevirtual   #68  <Method void Cipher.init(int, java.security.Key)>
		return Utils.bytesToString(cipher.doFinal(s.getBytes()));
	//   15   32:aload_3         
	//   16   33:aload_1         
	//   17   34:invokevirtual   #89  <Method byte[] String.getBytes()>
	//   18   37:invokevirtual   #80  <Method byte[] Cipher.doFinal(byte[])>
	//   19   40:invokestatic    #93  <Method String Utils.bytesToString(byte[])>
	//   20   43:areturn         
	}

	private boolean checkLegacySession(Context context)
	{
		return TextUtils.isEmpty(((CharSequence) (context.getSharedPreferences("GSLIB", 0).getString("session.Token", "")))) ^ true;
	//    0    0:aload_1         
	//    1    1:ldc1            #97  <String "GSLIB">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #103 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:ldc1            #105 <String "session.Token">
	//    5    9:ldc1            #107 <String "">
	//    6   11:invokeinterface #113 <Method String SharedPreferences.getString(String, String)>
	//    7   16:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//    8   19:iconst_1        
	//    9   20:ixor            
	//   10   21:ireturn         
	}

	private void cleanLegacySession(SharedPreferences sharedpreferences)
	{
		sharedpreferences = ((SharedPreferences) (sharedpreferences.edit()));
	//    0    0:aload_1         
	//    1    1:invokeinterface #125 <Method android.content.SharedPreferences$Editor SharedPreferences.edit()>
	//    2    6:astore_1        
		((android.content.SharedPreferences.Editor) (sharedpreferences)).remove("ucid");
	//    3    7:aload_1         
	//    4    8:ldc1            #127 <String "ucid">
	//    5   10:invokeinterface #133 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//    6   15:pop             
		((android.content.SharedPreferences.Editor) (sharedpreferences)).remove("gmid");
	//    7   16:aload_1         
	//    8   17:ldc1            #135 <String "gmid">
	//    9   19:invokeinterface #133 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   10   24:pop             
		((android.content.SharedPreferences.Editor) (sharedpreferences)).remove("lastLoginProvider");
	//   11   25:aload_1         
	//   12   26:ldc1            #137 <String "lastLoginProvider">
	//   13   28:invokeinterface #133 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   14   33:pop             
		((android.content.SharedPreferences.Editor) (sharedpreferences)).remove("session.Token");
	//   15   34:aload_1         
	//   16   35:ldc1            #105 <String "session.Token">
	//   17   37:invokeinterface #133 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   18   42:pop             
		((android.content.SharedPreferences.Editor) (sharedpreferences)).remove("session.Secret");
	//   19   43:aload_1         
	//   20   44:ldc1            #139 <String "session.Secret">
	//   21   46:invokeinterface #133 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   22   51:pop             
		((android.content.SharedPreferences.Editor) (sharedpreferences)).remove("tsOffset");
	//   23   52:aload_1         
	//   24   53:ldc1            #141 <String "tsOffset">
	//   25   55:invokeinterface #133 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   26   60:pop             
		((android.content.SharedPreferences.Editor) (sharedpreferences)).remove("session.ExpirationTime");
	//   27   61:aload_1         
	//   28   62:ldc1            #143 <String "session.ExpirationTime">
	//   29   64:invokeinterface #133 <Method android.content.SharedPreferences$Editor android.content.SharedPreferences$Editor.remove(String)>
	//   30   69:pop             
		((android.content.SharedPreferences.Editor) (sharedpreferences)).commit();
	//   31   70:aload_1         
	//   32   71:invokeinterface #147 <Method boolean android.content.SharedPreferences$Editor.commit()>
	//   33   76:pop             
	//   34   77:return          
	}

	private GSSession createSessionFromString(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore          6
		stringbuilder.append("createSessionFromString ");
	//    4    9:aload           6
	//    5   11:ldc1            #156 <String "createSessionFromString ">
	//    6   13:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   16:pop             
		stringbuilder.append(s);
	//    8   17:aload           6
	//    9   19:aload_1         
	//   10   20:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   11   23:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   12   24:ldc1            #17  <String "SessionManager">
	//   13   26:aload           6
	//   14   28:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   15   31:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		mEnvironment = new Environment();
	//   16   34:aload_0         
	//   17   35:new             #166 <Class Environment>
	//   18   38:dup             
	//   19   39:invokespecial   #167 <Method void Environment()>
	//   20   42:putfield        #169 <Field Environment mEnvironment>
		long l1;
		String s1;
		String s2;
		String s3;
		s = ((String) (new JSONObject(s)));
	//   21   45:new             #171 <Class JSONObject>
	//   22   48:dup             
	//   23   49:aload_1         
	//   24   50:invokespecial   #174 <Method void JSONObject(String)>
	//   25   53:astore_1        
		s1 = ((JSONObject) (s)).optString("ucid", ((String) (null)));
	//   26   54:aload_1         
	//   27   55:ldc1            #127 <String "ucid">
	//   28   57:aconst_null     
	//   29   58:invokevirtual   #177 <Method String JSONObject.optString(String, String)>
	//   30   61:astore          6
		s2 = ((JSONObject) (s)).optString("gmid", ((String) (null)));
	//   31   63:aload_1         
	//   32   64:ldc1            #135 <String "gmid">
	//   33   66:aconst_null     
	//   34   67:invokevirtual   #177 <Method String JSONObject.optString(String, String)>
	//   35   70:astore          7
		s3 = ((JSONObject) (s)).optString("lastLoginProvider", ((String) (null)));
	//   36   72:aload_1         
	//   37   73:ldc1            #137 <String "lastLoginProvider">
	//   38   75:aconst_null     
	//   39   76:invokevirtual   #177 <Method String JSONObject.optString(String, String)>
	//   40   79:astore          8
		String s4 = ((JSONObject) (s)).optString("sessionToken", ((String) (null)));
	//   41   81:aload_1         
	//   42   82:ldc1            #179 <String "sessionToken">
	//   43   84:aconst_null     
	//   44   85:invokevirtual   #177 <Method String JSONObject.optString(String, String)>
	//   45   88:astore          9
		String s5 = ((JSONObject) (s)).optString("sessionSecret", ((String) (null)));
	//   46   90:aload_1         
	//   47   91:ldc1            #181 <String "sessionSecret">
	//   48   93:aconst_null     
	//   49   94:invokevirtual   #177 <Method String JSONObject.optString(String, String)>
	//   50   97:astore          10
		long l = ((JSONObject) (s)).optLong("expirationTime", -1L);
	//   51   99:aload_1         
	//   52  100:ldc1            #183 <String "expirationTime">
	//   53  102:ldc2w           #184 <Long -1L>
	//   54  105:invokevirtual   #189 <Method long JSONObject.optLong(String, long)>
	//   55  108:lstore_2        
		l1 = ((JSONObject) (s)).optLong("tsOffset", 0L);
	//   56  109:aload_1         
	//   57  110:ldc1            #141 <String "tsOffset">
	//   58  112:lconst_0        
	//   59  113:invokevirtual   #189 <Method long JSONObject.optLong(String, long)>
	//   60  116:lstore          4
		s = ((String) (new GSSession(s4, s5, l)));
	//   61  118:new             #191 <Class GSSession>
	//   62  121:dup             
	//   63  122:aload           9
	//   64  124:aload           10
	//   65  126:lload_2         
	//   66  127:invokespecial   #194 <Method void GSSession(String, String, long)>
	//   67  130:astore_1        
		mEnvironment.setTSOffset(l1);
	//   68  131:aload_0         
	//   69  132:getfield        #169 <Field Environment mEnvironment>
	//   70  135:lload           4
	//   71  137:invokevirtual   #198 <Method void Environment.setTSOffset(long)>
		mEnvironment.setUCID(s1);
	//   72  140:aload_0         
	//   73  141:getfield        #169 <Field Environment mEnvironment>
	//   74  144:aload           6
	//   75  146:invokevirtual   #201 <Method void Environment.setUCID(String)>
		mEnvironment.setGMID(s2);
	//   76  149:aload_0         
	//   77  150:getfield        #169 <Field Environment mEnvironment>
	//   78  153:aload           7
	//   79  155:invokevirtual   #204 <Method void Environment.setGMID(String)>
		mEnvironment.setLastLoginProvider(s3);
	//   80  158:aload_0         
	//   81  159:getfield        #169 <Field Environment mEnvironment>
	//   82  162:aload           8
	//   83  164:invokevirtual   #207 <Method void Environment.setLastLoginProvider(String)>
		return ((GSSession) (s));
	//   84  167:aload_1         
	//   85  168:areturn         
		JSONException jsonexception;
		jsonexception;
	//   86  169:astore          6
		break MISSING_BLOCK_LABEL_178;
	//   87  171:goto            178
		jsonexception;
	//   88  174:astore          6
		s = null;
	//   89  176:aconst_null     
	//   90  177:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder();
	//   91  178:new             #153 <Class StringBuilder>
	//   92  181:dup             
	//   93  182:invokespecial   #154 <Method void StringBuilder()>
	//   94  185:astore          7
		stringbuilder1.append("Error: ");
	//   95  187:aload           7
	//   96  189:ldc1            #209 <String "Error: ">
	//   97  191:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   98  194:pop             
		stringbuilder1.append(jsonexception.getMessage());
	//   99  195:aload           7
	//  100  197:aload           6
	//  101  199:invokevirtual   #212 <Method String JSONException.getMessage()>
	//  102  202:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  103  205:pop             
		GigyaLog.e("SessionManager", stringbuilder1.toString());
	//  104  206:ldc1            #17  <String "SessionManager">
	//  105  208:aload           7
	//  106  210:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  107  213:invokestatic    #215 <Method void GigyaLog.e(String, String)>
		return ((GSSession) (s));
	//  108  216:aload_1         
	//  109  217:areturn         
	}

	private boolean loadLegacySession(Context context)
	{
		context = ((Context) (context.getSharedPreferences("GSLIB", 0)));
	//    0    0:aload_1         
	//    1    1:ldc1            #97  <String "GSLIB">
	//    2    3:iconst_0        
	//    3    4:invokevirtual   #103 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//    4    7:astore_1        
		mEnvironment.setUCID(((SharedPreferences) (context)).getString("ucid", ((String) (null))));
	//    5    8:aload_0         
	//    6    9:getfield        #169 <Field Environment mEnvironment>
	//    7   12:aload_1         
	//    8   13:ldc1            #127 <String "ucid">
	//    9   15:aconst_null     
	//   10   16:invokeinterface #113 <Method String SharedPreferences.getString(String, String)>
	//   11   21:invokevirtual   #201 <Method void Environment.setUCID(String)>
		mEnvironment.setGMID(((SharedPreferences) (context)).getString("gmid", ((String) (null))));
	//   12   24:aload_0         
	//   13   25:getfield        #169 <Field Environment mEnvironment>
	//   14   28:aload_1         
	//   15   29:ldc1            #135 <String "gmid">
	//   16   31:aconst_null     
	//   17   32:invokeinterface #113 <Method String SharedPreferences.getString(String, String)>
	//   18   37:invokevirtual   #204 <Method void Environment.setGMID(String)>
		mEnvironment.setLastLoginProvider(((SharedPreferences) (context)).getString("lastLoginProvider", ""));
	//   19   40:aload_0         
	//   20   41:getfield        #169 <Field Environment mEnvironment>
	//   21   44:aload_1         
	//   22   45:ldc1            #137 <String "lastLoginProvider">
	//   23   47:ldc1            #107 <String "">
	//   24   49:invokeinterface #113 <Method String SharedPreferences.getString(String, String)>
	//   25   54:invokevirtual   #207 <Method void Environment.setLastLoginProvider(String)>
		mEnvironment.setTSOffset(((SharedPreferences) (context)).getLong("tsOffset", 0L));
	//   26   57:aload_0         
	//   27   58:getfield        #169 <Field Environment mEnvironment>
	//   28   61:aload_1         
	//   29   62:ldc1            #141 <String "tsOffset">
	//   30   64:lconst_0        
	//   31   65:invokeinterface #219 <Method long SharedPreferences.getLong(String, long)>
	//   32   70:invokevirtual   #198 <Method void Environment.setTSOffset(long)>
		mGSSession.setToken(((SharedPreferences) (context)).getString("session.Token", ((String) (null))));
	//   33   73:aload_0         
	//   34   74:getfield        #221 <Field GSSession mGSSession>
	//   35   77:aload_1         
	//   36   78:ldc1            #105 <String "session.Token">
	//   37   80:aconst_null     
	//   38   81:invokeinterface #113 <Method String SharedPreferences.getString(String, String)>
	//   39   86:invokevirtual   #224 <Method void GSSession.setToken(String)>
		mGSSession.setSecret(((SharedPreferences) (context)).getString("session.Secret", ((String) (null))));
	//   40   89:aload_0         
	//   41   90:getfield        #221 <Field GSSession mGSSession>
	//   42   93:aload_1         
	//   43   94:ldc1            #139 <String "session.Secret">
	//   44   96:aconst_null     
	//   45   97:invokeinterface #113 <Method String SharedPreferences.getString(String, String)>
	//   46  102:invokevirtual   #227 <Method void GSSession.setSecret(String)>
		mGSSession.setExpirationTime(((SharedPreferences) (context)).getLong("session.ExpirationTime", 0L));
	//   47  105:aload_0         
	//   48  106:getfield        #221 <Field GSSession mGSSession>
	//   49  109:aload_1         
	//   50  110:ldc1            #143 <String "session.ExpirationTime">
	//   51  112:lconst_0        
	//   52  113:invokeinterface #219 <Method long SharedPreferences.getLong(String, long)>
	//   53  118:invokevirtual   #230 <Method void GSSession.setExpirationTime(long)>
		if(TextUtils.isEmpty(((CharSequence) (mEnvironment.getGMID()))) && TextUtils.isEmpty(((CharSequence) (mGSSession.getToken()))) && TextUtils.isEmpty(((CharSequence) (mGSSession.getSecret()))))
	//*  54  121:aload_0         
	//*  55  122:getfield        #169 <Field Environment mEnvironment>
	//*  56  125:invokevirtual   #233 <Method String Environment.getGMID()>
	//*  57  128:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  58  131:ifeq            165
	//*  59  134:aload_0         
	//*  60  135:getfield        #221 <Field GSSession mGSSession>
	//*  61  138:invokevirtual   #236 <Method String GSSession.getToken()>
	//*  62  141:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  63  144:ifeq            165
	//*  64  147:aload_0         
	//*  65  148:getfield        #221 <Field GSSession mGSSession>
	//*  66  151:invokevirtual   #239 <Method String GSSession.getSecret()>
	//*  67  154:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  68  157:ifne            163
	//*  69  160:goto            165
		{
			return false;
	//   70  163:iconst_0        
	//   71  164:ireturn         
		} else
		{
			cleanLegacySession(((SharedPreferences) (context)));
	//   72  165:aload_0         
	//   73  166:aload_1         
	//   74  167:invokespecial   #241 <Method void cleanLegacySession(SharedPreferences)>
			return true;
	//   75  170:iconst_1        
	//   76  171:ireturn         
		}
	}

	private String toJSONString()
	{
		GigyaLog.i("SessionManager", "toJSONString");
	//    0    0:ldc1            #17  <String "SessionManager">
	//    1    2:ldc1            #243 <String "toJSONString">
	//    2    4:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		Object obj = ((Object) (new JSONObject()));
	//    3    7:new             #171 <Class JSONObject>
	//    4   10:dup             
	//    5   11:invokespecial   #244 <Method void JSONObject()>
	//    6   14:astore_1        
		try
		{
			((JSONObject) (obj)).put("ucid", ((Object) (mEnvironment.getUCID())));
	//    7   15:aload_1         
	//    8   16:ldc1            #127 <String "ucid">
	//    9   18:aload_0         
	//   10   19:getfield        #169 <Field Environment mEnvironment>
	//   11   22:invokevirtual   #247 <Method String Environment.getUCID()>
	//   12   25:invokevirtual   #251 <Method JSONObject JSONObject.put(String, Object)>
	//   13   28:pop             
			((JSONObject) (obj)).put("gmid", ((Object) (mEnvironment.getGMID())));
	//   14   29:aload_1         
	//   15   30:ldc1            #135 <String "gmid">
	//   16   32:aload_0         
	//   17   33:getfield        #169 <Field Environment mEnvironment>
	//   18   36:invokevirtual   #233 <Method String Environment.getGMID()>
	//   19   39:invokevirtual   #251 <Method JSONObject JSONObject.put(String, Object)>
	//   20   42:pop             
			((JSONObject) (obj)).put("lastLoginProvider", ((Object) (mEnvironment.getLastLoginProvider())));
	//   21   43:aload_1         
	//   22   44:ldc1            #137 <String "lastLoginProvider">
	//   23   46:aload_0         
	//   24   47:getfield        #169 <Field Environment mEnvironment>
	//   25   50:invokevirtual   #254 <Method String Environment.getLastLoginProvider()>
	//   26   53:invokevirtual   #251 <Method JSONObject JSONObject.put(String, Object)>
	//   27   56:pop             
			((JSONObject) (obj)).put("sessionToken", ((Object) (mGSSession.getToken())));
	//   28   57:aload_1         
	//   29   58:ldc1            #179 <String "sessionToken">
	//   30   60:aload_0         
	//   31   61:getfield        #221 <Field GSSession mGSSession>
	//   32   64:invokevirtual   #236 <Method String GSSession.getToken()>
	//   33   67:invokevirtual   #251 <Method JSONObject JSONObject.put(String, Object)>
	//   34   70:pop             
			((JSONObject) (obj)).put("sessionSecret", ((Object) (mGSSession.getSecret())));
	//   35   71:aload_1         
	//   36   72:ldc1            #181 <String "sessionSecret">
	//   37   74:aload_0         
	//   38   75:getfield        #221 <Field GSSession mGSSession>
	//   39   78:invokevirtual   #239 <Method String GSSession.getSecret()>
	//   40   81:invokevirtual   #251 <Method JSONObject JSONObject.put(String, Object)>
	//   41   84:pop             
			((JSONObject) (obj)).put("expirationTime", mGSSession.getExpirationTime());
	//   42   85:aload_1         
	//   43   86:ldc1            #183 <String "expirationTime">
	//   44   88:aload_0         
	//   45   89:getfield        #221 <Field GSSession mGSSession>
	//   46   92:invokevirtual   #258 <Method long GSSession.getExpirationTime()>
	//   47   95:invokevirtual   #261 <Method JSONObject JSONObject.put(String, long)>
	//   48   98:pop             
			((JSONObject) (obj)).put("tsOffset", mEnvironment.getTSOffset());
	//   49   99:aload_1         
	//   50  100:ldc1            #141 <String "tsOffset">
	//   51  102:aload_0         
	//   52  103:getfield        #169 <Field Environment mEnvironment>
	//   53  106:invokevirtual   #264 <Method long Environment.getTSOffset()>
	//   54  109:invokevirtual   #261 <Method JSONObject JSONObject.put(String, long)>
	//   55  112:pop             
			obj = ((Object) (((JSONObject) (obj)).toString()));
	//   56  113:aload_1         
	//   57  114:invokevirtual   #265 <Method String JSONObject.toString()>
	//   58  117:astore_1        
		}
	//*  59  118:aload_1         
	//*  60  119:areturn         
		catch(JSONException jsonexception)
	//*  61  120:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   62  121:new             #153 <Class StringBuilder>
	//   63  124:dup             
	//   64  125:invokespecial   #154 <Method void StringBuilder()>
	//   65  128:astore_2        
			stringbuilder.append("Error: ");
	//   66  129:aload_2         
	//   67  130:ldc1            #209 <String "Error: ">
	//   68  132:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   69  135:pop             
			stringbuilder.append(jsonexception.getMessage());
	//   70  136:aload_2         
	//   71  137:aload_1         
	//   72  138:invokevirtual   #212 <Method String JSONException.getMessage()>
	//   73  141:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   74  144:pop             
			GigyaLog.e("SessionManager", stringbuilder.toString());
	//   75  145:ldc1            #17  <String "SessionManager">
	//   76  147:aload_2         
	//   77  148:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   78  151:invokestatic    #215 <Method void GigyaLog.e(String, String)>
			return "";
	//   79  154:ldc1            #107 <String "">
	//   80  156:areturn         
		}
		return ((String) (obj));
	}

	public void clearSession(boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("clearSession:includingDisk ");
	//    4    8:aload_2         
	//    5    9:ldc2            #269 <String "clearSession:includingDisk ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(flag);
	//    8   16:aload_2         
	//    9   17:iload_1         
	//   10   18:invokevirtual   #272 <Method StringBuilder StringBuilder.append(boolean)>
	//   11   21:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   12   22:ldc1            #17  <String "SessionManager">
	//   13   24:aload_2         
	//   14   25:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		mGSSession = null;
	//   16   31:aload_0         
	//   17   32:aconst_null     
	//   18   33:putfield        #221 <Field GSSession mGSSession>
		if(flag)
	//*  19   36:iload_1         
	//*  20   37:ifeq            62
		{
			GSEncryptedPrefs gsencryptedprefs = GSEncryptedPrefs.getInstance(GSAPI.getInstance().getContext());
	//   21   40:invokestatic    #44  <Method GSAPI GSAPI.getInstance()>
	//   22   43:invokevirtual   #48  <Method Context GSAPI.getContext()>
	//   23   46:invokestatic    #53  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(Context)>
	//   24   49:astore_2        
			gsencryptedprefs.deleteEntity("GS_PREFS");
	//   25   50:aload_2         
	//   26   51:ldc1            #11  <String "GS_PREFS">
	//   27   53:invokevirtual   #275 <Method void GSEncryptedPrefs.deleteEntity(String)>
			gsencryptedprefs.deleteEntity("sessionProtectionType");
	//   28   56:aload_2         
	//   29   57:ldc1            #14  <String "sessionProtectionType">
	//   30   59:invokevirtual   #275 <Method void GSEncryptedPrefs.deleteEntity(String)>
		}
	//   31   62:return          
	}

	public void fingerprintOptIn(BaseKey basekey, ICallback icallback)
	{
		GigyaLog.i("SessionManager", "fingerprintOptIn");
	//    0    0:ldc1            #17  <String "SessionManager">
	//    1    2:ldc2            #280 <String "fingerprintOptIn">
	//    2    5:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		Object obj;
		try
		{
			if(mSessionEncryption == SessionEncryption.FINGERPRINT)
	//*   3    8:aload_0         
	//*   4    9:getfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
	//*   5   12:getstatic       #285 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.FINGERPRINT>
	//*   6   15:if_acmpne       29
			{
				GigyaLog.d("SessionManager", "Fingerprint already opt-in");
	//    7   18:ldc1            #17  <String "SessionManager">
	//    8   20:ldc2            #287 <String "Fingerprint already opt-in">
	//    9   23:invokestatic    #290 <Method void GigyaLog.d(String, String)>
				break MISSING_BLOCK_LABEL_130;
	//   10   26:goto            130
			}
		}
	//*  11   29:aload_0         
	//*  12   30:getstatic       #285 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.FINGERPRINT>
	//*  13   33:putfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
	//*  14   36:aload_1         
	//*  15   37:aload_0         
	//*  16   38:invokespecial   #292 <Method String toJSONString()>
	//*  17   41:invokevirtual   #297 <Method String BaseKey.encrypt(String)>
	//*  18   44:astore_1        
	//*  19   45:new             #153 <Class StringBuilder>
	//*  20   48:dup             
	//*  21   49:invokespecial   #154 <Method void StringBuilder()>
	//*  22   52:astore_3        
	//*  23   53:aload_3         
	//*  24   54:ldc2            #299 <String "fingerprintOptIn:encryptedSession ">
	//*  25   57:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  26   60:pop             
	//*  27   61:aload_3         
	//*  28   62:aload_1         
	//*  29   63:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  30   66:pop             
	//*  31   67:aload_3         
	//*  32   68:ldc2            #301 <String " Size: ">
	//*  33   71:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  34   74:pop             
	//*  35   75:aload_3         
	//*  36   76:aload_1         
	//*  37   77:invokevirtual   #305 <Method int String.length()>
	//*  38   80:invokevirtual   #308 <Method StringBuilder StringBuilder.append(int)>
	//*  39   83:pop             
	//*  40   84:ldc1            #17  <String "SessionManager">
	//*  41   86:aload_3         
	//*  42   87:invokevirtual   #164 <Method String StringBuilder.toString()>
	//*  43   90:invokestatic    #38  <Method void GigyaLog.i(String, String)>
	//*  44   93:ldc1            #17  <String "SessionManager">
	//*  45   95:ldc2            #310 <String "fingerprintOptIn:caching the encrypted session">
	//*  46   98:invokestatic    #38  <Method void GigyaLog.i(String, String)>
	//*  47  101:invokestatic    #44  <Method GSAPI GSAPI.getInstance()>
	//*  48  104:invokevirtual   #48  <Method Context GSAPI.getContext()>
	//*  49  107:invokestatic    #53  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(Context)>
	//*  50  110:astore_3        
	//*  51  111:aload_3         
	//*  52  112:ldc1            #11  <String "GS_PREFS">
	//*  53  114:aload_1         
	//*  54  115:invokevirtual   #313 <Method void GSEncryptedPrefs.setString(String, String)>
	//*  55  118:aload_3         
	//*  56  119:ldc1            #14  <String "sessionProtectionType">
	//*  57  121:getstatic       #285 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.FINGERPRINT>
	//*  58  124:invokevirtual   #316 <Method String SessionManager$SessionEncryption.name()>
	//*  59  127:invokevirtual   #313 <Method void GSEncryptedPrefs.setString(String, String)>
	//*  60  130:aload_2         
	//*  61  131:invokeinterface #321 <Method void ICallback.onSuccess()>
	//*  62  136:return          
		// Misplaced declaration of an exception variable
		catch(BaseKey basekey)
	//*  63  137:astore_1        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   64  138:new             #153 <Class StringBuilder>
	//   65  141:dup             
	//   66  142:invokespecial   #154 <Method void StringBuilder()>
	//   67  145:astore_3        
			stringbuilder.append("Error: ");
	//   68  146:aload_3         
	//   69  147:ldc1            #209 <String "Error: ">
	//   70  149:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   71  152:pop             
			stringbuilder.append(((com.gigya.socialize.android.keyStore.BaseKey.KeyException) (basekey)).getMessage());
	//   72  153:aload_3         
	//   73  154:aload_1         
	//   74  155:invokevirtual   #322 <Method String com.gigya.socialize.android.keyStore.BaseKey$KeyException.getMessage()>
	//   75  158:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   76  161:pop             
			GigyaLog.e("SessionManager", stringbuilder.toString());
	//   77  162:ldc1            #17  <String "SessionManager">
	//   78  164:aload_3         
	//   79  165:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   80  168:invokestatic    #215 <Method void GigyaLog.e(String, String)>
			icallback.onError(((Throwable) (new GigyaException("Error: session encryption failed", ((Throwable) (basekey))))));
	//   81  171:aload_2         
	//   82  172:new             #324 <Class GigyaException>
	//   83  175:dup             
	//   84  176:ldc2            #326 <String "Error: session encryption failed">
	//   85  179:aload_1         
	//   86  180:invokespecial   #329 <Method void GigyaException(String, Throwable)>
	//   87  183:invokeinterface #333 <Method void ICallback.onError(Throwable)>
			return;
	//   88  188:return          
		}
		mSessionEncryption = SessionEncryption.FINGERPRINT;
		basekey = ((BaseKey) (basekey.encrypt(toJSONString())));
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("fingerprintOptIn:encryptedSession ");
		((StringBuilder) (obj)).append(((String) (basekey)));
		((StringBuilder) (obj)).append(" Size: ");
		((StringBuilder) (obj)).append(((String) (basekey)).length());
		GigyaLog.i("SessionManager", ((StringBuilder) (obj)).toString());
		GigyaLog.i("SessionManager", "fingerprintOptIn:caching the encrypted session");
		obj = ((Object) (GSEncryptedPrefs.getInstance(GSAPI.getInstance().getContext())));
		((GSEncryptedPrefs) (obj)).setString("GS_PREFS", ((String) (basekey)));
		((GSEncryptedPrefs) (obj)).setString("sessionProtectionType", SessionEncryption.FINGERPRINT.name());
		icallback.onSuccess();
		return;
	}

	public void fingerprintOptOut(ICallback icallback)
	{
		GigyaLog.i("SessionManager", "fingerprintOptOut");
	//    0    0:ldc1            #17  <String "SessionManager">
	//    1    2:ldc2            #340 <String "fingerprintOptOut">
	//    2    5:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		String s;
		Object obj;
		try
		{
			if(mSessionEncryption == SessionEncryption.DEFAULT)
	//*   3    8:aload_0         
	//*   4    9:getfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
	//*   5   12:getstatic       #343 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.DEFAULT>
	//*   6   15:if_acmpne       29
			{
				GigyaLog.d("SessionManager", "Fingerprint already opt-out");
	//    7   18:ldc1            #17  <String "SessionManager">
	//    8   20:ldc2            #345 <String "Fingerprint already opt-out">
	//    9   23:invokestatic    #290 <Method void GigyaLog.d(String, String)>
				break MISSING_BLOCK_LABEL_146;
	//   10   26:goto            146
			}
		}
	//*  11   29:aload_0         
	//*  12   30:getstatic       #343 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.DEFAULT>
	//*  13   33:putfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
	//*  14   36:aload_0         
	//*  15   37:invokespecial   #292 <Method String toJSONString()>
	//*  16   40:astore_2        
	//*  17   41:new             #153 <Class StringBuilder>
	//*  18   44:dup             
	//*  19   45:invokespecial   #154 <Method void StringBuilder()>
	//*  20   48:astore_3        
	//*  21   49:aload_3         
	//*  22   50:ldc2            #347 <String "fingerprintOptOut:session ">
	//*  23   53:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  24   56:pop             
	//*  25   57:aload_3         
	//*  26   58:aload_2         
	//*  27   59:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  28   62:pop             
	//*  29   63:ldc1            #17  <String "SessionManager">
	//*  30   65:aload_3         
	//*  31   66:invokevirtual   #164 <Method String StringBuilder.toString()>
	//*  32   69:invokestatic    #38  <Method void GigyaLog.i(String, String)>
	//*  33   72:aload_0         
	//*  34   73:aload_2         
	//*  35   74:invokespecial   #349 <Method String AESEncrypt(String)>
	//*  36   77:astore_2        
	//*  37   78:new             #153 <Class StringBuilder>
	//*  38   81:dup             
	//*  39   82:invokespecial   #154 <Method void StringBuilder()>
	//*  40   85:astore_3        
	//*  41   86:aload_3         
	//*  42   87:ldc2            #351 <String "fingerprintOptOut:encryptedSession ">
	//*  43   90:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  44   93:pop             
	//*  45   94:aload_3         
	//*  46   95:aload_2         
	//*  47   96:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//*  48   99:pop             
	//*  49  100:ldc1            #17  <String "SessionManager">
	//*  50  102:aload_3         
	//*  51  103:invokevirtual   #164 <Method String StringBuilder.toString()>
	//*  52  106:invokestatic    #38  <Method void GigyaLog.i(String, String)>
	//*  53  109:ldc1            #17  <String "SessionManager">
	//*  54  111:ldc2            #353 <String "fingerprintOptOut:caching the encrypted session">
	//*  55  114:invokestatic    #38  <Method void GigyaLog.i(String, String)>
	//*  56  117:invokestatic    #44  <Method GSAPI GSAPI.getInstance()>
	//*  57  120:invokevirtual   #48  <Method Context GSAPI.getContext()>
	//*  58  123:invokestatic    #53  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(Context)>
	//*  59  126:astore_3        
	//*  60  127:aload_3         
	//*  61  128:ldc1            #11  <String "GS_PREFS">
	//*  62  130:aload_2         
	//*  63  131:invokevirtual   #313 <Method void GSEncryptedPrefs.setString(String, String)>
	//*  64  134:aload_3         
	//*  65  135:ldc1            #14  <String "sessionProtectionType">
	//*  66  137:getstatic       #343 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.DEFAULT>
	//*  67  140:invokevirtual   #316 <Method String SessionManager$SessionEncryption.name()>
	//*  68  143:invokevirtual   #313 <Method void GSEncryptedPrefs.setString(String, String)>
	//*  69  146:aload_1         
	//*  70  147:invokeinterface #321 <Method void ICallback.onSuccess()>
	//*  71  152:return          
		catch(GeneralSecurityException generalsecurityexception)
	//*  72  153:astore_2        
		{
			StringBuilder stringbuilder = new StringBuilder();
	//   73  154:new             #153 <Class StringBuilder>
	//   74  157:dup             
	//   75  158:invokespecial   #154 <Method void StringBuilder()>
	//   76  161:astore_3        
			stringbuilder.append("Error: ");
	//   77  162:aload_3         
	//   78  163:ldc1            #209 <String "Error: ">
	//   79  165:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   80  168:pop             
			stringbuilder.append(generalsecurityexception.getMessage());
	//   81  169:aload_3         
	//   82  170:aload_2         
	//   83  171:invokevirtual   #354 <Method String GeneralSecurityException.getMessage()>
	//   84  174:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   85  177:pop             
			GigyaLog.e("SessionManager", stringbuilder.toString());
	//   86  178:ldc1            #17  <String "SessionManager">
	//   87  180:aload_3         
	//   88  181:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   89  184:invokestatic    #215 <Method void GigyaLog.e(String, String)>
			icallback.onError(((Throwable) (new GigyaException("Error: session encryption failed", ((Throwable) (generalsecurityexception))))));
	//   90  187:aload_1         
	//   91  188:new             #324 <Class GigyaException>
	//   92  191:dup             
	//   93  192:ldc2            #326 <String "Error: session encryption failed">
	//   94  195:aload_2         
	//   95  196:invokespecial   #329 <Method void GigyaException(String, Throwable)>
	//   96  199:invokeinterface #333 <Method void ICallback.onError(Throwable)>
			return;
	//   97  204:return          
		}
		mSessionEncryption = SessionEncryption.DEFAULT;
		s = toJSONString();
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("fingerprintOptOut:session ");
		((StringBuilder) (obj)).append(s);
		GigyaLog.i("SessionManager", ((StringBuilder) (obj)).toString());
		s = AESEncrypt(s);
		obj = ((Object) (new StringBuilder()));
		((StringBuilder) (obj)).append("fingerprintOptOut:encryptedSession ");
		((StringBuilder) (obj)).append(s);
		GigyaLog.i("SessionManager", ((StringBuilder) (obj)).toString());
		GigyaLog.i("SessionManager", "fingerprintOptOut:caching the encrypted session");
		obj = ((Object) (GSEncryptedPrefs.getInstance(GSAPI.getInstance().getContext())));
		((GSEncryptedPrefs) (obj)).setString("GS_PREFS", s);
		((GSEncryptedPrefs) (obj)).setString("sessionProtectionType", SessionEncryption.DEFAULT.name());
		icallback.onSuccess();
		return;
	}

	public String getGMID()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("getGMID: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #357 <String "getGMID: ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mEnvironment.getGMID());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #169 <Field Environment mEnvironment>
	//   11   21:invokevirtual   #233 <Method String Environment.getGMID()>
	//   12   24:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   14   28:ldc1            #17  <String "SessionManager">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		return mEnvironment.getGMID();
	//   18   37:aload_0         
	//   19   38:getfield        #169 <Field Environment mEnvironment>
	//   20   41:invokevirtual   #233 <Method String Environment.getGMID()>
	//   21   44:areturn         
	}

	public GSSession getSession()
	{
		GigyaLog.i("SessionManager", "getSession");
	//    0    0:ldc1            #17  <String "SessionManager">
	//    1    2:ldc2            #360 <String "getSession">
	//    2    5:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		return mGSSession;
	//    3    8:aload_0         
	//    4    9:getfield        #221 <Field GSSession mGSSession>
	//    5   12:areturn         
	}

	public SessionEncryption getSessionEncryption()
	{
		return mSessionEncryption;
	//    0    0:aload_0         
	//    1    1:getfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
	//    2    4:areturn         
	}

	public String getSessionLastLoginProvider()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("getSessionLastLoginProvider: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #365 <String "getSessionLastLoginProvider: ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mEnvironment.getLastLoginProvider());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #169 <Field Environment mEnvironment>
	//   11   21:invokevirtual   #254 <Method String Environment.getLastLoginProvider()>
	//   12   24:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   14   28:ldc1            #17  <String "SessionManager">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		return mEnvironment.getLastLoginProvider();
	//   18   37:aload_0         
	//   19   38:getfield        #169 <Field Environment mEnvironment>
	//   20   41:invokevirtual   #254 <Method String Environment.getLastLoginProvider()>
	//   21   44:areturn         
	}

	public long getTimestampOffset()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("getSessionLastLoginProvider: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #365 <String "getSessionLastLoginProvider: ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mEnvironment.getTSOffset());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #169 <Field Environment mEnvironment>
	//   11   21:invokevirtual   #264 <Method long Environment.getTSOffset()>
	//   12   24:invokevirtual   #369 <Method StringBuilder StringBuilder.append(long)>
	//   13   27:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   14   28:ldc1            #17  <String "SessionManager">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		return mEnvironment.getTSOffset();
	//   18   37:aload_0         
	//   19   38:getfield        #169 <Field Environment mEnvironment>
	//   20   41:invokevirtual   #264 <Method long Environment.getTSOffset()>
	//   21   44:lreturn         
	}

	public String getUCID()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_1        
		stringbuilder.append("getUCID: ");
	//    4    8:aload_1         
	//    5    9:ldc2            #371 <String "getUCID: ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(mEnvironment.getUCID());
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #169 <Field Environment mEnvironment>
	//   11   21:invokevirtual   #247 <Method String Environment.getUCID()>
	//   12   24:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   13   27:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   14   28:ldc1            #17  <String "SessionManager">
	//   15   30:aload_1         
	//   16   31:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   17   34:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		return mEnvironment.getUCID();
	//   18   37:aload_0         
	//   19   38:getfield        #169 <Field Environment mEnvironment>
	//   20   41:invokevirtual   #247 <Method String Environment.getUCID()>
	//   21   44:areturn         
	}

	public void invalidateSessionEncryption()
	{
		mSessionEncryption = SessionEncryption.DEFAULT;
	//    0    0:aload_0         
	//    1    1:getstatic       #343 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.DEFAULT>
	//    2    4:putfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
	//    3    7:return          
	}

	public boolean isValidSession()
	{
		GigyaLog.i("SessionManager", "isValidSession");
	//    0    0:ldc1            #17  <String "SessionManager">
	//    1    2:ldc2            #374 <String "isValidSession">
	//    2    5:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		return mGSSession != null && mGSSession.isValid();
	//    3    8:aload_0         
	//    4    9:getfield        #221 <Field GSSession mGSSession>
	//    5   12:ifnull          27
	//    6   15:aload_0         
	//    7   16:getfield        #221 <Field GSSession mGSSession>
	//    8   19:invokevirtual   #377 <Method boolean GSSession.isValid()>
	//    9   22:ifeq            27
	//   10   25:iconst_1        
	//   11   26:ireturn         
	//   12   27:iconst_0        
	//   13   28:ireturn         
	}

	public void loadFingerprintSession(BaseKey basekey, ICallback icallback)
	{
		GigyaLog.i("SessionManager", "loadFingerprintSession");
	//    0    0:ldc1            #17  <String "SessionManager">
	//    1    2:ldc2            #379 <String "loadFingerprintSession">
	//    2    5:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		if(TextUtils.isEmpty(((CharSequence) (mFingerprintEncryptedSession))))
	//*   3    8:aload_0         
	//*   4    9:getfield        #381 <Field String mFingerprintEncryptedSession>
	//*   5   12:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   6   15:ifeq            29
		{
			GigyaLog.e("SessionManager", "Error: encrypted session is empty");
	//    7   18:ldc1            #17  <String "SessionManager">
	//    8   20:ldc2            #383 <String "Error: encrypted session is empty">
	//    9   23:invokestatic    #215 <Method void GigyaLog.e(String, String)>
			break MISSING_BLOCK_LABEL_200;
	//   10   26:goto            200
		}
		StringBuilder stringbuilder = new StringBuilder();
	//   11   29:new             #153 <Class StringBuilder>
	//   12   32:dup             
	//   13   33:invokespecial   #154 <Method void StringBuilder()>
	//   14   36:astore_3        
		stringbuilder.append("loadFingerprintSession:mFingerprintEncryptedSession ");
	//   15   37:aload_3         
	//   16   38:ldc2            #385 <String "loadFingerprintSession:mFingerprintEncryptedSession ">
	//   17   41:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   18   44:pop             
		stringbuilder.append(mFingerprintEncryptedSession);
	//   19   45:aload_3         
	//   20   46:aload_0         
	//   21   47:getfield        #381 <Field String mFingerprintEncryptedSession>
	//   22   50:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   23   53:pop             
		GigyaLog.d("SessionManager", stringbuilder.toString());
	//   24   54:ldc1            #17  <String "SessionManager">
	//   25   56:aload_3         
	//   26   57:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   27   60:invokestatic    #290 <Method void GigyaLog.d(String, String)>
		basekey = ((BaseKey) (basekey.decrypt(mFingerprintEncryptedSession)));
	//   28   63:aload_1         
	//   29   64:aload_0         
	//   30   65:getfield        #381 <Field String mFingerprintEncryptedSession>
	//   31   68:invokevirtual   #388 <Method String BaseKey.decrypt(String)>
	//   32   71:astore_1        
		stringbuilder = new StringBuilder();
	//   33   72:new             #153 <Class StringBuilder>
	//   34   75:dup             
	//   35   76:invokespecial   #154 <Method void StringBuilder()>
	//   36   79:astore_3        
		stringbuilder.append("loadFingerprintSession:decryptedSession ");
	//   37   80:aload_3         
	//   38   81:ldc2            #390 <String "loadFingerprintSession:decryptedSession ">
	//   39   84:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   40   87:pop             
		stringbuilder.append(((String) (basekey)));
	//   41   88:aload_3         
	//   42   89:aload_1         
	//   43   90:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   44   93:pop             
		GigyaLog.d("SessionManager", stringbuilder.toString());
	//   45   94:ldc1            #17  <String "SessionManager">
	//   46   96:aload_3         
	//   47   97:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   48  100:invokestatic    #290 <Method void GigyaLog.d(String, String)>
		basekey = ((BaseKey) (createSessionFromString(((String) (basekey)))));
	//   49  103:aload_0         
	//   50  104:aload_1         
	//   51  105:invokespecial   #392 <Method GSSession createSessionFromString(String)>
	//   52  108:astore_1        
		stringbuilder = new StringBuilder();
	//   53  109:new             #153 <Class StringBuilder>
	//   54  112:dup             
	//   55  113:invokespecial   #154 <Method void StringBuilder()>
	//   56  116:astore_3        
		stringbuilder.append("loadSession: session ");
	//   57  117:aload_3         
	//   58  118:ldc2            #394 <String "loadSession: session ">
	//   59  121:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   60  124:pop             
		stringbuilder.append(((GSSession) (basekey)).toString());
	//   61  125:aload_3         
	//   62  126:aload_1         
	//   63  127:invokevirtual   #395 <Method String GSSession.toString()>
	//   64  130:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   65  133:pop             
		GigyaLog.d("SessionManager", stringbuilder.toString());
	//   66  134:ldc1            #17  <String "SessionManager">
	//   67  136:aload_3         
	//   68  137:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   69  140:invokestatic    #290 <Method void GigyaLog.d(String, String)>
		if(basekey != null)
	//*  70  143:aload_1         
	//*  71  144:ifnull          200
			try
			{
				if(((GSSession) (basekey)).isValid())
	//*  72  147:aload_1         
	//*  73  148:invokevirtual   #377 <Method boolean GSSession.isValid()>
	//*  74  151:ifeq            200
				{
					mGSSession = ((GSSession) (basekey));
	//   75  154:aload_0         
	//   76  155:aload_1         
	//   77  156:putfield        #221 <Field GSSession mGSSession>
					icallback.onSuccess();
	//   78  159:aload_2         
	//   79  160:invokeinterface #321 <Method void ICallback.onSuccess()>
					return;
	//   80  165:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(BaseKey basekey)
	//*  81  166:astore_1        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   82  167:new             #153 <Class StringBuilder>
	//   83  170:dup             
	//   84  171:invokespecial   #154 <Method void StringBuilder()>
	//   85  174:astore_3        
				stringbuilder1.append("Error: ");
	//   86  175:aload_3         
	//   87  176:ldc1            #209 <String "Error: ">
	//   88  178:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   89  181:pop             
				stringbuilder1.append(((com.gigya.socialize.android.keyStore.BaseKey.KeyException) (basekey)).getMessage());
	//   90  182:aload_3         
	//   91  183:aload_1         
	//   92  184:invokevirtual   #322 <Method String com.gigya.socialize.android.keyStore.BaseKey$KeyException.getMessage()>
	//   93  187:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   94  190:pop             
				GigyaLog.e("SessionManager", stringbuilder1.toString());
	//   95  191:ldc1            #17  <String "SessionManager">
	//   96  193:aload_3         
	//   97  194:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   98  197:invokestatic    #215 <Method void GigyaLog.e(String, String)>
			}
		icallback.onError(((Throwable) (new GigyaException("Error: session encryption failed"))));
	//   99  200:aload_2         
	//  100  201:new             #324 <Class GigyaException>
	//  101  204:dup             
	//  102  205:ldc2            #326 <String "Error: session encryption failed">
	//  103  208:invokespecial   #396 <Method void GigyaException(String)>
	//  104  211:invokeinterface #333 <Method void ICallback.onError(Throwable)>
		return;
	//  105  216:return          
	}

	public void loadSession()
	{
		String s;
		GSEncryptedPrefs gsencryptedprefs;
		Context context;
		context = GSAPI.getInstance().getContext();
	//    0    0:invokestatic    #44  <Method GSAPI GSAPI.getInstance()>
	//    1    3:invokevirtual   #48  <Method Context GSAPI.getContext()>
	//    2    6:astore          4
		GigyaLog.i("SessionManager", "loadSession");
	//    3    8:ldc1            #17  <String "SessionManager">
	//    4   10:ldc2            #398 <String "loadSession">
	//    5   13:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		mGSSession = new GSSession();
	//    6   16:aload_0         
	//    7   17:new             #191 <Class GSSession>
	//    8   20:dup             
	//    9   21:invokespecial   #399 <Method void GSSession()>
	//   10   24:putfield        #221 <Field GSSession mGSSession>
		mEnvironment = new Environment();
	//   11   27:aload_0         
	//   12   28:new             #166 <Class Environment>
	//   13   31:dup             
	//   14   32:invokespecial   #167 <Method void Environment()>
	//   15   35:putfield        #169 <Field Environment mEnvironment>
		gsencryptedprefs = GSEncryptedPrefs.getInstance(context);
	//   16   38:aload           4
	//   17   40:invokestatic    #53  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(Context)>
	//   18   43:astore_3        
		s = gsencryptedprefs.getString("GS_PREFS", ((String) (null)));
	//   19   44:aload_3         
	//   20   45:ldc1            #11  <String "GS_PREFS">
	//   21   47:aconst_null     
	//   22   48:invokevirtual   #400 <Method String GSEncryptedPrefs.getString(String, String)>
	//   23   51:astore_2        
		if(!TextUtils.isEmpty(((CharSequence) (s))) && checkLegacySession(context))
	//*  24   52:aload_2         
	//*  25   53:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  26   56:ifne            80
	//*  27   59:aload_0         
	//*  28   60:aload           4
	//*  29   62:invokespecial   #402 <Method boolean checkLegacySession(Context)>
	//*  30   65:ifeq            80
			cleanLegacySession(context.getSharedPreferences("GSLIB", 0));
	//   31   68:aload_0         
	//   32   69:aload           4
	//   33   71:ldc1            #97  <String "GSLIB">
	//   34   73:iconst_0        
	//   35   74:invokevirtual   #103 <Method SharedPreferences Context.getSharedPreferences(String, int)>
	//   36   77:invokespecial   #241 <Method void cleanLegacySession(SharedPreferences)>
		Object obj = ((Object) (s));
	//   37   80:aload_2         
	//   38   81:astore_1        
		if(!TextUtils.isEmpty(((CharSequence) (s))))
			break MISSING_BLOCK_LABEL_139;
	//   39   82:aload_2         
	//   40   83:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   41   86:ifeq            139
		obj = ((Object) (s));
	//   42   89:aload_2         
	//   43   90:astore_1        
		if(loadLegacySession(context))
	//*  44   91:aload_0         
	//*  45   92:aload           4
	//*  46   94:invokespecial   #404 <Method boolean loadLegacySession(Context)>
	//*  47   97:ifeq            139
		{
			saveSession(mGSSession, true);
	//   48  100:aload_0         
	//   49  101:aload_0         
	//   50  102:getfield        #221 <Field GSSession mGSSession>
	//   51  105:iconst_1        
	//   52  106:invokevirtual   #408 <Method void saveSession(GSSession, boolean)>
			mGSSession = new GSSession();
	//   53  109:aload_0         
	//   54  110:new             #191 <Class GSSession>
	//   55  113:dup             
	//   56  114:invokespecial   #399 <Method void GSSession()>
	//   57  117:putfield        #221 <Field GSSession mGSSession>
			mEnvironment = new Environment();
	//   58  120:aload_0         
	//   59  121:new             #166 <Class Environment>
	//   60  124:dup             
	//   61  125:invokespecial   #167 <Method void Environment()>
	//   62  128:putfield        #169 <Field Environment mEnvironment>
			obj = ((Object) (gsencryptedprefs.getString("GS_PREFS", ((String) (null)))));
	//   63  131:aload_3         
	//   64  132:ldc1            #11  <String "GS_PREFS">
	//   65  134:aconst_null     
	//   66  135:invokevirtual   #400 <Method String GSEncryptedPrefs.getString(String, String)>
	//   67  138:astore_1        
		}
		if(TextUtils.isEmpty(((CharSequence) (obj))))
			break MISSING_BLOCK_LABEL_393;
	//   68  139:aload_1         
	//   69  140:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   70  143:ifne            393
		StringBuilder stringbuilder = new StringBuilder();
	//   71  146:new             #153 <Class StringBuilder>
	//   72  149:dup             
	//   73  150:invokespecial   #154 <Method void StringBuilder()>
	//   74  153:astore_2        
		stringbuilder.append("loadSession:encryptedSession ");
	//   75  154:aload_2         
	//   76  155:ldc2            #410 <String "loadSession:encryptedSession ">
	//   77  158:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   78  161:pop             
		stringbuilder.append(((String) (obj)));
	//   79  162:aload_2         
	//   80  163:aload_1         
	//   81  164:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   82  167:pop             
		GigyaLog.d("SessionManager", stringbuilder.toString());
	//   83  168:ldc1            #17  <String "SessionManager">
	//   84  170:aload_2         
	//   85  171:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   86  174:invokestatic    #290 <Method void GigyaLog.d(String, String)>
		mSessionEncryption = SessionEncryption.valueOf(gsencryptedprefs.getString("sessionProtectionType", SessionEncryption.DEFAULT.name()));
	//   87  177:aload_0         
	//   88  178:aload_3         
	//   89  179:ldc1            #14  <String "sessionProtectionType">
	//   90  181:getstatic       #343 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.DEFAULT>
	//   91  184:invokevirtual   #316 <Method String SessionManager$SessionEncryption.name()>
	//   92  187:invokevirtual   #400 <Method String GSEncryptedPrefs.getString(String, String)>
	//   93  190:invokestatic    #414 <Method SessionManager$SessionEncryption SessionManager$SessionEncryption.valueOf(String)>
	//   94  193:putfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
		stringbuilder = new StringBuilder();
	//   95  196:new             #153 <Class StringBuilder>
	//   96  199:dup             
	//   97  200:invokespecial   #154 <Method void StringBuilder()>
	//   98  203:astore_2        
		stringbuilder.append("loadSession:sessionEncryption ");
	//   99  204:aload_2         
	//  100  205:ldc2            #416 <String "loadSession:sessionEncryption ">
	//  101  208:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  102  211:pop             
		stringbuilder.append(mSessionEncryption.name());
	//  103  212:aload_2         
	//  104  213:aload_0         
	//  105  214:getfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
	//  106  217:invokevirtual   #316 <Method String SessionManager$SessionEncryption.name()>
	//  107  220:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  108  223:pop             
		GigyaLog.d("SessionManager", stringbuilder.toString());
	//  109  224:ldc1            #17  <String "SessionManager">
	//  110  226:aload_2         
	//  111  227:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  112  230:invokestatic    #290 <Method void GigyaLog.d(String, String)>
		if(mSessionEncryption != SessionEncryption.DEFAULT)
	//* 113  233:aload_0         
	//* 114  234:getfield        #282 <Field SessionManager$SessionEncryption mSessionEncryption>
	//* 115  237:getstatic       #343 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.DEFAULT>
	//* 116  240:if_acmpeq       249
		{
			mFingerprintEncryptedSession = ((String) (obj));
	//  117  243:aload_0         
	//  118  244:aload_1         
	//  119  245:putfield        #381 <Field String mFingerprintEncryptedSession>
			return;
	//  120  248:return          
		}
		obj = ((Object) (AESDecrypt(((String) (obj)))));
	//  121  249:aload_0         
	//  122  250:aload_1         
	//  123  251:invokespecial   #418 <Method String AESDecrypt(String)>
	//  124  254:astore_1        
		StringBuilder stringbuilder1 = new StringBuilder();
	//  125  255:new             #153 <Class StringBuilder>
	//  126  258:dup             
	//  127  259:invokespecial   #154 <Method void StringBuilder()>
	//  128  262:astore_2        
		stringbuilder1.append("loadSession: AES_decryptedSession ");
	//  129  263:aload_2         
	//  130  264:ldc2            #420 <String "loadSession: AES_decryptedSession ">
	//  131  267:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  132  270:pop             
		stringbuilder1.append(((String) (obj)));
	//  133  271:aload_2         
	//  134  272:aload_1         
	//  135  273:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  136  276:pop             
		GigyaLog.d("SessionManager", stringbuilder1.toString());
	//  137  277:ldc1            #17  <String "SessionManager">
	//  138  279:aload_2         
	//  139  280:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  140  283:invokestatic    #290 <Method void GigyaLog.d(String, String)>
		if(TextUtils.isEmpty(((CharSequence) (obj))))
			break MISSING_BLOCK_LABEL_393;
	//  141  286:aload_1         
	//  142  287:invokestatic    #119 <Method boolean TextUtils.isEmpty(CharSequence)>
	//  143  290:ifne            393
		obj = ((Object) (createSessionFromString(((String) (obj)))));
	//  144  293:aload_0         
	//  145  294:aload_1         
	//  146  295:invokespecial   #392 <Method GSSession createSessionFromString(String)>
	//  147  298:astore_1        
		stringbuilder1 = new StringBuilder();
	//  148  299:new             #153 <Class StringBuilder>
	//  149  302:dup             
	//  150  303:invokespecial   #154 <Method void StringBuilder()>
	//  151  306:astore_2        
		stringbuilder1.append("loadSession: session ");
	//  152  307:aload_2         
	//  153  308:ldc2            #394 <String "loadSession: session ">
	//  154  311:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  155  314:pop             
		stringbuilder1.append(((GSSession) (obj)).toString());
	//  156  315:aload_2         
	//  157  316:aload_1         
	//  158  317:invokevirtual   #395 <Method String GSSession.toString()>
	//  159  320:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  160  323:pop             
		GigyaLog.d("SessionManager", stringbuilder1.toString());
	//  161  324:ldc1            #17  <String "SessionManager">
	//  162  326:aload_2         
	//  163  327:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  164  330:invokestatic    #290 <Method void GigyaLog.d(String, String)>
		if(obj == null)
			break MISSING_BLOCK_LABEL_350;
	//  165  333:aload_1         
	//  166  334:ifnull          350
		if(((GSSession) (obj)).isValid())
	//* 167  337:aload_1         
	//* 168  338:invokevirtual   #377 <Method boolean GSSession.isValid()>
	//* 169  341:ifeq            350
		{
			mGSSession = ((GSSession) (obj));
	//  170  344:aload_0         
	//  171  345:aload_1         
	//  172  346:putfield        #221 <Field GSSession mGSSession>
			return;
	//  173  349:return          
		}
		try
		{
			GigyaLog.d("SessionManager", "session not valid - ignoring");
	//  174  350:ldc1            #17  <String "SessionManager">
	//  175  352:ldc2            #422 <String "session not valid - ignoring">
	//  176  355:invokestatic    #290 <Method void GigyaLog.d(String, String)>
			return;
	//  177  358:return          
		}
		catch(GeneralSecurityException generalsecurityexception)
	//* 178  359:astore_1        
		{
			StringBuilder stringbuilder2 = new StringBuilder();
	//  179  360:new             #153 <Class StringBuilder>
	//  180  363:dup             
	//  181  364:invokespecial   #154 <Method void StringBuilder()>
	//  182  367:astore_2        
			stringbuilder2.append("Error: ");
	//  183  368:aload_2         
	//  184  369:ldc1            #209 <String "Error: ">
	//  185  371:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  186  374:pop             
			stringbuilder2.append(generalsecurityexception.getMessage());
	//  187  375:aload_2         
	//  188  376:aload_1         
	//  189  377:invokevirtual   #354 <Method String GeneralSecurityException.getMessage()>
	//  190  380:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//  191  383:pop             
			GigyaLog.e("SessionManager", stringbuilder2.toString());
	//  192  384:ldc1            #17  <String "SessionManager">
	//  193  386:aload_2         
	//  194  387:invokevirtual   #164 <Method String StringBuilder.toString()>
	//  195  390:invokestatic    #215 <Method void GigyaLog.e(String, String)>
		}
	//  196  393:return          
	}

	public void saveSession(GSSession gssession, boolean flag)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("setSession ");
	//    4    8:aload_3         
	//    5    9:ldc2            #424 <String "setSession ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(gssession.toString());
	//    8   16:aload_3         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #395 <Method String GSSession.toString()>
	//   11   21:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   12   24:pop             
		stringbuilder.append(" saveToDisk ");
	//   13   25:aload_3         
	//   14   26:ldc2            #426 <String " saveToDisk ">
	//   15   29:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   16   32:pop             
		stringbuilder.append(flag);
	//   17   33:aload_3         
	//   18   34:iload_2         
	//   19   35:invokevirtual   #272 <Method StringBuilder StringBuilder.append(boolean)>
	//   20   38:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   21   39:ldc1            #17  <String "SessionManager">
	//   22   41:aload_3         
	//   23   42:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   24   45:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		mGSSession = gssession;
	//   25   48:aload_0         
	//   26   49:aload_1         
	//   27   50:putfield        #221 <Field GSSession mGSSession>
		if(flag)
	//*  28   53:iload_2         
	//*  29   54:ifeq            170
			try
			{
				if(mGSSession != null)
	//*  30   57:aload_0         
	//*  31   58:getfield        #221 <Field GSSession mGSSession>
	//*  32   61:ifnull          170
				{
					gssession = ((GSSession) (toJSONString()));
	//   33   64:aload_0         
	//   34   65:invokespecial   #292 <Method String toJSONString()>
	//   35   68:astore_1        
					Object obj = ((Object) (new StringBuilder()));
	//   36   69:new             #153 <Class StringBuilder>
	//   37   72:dup             
	//   38   73:invokespecial   #154 <Method void StringBuilder()>
	//   39   76:astore_3        
					((StringBuilder) (obj)).append("setSession ");
	//   40   77:aload_3         
	//   41   78:ldc2            #424 <String "setSession ">
	//   42   81:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   43   84:pop             
					((StringBuilder) (obj)).append(((String) (gssession)));
	//   44   85:aload_3         
	//   45   86:aload_1         
	//   46   87:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   47   90:pop             
					GigyaLog.i("SessionManager", ((StringBuilder) (obj)).toString());
	//   48   91:ldc1            #17  <String "SessionManager">
	//   49   93:aload_3         
	//   50   94:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   51   97:invokestatic    #38  <Method void GigyaLog.i(String, String)>
					gssession = ((GSSession) (AESEncrypt(((String) (gssession)))));
	//   52  100:aload_0         
	//   53  101:aload_1         
	//   54  102:invokespecial   #349 <Method String AESEncrypt(String)>
	//   55  105:astore_1        
					obj = ((Object) (GSEncryptedPrefs.getInstance(GSAPI.getInstance().getContext())));
	//   56  106:invokestatic    #44  <Method GSAPI GSAPI.getInstance()>
	//   57  109:invokevirtual   #48  <Method Context GSAPI.getContext()>
	//   58  112:invokestatic    #53  <Method GSEncryptedPrefs GSEncryptedPrefs.getInstance(Context)>
	//   59  115:astore_3        
					((GSEncryptedPrefs) (obj)).setString("GS_PREFS", ((String) (gssession)));
	//   60  116:aload_3         
	//   61  117:ldc1            #11  <String "GS_PREFS">
	//   62  119:aload_1         
	//   63  120:invokevirtual   #313 <Method void GSEncryptedPrefs.setString(String, String)>
					((GSEncryptedPrefs) (obj)).setString("sessionProtectionType", SessionEncryption.DEFAULT.name());
	//   64  123:aload_3         
	//   65  124:ldc1            #14  <String "sessionProtectionType">
	//   66  126:getstatic       #343 <Field SessionManager$SessionEncryption SessionManager$SessionEncryption.DEFAULT>
	//   67  129:invokevirtual   #316 <Method String SessionManager$SessionEncryption.name()>
	//   68  132:invokevirtual   #313 <Method void GSEncryptedPrefs.setString(String, String)>
					return;
	//   69  135:return          
				}
			}
			// Misplaced declaration of an exception variable
			catch(GSSession gssession)
	//*  70  136:astore_1        
			{
				StringBuilder stringbuilder1 = new StringBuilder();
	//   71  137:new             #153 <Class StringBuilder>
	//   72  140:dup             
	//   73  141:invokespecial   #154 <Method void StringBuilder()>
	//   74  144:astore_3        
				stringbuilder1.append("Error: ");
	//   75  145:aload_3         
	//   76  146:ldc1            #209 <String "Error: ">
	//   77  148:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   78  151:pop             
				stringbuilder1.append(((GeneralSecurityException) (gssession)).getMessage());
	//   79  152:aload_3         
	//   80  153:aload_1         
	//   81  154:invokevirtual   #354 <Method String GeneralSecurityException.getMessage()>
	//   82  157:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   83  160:pop             
				GigyaLog.e("SessionManager", stringbuilder1.toString());
	//   84  161:ldc1            #17  <String "SessionManager">
	//   85  163:aload_3         
	//   86  164:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   87  167:invokestatic    #215 <Method void GigyaLog.e(String, String)>
			}
		return;
	//   88  170:return          
	}

	public void setGMID(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("setGMID ");
	//    4    8:aload_2         
	//    5    9:ldc2            #428 <String "setGMID ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   12   22:ldc1            #17  <String "SessionManager">
	//   13   24:aload_2         
	//   14   25:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		mEnvironment.setGMID(s);
	//   16   31:aload_0         
	//   17   32:getfield        #169 <Field Environment mEnvironment>
	//   18   35:aload_1         
	//   19   36:invokevirtual   #204 <Method void Environment.setGMID(String)>
	//   20   39:return          
	}

	public void setSessionLastLoginProvider(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("setSessionLastLoginProvider: ");
	//    4    8:aload_2         
	//    5    9:ldc2            #431 <String "setSessionLastLoginProvider: ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   12   22:ldc1            #17  <String "SessionManager">
	//   13   24:aload_2         
	//   14   25:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		mEnvironment.setLastLoginProvider(s);
	//   16   31:aload_0         
	//   17   32:getfield        #169 <Field Environment mEnvironment>
	//   18   35:aload_1         
	//   19   36:invokevirtual   #207 <Method void Environment.setLastLoginProvider(String)>
	//   20   39:return          
	}

	public void setTimestampOffset(long l)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("setTimestampOffset ");
	//    4    8:aload_3         
	//    5    9:ldc2            #434 <String "setTimestampOffset ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(l);
	//    8   16:aload_3         
	//    9   17:lload_1         
	//   10   18:invokevirtual   #369 <Method StringBuilder StringBuilder.append(long)>
	//   11   21:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   12   22:ldc1            #17  <String "SessionManager">
	//   13   24:aload_3         
	//   14   25:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		mEnvironment.setTSOffset(l);
	//   16   31:aload_0         
	//   17   32:getfield        #169 <Field Environment mEnvironment>
	//   18   35:lload_1         
	//   19   36:invokevirtual   #198 <Method void Environment.setTSOffset(long)>
	//   20   39:return          
	}

	public void setUCID(String s)
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #153 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("setUCID ");
	//    4    8:aload_2         
	//    5    9:ldc2            #436 <String "setUCID ">
	//    6   12:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//    7   15:pop             
		stringbuilder.append(s);
	//    8   16:aload_2         
	//    9   17:aload_1         
	//   10   18:invokevirtual   #160 <Method StringBuilder StringBuilder.append(String)>
	//   11   21:pop             
		GigyaLog.i("SessionManager", stringbuilder.toString());
	//   12   22:ldc1            #17  <String "SessionManager">
	//   13   24:aload_2         
	//   14   25:invokevirtual   #164 <Method String StringBuilder.toString()>
	//   15   28:invokestatic    #38  <Method void GigyaLog.i(String, String)>
		mEnvironment.setUCID(s);
	//   16   31:aload_0         
	//   17   32:getfield        #169 <Field Environment mEnvironment>
	//   18   35:aload_1         
	//   19   36:invokevirtual   #201 <Method void Environment.setUCID(String)>
	//   20   39:return          
	}

	private static final String KEY_SESSION = "GS_PREFS";
	private static final String KEY_SESSION_ENCRYPTION_TYPE = "sessionProtectionType";
	private static final String TAG = "SessionManager";
	private Environment mEnvironment;
	private String mFingerprintEncryptedSession;
	private GSSession mGSSession;
	private SessionEncryption mSessionEncryption;
}
