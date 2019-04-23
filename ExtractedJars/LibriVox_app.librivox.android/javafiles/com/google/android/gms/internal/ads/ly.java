// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.*;

// Referenced classes of package com.google.android.gms.internal.ads:
//			azi, bim, lg, ee, 
//			mx

final class ly
{

	ly(String s, azi azi1)
	{
		String s1 = azi1.b;
	//    0    0:aload_2         
	//    1    1:getfield        #21  <Field String azi.b>
	//    2    4:astore          12
		long l = azi1.c;
	//    3    6:aload_2         
	//    4    7:getfield        #23  <Field long azi.c>
	//    5   10:lstore_3        
		long l1 = azi1.d;
	//    6   11:aload_2         
	//    7   12:getfield        #25  <Field long azi.d>
	//    8   15:lstore          5
		long l2 = azi1.e;
	//    9   17:aload_2         
	//   10   18:getfield        #27  <Field long azi.e>
	//   11   21:lstore          7
		long l3 = azi1.f;
	//   12   23:aload_2         
	//   13   24:getfield        #29  <Field long azi.f>
	//   14   27:lstore          9
		Object obj;
		if(azi1.h != null)
	//*  15   29:aload_2         
	//*  16   30:getfield        #31  <Field List azi.h>
	//*  17   33:ifnull          45
		{
			obj = ((Object) (azi1.h));
	//   18   36:aload_2         
	//   19   37:getfield        #31  <Field List azi.h>
	//   20   40:astore          11
		} else
	//*  21   42:goto            141
		{
			Object obj1 = ((Object) (azi1.g));
	//   22   45:aload_2         
	//   23   46:getfield        #34  <Field Map azi.g>
	//   24   49:astore          13
			obj = ((Object) (new ArrayList(((Map) (obj1)).size())));
	//   25   51:new             #36  <Class ArrayList>
	//   26   54:dup             
	//   27   55:aload           13
	//   28   57:invokeinterface #42  <Method int Map.size()>
	//   29   62:invokespecial   #45  <Method void ArrayList(int)>
	//   30   65:astore          11
			java.util.Map.Entry entry;
			for(obj1 = ((Object) (((Map) (obj1)).entrySet().iterator())); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(((Object) (new bim((String)entry.getKey(), (String)entry.getValue())))))
	//*  31   67:aload           13
	//*  32   69:invokeinterface #49  <Method Set Map.entrySet()>
	//*  33   74:invokeinterface #55  <Method Iterator Set.iterator()>
	//*  34   79:astore          13
	//*  35   81:aload           13
	//*  36   83:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//*  37   88:ifeq            141
				entry = (java.util.Map.Entry)((Iterator) (obj1)).next();
	//   38   91:aload           13
	//   39   93:invokeinterface #65  <Method Object Iterator.next()>
	//   40   98:checkcast       #67  <Class java.util.Map$Entry>
	//   41  101:astore          14

	//   42  103:aload           11
	//   43  105:new             #69  <Class bim>
	//   44  108:dup             
	//   45  109:aload           14
	//   46  111:invokeinterface #72  <Method Object java.util.Map$Entry.getKey()>
	//   47  116:checkcast       #74  <Class String>
	//   48  119:aload           14
	//   49  121:invokeinterface #77  <Method Object java.util.Map$Entry.getValue()>
	//   50  126:checkcast       #74  <Class String>
	//   51  129:invokespecial   #80  <Method void bim(String, String)>
	//   52  132:invokeinterface #86  <Method boolean List.add(Object)>
	//   53  137:pop             
		}
	//*  54  138:goto            81
		this(s, s1, l, l1, l2, l3, ((List) (obj)));
	//   55  141:aload_0         
	//   56  142:aload_1         
	//   57  143:aload           12
	//   58  145:lload_3         
	//   59  146:lload           5
	//   60  148:lload           7
	//   61  150:lload           9
	//   62  152:aload           11
	//   63  154:invokespecial   #89  <Method void ly(String, String, long, long, long, long, List)>
		a = azi1.a.length;
	//   64  157:aload_0         
	//   65  158:aload_2         
	//   66  159:getfield        #92  <Field byte[] azi.a>
	//   67  162:arraylength     
	//   68  163:i2l             
	//   69  164:putfield        #94  <Field long a>
	//   70  167:return          
	}

	private ly(String s, String s1, long l, long l1, long l2, long l3, List list)
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #98  <Method void Object()>
		b = s;
	//    2    4:aload_0         
	//    3    5:aload_1         
	//    4    6:putfield        #99  <Field String b>
		s = s1;
	//    5    9:aload_2         
	//    6   10:astore_1        
		if("".equals(((Object) (s1))))
	//*   7   11:ldc1            #101 <String "">
	//*   8   13:aload_2         
	//*   9   14:invokevirtual   #104 <Method boolean String.equals(Object)>
	//*  10   17:ifeq            22
			s = null;
	//   11   20:aconst_null     
	//   12   21:astore_1        
		c = s;
	//   13   22:aload_0         
	//   14   23:aload_1         
	//   15   24:putfield        #106 <Field String c>
		d = l;
	//   16   27:aload_0         
	//   17   28:lload_3         
	//   18   29:putfield        #107 <Field long d>
		e = l1;
	//   19   32:aload_0         
	//   20   33:lload           5
	//   21   35:putfield        #108 <Field long e>
		f = l2;
	//   22   38:aload_0         
	//   23   39:lload           7
	//   24   41:putfield        #109 <Field long f>
		g = l3;
	//   25   44:aload_0         
	//   26   45:lload           9
	//   27   47:putfield        #111 <Field long g>
		h = list;
	//   28   50:aload_0         
	//   29   51:aload           11
	//   30   53:putfield        #112 <Field List h>
	//   31   56:return          
	}

	static ly a(mx mx)
	{
		if(lg.a(((java.io.InputStream) (mx))) == 0x20150306)
	//*   0    0:aload_0         
	//*   1    1:invokestatic    #118 <Method int lg.a(java.io.InputStream)>
	//*   2    4:ldc1            #119 <Int 0x20150306>
	//*   3    6:icmpne          45
			return new ly(lg.a(mx), lg.a(mx), lg.b(((java.io.InputStream) (mx))), lg.b(((java.io.InputStream) (mx))), lg.b(((java.io.InputStream) (mx))), lg.b(((java.io.InputStream) (mx))), lg.b(mx));
	//    4    9:new             #2   <Class ly>
	//    5   12:dup             
	//    6   13:aload_0         
	//    7   14:invokestatic    #122 <Method String lg.a(mx)>
	//    8   17:aload_0         
	//    9   18:invokestatic    #122 <Method String lg.a(mx)>
	//   10   21:aload_0         
	//   11   22:invokestatic    #125 <Method long lg.b(java.io.InputStream)>
	//   12   25:aload_0         
	//   13   26:invokestatic    #125 <Method long lg.b(java.io.InputStream)>
	//   14   29:aload_0         
	//   15   30:invokestatic    #125 <Method long lg.b(java.io.InputStream)>
	//   16   33:aload_0         
	//   17   34:invokestatic    #125 <Method long lg.b(java.io.InputStream)>
	//   18   37:aload_0         
	//   19   38:invokestatic    #128 <Method List lg.b(mx)>
	//   20   41:invokespecial   #89  <Method void ly(String, String, long, long, long, long, List)>
	//   21   44:areturn         
		else
			throw new IOException();
	//   22   45:new             #130 <Class IOException>
	//   23   48:dup             
	//   24   49:invokespecial   #131 <Method void IOException()>
	//   25   52:athrow          
	}

	final boolean a(OutputStream outputstream)
	{
		lg.a(outputstream, 0x20150306);
	//    0    0:aload_1         
	//    1    1:ldc1            #119 <Int 0x20150306>
	//    2    3:invokestatic    #135 <Method void lg.a(OutputStream, int)>
		lg.a(outputstream, b);
	//    3    6:aload_1         
	//    4    7:aload_0         
	//    5    8:getfield        #99  <Field String b>
	//    6   11:invokestatic    #138 <Method void lg.a(OutputStream, String)>
		Object obj;
		if(c == null)
	//*   7   14:aload_0         
	//*   8   15:getfield        #106 <Field String c>
	//*   9   18:ifnonnull       27
		{
			obj = "";
	//   10   21:ldc1            #101 <String "">
	//   11   23:astore_2        
			break MISSING_BLOCK_LABEL_32;
	//   12   24:goto            32
		}
		obj = ((Object) (c));
	//   13   27:aload_0         
	//   14   28:getfield        #106 <Field String c>
	//   15   31:astore_2        
		lg.a(outputstream, ((String) (obj)));
	//   16   32:aload_1         
	//   17   33:aload_2         
	//   18   34:invokestatic    #138 <Method void lg.a(OutputStream, String)>
		lg.a(outputstream, d);
	//   19   37:aload_1         
	//   20   38:aload_0         
	//   21   39:getfield        #107 <Field long d>
	//   22   42:invokestatic    #141 <Method void lg.a(OutputStream, long)>
		lg.a(outputstream, e);
	//   23   45:aload_1         
	//   24   46:aload_0         
	//   25   47:getfield        #108 <Field long e>
	//   26   50:invokestatic    #141 <Method void lg.a(OutputStream, long)>
		lg.a(outputstream, f);
	//   27   53:aload_1         
	//   28   54:aload_0         
	//   29   55:getfield        #109 <Field long f>
	//   30   58:invokestatic    #141 <Method void lg.a(OutputStream, long)>
		lg.a(outputstream, g);
	//   31   61:aload_1         
	//   32   62:aload_0         
	//   33   63:getfield        #111 <Field long g>
	//   34   66:invokestatic    #141 <Method void lg.a(OutputStream, long)>
		obj = ((Object) (h));
	//   35   69:aload_0         
	//   36   70:getfield        #112 <Field List h>
	//   37   73:astore_2        
		if(obj != null)
	//*  38   74:aload_2         
	//*  39   75:ifnull          133
		{
			try
			{
				lg.a(outputstream, ((List) (obj)).size());
	//   40   78:aload_1         
	//   41   79:aload_2         
	//   42   80:invokeinterface #142 <Method int List.size()>
	//   43   85:invokestatic    #135 <Method void lg.a(OutputStream, int)>
				bim bim1;
				for(obj = ((Object) (((List) (obj)).iterator())); ((Iterator) (obj)).hasNext(); lg.a(outputstream, bim1.b()))
	//*  44   88:aload_2         
	//*  45   89:invokeinterface #143 <Method Iterator List.iterator()>
	//*  46   94:astore_2        
	//*  47   95:aload_2         
	//*  48   96:invokeinterface #61  <Method boolean Iterator.hasNext()>
	//*  49  101:ifeq            138
				{
					bim1 = (bim)((Iterator) (obj)).next();
	//   50  104:aload_2         
	//   51  105:invokeinterface #65  <Method Object Iterator.next()>
	//   52  110:checkcast       #69  <Class bim>
	//   53  113:astore_3        
					lg.a(outputstream, bim1.a());
	//   54  114:aload_1         
	//   55  115:aload_3         
	//   56  116:invokevirtual   #146 <Method String bim.a()>
	//   57  119:invokestatic    #138 <Method void lg.a(OutputStream, String)>
				}

	//   58  122:aload_1         
	//   59  123:aload_3         
	//   60  124:invokevirtual   #148 <Method String bim.b()>
	//   61  127:invokestatic    #138 <Method void lg.a(OutputStream, String)>
			}
	//*  62  130:goto            95
	//*  63  133:aload_1         
	//*  64  134:iconst_0        
	//*  65  135:invokestatic    #135 <Method void lg.a(OutputStream, int)>
	//*  66  138:aload_1         
	//*  67  139:invokevirtual   #153 <Method void OutputStream.flush()>
	//*  68  142:iconst_1        
	//*  69  143:ireturn         
			// Misplaced declaration of an exception variable
			catch(OutputStream outputstream)
	//*  70  144:astore_1        
			{
				ee.b("%s", new Object[] {
					((IOException) (outputstream)).toString()
				});
	//   71  145:ldc1            #155 <String "%s">
	//   72  147:iconst_1        
	//   73  148:anewarray       Object[]
	//   74  151:dup             
	//   75  152:iconst_0        
	//   76  153:aload_1         
	//   77  154:invokevirtual   #158 <Method String IOException.toString()>
	//   78  157:aastore         
	//   79  158:invokestatic    #163 <Method void ee.b(String, Object[])>
				return false;
	//   80  161:iconst_0        
	//   81  162:ireturn         
			}
			break MISSING_BLOCK_LABEL_138;
		}
		lg.a(outputstream, 0);
		outputstream.flush();
		return true;
	}

	long a;
	final String b;
	final String c;
	final long d;
	final long e;
	final long f;
	final long g;
	final List h;
}
