// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.cast;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.ak;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import com.google.android.gms.internal.cast.aj;
import java.util.*;

// Referenced classes of package com.google.android.gms.cast:
//			am

public class ApplicationMetadata extends AbstractSafeParcelable
{

	private ApplicationMetadata()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AbstractSafeParcelable()>
		c = ((List) (new ArrayList()));
	//    2    4:aload_0         
	//    3    5:new             #29  <Class ArrayList>
	//    4    8:dup             
	//    5    9:invokespecial   #30  <Method void ArrayList()>
	//    6   12:putfield        #32  <Field List c>
	//    7   15:return          
	}

	ApplicationMetadata(String s, String s1, List list, List list1, String s2, Uri uri, String s3)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #27  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #35  <Field String a>
		b = s1;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #37  <Field String b>
		c = list1;
	//    8   14:aload_0         
	//    9   15:aload           4
	//   10   17:putfield        #32  <Field List c>
		d = s2;
	//   11   20:aload_0         
	//   12   21:aload           5
	//   13   23:putfield        #39  <Field String d>
		e = uri;
	//   14   26:aload_0         
	//   15   27:aload           6
	//   16   29:putfield        #41  <Field Uri e>
		f = s3;
	//   17   32:aload_0         
	//   18   33:aload           7
	//   19   35:putfield        #43  <Field String f>
	//   20   38:return          
	}

	public String a()
	{
		return a;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String a>
	//    2    4:areturn         
	}

	public String b()
	{
		return b;
	//    0    0:aload_0         
	//    1    1:getfield        #37  <Field String b>
	//    2    4:areturn         
	}

	public List c()
	{
		return Collections.unmodifiableList(c);
	//    0    0:aload_0         
	//    1    1:getfield        #32  <Field List c>
	//    2    4:invokestatic    #52  <Method List Collections.unmodifiableList(List)>
	//    3    7:areturn         
	}

	public String d()
	{
		return d;
	//    0    0:aload_0         
	//    1    1:getfield        #39  <Field String d>
	//    2    4:areturn         
	}

	public List e()
	{
		return null;
	//    0    0:aconst_null     
	//    1    1:areturn         
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
		if(!(obj instanceof ApplicationMetadata))
	//*   5    7:aload_1         
	//*   6    8:instanceof      #2   <Class ApplicationMetadata>
	//*   7   11:ifne            16
			return false;
	//    8   14:iconst_0        
	//    9   15:ireturn         
		obj = ((Object) ((ApplicationMetadata)obj));
	//   10   16:aload_1         
	//   11   17:checkcast       #2   <Class ApplicationMetadata>
	//   12   20:astore_1        
		return aj.a(((Object) (a)), ((Object) (((ApplicationMetadata) (obj)).a))) && aj.a(((Object) (b)), ((Object) (((ApplicationMetadata) (obj)).b))) && aj.a(((Object) (c)), ((Object) (((ApplicationMetadata) (obj)).c))) && aj.a(((Object) (d)), ((Object) (((ApplicationMetadata) (obj)).d))) && aj.a(((Object) (e)), ((Object) (((ApplicationMetadata) (obj)).e))) && aj.a(((Object) (f)), ((Object) (((ApplicationMetadata) (obj)).f)));
	//   13   21:aload_0         
	//   14   22:getfield        #35  <Field String a>
	//   15   25:aload_1         
	//   16   26:getfield        #35  <Field String a>
	//   17   29:invokestatic    #59  <Method boolean aj.a(Object, Object)>
	//   18   32:ifeq            107
	//   19   35:aload_0         
	//   20   36:getfield        #37  <Field String b>
	//   21   39:aload_1         
	//   22   40:getfield        #37  <Field String b>
	//   23   43:invokestatic    #59  <Method boolean aj.a(Object, Object)>
	//   24   46:ifeq            107
	//   25   49:aload_0         
	//   26   50:getfield        #32  <Field List c>
	//   27   53:aload_1         
	//   28   54:getfield        #32  <Field List c>
	//   29   57:invokestatic    #59  <Method boolean aj.a(Object, Object)>
	//   30   60:ifeq            107
	//   31   63:aload_0         
	//   32   64:getfield        #39  <Field String d>
	//   33   67:aload_1         
	//   34   68:getfield        #39  <Field String d>
	//   35   71:invokestatic    #59  <Method boolean aj.a(Object, Object)>
	//   36   74:ifeq            107
	//   37   77:aload_0         
	//   38   78:getfield        #41  <Field Uri e>
	//   39   81:aload_1         
	//   40   82:getfield        #41  <Field Uri e>
	//   41   85:invokestatic    #59  <Method boolean aj.a(Object, Object)>
	//   42   88:ifeq            107
	//   43   91:aload_0         
	//   44   92:getfield        #43  <Field String f>
	//   45   95:aload_1         
	//   46   96:getfield        #43  <Field String f>
	//   47   99:invokestatic    #59  <Method boolean aj.a(Object, Object)>
	//   48  102:ifeq            107
	//   49  105:iconst_1        
	//   50  106:ireturn         
	//   51  107:iconst_0        
	//   52  108:ireturn         
	}

	public int hashCode()
	{
		return ak.a(new Object[] {
			a, b, c, d, e, f
		});
	//    0    0:bipush          6
	//    1    2:anewarray       Object[]
	//    2    5:dup             
	//    3    6:iconst_0        
	//    4    7:aload_0         
	//    5    8:getfield        #35  <Field String a>
	//    6   11:aastore         
	//    7   12:dup             
	//    8   13:iconst_1        
	//    9   14:aload_0         
	//   10   15:getfield        #37  <Field String b>
	//   11   18:aastore         
	//   12   19:dup             
	//   13   20:iconst_2        
	//   14   21:aload_0         
	//   15   22:getfield        #32  <Field List c>
	//   16   25:aastore         
	//   17   26:dup             
	//   18   27:iconst_3        
	//   19   28:aload_0         
	//   20   29:getfield        #39  <Field String d>
	//   21   32:aastore         
	//   22   33:dup             
	//   23   34:iconst_4        
	//   24   35:aload_0         
	//   25   36:getfield        #41  <Field Uri e>
	//   26   39:aastore         
	//   27   40:dup             
	//   28   41:iconst_5        
	//   29   42:aload_0         
	//   30   43:getfield        #43  <Field String f>
	//   31   46:aastore         
	//   32   47:invokestatic    #68  <Method int ak.a(Object[])>
	//   33   50:ireturn         
	}

	public String toString()
	{
		String s = a;
	//    0    0:aload_0         
	//    1    1:getfield        #35  <Field String a>
	//    2    4:astore_2        
		String s1 = b;
	//    3    5:aload_0         
	//    4    6:getfield        #37  <Field String b>
	//    5    9:astore_3        
		Object obj = ((Object) (c));
	//    6   10:aload_0         
	//    7   11:getfield        #32  <Field List c>
	//    8   14:astore          4
		int i;
		if(obj == null)
	//*   9   16:aload           4
	//*  10   18:ifnonnull       26
			i = 0;
	//   11   21:iconst_0        
	//   12   22:istore_1        
		else
	//*  13   23:goto            34
			i = ((List) (obj)).size();
	//   14   26:aload           4
	//   15   28:invokeinterface #74  <Method int List.size()>
	//   16   33:istore_1        
		obj = ((Object) (d));
	//   17   34:aload_0         
	//   18   35:getfield        #39  <Field String d>
	//   19   38:astore          4
		String s2 = String.valueOf(((Object) (e)));
	//   20   40:aload_0         
	//   21   41:getfield        #41  <Field Uri e>
	//   22   44:invokestatic    #80  <Method String String.valueOf(Object)>
	//   23   47:astore          5
		String s3 = f;
	//   24   49:aload_0         
	//   25   50:getfield        #43  <Field String f>
	//   26   53:astore          6
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 110 + String.valueOf(((Object) (s1))).length() + String.valueOf(obj).length() + String.valueOf(((Object) (s2))).length() + String.valueOf(((Object) (s3))).length());
	//   27   55:new             #82  <Class StringBuilder>
	//   28   58:dup             
	//   29   59:aload_2         
	//   30   60:invokestatic    #80  <Method String String.valueOf(Object)>
	//   31   63:invokevirtual   #85  <Method int String.length()>
	//   32   66:bipush          110
	//   33   68:iadd            
	//   34   69:aload_3         
	//   35   70:invokestatic    #80  <Method String String.valueOf(Object)>
	//   36   73:invokevirtual   #85  <Method int String.length()>
	//   37   76:iadd            
	//   38   77:aload           4
	//   39   79:invokestatic    #80  <Method String String.valueOf(Object)>
	//   40   82:invokevirtual   #85  <Method int String.length()>
	//   41   85:iadd            
	//   42   86:aload           5
	//   43   88:invokestatic    #80  <Method String String.valueOf(Object)>
	//   44   91:invokevirtual   #85  <Method int String.length()>
	//   45   94:iadd            
	//   46   95:aload           6
	//   47   97:invokestatic    #80  <Method String String.valueOf(Object)>
	//   48  100:invokevirtual   #85  <Method int String.length()>
	//   49  103:iadd            
	//   50  104:invokespecial   #88  <Method void StringBuilder(int)>
	//   51  107:astore          7
		stringbuilder.append("applicationId: ");
	//   52  109:aload           7
	//   53  111:ldc1            #90  <String "applicationId: ">
	//   54  113:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   55  116:pop             
		stringbuilder.append(s);
	//   56  117:aload           7
	//   57  119:aload_2         
	//   58  120:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   59  123:pop             
		stringbuilder.append(", name: ");
	//   60  124:aload           7
	//   61  126:ldc1            #96  <String ", name: ">
	//   62  128:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   63  131:pop             
		stringbuilder.append(s1);
	//   64  132:aload           7
	//   65  134:aload_3         
	//   66  135:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   67  138:pop             
		stringbuilder.append(", namespaces.count: ");
	//   68  139:aload           7
	//   69  141:ldc1            #98  <String ", namespaces.count: ">
	//   70  143:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   71  146:pop             
		stringbuilder.append(i);
	//   72  147:aload           7
	//   73  149:iload_1         
	//   74  150:invokevirtual   #101 <Method StringBuilder StringBuilder.append(int)>
	//   75  153:pop             
		stringbuilder.append(", senderAppIdentifier: ");
	//   76  154:aload           7
	//   77  156:ldc1            #103 <String ", senderAppIdentifier: ">
	//   78  158:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   79  161:pop             
		stringbuilder.append(((String) (obj)));
	//   80  162:aload           7
	//   81  164:aload           4
	//   82  166:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   83  169:pop             
		stringbuilder.append(", senderAppLaunchUrl: ");
	//   84  170:aload           7
	//   85  172:ldc1            #105 <String ", senderAppLaunchUrl: ">
	//   86  174:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   87  177:pop             
		stringbuilder.append(s2);
	//   88  178:aload           7
	//   89  180:aload           5
	//   90  182:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   91  185:pop             
		stringbuilder.append(", iconUrl: ");
	//   92  186:aload           7
	//   93  188:ldc1            #107 <String ", iconUrl: ">
	//   94  190:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   95  193:pop             
		stringbuilder.append(s3);
	//   96  194:aload           7
	//   97  196:aload           6
	//   98  198:invokevirtual   #94  <Method StringBuilder StringBuilder.append(String)>
	//   99  201:pop             
		return stringbuilder.toString();
	//  100  202:aload           7
	//  101  204:invokevirtual   #109 <Method String StringBuilder.toString()>
	//  102  207:areturn         
	}

	public void writeToParcel(Parcel parcel, int i)
	{
		int j = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #116 <Method int c.a(Parcel)>
	//    2    4:istore_3        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a(), false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:invokevirtual   #118 <Method String a()>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #121 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, b(), false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:invokevirtual   #123 <Method String b()>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #121 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.c(parcel, 4, e(), false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:invokevirtual   #125 <Method List e()>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #128 <Method void c.c(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.b(parcel, 5, c(), false);
	//   21   35:aload_1         
	//   22   36:iconst_5        
	//   23   37:aload_0         
	//   24   38:invokevirtual   #130 <Method List c()>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #132 <Method void c.b(Parcel, int, List, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, d(), false);
	//   27   45:aload_1         
	//   28   46:bipush          6
	//   29   48:aload_0         
	//   30   49:invokevirtual   #134 <Method String d()>
	//   31   52:iconst_0        
	//   32   53:invokestatic    #121 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, ((android.os.Parcelable) (e)), i, false);
	//   33   56:aload_1         
	//   34   57:bipush          7
	//   35   59:aload_0         
	//   36   60:getfield        #41  <Field Uri e>
	//   37   63:iload_2         
	//   38   64:iconst_0        
	//   39   65:invokestatic    #137 <Method void c.a(Parcel, int, android.os.Parcelable, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, f, false);
	//   40   68:aload_1         
	//   41   69:bipush          8
	//   42   71:aload_0         
	//   43   72:getfield        #43  <Field String f>
	//   44   75:iconst_0        
	//   45   76:invokestatic    #121 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, j);
	//   46   79:aload_1         
	//   47   80:iload_3         
	//   48   81:invokestatic    #139 <Method void c.a(Parcel, int)>
	//   49   84:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new am();
	private String a;
	private String b;
	private List c;
	private String d;
	private Uri e;
	private String f;

	static 
	{
	//    0    0:new             #20  <Class am>
	//    1    3:dup             
	//    2    4:invokespecial   #23  <Method void am()>
	//    3    7:putstatic       #25  <Field android.os.Parcelable$Creator CREATOR>
	//*   4   10:return          
	}
}
