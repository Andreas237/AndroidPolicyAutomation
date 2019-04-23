// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal.ads:
//			bnf

public final class bmp
{

	public bmp(Uri uri)
	{
		this(uri, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:iconst_0        
	//    3    3:invokespecial   #21  <Method void bmp(Uri, int)>
	//    4    6:return          
	}

	public bmp(Uri uri, int i)
	{
		this(uri, 0L, -1L, ((String) (null)), i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lconst_0        
	//    3    3:ldc2w           #23  <Long -1L>
	//    4    6:aconst_null     
	//    5    7:iload_2         
	//    6    8:invokespecial   #27  <Method void bmp(Uri, long, long, String, int)>
	//    7   11:return          
	}

	private bmp(Uri uri, long l, long l1, long l2, 
			String s, int i)
	{
		this(uri, ((byte []) (null)), l, l1, l2, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:aconst_null     
	//    3    3:lload_2         
	//    4    4:lload           4
	//    5    6:lload           6
	//    6    8:aload           8
	//    7   10:iload           9
	//    8   12:invokespecial   #31  <Method void bmp(Uri, byte[], long, long, long, String, int)>
	//    9   15:return          
	}

	public bmp(Uri uri, long l, long l1, String s)
	{
		this(uri, l, l, l1, s, 0);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload_2         
	//    4    4:lload           4
	//    5    6:aload           6
	//    6    8:iconst_0        
	//    7    9:invokespecial   #34  <Method void bmp(Uri, long, long, long, String, int)>
	//    8   12:return          
	}

	public bmp(Uri uri, long l, long l1, String s, int i)
	{
		this(uri, l, l, l1, s, i);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:lload_2         
	//    3    3:lload_2         
	//    4    4:lload           4
	//    5    6:aload           6
	//    6    8:iload           7
	//    7   10:invokespecial   #34  <Method void bmp(Uri, long, long, long, String, int)>
	//    8   13:return          
	}

	public bmp(Uri uri, byte abyte0[], long l, long l1, long l2, String s, int i)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #37  <Method void Object()>
		boolean flag1 = true;
	//    2    4:iconst_1        
	//    3    5:istore          12
		boolean flag;
		if(l >= 0L)
	//*   4    7:lload_3         
	//*   5    8:lconst_0        
	//*   6    9:lcmp            
	//*   7   10:iflt            19
			flag = true;
	//    8   13:iconst_1        
	//    9   14:istore          11
		else
	//*  10   16:goto            22
			flag = false;
	//   11   19:iconst_0        
	//   12   20:istore          11
		bnf.a(flag);
	//   13   22:iload           11
	//   14   24:invokestatic    #42  <Method void bnf.a(boolean)>
		if(l1 >= 0L)
	//*  15   27:lload           5
	//*  16   29:lconst_0        
	//*  17   30:lcmp            
	//*  18   31:iflt            40
			flag = true;
	//   19   34:iconst_1        
	//   20   35:istore          11
		else
	//*  21   37:goto            43
			flag = false;
	//   22   40:iconst_0        
	//   23   41:istore          11
		bnf.a(flag);
	//   24   43:iload           11
	//   25   45:invokestatic    #42  <Method void bnf.a(boolean)>
		flag = flag1;
	//   26   48:iload           12
	//   27   50:istore          11
		if(l2 <= 0L)
	//*  28   52:lload           7
	//*  29   54:lconst_0        
	//*  30   55:lcmp            
	//*  31   56:ifgt            78
			if(l2 == -1L)
	//*  32   59:lload           7
	//*  33   61:ldc2w           #23  <Long -1L>
	//*  34   64:lcmp            
	//*  35   65:ifne            75
				flag = flag1;
	//   36   68:iload           12
	//   37   70:istore          11
			else
	//*  38   72:goto            78
				flag = false;
	//   39   75:iconst_0        
	//   40   76:istore          11
		bnf.a(flag);
	//   41   78:iload           11
	//   42   80:invokestatic    #42  <Method void bnf.a(boolean)>
		a = uri;
	//   43   83:aload_0         
	//   44   84:aload_1         
	//   45   85:putfield        #44  <Field Uri a>
		b = abyte0;
	//   46   88:aload_0         
	//   47   89:aload_2         
	//   48   90:putfield        #46  <Field byte[] b>
		c = l;
	//   49   93:aload_0         
	//   50   94:lload_3         
	//   51   95:putfield        #48  <Field long c>
		d = l1;
	//   52   98:aload_0         
	//   53   99:lload           5
	//   54  101:putfield        #50  <Field long d>
		e = l2;
	//   55  104:aload_0         
	//   56  105:lload           7
	//   57  107:putfield        #52  <Field long e>
		f = s;
	//   58  110:aload_0         
	//   59  111:aload           9
	//   60  113:putfield        #54  <Field String f>
		g = i;
	//   61  116:aload_0         
	//   62  117:iload           10
	//   63  119:putfield        #56  <Field int g>
	//   64  122:return          
	}

	public final boolean a(int i)
	{
		return (g & 1) == 1;
	//    0    0:aload_0         
	//    1    1:getfield        #56  <Field int g>
	//    2    4:iconst_1        
	//    3    5:iand            
	//    4    6:iconst_1        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final String toString()
	{
		String s = String.valueOf(((Object) (a)));
	//    0    0:aload_0         
	//    1    1:getfield        #44  <Field Uri a>
	//    2    4:invokestatic    #65  <Method String String.valueOf(Object)>
	//    3    7:astore          8
		String s1 = Arrays.toString(b);
	//    4    9:aload_0         
	//    5   10:getfield        #46  <Field byte[] b>
	//    6   13:invokestatic    #70  <Method String Arrays.toString(byte[])>
	//    7   16:astore          9
		long l = c;
	//    8   18:aload_0         
	//    9   19:getfield        #48  <Field long c>
	//   10   22:lstore_2        
		long l1 = d;
	//   11   23:aload_0         
	//   12   24:getfield        #50  <Field long d>
	//   13   27:lstore          4
		long l2 = e;
	//   14   29:aload_0         
	//   15   30:getfield        #52  <Field long e>
	//   16   33:lstore          6
		String s2 = f;
	//   17   35:aload_0         
	//   18   36:getfield        #54  <Field String f>
	//   19   39:astore          10
		int i = g;
	//   20   41:aload_0         
	//   21   42:getfield        #56  <Field int g>
	//   22   45:istore_1        
		StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s))).length() + 93 + String.valueOf(((Object) (s1))).length() + String.valueOf(((Object) (s2))).length());
	//   23   46:new             #72  <Class StringBuilder>
	//   24   49:dup             
	//   25   50:aload           8
	//   26   52:invokestatic    #65  <Method String String.valueOf(Object)>
	//   27   55:invokevirtual   #76  <Method int String.length()>
	//   28   58:bipush          93
	//   29   60:iadd            
	//   30   61:aload           9
	//   31   63:invokestatic    #65  <Method String String.valueOf(Object)>
	//   32   66:invokevirtual   #76  <Method int String.length()>
	//   33   69:iadd            
	//   34   70:aload           10
	//   35   72:invokestatic    #65  <Method String String.valueOf(Object)>
	//   36   75:invokevirtual   #76  <Method int String.length()>
	//   37   78:iadd            
	//   38   79:invokespecial   #79  <Method void StringBuilder(int)>
	//   39   82:astore          11
		stringbuilder.append("DataSpec[");
	//   40   84:aload           11
	//   41   86:ldc1            #81  <String "DataSpec[">
	//   42   88:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   43   91:pop             
		stringbuilder.append(s);
	//   44   92:aload           11
	//   45   94:aload           8
	//   46   96:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   47   99:pop             
		stringbuilder.append(", ");
	//   48  100:aload           11
	//   49  102:ldc1            #87  <String ", ">
	//   50  104:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   51  107:pop             
		stringbuilder.append(s1);
	//   52  108:aload           11
	//   53  110:aload           9
	//   54  112:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   55  115:pop             
		stringbuilder.append(", ");
	//   56  116:aload           11
	//   57  118:ldc1            #87  <String ", ">
	//   58  120:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   59  123:pop             
		stringbuilder.append(l);
	//   60  124:aload           11
	//   61  126:lload_2         
	//   62  127:invokevirtual   #90  <Method StringBuilder StringBuilder.append(long)>
	//   63  130:pop             
		stringbuilder.append(", ");
	//   64  131:aload           11
	//   65  133:ldc1            #87  <String ", ">
	//   66  135:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   67  138:pop             
		stringbuilder.append(l1);
	//   68  139:aload           11
	//   69  141:lload           4
	//   70  143:invokevirtual   #90  <Method StringBuilder StringBuilder.append(long)>
	//   71  146:pop             
		stringbuilder.append(", ");
	//   72  147:aload           11
	//   73  149:ldc1            #87  <String ", ">
	//   74  151:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   75  154:pop             
		stringbuilder.append(l2);
	//   76  155:aload           11
	//   77  157:lload           6
	//   78  159:invokevirtual   #90  <Method StringBuilder StringBuilder.append(long)>
	//   79  162:pop             
		stringbuilder.append(", ");
	//   80  163:aload           11
	//   81  165:ldc1            #87  <String ", ">
	//   82  167:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   83  170:pop             
		stringbuilder.append(s2);
	//   84  171:aload           11
	//   85  173:aload           10
	//   86  175:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   87  178:pop             
		stringbuilder.append(", ");
	//   88  179:aload           11
	//   89  181:ldc1            #87  <String ", ">
	//   90  183:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   91  186:pop             
		stringbuilder.append(i);
	//   92  187:aload           11
	//   93  189:iload_1         
	//   94  190:invokevirtual   #93  <Method StringBuilder StringBuilder.append(int)>
	//   95  193:pop             
		stringbuilder.append("]");
	//   96  194:aload           11
	//   97  196:ldc1            #95  <String "]">
	//   98  198:invokevirtual   #85  <Method StringBuilder StringBuilder.append(String)>
	//   99  201:pop             
		return stringbuilder.toString();
	//  100  202:aload           11
	//  101  204:invokevirtual   #97  <Method String StringBuilder.toString()>
	//  102  207:areturn         
	}

	public final Uri a;
	public final byte b[];
	public final long c;
	public final long d;
	public final long e;
	public final String f;
	public final int g;
}
