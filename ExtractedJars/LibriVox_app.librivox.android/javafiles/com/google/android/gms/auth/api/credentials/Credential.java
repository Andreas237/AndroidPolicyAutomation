// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.internal.*;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.google.android.gms.auth.api.credentials:
//			c

public class Credential extends AbstractSafeParcelable
	implements ReflectedParcelable
{

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
	//    1    1:invokespecial   #32  <Method void AbstractSafeParcelable()>
				s6 = ((String)am.a(((Object) (s)), "credential identifier cannot be null")).trim();
	//    2    4:aload_1         
	//    3    5:ldc1            #34  <String "credential identifier cannot be null">
	//    4    7:invokestatic    #39  <Method Object am.a(Object, Object)>
	//    5   10:checkcast       #41  <Class String>
	//    6   13:invokevirtual   #45  <Method String String.trim()>
	//    7   16:astore          12
				am.a(s6, "credential identifier cannot be empty");
	//    8   18:aload           12
	//    9   20:ldc1            #47  <String "credential identifier cannot be empty">
	//   10   22:invokestatic    #50  <Method String am.a(String, Object)>
	//   11   25:pop             
				if(s2 != null && TextUtils.isEmpty(((CharSequence) (s2))))
	//*  12   26:aload           5
	//*  13   28:ifnull          52
	//*  14   31:aload           5
	//*  15   33:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  16   36:ifne            42
	//*  17   39:goto            52
					throw new IllegalArgumentException("Password must not be empty if set");
	//   18   42:new             #58  <Class IllegalArgumentException>
	//   19   45:dup             
	//   20   46:ldc1            #60  <String "Password must not be empty if set">
	//   21   48:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   22   51:athrow          
				if(s3 == null)
					break label0;
	//   23   52:aload           6
	//   24   54:ifnull          190
				boolean flag2 = TextUtils.isEmpty(((CharSequence) (s3)));
	//   25   57:aload           6
	//   26   59:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
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
	//   35   78:invokestatic    #69  <Method Uri Uri.parse(String)>
	//   36   81:astore_1        
				flag = flag1;
	//   37   82:iload           10
	//   38   84:istore          9
				if(!((Uri) (s)).isAbsolute())
					break label1;
	//   39   86:aload_1         
	//   40   87:invokevirtual   #73  <Method boolean Uri.isAbsolute()>
	//   41   90:ifeq            166
				flag = flag1;
	//   42   93:iload           10
	//   43   95:istore          9
				if(!((Uri) (s)).isHierarchical())
					break label1;
	//   44   97:aload_1         
	//   45   98:invokevirtual   #76  <Method boolean Uri.isHierarchical()>
	//   46  101:ifeq            166
				flag = flag1;
	//   47  104:iload           10
	//   48  106:istore          9
				if(TextUtils.isEmpty(((CharSequence) (((Uri) (s)).getScheme()))))
					break label1;
	//   49  108:aload_1         
	//   50  109:invokevirtual   #79  <Method String Uri.getScheme()>
	//   51  112:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//   52  115:ifne            166
				if(TextUtils.isEmpty(((CharSequence) (((Uri) (s)).getAuthority()))))
	//*  53  118:aload_1         
	//*  54  119:invokevirtual   #82  <Method String Uri.getAuthority()>
	//*  55  122:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  56  125:ifeq            135
				{
					flag = flag1;
	//   57  128:iload           10
	//   58  130:istore          9
					break label1;
	//   59  132:goto            166
				}
				if(!"http".equalsIgnoreCase(((Uri) (s)).getScheme()))
	//*  60  135:ldc1            #84  <String "http">
	//*  61  137:aload_1         
	//*  62  138:invokevirtual   #79  <Method String Uri.getScheme()>
	//*  63  141:invokevirtual   #88  <Method boolean String.equalsIgnoreCase(String)>
	//*  64  144:ifne            163
				{
					flag = flag1;
	//   65  147:iload           10
	//   66  149:istore          9
					if(!"https".equalsIgnoreCase(((Uri) (s)).getScheme()))
						break label1;
	//   67  151:ldc1            #90  <String "https">
	//   68  153:aload_1         
	//   69  154:invokevirtual   #79  <Method String Uri.getScheme()>
	//   70  157:invokevirtual   #88  <Method boolean String.equalsIgnoreCase(String)>
	//   71  160:ifeq            166
				}
				flag = true;
	//   72  163:iconst_1        
	//   73  164:istore          9
			}
			if(!Boolean.valueOf(flag).booleanValue())
	//*  74  166:iload           9
	//*  75  168:invokestatic    #96  <Method Boolean Boolean.valueOf(boolean)>
	//*  76  171:invokevirtual   #99  <Method boolean Boolean.booleanValue()>
	//*  77  174:ifeq            180
	//*  78  177:goto            190
				throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
	//   79  180:new             #58  <Class IllegalArgumentException>
	//   80  183:dup             
	//   81  184:ldc1            #101 <String "Account type must be a valid Http/Https URI">
	//   82  186:invokespecial   #63  <Method void IllegalArgumentException(String)>
	//   83  189:athrow          
		}
		if(!TextUtils.isEmpty(((CharSequence) (s3))) && !TextUtils.isEmpty(((CharSequence) (s2))))
	//*  84  190:aload           6
	//*  85  192:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  86  195:ifne            219
	//*  87  198:aload           5
	//*  88  200:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  89  203:ifeq            209
	//*  90  206:goto            219
			throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
	//   91  209:new             #58  <Class IllegalArgumentException>
	//   92  212:dup             
	//   93  213:ldc1            #103 <String "Password and AccountType are mutually exclusive">
	//   94  215:invokespecial   #63  <Method void IllegalArgumentException(String)>
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
	//* 103  228:invokevirtual   #45  <Method String String.trim()>
	//* 104  231:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//* 105  234:ifeq            239
				s = null;
	//  106  237:aconst_null     
	//  107  238:astore_1        
		}
		b = s;
	//  108  239:aload_0         
	//  109  240:aload_1         
	//  110  241:putfield        #105 <Field String b>
		c = uri;
	//  111  244:aload_0         
	//  112  245:aload_3         
	//  113  246:putfield        #107 <Field Uri c>
		if(list == null)
	//* 114  249:aload           4
	//* 115  251:ifnonnull       261
			s = ((String) (Collections.emptyList()));
	//  116  254:invokestatic    #113 <Method List Collections.emptyList()>
	//  117  257:astore_1        
		else
	//* 118  258:goto            267
			s = ((String) (Collections.unmodifiableList(list)));
	//  119  261:aload           4
	//  120  263:invokestatic    #117 <Method List Collections.unmodifiableList(List)>
	//  121  266:astore_1        
		d = ((List) (s));
	//  122  267:aload_0         
	//  123  268:aload_1         
	//  124  269:putfield        #119 <Field List d>
		a = s6;
	//  125  272:aload_0         
	//  126  273:aload           12
	//  127  275:putfield        #121 <Field String a>
		e = s2;
	//  128  278:aload_0         
	//  129  279:aload           5
	//  130  281:putfield        #123 <Field String e>
		f = s3;
	//  131  284:aload_0         
	//  132  285:aload           6
	//  133  287:putfield        #125 <Field String f>
		g = s4;
	//  134  290:aload_0         
	//  135  291:aload           7
	//  136  293:putfield        #127 <Field String g>
		h = s5;
	//  137  296:aload_0         
	//  138  297:aload           8
	//  139  299:putfield        #129 <Field String h>
	//  140  302:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #121 <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String b>
	//    2    4:areturn         
	}

	public Uri c()
	{
		return c;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field Uri c>
	//    2    4:areturn         
	}

	public List d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #119 <Field List d>
	//    2    4:areturn         
	}

	public String e()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #123 <Field String e>
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
		return TextUtils.equals(((CharSequence) (a)), ((CharSequence) (((Credential) (obj)).a))) && TextUtils.equals(((CharSequence) (b)), ((CharSequence) (((Credential) (obj)).b))) && ak.a(((Object) (c)), ((Object) (((Credential) (obj)).c))) && TextUtils.equals(((CharSequence) (e)), ((CharSequence) (((Credential) (obj)).e))) && TextUtils.equals(((CharSequence) (f)), ((CharSequence) (((Credential) (obj)).f)));
	//   13   21:aload_0         
	//   14   22:getfield        #121 <Field String a>
	//   15   25:aload_1         
	//   16   26:getfield        #121 <Field String a>
	//   17   29:invokestatic    #136 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   18   32:ifeq            93
	//   19   35:aload_0         
	//   20   36:getfield        #105 <Field String b>
	//   21   39:aload_1         
	//   22   40:getfield        #105 <Field String b>
	//   23   43:invokestatic    #136 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   24   46:ifeq            93
	//   25   49:aload_0         
	//   26   50:getfield        #107 <Field Uri c>
	//   27   53:aload_1         
	//   28   54:getfield        #107 <Field Uri c>
	//   29   57:invokestatic    #141 <Method boolean ak.a(Object, Object)>
	//   30   60:ifeq            93
	//   31   63:aload_0         
	//   32   64:getfield        #123 <Field String e>
	//   33   67:aload_1         
	//   34   68:getfield        #123 <Field String e>
	//   35   71:invokestatic    #136 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   36   74:ifeq            93
	//   37   77:aload_0         
	//   38   78:getfield        #125 <Field String f>
	//   39   81:aload_1         
	//   40   82:getfield        #125 <Field String f>
	//   41   85:invokestatic    #136 <Method boolean TextUtils.equals(CharSequence, CharSequence)>
	//   42   88:ifeq            93
	//   43   91:iconst_1        
	//   44   92:ireturn         
	//   45   93:iconst_0        
	//   46   94:ireturn         
	}

	public String f()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #125 <Field String f>
	//    2    4:areturn         
	}

	public String g()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #127 <Field String g>
	//    2    4:areturn         
	}

	public String h()
	{
		return h;
	//    0    0:aload_0         
	//    1    1:getfield        #129 <Field String h>
	//    2    4:areturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			a, b, c, e, f
		});
	//    0    0:iconst_5        
	//    1    1:anewarray       Object[]
	//    2    4:dup             
	//    3    5:iconst_0        
	//    4    6:aload_0         
	//    5    7:getfield        #121 <Field String a>
	//    6   10:aastore         
	//    7   11:dup             
	//    8   12:iconst_1        
	//    9   13:aload_0         
	//   10   14:getfield        #105 <Field String b>
	//   11   17:aastore         
	//   12   18:dup             
	//   13   19:iconst_2        
	//   14   20:aload_0         
	//   15   21:getfield        #107 <Field Uri c>
	//   16   24:aastore         
	//   17   25:dup             
	//   18   26:iconst_3        
	//   19   27:aload_0         
	//   20   28:getfield        #123 <Field String e>
	//   21   31:aastore         
	//   22   32:dup             
	//   23   33:iconst_4        
	//   24   34:aload_0         
	//   25   35:getfield        #125 <Field String f>
	//   26   38:aastore         
	//   27   39:invokestatic    #148 <Method int ak.a(Object[])>
	//   28   42:ireturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #155 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 1, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_1        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #157 <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #160 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, b(), false);
	//    9   15:aload_1         
	//   10   16:iconst_2        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #162 <Method String b()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #160 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, ((android.os.Parcelable) (c())), i, false);
	//   15   25:aload_1         
	//   16   26:iconst_3        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #164 <Method Uri c()>
	//   19   31:iload_2         
	//   20   32:iconst_0        
	//   21   33:invokestatic    #167 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, d(), false);
	//   22   36:aload_1         
	//   23   37:iconst_4        
	//   24   38:aload_0         
	//   25   39:invokevirtual   #169 <Method List d()>
	//   26   42:iconst_0        
	//   27   43:invokestatic    #172 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e(), false);
	//   28   46:aload_1         
	//   29   47:iconst_5        
	//   30   48:aload_0         
	//   31   49:invokevirtual   #174 <Method String e()>
	//   32   52:iconst_0        
	//   33   53:invokestatic    #160 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f(), false);
	//   34   56:aload_1         
	//   35   57:bipush          6
	//   36   59:aload_0         
	//   37   60:invokevirtual   #176 <Method String f()>
	//   38   63:iconst_0        
	//   39   64:invokestatic    #160 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, g(), false);
	//   40   67:aload_1         
	//   41   68:bipush          9
	//   42   70:aload_0         
	//   43   71:invokevirtual   #178 <Method String g()>
	//   44   74:iconst_0        
	//   45   75:invokestatic    #160 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, h(), false);
	//   46   78:aload_1         
	//   47   79:bipush          10
	//   48   81:aload_0         
	//   49   82:invokevirtual   #180 <Method String h()>
	//   50   85:iconst_0        
	//   51   86:invokestatic    #160 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   52   89:aload_1         
	//   53   90:iload_3         
	//   54   91:invokestatic    #182 <Method void c.a(Parcel, int)>
	//   55   94:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new com.google.android.gms.auth.api.credentials.c();
	private final String a;
	private final String b;
	private final Uri c;
	private final List d;
	private final String e;
	private final String f;
	private final String g;
	private final String h;

	static 
	{
	//    0    0:new             #24  <Class com.google.android.gms.auth.api.credentials.c>
	//    1    3:dup             
	//    2    4:invokespecial   #27  <Method void com.google.android.gms.auth.api.credentials.c()>
	//    3    7:putstatic       #29  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
