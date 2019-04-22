// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.Validate;
import java.util.*;

// Referenced classes of package com.facebook.login:
//			LoginClient, LoginBehavior, DefaultAudience, LoginManager

public static class LoginClient$Request
	implements Parcelable
{

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	String getApplicationId()
	{
		return applicationId;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String applicationId>
	//    2    4:areturn         
	}

	String getAuthId()
	{
		return authId;
	//    0    0:aload_0         
	//    1    1:getfield        #79  <Field String authId>
	//    2    4:areturn         
	}

	String getAuthType()
	{
		return authType;
	//    0    0:aload_0         
	//    1    1:getfield        #87  <Field String authType>
	//    2    4:areturn         
	}

	DefaultAudience getDefaultAudience()
	{
		return defaultAudience;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field DefaultAudience defaultAudience>
	//    2    4:areturn         
	}

	String getDeviceRedirectUriString()
	{
		return deviceRedirectUriString;
	//    0    0:aload_0         
	//    1    1:getfield        #85  <Field String deviceRedirectUriString>
	//    2    4:areturn         
	}

	LoginBehavior getLoginBehavior()
	{
		return loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LoginBehavior loginBehavior>
	//    2    4:areturn         
	}

	Set getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field Set permissions>
	//    2    4:areturn         
	}

	boolean hasPublishPermission()
	{
		for(Iterator iterator = permissions.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #68  <Field Set permissions>
	//*   2    4:invokeinterface #115 <Method Iterator Set.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #120 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            36
			if(LoginManager.isPublishPermission((String)iterator.next()))
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #124 <Method Object Iterator.next()>
	//*   9   25:checkcast       #126 <Class String>
	//*  10   28:invokestatic    #132 <Method boolean LoginManager.isPublishPermission(String)>
	//*  11   31:ifeq            10
				return true;
	//   12   34:iconst_1        
	//   13   35:ireturn         

		return false;
	//   14   36:iconst_0        
	//   15   37:ireturn         
	}

	boolean isRerequest()
	{
		return isRerequest;
	//    0    0:aload_0         
	//    1    1:getfield        #40  <Field boolean isRerequest>
	//    2    4:ireturn         
	}

	void setPermissions(Set set)
	{
		Validate.notNull(((Object) (set)), "permissions");
	//    0    0:aload_1         
	//    1    1:ldc1            #135 <String "permissions">
	//    2    3:invokestatic    #141 <Method void Validate.notNull(Object, String)>
		permissions = set;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #68  <Field Set permissions>
	//    6   11:return          
	}

	void setRerequest(boolean flag)
	{
		isRerequest = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #40  <Field boolean isRerequest>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Object obj = ((Object) (loginBehavior));
	//    0    0:aload_0         
	//    1    1:getfield        #54  <Field LoginBehavior loginBehavior>
	//    2    4:astore_3        
		Object obj1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		if(obj != null)
	//*   5    8:aload_3         
	//*   6    9:ifnull          20
			obj = ((Object) (((LoginBehavior) (obj)).name()));
	//    7   12:aload_3         
	//    8   13:invokevirtual   #149 <Method String LoginBehavior.name()>
	//    9   16:astore_3        
		else
	//*  10   17:goto            22
			obj = null;
	//   11   20:aconst_null     
	//   12   21:astore_3        
		parcel.writeString(((String) (obj)));
	//   13   22:aload_1         
	//   14   23:aload_3         
	//   15   24:invokevirtual   #153 <Method void Parcel.writeString(String)>
		parcel.writeStringList(((java.util.List) (new ArrayList(((java.util.Collection) (permissions))))));
	//   16   27:aload_1         
	//   17   28:new             #56  <Class ArrayList>
	//   18   31:dup             
	//   19   32:aload_0         
	//   20   33:getfield        #68  <Field Set permissions>
	//   21   36:invokespecial   #154 <Method void ArrayList(java.util.Collection)>
	//   22   39:invokevirtual   #157 <Method void Parcel.writeStringList(java.util.List)>
		DefaultAudience defaultaudience = defaultAudience;
	//   23   42:aload_0         
	//   24   43:getfield        #75  <Field DefaultAudience defaultAudience>
	//   25   46:astore          5
		obj = ((Object) (obj1));
	//   26   48:aload           4
	//   27   50:astore_3        
		if(defaultaudience != null)
	//*  28   51:aload           5
	//*  29   53:ifnull          62
			obj = ((Object) (defaultaudience.name()));
	//   30   56:aload           5
	//   31   58:invokevirtual   #158 <Method String DefaultAudience.name()>
	//   32   61:astore_3        
		parcel.writeString(((String) (obj)));
	//   33   62:aload_1         
	//   34   63:aload_3         
	//   35   64:invokevirtual   #153 <Method void Parcel.writeString(String)>
		parcel.writeString(applicationId);
	//   36   67:aload_1         
	//   37   68:aload_0         
	//   38   69:getfield        #77  <Field String applicationId>
	//   39   72:invokevirtual   #153 <Method void Parcel.writeString(String)>
		parcel.writeString(authId);
	//   40   75:aload_1         
	//   41   76:aload_0         
	//   42   77:getfield        #79  <Field String authId>
	//   43   80:invokevirtual   #153 <Method void Parcel.writeString(String)>
		parcel.writeByte((byte)isRerequest);
	//   44   83:aload_1         
	//   45   84:aload_0         
	//   46   85:getfield        #40  <Field boolean isRerequest>
	//   47   88:int2byte        
	//   48   89:invokevirtual   #162 <Method void Parcel.writeByte(byte)>
		parcel.writeString(deviceRedirectUriString);
	//   49   92:aload_1         
	//   50   93:aload_0         
	//   51   94:getfield        #85  <Field String deviceRedirectUriString>
	//   52   97:invokevirtual   #153 <Method void Parcel.writeString(String)>
		parcel.writeString(authType);
	//   53  100:aload_1         
	//   54  101:aload_0         
	//   55  102:getfield        #87  <Field String authType>
	//   56  105:invokevirtual   #153 <Method void Parcel.writeString(String)>
	//   57  108:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public LoginClient.Request createFromParcel(Parcel parcel)
		{
			return new LoginClient.Request(parcel, ((LoginClient._cls1) (null)));
		//    0    0:new             #9   <Class LoginClient$Request>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #22  <Method void LoginClient$Request(Parcel, LoginClient$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #25  <Method LoginClient$Request createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public LoginClient.Request[] newArray(int i)
		{
			return new LoginClient.Request[i];
		//    0    0:iload_1         
		//    1    1:anewarray       LoginClient.Request[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #30  <Method LoginClient$Request[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String applicationId;
	private final String authId;
	private String authType;
	private final DefaultAudience defaultAudience;
	private String deviceRedirectUriString;
	private boolean isRerequest;
	private final LoginBehavior loginBehavior;
	private Set permissions;

	static 
	{
	//    0    0:new             #11  <Class LoginClient$Request$1>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void LoginClient$Request$1()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private LoginClient$Request(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		isRerequest = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #40  <Field boolean isRerequest>
		Object obj = ((Object) (parcel.readString()));
	//    7   11:aload_1         
	//    8   12:invokevirtual   #46  <Method String Parcel.readString()>
	//    9   15:astore_3        
		Object obj1 = null;
	//   10   16:aconst_null     
	//   11   17:astore          4
		if(obj != null)
	//*  12   19:aload_3         
	//*  13   20:ifnull          31
			obj = ((Object) (LoginBehavior.valueOf(((String) (obj)))));
	//   14   23:aload_3         
	//   15   24:invokestatic    #52  <Method LoginBehavior LoginBehavior.valueOf(String)>
	//   16   27:astore_3        
		else
	//*  17   28:goto            33
			obj = null;
	//   18   31:aconst_null     
	//   19   32:astore_3        
		loginBehavior = ((LoginBehavior) (obj));
	//   20   33:aload_0         
	//   21   34:aload_3         
	//   22   35:putfield        #54  <Field LoginBehavior loginBehavior>
		obj = ((Object) (new ArrayList()));
	//   23   38:new             #56  <Class ArrayList>
	//   24   41:dup             
	//   25   42:invokespecial   #57  <Method void ArrayList()>
	//   26   45:astore_3        
		parcel.readStringList(((java.util.List) (obj)));
	//   27   46:aload_1         
	//   28   47:aload_3         
	//   29   48:invokevirtual   #61  <Method void Parcel.readStringList(java.util.List)>
		permissions = ((Set) (new HashSet(((java.util.Collection) (obj)))));
	//   30   51:aload_0         
	//   31   52:new             #63  <Class HashSet>
	//   32   55:dup             
	//   33   56:aload_3         
	//   34   57:invokespecial   #66  <Method void HashSet(java.util.Collection)>
	//   35   60:putfield        #68  <Field Set permissions>
		String s = parcel.readString();
	//   36   63:aload_1         
	//   37   64:invokevirtual   #46  <Method String Parcel.readString()>
	//   38   67:astore          5
		obj = ((Object) (obj1));
	//   39   69:aload           4
	//   40   71:astore_3        
		if(s != null)
	//*  41   72:aload           5
	//*  42   74:ifnull          83
			obj = ((Object) (DefaultAudience.valueOf(s)));
	//   43   77:aload           5
	//   44   79:invokestatic    #73  <Method DefaultAudience DefaultAudience.valueOf(String)>
	//   45   82:astore_3        
		defaultAudience = ((DefaultAudience) (obj));
	//   46   83:aload_0         
	//   47   84:aload_3         
	//   48   85:putfield        #75  <Field DefaultAudience defaultAudience>
		applicationId = parcel.readString();
	//   49   88:aload_0         
	//   50   89:aload_1         
	//   51   90:invokevirtual   #46  <Method String Parcel.readString()>
	//   52   93:putfield        #77  <Field String applicationId>
		authId = parcel.readString();
	//   53   96:aload_0         
	//   54   97:aload_1         
	//   55   98:invokevirtual   #46  <Method String Parcel.readString()>
	//   56  101:putfield        #79  <Field String authId>
		if(parcel.readByte() != 0)
	//*  57  104:aload_1         
	//*  58  105:invokevirtual   #83  <Method byte Parcel.readByte()>
	//*  59  108:ifeq            113
			flag = true;
	//   60  111:iconst_1        
	//   61  112:istore_2        
		isRerequest = flag;
	//   62  113:aload_0         
	//   63  114:iload_2         
	//   64  115:putfield        #40  <Field boolean isRerequest>
		deviceRedirectUriString = parcel.readString();
	//   65  118:aload_0         
	//   66  119:aload_1         
	//   67  120:invokevirtual   #46  <Method String Parcel.readString()>
	//   68  123:putfield        #85  <Field String deviceRedirectUriString>
		authType = parcel.readString();
	//   69  126:aload_0         
	//   70  127:aload_1         
	//   71  128:invokevirtual   #46  <Method String Parcel.readString()>
	//   72  131:putfield        #87  <Field String authType>
	//   73  134:return          
	}

	LoginClient$Request(Parcel parcel, LoginClient._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #90  <Method void LoginClient$Request(Parcel)>
	//    3    5:return          
	}

	LoginClient$Request(LoginBehavior loginbehavior, Set set, DefaultAudience defaultaudience, String s, String s1, String s2)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #38  <Method void Object()>
		isRerequest = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #40  <Field boolean isRerequest>
		loginBehavior = loginbehavior;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #54  <Field LoginBehavior loginBehavior>
		if(set == null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          21
	//*  10   18:goto            29
			set = ((Set) (new HashSet()));
	//   11   21:new             #63  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #92  <Method void HashSet()>
	//   14   28:astore_2        
		permissions = set;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #68  <Field Set permissions>
		defaultAudience = defaultaudience;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:putfield        #75  <Field DefaultAudience defaultAudience>
		authType = s;
	//   21   39:aload_0         
	//   22   40:aload           4
	//   23   42:putfield        #87  <Field String authType>
		applicationId = s1;
	//   24   45:aload_0         
	//   25   46:aload           5
	//   26   48:putfield        #77  <Field String applicationId>
		authId = s2;
	//   27   51:aload_0         
	//   28   52:aload           6
	//   29   54:putfield        #79  <Field String authId>
	//   30   57:return          
	}
}
