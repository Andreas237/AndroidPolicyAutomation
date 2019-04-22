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
//			zzd

public class Credential extends AbstractSafeParcelable
	implements ReflectedParcelable
{
	public static class Builder
	{

		public Credential build()
		{
			return new Credential(zzci, mName, zzcj, zzck, zzcl, zzbx, zzcm, zzcn, zzco, zzcp);
		//    0    0:new             #6   <Class Credential>
		//    1    3:dup             
		//    2    4:aload_0         
		//    3    5:getfield        #32  <Field String zzci>
		//    4    8:aload_0         
		//    5    9:getfield        #37  <Field String mName>
		//    6   12:aload_0         
		//    7   13:getfield        #43  <Field Uri zzcj>
		//    8   16:aload_0         
		//    9   17:getfield        #49  <Field List zzck>
		//   10   20:aload_0         
		//   11   21:getfield        #54  <Field String zzcl>
		//   12   24:aload_0         
		//   13   25:getfield        #59  <Field String zzbx>
		//   14   28:aload_0         
		//   15   29:getfield        #64  <Field String zzcm>
		//   16   32:aload_0         
		//   17   33:getfield        #69  <Field String zzcn>
		//   18   36:aload_0         
		//   19   37:getfield        #74  <Field String zzco>
		//   20   40:aload_0         
		//   21   41:getfield        #79  <Field String zzcp>
		//   22   44:invokespecial   #86  <Method void Credential(String, String, Uri, List, String, String, String, String, String, String)>
		//   23   47:areturn         
		}

		public Builder setAccountType(String s)
		{
			zzbx = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #59  <Field String zzbx>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setName(String s)
		{
			mName = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #37  <Field String mName>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setPassword(String s)
		{
			zzcl = s;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #54  <Field String zzcl>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		public Builder setProfilePictureUri(Uri uri)
		{
			zzcj = uri;
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:putfield        #43  <Field Uri zzcj>
			return this;
		//    3    5:aload_0         
		//    4    6:areturn         
		}

		private String mName;
		private String zzbx;
		private final String zzci;
		private Uri zzcj;
		private List zzck;
		private String zzcl;
		private String zzcm;
		private String zzcn;
		private String zzco;
		private String zzcp;

		public Builder(Credential credential)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			zzci = Credential.zzd(credential);
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:invokestatic    #30  <Method String Credential.zzd(Credential)>
		//    5    9:putfield        #32  <Field String zzci>
			mName = Credential.zze(credential);
		//    6   12:aload_0         
		//    7   13:aload_1         
		//    8   14:invokestatic    #35  <Method String Credential.zze(Credential)>
		//    9   17:putfield        #37  <Field String mName>
			zzcj = Credential.zzf(credential);
		//   10   20:aload_0         
		//   11   21:aload_1         
		//   12   22:invokestatic    #41  <Method Uri Credential.zzf(Credential)>
		//   13   25:putfield        #43  <Field Uri zzcj>
			zzck = Credential.zzg(credential);
		//   14   28:aload_0         
		//   15   29:aload_1         
		//   16   30:invokestatic    #47  <Method List Credential.zzg(Credential)>
		//   17   33:putfield        #49  <Field List zzck>
			zzcl = Credential.zzh(credential);
		//   18   36:aload_0         
		//   19   37:aload_1         
		//   20   38:invokestatic    #52  <Method String Credential.zzh(Credential)>
		//   21   41:putfield        #54  <Field String zzcl>
			zzbx = Credential.zzi(credential);
		//   22   44:aload_0         
		//   23   45:aload_1         
		//   24   46:invokestatic    #57  <Method String Credential.zzi(Credential)>
		//   25   49:putfield        #59  <Field String zzbx>
			zzcm = Credential.zzj(credential);
		//   26   52:aload_0         
		//   27   53:aload_1         
		//   28   54:invokestatic    #62  <Method String Credential.zzj(Credential)>
		//   29   57:putfield        #64  <Field String zzcm>
			zzcn = Credential.zzk(credential);
		//   30   60:aload_0         
		//   31   61:aload_1         
		//   32   62:invokestatic    #67  <Method String Credential.zzk(Credential)>
		//   33   65:putfield        #69  <Field String zzcn>
			zzco = Credential.zzl(credential);
		//   34   68:aload_0         
		//   35   69:aload_1         
		//   36   70:invokestatic    #72  <Method String Credential.zzl(Credential)>
		//   37   73:putfield        #74  <Field String zzco>
			zzcp = Credential.zzm(credential);
		//   38   76:aload_0         
		//   39   77:aload_1         
		//   40   78:invokestatic    #77  <Method String Credential.zzm(Credential)>
		//   41   81:putfield        #79  <Field String zzcp>
		//   42   84:return          
		}

		public Builder(String s)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #26  <Method void Object()>
			zzci = s;
		//    2    4:aload_0         
		//    3    5:aload_1         
		//    4    6:putfield        #32  <Field String zzci>
		//    5    9:return          
		}
	}


	Credential(String s, String s1, Uri uri, List list, String s2, String s3, String s4, 
			String s5, String s6, String s7)
	{
		String s8;
label0:
		{
			boolean flag;
label1:
			{
				super();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void AbstractSafeParcelable()>
				s8 = ((String)Preconditions.checkNotNull(((Object) (s)), "credential identifier cannot be null")).trim();
	//    2    4:aload_1         
	//    3    5:ldc1            #76  <String "credential identifier cannot be null">
	//    4    7:invokestatic    #82  <Method Object Preconditions.checkNotNull(Object, Object)>
	//    5   10:checkcast       #84  <Class String>
	//    6   13:invokevirtual   #88  <Method String String.trim()>
	//    7   16:astore          14
				Preconditions.checkNotEmpty(s8, "credential identifier cannot be empty");
	//    8   18:aload           14
	//    9   20:ldc1            #90  <String "credential identifier cannot be empty">
	//   10   22:invokestatic    #94  <Method String Preconditions.checkNotEmpty(String, Object)>
	//   11   25:pop             
				if(s2 != null && TextUtils.isEmpty(((CharSequence) (s2))))
	//*  12   26:aload           5
	//*  13   28:ifnull          52
	//*  14   31:aload           5
	//*  15   33:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   36:ifne            42
	//*  17   39:goto            52
					throw new IllegalArgumentException("Password must not be empty if set");
	//   18   42:new             #102 <Class IllegalArgumentException>
	//   19   45:dup             
	//   20   46:ldc1            #104 <String "Password must not be empty if set">
	//   21   48:invokespecial   #107 <Method void IllegalArgumentException(String)>
	//   22   51:athrow          
				if(s3 == null)
					break label0;
	//   23   52:aload           6
	//   24   54:ifnull          190
				boolean flag2 = TextUtils.isEmpty(((CharSequence) (s3)));
	//   25   57:aload           6
	//   26   59:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   27   62:istore          13
				boolean flag1 = false;
	//   28   64:iconst_0        
	//   29   65:istore          12
				flag = flag1;
	//   30   67:iload           12
	//   31   69:istore          11
				if(flag2)
					break label1;
	//   32   71:iload           13
	//   33   73:ifne            166
				s = ((String) (Uri.parse(s3)));
	//   34   76:aload           6
	//   35   78:invokestatic    #113 <Method Uri Uri.parse(String)>
	//   36   81:astore_1        
				flag = flag1;
	//   37   82:iload           12
	//   38   84:istore          11
				if(!((Uri) (s)).isAbsolute())
					break label1;
	//   39   86:aload_1         
	//   40   87:invokevirtual   #117 <Method boolean Uri.isAbsolute()>
	//   41   90:ifeq            166
				flag = flag1;
	//   42   93:iload           12
	//   43   95:istore          11
				if(!((Uri) (s)).isHierarchical())
					break label1;
	//   44   97:aload_1         
	//   45   98:invokevirtual   #120 <Method boolean Uri.isHierarchical()>
	//   46  101:ifeq            166
				flag = flag1;
	//   47  104:iload           12
	//   48  106:istore          11
				if(TextUtils.isEmpty(((CharSequence) (((Uri) (s)).getScheme()))))
					break label1;
	//   49  108:aload_1         
	//   50  109:invokevirtual   #123 <Method String Uri.getScheme()>
	//   51  112:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//   52  115:ifne            166
				if(TextUtils.isEmpty(((CharSequence) (((Uri) (s)).getAuthority()))))
	//*  53  118:aload_1         
	//*  54  119:invokevirtual   #126 <Method String Uri.getAuthority()>
	//*  55  122:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  56  125:ifeq            135
				{
					flag = flag1;
	//   57  128:iload           12
	//   58  130:istore          11
					break label1;
	//   59  132:goto            166
				}
				if(!"http".equalsIgnoreCase(((Uri) (s)).getScheme()))
	//*  60  135:ldc1            #128 <String "http">
	//*  61  137:aload_1         
	//*  62  138:invokevirtual   #123 <Method String Uri.getScheme()>
	//*  63  141:invokevirtual   #132 <Method boolean String.equalsIgnoreCase(String)>
	//*  64  144:ifne            163
				{
					flag = flag1;
	//   65  147:iload           12
	//   66  149:istore          11
					if(!"https".equalsIgnoreCase(((Uri) (s)).getScheme()))
						break label1;
	//   67  151:ldc1            #134 <String "https">
	//   68  153:aload_1         
	//   69  154:invokevirtual   #123 <Method String Uri.getScheme()>
	//   70  157:invokevirtual   #132 <Method boolean String.equalsIgnoreCase(String)>
	//   71  160:ifeq            166
				}
				flag = true;
	//   72  163:iconst_1        
	//   73  164:istore          11
			}
			if(!Boolean.valueOf(flag).booleanValue())
	//*  74  166:iload           11
	//*  75  168:invokestatic    #140 <Method Boolean Boolean.valueOf(boolean)>
	//*  76  171:invokevirtual   #143 <Method boolean Boolean.booleanValue()>
	//*  77  174:ifeq            180
	//*  78  177:goto            190
				throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
	//   79  180:new             #102 <Class IllegalArgumentException>
	//   80  183:dup             
	//   81  184:ldc1            #145 <String "Account type must be a valid Http/Https URI">
	//   82  186:invokespecial   #107 <Method void IllegalArgumentException(String)>
	//   83  189:athrow          
		}
		if(!TextUtils.isEmpty(((CharSequence) (s3))) && !TextUtils.isEmpty(((CharSequence) (s2))))
	//*  84  190:aload           6
	//*  85  192:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  86  195:ifne            219
	//*  87  198:aload           5
	//*  88  200:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  89  203:ifeq            209
	//*  90  206:goto            219
			throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
	//   91  209:new             #102 <Class IllegalArgumentException>
	//   92  212:dup             
	//   93  213:ldc1            #147 <String "Password and AccountType are mutually exclusive">
	//   94  215:invokespecial   #107 <Method void IllegalArgumentException(String)>
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
	//* 103  228:invokevirtual   #88  <Method String String.trim()>
	//* 104  231:invokestatic    #100 <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 105  234:ifeq            239
				s = null;
	//  106  237:aconst_null     
	//  107  238:astore_1        
		}
		mName = s;
	//  108  239:aload_0         
	//  109  240:aload_1         
	//  110  241:putfield        #149 <Field String mName>
		zzcj = uri;
	//  111  244:aload_0         
	//  112  245:aload_3         
	//  113  246:putfield        #151 <Field Uri zzcj>
		if(list == null)
	//* 114  249:aload           4
	//* 115  251:ifnonnull       261
			s = ((String) (Collections.emptyList()));
	//  116  254:invokestatic    #157 <Method List Collections.emptyList()>
	//  117  257:astore_1        
		else
	//* 118  258:goto            267
			s = ((String) (Collections.unmodifiableList(list)));
	//  119  261:aload           4
	//  120  263:invokestatic    #161 <Method List Collections.unmodifiableList(List)>
	//  121  266:astore_1        
		zzck = ((List) (s));
	//  122  267:aload_0         
	//  123  268:aload_1         
	//  124  269:putfield        #163 <Field List zzck>
		zzci = s8;
	//  125  272:aload_0         
	//  126  273:aload           14
	//  127  275:putfield        #165 <Field String zzci>
		zzcl = s2;
	//  128  278:aload_0         
	//  129  279:aload           5
	//  130  281:putfield        #167 <Field String zzcl>
		zzbx = s3;
	//  131  284:aload_0         
	//  132  285:aload           6
	//  133  287:putfield        #169 <Field String zzbx>
		zzcm = s4;
	//  134  290:aload_0         
	//  135  291:aload           7
	//  136  293:putfield        #171 <Field String zzcm>
		zzcn = s5;
	//  137  296:aload_0         
	//  138  297:aload           8
	//  139  299:putfield        #173 <Field String zzcn>
		zzco = s6;
	//  140  302:aload_0         
	//  141  303:aload           9
	//  142  305:putfield        #175 <Field String zzco>
		zzcp = s7;
	//  143  308:aload_0         
	//  144  309:aload           10
	//  145  311:putfield        #177 <Field String zzcp>
	//  146  314:return          
	}

	static String zzd(Credential credential)
	{
		return credential.zzci;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field String zzci>
	//    2    4:areturn         
	}

	static String zze(Credential credential)
	{
		return credential.mName;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field String mName>
	//    2    4:areturn         
	}

	static Uri zzf(Credential credential)
	{
		return credential.zzcj;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Uri zzcj>
	//    2    4:areturn         
	}

	static List zzg(Credential credential)
	{
		return credential.zzck;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field List zzck>
	//    2    4:areturn         
	}

	static String zzh(Credential credential)
	{
		return credential.zzcl;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field String zzcl>
	//    2    4:areturn         
	}

	static String zzi(Credential credential)
	{
		return credential.zzbx;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field String zzbx>
	//    2    4:areturn         
	}

	static String zzj(Credential credential)
	{
		return credential.zzcm;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field String zzcm>
	//    2    4:areturn         
	}

	static String zzk(Credential credential)
	{
		return credential.zzcn;
	//    0    0:aload_0         
	//    1    1:getfield        #173 <Field String zzcn>
	//    2    4:areturn         
	}

	static String zzl(Credential credential)
	{
		return credential.zzco;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field String zzco>
	//    2    4:areturn         
	}

	static String zzm(Credential credential)
	{
		return credential.zzcp;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field String zzcp>
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
		return TextUtils.equals(((CharSequence) (zzci)), ((CharSequence) (((Credential) (obj)).zzci))) && TextUtils.equals(((CharSequence) (mName)), ((CharSequence) (((Credential) (obj)).mName))) && Objects.equal(((Object) (zzcj)), ((Object) (((Credential) (obj)).zzcj))) && TextUtils.equals(((CharSequence) (zzcl)), ((CharSequence) (((Credential) (obj)).zzcl))) && TextUtils.equals(((CharSequence) (zzbx)), ((CharSequence) (((Credential) (obj)).zzbx))) && TextUtils.equals(((CharSequence) (zzcm)), ((CharSequence) (((Credential) (obj)).zzcm)));
	//   13   21:aload_0         
	//   14   22:getfield        #165 <Field String zzci>
	//   15   25:aload_1         
	//   16   26:getfield        #165 <Field String zzci>
	//   17   29:invokestatic    #199 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   18   32:ifeq            107
	//   19   35:aload_0         
	//   20   36:getfield        #149 <Field String mName>
	//   21   39:aload_1         
	//   22   40:getfield        #149 <Field String mName>
	//   23   43:invokestatic    #199 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   24   46:ifeq            107
	//   25   49:aload_0         
	//   26   50:getfield        #151 <Field Uri zzcj>
	//   27   53:aload_1         
	//   28   54:getfield        #151 <Field Uri zzcj>
	//   29   57:invokestatic    #205 <Method boolean Objects.equal(Object, Object)>
	//   30   60:ifeq            107
	//   31   63:aload_0         
	//   32   64:getfield        #167 <Field String zzcl>
	//   33   67:aload_1         
	//   34   68:getfield        #167 <Field String zzcl>
	//   35   71:invokestatic    #199 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   36   74:ifeq            107
	//   37   77:aload_0         
	//   38   78:getfield        #169 <Field String zzbx>
	//   39   81:aload_1         
	//   40   82:getfield        #169 <Field String zzbx>
	//   41   85:invokestatic    #199 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   42   88:ifeq            107
	//   43   91:aload_0         
	//   44   92:getfield        #171 <Field String zzcm>
	//   45   95:aload_1         
	//   46   96:getfield        #171 <Field String zzcm>
	//   47   99:invokestatic    #199 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   48  102:ifeq            107
	//   49  105:iconst_1        
	//   50  106:ireturn         
	//   51  107:iconst_0        
	//   52  108:ireturn         
	}

	public String getAccountType()
	{
		return zzbx;
	//    0    0:aload_0         
	//    1    1:getfield        #169 <Field String zzbx>
	//    2    4:areturn         
	}

	public String getFamilyName()
	{
		return zzcp;
	//    0    0:aload_0         
	//    1    1:getfield        #177 <Field String zzcp>
	//    2    4:areturn         
	}

	public String getGeneratedPassword()
	{
		return zzcm;
	//    0    0:aload_0         
	//    1    1:getfield        #171 <Field String zzcm>
	//    2    4:areturn         
	}

	public String getGivenName()
	{
		return zzco;
	//    0    0:aload_0         
	//    1    1:getfield        #175 <Field String zzco>
	//    2    4:areturn         
	}

	public String getId()
	{
		return zzci;
	//    0    0:aload_0         
	//    1    1:getfield        #165 <Field String zzci>
	//    2    4:areturn         
	}

	public List getIdTokens()
	{
		return zzck;
	//    0    0:aload_0         
	//    1    1:getfield        #163 <Field List zzck>
	//    2    4:areturn         
	}

	public String getName()
	{
		return mName;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field String mName>
	//    2    4:areturn         
	}

	public String getPassword()
	{
		return zzcl;
	//    0    0:aload_0         
	//    1    1:getfield        #167 <Field String zzcl>
	//    2    4:areturn         
	}

	public Uri getProfilePictureUri()
	{
		return zzcj;
	//    0    0:aload_0         
	//    1    1:getfield        #151 <Field Uri zzcj>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return Objects.hashCode(new Object[] {
			zzci, mName, zzcj, zzcl, zzbx, zzcm
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #165 <Field String zzci>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #149 <Field String mName>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #151 <Field Uri zzcj>
	//   16   25:aastore         
	//   17   26:dup             
	//   18   27:iconst_3        
	//   19   28:aload_0         
	//   20   29:getfield        #167 <Field String zzcl>
	//   21   32:aastore         
	//   22   33:dup             
	//   23   34:iconst_4        
	//   24   35:aload_0         
	//   25   36:getfield        #169 <Field String zzbx>
	//   26   39:aastore         
	//   27   40:dup             
	//   28   41:iconst_5        
	//   29   42:aload_0         
	//   30   43:getfield        #171 <Field String zzcm>
	//   31   46:aastore         
	//   32   47:invokestatic    #215 <Method int Objects.hashCode(Object[])>
	//   33   50:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #223 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_3        
		SafeParcelWriter.writeString(parcel, 1, getId(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #225 <Method String getId()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #229 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 2, getName(), false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #231 <Method String getName()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #229 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeParcelable(parcel, 3, ((android.os.Parcelable) (getProfilePictureUri())), i, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #233 <Method Uri getProfilePictureUri()>
	//   19   31:iload_2         
	//   20   32:iconst_0        
	//   21   33:invokestatic    #237 <Method void SafeParcelWriter.writeParcelable(Parcel, int, android.os.Parcelable, int, boolean)>
		SafeParcelWriter.writeTypedList(parcel, 4, getIdTokens(), false);
	//   22   36:aload_1         
	//   23   37:iconst_4        
	//   24   38:aload_0         
	//   25   39:invokevirtual   #239 <Method List getIdTokens()>
	//   26   42:iconst_0        
	//   27   43:invokestatic    #243 <Method void SafeParcelWriter.writeTypedList(Parcel, int, List, boolean)>
		SafeParcelWriter.writeString(parcel, 5, getPassword(), false);
	//   28   46:aload_1         
	//   29   47:iconst_5        
	//   30   48:aload_0         
	//   31   49:invokevirtual   #245 <Method String getPassword()>
	//   32   52:iconst_0        
	//   33   53:invokestatic    #229 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 6, getAccountType(), false);
	//   34   56:aload_1         
	//   35   57:bipush          6
	//   36   59:aload_0         
	//   37   60:invokevirtual   #247 <Method String getAccountType()>
	//   38   63:iconst_0        
	//   39   64:invokestatic    #229 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 7, getGeneratedPassword(), false);
	//   40   67:aload_1         
	//   41   68:bipush          7
	//   42   70:aload_0         
	//   43   71:invokevirtual   #249 <Method String getGeneratedPassword()>
	//   44   74:iconst_0        
	//   45   75:invokestatic    #229 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 8, zzcn, false);
	//   46   78:aload_1         
	//   47   79:bipush          8
	//   48   81:aload_0         
	//   49   82:getfield        #173 <Field String zzcn>
	//   50   85:iconst_0        
	//   51   86:invokestatic    #229 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 9, getGivenName(), false);
	//   52   89:aload_1         
	//   53   90:bipush          9
	//   54   92:aload_0         
	//   55   93:invokevirtual   #251 <Method String getGivenName()>
	//   56   96:iconst_0        
	//   57   97:invokestatic    #229 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 10, getFamilyName(), false);
	//   58  100:aload_1         
	//   59  101:bipush          10
	//   60  103:aload_0         
	//   61  104:invokevirtual   #253 <Method String getFamilyName()>
	//   62  107:iconst_0        
	//   63  108:invokestatic    #229 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.finishObjectHeader(parcel, j);
	//   64  111:aload_1         
	//   65  112:iload_3         
	//   66  113:invokestatic    #256 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   67  116:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzd();
	public static final String EXTRA_KEY = "com.google.android.gms.credentials.Credential";
	private final String mName;
	private final String zzbx;
	private final String zzci;
	private final Uri zzcj;
	private final List zzck;
	private final String zzcl;
	private final String zzcm;
	private final String zzcn;
	private final String zzco;
	private final String zzcp;

	static 
	{
	//    0    0:new             #64  <Class zzd>
	//    1    3:dup             
	//    2    4:invokespecial   #67  <Method void zzd()>
	//    3    7:putstatic       #69  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
