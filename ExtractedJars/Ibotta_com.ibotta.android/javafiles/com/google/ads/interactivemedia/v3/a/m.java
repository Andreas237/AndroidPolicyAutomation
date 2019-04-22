// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.ads.interactivemedia.v3.a;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.SystemClock;
import com.google.ads.interactivemedia.v3.a.b.a;
import com.google.ads.interactivemedia.v3.a.b.d;
import com.google.ads.interactivemedia.v3.a.f.b;
import com.google.ads.interactivemedia.v3.a.f.k;
import com.google.ads.interactivemedia.v3.a.f.p;
import com.google.ads.interactivemedia.v3.a.f.q;
import com.google.ads.interactivemedia.v3.b.a.c;
import com.google.ads.interactivemedia.v3.b.b.f;
import com.google.ads.interactivemedia.v3.b.t;
import com.google.ads.interactivemedia.v3.b.w;
import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.ads.interactivemedia.v3.a:
//			u, t, l, c, 
//			s, q, f, d, 
//			p, e, m

public abstract class m extends u
{
	public static class a extends w
	{

		public Enum a(com.google.ads.interactivemedia.v3.b.d.a a1)
			throws IOException
		{
			if(a1.f() == com.google.ads.interactivemedia.v3.b.d.b.i)
		//*   0    0:aload_1         
		//*   1    1:invokevirtual   #78  <Method com.google.ads.interactivemedia.v3.b.d.b com.google.ads.interactivemedia.v3.b.d.a.f()>
		//*   2    4:getstatic       #84  <Field com.google.ads.interactivemedia.v3.b.d.b com.google.ads.interactivemedia.v3.b.d.b.i>
		//*   3    7:if_acmpne       16
			{
				a1.j();
		//    4   10:aload_1         
		//    5   11:invokevirtual   #87  <Method void com.google.ads.interactivemedia.v3.b.d.a.j()>
				return null;
		//    6   14:aconst_null     
		//    7   15:areturn         
			} else
			{
				return (Enum)a.get(((Object) (a1.h())));
		//    8   16:aload_0         
		//    9   17:getfield        #24  <Field Map a>
		//   10   20:aload_1         
		//   11   21:invokevirtual   #90  <Method String com.google.ads.interactivemedia.v3.b.d.a.h()>
		//   12   24:invokeinterface #94  <Method Object Map.get(Object)>
		//   13   29:checkcast       #36  <Class Enum>
		//   14   32:areturn         
			}
		}

		public void a(com.google.ads.interactivemedia.v3.b.d.c c1, Enum enum)
			throws IOException
		{
			if(enum == null)
		//*   0    0:aload_2         
		//*   1    1:ifnonnull       9
				enum = null;
		//    2    4:aconst_null     
		//    3    5:astore_2        
			else
		//*   4    6:goto            23
				enum = ((Enum) ((String)b.get(((Object) (enum)))));
		//    5    9:aload_0         
		//    6   10:getfield        #26  <Field Map b>
		//    7   13:aload_2         
		//    8   14:invokeinterface #94  <Method Object Map.get(Object)>
		//    9   19:checkcast       #99  <Class String>
		//   10   22:astore_2        
			c1.b(((String) (enum)));
		//   11   23:aload_1         
		//   12   24:aload_2         
		//   13   25:invokevirtual   #104 <Method com.google.ads.interactivemedia.v3.b.d.c com.google.ads.interactivemedia.v3.b.d.c.b(String)>
		//   14   28:pop             
		//   15   29:return          
		}

		public Object read(com.google.ads.interactivemedia.v3.b.d.a a1)
			throws IOException
		{
			return ((Object) (a(a1)));
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:invokevirtual   #109 <Method Enum a(com.google.ads.interactivemedia.v3.b.d.a)>
		//    3    5:areturn         
		}

		public void write(com.google.ads.interactivemedia.v3.b.d.c c1, Object obj)
			throws IOException
		{
			a(c1, (Enum)obj);
		//    0    0:aload_0         
		//    1    1:aload_1         
		//    2    2:aload_2         
		//    3    3:checkcast       #36  <Class Enum>
		//    4    6:invokevirtual   #113 <Method void a(com.google.ads.interactivemedia.v3.b.d.c, Enum)>
		//    5    9:return          
		}

		private final Map a;
		private final Map b;

		public a(Class class1)
		{
		//    0    0:aload_0         
		//    1    1:invokespecial   #19  <Method void w()>
			a = ((Map) (new HashMap()));
		//    2    4:aload_0         
		//    3    5:new             #21  <Class HashMap>
		//    4    8:dup             
		//    5    9:invokespecial   #22  <Method void HashMap()>
		//    6   12:putfield        #24  <Field Map a>
			b = ((Map) (new HashMap()));
		//    7   15:aload_0         
		//    8   16:new             #21  <Class HashMap>
		//    9   19:dup             
		//   10   20:invokespecial   #22  <Method void HashMap()>
		//   11   23:putfield        #26  <Field Map b>
			int i1;
			int j1;
			int k1;
			int l1;
			String s1;
			String s2;
			Enum aenum[];
			Enum enum;
			c c1;
			String as[];
			try
			{
				aenum = (Enum[])class1.getEnumConstants();
		//   12   26:aload_1         
		//   13   27:invokevirtual   #32  <Method Object[] Class.getEnumConstants()>
		//   14   30:checkcast       #34  <Class Enum[]>
		//   15   33:astore          8
				k1 = aenum.length;
		//   16   35:aload           8
		//   17   37:arraylength     
		//   18   38:istore          4
			}
		//*  19   40:iconst_0        
		//*  20   41:istore_2        
		//*  21   42:iload_2         
		//*  22   43:iload           4
		//*  23   45:icmpge          179
		//*  24   48:aload           8
		//*  25   50:iload_2         
		//*  26   51:aaload          
		//*  27   52:astore          9
		//*  28   54:aload           9
		//*  29   56:invokevirtual   #40  <Method String Enum.name()>
		//*  30   59:astore          6
		//*  31   61:aload_1         
		//*  32   62:aload           6
		//*  33   64:invokevirtual   #44  <Method Field Class.getField(String)>
		//*  34   67:ldc1            #46  <Class c>
		//*  35   69:invokevirtual   #52  <Method java.lang.annotation.Annotation Field.getAnnotation(Class)>
		//*  36   72:checkcast       #46  <Class c>
		//*  37   75:astore          10
		//*  38   77:aload           10
		//*  39   79:ifnull          144
		//*  40   82:aload           10
		//*  41   84:invokeinterface #54  <Method String c.a()>
		//*  42   89:astore          7
		//*  43   91:aload           10
		//*  44   93:invokeinterface #57  <Method String[] c.b()>
		//*  45   98:astore          10
		//*  46  100:aload           10
		//*  47  102:arraylength     
		//*  48  103:istore          5
		//*  49  105:iconst_0        
		//*  50  106:istore_3        
		//*  51  107:aload           7
		//*  52  109:astore          6
		//*  53  111:iload_3         
		//*  54  112:iload           5
		//*  55  114:icmpge          144
		//*  56  117:aload           10
		//*  57  119:iload_3         
		//*  58  120:aaload          
		//*  59  121:astore          6
		//*  60  123:aload_0         
		//*  61  124:getfield        #24  <Field Map a>
		//*  62  127:aload           6
		//*  63  129:aload           9
		//*  64  131:invokeinterface #63  <Method Object Map.put(Object, Object)>
		//*  65  136:pop             
		//*  66  137:iload_3         
		//*  67  138:iconst_1        
		//*  68  139:iadd            
		//*  69  140:istore_3        
		//*  70  141:goto            107
		//*  71  144:aload_0         
		//*  72  145:getfield        #24  <Field Map a>
		//*  73  148:aload           6
		//*  74  150:aload           9
		//*  75  152:invokeinterface #63  <Method Object Map.put(Object, Object)>
		//*  76  157:pop             
		//*  77  158:aload_0         
		//*  78  159:getfield        #26  <Field Map b>
		//*  79  162:aload           9
		//*  80  164:aload           6
		//*  81  166:invokeinterface #63  <Method Object Map.put(Object, Object)>
		//*  82  171:pop             
		//*  83  172:iload_2         
		//*  84  173:iconst_1        
		//*  85  174:iadd            
		//*  86  175:istore_2        
		//*  87  176:goto            42
		//*  88  179:return          
		//*  89  180:new             #65  <Class AssertionError>
		//*  90  183:dup             
		//*  91  184:invokespecial   #66  <Method void AssertionError()>
		//*  92  187:athrow          
			// Misplaced declaration of an exception variable
			catch(Class class1)
			{
				throw new AssertionError();
			}
			i1 = 0;
			if(i1 >= k1)
				break; /* Loop/switch isn't completed */
			enum = aenum[i1];
			s1 = enum.name();
			c1 = (c)class1.getField(s1).getAnnotation(com/google/ads/interactivemedia/v3/b/a/c);
			if(c1 == null) goto _L2; else goto _L1
_L1:
			s2 = c1.a();
			as = c1.b();
			l1 = as.length;
			j1 = 0;
_L3:
			s1 = s2;
			if(j1 >= l1)
				break; /* Loop/switch isn't completed */
			s1 = as[j1];
			a.put(((Object) (s1)), ((Object) (enum)));
			j1++;
			if(true) goto _L3; else goto _L2
_L2:
			a.put(((Object) (s1)), ((Object) (enum)));
			b.put(((Object) (enum)), ((Object) (s1)));
			i1++;
			if(true) goto _L5; else goto _L4
_L5:
			break MISSING_BLOCK_LABEL_42;
_L4:
		//*  93  188:astore_1        
		//*  94  189:goto            180
		}
	}

	public static interface b
	{

		public abstract void a(android.media.MediaCodec.CryptoException cryptoexception);

		public abstract void a(a a1);

		public abstract void a(String s1, long l1, long l2);
	}


	public m(com.google.ads.interactivemedia.v3.a.t t1, l l1, com.google.ads.interactivemedia.v3.a.b.b b1, boolean flag, Handler handler, b b2)
	{
		this(new com.google.ads.interactivemedia.v3.a.t[] {
			t1
		}, l1, b1, flag, handler, b2);
	//    0    0:aload_0         
	//    1    1:iconst_1        
	//    2    2:anewarray       com.google.ads.interactivemedia.v3.a.t[]
	//    3    5:dup             
	//    4    6:iconst_0        
	//    5    7:aload_1         
	//    6    8:aastore         
	//    7    9:aload_2         
	//    8   10:aload_3         
	//    9   11:iload           4
	//   10   13:aload           5
	//   11   15:aload           6
	//   12   17:invokespecial   #93  <Method void m(com.google.ads.interactivemedia.v3.a.t[], l, com.google.ads.interactivemedia.v3.a.b.b, boolean, Handler, m$b)>
	//   13   20:return          
	}

	public m(com.google.ads.interactivemedia.v3.a.t at[], l l1, com.google.ads.interactivemedia.v3.a.b.b b1, boolean flag, Handler handler, b b2)
	{
		super(at);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #98  <Method void u(com.google.ads.interactivemedia.v3.a.t[])>
		boolean flag1;
		if(q.a >= 16)
	//*   3    5:getstatic       #100 <Field int q.a>
	//*   4    8:bipush          16
	//*   5   10:icmplt          19
			flag1 = true;
	//    6   13:iconst_1        
	//    7   14:istore          7
		else
	//*   8   16:goto            22
			flag1 = false;
	//    9   19:iconst_0        
	//   10   20:istore          7
		com.google.ads.interactivemedia.v3.a.f.b.b(flag1);
	//   11   22:iload           7
	//   12   24:invokestatic    #105 <Method void b.b(boolean)>
		d = (l)com.google.ads.interactivemedia.v3.a.f.b.a(((Object) (l1)));
	//   13   27:aload_0         
	//   14   28:aload_2         
	//   15   29:invokestatic    #108 <Method Object b.a(Object)>
	//   16   32:checkcast       #110 <Class l>
	//   17   35:putfield        #112 <Field l d>
		e = b1;
	//   18   38:aload_0         
	//   19   39:aload_3         
	//   20   40:putfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
		f = flag;
	//   21   43:aload_0         
	//   22   44:iload           4
	//   23   46:putfield        #116 <Field boolean f>
		b = handler;
	//   24   49:aload_0         
	//   25   50:aload           5
	//   26   52:putfield        #118 <Field Handler b>
		k = b2;
	//   27   55:aload_0         
	//   28   56:aload           6
	//   29   58:putfield        #120 <Field m$b k>
		l = B();
	//   30   61:aload_0         
	//   31   62:invokestatic    #123 <Method boolean B()>
	//   32   65:putfield        #125 <Field boolean l>
		a = new com.google.ads.interactivemedia.v3.a.c();
	//   33   68:aload_0         
	//   34   69:new             #127 <Class com.google.ads.interactivemedia.v3.a.c>
	//   35   72:dup             
	//   36   73:invokespecial   #129 <Method void com.google.ads.interactivemedia.v3.a.c()>
	//   37   76:putfield        #131 <Field com.google.ads.interactivemedia.v3.a.c a>
		g = new s(0);
	//   38   79:aload_0         
	//   39   80:new             #133 <Class s>
	//   40   83:dup             
	//   41   84:iconst_0        
	//   42   85:invokespecial   #136 <Method void s(int)>
	//   43   88:putfield        #138 <Field s g>
		h = new com.google.ads.interactivemedia.v3.a.q();
	//   44   91:aload_0         
	//   45   92:new             #140 <Class com.google.ads.interactivemedia.v3.a.q>
	//   46   95:dup             
	//   47   96:invokespecial   #141 <Method void com.google.ads.interactivemedia.v3.a.q()>
	//   48   99:putfield        #143 <Field com.google.ads.interactivemedia.v3.a.q h>
		i = ((List) (new ArrayList()));
	//   49  102:aload_0         
	//   50  103:new             #145 <Class ArrayList>
	//   51  106:dup             
	//   52  107:invokespecial   #146 <Method void ArrayList()>
	//   53  110:putfield        #148 <Field List i>
		j = new android.media.MediaCodec.BufferInfo();
	//   54  113:aload_0         
	//   55  114:new             #150 <Class android.media.MediaCodec$BufferInfo>
	//   56  117:dup             
	//   57  118:invokespecial   #151 <Method void android.media.MediaCodec$BufferInfo()>
	//   58  121:putfield        #153 <Field android.media.MediaCodec$BufferInfo j>
		F = 0;
	//   59  124:aload_0         
	//   60  125:iconst_0        
	//   61  126:putfield        #155 <Field int F>
		G = 0;
	//   62  129:aload_0         
	//   63  130:iconst_0        
	//   64  131:putfield        #157 <Field int G>
	//   65  134:return          
	}

	private void A()
		throws com.google.ads.interactivemedia.v3.a.f
	{
		if(G == 2)
	//*   0    0:aload_0         
	//*   1    1:getfield        #157 <Field int G>
	//*   2    4:iconst_2        
	//*   3    5:icmpne          17
		{
			m();
	//    4    8:aload_0         
	//    5    9:invokevirtual   #162 <Method void m()>
			j();
	//    6   12:aload_0         
	//    7   13:invokevirtual   #164 <Method void j()>
			return;
	//    8   16:return          
		} else
		{
			L = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #166 <Field boolean L>
			h();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #168 <Method void h()>
			return;
	//   14   26:return          
		}
	}

	private static boolean B()
	{
		return q.a <= 22 && "foster".equals(((Object) (q.b))) && "NVIDIA".equals(((Object) (q.c)));
	//    0    0:getstatic       #100 <Field int q.a>
	//    1    3:bipush          22
	//    2    5:icmpgt          32
	//    3    8:ldc1            #171 <String "foster">
	//    4   10:getstatic       #174 <Field String q.b>
	//    5   13:invokevirtual   #180 <Method boolean String.equals(Object)>
	//    6   16:ifeq            32
	//    7   19:ldc1            #182 <String "NVIDIA">
	//    8   21:getstatic       #184 <Field String q.c>
	//    9   24:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   10   27:ifeq            32
	//   11   30:iconst_1        
	//   12   31:ireturn         
	//   13   32:iconst_0        
	//   14   33:ireturn         
	}

	private static android.media.MediaCodec.CryptoInfo a(s s1, int i1)
	{
		s1 = ((s) (s1.a.a()));
	//    0    0:aload_0         
	//    1    1:getfield        #188 <Field com.google.ads.interactivemedia.v3.a.d com.google.ads.interactivemedia.v3.a.s.a>
	//    2    4:invokevirtual   #193 <Method android.media.MediaCodec$CryptoInfo com.google.ads.interactivemedia.v3.a.d.a()>
	//    3    7:astore_0        
		if(i1 == 0)
	//*   4    8:iload_1         
	//*   5    9:ifne            14
			return ((android.media.MediaCodec.CryptoInfo) (s1));
	//    6   12:aload_0         
	//    7   13:areturn         
		if(((android.media.MediaCodec.CryptoInfo) (s1)).numBytesOfClearData == null)
	//*   8   14:aload_0         
	//*   9   15:getfield        #199 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//*  10   18:ifnonnull       28
			s1.numBytesOfClearData = new int[1];
	//   11   21:aload_0         
	//   12   22:iconst_1        
	//   13   23:newarray        int[]
	//   14   25:putfield        #199 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
		int ai[] = ((android.media.MediaCodec.CryptoInfo) (s1)).numBytesOfClearData;
	//   15   28:aload_0         
	//   16   29:getfield        #199 <Field int[] android.media.MediaCodec$CryptoInfo.numBytesOfClearData>
	//   17   32:astore_2        
		ai[0] = ai[0] + i1;
	//   18   33:aload_2         
	//   19   34:iconst_0        
	//   20   35:aload_2         
	//   21   36:iconst_0        
	//   22   37:iaload          
	//   23   38:iload_1         
	//   24   39:iadd            
	//   25   40:iastore         
		return ((android.media.MediaCodec.CryptoInfo) (s1));
	//   26   41:aload_0         
	//   27   42:areturn         
	}

	static b a(m m1)
	{
		return m1.k;
	//    0    0:aload_0         
	//    1    1:getfield        #120 <Field m$b k>
	//    2    4:areturn         
	}

	private void a(android.media.MediaCodec.CryptoException cryptoexception)
	{
		Handler handler = b;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler b>
	//    2    4:astore_2        
		if(handler != null && k != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #120 <Field m$b k>
	//*   7   13:ifnull          30
			handler.post(((Runnable) (new w(this, cryptoexception) {

				public Number a(com.google.ads.interactivemedia.v3.b.d.a a1)
					throws IOException
				{
					if(a1.f() == com.google.ads.interactivemedia.v3.b.d.b.i)
				//*   0    0:aload_1         
				//*   1    1:invokevirtual   #22  <Method com.google.ads.interactivemedia.v3.b.d.b com.google.ads.interactivemedia.v3.b.d.a.f()>
				//*   2    4:getstatic       #28  <Field com.google.ads.interactivemedia.v3.b.d.b com.google.ads.interactivemedia.v3.b.d.b.i>
				//*   3    7:if_acmpne       16
					{
						a1.j();
				//    4   10:aload_1         
				//    5   11:invokevirtual   #31  <Method void com.google.ads.interactivemedia.v3.b.d.a.j()>
						return null;
				//    6   14:aconst_null     
				//    7   15:areturn         
					} else
					{
						return ((Number) (Double.valueOf(a1.k())));
				//    8   16:aload_1         
				//    9   17:invokevirtual   #35  <Method double com.google.ads.interactivemedia.v3.b.d.a.k()>
				//   10   20:invokestatic    #41  <Method Double Double.valueOf(double)>
				//   11   23:areturn         
					}
				}

				public void a(com.google.ads.interactivemedia.v3.b.d.c c1, Number number)
					throws IOException
				{
					c1.a(number);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokevirtual   #48  <Method com.google.ads.interactivemedia.v3.b.d.c com.google.ads.interactivemedia.v3.b.d.c.a(Number)>
				//    3    5:pop             
				//    4    6:return          
				}

				public Object read(com.google.ads.interactivemedia.v3.b.d.a a1)
					throws IOException
				{
					return ((Object) (a(a1)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #52  <Method Number a(com.google.ads.interactivemedia.v3.b.d.a)>
				//    3    5:areturn         
				}

				public void write(com.google.ads.interactivemedia.v3.b.d.c c1, Object obj)
					throws IOException
				{
					a(c1, (Number)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #56  <Class Number>
				//    4    6:invokevirtual   #58  <Method void a(com.google.ads.interactivemedia.v3.b.d.c, Number)>
				//    5    9:return          
				}

			}
)));
	//    8   16:aload_2         
	//    9   17:new             #8   <Class m$2>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #204 <Method void m$2(m, android.media.MediaCodec$CryptoException)>
	//   14   26:invokevirtual   #210 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private void a(a a1)
		throws com.google.ads.interactivemedia.v3.a.f
	{
		b(a1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #213 <Method void b(m$a)>
		throw new com.google.ads.interactivemedia.v3.a.f(((Throwable) (a1)));
	//    3    5:new             #160 <Class com.google.ads.interactivemedia.v3.a.f>
	//    4    8:dup             
	//    5    9:aload_1         
	//    6   10:invokespecial   #216 <Method void com.google.ads.interactivemedia.v3.a.f(Throwable)>
	//    7   13:athrow          
	}

	private void a(String s1, long l1, long l2)
	{
		Handler handler = b;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler b>
	//    2    4:astore          6
		if(handler != null && k != null)
	//*   3    6:aload           6
	//*   4    8:ifnull          36
	//*   5   11:aload_0         
	//*   6   12:getfield        #120 <Field m$b k>
	//*   7   15:ifnull          36
			handler.post(((Runnable) (new w(this, s1, l1, l2) {

				public Number a(com.google.ads.interactivemedia.v3.b.d.a a1)
					throws IOException
				{
					Object obj = ((Object) (a1.f()));
				//    0    0:aload_1         
				//    1    1:invokevirtual   #22  <Method com.google.ads.interactivemedia.v3.b.d.b com.google.ads.interactivemedia.v3.b.d.a.f()>
				//    2    4:astore_3        
					int i1 = com.google.ads.interactivemedia.v3.b.b.a._cls26.a[((com.google.ads.interactivemedia.v3.b.d.b) (obj)).ordinal()];
				//    3    5:getstatic       #27  <Field int[] com.google.ads.interactivemedia.v3.b.b.a.m$26.a>
				//    4    8:aload_3         
				//    5    9:invokevirtual   #33  <Method int com.google.ads.interactivemedia.v3.b.d.b.ordinal()>
				//    6   12:iaload          
				//    7   13:istore_2        
					if(i1 != 1)
				//*   8   14:iload_2         
				//*   9   15:iconst_1        
				//*  10   16:icmpeq          78
					{
						if(i1 == 4)
				//*  11   19:iload_2         
				//*  12   20:iconst_4        
				//*  13   21:icmpne          30
						{
							a1.j();
				//   14   24:aload_1         
				//   15   25:invokevirtual   #36  <Method void com.google.ads.interactivemedia.v3.b.d.a.j()>
							return null;
				//   16   28:aconst_null     
				//   17   29:areturn         
						} else
						{
							a1 = ((com.google.ads.interactivemedia.v3.b.d.a) (String.valueOf(obj)));
				//   18   30:aload_3         
				//   19   31:invokestatic    #42  <Method String String.valueOf(Object)>
				//   20   34:astore_1        
							obj = ((Object) (new StringBuilder(String.valueOf(((Object) (a1))).length() + 23)));
				//   21   35:new             #44  <Class StringBuilder>
				//   22   38:dup             
				//   23   39:aload_1         
				//   24   40:invokestatic    #42  <Method String String.valueOf(Object)>
				//   25   43:invokevirtual   #47  <Method int String.length()>
				//   26   46:bipush          23
				//   27   48:iadd            
				//   28   49:invokespecial   #50  <Method void StringBuilder(int)>
				//   29   52:astore_3        
							((StringBuilder) (obj)).append("Expecting number, got: ");
				//   30   53:aload_3         
				//   31   54:ldc1            #52  <String "Expecting number, got: ">
				//   32   56:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
				//   33   59:pop             
							((StringBuilder) (obj)).append(((String) (a1)));
				//   34   60:aload_3         
				//   35   61:aload_1         
				//   36   62:invokevirtual   #56  <Method StringBuilder StringBuilder.append(String)>
				//   37   65:pop             
							throw new t(((StringBuilder) (obj)).toString());
				//   38   66:new             #58  <Class t>
				//   39   69:dup             
				//   40   70:aload_3         
				//   41   71:invokevirtual   #62  <Method String StringBuilder.toString()>
				//   42   74:invokespecial   #65  <Method void t(String)>
				//   43   77:athrow          
						}
					} else
					{
						return ((Number) (new f(a1.h())));
				//   44   78:new             #67  <Class f>
				//   45   81:dup             
				//   46   82:aload_1         
				//   47   83:invokevirtual   #70  <Method String com.google.ads.interactivemedia.v3.b.d.a.h()>
				//   48   86:invokespecial   #71  <Method void f(String)>
				//   49   89:areturn         
					}
				}

				public void a(com.google.ads.interactivemedia.v3.b.d.c c1, Number number)
					throws IOException
				{
					c1.a(number);
				//    0    0:aload_1         
				//    1    1:aload_2         
				//    2    2:invokevirtual   #78  <Method com.google.ads.interactivemedia.v3.b.d.c com.google.ads.interactivemedia.v3.b.d.c.a(Number)>
				//    3    5:pop             
				//    4    6:return          
				}

				public Object read(com.google.ads.interactivemedia.v3.b.d.a a1)
					throws IOException
				{
					return ((Object) (a(a1)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #82  <Method Number a(com.google.ads.interactivemedia.v3.b.d.a)>
				//    3    5:areturn         
				}

				public void write(com.google.ads.interactivemedia.v3.b.d.c c1, Object obj)
					throws IOException
				{
					a(c1, (Number)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #86  <Class Number>
				//    4    6:invokevirtual   #88  <Method void a(com.google.ads.interactivemedia.v3.b.d.c, Number)>
				//    5    9:return          
				}

			}
)));
	//    8   18:aload           6
	//    9   20:new             #10  <Class m$3>
	//   10   23:dup             
	//   11   24:aload_0         
	//   12   25:aload_1         
	//   13   26:lload_2         
	//   14   27:lload           4
	//   15   29:invokespecial   #220 <Method void m$3(m, String, long, long)>
	//   16   32:invokevirtual   #210 <Method boolean Handler.post(Runnable)>
	//   17   35:pop             
	//   18   36:return          
	}

	private boolean a()
	{
		return SystemClock.elapsedRealtime() < A + 1000L;
	//    0    0:invokestatic    #226 <Method long SystemClock.elapsedRealtime()>
	//    1    3:aload_0         
	//    2    4:getfield        #228 <Field long A>
	//    3    7:ldc2w           #229 <Long 1000L>
	//    4   10:ladd            
	//    5   11:lcmp            
	//    6   12:ifge            17
	//    7   15:iconst_1        
	//    8   16:ireturn         
	//    9   17:iconst_0        
	//   10   18:ireturn         
	}

	private boolean a(long l1, long l2)
		throws com.google.ads.interactivemedia.v3.a.f
	{
		if(L)
	//*   0    0:aload_0         
	//*   1    1:getfield        #166 <Field boolean L>
	//*   2    4:ifeq            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		if(C < 0)
	//*   5    9:aload_0         
	//*   6   10:getfield        #233 <Field int C>
	//*   7   13:ifge            35
			C = o.dequeueOutputBuffer(j, p());
	//    8   16:aload_0         
	//    9   17:aload_0         
	//   10   18:getfield        #235 <Field MediaCodec o>
	//   11   21:aload_0         
	//   12   22:getfield        #153 <Field android.media.MediaCodec$BufferInfo j>
	//   13   25:aload_0         
	//   14   26:invokevirtual   #237 <Method long p()>
	//   15   29:invokevirtual   #243 <Method int MediaCodec.dequeueOutputBuffer(android.media.MediaCodec$BufferInfo, long)>
	//   16   32:putfield        #233 <Field int C>
		int i1 = C;
	//   17   35:aload_0         
	//   18   36:getfield        #233 <Field int C>
	//   19   39:istore          5
		if(i1 == -2)
	//*  20   41:iload           5
	//*  21   43:bipush          -2
	//*  22   45:icmpne          54
		{
			i();
	//   23   48:aload_0         
	//   24   49:invokespecial   #245 <Method void i()>
			return true;
	//   25   52:iconst_1        
	//   26   53:ireturn         
		}
		if(i1 == -3)
	//*  27   54:iload           5
	//*  28   56:bipush          -3
	//*  29   58:icmpne          92
		{
			z = o.getOutputBuffers();
	//   30   61:aload_0         
	//   31   62:aload_0         
	//   32   63:getfield        #235 <Field MediaCodec o>
	//   33   66:invokevirtual   #249 <Method ByteBuffer[] MediaCodec.getOutputBuffers()>
	//   34   69:putfield        #251 <Field ByteBuffer[] z>
			com.google.ads.interactivemedia.v3.a.c c1 = a;
	//   35   72:aload_0         
	//   36   73:getfield        #131 <Field com.google.ads.interactivemedia.v3.a.c a>
	//   37   76:astore          8
			c1.e = c1.e + 1;
	//   38   78:aload           8
	//   39   80:aload           8
	//   40   82:getfield        #253 <Field int c.e>
	//   41   85:iconst_1        
	//   42   86:iadd            
	//   43   87:putfield        #253 <Field int c.e>
			return true;
	//   44   90:iconst_1        
	//   45   91:ireturn         
		}
		if(i1 < 0)
	//*  46   92:iload           5
	//*  47   94:ifge            127
			if(t && (K || G == 2))
	//*  48   97:aload_0         
	//*  49   98:getfield        #255 <Field boolean t>
	//*  50  101:ifeq            125
	//*  51  104:aload_0         
	//*  52  105:getfield        #257 <Field boolean K>
	//*  53  108:ifne            119
	//*  54  111:aload_0         
	//*  55  112:getfield        #157 <Field int G>
	//*  56  115:iconst_2        
	//*  57  116:icmpne          125
			{
				A();
	//   58  119:aload_0         
	//   59  120:invokespecial   #259 <Method void A()>
				return true;
	//   60  123:iconst_1        
	//   61  124:ireturn         
			} else
			{
				return false;
	//   62  125:iconst_0        
	//   63  126:ireturn         
			}
		if(x)
	//*  64  127:aload_0         
	//*  65  128:getfield        #261 <Field boolean x>
	//*  66  131:ifeq            156
		{
			x = false;
	//   67  134:aload_0         
	//   68  135:iconst_0        
	//   69  136:putfield        #261 <Field boolean x>
			o.releaseOutputBuffer(i1, false);
	//   70  139:aload_0         
	//   71  140:getfield        #235 <Field MediaCodec o>
	//   72  143:iload           5
	//   73  145:iconst_0        
	//   74  146:invokevirtual   #265 <Method void MediaCodec.releaseOutputBuffer(int, boolean)>
			C = -1;
	//   75  149:aload_0         
	//   76  150:iconst_m1       
	//   77  151:putfield        #233 <Field int C>
			return true;
	//   78  154:iconst_1        
	//   79  155:ireturn         
		}
		if((j.flags & 4) != 0)
	//*  80  156:aload_0         
	//*  81  157:getfield        #153 <Field android.media.MediaCodec$BufferInfo j>
	//*  82  160:getfield        #268 <Field int android.media.MediaCodec$BufferInfo.flags>
	//*  83  163:iconst_4        
	//*  84  164:iand            
	//*  85  165:ifeq            174
		{
			A();
	//   86  168:aload_0         
	//   87  169:invokespecial   #259 <Method void A()>
			return false;
	//   88  172:iconst_0        
	//   89  173:ireturn         
		}
		i1 = h(j.presentationTimeUs);
	//   90  174:aload_0         
	//   91  175:aload_0         
	//   92  176:getfield        #153 <Field android.media.MediaCodec$BufferInfo j>
	//   93  179:getfield        #271 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//   94  182:invokespecial   #274 <Method int h(long)>
	//   95  185:istore          5
		MediaCodec mediacodec = o;
	//   96  187:aload_0         
	//   97  188:getfield        #235 <Field MediaCodec o>
	//   98  191:astore          8
		ByteBuffer abytebuffer[] = z;
	//   99  193:aload_0         
	//  100  194:getfield        #251 <Field ByteBuffer[] z>
	//  101  197:astore          9
		int j1 = C;
	//  102  199:aload_0         
	//  103  200:getfield        #233 <Field int C>
	//  104  203:istore          6
		ByteBuffer bytebuffer = abytebuffer[j1];
	//  105  205:aload           9
	//  106  207:iload           6
	//  107  209:aaload          
	//  108  210:astore          9
		android.media.MediaCodec.BufferInfo bufferinfo = j;
	//  109  212:aload_0         
	//  110  213:getfield        #153 <Field android.media.MediaCodec$BufferInfo j>
	//  111  216:astore          10
		boolean flag;
		if(i1 != -1)
	//* 112  218:iload           5
	//* 113  220:iconst_m1       
	//* 114  221:icmpeq          230
			flag = true;
	//  115  224:iconst_1        
	//  116  225:istore          7
		else
	//* 117  227:goto            233
			flag = false;
	//  118  230:iconst_0        
	//  119  231:istore          7
		if(a(l1, l2, mediacodec, bytebuffer, bufferinfo, j1, flag))
	//* 120  233:aload_0         
	//* 121  234:lload_1         
	//* 122  235:lload_3         
	//* 123  236:aload           8
	//* 124  238:aload           9
	//* 125  240:aload           10
	//* 126  242:iload           6
	//* 127  244:iload           7
	//* 128  246:invokevirtual   #277 <Method boolean a(long, long, MediaCodec, ByteBuffer, android.media.MediaCodec$BufferInfo, int, boolean)>
	//* 129  249:ifeq            288
		{
			b(j.presentationTimeUs);
	//  130  252:aload_0         
	//  131  253:aload_0         
	//  132  254:getfield        #153 <Field android.media.MediaCodec$BufferInfo j>
	//  133  257:getfield        #271 <Field long android.media.MediaCodec$BufferInfo.presentationTimeUs>
	//  134  260:invokevirtual   #280 <Method void b(long)>
			if(i1 != -1)
	//* 135  263:iload           5
	//* 136  265:iconst_m1       
	//* 137  266:icmpeq          281
				i.remove(i1);
	//  138  269:aload_0         
	//  139  270:getfield        #148 <Field List i>
	//  140  273:iload           5
	//  141  275:invokeinterface #286 <Method Object List.remove(int)>
	//  142  280:pop             
			C = -1;
	//  143  281:aload_0         
	//  144  282:iconst_m1       
	//  145  283:putfield        #233 <Field int C>
			return true;
	//  146  286:iconst_1        
	//  147  287:ireturn         
		} else
		{
			return false;
	//  148  288:iconst_0        
	//  149  289:ireturn         
		}
	}

	private boolean a(long l1, boolean flag)
		throws com.google.ads.interactivemedia.v3.a.f
	{
		if(K)
			break MISSING_BLOCK_LABEL_750;
	//    0    0:aload_0         
	//    1    1:getfield        #257 <Field boolean K>
	//    2    4:ifne            750
		if(G == 2)
	//*   3    7:aload_0         
	//*   4    8:getfield        #157 <Field int G>
	//*   5   11:iconst_2        
	//*   6   12:icmpne          17
			return false;
	//    7   15:iconst_0        
	//    8   16:ireturn         
		if(B < 0)
	//*   9   17:aload_0         
	//*  10   18:getfield        #291 <Field int B>
	//*  11   21:ifge            72
		{
			B = o.dequeueInputBuffer(0L);
	//   12   24:aload_0         
	//   13   25:aload_0         
	//   14   26:getfield        #235 <Field MediaCodec o>
	//   15   29:lconst_0        
	//   16   30:invokevirtual   #294 <Method int MediaCodec.dequeueInputBuffer(long)>
	//   17   33:putfield        #291 <Field int B>
			int i1 = B;
	//   18   36:aload_0         
	//   19   37:getfield        #291 <Field int B>
	//   20   40:istore          4
			if(i1 < 0)
	//*  21   42:iload           4
	//*  22   44:ifge            49
				return false;
	//   23   47:iconst_0        
	//   24   48:ireturn         
			s s1 = g;
	//   25   49:aload_0         
	//   26   50:getfield        #138 <Field s g>
	//   27   53:astore          6
			s1.b = y[i1];
	//   28   55:aload           6
	//   29   57:aload_0         
	//   30   58:getfield        #296 <Field ByteBuffer[] y>
	//   31   61:iload           4
	//   32   63:aaload          
	//   33   64:putfield        #299 <Field ByteBuffer com.google.ads.interactivemedia.v3.a.s.b>
			s1.d();
	//   34   67:aload           6
	//   35   69:invokevirtual   #301 <Method void com.google.ads.interactivemedia.v3.a.s.d()>
		}
		if(G == 1)
	//*  36   72:aload_0         
	//*  37   73:getfield        #157 <Field int G>
	//*  38   76:iconst_1        
	//*  39   77:icmpne          122
		{
			if(!t)
	//*  40   80:aload_0         
	//*  41   81:getfield        #255 <Field boolean t>
	//*  42   84:ifeq            90
	//*  43   87:goto            115
			{
				I = true;
	//   44   90:aload_0         
	//   45   91:iconst_1        
	//   46   92:putfield        #303 <Field boolean I>
				o.queueInputBuffer(B, 0, 0, 0L, 4);
	//   47   95:aload_0         
	//   48   96:getfield        #235 <Field MediaCodec o>
	//   49   99:aload_0         
	//   50  100:getfield        #291 <Field int B>
	//   51  103:iconst_0        
	//   52  104:iconst_0        
	//   53  105:lconst_0        
	//   54  106:iconst_4        
	//   55  107:invokevirtual   #307 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
				B = -1;
	//   56  110:aload_0         
	//   57  111:iconst_m1       
	//   58  112:putfield        #291 <Field int B>
			}
			G = 2;
	//   59  115:aload_0         
	//   60  116:iconst_2        
	//   61  117:putfield        #157 <Field int G>
			return false;
	//   62  120:iconst_0        
	//   63  121:ireturn         
		}
		if(w)
	//*  64  122:aload_0         
	//*  65  123:getfield        #309 <Field boolean w>
	//*  66  126:ifeq            178
		{
			w = false;
	//   67  129:aload_0         
	//   68  130:iconst_0        
	//   69  131:putfield        #309 <Field boolean w>
			g.b.put(c);
	//   70  134:aload_0         
	//   71  135:getfield        #138 <Field s g>
	//   72  138:getfield        #299 <Field ByteBuffer com.google.ads.interactivemedia.v3.a.s.b>
	//   73  141:getstatic       #85  <Field byte[] c>
	//   74  144:invokevirtual   #315 <Method ByteBuffer ByteBuffer.put(byte[])>
	//   75  147:pop             
			o.queueInputBuffer(B, 0, c.length, 0L, 0);
	//   76  148:aload_0         
	//   77  149:getfield        #235 <Field MediaCodec o>
	//   78  152:aload_0         
	//   79  153:getfield        #291 <Field int B>
	//   80  156:iconst_0        
	//   81  157:getstatic       #85  <Field byte[] c>
	//   82  160:arraylength     
	//   83  161:lconst_0        
	//   84  162:iconst_0        
	//   85  163:invokevirtual   #307 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
			B = -1;
	//   86  166:aload_0         
	//   87  167:iconst_m1       
	//   88  168:putfield        #291 <Field int B>
			H = true;
	//   89  171:aload_0         
	//   90  172:iconst_1        
	//   91  173:putfield        #317 <Field boolean H>
			return true;
	//   92  176:iconst_1        
	//   93  177:ireturn         
		}
		int j1;
		if(M)
	//*  94  178:aload_0         
	//*  95  179:getfield        #319 <Field boolean M>
	//*  96  182:ifeq            192
		{
			j1 = -3;
	//   97  185:bipush          -3
	//   98  187:istore          4
		} else
	//*  99  189:goto            321
		{
			if(F == 1)
	//* 100  192:aload_0         
	//* 101  193:getfield        #155 <Field int F>
	//* 102  196:iconst_1        
	//* 103  197:icmpne          266
			{
				for(j1 = 0; j1 < m.f.size(); j1++)
	//* 104  200:iconst_0        
	//* 105  201:istore          4
	//* 106  203:iload           4
	//* 107  205:aload_0         
	//* 108  206:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//* 109  209:getfield        #325 <Field List com.google.ads.interactivemedia.v3.a.p.f>
	//* 110  212:invokeinterface #329 <Method int List.size()>
	//* 111  217:icmpge          261
				{
					byte abyte0[] = (byte[])m.f.get(j1);
	//  112  220:aload_0         
	//  113  221:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//  114  224:getfield        #325 <Field List com.google.ads.interactivemedia.v3.a.p.f>
	//  115  227:iload           4
	//  116  229:invokeinterface #332 <Method Object List.get(int)>
	//  117  234:checkcast       #333 <Class byte[]>
	//  118  237:astore          6
					g.b.put(abyte0);
	//  119  239:aload_0         
	//  120  240:getfield        #138 <Field s g>
	//  121  243:getfield        #299 <Field ByteBuffer com.google.ads.interactivemedia.v3.a.s.b>
	//  122  246:aload           6
	//  123  248:invokevirtual   #315 <Method ByteBuffer ByteBuffer.put(byte[])>
	//  124  251:pop             
				}

	//  125  252:iload           4
	//  126  254:iconst_1        
	//  127  255:iadd            
	//  128  256:istore          4
	//* 129  258:goto            203
				F = 2;
	//  130  261:aload_0         
	//  131  262:iconst_2        
	//  132  263:putfield        #155 <Field int F>
			}
			int i2 = a(l1, h, g);
	//  133  266:aload_0         
	//  134  267:lload_1         
	//  135  268:aload_0         
	//  136  269:getfield        #143 <Field com.google.ads.interactivemedia.v3.a.q h>
	//  137  272:aload_0         
	//  138  273:getfield        #138 <Field s g>
	//  139  276:invokevirtual   #336 <Method int a(long, com.google.ads.interactivemedia.v3.a.q, s)>
	//  140  279:istore          5
			j1 = i2;
	//  141  281:iload           5
	//  142  283:istore          4
			if(flag)
	//* 143  285:iload_3         
	//* 144  286:ifeq            321
			{
				j1 = i2;
	//  145  289:iload           5
	//  146  291:istore          4
				if(J == 1)
	//* 147  293:aload_0         
	//* 148  294:getfield        #338 <Field int J>
	//* 149  297:iconst_1        
	//* 150  298:icmpne          321
				{
					j1 = i2;
	//  151  301:iload           5
	//  152  303:istore          4
					if(i2 == -2)
	//* 153  305:iload           5
	//* 154  307:bipush          -2
	//* 155  309:icmpne          321
					{
						J = 2;
	//  156  312:aload_0         
	//  157  313:iconst_2        
	//  158  314:putfield        #338 <Field int J>
						j1 = i2;
	//  159  317:iload           5
	//  160  319:istore          4
					}
				}
			}
		}
		if(j1 == -2)
	//* 161  321:iload           4
	//* 162  323:bipush          -2
	//* 163  325:icmpne          330
			return false;
	//  164  328:iconst_0        
	//  165  329:ireturn         
		if(j1 == -4)
	//* 166  330:iload           4
	//* 167  332:bipush          -4
	//* 168  334:icmpne          367
		{
			if(F == 2)
	//* 169  337:aload_0         
	//* 170  338:getfield        #155 <Field int F>
	//* 171  341:iconst_2        
	//* 172  342:icmpne          357
			{
				g.d();
	//  173  345:aload_0         
	//  174  346:getfield        #138 <Field s g>
	//  175  349:invokevirtual   #301 <Method void com.google.ads.interactivemedia.v3.a.s.d()>
				F = 1;
	//  176  352:aload_0         
	//  177  353:iconst_1        
	//  178  354:putfield        #155 <Field int F>
			}
			a(h);
	//  179  357:aload_0         
	//  180  358:aload_0         
	//  181  359:getfield        #143 <Field com.google.ads.interactivemedia.v3.a.q h>
	//  182  362:invokevirtual   #341 <Method void a(com.google.ads.interactivemedia.v3.a.q)>
			return true;
	//  183  365:iconst_1        
	//  184  366:ireturn         
		}
		if(j1 != -1)
			break MISSING_BLOCK_LABEL_465;
	//  185  367:iload           4
	//  186  369:iconst_m1       
	//  187  370:icmpne          465
		if(F == 2)
	//* 188  373:aload_0         
	//* 189  374:getfield        #155 <Field int F>
	//* 190  377:iconst_2        
	//* 191  378:icmpne          393
		{
			g.d();
	//  192  381:aload_0         
	//  193  382:getfield        #138 <Field s g>
	//  194  385:invokevirtual   #301 <Method void com.google.ads.interactivemedia.v3.a.s.d()>
			F = 1;
	//  195  388:aload_0         
	//  196  389:iconst_1        
	//  197  390:putfield        #155 <Field int F>
		}
		K = true;
	//  198  393:aload_0         
	//  199  394:iconst_1        
	//  200  395:putfield        #257 <Field boolean K>
		if(!H)
	//* 201  398:aload_0         
	//* 202  399:getfield        #317 <Field boolean H>
	//* 203  402:ifne            411
		{
			A();
	//  204  405:aload_0         
	//  205  406:invokespecial   #259 <Method void A()>
			return false;
	//  206  409:iconst_0        
	//  207  410:ireturn         
		}
		if(t)
	//* 208  411:aload_0         
	//* 209  412:getfield        #255 <Field boolean t>
	//* 210  415:ifeq            420
			return false;
	//  211  418:iconst_0        
	//  212  419:ireturn         
		try
		{
			I = true;
	//  213  420:aload_0         
	//  214  421:iconst_1        
	//  215  422:putfield        #303 <Field boolean I>
			o.queueInputBuffer(B, 0, 0, 0L, 4);
	//  216  425:aload_0         
	//  217  426:getfield        #235 <Field MediaCodec o>
	//  218  429:aload_0         
	//  219  430:getfield        #291 <Field int B>
	//  220  433:iconst_0        
	//  221  434:iconst_0        
	//  222  435:lconst_0        
	//  223  436:iconst_4        
	//  224  437:invokevirtual   #307 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
			B = -1;
	//  225  440:aload_0         
	//  226  441:iconst_m1       
	//  227  442:putfield        #291 <Field int B>
		}
	//* 228  445:iconst_0        
	//* 229  446:ireturn         
		catch(android.media.MediaCodec.CryptoException cryptoexception)
	//* 230  447:astore          6
		{
			a(cryptoexception);
	//  231  449:aload_0         
	//  232  450:aload           6
	//  233  452:invokespecial   #343 <Method void a(android.media.MediaCodec$CryptoException)>
			throw new com.google.ads.interactivemedia.v3.a.f(((Throwable) (cryptoexception)));
	//  234  455:new             #160 <Class com.google.ads.interactivemedia.v3.a.f>
	//  235  458:dup             
	//  236  459:aload           6
	//  237  461:invokespecial   #216 <Method void com.google.ads.interactivemedia.v3.a.f(Throwable)>
	//  238  464:athrow          
		}
		return false;
		if(N)
	//* 239  465:aload_0         
	//* 240  466:getfield        #345 <Field boolean N>
	//* 241  469:ifeq            509
		{
			if(!g.c())
	//* 242  472:aload_0         
	//* 243  473:getfield        #138 <Field s g>
	//* 244  476:invokevirtual   #347 <Method boolean com.google.ads.interactivemedia.v3.a.s.c()>
	//* 245  479:ifne            504
			{
				g.d();
	//  246  482:aload_0         
	//  247  483:getfield        #138 <Field s g>
	//  248  486:invokevirtual   #301 <Method void com.google.ads.interactivemedia.v3.a.s.d()>
				if(F == 2)
	//* 249  489:aload_0         
	//* 250  490:getfield        #155 <Field int F>
	//* 251  493:iconst_2        
	//* 252  494:icmpne          502
					F = 1;
	//  253  497:aload_0         
	//  254  498:iconst_1        
	//  255  499:putfield        #155 <Field int F>
				return true;
	//  256  502:iconst_1        
	//  257  503:ireturn         
			}
			N = false;
	//  258  504:aload_0         
	//  259  505:iconst_0        
	//  260  506:putfield        #345 <Field boolean N>
		}
		flag = g.a();
	//  261  509:aload_0         
	//  262  510:getfield        #138 <Field s g>
	//  263  513:invokevirtual   #349 <Method boolean com.google.ads.interactivemedia.v3.a.s.a()>
	//  264  516:istore_3        
		M = a(flag);
	//  265  517:aload_0         
	//  266  518:aload_0         
	//  267  519:iload_3         
	//  268  520:invokespecial   #352 <Method boolean a(boolean)>
	//  269  523:putfield        #319 <Field boolean M>
		if(M)
	//* 270  526:aload_0         
	//* 271  527:getfield        #319 <Field boolean M>
	//* 272  530:ifeq            535
			return false;
	//  273  533:iconst_0        
	//  274  534:ireturn         
		if(q && !flag)
	//* 275  535:aload_0         
	//* 276  536:getfield        #354 <Field boolean q>
	//* 277  539:ifeq            576
	//* 278  542:iload_3         
	//* 279  543:ifne            576
		{
			com.google.ads.interactivemedia.v3.a.f.k.a(g.b);
	//  280  546:aload_0         
	//  281  547:getfield        #138 <Field s g>
	//  282  550:getfield        #299 <Field ByteBuffer com.google.ads.interactivemedia.v3.a.s.b>
	//  283  553:invokestatic    #359 <Method void k.a(ByteBuffer)>
			if(g.b.position() == 0)
	//* 284  556:aload_0         
	//* 285  557:getfield        #138 <Field s g>
	//* 286  560:getfield        #299 <Field ByteBuffer com.google.ads.interactivemedia.v3.a.s.b>
	//* 287  563:invokevirtual   #362 <Method int ByteBuffer.position()>
	//* 288  566:ifne            571
				return true;
	//  289  569:iconst_1        
	//  290  570:ireturn         
			q = false;
	//  291  571:aload_0         
	//  292  572:iconst_0        
	//  293  573:putfield        #354 <Field boolean q>
		}
		int k1;
		int j2;
		Object obj;
		try
		{
			k1 = g.b.position();
	//  294  576:aload_0         
	//  295  577:getfield        #138 <Field s g>
	//  296  580:getfield        #299 <Field ByteBuffer com.google.ads.interactivemedia.v3.a.s.b>
	//  297  583:invokevirtual   #362 <Method int ByteBuffer.position()>
	//  298  586:istore          4
			j2 = g.c;
	//  299  588:aload_0         
	//  300  589:getfield        #138 <Field s g>
	//  301  592:getfield        #364 <Field int com.google.ads.interactivemedia.v3.a.s.c>
	//  302  595:istore          5
			l1 = g.e;
	//  303  597:aload_0         
	//  304  598:getfield        #138 <Field s g>
	//  305  601:getfield        #366 <Field long s.e>
	//  306  604:lstore_1        
			if(g.b())
	//* 307  605:aload_0         
	//* 308  606:getfield        #138 <Field s g>
	//* 309  609:invokevirtual   #368 <Method boolean com.google.ads.interactivemedia.v3.a.s.b()>
	//* 310  612:ifeq            629
				i.add(((Object) (Long.valueOf(l1))));
	//  311  615:aload_0         
	//  312  616:getfield        #148 <Field List i>
	//  313  619:lload_1         
	//  314  620:invokestatic    #374 <Method Long Long.valueOf(long)>
	//  315  623:invokeinterface #377 <Method boolean List.add(Object)>
	//  316  628:pop             
			a(l1, g.b, k1, flag);
	//  317  629:aload_0         
	//  318  630:lload_1         
	//  319  631:aload_0         
	//  320  632:getfield        #138 <Field s g>
	//  321  635:getfield        #299 <Field ByteBuffer com.google.ads.interactivemedia.v3.a.s.b>
	//  322  638:iload           4
	//  323  640:iload_3         
	//  324  641:invokevirtual   #380 <Method void a(long, ByteBuffer, int, boolean)>
		}
	//* 325  644:iload_3         
	//* 326  645:ifeq            681
	//* 327  648:aload_0         
	//* 328  649:getfield        #138 <Field s g>
	//* 329  652:iload           4
	//* 330  654:iload           5
	//* 331  656:isub            
	//* 332  657:invokestatic    #382 <Method android.media.MediaCodec$CryptoInfo a(s, int)>
	//* 333  660:astore          6
	//* 334  662:aload_0         
	//* 335  663:getfield        #235 <Field MediaCodec o>
	//* 336  666:aload_0         
	//* 337  667:getfield        #291 <Field int B>
	//* 338  670:iconst_0        
	//* 339  671:aload           6
	//* 340  673:lload_1         
	//* 341  674:iconst_0        
	//* 342  675:invokevirtual   #386 <Method void MediaCodec.queueSecureInputBuffer(int, int, android.media.MediaCodec$CryptoInfo, long, int)>
	//* 343  678:goto            697
	//* 344  681:aload_0         
	//* 345  682:getfield        #235 <Field MediaCodec o>
	//* 346  685:aload_0         
	//* 347  686:getfield        #291 <Field int B>
	//* 348  689:iconst_0        
	//* 349  690:iload           4
	//* 350  692:lload_1         
	//* 351  693:iconst_0        
	//* 352  694:invokevirtual   #307 <Method void MediaCodec.queueInputBuffer(int, int, int, long, int)>
	//* 353  697:aload_0         
	//* 354  698:iconst_m1       
	//* 355  699:putfield        #291 <Field int B>
	//* 356  702:aload_0         
	//* 357  703:iconst_1        
	//* 358  704:putfield        #317 <Field boolean H>
	//* 359  707:aload_0         
	//* 360  708:iconst_0        
	//* 361  709:putfield        #155 <Field int F>
	//* 362  712:aload_0         
	//* 363  713:getfield        #131 <Field com.google.ads.interactivemedia.v3.a.c a>
	//* 364  716:astore          6
	//* 365  718:aload           6
	//* 366  720:aload           6
	//* 367  722:getfield        #387 <Field int com.google.ads.interactivemedia.v3.a.c.c>
	//* 368  725:iconst_1        
	//* 369  726:iadd            
	//* 370  727:putfield        #387 <Field int com.google.ads.interactivemedia.v3.a.c.c>
	//* 371  730:iconst_1        
	//* 372  731:ireturn         
		catch(android.media.MediaCodec.CryptoException cryptoexception1)
	//* 373  732:astore          6
		{
			a(cryptoexception1);
	//  374  734:aload_0         
	//  375  735:aload           6
	//  376  737:invokespecial   #343 <Method void a(android.media.MediaCodec$CryptoException)>
			throw new com.google.ads.interactivemedia.v3.a.f(((Throwable) (cryptoexception1)));
	//  377  740:new             #160 <Class com.google.ads.interactivemedia.v3.a.f>
	//  378  743:dup             
	//  379  744:aload           6
	//  380  746:invokespecial   #216 <Method void com.google.ads.interactivemedia.v3.a.f(Throwable)>
	//  381  749:athrow          
		}
		if(!flag)
			break MISSING_BLOCK_LABEL_681;
		obj = ((Object) (a(g, k1 - j2)));
		o.queueSecureInputBuffer(B, 0, ((android.media.MediaCodec.CryptoInfo) (obj)), l1, 0);
		break MISSING_BLOCK_LABEL_697;
		o.queueInputBuffer(B, 0, k1, l1, 0);
		B = -1;
		H = true;
		F = 0;
		obj = ((Object) (a));
		obj.c = ((com.google.ads.interactivemedia.v3.a.c) (obj)).c + 1;
		return true;
		return false;
	//  382  750:iconst_0        
	//  383  751:ireturn         
	}

	private static boolean a(String s1)
	{
		return q.a < 18 || q.a == 18 && ("OMX.SEC.avc.dec".equals(((Object) (s1))) || "OMX.SEC.avc.dec.secure".equals(((Object) (s1)))) || q.a == 19 && q.d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(((Object) (s1))) || "OMX.Exynos.avc.dec.secure".equals(((Object) (s1))));
	//    0    0:getstatic       #100 <Field int q.a>
	//    1    3:bipush          18
	//    2    5:icmplt          81
	//    3    8:getstatic       #100 <Field int q.a>
	//    4   11:bipush          18
	//    5   13:icmpne          36
	//    6   16:ldc2            #390 <String "OMX.SEC.avc.dec">
	//    7   19:aload_0         
	//    8   20:invokevirtual   #180 <Method boolean String.equals(Object)>
	//    9   23:ifne            81
	//   10   26:ldc2            #392 <String "OMX.SEC.avc.dec.secure">
	//   11   29:aload_0         
	//   12   30:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   13   33:ifne            81
	//   14   36:getstatic       #100 <Field int q.a>
	//   15   39:bipush          19
	//   16   41:icmpne          79
	//   17   44:getstatic       #394 <Field String q.d>
	//   18   47:ldc2            #396 <String "SM-G800">
	//   19   50:invokevirtual   #399 <Method boolean String.startsWith(String)>
	//   20   53:ifeq            79
	//   21   56:ldc2            #401 <String "OMX.Exynos.avc.dec">
	//   22   59:aload_0         
	//   23   60:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   24   63:ifne            81
	//   25   66:ldc2            #403 <String "OMX.Exynos.avc.dec.secure">
	//   26   69:aload_0         
	//   27   70:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   28   73:ifeq            79
	//   29   76:goto            81
	//   30   79:iconst_0        
	//   31   80:ireturn         
	//   32   81:iconst_1        
	//   33   82:ireturn         
	}

	private static boolean a(String s1, com.google.ads.interactivemedia.v3.a.p p1)
	{
		return q.a < 21 && p1.f.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(((Object) (s1)));
	//    0    0:getstatic       #100 <Field int q.a>
	//    1    3:bipush          21
	//    2    5:icmpge          32
	//    3    8:aload_1         
	//    4    9:getfield        #325 <Field List com.google.ads.interactivemedia.v3.a.p.f>
	//    5   12:invokeinterface #407 <Method boolean List.isEmpty()>
	//    6   17:ifeq            32
	//    7   20:ldc2            #409 <String "OMX.MTK.VIDEO.DECODER.AVC">
	//    8   23:aload_0         
	//    9   24:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   10   27:ifeq            32
	//   11   30:iconst_1        
	//   12   31:ireturn         
	//   13   32:iconst_0        
	//   14   33:ireturn         
	}

	private boolean a(boolean flag)
		throws com.google.ads.interactivemedia.v3.a.f
	{
		if(!D)
	//*   0    0:aload_0         
	//*   1    1:getfield        #411 <Field boolean D>
	//*   2    4:ifne            9
			return false;
	//    3    7:iconst_0        
	//    4    8:ireturn         
		int i1 = e.b();
	//    5    9:aload_0         
	//    6   10:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//    7   13:invokeinterface #415 <Method int com.google.ads.interactivemedia.v3.a.b.b.b()>
	//    8   18:istore_2        
		if(i1 != 0)
	//*   9   19:iload_2         
	//*  10   20:ifeq            43
			return i1 != 4 && (flag || !f);
	//   11   23:iload_2         
	//   12   24:iconst_4        
	//   13   25:icmpeq          41
	//   14   28:iload_1         
	//   15   29:ifne            39
	//   16   32:aload_0         
	//   17   33:getfield        #116 <Field boolean f>
	//   18   36:ifne            41
	//   19   39:iconst_1        
	//   20   40:ireturn         
	//   21   41:iconst_0        
	//   22   42:ireturn         
		else
			throw new com.google.ads.interactivemedia.v3.a.f(((Throwable) (e.d())));
	//   23   43:new             #160 <Class com.google.ads.interactivemedia.v3.a.f>
	//   24   46:dup             
	//   25   47:aload_0         
	//   26   48:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//   27   51:invokeinterface #418 <Method Exception com.google.ads.interactivemedia.v3.a.b.b.d()>
	//   28   56:invokespecial   #216 <Method void com.google.ads.interactivemedia.v3.a.f(Throwable)>
	//   29   59:athrow          
	}

	private MediaFormat b(com.google.ads.interactivemedia.v3.a.p p1)
	{
		p1 = ((com.google.ads.interactivemedia.v3.a.p) (p1.b()));
	//    0    0:aload_1         
	//    1    1:invokevirtual   #422 <Method MediaFormat com.google.ads.interactivemedia.v3.a.p.b()>
	//    2    4:astore_1        
		if(l)
	//*   3    5:aload_0         
	//*   4    6:getfield        #125 <Field boolean l>
	//*   5    9:ifeq            20
			((MediaFormat) (p1)).setInteger("auto-frc", 0);
	//    6   12:aload_1         
	//    7   13:ldc2            #424 <String "auto-frc">
	//    8   16:iconst_0        
	//    9   17:invokevirtual   #430 <Method void MediaFormat.setInteger(String, int)>
		return ((MediaFormat) (p1));
	//   10   20:aload_1         
	//   11   21:areturn         
	}

	private void b(a a1)
	{
		Handler handler = b;
	//    0    0:aload_0         
	//    1    1:getfield        #118 <Field Handler b>
	//    2    4:astore_2        
		if(handler != null && k != null)
	//*   3    5:aload_2         
	//*   4    6:ifnull          30
	//*   5    9:aload_0         
	//*   6   10:getfield        #120 <Field m$b k>
	//*   7   13:ifnull          30
			handler.post(((Runnable) (new w(this, a1) {

				public m read(com.google.ads.interactivemedia.v3.b.d.a a2)
					throws IOException
				{
					if(a2.f() == com.google.ads.interactivemedia.v3.b.d.b.i)
				//*   0    0:aload_1         
				//*   1    1:invokevirtual   #22  <Method com.google.ads.interactivemedia.v3.b.d.b com.google.ads.interactivemedia.v3.b.d.a.f()>
				//*   2    4:getstatic       #28  <Field com.google.ads.interactivemedia.v3.b.d.b com.google.ads.interactivemedia.v3.b.d.b.i>
				//*   3    7:if_acmpne       16
					{
						a2.j();
				//    4   10:aload_1         
				//    5   11:invokevirtual   #31  <Method void com.google.ads.interactivemedia.v3.b.d.a.j()>
						return null;
				//    6   14:aconst_null     
				//    7   15:areturn         
					} else
					{
						return new m(a2.h());
				//    8   16:new             #7   <Class m>
				//    9   19:dup             
				//   10   20:aload_1         
				//   11   21:invokevirtual   #35  <Method String com.google.ads.interactivemedia.v3.b.d.a.h()>
				//   12   24:invokespecial   #38  <Method void m(String)>
				//   13   27:areturn         
					}
				}

				public volatile Object read(com.google.ads.interactivemedia.v3.b.d.a a2)
					throws IOException
				{
					return ((Object) (read(a2)));
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:invokevirtual   #42  <Method m read(com.google.ads.interactivemedia.v3.b.d.a)>
				//    3    5:areturn         
				}

				public void write(com.google.ads.interactivemedia.v3.b.d.c c1, m m1)
					throws IOException
				{
					if(m1 == null)
				//*   0    0:aload_2         
				//*   1    1:ifnonnull       10
					{
						c1.f();
				//    2    4:aload_1         
				//    3    5:invokevirtual   #49  <Method com.google.ads.interactivemedia.v3.b.d.c com.google.ads.interactivemedia.v3.b.d.c.f()>
				//    4    8:pop             
						return;
				//    5    9:return          
					} else
					{
						c1.b(m1.getName());
				//    6   10:aload_1         
				//    7   11:aload_2         
				//    8   12:invokevirtual   #52  <Method String m.getName()>
				//    9   15:invokevirtual   #56  <Method com.google.ads.interactivemedia.v3.b.d.c com.google.ads.interactivemedia.v3.b.d.c.b(String)>
				//   10   18:pop             
						return;
				//   11   19:return          
					}
				}

				public volatile void write(com.google.ads.interactivemedia.v3.b.d.c c1, Object obj)
					throws IOException
				{
					write(c1, (m)obj);
				//    0    0:aload_0         
				//    1    1:aload_1         
				//    2    2:aload_2         
				//    3    3:checkcast       #7   <Class m>
				//    4    6:invokevirtual   #59  <Method void write(com.google.ads.interactivemedia.v3.b.d.c, m)>
				//    5    9:return          
				}

			}
)));
	//    8   16:aload_2         
	//    9   17:new             #6   <Class m$1>
	//   10   20:dup             
	//   11   21:aload_0         
	//   12   22:aload_1         
	//   13   23:invokespecial   #433 <Method void m$1(m, m$a)>
	//   14   26:invokevirtual   #210 <Method boolean Handler.post(Runnable)>
	//   15   29:pop             
	//   16   30:return          
	}

	private static boolean b(String s1)
	{
		return q.a < 24 && ("OMX.Nvidia.h264.decode".equals(((Object) (s1))) || "OMX.Nvidia.h264.decode.secure".equals(((Object) (s1)))) && (q.b.equals("flounder") || q.b.equals("flounder_lte") || q.b.equals("grouper") || q.b.equals("tilapia"));
	//    0    0:getstatic       #100 <Field int q.a>
	//    1    3:bipush          24
	//    2    5:icmpge          78
	//    3    8:ldc2            #435 <String "OMX.Nvidia.h264.decode">
	//    4   11:aload_0         
	//    5   12:invokevirtual   #180 <Method boolean String.equals(Object)>
	//    6   15:ifne            28
	//    7   18:ldc2            #437 <String "OMX.Nvidia.h264.decode.secure">
	//    8   21:aload_0         
	//    9   22:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   10   25:ifeq            78
	//   11   28:getstatic       #174 <Field String q.b>
	//   12   31:ldc2            #439 <String "flounder">
	//   13   34:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   14   37:ifne            76
	//   15   40:getstatic       #174 <Field String q.b>
	//   16   43:ldc2            #441 <String "flounder_lte">
	//   17   46:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   18   49:ifne            76
	//   19   52:getstatic       #174 <Field String q.b>
	//   20   55:ldc2            #443 <String "grouper">
	//   21   58:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   22   61:ifne            76
	//   23   64:getstatic       #174 <Field String q.b>
	//   24   67:ldc2            #445 <String "tilapia">
	//   25   70:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   26   73:ifeq            78
	//   27   76:iconst_1        
	//   28   77:ireturn         
	//   29   78:iconst_0        
	//   30   79:ireturn         
	}

	private static boolean b(String s1, com.google.ads.interactivemedia.v3.a.p p1)
	{
		return q.a <= 18 && p1.p == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(((Object) (s1)));
	//    0    0:getstatic       #100 <Field int q.a>
	//    1    3:bipush          18
	//    2    5:icmpgt          28
	//    3    8:aload_1         
	//    4    9:getfield        #447 <Field int com.google.ads.interactivemedia.v3.a.p.p>
	//    5   12:iconst_1        
	//    6   13:icmpne          28
	//    7   16:ldc2            #449 <String "OMX.MTK.AUDIO.DECODER.MP3">
	//    8   19:aload_0         
	//    9   20:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   10   23:ifeq            28
	//   11   26:iconst_1        
	//   12   27:ireturn         
	//   13   28:iconst_0        
	//   14   29:ireturn         
	}

	private static boolean c(String s1)
	{
		return q.a <= 17 && ("OMX.rk.video_decoder.avc".equals(((Object) (s1))) || "OMX.allwinner.video.decoder.avc".equals(((Object) (s1))));
	//    0    0:getstatic       #100 <Field int q.a>
	//    1    3:bipush          17
	//    2    5:icmpgt          30
	//    3    8:ldc2            #451 <String "OMX.rk.video_decoder.avc">
	//    4   11:aload_0         
	//    5   12:invokevirtual   #180 <Method boolean String.equals(Object)>
	//    6   15:ifne            28
	//    7   18:ldc2            #453 <String "OMX.allwinner.video.decoder.avc">
	//    8   21:aload_0         
	//    9   22:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   10   25:ifeq            30
	//   11   28:iconst_1        
	//   12   29:ireturn         
	//   13   30:iconst_0        
	//   14   31:ireturn         
	}

	private static boolean d(String s1)
	{
		return q.a <= 23 && "OMX.google.vorbis.decoder".equals(((Object) (s1))) || q.a <= 19 && "hb2000".equals(((Object) (q.b))) && ("OMX.amlogic.avc.decoder.awesome".equals(((Object) (s1))) || "OMX.amlogic.avc.decoder.awesome.secure".equals(((Object) (s1))));
	//    0    0:getstatic       #100 <Field int q.a>
	//    1    3:bipush          23
	//    2    5:icmpgt          18
	//    3    8:ldc2            #455 <String "OMX.google.vorbis.decoder">
	//    4   11:aload_0         
	//    5   12:invokevirtual   #180 <Method boolean String.equals(Object)>
	//    6   15:ifne            58
	//    7   18:getstatic       #100 <Field int q.a>
	//    8   21:bipush          19
	//    9   23:icmpgt          60
	//   10   26:ldc2            #457 <String "hb2000">
	//   11   29:getstatic       #174 <Field String q.b>
	//   12   32:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   13   35:ifeq            60
	//   14   38:ldc2            #459 <String "OMX.amlogic.avc.decoder.awesome">
	//   15   41:aload_0         
	//   16   42:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   17   45:ifne            58
	//   18   48:ldc2            #461 <String "OMX.amlogic.avc.decoder.awesome.secure">
	//   19   51:aload_0         
	//   20   52:invokevirtual   #180 <Method boolean String.equals(Object)>
	//   21   55:ifeq            60
	//   22   58:iconst_1        
	//   23   59:ireturn         
	//   24   60:iconst_0        
	//   25   61:ireturn         
	}

	private void g(long l1)
		throws com.google.ads.interactivemedia.v3.a.f
	{
		if(a(l1, h, ((s) (null))) == -4)
	//*   0    0:aload_0         
	//*   1    1:lload_1         
	//*   2    2:aload_0         
	//*   3    3:getfield        #143 <Field com.google.ads.interactivemedia.v3.a.q h>
	//*   4    6:aconst_null     
	//*   5    7:invokevirtual   #336 <Method int a(long, com.google.ads.interactivemedia.v3.a.q, s)>
	//*   6   10:bipush          -4
	//*   7   12:icmpne          23
			a(h);
	//    8   15:aload_0         
	//    9   16:aload_0         
	//   10   17:getfield        #143 <Field com.google.ads.interactivemedia.v3.a.q h>
	//   11   20:invokevirtual   #341 <Method void a(com.google.ads.interactivemedia.v3.a.q)>
	//   12   23:return          
	}

	private int h(long l1)
	{
		int j1 = i.size();
	//    0    0:aload_0         
	//    1    1:getfield        #148 <Field List i>
	//    2    4:invokeinterface #329 <Method int List.size()>
	//    3    9:istore          4
		for(int i1 = 0; i1 < j1; i1++)
	//*   4   11:iconst_0        
	//*   5   12:istore_3        
	//*   6   13:iload_3         
	//*   7   14:iload           4
	//*   8   16:icmpge          49
			if(((Long)i.get(i1)).longValue() == l1)
	//*   9   19:aload_0         
	//*  10   20:getfield        #148 <Field List i>
	//*  11   23:iload_3         
	//*  12   24:invokeinterface #332 <Method Object List.get(int)>
	//*  13   29:checkcast       #370 <Class Long>
	//*  14   32:invokevirtual   #464 <Method long Long.longValue()>
	//*  15   35:lload_1         
	//*  16   36:lcmp            
	//*  17   37:ifne            42
				return i1;
	//   18   40:iload_3         
	//   19   41:ireturn         

	//   20   42:iload_3         
	//   21   43:iconst_1        
	//   22   44:iadd            
	//   23   45:istore_3        
	//*  24   46:goto            13
		return -1;
	//   25   49:iconst_m1       
	//   26   50:ireturn         
	}

	private void i()
		throws com.google.ads.interactivemedia.v3.a.f
	{
		Object obj = ((Object) (o.getOutputFormat()));
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field MediaCodec o>
	//    2    4:invokevirtual   #467 <Method MediaFormat MediaCodec.getOutputFormat()>
	//    3    7:astore_1        
		if(s && ((MediaFormat) (obj)).getInteger("width") == 32 && ((MediaFormat) (obj)).getInteger("height") == 32)
	//*   4    8:aload_0         
	//*   5    9:getfield        #469 <Field boolean s>
	//*   6   12:ifeq            45
	//*   7   15:aload_1         
	//*   8   16:ldc2            #471 <String "width">
	//*   9   19:invokevirtual   #475 <Method int MediaFormat.getInteger(String)>
	//*  10   22:bipush          32
	//*  11   24:icmpne          45
	//*  12   27:aload_1         
	//*  13   28:ldc2            #477 <String "height">
	//*  14   31:invokevirtual   #475 <Method int MediaFormat.getInteger(String)>
	//*  15   34:bipush          32
	//*  16   36:icmpne          45
		{
			x = true;
	//   17   39:aload_0         
	//   18   40:iconst_1        
	//   19   41:putfield        #261 <Field boolean x>
			return;
	//   20   44:return          
		}
		if(v)
	//*  21   45:aload_0         
	//*  22   46:getfield        #479 <Field boolean v>
	//*  23   49:ifeq            60
			((MediaFormat) (obj)).setInteger("channel-count", 1);
	//   24   52:aload_1         
	//   25   53:ldc2            #481 <String "channel-count">
	//   26   56:iconst_1        
	//   27   57:invokevirtual   #430 <Method void MediaFormat.setInteger(String, int)>
		a(o, ((MediaFormat) (obj)));
	//   28   60:aload_0         
	//   29   61:aload_0         
	//   30   62:getfield        #235 <Field MediaCodec o>
	//   31   65:aload_1         
	//   32   66:invokevirtual   #484 <Method void a(MediaCodec, MediaFormat)>
		obj = ((Object) (a));
	//   33   69:aload_0         
	//   34   70:getfield        #131 <Field com.google.ads.interactivemedia.v3.a.c a>
	//   35   73:astore_1        
		obj.d = ((com.google.ads.interactivemedia.v3.a.c) (obj)).d + 1;
	//   36   74:aload_1         
	//   37   75:aload_1         
	//   38   76:getfield        #486 <Field int com.google.ads.interactivemedia.v3.a.c.d>
	//   39   79:iconst_1        
	//   40   80:iadd            
	//   41   81:putfield        #486 <Field int com.google.ads.interactivemedia.v3.a.c.d>
	//   42   84:return          
	}

	protected e a(l l1, String s1, boolean flag)
		throws n.b
	{
		return l1.a(s1, flag);
	//    0    0:aload_1         
	//    1    1:aload_2         
	//    2    2:iload_3         
	//    3    3:invokeinterface #492 <Method e com.google.ads.interactivemedia.v3.a.l.a(String, boolean)>
	//    4    8:areturn         
	}

	protected void a(long l1)
		throws com.google.ads.interactivemedia.v3.a.f
	{
		J = 0;
	//    0    0:aload_0         
	//    1    1:iconst_0        
	//    2    2:putfield        #338 <Field int J>
		K = false;
	//    3    5:aload_0         
	//    4    6:iconst_0        
	//    5    7:putfield        #257 <Field boolean K>
		L = false;
	//    6   10:aload_0         
	//    7   11:iconst_0        
	//    8   12:putfield        #166 <Field boolean L>
		if(o != null)
	//*   9   15:aload_0         
	//*  10   16:getfield        #235 <Field MediaCodec o>
	//*  11   19:ifnull          26
			n();
	//   12   22:aload_0         
	//   13   23:invokevirtual   #494 <Method void n()>
	//   14   26:return          
	}

	protected void a(long l1, long l2, boolean flag)
		throws com.google.ads.interactivemedia.v3.a.f
	{
		int i1;
		if(flag)
	//*   0    0:iload           5
	//*   1    2:ifeq            26
		{
			int j1 = J;
	//    2    5:aload_0         
	//    3    6:getfield        #338 <Field int J>
	//    4    9:istore          7
			i1 = j1;
	//    5   11:iload           7
	//    6   13:istore          6
			if(j1 == 0)
	//*   7   15:iload           7
	//*   8   17:ifne            29
				i1 = 1;
	//    9   20:iconst_1        
	//   10   21:istore          6
		} else
	//*  11   23:goto            29
		{
			i1 = 0;
	//   12   26:iconst_0        
	//   13   27:istore          6
		}
		J = i1;
	//   14   29:aload_0         
	//   15   30:iload           6
	//   16   32:putfield        #338 <Field int J>
		if(m == null)
	//*  17   35:aload_0         
	//*  18   36:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//*  19   39:ifnonnull       47
			g(l1);
	//   20   42:aload_0         
	//   21   43:lload_1         
	//   22   44:invokespecial   #497 <Method void g(long)>
		j();
	//   23   47:aload_0         
	//   24   48:invokevirtual   #164 <Method void j()>
		if(o != null)
	//*  25   51:aload_0         
	//*  26   52:getfield        #235 <Field MediaCodec o>
	//*  27   55:ifnull          100
		{
			com.google.ads.interactivemedia.v3.a.f.p.a("drainAndFeed");
	//   28   58:ldc2            #499 <String "drainAndFeed">
	//   29   61:invokestatic    #504 <Method void p.a(String)>
			while(a(l1, l2)) ;
	//   30   64:aload_0         
	//   31   65:lload_1         
	//   32   66:lload_3         
	//   33   67:invokespecial   #506 <Method boolean a(long, long)>
	//   34   70:ifeq            76
	//*  35   73:goto            64
			if(a(l1, true))
	//*  36   76:aload_0         
	//*  37   77:lload_1         
	//*  38   78:iconst_1        
	//*  39   79:invokespecial   #508 <Method boolean a(long, boolean)>
	//*  40   82:ifeq            97
				while(a(l1, false)) ;
	//   41   85:aload_0         
	//   42   86:lload_1         
	//   43   87:iconst_0        
	//   44   88:invokespecial   #508 <Method boolean a(long, boolean)>
	//   45   91:ifeq            97
	//*  46   94:goto            85
			com.google.ads.interactivemedia.v3.a.f.p.a();
	//   47   97:invokestatic    #510 <Method void p.a()>
		}
		a.a();
	//   48  100:aload_0         
	//   49  101:getfield        #131 <Field com.google.ads.interactivemedia.v3.a.c a>
	//   50  104:invokevirtual   #511 <Method void com.google.ads.interactivemedia.v3.a.c.a()>
	//   51  107:return          
	}

	protected void a(long l1, ByteBuffer bytebuffer, int i1, boolean flag)
	{
	//    0    0:return          
	}

	protected void a(MediaCodec mediacodec, MediaFormat mediaformat)
		throws com.google.ads.interactivemedia.v3.a.f
	{
	//    0    0:return          
	}

	protected abstract void a(MediaCodec mediacodec, boolean flag, MediaFormat mediaformat, MediaCrypto mediacrypto);

	protected void a(com.google.ads.interactivemedia.v3.a.q q1)
		throws com.google.ads.interactivemedia.v3.a.f
	{
		com.google.ads.interactivemedia.v3.a.p p1 = m;
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//    2    4:astore_3        
		m = q1.a;
	//    3    5:aload_0         
	//    4    6:aload_1         
	//    5    7:getfield        #514 <Field com.google.ads.interactivemedia.v3.a.p com.google.ads.interactivemedia.v3.a.q.a>
	//    6   10:putfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
		n = q1.b;
	//    7   13:aload_0         
	//    8   14:aload_1         
	//    9   15:getfield        #516 <Field a com.google.ads.interactivemedia.v3.a.q.b>
	//   10   18:putfield        #518 <Field a n>
		if(com.google.ads.interactivemedia.v3.a.f.q.a(((Object) (m)), ((Object) (p1))))
	//*  11   21:aload_0         
	//*  12   22:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//*  13   25:aload_3         
	//*  14   26:invokestatic    #521 <Method boolean q.a(Object, Object)>
	//*  15   29:ifeq            33
			return;
	//   16   32:return          
		q1 = ((com.google.ads.interactivemedia.v3.a.q) (o));
	//   17   33:aload_0         
	//   18   34:getfield        #235 <Field MediaCodec o>
	//   19   37:astore_1        
		boolean flag = true;
	//   20   38:iconst_1        
	//   21   39:istore_2        
		if(q1 != null && a(((MediaCodec) (q1)), p, p1, m))
	//*  22   40:aload_1         
	//*  23   41:ifnull          117
	//*  24   44:aload_0         
	//*  25   45:aload_1         
	//*  26   46:aload_0         
	//*  27   47:getfield        #523 <Field boolean p>
	//*  28   50:aload_3         
	//*  29   51:aload_0         
	//*  30   52:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//*  31   55:invokevirtual   #526 <Method boolean a(MediaCodec, boolean, com.google.ads.interactivemedia.v3.a.p, com.google.ads.interactivemedia.v3.a.p)>
	//*  32   58:ifeq            117
		{
			E = true;
	//   33   61:aload_0         
	//   34   62:iconst_1        
	//   35   63:putfield        #528 <Field boolean E>
			F = 1;
	//   36   66:aload_0         
	//   37   67:iconst_1        
	//   38   68:putfield        #155 <Field int F>
			if(!s || m.h != p1.h || m.i != p1.i)
	//*  39   71:aload_0         
	//*  40   72:getfield        #469 <Field boolean s>
	//*  41   75:ifeq            109
	//*  42   78:aload_0         
	//*  43   79:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//*  44   82:getfield        #530 <Field int p.h>
	//*  45   85:aload_3         
	//*  46   86:getfield        #530 <Field int p.h>
	//*  47   89:icmpne          109
	//*  48   92:aload_0         
	//*  49   93:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//*  50   96:getfield        #532 <Field int p.i>
	//*  51   99:aload_3         
	//*  52  100:getfield        #532 <Field int p.i>
	//*  53  103:icmpne          109
	//*  54  106:goto            111
				flag = false;
	//   55  109:iconst_0        
	//   56  110:istore_2        
			w = flag;
	//   57  111:aload_0         
	//   58  112:iload_2         
	//   59  113:putfield        #309 <Field boolean w>
			return;
	//   60  116:return          
		}
		if(H)
	//*  61  117:aload_0         
	//*  62  118:getfield        #317 <Field boolean H>
	//*  63  121:ifeq            130
		{
			G = 1;
	//   64  124:aload_0         
	//   65  125:iconst_1        
	//   66  126:putfield        #157 <Field int G>
			return;
	//   67  129:return          
		} else
		{
			m();
	//   68  130:aload_0         
	//   69  131:invokevirtual   #162 <Method void m()>
			j();
	//   70  134:aload_0         
	//   71  135:invokevirtual   #164 <Method void j()>
			return;
	//   72  138:return          
		}
	}

	protected abstract boolean a(long l1, long l2, MediaCodec mediacodec, ByteBuffer bytebuffer, android.media.MediaCodec.BufferInfo bufferinfo, 
			int i1, boolean flag)
		throws com.google.ads.interactivemedia.v3.a.f;

	protected boolean a(MediaCodec mediacodec, boolean flag, com.google.ads.interactivemedia.v3.a.p p1, com.google.ads.interactivemedia.v3.a.p p2)
	{
		return false;
	//    0    0:iconst_0        
	//    1    1:ireturn         
	}

	protected abstract boolean a(l l1, com.google.ads.interactivemedia.v3.a.p p1)
		throws n.b;

	protected final boolean a(com.google.ads.interactivemedia.v3.a.p p1)
		throws n.b
	{
		return a(d, p1);
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #112 <Field l d>
	//    3    5:aload_1         
	//    4    6:invokevirtual   #536 <Method boolean a(l, com.google.ads.interactivemedia.v3.a.p)>
	//    5    9:ireturn         
	}

	protected void b(long l1)
	{
	//    0    0:return          
	}

	protected void c()
	{
	//    0    0:return          
	}

	protected void d()
	{
	//    0    0:return          
	}

	protected boolean e()
	{
		return L;
	//    0    0:aload_0         
	//    1    1:getfield        #166 <Field boolean L>
	//    2    4:ireturn         
	}

	protected boolean f()
	{
		return m != null && !M && (J != 0 || C >= 0 || a());
	//    0    0:aload_0         
	//    1    1:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//    2    4:ifnull          37
	//    3    7:aload_0         
	//    4    8:getfield        #319 <Field boolean M>
	//    5   11:ifne            37
	//    6   14:aload_0         
	//    7   15:getfield        #338 <Field int J>
	//    8   18:ifne            35
	//    9   21:aload_0         
	//   10   22:getfield        #233 <Field int C>
	//   11   25:ifge            35
	//   12   28:aload_0         
	//   13   29:invokespecial   #537 <Method boolean a()>
	//   14   32:ifeq            37
	//   15   35:iconst_1        
	//   16   36:ireturn         
	//   17   37:iconst_0        
	//   18   38:ireturn         
	}

	protected void g()
		throws com.google.ads.interactivemedia.v3.a.f
	{
		m = null;
	//    0    0:aload_0         
	//    1    1:aconst_null     
	//    2    2:putfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
		n = null;
	//    3    5:aload_0         
	//    4    6:aconst_null     
	//    5    7:putfield        #518 <Field a n>
		m();
	//    6   10:aload_0         
	//    7   11:invokevirtual   #162 <Method void m()>
		if(D)
	//*   8   14:aload_0         
	//*   9   15:getfield        #411 <Field boolean D>
	//*  10   18:ifeq            35
		{
			e.a();
	//   11   21:aload_0         
	//   12   22:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//   13   25:invokeinterface #538 <Method void com.google.ads.interactivemedia.v3.a.b.b.a()>
			D = false;
	//   14   30:aload_0         
	//   15   31:iconst_0        
	//   16   32:putfield        #411 <Field boolean D>
		}
		super.g();
	//   17   35:aload_0         
	//   18   36:invokespecial   #540 <Method void u.g()>
		return;
	//   19   39:return          
		Exception exception;
		exception;
	//   20   40:astore_1        
		super.g();
	//   21   41:aload_0         
	//   22   42:invokespecial   #540 <Method void u.g()>
		throw exception;
	//   23   45:aload_1         
	//   24   46:athrow          
		exception;
	//   25   47:astore_1        
		if(D)
	//*  26   48:aload_0         
	//*  27   49:getfield        #411 <Field boolean D>
	//*  28   52:ifeq            69
		{
			e.a();
	//   29   55:aload_0         
	//   30   56:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//   31   59:invokeinterface #538 <Method void com.google.ads.interactivemedia.v3.a.b.b.a()>
			D = false;
	//   32   64:aload_0         
	//   33   65:iconst_0        
	//   34   66:putfield        #411 <Field boolean D>
		}
		super.g();
	//   35   69:aload_0         
	//   36   70:invokespecial   #540 <Method void u.g()>
		throw exception;
	//   37   73:aload_1         
	//   38   74:athrow          
		exception;
	//   39   75:astore_1        
		super.g();
	//   40   76:aload_0         
	//   41   77:invokespecial   #540 <Method void u.g()>
		throw exception;
	//   42   80:aload_1         
	//   43   81:athrow          
	}

	protected void h()
	{
	//    0    0:return          
	}

	protected final void j()
		throws com.google.ads.interactivemedia.v3.a.f
	{
		if(!k())
	//*   0    0:aload_0         
	//*   1    1:invokevirtual   #544 <Method boolean k()>
	//*   2    4:ifne            8
			return;
	//    3    7:return          
		Object obj1 = ((Object) (m.b));
	//    4    8:aload_0         
	//    5    9:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//    6   12:getfield        #545 <Field String com.google.ads.interactivemedia.v3.a.p.b>
	//    7   15:astore          8
		Object obj = ((Object) (n));
	//    8   17:aload_0         
	//    9   18:getfield        #518 <Field a n>
	//   10   21:astore          7
		boolean flag;
		if(obj != null)
	//*  11   23:aload           7
	//*  12   25:ifnull          148
		{
			com.google.ads.interactivemedia.v3.a.b.b b1 = e;
	//   13   28:aload_0         
	//   14   29:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//   15   32:astore          9
			if(b1 != null)
	//*  16   34:aload           9
	//*  17   36:ifnull          137
			{
				if(!D)
	//*  18   39:aload_0         
	//*  19   40:getfield        #411 <Field boolean D>
	//*  20   43:ifne            60
				{
					b1.a(((com.google.ads.interactivemedia.v3.a.b.a) (obj)));
	//   21   46:aload           9
	//   22   48:aload           7
	//   23   50:invokeinterface #548 <Method void com.google.ads.interactivemedia.v3.a.b.b.a(a)>
					D = true;
	//   24   55:aload_0         
	//   25   56:iconst_1        
	//   26   57:putfield        #411 <Field boolean D>
				}
				int i1 = e.b();
	//   27   60:aload_0         
	//   28   61:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//   29   64:invokeinterface #415 <Method int com.google.ads.interactivemedia.v3.a.b.b.b()>
	//   30   69:istore_1        
				if(i1 != 0)
	//*  31   70:iload_1         
	//*  32   71:ifeq            120
				{
					if(i1 != 3 && i1 != 4)
	//*  33   74:iload_1         
	//*  34   75:iconst_3        
	//*  35   76:icmpeq          88
	//*  36   79:iload_1         
	//*  37   80:iconst_4        
	//*  38   81:icmpne          87
	//*  39   84:goto            88
						return;
	//   40   87:return          
					obj = ((Object) (((d)e.c()).a()));
	//   41   88:aload_0         
	//   42   89:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//   43   92:invokeinterface #551 <Method com.google.ads.interactivemedia.v3.a.b.c com.google.ads.interactivemedia.v3.a.b.b.c()>
	//   44   97:checkcast       #553 <Class d>
	//   45  100:invokevirtual   #556 <Method MediaCrypto d.a()>
	//   46  103:astore          7
					flag = e.a(((String) (obj1)));
	//   47  105:aload_0         
	//   48  106:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//   49  109:aload           8
	//   50  111:invokeinterface #558 <Method boolean com.google.ads.interactivemedia.v3.a.b.b.a(String)>
	//   51  116:istore_2        
				} else
	//*  52  117:goto            153
				{
					throw new com.google.ads.interactivemedia.v3.a.f(((Throwable) (e.d())));
	//   53  120:new             #160 <Class com.google.ads.interactivemedia.v3.a.f>
	//   54  123:dup             
	//   55  124:aload_0         
	//   56  125:getfield        #114 <Field com.google.ads.interactivemedia.v3.a.b.b e>
	//   57  128:invokeinterface #418 <Method Exception com.google.ads.interactivemedia.v3.a.b.b.d()>
	//   58  133:invokespecial   #216 <Method void com.google.ads.interactivemedia.v3.a.f(Throwable)>
	//   59  136:athrow          
				}
			} else
			{
				throw new com.google.ads.interactivemedia.v3.a.f("Media requires a DrmSessionManager");
	//   60  137:new             #160 <Class com.google.ads.interactivemedia.v3.a.f>
	//   61  140:dup             
	//   62  141:ldc2            #560 <String "Media requires a DrmSessionManager">
	//   63  144:invokespecial   #562 <Method void com.google.ads.interactivemedia.v3.a.f(String)>
	//   64  147:athrow          
			}
		} else
		{
			obj = null;
	//   65  148:aconst_null     
	//   66  149:astore          7
			flag = false;
	//   67  151:iconst_0        
	//   68  152:istore_2        
		}
		try
		{
			obj1 = ((Object) (a(d, ((String) (obj1)), flag)));
	//   69  153:aload_0         
	//   70  154:aload_0         
	//   71  155:getfield        #112 <Field l d>
	//   72  158:aload           8
	//   73  160:iload_2         
	//   74  161:invokevirtual   #564 <Method e a(l, String, boolean)>
	//   75  164:astore          8
		}
	//*  76  166:goto            195
		// Misplaced declaration of an exception variable
		catch(Object obj1)
	//*  77  169:astore          8
		{
			a(new a(m, ((Throwable) (obj1)), flag, -49998));
	//   78  171:aload_0         
	//   79  172:new             #12  <Class m$a>
	//   80  175:dup             
	//   81  176:aload_0         
	//   82  177:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//   83  180:aload           8
	//   84  182:iload_2         
	//   85  183:ldc2            #565 <Int -49998>
	//   86  186:invokespecial   #568 <Method void m$a(com.google.ads.interactivemedia.v3.a.p, Throwable, boolean, int)>
	//   87  189:invokespecial   #570 <Method void a(m$a)>
			obj1 = null;
	//   88  192:aconst_null     
	//   89  193:astore          8
		}
		if(obj1 == null)
	//*  90  195:aload           8
	//*  91  197:ifnonnull       220
			a(new a(m, ((Throwable) (null)), flag, -49999));
	//   92  200:aload_0         
	//   93  201:new             #12  <Class m$a>
	//   94  204:dup             
	//   95  205:aload_0         
	//   96  206:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//   97  209:aconst_null     
	//   98  210:iload_2         
	//   99  211:ldc2            #571 <Int -49999>
	//  100  214:invokespecial   #568 <Method void m$a(com.google.ads.interactivemedia.v3.a.p, Throwable, boolean, int)>
	//  101  217:invokespecial   #570 <Method void a(m$a)>
		String s1 = ((e) (obj1)).a;
	//  102  220:aload           8
	//  103  222:getfield        #575 <Field String com.google.ads.interactivemedia.v3.a.e.a>
	//  104  225:astore          9
		p = ((e) (obj1)).c;
	//  105  227:aload_0         
	//  106  228:aload           8
	//  107  230:getfield        #577 <Field boolean com.google.ads.interactivemedia.v3.a.e.c>
	//  108  233:putfield        #523 <Field boolean p>
		q = a(s1, m);
	//  109  236:aload_0         
	//  110  237:aload           9
	//  111  239:aload_0         
	//  112  240:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//  113  243:invokestatic    #579 <Method boolean a(String, com.google.ads.interactivemedia.v3.a.p)>
	//  114  246:putfield        #354 <Field boolean q>
		r = a(s1);
	//  115  249:aload_0         
	//  116  250:aload           9
	//  117  252:invokestatic    #580 <Method boolean a(String)>
	//  118  255:putfield        #582 <Field boolean r>
		s = b(s1);
	//  119  258:aload_0         
	//  120  259:aload           9
	//  121  261:invokestatic    #584 <Method boolean b(String)>
	//  122  264:putfield        #469 <Field boolean s>
		t = c(s1);
	//  123  267:aload_0         
	//  124  268:aload           9
	//  125  270:invokestatic    #586 <Method boolean c(String)>
	//  126  273:putfield        #255 <Field boolean t>
		u = d(s1);
	//  127  276:aload_0         
	//  128  277:aload           9
	//  129  279:invokestatic    #588 <Method boolean d(String)>
	//  130  282:putfield        #590 <Field boolean u>
		v = b(s1, m);
	//  131  285:aload_0         
	//  132  286:aload           9
	//  133  288:aload_0         
	//  134  289:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//  135  292:invokestatic    #592 <Method boolean b(String, com.google.ads.interactivemedia.v3.a.p)>
	//  136  295:putfield        #479 <Field boolean v>
		try
		{
			long l1 = SystemClock.elapsedRealtime();
	//  137  298:invokestatic    #226 <Method long SystemClock.elapsedRealtime()>
	//  138  301:lstore_3        
			StringBuilder stringbuilder = new StringBuilder(String.valueOf(((Object) (s1))).length() + 19);
	//  139  302:new             #594 <Class StringBuilder>
	//  140  305:dup             
	//  141  306:aload           9
	//  142  308:invokestatic    #597 <Method String String.valueOf(Object)>
	//  143  311:invokevirtual   #600 <Method int String.length()>
	//  144  314:bipush          19
	//  145  316:iadd            
	//  146  317:invokespecial   #601 <Method void StringBuilder(int)>
	//  147  320:astore          10
			stringbuilder.append("createByCodecName(");
	//  148  322:aload           10
	//  149  324:ldc2            #603 <String "createByCodecName(">
	//  150  327:invokevirtual   #607 <Method StringBuilder StringBuilder.append(String)>
	//  151  330:pop             
			stringbuilder.append(s1);
	//  152  331:aload           10
	//  153  333:aload           9
	//  154  335:invokevirtual   #607 <Method StringBuilder StringBuilder.append(String)>
	//  155  338:pop             
			stringbuilder.append(")");
	//  156  339:aload           10
	//  157  341:ldc2            #609 <String ")">
	//  158  344:invokevirtual   #607 <Method StringBuilder StringBuilder.append(String)>
	//  159  347:pop             
			com.google.ads.interactivemedia.v3.a.f.p.a(stringbuilder.toString());
	//  160  348:aload           10
	//  161  350:invokevirtual   #613 <Method String StringBuilder.toString()>
	//  162  353:invokestatic    #504 <Method void p.a(String)>
			o = MediaCodec.createByCodecName(s1);
	//  163  356:aload_0         
	//  164  357:aload           9
	//  165  359:invokestatic    #617 <Method MediaCodec MediaCodec.createByCodecName(String)>
	//  166  362:putfield        #235 <Field MediaCodec o>
			com.google.ads.interactivemedia.v3.a.f.p.a();
	//  167  365:invokestatic    #510 <Method void p.a()>
			com.google.ads.interactivemedia.v3.a.f.p.a("configureCodec");
	//  168  368:ldc2            #619 <String "configureCodec">
	//  169  371:invokestatic    #504 <Method void p.a(String)>
			a(o, ((e) (obj1)).c, b(m), ((MediaCrypto) (obj)));
	//  170  374:aload_0         
	//  171  375:aload_0         
	//  172  376:getfield        #235 <Field MediaCodec o>
	//  173  379:aload           8
	//  174  381:getfield        #577 <Field boolean com.google.ads.interactivemedia.v3.a.e.c>
	//  175  384:aload_0         
	//  176  385:aload_0         
	//  177  386:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//  178  389:invokespecial   #621 <Method MediaFormat b(com.google.ads.interactivemedia.v3.a.p)>
	//  179  392:aload           7
	//  180  394:invokevirtual   #623 <Method void a(MediaCodec, boolean, MediaFormat, MediaCrypto)>
			com.google.ads.interactivemedia.v3.a.f.p.a();
	//  181  397:invokestatic    #510 <Method void p.a()>
			com.google.ads.interactivemedia.v3.a.f.p.a("codec.start()");
	//  182  400:ldc2            #625 <String "codec.start()">
	//  183  403:invokestatic    #504 <Method void p.a(String)>
			o.start();
	//  184  406:aload_0         
	//  185  407:getfield        #235 <Field MediaCodec o>
	//  186  410:invokevirtual   #628 <Method void MediaCodec.start()>
			com.google.ads.interactivemedia.v3.a.f.p.a();
	//  187  413:invokestatic    #510 <Method void p.a()>
			long l3 = SystemClock.elapsedRealtime();
	//  188  416:invokestatic    #226 <Method long SystemClock.elapsedRealtime()>
	//  189  419:lstore          5
			a(s1, l3, l3 - l1);
	//  190  421:aload_0         
	//  191  422:aload           9
	//  192  424:lload           5
	//  193  426:lload           5
	//  194  428:lload_3         
	//  195  429:lsub            
	//  196  430:invokespecial   #630 <Method void a(String, long, long)>
			y = o.getInputBuffers();
	//  197  433:aload_0         
	//  198  434:aload_0         
	//  199  435:getfield        #235 <Field MediaCodec o>
	//  200  438:invokevirtual   #633 <Method ByteBuffer[] MediaCodec.getInputBuffers()>
	//  201  441:putfield        #296 <Field ByteBuffer[] y>
			z = o.getOutputBuffers();
	//  202  444:aload_0         
	//  203  445:aload_0         
	//  204  446:getfield        #235 <Field MediaCodec o>
	//  205  449:invokevirtual   #249 <Method ByteBuffer[] MediaCodec.getOutputBuffers()>
	//  206  452:putfield        #251 <Field ByteBuffer[] z>
		}
	//* 207  455:goto            480
		catch(Exception exception)
	//* 208  458:astore          7
		{
			a(new a(m, ((Throwable) (exception)), flag, s1));
	//  209  460:aload_0         
	//  210  461:new             #12  <Class m$a>
	//  211  464:dup             
	//  212  465:aload_0         
	//  213  466:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//  214  469:aload           7
	//  215  471:iload_2         
	//  216  472:aload           9
	//  217  474:invokespecial   #636 <Method void m$a(com.google.ads.interactivemedia.v3.a.p, Throwable, boolean, String)>
	//  218  477:invokespecial   #570 <Method void a(m$a)>
		}
		long l2;
		if(v() == 3)
	//* 219  480:aload_0         
	//* 220  481:invokevirtual   #638 <Method int v()>
	//* 221  484:iconst_3        
	//* 222  485:icmpne          495
			l2 = SystemClock.elapsedRealtime();
	//  223  488:invokestatic    #226 <Method long SystemClock.elapsedRealtime()>
	//  224  491:lstore_3        
		else
	//* 225  492:goto            499
			l2 = -1L;
	//  226  495:ldc2w           #639 <Long -1L>
	//  227  498:lstore_3        
		A = l2;
	//  228  499:aload_0         
	//  229  500:lload_3         
	//  230  501:putfield        #228 <Field long A>
		B = -1;
	//  231  504:aload_0         
	//  232  505:iconst_m1       
	//  233  506:putfield        #291 <Field int B>
		C = -1;
	//  234  509:aload_0         
	//  235  510:iconst_m1       
	//  236  511:putfield        #233 <Field int C>
		N = true;
	//  237  514:aload_0         
	//  238  515:iconst_1        
	//  239  516:putfield        #345 <Field boolean N>
		exception = ((Exception) (a));
	//  240  519:aload_0         
	//  241  520:getfield        #131 <Field com.google.ads.interactivemedia.v3.a.c a>
	//  242  523:astore          7
		exception.a = ((com.google.ads.interactivemedia.v3.a.c) (exception)).a + 1;
	//  243  525:aload           7
	//  244  527:aload           7
	//  245  529:getfield        #641 <Field int com.google.ads.interactivemedia.v3.a.c.a>
	//  246  532:iconst_1        
	//  247  533:iadd            
	//  248  534:putfield        #641 <Field int com.google.ads.interactivemedia.v3.a.c.a>
	//  249  537:return          
	}

	protected boolean k()
	{
		return o == null && m != null;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field MediaCodec o>
	//    2    4:ifnonnull       16
	//    3    7:aload_0         
	//    4    8:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//    5   11:ifnull          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	protected final boolean l()
	{
		return o != null;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field MediaCodec o>
	//    2    4:ifnull          9
	//    3    7:iconst_1        
	//    4    8:ireturn         
	//    5    9:iconst_0        
	//    6   10:ireturn         
	}

	protected void m()
	{
		if(o == null)
			break MISSING_BLOCK_LABEL_184;
	//    0    0:aload_0         
	//    1    1:getfield        #235 <Field MediaCodec o>
	//    2    4:ifnull          184
		A = -1L;
	//    3    7:aload_0         
	//    4    8:ldc2w           #639 <Long -1L>
	//    5   11:putfield        #228 <Field long A>
		B = -1;
	//    6   14:aload_0         
	//    7   15:iconst_m1       
	//    8   16:putfield        #291 <Field int B>
		C = -1;
	//    9   19:aload_0         
	//   10   20:iconst_m1       
	//   11   21:putfield        #233 <Field int C>
		M = false;
	//   12   24:aload_0         
	//   13   25:iconst_0        
	//   14   26:putfield        #319 <Field boolean M>
		i.clear();
	//   15   29:aload_0         
	//   16   30:getfield        #148 <Field List i>
	//   17   33:invokeinterface #644 <Method void List.clear()>
		y = null;
	//   18   38:aload_0         
	//   19   39:aconst_null     
	//   20   40:putfield        #296 <Field ByteBuffer[] y>
		z = null;
	//   21   43:aload_0         
	//   22   44:aconst_null     
	//   23   45:putfield        #251 <Field ByteBuffer[] z>
		E = false;
	//   24   48:aload_0         
	//   25   49:iconst_0        
	//   26   50:putfield        #528 <Field boolean E>
		H = false;
	//   27   53:aload_0         
	//   28   54:iconst_0        
	//   29   55:putfield        #317 <Field boolean H>
		p = false;
	//   30   58:aload_0         
	//   31   59:iconst_0        
	//   32   60:putfield        #523 <Field boolean p>
		q = false;
	//   33   63:aload_0         
	//   34   64:iconst_0        
	//   35   65:putfield        #354 <Field boolean q>
		r = false;
	//   36   68:aload_0         
	//   37   69:iconst_0        
	//   38   70:putfield        #582 <Field boolean r>
		s = false;
	//   39   73:aload_0         
	//   40   74:iconst_0        
	//   41   75:putfield        #469 <Field boolean s>
		t = false;
	//   42   78:aload_0         
	//   43   79:iconst_0        
	//   44   80:putfield        #255 <Field boolean t>
		u = false;
	//   45   83:aload_0         
	//   46   84:iconst_0        
	//   47   85:putfield        #590 <Field boolean u>
		v = false;
	//   48   88:aload_0         
	//   49   89:iconst_0        
	//   50   90:putfield        #479 <Field boolean v>
		w = false;
	//   51   93:aload_0         
	//   52   94:iconst_0        
	//   53   95:putfield        #309 <Field boolean w>
		x = false;
	//   54   98:aload_0         
	//   55   99:iconst_0        
	//   56  100:putfield        #261 <Field boolean x>
		I = false;
	//   57  103:aload_0         
	//   58  104:iconst_0        
	//   59  105:putfield        #303 <Field boolean I>
		F = 0;
	//   60  108:aload_0         
	//   61  109:iconst_0        
	//   62  110:putfield        #155 <Field int F>
		G = 0;
	//   63  113:aload_0         
	//   64  114:iconst_0        
	//   65  115:putfield        #157 <Field int G>
		com.google.ads.interactivemedia.v3.a.c c1 = a;
	//   66  118:aload_0         
	//   67  119:getfield        #131 <Field com.google.ads.interactivemedia.v3.a.c a>
	//   68  122:astore_1        
		c1.b = c1.b + 1;
	//   69  123:aload_1         
	//   70  124:aload_1         
	//   71  125:getfield        #646 <Field int com.google.ads.interactivemedia.v3.a.c.b>
	//   72  128:iconst_1        
	//   73  129:iadd            
	//   74  130:putfield        #646 <Field int com.google.ads.interactivemedia.v3.a.c.b>
		o.stop();
	//   75  133:aload_0         
	//   76  134:getfield        #235 <Field MediaCodec o>
	//   77  137:invokevirtual   #649 <Method void MediaCodec.stop()>
		o.release();
	//   78  140:aload_0         
	//   79  141:getfield        #235 <Field MediaCodec o>
	//   80  144:invokevirtual   #652 <Method void MediaCodec.release()>
		o = null;
	//   81  147:aload_0         
	//   82  148:aconst_null     
	//   83  149:putfield        #235 <Field MediaCodec o>
		return;
	//   84  152:return          
		Exception exception;
		exception;
	//   85  153:astore_1        
		o = null;
	//   86  154:aload_0         
	//   87  155:aconst_null     
	//   88  156:putfield        #235 <Field MediaCodec o>
		throw exception;
	//   89  159:aload_1         
	//   90  160:athrow          
		exception;
	//   91  161:astore_1        
		o.release();
	//   92  162:aload_0         
	//   93  163:getfield        #235 <Field MediaCodec o>
	//   94  166:invokevirtual   #652 <Method void MediaCodec.release()>
		o = null;
	//   95  169:aload_0         
	//   96  170:aconst_null     
	//   97  171:putfield        #235 <Field MediaCodec o>
		throw exception;
	//   98  174:aload_1         
	//   99  175:athrow          
		exception;
	//  100  176:astore_1        
		o = null;
	//  101  177:aload_0         
	//  102  178:aconst_null     
	//  103  179:putfield        #235 <Field MediaCodec o>
		throw exception;
	//  104  182:aload_1         
	//  105  183:athrow          
	//  106  184:return          
	}

	protected void n()
		throws com.google.ads.interactivemedia.v3.a.f
	{
		A = -1L;
	//    0    0:aload_0         
	//    1    1:ldc2w           #639 <Long -1L>
	//    2    4:putfield        #228 <Field long A>
		B = -1;
	//    3    7:aload_0         
	//    4    8:iconst_m1       
	//    5    9:putfield        #291 <Field int B>
		C = -1;
	//    6   12:aload_0         
	//    7   13:iconst_m1       
	//    8   14:putfield        #233 <Field int C>
		N = true;
	//    9   17:aload_0         
	//   10   18:iconst_1        
	//   11   19:putfield        #345 <Field boolean N>
		M = false;
	//   12   22:aload_0         
	//   13   23:iconst_0        
	//   14   24:putfield        #319 <Field boolean M>
		i.clear();
	//   15   27:aload_0         
	//   16   28:getfield        #148 <Field List i>
	//   17   31:invokeinterface #644 <Method void List.clear()>
		w = false;
	//   18   36:aload_0         
	//   19   37:iconst_0        
	//   20   38:putfield        #309 <Field boolean w>
		x = false;
	//   21   41:aload_0         
	//   22   42:iconst_0        
	//   23   43:putfield        #261 <Field boolean x>
		if(!r && (!u || !I))
	//*  24   46:aload_0         
	//*  25   47:getfield        #582 <Field boolean r>
	//*  26   50:ifne            103
	//*  27   53:aload_0         
	//*  28   54:getfield        #590 <Field boolean u>
	//*  29   57:ifeq            70
	//*  30   60:aload_0         
	//*  31   61:getfield        #303 <Field boolean I>
	//*  32   64:ifeq            70
	//*  33   67:goto            103
		{
			if(G != 0)
	//*  34   70:aload_0         
	//*  35   71:getfield        #157 <Field int G>
	//*  36   74:ifeq            88
			{
				m();
	//   37   77:aload_0         
	//   38   78:invokevirtual   #162 <Method void m()>
				j();
	//   39   81:aload_0         
	//   40   82:invokevirtual   #164 <Method void j()>
			} else
	//*  41   85:goto            111
			{
				o.flush();
	//   42   88:aload_0         
	//   43   89:getfield        #235 <Field MediaCodec o>
	//   44   92:invokevirtual   #655 <Method void MediaCodec.flush()>
				H = false;
	//   45   95:aload_0         
	//   46   96:iconst_0        
	//   47   97:putfield        #317 <Field boolean H>
			}
		} else
	//*  48  100:goto            111
		{
			m();
	//   49  103:aload_0         
	//   50  104:invokevirtual   #162 <Method void m()>
			j();
	//   51  107:aload_0         
	//   52  108:invokevirtual   #164 <Method void j()>
		}
		if(E && m != null)
	//*  53  111:aload_0         
	//*  54  112:getfield        #528 <Field boolean E>
	//*  55  115:ifeq            130
	//*  56  118:aload_0         
	//*  57  119:getfield        #321 <Field com.google.ads.interactivemedia.v3.a.p m>
	//*  58  122:ifnull          130
			F = 1;
	//   59  125:aload_0         
	//   60  126:iconst_1        
	//   61  127:putfield        #155 <Field int F>
	//   62  130:return          
	}

	protected final int o()
	{
		return J;
	//    0    0:aload_0         
	//    1    1:getfield        #338 <Field int J>
	//    2    4:ireturn         
	}

	protected long p()
	{
		return 0L;
	//    0    0:lconst_0        
	//    1    1:lreturn         
	}

	private static final byte c[] = com.google.ads.interactivemedia.v3.a.f.q.d("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
	private long A;
	private int B;
	private int C;
	private boolean D;
	private boolean E;
	private int F;
	private int G;
	private boolean H;
	private boolean I;
	private int J;
	private boolean K;
	private boolean L;
	private boolean M;
	private boolean N;
	public final com.google.ads.interactivemedia.v3.a.c a;
	protected final Handler b;
	private final l d;
	private final com.google.ads.interactivemedia.v3.a.b.b e;
	private final boolean f;
	private final s g;
	private final com.google.ads.interactivemedia.v3.a.q h;
	private final List i;
	private final android.media.MediaCodec.BufferInfo j;
	private final b k;
	private final boolean l;
	private com.google.ads.interactivemedia.v3.a.p m;
	private com.google.ads.interactivemedia.v3.a.b.a n;
	private MediaCodec o;
	private boolean p;
	private boolean q;
	private boolean r;
	private boolean s;
	private boolean t;
	private boolean u;
	private boolean v;
	private boolean w;
	private boolean x;
	private ByteBuffer y[];
	private ByteBuffer z[];

	static 
	{
	//    0    0:ldc1            #78  <String "0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78">
	//    1    2:invokestatic    #83  <Method byte[] q.d(String)>
	//    2    5:putstatic       #85  <Field byte[] c>
	//*   3    8:return          
	}
}
