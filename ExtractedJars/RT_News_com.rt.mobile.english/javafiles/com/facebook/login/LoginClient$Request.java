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
	//    1    1:getfield        #75  <Field String applicationId>
	//    2    4:areturn         
	}

	String getAuthId()
	{
		return authId;
	//    0    0:aload_0         
	//    1    1:getfield        #77  <Field String authId>
	//    2    4:areturn         
	}

	DefaultAudience getDefaultAudience()
	{
		return defaultAudience;
	//    0    0:aload_0         
	//    1    1:getfield        #73  <Field DefaultAudience defaultAudience>
	//    2    4:areturn         
	}

	LoginBehavior getLoginBehavior()
	{
		return loginBehavior;
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field LoginBehavior loginBehavior>
	//    2    4:areturn         
	}

	Set getPermissions()
	{
		return permissions;
	//    0    0:aload_0         
	//    1    1:getfield        #66  <Field Set permissions>
	//    2    4:areturn         
	}

	boolean hasPublishPermission()
	{
		for(Iterator iterator = permissions.iterator(); iterator.hasNext();)
	//*   0    0:aload_0         
	//*   1    1:getfield        #66  <Field Set permissions>
	//*   2    4:invokeinterface #107 <Method Iterator Set.iterator()>
	//*   3    9:astore_1        
	//*   4   10:aload_1         
	//*   5   11:invokeinterface #112 <Method boolean Iterator.hasNext()>
	//*   6   16:ifeq            36
			if(LoginManager.isPublishPermission((String)iterator.next()))
	//*   7   19:aload_1         
	//*   8   20:invokeinterface #116 <Method Object Iterator.next()>
	//*   9   25:checkcast       #118 <Class String>
	//*  10   28:invokestatic    #124 <Method boolean LoginManager.isPublishPermission(String)>
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
	//    1    1:getfield        #38  <Field boolean isRerequest>
	//    2    4:ireturn         
	}

	void setPermissions(Set set)
	{
		Validate.notNull(((Object) (set)), "permissions");
	//    0    0:aload_1         
	//    1    1:ldc1            #127 <String "permissions">
	//    2    3:invokestatic    #133 <Method void Validate.notNull(Object, String)>
		permissions = set;
	//    3    6:aload_0         
	//    4    7:aload_1         
	//    5    8:putfield        #66  <Field Set permissions>
	//    6   11:return          
	}

	void setRerequest(boolean flag)
	{
		isRerequest = flag;
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:putfield        #38  <Field boolean isRerequest>
	//    3    5:return          
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		Object obj = ((Object) (loginBehavior));
	//    0    0:aload_0         
	//    1    1:getfield        #52  <Field LoginBehavior loginBehavior>
	//    2    4:astore_3        
		Object obj1 = null;
	//    3    5:aconst_null     
	//    4    6:astore          4
		if(obj != null)
	//*   5    8:aload_3         
	//*   6    9:ifnull          23
			obj = ((Object) (loginBehavior.name()));
	//    7   12:aload_0         
	//    8   13:getfield        #52  <Field LoginBehavior loginBehavior>
	//    9   16:invokevirtual   #141 <Method String LoginBehavior.name()>
	//   10   19:astore_3        
		else
	//*  11   20:goto            25
			obj = null;
	//   12   23:aconst_null     
	//   13   24:astore_3        
		parcel.writeString(((String) (obj)));
	//   14   25:aload_1         
	//   15   26:aload_3         
	//   16   27:invokevirtual   #145 <Method void Parcel.writeString(String)>
		parcel.writeStringList(((java.util.List) (new ArrayList(((java.util.Collection) (permissions))))));
	//   17   30:aload_1         
	//   18   31:new             #54  <Class ArrayList>
	//   19   34:dup             
	//   20   35:aload_0         
	//   21   36:getfield        #66  <Field Set permissions>
	//   22   39:invokespecial   #146 <Method void ArrayList(java.util.Collection)>
	//   23   42:invokevirtual   #149 <Method void Parcel.writeStringList(java.util.List)>
		obj = ((Object) (obj1));
	//   24   45:aload           4
	//   25   47:astore_3        
		if(defaultAudience != null)
	//*  26   48:aload_0         
	//*  27   49:getfield        #73  <Field DefaultAudience defaultAudience>
	//*  28   52:ifnull          63
			obj = ((Object) (defaultAudience.name()));
	//   29   55:aload_0         
	//   30   56:getfield        #73  <Field DefaultAudience defaultAudience>
	//   31   59:invokevirtual   #150 <Method String DefaultAudience.name()>
	//   32   62:astore_3        
		parcel.writeString(((String) (obj)));
	//   33   63:aload_1         
	//   34   64:aload_3         
	//   35   65:invokevirtual   #145 <Method void Parcel.writeString(String)>
		parcel.writeString(applicationId);
	//   36   68:aload_1         
	//   37   69:aload_0         
	//   38   70:getfield        #75  <Field String applicationId>
	//   39   73:invokevirtual   #145 <Method void Parcel.writeString(String)>
		parcel.writeString(authId);
	//   40   76:aload_1         
	//   41   77:aload_0         
	//   42   78:getfield        #77  <Field String authId>
	//   43   81:invokevirtual   #145 <Method void Parcel.writeString(String)>
		parcel.writeByte((byte)isRerequest);
	//   44   84:aload_1         
	//   45   85:aload_0         
	//   46   86:getfield        #38  <Field boolean isRerequest>
	//   47   89:int2byte        
	//   48   90:invokevirtual   #154 <Method void Parcel.writeByte(byte)>
	//   49   93:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public LoginClient.Request createFromParcel(Parcel parcel)
		{
			return new LoginClient.Request(parcel, ((LoginClient._cls1) (null)));
		//    0    0:new             #8   <Class LoginClient$Request>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #21  <Method void LoginClient$Request(Parcel, LoginClient$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #24  <Method LoginClient$Request createFromParcel(Parcel)>
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
		//    2    2:invokevirtual   #29  <Method LoginClient$Request[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private final String applicationId;
	private final String authId;
	private final DefaultAudience defaultAudience;
	private boolean isRerequest;
	private final LoginBehavior loginBehavior;
	private Set permissions;

	static 
	{
	//    0    0:new             #11  <Class LoginClient$Request$1>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void LoginClient$Request$1()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}

	private LoginClient$Request(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		boolean flag = false;
	//    2    4:iconst_0        
	//    3    5:istore_2        
		isRerequest = false;
	//    4    6:aload_0         
	//    5    7:iconst_0        
	//    6    8:putfield        #38  <Field boolean isRerequest>
		Object obj = ((Object) (parcel.readString()));
	//    7   11:aload_1         
	//    8   12:invokevirtual   #44  <Method String Parcel.readString()>
	//    9   15:astore_3        
		Object obj1 = null;
	//   10   16:aconst_null     
	//   11   17:astore          4
		if(obj != null)
	//*  12   19:aload_3         
	//*  13   20:ifnull          31
			obj = ((Object) (LoginBehavior.valueOf(((String) (obj)))));
	//   14   23:aload_3         
	//   15   24:invokestatic    #50  <Method LoginBehavior LoginBehavior.valueOf(String)>
	//   16   27:astore_3        
		else
	//*  17   28:goto            33
			obj = null;
	//   18   31:aconst_null     
	//   19   32:astore_3        
		loginBehavior = ((LoginBehavior) (obj));
	//   20   33:aload_0         
	//   21   34:aload_3         
	//   22   35:putfield        #52  <Field LoginBehavior loginBehavior>
		obj = ((Object) (new ArrayList()));
	//   23   38:new             #54  <Class ArrayList>
	//   24   41:dup             
	//   25   42:invokespecial   #55  <Method void ArrayList()>
	//   26   45:astore_3        
		parcel.readStringList(((java.util.List) (obj)));
	//   27   46:aload_1         
	//   28   47:aload_3         
	//   29   48:invokevirtual   #59  <Method void Parcel.readStringList(java.util.List)>
		permissions = ((Set) (new HashSet(((java.util.Collection) (obj)))));
	//   30   51:aload_0         
	//   31   52:new             #61  <Class HashSet>
	//   32   55:dup             
	//   33   56:aload_3         
	//   34   57:invokespecial   #64  <Method void HashSet(java.util.Collection)>
	//   35   60:putfield        #66  <Field Set permissions>
		String s = parcel.readString();
	//   36   63:aload_1         
	//   37   64:invokevirtual   #44  <Method String Parcel.readString()>
	//   38   67:astore          5
		obj = ((Object) (obj1));
	//   39   69:aload           4
	//   40   71:astore_3        
		if(s != null)
	//*  41   72:aload           5
	//*  42   74:ifnull          83
			obj = ((Object) (DefaultAudience.valueOf(s)));
	//   43   77:aload           5
	//   44   79:invokestatic    #71  <Method DefaultAudience DefaultAudience.valueOf(String)>
	//   45   82:astore_3        
		defaultAudience = ((DefaultAudience) (obj));
	//   46   83:aload_0         
	//   47   84:aload_3         
	//   48   85:putfield        #73  <Field DefaultAudience defaultAudience>
		applicationId = parcel.readString();
	//   49   88:aload_0         
	//   50   89:aload_1         
	//   51   90:invokevirtual   #44  <Method String Parcel.readString()>
	//   52   93:putfield        #75  <Field String applicationId>
		authId = parcel.readString();
	//   53   96:aload_0         
	//   54   97:aload_1         
	//   55   98:invokevirtual   #44  <Method String Parcel.readString()>
	//   56  101:putfield        #77  <Field String authId>
		if(parcel.readByte() != 0)
	//*  57  104:aload_1         
	//*  58  105:invokevirtual   #81  <Method byte Parcel.readByte()>
	//*  59  108:ifeq            113
			flag = true;
	//   60  111:iconst_1        
	//   61  112:istore_2        
		isRerequest = flag;
	//   62  113:aload_0         
	//   63  114:iload_2         
	//   64  115:putfield        #38  <Field boolean isRerequest>
	//   65  118:return          
	}

	LoginClient$Request(Parcel parcel, LoginClient._cls1 _pcls1)
	{
		this(parcel);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void LoginClient$Request(Parcel)>
	//    3    5:return          
	}

	LoginClient$Request(LoginBehavior loginbehavior, Set set, DefaultAudience defaultaudience, String s, String s1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #36  <Method void Object()>
		isRerequest = false;
	//    2    4:aload_0         
	//    3    5:iconst_0        
	//    4    6:putfield        #38  <Field boolean isRerequest>
		loginBehavior = loginbehavior;
	//    5    9:aload_0         
	//    6   10:aload_1         
	//    7   11:putfield        #52  <Field LoginBehavior loginBehavior>
		if(set == null)
	//*   8   14:aload_2         
	//*   9   15:ifnull          21
	//*  10   18:goto            29
			set = ((Set) (new HashSet()));
	//   11   21:new             #61  <Class HashSet>
	//   12   24:dup             
	//   13   25:invokespecial   #86  <Method void HashSet()>
	//   14   28:astore_2        
		permissions = set;
	//   15   29:aload_0         
	//   16   30:aload_2         
	//   17   31:putfield        #66  <Field Set permissions>
		defaultAudience = defaultaudience;
	//   18   34:aload_0         
	//   19   35:aload_3         
	//   20   36:putfield        #73  <Field DefaultAudience defaultAudience>
		applicationId = s;
	//   21   39:aload_0         
	//   22   40:aload           4
	//   23   42:putfield        #75  <Field String applicationId>
		authId = s1;
	//   24   45:aload_0         
	//   25   46:aload           5
	//   26   48:putfield        #77  <Field String authId>
	//   27   51:return          
	}
}
