// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.aw;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			brq, wx, xo

public final class zzty extends AbstractSafeParcelable
{

	zzty(String s, long l, String s1, String s2, String s3, Bundle bundle, 
			boolean flag, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #31  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #33  <Field String a>
		d = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #35  <Field long d>
		if(s1 == null)
	//*   8   14:aload           4
	//*   9   16:ifnull          22
	//*  10   19:goto            26
			s1 = "";
	//   11   22:ldc1            #37  <String "">
	//   12   24:astore          4
		e = s1;
	//   13   26:aload_0         
	//   14   27:aload           4
	//   15   29:putfield        #39  <Field String e>
		if(s2 == null)
	//*  16   32:aload           5
	//*  17   34:ifnull          40
	//*  18   37:goto            44
			s2 = "";
	//   19   40:ldc1            #37  <String "">
	//   20   42:astore          5
		f = s2;
	//   21   44:aload_0         
	//   22   45:aload           5
	//   23   47:putfield        #41  <Field String f>
		if(s3 == null)
	//*  24   50:aload           6
	//*  25   52:ifnull          58
	//*  26   55:goto            62
			s3 = "";
	//   27   58:ldc1            #37  <String "">
	//   28   60:astore          6
		g = s3;
	//   29   62:aload_0         
	//   30   63:aload           6
	//   31   65:putfield        #43  <Field String g>
		if(bundle == null)
	//*  32   68:aload           7
	//*  33   70:ifnull          76
	//*  34   73:goto            85
			bundle = new Bundle();
	//   35   76:new             #45  <Class Bundle>
	//   36   79:dup             
	//   37   80:invokespecial   #46  <Method void Bundle()>
	//   38   83:astore          7
		h = bundle;
	//   39   85:aload_0         
	//   40   86:aload           7
	//   41   88:putfield        #48  <Field Bundle h>
		b = flag;
	//   42   91:aload_0         
	//   43   92:iload           8
	//   44   94:putfield        #50  <Field boolean b>
		c = l1;
	//   45   97:aload_0         
	//   46   98:lload           9
	//   47  100:putfield        #52  <Field long c>
	//   48  103:return          
	}

	public static zzty a(Uri uri)
	{
		if(!"gcache".equals(((Object) (uri.getScheme()))))
	//*   0    0:ldc1            #59  <String "gcache">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #65  <Method String Uri.getScheme()>
	//*   3    6:invokevirtual   #71  <Method boolean String.equals(Object)>
	//*   4    9:ifne            14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		Object obj;
		obj = ((Object) (uri.getPathSegments()));
	//    7   14:aload_0         
	//    8   15:invokevirtual   #75  <Method List Uri.getPathSegments()>
	//    9   18:astore          6
		if(((List) (obj)).size() == 2)
			break MISSING_BLOCK_LABEL_71;
	//   10   20:aload           6
	//   11   22:invokeinterface #81  <Method int List.size()>
	//   12   27:iconst_2        
	//   13   28:icmpeq          71
		int i = ((List) (obj)).size();
	//   14   31:aload           6
	//   15   33:invokeinterface #81  <Method int List.size()>
	//   16   38:istore_1        
		uri = ((Uri) (new StringBuilder(62)));
	//   17   39:new             #83  <Class StringBuilder>
	//   18   42:dup             
	//   19   43:bipush          62
	//   20   45:invokespecial   #86  <Method void StringBuilder(int)>
	//   21   48:astore_0        
		((StringBuilder) (uri)).append("Expected 2 path parts for namespace and id, found :");
	//   22   49:aload_0         
	//   23   50:ldc1            #88  <String "Expected 2 path parts for namespace and id, found :">
	//   24   52:invokevirtual   #92  <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
		((StringBuilder) (uri)).append(i);
	//   26   56:aload_0         
	//   27   57:iload_1         
	//   28   58:invokevirtual   #95  <Method StringBuilder StringBuilder.append(int)>
	//   29   61:pop             
		wx.e(((StringBuilder) (uri)).toString());
	//   30   62:aload_0         
	//   31   63:invokevirtual   #98  <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #103 <Method void wx.e(String)>
		return null;
	//   33   69:aconst_null     
	//   34   70:areturn         
		boolean flag;
		String s;
		String s1;
		String s2;
		Object obj1;
		s = (String)((List) (obj)).get(0);
	//   35   71:aload           6
	//   36   73:iconst_0        
	//   37   74:invokeinterface #107 <Method Object List.get(int)>
	//   38   79:checkcast       #67  <Class String>
	//   39   82:astore          5
		obj = ((Object) ((String)((List) (obj)).get(1)));
	//   40   84:aload           6
	//   41   86:iconst_1        
	//   42   87:invokeinterface #107 <Method Object List.get(int)>
	//   43   92:checkcast       #67  <Class String>
	//   44   95:astore          6
		s1 = uri.getHost();
	//   45   97:aload_0         
	//   46   98:invokevirtual   #110 <Method String Uri.getHost()>
	//   47  101:astore          7
		s2 = uri.getQueryParameter("url");
	//   48  103:aload_0         
	//   49  104:ldc1            #112 <String "url">
	//   50  106:invokevirtual   #116 <Method String Uri.getQueryParameter(String)>
	//   51  109:astore          8
		flag = "1".equals(((Object) (uri.getQueryParameter("read_only"))));
	//   52  111:ldc1            #118 <String "1">
	//   53  113:aload_0         
	//   54  114:ldc1            #120 <String "read_only">
	//   55  116:invokevirtual   #116 <Method String Uri.getQueryParameter(String)>
	//   56  119:invokevirtual   #71  <Method boolean String.equals(Object)>
	//   57  122:istore_2        
		obj1 = ((Object) (uri.getQueryParameter("expiration")));
	//   58  123:aload_0         
	//   59  124:ldc1            #122 <String "expiration">
	//   60  126:invokevirtual   #116 <Method String Uri.getQueryParameter(String)>
	//   61  129:astore          9
		long l;
		if(obj1 == null)
	//*  62  131:aload           9
	//*  63  133:ifnonnull       141
		{
			l = 0L;
	//   64  136:lconst_0        
	//   65  137:lstore_3        
			break MISSING_BLOCK_LABEL_147;
	//   66  138:goto            147
		}
		l = Long.parseLong(((String) (obj1)));
	//   67  141:aload           9
	//   68  143:invokestatic    #128 <Method long Long.parseLong(String)>
	//   69  146:lstore_3        
		obj1 = ((Object) (new Bundle()));
	//   70  147:new             #45  <Class Bundle>
	//   71  150:dup             
	//   72  151:invokespecial   #46  <Method void Bundle()>
	//   73  154:astore          9
		Iterator iterator = aw.g().a(uri).iterator();
	//   74  156:invokestatic    #133 <Method xo aw.g()>
	//   75  159:aload_0         
	//   76  160:invokevirtual   #138 <Method Set xo.a(Uri)>
	//   77  163:invokeinterface #144 <Method Iterator Set.iterator()>
	//   78  168:astore          10
		do
		{
			if(!iterator.hasNext())
				break;
	//   79  170:aload           10
	//   80  172:invokeinterface #150 <Method boolean Iterator.hasNext()>
	//   81  177:ifeq            222
			String s3 = (String)iterator.next();
	//   82  180:aload           10
	//   83  182:invokeinterface #154 <Method Object Iterator.next()>
	//   84  187:checkcast       #67  <Class String>
	//   85  190:astore          11
			if(s3.startsWith("tag."))
	//*  86  192:aload           11
	//*  87  194:ldc1            #156 <String "tag.">
	//*  88  196:invokevirtual   #160 <Method boolean String.startsWith(String)>
	//*  89  199:ifeq            170
				((Bundle) (obj1)).putString(s3.substring(4), uri.getQueryParameter(s3));
	//   90  202:aload           9
	//   91  204:aload           11
	//   92  206:iconst_4        
	//   93  207:invokevirtual   #164 <Method String String.substring(int)>
	//   94  210:aload_0         
	//   95  211:aload           11
	//   96  213:invokevirtual   #116 <Method String Uri.getQueryParameter(String)>
	//   97  216:invokevirtual   #168 <Method void Bundle.putString(String, String)>
		} while(true);
	//   98  219:goto            170
		uri = ((Uri) (new zzty(s2, l, s1, s, ((String) (obj)), ((Bundle) (obj1)), flag, 0L)));
	//   99  222:new             #2   <Class zzty>
	//  100  225:dup             
	//  101  226:aload           8
	//  102  228:lload_3         
	//  103  229:aload           7
	//  104  231:aload           5
	//  105  233:aload           6
	//  106  235:aload           9
	//  107  237:iload_2         
	//  108  238:lconst_0        
	//  109  239:invokespecial   #170 <Method void zzty(String, long, String, String, String, Bundle, boolean, long)>
	//  110  242:astore_0        
		return ((zzty) (uri));
	//  111  243:aload_0         
	//  112  244:areturn         
		uri;
	//  113  245:astore_0        
		break MISSING_BLOCK_LABEL_250;
	//  114  246:goto            250
		uri;
	//  115  249:astore_0        
		com.google.android.gms.internal.ads.wx.c("Unable to parse Uri into cache offering.", ((Throwable) (uri)));
	//  116  250:ldc1            #172 <String "Unable to parse Uri into cache offering.">
	//  117  252:aload_0         
	//  118  253:invokestatic    #175 <Method void com.google.android.gms.internal.ads.wx.c(String, Throwable)>
		return null;
	//  119  256:aconst_null     
	//  120  257:areturn         
	}

	public static zzty a(String s)
	{
		return a(Uri.parse(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #180 <Method Uri Uri.parse(String)>
	//    2    4:invokestatic    #182 <Method zzty a(Uri)>
	//    3    7:areturn         
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #189 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #33  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #192 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #35  <Field long d>
	//   13   21:invokestatic    #195 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e, false);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #39  <Field String e>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #192 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, f, false);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:getfield        #41  <Field String f>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #192 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, g, false);
	//   26   44:aload_1         
	//   27   45:bipush          6
	//   28   47:aload_0         
	//   29   48:getfield        #43  <Field String g>
	//   30   51:iconst_0        
	//   31   52:invokestatic    #192 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, h, false);
	//   32   55:aload_1         
	//   33   56:bipush          7
	//   34   58:aload_0         
	//   35   59:getfield        #48  <Field Bundle h>
	//   36   62:iconst_0        
	//   37   63:invokestatic    #198 <Method void c.a(Parcel, int, Bundle, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, b);
	//   38   66:aload_1         
	//   39   67:bipush          8
	//   40   69:aload_0         
	//   41   70:getfield        #50  <Field boolean b>
	//   42   73:invokestatic    #201 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, c);
	//   43   76:aload_1         
	//   44   77:bipush          9
	//   45   79:aload_0         
	//   46   80:getfield        #52  <Field long c>
	//   47   83:invokestatic    #195 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i);
	//   48   86:aload_1         
	//   49   87:iload_2         
	//   50   88:invokestatic    #203 <Method void c.a(Parcel, int)>
	//   51   91:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new brq();
	public final String a;
	public final boolean b;
	public long c;
	private final long d;
	private final String e;
	private final String f;
	private final String g;
	private final Bundle h;

	static 
	{
	//    0    0:new             #23  <Class brq>
	//    1    3:dup             
	//    2    4:invokespecial   #26  <Method void brq()>
	//    3    7:putstatic       #28  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
