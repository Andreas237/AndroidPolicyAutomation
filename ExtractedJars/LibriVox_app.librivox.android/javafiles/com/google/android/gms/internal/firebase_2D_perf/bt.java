// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) annotate safe 

package com.google.android.gms.internal.firebase-perf;

import java.util.List;

// Referenced classes of package com.google.android.gms.internal.firebase-perf:
//			ep, gg, fx, bw, 
//			bx, fb, dc, et, 
//			eq, bu, by, er, 
//			bv, cg, go

public final class bt extends ep
	implements gg
{

	private bt()
	{
	//    0    0:aload_0         
	//    1    1:invokespecial   #42  <Method void ep()>
		zzjg = fx.a();
	//    2    4:aload_0         
	//    3    5:invokestatic    #47  <Method fx fx.a()>
	//    4    8:putfield        #49  <Field fx zzjg>
		zzkt = "";
	//    5   11:aload_0         
	//    6   12:ldc1            #51  <String "">
	//    7   14:putfield        #53  <Field String zzkt>
		zzkz = "";
	//    8   17:aload_0         
	//    9   18:ldc1            #51  <String "">
	//   10   20:putfield        #55  <Field String zzkz>
		zzle = C();
	//   11   23:aload_0         
	//   12   24:invokestatic    #59  <Method fb C()>
	//   13   27:putfield        #61  <Field fb zzle>
	//   14   30:return          
	}

	private final void F()
	{
		zziq = zziq & 0xffffffbf;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int zziq>
	//    3    5:bipush          -65
	//    4    7:iand            
	//    5    8:putfield        #64  <Field int zziq>
		zzkz = zzlf.zzkz;
	//    6   11:aload_0         
	//    7   12:getstatic       #36  <Field bt zzlf>
	//    8   15:getfield        #55  <Field String zzkz>
	//    9   18:putfield        #55  <Field String zzkz>
	//   10   21:return          
	}

	private final void G()
	{
		zzle = C();
	//    0    0:aload_0         
	//    1    1:invokestatic    #59  <Method fb C()>
	//    2    4:putfield        #61  <Field fb zzle>
	//    3    7:return          
	}

	private final void a(int i1)
	{
		zziq = zziq | 0x20;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int zziq>
	//    3    5:bipush          32
	//    4    7:ior             
	//    5    8:putfield        #64  <Field int zziq>
		zzky = i1;
	//    6   11:aload_0         
	//    7   12:iload_1         
	//    8   13:putfield        #68  <Field int zzky>
	//    9   16:return          
	}

	private final void a(long l1)
	{
		zziq = zziq | 4;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int zziq>
	//    3    5:iconst_4        
	//    4    6:ior             
	//    5    7:putfield        #64  <Field int zziq>
		zzkv = l1;
	//    6   10:aload_0         
	//    7   11:lload_1         
	//    8   12:putfield        #71  <Field long zzkv>
	//    9   15:return          
	}

	static void a(bt bt1)
	{
		bt1.F();
	//    0    0:aload_0         
	//    1    1:invokespecial   #74  <Method void F()>
	//    2    4:return          
	}

	static void a(bt bt1, int i1)
	{
		bt1.a(i1);
	//    0    0:aload_0         
	//    1    1:iload_1         
	//    2    2:invokespecial   #77  <Method void a(int)>
	//    3    5:return          
	}

	static void a(bt bt1, long l1)
	{
		bt1.a(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #80  <Method void a(long)>
	//    3    5:return          
	}

	static void a(bt bt1, bw bw1)
	{
		bt1.a(bw1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #84  <Method void a(bw)>
	//    3    5:return          
	}

	static void a(bt bt1, bx bx1)
	{
		bt1.a(bx1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #88  <Method void a(bx)>
	//    3    5:return          
	}

	static void a(bt bt1, Iterable iterable)
	{
		bt1.a(iterable);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #92  <Method void a(Iterable)>
	//    3    5:return          
	}

	static void a(bt bt1, String s1)
	{
		bt1.a(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #96  <Method void a(String)>
	//    3    5:return          
	}

	private final void a(bw bw1)
	{
		if(bw1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          23
		{
			zziq = zziq | 2;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #64  <Field int zziq>
	//    5    9:iconst_2        
	//    6   10:ior             
	//    7   11:putfield        #64  <Field int zziq>
			zzku = bw1.a();
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:invokevirtual   #101 <Method int bw.a()>
	//   11   19:putfield        #103 <Field int zzku>
			return;
	//   12   22:return          
		} else
		{
			throw new NullPointerException();
	//   13   23:new             #105 <Class NullPointerException>
	//   14   26:dup             
	//   15   27:invokespecial   #106 <Method void NullPointerException()>
	//   16   30:athrow          
		}
	}

	private final void a(bx bx1)
	{
		if(bx1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          24
		{
			zziq = zziq | 0x10;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #64  <Field int zziq>
	//    5    9:bipush          16
	//    6   11:ior             
	//    7   12:putfield        #64  <Field int zziq>
			zzkx = bx1.a();
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:invokevirtual   #109 <Method int bx.a()>
	//   11   20:putfield        #111 <Field int zzkx>
			return;
	//   12   23:return          
		} else
		{
			throw new NullPointerException();
	//   13   24:new             #105 <Class NullPointerException>
	//   14   27:dup             
	//   15   28:invokespecial   #106 <Method void NullPointerException()>
	//   16   31:athrow          
		}
	}

	private final void a(Iterable iterable)
	{
		if(!zzle.a())
	//*   0    0:aload_0         
	//*   1    1:getfield        #61  <Field fb zzle>
	//*   2    4:invokeinterface #116 <Method boolean fb.a()>
	//*   3    9:ifne            49
		{
			fb fb1 = zzle;
	//    4   12:aload_0         
	//    5   13:getfield        #61  <Field fb zzle>
	//    6   16:astore_3        
			int i1 = fb1.size();
	//    7   17:aload_3         
	//    8   18:invokeinterface #119 <Method int fb.size()>
	//    9   23:istore_2        
			if(i1 == 0)
	//*  10   24:iload_2         
	//*  11   25:ifne            34
				i1 = 10;
	//   12   28:bipush          10
	//   13   30:istore_2        
			else
	//*  14   31:goto            38
				i1 <<= 1;
	//   15   34:iload_2         
	//   16   35:iconst_1        
	//   17   36:ishl            
	//   18   37:istore_2        
			zzle = fb1.d(i1);
	//   19   38:aload_0         
	//   20   39:aload_3         
	//   21   40:iload_2         
	//   22   41:invokeinterface #123 <Method fb fb.d(int)>
	//   23   46:putfield        #61  <Field fb zzle>
		}
		dc.a(iterable, ((List) (zzle)));
	//   24   49:aload_1         
	//   25   50:aload_0         
	//   26   51:getfield        #61  <Field fb zzle>
	//   27   54:invokestatic    #128 <Method void dc.a(Iterable, List)>
	//   28   57:return          
	}

	private final void a(String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          20
		{
			zziq = zziq | 1;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #64  <Field int zziq>
	//    5    9:iconst_1        
	//    6   10:ior             
	//    7   11:putfield        #64  <Field int zziq>
			zzkt = s1;
	//    8   14:aload_0         
	//    9   15:aload_1         
	//   10   16:putfield        #53  <Field String zzkt>
			return;
	//   11   19:return          
		} else
		{
			throw new NullPointerException();
	//   12   20:new             #105 <Class NullPointerException>
	//   13   23:dup             
	//   14   24:invokespecial   #106 <Method void NullPointerException()>
	//   15   27:athrow          
		}
	}

	private final void b(long l1)
	{
		zziq = zziq | 8;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int zziq>
	//    3    5:bipush          8
	//    4    7:ior             
	//    5    8:putfield        #64  <Field int zziq>
		zzkw = l1;
	//    6   11:aload_0         
	//    7   12:lload_1         
	//    8   13:putfield        #131 <Field long zzkw>
	//    9   16:return          
	}

	static void b(bt bt1)
	{
		bt1.G();
	//    0    0:aload_0         
	//    1    1:invokespecial   #133 <Method void G()>
	//    2    4:return          
	}

	static void b(bt bt1, long l1)
	{
		bt1.b(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #135 <Method void b(long)>
	//    3    5:return          
	}

	static void b(bt bt1, String s1)
	{
		bt1.b(s1);
	//    0    0:aload_0         
	//    1    1:aload_1         
	//    2    2:invokespecial   #137 <Method void b(String)>
	//    3    5:return          
	}

	private final void b(String s1)
	{
		if(s1 != null)
	//*   0    0:aload_1         
	//*   1    1:ifnull          21
		{
			zziq = zziq | 0x40;
	//    2    4:aload_0         
	//    3    5:aload_0         
	//    4    6:getfield        #64  <Field int zziq>
	//    5    9:bipush          64
	//    6   11:ior             
	//    7   12:putfield        #64  <Field int zziq>
			zzkz = s1;
	//    8   15:aload_0         
	//    9   16:aload_1         
	//   10   17:putfield        #55  <Field String zzkz>
			return;
	//   11   20:return          
		} else
		{
			throw new NullPointerException();
	//   12   21:new             #105 <Class NullPointerException>
	//   13   24:dup             
	//   14   25:invokespecial   #106 <Method void NullPointerException()>
	//   15   28:athrow          
		}
	}

	private final void c(long l1)
	{
		zziq = zziq | 0x80;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int zziq>
	//    3    5:sipush          128
	//    4    8:ior             
	//    5    9:putfield        #64  <Field int zziq>
		zzla = l1;
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:putfield        #140 <Field long zzla>
	//    9   17:return          
	}

	static void c(bt bt1, long l1)
	{
		bt1.c(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #142 <Method void c(long)>
	//    3    5:return          
	}

	private final void d(long l1)
	{
		zziq = zziq | 0x100;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int zziq>
	//    3    5:sipush          256
	//    4    8:ior             
	//    5    9:putfield        #64  <Field int zziq>
		zzlb = l1;
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:putfield        #144 <Field long zzlb>
	//    9   17:return          
	}

	static void d(bt bt1, long l1)
	{
		bt1.d(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #146 <Method void d(long)>
	//    3    5:return          
	}

	private final void e(long l1)
	{
		zziq = zziq | 0x200;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int zziq>
	//    3    5:sipush          512
	//    4    8:ior             
	//    5    9:putfield        #64  <Field int zziq>
		zzlc = l1;
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:putfield        #149 <Field long zzlc>
	//    9   17:return          
	}

	static void e(bt bt1, long l1)
	{
		bt1.e(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #151 <Method void e(long)>
	//    3    5:return          
	}

	private final void f(long l1)
	{
		zziq = zziq | 0x400;
	//    0    0:aload_0         
	//    1    1:aload_0         
	//    2    2:getfield        #64  <Field int zziq>
	//    3    5:sipush          1024
	//    4    8:ior             
	//    5    9:putfield        #64  <Field int zziq>
		zzld = l1;
	//    6   12:aload_0         
	//    7   13:lload_1         
	//    8   14:putfield        #154 <Field long zzld>
	//    9   17:return          
	}

	static void f(bt bt1, long l1)
	{
		bt1.f(l1);
	//    0    0:aload_0         
	//    1    1:lload_1         
	//    2    2:invokespecial   #156 <Method void f(long)>
	//    3    5:return          
	}

	public static bu s()
	{
		return (bu)(eq)((ep) (zzlf)).a(et.e, ((Object) (null)), ((Object) (null)));
	//    0    0:getstatic       #36  <Field bt zzlf>
	//    1    3:getstatic       #162 <Field int et.e>
	//    2    6:aconst_null     
	//    3    7:aconst_null     
	//    4    8:invokevirtual   #165 <Method Object ep.a(int, Object, Object)>
	//    5   11:checkcast       #167 <Class eq>
	//    6   14:checkcast       #169 <Class bu>
	//    7   17:areturn         
	}

	public static bt t()
	{
		return zzlf;
	//    0    0:getstatic       #36  <Field bt zzlf>
	//    1    3:areturn         
	}

	static bt u()
	{
		return zzlf;
	//    0    0:getstatic       #36  <Field bt zzlf>
	//    1    3:areturn         
	}

	protected final Object a(int i1, Object obj, Object obj1)
	{
		by.a[i1 - 1];
	//    0    0:getstatic       #177 <Field int[] by.a>
	//    1    3:iload_1         
	//    2    4:iconst_1        
	//    3    5:isub            
	//    4    6:iaload          
		JVM INSTR tableswitch 1 7: default 48
	//	               1 252
	//	               2 243
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56;
	//    5    7:tableswitch     1 7: default 48
	//	               1 252
	//	               2 243
	//	               3 116
	//	               4 112
	//	               5 63
	//	               6 58
	//	               7 56
		   goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L1:
		throw new UnsupportedOperationException();
	//    6   48:new             #179 <Class UnsupportedOperationException>
	//    7   51:dup             
	//    8   52:invokespecial   #180 <Method void UnsupportedOperationException()>
	//    9   55:athrow          
_L8:
		return ((Object) (null));
	//   10   56:aconst_null     
	//   11   57:areturn         
_L7:
		return ((Object) (Byte.valueOf((byte)1)));
	//   12   58:iconst_1        
	//   13   59:invokestatic    #186 <Method Byte Byte.valueOf(byte)>
	//   14   62:areturn         
_L6:
		obj = ((Object) (zziv));
	//   15   63:getstatic       #188 <Field go zziv>
	//   16   66:astore_2        
		if(obj != null) goto _L10; else goto _L9
	//   17   67:aload_2         
	//   18   68:ifnonnull       110
_L9:
		com/google/android/gms/internal/firebase-perf/bt;
	//   19   71:ldc1            #2   <Class bt>
		JVM INSTR monitorenter ;
	//   20   73:monitorenter    
		obj1 = ((Object) (zziv));
	//   21   74:getstatic       #188 <Field go zziv>
	//   22   77:astore_3        
		obj = obj1;
	//   23   78:aload_3         
	//   24   79:astore_2        
		if(obj1 != null) goto _L12; else goto _L11
	//   25   80:aload_3         
	//   26   81:ifnonnull       99
_L11:
		obj = ((Object) (new er(((ep) (zzlf)))));
	//   27   84:new             #190 <Class er>
	//   28   87:dup             
	//   29   88:getstatic       #36  <Field bt zzlf>
	//   30   91:invokespecial   #193 <Method void er(ep)>
	//   31   94:astore_2        
		zziv = ((go) (obj));
	//   32   95:aload_2         
	//   33   96:putstatic       #188 <Field go zziv>
_L12:
		com/google/android/gms/internal/firebase-perf/bt;
	//   34   99:ldc1            #2   <Class bt>
		JVM INSTR monitorexit ;
	//   35  101:monitorexit     
		return obj;
	//   36  102:aload_2         
	//   37  103:areturn         
		obj;
	//   38  104:astore_2        
		com/google/android/gms/internal/firebase-perf/bt;
	//   39  105:ldc1            #2   <Class bt>
		JVM INSTR monitorexit ;
	//   40  107:monitorexit     
		throw obj;
	//   41  108:aload_2         
	//   42  109:athrow          
_L10:
		return obj;
	//   43  110:aload_2         
	//   44  111:areturn         
_L5:
		return ((Object) (zzlf));
	//   45  112:getstatic       #36  <Field bt zzlf>
	//   46  115:areturn         
_L4:
		obj = ((Object) (bw.b()));
	//   47  116:invokestatic    #196 <Method ey bw.b()>
	//   48  119:astore_2        
		obj1 = ((Object) (bx.b()));
	//   49  120:invokestatic    #197 <Method ey bx.b()>
	//   50  123:astore_3        
		fv fv = bv.a;
	//   51  124:getstatic       #202 <Field fv bv.a>
	//   52  127:astore          4
		return a(((gd) (zzlf)), "\001\r\000\001\001\r\r\001\001\000\001\b\000\002\f\001\003\002\002\004\002\003\005\004\005\006\b\006\007\002\007\b\002\b\t\002\t\n\002\n\013\f\004\f2\r\033", new Object[] {
			"zziq", "zzkt", "zzku", obj, "zzkv", "zzkw", "zzky", "zzkz", "zzla", "zzlb", 
			"zzlc", "zzld", "zzkx", obj1, "zzjg", fv, "zzle", com/google/android/gms/internal/firebase-perf/cg
		});
	//   53  129:getstatic       #36  <Field bt zzlf>
	//   54  132:ldc1            #204 <String "\001\r\000\001\001\r\r\001\001\000\001\b\000\002\f\001\003\002\002\004\002\003\005\004\005\006\b\006\007\002\007\b\002\b\t\002\t\n\002\n\013\f\004\f2\r\033">
	//   55  134:bipush          18
	//   56  136:anewarray       Object[]
	//   57  139:dup             
	//   58  140:iconst_0        
	//   59  141:ldc1            #207 <String "zziq">
	//   60  143:aastore         
	//   61  144:dup             
	//   62  145:iconst_1        
	//   63  146:ldc1            #208 <String "zzkt">
	//   64  148:aastore         
	//   65  149:dup             
	//   66  150:iconst_2        
	//   67  151:ldc1            #209 <String "zzku">
	//   68  153:aastore         
	//   69  154:dup             
	//   70  155:iconst_3        
	//   71  156:aload_2         
	//   72  157:aastore         
	//   73  158:dup             
	//   74  159:iconst_4        
	//   75  160:ldc1            #210 <String "zzkv">
	//   76  162:aastore         
	//   77  163:dup             
	//   78  164:iconst_5        
	//   79  165:ldc1            #211 <String "zzkw">
	//   80  167:aastore         
	//   81  168:dup             
	//   82  169:bipush          6
	//   83  171:ldc1            #212 <String "zzky">
	//   84  173:aastore         
	//   85  174:dup             
	//   86  175:bipush          7
	//   87  177:ldc1            #213 <String "zzkz">
	//   88  179:aastore         
	//   89  180:dup             
	//   90  181:bipush          8
	//   91  183:ldc1            #214 <String "zzla">
	//   92  185:aastore         
	//   93  186:dup             
	//   94  187:bipush          9
	//   95  189:ldc1            #215 <String "zzlb">
	//   96  191:aastore         
	//   97  192:dup             
	//   98  193:bipush          10
	//   99  195:ldc1            #216 <String "zzlc">
	//  100  197:aastore         
	//  101  198:dup             
	//  102  199:bipush          11
	//  103  201:ldc1            #217 <String "zzld">
	//  104  203:aastore         
	//  105  204:dup             
	//  106  205:bipush          12
	//  107  207:ldc1            #218 <String "zzkx">
	//  108  209:aastore         
	//  109  210:dup             
	//  110  211:bipush          13
	//  111  213:aload_3         
	//  112  214:aastore         
	//  113  215:dup             
	//  114  216:bipush          14
	//  115  218:ldc1            #219 <String "zzjg">
	//  116  220:aastore         
	//  117  221:dup             
	//  118  222:bipush          15
	//  119  224:aload           4
	//  120  226:aastore         
	//  121  227:dup             
	//  122  228:bipush          16
	//  123  230:ldc1            #220 <String "zzle">
	//  124  232:aastore         
	//  125  233:dup             
	//  126  234:bipush          17
	//  127  236:ldc1            #222 <Class cg>
	//  128  238:aastore         
	//  129  239:invokestatic    #225 <Method Object a(gd, String, Object[])>
	//  130  242:areturn         
_L3:
		return ((Object) (new bu(((by) (null)))));
	//  131  243:new             #169 <Class bu>
	//  132  246:dup             
	//  133  247:aconst_null     
	//  134  248:invokespecial   #228 <Method void bu(by)>
	//  135  251:areturn         
_L2:
		return ((Object) (new bt()));
	//  136  252:new             #2   <Class bt>
	//  137  255:dup             
	//  138  256:invokespecial   #34  <Method void bt()>
	//  139  259:areturn         
	}

	public final String a()
	{
		return zzkt;
	//    0    0:aload_0         
	//    1    1:getfield        #53  <Field String zzkt>
	//    2    4:areturn         
	}

	public final boolean b()
	{
		return (zziq & 2) == 2;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int zziq>
	//    2    4:iconst_2        
	//    3    5:iand            
	//    4    6:iconst_2        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final bw c()
	{
		bw bw2 = bw.a(zzku);
	//    0    0:aload_0         
	//    1    1:getfield        #103 <Field int zzku>
	//    2    4:invokestatic    #233 <Method bw bw.a(int)>
	//    3    7:astore_2        
		bw bw1 = bw2;
	//    4    8:aload_2         
	//    5    9:astore_1        
		if(bw2 == null)
	//*   6   10:aload_2         
	//*   7   11:ifnonnull       18
			bw1 = bw.a;
	//    8   14:getstatic       #236 <Field bw bw.a>
	//    9   17:astore_1        
		return bw1;
	//   10   18:aload_1         
	//   11   19:areturn         
	}

	public final boolean d()
	{
		return (zziq & 4) == 4;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int zziq>
	//    2    4:iconst_4        
	//    3    5:iand            
	//    4    6:iconst_4        
	//    5    7:icmpne          12
	//    6   10:iconst_1        
	//    7   11:ireturn         
	//    8   12:iconst_0        
	//    9   13:ireturn         
	}

	public final long e()
	{
		return zzkv;
	//    0    0:aload_0         
	//    1    1:getfield        #71  <Field long zzkv>
	//    2    4:lreturn         
	}

	public final boolean f()
	{
		return (zziq & 8) == 8;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int zziq>
	//    2    4:bipush          8
	//    3    6:iand            
	//    4    7:bipush          8
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final long g()
	{
		return zzkw;
	//    0    0:aload_0         
	//    1    1:getfield        #131 <Field long zzkw>
	//    2    4:lreturn         
	}

	public final boolean h()
	{
		return (zziq & 0x20) == 32;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int zziq>
	//    2    4:bipush          32
	//    3    6:iand            
	//    4    7:bipush          32
	//    5    9:icmpne          14
	//    6   12:iconst_1        
	//    7   13:ireturn         
	//    8   14:iconst_0        
	//    9   15:ireturn         
	}

	public final int i()
	{
		return zzky;
	//    0    0:aload_0         
	//    1    1:getfield        #68  <Field int zzky>
	//    2    4:ireturn         
	}

	public final boolean j()
	{
		return (zziq & 0x80) == 128;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int zziq>
	//    2    4:sipush          128
	//    3    7:iand            
	//    4    8:sipush          128
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final long k()
	{
		return zzla;
	//    0    0:aload_0         
	//    1    1:getfield        #140 <Field long zzla>
	//    2    4:lreturn         
	}

	public final boolean l()
	{
		return (zziq & 0x100) == 256;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int zziq>
	//    2    4:sipush          256
	//    3    7:iand            
	//    4    8:sipush          256
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final long m()
	{
		return zzlb;
	//    0    0:aload_0         
	//    1    1:getfield        #144 <Field long zzlb>
	//    2    4:lreturn         
	}

	public final boolean n()
	{
		return (zziq & 0x200) == 512;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int zziq>
	//    2    4:sipush          512
	//    3    7:iand            
	//    4    8:sipush          512
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final long o()
	{
		return zzlc;
	//    0    0:aload_0         
	//    1    1:getfield        #149 <Field long zzlc>
	//    2    4:lreturn         
	}

	public final boolean p()
	{
		return (zziq & 0x400) == 1024;
	//    0    0:aload_0         
	//    1    1:getfield        #64  <Field int zziq>
	//    2    4:sipush          1024
	//    3    7:iand            
	//    4    8:sipush          1024
	//    5   11:icmpne          16
	//    6   14:iconst_1        
	//    7   15:ireturn         
	//    8   16:iconst_0        
	//    9   17:ireturn         
	}

	public final long q()
	{
		return zzld;
	//    0    0:aload_0         
	//    1    1:getfield        #154 <Field long zzld>
	//    2    4:lreturn         
	}

	public final List r()
	{
		return ((List) (zzle));
	//    0    0:aload_0         
	//    1    1:getfield        #61  <Field fb zzle>
	//    2    4:areturn         
	}

	private static volatile go zziv;
	private static final bt zzlf;
	private int zziq;
	private fx zzjg;
	private String zzkt;
	private int zzku;
	private long zzkv;
	private long zzkw;
	private int zzkx;
	private int zzky;
	private String zzkz;
	private long zzla;
	private long zzlb;
	private long zzlc;
	private long zzld;
	private fb zzle;

	static 
	{
		zzlf = new bt();
	//    0    0:new             #2   <Class bt>
	//    1    3:dup             
	//    2    4:invokespecial   #34  <Method void bt()>
	//    3    7:putstatic       #36  <Field bt zzlf>
		ep.a(com/google/android/gms/internal/firebase-perf/bt, ((ep) (zzlf)));
	//    4   10:ldc1            #2   <Class bt>
	//    5   12:getstatic       #36  <Field bt zzlf>
	//    6   15:invokestatic    #40  <Method void ep.a(Class, ep)>
	//*   7   18:return          
	}
}
