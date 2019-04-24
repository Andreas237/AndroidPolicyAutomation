// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.ads.internal.zzbv;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			zzhm, zzakb, zzakq

public final class zzhl extends AbstractSafeParcelable
{

	zzhl(String s, long l, String s1, String s2, String s3, Bundle bundle, 
			boolean flag, long l1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #51  <Method void AbstractSafeParcelable()>
		url = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #53  <Field String url>
		zzajv = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #55  <Field long zzajv>
		if(s1 == null)
	//*   8   14:aload           4
	//*   9   16:ifnull          22
	//*  10   19:goto            26
			s1 = "";
	//   11   22:ldc1            #57  <String "">
	//   12   24:astore          4
		zzajw = s1;
	//   13   26:aload_0         
	//   14   27:aload           4
	//   15   29:putfield        #59  <Field String zzajw>
		if(s2 == null)
	//*  16   32:aload           5
	//*  17   34:ifnull          40
	//*  18   37:goto            44
			s2 = "";
	//   19   40:ldc1            #57  <String "">
	//   20   42:astore          5
		zzajx = s2;
	//   21   44:aload_0         
	//   22   45:aload           5
	//   23   47:putfield        #61  <Field String zzajx>
		if(s3 == null)
	//*  24   50:aload           6
	//*  25   52:ifnull          58
	//*  26   55:goto            62
			s3 = "";
	//   27   58:ldc1            #57  <String "">
	//   28   60:astore          6
		zzajy = s3;
	//   29   62:aload_0         
	//   30   63:aload           6
	//   31   65:putfield        #63  <Field String zzajy>
		if(bundle == null)
	//*  32   68:aload           7
	//*  33   70:ifnull          76
	//*  34   73:goto            85
			bundle = new Bundle();
	//   35   76:new             #65  <Class Bundle>
	//   36   79:dup             
	//   37   80:invokespecial   #66  <Method void Bundle()>
	//   38   83:astore          7
		zzajz = bundle;
	//   39   85:aload_0         
	//   40   86:aload           7
	//   41   88:putfield        #68  <Field Bundle zzajz>
		zzaka = flag;
	//   42   91:aload_0         
	//   43   92:iload           8
	//   44   94:putfield        #70  <Field boolean zzaka>
		zzakb = l1;
	//   45   97:aload_0         
	//   46   98:lload           9
	//   47  100:putfield        #72  <Field long zzakb>
	//   48  103:return          
	}

	public static zzhl zzaa(String s)
	{
		return zzd(Uri.parse(s));
	//    0    0:aload_0         
	//    1    1:invokestatic    #82  <Method Uri Uri.parse(String)>
	//    2    4:invokestatic    #86  <Method zzhl zzd(Uri)>
	//    3    7:areturn         
	}

	public static zzhl zzd(Uri uri)
	{
		if(!"gcache".equals(((Object) (uri.getScheme()))))
	//*   0    0:ldc1            #92  <String "gcache">
	//*   1    2:aload_0         
	//*   2    3:invokevirtual   #96  <Method String Uri.getScheme()>
	//*   3    6:invokevirtual   #102 <Method boolean String.equals(Object)>
	//*   4    9:ifne            14
			return null;
	//    5   12:aconst_null     
	//    6   13:areturn         
		Object obj;
		obj = ((Object) (uri.getPathSegments()));
	//    7   14:aload_0         
	//    8   15:invokevirtual   #106 <Method List Uri.getPathSegments()>
	//    9   18:astore          6
		if(((List) (obj)).size() == 2)
			break MISSING_BLOCK_LABEL_71;
	//   10   20:aload           6
	//   11   22:invokeinterface #112 <Method int List.size()>
	//   12   27:iconst_2        
	//   13   28:icmpeq          71
		int i = ((List) (obj)).size();
	//   14   31:aload           6
	//   15   33:invokeinterface #112 <Method int List.size()>
	//   16   38:istore_1        
		uri = ((Uri) (new StringBuilder(62)));
	//   17   39:new             #114 <Class StringBuilder>
	//   18   42:dup             
	//   19   43:bipush          62
	//   20   45:invokespecial   #117 <Method void StringBuilder(int)>
	//   21   48:astore_0        
		((StringBuilder) (uri)).append("Expected 2 path parts for namespace and id, found :");
	//   22   49:aload_0         
	//   23   50:ldc1            #119 <String "Expected 2 path parts for namespace and id, found :">
	//   24   52:invokevirtual   #123 <Method StringBuilder StringBuilder.append(String)>
	//   25   55:pop             
		((StringBuilder) (uri)).append(i);
	//   26   56:aload_0         
	//   27   57:iload_1         
	//   28   58:invokevirtual   #126 <Method StringBuilder StringBuilder.append(int)>
	//   29   61:pop             
		com.google.android.gms.internal.ads.zzakb.zzdk(((StringBuilder) (uri)).toString());
	//   30   62:aload_0         
	//   31   63:invokevirtual   #129 <Method String StringBuilder.toString()>
	//   32   66:invokestatic    #135 <Method void zzakb.zzdk(String)>
		return null;
	//   33   69:aconst_null     
	//   34   70:areturn         
		boolean flag;
		long l;
		String s;
		String s1;
		String s2;
		Object obj1;
		Iterator iterator;
		String s3;
		try
		{
			s = (String)((List) (obj)).get(0);
	//   35   71:aload           6
	//   36   73:iconst_0        
	//   37   74:invokeinterface #139 <Method Object List.get(int)>
	//   38   79:checkcast       #98  <Class String>
	//   39   82:astore          5
			obj = ((Object) ((String)((List) (obj)).get(1)));
	//   40   84:aload           6
	//   41   86:iconst_1        
	//   42   87:invokeinterface #139 <Method Object List.get(int)>
	//   43   92:checkcast       #98  <Class String>
	//   44   95:astore          6
			s1 = uri.getHost();
	//   45   97:aload_0         
	//   46   98:invokevirtual   #142 <Method String Uri.getHost()>
	//   47  101:astore          7
			s2 = uri.getQueryParameter("url");
	//   48  103:aload_0         
	//   49  104:ldc1            #143 <String "url">
	//   50  106:invokevirtual   #147 <Method String Uri.getQueryParameter(String)>
	//   51  109:astore          8
			flag = "1".equals(((Object) (uri.getQueryParameter("read_only"))));
	//   52  111:ldc1            #149 <String "1">
	//   53  113:aload_0         
	//   54  114:ldc1            #151 <String "read_only">
	//   55  116:invokevirtual   #147 <Method String Uri.getQueryParameter(String)>
	//   56  119:invokevirtual   #102 <Method boolean String.equals(Object)>
	//   57  122:istore_2        
			obj1 = ((Object) (uri.getQueryParameter("expiration")));
	//   58  123:aload_0         
	//   59  124:ldc1            #153 <String "expiration">
	//   60  126:invokevirtual   #147 <Method String Uri.getQueryParameter(String)>
	//   61  129:astore          9
		}
	//*  62  131:aload           9
	//*  63  133:ifnonnull       141
	//*  64  136:lconst_0        
	//*  65  137:lstore_3        
	//*  66  138:goto            257
	//*  67  141:aload           9
	//*  68  143:invokestatic    #159 <Method long Long.parseLong(String)>
	//*  69  146:lstore_3        
	//*  70  147:goto            257
	//*  71  150:new             #65  <Class Bundle>
	//*  72  153:dup             
	//*  73  154:invokespecial   #66  <Method void Bundle()>
	//*  74  157:astore          9
	//*  75  159:invokestatic    #165 <Method zzakq zzbv.zzem()>
	//*  76  162:aload_0         
	//*  77  163:invokevirtual   #171 <Method Set zzakq.zzh(Uri)>
	//*  78  166:invokeinterface #177 <Method Iterator Set.iterator()>
	//*  79  171:astore          10
	//*  80  173:aload           10
	//*  81  175:invokeinterface #183 <Method boolean Iterator.hasNext()>
	//*  82  180:ifeq            225
	//*  83  183:aload           10
	//*  84  185:invokeinterface #187 <Method Object Iterator.next()>
	//*  85  190:checkcast       #98  <Class String>
	//*  86  193:astore          11
	//*  87  195:aload           11
	//*  88  197:ldc1            #189 <String "tag.">
	//*  89  199:invokevirtual   #193 <Method boolean String.startsWith(String)>
	//*  90  202:ifeq            173
	//*  91  205:aload           9
	//*  92  207:aload           11
	//*  93  209:iconst_4        
	//*  94  210:invokevirtual   #197 <Method String String.substring(int)>
	//*  95  213:aload_0         
	//*  96  214:aload           11
	//*  97  216:invokevirtual   #147 <Method String Uri.getQueryParameter(String)>
	//*  98  219:invokevirtual   #201 <Method void Bundle.putString(String, String)>
	//*  99  222:goto            173
	//* 100  225:new             #2   <Class zzhl>
	//* 101  228:dup             
	//* 102  229:aload           8
	//* 103  231:lload_3         
	//* 104  232:aload           7
	//* 105  234:aload           5
	//* 106  236:aload           6
	//* 107  238:aload           9
	//* 108  240:iload_2         
	//* 109  241:lconst_0        
	//* 110  242:invokespecial   #203 <Method void zzhl(String, long, String, String, String, Bundle, boolean, long)>
	//* 111  245:astore_0        
	//* 112  246:aload_0         
	//* 113  247:areturn         
		// Misplaced declaration of an exception variable
		catch(Uri uri)
	//* 114  248:astore_0        
		{
			com.google.android.gms.internal.ads.zzakb.zzc("Unable to parse Uri into cache offering.", ((Throwable) (uri)));
	//  115  249:ldc1            #205 <String "Unable to parse Uri into cache offering.">
	//  116  251:aload_0         
	//  117  252:invokestatic    #209 <Method void zzakb.zzc(String, Throwable)>
			return null;
	//  118  255:aconst_null     
	//  119  256:areturn         
		}
		if(obj1 == null)
		{
			l = 0L;
			break MISSING_BLOCK_LABEL_150;
		}
		l = Long.parseLong(((String) (obj1)));
		obj1 = ((Object) (new Bundle()));
		iterator = zzbv.zzem().zzh(uri).iterator();
		do
		{
			if(!iterator.hasNext())
				break;
			s3 = (String)iterator.next();
			if(s3.startsWith("tag."))
				((Bundle) (obj1)).putString(s3.substring(4), uri.getQueryParameter(s3));
		} while(true);
		uri = ((Uri) (new zzhl(s2, l, s1, s, ((String) (obj)), ((Bundle) (obj1)), flag, 0L)));
		return ((zzhl) (uri));
	//* 120  257:goto            150
	}

	public final void writeToParcel(Parcel parcel, int i)
	{
		i = SafeParcelWriter.beginObjectHeader(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #217 <Method int SafeParcelWriter.beginObjectHeader(Parcel)>
	//    2    4:istore_2        
		SafeParcelWriter.writeString(parcel, 2, url, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #53  <Field String url>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #221 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeLong(parcel, 3, zzajv);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #55  <Field long zzajv>
	//   13   21:invokestatic    #225 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.writeString(parcel, 4, zzajw, false);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #59  <Field String zzajw>
	//   18   30:iconst_0        
	//   19   31:invokestatic    #221 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 5, zzajx, false);
	//   20   34:aload_1         
	//   21   35:iconst_5        
	//   22   36:aload_0         
	//   23   37:getfield        #61  <Field String zzajx>
	//   24   40:iconst_0        
	//   25   41:invokestatic    #221 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeString(parcel, 6, zzajy, false);
	//   26   44:aload_1         
	//   27   45:bipush          6
	//   28   47:aload_0         
	//   29   48:getfield        #63  <Field String zzajy>
	//   30   51:iconst_0        
	//   31   52:invokestatic    #221 <Method void SafeParcelWriter.writeString(Parcel, int, String, boolean)>
		SafeParcelWriter.writeBundle(parcel, 7, zzajz, false);
	//   32   55:aload_1         
	//   33   56:bipush          7
	//   34   58:aload_0         
	//   35   59:getfield        #68  <Field Bundle zzajz>
	//   36   62:iconst_0        
	//   37   63:invokestatic    #229 <Method void SafeParcelWriter.writeBundle(Parcel, int, Bundle, boolean)>
		SafeParcelWriter.writeBoolean(parcel, 8, zzaka);
	//   38   66:aload_1         
	//   39   67:bipush          8
	//   40   69:aload_0         
	//   41   70:getfield        #70  <Field boolean zzaka>
	//   42   73:invokestatic    #233 <Method void SafeParcelWriter.writeBoolean(Parcel, int, boolean)>
		SafeParcelWriter.writeLong(parcel, 9, zzakb);
	//   43   76:aload_1         
	//   44   77:bipush          9
	//   45   79:aload_0         
	//   46   80:getfield        #72  <Field long zzakb>
	//   47   83:invokestatic    #225 <Method void SafeParcelWriter.writeLong(Parcel, int, long)>
		SafeParcelWriter.finishObjectHeader(parcel, i);
	//   48   86:aload_1         
	//   49   87:iload_2         
	//   50   88:invokestatic    #236 <Method void SafeParcelWriter.finishObjectHeader(Parcel, int)>
	//   51   91:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new zzhm();
	public final String url;
	private final long zzajv;
	private final String zzajw;
	private final String zzajx;
	private final String zzajy;
	private final Bundle zzajz;
	private final boolean zzaka;
	private long zzakb;

	static 
	{
	//    0    0:new             #41  <Class zzhm>
	//    1    3:dup             
	//    2    4:invokespecial   #44  <Method void zzhm()>
	//    3    7:putstatic       #46  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
