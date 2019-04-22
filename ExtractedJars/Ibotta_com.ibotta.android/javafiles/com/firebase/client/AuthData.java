// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.firebase.client;

import java.util.Collections;
import java.util.Map;

public class AuthData
{

	public AuthData(String s, long l, String s1, String s2, Map map, Map map1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #19  <Method void Object()>
		token = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #21  <Field String token>
		expires = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #23  <Field long expires>
		uid = s1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #25  <Field String uid>
		provider = s2;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #27  <Field String provider>
		s1 = null;
	//   14   26:aconst_null     
	//   15   27:astore          4
		if(map1 != null)
	//*  16   29:aload           7
	//*  17   31:ifnull          43
			s = ((String) (Collections.unmodifiableMap(map1)));
	//   18   34:aload           7
	//   19   36:invokestatic    #33  <Method Map Collections.unmodifiableMap(Map)>
	//   20   39:astore_1        
		else
	//*  21   40:goto            45
			s = null;
	//   22   43:aconst_null     
	//   23   44:astore_1        
		providerData = ((Map) (s));
	//   24   45:aload_0         
	//   25   46:aload_1         
	//   26   47:putfield        #35  <Field Map providerData>
		s = s1;
	//   27   50:aload           4
	//   28   52:astore_1        
		if(map != null)
	//*  29   53:aload           6
	//*  30   55:ifnull          64
			s = ((String) (Collections.unmodifiableMap(map)));
	//   31   58:aload           6
	//   32   60:invokestatic    #33  <Method Map Collections.unmodifiableMap(Map)>
	//   33   63:astore_1        
		auth = ((Map) (s));
	//   34   64:aload_0         
	//   35   65:aload_1         
	//   36   66:putfield        #37  <Field Map auth>
	//   37   69:return          
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
	//*   6    8:ifnull          204
		{
			if(((Object)this).getClass() != obj.getClass())
	//*   7   11:aload_0         
	//*   8   12:invokevirtual   #46  <Method Class Object.getClass()>
	//*   9   15:aload_1         
	//*  10   16:invokevirtual   #46  <Method Class Object.getClass()>
	//*  11   19:if_acmpeq       24
				return false;
	//   12   22:iconst_0        
	//   13   23:ireturn         
			obj = ((Object) ((AuthData)obj));
	//   14   24:aload_1         
	//   15   25:checkcast       #2   <Class AuthData>
	//   16   28:astore_1        
			Object obj1 = ((Object) (provider));
	//   17   29:aload_0         
	//   18   30:getfield        #27  <Field String provider>
	//   19   33:astore_2        
			if(obj1 != null)
	//*  20   34:aload_2         
	//*  21   35:ifnull          51
			{
				if(!((String) (obj1)).equals(((Object) (((AuthData) (obj)).provider))))
	//*  22   38:aload_2         
	//*  23   39:aload_1         
	//*  24   40:getfield        #27  <Field String provider>
	//*  25   43:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  26   46:ifne            60
					return false;
	//   27   49:iconst_0        
	//   28   50:ireturn         
			} else
			if(((AuthData) (obj)).provider != null)
	//*  29   51:aload_1         
	//*  30   52:getfield        #27  <Field String provider>
	//*  31   55:ifnull          60
				return false;
	//   32   58:iconst_0        
	//   33   59:ireturn         
			obj1 = ((Object) (providerData));
	//   34   60:aload_0         
	//   35   61:getfield        #35  <Field Map providerData>
	//   36   64:astore_2        
			if(obj1 != null)
	//*  37   65:aload_2         
	//*  38   66:ifnull          84
			{
				if(!((Map) (obj1)).equals(((Object) (((AuthData) (obj)).providerData))))
	//*  39   69:aload_2         
	//*  40   70:aload_1         
	//*  41   71:getfield        #35  <Field Map providerData>
	//*  42   74:invokeinterface #53  <Method boolean Map.equals(Object)>
	//*  43   79:ifne            93
					return false;
	//   44   82:iconst_0        
	//   45   83:ireturn         
			} else
			if(((AuthData) (obj)).providerData != null)
	//*  46   84:aload_1         
	//*  47   85:getfield        #35  <Field Map providerData>
	//*  48   88:ifnull          93
				return false;
	//   49   91:iconst_0        
	//   50   92:ireturn         
			obj1 = ((Object) (auth));
	//   51   93:aload_0         
	//   52   94:getfield        #37  <Field Map auth>
	//   53   97:astore_2        
			if(obj1 != null)
	//*  54   98:aload_2         
	//*  55   99:ifnull          117
			{
				if(!((Map) (obj1)).equals(((Object) (((AuthData) (obj)).auth))))
	//*  56  102:aload_2         
	//*  57  103:aload_1         
	//*  58  104:getfield        #37  <Field Map auth>
	//*  59  107:invokeinterface #53  <Method boolean Map.equals(Object)>
	//*  60  112:ifne            126
					return false;
	//   61  115:iconst_0        
	//   62  116:ireturn         
			} else
			if(((AuthData) (obj)).auth != null)
	//*  63  117:aload_1         
	//*  64  118:getfield        #37  <Field Map auth>
	//*  65  121:ifnull          126
				return false;
	//   66  124:iconst_0        
	//   67  125:ireturn         
			obj1 = ((Object) (token));
	//   68  126:aload_0         
	//   69  127:getfield        #21  <Field String token>
	//   70  130:astore_2        
			if(obj1 != null)
	//*  71  131:aload_2         
	//*  72  132:ifnull          148
			{
				if(!((String) (obj1)).equals(((Object) (((AuthData) (obj)).token))))
	//*  73  135:aload_2         
	//*  74  136:aload_1         
	//*  75  137:getfield        #21  <Field String token>
	//*  76  140:invokevirtual   #50  <Method boolean String.equals(Object)>
	//*  77  143:ifne            157
					return false;
	//   78  146:iconst_0        
	//   79  147:ireturn         
			} else
			if(((AuthData) (obj)).token != null)
	//*  80  148:aload_1         
	//*  81  149:getfield        #21  <Field String token>
	//*  82  152:ifnull          157
				return false;
	//   83  155:iconst_0        
	//   84  156:ireturn         
			if(expires != ((AuthData) (obj)).expires)
	//*  85  157:aload_0         
	//*  86  158:getfield        #23  <Field long expires>
	//*  87  161:aload_1         
	//*  88  162:getfield        #23  <Field long expires>
	//*  89  165:lcmp            
	//*  90  166:ifeq            171
				return false;
	//   91  169:iconst_0        
	//   92  170:ireturn         
			obj1 = ((Object) (uid));
	//   93  171:aload_0         
	//   94  172:getfield        #25  <Field String uid>
	//   95  175:astore_2        
			if(obj1 != null)
	//*  96  176:aload_2         
	//*  97  177:ifnull          193
			{
				if(!((String) (obj1)).equals(((Object) (((AuthData) (obj)).uid))))
	//*  98  180:aload_2         
	//*  99  181:aload_1         
	//* 100  182:getfield        #25  <Field String uid>
	//* 101  185:invokevirtual   #50  <Method boolean String.equals(Object)>
	//* 102  188:ifne            202
					return false;
	//  103  191:iconst_0        
	//  104  192:ireturn         
			} else
			if(((AuthData) (obj)).uid != null)
	//* 105  193:aload_1         
	//* 106  194:getfield        #25  <Field String uid>
	//* 107  197:ifnull          202
				return false;
	//  108  200:iconst_0        
	//  109  201:ireturn         
			return true;
	//  110  202:iconst_1        
	//  111  203:ireturn         
		} else
		{
			return false;
	//  112  204:iconst_0        
	//  113  205:ireturn         
		}
	}

	public Map getAuth()
	{
		return auth;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field Map auth>
	//    2    4:areturn         
	}

	public long getExpires()
	{
		return expires;
	//    0    0:aload_0         
	//    1    1:getfield        #23  <Field long expires>
	//    2    4:lreturn         
	}

	public String getProvider()
	{
		return provider;
	//    0    0:aload_0         
	//    1    1:getfield        #27  <Field String provider>
	//    2    4:areturn         
	}

	public Map getProviderData()
	{
		return providerData;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field Map providerData>
	//    2    4:areturn         
	}

	public String getToken()
	{
		return token;
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String token>
	//    2    4:areturn         
	}

	public String getUid()
	{
		return uid;
	//    0    0:aload_0         
	//    1    1:getfield        #25  <Field String uid>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		Object obj = ((Object) (token));
	//    0    0:aload_0         
	//    1    1:getfield        #21  <Field String token>
	//    2    4:astore          6
		int i1 = 0;
	//    3    6:iconst_0        
	//    4    7:istore          5
		int i;
		if(obj != null)
	//*   5    9:aload           6
	//*   6   11:ifnull          23
			i = ((String) (obj)).hashCode();
	//    7   14:aload           6
	//    8   16:invokevirtual   #67  <Method int String.hashCode()>
	//    9   19:istore_1        
		else
	//*  10   20:goto            25
			i = 0;
	//   11   23:iconst_0        
	//   12   24:istore_1        
		obj = ((Object) (uid));
	//   13   25:aload_0         
	//   14   26:getfield        #25  <Field String uid>
	//   15   29:astore          6
		int j;
		if(obj != null)
	//*  16   31:aload           6
	//*  17   33:ifnull          45
			j = ((String) (obj)).hashCode();
	//   18   36:aload           6
	//   19   38:invokevirtual   #67  <Method int String.hashCode()>
	//   20   41:istore_2        
		else
	//*  21   42:goto            47
			j = 0;
	//   22   45:iconst_0        
	//   23   46:istore_2        
		obj = ((Object) (provider));
	//   24   47:aload_0         
	//   25   48:getfield        #27  <Field String provider>
	//   26   51:astore          6
		int k;
		if(obj != null)
	//*  27   53:aload           6
	//*  28   55:ifnull          67
			k = ((String) (obj)).hashCode();
	//   29   58:aload           6
	//   30   60:invokevirtual   #67  <Method int String.hashCode()>
	//   31   63:istore_3        
		else
	//*  32   64:goto            69
			k = 0;
	//   33   67:iconst_0        
	//   34   68:istore_3        
		obj = ((Object) (providerData));
	//   35   69:aload_0         
	//   36   70:getfield        #35  <Field Map providerData>
	//   37   73:astore          6
		int l;
		if(obj != null)
	//*  38   75:aload           6
	//*  39   77:ifnull          92
			l = ((Map) (obj)).hashCode();
	//   40   80:aload           6
	//   41   82:invokeinterface #68  <Method int Map.hashCode()>
	//   42   87:istore          4
		else
	//*  43   89:goto            95
			l = 0;
	//   44   92:iconst_0        
	//   45   93:istore          4
		obj = ((Object) (auth));
	//   46   95:aload_0         
	//   47   96:getfield        #37  <Field Map auth>
	//   48   99:astore          6
		if(obj != null)
	//*  49  101:aload           6
	//*  50  103:ifnull          115
			i1 = ((Map) (obj)).hashCode();
	//   51  106:aload           6
	//   52  108:invokeinterface #68  <Method int Map.hashCode()>
	//   53  113:istore          5
		return (((i * 31 + j) * 31 + k) * 31 + l) * 31 + i1;
	//   54  115:iload_1         
	//   55  116:bipush          31
	//   56  118:imul            
	//   57  119:iload_2         
	//   58  120:iadd            
	//   59  121:bipush          31
	//   60  123:imul            
	//   61  124:iload_3         
	//   62  125:iadd            
	//   63  126:bipush          31
	//   64  128:imul            
	//   65  129:iload           4
	//   66  131:iadd            
	//   67  132:bipush          31
	//   68  134:imul            
	//   69  135:iload           5
	//   70  137:iadd            
	//   71  138:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder();
	//    0    0:new             #71  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #72  <Method void StringBuilder()>
	//    3    7:astore_2        
		stringbuilder.append("AuthData{uid='");
	//    4    8:aload_2         
	//    5    9:ldc1            #74  <String "AuthData{uid='">
	//    6   11:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(uid);
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:getfield        #25  <Field String uid>
	//   11   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append('\'');
	//   13   24:aload_2         
	//   14   25:bipush          39
	//   15   27:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   16   30:pop             
		stringbuilder.append(", provider='");
	//   17   31:aload_2         
	//   18   32:ldc1            #83  <String ", provider='">
	//   19   34:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   20   37:pop             
		stringbuilder.append(provider);
	//   21   38:aload_2         
	//   22   39:aload_0         
	//   23   40:getfield        #27  <Field String provider>
	//   24   43:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   25   46:pop             
		stringbuilder.append('\'');
	//   26   47:aload_2         
	//   27   48:bipush          39
	//   28   50:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   29   53:pop             
		stringbuilder.append(", token='");
	//   30   54:aload_2         
	//   31   55:ldc1            #85  <String ", token='">
	//   32   57:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   33   60:pop             
		String s;
		if(token == null)
	//*  34   61:aload_0         
	//*  35   62:getfield        #21  <Field String token>
	//*  36   65:ifnonnull       73
			s = null;
	//   37   68:aconst_null     
	//   38   69:astore_1        
		else
	//*  39   70:goto            76
			s = "***";
	//   40   73:ldc1            #87  <String "***">
	//   41   75:astore_1        
		stringbuilder.append(s);
	//   42   76:aload_2         
	//   43   77:aload_1         
	//   44   78:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   45   81:pop             
		stringbuilder.append('\'');
	//   46   82:aload_2         
	//   47   83:bipush          39
	//   48   85:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   49   88:pop             
		stringbuilder.append(", expires='");
	//   50   89:aload_2         
	//   51   90:ldc1            #89  <String ", expires='">
	//   52   92:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   53   95:pop             
		stringbuilder.append(expires);
	//   54   96:aload_2         
	//   55   97:aload_0         
	//   56   98:getfield        #23  <Field long expires>
	//   57  101:invokevirtual   #92  <Method StringBuilder StringBuilder.append(long)>
	//   58  104:pop             
		stringbuilder.append('\'');
	//   59  105:aload_2         
	//   60  106:bipush          39
	//   61  108:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   62  111:pop             
		stringbuilder.append(", auth='");
	//   63  112:aload_2         
	//   64  113:ldc1            #94  <String ", auth='">
	//   65  115:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   66  118:pop             
		stringbuilder.append(((Object) (auth)));
	//   67  119:aload_2         
	//   68  120:aload_0         
	//   69  121:getfield        #37  <Field Map auth>
	//   70  124:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   71  127:pop             
		stringbuilder.append('\'');
	//   72  128:aload_2         
	//   73  129:bipush          39
	//   74  131:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   75  134:pop             
		stringbuilder.append(", providerData='");
	//   76  135:aload_2         
	//   77  136:ldc1            #99  <String ", providerData='">
	//   78  138:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   79  141:pop             
		stringbuilder.append(((Object) (providerData)));
	//   80  142:aload_2         
	//   81  143:aload_0         
	//   82  144:getfield        #35  <Field Map providerData>
	//   83  147:invokevirtual   #97  <Method StringBuilder StringBuilder.append(Object)>
	//   84  150:pop             
		stringbuilder.append('\'');
	//   85  151:aload_2         
	//   86  152:bipush          39
	//   87  154:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   88  157:pop             
		stringbuilder.append('}');
	//   89  158:aload_2         
	//   90  159:bipush          125
	//   91  161:invokevirtual   #81  <Method StringBuilder StringBuilder.append(char)>
	//   92  164:pop             
		return stringbuilder.toString();
	//   93  165:aload_2         
	//   94  166:invokevirtual   #101 <Method String StringBuilder.toString()>
	//   95  169:areturn         
	}

	private final Map auth;
	private final long expires;
	private final String provider;
	private final Map providerData;
	private final String token;
	private final String uid;
}
