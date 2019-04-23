// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.Arrays;
import java.util.Comparator;

// Referenced classes of package com.google.android.gms.phenotype:
//			j, i, m

public final class zzi extends AbstractSafeParcelable
	implements Comparable
{

	public zzi(String s, long l, boolean flag, double d1, String s1, 
			byte abyte0[], int k, int i1)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #41  <Method void AbstractSafeParcelable()>
		a = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #43  <Field String a>
		c = l;
	//    5    9:aload_0         
	//    6   10:lload_2         
	//    7   11:putfield        #45  <Field long c>
		d = flag;
	//    8   14:aload_0         
	//    9   15:iload           4
	//   10   17:putfield        #47  <Field boolean d>
		e = d1;
	//   11   20:aload_0         
	//   12   21:dload           5
	//   13   23:putfield        #49  <Field double e>
		f = s1;
	//   14   26:aload_0         
	//   15   27:aload           7
	//   16   29:putfield        #51  <Field String f>
		g = abyte0;
	//   17   32:aload_0         
	//   18   33:aload           8
	//   19   35:putfield        #53  <Field byte[] g>
		h = k;
	//   20   38:aload_0         
	//   21   39:iload           9
	//   22   41:putfield        #55  <Field int h>
		b = i1;
	//   23   44:aload_0         
	//   24   45:iload           10
	//   25   47:putfield        #57  <Field int b>
	//   26   50:return          
	}

	private static int a(int k, int l)
	{
		if(k < l)
	//*   0    0:iload_0         
	//*   1    1:iload_1         
	//*   2    2:icmpge          7
			return -1;
	//    3    5:iconst_m1       
	//    4    6:ireturn         
		return k != l ? 1 : 0;
	//    5    7:iload_0         
	//    6    8:iload_1         
	//    7    9:icmpne          14
	//    8   12:iconst_0        
	//    9   13:ireturn         
	//   10   14:iconst_1        
	//   11   15:ireturn         
	}

	public final int compareTo(Object obj)
	{
		obj = ((Object) ((zzi)obj));
	//    0    0:aload_1         
	//    1    1:checkcast       #2   <Class zzi>
	//    2    4:astore_1        
		int k = a.compareTo(((zzi) (obj)).a);
	//    3    5:aload_0         
	//    4    6:getfield        #43  <Field String a>
	//    5    9:aload_1         
	//    6   10:getfield        #43  <Field String a>
	//    7   13:invokevirtual   #65  <Method int String.compareTo(String)>
	//    8   16:istore_2        
		if(k != 0)
	//*   9   17:iload_2         
	//*  10   18:ifeq            23
			return k;
	//   11   21:iload_2         
	//   12   22:ireturn         
		k = a(h, ((zzi) (obj)).h);
	//   13   23:aload_0         
	//   14   24:getfield        #55  <Field int h>
	//   15   27:aload_1         
	//   16   28:getfield        #55  <Field int h>
	//   17   31:invokestatic    #67  <Method int a(int, int)>
	//   18   34:istore_2        
		if(k != 0)
	//*  19   35:iload_2         
	//*  20   36:ifeq            41
			return k;
	//   21   39:iload_2         
	//   22   40:ireturn         
		int l = h;
	//   23   41:aload_0         
	//   24   42:getfield        #55  <Field int h>
	//   25   45:istore_3        
		k = 0;
	//   26   46:iconst_0        
	//   27   47:istore_2        
		long l1;
		long l2;
		switch(l)
	//*  28   48:iload_3         
		{
	//*  29   49:tableswitch     1 5: default 84
	//	               1 289
	//	               2 263
	//	               3 251
	//	               4 212
	//	               5 119
		default:
			obj = ((Object) (new StringBuilder(31)));
	//   30   84:new             #69  <Class StringBuilder>
	//   31   87:dup             
	//   32   88:bipush          31
	//   33   90:invokespecial   #72  <Method void StringBuilder(int)>
	//   34   93:astore_1        
			((StringBuilder) (obj)).append("Invalid enum value: ");
	//   35   94:aload_1         
	//   36   95:ldc1            #74  <String "Invalid enum value: ">
	//   37   97:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   38  100:pop             
			((StringBuilder) (obj)).append(l);
	//   39  101:aload_1         
	//   40  102:iload_3         
	//   41  103:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   42  106:pop             
			throw new AssertionError(((Object) (((StringBuilder) (obj)).toString())));
	//   43  107:new             #83  <Class AssertionError>
	//   44  110:dup             
	//   45  111:aload_1         
	//   46  112:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   47  115:invokespecial   #90  <Method void AssertionError(Object)>
	//   48  118:athrow          

		case 5: // '\005'
			byte abyte0[] = g;
	//   49  119:aload_0         
	//   50  120:getfield        #53  <Field byte[] g>
	//   51  123:astore          9
			byte abyte1[] = ((zzi) (obj)).g;
	//   52  125:aload_1         
	//   53  126:getfield        #53  <Field byte[] g>
	//   54  129:astore          10
			if(abyte0 == abyte1)
	//*  55  131:aload           9
	//*  56  133:aload           10
	//*  57  135:if_acmpne       140
				return 0;
	//   58  138:iconst_0        
	//   59  139:ireturn         
			if(abyte0 == null)
	//*  60  140:aload           9
	//*  61  142:ifnonnull       147
				return -1;
	//   62  145:iconst_m1       
	//   63  146:ireturn         
			if(abyte1 == null)
	//*  64  147:aload           10
	//*  65  149:ifnonnull       154
				return 1;
	//   66  152:iconst_1        
	//   67  153:ireturn         
			for(; k < Math.min(g.length, ((zzi) (obj)).g.length); k++)
	//*  68  154:iload_2         
	//*  69  155:aload_0         
	//*  70  156:getfield        #53  <Field byte[] g>
	//*  71  159:arraylength     
	//*  72  160:aload_1         
	//*  73  161:getfield        #53  <Field byte[] g>
	//*  74  164:arraylength     
	//*  75  165:invokestatic    #95  <Method int Math.min(int, int)>
	//*  76  168:icmpge          198
			{
				int i1 = g[k] - ((zzi) (obj)).g[k];
	//   77  171:aload_0         
	//   78  172:getfield        #53  <Field byte[] g>
	//   79  175:iload_2         
	//   80  176:baload          
	//   81  177:aload_1         
	//   82  178:getfield        #53  <Field byte[] g>
	//   83  181:iload_2         
	//   84  182:baload          
	//   85  183:isub            
	//   86  184:istore_3        
				if(i1 != 0)
	//*  87  185:iload_3         
	//*  88  186:ifeq            191
					return i1;
	//   89  189:iload_3         
	//   90  190:ireturn         
			}

	//   91  191:iload_2         
	//   92  192:iconst_1        
	//   93  193:iadd            
	//   94  194:istore_2        
	//*  95  195:goto            154
			return a(g.length, ((zzi) (obj)).g.length);
	//   96  198:aload_0         
	//   97  199:getfield        #53  <Field byte[] g>
	//   98  202:arraylength     
	//   99  203:aload_1         
	//  100  204:getfield        #53  <Field byte[] g>
	//  101  207:arraylength     
	//  102  208:invokestatic    #67  <Method int a(int, int)>
	//  103  211:ireturn         

		case 4: // '\004'
			String s = f;
	//  104  212:aload_0         
	//  105  213:getfield        #51  <Field String f>
	//  106  216:astore          9
			obj = ((Object) (((zzi) (obj)).f));
	//  107  218:aload_1         
	//  108  219:getfield        #51  <Field String f>
	//  109  222:astore_1        
			if(s == obj)
	//* 110  223:aload           9
	//* 111  225:aload_1         
	//* 112  226:if_acmpne       231
				return 0;
	//  113  229:iconst_0        
	//  114  230:ireturn         
			if(s == null)
	//* 115  231:aload           9
	//* 116  233:ifnonnull       238
				return -1;
	//  117  236:iconst_m1       
	//  118  237:ireturn         
			if(obj == null)
	//* 119  238:aload_1         
	//* 120  239:ifnonnull       244
				return 1;
	//  121  242:iconst_1        
	//  122  243:ireturn         
			else
				return s.compareTo(((String) (obj)));
	//  123  244:aload           9
	//  124  246:aload_1         
	//  125  247:invokevirtual   #65  <Method int String.compareTo(String)>
	//  126  250:ireturn         

		case 3: // '\003'
			return Double.compare(e, ((zzi) (obj)).e);
	//  127  251:aload_0         
	//  128  252:getfield        #49  <Field double e>
	//  129  255:aload_1         
	//  130  256:getfield        #49  <Field double e>
	//  131  259:invokestatic    #101 <Method int Double.compare(double, double)>
	//  132  262:ireturn         

		case 2: // '\002'
			boolean flag = d;
	//  133  263:aload_0         
	//  134  264:getfield        #47  <Field boolean d>
	//  135  267:istore          4
			if(flag == ((zzi) (obj)).d)
	//* 136  269:iload           4
	//* 137  271:aload_1         
	//* 138  272:getfield        #47  <Field boolean d>
	//* 139  275:icmpne          280
				return 0;
	//  140  278:iconst_0        
	//  141  279:ireturn         
			return !flag ? -1 : 1;
	//  142  280:iload           4
	//  143  282:ifeq            287
	//  144  285:iconst_1        
	//  145  286:ireturn         
	//  146  287:iconst_m1       
	//  147  288:ireturn         

		case 1: // '\001'
			l1 = c;
	//  148  289:aload_0         
	//  149  290:getfield        #45  <Field long c>
	//  150  293:lstore          5
			l2 = ((zzi) (obj)).c;
	//  151  295:aload_1         
	//  152  296:getfield        #45  <Field long c>
	//  153  299:lstore          7
			break;
		}
		if(l1 < l2)
	//* 154  301:lload           5
	//* 155  303:lload           7
	//* 156  305:lcmp            
	//* 157  306:ifge            311
			return -1;
	//  158  309:iconst_m1       
	//  159  310:ireturn         
		return l1 != l2 ? 1 : 0;
	//  160  311:lload           5
	//  161  313:lload           7
	//  162  315:lcmp            
	//  163  316:ifne            321
	//  164  319:iconst_0        
	//  165  320:ireturn         
	//  166  321:iconst_1        
	//  167  322:ireturn         
	}

	public final boolean equals(Object obj)
	{
		if(obj instanceof zzi)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class zzi>
	//*   2    4:ifeq            192
		{
			obj = ((Object) ((zzi)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class zzi>
	//    5   11:astore_1        
			if(m.a(((Object) (a)), ((Object) (((zzi) (obj)).a))))
	//*   6   12:aload_0         
	//*   7   13:getfield        #43  <Field String a>
	//*   8   16:aload_1         
	//*   9   17:getfield        #43  <Field String a>
	//*  10   20:invokestatic    #108 <Method boolean m.a(Object, Object)>
	//*  11   23:ifeq            192
			{
				int k = h;
	//   12   26:aload_0         
	//   13   27:getfield        #55  <Field int h>
	//   14   30:istore_2        
				if(k == ((zzi) (obj)).h)
	//*  15   31:iload_2         
	//*  16   32:aload_1         
	//*  17   33:getfield        #55  <Field int h>
	//*  18   36:icmpne          192
				{
					if(b != ((zzi) (obj)).b)
	//*  19   39:aload_0         
	//*  20   40:getfield        #57  <Field int b>
	//*  21   43:aload_1         
	//*  22   44:getfield        #57  <Field int b>
	//*  23   47:icmpeq          52
						return false;
	//   24   50:iconst_0        
	//   25   51:ireturn         
					switch(k)
	//*  26   52:iload_2         
					{
	//*  27   53:tableswitch     1 5: default 88
	//	               1 178
	//	               2 163
	//	               3 147
	//	               4 135
	//	               5 123
					default:
						obj = ((Object) (new StringBuilder(31)));
	//   28   88:new             #69  <Class StringBuilder>
	//   29   91:dup             
	//   30   92:bipush          31
	//   31   94:invokespecial   #72  <Method void StringBuilder(int)>
	//   32   97:astore_1        
						((StringBuilder) (obj)).append("Invalid enum value: ");
	//   33   98:aload_1         
	//   34   99:ldc1            #74  <String "Invalid enum value: ">
	//   35  101:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   36  104:pop             
						((StringBuilder) (obj)).append(k);
	//   37  105:aload_1         
	//   38  106:iload_2         
	//   39  107:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   40  110:pop             
						throw new AssertionError(((Object) (((StringBuilder) (obj)).toString())));
	//   41  111:new             #83  <Class AssertionError>
	//   42  114:dup             
	//   43  115:aload_1         
	//   44  116:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   45  119:invokespecial   #90  <Method void AssertionError(Object)>
	//   46  122:athrow          

					case 5: // '\005'
						return Arrays.equals(g, ((zzi) (obj)).g);
	//   47  123:aload_0         
	//   48  124:getfield        #53  <Field byte[] g>
	//   49  127:aload_1         
	//   50  128:getfield        #53  <Field byte[] g>
	//   51  131:invokestatic    #113 <Method boolean Arrays.equals(byte[], byte[])>
	//   52  134:ireturn         

					case 4: // '\004'
						return m.a(((Object) (f)), ((Object) (((zzi) (obj)).f)));
	//   53  135:aload_0         
	//   54  136:getfield        #51  <Field String f>
	//   55  139:aload_1         
	//   56  140:getfield        #51  <Field String f>
	//   57  143:invokestatic    #108 <Method boolean m.a(Object, Object)>
	//   58  146:ireturn         

					case 3: // '\003'
						return e == ((zzi) (obj)).e;
	//   59  147:aload_0         
	//   60  148:getfield        #49  <Field double e>
	//   61  151:aload_1         
	//   62  152:getfield        #49  <Field double e>
	//   63  155:dcmpl           
	//   64  156:ifne            161
	//   65  159:iconst_1        
	//   66  160:ireturn         
	//   67  161:iconst_0        
	//   68  162:ireturn         

					case 2: // '\002'
						return d == ((zzi) (obj)).d;
	//   69  163:aload_0         
	//   70  164:getfield        #47  <Field boolean d>
	//   71  167:aload_1         
	//   72  168:getfield        #47  <Field boolean d>
	//   73  171:icmpne          176
	//   74  174:iconst_1        
	//   75  175:ireturn         
	//   76  176:iconst_0        
	//   77  177:ireturn         

					case 1: // '\001'
						break;
					}
					if(c == ((zzi) (obj)).c)
	//*  78  178:aload_0         
	//*  79  179:getfield        #45  <Field long c>
	//*  80  182:aload_1         
	//*  81  183:getfield        #45  <Field long c>
	//*  82  186:lcmp            
	//*  83  187:ifne            192
						return true;
	//   84  190:iconst_1        
	//   85  191:ireturn         
				}
			}
		}
		return false;
	//   86  192:iconst_0        
	//   87  193:ireturn         
	}

	public final String toString()
	{
		int k;
		StringBuilder stringbuilder;
		stringbuilder = new StringBuilder();
	//    0    0:new             #69  <Class StringBuilder>
	//    1    3:dup             
	//    2    4:invokespecial   #114 <Method void StringBuilder()>
	//    3    7:astore_3        
		stringbuilder.append("Flag(");
	//    4    8:aload_3         
	//    5    9:ldc1            #116 <String "Flag(">
	//    6   11:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//    7   14:pop             
		stringbuilder.append(a);
	//    8   15:aload_3         
	//    9   16:aload_0         
	//   10   17:getfield        #43  <Field String a>
	//   11   20:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   12   23:pop             
		stringbuilder.append(", ");
	//   13   24:aload_3         
	//   14   25:ldc1            #118 <String ", ">
	//   15   27:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   16   30:pop             
		k = h;
	//   17   31:aload_0         
	//   18   32:getfield        #55  <Field int h>
	//   19   35:istore_1        
		k;
	//   20   36:iload_1         
		JVM INSTR tableswitch 1 5: default 72
	//	               1 219
	//	               2 207
	//	               3 195
	//	               4 165
	//	               5 133;
	//   21   37:tableswitch     1 5: default 72
	//	               1 219
	//	               2 207
	//	               3 195
	//	               4 165
	//	               5 133
		   goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
		String s = a;
	//   22   72:aload_0         
	//   23   73:getfield        #43  <Field String a>
	//   24   76:astore_2        
		stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 27);
	//   25   77:new             #69  <Class StringBuilder>
	//   26   80:dup             
	//   27   81:aload_2         
	//   28   82:invokestatic    #122 <Method String String.valueOf(Object)>
	//   29   85:invokevirtual   #126 <Method int String.length()>
	//   30   88:bipush          27
	//   31   90:iadd            
	//   32   91:invokespecial   #72  <Method void StringBuilder(int)>
	//   33   94:astore_3        
		stringbuilder.append("Invalid type: ");
	//   34   95:aload_3         
	//   35   96:ldc1            #128 <String "Invalid type: ">
	//   36   98:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   37  101:pop             
		stringbuilder.append(s);
	//   38  102:aload_3         
	//   39  103:aload_2         
	//   40  104:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   41  107:pop             
		stringbuilder.append(", ");
	//   42  108:aload_3         
	//   43  109:ldc1            #118 <String ", ">
	//   44  111:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   45  114:pop             
		stringbuilder.append(k);
	//   46  115:aload_3         
	//   47  116:iload_1         
	//   48  117:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//   49  120:pop             
		throw new AssertionError(((Object) (stringbuilder.toString())));
	//   50  121:new             #83  <Class AssertionError>
	//   51  124:dup             
	//   52  125:aload_3         
	//   53  126:invokevirtual   #87  <Method String StringBuilder.toString()>
	//   54  129:invokespecial   #90  <Method void AssertionError(Object)>
	//   55  132:athrow          
_L6:
		if(g != null) goto _L8; else goto _L7
	//   56  133:aload_0         
	//   57  134:getfield        #53  <Field byte[] g>
	//   58  137:ifnonnull       146
_L7:
		String s1 = "null";
	//   59  140:ldc1            #130 <String "null">
	//   60  142:astore_2        
		  goto _L9
	//*  61  143:goto            186
_L8:
		stringbuilder.append("'");
	//   62  146:aload_3         
	//   63  147:ldc1            #132 <String "'">
	//   64  149:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   65  152:pop             
		s1 = Base64.encodeToString(g, 3);
	//   66  153:aload_0         
	//   67  154:getfield        #53  <Field byte[] g>
	//   68  157:iconst_3        
	//   69  158:invokestatic    #138 <Method String Base64.encodeToString(byte[], int)>
	//   70  161:astore_2        
		  goto _L10
	//*  71  162:goto            177
_L5:
		stringbuilder.append("'");
	//   72  165:aload_3         
	//   73  166:ldc1            #132 <String "'">
	//   74  168:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   75  171:pop             
		s1 = f;
	//   76  172:aload_0         
	//   77  173:getfield        #51  <Field String f>
	//   78  176:astore_2        
_L10:
		stringbuilder.append(s1);
	//   79  177:aload_3         
	//   80  178:aload_2         
	//   81  179:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   82  182:pop             
		s1 = "'";
	//   83  183:ldc1            #132 <String "'">
	//   84  185:astore_2        
_L9:
		stringbuilder.append(s1);
	//   85  186:aload_3         
	//   86  187:aload_2         
	//   87  188:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//   88  191:pop             
		break; /* Loop/switch isn't completed */
	//   89  192:goto            228
_L4:
		stringbuilder.append(e);
	//   90  195:aload_3         
	//   91  196:aload_0         
	//   92  197:getfield        #49  <Field double e>
	//   93  200:invokevirtual   #141 <Method StringBuilder StringBuilder.append(double)>
	//   94  203:pop             
		break; /* Loop/switch isn't completed */
	//   95  204:goto            228
_L3:
		stringbuilder.append(d);
	//   96  207:aload_3         
	//   97  208:aload_0         
	//   98  209:getfield        #47  <Field boolean d>
	//   99  212:invokevirtual   #144 <Method StringBuilder StringBuilder.append(boolean)>
	//  100  215:pop             
		break; /* Loop/switch isn't completed */
	//  101  216:goto            228
_L2:
		stringbuilder.append(c);
	//  102  219:aload_3         
	//  103  220:aload_0         
	//  104  221:getfield        #45  <Field long c>
	//  105  224:invokevirtual   #147 <Method StringBuilder StringBuilder.append(long)>
	//  106  227:pop             
		stringbuilder.append(", ");
	//  107  228:aload_3         
	//  108  229:ldc1            #118 <String ", ">
	//  109  231:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  110  234:pop             
		stringbuilder.append(h);
	//  111  235:aload_3         
	//  112  236:aload_0         
	//  113  237:getfield        #55  <Field int h>
	//  114  240:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//  115  243:pop             
		stringbuilder.append(", ");
	//  116  244:aload_3         
	//  117  245:ldc1            #118 <String ", ">
	//  118  247:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  119  250:pop             
		stringbuilder.append(b);
	//  120  251:aload_3         
	//  121  252:aload_0         
	//  122  253:getfield        #57  <Field int b>
	//  123  256:invokevirtual   #81  <Method StringBuilder StringBuilder.append(int)>
	//  124  259:pop             
		stringbuilder.append(")");
	//  125  260:aload_3         
	//  126  261:ldc1            #149 <String ")">
	//  127  263:invokevirtual   #78  <Method StringBuilder StringBuilder.append(String)>
	//  128  266:pop             
		return stringbuilder.toString();
	//  129  267:aload_3         
	//  130  268:invokevirtual   #87  <Method String StringBuilder.toString()>
	//  131  271:areturn         
	}

	public final void writeToParcel(Parcel parcel, int k)
	{
		k = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #156 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, a, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #43  <Field String a>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #159 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, c);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #45  <Field long c>
	//   13   21:invokestatic    #162 <Method void c.a(Parcel, int, long)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, d);
	//   14   24:aload_1         
	//   15   25:iconst_4        
	//   16   26:aload_0         
	//   17   27:getfield        #47  <Field boolean d>
	//   18   30:invokestatic    #165 <Method void c.a(Parcel, int, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, e);
	//   19   33:aload_1         
	//   20   34:iconst_5        
	//   21   35:aload_0         
	//   22   36:getfield        #49  <Field double e>
	//   23   39:invokestatic    #168 <Method void c.a(Parcel, int, double)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, f, false);
	//   24   42:aload_1         
	//   25   43:bipush          6
	//   26   45:aload_0         
	//   27   46:getfield        #51  <Field String f>
	//   28   49:iconst_0        
	//   29   50:invokestatic    #159 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, g, false);
	//   30   53:aload_1         
	//   31   54:bipush          7
	//   32   56:aload_0         
	//   33   57:getfield        #53  <Field byte[] g>
	//   34   60:iconst_0        
	//   35   61:invokestatic    #171 <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, h);
	//   36   64:aload_1         
	//   37   65:bipush          8
	//   38   67:aload_0         
	//   39   68:getfield        #55  <Field int h>
	//   40   71:invokestatic    #174 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, b);
	//   41   74:aload_1         
	//   42   75:bipush          9
	//   43   77:aload_0         
	//   44   78:getfield        #57  <Field int b>
	//   45   81:invokestatic    #174 <Method void c.a(Parcel, int, int)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, k);
	//   46   84:aload_1         
	//   47   85:iload_2         
	//   48   86:invokestatic    #176 <Method void c.a(Parcel, int)>
	//   49   89:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new j();
	private static final Comparator i = new i();
	public final String a;
	public final int b;
	private final long c;
	private final boolean d;
	private final double e;
	private final String f;
	private final byte g[];
	private final int h;

	static 
	{
	//    0    0:new             #28  <Class j>
	//    1    3:dup             
	//    2    4:invokespecial   #31  <Method void j()>
	//    3    7:putstatic       #33  <Field android.os.Parcelable$Creator CREATOR>
	//    4   10:new             #35  <Class i>
	//    5   13:dup             
	//    6   14:invokespecial   #36  <Method void i()>
	//    7   17:putstatic       #38  <Field Comparator i>
	//*   8   20:return          
	}
}
