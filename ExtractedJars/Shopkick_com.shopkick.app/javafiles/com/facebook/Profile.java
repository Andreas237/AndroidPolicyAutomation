// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.facebook;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
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
	//    1    1:invokespecial   #51  <Method void Object()>
		id = parcel.readString();
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokevirtual   #57  <Method String Parcel.readString()>
	//    5    9:putfield        #59  <Field String id>
		firstName = parcel.readString();
	//    6   12:aload_0         
	//    7   13:aload_1         
	//    8   14:invokevirtual   #57  <Method String Parcel.readString()>
	//    9   17:putfield        #61  <Field String firstName>
		middleName = parcel.readString();
	//   10   20:aload_0         
	//   11   21:aload_1         
	//   12   22:invokevirtual   #57  <Method String Parcel.readString()>
	//   13   25:putfield        #63  <Field String middleName>
		lastName = parcel.readString();
	//   14   28:aload_0         
	//   15   29:aload_1         
	//   16   30:invokevirtual   #57  <Method String Parcel.readString()>
	//   17   33:putfield        #65  <Field String lastName>
		name = parcel.readString();
	//   18   36:aload_0         
	//   19   37:aload_1         
	//   20   38:invokevirtual   #57  <Method String Parcel.readString()>
	//   21   41:putfield        #67  <Field String name>
		parcel = ((Parcel) (parcel.readString()));
	//   22   44:aload_1         
	//   23   45:invokevirtual   #57  <Method String Parcel.readString()>
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
	//   31   59:invokestatic    #73  <Method Uri Uri.parse(String)>
	//   32   62:astore_1        
		linkUri = ((Uri) (parcel));
	//   33   63:aload_0         
	//   34   64:aload_1         
	//   35   65:putfield        #75  <Field Uri linkUri>
	//   36   68:return          
	}


	public Profile(String s, String s1, String s2, String s3, String s4, Uri uri)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		Validate.notNullOrEmpty(s, "id");
	//    2    4:aload_1         
	//    3    5:ldc1            #20  <String "id">
	//    4    7:invokestatic    #85  <Method void Validate.notNullOrEmpty(String, String)>
		id = s;
	//    5   10:aload_0         
	//    6   11:aload_1         
	//    7   12:putfield        #59  <Field String id>
		firstName = s1;
	//    8   15:aload_0         
	//    9   16:aload_2         
	//   10   17:putfield        #61  <Field String firstName>
		middleName = s2;
	//   11   20:aload_0         
	//   12   21:aload_3         
	//   13   22:putfield        #63  <Field String middleName>
		lastName = s3;
	//   14   25:aload_0         
	//   15   26:aload           4
	//   16   28:putfield        #65  <Field String lastName>
		name = s4;
	//   17   31:aload_0         
	//   18   32:aload           5
	//   19   34:putfield        #67  <Field String name>
		linkUri = uri;
	//   20   37:aload_0         
	//   21   38:aload           6
	//   22   40:putfield        #75  <Field Uri linkUri>
	//   23   43:return          
	}

	Profile(JSONObject jsonobject)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void Object()>
		Object obj = null;
	//    2    4:aconst_null     
	//    3    5:astore_2        
		id = jsonobject.optString("id", ((String) (null)));
	//    4    6:aload_0         
	//    5    7:aload_1         
	//    6    8:ldc1            #20  <String "id">
	//    7   10:aconst_null     
	//    8   11:invokevirtual   #93  <Method String JSONObject.optString(String, String)>
	//    9   14:putfield        #59  <Field String id>
		firstName = jsonobject.optString("first_name", ((String) (null)));
	//   10   17:aload_0         
	//   11   18:aload_1         
	//   12   19:ldc1            #17  <String "first_name">
	//   13   21:aconst_null     
	//   14   22:invokevirtual   #93  <Method String JSONObject.optString(String, String)>
	//   15   25:putfield        #61  <Field String firstName>
		middleName = jsonobject.optString("middle_name", ((String) (null)));
	//   16   28:aload_0         
	//   17   29:aload_1         
	//   18   30:ldc1            #29  <String "middle_name">
	//   19   32:aconst_null     
	//   20   33:invokevirtual   #93  <Method String JSONObject.optString(String, String)>
	//   21   36:putfield        #63  <Field String middleName>
		lastName = jsonobject.optString("last_name", ((String) (null)));
	//   22   39:aload_0         
	//   23   40:aload_1         
	//   24   41:ldc1            #23  <String "last_name">
	//   25   43:aconst_null     
	//   26   44:invokevirtual   #93  <Method String JSONObject.optString(String, String)>
	//   27   47:putfield        #65  <Field String lastName>
		name = jsonobject.optString("name", ((String) (null)));
	//   28   50:aload_0         
	//   29   51:aload_1         
	//   30   52:ldc1            #32  <String "name">
	//   31   54:aconst_null     
	//   32   55:invokevirtual   #93  <Method String JSONObject.optString(String, String)>
	//   33   58:putfield        #67  <Field String name>
		jsonobject = ((JSONObject) (jsonobject.optString("link_uri", ((String) (null)))));
	//   34   61:aload_1         
	//   35   62:ldc1            #26  <String "link_uri">
	//   36   64:aconst_null     
	//   37   65:invokevirtual   #93  <Method String JSONObject.optString(String, String)>
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
	//   45   79:invokestatic    #73  <Method Uri Uri.parse(String)>
	//   46   82:astore_1        
		linkUri = ((Uri) (jsonobject));
	//   47   83:aload_0         
	//   48   84:aload_1         
	//   49   85:putfield        #75  <Field Uri linkUri>
	//   50   88:return          
	}

	public static void fetchProfileForCurrentAccessToken()
	{
		AccessToken accesstoken = AccessToken.getCurrentAccessToken();
	//    0    0:invokestatic    #103 <Method AccessToken AccessToken.getCurrentAccessToken()>
	//    1    3:astore_0        
		if(!AccessToken.isCurrentAccessTokenActive())
	//*   2    4:invokestatic    #107 <Method boolean AccessToken.isCurrentAccessTokenActive()>
	//*   3    7:ifne            15
		{
			setCurrentProfile(((Profile) (null)));
	//    4   10:aconst_null     
	//    5   11:invokestatic    #111 <Method void setCurrentProfile(Profile)>
			return;
	//    6   14:return          
		} else
		{
			Utility.getGraphMeRequestWithCacheAsync(accesstoken.getToken(), new com.facebook.internal.Utility.GraphMeRequestWithCacheCallback() {

				public void onFailure(FacebookException facebookexception)
				{
					String s = Profile.TAG;
				//    0    0:invokestatic    #21  <Method String Profile.access$000()>
				//    1    3:astore_2        
					StringBuilder stringbuilder = new StringBuilder();
				//    2    4:new             #23  <Class StringBuilder>
				//    3    7:dup             
				//    4    8:invokespecial   #24  <Method void StringBuilder()>
				//    5   11:astore_3        
					stringbuilder.append("Got unexpected exception: ");
				//    6   12:aload_3         
				//    7   13:ldc1            #26  <String "Got unexpected exception: ">
				//    8   15:invokevirtual   #30  <Method StringBuilder StringBuilder.append(String)>
				//    9   18:pop             
					stringbuilder.append(((Object) (facebookexception)));
				//   10   19:aload_3         
				//   11   20:aload_1         
				//   12   21:invokevirtual   #33  <Method StringBuilder StringBuilder.append(Object)>
				//   13   24:pop             
					Log.e(s, stringbuilder.toString());
				//   14   25:aload_2         
				//   15   26:aload_3         
				//   16   27:invokevirtual   #36  <Method String StringBuilder.toString()>
				//   17   30:invokestatic    #42  <Method int Log.e(String, String)>
				//   18   33:pop             
				//   19   34:return          
				}

				public void onSuccess(JSONObject jsonobject)
				{
					String s = jsonobject.optString("id");
				//    0    0:aload_1         
				//    1    1:ldc1            #46  <String "id">
				//    2    3:invokevirtual   #52  <Method String JSONObject.optString(String)>
				//    3    6:astore_2        
					if(s == null)
				//*   4    7:aload_2         
				//*   5    8:ifnonnull       12
						return;
				//    6   11:return          
					String s5 = jsonobject.optString("link");
				//    7   12:aload_1         
				//    8   13:ldc1            #54  <String "link">
				//    9   15:invokevirtual   #52  <Method String JSONObject.optString(String)>
				//   10   18:astore          7
					String s1 = jsonobject.optString("first_name");
				//   11   20:aload_1         
				//   12   21:ldc1            #56  <String "first_name">
				//   13   23:invokevirtual   #52  <Method String JSONObject.optString(String)>
				//   14   26:astore_3        
					String s2 = jsonobject.optString("middle_name");
				//   15   27:aload_1         
				//   16   28:ldc1            #58  <String "middle_name">
				//   17   30:invokevirtual   #52  <Method String JSONObject.optString(String)>
				//   18   33:astore          4
					String s3 = jsonobject.optString("last_name");
				//   19   35:aload_1         
				//   20   36:ldc1            #60  <String "last_name">
				//   21   38:invokevirtual   #52  <Method String JSONObject.optString(String)>
				//   22   41:astore          5
					String s4 = jsonobject.optString("name");
				//   23   43:aload_1         
				//   24   44:ldc1            #62  <String "name">
				//   25   46:invokevirtual   #52  <Method String JSONObject.optString(String)>
				//   26   49:astore          6
					if(s5 != null)
				//*  27   51:aload           7
				//*  28   53:ifnull          65
						jsonobject = ((JSONObject) (Uri.parse(s5)));
				//   29   56:aload           7
				//   30   58:invokestatic    #68  <Method Uri Uri.parse(String)>
				//   31   61:astore_1        
					else
				//*  32   62:goto            67
						jsonobject = null;
				//   33   65:aconst_null     
				//   34   66:astore_1        
					Profile.setCurrentProfile(new Profile(s, s1, s2, s3, s4, ((Uri) (jsonobject))));
				//   35   67:new             #8   <Class Profile>
				//   36   70:dup             
				//   37   71:aload_2         
				//   38   72:aload_3         
				//   39   73:aload           4
				//   40   75:aload           5
				//   41   77:aload           6
				//   42   79:aload_1         
				//   43   80:invokespecial   #71  <Method void Profile(String, String, String, String, String, Uri)>
				//   44   83:invokestatic    #75  <Method void Profile.setCurrentProfile(Profile)>
				//   45   86:return          
				}

			}
);
	//    7   15:aload_0         
	//    8   16:invokevirtual   #114 <Method String AccessToken.getToken()>
	//    9   19:new             #8   <Class Profile$1>
	//   10   22:dup             
	//   11   23:invokespecial   #115 <Method void Profile$1()>
	//   12   26:invokestatic    #121 <Method void Utility.getGraphMeRequestWithCacheAsync(String, com.facebook.internal.Utility$GraphMeRequestWithCacheCallback)>
			return;
	//   13   29:return          
		}
	}

	public static Profile getCurrentProfile()
	{
		return ProfileManager.getInstance().getCurrentProfile();
	//    0    0:invokestatic    #129 <Method ProfileManager ProfileManager.getInstance()>
	//    1    3:invokevirtual   #131 <Method Profile ProfileManager.getCurrentProfile()>
	//    2    6:areturn         
	}

	public static void setCurrentProfile(Profile profile)
	{
		ProfileManager.getInstance().setCurrentProfile(profile);
	//    0    0:invokestatic    #129 <Method ProfileManager ProfileManager.getInstance()>
	//    1    3:aload_0         
	//    2    4:invokevirtual   #132 <Method void ProfileManager.setCurrentProfile(Profile)>
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
		if(id.equals(((Object) (((Profile) (obj)).id))) && firstName == null)
	//*  13   21:aload_0         
	//*  14   22:getfield        #59  <Field String id>
	//*  15   25:aload_1         
	//*  16   26:getfield        #59  <Field String id>
	//*  17   29:invokevirtual   #140 <Method boolean String.equals(Object)>
	//*  18   32:ifeq            53
	//*  19   35:aload_0         
	//*  20   36:getfield        #61  <Field String firstName>
	//*  21   39:ifnonnull       53
			return ((Profile) (obj)).firstName == null;
	//   22   42:aload_1         
	//   23   43:getfield        #61  <Field String firstName>
	//   24   46:ifnonnull       51
	//   25   49:iconst_1        
	//   26   50:ireturn         
	//   27   51:iconst_0        
	//   28   52:ireturn         
		if(firstName.equals(((Object) (((Profile) (obj)).firstName))) && middleName == null)
	//*  29   53:aload_0         
	//*  30   54:getfield        #61  <Field String firstName>
	//*  31   57:aload_1         
	//*  32   58:getfield        #61  <Field String firstName>
	//*  33   61:invokevirtual   #140 <Method boolean String.equals(Object)>
	//*  34   64:ifeq            85
	//*  35   67:aload_0         
	//*  36   68:getfield        #63  <Field String middleName>
	//*  37   71:ifnonnull       85
			return ((Profile) (obj)).middleName == null;
	//   38   74:aload_1         
	//   39   75:getfield        #63  <Field String middleName>
	//   40   78:ifnonnull       83
	//   41   81:iconst_1        
	//   42   82:ireturn         
	//   43   83:iconst_0        
	//   44   84:ireturn         
		if(middleName.equals(((Object) (((Profile) (obj)).middleName))) && lastName == null)
	//*  45   85:aload_0         
	//*  46   86:getfield        #63  <Field String middleName>
	//*  47   89:aload_1         
	//*  48   90:getfield        #63  <Field String middleName>
	//*  49   93:invokevirtual   #140 <Method boolean String.equals(Object)>
	//*  50   96:ifeq            117
	//*  51   99:aload_0         
	//*  52  100:getfield        #65  <Field String lastName>
	//*  53  103:ifnonnull       117
			return ((Profile) (obj)).lastName == null;
	//   54  106:aload_1         
	//   55  107:getfield        #65  <Field String lastName>
	//   56  110:ifnonnull       115
	//   57  113:iconst_1        
	//   58  114:ireturn         
	//   59  115:iconst_0        
	//   60  116:ireturn         
		if(lastName.equals(((Object) (((Profile) (obj)).lastName))) && name == null)
	//*  61  117:aload_0         
	//*  62  118:getfield        #65  <Field String lastName>
	//*  63  121:aload_1         
	//*  64  122:getfield        #65  <Field String lastName>
	//*  65  125:invokevirtual   #140 <Method boolean String.equals(Object)>
	//*  66  128:ifeq            149
	//*  67  131:aload_0         
	//*  68  132:getfield        #67  <Field String name>
	//*  69  135:ifnonnull       149
			return ((Profile) (obj)).name == null;
	//   70  138:aload_1         
	//   71  139:getfield        #67  <Field String name>
	//   72  142:ifnonnull       147
	//   73  145:iconst_1        
	//   74  146:ireturn         
	//   75  147:iconst_0        
	//   76  148:ireturn         
		if(name.equals(((Object) (((Profile) (obj)).name))) && linkUri == null)
	//*  77  149:aload_0         
	//*  78  150:getfield        #67  <Field String name>
	//*  79  153:aload_1         
	//*  80  154:getfield        #67  <Field String name>
	//*  81  157:invokevirtual   #140 <Method boolean String.equals(Object)>
	//*  82  160:ifeq            181
	//*  83  163:aload_0         
	//*  84  164:getfield        #75  <Field Uri linkUri>
	//*  85  167:ifnonnull       181
			return ((Profile) (obj)).linkUri == null;
	//   86  170:aload_1         
	//   87  171:getfield        #75  <Field Uri linkUri>
	//   88  174:ifnonnull       179
	//   89  177:iconst_1        
	//   90  178:ireturn         
	//   91  179:iconst_0        
	//   92  180:ireturn         
		else
			return linkUri.equals(((Object) (((Profile) (obj)).linkUri)));
	//   93  181:aload_0         
	//   94  182:getfield        #75  <Field Uri linkUri>
	//   95  185:aload_1         
	//   96  186:getfield        #75  <Field Uri linkUri>
	//   97  189:invokevirtual   #141 <Method boolean Uri.equals(Object)>
	//   98  192:ireturn         
	}

	public String getFirstName()
	{
		return firstName;
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field String firstName>
	//    2    4:areturn         
	}

	public String getId()
	{
		return id;
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String id>
	//    2    4:areturn         
	}

	public String getLastName()
	{
		return lastName;
	//    0    0:aload_0         
	//    1    1:getfield        #65  <Field String lastName>
	//    2    4:areturn         
	}

	public Uri getLinkUri()
	{
		return linkUri;
	//    0    0:aload_0         
	//    1    1:getfield        #75  <Field Uri linkUri>
	//    2    4:areturn         
	}

	public String getMiddleName()
	{
		return middleName;
	//    0    0:aload_0         
	//    1    1:getfield        #63  <Field String middleName>
	//    2    4:areturn         
	}

	public String getName()
	{
		return name;
	//    0    0:aload_0         
	//    1    1:getfield        #67  <Field String name>
	//    2    4:areturn         
	}

	public Uri getProfilePictureUri(int i, int j)
	{
		return ImageRequest.getProfilePictureUri(id, i, j);
	//    0    0:aload_0         
	//    1    1:getfield        #59  <Field String id>
	//    2    4:iload_1         
	//    3    5:iload_2         
	//    4    6:invokestatic    #155 <Method Uri ImageRequest.getProfilePictureUri(String, int, int)>
	//    5    9:areturn         
	}

	public int hashCode()
	{
		int j = 527 + id.hashCode();
	//    0    0:sipush          527
	//    1    3:aload_0         
	//    2    4:getfield        #59  <Field String id>
	//    3    7:invokevirtual   #158 <Method int String.hashCode()>
	//    4   10:iadd            
	//    5   11:istore_2        
		Object obj = ((Object) (firstName));
	//    6   12:aload_0         
	//    7   13:getfield        #61  <Field String firstName>
	//    8   16:astore_3        
		int i = j;
	//    9   17:iload_2         
	//   10   18:istore_1        
		if(obj != null)
	//*  11   19:aload_3         
	//*  12   20:ifnull          33
			i = j * 31 + ((String) (obj)).hashCode();
	//   13   23:iload_2         
	//   14   24:bipush          31
	//   15   26:imul            
	//   16   27:aload_3         
	//   17   28:invokevirtual   #158 <Method int String.hashCode()>
	//   18   31:iadd            
	//   19   32:istore_1        
		obj = ((Object) (middleName));
	//   20   33:aload_0         
	//   21   34:getfield        #63  <Field String middleName>
	//   22   37:astore_3        
		j = i;
	//   23   38:iload_1         
	//   24   39:istore_2        
		if(obj != null)
	//*  25   40:aload_3         
	//*  26   41:ifnull          54
			j = i * 31 + ((String) (obj)).hashCode();
	//   27   44:iload_1         
	//   28   45:bipush          31
	//   29   47:imul            
	//   30   48:aload_3         
	//   31   49:invokevirtual   #158 <Method int String.hashCode()>
	//   32   52:iadd            
	//   33   53:istore_2        
		obj = ((Object) (lastName));
	//   34   54:aload_0         
	//   35   55:getfield        #65  <Field String lastName>
	//   36   58:astore_3        
		i = j;
	//   37   59:iload_2         
	//   38   60:istore_1        
		if(obj != null)
	//*  39   61:aload_3         
	//*  40   62:ifnull          75
			i = j * 31 + ((String) (obj)).hashCode();
	//   41   65:iload_2         
	//   42   66:bipush          31
	//   43   68:imul            
	//   44   69:aload_3         
	//   45   70:invokevirtual   #158 <Method int String.hashCode()>
	//   46   73:iadd            
	//   47   74:istore_1        
		obj = ((Object) (name));
	//   48   75:aload_0         
	//   49   76:getfield        #67  <Field String name>
	//   50   79:astore_3        
		j = i;
	//   51   80:iload_1         
	//   52   81:istore_2        
		if(obj != null)
	//*  53   82:aload_3         
	//*  54   83:ifnull          96
			j = i * 31 + ((String) (obj)).hashCode();
	//   55   86:iload_1         
	//   56   87:bipush          31
	//   57   89:imul            
	//   58   90:aload_3         
	//   59   91:invokevirtual   #158 <Method int String.hashCode()>
	//   60   94:iadd            
	//   61   95:istore_2        
		obj = ((Object) (linkUri));
	//   62   96:aload_0         
	//   63   97:getfield        #75  <Field Uri linkUri>
	//   64  100:astore_3        
		i = j;
	//   65  101:iload_2         
	//   66  102:istore_1        
		if(obj != null)
	//*  67  103:aload_3         
	//*  68  104:ifnull          117
			i = j * 31 + ((Uri) (obj)).hashCode();
	//   69  107:iload_2         
	//   70  108:bipush          31
	//   71  110:imul            
	//   72  111:aload_3         
	//   73  112:invokevirtual   #159 <Method int Uri.hashCode()>
	//   74  115:iadd            
	//   75  116:istore_1        
		return i;
	//   76  117:iload_1         
	//   77  118:ireturn         
	}

	JSONObject toJSONObject()
	{
		JSONObject jsonobject1 = new JSONObject();
	//    0    0:new             #89  <Class JSONObject>
	//    1    3:dup             
	//    2    4:invokespecial   #164 <Method void JSONObject()>
	//    3    7:astore_2        
		jsonobject1.put("id", ((Object) (id)));
	//    4    8:aload_2         
	//    5    9:ldc1            #20  <String "id">
	//    6   11:aload_0         
	//    7   12:getfield        #59  <Field String id>
	//    8   15:invokevirtual   #168 <Method JSONObject JSONObject.put(String, Object)>
	//    9   18:pop             
		jsonobject1.put("first_name", ((Object) (firstName)));
	//   10   19:aload_2         
	//   11   20:ldc1            #17  <String "first_name">
	//   12   22:aload_0         
	//   13   23:getfield        #61  <Field String firstName>
	//   14   26:invokevirtual   #168 <Method JSONObject JSONObject.put(String, Object)>
	//   15   29:pop             
		jsonobject1.put("middle_name", ((Object) (middleName)));
	//   16   30:aload_2         
	//   17   31:ldc1            #29  <String "middle_name">
	//   18   33:aload_0         
	//   19   34:getfield        #63  <Field String middleName>
	//   20   37:invokevirtual   #168 <Method JSONObject JSONObject.put(String, Object)>
	//   21   40:pop             
		jsonobject1.put("last_name", ((Object) (lastName)));
	//   22   41:aload_2         
	//   23   42:ldc1            #23  <String "last_name">
	//   24   44:aload_0         
	//   25   45:getfield        #65  <Field String lastName>
	//   26   48:invokevirtual   #168 <Method JSONObject JSONObject.put(String, Object)>
	//   27   51:pop             
		jsonobject1.put("name", ((Object) (name)));
	//   28   52:aload_2         
	//   29   53:ldc1            #32  <String "name">
	//   30   55:aload_0         
	//   31   56:getfield        #67  <Field String name>
	//   32   59:invokevirtual   #168 <Method JSONObject JSONObject.put(String, Object)>
	//   33   62:pop             
		JSONObject jsonobject = jsonobject1;
	//   34   63:aload_2         
	//   35   64:astore_1        
		if(linkUri == null) goto _L2; else goto _L1
	//   36   65:aload_0         
	//   37   66:getfield        #75  <Field Uri linkUri>
	//   38   69:ifnull          90
_L1:
		jsonobject1.put("link_uri", ((Object) (linkUri.toString())));
	//   39   72:aload_2         
	//   40   73:ldc1            #26  <String "link_uri">
	//   41   75:aload_0         
	//   42   76:getfield        #75  <Field Uri linkUri>
	//   43   79:invokevirtual   #171 <Method String Uri.toString()>
	//   44   82:invokevirtual   #168 <Method JSONObject JSONObject.put(String, Object)>
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
	//    2    2:getfield        #59  <Field String id>
	//    3    5:invokevirtual   #177 <Method void Parcel.writeString(String)>
		parcel.writeString(firstName);
	//    4    8:aload_1         
	//    5    9:aload_0         
	//    6   10:getfield        #61  <Field String firstName>
	//    7   13:invokevirtual   #177 <Method void Parcel.writeString(String)>
		parcel.writeString(middleName);
	//    8   16:aload_1         
	//    9   17:aload_0         
	//   10   18:getfield        #63  <Field String middleName>
	//   11   21:invokevirtual   #177 <Method void Parcel.writeString(String)>
		parcel.writeString(lastName);
	//   12   24:aload_1         
	//   13   25:aload_0         
	//   14   26:getfield        #65  <Field String lastName>
	//   15   29:invokevirtual   #177 <Method void Parcel.writeString(String)>
		parcel.writeString(name);
	//   16   32:aload_1         
	//   17   33:aload_0         
	//   18   34:getfield        #67  <Field String name>
	//   19   37:invokevirtual   #177 <Method void Parcel.writeString(String)>
		Object obj = ((Object) (linkUri));
	//   20   40:aload_0         
	//   21   41:getfield        #75  <Field Uri linkUri>
	//   22   44:astore_3        
		if(obj == null)
	//*  23   45:aload_3         
	//*  24   46:ifnonnull       54
			obj = null;
	//   25   49:aconst_null     
	//   26   50:astore_3        
		else
	//*  27   51:goto            59
			obj = ((Object) (((Uri) (obj)).toString()));
	//   28   54:aload_3         
	//   29   55:invokevirtual   #171 <Method String Uri.toString()>
	//   30   58:astore_3        
		parcel.writeString(((String) (obj)));
	//   31   59:aload_1         
	//   32   60:aload_3         
	//   33   61:invokevirtual   #177 <Method void Parcel.writeString(String)>
	//   34   64:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

		public Profile createFromParcel(Parcel parcel)
		{
			return new Profile(parcel);
		//    0    0:new             #9   <Class Profile>
		//    1    3:dup             
		//    2    4:aload_1         
		//    3    5:aconst_null     
		//    4    6:invokespecial   #19  <Method void Profile(Parcel, Profile$1)>
		//    5    9:areturn         
		}

		public volatile Object createFromParcel(Parcel parcel)
		{
			return ((Object) (createFromParcel(parcel)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #22  <Method Profile createFromParcel(Parcel)>
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
		//    2    2:invokevirtual   #27  <Method Profile[] newArray(int)>
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
	private static final String TAG = "Profile";
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
	//    2    4:invokespecial   #46  <Method void Profile$2()>
	//    3    7:putstatic       #48  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}


/*
	static String access$000()
	{
		return TAG;
	//    0    0:getstatic       #96  <Field String TAG>
	//    1    3:areturn         
	}

*/
}
