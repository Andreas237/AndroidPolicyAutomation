// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			zzc

public class Credential extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static class Builder
	{

		public Credential build()
		{
			return new Credential(mId, mName, zzo, zzp, zzq, zzr, zzs, zzt);
		//    0    0:new             #6   <Class Credential>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #30  <Field String mId>
		//    4    8:aload_0         
		//    5    9:getfield        #35  <Field String mName>
		//    6   12:aload_0         
		//    7   13:getfield        #41  <Field Uri zzo>
		//    8   16:aload_0         
		//    9   17:getfield        #47  <Field List zzp>
		//   10   20:aload_0         
		//   11   21:getfield        #52  <Field String zzq>
		//   12   24:aload_0         
		//   13   25:getfield        #57  <Field String zzr>
		//   14   28:aload_0         
		//   15   29:getfield        #62  <Field String zzs>
		//   16   32:aload_0         
		//   17   33:getfield        #67  <Field String zzt>
		//   18   36:invokespecial   #74  <Method void Credential(String, String, Uri, List, String, String, String, String)>
		//   19   39:areturn         
		}

		public Builder setAccountType(String s)
		{
			zzr = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #57  <Field String zzr>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setName(String s)
		{
			mName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #35  <Field String mName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPassword(String s)
		{
			zzq = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #52  <Field String zzq>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setProfilePictureUri(Uri uri)
		{
			zzo = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #41  <Field Uri zzo>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private final String mId;
		private String mName;
		private Uri zzo;
		private List zzp;
		private String zzq;
		private String zzr;
		private String zzs;
		private String zzt;

		public Builder(Credential credential)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			mId = Credential.zzc(credential);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #28  <Method String Credential.zzc(Credential)>
		//    5    9:putfield        #30  <Field String mId>
			mName = Credential.zzd(credential);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokestatic    #33  <Method String Credential.zzd(Credential)>
		//    9   17:putfield        #35  <Field String mName>
			zzo = Credential.zze(credential);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #39  <Method Uri Credential.zze(Credential)>
		//   13   25:putfield        #41  <Field Uri zzo>
			zzp = Credential.zzf(credential);
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokestatic    #45  <Method List Credential.zzf(Credential)>
		//   17   33:putfield        #47  <Field List zzp>
			zzq = Credential.zzg(credential);
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokestatic    #50  <Method String Credential.zzg(Credential)>
		//   21   41:putfield        #52  <Field String zzq>
			zzr = Credential.zzh(credential);
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:invokestatic    #55  <Method String Credential.zzh(Credential)>
		//   25   49:putfield        #57  <Field String zzr>
			zzs = Credential.zzi(credential);
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:invokestatic    #60  <Method String Credential.zzi(Credential)>
		//   29   57:putfield        #62  <Field String zzs>
			zzt = Credential.zzj(credential);
		//   30   60:aload_0         
		//   31   61:aload_1         
		//   32   62:invokestatic    #65  <Method String Credential.zzj(Credential)>
		//   33   65:putfield        #67  <Field String zzt>
		//   34   68:return          
		}

		public Builder(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #24  <Method void Object()>
			mId = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #30  <Field String mId>
		//    5    9:return          
		}
	}


	Credential(String s, String s1, Uri uri, List list, String s2, String s3, String s4, 
			String s5)
	{
		String s6;
label0:
		{
			boolean flag;
label1:
			{
				super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #68  <Method void AbstractSafeParcelable()>
				s6 = ((String)Preconditions.checkNotNull(((Object) (s)), "credential identifier cannot be null")).trim();
	//    2    4:aload_1         
	//    3    5:ldc1            #70  <String "credential identifier cannot be null">
	//    4    7:invokestatic    #76  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:checkcast       #78  <Class String>
	//    6   13:invokevirtual   #82  <Method String String.trim()>
	//    7   16:astore          12
				Preconditions.checkNotEmpty(s6, "credential identifier cannot be empty");
	//    8   18:aload           12
	//    9   20:ldc1            #84  <String "credential identifier cannot be empty">
	//   10   22:invokestatic    #88  <Method String Preconditions.checkNotEmpty(String, Object)>
	//   11   25:pop             
				if(s2 != null && TextUtils.isEmpty(((CharSequence) (s2))))
	//*  12   26:aload           5
	//*  13   28:ifnull          52
	//*  14   31:aload           5
	//*  15   33:invokestatic    #94  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   36:ifne            42
	//*  17   39:goto            52
					throw new IllegalArgumentException("Password must not be empty if set");
	//   18   42:new             #96  <Class IllegalArgumentException>
	//   19   45:dup             
	//   20   46:ldc1            #98  <String "Password must not be empty if set">
	//   21   48:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   22   51:athrow          
				if(s3 == null)
					break label0;
	//   23   52:aload           6
	//   24   54:ifnull          190
				boolean flag2 = TextUtils.isEmpty(((CharSequence) (s3)));
	//   25   57:aload           6
	//   26   59:invokestatic    #94  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   27   62:istore          11
				boolean flag1 = false;
	//   28   64:iconst_0        
	//   29   65:istore          10
				flag = flag1;
	//   30   67:iload           10
	//   31   69:istore          9
				if(flag2)
					break label1;
	//   32   71:iload           11
	//   33   73:ifne            166
				s = ((String) (Uri.parse(s3)));
	//   34   76:aload           6
	//   35   78:invokestatic    #107 <Method Uri Uri.parse(String)>
	//   36   81:astore_1        
				flag = flag1;
	//   37   82:iload           10
	//   38   84:istore          9
				if(!((Uri) (s)).isAbsolute())
					break label1;
	//   39   86:aload_1         
	//   40   87:invokevirtual   #111 <Method boolean Uri.isAbsolute()>
	//   41   90:ifeq            166
				flag = flag1;
	//   42   93:iload           10
	//   43   95:istore          9
				if(!((Uri) (s)).isHierarchical())
					break label1;
	//   44   97:aload_1         
	//   45   98:invokevirtual   #114 <Method boolean Uri.isHierarchical()>
	//   46  101:ifeq            166
				flag = flag1;
	//   47  104:iload           10
	//   48  106:istore          9
				if(TextUtils.isEmpty(((CharSequence) (((Uri) (s)).getScheme()))))
					break label1;
	//   49  108:aload_1         
	//   50  109:invokevirtual   #117 <Method String Uri.getScheme()>
	//   51  112:invokestatic    #94  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   52  115:ifne            166
				if(TextUtils.isEmpty(((CharSequence) (((Uri) (s)).getAuthority()))))
	//*  53  118:aload_1         
	//*  54  119:invokevirtual   #120 <Method String Uri.getAuthority()>
	//*  55  122:invokestatic    #94  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  56  125:ifeq            135
				{
					flag = flag1;
	//   57  128:iload           10
	//   58  130:istore          9
					break label1;
	//   59  132:goto            166
				}
				if(!"http".equalsIgnoreCase(((Uri) (s)).getScheme()))
	//*  60  135:ldc1            #122 <String "http">
	//*  61  137:aload_1         
	//*  62  138:invokevirtual   #117 <Method String Uri.getScheme()>
	//*  63  141:invokevirtual   #126 <Method boolean String.equalsIgnoreCase(String)>
	//*  64  144:ifne            163
				{
					flag = flag1;
	//   65  147:iload           10
	//   66  149:istore          9
					if(!"https".equalsIgnoreCase(((Uri) (s)).getScheme()))
						break label1;
	//   67  151:ldc1            #128 <String "https">
	//   68  153:aload_1         
	//   69  154:invokevirtual   #117 <Method String Uri.getScheme()>
	//   70  157:invokevirtual   #126 <Method boolean String.equalsIgnoreCase(String)>
	//   71  160:ifeq            166
				}
				flag = true;
	//   72  163:iconst_1        
	//   73  164:istore          9
			}
			if(!Boolean.valueOf(flag).booleanValue())
	//*  74  166:iload           9
	//*  75  168:invokestatic    #134 <Method Boolean Boolean.valueOf(boolean)>
	//*  76  171:invokevirtual   #137 <Method boolean Boolean.booleanValue()>
	//*  77  174:ifeq            180
	//*  78  177:goto            190
				throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
	//   79  180:new             #96  <Class IllegalArgumentException>
	//   80  183:dup             
	//   81  184:ldc1            #139 <String "Account type must be a valid Http/Https URI">
	//   82  186:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   83  189:athrow          
		}
		if(!TextUtils.isEmpty(((CharSequence) (s3))) && !TextUtils.isEmpty(((CharSequence) (s2))))
	//*  84  190:aload           6
	//*  85  192:invokestatic    #94  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  86  195:ifne            219
	//*  87  198:aload           5
	//*  88  200:invokestatic    #94  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  89  203:ifeq            209
	//*  90  206:goto            219
			throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
	//   91  209:new             #96  <Class IllegalArgumentException>
	//   92  212:dup             
	//   93  213:ldc1            #141 <String "Password and AccountType are mutually exclusive">
	//   94  215:invokespecial   #101 <Method void IllegalArgumentException(String)>
	//   95  218:athrow          
		s = s1;
	//   96  219:aload_2         
	//   97  220:astore_1        
		if(s1 != null)
	//*  98  221:aload_2         
	//*  99  222:ifnull          239
		{
			s = s1;
	//  100  225:aload_2         
	//  101  226:astore_1        
			if(TextUtils.isEmpty(((CharSequence) (s1.trim()))))
	//* 102  227:aload_2         
	//* 103  228:invokevirtual   #82  <Method String String.trim()>
	//* 104  231:invokestatic    #94  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 105  234:ifeq            239
				s = null;
	//  106  237:aconst_null     
	//  107  238:astore_1        
		}
		mName = s;
	//  108  239:aload_0         
	//  109  240:aload_1         
	//  110  241:putfield        #143 <Field String mName>
		zzo = uri;
	//  111  244:aload_0         
	//  112  245:aload_3         
	//  113  246:putfield        #145 <Field Uri zzo>
		if(list == null)
	//* 114  249:aload           4
	//* 115  251:ifnonnull       261
			s = ((String) (Collections.emptyList()));
	//  116  254:invokestatic    #151 <Method List Collections.emptyList()>
	//  117  257:astore_1        
		else
	//* 118  258:goto            267
			s = ((String) (Collections.unmodifiableList(list)));
	//  119  261:aload           4
	//  120  263:invokestatic    #155 <Method List Collections.unmodifiableList(List)>
	//  121  266:astore_1        
		zzp = ((List) (s));
	//  122  267:aload_0         
	//  123  268:aload_1         
	//  124  269:putfield        #157 <Field List zzp>
		mId = s6;
	//  125  272:aload_0         
	//  126  273:aload           12
	//  127  275:putfield        #159 <Field String mId>
		zzq = s2;
	//  128  278:aload_0         
	//  129  279:aload           5
	//  130  281:putfield        #161 <Field String zzq>
		zzr = s3;
	//  131  284:aload_0         
	//  132  285:aload           6
	//  133  287:putfield        #163 <Field String zzr>
		zzs = s4;
	//  134  290:aload_0         
	//  135  291:aload           7
	//  136  293:putfield        #165 <Field String zzs>
		zzt = s5;
	//  137  296:aload_0         
	//  138  297:aload           8
	//  139  299:putfield        #167 <Field String zzt>
	//  140  302:return          
	}

	static String zzc(Credential credential)
	{
		return credential.mId;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field String mId>
	//    2    4:areturn         
	}

	static String zzd(Credential credential)
	{
		return credential.mName;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field String mName>
	//    2    4:areturn         
	}

	static Uri zze(Credential credential)
	{
		return credential.zzo;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Uri zzo>
	//    2    4:areturn         
	}

	static List zzf(Credential credential)
	{
		return credential.zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field List zzp>
	//    2    4:areturn         
	}

	static String zzg(Credential credential)
	{
		return credential.zzq;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field String zzq>
	//    2    4:areturn         
	}

	static String zzh(Credential credential)
	{
		return credential.zzr;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field String zzr>
	//    2    4:areturn         
	}

	static String zzi(Credential credential)
	{
		return credential.zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field String zzs>
	//    2    4:areturn         
	}

	static String zzj(Credential credential)
	{
		return credential.zzt;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field String zzt>
	//    2    4:areturn         
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
		if(!(obj instanceof Credential))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class Credential>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((Credential)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class Credential>
	//   12   20:astore_1        
		return TextUtils.equals(((CharSequence) (mId)), ((CharSequence) (((Credential) (obj)).mId))) && TextUtils.equals(((CharSequence) (mName)), ((CharSequence) (((Credential) (obj)).mName))) && Objects.equal(((Object) (zzo)), ((Object) (((Credential) (obj)).zzo))) && TextUtils.equals(((CharSequence) (zzq)), ((CharSequence) (((Credential) (obj)).zzq))) && TextUtils.equals(((CharSequence) (zzr)), ((CharSequence) (((Credential) (obj)).zzr)));
	//   13   21:aload_0         
	//   14   22:getfield        #159 <Field String mId>
	//   15   25:aload_1         
	//   16   26:getfield        #159 <Field String mId>
	//   17   29:invokestatic    #187 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   18   32:ifeq            93
	//   19   35:aload_0         
	//   20   36:getfield        #143 <Field String mName>
	//   21   39:aload_1         
	//   22   40:getfield        #143 <Field String mName>
	//   23   43:invokestatic    #187 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   24   46:ifeq            93
	//   25   49:aload_0         
	//   26   50:getfield        #145 <Field Uri zzo>
	//   27   53:aload_1         
	//   28   54:getfield        #145 <Field Uri zzo>
	//   29   57:invokestatic    #193 <Method boolean Objects.equal(Object, Object)>
	//   30   60:ifeq            93
	//   31   63:aload_0         
	//   32   64:getfield        #161 <Field String zzq>
	//   33   67:aload_1         
	//   34   68:getfield        #161 <Field String zzq>
	//   35   71:invokestatic    #187 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   36   74:ifeq            93
	//   37   77:aload_0         
	//   38   78:getfield        #163 <Field String zzr>
	//   39   81:aload_1         
	//   40   82:getfield        #163 <Field String zzr>
	//   41   85:invokestatic    #187 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   42   88:ifeq            93
	//   43   91:iconst_1        
	//   44   92:ireturn         
	//   45   93:iconst_0        
	//   46   94:ireturn         
	}

	public String getAccountType()
	{
		return zzr;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field String zzr>
	//    2    4:areturn         
	}

	public String getFamilyName()
	{
		return zzt;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field String zzt>
	//    2    4:areturn         
	}

	public String getGivenName()
	{
		return zzs;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field String zzs>
	//    2    4:areturn         
	}

	public String getId()
	{
		return mId;
	//    0    0:aload_0         
	//    1    1:getfield        #159 <Field String mId>
	//    2    4:areturn         
	}

	public List getIdTokens()
	{
		return zzp;
	//    0    0:aload_0         
	//    1    1:getfield        #157 <Field List zzp>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #143 <Field String mName>
	//    2    4:areturn         
	}

	public String getPassword()
	{
		return zzq;
	//    0    0:aload_0         
	//    1    1:getfield        #161 <Field String zzq>
	//    2    4:areturn         
	}

	public Uri getProfilePictureUri()
	{
		return zzo;
	//    0    0:aload_0         
	//    1    1:getfield        #145 <Field Uri zzo>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			mId, mName, zzo, zzq, zzr
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #159 <Field String mId>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #143 <Field String mName>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #145 <Field Uri zzo>
	//   16   24:aastore         
	//   17   25:dup             
	//   18   26:iconst_3        
	//   19   27:aload_0         
	//   20   28:getfield        #161 <Field String zzq>
	//   21   31:aastore         
	//   22   32:dup             
	//   23   33:iconst_4        
	//   24   34:aload_0         
	//   25   35:getfield        #163 <Field String zzr>
	//   26   38:aastore         
	//   27   39:invokestatic    #203 <Method int Objects.hashCode(Object[])>
	//   28   42:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #211 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeString(parcel, 1, getId(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #213 <Method String getId()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #217 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 2, getName(), false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #219 <Method String getName()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #217 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (getProfilePictureUri())), i, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #221 <Method Uri getProfilePictureUri()>
	//   19   31:iload_2         
	//   20   32:iconst_0        
	//   21   33:invokestatic    #225 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
	//   22   36:aload_1         
	//   23   37:iconst_4        
	//   24   38:aload_0         
	//   25   39:invokevirtual   #227 <Method List getIdTokens()>
	//   26   42:iconst_0        
	//   27   43:invokestatic    #231 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
	//   28   46:aload_1         
	//   29   47:iconst_5        
	//   30   48:aload_0         
	//   31   49:invokevirtual   #233 <Method String getPassword()>
	//   32   52:iconst_0        
	//   33   53:invokestatic    #217 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
	//   34   56:aload_1         
	//   35   57:bipush          6
	//   36   59:aload_0         
	//   37   60:invokevirtual   #235 <Method String getAccountType()>
	//   38   63:iconst_0        
	//   39   64:invokestatic    #217 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
	//   40   67:aload_1         
	//   41   68:bipush          9
	//   42   70:aload_0         
	//   43   71:invokevirtual   #237 <Method String getGivenName()>
	//   44   74:iconst_0        
	//   45   75:invokestatic    #217 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
	//   46   78:aload_1         
	//   47   79:bipush          10
	//   48   81:aload_0         
	//   49   82:invokevirtual   #239 <Method String getFamilyName()>
	//   50   85:iconst_0        
	//   51   86:invokestatic    #217 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   52   89:aload_1         
	//   53   90:iload_3         
	//   54   91:invokestatic    #242 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   55   94:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzc();
	public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
	private final String mId;
	private final String mName;
	private final Uri zzo;
	private final List zzp;
	private final String zzq;
	private final String zzr;
	private final String zzs;
	private final String zzt;

	static 
	{
	//    0    0:new             #58  <Class zzc>
	//    1    3:dup             
	//    2    4:invokespecial   #61  <Method void zzc()>
	//    3    7:putstatic       #63  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
