// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package o;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import java.text.SimpleDateFormat;
import java.util.Date;

// Referenced classes of package o:
//			hi, hj, hk, hq

public final class fw
{

	public fw(Context context)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #20  <Method void Object()>
		g = "";
	//    2    4:aload_0         
	//    3    5:ldc1            #22  <String "">
	//    4    7:putfield        #24  <Field String g>
		Context context1 = context;
	//    5   10:aload_1         
	//    6   11:astore_2        
		if(context != null)
	//*   7   12:aload_1         
	//*   8   13:ifnull          21
			context1 = context.getApplicationContext();
	//    9   16:aload_1         
	//   10   17:invokevirtual   #30  <Method Context Context.getApplicationContext()>
	//   11   20:astore_2        
		b = String.format("123456789,%s", new Object[] {
			(new SimpleDateFormat("yyyy-MM-dd-HH:mm:ss")).format(new Date())
		});
	//   12   21:aload_0         
	//   13   22:ldc1            #32  <String "123456789,%s">
	//   14   24:iconst_1        
	//   15   25:anewarray       Object[]
	//   16   28:dup             
	//   17   29:iconst_0        
	//   18   30:new             #34  <Class SimpleDateFormat>
	//   19   33:dup             
	//   20   34:ldc1            #36  <String "yyyy-MM-dd-HH:mm:ss">
	//   21   36:invokespecial   #39  <Method void SimpleDateFormat(String)>
	//   22   39:new             #41  <Class Date>
	//   23   42:dup             
	//   24   43:invokespecial   #42  <Method void Date()>
	//   25   46:invokevirtual   #46  <Method String SimpleDateFormat.format(Date)>
	//   26   49:aastore         
	//   27   50:invokestatic    #51  <Method String String.format(String, Object[])>
	//   28   53:putfield        #53  <Field String b>
		e = d(context1);
	//   29   56:aload_0         
	//   30   57:aload_2         
	//   31   58:invokestatic    #56  <Method String d(Context)>
	//   32   61:putfield        #58  <Field String e>
		d = String.format("android,3,%s,%s,com.alipay.mcpay,5.0,-,-,-", new Object[] {
			d("15.4.5"), d("h.a.3.4.5")
		});
	//   33   64:aload_0         
	//   34   65:ldc1            #60  <String "android,3,%s,%s,com.alipay.mcpay,5.0,-,-,-">
	//   35   67:iconst_2        
	//   36   68:anewarray       Object[]
	//   37   71:dup             
	//   38   72:iconst_0        
	//   39   73:ldc1            #62  <String "15.4.5">
	//   40   75:invokestatic    #65  <Method String d(String)>
	//   41   78:aastore         
	//   42   79:dup             
	//   43   80:iconst_1        
	//   44   81:ldc1            #67  <String "h.a.3.4.5">
	//   45   83:invokestatic    #65  <Method String d(String)>
	//   46   86:aastore         
	//   47   87:invokestatic    #51  <Method String String.format(String, Object[])>
	//   48   90:putfield        #69  <Field String d>
		a = String.format("%s,%s,-,-,-", new Object[] {
			d(hi.e().c), d(hj.d().c())
		});
	//   49   93:aload_0         
	//   50   94:ldc1            #71  <String "%s,%s,-,-,-">
	//   51   96:iconst_2        
	//   52   97:anewarray       Object[]
	//   53  100:dup             
	//   54  101:iconst_0        
	//   55  102:invokestatic    #76  <Method hi hi.e()>
	//   56  105:getfield        #78  <Field String hi.c>
	//   57  108:invokestatic    #65  <Method String d(String)>
	//   58  111:aastore         
	//   59  112:dup             
	//   60  113:iconst_1        
	//   61  114:invokestatic    #83  <Method hj hj.d()>
	//   62  117:invokevirtual   #86  <Method String hj.c()>
	//   63  120:invokestatic    #65  <Method String d(String)>
	//   64  123:aastore         
	//   65  124:invokestatic    #51  <Method String String.format(String, Object[])>
	//   66  127:putfield        #88  <Field String a>
		f = String.format("%s,%s,%s,%s,%s,%s,%s,%s,%s,-", new Object[] {
			d(hk.a(context1)), "android", d(android.os.Build.VERSION.RELEASE), d(Build.MODEL), "-", d(hk.d(context1).e()), d(hk.b(context1).r), "gw", d(hk.d(context1).b())
		});
	//   67  130:aload_0         
	//   68  131:ldc1            #90  <String "%s,%s,%s,%s,%s,%s,%s,%s,%s,-">
	//   69  133:bipush          9
	//   70  135:anewarray       Object[]
	//   71  138:dup             
	//   72  139:iconst_0        
	//   73  140:aload_2         
	//   74  141:invokestatic    #94  <Method String hk.a(Context)>
	//   75  144:invokestatic    #65  <Method String d(String)>
	//   76  147:aastore         
	//   77  148:dup             
	//   78  149:iconst_1        
	//   79  150:ldc1            #96  <String "android">
	//   80  152:aastore         
	//   81  153:dup             
	//   82  154:iconst_2        
	//   83  155:getstatic       #101 <Field String android.os.Build$VERSION.RELEASE>
	//   84  158:invokestatic    #65  <Method String d(String)>
	//   85  161:aastore         
	//   86  162:dup             
	//   87  163:iconst_3        
	//   88  164:getstatic       #106 <Field String Build.MODEL>
	//   89  167:invokestatic    #65  <Method String d(String)>
	//   90  170:aastore         
	//   91  171:dup             
	//   92  172:iconst_4        
	//   93  173:ldc1            #108 <String "-">
	//   94  175:aastore         
	//   95  176:dup             
	//   96  177:iconst_5        
	//   97  178:aload_2         
	//   98  179:invokestatic    #111 <Method hk hk.d(Context)>
	//   99  182:invokevirtual   #113 <Method String hk.e()>
	//  100  185:invokestatic    #65  <Method String d(String)>
	//  101  188:aastore         
	//  102  189:dup             
	//  103  190:bipush          6
	//  104  192:aload_2         
	//  105  193:invokestatic    #116 <Method hq hk.b(Context)>
	//  106  196:getfield        #121 <Field String hq.r>
	//  107  199:invokestatic    #65  <Method String d(String)>
	//  108  202:aastore         
	//  109  203:dup             
	//  110  204:bipush          7
	//  111  206:ldc1            #123 <String "gw">
	//  112  208:aastore         
	//  113  209:dup             
	//  114  210:bipush          8
	//  115  212:aload_2         
	//  116  213:invokestatic    #111 <Method hk hk.d(Context)>
	//  117  216:invokevirtual   #125 <Method String hk.b()>
	//  118  219:invokestatic    #65  <Method String d(String)>
	//  119  222:aastore         
	//  120  223:invokestatic    #51  <Method String String.format(String, Object[])>
	//  121  226:putfield        #127 <Field String f>
		h = "-";
	//  122  229:aload_0         
	//  123  230:ldc1            #108 <String "-">
	//  124  232:putfield        #129 <Field String h>
		k = "-";
	//  125  235:aload_0         
	//  126  236:ldc1            #108 <String "-">
	//  127  238:putfield        #131 <Field String k>
		i = "-";
	//  128  241:aload_0         
	//  129  242:ldc1            #108 <String "-">
	//  130  244:putfield        #133 <Field String i>
	//  131  247:return          
	}

	static String b(Throwable throwable)
	{
		StringBuffer stringbuffer;
		if(throwable == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       7
			return "";
	//    2    4:ldc1            #22  <String "">
	//    3    6:areturn         
		stringbuffer = new StringBuffer();
	//    4    7:new             #139 <Class StringBuffer>
	//    5   10:dup             
	//    6   11:invokespecial   #140 <Method void StringBuffer()>
	//    7   14:astore_2        
		stringbuffer.append(((Object) (throwable)).getClass().getName()).append(":");
	//    8   15:aload_2         
	//    9   16:aload_0         
	//   10   17:invokevirtual   #144 <Method Class Object.getClass()>
	//   11   20:invokevirtual   #149 <Method String Class.getName()>
	//   12   23:invokevirtual   #153 <Method StringBuffer StringBuffer.append(String)>
	//   13   26:ldc1            #155 <String ":">
	//   14   28:invokevirtual   #153 <Method StringBuffer StringBuffer.append(String)>
	//   15   31:pop             
		stringbuffer.append(throwable.getMessage());
	//   16   32:aload_2         
	//   17   33:aload_0         
	//   18   34:invokevirtual   #158 <Method String Throwable.getMessage()>
	//   19   37:invokevirtual   #153 <Method StringBuffer StringBuffer.append(String)>
	//   20   40:pop             
		stringbuffer.append(" \u300B ");
	//   21   41:aload_2         
	//   22   42:ldc1            #160 <String " \u300B ">
	//   23   44:invokevirtual   #153 <Method StringBuffer StringBuffer.append(String)>
	//   24   47:pop             
		throwable = ((Throwable) (throwable.getStackTrace()));
	//   25   48:aload_0         
	//   26   49:invokevirtual   #164 <Method StackTraceElement[] Throwable.getStackTrace()>
	//   27   52:astore_0        
		if(throwable == null) goto _L2; else goto _L1
	//   28   53:aload_0         
	//   29   54:ifnull          101
_L1:
		int j = 0;
	//   30   57:iconst_0        
	//   31   58:istore_1        
_L3:
		if(j >= throwable.length)
			break; /* Loop/switch isn't completed */
	//   32   59:iload_1         
	//   33   60:aload_0         
	//   34   61:arraylength     
	//   35   62:icmpge          101
		stringbuffer.append((new StringBuilder()).append(((StackTraceElement) (throwable[j])).toString()).append(" \u300B ").toString());
	//   36   65:aload_2         
	//   37   66:new             #166 <Class StringBuilder>
	//   38   69:dup             
	//   39   70:invokespecial   #167 <Method void StringBuilder()>
	//   40   73:aload_0         
	//   41   74:iload_1         
	//   42   75:aaload          
	//   43   76:invokevirtual   #172 <Method String StackTraceElement.toString()>
	//   44   79:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   45   82:ldc1            #160 <String " \u300B ">
	//   46   84:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   47   87:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   48   90:invokevirtual   #153 <Method StringBuffer StringBuffer.append(String)>
	//   49   93:pop             
		j++;
	//   50   94:iload_1         
	//   51   95:iconst_1        
	//   52   96:iadd            
	//   53   97:istore_1        
		if(true) goto _L3; else goto _L2
	//   54   98:goto            59
_L2:
		return stringbuffer.toString();
	//   55  101:aload_2         
	//   56  102:invokevirtual   #177 <Method String StringBuffer.toString()>
	//   57  105:areturn         
		throwable;
	//   58  106:astore_0        
		if(true) goto _L2; else goto _L4
_L4:
	//*  59  107:goto            101
	}

	private static String d(Context context)
	{
		Object obj;
		String s;
		Object obj1;
		String s1;
		s = "-";
	//    0    0:ldc1            #108 <String "-">
	//    1    2:astore_2        
		s1 = "-";
	//    2    3:ldc1            #108 <String "-">
	//    3    5:astore          4
		obj = ((Object) (s));
	//    4    7:aload_2         
	//    5    8:astore_1        
		obj1 = ((Object) (s1));
	//    6    9:aload           4
	//    7   11:astore_3        
		if(context == null)
			break MISSING_BLOCK_LABEL_47;
	//    8   12:aload_0         
	//    9   13:ifnull          47
		obj = ((Object) (s));
	//   10   16:aload_2         
	//   11   17:astore_1        
		obj1 = ((Object) (context.getApplicationContext()));
	//   12   18:aload_0         
	//   13   19:invokevirtual   #30  <Method Context Context.getApplicationContext()>
	//   14   22:astore_3        
		obj = ((Object) (s));
	//   15   23:aload_2         
	//   16   24:astore_1        
		context = ((Context) (((Context) (obj1)).getPackageName()));
	//   17   25:aload_3         
	//   18   26:invokevirtual   #180 <Method String Context.getPackageName()>
	//   19   29:astore_0        
		obj = ((Object) (context));
	//   20   30:aload_0         
	//   21   31:astore_1        
		obj1 = ((Object) (((Context) (obj1)).getPackageManager().getPackageInfo(((String) (context)), 0).versionName));
	//   22   32:aload_3         
	//   23   33:invokevirtual   #184 <Method PackageManager Context.getPackageManager()>
	//   24   36:aload_0         
	//   25   37:iconst_0        
	//   26   38:invokevirtual   #190 <Method PackageInfo PackageManager.getPackageInfo(String, int)>
	//   27   41:getfield        #195 <Field String PackageInfo.versionName>
	//   28   44:astore_3        
		obj = ((Object) (context));
	//   29   45:aload_0         
	//   30   46:astore_1        
_L2:
		return String.format("%s,%s,-,-,-", new Object[] {
			obj, obj1
		});
	//   31   47:ldc1            #71  <String "%s,%s,-,-,-">
	//   32   49:iconst_2        
	//   33   50:anewarray       Object[]
	//   34   53:dup             
	//   35   54:iconst_0        
	//   36   55:aload_1         
	//   37   56:aastore         
	//   38   57:dup             
	//   39   58:iconst_1        
	//   40   59:aload_3         
	//   41   60:aastore         
	//   42   61:invokestatic    #51  <Method String String.format(String, Object[])>
	//   43   64:areturn         
		context;
	//   44   65:astore_0        
		obj1 = ((Object) (s1));
	//   45   66:aload           4
	//   46   68:astore_3        
		if(true) goto _L2; else goto _L1
	//   47   69:goto            47
_L1:
	}

	static String d(String s)
	{
		if(TextUtils.isEmpty(((CharSequence) (s))))
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #201 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   2    4:ifeq            10
			return "";
	//    3    7:ldc1            #22  <String "">
	//    4    9:areturn         
		else
			return s.replace("[", "\u3010").replace("]", "\u3011").replace("(", "\uFF08").replace(")", "\uFF09").replace(",", "\uFF0C").replace("-", "=").replace("^", "~");
	//    5   10:aload_0         
	//    6   11:ldc1            #203 <String "[">
	//    7   13:ldc1            #205 <String "\u3010">
	//    8   15:invokevirtual   #209 <Method String String.replace(CharSequence, CharSequence)>
	//    9   18:ldc1            #211 <String "]">
	//   10   20:ldc1            #213 <String "\u3011">
	//   11   22:invokevirtual   #209 <Method String String.replace(CharSequence, CharSequence)>
	//   12   25:ldc1            #215 <String "(">
	//   13   27:ldc1            #217 <String "\uFF08">
	//   14   29:invokevirtual   #209 <Method String String.replace(CharSequence, CharSequence)>
	//   15   32:ldc1            #219 <String ")">
	//   16   34:ldc1            #221 <String "\uFF09">
	//   17   36:invokevirtual   #209 <Method String String.replace(CharSequence, CharSequence)>
	//   18   39:ldc1            #223 <String ",">
	//   19   41:ldc1            #225 <String "\uFF0C">
	//   20   43:invokevirtual   #209 <Method String String.replace(CharSequence, CharSequence)>
	//   21   46:ldc1            #108 <String "-">
	//   22   48:ldc1            #227 <String "=">
	//   23   50:invokevirtual   #209 <Method String String.replace(CharSequence, CharSequence)>
	//   24   53:ldc1            #229 <String "^">
	//   25   55:ldc1            #231 <String "~">
	//   26   57:invokevirtual   #209 <Method String String.replace(CharSequence, CharSequence)>
	//   27   60:areturn         
	}

	public final void a(String s, String s1, String s2)
	{
		b(s, s1, s2, "-");
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:ldc1            #108 <String "-">
	//    5    6:invokevirtual   #235 <Method void b(String, String, String, String)>
	//    6    9:return          
	}

	public final void b(String s, String s1, String s2, String s3)
	{
		String s4 = "";
	//    0    0:ldc1            #22  <String "">
	//    1    2:astore          5
		if(!TextUtils.isEmpty(((CharSequence) (g))))
	//*   2    4:aload_0         
	//*   3    5:getfield        #24  <Field String g>
	//*   4    8:invokestatic    #201 <Method boolean TextUtils.isEmpty(CharSequence)>
	//*   5   11:ifne            36
			s4 = (new StringBuilder()).append("").append("^").toString();
	//    6   14:new             #166 <Class StringBuilder>
	//    7   17:dup             
	//    8   18:invokespecial   #167 <Method void StringBuilder()>
	//    9   21:ldc1            #22  <String "">
	//   10   23:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   11   26:ldc1            #229 <String "^">
	//   12   28:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   13   31:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   14   34:astore          5
		s = (new StringBuilder()).append(s4).append(String.format("%s,%s,%s,%s", new Object[] {
			s, s1, d(s2), s3
		})).toString();
	//   15   36:new             #166 <Class StringBuilder>
	//   16   39:dup             
	//   17   40:invokespecial   #167 <Method void StringBuilder()>
	//   18   43:aload           5
	//   19   45:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   20   48:ldc1            #237 <String "%s,%s,%s,%s">
	//   21   50:iconst_4        
	//   22   51:anewarray       Object[]
	//   23   54:dup             
	//   24   55:iconst_0        
	//   25   56:aload_1         
	//   26   57:aastore         
	//   27   58:dup             
	//   28   59:iconst_1        
	//   29   60:aload_2         
	//   30   61:aastore         
	//   31   62:dup             
	//   32   63:iconst_2        
	//   33   64:aload_3         
	//   34   65:invokestatic    #65  <Method String d(String)>
	//   35   68:aastore         
	//   36   69:dup             
	//   37   70:iconst_3        
	//   38   71:aload           4
	//   39   73:aastore         
	//   40   74:invokestatic    #51  <Method String String.format(String, Object[])>
	//   41   77:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   42   80:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   43   83:astore_1        
		g = (new StringBuilder()).append(g).append(s).toString();
	//   44   84:aload_0         
	//   45   85:new             #166 <Class StringBuilder>
	//   46   88:dup             
	//   47   89:invokespecial   #167 <Method void StringBuilder()>
	//   48   92:aload_0         
	//   49   93:getfield        #24  <Field String g>
	//   50   96:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   51   99:aload_1         
	//   52  100:invokevirtual   #175 <Method StringBuilder StringBuilder.append(String)>
	//   53  103:invokevirtual   #176 <Method String StringBuilder.toString()>
	//   54  106:putfield        #24  <Field String g>
	//   55  109:return          
	}

	public final void d(String s, String s1, Throwable throwable)
	{
		a(s, s1, b(throwable));
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aload_2         
	//    3    3:aload_3         
	//    4    4:invokestatic    #240 <Method String b(Throwable)>
	//    5    7:invokevirtual   #242 <Method void a(String, String, String)>
	//    6   10:return          
	}

	String a;
	String b;
	String c;
	String d;
	String e;
	String f;
	String g;
	String h;
	String i;
	String k;
}
