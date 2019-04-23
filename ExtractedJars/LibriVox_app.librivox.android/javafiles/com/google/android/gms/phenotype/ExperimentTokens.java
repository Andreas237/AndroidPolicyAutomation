// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.phenotype;

import android.os.Parcel;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.c;
import java.util.*;

// Referenced classes of package com.google.android.gms.phenotype:
//			h, d, e, f, 
//			g, m, a

public class ExperimentTokens extends AbstractSafeParcelable
{

	public ExperimentTokens(String s, byte abyte0[], byte abyte1[][], byte abyte2[][], byte abyte3[][], byte abyte4[][], int ai[], 
			byte abyte5[][])
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #67  <Method void AbstractSafeParcelable()>
		c = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #69  <Field String c>
		d = abyte0;
	//    5    9:aload_0         
	//    6   10:aload_2         
	//    7   11:putfield        #71  <Field byte[] d>
		e = abyte1;
	//    8   14:aload_0         
	//    9   15:aload_3         
	//   10   16:putfield        #73  <Field byte[][] e>
		f = abyte2;
	//   11   19:aload_0         
	//   12   20:aload           4
	//   13   22:putfield        #75  <Field byte[][] f>
		g = abyte3;
	//   14   25:aload_0         
	//   15   26:aload           5
	//   16   28:putfield        #77  <Field byte[][] g>
		h = abyte4;
	//   17   31:aload_0         
	//   18   32:aload           6
	//   19   34:putfield        #79  <Field byte[][] h>
		i = ai;
	//   20   37:aload_0         
	//   21   38:aload           7
	//   22   40:putfield        #81  <Field int[] i>
		j = abyte5;
	//   23   43:aload_0         
	//   24   44:aload           8
	//   25   46:putfield        #83  <Field byte[][] j>
	//   26   49:return          
	}

	private static List a(int ai[])
	{
		if(ai == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return Collections.emptyList();
	//    2    4:invokestatic    #90  <Method List Collections.emptyList()>
	//    3    7:areturn         
		ArrayList arraylist = new ArrayList(ai.length);
	//    4    8:new             #92  <Class ArrayList>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:arraylength     
	//    8   14:invokespecial   #95  <Method void ArrayList(int)>
	//    9   17:astore_3        
		int j1 = ai.length;
	//   10   18:aload_0         
	//   11   19:arraylength     
	//   12   20:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  13   21:iconst_0        
	//*  14   22:istore_1        
	//*  15   23:iload_1         
	//*  16   24:iload_2         
	//*  17   25:icmpge          48
			((List) (arraylist)).add(((Object) (Integer.valueOf(ai[i1]))));
	//   18   28:aload_3         
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:iaload          
	//   22   32:invokestatic    #101 <Method Integer Integer.valueOf(int)>
	//   23   35:invokeinterface #107 <Method boolean List.add(Object)>
	//   24   40:pop             

	//   25   41:iload_1         
	//   26   42:iconst_1        
	//   27   43:iadd            
	//   28   44:istore_1        
	//*  29   45:goto            23
		Collections.sort(((List) (arraylist)));
	//   30   48:aload_3         
	//   31   49:invokestatic    #111 <Method void Collections.sort(List)>
		return ((List) (arraylist));
	//   32   52:aload_3         
	//   33   53:areturn         
	}

	private static List a(byte abyte0[][])
	{
		if(abyte0 == null)
	//*   0    0:aload_0         
	//*   1    1:ifnonnull       8
			return Collections.emptyList();
	//    2    4:invokestatic    #90  <Method List Collections.emptyList()>
	//    3    7:areturn         
		ArrayList arraylist = new ArrayList(abyte0.length);
	//    4    8:new             #92  <Class ArrayList>
	//    5   11:dup             
	//    6   12:aload_0         
	//    7   13:arraylength     
	//    8   14:invokespecial   #95  <Method void ArrayList(int)>
	//    9   17:astore_3        
		int j1 = abyte0.length;
	//   10   18:aload_0         
	//   11   19:arraylength     
	//   12   20:istore_2        
		for(int i1 = 0; i1 < j1; i1++)
	//*  13   21:iconst_0        
	//*  14   22:istore_1        
	//*  15   23:iload_1         
	//*  16   24:iload_2         
	//*  17   25:icmpge          49
			((List) (arraylist)).add(((Object) (Base64.encodeToString(abyte0[i1], 3))));
	//   18   28:aload_3         
	//   19   29:aload_0         
	//   20   30:iload_1         
	//   21   31:aaload          
	//   22   32:iconst_3        
	//   23   33:invokestatic    #118 <Method String Base64.encodeToString(byte[], int)>
	//   24   36:invokeinterface #107 <Method boolean List.add(Object)>
	//   25   41:pop             

	//   26   42:iload_1         
	//   27   43:iconst_1        
	//   28   44:iadd            
	//   29   45:istore_1        
	//*  30   46:goto            23
		Collections.sort(((List) (arraylist)));
	//   31   49:aload_3         
	//   32   50:invokestatic    #111 <Method void Collections.sort(List)>
		return ((List) (arraylist));
	//   33   53:aload_3         
	//   34   54:areturn         
	}

	private static void a(StringBuilder stringbuilder, String s, byte abyte0[][])
	{
		stringbuilder.append(s);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    3    5:pop             
		stringbuilder.append("=");
	//    4    6:aload_0         
	//    5    7:ldc1            #127 <String "=">
	//    6    9:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    7   12:pop             
		if(abyte0 == null)
	//*   8   13:aload_2         
	//*   9   14:ifnonnull       27
		{
			s = "null";
	//   10   17:ldc1            #129 <String "null">
	//   11   19:astore_1        
		} else
	//*  12   20:aload_0         
	//*  13   21:aload_1         
	//*  14   22:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//*  15   25:pop             
	//*  16   26:return          
		{
			stringbuilder.append("(");
	//   17   27:aload_0         
	//   18   28:ldc1            #131 <String "(">
	//   19   30:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   20   33:pop             
			int j1 = abyte0.length;
	//   21   34:aload_2         
	//   22   35:arraylength     
	//   23   36:istore          5
			int i1 = 0;
	//   24   38:iconst_0        
	//   25   39:istore_3        
			for(boolean flag = true; i1 < j1; flag = false)
	//*  26   40:iconst_1        
	//*  27   41:istore          4
	//*  28   43:iload_3         
	//*  29   44:iload           5
	//*  30   46:icmpge          99
			{
				s = ((String) (abyte0[i1]));
	//   31   49:aload_2         
	//   32   50:iload_3         
	//   33   51:aaload          
	//   34   52:astore_1        
				if(!flag)
	//*  35   53:iload           4
	//*  36   55:ifne            65
					stringbuilder.append(", ");
	//   37   58:aload_0         
	//   38   59:ldc1            #133 <String ", ">
	//   39   61:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   40   64:pop             
				stringbuilder.append("'");
	//   41   65:aload_0         
	//   42   66:ldc1            #135 <String "'">
	//   43   68:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   44   71:pop             
				stringbuilder.append(Base64.encodeToString(((byte []) (s)), 3));
	//   45   72:aload_0         
	//   46   73:aload_1         
	//   47   74:iconst_3        
	//   48   75:invokestatic    #118 <Method String Base64.encodeToString(byte[], int)>
	//   49   78:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   50   81:pop             
				stringbuilder.append("'");
	//   51   82:aload_0         
	//   52   83:ldc1            #135 <String "'">
	//   53   85:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   54   88:pop             
				i1++;
	//   55   89:iload_3         
	//   56   90:iconst_1        
	//   57   91:iadd            
	//   58   92:istore_3        
			}

	//   59   93:iconst_0        
	//   60   94:istore          4
	//*  61   96:goto            43
			s = ")";
	//   62   99:ldc1            #137 <String ")">
	//   63  101:astore_1        
		}
		stringbuilder.append(s);
	//*  64  102:goto            20
	}

	public boolean equals(Object obj)
	{
		if(obj instanceof ExperimentTokens)
	//*   0    0:aload_1         
	//*   1    1:instanceof      #2   <Class ExperimentTokens>
	//*   2    4:ifeq            162
		{
			obj = ((Object) ((ExperimentTokens)obj));
	//    3    7:aload_1         
	//    4    8:checkcast       #2   <Class ExperimentTokens>
	//    5   11:astore_1        
			if(com.google.android.gms.phenotype.m.a(((Object) (c)), ((Object) (((ExperimentTokens) (obj)).c))) && Arrays.equals(d, ((ExperimentTokens) (obj)).d) && com.google.android.gms.phenotype.m.a(((Object) (a(e))), ((Object) (a(((ExperimentTokens) (obj)).e)))) && com.google.android.gms.phenotype.m.a(((Object) (a(f))), ((Object) (a(((ExperimentTokens) (obj)).f)))) && com.google.android.gms.phenotype.m.a(((Object) (a(g))), ((Object) (a(((ExperimentTokens) (obj)).g)))) && com.google.android.gms.phenotype.m.a(((Object) (a(h))), ((Object) (a(((ExperimentTokens) (obj)).h)))) && com.google.android.gms.phenotype.m.a(((Object) (a(i))), ((Object) (a(((ExperimentTokens) (obj)).i)))) && com.google.android.gms.phenotype.m.a(((Object) (a(j))), ((Object) (a(((ExperimentTokens) (obj)).j)))))
	//*   6   12:aload_0         
	//*   7   13:getfield        #69  <Field String c>
	//*   8   16:aload_1         
	//*   9   17:getfield        #69  <Field String c>
	//*  10   20:invokestatic    #143 <Method boolean m.a(Object, Object)>
	//*  11   23:ifeq            162
	//*  12   26:aload_0         
	//*  13   27:getfield        #71  <Field byte[] d>
	//*  14   30:aload_1         
	//*  15   31:getfield        #71  <Field byte[] d>
	//*  16   34:invokestatic    #148 <Method boolean Arrays.equals(byte[], byte[])>
	//*  17   37:ifeq            162
	//*  18   40:aload_0         
	//*  19   41:getfield        #73  <Field byte[][] e>
	//*  20   44:invokestatic    #150 <Method List a(byte[][])>
	//*  21   47:aload_1         
	//*  22   48:getfield        #73  <Field byte[][] e>
	//*  23   51:invokestatic    #150 <Method List a(byte[][])>
	//*  24   54:invokestatic    #143 <Method boolean m.a(Object, Object)>
	//*  25   57:ifeq            162
	//*  26   60:aload_0         
	//*  27   61:getfield        #75  <Field byte[][] f>
	//*  28   64:invokestatic    #150 <Method List a(byte[][])>
	//*  29   67:aload_1         
	//*  30   68:getfield        #75  <Field byte[][] f>
	//*  31   71:invokestatic    #150 <Method List a(byte[][])>
	//*  32   74:invokestatic    #143 <Method boolean m.a(Object, Object)>
	//*  33   77:ifeq            162
	//*  34   80:aload_0         
	//*  35   81:getfield        #77  <Field byte[][] g>
	//*  36   84:invokestatic    #150 <Method List a(byte[][])>
	//*  37   87:aload_1         
	//*  38   88:getfield        #77  <Field byte[][] g>
	//*  39   91:invokestatic    #150 <Method List a(byte[][])>
	//*  40   94:invokestatic    #143 <Method boolean m.a(Object, Object)>
	//*  41   97:ifeq            162
	//*  42  100:aload_0         
	//*  43  101:getfield        #79  <Field byte[][] h>
	//*  44  104:invokestatic    #150 <Method List a(byte[][])>
	//*  45  107:aload_1         
	//*  46  108:getfield        #79  <Field byte[][] h>
	//*  47  111:invokestatic    #150 <Method List a(byte[][])>
	//*  48  114:invokestatic    #143 <Method boolean m.a(Object, Object)>
	//*  49  117:ifeq            162
	//*  50  120:aload_0         
	//*  51  121:getfield        #81  <Field int[] i>
	//*  52  124:invokestatic    #152 <Method List a(int[])>
	//*  53  127:aload_1         
	//*  54  128:getfield        #81  <Field int[] i>
	//*  55  131:invokestatic    #152 <Method List a(int[])>
	//*  56  134:invokestatic    #143 <Method boolean m.a(Object, Object)>
	//*  57  137:ifeq            162
	//*  58  140:aload_0         
	//*  59  141:getfield        #83  <Field byte[][] j>
	//*  60  144:invokestatic    #150 <Method List a(byte[][])>
	//*  61  147:aload_1         
	//*  62  148:getfield        #83  <Field byte[][] j>
	//*  63  151:invokestatic    #150 <Method List a(byte[][])>
	//*  64  154:invokestatic    #143 <Method boolean m.a(Object, Object)>
	//*  65  157:ifeq            162
				return true;
	//   66  160:iconst_1        
	//   67  161:ireturn         
		}
		return false;
	//   68  162:iconst_0        
	//   69  163:ireturn         
	}

	public String toString()
	{
		StringBuilder stringbuilder = new StringBuilder("ExperimentTokens");
	//    0    0:new             #121 <Class StringBuilder>
	//    1    3:dup             
	//    2    4:ldc1            #156 <String "ExperimentTokens">
	//    3    6:invokespecial   #159 <Method void StringBuilder(String)>
	//    4    9:astore          6
		stringbuilder.append("(");
	//    5   11:aload           6
	//    6   13:ldc1            #131 <String "(">
	//    7   15:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//    8   18:pop             
		Object obj = ((Object) (c));
	//    9   19:aload_0         
	//   10   20:getfield        #69  <Field String c>
	//   11   23:astore          5
		if(obj == null)
	//*  12   25:aload           5
	//*  13   27:ifnonnull       37
		{
			obj = "null";
	//   14   30:ldc1            #129 <String "null">
	//   15   32:astore          5
		} else
	//*  16   34:goto            87
		{
			StringBuilder stringbuilder1 = new StringBuilder(String.valueOf(obj).length() + 2);
	//   17   37:new             #121 <Class StringBuilder>
	//   18   40:dup             
	//   19   41:aload           5
	//   20   43:invokestatic    #164 <Method String String.valueOf(Object)>
	//   21   46:invokevirtual   #168 <Method int String.length()>
	//   22   49:iconst_2        
	//   23   50:iadd            
	//   24   51:invokespecial   #169 <Method void StringBuilder(int)>
	//   25   54:astore          7
			stringbuilder1.append("'");
	//   26   56:aload           7
	//   27   58:ldc1            #135 <String "'">
	//   28   60:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   29   63:pop             
			stringbuilder1.append(((String) (obj)));
	//   30   64:aload           7
	//   31   66:aload           5
	//   32   68:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   33   71:pop             
			stringbuilder1.append("'");
	//   34   72:aload           7
	//   35   74:ldc1            #135 <String "'">
	//   36   76:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   37   79:pop             
			obj = ((Object) (stringbuilder1.toString()));
	//   38   80:aload           7
	//   39   82:invokevirtual   #171 <Method String StringBuilder.toString()>
	//   40   85:astore          5
		}
		stringbuilder.append(((String) (obj)));
	//   41   87:aload           6
	//   42   89:aload           5
	//   43   91:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   44   94:pop             
		stringbuilder.append(", ");
	//   45   95:aload           6
	//   46   97:ldc1            #133 <String ", ">
	//   47   99:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   48  102:pop             
		obj = ((Object) (d));
	//   49  103:aload_0         
	//   50  104:getfield        #71  <Field byte[] d>
	//   51  107:astore          5
		stringbuilder.append("direct");
	//   52  109:aload           6
	//   53  111:ldc1            #173 <String "direct">
	//   54  113:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   55  116:pop             
		stringbuilder.append("=");
	//   56  117:aload           6
	//   57  119:ldc1            #127 <String "=">
	//   58  121:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   59  124:pop             
		if(obj == null)
	//*  60  125:aload           5
	//*  61  127:ifnonnull       137
		{
			obj = "null";
	//   62  130:ldc1            #129 <String "null">
	//   63  132:astore          5
		} else
	//*  64  134:goto            161
		{
			stringbuilder.append("'");
	//   65  137:aload           6
	//   66  139:ldc1            #135 <String "'">
	//   67  141:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   68  144:pop             
			stringbuilder.append(Base64.encodeToString(((byte []) (obj)), 3));
	//   69  145:aload           6
	//   70  147:aload           5
	//   71  149:iconst_3        
	//   72  150:invokestatic    #118 <Method String Base64.encodeToString(byte[], int)>
	//   73  153:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   74  156:pop             
			obj = "'";
	//   75  157:ldc1            #135 <String "'">
	//   76  159:astore          5
		}
		stringbuilder.append(((String) (obj)));
	//   77  161:aload           6
	//   78  163:aload           5
	//   79  165:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   80  168:pop             
		stringbuilder.append(", ");
	//   81  169:aload           6
	//   82  171:ldc1            #133 <String ", ">
	//   83  173:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   84  176:pop             
		a(stringbuilder, "GAIA", e);
	//   85  177:aload           6
	//   86  179:ldc1            #175 <String "GAIA">
	//   87  181:aload_0         
	//   88  182:getfield        #73  <Field byte[][] e>
	//   89  185:invokestatic    #177 <Method void a(StringBuilder, String, byte[][])>
		stringbuilder.append(", ");
	//   90  188:aload           6
	//   91  190:ldc1            #133 <String ", ">
	//   92  192:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//   93  195:pop             
		a(stringbuilder, "PSEUDO", f);
	//   94  196:aload           6
	//   95  198:ldc1            #179 <String "PSEUDO">
	//   96  200:aload_0         
	//   97  201:getfield        #75  <Field byte[][] f>
	//   98  204:invokestatic    #177 <Method void a(StringBuilder, String, byte[][])>
		stringbuilder.append(", ");
	//   99  207:aload           6
	//  100  209:ldc1            #133 <String ", ">
	//  101  211:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  102  214:pop             
		a(stringbuilder, "ALWAYS", g);
	//  103  215:aload           6
	//  104  217:ldc1            #181 <String "ALWAYS">
	//  105  219:aload_0         
	//  106  220:getfield        #77  <Field byte[][] g>
	//  107  223:invokestatic    #177 <Method void a(StringBuilder, String, byte[][])>
		stringbuilder.append(", ");
	//  108  226:aload           6
	//  109  228:ldc1            #133 <String ", ">
	//  110  230:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  111  233:pop             
		a(stringbuilder, "OTHER", h);
	//  112  234:aload           6
	//  113  236:ldc1            #183 <String "OTHER">
	//  114  238:aload_0         
	//  115  239:getfield        #79  <Field byte[][] h>
	//  116  242:invokestatic    #177 <Method void a(StringBuilder, String, byte[][])>
		stringbuilder.append(", ");
	//  117  245:aload           6
	//  118  247:ldc1            #133 <String ", ">
	//  119  249:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  120  252:pop             
		obj = ((Object) (i));
	//  121  253:aload_0         
	//  122  254:getfield        #81  <Field int[] i>
	//  123  257:astore          5
		stringbuilder.append("weak");
	//  124  259:aload           6
	//  125  261:ldc1            #185 <String "weak">
	//  126  263:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  127  266:pop             
		stringbuilder.append("=");
	//  128  267:aload           6
	//  129  269:ldc1            #127 <String "=">
	//  130  271:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  131  274:pop             
		if(obj == null)
	//* 132  275:aload           5
	//* 133  277:ifnonnull       295
		{
			obj = "null";
	//  134  280:ldc1            #129 <String "null">
	//  135  282:astore          5
		} else
	//* 136  284:aload           6
	//* 137  286:aload           5
	//* 138  288:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//* 139  291:pop             
	//* 140  292:goto            358
		{
			stringbuilder.append("(");
	//  141  295:aload           6
	//  142  297:ldc1            #131 <String "(">
	//  143  299:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  144  302:pop             
			int j1 = obj.length;
	//  145  303:aload           5
	//  146  305:arraylength     
	//  147  306:istore_3        
			int i1 = 0;
	//  148  307:iconst_0        
	//  149  308:istore_1        
			for(boolean flag = true; i1 < j1; flag = false)
	//* 150  309:iconst_1        
	//* 151  310:istore_2        
	//* 152  311:iload_1         
	//* 153  312:iload_3         
	//* 154  313:icmpge          351
			{
				int k1 = obj[i1];
	//  155  316:aload           5
	//  156  318:iload_1         
	//  157  319:iaload          
	//  158  320:istore          4
				if(!flag)
	//* 159  322:iload_2         
	//* 160  323:ifne            334
					stringbuilder.append(", ");
	//  161  326:aload           6
	//  162  328:ldc1            #133 <String ", ">
	//  163  330:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  164  333:pop             
				stringbuilder.append(k1);
	//  165  334:aload           6
	//  166  336:iload           4
	//  167  338:invokevirtual   #188 <Method StringBuilder StringBuilder.append(int)>
	//  168  341:pop             
				i1++;
	//  169  342:iload_1         
	//  170  343:iconst_1        
	//  171  344:iadd            
	//  172  345:istore_1        
			}

	//  173  346:iconst_0        
	//  174  347:istore_2        
	//* 175  348:goto            311
			obj = ")";
	//  176  351:ldc1            #137 <String ")">
	//  177  353:astore          5
		}
		stringbuilder.append(((String) (obj)));
	//* 178  355:goto            284
		stringbuilder.append(", ");
	//  179  358:aload           6
	//  180  360:ldc1            #133 <String ", ">
	//  181  362:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  182  365:pop             
		a(stringbuilder, "directs", j);
	//  183  366:aload           6
	//  184  368:ldc1            #190 <String "directs">
	//  185  370:aload_0         
	//  186  371:getfield        #83  <Field byte[][] j>
	//  187  374:invokestatic    #177 <Method void a(StringBuilder, String, byte[][])>
		stringbuilder.append(")");
	//  188  377:aload           6
	//  189  379:ldc1            #137 <String ")">
	//  190  381:invokevirtual   #125 <Method StringBuilder StringBuilder.append(String)>
	//  191  384:pop             
		return stringbuilder.toString();
	//  192  385:aload           6
	//  193  387:invokevirtual   #171 <Method String StringBuilder.toString()>
	//  194  390:areturn         
	}

	public void writeToParcel(Parcel parcel, int i1)
	{
		i1 = com.google.android.gms.common.internal.safeparcel.c.a(parcel);
	//    0    0:aload_1         
	//    1    1:invokestatic    #197 <Method int c.a(Parcel)>
	//    2    4:istore_2        
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 2, c, false);
	//    3    5:aload_1         
	//    4    6:iconst_2        
	//    5    7:aload_0         
	//    6    8:getfield        #69  <Field String c>
	//    7   11:iconst_0        
	//    8   12:invokestatic    #200 <Method void c.a(Parcel, int, String, boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 3, d, false);
	//    9   15:aload_1         
	//   10   16:iconst_3        
	//   11   17:aload_0         
	//   12   18:getfield        #71  <Field byte[] d>
	//   13   21:iconst_0        
	//   14   22:invokestatic    #203 <Method void c.a(Parcel, int, byte[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 4, e, false);
	//   15   25:aload_1         
	//   16   26:iconst_4        
	//   17   27:aload_0         
	//   18   28:getfield        #73  <Field byte[][] e>
	//   19   31:iconst_0        
	//   20   32:invokestatic    #206 <Method void c.a(Parcel, int, byte[][], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 5, f, false);
	//   21   35:aload_1         
	//   22   36:iconst_5        
	//   23   37:aload_0         
	//   24   38:getfield        #75  <Field byte[][] f>
	//   25   41:iconst_0        
	//   26   42:invokestatic    #206 <Method void c.a(Parcel, int, byte[][], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 6, g, false);
	//   27   45:aload_1         
	//   28   46:bipush          6
	//   29   48:aload_0         
	//   30   49:getfield        #77  <Field byte[][] g>
	//   31   52:iconst_0        
	//   32   53:invokestatic    #206 <Method void c.a(Parcel, int, byte[][], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 7, h, false);
	//   33   56:aload_1         
	//   34   57:bipush          7
	//   35   59:aload_0         
	//   36   60:getfield        #79  <Field byte[][] h>
	//   37   63:iconst_0        
	//   38   64:invokestatic    #206 <Method void c.a(Parcel, int, byte[][], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 8, i, false);
	//   39   67:aload_1         
	//   40   68:bipush          8
	//   41   70:aload_0         
	//   42   71:getfield        #81  <Field int[] i>
	//   43   74:iconst_0        
	//   44   75:invokestatic    #209 <Method void c.a(Parcel, int, int[], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, 9, j, false);
	//   45   78:aload_1         
	//   46   79:bipush          9
	//   47   81:aload_0         
	//   48   82:getfield        #83  <Field byte[][] j>
	//   49   85:iconst_0        
	//   50   86:invokestatic    #206 <Method void c.a(Parcel, int, byte[][], boolean)>
		com.google.android.gms.common.internal.safeparcel.c.a(parcel, i1);
	//   51   89:aload_1         
	//   52   90:iload_2         
	//   53   91:invokestatic    #211 <Method void c.a(Parcel, int)>
	//   54   94:return          
	}

	public static final android.os.Parcelable.Creator CREATOR = new h();
	private static final byte a[][];
	private static final ExperimentTokens b;
	private static final a k = new d();
	private static final a l = new e();
	private static final a m = new f();
	private static final a n = new g();
	private final String c;
	private final byte d[];
	private final byte e[][];
	private final byte f[][];
	private final byte g[][];
	private final byte h[][];
	private final int i[];
	private final byte j[][];

	static 
	{
	//    0    0:new             #30  <Class h>
	//    1    3:dup             
	//    2    4:invokespecial   #33  <Method void h()>
	//    3    7:putstatic       #35  <Field android.os.Parcelable$Creator CREATOR>
		a = new byte[0][];
	//    4   10:iconst_0        
	//    5   11:anewarray       byte[][]
	//    6   14:putstatic       #38  <Field byte[][] a>
		byte abyte0[][] = a;
	//    7   17:getstatic       #38  <Field byte[][] a>
	//    8   20:astore_0        
		b = new ExperimentTokens("", ((byte []) (null)), abyte0, abyte0, abyte0, abyte0, ((int []) (null)), ((byte [][]) (null)));
	//    9   21:new             #2   <Class ExperimentTokens>
	//   10   24:dup             
	//   11   25:ldc1            #40  <String "">
	//   12   27:aconst_null     
	//   13   28:aload_0         
	//   14   29:aload_0         
	//   15   30:aload_0         
	//   16   31:aload_0         
	//   17   32:aconst_null     
	//   18   33:aconst_null     
	//   19   34:invokespecial   #43  <Method void ExperimentTokens(String, byte[], byte[][], byte[][], byte[][], byte[][], int[], byte[][])>
	//   20   37:putstatic       #45  <Field ExperimentTokens b>
	//   21   40:new             #47  <Class d>
	//   22   43:dup             
	//   23   44:invokespecial   #48  <Method void d()>
	//   24   47:putstatic       #50  <Field a k>
	//   25   50:new             #52  <Class e>
	//   26   53:dup             
	//   27   54:invokespecial   #53  <Method void e()>
	//   28   57:putstatic       #55  <Field a l>
	//   29   60:new             #57  <Class f>
	//   30   63:dup             
	//   31   64:invokespecial   #58  <Method void f()>
	//   32   67:putstatic       #60  <Field a m>
	//   33   70:new             #62  <Class g>
	//   34   73:dup             
	//   35   74:invokespecial   #63  <Method void g()>
	//   36   77:putstatic       #65  <Field a n>
	//*  37   80:return          
	}
}
