// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.ImageRequest;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//			AccessToken, ProfileManager, FacebookException

public final class Profile
	implements Parcelable
{

	private Profile(Parcel parcel)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		id = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #53  <Method String Parcel.readString()>
	//    5    9:putfield        #55  <Field String id>
		firstName = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #53  <Method String Parcel.readString()>
	//    9   17:putfield        #57  <Field String firstName>
		middleName = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #53  <Method String Parcel.readString()>
	//   13   25:putfield        #59  <Field String middleName>
		lastName = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #53  <Method String Parcel.readString()>
	//   17   33:putfield        #61  <Field String lastName>
		name = parcel.readString();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #53  <Method String Parcel.readString()>
	//   21   41:putfield        #63  <Field String name>
		parcel = ((Parcel) (parcel.readString()));
	//   22   44:aload_1         
	//   23   45:invokevirtual   #53  <Method String Parcel.readString()>
	//   24   48:astore_1        
		if(parcel == null)
	//*  25   49:aload_1         
	//*  26   50:ifnonnull       58
			parcel = null;
	//   27   53:aconst_null     
	//   28   54:astore_1        
		else
	//*  29   55:goto            63
			parcel = ((Parcel) (Uri.parse(((String) (parcel)))));
	//   30   58:aload_1         
	//   31   59:invokestatic    #69  <Method Uri Uri.parse(String)>
	//   32   62:astore_1        
		linkUri = ((Uri) (parcel));
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:putfield        #71  <Field Uri linkUri>
	//   36   68:return          
	}


	public Profile(String s, String s1, String s2, String s3, String s4, Uri uri)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		Validate.notNullOrEmpty(s, "id");
	//    2    4:aload_1         
	//    3    5:ldc1            #20  <String "id">
	//    4    7:invokestatic    #82  <Method void Validate.notNullOrEmpty(String, String)>
		id = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #55  <Field String id>
		firstName = s1;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #57  <Field String firstName>
		middleName = s2;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #59  <Field String middleName>
		lastName = s3;
	//   14   25:aload_0         
	//   15   26:aload           4
	//   16   28:putfield        #61  <Field String lastName>
		name = s4;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #63  <Field String name>
		linkUri = uri;
	//   20   37:aload_0         
	//   21   38:aload           6
	//   22   40:putfield        #71  <Field Uri linkUri>
	//   23   43:return          
	}

	Profile(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #47  <Method void Object()>
		Object obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		id = jsonobject.optString("id", ((String) (null)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:ldc1            #20  <String "id">
	//    7   10:aconst_null     
	//    8   11:invokevirtual   #90  <Method String JSONObject.optString(String, String)>
	//    9   14:putfield        #55  <Field String id>
		firstName = jsonobject.optString("first_name", ((String) (null)));
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:ldc1            #17  <String "first_name">
	//   13   21:aconst_null     
	//   14   22:invokevirtual   #90  <Method String JSONObject.optString(String, String)>
	//   15   25:putfield        #57  <Field String firstName>
		middleName = jsonobject.optString("middle_name", ((String) (null)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:ldc1            #29  <String "middle_name">
	//   19   32:aconst_null     
	//   20   33:invokevirtual   #90  <Method String JSONObject.optString(String, String)>
	//   21   36:putfield        #59  <Field String middleName>
		lastName = jsonobject.optString("last_name", ((String) (null)));
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:ldc1            #23  <String "last_name">
	//   25   43:aconst_null     
	//   26   44:invokevirtual   #90  <Method String JSONObject.optString(String, String)>
	//   27   47:putfield        #61  <Field String lastName>
		name = jsonobject.optString("name", ((String) (null)));
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:ldc1            #32  <String "name">
	//   31   54:aconst_null     
	//   32   55:invokevirtual   #90  <Method String JSONObject.optString(String, String)>
	//   33   58:putfield        #63  <Field String name>
		jsonobject = ((JSONObject) (jsonobject.optString("link_uri", ((String) (null)))));
	//   34   61:aload_1         
	//   35   62:ldc1            #26  <String "link_uri">
	//   36   64:aconst_null     
	//   37   65:invokevirtual   #90  <Method String JSONObject.optString(String, String)>
	//   38   68:astore_1        
		if(jsonobject == null)
	//*  39   69:aload_1         
	//*  40   70:ifnonnull       78
			jsonobject = ((JSONObject) (obj));
	//   41   73:aload_2         
	//   42   74:astore_1        
		else
	//*  43   75:goto            83
			jsonobject = ((JSONObject) (Uri.parse(((String) (jsonobject)))));
	//   44   78:aload_1         
	//   45   79:invokestatic    #69  <Method Uri Uri.parse(String)>
	//   46   82:astore_1        
		linkUri = ((Uri) (jsonobject));
	//   47   83:aload_0         
	//   48   84:aload_1         
	//   49   85:putfield        #71  <Field Uri linkUri>
	//   50   88:return          
	}

	public static void fetchProfileForCurrentAccessToken()
	{
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//    0    0:invokestatic    #97  <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    1    3:astore_0        
		if(accesstoken == null)
	//*   2    4:aload_0         
	//*   3    5:ifnonnull       13
		{
			setCurrentProfile(((Profile) (null)));
	//    4    8:aconst_null     
	//    5    9:invokestatic    #101 <Method void setCurrentProfile(Profile)>
			return;
	//    6   12:return          
		} else
		{
			Utility.getGraphMeRequestWithCacheAsync(accesstoken.getToken(), new com.facebook.internal.Utility.GraphMeRequestWithCacheCallback() {

				public void onFailure(FacebookException facebookexception)
				{
				//    0    0:return          
				}

				public void onSuccess(JSONObject jsonobject)
				{
					String s = jsonobject.optString("id");
				//    0    0:aload_1         
				//    1    1:ldc1            #21  <String "id">
				//    2    3:invokevirtual   #27  <Method String JSONObject.optString(String)>
				//    3    6:astore_2        
					if(s == null)
				//*   4    7:aload_2         
				//*   5    8:ifnonnull       12
						return;
				//    6   11:return          
					String s5 = jsonobject.optString("link");
				//    7   12:aload_1         
				//    8   13:ldc1            #29  <String "link">
				//    9   15:invokevirtual   #27  <Method String JSONObject.optString(String)>
				//   10   18:astore          7
					String s1 = jsonobject.optString("first_name");
				//   11   20:aload_1         
				//   12   21:ldc1            #31  <String "first_name">
				//   13   23:invokevirtual   #27  <Method String JSONObject.optString(String)>
				//   14   26:astore_3        
					String s2 = jsonobject.optString("middle_name");
				//   15   27:aload_1         
				//   16   28:ldc1            #33  <String "middle_name">
				//   17   30:invokevirtual   #27  <Method String JSONObject.optString(String)>
				//   18   33:astore          4
					String s3 = jsonobject.optString("last_name");
				//   19   35:aload_1         
				//   20   36:ldc1            #35  <String "last_name">
				//   21   38:invokevirtual   #27  <Method String JSONObject.optString(String)>
				//   22   41:astore          5
					String s4 = jsonobject.optString("name");
				//   23   43:aload_1         
				//   24   44:ldc1            #37  <String "name">
				//   25   46:invokevirtual   #27  <Method String JSONObject.optString(String)>
				//   26   49:astore          6
					if(s5 != null)
				//*  27   51:aload           7
				//*  28   53:ifnull          65
						jsonobject = ((JSONObject) (Uri.parse(s5)));
				//   29   56:aload           7
				//   30   58:invokestatic    #43  <Method Uri Uri.parse(String)>
				//   31   61:astore_1        
					else
				//*  32   62:goto            70
						jsonobject = null;
				//   33   65:aconst_null     
				//   34   66:astore_1        
				//*  35   67:goto            62
					Profile.setCurrentProfile(new Profile(s, s1, s2, s3, s4, ((Uri) (jsonobject))));
				//   36   70:new             #8   <Class Profile>
				//   37   73:dup             
				//   38   74:aload_2         
				//   39   75:aload_3         
				//   40   76:aload           4
				//   41   78:aload           5
				//   42   80:aload           6
				//   43   82:aload_1         
				//   44   83:invokespecial   #46  <Method void Profile(String, String, String, String, String, Uri)>
				//   45   86:invokestatic    #50  <Method void Profile.setCurrentProfile(Profile)>
				//   46   89:return          
				}

			}
);
	//    7   13:aload_0         
	//    8   14:invokevirtual   #104 <Method String AccessToken.getToken()>
	//    9   17:new             #8   <Class Profile$1>
	//   10   20:dup             
	//   11   21:invokespecial   #105 <Method void Profile$1()>
	//   12   24:invokestatic    #111 <Method void Utility.getGraphMeRequestWithCacheAsync(String, com.facebook.internal.Utility$GraphMeRequestWithCacheCallback)>
			return;
	//   13   27:return          
		}
	}

	public static Profile getCurrentProfile()
	{
		return ProfileManager.getInstance().getCurrentProfile();
	//    0    0:invokestatic    #119 <Method ProfileManager ProfileManager.getInstance()>
	//    1    3:invokevirtual   #121 <Method Profile ProfileManager.getCurrentProfile()>
	//    2    6:areturn         
	}

	public static void setCurrentProfile(Profile profile)
	{
		ProfileManager.getInstance().setCurrentProfile(profile);
	//    0    0:invokestatic    #119 <Method ProfileManager ProfileManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #122 <Method void ProfileManager.setCurrentProfile(Profile)>
	//    3    7:return          
	}

	public int describeContents()
	{
		return 0;
	//    0    0:iconst_0        
	//    1    1:ireturn         
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
		if(!(obj instanceof Profile))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Profile>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((Profile)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class Profile>
	//   12   20:astore_1        
		if(!id.equals(((Object) (((Profile) (obj)).id))) || firstName != null) goto _L2; else goto _L1
	//   13   21:aload_0         
	//   14   22:getfield        #55  <Field String id>
	//   15   25:aload_1         
	//   16   26:getfield        #55  <Field String id>
	//   17   29:invokevirtual   #130 <Method boolean String.equals(Object)>
	//   18   32:ifeq            53
	//   19   35:aload_0         
	//   20   36:getfield        #57  <Field String firstName>
	//   21   39:ifnonnull       53
_L1:
		if(((Profile) (obj)).firstName == null)
	//*  22   42:aload_1         
	//*  23   43:getfield        #57  <Field String firstName>
	//*  24   46:ifnonnull       51
			return true;
	//   25   49:iconst_1        
	//   26   50:ireturn         
_L4:
		return false;
	//   27   51:iconst_0        
	//   28   52:ireturn         
_L2:
		if(!firstName.equals(((Object) (((Profile) (obj)).firstName))) || middleName != null)
			break; /* Loop/switch isn't completed */
	//   29   53:aload_0         
	//   30   54:getfield        #57  <Field String firstName>
	//   31   57:aload_1         
	//   32   58:getfield        #57  <Field String firstName>
	//   33   61:invokevirtual   #130 <Method boolean String.equals(Object)>
	//   34   64:ifeq            83
	//   35   67:aload_0         
	//   36   68:getfield        #59  <Field String middleName>
	//   37   71:ifnonnull       83
		if(((Profile) (obj)).middleName == null)
	//*  38   74:aload_1         
	//*  39   75:getfield        #59  <Field String middleName>
	//*  40   78:ifnonnull       51
			return true;
	//   41   81:iconst_1        
	//   42   82:ireturn         
		if(true) goto _L4; else goto _L3
_L3:
		if(!middleName.equals(((Object) (((Profile) (obj)).middleName))) || lastName != null)
			break; /* Loop/switch isn't completed */
	//   43   83:aload_0         
	//   44   84:getfield        #59  <Field String middleName>
	//   45   87:aload_1         
	//   46   88:getfield        #59  <Field String middleName>
	//   47   91:invokevirtual   #130 <Method boolean String.equals(Object)>
	//   48   94:ifeq            113
	//   49   97:aload_0         
	//   50   98:getfield        #61  <Field String lastName>
	//   51  101:ifnonnull       113
		if(((Profile) (obj)).lastName == null)
	//*  52  104:aload_1         
	//*  53  105:getfield        #61  <Field String lastName>
	//*  54  108:ifnonnull       51
			return true;
	//   55  111:iconst_1        
	//   56  112:ireturn         
		if(true) goto _L4; else goto _L5
_L5:
		if(!lastName.equals(((Object) (((Profile) (obj)).lastName))) || name != null)
			break; /* Loop/switch isn't completed */
	//   57  113:aload_0         
	//   58  114:getfield        #61  <Field String lastName>
	//   59  117:aload_1         
	//   60  118:getfield        #61  <Field String lastName>
	//   61  121:invokevirtual   #130 <Method boolean String.equals(Object)>
	//   62  124:ifeq            143
	//   63  127:aload_0         
	//   64  128:getfield        #63  <Field String name>
	//   65  131:ifnonnull       143
		if(((Profile) (obj)).name == null)
	//*  66  134:aload_1         
	//*  67  135:getfield        #63  <Field String name>
	//*  68  138:ifnonnull       51
			return true;
	//   69  141:iconst_1        
	//   70  142:ireturn         
		if(true) goto _L4; else goto _L6
_L6:
		if(name.equals(((Object) (((Profile) (obj)).name))) && linkUri == null)
	//*  71  143:aload_0         
	//*  72  144:getfield        #63  <Field String name>
	//*  73  147:aload_1         
	//*  74  148:getfield        #63  <Field String name>
	//*  75  151:invokevirtual   #130 <Method boolean String.equals(Object)>
	//*  76  154:ifeq            173
	//*  77  157:aload_0         
	//*  78  158:getfield        #71  <Field Uri linkUri>
	//*  79  161:ifnonnull       173
		{
			if(((Profile) (obj)).linkUri == null)
	//*  80  164:aload_1         
	//*  81  165:getfield        #71  <Field Uri linkUri>
	//*  82  168:ifnonnull       51
				return true;
	//   83  171:iconst_1        
	//   84  172:ireturn         
		} else
		{
			return linkUri.equals(((Object) (((Profile) (obj)).linkUri)));
	//   85  173:aload_0         
	//   86  174:getfield        #71  <Field Uri linkUri>
	//   87  177:aload_1         
	//   88  178:getfield        #71  <Field Uri linkUri>
	//   89  181:invokevirtual   #131 <Method boolean Uri.equals(Object)>
	//   90  184:ireturn         
		}
		if(true) goto _L4; else goto _L7
_L7:
	}

	public String getFirstName()
	{
		return firstName;
	//    0    0:aload_0         
	//    1    1:getfield        #57  <Field String firstName>
	//    2    4:areturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String id>
	//    2    4:areturn         
	}

	public String getLastName()
	{
		return lastName;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String lastName>
	//    2    4:areturn         
	}

	public Uri getLinkUri()
	{
		return linkUri;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field Uri linkUri>
	//    2    4:areturn         
	}

	public String getMiddleName()
	{
		return middleName;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String middleName>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String name>
	//    2    4:areturn         
	}

	public Uri getProfilePictureUri(int i, int j)
	{
		return ImageRequest.getProfilePictureUri(id, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #55  <Field String id>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #145 <Method Uri ImageRequest.getProfilePictureUri(String, int, int)>
	//    5    9:areturn         
	}

	public int hashCode()
	{
		int j = 527 + id.hashCode();
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #55  <Field String id>
	//    3    7:invokevirtual   #148 <Method int String.hashCode()>
	//    4   10:iadd            
	//    5   11:istore_2        
		int i = j;
	//    6   12:iload_2         
	//    7   13:istore_1        
		if(firstName != null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #57  <Field String firstName>
	//*  10   18:ifnull          34
			i = j * 31 + firstName.hashCode();
	//   11   21:iload_2         
	//   12   22:bipush          31
	//   13   24:imul            
	//   14   25:aload_0         
	//   15   26:getfield        #57  <Field String firstName>
	//   16   29:invokevirtual   #148 <Method int String.hashCode()>
	//   17   32:iadd            
	//   18   33:istore_1        
		j = i;
	//   19   34:iload_1         
	//   20   35:istore_2        
		if(middleName != null)
	//*  21   36:aload_0         
	//*  22   37:getfield        #59  <Field String middleName>
	//*  23   40:ifnull          56
			j = i * 31 + middleName.hashCode();
	//   24   43:iload_1         
	//   25   44:bipush          31
	//   26   46:imul            
	//   27   47:aload_0         
	//   28   48:getfield        #59  <Field String middleName>
	//   29   51:invokevirtual   #148 <Method int String.hashCode()>
	//   30   54:iadd            
	//   31   55:istore_2        
		i = j;
	//   32   56:iload_2         
	//   33   57:istore_1        
		if(lastName != null)
	//*  34   58:aload_0         
	//*  35   59:getfield        #61  <Field String lastName>
	//*  36   62:ifnull          78
			i = j * 31 + lastName.hashCode();
	//   37   65:iload_2         
	//   38   66:bipush          31
	//   39   68:imul            
	//   40   69:aload_0         
	//   41   70:getfield        #61  <Field String lastName>
	//   42   73:invokevirtual   #148 <Method int String.hashCode()>
	//   43   76:iadd            
	//   44   77:istore_1        
		j = i;
	//   45   78:iload_1         
	//   46   79:istore_2        
		if(name != null)
	//*  47   80:aload_0         
	//*  48   81:getfield        #63  <Field String name>
	//*  49   84:ifnull          100
			j = i * 31 + name.hashCode();
	//   50   87:iload_1         
	//   51   88:bipush          31
	//   52   90:imul            
	//   53   91:aload_0         
	//   54   92:getfield        #63  <Field String name>
	//   55   95:invokevirtual   #148 <Method int String.hashCode()>
	//   56   98:iadd            
	//   57   99:istore_2        
		i = j;
	//   58  100:iload_2         
	//   59  101:istore_1        
		if(linkUri != null)
	//*  60  102:aload_0         
	//*  61  103:getfield        #71  <Field Uri linkUri>
	//*  62  106:ifnull          122
			i = j * 31 + linkUri.hashCode();
	//   63  109:iload_2         
	//   64  110:bipush          31
	//   65  112:imul            
	//   66  113:aload_0         
	//   67  114:getfield        #71  <Field Uri linkUri>
	//   68  117:invokevirtual   #149 <Method int Uri.hashCode()>
	//   69  120:iadd            
	//   70  121:istore_1        
		return i;
	//   71  122:iload_1         
	//   72  123:ireturn         
	}

	JSONObject toJSONObject()
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #86  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #154 <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject1.put("id", ((Object) (id)));
	//    4    8:aload_2         
	//    5    9:ldc1            #20  <String "id">
	//    6   11:aload_0         
	//    7   12:getfield        #55  <Field String id>
	//    8   15:invokevirtual   #158 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		jsonobject1.put("first_name", ((Object) (firstName)));
	//   10   19:aload_2         
	//   11   20:ldc1            #17  <String "first_name">
	//   12   22:aload_0         
	//   13   23:getfield        #57  <Field String firstName>
	//   14   26:invokevirtual   #158 <Method JSONObject JSONObject.put(String, Object)>
	//   15   29:pop             
		jsonobject1.put("middle_name", ((Object) (middleName)));
	//   16   30:aload_2         
	//   17   31:ldc1            #29  <String "middle_name">
	//   18   33:aload_0         
	//   19   34:getfield        #59  <Field String middleName>
	//   20   37:invokevirtual   #158 <Method JSONObject JSONObject.put(String, Object)>
	//   21   40:pop             
		jsonobject1.put("last_name", ((Object) (lastName)));
	//   22   41:aload_2         
	//   23   42:ldc1            #23  <String "last_name">
	//   24   44:aload_0         
	//   25   45:getfield        #61  <Field String lastName>
	//   26   48:invokevirtual   #158 <Method JSONObject JSONObject.put(String, Object)>
	//   27   51:pop             
		jsonobject1.put("name", ((Object) (name)));
	//   28   52:aload_2         
	//   29   53:ldc1            #32  <String "name">
	//   30   55:aload_0         
	//   31   56:getfield        #63  <Field String name>
	//   32   59:invokevirtual   #158 <Method JSONObject JSONObject.put(String, Object)>
	//   33   62:pop             
		JSONObject jsonobject = jsonobject1;
	//   34   63:aload_2         
	//   35   64:astore_1        
		if(linkUri == null) goto _L2; else goto _L1
	//   36   65:aload_0         
	//   37   66:getfield        #71  <Field Uri linkUri>
	//   38   69:ifnull          90
_L1:
		jsonobject1.put("link_uri", ((Object) (linkUri.toString())));
	//   39   72:aload_2         
	//   40   73:ldc1            #26  <String "link_uri">
	//   41   75:aload_0         
	//   42   76:getfield        #71  <Field Uri linkUri>
	//   43   79:invokevirtual   #161 <Method String Uri.toString()>
	//   44   82:invokevirtual   #158 <Method JSONObject JSONObject.put(String, Object)>
	//   45   85:pop             
		return jsonobject1;
	//   46   86:aload_2         
	//   47   87:areturn         
_L4:
		jsonobject = null;
	//   48   88:aconst_null     
	//   49   89:astore_1        
_L2:
		return jsonobject;
	//   50   90:aload_1         
	//   51   91:areturn         
		JSONException jsonexception;
		jsonexception;
	//   52   92:astore_1        
		if(true) goto _L4; else goto _L3
_L3:
	//*  53   93:goto            88
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		parcel.writeString(id);
	//    0    0:aload_1         
	//    1    1:aload_0         
	//    2    2:getfield        #55  <Field String id>
	//    3    5:invokevirtual   #167 <Method void Parcel.writeString(String)>
		parcel.writeString(firstName);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #57  <Field String firstName>
	//    7   13:invokevirtual   #167 <Method void Parcel.writeString(String)>
		parcel.writeString(middleName);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #59  <Field String middleName>
	//   11   21:invokevirtual   #167 <Method void Parcel.writeString(String)>
		parcel.writeString(lastName);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #61  <Field String lastName>
	//   15   29:invokevirtual   #167 <Method void Parcel.writeString(String)>
		parcel.writeString(name);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #63  <Field String name>
	//   19   37:invokevirtual   #167 <Method void Parcel.writeString(String)>
		String s;
		if(linkUri == null)
	//*  20   40:aload_0         
	//*  21   41:getfield        #71  <Field Uri linkUri>
	//*  22   44:ifnonnull       52
			s = null;
	//   23   47:aconst_null     
	//   24   48:astore_3        
		else
	//*  25   49:goto            60
			s = linkUri.toString();
	//   26   52:aload_0         
	//   27   53:getfield        #71  <Field Uri linkUri>
	//   28   56:invokevirtual   #161 <Method String Uri.toString()>
	//   29   59:astore_3        
		parcel.writeString(s);
	//   30   60:aload_1         
	//   31   61:aload_3         
	//   32   62:invokevirtual   #167 <Method void Parcel.writeString(String)>
	//   33   65:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Profile createFromParcel(Parcel parcel)
		{
			return new Profile(parcel);
		//    0    0:new             #8   <Class Profile>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #18  <Method void Profile(Parcel, Profile$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #21  <Method Profile createFromParcel(Parcel)>
		//    3    5:areturn         
		}

		public Profile[] newArray(int i)
		{
			return new Profile[i];
		//    0    0:iload_1         
		//    1    1:anewarray       Profile[]
		//    2    4:areturn         
		}

		public volatile Object[] newArray(int i)
		{
			return ((Object []) (newArray(i)));
		//    0    0:aload_0         
		//    1    1:iload_1         
		//    2    2:invokevirtual   #26  <Method Profile[] newArray(int)>
		//    3    5:areturn         
		}

	}
;
	private static final String FIRST_NAME_KEY = "first_name";
	private static final String ID_KEY = "id";
	private static final String LAST_NAME_KEY = "last_name";
	private static final String LINK_URI_KEY = "link_uri";
	private static final String MIDDLE_NAME_KEY = "middle_name";
	private static final String NAME_KEY = "name";
	private final String firstName;
	private final String id;
	private final String lastName;
	private final Uri linkUri;
	private final String middleName;
	private final String name;

	static 
	{
	//    0    0:new             #10  <Class Profile$2>
	//    1    3:dup             
	//    2    4:invokespecial   #42  <Method void Profile$2()>
	//    3    7:putstatic       #44  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
