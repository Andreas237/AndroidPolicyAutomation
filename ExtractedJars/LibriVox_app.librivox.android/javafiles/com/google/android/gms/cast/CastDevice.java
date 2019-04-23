// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.os.Bundle;
import android.os.Parcel;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.aj;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

// Referenced classes of package com.google.android.gms.cast:
//			at

public class CastDevice extends AbstractSafeParcelable
	implements ReflectedParcelable
{

	CastDevice(String s, String s1, String s2, String s3, String s4, int i1, List list, 
			int j1, int k1, String s5, String s6, int l1, String s7, byte abyte0[], 
			String s8)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #43  <Method void AbstractSafeParcelable()>
		a = a(s);
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:invokestatic    #46  <Method String a(String)>
	//    5    9:putfield        #48  <Field String a>
		b = a(s1);
	//    6   12:aload_0         
	//    7   13:aload_2         
	//    8   14:invokestatic    #46  <Method String a(String)>
	//    9   17:putfield        #50  <Field String b>
		if(!TextUtils.isEmpty(((CharSequence) (b))))
	//*  10   20:aload_0         
	//*  11   21:getfield        #50  <Field String b>
	//*  12   24:invokestatic    #56  <Method boolean TextUtils.isEmpty(CharSequence)>
	//*  13   27:ifne            123
			try
			{
				c = InetAddress.getByName(b);
	//   14   30:aload_0         
	//   15   31:aload_0         
	//   16   32:getfield        #50  <Field String b>
	//   17   35:invokestatic    #62  <Method InetAddress InetAddress.getByName(String)>
	//   18   38:putfield        #64  <Field InetAddress c>
			}
	//*  19   41:goto            123
			// Misplaced declaration of an exception variable
			catch(String s1)
	//*  20   44:astore_2        
			{
				s = b;
	//   21   45:aload_0         
	//   22   46:getfield        #50  <Field String b>
	//   23   49:astore_1        
				s1 = ((UnknownHostException) (s1)).getMessage();
	//   24   50:aload_2         
	//   25   51:invokevirtual   #68  <Method String UnknownHostException.getMessage()>
	//   26   54:astore_2        
				StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 48 + String.valueOf(((Object) (s1))).length());
	//   27   55:new             #70  <Class StringBuilder>
	//   28   58:dup             
	//   29   59:aload_1         
	//   30   60:invokestatic    #76  <Method String String.valueOf(Object)>
	//   31   63:invokevirtual   #80  <Method int String.length()>
	//   32   66:bipush          48
	//   33   68:iadd            
	//   34   69:aload_2         
	//   35   70:invokestatic    #76  <Method String String.valueOf(Object)>
	//   36   73:invokevirtual   #80  <Method int String.length()>
	//   37   76:iadd            
	//   38   77:invokespecial   #83  <Method void StringBuilder(int)>
	//   39   80:astore          16
				stringbuilder.append("Unable to convert host address (");
	//   40   82:aload           16
	//   41   84:ldc1            #85  <String "Unable to convert host address (">
	//   42   86:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   43   89:pop             
				stringbuilder.append(s);
	//   44   90:aload           16
	//   45   92:aload_1         
	//   46   93:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   47   96:pop             
				stringbuilder.append(") to ipaddress: ");
	//   48   97:aload           16
	//   49   99:ldc1            #91  <String ") to ipaddress: ">
	//   50  101:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   51  104:pop             
				stringbuilder.append(s1);
	//   52  105:aload           16
	//   53  107:aload_2         
	//   54  108:invokevirtual   #89  <Method StringBuilder StringBuilder.append(String)>
	//   55  111:pop             
				Log.i("CastDevice", stringbuilder.toString());
	//   56  112:ldc1            #93  <String "CastDevice">
	//   57  114:aload           16
	//   58  116:invokevirtual   #96  <Method String StringBuilder.toString()>
	//   59  119:invokestatic    #101 <Method int Log.i(String, String)>
	//   60  122:pop             
			}
		d = a(s2);
	//   61  123:aload_0         
	//   62  124:aload_3         
	//   63  125:invokestatic    #46  <Method String a(String)>
	//   64  128:putfield        #103 <Field String d>
		e = a(s3);
	//   65  131:aload_0         
	//   66  132:aload           4
	//   67  134:invokestatic    #46  <Method String a(String)>
	//   68  137:putfield        #105 <Field String e>
		f = a(s4);
	//   69  140:aload_0         
	//   70  141:aload           5
	//   71  143:invokestatic    #46  <Method String a(String)>
	//   72  146:putfield        #107 <Field String f>
		g = i1;
	//   73  149:aload_0         
	//   74  150:iload           6
	//   75  152:putfield        #109 <Field int g>
		if(list == null)
	//*  76  155:aload           7
	//*  77  157:ifnull          163
	//*  78  160:goto            172
			list = ((List) (new ArrayList()));
	//   79  163:new             #111 <Class ArrayList>
	//   80  166:dup             
	//   81  167:invokespecial   #112 <Method void ArrayList()>
	//   82  170:astore          7
		h = list;
	//   83  172:aload_0         
	//   84  173:aload           7
	//   85  175:putfield        #114 <Field List h>
		i = j1;
	//   86  178:aload_0         
	//   87  179:iload           8
	//   88  181:putfield        #116 <Field int i>
		j = k1;
	//   89  184:aload_0         
	//   90  185:iload           9
	//   91  187:putfield        #118 <Field int j>
		k = a(s5);
	//   92  190:aload_0         
	//   93  191:aload           10
	//   94  193:invokestatic    #46  <Method String a(String)>
	//   95  196:putfield        #120 <Field String k>
		l = s6;
	//   96  199:aload_0         
	//   97  200:aload           11
	//   98  202:putfield        #122 <Field String l>
		m = l1;
	//   99  205:aload_0         
	//  100  206:iload           12
	//  101  208:putfield        #124 <Field int m>
		n = s7;
	//  102  211:aload_0         
	//  103  212:aload           13
	//  104  214:putfield        #126 <Field String n>
		o = abyte0;
	//  105  217:aload_0         
	//  106  218:aload           14
	//  107  220:putfield        #128 <Field byte[] o>
		p = s8;
	//  108  223:aload_0         
	//  109  224:aload           15
	//  110  226:putfield        #130 <Field String p>
	//  111  229:return          
	}

	private static String a(String s)
	{
		String s1 = s;
	//    0    0:aload_0         
	//    1    1:astore_1        
		if(s == null)
	//*   2    2:aload_0         
	//*   3    3:ifnonnull       9
			s1 = "";
	//    4    6:ldc1            #132 <String "">
	//    5    8:astore_1        
		return s1;
	//    6    9:aload_1         
	//    7   10:areturn         
	}

	public static CastDevice b(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       6
		{
			return null;
	//    2    4:aconst_null     
	//    3    5:areturn         
		} else
		{
			bundle.setClassLoader(((Class) (com/google/android/gms/cast/CastDevice)).getClassLoader());
	//    4    6:aload_0         
	//    5    7:ldc1            #2   <Class CastDevice>
	//    6    9:invokevirtual   #139 <Method ClassLoader Class.getClassLoader()>
	//    7   12:invokevirtual   #145 <Method void Bundle.setClassLoader(ClassLoader)>
			return (CastDevice)bundle.getParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE");
	//    8   15:aload_0         
	//    9   16:ldc1            #147 <String "com.google.android.gms.cast.EXTRA_CAST_DEVICE">
	//   10   18:invokevirtual   #151 <Method android.os.Parcelable Bundle.getParcelable(String)>
	//   11   21:checkcast       #2   <Class CastDevice>
	//   12   24:areturn         
		}
	}

	public String a()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field String d>
	//    2    4:areturn         
	}

	public void a(Bundle bundle)
	{
		if(bundle == null)
	//*   0    0:aload_1         
	//*   1    1:ifnonnull       5
		{
			return;
	//    2    4:return          
		} else
		{
			bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", ((android.os.Parcelable) (this)));
	//    3    5:aload_1         
	//    4    6:ldc1            #147 <String "com.google.android.gms.cast.EXTRA_CAST_DEVICE">
	//    5    8:aload_0         
	//    6    9:invokevirtual   #156 <Method void Bundle.putParcelable(String, android.os.Parcelable)>
			return;
	//    7   12:return          
		}
	}

	public String b()
	{
		return e;
	//    0    0:aload_0         
	//    1    1:getfield        #105 <Field String e>
	//    2    4:areturn         
	}

	public String c()
	{
		return f;
	//    0    0:aload_0         
	//    1    1:getfield        #107 <Field String f>
	//    2    4:areturn         
	}

	public int d()
	{
		return g;
	//    0    0:aload_0         
	//    1    1:getfield        #109 <Field int g>
	//    2    4:ireturn         
	}

	public List e()
	{
		return Collections.unmodifiableList(h);
	//    0    0:aload_0         
	//    1    1:getfield        #114 <Field List h>
	//    2    4:invokestatic    #163 <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public boolean equals(Object obj)
	{
		if(obj == this)
	//*   0    0:aload_1         
	//*   1    1:aload_0         
	//*   2    2:if_acmpne       7
			return true;
	//    3    5:iconst_1        
	//    4    6:ireturn         
		if(!(obj instanceof CastDevice))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class CastDevice>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((CastDevice)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class CastDevice>
	//   12   20:astore_1        
		String s = a;
	//   13   21:aload_0         
	//   14   22:getfield        #48  <Field String a>
	//   15   25:astore_2        
		if(s == null)
	//*  16   26:aload_2         
	//*  17   27:ifnonnull       41
			return ((CastDevice) (obj)).a == null;
	//   18   30:aload_1         
	//   19   31:getfield        #48  <Field String a>
	//   20   34:ifnonnull       39
	//   21   37:iconst_1        
	//   22   38:ireturn         
	//   23   39:iconst_0        
	//   24   40:ireturn         
		return aj.a(((Object) (s)), ((Object) (((CastDevice) (obj)).a))) && aj.a(((Object) (c)), ((Object) (((CastDevice) (obj)).c))) && aj.a(((Object) (e)), ((Object) (((CastDevice) (obj)).e))) && aj.a(((Object) (d)), ((Object) (((CastDevice) (obj)).d))) && aj.a(((Object) (f)), ((Object) (((CastDevice) (obj)).f))) && g == ((CastDevice) (obj)).g && aj.a(((Object) (h)), ((Object) (((CastDevice) (obj)).h))) && i == ((CastDevice) (obj)).i && j == ((CastDevice) (obj)).j && aj.a(((Object) (k)), ((Object) (((CastDevice) (obj)).k))) && aj.a(((Object) (Integer.valueOf(m))), ((Object) (Integer.valueOf(((CastDevice) (obj)).m)))) && aj.a(((Object) (n)), ((Object) (((CastDevice) (obj)).n))) && aj.a(((Object) (l)), ((Object) (((CastDevice) (obj)).l))) && aj.a(((Object) (f)), ((Object) (((CastDevice) (obj)).c()))) && g == ((CastDevice) (obj)).d() && (o == null && ((CastDevice) (obj)).o == null || Arrays.equals(o, ((CastDevice) (obj)).o)) && aj.a(((Object) (p)), ((Object) (((CastDevice) (obj)).p)));
	//   25   41:aload_2         
	//   26   42:aload_1         
	//   27   43:getfield        #48  <Field String a>
	//   28   46:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   29   49:ifeq            286
	//   30   52:aload_0         
	//   31   53:getfield        #64  <Field InetAddress c>
	//   32   56:aload_1         
	//   33   57:getfield        #64  <Field InetAddress c>
	//   34   60:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   35   63:ifeq            286
	//   36   66:aload_0         
	//   37   67:getfield        #105 <Field String e>
	//   38   70:aload_1         
	//   39   71:getfield        #105 <Field String e>
	//   40   74:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   41   77:ifeq            286
	//   42   80:aload_0         
	//   43   81:getfield        #103 <Field String d>
	//   44   84:aload_1         
	//   45   85:getfield        #103 <Field String d>
	//   46   88:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   47   91:ifeq            286
	//   48   94:aload_0         
	//   49   95:getfield        #107 <Field String f>
	//   50   98:aload_1         
	//   51   99:getfield        #107 <Field String f>
	//   52  102:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   53  105:ifeq            286
	//   54  108:aload_0         
	//   55  109:getfield        #109 <Field int g>
	//   56  112:aload_1         
	//   57  113:getfield        #109 <Field int g>
	//   58  116:icmpne          286
	//   59  119:aload_0         
	//   60  120:getfield        #114 <Field List h>
	//   61  123:aload_1         
	//   62  124:getfield        #114 <Field List h>
	//   63  127:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   64  130:ifeq            286
	//   65  133:aload_0         
	//   66  134:getfield        #116 <Field int i>
	//   67  137:aload_1         
	//   68  138:getfield        #116 <Field int i>
	//   69  141:icmpne          286
	//   70  144:aload_0         
	//   71  145:getfield        #118 <Field int j>
	//   72  148:aload_1         
	//   73  149:getfield        #118 <Field int j>
	//   74  152:icmpne          286
	//   75  155:aload_0         
	//   76  156:getfield        #120 <Field String k>
	//   77  159:aload_1         
	//   78  160:getfield        #120 <Field String k>
	//   79  163:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   80  166:ifeq            286
	//   81  169:aload_0         
	//   82  170:getfield        #124 <Field int m>
	//   83  173:invokestatic    #175 <Method Integer Integer.valueOf(int)>
	//   84  176:aload_1         
	//   85  177:getfield        #124 <Field int m>
	//   86  180:invokestatic    #175 <Method Integer Integer.valueOf(int)>
	//   87  183:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   88  186:ifeq            286
	//   89  189:aload_0         
	//   90  190:getfield        #126 <Field String n>
	//   91  193:aload_1         
	//   92  194:getfield        #126 <Field String n>
	//   93  197:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//   94  200:ifeq            286
	//   95  203:aload_0         
	//   96  204:getfield        #122 <Field String l>
	//   97  207:aload_1         
	//   98  208:getfield        #122 <Field String l>
	//   99  211:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//  100  214:ifeq            286
	//  101  217:aload_0         
	//  102  218:getfield        #107 <Field String f>
	//  103  221:aload_1         
	//  104  222:invokevirtual   #177 <Method String c()>
	//  105  225:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//  106  228:ifeq            286
	//  107  231:aload_0         
	//  108  232:getfield        #109 <Field int g>
	//  109  235:aload_1         
	//  110  236:invokevirtual   #179 <Method int d()>
	//  111  239:icmpne          286
	//  112  242:aload_0         
	//  113  243:getfield        #128 <Field byte[] o>
	//  114  246:ifnonnull       256
	//  115  249:aload_1         
	//  116  250:getfield        #128 <Field byte[] o>
	//  117  253:ifnull          270
	//  118  256:aload_0         
	//  119  257:getfield        #128 <Field byte[] o>
	//  120  260:aload_1         
	//  121  261:getfield        #128 <Field byte[] o>
	//  122  264:invokestatic    #184 <Method boolean Arrays.equals(byte[], byte[])>
	//  123  267:ifeq            286
	//  124  270:aload_0         
	//  125  271:getfield        #130 <Field String p>
	//  126  274:aload_1         
	//  127  275:getfield        #130 <Field String p>
	//  128  278:invokestatic    #170 <Method boolean aj.a(Object, Object)>
	//  129  281:ifeq            286
	//  130  284:iconst_1        
	//  131  285:ireturn         
	//  132  286:iconst_0        
	//  133  287:ireturn         
	}

	public int hashCode()
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #48  <Field String a>
	//    2    4:astore_1        
		if(s == null)
	//*   3    5:aload_1         
	//*   4    6:ifnonnull       11
			return 0;
	//    5    9:iconst_0        
	//    6   10:ireturn         
		else
			return s.hashCode();
	//    7   11:aload_1         
	//    8   12:invokevirtual   #187 <Method int String.hashCode()>
	//    9   15:ireturn         
	}

	public String toString()
	{
		return String.format("\"%s\" (%s)", new Object[] {
			d, a
		});
	//    0    0:ldc1            #189 <String "\"%s\" (%s)">
	//    1    2:iconst_2        
	//    2    3:anewarray       Object[]
	//    3    6:dup             
	//    4    7:iconst_0        
	//    5    8:aload_0         
	//    6    9:getfield        #103 <Field String d>
	//    7   12:aastore         
	//    8   13:dup             
	//    9   14:iconst_1        
	//   10   15:aload_0         
	//   11   16:getfield        #48  <Field String a>
	//   12   19:aastore         
	//   13   20:invokestatic    #195 <Method String String.format(String, Object[])>
	//   14   23:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #202 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #48  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #50  <Field String b>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, a(), false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #207 <Method String a()>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, b(), false);
	//   21   35:aload_1         
	//   22   36:iconst_5        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #209 <Method String b()>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, c(), false);
	//   27   45:aload_1         
	//   28   46:bipush          6
	//   29   48:aload_0         
	//   30   49:invokevirtual   #177 <Method String c()>
	//   31   52:iconst_0        
	//   32   53:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, d());
	//   33   56:aload_1         
	//   34   57:bipush          7
	//   35   59:aload_0         
	//   36   60:invokevirtual   #179 <Method int d()>
	//   37   63:invokestatic    #212 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 8, e(), false);
	//   38   66:aload_1         
	//   39   67:bipush          8
	//   40   69:aload_0         
	//   41   70:invokevirtual   #214 <Method List e()>
	//   42   73:iconst_0        
	//   43   74:invokestatic    #217 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, i);
	//   44   77:aload_1         
	//   45   78:bipush          9
	//   46   80:aload_0         
	//   47   81:getfield        #116 <Field int i>
	//   48   84:invokestatic    #212 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 10, j);
	//   49   87:aload_1         
	//   50   88:bipush          10
	//   51   90:aload_0         
	//   52   91:getfield        #118 <Field int j>
	//   53   94:invokestatic    #212 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 11, k, false);
	//   54   97:aload_1         
	//   55   98:bipush          11
	//   56  100:aload_0         
	//   57  101:getfield        #120 <Field String k>
	//   58  104:iconst_0        
	//   59  105:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 12, l, false);
	//   60  108:aload_1         
	//   61  109:bipush          12
	//   62  111:aload_0         
	//   63  112:getfield        #122 <Field String l>
	//   64  115:iconst_0        
	//   65  116:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 13, m);
	//   66  119:aload_1         
	//   67  120:bipush          13
	//   68  122:aload_0         
	//   69  123:getfield        #124 <Field int m>
	//   70  126:invokestatic    #212 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 14, n, false);
	//   71  129:aload_1         
	//   72  130:bipush          14
	//   73  132:aload_0         
	//   74  133:getfield        #126 <Field String n>
	//   75  136:iconst_0        
	//   76  137:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 15, o, false);
	//   77  140:aload_1         
	//   78  141:bipush          15
	//   79  143:aload_0         
	//   80  144:getfield        #128 <Field byte[] o>
	//   81  147:iconst_0        
	//   82  148:invokestatic    #220 <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 16, p, false);
	//   83  151:aload_1         
	//   84  152:bipush          16
	//   85  154:aload_0         
	//   86  155:getfield        #130 <Field String p>
	//   87  158:iconst_0        
	//   88  159:invokestatic    #205 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   89  162:aload_1         
	//   90  163:iload_2         
	//   91  164:invokestatic    #222 <Method void c.a(Parcel, int)>
	//   92  167:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new at();
	private String a;
	private String b;
	private InetAddress c;
	private String d;
	private String e;
	private String f;
	private int g;
	private List h;
	private int i;
	private int j;
	private String k;
	private String l;
	private int m;
	private String n;
	private byte o[];
	private String p;

	static 
	{
	//    0    0:new             #33  <Class at>
	//    1    3:dup             
	//    2    4:invokespecial   #36  <Method void at()>
	//    3    7:putstatic       #38  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
