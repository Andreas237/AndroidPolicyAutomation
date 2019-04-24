// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.AccessToken;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import java.util.Map;

// Referenced classes of package com.facebook.login:
//			LoginClient

public static class LoginClient$Result
	implements Parcelable
{
	static final class Code extends Enum
	{

		public static Code valueOf(String s)
		{
			return (Code)Enum.valueOf(com/facebook/login/LoginClient$Result$Code, s);
		//    0    0:ldc1            #2   <Class LoginClient$Result$Code>
		//    1    2:aload_0         
		//    2    3:invokestatic    #54  <Method Enum Enum.valueOf(Class, String)>
		//    3    6:checkcast       #2   <Class LoginClient$Result$Code>
		//    4    9:areturn         
		}

		public static Code[] values()
		{
			return (Code[])((Code []) ($VALUES)).clone();
		//    0    0:getstatic       #42  <Field LoginClient$Result$Code[] $VALUES>
		//    1    3:invokevirtual   #61  <Method Object _5B_Lcom.facebook.login.LoginClient$Result$Code_3B_.clone()>
		//    2    6:checkcast       #57  <Class LoginClient$Result$Code[]>
		//    3    9:areturn         
		}

		String getLoggingValue()
		{
			return loggingValue;
		//    0    0:aload_0         
		//    1    1:getfield        #47  <Field String loggingValue>
		//    2    4:areturn         
		}

		private static final Code $VALUES[];
		public static final Code CANCEL;
		public static final Code ERROR;
		public static final Code SUCCESS;
		private final String loggingValue;

		static 
		{
			SUCCESS = new Code("SUCCESS", 0, "success");
		//    0    0:new             #2   <Class LoginClient$Result$Code>
		//    1    3:dup             
		//    2    4:ldc1            #22  <String "SUCCESS">
		//    3    6:iconst_0        
		//    4    7:ldc1            #24  <String "success">
		//    5    9:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
		//    6   12:putstatic       #30  <Field LoginClient$Result$Code SUCCESS>
			CANCEL = new Code("CANCEL", 1, "cancel");
		//    7   15:new             #2   <Class LoginClient$Result$Code>
		//    8   18:dup             
		//    9   19:ldc1            #31  <String "CANCEL">
		//   10   21:iconst_1        
		//   11   22:ldc1            #33  <String "cancel">
		//   12   24:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
		//   13   27:putstatic       #35  <Field LoginClient$Result$Code CANCEL>
			ERROR = new Code("ERROR", 2, "error");
		//   14   30:new             #2   <Class LoginClient$Result$Code>
		//   15   33:dup             
		//   16   34:ldc1            #36  <String "ERROR">
		//   17   36:iconst_2        
		//   18   37:ldc1            #38  <String "error">
		//   19   39:invokespecial   #28  <Method void LoginClient$Result$Code(String, int, String)>
		//   20   42:putstatic       #40  <Field LoginClient$Result$Code ERROR>
			$VALUES = (new Code[] {
				SUCCESS, CANCEL, ERROR
			});
		//   21   45:iconst_3        
		//   22   46:anewarray       Code[]
		//   23   49:dup             
		//   24   50:iconst_0        
		//   25   51:getstatic       #30  <Field LoginClient$Result$Code SUCCESS>
		//   26   54:aastore         
		//   27   55:dup             
		//   28   56:iconst_1        
		//   29   57:getstatic       #35  <Field LoginClient$Result$Code CANCEL>
		//   30   60:aastore         
		//   31   61:dup             
		//   32   62:iconst_2        
		//   33   63:getstatic       #40  <Field LoginClient$Result$Code ERROR>
		//   34   66:aastore         
		//   35   67:putstatic       #42  <Field LoginClient$Result$Code[] $VALUES>
		//*  36   70:return          
		}

		private Code(String s, int i, String s1)
		{
			super(s, i);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:iload_2         
		//    3    3:invokespecial   #45  <Method void Enum(String, int)>
			loggingValue = s1;
		//    4    6:aload_0         
		//    5    7:aload_3         
		//    6    8:putfield        #47  <Field String loggingValue>
		//    7   11:return          
		}
	}


	static LoginClient$Result createCancelResult( , String s)
	{
		return new LoginClient$Result(, Code.CANCEL, ((AccessToken) (null)), s, ((String) (null)));
	//    0    0:new             #2   <Class LoginClient$Result>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #96  <Field LoginClient$Result$Code LoginClient$Result$Code.CANCEL>
	//    4    8:aconst_null     
	//    5    9:aload_1         
	//    6   10:aconst_null     
	//    7   11:invokespecial   #98  <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
	//    8   14:areturn         
	}

	static LoginClient$Result createErrorResult( , String s, String s1)
	{
		return createErrorResult(, s, s1, ((String) (null)));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aconst_null     
	//    4    4:invokestatic    #103 <Method LoginClient$Result createErrorResult(LoginClient$Request, String, String, String)>
	//    5    7:areturn         
	}

	static LoginClient$Result createErrorResult( , String s, String s1, String s2)
	{
		s = TextUtils.join(": ", ((Iterable) (Utility.asListNoNulls(((Object []) (new String[] {
			s, s1
		}))))));
	//    0    0:ldc1            #105 <String ": ">
	//    1    2:iconst_2        
	//    2    3:anewarray       String[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_1         
	//    6    9:aastore         
	//    7   10:dup             
	//    8   11:iconst_1        
	//    9   12:aload_2         
	//   10   13:aastore         
	//   11   14:invokestatic    #111 <Method java.util.List Utility.asListNoNulls(Object[])>
	//   12   17:invokestatic    #117 <Method String TextUtils.join(CharSequence, Iterable)>
	//   13   20:astore_1        
		return new LoginClient$Result(, Code.ERROR, ((AccessToken) (null)), s, s2);
	//   14   21:new             #2   <Class LoginClient$Result>
	//   15   24:dup             
	//   16   25:aload_0         
	//   17   26:getstatic       #120 <Field LoginClient$Result$Code LoginClient$Result$Code.ERROR>
	//   18   29:aconst_null     
	//   19   30:aload_1         
	//   20   31:aload_3         
	//   21   32:invokespecial   #98  <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
	//   22   35:areturn         
	}

	static LoginClient$Result createTokenResult( , AccessToken accesstoken)
	{
		return new LoginClient$Result(, Code.SUCCESS, accesstoken, ((String) (null)), ((String) (null)));
	//    0    0:new             #2   <Class LoginClient$Result>
	//    1    3:dup             
	//    2    4:aload_0         
	//    3    5:getstatic       #125 <Field LoginClient$Result$Code LoginClient$Result$Code.SUCCESS>
	//    4    8:aload_1         
	//    5    9:aconst_null     
	//    6   10:aconst_null     
	//    7   11:invokespecial   #98  <Method void LoginClient$Result(LoginClient$Request, LoginClient$Result$Code, AccessToken, String, String)>
	//    8   14:areturn         
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(code.name());
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #50  <Field LoginClient$Result$Code code>
	//    3    5:invokevirtual   #132 <Method String LoginClient$Result$Code.name()>
	//    4    8:invokevirtual   #136 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (token)), i);
	//    5   11:aload_1         
	//    6   12:aload_0         
	//    7   13:getfield        #64  <Field AccessToken token>
	//    8   16:iload_2         
	//    9   17:invokevirtual   #140 <Method void Parcel.writeParcelable(Parcelable, int)>
		parcel.writeString(errorMessage);
	//   10   20:aload_1         
	//   11   21:aload_0         
	//   12   22:getfield        #66  <Field String errorMessage>
	//   13   25:invokevirtual   #136 <Method void Parcel.writeString(String)>
		parcel.writeString(errorCode);
	//   14   28:aload_1         
	//   15   29:aload_0         
	//   16   30:getfield        #68  <Field String errorCode>
	//   17   33:invokevirtual   #136 <Method void Parcel.writeString(String)>
		parcel.writeParcelable(((Parcelable) (request)), i);
	//   18   36:aload_1         
	//   19   37:aload_0         
	//   20   38:getfield        #72  <Field LoginClient$Request request>
	//   21   41:iload_2         
	//   22   42:invokevirtual   #140 <Method void Parcel.writeParcelable(Parcelable, int)>
		Utility.writeStringMapToParcel(parcel, loggingExtras);
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #80  <Field Map loggingExtras>
	//   26   50:invokestatic    #144 <Method void Utility.writeStringMapToParcel(Parcel, Map)>
	//   27   53:return          
	}

	public static final android.os.Parcelable$Creator CREATOR = new android.os.Parcelable.Creator() {

		public LoginClient.Result createFromParcel(Parcel parcel)
		{
			return new LoginClient.Result(parcel, ((LoginClient._cls1) (null)));
		//    0    0:new             #8   <Class LoginClient$Result>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #21  <Method void LoginClient$Result(Parcel, LoginClient$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method LoginClient$Result createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public LoginClient.Result[] newArray(int i)
		{
			return new LoginClient.Result[i];
		//    0    0:iload_1         
		//    1    1:anewarray       LoginClient.Result[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #29  <Method LoginClient$Result[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	final Code code;
	final String errorCode;
	final String errorMessage;
	public Map loggingExtras;
	final  request;
	final AccessToken token;

	static 
	{
	//    0    0:new             #11  <Class LoginClient$Result$1>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void LoginClient$Result$1()>
	//    3    7:putstatic       #36  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private LoginClient$Result(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		code = Code.valueOf(parcel.readString());
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #44  <Method String Parcel.readString()>
	//    5    9:invokestatic    #48  <Method LoginClient$Result$Code LoginClient$Result$Code.valueOf(String)>
	//    6   12:putfield        #50  <Field LoginClient$Result$Code code>
		token = (AccessToken)parcel.readParcelable(((Class) (com/facebook/AccessToken)).getClassLoader());
	//    7   15:aload_0         
	//    8   16:aload_1         
	//    9   17:ldc1            #52  <Class AccessToken>
	//   10   19:invokevirtual   #58  <Method ClassLoader Class.getClassLoader()>
	//   11   22:invokevirtual   #62  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   12   25:checkcast       #52  <Class AccessToken>
	//   13   28:putfield        #64  <Field AccessToken token>
		errorMessage = parcel.readString();
	//   14   31:aload_0         
	//   15   32:aload_1         
	//   16   33:invokevirtual   #44  <Method String Parcel.readString()>
	//   17   36:putfield        #66  <Field String errorMessage>
		errorCode = parcel.readString();
	//   18   39:aload_0         
	//   19   40:aload_1         
	//   20   41:invokevirtual   #44  <Method String Parcel.readString()>
	//   21   44:putfield        #68  <Field String errorCode>
		request = ()parcel.readParcelable(((Class) (com/facebook/login/LoginClient$Request)).getClassLoader());
	//   22   47:aload_0         
	//   23   48:aload_1         
	//   24   49:ldc1            #70  <Class LoginClient$Request>
	//   25   51:invokevirtual   #58  <Method ClassLoader Class.getClassLoader()>
	//   26   54:invokevirtual   #62  <Method Parcelable Parcel.readParcelable(ClassLoader)>
	//   27   57:checkcast       #70  <Class LoginClient$Request>
	//   28   60:putfield        #72  <Field LoginClient$Request request>
		loggingExtras = Utility.readStringMapFromParcel(parcel);
	//   29   63:aload_0         
	//   30   64:aload_1         
	//   31   65:invokestatic    #78  <Method Map Utility.readStringMapFromParcel(Parcel)>
	//   32   68:putfield        #80  <Field Map loggingExtras>
	//   33   71:return          
	}

	LoginClient$Result(Parcel parcel, LoginClient._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #83  <Method void LoginClient$Result(Parcel)>
	//    3    5:return          
	}

	LoginClient$Result( , Code code1, AccessToken accesstoken, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		Validate.notNull(((Object) (code1)), "code");
	//    2    4:aload_2         
	//    3    5:ldc1            #85  <String "code">
	//    4    7:invokestatic    #91  <Method void Validate.notNull(Object, String)>
		request = ;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #72  <Field LoginClient$Request request>
		token = accesstoken;
	//    8   15:aload_0         
	//    9   16:aload_3         
	//   10   17:putfield        #64  <Field AccessToken token>
		errorMessage = s;
	//   11   20:aload_0         
	//   12   21:aload           4
	//   13   23:putfield        #66  <Field String errorMessage>
		code = code1;
	//   14   26:aload_0         
	//   15   27:aload_2         
	//   16   28:putfield        #50  <Field LoginClient$Result$Code code>
		errorCode = s1;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #68  <Field String errorCode>
	//   20   37:return          
	}
}
